package apple.sensitivecontentanalysis;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * Main class for content sensitivity analysis
 * 
 * API-Since: 17.0
 */
@Generated
@Library("SensitiveContentAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCSensitivityAnalyzer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCSensitivityAnalyzer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCSensitivityAnalyzer alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SCSensitivityAnalyzer allocWithZone(VoidPtr zone);

    /**
     * Current SCSensitivityAnalysisPolicy set on device. Can be used to determine whether analysis is available or not
     */
    @Generated
    @Selector("analysisPolicy")
    @NInt
    public native long analysisPolicy();

    /**
     * Analyze sensitivity of CGImage in memory
     * 
     * @param image             CGImage reference
     * @param completionHandler Block to be called on completion (callback is called on unspecified queue)
     */
    @Generated
    @Selector("analyzeCGImage:completionHandler:")
    public native void analyzeCGImageCompletionHandler(@NotNull CGImageRef image,
            @ObjCBlock(name = "call_analyzeCGImageCompletionHandler") @NotNull Block_analyzeCGImageCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_analyzeCGImageCompletionHandler {
        @Generated
        void call_analyzeCGImageCompletionHandler(@Nullable SCSensitivityAnalysis results, @Nullable NSError error);
    }

    /**
     * Analyze sensitivity of Image File on disk (only local fileURL)
     * 
     * @param fileURL           Image file location on disk
     * @param completionHandler Block to be called on completion (callback is called on unspecified queue)
     */
    @Generated
    @Selector("analyzeImageFile:completionHandler:")
    public native void analyzeImageFileCompletionHandler(@NotNull NSURL fileURL,
            @ObjCBlock(name = "call_analyzeImageFileCompletionHandler") @NotNull Block_analyzeImageFileCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_analyzeImageFileCompletionHandler {
        @Generated
        void call_analyzeImageFileCompletionHandler(@Nullable SCSensitivityAnalysis results, @Nullable NSError error);
    }

    /**
     * Analyze sensitivity of Video File on disk.
     * 
     * @param fileURL           Video file location on disk
     * @param completionHandler Block to be called on completion (callback is called on unspecified queue)
     * @return An NSProgress instance for tracking video file analysis progress
     */
    @Generated
    @Selector("analyzeVideoFile:completionHandler:")
    @NotNull
    public native NSProgress analyzeVideoFileCompletionHandler(@NotNull NSURL fileURL,
            @ObjCBlock(name = "call_analyzeVideoFileCompletionHandler") @NotNull Block_analyzeVideoFileCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_analyzeVideoFileCompletionHandler {
        @Generated
        void call_analyzeVideoFileCompletionHandler(@Nullable SCSensitivityAnalysis results, @Nullable NSError error);
    }

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCSensitivityAnalyzer init();

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
    public static native SCSensitivityAnalyzer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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