package org.moe.gradle;

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS;
import static org.junit.Assert.*;

public class MinGradleSupportTest extends AbstractPluginTest {

    @Test
    public void testPluginApplyMinGradle() throws IOException {
        File buildFile = testProjectDir.newFile("build.gradle");
        File props = testProjectDir.newFile("gradle.properties");

        // @formatter:off
        String buildFileContent = "plugins {\n" +
                "    id 'java'\n" +
                "    id 'moe'\n" +
                "}";
        // @formatter:on
        writeFile(buildFile, buildFileContent);

        String oldJdk = System.getProperty("moe.test.java_home");
        assertNotNull("min-gradle test needs a JDK <= 19", oldJdk);

        writeFile(props, "org.gradle.java.home=" + oldJdk.replace("\\", "/") + "\n");

        BuildResult result = GradleRunner.create()
                .withGradleVersion(AbstractMoePlugin.getGradleMinVersion())
                .withProjectDir(testProjectDir.getRoot())
                .withArguments("tasks", "-Pmoe.sdk.localbuild=" + getSdkLocalbuild(), "-s")
                .withPluginClasspath(getPluginClasspath())
                .build();

        assertTrue(result.getOutput().contains("moe"));
        assertEquals(result.task(":tasks").getOutcome(), SUCCESS);
    }
}
