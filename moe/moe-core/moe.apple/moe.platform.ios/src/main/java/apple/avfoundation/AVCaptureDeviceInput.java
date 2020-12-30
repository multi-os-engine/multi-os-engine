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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureDeviceInput
 * 
 *    AVCaptureDeviceInput is a concrete subclass of AVCaptureInput that provides an interface for capturing media from an AVCaptureDevice.
 * 
 *    Instances of AVCaptureDeviceInput are input sources for AVCaptureSession that provide media data from devices connected to the system, represented by instances of AVCaptureDevice.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDeviceInput extends AVCaptureInput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDeviceInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDeviceInput alloc();

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

    /**
     * deviceInputWithDevice:error:
     * 
     *    Returns an AVCaptureDeviceInput instance that provides media data from the given device.
     * 
     *    This method returns an instance of AVCaptureDeviceInput that can be used to capture data from an AVCaptureDevice in an AVCaptureSession. This method attempts to open the device for capture, taking exclusive control of it if necessary. If the device cannot be opened because it is no longer available or because it is in use, for example, this method returns nil, and the optional outError parameter points to an NSError describing the problem.
     * 
     * @param device
     *    An AVCaptureDevice instance to be used for capture.
     * @param outError
     *    On return, if the given device cannot be used for capture, points to an NSError describing the problem.
     * @return
     *    An AVCaptureDeviceInput instance that provides data from the given device, or nil, if the device could not be used for capture.
     */
    @Generated
    @Selector("deviceInputWithDevice:error:")
    public static native AVCaptureDeviceInput deviceInputWithDeviceError(AVCaptureDevice device,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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

    /**
     * [@property] device
     * 
     *    The device from which the receiver provides data.
     * 
     *    The value of this property is the AVCaptureDevice instance that was used to create the receiver.
     */
    @Generated
    @Selector("device")
    public native AVCaptureDevice device();

    @Generated
    @Selector("init")
    public native AVCaptureDeviceInput init();

    /**
     * initWithDevice:error:
     * 
     *    Creates an AVCaptureDeviceInput instance that provides media data from the given device.
     * 
     *    This method creates an instance of AVCaptureDeviceInput that can be used to capture data from an AVCaptureDevice in an AVCaptureSession. This method attempts to open the device for capture, taking exclusive control of it if necessary. If the device cannot be opened because it is no longer available or because it is in use, for example, this method returns nil, and the optional outError parameter points to an NSError describing the problem.
     * 
     * @param device
     *    An AVCaptureDevice instance to be used for capture.
     * @param outError
     *    On return, if the given device cannot be used for capture, points to an NSError describing the problem.
     * @return
     *    An AVCaptureDeviceInput instance that provides data from the given device, or nil, if the device could not be used for capture.
     */
    @Generated
    @Selector("initWithDevice:error:")
    public native AVCaptureDeviceInput initWithDeviceError(AVCaptureDevice device,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * portsWithMediaType:sourceDeviceType:sourceDevicePosition:
     * 
     *    An accessor method used to retrieve a virtual device's constituent device ports for use in an AVCaptureMultiCamSession.
     * 
     *    When using AVCaptureMultiCamSession, multiple devices may be run simultaneously. You may also run simultaneous streams from a virtual device such as the Dual Camera. By inspecting a virtual device's constituentDevices property, you can find its underlying physical devices and, using this method, search for ports originating from one of those constituent devices. Note that the AVCaptureInput.ports array does not include constituent device ports for virtual devices. You must use this accessor method to discover the ports for which you're specifically looking. These constituent device ports may be used to make connections to outputs for use with an AVCaptureMultiCamSession. Using the Dual Camera as an example, the AVCaptureInput.ports property exposes only those ports supported by the virtual device (it switches automatically between wide and telephoto cameras according to the zoom factor). You may use this method to find the video ports for the constituentDevices.
     * 
     *         AVCaptureInputPort *wideVideoPort = [dualCameraInput portsWithMediaType:AVMediaTypeVideo sourceDeviceType:AVCaptureDeviceTypeBuiltInWideAngleCamera sourceDevicePosition:AVCaptureDevicePositionBack].firstObject;
     *         AVCaptureInputPort *teleVideoPort = [dualCameraInput portsWithMediaType:AVMediaTypeVideo sourceDeviceType:AVCaptureDeviceTypeBuiltInTelephotoCamera sourceDevicePosition:AVCaptureDevicePositionBack].firstObject;
     * 
     *    These ports may be used to create connections, say, to two AVCaptureVideoDataOutput instances, allowing for synchronized full frame rate delivery of both wide and telephoto streams.
     * 
     *    As of iOS 13, constituent device ports may not be connected to AVCapturePhotoOutput instances. Clients who wish to capture multiple photos from a virtual device should use AVCapturePhotoOutput's virtualDeviceConstituentPhotoDeliveryEnabled feature.
     * 
     *    When used in conjunction with an audio device, this method allows you to discover microphones in different AVCaptureDevicePositions. When you intend to work with an AVCaptureMultiCamSession, you may use these ports to make connections and simultaneously capture both front facing and back facing audio simultaneously to two different outputs. When used with an AVCaptureMultiCamSession, the audio device port whose sourceDevicePosition is AVCaptureDevicePositionUnspecified produces omnidirectional sound.
     * 
     * @param mediaType
     *    The AVMediaType of the port for which you're searching, or nil if all media types should be considered.
     * @param sourceDeviceType
     *    The AVCaptureDeviceType of the port for which you're searching, or nil if source device type is irrelevant.
     * @param sourceDevicePosition
     *    The AVCaptureDevicePosition of the port for which you're searching. AVCaptureDevicePositionUnspecified is germane to audio devices, indicating omnidirectional audio. For other types of capture devices (e.g. cameras), AVCaptureDevicePositionUnspecified means all positions should be considered in the search.
     * 
     * @return
     *    An array of AVCaptureInputPorts satisfying the search criteria, or an empty array could be found.
     */
    @Generated
    @Selector("portsWithMediaType:sourceDeviceType:sourceDevicePosition:")
    public native NSArray<? extends AVCaptureInputPort> portsWithMediaTypeSourceDeviceTypeSourceDevicePosition(
            String mediaType, String sourceDeviceType, @NInt long sourceDevicePosition);

    /**
     * [@property] unifiedAutoExposureDefaultsEnabled
     * 
     *    Specifies whether the source device should use the same default auto exposure behaviors for -[AVCaptureSession setSessionPreset:] and -[AVCaptureDevice setActiveFormat:].
     * 
     *    AVCaptureDevice's activeFormat property may be set two different ways. 1) You set it directly using one of the formats in the device's -formats array, or 2) the AVCaptureSession sets it on your behalf when you set the AVCaptureSession's sessionPreset property. Depending on the device and format, the default auto exposure behavior may be configured differently when you use one method or the other, resulting in non-uniform auto exposure behavior. Auto exposure defaults include min frame rate, max frame rate, and max exposure duration. If you wish to ensure that consistent default behaviors are applied to the device regardless of the API you use to configure the activeFormat, you may set the device input's unifiedAutoExposureDefaultsEnabled property to YES. Default value for this property is NO.
     * 
     *    Note that if you manually set the device's min frame rate, max frame rate, or max exposure duration, your custom values will override the device defaults regardless of whether you've set this property to YES.
     */
    @Generated
    @Selector("setUnifiedAutoExposureDefaultsEnabled:")
    public native void setUnifiedAutoExposureDefaultsEnabled(boolean value);

    /**
     * [@property] videoMinFrameDurationOverride
     * 
     *    A property that acts as a modifier to the AVCaptureDevice's activeVideoMinFrameDuration property. Default value is kCMTimeInvalid.
     * 
     *    An AVCaptureDevice's activeVideoMinFrameDuration property is the reciprocal of its active maximum frame rate. To limit the max frame rate of the capture device, clients may set the device's activeVideoMinFrameDuration to a value supported by the receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges property). Changes you make to the device's activeVideoMinFrameDuration property take effect immediately without disrupting preview. Therefore, the AVCaptureSession must always allocate sufficient resources to allow the device to run at its activeFormat's max allowable frame rate. If you wish to use a particular device format but only ever run it at lower frame rates (for instance, only run a 1080p240 fps format at a max frame rate of 60), you can set the AVCaptureDeviceInput's videoMinFrameDurationOverride property to the reciprocal of the max frame rate you intend to use before starting the session (or within a beginConfiguration / commitConfiguration block while running the session).
     * 
     *    When a device input is added to a session, this property reverts back to the default of kCMTimeInvalid (no override).
     */
    @Generated
    @Selector("setVideoMinFrameDurationOverride:")
    public native void setVideoMinFrameDurationOverride(@ByValue CMTime value);

    /**
     * [@property] unifiedAutoExposureDefaultsEnabled
     * 
     *    Specifies whether the source device should use the same default auto exposure behaviors for -[AVCaptureSession setSessionPreset:] and -[AVCaptureDevice setActiveFormat:].
     * 
     *    AVCaptureDevice's activeFormat property may be set two different ways. 1) You set it directly using one of the formats in the device's -formats array, or 2) the AVCaptureSession sets it on your behalf when you set the AVCaptureSession's sessionPreset property. Depending on the device and format, the default auto exposure behavior may be configured differently when you use one method or the other, resulting in non-uniform auto exposure behavior. Auto exposure defaults include min frame rate, max frame rate, and max exposure duration. If you wish to ensure that consistent default behaviors are applied to the device regardless of the API you use to configure the activeFormat, you may set the device input's unifiedAutoExposureDefaultsEnabled property to YES. Default value for this property is NO.
     * 
     *    Note that if you manually set the device's min frame rate, max frame rate, or max exposure duration, your custom values will override the device defaults regardless of whether you've set this property to YES.
     */
    @Generated
    @Selector("unifiedAutoExposureDefaultsEnabled")
    public native boolean unifiedAutoExposureDefaultsEnabled();

    /**
     * [@property] videoMinFrameDurationOverride
     * 
     *    A property that acts as a modifier to the AVCaptureDevice's activeVideoMinFrameDuration property. Default value is kCMTimeInvalid.
     * 
     *    An AVCaptureDevice's activeVideoMinFrameDuration property is the reciprocal of its active maximum frame rate. To limit the max frame rate of the capture device, clients may set the device's activeVideoMinFrameDuration to a value supported by the receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges property). Changes you make to the device's activeVideoMinFrameDuration property take effect immediately without disrupting preview. Therefore, the AVCaptureSession must always allocate sufficient resources to allow the device to run at its activeFormat's max allowable frame rate. If you wish to use a particular device format but only ever run it at lower frame rates (for instance, only run a 1080p240 fps format at a max frame rate of 60), you can set the AVCaptureDeviceInput's videoMinFrameDurationOverride property to the reciprocal of the max frame rate you intend to use before starting the session (or within a beginConfiguration / commitConfiguration block while running the session).
     * 
     *    When a device input is added to a session, this property reverts back to the default of kCMTimeInvalid (no override).
     */
    @Generated
    @Selector("videoMinFrameDurationOverride")
    @ByValue
    public native CMTime videoMinFrameDurationOverride();
}
