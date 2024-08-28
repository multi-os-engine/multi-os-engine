package apple.vision;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * Performs person segmentation on an image generating a mask.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNGeneratePersonSegmentationRequest extends VNStatefulRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNGeneratePersonSegmentationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNGeneratePersonSegmentationRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNGeneratePersonSegmentationRequest allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNGeneratePersonSegmentationRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNGeneratePersonSegmentationRequest initWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_initWithCompletionHandler") Block_initWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCompletionHandler {
        @Generated
        void call_initWithCompletionHandler(@NotNull VNRequest request, @Nullable NSError error);
    }

    @Generated
    @Selector("initWithFrameAnalysisSpacing:completionHandler:")
    public native VNGeneratePersonSegmentationRequest initWithFrameAnalysisSpacingCompletionHandler(
            @ByValue CMTime frameAnalysisSpacing,
            @Nullable @ObjCBlock(name = "call_initWithFrameAnalysisSpacingCompletionHandler") VNStatefulRequest.Block_initWithFrameAnalysisSpacingCompletionHandler completionHandler);

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
    public static native VNGeneratePersonSegmentationRequest new_objc();

    /**
     * Pixel format type of the output buffer. Valid values are kCVPixelFormatType_OneComponent32Float,
     * kCVPixelFormatType_OneComponent16Half, and kCVPixelFormatType_OneComponent8. Default is
     * kCVPixelFormatType_OneComponent8.
     */
    @Generated
    @Selector("outputPixelFormat")
    public native int outputPixelFormat();

    /**
     * The quality level selects which techniques will be used during the person segmentation. There are trade-offs
     * between performance and accuracy.
     */
    @Generated
    @Selector("qualityLevel")
    @NUInt
    public native long qualityLevel();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("results")
    public native NSArray<? extends VNPixelBufferObservation> results();

    /**
     * Pixel format type of the output buffer. Valid values are kCVPixelFormatType_OneComponent32Float,
     * kCVPixelFormatType_OneComponent16Half, and kCVPixelFormatType_OneComponent8. Default is
     * kCVPixelFormatType_OneComponent8.
     */
    @Generated
    @Selector("setOutputPixelFormat:")
    public native void setOutputPixelFormat(int value);

    /**
     * The quality level selects which techniques will be used during the person segmentation. There are trade-offs
     * between performance and accuracy.
     */
    @Generated
    @Selector("setQualityLevel:")
    public native void setQualityLevel(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
