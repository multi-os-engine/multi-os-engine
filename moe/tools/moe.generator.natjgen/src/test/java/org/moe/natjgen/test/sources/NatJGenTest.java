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

package org.moe.natjgen.test.sources;

import org.junit.Assert;
import org.moe.natjgen.Configuration;
import org.moe.natjgen.Configuration.Action;
import org.moe.natjgen.Configuration.Condition;
import org.moe.natjgen.Configuration.Unit;
import org.moe.natjgen.Configuration.UnitRule;
import org.moe.natjgen.Main;
import org.moe.natjgen.util.Path;
import org.moe.natjgen.util.XcodeUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;

public class NatJGenTest {

    private static final String FRAGMENT_ROOT = "src/main/java";
    private static boolean IS_INITIALIZED = false;
    private static boolean INITIALIZATION_FAILED = false;
    private static File TEST_DIR;
    private static File PROJECT_DIR;
    private static File INCLUDES_DIR;
    private static File FRAMEWORKS_DIR;

    public static final String PACKAGE_BASE = "org.moe.natjgen.test";
    private static final String PROJECT_NAME = "Project";
    private static final String TEST_PLATFORM = System.getProperty("natjgen.test.platform", Configuration.PLATFORM_IOS);

    public static void prepare() {
        Assert.assertFalse(INITIALIZATION_FAILED);
        if (IS_INITIALIZED) {
            return;
        }
        synchronized (NatJGenTest.class) {
            if (IS_INITIALIZED) {
                return;
            }
            IS_INITIALIZED = true;

            try {
                _prepare();
            } catch (IOException e) {
                INITIALIZATION_FAILED = true;
                e.printStackTrace();
                Assert.fail();
            }
            Assert.assertFalse(INITIALIZATION_FAILED);
        }
    }

    private static void _prepare() throws IOException {
        setupTestDir();

        final Configuration conf = Configuration.createDefault();

        // Settings
        conf.setOutputPackageFramgentRootPath(FRAGMENT_ROOT);
        conf.setPlatform(TEST_PLATFORM);
        conf.setPackageBase(PACKAGE_BASE);
        Path platformSDKsPath = XcodeUtil.getPlatformSDKsPath(conf.getPlatform());
        Assert.assertTrue(platformSDKsPath.exists() && platformSDKsPath.isDirectory());
        int latestSDK = -1;
        for (File sdk : platformSDKsPath.listFiles()) {
            if (sdk.isDirectory() && sdk.isAbsolute() && !sdk.isHidden()) {
                if (Configuration.isAndroidPlatform(TEST_PLATFORM)) {
                    // Select latest SDK for android platform
                    String name = sdk.getName();
                    if (name.startsWith("android-")) {
                        int version = Integer.parseInt(name.substring("android-".length()));
                        if (version > latestSDK) {
                            conf.setSDKPath(sdk.getAbsolutePath());
                            latestSDK = version;
                        }
                    }
                } else {
                    conf.setSDKPath(sdk.getAbsolutePath());
                    break;
                }
            }
        }
        System.out.println("Using SDK: " + conf.getDemangledSDKPath());
        Assert.assertNotNull(conf.getSDKPath());
        Assert.assertNotEquals(0, conf.getSDKPath());
        conf.setLoggingPath("${PROJECT}/natjgen-log.html");
        // conf.setInputTypeConfigurationPath("${PROJECT}/in.ngtconf");
        conf.setOutputTypeConfigurationPath("${PROJECT}/out.ngtconf");
        conf.setCleanOutputTypeConfiguration(true);

        // Paths
        conf.setUseIncludedStandardHeaders(false);
        conf.getHeaderSearchPaths().add(INCLUDES_DIR.getAbsolutePath());
        conf.getUserHeaderSearchPaths().add(INCLUDES_DIR.getAbsolutePath());
        conf.getUserHeaderSearchPaths().add(FRAMEWORKS_DIR.getAbsolutePath());

        // Rules
        UnitRule rule = new UnitRule();
        rule.setFinal(true);
        rule.getConditions().add(new Condition(Condition.PATH_PREFIX, "${SDK}"));
        rule.getActions().add(new Action(Action.REPLACE_PACKAGE_BASE, "apple"));
        rule.getActions().add(new Action(Action.HANDLING_MODE, Unit.HANDLING_EXTERNAL));
        conf.getUnitActionManager().getUnitRules().add(rule);

        // Source
        conf.setSourceCode("#include \"all_tests.h\"\n");

        // Save config file
        final File configFile = new File(TEST_DIR, "test.natjgen");
        conf.saveToFile(configFile.getAbsolutePath());
        Assert.assertTrue(configFile.getAbsolutePath(), configFile.exists());
        Assert.assertTrue(configFile.getAbsolutePath(), configFile.isFile());

        // Generate bindings
        String[] args = new String[] { TEST_DIR.getAbsolutePath(), PROJECT_NAME, configFile.getAbsolutePath()
        };
        Assert.assertEquals(0, Main.main_internal(args));

        if (System.getProperty("natjgen.tests.keepAndOpen") != null) {
            try {
                new ProcessBuilder("open", "-a", "Finder",
                        PROJECT_DIR.getAbsolutePath() + "/src/main/java/org/moe/mdt/natjgen/test").start().waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void setupTestDir() throws IOException {
        File tmp = File.createTempFile("NatJGenTest", "");
        if (tmp.exists()) {
            Assert.assertTrue(tmp.delete());
        }
        Assert.assertTrue(tmp.mkdirs());
        TEST_DIR = tmp;
        if (System.getProperty("natjgen.tests.keepAndOpen") == null) {
            tmp.deleteOnExit();
        }

        // Create dir for project
        PROJECT_DIR = new File(TEST_DIR, PROJECT_NAME);
        Assert.assertTrue(PROJECT_DIR.mkdir());

        // Create dir for includes
        INCLUDES_DIR = new File(TEST_DIR, "includes");
        Assert.assertTrue(INCLUDES_DIR.mkdir());
        copyResource("all_tests.h", INCLUDES_DIR);
        copyResource("base_types.h", INCLUDES_DIR);
        copyResource("c_enums.h", INCLUDES_DIR);
        copyResource("c_variables.h", INCLUDES_DIR);
        copyResource("moe_types.h", INCLUDES_DIR);
        copyResource("objc_generics.h", INCLUDES_DIR);
        copyResource("pointers.h", INCLUDES_DIR);
        copyResource("structs.h", INCLUDES_DIR);

        // Create dir for frameworks
        FRAMEWORKS_DIR = new File(TEST_DIR, "frameworks");
        Assert.assertTrue(FRAMEWORKS_DIR.mkdir());
    }

    private static void copyResource(String resourceName, File target) throws IOException {
        ClassLoader cl = NatJGenTest.class.getClassLoader();
        InputStream stream = cl.getResourceAsStream(resourceName);
        File targetFile = new File(target, resourceName);
        if (!targetFile.getParentFile().exists()) {
            targetFile.getParentFile().mkdirs();
        }
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(targetFile);

            byte buffer[] = new byte[8192];
            int read;
            while ((read = stream.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static File getSourceFile(String packageRoot, String path) {
        if (packageRoot == null) {
            packageRoot = PACKAGE_BASE;
        }
        Assert.assertNotNull(packageRoot);
        Assert.assertNotNull(path);
        packageRoot = packageRoot.replaceAll("\\.", Matcher.quoteReplacement(File.separator));
        File file = new File(PROJECT_DIR, FRAGMENT_ROOT + File.separator + packageRoot + File.separator + path);
        Assert.assertTrue("Source file doesn't exist at path", file.exists());
        Assert.assertTrue("Source file path doesn't point to a file", file.isFile());
        Assert.assertTrue("Source file is not readable", file.canRead());
        return file;
    }

    public static boolean ignoreObjCTests() {
        return !Configuration.isApplePlatform(TEST_PLATFORM);
    }

}
