/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.idea.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.impl.VirtualDirectoryImpl;
import com.intellij.ui.components.JBTabbedPane;
import org.jetbrains.annotations.Nullable;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.ProjectUtil;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.ui.MOECopyBundlePanel;
import org.moe.idea.ui.MOEFrameworkDependencyPanel;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.ui.MOEUniversalLibraryPanel;
import org.moe.idea.utils.ModuleUtils;
import org.moe.tools.natjgen.binding.IConsole;
import org.moe.tools.natjgen.binding.IMonitor;
import org.moe.tools.natjgen.binding.MOEWrapNatjgenLibGenerator;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

public class MOELinkThirdpartyLibraries extends AnAction {
    private Module module;
    private ProgressIndicator progressIndicator;

    @Override
    public void update(AnActionEvent e) {
        Presentation presentation = e.getPresentation();

        if (OsUtils.isWindows()) {
            presentation.setEnabled(false);
            presentation.setVisible(false);

            return;
        }

        VirtualFile file = CommonDataKeys.VIRTUAL_FILE.getData(e.getDataContext());

        if (file == null) {
            presentation.setEnabled(false);
            presentation.setVisible(false);

            return;
        }

        DataContext dataContext = e.getDataContext();
        module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());

        boolean enabled = false;

        if (module != null && MOESdkPlugin.isValidMoeModule(module)) {
            enabled = true;
        }

        presentation.setEnabled(enabled);
        presentation.setVisible(enabled);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        progressIndicator = ProgressManager.getInstance().getProgressIndicator();
        if (progressIndicator == null) {
            progressIndicator = new EmptyProgressIndicator();
        }

        LibraryChooseDialog dialog = new LibraryChooseDialog(e.getProject());
        dialog.show();
    }

    class LibraryChooseDialog extends DialogWrapper {
        private JTabbedPane myPanel;

        private MOEUniversalLibraryPanel universalPanel;
        private MOEFrameworkDependencyPanel dependencyPanel;
        private MOECopyBundlePanel copyBundlePanel;

        protected LibraryChooseDialog(@Nullable Project project) {
            super(project);

            init();
        }

        @Nullable
        @Override
        protected JComponent createCenterPanel() {
            myPanel = new JBTabbedPane();

            universalPanel = new MOEUniversalLibraryPanel(true, module, null);
            universalPanel.init();
            myPanel.addTab("Library", universalPanel);

            //create and add sim/dev tab
            dependencyPanel = new MOEFrameworkDependencyPanel(false, module, null);
            dependencyPanel.init();
            universalPanel.setDependencyTabListener(dependencyPanel.getListener());
            myPanel.addTab("Dependency", dependencyPanel);

            copyBundlePanel = new MOECopyBundlePanel(true, module, null);
            copyBundlePanel.init();
            myPanel.addTab("Copy bundle resources", copyBundlePanel);


            return myPanel;
        }

        @Override
        protected void doOKAction() {
            JarOutputStream target = null;
            FileOutputStream jarFos = null;

            try {
                List<VirtualFile> files = universalPanel.getVirtualFiles();
                VirtualFile libFile = null;
                VirtualDirectoryImpl headersDirectory = null;
                for (VirtualFile file : files) {
                    if (file instanceof VirtualDirectoryImpl) {
                        headersDirectory = (VirtualDirectoryImpl) file;
                    } else {
                        libFile = file;
                    }
                }

                if (libFile != null && headersDirectory != null) {

                    progressIndicator.start();
                    progressIndicator.popState();
                    progressIndicator.setText("Prepare all necessary parameters...");

                    //prepare --library
                    String libraryParam = libFile.getPath();

                    //prepare --headers
                    String headersParam = headersDirectory.getPath();

                    //prepare --ld-flags
                    Map<String, String> flags = dependencyPanel.getManifestProperties();
                    StringBuilder ldFlagsContent = new StringBuilder();
                    File ldFlagsFile = null;
                    if(flags != null && flags.size() > 0){

                        for(String key : flags.keySet()){
                            ldFlagsContent.append(flags.get(key));
                        }
                    }
                    String libName = libFile.getNameWithoutExtension();
                    ldFlagsContent.append("-l").append(libName.startsWith("lib") ? libName.substring(3) : libName).append(";");

                    File tmDir = createTempDirectory();
                    ldFlagsFile = new File(tmDir, "ldFlags");

                    PrintWriter ldFlagsWriter = null;
                    try{
                        ldFlagsWriter = new PrintWriter(ldFlagsFile);
                        ldFlagsWriter.print(ldFlagsContent.toString());
                    }
                    finally {
                        if(ldFlagsWriter != null){
                            ldFlagsWriter.close();
                        }
                    }

                    //prepare --bundle
                    Map<String, String> props = copyBundlePanel.getManifestProperties();
                    StringBuilder bundleContent = null;
                    if(props != null && props.size() > 0){
                        bundleContent = new StringBuilder();
                        for(String key : props.keySet()){
                            bundleContent.append(props.get(key)).append(";");
                        }
                    }

                    //prepare --output-file-path
                    File libFolder = createOrUpdateLibs();
                    File outFile = new File(libFolder, libFile.getNameWithoutExtension() + ".jar");

                    MOEWrapNatjgenLibGenerator generator = new MOEWrapNatjgenLibGenerator(libraryParam,
                            headersParam,
                            ldFlagsFile == null ? null : ldFlagsFile.getPath(),
                            bundleContent == null ? null : bundleContent.toString(),
                            outFile.getPath(),
                            new File(ModuleUtils.getModulePath(module)),
                            new IConsole() {
                                @Override
                                public void write(String s) {
                                    MOEToolWindow.getInstance(module.getProject()).log(s);
                                }
                            },
                            new IMonitor() {
                                @Override
                                public void setText(String s) {
                                    progressIndicator.setText(s);
                                }

                                @Override
                                public boolean isCanceled() {
                                    return false;
                                }
                            });

                    progressIndicator.setText("Generate...");
                    File sdkToolsDir = new File(ProjectUtil.retrieveSDKPathFromGradle(new File(ModuleUtils.getModulePath(module))), "tools");
                    generator.generate(sdkToolsDir, "--library");
                    
                    progressIndicator.stop();

                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (target != null) {
                    try {
                        target.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
                if (jarFos != null) {
                    try {
                        jarFos.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }

            super.doOKAction();
        }

        private List<String> collectAllHeaders(VirtualDirectoryImpl headersFolder) {
            List<String> result = new ArrayList<String>();

            VirtualFile[] children = headersFolder.getChildren();

            for (VirtualFile child : children) {
                if (child instanceof VirtualDirectoryImpl) {
                    result.addAll(collectAllHeaders((VirtualDirectoryImpl) child));
                } else {
                    result.add(child.getPath());
                }
            }

            return result;
        }

        public File createTempDirectory() throws IOException {
            final File temp;

            temp = File.createTempFile("temp", Long.toString(System.nanoTime()));

            if (!(temp.delete())) {
                throw new IOException("Could not delete temp file: " + temp.getAbsolutePath());
            }

            if (!(temp.mkdir())) {
                throw new IOException("Could not create temp directory: " + temp.getAbsolutePath());
            }

            return (temp);
        }

        private void addFileToJar(File baseDir, File source, JarOutputStream target) throws IOException {
            BufferedInputStream in = null;
            try {
                String baseName = baseDir.getPath().replace("\\", "/");
                baseName = baseName.endsWith("/") ? baseName : baseName + "/";
                String name = source.getPath().replace("\\", "/").replace(baseName, "");
                if (source.isDirectory()) {

                    if (!name.isEmpty()) {
                        if (!name.endsWith("/"))
                            name += "/";
                        JarEntry entry = new JarEntry(name);
                        entry.setTime(source.lastModified());
                        target.putNextEntry(entry);
                        target.closeEntry();
                    }
                    File[] listFiles = source.listFiles();
                    if (listFiles != null) {
                        for (File nestedFile : listFiles) {
                            addFileToJar(baseDir, nestedFile, target);
                        }
                    }
                    return;
                }

                JarEntry entry = new JarEntry(name);
                entry.setTime(source.lastModified());
                target.putNextEntry(entry);
                in = new BufferedInputStream(new FileInputStream(source));

                byte[] buffer = new byte[1024];
                while (true) {
                    int count = in.read(buffer);
                    if (count == -1)
                        break;
                    target.write(buffer, 0, count);
                }
                target.closeEntry();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (Exception e) {}
                }
            }
        }

        private String createCompileFileList(File baseDir) throws IOException {
            List<String> fileList = findAllFiles(new File(baseDir, "com"));

            File sources = new File(baseDir, "sources.txt");
            if (!sources.exists()) {
                sources.createNewFile();
            }

            PrintWriter out = new PrintWriter(sources);
            for (String file : fileList) {
                out.println(file);
            }
            out.close();

            return sources.getPath();
        }

        private List<String> findAllFiles(File baseDir) {
            List<String> result = new ArrayList<String>();

            File[] listFiles = baseDir.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        result.addAll(findAllFiles(file));
                    } else {
                        result.add(file.getPath());
                    }
                }
            }

            return result;
        }

        private File createOrUpdateLibs() {
            File libFolder = null;
            String modulePath = ModuleUtils.getModulePath(module);
            if ((modulePath != null) && !modulePath.isEmpty()) {
                libFolder = new File(modulePath, "lib");
                if (!libFolder.exists()) {
                    libFolder.mkdirs();
                }
            }
            return libFolder;
        }

    }
}
