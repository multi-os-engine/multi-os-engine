package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRTestClusterClusterSimpleStruct extends MTRUnitTestingClusterSimpleStruct {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRTestClusterClusterSimpleStruct(Pointer peer) {
        super(peer);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("a")
    @NotNull
    public native NSNumber a();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRTestClusterClusterSimpleStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRTestClusterClusterSimpleStruct allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("b")
    @NotNull
    public native NSNumber b();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("c")
    @NotNull
    public native NSNumber c();

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

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("d")
    @NotNull
    public native NSData d();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("e")
    @NotNull
    public native String e();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("f")
    @NotNull
    public native NSNumber f();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("g")
    @NotNull
    public native NSNumber g();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("h")
    @NotNull
    public native NSNumber h();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRTestClusterClusterSimpleStruct init();

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
    public static native MTRTestClusterClusterSimpleStruct new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setA:")
    public native void setA(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setB:")
    public native void setB(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setC:")
    public native void setC(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setD:")
    public native void setD(@NotNull NSData value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setE:")
    public native void setE(@NotNull String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setF:")
    public native void setF(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setG:")
    public native void setG(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterSimpleStruct
     */
    @Generated
    @Deprecated
    @Selector("setH:")
    public native void setH(@NotNull NSNumber value);

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