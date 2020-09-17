package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.uikit.UIScribbleInteraction;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIScribbleInteractionDelegate")
public interface UIScribbleInteractionDelegate {
    @Generated
    @IsOptional
    @Selector("scribbleInteraction:shouldBeginAtLocation:")
    default boolean scribbleInteractionShouldBeginAtLocation(UIScribbleInteraction interaction,
            @ByValue CGPoint location) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scribbleInteractionDidFinishWriting:")
    default void scribbleInteractionDidFinishWriting(UIScribbleInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scribbleInteractionShouldDelayFocus:")
    default boolean scribbleInteractionShouldDelayFocus(UIScribbleInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scribbleInteractionWillBeginWriting:")
    default void scribbleInteractionWillBeginWriting(UIScribbleInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}