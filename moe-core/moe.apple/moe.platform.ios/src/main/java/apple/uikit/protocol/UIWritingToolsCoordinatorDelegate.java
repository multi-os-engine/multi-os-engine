package apple.uikit.protocol;

import apple.corefoundation.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSUUID;
import apple.foundation.NSValue;
import apple.foundation.struct.NSRange;
import apple.uikit.UIBezierPath;
import apple.uikit.UITargetedPreview;
import apple.uikit.UIView;
import apple.uikit.UIWritingToolsCoordinator;
import apple.uikit.UIWritingToolsCoordinatorAnimationParameters;
import apple.uikit.UIWritingToolsCoordinatorContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * An interface that you use to manage interactions between Writing Tools
 * and your custom text view.
 * 
 * Adopt the `UIWritingToolsCoordinator.Delegate` protocol in the type you
 * use to manage your custom text view. When you add a ``UIWritingToolsCoordinator``
 * object to your view, the coordinator uses this protocol to communicate
 * with that view. The protocol lets Writing Tools fetch your view’s text,
 * report suggested changes back to your view, and deliver visual feedback
 * when Writing Tools features are active. Make sure the type that adopts
 * this protocol has access to your view’s text storage and can perform
 * relevant tasks on behalf of the view.
 * 
 * Writing Tools expects you to call the provided handler blocks at the end
 * of your delegate methods. It’s crucial that you execute these blocks in a
 * timely manner to allow Writing Tools to perform subsequent tasks. For example,
 * Writing Tools waits for you to execute the handlers for animation-related methods
 * before moving on to the next stage of the animations.
 * 
 * API-Since: 18.2
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIWritingToolsCoordinatorDelegate")
public interface UIWritingToolsCoordinatorDelegate {
    /**
     * Asks the delegate to clean up any state related to the specified
     * Writing Tools animation.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object notifying you
     * that animations are about to begin.
     * - textAnimation: The type of animation Writing Tools finished.
     * - range: The range of text that finished animating. This range is
     * relative to the text in your context object, and it’s your responsibility
     * to match that location to the correct location in your text storage. If
     * you initialized the context object with the entire contents of your
     * view’s text storage, you can use `range` as-is to access that text storage.
     * However, if you initialized the context object with only a portion of
     * your view’s text, add the starting location of your context object’s
     * text to this value to get the correct range for that text storage.
     * - context: The context object that contains the original text.
     * - completion: A completion handler to execute when you are done.
     * The handler has no return value and takes no parameters. You must
     * call this handler at some point during your implementation.
     * 
     * Use this method to clean up any data structures you created to support
     * the specified type of Writing Tools animation. You can also use this
     * method to restore the visibility of any text you hid previously. When
     * you finish your cleanup work, call the completion handler to notify Writing Tools.
     * 
     * Writing Tools calls this method only after previous calls to the
     * ``writingToolsCoordinator(_:previewFor:range:context:completion:)``
     * and ``writingToolsCoordinator(_:prepareFor:range:context:completion:)``
     * methods for the same animation type. However, Writing Tools can interleave
     * calls to this method with calls to prepare an animation of a different
     * type. In your implementation of this method, make sure the actions you
     * take don’t interfere with other in-flight animations.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:finishTextAnimation:forRange:inContext:completion:")
    void writingToolsCoordinatorFinishTextAnimationForRangeInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @NInt long textAnimation,
            @ByValue NSRange range, @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorFinishTextAnimationForRangeInContextCompletion") @NotNull Block_writingToolsCoordinatorFinishTextAnimationForRangeInContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorFinishTextAnimationForRangeInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorFinishTextAnimationForRangeInContextCompletion();
    }

    /**
     * Prepare for animations for the content that Writing Tools is evaluating.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object notifying you that
     * animations are about to begin.
     * - textAnimation: The type of animation Writing Tools is preparing.
     * - range: The range of text affected by the animation. This range is
     * relative to the text in your context object, and it’s your responsibility
     * to match that location to the correct location in your text storage.
     * If you initialized the context object with the entire contents of your
     * view’s text storage, you can use `range` as-is to access that text
     * storage. However, if you initialized the context object with only a portion
     * of your view’s text, add the starting location of your context object’s
     * text to this value to get the correct range for that text storage.
     * - context: The context object that contains the original text. Use this
     * object to fetch the current text, and to match that text to your underlying
     * text storage.
     * - completion: A completion handler to execute when you are done. The handler
     * has no return value and takes no parameters. You must call this handler
     * at some point during your implementation.
     * 
     * During an interactive evaluation of your view’s text, Writing Tools creates
     * different animations to provide feedback on what’s happening. For example, it
     * creates an ``UIWritingToolsCoordinator/TextAnimation/anticipate`` animation to
     * let people know the system is evaluating the text. The `textAnimation` parameter
     * tells you what type of animation to prepare for.
     * 
     * Use this method to prepare for the system-provided animations of your view’s
     * content. For interactive animations, hide the text in the specified range temporarily
     * while the system animations run. For non-interactive animations, dim the text
     * for the duration of the animation to indicate it’s not editable. For animations
     * to remove or insert text, you can also use this method to set up animations
     * to reflow your view’s content to match the changes. At the end of a given animation,
     * use your delegate’s ``writingToolsCoordinator(_:finish:for:in:completion:)``
     * method to undo any changes you make to your content.
     * 
     * For a single animation type, the system calls the
     * ``writingToolsCoordinator(_:previewFor:range:context:completion:)`` method,
     * followed sequentially by this method and the ``writingToolsCoordinator(_:finish:for:in:completion:)``
     * method. Each method executes asynchronously, but the system calls the next
     * method in the sequence only after you call the completion handler of the previous
     * method. However, multiple animations can run simultaneously, so check the
     * `textAnimation` and `range` parameters to differentiate sequences.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:prepareForTextAnimation:forRange:inContext:completion:")
    void writingToolsCoordinatorPrepareForTextAnimationForRangeInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @NInt long textAnimation,
            @ByValue NSRange range, @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorPrepareForTextAnimationForRangeInContextCompletion") @NotNull Block_writingToolsCoordinatorPrepareForTextAnimationForRangeInContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorPrepareForTextAnimationForRangeInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorPrepareForTextAnimationForRangeInContextCompletion();
    }

    /**
     * Tells the delegate that there are text changes to incorporate into the view.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object providing the changes
     * to your custom view.
     * - range: A range of text to update. This range is relative to the text
     * in your context object, and it’s your responsibility to match that location
     * to the correct location in your text storage. If you initialized the
     * context object with the entire contents of your view’s text storage,
     * you can use `range` as-is to access that text storage. However, if you
     * initialized the context object with only a portion of your view’s text,
     * add the starting location of your context object’s text to this value
     * to get the correct range for that text storage.
     * - context: The context object that contains the original text to modify.
     * Use this object to locate the correct text storage object for your view.
     * - replacementText: The text to insert in place of the current text at `range`.
     * You can insert this text as-is, insert a modified version of this string,
     * or reject the replacement text altogether.
     * - reason: The type of replacement Writing Tools performs. This parameter
     * indicates whether Writing Tools is replacing the text with or without animations.
     * - animationParameters: The animation parameters for any interactive changes,
     * or `nil` if the changes aren’t interactive. Use this object to create any
     * additional animations for the system to run alongside the changes Writing Tools
     * makes. For example, use it to update other views that contain related information.
     * - completion: A completion handler to execute with the results of the operation.
     * The handler has no return value and takes an optional attributed string as
     * a parameter. If you incorporate the replacement text, either as-is or with
     * modifications, pass the actual string you incorporated to the completion
     * block. If you reject the suggested change and leave the original text
     * unchanged, specify `nil` for this parameter.
     * 
     * Use this method to update your view’s text storage with the proposed changes.
     * Writing Tools can call this method multiple times during the course of a
     * session to notify you of changes to different ranges of text. Incorporate
     * the changes into your view’s text storage and notify your layout manager
     * so it can refresh the view.
     * 
     * > Important: When integrating changes, remember to update `range.location` as needed
     * to get the correct location in your view’s text storage.
     * 
     * Remove the text in the appropriate range of your text storage, and replace
     * it with the contents of `replacementText`. When you finish, call the completion
     * handler and pass in the replacement text you inserted. If you change the
     * string in `replacementText` before incorporating it into your text storage,
     * return your modified string instead. Returning the string lets Writing Tools
     * track any alterations you made to it. You can also pass `nil` to the
     * completion handler if you don’t incorporate the replacement text.
     * 
     * For interactive changes, Writing Tools works with your delegate to animate
     * the removal of the old text and the insertion of any replacement text. If
     * you need to modify other parts of your interface to reflect the changes,
     * use the provided ``UIWritingToolsCoordinator/AnimationParameters`` object
     * to create additional animations to run at the same time as the system-provided animations.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:replaceRange:inContext:proposedText:reason:animationParameters:completion:")
    void writingToolsCoordinatorReplaceRangeInContextProposedTextReasonAnimationParametersCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @ByValue NSRange range,
            @NotNull UIWritingToolsCoordinatorContext context, @NotNull NSAttributedString replacementText,
            @NInt long reason, @Nullable UIWritingToolsCoordinatorAnimationParameters animationParameters,
            @ObjCBlock(name = "call_writingToolsCoordinatorReplaceRangeInContextProposedTextReasonAnimationParametersCompletion") @NotNull Block_writingToolsCoordinatorReplaceRangeInContextProposedTextReasonAnimationParametersCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorReplaceRangeInContextProposedTextReasonAnimationParametersCompletion {
        @Generated
        void call_writingToolsCoordinatorReplaceRangeInContextProposedTextReasonAnimationParametersCompletion(
                @Nullable NSAttributedString arg0);
    }

    /**
     * Asks the delegate to provide the bounding paths for the specified
     * text in your view.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object requesting information
     * from your custom view.
     * - range: The range of text to evaluate. This range is relative to the
     * text in your context object, and it’s your responsibility to match that
     * location to the correct location in your text storage. If you initialized
     * the context object with the entire contents of your view’s text storage,
     * you can use `range` as-is to access that text storage. However, if you
     * initialized the context object with only a portion of your view’s text,
     * add the starting location of your context object’s text to this value to
     * get the correct range for that text storage.
     * - context: The context object with the target text. Use this object to
     * find the text in your view’s text storage.
     * - completion: A handler to execute with the required information. The
     * handler has no return value and takes an array of Bezier paths as a
     * parameter. You must call this handler at some point during your method’s implementation.
     * 
     * After applying proofreading marks to your view’s text, Writing Tools lets
     * the person accept or reject individual suggestions. To facilitate interactions,
     * the coordinator asks your delegate to provide one or more Bezier paths that
     * surround those proofreading suggestions. For each distinct range of text
     * with a suggestion, it calls this method to get the Bezier paths that surround
     * the corresponding text.
     * 
     * After you determine the location of the specified range of text in your view’s
     * text storage, call the
     * <doc://com.apple.documentation/documentation/uikit/nstextlayoutmanager/3809995-enumeratetextsegments>
     * method of your view’s <doc://com.apple.documentation/documentation/uikit/nstextlayoutmanager>
     * to compute the selection rectangles for that text. That method finds the text
     * segments that contain the text and returns the frame rectangle for each one.
     * Create a Bezier path for each rectangle, and convert the coordinates of each path
     * to the coordinate space of the view in your coordinator's ``UIWritingToolsCoordinator/decorationContainerView``
     * property. Pass the resulting paths to the completion handler.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:requestsBoundingBezierPathsForRange:inContext:completion:")
    void writingToolsCoordinatorRequestsBoundingBezierPathsForRangeInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @ByValue NSRange range,
            @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorRequestsBoundingBezierPathsForRangeInContextCompletion") @NotNull Block_writingToolsCoordinatorRequestsBoundingBezierPathsForRangeInContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorRequestsBoundingBezierPathsForRangeInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorRequestsBoundingBezierPathsForRangeInContextCompletion(
                @NotNull NSArray<? extends UIBezierPath> arg0);
    }

    /**
     * Asks your delegate to provide the text to evaluate during the Writing Tools
     * operation.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object requesting information
     * from your custom view.
     * - scope: The amount of text the coordinator requested. Use this property
     * to determine if Writing Tools is evaluating all of your text or only a subset.
     * - completion: A completion block to execute with the required information.
     * You must execute this block once at end of your method's implementation.
     * The block has no return value and takes an array of
     * ``UIWritingToolsCoordinator/Context`` objects that contain the requested information.
     * 
     * At the start of every operation, the ``UIWritingToolsCoordinator`` object calls
     * this method to request the text to evaluate. Use this method to create one or
     * more ``UIWritingToolsCoordinator/Context`` objects with your view’s text.
     * Create only one ``UIWritingToolsCoordinator/Context`` object if your view has
     * only one text storage object. If your view contains multiple text storage objects,
     * create separate ``UIWritingToolsCoordinator/Context`` objects for each
     * text storage object. Writing Tools returns updates for each context object
     * separately, making it easier for you to incorporate changes into the correct
     * text storage object. Don’t create multiple context objects if your view has
     * only one text storage object.
     * 
     * The `scope` parameter tells you what content Writing Tools expects you to provide
     * in your context object. For example, Writing Tools expects you to provide the
     * selected text when the parameter contains the ``UIWritingToolsCoordinator/ContextScope/userSelection``
     * option. When Writing Tools requests a subset of your overall text, include
     * some of the surrounding text in your context object too. Writing Tools can
     * use the extra text you provide to improve the results of its evaluation. For
     * example, it might use an entire paragraph, instead of only the selected sentence,
     * to evaluate ways to rewrite that sentence. It’s best to include the text up
     * to the nearest paragraph boundary before and after the selection. If you
     * include extra text in your context object, set the ``NS/UIWritingToolsCoordinator/Context/range``
     * property to the range of the selected text.
     * 
     * > Note: When a context object stores only a subset of your view’s text, record
     * additional information to map the location of that text to the correct location
     * in your view’s text storage. Keep that information up-to-date throughout the
     * Writing Tools session.
     * 
     * Pass the context objects you create to the provided completion handler before
     * your method returns. Writing Tools waits for you to call the completion
     * handler before proceeding with the operation.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:requestsContextsForScope:completion:")
    void writingToolsCoordinatorRequestsContextsForScopeCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @NInt long scope,
            @ObjCBlock(name = "call_writingToolsCoordinatorRequestsContextsForScopeCompletion") @NotNull Block_writingToolsCoordinatorRequestsContextsForScopeCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorRequestsContextsForScopeCompletion {
        @Generated
        void call_writingToolsCoordinatorRequestsContextsForScopeCompletion(
                @NotNull NSArray<? extends UIWritingToolsCoordinatorContext> arg0);
    }

    /**
     * Asks the delegate to provide a decoration view for the specified range of text.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object requesting information
     * from your custom view.
     * - range: The range of text to consider in the specified `context` object.
     * The location value of this range is relative to the beginning of the text
     * in your context object, and it’s your responsibility to match that location
     * to the correct location in your text storage. If you initialized the
     * context object with the entire contents of your view’s text storage, you
     * can use `range` as-is to access that text storage. However, if you initialized
     * the context object with only a portion of your view’s text, add the starting
     * location of your context object’s text to this value to get the correct
     * range for that text storage.
     * - context: The context object that contains the text to consider. Use this
     * object to locate the appropriate text storage object for your view.
     * - completion: A completion handler to execute when you are done. The handler
     * has no return value and takes a ``UIView`` object as a parameter. You must call
     * this handler at some point during your implementation.
     * 
     * If your view uses multiple ``NSTextContainer`` objects to draw text in different
     * regions, use this method to provide Writing Tools with the view to use for the
     * specified range of text. After calling your delegate’s
     * ``writingToolsCoordinator(_:singleContainerSubrangesOf:in:)``
     * method, Writing Tools calls this method for each subrange of text you provided.
     * Find or provide a view situated visibly below the specified text in your text
     * view. It's also satisfactory to provide a view that’s visually in front of the
     * text. Writing Tools uses the provided view to host any proofreading marks for
     * the specified range of text.
     * 
     * If your view has only one text container, use the coordinator’s
     * ``UIWritingToolsCoordinator/decorationContainerView``
     * property to specify the view to use for proofreading marks.
     * 
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("writingToolsCoordinator:requestsDecorationContainerViewForRange:inContext:completion:")
    default void writingToolsCoordinatorRequestsDecorationContainerViewForRangeInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @ByValue NSRange range,
            @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorRequestsDecorationContainerViewForRangeInContextCompletion") @NotNull Block_writingToolsCoordinatorRequestsDecorationContainerViewForRangeInContextCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorRequestsDecorationContainerViewForRangeInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorRequestsDecorationContainerViewForRangeInContextCompletion(
                @NotNull UIView arg0);
    }

    /**
     * Asks the delegate for a preview image and layout information for the
     * specified text.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object notifying you that
     * animations are about to begin.
     * - textAnimation: The type of animation Writing Tools is preparing.
     * - range: The range of text that requires a preview image. This range
     * is relative to the text in your context object, and it’s your responsibility
     * to match that location to the correct location in your text storage.
     * If you initialized the context object with the entire contents of
     * your view’s text storage, you can use `range` as-is to access that
     * text storage. However, if you initialized the context object with only
     * a portion of your view’s text, add the starting location of your
     * context object’s text to this value to get the correct range for that
     * text storage.
     * - context: The context object that contains the original text. Use this
     * object to fetch the current text, and to match that text to your
     * underlying text storage.
     * - completion: A completion handler to execute when you are done. The
     * handler has no return value and takes a ``UITargetedPreview`` object
     * as a parameter. You must call this handler at some point during your implementation.
     * 
     * During an interactive evaluation of your view’s text, Writing Tools creates
     * different animations to provide feedback on what’s happening. As part of
     * the preparation for those animations, Writing Tools asks you to provide
     * a preview of the affected content in your view. Writing Tools uses this
     * preview to build and execute the animations in the view stored in the
     * ``UIWritingToolsCoordinator/effectContainerView`` property of the coordinator object.
     * 
     * To build a preview of your content in iOS, render the specified range of
     * text into an image with a transparent background. Install the image in a
     * ``UIImageView`` and use that to build your preview object. Set the frame
     * rectangle of your image view to the rectangle in your view’s coordinate
     * space that contains the text you captured. When creating the ``UITargetedPreview``
     * object, include both a ``UIPreviewParameters`` and a ``UIPreviewTarget``
     * object. Create the ``UIPreviewTarget`` object with your text view as the
     * container, and set the center point to the center of your text view.
     * Create the ``UIPreviewParameters`` object using the selection rectangles
     * for the text, which you get from your view’s layout manager. Writing Tools
     * uses this information to place your image directly above the text in your view.
     * 
     * For a single animation type, the system calls this method, followed sequentially
     * by the ``writingToolsCoordinator(_:prepareFor:range:context:completion:)`` and
     * ``writingToolsCoordinator(_:finish:for:in:completion:)``
     * methods. Each method executes asynchronously, but the system calls the next
     * method in the sequence only after you call the completion handler of the
     * previous method. However, multiple animations can run simultaneously, so
     * check the `textAnimation` parameter to differentiate sequences.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:requestsPreviewForTextAnimation:ofRange:inContext:completion:")
    void writingToolsCoordinatorRequestsPreviewForTextAnimationOfRangeInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @NInt long textAnimation,
            @ByValue NSRange range, @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorRequestsPreviewForTextAnimationOfRangeInContextCompletion") @NotNull Block_writingToolsCoordinatorRequestsPreviewForTextAnimationOfRangeInContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorRequestsPreviewForTextAnimationOfRangeInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorRequestsPreviewForTextAnimationOfRangeInContextCompletion(
                @Nullable UITargetedPreview arg0);
    }

    /**
     * Asks the delegate to provide the location of the character at the
     * specified point in your view’s coordinate system.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object requesting
     * information from your custom view.
     * - point: A point in your view’s coordinate space. Find the
     * location of the text under this point, if any.
     * - completion: A handler to execute with the required information.
     * This handler has no return value and takes an <doc://com.apple.documentation/documentation/foundation/nsrange>
     * and <doc://com.apple.documentation/documentation/foundation/uuid>
     * as parameters. Set the range to the character’s location in one of your
     * ``UIWritingToolsCoordinator/Context`` objects, which you specify using
     * the <doc://com.apple.documentation/documentation/foundation/uuid> parameter.
     * You must call this handler at some point during your method’s implementation.
     * 
     * When someone interacts with your view during a proofreading operation, Writing Tools
     * calls this method to get the location of the interaction. If the interaction
     * occurs in the text of one of your ``UIWritingToolsCoordinator/Context`` objects,
     * configure an <doc://com.apple.documentation/documentation/foundation/nsrange>
     * with the character’s location in that context object and a length of `1`. If
     * the interaction occurs outside of the text of your context objects, configure
     * the range with a location of `NSNotFound`.
     * 
     * When specifying the location of a character in your context object, provide a
     * location relative to the start of your context object’s text. The first character
     * in a context object’s text is always at location `0`, and it’s your responsibility
     * to track the location of the context object’s text in your text storage object.
     * When the context object’s text begins in the middle of your text storage,
     * subtract the starting location of the context object’s text from the location
     * you specify in your range value. For example, if the context object’s text
     * starts at character `100` in your text storage, and an interaction occurs
     * with the character at location `102`, specify a range with a location of
     * `2` and a length of `1`.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:requestsRangeInContextWithIdentifierForPoint:completion:")
    void writingToolsCoordinatorRequestsRangeInContextWithIdentifierForPointCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @ByValue CGPoint point,
            @ObjCBlock(name = "call_writingToolsCoordinatorRequestsRangeInContextWithIdentifierForPointCompletion") @NotNull Block_writingToolsCoordinatorRequestsRangeInContextWithIdentifierForPointCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorRequestsRangeInContextWithIdentifierForPointCompletion {
        @Generated
        void call_writingToolsCoordinatorRequestsRangeInContextWithIdentifierForPointCompletion(@ByValue NSRange range,
                @NotNull NSUUID contextID);
    }

    /**
     * NSRange
     * 
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("writingToolsCoordinator:requestsSingleContainerSubrangesOfRange:inContext:completion:")
    default void writingToolsCoordinatorRequestsSingleContainerSubrangesOfRangeInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @ByValue NSRange range,
            @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorRequestsSingleContainerSubrangesOfRangeInContextCompletion") @NotNull Block_writingToolsCoordinatorRequestsSingleContainerSubrangesOfRangeInContextCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorRequestsSingleContainerSubrangesOfRangeInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorRequestsSingleContainerSubrangesOfRangeInContextCompletion(
                @NotNull NSArray<? extends NSValue> arg0);
    }

    /**
     * Asks the delegate to provide an underline shape for the specified text
     * during a proofreading session.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object requesting information
     * from your custom view.
     * - range: The range of text to evaluate. This range is relative to the
     * text in your context object, and it’s your responsibility to match that
     * location to the correct location in your text storage. If you initialized
     * the context object with the entire contents of your view’s text storage,
     * you can use `range` as-is to access that text storage. However, if you
     * initialized the context object with only a portion of your view’s text,
     * add the starting location of your context object’s text to this value
     * to get the correct range for that text storage.
     * - context: The context object with the target text. Use this object to
     * find the text in your view’s text storage.
     * - completion: A handler to execute with the required information. The
     * handler has no return value and takes an array of Bezier paths as a
     * parameter. You must call this handler at some point during your method’s implementation.
     * 
     * When applying proofreading marks to your view’s content, the coordinator
     * calls this method to retrieve a shape to draw under the specified text.
     * You provide the shape using one or more Bezier paths, and the coordinator
     * draws and animates that shape during the proofreading session.
     * 
     * After you determine the location of the specified range of text in your
     * view’s text storage, find the rectangle around that text. If you're using
     * TextKit, you can call the
     * <doc://com.apple.documentation/documentation/uikit/nstextlayoutmanager/3809995-enumeratetextsegments>
     * method of your view’s <doc://com.apple.documentation/documentation/uikit/nstextlayoutmanager>
     * to get the rectangles for a range of text. Convert the coordinates of each rectangle
     * to the coordinate space of the view in your coordinator's ``UIWritingToolsCoordinator/decorationContainerView``
     * property. Use those rectangles to create the Bezier paths for your text.
     * For example, you might create a path with a straight or wavy line at the
     * bottom of the rectangle.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:requestsUnderlinePathsForRange:inContext:completion:")
    void writingToolsCoordinatorRequestsUnderlinePathsForRangeInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @ByValue NSRange range,
            @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorRequestsUnderlinePathsForRangeInContextCompletion") @NotNull Block_writingToolsCoordinatorRequestsUnderlinePathsForRangeInContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorRequestsUnderlinePathsForRangeInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorRequestsUnderlinePathsForRangeInContextCompletion(
                @NotNull NSArray<? extends UIBezierPath> arg0);
    }

    /**
     * NSRange
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("writingToolsCoordinator:selectRanges:inContext:completion:")
    void writingToolsCoordinatorSelectRangesInContextCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @NotNull NSArray<? extends NSValue> ranges,
            @NotNull UIWritingToolsCoordinatorContext context,
            @ObjCBlock(name = "call_writingToolsCoordinatorSelectRangesInContextCompletion") @NotNull Block_writingToolsCoordinatorSelectRangesInContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorSelectRangesInContextCompletion {
        @Generated
        void call_writingToolsCoordinatorSelectRangesInContextCompletion();
    }

    /**
     * Notifies your delegate of relevant state changes when Writing Tools
     * is running in your view.
     * 
     * - Parameters:
     * - writingToolsCoordinator: The coordinator object providing
     * information to your custom view.
     * - state: The new state for the Writing Tools session. For information
     * about the possible states, see ``UIWritingToolsCoordinator/State``.
     * - text: The current text for your context object.
     * - reason: The reason for the state change.
     * - context: The context object that contains the original text for
     * Writing Tools to evaluate.
     * - completion: A handler to execute when your delegate finishes processing
     * the change of state. The handler has no parameters or return value. You
     * must call this handler at some point during the implementation of your method.
     * 
     * Use state transitions to perform actions related to your view or text storage.
     * When Writing Tools is active, it updates its state to indicate what task
     * it’s currently performing. Writing Tools starts in the ``UIWritingToolsCoordinator/State/inactive``
     * state and moves to other states as it presents UI and starts interacting with
     * your view’s content. For example, it moves to the ``UIWritingToolsCoordinator/State/interactiveStreaming``
     * state when it’s making changes to your view’s text storage.
     * 
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("writingToolsCoordinator:willChangeToState:completion:")
    default void writingToolsCoordinatorWillChangeToStateCompletion(
            @NotNull UIWritingToolsCoordinator writingToolsCoordinator, @NInt long newState,
            @ObjCBlock(name = "call_writingToolsCoordinatorWillChangeToStateCompletion") @NotNull Block_writingToolsCoordinatorWillChangeToStateCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writingToolsCoordinatorWillChangeToStateCompletion {
        @Generated
        void call_writingToolsCoordinatorWillChangeToStateCompletion();
    }
}