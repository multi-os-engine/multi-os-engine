package apple.uikit.protocol;

import apple.uikit.NSTextContentManager;
import apple.uikit.NSTextElement;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextContentManagerDelegate")
public interface NSTextContentManagerDelegate {
    /**
     * Gives delegate a chance to validate textElement right before block() invocation with
     * -enumerateTextElementsFromLocation:options:usingBlock:. Returning NO indicates textElement to be skipped from the
     * enumeration.
     */
    @Generated
    @IsOptional
    @Selector("textContentManager:shouldEnumerateTextElement:options:")
    default boolean textContentManagerShouldEnumerateTextElementOptions(NSTextContentManager textContentManager,
            NSTextElement textElement, @NUInt long options) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns a custom element for location. When non-nil, textContentManager uses the element instead of creating
     * based on its standard mapping logic.
     */
    @Generated
    @IsOptional
    @Selector("textContentManager:textElementAtLocation:")
    default NSTextElement textContentManagerTextElementAtLocation(NSTextContentManager textContentManager,
            @Mapped(ObjCObjectMapper.class) NSTextLocation location) {
        throw new java.lang.UnsupportedOperationException();
    }
}
