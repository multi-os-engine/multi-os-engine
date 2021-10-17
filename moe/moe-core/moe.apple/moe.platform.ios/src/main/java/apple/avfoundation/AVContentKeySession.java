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

    /**
     * addContentKeyRecipient:
     * <p>
     * Informs the receiver that the specified recipient will be used for the session.
     * <p>
     * It is an error to add recipient to sessions that have received an expire message. It is also an error to add recipients after they have already begun to process media data (e.g. after an AVURLAsset has loaded the values of any of its keys). Such errors will result in NSInternalInconsistencyExceptions. Sending this message to an AVContentKeySession is atomic.
     */
    @Generated
    @Selector("addContentKeyRecipient:")
    public native void addContentKeyRecipient(@Mapped(ObjCObjectMapper.class) AVContentKeyRecipient recipient);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVContentKeySession alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVContentKeySession allocWithZone(VoidPtr zone);

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

    /**
     * [@property]      contentKeyRecipients
     * <p>
     * The array of recipients of content keys currently associated with the AVContentKeySession.
     */
    @Generated
    @Selector("contentKeyRecipients")
    public native NSArray<?> contentKeyRecipients();

    /**
     * contentKeySessionWithKeySystem:
     * <p>
     * Creates a new instance of AVContentKeySession to manage a collection of media content keys.
     * <p>
     * This method returns an AVContentKeySession instance that is capable of managing collection of media content keys corresponding to the input keySystem. An NSInvalidArgumentException will be raised if the value of keySystem is unsupported.
     *
     * @param keySystem A valid key system for retrieving keys.
     * @return A new AVContentKeySession.
     */
    @Generated
    @Selector("contentKeySessionWithKeySystem:")
    public static native AVContentKeySession contentKeySessionWithKeySystem(String keySystem);

    /**
     * contentKeySessionWithKeySystem:storageDirectoryAtURL:
     * <p>
     * Creates a new instance of AVContentKeySession to manage a collection of media content keys.
     * <p>
     * This method returns an AVContentKeySession instance that is capable of managing collection of media content keys corresponding to the input keySystem. An NSInvalidArgumentException will be raised if the value of keySystem is unsupported.
     *
     * @param keySystem  A valid key system for retrieving keys.
     * @param storageURL URL to a writable directory that the session will use to facilitate expired session reports after abnormal session termination.
     * @return A new AVContentKeySession.
     */
    @Generated
    @Selector("contentKeySessionWithKeySystem:storageDirectoryAtURL:")
    public static native AVContentKeySession contentKeySessionWithKeySystemStorageDirectoryAtURL(String keySystem,
            NSURL storageURL);

    /**
     * [@property]      contentProtectionSessionIdentifier
     * <p>
     * An opaque identifier for the current content protection session.
     * <p>
     * May be nil. Will call the delegate's contentKeySessionContentProtectionSessionIdentifierDidChange: when the identifier changes. The protection session ID is a unique string identifier generated by the AVContentKeySession that can be used by the application to identify content key session objects.
     */
    @Generated
    @Selector("contentProtectionSessionIdentifier")
    public native NSData contentProtectionSessionIdentifier();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property]      delegate
     * <p>
     * The receiver's delegate.
     * <p>
     * The value of this property is an object conforming to the AVContentKeySessionDelegate protocol. The delegate is set using the setDelegate:queue: method.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVContentKeySessionDelegate delegate();

    /**
     * [@property]      delegateQueue
     * <p>
     * The dispatch queue on which all delegate methods will be invoked whenever processes requiring content keys are executed asynchronously.
     * <p>
     * The value of this property is a dispatch_queue_t. The queue is set using the setDelegate:queue: method.
     */
    @Generated
    @Selector("delegateQueue")
    public native NSObject delegateQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * expire
     * <p>
     * Tells the receiver to treat the session as having been intentionally and normally expired.
     * <p>
     * When an instance of AVContentKeySession receives an expire message, all of its associated objects conforming to the AVContentKeyRecipient protocol will become inoperable. Send this message only after you have finished operating on the media data.
     */
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

    /**
     * [@property]      keySystem
     * <p>
     * The key system used for retrieving keys
     */
    @Generated
    @Selector("keySystem")
    public native String keySystem();

    /**
     * makeSecureTokenForExpirationDateOfPersistableContentKey:completionHandler:
     * <p>
     * Creates a secure server playback context (SPC) that the client could send to the key server to obtain an expiration date for the provided persistable content key data.
     *
     * @param persistableContentKeyData Persistable content key data that was previously created using -[AVContentKeyRequest persistableContentKeyFromKeyVendorResponse:options:error:] or obtained via AVContentKeySessionDelegate callback -contentKeySession:didUpdatePersistableContentKey:forContentKeyIdentifier:.
     * @param handler                   Once the secure token is ready, this block will be called with the token or an error describing the failure.
     */
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
    public static native AVContentKeySession new_objc();

    /**
     * pendingExpiredSessionReportsWithAppIdentifier:storageDirectoryAtURL:
     * <p>
     * Provides "expired session reports" for prior AVContentKeySessions created with the specified app identifier that have expired either normally or abnormally.
     * <p>
     * Note that no reports for sessions still in progress will be included.
     *
     * @param appIdentifier An opaque identifier for the application. The contents of this identifier depend on the particular protocol in use by the entity that controls the use of the media data.
     * @param storageURL    URL to a directory previously used with one or more instances of AVContentKeySession for the storage of expired session reports.
     * @return An NSArray containing instances of NSData, each containing a pending expired session report as a property-list serialization of an NSDictionary object. The contents of expired session reports depend on the particular protocol in use by the entity that controls the use of the media data.
     */
    @Generated
    @Selector("pendingExpiredSessionReportsWithAppIdentifier:storageDirectoryAtURL:")
    public static native NSArray<? extends NSData> pendingExpiredSessionReportsWithAppIdentifierStorageDirectoryAtURL(
            NSData appIdentifier, NSURL storageURL);

    /**
     * processContentKeyRequestWithIdentifier:initializationData:options:
     * <p>
     * Informs the receiver that it should attempt to instantiate a content decryption key using the specified initialization data.
     * <p>
     * May be used to generate an AVContentKeyRequest from request initialization data already in hand, without awaiting such data during the processing of media data of an associated recipient.
     *
     * @param identifier         Container- and protocol-specific identifier to be used to obtain a key response. Either identifier or initializationData must be non-nil. Both can be non-nil, if the content protection protocol requires both.
     * @param initializationData Container- and protocol-specific data to be used to obtain a key response. Either identifier or initializationData must be non-nil. Both can be non-nil, if the content protection protocol requires both.
     * @param options            Additional information necessary to obtain the key, or nil if none. See AVContentKeyRequest*Key below.
     */
    @Generated
    @Selector("processContentKeyRequestWithIdentifier:initializationData:options:")
    public native void processContentKeyRequestWithIdentifierInitializationDataOptions(
            @Mapped(ObjCObjectMapper.class) Object identifier, NSData initializationData,
            NSDictionary<String, ?> options);

    /**
     * removeContentKeyRecipient:
     * <p>
     * Informs the receiver that the specified recipient will no longer be used.
     * <p>
     * After the specified recipient is removed from the receiver it will become inoperable. Remove the recipient only after you have finished operating on the media data associated with it. Sending this message to an AVContentKeySession is atomic.
     */
    @Generated
    @Selector("removeContentKeyRecipient:")
    public native void removeContentKeyRecipient(@Mapped(ObjCObjectMapper.class) AVContentKeyRecipient recipient);

    /**
     * removePendingExpiredSessionReports:withAppIdentifier:storageDirectoryAtURL:
     * <p>
     * Removes expired session reports for prior AVContentKeySessions from storage. Once they have been removed, they will no longer be available via subsequent invocations of +pendingExpiredSessionReportsWithAppIdentifier:.
     * <p>
     * This method is most suitable for use only after the specified expired session reports have been sent to the entity that controls the use of the media data and the entity has acknowledged their receipt.
     *
     * @param expiredSessionReports An array of expired session reports to be discarded.
     * @param appIdentifier         An opaque identifier for the application. The contents of this identifier depend on the particular protocol in use by the entity that controls the use of the media data.
     * @param storageURL            URL to a writable folder.
     */
    @Generated
    @Selector("removePendingExpiredSessionReports:withAppIdentifier:storageDirectoryAtURL:")
    public static native void removePendingExpiredSessionReportsWithAppIdentifierStorageDirectoryAtURL(
            NSArray<? extends NSData> expiredSessionReports, NSData appIdentifier, NSURL storageURL);

    /**
     * renewExpiringResponseDataForContentKeyRequest:
     * <p>
     * Informs the receiver that the already provided response data for an earlier AVContentKeyRequest will imminently expire.
     * <p>
     * In response the receiver will invoke your delegate with a new content key request entreating it to renew the expiring response data, via -contentKeySession:didProvideRenewingContentKeyRequest:.
     */
    @Generated
    @Selector("renewExpiringResponseDataForContentKeyRequest:")
    public native void renewExpiringResponseDataForContentKeyRequest(AVContentKeyRequest contentKeyRequest);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setDelegate:queue:
     * <p>
     * Sets the receiver's delegate. A delegate is required to handle content key initialization.
     *
     * @param delegate      An object conforming to the AVContentKeySessionDelegate protocol.
     * @param delegateQueue A dispatch queue on which delegate methods will be invoked whenever processes requiring content keys are executed asynchronously. Passing a value of nil for the delegateQueue parameter along with a non-nil value for the delegate parameter will result in an invalid argument exception.
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(@Mapped(ObjCObjectMapper.class) AVContentKeySessionDelegate delegate,
            NSObject delegateQueue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]      storageURL
     * <p>
     * The storage URL provided when the AVContentKeySession was created. May be nil.
     * <p>
     * URL to a writable directory; may be nil. The session will use this to facilitate expired session reports after abnormal session termination.
     */
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

    /**
     * invalidateAllPersistableContentKeysForApp:options:completionHandler:
     * <p>
     * Invalidates all persistable content keys associated with the application and creates a secure server playback context (SPC) that the client could send to the key server to verify the outcome of invalidation request.
     * <p>
     * Once invalidated, persistable content keys cannot be used to answer key requests during later playback sessions.
     *
     * @param appIdentifier An opaque identifier for the application. The contents of this identifier depend on the particular protocol in use by the entity that controls the use of the media data.
     * @param options       Additional information necessary to generate the server playback context, or nil if none. See AVContentKeySessionServerPlaybackContextOption for supported options.
     * @param handler       Once the server playback context is ready, this block will be called with the data or an error describing the failure.
     */
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

    /**
     * invalidatePersistableContentKey:options:completionHandler:
     * <p>
     * Invalidates the persistable content key and creates a secure server playback context (SPC) that the client could send to the key server to verify the outcome of invalidation request.
     * <p>
     * Once invalidated, a persistable content key cannot be used to answer key requests during later playback sessions.
     *
     * @param persistableContentKeyData Persistable content key data that was previously created using -[AVContentKeyRequest persistableContentKeyFromKeyVendorResponse:options:error:] or obtained via AVContentKeySessionDelegate callback -contentKeySession:didUpdatePersistableContentKey:forContentKeyIdentifier:.
     * @param options                   Additional information necessary to generate the server playback context, or nil if none. See AVContentKeySessionServerPlaybackContextOption for supported options.
     * @param handler                   Once the server playback context is ready, this block will be called with the data or an error describing the failure.
     */
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
