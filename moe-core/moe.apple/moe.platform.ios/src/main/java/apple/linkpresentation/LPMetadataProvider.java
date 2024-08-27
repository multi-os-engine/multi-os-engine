package apple.linkpresentation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
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
 * An object that retrieves metadata for a URL.
 * 
 * Use ``LPMetadataProvider`` to fetch metadata for a URL, including its title,
 * icon, and image or video links. All properties on the resulting
 * ``LPLinkMetadata`` instance are optional.
 * 
 * - Note: To enable macOS clients to fetch metadata for remote URLs, add the
 * <doc://com.apple.documentation/documentation/bundleresources/entitlements/com_apple_security_network_client>
 * entitlement.
 * 
 * ## Fetch link metadata from a URL
 * 
 * For each metadata request, create an instance of ``LPMetadataProvider`` and
 * call ``LPMetadataProvider/startFetchingMetadataForURL:completionHandler:``.
 * 
 * In the completion handler, check the error. If your user doesn’t have a
 * network connection, the fetch can fail. If the server doesn’t respond or is
 * too slow, the fetch can time out. Alternatively, the app may cancel the
 * request, or an unknown error may occur.
 * 
 * Otherwise, use the metadata however you want, for example, to populate the
 * title for a table view cell.
 * 
 * ```swift
 * let metadataProvider = LPMetadataProvider()
 * let url = URL(string: "https://www.apple.com/ipad")!
 * 
 * metadataProvider.startFetchingMetadata(for: url) { metadata, error in
 * if error != nil {
 * // The fetch failed; handle the error.
 * return
 * }
 * 
 * // Make use of fetched metadata.
 * }
 * ```
 * 
 * For more information about handling errors, see
 * ``LinkPresentation/LPError``.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("LinkPresentation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LPMetadataProvider extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected LPMetadataProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LPMetadataProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native LPMetadataProvider allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Cancels a metadata request.
     * 
     * This method invokes the completion handler with the error code
     * ``LPErrorCode/LPErrorMetadataFetchCancelled`` if the request hasn’t already
     * completed.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native LPMetadataProvider init();

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
    public static native LPMetadataProvider new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A Boolean value indicating whether to download subresources specified by the
     * metadata.
     * 
     * Subresources include the icon, image, or video. When set to `false`, the
     * returned ``LPLinkMetadata`` object consists only of metadata retrieved from
     * the main resource identified by the url passed to
     * ``LPMetadataProvider/startFetchingMetadataForURL:completionHandler:``.
     * 
     * The default value is `true`.
     */
    @Generated
    @Selector("setShouldFetchSubresources:")
    public native void setShouldFetchSubresources(boolean value);

    /**
     * The time interval after which the request automatically fails if it hasn’t
     * already completed.
     * 
     * The default timeout interval is 30 seconds. If a metadata fetch takes longer
     * than the timeout interval, the completion handler is called with the error
     * code ``LPErrorCode/LPErrorMetadataFetchTimedOut``.
     */
    @Generated
    @Selector("setTimeout:")
    public native void setTimeout(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A Boolean value indicating whether to download subresources specified by the
     * metadata.
     * 
     * Subresources include the icon, image, or video. When set to `false`, the
     * returned ``LPLinkMetadata`` object consists only of metadata retrieved from
     * the main resource identified by the url passed to
     * ``LPMetadataProvider/startFetchingMetadataForURL:completionHandler:``.
     * 
     * The default value is `true`.
     */
    @Generated
    @Selector("shouldFetchSubresources")
    public native boolean shouldFetchSubresources();

    /**
     * Fetches metadata for the given URL.
     * 
     * Call this method once per ``LPMetadataProvider`` instance. If you attempt to
     * fetch metadata multiple times on a single ``LPMetadataProvider`` instance,
     * it throws an error.
     * 
     * The completion handler executes on a background queue. Dispatch any
     * necessary UI updates back to the main queue. When the completion handler
     * returns, it deletes any file URLs returned in the resulting
     * ``LPLinkMetadata``.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func startFetchingMetadata(for url: URL) async throws -> LPLinkMetadata
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     */
    @Generated
    @Selector("startFetchingMetadataForURL:completionHandler:")
    public native void startFetchingMetadataForURLCompletionHandler(@NotNull NSURL URL,
            @NotNull @ObjCBlock(name = "call_startFetchingMetadataForURLCompletionHandler") Block_startFetchingMetadataForURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startFetchingMetadataForURLCompletionHandler {
        @Generated
        void call_startFetchingMetadataForURLCompletionHandler(@Nullable LPLinkMetadata metadata,
                @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The time interval after which the request automatically fails if it hasn’t
     * already completed.
     * 
     * The default timeout interval is 30 seconds. If a metadata fetch takes longer
     * than the timeout interval, the completion handler is called with the error
     * code ``LPErrorCode/LPErrorMetadataFetchTimedOut``.
     */
    @Generated
    @Selector("timeout")
    public native double timeout();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Fetches metadata for the given ``NSURLRequest``.
     * 
     * Call this method once per ``LPMetadataProvider`` instance. If you attempt to
     * fetch metadata multiple times on a single ``LPMetadataProvider`` instance,
     * it throws an error.
     * 
     * The completion handler executes on a background queue. Dispatch any
     * necessary UI updates back to the main queue. When the completion handler
     * returns, it deletes any file URLs returned in the resulting
     * ``LPLinkMetadata``.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func startFetchingMetadata(for request: URLRequest) async throws -> LPLinkMetadata
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("startFetchingMetadataForRequest:completionHandler:")
    public native void startFetchingMetadataForRequestCompletionHandler(@NotNull NSURLRequest request,
            @NotNull @ObjCBlock(name = "call_startFetchingMetadataForRequestCompletionHandler") Block_startFetchingMetadataForRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startFetchingMetadataForRequestCompletionHandler {
        @Generated
        void call_startFetchingMetadataForRequestCompletionHandler(@Nullable LPLinkMetadata metadata,
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
