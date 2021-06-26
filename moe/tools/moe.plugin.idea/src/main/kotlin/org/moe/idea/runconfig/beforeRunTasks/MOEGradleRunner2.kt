package org.moe.idea.runconfig.beforeRunTasks

import com.google.common.collect.Sets
import com.intellij.build.BuildConsoleUtils
import com.intellij.build.BuildViewManager
import com.intellij.build.DefaultBuildDescriptor
import com.intellij.build.events.impl.FinishBuildEventImpl
import com.intellij.build.events.impl.SkippedResultImpl
import com.intellij.build.events.impl.StartBuildEventImpl
import com.intellij.build.events.impl.SuccessResultImpl
import com.intellij.compiler.CompilerManagerImpl
import com.intellij.compiler.CompilerWorkspaceConfiguration
import com.intellij.notification.NotificationGroup
import com.intellij.openapi.compiler.CompilerManager
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.externalSystem.model.ExternalSystemException
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskId
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskNotificationEvent
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskNotificationListenerAdapter
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskType
import com.intellij.openapi.externalSystem.model.task.event.ExternalSystemBuildEvent
import com.intellij.openapi.externalSystem.model.task.event.ExternalSystemTaskExecutionEvent
import com.intellij.openapi.externalSystem.service.execution.ExternalSystemEventDispatcher
import com.intellij.openapi.externalSystem.util.ExternalSystemUtil
import com.intellij.openapi.progress.EmptyProgressIndicator
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.Task
import com.intellij.openapi.progress.util.AbstractProgressIndicatorExBase
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.MessageType
import com.intellij.openapi.wm.ex.ProgressIndicatorEx
import com.intellij.ui.AppIcon
import com.intellij.util.SystemProperties
import com.intellij.util.ui.UIUtil
import org.gradle.tooling.BuildCancelledException
import org.gradle.tooling.CancellationTokenSource
import org.gradle.tooling.GradleConnector
import org.jetbrains.plugins.gradle.service.execution.GradleExecutionHelper
import org.jetbrains.plugins.gradle.service.project.GradleProjectResolver
import org.jetbrains.plugins.gradle.util.GradleConstants
import org.moe.common.configuration.RemoteSettings
import org.moe.idea.compiler.MOEGradleRunner
import org.moe.idea.gradle.getOrCreateGradleExecutionSettings
import org.moe.idea.gradle.hasCause
import org.moe.idea.runconfig.configuration.MOERunConfiguration
import org.moe.idea.utils.ModuleUtils
import org.moe.idea.utils.logger.LoggerFactory
import java.util.concurrent.TimeUnit

/**
 * A new gradle runner that uses intellij built-in gradle integrations. This will run the gradle task within
 * the Build window integration instead of using our own tool window.
 *
 * This class is very much a clone of the `GradleTasksExecutorImpl` from Android Studio:
 * https://github.com/JetBrains/android/blob/16d17317f2c44ec46e8cd2180faf9c349d381a06/android/src/com/android/tools/idea/gradle/project/build/invoker/GradleTasksExecutorImpl.java
 */
class MOEGradleRunner2(
        private val runConfig: MOERunConfiguration
) : Task.Backgroundable(
        runConfig.project,
        "Building MOE application",
        true
) {

    val taskId = ExternalSystemTaskId.create(GradleConstants.SYSTEM_ID, ExternalSystemTaskType.EXECUTE_TASK, project)

    @Volatile
    private var progressIndicator: ProgressIndicator = EmptyProgressIndicator()

    private val cancellationTokenSource: CancellationTokenSource = GradleConnector.newCancellationTokenSource()

    private val afterTasks = Sets.newLinkedHashSet<MOEAfterGradleInvocationTask>()

    override fun run(indicator: ProgressIndicator) {
        this.progressIndicator = indicator

        val result = MOEGradleInvocationResult()

        val semaphore = (CompilerManager.getInstance(project) as CompilerManagerImpl).compilationSemaphore
        var acquired = false
        try {
            try {
                while (!acquired) {
                    acquired = semaphore.tryAcquire(300, TimeUnit.MILLISECONDS)
                    if (indicator.isCanceled) {
                        // Give up obtaining the semaphore, let compile work begin in order to stop gracefully on cancel event.
                        break
                    }
                }
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
            }

            addIndicatorDelegate()

            buildProject(result)
        } finally {
            try {
                indicator.stop()
            } finally {
                if (acquired) {
                    semaphore.release()
                }
            }

            afterTasks.forEach { it.execute(result) }
        }
    }

    fun removeAfterTask(task: MOEAfterGradleInvocationTask) {
        afterTasks.remove(task)
    }

    fun addAfterTask(task: MOEAfterGradleInvocationTask) {
        afterTasks.add(task)
    }

    private fun addIndicatorDelegate() {
        if (progressIndicator is ProgressIndicatorEx) {
            val indicator = progressIndicator as ProgressIndicatorEx
            indicator.addStateDelegate(ProgressIndicatorStateDelegate(this))
        }
    }

    private fun buildProject(result: MOEGradleInvocationResult) {
        val gradleExecutionHelper = GradleExecutionHelper()
        val executionSettings = project.getOrCreateGradleExecutionSettings()

        val module = runConfig.module()
        val modulePath = ModuleUtils.getModulePath(module)

        val gradleTask = if (runConfig.runJUnitTests()) {
            "moeTest"
        } else {
            "moeLaunch"
        }

        val taskListener = object : ExternalSystemTaskNotificationListenerAdapter() {
            val buildViewManager = ServiceManager.getService(project, BuildViewManager::class.java)
            val buildEventDispatcher = ExternalSystemEventDispatcher(taskId, buildViewManager)

            override fun onStart(id: ExternalSystemTaskId, workingDir: String) {
                val eventTime = System.currentTimeMillis()
                val event = StartBuildEventImpl(DefaultBuildDescriptor(id, "Build", workingDir, eventTime), "running...")
                buildEventDispatcher.onEvent(id, event)
            }

            override fun onStatusChange(event: ExternalSystemTaskNotificationEvent) {
                when (event) {
                    is ExternalSystemBuildEvent -> {
                        buildViewManager.onEvent(event.id, event.buildEvent)
                    }
                    is ExternalSystemTaskExecutionEvent -> {
                        buildViewManager.onEvent(event.id, ExternalSystemUtil.convert(event))
                    }
                }
            }

            override fun onTaskOutput(id: ExternalSystemTaskId, text: String, stdOut: Boolean) {
                buildEventDispatcher.setStdOut(stdOut)
                buildEventDispatcher.append(text)
            }

            override fun onEnd(id: ExternalSystemTaskId) {
                buildEventDispatcher.close()
            }

            override fun onSuccess(id: ExternalSystemTaskId) {
                val event = FinishBuildEventImpl(id, null, System.currentTimeMillis(), "finished", SuccessResultImpl())
                buildEventDispatcher.onEvent(id, event)
            }

            override fun onFailure(id: ExternalSystemTaskId, e: Exception) {
                val dataProvider = BuildConsoleUtils.getDataProvider(id, buildViewManager)
                val failureResult = ExternalSystemUtil.createFailureResult("Build failed", e, GradleConstants.SYSTEM_ID, project, dataProvider)
                buildEventDispatcher.onEvent(id, FinishBuildEventImpl(id, null, System.currentTimeMillis(), "failed", failureResult))
            }

            override fun onCancel(id: ExternalSystemTaskId) {
                super.onCancel(id)
                val event = FinishBuildEventImpl(id, null, System.currentTimeMillis(), "cancelled", SkippedResultImpl())
                buildEventDispatcher.onEvent(id, event)
                buildEventDispatcher.close()
            }
        }

        try {
            gradleExecutionHelper.execute(modulePath, executionSettings,
                    taskId,
                    taskListener,
                    cancellationTokenSource
            ) { connection ->
                val executingTasksText = "Executing task '$gradleTask' in project $modulePath"
                logEvent(executingTasksText, MessageType.INFO)

                var buildError: Throwable? = null

                taskListener.onStart(taskId, modulePath)
                taskListener.onTaskOutput(taskId, "$executingTasksText${SystemProperties.getLineSeparator()}${SystemProperties.getLineSeparator()}", true)

                try {
                    val commandLineArguments = MOEGradleRunner.getCommandLineOptions(runConfig, false).toMutableList()

                    if (OPTION_PARALLEL !in commandLineArguments &&
                            CompilerWorkspaceConfiguration.getInstance(project).PARALLEL_COMPILATION) {
                        commandLineArguments.add(OPTION_PARALLEL)
                    }

                    // Don't include passwords in the log
                    var logMessage = "Build command line options: $commandLineArguments"
                    if (RemoteSettings.KEYCHAIN_PASS_PROPERTY in logMessage) {
                        val replaced = commandLineArguments.map { option ->
                            val index = option.indexOf(RemoteSettings.KEYCHAIN_PASS_PROPERTY)
                            if (index == -1) {
                                option
                            } else {
                                option.substring(0, index + RemoteSettings.KEYCHAIN_PASS_PROPERTY.length) + "**********"
                            }
                        }
                        logMessage = "Build command line options: $replaced"
                    }
                    LOGGER.info(logMessage)

                    executionSettings
                            .withArguments(commandLineArguments)
                            .passParentEnvs(true)

                    val operation = connection.newBuild()
                    GradleExecutionHelper.prepare(operation, taskId, executionSettings, object : ExternalSystemTaskNotificationListenerAdapter() {
                        override fun onStatusChange(event: ExternalSystemTaskNotificationEvent) {
                            taskListener.onStatusChange(event)
                        }

                        override fun onTaskOutput(id: ExternalSystemTaskId, text: String, stdOut: Boolean) {
                            taskListener.onTaskOutput(id, text, stdOut)
                        }
                    }, connection)

                    operation
                            .forTasks(gradleTask)
                            .withCancellationToken(cancellationTokenSource.token())
                            .run()

                    taskListener.onSuccess(taskId)
                } catch (e: Throwable) {
                    buildError = e
                } finally {
                    val e = buildError
                    if (e != null) {
                        if (e.hasCause(BuildCancelledException::class.java)) {
                            taskListener.onCancel(taskId)
                        } else {
                            val buildEnvironment = GradleExecutionHelper.getBuildEnvironment(connection, taskId, taskListener, cancellationTokenSource)
                            val projectResolverChain = GradleProjectResolver.createProjectResolverChain()
                            val userFriendlyError = projectResolverChain.getUserFriendlyError(buildEnvironment, e, modulePath, null)
                            taskListener.onFailure(taskId, userFriendlyError)
                        }

                        result.isBuildSuccessful = false
                        result.errorMessage = "Multi-OS Engine module build failed with error ${e.message}"
                    } else {
                        result.isBuildSuccessful = true
                    }

                    taskListener.onEnd(taskId)
                }
            }
        } catch (e: ExternalSystemException) {
            if (e.originalReason.startsWith("com.intellij.openapi.progress.ProcessCanceledException")) {
                LOGGER.info("Gradle execution cancelled.", e)
            } else {
                throw e
            }
        }
    }

    private fun logEvent(message: String, type: MessageType) {
        LOGGING_NOTIFICATION.createNotification(message, type).notify(project)
    }

    private class ProgressIndicatorStateDelegate(
            private val runner: MOEGradleRunner2
    ) : AbstractProgressIndicatorExBase() {

        override fun stop() {
            super.stop()
            stopAppIconProgress()
        }

        override fun cancel() {
            super.cancel()

            runner.cancellationTokenSource.cancel()

            stopAppIconProgress()
        }

        private fun stopAppIconProgress() {
            UIUtil.invokeLaterIfNeeded {
                val appIcon = AppIcon.getInstance()
                val project: Project = runner.project
                if (appIcon.hideProgress(project, APP_ICON_ID)) {
                    appIcon.setOkBadge(project, true)
                    appIcon.requestAttention(project, false)
                }
            }
        }
    }

    companion object {
        const val APP_ICON_ID = "compiler"

        val LOGGING_NOTIFICATION = NotificationGroup.logOnlyGroup("Gradle Build (Logging)")
        val BALLOON_NOTIFICATION = NotificationGroup.balloonGroup("Gradle Build (Balloon)")

        const val OPTION_PARALLEL = "--parallel"

        private val LOGGER = LoggerFactory.getLogger(MOEGradleRunner2::class.java)
    }
}