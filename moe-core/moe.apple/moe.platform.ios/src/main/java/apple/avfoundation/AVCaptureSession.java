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
import apple.coremedia.opaque.CMClockRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import apple.avfoundation.protocol.AVCaptureSessionControlsDelegate;
import apple.opaque.dispatch_queue_t;
import org.moe.natj.general.ann.MappedReturn;
import apple.avfoundation.protocol.AVCaptureSessionDeferredStartDelegate;

/**
 * AVCaptureSession
 * 
 * AVCaptureSession is the central hub of the AVFoundation capture classes.
 * 
 * To perform a real-time capture, a client may instantiate AVCaptureSession and add appropriate AVCaptureInputs, such
 * as AVCaptureDeviceInput, and outputs, such as AVCaptureMovieFileOutput. [AVCaptureSession startRunning] starts the
 * flow of data from the inputs to the outputs, and [AVCaptureSession stopRunning] stops the flow. A client may set the
 * sessionPreset property to customize the quality level or bitrate of the output.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureSession allocWithZone(VoidPtr zone);

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
    public static native AVCaptureSession new_objc();

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
     * addConnection:
     * 
     * Adds an AVCaptureConnection to the session.
     * 
     * An AVCaptureConnection instance can only be added to a session using -addConnection: if canAddConnection: returns
     * YES, otherwise an NSInvalidArgumentException is thrown. When using -addInput: or -addOutput:, connections are
     * formed automatically between all compatible inputs and outputs. Manually adding connections is only necessary
     * when adding an input or output with no connections. -addConnection: may be called while the session is running.
     * 
     * API-Since: 8.0
     * 
     * @param connection
     *                   An AVCaptureConnection instance.
     */
    @Generated
    @Selector("addConnection:")
    public native void addConnection(@NotNull AVCaptureConnection connection);

    /**
     * addInput:
     * 
     * Adds an AVCaptureInput to the session.
     * 
     * An AVCaptureInput instance can only be added to a session using -addInput: if -canAddInput: returns YES,
     * otherwise an NSInvalidArgumentException is thrown. -addInput: may be called while the session is running.
     * 
     * API-Since: 4.0
     * 
     * @param input
     *              An AVCaptureInput instance.
     */
    @Generated
    @Selector("addInput:")
    public native void addInput(@NotNull AVCaptureInput input);

    /**
     * addInputWithNoConnections:
     * 
     * Adds an AVCaptureInput to the session without forming any connections.
     * 
     * An AVCaptureInput instance can only be added to a session using -addInputWithNoConnections: if -canAddInput:
     * returns YES, otherwise an NSInvalidArgumentException is thrown. -addInputWithNoConnections: may be called while
     * the session is running. The -addInput: method is the preferred method for adding an input to an AVCaptureSession.
     * -addInputWithNoConnections: may be called if you need fine-grained control over which inputs are connected to
     * which outputs.
     * 
     * API-Since: 8.0
     * 
     * @param input
     *              An AVCaptureInput instance.
     */
    @Generated
    @Selector("addInputWithNoConnections:")
    public native void addInputWithNoConnections(@NotNull AVCaptureInput input);

    /**
     * addOutput:
     * 
     * Adds an AVCaptureOutput to the session.
     * 
     * An AVCaptureOutput instance can only be added to a session using -addOutput: if -canAddOutput: returns YES,
     * otherwise an NSInvalidArgumentException is thrown. -addOutput: may be called while the session is running.
     * 
     * API-Since: 4.0
     * 
     * @param output
     *               An AVCaptureOutput instance.
     */
    @Generated
    @Selector("addOutput:")
    public native void addOutput(@NotNull AVCaptureOutput output);

    /**
     * addOutputWithNoConnections:
     * 
     * Adds an AVCaptureOutput to the session without forming any connections.
     * 
     * An AVCaptureOutput instance can only be added to a session using -addOutputWithNoConnections: if -canAddOutput:
     * returns YES, otherwise an NSInvalidArgumentException is thrown. -addOutputWithNoConnections: may be called while
     * the session is running. The -addOutput: method is the preferred method for adding an output to an
     * AVCaptureSession. -addOutputWithNoConnections: may be called if you need fine-grained control over which inputs
     * are connected to which outputs.
     * 
     * API-Since: 8.0
     * 
     * @param output
     *               An AVCaptureOutput instance.
     */
    @Generated
    @Selector("addOutputWithNoConnections:")
    public native void addOutputWithNoConnections(@NotNull AVCaptureOutput output);

    /**
     * [@property] automaticallyConfiguresApplicationAudioSession
     * 
     * Indicates whether the receiver should configure the application's audio session for recording.
     * 
     * The value of this property is a BOOL indicating whether the receiver should configure the application's audio
     * session when needed for optimal recording. When set to YES, the receiver ensures the application's audio session
     * is set to the PlayAndRecord category, and picks an appropriate microphone and polar pattern to match the video
     * camera being used. When set to NO, and -usesApplicationAudioSession is set to YES, the receiver will use the
     * application's audio session, but will not change any of its properties. If the session is not set up correctly
     * for input, audio recording may fail. The default value is YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("automaticallyConfiguresApplicationAudioSession")
    public native boolean automaticallyConfiguresApplicationAudioSession();

    /**
     * [@property] automaticallyConfiguresCaptureDeviceForWideColor
     * 
     * Indicates whether the receiver automatically configures its video device's activeFormat and activeColorSpace
     * properties, preferring wide color for photos.
     * 
     * The default value is YES. By default, the receiver automatically adjusts its source video AVCaptureDevice's
     * activeFormat and activeColorSpace properties based on the supportedColorSpaces of the device's formats and the
     * current AVCaptureSession topology. Wide color spaces are preferred over sRGB if an AVCapturePhotoOutput is
     * present in the session. If you wish to set AVCaptureDevice's activeColorSpace manually, and prevent the
     * AVCaptureSession from undoing your work, you must set automaticallyConfiguresCaptureDeviceForWideColor to NO. If
     * the receiver's sessionPreset is set to AVCaptureSessionPresetInputPriority, the session will not alter the
     * capture device's activeFormat, but might still alter its activeColorSpace.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("automaticallyConfiguresCaptureDeviceForWideColor")
    public native boolean automaticallyConfiguresCaptureDeviceForWideColor();

    /**
     * beginConfiguration
     * 
     * When paired with commitConfiguration, allows a client to batch multiple configuration operations on a running
     * session into atomic updates.
     * 
     * -beginConfiguration / -commitConfiguration are AVCaptureSession's mechanism for batching multiple configuration
     * operations on a running session into atomic updates. After calling [session beginConfiguration], clients may add
     * or remove outputs, alter the sessionPreset, or configure individual AVCaptureInput or Output properties. All
     * changes will be pended until the client calls [session commitConfiguration], at which time they will be applied
     * together. -beginConfiguration / -commitConfiguration pairs may be nested, and will only be applied when the
     * outermost commit is invoked. If you've called -beginConfiguration, you must call -commitConfiguration before
     * invoking -startRunning or -stopRunning, otherwise an NSGenericException is thrown.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("beginConfiguration")
    public native void beginConfiguration();

    /**
     * canAddConnection:
     * 
     * Returns whether the proposed connection can be added to the receiver.
     * 
     * An AVCaptureConnection instance can only be added to a session using -addConnection: if -canAddConnection:
     * returns YES, otherwise an NSInvalidArgumentException is thrown. When using -addInput: or -addOutput:, connections
     * are formed automatically between all compatible inputs and outputs. Manually adding connections is only necessary
     * when adding an input or output with no connections.
     * 
     * API-Since: 8.0
     * 
     * @param connection
     *                   An AVCaptureConnection instance.
     */
    @Generated
    @Selector("canAddConnection:")
    public native boolean canAddConnection(@NotNull AVCaptureConnection connection);

    /**
     * canAddInput:
     * 
     * Returns whether the proposed input can be added to the receiver.
     * 
     * An AVCaptureInput instance can only be added to a session using -addInput: if -canAddInput: returns YES,
     * otherwise an NSInvalidArgumentException is thrown.
     * 
     * API-Since: 4.0
     * 
     * @param input
     *              An AVCaptureInput instance.
     * @return
     *         YES if the proposed input can be added to the receiver, NO otherwise.
     */
    @Generated
    @Selector("canAddInput:")
    public native boolean canAddInput(@NotNull AVCaptureInput input);

    /**
     * canAddOutput:
     * 
     * Returns whether the proposed output can be added to the receiver.
     * 
     * An AVCaptureOutput instance can only be added to a session using -addOutput: if -canAddOutput: returns YES,
     * otherwise an NSInvalidArgumentException is thrown.
     * 
     * On iOS and Mac Catalyst, some limitations to adding combinations of different types of outputs apply:
     * - A maximum of one output of each type may be added. For applications linked on or after iOS 16.0, this
     * restriction no longer applies to AVCaptureVideoDataOutputs. When adding more than one AVCaptureVideoDataOutput,
     * AVCaptureSession.hardwareCost must be taken into account.
     * - A session cannot contain both an AVCaptureStillImageOutput and an AVCapturePhotoOutput at the same time.
     * - Prior to iOS 16.0, an AVCaptureVideoDataOutput and an AVCaptureMovieFileOutput may be added to the same
     * session, but only one may have its connection active. When both have their connections enabled, the
     * AVCaptureMovieFileOutput "wins" and the AVCaptureVideoDataOutput's connection becomes inactive. For applications
     * linked on or after iOS 16.0, this restriction has been lifted. When adding multiple AVCaptureVideoDataOutputs or
     * a combination of AVCaptureVideoDataOutputs and an AVCaptureMovieFileOutput, AVCaptureSession.hardwareCost must be
     * taken into account.
     * - Similarly, prior to iOS 16.0, an AVCaptureAudioDataOutput and an AVCaptureMovieFileOutput may be added to the
     * same session, but only one may have its connection active. When both have their connections enabled, the
     * AVCaptureMovieFileOutput "wins" and the AVCaptureAudioDataOutput's connection becomes inactive. For applications
     * linked on or after iOS 16.0, this restriction has been lifted.
     * 
     * API-Since: 4.0
     * 
     * @param output
     *               An AVCaptureOutput instance.
     * @return
     *         YES if the proposed output can be added to the receiver, NO otherwise.
     */
    @Generated
    @Selector("canAddOutput:")
    public native boolean canAddOutput(@NotNull AVCaptureOutput output);

    /**
     * canSetSessionPreset:
     * 
     * Returns whether the receiver can be configured with the given preset.
     * 
     * An AVCaptureSession instance can be associated with a preset that configures its inputs and outputs to fulfill
     * common use cases. This method can be used to determine if the receiver supports the desired preset given its
     * current input and output configuration. The receiver's sessionPreset property may only be set to a certain preset
     * if this method returns YES for that preset.
     * 
     * @param preset
     *               An AVCaptureSession preset.
     * @return
     *         YES if the receiver can be set to the given preset, NO otherwise.
     */
    @Generated
    @Selector("canSetSessionPreset:")
    public native boolean canSetSessionPreset(@NotNull String preset);

    /**
     * commitConfiguration
     * 
     * When preceded by beginConfiguration, allows a client to batch multiple configuration operations on a running
     * session into atomic updates.
     * 
     * -beginConfiguration / -commitConfiguration are AVCaptureSession's mechanism for batching multiple configuration
     * operations on a running session into atomic updates. After calling [session beginConfiguration], clients may add
     * or remove outputs, alter the sessionPreset, or configure individual AVCaptureInput or Output properties. All
     * changes will be pended until the client calls [session commitConfiguration], at which time they will be applied
     * together. -beginConfiguration / -commitConfiguration pairs may be nested, and will only be applied when the
     * outermost commit is invoked. If you've called -beginConfiguration, you must call -commitConfiguration before
     * invoking -startRunning or -stopRunning, otherwise an NSGenericException is thrown.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("commitConfiguration")
    public native void commitConfiguration();

    @Generated
    @Selector("init")
    public native AVCaptureSession init();

    /**
     * [@property] inputs
     * 
     * An NSArray of AVCaptureInputs currently added to the receiver.
     * 
     * The value of this property is an NSArray of AVCaptureInputs currently added to the receiver. Clients can add
     * AVCaptureInputs to a session by calling -addInput:.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("inputs")
    public native NSArray<? extends AVCaptureInput> inputs();

    /**
     * [@property] interrupted
     * 
     * Indicates whether the session is being interrupted.
     * 
     * The value of this property is a BOOL indicating whether the receiver is currently being interrupted, such as by a
     * phone call or alarm. Clients can key value observe the value of this property to be notified when the session
     * ceases to be interrupted and again has access to needed hardware resources.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("isInterrupted")
    public native boolean isInterrupted();

    /**
     * [@property] running
     * 
     * Indicates whether the session is currently running.
     * 
     * The value of this property is a BOOL indicating whether the receiver is running. Clients can key value observe
     * the value of this property to be notified when the session automatically starts or stops running.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    /**
     * [@property] masterClock
     * 
     * Provides the clock being used for synchronization.
     * 
     * Deprecated. Please use synchronizationClock instead.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 15.4
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("masterClock")
    public native CMClockRef masterClock();

    /**
     * [@property] outputs
     * 
     * An NSArray of AVCaptureOutputs currently added to the receiver.
     * 
     * The value of this property is an NSArray of AVCaptureOutputs currently added to the receiver. Clients can add
     * AVCaptureOutputs to a session by calling -addOutput:.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("outputs")
    public native NSArray<? extends AVCaptureOutput> outputs();

    /**
     * removeConnection:
     * 
     * Removes an AVCaptureConnection from the session.
     * 
     * -removeConnection: may be called while the session is running.
     * 
     * API-Since: 8.0
     * 
     * @param connection
     *                   An AVCaptureConnection instance.
     */
    @Generated
    @Selector("removeConnection:")
    public native void removeConnection(@NotNull AVCaptureConnection connection);

    /**
     * removeInput:
     * 
     * Removes an AVCaptureInput from the session.
     * 
     * -removeInput: may be called while the session is running.
     * 
     * API-Since: 4.0
     * 
     * @param input
     *              An AVCaptureInput instance.
     */
    @Generated
    @Selector("removeInput:")
    public native void removeInput(@NotNull AVCaptureInput input);

    /**
     * removeOutput:
     * 
     * Removes an AVCaptureOutput from the session.
     * 
     * -removeOutput: may be called while the session is running.
     * 
     * API-Since: 4.0
     * 
     * @param output
     *               An AVCaptureOutput instance.
     */
    @Generated
    @Selector("removeOutput:")
    public native void removeOutput(@NotNull AVCaptureOutput output);

    /**
     * [@property] sessionPreset
     * 
     * Indicates the session preset currently in use by the receiver.
     * 
     * The value of this property is an AVCaptureSessionPreset indicating the current session preset in use by the
     * receiver. The sessionPreset property may be set while the receiver is running.
     */
    @NotNull
    @Generated
    @Selector("sessionPreset")
    public native String sessionPreset();

    /**
     * [@property] automaticallyConfiguresApplicationAudioSession
     * 
     * Indicates whether the receiver should configure the application's audio session for recording.
     * 
     * The value of this property is a BOOL indicating whether the receiver should configure the application's audio
     * session when needed for optimal recording. When set to YES, the receiver ensures the application's audio session
     * is set to the PlayAndRecord category, and picks an appropriate microphone and polar pattern to match the video
     * camera being used. When set to NO, and -usesApplicationAudioSession is set to YES, the receiver will use the
     * application's audio session, but will not change any of its properties. If the session is not set up correctly
     * for input, audio recording may fail. The default value is YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setAutomaticallyConfiguresApplicationAudioSession:")
    public native void setAutomaticallyConfiguresApplicationAudioSession(boolean value);

    /**
     * [@property] automaticallyConfiguresCaptureDeviceForWideColor
     * 
     * Indicates whether the receiver automatically configures its video device's activeFormat and activeColorSpace
     * properties, preferring wide color for photos.
     * 
     * The default value is YES. By default, the receiver automatically adjusts its source video AVCaptureDevice's
     * activeFormat and activeColorSpace properties based on the supportedColorSpaces of the device's formats and the
     * current AVCaptureSession topology. Wide color spaces are preferred over sRGB if an AVCapturePhotoOutput is
     * present in the session. If you wish to set AVCaptureDevice's activeColorSpace manually, and prevent the
     * AVCaptureSession from undoing your work, you must set automaticallyConfiguresCaptureDeviceForWideColor to NO. If
     * the receiver's sessionPreset is set to AVCaptureSessionPresetInputPriority, the session will not alter the
     * capture device's activeFormat, but might still alter its activeColorSpace.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setAutomaticallyConfiguresCaptureDeviceForWideColor:")
    public native void setAutomaticallyConfiguresCaptureDeviceForWideColor(boolean value);

    /**
     * [@property] sessionPreset
     * 
     * Indicates the session preset currently in use by the receiver.
     * 
     * The value of this property is an AVCaptureSessionPreset indicating the current session preset in use by the
     * receiver. The sessionPreset property may be set while the receiver is running.
     */
    @Generated
    @Selector("setSessionPreset:")
    public native void setSessionPreset(@NotNull String value);

    /**
     * [@property] usesApplicationAudioSession
     * 
     * Indicates whether the receiver will use the application's AVAudioSession for recording.
     * 
     * The value of this property is a BOOL indicating whether the receiver is currently using the application's
     * AVAudioSession (see AVAudioSession.h). Prior to iOS 7, AVCaptureSession uses its own audio session, which can
     * lead to unwanted interruptions when interacting with the application's audio session. In applications linked on
     * or after iOS 7, AVCaptureSession shares the application's audio session, allowing for simultaneous play back and
     * recording without unwanted interruptions. Clients desiring the pre-iOS 7 behavior may opt out by setting
     * usesApplicationAudioSession to NO. The default value is YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setUsesApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean value);

    /**
     * startRunning
     * 
     * Starts an AVCaptureSession instance running.
     * 
     * Clients invoke -startRunning to start the flow of data from inputs to outputs connected to the AVCaptureSession
     * instance. This call blocks until the session object has completely started up or failed. A failure to start
     * running is reported through the AVCaptureSessionRuntimeErrorNotification mechanism. If you've called
     * -beginConfiguration, you must call -commitConfiguration before invoking -startRunning, otherwise an
     * NSGenericException is thrown.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("startRunning")
    public native void startRunning();

    /**
     * stopRunning
     * 
     * Stops an AVCaptureSession instance that is currently running.
     * 
     * Clients invoke -stopRunning to stop the flow of data from inputs to outputs connected to the AVCaptureSession
     * instance. This call blocks until the session object has completely stopped. -stopRunning may not be called while
     * the session is being configured. If you've called -beginConfiguration, you must call -commitConfiguration before
     * invoking -stopRunning, otherwise an NSGenericException is thrown.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("stopRunning")
    public native void stopRunning();

    /**
     * [@property] usesApplicationAudioSession
     * 
     * Indicates whether the receiver will use the application's AVAudioSession for recording.
     * 
     * The value of this property is a BOOL indicating whether the receiver is currently using the application's
     * AVAudioSession (see AVAudioSession.h). Prior to iOS 7, AVCaptureSession uses its own audio session, which can
     * lead to unwanted interruptions when interacting with the application's audio session. In applications linked on
     * or after iOS 7, AVCaptureSession shares the application's audio session, allowing for simultaneous play back and
     * recording without unwanted interruptions. Clients desiring the pre-iOS 7 behavior may opt out by setting
     * usesApplicationAudioSession to NO. The default value is YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("usesApplicationAudioSession")
    public native boolean usesApplicationAudioSession();

    /**
     * [@property] connections
     * 
     * An NSArray of AVCaptureConnections currently added to the receiver.
     * 
     * The value of this property is an NSArray of AVCaptureConnections currently added to the receiver. Connections are
     * formed implicitly by the receiver when a client calls -addInput: or -addOutput:. Connections are formed
     * explicitly when a client calls -addConnection:.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("connections")
    public native NSArray<? extends AVCaptureConnection> connections();

    /**
     * [@property] hardwareCost
     * 
     * Indicates the percentage of the session's available hardware budget currently in use.
     * 
     * The value of this property is a float from 0.0 => 1.0 indicating how much of the session's available hardware is
     * in use as a percentage, given the currently connected inputs and outputs and the features for which you've opted
     * in. When your hardwareCost is greater than 1.0, the capture session cannot run your desired configuration due to
     * hardware constraints, so you receive an AVCaptureSessionRuntimeErrorNotification when attempting to start it
     * running. Default value is 0.
     * 
     * Contributors to hardwareCost include:
     * - Whether the source device's active format uses the full sensor (4:3) or a crop (16:9). Cropped formats require
     * lower hardware bandwidth, and therefore lower the cost.
     * - The max frame rate supported by the source device's active format. The higher the max frame rate, the higher
     * the cost.
     * - Whether the source device's active format is binned or not. Binned formats require substantially less hardware
     * bandwidth, and therefore result in a lower cost.
     * - The number of sources configured to deliver streaming disparity / depth via AVCaptureDepthDataOutput. The
     * higher the number of cameras configured to produce depth, the higher the cost.
     * For AVCaptureMultiCamSessions, all of the source devices' active formats contribute to hardwareCost.
     * In order to reduce hardwareCost, consider picking a sensor-cropped activeFormat, or a binned format. You may also
     * use AVCaptureDeviceInput's videoMinFrameDurationOverride property to artificially limit the max frame rate (which
     * is the reciprocal of the min frame duration) of a source device to a lower value. By doing so, you only pay the
     * hardware cost for the max frame rate you intend to use.
     * 
     * AVCaptureMultiCamSessions always computes this hardwareCost. AVCaptureSessions only computes a non-zero
     * hardwareCost when multiple AVCaptureVideoDataOutputs or an AVCaptureMovieFileOutput and one or more
     * AVCaptureVideoDataOutputs are added to the session.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("hardwareCost")
    public native float hardwareCost();

    /**
     * [@property] multitaskingCameraAccessEnabled
     * 
     * Indicates whether the session is configured to use the camera while multitasking.
     * 
     * The default value is NO. This property may only be set if -isMultitaskingCameraAccessSupported returns YES. This
     * property must be set before the session starts running.
     * 
     * AVCaptureSessions that are configured to use the camera while multitasking will not be interrupted with
     * AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableWithMultipleForegroundApps.
     * 
     * For applications that have the com.apple.developer.avfoundation.multitasking-camera-access entitlement, this
     * property defaults to YES if -isMultitaskingCameraAccessSupported returns YES.
     * 
     * To learn about best practices for using the camera while multitasking, refer to the Accessing the Camera While
     * Multitasking article on developer.apple.com. See
     * https://developer.apple.com/documentation/avkit/accessing_the_camera_while_multitasking\.
     * 
     * This property is key-value observable.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isMultitaskingCameraAccessEnabled")
    public native boolean isMultitaskingCameraAccessEnabled();

    /**
     * [@property] multitaskingCameraAccessSupported
     * 
     * Returns whether the session can be configured to use the camera while multitasking.
     * 
     * This property can be used to determine whether multitaskingCameraAccessEnabled may be set to YES. When this
     * property changes from YES to NO, multitaskingCameraAccessEnabled also reverts to NO.
     * 
     * Prior to iOS 18, this property returns YES on iPads that support Stage Manager with an extended display. In
     * applications linked on or after iOS 18, this property returns YES for video conferencing applications (apps that
     * use "voip" as one of their UIBackgroundModes).
     * 
     * This property also returns YES for iOS applications that have the
     * com.apple.developer.avfoundation.multitasking-camera-access entitlement.
     * 
     * This property returns YES on Apple TV.
     * 
     * This property is key-value observable.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isMultitaskingCameraAccessSupported")
    public native boolean isMultitaskingCameraAccessSupported();

    /**
     * [@property] multitaskingCameraAccessEnabled
     * 
     * Indicates whether the session is configured to use the camera while multitasking.
     * 
     * The default value is NO. This property may only be set if -isMultitaskingCameraAccessSupported returns YES. This
     * property must be set before the session starts running.
     * 
     * AVCaptureSessions that are configured to use the camera while multitasking will not be interrupted with
     * AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableWithMultipleForegroundApps.
     * 
     * For applications that have the com.apple.developer.avfoundation.multitasking-camera-access entitlement, this
     * property defaults to YES if -isMultitaskingCameraAccessSupported returns YES.
     * 
     * To learn about best practices for using the camera while multitasking, refer to the Accessing the Camera While
     * Multitasking article on developer.apple.com. See
     * https://developer.apple.com/documentation/avkit/accessing_the_camera_while_multitasking\.
     * 
     * This property is key-value observable.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMultitaskingCameraAccessEnabled:")
    public native void setMultitaskingCameraAccessEnabled(boolean value);

    /**
     * [@property] synchronizationClock
     * 
     * Provides the clock being used for synchronization.
     * 
     * synchronizationClock is readonly. Use synchronizationClock to synchronize AVCaptureOutput data with external data
     * sources (e.g motion samples). All capture output sample buffer timestamps are on the synchronizationClock
     * timebase.
     * 
     * For example, if you want to reverse synchronize the output timestamps to the original timestamps, you can do the
     * following: In captureOutput:didOutputSampleBuffer:fromConnection:
     * 
     * AVCaptureInputPort *port = [[connection inputPorts] objectAtIndex:0];
     * CMClockRef originalClock = [port clock];
     * 
     * CMTime syncedPTS = CMSampleBufferGetPresentationTime( sampleBuffer );
     * CMTime originalPTS = CMSyncConvertTime( syncedPTS, [session synchronizationClock], originalClock );
     * 
     * This property is key-value observable.
     * 
     * API-Since: 15.4
     */
    @Nullable
    @Generated
    @Selector("synchronizationClock")
    public native CMClockRef synchronizationClock();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * addControl:
     * 
     * Adds an `AVCaptureControl` instance to the session.
     * 
     * An `AVCaptureControl` instance can only be added to a session using `-addControl:` if `-canAddControl:` returns
     * `YES`, otherwise an `NSInvalidArgumentException` is thrown. `-addControl:` may be called while the session is
     * running.
     * 
     * For an `AVCaptureControl` instance to become active, an `AVCaptureSessionControlsDelegate` must be set on the
     * session.
     * 
     * API-Since: 18.0
     * 
     * @param control
     *                An `AVCaptureControl` instance.
     */
    @Generated
    @Selector("addControl:")
    public native void addControl(@NotNull AVCaptureControl control);

    /**
     * canAddControl:
     * 
     * Returns whether the proposed control can be added to the session.
     * 
     * An `AVCaptureControl` instance can only be added to a session using `-addControl:` if `-canAddControl:` returns
     * `YES`. For example, some platforms do not support controls. Instances of `AVCaptureSlider`, `AVCaptureToggle` and
     * `AVCaptureIndexPicker` must have an action and an action queue set before being added to a session.
     * 
     * API-Since: 18.0
     * 
     * @param control
     *                An `AVCaptureControl` instance.
     * @return
     *         `YES` if the proposed control can be added to the session, `NO` otherwise.
     */
    @Generated
    @Selector("canAddControl:")
    public native boolean canAddControl(@NotNull AVCaptureControl control);

    /**
     * [@property] configuresApplicationAudioSessionToMixWithOthers
     * 
     * Indicates whether the receiver should configure the application's audio session to mix with others.
     * 
     * The value of this property is a BOOL indicating whether the receiver should configure the application's audio
     * session to mix with, instead of interrupting, any ongoing audio sessions. It has no effect when
     * usesApplicationAudioSession is set to NO. It also has no effect on Live Photo movie complement capture (where
     * music is always mixed with). The default value is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("configuresApplicationAudioSessionToMixWithOthers")
    public native boolean configuresApplicationAudioSessionToMixWithOthers();

    /**
     * [@property] controls
     * 
     * An `NSArray` of `AVCaptureControl`s currently added to the session.
     * 
     * The value of this property is an `NSArray` of `AVCaptureControl`s currently added to the session. Clients can add
     * `AVCaptureControl`s to a session by calling `-addControl:`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("controls")
    @NotNull
    public native NSArray<? extends AVCaptureControl> controls();

    /**
     * [@property] controlsDelegate
     * 
     * The receiver's controls delegate.
     * 
     * The value of this property is an object conforming to the `AVCaptureSessionControlsDelegate` protocol that
     * receives events about the session's controls. The delegate is set using the `-setControlsDelegate:queue:` method.
     * 
     * A controls delegate must be specified for controls to become active.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("controlsDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVCaptureSessionControlsDelegate controlsDelegate();

    /**
     * [@property] controlsDelegateCallbackQueue
     * 
     * The dispatch queue on which all controls delegate methods will be called.
     * 
     * The value of this property is a `dispatch_queue_t`. The queue is set using the `-setControlsDelegate:queue:`
     * method.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("controlsDelegateCallbackQueue")
    @Nullable
    public native dispatch_queue_t controlsDelegateCallbackQueue();

    /**
     * [@property] maxControlsCount
     * 
     * Specifies the maximum number of controls that can be added to a session.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("maxControlsCount")
    @NInt
    public native long maxControlsCount();

    /**
     * removeControl:
     * 
     * Removes an `AVCaptureControl` instance from the session.
     * 
     * `-removeControl:` may be called while the session is running.
     * 
     * API-Since: 18.0
     * 
     * @param control
     *                An `AVCaptureControl` instance.
     */
    @Generated
    @Selector("removeControl:")
    public native void removeControl(@NotNull AVCaptureControl control);

    /**
     * [@property] configuresApplicationAudioSessionToMixWithOthers
     * 
     * Indicates whether the receiver should configure the application's audio session to mix with others.
     * 
     * The value of this property is a BOOL indicating whether the receiver should configure the application's audio
     * session to mix with, instead of interrupting, any ongoing audio sessions. It has no effect when
     * usesApplicationAudioSession is set to NO. It also has no effect on Live Photo movie complement capture (where
     * music is always mixed with). The default value is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setConfiguresApplicationAudioSessionToMixWithOthers:")
    public native void setConfiguresApplicationAudioSessionToMixWithOthers(boolean value);

    /**
     * setControlsDelegate:queue:
     * 
     * Sets the receiver's controls delegate that receives events about the session's controls and the dispatch queue on
     * which the delegate is called.
     * 
     * Users can interact with an `AVCaptureSession`'s controls by performing specific gestures to enable their
     * visibility. A delegate may be specified to be informed when the controls can be interacted with and are
     * dismissed. All delegate methods will be called on the specified dispatch queue.
     * 
     * A serial dispatch queue must be used to guarantee that delegate callbacks will be delivered in order. The
     * `controlsDelegateCallbackQueue` parameter may not be `NULL`, except when setting the `controlsDelegate` to `nil`
     * otherwise `-setControlsDelegate:queue:` throws an `NSInvalidArgumentException`.
     * 
     * API-Since: 18.0
     * 
     * @param controlsDelegate
     *                                      An object conforming to the `AVCaptureSessionControlsDelegate` protocol that
     *                                      receives events about the session's controls.
     * @param controlsDelegateCallbackQueue
     *                                      A dispatch queue on which all delegate methods are called.
     */
    @Generated
    @Selector("setControlsDelegate:queue:")
    public native void setControlsDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @Nullable AVCaptureSessionControlsDelegate controlsDelegate,
            @Nullable dispatch_queue_t controlsDelegateCallbackQueue);

    /**
     * [@property] supportsControls
     * 
     * Indicates whether session controls are supported on this platform.
     * 
     * `AVCaptureControl`s are only supported on platforms with necessary hardware.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportsControls")
    public native boolean supportsControls();

    /**
     * A `BOOL` value that indicates whether deferred start runs automatically.
     * 
     * Deferred Start is a feature that allows you to control, on a per-output basis, whether output objects start when
     * or after the session is started. The session defers starting an output when its
     * ``AVCaptureOutput/deferredStartEnabled`` property is set to `true`, and starts it after the session is started.
     * 
     * When this value is `true`, ``AVCaptureSession`` automatically runs deferred start. If only
     * ``AVCaptureVideoPreviewLayer`` objects have ``AVCaptureVideoPreviewLayer/deferredStartEnabled`` set to `false`,
     * the session runs deferred start a short time after displaying the first frame. If there are ``AVCaptureOutput``
     * objects that have ``AVCaptureOutput/deferredStartEnabled`` set to `false`, then the session waits until each
     * output that provides streaming data to your app sends its first frame.
     * 
     * If you set this value to `false`, call ``runDeferredStartWhenNeeded`` to indicate when to run deferred start.
     * 
     * By default, for apps that are linked on or after iOS 26, this value is `true`.
     * 
     * - Note: If ``manualDeferredStartSupported`` is `false`, setting this property value to `false` results in the
     * session throwing an `NSInvalidArgumentException`.
     * 
     * - Note: Set this value before committing the configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("automaticallyRunsDeferredStart")
    public native boolean automaticallyRunsDeferredStart();

    /**
     * Indicates whether the receiver should configure the application's audio session for bluetooth high quality
     * recording.
     * 
     * The value of this property is a `BOOL` indicating whether the receiver should configure the application's audio
     * session for bluetooth high quality recording (AirPods as a high quality microphone). When this property is set to
     * `true`, the ``AVCaptureSession`` will opt in for high quality bluetooth recording, allowing users of your app to
     * select AirPods as the active mic source for capture. This property has no effect when
     * ``usesApplicationAudioSession`` is set to `false`. The default value is `false`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configuresApplicationAudioSessionForBluetoothHighQualityRecording")
    public native boolean configuresApplicationAudioSessionForBluetoothHighQualityRecording();

    /**
     * A delegate object that observes events about deferred start.
     * 
     * Call the ``setDeferredStartDelegate:deferredStartDelegateCallbackQueue:`` method to set the deferred start
     * delegate for a session.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("deferredStartDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVCaptureSessionDeferredStartDelegate deferredStartDelegate();

    /**
     * The dispatch queue on which the session calls deferred start delegate methods.
     * 
     * Call the ``setDeferredStartDelegate:deferredStartDelegateCallbackQueue:`` method to specify the dispatch queue on
     * which to call the deferred start delegate methods.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("deferredStartDelegateCallbackQueue")
    @Nullable
    public native dispatch_queue_t deferredStartDelegateCallbackQueue();

    /**
     * A `BOOL` value that indicates whether the session supports manually running deferred start.
     * 
     * Deferred Start is a feature that allows you to control, on a per-output basis, whether output objects start when
     * or after the session is started. The session defers starting an output when its ``deferredStartEnabled`` property
     * is set to `true`, and starts it after the session is started.
     * 
     * You can only set the ``automaticallyRunsDeferredStart`` property value to `false` if the session supports manual
     * deferred start.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isManualDeferredStartSupported")
    public native boolean isManualDeferredStartSupported();

    /**
     * Tells the session to run deferred start when appropriate.
     * 
     * For best perceived startup performance, call this after displaying the first frame, so that deferred start
     * processing doesn't interfere with other initialization operations. For example, if using a
     * <doc://com.apple.documentation/documentation/quartzcore/cametallayer> to draw camera frames, add a
     * `presentHandler` (using <doc://com.apple.documentation/metal/mtldrawable/addpresentedhandler>) to the first
     * drawable and call ``runDeferredStartWhenNeeded`` from there.
     * 
     * If one or more outputs need to start to perform a capture operation, and ``runDeferredStartWhenNeeded`` has not
     * run yet, the session runs the deferred start on your app's behalf. Only call this method once for each
     * configuration commit - after the first call, subsequent calls to ``runDeferredStartWhenNeeded`` have no effect.
     * The deferred start runs asynchronously, so this method returns immediately.
     * 
     * - Note: You can only call this when ``automaticallyRunsDeferredStart`` is `false`. Otherwise, the session throws
     * an `NSInvalidArgumentException`.
     * 
     * - Important: To avoid blocking your app's UI, don't call this method from the application's main actor or queue.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("runDeferredStartWhenNeeded")
    public native void runDeferredStartWhenNeeded();

    /**
     * A `BOOL` value that indicates whether deferred start runs automatically.
     * 
     * Deferred Start is a feature that allows you to control, on a per-output basis, whether output objects start when
     * or after the session is started. The session defers starting an output when its
     * ``AVCaptureOutput/deferredStartEnabled`` property is set to `true`, and starts it after the session is started.
     * 
     * When this value is `true`, ``AVCaptureSession`` automatically runs deferred start. If only
     * ``AVCaptureVideoPreviewLayer`` objects have ``AVCaptureVideoPreviewLayer/deferredStartEnabled`` set to `false`,
     * the session runs deferred start a short time after displaying the first frame. If there are ``AVCaptureOutput``
     * objects that have ``AVCaptureOutput/deferredStartEnabled`` set to `false`, then the session waits until each
     * output that provides streaming data to your app sends its first frame.
     * 
     * If you set this value to `false`, call ``runDeferredStartWhenNeeded`` to indicate when to run deferred start.
     * 
     * By default, for apps that are linked on or after iOS 26, this value is `true`.
     * 
     * - Note: If ``manualDeferredStartSupported`` is `false`, setting this property value to `false` results in the
     * session throwing an `NSInvalidArgumentException`.
     * 
     * - Note: Set this value before committing the configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAutomaticallyRunsDeferredStart:")
    public native void setAutomaticallyRunsDeferredStart(boolean value);

    /**
     * Indicates whether the receiver should configure the application's audio session for bluetooth high quality
     * recording.
     * 
     * The value of this property is a `BOOL` indicating whether the receiver should configure the application's audio
     * session for bluetooth high quality recording (AirPods as a high quality microphone). When this property is set to
     * `true`, the ``AVCaptureSession`` will opt in for high quality bluetooth recording, allowing users of your app to
     * select AirPods as the active mic source for capture. This property has no effect when
     * ``usesApplicationAudioSession`` is set to `false`. The default value is `false`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setConfiguresApplicationAudioSessionForBluetoothHighQualityRecording:")
    public native void setConfiguresApplicationAudioSessionForBluetoothHighQualityRecording(boolean value);

    /**
     * Sets a delegate object for the session to call when performing deferred start.
     * 
     * This delegate receives a call to the ``AVCaptureSessionDeferredStartDelegate/sessionWillRunDeferredStart:``
     * method when deferred start is about to run. It is non-blocking, so by the time this method is called, the
     * deferred start may already be underway. If you want your app to perform initialization (potentially) concurrently
     * with deferred start (e.g. user-facing camera features that are not needed to display the first preview frame, but
     * are available to the user as soon as possible) it may be done in the delegate's
     * ``AVCaptureSessionDeferredStartDelegate/sessionWillRunDeferredStart:`` method. To wait until deferred start is
     * finished to perform some remaining initialization work, use the
     * ``AVCaptureSessionDeferredStartDelegate/sessionDidRunDeferredStart:`` method instead.
     * 
     * The delegate receives a call to the ``AVCaptureSessionDeferredStartDelegate/sessionDidRunDeferredStart:`` method
     * when the deferred start finishes running. This allows you to run less-critical application initialization code.
     * For example, if you've deferred an ``AVCapturePhotoOutput`` by setting its
     * ``AVCaptureOutput/deferredStartEnabled`` property to `true`, and you'd like to do some app-specific
     * initialization related to still capture, here might be a good place to put it.
     * 
     * If the delegate is non-nil, the session still calls the
     * ``AVCaptureSessionDeferredStartDelegate/sessionWillRunDeferredStart:`` and
     * ``AVCaptureSessionDeferredStartDelegate/sessionDidRunDeferredStart:`` methods regardless of the value of the
     * session's ``automaticallyRunsDeferredStart`` property.
     * 
     * To minimize the capture session's startup latency, defer all unnecessary work until after the session starts.
     * This delegate provides callbacks for you to schedule deferred work without impacting session startup performance.
     * 
     * To perform initialization prior to deferred start but after the user interface displays, set
     * ``automaticallyRunsDeferredStart`` to `false`, and then run the custom initialization prior to calling
     * ``runDeferredStartWhenNeeded``.
     * 
     * If ``deferredStartDelegate`` is not `NULL`, the session throws an exception if
     * ``deferredStartDelegateCallbackQueue`` is `nil`.
     * 
     * - Parameter deferredStartDelegate: An object conforming to the ``AVCaptureSessionDeferredStartDelegate`` protocol
     * that receives events about deferred start.
     * - Parameter deferredStartDelegateCallbackQueue: A dispatch queue on which deferredStart delegate methods are
     * called.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDeferredStartDelegate:deferredStartDelegateCallbackQueue:")
    public native void setDeferredStartDelegateDeferredStartDelegateCallbackQueue(
            @Mapped(ObjCObjectMapper.class) @Nullable AVCaptureSessionDeferredStartDelegate deferredStartDelegate,
            @Nullable dispatch_queue_t deferredStartDelegateCallbackQueue);
}
