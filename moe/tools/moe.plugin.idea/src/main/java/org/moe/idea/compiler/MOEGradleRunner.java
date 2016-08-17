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

package org.moe.idea.compiler;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.exec.GradleExec;
import org.moe.idea.ui.MOEToolWindow;
import res.MOEText;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class MOEGradleRunner extends Task.Backgroundable {

    private final List<GradleTask> tasks;

    private ProgressIndicator progressIndicator;

    public MOEGradleRunner(@Nullable Project project, @NotNull String title, boolean canBeCancelled, List<GradleTask> tasks) {
        super(project, title, canBeCancelled);

        this.tasks = tasks;
    }

    @Override
    public void run(@NotNull ProgressIndicator progressIndicator) {
        this.progressIndicator = progressIndicator;


        try {
            build();
        } catch (IOException e) {
            error("Unable to launch gradle task. Make sure gradle is installed.");
        } catch (Exception e) {
            error("Internal error in gradle runner.\n" + e.toString());
        } finally {
            progressIndicator.stop();
        }
    }

    private GradleExec createExec(GradleTask task) throws IOException {
        File buildDirectory = new File(task.directory());

        GradleExec exec = new GradleExec(buildDirectory, null, buildDirectory);

        exec.getArguments().add(task.task());
        exec.getArguments().addAll(task.arguments());

        return exec;
    }

    private boolean runExec(GradleExec exec) {
        boolean result = false;

        ExecRunner runner;
        try {
            runner = exec.getRunner();
        } catch (Exception e) {
            return false;
        }

        runner.setListener(new ExecRunnerBase.ExecRunnerListener() {
            @Override
            public void stdout(String line) {
                MOEToolWindow.getInstance(getProject()).log(line);
            }

            @Override
            public void stderr(String line) {
                MOEToolWindow.getInstance(getProject()).error(line);
            }
        });

        try {
            result = (runner.run(null) == 0);
        }
        catch (IOException e) {
        }

        return result;
    }

    private boolean build() throws IOException {
        boolean result = true;

        progressIndicator.pushState();
        progressIndicator.setText(MOEText.get("MOE.Build"));
        progressIndicator.setIndeterminate(true);

        for (GradleTask task : tasks) {
            GradleExec exec = createExec(task);

            if (!runExec(exec)) {
                result = false;
                break;
            }

        }

        if (progressIndicator.isCanceled()) {
            cancel();
        }
        else {
            if (result) {
                success();
            }
            else {
                error("see above");
            }
        }

        return result;
    }

    protected abstract void success();
    protected abstract void error(String error);
    protected abstract void cancel();

    static public class GradleTask
    {
        private final List<String> arguments;
        private final String task;
        private final String directory;

        public GradleTask(String task, List<String> arguments, String directory) {
            this.task = task;

            this.directory = directory;

            this.arguments = new ArrayList<String>();
            this.arguments.addAll(arguments);
        }

        public String task() {
            return task;
        }

        public List<String> arguments() {
            return arguments;
        }

        public String directory() {
            return directory;
        }
    }
}
