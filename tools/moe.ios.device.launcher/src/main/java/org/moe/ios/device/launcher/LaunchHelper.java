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

package org.moe.ios.device.launcher;

import io.github.berstanio.pymobiledevice3.data.DebugServerConnection;
import io.github.berstanio.pymobiledevice3.data.DeviceInfo;
import io.github.berstanio.pymobiledevice3.data.DeviceListener;
import org.json.JSONObject;
import org.moe.common.Port;
import org.moe.common.ProxyPort;
import org.moe.common.ShutdownManager;
import org.moe.common.macho.MachoFile;
import org.moe.common.utils.ProxyUtil;
import org.moe.protocol.gdbremote.GDBRemoteProtocol;
import org.moe.protocol.gdbremote.IStopReplyListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * iOS Device application launch helper.
 */
@SuppressWarnings("unchecked")
public class LaunchHelper implements IStopReplyListener {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(LaunchHelper.class);

    /**
     * Device.
     */
    private final DeviceInfo device;

    /**
     * Configuration.
     */
    private final Configuration config;

    /**
     * Application path.
     */
    private final String appPath;

    /**
     * Launcher arguments.
     */
    private final ArrayList<String> launchArgs;

    /**
     * Proxy ports.
     */
    private final ArrayList<ProxyPort> proxyPorts;

    /**
     * JDWP proxy port.
     */
    private final ProxyPort debugPort;

    /**
     * Process lock.
     */
    private final Lock processLock = new ReentrantLock();
    /**
     * Process ended condition.
     */
    private final Condition processEnded = processLock.newCondition();
    /**
     * Thread-safe boolean for shutdown flag.
     */
    private final AtomicBoolean shuttingDown = new AtomicBoolean(false);
    /**
     * STD out port.
     */
    private final Port stdOutPort;
    /**
     * Map for env vars.
     */
    private final HashMap<String, String> envVars;
    /**
     * GDB remote protocol.
     */
    private GDBRemoteProtocol protocol;
    /**
     * STD forwarder pipe.
     */
    private PipedOutputStream stdPipeOutput;
    /**
     * STD forwarder file.
     */
    private FileOutputStream stdFileOutput;

    /**
     * Creates a new LaunchHelper instance.
     *
     * @param device  device
     * @param appPath application path on device
     * @param config  configuration
     * @throws DeviceException if a device error occurs
     */
    private LaunchHelper(DeviceInfo device, String appPath, Configuration config) throws DeviceException {
        this.device = device;
        this.config = config;
        this.appPath = appPath;
        this.launchArgs = config.getLaunchArgs();
        this.envVars = config.getEnvVars();
        this.proxyPorts = config.getProxyPorts();
        this.debugPort = config.getJdwpPort();
        this.stdOutPort = config.getStdOutPort();
    }

    /**
     * Launch an application on the specified device.
     *
     * @param device  device
     * @param appPath application path on device
     * @param config  configuration
     * @throws DeviceException if a device error occurs
     */
    public static void launch(DeviceInfo device, String appPath, Configuration config) throws DeviceException {
        if (Configuration.INSTALL_MODE_INSTALL_ONLY.equals(config.getInstallMode())
                || Configuration.INSTALL_MODE_UPGRADE_ONLY.equals(config.getInstallMode())) {
            return;
        }
        try {
            boolean isFirstTry = true;
            while (true) {
                LaunchHelper runHelper = new LaunchHelper(device, appPath, config);
                if (runHelper.launch(isFirstTry)) {
                    isFirstTry = false;
                    Thread.sleep(500);
                } else {
                    break;
                }
            }
        } catch (InterruptedException e) {
            LOG.debug("Sleep interrupted", e);
        }
    }

    /**
     * Launch the application on the device.
     *
     * @param isFirstTry tells whether or not this is the fist attempt to launch
     * @return Returns whether or not to retry the launching.
     * @throws DeviceException If an error occurred
     */
    private boolean launch(boolean isFirstTry) throws DeviceException {
        if (isFirstTry) {
            Main.PRINT_CONTROL("Launching:");
        }

        // Get supported archs
        List<String> cpuTypes = null;
        try {
            File file = config.getApplicationPath();
            String filename = file.getName();
            if (filename.endsWith(".app")) {
                String execName = null;
                try {
                    File plist = new File(file, "Info.plist");
                    JSONObject plistData = IPCHandler.getInstance().decodePList(plist).join();
                    if (plistData != null) {
                        execName = plistData.getString("CFBundleExecutable");
                    }
                } catch (Exception ignore) {
                    // Ignore
                }
                if (execName == null) {
                    execName = filename.substring(0, filename.length() - 4);
                }

                file = new File(file, execName);
            }
            cpuTypes = MachoFile.getRecognizedCPUTypes(file);
        } catch (Exception e) {
            throw new DeviceException("Failed to get CPU types from application", e);
        }

        if (config.getStdOutFile() != null) {
            try {
                stdFileOutput = new FileOutputStream(config.getStdOutFile());

                ShutdownManager.registerPost(() -> {
                    try {
                        stdFileOutput.close();
                    } catch (IOException ignore) {

                    }
                });
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Failed to create standard stream forwarding", e);
            }
        }
        if (stdOutPort != null) {
            try {
                stdPipeOutput = new PipedOutputStream();
                final PipedInputStream pipedInputStream = new PipedInputStream(stdPipeOutput);
                ProxyUtil proxy = ProxyUtil.create(stdOutPort.getPort(), pipedInputStream, new OutputStream() {
                    @Override
                    public void write(int b) throws IOException {
                        // Leave empty
                    }
                });
                proxy.registerShutdownHook();

                ShutdownManager.registerPost(() -> {
                    try {
                        stdPipeOutput.flush();
                    } catch (IOException ignore) {

                    }
                    try {
                        stdPipeOutput.close();
                    } catch (IOException ignore) {

                    }
                    try {
                        pipedInputStream.close();
                    } catch (IOException ignore) {

                    }
                });
            } catch (IOException e) {
                throw new DeviceException("Failed to create standard stream forwarding", e);
            }
        }

        int port = 0;
        if (config.getDebugserverPort() != null)
            port = config.getDebugserverPort().getLocalPort();
        DebugServerConnection debugServer = IPCHandler.getInstance().debugServerConnect(device, port).join();

        Socket sockProxy = null;
        InputStream is = null;
        OutputStream os;
        try {
            sockProxy = new Socket(debugServer.getHostname(), debugServer.getPort());
            sockProxy.setReuseAddress(true);
            is = sockProxy.getInputStream();
            os = sockProxy.getOutputStream();
        } catch (Exception e) {
            System.out.println("SERVER----error on socket!");
            try {
                if (is != null) is.close();
            } catch (IOException ignore) {
                //ignore
            }
            try {
                if (sockProxy != null) sockProxy.close();
            } catch (IOException ignore) {
                //ignore
            }
            return false;
        }

        try {
            try {
                protocol = new GDBRemoteProtocol(is, os);
                protocol.addListener(this);
                if (config.getDebugserverPort() == null) {
                    protocol.set_StartNoAckMode();
                }

                String cpuTypeString = protocol.query_HostInfo().get("cputype");
                if (cpuTypeString != null) {
                    try {
                        int cpuType = Integer.parseInt(cpuTypeString);
                        String cpuName = MachoFile.getCPUName(cpuType);
                        if (MachoFile.CPU_NAME_ARM64.equals(cpuName) && !cpuTypes.contains(cpuName)) {
                            // Downgrade to arm
                            protocol.set_LaunchArch(GDBRemoteProtocol.LAUNCH_ARCH_ARM);
                        }
                    } catch (NumberFormatException ignore) {
                        // ignore
                    }
                }

                // https://github.com/llvm/llvm-project/blob/7ad854c41e2b08b8cd6aae1d3b6f22125512585b/lldb/source/Plugins/Platform/MacOSX/PlatformDarwin.cpp#L1719-L1721
                // > We want to make sure that OS_ACTIVITY_DT_MODE is set so that we get
                //   os_log and NSLog messages mirrored to the target process stderr.
                // which will then be streamed to the stdout of this application, and finally
                // get displayed in Android Studio run window. This ensures the app crash information
                // are displayed as well.
                protocol.set_EnvironmentHexEncoded("NSUnbufferedIO", "YES");
                protocol.set_EnvironmentHexEncoded("OS_ACTIVITY_MODE", "enable");
                protocol.set_EnvironmentHexEncoded("OS_ACTIVITY_DT_MODE", "enable");

                // Pass env vars
                for (Map.Entry<String, String> next : envVars.entrySet()) {
                    protocol.set_EnvironmentHexEncoded(next.getKey(), next.getValue());
                }

                // Pass args
                ArrayList<String> _args = new ArrayList<String>();
                _args.add(appPath);
                if (debugPort != null) {
                    _args.add("-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=" + debugPort.getRemotePort());
                }
                _args.addAll(launchArgs);
                String args_arr[] = new String[_args.size()];
                protocol.send_Arguments(_args.toArray(args_arr));

                // Check launch success
                String query_launchSuccess = protocol.query_LaunchSuccess();
                if (query_launchSuccess != null) {
                    if ("Locked".equals(query_launchSuccess)
                            || query_launchSuccess.contains("the device was not, or could not be, unlocked")) {
                        if (isFirstTry) {
                            LOG.info("Please unlock your device");
                        }
                        return true;
                    }

                    if (config.getDebugserverPort() != null) {
                        protocol.close();
                        try {
                            if (is != null) is.close();
                        } catch (IOException e) {
                            //ignore
                        }
                        try {
                            if (os != null) os.close();
                        } catch (IOException e) {
                            //ignore
                        }
                        try {
                            sockProxy.close();
                        } catch (IOException e) {
                            //ignore
                        }
                    }
                    throw new DeviceException("Failed to launch application on device: " + query_launchSuccess);
                }

                if (config.getDebugserverPort() != null) {
                    protocol.close();
                    try {
                        if (is != null) is.close();
                    } catch (IOException e) {
                        //ignore
                    }
                    try {
                        if (os != null) os.close();
                    } catch (IOException e) {
                        //ignore
                    }
                    try {
                        sockProxy.close();
                    } catch (IOException e) {
                        //ignore
                    }
                } else {
                    // Continue app
                    protocol.send_vCont(GDBRemoteProtocol.VCONT_ACTION_CONTINUE, GDBRemoteProtocol.THREAD_ID_ANY);
                }

                if (debugPort != null) {
                    LOG.debug("Starting debug server: " + debugPort);
                    ProxyHelper.createProxyServer(debugPort, device, shuttingDown);
                }
                for (ProxyPort proxyPort : proxyPorts) {
                    LOG.debug("Starting proxy server: " + proxyPort);
                    ProxyHelper.createProxyServer(proxyPort, device, shuttingDown);
                }

                final Thread waitingThread = Thread.currentThread();
                ShutdownManager.register(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            protocol.send_ctrl_C();
                            // TODO: this sleep is just a workaround, there is possibly a better fix for this
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            protocol.send_k();
                            try {
                                waitingThread.join(5000);
                            } catch (InterruptedException e) {
                                LOG.debug("Waiting for main thread failed");
                            }
                        } catch (IOException ignore) {
                            // Ignore
                        }
                    }
                });

                DeviceListener listener = new DeviceListener() {
                    @Override
                    public void deviceAdded(String s) {

                    }

                    @Override
                    public void deviceRemoved(String deviceUDID) {
                        if (deviceUDID.equals(device.getUniqueDeviceId())) {
                            signalProcessEnded(false);
                        }
                    }
                };
                USBDeviceWatcher.register(listener);

                LOG.debug("Waiting for process end");
                waitForProcessEnd();
                LOG.debug("Process ended");

                // Unregister device listeners
                USBDeviceWatcher.unregister(listener);
            } catch (IOException e) {
                throw new DeviceException("An exception occurred during launch " + e.getMessage());
            }
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                //ignore
            }
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                //ignore
            }
            try {
                sockProxy.close();
            } catch (IOException e) {
                //ignore
            }

            IPCHandler.getInstance().debugServerClose(debugServer).join();
        }
        return false;
    }

    @Override
    public void processSignaled(byte signal, Map<String, String> info) {
        LOG.debug("processSignaled");

        try {
            protocol.send_k();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processExited(byte status) {
        LOG.debug("processExited");
        signalProcessEnded(true);

    }

    @Override
    public void processTerminated(byte status) {
        LOG.debug("processTerminated");
        signalProcessEnded(false);
    }

    @Override
    public void processOutput(String output) {
        LOG.debug("processOutput");
        if (stdPipeOutput != null) {
            try {
                stdPipeOutput.write(output.getBytes());
            } catch (IOException e) {
                LOG.error("Failed to pipe std output " + output);
            }
        }
        if (stdFileOutput != null) {
            try {
                stdFileOutput.write(output.getBytes());
            } catch (IOException e) {
                LOG.error("Failed to write standard stream");
            }
        }
        System.out.print(output);
    }

    /**
     * Signals the process end condition.
     *
     * @param exited true if exited, otherwise false
     */
    private void signalProcessEnded(boolean exited) {
        processLock.lock();
        try {
            processEnded.signal();
            shuttingDown.set(true);
        } finally {
            processLock.unlock();
        }
    }

    /**
     * Waits for the process end condition.
     */
    private void waitForProcessEnd() {
        processLock.lock();
        try {
            try {
                processEnded.await();
            } catch (InterruptedException e) {
                try {
                    protocol.send_ctrl_C();
                    // TODO: this sleep is just a workaround, there is possibly a better fix for this
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    protocol.send_k();
                } catch (IOException ignore) {
                    // Ignore
                }
                LOG.debug("wait for process end interrupted");
            }
            // Wait for one sec, so streams can finish
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
                // Ignore
            }
        } finally {
            processLock.unlock();
        }
    }
}
