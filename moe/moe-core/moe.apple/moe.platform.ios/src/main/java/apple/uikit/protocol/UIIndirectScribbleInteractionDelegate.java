package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.uikit.UIIndirectScribbleInteraction;
import apple.uikit.UIResponder;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIIndirectScribbleInteractionDelegate")
public interface UIIndirectScribbleInteractionDelegate {
    @Generated
    @IsOptional
    @Selector("indirectScribbleInteraction:didFinishWritingInElement:")
    default void indirectScribbleInteractionDidFinishWritingInElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("indirectScribbleInteraction:focusElementIfNeeded:referencePoint:completion:")
    void indirectScribbleInteractionFocusElementIfNeededReferencePointCompletion(
            UIIndirectScribbleInteraction interaction, @Mapped(ObjCObjectMapper.class) Object elementIdentifier,
            @ByValue CGPoint focusReferencePoint,
            @ObjCBlock(name = "call_indirectScribbleInteractionFocusElementIfNeededReferencePointCompletion") Block_indirectScribbleInteractionFocusElementIfNeededReferencePointCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indirectScribbleInteractionFocusElementIfNeededReferencePointCompletion {
        @Generated
        void call_indirectScribbleInteractionFocusElementIfNeededReferencePointCompletion(UIResponder focusedInput);
    }

    @Generated
    @Selector("indirectScribbleInteraction:frameForElement:")
    @ByValue
    CGRect indirectScribbleInteractionFrameForElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier);

    @Generated
    @Selector("indirectScribbleInteraction:isElementFocused:")
    boolean indirectScribbleInteractionIsElementFocused(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier);

    @Generated
    @Selector("indirectScribbleInteraction:requestElementsInRect:completion:")
    void indirectScribbleInteractionRequestElementsInRectCompletion(UIIndirectScribbleInteraction interaction,
            @ByValue CGRect rect,
            @ObjCBlock(name = "call_indirectScribbleInteractionRequestElementsInRectCompletion") Block_indirectScribbleInteractionRequestElementsInRectCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indirectScribbleInteractionRequestElementsInRectCompletion {
        @Generated
        void call_indirectScribbleInteractionRequestElementsInRectCompletion(NSArray<?> elements);
    }

    @Generated
    @IsOptional
    @Selector("indirectScribbleInteraction:shouldDelayFocusForElement:")
    default boolean indirectScribbleInteractionShouldDelayFocusForElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("indirectScribbleInteraction:willBeginWritingInElement:")
    default void indirectScribbleInteractionWillBeginWritingInElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }
}