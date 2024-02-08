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
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRAccessControlClusterAccessControlEntry extends MTRAccessControlClusterAccessControlEntryStruct {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRAccessControlClusterAccessControlEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRAccessControlClusterAccessControlEntry alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRAccessControlClusterAccessControlEntry allocWithZone(VoidPtr zone);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("authMode")
    @NotNull
    public native NSNumber authMode();

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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("fabricIndex")
    @NotNull
    public native NSNumber fabricIndex();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRAccessControlClusterAccessControlEntry init();

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
    public static native MTRAccessControlClusterAccessControlEntry new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("privilege")
    @NotNull
    public native NSNumber privilege();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("setAuthMode:")
    public native void setAuthMode(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("setFabricIndex:")
    public native void setFabricIndex(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("setPrivilege:")
    public native void setPrivilege(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("setSubjects:")
    public native void setSubjects(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("setTargets:")
    public native void setTargets(@Nullable NSArray<?> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("subjects")
    @Nullable
    public native NSArray<?> subjects();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAccessControlClusterAccessControlEntryStruct
     */
    @Generated
    @Deprecated
    @Selector("targets")
    @Nullable
    public native NSArray<?> targets();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}