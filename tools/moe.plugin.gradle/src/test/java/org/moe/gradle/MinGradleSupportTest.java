package org.moe.gradle;

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinGradleSupportTest extends AbstractPluginTest {

    @Test
    public void testPluginApplyMinGradle() throws IOException {
        File buildFile = testProjectDir.newFile("build.gradle");

        // @formatter:off
        String buildFileContent = "plugins {\n" +
                "    id 'java'\n" +
                "    id 'moe'\n" +
                "}";
        // @formatter:on
        writeFile(buildFile, buildFileContent);

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
