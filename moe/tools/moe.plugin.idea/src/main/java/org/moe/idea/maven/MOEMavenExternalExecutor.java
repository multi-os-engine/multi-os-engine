/* ==========================================================================
 * Copyright 2006 Mevenide Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * =========================================================================
 */


package org.moe.idea.maven;

        import com.intellij.execution.ExecutionException;
        import com.intellij.execution.configurations.JavaParameters;
        import com.intellij.execution.process.OSProcessHandler;
        import com.intellij.openapi.application.ApplicationManager;
        import com.intellij.openapi.progress.ProgressIndicator;
        import com.intellij.openapi.project.Project;
        import com.intellij.openapi.util.Key;
        import org.jetbrains.annotations.NonNls;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;
        import org.jetbrains.idea.maven.execution.*;
        import org.jetbrains.idea.maven.project.MavenConsole;
        import org.jetbrains.idea.maven.project.MavenGeneralSettings;
        import org.jetbrains.idea.maven.server.MavenServerConsole;

public class MOEMavenExternalExecutor extends MOEMavenExecutor {

    private OSProcessHandler myProcessHandler;

    @NonNls private static final String PHASE_INFO_REGEXP = "\\[INFO\\] \\[.*:.*\\]";
    @NonNls private static final int INFO_PREFIX_SIZE = "[INFO] ".length();

    private JavaParameters myJavaParameters;
    private ExecutionException myParameterCreationError;

    public MOEMavenExternalExecutor(Project project,
                                 @NotNull MavenRunnerParameters parameters,
                                 @Nullable MavenGeneralSettings coreSettings,
                                 @Nullable MavenRunnerSettings runnerSettings,
                                 @NotNull MavenConsole console) {
        super(parameters, RunnerBundle.message("external.executor.caption"), console);

        try {
            myJavaParameters = MavenExternalParameters.createJavaParameters(project, myParameters, coreSettings, runnerSettings, null);
        }
        catch (ExecutionException e) {
            myParameterCreationError = e;
        }
    }

    public boolean execute(final ProgressIndicator indicator) {
        displayProgress();

        try {
            if (myParameterCreationError != null) {
                throw myParameterCreationError;
            }

            myProcessHandler =
                    new OSProcessHandler(myJavaParameters.toCommandLine()) {
                        @Override
                        public void notifyTextAvailable(String text, Key outputType) {
                            // todo move this logic to ConsoleAdapter class
                            if (!myConsole.isSuppressed(text)) {
                                super.notifyTextAvailable(text, outputType);
                            }
                            updateProgress(indicator, text);
                        }
                    };

            myProcessHandler.setShouldDestroyProcessRecursively(true);
            myConsole.attachToProcess(myProcessHandler);
        }
        catch (ExecutionException e) {
            myConsole.systemMessage(MavenServerConsole.LEVEL_FATAL, RunnerBundle.message("external.startup.failed", e.getMessage()), null);
            return false;
        }

        start();
        IndicatorHandler indicatorHandler = new IndicatorHandler(indicator, this);
        indicatorHandler.start();
        readProcessOutput();
        stop();
        indicatorHandler.stop();

        return printExitSummary();
    }

    void stop() {
        if (myProcessHandler != null) {
            myProcessHandler.destroyProcess();
            myProcessHandler.waitFor();
            setExitCode(myProcessHandler.getProcess().exitValue());
        }
        super.stop();
    }

    private void readProcessOutput() {
        myProcessHandler.startNotify();
        myProcessHandler.waitFor();
    }

    private void updateProgress(@Nullable final ProgressIndicator indicator, final String text) {
        if (indicator != null) {
            if (indicator.isCanceled()) {
                if (!isCancelled()) {
                    ApplicationManager.getApplication().invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            cancel();
                        }
                    });
                }
            }
            if (text.matches(PHASE_INFO_REGEXP)) {
                indicator.setText2(text.substring(INFO_PREFIX_SIZE));
            }
        }
    }

    public class IndicatorHandler {

        private ProgressIndicator indicator;
        private boolean stoped = false;
        private Thread t;

        public IndicatorHandler(final ProgressIndicator indicator, final MavenExecutor executor) {
            this.indicator = indicator;

            t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (indicator.isRunning() && !stoped) {
                        try {
                            if (indicator.isCanceled()) {
                                break;
                            }
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            break;
                        }
                    }
                    if (indicator.isCanceled()) {
                        executor.cancel();
                    }
                }
            });
        }

        public synchronized void start() {
            stoped = false;
            t.start();
        }

        public synchronized void stop() {
            stoped = true;
        }
    }
}
