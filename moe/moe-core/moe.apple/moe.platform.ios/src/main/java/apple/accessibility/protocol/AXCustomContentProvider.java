package apple.accessibility.protocol;

import apple.accessibility.AXCustomContent;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;

/**
 * API-Since: 14.0
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AXCustomContentProvider")
public interface AXCustomContentProvider {
    @Generated
    @Selector("accessibilityCustomContent")
    NSArray<? extends AXCustomContent> accessibilityCustomContent();

    @Generated
    @Selector("setAccessibilityCustomContent:")
    void setAccessibilityCustomContent(NSArray<? extends AXCustomContent> value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("accessibilityCustomContentBlock")
    @ObjCBlock(name = "call_accessibilityCustomContentBlock_ret")
    @Nullable
    default Block_accessibilityCustomContentBlock_ret accessibilityCustomContentBlock() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accessibilityCustomContentBlock_ret {
        @Generated
        @Nullable
        NSArray<? extends AXCustomContent> call_accessibilityCustomContentBlock_ret();
    }

    /**
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("setAccessibilityCustomContentBlock:")
    default void setAccessibilityCustomContentBlock(
            @ObjCBlock(name = "call_setAccessibilityCustomContentBlock") @Nullable Block_setAccessibilityCustomContentBlock value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAccessibilityCustomContentBlock {
        @Generated
        @Nullable
        NSArray<? extends AXCustomContent> call_setAccessibilityCustomContentBlock();
    }
}
