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
    @Owned
    @Selector("alloc")
    public static native UITableViewCell alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
    public static native void setAnimationDuration(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);

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
    public static native void setVersion(@NInt long aVersion);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * accessoryAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/accessoryAction">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("accessoryAction")
    public native SEL accessoryAction();

    /**
     * accessoryType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/accessoryType">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessoryType")
    @NInt
    public native long accessoryType();

    /**
     * accessoryView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/accessoryView">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessoryView")
    public native UIView accessoryView();

    /**
     * backgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/backgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    /**
     * contentView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/contentView">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentView")
    public native UIView contentView();

    /**
     * detailTextLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/detailTextLabel">iOS Dev Center</a>
     */
    @Generated
    @Selector("detailTextLabel")
    public native UILabel detailTextLabel();

    /**
     * didTransitionToState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/didTransitionToState:">iOS Dev Center</a>
     */
    @Generated
    @Selector("didTransitionToState:")
    public native void didTransitionToState(@NUInt long state);

    /**
     * editAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editAction">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("editAction")
    public native SEL editAction();

    /**
     * editingAccessoryType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editingAccessoryType">iOS Dev Center</a>
     */
    @Generated
    @Selector("editingAccessoryType")
    @NInt
    public native long editingAccessoryType();

    /**
     * editingAccessoryView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editingAccessoryView">iOS Dev Center</a>
     */
    @Generated
    @Selector("editingAccessoryView")
    public native UIView editingAccessoryView();

    /**
     * editingStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editingStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("editingStyle")
    @NInt
    public native long editingStyle();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * font</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/font">iOS Dev Center</a>
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
     * hidesAccessoryWhenEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/hidesAccessoryWhenEditing">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("hidesAccessoryWhenEditing")
    public native boolean hidesAccessoryWhenEditing();

    /**
     * image</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/image">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("image")
    public native UIImage image();

    /**
     * imageView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/imageView">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageView")
    public native UIImageView imageView();

    /**
     * indentationLevel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/indentationLevel">iOS Dev Center</a>
     */
    @Generated
    @Selector("indentationLevel")
    @NInt
    public native long indentationLevel();

    /**
     * indentationWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/indentationWidth">iOS Dev Center</a>
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
    public native UITableViewCell initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithFrame:")
    public native UITableViewCell initWithFrame(@ByValue CGRect frame);

    /**
     * initWithFrame:reuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/initWithFrame:reuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithFrame:reuseIdentifier:")
    public native UITableViewCell initWithFrameReuseIdentifier(@ByValue CGRect frame, String reuseIdentifier);

    /**
     * initWithStyle:reuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/initWithStyle:reuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithStyle:reuseIdentifier:")
    public native UITableViewCell initWithStyleReuseIdentifier(@NInt long style, String reuseIdentifier);

    /**
     * editing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

    /**
     * editing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEditing:")
    public native void setEditing(boolean value);

    /**
     * highlighted</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/highlighted">iOS Dev Center</a>
     */
    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    /**
     * highlighted</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/highlighted">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    /**
     * selected</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selected">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSelected")
    public native boolean isSelected();

    /**
     * selected</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selected">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelected:")
    public native void setSelected(boolean value);

    /**
     * lineBreakMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/lineBreakMode">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * multipleSelectionBackgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/multipleSelectionBackgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("multipleSelectionBackgroundView")
    public native UIView multipleSelectionBackgroundView();

    /**
     * prepareForReuse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/prepareForReuse">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareForReuse")
    public native void prepareForReuse();

    /**
     * reuseIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/reuseIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("reuseIdentifier")
    public native String reuseIdentifier();

    /**
     * selectedBackgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectedBackgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectedBackgroundView")
    public native UIView selectedBackgroundView();

    /**
     * selectedImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectedImage">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("selectedImage")
    public native UIImage selectedImage();

    /**
     * selectedTextColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectedTextColor">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("selectedTextColor")
    public native UIColor selectedTextColor();

    /**
     * selectionStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectionStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectionStyle")
    @NInt
    public native long selectionStyle();

    /**
     * separatorInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/separatorInset">iOS Dev Center</a>
     */
    @Generated
    @Selector("separatorInset")
    @ByValue
    public native UIEdgeInsets separatorInset();

    /**
     * accessoryAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/accessoryAction">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setAccessoryAction:")
    public native void setAccessoryAction(SEL value);

    /**
     * accessoryType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/accessoryType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessoryType:")
    public native void setAccessoryType(@NInt long value);

    /**
     * accessoryView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/accessoryView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessoryView:")
    public native void setAccessoryView(UIView value);

    /**
     * backgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/backgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(UIView value);

    /**
     * editAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editAction">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setEditAction:")
    public native void setEditAction(SEL value);

    /**
     * setEditing:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/setEditing:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEditing:animated:")
    public native void setEditingAnimated(boolean editing, boolean animated);

    /**
     * editingAccessoryType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editingAccessoryType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEditingAccessoryType:")
    public native void setEditingAccessoryType(@NInt long value);

    /**
     * editingAccessoryView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/editingAccessoryView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEditingAccessoryView:")
    public native void setEditingAccessoryView(UIView value);

    /**
     * font</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/font">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * hidesAccessoryWhenEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/hidesAccessoryWhenEditing">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setHidesAccessoryWhenEditing:")
    public native void setHidesAccessoryWhenEditing(boolean value);

    /**
     * setHighlighted:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/setHighlighted:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHighlighted:animated:")
    public native void setHighlightedAnimated(boolean highlighted, boolean animated);

    /**
     * image</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/image">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    /**
     * indentationLevel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/indentationLevel">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIndentationLevel:")
    public native void setIndentationLevel(@NInt long value);

    /**
     * indentationWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/indentationWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIndentationWidth:")
    public native void setIndentationWidth(@NFloat double value);

    /**
     * lineBreakMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/lineBreakMode">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * multipleSelectionBackgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/multipleSelectionBackgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMultipleSelectionBackgroundView:")
    public native void setMultipleSelectionBackgroundView(UIView value);

    /**
     * setSelected:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/setSelected:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelected:animated:")
    public native void setSelectedAnimated(boolean selected, boolean animated);

    /**
     * selectedBackgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectedBackgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView value);

    /**
     * selectedImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectedImage">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setSelectedImage:")
    public native void setSelectedImage(UIImage value);

    /**
     * selectedTextColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectedTextColor">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setSelectedTextColor:")
    public native void setSelectedTextColor(UIColor value);

    /**
     * selectionStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/selectionStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelectionStyle:")
    public native void setSelectionStyle(@NInt long value);

    /**
     * separatorInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/separatorInset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSeparatorInset:")
    public native void setSeparatorInset(@ByValue UIEdgeInsets value);

    /**
     * shouldIndentWhileEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/shouldIndentWhileEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldIndentWhileEditing:")
    public native void setShouldIndentWhileEditing(boolean value);

    /**
     * showsReorderControl</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/showsReorderControl">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShowsReorderControl:")
    public native void setShowsReorderControl(boolean value);

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/target">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setTarget:")
    public native void setTarget_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/target">iOS Dev Center</a>
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
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/text">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setText:")
    public native void setText(String value);

    /**
     * textAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/textAlignment">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setTextAlignment:")
    public native void setTextAlignment(@NInt long value);

    /**
     * textColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/textColor">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setTextColor:")
    public native void setTextColor(UIColor value);

    /**
     * shouldIndentWhileEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/shouldIndentWhileEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldIndentWhileEditing")
    public native boolean shouldIndentWhileEditing();

    /**
     * showingDeleteConfirmation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/showingDeleteConfirmation">iOS Dev Center</a>
     */
    @Generated
    @Selector("showingDeleteConfirmation")
    public native boolean showingDeleteConfirmation();

    /**
     * showsReorderControl</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/showsReorderControl">iOS Dev Center</a>
     */
    @Generated
    @Selector("showsReorderControl")
    public native boolean showsReorderControl();

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/target">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("target")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object target();

    /**
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/text">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("text")
    public native String text();

    /**
     * textAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/textAlignment">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    /**
     * textColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/textColor">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("textColor")
    public native UIColor textColor();

    /**
     * textLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/textLabel">iOS Dev Center</a>
     */
    @Generated
    @Selector("textLabel")
    public native UILabel textLabel();

    /**
     * willTransitionToState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instm/UITableViewCell/willTransitionToState:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willTransitionToState:")
    public native void willTransitionToState(@NUInt long state);

    /**
     * focusStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/focusStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("focusStyle")
    @NInt
    public native long focusStyle();

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceivePress:")
    public native boolean gestureRecognizerShouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press);

    /**
     * focusStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewCell_Class/index.html#//apple_ref/occ/instp/UITableViewCell/focusStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFocusStyle:")
    public native void setFocusStyle(@NInt long value);

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }
}
