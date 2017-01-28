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

package org.moe.common.exec;

import org.moe.common.utils.OsUtils;

import java.io.File;
import java.io.IOException;

/**
 * Gradle exec.
 */
public class GradleExec extends AbstractExec {

    /**
     * Gradlew name.
     */
    static private String gradlew;

    static {
        if (OsUtils.isMac()) {
            gradlew = "gradlew";
        } else if (OsUtils.isWindows()) {
            gradlew = "gradlew.bat";
        }
    }

    /**
     * Project file.
     */
    private final File project;

    /**
     * Creates a new GradleExec instance.
     *
     * @param project Project file
     */
    public GradleExec(File project) {
        if (project == null) {
            throw new NullPointerException();
        }
        this.project = project;
    }

    /**
     * Creates a new GradleExec instance.
     *
     * @param project    Project file
     * @param name       Exec name
     * @param workingDir Working directory
     */
    public GradleExec(File project, String name, File workingDir) {
        super(name, workingDir);
        if (project == null) {
            throw new NullPointerException();
        }
        this.project = project;
    }

    @Override
    protected String lookupExec() {
        File path = project;
        File gradleWPath = null;
        while ((gradleWPath == null) && (path != null)) {
            gradleWPath = getGradleW(path);
            path = path.getParentFile();
        }
        if (gradleWPath != null) {
            return gradleWPath.getAbsolutePath();
        }
        String out = getGradleFromWhich();
        if (out != null) {
            return out;
        }
        throw new RuntimeException("Failed to locate 'gradle' executable!");
    }

    /**
     * Looks up default Gradle installation.
     *
     * @return Gradle path
     */
    private String getGradleFromWhich() {
        SimpleExec whichExec = SimpleExec.getWhich("gradle");
        String out;
        try {
            out = ExecOutputCollector.collect(whichExec).trim();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return out.length() == 0 ? null : out;
    }

    /**
     * Checks for existence of Gradle wrapper.
     *
     * @param path Gradle wrapper
     * @return Gradle wrapper file or null if it doesn't exist
     */
    private File getGradleW(File path) {
        path = new File(path, gradlew);
        if (path.exists() && path.isFile()) {
            return path;
        }
        return null;
    }
}
