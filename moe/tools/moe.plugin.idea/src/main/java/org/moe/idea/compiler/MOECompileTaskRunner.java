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

import org.moe.idea.ui.MOEToolWindow;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileTask;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import res.MOEText;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.*;

public abstract class MOECompileTaskRunner extends Task.Backgroundable {

    private final List<CompileTask> tasks;
    private ProgressIndicator progressIndicator;
    private CompileContext context;

    private ExecutorService executor = Executors.newFixedThreadPool(1);

    public MOECompileTaskRunner(@Nullable Project project, @NotNull String title, boolean canBeCancelled, List<CompileTask> tasks, CompileContext context) {
        super(project, title, canBeCancelled);

        this.tasks = tasks;
        this.context = context;
    }


    @Override
    public void run(@NotNull ProgressIndicator progressIndicator) {
        this.progressIndicator = progressIndicator;

        try {
            execute();
        }
        catch (IOException e) {
            MOEToolWindow.getInstance(getProject()).error("Unable to launch gradle task. Make sure gradle is installed.");
        }
        finally {
            progressIndicator.stop();
        }
    }

    private boolean execute() throws IOException {
        boolean result = false;

        progressIndicator.pushState();
        progressIndicator.setText(MOEText.get("MOE.Build"));
        progressIndicator.setIndeterminate(true);

        for(CompileTask task : tasks) {

            final CompileTask currentTask = task;
            FutureTask<Boolean> compileTask = new FutureTask<Boolean>(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    boolean executionResult = currentTask.execute(context);
                    return new Boolean(executionResult);
                }
            });
            executor.execute(compileTask);

            while (!compileTask.isDone() && !compileTask.isCancelled()) {
                if (progressIndicator.isCanceled()) {
                    compileTask.cancel(true);
                    cancel();

                    return result;
                }
            }

            try {
                result = compileTask.get();
            } catch (InterruptedException e) {
                MOEToolWindow.getInstance(getProject()).error(e.getMessage());
            } catch (ExecutionException e) {
                MOEToolWindow.getInstance(getProject()).error(e.getMessage());
                e.printStackTrace();
            }
        }

        if(progressIndicator.isCanceled()) {
            cancel();
        }
        else {
            if(result) {
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
}
