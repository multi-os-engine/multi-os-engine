package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRUnitTestingClusterTestEventEvent extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRUnitTestingClusterTestEventEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRUnitTestingClusterTestEventEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRUnitTestingClusterTestEventEvent allocWithZone(VoidPtr zone);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("arg1")
    @NotNull
    public native NSNumber arg1();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("arg2")
    @NotNull
    public native NSNumber arg2();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("arg3")
    @NotNull
    public native NSNumber arg3();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("arg4")
    @NotNull
    public native MTRUnitTestingClusterSimpleStruct arg4();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("arg5")
    @NotNull
    public native NSArray<?> arg5();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("arg6")
    @NotNull
    public native NSArray<?> arg6();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRUnitTestingClusterTestEventEvent init();

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
    public static native MTRUnitTestingClusterTestEventEvent new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setArg1:")
    public native void setArg1(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setArg2:")
    public native void setArg2(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setArg3:")
    public native void setArg3(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setArg4:")
    public native void setArg4(@NotNull MTRUnitTestingClusterSimpleStruct value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setArg5:")
    public native void setArg5(@NotNull NSArray<?> value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setArg6:")
    public native void setArg6(@NotNull NSArray<?> value);

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