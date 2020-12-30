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

package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
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

/**
 * CMMotionManager
 * 
 * Discussion:
 *   The CMMotionManager object is your entry point to the motion service.
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMMotionManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMMotionManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMMotionManager alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * availableAttitudeReferenceFrames
     * 
     * Discussion:
     *    Returns a bitmask specifying the available attitude reference frames on the device.
     */
    @Generated
    @Selector("availableAttitudeReferenceFrames")
    @NUInt
    public static native long availableAttitudeReferenceFrames();

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
     * accelerometerData
     * 
     * Discussion:
     *   Returns the latest sample of accelerometer data, or nil if none is available.
     */
    @Generated
    @Selector("accelerometerData")
    public native CMAccelerometerData accelerometerData();

    /**
     * accelerometerUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver accelerometer data to the specified
     *   handler once startAccelerometerUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of acceleration data, an application should always check the
     *   timestamps on the delivered CMAcceleration instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("accelerometerUpdateInterval")
    public native double accelerometerUpdateInterval();

    /**
     * attitudeReferenceFrame
     * 
     * Discussion:
     *   If device motion is active, returns the reference frame currently in-use.
     *   If device motion is not active, returns the default attitude reference frame
     *   for the device. If device motion is not available on the device, the value
     *   is undefined.
     */
    @Generated
    @Selector("attitudeReferenceFrame")
    @NUInt
    public native long attitudeReferenceFrame();

    /**
     * deviceMotion
     * 
     * Discussion:
     *   Returns the latest sample of device motion data, or nil if none is available.
     */
    @Generated
    @Selector("deviceMotion")
    public native CMDeviceMotion deviceMotion();

    /**
     * deviceMotionUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver device motion data to the specified
     *   handler once startDeviceMotionUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of device motion data, an application should always check the
     *   timestamps on the delivered CMDeviceMotion instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("deviceMotionUpdateInterval")
    public native double deviceMotionUpdateInterval();

    /**
     * gyroData
     * 
     * Discussion:
     *   Returns the latest sample of gyro data, or nil if none is available.
     */
    @Generated
    @Selector("gyroData")
    public native CMGyroData gyroData();

    /**
     * gyroUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver gyro data to the specified
     *   handler once startGyroUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of gyro data, an application should always check the
     *   timestamps on the delivered CMGyroData instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("gyroUpdateInterval")
    public native double gyroUpdateInterval();

    @Generated
    @Selector("init")
    public native CMMotionManager init();

    /**
     * accelerometerActive
     * 
     * Discussion:
     *   Determines whether the CMMotionManager is currently providing
     *   accelerometer updates.
     */
    @Generated
    @Selector("isAccelerometerActive")
    public native boolean isAccelerometerActive();

    /**
     * accelerometerAvailable
     * 
     * Discussion:
     *   Determines whether accelerometer is available.
     */
    @Generated
    @Selector("isAccelerometerAvailable")
    public native boolean isAccelerometerAvailable();

    /**
     * deviceMotionActive
     * 
     * Discussion:
     *   Determines whether the CMMotionManager is currently providing device
     *   motion updates.
     */
    @Generated
    @Selector("isDeviceMotionActive")
    public native boolean isDeviceMotionActive();

    /**
     * deviceMotionAvailable
     * 
     * Discussion:
     *   Determines whether device motion is available using any available attitude reference frame.
     */
    @Generated
    @Selector("isDeviceMotionAvailable")
    public native boolean isDeviceMotionAvailable();

    /**
     * gyroActive
     * 
     * Discussion:
     *   Determines whether the CMMotionManager is currently providing gyro updates.
     */
    @Generated
    @Selector("isGyroActive")
    public native boolean isGyroActive();

    /**
     * gyroAvailable
     * 
     * Discussion:
     *   Determines whether gyro is available.
     */
    @Generated
    @Selector("isGyroAvailable")
    public native boolean isGyroAvailable();

    /**
     * magnetometerActive
     * 
     * Discussion:
     *   Determines whether the CMMotionManager is currently providing magnetometer updates.
     */
    @Generated
    @Selector("isMagnetometerActive")
    public native boolean isMagnetometerActive();

    /**
     * magnetometerAvailable
     * 
     * Discussion:
     *   Determines whether magetometer is available.
     */
    @Generated
    @Selector("isMagnetometerAvailable")
    public native boolean isMagnetometerAvailable();

    /**
     * magnetometerData
     * 
     * Discussion:
     *   Returns the latest sample of magnetometer data, or nil if none is available.
     */
    @Generated
    @Selector("magnetometerData")
    public native CMMagnetometerData magnetometerData();

    /**
     * magnetometerUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver magnetometer data to the specified
     *   handler once startMagnetometerUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of magnetometer data, an application should always check the
     *   timestamps on the delivered CMMagnetometerData instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("magnetometerUpdateInterval")
    public native double magnetometerUpdateInterval();

    /**
     * accelerometerUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver accelerometer data to the specified
     *   handler once startAccelerometerUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of acceleration data, an application should always check the
     *   timestamps on the delivered CMAcceleration instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("setAccelerometerUpdateInterval:")
    public native void setAccelerometerUpdateInterval(double value);

    /**
     * deviceMotionUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver device motion data to the specified
     *   handler once startDeviceMotionUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of device motion data, an application should always check the
     *   timestamps on the delivered CMDeviceMotion instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("setDeviceMotionUpdateInterval:")
    public native void setDeviceMotionUpdateInterval(double value);

    /**
     * gyroUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver gyro data to the specified
     *   handler once startGyroUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of gyro data, an application should always check the
     *   timestamps on the delivered CMGyroData instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("setGyroUpdateInterval:")
    public native void setGyroUpdateInterval(double value);

    /**
     * magnetometerUpdateInterval
     * 
     * Discussion:
     *   The interval at which to deliver magnetometer data to the specified
     *   handler once startMagnetometerUpdatesToQueue:withHandler: is called.
     *   The units are in seconds. The value of this property is capped to
     *   certain minimum and maximum values. The maximum value is determined by
     *   the maximum frequency supported by the hardware. If sensitive to the
     *   interval of magnetometer data, an application should always check the
     *   timestamps on the delivered CMMagnetometerData instances to determine the
     *   true update interval.
     */
    @Generated
    @Selector("setMagnetometerUpdateInterval:")
    public native void setMagnetometerUpdateInterval(double value);

    /**
     * showsDeviceMovementDisplay
     * 
     * Discussion:
     *   When the device requires movement, showsDeviceMovementDisplay indicates if the system device
     *   movement display should be shown. Note that when device requires movement,
     *   CMErrorDeviceRequiresMovement is reported once via CMDeviceMotionHandler. By default,
     *   showsDeviceMovementDisplay is NO.
     */
    @Generated
    @Selector("setShowsDeviceMovementDisplay:")
    public native void setShowsDeviceMovementDisplay(boolean value);

    /**
     * showsDeviceMovementDisplay
     * 
     * Discussion:
     *   When the device requires movement, showsDeviceMovementDisplay indicates if the system device
     *   movement display should be shown. Note that when device requires movement,
     *   CMErrorDeviceRequiresMovement is reported once via CMDeviceMotionHandler. By default,
     *   showsDeviceMovementDisplay is NO.
     */
    @Generated
    @Selector("showsDeviceMovementDisplay")
    public native boolean showsDeviceMovementDisplay();

    /**
     * startAccelerometerUpdates
     * 
     * Discussion:
     *   Starts accelerometer updates with no handler. To receive the latest accelerometer data
     *   when desired, examine the accelerometerData property.
     */
    @Generated
    @Selector("startAccelerometerUpdates")
    public native void startAccelerometerUpdates();

    /**
     * startAccelerometerUpdatesToQueue:withHandler:
     * 
     * Discussion:
     *   Starts accelerometer updates, providing data to the given handler through the given queue.
     *   Note that when the updates are stopped, all operations in the
     *   given NSOperationQueue will be cancelled.
     */
    @Generated
    @Selector("startAccelerometerUpdatesToQueue:withHandler:")
    public native void startAccelerometerUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startAccelerometerUpdatesToQueueWithHandler") Block_startAccelerometerUpdatesToQueueWithHandler handler);

    /**
     * startDeviceMotionUpdates
     * 
     * Discussion:
     *   Starts device motion updates with no handler. To receive the latest device motion data
     *   when desired, examine the deviceMotion property. Uses the default reference frame for
     *   the device. Examine CMMotionManager's attitudeReferenceFrame to determine this.
     */
    @Generated
    @Selector("startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();

    /**
     * startDeviceMotionUpdatesToQueue:withHandler:
     * 
     * Discussion:
     *   Starts device motion updates, providing data to the given handler through the given queue.
     *   Uses the default reference frame for the device. Examine CMMotionManager's
     *   attitudeReferenceFrame to determine this.
     */
    @Generated
    @Selector("startDeviceMotionUpdatesToQueue:withHandler:")
    public native void startDeviceMotionUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startDeviceMotionUpdatesToQueueWithHandler") Block_startDeviceMotionUpdatesToQueueWithHandler handler);

    /**
     * startDeviceMotionUpdatesUsingReferenceFrame:
     * 
     * Discussion:
     *   Starts device motion updates with no handler. To receive the latest device motion data
     *   when desired, examine the deviceMotion property. The specified frame will be used as
     *   reference for the attitude estimates.
     */
    @Generated
    @Selector("startDeviceMotionUpdatesUsingReferenceFrame:")
    public native void startDeviceMotionUpdatesUsingReferenceFrame(@NUInt long referenceFrame);

    /**
     * startDeviceMotionUpdatesUsingReferenceFrame:toQueue:withHandler
     * 
     * Discussion:
     *   Starts device motion updates, providing data to the given handler through the given queue.
     *   The specified frame will be used as reference for the attitude estimates.
     */
    @Generated
    @Selector("startDeviceMotionUpdatesUsingReferenceFrame:toQueue:withHandler:")
    public native void startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler(@NUInt long referenceFrame,
            NSOperationQueue queue,
            @ObjCBlock(name = "call_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler") Block_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler handler);

    /**
     * startGyroUpdates
     * 
     * Discussion:
     *   Starts gyro updates with no handler. To receive the latest gyro data
     *   when desired, examine the gyroData property.
     */
    @Generated
    @Selector("startGyroUpdates")
    public native void startGyroUpdates();

    /**
     * *  startGyroUpdatesToQueue:withHandler:
     * *
     * *  Discussion:
     * *    Starts gyro updates, providing data to the given handler through the given queue.
     * *    Note that when the updates are stopped, all operations in the
     * *    given NSOperationQueue will be cancelled.
     */
    @Generated
    @Selector("startGyroUpdatesToQueue:withHandler:")
    public native void startGyroUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startGyroUpdatesToQueueWithHandler") Block_startGyroUpdatesToQueueWithHandler handler);

    /**
     * startMagnetometerUpdates
     * 
     * Discussion:
     *   Starts magnetometer updates with no handler. To receive the latest magnetometer data
     *   when desired, examine the magnetometerData property.
     */
    @Generated
    @Selector("startMagnetometerUpdates")
    public native void startMagnetometerUpdates();

    /**
     * startMagnetometerUpdatesToQueue:withHandler:
     * 
     * Discussion:
     *   Starts magnetometer updates, providing data to the given handler through the given queue.
     */
    @Generated
    @Selector("startMagnetometerUpdatesToQueue:withHandler:")
    public native void startMagnetometerUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startMagnetometerUpdatesToQueueWithHandler") Block_startMagnetometerUpdatesToQueueWithHandler handler);

    /**
     * stopAccelerometerUpdates
     * 
     * Discussion:
     *   Stop accelerometer updates.
     */
    @Generated
    @Selector("stopAccelerometerUpdates")
    public native void stopAccelerometerUpdates();

    /**
     * stopDeviceMotionUpdates
     * 
     * Discussion:
     *   Stops device motion updates.
     */
    @Generated
    @Selector("stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();

    /**
     * stopGyroUpdates
     * 
     * Discussion:
     *   Stops gyro updates.
     */
    @Generated
    @Selector("stopGyroUpdates")
    public native void stopGyroUpdates();

    /**
     * stopMagnetometerUpdates
     * 
     * Discussion:
     *   Stops magnetometer updates.
     */
    @Generated
    @Selector("stopMagnetometerUpdates")
    public native void stopMagnetometerUpdates();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startAccelerometerUpdatesToQueueWithHandler {
        @Generated
        void call_startAccelerometerUpdatesToQueueWithHandler(CMAccelerometerData accelerometerData, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDeviceMotionUpdatesToQueueWithHandler {
        @Generated
        void call_startDeviceMotionUpdatesToQueueWithHandler(CMDeviceMotion motion, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler {
        @Generated
        void call_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler(CMDeviceMotion motion, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startGyroUpdatesToQueueWithHandler {
        @Generated
        void call_startGyroUpdatesToQueueWithHandler(CMGyroData gyroData, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startMagnetometerUpdatesToQueueWithHandler {
        @Generated
        void call_startMagnetometerUpdatesToQueueWithHandler(CMMagnetometerData magnetometerData, NSError error);
    }
}
