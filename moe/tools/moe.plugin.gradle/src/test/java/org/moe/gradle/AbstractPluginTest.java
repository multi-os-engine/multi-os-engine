/*
Copyright (C) 2017 Migeran

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

package org.moe.gradle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public abstract class AbstractPluginTest {
    @Rule
    public final TemporaryFolder testProjectDir = new TemporaryFolder();
    private List<File> pluginClasspath;
    private String sdkLocalbuild;
    private String moePluginVersion;

    public TemporaryFolder getTestProjectDir() {
        return testProjectDir;
    }

    public List<File> getPluginClasspath() {
        return Collections.unmodifiableList(pluginClasspath);
    }

    public String getSdkLocalbuild() {
        return sdkLocalbuild;
    }

    public String getMoePluginVersion() {
        return moePluginVersion;
    }

    protected String getTestResourcesFolder() {
        throw new IllegalStateException("unimplemented");
    }

    @Before
    public void setUp() throws Exception {

        final URL pluginClasspathResource = getClass().getClassLoader().getResource("plugin-classpath.txt");
        if (pluginClasspathResource == null) {
            throw new IllegalStateException("Did not find plugin classpath resource, run `testClasses` build task.");
        }

        final List<String> lines = FileUtils.readLines(new File(pluginClasspathResource.getFile()));
        pluginClasspath = lines.stream().map(File::new).collect(Collectors.toList());

        final URL sdkLocalbuildResource = getClass().getClassLoader().getResource("plugin-sdk-localbuild.txt");
        if (sdkLocalbuildResource == null) {
            throw new IllegalStateException(
                    "Did not find plugin sdk localbuild resource, run `testClasses` build task.");
        }

        sdkLocalbuild = FileUtils.readLines(new File(sdkLocalbuildResource.getFile())).get(0);
        assertTrue(new File(sdkLocalbuild).exists());

        final URL pluginVersionResource = getClass().getClassLoader().getResource("plugin-version.txt");
        if (pluginVersionResource == null) {
            throw new IllegalStateException("Did not find plugin version resource, run `testClasses` build task.");
        }

        moePluginVersion = FileUtils.readLines(new File(pluginVersionResource.getFile())).get(0);
        assertNotNull(moePluginVersion);
        assertFalse(moePluginVersion.length() == 0);
    }

    protected void writeFile(File destination, String content) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(destination));
            output.write(content);
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    protected void copyJavaSourceFile(String filename) throws IOException {
        final ClassLoader loader = getClass().getClassLoader();
        IOUtils.copy(loader.getResourceAsStream(getTestResourcesFolder() + "/" + filename),
                new FileOutputStream(testProjectDir.newFile("src/main/java/org/moe/" + filename)));
    }
}
