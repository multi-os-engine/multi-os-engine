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

/**
 * AVCaptureSession
 * <p>
 * AVCaptureSession is the central hub of the AVFoundation capture classes.
 * <p>
 * To perform a real-time capture, a client may instantiate AVCaptureSession and add appropriate AVCaptureInputs, such
 * as AVCaptureDeviceInput, and outputs, such as AVCaptureMovieFileOutput. [AVCaptureSession startRunning] starts the
 * flow of data from the inputs to the outputs, and [AVCaptureSession stopRunning] stops the flow. A client may set the
 * sessionPreset property to customize the quality level or bitrate of the output.
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
     * <p>
     * Adds an AVCaptureConnection to the session.
     * <p>
     * An AVCaptureConnection instance can only be added to a session using -addConnection: if canAddConnection: returns
     * YES. When using -addInput: or -addOutput:, connections are formed automatically between all compatible inputs and
     * outputs. Manually adding connections is only necessary when adding an input or output with no connections.
     * -addConnection: may be called while the session is running.
     *
     * @param connection An AVCaptureConnection instance.
     */
    @Generated
    @Selector("addConnection:")
    public native void addConnection(AVCaptureConnection connection);

    /**
     * addInput:
     * <p>
     * Adds an AVCaptureInput to the session.
     * <p>
     * An AVCaptureInput instance can only be added to a session using -addInput: if -canAddInput: returns YES.
     * -addInput: may be called while the session is running.
     *
     * @param input An AVCaptureInput instance.
     */
    @Generated
    @Selector("addInput:")
    public native void addInput(AVCaptureInput input);

    /**
     * addInputWithNoConnections:
     * <p>
     * Adds an AVCaptureInput to the session without forming any connections.
     * <p>
     * -addInputWithNoConnections: may be called while the session is running. The -addInput: method is the preferred
     * method for adding an input to an AVCaptureSession. -addInputWithNoConnections: may be called if you need
     * fine-grained control over which inputs are connected to which outputs.
     *
     * @param input An AVCaptureInput instance.
     */
    @Generated
    @Selector("addInputWithNoConnections:")
    public native void addInputWithNoConnections(AVCaptureInput input);

    /**
     * addOutput:
     * <p>
     * Adds an AVCaptureOutput to the session.
     * <p>
     * An AVCaptureOutput instance can only be added to a session using -addOutput: if -canAddOutput: returns YES.
     * -addOutput: may be called while the session is running.
     *
     * @param output An AVCaptureOutput instance.
     */
    @Generated
    @Selector("addOutput:")
    public native void addOutput(AVCaptureOutput output);

    /**
     * addOutputWithNoConnections:
     * <p>
     * Adds an AVCaptureOutput to the session without forming any connections.
     * <p>
     * -addOutputWithNoConnections: may be called while the session is running. The -addOutput: method is the preferred
     * method for adding an output to an AVCaptureSession. -addOutputWithNoConnections: may be called if you need
     * fine-grained control over which inputs are connected to which outputs.
     *
     * @param output An AVCaptureOutput instance.
     */
    @Generated
    @Selector("addOutputWithNoConnections:")
    public native void addOutputWithNoConnections(AVCaptureOutput output);

    /**
     * [@property] automaticallyConfiguresApplicationAudioSession
     * <p>
     * Indicates whether the receiver should configure the application's audio session for recording.
     * <p>
     * The value of this property is a BOOL indicating whether the receiver should configure the application's audio
     * session when needed for optimal recording. When set to YES, the receiver ensures the application's audio session
     * is set to the PlayAndRecord category, and picks an appropriate microphone and polar pattern to match the video
     * camera being used. When set to NO, and -usesApplicationAudioSession is set to YES, the receiver will use the
     * application's audio session, but will not change any of its properties. If the session is not set up correctly
     * for input, audio recording may fail. The default value is YES.
     */
    @Generated
    @Selector("automaticallyConfiguresApplicationAudioSession")
    public native boolean automaticallyConfiguresApplicationAudioSession();

    /**
     * [@property] automaticallyConfiguresCaptureDeviceForWideColor
     * <p>
     * Indicates whether the receiver automatically configures its video device's activeFormat and activeColorSpace
     * properties, preferring wide color for photos.
     * <p>
     * The default value is YES. By default, the receiver automatically adjusts its source video AVCaptureDevice's
     * activeFormat and activeColorSpace properties based on the supportedColorSpaces of the device's formats and the
     * current AVCaptureSession topology. Wide color spaces are preferred over sRGB if an AVCapturePhotoOutput is
     * present in the session. If you wish to set AVCaptureDevice's activeColorSpace manually, and prevent the
     * AVCaptureSession from undoing your work, you must set automaticallyConfiguresCaptureDeviceForWideColor to NO. If
     * the receiver's sessionPreset is set to AVCaptureSessionPresetInputPriority, the session will not alter the
     * capture device's activeFormat, but might still alter its activeColorSpace.
     */
    @Generated
    @Selector("automaticallyConfiguresCaptureDeviceForWideColor")
    public native boolean automaticallyConfiguresCaptureDeviceForWideColor();

    /**
     * beginConfiguration
     * <p>
     * When paired with commitConfiguration, allows a client to batch multiple configuration operations on a running
     * session into atomic updates.
     * <p>
     * -beginConfiguration / -commitConfiguration are AVCaptureSession's mechanism for batching multiple configuration
     * operations on a running session into atomic updates. After calling [session beginConfiguration], clients may add
     * or remove outputs, alter the sessionPreset, or configure individual AVCaptureInput or Output properties. All
     * changes will be pended until the client calls [session commitConfiguration], at which time they will be applied
     * together. -beginConfiguration / -commitConfiguration pairs may be nested, and will only be applied when the
     * outermost commit is invoked.
     */
    @Generated
    @Selector("beginConfiguration")
    public native void beginConfiguration();

    /**
     * canAddConnection:
     * <p>
     * Returns whether the proposed connection can be added to the receiver.
     * <p>
     * An AVCaptureConnection instance can only be added to a session using -addConnection: if canAddConnection: returns
     * YES. When using -addInput: or -addOutput:, connections are formed automatically between all compatible inputs and
     * outputs. Manually adding connections is only necessary when adding an input or output with no connections.
     *
     * @param connection An AVCaptureConnection instance.
     */
    @Generated
    @Selector("canAddConnection:")
    public native boolean canAddConnection(AVCaptureConnection connection);

    /**
     * canAddInput:
     * <p>
     * Returns whether the proposed input can be added to the receiver.
     * <p>
     * An AVCaptureInput instance can only be added to a session using -addInput: if -canAddInput: returns YES.
     *
     * @param input An AVCaptureInput instance.
     * @return YES if the proposed input can be added to the receiver, NO otherwise.
     */
    @Generated
    @Selector("canAddInput:")
    public native boolean canAddInput(AVCaptureInput input);

    /**
     * canAddOutput:
     * <p>
     * Returns whether the proposed output can be added to the receiver.
     * <p>
     * An AVCaptureOutput instance can only be added to a session using -addOutput: if -canAddOutput: returns YES.
     *
     * @param output An AVCaptureOutput instance.
     * @return YES if the proposed output can be added to the receiver, NO otherwise.
     */
    @Generated
    @Selector("canAddOutput:")
    public native boolean canAddOutput(AVCaptureOutput output);

    /**
     * canSetSessionPreset:
     * <p>
     * Returns whether the receiver can be configured with the given preset.
     * <p>
     * An AVCaptureSession instance can be associated with a preset that configures its inputs and outputs to fulfill
     * common use cases. This method can be used to determine if the receiver supports the desired preset given its
     * current input and output configuration. The receiver's sessionPreset property may only be set to a certain preset
     * if this method returns YES for that preset.
     *
     * @param preset An AVCaptureSession preset.
     * @return YES if the receiver can be set to the given preset, NO otherwise.
     */
    @Generated
    @Selector("canSetSessionPreset:")
    public native boolean canSetSessionPreset(String preset);

    /**
     * commitConfiguration
     * <p>
     * When preceded by beginConfiguration, allows a client to batch multiple configuration operations on a running
     * session into atomic updates.
     * <p>
     * -beginConfiguration / -commitConfiguration are AVCaptureSession's mechanism for batching multiple configuration
     * operations on a running session into atomic updates. After calling [session beginConfiguration], clients may add
     * or remove outputs, alter the sessionPreset, or configure individual AVCaptureInput or Output properties. All
     * changes will be pended until the client calls [session commitConfiguration], at which time they will be applied
     * together. -beginConfiguration / -commitConfiguration pairs may be nested, and will only be applied when the
     * outermost commit is invoked.
     */
    @Generated
    @Selector("commitConfiguration")
    public native void commitConfiguration();

    @Generated
    @Selector("init")
    public native AVCaptureSession init();

    /**
     * [@property] inputs
     * <p>
     * An NSArray of AVCaptureInputs currently added to the receiver.
     * <p>
     * The value of this property is an NSArray of AVCaptureInputs currently added to the receiver. Clients can add
     * AVCaptureInputs to a session by calling -addInput:.
     */
    @Generated
    @Selector("inputs")
    public native NSArray<? extends AVCaptureInput> inputs();

    /**
     * [@property] interrupted
     * <p>
     * Indicates whether the session is being interrupted.
     * <p>
     * The value of this property is a BOOL indicating whether the receiver is currently being interrupted, such as by a
     * phone call or alarm. Clients can key value observe the value of this property to be notified when the session
     * ceases to be interrupted and again has access to needed hardware resources.
     */
    @Generated
    @Selector("isInterrupted")
    public native boolean isInterrupted();

    /**
     * [@property] running
     * <p>
     * Indicates whether the session is currently running.
     * <p>
     * The value of this property is a BOOL indicating whether the receiver is running. Clients can key value observe
     * the value of this property to be notified when the session automatically starts or stops running.
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    /**
     * [@property] masterClock
     * <p>
     * Provides the master clock being used for output synchronization.
     * <p>
     * The masterClock is readonly. Use masterClock to synchronize AVCaptureOutput data with external data sources (e.g
     * motion samples). All capture output sample buffer timestamps are on the masterClock timebase.
     * <p>
     * For example, if you want to reverse synchronize the output timestamps to the original timestamps, you can do the
     * following: In captureOutput:didOutputSampleBuffer:fromConnection:
     * <p>
     * AVCaptureInputPort *port = [[connection inputPorts] objectAtIndex:0];
     * CMClockRef originalClock = [port clock];
     * <p>
     * CMTime syncedPTS = CMSampleBufferGetPresentationTime( sampleBuffer );
     * CMTime originalPTS = CMSyncConvertTime( syncedPTS, [session masterClock], originalClock );
     * <p>
     * This property is key-value observable.
     */
    @Generated
    @Selector("masterClock")
    public native CMClockRef masterClock();

    /**
     * [@property] outputs
     * <p>
     * An NSArray of AVCaptureOutputs currently added to the receiver.
     * <p>
     * The value of this property is an NSArray of AVCaptureOutputs currently added to the receiver. Clients can add
     * AVCaptureOutputs to a session by calling -addOutput:.
     */
    @Generated
    @Selector("outputs")
    public native NSArray<? extends AVCaptureOutput> outputs();

    /**
     * removeConnection:
     * <p>
     * Removes an AVCaptureConnection from the session.
     * <p>
     * -removeConnection: may be called while the session is running.
     *
     * @param connection An AVCaptureConnection instance.
     */
    @Generated
    @Selector("removeConnection:")
    public native void removeConnection(AVCaptureConnection connection);

    /**
     * removeInput:
     * <p>
     * Removes an AVCaptureInput from the session.
     * <p>
     * -removeInput: may be called while the session is running.
     *
     * @param input An AVCaptureInput instance.
     */
    @Generated
    @Selector("removeInput:")
    public native void removeInput(AVCaptureInput input);

    /**
     * removeOutput:
     * <p>
     * Removes an AVCaptureOutput from the session.
     * <p>
     * -removeOutput: may be called while the session is running.
     *
     * @param output An AVCaptureOutput instance.
     */
    @Generated
    @Selector("removeOutput:")
    public native void removeOutput(AVCaptureOutput output);

    /**
     * [@property] sessionPreset
     * <p>
     * Indicates the session preset currently in use by the receiver.
     * <p>
     * The value of this property is an AVCaptureSessionPreset indicating the current session preset in use by the
     * receiver. The sessionPreset property may be set while the receiver is running.
     */
    @Generated
    @Selector("sessionPreset")
    public native String sessionPreset();

    /**
     * [@property] automaticallyConfiguresApplicationAudioSession
     * <p>
     * Indicates whether the receiver should configure the application's audio session for recording.
     * <p>
     * The value of this property is a BOOL indicating whether the receiver should configure the application's audio
     * session when needed for optimal recording. When set to YES, the receiver ensures the application's audio session
     * is set to the PlayAndRecord category, and picks an appropriate microphone and polar pattern to match the video
     * camera being used. When set to NO, and -usesApplicationAudioSession is set to YES, the receiver will use the
     * application's audio session, but will not change any of its properties. If the session is not set up correctly
     * for input, audio recording may fail. The default value is YES.
     */
    @Generated
    @Selector("setAutomaticallyConfiguresApplicationAudioSession:")
    public native void setAutomaticallyConfiguresApplicationAudioSession(boolean value);

    /**
     * [@property] automaticallyConfiguresCaptureDeviceForWideColor
     * <p>
     * Indicates whether the receiver automatically configures its video device's activeFormat and activeColorSpace
     * properties, preferring wide color for photos.
     * <p>
     * The default value is YES. By default, the receiver automatically adjusts its source video AVCaptureDevice's
     * activeFormat and activeColorSpace properties based on the supportedColorSpaces of the device's formats and the
     * current AVCaptureSession topology. Wide color spaces are preferred over sRGB if an AVCapturePhotoOutput is
     * present in the session. If you wish to set AVCaptureDevice's activeColorSpace manually, and prevent the
     * AVCaptureSession from undoing your work, you must set automaticallyConfiguresCaptureDeviceForWideColor to NO. If
     * the receiver's sessionPreset is set to AVCaptureSessionPresetInputPriority, the session will not alter the
     * capture device's activeFormat, but might still alter its activeColorSpace.
     */
    @Generated
    @Selector("setAutomaticallyConfiguresCaptureDeviceForWideColor:")
    public native void setAutomaticallyConfiguresCaptureDeviceForWideColor(boolean value);

    /**
     * [@property] sessionPreset
     * <p>
     * Indicates the session preset currently in use by the receiver.
     * <p>
     * The value of this property is an AVCaptureSessionPreset indicating the current session preset in use by the
     * receiver. The sessionPreset property may be set while the receiver is running.
     */
    @Generated
    @Selector("setSessionPreset:")
    public native void setSessionPreset(String value);

    /**
     * [@property] usesApplicationAudioSession
     * <p>
     * Indicates whether the receiver will use the application's AVAudioSession for recording.
     * <p>
     * The value of this property is a BOOL indicating whether the receiver is currently using the application's
     * AVAudioSession (see AVAudioSession.h). Prior to iOS 7, AVCaptureSession uses its own audio session, which can
     * lead to unwanted interruptions when interacting with the application's audio session. In applications linked on
     * or after iOS 7, AVCaptureSession shares the application's audio session, allowing for simultaneous play back and
     * recording without unwanted interruptions. Clients desiring the pre-iOS 7 behavior may opt out by setting
     * usesApplicationAudioSession to NO. The default value is YES.
     */
    @Generated
    @Selector("setUsesApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean value);

    /**
     * startRunning
     * <p>
     * Starts an AVCaptureSession instance running.
     * <p>
     * Clients invoke -startRunning to start the flow of data from inputs to outputs connected to the AVCaptureSession
     * instance. This call blocks until the session object has completely started up or failed. A failure to start
     * running is reported through the AVCaptureSessionRuntimeErrorNotification mechanism.
     */
    @Generated
    @Selector("startRunning")
    public native void startRunning();

    /**
     * stopRunning
     * <p>
     * Stops an AVCaptureSession instance that is currently running.
     * <p>
     * Clients invoke -stopRunning to stop the flow of data from inputs to outputs connected to the AVCaptureSession
     * instance. This call blocks until the session object has completely stopped.
     */
    @Generated
    @Selector("stopRunning")
    public native void stopRunning();

    /**
     * [@property] usesApplicationAudioSession
     * <p>
     * Indicates whether the receiver will use the application's AVAudioSession for recording.
     * <p>
     * The value of this property is a BOOL indicating whether the receiver is currently using the application's
     * AVAudioSession (see AVAudioSession.h). Prior to iOS 7, AVCaptureSession uses its own audio session, which can
     * lead to unwanted interruptions when interacting with the application's audio session. In applications linked on
     * or after iOS 7, AVCaptureSession shares the application's audio session, allowing for simultaneous play back and
     * recording without unwanted interruptions. Clients desiring the pre-iOS 7 behavior may opt out by setting
     * usesApplicationAudioSession to NO. The default value is YES.
     */
    @Generated
    @Selector("usesApplicationAudioSession")
    public native boolean usesApplicationAudioSession();

    /**
     * [@property] connections
     * <p>
     * An NSArray of AVCaptureConnections currently added to the receiver.
     * <p>
     * The value of this property is an NSArray of AVCaptureConnections currently added to the receiver. Connections are
     * formed implicitly by the receiver when a client calls -addInput: or -addOutput:. Connections are formed
     * explicitly when a client calls -addConnection:.
     */
    @Generated
    @Selector("connections")
    public native NSArray<? extends AVCaptureConnection> connections();
}
