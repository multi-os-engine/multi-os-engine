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

import org.libimobiledevice.enums.afc_error_t;
import org.libimobiledevice.enums.afc_file_mode_t;
import org.libimobiledevice.enums.instproxy_error_t;
import org.libimobiledevice.opaque.afc_client_t;
import org.libimobiledevice.opaque.idevice_t;
import org.libimobiledevice.opaque.instproxy_client_t;
import org.libplist.opaque.plist_t;
import org.moe.common.utils.CloseableUtil;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.libimobiledevice.c.Globals.*;

/**
 * iOS Device Upload and Install helper.
 */
@SuppressWarnings("unchecked")
final class InstallHelper {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(InstallHelper.class);

    /**
     * Constant for file upload operation.
     */
    private static final String FILE_UPLOAD = "FileUpload";
    /**
     * Constant for public staging directory name.
     */
    private static final String PKG_PATH = "PublicStaging";

    /**
     * Device.
     */
    private final idevice_t device;
    /**
     * Path to .app file.
     */
    private final File appPath;
    /**
     * Lock for installation.
     */
    private final Lock installLock = new ReentrantLock();
    /**
     * Condition for installation ended.
     */
    private final Condition installEnded = installLock.newCondition();
    /**
     * Installation mode.
     */
    private String installMode;
    /**
     * Error message.
     */
    private String errorMessage;

    /**
     * Number of files to upload.
     */
    private int numberOfFilesToUpload = 0;
    /**
     * Number of files successfully uploaded.
     */
    private int numberOfFilesUploaded = 0;

    /**
     * Creates a new InstallHelper instance.
     *
     * @param device device
     * @param config configuration
     */
    private InstallHelper(idevice_t device, Configuration config) {
        if (device == null || config == null || config.getApplicationPath() == null
                || config.getInstallMode() == null) {
            throw new NullPointerException();
        }
        this.device = device;
        this.appPath = config.getApplicationPath();
        this.installMode = config.getInstallMode();
    }

    /**
     * Installs an application on the specified device and install mode.
     *
     * @param device device
     * @param config configuration
     * @return path to the application on the device
     * @throws DeviceException if installation fails
     */
    public static String uploadAndInstall(idevice_t device, Configuration config) throws DeviceException {
        InstallHelper installHelper = new InstallHelper(device, config);
        return installHelper.run();
    }

    /**
     * Starts the installation process.
     *
     * @return path to the application on the device
     * @throws DeviceException if a device error occurs
     */
    private String run() throws DeviceException {
        LOG.debug("Starting installation");
        instproxy_client_t ip = initInstProxy();
        try {
            afc_client_t afc = initAFCCient();
            try {
                if (!Configuration.INSTALL_MODE_RUN_ONLY.equals(installMode)) {
                    createPkgPath(afc);

                    numberOfFilesToUpload = getFileCount(appPath.getAbsolutePath());
                    String target = PKG_PATH + "/" + appPath.getName();
                    Main.PRINT_CONTROL("Uploading:");
                    uploadDirectory(afc, appPath.getAbsolutePath(), target);
                    Main.PRINT_CONTROL("");

                    Main.PRINT_CONTROL("Installing:");
                    install(ip, target);
                    Main.PRINT_CONTROL("");

                    if (errorMessage != null) {
                        throw new DeviceException("Failed to " + installMode + " on device, " + errorMessage);
                    }
                }
            } finally {
                afc_client_free(afc);
            }

            String bundleid;
            try {
                HashMap<String, Object> plist = PlistHelper.readFromFile(new File(appPath, "Info.plist"));
                if (plist == null) {
                    throw new NullPointerException();
                }
                bundleid = (String)plist.get("CFBundleIdentifier");
            } catch (Exception ex) {
                throw new DeviceException("Failed to get bundle ID: " + ex.getMessage());
            }

            Ptr<BytePtr> pathRef = (Ptr<BytePtr>)PtrFactory.newPointerPtr(Byte.class, 2, 1, true, false);
            int err = instproxy_client_get_path_for_bundle_identifier(ip, bundleid, pathRef);
            if (err != instproxy_error_t.INSTPROXY_E_SUCCESS) {
                throw new DeviceException("Failed to get application path",
                        "instproxy_client_get_path_for_bundle_identifier", err);
            }

            return pathRef.get().toUTF8String();
        } finally {
            instproxy_client_free(ip);
        }
    }

    /**
     * Creates a new installation proxy client.
     *
     * @return new installation proxy client
     * @throws DeviceException If client creation failed
     */
    private instproxy_client_t initInstProxy() throws DeviceException {
        LOG.debug("Creating installation proxy client");

        // Get installation proxy
        Ptr<instproxy_client_t> client_ptr = PtrFactory.newOpaquePtrReference(instproxy_client_t.class);

        int err = instproxy_client_start_service(device, client_ptr, null);
        if (err != instproxy_error_t.INSTPROXY_E_SUCCESS) {
            throw new DeviceException("Failed to get installation proxy", "instproxy_client_start_service", err);
        }

        return client_ptr.get();
    }

    /**
     * Creates a new afc client.
     *
     * @return new afc client
     * @throws DeviceException If client creation failed
     */
    private afc_client_t initAFCCient() throws DeviceException {
        LOG.debug("Creating afc client");

        // Get installation proxy
        Ptr<afc_client_t> client_ptr = PtrFactory.newOpaquePtrReference(afc_client_t.class);

        int err = afc_client_start_service(device, client_ptr, null);
        if (err != afc_error_t.AFC_E_SUCCESS) {
            throw new DeviceException("Failed to get installation proxy", "afc_client_start_service", err);
        }

        return client_ptr.get();
    }

    /**
     * Prepares the staging directory for the app.
     *
     * @param afc afc client
     * @throws DeviceException if a device error occurs
     */
    private void createPkgPath(afc_client_t afc) throws DeviceException {
        LOG.debug("Preparing staging directory");

        // Check staging directory existence
        Ptr<Ptr<BytePtr>> infolist_ref = (Ptr<Ptr<BytePtr>>)PtrFactory.newPointerPtr(Byte.class, 3, 1, true, false);
        int err = afc_get_file_info(afc, PKG_PATH, infolist_ref);

        // Free results
        Ptr<BytePtr> infolist = infolist_ref.get();
        if (infolist != null) {
            BytePtr ptr;
            int idx = 0;
            while ((ptr = infolist.get(idx++)) != null) {
                ptr.free();
            }
            infolist.free();
        }

        // The directory does not exist, create it
        if (err == afc_error_t.AFC_E_OBJECT_NOT_FOUND) {
            err = afc_make_directory(afc, PKG_PATH);
            if (err != afc_error_t.AFC_E_SUCCESS) {
                throw new DeviceException("Failed to make directory on device", "afc_make_directory", err);
            }
            return;
        }

        // An error occurred other then AFC_E_OBJECT_NOT_FOUND
        if (err != afc_error_t.AFC_E_SUCCESS) {
            throw new DeviceException("Failed to get file info", "afc_get_file_info", err);
        }
    }

    /**
     * Returns the number of files in a directory (recursively).
     *
     * @param source directory path
     * @return number of files
     */
    private int getFileCount(String source) {
        File local = new File(source);
        String contents[] = local.list();

        int count = 0;

        if (contents != null) {

            for (String content : contents) {
                File elem = new File(local, content);

                if (elem.isDirectory()) {
                    count += getFileCount(elem.getAbsolutePath());
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Uploads a directory on the local drive to the target device.
     *
     * @param afc    afc client
     * @param source source path
     * @param target target path
     * @throws DeviceException if a device error occurs
     */
    private void uploadDirectory(afc_client_t afc, String source, String target) throws DeviceException {
        int err = afc_make_directory(afc, target);
        if (err != afc_error_t.AFC_E_SUCCESS) {
            throw new DeviceException("Failed to make directory on device", "afc_make_directory", err);
        }

        File local = new File(source);
        String contents[] = local.list();

        if (contents != null) {
            for (String content : contents) {
                File elem = new File(local, content);

                if (elem.isDirectory()) {
                    uploadDirectory(afc, elem.getAbsolutePath(), target + "/" + elem.getName());
                } else {
                    uploadFile(afc, elem.getAbsolutePath(), target + "/" + elem.getName());
                }
            }
        }
    }

    /**
     * Uploads a file on the local drive to the target device.
     *
     * @param afc    afc client
     * @param source source path
     * @param target target path
     * @throws DeviceException if a device error occurs
     */
    @SuppressWarnings("resource")
    private void uploadFile(afc_client_t afc, String source, String target) throws DeviceException {
        // Create a 1MB buffer for the files
        final int bufferSize = 1024 * 1024;

        // Open source file
        final File local = new File(source);
        final FileInputStream fis;
        try {
            fis = new FileInputStream(local);
        } catch (FileNotFoundException e) {
            throw new DeviceException("failed to open file for upload " + source);
        }

        try {
            final InputStream is = new BufferedInputStream(fis, bufferSize);
            // Get handle for target file
            LongPtr handle_ref = PtrFactory.newLongReference();
            int err = afc_file_open(afc, target, afc_file_mode_t.AFC_FOPEN_WRONLY, handle_ref);
            if (err != afc_error_t.AFC_E_SUCCESS) {
                // Clean up
                CloseableUtil.tryClose(is, LOG, "Failed to close input stream for " + source);
                throw new DeviceException("Failed to open file on device", "afc_file_open", err);
            }
            long targetFileHandle = handle_ref.getValue();
            try {
                // Create buffers
                byte jbuffer[] = new byte[bufferSize];
                BytePtr nbuffer = PtrFactory.newByteArray(bufferSize);

                // Helper
                IntPtr bytesWritten = PtrFactory.newIntReference();

                // Transmit data
                int read;
                while ((read = is.read(jbuffer)) != -1) {
                    nbuffer.copyFrom(jbuffer);

                    // Write file to target
                    err = afc_file_write(afc, targetFileHandle, nbuffer, read, bytesWritten);
                    if (err != afc_error_t.AFC_E_SUCCESS) {
                        throw new DeviceException("Failed to write file on device", "afc_file_write", err);
                    }
                    if (read != bytesWritten.getValue()) {
                        throw new DeviceException(
                                "file writing to device failed, wrote " + bytesWritten.getValue() + " bytes instead of "
                                        + read);
                    }
                }
            } catch (Exception e) {
                throw new DeviceException("Writing file to device failed", e);
            } finally {
                // Clean up
                CloseableUtil.tryClose(is, LOG, "Failed to close input stream for " + source);
                afc_file_close(afc, targetFileHandle);
            }

            numberOfFilesUploaded++;
            updateProgress(FILE_UPLOAD, local.getName(), numberOfFilesUploaded * 100 / numberOfFilesToUpload);
        } finally {
            try {
                fis.close();
            } catch (IOException ignore) {

            }
        }
    }

    /**
     * Installs an application specified by the job.
     *
     * @param ip     installation proxy
     * @param target target app path
     */
    private void install(instproxy_client_t ip, String target) {
        installLock.lock();
        plist_t options = instproxy_client_options_new();
        instproxy_client_option_add(options, "PackageType", "Developer");

        try {
            if (Configuration.INSTALL_MODE_INSTALL.equals(installMode) || Configuration.INSTALL_MODE_INSTALL_ONLY
                    .equals(installMode)) {
                Function_instproxy_install cb = new Function_instproxy_install() {

                    @Override
                    public void call_instproxy_install(plist_t operation, plist_t status, VoidPtr userdata) {

                        HashMap<String, Object> operationDict = PlistHelper.getDict(operation);
                        String operationCommand = operationDict == null ? null : (String)operationDict.get("Command");
                        updateStatus(operationCommand, PlistHelper.getDict(status));
                    }
                };
                instproxy_install(ip, target, options, cb, null);
            } else if (Configuration.INSTALL_MODE_UPGRADE.equals(installMode) || Configuration.INSTALL_MODE_UPGRADE_ONLY
                    .equals(installMode)) {
                Function_instproxy_upgrade cb = new Function_instproxy_upgrade() {

                    @Override
                    public void call_instproxy_upgrade(plist_t operation, plist_t status, VoidPtr userdata) {

                        HashMap<String, Object> operationDict = PlistHelper.getDict(operation);
                        String operationCommand = operationDict == null ? null : (String)operationDict.get("Command");
                        updateStatus(operationCommand, PlistHelper.getDict(status));
                    }
                };
                instproxy_upgrade(ip, target, options, cb, null);
            } else {
                // Probably a run only
                throw new IllegalStateException();
            }

            // Wait for completion
            try {
                installEnded.await();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                LOG.debug(installMode + " was interrupted");
            }

        } finally {
            // Clean up
            instproxy_client_options_free(options);
            installLock.unlock();
        }

    }

    /**
     * Updates installation status.
     *
     * @param operation operation
     * @param dict      remote info
     */
    private void updateStatus(String operation, HashMap<String, Object> dict) {

        if (dict == null || operation == null) {
            updateProgress(operation == null ? "" : operation, "Unknown error", -1);

            // Signal due to failure
            signalInstallationEnded();
        } else {

            String status = (String)dict.get("Status");
            if (status == null) {
                String error = (String)dict.get("Error");
                Long code = (Long)dict.get("ErrorDetail");
                updateProgress(operation, error == null ? "Unknown error" : error + "(" + code + ")", -1);

                // Signal due to failure
                signalInstallationEnded();
            }
            if ("Complete".equals(status)) {
                updateProgress(operation, status, 100);

                // Signal due to completion
                signalInstallationEnded();
            } else {
                Long percentComplete = (Long)dict.get("PercentComplete");
                percentComplete = percentComplete == null ? 0 : percentComplete;
                updateProgress(operation, status, percentComplete.intValue());
            }
        }
    }

    /**
     * Signals the installation ended condition.
     */
    private void signalInstallationEnded() {
        installLock.lock();
        try {
            installEnded.signal();
        } finally {
            installLock.unlock();
        }
    }

    /**
     * Prints progress and sets error message on failure.
     *
     * @param operation operation name
     * @param status    operation status
     * @param prog      progress of -1 if failed
     */
    private void updateProgress(String operation, String status, int prog) {
        if (prog == -1) {
            System.out.println("- " + operation + " failed " + status);
            errorMessage = status;
        } else {
            System.out.println("- " + operation + "@" + prog + "% " + status);
        }
    }
}
