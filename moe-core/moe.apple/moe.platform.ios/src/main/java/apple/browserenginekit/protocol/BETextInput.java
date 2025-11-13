package apple.browserenginekit.protocol;

import apple.browserenginekit.BEKeyEntry;
import apple.browserenginekit.BETextAlternatives;
import apple.browserenginekit.BETextDocumentContext;
import apple.browserenginekit.BETextDocumentRequest;
import apple.browserenginekit.BETextSuggestion;
import apple.browserenginekit.struct.BEDirectionalTextRange;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSDictionary;
import apple.foundation.struct.NSRange;
import apple.uikit.UITextPlaceholder;
import apple.uikit.UITextPosition;
import apple.uikit.UITextRange;
import apple.uikit.UITextSelectionRect;
import apple.uikit.UIView;
import apple.uikit.protocol.UIEditMenuInteractionAnimating;
import apple.uikit.protocol.UIKeyInput;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BETextInput")
public interface BETextInput extends UIKeyInput, BETextSelectionDirectionNavigation, BEResponderEditActions {
    /**
     * Adds text alternatives to the text input object for the current selection
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("addTextAlternatives:")
    void addTextAlternatives(@NotNull BETextAlternatives alternatives);

    /**
     * Adjusts the selection's start or end boundary specified by `boundaryIsStart` to the `point`
     * 
     * For example, the selection's boundary would be adjusted when the user moves the selection handles
     * 
     * Indicate to the system that the change was handled by invoking:
     * -[BETextInteraction selectionBoundaryAdjustedToPoint:touchPhase:flags:]
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("adjustSelectionBoundaryToPoint:touchPhase:baseIsStart:flags:")
    void adjustSelectionBoundaryToPointTouchPhaseBaseIsStartFlags(@ByValue CGPoint point, @NInt long touch,
            boolean boundaryIsStart, @NUInt long flags);

    /**
     * Adjusts the selection by the moving the selected range by the given `range`, in character granularity units.
     * 
     * The start of the current selection is moved by `range.offset` characters, and the length of the selection
     * is modified by `range.length` characters. For instance, if the current selection is the word "world" in
     * "Hello world" and the `range` is `{ -6, -2 }`, the selected text after adjustment will be "Hel".
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("adjustSelectionByRange:completionHandler:")
    void adjustSelectionByRangeCompletionHandler(@ByValue BEDirectionalTextRange range,
            @ObjCBlock(name = "call_adjustSelectionByRangeCompletionHandler") @NotNull Block_adjustSelectionByRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_adjustSelectionByRangeCompletionHandler {
        @Generated
        void call_adjustSelectionByRangeCompletionHandler();
    }

    /**
     * Returns the text alternatives that are available to the text input object.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("alternativesForSelectedText")
    @Nullable
    NSArray<? extends BETextAlternatives> alternativesForSelectedText();

    /**
     * A system-provided input delegate is assigned when the system is interested in input changes.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("asyncInputDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    BETextInputDelegate asyncInputDelegate();

    /**
     * Attributed string for the text that has been marked as part of an active input session
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("attributedMarkedText")
    @Nullable
    NSAttributedString attributedMarkedText();

    /**
     * Controls whether the edit menu is allowed to be presented or should be suppressed.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("automaticallyPresentEditMenu")
    boolean automaticallyPresentEditMenu();

    /**
     * Indicates autoscrolling has been triggered by a text interaction gesture.
     * 
     * Called repeatedly during range adjustment gestures, or when placing the text cursor.
     * 
     * The given point is in the coordinate space of the `textInputView`.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("autoscrollToPoint:")
    void autoscrollToPoint(@ByValue CGPoint point);

    /**
     * Returns whether text related actions, such those included in UIResponderStandardEditActions, can be handled
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("canPerformAction:withSender:")
    boolean canPerformActionWithSender(@NotNull SEL action, @Mapped(ObjCObjectMapper.class) @Nullable Object sender);

    /**
     * Indicates autoscrolling is complete.
     * 
     * There will be no more calls into`autoscrollToPoint` until a text interaction gesture starts autoscrolling.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("cancelAutoscroll")
    void cancelAutoscroll();

    /**
     * Returns a rectangle to draw the caret at a specified insertion point.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("caretRectForPosition:")
    @ByValue
    CGRect caretRectForPosition(@NotNull UITextPosition position);

    /**
     * Deletes text by the specified direction and granularity. Current supported combinations include:
     * 
     * character backward = delete
     * character forward = delete-forward
     * word backward = option + delete
     * word forward = option + delete-forward
     * line end = cmd + delete
     * line start = cmd + delete-forward
     * paragraph end = ctrl + K
     * paragraph start = ctrl + fn + K
     * 
     * (On Apple keyboards, the delete-forward key is a combination of fn + delete)
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("deleteInDirection:toGranularity:")
    void deleteInDirectionToGranularity(@NInt long direction, @NInt long granularity);

    /**
     * Indicates system has inserted the final dictation result
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("didInsertFinalDictationResult")
    void didInsertFinalDictationResult();

    /**
     * Object from which the BEExtendedTextInputTraits will be gathered.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("extendedTextInputTraits")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    BEExtendedTextInputTraits extendedTextInputTraits();

    /**
     * Delegates the handling for each stage of a key event (key down, press, up) and allows the BETextInput object to
     * indicate whether it should prevent default system behaviors.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("handleKeyEntry:withCompletionHandler:")
    void handleKeyEntryWithCompletionHandler(@NotNull BEKeyEntry entry,
            @ObjCBlock(name = "call_handleKeyEntryWithCompletionHandler") @NotNull Block_handleKeyEntryWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleKeyEntryWithCompletionHandler {
        @Generated
        void call_handleKeyEntryWithCompletionHandler(@NotNull BEKeyEntry theEvent, boolean wasHandled);
    }

    /**
     * Indicates whether there any text is currently marked as part of an active input session
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("hasMarkedText")
    boolean hasMarkedText();

    /**
     * Inserts the given `text` or one of it's alternative texts available on `alternatives`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("insertTextAlternatives:")
    void insertTextAlternatives(@NotNull BETextAlternatives alternatives);

    /**
     * Inserts a placeholder object to reserve visual space during text input.
     * If `size.height` is less than or equal to zero, then the placeholder is inline and line height.
     * If `size.height` is greather than zero, then the placeholder is treated as a paragraph of height `size.height`.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("insertTextPlaceholderWithSize:completionHandler:")
    void insertTextPlaceholderWithSizeCompletionHandler(@ByValue CGSize size,
            @ObjCBlock(name = "call_insertTextPlaceholderWithSizeCompletionHandler") @NotNull Block_insertTextPlaceholderWithSizeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_insertTextPlaceholderWithSizeCompletionHandler {
        @Generated
        void call_insertTextPlaceholderWithSizeCompletionHandler(@NotNull UITextPlaceholder arg0);
    }

    /**
     * Inserts a `textSuggestion` in response to a user suggestion selection
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("insertTextSuggestion:")
    void insertTextSuggestion(@NotNull BETextSuggestion textSuggestion);

    /**
     * Reflects the ability to modify text
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("isEditable")
    boolean isEditable();

    /**
     * Returns whether a point should be considered "near" the marked text.
     * Used to determine whether text interaction gestures near marked text should begin.
     * 
     * For example, text interaction gestures may considered "near" if they are within 66 points.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("isPointNearMarkedText:")
    boolean isPointNearMarkedText(@ByValue CGPoint point);

    /**
     * Returns whether replacement should be allowed for an editable element.
     * 
     * For example, replacement shouldn't be allowed in password fields or when the selected text
     * is only consists of whitespace.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("isReplaceAllowed")
    boolean isReplaceAllowed();

    /**
     * Represents whether the current selection is at the beginning of the document
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("isSelectionAtDocumentStart")
    boolean isSelectionAtDocumentStart();

    /**
     * Called when the user has requested the keyboard to dismiss itself.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("keyboardWillDismiss")
    default void keyboardWillDismiss() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * String for the text that has been marked as part of an active input session
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("markedText")
    @Nullable
    String markedText();

    /**
     * Range representing the position of the markedText.
     * 
     * If text can be selected, it can be marked. Marked text represents provisionally
     * inserted text that has yet to be confirmed by the user. It requires unique visual
     * treatment in its display. If there is any marked text, the selection, whether a
     * caret or an extended range, always resides within.
     * 
     * Setting marked text either replaces the existing marked text or, if none is present,
     * inserts it from the current selection.
     * 
     * Return nil if no marked text
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("markedTextRange")
    @Nullable
    UITextRange markedTextRange();

    /**
     * Adjusts the current selection by `offset` in character granularity units
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("moveByOffset:")
    void moveByOffset(@NInt long offset);

    /**
     * Moves the caret to relative to the current position in the `direction` to the given `granularity`.
     * The `direction` is "forward" or "backward" in accordance with the directionality of the language.
     * 
     * This method is invoked only when -[BETextInput textInteractionGesture:shouldBeginAtPoint:] returns YES.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("moveSelectionAtBoundary:inStorageDirection:completionHandler:")
    void moveSelectionAtBoundaryInStorageDirectionCompletionHandler(@NInt long granularity, @NInt long direction,
            @ObjCBlock(name = "call_moveSelectionAtBoundaryInStorageDirectionCompletionHandler") @NotNull Block_moveSelectionAtBoundaryInStorageDirectionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveSelectionAtBoundaryInStorageDirectionCompletionHandler {
        @Generated
        void call_moveSelectionAtBoundaryInStorageDirectionCompletionHandler();
    }

    /**
     * Returns the number of UTF-16 characters between one text position and another text position.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("offsetFromPosition:toPosition:")
    @NInt
    long offsetFromPositionToPosition(@NotNull UITextPosition from, @NotNull UITextPosition toPosition);

    /**
     * Removes text alternatives from the text input object for the current selection
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("removeTextAlternatives")
    default void removeTextAlternatives() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Removes a placeholder object from the text input view.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("removeTextPlaceholder:willInsertText:completionHandler:")
    void removeTextPlaceholderWillInsertTextCompletionHandler(@NotNull UITextPlaceholder placeholder,
            boolean willInsertText,
            @ObjCBlock(name = "call_removeTextPlaceholderWillInsertTextCompletionHandler") @NotNull Block_removeTextPlaceholderWillInsertTextCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeTextPlaceholderWillInsertTextCompletionHandler {
        @Generated
        void call_removeTextPlaceholderWillInsertTextCompletionHandler();
    }

    /**
     * Inserts/replaces text for a dictation.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("replaceDictatedText:withText:")
    void replaceDictatedTextWithText(@NotNull String oldText, @NotNull String newText);

    /**
     * Replaces the specified `text` with `replacementText`
     * 
     * 1. If there is a nonzero length current selection, then replace text with replacementText.
     * 2. If there is zero length current selection, then replace the matching word before the selection
     * 3. If the zero length selection is at the start of the element, then replace the matching word after the
     * selection
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("replaceSelectedText:withText:")
    void replaceSelectedTextWithText(@NotNull String text, @NotNull String replacementText);

    /**
     * Replace the specified text preceding the current selection.
     * 
     * Completion handler should be invoked with the rects representing the replacementText. If the replaceText
     * could not be completed succesfully, such as when the originalText no longer matches the current text, then
     * the completion handler should be invoked with an empty array.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("replaceText:withText:options:completionHandler:")
    void replaceTextWithTextOptionsCompletionHandler(@NotNull String originalText, @NotNull String replacementText,
            @NUInt long options,
            @ObjCBlock(name = "call_replaceTextWithTextOptionsCompletionHandler") @NotNull Block_replaceTextWithTextOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replaceTextWithTextOptionsCompletionHandler {
        @Generated
        void call_replaceTextWithTextOptionsCompletionHandler(@NotNull NSArray<? extends UITextSelectionRect> rects);
    }

    /**
     * Gathers context about the current document for the system
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("requestDocumentContext:completionHandler:")
    void requestDocumentContextCompletionHandler(@NotNull BETextDocumentRequest request,
            @ObjCBlock(name = "call_requestDocumentContextCompletionHandler") @NotNull Block_requestDocumentContextCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDocumentContextCompletionHandler {
        @Generated
        void call_requestDocumentContextCompletionHandler(@NotNull BETextDocumentContext arg0);
    }

    /**
     * Invoked by the system to gather context, including the client's preference for how the edit menu should be
     * positioned
     * relative to the selected text.
     */
    @Generated
    @Selector("requestPreferredArrowDirectionForEditMenuWithCompletionHandler:")
    void requestPreferredArrowDirectionForEditMenuWithCompletionHandler(
            @ObjCBlock(name = "call_requestPreferredArrowDirectionForEditMenuWithCompletionHandler") @NotNull Block_requestPreferredArrowDirectionForEditMenuWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestPreferredArrowDirectionForEditMenuWithCompletionHandler {
        @Generated
        void call_requestPreferredArrowDirectionForEditMenuWithCompletionHandler(@NInt long arg0);
    }

    /**
     * Invoked by the system to gather context around the current selection. Clients should generally include the
     * setence
     * that contains the current selection and include the previous sentence if the current selection is at a boundary.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("requestTextContextForAutocorrectionWithCompletionHandler:")
    void requestTextContextForAutocorrectionWithCompletionHandler(
            @ObjCBlock(name = "call_requestTextContextForAutocorrectionWithCompletionHandler") @NotNull Block_requestTextContextForAutocorrectionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTextContextForAutocorrectionWithCompletionHandler {
        @Generated
        void call_requestTextContextForAutocorrectionWithCompletionHandler(@NotNull BETextDocumentContext context);
    }

    /**
     * Invoked by the system to gather context for the presentation of various text related UI's.
     * Completion handler should be invoked with the `UITextSelectionRect`s for the substring nearest to the caret
     * that matches the given `input`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("requestTextRectsForString:withCompletionHandler:")
    void requestTextRectsForStringWithCompletionHandler(@NotNull String input,
            @ObjCBlock(name = "call_requestTextRectsForStringWithCompletionHandler") @NotNull Block_requestTextRectsForStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTextRectsForStringWithCompletionHandler {
        @Generated
        void call_requestTextRectsForStringWithCompletionHandler(@NotNull NSArray<? extends UITextSelectionRect> rects);
    }

    /**
     * Sets the selection caret to the given point
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectPositionAtPoint:completionHandler:")
    void selectPositionAtPointCompletionHandler(@ByValue CGPoint point,
            @ObjCBlock(name = "call_selectPositionAtPointCompletionHandler") @NotNull Block_selectPositionAtPointCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectPositionAtPointCompletionHandler {
        @Generated
        void call_selectPositionAtPointCompletionHandler();
    }

    /**
     * Sets the selection caret to the given point. Also includes a convenience document context request.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectPositionAtPoint:withContextRequest:completionHandler:")
    void selectPositionAtPointWithContextRequestCompletionHandler(@ByValue CGPoint point,
            @NotNull BETextDocumentRequest request,
            @ObjCBlock(name = "call_selectPositionAtPointWithContextRequestCompletionHandler") @NotNull Block_selectPositionAtPointWithContextRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectPositionAtPointWithContextRequestCompletionHandler {
        @Generated
        void call_selectPositionAtPointWithContextRequestCompletionHandler(@NotNull BETextDocumentContext arg0);
    }

    /**
     * Indicates the edit menu is being shown at the given location in the text input view's
     * coordinate space.
     * 
     * The completion handler takes a BOOL indicating whether or not the menu
     * should be shown, a string representing the text context around the updated selection range
     * (generally encompassing the paragraph that contains the selection range) as well as the
     * range of the updated selection, relative to the paragraph context.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectTextForEditMenuWithLocationInView:completionHandler:")
    void selectTextForEditMenuWithLocationInViewCompletionHandler(@ByValue CGPoint locationInView,
            @ObjCBlock(name = "call_selectTextForEditMenuWithLocationInViewCompletionHandler") @NotNull Block_selectTextForEditMenuWithLocationInViewCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectTextForEditMenuWithLocationInViewCompletionHandler {
        @Generated
        void call_selectTextForEditMenuWithLocationInViewCompletionHandler(boolean shouldPresentMenu,
                @Nullable String contextString, @ByValue NSRange selectedRangeInContextString);
    }

    /**
     * Updates the selection to text contained within the specified `granularity` at the given `point`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectTextInGranularity:atPoint:completionHandler:")
    void selectTextInGranularityAtPointCompletionHandler(@NInt long granularity, @ByValue CGPoint point,
            @ObjCBlock(name = "call_selectTextInGranularityAtPointCompletionHandler") @NotNull Block_selectTextInGranularityAtPointCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectTextInGranularityAtPointCompletionHandler {
        @Generated
        void call_selectTextInGranularityAtPointCompletionHandler();
    }

    /**
     * Selects a word with autocorrect replacement suggestions when it is tapped
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectWordForReplacement")
    void selectWordForReplacement();

    /**
     * String representing the selected text.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectedText")
    @Nullable
    String selectedText();

    /**
     * Range representing the selected text.
     * 
     * Text may have a selection, either zero-length (a caret) or ranged.
     * Editing operations are always performed on the text from this selection. nil corresponds to no selection.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectedTextRange")
    @Nullable
    UITextRange selectedTextRange();

    /**
     * Rect representing the bounds of editable elements, used to ensure and UI don't overflow outside them
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectionClipRect")
    @ByValue
    CGRect selectionClipRect();

    /**
     * Returns an array of selection rects corresponding to the range of text.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectionRectsForRange:")
    @NotNull
    NSArray<? extends UITextSelectionRect> selectionRectsForRange(@NotNull UITextRange range);

    /**
     * A system-provided input delegate is assigned when the system is interested in input changes.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setAsyncInputDelegate:")
    void setAsyncInputDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable BETextInputDelegate value);

    /**
     * Inserts the provided styled text and marks it to indicate that it is part of an active input session.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setAttributedMarkedText:selectedRange:")
    void setAttributedMarkedTextSelectedRange(@Nullable NSAttributedString markedText, @ByValue NSRange selectedRange);

    /**
     * Sets the base writing direction for a specified range of text in a document.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setBaseWritingDirection:forRange:")
    void setBaseWritingDirectionForRange(@NInt long writingDirection, @NotNull UITextRange range);

    /**
     * Inserts the provided text and marks it to indicate that it is part of an active input session.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setMarkedText:selectedRange:")
    void setMarkedTextSelectedRange(@Nullable String markedText, @ByValue NSRange selectedRange);

    /**
     * Range representing the selected text.
     * 
     * Text may have a selection, either zero-length (a caret) or ranged.
     * Editing operations are always performed on the text from this selection. nil corresponds to no selection.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setSelectedTextRange:")
    void setSelectedTextRange(@Nullable UITextRange value);

    /**
     * Indicates the selection should change to contain the text between the
     * `from` and `to` points.
     * 
     * For example, see the keyboard's trackpad selection gesture explained in
     * "Turn the onscreen keyboard into a trackpad" guide on support.apple.com
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setSelectionFromPoint:toPoint:gesture:state:")
    void setSelectionFromPointToPointGestureState(@ByValue CGPoint from, @ByValue CGPoint to, @NInt long gesture,
            @NInt long state);

    /**
     * Indicates a transition in shift state
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("shiftKeyStateChangedFromState:toState:")
    void shiftKeyStateChangedFromStateToState(@NInt long oldState, @NInt long newState);

    /**
     * Invoked by the system when it is about to dismiss an edit menu with an animator.
     */
    @Generated
    @Selector("systemWillDismissEditMenuWithAnimator:")
    void systemWillDismissEditMenuWithAnimator(
            @Mapped(ObjCObjectMapper.class) @NotNull UIEditMenuInteractionAnimating animator);

    /**
     * Invoked by the system when it is about to present an edit menu with an animator.
     */
    @Generated
    @Selector("systemWillPresentEditMenuWithAnimator:")
    void systemWillPresentEditMenuWithAnimator(
            @Mapped(ObjCObjectMapper.class) @NotNull UIEditMenuInteractionAnimating animator);

    /**
     * Returns a rect representing the bounds of the first line of marked text, if marked text is set.
     * 
     * Otherwise, this returns a rect representing the bounds of the last word at or before the insertion point.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textFirstRect")
    @ByValue
    CGRect textFirstRect();

    /**
     * Returns the text in the specified range.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textInRange:")
    @Nullable
    String textInRange(@NotNull UITextRange range);

    /**
     * An affiliated view that provides a coordinate system for all geometric values in this protocol.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textInputView")
    @NotNull
    UIView textInputView();

    /**
     * Returns whether a gesture with the given `gestureType` should begin for the given `point`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textInteractionGesture:shouldBeginAtPoint:")
    boolean textInteractionGestureShouldBeginAtPoint(@NInt long gestureType, @ByValue CGPoint point);

    /**
     * Returns a rect representing the bounds of the last line of marked text, if marked text is set.
     * 
     * Otherwise, this returns a rect representing the bounds of the last word at or before the insertion point.
     * This may have the same value of `textFirstRect`, but can differ in cases such as a word that spans two lines.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textLastRect")
    @ByValue
    CGRect textLastRect();

    /**
     * Returns a dictionary containing NSAttributedString keys represeting appearance customizations.
     * 
     * For example, text styling information influence the appearance of a correction rect.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textStylingAtPosition:inDirection:")
    @Nullable
    NSDictionary<String, ?> textStylingAtPositionInDirection(@NotNull UITextPosition position, @NInt long direction);

    /**
     * Transposes the characters on either side of the caret in response to the key command, ctrl + T
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("transposeCharactersAroundSelection")
    void transposeCharactersAroundSelection();

    /**
     * Unmarks the currently marked text
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("unmarkText")
    void unmarkText();

    /**
     * Rect used to place UI (such as selection handles) in a location that isn't obscurred by app UI.
     * 
     * Must return a rect in `textInputView`'s coordinate space.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("unobscuredContentRect")
    @ByValue
    CGRect unobscuredContentRect();

    /**
     * View representing the web content that is agnostic of zoom state.
     * Used to draw zoom agnostic system UI elements, such as the selection handles
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("unscaledView")
    @NotNull
    UIView unscaledView();

    /**
     * Indicates the `point` the text interaction gesture is tracking has changed
     * 
     * Indicate to the system the change was handled by invoking:
     * -[BETextInteraction selectionChangedWithGestureAtPoint:gesture:state:flags:]
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("updateCurrentSelectionTo:fromGesture:inState:")
    void updateCurrentSelectionToFromGestureInState(@ByValue CGPoint point, @NInt long gestureType, @NInt long state);

    /**
     * Adjusts the selection from current text position to include text at the given `point`.
     * 
     * For example, while holding shift, click a point in a text document and the current selection should adjust to
     * include
     * all the text up to that point.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("updateSelectionWithExtentPoint:boundary:completionHandler:")
    void updateSelectionWithExtentPointBoundaryCompletionHandler(@ByValue CGPoint point, @NInt long granularity,
            @ObjCBlock(name = "call_updateSelectionWithExtentPointBoundaryCompletionHandler") @NotNull Block_updateSelectionWithExtentPointBoundaryCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateSelectionWithExtentPointBoundaryCompletionHandler {
        @Generated
        void call_updateSelectionWithExtentPointBoundaryCompletionHandler(boolean selectionEndIsMoving);
    }

    /**
     * Indicates the system is about to insert the final dictation result.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("willInsertFinalDictationResult")
    void willInsertFinalDictationResult();

    /**
     * If different than the text input view, one can return a container view here for selection views
     * that draw _above_ text. Includes selection range adjustment handles. If this is unimplemented
     * or nil is returned, views are to be installed onto the text input view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("selectionContainerViewAboveText")
    @Nullable
    default UIView selectionContainerViewAboveText() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If different than the text input view, one can return a container view here for selection views
     * that draw _below_ text. Includes the selection highlight view. If this is unimplemented or nil
     * is returned, views are to be installed onto the text input view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("selectionContainerViewBelowText")
    @Nullable
    default UIView selectionContainerViewBelowText() {
        throw new java.lang.UnsupportedOperationException();
    }
}