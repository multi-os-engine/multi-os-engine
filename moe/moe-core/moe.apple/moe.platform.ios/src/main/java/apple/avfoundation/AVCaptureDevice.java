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
import apple.avfoundation.struct.AVCaptureWhiteBalanceChromaticityValues;
import apple.avfoundation.struct.AVCaptureWhiteBalanceGains;
import apple.avfoundation.struct.AVCaptureWhiteBalanceTemperatureAndTintValues;
import apple.coregraphics.struct.CGPoint;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
public class AVCaptureDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDevice alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("authorizationStatusForMediaType:")
    @NInt
    public static native long authorizationStatusForMediaType(String mediaType);

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
    @Selector("defaultDeviceWithDeviceType:mediaType:position:")
    public static native AVCaptureDevice defaultDeviceWithDeviceTypeMediaTypePosition(String deviceType,
            String mediaType, @NInt long position);

    @Generated
    @Selector("defaultDeviceWithMediaType:")
    public static native AVCaptureDevice defaultDeviceWithMediaType(String mediaType);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("deviceWithUniqueID:")
    public static native AVCaptureDevice deviceWithUniqueID(String deviceUniqueID);

    @Generated
    @Selector("devices")
    public static native NSArray<? extends AVCaptureDevice> devices();

    @Generated
    @Selector("devicesWithMediaType:")
    public static native NSArray<? extends AVCaptureDevice> devicesWithMediaType(String mediaType);

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
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("requestAccessForMediaType:completionHandler:")
    public static native void requestAccessForMediaTypeCompletionHandler(String mediaType,
            @ObjCBlock(name = "call_requestAccessForMediaTypeCompletionHandler") Block_requestAccessForMediaTypeCompletionHandler handler);

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
    @Selector("ISO")
    public native float ISO();

    @Generated
    @Selector("activeColorSpace")
    @NInt
    public native long activeColorSpace();

    @Generated
    @Selector("activeFormat")
    public native AVCaptureDeviceFormat activeFormat();

    @Generated
    @Selector("activeVideoMaxFrameDuration")
    @ByValue
    public native CMTime activeVideoMaxFrameDuration();

    @Generated
    @Selector("activeVideoMinFrameDuration")
    @ByValue
    public native CMTime activeVideoMinFrameDuration();

    @Generated
    @Selector("autoFocusRangeRestriction")
    @NInt
    public native long autoFocusRangeRestriction();

    @Generated
    @Selector("automaticallyAdjustsVideoHDREnabled")
    public native boolean automaticallyAdjustsVideoHDREnabled();

    @Generated
    @Selector("automaticallyEnablesLowLightBoostWhenAvailable")
    public native boolean automaticallyEnablesLowLightBoostWhenAvailable();

    @Generated
    @Selector("cancelVideoZoomRamp")
    public native void cancelVideoZoomRamp();

    @Generated
    @Selector("chromaticityValuesForDeviceWhiteBalanceGains:")
    @ByValue
    public native AVCaptureWhiteBalanceChromaticityValues chromaticityValuesForDeviceWhiteBalanceGains(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains);

    @Generated
    @Selector("deviceType")
    public native String deviceType();

    @Generated
    @Selector("deviceWhiteBalanceGains")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGains();

    @Generated
    @Selector("deviceWhiteBalanceGainsForChromaticityValues:")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGainsForChromaticityValues(
            @ByValue AVCaptureWhiteBalanceChromaticityValues chromaticityValues);

    @Generated
    @Selector("deviceWhiteBalanceGainsForTemperatureAndTintValues:")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGainsForTemperatureAndTintValues(
            @ByValue AVCaptureWhiteBalanceTemperatureAndTintValues tempAndTintValues);

    @Generated
    @Selector("exposureDuration")
    @ByValue
    public native CMTime exposureDuration();

    @Generated
    @Selector("exposureMode")
    @NInt
    public native long exposureMode();

    @Generated
    @Selector("exposurePointOfInterest")
    @ByValue
    public native CGPoint exposurePointOfInterest();

    @Generated
    @Selector("exposureTargetBias")
    public native float exposureTargetBias();

    @Generated
    @Selector("exposureTargetOffset")
    public native float exposureTargetOffset();

    @Generated
    @Selector("flashMode")
    @NInt
    public native long flashMode();

    @Generated
    @Selector("focusMode")
    @NInt
    public native long focusMode();

    @Generated
    @Selector("focusPointOfInterest")
    @ByValue
    public native CGPoint focusPointOfInterest();

    @Generated
    @Selector("formats")
    public native NSArray<? extends AVCaptureDeviceFormat> formats();

    @Generated
    @Selector("grayWorldDeviceWhiteBalanceGains")
    @ByValue
    public native AVCaptureWhiteBalanceGains grayWorldDeviceWhiteBalanceGains();

    @Generated
    @Selector("hasFlash")
    public native boolean hasFlash();

    @Generated
    @Selector("hasMediaType:")
    public native boolean hasMediaType(String mediaType);

    @Generated
    @Selector("hasTorch")
    public native boolean hasTorch();

    @Generated
    @Selector("init")
    public native AVCaptureDevice init();

    @Generated
    @Selector("isAdjustingExposure")
    public native boolean isAdjustingExposure();

    @Generated
    @Selector("isAdjustingFocus")
    public native boolean isAdjustingFocus();

    @Generated
    @Selector("isAdjustingWhiteBalance")
    public native boolean isAdjustingWhiteBalance();

    @Generated
    @Selector("isAutoFocusRangeRestrictionSupported")
    public native boolean isAutoFocusRangeRestrictionSupported();

    @Generated
    @Selector("isConnected")
    public native boolean isConnected();

    @Generated
    @Selector("isExposureModeSupported:")
    public native boolean isExposureModeSupported(@NInt long exposureMode);

    @Generated
    @Selector("isExposurePointOfInterestSupported")
    public native boolean isExposurePointOfInterestSupported();

    @Generated
    @Selector("isFlashActive")
    public native boolean isFlashActive();

    @Generated
    @Selector("isFlashAvailable")
    public native boolean isFlashAvailable();

    @Generated
    @Selector("isFlashModeSupported:")
    public native boolean isFlashModeSupported(@NInt long flashMode);

    @Generated
    @Selector("isFocusModeSupported:")
    public native boolean isFocusModeSupported(@NInt long focusMode);

    @Generated
    @Selector("isFocusPointOfInterestSupported")
    public native boolean isFocusPointOfInterestSupported();

    @Generated
    @Selector("isLockingFocusWithCustomLensPositionSupported")
    public native boolean isLockingFocusWithCustomLensPositionSupported();

    @Generated
    @Selector("isLockingWhiteBalanceWithCustomDeviceGainsSupported")
    public native boolean isLockingWhiteBalanceWithCustomDeviceGainsSupported();

    @Generated
    @Selector("isLowLightBoostEnabled")
    public native boolean isLowLightBoostEnabled();

    @Generated
    @Selector("isLowLightBoostSupported")
    public native boolean isLowLightBoostSupported();

    @Generated
    @Selector("isRampingVideoZoom")
    public native boolean isRampingVideoZoom();

    @Generated
    @Selector("isSmoothAutoFocusEnabled")
    public native boolean isSmoothAutoFocusEnabled();

    @Generated
    @Selector("setSmoothAutoFocusEnabled:")
    public native void setSmoothAutoFocusEnabled(boolean value);

    @Generated
    @Selector("isSmoothAutoFocusSupported")
    public native boolean isSmoothAutoFocusSupported();

    @Generated
    @Selector("isSubjectAreaChangeMonitoringEnabled")
    public native boolean isSubjectAreaChangeMonitoringEnabled();

    @Generated
    @Selector("setSubjectAreaChangeMonitoringEnabled:")
    public native void setSubjectAreaChangeMonitoringEnabled(boolean value);

    @Generated
    @Selector("isTorchActive")
    public native boolean isTorchActive();

    @Generated
    @Selector("isTorchAvailable")
    public native boolean isTorchAvailable();

    @Generated
    @Selector("isTorchModeSupported:")
    public native boolean isTorchModeSupported(@NInt long torchMode);

    @Generated
    @Selector("isVideoHDREnabled")
    public native boolean isVideoHDREnabled();

    @Generated
    @Selector("setVideoHDREnabled:")
    public native void setVideoHDREnabled(boolean value);

    @Generated
    @Selector("isWhiteBalanceModeSupported:")
    public native boolean isWhiteBalanceModeSupported(@NInt long whiteBalanceMode);

    @Generated
    @Selector("lensAperture")
    public native float lensAperture();

    @Generated
    @Selector("lensPosition")
    public native float lensPosition();

    @Generated
    @Selector("localizedName")
    public native String localizedName();

    @Generated
    @Selector("lockForConfiguration:")
    public native boolean lockForConfiguration(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("maxExposureTargetBias")
    public native float maxExposureTargetBias();

    @Generated
    @Selector("maxWhiteBalanceGain")
    public native float maxWhiteBalanceGain();

    @Generated
    @Selector("minExposureTargetBias")
    public native float minExposureTargetBias();

    @Generated
    @Selector("modelID")
    public native String modelID();

    @Generated
    @Selector("position")
    @NInt
    public native long position();

    @Generated
    @Selector("rampToVideoZoomFactor:withRate:")
    public native void rampToVideoZoomFactorWithRate(@NFloat double factor, float rate);

    @Generated
    @Selector("setActiveColorSpace:")
    public native void setActiveColorSpace(@NInt long value);

    @Generated
    @Selector("setActiveFormat:")
    public native void setActiveFormat(AVCaptureDeviceFormat value);

    @Generated
    @Selector("setActiveVideoMaxFrameDuration:")
    public native void setActiveVideoMaxFrameDuration(@ByValue CMTime value);

    @Generated
    @Selector("setActiveVideoMinFrameDuration:")
    public native void setActiveVideoMinFrameDuration(@ByValue CMTime value);

    @Generated
    @Selector("setAutoFocusRangeRestriction:")
    public native void setAutoFocusRangeRestriction(@NInt long value);

    @Generated
    @Selector("setAutomaticallyAdjustsVideoHDREnabled:")
    public native void setAutomaticallyAdjustsVideoHDREnabled(boolean value);

    @Generated
    @Selector("setAutomaticallyEnablesLowLightBoostWhenAvailable:")
    public native void setAutomaticallyEnablesLowLightBoostWhenAvailable(boolean value);

    @Generated
    @Selector("setExposureMode:")
    public native void setExposureMode(@NInt long value);

    @Generated
    @Selector("setExposureModeCustomWithDuration:ISO:completionHandler:")
    public native void setExposureModeCustomWithDurationISOCompletionHandler(@ByValue CMTime duration, float ISO,
            @ObjCBlock(name = "call_setExposureModeCustomWithDurationISOCompletionHandler") Block_setExposureModeCustomWithDurationISOCompletionHandler handler);

    @Generated
    @Selector("setExposurePointOfInterest:")
    public native void setExposurePointOfInterest(@ByValue CGPoint value);

    @Generated
    @Selector("setExposureTargetBias:completionHandler:")
    public native void setExposureTargetBiasCompletionHandler(float bias,
            @ObjCBlock(name = "call_setExposureTargetBiasCompletionHandler") Block_setExposureTargetBiasCompletionHandler handler);

    @Generated
    @Selector("setFlashMode:")
    public native void setFlashMode(@NInt long value);

    @Generated
    @Selector("setFocusMode:")
    public native void setFocusMode(@NInt long value);

    @Generated
    @Selector("setFocusModeLockedWithLensPosition:completionHandler:")
    public native void setFocusModeLockedWithLensPositionCompletionHandler(float lensPosition,
            @ObjCBlock(name = "call_setFocusModeLockedWithLensPositionCompletionHandler") Block_setFocusModeLockedWithLensPositionCompletionHandler handler);

    @Generated
    @Selector("setFocusPointOfInterest:")
    public native void setFocusPointOfInterest(@ByValue CGPoint value);

    @Generated
    @Selector("setTorchMode:")
    public native void setTorchMode(@NInt long value);

    @Generated
    @Selector("setTorchModeOnWithLevel:error:")
    public native boolean setTorchModeOnWithLevelError(float torchLevel,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setVideoZoomFactor:")
    public native void setVideoZoomFactor(@NFloat double value);

    @Generated
    @Selector("setWhiteBalanceMode:")
    public native void setWhiteBalanceMode(@NInt long value);

    @Generated
    @Selector("setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:")
    public native void setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains,
            @ObjCBlock(name = "call_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler") Block_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler handler);

    @Generated
    @Selector("supportsAVCaptureSessionPreset:")
    public native boolean supportsAVCaptureSessionPreset(String preset);

    @Generated
    @Selector("temperatureAndTintValuesForDeviceWhiteBalanceGains:")
    @ByValue
    public native AVCaptureWhiteBalanceTemperatureAndTintValues temperatureAndTintValuesForDeviceWhiteBalanceGains(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains);

    @Generated
    @Selector("torchLevel")
    public native float torchLevel();

    @Generated
    @Selector("torchMode")
    @NInt
    public native long torchMode();

    @Generated
    @Selector("uniqueID")
    public native String uniqueID();

    @Generated
    @Selector("unlockForConfiguration")
    public native void unlockForConfiguration();

    @Generated
    @Selector("videoZoomFactor")
    @NFloat
    public native double videoZoomFactor();

    @Generated
    @Selector("whiteBalanceMode")
    @NInt
    public native long whiteBalanceMode();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessForMediaTypeCompletionHandler {
        @Generated
        void call_requestAccessForMediaTypeCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExposureModeCustomWithDurationISOCompletionHandler {
        @Generated
        void call_setExposureModeCustomWithDurationISOCompletionHandler(@ByValue CMTime arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExposureTargetBiasCompletionHandler {
        @Generated
        void call_setExposureTargetBiasCompletionHandler(@ByValue CMTime arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFocusModeLockedWithLensPositionCompletionHandler {
        @Generated
        void call_setFocusModeLockedWithLensPositionCompletionHandler(@ByValue CMTime arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler {
        @Generated
        void call_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler(@ByValue CMTime arg0);
    }

    @Generated
    @Selector("activeDepthDataFormat")
    public native AVCaptureDeviceFormat activeDepthDataFormat();

    @Generated
    @Selector("dualCameraSwitchOverVideoZoomFactor")
    @NFloat
    public native double dualCameraSwitchOverVideoZoomFactor();

    @Generated
    @Selector("maxAvailableVideoZoomFactor")
    @NFloat
    public native double maxAvailableVideoZoomFactor();

    @Generated
    @Selector("minAvailableVideoZoomFactor")
    @NFloat
    public native double minAvailableVideoZoomFactor();

    @Generated
    @Selector("setActiveDepthDataFormat:")
    public native void setActiveDepthDataFormat(AVCaptureDeviceFormat value);
}
