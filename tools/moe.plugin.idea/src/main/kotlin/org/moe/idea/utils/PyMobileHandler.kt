package org.moe.idea.utils

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.ModalityState
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.SystemInfo
import io.github.berstanio.pymobiledevice3.daemon.DaemonHandler
import io.github.berstanio.pymobiledevice3.ipc.PyMobileDevice3IPC
import io.github.berstanio.pymobiledevice3.venv.PyInstallationHandler
import org.moe.idea.utils.logger.LoggerFactory
import java.nio.file.Path
import java.nio.file.Paths
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PyMobileHandler {

    companion object {
        private val LOG: Logger = LoggerFactory.getLogger(PyMobileHandler::class.java)

        @Volatile
        private var instance: CompletableFuture<PyMobileDevice3IPC>? = null

        @JvmStatic
        @Synchronized
        fun ensureInitialized(project: Project, foreground: Boolean) {
            val current = instance
            if (current != null) {
                if (!current.isDone)
                    return

                try {
                    if (current.getNow(null)?.isAlive == true)
                        return
                } catch (e: Exception) {
                    LOG.warn("Previous IPC instance init failed", e)
                    // Fall through to reinitialize
                }
            }

            instance = CompletableFuture()

            val progressConfigurator: (ProgressIndicator) -> Unit = { indicator ->
                indicator.text = "Launching PyMobileDevice3 Daemon..."
                indicator.text2 = "This may take a few minutes."
                indicator.isIndeterminate = true

                try {
                    if (!DaemonHandler.isDaemonRunning()) {
                        LOG.debug("IPC Daemon not running - starting")
                        val ownedDir: Path
                        if (SystemInfo.isWindows) {
                            val localAppData = System.getenv("LOCALAPPDATA")
                            ownedDir = if (localAppData != null) {
                                Paths.get(localAppData, "JavaPyMobileDevice3")
                            } else {
                                // Fallback
                                Paths.get(
                                    System.getProperty("user.home"),
                                    "AppData",
                                    "Local",
                                    "JavaPyMobileDevice3"
                                )
                            }
                        } else {
                            // Unix/Mac
                            ownedDir = Paths.get(System.getProperty("user.home"), ".javapymobiledevice3")
                        }

                        val installDir = ownedDir.resolve("daemon-" + PyMobileDevice3IPC.PROTOCOL_VERSION).toFile()

                        val installation = PyInstallationHandler.install(installDir)
                        DaemonHandler.startDaemon(installation)
                        LOG.debug("Started IPC Daemon in {}", installation.pythonHome)
                    }

                    val ipc = PyMobileDevice3IPC()
                    instance!!.complete(ipc)
                } catch (e: Exception) {
                    LOG.error("Failed to launch PyMobileDevice3 daemon", e)
                    instance!!.completeExceptionally(e)
                    Notifications.Bus.notify(
                        Notification(
                            "PyMobileDevice3 Daemon Launch",
                            "PyMobileDevice3 Daemon Error",
                            "Failed to start daemon: ${e.message}",
                            NotificationType.ERROR
                        ),
                        project
                    )
                }
            }

            val task = if (foreground) {
                object : Task.Modal(project, "Launching PyMobileDevice3 Daemon...", false) {
                    override fun run(indicator: ProgressIndicator) {
                        progressConfigurator(indicator)
                    }
                }
            } else {
                object : Task.Backgroundable(project, "Launching PyMobileDevice3 Daemon...", false) {
                    override fun run(indicator: ProgressIndicator) {
                        progressConfigurator(indicator)
                    }
                }
            }

            ProgressManager.getInstance().run(task)
        }

        @JvmStatic
        fun <T> invokeOnUIThread(project: Project,
            runnable: (PyMobileDevice3IPC) -> CompletableFuture<T>,
            onUIThread: Consumer<T>,
            onError: Consumer<Throwable>
        ) {
            ensureInitialized(project, true)
            instance!!.thenComposeAsync(runnable)
                .thenAccept { result ->
                    ApplicationManager.getApplication().invokeLater(
                        { onUIThread.accept(result) },
                        ModalityState.any()
                    )
                }
                .exceptionally { e ->
                    LOG.warn("IPC Daemon execution failed", e)
                    onError.accept(e)
                    null
                }
        }
    }
}