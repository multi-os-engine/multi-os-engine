package apple.coremotion;

import apple.NSObject;
import apple.coremotion.protocol.CMHeadphoneMotionManagerDelegate;
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
 * CMHeadphoneMotionManager
 * 
 * Discussion:
 * The CMHeadphoneMotionManager object is your entry point to the headphone motion service.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMHeadphoneMotionManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMHeadphoneMotionManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMHeadphoneMotionManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CMHeadphoneMotionManager allocWithZone(VoidPtr zone);

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status for headphone motion.
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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

    /**
     * delegate
     * 
     * Discussion:
     * The delegate object to receive motion manager events.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CMHeadphoneMotionManagerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * deviceMotion
     * 
     * Discussion:
     * Returns the latest sample of device motion data, or nil if none is available.
     */
    @Generated
    @Selector("deviceMotion")
    public native CMDeviceMotion deviceMotion();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CMHeadphoneMotionManager init();

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
     * deviceMotionActive
     * 
     * Discussion:
     * Determines whether the CMHeadphoneMotionManager is currently providing device
     * motion updates.
     */
    @Generated
    @Selector("isDeviceMotionActive")
    public native boolean isDeviceMotionActive();

    /**
     * deviceMotionAvailable
     * 
     * Discussion:
     * Determines whether device motion is available.
     */
    @Generated
    @Selector("isDeviceMotionAvailable")
    public native boolean isDeviceMotionAvailable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CMHeadphoneMotionManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * delegate
     * 
     * Discussion:
     * The delegate object to receive motion manager events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CMHeadphoneMotionManagerDelegate value);

    /**
     * delegate
     * 
     * Discussion:
     * The delegate object to receive motion manager events.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CMHeadphoneMotionManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startDeviceMotionUpdates
     * 
     * Discussion:
     * Starts device motion updates with no handler. To receive the latest device motion data
     * when desired, examine the deviceMotion property.
     */
    @Generated
    @Selector("startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();

    /**
     * startDeviceMotionUpdatesToQueue:withHandler:
     * 
     * Discussion:
     * Starts device motion updates, providing data to the given handler through the given queue.
     */
    @Generated
    @Selector("startDeviceMotionUpdatesToQueue:withHandler:")
    public native void startDeviceMotionUpdatesToQueueWithHandler(NSOperationQueue queue,
            @ObjCBlock(name = "call_startDeviceMotionUpdatesToQueueWithHandler") Block_startDeviceMotionUpdatesToQueueWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDeviceMotionUpdatesToQueueWithHandler {
        @Generated
        void call_startDeviceMotionUpdatesToQueueWithHandler(CMDeviceMotion motion, NSError error);
    }

    /**
     * stopDeviceMotionUpdates
     * 
     * Discussion:
     * Stops device motion updates.
     */
    @Generated
    @Selector("stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
