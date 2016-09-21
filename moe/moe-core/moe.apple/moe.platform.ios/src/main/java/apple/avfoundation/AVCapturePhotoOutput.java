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
import apple.avfoundation.protocol.AVCapturePhotoCaptureDelegate;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
public class AVCapturePhotoOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCapturePhotoOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("DNGPhotoDataRepresentationForRawSampleBuffer:previewPhotoSampleBuffer:")
    public static native NSData DNGPhotoDataRepresentationForRawSampleBufferPreviewPhotoSampleBuffer(
            CMSampleBufferRef rawSampleBuffer, CMSampleBufferRef previewPhotoSampleBuffer);

    @Generated
    @Selector("JPEGPhotoDataRepresentationForJPEGSampleBuffer:previewPhotoSampleBuffer:")
    public static native NSData JPEGPhotoDataRepresentationForJPEGSampleBufferPreviewPhotoSampleBuffer(
            CMSampleBufferRef JPEGSampleBuffer, CMSampleBufferRef previewPhotoSampleBuffer);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCapturePhotoOutput alloc();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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

    @Generated
    @Selector("availablePhotoCodecTypes")
    public native NSArray<String> availablePhotoCodecTypes();

    @Generated
    @Selector("availablePhotoPixelFormatTypes")
    public native NSArray<? extends NSNumber> availablePhotoPixelFormatTypes();

    @Generated
    @Selector("availableRawPhotoPixelFormatTypes")
    public native NSArray<? extends NSNumber> availableRawPhotoPixelFormatTypes();

    @Generated
    @Selector("capturePhotoWithSettings:delegate:")
    public native void capturePhotoWithSettingsDelegate(AVCapturePhotoSettings settings,
            @Mapped(ObjCObjectMapper.class) AVCapturePhotoCaptureDelegate delegate);

    @Generated
    @Selector("init")
    public native AVCapturePhotoOutput init();

    @Generated
    @Selector("isFlashScene")
    public native boolean isFlashScene();

    @Generated
    @Selector("isHighResolutionCaptureEnabled")
    public native boolean isHighResolutionCaptureEnabled();

    @Generated
    @Selector("setHighResolutionCaptureEnabled:")
    public native void setHighResolutionCaptureEnabled(boolean value);

    @Generated
    @Selector("isLensStabilizationDuringBracketedCaptureSupported")
    public native boolean isLensStabilizationDuringBracketedCaptureSupported();

    @Generated
    @Selector("isLivePhotoAutoTrimmingEnabled")
    public native boolean isLivePhotoAutoTrimmingEnabled();

    @Generated
    @Selector("setLivePhotoAutoTrimmingEnabled:")
    public native void setLivePhotoAutoTrimmingEnabled(boolean value);

    @Generated
    @Selector("isLivePhotoCaptureEnabled")
    public native boolean isLivePhotoCaptureEnabled();

    @Generated
    @Selector("setLivePhotoCaptureEnabled:")
    public native void setLivePhotoCaptureEnabled(boolean value);

    @Generated
    @Selector("isLivePhotoCaptureSupported")
    public native boolean isLivePhotoCaptureSupported();

    @Generated
    @Selector("isLivePhotoCaptureSuspended")
    public native boolean isLivePhotoCaptureSuspended();

    @Generated
    @Selector("setLivePhotoCaptureSuspended:")
    public native void setLivePhotoCaptureSuspended(boolean value);

    @Generated
    @Selector("isStillImageStabilizationScene")
    public native boolean isStillImageStabilizationScene();

    @Generated
    @Selector("isStillImageStabilizationSupported")
    public native boolean isStillImageStabilizationSupported();

    @Generated
    @Selector("maxBracketedCapturePhotoCount")
    @NUInt
    public native long maxBracketedCapturePhotoCount();

    @Generated
    @Selector("photoSettingsForSceneMonitoring")
    public native AVCapturePhotoSettings photoSettingsForSceneMonitoring();

    @Generated
    @Selector("preparedPhotoSettingsArray")
    public native NSArray<? extends AVCapturePhotoSettings> preparedPhotoSettingsArray();

    @Generated
    @Selector("setPhotoSettingsForSceneMonitoring:")
    public native void setPhotoSettingsForSceneMonitoring(AVCapturePhotoSettings value);

    @Generated
    @Selector("setPreparedPhotoSettingsArray:completionHandler:")
    public native void setPreparedPhotoSettingsArrayCompletionHandler(
            NSArray<? extends AVCapturePhotoSettings> preparedPhotoSettingsArray,
            @ObjCBlock(name = "call_setPreparedPhotoSettingsArrayCompletionHandler") Block_setPreparedPhotoSettingsArrayCompletionHandler completionHandler);

    @Generated
    @Selector("supportedFlashModes")
    public native NSArray<? extends NSNumber> supportedFlashModes();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPreparedPhotoSettingsArrayCompletionHandler {
        @Generated
        void call_setPreparedPhotoSettingsArrayCompletionHandler(boolean arg0, NSError arg1);
    }
}
