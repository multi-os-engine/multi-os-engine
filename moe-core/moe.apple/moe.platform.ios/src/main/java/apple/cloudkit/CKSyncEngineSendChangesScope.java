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
 * A scope in which the sync engine will send changes to the server.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngineSendChangesScope extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngineSendChangesScope(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngineSendChangesScope alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngineSendChangesScope allocWithZone(VoidPtr zone);

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
     * Returns true if this scope includes the given pending change.
     */
    @Generated
    @Selector("containsPendingRecordZoneChange:")
    public native boolean containsPendingRecordZoneChange(
            @NotNull CKSyncEnginePendingRecordZoneChange pendingRecordZoneChange);

    /**
     * Returns true if this scope includes the given record ID.
     */
    @Generated
    @Selector("containsRecordID:")
    public native boolean containsRecordID(@NotNull CKRecordID recordID);

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
     * If you know that you don't want to send changes for a particular set of zones, you can set those zones here.
     * 
     * Note that if `zoneIDs` is set, then `excludedZoneIDs` will always be empty.
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
    public native CKSyncEngineSendChangesScope init();

    /**
     * Creates a scope that contains all zones except for the given zone IDs.
     */
    @Generated
    @Selector("initWithExcludedZoneIDs:")
    public native CKSyncEngineSendChangesScope initWithExcludedZoneIDs(
            @NotNull NSSet<? extends CKRecordZoneID> excludedZoneIDs);

    /**
     * Creates a scope that includes only the given record IDs.
     * If `recordIDs` is nil, this scope contains all records.
     */
    @Generated
    @Selector("initWithRecordIDs:")
    public native CKSyncEngineSendChangesScope initWithRecordIDs(@Nullable NSSet<? extends CKRecordID> recordIDs);

    /**
     * Creates a scope that contains only the given zone IDs.
     * If `zoneIDs` is nil, then this scope contains all zones.
     */
    @Generated
    @Selector("initWithZoneIDs:")
    public native CKSyncEngineSendChangesScope initWithZoneIDs(@Nullable NSSet<? extends CKRecordZoneID> zoneIDs);

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
    public static native CKSyncEngineSendChangesScope new_objc();

    /**
     * The scope of record IDs in which to send changes.
     * 
     * If you only want to send changes for a particular set of records, you can initialize your scope with those
     * records IDs.
     * When creating the next batch of changes to send to the server, consult this property and only send changes for
     * these record IDs.
     * If this and `zoneIDs` are `nil`, then you should send all changes.
     */
    @Generated
    @Selector("recordIDs")
    @Nullable
    public native NSSet<? extends CKRecordID> recordIDs();

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
     * The scope of zone IDs in which to send changes.
     * 
     * If you only want to send changes for a particular set of zones, you can initialize your scope with those zone
     * IDs.
     * When creating the next batch of changes to send to the server, consult this and only send changes within these
     * zones.
     * If this and `recordIDs` are `nil`, then you should send all changes.
     */
    @Generated
    @Selector("zoneIDs")
    @Nullable
    public native NSSet<? extends CKRecordZoneID> zoneIDs();
}