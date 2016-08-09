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

package ios.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import ios.quartzcore.protocol.CAAction;
import ios.quartzcore.protocol.CAMediaTiming;
import ios.scenekit.SCNAnimationEvent;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAAnimation extends NSObject implements NSCoding, NSCopying,
		CAMediaTiming, CAAction {
	static {
		NatJ.register();
	}

	@Generated
	protected CAAnimation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CAAnimation alloc();

	/**
	 * animation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/clm/CAAnimation/animation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animation")
	public static native CAAnimation animation();

	/**
	 * animationEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/animationEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animationEvents")
	public native NSArray<? extends SCNAnimationEvent> animationEvents();

	@Generated
	@Selector("autoreverses")
	public native boolean autoreverses();

	@Generated
	@Selector("beginTime")
	public native double beginTime();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * defaultValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/clm/CAAnimation/defaultValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultValueForKey(String key);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * fadeInDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/fadeInDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fadeInDuration")
	@NFloat
	public native double fadeInDuration();

	/**
	 * fadeOutDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/fadeOutDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fadeOutDuration")
	@NFloat
	public native double fadeOutDuration();

	@Generated
	@Selector("fillMode")
	public native String fillMode();

	@Generated
	@Selector("init")
	public native CAAnimation init();

	@Generated
	@Selector("initWithCoder:")
	public native CAAnimation initWithCoder(NSCoder aDecoder);

	/**
	 * removedOnCompletion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/removedOnCompletion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isRemovedOnCompletion")
	public native boolean isRemovedOnCompletion();

	@Generated
	@Selector("repeatCount")
	public native float repeatCount();

	@Generated
	@Selector("repeatDuration")
	public native double repeatDuration();

	@Generated
	@Selector("runActionForKey:object:arguments:")
	public native void runActionForKeyObjectArguments(String event,
			@Mapped(ObjCObjectMapper.class) Object anObject, NSDictionary<?, ?> dict);

	/**
	 * animationEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/animationEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnimationEvents:")
	public native void setAnimationEvents(NSArray<? extends SCNAnimationEvent> value);

	@Generated
	@Selector("setAutoreverses:")
	public native void setAutoreverses(boolean value);

	@Generated
	@Selector("setBeginTime:")
	public native void setBeginTime(double value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setDuration:")
	public native void setDuration(double value);

	/**
	 * fadeInDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/fadeInDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFadeInDuration:")
	public native void setFadeInDuration(@NFloat double value);

	/**
	 * fadeOutDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/fadeOutDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFadeOutDuration:")
	public native void setFadeOutDuration(@NFloat double value);

	@Generated
	@Selector("setFillMode:")
	public native void setFillMode(String value);

	/**
	 * removedOnCompletion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/removedOnCompletion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRemovedOnCompletion:")
	public native void setRemovedOnCompletion(boolean value);

	@Generated
	@Selector("setRepeatCount:")
	public native void setRepeatCount(float value);

	@Generated
	@Selector("setRepeatDuration:")
	public native void setRepeatDuration(double value);

	@Generated
	@Selector("setSpeed:")
	public native void setSpeed(float value);

	@Generated
	@Selector("setTimeOffset:")
	public native void setTimeOffset(double value);

	/**
	 * timingFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/timingFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimingFunction:")
	public native void setTimingFunction(CAMediaTimingFunction value);

	/**
	 * usesSceneTimeBase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/usesSceneTimeBase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUsesSceneTimeBase:")
	public native void setUsesSceneTimeBase(boolean value);

	/**
	 * shouldArchiveValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instm/CAAnimation/shouldArchiveValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldArchiveValueForKey:")
	public native boolean shouldArchiveValueForKey(String key);

	@Generated
	@Selector("speed")
	public native float speed();

	@Generated
	@Selector("timeOffset")
	public native double timeOffset();

	/**
	 * timingFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/timingFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timingFunction")
	public native CAMediaTimingFunction timingFunction();

	/**
	 * usesSceneTimeBase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instp/CAAnimation/usesSceneTimeBase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("usesSceneTimeBase")
	public native boolean usesSceneTimeBase();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

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
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
