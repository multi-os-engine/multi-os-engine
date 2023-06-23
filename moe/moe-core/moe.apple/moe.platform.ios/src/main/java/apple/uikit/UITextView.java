/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSItemProvider;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIContentSizeCategoryAdjusting;
import apple.uikit.protocol.UITextDragDelegate;
import apple.uikit.protocol.UITextDraggable;
import apple.uikit.protocol.UITextDropDelegate;
import apple.uikit.protocol.UITextDroppable;
import apple.uikit.protocol.UITextInput;
import apple.uikit.protocol.UITextInputDelegate;
import apple.uikit.protocol.UITextInputTokenizer;
import apple.uikit.protocol.UITextPasteConfigurationSupporting;
import apple.uikit.protocol.UITextPasteDelegate;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.uikit.protocol.UIEditMenuInteractionAnimating;
import apple.uikit.protocol.UIFindInteractionDelegate;
import apple.uikit.protocol.UITextSearchAggregator;
import apple.uikit.protocol.UITextSearching;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextView extends UIScrollView implements UITextInput, UIContentSizeCategoryAdjusting, UITextDraggable,
        UITextDroppable, UITextPasteConfigurationSupporting, UIFindInteractionDelegate, UITextSearching {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextView(Pointer peer) {
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
    public static native UITextView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITextView allocWithZone(VoidPtr zone);

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
    public static native UITextView appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UITextView appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UITextView appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UITextView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UITextView appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UITextView appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    @Owned
    @Selector("new")
    public static native UITextView new_objc();

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

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

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
    @Selector("adjustsFontForContentSizeCategory")
    public native boolean adjustsFontForContentSizeCategory();

    /**
     * defaults to NO
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("allowsEditingTextAttributes")
    public native boolean allowsEditingTextAttributes();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UITextView _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UITextView _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UITextView _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UITextView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UITextView _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UITextView _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("attributedText")
    public native NSAttributedString attributedText();

    @Generated
    @IsOptional
    @Selector("autocapitalizationType")
    @NInt
    public native long autocapitalizationType();

    @Generated
    @IsOptional
    @Selector("autocorrectionType")
    @NInt
    public native long autocorrectionType();

    @Generated
    @Selector("baseWritingDirectionForPosition:inDirection:")
    @NInt
    public native long baseWritingDirectionForPositionInDirection(@NotNull UITextPosition position,
            @NInt long direction);

    @Generated
    @IsOptional
    @Selector("beginFloatingCursorAtPoint:")
    public native void beginFloatingCursorAtPoint(@ByValue CGPoint point);

    @NotNull
    @Generated
    @Selector("beginningOfDocument")
    public native UITextPosition beginningOfDocument();

    @Generated
    @Selector("caretRectForPosition:")
    @ByValue
    public native CGRect caretRectForPosition(@NotNull UITextPosition position);

    @Generated
    @IsOptional
    @Selector("characterOffsetOfPosition:withinRange:")
    @NInt
    public native long characterOffsetOfPositionWithinRange(@NotNull UITextPosition position,
            @NotNull UITextRange range);

    @Nullable
    @Generated
    @Selector("characterRangeAtPoint:")
    public native UITextRange characterRangeAtPoint(@ByValue CGPoint point);

    @Nullable
    @Generated
    @Selector("characterRangeByExtendingPosition:inDirection:")
    public native UITextRange characterRangeByExtendingPositionInDirection(@NotNull UITextPosition position,
            @NInt long direction);

    /**
     * defaults to NO. if YES, the selection UI is hidden, and inserting text will replace the contents of the field.
     * changing the selection will automatically set this to NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("clearsOnInsertion")
    public native boolean clearsOnInsertion();

    @Nullable
    @Generated
    @Selector("closestPositionToPoint:")
    public native UITextPosition closestPositionToPoint(@ByValue CGPoint point);

    @Nullable
    @Generated
    @Selector("closestPositionToPoint:withinRange:")
    public native UITextPosition closestPositionToPointWithinRange(@ByValue CGPoint point, @NotNull UITextRange range);

    @Generated
    @Selector("comparePosition:toPosition:")
    @NInt
    public native long comparePositionToPosition(@NotNull UITextPosition position, @NotNull UITextPosition other);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("dataDetectorTypes")
    @NUInt
    public native long dataDetectorTypes();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("deleteBackward")
    public native void deleteBackward();

    @Generated
    @IsOptional
    @Selector("dictationRecognitionFailed")
    public native void dictationRecognitionFailed();

    @Generated
    @IsOptional
    @Selector("dictationRecordingDidEnd")
    public native void dictationRecordingDidEnd();

    @Generated
    @IsOptional
    @Selector("enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();

    @Generated
    @IsOptional
    @Selector("endFloatingCursor")
    public native void endFloatingCursor();

    @NotNull
    @Generated
    @Selector("endOfDocument")
    public native UITextPosition endOfDocument();

    @Generated
    @Selector("firstRectForRange:")
    @ByValue
    public native CGRect firstRectForRange(@NotNull UITextRange range);

    @Nullable
    @Generated
    @Selector("font")
    public native UIFont font();

    @Generated
    @IsOptional
    @Selector("frameForDictationResultPlaceholder:")
    @ByValue
    public native CGRect frameForDictationResultPlaceholder(
            @NotNull @Mapped(ObjCObjectMapper.class) Object placeholder);

    @Generated
    @Selector("hasText")
    public native boolean hasText();

    @Generated
    @Selector("init")
    public native UITextView init();

    @Generated
    @Selector("initWithCoder:")
    public native UITextView initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UITextView initWithFrame(@ByValue CGRect frame);

    /**
     * Create a new text view with the specified text container (can be nil).
     * This initializer will follow the NSTextContainer's usage of TextKit 2 (NSTextLayoutManager) or TextKit 1
     * (NSLayoutManager).
     * If a nil NSTextContainer is specified, TextKit 2 will be used.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("initWithFrame:textContainer:")
    public native UITextView initWithFrameTextContainer(@ByValue CGRect frame, @Nullable NSTextContainer textContainer);

    @Nullable
    @Generated
    @Selector("inputAccessoryView")
    public native UIView inputAccessoryView();

    @Nullable
    @Generated
    @Selector("inputDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITextInputDelegate inputDelegate();

    /**
     * Presented when object becomes first responder. If set to nil, reverts to following responder chain. If
     * set while first responder, will not take effect until reloadInputViews is called.
     */
    @Nullable
    @Generated
    @Selector("inputView")
    public native UIView inputView();

    @Generated
    @IsOptional
    @Selector("insertDictationResult:")
    public native void insertDictationResult(@NotNull NSArray<? extends UIDictationPhrase> dictationResult);

    @NotNull
    @Generated
    @IsOptional
    @Selector("insertDictationResultPlaceholder")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object insertDictationResultPlaceholder();

    @Generated
    @Selector("insertText:")
    public native void insertText(@NotNull String text);

    @Generated
    @Selector("isEditable")
    public native boolean isEditable();

    @Generated
    @Selector("setEditable:")
    public native void setEditable(boolean value);

    @Generated
    @IsOptional
    @Selector("isSecureTextEntry")
    public native boolean isSecureTextEntry();

    @Generated
    @IsOptional
    @Selector("setSecureTextEntry:")
    public native void setSecureTextEntry(boolean value);

    /**
     * toggle selectability, which controls the ability of the user to select content and interact with URLs &
     * attachments. On tvOS this also makes the text view focusable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isSelectable")
    public native boolean isSelectable();

    /**
     * toggle selectability, which controls the ability of the user to select content and interact with URLs &
     * attachments. On tvOS this also makes the text view focusable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSelectable:")
    public native void setSelectable(boolean value);

    @Generated
    @IsOptional
    @Selector("keyboardAppearance")
    @NInt
    public native long keyboardAppearance();

    @Generated
    @IsOptional
    @Selector("keyboardType")
    @NInt
    public native long keyboardType();

    /**
     * To ensure compatibility with older code, accessing the .layoutManager of a UITextView - or its .textContainer's
     * .layoutManager - will cause a UITextView that's using TextKit 2 to 'fall back' to TextKit 1, and return a newly
     * created NSLayoutManager. After this happens, .textLayoutManager will return nil - and _any TextKit 2 objects you
     * may have cached will cease functioning_. Be careful about this if you are intending to be using TextKit 2!
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("layoutManager")
    public native NSLayoutManager layoutManager();

    /**
     * Style for links
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("linkTextAttributes")
    public native NSDictionary<String, ?> linkTextAttributes();

    @Nullable
    @Generated
    @Selector("markedTextRange")
    public native UITextRange markedTextRange();

    @Nullable
    @Generated
    @Selector("markedTextStyle")
    public native NSDictionary<String, ?> markedTextStyle();

    @Generated
    @Selector("offsetFromPosition:toPosition:")
    @NInt
    public native long offsetFromPositionToPosition(@NotNull UITextPosition from, @NotNull UITextPosition toPosition);

    @Nullable
    @Generated
    @Selector("positionFromPosition:inDirection:offset:")
    public native UITextPosition positionFromPositionInDirectionOffset(@NotNull UITextPosition position,
            @NInt long direction, @NInt long offset);

    @Nullable
    @Generated
    @Selector("positionFromPosition:offset:")
    public native UITextPosition positionFromPositionOffset(@NotNull UITextPosition position, @NInt long offset);

    @Nullable
    @Generated
    @IsOptional
    @Selector("positionWithinRange:atCharacterOffset:")
    public native UITextPosition positionWithinRangeAtCharacterOffset(@NotNull UITextRange range, @NInt long offset);

    @Nullable
    @Generated
    @Selector("positionWithinRange:farthestInDirection:")
    public native UITextPosition positionWithinRangeFarthestInDirection(@NotNull UITextRange range,
            @NInt long direction);

    @Generated
    @IsOptional
    @Selector("removeDictationResultPlaceholder:willInsertResult:")
    public native void removeDictationResultPlaceholderWillInsertResult(
            @NotNull @Mapped(ObjCObjectMapper.class) Object placeholder, boolean willInsertResult);

    @Generated
    @Selector("replaceRange:withText:")
    public native void replaceRangeWithText(@NotNull UITextRange range, @NotNull String text);

    @Generated
    @IsOptional
    @Selector("returnKeyType")
    @NInt
    public native long returnKeyType();

    @Generated
    @Selector("scrollRangeToVisible:")
    public native void scrollRangeToVisible(@ByValue NSRange range);

    @Generated
    @Selector("selectedRange")
    @ByValue
    public native NSRange selectedRange();

    @Nullable
    @Generated
    @Selector("selectedTextRange")
    public native UITextRange selectedTextRange();

    @Generated
    @IsOptional
    @Selector("selectionAffinity")
    @NInt
    public native long selectionAffinity();

    @NotNull
    @Generated
    @Selector("selectionRectsForRange:")
    public native NSArray<? extends UITextSelectionRect> selectionRectsForRange(@NotNull UITextRange range);

    @Generated
    @Selector("setAdjustsFontForContentSizeCategory:")
    public native void setAdjustsFontForContentSizeCategory(boolean value);

    /**
     * defaults to NO
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAllowsEditingTextAttributes:")
    public native void setAllowsEditingTextAttributes(boolean value);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAttributedText:")
    public native void setAttributedText(NSAttributedString value);

    @Generated
    @IsOptional
    @Selector("setAutocapitalizationType:")
    public native void setAutocapitalizationType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setAutocorrectionType:")
    public native void setAutocorrectionType(@NInt long value);

    @Generated
    @Selector("setBaseWritingDirection:forRange:")
    public native void setBaseWritingDirectionForRange(@NInt long writingDirection, @NotNull UITextRange range);

    /**
     * defaults to NO. if YES, the selection UI is hidden, and inserting text will replace the contents of the field.
     * changing the selection will automatically set this to NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setClearsOnInsertion:")
    public native void setClearsOnInsertion(boolean value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setDataDetectorTypes:")
    public native void setDataDetectorTypes(@NUInt long value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @IsOptional
    @Selector("setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean value);

    @Generated
    @Selector("setFont:")
    public native void setFont(@Nullable UIFont value);

    @Generated
    @Selector("setInputAccessoryView:")
    public native void setInputAccessoryView(@Nullable UIView value);

    @Generated
    @Selector("setInputDelegate:")
    public native void setInputDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITextInputDelegate value);

    @Generated
    public void setInputDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UITextInputDelegate value) {
        Object __old = inputDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setInputDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Presented when object becomes first responder. If set to nil, reverts to following responder chain. If
     * set while first responder, will not take effect until reloadInputViews is called.
     */
    @Generated
    @Selector("setInputView:")
    public native void setInputView(@Nullable UIView value);

    @Generated
    @IsOptional
    @Selector("setKeyboardAppearance:")
    public native void setKeyboardAppearance(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setKeyboardType:")
    public native void setKeyboardType(@NInt long value);

    /**
     * Style for links
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setLinkTextAttributes:")
    public native void setLinkTextAttributes(NSDictionary<String, ?> value);

    @Generated
    @Selector("setMarkedText:selectedRange:")
    public native void setMarkedTextSelectedRange(@Nullable String markedText, @ByValue NSRange selectedRange);

    @Generated
    @Selector("setMarkedTextStyle:")
    public native void setMarkedTextStyle(@Nullable NSDictionary<String, ?> value);

    @Generated
    @IsOptional
    @Selector("setReturnKeyType:")
    public native void setReturnKeyType(@NInt long value);

    @Generated
    @Selector("setSelectedRange:")
    public native void setSelectedRange(@ByValue NSRange value);

    @Generated
    @Selector("setSelectedTextRange:")
    public native void setSelectedTextRange(@Nullable UITextRange value);

    @Generated
    @IsOptional
    @Selector("setSelectionAffinity:")
    public native void setSelectionAffinity(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setSpellCheckingType:")
    public native void setSpellCheckingType(@NInt long value);

    @Generated
    @Selector("setText:")
    public native void setText(String value);

    /**
     * default is NSLeftTextAlignment
     */
    @Generated
    @Selector("setTextAlignment:")
    public native void setTextAlignment(@NInt long value);

    @Generated
    @Selector("setTextColor:")
    public native void setTextColor(@Nullable UIColor value);

    /**
     * Inset the text container's layout area within the text view's content area
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setTextContainerInset:")
    public native void setTextContainerInset(@ByValue UIEdgeInsets value);

    @Generated
    @IsOptional
    @Selector("setTextContentType:")
    public native void setTextContentType(String value);

    /**
     * automatically resets when the selection changes
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setTypingAttributes:")
    public native void setTypingAttributes(@NotNull NSDictionary<String, ?> value);

    @Generated
    @IsOptional
    @Selector("shouldChangeTextInRange:replacementText:")
    public native boolean shouldChangeTextInRangeReplacementText(@NotNull UITextRange range, @NotNull String text);

    @Generated
    @IsOptional
    @Selector("spellCheckingType")
    @NInt
    public native long spellCheckingType();

    @Generated
    @Selector("text")
    public native String text();

    /**
     * default is NSLeftTextAlignment
     */
    @Generated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    @Nullable
    @Generated
    @Selector("textColor")
    public native UIColor textColor();

    /**
     * Get the text container for the text view
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("textContainer")
    public native NSTextContainer textContainer();

    /**
     * Inset the text container's layout area within the text view's content area
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("textContainerInset")
    @ByValue
    public native UIEdgeInsets textContainerInset();

    @Generated
    @IsOptional
    @Selector("textContentType")
    public native String textContentType();

    @Nullable
    @Generated
    @Selector("textInRange:")
    public native String textInRange(@NotNull UITextRange range);

    @NotNull
    @Generated
    @IsOptional
    @Selector("textInputView")
    public native UIView textInputView();

    @Nullable
    @Generated
    @Selector("textRangeFromPosition:toPosition:")
    public native UITextRange textRangeFromPositionToPosition(@NotNull UITextPosition fromPosition,
            @NotNull UITextPosition toPosition);

    /**
     * The textual contents of the text view.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("textStorage")
    public native NSTextStorage textStorage();

    @Nullable
    @Generated
    @IsOptional
    @Selector("textStylingAtPosition:inDirection:")
    public native NSDictionary<String, ?> textStylingAtPositionInDirection(@NotNull UITextPosition position,
            @NInt long direction);

    @NotNull
    @Generated
    @Selector("tokenizer")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITextInputTokenizer tokenizer();

    /**
     * automatically resets when the selection changes
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("typingAttributes")
    public native NSDictionary<String, ?> typingAttributes();

    @Generated
    @Selector("unmarkText")
    public native void unmarkText();

    @Generated
    @IsOptional
    @Selector("updateFloatingCursorAtPoint:")
    public native void updateFloatingCursorAtPoint(@ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("canPasteItemProviders:")
    public native boolean canPasteItemProviders(@NotNull NSArray<? extends NSItemProvider> itemProviders);

    @Generated
    @Selector("isTextDragActive")
    public native boolean isTextDragActive();

    @Generated
    @Selector("isTextDropActive")
    public native boolean isTextDropActive();

    @Nullable
    @Generated
    @Selector("pasteConfiguration")
    public native UIPasteConfiguration pasteConfiguration();

    @Nullable
    @Generated
    @Selector("pasteDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITextPasteDelegate pasteDelegate();

    @Generated
    @IsOptional
    @Selector("pasteItemProviders:")
    public native void pasteItemProviders(@NotNull NSArray<? extends NSItemProvider> itemProviders);

    @Generated
    @Selector("setPasteConfiguration:")
    public native void setPasteConfiguration(@Nullable UIPasteConfiguration value);

    @Generated
    @Selector("setPasteDelegate:")
    public native void setPasteDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITextPasteDelegate value);

    @Generated
    public void setPasteDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UITextPasteDelegate value) {
        Object __old = pasteDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPasteDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @IsOptional
    @Selector("setSmartDashesType:")
    public native void setSmartDashesType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setSmartInsertDeleteType:")
    public native void setSmartInsertDeleteType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setSmartQuotesType:")
    public native void setSmartQuotesType(@NInt long value);

    @Generated
    @Selector("setTextDragDelegate:")
    public native void setTextDragDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITextDragDelegate value);

    @Generated
    public void setTextDragDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UITextDragDelegate value) {
        Object __old = textDragDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTextDragDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setTextDragOptions:")
    public native void setTextDragOptions(@NInt long value);

    @Generated
    @Selector("setTextDropDelegate:")
    public native void setTextDropDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITextDropDelegate value);

    @Generated
    public void setTextDropDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UITextDropDelegate value) {
        Object __old = textDropDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTextDropDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @IsOptional
    @Selector("smartDashesType")
    @NInt
    public native long smartDashesType();

    @Generated
    @IsOptional
    @Selector("smartInsertDeleteType")
    @NInt
    public native long smartInsertDeleteType();

    @Generated
    @IsOptional
    @Selector("smartQuotesType")
    @NInt
    public native long smartQuotesType();

    @Nullable
    @Generated
    @Selector("textDragDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITextDragDelegate textDragDelegate();

    @Nullable
    @Generated
    @Selector("textDragInteraction")
    public native UIDragInteraction textDragInteraction();

    @Generated
    @Selector("textDragOptions")
    @NInt
    public native long textDragOptions();

    @Nullable
    @Generated
    @Selector("textDropDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITextDropDelegate textDropDelegate();

    @Nullable
    @Generated
    @Selector("textDropInteraction")
    public native UIDropInteraction textDropInteraction();

    @Generated
    @IsOptional
    @Selector("insertText:alternatives:style:")
    public native void insertTextAlternativesStyle(@NotNull String text, @NotNull NSArray<String> alternatives,
            @NInt long style);

    @NotNull
    @Generated
    @IsOptional
    @Selector("insertTextPlaceholderWithSize:")
    public native UITextPlaceholder insertTextPlaceholderWithSize(@ByValue CGSize size);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Nullable
    @Generated
    @IsOptional
    @Selector("passwordRules")
    public native UITextInputPasswordRules passwordRules();

    @Generated
    @IsOptional
    @Selector("removeTextPlaceholder:")
    public native void removeTextPlaceholder(@NotNull UITextPlaceholder textPlaceholder);

    @Generated
    @IsOptional
    @Selector("setAttributedMarkedText:selectedRange:")
    public native void setAttributedMarkedTextSelectedRange(@Nullable NSAttributedString markedText,
            @ByValue NSRange selectedRange);

    @Generated
    @IsOptional
    @Selector("setPasswordRules:")
    public native void setPasswordRules(@Nullable UITextInputPasswordRules value);

    /**
     * When turned on, this changes the rendering scale of the text to match the standard text scaling and preserves the
     * original font point sizes when the contents of the text view are copied to the pasteboard. Apps that show a lot
     * of text content, such as a text viewer or editor, should turn this on and use the standard text scaling.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setUsesStandardTextScaling:")
    public native void setUsesStandardTextScaling(boolean value);

    /**
     * When turned on, this changes the rendering scale of the text to match the standard text scaling and preserves the
     * original font point sizes when the contents of the text view are copied to the pasteboard. Apps that show a lot
     * of text content, such as a text viewer or editor, should turn this on and use the standard text scaling.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("usesStandardTextScaling")
    public native boolean usesStandardTextScaling();

    /**
     * Note that the interaction state of a UITextView does _not_ encode the
     * textual content of the field. It should be saved separately, and restored
     * _before_ the interaction state.
     * Currently, this encodes selection (and/or cursor position), scroll position,
     * and first responder status.
     * The object returned here will be a plist type, so can e.g. be stored in
     * an NSUserActivity's userInfo dictionary.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("interactionState")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object interactionState();

    /**
     * Note that the interaction state of a UITextView does _not_ encode the
     * textual content of the field. It should be saved separately, and restored
     * _before_ the interaction state.
     * Currently, this encodes selection (and/or cursor position), scroll position,
     * and first responder status.
     * The object returned here will be a plist type, so can e.g. be stored in
     * an NSUserActivity's userInfo dictionary.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setInteractionState:")
    public native void setInteractionState(@NotNull @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("clearAllDecoratedFoundText")
    public native void clearAllDecoratedFoundText();

    @Generated
    @Selector("compareFoundRange:toRange:inDocument:")
    @NInt
    public native long compareFoundRangeToRangeInDocument(@NotNull UITextRange foundRange, @NotNull UITextRange toRange,
            @Nullable @Mapped(ObjCObjectMapper.class) Object document);

    @Generated
    @IsOptional
    @Selector("compareOrderFromDocument:toDocument:")
    @NInt
    public native long compareOrderFromDocumentToDocument(@NotNull @Mapped(ObjCObjectMapper.class) Object fromDocument,
            @NotNull @Mapped(ObjCObjectMapper.class) Object toDocument);

    @Generated
    @Selector("decorateFoundTextRange:inDocument:usingStyle:")
    public native void decorateFoundTextRangeInDocumentUsingStyle(@NotNull UITextRange range,
            @Nullable @Mapped(ObjCObjectMapper.class) Object document, @NInt long style);

    @Nullable
    @Generated
    @IsOptional
    @Selector("editMenuForTextRange:suggestedActions:")
    public native UIMenu editMenuForTextRangeSuggestedActions(@NotNull UITextRange textRange,
            @NotNull NSArray<? extends UIMenuElement> suggestedActions);

    /**
     * If `findInteractionEnabled` is set to true, returns this text view's built-in find interaction. Otherwise, nil.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("findInteraction")
    public native UIFindInteraction findInteraction();

    @Generated
    @IsOptional
    @Selector("findInteraction:didBeginFindSession:")
    public native void findInteractionDidBeginFindSession(@NotNull UIFindInteraction interaction,
            @NotNull UIFindSession session);

    @Generated
    @IsOptional
    @Selector("findInteraction:didEndFindSession:")
    public native void findInteractionDidEndFindSession(@NotNull UIFindInteraction interaction,
            @NotNull UIFindSession session);

    @Nullable
    @Generated
    @Selector("findInteraction:sessionForView:")
    public native UIFindSession findInteractionSessionForView(@NotNull UIFindInteraction interaction,
            @NotNull UIView view);

    /**
     * Enables this text view's built-in find interaction.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isFindInteractionEnabled")
    public native boolean isFindInteractionEnabled();

    @Generated
    @Selector("performTextSearchWithQueryString:usingOptions:resultAggregator:")
    public native void performTextSearchWithQueryStringUsingOptionsResultAggregator(@NotNull String string,
            @NotNull UITextSearchOptions options,
            @NotNull @Mapped(ObjCObjectMapper.class) UITextSearchAggregator aggregator);

    @Generated
    @IsOptional
    @Selector("replaceAllOccurrencesOfQueryString:usingOptions:withText:")
    public native void replaceAllOccurrencesOfQueryStringUsingOptionsWithText(@NotNull String queryString,
            @NotNull UITextSearchOptions options, @NotNull String replacementText);

    @Generated
    @IsOptional
    @Selector("replaceFoundTextInRange:inDocument:withText:")
    public native void replaceFoundTextInRangeInDocumentWithText(@NotNull UITextRange range,
            @Nullable @Mapped(ObjCObjectMapper.class) Object document, @NotNull String replacementText);

    @Generated
    @IsOptional
    @Selector("scrollRangeToVisible:inDocument:")
    public native void scrollRangeToVisibleInDocument(@NotNull UITextRange range,
            @Nullable @Mapped(ObjCObjectMapper.class) Object document);

    @Nullable
    @Generated
    @IsOptional
    @Selector("selectedTextSearchDocument")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object selectedTextSearchDocument();

    /**
     * Enables this text view's built-in find interaction.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setFindInteractionEnabled:")
    public native void setFindInteractionEnabled(boolean value);

    @Generated
    @IsOptional
    @Selector("shouldReplaceFoundTextInRange:inDocument:withText:")
    public native boolean shouldReplaceFoundTextInRangeInDocumentWithText(@NotNull UITextRange range,
            @Nullable @Mapped(ObjCObjectMapper.class) Object document, @NotNull String replacementText);

    @Generated
    @IsOptional
    @Selector("supportsTextReplacement")
    public native boolean supportsTextReplacement();

    /**
     * This property accesses the TextKit 2 NSTextLayoutManager. You should generally prefer to use it over the TextKit
     * 1 .layoutManager property if it exists. This property will return nil if TextKit 1 is in use.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("textLayoutManager")
    public native NSTextLayoutManager textLayoutManager();

    /**
     * From iOS 16 onwards, UITextViews are, by default, created with a TextKit 2 NSTextLayoutManager managing text
     * layout (see the .textLayoutManager property). They will dynamically 'fall back' to a TextKit 1 NSLayoutManager if
     * TextKit 1 features are used (notably, if the .layoutManager property is accessed).
     * This convenience initializer can be used to specify TextKit 1 by default if you know code in your app relies on
     * that. This avoids inefficiencies associated with the needless creation of a NSTextLayoutManager and the
     * subsequent fallback.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("textViewUsingTextLayoutManager:")
    public static native UITextView textViewUsingTextLayoutManager(boolean usingTextLayoutManager);

    @Generated
    @IsOptional
    @Selector("willDismissEditMenuWithAnimator:")
    public native void willDismissEditMenuWithAnimator(
            @NotNull @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator);

    @Generated
    @IsOptional
    @Selector("willHighlightFoundTextRange:inDocument:")
    public native void willHighlightFoundTextRangeInDocument(@NotNull UITextRange range,
            @Nullable @Mapped(ObjCObjectMapper.class) Object document);

    @Generated
    @IsOptional
    @Selector("willPresentEditMenuWithAnimator:")
    public native void willPresentEditMenuWithAnimator(
            @NotNull @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator);
}
