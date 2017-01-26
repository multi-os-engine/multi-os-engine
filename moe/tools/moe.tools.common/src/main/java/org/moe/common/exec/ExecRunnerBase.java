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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class ExecRunnerBase {

    protected ExecRunnerListener listener;
    protected StdoutStreamListener stdoutStreamListener;
    protected StderrStreamListener stderrStreamListener;
    protected KillChecker killChecker;
    protected boolean wasKilled;
    protected int returnCode;

    public interface ExecRunnerListener {
        void stdout(String line);
        void stderr(String line);
    }

    public ExecRunnerListener getListener() {
        return listener;
    }

    public synchronized void setListener(ExecRunnerListener listener) {
        this.listener = listener;
    }

    public abstract int run(IKillListener killListener) throws IOException;

    public boolean wasKilled() {
        return wasKilled;
    }

    public int returnCode() {
        return returnCode;
    }

    protected class StdoutStreamListener extends OutputStreamListener {
        public StdoutStreamListener(InputStream stream, ExecRunnerListener listener) {
            super(stream, listener);
        }

        @Override
        protected void notifyListener(String line) {
            listener.stdout(line);
        }
    }

    protected class StderrStreamListener extends OutputStreamListener {
        public StderrStreamListener(InputStream stream, ExecRunner.ExecRunnerListener listener) {
            super(stream, listener);
        }

        @Override
        protected void notifyListener(String line) {
            listener.stderr(line);
        }
    }

    protected abstract class OutputStreamListener implements Runnable {
        private final Thread runnerThread;
        private final InputStream stream;
        protected final ExecRunner.ExecRunnerListener listener;

        public OutputStreamListener(InputStream stream, ExecRunner.ExecRunnerListener listener) {
            this.stream = stream;
            this.listener = listener;

            runnerThread = new Thread(this);
            runnerThread.start();
        }

        @Override
        public void run() {
            String line;

            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

            try {
                while ((line = reader.readLine()) != null) {
                    notifyListener(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        abstract protected void notifyListener(String line);

        public void waitFor() throws InterruptedException {
            this.runnerThread.interrupt();
            this.runnerThread.join();
        }
    }

    protected class KillChecker implements Runnable {

        private final Process process;

        private final IKillListener listener;

        private final Thread runner;

        public KillChecker(Process process, IKillListener listener) {
            super();
            this.process = process;
            this.listener = listener;
            this.runner = new Thread(this);
            this.runner.start();
        }

        @Override
        public void run() {
            if (listener == null || process == null) {
                return;
            }
            while (!Thread.currentThread().isInterrupted()) {
                if (listener.needsKill()) {
                    process.destroy();
                    wasKilled = true;
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }

        public void waitFor() {
            runner.interrupt();
            try {
                runner.join();
            } catch (InterruptedException ignored) {
            }
        }
    }

}
