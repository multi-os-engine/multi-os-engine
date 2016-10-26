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

package org.moe.tools.natjgen.binding;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.tools.natjgen.WrapNatJGenExec;
import org.moe.common.utils.ProjectUtil;
import org.moe.common.utils.XCodeUtil;
import org.moe.document.pbxproj.ProjectFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MOEBindingGeneratorByXcode implements MOEBindingGenerator {
    private String packageName;
    private boolean isCreateFromPrototype;

    @Override
    public void generate(File sdkToolsPath, File projectFile, File file, String action_title, IConsole console, IMonitor monitor){
        generate(sdkToolsPath, projectFile, new File[]{file}, action_title, console, monitor);
    }


    @Override
    public void generate(File sdkToolsPath, File projectFile, File[] inputFileArray, String action_title, IConsole console, IMonitor monitor) {

        if (projectFile == null) {
            return;
        }

        if (inputFileArray == null) {
            return;
        }

        //prepare --headers
        StringBuilder headerParam = new StringBuilder();
        for (File inputFile : inputFileArray) {
            headerParam.append(inputFile.getPath()).append(":");
        }

        //prepare --package-name
        if ((packageName == null) || packageName.isEmpty()) {
            packageName = "com." + getCompanyName(projectFile) + projectFile.getName() + ".ui";
            packageName = packageName.replace(" ", "").trim().toLowerCase();
        }

        //prepare --path-to-project
        String workspace = projectFile.getParent();

        generate(sdkToolsPath, projectFile.getPath(), packageName, headerParam.toString(), projectFile, action_title, console, monitor);
    }

    @Override
    public void setPackage(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public void createFromPrototype(boolean create) {
        isCreateFromPrototype = create;
    }

    private List<File> getAllFilesWithExt(File directory, String... extensions){
        List<File> files = new ArrayList<File>();

        File[] children = directory.listFiles();
        for(File child : children){
            if(child.isDirectory()){
                files.addAll(getAllFilesWithExt(child, extensions));
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

    private String getCompanyName(File projectFile){
        String companyName = "";
        try {
            File xcodeProjectFile = new File(ProjectUtil.retrieveXcodeProjectPathFromGradle(projectFile));
            ProjectFile xcodeProject = new ProjectFile(xcodeProjectFile);

            companyName = xcodeProject.getRoot().getRootObject().getReferenced().getAttributesOrNull().get("ORGANIZATIONNAME").value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return companyName == null || companyName.isEmpty() ? "" : companyName + ".";
    }

    private void generate(File sdkToolsPath, final String workspace, final String packageName, final String headers, final File projectFile, final String action_title, IConsole console, IMonitor monitor) {

        GenerateBindings generator = new GenerateBindings(workspace, packageName, headers, projectFile, console, monitor);
        try {
            generator.generate(sdkToolsPath);
        } catch (Throwable e) {
            throw new RuntimeException(action_title + " Failed", e);
        }
    }

    private class GenerateBindings {

        private final String workspace;
        private final String packageName;
        private final String headers;
        private final File projectFile;
        private final IConsole console;
        private final IMonitor monitor;

        public GenerateBindings(final String workspace, final String packageName, final String headers, final File projectFile, IConsole console, IMonitor monitor) {
            this.workspace = workspace;
            this.packageName = packageName;
            this.headers = headers;
            this.projectFile = projectFile;
            this.console = console;
            this.monitor = monitor;
        }

        public void generate(File sdkToolsPath) throws Exception {

            if (monitor != null) {
                monitor.setText("Generating...");
            }

            final long start_time = System.nanoTime();

            int MAX_ATTEMPTS = 3;
            int currentAttempt = 0;
            while(currentAttempt < MAX_ATTEMPTS){
                // Prepare NatJGen
                WrapNatJGenExec exec = new WrapNatJGenExec(sdkToolsPath);
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

                final Map<String, String> env = new HashMap<String, String>();
                env.put("MOE_HOME", sdkToolsPath.getParentFile().getAbsolutePath());

                String out = "";
                try {
                    out = ExecOutputCollector.collect(exec, env);
                } catch (IOException e) {
                    out = "NatJGen execution failed. I/O error. " + e.getMessage();
                } catch (InterruptedException e) {
                    out = "NatJGen was interrupted. " + e.getMessage();
                }

                if (console != null) {
                    console.write(out);
                }

                if (exec.getReturnCode() == 0){
                    break;
                }
                currentAttempt++;
            }

            if (console != null) {
                console.write("NatJGen ended in " + ((double) (System.nanoTime() - start_time) / 1000000000.0) + "s");
            }
        }
    }
}