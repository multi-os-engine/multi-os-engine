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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIContentConfiguration;
import apple.uikit.protocol.UIGestureRecognizerDelegate;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableViewCell extends UIView implements NSCoding, UIGestureRecognizerDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableViewCell(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITableViewCell alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UITableViewCell allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    public static native UITableViewCell appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UITableViewCell appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UITableViewCell appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UITableViewCell appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UITableViewCell appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UITableViewCell appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UITableViewCell new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

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
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

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

    /**
     * action to call on accessory view clicked. set by UITableView
     */
    @Generated
    @Deprecated
    @Selector("accessoryAction")
    public native SEL accessoryAction();

    /**
     * default is UITableViewCellAccessoryNone. use to set standard type
     */
    @Generated
    @Selector("accessoryType")
    @NInt
    public native long accessoryType();

    /**
     * if set, use custom view. ignore accessoryType. tracks if enabled can calls accessory action
     */
    @Generated
    @Selector("accessoryView")
    public native UIView accessoryView();

    @Generated
    @ProtocolClassMethod("appearance")
    public UITableViewCell _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UITableViewCell _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UITableViewCell _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UITableViewCell _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UITableViewCell _appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UITableViewCell _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * Always nil when a non-nil `backgroundConfiguration` is set. The 'backgroundView' will be added as a subview behind all other views.
     */
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    /**
     * Custom subviews should be added to the content view.
     */
    @Generated
    @Selector("contentView")
    public native UIView contentView();

    /**
     * default is nil.  label will be created if necessary (and the current style supports a detail label).
     */
    @Generated
    @Selector("detailTextLabel")
    public native UILabel detailTextLabel();

    @Generated
    @Selector("didTransitionToState:")
    public native void didTransitionToState(@NUInt long state);

    /**
     * action to call on insert/delete call. set by UITableView
     */
    @Generated
    @Deprecated
    @Selector("editAction")
    public native SEL editAction();

    /**
     * default is UITableViewCellAccessoryNone. use to set standard type
     */
    @Generated
    @Selector("editingAccessoryType")
    @NInt
    public native long editingAccessoryType();

    /**
     * if set, use custom view. ignore editingAccessoryType. tracks if enabled can calls accessory action
     */
    @Generated
    @Selector("editingAccessoryView")
    public native UIView editingAccessoryView();

    /**
     * default is UITableViewCellEditingStyleNone. This is set by UITableView using the delegate's value for cells who customize their appearance accordingly.
     */
    @Generated
    @Selector("editingStyle")
    @NInt
    public native long editingStyle();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("focusStyle")
    @NInt
    public native long focusStyle();

    /**
     * default is nil (Use default font)
     */
    @Generated
    @Deprecated
    @Selector("font")
    public native UIFont font();

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean gestureRecognizerShouldBeRequiredToFailByGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceivePress:")
    public native boolean gestureRecognizerShouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceiveTouch:")
    public native boolean gestureRecognizerShouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean gestureRecognizerShouldRecognizeSimultaneouslyWithGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean gestureRecognizerShouldRequireFailureOfGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @Generated
    @IsOptional
    @Selector("gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);

    /**
     * default is YES
     */
    @Generated
    @Deprecated
    @Selector("hidesAccessoryWhenEditing")
    public native boolean hidesAccessoryWhenEditing();

    /**
     * default is nil. appears on left next to title.
     */
    @Generated
    @Deprecated
    @Selector("image")
    public native UIImage image();

    /**
     * default is nil.  image view will be created if necessary.
     */
    @Generated
    @Selector("imageView")
    public native UIImageView imageView();

    /**
     * adjust content indent. default is 0
     */
    @Generated
    @Selector("indentationLevel")
    @NInt
    public native long indentationLevel();

    /**
     * width for each level. default is 10.0
     */
    @Generated
    @Selector("indentationWidth")
    @NFloat
    public native double indentationWidth();

    @Generated
    @Selector("init")
    public native UITableViewCell init();

    @Generated
    @Selector("initWithCoder:")
    public native UITableViewCell initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UITableViewCell initWithFrame(@ByValue CGRect frame);

    /**
     * Frame is ignored.  The size will be specified by the table view width and row height.
     */
    @Generated
    @Deprecated
    @Selector("initWithFrame:reuseIdentifier:")
    public native UITableViewCell initWithFrameReuseIdentifier(@ByValue CGRect frame, String reuseIdentifier);

    /**
     * Designated initializer.  If the cell can be reused, you must pass in a reuse identifier.  You should use the same reuse identifier for all cells of the same form.
     */
    @Generated
    @Selector("initWithStyle:reuseIdentifier:")
    public native UITableViewCell initWithStyleReuseIdentifier(@NInt long style, String reuseIdentifier);

    /**
     * show appropriate edit controls (+/- & reorder). By default -setEditing: calls setEditing:animated: with NO for animated.
     */
    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

    /**
     * show appropriate edit controls (+/- & reorder). By default -setEditing: calls setEditing:animated: with NO for animated.
     */
    @Generated
    @Selector("setEditing:")
    public native void setEditing(boolean value);

    /**
     * set highlighted state (title, image, background). default is NO. animated is NO
     */
    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    /**
     * set highlighted state (title, image, background). default is NO. animated is NO
     */
    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    /**
     * set selected state (title, image, background). default is NO. animated is NO
     */
    @Generated
    @Selector("isSelected")
    public native boolean isSelected();

    /**
     * set selected state (title, image, background). default is NO. animated is NO
     */
    @Generated
    @Selector("setSelected:")
    public native void setSelected(boolean value);

    /**
     * default is UILineBreakModeTailTruncation
     */
    @Generated
    @Deprecated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * Always nil when a non-nil `backgroundConfiguration` is set. If not nil, takes the place of the selectedBackgroundView when using multiple selection.
     */
    @Generated
    @Selector("multipleSelectionBackgroundView")
    public native UIView multipleSelectionBackgroundView();

    /**
     * if the cell is reusable (has a reuse identifier), this is called just before the cell is returned from the table view method dequeueReusableCellWithIdentifier:.  If you override, you MUST call super.
     */
    @Generated
    @Selector("prepareForReuse")
    public native void prepareForReuse();

    @Generated
    @Selector("reuseIdentifier")
    public native String reuseIdentifier();

    /**
     * Always nil when a non-nil `backgroundConfiguration` is set. The 'selectedBackgroundView' will be added as a subview directly above the backgroundView if not nil, or behind all other views. It is added as a subview only when the cell is selected. Calling -setSelected:animated: will cause the 'selectedBackgroundView' to animate in and out with an alpha fade.
     */
    @Generated
    @Selector("selectedBackgroundView")
    public native UIView selectedBackgroundView();

    /**
     * default is nil
     */
    @Generated
    @Deprecated
    @Selector("selectedImage")
    public native UIImage selectedImage();

    /**
     * default is nil (text draws white)
     */
    @Generated
    @Deprecated
    @Selector("selectedTextColor")
    public native UIColor selectedTextColor();

    /**
     * default is UITableViewCellSelectionStyleDefault.
     */
    @Generated
    @Selector("selectionStyle")
    @NInt
    public native long selectionStyle();

    /**
     * allows customization of the separator frame
     */
    @Generated
    @Selector("separatorInset")
    @ByValue
    public native UIEdgeInsets separatorInset();

    /**
     * action to call on accessory view clicked. set by UITableView
     */
    @Generated
    @Deprecated
    @Selector("setAccessoryAction:")
    public native void setAccessoryAction(SEL value);

    /**
     * default is UITableViewCellAccessoryNone. use to set standard type
     */
    @Generated
    @Selector("setAccessoryType:")
    public native void setAccessoryType(@NInt long value);

    /**
     * if set, use custom view. ignore accessoryType. tracks if enabled can calls accessory action
     */
    @Generated
    @Selector("setAccessoryView:")
    public native void setAccessoryView(UIView value);

    /**
     * Always nil when a non-nil `backgroundConfiguration` is set. The 'backgroundView' will be added as a subview behind all other views.
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(UIView value);

    /**
     * action to call on insert/delete call. set by UITableView
     */
    @Generated
    @Deprecated
    @Selector("setEditAction:")
    public native void setEditAction(SEL value);

    @Generated
    @Selector("setEditing:animated:")
    public native void setEditingAnimated(boolean editing, boolean animated);

    /**
     * default is UITableViewCellAccessoryNone. use to set standard type
     */
    @Generated
    @Selector("setEditingAccessoryType:")
    public native void setEditingAccessoryType(@NInt long value);

    /**
     * if set, use custom view. ignore editingAccessoryType. tracks if enabled can calls accessory action
     */
    @Generated
    @Selector("setEditingAccessoryView:")
    public native void setEditingAccessoryView(UIView value);

    @Generated
    @Selector("setFocusStyle:")
    public native void setFocusStyle(@NInt long value);

    /**
     * default is nil (Use default font)
     */
    @Generated
    @Deprecated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * default is YES
     */
    @Generated
    @Deprecated
    @Selector("setHidesAccessoryWhenEditing:")
    public native void setHidesAccessoryWhenEditing(boolean value);

    /**
     * animate between regular and highlighted state
     */
    @Generated
    @Selector("setHighlighted:animated:")
    public native void setHighlightedAnimated(boolean highlighted, boolean animated);

    /**
     * default is nil. appears on left next to title.
     */
    @Generated
    @Deprecated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    /**
     * adjust content indent. default is 0
     */
    @Generated
    @Selector("setIndentationLevel:")
    public native void setIndentationLevel(@NInt long value);

    /**
     * width for each level. default is 10.0
     */
    @Generated
    @Selector("setIndentationWidth:")
    public native void setIndentationWidth(@NFloat double value);

    /**
     * default is UILineBreakModeTailTruncation
     */
    @Generated
    @Deprecated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * Always nil when a non-nil `backgroundConfiguration` is set. If not nil, takes the place of the selectedBackgroundView when using multiple selection.
     */
    @Generated
    @Selector("setMultipleSelectionBackgroundView:")
    public native void setMultipleSelectionBackgroundView(UIView value);

    /**
     * animate between regular and selected state
     */
    @Generated
    @Selector("setSelected:animated:")
    public native void setSelectedAnimated(boolean selected, boolean animated);

    /**
     * Always nil when a non-nil `backgroundConfiguration` is set. The 'selectedBackgroundView' will be added as a subview directly above the backgroundView if not nil, or behind all other views. It is added as a subview only when the cell is selected. Calling -setSelected:animated: will cause the 'selectedBackgroundView' to animate in and out with an alpha fade.
     */
    @Generated
    @Selector("setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView value);

    /**
     * default is nil
     */
    @Generated
    @Deprecated
    @Selector("setSelectedImage:")
    public native void setSelectedImage(UIImage value);

    /**
     * default is nil (text draws white)
     */
    @Generated
    @Deprecated
    @Selector("setSelectedTextColor:")
    public native void setSelectedTextColor(UIColor value);

    /**
     * default is UITableViewCellSelectionStyleDefault.
     */
    @Generated
    @Selector("setSelectionStyle:")
    public native void setSelectionStyle(@NInt long value);

    /**
     * allows customization of the separator frame
     */
    @Generated
    @Selector("setSeparatorInset:")
    public native void setSeparatorInset(@ByValue UIEdgeInsets value);

    /**
     * default is YES.  This is unrelated to the indentation level below.
     */
    @Generated
    @Selector("setShouldIndentWhileEditing:")
    public native void setShouldIndentWhileEditing(boolean value);

    /**
     * default is NO
     */
    @Generated
    @Selector("setShowsReorderControl:")
    public native void setShowsReorderControl(boolean value);

    /**
     * target for insert/delete/accessory clicks. default is nil (i.e. go up responder chain). weak reference
     */
    @Generated
    @Deprecated
    @Selector("setTarget:")
    public native void setTarget_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * target for insert/delete/accessory clicks. default is nil (i.e. go up responder chain). weak reference
     */
    @Generated
    @Deprecated
    public void setTarget(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = target();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTarget_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * default is nil
     */
    @Generated
    @Deprecated
    @Selector("setText:")
    public native void setText(String value);

    /**
     * default is UITextAlignmentLeft
     */
    @Generated
    @Deprecated
    @Selector("setTextAlignment:")
    public native void setTextAlignment(@NInt long value);

    /**
     * default is nil (text draws black)
     */
    @Generated
    @Deprecated
    @Selector("setTextColor:")
    public native void setTextColor(UIColor value);

    /**
     * default is YES.  This is unrelated to the indentation level below.
     */
    @Generated
    @Selector("shouldIndentWhileEditing")
    public native boolean shouldIndentWhileEditing();

    /**
     * currently showing "Delete" button
     */
    @Generated
    @Selector("showingDeleteConfirmation")
    public native boolean showingDeleteConfirmation();

    /**
     * default is NO
     */
    @Generated
    @Selector("showsReorderControl")
    public native boolean showsReorderControl();

    /**
     * target for insert/delete/accessory clicks. default is nil (i.e. go up responder chain). weak reference
     */
    @Generated
    @Deprecated
    @Selector("target")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object target();

    /**
     * default is nil
     */
    @Generated
    @Deprecated
    @Selector("text")
    public native String text();

    /**
     * default is UITextAlignmentLeft
     */
    @Generated
    @Deprecated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    /**
     * default is nil (text draws black)
     */
    @Generated
    @Deprecated
    @Selector("textColor")
    public native UIColor textColor();

    /**
     * default is nil.  label will be created if necessary.
     */
    @Generated
    @Selector("textLabel")
    public native UILabel textLabel();

    /**
     * These methods can be used by subclasses to animate additional changes to the cell when the cell is changing state
     * Note that when the cell is swiped, the cell will be transitioned into the UITableViewCellStateShowingDeleteConfirmationMask state,
     * but the UITableViewCellStateShowingEditControlMask will not be set.
     */
    @Generated
    @Selector("willTransitionToState:")
    public native void willTransitionToState(@NUInt long state);

    /**
     * Override this method to receive notifications that the cell's drag state has changed.
     * Call super if you want to apply the default appearance.
     */
    @Generated
    @Selector("dragStateDidChange:")
    public native void dragStateDidChange(@NInt long dragState);

    /**
     * Controls whether the cell in the table view allows user interaction once it is part of a drag (UITableViewCellDragStateDragging).
     * Default is NO.
     */
    @Generated
    @Selector("setUserInteractionEnabledWhileDragging:")
    public native void setUserInteractionEnabledWhileDragging(boolean value);

    /**
     * Controls whether the cell in the table view allows user interaction once it is part of a drag (UITableViewCellDragStateDragging).
     * Default is NO.
     */
    @Generated
    @Selector("userInteractionEnabledWhileDragging")
    public native boolean userInteractionEnabledWhileDragging();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceiveEvent:")
    public native boolean gestureRecognizerShouldReceiveEvent(UIGestureRecognizer gestureRecognizer, UIEvent event);

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `backgroundConfiguration` when the cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     */
    @Generated
    @Selector("automaticallyUpdatesBackgroundConfiguration")
    public native boolean automaticallyUpdatesBackgroundConfiguration();

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `contentConfiguration` when the cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     */
    @Generated
    @Selector("automaticallyUpdatesContentConfiguration")
    public native boolean automaticallyUpdatesContentConfiguration();

    /**
     * Setting a background configuration supersedes the cell's backgroundView, selectedBackgroundView, and multipleSelectionBackgroundView. The default value is nil.
     */
    @Generated
    @Selector("backgroundConfiguration")
    public native UIBackgroundConfiguration backgroundConfiguration();

    /**
     * Returns the current configuration state for the cell.
     * To add your own custom state(s), override the getter and call super to obtain an instance with the
     * system properties set, then set your own custom states as desired.
     */
    @Generated
    @Selector("configurationState")
    public native UICellConfigurationState configurationState();

    /**
     * Setting a content configuration replaces the existing contentView of the cell with a new content view instance from the configuration,
     * or directly applies the configuration to the existing content view if the configuration is compatible with the existing content view type.
     * The default value is nil. After a configuration has been set, setting this property to nil will replace the current content view with a new content view.
     */
    @Generated
    @Selector("contentConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIContentConfiguration contentConfiguration();

    /**
     * Returns a default list content configuration for the cell's style.
     */
    @Generated
    @Selector("defaultContentConfiguration")
    public native UIListContentConfiguration defaultContentConfiguration();

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `backgroundConfiguration` when the cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     */
    @Generated
    @Selector("setAutomaticallyUpdatesBackgroundConfiguration:")
    public native void setAutomaticallyUpdatesBackgroundConfiguration(boolean value);

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `contentConfiguration` when the cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     */
    @Generated
    @Selector("setAutomaticallyUpdatesContentConfiguration:")
    public native void setAutomaticallyUpdatesContentConfiguration(boolean value);

    /**
     * Setting a background configuration supersedes the cell's backgroundView, selectedBackgroundView, and multipleSelectionBackgroundView. The default value is nil.
     */
    @Generated
    @Selector("setBackgroundConfiguration:")
    public native void setBackgroundConfiguration(UIBackgroundConfiguration value);

    /**
     * Setting a content configuration replaces the existing contentView of the cell with a new content view instance from the configuration,
     * or directly applies the configuration to the existing content view if the configuration is compatible with the existing content view type.
     * The default value is nil. After a configuration has been set, setting this property to nil will replace the current content view with a new content view.
     */
    @Generated
    @Selector("setContentConfiguration:")
    public native void setContentConfiguration(@Mapped(ObjCObjectMapper.class) UIContentConfiguration value);

    /**
     * Requests the cell update its configuration for its current state. This method is called automatically
     * when the cell's `configurationState` may have changed, as well as in other circumstances where an
     * update may be required. Multiple requests may be coalesced into a single update at the appropriate time.
     */
    @Generated
    @Selector("setNeedsUpdateConfiguration")
    public native void setNeedsUpdateConfiguration();

    /**
     * Subclasses should override this method and update the cell's configuration using the state provided.
     * This method should not be called directly, use `setNeedsUpdateConfiguration` to request an update.
     */
    @Generated
    @Selector("updateConfigurationUsingState:")
    public native void updateConfigurationUsingState(UICellConfigurationState state);

    /**
     * Optional block-based alternative to overriding `-updateConfigurationUsingState:` in a subclass. This handler
     * is called after `-updateConfigurationUsingState:`. Setting a new handler triggers `setNeedsUpdateConfiguration`.
     */
    @Generated
    @Selector("configurationUpdateHandler")
    @ObjCBlock(name = "call_configurationUpdateHandler_ret")
    public native Block_configurationUpdateHandler_ret configurationUpdateHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationUpdateHandler_ret {
        @Generated
        void call_configurationUpdateHandler_ret(UITableViewCell cell, UICellConfigurationState state);
    }

    /**
     * Optional block-based alternative to overriding `-updateConfigurationUsingState:` in a subclass. This handler
     * is called after `-updateConfigurationUsingState:`. Setting a new handler triggers `setNeedsUpdateConfiguration`.
     */
    @Generated
    @Selector("setConfigurationUpdateHandler:")
    public native void setConfigurationUpdateHandler(
            @ObjCBlock(name = "call_setConfigurationUpdateHandler") Block_setConfigurationUpdateHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setConfigurationUpdateHandler {
        @Generated
        void call_setConfigurationUpdateHandler(UITableViewCell cell, UICellConfigurationState state);
    }
}
