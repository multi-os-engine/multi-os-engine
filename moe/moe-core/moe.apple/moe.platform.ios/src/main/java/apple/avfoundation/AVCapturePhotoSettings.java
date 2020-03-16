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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCapturePhotoSettings extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCapturePhotoSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCapturePhotoSettings alloc();

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
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("photoSettings")
    public static native AVCapturePhotoSettings photoSettings();

    @Generated
    @Selector("photoSettingsFromPhotoSettings:")
    public static native AVCapturePhotoSettings photoSettingsFromPhotoSettings(AVCapturePhotoSettings photoSettings);

    @Generated
    @Selector("photoSettingsWithFormat:")
    public static native AVCapturePhotoSettings photoSettingsWithFormat(NSDictionary<String, ?> format);

    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:")
    public static native AVCapturePhotoSettings photoSettingsWithRawPixelFormatType(int rawPixelFormatType);

    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:processedFormat:")
    public static native AVCapturePhotoSettings photoSettingsWithRawPixelFormatTypeProcessedFormat(
            int rawPixelFormatType, NSDictionary<String, ?> processedFormat);

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
    @Selector("availablePreviewPhotoPixelFormatTypes")
    public native NSArray<? extends NSNumber> availablePreviewPhotoPixelFormatTypes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("flashMode")
    @NInt
    public native long flashMode();

    @Generated
    @Selector("format")
    public native NSDictionary<String, ?> format();

    @Generated
    @Selector("init")
    public native AVCapturePhotoSettings init();

    @Generated
    @Selector("isAutoDualCameraFusionEnabled")
    public native boolean isAutoDualCameraFusionEnabled();

    @Generated
    @Selector("setAutoDualCameraFusionEnabled:")
    public native void setAutoDualCameraFusionEnabled(boolean value);

    @Generated
    @Selector("isAutoStillImageStabilizationEnabled")
    public native boolean isAutoStillImageStabilizationEnabled();

    @Generated
    @Selector("setAutoStillImageStabilizationEnabled:")
    public native void setAutoStillImageStabilizationEnabled(boolean value);

    @Generated
    @Selector("isHighResolutionPhotoEnabled")
    public native boolean isHighResolutionPhotoEnabled();

    @Generated
    @Selector("setHighResolutionPhotoEnabled:")
    public native void setHighResolutionPhotoEnabled(boolean value);

    @Generated
    @Selector("livePhotoMovieFileURL")
    public native NSURL livePhotoMovieFileURL();

    @Generated
    @Selector("livePhotoMovieMetadata")
    public native NSArray<? extends AVMetadataItem> livePhotoMovieMetadata();

    @Generated
    @Selector("previewPhotoFormat")
    public native NSDictionary<String, ?> previewPhotoFormat();

    @Generated
    @Selector("rawPhotoPixelFormatType")
    public native int rawPhotoPixelFormatType();

    @Generated
    @Selector("setFlashMode:")
    public native void setFlashMode(@NInt long value);

    @Generated
    @Selector("setLivePhotoMovieFileURL:")
    public native void setLivePhotoMovieFileURL(NSURL value);

    @Generated
    @Selector("setLivePhotoMovieMetadata:")
    public native void setLivePhotoMovieMetadata(NSArray<? extends AVMetadataItem> value);

    @Generated
    @Selector("setPreviewPhotoFormat:")
    public native void setPreviewPhotoFormat(NSDictionary<String, ?> value);

    @Generated
    @Selector("uniqueID")
    public native long uniqueID();

    @Generated
    @Selector("availableEmbeddedThumbnailPhotoCodecTypes")
    public native NSArray<String> availableEmbeddedThumbnailPhotoCodecTypes();

    @Generated
    @Selector("embeddedThumbnailPhotoFormat")
    public native NSDictionary<String, ?> embeddedThumbnailPhotoFormat();

    @Generated
    @Selector("embedsDepthDataInPhoto")
    public native boolean embedsDepthDataInPhoto();

    @Generated
    @Selector("isCameraCalibrationDataDeliveryEnabled")
    public native boolean isCameraCalibrationDataDeliveryEnabled();

    @Generated
    @Selector("isDepthDataDeliveryEnabled")
    public native boolean isDepthDataDeliveryEnabled();

    @Generated
    @Selector("isDepthDataFiltered")
    public native boolean isDepthDataFiltered();

    @Generated
    @Selector("isDualCameraDualPhotoDeliveryEnabled")
    public native boolean isDualCameraDualPhotoDeliveryEnabled();

    @Generated
    @Selector("livePhotoVideoCodecType")
    public native String livePhotoVideoCodecType();

    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:rawFileType:processedFormat:processedFileType:")
    public static native AVCapturePhotoSettings photoSettingsWithRawPixelFormatTypeRawFileTypeProcessedFormatProcessedFileType(
            int rawPixelFormatType, String rawFileType, NSDictionary<String, ?> processedFormat,
            String processedFileType);

    @Generated
    @Selector("processedFileType")
    public native String processedFileType();

    @Generated
    @Selector("rawFileType")
    public native String rawFileType();

    @Generated
    @Selector("setCameraCalibrationDataDeliveryEnabled:")
    public native void setCameraCalibrationDataDeliveryEnabled(boolean value);

    @Generated
    @Selector("setDepthDataDeliveryEnabled:")
    public native void setDepthDataDeliveryEnabled(boolean value);

    @Generated
    @Selector("setDepthDataFiltered:")
    public native void setDepthDataFiltered(boolean value);

    @Generated
    @Selector("setDualCameraDualPhotoDeliveryEnabled:")
    public native void setDualCameraDualPhotoDeliveryEnabled(boolean value);

    @Generated
    @Selector("setEmbeddedThumbnailPhotoFormat:")
    public native void setEmbeddedThumbnailPhotoFormat(NSDictionary<String, ?> value);

    @Generated
    @Selector("setEmbedsDepthDataInPhoto:")
    public native void setEmbedsDepthDataInPhoto(boolean value);

    @Generated
    @Selector("setLivePhotoVideoCodecType:")
    public native void setLivePhotoVideoCodecType(String value);

    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSDictionary<String, ?> value);

    @Generated
    @Selector("availableRawEmbeddedThumbnailPhotoCodecTypes")
    public native NSArray<String> availableRawEmbeddedThumbnailPhotoCodecTypes();

    @Generated
    @Selector("embedsPortraitEffectsMatteInPhoto")
    public native boolean embedsPortraitEffectsMatteInPhoto();

    @Generated
    @Selector("embedsSemanticSegmentationMattesInPhoto")
    public native boolean embedsSemanticSegmentationMattesInPhoto();

    @Generated
    @Selector("enabledSemanticSegmentationMatteTypes")
    public native NSArray<String> enabledSemanticSegmentationMatteTypes();

    @Generated
    @Selector("isAutoRedEyeReductionEnabled")
    public native boolean isAutoRedEyeReductionEnabled();

    @Generated
    @Selector("isAutoVirtualDeviceFusionEnabled")
    public native boolean isAutoVirtualDeviceFusionEnabled();

    @Generated
    @Selector("isPortraitEffectsMatteDeliveryEnabled")
    public native boolean isPortraitEffectsMatteDeliveryEnabled();

    @Generated
    @Selector("photoQualityPrioritization")
    @NInt
    public native long photoQualityPrioritization();

    @Generated
    @Selector("rawEmbeddedThumbnailPhotoFormat")
    public native NSDictionary<String, ?> rawEmbeddedThumbnailPhotoFormat();

    @Generated
    @Selector("setAutoRedEyeReductionEnabled:")
    public native void setAutoRedEyeReductionEnabled(boolean value);

    @Generated
    @Selector("setAutoVirtualDeviceFusionEnabled:")
    public native void setAutoVirtualDeviceFusionEnabled(boolean value);

    @Generated
    @Selector("setEmbedsPortraitEffectsMatteInPhoto:")
    public native void setEmbedsPortraitEffectsMatteInPhoto(boolean value);

    @Generated
    @Selector("setEmbedsSemanticSegmentationMattesInPhoto:")
    public native void setEmbedsSemanticSegmentationMattesInPhoto(boolean value);

    @Generated
    @Selector("setEnabledSemanticSegmentationMatteTypes:")
    public native void setEnabledSemanticSegmentationMatteTypes(NSArray<String> value);

    @Generated
    @Selector("setPhotoQualityPrioritization:")
    public native void setPhotoQualityPrioritization(@NInt long value);

    @Generated
    @Selector("setPortraitEffectsMatteDeliveryEnabled:")
    public native void setPortraitEffectsMatteDeliveryEnabled(boolean value);

    @Generated
    @Selector("setRawEmbeddedThumbnailPhotoFormat:")
    public native void setRawEmbeddedThumbnailPhotoFormat(NSDictionary<String, ?> value);

    @Generated
    @Selector("setVirtualDeviceConstituentPhotoDeliveryEnabledDevices:")
    public native void setVirtualDeviceConstituentPhotoDeliveryEnabledDevices(NSArray<? extends AVCaptureDevice> value);

    @Generated
    @Selector("virtualDeviceConstituentPhotoDeliveryEnabledDevices")
    public native NSArray<? extends AVCaptureDevice> virtualDeviceConstituentPhotoDeliveryEnabledDevices();
}
