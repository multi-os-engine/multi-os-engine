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

package org.moe;

import java.util.HashSet;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.GradleException;
import org.gradle.api.GradleScriptException;

class NativeAndroidComponentPlugin implements Plugin<Project> {
    def String project_name
    def String project_base_name
    def String project_canonical_name
    def String project_domain_name
    def Project target

    void apply(Project target) {
        this.target = target

        setProperties()

        target.extensions.create("nativeAndroidComponent", NativeAndroidComponentBuildExtension)
        target.configurations.create("nativeLib")

        boolean custom = target.tasks.findByPath("buildNative") != null;

        boolean isPrivate = !target.hasProperty('public');

        if(!custom) {
            target.tasks.create("buildNative") << {
                if(target.nativeAndroidComponent.target_platform == "ios" || target.nativeAndroidComponent.target_platform == "common") {
                    buildNativeTarget("${project_name}.xcodeproj", "Release", "iphoneos", "${project_base_name}", null)
                    buildNativeTarget("${project_name}.xcodeproj", "Release", "iphonesimulator", "${project_base_name}", null)
                    if(isPrivate) {
                        buildNativeTarget("${project_name}.xcodeproj", "Debug", "iphoneos", "${project_base_name}", null)
                        buildNativeTarget("${project_name}.xcodeproj", "Debug", "iphonesimulator", "${project_base_name}", null)
                    }
                }
                if(target.nativeAndroidComponent.target_platform == "mac" || target.nativeAndroidComponent.target_platform == "common") {
                    buildNativeTarget("${project_name}.xcodeproj", "Release", "macosx", "${project_base_name}", null)
                    if(isPrivate) {
                        buildNativeTarget("${project_name}.xcodeproj", "Debug", "macosx", "${project_base_name}", null)
                    }
                }
            }

            target.tasks.create("checkNative") << {
                def clangFormatCmd = findExecutable(
                                                    target.hasProperty("clangFormatPath") ?
                                                    target.getProperty("clangFormatPath") :
                                                    "clang-format");
                if (clangFormatCmd == null) {
                    logger.warn("Unable to find clang-format in PATH, cannot check source formatting")
                    return ;
                }

                def errors = [];
                this.target.fileTree("src").findAll { file ->
                    !file.parentFile.name.endsWith("_gen") && !file.parentFile.name.equals("inline")
                    }.each { file ->
                    def log = new ByteArrayOutputStream();
                    this.target.exec {
                        executable = clangFormatCmd

                        args "-output-replacements-xml"
                        args "-style=Google"
                        args "$file"

                        setIgnoreExitValue false

                        setErrorOutput(log)
                        setStandardOutput(log)
                    }
                    if (log.toString().contains("</replacement>")) {
                        def content = file.getText('UTF-8')
                        def parser = new XmlSlurper()
                        parser.setKeepWhitespace(true)
                        def records = parser.parseText(log.toString())
                        for(def record : records.replacement.list()) {
                            def offset = record.@offset.toInteger()
                            def length = record.@length.toInteger()
                            def prefix = content.substring(0, offset)
                            def lineBegin = prefix.lastIndexOf('\n') + 1
                            def row = prefix.length() - prefix.replace("\n", "").length() + 1
                            def col = offset - (lineBegin - 1)
                            def lineEnd = content.substring(offset + length).indexOf('\n')
                            if(lineEnd < 0) {
                                lineEnd = content.length()
                            } else {
                                lineEnd += offset + length
                            }
                            def oldLine = "\t" + content.substring(lineBegin, lineEnd).replace("\n", "\n\t")
                            def newLine = "\t" + (content.substring(lineBegin, offset) + record.text() +
                                content.substring(offset + length, lineEnd)).replace("\n", "\n\t")
                            errors.push("$file:$row:$col\nFix\n$oldLine\nto:\n$newLine\n")
                        }
                    }
                }
                if(errors.size() != 0) {
                    throw new GradleException("Formatting error" + (errors.size() == 1 ? "" : "s") + " in native sources:\n" + errors.join("\n"))
                }
            }

            target.tasks.buildNative.dependsOn(target.tasks.checkNative)

            target.tasks.create("formatNative") << {
                def clangFormatCmd = findExecutable(
                                                    target.hasProperty("clangFormatPath") ?
                                                    target.getProperty("clangFormatPath") :
                                                    "clang-format");
                if (clangFormatCmd == null) {
                    throw new GradleException("Unable to find clang-format in PATH, cannot check source formatting")
                    return;
                }
                target.fileTree("src").findAll { file ->
                    !file.parentFile.name.endsWith("_gen") && !file.parentFile.name.equals("inline")
                    }.each { file ->
                    try {
                        def log = new ByteArrayOutputStream();
                        target.exec {
                            executable = clangFormatCmd

                            args "-i"
                            args "-style=Google"
                            args "$file"

                            setIgnoreExitValue false

                            setErrorOutput(log)
                            setStandardOutput(log)
                        }
                    } catch (Exception ex) {
                        throw new GradleException("Could not format $file!", ex)
                    }
                }
            }
        }

        target.afterEvaluate {
            for (def dep in target.configurations.nativeLib.getAllDependencies()*.getDependencyProject()) {
                target.evaluationDependsOn(dep.path)
                target.tasks.buildNative.dependsOn(dep.tasks.buildNative)
            }
        }
    }

    private String setProperties() {
        project_name = this.target.getName()

        def delimeter = project_name.lastIndexOf(".")
        if(delimeter == -1) delimeter = -1
        project_base_name = project_name.substring(delimeter+1)

        if(delimeter == -1) {
            project_domain_name = ""
            project_canonical_name = project_name
        } else {
            delimeter = project_name.indexOf(".")
            project_domain_name = project_name.substring(0, delimeter)
            project_canonical_name = project_name.substring(delimeter+1)
        }
    }

    private void buildNativeTarget(project, configuration, sdk, target, arch) {
        ByteArrayOutputStream ostream = new ByteArrayOutputStream();
        try {
            this.target.exec {
                executable = "xcodebuild"

                args "-project", "$project"
                args "-target", "$target"
                args "-sdk", "$sdk"
                args "-configuration", "$configuration"

                if(arch != null) {
                    args "-arch", "$arch"
                }

                def num = System.getenv("BUILD_NUMBER");
                if (num != null) {
                    args "GRADLE_BUILD_VERSION=${this.target.version_moe}.${num}"
                }

                setErrorOutput(ostream)
                setStandardOutput(ostream)
            }
        } catch(Exception ex) {
            throw new GradleScriptException("xcodebuild failed with: ${ostream}", ex);
        }
    }

    private String findExecutable(String name) {
        def localFile = new File(name);
        if (localFile.canExecute()) {
            return localFile.getAbsolutePath();
        }
        def systemPath = System.getenv("PATH");
        String[] pathDirs = systemPath.split(File.pathSeparator);

        File fullyQualifiedExecutable = null;
        for (String pathDir : pathDirs)
        {
            File file = new File(pathDir, name);
            if (file.canExecute())
            {
                fullyQualifiedExecutable = file;
                break;
            }
        }
        if (fullyQualifiedExecutable == null) {
            return null;
        }
        return fullyQualifiedExecutable.getAbsolutePath();
    }
}
