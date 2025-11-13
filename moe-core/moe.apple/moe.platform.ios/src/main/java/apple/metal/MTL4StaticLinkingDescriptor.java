package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Groups together properties to drive a static linking process.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4StaticLinkingDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4StaticLinkingDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4StaticLinkingDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4StaticLinkingDescriptor allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Provides an array of functions to link at the Metal IR level.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("functionDescriptors")
    @Nullable
    public native NSArray<? extends MTL4FunctionDescriptor> functionDescriptors();

    /**
     * Assigns groups of functions to match call-site attributes in shader code.
     * 
     * Function groups help the compiler reduce the number of candidate functions it needs to evaluate for shader
     * function calls, potentially increasing runtime performance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("groups")
    @Nullable
    public native NSDictionary<String, ? extends NSArray<? extends MTL4FunctionDescriptor>> groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTL4StaticLinkingDescriptor init();

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
    public static native MTL4StaticLinkingDescriptor new_objc();

    /**
     * Provides an array of private functions to link at the Metal IR level.
     * 
     * You specify private functions to link separately from ``functionDescriptors`` because pipelines don't export
     * private functions as ``MTLFunctionHandle`` instances.
     * - Note: You can link private functions even when your ``MTLDevice`` doesn't support function pointers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("privateFunctionDescriptors")
    @Nullable
    public native NSArray<? extends MTL4FunctionDescriptor> privateFunctionDescriptors();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Provides an array of functions to link at the Metal IR level.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFunctionDescriptors:")
    public native void setFunctionDescriptors(@Nullable NSArray<? extends MTL4FunctionDescriptor> value);

    /**
     * Assigns groups of functions to match call-site attributes in shader code.
     * 
     * Function groups help the compiler reduce the number of candidate functions it needs to evaluate for shader
     * function calls, potentially increasing runtime performance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setGroups:")
    public native void setGroups(
            @Nullable NSDictionary<String, ? extends NSArray<? extends MTL4FunctionDescriptor>> value);

    /**
     * Provides an array of private functions to link at the Metal IR level.
     * 
     * You specify private functions to link separately from ``functionDescriptors`` because pipelines don't export
     * private functions as ``MTLFunctionHandle`` instances.
     * - Note: You can link private functions even when your ``MTLDevice`` doesn't support function pointers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPrivateFunctionDescriptors:")
    public native void setPrivateFunctionDescriptors(@Nullable NSArray<? extends MTL4FunctionDescriptor> value);

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