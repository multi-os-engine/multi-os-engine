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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.avfoundation.protocol.AVAudioSessionDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSession extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected AVAudioSession(Pointer peer) {
		super(peer);
	}

	/**
	 * IOBufferDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/IOBufferDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("IOBufferDuration")
	public native double IOBufferDuration();

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVAudioSession alloc();

	/**
	 * availableInputs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/availableInputs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableInputs")
	public native NSArray<? extends AVAudioSessionPortDescription> availableInputs();

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/category">iOS Dev Center</a>
	 */
	@Generated
	@Selector("category")
	public native String category();

	/**
	 * categoryOptions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/categoryOptions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("categoryOptions")
	@NUInt
	public native long categoryOptions();

	/**
	 * currentHardwareInputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/currentHardwareInputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("currentHardwareInputNumberOfChannels")
	@NInt
	public native long currentHardwareInputNumberOfChannels();

	/**
	 * currentHardwareOutputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/currentHardwareOutputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("currentHardwareOutputNumberOfChannels")
	@NInt
	public native long currentHardwareOutputNumberOfChannels();

	/**
	 * currentHardwareSampleRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/currentHardwareSampleRate">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("currentHardwareSampleRate")
	public native double currentHardwareSampleRate();

	/**
	 * currentRoute</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/currentRoute">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentRoute")
	public native AVAudioSessionRouteDescription currentRoute();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native AVAudioSessionDelegate delegate();

	@Generated
	@Selector("init")
	public native AVAudioSession init();

	/**
	 * inputDataSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputDataSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputDataSource")
	public native AVAudioSessionDataSourceDescription inputDataSource();

	/**
	 * inputDataSources</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputDataSources">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputDataSources")
	public native NSArray<? extends AVAudioSessionDataSourceDescription> inputDataSources();

	/**
	 * inputGain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputGain">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputGain")
	public native float inputGain();

	/**
	 * inputIsAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputIsAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("inputIsAvailable")
	public native boolean inputIsAvailable();

	/**
	 * inputLatency</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputLatency">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputLatency")
	public native double inputLatency();

	/**
	 * inputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputNumberOfChannels")
	@NInt
	public native long inputNumberOfChannels();

	/**
	 * inputAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isInputAvailable")
	public native boolean isInputAvailable();

	/**
	 * inputGainSettable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/inputGainSettable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isInputGainSettable")
	public native boolean isInputGainSettable();

	/**
	 * otherAudioPlaying</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/otherAudioPlaying">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isOtherAudioPlaying")
	public native boolean isOtherAudioPlaying();

	/**
	 * maximumInputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/maximumInputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumInputNumberOfChannels")
	@NInt
	public native long maximumInputNumberOfChannels();

	/**
	 * maximumOutputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/maximumOutputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumOutputNumberOfChannels")
	@NInt
	public native long maximumOutputNumberOfChannels();

	/**
	 * mode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/mode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mode")
	public native String mode();

	/**
	 * outputDataSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/outputDataSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputDataSource")
	public native AVAudioSessionDataSourceDescription outputDataSource();

	/**
	 * outputDataSources</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/outputDataSources">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputDataSources")
	public native NSArray<? extends AVAudioSessionDataSourceDescription> outputDataSources();

	/**
	 * outputLatency</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/outputLatency">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputLatency")
	public native double outputLatency();

	/**
	 * outputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/outputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputNumberOfChannels")
	@NInt
	public native long outputNumberOfChannels();

	/**
	 * outputVolume</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/outputVolume">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputVolume")
	public native float outputVolume();

	/**
	 * overrideOutputAudioPort:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/overrideOutputAudioPort:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("overrideOutputAudioPort:error:")
	public native boolean overrideOutputAudioPortError(
			@NUInt long portOverride, Ptr<NSError> outError);

	/**
	 * preferredHardwareSampleRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/preferredHardwareSampleRate">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("preferredHardwareSampleRate")
	public native double preferredHardwareSampleRate();

	/**
	 * preferredIOBufferDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/preferredIOBufferDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredIOBufferDuration")
	public native double preferredIOBufferDuration();

	/**
	 * preferredInput</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/preferredInput">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredInput")
	public native AVAudioSessionPortDescription preferredInput();

	/**
	 * preferredInputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/preferredInputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredInputNumberOfChannels")
	@NInt
	public native long preferredInputNumberOfChannels();

	/**
	 * preferredOutputNumberOfChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/preferredOutputNumberOfChannels">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredOutputNumberOfChannels")
	@NInt
	public native long preferredOutputNumberOfChannels();

	/**
	 * preferredSampleRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/preferredSampleRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredSampleRate")
	public native double preferredSampleRate();

	/**
	 * recordPermission</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/recordPermission">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recordPermission")
	@NUInt
	public native long recordPermission();

	/**
	 * requestRecordPermission:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/requestRecordPermission:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestRecordPermission:")
	public native void requestRecordPermission(
			@ObjCBlock(name = "call_requestRecordPermission") Block_requestRecordPermission response);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestRecordPermission {
		@Generated
		void call_requestRecordPermission(boolean arg0);
	}

	/**
	 * sampleRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/sampleRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sampleRate")
	public native double sampleRate();

	/**
	 * secondaryAudioShouldBeSilencedHint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/secondaryAudioShouldBeSilencedHint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("secondaryAudioShouldBeSilencedHint")
	public native boolean secondaryAudioShouldBeSilencedHint();

	/**
	 * setActive:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setActive:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActive:error:")
	public native boolean setActiveError(boolean active, Ptr<NSError> outError);

	/**
	 * setActive:withFlags:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setActive:withFlags:error:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setActive:withFlags:error:")
	public native boolean setActiveWithFlagsError(boolean active,
			@NInt long flags, Ptr<NSError> outError);

	/**
	 * setActive:withOptions:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setActive:withOptions:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActive:withOptions:error:")
	public native boolean setActiveWithOptionsError(boolean active,
			@NUInt long options, Ptr<NSError> outError);

	/**
	 * setCategory:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setCategory:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCategory:error:")
	public native boolean setCategoryError(String category,
			Ptr<NSError> outError);

	/**
	 * setCategory:withOptions:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setCategory:withOptions:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCategory:withOptions:error:")
	public native boolean setCategoryWithOptionsError(String category,
			@NUInt long options, Ptr<NSError> outError);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) AVAudioSessionDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) AVAudioSessionDelegate value) {
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
	 * setInputDataSource:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setInputDataSource:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInputDataSource:error:")
	public native boolean setInputDataSourceError(
			AVAudioSessionDataSourceDescription dataSource,
			Ptr<NSError> outError);

	/**
	 * setInputGain:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setInputGain:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInputGain:error:")
	public native boolean setInputGainError(float gain, Ptr<NSError> outError);

	/**
	 * setMode:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setMode:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMode:error:")
	public native boolean setModeError(String mode, Ptr<NSError> outError);

	/**
	 * setOutputDataSource:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setOutputDataSource:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOutputDataSource:error:")
	public native boolean setOutputDataSourceError(
			AVAudioSessionDataSourceDescription dataSource,
			Ptr<NSError> outError);

	/**
	 * setPreferredHardwareSampleRate:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setPreferredHardwareSampleRate:error:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setPreferredHardwareSampleRate:error:")
	public native boolean setPreferredHardwareSampleRateError(
			double sampleRate, Ptr<NSError> outError);

	/**
	 * setPreferredIOBufferDuration:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setPreferredIOBufferDuration:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredIOBufferDuration:error:")
	public native boolean setPreferredIOBufferDurationError(double duration,
			Ptr<NSError> outError);

	/**
	 * setPreferredInput:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setPreferredInput:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredInput:error:")
	public native boolean setPreferredInputError(
			AVAudioSessionPortDescription inPort, Ptr<NSError> outError);

	/**
	 * setPreferredInputNumberOfChannels:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setPreferredInputNumberOfChannels:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredInputNumberOfChannels:error:")
	public native boolean setPreferredInputNumberOfChannelsError(
			@NInt long count, Ptr<NSError> outError);

	/**
	 * setPreferredOutputNumberOfChannels:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setPreferredOutputNumberOfChannels:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredOutputNumberOfChannels:error:")
	public native boolean setPreferredOutputNumberOfChannelsError(
			@NInt long count, Ptr<NSError> outError);

	/**
	 * setPreferredSampleRate:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instm/AVAudioSession/setPreferredSampleRate:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredSampleRate:error:")
	public native boolean setPreferredSampleRateError(double sampleRate,
			Ptr<NSError> outError);

	/**
	 * sharedInstance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/clm/AVAudioSession/sharedInstance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharedInstance")
	public static native AVAudioSession sharedInstance();

	/**
	 * availableCategories</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/availableCategories">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableCategories")
	public native NSArray<String> availableCategories();

	/**
	 * availableModes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSession_ClassReference/index.html#//apple_ref/occ/instp/AVAudioSession/availableModes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableModes")
	public native NSArray<String> availableModes();

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
