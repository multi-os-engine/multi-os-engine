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
import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.FileEditorLocation;
import com.intellij.openapi.fileEditor.FileEditorState;
import com.intellij.openapi.fileEditor.FileEditorStateLevel;
import com.intellij.openapi.fileEditor.impl.text.TextEditorProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.UserDataHolderBase;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.idea.ui.BindingEditorForm;

import javax.swing.*;
import java.beans.PropertyChangeListener;

public class BindingEditor extends UserDataHolderBase implements FileEditor, DocumentListener {

    @NotNull
    private final VirtualFile myFile;
    @NotNull
    private BindingEditorForm bindingEditorForm;
    private boolean loadOnSelect = true;

    public BindingEditor(@NotNull Project project, @NotNull VirtualFile virtualFile) {
        this.myFile = virtualFile;
        this.bindingEditorForm = new BindingEditorForm(project, virtualFile);
        FileDocumentManager.getInstance().getDocument(myFile).addDocumentListener(this, this);
    }

    @Override
    public void documentChanged(@NotNull DocumentEvent event) {
        // we have some logic in the loading that will try and save some sensible defaults if they are missing,
        // but if we run this all the time, and we are trying to edit the json, and for example
        // we want to delete all the text and replace it with another one, it will keep messing with us,
        // as it will be always loading and always setting defaults when we are just trying to edit some text.
        // So we only call documentChanged() if we are actually visible on the screen
        if (getComponent().isShowing()) {
            bindingEditorForm.documentChanged();
        }
        else {
            loadOnSelect = true;
        }
    }

    @NotNull
    @Override
    public JComponent getComponent() {
        return bindingEditorForm.getComponent();
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return bindingEditorForm.getComponent();
    }

    @NotNull
    @Override
    public String getName() {
        return "Binding Editor";
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
        if (loadOnSelect) {
            loadOnSelect = false;
            bindingEditorForm.loadBindings();
        }
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

    @Override
    public void dispose() {
        TextEditorProvider.getInstance().disposeEditor(this);
    }

    @Override
    public @NotNull VirtualFile getFile() {
        return myFile;
    }
}
