package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSImageCanny
 * 
 * The MPSImageCanny implements the Canny edge detection algorithm.
 * When the color model of the source and destination textures match, the
 * filter is applied to each channel seperately. If the destination is monochrome
 * but source multichannel, the source will be converted to grayscale using the
 * linear gray color transform vector (v).
 * Luminance = v[0] * pixel.x + v[1] * pixel.y + v[2] * pixel.z;
 * 
 * The canny edge detection algorithm consists of 5 steps:
 * 1. Blur the source image using a Gaussian blur with a sigma parameter
 * 2. Use horizontal and vertical Sobel filters to find a gradient magnitude and
 * direction.
 * G = sqrt(Sx^2 + Sy^2)
 * G_ang = arctan(Sy / Sx)
 * 3. Perform non-maximum suppression to thin edges to single pixel widths.
 * A pixel is considered to be a maxium along the edge if it has the largest
 * gradient magnitude along the positive and negatve gradient direction. That
 * is, if the gradient direction is 90°, if the gradient magnitude of a pixel is
 * greater than its neighbors at -90° and 90° it is the maximum. Any pixel
 * which is not a maximum will have its value suppressed, by setting it's
 * magnitude to 0.
 * 4. Double thresholding is preformed with two values ht and lt with ht > lt
 * to classify a pixel as part of a weak or strong edge. A pixel with gradient
 * value G is classified as:
 * Strong edge: G > ht
 * Weak edge: ht >= G > lt
 * Not an edge: lt >= G
 * 5. Edge tracking is performed along all weak edges to determine if they
 * are part of a strong edge. Any weak edges which are connected to a
 * strong edge are labelled true edges, along with strong edges themselves.
 * A pixel can be connected through any of its 8 neighbors. Any pixel marked
 * as a true edge is output with a high value, and all others are considered
 * background and output with a low value.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageCanny extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageCanny(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageCanny alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageCanny allocWithZone(VoidPtr zone);

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

    /**
     * [@property] colorTransform
     * 
     * Returns a pointer to the array of three floats used to convert RGBA, RGB or RG images
     * to the destination format when the destination is monochrome.
     * Value is readonly and user should not modify or free.
     */
    @NotNull
    @Generated
    @Selector("colorTransform")
    public native ConstFloatPtr colorTransform();

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

    /**
     * [@property] highThreshold
     * 
     * Read-write value used to set the high threshold for double thresholding, value is normalized.
     * Default is 0.4
     */
    @Generated
    @Selector("highThreshold")
    public native float highThreshold();

    @Generated
    @Selector("init")
    public native MPSImageCanny init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageCanny initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageCanny initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a Canny filter on a given device using the default color
     * transform and default sigma value for Gaussian blur.
     * Default transform: BT.601/JPEG {0.299f, 0.587f, 0.114f}
     * Default sigma: sqrt(2)
     * 
     * For non-default parameters, use
     * -initWithDevice:linearGrayColorTransform:sigma:
     * 
     * @param device The device the filter will run on
     * @return A valid object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSImageCanny initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a Canny filter on a given device with a non-default color transform and
     * non-default sigma.
     * [@code]
     * Luminance = transform[0] * pixel.x +
     * transform[1] * pixel.y +
     * transform[2] * pixel.z;
     * [@endcode]
     * [@code]
     * w(i) = 1/sqrt(2*pi*sigma) * exp(-n^2/2*sigma^2)
     * [@endcode]
     * If we take cut off at 1% of w(0) (max weight) beyond which weights
     * are considered 0, we have
     * [@code]
     * ceil (sqrt(-log(0.01)*2)*sigma) ~ ceil(3.7*sigma)
     * [@endcode]
     * as rough estimate of filter width
     * 
     * @param device    The device the filter will run on
     * @param transform Array of three floats describing the rgb to gray scale color transform.
     * @param sigma     The standard deviation of gaussian blur filter.
     *                  Gaussian weight, centered at 0, at integer grid n is given as
     * @return A valid object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:linearToGrayScaleTransform:sigma:")
    public native MPSImageCanny initWithDeviceLinearToGrayScaleTransformSigma(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull ConstFloatPtr transform, float sigma);

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

    /**
     * [@property] lowThreshold
     * 
     * Read-write value used to set the low threshold for double thresholding, value is normalized.
     * Default is 0.2
     */
    @Generated
    @Selector("lowThreshold")
    public native float lowThreshold();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSImageCanny new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] highThreshold
     * 
     * Read-write value used to set the high threshold for double thresholding, value is normalized.
     * Default is 0.4
     */
    @Generated
    @Selector("setHighThreshold:")
    public native void setHighThreshold(float value);

    /**
     * [@property] lowThreshold
     * 
     * Read-write value used to set the low threshold for double thresholding, value is normalized.
     * Default is 0.2
     */
    @Generated
    @Selector("setLowThreshold:")
    public native void setLowThreshold(float value);

    /**
     * [@property] useFastMode
     * 
     * Read-write value used to change algorithm to an approximation of the true Canny Edge detection Algorithm.
     * When true, a limit is placed on how far a single strong edge can extend. The result will be similar to a true
     * output
     * but some edges may terminate early, resulting in minor differences for cases with long, weak edges. The
     * performance
     * for the approximate canny implementation is improved and should provide similar enough results for most cases.
     * Extra tuning of the high and low thresholds as well as sigma may help achieve a more similar output in this mode.
     * Default is YES
     */
    @Generated
    @Selector("setUseFastMode:")
    public native void setUseFastMode(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sigma
     * 
     * Read-only sigma value used in performing Gaussian blur of the image
     */
    @Generated
    @Selector("sigma")
    public native float sigma();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] useFastMode
     * 
     * Read-write value used to change algorithm to an approximation of the true Canny Edge detection Algorithm.
     * When true, a limit is placed on how far a single strong edge can extend. The result will be similar to a true
     * output
     * but some edges may terminate early, resulting in minor differences for cases with long, weak edges. The
     * performance
     * for the approximate canny implementation is improved and should provide similar enough results for most cases.
     * Extra tuning of the high and low thresholds as well as sigma may help achieve a more similar output in this mode.
     * Default is YES
     */
    @Generated
    @Selector("useFastMode")
    public native boolean useFastMode();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
