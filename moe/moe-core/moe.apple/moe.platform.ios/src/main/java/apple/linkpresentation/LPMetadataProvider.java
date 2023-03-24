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
 * An LPMetadataProvider object retrieves metadata for a given URL.
 * 
 * An instance of LPMetadataProvider can only be asked to retrieve metadata once;
 * a new instance should be created for each request.
 * 
 * A client must have the com.apple.security.network.client entitlement
 * in order to be able to use LPMetadataProvider for remote URLs.
 * 
 * @see `LPLinkMetadata`
 * 
 *      API-Since: 13.0
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
     * Cancel a metadata request.
     * 
     * If the request had not already completed, the completion handler will be invoked
     * with the error code `LPErrorMetadataFetchCancelled`.
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
     * A boolean value indicating whether LPMetadataProvider should download secondary
     * resources specified by the metadata, like the icon, image, or video. If
     * shouldFetchSubresources is set to `NO`, the returned LPLinkMetadata object will
     * consist only of metadata retrieved from the main resource.
     * 
     * The default value is `YES`.
     */
    @Generated
    @Selector("setShouldFetchSubresources:")
    public native void setShouldFetchSubresources(boolean value);

    /**
     * The time interval after which the request will automatically fail if it has not
     * already completed.
     * 
     * If the timeout is reached, no metadata is returned; the completion handler will
     * be invoked with the error code `LPErrorMetadataFetchTimedOut`.
     * 
     * The default timeout is 30 seconds.
     */
    @Generated
    @Selector("setTimeout:")
    public native void setTimeout(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A boolean value indicating whether LPMetadataProvider should download secondary
     * resources specified by the metadata, like the icon, image, or video. If
     * shouldFetchSubresources is set to `NO`, the returned LPLinkMetadata object will
     * consist only of metadata retrieved from the main resource.
     * 
     * The default value is `YES`.
     */
    @Generated
    @Selector("shouldFetchSubresources")
    public native boolean shouldFetchSubresources();

    /**
     * Fetch metadata for the given URL.
     * 
     * The completion handler will be called on a non-main queue.
     * 
     * File URLs returned in the resultant LPLinkMetadata will be deleted
     * when the completion handler returns.
     * 
     * An exception will be thrown if this is called more than once
     * on a particular LPMetadataProvider instance.
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
     * The time interval after which the request will automatically fail if it has not
     * already completed.
     * 
     * If the timeout is reached, no metadata is returned; the completion handler will
     * be invoked with the error code `LPErrorMetadataFetchTimedOut`.
     * 
     * The default timeout is 30 seconds.
     */
    @Generated
    @Selector("timeout")
    public native double timeout();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Fetch metadata for the given NSURLRequest.
     * 
     * The completion handler will be called on a non-main queue.
     * 
     * File URLs returned in the resultant LPLinkMetadata will be deleted
     * when the completion handler returns.
     * 
     * An exception will be thrown if this is called more than once
     * on a particular LPMetadataProvider instance.
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
}
