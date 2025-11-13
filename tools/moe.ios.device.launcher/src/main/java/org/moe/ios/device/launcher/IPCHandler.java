package org.moe.ios.device.launcher;

import io.github.berstanio.pymobiledevice3.ipc.PyMobileDevice3IPC;
import org.moe.common.ShutdownManager;

import java.io.IOException;

public class IPCHandler {
    private static PyMobileDevice3IPC instance;

    public static void init()
    {
        try {
            instance = new PyMobileDevice3IPC();
            ShutdownManager.register(instance::close);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PyMobileDevice3IPC getInstance() {
        if (instance == null)
            throw new IllegalStateException("IPCHandler has not been initialized");
        return instance;
    }
}
