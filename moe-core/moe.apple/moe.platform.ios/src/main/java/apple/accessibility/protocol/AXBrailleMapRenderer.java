package apple.accessibility.protocol;

import apple.accessibility.AXBrailleMap;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.ann.IsOptional;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;

/**
 * Implement one of the following methods in order to provide data for a braille map to be rendered.
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AXBrailleMapRenderer")
public interface AXBrailleMapRenderer {
    /**
     * If the element displays a region that should be rendered into the braille map automatically,
     * specify it here (relative to the bounds of the object). VoiceOver will snapshot that region of the element
     * and convert to a braille map internally.
     * 
     * API-Since: 15.2
     */
    @IsOptional
    @Generated
    @Selector("accessibilityBrailleMapRenderRegion")
    @ByValue
    default CGRect accessibilityBrailleMapRenderRegion() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This handler is called to ask the element to update the values of the braille map on-demand.
     * 
     * API-Since: 15.2
     */
    @NotNull
    @IsOptional
    @Generated
    @Selector("accessibilityBrailleMapRenderer")
    @ObjCBlock(name = "call_accessibilityBrailleMapRenderer_ret")
    default Block_accessibilityBrailleMapRenderer_ret accessibilityBrailleMapRenderer() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accessibilityBrailleMapRenderer_ret {
        @Generated
        void call_accessibilityBrailleMapRenderer_ret(@NotNull AXBrailleMap arg0);
    }

    /**
     * If the element displays a region that should be rendered into the braille map automatically,
     * specify it here (relative to the bounds of the object). VoiceOver will snapshot that region of the element
     * and convert to a braille map internally.
     * 
     * API-Since: 15.2
     */
    @IsOptional
    @Generated
    @Selector("setAccessibilityBrailleMapRenderRegion:")
    default void setAccessibilityBrailleMapRenderRegion(@ByValue CGRect value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This handler is called to ask the element to update the values of the braille map on-demand.
     * 
     * API-Since: 15.2
     */
    @IsOptional
    @Generated
    @Selector("setAccessibilityBrailleMapRenderer:")
    default void setAccessibilityBrailleMapRenderer(
            @NotNull @ObjCBlock(name = "call_setAccessibilityBrailleMapRenderer") Block_setAccessibilityBrailleMapRenderer value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAccessibilityBrailleMapRenderer {
        @Generated
        void call_setAccessibilityBrailleMapRenderer(@NotNull AXBrailleMap arg0);
    }
}
