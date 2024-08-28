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
 * MTRWriteParams
 * This is used to control the behavior of cluster writes.
 * If not provided (i.e. nil passed for the CHIPWriteParams argument), will be
 * treated as if a default-initialized object was passed in.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRWriteParams extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRWriteParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRWriteParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRWriteParams allocWithZone(VoidPtr zone);

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

    /**
     * Sets the data version for the Write Request for the interaction.
     * 
     * If not nil, the write will only succeed if the current data version of
     * the cluster matches the provided data version.
     */
    @Generated
    @Selector("dataVersion")
    @Nullable
    public native NSNumber dataVersion();

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
    public native MTRWriteParams init();

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
    public static native MTRWriteParams new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets the data version for the Write Request for the interaction.
     * 
     * If not nil, the write will only succeed if the current data version of
     * the cluster matches the provided data version.
     */
    @Generated
    @Selector("setDataVersion:")
    public native void setDataVersion(@Nullable NSNumber value);

    /**
     * Controls whether the write is a timed write.
     * 
     * If nil (the default value), a regular write is done for attributes that do
     * not require a timed write and a timed write with some default timed request
     * timeout is done for attributes that require a timed write.
     * 
     * If not nil, a timed write is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual write
     * request) within the timeout window.
     * 
     * This value is specified in milliseconds.
     */
    @Generated
    @Selector("setTimedWriteTimeout:")
    public native void setTimedWriteTimeout(@Nullable NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Controls whether the write is a timed write.
     * 
     * If nil (the default value), a regular write is done for attributes that do
     * not require a timed write and a timed write with some default timed request
     * timeout is done for attributes that require a timed write.
     * 
     * If not nil, a timed write is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual write
     * request) within the timeout window.
     * 
     * This value is specified in milliseconds.
     */
    @Generated
    @Selector("timedWriteTimeout")
    @Nullable
    public native NSNumber timedWriteTimeout();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}