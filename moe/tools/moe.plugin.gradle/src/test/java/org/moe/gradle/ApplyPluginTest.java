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

package org.moe.gradle;

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS;
import static org.junit.Assert.*;

public class ApplyPluginTest extends AbstractPluginTest {

    @Test
    public void testPluginApply() throws IOException {
        File buildFile = testProjectDir.newFile("build.gradle");

        // @formatter:off
        String buildFileContent = "plugins {\n" +
                "    id 'java'\n" +
                "    id 'moe-sdk'\n" +
                "}";
        // @formatter:on
        writeFile(buildFile, buildFileContent);

        BuildResult result = GradleRunner.create()
                .withProjectDir(testProjectDir.getRoot())
                .withArguments("tasks", "-Pmoe.sdk.localbuild=" + getSdkLocalbuild(), "-s")
                .withPluginClasspath(getPluginClasspath())
                .build();

        assertTrue(result.getOutput().contains("moe"));
        assertEquals(result.task(":tasks").getOutcome(), SUCCESS);
    }
}
