package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.struct.MPSImageCoordinate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class      MPSNNPad
 * @dependency This depends on Metal.framework
 * @abstract   Describes a padding operation
 * @discussion You should not use this filter to zero pad your data in the XY-plane.
 *             This filter achieves padding by copying the input image and therefore should only be used in
 *             special circumstances where the normal padding operation, defined for most filters through
 *             @ref MPSNNPadding, cannot achieve the necessary padding. Therefore use this filter only when
 *             you need one of the special edge modes: @ref MPSImageEdgeModeConstant,
 *             @ref MPSImageEdgeModeMirror, @ref MPSImageEdgeModeMirrorWithEdge or, if you need padding in the
 *             feature-channel dimesion.  In other cases use to @ref MPSNNPadding for best performance.
 *             This kernel copies data from source MPSImage into the destination MPSImage allowing special padding
 *             modes to be applied. It also enables easy to use arbitrary padding area sizes when used in conjuction
 *             with @ref destinationImageDescriptorForSourceImages:sourceStates: function.
 *             There are two main ways to control the amount of padding to be added in 'x' and 'y' image dimensions:
 *                 - The first one involves passing in an existing MPSImage as the destination image
 *             to the @ref MPSCNNKernel encode call, in which case the padding size in (x,y) plane
 *             is defined by the user-specified @ref clipRect and @ref offset properties of the kernel.
 *                 - In the second one the destination image size and @ref clipRect and @ref offset
 *             properties of the kernel are automatically computed by calling
 *             @ref destinationImageDescriptorForSourceImages:sourceStates: or the -encode calls that return the
 *             resulting image from the left hand side of the call. In this case, the properties
 *             @ref paddingSizeBefore and @ref paddingSizeAfter together with the source image
 *             dimensions define the size of the destination image and set the correct @ref offset
 *             and @ref clipRect properties to the filter.
 *             Padding in the feature channel dimension is handled a bit differently: the amount of
 *             padding is always determined by @ref paddingSizeBefore.channel and
 *             @ref paddingSizeAfter.channel for this direction and the amount of feature channels
 *             filled in the destination is determined by the number of active feature channels
 *             determined by @ref sourceFeatureChannelOffset and @ref sourceFeatureChannelMaxCount and
 *             the amount of padding to be added on each side of the source.
 * 
 *             Example for feature channel indices:
 * @code
 *                 paddingSizeBefore.channel = 2, paddingSizeAfter.channel = 3,
 *                 sourceFeatureChannelOffset = 1, sourceFeatureChannelMaxCount = 3,
 *                 destinationFeatureChannelOffset = 4.
 *                 We get the following padding operation:
 * 
 *             Source:
 *               |-----------------------------|
 *               | x0 | x1 | x2 | x3 | x4 | x5 |
 *               |-----------------------------|
 *             Destination:
 *               |----------------------------------------------------------------|
 *               | -  | -  | -  | -  | 0  | 0  | x1 | x2 | x3 | 0  | 0  | 0  | -  |
 *               |----------------------------------------------------------------|
 * 
 *             And with @ref edgeMode = MPSImageEdgeModeMirrorWithEdge:
 * 
 *             Source:
 *               |-----------------------------|
 *               | x0 | x1 | x2 | x3 | x4 | x5 |
 *               |-----------------------------|
 *             Destination:
 *               |----------------------------------------------------------------|
 *               | -  | -  | -  | -  | x2 | x1 | x1 | x2 | x3 | x3 | x2 | x1 | -  |
 *               |----------------------------------------------------------------|
 * 
 *             Here the symbols '-' denote pixels not written by the kernel.
 * 
 *             NOTE:   The 'channel' coordinate and size in sourceRegion can be
 *                     set to other values than those with multiple of four channels,
 *                     but the @ref destinationFeatureChannelOffset property must be multiple of
 *                     four, which means that there are some limitations to what can be achieved
 *                     with this filter alone.
 * 
 * @endcode
 *             @NOTE:  MPSNNPad is currently the only filter that supports
 *                     @ref MPSImageEdgeModeMirror, @ref MPSImageEdgeModeMirrorWithEdge and
 *                     @ref MPSImageEdgeModeConstant.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNPad extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNPad(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNPad alloc();

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

    /**
     * @property   fillValue
     * @abstract   Determines the constant value to apply when using @ref MPSImageEdgeModeConstant. Default: 0.0f.
     *             NOTE: this value is ignored if the filter is initialized with a per-channel fill value
     *             using @ref initWithDevice:paddingSizeBefore:paddingSizeAfter:fillValueArray:.
     */
    @Generated
    @Selector("fillValue")
    public native float fillValue();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNPad init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNPad initWithCoder(NSCoder aDecoder);

    /**
     * @abstract   NSSecureCoding compatability
     * @discussion See @ref MPSKernel#initWithCoder.
     * @param      aDecoder    The NSCoder subclass with your serialized MPSNNPad
     * @param      device      The MTLDevice on which to make the MPSNNPad
     * @return     A new MPSNNPad object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNPad initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * @abstract Initialize a MPSNNPad kernel
     * @param      device      The device the filter will run on.
     * @return     A valid MPSNNPad object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNNPad initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * @abstract Initialize a MPSNNPad kernel
     * @param      device              The device the filter will run on
     * @param      paddingSizeBefore   The amount of padding to add before the source image - see details above.
     * @param      paddingSizeAfter    The amount of padding to add after the source image - see details above.
     * @return     A valid MPSNNPad object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:paddingSizeBefore:paddingSizeAfter:")
    public native MPSNNPad initWithDevicePaddingSizeBeforePaddingSizeAfter(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @ByValue MPSImageCoordinate paddingSizeBefore,
            @ByValue MPSImageCoordinate paddingSizeAfter);

    /**
     * @abstract Initialize a MPSNNPad kernel
     * @param      device              The device the filter will run on
     * @param      paddingSizeBefore   The amount of padding to add before the source image - see details above.
     * @param      paddingSizeAfter    The amount of padding to add after the source image - see details above.
     * @param      fillValueArray      A NSData containing a float array to use with @ref MPSImageEdgeModeConstant.
     *                                 The first value of the array will correspond to the first feature channel
     *                                 written out to the destination image and the number of float values in the
     *                                 data must be at least as large as the number of feature channels written onto
     *                                 the destination by the filter. Failing to pass a large enough array will
     *                                 result in undefined behavior. Passing in nil is fine.
     * @return     A valid MPSNNPad object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:paddingSizeBefore:paddingSizeAfter:fillValueArray:")
    public native MPSNNPad initWithDevicePaddingSizeBeforePaddingSizeAfterFillValueArray(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @ByValue MPSImageCoordinate paddingSizeBefore,
            @ByValue MPSImageCoordinate paddingSizeAfter, NSData fillValueArray);

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

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @property   paddingSizeAfter
     * @abstract   This property is used for automatically sizing the destination image
     *             for the function @ref destinationImageDescriptorForSourceImages:sourceStates:. Defines
     *             how much padding to assign on the right, bottom and higher feature channel indices
     *             of the image. NOTE: the x and y coordinates of this property are only
     *             used through @ref destinationImageDescriptorForSourceImages:sourceStates:, since
     *             the clipRect and offset together define the padding sizes in those directions, but
     *             the 'channel' size defines the amount of padding to be applied in the feature
     *             channel dimension after source feature channel index determined by the sum of
     *             @ref sourceFeatureChannelOffset and @ref sourceFeatureChannelMaxCount, naturally
     *             clipped to fit the feature channels in the provided source image.
     *             Default: { 0, 0, 0 }
     */
    @Generated
    @Selector("paddingSizeAfter")
    @ByValue
    public native MPSImageCoordinate paddingSizeAfter();

    /**
     * @property   paddingSizeBefore
     * @abstract   This property is used for automatically sizing the destination image
     *             for the function @ref destinationImageDescriptorForSourceImages:sourceStates:. Defines
     *             how much padding to assign on the left, top and smaller feature channel indices
     *             of the image. NOTE: the x and y coordinates of this property are only
     *             used through @ref destinationImageDescriptorForSourceImages:sourceStates:, since
     *             the clipRect and offset together define the padding sizes in those directions, but
     *             the 'channel' size defines the amount of padding to be applied in the feature
     *             channel dimension, before the feature channels starting from feature channel
     *             index @ref sourceFeatureChannelOffset.
     *             Default: { 0, 0, 0 }
     */
    @Generated
    @Selector("paddingSizeBefore")
    @ByValue
    public native MPSImageCoordinate paddingSizeBefore();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @property   fillValue
     * @abstract   Determines the constant value to apply when using @ref MPSImageEdgeModeConstant. Default: 0.0f.
     *             NOTE: this value is ignored if the filter is initialized with a per-channel fill value
     *             using @ref initWithDevice:paddingSizeBefore:paddingSizeAfter:fillValueArray:.
     */
    @Generated
    @Selector("setFillValue:")
    public native void setFillValue(float value);

    /**
     * @property   paddingSizeAfter
     * @abstract   This property is used for automatically sizing the destination image
     *             for the function @ref destinationImageDescriptorForSourceImages:sourceStates:. Defines
     *             how much padding to assign on the right, bottom and higher feature channel indices
     *             of the image. NOTE: the x and y coordinates of this property are only
     *             used through @ref destinationImageDescriptorForSourceImages:sourceStates:, since
     *             the clipRect and offset together define the padding sizes in those directions, but
     *             the 'channel' size defines the amount of padding to be applied in the feature
     *             channel dimension after source feature channel index determined by the sum of
     *             @ref sourceFeatureChannelOffset and @ref sourceFeatureChannelMaxCount, naturally
     *             clipped to fit the feature channels in the provided source image.
     *             Default: { 0, 0, 0 }
     */
    @Generated
    @Selector("setPaddingSizeAfter:")
    public native void setPaddingSizeAfter(@ByValue MPSImageCoordinate value);

    /**
     * @property   paddingSizeBefore
     * @abstract   This property is used for automatically sizing the destination image
     *             for the function @ref destinationImageDescriptorForSourceImages:sourceStates:. Defines
     *             how much padding to assign on the left, top and smaller feature channel indices
     *             of the image. NOTE: the x and y coordinates of this property are only
     *             used through @ref destinationImageDescriptorForSourceImages:sourceStates:, since
     *             the clipRect and offset together define the padding sizes in those directions, but
     *             the 'channel' size defines the amount of padding to be applied in the feature
     *             channel dimension, before the feature channels starting from feature channel
     *             index @ref sourceFeatureChannelOffset.
     *             Default: { 0, 0, 0 }
     */
    @Generated
    @Selector("setPaddingSizeBefore:")
    public native void setPaddingSizeBefore(@ByValue MPSImageCoordinate value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}