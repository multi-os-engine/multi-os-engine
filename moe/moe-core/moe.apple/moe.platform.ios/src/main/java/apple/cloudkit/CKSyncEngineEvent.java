package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * This class should not be subclassed. If it is, Sendable may no longer apply.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngineEvent extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngineEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("accountChangeEvent")
    @NotNull
    public native CKSyncEngineAccountChangeEvent accountChangeEvent();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngineEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngineEvent allocWithZone(VoidPtr zone);

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
    @Selector("didFetchChangesEvent")
    @NotNull
    public native CKSyncEngineDidFetchChangesEvent didFetchChangesEvent();

    @Generated
    @Selector("didFetchRecordZoneChangesEvent")
    @NotNull
    public native CKSyncEngineDidFetchRecordZoneChangesEvent didFetchRecordZoneChangesEvent();

    @Generated
    @Selector("didSendChangesEvent")
    @NotNull
    public native CKSyncEngineDidSendChangesEvent didSendChangesEvent();

    @Generated
    @Selector("fetchedDatabaseChangesEvent")
    @NotNull
    public native CKSyncEngineFetchedDatabaseChangesEvent fetchedDatabaseChangesEvent();

    @Generated
    @Selector("fetchedRecordZoneChangesEvent")
    @NotNull
    public native CKSyncEngineFetchedRecordZoneChangesEvent fetchedRecordZoneChangesEvent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CKSyncEngineEvent init();

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
    public static native CKSyncEngineEvent new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("sentDatabaseChangesEvent")
    @NotNull
    public native CKSyncEngineSentDatabaseChangesEvent sentDatabaseChangesEvent();

    @Generated
    @Selector("sentRecordZoneChangesEvent")
    @NotNull
    public native CKSyncEngineSentRecordZoneChangesEvent sentRecordZoneChangesEvent();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Helpers to cast an event to the proper subclass.
     * These will crash if used for the wrong event type.
     */
    @Generated
    @Selector("stateUpdateEvent")
    @NotNull
    public native CKSyncEngineStateUpdateEvent stateUpdateEvent();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("willFetchChangesEvent")
    @NotNull
    public native CKSyncEngineWillFetchChangesEvent willFetchChangesEvent();

    @Generated
    @Selector("willFetchRecordZoneChangesEvent")
    @NotNull
    public native CKSyncEngineWillFetchRecordZoneChangesEvent willFetchRecordZoneChangesEvent();

    @Generated
    @Selector("willSendChangesEvent")
    @NotNull
    public native CKSyncEngineWillSendChangesEvent willSendChangesEvent();
}