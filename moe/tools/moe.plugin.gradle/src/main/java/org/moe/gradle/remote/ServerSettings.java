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
import com.jcraft.jsch.UserInfo;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TermColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

import static org.moe.gradle.utils.TermColor.*;

class ServerSettings {

    private static final Logger LOG = LoggerFactory.getLogger(ServerSettings.class);

    private static final String MOE_REMOTEBUILD_PROPERTIES = "moe.remotebuild.properties";
    private static final String MOE_REMOTEBUILD_PROPERTIES_IGNORE_PROPERTY = "moe.remotebuild.properties.ignore";

    private interface Validator<T> {
        @Nullable
        T validate(@NotNull MoePlugin plugin, @Nullable String value) throws IOException;
    }

    private static class Key<T> {
        @NotNull
        final String key;
        @NotNull
        final String property;
        @NotNull
        final String description;
        @NotNull
        final Validator<T> validator;

        private Key(@NotNull String key, @NotNull String description, @NotNull Validator<T> validator) {
            this.key = Require.nonNull(key);
            this.property = "moe.remotebuild." + key;
            this.description = Require.nonNull(description);
            this.validator = Require.nonNull(validator);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key that = (Key) o;
            return Objects.equals(key, that.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }

    private static final Key<String> HOST_KEY = new Key<>("host", "address of the remote build server", (plugin, value) -> {
        if (value == null) {
            return null;
        }
        InetAddress address;
        try {
            address = InetAddress.getByName(value);
        } catch (UnknownHostException ex) {
            throw new IOException("illegal host '" + value + "'");
        }
        try {
            boolean reachable = address.isReachable(5000);
            if (!reachable) {
                throw new IOException();
            }
        } catch (IOException ex) {
            printWarning("host '" + value + "' is unreachable");
        }
        return value;
    });

    private static final Key<Integer> PORT_KEY = new Key<>("port", "port for ssh, defaults to 22", (plugin, value) -> {
        if (value == null) {
            return null;
        }

        int i = getInteger(value);
        if (i < 0 || i > 65535) {
            throw new IOException("'" + value + "' is not a number between [0..65535]");
        }
        return i;
    });

    private static final Key<String> USER_KEY = new Key<>("user", "user on the remote build server", (plugin, value) -> {
        if (value == null) {
            return null;
        } else {
            return value;
        }
    });

    private static final Key<String> KNOWNHOSTS_KEY = new Key<>("knownhosts", "path to known_hosts file", (plugin, value) -> {
        if (value == null) {
            return null;
        }

        File file = plugin.getProject().file(getFileWithProperty(plugin.getProject(), value));
        if (!file.isFile()) {
            printWarning("'" + value + "' doesn't exist or is not a file");
        }
        return value;
    });

    private static final Key<String> IDENTITY_KEY = new Key<>("identity", "path to private key", (plugin, value) -> {
        if (value == null) {
            return null;
        }

        File file = plugin.getProject().file(getFileWithProperty(plugin.getProject(), value));
        if (!file.isFile()) {
            printWarning("'" + value + "' doesn't exist or is not a file");
        }
        return value;
    });

    private static final Key<String> KEYCHAIN_NAME_KEY = new Key<>("keychain.name", "name of keychain to unlock, defaults to 'moeremotebuild.keychain'", (plugin, value) -> {
        if (value == null) {
            return null;
        }
        return value;
    });

    private static final Key<String> KEYCHAIN_PASS_KEY = new Key<>("keychain.pass", "password for keychain, defaults to ''", (plugin, value) -> {
        if (value == null) {
            return null;
        }
        return value;
    });

    private static final Key<Integer> KEYCHAIN_LOCKTIMEOUT_KEY = new Key<>("keychain.locktimeout", "keychain lock timeout in seconds, defaults to 3600", (plugin, value) -> {
        if (value == null) {
            return null;
        }

        int i;
        try {
            i = Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            throw new IOException("'" + value + "' is not a number grater than 0");
        }
        if (i < 0) {
            throw new IOException("'" + value + "' is not a number grater than 0");
        }
        return i;
    });

    private static final Key<String> GRADLE_REPOSITORIES_KEY = new Key<>("gradle.repositories", "repositories to be used when setting up the MOE SDK on the remote server, defaults to 'jcenter()'", (plugin, value) -> {
        if (value == null) {
            return null;
        }
        return value;
    });

    private static final Key<?>[] ALL_KEYS = new Key<?>[]{HOST_KEY, PORT_KEY, USER_KEY, KNOWNHOSTS_KEY,
            IDENTITY_KEY, KEYCHAIN_NAME_KEY, KEYCHAIN_PASS_KEY, KEYCHAIN_LOCKTIMEOUT_KEY, GRADLE_REPOSITORIES_KEY};

    @NotNull
    private final Map<Key, Object> settings = new HashMap<>();

    @Nullable
    private Properties properties;

    @NotNull
    private final MoePlugin plugin;

    ServerSettings(@NotNull MoePlugin plugin) {
        this.plugin = Require.nonNull(plugin);

        fillUnset();
        load();
    }

    private void fillUnset() {
        for (Key<?> key : ALL_KEYS) {
            try {
                settings.put(key, key.validator.validate(plugin, null));
            } catch (IOException ignore) {
            }
        }
    }

    private void load() {
        // Load properties file if exists
        final File propsFile = plugin.getProject().file(MOE_REMOTEBUILD_PROPERTIES);

        properties = new Properties();
        try {
            if (propsFile.exists()) {
                properties.load(new FileInputStream(propsFile));
            }
        } catch (IOException e) {
            throw new GradleException(e.getMessage(), e);
        }

        for (Key<?> key : ALL_KEYS) {
            if (plugin.getProject().hasProperty(key.property)) {
                try {
                    settings.put(key, key.validator.validate(plugin, plugin.getProject().property(key.property).toString()));
                } catch (IOException e) {
                    LOG.warn("Failed to load '" + key.key + "' from project property: " + e.getMessage());
                }
                continue;
            }
            if (!plugin.getProject().hasProperty(MOE_REMOTEBUILD_PROPERTIES_IGNORE_PROPERTY)) {
                try {
                    settings.put(key, key.validator.validate(plugin, properties.getProperty(key.key)));
                } catch (IOException e) {
                    LOG.warn("Failed to load '" + key.key + "' from " + MOE_REMOTEBUILD_PROPERTIES + ": " + e.getMessage());
                }
            }
        }
    }

    private void store() {
        if (properties == null) {
            properties = new Properties();
        }

        final StringBuilder usage = new StringBuilder();
        usage.append(" Supported keys and values:\n");
        for (Key<?> key : ALL_KEYS) {
            usage.append("   ").append(key.key).append(": ").append(key.description).append("\n");
        }
        usage.append("\n" +
                " The identity and knownhosts keys accept special parameters to access\n" +
                "   environmental variables ($env$KEY), system properties ($sys$KEY)\n" +
                "   and project properties ($proj$KEY).\n")
                .append("   Example: knownhosts=$sys$user.home/.ssh/known_hosts\n");

        // Save properties
        final File propsFile = plugin.getProject().file(MOE_REMOTEBUILD_PROPERTIES);
        for (Key<?> key : ALL_KEYS) {
            // Do not store values which were specified on the commandline
            if (plugin.getProject().hasProperty(key.property)) {
                continue;
            }

            Object value = settings.get(key);
            if (value != null) {
                properties.put(key.key, value.toString());
            } else {
                properties.remove(key.key);
            }
        }
        try {
            properties.store(new FileOutputStream(propsFile), usage.toString());
        } catch (IOException e) {
            throw new GradleException(e.getMessage(), e);
        }
    }

    public boolean isConfigured() {
        return get(HOST_KEY) != null;
    }

    @NotNull
    public String getKeychainName() {
        final String value = get(KEYCHAIN_NAME_KEY);
        return value == null ? "moeremotebuild.keychain" : value;
    }

    @NotNull
    public String getKeychainPass() {
        final String value = get(KEYCHAIN_PASS_KEY);
        return value == null ? "" : value;
    }

    @NotNull
    public int getKeychainLockTimeout() {
        final Integer value = get(KEYCHAIN_LOCKTIMEOUT_KEY);
        return value == null ? 3600 : value;
    }

    @NotNull
    public String getGradleRepositories() {
        final String value = get(GRADLE_REPOSITORIES_KEY);
        return value == null ? "jcenter()" : value;
    }

    private static class OptionScreen {

        private Runnable beforeLoop;

        private interface Action {
            boolean run();
        }

        private static class Option {
            @NotNull
            private final String opt;

            @NotNull
            private final String title;

            @Nullable
            private final String help;

            @NotNull
            private final TermColor color;

            @NotNull
            private final Action action;

            public Option(@NotNull String opt, @NotNull String title, @Nullable String help, @NotNull TermColor color,
                          @NotNull Action action) {
                this.opt = Require.nonNull(opt);
                this.title = Require.nonNull(title);
                this.help = help;
                this.color = Require.nonNull(color);
                this.action = Require.nonNull(action);
            }
        }

        @NotNull
        private final String title;

        @NotNull
        private final List<Option> options = new ArrayList<>();

        public OptionScreen(@NotNull String title) {
            this.title = Require.nonNull(title);
        }

        public void add(@NotNull String opt, @NotNull String title, @Nullable String help, @NotNull TermColor color,
                        @NotNull Action action) {
            options.add(new Option(opt, title, help, color, action));
        }

        void run() {
            final Console console = System.console();
            if (console == null) {
                throw new GradleException("System console is unavailable");
            }

            final StringBuilder error = new StringBuilder();
            loopingScreen(stop -> {
                // Run beforeLoop
                if (beforeLoop != null) {
                    beforeLoop.run();
                    beforeLoop = null;
                    println();
                }

                // Print last error
                if (error.length() > 0) {
                    printError(error.toString());
                    println();
                    error.replace(0, error.length(), "");
                }

                // Print title
                console.printf("%1s%n", title);

                // Print options
                for (Option option : options) {
                    printOption(option.opt, option.title, option.help, option.color);
                }

                // Print request
                String line = console.readLine("Option: ").trim();

                for (Option option : options) {
                    if (option.opt.equalsIgnoreCase(line)) {
                        stop.set(option.action.run());
                        return;
                    }
                }

                // Set error
                error.append("\nUnknown option '").append(line).append("'");
            });
        }

        private void loopingScreen(Consumer<AtomicBoolean> runnable) {
            final AtomicBoolean stop = new AtomicBoolean(false);
            final Console console = System.console();
            while (!stop.get()) {
                if (console != null) {
                    console.printf("%1s%2s", SCR_SAVE, SCR_CLR);
                } else {
                    System.out.printf("%1s%2s", SCR_SAVE, SCR_CLR);
                }
                try {
                    runnable.accept(stop);
                } finally {
                    if (console != null) {
                        console.printf("%1s", SCR_RESTORE);
                    } else {
                        System.out.printf("%1s", SCR_RESTORE);
                    }
                }
            }
        }
    }

    void interactiveConfig() {
        final Console console = System.console();
        if (console == null) {
            throw new GradleException("System console is unavailable");
        }
        final OptionScreen screen = new OptionScreen("Edit remote server configuration");
        int max = 0;
        for (Key<?> key : ALL_KEYS) {
            screen.add(Integer.toString(++max), key.key, key.description, FG_SET_CYAN, () -> {
                interactiveEditOption(key);
                return false;
            });
        }
        screen.add("l", "list", "show current configuration", FG_SET_MAGENTA, () -> {
            screen.beforeLoop = () -> {
                console.printf("Current remote server configuration:%n");
                for (Key<?> key : ALL_KEYS) {
                    Object value = settings.get(key);
                    String keyOpt = FG_SET_CYAN + key.key + FG_SET_DEFAULT;
                    if (value == null) {
                        console.printf("    %1s:%n", keyOpt);
                    } else {
                        console.printf("    %1s: %2s%n", keyOpt, value.toString());
                    }
                }
            };
            return false;
        });
        screen.add("t", "test", "test server connection", FG_SET_MAGENTA, () -> {
            screen.beforeLoop = () -> {
                try {
                    testConnection();
                } catch (Throwable t) {
                    printError(t.getMessage());
                }
            };
            return false;
        });
        screen.add("s", "save", "save configuration to moe.remotebuild.properties", FG_SET_MAGENTA, () -> {
            store();
            return false;
        });
        screen.add("x", "exit", "exit the configurator", FG_SET_MAGENTA, () -> {
            return true;
        });
        screen.add("sx", "save & exit", "save configuration and exit the configurator", FG_SET_MAGENTA, () -> {
            store();
            return true;
        });
        screen.run();
    }

    private void interactiveEditOption(Key<?> key) {
        final String keyOpt = FG_SET_CYAN + key.key + FG_SET_DEFAULT;
        final OptionScreen screen = new OptionScreen("Actions for " + keyOpt);
        screen.add("s", "set", null, FG_SET_MAGENTA, () -> {
            interactiveSetValue(key);
            return true;
        });
        screen.add("u", "unset", null, FG_SET_MAGENTA, () -> {
            settings.put(key, null);
            return true;
        });
        screen.add("c", "cancel", null, FG_SET_MAGENTA, () -> true);
        screen.run();
    }

    private void interactiveSetValue(Key<?> key) {
        final String keyOpt = FG_SET_CYAN + key.key + FG_SET_DEFAULT;

        final Console console = System.console();
        if (console == null) {
            throw new GradleException("System console is unavailable");
        }

        console.printf("%1s%2s", SCR_SAVE, SCR_CLR);
        try {
            while (true) {
                String line = console.readLine("Value for %1s: ", keyOpt);
                try {
                    settings.put(key, key.validator.validate(plugin, line));
                } catch (IOException e) {
                    printError(e.getMessage());
                    continue;
                }
                break;
            }
        } finally {
            console.printf("%1s", SCR_RESTORE);
        }
    }

    private static void printOption(String shrt, String lng, String help, TermColor color) {
        final Console console = System.console();
        if (console == null) {
            throw new GradleException("System console is unavailable");
        }
        if (help != null) {
            console.printf("    %1s - %2s%3s%4s (%5s)%n", shrt, color, lng, FG_SET_DEFAULT, help);
        } else {
            console.printf("    %1s - %2s%3s%4s%n", shrt, color, lng, FG_SET_DEFAULT);
        }
    }

    @NotNull
    public JSch getJSch() throws JSchException {
        final JSch jsch = new JSch();

        final Project project = plugin.getProject();
        final String knownhosts = get(KNOWNHOSTS_KEY);
        if (knownhosts != null) {
            final File file = getFileWithProperty(project, knownhosts);
            if (!file.exists()) {
                if (!file.getParentFile().mkdirs()) {
                    LOG.warn("mkdir failed for " + file.getAbsolutePath());
                }
                FileUtils.write(file, "");
            }
            jsch.setKnownHosts(file.getAbsolutePath());
        }

        final String identity = get(IDENTITY_KEY);
        if (identity != null) {
            final File file = getFileWithProperty(project, identity);
            jsch.addIdentity(file.getAbsolutePath());
        }

        return jsch;
    }

    @NotNull
    public Session getJSchSession(@NotNull JSch jsch) throws JSchException {
        Require.nonNull(jsch);

        final String host = get(HOST_KEY);
        if (host == null) {
            printError("host is not set");
            return null;
        }

        final String username = get(USER_KEY);
        final Integer port = get(PORT_KEY);
        return jsch.getSession(username, host, port == null ? 22 : port);
    }

    public void testConnection() {
        final Console console = System.console();
        if (console != null) {
            console.printf("Testing remote server connection:%n");
            console.printf("Connecting... (timeout: 30s)%n");
        } else {
            System.out.printf("Testing remote server connection:%n");
            System.out.printf("Connecting... (timeout: 30s)%n");
        }
        final Session session;
        try {
            session = getJSchSession(getJSch());
        } catch (JSchException e) {
            printError(e.getMessage());
            return;
        }

        session.setUserInfo(new UserInfo() {
            @Override
            public String getPassphrase() {
                return null;
            }

            @Override
            public String getPassword() {
                return null;
            }

            @Override
            public boolean promptPassword(String message) {
                return false;
            }

            @Override
            public boolean promptPassphrase(String message) {
                return false;
            }

            @Override
            public boolean promptYesNo(String message) {
                if (console == null) {
                    return true;
                }
                return askQuestion(message);
            }

            @Override
            public void showMessage(String message) {
                printWarning(message);
            }
        });
        try {
            session.connect(30000);
        } catch (JSchException e) {
            printError(e.getMessage());
            return;
        }

        if (console != null) {
            console.printf("%1sConnection successful%2s%n", FG_SET_CYAN, FG_SET_DEFAULT);
            console.printf("Testing keychain access%n");
        } else {
            System.out.printf("%1sConnection successful%2s%n", FG_SET_CYAN, FG_SET_DEFAULT);
            System.out.printf("Testing keychain access%n");
        }

        try {
            final ChannelExec channel;
            try {
                channel = (ChannelExec) session.openChannel("exec");
            } catch (JSchException e) {
                throw new GradleException(e.getMessage(), e);
            }

            final String kc_name = getKeychainName();
            final String kc_pass = getKeychainPass();
            final int kc_lock_to = getKeychainLockTimeout();

            channel.setCommand("" +
                    "security unlock-keychain -p '" + kc_pass + "' " + kc_name + " && " +
                    "security set-keychain-settings -t " + kc_lock_to + " -l " + kc_name + " && " +
                    "security lock-keychain " + kc_name);

            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            channel.setOutputStream(baos, true);
            channel.setErrStream(baos, true);

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

            final String output = baos.toString();

            try {
                baos.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.err);
            }

            channel.disconnect();
            if (channel.getExitStatus() == 0) {
                if (console != null) {
                    console.printf("%1sKeychain unlocked successfully%2s%n", FG_SET_CYAN, FG_SET_DEFAULT);
                } else {
                    System.out.printf("%1sKeychain unlocked successfully%2s%n", FG_SET_CYAN, FG_SET_DEFAULT);
                }
                session.disconnect();
                return;
            }
            printError("Failed to unlock keychain: " + output);
        } catch (Throwable ignore) {
            printError("Failed to unlock keychain: unknown error");
        }
    }

    private static void println() {
        final Console console = System.console();
        if (console != null) {
            console.printf("%n");
        } else {
            System.out.printf("%n");
        }
    }

    private static void printError(String msg) {
        final Console console = System.console();
        if (console != null) {
            console.printf("%1sError:%2s %3s%n", FG_SET_RED, FG_SET_DEFAULT, msg);
        } else {
            System.out.printf("%1sError:%2s %3s%n", FG_SET_RED, FG_SET_DEFAULT, msg);
        }
    }

    private static void printWarning(String msg) {
        final Console console = System.console();
        if (console != null) {
            console.printf("%1sWarning:%2s %3s%n", FG_SET_YELLOW, FG_SET_DEFAULT, msg);
        } else {
            System.out.printf("%1sWarning:%2s %3s%n", FG_SET_YELLOW, FG_SET_DEFAULT, msg);
        }
    }

    private static boolean askQuestion(String question) {
        final Console console = System.console();
        if (console == null) {
            throw new GradleException("System console is unavailable");
        }
        while (true) {
            String line = console.readLine("> " + question + " [y/n]: ");
            if ("y".equalsIgnoreCase(line) || "yes".equalsIgnoreCase(line)) {
                return true;
            } else if ("n".equalsIgnoreCase(line) || "no".equalsIgnoreCase(line)) {
                return false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public <T> T get(@NotNull Key<T> key) {
        Require.nonNull(key);
        return (T) settings.get(key);
    }

    private static int getInteger(String value) throws IOException {
        int i;
        try {
            i = Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            throw new IOException("'" + value + "' is not a number");
        }
        if (!Integer.toString(i).equals(value.trim())) {
            throw new IOException("'" + value + "' is not a number");
        }
        return i;
    }

    private static File getFileWithProperty(@NotNull Project project, @NotNull String path) {
        Require.nonNull(project);
        Require.nonNull(path);

        File file;
        final String[] comps = path.split("/");
        for (int idx = 0; idx < comps.length; idx++) {
            String comp = comps[idx];
            comps[idx] = getWithProperty(project, comp);
            while (!comp.equals(comps[idx])) {
                comp = comps[idx];
                comps[idx] = getWithProperty(project, comp);
            }
        }
        file = project.file(String.join(File.separator, Arrays.asList(comps)));
        return file;
    }

    private static String getWithProperty(@NotNull Project project, @NotNull String comp) {
        Require.nonNull(project);
        Require.nonNull(comp);

        if (comp.startsWith("$proj$")) {
            final String key = comp.substring("$proj$".length());
            if (!project.hasProperty(key)) {
                throw new GradleException("Project property '" + key + "' doesn't exist");
            }
            comp = project.property(key).toString();

        } else if (comp.startsWith("$sys$")) {
            final String key = comp.substring("$sys$".length());
            if (!System.getProperties().containsKey(key)) {
                throw new GradleException("System property '" + key + "' doesn't exist");
            }
            comp = System.getProperty(key);

        } else if (comp.startsWith("$env$")) {
            final String key = comp.substring("$env$".length());
            if (!System.getenv().containsKey(key)) {
                throw new GradleException("Environment variable '" + key + "' doesn't exist");
            }
            comp = System.getenv(key);
        }
        return comp;
    }
}
