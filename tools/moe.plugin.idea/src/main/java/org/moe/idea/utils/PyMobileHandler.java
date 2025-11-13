package org.moe.idea.utils;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.SystemInfo;
import io.github.berstanio.pymobiledevice3.daemon.DaemonHandler;
import io.github.berstanio.pymobiledevice3.ipc.PyMobileDevice3IPC;
import io.github.berstanio.pymobiledevice3.venv.PyInstallation;
import io.github.berstanio.pymobiledevice3.venv.PyInstallationHandler;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;

public class PyMobileHandler {

    private static final Logger LOG = LoggerFactory.getLogger(PyMobileHandler.class);

    private static Future<PyMobileDevice3IPC> instance;

    public static  <T> void invokeOnUIThread(Function<PyMobileDevice3IPC, CompletableFuture<T>> runnable, Consumer<T> onUIThread, Consumer<Throwable> onError) {
        if (instance == null)
        {
            instance = ApplicationManager.getApplication().executeOnPooledThread(() -> {
                try {
                    if (!DaemonHandler.isDaemonRunning())
                    {
                        LOG.debug("IPC Daemon not running - starting");
                        Path ownedDir;
                        if (SystemInfo.isWindows) {
                            String localAppData = System.getenv("LOCALAPPDATA");
                            if (localAppData != null) {
                                ownedDir = Paths.get(localAppData, "JavaPyMobileDevice3");
                            } else {
                                // Fallback
                                ownedDir = Paths.get(System.getProperty("user.home"), "AppData", "Local", "JavaPyMobileDevice3");
                            }
                        } else {
                            // Unix/Mac
                            ownedDir = Paths.get(System.getProperty("user.home"), ".javapymobiledevice3");
                        }

                        File installDir = ownedDir.resolve("daemon-" + PyMobileDevice3IPC.PROTOCOL_VERSION).toFile();

                        PyInstallation installation = PyInstallationHandler.install(installDir);
                        DaemonHandler.startDaemon(installation);
                        LOG.debug("Started IPC Daemon in {}", installation.getVEnv());
                    }

                    return new PyMobileDevice3IPC();
                } catch (Exception e) {
                    onError.accept(e);
                    throw e;
                }
            });
        }

        ApplicationManager.getApplication().executeOnPooledThread(() -> {
            try {
                PyMobileDevice3IPC ipc = instance.get();
                CompletableFuture<T> future = runnable.apply(ipc);
                T result = future.get();
                ApplicationManager.getApplication().invokeLater(() -> onUIThread.accept(result), ModalityState.any());
            } catch (Exception e) {
                LOG.warn("IPC Daemon execution failed", e);
                onError.accept(e);
            }
        });
    }
}
