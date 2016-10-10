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

package org.moe.generator.project.writer;

import java.io.File;

/**
 * ContentProvider class provides default contents for generated files.
 */
public final class ContentProvider {

    /**
     * Private contructor.
     */
    private ContentProvider() {

    }

    /**
     * Generates the main.cpp file.
     *
     * @param file file to write to
     */
    public static void generateMainCppContent(File file) {
        ContentWriter w = new ContentWriter(file);
        w.wl("#include <MOE/MOE.h>");
        w.nl();
        w.wl("int main(int argc, char *argv[]) {");
        w.wl("    return moevm(argc, argv);");
        w.wl("}");
        w.close();
    }

    /**
     * Generates the shell script build phase contents for Xcode.
     *
     * @param isTest is test target
     * @return shell script build phase contents
     */
    public static String getGradleBuildScriptContents(boolean isTest) {
        StringBuilder b = new StringBuilder();
        // Fail on error
        b.append("set -e\n");
        b.append("\n");

        // Check project directory
        b.append("if [ ! -d \"$MOE_PROJECT_DIR\" ]; then\n");
        b.append("    echo \"$0:$LINENO:1: error: 'MOE_PROJECT_DIR' doesn't point to a directory!\"; exit 1;\n");
        b.append("fi\n");
        b.append("\n");

        // cd project directory
        b.append("cd \"$MOE_PROJECT_DIR/\"\n");
        b.append("\n");

        // Prepare JAVA_HOME
        b.append("export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)\n");
        b.append("\n");

        // Look for Gradle wrapper
        b.append("function findGradle {\n");
        b.append("    CD=\"$PWD\"\n");
        b.append("    while [ \"$CD\" != \"\" ]; do\n");
        b.append("        echo \"Looking for gradlew in $CD\"\n");
        b.append("        if [ -x \"$CD/gradlew\" ]; then\n");
        b.append("            GRADLE_EXEC=$CD/gradlew\n");
        b.append("            return 0\n");
        b.append("        fi\n");
        b.append("        CD=\"${CD%/*}\"\n");
        b.append("    done\n");
        b.append("\n");
        b.append("    echo \"Checking with 'which'\"\n");
        b.append("    GRADLE_EXEC=$(which 'gradle')\n");
        b.append("\n");
        b.append("    if [ \"$GRADLE_EXEC\" = \"\" ]; then\n");
        b.append("        echo \"Failed to locate 'gradle' executable!\"\n");
        b.append("        exit 1\n");
        b.append("    fi\n");
        b.append("}\n");
        b.append("\n");

        // Invoke Gradle from Xcode
        b.append("if [ -z \"$MOE_GRADLE_EXTERNAL_BUILD\" ]; then\n");
        b.append("    findGradle\n");
        b.append("\n");
        if (isTest) {
            b.append("    export MOE_BUILD_SOURCE_SET=test\n");
        }
        b.append("    \"$GRADLE_EXEC\" --daemon moeXcodeInternal -s\n");
        b.append("fi\n");
        b.append("\n");

        // Check Gradle build directory
        b.append("if [ ! -d \"${MOE_PROJECT_BUILD_DIR}\" ]; then\n");
        b.append("    echo \"$0:$LINENO:1: error: 'MOE_PROJECT_BUILD_DIR' doesn't point to a directory!\"; exit 1;\n");
        b.append("fi\n");
        b.append("\n");

        // Copy application.jar, preregister.txt and classlist.txt resources
        b.append("mkdir -p \"${TARGET_BUILD_DIR}/${UNLOCALIZED_RESOURCES_FOLDER_PATH}\"\n");
        if (isTest) {
            b.append("cp \"${MOE_PROJECT_BUILD_DIR}/moe/test/application.jar\" "
                    + "\"${TARGET_BUILD_DIR}/${UNLOCALIZED_RESOURCES_FOLDER_PATH}/\"\n");
            b.append("cp \"${MOE_PROJECT_BUILD_DIR}/moe/test/preregister.txt\" "
                    + "\"${TARGET_BUILD_DIR}/${UNLOCALIZED_RESOURCES_FOLDER_PATH}/\"\n");
            b.append("cp \"${MOE_PROJECT_BUILD_DIR}/moe/test/classlist.txt\" "
                    + "\"${TARGET_BUILD_DIR}/${UNLOCALIZED_RESOURCES_FOLDER_PATH}/\"\n");
        } else {
            b.append("cp \"${MOE_PROJECT_BUILD_DIR}/moe/main/application.jar\" "
                    + "\"${TARGET_BUILD_DIR}/${UNLOCALIZED_RESOURCES_FOLDER_PATH}/\"\n");
            b.append("cp \"${MOE_PROJECT_BUILD_DIR}/moe/main/preregister.txt\" "
                    + "\"${TARGET_BUILD_DIR}/${UNLOCALIZED_RESOURCES_FOLDER_PATH}/\"\n");
        }

        return b.toString();
    }
}
