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
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.natjgen.WrapNatJGenExec;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;

public class MOEWrapNatjgenLibGenerator {
    @NotNull
    private final String framework;

    private final String headers;

    private final String ldFlags;
    private final String bundle;

    @NotNull
    private final String outFile;
    @NotNull
    private final Module module;
    @NotNull
    private final ProgressIndicator progressIndicator;

    public MOEWrapNatjgenLibGenerator(@NotNull final String framework,
                                      final String headers,
                                      final String ldFlags,
                                      final String bundle,
                                      @NotNull final String outFile,
                                      @NotNull final Module module,
                                      @NotNull ProgressIndicator progressIndicator) {
        this.framework = framework;
        this.headers = headers;
        this.ldFlags = ldFlags;
        this.bundle = bundle;
        this.outFile = outFile;
        this.module = module;
        this.progressIndicator = progressIndicator;
    }

    public void generate(String libFlag) throws Exception {

        progressIndicator.setText("Generating...");

        final long start_time = System.nanoTime();

        int MAX_ATTEMPTS = 3;
        int currentAttempt = 0;
        while(currentAttempt < MAX_ATTEMPTS){
            // Prepare NatJGen
            WrapNatJGenExec exec = new WrapNatJGenExec();
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

            String out;
            try {
                out = ExecOutputCollector.collect(exec);
            } catch (IOException e) {
                out = "NatJGen execution failed. I/O error. " + e.getMessage();
            } catch (InterruptedException e) {
                out = "NatJGen was interrupted. " + e.getMessage();
            }
            MOEToolWindow.getInstance(module.getProject()).log(out);
            if(exec.getReturnCode() == 0){
                break;
            }
            currentAttempt++;


        }
        module.getProject().getBaseDir().refresh(false, true);
    }
}
