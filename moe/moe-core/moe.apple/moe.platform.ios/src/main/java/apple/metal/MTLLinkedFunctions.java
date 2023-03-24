package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * MTLLinkedFunctions
 * 
 * A class to set functions to be linked.
 * 
 * All functions set on this object must have unique names.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLLinkedFunctions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLLinkedFunctions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLLinkedFunctions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLLinkedFunctions allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] binaryFunctions
     * 
     * The array of functions compiled to binary to be linked.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("binaryFunctions")
    public native NSArray<?> binaryFunctions();

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

    /**
     * [@property] functions
     * 
     * The array of functions to be AIR linked.
     */
    @Nullable
    @Generated
    @Selector("functions")
    public native NSArray<?> functions();

    /**
     * [@property] groups
     * 
     * Groups of functions, grouped to match callsites in the shader code.
     */
    @Nullable
    @Generated
    @Selector("groups")
    public native NSDictionary<String, ? extends NSArray<?>> groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLLinkedFunctions init();

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
     * linkedFunctions
     * 
     * Create an autoreleased MTLLinkedFunctions object.
     */
    @NotNull
    @Generated
    @Selector("linkedFunctions")
    public static native MTLLinkedFunctions linkedFunctions();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLLinkedFunctions new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] binaryFunctions
     * 
     * The array of functions compiled to binary to be linked.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBinaryFunctions:")
    public native void setBinaryFunctions(@Nullable NSArray<?> value);

    /**
     * [@property] functions
     * 
     * The array of functions to be AIR linked.
     */
    @Generated
    @Selector("setFunctions:")
    public native void setFunctions(@Nullable NSArray<?> value);

    /**
     * [@property] groups
     * 
     * Groups of functions, grouped to match callsites in the shader code.
     */
    @Generated
    @Selector("setGroups:")
    public native void setGroups(@Nullable NSDictionary<String, ? extends NSArray<?>> value);

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
     * [@property] privateFunctions
     * 
     * The array of functions to be AIR linked.
     * 
     * These functions are not exported by the pipeline state as MTLFunctionHandle objects.
     * Function pointer support is not required to link private functions.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("privateFunctions")
    public native NSArray<?> privateFunctions();

    /**
     * [@property] privateFunctions
     * 
     * The array of functions to be AIR linked.
     * 
     * These functions are not exported by the pipeline state as MTLFunctionHandle objects.
     * Function pointer support is not required to link private functions.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPrivateFunctions:")
    public native void setPrivateFunctions(@Nullable NSArray<?> value);
}
