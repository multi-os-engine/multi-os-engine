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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coremedia.opaque.CMSampleBufferRef;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
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
public class AVCaptureStillImageOutput extends AVCaptureOutput {
	static {
		NatJ.register();
	}

	@Generated
	protected AVCaptureStillImageOutput(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVCaptureStillImageOutput alloc();

	/**
	 * automaticallyEnablesStillImageStabilizationWhenAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/automaticallyEnablesStillImageStabilizationWhenAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("automaticallyEnablesStillImageStabilizationWhenAvailable")
	public native boolean automaticallyEnablesStillImageStabilizationWhenAvailable();

	/**
	 * availableImageDataCVPixelFormatTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/availableImageDataCVPixelFormatTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableImageDataCVPixelFormatTypes")
	public native NSArray<?> availableImageDataCVPixelFormatTypes();

	/**
	 * availableImageDataCodecTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/availableImageDataCodecTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableImageDataCodecTypes")
	public native NSArray<?> availableImageDataCodecTypes();

	/**
	 * captureStillImageAsynchronouslyFromConnection:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instm/AVCaptureStillImageOutput/captureStillImageAsynchronouslyFromConnection:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("captureStillImageAsynchronouslyFromConnection:completionHandler:")
	public native void captureStillImageAsynchronouslyFromConnectionCompletionHandler(
			AVCaptureConnection connection,
			@ObjCBlock(name = "call_captureStillImageAsynchronouslyFromConnectionCompletionHandler") Block_captureStillImageAsynchronouslyFromConnectionCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_captureStillImageAsynchronouslyFromConnectionCompletionHandler {
		@Generated
		void call_captureStillImageAsynchronouslyFromConnectionCompletionHandler(
				CMSampleBufferRef arg0, NSError arg1);
	}

	/**
	 * captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instm/AVCaptureStillImageOutput/captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:")
	public native void captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler(
			AVCaptureConnection connection,
			NSArray<?> settings,
			@ObjCBlock(name = "call_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler") Block_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler {
		@Generated
		void call_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler(
				CMSampleBufferRef arg0,
				AVCaptureBracketedStillImageSettings arg1, NSError arg2);
	}

	@Generated
	@Selector("init")
	public native AVCaptureStillImageOutput init();

	/**
	 * capturingStillImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/capturingStillImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isCapturingStillImage")
	public native boolean isCapturingStillImage();

	/**
	 * highResolutionStillImageOutputEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/highResolutionStillImageOutputEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHighResolutionStillImageOutputEnabled")
	public native boolean isHighResolutionStillImageOutputEnabled();

	/**
	 * stillImageStabilizationActive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/stillImageStabilizationActive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isStillImageStabilizationActive")
	public native boolean isStillImageStabilizationActive();

	/**
	 * stillImageStabilizationSupported</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/stillImageStabilizationSupported">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isStillImageStabilizationSupported")
	public native boolean isStillImageStabilizationSupported();

	/**
	 * jpegStillImageNSDataRepresentation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/clm/AVCaptureStillImageOutput/jpegStillImageNSDataRepresentation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jpegStillImageNSDataRepresentation:")
	public static native NSData jpegStillImageNSDataRepresentation(
			CMSampleBufferRef jpegSampleBuffer);

	/**
	 * maxBracketedCaptureStillImageCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/maxBracketedCaptureStillImageCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maxBracketedCaptureStillImageCount")
	@NUInt
	public native long maxBracketedCaptureStillImageCount();

	/**
	 * outputSettings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/outputSettings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputSettings")
	public native NSDictionary<?, ?> outputSettings();

	/**
	 * prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instm/AVCaptureStillImageOutput/prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:")
	public native void prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler(
			AVCaptureConnection connection,
			NSArray<?> settings,
			@ObjCBlock(name = "call_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler") Block_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler {
		@Generated
		void call_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler(
				boolean arg0, NSError arg1);
	}

	/**
	 * automaticallyEnablesStillImageStabilizationWhenAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/automaticallyEnablesStillImageStabilizationWhenAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAutomaticallyEnablesStillImageStabilizationWhenAvailable:")
	public native void setAutomaticallyEnablesStillImageStabilizationWhenAvailable(
			boolean value);

	/**
	 * highResolutionStillImageOutputEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/highResolutionStillImageOutputEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHighResolutionStillImageOutputEnabled:")
	public native void setHighResolutionStillImageOutputEnabled(boolean value);

	/**
	 * outputSettings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureStillImageOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureStillImageOutput/outputSettings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOutputSettings:")
	public native void setOutputSettings(NSDictionary<?, ?> value);

	@Generated
	@Selector("isLensStabilizationDuringBracketedCaptureEnabled")
	public native boolean isLensStabilizationDuringBracketedCaptureEnabled();

	@Generated
	@Selector("isLensStabilizationDuringBracketedCaptureSupported")
	public native boolean isLensStabilizationDuringBracketedCaptureSupported();

	@Generated
	@Selector("setLensStabilizationDuringBracketedCaptureEnabled:")
	public native void setLensStabilizationDuringBracketedCaptureEnabled(boolean value);

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
