package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.1
 * Deprecated-Since: 16.5
 * Deprecated-Message: Please use MTRTimeSynchronizationClusterDSTOffsetStruct
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRTimeSynchronizationClusterDstOffsetType extends MTRTimeSynchronizationClusterDSTOffsetStruct {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRTimeSynchronizationClusterDstOffsetType(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRTimeSynchronizationClusterDstOffsetType alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRTimeSynchronizationClusterDstOffsetType allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRTimeSynchronizationClusterDstOffsetType init();

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
    public static native MTRTimeSynchronizationClusterDstOffsetType new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use MTRTimeSynchronizationClusterDSTOffsetStruct
     */
    @Generated
    @Deprecated
    @Selector("offset")
    @NotNull
    public native NSNumber offset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use MTRTimeSynchronizationClusterDSTOffsetStruct
     */
    @Generated
    @Deprecated
    @Selector("setOffset:")
    public native void setOffset(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use MTRTimeSynchronizationClusterDSTOffsetStruct
     */
    @Generated
    @Deprecated
    @Selector("setValidStarting:")
    public native void setValidStarting(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use MTRTimeSynchronizationClusterDSTOffsetStruct
     */
    @Generated
    @Deprecated
    @Selector("setValidUntil:")
    public native void setValidUntil(@Nullable NSNumber value);

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

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use MTRTimeSynchronizationClusterDSTOffsetStruct
     */
    @Generated
    @Deprecated
    @Selector("validStarting")
    @NotNull
    public native NSNumber validStarting();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use MTRTimeSynchronizationClusterDSTOffsetStruct
     */
    @Generated
    @Deprecated
    @Selector("validUntil")
    @Nullable
    public native NSNumber validUntil();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}