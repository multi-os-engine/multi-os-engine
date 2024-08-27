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

package org.moe.prebuilts;

import org.gradle.api.Action;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.TaskAction;
import org.gradle.process.ExecResult;
import org.gradle.process.ExecSpec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

abstract class BaseTask extends DefaultTask {

    private File logFile;
    private NonClosingFileOutputStream log;

    @Internal
    protected final File getLogFile() {
        if (logFile == null) {
            throw new NullPointerException();
        }
        return logFile;
    }

    @Internal
    protected final FileOutputStream getLog() {
        if (log == null) {
            throw new NullPointerException();
        }
        return log;
    }

    @TaskAction
    public final void doExecute() {
        logFile = logFile();
        if (logFile == null) {
            throw new NullPointerException();
        }
        getProject().mkdir(logFile.getParentFile());

        try {
            log = new NonClosingFileOutputStream(logFile, getProject().hasProperty("moe.verbose"));
        } catch (FileNotFoundException e) {
            throw new GradleException(e.getMessage(), e);
        }

        try {
            executeImpl();
        } catch (Throwable e) {
            System.err.println("Error log available at " + logFile.getAbsolutePath());
            throw e;
        } finally {
            try {
                ((NonClosingFileOutputStream)getLog()).realClose();
            } catch (IOException ignore) {
            }
        }
        setDidWork(true);
    }

    protected ExecResult exec(Action<? super ExecSpec> execSpec) {
        return getProject().exec(spec -> {
            spec.setStandardOutput(getLog());
            spec.setErrorOutput(getLog());
            execSpec.execute(spec);
            logPrebuildCommand(spec);
        });
    }

    protected abstract File logFile();

    protected abstract void executeImpl();

    private void logPrebuildCommand(ExecSpec spec) {
        try {
            getLog().write(("\n\nCOMMAND >>> " + spec.getCommandLine().toString() + "\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
