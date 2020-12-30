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
import org.moe.natj.general.ann.MappedReturn;
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
     * @abstract Get the state of the credential identity store.
     * @param completion completion handler to be called with the current state of the store.
     * @discussion Call this method to find out the current state of the store before attempting to call other store methods.
     * Use the provided ASCredentialIdentityStoreState to find out if the store is enabled and whether it supports incremental
     * updates.
     */
    @Generated
    @Selector("getCredentialIdentityStoreStateWithCompletion:")
    public native void getCredentialIdentityStoreStateWithCompletion(
            @ObjCBlock(name = "call_getCredentialIdentityStoreStateWithCompletion") Block_getCredentialIdentityStoreStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCredentialIdentityStoreStateWithCompletion {
        @Generated
        void call_getCredentialIdentityStoreStateWithCompletion(ASCredentialIdentityStoreState state);
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @abstract Remove all existing credential identities from the store.
     * @param completion optional completion handler to be called after removing all existing credential identities.
     * If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain will be provided and none of
     * the existing credential identities will be removed from the store.
     */
    @Generated
    @Selector("removeAllCredentialIdentitiesWithCompletion:")
    public native void removeAllCredentialIdentitiesWithCompletion(
            @ObjCBlock(name = "call_removeAllCredentialIdentitiesWithCompletion") Block_removeAllCredentialIdentitiesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllCredentialIdentitiesWithCompletion {
        @Generated
        void call_removeAllCredentialIdentitiesWithCompletion(boolean success, NSError error);
    }

    /**
     * @abstract Remove the given credential identities from the store.
     * @param credentialIdentities array of ASPasswordCredentialIdentity objects to remove from the store.
     * @param completion optional completion handler to be called after removing the credential identities.
     * If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain will be provided
     * and none of the objects in credentialIdentities will be removed from the store.
     * @discussion Use this method only if the store supports incremental updates to remove previously added
     * credentials to the store.
     */
    @Generated
    @Selector("removeCredentialIdentities:completion:")
    public native void removeCredentialIdentitiesCompletion(
            NSArray<? extends ASPasswordCredentialIdentity> credentialIdentities,
            @ObjCBlock(name = "call_removeCredentialIdentitiesCompletion") Block_removeCredentialIdentitiesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeCredentialIdentitiesCompletion {
        @Generated
        void call_removeCredentialIdentitiesCompletion(boolean success, NSError error);
    }

    /**
     * @abstract Replace existing credential identities with new credential identities.
     * @param newCredentialIdentities array of new credential identity objects to replace the old ones.
     * @param completion an optional completion block to be called after the operation is finished.
     * @discussion This method will delete all existing credential identities that are persisted in the
     * store and replace them with the provided array of credential identities. If the operation fails, an
     * error with domain ASCredentialIdentityStoreErrorDomain will be provided and none of the new credential
     * identities will be saved.
     */
    @Generated
    @Selector("replaceCredentialIdentitiesWithIdentities:completion:")
    public native void replaceCredentialIdentitiesWithIdentitiesCompletion(
            NSArray<? extends ASPasswordCredentialIdentity> newCredentialIdentities,
            @ObjCBlock(name = "call_replaceCredentialIdentitiesWithIdentitiesCompletion") Block_replaceCredentialIdentitiesWithIdentitiesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replaceCredentialIdentitiesWithIdentitiesCompletion {
        @Generated
        void call_replaceCredentialIdentitiesWithIdentitiesCompletion(boolean success, NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @abstract Save the given credential identities to the store.
     * @param credentialIdentities array of ASPasswordCredentialIdentity objects to save to the store.
     * @param completion optional completion handler to be called after adding the credential identities.
     * If the operation fails, an error with domain ASCredentialIdentityStoreErrorDomain will be provided
     * and none of the objects in credentialIdentities will be saved to the store.
     * @discussion If the store supports incremental updates, call this method to add new credential
     * identities since the last time the store was updated. Otherwise, call this method to pass all credential
     * identities.
     * If some credential identities in credentialIdentities already exist in the store, they will be replaced by
     * those from credentialIdentities.
     */
    @Generated
    @Selector("saveCredentialIdentities:completion:")
    public native void saveCredentialIdentitiesCompletion(
            NSArray<? extends ASPasswordCredentialIdentity> credentialIdentities,
            @ObjCBlock(name = "call_saveCredentialIdentitiesCompletion") Block_saveCredentialIdentitiesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveCredentialIdentitiesCompletion {
        @Generated
        void call_saveCredentialIdentitiesCompletion(boolean success, NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
}