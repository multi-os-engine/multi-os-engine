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

package org.moe.natjgen.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.moe.natjgen.cli.executor.GenerateBindingExecutor;
import org.moe.natjgen.cli.executor.IExecutor;
import org.moe.natjgen.cli.executor.ThirdPartyFrameworkLinkExecutor;
import org.moe.natjgen.cli.executor.ThirdPartyLibraryLinkExecutor;
import org.moe.natjgen.cli.manager.ExecutorManager;
import org.moe.natjgen.cli.utils.params.OptionsHandler;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

@Ignore
public class ParameterParserTest extends WrapNatJTest {
    private static ByteArrayOutputStream out = null;
    private static ByteArrayOutputStream err = null;

    @BeforeClass
    public static void init() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

    }

    @Before
    public void reset() {
        err.reset();
        out.reset();
    }

    private CommandLine parseArgs(String[] args) throws ParseException {
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(OptionsHandler.getAvalibleOptions(), args);
        return cmd;
    }

    @Test
    public void printHelpTest() throws Exception {
        CommandLine cmd = parseArgs(new String[] { "--help" });
        IExecutor executor = ExecutorManager.getExecutorByParams(cmd);
        assertNull(executor);
        Assert.assertTrue(out.size() > 0);
    }

    @Test
    public void incorrectHeadersParameter() throws Exception {
        File project = tmpDir.newFolder();
        CommandLine argc = parseArgs(new String[] { "--headers", project.getPath() });
        // parse incorrect list of parameters
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNull(executor);
        assertTrue(err.size() > 0);
    }

    @Test
    public void incorrectPathToProjectParameter() throws Exception {
        File project = tmpDir.newFolder();
        CommandLine argc = parseArgs(new String[] { "--path-to-project", project.getPath() });
        // parse incorrect list of parameters
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNull(executor);
        assertTrue(err.size() > 0);
    }

    @Test
    public void missedOutputFilePathParameter() throws Exception {
        ClassLoader cl = this.getClass().getClassLoader();
        URL simFramework = cl.getResource("natives/device/TestFramework.framework");
        CommandLine argc = parseArgs(new String[] { "--framework", simFramework.getPath() });
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNull(executor);
        assertTrue(err.size() > 0);
    }

    @Test
    public void incorrectFrameworkParameter() throws Exception {
        File project = tmpDir.newFolder();
        CommandLine argc = parseArgs(new String[] { "--framework", project.getPath() });
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNull(executor);
        assertTrue(err.size() > 0);
    }

    @Test
    public void missedHeadersParameter() throws Exception {
        ClassLoader cl = this.getClass().getClassLoader();
        URL library = cl.getResource("natives/simulator/libTestLibrary.a");
        CommandLine argc = parseArgs(new String[] { "--library", library.getPath() });
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNull(executor);
        assertTrue(err.size() > 0);
    }

    @Test
    public void incorrectOutputFilePathParameter() throws Exception {
        ClassLoader cl = this.getClass().getClassLoader();
        URL library = cl.getResource("natives/simulator/libTestLibrary.a");
        URL headers = cl.getResource("natives/Headers/TestFramework.h");
        CommandLine argc = parseArgs(new String[] { "--library", library.getPath(), "--headers", headers.getPath() });
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNull(executor);
        assertTrue(err.size() > 0);
    }

    @Test
    public void generateBindingsWithoutPackage() throws Exception {

        File project = tmpDir.newFolder();
        ClassLoader cl = this.getClass().getClassLoader();
        URL header = cl.getResource("natives/AppViewController.h");
        CommandLine argc = parseArgs(
                new String[] { "--path-to-project", project.getPath(), "--headers", header.getPath() });
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNotNull(executor);
        assertTrue(executor instanceof GenerateBindingExecutor);

        // generate binding
        executor.execute();

        // check if file exist
        File genJava = new File(project, "src/main/java/org/moe/AppViewController.java");
        assertTrue(genJava.exists());

        // check content
        // @property (weak, nonatomic) IBOutlet UIButton *helloButton;
        // @property (weak, nonatomic) IBOutlet UILabel *statusText;
        // - (IBAction)BtnPressedCancel_helloButton:(NSObject*)sender;

        Pattern helloButtonPattern = Pattern.compile(".*@Selector\\(\"helloButton\"\\).*");
        Pattern statusTextPattern = Pattern.compile(".*@Selector\\(\"statusText\"\\).*");
        Pattern helloButtonActionPattern = Pattern.compile(".*@Selector\\(\"BtnPressedCancel_helloButton:\"\\).*");
        Pattern objCClassBindingPattern = Pattern.compile(".*@ObjCClassBinding.*");

        List<String> lineArray = Files.readAllLines(Paths.get(genJava.getPath()));
        boolean isHelloButton = false;
        boolean isStatusText = false;
        boolean isHelloButtonAction = false;
        boolean isObjCClassBinding = false;

        for (String line : lineArray) {
            Matcher hellowButtonMatcher = helloButtonPattern.matcher(line);
            Matcher statusTextMatcher = statusTextPattern.matcher(line);
            Matcher helloButtonActionMatcher = helloButtonActionPattern.matcher(line);
            Matcher objCMatcher = objCClassBindingPattern.matcher(line);

            isHelloButton |= hellowButtonMatcher.find();
            isStatusText |= statusTextMatcher.find();
            isHelloButtonAction |= helloButtonActionMatcher.find();
            isObjCClassBinding |= objCMatcher.find();
        }

        project.delete();

        assertTrue(isHelloButton);
        assertTrue(isStatusText);
        assertTrue(isHelloButtonAction);
        assertTrue(isObjCClassBinding);

    }

    @Test
    public void generateBindings() throws Exception {

        File project = tmpDir.newFolder();
        ClassLoader cl = this.getClass().getClassLoader();
        URL header = cl.getResource("natives/AppViewController.h");
        CommandLine argc = parseArgs(
                new String[] { "--path-to-project", project.getPath(), "--headers", header.getPath(), "--package-name",
                        "org"
                });
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNotNull(executor);
        assertTrue(executor instanceof GenerateBindingExecutor);

        // generate binding
        executor.execute();

        // check if file exist
        File genJava = new File(project, "src/main/java/org/AppViewController.java");
        assertTrue(genJava.exists());

        // check content
        // @property (weak, nonatomic) IBOutlet UIButton *helloButton;
        // @property (weak, nonatomic) IBOutlet UILabel *statusText;
        // - (IBAction)BtnPressedCancel_helloButton:(NSObject*)sender;

        Pattern helloButtonPattern = Pattern.compile(".*@Selector\\(\"helloButton\"\\).*");
        Pattern statusTextPattern = Pattern.compile(".*@Selector\\(\"statusText\"\\).*");
        Pattern helloButtonActionPattern = Pattern.compile(".*@Selector\\(\"BtnPressedCancel_helloButton:\"\\).*");
        Pattern objCClassBindingPattern = Pattern.compile(".*@ObjCClassBinding.*");

        List<String> lineArray = Files.readAllLines(Paths.get(genJava.getPath()));
        boolean isHelloButton = false;
        boolean isStatusText = false;
        boolean isHelloButtonAction = false;
        boolean isObjCClassBinding = false;

        for (String line : lineArray) {
            Matcher hellowButtonMatcher = helloButtonPattern.matcher(line);
            Matcher statusTextMatcher = statusTextPattern.matcher(line);
            Matcher helloButtonActionMatcher = helloButtonActionPattern.matcher(line);
            Matcher objCMatcher = objCClassBindingPattern.matcher(line);

            isHelloButton |= hellowButtonMatcher.find();
            isStatusText |= statusTextMatcher.find();
            isHelloButtonAction |= helloButtonActionMatcher.find();
            isObjCClassBinding |= objCMatcher.find();
        }

        project.delete();

        assertTrue(isHelloButton);
        assertTrue(isStatusText);
        assertTrue(isHelloButtonAction);
        assertTrue(isObjCClassBinding);

    }

    @Test
    public void generateGibridBindings() throws Exception {

        File project = tmpDir.newFolder();
        ClassLoader cl = this.getClass().getClassLoader();
        URL header = cl.getResource("natives/AppViewController.h");
        CommandLine argc = parseArgs(
                new String[] { "--path-to-project", project.getPath(), "--headers", header.getPath(), "--package-name",
                        "org", "--create-from-prototype"
                });
        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNotNull(executor);
        assertTrue(executor instanceof GenerateBindingExecutor);

        // generate binding
        executor.execute();

        // check if file exist
        File genJava = new File(project, "src/main/java/org/AppViewController.java");
        assertTrue(genJava.exists());

        // check content
        // @property (weak, nonatomic) IBOutlet UIButton *helloButton;
        // @property (weak, nonatomic) IBOutlet UILabel *statusText;
        // - (IBAction)BtnPressedCancel_helloButton:(NSObject*)sender;

        Pattern helloButtonPattern = Pattern.compile(".*@Selector\\(\"helloButton\"\\).*");
        Pattern statusTextPattern = Pattern.compile(".*@Selector\\(\"statusText\"\\).*");
        Pattern helloButtonActionPattern = Pattern.compile(".*@Selector\\(\"BtnPressedCancel_helloButton:\"\\).*");
        Pattern objCClassBindingPattern = Pattern.compile(".*@ObjCClassName\\(\"AppViewController\"\\).*");

        List<String> lineArray = Files.readAllLines(Paths.get(genJava.getPath()));
        boolean isHelloButton = false;
        boolean isStatusText = false;
        boolean isHelloButtonAction = false;
        boolean isObjCClassName = false;

        for (String line : lineArray) {
            Matcher hellowButtonMatcher = helloButtonPattern.matcher(line);
            Matcher statusTextMatcher = statusTextPattern.matcher(line);
            Matcher helloButtonActionMatcher = helloButtonActionPattern.matcher(line);
            Matcher objCMatcher = objCClassBindingPattern.matcher(line);

            isHelloButton |= hellowButtonMatcher.find();
            isStatusText |= statusTextMatcher.find();
            isHelloButtonAction |= helloButtonActionMatcher.find();
            isObjCClassName |= objCMatcher.find();
        }

        project.delete();

        assertTrue(isHelloButton);
        assertTrue(isStatusText);
        assertTrue(isHelloButtonAction);
        assertTrue(isObjCClassName);

    }

    @Test
    public void linkFramework() throws Exception {

        File project = tmpDir.newFolder();
        File outputJar = new File(project, "TestFramework.jar");

        // prepare file with ldFlags
        String flags = "-framework TestFramework";
        File ldFlags = new File(project, "ldflags");
        ldFlags.createNewFile();
        PrintWriter write = new PrintWriter(ldFlags);
        write.print(flags);
        write.close();

        ClassLoader cl = this.getClass().getClassLoader();
        URL simFramework = cl.getResource("natives/device/TestFramework.framework");
        URL devFramework = cl.getResource("natives/simulator/TestFramework.framework");

        URL bundle = cl.getResource("moe_logo.png");
        CommandLine argc = parseArgs(
                new String[] { "--framework", String.format("%s:%s", simFramework.getPath(), devFramework.getPath()),
                        "--package-name", "org", "--output-file-path", outputJar.getPath(), "--ld-flags",
                        ldFlags.getPath(), "--bundle", bundle.getPath()
                });

        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNotNull(executor);
        assertTrue(executor instanceof ThirdPartyFrameworkLinkExecutor);

        // generate binding & prepare output jar
        executor.execute();

        // check output jar file existence
        assertTrue(outputJar.exists());

        JarFile jarFile = new JarFile(outputJar);
        Manifest manifest = jarFile.getManifest();

        Attributes attributes = manifest.getMainAttributes();
        String manifestLDFlags = attributes.getValue("MOE_CUSTOM_LINKER_FLAGS");
        assertEquals(flags + ";", manifestLDFlags);

        String manifestBundle = attributes.getValue("MOE_BUNDLE_FILE_RESOURCES");
        assertEquals(manifestBundle, "./bundle/moe_logo.png;");

        String manifestFramework = attributes.getValue("MOE_ThirdpartyFramework_ios_simulator");
        assertEquals(manifestFramework, "./lib/iphonesimulator/TestFramework.framework");

        String manifestDevFramework = attributes.getValue("MOE_ThirdpartyFramework_ios_device");
        assertEquals(manifestDevFramework, "./lib/iphoneos/TestFramework.framework");

        assertNotNull(jarFile.getEntry("bundle/moe_logo.png"));
        assertNotNull(jarFile.getEntry("lib/iphonesimulator/TestFramework.framework"));
        assertNotNull(jarFile.getEntry("lib/iphoneos/TestFramework.framework"));

        jarFile.close();

    }

    @Test
    public void linkUniversalLibrary() throws Exception {

        File project = tmpDir.newFolder();
        File outputJar = new File(project, "TestLib.jar");

        // prepare file with ldFlags
        String flags = "-lTestLibrary";
        File ldFlags = new File(project, "ldflags");
        ldFlags.createNewFile();
        PrintWriter write = new PrintWriter(ldFlags);
        write.print(flags);
        write.close();

        ClassLoader cl = this.getClass().getClassLoader();
        URL library = cl.getResource("natives/universal/libTestLibrary.a");
        URL headersURL = cl.getResource("natives/Headers/TestFramework.h");

        File headers = new File(headersURL.getPath());
        URL bundle = cl.getResource("moe_logo.png");
        CommandLine argc = parseArgs(
                new String[] { "--library", library.getPath(), "--headers", headers.getParentFile().getPath(),
                        "--package-name", "org", "--output-file-path", outputJar.getPath(), "--ld-flags",
                        ldFlags.getPath(), "--bundle", bundle.getPath()
                });

        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNotNull(executor);
        assertTrue(executor instanceof ThirdPartyLibraryLinkExecutor);

        // generate binding & prepare output jar
        executor.execute();

        // check output jar file existence
        assertTrue(outputJar.exists());

        JarFile jarFile = new JarFile(outputJar);
        Manifest manifest = jarFile.getManifest();

        Attributes attributes = manifest.getMainAttributes();
        String manifestLDFlags = attributes.getValue("MOE_CUSTOM_LINKER_FLAGS");
        Set<String> realLDFlags = new HashSet<String>(Arrays.asList(flags.split(";")));
        realLDFlags.add("-ObjC");
        assertEquals(realLDFlags, new HashSet<String>(Arrays.asList(manifestLDFlags.split(";"))));

        String manifestSimFramework = attributes.getValue("MOE_ThirdpartyFramework_universal");
        assertEquals(manifestSimFramework, "./lib/libTestLibrary.a");

        String manifestBundle = attributes.getValue("MOE_BUNDLE_FILE_RESOURCES");
        assertEquals(manifestBundle, "./bundle/moe_logo.png;");

        assertNotNull(jarFile.getEntry("bundle/moe_logo.png"));
        assertNotNull(jarFile.getEntry("lib/libTestLibrary.a"));

        jarFile.close();

    }

    @Test
    public void linkLibrary() throws Exception {

        File project = tmpDir.newFolder();
        File outputJar = new File(project, "TestLib.jar");

        // prepare file with ldFlags
        String flags = "-lTestLibrary";
        File ldFlags = new File(project, "ldflags");
        ldFlags.createNewFile();
        PrintWriter write = new PrintWriter(ldFlags);
        write.print(flags);
        write.close();

        ClassLoader cl = this.getClass().getClassLoader();
        URL library = cl.getResource("natives/simulator/libTestLibrary.a");
        URL deviceLibrary = cl.getResource("natives/device/libTestLibrary.a");
        URL headersURL = cl.getResource("natives/Headers/TestFramework.h");

        File headers = new File(headersURL.getPath());
        URL bundle = cl.getResource("moe_logo.png");
        CommandLine argc = parseArgs(
                new String[] { "--library", String.format("%s:%s", library.getPath(), deviceLibrary.getPath()),
                        "--headers", headers.getParentFile().getPath(), "--package-name", "org", "--output-file-path",
                        outputJar.getPath(), "--ld-flags", ldFlags.getPath(), "--bundle", bundle.getPath()
                });

        IExecutor executor = ExecutorManager.getExecutorByParams(argc);
        assertNotNull(executor);
        assertTrue(executor instanceof ThirdPartyLibraryLinkExecutor);

        // generate binding & prepare output jar
        executor.execute();

        // check output jar file existence
        assertTrue(outputJar.exists());

        JarFile jarFile = new JarFile(outputJar);
        Manifest manifest = jarFile.getManifest();

        Attributes attributes = manifest.getMainAttributes();
        String manifestLDFlags = attributes.getValue("MOE_CUSTOM_LINKER_FLAGS");
        Set<String> realLDFlags = new HashSet<String>(Arrays.asList(flags.split(";")));
        realLDFlags.add("-ObjC");
        assertEquals(realLDFlags, new HashSet<String>(Arrays.asList(manifestLDFlags.split(";"))));

        String manifestSimFramework = attributes.getValue("MOE_ThirdpartyFramework_ios_simulator");
        assertEquals("./lib/iphonesimulator/libTestLibrary.a", manifestSimFramework);

        String manifestDevFramework = attributes.getValue("MOE_ThirdpartyFramework_ios_device");
        assertEquals("./lib/iphoneos/libTestLibrary.a", manifestDevFramework);

        String manifestBundle = attributes.getValue("MOE_BUNDLE_FILE_RESOURCES");
        assertEquals("./bundle/moe_logo.png;", manifestBundle);

        assertNotNull(jarFile.getEntry("bundle/moe_logo.png"));
        assertNotNull(jarFile.getEntry("lib/iphonesimulator/libTestLibrary.a"));
        assertNotNull(jarFile.getEntry("lib/iphoneos/libTestLibrary.a"));

        jarFile.close();

    }

    @AfterClass
    public static void destroy() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e1) {
            }
        }
        if (err != null) {
            try {
                err.close();
            } catch (IOException e1) {
            }
        }

    }
}
