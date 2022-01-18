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

package org.moe.common.utils;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Native library utility class.
 */
public class NativeUtil {
    /**
     * Resource loader class.
     */
    public static Class<?> LOADER_CLASS = NativeUtil.class;
    /**
     * Constant for Mac OS X.
     */
    public static final String OS_NAME_MAC_OS_X = "Mac OS X";
    /**
     * Constant for Mac OS X.
     */
    public static final String OS_NAME_WINDOWS = "Windows";
    /**
     * Constant for x86_64 arch.
     */
    public static final String OS_ARCH_X86_64 = "x86_64";
    /**
     * Constant array for x86_64 arch synonyms.
     */
    private static final String[] OS_ARCH_X86_64_SYNS = new String[] { OS_ARCH_X86_64, "amd64" };
    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(NativeUtil.class);
    /**
     * List of registered libraries.
     */
    private static final ArrayList<ArchSpecLibs> registeredLibs = new ArrayList<ArchSpecLibs>();
    /**
     * Flag for libraries were prepared.
     */
    private static boolean libsArePrepared = false;
    /**
     * Temporary directory for library files.
     */
    private static File temporaryDirectory = null;

    /**
     * Creates a new NativeUtil object.
     */
    private NativeUtil() {
    }

    /**
     * Initialize the native libraries.
     *
     * @return true on success
     */
    public static boolean initialize() {
        return prepareNativeLibraries();
    }

    /**
     * Returns the initialization state.
     *
     * @return true if already initialized
     */
    public static synchronized boolean isInitialized() {
        return libsArePrepared;
    }

    /**
     * Registers native libs for an os+arch combo.
     *
     * @param osName              OS name
     * @param osArch              OS arch
     * @param nativeLibs          native library resource paths
     * @param preloadedNativeLibs pre-loadable native library resource paths
     */
    public static synchronized void register(String osName, String osArch, NativeLib[] nativeLibs,
            NativeLib[] preloadedNativeLibs) {
        if (isInitialized()) {
            throw new IllegalStateException("already initialized");
        }
        if (osName == null || osArch == null) {
            throw new NullPointerException();
        }
        if (nativeLibs == null) {
            nativeLibs = new NativeLib[0];
        }
        if (preloadedNativeLibs == null) {
            preloadedNativeLibs = new NativeLib[0];
        }
        ArchSpecLibs spec = getArchSpec(osName, osArch);
        spec.nativeLibs.addAll(Arrays.asList(nativeLibs));
        spec.preloadedNativeLibs.addAll(Arrays.asList(preloadedNativeLibs));
        registeredLibs.add(spec);
    }

    /**
     * Retrieves an arch spec for the specified OS name and OS arch.
     *
     * @param osName OS name
     * @param osArch OS arch
     * @return arch spec
     */
    private static ArchSpecLibs getArchSpec(String osName, String osArch) {
        for (ArchSpecLibs lib : registeredLibs) {
            if (lib.matches(osName, osArch)) {
                return lib;
            }
        }
        return new ArchSpecLibs(new String[] { osName }, new String[] { osArch });
    }

    /**
     * Returns the temporary dir for the libraries. Creates it on demand.
     *
     * @return temporary directory
     */
    private static synchronized File getTempDir() {
        if (temporaryDirectory == null) {
            try {
                temporaryDirectory = File.createTempFile("temp", ".moe");
                if (!temporaryDirectory.delete()) {
                    LOG.error("Failed to remove temp file " + temporaryDirectory.getAbsolutePath());
                    return null;
                }
                if (!temporaryDirectory.mkdir()) {
                    LOG.error("Failed to create temp dir " + temporaryDirectory.getAbsolutePath());
                    return null;
                }
                temporaryDirectory.deleteOnExit();
            } catch (IOException e) {
                LOG.error("Failed to create temp dir for libraries.", e);
                return null;
            }

            String path_value = System.getProperty("java.library.path");
            if (path_value == null || path_value.length() == 0) {
                System.setProperty("java.library.path", temporaryDirectory.getAbsolutePath());
            } else {
                System.setProperty("java.library.path",
                        temporaryDirectory.getAbsolutePath() + File.pathSeparator + path_value);
            }
        }
        return temporaryDirectory;
    }

    /**
     * Returns the unified system name.
     *
     * @return the unified system name
     */
    public static String getUnifiedSystemName() {
        String os_name = System.getProperty("os.name");

        if (!OS_NAME_WINDOWS.equals(os_name) && os_name.toLowerCase().contains(OS_NAME_WINDOWS.toLowerCase())) {
            os_name = OS_NAME_WINDOWS;
        }

        return os_name;
    }

    /**
     * Returns the unified architecture.
     *
     * @return the unified architecture
     */
    private static String getUnifiedArchitecture() {
        String os_arch = System.getProperty("os.arch");

        if (ArrayUtil.containsCaseInsensitive(OS_ARCH_X86_64_SYNS, os_arch)) {
            os_arch = OS_ARCH_X86_64;
        }

        return os_arch;
    }

    public static boolean isHostAARCH64() {
        String arch = getUnifiedArchitecture();
        return (arch != null && arch.toLowerCase().contains("aarch64")) || isRunningInRosetta();
    }

    private static Boolean runningInRosetta = null;

    /**
     * Check if the process is running in rosetta
     *
     * https://developer.apple.com/documentation/apple-silicon/about-the-rosetta-translation-environment
     */
    private synchronized static boolean isRunningInRosetta() {
        if (runningInRosetta != null) {
            return runningInRosetta;
        }

        if (OsUtils.isMac()) {
            SimpleExec exec = SimpleExec.getExec("sysctl");
            List<String> execArgs = exec.getArguments();

            execArgs.add("-in");
            execArgs.add("sysctl.proc_translated");

            try {
                String out = ExecOutputCollector.collect(exec);
                runningInRosetta = "1".equals(out);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            runningInRosetta = false;
        }

        return runningInRosetta != null && runningInRosetta;
    }

    /**
     * Prepares the native libraries.
     *
     * @return true on success
     */
    private static synchronized boolean prepareNativeLibraries() {
        if (!libsArePrepared) {
            String os_name = getUnifiedSystemName();
            String os_arch = getUnifiedArchitecture();

            List<NativeLib> natives;
            List<NativeLib> natives_preload;

            ArchSpecLibs spec = getArchSpec(os_name, os_arch);
            natives = spec.nativeLibs;
            natives_preload = spec.preloadedNativeLibs;

            if (natives.size() == 0 && natives_preload.size() == 0) {
                LOG.error("This OS/architecture is not supported! (" + os_name + "/" + os_arch + ")");
                return false;
            }

            File temp = getTempDir();
            if (temp == null) {
                LOG.error("Failed to get temp directory");
                return false;
            }

            try {
                copyToTemp(natives, temp);
            } catch (IOException e) {
                LOG.error("Failed to copy native libraries", e);
                return false;
            }

            try {
                copyToTemp(natives_preload, temp);
            } catch (IOException e) {
                LOG.error("Failed to copy native libraries", e);
                return false;
            }

            preload(natives_preload, temp);

            libsArePrepared = true;
        }

        return true;
    }

    /**
     * Pre-loads libraries.
     *
     * @param natives natives to pre-load
     * @param temp    temp dir (where the natives are)
     */
    private static void preload(List<NativeLib> natives, File temp) {
        for (NativeLib lib : natives) {
            String path = new File(temp, lib.getExternalName()).getAbsolutePath();
            System.load(path);
        }
    }

    /**
     * Copies native libs to a temp dir.
     *
     * @param natives natives to copy
     * @param temp    temp dir to copy to
     * @throws IOException if an error occurs
     */
    private static void copyToTemp(List<NativeLib> natives, File temp) throws IOException {
        for (NativeLib lib : natives) {
            copyToTemp(lib, temp);
        }
    }

    /**
     * Copies a native to a temp dir.
     *
     * @param input native to copy
     * @param temp  temp dir to copy to
     * @return copy
     * @throws IOException if an error occurs
     */
    private static File copyToTemp(NativeLib input, File temp) throws IOException {
        String inFilePath = input.getInternalPath();
        String outFileName = input.getExternalName();

        File of = new File(temp, outFileName);
        of.createNewFile();
        of.deleteOnExit();
        InputStream is = LOADER_CLASS.getResourceAsStream(inFilePath);
        try {
            FileOutputStream fos = new FileOutputStream(of);
            try {
                byte buffer[] = new byte[64 * 1024];
                int read;
                while ((read = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }
            } finally {
                fos.close();
            }
        } finally {
            is.close();
        }
        return of;
    }

    /**
     * Arch specific library information.
     */
    private static class ArchSpecLibs {
        /**
         * Native libraries.
         */
        final List<NativeLib> nativeLibs;
        /**
         * Pre-loadable libraries.
         */
        final List<NativeLib> preloadedNativeLibs;
        /**
         * OS names.
         */
        String[] osNames;
        /**
         * OS architectures.
         */
        String[] osArchitectures;

        /**
         * Creates a new arch specific instance.
         *
         * @param osNames OS name
         * @param osArchs OS arch
         */
        private ArchSpecLibs(String[] osNames, String[] osArchs) {
            if (osNames == null || osArchs == null) {
                throw new NullPointerException();
            }
            this.osNames = osNames;
            this.osArchitectures = osArchs;
            this.nativeLibs = new ArrayList<NativeLib>();
            this.preloadedNativeLibs = new ArrayList<NativeLib>();
        }

        /**
         * Checks whether this arch spec matches the specified OS.
         *
         * @param osName OS name
         * @param osArch OS arch
         * @return true if matches
         */
        private boolean matches(String osName, String osArch) {
            return ArrayUtil.containsCaseInsensitive(osNames, osName) && ArrayUtil
                    .containsCaseInsensitive(osArchitectures, osArch);
        }
    }

    /**
     * Library information.
     */
    public static class NativeLib {
        /**
         * Internal resource name.
         */
        final String internalPath;
        /**
         * External copied name.
         */
        final String externalName;

        /**
         * Creates a new NativeLib instance.
         *
         * @param name internal and external name
         */
        public NativeLib(String name) {
            this(name, null);
        }

        /**
         * Creates a new NativeLib instance.
         *
         * @param internalPath internal name
         * @param externalName external name
         */
        public NativeLib(String internalPath, String externalName) {
            if (internalPath == null) {
                throw new NullPointerException();
            }
            if (externalName == null) {
                externalName = new File(internalPath).getName();
            }
            this.internalPath = internalPath;
            this.externalName = externalName;
        }

        /**
         * Returns the internal path.
         *
         * @return internal path
         */
        public String getInternalPath() {
            return internalPath;
        }

        /**
         * returns the external name.
         *
         * @return external name
         */
        public String getExternalName() {
            return externalName;
        }
    }
}
