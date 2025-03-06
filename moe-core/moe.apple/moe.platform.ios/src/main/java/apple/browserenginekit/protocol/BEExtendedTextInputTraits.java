package apple.browserenginekit.protocol;

import apple.uikit.UIColor;
import apple.uikit.protocol.UITextInputTraits;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BEExtendedTextInputTraits")
public interface BEExtendedTextInputTraits extends UITextInputTraits {
    /**
     * Customizes the color of the text cursor at the insertion point
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("insertionPointColor")
    @Nullable
    default UIColor insertionPointColor() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Represents whether the active web input field is a single line document
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("isSingleLineDocument")
    default boolean isSingleLineDocument() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Disables the learning of new words and corrections and prevents their addition into the keyboard lexicon
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("isTypingAdaptationEnabled")
    default boolean isTypingAdaptationEnabled() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Customizes the color of the selection handles
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("selectionHandleColor")
    @Nullable
    default UIColor selectionHandleColor() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Customizes the color of the selection highlight rect
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("selectionHighlightColor")
    @Nullable
    default UIColor selectionHighlightColor() {
        throw new java.lang.UnsupportedOperationException();
    }
}