package apple.accessibility.protocol;

import apple.accessibility.AXBrailleMap;
import apple.coregraphics.struct.CGRect;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

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
     */
    @Generated
    @Selector("accessibilityBrailleMapRenderRegion")
    @ByValue
    CGRect accessibilityBrailleMapRenderRegion();

    /**
     * This handler is called to ask the element to update the values of the braille map on-demand.
     */
    @Generated
    @Selector("accessibilityBrailleMapRenderer")
    @ObjCBlock(name = "call_accessibilityBrailleMapRenderer_ret")
    Block_accessibilityBrailleMapRenderer_ret accessibilityBrailleMapRenderer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accessibilityBrailleMapRenderer_ret {
        @Generated
        void call_accessibilityBrailleMapRenderer_ret(AXBrailleMap arg0);
    }

    /**
     * If the element displays a region that should be rendered into the braille map automatically,
     * specify it here (relative to the bounds of the object). VoiceOver will snapshot that region of the element
     * and convert to a braille map internally.
     */
    @Generated
    @Selector("setAccessibilityBrailleMapRenderRegion:")
    void setAccessibilityBrailleMapRenderRegion(@ByValue CGRect value);

    /**
     * This handler is called to ask the element to update the values of the braille map on-demand.
     */
    @Generated
    @Selector("setAccessibilityBrailleMapRenderer:")
    void setAccessibilityBrailleMapRenderer(
            @ObjCBlock(name = "call_setAccessibilityBrailleMapRenderer") Block_setAccessibilityBrailleMapRenderer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAccessibilityBrailleMapRenderer {
        @Generated
        void call_setAccessibilityBrailleMapRenderer(AXBrailleMap arg0);
    }
}
