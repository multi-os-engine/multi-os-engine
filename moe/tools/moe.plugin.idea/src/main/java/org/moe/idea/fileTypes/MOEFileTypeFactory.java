package org.moe.idea.fileTypes;

import com.intellij.json.JsonFileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.intellij.openapi.fileTypes.UserFileType;
import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;

public class MOEFileTypeFactory extends FileTypeFactory {

    private static final XcodeEditorFileType xcodeEditorFileType = new XcodeEditorFileType();
    private static final BindingEditorFileType bindingEditorFileType = new BindingEditorFileType();

    static {
        xcodeEditorFileType.setName("Xcode project");
        xcodeEditorFileType.setDescription("Xcode project file");
    }

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(xcodeEditorFileType, "pbxproj");
        fileTypeConsumer.consume(bindingEditorFileType, "nbc");
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

    public static final class BindingEditorFileType extends JsonFileType {

        @NotNull
        @Override
        public String getName() {
            return "NatJ Binding Config";
        }

        @NotNull
        @Override
        public String getDescription() {
            return "NatJ Binding Config File";
        }

        @NotNull
        @Override
        public String getDefaultExtension() {
            return "nbc";
        }
    }
}
