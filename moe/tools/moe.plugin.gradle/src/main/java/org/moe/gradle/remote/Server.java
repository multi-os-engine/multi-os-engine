/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.remote;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.apache.commons.codec.digest.DigestUtils;
import org.gradle.BuildResult;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.groovy.closures.ConfigurationClosure;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.utils.Require;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import static org.moe.gradle.MoePlugin.MOE;

public class Server {

    private static final Logger LOG = Logging.getLogger(Server.class);

    private static final String MOE_REMOTEBUILD_DISABLE = "moe.remotebuild.disable";
    private static final String SDK_ROOT_MARK = "REMOTE_MOE_SDK_ROOT___1234567890";

    @NotNull
    final Session session;

    @NotNull
    private final MoePlugin plugin;

    @NotNull
    private final ServerSettings settings;

    @Nullable
    private String userHome;

    @NotNull
    public String getUserHome() {
        return Require.nonNull(userHome);
    }

    @Nullable
    private String userName;

    @NotNull
    public String getUserName() {
        return Require.nonNull(userName);
    }

    @Nullable
    private URI buildDir;

    @NotNull
    public URI getBuildDir() {
        return Require.nonNull(buildDir);
    }

    @Nullable
    private URI sdkDir;

    @NotNull
    public URI getSdkDir() {
        return Require.nonNull(sdkDir);
    }

    @Nullable
    private Task moeRemoteServerSetupTask;

    @NotNull
    public Task getMoeRemoteServerSetupTask() {
        return Require.nonNull(moeRemoteServerSetupTask);
    }

    private final ExecutorService executor = Executors.newFixedThreadPool(1);

    private Server(@NotNull JSch jsch, @NotNull Session session, @NotNull MoePlugin plugin, @NotNull ServerSettings settings) {
        Require.nonNull(jsch);
        this.session = Require.nonNull(session);
        this.plugin = Require.nonNull(plugin);
        this.settings = Require.nonNull(settings);

        this.userName = session.getUserName();

        final Project project = plugin.getProject();
        project.getGradle().buildFinished(new ConfigurationClosure<BuildResult>(project) {
            @Override
            public void doCall(BuildResult object) {
                if (!session.isConnected()) {
                    return;
                }
                try {
                    lockRemoteKeychain();
                } catch (Throwable e) {
                    LOG.error("Failed to lock remote keychain", e);
                }
                try {
                    if (buildDir != null) {
                        final ServerCommandRunner runner = new ServerCommandRunner(Server.this, "cleanup", "" +
                                "rm -rf '" + getBuildDir() + "'");
                        runner.setQuiet(true);
                        runner.run();
                    }
                } catch (Throwable e) {
                    LOG.error("Failed to cleanup on remote server", e);
                }
                disconnect();
            }
        });
    }

    @Nullable
    public static Server setup(@NotNull MoePlugin plugin) {
        Require.nonNull(plugin);

        ServerSettings settings = new ServerSettings(plugin);

        final Project project = plugin.getProject();
        project.getTasks().create("moeConfigRemote", task -> {
            task.setGroup(MOE);
            task.setDescription("Starts an interactive remote server connection configurator and tester");
            task.getActions().add(t -> {
                settings.interactiveConfig();
            });
        });
        project.getTasks().create("moeTestRemote", task -> {
            task.setGroup(MOE);
            task.setDescription("Tests the connection to the remote server");
            task.getActions().add(t -> {
                if (!settings.testConnection()) {
                    throw new GradleException("Remote connection test failed");
                }
            });
        });

        if (project.hasProperty(MOE_REMOTEBUILD_DISABLE)) {
            return null;
        }

        if (!settings.isConfigured()) {
            return null;
        }

        // Create session
        try {
            final JSch jsch = settings.getJSch();
            final Session session = settings.getJSchSession(jsch);
            return new Server(jsch, session, plugin, settings);
        } catch (JSchException e) {
            throw new GradleException(e.getMessage(), e);
        }
    }

    public void connect() {
        Require.nonNull(plugin);
        moeRemoteServerSetupTask = plugin.getProject().getTasks().create("moeRemoteServerSetup", task -> {
            task.setGroup(MOE);
            task.setDescription("Sets up the SDK on the remote server");
            task.getActions().add(t -> {

                if (session.isConnected()) {
                    return;
                }
                try {
                    session.connect();
                } catch (JSchException e) {
                    throw new GradleException(e.getMessage(), e);
                }

                setupUserHome();
                setupBuildDir();
                prepareServerMOE();
            });
        });
    }

    private void prepareServerMOE() {
        final MoeSDK sdk = plugin.getSDK();

        final File gradlewZip = sdk.getGradlewZip();
        final FileList list = new FileList(gradlewZip.getParentFile(), getBuildDir());
        final String remoteGradlewZip = list.add(gradlewZip);
        upload("prepare - gradlew", list);

        final String output = exec("install MOE SDK", "" +
                "cd " + getBuildDir().getPath() + " && " +

                "unzip " + remoteGradlewZip + " && " +

                "cd gradlew && " +

                "echo 'distributionBase=GRADLE_USER_HOME' >> gradle/wrapper/gradle-wrapper.properties && " +
                "echo 'distributionPath=wrapper/dists' >> gradle/wrapper/gradle-wrapper.properties && " +
                "echo 'zipStoreBase=GRADLE_USER_HOME' >> gradle/wrapper/gradle-wrapper.properties && " +
                "echo 'zipStorePath=wrapper/dists' >> gradle/wrapper/gradle-wrapper.properties && " +
                "echo 'distributionUrl=https\\://services.gradle.org/distributions/gradle-" + plugin.getRequiredGradleVersion() + "-bin.zip' >> gradle/wrapper/gradle-wrapper.properties && " +

                "echo 'buildscript {' >> build.gradle && " +
                "echo '    repositories {' >> build.gradle && " +
                "echo '        " + settings.getGradleRepositories() + "' >> build.gradle && " +
                "echo '    }' >> build.gradle && " +
                "echo '    dependencies {' >> build.gradle && " +
                "echo '        classpath group: \"org.multi-os-engine\", name: \"moe-gradle\", version: \"" + sdk.pluginVersion + "\"' >> build.gradle && " +
                "echo '    }' >> build.gradle && " +
                "echo '}' >> build.gradle && " +
                "echo '' >> build.gradle && " +
                "echo 'apply plugin: \"moe-sdk\"' >> build.gradle && " +
                "echo 'task printSDKRoot << { print \"" + SDK_ROOT_MARK + ":${moe.sdk.root}\" }' >> build.gradle && " +

                "./gradlew printSDKRoot -s && " +
                "cd .. && rm -rf gradlew && rm -f gradlew.zip"
        );
        final int start = output.indexOf(SDK_ROOT_MARK);
        Require.NE(start, -1, "SDK_ROOT_MARK not found");
        final int start2 = start + SDK_ROOT_MARK.length() + 1;
        try {
            sdkDir = new URI("file://" + output.substring(start2, output.indexOf('\n', start2)));
        } catch (URISyntaxException e) {
            throw new GradleException(e.getMessage(), e);
        }

        exec("check MOE SDK path", "[ -d '" + sdkDir.getPath() + "' ]");
    }

    private void setupUserHome() {
        final ChannelExec channel;
        try {
            channel = (ChannelExec) session.openChannel("exec");
        } catch (JSchException e) {
            throw new GradleException(e.getMessage(), e);
        }

        channel.setCommand("echo $HOME");

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        channel.setOutputStream(baos);

        try {
            channel.connect();
        } catch (JSchException e) {
            throw new GradleException(e.getMessage(), e);
        }

        while (!channel.isClosed()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new GradleException(e.getMessage(), e);
            }
        }

        channel.disconnect();
        if (channel.getExitStatus() != 0) {
            throw new GradleException("Failed to initialize connection with server");
        }
        userHome = baos.toString().trim();
        LOG.quiet("MOE Remote Build - REMOTE_HOME=" + getUserHome());
    }

    private void setupBuildDir() {
        final ChannelExec channel;
        try {
            channel = (ChannelExec) session.openChannel("exec");
        } catch (JSchException e) {
            throw new GradleException(e.getMessage(), e);
        }

        channel.setCommand("mktemp -d");

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        channel.setOutputStream(baos);

        try {
            channel.connect();
        } catch (JSchException e) {
            throw new GradleException(e.getMessage(), e);
        }

        while (!channel.isClosed()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new GradleException(e.getMessage(), e);
            }
        }

        channel.disconnect();
        if (channel.getExitStatus() != 0) {
            throw new GradleException("Failed to initialize connection with server");
        }
        try {
            buildDir = new URI("file://" + baos.toString().trim());
        } catch (URISyntaxException e) {
            throw new GradleException(e.getMessage(), e);
        }
        LOG.quiet("MOE Remote Build - REMOTE_BUILD_DIR=" + buildDir.getPath());
    }

    private void disconnect() {
        if (!session.isConnected()) {
            return;
        }
        session.disconnect();
        userHome = null;
    }

    private void assertConnected() {
        if (!session.isConnected()) {
            throw new GradleException("MOE Remote Build session in not connected");
        }
    }

    public void upload(@NotNull String name, @NotNull FileList list) {
        assertConnected();
        new ServerFileUploader(this, name, list).run();
    }

    public void downloadFile(@NotNull String name, @NotNull String remoteFile, @NotNull File localOutputDir) {
        assertConnected();
        new ServerFileDownloader(this, name, remoteFile, localOutputDir, false).run();
    }

    public void downloadDirectory(@NotNull String name, @NotNull String remoteFile, @NotNull File localOutputDir) {
        assertConnected();
        new ServerFileDownloader(this, name, remoteFile, localOutputDir, true).run();
    }

    public String exec(@NotNull String name, @NotNull String command) {
        assertConnected();
        final ServerCommandRunner runner = new ServerCommandRunner(this, name, command);
        runner.run();
        return runner.getOutput();
    }

    public String getRemotePath(Path relative) {
        assertConnected();

        try {
            return getRemotePath(getBuildDir(), relative);
        } catch (IOException e) {
            throw new GradleException(e.getMessage(), e);
        }
    }

    public String getSDKRemotePath(@NotNull File file) throws IOException {
        Require.nonNull(file);

        final Path filePath = file.toPath().toAbsolutePath();
        final Path sdk = plugin.getSDK().getRoot().toPath().toAbsolutePath();

        if (!filePath.getRoot().equals(sdk.getRoot())) {
            throw new IOException("non-sdk file");
        }

        final Path relative = sdk.relativize(filePath);
        return getRemotePath(getSdkDir(), relative);
    }

    public static String getRemotePath(@NotNull URI root, @NotNull Path relative) throws IOException {
        Require.nonNull(root);
        Require.nonNull(relative);

        if (relative.toString().contains("..")) {
            throw new IOException("Relative path points to extenral directory: " + relative);
        }

        ArrayList<String> comps = new ArrayList<>();
        for (Path path : relative) {
            comps.add(path.getFileName().toString());
        }

        try {
            return new URI(root.getPath() + "/" + comps.stream().collect(Collectors.joining("/"))).getPath();
        } catch (URISyntaxException e) {
            throw new GradleException(e.getMessage(), e);
        }
    }

    public boolean checkFileMD5(String remotePath, @NotNull File localFile) {
        // Get local file md5
        final Future<String> localMD5Future = executor.submit(() -> {
            try {
                return DigestUtils.md5Hex(new FileInputStream(localFile));
            } catch (IOException ignore) {
                return null;
            }
        });

        // Get remote file md5
        assertConnected();
        final ServerCommandRunner runner = new ServerCommandRunner(this, "check file md5", "" +
                "[ -f '" + remotePath + "' ] && md5 -q '" + remotePath + "'");
        runner.setQuiet(true);
        try {
            runner.run();
        } catch (GradleException ignore) {
            return false;
        }
        final String remoteMD5 = runner.getOutput().trim();

        // Check equality
        final String localMD5;
        try {
            localMD5 = localMD5Future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new GradleException(e.getMessage(), e);
        }
        if (localMD5 == null) {
            return false;
        }
        return remoteMD5.compareToIgnoreCase(localMD5) == 0;
    }

    public void unlockRemoteKeychain() {
        assertConnected();

        final String kc_name = settings.getKeychainName();
        final String kc_pass = settings.getKeychainPass();
        final int kc_lock_to = settings.getKeychainLockTimeout();

        final ServerCommandRunner runner = new ServerCommandRunner(this, "unlock keychain", "" +
                "security unlock-keychain -p '" + kc_pass + "' " + kc_name + " && " +
                "security set-keychain-settings -t " + kc_lock_to + " -l " + kc_name);
        runner.setQuiet(true);
        runner.run();
    }

    private void lockRemoteKeychain() {
        assertConnected();

        final String kc_name = settings.getKeychainName();

        final ServerCommandRunner runner = new ServerCommandRunner(this, "lock keychain", "" +
                "security lock-keychain " + kc_name);
        runner.setQuiet(true);
        runner.run();
    }
}
