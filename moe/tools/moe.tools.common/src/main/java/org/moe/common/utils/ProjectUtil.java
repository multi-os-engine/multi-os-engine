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
import org.moe.common.exec.GradleExec;

import java.io.File;
import java.util.Properties;

/**
 * Utility class for retrieving info from Gradle.
 */
public class ProjectUtil {
    /**
     * moeXcodeProperties task name.
     */
    public static final String XCODE_PROPERTIES_TASK = "moeXcodeProperties";
    /**
     * moeSDKProperties task name.
     */
    public static final String SDK_PROPERTIES_TASK = "moeSDKProperties";

    /**
     * Key: moe.xcode.project.
     */
    public static final String XCODE_PROJECT_KEY = "moe.xcode.project";
    /**
     * Key: moe.xcode.workspace.
     */
    public static final String XCODE_WORKSPACE_KEY = "moe.xcode.workspace";
    /**
     * Key: moe.xcode.mainTarget.
     */
    public static final String XCODE_MAIN_TARGET_KEY = "moe.xcode.mainTarget";
    /**
     * Key: moe.xcode.testTarget.
     */
    public static final String XCODE_TEST_TARGET_KEY = "moe.xcode.testTarget";
    /**
     * Key: moe.xcode.mainScheme.
     */
    public static final String XCODE_MAIN_SCHEME_KEY = "moe.xcode.mainScheme";
    /**
     * Key: moe.xcode.testScheme.
     */
    public static final String XCODE_TEST_SCHEME_KEY = "moe.xcode.testScheme";
    /**
     * Key: moe.sdk.home.
     */
    public static final String SDK_PATH_KEY = "moe.sdk.home";

    /**
     * Returns the properties returned by the specified task.
     *
     * @param projectFile Project file
     * @param taskName    Task to run
     * @return Parsed properties
     */
    public static Properties retrievePropertiesFromGradle(File projectFile, String taskName) {
        GradleExec exec = new GradleExec(projectFile, null, projectFile);
        exec.getArguments().add(taskName);

        final Properties properties = new Properties();
        try {
            String output = ExecOutputCollector.collect(exec);
            final String[] outputLines = output.split("[\\n\\r]");
            for (String line : outputLines) {
                if (line.contains("=")) {
                    try {
                        final int start = line.indexOf('=');
                        properties.put(line.substring(0, start), line.substring(start + 1));
                    } catch (Throwable ignore) {
                        System.out.println("Failed to add property line: " + line);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return properties;
    }
}
