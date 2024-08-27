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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVCaptureConnection
 * 
 * AVCaptureConnection represents a connection between an AVCaptureInputPort or ports, and an AVCaptureOutput or
 * AVCaptureVideoPreviewLayer present in an AVCaptureSession.
 * 
 * AVCaptureInputs have one or more AVCaptureInputPorts. AVCaptureOutputs can accept data from one or more sources
 * (example - an AVCaptureMovieFileOutput accepts both video and audio data). AVCaptureVideoPreviewLayers can accept
 * data from one AVCaptureInputPort whose mediaType is AVMediaTypeVideo. When an input or output is added to a session,
 * or a video preview layer is associated with a session, the session greedily forms connections between all the
 * compatible AVCaptureInputs' ports and AVCaptureOutputs or AVCaptureVideoPreviewLayers. Iterating through an output's
 * connections or a video preview layer's sole connection, a client may enable or disable the flow of data from a given
 * input to a given output or preview layer.
 * 
 * Connections involving audio expose an array of AVCaptureAudioChannel objects, which can be used for monitoring
 * levels.
 * 
 * Connections involving video expose video specific properties, such as videoMirrored and videoRotationAngle.
 * 
 * API-Since: 4.0
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureConnection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureConnection allocWithZone(VoidPtr zone);

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

    /**
     * connectionWithInputPort:videoPreviewLayer:
     * 
     * Returns an AVCaptureConnection instance describing a connection between the specified inputPort and the specified
     * AVCaptureVideoPreviewLayer instance.
     * 
     * This method returns an instance of AVCaptureConnection that may be subsequently added to an AVCaptureSession
     * instance using AVCaptureSession's -addConnection: method. When using AVCaptureVideoPreviewLayer's
     * -initWithSession: or -setSession:, a connection is formed between the first compatible input port and the video
     * preview layer automatically. You do not need to manually create and add connections to the session unless you use
     * AVCaptureVideoPreviewLayer's primitive -initWithSessionWithNoConnection: or -setSessionWithNoConnection: methods.
     * 
     * API-Since: 8.0
     * 
     * @param port
     *              An AVCaptureInputPort object associated with an AVCaptureInput object.
     * @param layer
     *              An AVCaptureVideoPreviewLayer object.
     * @return
     *         An AVCaptureConnection instance joining the specified inputPort to the specified video preview layer.
     */
    @Generated
    @Selector("connectionWithInputPort:videoPreviewLayer:")
    public static native AVCaptureConnection connectionWithInputPortVideoPreviewLayer(@NotNull AVCaptureInputPort port,
            @NotNull AVCaptureVideoPreviewLayer layer);

    /**
     * connectionWithInputPorts:output:
     * 
     * Returns an AVCaptureConnection instance describing a connection between the specified inputPorts and the
     * specified output.
     * 
     * This method returns an instance of AVCaptureConnection that may be subsequently added to an AVCaptureSession
     * instance using AVCaptureSession's -addConnection: method. When using -addInput: or -addOutput:, connections are
     * formed between all compatible inputs and outputs automatically. You do not need to manually create and add
     * connections to the session unless you use the primitive -addInputWithNoConnections: or
     * -addOutputWithNoConnections: methods.
     * 
     * API-Since: 8.0
     * 
     * @param ports
     *               An array of AVCaptureInputPort objects associated with AVCaptureInput objects.
     * @param output
     *               An AVCaptureOutput object.
     * @return
     *         An AVCaptureConnection instance joining the specified inputPorts to the specified output port.
     */
    @Generated
    @Selector("connectionWithInputPorts:output:")
    public static native AVCaptureConnection connectionWithInputPortsOutput(
            @NotNull NSArray<? extends AVCaptureInputPort> ports, @NotNull AVCaptureOutput output);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureConnection new_objc();

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
     * [@property] activeVideoStabilizationMode
     * 
     * Indicates the stabilization mode currently being applied to video flowing through the receiver.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. On devices where the video
     * stabilization feature is supported, only a subset of available source formats may be stabilized. The
     * activeVideoStabilizationMode property returns a value other than AVCaptureVideoStabilizationModeOff if video
     * stabilization is currently in use. This property never returns AVCaptureVideoStabilizationModeAuto. This property
     * is key-value observable.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("activeVideoStabilizationMode")
    @NInt
    public native long activeVideoStabilizationMode();

    /**
     * [@property] audioChannels
     * 
     * An array of AVCaptureAudioChannel objects representing individual channels of audio data flowing through the
     * connection.
     * 
     * This property is only applicable to AVCaptureConnection instances involving audio. In such connections, the
     * audioChannels array contains one AVCaptureAudioChannel object for each channel of audio data flowing through this
     * connection.
     */
    @NotNull
    @Generated
    @Selector("audioChannels")
    public native NSArray<? extends AVCaptureAudioChannel> audioChannels();

    /**
     * [@property] automaticallyAdjustsVideoMirroring
     * 
     * Specifies whether or not the value of @"videoMirrored" can change based on configuration of the session.
     * 
     * For some session configurations, video data flowing through the connection will be mirrored by default. When the
     * value of this property is YES, the value of @"videoMirrored" may change depending on the configuration of the
     * session, for example after switching to a different AVCaptureDeviceInput. The default value is YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("automaticallyAdjustsVideoMirroring")
    public native boolean automaticallyAdjustsVideoMirroring();

    /**
     * [@property] enablesVideoStabilizationWhenAvailable
     * 
     * Indicates whether stabilization should be applied to video flowing through the receiver when the feature is
     * available.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. On devices where the video
     * stabilization feature is supported, only a subset of available source formats and resolutions may be available
     * for stabilization. By setting the enablesVideoStabilizationWhenAvailable property to YES, video flowing through
     * the receiver is stabilized when available. Enabling video stabilization may introduce additional latency into the
     * video capture pipeline. Clients may key-value observe the videoStabilizationEnabled property to know when
     * stabilization is in use or not. The default value is NO. For apps linked before iOS 6.0, the default value is YES
     * for a video connection attached to an AVCaptureMovieFileOutput instance. For apps linked on or after iOS 6.0, the
     * default value is always NO. This property is deprecated. Use preferredVideoStabilizationMode instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use preferredVideoStabilizationMode instead.
     */
    @Generated
    @Deprecated
    @Selector("enablesVideoStabilizationWhenAvailable")
    public native boolean enablesVideoStabilizationWhenAvailable();

    @Generated
    @Selector("init")
    public native AVCaptureConnection init();

    /**
     * initWithInputPort:videoPreviewLayer:
     * 
     * Returns an AVCaptureConnection instance describing a connection between the specified inputPort
     * and the specified AVCaptureVideoPreviewLayer instance.
     * 
     * This method returns an instance of AVCaptureConnection that may be subsequently added to an AVCaptureSession
     * instance using AVCaptureSession's -addConnection: method. When using AVCaptureVideoPreviewLayer's
     * -initWithSession: or -setSession:, a connection is formed between the first compatible input port and the video
     * preview layer automatically. You do not need to manually create and add connections to the session unless you use
     * AVCaptureVideoPreviewLayer's primitive -initWithSessionWithNoConnection: or -setSessionWithNoConnection: methods.
     * 
     * API-Since: 8.0
     * 
     * @param port
     *              An AVCaptureInputPort object associated with an AVCaptureInput object.
     * @param layer
     *              An AVCaptureVideoPreviewLayer object.
     * @return
     *         An AVCaptureConnection instance joining the specified inputPort to the specified video preview layer.
     */
    @Generated
    @Selector("initWithInputPort:videoPreviewLayer:")
    public native AVCaptureConnection initWithInputPortVideoPreviewLayer(@NotNull AVCaptureInputPort port,
            @NotNull AVCaptureVideoPreviewLayer layer);

    /**
     * initWithInputPorts:output:
     * 
     * Returns an AVCaptureConnection instance describing a connection between the specified inputPorts and the
     * specified output.
     * 
     * This method returns an instance of AVCaptureConnection that may be subsequently added to an AVCaptureSession
     * instance using AVCaptureSession's -addConnection: method. When using -addInput: or -addOutput:, connections are
     * formed between all compatible inputs and outputs automatically. You do not need to manually create and add
     * connections to the session unless you use the primitive -addInputWithNoConnections: or
     * -addOutputWithNoConnections: methods.
     * 
     * API-Since: 8.0
     * 
     * @param ports
     *               An array of AVCaptureInputPort objects associated with AVCaptureInput objects.
     * @param output
     *               An AVCaptureOutput object.
     * @return
     *         An AVCaptureConnection instance joining the specified inputPorts to the specified output port.
     */
    @Generated
    @Selector("initWithInputPorts:output:")
    public native AVCaptureConnection initWithInputPortsOutput(@NotNull NSArray<? extends AVCaptureInputPort> ports,
            @NotNull AVCaptureOutput output);

    /**
     * [@property] inputPorts
     * 
     * An array of AVCaptureInputPort instances providing data through this connection.
     * 
     * An AVCaptureConnection may involve one or more AVCaptureInputPorts producing data to the connection's
     * AVCaptureOutput. This property is read-only. An AVCaptureConnection's inputPorts remain static for the life of
     * the object.
     */
    @NotNull
    @Generated
    @Selector("inputPorts")
    public native NSArray<? extends AVCaptureInputPort> inputPorts();

    /**
     * [@property] active
     * 
     * Indicates whether the receiver's output is currently capable of consuming data through this connection.
     * 
     * The value of this property is a BOOL that determines whether the receiver's output can consume data provided
     * through this connection. This property is read-only. Clients may key-value observe this property to know when a
     * session's configuration forces a connection to become inactive. The default value is YES.
     * 
     * Prior to iOS 11, the audio connection feeding an AVCaptureAudioDataOutput is made inactive when using
     * AVCaptureSessionPresetPhoto or the equivalent photo format using -[AVCaptureDevice activeFormat]. On iOS 11 and
     * later, the audio connection feeding AVCaptureAudioDataOutput is active for all presets and device formats.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * [@property] enabled
     * 
     * Indicates whether the connection's output should consume data.
     * 
     * The value of this property is a BOOL that determines whether the receiver's output should consume data from its
     * connected inputPorts when a session is running. Clients can set this property to stop the flow of data to a given
     * output during capture. The default value is YES.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * [@property] enabled
     * 
     * Indicates whether the connection's output should consume data.
     * 
     * The value of this property is a BOOL that determines whether the receiver's output should consume data from its
     * connected inputPorts when a session is running. Clients can set this property to stop the flow of data to a given
     * output during capture. The default value is YES.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * [@property] supportsVideoMaxFrameDuration
     * 
     * Indicates whether the connection supports setting the videoMaxFrameDuration property.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. In such connections, the
     * videoMaxFrameDuration property may only be set if -isVideoMaxFrameDurationSupported returns YES.
     * 
     * This property is deprecated on iOS, where min and max frame rate adjustments are applied exclusively at the
     * AVCaptureDevice using the activeVideoMinFrameDuration and activeVideoMaxFrameDuration properties. On macOS, frame
     * rate adjustments are supported both at the AVCaptureDevice and at AVCaptureConnection, enabling connections to
     * output different frame rates.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use AVCaptureDevice's activeFormat.videoSupportedFrameRateRanges instead.
     */
    @Generated
    @Deprecated
    @Selector("isVideoMaxFrameDurationSupported")
    public native boolean isVideoMaxFrameDurationSupported();

    /**
     * [@property] supportsVideoMinFrameDuration
     * 
     * Indicates whether the connection supports setting the videoMinFrameDuration property.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. In such connections, the
     * videoMinFrameDuration property may only be set if -isVideoMinFrameDurationSupported returns YES.
     * 
     * This property is deprecated on iOS, where min and max frame rate adjustments are applied exclusively at the
     * AVCaptureDevice using the activeVideoMinFrameDuration and activeVideoMaxFrameDuration properties. On macOS, frame
     * rate adjustments are supported both at the AVCaptureDevice and at AVCaptureConnection, enabling connections to
     * output different frame rates.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use AVCaptureDevice's activeFormat.videoSupportedFrameRateRanges instead.
     */
    @Generated
    @Deprecated
    @Selector("isVideoMinFrameDurationSupported")
    public native boolean isVideoMinFrameDurationSupported();

    /**
     * [@property] videoMirrored
     * 
     * Indicates whether the video flowing through the connection should be mirrored about its vertical axis.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. if -isVideoMirroringSupported
     * returns YES, videoMirrored may be set to flip the video about its vertical axis and produce a mirror-image
     * effect.
     */
    @Generated
    @Selector("isVideoMirrored")
    public native boolean isVideoMirrored();

    /**
     * [@property] videoMirrored
     * 
     * Indicates whether the video flowing through the connection should be mirrored about its vertical axis.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. if -isVideoMirroringSupported
     * returns YES, videoMirrored may be set to flip the video about its vertical axis and produce a mirror-image
     * effect.
     */
    @Generated
    @Selector("setVideoMirrored:")
    public native void setVideoMirrored(boolean value);

    /**
     * [@property] supportsVideoMirroring
     * 
     * Indicates whether the connection supports setting the videoMirrored property.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. In such connections, the
     * videoMirrored property may only be set if
     * -isVideoMirroringSupported returns YES.
     */
    @Generated
    @Selector("isVideoMirroringSupported")
    public native boolean isVideoMirroringSupported();

    /**
     * [@property] supportsVideoOrientation
     * 
     * Indicates whether the connection supports setting the videoOrientation property.
     * 
     * This property is deprecated. Use -isVideoRotationAngleSupported: instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use -isVideoRotationAngleSupported: instead
     */
    @Deprecated
    @Generated
    @Selector("isVideoOrientationSupported")
    public native boolean isVideoOrientationSupported();

    /**
     * [@property] videoStabilizationEnabled
     * 
     * Indicates whether stabilization is currently being applied to video flowing through the receiver.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. On devices where the video
     * stabilization feature is supported, only a subset of available source formats and resolutions may be available
     * for stabilization. The videoStabilizationEnabled property returns YES if video stabilization is currently in use.
     * This property is key-value observable. This property is deprecated. Use activeVideoStabilizationMode instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use activeVideoStabilizationMode instead.
     */
    @Generated
    @Deprecated
    @Selector("isVideoStabilizationEnabled")
    public native boolean isVideoStabilizationEnabled();

    /**
     * [@property] supportsVideoStabilization
     * 
     * Indicates whether the connection supports video stabilization.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. In such connections, the
     * -enablesVideoStabilizationWhenAvailable property may only be set if -supportsVideoStabilization returns YES. This
     * property returns YES if the connection's input device has one or more formats that support video stabilization
     * and the connection's output supports video stabilization. See [AVCaptureDeviceFormat
     * isVideoStabilizationModeSupported:] to check which video stabilization modes are supported by the active device
     * format.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();

    /**
     * [@property] output
     * 
     * The AVCaptureOutput instance consuming data from this connection's inputPorts.
     * 
     * An AVCaptureConnection may involve one or more AVCaptureInputPorts producing data to the connection's
     * AVCaptureOutput. This property is read-only. An AVCaptureConnection's output remains static for the life of the
     * object. Note that a connection can either be to an output or a video preview layer, but never to both.
     */
    @Nullable
    @Generated
    @Selector("output")
    public native AVCaptureOutput output();

    /**
     * [@property] preferredVideoStabilizationMode
     * 
     * Indicates the stabilization mode to apply to video flowing through the receiver when it is supported.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. On devices where the video
     * stabilization feature is supported, only a subset of available source formats may be available for stabilization.
     * By setting the preferredVideoStabilizationMode property to a value other than AVCaptureVideoStabilizationModeOff,
     * video flowing through the receiver is stabilized when the mode is available. Enabling video stabilization
     * introduces additional latency into the video capture pipeline and may consume more system memory depending on the
     * stabilization mode and format. If the preferred stabilization mode isn't available, the
     * activeVideoStabilizationMode will be set to AVCaptureVideoStabilizationModeOff. Clients may key-value observe the
     * activeVideoStabilizationMode property to know which stabilization mode is in use or when it is off. The default
     * value is AVCaptureVideoStabilizationModeOff. When setting this property to AVCaptureVideoStabilizationModeAuto,
     * an appropriate stabilization mode will be chosen based on the format and frame rate. For apps linked before iOS
     * 6.0, the default value is AVCaptureVideoStabilizationModeStandard for a video connection attached to an
     * AVCaptureMovieFileOutput instance. For apps linked on or after iOS 6.0, the default value is always
     * AVCaptureVideoStabilizationModeOff. Setting a video stabilization mode using this property may change the value
     * of enablesVideoStabilizationWhenAvailable.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("preferredVideoStabilizationMode")
    @NInt
    public native long preferredVideoStabilizationMode();

    /**
     * [@property] automaticallyAdjustsVideoMirroring
     * 
     * Specifies whether or not the value of @"videoMirrored" can change based on configuration of the session.
     * 
     * For some session configurations, video data flowing through the connection will be mirrored by default. When the
     * value of this property is YES, the value of @"videoMirrored" may change depending on the configuration of the
     * session, for example after switching to a different AVCaptureDeviceInput. The default value is YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAutomaticallyAdjustsVideoMirroring:")
    public native void setAutomaticallyAdjustsVideoMirroring(boolean value);

    /**
     * [@property] enablesVideoStabilizationWhenAvailable
     * 
     * Indicates whether stabilization should be applied to video flowing through the receiver when the feature is
     * available.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. On devices where the video
     * stabilization feature is supported, only a subset of available source formats and resolutions may be available
     * for stabilization. By setting the enablesVideoStabilizationWhenAvailable property to YES, video flowing through
     * the receiver is stabilized when available. Enabling video stabilization may introduce additional latency into the
     * video capture pipeline. Clients may key-value observe the videoStabilizationEnabled property to know when
     * stabilization is in use or not. The default value is NO. For apps linked before iOS 6.0, the default value is YES
     * for a video connection attached to an AVCaptureMovieFileOutput instance. For apps linked on or after iOS 6.0, the
     * default value is always NO. This property is deprecated. Use preferredVideoStabilizationMode instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use preferredVideoStabilizationMode instead.
     */
    @Generated
    @Deprecated
    @Selector("setEnablesVideoStabilizationWhenAvailable:")
    public native void setEnablesVideoStabilizationWhenAvailable(boolean value);

    /**
     * [@property] preferredVideoStabilizationMode
     * 
     * Indicates the stabilization mode to apply to video flowing through the receiver when it is supported.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. On devices where the video
     * stabilization feature is supported, only a subset of available source formats may be available for stabilization.
     * By setting the preferredVideoStabilizationMode property to a value other than AVCaptureVideoStabilizationModeOff,
     * video flowing through the receiver is stabilized when the mode is available. Enabling video stabilization
     * introduces additional latency into the video capture pipeline and may consume more system memory depending on the
     * stabilization mode and format. If the preferred stabilization mode isn't available, the
     * activeVideoStabilizationMode will be set to AVCaptureVideoStabilizationModeOff. Clients may key-value observe the
     * activeVideoStabilizationMode property to know which stabilization mode is in use or when it is off. The default
     * value is AVCaptureVideoStabilizationModeOff. When setting this property to AVCaptureVideoStabilizationModeAuto,
     * an appropriate stabilization mode will be chosen based on the format and frame rate. For apps linked before iOS
     * 6.0, the default value is AVCaptureVideoStabilizationModeStandard for a video connection attached to an
     * AVCaptureMovieFileOutput instance. For apps linked on or after iOS 6.0, the default value is always
     * AVCaptureVideoStabilizationModeOff. Setting a video stabilization mode using this property may change the value
     * of enablesVideoStabilizationWhenAvailable.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPreferredVideoStabilizationMode:")
    public native void setPreferredVideoStabilizationMode(@NInt long value);

    /**
     * [@property] videoMaxFrameDuration
     * 
     * Indicates the maximum time interval at which the receiver should output consecutive video frames.
     * 
     * The value of this property is a CMTime specifying the maximum duration of each video frame output by the
     * receiver, placing an upper bound on the amount of time that should separate consecutive frames. This is
     * equivalent to the reciprocal of the minimum frame rate. A value of kCMTimeZero or kCMTimeInvalid indicates an
     * unlimited minimum frame rate. The default value is kCMTimeInvalid.
     * 
     * This property is deprecated on iOS, where min and max frame rate adjustments are applied exclusively at the
     * AVCaptureDevice using the activeVideoMinFrameDuration and activeVideoMaxFrameDuration properties. On macOS, frame
     * rate adjustments are supported both at the AVCaptureDevice and at AVCaptureConnection, enabling connections to
     * output different frame rates.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use AVCaptureDevice's activeVideoMaxFrameDuration instead.
     */
    @Generated
    @Deprecated
    @Selector("setVideoMaxFrameDuration:")
    public native void setVideoMaxFrameDuration(@ByValue CMTime value);

    /**
     * [@property] videoMinFrameDuration
     * 
     * Indicates the minimum time interval at which the receiver should output consecutive video frames.
     * 
     * The value of this property is a CMTime specifying the minimum duration of each video frame output by the
     * receiver, placing a lower bound on the amount of time that should separate consecutive frames. This is equivalent
     * to the reciprocal of the maximum frame rate. A value of kCMTimeZero or kCMTimeInvalid indicates an unlimited
     * maximum frame rate. The default value is kCMTimeInvalid.
     * 
     * This property is deprecated on iOS, where min and max frame rate adjustments are applied exclusively at the
     * AVCaptureDevice using the activeVideoMinFrameDuration and activeVideoMaxFrameDuration properties. On macOS, frame
     * rate adjustments are supported both at the AVCaptureDevice and at AVCaptureConnection, enabling connections to
     * output different frame rates.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use AVCaptureDevice's activeVideoMinFrameDuration instead.
     */
    @Generated
    @Deprecated
    @Selector("setVideoMinFrameDuration:")
    public native void setVideoMinFrameDuration(@ByValue CMTime value);

    /**
     * [@property] videoOrientation
     * 
     * Indicates whether the video flowing through the connection should be rotated to a given orientation.
     * 
     * This property is deprecated. Use -videoRotationAngle instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use -videoRotationAngle instead
     */
    @Deprecated
    @Generated
    @Selector("setVideoOrientation:")
    public native void setVideoOrientation(@NInt long value);

    /**
     * [@property] videoScaleAndCropFactor
     * 
     * Indicates the current video scale and crop factor in use by the receiver.
     * 
     * This property only applies to AVCaptureStillImageOutput connections. In such connections, the
     * videoScaleAndCropFactor property may be set to a value in the range of 1.0 to videoMaxScaleAndCropFactor. At a
     * factor of 1.0, the image is its original size. At a factor greater than 1.0, the image is scaled by the factor
     * and center-cropped to its original dimensions. This factor is applied in addition to any magnification from
     * AVCaptureDevice's videoZoomFactor property.
     * 
     * @see -[AVCaptureDevice videoZoomFactor]
     * 
     *      API-Since: 5.0
     */
    @Generated
    @Selector("setVideoScaleAndCropFactor:")
    public native void setVideoScaleAndCropFactor(@NFloat double value);

    /**
     * [@property] videoMaxFrameDuration
     * 
     * Indicates the maximum time interval at which the receiver should output consecutive video frames.
     * 
     * The value of this property is a CMTime specifying the maximum duration of each video frame output by the
     * receiver, placing an upper bound on the amount of time that should separate consecutive frames. This is
     * equivalent to the reciprocal of the minimum frame rate. A value of kCMTimeZero or kCMTimeInvalid indicates an
     * unlimited minimum frame rate. The default value is kCMTimeInvalid.
     * 
     * This property is deprecated on iOS, where min and max frame rate adjustments are applied exclusively at the
     * AVCaptureDevice using the activeVideoMinFrameDuration and activeVideoMaxFrameDuration properties. On macOS, frame
     * rate adjustments are supported both at the AVCaptureDevice and at AVCaptureConnection, enabling connections to
     * output different frame rates.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use AVCaptureDevice's activeVideoMaxFrameDuration instead.
     */
    @Generated
    @Deprecated
    @Selector("videoMaxFrameDuration")
    @ByValue
    public native CMTime videoMaxFrameDuration();

    /**
     * [@property] videoMaxScaleAndCropFactor
     * 
     * Indicates the maximum video scale and crop factor supported by the receiver.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. In such connections, the
     * videoMaxScaleAndCropFactor property specifies the maximum CGFloat value that may be used when setting the
     * videoScaleAndCropFactor property.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("videoMaxScaleAndCropFactor")
    @NFloat
    public native double videoMaxScaleAndCropFactor();

    /**
     * [@property] videoMinFrameDuration
     * 
     * Indicates the minimum time interval at which the receiver should output consecutive video frames.
     * 
     * The value of this property is a CMTime specifying the minimum duration of each video frame output by the
     * receiver, placing a lower bound on the amount of time that should separate consecutive frames. This is equivalent
     * to the reciprocal of the maximum frame rate. A value of kCMTimeZero or kCMTimeInvalid indicates an unlimited
     * maximum frame rate. The default value is kCMTimeInvalid.
     * 
     * This property is deprecated on iOS, where min and max frame rate adjustments are applied exclusively at the
     * AVCaptureDevice using the activeVideoMinFrameDuration and activeVideoMaxFrameDuration properties. On macOS, frame
     * rate adjustments are supported both at the AVCaptureDevice and at AVCaptureConnection, enabling connections to
     * output different frame rates.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use AVCaptureDevice's activeVideoMinFrameDuration instead.
     */
    @Generated
    @Deprecated
    @Selector("videoMinFrameDuration")
    @ByValue
    public native CMTime videoMinFrameDuration();

    /**
     * [@property] videoOrientation
     * 
     * Indicates whether the video flowing through the connection should be rotated to a given orientation.
     * 
     * This property is deprecated. Use -videoRotationAngle instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use -videoRotationAngle instead
     */
    @Deprecated
    @Generated
    @Selector("videoOrientation")
    @NInt
    public native long videoOrientation();

    /**
     * [@property] videoPreviewLayer
     * 
     * The AVCaptureVideoPreviewLayer instance consuming data from this connection's inputPort.
     * 
     * An AVCaptureConnection may involve one AVCaptureInputPort producing data to an AVCaptureVideoPreviewLayer object.
     * This property is read-only. An AVCaptureConnection's videoPreviewLayer remains static for the life of the object.
     * Note that a connection can either be to an output or a video preview layer, but never to both.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("videoPreviewLayer")
    public native AVCaptureVideoPreviewLayer videoPreviewLayer();

    /**
     * [@property] videoScaleAndCropFactor
     * 
     * Indicates the current video scale and crop factor in use by the receiver.
     * 
     * This property only applies to AVCaptureStillImageOutput connections. In such connections, the
     * videoScaleAndCropFactor property may be set to a value in the range of 1.0 to videoMaxScaleAndCropFactor. At a
     * factor of 1.0, the image is its original size. At a factor greater than 1.0, the image is scaled by the factor
     * and center-cropped to its original dimensions. This factor is applied in addition to any magnification from
     * AVCaptureDevice's videoZoomFactor property.
     * 
     * @see -[AVCaptureDevice videoZoomFactor]
     * 
     *      API-Since: 5.0
     */
    @Generated
    @Selector("videoScaleAndCropFactor")
    @NFloat
    public native double videoScaleAndCropFactor();

    /**
     * [@property] cameraIntrinsicMatrixDeliveryEnabled
     * 
     * Indicates whether camera intrinsic matrix delivery should be enabled.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. Refer to property
     * cameraIntrinsicMatrixDeliverySupported before setting this property. When this property is set to YES, the
     * receiver's output will add the kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix sample buffer attachment to all
     * vended sample buffers. This property must be set before the session starts running.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isCameraIntrinsicMatrixDeliveryEnabled")
    public native boolean isCameraIntrinsicMatrixDeliveryEnabled();

    /**
     * [@property] cameraIntrinsicMatrixDeliverySupported
     * 
     * Indicates whether the connection supports camera intrinsic matrix delivery.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. For such connections, the
     * cameraIntrinsicMatrixDeliveryEnabled property may only be set to YES if -isCameraIntrinsicMatrixDeliverySupported
     * returns YES. This property returns YES if both the connection's input device format and the connection's output
     * support camera intrinsic matrix delivery. Only the AVCaptureVideoDataOutput's connection supports this property.
     * Note that if video stabilization is enabled (preferredVideoStabilizationMode is set to something other than
     * AVCaptureVideoStabilizationModeOff), camera intrinsic matrix delivery is not supported. Starting in iOS 14.3,
     * camera intrinsics are delivered with video buffers on which geometric distortion correction is applied.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isCameraIntrinsicMatrixDeliverySupported")
    public native boolean isCameraIntrinsicMatrixDeliverySupported();

    /**
     * [@property] cameraIntrinsicMatrixDeliveryEnabled
     * 
     * Indicates whether camera intrinsic matrix delivery should be enabled.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video. Refer to property
     * cameraIntrinsicMatrixDeliverySupported before setting this property. When this property is set to YES, the
     * receiver's output will add the kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix sample buffer attachment to all
     * vended sample buffers. This property must be set before the session starts running.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setCameraIntrinsicMatrixDeliveryEnabled:")
    public native void setCameraIntrinsicMatrixDeliveryEnabled(boolean value);

    /**
     * isVideoRotationAngleSupported:
     * 
     * Returns whether the connection supports the given rotation angle in degrees.
     * 
     * The connection's videoRotationAngle property can only be set to a certain angle if this method returns YES for
     * that angle. Only rotation angles of 0, 90, 180 and 270 are supported.
     * 
     * @param videoRotationAngle
     *                           A video rotation angle to be checked.
     * @return
     *         YES if the connection supports the given video rotation angle, NO otherwise.
     */
    @Generated
    @Selector("isVideoRotationAngleSupported:")
    public native boolean isVideoRotationAngleSupported(@NFloat double videoRotationAngle);

    /**
     * [@property] videoRotationAngle
     * 
     * Indicates whether the video flowing through the connection should be rotated with a given angle in degrees.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video or depth.
     * -setVideoRotationAngle: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isVideoRotationAngleSupported:). Note that setting videoRotationAngle does not necessarily result in physical
     * rotation of video buffers. For instance, a video connection to an AVCaptureMovieFileOutput handles orientation
     * using a Quicktime track matrix. In the AVCapturePhotoOutput, orientation is handled using Exif tags. And the
     * AVCaptureVideoPreviewLayer applies transforms to its contents to perform rotations. However, the
     * AVCaptureVideoDataOutput and AVCaptureDepthDataOutput do output physically rotated video buffers. Setting a video
     * rotation angle for an output that does physically rotate buffers requires a lengthy configuration of the capture
     * render pipeline and should be done before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setVideoRotationAngle:")
    public native void setVideoRotationAngle(@NFloat double value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * [@property] videoRotationAngle
     * 
     * Indicates whether the video flowing through the connection should be rotated with a given angle in degrees.
     * 
     * This property is only applicable to AVCaptureConnection instances involving video or depth.
     * -setVideoRotationAngle: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isVideoRotationAngleSupported:). Note that setting videoRotationAngle does not necessarily result in physical
     * rotation of video buffers. For instance, a video connection to an AVCaptureMovieFileOutput handles orientation
     * using a Quicktime track matrix. In the AVCapturePhotoOutput, orientation is handled using Exif tags. And the
     * AVCaptureVideoPreviewLayer applies transforms to its contents to perform rotations. However, the
     * AVCaptureVideoDataOutput and AVCaptureDepthDataOutput do output physically rotated video buffers. Setting a video
     * rotation angle for an output that does physically rotate buffers requires a lengthy configuration of the capture
     * render pipeline and should be done before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("videoRotationAngle")
    @NFloat
    public native double videoRotationAngle();
}
