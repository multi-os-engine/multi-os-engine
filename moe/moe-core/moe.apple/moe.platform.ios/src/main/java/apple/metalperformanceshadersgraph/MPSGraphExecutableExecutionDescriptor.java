package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphExecutableExecutionDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphExecutableExecutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphExecutableExecutionDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphExecutableExecutionDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * [@property]   completionHandler
     * <p>
     * completionHandler for the graph executable, default value is nil
     */
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    public native Block_completionHandler_ret completionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(NSArray<? extends MPSGraphTensorData> arg0, NSError arg1);
    }

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
    @Selector("init")
    public native MPSGraphExecutableExecutionDescriptor init();

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
    public static native MPSGraphExecutableExecutionDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   scheduledHandler
     * <p>
     * scheduledHandler for the graph executable, default value is nil
     */
    @Generated
    @Selector("scheduledHandler")
    @ObjCBlock(name = "call_scheduledHandler_ret")
    public native Block_scheduledHandler_ret scheduledHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduledHandler_ret {
        @Generated
        void call_scheduledHandler_ret(NSArray<? extends MPSGraphTensorData> arg0, NSError arg1);
    }

    /**
     * [@property]   completionHandler
     * <p>
     * completionHandler for the graph executable, default value is nil
     */
    @Generated
    @Selector("setCompletionHandler:")
    public native void setCompletionHandler(
            @ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler(NSArray<? extends MPSGraphTensorData> arg0, NSError arg1);
    }

    /**
     * [@property]   scheduledHandler
     * <p>
     * scheduledHandler for the graph executable, default value is nil
     */
    @Generated
    @Selector("setScheduledHandler:")
    public native void setScheduledHandler(
            @ObjCBlock(name = "call_setScheduledHandler") Block_setScheduledHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setScheduledHandler {
        @Generated
        void call_setScheduledHandler(NSArray<? extends MPSGraphTensorData> arg0, NSError arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   waitUntilCompleted
     * <p>
     * waitUntilCompleted for the graph executable, default value is false
     */
    @Generated
    @Selector("setWaitUntilCompleted:")
    public native void setWaitUntilCompleted(boolean value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]   waitUntilCompleted
     * <p>
     * waitUntilCompleted for the graph executable, default value is false
     */
    @Generated
    @Selector("waitUntilCompleted")
    public native boolean waitUntilCompleted();
}
