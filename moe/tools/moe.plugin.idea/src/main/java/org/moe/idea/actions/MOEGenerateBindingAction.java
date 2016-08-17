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
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.impl.VirtualDirectoryImpl;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.ProjectUtil;
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

public class MOEGenerateBindingAction extends AnAction {

    public static final String ACTION_TITLE = "Generate Bindings";

    private static final Logger LOG = LoggerFactory.getLogger(MOEGenerateBindingAction.class);

    private static boolean isJavaClass = false;
    private ProgressIndicator progressIndicator;

    public MOEGenerateBindingAction() {
        super(ACTION_TITLE);
    }

    @Contract("null -> false")
    private static boolean isHeaderFile(@Nullable VirtualFile[] files) {
        boolean result = true;
        for(VirtualFile file : files){
            result &= file.exists() && file.getName().endsWith(".h");
        }
        return result;
    }

    @Contract("null -> false")
    private boolean isFolderWithHeaders(@Nullable VirtualFile[] files) {
        boolean result = false;

        if(files.length == 1 && files[0] instanceof VirtualDirectoryImpl){
            for(VirtualFile file : files){
                result |= isContainsJava(file);
            }
        }

        return result;
    }

    private boolean isContainsJava(VirtualFile file){
        boolean result = false;
        if(file instanceof VirtualDirectoryImpl){
            VirtualFile[] children = file.getChildren();
            for(VirtualFile child : children){
                result |= isContainsJava(child);
            }
        }
        else{
            if(file.getName().endsWith(".h")){
                return true;
            }
        }
        return result;
    }



    @Override
    public void update(AnActionEvent e) {
        VirtualFile[] files = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(e.getDataContext());
        boolean isActionEnabled = isHeaderFile(files) || isFolderWithHeaders(files);

        if(OsUtils.isWindows()) {
            isActionEnabled = false;
        }

        e.getPresentation().setEnabled(isActionEnabled);
        e.getPresentation().setVisible(isActionEnabled);
    }

    @Override
    public void actionPerformed(AnActionEvent event) {

        final DataContext dataContext = event.getDataContext();
        final Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());

        if(module == null) {
            return;
        }

        ChoosePackageDialog dialog = new ChoosePackageDialog(module, dataContext);
        dialog.show();
    }

    private class ChoosePackageDialog extends DialogWrapper {
        private Module module;
        private DataContext dataContext;

        private JPanel myPanel;
        private JTextField packageName;

        public ChoosePackageDialog(Module module, DataContext context) {
            super(module.getProject());

            this.module = module;
            this.dataContext = context;

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

        @Override
        protected void doOKAction() {

            ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
                @Override
                public void run() {
                    progressIndicator = ProgressManager.getInstance().getProgressIndicator();
                    if (progressIndicator == null) {
                        progressIndicator = new EmptyProgressIndicator();
                        progressIndicator.start();
                        progressIndicator.popState();
                    }

                    MOEBindingGenerator generator =  new MOEBindingGeneratorByXcode();
                    generator.setPackage(packageName.getText());
                    generator.createFromPrototype(false);

                    VirtualFile[] virtualFiles = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(dataContext);
                    java.util.List<File> files = new ArrayList<File>();
                    for (VirtualFile vf : virtualFiles) {
                        files.add(new File(vf.getPath()));
                    }
                    final Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());
                    File sdkToolsDir = new File(ProjectUtil.retrieveSDKPathFromGradle(new File(ModuleUtils.getModulePath(module))), "tools");
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

                    progressIndicator.cancel();
                }
            }, ACTION_TITLE, false, module.getProject());

            super.doOKAction();
        }
    }

}
