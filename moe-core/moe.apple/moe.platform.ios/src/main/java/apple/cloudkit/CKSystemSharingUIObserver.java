package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NS_SWIFT_SENDABLE on macos(13.3), macCatalyst(16.4), ios(16.4)
 * 
 * API-Since: 16.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSystemSharingUIObserver extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSystemSharingUIObserver(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSystemSharingUIObserver alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSystemSharingUIObserver allocWithZone(VoidPtr zone);

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
    public native CKSystemSharingUIObserver init();

    @Generated
    @Selector("initWithContainer:")
    public native CKSystemSharingUIObserver initWithContainer(@NotNull CKContainer container);

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

    @Generated
    @Owned
    @Selector("new")
    public static native CKSystemSharingUIObserver new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Called on success or failure of a @c CKShare save after user modifications via the system sharing UI
     * 
     * Following a successful share save by the system sharing UI in the provided @c CKContainer, this callback will be
     * invoked with a nonnull @c recordID, a nonnull @c share, and a nil @c error.
     * Following a save failure due to a per-item error (@c CKErrorServerRecordChanged, for example), this callback will
     * be invoked with a nonnull @c recordID, a nil @c share, and a nonnull @c error
     * Each @c CKSystemSharingUIObserver instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Generated
    @Selector("setSystemSharingUIDidSaveShareBlock:")
    public native void setSystemSharingUIDidSaveShareBlock(
            @Nullable @ObjCBlock(name = "call_setSystemSharingUIDidSaveShareBlock") Block_setSystemSharingUIDidSaveShareBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSystemSharingUIDidSaveShareBlock {
        @Generated
        void call_setSystemSharingUIDidSaveShareBlock(@NotNull CKRecordID arg0, @Nullable CKShare arg1,
                @Nullable NSError arg2);
    }

    /**
     * Called on success or failure of a @c CKShare delete when the user decides to stop sharing via the system sharing
     * UI
     * 
     * Each @c CKSystemSharingUIObserver instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Generated
    @Selector("setSystemSharingUIDidStopSharingBlock:")
    public native void setSystemSharingUIDidStopSharingBlock(
            @Nullable @ObjCBlock(name = "call_setSystemSharingUIDidStopSharingBlock") Block_setSystemSharingUIDidStopSharingBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSystemSharingUIDidStopSharingBlock {
        @Generated
        void call_setSystemSharingUIDidStopSharingBlock(@NotNull CKRecordID arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Called on success or failure of a @c CKShare save after user modifications via the system sharing UI
     * 
     * Following a successful share save by the system sharing UI in the provided @c CKContainer, this callback will be
     * invoked with a nonnull @c recordID, a nonnull @c share, and a nil @c error.
     * Following a save failure due to a per-item error (@c CKErrorServerRecordChanged, for example), this callback will
     * be invoked with a nonnull @c recordID, a nil @c share, and a nonnull @c error
     * Each @c CKSystemSharingUIObserver instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Nullable
    @Generated
    @Selector("systemSharingUIDidSaveShareBlock")
    @ObjCBlock(name = "call_systemSharingUIDidSaveShareBlock_ret")
    public native Block_systemSharingUIDidSaveShareBlock_ret systemSharingUIDidSaveShareBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_systemSharingUIDidSaveShareBlock_ret {
        @Generated
        void call_systemSharingUIDidSaveShareBlock_ret(@NotNull CKRecordID arg0, @Nullable CKShare arg1,
                @Nullable NSError arg2);
    }

    /**
     * Called on success or failure of a @c CKShare delete when the user decides to stop sharing via the system sharing
     * UI
     * 
     * Each @c CKSystemSharingUIObserver instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Nullable
    @Generated
    @Selector("systemSharingUIDidStopSharingBlock")
    @ObjCBlock(name = "call_systemSharingUIDidStopSharingBlock_ret")
    public native Block_systemSharingUIDidStopSharingBlock_ret systemSharingUIDidStopSharingBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_systemSharingUIDidStopSharingBlock_ret {
        @Generated
        void call_systemSharingUIDidStopSharingBlock_ret(@NotNull CKRecordID arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}