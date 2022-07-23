package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * These should be used in conjunction with the "Preserve vector data" checkbox for an asset catalog asset, to allow
 * smooth scaling of symbolic glyphs.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAccessibilityContentSizeCategoryImageAdjusting")
public interface UIAccessibilityContentSizeCategoryImageAdjusting {
    /**
     * When this is equal to YES, the receiver's intrinsic size will increase for users who prefer an accessibility
     * content size category.
     */
    @Generated
    @Selector("adjustsImageSizeForAccessibilityContentSizeCategory")
    boolean adjustsImageSizeForAccessibilityContentSizeCategory();

    /**
     * When this is equal to YES, the receiver's intrinsic size will increase for users who prefer an accessibility
     * content size category.
     */
    @Generated
    @Selector("setAdjustsImageSizeForAccessibilityContentSizeCategory:")
    void setAdjustsImageSizeForAccessibilityContentSizeCategory(boolean value);
}