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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureStillImageOutput alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("jpegStillImageNSDataRepresentation:")
    public static native NSData jpegStillImageNSDataRepresentation(CMSampleBufferRef jpegSampleBuffer);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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

    @Generated
    @Selector("automaticallyEnablesStillImageStabilizationWhenAvailable")
    public native boolean automaticallyEnablesStillImageStabilizationWhenAvailable();

    @Generated
    @Selector("availableImageDataCVPixelFormatTypes")
    public native NSArray<? extends NSNumber> availableImageDataCVPixelFormatTypes();

    @Generated
    @Selector("availableImageDataCodecTypes")
    public native NSArray<String> availableImageDataCodecTypes();

    @Generated
    @Selector("captureStillImageAsynchronouslyFromConnection:completionHandler:")
    public native void captureStillImageAsynchronouslyFromConnectionCompletionHandler(AVCaptureConnection connection,
            @ObjCBlock(name = "call_captureStillImageAsynchronouslyFromConnectionCompletionHandler") Block_captureStillImageAsynchronouslyFromConnectionCompletionHandler handler);

    @Generated
    @Selector("captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:")
    public native void captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler(
            AVCaptureConnection connection, NSArray<? extends AVCaptureBracketedStillImageSettings> settings,
            @ObjCBlock(name = "call_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler") Block_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler handler);

    @Generated
    @Selector("init")
    public native AVCaptureStillImageOutput init();

    @Generated
    @Selector("isCapturingStillImage")
    public native boolean isCapturingStillImage();

    @Generated
    @Selector("isHighResolutionStillImageOutputEnabled")
    public native boolean isHighResolutionStillImageOutputEnabled();

    @Generated
    @Selector("setHighResolutionStillImageOutputEnabled:")
    public native void setHighResolutionStillImageOutputEnabled(boolean value);

    @Generated
    @Selector("isLensStabilizationDuringBracketedCaptureEnabled")
    public native boolean isLensStabilizationDuringBracketedCaptureEnabled();

    @Generated
    @Selector("setLensStabilizationDuringBracketedCaptureEnabled:")
    public native void setLensStabilizationDuringBracketedCaptureEnabled(boolean value);

    @Generated
    @Selector("isLensStabilizationDuringBracketedCaptureSupported")
    public native boolean isLensStabilizationDuringBracketedCaptureSupported();

    @Generated
    @Selector("isStillImageStabilizationActive")
    public native boolean isStillImageStabilizationActive();

    @Generated
    @Selector("isStillImageStabilizationSupported")
    public native boolean isStillImageStabilizationSupported();

    @Generated
    @Selector("maxBracketedCaptureStillImageCount")
    @NUInt
    public native long maxBracketedCaptureStillImageCount();

    @Generated
    @Selector("outputSettings")
    public native NSDictionary<String, ?> outputSettings();

    @Generated
    @Selector("prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:")
    public native void prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler(
            AVCaptureConnection connection, NSArray<? extends AVCaptureBracketedStillImageSettings> settings,
            @ObjCBlock(name = "call_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler") Block_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler handler);

    @Generated
    @Selector("setAutomaticallyEnablesStillImageStabilizationWhenAvailable:")
    public native void setAutomaticallyEnablesStillImageStabilizationWhenAvailable(boolean value);

    @Generated
    @Selector("setOutputSettings:")
    public native void setOutputSettings(NSDictionary<String, ?> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_captureStillImageAsynchronouslyFromConnectionCompletionHandler {
        @Generated
        void call_captureStillImageAsynchronouslyFromConnectionCompletionHandler(CMSampleBufferRef arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler {
        @Generated
        void call_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler(
                CMSampleBufferRef arg0, AVCaptureBracketedStillImageSettings arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler {
        @Generated
        void call_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler(boolean arg0,
                NSError arg1);
    }
}
