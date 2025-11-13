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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * An AVContentKeySession is used to create and track decryption keys for media data. Objects conforming to the
 * AVContentKeyRecipient protocol, such as AVURLAssets, can be added to an AVContentKeySession to employ the services of
 * the AVContentKeySession in handling new key requests and to obtain access to the session's already existing keys.
 * 
 * Its secondary purpose is to provide a report of expired sessions to assist a controlling entity that wishes to track
 * the set of sessions that are still active. If initialized with a location at which to store them, AVContentKeySession
 * maintains a global collection of pending "expired session reports", each associated with an identifier for the app
 * that created the session. The contents of this identifier are specified by the controlling entity that provides media
 * data or that grants permission for its use.
 * 
 * Expired sessions are tracked as follows: a stream processing session is considered to be started after an instance of
 * AVContentKeySession is created and the first object conforming to the AVContentKeyRecipient protocol is added to it.
 * If an instance of AVContentKeySession that has reached this state does not receive an expire message before it's
 * deallocated or the process in which it's running is terminated, an "expired session report" will subsequently be
 * added to the pending list of expired session reports that indicates that the session expired abnormally. In contrast,
 * for AVContentKeySessions that reach the state of having at least one object conforming to the AVContentKeyRecipient
 * protocol added to them and later receive an expire message, "expired session reports" will be generated that indicate
 * that the session expired normally.
 * 
 * To obtain the collection of pending expired session reports in order to provide them to the controlling entity
 * associated with a specific app identifier, use +pendingExpiredSessionReportsWithAppIdentifier:.
 * 
 * After pending expired session reports have been sent to the controlling entity and their receipt has been
 * acknowledged, they can be removed from the collection of pending expired session reports maintained by
 * AVContentKeySession by using +removePendingExpiredSessionReports:withAppIdentifier:.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 10.3
 */
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
     * Informs the receiver that the specified recipient will be used for the session.
     * 
     * It is an error to add recipient to sessions that have received an expire message. It is also an error to add
     * recipients after they have already begun to process media data (e.g. after an AVURLAsset has loaded the values of
     * any of its keys). Such errors will result in NSInternalInconsistencyExceptions. Sending this message to an
     * AVContentKeySession is atomic.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("addContentKeyRecipient:")
    public native void addContentKeyRecipient(@NotNull @Mapped(ObjCObjectMapper.class) AVContentKeyRecipient recipient);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVContentKeySession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVContentKeySession allocWithZone(VoidPtr zone);

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

    /**
     * The array of recipients of content keys currently associated with the AVContentKeySession.
     * 
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @Selector("contentKeyRecipients")
    public native NSArray<?> contentKeyRecipients();

    /**
     * Creates a new instance of AVContentKeySession to manage a collection of media content keys.
     * 
     * This method returns an AVContentKeySession instance that is capable of managing collection of media content keys
     * corresponding to the input keySystem. An NSInvalidArgumentException will be raised if the value of keySystem is
     * unsupported.
     * 
     * - Parameter keySystem: A valid key system for retrieving keys.
     * 
     * - Returns: A new AVContentKeySession.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("contentKeySessionWithKeySystem:")
    public static native AVContentKeySession contentKeySessionWithKeySystem(@NotNull String keySystem);

    /**
     * Creates a new instance of AVContentKeySession to manage a collection of media content keys.
     * 
     * This method returns an AVContentKeySession instance that is capable of managing collection of media content keys
     * corresponding to the input keySystem. An NSInvalidArgumentException will be raised if the value of keySystem is
     * unsupported.
     * 
     * - Parameter keySystem: A valid key system for retrieving keys.
     * - Parameter storageURL: URL to a writable directory that the session will use to facilitate expired session
     * reports after abnormal session termination.
     * 
     * - Returns: A new AVContentKeySession.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("contentKeySessionWithKeySystem:storageDirectoryAtURL:")
    public static native AVContentKeySession contentKeySessionWithKeySystemStorageDirectoryAtURL(
            @NotNull String keySystem, @NotNull NSURL storageURL);

    /**
     * An opaque identifier for the current content protection session.
     * 
     * May be nil. Will call the delegate's contentKeySessionContentProtectionSessionIdentifierDidChange: when the
     * identifier changes. The protection session ID is a unique string identifier generated by the AVContentKeySession
     * that can be used by the application to identify content key session objects.
     * 
     * API-Since: 10.3
     */
    @Nullable
    @Generated
    @Selector("contentProtectionSessionIdentifier")
    public native NSData contentProtectionSessionIdentifier();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The receiver's delegate.
     * 
     * The value of this property is an object conforming to the AVContentKeySessionDelegate protocol. The delegate is
     * set using the setDelegate:queue: method.
     * 
     * API-Since: 10.3
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVContentKeySessionDelegate delegate();

    /**
     * The dispatch queue on which all delegate methods will be invoked whenever processes requiring content keys are
     * executed asynchronously.
     * 
     * The value of this property is a dispatch_queue_t. The queue is set using the setDelegate:queue: method.
     * 
     * API-Since: 10.3
     */
    @Nullable
    @Generated
    @Selector("delegateQueue")
    public native dispatch_queue_t delegateQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Tells the receiver to treat the session as having been intentionally and normally expired.
     * 
     * When an instance of AVContentKeySession receives an expire message, all of its associated objects conforming to
     * the AVContentKeyRecipient protocol will become inoperable. Send this message only after you have finished
     * operating on the media data.
     * 
     * API-Since: 10.3
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The key system used for retrieving keys
     * 
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @Selector("keySystem")
    public native String keySystem();

    /**
     * Creates a secure server playback context (SPC) that the client could send to the key server to obtain an
     * expiration date for the provided persistable content key data.
     * 
     * - Parameter persistableContentKeyData: Persistable content key data that was previously created using
     * -[AVContentKeyRequest persistableContentKeyFromKeyVendorResponse:options:error:] or obtained via
     * AVContentKeySessionDelegate callback -contentKeySession:didUpdatePersistableContentKey:forContentKeyIdentifier:.
     * - Parameter handler: Once the secure token is ready, this block will be called with the token or an error
     * describing the failure.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("makeSecureTokenForExpirationDateOfPersistableContentKey:completionHandler:")
    public native void makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler(
            @NotNull NSData persistableContentKeyData,
            @NotNull @ObjCBlock(name = "call_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler") Block_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler {
        @Generated
        void call_makeSecureTokenForExpirationDateOfPersistableContentKeyCompletionHandler(
                @Nullable NSData secureTokenData, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native AVContentKeySession new_objc();

    /**
     * Provides "expired session reports" for prior AVContentKeySessions created with the specified app identifier that
     * have expired either normally or abnormally.
     * 
     * Note that no reports for sessions still in progress will be included.
     * 
     * - Parameter appIdentifier: An opaque identifier for the application. The contents of this identifier depend on
     * the particular protocol in use by the entity that controls the use of the media data.
     * - Parameter storageURL: URL to a directory previously used with one or more instances of AVContentKeySession for
     * the storage of expired session reports.
     * 
     * - Returns: An NSArray containing instances of NSData, each containing a pending expired session report as a
     * property-list serialization of an NSDictionary object. The contents of expired session reports depend on the
     * particular protocol in use by the entity that controls the use of the media data.
     * 
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @Selector("pendingExpiredSessionReportsWithAppIdentifier:storageDirectoryAtURL:")
    public static native NSArray<? extends NSData> pendingExpiredSessionReportsWithAppIdentifierStorageDirectoryAtURL(
            @NotNull NSData appIdentifier, @NotNull NSURL storageURL);

    /**
     * Informs the receiver that it should attempt to instantiate a content decryption key using the specified
     * initialization data.
     * 
     * May be used to generate an AVContentKeyRequest from request initialization data already in hand, without awaiting
     * such data during the processing of media data of an associated recipient.
     * 
     * - Parameter identifier: Container- and protocol-specific identifier to be used to obtain a key response. Either
     * identifier or initializationData must be non-nil. Both can be non-nil, if the content protection protocol
     * requires both.
     * - Parameter initializationData: Container- and protocol-specific data to be used to obtain a key response. Either
     * identifier or initializationData must be non-nil. Both can be non-nil, if the content protection protocol
     * requires both.
     * - Parameter options: Additional information necessary to obtain the key, or nil if none. See
     * AVContentKeyRequest*Key below.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("processContentKeyRequestWithIdentifier:initializationData:options:")
    public native void processContentKeyRequestWithIdentifierInitializationDataOptions(
            @Nullable @Mapped(ObjCObjectMapper.class) Object identifier, @Nullable NSData initializationData,
            @Nullable NSDictionary<String, ?> options);

    /**
     * Informs the receiver that the specified recipient will no longer be used.
     * 
     * After the specified recipient is removed from the receiver it will become inoperable. Remove the recipient only
     * after you have finished operating on the media data associated with it. Sending this message to an
     * AVContentKeySession is atomic.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("removeContentKeyRecipient:")
    public native void removeContentKeyRecipient(
            @NotNull @Mapped(ObjCObjectMapper.class) AVContentKeyRecipient recipient);

    /**
     * Removes expired session reports for prior AVContentKeySessions from storage. Once they have been removed, they
     * will no longer be available via subsequent invocations of +pendingExpiredSessionReportsWithAppIdentifier:.
     * 
     * This method is most suitable for use only after the specified expired session reports have been sent to the
     * entity that controls the use of the media data and the entity has acknowledged their receipt.
     * 
     * - Parameter expiredSessionReports: An array of expired session reports to be discarded.
     * - Parameter appIdentifier: An opaque identifier for the application. The contents of this identifier depend on
     * the particular protocol in use by the entity that controls the use of the media data.
     * - Parameter storageURL: URL to a writable folder.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("removePendingExpiredSessionReports:withAppIdentifier:storageDirectoryAtURL:")
    public static native void removePendingExpiredSessionReportsWithAppIdentifierStorageDirectoryAtURL(
            @NotNull NSArray<? extends NSData> expiredSessionReports, @NotNull NSData appIdentifier,
            @NotNull NSURL storageURL);

    /**
     * Informs the receiver that the already provided response data for an earlier AVContentKeyRequest will imminently
     * expire.
     * 
     * In response the receiver will invoke your delegate with a new content key request entreating it to renew the
     * expiring response data, via -contentKeySession:didProvideRenewingContentKeyRequest:.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("renewExpiringResponseDataForContentKeyRequest:")
    public native void renewExpiringResponseDataForContentKeyRequest(@NotNull AVContentKeyRequest contentKeyRequest);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets the receiver's delegate. A delegate is required to handle content key initialization.
     * 
     * - Parameter delegate: An object conforming to the AVContentKeySessionDelegate protocol.
     * - Parameter delegateQueue: A dispatch queue on which delegate methods will be invoked whenever processes
     * requiring content keys are executed asynchronously. Passing a value of nil for the delegateQueue parameter along
     * with a non-nil value for the delegate parameter will result in an invalid argument exception.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(@Nullable @Mapped(ObjCObjectMapper.class) AVContentKeySessionDelegate delegate,
            @Nullable dispatch_queue_t delegateQueue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The storage URL provided when the AVContentKeySession was created. May be nil.
     * 
     * URL to a writable directory; may be nil. The session will use this to facilitate expired session reports after
     * abnormal session termination.
     * 
     * API-Since: 10.3
     */
    @Nullable
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
     * Invalidates all persistable content keys associated with the application and creates a secure server playback
     * context (SPC) that the client could send to the key server to verify the outcome of invalidation request.
     * 
     * Once invalidated, persistable content keys cannot be used to answer key requests during later playback sessions.
     * 
     * - Parameter appIdentifier: An opaque identifier for the application. The contents of this identifier depend on
     * the particular protocol in use by the entity that controls the use of the media data.
     * - Parameter options: Additional information necessary to generate the server playback context, or nil if none.
     * See AVContentKeySessionServerPlaybackContextOption for supported options.
     * - Parameter handler: Once the server playback context is ready, this block will be called with the data or an
     * error describing the failure.
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("invalidateAllPersistableContentKeysForApp:options:completionHandler:")
    public native void invalidateAllPersistableContentKeysForAppOptionsCompletionHandler(@NotNull NSData appIdentifier,
            @Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler") Block_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler {
        @Generated
        void call_invalidateAllPersistableContentKeysForAppOptionsCompletionHandler(@Nullable NSData secureTokenData,
                @Nullable NSError error);
    }

    /**
     * Invalidates the persistable content key and creates a secure server playback context (SPC) that the client could
     * send to the key server to verify the outcome of invalidation request.
     * 
     * Once invalidated, a persistable content key cannot be used to answer key requests during later playback sessions.
     * 
     * - Parameter persistableContentKeyData: Persistable content key data that was previously created using
     * -[AVContentKeyRequest persistableContentKeyFromKeyVendorResponse:options:error:] or obtained via
     * AVContentKeySessionDelegate callback -contentKeySession:didUpdatePersistableContentKey:forContentKeyIdentifier:.
     * - Parameter options: Additional information necessary to generate the server playback context, or nil if none.
     * See AVContentKeySessionServerPlaybackContextOption for supported options.
     * - Parameter handler: Once the server playback context is ready, this block will be called with the data or an
     * error describing the failure.
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("invalidatePersistableContentKey:options:completionHandler:")
    public native void invalidatePersistableContentKeyOptionsCompletionHandler(
            @NotNull NSData persistableContentKeyData, @Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_invalidatePersistableContentKeyOptionsCompletionHandler") Block_invalidatePersistableContentKeyOptionsCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invalidatePersistableContentKeyOptionsCompletionHandler {
        @Generated
        void call_invalidatePersistableContentKeyOptionsCompletionHandler(@Nullable NSData secureTokenData,
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
