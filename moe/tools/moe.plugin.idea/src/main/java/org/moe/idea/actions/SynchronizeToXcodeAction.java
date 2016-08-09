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
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.impl.VirtualDirectoryImpl;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SynchronizeToXcodeAction extends AnAction {

    public static final String ACTION_TITLE = "Synchronize to Xcode";

    private static final Logger LOG = LoggerFactory.getLogger(SynchronizeToXcodeAction.class);


    public SynchronizeToXcodeAction() {
        super(ACTION_TITLE);
    }

    @Contract("null -> false")
    private boolean isJavaFile(@Nullable VirtualFile[] files) {
        boolean result = true;
        for(VirtualFile file : files){
            result &= file.exists() && file.getName().endsWith(".java");
        }
        return result;
    }

    @Contract("null -> false")
    private boolean isFolderWithJava(@Nullable VirtualFile[] files) {
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
            if(file.getName().endsWith(".java")){
                return true;
            }
        }
        return result;
    }

    @Contract("null -> false")
    private boolean isModule(@Nullable Module module) {
        boolean isModule = module != null;
        boolean isXcode = false;

        if (isModule) {
            if (module.getModuleFile() == null){
                module.getProject().save();
            }
            isModule &= module.getModuleFile() != null;

            File xcodeFile = MOESdkPlugin.getXcodeProjectFile(module);
            isXcode = ((xcodeFile != null) && xcodeFile.exists());
        }

        return isModule && isXcode;
    }

    @Override
    public void update(AnActionEvent e) {
        DataContext dataContext = e.getDataContext();
        Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());
        VirtualFile[] files = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(e.getDataContext());

        boolean isActionEnabled = false;
        if (MOESdkPlugin.isValidMoeModule(module) && (isJavaFile(files) || isFolderWithJava(files)) &&
                isModule(module) && WrapNatJGenExec.isNatJGenExist() && !OsUtils.isWindows()) {
            isActionEnabled = true;
        }

        e.getPresentation().setEnabled(isActionEnabled);
        e.getPresentation().setVisible(isActionEnabled);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        final DataContext dataContext = e.getDataContext();
        final Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());
        final VirtualFile[] files = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(e.getDataContext());

        ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
            @Override
            public void run() {
                try {
                    ProgressIndicator progressIndicator = ProgressManager.getInstance().getProgressIndicator();
                    if (progressIndicator == null) {
                        progressIndicator = new EmptyProgressIndicator();
                    }


                    List<VirtualFile> bindingList;
                    if (files.length == 1 && files[0] instanceof VirtualDirectoryImpl) {
                        bindingList = getAllFilesWithExt((VirtualDirectoryImpl) files[0], ".java");
                    } else {
                        bindingList = Arrays.asList(files);
                    }

                    if (bindingList != null) {
                        MOEBindingGenerator generator = MOEGenerateBindingFactory.getGenerator(true);
                        for (VirtualFile file : bindingList) {

                            progressIndicator.setText("Synchronize " + file .getName() + "...");

                            generator.generate(module, file, ACTION_TITLE);
                        }
                    }
                    progressIndicator.cancel();
                } catch (Exception e) {

                }


            }
        }, ACTION_TITLE, true, module.getProject());

    }

    private List<VirtualFile> getAllFilesWithExt(VirtualDirectoryImpl directory, String... extensions){
        List<VirtualFile> files = new ArrayList<VirtualFile>();

        VirtualFile[] children = directory.getChildren();
        for(VirtualFile child : children){
            if(child instanceof VirtualDirectoryImpl){
                files.addAll(getAllFilesWithExt((VirtualDirectoryImpl) child, extensions));
            }
            else{
                for(String extension : extensions){
                    if(child.getName().endsWith(extension)){
                        files.add(child);
                    }
                }
            }
        }
        return  files;

    }

}
