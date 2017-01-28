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

/**
 * Base class for exec runners.
 */
public abstract class ExecRunnerBase {

    /**
     * Stdout/stderr listener.
     */
    protected ExecRunnerListener listener;

    /**
     * Stdout forwarder.
     */
    protected StdoutStreamListener stdoutStreamListener;

    /**
     * Stderr forwarder.
     */
    protected StderrStreamListener stderrStreamListener;

    /**
     * Process kill checker.
     */
    protected KillChecker killChecker;

    /**
     * Process was killed flag.
     */
    protected boolean wasKilled;

    /**
     * Process return code.
     */
    protected int returnCode;

    /**
     * Standard out/err stream listener.
     */
    public interface ExecRunnerListener {
        /**
         * Line was received on stdout.
         * @param line Line
         */
        void stdout(String line);
        /**
         * Line was received on stderr.
         * @param line Line
         */
        void stderr(String line);
    }

    /**
     * Returns the Stdout/stderr listener.
     * @return Stdout/stderr listener
     */
    public ExecRunnerListener getListener() {
        return listener;
    }

    /**
     * Sets the Stdout/stderr listener.
     * @param listener Stdout/stderr listener
     */
    public synchronized void setListener(ExecRunnerListener listener) {
        this.listener = listener;
    }

    /**
     * Runs the executable with the specified kill listener.
     * @param killListener Kill listener
     * @return Return code
     * @throws IOException if an I/O error occurs
     */
    public abstract int run(IKillListener killListener) throws IOException;

    /**
     * Returns the was killed flag.
     * @return Was killed flag
     */
    public boolean wasKilled() {
        return wasKilled;
    }

    /**
     * Returns the process' return code.
     * @return Return code
     */
    public int returnCode() {
        return returnCode;
    }

    /**
     * Stdout stream listener.
     */
    protected class StdoutStreamListener extends OutputStreamListener {
        /**
         * Creates a new StdoutStreamListener instance.
         * @param stream Stream to read from
         * @param listener Output listener
         */
        public StdoutStreamListener(InputStream stream, ExecRunnerListener listener) {
            super(stream, listener);
        }

        @Override
        protected void notifyListener(String line) {
            listener.stdout(line);
        }
    }

    /**
     * Stderr stream listener.
     */
    protected class StderrStreamListener extends OutputStreamListener {
        /**
         * Creates a new StderrStreamListener instance.
         * @param stream Stream to read from
         * @param listener Output listener
         */
        public StderrStreamListener(InputStream stream, ExecRunner.ExecRunnerListener listener) {
            super(stream, listener);
        }

        @Override
        protected void notifyListener(String line) {
            listener.stderr(line);
        }
    }

    /**
     * Base of stream listeners.
     */
    protected abstract class OutputStreamListener implements Runnable {
        /**
         * Listener thread.
         */
        private final Thread runnerThread;
        /**
         * Stream to read from.
         */
        private final InputStream stream;
        /**
         * Output listener.
         */
        protected final ExecRunner.ExecRunnerListener listener;

        /**
         * Creates a new OutputStreamListener instance.
         * @param stream Stream to read from
         * @param listener Output listener
         */
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

        /**
         * Notifies the listener of a new line.
         * @param line Line
         */
        abstract protected void notifyListener(String line);

        /**
         * Waits for the thread.
         * @throws InterruptedException if the operation was interrupted
         */
        public void waitFor() throws InterruptedException {
            this.runnerThread.interrupt();
            this.runnerThread.join();
        }
    }

    /**
     * Checks whether or not a process needs to be killed.
     */
    protected class KillChecker implements Runnable {

        /**
         * Process to kill.
         */
        private final Process process;

        /**
         * Kill listener.
         */
        private final IKillListener listener;

        /**
         * Checker's thread.
         */
        private final Thread runner;

        /**
         * Creates a new KillChecker instance.
         * @param process Process to kill
         * @param listener Kill listener
         */
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

        /**
         * Wait for and join the checker's thread.
         */
        public void waitFor() {
            runner.interrupt();
            try {
                runner.join();
            } catch (InterruptedException ignored) {
            }
        }
    }

}
