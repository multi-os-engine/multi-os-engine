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
import org.moe.idea.utils.natjgen.NatJGenExec;
import org.moe.idea.utils.natjgen.NatJGenFrameworkConfig;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThirdPartyBindingGenerator {
    public static int generate(String frameworkName, String frameworkPath, String tempHeadersDir, String output, List<String> headers){
        try {
            int exitCode = 1;
            frameworkName = frameworkName.replaceAll("[+\\-&|!(){}^\"~*?:]", "");
            String packageName = "org.moe." + frameworkName.toLowerCase().trim();
            String natjGenBody = NatJGenFrameworkConfig.generate(packageName, frameworkPath, output, headers);

            //save config file & start generation process
            File natjGenFile = saveToTempFile(natjGenBody);

            if (natjGenFile == null) {
                return exitCode;
            }

            int MAX_ATTEMPTS = 3;
            int currentAttempt = 0;
            while(currentAttempt < MAX_ATTEMPTS){
                // Prepare NatJGen
                NatJGenExec exec = new NatJGenExec();
                ArrayList<String> args = exec.getArguments();
                args.add("/");
                args.add("");
                args.add(natjGenFile.getPath());

                String log = ExecOutputCollector.collect(exec);
                if (exec.getReturnCode() == 0) {
                    exitCode = exec.getReturnCode();
                    break;
                }
                currentAttempt++;
            }
            return exitCode;

        } catch (Throwable e) {
            throw new RuntimeException("Thirdparty framework binding generation failed Failed", e);
        }
    }

    private static File saveToTempFile(String body) throws IOException {
        File natjGenFile;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            natjGenFile = File.createTempFile("gen", ".natjgen");
            fileWriter = new FileWriter(natjGenFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(body);
            bufferedWriter.close();
        }
        catch (IOException e) {
            return null;
        }
        finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (Exception e) {

                }
            }

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e) {

                }
            }
        }

        return natjGenFile;
    }
}
