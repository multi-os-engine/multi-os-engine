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

import org.moe.common.utils.OsUtils;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.binding.MOEWrapNatjgenLibGenerator;
import org.moe.idea.ui.MOECopyBundlePanel;
import org.moe.idea.ui.MOEFrameworkDependencyPanel;
import org.moe.idea.ui.MOEUniversalFrameworkPanel;
import org.moe.idea.utils.ModuleUtils;
import com.intellij.ide.IdeView;
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
import com.intellij.ui.components.JBTabbedPane;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.jar.JarOutputStream;

public class MOELinkThirdpartyFramework extends AnAction {

    List<VirtualFile> virtualFiles = new ArrayList<VirtualFile>();
    private ProgressIndicator progressIndicator;
    private Module module;

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

        Project project = e.getProject();

        if (project == null) {
            return;
        }

        module = null;
        for (Module module : ModuleManager.getInstance(project).getModules()) {
            if (ModuleRootManager.getInstance(module).getFileIndex().isInContent(file)) {
                if (MOESdkPlugin.isValidMoeModule(module)) {
                    this.module = module;
                    break;
                }
            }
        }

        if (module == null) {
            presentation.setEnabled(false);
            presentation.setVisible(false);
        } else {
            presentation.setEnabled(true);
            presentation.setVisible(true);
        }
    }


    @Override
    public void actionPerformed(AnActionEvent e) {
        module = LangDataKeys.MODULE.getData(e.getDataContext());
        final IdeView view = LangDataKeys.IDE_VIEW.getData(e.getDataContext());
        if (view != null) {
            progressIndicator = ProgressManager.getInstance().getProgressIndicator();
            if (progressIndicator == null) {
                progressIndicator = new EmptyProgressIndicator();
            }

            FrameworkChooseDialog dialog = new FrameworkChooseDialog(e.getProject());
            dialog.show();
        }

    }

    public class FrameworkChooseDialog extends DialogWrapper {
        List<JCheckBox> checkBoxList;
        List<String> selectedFrameworks;
        private JTabbedPane myPanel;
        private MOEUniversalFrameworkPanel universalPanel;
        private MOEFrameworkDependencyPanel dependencyPanel;
        private MOECopyBundlePanel copyBundlePanel;

        protected FrameworkChooseDialog(@Nullable Project project) {
            super(project);

            setTitle("Link third party framework to Xcode");

            selectedFrameworks = new ArrayList<String>();
            checkBoxList = new ArrayList<JCheckBox>();

            myPanel = new JBTabbedPane();

            SelectorDelegate delegate = new SelectorDelegate();

            universalPanel = new MOEUniversalFrameworkPanel(true, module, delegate);

            universalPanel.init();
            myPanel.addTab("Framework", universalPanel);

            //create and add sim/dev tab
            dependencyPanel = new MOEFrameworkDependencyPanel(false, module, delegate);
            dependencyPanel.init();

            universalPanel.setDependencyTabListener(dependencyPanel.getListener());
            myPanel.addTab("Dependency", dependencyPanel);

            copyBundlePanel = new MOECopyBundlePanel(true, module, delegate);
            copyBundlePanel.init();
            myPanel.addTab("Copy bundle resources", copyBundlePanel);


            init();
        }

        @Nullable
        @Override
        protected JComponent createCenterPanel() {
            return myPanel;
        }

        @Override
        protected void doOKAction() {
            JarOutputStream target = null;
            FileOutputStream jarFos = null;

            try {
                progressIndicator.start();
                progressIndicator.popState();
                progressIndicator.setText("Start generation binding process...");

                if (universalPanel != null) {
                    virtualFiles = universalPanel.getVirtualFiles();
                    if (virtualFiles != null && virtualFiles.size() > 0) {

                        //prepare --framework
                        StringBuilder frameworkContent = new StringBuilder();
                        for (VirtualFile file : virtualFiles) {
                            frameworkContent.append(file.getPath()).append(":");
                        }
                        if (frameworkContent.length() > 0) {
                            frameworkContent.deleteCharAt(frameworkContent.length() - 1);
                        }

                        //prepare --ld-flags
                        Map<String, String> flags = dependencyPanel.getManifestProperties();
                        StringBuilder ldFlagsContent = new StringBuilder();
                        File ldFlagsFile = null;
                        if(flags != null && flags.size() > 0){

                            for(String key : flags.keySet()){
                                ldFlagsContent.append(flags.get(key));
                            }

                        }
                        for(VirtualFile file : virtualFiles){
                            ldFlagsContent.append("-framework ").append(file.getNameWithoutExtension()).append(";");
                        }

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
                                bundleContent.append(props.get(key));
                            }
                        }

                        //prepare --output-file-path
                        File libFolder = createOrUpdateLibs();
                        File outFile = new File(libFolder, virtualFiles.get(0).getNameWithoutExtension() + ".jar");

                        MOEWrapNatjgenLibGenerator generator = new MOEWrapNatjgenLibGenerator(frameworkContent.toString(),
                                                                          null,
                                                                          ldFlagsFile == null ? null : ldFlagsFile.getPath(),
                                                                          bundleContent == null ? null : bundleContent.toString(),
                                                                          outFile.getPath(),
                                                                          module,
                                                                          progressIndicator);
                        generator.generate("--framework");
                    }
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

            progressIndicator.stop();
            super.doOKAction();
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

        public class SelectorDelegate {
            List<JCheckBox> checkBoxList;

            public SelectorDelegate() {
                checkBoxList = new ArrayList<JCheckBox>();
            }

            public void addCheckbox(JCheckBox checkBox) {
                checkBoxList.add(checkBox);
            }

            public void processCheckBox(JCheckBox source) {
                for (JCheckBox checkBox : checkBoxList) {
                    if (!checkBox.equals(source) && source.isSelected()) {
                        checkBox.setSelected(false);
                    }
                }
            }
        }


    }

}
