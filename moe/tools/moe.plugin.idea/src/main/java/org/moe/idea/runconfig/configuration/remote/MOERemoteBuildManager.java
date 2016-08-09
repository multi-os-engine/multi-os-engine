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

package org.moe.idea.runconfig.configuration.remote;

import org.moe.common.LOGGER;
import org.moe.common.PasswordEntry;
import org.moe.idea.MOESdkPlugin;
import org.moe.common.ssh.SSHAdapter;
import org.moe.idea.ui.MOEToolWindow;
import com.intellij.ide.passwordSafe.PasswordSafeException;
import com.intellij.openapi.project.Project;
import sun.security.x509.X500Name;

import java.io.*;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.logging.Level;

import static org.apache.commons.lang.exception.ExceptionUtils.getStackTrace;

public class MOERemoteBuildManager {

    // TODO Remove hardcoded value of folder name
    private static String DEFAULT_MOE_BUILD_FOLDER_NAME = "build";
    private static String DEFAULT_MOE_LOGS_FOLDER_NAME = "logs";

    private static Project project;
    private static String logDirPath;

    private static void initialize(MOERunConfigurationRemote configuration) throws BuildException {
        logDirPath = configuration.modulePath() + File.separator + DEFAULT_MOE_BUILD_FOLDER_NAME + File.separator + DEFAULT_MOE_LOGS_FOLDER_NAME;
        initLogs(logDirPath);

        project = configuration.getProject();
    }

    public static boolean build(MOERunConfigurationRemote configuration) throws BuildException {
        initialize(configuration);

        String projectBuildConfiguration = configuration.configuration();
        String sdkVersion = configuration.sdkVersionNumber();

        String archivePath = configuration.modulePath() + File.separator +
                DEFAULT_MOE_BUILD_FOLDER_NAME + File.separator +
                "moe" + File.separator +
                "main" + File.separator +
                "outside" + File.separator +
                projectBuildConfiguration + "-iphoneos" + File.separator +
                "outside.zip";

        File archive = new File(archivePath);
        if (!archive.exists()) {
            throw new BuildException("Unable to find source package");
        }

        MOEToolWindow.getInstance(project).log("\nsend project to build server .....");
        LOGGER.INFO("\nsend project to build server .....");

        String certPath = configuration.certificatePath();
        if ((certPath == null) || certPath.isEmpty()) {
            throw new BuildException("Failed to get certificate!");
        }

        SSHAdapter sshAdapter = null;
        String userName = null;
        char[] certPswd = null;
        byte[] userPswd = null;
        String certCommonName = null;
        String remoteModuleDirPath = null;

        try {
            String provisPath = configuration.profilePath();

            MOERemoteConfiguration remoteConfiguration = configuration.remoteConfiguration();

            sshAdapter = new SSHAdapter();
            String tmp = null;
            try {
                tmp = configuration.secureValue(remoteConfiguration.passKey());
                userPswd = tmp.getBytes();
            }  finally {
                try {
                    PasswordEntry.clean(tmp);
                } catch (Exception e) {
                    LOGGER.SEVERE(getStackTrace(e));
                }
            }

            userName = remoteConfiguration.login();

            establishSSHconnection(sshAdapter, remoteConfiguration.address(), remoteConfiguration.port(), userName, userPswd, null);

            remoteModuleDirPath = sshAdapter.getHome() + configuration.remoteModuleDirPath();

            uploadFiles(sshAdapter, remoteModuleDirPath, archive, provisPath, certPath);

            String certPassKey = configuration.secureValue(certPath);
            if (certPassKey == null) {
                throw new PasswordSafeException("Certificate password was not set!");
            }
            certPswd = certPassKey.toCharArray();
            try {
                PasswordEntry.clean(certPassKey);
            } catch (Exception e) {
                throw new BuildException(e.getMessage());
            }

            installCert(sshAdapter, userPswd, certPswd, remoteModuleDirPath + new File(certPath).getName());

            MOEToolWindow.getInstance(project).log("building .....");
            LOGGER.INFO("building .....");

            FileInputStream fis = null;
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            try {
                fis = new FileInputStream(new File(configuration.certificatePath()));
                keyStore.load(fis, certPswd);
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }
            String alias = keyStore.aliases().nextElement();
            Certificate cert = keyStore.getCertificate(alias);

            Principal subj;
            if (cert instanceof X509Certificate) {
                subj = ((X509Certificate)cert).getSubjectDN();
                if (subj instanceof X500Name) {
                    certCommonName = ((X500Name)subj).getCommonName();
                }
            }
            if (certCommonName == null) {
                throw new BuildException("Could not retrieve certificate common name.");
            }

            buildOnRemoteServer(sshAdapter, configuration, remoteModuleDirPath, certCommonName);

            MOEToolWindow.getInstance(project).log("done\n");
            LOGGER.INFO("done\n");

            downloadApplication(sshAdapter, configuration, remoteModuleDirPath);

        } catch (BuildException e) {
            throw e;
        } catch (Exception e) {
            throw new BuildException(e);
        } finally {
            uninstallCert(sshAdapter, certCommonName);
            try {
                sshAdapter.RemoveFile(remoteModuleDirPath);
            } catch (Exception e) {
                LOGGER.SEVERE(e.getMessage());
            }
            disconnectSSHconnection(sshAdapter);
            PasswordEntry.clean(certPswd);
            PasswordEntry.clean(userPswd);
        }

        return true;
    }

    /*
     * arg@ sPassKey is password
     * arg@ proxy is a proxy server IP. Can be NULL if proxy is not required.
     */
    public static void establishSSHconnection(SSHAdapter sshAdapter, String sServerIP, int nPort, String sLogin, byte[] pswd,
                                              String proxy) throws BuildException {
        try {
            sshAdapter.ConnectToServer(sServerIP, nPort, sLogin, pswd, proxy);
        } catch (Exception e) {
            throw new BuildException(e.getMessage());
        }
    }

    public static void disconnectSSHconnection(SSHAdapter sshAdapter) {
        if (sshAdapter != null) {
            sshAdapter.CloseConnection();
        }
    }

    private static void uploadFiles (SSHAdapter sshAdapter, String dstPath, File projectZip, String profilePath, String certPath) throws BuildException {

        try {
            sshAdapter.Upload(projectZip.getAbsolutePath(), dstPath);
            sshAdapter.Upload(profilePath, dstPath);
            sshAdapter.Upload(certPath, dstPath);
        } catch (Exception e) {
            throw new BuildException(e);
        }
    }

    private static void installCert(SSHAdapter sshAdapter, byte[] userPswd, char[] certPswd, String remoteCertFilePath) throws BuildException {

        // Unlock keychain
        String pswd = null;
        String command = null;
        try {
            sshAdapter.ExecuteWithPassword("security unlock-keychain " + sshAdapter.getHome() + "/Library/Keychains/login.keychain", userPswd, null);

            // Install certificate
            pswd = new String(certPswd);
            command = String.format("security import %s -k ~/Library/Keychains/login.keychain -P %s -T /usr/bin/codesign", remoteCertFilePath, pswd);
            sshAdapter.executeWithoutOutput(command);
        } catch (Exception e) {
            throw new BuildException(e);
        } finally {
            try {
                PasswordEntry.clean(pswd);
                PasswordEntry.clean(command);
            } catch (Exception e) {
                LOGGER.SEVERE(e.getMessage());
            }
        }
    }
    
    private static void uninstallCert(SSHAdapter sshAdapter, String certName) {
        if ((sshAdapter == null) || !sshAdapter.IsConnected() ||
                (certName == null) || certName.isEmpty()) {
            return;
        }
        String homeDirPath;
        try {
            homeDirPath = sshAdapter.getHome();
        } catch (Exception e) {
            return;
        }

        StringBuilder uninstallCer = new StringBuilder();
        uninstallCer.append("security delete-certificate -c \"");
        uninstallCer.append(certName);
        uninstallCer.append("\" ");
        uninstallCer.append(homeDirPath);
        uninstallCer.append("/Library/Keychains/login.keychain");

        StringBuffer output = new StringBuffer();
        try {
            sshAdapter.ShellCmd(uninstallCer.toString(), output);
        } catch (Exception e) {
            String log = output.append('\n').append(e.getMessage()).toString();
            MOEToolWindow.getInstance(project).log(log);
            LOGGER.SEVERE(log);
        }
    }

    private static void downloadApplication(SSHAdapter sshAdapter, MOERunConfigurationRemote config, String remoteModuleDirPath) throws BuildException {
        MOEToolWindow.getInstance(project).log("downloading .....");
        LOGGER.INFO("downloading .....");

        File dstDir = new File(String.format("%s/build/moe/xcodebuild/sym/%s-iphoneos/", config.modulePath(), config.configuration()));
        if (!dstDir.exists()) {
            dstDir.mkdirs();
        }

        String log = "Local build path = " + dstDir.getAbsolutePath();
        MOEToolWindow.getInstance(project).log(log);
        LOGGER.INFO(log);

        try {
            sshAdapter.Download(String.format("%sbuild/moe/xcodebuild/sym/%s-iphoneos/%s.%s", remoteModuleDirPath, config.configuration(), MOESdkPlugin.getProductName(config.module()), config.productType().name()),
                    dstDir.getAbsolutePath());
        } catch (Exception e) {
            throw new BuildException(e);
        }
    }

    private static void downloadLog(SSHAdapter sshAdapter, MOERunConfigurationRemote config, String remoteModuleDirPath) throws BuildException {

        MOEToolWindow.getInstance(project).log("Downloading log files from remote build server...");
        LOGGER.FINE("Downloading log files from remote build server...");

        File dstDir = new File(config.modulePath() + "/build/logs/remote/");
        if (!dstDir.exists()) {
            dstDir.mkdirs();
        }
        try {
            sshAdapter.Download(remoteModuleDirPath + "build/logs/", dstDir.getAbsolutePath());
        } catch (Exception e) {
            throw new BuildException(e);
        }
    }

    private static void buildOnRemoteServer(SSHAdapter sshAdapter, MOERunConfigurationRemote configuration, String remoteModuleDirPath, String certCommonName) throws BuildException {

        // unzip project on server
        StringBuilder unzipCmd = new StringBuilder(128);
        unzipCmd.append("cd ");
        unzipCmd.append(remoteModuleDirPath);
        unzipCmd.append(";unzip -o outside.zip;rm outside.zip");

        try {
            sshAdapter.ShellCmd(unzipCmd.toString(), null);
        } catch (Exception e) {
            throw new BuildException(e);
        }

        // Build project
        StringBuilder buildCmd = new StringBuilder(512);

        buildCmd.append("java -jar $");
        buildCmd.append(MOESdkPlugin.SDK_ROOT_ENV_VAR_NAME);
        buildCmd.append("/tools/moeExecutableBuilder.jar");

        buildCmd.append(" -module_path ");
        buildCmd.append(remoteModuleDirPath);
        buildCmd.append(" -source_set ");
        buildCmd.append(configuration.sourceSet().name());
        buildCmd.append(" -dex_files classes");
        buildCmd.append(" -mode_variant ");
        buildCmd.append(configuration.configuration());
        buildCmd.append(" -platform_name iphoneos");
        buildCmd.append(" -prov_profile ");
        buildCmd.append(remoteModuleDirPath);
        buildCmd.append('/');
        buildCmd.append(new File(configuration.profilePath()).getName());
        buildCmd.append(" -sign_identity \"");
        buildCmd.append(certCommonName);
        buildCmd.append('\"');
        buildCmd.append(" -product_type ");
        buildCmd.append(configuration.productType().name());

        StringBuffer output = new StringBuffer(1024);
        try {
            sshAdapter.ShellCmd(buildCmd.toString(), output);
        } catch (Exception e) {
            String log = "Remote output:\n" + output.toString();
            MOEToolWindow.getInstance(project).log(log);
            LOGGER.INFO(log);
            throw new BuildException(e);
        } finally {
            try {
                downloadLog(sshAdapter, configuration, remoteModuleDirPath);
            } catch (Exception e) {}
        }
    }

    private static void initLogs(String logsDirPath) {
        LOGGER.setLogLevel(Level.ALL);
        LOGGER.EnableConsoleOutLog(false);
        LOGGER.SetLogFilePrefix("RemoteBuild");
        LOGGER.SetDatePrefix(LOGGER.getDefaultDateFormat().format(new Date()));

        LOGGER.SetLogFilePath(logsDirPath);
    }
}
