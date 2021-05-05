package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNYOLOLoss extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNYOLOLoss(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNYOLOLoss alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("anchorBoxes")
    public native NSData anchorBoxes();

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
     * Encode a MPSCNNLoss filter and return a gradient.
     * 
     * This -encode call is similar to the encodeToCommandBuffer:sourceImage:labels:destinationImage: above,
     *             except that it creates and returns the MPSImage with the loss gradient result.
     * 
     * @param      commandBuffer       The MTLCommandBuffer on which to encode.
     * @param      sourceImage         The source image from the previous filter in the graph (in the inference direction).
     * @param      labels              The object containing the target data (labels) and optionally, weights for the labels.
     * @return     The MPSImage containing the gradient result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:labels:")
    public native MPSImage encodeToCommandBufferSourceImageLabels(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSCNNLossLabels labels);

    /**
     * Encode a MPSCNNYOLOLoss filter and return a gradient in the destinationImage.
     * 
     * This filter consumes the output of a previous layer and the MPSCNNLossLabels object containing
     *             the target data (labels) and optionally, weights for the labels.
     *             The destinationImage contains the computed gradient for the loss layer.
     *             It serves as a source gradient input image to the first gradient layer (in the backward direction).
     *             For information on the data-layout see @ref MPSCNNYOLOLossDescriptor.
     * 
     * @param      commandBuffer       The MTLCommandBuffer on which to encode.
     * @param      sourceImage         The source image from the previous filter in the graph (in the inference direction).
     * @param      labels              The object containing the target data (labels) and optionally, weights for the labels.
     * @param      destinationImage    The MPSImage into which to write the gradient result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:labels:destinationImage:")
    public native void encodeToCommandBufferSourceImageLabelsDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSCNNLossLabels labels, MPSImage destinationImage);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNYOLOLoss init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNYOLOLoss initWithCoder(NSCoder aDecoder);

    /**
     * <NSSecureCoding> support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNYOLOLoss initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNYOLOLoss initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the loss filter with a loss descriptor.
     * 
     * @param      device                   The device the filter will run on.
     * @param      lossDescriptor           The loss descriptor.
     * @return     A valid MPSCNNLoss object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:lossDescriptor:")
    public native MPSCNNYOLOLoss initWithDeviceLossDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSCNNYOLOLossDescriptor lossDescriptor);

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
     * [@property]   lossClasses
     * 
     * loss filter for prediction of bounding box predicted class of the detected object
     */
    @Generated
    @Selector("lossClasses")
    public native MPSCNNLoss lossClasses();

    /**
     * [@property]   lossConfidence
     * 
     * loss filter for prediction of bounding box probability of presence of object
     */
    @Generated
    @Selector("lossConfidence")
    public native MPSCNNLoss lossConfidence();

    /**
     * [@property]   lossWH
     * 
     * loss filter for prediction of bounding box size
     */
    @Generated
    @Selector("lossWH")
    public native MPSCNNLoss lossWH();

    /**
     * [@property]   lossXY
     * 
     * loss filter for prediction of bounding box position
     */
    @Generated
    @Selector("lossXY")
    public native MPSCNNLoss lossXY();

    @Generated
    @Selector("maxIOUForObjectAbsence")
    public native float maxIOUForObjectAbsence();

    @Generated
    @Selector("minIOUForObjectPresence")
    public native float minIOUForObjectPresence();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("numberOfAnchorBoxes")
    @NUInt
    public native long numberOfAnchorBoxes();

    @Generated
    @Selector("reductionType")
    public native int reductionType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scaleClass")
    public native float scaleClass();

    @Generated
    @Selector("scaleNoObject")
    public native float scaleNoObject();

    @Generated
    @Selector("scaleObject")
    public native float scaleObject();

    @Generated
    @Selector("scaleWH")
    public native float scaleWH();

    /**
     * See MPSCNNYOLOLossDescriptor for information about the following properties.
     */
    @Generated
    @Selector("scaleXY")
    public native float scaleXY();

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

    @Generated
    @Selector("reduceAcrossBatch")
    public native boolean reduceAcrossBatch();
}