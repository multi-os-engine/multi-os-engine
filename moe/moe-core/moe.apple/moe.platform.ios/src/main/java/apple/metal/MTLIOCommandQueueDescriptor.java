package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLIOScratchBufferAllocator;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] MTLIOCommandQueueDescriptor
 * 
 * Represents a descriptor to create a MTLIOCommandQueue.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLIOCommandQueueDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLIOCommandQueueDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLIOCommandQueueDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLIOCommandQueueDescriptor allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native MTLIOCommandQueueDescriptor init();

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

    /**
     * [@property] maxCommandBufferCount
     * 
     * The maximum number of commandBuffers that can be in flight at a given time for the queue.
     */
    @Generated
    @Selector("maxCommandBufferCount")
    @NUInt
    public native long maxCommandBufferCount();

    /**
     * [@property] maxCommandsInFlight
     * 
     * The maximum number of IO commands that can be in flight at a given time for the queue.
     * 
     * A zero value defaults to the system dependent maximum value, a smaller number can be
     * provided to bound the utilization of the storage device.
     */
    @Generated
    @Selector("maxCommandsInFlight")
    @NUInt
    public native long maxCommandsInFlight();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLIOCommandQueueDescriptor new_objc();

    /**
     * [@property] priority
     * 
     * The priority of the commands executed by this queue.
     */
    @Generated
    @Selector("priority")
    @NInt
    public native long priority();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] scratchBufferAllocator
     * 
     * An optional property that allows setting a custom allocator for scratch buffers by the queue.
     * 
     * An application can manage scratch buffers manually by implemeting a class conforming
     * to the MTLIOScratchBufferAllocator protocol and creating an instance that is passed in here.
     */
    @Nullable
    @Generated
    @Selector("scratchBufferAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLIOScratchBufferAllocator scratchBufferAllocator();

    /**
     * [@property] maxCommandBufferCount
     * 
     * The maximum number of commandBuffers that can be in flight at a given time for the queue.
     */
    @Generated
    @Selector("setMaxCommandBufferCount:")
    public native void setMaxCommandBufferCount(@NUInt long value);

    /**
     * [@property] maxCommandsInFlight
     * 
     * The maximum number of IO commands that can be in flight at a given time for the queue.
     * 
     * A zero value defaults to the system dependent maximum value, a smaller number can be
     * provided to bound the utilization of the storage device.
     */
    @Generated
    @Selector("setMaxCommandsInFlight:")
    public native void setMaxCommandsInFlight(@NUInt long value);

    /**
     * [@property] priority
     * 
     * The priority of the commands executed by this queue.
     */
    @Generated
    @Selector("setPriority:")
    public native void setPriority(@NInt long value);

    /**
     * [@property] scratchBufferAllocator
     * 
     * An optional property that allows setting a custom allocator for scratch buffers by the queue.
     * 
     * An application can manage scratch buffers manually by implemeting a class conforming
     * to the MTLIOScratchBufferAllocator protocol and creating an instance that is passed in here.
     */
    @Generated
    @Selector("setScratchBufferAllocator:")
    public native void setScratchBufferAllocator(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLIOScratchBufferAllocator value);

    /**
     * [@property] type
     * 
     * The type (serial or concurrent) of the queue.
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] type
     * 
     * The type (serial or concurrent) of the queue.
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}