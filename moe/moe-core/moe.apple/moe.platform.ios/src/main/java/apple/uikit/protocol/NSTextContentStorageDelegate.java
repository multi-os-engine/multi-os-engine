package apple.uikit.protocol;

import apple.foundation.struct.NSRange;
import apple.uikit.NSTextContentStorage;
import apple.uikit.NSTextParagraph;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextContentStorageDelegate")
public interface NSTextContentStorageDelegate extends NSTextContentManagerDelegate {
    /**
     * Returns a custom NSTextParagraph for range in NSTextContentStorage.attributedString. When non-nil,
     * textContentStorage uses the text paragraph instead of creating the standard NSTextParagraph with the attributed
     * substring in range. The attributed string for a custom text paragraph must have range.length.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("textContentStorage:textParagraphWithRange:")
    default NSTextParagraph textContentStorageTextParagraphWithRange(@NotNull NSTextContentStorage textContentStorage,
            @ByValue NSRange range) {
        throw new java.lang.UnsupportedOperationException();
    }
}
