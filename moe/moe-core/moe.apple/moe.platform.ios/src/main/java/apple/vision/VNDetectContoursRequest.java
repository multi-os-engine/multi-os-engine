package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
 * A request that will detect the countours for the edges in an image.
 * <p>
 * This request will produce a VNContoursObservation which describes the contours.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectContoursRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectContoursRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectContoursRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNDetectContoursRequest allocWithZone(VoidPtr zone);

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
     * The amount to adjust the image's contrast by.
     * A value of +1.0 means that the contrast is not adjusted. The default value is +2.0.
     * <p>
     * Countour detection works best with high contrast images. The default value of 2 doubles the image's contrast to aid in detection. If the image already has a high contrast then this value should be set to 1.
     */
    @Generated
    @Selector("contrastAdjustment")
    public native float contrastAdjustment();

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
    @Selector("detectDarkOnLight")
    public native boolean detectDarkOnLight();

    /**
     * Identifies to the request if detecting a dark object on a light background, or vice versa, to aid in detection. The default value is YES.
     */
    @Generated
    @Selector("detectsDarkOnLight")
    public native boolean detectsDarkOnLight();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNDetectContoursRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectContoursRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

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
     * The limit on the maximum dimension of the image to be used for contour detection. Valid range of values is [64 ... NSUIntegerMax]. The default value is 512.
     * <p>
     * As the contour request is compute intensive, the input image is scaled down maintaining aspect ratio (if needed), such that its maximum dimension is the value of this property. The image never gets scaled up, so specifying the maximum value ensures that the image gets processed in its original size and not downscaled.
     */
    @Generated
    @Selector("maximumImageDimension")
    @NUInt
    public native long maximumImageDimension();

    @Generated
    @Owned
    @Selector("new")
    public static native VNDetectContoursRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The amount to adjust the image's contrast by.
     * A value of +1.0 means that the contrast is not adjusted. The default value is +2.0.
     * <p>
     * Countour detection works best with high contrast images. The default value of 2 doubles the image's contrast to aid in detection. If the image already has a high contrast then this value should be set to 1.
     */
    @Generated
    @Selector("setContrastAdjustment:")
    public native void setContrastAdjustment(float value);

    @Generated
    @Selector("setDetectDarkOnLight:")
    public native void setDetectDarkOnLight(boolean value);

    /**
     * Identifies to the request if detecting a dark object on a light background, or vice versa, to aid in detection. The default value is YES.
     */
    @Generated
    @Selector("setDetectsDarkOnLight:")
    public native void setDetectsDarkOnLight(boolean value);

    /**
     * The limit on the maximum dimension of the image to be used for contour detection. Valid range of values is [64 ... NSUIntegerMax]. The default value is 512.
     * <p>
     * As the contour request is compute intensive, the input image is scaled down maintaining aspect ratio (if needed), such that its maximum dimension is the value of this property. The image never gets scaled up, so specifying the maximum value ensures that the image gets processed in its original size and not downscaled.
     */
    @Generated
    @Selector("setMaximumImageDimension:")
    public native void setMaximumImageDimension(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The pixel value to use as a pivot for the contrast. Valid values are from [0.0 ... +1.0], or nil to auto-detect based on image intensity.
     * The default value is +0.5 (i.e. pixel center).
     */
    @Generated
    @Selector("contrastPivot")
    public native NSNumber contrastPivot();

    /**
     * VNContoursObservation results.
     */
    @Generated
    @Selector("results")
    public native NSArray<? extends VNContoursObservation> results();

    /**
     * The pixel value to use as a pivot for the contrast. Valid values are from [0.0 ... +1.0], or nil to auto-detect based on image intensity.
     * The default value is +0.5 (i.e. pixel center).
     */
    @Generated
    @Selector("setContrastPivot:")
    public native void setContrastPivot(NSNumber value);
}
