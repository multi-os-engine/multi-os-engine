package org.moe.gradle;

import org.apache.commons.io.FileUtils;
import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ApplyPluginTest {
    @Rule
    public final TemporaryFolder testProjectDir = new TemporaryFolder();
    private File buildFile;
    List<File> pluginClasspath;

    @Before
    public void setup() throws IOException {
        buildFile = testProjectDir.newFile("build.gradle");

        URL pluginClasspathResource = getClass().getClassLoader().getResource("plugin-classpath.txt");
        if (pluginClasspathResource == null) {
            throw new IllegalStateException("Did not find plugin classpath resource, run `testClasses` build task.");
        }

        final List<String> lines = FileUtils.readLines(new File(pluginClasspathResource.getFile()));
        pluginClasspath = lines.stream().map(File::new).collect(Collectors.toList());
    }

    @Test
    public void testPluginApply() throws IOException {
        String buildFileContent = "plugins {\n" +
                "    id 'java'\n" +
                "    id 'moe'\n" +
                "}";
        writeFile(buildFile, buildFileContent);

        BuildResult result = GradleRunner.create()
                .withProjectDir(testProjectDir.getRoot())
                .withArguments("tasks")
                .withPluginClasspath(pluginClasspath)
                .build();

        assertTrue(result.getOutput().contains("moe"));
        assertEquals(result.task(":tasks").getOutcome(), SUCCESS);
    }

    private void writeFile(File destination, String content) throws IOException {
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
}
