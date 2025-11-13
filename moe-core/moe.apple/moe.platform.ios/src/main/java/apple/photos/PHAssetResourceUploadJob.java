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
 * Represents a request to upload a `PHAssetResource`
 * 
 * Used within an application's `com.apple.photos.background-upload` extension to represent a request to upload a
 * `PHAssetResource` to a destination `NSURLRequest`.
 * 
 * When the extensions principal class receives a call to `process` background uploads, it can create new
 * `PHAssetResourceUploadJob`s using `PHAssetResourceUploadJobChangeRequest` and any existing upload jobs can be fetched
 * using `fetchJobsWithAction:options:` and handled by updating their state using a
 * `PHAssetResourceUploadJobChangeRequest` to mark them as acknowledged, or to be retried. The maximum number of jobs
 * that can be a in flight is limited to the `jobLimit`.
 * 
 * API-Since: 26.1
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetResourceUploadJob extends PHObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHAssetResourceUploadJob(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHAssetResourceUploadJob alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PHAssetResourceUploadJob allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The asset resource this upload job represents.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("destination")
    @NotNull
    public native NSURLRequest destination();

    /**
     * Returns all asset resource upload jobs applicable for a given action.
     * 
     * - Parameters:
     * - action: The actions a client can take on a job.
     * - options: The fetch options to be passed in.
     * 
     * - Returns: The jobs available to apply `action` on them.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("fetchJobsWithAction:options:")
    @NotNull
    public static native PHFetchResult<? extends PHAssetResourceUploadJob> fetchJobsWithActionOptions(@NInt long action,
            @Nullable PHFetchOptions options);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHAssetResourceUploadJob init();

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

    /**
     * API-Since: 26.1
     */
    @Generated
    @Selector("jobLimit")
    @NInt
    public static native long jobLimit();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PHAssetResourceUploadJob new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The maximum number of unacknowledged upload jobs allowed, this includes registered, pending, succeeded and failed
     * jobs.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("resource")
    @NotNull
    public native PHAssetResource resource();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The destination to send this asset resource.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

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