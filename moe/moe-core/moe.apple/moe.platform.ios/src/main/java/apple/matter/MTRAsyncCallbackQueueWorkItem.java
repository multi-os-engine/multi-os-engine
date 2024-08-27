package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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

/**
 * API-Since: 16.1
 * Deprecated-Since: 17.2
 * Deprecated-Message: This class was not intended to be part of the public Matter API
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRAsyncCallbackQueueWorkItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRAsyncCallbackQueueWorkItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRAsyncCallbackQueueWorkItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRAsyncCallbackQueueWorkItem allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelHandler")
    @ObjCBlock(name = "call_cancelHandler_ret")
    @NotNull
    public native Block_cancelHandler_ret cancelHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelHandler_ret {
        @Generated
        void call_cancelHandler_ret();
    }

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

    @Generated
    @Selector("endWork")
    public native void endWork();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRAsyncCallbackQueueWorkItem init();

    @Generated
    @Selector("initWithQueue:")
    public native MTRAsyncCallbackQueueWorkItem initWithQueue(@NotNull dispatch_queue_t queue);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRAsyncCallbackQueueWorkItem new_objc();

    @Generated
    @Selector("readyHandler")
    @ObjCBlock(name = "call_readyHandler_ret")
    @NotNull
    public native Block_readyHandler_ret readyHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readyHandler_ret {
        @Generated
        void call_readyHandler_ret(@Mapped(ObjCObjectMapper.class) @NotNull Object context, @NUInt long retryCount);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("retryWork")
    public native void retryWork();

    @Generated
    @Selector("setCancelHandler:")
    public native void setCancelHandler(
            @ObjCBlock(name = "call_setCancelHandler") @NotNull Block_setCancelHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCancelHandler {
        @Generated
        void call_setCancelHandler();
    }

    @Generated
    @Selector("setReadyHandler:")
    public native void setReadyHandler(@ObjCBlock(name = "call_setReadyHandler") @NotNull Block_setReadyHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setReadyHandler {
        @Generated
        void call_setReadyHandler(@Mapped(ObjCObjectMapper.class) @NotNull Object context, @NUInt long retryCount);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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