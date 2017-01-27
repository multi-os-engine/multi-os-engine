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

import org.moe.common.Port;
import org.moe.common.ProxyPort;
import org.moe.common.ShutdownManager;
import org.moe.common.macho.MachoFile;
import org.moe.common.utils.ProxyUtil;
import org.moe.ios.device.ConnectionHelper;
import org.moe.ios.device.ConnectionInputStream;
import org.moe.ios.device.ConnectionLock;
import org.moe.ios.device.ConnectionOutputStream;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.protocol.gdbremote.GDBRemoteProtocol;
import org.moe.protocol.gdbremote.IStopReplyListener;
import org.libimobiledevice.enums.debugserver_error_t;
import org.libimobiledevice.enums.idevice_error_t;
import org.libimobiledevice.opaque.debugserver_client_t;
import org.libimobiledevice.opaque.idevice_t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.libimobiledevice.c.Globals.*;

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
     * Cached device UDID.
     */
    private final String udid;

    /**
     * Device.
     */
    private final idevice_t device;

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
     */
    private LaunchHelper(idevice_t device, String appPath, Configuration config) throws DeviceException {
        this.device = device;
        this.config = config;
        Ptr<BytePtr> udidRef = (Ptr<BytePtr>) PtrFactory.newPointerPtr(Byte.class, 2, 1, true, false);
        if (idevice_get_udid(device, udidRef) != idevice_error_t.IDEVICE_E_SUCCESS) {
            throw new DeviceException("Failed to get device UDID from device");
        }
        this.udid = udidRef.get().toASCIIString();
        this.appPath = appPath;
        this.launchArgs = config.getLaunchArgs();
        this.envVars = config.getEnvVars();
        this.proxyPorts = config.getProxyPorts();
        this.debugPort = config.getJdwpPort();
        this.stdOutPort = config.getStdOutPort();
    }

    /**
     * Launch an application on the specified device
     *
     * @param device  device
     * @param appPath application path on device
     * @param config  configuration
     * @throws DeviceException
     */
    public static void launch(idevice_t device, String appPath, Configuration config) throws DeviceException {
        if (Configuration.INSTALL_MODE_INSTALL_ONLY.equals(config.getInstallMode()) ||
                Configuration.INSTALL_MODE_UPGRADE_ONLY.equals(config.getInstallMode())) {
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
     * Creates a new debug server client.
     *
     * @param device device
     * @return new debug server client
     * @throws DeviceException If an error occurred
     */
    private static debugserver_client_t getDebugServer(idevice_t device) throws DeviceException {
        Ptr<debugserver_client_t> client_ptr = PtrFactory.newOpaquePtrReference(debugserver_client_t.class);
        int err = debugserver_client_start_service(device, client_ptr, null);

        if (err != debugserver_error_t.DEBUGSERVER_E_SUCCESS) {
            throw new DeviceException("Failed to get debug server", "debugserver_error_t", err);
        }

        return client_ptr.get();
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
                    HashMap<String, Object> plistData = PlistHelper.readFromFile(plist);
                    if (plistData != null) {
                        execName = (String) plistData.get("CFBundleExecutable");
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

                ShutdownManager.registerPost(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            stdFileOutput.close();
                        } catch (IOException ignore) {

                        }
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

                ShutdownManager.registerPost(new Runnable() {
                    @Override
                    public void run() {
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
                    }
                });
            } catch (IOException e) {
                throw new DeviceException("Failed to create standard stream forwarding", e);
            }
        }

        debugserver_client_t debugServer = getDebugServer(device);

        DebugserverProxy proxy = null;
        Socket sockProxy = null;
        InputStream is = null;
        OutputStream os = null;
        if(config.getDebugserverPort() != null){
            proxy = DebugserverProxy.create(debugServer, config.getDebugserverPort().getLocalPort());
            try {
                sockProxy = new Socket("localhost", config.getDebugserverPort().getLocalPort());
                sockProxy.setReuseAddress(true);
                is = sockProxy.getInputStream();
                os = sockProxy.getOutputStream();
            } catch(Exception e) {
                System.out.println("SERVER----error on socket!");
                try{
                    if(is != null)
                        is.close();
                } catch (IOException ignore){
                    //ignore
                }
                try{
                    if(os != null)
                        os.close();
                } catch (IOException ignore){
                    //ignore
                }
                try{
                    if(sockProxy != null)
                        sockProxy.close();
                } catch (IOException ignore){
                    //ignore
                }
                if(proxy!=null){
                    proxy.waitFor();
                    proxy.stop();
                }
                return false;
            }
        }

        ConnectionLock dscisLock = new ConnectionLock();
        ConnectionLock dscosLock = new ConnectionLock();
        ConnectionInputStream<debugserver_client_t> dscis = ConnectionHelper.getInputStream(debugServer, dscisLock);
        ConnectionOutputStream<debugserver_client_t> dscos = ConnectionHelper.getOutputStream(debugServer, dscosLock);
        try {
            try {
                if(config.getDebugserverPort()!=null){
                    protocol = new GDBRemoteProtocol(is, os);
                    protocol.addListener(this);
                } else {
                    protocol = new GDBRemoteProtocol(dscis, dscos);
                    protocol.addListener(this);
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
                if ("Locked".equals(query_launchSuccess)) {
                    if (isFirstTry) {
                        LOG.info("Please unlock your device");
                    }
                    return true;
                }
                if (query_launchSuccess != null) {
                    if(config.getDebugserverPort()!=null){
                        protocol.close();
                        try{
                            if(is != null)
                            is.close();
                        } catch (IOException e){
                            //ignore
                        }
                        try{
                            if(os != null)
                            os.close();
                        } catch (IOException e){
                            //ignore
                        }
                        try{
                            if(sockProxy != null)
                                sockProxy.close();
                        } catch (IOException e){
                            //ignore
                        }
                        if(proxy!=null){
                            proxy.waitFor();
                            proxy.stop();
                        }
                    }
                    throw new DeviceException("Failed to launch application on device: " + query_launchSuccess);
                }

                if(config.getDebugserverPort()!=null){
                    protocol.close();
                    try{
                        if(is != null)
                            is.close();
                    } catch (IOException e){
                        //ignore
                    }
                    try{
                        if(os != null)
                            os.close();
                    } catch (IOException e){
                        //ignore
                    }
                    try{
                        if(sockProxy != null)
                            sockProxy.close();
                    } catch (IOException e){
                        //ignore
                    }
                    if(proxy!=null){
                        proxy.waitFor();
                        proxy.stop();
                    }
                    proxy = DebugserverProxy.create(debugServer, config.getDebugserverPort().getLocalPort());
                } else{
                    // Continue app
                    protocol.send_vCont(GDBRemoteProtocol.VCONT_ACTION_CONTINUE,
                        GDBRemoteProtocol.THREAD_ID_ANY);
                }

                if (debugPort != null) {
                    LOG.debug("Starting debug server: " + debugPort);
                    ProxyHelper.createProxyServer(debugPort, device, shuttingDown);
                }
                for (ProxyPort port : proxyPorts) {
                    LOG.debug("Starting proxy server: " + port);
                    ProxyHelper.createProxyServer(port, device, shuttingDown);
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

                USBDeviceWatcher.IUSBDeviceListener listener = new USBDeviceWatcher.IUSBDeviceListener() {
                    @Override
                    public void handle(int event, String deviceUDID) {
                        if (deviceUDID.equals(udid) &&
                                event == DeviceHelper.CONN_EVENT_REMOVE) {
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
            dscisLock.lockAndClose();
            dscosLock.lockAndClose();
            try{
                if(is != null)
                    is.close();
            } catch (IOException e){
                //ignore
            }
            try{
                if(os != null)
                    os.close();
            } catch (IOException e){
                //ignore
            }
            try{
                if(sockProxy != null)
                    sockProxy.close();
            } catch (IOException e){
                //ignore
            }
            if(proxy != null) {
                proxy.waitFor();
                proxy.stop();
            }
            debugserver_client_free(debugServer);
            dscisLock.unlock();
            dscosLock.unlock();
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
