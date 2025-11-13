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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.avfoundation.protocol.AVExternalSyncDeviceDelegate;

/**
 * AVCaptureDeviceInput
 * 
 * AVCaptureDeviceInput is a concrete subclass of AVCaptureInput that provides an interface for capturing media from an
 * AVCaptureDevice.
 * 
 * Instances of AVCaptureDeviceInput are input sources for AVCaptureSession that provide media data from devices
 * connected to the system, represented by instances of AVCaptureDevice.
 * 
 * API-Since: 4.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureDeviceInput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
     * Returns an AVCaptureDeviceInput instance that provides media data from the given device.
     * 
     * This method returns an instance of AVCaptureDeviceInput that can be used to capture data from an AVCaptureDevice
     * in an AVCaptureSession. This method attempts to open the device for capture, taking exclusive control of it if
     * necessary. If the device cannot be opened because it is no longer available or because it is in use, for example,
     * this method returns nil, and the optional outError parameter points to an NSError describing the problem.
     * 
     * @param device
     *                 An AVCaptureDevice instance to be used for capture.
     * @param outError
     *                 On return, if the given device cannot be used for capture, points to an NSError describing the
     *                 problem.
     * @return
     *         An AVCaptureDeviceInput instance that provides data from the given device, or nil, if the device could
     *         not be used for capture.
     */
    @Generated
    @Selector("deviceInputWithDevice:error:")
    public static native AVCaptureDeviceInput deviceInputWithDeviceError(@NotNull AVCaptureDevice device,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureDeviceInput new_objc();

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
     * The device from which the receiver provides data.
     * 
     * The value of this property is the AVCaptureDevice instance that was used to create the receiver.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("device")
    public native AVCaptureDevice device();

    @Generated
    @Selector("init")
    public native AVCaptureDeviceInput init();

    /**
     * initWithDevice:error:
     * 
     * Creates an AVCaptureDeviceInput instance that provides media data from the given device.
     * 
     * This method creates an instance of AVCaptureDeviceInput that can be used to capture data from an AVCaptureDevice
     * in an AVCaptureSession. This method attempts to open the device for capture, taking exclusive control of it if
     * necessary. If the device cannot be opened because it is no longer available or because it is in use, for example,
     * this method returns nil, and the optional outError parameter points to an NSError describing the problem.
     * 
     * API-Since: 4.0
     * 
     * @param device
     *                 An AVCaptureDevice instance to be used for capture.
     * @param outError
     *                 On return, if the given device cannot be used for capture, points to an NSError describing the
     *                 problem.
     * @return
     *         An AVCaptureDeviceInput instance that provides data from the given device, or nil, if the device could
     *         not be used for capture.
     */
    @Generated
    @Selector("initWithDevice:error:")
    public native AVCaptureDeviceInput initWithDeviceError(@NotNull AVCaptureDevice device,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * portsWithMediaType:sourceDeviceType:sourceDevicePosition:
     * 
     * An accessor method used to retrieve a virtual device's constituent device ports for use in an
     * AVCaptureMultiCamSession.
     * 
     * When using AVCaptureMultiCamSession, multiple devices may be run simultaneously. You may also run simultaneous
     * streams from a virtual device such as the Dual Camera. By inspecting a virtual device's constituentDevices
     * property, you can find its underlying physical devices and, using this method, search for ports originating from
     * one of those constituent devices. Note that the AVCaptureInput.ports array does not include constituent device
     * ports for virtual devices. You must use this accessor method to discover the ports for which you're specifically
     * looking. These constituent device ports may be used to make connections to outputs for use with an
     * AVCaptureMultiCamSession. Using the Dual Camera as an example, the AVCaptureInput.ports property exposes only
     * those ports supported by the virtual device (it switches automatically between wide and telephoto cameras
     * according to the zoom factor). You may use this method to find the video ports for the constituentDevices.
     * 
     * AVCaptureInputPort *wideVideoPort = [dualCameraInput portsWithMediaType:AVMediaTypeVideo
     * sourceDeviceType:AVCaptureDeviceTypeBuiltInWideAngleCamera
     * sourceDevicePosition:AVCaptureDevicePositionBack].firstObject;
     * AVCaptureInputPort *teleVideoPort = [dualCameraInput portsWithMediaType:AVMediaTypeVideo
     * sourceDeviceType:AVCaptureDeviceTypeBuiltInTelephotoCamera
     * sourceDevicePosition:AVCaptureDevicePositionBack].firstObject;
     * 
     * These ports may be used to create connections, say, to two AVCaptureVideoDataOutput instances, allowing for
     * synchronized full frame rate delivery of both wide and telephoto streams.
     * 
     * As of iOS 13, constituent device ports may not be connected to AVCapturePhotoOutput instances. Clients who wish
     * to capture multiple photos from a virtual device should use AVCapturePhotoOutput's
     * virtualDeviceConstituentPhotoDeliveryEnabled feature.
     * 
     * When used in conjunction with an audio device, this method allows you to discover microphones in different
     * AVCaptureDevicePositions. When you intend to work with an AVCaptureMultiCamSession, you may use these ports to
     * make connections and simultaneously capture both front facing and back facing audio simultaneously to two
     * different outputs. When used with an AVCaptureMultiCamSession, the audio device port whose sourceDevicePosition
     * is AVCaptureDevicePositionUnspecified produces omnidirectional sound.
     * 
     * API-Since: 13.0
     * 
     * @param mediaType
     *                             The AVMediaType of the port for which you're searching, or nil if all media types
     *                             should be considered.
     * @param sourceDeviceType
     *                             The AVCaptureDeviceType of the port for which you're searching, or nil if source
     *                             device type is irrelevant.
     * @param sourceDevicePosition
     *                             The AVCaptureDevicePosition of the port for which you're searching.
     *                             AVCaptureDevicePositionUnspecified is germane to audio devices, indicating
     *                             omnidirectional audio. For other types of capture devices (e.g. cameras),
     *                             AVCaptureDevicePositionUnspecified means all positions should be considered in the
     *                             search.
     * 
     * @return
     *         An array of AVCaptureInputPorts satisfying the search criteria, or an empty array could be found.
     */
    @NotNull
    @Generated
    @Selector("portsWithMediaType:sourceDeviceType:sourceDevicePosition:")
    public native NSArray<? extends AVCaptureInputPort> portsWithMediaTypeSourceDeviceTypeSourceDevicePosition(
            @Nullable String mediaType, @Nullable String sourceDeviceType, @NInt long sourceDevicePosition);

    /**
     * [@property] unifiedAutoExposureDefaultsEnabled
     * 
     * Specifies whether the source device should use the same default auto exposure behaviors for -[AVCaptureSession
     * setSessionPreset:] and -[AVCaptureDevice setActiveFormat:].
     * 
     * AVCaptureDevice's activeFormat property may be set two different ways. 1) You set it directly using one of the
     * formats in the device's -formats array, or 2) the AVCaptureSession sets it on your behalf when you set the
     * AVCaptureSession's sessionPreset property. Depending on the device and format, the default auto exposure behavior
     * may be configured differently when you use one method or the other, resulting in non-uniform auto exposure
     * behavior. Auto exposure defaults include min frame rate, max frame rate, and max exposure duration. If you wish
     * to ensure that consistent default behaviors are applied to the device regardless of the API you use to configure
     * the activeFormat, you may set the device input's unifiedAutoExposureDefaultsEnabled property to YES. Default
     * value for this property is NO.
     * 
     * Note that if you manually set the device's min frame rate, max frame rate, or max exposure duration, your custom
     * values will override the device defaults regardless of whether you've set this property to YES.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setUnifiedAutoExposureDefaultsEnabled:")
    public native void setUnifiedAutoExposureDefaultsEnabled(boolean value);

    /**
     * [@property] videoMinFrameDurationOverride
     * 
     * A property that acts as a modifier to the AVCaptureDevice's activeVideoMinFrameDuration property. Default value
     * is kCMTimeInvalid.
     * 
     * An AVCaptureDevice's activeVideoMinFrameDuration property is the reciprocal of its active maximum frame rate. To
     * limit the max frame rate of the capture device, clients may set the device's activeVideoMinFrameDuration to a
     * value supported by the receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges
     * property). Changes you make to the device's activeVideoMinFrameDuration property take effect immediately without
     * disrupting preview. Therefore, the AVCaptureSession must always allocate sufficient resources to allow the device
     * to run at its activeFormat's max allowable frame rate. If you wish to use a particular device format but only
     * ever run it at lower frame rates (for instance, only run a 1080p240 fps format at a max frame rate of 60), you
     * can set the AVCaptureDeviceInput's videoMinFrameDurationOverride property to the reciprocal of the max frame rate
     * you intend to use before starting the session (or within a beginConfiguration / commitConfiguration block while
     * running the session).
     * 
     * When a device input is added to a session, this property reverts back to the default of kCMTimeInvalid (no
     * override).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setVideoMinFrameDurationOverride:")
    public native void setVideoMinFrameDurationOverride(@ByValue CMTime value);

    /**
     * [@property] unifiedAutoExposureDefaultsEnabled
     * 
     * Specifies whether the source device should use the same default auto exposure behaviors for -[AVCaptureSession
     * setSessionPreset:] and -[AVCaptureDevice setActiveFormat:].
     * 
     * AVCaptureDevice's activeFormat property may be set two different ways. 1) You set it directly using one of the
     * formats in the device's -formats array, or 2) the AVCaptureSession sets it on your behalf when you set the
     * AVCaptureSession's sessionPreset property. Depending on the device and format, the default auto exposure behavior
     * may be configured differently when you use one method or the other, resulting in non-uniform auto exposure
     * behavior. Auto exposure defaults include min frame rate, max frame rate, and max exposure duration. If you wish
     * to ensure that consistent default behaviors are applied to the device regardless of the API you use to configure
     * the activeFormat, you may set the device input's unifiedAutoExposureDefaultsEnabled property to YES. Default
     * value for this property is NO.
     * 
     * Note that if you manually set the device's min frame rate, max frame rate, or max exposure duration, your custom
     * values will override the device defaults regardless of whether you've set this property to YES.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("unifiedAutoExposureDefaultsEnabled")
    public native boolean unifiedAutoExposureDefaultsEnabled();

    /**
     * [@property] videoMinFrameDurationOverride
     * 
     * A property that acts as a modifier to the AVCaptureDevice's activeVideoMinFrameDuration property. Default value
     * is kCMTimeInvalid.
     * 
     * An AVCaptureDevice's activeVideoMinFrameDuration property is the reciprocal of its active maximum frame rate. To
     * limit the max frame rate of the capture device, clients may set the device's activeVideoMinFrameDuration to a
     * value supported by the receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges
     * property). Changes you make to the device's activeVideoMinFrameDuration property take effect immediately without
     * disrupting preview. Therefore, the AVCaptureSession must always allocate sufficient resources to allow the device
     * to run at its activeFormat's max allowable frame rate. If you wish to use a particular device format but only
     * ever run it at lower frame rates (for instance, only run a 1080p240 fps format at a max frame rate of 60), you
     * can set the AVCaptureDeviceInput's videoMinFrameDurationOverride property to the reciprocal of the max frame rate
     * you intend to use before starting the session (or within a beginConfiguration / commitConfiguration block while
     * running the session).
     * 
     * When a device input is added to a session, this property reverts back to the default of kCMTimeInvalid (no
     * override).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("videoMinFrameDurationOverride")
    @ByValue
    public native CMTime videoMinFrameDurationOverride();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * isMultichannelAudioModeSupported:
     * 
     * Returns whether the receiver supports the given multichannel audio mode.
     * 
     * The receiver's multichannelAudioMode property can only be set to a certain mode if this method returns YES for
     * that mode.
     * 
     * Multichannel audio modes are not supported when used in conjunction with AVCaptureMultiCamSession.
     * 
     * API-Since: 18.0
     * 
     * @param multichannelAudioMode
     *                              An AVCaptureMultichannelAudioMode to be checked.
     * @return
     *         YES if the receiver supports the given multichannel audio mode, NO otherwise.
     */
    @Generated
    @Selector("isMultichannelAudioModeSupported:")
    public native boolean isMultichannelAudioModeSupported(@NInt long multichannelAudioMode);

    /**
     * [@property] windNoiseRemovalEnabled
     * 
     * Specifies whether or not wind noise is removed during audio capture.
     * 
     * Wind noise removal is available when the AVCaptureDeviceInput multichannelAudioMode property is set to any value
     * other than AVCaptureMultichannelAudioModeNone.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isWindNoiseRemovalEnabled")
    public native boolean isWindNoiseRemovalEnabled();

    /**
     * [@property] windNoiseRemovalSupported
     * 
     * Returns whether or not the device supports wind noise removal during audio capture.
     * 
     * YES if the device supports wind noise removal, NO otherwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isWindNoiseRemovalSupported")
    public native boolean isWindNoiseRemovalSupported();

    /**
     * [@property] multichannelAudioMode
     * 
     * Indicates the multichannel audio mode to apply when recording audio.
     * 
     * This property only takes effect when audio is being routed through the built-in microphone, and is ignored if an
     * external microphone is in use.
     * 
     * The default value is AVCaptureMultichannelAudioModeNone, in which case the default single channel audio recording
     * is used.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("multichannelAudioMode")
    @NInt
    public native long multichannelAudioMode();

    /**
     * [@property] multichannelAudioMode
     * 
     * Indicates the multichannel audio mode to apply when recording audio.
     * 
     * This property only takes effect when audio is being routed through the built-in microphone, and is ignored if an
     * external microphone is in use.
     * 
     * The default value is AVCaptureMultichannelAudioModeNone, in which case the default single channel audio recording
     * is used.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setMultichannelAudioMode:")
    public native void setMultichannelAudioMode(@NInt long value);

    /**
     * [@property] windNoiseRemovalEnabled
     * 
     * Specifies whether or not wind noise is removed during audio capture.
     * 
     * Wind noise removal is available when the AVCaptureDeviceInput multichannelAudioMode property is set to any value
     * other than AVCaptureMultichannelAudioModeNone.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setWindNoiseRemovalEnabled:")
    public native void setWindNoiseRemovalEnabled(boolean value);

    /**
     * The receiver's external sync frame duration (the reciprocal of its frame rate) when being driven by an external
     * sync device.
     * 
     * Set up your input to follow an external sync device by calling
     * ``followExternalSyncDevice:videoFrameDuration:delegate:``.
     * - Note: The value of this readonly property is `kCMTimeInvalid` unless the ``AVExternalSyncDevice`` is actively
     * driving the ``AVCaptureDeviceInput``. This is reflected by the ``AVExternalSyncDevice/status`` being either
     * ``AVExternalSyncDeviceStatusActiveSync`` or ``AVExternalSyncDeviceStatusFreeRunSync``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("activeExternalSyncVideoFrameDuration")
    @ByValue
    public native CMTime activeExternalSyncVideoFrameDuration();

    /**
     * The receiver's locked frame duration (the reciprocal of its frame rate). Setting this property guarantees the
     * intra-frame duration delivered by the device input is precisely the frame duration you request.
     * 
     * Set this property to run the receiver's associated ``AVCaptureDevice`` at precisely your provided frame rate
     * (expressed as a duration). Query ``AVCaptureDevice/minSupportedLockedVideoFrameDuration`` to find the minimum
     * value supported by this ``AVCaptureDeviceInput``. In order to disable locked video frame duration, set this
     * property to `kCMTimeInvalid`. This property resets itself to `kCMTimeInvalid` when the receiver's attached
     * ``AVCaptureDevice/activeFormat`` changes. When you set this property, its value is also reflected in the
     * receiver's ``AVCaptureDevice/activeVideoMinFrameDuration`` and ``AVCaptureDevice/activeVideoMaxFrameDuration``.
     * 
     * - Note: Locked frame duration availability may change depending on the device configuration. For example, locked
     * frame duration is unsupported when ``AVCaptureDevice/autoVideoFrameRateEnabled`` or
     * ``AVCaptureMovieFileOutput/spatialVideoCaptureEnabled`` is set to `true`.
     * 
     * - Note: Only one ``AVCaptureDeviceInput`` added to an ``AVCaptureMultiCamSession`` can follow an external sync
     * device or run at a locked frame duration.
     * 
     * - Note: Setting this property may cause a lengthy reconfiguration of the receiver, similar to setting
     * ``AVCaptureDevice/activeFormat`` or ``AVCaptureSession/sessionPreset``.
     * 
     * - Important: If you set this property to a valid value while the receiver's
     * ``AVCaptureDevice/minSupportedLockedVideoFrameDuration`` is `kCMTimeInvalid`, it throws an
     * `NSInvalidArgumentException`.
     * 
     * - Important: If you set this property while the receiver's ``lockedVideoFrameDurationSupported`` property returns
     * `false`, it throws an `NSInvalidArgumentException`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("activeLockedVideoFrameDuration")
    @ByValue
    public native CMTime activeLockedVideoFrameDuration();

    /**
     * The external sync device currently being followed by this input.
     * 
     * This readonly property returns the ``AVExternalSyncDevice`` instance you provided in
     * ``followExternalSyncDevice:videoFrameDuration:delegate:``. This property returns `nil` when an external sync
     * device is disconnected or fails to calibrate.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("externalSyncDevice")
    @Nullable
    public native AVExternalSyncDevice externalSyncDevice();

    /**
     * Configures the the device input to follow an external sync device at the given frame duration.
     * 
     * - Parameter externalSyncDevice: The ``AVExternalSyncDevice`` hardware to follow.
     * - Parameter videoFrameDuration: The frame duration to which the ``AVExternalSyncDevice`` is calibrated.
     * - Parameter delegate: The delegate to notify when the connection status changes, or an error occurs.
     * 
     * Call this method to direct your ``AVCaptureDeviceInput`` to follow the external sync pulse from a sync device at
     * the given frame duration.
     * 
     * Your provided `videoFrameDuration` value must match the sync pulse duration of the external sync device. If it
     * does not, the request times out, the external sync device's status returns to
     * ``AVExternalSyncDeviceStatusReady``, and your session stops running, posting a
     * ``AVCaptureSessionRuntimeErrorNotification`` with ``AVErrorFollowExternalSyncDeviceTimedOut``.
     * 
     * The ability to follow an external sync device may change depending on the device configuration. For example,
     * ``followExternalSyncDevice:videoFrameDuration:delegate:`` cannot be used when
     * ``AVCaptureDevice/autoVideoFrameRateEnabled`` is `true`.
     * 
     * To stop following an external pulse, call ``unfollowExternalSyncDevice``. External sync device following is also
     * disabled when your device's ``AVCaptureDeviceFormat`` changes.
     * 
     * Your provided delegate's ``AVExternalSyncDeviceDelegate/externalSyncDeviceStatusDidChange:`` method is called
     * with a status of ``AVExternalSyncDeviceStatusReady`` if the external pulse signal is not close enough to the
     * provided `videoFrameDuration` for successful calibration.
     * 
     * Once your ``AVExternalSyncDevice/status`` changes to ``AVExternalSyncDeviceStatusActiveSync``, your input's
     * ``AVCaptureInput/activeExternalSyncVideoFrameDuration`` property reports the up-to-date frame duration.
     * ``AVCaptureInput/activeExternalSyncVideoFrameDuration`` is also reflected in the
     * ``AVCaptureDevice/activeVideoMinFrameDuration`` and ``AVCaptureDevice/activeVideoMaxFrameDuration`` of your
     * input's associated device.
     * 
     * - Note: Calling this method may cause a lengthy reconfiguration of the receiver, similar to setting a new active
     * format or ``AVCaptureSession/sessionPreset``.
     * 
     * - Important: Calling this method throws an `NSInvalidArgumentException` if
     * ``AVCaptureDeviceInput/externalSyncSupported`` returns `false`.
     * 
     * - Important: The provided external sync device's ``status`` must be ``AVExternalSyncDeviceStatusReady`` when you
     * call this method, otherwise an `NSInvalidArgumentException` is thrown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("followExternalSyncDevice:videoFrameDuration:delegate:")
    public native void followExternalSyncDeviceVideoFrameDurationDelegate(
            @NotNull AVExternalSyncDevice externalSyncDevice, @ByValue CMTime frameDuration,
            @Mapped(ObjCObjectMapper.class) @Nullable AVExternalSyncDeviceDelegate delegate);

    /**
     * A BOOL value specifying whether the Cinematic Video effect is being applied to any movie file output, video data
     * output, metadata output, or video preview layer added to the capture session.
     * 
     * Default is `false`. Set to `true` to enable support for Cinematic Video capture.
     * 
     * When you set this property to `true`, your input's associated ``AVCaptureDevice/focusMode`` changes to
     * ``AVCaptureFocusModeContinuousAutoFocus``. While Cinematic Video capture is enabled, you are not permitted to
     * change your device's focus mode, and any attempt to do so results in an `NSInvalidArgumentException`. You may
     * only set this property to `true` if ``cinematicVideoCaptureSupported`` is `true`.
     * 
     * - Note: Enabling Cinematic Video capture requires a lengthy reconfiguration of the capture render pipeline, so if
     * you intend to capture Cinematic Video, you should set this property to `true` before calling
     * ``AVCaptureSession/startRunning`` or within ``AVCaptureSession/beginConfiguration`` and
     * ``AVCaptureSession/commitConfiguration`` while running.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isCinematicVideoCaptureEnabled")
    public native boolean isCinematicVideoCaptureEnabled();

    /**
     * A BOOL value specifying whether Cinematic Video capture is supported.
     * 
     * With Cinematic Video capture, you get a simulated depth-of-field effect that keeps your subjects (people, pets,
     * and more) in sharp focus while applying a pleasing blur to the background (or foreground). Depending on the focus
     * mode (see ``AVCaptureCinematicVideoFocusMode`` for detail), the camera either uses machine learning to
     * automatically detect and focus on subjects in the scene, or it fixes focus on a subject until it exits the scene.
     * Cinematic Videos can be played back and edited using the Cinematic framework.
     * 
     * You can adjust the video's simulated aperture before starting a recording using the ``simulatedAperture``
     * property. With Cinematic Video specific focus methods on ``AVCaptureDevice``, you can dynamically control focus
     * transitions.
     * 
     * Movie files captured with Cinematic Video enabled can be played back and edited with the [Cinematic framework]
     * (https://developer.apple.com/documentation/cinematic/playing-and-editing-cinematic-mode-video?language=objc).
     * 
     * This property returns `true` if the session's current configuration allows Cinematic Video capture. When
     * switching cameras or formats, this property may change. When this property changes from `true` to `false`,
     * ``cinematicVideoCaptureEnabled`` also reverts to `false`. If you've previously opted in for Cinematic Video
     * capture and then change configuration, you may need to set ``cinematicVideoCaptureEnabled`` to `true` again. This
     * property is key-value observable.
     * 
     * - Note: ``AVCaptureDepthDataOutput`` is not supported when ``cinematicVideoCaptureEnabled`` is set to `true`.
     * Running an ``AVCaptureSession`` with both of these features throws an `NSInvalidArgumentException`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isCinematicVideoCaptureSupported")
    public native boolean isCinematicVideoCaptureSupported();

    /**
     * Indicates whether the device input supports being configured to follow an external sync device.
     * 
     * See ``AVCaptureDeviceInput/followExternalSyncDevice:videoFrameDuration:delegate:`` for more information on
     * external sync.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isExternalSyncSupported")
    public native boolean isExternalSyncSupported();

    /**
     * Indicates whether the device input supports locked frame durations.
     * 
     * See ``AVCaptureDeviceInput/activeLockedVideoFrameDuration`` for more information on video frame duration locking.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isLockedVideoFrameDurationSupported")
    public native boolean isLockedVideoFrameDurationSupported();

    /**
     * The receiver's locked frame duration (the reciprocal of its frame rate). Setting this property guarantees the
     * intra-frame duration delivered by the device input is precisely the frame duration you request.
     * 
     * Set this property to run the receiver's associated ``AVCaptureDevice`` at precisely your provided frame rate
     * (expressed as a duration). Query ``AVCaptureDevice/minSupportedLockedVideoFrameDuration`` to find the minimum
     * value supported by this ``AVCaptureDeviceInput``. In order to disable locked video frame duration, set this
     * property to `kCMTimeInvalid`. This property resets itself to `kCMTimeInvalid` when the receiver's attached
     * ``AVCaptureDevice/activeFormat`` changes. When you set this property, its value is also reflected in the
     * receiver's ``AVCaptureDevice/activeVideoMinFrameDuration`` and ``AVCaptureDevice/activeVideoMaxFrameDuration``.
     * 
     * - Note: Locked frame duration availability may change depending on the device configuration. For example, locked
     * frame duration is unsupported when ``AVCaptureDevice/autoVideoFrameRateEnabled`` or
     * ``AVCaptureMovieFileOutput/spatialVideoCaptureEnabled`` is set to `true`.
     * 
     * - Note: Only one ``AVCaptureDeviceInput`` added to an ``AVCaptureMultiCamSession`` can follow an external sync
     * device or run at a locked frame duration.
     * 
     * - Note: Setting this property may cause a lengthy reconfiguration of the receiver, similar to setting
     * ``AVCaptureDevice/activeFormat`` or ``AVCaptureSession/sessionPreset``.
     * 
     * - Important: If you set this property to a valid value while the receiver's
     * ``AVCaptureDevice/minSupportedLockedVideoFrameDuration`` is `kCMTimeInvalid`, it throws an
     * `NSInvalidArgumentException`.
     * 
     * - Important: If you set this property while the receiver's ``lockedVideoFrameDurationSupported`` property returns
     * `false`, it throws an `NSInvalidArgumentException`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setActiveLockedVideoFrameDuration:")
    public native void setActiveLockedVideoFrameDuration(@ByValue CMTime value);

    /**
     * A BOOL value specifying whether the Cinematic Video effect is being applied to any movie file output, video data
     * output, metadata output, or video preview layer added to the capture session.
     * 
     * Default is `false`. Set to `true` to enable support for Cinematic Video capture.
     * 
     * When you set this property to `true`, your input's associated ``AVCaptureDevice/focusMode`` changes to
     * ``AVCaptureFocusModeContinuousAutoFocus``. While Cinematic Video capture is enabled, you are not permitted to
     * change your device's focus mode, and any attempt to do so results in an `NSInvalidArgumentException`. You may
     * only set this property to `true` if ``cinematicVideoCaptureSupported`` is `true`.
     * 
     * - Note: Enabling Cinematic Video capture requires a lengthy reconfiguration of the capture render pipeline, so if
     * you intend to capture Cinematic Video, you should set this property to `true` before calling
     * ``AVCaptureSession/startRunning`` or within ``AVCaptureSession/beginConfiguration`` and
     * ``AVCaptureSession/commitConfiguration`` while running.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCinematicVideoCaptureEnabled:")
    public native void setCinematicVideoCaptureEnabled(boolean value);

    /**
     * Shallow depth of field simulated aperture.
     * 
     * When capturing a Cinematic Video, use this property to control the amount of blur in the simulated depth of field
     * effect.
     * 
     * This property only takes effect when ``cinematicVideoCaptureEnabled`` is set to `true`.
     * 
     * - Important: Setting this property to a value less than the ``AVCaptureDevice/activeFormat/minSimulatedAperture``
     * or greater than the ``AVCaptureDevice/activeFormat/maxSimulatedAperture`` throws an `NSRangeException`. you may
     * only set this property if ``AVCaptureDevice/activeFormat/minSimulatedAperture`` returns a non-zero value,
     * otherwise an `NSInvalidArgumentException` is thrown. You must set this property before starting a Cinematic Video
     * capture. If you attempt to set it while a recording is in progress, an `NSInvalidArgumentException` is thrown.
     * 
     * This property is initialized to the associated ``AVCaptureDevice/activeFormat/defaultSimulatedAperture``.
     * 
     * This property is key-value observable.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSimulatedAperture:")
    public native void setSimulatedAperture(float value);

    /**
     * Shallow depth of field simulated aperture.
     * 
     * When capturing a Cinematic Video, use this property to control the amount of blur in the simulated depth of field
     * effect.
     * 
     * This property only takes effect when ``cinematicVideoCaptureEnabled`` is set to `true`.
     * 
     * - Important: Setting this property to a value less than the ``AVCaptureDevice/activeFormat/minSimulatedAperture``
     * or greater than the ``AVCaptureDevice/activeFormat/maxSimulatedAperture`` throws an `NSRangeException`. you may
     * only set this property if ``AVCaptureDevice/activeFormat/minSimulatedAperture`` returns a non-zero value,
     * otherwise an `NSInvalidArgumentException` is thrown. You must set this property before starting a Cinematic Video
     * capture. If you attempt to set it while a recording is in progress, an `NSInvalidArgumentException` is thrown.
     * 
     * This property is initialized to the associated ``AVCaptureDevice/activeFormat/defaultSimulatedAperture``.
     * 
     * This property is key-value observable.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("simulatedAperture")
    public native float simulatedAperture();

    /**
     * Discontinues external sync.
     * 
     * This method stops your input from syncing to the external sync device you specified in
     * ``followExternalSyncDevice:videoFrameDuration:delegate:``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("unfollowExternalSyncDevice")
    public native void unfollowExternalSyncDevice();
}
