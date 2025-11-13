package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURLRequest;
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
 * Used within an application's `com.apple.photos.background-upload` extension to create and manage
 * `PHAssetResourceUploadJob` records
 * 
 * When the extensions principal class receives a call to `process` background uploads, it can create new
 * `PHAssetResourceUploadJob`s through calls to perform changes on a PHPhotoLibrary using
 * `PHAssetResourceUploadJobChangeRequest` and any in-flight upload jobs can be handled by updating their state to mark
 * them as acknowledged, or to be retried. The maximum number of jobs that can be in flight is limited to the
 * `PHAssetResourceUploadJob.jobLimit`.
 * 
 * `PHAssetResourceUploadJobChangeRequest` can only be created or used within a photo library change block. For details
 * on change blocks, see `PHPhotoLibrary`.
 * 
 * API-Since: 26.1
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetResourceUploadJobChangeRequest extends PHChangeRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected PHAssetResourceUploadJobChangeRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Acknowledges a successful or failed job. Jobs must be acknowledged to free up space for `jobLimit`.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("acknowledge")
    public native void acknowledge();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHAssetResourceUploadJobChangeRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PHAssetResourceUploadJobChangeRequest allocWithZone(VoidPtr zone);

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

    /**
     * Creates a request for modifying the specified upload job.
     * 
     * - Parameter job: a job to be modified.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("changeRequestForUploadJob:")
    public static native PHAssetResourceUploadJobChangeRequest changeRequestForUploadJob(
            @NotNull PHAssetResourceUploadJob job);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Used to create an asset resource upload job.
     * 
     * If the number of jobs exceeds `jobLimit`the photo library `performChanges` request will fail with a
     * `PHPhotosErrorLimitExceeded` error.
     * If you want to generate jobs after this limit is triggered, you must acknowledge succeeded and failed jobs, and
     * wait for the registered/pending ones to be uploaded.
     * 
     * - Parameter:
     * - destination: the destination `NSURLRequest` to which this asset resource will be sent.
     * - resource: the asset resource to be uploaded.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("createJobWithDestination:resource:")
    public static native void createJobWithDestinationResource(@NotNull NSURLRequest destination,
            @NotNull PHAssetResource resource);

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
    public native PHAssetResourceUploadJobChangeRequest init();

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
    public static native PHAssetResourceUploadJobChangeRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Retries a job that is failed, unacknowledged, and has not been retried before. Successful retries also free up
     * space for `jobLimit`.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("retryWithDestination:")
    public native void retryWithDestination(@Nullable NSURLRequest destination);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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