package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentHistoryChangeRequest extends NSPersistentStoreRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentHistoryChangeRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentHistoryChangeRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPersistentHistoryChangeRequest allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("deleteHistoryBeforeDate:")
    public static native NSPersistentHistoryChangeRequest deleteHistoryBeforeDate(@NotNull NSDate date);

    @NotNull
    @Generated
    @Selector("deleteHistoryBeforeToken:")
    public static native NSPersistentHistoryChangeRequest deleteHistoryBeforeToken(
            @Nullable NSPersistentHistoryToken token);

    @NotNull
    @Generated
    @Selector("deleteHistoryBeforeTransaction:")
    public static native NSPersistentHistoryChangeRequest deleteHistoryBeforeTransaction(
            @Nullable NSPersistentHistoryTransaction transaction);

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("fetchHistoryAfterDate:")
    public static native NSPersistentHistoryChangeRequest fetchHistoryAfterDate(@NotNull NSDate date);

    @NotNull
    @Generated
    @Selector("fetchHistoryAfterToken:")
    public static native NSPersistentHistoryChangeRequest fetchHistoryAfterToken(
            @Nullable NSPersistentHistoryToken token);

    @NotNull
    @Generated
    @Selector("fetchHistoryAfterTransaction:")
    public static native NSPersistentHistoryChangeRequest fetchHistoryAfterTransaction(
            @Nullable NSPersistentHistoryTransaction transaction);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSPersistentHistoryChangeRequest init();

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
    public static native NSPersistentHistoryChangeRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The type of result that should be returned from this request. Defaults to
     * NSPersistentHistoryResultTypeTransactionsAndChanges
     */
    @Generated
    @Selector("resultType")
    @NInt
    public native long resultType();

    /**
     * The type of result that should be returned from this request. Defaults to
     * NSPersistentHistoryResultTypeTransactionsAndChanges
     */
    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Nullable
    @Generated
    @Selector("token")
    public native NSPersistentHistoryToken token();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("fetchHistoryWithFetchRequest:")
    public static native NSPersistentHistoryChangeRequest fetchHistoryWithFetchRequest(
            @NotNull NSFetchRequest<?> fetchRequest);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("fetchRequest")
    public native NSFetchRequest<?> fetchRequest();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setFetchRequest:")
    public native void setFetchRequest(@Nullable NSFetchRequest<?> value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
