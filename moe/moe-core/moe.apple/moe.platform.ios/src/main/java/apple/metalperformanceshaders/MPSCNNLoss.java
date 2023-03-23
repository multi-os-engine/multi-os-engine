package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
 * MPSCNNLoss
 * [@dependency] This depends on Metal.framework.
 * 
 * The MPSCNNLoss filter is only used for training. This filter performs both the forward and
 * backward pass computations. Specifically, it computes the loss between the input (predictions)
 * and target data (labels) and the loss gradient. The loss value can be a 1 x 1 x 1 image containing
 * a scalar loss value or an image (of the same size as the input source image) with per feature
 * channel losses. The loss value is used to determine whether to continue the training operation or
 * to terminate it, once satisfactory results are achieved. The loss gradient is the first gradient
 * computed for the backward pass and serves as input to the next gradient filter (in the backward
 * direction).
 * 
 * The MPSCNNLoss filter is created with a MPSCNNLossDescriptor describing the type of a loss filter
 * and the type of a reduction to use for computing the overall loss.
 * 
 * The MPSCNNLoss filter takes the output of the inference pass (predictions) as input. It also
 * requires the target data (labels) and optionally, weights for the labels. If per-label weights
 * are not supplied, there is an option to use a single weight value by setting the 'weight' properly
 * on the MPSCNNLossDescriptor object. The labels and optional weights need to be supplied by the user
 * using the MPSCNNLossLabels object. The labels and weights are described via the MPSCNNLossDataDescriptor
 * objects, which are in turn used to initialize the MPSCNNLossLabels object.
 * 
 * If the specified reduction operation is MPSCNNReductionTypeNone, the destinationImage should be
 * at least as large as the specified clipRect. The destinationImage will then contain per-element
 * losses. Otherse, a reduction operation will be performed, according to the specified reduction
 * type, and the filter will return a scalar value containing the overall loss. For more information
 * on the available reduction types, see MPSCNNTypes.h. Also see MPSCNNLossDescriptor for the
 * description of optional parameters.
 * 
 * Here is a code example:
 * 
 * // Setup
 * MPSCNNLossDataDescriptor* labelsDescriptor =
 * [MPSCNNLossDataDescriptor cnnLossDataDescriptorWithData: labelsData
 * layout: MPSDataLayoutHeightxWidthxFeatureChannels
 * size: labelsDataSize];
 * MPSCNNLossLabels* labels = [[MPSCNNLossLabels alloc] initWithDevice: device
 * labelsDescriptor: labelsDescriptor];
 * MPSCNNLossDescriptor *lossDescriptor =
 * [MPSCNNLossDescriptor cnnLossDescriptorWithType: (MPSCNNLossType)MPSCNNLossTypeMeanAbsoluteError
 * reductionType: (MPSCNNReductionType)MPSCNNReductionTypeSum];
 * MPSCNNLoss* lossFilter = [[MPSCNNLoss alloc] initWithDevice: device lossDescriptor: lossDescriptor];
 * 
 * // Encode loss filter.
 * // The sourceImage is the output of a previous layer, for example, the SoftMax layer. The lossGradientsImage
 * // is the sourceGradient input image to the first gradient layer (in the backward direction), for example,
 * // the SoftMax gradient filter.
 * [lossFilter encodeToCommandBuffer: commandBuffer sourceImage: sourceImage
 * labels: labels
 * destinationImage: lossGradientsImage];
 * 
 * // In order to guarantee that the loss image data is correctly synchronized for CPU side access,
 * // it is the application's responsibility to call the [labels synchronizeOnCommandBuffer:]
 * // method before accessing the loss image data.
 * [labels synchronizeOnCommandBuffer:commandBuffer];
 * MPSImage* lossImage = [labels lossImage];
 * 
 * 
 * 
 * For predictions (y) and labels (t), the available loss filter types are the following:
 * 
 * Mean Absolute Error loss filter. This filter measures the absolute error of the element-wise
 * difference between the predictions and labels.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = |y - t|
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * Mean Squared Error loss filter. This filter measures the squared error of the element-wise
 * difference between the predictions and labels.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = (y - t)^2
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * SoftMax Cross Entropy loss filter. This loss filter is applied element-wise.
 * This loss filter combines the LogSoftMax and Negative Log Likelihood operations in a
 * single filter. It is useful for training a classification problem with multiple classes.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = -t * LogSoftMax(y)
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * If reductionType is MPSCNNReductionTypeMean, the accumulated
 * loss value is divided by width * height instead of
 * width * height * featureChannels.
 * 
 * Sigmoid Cross Entropy loss filter. This loss filter is applied element-wise.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = max(y, 0) - y * t + log(1 + exp(-|y|))
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * Categorical Cross Entropy loss filter. This loss filter is applied element-wise.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = -t * log(y)
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * Hinge loss filter. This loss filter is applied element-wise.
 * The labels are expected to be 0.0 or 1.0.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = max(1 - (t * y), 0.0f)
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * Huber loss filter. This loss filter is applied element-wise.
 * This loss function is computed according to the following formulas:
 * Compute losses: if (|y - t| <= delta, losses = 0.5 * y^2
 * if (|y - t| > delta, losses = 0.5 * delta^2 + delta * (|y - t| - delta)
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * Cosine Distance loss filter. This loss filter is applied element-wise.
 * The only valid reduction type for this loss filter is MPSCNNReductionTypeSum.
 * This loss function is computed according to the following formulas:
 * Compute losses: loss = 1 - reduce_sum(y * t)
 * Compute overall loss: weighted_loss = weight * loss
 * 
 * Log loss filter. This loss filter is applied element-wise.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = -(t * log(y + epsilon)) - ((1 - t) * log(1 - y + epsilon))
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * Kullback-Leibler Divergence loss filter. This loss filter is applied element-wise.
 * The input (predictions) is expected to contain log-probabilities.
 * This loss function is computed according to the following formulas:
 * Compute losses: losses = t * (log(t) - y)
 * Compute weighted losses: weighted_losses = weight(s) * losses
 * Compute overall loss: loss = reduce(weighted_losses, reductionType)
 * 
 * 
 * 
 * For predictions (y) and labels (t), the loss gradient for each available loss filter type
 * is computed as follows:
 * 
 * Mean Absolute Error loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = (y - t) / |y - t|
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Mean Squared Error loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = 2 * (y - t)
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * SoftMax Cross Entropy loss.
 * The loss gradient is computed according to the following formulas:
 * First, apply the same label smoothing as in the MPSCNNLoss filter.
 * Compute gradient: d/dy = y - t
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Sigmoid Cross Entropy loss.
 * The loss gradient is computed according to the following formulas:
 * First, apply the same label smoothing as in the MPSCNNLoss filter.
 * Compute gradient: d/dy = (1 / (1 + exp(-y)) - t
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Categorical Cross Entropy loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = -t / y
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Hinge loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = ((1 + ((1 - (2 * t)) * y)) > 0) ? 1 - (2 * t) : 0
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Huber loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = |y - t| > delta ? delta : y - t
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Cosine Distance loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = -t
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Log loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = (-2 * epsilon * t - t + y + epsilon) / (y * (1 - y) + epsilon * (epsilon + 1))
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * Kullback-Leibler Divergence loss.
 * The loss gradient is computed according to the following formulas:
 * Compute gradient: d/dy = -t / y
 * Compute weighted gradient: weighted_gradient = weight(s) * gradient
 * 
 * The number of output feature channels remains the same as the number of input feature
 * channels.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNLoss extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNLoss(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNLoss alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNLoss allocWithZone(VoidPtr zone);

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
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode a MPSCNNLoss filter and return a gradient.
     * 
     * This -encode call is similar to the encodeToCommandBuffer:sourceImage:labels:destinationImage: above,
     * except that it creates and returns the MPSImage with the loss gradient result.
     * 
     * @param commandBuffer The MTLCommandBuffer on which to encode.
     * @param sourceImage   The source image from the previous filter in the graph (in the inference direction).
     * @param labels        The object containing the target data (labels) and optionally, weights for the labels.
     * @return The MPSImage containing the gradient result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:labels:")
    public native MPSImage encodeToCommandBufferSourceImageLabels(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSCNNLossLabels labels);

    /**
     * Encode a MPSCNNLoss filter and return a gradient in the destinationImage.
     * 
     * This filter consumes the output of a previous layer, for example, the SoftMax layer containing
     * predictions, and the MPSCNNLossLabels object containing the target data (labels) and optionally,
     * weights for the labels. The destinationImage contains the computed gradient for the loss layer.
     * It serves as a source gradient input image to the first gradient layer (in the backward direction),
     * in our example, the SoftMax gradient layer.
     * 
     * @param commandBuffer    The MTLCommandBuffer on which to encode.
     * @param sourceImage      The source image from the previous filter in the graph (in the inference direction).
     * @param labels           The object containing the target data (labels) and optionally, weights for the labels.
     * @param destinationImage The MPSImage into which to write the gradient result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:labels:destinationImage:")
    public native void encodeToCommandBufferSourceImageLabelsDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSCNNLossLabels labels, MPSImage destinationImage);

    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNLoss init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNLoss initWithCoder(NSCoder aDecoder);

    /**
     * <NSSecureCoding> support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNLoss initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNLoss initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the loss filter with a loss descriptor.
     * 
     * @param device         The device the filter will run on.
     * @param lossDescriptor The loss descriptor.
     * @return A valid MPSCNNLoss object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:lossDescriptor:")
    public native MPSCNNLoss initWithDeviceLossDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSCNNLossDescriptor lossDescriptor);

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
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    /**
     * See MPSCNNLossDescriptor for information about the following properties.
     */
    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNLoss new_objc();

    @Generated
    @Selector("numberOfClasses")
    @NUInt
    public native long numberOfClasses();

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
    @Selector("weight")
    public native float weight();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("reduceAcrossBatch")
    public native boolean reduceAcrossBatch();
}
