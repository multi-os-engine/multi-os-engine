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

package ios.spritekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIView;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;
import ios.uikit.UITraitCollection;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected SKView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKView alloc();

	/**
	 * allowsTransparency</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/allowsTransparency">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsTransparency")
	public native boolean allowsTransparency();

	/**
	 * convertPoint:fromScene:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instm/SKView/convertPoint:fromScene:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPoint:fromScene:")
	@ByValue
	public native CGPoint convertPointFromScene(@ByValue CGPoint point,
			SKScene scene);

	/**
	 * convertPoint:toScene:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instm/SKView/convertPoint:toScene:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPoint:toScene:")
	@ByValue
	public native CGPoint convertPointToScene(@ByValue CGPoint point,
			SKScene scene);

	/**
	 * frameInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/frameInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("frameInterval")
	@NInt
	public native long frameInterval();

	/**
	 * ignoresSiblingOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/ignoresSiblingOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ignoresSiblingOrder")
	public native boolean ignoresSiblingOrder();

	@Generated
	@Selector("init")
	public native SKView init();

	@Generated
	@Selector("initWithFrame:")
	public native SKView initWithFrame(@ByValue CGRect frame);

	/**
	 * asynchronous</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/asynchronous">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAsynchronous")
	public native boolean isAsynchronous();

	/**
	 * paused</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/paused">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPaused")
	public native boolean isPaused();

	/**
	 * presentScene:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instm/SKView/presentScene:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentScene:")
	public native void presentScene(SKScene scene);

	/**
	 * presentScene:transition:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instm/SKView/presentScene:transition:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentScene:transition:")
	public native void presentSceneTransition(SKScene scene,
			SKTransition transition);

	/**
	 * scene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/scene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scene")
	public native SKScene scene();

	/**
	 * allowsTransparency</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/allowsTransparency">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsTransparency:")
	public native void setAllowsTransparency(boolean value);

	/**
	 * asynchronous</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/asynchronous">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAsynchronous:")
	public native void setAsynchronous(boolean value);

	/**
	 * frameInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/frameInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFrameInterval:")
	public native void setFrameInterval(@NInt long value);

	/**
	 * ignoresSiblingOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/ignoresSiblingOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIgnoresSiblingOrder:")
	public native void setIgnoresSiblingOrder(boolean value);

	/**
	 * paused</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/paused">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPaused:")
	public native void setPaused(boolean value);

	/**
	 * shouldCullNonVisibleNodes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/shouldCullNonVisibleNodes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldCullNonVisibleNodes:")
	public native void setShouldCullNonVisibleNodes(boolean value);

	/**
	 * showsDrawCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsDrawCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsDrawCount:")
	public native void setShowsDrawCount(boolean value);

	/**
	 * showsFPS</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsFPS">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsFPS:")
	public native void setShowsFPS(boolean value);

	/**
	 * showsFields</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsFields">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsFields:")
	public native void setShowsFields(boolean value);

	/**
	 * showsNodeCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsNodeCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsNodeCount:")
	public native void setShowsNodeCount(boolean value);

	/**
	 * showsPhysics</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsPhysics">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsPhysics:")
	public native void setShowsPhysics(boolean value);

	/**
	 * showsQuadCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsQuadCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsQuadCount:")
	public native void setShowsQuadCount(boolean value);

	/**
	 * shouldCullNonVisibleNodes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/shouldCullNonVisibleNodes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldCullNonVisibleNodes")
	public native boolean shouldCullNonVisibleNodes();

	/**
	 * showsDrawCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsDrawCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsDrawCount")
	public native boolean showsDrawCount();

	/**
	 * showsFPS</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsFPS">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsFPS")
	public native boolean showsFPS();

	/**
	 * showsFields</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsFields">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsFields")
	public native boolean showsFields();

	/**
	 * showsNodeCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsNodeCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsNodeCount")
	public native boolean showsNodeCount();

	/**
	 * showsPhysics</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsPhysics">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsPhysics")
	public native boolean showsPhysics();

	/**
	 * showsQuadCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instp/SKView/showsQuadCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsQuadCount")
	public native boolean showsQuadCount();

	/**
	 * textureFromNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instm/SKView/textureFromNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureFromNode:")
	public native SKTexture textureFromNode(SKNode node);

	/**
	 * textureFromNode:crop:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKView/index.html#//apple_ref/occ/instm/SKView/textureFromNode:crop:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureFromNode:crop:")
	public native SKTexture textureFromNodeCrop(SKNode node,
			@ByValue CGRect crop);

	@Generated
	@Selector("initWithCoder:")
	public native SKView initWithCoder(NSCoder aDecoder);

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
