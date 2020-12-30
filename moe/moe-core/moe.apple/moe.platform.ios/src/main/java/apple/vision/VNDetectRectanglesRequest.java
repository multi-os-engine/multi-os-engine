package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * @brief A request that will detect rectangles in an image.
 * 
 * @details This request will generate VNRectangleObservation objects describing the location of rectangles detected in an image.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectRectanglesRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectRectanglesRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectRectanglesRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    public native VNDetectRectanglesRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectRectanglesRequest initWithCompletionHandler(
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
     * @brief Specifies the maximum aspect ratio of the rectangle(s) to look for, range [0.0, 1.0], default 1.0
     */
    @Generated
    @Selector("maximumAspectRatio")
    public native float maximumAspectRatio();

    /**
     * @brief Specifies the maximum number of rectangles to be returned.  The default is 1.  Setting this property to 0 will allow an unlimited number of observations to be returned.
     */
    @Generated
    @Selector("maximumObservations")
    @NUInt
    public native long maximumObservations();

    /**
     * @brief Specifies the minimum aspect ratio of the rectangle(s) to look for, range [0.0, 1.0], default 0.5
     */
    @Generated
    @Selector("minimumAspectRatio")
    public native float minimumAspectRatio();

    /**
     * @brief Specifies a minimum confidence score, range [0.0, 1.0], default 0.0. Any rectangles with a lower confidence score will not be returned.
     */
    @Generated
    @Selector("minimumConfidence")
    public native float minimumConfidence();

    /**
     * @brief Specifies the minimum size of the rectangle to be detected, as a proportion of the smallest dimension, range [0.0, 1.0], default .2. Any smaller rectangles that may have been detected will not be returned. 
     */
    @Generated
    @Selector("minimumSize")
    public native float minimumSize();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @brief Specifies the maximum number of degrees a rectangle corner angle can deviate from 90 degrees, range [0,45], default 30
     */
    @Generated
    @Selector("quadratureTolerance")
    public native float quadratureTolerance();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @brief Specifies the maximum aspect ratio of the rectangle(s) to look for, range [0.0, 1.0], default 1.0
     */
    @Generated
    @Selector("setMaximumAspectRatio:")
    public native void setMaximumAspectRatio(float value);

    /**
     * @brief Specifies the maximum number of rectangles to be returned.  The default is 1.  Setting this property to 0 will allow an unlimited number of observations to be returned.
     */
    @Generated
    @Selector("setMaximumObservations:")
    public native void setMaximumObservations(@NUInt long value);

    /**
     * @brief Specifies the minimum aspect ratio of the rectangle(s) to look for, range [0.0, 1.0], default 0.5
     */
    @Generated
    @Selector("setMinimumAspectRatio:")
    public native void setMinimumAspectRatio(float value);

    /**
     * @brief Specifies a minimum confidence score, range [0.0, 1.0], default 0.0. Any rectangles with a lower confidence score will not be returned.
     */
    @Generated
    @Selector("setMinimumConfidence:")
    public native void setMinimumConfidence(float value);

    /**
     * @brief Specifies the minimum size of the rectangle to be detected, as a proportion of the smallest dimension, range [0.0, 1.0], default .2. Any smaller rectangles that may have been detected will not be returned. 
     */
    @Generated
    @Selector("setMinimumSize:")
    public native void setMinimumSize(float value);

    /**
     * @brief Specifies the maximum number of degrees a rectangle corner angle can deviate from 90 degrees, range [0,45], default 30
     */
    @Generated
    @Selector("setQuadratureTolerance:")
    public native void setQuadratureTolerance(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();
}