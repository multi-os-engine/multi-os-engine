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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MOEWrapNatjgenLibGenerator {
    private final String framework;

    private final String headers;
    private final String ldFlags;
    private final String bundle;
    private final String outFile;
    private final File projectFile;
    private final IConsole console;
    private final IMonitor monitor;

    public MOEWrapNatjgenLibGenerator(final String framework,
                                      final String headers,
                                      final String ldFlags,
                                      final String bundle,
                                      final String outFile,
                                      File projectFile,
                                      IConsole console,
                                      IMonitor monitor) {
        this.framework = framework;
        this.headers = headers;
        this.ldFlags = ldFlags;
        this.bundle = bundle;
        this.outFile = outFile;
        this.projectFile = projectFile;
        this.console = console;
        this.monitor = monitor;
    }

    public void generate(File sdkToolsPath, String libFlag) throws Exception {

        if (monitor != null) {
            monitor.setText("Generating...  " + framework);
        }

        final long start_time = System.nanoTime();

        int MAX_ATTEMPTS = 3;
        int currentAttempt = 0;
        while(currentAttempt < MAX_ATTEMPTS){
            // Prepare NatJGen
            WrapNatJGenExec exec = new WrapNatJGenExec(sdkToolsPath);
            ArrayList<String> args = exec.getArguments();

            args.add(libFlag);
            args.add(framework);
            args.add("--output-file-path");
            args.add(outFile);

            if(headers != null){
                args.add("--headers");
                args.add(headers);
            }

            if(ldFlags != null){
                args.add("--ld-flags");
                args.add(ldFlags);
            }

            if(bundle != null){
                args.add("--bundle");
                args.add(bundle);
            }

            final Map<String, String> env = new HashMap<String, String>();
            env.put("MOE_HOME", sdkToolsPath.getParentFile().getAbsolutePath());

            String out;
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
            if(exec.getReturnCode() == 0){
                break;
            }
            currentAttempt++;


        }
    }
}