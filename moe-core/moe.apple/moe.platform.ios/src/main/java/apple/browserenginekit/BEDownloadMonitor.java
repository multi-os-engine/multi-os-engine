package apple.browserenginekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUUID;
import apple.uniformtypeidentifiers.UTType;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.2
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BEDownloadMonitor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BEDownloadMonitor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BEDownloadMonitor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BEDownloadMonitor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("beginMonitoring:")
    public native void beginMonitoring(
            @ObjCBlock(name = "call_beginMonitoring") @NotNull Block_beginMonitoring completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginMonitoring {
        @Generated
        void call_beginMonitoring(@Nullable BEDownloadMonitorLocation placeholderLocation, @Nullable NSError error);
    }

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

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("createAccessToken")
    @Nullable
    public static native NSData createAccessToken();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("destinationURL")
    @NotNull
    public native NSURL destinationURL();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native NSUUID identifier();

    @Generated
    @Selector("init")
    public native BEDownloadMonitor init();

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("initWithSourceURL:destinationURL:observedProgress:liveActivityAccessToken:")
    public native BEDownloadMonitor initWithSourceURLDestinationURLObservedProgressLiveActivityAccessToken(
            @NotNull NSURL sourceURL, @NotNull NSURL destinationURL, @NotNull NSProgress observedProgress,
            @NotNull NSData liveActivityAccessToken);

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
    public static native BEDownloadMonitor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("resumeMonitoring:completionHandler:")
    public native void resumeMonitoringCompletionHandler(@NotNull NSURL url,
            @ObjCBlock(name = "call_resumeMonitoringCompletionHandler") @NotNull Block_resumeMonitoringCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeMonitoringCompletionHandler {
        @Generated
        void call_resumeMonitoringCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("sourceURL")
    @NotNull
    public native NSURL sourceURL();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("useDownloadsFolderWithPlaceholderType:finalFileCreatedHandler:")
    public native void useDownloadsFolderWithPlaceholderTypeFinalFileCreatedHandler(@Nullable UTType type,
            @ObjCBlock(name = "call_useDownloadsFolderWithPlaceholderTypeFinalFileCreatedHandler") @NotNull Block_useDownloadsFolderWithPlaceholderTypeFinalFileCreatedHandler finalFileCreatedHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_useDownloadsFolderWithPlaceholderTypeFinalFileCreatedHandler {
        @Generated
        void call_useDownloadsFolderWithPlaceholderTypeFinalFileCreatedHandler(
                @Nullable BEDownloadMonitorLocation finalLocation);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}