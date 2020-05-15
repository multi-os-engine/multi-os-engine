package apple.uikit.protocol;

import apple.uikit.UIPointerInteraction;
import apple.uikit.UIPointerRegion;
import apple.uikit.UIPointerRegionRequest;
import apple.uikit.UIPointerStyle;
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
@ObjCProtocolName("UIPointerInteractionDelegate")
public interface UIPointerInteractionDelegate {
    @Generated
    @IsOptional
    @Selector("pointerInteraction:regionForRequest:defaultRegion:")
    default UIPointerRegion pointerInteractionRegionForRequestDefaultRegion(UIPointerInteraction interaction,
            UIPointerRegionRequest request, UIPointerRegion defaultRegion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pointerInteraction:styleForRegion:")
    default UIPointerStyle pointerInteractionStyleForRegion(UIPointerInteraction interaction, UIPointerRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pointerInteraction:willEnterRegion:animator:")
    default void pointerInteractionWillEnterRegionAnimator(UIPointerInteraction interaction, UIPointerRegion region,
            @Mapped(ObjCObjectMapper.class) UIPointerInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pointerInteraction:willExitRegion:animator:")
    default void pointerInteractionWillExitRegionAnimator(UIPointerInteraction interaction, UIPointerRegion region,
            @Mapped(ObjCObjectMapper.class) UIPointerInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}