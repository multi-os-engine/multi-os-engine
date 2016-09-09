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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCoding;
import ios.uikit.protocol.UIBarPositioning;
import ios.uikit.protocol.UINavigationBarDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;
import ios.foundation.NSDate;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UINavigationBar extends UIView implements NSCoding,
		UIBarPositioning {
	static {
		NatJ.register();
	}

	@Generated
	protected UINavigationBar(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UINavigationBar alloc();

	/**
	 * backIndicatorImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/backIndicatorImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backIndicatorImage")
	public native UIImage backIndicatorImage();

	/**
	 * backIndicatorTransitionMaskImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/backIndicatorTransitionMaskImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backIndicatorTransitionMaskImage")
	public native UIImage backIndicatorTransitionMaskImage();

	/**
	 * backItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/backItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backItem")
	public native UINavigationItem backItem();

	/**
	 * backgroundImageForBarMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/backgroundImageForBarMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundImageForBarMetrics:")
	public native UIImage backgroundImageForBarMetrics(@NInt long barMetrics);

	/**
	 * backgroundImageForBarPosition:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/backgroundImageForBarPosition:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundImageForBarPosition:barMetrics:")
	public native UIImage backgroundImageForBarPositionBarMetrics(
			@NInt long barPosition, @NInt long barMetrics);

	@Generated
	@Selector("barPosition")
	@NInt
	public native long barPosition();

	/**
	 * barStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/barStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("barStyle")
	@NInt
	public native long barStyle();

	/**
	 * barTintColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/barTintColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("barTintColor")
	public native UIColor barTintColor();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UINavigationBarDelegate delegate();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native UINavigationBar init();

	@Generated
	@Selector("initWithCoder:")
	public native UINavigationBar initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native UINavigationBar initWithFrame(@ByValue CGRect frame);

	/**
	 * translucent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/translucent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isTranslucent")
	public native boolean isTranslucent();

	/**
	 * items</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/items">iOS Dev Center</a>
	 */
	@Generated
	@Selector("items")
	public native NSArray<? extends UINavigationItem> items();

	/**
	 * popNavigationItemAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/popNavigationItemAnimated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("popNavigationItemAnimated:")
	public native UINavigationItem popNavigationItemAnimated(boolean animated);

	/**
	 * pushNavigationItem:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/pushNavigationItem:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pushNavigationItem:animated:")
	public native void pushNavigationItemAnimated(UINavigationItem item,
			boolean animated);

	/**
	 * backIndicatorImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/backIndicatorImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackIndicatorImage:")
	public native void setBackIndicatorImage(UIImage value);

	/**
	 * backIndicatorTransitionMaskImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/backIndicatorTransitionMaskImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackIndicatorTransitionMaskImage:")
	public native void setBackIndicatorTransitionMaskImage(UIImage value);

	/**
	 * setBackgroundImage:forBarMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/setBackgroundImage:forBarMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackgroundImage:forBarMetrics:")
	public native void setBackgroundImageForBarMetrics(UIImage backgroundImage,
			@NInt long barMetrics);

	/**
	 * setBackgroundImage:forBarPosition:barMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/setBackgroundImage:forBarPosition:barMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackgroundImage:forBarPosition:barMetrics:")
	public native void setBackgroundImageForBarPositionBarMetrics(
			UIImage backgroundImage, @NInt long barPosition,
			@NInt long barMetrics);

	/**
	 * barStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/barStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBarStyle:")
	public native void setBarStyle(@NInt long value);

	/**
	 * barTintColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/barTintColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBarTintColor:")
	public native void setBarTintColor(UIColor value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UINavigationBarDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) UINavigationBarDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * items</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/items">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setItems:")
	public native void setItems(NSArray<? extends UINavigationItem> value);

	/**
	 * setItems:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/setItems:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setItems:animated:")
	public native void setItemsAnimated(NSArray<? extends UINavigationItem> items, boolean animated);

	/**
	 * shadowImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/shadowImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowImage:")
	public native void setShadowImage(UIImage value);

	/**
	 * tintColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/tintColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTintColor:")
	public native void setTintColor(UIColor value);

	/**
	 * titleTextAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/titleTextAttributes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitleTextAttributes:")
	public native void setTitleTextAttributes(NSDictionary<String, ?> value);

	/**
	 * setTitleVerticalPositionAdjustment:forBarMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/setTitleVerticalPositionAdjustment:forBarMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitleVerticalPositionAdjustment:forBarMetrics:")
	public native void setTitleVerticalPositionAdjustmentForBarMetrics(
			@NFloat double adjustment, @NInt long barMetrics);

	/**
	 * translucent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/translucent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTranslucent:")
	public native void setTranslucent(boolean value);

	/**
	 * shadowImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/shadowImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowImage")
	public native UIImage shadowImage();

	/**
	 * tintColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/tintColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tintColor")
	public native UIColor tintColor();

	/**
	 * titleTextAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/titleTextAttributes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("titleTextAttributes")
	public native NSDictionary<String, ?> titleTextAttributes();

	/**
	 * titleVerticalPositionAdjustmentForBarMetrics:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instm/UINavigationBar/titleVerticalPositionAdjustmentForBarMetrics:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("titleVerticalPositionAdjustmentForBarMetrics:")
	@NFloat
	public native double titleVerticalPositionAdjustmentForBarMetrics(
			@NInt long barMetrics);

	/**
	 * topItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBar_Class/index.html#//apple_ref/occ/instp/UINavigationBar/topItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("topItem")
	public native UINavigationItem topItem();

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
	public static native void setVersion(@NInt long aVersion);

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
