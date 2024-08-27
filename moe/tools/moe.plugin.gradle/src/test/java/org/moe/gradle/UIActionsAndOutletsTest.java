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

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Test;
import org.moe.generator.project.MOEProjectComposer;
import org.moe.generator.project.MOEProjectComposer.MOEProjectComposerException;
import org.moe.generator.project.MOEProjectComposer.Template;
import org.moe.gradle.utils.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS;
import static org.junit.Assert.*;

public class UIActionsAndOutletsTest extends AbstractPluginTest {

    protected String getTestResourcesFolder() {
        return "ui-actions-and-outlets";
    }

    @Test
    public void testGeneratedCode() throws MOEProjectComposerException, IOException {
        new MOEProjectComposer()
                .setMoeVersion("0.0.0")
                .setOrganizationID("org.moe")
                .setOrganizationName("Multi-OS Engine")
                .setPackageName("org.moe")
                .setProjectName("Test")
                .setTargetDirectory(testProjectDir.getRoot())
                .setTemplate(Template.IOS_JAVA_SINGLE_VIEW)
                .setSubproject(true)
                .compose();

        copyJavaSourceFile("IgnoredController.java");
        copyJavaSourceFile("InvalidController.java");
        copyJavaSourceFile("UnmappedController.java");
        copyJavaSourceFile("ValidController.java");

        final File buildGradleFile = new File(testProjectDir.getRoot(), "build.gradle");
        String gradle = FileUtils.read(buildGradleFile);
        gradle = gradle.replace("classpath group:", "// classpath group:");
        gradle = gradle.replace("apply plugin: 'moe'", "plugins { id 'moe'; id 'eclipse' }");
        gradle = gradle.replaceAll("apply plugin: '\\w+'", "");
        final StringBuilder gradleBuilder = new StringBuilder(gradle);
        gradleBuilder.append('\n');
        gradleBuilder.append("moe.actionsAndOutlets.include 'org\\\\.moe\\\\.InvalidController'\n");
        gradleBuilder.append("moe.actionsAndOutlets.include 'org\\\\.moe\\\\.UnmappedController'\n");
        gradleBuilder.append("moe.actionsAndOutlets.include 'org\\\\.moe\\\\.ValidController'\n");
        gradleBuilder.append("moe.actionsAndOutlets.excludeLibrary 'AVFoundation'\n");
        gradleBuilder.append("moe.actionsAndOutlets.additionalCode '#warning This is my additional code!'\n");
        FileUtils.write(buildGradleFile, gradleBuilder.toString());

        BuildResult result = GradleRunner.create()
                .withProjectDir(testProjectDir.getRoot())
                .withArguments("moeGenerateUIObjCInterfaces", "-Pmoe.sdk.localbuild=" + getSdkLocalbuild(), "-s")
                .withPluginClasspath(getPluginClasspath())
                .build();

        final String output = result.getOutput();
        assertTrue(output.contains("moe"));
        assertEquals(result.task(":moeGenerateUIObjCInterfaces").getOutcome(), SUCCESS);

        assertTrue(output.contains(
                "Skipping org.moe.InvalidController: superclass (org.moe.UnmappedController) is not mapped to Objective-C"));
        assertTrue(output.contains(
                "Skipping org.moe.natj.objc.ObjCObject org.moe.ValidController.bad_property_hasArguments(int): cannot have the @Property annotation and have arguments at the same time"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_property_nonObjectReturn(): cannot have the @Property annotation and have a non-object return type"));
        assertTrue(output.contains(
                "Skipping int org.moe.ValidController.bad_action_intReturnType(): cannot have the @IBAction annotation and have a non-void return type"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_intFirstArg(int): cannot have the @IBAction annotation, have 1 one or more arguments and have a non-object first argument type"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_unsupportedFirstArg(java.lang.Object): unsupported first argument type"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_badSelector0(org.moe.natj.objc.ObjCObject): bad selector, expected one argument in selector"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_badSelector1(org.moe.natj.objc.ObjCObject): malformed selector, selector must end in ':'"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_badSelector2(org.moe.natj.objc.ObjCObject): bad selector, expected one argument in selector"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_intSecondArg(org.moe.natj.objc.ObjCObject, int): cannot have the @IBAction annotation, have 2 one or more arguments and have a non UIEvent second argument type"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_nonUIEventSecondArg(org.moe.natj.objc.ObjCObject, org.moe.natj.objc.ObjCObject): cannot have the @IBAction annotation, have 2 one or more arguments and have a non UIEvent second argument type"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_badSelector3(org.moe.natj.objc.ObjCObject, apple.uikit.UIEvent): bad selector, expected two arguments in selector"));
        assertTrue(output.contains(
                "Skipping void org.moe.ValidController.bad_action_badSelector4(org.moe.natj.objc.ObjCObject, apple.uikit.UIEvent): bad selector, expected two arguments in selector"));

        final String source = FileUtils
                .read(new File(testProjectDir.getRoot(), "build/moe/main/ui-headers/moe-main-interfaces.m"));

        assertTrue(source.contains("#warning This is my additional code!"));

        assertTrue(source.contains("@import UIKit;"));
        assertFalse(source.contains("@import AVFoundation;"));

        assertFalse(source.contains("@interface IgnoredController : UIViewController"));

        assertTrue(source.contains("@interface ValidController : UIViewController"));
        assertFalse(source.contains("bad_property_missingSelector"));
        assertTrue(source.contains("@property (strong) id ok_property_1;"));
        assertTrue(source.contains("@property (strong) NSObject* ok_property_2;"));
        assertTrue(source.contains("@property (strong) UILabel* ok_property_3;"));
        assertTrue(source.contains("@property (strong) id<UIApplicationDelegate> ok_property_4;"));
        assertTrue(source.contains("@property (strong) id<AVAudioPlayerDelegate> ok_property_5;"));
        assertTrue(source.contains("- (IBAction)ok_action_1;"));
        assertTrue(source.contains("- (IBAction)ok_action_2:(id)sender;"));
        assertTrue(source.contains("- (IBAction)ok_action_3:(id)sender :(UIEvent *)event;"));
        assertTrue(source.contains("- (IBAction)ok_action_3:(id)sender a:(UIEvent *)event;"));
    }
}
