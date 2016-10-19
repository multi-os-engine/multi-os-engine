package org.moe.idea.fileTypes;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.intellij.openapi.fileTypes.UserFileType;
import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;

public class MOEFileTypeFactory extends FileTypeFactory {

    private static final UserFileType xcodeEditorFileType;

    static {
        xcodeEditorFileType = new XcodeEditorFileType();
        xcodeEditorFileType.setName("Xcode project");
        xcodeEditorFileType.setDescription("Xcode project file");
    }

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(xcodeEditorFileType, "pbxproj");
    }

    public static final class XcodeEditorFileType extends UserFileType<XcodeEditorFileType> {

        @Override
        public SettingsEditor<XcodeEditorFileType> getEditor() {
            return null;
        }

        @Override
        public boolean isBinary() {
            return false;
        }
    }
}
