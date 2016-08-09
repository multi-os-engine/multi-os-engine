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
import org.moe.idea.binding.MOEBindingGenerator;
import org.moe.idea.binding.MOEGenerateBindingFactory;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.idea.utils.natjgen.WrapNatJGenExec;
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

import javax.swing.*;
import java.awt.*;

public class MOEGenerateBindingAction extends AnAction {

    public static final String ACTION_TITLE = "Generate Bindings";



    private static final Logger LOG = LoggerFactory.getLogger(MOEGenerateBindingAction.class);

    private static boolean isJavaClass = false;

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

        if(!WrapNatJGenExec.isNatJGenExist() || OsUtils.isWindows()) {
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
                    ProgressIndicator progressIndicator = ProgressManager.getInstance().getProgressIndicator();
                    if (progressIndicator == null) {
                        progressIndicator = new EmptyProgressIndicator();
                        progressIndicator.start();
                        progressIndicator.popState();
                    }

                    MOEBindingGenerator generator = MOEGenerateBindingFactory.getGenerator(false);
                    generator.setPackage(packageName.getText());
                    generator.createFromPrototype(false);
                    generator.generate(dataContext, ACTION_TITLE);

                    progressIndicator.cancel();
                }
            }, ACTION_TITLE, false, module.getProject());

            super.doOKAction();
        }
    }

}
