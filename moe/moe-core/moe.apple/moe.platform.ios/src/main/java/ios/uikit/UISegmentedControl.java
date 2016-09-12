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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCoding;
import ios.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSDate;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISegmentedControl extends UIControl implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected UISegmentedControl(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UISegmentedControl alloc();

	/**
	 * apportionsSegmentWidthsByContent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/apportionsSegmentWidthsByContent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("apportionsSegmentWidthsByContent")
	public native boolean apportionsSegmentWidthsByContent();

	/**
	 * backgroundImageForState:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/backgroundImageForState:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundImageForState:barMetrics:")
	public native UIImage backgroundImageForStateBarMetrics(@NUInt long state,
			@NInt long barMetrics);

	/**
	 * contentOffsetForSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/contentOffsetForSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentOffsetForSegmentAtIndex:")
	@ByValue
	public native CGSize contentOffsetForSegmentAtIndex(@NUInt long segment);

	/**
	 * contentPositionAdjustmentForSegmentType:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/contentPositionAdjustmentForSegmentType:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentPositionAdjustmentForSegmentType:barMetrics:")
	@ByValue
	public native UIOffset contentPositionAdjustmentForSegmentTypeBarMetrics(
			@NInt long leftCenterRightOrAlone, @NInt long barMetrics);

	/**
	 * dividerImageForLeftSegmentState:rightSegmentState:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/dividerImageForLeftSegmentState:rightSegmentState:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dividerImageForLeftSegmentState:rightSegmentState:barMetrics:")
	public native UIImage dividerImageForLeftSegmentStateRightSegmentStateBarMetrics(
			@NUInt long leftState, @NUInt long rightState, @NInt long barMetrics);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * imageForSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/imageForSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageForSegmentAtIndex:")
	public native UIImage imageForSegmentAtIndex(@NUInt long segment);

	@Generated
	@Selector("init")
	public native UISegmentedControl init();

	@Generated
	@Selector("initWithCoder:")
	public native UISegmentedControl initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native UISegmentedControl initWithFrame(@ByValue CGRect frame);

	/**
	 * initWithItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/initWithItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithItems:")
	public native UISegmentedControl initWithItems(NSArray<?> items);

	/**
	 * insertSegmentWithImage:atIndex:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/insertSegmentWithImage:atIndex:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertSegmentWithImage:atIndex:animated:")
	public native void insertSegmentWithImageAtIndexAnimated(UIImage image,
			@NUInt long segment, boolean animated);

	/**
	 * insertSegmentWithTitle:atIndex:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/insertSegmentWithTitle:atIndex:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertSegmentWithTitle:atIndex:animated:")
	public native void insertSegmentWithTitleAtIndexAnimated(String title,
			@NUInt long segment, boolean animated);

	/**
	 * isEnabledForSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/isEnabledForSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEnabledForSegmentAtIndex:")
	public native boolean isEnabledForSegmentAtIndex(@NUInt long segment);

	/**
	 * momentary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/momentary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMomentary")
	public native boolean isMomentary();

	/**
	 * numberOfSegments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/numberOfSegments">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfSegments")
	@NUInt
	public native long numberOfSegments();

	/**
	 * removeAllSegments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/removeAllSegments">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllSegments")
	public native void removeAllSegments();

	/**
	 * removeSegmentAtIndex:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/removeSegmentAtIndex:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeSegmentAtIndex:animated:")
	public native void removeSegmentAtIndexAnimated(@NUInt long segment,
			boolean animated);

	/**
	 * segmentedControlStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/segmentedControlStyle">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("segmentedControlStyle")
	@NInt
	public native long segmentedControlStyle();

	/**
	 * selectedSegmentIndex</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/selectedSegmentIndex">iOS Dev Center</a>
	 */
	@Generated
	@Selector("selectedSegmentIndex")
	@NInt
	public native long selectedSegmentIndex();

	/**
	 * apportionsSegmentWidthsByContent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/apportionsSegmentWidthsByContent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setApportionsSegmentWidthsByContent:")
	public native void setApportionsSegmentWidthsByContent(boolean value);

	/**
	 * setBackgroundImage:forState:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setBackgroundImage:forState:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackgroundImage:forState:barMetrics:")
	public native void setBackgroundImageForStateBarMetrics(
			UIImage backgroundImage, @NUInt long state, @NInt long barMetrics);

	/**
	 * setContentOffset:forSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setContentOffset:forSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentOffset:forSegmentAtIndex:")
	public native void setContentOffsetForSegmentAtIndex(
			@ByValue CGSize offset, @NUInt long segment);

	/**
	 * setContentPositionAdjustment:forSegmentType:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setContentPositionAdjustment:forSegmentType:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentPositionAdjustment:forSegmentType:barMetrics:")
	public native void setContentPositionAdjustmentForSegmentTypeBarMetrics(
			@ByValue UIOffset adjustment, @NInt long leftCenterRightOrAlone,
			@NInt long barMetrics);

	/**
	 * setDividerImage:forLeftSegmentState:rightSegmentState:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setDividerImage:forLeftSegmentState:rightSegmentState:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDividerImage:forLeftSegmentState:rightSegmentState:barMetrics:")
	public native void setDividerImageForLeftSegmentStateRightSegmentStateBarMetrics(
			UIImage dividerImage, @NUInt long leftState,
			@NUInt long rightState, @NInt long barMetrics);

	/**
	 * setEnabled:forSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setEnabled:forSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnabled:forSegmentAtIndex:")
	public native void setEnabledForSegmentAtIndex(boolean enabled,
			@NUInt long segment);

	/**
	 * setImage:forSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setImage:forSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImage:forSegmentAtIndex:")
	public native void setImageForSegmentAtIndex(UIImage image,
			@NUInt long segment);

	/**
	 * momentary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/momentary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMomentary:")
	public native void setMomentary(boolean value);

	/**
	 * segmentedControlStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/segmentedControlStyle">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setSegmentedControlStyle:")
	public native void setSegmentedControlStyle(@NInt long value);

	/**
	 * selectedSegmentIndex</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/selectedSegmentIndex">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSelectedSegmentIndex:")
	public native void setSelectedSegmentIndex(@NInt long value);

	/**
	 * tintColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/tintColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTintColor:")
	public native void setTintColor(UIColor value);

	/**
	 * setTitle:forSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setTitle:forSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitle:forSegmentAtIndex:")
	public native void setTitleForSegmentAtIndex(String title,
			@NUInt long segment);

	/**
	 * setTitleTextAttributes:forState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setTitleTextAttributes:forState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitleTextAttributes:forState:")
	public native void setTitleTextAttributesForState(NSDictionary<?, ?> attributes,
			@NUInt long state);

	/**
	 * setWidth:forSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/setWidth:forSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWidth:forSegmentAtIndex:")
	public native void setWidthForSegmentAtIndex(@NFloat double width,
			@NUInt long segment);

	/**
	 * tintColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instp/UISegmentedControl/tintColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tintColor")
	public native UIColor tintColor();

	/**
	 * titleForSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/titleForSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("titleForSegmentAtIndex:")
	public native String titleForSegmentAtIndex(@NUInt long segment);

	/**
	 * titleTextAttributesForState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/titleTextAttributesForState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("titleTextAttributesForState:")
	public native NSDictionary<?, ?> titleTextAttributesForState(@NUInt long state);

	/**
	 * widthForSegmentAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISegmentedControl_Class/index.html#//apple_ref/occ/instm/UISegmentedControl/widthForSegmentAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("widthForSegmentAtIndex:")
	@NFloat
	public native double widthForSegmentAtIndex(@NUInt long segment);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
	public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(
			double frameStartTime,
			double frameDuration,
			@ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
	public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:animations:")
	public static native void animateWithDurationAnimations(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

	@Generated
	@Selector("animateWithDuration:animations:completion:")
	public static native void animateWithDurationAnimationsCompletion(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

	@Generated
	@Selector("animateWithDuration:delay:options:animations:completion:")
	public static native void animateWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
	public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NFloat double dampingRatio,
			@NFloat double velocity,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

	@Generated
	@Selector("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearance();

	@Generated
	@ProtocolClassMethod("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearance() {
		return appearance();
	}

	@Generated
	@Selector("appearanceForTraitCollection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollection(
			UITraitCollection trait);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollection")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollection(UITraitCollection trait) {
		return appearanceForTraitCollection(trait);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceForTraitCollection:whenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceForTraitCollectionWhenContainedIn(trait,
				ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes) {
		return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
				trait, containerTypes);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceWhenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceWhenContainedIn(ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceWhenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes) {
		return appearanceWhenContainedInInstancesOfClasses(containerTypes);
	}

	@Generated
	@Selector("areAnimationsEnabled")
	public static native boolean areAnimationsEnabled();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("beginAnimations:context:")
	public static native void beginAnimationsContext(String animationID,
			VoidPtr context);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
	public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(
			@NUInt long animation,
			NSArray<? extends UIView> views,
			@NUInt long options,
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
	public static native void setAnimationBeginsFromCurrentState(
			boolean fromCurrentState);

	@Generated
	@Selector("setAnimationCurve:")
	public static native void setAnimationCurve(@NInt long curve);

	@Generated
	@Selector("setAnimationDelay:")
	public static native void setAnimationDelay(double delay);

	@Generated
	@Selector("setAnimationDelegate:")
	public static native void setAnimationDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setAnimationDidStopSelector:")
	public static native void setAnimationDidStopSelector(SEL selector);

	@Generated
	@Selector("setAnimationDuration:")
	public static native void setAnimationDuration(double duration);

	@Generated
	@Selector("setAnimationRepeatAutoreverses:")
	public static native void setAnimationRepeatAutoreverses(
			boolean repeatAutoreverses);

	@Generated
	@Selector("setAnimationRepeatCount:")
	public static native void setAnimationRepeatCount(float repeatCount);

	@Generated
	@Selector("setAnimationStartDate:")
	public static native void setAnimationStartDate(NSDate startDate);

	@Generated
	@Selector("setAnimationTransition:forView:cache:")
	public static native void setAnimationTransitionForViewCache(
			@NInt long transition, UIView view, boolean cache);

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
	public static native void transitionFromViewToViewDurationOptionsCompletion(
			UIView fromView,
			UIView toView,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

	@Generated
	@Selector("transitionWithView:duration:options:animations:completion:")
	public static native void transitionWithViewDurationOptionsAnimationsCompletion(
			UIView view,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
	@NInt
	public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(
			@NInt long attribute);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
