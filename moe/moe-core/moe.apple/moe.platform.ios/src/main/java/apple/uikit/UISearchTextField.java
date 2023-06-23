package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIAppearanceContainer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * UISearchTextField is the subclass of UITextField used in UISearchBar, and can also be used elsewhere (e.g. as the
 * titleView of a UINavigationItem).
 * 
 * In addition to its text, a UISearchField can contain tokens. Tokens are discrete representations of non-textual
 * content. Your app might use tokens to represent filters that are being applied in conjunction with the search field’s
 * text. Tokens are always created by the application, and always occur contiguously before the search field’s text.
 * 
 * [@note]
 * Because the system drives selection and keyboard behaviors through the UITextInput protocol, and UISearchTextField
 * supports selecting tokens, UISearchTextField assigns UITextPositions to tokens as well as text. If the current
 * selection includes any tokens, their positions are part of the range returned by
 * `UISearchTextField.selectedTextRange`. Use the `textualRange` property to obtain the range of the text field that
 * excludes any tokens.
 * 
 * Tokens can be programmatically selected by including their position in a range assigned to the `selectedTextRange`
 * property. UISearchTextField does not support placing an insertion point before a token; attempting to do so will
 * select the token instead.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISearchTextField extends UITextField {
    static {
        NatJ.register();
    }

    @Generated
    protected UISearchTextField(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @NotNull @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISearchTextField alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISearchTextField allocWithZone(VoidPtr zone);

    /**
     * Whether the user can copy tokens to the pasteboard or drag them out of the text field.
     * 
     * To support copying tokens, this property must be true and the delegate must provide an item provider for the
     * tokens to be copied. UISearchTextField always enables the Copy command if any plain text is selected, even if the
     * selection also includes tokens and this property is false. Defaults to true.
     */
    @Generated
    @Selector("allowsCopyingTokens")
    public native boolean allowsCopyingTokens();

    /**
     * Whether the user can remove tokens through standard actions such as Delete and Cut.
     * 
     * The application can always remove tokens programmatically. If this property is true, the application must be
     * prepared not only for tokens to be removed, but also to be re-added through Undo. Defaults to true.
     */
    @Generated
    @Selector("allowsDeletingTokens")
    public native boolean allowsDeletingTokens();

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native UISearchTextField appearance();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UISearchTextField _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UISearchTextField appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UISearchTextField _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UISearchTextField appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UISearchTextField _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UISearchTextField appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UISearchTextField _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UISearchTextField appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UISearchTextField _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UISearchTextField appearanceWhenContainedInInstancesOfClasses(
            @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UISearchTextField _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(@Nullable String animationID, @Nullable VoidPtr context);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Deprecated
    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

    @Generated
    @Selector("init")
    public native UISearchTextField init();

    @Generated
    @Selector("initWithCoder:")
    public native UISearchTextField initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UISearchTextField initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("insertToken:atIndex:")
    public native void insertTokenAtIndex(@NotNull UISearchToken token, @NInt long tokenIndex);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @Owned
    @Selector("new")
    public static native UISearchTextField new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            @NotNull NSArray<? extends UIView> views, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @NotNull @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    /**
     * Returns the position of the provided token. To select a token, assign a UITextRange containing its position to
     * the selectedTextRange property.
     */
    @NotNull
    @Generated
    @Selector("positionOfTokenAtIndex:")
    public native UITextPosition positionOfTokenAtIndex(@NInt long tokenIndex);

    @Generated
    @Selector("removeTokenAtIndex:")
    public native void removeTokenAtIndex(@NInt long tokenIndex);

    /**
     * Removes any text contained in the specified range, inserts the provided token at the specified index, and selects
     * the newly-inserted token. Does not replace any tokens within the provided range. If the range intersects the
     * marked text range, the marked text is committed.
     * 
     * This method is essentially a convenience wrapper around the more fundamental `text`, `tokens`, and
     * `selectedTextRange` properties, providing the selection behavior the user will expect.
     * 
     * [@note]
     * Because this method does not remove any tokens in the provided range, the caller can pass the field’s
     * selectedTextRange to convert the selected portion of the text into a token without first having to trim the
     * range.
     */
    @Generated
    @Selector("replaceTextualPortionOfRange:withToken:atIndex:")
    public native void replaceTextualPortionOfRangeWithTokenAtIndex(@NotNull UITextRange textRange,
            @NotNull UISearchToken token, @NUInt long tokenIndex);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Whether the user can copy tokens to the pasteboard or drag them out of the text field.
     * 
     * To support copying tokens, this property must be true and the delegate must provide an item provider for the
     * tokens to be copied. UISearchTextField always enables the Copy command if any plain text is selected, even if the
     * selection also includes tokens and this property is false. Defaults to true.
     */
    @Generated
    @Selector("setAllowsCopyingTokens:")
    public native void setAllowsCopyingTokens(boolean value);

    /**
     * Whether the user can remove tokens through standard actions such as Delete and Cut.
     * 
     * The application can always remove tokens programmatically. If this property is true, the application must be
     * prepared not only for tokens to be removed, but also to be re-added through Undo. Defaults to true.
     */
    @Generated
    @Selector("setAllowsDeletingTokens:")
    public native void setAllowsDeletingTokens(boolean value);

    @Deprecated
    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Deprecated
    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Deprecated
    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Deprecated
    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(@Nullable SEL selector);

    @Deprecated
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Deprecated
    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(@NotNull NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, @NotNull UIView view,
            boolean cache);

    @Deprecated
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(@Nullable SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    /**
     * Set this to nil for tokens to use their default color.
     */
    @Generated
    @Selector("setTokenBackgroundColor:")
    public native void setTokenBackgroundColor(UIColor value);

    /**
     * Simple access to the collection of tokens.
     */
    @Generated
    @Selector("setTokens:")
    public native void setTokens(@NotNull NSArray<? extends UISearchToken> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The range that corresponds to the field’s text, exclusive of any tokens.
     * 
     * @see -[<UITextInput> positionWithinRange:atCharacterOffset:]
     */
    @NotNull
    @Generated
    @Selector("textualRange")
    public native UITextRange textualRange();

    /**
     * Set this to nil for tokens to use their default color.
     */
    @Generated
    @Selector("tokenBackgroundColor")
    public native UIColor tokenBackgroundColor();

    /**
     * Simple access to the collection of tokens.
     */
    @NotNull
    @Generated
    @Selector("tokens")
    public native NSArray<? extends UISearchToken> tokens();

    /**
     * Returns the tokens which are contained within the provided range.
     * 
     * You can use this method to determine which tokens are included in the user’s current selection. The range may
     * span more than one token or a mixture of tokens and text.
     */
    @NotNull
    @Generated
    @Selector("tokensInRange:")
    public native NSArray<? extends UISearchToken> tokensInRange(@NotNull UITextRange textRange);

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(@NotNull UIView fromView,
            @NotNull UIView toView, double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(@NotNull UIView view,
            double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("initWithFrame:primaryAction:")
    public native UISearchTextField initWithFramePrimaryAction(@ByValue CGRect frame, @Nullable UIAction primaryAction);

    /**
     * An array of suggestions that will be presented as a menu beneath the search field when nonempty.
     * Set to nil or @[] to dismiss the menu.
     * The menu will also dismiss and the property will be set to nil when a suggestion is selected.
     * The delegate is expected to execute any necessary updating when a suggestion is selected.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("searchSuggestions")
    public native NSArray<?> searchSuggestions();

    /**
     * An array of suggestions that will be presented as a menu beneath the search field when nonempty.
     * Set to nil or @[] to dismiss the menu.
     * The menu will also dismiss and the property will be set to nil when a suggestion is selected.
     * The delegate is expected to execute any necessary updating when a suggestion is selected.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSearchSuggestions:")
    public native void setSearchSuggestions(@Nullable NSArray<?> value);
}
