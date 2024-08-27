package apple.authenticationservices;

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
 * API-Since: 12.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASCredentialIdentityStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASCredentialIdentityStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASCredentialIdentityStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASCredentialIdentityStore allocWithZone(VoidPtr zone);

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

    /**
     * Get the state of the credential identity store.
     * 
     * Call this method to find out the current state of the store before attempting to call other store methods.
     * Use the provided ASCredentialIdentityStoreState to find out if the store is enabled and whether it supports
     * incremental
     * updates.
     * 
     * @param completion completion handler to be called with the current state of the store.
     */
    @Generated
    @Selector("getCredentialIdentityStoreStateWithCompletion:")
    public native void getCredentialIdentityStoreStateWithCompletion(
            @NotNull @ObjCBlock(name = "call_getCredentialIdentityStoreStateWithCompletion") Block_getCredentialIdentityStoreStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCredentialIdentityStoreStateWithCompletion {
        @Generated
        void call_getCredentialIdentityStoreStateWithCompletion(@NotNull ASCredentialIdentityStoreState state);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASCredentialIdentityStore init();

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
    public static native ASCredentialIdentityStore new_objc();

    /**
     * Remove all existing credential identities from the store.
     * 
     * @param completion optional completion handler to be called after removing all existing credential identities.
     *                   If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain will be
     *                   provided and none of
     *                   the existing credential identities will be removed from the store.
     */
    @Generated
    @Selector("removeAllCredentialIdentitiesWithCompletion:")
    public native void removeAllCredentialIdentitiesWithCompletion(
            @Nullable @ObjCBlock(name = "call_removeAllCredentialIdentitiesWithCompletion") Block_removeAllCredentialIdentitiesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllCredentialIdentitiesWithCompletion {
        @Generated
        void call_removeAllCredentialIdentitiesWithCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Remove the given credential identities from the store.
     * 
     * Use this method only if the store supports incremental updates to remove previously added
     * credentials to the store.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 17.0
     * 
     * @param credentialIdentities array of ASPasswordCredentialIdentity objects to remove from the store.
     * @param completion           optional completion handler to be called after removing the credential identities.
     *                             If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain
     *                             will be provided
     *                             and none of the objects in credentialIdentities will be removed from the store.
     */
    @Deprecated
    @Generated
    @Selector("removeCredentialIdentities:completion:")
    public native void removeCredentialIdentitiesCompletion(
            @NotNull NSArray<? extends ASPasswordCredentialIdentity> credentialIdentities,
            @Nullable @ObjCBlock(name = "call_removeCredentialIdentitiesCompletion") Block_removeCredentialIdentitiesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeCredentialIdentitiesCompletion {
        @Generated
        void call_removeCredentialIdentitiesCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Replace existing credential identities with new credential identities.
     * 
     * This method will delete all existing credential identities that are persisted in the
     * store and replace them with the provided array of credential identities. If the operation fails, an
     * error with domain ASCredentialIdentityStoreErrorDomain will be provided and none of the new credential
     * identities will be saved.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 17.0
     * 
     * @param newCredentialIdentities array of new credential identity objects to replace the old ones.
     * @param completion              an optional completion block to be called after the operation is finished.
     */
    @Deprecated
    @Generated
    @Selector("replaceCredentialIdentitiesWithIdentities:completion:")
    public native void replaceCredentialIdentitiesWithIdentitiesCompletion(
            @NotNull NSArray<? extends ASPasswordCredentialIdentity> newCredentialIdentities,
            @Nullable @ObjCBlock(name = "call_replaceCredentialIdentitiesWithIdentitiesCompletion") Block_replaceCredentialIdentitiesWithIdentitiesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replaceCredentialIdentitiesWithIdentitiesCompletion {
        @Generated
        void call_replaceCredentialIdentitiesWithIdentitiesCompletion(boolean success, @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Save the given credential identities to the store.
     * 
     * If the store supports incremental updates, call this method to add new credential
     * identities since the last time the store was updated. Otherwise, call this method to pass all credential
     * identities.
     * If some credential identities in credentialIdentities already exist in the store, they will be replaced by
     * those from credentialIdentities.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 17.0
     * 
     * @param credentialIdentities array of ASPasswordCredentialIdentity objects to save to the store.
     * @param completion           optional completion handler to be called after adding the credential identities.
     *                             If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain
     *                             will be provided
     *                             and none of the objects in credentialIdentities will be saved to the store.
     */
    @Deprecated
    @Generated
    @Selector("saveCredentialIdentities:completion:")
    public native void saveCredentialIdentitiesCompletion(
            @NotNull NSArray<? extends ASPasswordCredentialIdentity> credentialIdentities,
            @Nullable @ObjCBlock(name = "call_saveCredentialIdentitiesCompletion") Block_saveCredentialIdentitiesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveCredentialIdentitiesCompletion {
        @Generated
        void call_saveCredentialIdentitiesCompletion(boolean success, @Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("sharedStore")
    public static native ASCredentialIdentityStore sharedStore();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Remove the given credential identities from the store.
     * 
     * Use this method only if the store supports incremental updates to remove previously added
     * credentials to the store.
     * 
     * API-Since: 17.0
     * 
     * @param credentialIdentities array of ASCredentialIdentity objects to remove from the store.
     * @param completion           optional completion handler to be called after removing the credential identities.
     *                             If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain
     *                             will be provided
     *                             and none of the objects in credentialIdentities will be removed from the store.
     */
    @Generated
    @Selector("removeCredentialIdentityEntries:completion:")
    public native void removeCredentialIdentityEntriesCompletion(@NotNull NSArray<?> credentialIdentities,
            @ObjCBlock(name = "call_removeCredentialIdentityEntriesCompletion") @Nullable Block_removeCredentialIdentityEntriesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeCredentialIdentityEntriesCompletion {
        @Generated
        void call_removeCredentialIdentityEntriesCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Replace existing credential identities with new credential identities.
     * 
     * This method will delete all existing credential identities that are persisted in the
     * store and replace them with the provided array of credential identities. If the operation fails, an
     * error with domain ASCredentialIdentityStoreErrorDomain will be provided and none of the new credential
     * identities will be saved.
     * 
     * API-Since: 17.0
     * 
     * @param newCredentialIdentities array of new credential identity objects to replace the old ones.
     * @param completion              an optional completion block to be called after the operation is finished.
     */
    @Generated
    @Selector("replaceCredentialIdentityEntries:completion:")
    public native void replaceCredentialIdentityEntriesCompletion(@NotNull NSArray<?> newCredentialIdentities,
            @ObjCBlock(name = "call_replaceCredentialIdentityEntriesCompletion") @Nullable Block_replaceCredentialIdentityEntriesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replaceCredentialIdentityEntriesCompletion {
        @Generated
        void call_replaceCredentialIdentityEntriesCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Save the given credential identities to the store.
     * 
     * If the store supports incremental updates, call this method to add new credential
     * identities since the last time the store was updated. Otherwise, call this method to pass all credential
     * identities.
     * If some credential identities in credentialIdentities already exist in the store, they will be replaced by
     * those from credentialIdentities.
     * 
     * API-Since: 17.0
     * 
     * @param credentialIdentities array of ASCredentialIdentity objects to save to the store.
     * @param completion           optional completion handler to be called after adding the credential identities.
     *                             If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain
     *                             will be provided
     *                             and none of the objects in credentialIdentities will be saved to the store.
     */
    @Generated
    @Selector("saveCredentialIdentityEntries:completion:")
    public native void saveCredentialIdentityEntriesCompletion(@NotNull NSArray<?> credentialIdentities,
            @ObjCBlock(name = "call_saveCredentialIdentityEntriesCompletion") @Nullable Block_saveCredentialIdentityEntriesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveCredentialIdentityEntriesCompletion {
        @Generated
        void call_saveCredentialIdentityEntriesCompletion(boolean success, @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
