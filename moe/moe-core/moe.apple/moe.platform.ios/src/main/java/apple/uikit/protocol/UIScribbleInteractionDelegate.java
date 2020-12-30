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
    /**
     * @abstract Allows the delegate to prevent Scribble from starting at a specific location in the view. If not implemented, defaults to YES.
     * You can use this callback to temporarily suppress Scribble in text input views if your app supports drawing over text or other special interaction when using Apple Pencil. In cases like this, it's recommended to provide a UI affordance for the user to toggle between drawing and handwriting.
     * This callback can also return NO for views that handle Pencil events directly, like a drawing canvas, since nearby text fields could take over the Pencil events for writing.
     * @param interaction The interaction asking if it can begin handling user input.
     * @param location The location in the interaction's view coordinate system.
     * @return Return NO to disallow writing at the specified location.
     */
    @Generated
    @IsOptional
    @Selector("scribbleInteraction:shouldBeginAtLocation:")
    default boolean scribbleInteractionShouldBeginAtLocation(UIScribbleInteraction interaction,
            @ByValue CGPoint location) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Will be called when the user finished writing into the interaction's view, after the last word has been transcribed and committed.
     * @param interaction The interaction notifying about writing state changes.
     */
    @Generated
    @IsOptional
    @Selector("scribbleInteractionDidFinishWriting:")
    default void scribbleInteractionDidFinishWriting(UIScribbleInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Allow the delegate to delay focusing (making first responder) the text input view. Normally, Scribble will focus the target input as soon as the user begins writing, but if you return YES from this callback, it will wait until the user makes a brief pause. This is useful in cases where the text input view will shift or transform when becoming first responder, which can be disruptive to a user trying to handwrite into it.
     * Wherever possible it is preferable to adjust the UI behavior to avoid the layout changes, and only use delayed focus as a last resort, since transcription will happen all at once instead of incrementally.
     * @param interaction The interaction asking about delaying focus.
     * @return Return YES to delay focusing the text input.
     */
    @Generated
    @IsOptional
    @Selector("scribbleInteractionShouldDelayFocus:")
    default boolean scribbleInteractionShouldDelayFocus(UIScribbleInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Will be called when the user begins writing into the interaction's view. This call will always be paired with a corresponding call to scribbleInteractionDidFinishWriting:. It is recommended to use this call to hide custom placeholders or other UI elements that can interfere with writing.
     * @param interaction The interaction notifying about writing state changes.
     */
    @Generated
    @IsOptional
    @Selector("scribbleInteractionWillBeginWriting:")
    default void scribbleInteractionWillBeginWriting(UIScribbleInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}