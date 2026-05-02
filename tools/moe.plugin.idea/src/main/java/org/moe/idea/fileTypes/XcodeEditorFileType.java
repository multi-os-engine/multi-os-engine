package org.moe.idea.fileTypes;

import com.intellij.openapi.fileTypes.UserFileType;
import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;

public final class XcodeEditorFileType extends UserFileType<XcodeEditorFileType> {

    public XcodeEditorFileType() {
        setName("Xcode project");
        setDescription("Xcode project file");
    }

    @Override
    public @NotNull SettingsEditor<XcodeEditorFileType> getEditor() {
        return null;
    }

    @Override
    public boolean isBinary() {
        return false;
    }
}
