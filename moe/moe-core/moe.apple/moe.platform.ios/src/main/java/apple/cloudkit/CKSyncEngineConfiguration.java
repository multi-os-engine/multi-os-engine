package apple.cloudkit;

import apple.NSObject;
import apple.cloudkit.protocol.CKSyncEngineDelegate;
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
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngineConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngineConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngineConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngineConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Whether or not the sync engine should automatically sync on your behalf.
     * 
     * If true, then the sync engine will automatically sync using the system scheduler. This is the default value.
     * When you add pending changes to the state, the sync engine will automatically schedule a sync task to send
     * changes.
     * When it receives a notification about new changes on the server, it will automatically schedule a sync task to
     * fetch changes.
     * It will also automatically re-schedule sync tasks for retryable errors such as network failures or server
     * throttles.
     * 
     * If `automaticallySync` is off, then the sync engine will not perform any operations unless you tell it to do so
     * via `fetchChanges` or `sendChanges`.
     * 
     * Most applications likely want to enable automatic syncing during normal use.
     * However, you might want to disable it if you have specific requirements for when you want to sync.
     * For example, if you want to sync only once per day, you can turn off automatic sync and manually call
     * `fetchChanges` and `sendChanges` once per day.
     * 
     * You might also disable automatic sync when writing automated tests for your integration with `CKSyncEngine`.
     * This way, you can have fine grained control over exactly when the sync engine fetches or sends changes.
     * This allows you to simulate edge cases and deterministically test your logic around scenarios like conflict
     * resolution and error handling.
     */
    @Generated
    @Selector("automaticallySync")
    public native boolean automaticallySync();

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
     * The database for this sync engine to sync with.
     * 
     * You can have multiple instances of `CKSyncEngine` in the same process, each targeting a different database.
     * For example, you might have one for your private database and one for your shared database.
     * 
     * It's also technically possible to have multiple instances of `CKSyncEngine` for the same `CKDatabase`.
     * This isn't recommended for production code, but it can be helpful for testing your `CKSyncEngine` integration.
     * For example, you might make multiple `CKSyncEngine` instances to simulate multiple devices syncing back and
     * forth.
     */
    @Generated
    @Selector("database")
    @NotNull
    public native CKDatabase database();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Your implementation of `CKSyncEngineDelegate`.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native CKSyncEngineDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CKSyncEngineConfiguration init();

    @Generated
    @Selector("initWithDatabase:stateSerialization:delegate:")
    public native CKSyncEngineConfiguration initWithDatabaseStateSerializationDelegate(@NotNull CKDatabase database,
            @Nullable CKSyncEngineStateSerialization stateSerialization,
            @Mapped(ObjCObjectMapper.class) @NotNull CKSyncEngineDelegate delegate);

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
    public static native CKSyncEngineConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Whether or not the sync engine should automatically sync on your behalf.
     * 
     * If true, then the sync engine will automatically sync using the system scheduler. This is the default value.
     * When you add pending changes to the state, the sync engine will automatically schedule a sync task to send
     * changes.
     * When it receives a notification about new changes on the server, it will automatically schedule a sync task to
     * fetch changes.
     * It will also automatically re-schedule sync tasks for retryable errors such as network failures or server
     * throttles.
     * 
     * If `automaticallySync` is off, then the sync engine will not perform any operations unless you tell it to do so
     * via `fetchChanges` or `sendChanges`.
     * 
     * Most applications likely want to enable automatic syncing during normal use.
     * However, you might want to disable it if you have specific requirements for when you want to sync.
     * For example, if you want to sync only once per day, you can turn off automatic sync and manually call
     * `fetchChanges` and `sendChanges` once per day.
     * 
     * You might also disable automatic sync when writing automated tests for your integration with `CKSyncEngine`.
     * This way, you can have fine grained control over exactly when the sync engine fetches or sends changes.
     * This allows you to simulate edge cases and deterministically test your logic around scenarios like conflict
     * resolution and error handling.
     */
    @Generated
    @Selector("setAutomaticallySync:")
    public native void setAutomaticallySync(boolean value);

    /**
     * The database for this sync engine to sync with.
     * 
     * You can have multiple instances of `CKSyncEngine` in the same process, each targeting a different database.
     * For example, you might have one for your private database and one for your shared database.
     * 
     * It's also technically possible to have multiple instances of `CKSyncEngine` for the same `CKDatabase`.
     * This isn't recommended for production code, but it can be helpful for testing your `CKSyncEngine` integration.
     * For example, you might make multiple `CKSyncEngine` instances to simulate multiple devices syncing back and
     * forth.
     */
    @Generated
    @Selector("setDatabase:")
    public native void setDatabase(@NotNull CKDatabase value);

    /**
     * Your implementation of `CKSyncEngineDelegate`.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable CKSyncEngineDelegate value);

    /**
     * Your implementation of `CKSyncEngineDelegate`.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable CKSyncEngineDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The state serialization you last received in a `CKSyncEngineStateUpdateEvent`.
     * 
     * If this is the first time ever initializing your `CKSyncEngine`, you can provide `nil`.
     */
    @Generated
    @Selector("setStateSerialization:")
    public native void setStateSerialization(@Nullable CKSyncEngineStateSerialization value);

    /**
     * An optional override for the sync engine's default database subscription ID.
     * Use this for backward compatibility with a previous CloudKit sync implementation.
     * 
     * By default, `CKSyncEngine` will create its own `CKDatabaseSubscription` with its own subscription ID.
     * If you're migrating to `CKSyncEngine` from a custom CloudKit sync implementation, you can specify your previous
     * subscription ID here.
     * This allows your `CKSyncEngine` integration to be backward compatible with previous versions of your app.
     * 
     * >Note: `CKSyncEngine` will automatically attempt to discover any previous database subscriptions,
     * but you can be more explicit by giving the subscription ID through this configuration option.
     */
    @Generated
    @Selector("setSubscriptionID:")
    public native void setSubscriptionID(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The state serialization you last received in a `CKSyncEngineStateUpdateEvent`.
     * 
     * If this is the first time ever initializing your `CKSyncEngine`, you can provide `nil`.
     */
    @Generated
    @Selector("stateSerialization")
    @Nullable
    public native CKSyncEngineStateSerialization stateSerialization();

    /**
     * An optional override for the sync engine's default database subscription ID.
     * Use this for backward compatibility with a previous CloudKit sync implementation.
     * 
     * By default, `CKSyncEngine` will create its own `CKDatabaseSubscription` with its own subscription ID.
     * If you're migrating to `CKSyncEngine` from a custom CloudKit sync implementation, you can specify your previous
     * subscription ID here.
     * This allows your `CKSyncEngine` integration to be backward compatible with previous versions of your app.
     * 
     * >Note: `CKSyncEngine` will automatically attempt to discover any previous database subscriptions,
     * but you can be more explicit by giving the subscription ID through this configuration option.
     */
    @Generated
    @Selector("subscriptionID")
    @Nullable
    public native String subscriptionID();

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