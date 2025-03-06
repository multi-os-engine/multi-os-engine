package apple.browserenginekit.protocol;

import apple.uikit.protocol.UIResponderStandardEditActions;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BEResponderEditActions")
public interface BEResponderEditActions extends UIResponderStandardEditActions {
    /**
     * Adds a text replacement shortcut to the keyboard dictionary.
     * See corresponding shortcut methods in BETextInteraction.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("addShortcut:")
    default void addShortcut(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Performs a find for the selected content
     * See find related methods in UIResponderStandardEditActions
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("findSelected:")
    default void findSelected(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Presents a dictionary definition for the selected content.
     * See corresponding dictionary methods in BETextInteraction.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("lookup:")
    default void lookup(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Shows the replacements for the selected content.
     * See corresponding replacement methods in BETextInteraction.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("promptForReplace:")
    default void promptForReplace(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Inserts the selected replacement for the selected content.
     * See corresponding replacement methods in BETextInputDelegate
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("replace:")
    default void replace(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Shares the selected content.
     * See corresponding share methods in BETextInteraction.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("share:")
    default void share(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Presents a translation view for the selected content.
     * See corresponding translation methods in BETextInteraction.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("translate:")
    default void translate(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Converts the selected content between traditional and simplified Chinese
     * See corresponding transliteration methods in BETextInteraction.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("transliterateChinese:")
    default void transliterateChinese(@Mapped(ObjCObjectMapper.class) @Nullable Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }
}