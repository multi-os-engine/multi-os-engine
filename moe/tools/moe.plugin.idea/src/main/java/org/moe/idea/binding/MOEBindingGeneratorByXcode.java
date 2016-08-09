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

package org.moe.idea.binding;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.document.pbxproj.ProjFile;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.XCodeUtil;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.idea.utils.natjgen.WrapNatJGenExec;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.impl.VirtualDirectoryImpl;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MOEBindingGeneratorByXcode implements MOEBindingGenerator {
    private static final Logger LOG = LoggerFactory.getLogger(MOEBindingGeneratorByXcode.class);
    private String packageName;
    private boolean isCreateFromPrototype;

    @Override
    public void generate(DataContext dataContext, String action_title){
        VirtualFile[] files = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(dataContext);

        if (files.length == 1 && files[0] instanceof VirtualDirectoryImpl){
            files = getAllFilesWithExt((VirtualDirectoryImpl) files[0], ".h").toArray(new VirtualFile[]{});
        }

        Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());
        generate(module, files, action_title);
    }

    @Override
    public void generate(Module module, VirtualFile file, String action_title){
        generate(module, new VirtualFile[]{file}, action_title);
    }


    @Override
    public void generate(Module module, VirtualFile[] inputFileArray, String action_title) {

        if (module == null) {
            LOG.error("Failed to get module");
            return;
        }

        if (inputFileArray == null) {
            LOG.error("Failed to get natjgen file");
            return;
        }

        //prepare --headers
        StringBuilder headerParam = new StringBuilder();
        for (VirtualFile inputFile : inputFileArray) {
            headerParam.append(inputFile.getPath()).append(":");
        }

        //prepare --package-name
        if ((packageName == null) || packageName.isEmpty()) {
            packageName = "com." + getCompanyName(module) + module.getName() + ".ui";
            packageName = packageName.replace(" ", "").trim().toLowerCase();
        }

        //prepare --path-to-project
        String workspace = ModuleUtils.getModulePath(module);

        generate(workspace, packageName, headerParam.toString(), module, action_title);
    }

    @Override
    public void setPackage(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public void createFromPrototype(boolean create) {
        isCreateFromPrototype = create;
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

    private String getCompanyName(Module module){
        String companyName = "";
        try {
            File xcodeProjectFile = MOESdkPlugin.getXcodeProjectFile(module);
            ProjFile xcodeProject = new ProjFile(xcodeProjectFile);

            companyName = xcodeProject.getRoot().getRootObject().getReferenced().getAttributes().getValue("ORGANIZATIONNAME").value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return companyName == null || companyName.isEmpty() ? "" : companyName + ".";
    }

    private List<String> getInterfacesByHeader(String content){
        List<String> result = new ArrayList<String>();

        Pattern interfacePattern = Pattern.compile("@interface\\s+\\w+[\\s:]+");
        Matcher interfaceMatcher = interfacePattern.matcher(content);

        while (interfaceMatcher.find()){
            String interfaceName = interfaceMatcher.group().replace("@interface", "").replace(":", "").trim();
            result.add(interfaceName);
        }

        return result;
    }

    private File saveToTempFile(String body) {
        File natjGenFile;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            natjGenFile = File.createTempFile("gen", ".natjgen");

            fileWriter = new FileWriter(natjGenFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(body);
            bufferedWriter.close();
            fileWriter.close();

        }
        catch (IOException e) {
            return null;
        }
        finally {
            try{
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }

                if(fileWriter != null){
                    fileWriter.close();
                }
            }
            catch (IOException e){

            }
        }
        return natjGenFile;
    }

    private void generate(@NotNull final String workspace, @NotNull final String packageName, @NotNull final String headers, @NotNull final Module module, final String action_title) {
        ProgressIndicator progressIndicator = ProgressManager.getInstance().getProgressIndicator();
        if (progressIndicator == null) {
            progressIndicator = new EmptyProgressIndicator();
        }
        GenerateBindings generator = new GenerateBindings(workspace, packageName, headers, module, progressIndicator);
        try {
            generator.generate();
        } catch (Throwable e) {
            throw new RuntimeException(action_title + " Failed", e);
        }
    }

    @Contract("null -> false")
    private static boolean isNatjFile(@Nullable VirtualFile file) {
        return file != null && file.exists() && file.getName().endsWith(".natjgen");
    }

    @Contract("null -> false")
    private static boolean isHeaderFile(@Nullable VirtualFile file) {
        return file != null && file.exists() && file.getName().endsWith(".h");
    }

    protected String getSDK() {
        // FIXME
        String xcodepath = XCodeUtil.getDeveloperPath();

        if (xcodepath == null) {
            throw new RuntimeException("Xcode path is null");
        }
        xcodepath = xcodepath.replace("\n", "").replace("\r", "");
        return xcodepath + "/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS.sdk";
    }

    private class GenerateBindings {
        @NotNull
        private final String workspace;
        @NotNull
        private final String packageName;
        @NotNull
        private final String headers;
        @NotNull
        private final Module module;
        @NotNull
        private final ProgressIndicator progressIndicator;

        public GenerateBindings(@NotNull final String workspace, @NotNull final String packageName, @NotNull final String headers, @NotNull final Module module, @NotNull ProgressIndicator progressIndicator) {
            this.workspace = workspace;
            this.packageName = packageName;
            this.headers = headers;
            this.module = module;
            this.progressIndicator = progressIndicator;
        }

        public void generate() throws Exception {

            progressIndicator.setText("Generating...");

            final long start_time = System.nanoTime();
            LOG.debug("NatJGen started");

            int MAX_ATTEMPTS = 3;
            int currentAttempt = 0;
            while(currentAttempt < MAX_ATTEMPTS){
                // Prepare NatJGen
                WrapNatJGenExec exec = new WrapNatJGenExec();
                ArrayList<String> args = exec.getArguments();

                args.add("--path-to-project");
                args.add(workspace);
                args.add("--package-name");
                args.add(packageName);
                args.add("--headers");
                args.add(headers);

                if(isCreateFromPrototype){
                    args.add("--create-from-prototype");
                }

                String out;
                try {
                    out = ExecOutputCollector.collect(exec);
                } catch (IOException e) {
                    out = "NatJGen execution failed. I/O error. " + e.getMessage();
                } catch (InterruptedException e) {
                    out = "NatJGen was interrupted. " + e.getMessage();
                }

                MOEToolWindow.getInstance(module.getProject()).log(out);
                if (exec.getReturnCode() == 0){
                    break;
                }
                currentAttempt++;
            }


            LOG.debug("NatJGen ended in " + ((double) (System.nanoTime() - start_time) / 1000000000.0) + "s");

            // Re-Sync project
            LOG.debug("Re-Sync Project");
            module.getProject().getBaseDir().refresh(false, true);
        }
    }
}
