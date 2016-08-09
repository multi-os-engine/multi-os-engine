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

package org.moe.idea.utils;

import org.moe.document.pbxproj.ProjFile;
import org.moe.xcode.XCodeProjectFileManager;
import org.moe.idea.MOESdkPlugin;
import org.moe.common.constants.MOEManifestConstants.LINKER_FLAGS;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.ModuleAdapter;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.*;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;


public class XCodeProjectSyncListener extends ModuleAdapter implements BulkFileListener {

    private final Project project;

    public XCodeProjectSyncListener(Project project) {
        this.project = project;
    }

    @Override
    public void before(@NotNull List<? extends VFileEvent> list) {

    }

    @Override
    public void after(@NotNull List<? extends VFileEvent> list) {
        VFileEvent fileEvent;

        for (VFileEvent aList : list) {
            fileEvent = aList;

            if (fileEvent instanceof VFileDeleteEvent) {
                VirtualFile virtualFile = fileEvent.getFile();

                if (virtualFile == null) {
                    return;
                }

                Module module = MOESdkPlugin.findModuleForFile(project, virtualFile);

                if (MOESdkPlugin.isValidMoeModule(module)) {
                    fileAction(module, new File(virtualFile.getPath()), FileEventType.Delete);
                }
            } else if (fileEvent instanceof VFileCreateEvent) {
                VirtualFile virtualFile = fileEvent.getFile();

                if (virtualFile == null) {
                    return;
                }

                Module module = MOESdkPlugin.findModuleForFile(project, virtualFile);

                if (MOESdkPlugin.isValidMoeModule(module)) {
                    fileAction(module, new File(virtualFile.getPath()), FileEventType.Create);
                }
            } else if (fileEvent instanceof VFileCopyEvent) {
                VirtualFile virtualFile = ((VFileCopyEvent) fileEvent).getNewParent().findChild(((VFileCopyEvent) fileEvent).getNewChildName());

                if (virtualFile == null) {
                    return;
                }

                Module module = MOESdkPlugin.findModuleForFile(project, virtualFile);

                if (MOESdkPlugin.isValidMoeModule(module)) {
                    fileAction(module, new File(virtualFile.getPath()), FileEventType.Copy);
                }
            } else if (fileEvent instanceof VFilePropertyChangeEvent) {
                VFilePropertyChangeEvent eventChanged = (VFilePropertyChangeEvent) fileEvent;

                VirtualFile virtualFile = fileEvent.getFile();

                if (virtualFile == null) {
                    return;
                }

                Module module = MOESdkPlugin.findModuleForFile(project, virtualFile);

                if (MOESdkPlugin.isValidMoeModule(module)) {
                    fileAction(module, new File(eventChanged.getOldPath()), FileEventType.Delete);
                    fileAction(module, new File(virtualFile.getPath()), FileEventType.Create);
                }
            } else if (fileEvent instanceof VFileContentChangeEvent) {
                VirtualFile virtualFile = fileEvent.getFile();

                if ((virtualFile == null) || (virtualFile.getExtension() == null) || !virtualFile.getExtension().equals("gradle")) {
                    return;
                }

                Module module = MOESdkPlugin.findModuleForFile(project, virtualFile);

                if (MOESdkPlugin.isValidMoeModule(module)) {
                    ModuleUtils.updateXcodeProjectPath(module);
                    ModuleUtils.updateProductName(module);
                }
            }
        }
    }

    private String getFileToModuleRelativePath(String modulePath, String filePath) {
        return new File(modulePath).toURI().relativize(new File(filePath).toURI()).getPath();
    }

    private void fileAction(Module module, File file, FileEventType eventType) {
        if (module == null) {
            return;
        }

        File xcodeProjectFile = MOESdkPlugin.getXcodeProjectFile(module);
        if ((xcodeProjectFile == null) || !xcodeProjectFile.exists()) {
            return;
        }

        ProjFile xcodeProject;

        try {
            xcodeProject = new ProjFile(xcodeProjectFile);
        } catch (Exception e) {
            return;
        }

        String modulePath = ModuleUtils.getModulePath(module);

        XCodeProjectFileManager fileManager = new XCodeProjectFileManager(xcodeProject);

        XCodeProjectFileManager.FileType fileType;

        String relativeFilePath;

        if (isInResourcePath(file.getPath())) {
            fileType = XCodeProjectFileManager.FileType.Resource;
            relativeFilePath = ".." + File.separator + getFileToModuleRelativePath(modulePath, file.getPath());
        } else if (isNativeSourceFile(file.getPath())) {
            String xcodeProjectPath = modulePath + File.separator + "xcode" + File.separator + module.getName();

            fileType = XCodeProjectFileManager.FileType.Sources;
            relativeFilePath = getFileToModuleRelativePath(xcodeProjectPath, file.getPath());

        } else if (isLibFolderFile(module, file)) {
            updateCustomXcconfig(module, xcodeProjectFile);
            return;
        } else {
            return;
        }

        if (eventType == FileEventType.Copy || eventType == FileEventType.Create) {
            if (!relativeFilePath.startsWith("Generated")) {
                if (!fileManager.addFile(relativeFilePath, fileType)) {
                    return;
                }
            }
        } else if (eventType == FileEventType.Delete) {
            if (!fileManager.removeFile(relativeFilePath)) {
                return;
            }
        } else {
            return;
        }

        project.save();
    }

    private boolean isLibFolderFile(Module module, File file) {
        File libFolder = new File(ModuleUtils.getModulePath(module), "lib");
        return libFolder.getPath().equals(file.getParentFile().getPath()) || libFolder.getPath().equals(file.getPath());
    }

    private void updateCustomXcconfig(Module module, File xcodeProject) {
        try {
            File libFolder = new File(ModuleUtils.getModulePath(module), "lib");
            if (libFolder.exists()) {

                Set<String> linkedKeys = new HashSet<String>();
                File[] listFiles = libFolder.listFiles();
                if (listFiles != null) {
                    for (File dependencyFile : listFiles) {
                        if (dependencyFile.getName().endsWith(".jar")) {
                            JarFile jarFile = new JarFile(dependencyFile);
                            Manifest manifest = jarFile.getManifest();

                            //add custom linked flags
                            String customLDFlags = getManifestAttribute(manifest, LINKER_FLAGS.MOE_CUSTOM_LINKER_FLAGS.name());
                            if (customLDFlags != null && !customLDFlags.isEmpty()) {
                                String[] flagArray = customLDFlags.split(";");

                                linkedKeys.addAll(Arrays.asList(flagArray));
                            }

                            String customFrameworks = getManifestAttribute(manifest, LINKER_FLAGS.MOE_FRAMEWORKS.name());
                            if (customFrameworks != null && !customFrameworks.isEmpty()) {
                                String[] flagArray = customFrameworks.split(";");

                                linkedKeys.addAll(Arrays.asList(flagArray));
                            }
                        }
                    }
                }
                //update custom.xcconfig !!!do not remove - for new build system!!!
                File customXcConfig = getCustomXcConfig(xcodeProject);
                PrintWriter customXcConfigWriter = new PrintWriter(customXcConfig);
                StringBuilder ldFlagContent = new StringBuilder();
                for (String key : linkedKeys) {
                    ldFlagContent.append(key.replace(";", "").trim()).append(" ");
                }
                customXcConfigWriter.println(String.format("%s = %s", LINKER_FLAGS.MOE_CUSTOM_LINKER_FLAGS.name(), ldFlagContent.toString()));
                customXcConfigWriter.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private String getManifestAttribute(Manifest manifest, String attribute) {
        Attributes attributes = manifest.getMainAttributes();
        return attributes.getValue(attribute);
    }

    private File getCustomXcConfig(File xcodeProject) throws IOException {

        String xcodeFileName = xcodeProject.getName();
        int extIdx = xcodeFileName.lastIndexOf(".");
        if (extIdx >= 0) {
            xcodeFileName = xcodeFileName.substring(0, extIdx);
        }

        File xcodeProjectDir = new File(xcodeProject.getParentFile(), xcodeFileName);
        File result = new File(xcodeProjectDir, "custom.xcconfig");
        if (!result.exists()) {
            result.createNewFile();
        }
        return result;
    }

    private boolean isInResourcePath(String fileName) {
        String separator = File.separator;

        return (fileName.contains(separator + "resources" + separator) || fileName.contains(separator + "res" + separator));
    }

    private boolean isNativeSourceFile(String fileName) {
        String[] extensions = {".cpp", ".c", ".m", ".mm", ".h", ".hpp"};

        for (String ext : extensions) {
            if (fileName.toLowerCase().endsWith(ext)) {
                return true;
            }
        }

        return false;
    }

    private enum FileEventType {
        Create,
        Copy,
        Delete,
    }
}
