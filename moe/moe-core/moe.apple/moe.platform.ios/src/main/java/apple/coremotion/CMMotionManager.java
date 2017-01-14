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

    @Generated
    @Selector("accelerometerData")
    public native CMAccelerometerData accelerometerData();

    @Generated
    @Selector("accelerometerUpdateInterval")
    public native double accelerometerUpdateInterval();

    @Generated
    @Selector("attitudeReferenceFrame")
    @NUInt
    public native long attitudeReferenceFrame();

    @Generated
    @Selector("deviceMotion")
    public native CMDeviceMotion deviceMotion();

    @Generated
    @Selector("deviceMotionUpdateInterval")
    public native double deviceMotionUpdateInterval();

    @Generated
    @Selector("gyroData")
    public native CMGyroData gyroData();

    @Generated
    @Selector("gyroUpdateInterval")
    public native double gyroUpdateInterval();

    @Generated
    @Selector("init")
    public native CMMotionManager init();

    @Generated
    @Selector("isAccelerometerActive")
    public native boolean isAccelerometerActive();

    @Generated
    @Selector("isAccelerometerAvailable")
    public native boolean isAccelerometerAvailable();

    @Generated
    @Selector("isDeviceMotionActive")
    public native boolean isDeviceMotionActive();

    @Generated
    @Selector("isDeviceMotionAvailable")
    public native boolean isDeviceMotionAvailable();

    @Generated
    @Selector("isGyroActive")
    public native boolean isGyroActive();

    @Generated
    @Selector("isGyroAvailable")
    public native boolean isGyroAvailable();

    @Generated
    @Selector("isMagnetometerActive")
    public native boolean isMagnetometerActive();

    @Generated
    @Selector("isMagnetometerAvailable")
    public native boolean isMagnetometerAvailable();

    @Generated
    @Selector("magnetometerData")
    public native CMMagnetometerData magnetometerData();

    @Generated
    @Selector("magnetometerUpdateInterval")
    public native double magnetometerUpdateInterval();

    @Generated
    @Selector("setAccelerometerUpdateInterval:")
    public native void setAccelerometerUpdateInterval(double value);

    @Generated
    @Selector("setDeviceMotionUpdateInterval:")
    public native void setDeviceMotionUpdateInterval(double value);

    @Generated
    @Selector("setGyroUpdateInterval:")
    public native void setGyroUpdateInterval(double value);

    @Generated
    @Selector("setMagnetometerUpdateInterval:")
    public native void setMagnetometerUpdateInterval(double value);

    @Generated
    @Selector("setShowsDeviceMovementDisplay:")
    public native void setShowsDeviceMovementDisplay(boolean value);

    @Generated
    @Selector("showsDeviceMovementDisplay")
    public native boolean showsDeviceMovementDisplay();

    @Generated
    @Selector("startAccelerometerUpdates")
    public native void startAccelerometerUpdates();

    @Generated
    @Selector("startAccelerometerUpdatesToQueue:withHandler:")
    public native void startAccelerometerUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startAccelerometerUpdatesToQueueWithHandler") Block_startAccelerometerUpdatesToQueueWithHandler handler);

    @Generated
    @Selector("startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();

    @Generated
    @Selector("startDeviceMotionUpdatesToQueue:withHandler:")
    public native void startDeviceMotionUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startDeviceMotionUpdatesToQueueWithHandler") Block_startDeviceMotionUpdatesToQueueWithHandler handler);

    @Generated
    @Selector("startDeviceMotionUpdatesUsingReferenceFrame:")
    public native void startDeviceMotionUpdatesUsingReferenceFrame(@NUInt long referenceFrame);

    @Generated
    @Selector("startDeviceMotionUpdatesUsingReferenceFrame:toQueue:withHandler:")
    public native void startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler(@NUInt long referenceFrame,
            NSOperationQueue queue,
            @ObjCBlock(name = "call_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler") Block_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler handler);

    @Generated
    @Selector("startGyroUpdates")
    public native void startGyroUpdates();

    @Generated
    @Selector("startGyroUpdatesToQueue:withHandler:")
    public native void startGyroUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startGyroUpdatesToQueueWithHandler") Block_startGyroUpdatesToQueueWithHandler handler);

    @Generated
    @Selector("startMagnetometerUpdates")
    public native void startMagnetometerUpdates();

    @Generated
    @Selector("startMagnetometerUpdatesToQueue:withHandler:")
    public native void startMagnetometerUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startMagnetometerUpdatesToQueueWithHandler") Block_startMagnetometerUpdatesToQueueWithHandler handler);

    @Generated
    @Selector("stopAccelerometerUpdates")
    public native void stopAccelerometerUpdates();

    @Generated
    @Selector("stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();

    @Generated
    @Selector("stopGyroUpdates")
    public native void stopGyroUpdates();

    @Generated
    @Selector("stopMagnetometerUpdates")
    public native void stopMagnetometerUpdates();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startAccelerometerUpdatesToQueueWithHandler {
        @Generated
        void call_startAccelerometerUpdatesToQueueWithHandler(CMAccelerometerData arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDeviceMotionUpdatesToQueueWithHandler {
        @Generated
        void call_startDeviceMotionUpdatesToQueueWithHandler(CMDeviceMotion arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler {
        @Generated
        void call_startDeviceMotionUpdatesUsingReferenceFrameToQueueWithHandler(CMDeviceMotion arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startGyroUpdatesToQueueWithHandler {
        @Generated
        void call_startGyroUpdatesToQueueWithHandler(CMGyroData arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startMagnetometerUpdatesToQueueWithHandler {
        @Generated
        void call_startMagnetometerUpdatesToQueueWithHandler(CMMagnetometerData arg0, NSError arg1);
    }
}
