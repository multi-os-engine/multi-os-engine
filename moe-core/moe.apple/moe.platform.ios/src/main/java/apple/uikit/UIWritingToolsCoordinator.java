package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.UIInteraction;
import apple.uikit.protocol.UIWritingToolsCoordinatorDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object that manages interactions between Writing Tools and
 * your custom text view.
 * 
 * Add a `UIWritingToolsCoordinator` object to a custom view when you
 * want to add Writing Tools support to that view. The coordinator manages
 * interactions between your view and the Writing Tools UI and back-end
 * capabilities. When creating a coordinator, you supply a delegate object
 * to respond to requests from the system and provide needed information.
 * Your delegate delivers your view’s text to Writing Tools, incorporates
 * suggested changes back into your text storage, and supports the animations
 * that Writing Tools creates to show the state of an operation.
 * 
 * Create the `UIWritingToolsCoordinator` object when setting up your UI, and
 * initialize it with a custom object that adopts the ``UIWritingToolsCoordinator/Delegate``
 * protocol. Add the coordinator to your view using the ``UIView/addInteraction(_:)``
 * method. When a coordinator is present on a view, the system adds UI elements
 * to initiate Writing Tools operations.
 * 
 * When defining the delegate, choose an object from your app that has access
 * to your view and its text storage. You can adopt the ``UIWritingToolsCoordinator/Delegate``
 * protocol in the view itself, or in another type that your view uses to
 * manage content. During the interactions with Writing Tools, the delegate
 * gets and sets the contents of the view’s text storage and supports Writing Tools behaviors.
 * 
 * > Note: You don’t need to create an `UIWritingToolsCoordinator` object
 * if you display text using a ``UITextView``,
 * <doc://com.apple.documentation/documentation/appkit/nstextview>,
 * <doc://com.apple.documentation/documentation/swiftui/text>,
 * <doc://com.apple.documentation/documentation/swiftui/textfield>, or
 * <doc://com.apple.documentation/documentation/swiftui/texteditor> view.
 * Those views already include the required support to handle Writing Tools
 * interactions.
 * 
 * API-Since: 18.2
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIWritingToolsCoordinator extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIWritingToolsCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIWritingToolsCoordinator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIWritingToolsCoordinator allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Returns None, Limited, or Complete after considering system information along with the value of
     * preferredBehavior.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("behavior")
    @NInt
    public native long behavior();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The view that Writing Tools uses to display background decorations
     * such as proofreading marks.
     * 
     * Writing Tools uses the view in this property to host proofreading marks
     * and other visual elements that show any suggested changes. Set this
     * property to a subview situated visibly below the text in your custom
     * text view. It's also satisfactory to place this view visually in front
     * of the text. Make sure the size of the view is big enough to
     * cover all of the affected text. If you don’t assign a value to
     * this property, the coordinator uses the object in its ``UIInteraction/view``
     * property to host any visual elements.
     * 
     * If you display your view’s text using multiple text containers, implement the
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsSingleContainerSubrangesOf:in:completion:)``
     * and
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsDecorationContainerViewFor:in:completion:)``
     * methods to provide separate decoration views for each container.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("decorationContainerView")
    @Nullable
    public native UIView decorationContainerView();

    /**
     * The object that handles Writing Tools interactions for your view.
     * 
     * Specify this object at initialization time when creating your `UIWritingToolsCoordinator`
     * object. The object must adopt the ``UIWritingToolsCoordinator/Delegate``
     * protocol, and be capable of modifying your view’s text storage and
     * refreshing the view’s layout and appearance.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native UIWritingToolsCoordinatorDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    /**
     * The view that Writing Tools uses to display visual effects during
     * the text-rewriting process.
     * 
     * Writing Tools uses the view in this property to host the visual effects
     * it creates when making interactive changes to your view’s content.
     * These visual effects let people know the state of the text and provide
     * feedback about what’s happening to it. Set this property to a subview
     * that sits visually above, and covers, all of the text in your custom
     * text view. If you don’t assign a value to this property, the coordinator
     * uses the object in its ``UIInteraction/view`` property to host any visual effects.
     * 
     * If you display your view’s text using multiple text containers, implement the
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsSingleContainerSubrangesOf:in:completion:)``
     * method to request multiple previews.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("effectContainerView")
    @Nullable
    public native UIView effectContainerView();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIWritingToolsCoordinator init();

    /**
     * Creates a writing tools coordinator and assigns the specified
     * delegate object to it.
     * 
     * - Parameters:
     * - delegate: An object capable of handling Writing Tools interactions
     * for your view. The delegate must be able to modify your view’s text
     * storage and refresh the view’s layout and appearance.
     * 
     * Create the coordinator object during your view’s initialization, and assign
     * the object to your view. Use the ``UIView/addInteraction(_:)``
     * method to add the object to your view.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("initWithDelegate:")
    public native UIWritingToolsCoordinator initWithDelegate(
            @Mapped(ObjCObjectMapper.class) @Nullable UIWritingToolsCoordinatorDelegate delegate);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * A Boolean value that indicates whether Writing Tools features are
     * currently available.
     * 
     * The value of this property is `true` when Writing Tools features are
     * available, and `false` when they aren’t. Writing Tools support might
     * be unavailable because of device constraints or because the system isn’t
     * ready to process Writing Tools requests.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("isWritingToolsAvailable")
    public static native boolean isWritingToolsAvailable();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIWritingToolsCoordinator new_objc();

    /**
     * Defaults to "Default"
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("preferredBehavior")
    @NInt
    public native long preferredBehavior();

    /**
     * Defaults to "Default"
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("preferredResultOptions")
    @NUInt
    public native long preferredResultOptions();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns a nonzero value after considering system information along with the value of preferredResultOptions
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("resultOptions")
    @NUInt
    public native long resultOptions();

    /**
     * The view that Writing Tools uses to display background decorations
     * such as proofreading marks.
     * 
     * Writing Tools uses the view in this property to host proofreading marks
     * and other visual elements that show any suggested changes. Set this
     * property to a subview situated visibly below the text in your custom
     * text view. It's also satisfactory to place this view visually in front
     * of the text. Make sure the size of the view is big enough to
     * cover all of the affected text. If you don’t assign a value to
     * this property, the coordinator uses the object in its ``UIInteraction/view``
     * property to host any visual elements.
     * 
     * If you display your view’s text using multiple text containers, implement the
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsSingleContainerSubrangesOf:in:completion:)``
     * and
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsDecorationContainerViewFor:in:completion:)``
     * methods to provide separate decoration views for each container.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setDecorationContainerView:")
    public native void setDecorationContainerView_unsafe(@Nullable UIView value);

    /**
     * The view that Writing Tools uses to display background decorations
     * such as proofreading marks.
     * 
     * Writing Tools uses the view in this property to host proofreading marks
     * and other visual elements that show any suggested changes. Set this
     * property to a subview situated visibly below the text in your custom
     * text view. It's also satisfactory to place this view visually in front
     * of the text. Make sure the size of the view is big enough to
     * cover all of the affected text. If you don’t assign a value to
     * this property, the coordinator uses the object in its ``UIInteraction/view``
     * property to host any visual elements.
     * 
     * If you display your view’s text using multiple text containers, implement the
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsSingleContainerSubrangesOf:in:completion:)``
     * and
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsDecorationContainerViewFor:in:completion:)``
     * methods to provide separate decoration views for each container.
     * 
     * API-Since: 18.2
     */
    @Generated
    public void setDecorationContainerView(@Nullable UIView value) {
        Object __old = decorationContainerView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDecorationContainerView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The view that Writing Tools uses to display visual effects during
     * the text-rewriting process.
     * 
     * Writing Tools uses the view in this property to host the visual effects
     * it creates when making interactive changes to your view’s content.
     * These visual effects let people know the state of the text and provide
     * feedback about what’s happening to it. Set this property to a subview
     * that sits visually above, and covers, all of the text in your custom
     * text view. If you don’t assign a value to this property, the coordinator
     * uses the object in its ``UIInteraction/view`` property to host any visual effects.
     * 
     * If you display your view’s text using multiple text containers, implement the
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsSingleContainerSubrangesOf:in:completion:)``
     * method to request multiple previews.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setEffectContainerView:")
    public native void setEffectContainerView_unsafe(@Nullable UIView value);

    /**
     * The view that Writing Tools uses to display visual effects during
     * the text-rewriting process.
     * 
     * Writing Tools uses the view in this property to host the visual effects
     * it creates when making interactive changes to your view’s content.
     * These visual effects let people know the state of the text and provide
     * feedback about what’s happening to it. Set this property to a subview
     * that sits visually above, and covers, all of the text in your custom
     * text view. If you don’t assign a value to this property, the coordinator
     * uses the object in its ``UIInteraction/view`` property to host any visual effects.
     * 
     * If you display your view’s text using multiple text containers, implement the
     * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsSingleContainerSubrangesOf:in:completion:)``
     * method to request multiple previews.
     * 
     * API-Since: 18.2
     */
    @Generated
    public void setEffectContainerView(@Nullable UIView value) {
        Object __old = effectContainerView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setEffectContainerView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Defaults to "Default"
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setPreferredBehavior:")
    public native void setPreferredBehavior(@NInt long value);

    /**
     * Defaults to "Default"
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setPreferredResultOptions:")
    public native void setPreferredResultOptions(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Values: Inactive, Noninteractive, InteractiveResting, InteractiveStreaming
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * Stops the current Writing Tools operation and dismisses the system UI.
     * 
     * Call this method to abort the current Writing Tools operation. This
     * method dismisses the system’s Writing Tools UI and stops any in-flight
     * interactions with your view. This method does not undo any changes that
     * Writing Tools already made to your view’s content.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("stopWritingTools")
    public native void stopWritingTools();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Informs the coordinator that a change occurred to the view or its text
     * that requires a layout update.
     * 
     * - Parameters:
     * - contextID: The unique identifier of the context object affected
     * by the change. Pass the identifier for the context object that comes
     * after the changes.
     * 
     * Use this method to inform Writing Tools when the geometry of your view
     * changes, or when the text that precedes one of your context objects changes.
     * Changes to the view’s geometry or text can affect the flow of any remaining
     * text, and require a layout update. Writing Tools uses this method to
     * refresh any layout-dependent information it’s currently tracking. For
     * example, it uses it to refresh the location of proofreading marks it’s
     * displaying in your view.
     * 
     * If a text change affects the text inside a context object, call the
     * ``updateRange(_:with:reason:forContextWithIdentifier:)`` method to report
     * that change instead.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("updateForReflowedTextInContextWithIdentifier:")
    public native void updateForReflowedTextInContextWithIdentifier(@NotNull NSUUID contextID);

    /**
     * Informs the coordinator about changes your app made to the text
     * in the specified context object.
     * 
     * - Parameters:
     * - range: The range of text to replace. This range is relative to
     * the starting location of the specified context object’s text in
     * your view’s text storage. If you initialized the context object
     * with the entire contents of your view’s text storage, specify the
     * range of text you’re replacing in your text storage. However, if
     * you initialized the context object with only a portion of your
     * view’s text, specify a range that is relative to the starting
     * location of the context object’s text.
     * - replacementText: The text that replaces the previous content in
     * `range`. Specify an empty string to delete the text in the specified range.
     * - reason: The reason you updated the text.
     * - contextID: The unique identifier of the context object that
     * contains the text you modified.
     * 
     * If you make any changes to the text Writing Tools is evaluating, call
     * this method to report those changes to your view’s coordinator object.
     * You might make changes in response to an undo command or when someone
     * types into the same part of your view’s text. Calling this method
     * keeps the coordinator object informed of any changes, and ensures
     * it delivers accurate information to its delegate. In response, the
     * coordinator refreshes previews and other information related to your
     * view. If the scope of the update is significantly large, the coordinator
     * can optionally cancel the Writing Tools session altogether.
     * 
     * Use this method to report changes that precisely intersect your context
     * object’s text. The first time you call this method for a context object,
     * report changes only to the original attributed string in that object.
     * If you call this method more than once, report changes to the newly
     * modified version of that string. Don’t use this method to report changes
     * to text that comes before or after the context object. If you make
     * changes before your context object, report those changes separately using the
     * ``UIWritingToolsCoordinator/updateForReflowedTextInContextWithIdentifier(_:)`` method.
     * 
     * > Warning: Failure to call this method for a change can cause Writing Tools
     * to deliver inaccurate information to your delegate and lead to data loss.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("updateRange:withText:reason:forContextWithIdentifier:")
    public native void updateRangeWithTextReasonForContextWithIdentifier(@ByValue NSRange range,
            @NotNull NSAttributedString replacementText, @NInt long reason, @NotNull NSUUID contextID);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("view")
    @Nullable
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(@Nullable UIView view);

    /**
     * When YES, the Writing Tools subsystem interprets and generates the text list paragraph incorporating the text
     * list marker string. By default, it employs ``NSTextList.includesTextListMarkers`` as the value.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("includesTextListMarkers")
    public native boolean includesTextListMarkers();

    /**
     * When YES, the Writing Tools subsystem interprets and generates the text list paragraph incorporating the text
     * list marker string. By default, it employs ``NSTextList.includesTextListMarkers`` as the value.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIncludesTextListMarkers:")
    public native void setIncludesTextListMarkers(boolean value);
}