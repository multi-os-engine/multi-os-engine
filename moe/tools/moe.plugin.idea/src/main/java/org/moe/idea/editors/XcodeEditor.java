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

package org.moe.idea.editors;

import com.intellij.codeHighlighting.BackgroundEditorHighlighter;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.CommandProcessor;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.FileEditorLocation;
import com.intellij.openapi.fileEditor.FileEditorState;
import com.intellij.openapi.fileEditor.FileEditorStateLevel;
import com.intellij.openapi.fileEditor.impl.text.TextEditorProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.document.pbxproj.ProjectException;
import org.moe.editors.DocumentChangeListener;
import org.moe.editors.EditorUtil;
import org.moe.editors.InfoPlistManager;
import org.moe.editors.XcodeEditorManager;
import org.moe.idea.ui.XcodeEditorForm;
import org.moe.idea.utils.logger.LoggerFactory;

import java.beans.PropertyChangeListener;
import java.io.File;

import javax.swing.JComponent;

public class XcodeEditor implements VirtualFileListener, FileEditor {

    private static final Logger LOG = LoggerFactory.getLogger(XcodeEditor.class);

    private  Project project;
    private XcodeEditorForm editorForm;
    private XcodeEditorManager xcodeEditorManager;
    private InfoPlistManager mainInfoPlistManager;
    private InfoPlistManager testInfoPlistManager;
    private com.intellij.openapi.editor.Document xcodeProjectDocument;
    private com.intellij.openapi.editor.Document mainInfoPlistDocument;
    private com.intellij.openapi.editor.Document testInfoPlistDocument;
    private String projectName;
    private FileDocumentManager fileDocumentManager;

    public XcodeEditor(Project project, VirtualFile virtualFile) {
        this.project = project;
        this.editorForm = new XcodeEditorForm();
        initManagers(virtualFile);
        editorForm.setXcodeEditorManager(xcodeEditorManager);
        editorForm.setMainInfoPlistManager(mainInfoPlistManager);
        editorForm.setTestInfoPlistManager(testInfoPlistManager);
        editorForm.init();
    }

    @NotNull
    @Override
    public JComponent getComponent() {
        return editorForm.getComponent();
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return editorForm.getComponent();
    }

    @NotNull
    @Override
    public String getName() {
        return "Xcode Editor";
    }

    @NotNull
    @Override
    public FileEditorState getState(@NotNull FileEditorStateLevel fileEditorStateLevel) {
        return FileEditorState.INSTANCE;
    }

    @Override
    public void setState(@NotNull FileEditorState fileEditorState) {

    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void selectNotify() {

    }

    @Override
    public void deselectNotify() {

    }

    @Override
    public void addPropertyChangeListener(@NotNull PropertyChangeListener propertyChangeListener) {

    }

    @Override
    public void removePropertyChangeListener(@NotNull PropertyChangeListener propertyChangeListener) {

    }

    @Nullable
    @Override
    public BackgroundEditorHighlighter getBackgroundHighlighter() {
        return null;
    }

    @Nullable
    @Override
    public FileEditorLocation getCurrentLocation() {
        return null;
    }

    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder() {
        return null;
    }

    @Override
    public void dispose() {
        TextEditorProvider.getInstance().disposeEditor(this);
    }

    @Nullable
    @Override
    public <T> T getUserData(@NotNull Key<T> key) {
        return null;
    }

    @Override
    public <T> void putUserData(@NotNull Key<T> key, @Nullable T t) {

    }

    private void initManagers(VirtualFile virtualFile) {
        this.fileDocumentManager = FileDocumentManager.getInstance();
        this.xcodeProjectDocument = fileDocumentManager.getDocument(virtualFile);
        xcodeProjectDocument.addDocumentListener(new com.intellij.openapi.editor.event.DocumentListener() {
            @Override
            public void beforeDocumentChange(com.intellij.openapi.editor.event.DocumentEvent documentEvent) {

            }

            @Override
            public void documentChanged(com.intellij.openapi.editor.event.DocumentEvent documentEvent) {
                reloadXcodeProjectFile();
            }
        });

        try {
            this.xcodeEditorManager = new XcodeEditorManager(null, xcodeProjectDocument.getText());
        } catch (ProjectException e) {
            e.printStackTrace();
        }

        xcodeEditorManager.setListener(new DocumentChangeListener() {
            @Override
            public void documentChanged() {
                saveXcodeDocument();
            }
        });

        this.projectName = EditorUtil.getXcodeProjectName(new File(virtualFile.getPath()));
        xcodeEditorManager.setProjectName(projectName);

        String root = virtualFile.getParent().getParent().getPath();
        File mainInfoPlist = getFileFromXcodeConfiguration(root, xcodeEditorManager.getInfoMainPlist());

        VirtualFile mainInfoVirtualFile = project.getBaseDir().getFileSystem().findFileByPath(mainInfoPlist.getAbsolutePath());
        this.mainInfoPlistDocument = fileDocumentManager.getDocument(mainInfoVirtualFile);
        try {
            this.mainInfoPlistManager = new InfoPlistManager(mainInfoPlistDocument.getText());
        } catch (Exception e) {
            LOG.error("Unable read main Info.plist", e);
        }

        mainInfoPlistManager.setListener(new DocumentChangeListener() {
            @Override
            public void documentChanged() {
                saveMainInfoPlistDocument();
            }
        });

        mainInfoPlistDocument.addDocumentListener(new com.intellij.openapi.editor.event.DocumentListener() {
            @Override
            public void beforeDocumentChange(com.intellij.openapi.editor.event.DocumentEvent documentEvent) {

            }

            @Override
            public void documentChanged(com.intellij.openapi.editor.event.DocumentEvent documentEvent) {
                reloadMainInfoPlist();
            }
        });
        if (xcodeEditorManager.hasTestTarget()) {
            File testInfoPlist = getFileFromXcodeConfiguration(root, xcodeEditorManager.getInfoTestPlist());

            VirtualFile testInfoVirtualFile = LocalFileSystem.getInstance().findFileByIoFile(testInfoPlist);
            this.testInfoPlistDocument = fileDocumentManager.getDocument(testInfoVirtualFile);
            try {
                this.testInfoPlistManager = new InfoPlistManager(testInfoPlistDocument.getText());
            } catch (Exception e) {
                LOG.error("Unable read test Info.plist", e);
            }

            testInfoPlistManager.setListener(new DocumentChangeListener() {
                @Override
                public void documentChanged() {
                    saveTestInfoPlistDocument();
                }
            });

            testInfoPlistDocument.addDocumentListener(new com.intellij.openapi.editor.event.DocumentListener() {
                @Override
                public void beforeDocumentChange(com.intellij.openapi.editor.event.DocumentEvent documentEvent) {

                }

                @Override
                public void documentChanged(com.intellij.openapi.editor.event.DocumentEvent documentEvent) {
                    reloadTestInfoPlist();
                }
            });
        }else {
            LOG.error("No test target provided. Consider to provide one. It needs \"-Test\" at the end of its name.");
        }
    }

    @NotNull
    private File getFileFromXcodeConfiguration(String srcroot, String path) {
        path = path.replaceAll("/", "\\" + File.separator);
        path = path.replaceAll("\\$\\(SRCROOT\\)", srcroot);
        final File file = new File(path);
        if (file.isAbsolute()) {
            return file;
        }
        return new File(srcroot, path);
    }

    private void saveXcodeDocument() {
        CommandProcessor.getInstance().executeCommand(project, new Runnable() {
            @Override
            public void run() {
                ApplicationManager.getApplication().runWriteAction(new Runnable() {
                    @Override
                    public void run() {
                        xcodeProjectDocument.replaceString(0, xcodeProjectDocument.getTextLength(), xcodeEditorManager.getSourceToText());
                        fileDocumentManager.saveDocument(xcodeProjectDocument);
                    }
                });
            }
        }, "XcodeEditor Save", new Object());
    }

    private void saveMainInfoPlistDocument() {
        CommandProcessor.getInstance().executeCommand(project, new Runnable() {
            @Override
            public void run() {
                ApplicationManager.getApplication().runWriteAction(new Runnable() {
                    @Override
                    public void run() {
                        mainInfoPlistDocument.replaceString(0, mainInfoPlistDocument.getTextLength(), mainInfoPlistManager.getValueToString());
                        fileDocumentManager.saveDocument(mainInfoPlistDocument);
                    }
                });
            }
        }, "Main Info.plist Save", new Object());
    }

    private void saveTestInfoPlistDocument() {
        CommandProcessor.getInstance().executeCommand(project, new Runnable() {
            @Override
            public void run() {
                ApplicationManager.getApplication().runWriteAction(new Runnable() {
                    @Override
                    public void run() {
                        testInfoPlistDocument.replaceString(0, testInfoPlistDocument.getTextLength(), testInfoPlistManager.getValueToString());
                        fileDocumentManager.saveDocument(testInfoPlistDocument);
                    }
                });
            }
        }, "Test Info.plist Save", new Object());
    }

    private void reloadXcodeProjectFile() {
        try {
            String prevContent = xcodeEditorManager.getSourceToText();
            String newConent = xcodeProjectDocument.getText();
            if (!prevContent.equals(newConent)) {
                LOG.debug("xcode.pbxproj file changed, reload");
                xcodeEditorManager.load(newConent);
                xcodeEditorManager.setProjectName(projectName);
                editorForm.setXcodeEditorManager(xcodeEditorManager);
                editorForm.refresh();
            }
        } catch (Exception e) {
            LOG.error("Unable load .pbxproj file", e);
        }
    }

    private void reloadMainInfoPlist() {
        try {
            String prevContent = mainInfoPlistManager.getValueToString();
            String newConent = mainInfoPlistDocument.getText();
            if (!prevContent.equals(newConent)) {
                System.out.println("Main info.plist file changed, reload");
                mainInfoPlistManager.load(newConent);
                editorForm.setMainInfoPlistManager(mainInfoPlistManager);
                editorForm.refresh();
            }
        } catch (Exception e) {
            LOG.error("Unable load main info.plist file", e);
        }
    }

    private void reloadTestInfoPlist() {
        try {
            String prevContent = testInfoPlistManager.getValueToString();
            String newConent = testInfoPlistDocument.getText();
            if (!prevContent.equals(newConent)) {
                LOG.debug("Test info.plist file changed, reload");
                testInfoPlistManager.load(newConent);
                editorForm.setTestInfoPlistManager(testInfoPlistManager);
                editorForm.refresh();
            }
        } catch (Exception e) {
            LOG.error("Unable load test info.plist file", e);
        }
    }
}
