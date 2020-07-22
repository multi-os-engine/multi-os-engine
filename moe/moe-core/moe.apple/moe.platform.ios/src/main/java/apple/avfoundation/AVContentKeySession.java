package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVContentKeyRecipient;
import apple.avfoundation.protocol.AVContentKeySessionDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVContentKeySession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVContentKeySession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addContentKeyRecipient:")
    public native void addContentKeyRecipient(@Mapped(ObjCObjectMapper.class) AVContentKeyRecipient recipient);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVContentKeySession alloc();

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
    @Selector("contentKeyRecipients")
    public native NSArray<?> contentKeyRecipients();

    @Generated
    @Selector("contentKeySessionWithKeySystem:")
    public static native AVContentKeySession contentKeySessionWithKeySystem(String keySystem);

    @Generated
    @Selector("contentKeySessionWithKeySystem:storageDirectoryAtURL:")
    public static native AVContentKeySession contentKeySessionWithKeySystemStorageDirectoryAtURL(String keySystem,
            NSURL storageURL);

    @Generated
    @Selector("contentProtectionSessionIdentifier")
    public native NSData contentProtectionSessionIdentifier();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVContentKeySessionDelegate delegate();

    @Generated
    @Selector("delegateQueue")
    public native NSObject delegateQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("expire")
    public native void expire();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVContentKeySession init();

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
    @Selector("keySystem")
    public native String keySystem();

    @Generated
    @Selector("makeSecureTokenForExpirationDateOfPersistableContentKey:completionHandler:")
    public native void makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler(
            NSData persistableContentKeyData,
            @ObjCBlock(name = "call_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler") Block_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler {
        @Generated
        void call_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler(NSData secureTokenData,
                NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("pendingExpiredSessionReportsWithAppIdentifier:storageDirectoryAtURL:")
    public static native NSArray<? extends NSData> pendingExpiredSessionReportsWithAppIdentifierStorageDirectoryAtURL(
            NSData appIdentifier, NSURL storageURL);

    @Generated
    @Selector("processContentKeyRequestWithIdentifier:initializationData:options:")
    public native void processContentKeyRequestWithIdentifierInitializationDataOptions(
            @Mapped(ObjCObjectMapper.class) Object identifier, NSData initializationData,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("removeContentKeyRecipient:")
    public native void removeContentKeyRecipient(@Mapped(ObjCObjectMapper.class) AVContentKeyRecipient recipient);

    @Generated
    @Selector("removePendingExpiredSessionReports:withAppIdentifier:storageDirectoryAtURL:")
    public static native void removePendingExpiredSessionReportsWithAppIdentifierStorageDirectoryAtURL(
            NSArray<? extends NSData> expiredSessionReports, NSData appIdentifier, NSURL storageURL);

    @Generated
    @Selector("renewExpiringResponseDataForContentKeyRequest:")
    public native void renewExpiringResponseDataForContentKeyRequest(AVContentKeyRequest contentKeyRequest);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(@Mapped(ObjCObjectMapper.class) AVContentKeySessionDelegate delegate,
            NSObject delegateQueue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("storageURL")
    public native NSURL storageURL();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("invalidateAllPersistableContentKeysForApp:options:completionHandler:")
    public native void invalidateAllPersistableContentKeysForAppOptionsCompletionHandler(NSData appIdentifier,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler") Block_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler {
        @Generated
        void call_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler(NSData secureTokenData,
                NSError error);
    }

    @Generated
    @Selector("invalidatePersistableContentKey:options:completionHandler:")
    public native void invalidatePersistableContentKeyOptionsCompletionHandler(NSData persistableContentKeyData,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_invalidatePersistableContentKeyOptionsCompletionHandler") Block_invalidatePersistableContentKeyOptionsCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invalidatePersistableContentKeyOptionsCompletionHandler {
        @Generated
        void call_invalidatePersistableContentKeyOptionsCompletionHandler(NSData secureTokenData, NSError error);
    }
}