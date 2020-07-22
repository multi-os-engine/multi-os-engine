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