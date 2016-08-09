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

package org.moe.common.exec;

import java.io.IOException;

public class ProcessHandler extends ExecRunnerBase {

    private final Process proc;

    public ProcessHandler(Process proc) {
        if (proc == null) {
            throw new NullPointerException();
        }
        this.proc = proc;
    }

    @Override
    public synchronized int run(IKillListener killListener) throws IOException {

        stdoutStreamListener = new StdoutStreamListener(proc.getInputStream(), getListener());
        stderrStreamListener = new StderrStreamListener(proc.getErrorStream(), getListener());
        killChecker = new KillChecker(proc, killListener);

        try {
            int ret = proc.waitFor();
            stdoutStreamListener.waitFor();
            stderrStreamListener.waitFor();
            killChecker.waitFor();
            return ret;
        } catch (InterruptedException e) {
            throw new IOException("exec was interrupted", e);
        }

    }
}
