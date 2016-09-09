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
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.coremedia.struct.CMTime;
import ios.foundation.NSArray;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureConnection extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected AVCaptureConnection(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("activeVideoStabilizationMode")
	@NInt
	public native long activeVideoStabilizationMode();

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVCaptureConnection alloc();

	/**
	 * audioChannels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/audioChannels">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioChannels")
	public native NSArray<?> audioChannels();

	/**
	 * automaticallyAdjustsVideoMirroring</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/automaticallyAdjustsVideoMirroring">iOS Dev Center</a>
	 */
	@Generated
	@Selector("automaticallyAdjustsVideoMirroring")
	public native boolean automaticallyAdjustsVideoMirroring();

	/**
	 * connectionWithInputPort:videoPreviewLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/clm/AVCaptureConnection/connectionWithInputPort:videoPreviewLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("connectionWithInputPort:videoPreviewLayer:")
	public static native AVCaptureConnection connectionWithInputPortVideoPreviewLayer(
			AVCaptureInputPort port, AVCaptureVideoPreviewLayer layer);

	/**
	 * connectionWithInputPorts:output:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/clm/AVCaptureConnection/connectionWithInputPorts:output:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("connectionWithInputPorts:output:")
	public static native AVCaptureConnection connectionWithInputPortsOutput(
			NSArray<?> ports, AVCaptureOutput output);

	/**
	 * enablesVideoStabilizationWhenAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/enablesVideoStabilizationWhenAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("enablesVideoStabilizationWhenAvailable")
	public native boolean enablesVideoStabilizationWhenAvailable();

	@Generated
	@Selector("init")
	public native AVCaptureConnection init();

	/**
	 * initWithInputPort:videoPreviewLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instm/AVCaptureConnection/initWithInputPort:videoPreviewLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithInputPort:videoPreviewLayer:")
	public native AVCaptureConnection initWithInputPortVideoPreviewLayer(
			AVCaptureInputPort port, AVCaptureVideoPreviewLayer layer);

	/**
	 * initWithInputPorts:output:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instm/AVCaptureConnection/initWithInputPorts:output:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithInputPorts:output:")
	public native AVCaptureConnection initWithInputPortsOutput(NSArray<?> ports,
			AVCaptureOutput output);

	/**
	 * inputPorts</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/inputPorts">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputPorts")
	public native NSArray<?> inputPorts();

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isActive")
	public native boolean isActive();

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	/**
	 * supportsVideoMaxFrameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/supportsVideoMaxFrameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("isVideoMaxFrameDurationSupported")
	public native boolean isVideoMaxFrameDurationSupported();

	/**
	 * supportsVideoMinFrameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/supportsVideoMinFrameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("isVideoMinFrameDurationSupported")
	public native boolean isVideoMinFrameDurationSupported();

	/**
	 * videoMirrored</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoMirrored">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isVideoMirrored")
	public native boolean isVideoMirrored();

	/**
	 * supportsVideoMirroring</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/supportsVideoMirroring">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isVideoMirroringSupported")
	public native boolean isVideoMirroringSupported();

	/**
	 * supportsVideoOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/supportsVideoOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isVideoOrientationSupported")
	public native boolean isVideoOrientationSupported();

	/**
	 * videoStabilizationEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoStabilizationEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("isVideoStabilizationEnabled")
	public native boolean isVideoStabilizationEnabled();

	/**
	 * supportsVideoStabilization</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/supportsVideoStabilization">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isVideoStabilizationSupported")
	public native boolean isVideoStabilizationSupported();

	/**
	 * output</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/output">iOS Dev Center</a>
	 */
	@Generated
	@Selector("output")
	public native AVCaptureOutput output();

	@Generated
	@Selector("preferredVideoStabilizationMode")
	@NInt
	public native long preferredVideoStabilizationMode();

	/**
	 * automaticallyAdjustsVideoMirroring</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/automaticallyAdjustsVideoMirroring">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAutomaticallyAdjustsVideoMirroring:")
	public native void setAutomaticallyAdjustsVideoMirroring(boolean value);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean value);

	/**
	 * enablesVideoStabilizationWhenAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/enablesVideoStabilizationWhenAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setEnablesVideoStabilizationWhenAvailable:")
	public native void setEnablesVideoStabilizationWhenAvailable(boolean value);

	@Generated
	@Selector("setPreferredVideoStabilizationMode:")
	public native void setPreferredVideoStabilizationMode(@NInt long value);

	/**
	 * videoMaxFrameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoMaxFrameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setVideoMaxFrameDuration:")
	public native void setVideoMaxFrameDuration(@ByValue CMTime value);

	/**
	 * videoMinFrameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoMinFrameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setVideoMinFrameDuration:")
	public native void setVideoMinFrameDuration(@ByValue CMTime value);

	/**
	 * videoMirrored</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoMirrored">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVideoMirrored:")
	public native void setVideoMirrored(boolean value);

	/**
	 * videoOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVideoOrientation:")
	public native void setVideoOrientation(@NInt long value);

	/**
	 * videoScaleAndCropFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoScaleAndCropFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVideoScaleAndCropFactor:")
	public native void setVideoScaleAndCropFactor(@NFloat double value);

	/**
	 * videoMaxFrameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoMaxFrameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("videoMaxFrameDuration")
	@ByValue
	public native CMTime videoMaxFrameDuration();

	/**
	 * videoMaxScaleAndCropFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoMaxScaleAndCropFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoMaxScaleAndCropFactor")
	@NFloat
	public native double videoMaxScaleAndCropFactor();

	/**
	 * videoMinFrameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoMinFrameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("videoMinFrameDuration")
	@ByValue
	public native CMTime videoMinFrameDuration();

	/**
	 * videoOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoOrientation")
	@NInt
	public native long videoOrientation();

	/**
	 * videoPreviewLayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoPreviewLayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoPreviewLayer")
	public native AVCaptureVideoPreviewLayer videoPreviewLayer();

	/**
	 * videoScaleAndCropFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureConnection_Class/index.html#//apple_ref/occ/instp/AVCaptureConnection/videoScaleAndCropFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoScaleAndCropFactor")
	@NFloat
	public native double videoScaleAndCropFactor();

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
