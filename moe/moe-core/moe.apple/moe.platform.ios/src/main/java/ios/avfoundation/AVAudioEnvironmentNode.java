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

import ios.avfoundation.protocol.AVAudioMixing;
import ios.avfoundation.struct.AVAudio3DAngularOrientation;
import ios.avfoundation.struct.AVAudio3DPoint;
import ios.avfoundation.struct.AVAudio3DVectorOrientation;
import ios.foundation.NSArray;
import ios.foundation.NSNumber;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioEnvironmentNode extends AVAudioNode implements
		AVAudioMixing {
	static {
		NatJ.register();
	}

	@Generated
	protected AVAudioEnvironmentNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVAudioEnvironmentNode alloc();

	@Generated
	@Selector("applicableRenderingAlgorithms")
	public native NSArray<? extends NSNumber> applicableRenderingAlgorithms();

	/**
	 * distanceAttenuationParameters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/distanceAttenuationParameters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distanceAttenuationParameters")
	public native AVAudioEnvironmentDistanceAttenuationParameters distanceAttenuationParameters();

	@Generated
	@Selector("init")
	public native AVAudioEnvironmentNode init();

	/**
	 * listenerAngularOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/listenerAngularOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("listenerAngularOrientation")
	@ByValue
	public native AVAudio3DAngularOrientation listenerAngularOrientation();

	/**
	 * listenerPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/listenerPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("listenerPosition")
	@ByValue
	public native AVAudio3DPoint listenerPosition();

	/**
	 * listenerVectorOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/listenerVectorOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("listenerVectorOrientation")
	@ByValue
	public native AVAudio3DVectorOrientation listenerVectorOrientation();

	/**
	 * nextAvailableInputBus</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/nextAvailableInputBus">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nextAvailableInputBus")
	@NUInt
	public native long nextAvailableInputBus();

	@Generated
	@Selector("obstruction")
	public native float obstruction();

	@Generated
	@Selector("occlusion")
	public native float occlusion();

	@Generated
	@Selector("outputVolume")
	public native float outputVolume();

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
	 * reverbParameters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/reverbParameters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reverbParameters")
	public native AVAudioEnvironmentReverbParameters reverbParameters();

	/**
	 * listenerAngularOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/listenerAngularOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setListenerAngularOrientation:")
	public native void setListenerAngularOrientation(
			@ByValue AVAudio3DAngularOrientation value);

	/**
	 * listenerPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/listenerPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setListenerPosition:")
	public native void setListenerPosition(@ByValue AVAudio3DPoint value);

	/**
	 * listenerVectorOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioEnvironmentNode_Class/index.html#//apple_ref/occ/instp/AVAudioEnvironmentNode/listenerVectorOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setListenerVectorOrientation:")
	public native void setListenerVectorOrientation(
			@ByValue AVAudio3DVectorOrientation value);

	@Generated
	@Selector("setObstruction:")
	public native void setObstruction(float value);

	@Generated
	@Selector("setOcclusion:")
	public native void setOcclusion(float value);

	@Generated
	@Selector("setOutputVolume:")
	public native void setOutputVolume(float value);

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
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc();

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
	public static native long version();
}
