/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.remote;

import org.apache.commons.lang3.StringUtils;
import org.gradle.api.GradleException;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.StreamToLogForwarder;
import org.moe.gradle.utils.TermColor;

import java.io.PrintStream;

import static org.moe.gradle.utils.TermColor.*;

abstract class AbstractServerTask {

    @NotNull
    final Server server;

    @NotNull
    protected final PrintStream outlog;

    @NotNull
    protected final PrintStream errlog;

    private boolean quiet = false;

    protected AbstractServerTask(@NotNull Server server) {
        this.server = Require.nonNull(server);
        final Logger logger = Logging.getLogger(getClass());
        outlog = new PrintStream(new StreamToLogForwarder(logger, false));
        errlog = new PrintStream(new StreamToLogForwarder(logger, true));
    }

    public boolean isQuiet() {
        return quiet;
    }

    public void setQuiet(boolean quiet) {
        this.quiet = quiet;
    }

    void run() {
        int sepWidth = 0;
        try {
            if (!quiet) {
                sepWidth = printTaskMarker(outlog, ST_REMOTE_TASK_START, " STARTING REMOTE TASK - " + getTaskName());
            }
            main();

        } catch (ServerChannelException e) {
            if (!quiet) {
                printTaskMarker(errlog, ST_REMOTE_TASK_ERROR, " REMOTE TASK FAILED - " + getTaskName());
                errlog.println(ST_REMOTE_TASK_ERROR_DESC + e.getOutput() + FM_RES_ALL + "\n");
                errlog.flush();
            }
            throw new GradleException(e.getMessage(), e);

        } catch (Exception e) {
            if (!quiet) {
                printTaskMarker(errlog, ST_REMOTE_TASK_ERROR, " REMOTE TASK FAILED - " + getTaskName());
            }
            throw new GradleException(e.getMessage(), e);
        }
        if (!quiet) {
            printTaskEnd(outlog, ST_REMOTE_TASK_END, " [REMOTE TASK DONE] ", sepWidth);
        }
    }

    public abstract String getTaskName();

    protected abstract void main() throws Exception;

    private int printTaskMarker(PrintStream stream, TermColor color, String message) {
        final String sep = StringUtils.rightPad("", message.length() + 1, "=");
        stream.println("\n" + color.toString() + sep+ "\n" + message + "\n" + sep + FM_RES_ALL + "\n");
        stream.flush();
        return sep.length();
    }

    private void printTaskEnd(@NotNull PrintStream stream, TermColor color, String message, int sepWidth) {
        final int size = sepWidth - message.length();
        final int size_2 = size / 2;
        stream.println(color.toString() +
                StringUtils.rightPad("", size_2, "<") + message +
                StringUtils.rightPad("", size - size_2, ">") + FM_RES_ALL);
        stream.flush();
    }
}
