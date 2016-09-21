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

package org.moe.natjgen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.clang.enums.CXIdxEntityKind;
import org.clang.enums.CXTypeKind;
import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXIdxObjCInterfaceDeclInfo;
import org.clang.struct.CXType;
import org.clang.util.StdHeaders;
import org.moe.natjgen.util.Path;
import org.moe.natjgen.util.XcodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Configuration implements IConfigurationElement {

    /**
     * Logger for this class
     */
    private static final Logger LOG = LoggerFactory.getLogger(Configuration.class);

    /**
     * Variable for the project's path
     */
    public static final String PROJECT_VARIABLE = "PROJECT";

    /**
     * Variable for the SDK's path
     */
    public static final String SDK_VARIABLE = "SDK";

    /**
     * Variable for the platform's base directory path
     */
    public static final String PLATFORM_BASE_VARIABLE = "PLATFORM_BASE";

    /**
     * Variable for the date & time of the generation
     */
    public static final String DATETIME_VARIABLE = "DATETIME";

    private static final String SDK_USR_INCLUDE_PATH = "${" + SDK_VARIABLE + "}/usr/include";
    private static final String APPLE_SDK_SYSTEM_LIBRARY_FRAMEWORKS_PATH =
            "${" + SDK_VARIABLE + "}/System/Library/Frameworks";

    /**
     * Create an empty Configuration
     */
    protected Configuration() {
    }

    /**
     * Create a new empty {@link Configuration}.
     *
     * @return new {@link Configuration}
     * @throws IOException
     */
    public static Configuration createEmpty() {
        return new Configuration();
    }

    /**
     * Create a new {@link Configuration} with default parameters.
     *
     * @return new {@link Configuration}
     * @throws IOException
     */
    public static Configuration createDefault() {
        Configuration conf = new Configuration();
        conf.headerFileResolvingPaths.add(SDK_USR_INCLUDE_PATH);
        conf.headerFileResolvingPaths.add(APPLE_SDK_SYSTEM_LIBRARY_FRAMEWORKS_PATH);
        return conf;
    }

    /**
     * Create a new {@link Configuration} from a file
     *
     * @param path path to the file
     * @return new {@link Configuration}
     * @throws IOException
     */
    public static Configuration createFromFile(String path) throws IOException {
        final InputStream is = new FileInputStream(path);

        Gson gson = getJsonBuilder().create();
        Configuration conf = gson.fromJson(new InputStreamReader(is), Configuration.class);
        if (conf == null) {
            conf = Configuration.createDefault();
        }

        is.close();

        return conf;
    }

    /**
     * Create a new {@link Configuration} from a string
     *
     * @param contents contents
     * @return new {@link Configuration}
     * @throws IOException
     */
    public static Configuration createWithContents(String contents) {
        Gson gson = getJsonBuilder().create();
        Configuration conf = gson.fromJson(contents, Configuration.class);
        if (conf == null) {
            conf = Configuration.createDefault();
        }

        return conf;
    }

    /**
     * iOS platform
     */
    public final static String PLATFORM_IOS = "iOS";

    /**
     * OS X platform
     */
    public final static String PLATFORM_OSX = "OS X";

    /**
     * tvOS platform
     */
    public final static String PLATFORM_TVOS = "tvOS";

    /**
     * NDK platform
     */
    public final static String PLATFORM_NDK = "NDK";

    /**
     * Platforms recognized by the configuration
     */
    private static final String platforms[] = new String[] { PLATFORM_IOS, PLATFORM_OSX, PLATFORM_TVOS, PLATFORM_NDK
    };

    /**
     * Returns the platforms recognized by the configuration
     *
     * @return platforms
     */
    public static String[] getPlatforms() {
        return platforms;
    }

    /**
     * Platform
     */
    private String platform = null;

    /**
     * Returns the platforms
     *
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the platform
     *
     * @param platform platform
     */
    public void setPlatform(String platform) {
        if (platform != null && platform.length() == 0) {
            platform = null;
        }
        this.platform = platform;
        Path sdKsBasePath = getSDKsBasePath();
        if (sdKsBasePath == null) {
            setVariable(Configuration.PLATFORM_BASE_VARIABLE, null);
        } else {
            setVariable(Configuration.PLATFORM_BASE_VARIABLE, sdKsBasePath.toString());
        }

        if (PLATFORM_IOS.equals(platform)) {
            return;
        } else if (PLATFORM_TVOS.equals(platform)) {
            return;
        } else if (PLATFORM_OSX.equals(platform)) {
            return;
        } else if (PLATFORM_NDK.equals(platform)) {
            return;
        }
        this.platform = null;
        throw new RuntimeException("Unupported platform: " + platform);
    }

    /**
     * Returns true if target platform is Apple
     *
     * @return true if target platform is Apple
     */
    public static boolean isApplePlatform(String platform) {
        if (PLATFORM_IOS.equals(platform)) {
            return true;
        } else if (PLATFORM_TVOS.equals(platform)) {
            return true;
        } else if (PLATFORM_OSX.equals(platform)) {
            return true;
        }
        return false;
    }

    /**
     * Returns true if target platform is Apple
     *
     * @return true if target platform is Apple
     */
    public boolean isApplePlatform() {
        return isApplePlatform(platform);
    }

    /**
     * Returns true if target platform is Android
     *
     * @return true if target platform is Android
     */
    public static boolean isAndroidPlatform(String platform) {
        if (PLATFORM_NDK.equals(platform)) {
            return true;
        }
        return false;
    }

    /**
     * Returns true if target platform is Android
     *
     * @return true if target platform is Android
     */
    public boolean isAndroidPlatform() {
        return isAndroidPlatform(platform);
    }

    /**
     * 32bit architecture's bit width
     */
    public final static int ARCH_32BIT = 32;

    /**
     * 64bit architecture's width
     */
    public final static int ARCH_64BIT = 64;

    /**
     * arm architecture: Android NDK
     */
    public final static String ARCH_ARM = "arm";

    /**
     * armv7 architecture: iOS
     */
    public final static String ARCH_ARMV7 = "armv7";

    /**
     * mips architecture: Android NDK
     */
    public final static String ARCH_MIPS = "mips";

    /**
     * i386 architecture: OS X
     */
    public final static String ARCH_I386 = "i386";

    /**
     * x86 architecture: Android NDK
     */
    public final static String ARCH_X86 = "x86";

    /**
     * arm64 architecture: iOS, tvOS, Android NDK
     */
    public final static String ARCH_ARM64 = "arm64";

    /**
     * mips64 architecture: Android NDK
     */
    public final static String ARCH_MIPS64 = "mips64";

    /**
     * x86_64 architecture: OS X, Android NDK
     */
    public final static String ARCH_X86_64 = "x86_64";

    /**
     * Archs recognized by the iOS platform
     */
    private static final String ARCHS_IOS_ARM[] = new String[] { ARCH_ARM64, ARCH_ARMV7
    };

    /**
     * Archs recognized by the OS X platform
     */
    private static final String ARCHS_OSX_X86[] = new String[] { ARCH_X86_64
            /* , ARCH_I386 */
    };

    /**
     * Archs recognized by the OS X platform
     */
    private static final String ARCHS_TVOS_ARM[] = new String[] { ARCH_ARM64
    };

    /**
     * Arm archs recognized by the Android NDK platform
     */
    private static final String ARCHS_NDK_ARM[] = new String[] { ARCH_ARM64, ARCH_ARM
    };

    /**
     * Mips archs recognized by the Android NDK platform
     */
    @SuppressWarnings("unused") private static final String ARCHS_NDK_MIPS[] = new String[] { ARCH_MIPS64, ARCH_MIPS
    };

    /**
     * X86 archs recognized by the Android NDK platform
     */
    @SuppressWarnings("unused") private static final String ARCHS_NDK_X86[] = new String[] { ARCH_X86_64, ARCH_X86
    };

    /**
     * Returns the archs recognized by the configuration
     *
     * @return archs
     */
    public String[] getArchs() {
        if (PLATFORM_IOS.equals(platform)) {
            return ARCHS_IOS_ARM;
        } else if (PLATFORM_OSX.equals(platform)) {
            return ARCHS_OSX_X86;
        } else if (PLATFORM_TVOS.equals(platform)) {
            return ARCHS_TVOS_ARM;
        } else if (PLATFORM_NDK.equals(platform)) {
            return ARCHS_NDK_ARM; // TODO: other archs?
        }
        throw new IllegalArgumentException();
    }

    /**
     * Returns the bit width of the specified architecture.
     *
     * @param arch architecture
     * @return bit width
     */
    public int getArchBitWidth(String arch) {
        if (arch.equals(ARCH_ARM)) {
            return ARCH_32BIT;
        } else if (arch.equals(ARCH_ARMV7)) {
            return ARCH_32BIT;
        } else if (arch.equals(ARCH_I386)) {
            return ARCH_32BIT;
        } else if (arch.equals(ARCH_X86)) {
            return ARCH_32BIT;
        } else if (arch.equals(ARCH_MIPS)) {
            return ARCH_32BIT;
        } else if (arch.equals(ARCH_ARM64)) {
            return ARCH_64BIT;
        } else if (arch.equals(ARCH_MIPS64)) {
            return ARCH_64BIT;
        } else if (arch.equals(ARCH_X86_64)) {
            return ARCH_64BIT;
        }
        throw new IllegalArgumentException("Invalid arch");
    }

    /**
     * Package base
     */
    private String packageBase = null;

    /**
     * Returns the specified package base
     *
     * @return package base
     */
    public String getPackageBase() {
        return packageBase;
    }

    /**
     * Sets the package base
     *
     * @param packageBase new package base
     */
    public void setPackageBase(String packageBase) {
        if (packageBase != null && packageBase.length() == 0) {
            packageBase = null;
        }

        this.packageBase = packageBase;
    }

    /**
     * Returns the SDKs path for the current platform
     *
     * @return
     */
    public Path getSDKsBasePath() {
        return XcodeUtil.getPlatformSDKsPath(platform);
    }

    /**
     * Base SDK's path
     */
    private String SDKPath = null;

    /**
     * Gets the base SDK's path
     *
     * @return base SDK's path
     */
    public String getSDKPath() {
        return SDKPath;
    }

    /**
     * Gets the base SDK's path
     *
     * @return base SDK's path
     */
    public String getDemangledSDKPath() {
        return getDemangledPath(SDKPath);
    }

    /**
     * Gets the base SDK's path for the specified architecture
     *
     * @param arch architecture
     * @return base SDK's path
     */
    public String getDemangledSDKPath(String arch) {
        if (isAndroidPlatform()) {
            return Path.compose(getDemangledSDKPath(), "arch-" + arch);
        }
        return getDemangledSDKPath();
    }

    /**
     * Sets the base SDK's path
     *
     * @param sdkPath base SDK's path
     */
    public void setSDKPath(String sdkPath) {
        if (sdkPath != null && sdkPath.length() == 0) {
            sdkPath = null;
        }

        SDKPath = getMangledString(sdkPath);
    }

    /**
     * Sets the base SDK's path without mangling
     *
     * @param sdkPath base SDK's path
     */
    public void setSDKPathDontMangle(String sdkPath) {
        if (sdkPath != null && sdkPath.length() == 0) {
            sdkPath = null;
        }

        SDKPath = sdkPath;
    }

    /**
     * Project-relative path of where the code will be generated
     */
    private String outputPackageFramgentRootPath = null;

    /**
     * Returns the output package fragment root's relative path
     *
     * @return path
     */
    public String getOutputPackageFramgentRootPath() {
        return outputPackageFramgentRootPath;
    }

    /**
     * Sets the output package fragment root's relative path
     *
     * @param outputPackageFramgentRootPath path
     */
    public void setOutputPackageFramgentRootPath(String outputPackageFramgentRootPath) {
        if (outputPackageFramgentRootPath != null && outputPackageFramgentRootPath.length() == 0) {
            outputPackageFramgentRootPath = null;
        }

        this.outputPackageFramgentRootPath = outputPackageFramgentRootPath;
    }

    /**
     * A list of header search paths
     */
    private final ArrayList<String> headerSearchPaths = new ArrayList<String>();

    /**
     * Returns a list of header search paths
     *
     * @return paths
     */
    public ArrayList<String> getHeaderSearchPaths() {
        return headerSearchPaths;
    }

    /**
     * A list of user header search paths
     */
    private final ArrayList<String> userHeaderSearchPaths = new ArrayList<String>();

    /**
     * Returns a list of user header search paths
     *
     * @return paths
     */
    public ArrayList<String> getUserHeaderSearchPaths() {
        return userHeaderSearchPaths;
    }

    /**
     * A list of framework search paths
     */
    private final ArrayList<String> frameworkSearchPaths = new ArrayList<String>();

    /**
     * Returns a list of framework search paths
     *
     * @return paths
     */
    public ArrayList<String> getFrameworkSearchPaths() {
        return frameworkSearchPaths;
    }

    /**
     * A list of paths for resolving header files paths
     */
    private final ArrayList<String> headerFileResolvingPaths = new ArrayList<String>();

    /**
     * Returns a list of paths for resolving header files paths
     *
     * @return paths
     */
    public ArrayList<String> getHeaderFileResolvingPaths() {
        return headerFileResolvingPaths;
    }

    /**
     * A list for other C flags
     */
    private final ArrayList<String> otherCFlags = new ArrayList<String>();

    /**
     * Returns the other C flags' list
     *
     * @return paths
     */
    public ArrayList<String> getOtherCFlags() {
        return otherCFlags;
    }

    /**
     * Flag for injecting default C flags
     */
    private boolean injectDefaultCFlags = true;

    /**
     * Returns flag for injecting default C flags
     *
     * @return flag for injecting default C flags
     */
    public boolean getInjectDefaultCFlags() {
        return injectDefaultCFlags;
    }

    /**
     * Set flag for injecting default C flags
     *
     * @param injectDefaultCFlags flag value
     */
    public void setInjectDefaultCFlags(boolean injectDefaultCFlags) {
        this.injectDefaultCFlags = injectDefaultCFlags;
    }

    /**
     * Flag for using included standard headers
     */
    private boolean useIncludedStandardHeaders = true;

    /**
     * Returns flag for using included standard headers
     *
     * @return flag for using included standard headers
     */
    public boolean getUseIncludedStandardHeaders() {
        return useIncludedStandardHeaders;
    }

    /**
     * Set flag for using included standard headers
     *
     * @param useIncludedStandardHeaders flag value
     */
    public void setUseIncludedStandardHeaders(boolean useIncludedStandardHeaders) {
        this.useIncludedStandardHeaders = useIncludedStandardHeaders;
    }

    /**
     * The source code to be parsed
     */
    private String sourceCode = "";

    /**
     * Returns the source code which will be parsed
     *
     * @return source code
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the source code which will be parsed
     *
     * @param sourceCode source to parse
     */
    public void setSourceCode(String sourceCode) {
        if (sourceCode == null) {
            this.sourceCode = "";
        } else {
            this.sourceCode = sourceCode;
        }
    }

    /**
     * Docsets enabled for this configuration
     */
    private final ArrayList<String> docsets = new ArrayList<String>();

    /**
     * Return a list of docsets enabled for this configuration
     *
     * @return Array of docset names
     */
    public ArrayList<String> getDocsets() {
        return docsets;
    }

    /**
     * Path to the log files directory
     */
    private String loggingPath = null;

    /**
     * Get path to log files directory
     *
     * @return log files directory path
     */
    public String getLoggingPath() {
        return loggingPath;
    }

    /**
     * Get path to log files directory
     *
     * @return log files directory path
     */
    public String getDemangledLoggingPath() {
        return loggingPath == null ? null : getDemangledPath(loggingPath);
    }

    /**
     * Set path for log files directory
     *
     * @param loggingPath directory's path
     */
    public void setLoggingPath(String loggingPath) {
        if (loggingPath != null && loggingPath.length() == 0) {
            this.loggingPath = null;
        } else {
            this.loggingPath = loggingPath;
        }
    }

    /**
     * Unit action manager for the configuration
     */
    private UnitActionManager manager = new UnitActionManager();

    /**
     * Returns the unit action manager associated with the configuration
     *
     * @return unit action manager
     */
    public UnitActionManager getUnitActionManager() {
        return manager;
    }

    /**
     * Returns a unit info object for declaration
     *
     * @param decl declaration info
     * @return unit with applied rules
     */
    public Unit getUnit(CXIdxDeclInfo decl) {
        Unit u = new Unit(decl, packageBase, this);
        manager.applyRules(u);
        return u;
    }

    /**
     * Returns a unit info object for declaration
     *
     * @param decl       declaration info
     * @param opaqueType OpaquePtr type
     * @return unit with applied rules
     */
    public Unit getUnit(CXIdxDeclInfo decl, Type opaqueType) {
        Unit u = new Unit(decl, packageBase, this, opaqueType);
        manager.applyRules(u);
        return u;
    }

    /**
     * Map for the variables to replace
     */
    private HashMap<String, String> variableMap = new HashMap<String, String>();

    /**
     * Set variable value
     *
     * @param var   variable name
     * @param value value
     */
    public void setVariable(String var, String value) {
        if (value == null) {
            variableMap.remove(var);
        } else {
            variableMap.put(var, value);
        }
    }

    /**
     * Input type configuration file path
     */
    private String inputTypeConfigurationPath;

    /**
     * Returns the input type configuration's file path
     *
     * @return file path
     */
    public String getInputTypeConfigurationPath() {
        return inputTypeConfigurationPath;
    }

    /**
     * Returns the demangled input type configuration's file path
     *
     * @return file path
     */
    public String getDemangledInputTypeConfigurationPath() {
        if (inputTypeConfigurationPath == null) {
            return null;
        }
        return getDemangledPath(inputTypeConfigurationPath);
    }

    /**
     * Sets the input type configuration's file path
     *
     * @param inputTypeConfigurationPath new file path
     */
    public void setInputTypeConfigurationPath(String inputTypeConfigurationPath) {
        if (inputTypeConfigurationPath != null && inputTypeConfigurationPath.length() == 0) {
            inputTypeConfigurationPath = null;
        }
        this.inputTypeConfigurationPath = inputTypeConfigurationPath;
    }

    /**
     * Output type configuration file path
     */
    private String outputTypeConfigurationPath;

    /**
     * Returns the output type configuration's file path
     *
     * @return file path
     */
    public String getOutputTypeConfigurationPath() {
        return outputTypeConfigurationPath;
    }

    /**
     * Returns the demangled output type configuration's file path
     *
     * @return file path
     */
    public String getDemangledOutputTypeConfigurationPath() {
        if (outputTypeConfigurationPath == null) {
            return null;
        }
        return getDemangledPath(outputTypeConfigurationPath);
    }

    /**
     * Sets the output type configuration's file path
     *
     * @param outputTypeConfigurationPath new file path
     */
    public void setOutputTypeConfigurationPath(String outputTypeConfigurationPath) {
        if (outputTypeConfigurationPath != null && outputTypeConfigurationPath.length() == 0) {
            outputTypeConfigurationPath = null;
        }
        this.outputTypeConfigurationPath = outputTypeConfigurationPath;
    }

    /**
     * Output type configuration should be created from scratch when this is
     * true. Otherwise it will be based on input type configuration
     */
    private boolean cleanOutputTypeConfiguration = false;

    /**
     * Return's whether the output type configuration should be created from
     * scratch or based on the input file configuration
     *
     * @return true if it should be clean, otherwise false
     */
    public boolean isCleanOutputTypeConfiguration() {
        return cleanOutputTypeConfiguration;
    }

    /**
     * Set to true when the output type configuration should be created from
     * scratch, this will not copy any unused entries from the input type
     * configuration. Otherwise set to false, this way the output type
     * configuration will be based on the input file configuration
     *
     * @param cleanOutputTypeConfiguration true if output should be clean
     */
    public void setCleanOutputTypeConfiguration(boolean cleanOutputTypeConfiguration) {
        this.cleanOutputTypeConfiguration = cleanOutputTypeConfiguration;
    }

    /**
     * Inline functions native binding output path
     */
    private String inlineFunctionsNativeBindingOutputPath;

    /**
     * Returns the inline functions native binding output path
     *
     * @return file path
     */
    public String getInlineFunctionsNativeBindingOutputPath() {
        return inlineFunctionsNativeBindingOutputPath;
    }

    /**
     * Returns the demangled inline functions native binding output path
     *
     * @return file path
     */
    public String getDemangledInlineFunctionsNativeBindingOutputPath() {
        if (inlineFunctionsNativeBindingOutputPath == null) {
            return null;
        }
        return getDemangledPath(inlineFunctionsNativeBindingOutputPath);
    }

    /**
     * Sets the inline functions native binding output path
     *
     * @param inlineFunctionsNativeBindingOutputPath new file path
     */
    public void setInlineFunctionsNativeBindingOutputPath(String inlineFunctionsNativeBindingOutputPath) {
        if (inlineFunctionsNativeBindingOutputPath != null && inlineFunctionsNativeBindingOutputPath.length() == 0) {
            inlineFunctionsNativeBindingOutputPath = null;
        }
        this.inlineFunctionsNativeBindingOutputPath = inlineFunctionsNativeBindingOutputPath;
    }

    /**
     * Validate configuration settings
     *
     * @return true if settings are valid otherwise false
     */
    public ArrayList<ValidationEntry> validate() {
        ArrayList<ValidationEntry> problems = getProblems();
        return problems.size() == 0 ? null : problems;
    }

    @Override
    public ArrayList<ValidationEntry> getProblems() {
        ArrayList<ValidationEntry> problems = new ArrayList<ValidationEntry>();

        if (platform == null) {
            problems.add(new ValidationEntry(ValidationEntry.ERROR, "Platform is not specified!", CONFKEY_PLATFORM));
            problems.add(new ValidationEntry(ValidationEntry.INFO,
                    "- Supported values are: " + Arrays.asList(getPlatforms())));
        } else if (!Arrays.asList(getPlatforms()).contains(platform)) {
            problems.add(new ValidationEntry(ValidationEntry.ERROR, "Platform is not recognized!", CONFKEY_PLATFORM));
            problems.add(new ValidationEntry(ValidationEntry.INFO, "- The value is case sensitive!"));
            problems.add(new ValidationEntry(ValidationEntry.INFO,
                    "- Supported values are: " + Arrays.asList(getPlatforms())));
        }

        if (isApplePlatform() || isAndroidPlatform()) {
            File f = new File(SDKPath);
            if (SDKPath == null || SDKPath.length() == 0) {
                problems.add(new ValidationEntry(ValidationEntry.ERROR, "The specified platform requires a SDK!",
                        CONFKEY_BASE_SDK));
            } else if (!f.exists()) {
                problems.add(new ValidationEntry(ValidationEntry.WARNING,
                        "The specified SDK path does not exist on your computer!", CONFKEY_BASE_SDK));
            } else if (!f.canRead()) {
                problems.add(new ValidationEntry(ValidationEntry.WARNING, "The specified SDK cannot be accessed!",
                        CONFKEY_BASE_SDK));
            }
        }

        if (packageBase != null && packageBase.length() > 0 && !packageBase.matches("[\\w]+(\\.[\\w]+)*")) {
            problems.add(new ValidationEntry(ValidationEntry.ERROR, "Package base is malformed!", CONFKEY_PKG_BASE));
            problems.add(new ValidationEntry(ValidationEntry.INFO,
                    "- Package base should be something like 'com.mypackage'."));
        }

        if (outputPackageFramgentRootPath == null || outputPackageFramgentRootPath.length() == 0) {
            problems.add(new ValidationEntry(ValidationEntry.ERROR, "Output path for the source is not defined!",
                    CONFKEY_OUTPUT));
            problems.add(new ValidationEntry(ValidationEntry.INFO,
                    "- The output path must be the name of a source folder."));
        }

        return problems;
    }

    public static final String CONFKEY_PLATFORM = "platform";
    public static final String CONFKEY_PKG_BASE = "package-base";
    public static final String CONFKEY_BASE_SDK = "base-sdk";
    public static final String CONFKEY_HEADER_SEARCH_PATHS = "header-search-paths";
    public static final String CONFKEY_USER_HEADER_SEARCH_PATHS = "user-header-search-paths";
    public static final String CONFKEY_FRAMEWORK_SEARCH_PATHS = "framework-search-paths";
    public static final String CONFKEY_SOURCE = "source";
    public static final String CONFKEY_OUTPUT = "output";
    public static final String CONFKEY_DOCSETS = "docsets";
    public static final String CONFKEY_UNIT_ACTION_MANAGER = "unit-rules";
    public static final String CONFKEY_LOGS_PATH = "logs-path";
    public static final String CONFKEY_TYPE_CONFIG_INPUT_PATH = "type-config-input";
    public static final String CONFKEY_TYPE_CONFIG_OUTPUT_PATH = "type-config-output";
    public static final String CONFKEY_TYPE_CONFIG_CLEAN_OUTPUT = "type-config-clean-output";
    public static final String CONFKEY_HEADER_FILE_RESOLVING_PATHS = "header-file-resolving-paths";
    public static final String CONFKEY_INLINE_FUNCTION_BINDING_OUTPUT_PATH = "inline-function-binding-output";
    public static final String CONFKEY_OTHER_CFLAGS = "other-cflags";
    public static final String CONFKEY_INJECT_DEFAULT_CFLAGS = "inject-default-cflags";
    public static final String CONFKEY_USE_INCLUDED_STD_HEADERS = "use-included-std-headers";

    private static GsonBuilder getJsonBuilder() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Configuration.class, new Configuration.Serializer());
        builder.registerTypeAdapter(Configuration.class, new Configuration.Deserializer());
        builder.registerTypeAdapter(UnitActionManager.class, new UnitActionManager.Serializer());
        builder.registerTypeAdapter(UnitActionManager.class, new UnitActionManager.Deserializer());
        builder.registerTypeAdapter(UnitRule.class, new UnitRule.Serializer());
        builder.registerTypeAdapter(UnitRule.class, new UnitRule.Deserializer());
        builder.registerTypeAdapter(Condition.class, new Condition.Serializer());
        builder.registerTypeAdapter(Condition.class, new Condition.Deserializer());
        builder.registerTypeAdapter(Action.class, new Action.Serializer());
        builder.registerTypeAdapter(Action.class, new Action.Deserializer());
        builder.setPrettyPrinting();
        return builder;
    }

    private static class Serializer implements JsonSerializer<Configuration> {

        @Override
        public JsonElement serialize(Configuration src, java.lang.reflect.Type typeOfSrc,
                JsonSerializationContext context) {
            JsonObject obj = new JsonObject();

            obj.addProperty(CONFKEY_PLATFORM, src.getPlatform());
            obj.addProperty(CONFKEY_PKG_BASE, src.getPackageBase());
            obj.addProperty(CONFKEY_BASE_SDK, src.getSDKPath());

            {
                JsonArray array = new JsonArray();
                for (String str : src.getHeaderSearchPaths()) {
                    array.add(context.serialize(str, String.class));
                }
                obj.add(CONFKEY_HEADER_SEARCH_PATHS, array);
            }

            {
                JsonArray array = new JsonArray();
                for (String str : src.getUserHeaderSearchPaths()) {
                    array.add(context.serialize(str, String.class));
                }
                obj.add(CONFKEY_USER_HEADER_SEARCH_PATHS, array);
            }

            {
                JsonArray array = new JsonArray();
                for (String str : src.getFrameworkSearchPaths()) {
                    array.add(context.serialize(str, String.class));
                }
                obj.add(CONFKEY_FRAMEWORK_SEARCH_PATHS, array);
            }

            obj.addProperty(CONFKEY_SOURCE, src.getSourceCode());
            obj.addProperty(CONFKEY_OUTPUT, src.getOutputPackageFramgentRootPath());

            {
                JsonArray array = new JsonArray();
                for (String str : src.getDocsets()) {
                    array.add(context.serialize(str, String.class));
                }
                obj.add(CONFKEY_DOCSETS, array);
            }

            obj.add(CONFKEY_UNIT_ACTION_MANAGER, context.serialize(src.manager, UnitActionManager.class));

            obj.addProperty(CONFKEY_LOGS_PATH, src.getLoggingPath());

            obj.addProperty(CONFKEY_TYPE_CONFIG_INPUT_PATH, src.getInputTypeConfigurationPath());
            obj.addProperty(CONFKEY_TYPE_CONFIG_OUTPUT_PATH, src.getOutputTypeConfigurationPath());
            obj.addProperty(CONFKEY_TYPE_CONFIG_CLEAN_OUTPUT, src.isCleanOutputTypeConfiguration());

            {
                JsonArray array = new JsonArray();
                for (String str : src.getHeaderFileResolvingPaths()) {
                    array.add(context.serialize(str, String.class));
                }
                obj.add(CONFKEY_HEADER_FILE_RESOLVING_PATHS, array);
            }

            obj.addProperty(CONFKEY_INLINE_FUNCTION_BINDING_OUTPUT_PATH,
                    src.getInlineFunctionsNativeBindingOutputPath());

            {
                JsonArray array = new JsonArray();
                for (String str : src.getOtherCFlags()) {
                    array.add(context.serialize(str, String.class));
                }
                obj.add(CONFKEY_OTHER_CFLAGS, array);
            }

            obj.addProperty(CONFKEY_INJECT_DEFAULT_CFLAGS, src.getInjectDefaultCFlags());

            obj.addProperty(CONFKEY_USE_INCLUDED_STD_HEADERS, src.getUseIncludedStandardHeaders());

            return obj;
        }

    }

    private static class Deserializer implements JsonDeserializer<Configuration> {

        @Override
        public Configuration deserialize(JsonElement element, java.lang.reflect.Type typeOfSrc,
                JsonDeserializationContext context) throws JsonParseException {
            if (element.isJsonObject()) {
                Configuration conf = Configuration.createEmpty();

                JsonObject o = element.getAsJsonObject();
                try {
                    conf.setPlatform((String)context.deserialize(o.get(CONFKEY_PLATFORM), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_PLATFORM + "'");
                }

                try {
                    conf.setPackageBase((String)context.deserialize(o.get(CONFKEY_PKG_BASE), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_PKG_BASE + "'");
                }

                try {
                    conf.setSDKPathDontMangle((String)context.deserialize(o.get(CONFKEY_BASE_SDK), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_BASE_SDK + "'");
                }

                try {
                    JsonArray array = o.getAsJsonArray(CONFKEY_HEADER_SEARCH_PATHS);
                    if (array != null) {
                        conf.getHeaderSearchPaths().clear();
                        for (JsonElement str : array) {
                            conf.getHeaderSearchPaths().add(str.getAsString());
                        }
                    }
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_HEADER_SEARCH_PATHS + "'");
                }

                try {
                    JsonArray array = o.getAsJsonArray(CONFKEY_USER_HEADER_SEARCH_PATHS);
                    if (array != null) {
                        conf.getUserHeaderSearchPaths().clear();
                        for (JsonElement str : array) {
                            conf.getUserHeaderSearchPaths().add(str.getAsString());
                        }
                    }
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_USER_HEADER_SEARCH_PATHS + "'");
                }

                try {
                    JsonArray array = o.getAsJsonArray(CONFKEY_FRAMEWORK_SEARCH_PATHS);
                    if (array != null) {
                        conf.getFrameworkSearchPaths().clear();
                        for (JsonElement str : array) {
                            conf.getFrameworkSearchPaths().add(str.getAsString());
                        }
                    }
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_FRAMEWORK_SEARCH_PATHS + "'");
                }

                try {
                    conf.setSourceCode((String)context.deserialize(o.get(CONFKEY_SOURCE), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_SOURCE + "'");
                }

                try {
                    conf.setOutputPackageFramgentRootPath(
                            (String)context.deserialize(o.get(CONFKEY_OUTPUT), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_OUTPUT + "'");
                }

                try {
                    JsonArray array = o.getAsJsonArray(CONFKEY_DOCSETS);
                    if (array != null) {
                        conf.getDocsets().clear();
                        for (JsonElement str : array) {
                            conf.getDocsets().add(str.getAsString());
                        }
                    }
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_DOCSETS + "'");
                }

                try {
                    conf.manager = context.deserialize(o.get(CONFKEY_UNIT_ACTION_MANAGER), UnitActionManager.class);
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_UNIT_ACTION_MANAGER + "'");
                }

                try {
                    conf.setLoggingPath((String)context.deserialize(o.get(CONFKEY_LOGS_PATH), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_LOGS_PATH + "'");
                }

                try {
                    conf.setInputTypeConfigurationPath(
                            (String)context.deserialize(o.get(CONFKEY_TYPE_CONFIG_INPUT_PATH), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_TYPE_CONFIG_INPUT_PATH + "'");
                }

                try {
                    conf.setOutputTypeConfigurationPath(
                            (String)context.deserialize(o.get(CONFKEY_TYPE_CONFIG_OUTPUT_PATH), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_TYPE_CONFIG_OUTPUT_PATH + "'");
                }

                try {
                    conf.setCleanOutputTypeConfiguration(
                            (Boolean)context.deserialize(o.get(CONFKEY_TYPE_CONFIG_CLEAN_OUTPUT), Boolean.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_TYPE_CONFIG_CLEAN_OUTPUT + "'");
                }

                try {
                    JsonArray array = o.getAsJsonArray(CONFKEY_HEADER_FILE_RESOLVING_PATHS);
                    if (array != null) {
                        conf.getHeaderFileResolvingPaths().clear();
                        for (JsonElement str : array) {
                            conf.getHeaderFileResolvingPaths().add(str.getAsString());
                        }
                    }
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_HEADER_FILE_RESOLVING_PATHS + "'");
                }

                try {
                    conf.setInlineFunctionsNativeBindingOutputPath((String)context
                            .deserialize(o.get(CONFKEY_INLINE_FUNCTION_BINDING_OUTPUT_PATH), String.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_INLINE_FUNCTION_BINDING_OUTPUT_PATH + "'");
                }

                try {
                    JsonArray array = o.getAsJsonArray(CONFKEY_OTHER_CFLAGS);
                    if (array != null) {
                        conf.getOtherCFlags().clear();
                        for (JsonElement str : array) {
                            conf.getOtherCFlags().add(str.getAsString());
                        }
                    }
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_OTHER_CFLAGS + "'");
                }

                try {
                    conf.setInjectDefaultCFlags(
                            (Boolean)context.deserialize(o.get(CONFKEY_INJECT_DEFAULT_CFLAGS), Boolean.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_INJECT_DEFAULT_CFLAGS + "'");
                }

                try {
                    conf.setUseIncludedStandardHeaders(
                            (Boolean)context.deserialize(o.get(CONFKEY_USE_INCLUDED_STD_HEADERS), Boolean.class));
                } catch (Exception ex) {
                    LOG.info("Failed to read natjgen key '" + CONFKEY_USE_INCLUDED_STD_HEADERS + "'");
                }

                return conf;
            }

            return null;
        }

    }

    /**
     * Save configuration information to a file
     *
     * @param path file path
     * @throws IOException
     */
    public void saveToFile(String path) throws IOException {
        try {
            final OutputStream os = new FileOutputStream(path);
            final PrintStream printStream = new PrintStream(os);

            Gson gson = getJsonBuilder().create();
            String rep = gson.toJson(this);
            printStream.append(rep);

            printStream.close();
            os.close();
        } catch (IOException e) {
            LOG.error("Failed to write log!", e);
        }
    }

    /**
     * Get configuration information as string
     *
     * @return Configuration as string
     */
    public String getString() {
        Gson gson = getJsonBuilder().create();
        return gson.toJson(this);
    }

    public String[] getCMDLine(String arch) {
        if (!Arrays.asList(getArchs()).contains(arch)) {
            throw new IllegalArgumentException();
        }

        final ArrayList<String> cmdlineArgs = new ArrayList<String>(32);

        if (getInjectDefaultCFlags()) {
            cmdlineArgs.add("-arch");
            cmdlineArgs.add(arch);

            if (isApplePlatform()) {
                // Force source to Objective-C
                cmdlineArgs.add("-x");
                cmdlineArgs.add("objective-c");

                // Set other flags
                cmdlineArgs.add("-fmessage-length=133");
                cmdlineArgs.add("-std=c99");
                cmdlineArgs.add("-fobjc-arc");
                cmdlineArgs.add("-fpascal-strings");

                // Define macros
                cmdlineArgs.add("-DNS_BLOCK_ASSERTIONS=1");
                cmdlineArgs.add("-DOBJC_OLD_DISPATCH_PROTOTYPES=0");

                // Set isysroot
                if (getSDKPath() != null) {
                    cmdlineArgs.add("-isysroot");
                    cmdlineArgs.add(getDemangledSDKPath());
                }

                // Set minimum OS version
                if (PLATFORM_IOS.equals(getPlatform())) {
                    cmdlineArgs.add("-miphoneos-version-min=9.0");
                } else if (PLATFORM_TVOS.equals(getPlatform())) {
                    cmdlineArgs.add("-mappletvos-version-min=9.0");
                } else if (PLATFORM_OSX.equals(getPlatform())) {
                    cmdlineArgs.add("-mmacosx-version-min=11.0");
                }
            } else if (isAndroidPlatform()) {
                // Force source to C
                cmdlineArgs.add("-x");
                cmdlineArgs.add("c");

                // Set target
                cmdlineArgs.add("-target");
                if (arch.equals(ARCH_ARM)) {
                    cmdlineArgs.add("armv5te-none-linux-androideabi");

                } else if (arch.equals(ARCH_ARMV7)) {
                    throw new RuntimeException("Unexpected arch " + arch + " for platform " + platform);

                } else if (arch.equals(ARCH_I386)) {
                    throw new RuntimeException("Unexpected arch " + arch + " for platform " + platform);

                } else if (arch.equals(ARCH_X86)) {
                    cmdlineArgs.add("i686-none-linux-android");

                } else if (arch.equals(ARCH_MIPS)) {
                    cmdlineArgs.add("mipsel-none-linux-android");

                } else if (arch.equals(ARCH_ARM64)) {
                    cmdlineArgs.add("aarch64-none-linux-android");

                } else if (arch.equals(ARCH_MIPS64)) {
                    cmdlineArgs.add("mips64el-none-linux-android");

                } else if (arch.equals(ARCH_X86_64)) {
                    cmdlineArgs.add("x86_64-none-linux-android");
                }

                // Set other flags
                cmdlineArgs.add("-fmessage-length=133");
                cmdlineArgs.add("-std=c99");
                cmdlineArgs.add("-fpascal-strings");

                // Add NDK arch-path
                if (getSDKPath() != null) {
                    cmdlineArgs.add("-I" + new File(getDemangledSDKPath(arch), "usr/include").getAbsolutePath());
                }
            }
        }

        // Add other CFLAGS
        for (String flag : getOtherCFlags()) {
            cmdlineArgs.add(flag);
        }

        // Add include paths for '#include <...>'
        for (String path : getHeaderSearchPaths()) {
            cmdlineArgs.add("-I" + getDemangledPath(path));
        }
        if (getUseIncludedStandardHeaders()) {
            try {
                cmdlineArgs.add("-I" + StdHeaders.getPath());
            } catch (RuntimeException ex) {
                LOG.error("Failed to add standard header search path", ex);
            }
        }

        // Add include paths for '#include "..."'
        for (String path : getUserHeaderSearchPaths()) {
            cmdlineArgs.add("-iquote" + getDemangledPath(path));
        }

        // Add include paths for '#include <.../...>'
        for (String path : getFrameworkSearchPaths()) {
            cmdlineArgs.add("-F" + getDemangledPath(path));
        }

        String args[] = new String[cmdlineArgs.size()];
        cmdlineArgs.toArray(args);
        return args;
    }

    /**
     * Demangle a path value, replace variables with proper values
     *
     * @param path path to demangle
     * @return demangled path
     */
    private String getDemangledPath(String path) {
        Iterator<Entry<String, String>> it = variableMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            String key = "${" + entry.getKey() + "}";
            int idx = path.indexOf(key);
            if (idx != -1) {
                String pre = path.substring(0, idx);
                String post = path.substring(idx + key.length());
                path = Path.compose(pre + entry.getValue() + post);
            }
        }
        return path;
    }

    /**
     * A mangled path value, substrings with variables
     *
     * @param path path to mangle
     * @return mangled path
     */
    public String getMangledString(String path) {
        if (path == null) {
            throw new NullPointerException();
        }
        path = Path.canonicalize(path);

        Iterator<Entry<String, String>> it = variableMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            String key = "${" + entry.getKey() + "}";
            int idx = path.indexOf(entry.getValue());
            if (idx != -1 && entry.getValue() != null && entry.getValue().length() != 0) {
                String pre = path.substring(0, idx);
                String post = path.substring(idx + entry.getValue().length());
                path = pre + key + post;
            }
        }
        return path;
    }

    public static class UnitActionManager implements IConfigurationElement {

        /**
         * List of unit rules
         */
        private final ArrayList<UnitRule> unitRules = new ArrayList<UnitRule>();

        /**
         * Returns all the unit rules in the manager
         *
         * @return list of unit rules
         */
        public ArrayList<UnitRule> getUnitRules() {
            return unitRules;
        }

        /**
         * Try to apply rules to the unit
         *
         * @param unit unit to apply the rules to
         */
        public void applyRules(Unit unit) {
            for (UnitRule unitrule : unitRules) {
                if (unit.isFinalized()) {
                    return;
                }
                unitrule.applyRule(unit);
            }
        }

        private static class Serializer implements JsonSerializer<UnitActionManager> {

            @Override
            public JsonElement serialize(UnitActionManager src, java.lang.reflect.Type typeOfSrc,
                    JsonSerializationContext context) {
                JsonArray unitrules = new JsonArray();
                for (UnitRule unitRule : src.unitRules) {
                    unitrules.add(context.serialize(unitRule));
                }
                return unitrules;
            }

        }

        private static class Deserializer implements JsonDeserializer<UnitActionManager> {

            @Override
            public UnitActionManager deserialize(JsonElement element, java.lang.reflect.Type typeOfSrc,
                    JsonDeserializationContext context) throws JsonParseException {
                if (element.isJsonArray()) {
                    UnitActionManager manager = new UnitActionManager();
                    for (JsonElement unitRule : element.getAsJsonArray()) {
                        manager.unitRules.add((UnitRule)context.deserialize(unitRule, UnitRule.class));
                    }
                    return manager;
                }

                LOG.error("element type is incorrect");
                return null;
            }

        }

        @Override
        public ArrayList<ValidationEntry> getProblems() {
            ArrayList<ValidationEntry> problems = new ArrayList<ValidationEntry>();
            for (UnitRule unitrule : unitRules) {
                problems.addAll(unitrule.getProblems());
            }
            return problems;
        }

    }

    public static class Unit {

        /**
         * Objective-C class type
         */
        public static final String OBJECTIVE_C_CLASS_TYPE = "objc-class";

        /**
         * Objective-C protocol type
         */
        public static final String OBJECTIVE_C_PROTOCOL_TYPE = "objc-protocol";

        /**
         * Objective-C class method type
         */
        public static final String OBJECTIVE_C_CLASS_METHOD_TYPE = "objc-class-method";

        /**
         * Objective-C instance method type
         */
        public static final String OBJECTIVE_C_INSTANCE_METHOD_TYPE = "objc-instance-method";

        /**
         * Objective-C property type
         */
        public static final String OBJECTIVE_C_PROPERTY_TYPE = "objc-property";

        /**
         * C struct type
         */
        public static final String C_STRUCT_TYPE = "c-struct";

        /**
         * C enum type
         */
        public static final String C_ENUM_TYPE = "c-enum";

        /**
         * C enum constant type
         */
        public static final String C_ENUM_CONSTANT_TYPE = "c-enum-constant";

        /**
         * C function type
         */
        public static final String C_FUNCTION_TYPE = "c-function";

        /**
         * C variable type
         */
        public static final String C_VARIABLE_TYPE = "c-variable";

        /**
         * C opaque type
         */
        public static final String C_OPAQUE_TYPE = "c-opaque";

        /**
         * Unit types.
         */
        public static final String[] UNIT_TYPES = new String[] { OBJECTIVE_C_CLASS_TYPE, OBJECTIVE_C_PROTOCOL_TYPE,
                OBJECTIVE_C_CLASS_METHOD_TYPE, OBJECTIVE_C_INSTANCE_METHOD_TYPE, OBJECTIVE_C_PROPERTY_TYPE,
                C_STRUCT_TYPE, C_ENUM_TYPE, C_ENUM_CONSTANT_TYPE, C_FUNCTION_TYPE, C_VARIABLE_TYPE, C_OPAQUE_TYPE
        };

        /**
         * Disables unit recognition and generation completely
         */
        public static final String HANDLING_DISABLED = "disabled";

        /**
         * Recognizes the unit (if possible) but assumes that binding code for
         * it
         * already exists in an external package
         */
        public static final String HANDLING_EXTERNAL = "external";

        /**
         * Recognizes the unit (if possible) and generates binding code for it
         */
        public static final String HANDLING_DEFAULT = "default";

        /**
         * Handling modes.
         */
        public static final String[] HANDLING_MODES = new String[] { HANDLING_DEFAULT, HANDLING_EXTERNAL,
                HANDLING_DISABLED
        };

        /**
         * Lock for disabling further modification of the class
         */
        private boolean locked = false;

        /**
         * Configuration
         */
        private final Configuration config;

        /**
         * Original name of the unit
         */
        private final String originalName;

        /**
         * Name of the unit
         */
        private String name;

        /**
         * Framework of the unit
         */
        private String framework;

        /**
         * Package of the unit
         */
        private String pkg;

        /**
         * File path of the unit's C-source
         */
        private final String path;

        /**
         * Type of the unit
         */
        private final String type;

        /**
         * Generate hybrid class
         */
        private boolean generateHybridClass;

        /**
         * The length of the package base
         */
        private int packageBaseLength;

        /**
         * Handling mode of the unit
         */
        private String handling;

        /**
         * Create a new {@link Unit}
         *
         * @param decl        declaration info
         * @param packageBase package base
         */
        public Unit(CXIdxDeclInfo decl, String packageBase, Configuration config) {
            if (decl == null || config == null) {
                throw new NullPointerException();
            }
            this.path = ClangUtil.getFilePath(decl);
            this.framework = ClangUtil.getFramework(this.path);
            this.handling = HANDLING_DEFAULT;
            this.packageBaseLength = packageBase == null ? 0 : packageBase.length();
            this.config = config;

            switch (decl.entityInfo().kind()) {
            case CXIdxEntityKind.CXIdxEntity_ObjCClass: {
                CXIdxObjCInterfaceDeclInfo info = decl.getObjCInterfaceDeclInfo();
                this.originalName = this.name = info.containerInfo().declInfo().cursor().toString();
                this.type = OBJECTIVE_C_CLASS_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework));
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_ObjCProtocol: {
                this.originalName = this.name = decl.cursor().toString();
                this.type = OBJECTIVE_C_PROTOCOL_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework), "protocol");
            }
            break;

            case CXIdxEntityKind.CXIdxEntity_ObjCClassMethod: {
                this.originalName = this.name = decl.entityInfo().cursor().toString();
                this.type = OBJECTIVE_C_CLASS_METHOD_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework));
            }
            break;

            case CXIdxEntityKind.CXIdxEntity_ObjCInstanceMethod: {
                this.originalName = this.name = decl.entityInfo().cursor().toString();
                this.type = OBJECTIVE_C_INSTANCE_METHOD_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework));
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_ObjCProperty: {
                this.originalName = this.name = decl.cursor().toString();
                this.type = OBJECTIVE_C_PROPERTY_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework));
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_Struct: {
                String structname = decl.cursor().toString();
                if (structname == null || structname.length() == 0) {
                    structname = CStructManager.INVALID_NAME;
                }
                this.originalName = this.name = structname;
                this.type = C_STRUCT_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework), "struct");
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_Enum: {
                String enumname = decl.cursor().toString();
                if (enumname == null || enumname.length() == 0) {
                    enumname = CEnumManager.INVALID_NAME;
                }
                this.originalName = this.name = enumname;
                this.type = C_ENUM_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework), "enums");
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_EnumConstant: {
                this.originalName = this.name = decl.cursor().toString();
                this.type = C_ENUM_CONSTANT_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework));
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_Function: {
                this.originalName = this.name = decl.cursor().toString();
                this.type = C_FUNCTION_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework), "c");
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_Variable: {
                this.originalName = this.name = decl.cursor().toString();
                this.type = C_VARIABLE_TYPE;
                this.pkg = packageName(packageBase, lowercased(framework), "c");
            }
            break;
            case CXIdxEntityKind.CXIdxEntity_Typedef: {
                CXType ut = decl.cursor().getTypedefDeclUnderlyingType();
                if (ut.kind() == CXTypeKind.Unexposed || ut.kind() == CXTypeKind.Elaborated) {
                    CXType cut;
                    if (ut.kind() == CXTypeKind.Elaborated) {
                        cut = ut.getNamedType();
                    } else {
                        cut = ut.getCanonicalType();
                    }
                    if (cut.kind() == CXTypeKind.Record) {
                        this.originalName = this.name = decl.cursor().toString();
                        this.type = C_STRUCT_TYPE;
                        this.pkg = packageName(packageBase, lowercased(framework), "struct");
                        break;
                    } else if (cut.kind() == CXTypeKind.Enum) {
                        this.originalName = this.name = decl.cursor().toString();
                        this.type = C_ENUM_TYPE;
                        this.pkg = packageName(packageBase, lowercased(framework), "enums");
                        break;
                    }
                }
                throw new RuntimeException("unhadled decl type");
            }
            default:
                throw new RuntimeException("unhadled decl type");
            }
        }

        /**
         * Create a new {@link Unit}
         *
         * @param decl        declaration info
         * @param packageBase package base
         */
        public Unit(CXIdxDeclInfo decl, String packageBase, Configuration config, Type opaqueType) {
            if (decl == null || config == null) {
                throw new NullPointerException();
            }
            if (opaqueType == null) {
                throw new NullPointerException();
            }
            this.path = ClangUtil.getFilePath(decl);
            this.framework = ClangUtil.getFramework(this.path);
            this.handling = HANDLING_DEFAULT;
            this.packageBaseLength = packageBase == null ? 0 : packageBase.length();
            this.config = config;

            switch (decl.entityInfo().kind()) {
            case CXIdxEntityKind.CXIdxEntity_Typedef: {
                if (opaqueType.getKind() == Type.OpaquePtr) {
                    this.originalName = this.name = opaqueType.getElementName();
                    this.type = C_OPAQUE_TYPE;
                    this.pkg = packageName(packageBase, lowercased(framework), "opaque");
                    break;
                }
                throw new RuntimeException("unhadled decl type");
            }
            default:
                throw new RuntimeException("unhadled decl type");
            }
        }

        private String lowercased(String string) {
            return string == null ? null : string.toLowerCase();
        }

        public static String packageName(String... elems) {
            List<String> list = Arrays.asList(elems);
            return packageName(list, 0);
        }

        public static String packageName(List<String> list, int index) {
            if (index >= list.size()) {
                return null;
            }
            String a = list.get(index);
            String b = packageName(list, index + 1);
            if (isNull(a) && isNull(b)) {
                return null;
            } else if (!isNull(a) && isNull(b)) {
                return a;
            } else if (isNull(a) && !isNull(b)) {
                return b;
            } else {
                return a + "." + b;
            }
        }

        private static boolean isNull(String a) {
            return a == null || a.length() == 0;
        }

        public String getOriginalName() {
            return originalName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (locked) {
                throw new IllegalStateException("can't modify locked unit");
            }
            this.name = name;
        }

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            if (framework != null && framework.length() == 0) {
                framework = null;
            }
            this.framework = framework;
        }

        public String getPkg() {
            return pkg;
        }

        public void setPkg(String pkg) {
            if (locked) {
                throw new IllegalStateException("can't modify locked unit");
            }
            this.pkg = isNull(pkg) ? null : pkg;
            this.packageBaseLength = this.pkg.length();
        }

        public String getPath() {
            return path;
        }

        public String getType() {
            return type;
        }

        public boolean handlingDisabled() {
            return HANDLING_DISABLED.equals(handling);
        }

        public boolean handlingExternal() {
            return HANDLING_EXTERNAL.equals(handling);
        }

        public boolean handlingDefault() {
            return HANDLING_DEFAULT.equals(handling);
        }

        public void setHandling(String handling) {
            if (locked) {
                throw new IllegalStateException("can't modify locked unit");
            }
            if (!HANDLING_DISABLED.equals(handling) && !HANDLING_EXTERNAL.equals(handling) && !HANDLING_DEFAULT
                    .equals(handling)) {
                throw new IllegalArgumentException("unknown handling mode");
            }
            this.handling = handling;
        }

        public boolean generateHybridClass() {
            return generateHybridClass;
        }

        public void setGenerateHybridClass(boolean generateHybridClass) {
            if (locked) {
                throw new IllegalStateException("can't modify locked unit");
            }
            this.generateHybridClass = generateHybridClass;
        }

        public void replacePackageBase(String newBase) {
            if (packageBaseLength == 0) {
                if (isNull(newBase)) {
                    // Do nothing
                } else {
                    packageBaseLength = newBase.length();
                    pkg = packageName(newBase, pkg);
                }
            } else {
                if (isNull(newBase)) {
                    if (pkg.length() == packageBaseLength) {
                        packageBaseLength = 0;
                        pkg = null;
                    } else {
                        packageBaseLength = 0;
                        pkg = pkg.substring(packageBaseLength + 1);
                    }
                } else {
                    if (pkg.length() == packageBaseLength) {
                        packageBaseLength = newBase.length();
                        pkg = newBase;
                    } else {
                        int oldpbl = packageBaseLength;
                        packageBaseLength = newBase.length();
                        pkg = packageName(newBase, pkg.substring(oldpbl + 1));
                    }
                }
            }
        }

        public void lock() {
            locked = true;
        }

        public boolean isFinalized() {
            return locked;
        }

        public String getFQName() {
            return Unit.packageName(pkg, name);
        }

        public Configuration getConfig() {
            return config;
        }
    }

    public static class UnitRule implements IConfigurationElement {

        /**
         * An array of conditions
         */
        private final ArrayList<Condition> conditions = new ArrayList<Condition>();

        /**
         * An array of actions
         */
        private final ArrayList<Action> actions = new ArrayList<Action>();

        /**
         * Indicates whether the {@link UnitRule} finalizes the {@link Unit} or
         * not
         */
        private boolean isFinal = false;

        /**
         * Returns the array of conditions
         *
         * @return conditions
         */
        public ArrayList<Condition> getConditions() {
            return conditions;
        }

        /**
         * Returns the array of actions
         *
         * @return actions
         */
        public ArrayList<Action> getActions() {
            return actions;
        }

        /**
         * Returns is final property
         *
         * @return true if final
         */
        public boolean isFinal() {
            return isFinal;
        }

        /**
         * Sets is final property
         *
         * @param isFinal true if {@link UnitRule} should finalize
         */
        public void setFinal(boolean isFinal) {
            this.isFinal = isFinal;
        }

        /**
         * Apply rule to unit if possible and lock it afterwards (only locks if
         * applying was made)
         *
         * @param unit unit to apply the rule to
         */
        public void applyRule(Unit unit) {
            for (Condition condition : conditions) {
                if (condition.matches(unit) == false) {
                    return;
                }
            }

            for (Action action : actions) {
                action.apply(unit);
            }

            if (isFinal) {
                unit.lock();
            }
        }

        private static final String CONFKEY_CONDITIONS = "conditions";
        private static final String CONFKEY_ACTIONS = "actions";
        private static final String CONFKEY_FINAL = "final";

        private static class Serializer implements JsonSerializer<UnitRule> {

            @Override
            public JsonElement serialize(UnitRule src, java.lang.reflect.Type typeOfSrc,
                    JsonSerializationContext context) {
                JsonObject obj = new JsonObject();
                obj.addProperty(UnitRule.CONFKEY_FINAL, src.isFinal);
                JsonArray conds = new JsonArray();
                for (Condition cond : src.conditions) {
                    conds.add(context.serialize(cond));
                }
                obj.add(UnitRule.CONFKEY_CONDITIONS, conds);
                JsonArray acts = new JsonArray();
                for (Action act : src.actions) {
                    acts.add(context.serialize(act));
                }
                obj.add(UnitRule.CONFKEY_ACTIONS, acts);
                return obj;
            }

        }

        private static class Deserializer implements JsonDeserializer<UnitRule> {

            @Override
            public UnitRule deserialize(JsonElement element, java.lang.reflect.Type typeOfSrc,
                    JsonDeserializationContext context) throws JsonParseException {
                if (element.isJsonObject()) {
                    JsonObject o = element.getAsJsonObject();

                    UnitRule rule = new UnitRule();
                    rule.setFinal(o.get(UnitRule.CONFKEY_FINAL).getAsBoolean());
                    for (JsonElement cond : o.getAsJsonArray(UnitRule.CONFKEY_CONDITIONS)) {
                        rule.conditions.add((Condition)context.deserialize(cond, Condition.class));
                    }
                    for (JsonElement cond : o.getAsJsonArray(UnitRule.CONFKEY_ACTIONS)) {
                        rule.actions.add((Action)context.deserialize(cond, Action.class));
                    }
                    return rule;
                }

                LOG.error("element type is incorrect");
                return null;
            }

        }

        @Override
        public ArrayList<ValidationEntry> getProblems() {
            ArrayList<ValidationEntry> problems = new ArrayList<ValidationEntry>();
            for (Condition condition : conditions) {
                problems.addAll(condition.getProblems());
            }
            for (Action action : actions) {
                problems.addAll(action.getProblems());
            }
            return problems;
        }
    }

    public static class Condition implements IConfigurationElement {

        /**
         * Logger for this class
         */
        private static final Logger LOG = LoggerFactory.getLogger(Condition.class);

        /**
         * Condition for name match (case-sensitive)
         */
        public static final String NAME_MATCH = "name-match";

        /**
         * Condition for name prefix (case-sensitive)
         */
        public static final String NAME_PREFIX = "name-prefix";

        /**
         * Condition for framework match
         */
        public static final String FRAMEWORK_MATCH = "framework-match";

        /**
         * Condition for file path match (case-sensitive)
         */
        public static final String PATH_MATCH = "path-match";

        /**
         * Condition for file path prefix (case-sensitive)
         */
        public static final String PATH_PREFIX = "path-prefix";

        /**
         * Condition for type match
         */
        public static final String TYPE_MATCH = "type-match";

        /**
         * Recognized conditions
         */
        private static final String conditions[] = new String[] { NAME_MATCH, NAME_PREFIX, FRAMEWORK_MATCH, PATH_MATCH,
                PATH_PREFIX, TYPE_MATCH
        };

        /**
         * Returns all the recognized conditions
         *
         * @return conditions
         */
        public static String[] getConditions() {
            return conditions;
        }

        /**
         * Condition
         */
        private String condition;

        /**
         * Value for the condition
         */
        private String value;

        /**
         * Create a new {@link Condition}
         */
        public Condition() {
        }

        /**
         * Create a new {@link Condition}
         *
         * @param condition condition
         * @param value     value
         */
        public Condition(String condition, String value) {
            setCondition(condition);
            setValue(value);
        }

        /**
         * Returns the condition
         *
         * @return condition
         */
        public String getCondition() {
            return condition;
        }

        /**
         * Sets the condition
         *
         * @param condition condition
         */
        public void setCondition(String condition) {
            if (condition != null && condition.length() == 0) {
                condition = null;
            }

            this.condition = condition;
        }

        /**
         * Returns the value
         *
         * @return value
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value
         *
         * @param value value
         */
        public void setValue(String value) {
            if (value != null && value.length() == 0) {
                value = null;
            }

            this.value = value;
        }

        /**
         * Tells whether the unit matches the condition or not
         *
         * @param unit unit to check
         * @return true if matches
         */
        public boolean matches(Unit unit) {
            if (unit == null) {
                throw new IllegalArgumentException();
            }

            if (condition == null || value == null) {
                LOG.warn("Condition or value is not defined, skipping...");
                return false;
            }

            boolean bool = !condition.startsWith("not-");
            String condition = this.condition;
            if (!bool) {
                condition = condition.substring("not-".length());
            }

            if (condition.equals(NAME_MATCH)) {
                if (unit.getOriginalName() != null && unit.getOriginalName().equals(value) == bool) {
                    return true;
                }
                return false;
            }

            if (condition.equals(NAME_PREFIX)) {
                if (unit.getOriginalName() != null && unit.getOriginalName().startsWith(value) == bool) {
                    return true;
                }
                return false;
            }

            if (condition.equals(FRAMEWORK_MATCH)) {
                if (unit.getFramework() != null && unit.getFramework().equals(value) == bool) {
                    return true;
                }
                return false;
            }

            if (condition.equals(PATH_MATCH)) {
                if (unit.getPath() != null && unit.getPath().equals(unit.getConfig().getDemangledPath(value)) == bool) {
                    return true;
                }
                return false;
            }

            if (condition.equals(PATH_PREFIX)) {
                if (unit.getPath() != null
                        && unit.getPath().startsWith(unit.getConfig().getDemangledPath(value)) == bool) {
                    return true;
                }
                return false;
            }

            if (condition.equals(TYPE_MATCH)) {
                if (unit.getType() != null && unit.getType().equals(value) == bool) {
                    return true;
                }
                return false;
            }

            LOG.warn("Condition is not recognized, skipping...");
            return false;
        }

        public boolean equals(String condition, String value) {
            if ((condition == null || condition.length() == 0) && !(this.condition == null
                    || this.condition.length() == 0)) {
                return false;
            }

            if (condition != null && this.condition != null && !condition.equals(this.condition)) {
                return false;
            }

            if ((value == null || value.length() == 0) && !(this.value == null || this.value.length() == 0)) {
                return false;
            }

            if (value != null && this.value != null && !value.equals(this.value)) {
                return false;
            }

            return true;
        }

        private final static String CONFKEY_CONDITION = "condition";
        private final static String CONFKEY_VALUE = "value";

        private static class Serializer implements JsonSerializer<Condition> {

            @Override
            public JsonElement serialize(Condition src, java.lang.reflect.Type typeOfSrc,
                    JsonSerializationContext context) {
                JsonObject obj = new JsonObject();
                obj.add(Condition.CONFKEY_CONDITION, context.serialize(src.condition));
                obj.add(Condition.CONFKEY_VALUE, context.serialize(src.value));
                return obj;
            }

        }

        private static class Deserializer implements JsonDeserializer<Condition> {

            @Override
            public Condition deserialize(JsonElement element, java.lang.reflect.Type typeOfSrc,
                    JsonDeserializationContext context) throws JsonParseException {
                if (element.isJsonObject()) {
                    JsonObject o = element.getAsJsonObject();
                    String condition = context.deserialize(o.get(Condition.CONFKEY_CONDITION), String.class);
                    String value = context.deserialize(o.get(Condition.CONFKEY_VALUE), String.class);
                    return new Condition(condition, value);
                }

                LOG.error("element type is incorrect");
                return null;
            }

        }

        @Override
        public ArrayList<ValidationEntry> getProblems() {
            ArrayList<ValidationEntry> problems = new ArrayList<ValidationEntry>();

            if (condition == null) {
                problems.add(new ValidationEntry(ValidationEntry.ERROR, "Condition must be defined!",
                        CONFKEY_UNIT_ACTION_MANAGER, UnitRule.CONFKEY_CONDITIONS, Condition.CONFKEY_CONDITION));
            }

            if (value == null) {
                problems.add(new ValidationEntry(ValidationEntry.ERROR, "Condition's value must be defined!",
                        CONFKEY_UNIT_ACTION_MANAGER, UnitRule.CONFKEY_CONDITIONS, Condition.CONFKEY_VALUE));
            }

            return problems;
        }
    }

    public static class Action implements IConfigurationElement {

        /**
         * Logger for this class
         */
        private static final Logger LOG = LoggerFactory.getLogger(Action.class);

        /**
         * Action for replacing a unit's name
         */
        // TODO: need to update ObjCClassManager for this
        // public static final String REPLACE_NAME = "replace-name";

        /**
         * Action for replacing a unit's package
         */
        public static final String REPLACE_PACKAGE = "replace-package";

        /**
         * Action for replacing a unit's package base
         */
        public static final String REPLACE_PACKAGE_BASE = "replace-package-base";

        /**
         * Action for skipping a generation
         */
        public static final String SKIP_GENERATION__DEPRECATED = "skip-generation";

        /**
         * Action for replacing library information
         */
        public static final String REPLACE_LIBRARY = "replace-library";

        /**
         * Action for generating hybrid class code for and Objective-C class
         */
        public static final String GENERATE_HYBRID_CLASS = "generate-hybrid-class";

        /**
         * Action for setting generation handling
         */
        public static final String HANDLING_MODE = "handling-mode";

        /**
         * Recognized actions
         */
        private static final String actions[] = new String[] { REPLACE_PACKAGE, REPLACE_PACKAGE_BASE, HANDLING_MODE,
                REPLACE_LIBRARY, GENERATE_HYBRID_CLASS
        };

        /**
         * Returns all the recognized actions
         *
         * @return actions
         */
        public static String[] getActions() {
            return actions;
        }

        /**
         * Action to execute
         */
        private String action;

        /**
         * Additional value for the action when needed
         */
        private String value;

        /**
         * Create an empty {@link Action}
         */
        public Action() {
            this(null, null);
        }

        /**
         * Create a new {@link Action}
         *
         * @param action action to execute
         */
        public Action(String action) {
            this(action, null);
        }

        /**
         * Create a new {@link Action}
         *
         * @param action action to execute
         * @param value  additional value
         */
        public Action(String action, String value) {
            this.action = action;
            this.value = value;
        }

        /**
         * Returns the action
         *
         * @return action
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the action
         *
         * @param action action
         */
        public void setAction(String action) {
            if (action != null && action.length() == 0) {
                action = null;
            }

            this.action = action;
        }

        /**
         * Returns the additional value
         *
         * @return additional value
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the additional value
         *
         * @param value additional value
         */
        public void setValue(String value) {
            if (value != null && value.length() == 0) {
                value = null;
            }

            this.value = value;
        }

        /**
         * Applies the action to the unit
         *
         * @param unit unit to apply the action to
         */
        public void apply(Unit unit) {
            if (unit == null) {
                throw new IllegalArgumentException();
            }

            if (action == null) {
                LOG.warn("Action is not defined, skipping");
                return;
            }

            if (action.equals(REPLACE_PACKAGE)) {
                if (value == null) {
                    unit.setPkg("");
                } else {
                    unit.setPkg(value);
                }
                return;
            }

            if (action.equals(REPLACE_PACKAGE_BASE)) {
                if (value == null) {
                    unit.replacePackageBase("");
                } else {
                    unit.replacePackageBase(value);
                }
                return;
            }

            if (action.equals(SKIP_GENERATION__DEPRECATED)) {
                throw new IllegalArgumentException(
                        SKIP_GENERATION__DEPRECATED + " has been deprecated, " + "please use " + HANDLING_MODE
                                + " instead");
            }

            if (action.equals(REPLACE_LIBRARY)) {
                if (value == null) {
                    unit.setFramework("");
                } else {
                    unit.setFramework(value);
                }
                return;
            }

            if (action.equals(GENERATE_HYBRID_CLASS)) {
                unit.setGenerateHybridClass(true);
                return;
            }

            if (action.equals(HANDLING_MODE)) {
                unit.setHandling(value);
                return;
            }
        }

        public boolean equals(String action, String value) {
            if ((action == null || action.length() == 0) && !(this.action == null || this.action.length() == 0)) {
                return false;
            }

            if (action != null && this.action != null && !action.equals(this.action)) {
                return false;
            }

            if ((value == null || value.length() == 0) && !(this.value == null || this.value.length() == 0)) {
                return false;
            }

            if (value != null && this.value != null && !value.equals(this.value)) {
                return false;
            }

            return true;
        }

        private final static String CONFKEY_ACTION = "action";
        private final static String CONFKEY_VALUE = "value";

        private static class Serializer implements JsonSerializer<Action> {

            @Override
            public JsonElement serialize(Action src, java.lang.reflect.Type typeOfSrc,
                    JsonSerializationContext context) {
                JsonObject obj = new JsonObject();
                obj.add(Action.CONFKEY_ACTION, context.serialize(src.action));
                obj.add(Action.CONFKEY_VALUE, context.serialize(src.value));
                return obj;
            }

        }

        private static class Deserializer implements JsonDeserializer<Action> {

            @Override
            public Action deserialize(JsonElement element, java.lang.reflect.Type typeOfSrc,
                    JsonDeserializationContext context) throws JsonParseException {
                if (element.isJsonObject()) {
                    JsonObject o = element.getAsJsonObject();
                    String action = context.deserialize(o.get(Action.CONFKEY_ACTION), String.class);
                    String value = context.deserialize(o.get(Action.CONFKEY_VALUE), String.class);
                    return new Action(action, value);
                }

                LOG.error("element type is incorrect");
                return null;
            }

        }

        @Override
        public ArrayList<ValidationEntry> getProblems() {
            ArrayList<ValidationEntry> problems = new ArrayList<ValidationEntry>();

            if (action == null) {
                problems.add(new ValidationEntry(ValidationEntry.ERROR, "Action must be defined!",
                        CONFKEY_UNIT_ACTION_MANAGER, UnitRule.CONFKEY_ACTIONS, Action.CONFKEY_ACTION));
            }

            return problems;
        }
    }

    public String getIncludePathForHeader(String location) {
        if (location == null || location.length() == 0) {
            throw new IllegalArgumentException();
        }
        for (String rPath : headerFileResolvingPaths) {
            String drPath = getDemangledPath(rPath);
            if (location.startsWith(drPath)) {
                location = location.substring(drPath.length());
                if (location.startsWith(File.separator)) {
                    location = location.substring(File.separator.length());
                }
                if (APPLE_SDK_SYSTEM_LIBRARY_FRAMEWORKS_PATH.equals(rPath)) {
                    final String frameworkFix = ".framework/Headers";
                    int idx = location.indexOf(frameworkFix);
                    if (idx != -1) {
                        location = location.substring(0, idx) + location
                                .substring(idx + frameworkFix.length(), location.length());
                    }
                }
                return location;
            }
        }
        return location;
    }

    /**
     * Create a new {@link Configuration} from a string
     *
     * @param string with .natjgen
     * @return new {@link Configuration}
     * @throws IOException
     */
    public static Configuration createFromString(String natjgenContent) throws IOException {

        Gson gson = getJsonBuilder().create();
        Configuration conf = gson.fromJson(natjgenContent, Configuration.class);
        if (conf == null) {
            conf = Configuration.createDefault();
        }
        return conf;
    }

}
