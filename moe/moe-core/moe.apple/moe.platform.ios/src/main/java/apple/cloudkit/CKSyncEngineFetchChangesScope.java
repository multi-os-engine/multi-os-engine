package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * A scope in which the sync engine will fetch changes from the server.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngineFetchChangesScope extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngineFetchChangesScope(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngineFetchChangesScope alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngineFetchChangesScope allocWithZone(VoidPtr zone);

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

    /**
     * Returns true if the specified zone ID is included in this scope.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("containsZoneID:")
    public native boolean containsZoneID(@NotNull CKRecordZoneID zoneID);

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
     * A specific set of zone IDs to exclude from this scope.
     * If you know that you don't want to fetch changes for a particular set of zones, you can set those zones here.
     */
    @Generated
    @Selector("excludedZoneIDs")
    @NotNull
    public native NSSet<? extends CKRecordZoneID> excludedZoneIDs();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CKSyncEngineFetchChangesScope init();

    /**
     * Creates a scope that includes all zones except the specified excluded zones.
     */
    @Generated
    @Selector("initWithExcludedZoneIDs:")
    public native CKSyncEngineFetchChangesScope initWithExcludedZoneIDs(
            @NotNull NSSet<? extends CKRecordZoneID> zoneIDs);

    /**
     * Creates a scope that includes only the specified set of zones.
     */
    @Generated
    @Selector("initWithZoneIDs:")
    public native CKSyncEngineFetchChangesScope initWithZoneIDs(@Nullable NSSet<? extends CKRecordZoneID> zoneIDs);

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
    public static native CKSyncEngineFetchChangesScope new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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

    /**
     * A specific set of zone IDs to include in the scope.
     * For example, if you want to fetch changes for a specific set of zones, you can specify them here.
     * If `nil`, this scope includes all zones except those in `excludedZoneIDs`.
     */
    @Generated
    @Selector("zoneIDs")
    @Nullable
    public native NSSet<? extends CKRecordZoneID> zoneIDs();
}