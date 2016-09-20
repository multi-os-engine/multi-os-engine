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
    @Owned
    @Selector("alloc")
    public static native AVCaptureDevice alloc();

    /**
     * authorizationStatusForMediaType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/clm/AVCaptureDevice/authorizationStatusForMediaType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("authorizationStatusForMediaType:")
    @NInt
    public static native long authorizationStatusForMediaType(String mediaType);

    /**
     * defaultDeviceWithMediaType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/clm/AVCaptureDevice/defaultDeviceWithMediaType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultDeviceWithMediaType:")
    public static native AVCaptureDevice defaultDeviceWithMediaType(String mediaType);

    /**
     * deviceWithUniqueID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/clm/AVCaptureDevice/deviceWithUniqueID:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deviceWithUniqueID:")
    public static native AVCaptureDevice deviceWithUniqueID(String deviceUniqueID);

    /**
     * devices</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/clm/AVCaptureDevice/devices">iOS Dev Center</a>
     */
    @Generated
    @Selector("devices")
    public static native NSArray<?> devices();

    /**
     * devicesWithMediaType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/clm/AVCaptureDevice/devicesWithMediaType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("devicesWithMediaType:")
    public static native NSArray<?> devicesWithMediaType(String mediaType);

    /**
     * requestAccessForMediaType:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/clm/AVCaptureDevice/requestAccessForMediaType:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestAccessForMediaType:completionHandler:")
    public static native void requestAccessForMediaTypeCompletionHandler(String mediaType,
            @ObjCBlock(name = "call_requestAccessForMediaTypeCompletionHandler") Block_requestAccessForMediaTypeCompletionHandler handler);

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

    /**
     * ISO</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/ISO">iOS Dev Center</a>
     */
    @Generated
    @Selector("ISO")
    public native float ISO();

    /**
     * activeFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/activeFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("activeFormat")
    public native AVCaptureDeviceFormat activeFormat();

    /**
     * activeVideoMaxFrameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/activeVideoMaxFrameDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("activeVideoMaxFrameDuration")
    @ByValue
    public native CMTime activeVideoMaxFrameDuration();

    /**
     * activeVideoMinFrameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/activeVideoMinFrameDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("activeVideoMinFrameDuration")
    @ByValue
    public native CMTime activeVideoMinFrameDuration();

    /**
     * autoFocusRangeRestriction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/autoFocusRangeRestriction">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoFocusRangeRestriction")
    @NInt
    public native long autoFocusRangeRestriction();

    /**
     * automaticallyAdjustsVideoHDREnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/automaticallyAdjustsVideoHDREnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("automaticallyAdjustsVideoHDREnabled")
    public native boolean automaticallyAdjustsVideoHDREnabled();

    /**
     * automaticallyEnablesLowLightBoostWhenAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/automaticallyEnablesLowLightBoostWhenAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("automaticallyEnablesLowLightBoostWhenAvailable")
    public native boolean automaticallyEnablesLowLightBoostWhenAvailable();

    /**
     * cancelVideoZoomRamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/cancelVideoZoomRamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelVideoZoomRamp")
    public native void cancelVideoZoomRamp();

    /**
     * chromaticityValuesForDeviceWhiteBalanceGains:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/chromaticityValuesForDeviceWhiteBalanceGains:">iOS Dev Center</a>
     */
    @Generated
    @Selector("chromaticityValuesForDeviceWhiteBalanceGains:")
    @ByValue
    public native AVCaptureWhiteBalanceChromaticityValues chromaticityValuesForDeviceWhiteBalanceGains(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains);

    /**
     * deviceWhiteBalanceGains</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/deviceWhiteBalanceGains">iOS Dev Center</a>
     */
    @Generated
    @Selector("deviceWhiteBalanceGains")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGains();

    /**
     * deviceWhiteBalanceGainsForChromaticityValues:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/deviceWhiteBalanceGainsForChromaticityValues:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deviceWhiteBalanceGainsForChromaticityValues:")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGainsForChromaticityValues(
            @ByValue AVCaptureWhiteBalanceChromaticityValues chromaticityValues);

    /**
     * deviceWhiteBalanceGainsForTemperatureAndTintValues:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/deviceWhiteBalanceGainsForTemperatureAndTintValues:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deviceWhiteBalanceGainsForTemperatureAndTintValues:")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGainsForTemperatureAndTintValues(
            @ByValue AVCaptureWhiteBalanceTemperatureAndTintValues tempAndTintValues);

    /**
     * exposureDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposureDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("exposureDuration")
    @ByValue
    public native CMTime exposureDuration();

    /**
     * exposureMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposureMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("exposureMode")
    @NInt
    public native long exposureMode();

    /**
     * exposurePointOfInterest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposurePointOfInterest">iOS Dev Center</a>
     */
    @Generated
    @Selector("exposurePointOfInterest")
    @ByValue
    public native CGPoint exposurePointOfInterest();

    /**
     * exposureTargetBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposureTargetBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("exposureTargetBias")
    public native float exposureTargetBias();

    /**
     * exposureTargetOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposureTargetOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("exposureTargetOffset")
    public native float exposureTargetOffset();

    /**
     * flashMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/flashMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("flashMode")
    @NInt
    public native long flashMode();

    /**
     * focusMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/focusMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("focusMode")
    @NInt
    public native long focusMode();

    /**
     * focusPointOfInterest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/focusPointOfInterest">iOS Dev Center</a>
     */
    @Generated
    @Selector("focusPointOfInterest")
    @ByValue
    public native CGPoint focusPointOfInterest();

    /**
     * formats</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/formats">iOS Dev Center</a>
     */
    @Generated
    @Selector("formats")
    public native NSArray<?> formats();

    /**
     * grayWorldDeviceWhiteBalanceGains</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/grayWorldDeviceWhiteBalanceGains">iOS Dev Center</a>
     */
    @Generated
    @Selector("grayWorldDeviceWhiteBalanceGains")
    @ByValue
    public native AVCaptureWhiteBalanceGains grayWorldDeviceWhiteBalanceGains();

    /**
     * hasFlash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/hasFlash">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasFlash")
    public native boolean hasFlash();

    /**
     * hasMediaType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/hasMediaType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasMediaType:")
    public native boolean hasMediaType(String mediaType);

    /**
     * hasTorch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/hasTorch">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasTorch")
    public native boolean hasTorch();

    @Generated
    @Selector("init")
    public native AVCaptureDevice init();

    /**
     * adjustingExposure</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/adjustingExposure">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAdjustingExposure")
    public native boolean isAdjustingExposure();

    /**
     * adjustingFocus</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/adjustingFocus">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAdjustingFocus")
    public native boolean isAdjustingFocus();

    /**
     * adjustingWhiteBalance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/adjustingWhiteBalance">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAdjustingWhiteBalance")
    public native boolean isAdjustingWhiteBalance();

    /**
     * autoFocusRangeRestrictionSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/autoFocusRangeRestrictionSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAutoFocusRangeRestrictionSupported")
    public native boolean isAutoFocusRangeRestrictionSupported();

    /**
     * connected</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/connected">iOS Dev Center</a>
     */
    @Generated
    @Selector("isConnected")
    public native boolean isConnected();

    /**
     * isExposureModeSupported:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/isExposureModeSupported:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isExposureModeSupported:")
    public native boolean isExposureModeSupported(@NInt long exposureMode);

    /**
     * exposurePointOfInterestSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposurePointOfInterestSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("isExposurePointOfInterestSupported")
    public native boolean isExposurePointOfInterestSupported();

    /**
     * flashActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/flashActive">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFlashActive")
    public native boolean isFlashActive();

    /**
     * flashAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/flashAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFlashAvailable")
    public native boolean isFlashAvailable();

    /**
     * isFlashModeSupported:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/isFlashModeSupported:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFlashModeSupported:")
    public native boolean isFlashModeSupported(@NInt long flashMode);

    /**
     * isFocusModeSupported:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/isFocusModeSupported:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFocusModeSupported:")
    public native boolean isFocusModeSupported(@NInt long focusMode);

    /**
     * focusPointOfInterestSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/focusPointOfInterestSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFocusPointOfInterestSupported")
    public native boolean isFocusPointOfInterestSupported();

    /**
     * lowLightBoostEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/lowLightBoostEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLowLightBoostEnabled")
    public native boolean isLowLightBoostEnabled();

    /**
     * lowLightBoostSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/lowLightBoostSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLowLightBoostSupported")
    public native boolean isLowLightBoostSupported();

    /**
     * rampingVideoZoom</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/rampingVideoZoom">iOS Dev Center</a>
     */
    @Generated
    @Selector("isRampingVideoZoom")
    public native boolean isRampingVideoZoom();

    /**
     * smoothAutoFocusEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/smoothAutoFocusEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSmoothAutoFocusEnabled")
    public native boolean isSmoothAutoFocusEnabled();

    /**
     * smoothAutoFocusEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/smoothAutoFocusEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSmoothAutoFocusEnabled:")
    public native void setSmoothAutoFocusEnabled(boolean value);

    /**
     * smoothAutoFocusSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/smoothAutoFocusSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSmoothAutoFocusSupported")
    public native boolean isSmoothAutoFocusSupported();

    /**
     * subjectAreaChangeMonitoringEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/subjectAreaChangeMonitoringEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSubjectAreaChangeMonitoringEnabled")
    public native boolean isSubjectAreaChangeMonitoringEnabled();

    /**
     * subjectAreaChangeMonitoringEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/subjectAreaChangeMonitoringEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSubjectAreaChangeMonitoringEnabled:")
    public native void setSubjectAreaChangeMonitoringEnabled(boolean value);

    /**
     * torchActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/torchActive">iOS Dev Center</a>
     */
    @Generated
    @Selector("isTorchActive")
    public native boolean isTorchActive();

    /**
     * torchAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/torchAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isTorchAvailable")
    public native boolean isTorchAvailable();

    /**
     * isTorchModeSupported:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/isTorchModeSupported:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isTorchModeSupported:")
    public native boolean isTorchModeSupported(@NInt long torchMode);

    /**
     * videoHDREnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/videoHDREnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isVideoHDREnabled")
    public native boolean isVideoHDREnabled();

    /**
     * videoHDREnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/videoHDREnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVideoHDREnabled:")
    public native void setVideoHDREnabled(boolean value);

    /**
     * isWhiteBalanceModeSupported:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/isWhiteBalanceModeSupported:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isWhiteBalanceModeSupported:")
    public native boolean isWhiteBalanceModeSupported(@NInt long whiteBalanceMode);

    /**
     * lensAperture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/lensAperture">iOS Dev Center</a>
     */
    @Generated
    @Selector("lensAperture")
    public native float lensAperture();

    /**
     * lensPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/lensPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("lensPosition")
    public native float lensPosition();

    /**
     * localizedName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/localizedName">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * lockForConfiguration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/lockForConfiguration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lockForConfiguration:")
    public native boolean lockForConfiguration(Ptr<NSError> outError);

    /**
     * maxExposureTargetBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/maxExposureTargetBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxExposureTargetBias")
    public native float maxExposureTargetBias();

    /**
     * maxWhiteBalanceGain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/maxWhiteBalanceGain">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxWhiteBalanceGain")
    public native float maxWhiteBalanceGain();

    /**
     * minExposureTargetBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/minExposureTargetBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("minExposureTargetBias")
    public native float minExposureTargetBias();

    /**
     * modelID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/modelID">iOS Dev Center</a>
     */
    @Generated
    @Selector("modelID")
    public native String modelID();

    /**
     * position</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/position">iOS Dev Center</a>
     */
    @Generated
    @Selector("position")
    @NInt
    public native long position();

    /**
     * rampToVideoZoomFactor:withRate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/rampToVideoZoomFactor:withRate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rampToVideoZoomFactor:withRate:")
    public native void rampToVideoZoomFactorWithRate(@NFloat double factor, float rate);

    /**
     * activeFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/activeFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("setActiveFormat:")
    public native void setActiveFormat(AVCaptureDeviceFormat value);

    /**
     * activeVideoMaxFrameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/activeVideoMaxFrameDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setActiveVideoMaxFrameDuration:")
    public native void setActiveVideoMaxFrameDuration(@ByValue CMTime value);

    /**
     * activeVideoMinFrameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/activeVideoMinFrameDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setActiveVideoMinFrameDuration:")
    public native void setActiveVideoMinFrameDuration(@ByValue CMTime value);

    /**
     * autoFocusRangeRestriction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/autoFocusRangeRestriction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutoFocusRangeRestriction:")
    public native void setAutoFocusRangeRestriction(@NInt long value);

    /**
     * automaticallyAdjustsVideoHDREnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/automaticallyAdjustsVideoHDREnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutomaticallyAdjustsVideoHDREnabled:")
    public native void setAutomaticallyAdjustsVideoHDREnabled(boolean value);

    /**
     * automaticallyEnablesLowLightBoostWhenAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/automaticallyEnablesLowLightBoostWhenAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutomaticallyEnablesLowLightBoostWhenAvailable:")
    public native void setAutomaticallyEnablesLowLightBoostWhenAvailable(boolean value);

    /**
     * exposureMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposureMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExposureMode:")
    public native void setExposureMode(@NInt long value);

    /**
     * setExposureModeCustomWithDuration:ISO:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/setExposureModeCustomWithDuration:ISO:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExposureModeCustomWithDuration:ISO:completionHandler:")
    public native void setExposureModeCustomWithDurationISOCompletionHandler(@ByValue CMTime duration, float ISO,
            @ObjCBlock(name = "call_setExposureModeCustomWithDurationISOCompletionHandler") Block_setExposureModeCustomWithDurationISOCompletionHandler handler);

    /**
     * exposurePointOfInterest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/exposurePointOfInterest">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExposurePointOfInterest:")
    public native void setExposurePointOfInterest(@ByValue CGPoint value);

    /**
     * setExposureTargetBias:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/setExposureTargetBias:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExposureTargetBias:completionHandler:")
    public native void setExposureTargetBiasCompletionHandler(float bias,
            @ObjCBlock(name = "call_setExposureTargetBiasCompletionHandler") Block_setExposureTargetBiasCompletionHandler handler);

    /**
     * flashMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/flashMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFlashMode:")
    public native void setFlashMode(@NInt long value);

    /**
     * focusMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/focusMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFocusMode:")
    public native void setFocusMode(@NInt long value);

    /**
     * setFocusModeLockedWithLensPosition:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/setFocusModeLockedWithLensPosition:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFocusModeLockedWithLensPosition:completionHandler:")
    public native void setFocusModeLockedWithLensPositionCompletionHandler(float lensPosition,
            @ObjCBlock(name = "call_setFocusModeLockedWithLensPositionCompletionHandler") Block_setFocusModeLockedWithLensPositionCompletionHandler handler);

    /**
     * focusPointOfInterest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/focusPointOfInterest">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFocusPointOfInterest:")
    public native void setFocusPointOfInterest(@ByValue CGPoint value);

    /**
     * torchMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/torchMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTorchMode:")
    public native void setTorchMode(@NInt long value);

    /**
     * setTorchModeOnWithLevel:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/setTorchModeOnWithLevel:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTorchModeOnWithLevel:error:")
    public native boolean setTorchModeOnWithLevelError(float torchLevel, Ptr<NSError> outError);

    /**
     * videoZoomFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/videoZoomFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVideoZoomFactor:")
    public native void setVideoZoomFactor(@NFloat double value);

    /**
     * whiteBalanceMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/whiteBalanceMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWhiteBalanceMode:")
    public native void setWhiteBalanceMode(@NInt long value);

    /**
     * setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:")
    public native void setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains,
            @ObjCBlock(name = "call_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler") Block_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler handler);

    /**
     * supportsAVCaptureSessionPreset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/supportsAVCaptureSessionPreset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("supportsAVCaptureSessionPreset:")
    public native boolean supportsAVCaptureSessionPreset(String preset);

    /**
     * temperatureAndTintValuesForDeviceWhiteBalanceGains:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/temperatureAndTintValuesForDeviceWhiteBalanceGains:">iOS Dev Center</a>
     */
    @Generated
    @Selector("temperatureAndTintValuesForDeviceWhiteBalanceGains:")
    @ByValue
    public native AVCaptureWhiteBalanceTemperatureAndTintValues temperatureAndTintValuesForDeviceWhiteBalanceGains(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains);

    /**
     * torchLevel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/torchLevel">iOS Dev Center</a>
     */
    @Generated
    @Selector("torchLevel")
    public native float torchLevel();

    /**
     * torchMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/torchMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("torchMode")
    @NInt
    public native long torchMode();

    /**
     * uniqueID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/uniqueID">iOS Dev Center</a>
     */
    @Generated
    @Selector("uniqueID")
    public native String uniqueID();

    /**
     * unlockForConfiguration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instm/AVCaptureDevice/unlockForConfiguration">iOS Dev Center</a>
     */
    @Generated
    @Selector("unlockForConfiguration")
    public native void unlockForConfiguration();

    /**
     * videoZoomFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/videoZoomFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoZoomFactor")
    @NFloat
    public native double videoZoomFactor();

    /**
     * whiteBalanceMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureDevice_Class/index.html#//apple_ref/occ/instp/AVCaptureDevice/whiteBalanceMode">iOS Dev Center</a>
     */
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
}
