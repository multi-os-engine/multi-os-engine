package apple.backgroundassets;

import apple.NSObject;
import apple.backgroundassets.protocol.BADownloadManagerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.1
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BADownloadManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BADownloadManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BADownloadManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BADownloadManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Cancels a download.
     * 
     * Attempts to cancel a BADownload. If the download has not been schduled or has already completed, NO is returned
     * along with a NSError set
     * to BAErrorDomain : BAErrorCodeDownloadNotScheduled.
     * 
     * @return YES if the download is canceled. NO if the download could not be canceled, @c error will be set with a
     *         reason why.
     * 
     *         API-Since: 16.1
     */
    @Generated
    @Selector("cancelDownload:error:")
    public native boolean cancelDownloadError(@NotNull BADownload download,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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

    /**
     * A object confroming to BADownloadManagerDelegate to get notified when actions occur.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native BADownloadManagerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Fetches current downloads.
     * 
     * Fetches the current list of scheduled or in-flight downloads queued by your application or extension.
     * [@warning] This method can block and should not be called from the main thread.
     * 
     * @param error An error representing why the downloads could not be fetched.
     * @return On success, returns a list of scheduled or in-flight downloads. On failure, returns nil and sets @c
     *         error.
     * @see BADownloadManager:fetchCurrentDownloadsWithCompletionHandler
     * 
     *      API-Since: 16.4
     */
    @Generated
    @Selector("fetchCurrentDownloads:")
    @Nullable
    public native NSArray<? extends BADownload> fetchCurrentDownloads(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Fetches current downloads.
     * 
     * Fetches the current list of scheduled or in-flight downloads queued by your application or extension.
     * 
     * @param completionHandler A block to recieve the currently scheduled or in-flight downloads. The block is called
     *                          on the same queue as all the other completion blocks in the class.
     * 
     *                          API-Since: 16.1
     */
    @Generated
    @Selector("fetchCurrentDownloadsWithCompletionHandler:")
    public native void fetchCurrentDownloadsWithCompletionHandler(
            @ObjCBlock(name = "call_fetchCurrentDownloadsWithCompletionHandler") @NotNull Block_fetchCurrentDownloadsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchCurrentDownloadsWithCompletionHandler {
        @Generated
        void call_fetchCurrentDownloadsWithCompletionHandler(@NotNull NSArray<? extends BADownload> downloads,
                @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native BADownloadManager init();

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
    public static native BADownloadManager new_objc();

    /**
     * Acquires exclusive access to the BADownloadManager across the app and application extension.
     * 
     * Acquires exclusive access to the BADownloadManager across the app and application extension. This ensures that
     * your extension and app
     * do not perform operations at the same time. Both the extension and app must use this API to ensure exclusive
     * access.
     * 
     * @param performHandler A block that will be executed once exclusive control is acquired.
     *                       If an error is non-nil then a problem occurred acquiring exclusive access.
     * 
     *                       API-Since: 16.1
     */
    @Generated
    @Selector("performWithExclusiveControl:")
    public native void performWithExclusiveControl(
            @ObjCBlock(name = "call_performWithExclusiveControl") @NotNull Block_performWithExclusiveControl performHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performWithExclusiveControl {
        @Generated
        void call_performWithExclusiveControl(boolean acquiredLock, @Nullable NSError error);
    }

    /**
     * Acquires exclusive access to the BADownloadManager across the app and application extension.
     * 
     * Acquires exclusive access to the BADownloadManager across the app and application extension. This ensures that
     * your extension and app
     * do not perform operations at the same time. Both the extension and app must use this API to ensure exclusive
     * access.
     * 
     * @param date           A date by which you want exclusive control acquired. If you pass +[NSDate date], control
     *                       will attempt to be acquired and if it can not be, it will fail instantly.
     * @param performHandler A block that will be executed once exclusive control is acquired.
     *                       If an error is non-nil then a problem occurred acquiring exclusive access.
     * 
     *                       API-Since: 16.1
     */
    @Generated
    @Selector("performWithExclusiveControlBeforeDate:performHandler:")
    public native void performWithExclusiveControlBeforeDatePerformHandler(@NotNull NSDate date,
            @ObjCBlock(name = "call_performWithExclusiveControlBeforeDatePerformHandler") @NotNull Block_performWithExclusiveControlBeforeDatePerformHandler performHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performWithExclusiveControlBeforeDatePerformHandler {
        @Generated
        void call_performWithExclusiveControlBeforeDatePerformHandler(boolean acquiredLock, @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Schedules a background download.
     * 
     * Specifies a download to schedule at a given priority. The download will automatically
     * start at the discretion of the system.
     * 
     * @param download A BADownload object representing a URL to be downloaded.
     * @param error    A NSError representing why the BADownload could not be scheduled.
     * @return YES if @c download was scheduled. NO and @c error set if the download could not be scheduled.
     * 
     *         API-Since: 16.1
     */
    @Generated
    @Selector("scheduleDownload:error:")
    public native boolean scheduleDownloadError(@NotNull BADownload download,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * A object confroming to BADownloadManagerDelegate to get notified when actions occur.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable BADownloadManagerDelegate value);

    /**
     * A object confroming to BADownloadManagerDelegate to get notified when actions occur.
     * 
     * API-Since: 16.1
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable BADownloadManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Gets the singleton downloader object.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("sharedManager")
    @NotNull
    public static native BADownloadManager sharedManager();

    /**
     * Attempts to schedule a BADownload in foreground mode.
     * 
     * Attempts to schedule a BADownload in foreground mode. This download will start (if it has not been started)
     * immediately regrardlesss of battery or
     * network status. The download will remain in this foreground until the download manager is disconnected. This API
     * only functions if the download manager is created in
     * the application and not the download extension. If this API is called from the download extension, NO will be
     * returned along with a NSError with the settings
     * BAErrorDomain : BAErrorCodeCallFromExtensionNotAllowed. If this API is called from a app while it is in the
     * background, NO will be returned along with a NSError
     * with the settings BAErrorDomain : BAErrorCodeCallFromInactiveProcessNotAllowed.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("startForegroundDownload:error:")
    public native boolean startForegroundDownloadError(@NotNull BADownload download,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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