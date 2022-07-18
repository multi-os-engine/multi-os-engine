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

package org.moe.idea.builder;

import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import com.intellij.codeInsight.actions.ReformatCodeProcessor;
import com.intellij.execution.RunManager;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.SettingsStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.externalSystem.importing.ImportSpecBuilder;
import com.intellij.openapi.externalSystem.model.ExternalSystemDataKeys;
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil;
import com.intellij.openapi.externalSystem.util.ExternalSystemUtil;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.StdModuleTypes;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.LanguageLevelModuleExtension;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.roots.SourceFolder;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;

import org.apache.commons.codec.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.java.JavaModuleSourceRootTypes;
import org.jetbrains.jps.model.java.JavaResourceRootType;
import org.jetbrains.jps.model.java.JavaSourceRootProperties;
import org.jetbrains.plugins.gradle.settings.DistributionType;
import org.jetbrains.plugins.gradle.settings.GradleProjectSettings;
import org.jetbrains.plugins.gradle.settings.GradleSettings;
import org.jetbrains.plugins.gradle.util.GradleConstants;
import org.moe.generator.project.MOEProjectComposer;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.sdk.MOESdkType;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.wizards.project.MOEWizardPageOne;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MOEModuleBuilder extends JavaModuleBuilder {
    private MOEModuleProperties moduleProperties;

    private MOEProjectTemplate template;
    private boolean isNewProject = false;

    MOEModuleBuilder() {
        moduleProperties = new MOEModuleProperties();
    }

    public MOEModuleProperties getMOEModuleProperties() {
        return moduleProperties;
    }

    public void setTemplate(MOEProjectTemplate template) {
        this.template = template;
    }

    @Override
    public String getBuilderId() {
        return getClass().getName() + template.getType().toString();
    }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext context, @NotNull ModulesProvider modulesProvider) {
        this.isNewProject = context.isCreatingNewProject();

        ArrayList<ModuleWizardStep> steps = new ArrayList<ModuleWizardStep>();

        steps.add(new MOEWizardPageOne(this));

        return steps.toArray(new ModuleWizardStep[steps.size()]);
    }

    @Override
    public void setupRootModel(final ModifiableRootModel rootModel) throws ConfigurationException {
        Project project = rootModel.getProject();
        Module module = rootModel.getModule();

        myJdk = MOESdkType.getJDK();

        ProjectRootManager.getInstance(project).setProjectSdk(myJdk);

        rootModel.getModuleExtension(LanguageLevelModuleExtension.class).setLanguageLevel(MOESdkType.REQUIRED_JAVA_LANGUAGE_LEVEL);

        super.setupRootModel(rootModel);

        ProjectRootManager projectRootManager = ProjectRootManager.getInstance(project);

        String projectPath = rootModel.getProject().getBasePath();

        String contentEntryPath = getContentEntryPath();

        if (contentEntryPath == null || contentEntryPath.isEmpty()) {
            throw new RuntimeException("Can't get content entry path.");
        }

        VirtualFile contentRoot = LocalFileSystem.getInstance().findFileByIoFile(new File(contentEntryPath));

        try {
            createModule(contentRoot, project);
        } catch (MOEProjectComposer.MOEProjectComposerException e) {
            throw new ConfigurationException(e.getMessage());
        }

        VirtualFile[] contentFiles = new VirtualFile[]{contentRoot};

        VfsUtil.markDirtyAndRefresh(false, true, true, contentFiles);

        new ReformatCodeProcessor(project, module, false).run();

        String resourcePath = "src/main/" + MOESdkPlugin.getResourcesFolderName();
        String sourcePath = "src/main/java";

        for (ContentEntry entry : rootModel.getContentEntries()) {
            for (SourceFolder srcFolder : entry.getSourceFolders()) {
                entry.removeSourceFolder(srcFolder);
            }

            VirtualFile sourceFile = null;

            if (contentRoot != null) {
                sourceFile = contentRoot.findFileByRelativePath(sourcePath);
            }

            if (sourceFile != null) {
                entry.addSourceFolder(sourceFile, false);
            }

            VirtualFile resourceFolder = null;

            if (contentRoot != null) {
                resourceFolder = contentRoot.findFileByRelativePath(resourcePath);
            }

            if (resourceFolder != null && resourceFolder.exists()) {
                SourceFolder sourceFolder = entry.addSourceFolder(resourceFolder, JavaResourceRootType.RESOURCE);

                JavaSourceRootProperties properties = sourceFolder.getJpsElement().getProperties(JavaModuleSourceRootTypes.SOURCES);

                if (properties != null) {
                    properties.setForGeneratedSources(true);
                }
            }
        }

        if (!isNewProject) {
            File settingsGradle = new File(projectPath, "settings.gradle");

            try {
                if (!settingsGradle.exists()) {
                    if (!settingsGradle.createNewFile()) {
                        MOEToolWindow.getInstance(project).error("Error occurred during gradle settings file.");
                    }
                }

                modifyGradleSettings(settingsGradle, new Module[]{rootModel.getModule()});
            } catch (IOException e) {
                MOEToolWindow.getInstance(project).error("Error occurred during gradle configuration: " + e.getMessage());
            }
        } else {
            try {
                configureGradle(rootModel);
            } catch (IOException e) {
                MOEToolWindow.getInstance(project).error("Error occurred during gradle configuration: " + e.getMessage());
            }
        }

        // Refresh the gradle import
        ImportSpecBuilder builder = new ImportSpecBuilder(rootModel.getProject(), GradleConstants.SYSTEM_ID);
        builder.forceWhenUptodate(true);
        ExternalSystemUtil.refreshProjects(builder);

        if (contentRoot != null) {
            contentRoot.refresh(false, true);
        }

        StartupManager.getInstance(project).runWhenProjectIsInitialized(new Runnable() {
            @Override
            public void run() {
                configureRun(rootModel);
            }
        });
    }

    @Override
    public ModuleType getModuleType() {
        return StdModuleTypes.JAVA;
    }

    @Override
    public void setSourcePaths(List<Pair<String, String>> list) {
    }

    @Override
    public void addSourcePath(Pair<String, String> pair) {
    }

    @Nullable
    @Override
    public ModuleWizardStep modifySettingsStep(@NotNull SettingsStep settingsStep) {

        String projectName = moduleProperties.getProjectName();

        if (projectName != null && settingsStep.getModuleNameLocationSettings() != null) {
            settingsStep.getModuleNameLocationSettings().setModuleName(projectName);
        }

        return StdModuleTypes.JAVA.modifySettingsStep(settingsStep, this);
    }

    private void createModule(VirtualFile contentRoot, Project project) throws MOEProjectComposer.MOEProjectComposerException {
        String path = contentRoot.getCanonicalPath();

        if (moduleProperties == null) {
            return;
        }

        moduleProperties.setProjectRoot(path);

        MOEProjectComposer projectComposer = new MOEProjectComposer();

        String packageName = moduleProperties.getPackageName();

        projectComposer.setTargetDirectory(new File(moduleProperties.getProjectRoot()))
        .setMoeVersion("1.9.+")
        .setProjectName(moduleProperties.getProjectName())
        .setOrganizationName(moduleProperties.getOrganizationName())
        .setOrganizationID(moduleProperties.getCompanyIdentifier())
        .setPackageName(packageName)
        .setTemplate(template.getType())
        .setSubproject(!isNewProject)
        .compose();
    }

    private void configureGradle(ModifiableRootModel rootModel) throws IOException {
        Project project = rootModel.getProject();

        String contentEntryPath = getContentEntryPath();

        if (contentEntryPath == null) {
            return;
        }

        GradleProjectSettings gradleSettings = new GradleProjectSettings();

        gradleSettings.setDistributionType(DistributionType.WRAPPED);

        gradleSettings.setExternalProjectPath(contentEntryPath);

        gradleSettings.setResolveModulePerSourceSet(false);

        GradleSettings settings = (GradleSettings) ExternalSystemApiUtil.getSettings(rootModel.getProject(), GradleConstants.SYSTEM_ID);
        project.putUserData(ExternalSystemDataKeys.NEWLY_CREATED_PROJECT, Boolean.TRUE);
        settings.linkProject(gradleSettings);

        FileDocumentManager.getInstance().saveAllDocuments();
    }

    private void modifyGradleSettings(@NotNull File file, Module[] modules) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        String newLine = System.getProperty("line.separator");

        String existing = Files.asCharSource(file, Charsets.UTF_8).read();

        if (!existing.endsWith(newLine)) {
            stringBuilder.append(newLine);
        }

        for (Module module : modules) {
            stringBuilder.append("include ':");
            stringBuilder.append(module.getName());
            stringBuilder.append("'");
            stringBuilder.append(newLine);
        }

        Files.asCharSink(file, Charsets.UTF_8, FileWriteMode.APPEND).write(stringBuilder.toString());

        LocalFileSystem.getInstance().refreshIoFiles(Collections.singletonList(file));
    }

    private void configureRun(ModifiableRootModel rootModel) {
        Project project = rootModel.getProject();

        RunManager runManager = RunManager.getInstance(project);

        Module module = rootModel.getModule();

        try {
            RunnerAndConfigurationSettings settings = MOERunConfiguration.createRunConfiguration(project, module);

            runManager.addConfiguration(settings);
            runManager.setSelectedConfiguration(settings);
        }
        catch (Exception e) {
            MOEToolWindow.getInstance(project).log("Failed create run configuration: " + e.getMessage());
        }
    }
}
