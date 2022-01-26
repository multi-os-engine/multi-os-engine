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

package org.moe.idea.utils;

import com.intellij.execution.RunManager;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.impl.RunManagerImpl;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.DumbAwareRunnable;
import com.intellij.openapi.project.ModuleListener;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.DependencyScope;
import com.intellij.openapi.roots.LibraryOrderEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.roots.libraries.Library;
import com.intellij.openapi.roots.libraries.LibraryTable;
import com.intellij.openapi.vfs.JarFileSystem;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.util.Function;
import org.jetbrains.annotations.NotNull;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.runconfig.configuration.MOERunConfigurationType;
import org.moe.idea.sdk.MOESdkType;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ModuleObserver implements ModuleListener {

    private static final Logger LOG = LoggerFactory.getLogger(ModuleObserver.class);

    static final String MOE_JARS_PATH = "sdk";
    static final List<String> MOE_JARS = Arrays.asList("moe-core.jar", "moe-ios.jar", "moe-ios-junit.jar");

    @Override
    public void moduleAdded(@NotNull final Project project, @NotNull final Module module) {
        ModuleUtils.runWhenInitialized(project, new DumbAwareRunnable() {
            @Override
            public void run() {
                if (MOESdkPlugin.isValidMoeModule(module)) {
                    checkRunConfiguration(project, module);
                    checkMoeSDK(module);
                }
            }
        });
    }

    public static void checkMoeSDK(@NotNull Module module) {
        final ModuleRootManager manager = ModuleRootManager.getInstance(module);
        final ModifiableRootModel rootModel = manager.getModifiableModel();
        ApplicationManager.getApplication().runWriteAction(new DumbAwareRunnable() {
            @Override
            public void run() {
                Sdk sdk = MOESdkType.getMOESdk(rootModel.getModule());
                if (sdk != null) {
                    rootModel.setSdk(sdk);
                    rootModel.commit();
                }
            }
        });
    }

    @Override
    public void beforeModuleRemoved(@NotNull Project project, @NotNull Module module) {

    }

    @Override
    public void moduleRemoved(@NotNull Project project, @NotNull Module module) {
        // Find run config for the module
        RunManager runManager = RunManager.getInstance(project);
        for (RunnerAndConfigurationSettings r : runManager.getConfigurationSettingsList(MOERunConfigurationType.getInstance())) {
            if (module.getName().equals(r.getName())) {
                LOG.debug("Remove run configuration " + r.getName());
                ((RunManagerImpl) runManager).removeConfiguration(r);
                return;
            };
        }
    }

    @Override
    public void modulesRenamed(@NotNull Project project, @NotNull List<Module> list, @NotNull Function<Module, String> function) {

    }

    public static void checkRunConfiguration(@NotNull Project project, @NotNull Module module) {
        LOG.debug("Check run configuration for the module " + module.getName()
                + " in the project " + project.getName());
        // Find run config for the module
        final RunManagerImpl runManager = (RunManagerImpl) RunManager.getInstance(project);
        for (RunConfiguration runConfig : runManager.getConfigurationsList(MOERunConfigurationType.getInstance())) {
            final MOERunConfiguration moeRunConfig = (MOERunConfiguration) runConfig;
            moeRunConfig.moduleName(moeRunConfig.moduleName());// Set module in the config
            if (module.getName().equals(moeRunConfig.module().getName())) {
                return;
            };
        }
        // Create MOE run config
        RunnerAndConfigurationSettings settings = null;
        try {
            LOG.debug("Create run configuration " + module.getName());
            settings = MOERunConfiguration.createRunConfiguration(project, module);
            runManager.addConfiguration(settings);
            runManager.setSelectedConfiguration(settings);
        } catch (Exception ee) {
            LOG.error("Unable to create run configuration", ee);
        }
    }

    private void checkMavenDependencies(@NotNull Module module) {
        if (!MOESdkPlugin.isMoeJarsInModule(module)) {
            addMOEDependencies(module);
        } else {
            checkMOEDependencies(module);
            checkRunConfiguration(module.getProject(), module);
        }
    }

    private void addMOEDependencies(@NotNull final Module module) {
        final String home = MOESdkPlugin.getSdkRootPath(module);
        if (home == null || home.isEmpty()) {
            LOG.debug("Unable to find MOE home");
            return;
        }

        ApplicationManager.getApplication().runWriteAction(new DumbAwareRunnable() {
            @Override
            public void run() {
                for (String jar : MOE_JARS) {
                    String jarPath = home + File.separator + MOE_JARS_PATH + File.separator + jar;
                    VirtualFile file = LocalFileSystem.getInstance().findFileByPath(jarPath);
                    if (file == null) {
                        return;
                    }
                    final ModuleRootManager manager = ModuleRootManager.getInstance(module);
                    final ModifiableRootModel rootModel = manager.getModifiableModel();
                    final Library jarLibrary = rootModel.getModuleLibraryTable().createLibrary();
                    final Library.ModifiableModel libraryModel = jarLibrary.getModifiableModel();
                    libraryModel.setName("Maven: " + jar);
                    String url = VirtualFileManager.constructUrl(JarFileSystem.PROTOCOL, jarPath) + JarFileSystem.JAR_SEPARATOR;
                    libraryModel.addRoot(url, OrderRootType.CLASSES);
                    libraryModel.commit();

                    final LibraryOrderEntry orderEntry = rootModel.findLibraryOrderEntry(jarLibrary);
                    orderEntry.setScope(DependencyScope.COMPILE);

                    rootModel.commit();
                }

                checkRunConfiguration(module.getProject(), module);
            }
        });
    }

    private void checkMOEDependencies(@NotNull final Module module) {
        final String home = MOESdkPlugin.getSdkRootPath(module);
        if (home == null || home.isEmpty()) {
            LOG.debug("Unable to find MOE home");
            return;
        }
        ModuleRootManager manager = ModuleRootManager.getInstance(module);
        final ModifiableRootModel rootModel = manager.getModifiableModel();
        final LibraryTable libraryTable = rootModel.getModuleLibraryTable();
        ApplicationManager.getApplication().runWriteAction(new DumbAwareRunnable() {
            @Override
            public void run() {
                for (String jar : MOE_JARS) {
                    Library library = libraryTable.getLibraryByName("Maven: " + jar);
                    if (library != null) {
                        String jarPath = home + File.separator + MOE_JARS_PATH + File.separator + jar;
                        String[] urls = library.getUrls(OrderRootType.CLASSES);
                        if (urls.length > 0) {
                            String url = urls[0];
                            String newUrl = VirtualFileManager.constructUrl(JarFileSystem.PROTOCOL, jarPath) + JarFileSystem.JAR_SEPARATOR;
                            if (!url.equals(newUrl)) {
                                final Library.ModifiableModel libraryModel = library.getModifiableModel();
                                libraryModel.removeRoot(url, OrderRootType.CLASSES);
                                libraryModel.addRoot(newUrl, OrderRootType.CLASSES);
                                libraryModel.commit();
                            }
                        }
                    }
                }
                rootModel.commit();
            }
        });
    }

}
