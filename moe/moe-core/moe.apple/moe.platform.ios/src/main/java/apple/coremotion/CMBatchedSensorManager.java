package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMBatchedSensorManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMBatchedSensorManager(Pointer peer) {
        super(peer);
    }

    /**
     * accelerometerBatch
     * 
     * Discussion:
     * Latest batch of accelerometer data, or nil if none available.
     */
    @Generated
    @Selector("accelerometerBatch")
    @Nullable
    public native NSArray<? extends CMAccelerometerData> accelerometerBatch();

    /**
     * accelerometerFrequency
     * 
     * Discussion:
     * Frequency of provided accelerometer data in hertz.
     */
    @Generated
    @Selector("accelerometerDataFrequency")
    @NInt
    public native long accelerometerDataFrequency();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMBatchedSensorManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CMBatchedSensorManager allocWithZone(VoidPtr zone);

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status for batched sensor updates.
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * deviceMotionBatch
     * 
     * Discussion:
     * Latest batch of device motion data, or nil if none available.
     */
    @Generated
    @Selector("deviceMotionBatch")
    @Nullable
    public native NSArray<? extends CMDeviceMotion> deviceMotionBatch();

    /**
     * deviceMotionFrequency
     * 
     * Discussion:
     * Frequency of provided device motion data in hertz.
     */
    @Generated
    @Selector("deviceMotionDataFrequency")
    @NInt
    public native long deviceMotionDataFrequency();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CMBatchedSensorManager init();

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

    /**
     * accelerometerActive
     * 
     * Discussion:
     * Reflects whether batched accelerometer data is currently being provided.
     */
    @Generated
    @Selector("isAccelerometerActive")
    public native boolean isAccelerometerActive();

    /**
     * accelerometerSupported
     * 
     * Discussion:
     * Reflects whether batched accelerometer data is supported on this platform.
     */
    @Generated
    @Selector("isAccelerometerSupported")
    public static native boolean isAccelerometerSupported();

    /**
     * deviceMotionActive
     * 
     * Discussion:
     * Reflects whether batched device motion data is currently being provided.
     */
    @Generated
    @Selector("isDeviceMotionActive")
    public native boolean isDeviceMotionActive();

    /**
     * deviceMotionSupported
     * 
     * Discussion:
     * Reflects whether batched device motion data is supported on this platform.
     */
    @Generated
    @Selector("isDeviceMotionSupported")
    public static native boolean isDeviceMotionSupported();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CMBatchedSensorManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startAccelerometerUpdates
     * 
     * Discussion:
     * Starts batched accelerometer updates. Examine the accelerometerBatch property to access the latest batch of data.
     */
    @Generated
    @Selector("startAccelerometerUpdates")
    public native void startAccelerometerUpdates();

    /**
     * startAccelerometerUpdatesWithHandler
     * 
     * Discussion:
     * Provides batched accelerometer updates to the provided handler.
     */
    @Generated
    @Selector("startAccelerometerUpdatesWithHandler:")
    public native void startAccelerometerUpdatesWithHandler(
            @ObjCBlock(name = "call_startAccelerometerUpdatesWithHandler") @NotNull Block_startAccelerometerUpdatesWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startAccelerometerUpdatesWithHandler {
        @Generated
        void call_startAccelerometerUpdatesWithHandler(@Nullable NSArray<? extends CMAccelerometerData> data,
                @Nullable NSError error);
    }

    /**
     * startDeviceMotionUpdates
     * 
     * Discussion:
     * Starts batched device motion updates. Examine the deviceMotionBatch property to access the latest batch of data.
     */
    @Generated
    @Selector("startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();

    /**
     * startDeviceMotionUpdatesWithHandler
     * 
     * Discussion:
     * Provides batched device motion updates to the provided handler.
     */
    @Generated
    @Selector("startDeviceMotionUpdatesWithHandler:")
    public native void startDeviceMotionUpdatesWithHandler(
            @ObjCBlock(name = "call_startDeviceMotionUpdatesWithHandler") @NotNull Block_startDeviceMotionUpdatesWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDeviceMotionUpdatesWithHandler {
        @Generated
        void call_startDeviceMotionUpdatesWithHandler(@Nullable NSArray<? extends CMDeviceMotion> data,
                @Nullable NSError error);
    }

    /**
     * stopAccelerometerUpdates
     * 
     * Discussion:
     * Stop batched accelerometer updates.
     */
    @Generated
    @Selector("stopAccelerometerUpdates")
    public native void stopAccelerometerUpdates();

    /**
     * stopDeviceMotionUpdates
     * 
     * Discussion:
     * Stop batched device motion updates.
     */
    @Generated
    @Selector("stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}