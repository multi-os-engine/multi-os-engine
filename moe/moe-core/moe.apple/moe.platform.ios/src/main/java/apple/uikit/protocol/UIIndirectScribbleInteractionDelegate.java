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

/**
 * @abstract The protocol to be implemented by the delegate of UIIndirectScribbleInteraction. It will be responsible for supplying a list of writable elements, focusing them, and ultimately providing a real UITextInput that will handle text editing operations.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIIndirectScribbleInteractionDelegate")
public interface UIIndirectScribbleInteractionDelegate {
    /**
     * @abstract Will be called when the user finished writing into an element, after the last word has been transcribed and committed.
     * @param interaction The interaction notifying about writing state changes.
     * @param elementIdentifier The identifier of the element the user finished writing into.
     */
    @Generated
    @IsOptional
    @Selector("indirectScribbleInteraction:didFinishWritingInElement:")
    default void indirectScribbleInteractionDidFinishWritingInElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Asks the delegate to focus an element to handle text edits. In response, it should make the element the currently focused one, and make the corresponding UITextInput become first responder.
     * If the element was not focused already, text selection should be set to the character location closest to focusReferencePoint, to avoid any scrolling or shifting of content.
     * If the element was focused already, no changes in selection should be made and this call can be ignored, but you must still call the completion handler with a reference to the text input.
     * @param interaction The interaction that is requesting to focus an element.
     * @param elementIdentifier The identifier of the element that should be focused.
     * @param completion You must always call the completion handler, either synchronously or asynchronously. On success, the first parameter should be the text input that became first responder and that will handle text operations for this element. On failure, call the completion with a nil parameter.
     */
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

    /**
     * @abstract Asks the delegate to provide the frame of an element.
     * @param interaction The interaction asking for the element's frame.
     * @param elementIdentifier The identifier of the element the interaction is asking about.
     * @return Frame for the element, in the interactions's view coordinate system.
     */
    @Generated
    @Selector("indirectScribbleInteraction:frameForElement:")
    @ByValue
    CGRect indirectScribbleInteractionFrameForElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier);

    /**
     * @abstract Asks the delegate if an element is currently focused, according to the internal state of the interaction's view.
     * @param interaction The interaction asking for the focused state.
     * @param elementIdentifier The identifier of the element the interaction is asking about.
     * @return Return YES if the element is the one currently focused.
     */
    @Generated
    @Selector("indirectScribbleInteraction:isElementFocused:")
    boolean indirectScribbleInteractionIsElementFocused(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier);

    /**
     * @abstract This method will be called to request the text input elements in a certain rect of the view, each of which represents an area where the user can start writing even if it's not a text input field itself.
     * @param interaction The interaction asking for the elements.
     * @param rect The rect around the area where the user is trying to write, in the interaction's view coordinate system. Only elements intersecting this rect should be returned.
     * @param completion  You must call the completion handler, synchronously or asynchronously, with an array of identifiers of the available elements, or an empty array if no elements are available.
     */
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

    /**
     * @abstract Allow the delegate to delay focusing an element. Normally, Scribble will focus the element as soon as the user begins writing, but if you return YES from this callback, it will wait until the user makes a brief pause. This is useful in cases where the element's frame will shift or transform when becoming focused, which can be disruptive to a user trying to handwrite into it.
     * Wherever possible it is preferable to adjust the UI behavior to avoid the layout changes, and only use delayed focus as a last resort, since transcription will happen all at once instead of incrementally.
     * @param interaction The interaction asking about delaying focus.
     * @param elementIdentifier The identifier of the element the interaction is asking about.
     * @return Return YES to delay focusing the element.
     */
    @Generated
    @IsOptional
    @Selector("indirectScribbleInteraction:shouldDelayFocusForElement:")
    default boolean indirectScribbleInteractionShouldDelayFocusForElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Will be called when the user begins writing into an element. This call will always be paired with a corresponding call to indirectScribbleInteraction:didFinishWritingInElement:. It is recommended to use this call to hide custom placeholders or other UI elements that can interfere with writing.
     * @param interaction The interaction notifying about writing state changes.
     * @param elementIdentifier The identifier of the element the user is writing into.
     */
    @Generated
    @IsOptional
    @Selector("indirectScribbleInteraction:willBeginWritingInElement:")
    default void indirectScribbleInteractionWillBeginWritingInElement(UIIndirectScribbleInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object elementIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }
}