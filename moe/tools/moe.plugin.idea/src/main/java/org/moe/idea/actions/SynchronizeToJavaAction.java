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
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.impl.VirtualDirectoryImpl;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.ProjectUtil;
import org.moe.document.pbxproj.*;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.xib.XIB;
import org.moe.document.xib.XIBParser;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.binding.MOEBindingGeneratorByJava;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.tools.natjgen.WrapNatJGenExec;
import org.moe.tools.natjgen.binding.IConsole;
import org.moe.tools.natjgen.binding.IMonitor;
import org.moe.tools.natjgen.binding.MOEBindingGenerator;
import org.moe.tools.natjgen.binding.MOEBindingGeneratorByXcode;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SynchronizeToJavaAction extends AnAction {

    public static final String ACTION_TITLE = "Synchronize to Java";

    private static final Logger LOG = LoggerFactory.getLogger(SynchronizeToJavaAction.class);

    @Contract("null -> false")
    private boolean isXcodeFolder(@Nullable VirtualFile[] files) {
        boolean result = false;
        if(files.length == 1 && files[0] instanceof VirtualDirectoryImpl) {
            result = files[0].getName().equals("xcode");
        }
        return result;
    }

    @Contract("null -> false")
    private boolean isHeaderFile(@Nullable VirtualFile[] files, Module module) {
        boolean result = true;
        for (VirtualFile file : files) {
            result &= file.exists() && file.getName().endsWith(".h") && isInXcode(file, module);
        }
        return result;
    }

    private boolean isInXcode(VirtualFile file, Module module) {
        VirtualFile parent = file.getParent();
        while (parent != null) {
            if(parent.getName().equals("xcode")) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    @Override
    public void update(AnActionEvent e) {
        VirtualFile[] files = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(e.getDataContext());
        Module module = (Module) e.getDataContext().getData(LangDataKeys.MODULE.getName());
        boolean isActionEnabled = isHeaderFile(files, module) || isXcodeFolder(files);
        if(OsUtils.isWindows()) {
            isActionEnabled = false;
        }
        e.getPresentation().setEnabled(isActionEnabled);
        e.getPresentation().setVisible(isActionEnabled);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        String currentFile = DataKeys.VIRTUAL_FILE.getData(e.getDataContext()).getCanonicalPath();
        Module moduleTmp = null;
        for (Project project : ProjectManager.getInstance().getOpenProjects()) {
            for (Module current : ModuleManager.getInstance(project).getModules()) {
                if (MOESdkPlugin.isValidMoeModule(current)
                        && currentFile.startsWith(ModuleUtils.getModulePath(current))) {
                    moduleTmp = current;
                    break;
                }
            }
            if (moduleTmp != null) {
                break;
            }
        }
        if (moduleTmp == null) {
            return;
        }
        final Module module = moduleTmp;
        final VirtualFile[] files = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(e.getDataContext());
        ChoosePackageDialog dialog = new ChoosePackageDialog(module, files);
        dialog.show();
    }

    private List<File> getStoryboardFiles(File xcodeProjectFile) {
        List<File> result = new ArrayList<File>();
        try {
            ProjFile xcodeProject = new ProjFile(xcodeProjectFile);
            ArrayList<Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject>> fields = xcodeProject.getRoot()
                    .getObjects().rawData();
            for (Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject> field : fields) {
                if (field.value instanceof PBXFileReference) {
                    PBXFileReference pbxFileRef = (PBXFileReference)field.value;
                    String filePath = pbxFileRef.getPath();
                    if (filePath.endsWith(".xib") || filePath.endsWith(".storyboard")) {
                        String groupPath = getGroupPathForReference(xcodeProject, field.key.value);
                        File headerFile = new File(xcodeProjectFile.getParentFile(),
                                groupPath + File.separator + filePath);
                        if (headerFile.exists()) {
                            result.add(headerFile);
                        }
                    }
                }
            }
        } catch (Exception e) {
            LOG.error("Unable to get storyboard or xib file", e);
        }
        return result;
    }

    private File getFilesByProject(File xcodeProjectFile, Module module, String interfaceName) {
        try {
            ProjFile xcodeProject = new ProjFile(xcodeProjectFile);
            List<PBXObjectRef<PBXFileReference>> fileRef = xcodeProject.getRoot().getFileReferences();
            for (PBXObjectRef<PBXFileReference> pbxFileRef : fileRef) {
                String filePath = pbxFileRef.getReferenced().getPath();
                String groupPath = getGroupPathForReference(xcodeProject, pbxFileRef.value);
                groupPath = (groupPath == null) ? "" : groupPath.replace("\"", "").trim();
                String projectName = xcodeProjectFile.getName();
                projectName = projectName.substring(0, projectName.indexOf("."));
                File headerFile = new File(xcodeProjectFile.getParentFile() + File.separator + projectName,
                        groupPath + File.separator + filePath);
                VirtualFile sourceVFile = VfsUtil.findFileByIoFile(headerFile, true);
                if(sourceVFile != null) {
                    PsiManager psiManager = PsiManager.getInstance(module.getProject());
                    PsiFile xcodeFile = psiManager.findFile(sourceVFile);
                    if(xcodeFile != null) {
                        String source = xcodeFile.getText();
                        String interfaceTemplate = String.format("@interface\\s+%1$s", interfaceName);
                        Pattern interfacePattern = Pattern.compile(interfaceTemplate);
                        Matcher interfaceMatcher = interfacePattern.matcher(source);
                        if(interfaceMatcher.find()) {
                            return headerFile;
                        }
                    }
                }
            }
        } catch (Exception e) {
            LOG.error("Unable to get file", e);
        }
        return null;
    }

    private String getGroupPathForReference(ProjFile project, String reference) {
        List<PBXGroup> groups = project.getRoot().getGroups();
        for (PBXGroup group : groups) {
            for (PBXObjectRef<? extends PBXObject> groupChild : group.getChildren()) {
                if (groupChild.value.equals(reference)) {
                    return group.getPath() == null ? "" : group.getPath();
                }
            }
        }
        return null;
    }

    private class ChoosePackageDialog extends DialogWrapper {

        private Module module;
        private VirtualFile[] files;
        private JPanel myPanel;
        private JTextField packageName;

        public ChoosePackageDialog(Module module, VirtualFile[] files) {
            super(module.getProject());
            this.module = module;
            this.files = files;
            myPanel = new JPanel();
            packageName = new JTextField(20);
            init();
        }

        @Nullable
        @Override
        protected JComponent createCenterPanel() {
            myPanel.setLayout(new BorderLayout());
            myPanel.add(new JLabel("package: "), BorderLayout.WEST);
            myPanel.add(packageName, BorderLayout.CENTER);
            return myPanel;
        }

        private ProgressIndicator progressIndicator;

        @Override
        protected void doOKAction() {
            ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
                @Override
                public void run() {
                    try {
                        progressIndicator = ProgressManager.getInstance().getProgressIndicator();
                        if (progressIndicator == null) {
                            progressIndicator = new EmptyProgressIndicator();
                            progressIndicator.start();
                            progressIndicator.popState();
                        }
                        List<VirtualFile> bindingList;
                        if (files.length == 1 && files[0] instanceof VirtualDirectoryImpl
                                && files[0].getName().equals("xcode")) {
                            File xcodeProject = new File(ProjectUtil.retrieveXcodeProjectPathFromGradle(
                                    new File(ModuleUtils.getModulePath(module))));
                            if ((xcodeProject == null) || !xcodeProject.exists()) {
                                LOG.debug("Xcode project is not exist, drop action");
                                Messages.showErrorDialog("Xcode project not exist", "Open Xcode Project");
                                return;
                            }
                            List<File> xibs = getStoryboardFiles(xcodeProject);
                            // Collect referenced files
                            LOG.debug("Collecting referenced classes");
                            progressIndicator.setText("Preparing... (Collecting Referenced Classes)");
                            progressIndicator.setText2("");
                            HashSet<String> referencedClasses = new HashSet<String>();
                            for (File xib : xibs) {
                                XIB parsedXIB;
                                if (xib.exists()) {
                                    try {
                                        parsedXIB = XIBParser.parse(xib);
                                        referencedClasses.addAll(parsedXIB.getCustomClasses());
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        LOG.error("Failed to generate xib in project: " + xib);
                                    }
                                }
                            }
                            if (progressIndicator.isCanceled()) {
                                return;
                            }
                            bindingList = new ArrayList<VirtualFile>();
                            for (String referencedClass : referencedClasses) {
                                File sourceFile = getFilesByProject(xcodeProject, module, referencedClass);
                                if (sourceFile != null) {
                                    VirtualFile vSourceFile = VfsUtil.findFileByIoFile(sourceFile, true);
                                    bindingList.add(vSourceFile);
                                }
                            }
                        } else {
                            bindingList = Arrays.asList(files);
                        }
                        if (bindingList != null) {
                            java.util.List<File> files = new ArrayList<File>();
                            for (VirtualFile vf : bindingList) {
                                files.add(new File(vf.getPath()));
                            }
                            MOEBindingGenerator generator =  new MOEBindingGeneratorByXcode();
                            generator.setPackage(packageName.getText());
                            generator.createFromPrototype(false);
                            File sdkToolsDir = new File(ProjectUtil.retrieveSDKPathFromGradle(
                                    new File(ModuleUtils.getModulePath(module))), "tools");
                            generator.generate(sdkToolsDir, new File(ModuleUtils.getModulePath(module)),
                                    files.toArray(new File[]{}),
                                    ACTION_TITLE,
                                    new IConsole() {
                                        @Override
                                        public void write(String s) {
                                            MOEToolWindow.getInstance(module.getProject()).log(s);
                                        }
                                    }, new IMonitor() {
                                        @Override
                                        public void setText(String s) {
                                            progressIndicator.setText(s);
                                        }

                                        @Override
                                        public boolean isCanceled() {
                                            return false;
                                        }
                                    });
                        }
                        progressIndicator.cancel();
                    } catch (Exception e) {
                        LOG.error("Unable to " + ACTION_TITLE, e);
                    }
                }
            }, ACTION_TITLE, true, module.getProject());
            super.doOKAction();
        }
    }
}
