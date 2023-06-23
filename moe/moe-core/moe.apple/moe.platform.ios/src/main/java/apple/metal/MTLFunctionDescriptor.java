package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLFunctionDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLFunctionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLFunctionDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLFunctionDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * [@property] constantValues
     * 
     * The set of constant values assigned to the function constants. Compilation fails if you do not provide valid
     * constant values for all required function constants.
     */
    @Nullable
    @Generated
    @Selector("constantValues")
    public native MTLFunctionConstantValues constantValues();

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
     * functionDescriptor
     * 
     * Create an autoreleased function descriptor
     */
    @NotNull
    @Generated
    @Selector("functionDescriptor")
    public static native MTLFunctionDescriptor functionDescriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLFunctionDescriptor init();

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
     * [@property] name
     * 
     * The name of the `visible` function to find.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLFunctionDescriptor new_objc();

    /**
     * [@property] options
     * 
     * The options to use for this new `MTLFunction`.
     */
    @Generated
    @Selector("options")
    @NUInt
    public native long options();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] constantValues
     * 
     * The set of constant values assigned to the function constants. Compilation fails if you do not provide valid
     * constant values for all required function constants.
     */
    @Generated
    @Selector("setConstantValues:")
    public native void setConstantValues(@Nullable MTLFunctionConstantValues value);

    /**
     * [@property] name
     * 
     * The name of the `visible` function to find.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * [@property] options
     * 
     * The options to use for this new `MTLFunction`.
     */
    @Generated
    @Selector("setOptions:")
    public native void setOptions(@NUInt long value);

    /**
     * [@property] specializedName
     * 
     * An optional new name for a `visible` function to allow reuse with different specializations.
     */
    @Generated
    @Selector("setSpecializedName:")
    public native void setSpecializedName(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] specializedName
     * 
     * An optional new name for a `visible` function to allow reuse with different specializations.
     */
    @Nullable
    @Generated
    @Selector("specializedName")
    public native String specializedName();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] binaryArchives
     * 
     * The array of archives to be searched.
     * 
     * Binary archives to be searched for precompiled functions during the compilation of this function.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("binaryArchives")
    public native NSArray<?> binaryArchives();

    /**
     * [@property] binaryArchives
     * 
     * The array of archives to be searched.
     * 
     * Binary archives to be searched for precompiled functions during the compilation of this function.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setBinaryArchives:")
    public native void setBinaryArchives(@Nullable NSArray<?> value);
}
