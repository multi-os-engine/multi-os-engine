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

package ios.audiounit.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

import ios.audiounit.opaque.AudioComponent;
import ios.audiounit.opaque.AudioComponentInstance;
import ios.audiounit.struct.AudioComponentDescription;
import ios.audiounit.struct.MusicDeviceNoteParams;
import ios.coreaudio.struct.AudioBufferList;
import ios.coreaudio.struct.AudioTimeStamp;
import ios.corefoundation.opaque.CFStringRef;
import ios.uikit.UIImage;

@Generated
@Library("AudioUnit")
@Runtime(CRuntime.class)
public final class AudioUnit {
	static {
		NatJ.register();
	}

	@Generated
	private AudioUnit() {
	}

	/**
	 * AudioComponentFindNext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentFindNext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native AudioComponent AudioComponentFindNext(
			AudioComponent inComponent,
			@UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc);

	/**
	 * AudioComponentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentCount">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioComponentCount(
			@UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc);

	/**
	 * AudioComponentCopyName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentCopyName">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioComponentCopyName(AudioComponent inComponent,
			Ptr<CFStringRef> outName);

	/**
	 * AudioComponentGetDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentGetDescription">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioComponentGetDescription(
			AudioComponent inComponent,
			@UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription outDesc);

	/**
	 * AudioComponentGetVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentGetVersion">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioComponentGetVersion(
			AudioComponent inComponent, IntPtr outVersion);

	/**
	 * AudioComponentInstanceNew</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentInstanceNew">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioComponentInstanceNew(
			AudioComponent inComponent, Ptr<AudioComponentInstance> outInstance);

	/**
	 * AudioComponentInstanceDispose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentInstanceDispose">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioComponentInstanceDispose(
			AudioComponentInstance inInstance);

	/**
	 * AudioComponentInstanceGetComponent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentInstanceGetComponent">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native AudioComponent AudioComponentInstanceGetComponent(
			AudioComponentInstance inInstance);

	/**
	 * AudioComponentInstanceCanDo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioComponentServicesReference/index.html#//apple_ref/c/func/AudioComponentInstanceCanDo">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte AudioComponentInstanceCanDo(
			AudioComponentInstance inInstance, short inSelectorID);

	@Generated
	@CFunction
	public static native AudioComponent AudioComponentRegister(
			@UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc,
			CFStringRef inName,
			int inVersion,
			@FunctionPtr(name = "call_AudioComponentRegister") Function_AudioComponentRegister inFactory);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AudioComponentRegister {
		@Generated
		VoidPtr call_AudioComponentRegister(
				@UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription arg0);
	}

	/**
	 * AudioUnitInitialize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitInitialize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitInitialize(AudioComponentInstance inUnit);

	/**
	 * AudioUnitUninitialize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitUninitialize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitUninitialize(AudioComponentInstance inUnit);

	/**
	 * AudioUnitGetPropertyInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitGetPropertyInfo">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitGetPropertyInfo(
			AudioComponentInstance inUnit, int inID, int inScope,
			int inElement, IntPtr outDataSize, BytePtr outWritable);

	/**
	 * AudioUnitGetProperty</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitGetProperty">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitGetProperty(
			AudioComponentInstance inUnit, int inID, int inScope,
			int inElement, VoidPtr outData, IntPtr ioDataSize);

	/**
	 * AudioUnitSetProperty</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitSetProperty">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitSetProperty(
			AudioComponentInstance inUnit, int inID, int inScope,
			int inElement, ConstVoidPtr inData, int inDataSize);

	/**
	 * AudioUnitAddPropertyListener</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitAddPropertyListener">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitAddPropertyListener(
			AudioComponentInstance inUnit,
			int inID,
			@FunctionPtr(name = "call_AudioUnitAddPropertyListener") Function_AudioUnitAddPropertyListener inProc,
			VoidPtr inProcUserData);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AudioUnitAddPropertyListener {
		@Generated
		void call_AudioUnitAddPropertyListener(VoidPtr arg0,
				VoidPtr arg1, int arg2, int arg3, int arg4);
	}

	/**
	 * AudioUnitRemovePropertyListenerWithUserData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitRemovePropertyListenerWithUserData">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitRemovePropertyListenerWithUserData(
			AudioComponentInstance inUnit,
			int inID,
			@FunctionPtr(name = "call_AudioUnitRemovePropertyListenerWithUserData") Function_AudioUnitRemovePropertyListenerWithUserData inProc,
			VoidPtr inProcUserData);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AudioUnitRemovePropertyListenerWithUserData {
		@Generated
		void call_AudioUnitRemovePropertyListenerWithUserData(
				VoidPtr arg0, VoidPtr arg1, int arg2, int arg3, int arg4);
	}

	/**
	 * AudioUnitAddRenderNotify</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitAddRenderNotify">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitAddRenderNotify(
			AudioComponentInstance inUnit,
			@FunctionPtr(name = "call_AudioUnitAddRenderNotify") Function_AudioUnitAddRenderNotify inProc,
			VoidPtr inProcUserData);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AudioUnitAddRenderNotify {
		@Generated
		int call_AudioUnitAddRenderNotify(
				VoidPtr arg0,
				IntPtr arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2,
				int arg3,
				int arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
	}

	/**
	 * AudioUnitRemoveRenderNotify</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitRemoveRenderNotify">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitRemoveRenderNotify(
			AudioComponentInstance inUnit,
			@FunctionPtr(name = "call_AudioUnitRemoveRenderNotify") Function_AudioUnitRemoveRenderNotify inProc,
			VoidPtr inProcUserData);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AudioUnitRemoveRenderNotify {
		@Generated
		int call_AudioUnitRemoveRenderNotify(
				VoidPtr arg0,
				IntPtr arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2,
				int arg3,
				int arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
	}

	/**
	 * AudioUnitGetParameter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitGetParameter">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitGetParameter(
			AudioComponentInstance inUnit, int inID, int inScope,
			int inElement, FloatPtr outValue);

	/**
	 * AudioUnitSetParameter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitSetParameter">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitSetParameter(
			AudioComponentInstance inUnit, int inID, int inScope,
			int inElement, float inValue, int inBufferOffsetInFrames);

	/**
	 * AudioUnitScheduleParameters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitScheduleParameters">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitScheduleParameters(
			AudioComponentInstance inUnit, VoidPtr inParameterEvent,
			int inNumParamEvents);

	/**
	 * AudioUnitRender</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitRender">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitRender(
			AudioComponentInstance inUnit,
			IntPtr ioActionFlags,
			@UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
			int inOutputBusNumber,
			int inNumberFrames,
			@UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

	@Generated
	@CFunction
	public static native int AudioUnitProcess(
			AudioComponentInstance inUnit,
			IntPtr ioActionFlags,
			@UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
			int inNumberFrames,
			@UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

	@Generated
	@CFunction
	public static native int AudioUnitProcessMultiple(
			AudioComponentInstance inUnit,
			IntPtr ioActionFlags,
			@UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
			int inNumberFrames, int inNumberInputBufferLists,
			Ptr<ConstPtr<AudioBufferList>> inInputBufferLists,
			int inNumberOutputBufferLists,
			Ptr<Ptr<AudioBufferList>> ioOutputBufferLists);

	/**
	 * AudioUnitReset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUComponentServicesReference/index.html#//apple_ref/c/func/AudioUnitReset">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioUnitReset(AudioComponentInstance inUnit,
			int inScope, int inElement);

	@Generated
	@CFunction
	public static native int AudioOutputUnitPublish(
			@UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc,
			CFStringRef inName, int inVersion,
			AudioComponentInstance inOutputUnit);

	@Generated
	@CFunction
	public static native UIImage AudioOutputUnitGetHostIcon(
			AudioComponentInstance au, float desiredPointSize);

	@Generated
	@CFunction
	public static native UIImage AudioComponentGetIcon(AudioComponent comp,
			float desiredPointSize);

	@Generated
	@CFunction
	public static native double AudioComponentGetLastActiveTime(
			AudioComponent comp);

	/**
	 * AudioOutputUnitStart</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioOutputUnitServicesReference/index.html#//apple_ref/c/func/AudioOutputUnitStart">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioOutputUnitStart(AudioComponentInstance ci);

	/**
	 * AudioOutputUnitStop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AudioOutputUnitServicesReference/index.html#//apple_ref/c/func/AudioOutputUnitStop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int AudioOutputUnitStop(AudioComponentInstance ci);

	@Generated
	@CFunction
	public static native int MusicDeviceMIDIEvent(
			AudioComponentInstance inUnit, int inStatus, int inData1,
			int inData2, int inOffsetSampleFrame);

	@Generated
	@CFunction
	public static native int MusicDeviceSysEx(
			AudioComponentInstance inUnit,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String inData,
			int inLength);

	@Generated
	@CFunction
	public static native int MusicDeviceStartNote(
			AudioComponentInstance inUnit,
			int inInstrument,
			int inGroupID,
			IntPtr outNoteInstanceID,
			int inOffsetSampleFrame,
			@UncertainArgument("Options: reference, array Fallback: reference") MusicDeviceNoteParams inParams);

	@Generated
	@CFunction
	public static native int MusicDeviceStopNote(AudioComponentInstance inUnit,
			int inGroupID, int inNoteInstanceID, int inOffsetSampleFrame);

	@Generated
	@CVariable()
	public static native CFStringRef kAudioComponentRegistrationsChangedNotification();

	@Generated
	@CFunction
	public static native void AudioComponentInstantiate(AudioComponent inComponent, int inOptions,
			@ObjCBlock(name = "call_AudioComponentInstantiate") Block_AudioComponentInstantiate inCompletionHandler);

	@Runtime(CRuntime.class)
	@Generated
	public interface Block_AudioComponentInstantiate {
		@Generated
		void call_AudioComponentInstantiate(AudioComponentInstance arg0, int arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native int GetAudioUnitParameterDisplayType(int flags);

	@Generated
	@Inline
	@CFunction
	public static native int SetAudioUnitParameterDisplayType(int flags, int displayType);

	@Generated
	@CVariable()
	public static native CFStringRef kAudioComponentInstanceInvalidationNotification();
}
