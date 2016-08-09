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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.avfoundation.protocol.AVAudioMixing;
import ios.avfoundation.struct.AVAudio3DPoint;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioPlayerNode extends AVAudioNode implements AVAudioMixing {
	static {
		NatJ.register();
	}

	@Generated
	protected AVAudioPlayerNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVAudioPlayerNode alloc();

	@Generated
	@Selector("init")
	public native AVAudioPlayerNode init();

	/**
	 * playing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instp/AVAudioPlayerNode/playing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPlaying")
	public native boolean isPlaying();

	/**
	 * nodeTimeForPlayerTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/nodeTimeForPlayerTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nodeTimeForPlayerTime:")
	public native AVAudioTime nodeTimeForPlayerTime(AVAudioTime playerTime);

	@Generated
	@Selector("obstruction")
	public native float obstruction();

	@Generated
	@Selector("occlusion")
	public native float occlusion();

	@Generated
	@Selector("pan")
	public native float pan();

	/**
	 * pause</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/pause">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pause")
	public native void pause();

	/**
	 * play</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/play">iOS Dev Center</a>
	 */
	@Generated
	@Selector("play")
	public native void play();

	/**
	 * playAtTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/playAtTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playAtTime:")
	public native void playAtTime(AVAudioTime when);

	/**
	 * playerTimeForNodeTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/playerTimeForNodeTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playerTimeForNodeTime:")
	public native AVAudioTime playerTimeForNodeTime(AVAudioTime nodeTime);

	@Generated
	@Selector("position")
	@ByValue
	public native AVAudio3DPoint position();

	/**
	 * prepareWithFrameCount:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/prepareWithFrameCount:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareWithFrameCount:")
	public native void prepareWithFrameCount(int frameCount);

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
	 * scheduleBuffer:atTime:options:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/scheduleBuffer:atTime:options:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scheduleBuffer:atTime:options:completionHandler:")
	public native void scheduleBufferAtTimeOptionsCompletionHandler(
			AVAudioPCMBuffer buffer,
			AVAudioTime when,
			@NUInt long options,
			@ObjCBlock(name = "call_scheduleBufferAtTimeOptionsCompletionHandler") Block_scheduleBufferAtTimeOptionsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_scheduleBufferAtTimeOptionsCompletionHandler {
		@Generated
		void call_scheduleBufferAtTimeOptionsCompletionHandler();
	}

	/**
	 * scheduleBuffer:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/scheduleBuffer:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scheduleBuffer:completionHandler:")
	public native void scheduleBufferCompletionHandler(
			AVAudioPCMBuffer buffer,
			@ObjCBlock(name = "call_scheduleBufferCompletionHandler") Block_scheduleBufferCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_scheduleBufferCompletionHandler {
		@Generated
		void call_scheduleBufferCompletionHandler();
	}

	/**
	 * scheduleFile:atTime:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/scheduleFile:atTime:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scheduleFile:atTime:completionHandler:")
	public native void scheduleFileAtTimeCompletionHandler(
			AVAudioFile file,
			AVAudioTime when,
			@ObjCBlock(name = "call_scheduleFileAtTimeCompletionHandler") Block_scheduleFileAtTimeCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_scheduleFileAtTimeCompletionHandler {
		@Generated
		void call_scheduleFileAtTimeCompletionHandler();
	}

	/**
	 * scheduleSegment:startingFrame:frameCount:atTime:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/scheduleSegment:startingFrame:frameCount:atTime:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scheduleSegment:startingFrame:frameCount:atTime:completionHandler:")
	public native void scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler(
			AVAudioFile file,
			long startFrame,
			int numberFrames,
			AVAudioTime when,
			@ObjCBlock(name = "call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler") Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler {
		@Generated
		void call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler();
	}

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

	/**
	 * stop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerNode_Class/index.html#//apple_ref/occ/instm/AVAudioPlayerNode/stop">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stop")
	public native void stop();

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
