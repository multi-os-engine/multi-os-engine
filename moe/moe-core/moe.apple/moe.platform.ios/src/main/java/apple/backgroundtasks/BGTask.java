package apple.backgroundtasks;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * An abstract class that represents the background work for which the app was launched to handle.
 * <p>
 * Subclasses of this type are created by the system and should not be directly instantiated.
 */
@Generated
@Library("BackgroundTasks")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BGTask extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BGTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BGTask alloc();

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
     * Called by the system shortly before your app's background time expires.
     * <p>
     * There is a limit to how long your app has to perform its background work, and your work may need to be interrupted if system conditions change. Assign a handler to this property to cancel any ongoing tasks, perform any needed cleanup, and then call setTaskCompletedWithSuccess: to signal completion to the system and allow your app to be suspended.
     * This property is cleared after it is called by the system or when setTaskCompletedWithSuccess: is called. This is to mitigate the impact of a retain cycle created by referencing the BGTask instance inside this block.
     */
    @Generated
    @Selector("expirationHandler")
    @ObjCBlock(name = "call_expirationHandler_ret")
    public native Block_expirationHandler_ret expirationHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_expirationHandler_ret {
        @Generated
        void call_expirationHandler_ret();
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The identifier associated with the request used to schedule this background work.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native BGTask init();

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

    /**
     * Called by the system shortly before your app's background time expires.
     * <p>
     * There is a limit to how long your app has to perform its background work, and your work may need to be interrupted if system conditions change. Assign a handler to this property to cancel any ongoing tasks, perform any needed cleanup, and then call setTaskCompletedWithSuccess: to signal completion to the system and allow your app to be suspended.
     * This property is cleared after it is called by the system or when setTaskCompletedWithSuccess: is called. This is to mitigate the impact of a retain cycle created by referencing the BGTask instance inside this block.
     */
    @Generated
    @Selector("setExpirationHandler:")
    public native void setExpirationHandler(
            @ObjCBlock(name = "call_setExpirationHandler") Block_setExpirationHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExpirationHandler {
        @Generated
        void call_setExpirationHandler();
    }

    /**
     * Marks this task as complete.
     * <p>
     * Call this method as soon as the background work associated with this task is complete. The system provides your app with a limited amount of time to finish the task. If you do not call setTaskCompletedWithSuccess: on the task, the system continues to run in the background until all the available time is consumed, wasting battery power.
     * The system suspends the app as soon as all background tasks are complete.
     *
     * @param success Whether the task was completed successfully. If the task was unsuccessful, you may request the system to try again later by submitting a new task request to the scheduler before calling this method.
     */
    @Generated
    @Selector("setTaskCompletedWithSuccess:")
    public native void setTaskCompletedWithSuccess(boolean success);

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
}
