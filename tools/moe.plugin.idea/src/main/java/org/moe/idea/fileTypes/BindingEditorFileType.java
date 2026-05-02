package org.moe.idea.fileTypes;

import com.intellij.json.JsonFileType;
import org.jetbrains.annotations.NotNull;

public final class BindingEditorFileType extends JsonFileType {

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
