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

package org.moe.common.configuration;

import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.exec.GradleExec;
import org.moe.common.utils.InputValidationHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Utility class for working with remote build settings.
 */
public class RemoteSettings {

    /**
	 * Key: host.
     */
    public static final String HOST_KEY = "host";
    /**
     * Key: port.
     */
    public static final String PORT_KEY = "port";
    /**
     * Key: user.
     */
    public static final String USER_KEY = "user";
    /**
     * Key: knownhosts.
     */
    public static final String KNOWHOSTS_KEY = "knownhosts";
    /**
     * Key: identity.
     */
    public static final String IDENTITY_KEY = "identity";
    /**
     * Key: keychain.name.
     */
    public static final String KEYCHAIN_NAME_KEY = "keychain.name";
    /**
     * Key: keychain.pass.
     */
    public static final String KEYCHAIN_PASS_KEY = "keychain.pass";
    /**
     * Key: keychain.locktimeout.
     */
    public static final String KEYCHAIN_LOCKTIMEOUT_KEY = "keychain.locktimeout";
    /**
     * Key: gradle.repositories.
     */
    public static final String GRADLE_REPOSITORIES_KEY = "gradle.repositories";

    /**
     * Property: host.
     */
    public static final String HOST_PROPERTY = "moe.remotebuild.host=";
    /**
     * Property: port.
     */
    public static final String PORT_PROPERTY = "moe.remotebuild.port=";
    /**
     * Property: user.
     */
    public static final String USER_PROPERTY = "moe.remotebuild.user=";
    /**
     * Property: knownhosts.
     */
    public static final String KNOWHOSTS_PROPERTY = "moe.remotebuild.knownhosts=";
    /**
     * Property: identity.
     */
    public static final String IDENTITY_PROPERTY = "moe.remotebuild.identity=";
    /**
     * Property: keychain.name.
     */
    public static final String KEYCHAIN_NAME_PROPERTY = "moe.remotebuild.keychain.name=";
    /**
     * Property: keychain.pass.
     */
    public static final String KEYCHAIN_PASS_PROPERTY = "moe.remotebuild.keychain.pass=";
    /**
     * Property: keychain.locktimeout.
     */
    public static final String KEYCHAIN_LOCKTIMEOUT_PROPERTY = "moe.remotebuild.keychain.locktimeout=";
    /**
     * Property: gradle.repositories.
     */
    public static final String GRADLE_REPOSITORIES_PROPERTY = "moe.remotebuild.gradle.repositories=";

    /**
     * Test remote build configuration.
     *
     * @param properties  Properties object
     * @param projectFile File object
     * @param listener    ExecRunnerBase.ExecRunnerListener object
     * @return error message
     */
    public static String test(File projectFile, Properties properties, ExecRunnerBase.ExecRunnerListener listener) {
        List<String> args = new ArrayList<String>();

        args.add("moeTestRemote");
        args.add("-Pmoe.remotebuild.properties.ignore");
        getArguments("-P", properties, args);
        args.add("-s");

        GradleExec exec = new GradleExec(projectFile);
        exec.getArguments().addAll(args);
        ExecRunner runner = null;

        try {
            runner = exec.getRunner();
            if (listener != null) {
                runner.setListener(listener);
            }
        } catch (IOException e) {
            return "Unable run test: " + e.getMessage();
        }

        if (runner != null) {
            runner.getBuilder().directory(projectFile);
        }

        try {
            int result = runner.run(null);

            if (result != 0) {
                return "Test fail, result code: " + result;
            } else {
                return null;

            }
        } catch (Exception e) {
            return "Unable run test: " + e.getMessage();
        }
    }

    /**
     * Read arguments List.
     *
     * @param prefix     String object
     * @param properties Properties object
     * @param args       List object
     */
    public static void getArguments(String prefix, Properties properties, List<String> args) {
        args.add(prefix + HOST_PROPERTY + properties.getProperty(HOST_KEY));
        args.add(prefix + PORT_PROPERTY + properties.getProperty(PORT_KEY));
        args.add(prefix + USER_PROPERTY + properties.getProperty(USER_KEY));
        args.add(prefix + KNOWHOSTS_PROPERTY + properties.getProperty(KNOWHOSTS_KEY));
        args.add(prefix + IDENTITY_PROPERTY + properties.getProperty(IDENTITY_KEY));
        args.add(prefix + KEYCHAIN_NAME_PROPERTY + properties.getProperty(KEYCHAIN_NAME_KEY));
        args.add(prefix + KEYCHAIN_PASS_PROPERTY + properties.getProperty(KEYCHAIN_PASS_KEY));
        args.add(prefix + KEYCHAIN_LOCKTIMEOUT_PROPERTY + properties.getProperty(KEYCHAIN_LOCKTIMEOUT_KEY));
        if (prefix.equals("-D")) {
            args.add(prefix + GRADLE_REPOSITORIES_PROPERTY + "\"" + properties.getProperty(GRADLE_REPOSITORIES_KEY)
                    + "\"");
        } else {
            args.add(prefix + GRADLE_REPOSITORIES_PROPERTY + properties.getProperty(GRADLE_REPOSITORIES_KEY));
        }
    }

    /**
     * Create properties.
     *
     * @param remoteHost                String
     * @param remotePort                String
     * @param remoteUser                String
     * @param remoteKnownhosts          String
     * @param remoteIdentity            String
     * @param remoteKeychainName        String
     * @param remoteKeychainPass        String
     * @param remoteKeychainLocktimeout String
     * @param remoteGradleRepositories  String
     * @return properties
     */
    public static Properties getProperties(String remoteHost, String remotePort, String remoteUser,
            String remoteKnownhosts, String remoteIdentity, String remoteKeychainName, String remoteKeychainPass,
            String remoteKeychainLocktimeout, String remoteGradleRepositories) {
        Properties properties = new Properties();
        properties.put(HOST_KEY, remoteHost);
        properties.put(PORT_KEY, remotePort);
        properties.put(USER_KEY, remoteUser);
        properties.put(KNOWHOSTS_KEY, remoteKnownhosts);
        properties.put(IDENTITY_KEY, remoteIdentity);
        properties.put(KEYCHAIN_NAME_KEY, remoteKeychainName);
        properties.put(KEYCHAIN_PASS_KEY, remoteKeychainPass);
        properties.put(KEYCHAIN_LOCKTIMEOUT_KEY, remoteKeychainLocktimeout);
        properties.put(GRADLE_REPOSITORIES_KEY, remoteGradleRepositories);

        return properties;
    }

    /**
     * Validates the properties object.
     *
     * @param properties Properties object
     * @throws ConfigurationValidationException If validation failed.
     */
    public static void validate(Properties properties) throws ConfigurationValidationException {

        String host = properties.getProperty(HOST_KEY);
        if (host == null || host.isEmpty()) {
            throw new ConfigurationValidationException(HOST_KEY, "Please enter a remote host value.");
        }

        String port = properties.getProperty(PORT_KEY);
        if (port == null || port.isEmpty()) {
            throw new ConfigurationValidationException(PORT_KEY, "Please enter a debug port");
        } else if (!InputValidationHelper.isInteger(port)) {
            throw new ConfigurationValidationException(PORT_KEY,
                    "Wrong remote port number, please enter a numeric value.");
        }

        String user = properties.getProperty(USER_KEY);
        if (user == null || user.isEmpty()) {
            throw new ConfigurationValidationException(USER_KEY, "Please enter a remote user value.");
        }

        String remoteKnownhosts = properties.getProperty(KNOWHOSTS_KEY);
        if (remoteKnownhosts == null || remoteKnownhosts.isEmpty()) {
            throw new ConfigurationValidationException(KNOWHOSTS_KEY, "Please enter a remote Knownhosts value.");
        }

        String remoteIdentity = properties.getProperty(IDENTITY_KEY);
        if (remoteIdentity == null || remoteIdentity.isEmpty()) {
            throw new ConfigurationValidationException(IDENTITY_KEY, "Please enter a remote Identity value.");
        }

        String remoteKeychainName = properties.getProperty(KEYCHAIN_NAME_KEY);
        if (remoteKeychainName == null || remoteKeychainName.isEmpty()) {
            throw new ConfigurationValidationException(KEYCHAIN_NAME_KEY, "Please enter a remote Keychain.name value.");
        }

        String remoteKeychainPass = properties.getProperty(KEYCHAIN_PASS_KEY);
        if (remoteKeychainPass == null || remoteKeychainPass.isEmpty()) {
            throw new ConfigurationValidationException(KEYCHAIN_PASS_KEY, "Please enter a remote Keychain.pass value.");
        }

        String remoteKeychainLocktimeout = properties.getProperty(KEYCHAIN_LOCKTIMEOUT_KEY);
        if (remoteKeychainLocktimeout == null || remoteKeychainLocktimeout.isEmpty()) {
            throw new ConfigurationValidationException(KEYCHAIN_LOCKTIMEOUT_KEY,
                    "Wrong remote Keychain.locktimeout number, please enter a numeric value.");
        } else if (!InputValidationHelper.isInteger(remoteKeychainLocktimeout)) {
            throw new ConfigurationValidationException(KEYCHAIN_LOCKTIMEOUT_KEY,
                    "Please enter a Keychain.locktimeout number value.");
        }

        String remoteGradleRepositories = properties.getProperty(GRADLE_REPOSITORIES_KEY);
        if (remoteGradleRepositories == null || remoteGradleRepositories.isEmpty()) {
            throw new ConfigurationValidationException(GRADLE_REPOSITORIES_KEY,
                    "Please enter a remote gradle repositories value.");
        }
    }

    /**
     * Save properties to file.
     *
     * @param saveFolder String object
     * @param properties Properties object
     * @throws IOException If save failed.
     */
    public static void saveProperties(String saveFolder, Properties properties) throws IOException {
        // @formatter:off
        String comment = ""
                + " Supported keys and values:" + "\n"
                + "   host: address of the remote build server" + "\n"
                + "   port: port for ssh, defaults to 22" + "\n"
                + "   user: user on the remote build server" + "\n"
                + "   knownhosts: path to known_hosts file" + "\n"
                + "   identity: path to private key" + "\n"
                + "   keychain.name: name of keychain to unlock, defaults to 'moeremotebuild.keychain'" + "\n"
                + "   keychain.pass: password for keychain, defaults to ''" + "\n"
                + "   keychain.locktimeout: keychain lock timeout in seconds, defaults to 3600" + "\n"
                + "   gradle.repositories: repositories to be used when setting up the MOE SDK on the remote server, defaults to 'mavenCentral()'" + "\n"
                + "\n"
                + "The identity and knownhosts keys accept special parameters to access" + "\n"
                + "   environmental variables ($env$KEY), system properties ($sys$KEY)" + "\n"
                + "   and project properties ($proj$KEY)." + "\n"
                + "   Example: knownhosts=$sys$user.home/.ssh/known_hosts" + "\n";
        // @formatter:on
		File propertiesFile = new File(saveFolder, "moe.remotebuild.properties");
        if (propertiesFile.exists()) {
            propertiesFile.delete();
        }

        OutputStream out = new FileOutputStream(propertiesFile);
        properties.store(out, comment);
    }

    /**
     * Read properties file.
     *
     * @param propertiesFilePath String object
     * @return properties
     * @throws Exception If read failed.
     */
    public static Properties readProperties(String propertiesFilePath) throws Exception {
        FileInputStream inStream = null;

        try {
            File propertiesFile = new File(propertiesFilePath);
            inStream = new FileInputStream(propertiesFile);
            Properties property = new Properties();
            property.load(inStream);
            return property;
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException ignore) {

                }
            }
        }
    }
}
