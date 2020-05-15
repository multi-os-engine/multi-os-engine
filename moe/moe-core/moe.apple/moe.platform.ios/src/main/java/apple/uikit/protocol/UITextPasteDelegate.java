package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.uikit.UITextRange;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextPasteDelegate")
public interface UITextPasteDelegate {
    @Generated
    @IsOptional
    @Selector("textPasteConfigurationSupporting:combineItemAttributedStrings:forRange:")
    default NSAttributedString textPasteConfigurationSupportingCombineItemAttributedStringsForRange(
            @Mapped(ObjCObjectMapper.class) UITextPasteConfigurationSupporting textPasteConfigurationSupporting,
            NSArray<? extends NSAttributedString> itemStrings, UITextRange textRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textPasteConfigurationSupporting:performPasteOfAttributedString:toRange:")
    default UITextRange textPasteConfigurationSupportingPerformPasteOfAttributedStringToRange(
            @Mapped(ObjCObjectMapper.class) UITextPasteConfigurationSupporting textPasteConfigurationSupporting,
            NSAttributedString attributedString, UITextRange textRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textPasteConfigurationSupporting:shouldAnimatePasteOfAttributedString:toRange:")
    default boolean textPasteConfigurationSupportingShouldAnimatePasteOfAttributedStringToRange(
            @Mapped(ObjCObjectMapper.class) UITextPasteConfigurationSupporting textPasteConfigurationSupporting,
            NSAttributedString attributedString, UITextRange textRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textPasteConfigurationSupporting:transformPasteItem:")
    default void textPasteConfigurationSupportingTransformPasteItem(
            @Mapped(ObjCObjectMapper.class) UITextPasteConfigurationSupporting textPasteConfigurationSupporting,
            @Mapped(ObjCObjectMapper.class) UITextPasteItem item) {
        throw new java.lang.UnsupportedOperationException();
    }
}