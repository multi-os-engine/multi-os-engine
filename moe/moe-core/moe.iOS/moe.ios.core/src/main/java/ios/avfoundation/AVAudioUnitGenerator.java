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

package ios.avfoundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.audiounit.struct.AudioComponentDescription;
import ios.avfoundation.protocol.AVAudioMixing;
import ios.avfoundation.struct.AVAudio3DPoint;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitGenerator extends AVAudioUnit implements AVAudioMixing {
	static {
		NatJ.register();
	}

	@Generated
	protected AVAudioUnitGenerator(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVAudioUnitGenerator alloc();

	/**
	 * bypass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioUnitGenerator_Class/index.html#//apple_ref/occ/instp/AVAudioUnitGenerator/bypass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bypass")
	public native boolean bypass();

	@Generated
	@Selector("init")
	public native AVAudioUnitGenerator init();

	/**
	 * initWithAudioComponentDescription:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioUnitGenerator_Class/index.html#//apple_ref/occ/instm/AVAudioUnitGenerator/initWithAudioComponentDescription:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithAudioComponentDescription:")
	public native AVAudioUnitGenerator initWithAudioComponentDescription(
			@ByValue AudioComponentDescription audioComponentDescription);

	@Generated
	@Selector("obstruction")
	public native float obstruction();

	@Generated
	@Selector("occlusion")
	public native float occlusion();

	@Generated
	@Selector("pan")
	public native float pan();

	@Generated
	@Selector("position")
	@ByValue
	public native AVAudio3DPoint position();

	@Generated
	@Selector("rate")
	public native float rate();

	@Generated
	@Selector("renderingAlgorithm")
	@NInt
	public native long renderingAlgorithm();

	@Generated
	@Selector("reverbBlend")
	public native float reverbBlend();

	/**
	 * bypass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioUnitGenerator_Class/index.html#//apple_ref/occ/instp/AVAudioUnitGenerator/bypass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBypass:")
	public native void setBypass(boolean value);

	@Generated
	@Selector("setObstruction:")
	public native void setObstruction(float value);

	@Generated
	@Selector("setOcclusion:")
	public native void setOcclusion(float value);

	@Generated
	@Selector("setPan:")
	public native void setPan(float value);

	@Generated
	@Selector("setPosition:")
	public native void setPosition(@ByValue AVAudio3DPoint value);

	@Generated
	@Selector("setRate:")
	public native void setRate(float value);

	@Generated
	@Selector("setRenderingAlgorithm:")
	public native void setRenderingAlgorithm(@NInt long value);

	@Generated
	@Selector("setReverbBlend:")
	public native void setReverbBlend(float value);

	@Generated
	@Selector("setVolume:")
	public native void setVolume(float value);

	@Generated
	@Selector("volume")
	public native float volume();

	@Generated
	@Selector("destinationForMixer:bus:")
	public native AVAudioMixingDestination destinationForMixerBus(AVAudioNode mixer, @NUInt long bus);

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
	@Selector("instantiateWithComponentDescription:options:completionHandler:")
	public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
			@ByValue AudioComponentDescription audioComponentDescription,
			int options,
			@ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") AVAudioUnit.Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
