package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
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
 * MPSGraph
 * <p>
 * Optimized representation of a compute graph of MPSGraphOperations and MPSGraphTensors
 * <p>
 * An MPSGraph is a symbolic representation of operations to be utilized to execute compute graphs on a device.
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraph extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("L2NormPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);

    @Generated
    @Selector("L2NormPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4DWithSourceTensorDescriptorName(MPSGraphTensor source,
            MPSGraphPooling4DOpDescriptor descriptor, String name);

    @Generated
    @Selector("absoluteWithTensor:name:")
    public native MPSGraphTensor absoluteWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("acosWithTensor:name:")
    public native MPSGraphTensor acosWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("acoshWithTensor:name:")
    public native MPSGraphTensor acoshWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create Add op and return the result tensor, it supports broadcasting as well
     * <p>
     * [@code]
     * resultTensor = primaryTensor + secondaryTensor
     * [@endcode]
     *
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("additionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor additionWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraph alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraph allocWithZone(VoidPtr zone);

    @Generated
    @Selector("applyStochasticGradientDescentWithLearningRateTensor:variable:gradientTensor:name:")
    public native MPSGraphOperation applyStochasticGradientDescentWithLearningRateTensorVariableGradientTensorName(
            MPSGraphTensor learningRateTensor, MPSGraphVariableOp variable, MPSGraphTensor gradientTensor, String name);

    @Generated
    @Selector("asinWithTensor:name:")
    public native MPSGraphTensor asinWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("asinhWithTensor:name:")
    public native MPSGraphTensor asinhWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create a read op which reads at this point of execution of the graph and return the result tensor
     *
     * @param variable variable resource tensor to read from
     * @param tensor   tensor to assign to variable
     * @param name     name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("assignVariable:withValueOfTensor:name:")
    public native MPSGraphOperation assignVariableWithValueOfTensorName(MPSGraphTensor variable, MPSGraphTensor tensor,
            String name);

    @Generated
    @Selector("atan2WithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor atan2WithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("atanWithTensor:name:")
    public native MPSGraphTensor atanWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("atanhWithTensor:name:")
    public native MPSGraphTensor atanhWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("avgPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2DGradientWithGradientTensorSourceTensorDescriptorName(
            MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling2DOpDescriptor descriptor, String name);

    @Generated
    @Selector("avgPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2DWithSourceTensorDescriptorName(MPSGraphTensor source,
            MPSGraphPooling2DOpDescriptor descriptor, String name);

    @Generated
    @Selector("avgPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);

    @Generated
    @Selector("avgPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4DWithSourceTensorDescriptorName(MPSGraphTensor source,
            MPSGraphPooling4DOpDescriptor descriptor, String name);

    /**
     * Create broadcast op and return the result tensor
     * <p>
     * Broadcast values inside the tensor, starting from the trailing dimensions, to give it the correct shape.
     * This is equivalent to the broadcasting for arithmetic operations when operands have different shapes.
     *
     * @param tensor      Tensor to be broadcasted
     * @param shapeTensor 1D Int32 or Int64 tensor. Shape of the result tensor
     * @param name        The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("broadcastTensor:toShapeTensor:name:")
    public native MPSGraphTensor broadcastTensorToShapeTensorName(MPSGraphTensor tensor, MPSGraphTensor shapeTensor,
            String name);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Create cast op and return the result tensor
     * <p>
     * Returns input tensor casted to the dataType passed in
     *
     * @param tensor Input tensor
     * @param type   Input tensor
     * @param name   The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("castTensor:toType:name:")
    public native MPSGraphTensor castTensorToTypeName(MPSGraphTensor tensor, int type, String name);

    @Generated
    @Selector("ceilWithTensor:name:")
    public native MPSGraphTensor ceilWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("clampWithTensor:minValueTensor:maxValueTensor:name:")
    public native MPSGraphTensor clampWithTensorMinValueTensorMaxValueTensorName(MPSGraphTensor tensor,
            MPSGraphTensor minValueTensor, MPSGraphTensor maxValueTensor, String name);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Create concat op and return the result tensor
     * <p>
     * Concatenate two input tensors along sepecified dimension. Tensors must be broadcast
     * compatible along all other dimensions, and have the same type.
     *
     * @param tensor         First tensor to concatenate
     * @param tensor2        Second tensor to concatenate
     * @param dimensionIndex The dimension to concatenate across, must be in range - rank <= dimension < rank
     * @param name           The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("concatTensor:withTensor:dimension:name:")
    public native MPSGraphTensor concatTensorWithTensorDimensionName(MPSGraphTensor tensor, MPSGraphTensor tensor2,
            @NInt long dimensionIndex, String name);

    /**
     * Create concat op and return the result tensor
     * <p>
     * Concatenate all input tensors along specified dimension. All inputs must be broadcast
     * compatible along all other dimensions, and have the same type.
     * When interleave is specified, all tensors will be interleaved. To interleave, all inputs must
     * be broadcast compatible along the specified dimension as well.
     * Example,
     * [@code]
     * operand0 = [1, 2, 3]
     * operand1 = [4, 5, 6]
     * concat([operand0, operand1], axis = 0, interleave = YES) = [1, 4, 2, 5, 3, 6]
     * [@endcode]
     *
     * @param tensors        Tensors to concatenate
     * @param dimensionIndex The dimension to concatenate across, must be in range - rank <= dimension < rank
     * @param interleave     Interleave input tensors
     * @param name           The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("concatTensors:dimension:interleave:name:")
    public native MPSGraphTensor concatTensorsDimensionInterleaveName(NSArray<? extends MPSGraphTensor> tensors,
            @NInt long dimensionIndex, boolean interleave, String name);

    /**
     * Create concat op and return the result tensor
     * <p>
     * Concatenate all input tensors along specified dimension. All inputs must be broadcast
     * compatible along all other dimensions, and have the same type.
     *
     * @param tensors        Tensors to concatenate
     * @param dimensionIndex The dimension to concatenate across, must be in range - rank <= dimension < rank
     * @param name           The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("concatTensors:dimension:name:")
    public native MPSGraphTensor concatTensorsDimensionName(NSArray<? extends MPSGraphTensor> tensors,
            @NInt long dimensionIndex, String name);

    /**
     * Create a constant op and return the result tensor
     *
     * @param scalar   scalar to fill the entire tensor values with
     * @param dataType dataType of the constant tensor
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("constantWithScalar:dataType:")
    public native MPSGraphTensor constantWithScalarDataType(double scalar, int dataType);

    /**
     * Runs the graph for given feeds to return targetTensor values, ensuring all target operations also executed. This
     * call blocks till execution has completed.
     *
     * @param operations     Operations maked as control dependency for all ops created inside the dependent block
     * @param dependentBlock MPSGraphControlFlowDependencyBlock which is provided by caller to create dependent ops
     * @param name           name of scope
     * @return A valid MPSGraphTensor array with results returned from dependentBlock forwarded
     */
    @Generated
    @Selector("controlDependencyWithOperations:dependentBlock:name:")
    public native NSArray<? extends MPSGraphTensor> controlDependencyWithOperationsDependentBlockName(
            NSArray<? extends MPSGraphOperation> operations,
            @ObjCBlock(name = "call_controlDependencyWithOperationsDependentBlockName") Block_controlDependencyWithOperationsDependentBlockName dependentBlock,
            String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_controlDependencyWithOperationsDependentBlockName {
        @Generated
        NSArray<? extends MPSGraphTensor> call_controlDependencyWithOperationsDependentBlockName();
    }

    /**
     * Create Convolution gradient op and return the result tensor
     * <p>
     * Computes the gradient of source input for the forward pass Convolution op with identical parameters.
     * See discussion of convolution2DWithSourceTensor for more in depth description of paramters.
     *
     * @param gradient                     Incoming gradient tensor
     * @param weights                      Forward pass weights tensor
     * @param outputShapeTensor            1D Int32 or Int64 Tensor. Shape of the forward pass source tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("convolution2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DDataGradientWithIncomingGradientTensorWeightsTensorOutputShapeTensorForwardConvolutionDescriptorName(
            MPSGraphTensor gradient, MPSGraphTensor weights, MPSGraphTensor outputShapeTensor,
            MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);

    /**
     * Create Convolution gradient op and return the result tensor
     * <p>
     * Computes the gradient of weights input for the forward pass Convolution op with identical parameters.
     * See discussion of convolution2DWithSourceTensor for more in depth description of paramters.
     *
     * @param gradient                     Incoming gradient tensor
     * @param source                       Forward pass source tensor
     * @param outputShapeTensor            1D int32 or Int64 Tensor. Shape of the forward pass weights tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("convolution2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DWeightsGradientWithIncomingGradientTensorSourceTensorOutputShapeTensorForwardConvolutionDescriptorName(
            MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphTensor outputShapeTensor,
            MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);

    @Generated
    @Selector("convolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor convolution2DWithSourceTensorWeightsTensorDescriptorName(MPSGraphTensor source,
            MPSGraphTensor weights, MPSGraphConvolution2DOpDescriptor descriptor, String name);

    /**
     * Create ConvolutionTranspose gradient op and return the result tensor
     * <p>
     * Computes the gradient of source input for the forward pass ConvolutionTranspose op with identical parameters.
     * See discussion of convolutionTranspose2DWithSourceTensor for more in depth description of paramters.
     *
     * @param incomingGradient             Incoming gradient tensor
     * @param weights                      Forward pass weights tensor
     * @param outputShape                  1D Int32 or Int64 Tensor. Shape of the forward pass source tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("convolutionTranspose2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DDataGradientWithIncomingGradientTensorWeightsTensorOutputShapeTensorForwardConvolutionDescriptorName(
            MPSGraphTensor incomingGradient, MPSGraphTensor weights, MPSGraphTensor outputShape,
            MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);

    /**
     * Create ConvolutionTranspose gradient op and return the result tensor
     * <p>
     * Computes the gradient of weights input for the forward pass ConvolutionTranspose op with identical parameters.
     * See discussion of convolutionTranspose2DWithSourceTensor for more in depth description of paramters.
     *
     * @param incomingGradientTensor       Incoming gradient tensor
     * @param source                       Forward pass source tensor
     * @param outputShape                  1D Int32 or Int64 Tensor. Shape of the forward pass source weights tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("convolutionTranspose2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWeightsGradientWithIncomingGradientTensorSourceTensorOutputShapeTensorForwardConvolutionDescriptorName(
            MPSGraphTensor incomingGradientTensor, MPSGraphTensor source, MPSGraphTensor outputShape,
            MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);

    /**
     * Create ConvolutionTranspose op and return the result tensor
     * <p>
     * Convolution Tranpose op is exactly the same as convolution gradint with respect to input image
     * (convolution2DDataGradient)
     * Weights tensor and source tensors are interpreted as they are in convolution2DDataGradientWithIncomingGradient.
     * For example
     * if weightsTensor layout is HWIO, inner most (fastest moving) dimension, denoted by O here should be equal to
     * inputFeatureChannels
     * i.e. number of channels in source tensor
     * and next fasted moving dimension denoated by I is equal to number of channels in returns (destination) tensor
     * outputFeatureChannels.
     * TensorFlow interprets the weights tensor same way excpet that it states weights are in HWOI format. We dont
     * define another weights format enum
     * rather we reinterpret HWIO just like TensorFlow does for gradient with data.
     * Normally in auto encoder, convoluton transpose is associated with regular convolution i.e. convolution
     * downsamples by stride s
     * and convolution tranpose upsamples by factor s.
     * In that case, convolution transpose can map same source size to multiple destination sizes. The relationship
     * between sourceWidth and destinationWidth is
     * (sourceWidth - 1) * stride + 1 + (kernelWidth - 1) * dilationRate <= destinationWidth + paddingLeft +
     * paddingRight
     * so there are stride -1 destinationWidth that give same sourceWidth. In order to disambiguate, outputShape
     * parameter is used.
     * This is what TensorFlow does.
     * PyTourch takes additional outputPadding that is applied to destination size.
     *
     * @param source      input tensor
     * @param weights     weights tensor
     * @param outputShape 1D Int32 or Int64 tensor. shape of the result tensor
     * @param descriptor  descriptor for the corresponding forward Conv2d operation
     * @param name        name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("convolutionTranspose2DWithSourceTensor:weightsTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWithSourceTensorWeightsTensorOutputShapeTensorDescriptorName(
            MPSGraphTensor source, MPSGraphTensor weights, MPSGraphTensor outputShape,
            MPSGraphConvolution2DOpDescriptor descriptor, String name);

    @Generated
    @Selector("cosWithTensor:name:")
    public native MPSGraphTensor cosWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("coshWithTensor:name:")
    public native MPSGraphTensor coshWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("depthToSpace2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensorWidthAxisHeightAxisDepthAxisBlockSizeUsePixelShuffleOrderName(
            MPSGraphTensor tensor, @NUInt long widthAxis, @NUInt long heightAxis, @NUInt long depthAxis,
            @NUInt long blockSize, boolean usePixelShuffleOrder, String name);

    @Generated
    @Selector("depthToSpace2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensorWidthAxisTensorHeightAxisTensorDepthAxisTensorBlockSizeUsePixelShuffleOrderName(
            MPSGraphTensor tensor, MPSGraphTensor widthAxisTensor, MPSGraphTensor heightAxisTensor,
            MPSGraphTensor depthAxisTensor, @NUInt long blockSize, boolean usePixelShuffleOrder, String name);

    @Generated
    @Selector("depthwiseConvolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution2DWithSourceTensorWeightsTensorDescriptorName(
            MPSGraphTensor source, MPSGraphTensor weights, MPSGraphDepthwiseConvolution2DOpDescriptor descriptor,
            String name);

    /**
     * * @abstract Create 3d depthwise convolution operation and return the result tensor.
     * * @discussion Just like depthwise convolution2d, but in three dimensions. Different layouts are supported by
     * using
     * * the @code channelDimensionIndex @endcode property. If your weights need a different layout
     * * add a permute operation on them before this operation.
     * <p>
     * * @param source 3d Image source as tensor - must be at least rank=4 (CDHW when channelDimensionIndex = -4).
     * * @param weights Weights tensor, must be rank=4 - axes are interpreted as CDHW when channelDimensionIndex = -4 .
     * * @param descriptor Specifies strides, dilation rates and paddings.
     * * @param name The name for the operation.
     * *
     * * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("depthwiseConvolution3DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution3DWithSourceTensorWeightsTensorDescriptorName(
            MPSGraphTensor source, MPSGraphTensor weights, MPSGraphDepthwiseConvolution3DOpDescriptor descriptor,
            String name);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("divisionNoNaNWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor divisionNoNaNWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    /**
     * Create Divide op and return the result tensor, it supports broadcasting as well
     * <p>
     * [@code]
     * resultTensor = primaryTensor / secondaryTensor
     * [@endcode]
     *
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("divisionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor divisionWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("dropoutTensor:rate:name:")
    public native MPSGraphTensor dropoutTensorRateName(MPSGraphTensor tensor, double rate, String name);

    @Generated
    @Selector("dropoutTensor:rateTensor:name:")
    public native MPSGraphTensor dropoutTensorRateTensorName(MPSGraphTensor tensor, MPSGraphTensor rate, String name);

    @Generated
    @Selector("equalWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor equalWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("erfWithTensor:name:")
    public native MPSGraphTensor erfWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("exponentBase10WithTensor:name:")
    public native MPSGraphTensor exponentBase10WithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("exponentBase2WithTensor:name:")
    public native MPSGraphTensor exponentBase2WithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("exponentWithTensor:name:")
    public native MPSGraphTensor exponentWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create flatten2d op and return the result tensor
     * <p>
     * Flattens dimensions before `axis` to `result[0]` and dimensions starting
     * from `axis` to `result[1]` and returns a rank-2 tensor as result.
     *
     * @param tensor Tensor to be flattened
     * @param axis   Axis around which to flatten
     * @param name   The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("flatten2DTensor:axis:name:")
    public native MPSGraphTensor flatten2DTensorAxisName(MPSGraphTensor tensor, @NInt long axis, String name);

    /**
     * Create flatten2d op and return the result tensor
     * <p>
     * Flattens dimensions before `axis` to `result[0]` and dimensions starting
     * from `axis` to `result[1]` and returns a rank-2 tensor as result.
     *
     * @param tensor     Tensor to be flattened
     * @param axisTensor Axis around which to flatten
     * @param name       The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("flatten2DTensor:axisTensor:name:")
    public native MPSGraphTensor flatten2DTensorAxisTensorName(MPSGraphTensor tensor, MPSGraphTensor axisTensor,
            String name);

    @Generated
    @Selector("floorModuloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor floorModuloWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("floorWithTensor:name:")
    public native MPSGraphTensor floorWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Adds a forLoop operation, The lower and upper bounds specify a half-open range: the range includes the lower
     * bound but does not include the upper bound.
     *
     * @param lowerBound           lowerBound value of the loop, this is a scalar tensor, this is the index the loop
     *                             will start with
     * @param upperBound           upperBound value of the loop, this is a scalar tensor
     * @param step                 step value of the loop, this is a scalar tensor and must be positive
     * @param initialBodyArguments initial set of iteration arguments passed to the bodyBlock of the for loop
     * @param body                 bodyBlock, this will execute the body of the forLoop
     * @param name                 name of operation
     * @return A valid MPSGraphTensor array with same count and corresponding elementTypes as initialIterationArguments
     *         and return types of the forLoop
     */
    @Generated
    @Selector("forLoopWithLowerBound:upperBound:step:initialBodyArguments:body:name:")
    public native NSArray<? extends MPSGraphTensor> forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName(
            MPSGraphTensor lowerBound, MPSGraphTensor upperBound, MPSGraphTensor step,
            NSArray<? extends MPSGraphTensor> initialBodyArguments,
            @ObjCBlock(name = "call_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName") Block_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName body,
            String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName {
        @Generated
        NSArray<? extends MPSGraphTensor> call_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName(
                MPSGraphTensor index, NSArray<? extends MPSGraphTensor> iterationArguments);
    }

    /**
     * Adds a forLoop operation, with a specific number of iterations
     *
     * @param numberOfIterations   tensor with number of iterations the loop will execute
     * @param initialBodyArguments initial set of iteration arguments passed to the bodyBlock of the for loop
     * @param body                 bodyBlock, this will execute the body of the forLoop, index will go from 0 to
     *                             numberOfIterations-1
     * @param name                 name of operation
     * @return A valid MPSGraphTensor array with same count and corresponding elementTypes as initialIterationArguments
     *         and return types of the forLoop
     */
    @Generated
    @Selector("forLoopWithNumberOfIterations:initialBodyArguments:body:name:")
    public native NSArray<? extends MPSGraphTensor> forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName(
            MPSGraphTensor numberOfIterations, NSArray<? extends MPSGraphTensor> initialBodyArguments,
            @ObjCBlock(name = "call_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName") Block_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName body,
            String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName {
        @Generated
        NSArray<? extends MPSGraphTensor> call_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName(
                MPSGraphTensor index, NSArray<? extends MPSGraphTensor> iterationArguments);
    }

    /**
     * Create GatherND op and return the result tensor
     * <p>
     * Gathers the slices in updatesTensor to the result tensor along the indices in indicesTensor.
     * The gather is defined as
     * [@code]
     * B = batchDims
     * U = updates.rank - B
     * P = res.rank - B
     * Q = inds.rank - B
     * K = inds.shape[-1]
     * index_slice = indices[i_{b0},...,i_{bB},i_{0},..,i_{Q-1}]
     * res[i_{b0},...,i_{bB},i_{0},...,i_{Q-1}] = updates[i_{b0},...,i_{bB},index_slice[0],...,index_slice[K-1]]
     * [@endcode]
     * The tensors have the following shape requirements
     * [@code]
     * U > 0; P > 0; Q > 0
     * K <= U
     * P = (U-K) + Q-1
     * indices.shape[0:Q-1] = res.shape[0:Q-1]
     * res.shape[Q:P] = updates.shape[K:U]
     * [@endcode]
     *
     * @param updatesTensor   Tensor containing slices to be inserted into the result tensor
     * @param indicesTensor   Tensor containg the updates indices to read slices from
     * @param batchDimensions The number of batch dimensions
     * @param name            The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("gatherNDWithUpdatesTensor:indicesTensor:batchDimensions:name:")
    public native MPSGraphTensor gatherNDWithUpdatesTensorIndicesTensorBatchDimensionsName(MPSGraphTensor updatesTensor,
            MPSGraphTensor indicesTensor, @NUInt long batchDimensions, String name);

    /**
     * Create Gather op and return the result tensor
     * <p>
     * Gathers the values in updatesTensor to the result tensor along the indices in indicesTensor.
     * The gather is defined as
     * [@code]
     * B = batchDims
     * U = updates.rank
     * P = res.rank
     * Q = inds.rank
     * <p>
     * res[p_{0},...p_{axis-1}, i_{B},...,i_{Q}, ...,p_{axis+1},...,p{U-1}] =
     * updates[p_{0},...p_{axis-1}, indices[p_{0},...,p_{B-1},i_{B},...,i_{Q}, ...,p_{axis+1},...,p{U-1}]
     * <p>
     * [@endcode]
     * The tensors have the following shape requirements
     * [@code]
     * P = Q-B + U-1
     * indices.shape[0:B] = updates.shape[0:B] = res.shape[0:B]
     * res.shape[0:axis] = updates.shape[0:axis]
     * res.shape[axis:axis+Q-B] = indices.shape[B:]
     * res.shape[axis+1+Q-B:] = updates.shape[axis+1:]
     * [@endcode]
     *
     * @param updatesTensor   Tensor containing slices to be inserted into the result tensor
     * @param indicesTensor   Tensor containg the updates indices to read slices from
     * @param axis            The dimension on which to perform the gather
     * @param batchDimensions The number of batch dimensions
     * @param name            The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("gatherWithUpdatesTensor:indicesTensor:axis:batchDimensions:name:")
    public native MPSGraphTensor gatherWithUpdatesTensorIndicesTensorAxisBatchDimensionsName(
            MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, @NUInt long axis, @NUInt long batchDimensions,
            String name);

    /**
     * Calculates partial derviative of primaryTensor wrt secondaryTensor
     *
     * @param primaryTensor tensor to be differentiated (numerator)
     * @param tensors       tensors to do the differentiation with (denominator)
     * @param name          name for the gradient operation
     * @return A valid MPSGraphTensor dictionary object containing partial derivative
     *         d(primaryTensor)/d(secondaryTensor) for each tensor as key
     */
    @Generated
    @Selector("gradientForPrimaryTensor:withTensors:name:")
    public native NSDictionary<? extends MPSGraphTensor, ? extends MPSGraphTensor> gradientForPrimaryTensorWithTensorsName(
            MPSGraphTensor primaryTensor, NSArray<? extends MPSGraphTensor> tensors, String name);

    @Generated
    @Selector("greaterThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThanOrEqualToWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("greaterThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThanWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("identityWithTensor:name:")
    public native MPSGraphTensor identityWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Add an if/then/else op to the graph
     *
     * @param predicateTensor Tensor must have a single scalar value, used to decide between then/else branches
     * @param thenBlock       If predicate is true operations in this block are executed
     * @param elseBlock       If predicate is false operations in this block are executed
     * @param name            name of operation
     * @return results If no error, the tensors returned by user. If not empty, user must define both then/else block,
     *         both should have same number of arguments and each corresponding argument should have same elementTypes.
     */
    @Generated
    @Selector("ifWithPredicateTensor:thenBlock:elseBlock:name:")
    public native NSArray<? extends MPSGraphTensor> ifWithPredicateTensorThenBlockElseBlockName(
            MPSGraphTensor predicateTensor,
            @ObjCBlock(name = "call_ifWithPredicateTensorThenBlockElseBlockName_1") Block_ifWithPredicateTensorThenBlockElseBlockName_1 thenBlock,
            @ObjCBlock(name = "call_ifWithPredicateTensorThenBlockElseBlockName_2") Block_ifWithPredicateTensorThenBlockElseBlockName_2 elseBlock,
            String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ifWithPredicateTensorThenBlockElseBlockName_1 {
        @Generated
        NSArray<? extends MPSGraphTensor> call_ifWithPredicateTensorThenBlockElseBlockName_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ifWithPredicateTensorThenBlockElseBlockName_2 {
        @Generated
        NSArray<? extends MPSGraphTensor> call_ifWithPredicateTensorThenBlockElseBlockName_2();
    }

    /**
     * Initialize an MPSGraph to insert nodes in
     */
    @Generated
    @Selector("init")
    public native MPSGraph init();

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
    @Selector("isFiniteWithTensor:name:")
    public native MPSGraphTensor isFiniteWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("isInfiniteWithTensor:name:")
    public native MPSGraphTensor isInfiniteWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("isNaNWithTensor:name:")
    public native MPSGraphTensor isNaNWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("leakyReLUGradientWithIncomingGradient:sourceTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLUGradientWithIncomingGradientSourceTensorAlphaTensorName(
            MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphTensor alphaTensor, String name);

    /**
     * Leaky ReLU activation tensor
     * <p>
     * Specifies the leaky ReLU activation tensor.
     * For each pixel, applies the following function: f(x) = max(x, alpha * x)
     */
    @Generated
    @Selector("leakyReLUWithTensor:alpha:name:")
    public native MPSGraphTensor leakyReLUWithTensorAlphaName(MPSGraphTensor tensor, double alpha, String name);

    @Generated
    @Selector("leakyReLUWithTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLUWithTensorAlphaTensorName(MPSGraphTensor tensor, MPSGraphTensor alphaTensor,
            String name);

    @Generated
    @Selector("lessThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThanOrEqualToWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("lessThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThanWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("logarithmBase10WithTensor:name:")
    public native MPSGraphTensor logarithmBase10WithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("logarithmBase2WithTensor:name:")
    public native MPSGraphTensor logarithmBase2WithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("logarithmWithTensor:name:")
    public native MPSGraphTensor logarithmWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("logicalANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalANDWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("logicalNANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNANDWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("logicalNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNORWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("logicalORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalORWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("logicalXNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXNORWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("logicalXORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXORWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    /**
     * Create MatMul op and return the result tensor, it supports broadcasting as well
     * <p>
     * [@code]
     * resultTensor = matmul(primaryTensor, secondaryTensor)
     * [@endcode]
     *
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("matrixMultiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor matrixMultiplicationWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("maxPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DGradientWithGradientTensorSourceTensorDescriptorName(
            MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling2DOpDescriptor descriptor, String name);

    @Generated
    @Selector("maxPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DWithSourceTensorDescriptorName(MPSGraphTensor source,
            MPSGraphPooling2DOpDescriptor descriptor, String name);

    @Generated
    @Selector("maxPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);

    @Generated
    @Selector("maxPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DWithSourceTensorDescriptorName(MPSGraphTensor source,
            MPSGraphPooling4DOpDescriptor descriptor, String name);

    /**
     * Create Maximum op and return the result tensor, it supports broadcasting as well. If any of the operands is NaN,
     * NaN is returned
     * <p>
     * [@code]
     * resultTensor = isNaN(primaryTensor) || isNan(secondaryTensor) ? NaN : max(primaryTensor, secondaryTensor)
     * [@endcode]
     *
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("maximumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximumWithNaNPropagationWithPrimaryTensorSecondaryTensorName(
            MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("maximumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximumWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    /**
     * Create a mean op and return the result tensor
     *
     * @param axes A list of axes over which to perform the reduction. The order of dimensions goes from the slowest
     *             moving at axis=0 to the fastest moving dimension.
     * @param name name for the placeholder operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("meanOfTensor:axes:name:")
    public native MPSGraphTensor meanOfTensorAxesName(MPSGraphTensor tensor, NSArray<? extends NSNumber> axes,
            String name);

    /**
     * Create Minimum op and return the result tensor, it supports broadcasting as well. If any of the operands is NaN,
     * NaN is returned
     * <p>
     * [@code]
     * resultTensor = isNaN(primaryTensor) || isNan(secondaryTensor) ? NaN : min(primaryTensor, secondaryTensor)
     * [@endcode]
     *
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("minimumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimumWithNaNPropagationWithPrimaryTensorSecondaryTensorName(
            MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("minimumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimumWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("moduloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor moduloWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    /**
     * Create Multiply op and return the result tensor, it supports broadcasting as well
     * <p>
     * [@code]
     * resultTensor = primaryTensor * secondaryTensor
     * [@endcode]
     *
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("multiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor multiplicationWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("negativeWithTensor:name:")
    public native MPSGraphTensor negativeWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create a new MPSGraph to insert nodes in
     */
    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraph new_objc();

    @Generated
    @Selector("normalizationBetaGradientWithIncomingGradientTensor:sourceTensor:reductionAxes:name:")
    public native MPSGraphTensor normalizationBetaGradientWithIncomingGradientTensorSourceTensorReductionAxesName(
            MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, NSArray<? extends NSNumber> axes,
            String name);

    @Generated
    @Selector("normalizationGammaGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGammaGradientWithIncomingGradientTensorSourceTensorMeanTensorVarianceTensorReductionAxesEpsilonName(
            MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, MPSGraphTensor meanTensor,
            MPSGraphTensor varianceTensor, NSArray<? extends NSNumber> axes, float epsilon, String name);

    @Generated
    @Selector("normalizationGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:gammaTensor:gammaGradientTensor:betaGradientTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGradientWithIncomingGradientTensorSourceTensorMeanTensorVarianceTensorGammaTensorGammaGradientTensorBetaGradientTensorReductionAxesEpsilonName(
            MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, MPSGraphTensor meanTensor,
            MPSGraphTensor varianceTensor, MPSGraphTensor gamma, MPSGraphTensor gammaGradient,
            MPSGraphTensor betaGradient, NSArray<? extends NSNumber> axes, float epsilon, String name);

    /**
     * Create a batch normalization op and return the result tensor
     * <p>
     * The mean and variance tensors should be outputs of meanWithTensor:axes:name and
     * varianceWithTensor:meanTensor:axes:name.
     * Use the axes parameter to achieve different types of normalizations.
     * For example (assuming your data is in NxHxWxC format)
     * Batch normalization: axes = [0, 1, 2]
     * Instance normalization: axes = [1, 2]
     * Shapes for gamma and beta must match the input data along at least one dimension and will be broadcast along the
     * rest.
     * For batch normalization, gamma and beta would typically be 1x1x1xC i.e. one value per channel.
     *
     * @param mean     mean
     * @param variance variance
     * @param gamma    Tensor used to scale the normalized result
     * @param beta     Tensor used to bias the normalized result
     * @param epsilon  A small value to add to the variance when normalizing the inputs.
     * @param name     name for the placeholder operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("normalizationWithTensor:meanTensor:varianceTensor:gammaTensor:betaTensor:epsilon:name:")
    public native MPSGraphTensor normalizationWithTensorMeanTensorVarianceTensorGammaTensorBetaTensorEpsilonName(
            MPSGraphTensor tensor, MPSGraphTensor mean, MPSGraphTensor variance, MPSGraphTensor gamma,
            MPSGraphTensor beta, float epsilon, String name);

    @Generated
    @Selector("notEqualWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor notEqualWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("notWithTensor:name:")
    public native MPSGraphTensor notWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:dataType:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisDataTypeName(MPSGraphTensor indicesTensor,
            @NUInt long depth, @NUInt long axis, int dataType, String name);

    /**
     * Create oneHot op and return the result tensor
     * <p>
     * Creates a tensor of rank equal to the indicesTensor rank + 1.
     * A new axis is inserted at the axis specified, or the minor axis if axis is -1.
     * The values at the indices in the indicesTensor will have the onValue,
     * and all other values will be set to the offValue.
     *
     * @param indicesTensor Tensor of indices for on values
     * @param depth         Depth of the oneHot vector along the axis
     * @param axis          The axis to insert the new oneHot vector at.
     *                      Defaults to -1, the minor axis
     * @param dataType      MPSDataType of the result tensor
     *                      Defaults to MPSDataTypeFloat
     * @param onValue       The value for indices designated by the indicesTensor. This value must match the specified
     *                      data type.
     *                      Defaults to 1.0f
     * @param offValue      The value for indices not designated by the indicesTensor. This value must match the
     *                      specified data type.
     *                      Defaults to 0.0f
     * @param name          Name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisDataTypeOnValueOffValueName(
            MPSGraphTensor indicesTensor, @NUInt long depth, @NUInt long axis, int dataType, double onValue,
            double offValue, String name);

    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisName(MPSGraphTensor indicesTensor, @NUInt long depth,
            @NUInt long axis, String name);

    @Generated
    @Selector("oneHotWithIndicesTensor:depth:dataType:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthDataTypeName(MPSGraphTensor indicesTensor,
            @NUInt long depth, int dataType, String name);

    @Generated
    @Selector("oneHotWithIndicesTensor:depth:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthDataTypeOnValueOffValueName(MPSGraphTensor indicesTensor,
            @NUInt long depth, int dataType, double onValue, double offValue, String name);

    @Generated
    @Selector("oneHotWithIndicesTensor:depth:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthName(MPSGraphTensor indicesTensor, @NUInt long depth,
            String name);

    /**
     * [@property] options
     * <p>
     * options for the graph, default value is MPSGraphOptionsDefault
     */
    @Generated
    @Selector("options")
    public native long options();

    /**
     * [@property] placeholderTensors
     * <p>
     * an array of all the placeholderTensors
     */
    @Generated
    @Selector("placeholderTensors")
    public native NSArray<? extends MPSGraphTensor> placeholderTensors();

    @Generated
    @Selector("powerWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor powerWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("reLUGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor reLUGradientWithIncomingGradientSourceTensorName(MPSGraphTensor gradient,
            MPSGraphTensor source, String name);

    @Generated
    @Selector("reLUWithTensor:name:")
    public native MPSGraphTensor reLUWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create a read op which reads at this point of execution of the graph and return the result tensor
     *
     * @param variable variable resource tensor to read from
     * @param name     name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("readVariable:name:")
    public native MPSGraphTensor readVariableName(MPSGraphTensor variable, String name);

    @Generated
    @Selector("reciprocalWithTensor:name:")
    public native MPSGraphTensor reciprocalWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create reduction argMax op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionArgMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMaximumWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis,
            String name);

    /**
     * Create reduction argMin op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionArgMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMinimumWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis,
            String name);

    /**
     * Create reduction max op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMaximumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximumWithTensorAxesName(MPSGraphTensor tensor,
            NSArray<? extends NSNumber> axes, String name);

    /**
     * Create reduction max op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximumWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis,
            String name);

    /**
     * Create reduction min op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMinimumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimumWithTensorAxesName(MPSGraphTensor tensor,
            NSArray<? extends NSNumber> axes, String name);

    /**
     * Create reduction minimum op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimumWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis,
            String name);

    /**
     * Create reduction product op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionProductWithTensor:axes:name:")
    public native MPSGraphTensor reductionProductWithTensorAxesName(MPSGraphTensor tensor,
            NSArray<? extends NSNumber> axes, String name);

    /**
     * Create reduction product op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionProductWithTensor:axis:name:")
    public native MPSGraphTensor reductionProductWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis,
            String name);

    /**
     * Create reduction sum op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionSumWithTensor:axes:name:")
    public native MPSGraphTensor reductionSumWithTensorAxesName(MPSGraphTensor tensor, NSArray<? extends NSNumber> axes,
            String name);

    /**
     * Create reduction sum op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionSumWithTensor:axis:name:")
    public native MPSGraphTensor reductionSumWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis, String name);

    /**
     * Create Reshape op and return the result tensor
     * <p>
     * Reshape the input tensor to the target shapeTensor
     * The shape must be compatible with the input tensor shape
     * shapeTensor is allowed to contain dynamic dimensions (-1) when the result type can be inferred unambiguously
     *
     * @param tensor      Tensor to be reshaped.
     * @param shapeTensor 1D Int32 or Int64 tensor. The result tensor shape
     * @param name        The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("reshapeTensor:withShapeTensor:name:")
    public native MPSGraphTensor reshapeTensorWithShapeTensorName(MPSGraphTensor tensor, MPSGraphTensor shapeTensor,
            String name);

    /**
     * Create Resize op and return the result tensor
     * <p>
     * Resamples input images to given size. Result images will be distorted if size is of different aspect ratio.
     * Resize supports the following modes:
     * Nearest Neighnor - values are interpolated using the closest neighbor pixel
     * Bilinear - values are computed using bilinear interpolation of 4 neighboring pixels
     * <p>
     * Destination indices are computed using direct index scaling by default, with no offset added.
     * If the centerResult parameter is true, the destination indices will be scaled and shifted to be centered
     * on the input image.
     * If the alignCorners parameter is true, the corners of the result images will match the input images.
     * Scaling will be modified to a factor of (size - 1) / (inputSize - 1). When alignCorners is true, the
     * centerResult parameter does nothing.
     * <p>
     * In order to achieve the same behavior as OpenCV's resize and TensorFlowV2's resize,
     * [@code]
     * centerResult = YES;
     * alginCorners = NO;
     * [@endcode]
     * <p>
     * To achieve the same behavior as TensorFlowV1 resize
     * [@code]
     * centerResult = NO;
     * [@endcode]
     *
     * @param imagesTensor Tensor containing input images.
     * @param size         1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * @param mode         The resampling mode to use.
     * @param centerResult Controls if the result image is centered on the input image. When NO, the result will have
     *                     the top left corner aligned
     * @param alignCorners When YES, the result image will have the same value as the input image in the corners
     * @param layout       Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                     layout.
     *                     Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name         The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("resizeTensor:sizeTensor:mode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeTensorSizeTensorModeCenterResultAlignCornersLayoutName(
            MPSGraphTensor imagesTensor, MPSGraphTensor size, @NUInt long mode, boolean centerResult,
            boolean alignCorners, @NUInt long layout, String name);

    /**
     * Create Resize gradient op and return the result tensor
     * <p>
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     *
     * @param gradient     Incoming gradient tensor
     * @param input        Forward pass input tensor
     * @param mode         The resampling mode to use.
     * @param centerResult Controls if the result image is centered on the input image. When NO, the result will have
     *                     the top left corner aligned
     * @param alignCorners When YES, the result image will have the same value as the input image in the corners
     * @param layout       Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                     layout.
     *                     Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name         The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("resizeWithGradientTensor:input:mode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeWithGradientTensorInputModeCenterResultAlignCornersLayoutName(
            MPSGraphTensor gradient, MPSGraphTensor input, @NUInt long mode, boolean centerResult, boolean alignCorners,
            @NUInt long layout, String name);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("reverseSquareRootWithTensor:name:")
    public native MPSGraphTensor reverseSquareRootWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create reverse op and return the result tensor
     * <p>
     * Reverses a tensor on given axes
     * https://www.tensorflow.org/api_docs/python/tf/reverse.
     *
     * @param tensor Tensor to be reversed
     * @param axes   Axes to be reversed (Axes must be unique and within normal axis range).
     * @param name   The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("reverseTensor:axes:name:")
    public native MPSGraphTensor reverseTensorAxesName(MPSGraphTensor tensor, NSArray<? extends NSNumber> axes,
            String name);

    /**
     * Create reverse op and return the result tensor
     * <p>
     * Reverses a tensor on given axes
     * https://www.tensorflow.org/api_docs/python/tf/reverse.
     *
     * @param tensor     Tensor to be reversed
     * @param axesTensor Tensor that specifies axes to be reversed (Axes must be unique and within normal axis range).
     * @param name       The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("reverseTensor:axesTensor:name:")
    public native MPSGraphTensor reverseTensorAxesTensorName(MPSGraphTensor tensor, MPSGraphTensor axesTensor,
            String name);

    /**
     * Create reverse op and return the result tensor
     * <p>
     * Reverses a tensor on all axes
     * https://www.tensorflow.org/api_docs/python/tf/reverse.
     *
     * @param tensor Tensor to be reversed
     * @param name   The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("reverseTensor:name:")
    public native MPSGraphTensor reverseTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("rintWithTensor:name:")
    public native MPSGraphTensor rintWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("roundWithTensor:name:")
    public native MPSGraphTensor roundWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create ScatterND op and return the result tensor
     * <p>
     * Scatters the slices in updatesTensor to the result tensor along the indices in indicesTensor, on top of
     * dataTensor.
     * The scatter is defined as
     * [@code]
     * B = batchDims
     * U = updates.rank - B
     * P = res.rank - B
     * Q = inds.rank - B
     * K = inds.shape[-1]
     * index_slice = indices[i_{b0},...,i_{bB},i_{0},..,i_{Q-1}]
     * res[...] = data[...]
     * res[i_{b0},...,i_{bB},index_slice[0],...,index_slice[K-1]] += updates[i_{b0},...,i_{bB},i_{0},...,i_{Q-1}] //
     * Note += is used but this depends on mode
     * [@endcode]
     * Collsions will be updated according to mode, and slices not set by indices are set to 0. The tensors have the
     * following shape requirements
     * [@code]
     * K <= P
     * U = (P-K) + Q-1
     * data.shape = res.shape
     * indices.shape[0:Q-1] = updates.shape[0:Q-1]
     * updates.shape[Q:U] = res.shape[K:P]
     * [@endcode]
     *
     * @param dataTensor      Tensor containing inital values of same shape as result tensor
     * @param updatesTensor   Tensor containing slices to be inserted into the result tensor
     * @param indicesTensor   Tensor containg the result indices to insert slices at
     * @param batchDimensions The number of batch dimensions
     * @param mode            The type of update to use on the destination
     * @param name            The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("scatterNDWithDataTensor:updatesTensor:indicesTensor:batchDimensions:mode:name:")
    public native MPSGraphTensor scatterNDWithDataTensorUpdatesTensorIndicesTensorBatchDimensionsModeName(
            MPSGraphTensor dataTensor, MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor,
            @NUInt long batchDimensions, @NInt long mode, String name);

    /**
     * Create Scatter op and return the result tensor
     * <p>
     * Scatters the slices in updatesTensor to the result tensor along the indices in indicesTensor, on top of
     * dataTensor.
     * The scatter is defined as
     * [@code]
     * U = updates.rank
     * P = res.rank
     * res[...] = data[...]
     * res[i_{0},...,i_{axis-1},indices[i_{axis}],i_{axis+1},...,i_{U-1}] +=
     * updates[i_{0},...,i_{axis-1},i_{axis},i_{axis+1},...,i_{U-1}] // Note += is used but this depends on mode
     * [@endcode]
     * Collsions will be updated according to mode. The tensors have the following shape requirements
     * [@code]
     * U = P
     * indices.rank = 1
     * data.shape = res.shape
     * updates.shape[0:axis-1] = res.shape[0:axis-1]
     * updates.shape[axis] = indices.shape[0]
     * updates.shape[axis+1:U] = res.shape[0:P]
     * [@endcode]
     *
     * @param dataTensor    Tensor containing inital values of same shape as result tensor
     * @param updatesTensor Tensor containing values to be inserted into the result tensor
     * @param indicesTensor Tensor containg the result indices to insert values at
     * @param axis          The axis of the result tensor to scatter values along
     * @param mode          The type of update to use on the destination
     * @param name          The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("scatterWithDataTensor:updatesTensor:indicesTensor:axis:mode:name:")
    public native MPSGraphTensor scatterWithDataTensorUpdatesTensorIndicesTensorAxisModeName(MPSGraphTensor dataTensor,
            MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, @NInt long axis, @NInt long mode, String name);

    @Generated
    @Selector("selectWithPredicateTensor:truePredicateTensor:falsePredicateTensor:name:")
    public native MPSGraphTensor selectWithPredicateTensorTruePredicateTensorFalsePredicateTensorName(
            MPSGraphTensor predicateTensor, MPSGraphTensor truePredicateTensor, MPSGraphTensor falseSelectTensor,
            String name);

    /**
     * [@property] options
     * <p>
     * options for the graph, default value is MPSGraphOptionsDefault
     */
    @Generated
    @Selector("setOptions:")
    public native void setOptions(long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create shapeof op and return the result tensor
     * <p>
     * Returns a 1D Int32 tensor with value the static shape of the input tensor
     *
     * @param tensor Input tensor
     * @param name   The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("shapeOfTensor:name:")
    public native MPSGraphTensor shapeOfTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("sigmoidGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor sigmoidGradientWithIncomingGradientSourceTensorName(MPSGraphTensor gradient,
            MPSGraphTensor source, String name);

    @Generated
    @Selector("sigmoidWithTensor:name:")
    public native MPSGraphTensor sigmoidWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("signWithTensor:name:")
    public native MPSGraphTensor signWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("signbitWithTensor:name:")
    public native MPSGraphTensor signbitWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("sinWithTensor:name:")
    public native MPSGraphTensor sinWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("sinhWithTensor:name:")
    public native MPSGraphTensor sinhWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create strided slice gradient op and return the result tensor
     *
     * @param inputGradientTensor Input gradient
     * @param fwdInShapeTensor    Shape of the forward pass input = shape of gradient output
     * @param starts              Array of numbers specifying starting point per dimension
     * @param ends                Array of numbers specifying ending point per dimension
     * @param strides             Array of numbers specifying strides per dimension
     * @param name                The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceGradientTensorFwdInShapeTensorStartsEndsStridesName(
            MPSGraphTensor inputGradientTensor, MPSGraphTensor fwdInShapeTensor, NSArray<? extends NSNumber> starts,
            NSArray<? extends NSNumber> ends, NSArray<? extends NSNumber> strides, String name);

    /**
     * Create strided slice gradient op and return the result tensor
     *
     * @param inputGradientTensor Input gradient
     * @param fwdInShapeTensor    Shape of the forward pass input = shape of gradient output
     * @param starts              Array of numbers specifying starting point per dimension
     * @param ends                Array of numbers specifying ending point per dimension
     * @param strides             Array of numbers specifying strides per dimension
     * @param startMask           Bitmask indicating dimensions whose `starts` values should be ignored.
     * @param endMask             Bitmask indicating dimensions whose `ends` values should be ignored.
     * @param squeezeMask         Bitmask indicating dimensions that should be squeezed out from the result.
     * @param name                The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceGradientTensorFwdInShapeTensorStartsEndsStridesStartMaskEndMaskSqueezeMaskName(
            MPSGraphTensor inputGradientTensor, MPSGraphTensor fwdInShapeTensor, NSArray<? extends NSNumber> starts,
            NSArray<? extends NSNumber> ends, NSArray<? extends NSNumber> strides, int startMask, int endMask,
            int squeezeMask, String name);

    @Generated
    @Selector("sliceTensor:dimension:start:length:name:")
    public native MPSGraphTensor sliceTensorDimensionStartLengthName(MPSGraphTensor tensor, @NUInt long dimensionIndex,
            @NInt long start, @NInt long length, String name);

    /**
     * Create strided slice op and return the result tensor
     * <p>
     * Slices a tensor starting from `starts`, stopping short before `ends` stepping
     * `strides` paces between each value. Semantics based on
     * https://www.tensorflow.org/api_docs/python/tf/strided_slice.
     *
     * @param tensor  Tensor to be sliced
     * @param starts  Array of numbers specifying starting point per dimension
     * @param ends    Array of numbers specifying ending point per dimension
     * @param strides Array of numbers specifying strides per dimension
     * @param name    The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("sliceTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceTensorStartsEndsStridesName(MPSGraphTensor tensor,
            NSArray<? extends NSNumber> starts, NSArray<? extends NSNumber> ends, NSArray<? extends NSNumber> strides,
            String name);

    /**
     * Create strided slice op and return the result tensor
     * <p>
     * Slices a tensor starting from `starts`, stopping short before `ends` stepping
     * `strides` paces between each value. Semantics based on
     * https://www.tensorflow.org/api_docs/python/tf/strided_slice.
     *
     * @param tensor      Tensor to be sliced
     * @param starts      Array of numbers specifying starting point per dimension
     * @param ends        Array of numbers specifying ending point per dimension
     * @param strides     Array of numbers specifying strides per dimension
     * @param startMask   Bitmask indicating dimensions whose `starts` values should be ignored.
     * @param endMask     Bitmask indicating dimensions whose `ends` values should be ignored.
     * @param squeezeMask Bitmask indicating dimensions that should be squeezed out from the result.
     * @param name        The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("sliceTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceTensorStartsEndsStridesStartMaskEndMaskSqueezeMaskName(MPSGraphTensor tensor,
            NSArray<? extends NSNumber> starts, NSArray<? extends NSNumber> ends, NSArray<? extends NSNumber> strides,
            int startMask, int endMask, int squeezeMask, String name);

    /**
     * Create a softmax cross entropy loss op and return the result tensor
     *
     * @param gradientTensor gradientTensor
     * @param sourceTensor   sourceTensor
     * @param labelsTensor   labelsTensor
     * @param axis           axis over which loss reuction happens
     * @param reductionType  reductionType which reduces across all other axes
     * @param name           name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("softMaxCrossEntropyGradientWithIncomingGradientTensor:sourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropyGradientWithIncomingGradientTensorSourceTensorLabelsTensorAxisReductionTypeName(
            MPSGraphTensor gradientTensor, MPSGraphTensor sourceTensor, MPSGraphTensor labelsTensor, @NInt long axis,
            long reductionType, String name);

    /**
     * Create a softmax cross entropy loss op and return the result tensor
     *
     * @param sourceTensor  sourceTensor
     * @param labelsTensor  labelsTensor
     * @param axis          axis over which loss reuction happens
     * @param reductionType reductionType which reduces across all other axes
     * @param name          name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("softMaxCrossEntropyWithSourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropyWithSourceTensorLabelsTensorAxisReductionTypeName(
            MPSGraphTensor sourceTensor, MPSGraphTensor labelsTensor, @NInt long axis, long reductionType, String name);

    @Generated
    @Selector("softMaxGradientWithIncomingGradient:sourceTensor:axis:name:")
    public native MPSGraphTensor softMaxGradientWithIncomingGradientSourceTensorAxisName(MPSGraphTensor gradient,
            MPSGraphTensor source, @NInt long axis, String name);

    @Generated
    @Selector("softMaxWithTensor:axis:name:")
    public native MPSGraphTensor softMaxWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis, String name);

    @Generated
    @Selector("spaceToDepth2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensorWidthAxisHeightAxisDepthAxisBlockSizeUsePixelShuffleOrderName(
            MPSGraphTensor tensor, @NUInt long widthAxis, @NUInt long heightAxis, @NUInt long depthAxis,
            @NUInt long blockSize, boolean usePixelShuffleOrder, String name);

    @Generated
    @Selector("spaceToDepth2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensorWidthAxisTensorHeightAxisTensorDepthAxisTensorBlockSizeUsePixelShuffleOrderName(
            MPSGraphTensor tensor, MPSGraphTensor widthAxisTensor, MPSGraphTensor heightAxisTensor,
            MPSGraphTensor depthAxisTensor, @NUInt long blockSize, boolean usePixelShuffleOrder, String name);

    @Generated
    @Selector("squareRootWithTensor:name:")
    public native MPSGraphTensor squareRootWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("squareWithTensor:name:")
    public native MPSGraphTensor squareWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * stencil operation
     * <p>
     * Performs a weighted reduction operation (`reductionMode`) on the last 4 dimensions of the `source`
     * over the window determined by `weights`, acc. to the given `strides` and `dilationRates` and `paddingStyle`.
     * `boundaryMode` determines what values to pad the `input` with. `offsets` are used to determine where
     * to start reading the `input` from. `explicitPadding` can also be provided when using relevant paddingStyles.
     * <p>
     * y[i] = reduction { x[ i + j ] * w[j] }
     *
     * @param source     Tensor containing source data. Must be of rank 4 or greater.
     * @param weights    4-D Tensor containing the weights data.
     * @param descriptor Descriptor object that specifies strides, dilationRates etc.
     * @param name       The name for the operation.
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("stencilWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor stencilWithSourceTensorWeightsTensorDescriptorName(MPSGraphTensor source,
            MPSGraphTensor weights, MPSGraphStencilOpDescriptor descriptor, String name);

    /**
     * StochasticGradientDescent
     * <p>
     * The StochasticGradientDescent performs a gradient descent
     * <p>
     * variable = variable - (learningRate * g)
     * <p>
     * where,
     * g is gradient of error wrt variable
     */
    @Generated
    @Selector("stochasticGradientDescentWithLearningRateTensor:valuesTensor:gradientTensor:name:")
    public native MPSGraphTensor stochasticGradientDescentWithLearningRateTensorValuesTensorGradientTensorName(
            MPSGraphTensor learningRateTensor, MPSGraphTensor valuesTensor, MPSGraphTensor gradientTensor, String name);

    /**
     * Create Subtract op and return the result tensor, it supports broadcasting as well
     * <p>
     * [@code]
     * resultTensor = primaryTensor - secondaryTensor
     * [@endcode]
     *
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("subtractionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor subtractionWithPrimaryTensorSecondaryTensorName(MPSGraphTensor primaryTensor,
            MPSGraphTensor secondaryTensor, String name);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("tanWithTensor:name:")
    public native MPSGraphTensor tanWithTensorName(MPSGraphTensor tensor, String name);

    @Generated
    @Selector("tanhWithTensor:name:")
    public native MPSGraphTensor tanhWithTensorName(MPSGraphTensor tensor, String name);

    /**
     * Create TopKGradient op and return the result tensor
     * <p>
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * To perform a vertical TopK a transpose can be inserted at the minor dimension of the
     * incoming tensor.
     *
     * @param gradient Tensor containing the incoming gradient
     * @param source   Tensor containing source data
     * @param k        The number of largest values to return
     * @param name     The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("topKWithGradientTensor:source:k:name:")
    public native MPSGraphTensor topKWithGradientTensorSourceKName(MPSGraphTensor gradient, MPSGraphTensor source,
            @NUInt long k, String name);

    /**
     * Create TopKGradient op and return the result tensor
     * <p>
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * To perform a vertical TopK a transpose can be inserted at the minor dimension of the
     * incoming tensor.
     *
     * @param gradient Tensor containing the incoming gradient
     * @param source   Tensor containing source data
     * @param kTensor  Tensor of the number of largest values to return
     * @param name     The name for the operation
     * @return A valid MPSGraphTensor object
     */
    @Generated
    @Selector("topKWithGradientTensor:source:kTensor:name:")
    public native MPSGraphTensor topKWithGradientTensorSourceKTensorName(MPSGraphTensor gradient, MPSGraphTensor source,
            MPSGraphTensor kTensor, String name);

    /**
     * Create TopK op and return the value and indices tensors
     * <p>
     * Finds the k largest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the top values, and the second
     * array corresponds to the indices of the top values.
     * To perform a vertical TopK a transpose can be inserted at the minor dimension of the
     * incoming tensor.
     *
     * @param source Tensor containing source data
     * @param k      The number of largest values to return
     * @param name   The name for the operation
     * @return A valid MPSGraphTensor array of size 2
     */
    @Generated
    @Selector("topKWithSourceTensor:k:name:")
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorKName(MPSGraphTensor source, @NUInt long k,
            String name);

    /**
     * Create TopK op and return the result tensor
     * <p>
     * Finds the k largest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the top values, and the second
     * array corresponds to the indices of the top values.
     * To perform a vertical TopK a transpose can be inserted at the minor dimension of the
     * incoming tensor.
     *
     * @param source  Tensor containing source data
     * @param kTensor Tensor of the number of largest values to return
     * @param name    The name for the operation
     * @return A valid MPSGraphTensor array of size 2
     */
    @Generated
    @Selector("topKWithSourceTensor:kTensor:name:")
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorKTensorName(MPSGraphTensor source,
            MPSGraphTensor kTensor, String name);

    @Generated
    @Selector("transposeTensor:dimension:withDimension:name:")
    public native MPSGraphTensor transposeTensorDimensionWithDimensionName(MPSGraphTensor tensor,
            @NUInt long dimensionIndex, @NUInt long dimensionIndex2, String name);

    /**
     * Create a variance op and return the result tensor
     *
     * @param axes A list of axes over which to perform the reduction. Tthe order of dimensions goes from the slowest
     *             moving at axis=0 to the fastest moving dimension.
     * @param name name for the placeholder operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("varianceOfTensor:axes:name:")
    public native MPSGraphTensor varianceOfTensorAxesName(MPSGraphTensor tensor, NSArray<? extends NSNumber> axes,
            String name);

    /**
     * Create a variance op when you already have a precomputed mean and return the result tensor
     *
     * @param axes A list of axes over which to perform the reduction such that the order of dimensions goes from the
     *             slowest moving at axis=0 to the fastest moving dimension.
     * @param name name for the placeholder operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("varianceOfTensor:meanTensor:axes:name:")
    public native MPSGraphTensor varianceOfTensorMeanTensorAxesName(MPSGraphTensor tensor, MPSGraphTensor meanTensor,
            NSArray<? extends NSNumber> axes, String name);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Adds a whileLoop operation
     *
     * @param initialInputs inputTensors to the whileBeforeBlock, for the 1st iteration will be same as initialInputs
     *                      passed to the whileLoop
     * @param before        beforeBlock, this will be run first and then call the afterBlock with results or return
     *                      results from the loop
     * @param after         afterBlock, this will execute after the condition evaluation
     * @param name          name of operation
     * @return A valid MPSGraphTensor array with results returned from the conditionBlock depending on the
     *         predicateTensor
     */
    @Generated
    @Selector("whileWithInitialInputs:before:after:name:")
    public native NSArray<? extends MPSGraphTensor> whileWithInitialInputsBeforeAfterName(
            NSArray<? extends MPSGraphTensor> initialInputs,
            @ObjCBlock(name = "call_whileWithInitialInputsBeforeAfterName_1") Block_whileWithInitialInputsBeforeAfterName_1 before,
            @ObjCBlock(name = "call_whileWithInitialInputsBeforeAfterName_2") Block_whileWithInitialInputsBeforeAfterName_2 after,
            String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_whileWithInitialInputsBeforeAfterName_1 {
        @Generated
        MPSGraphTensor call_whileWithInitialInputsBeforeAfterName_1(NSArray<? extends MPSGraphTensor> inputTensors,
                NSMutableArray<MPSGraphTensor> resultTensors);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_whileWithInitialInputsBeforeAfterName_2 {
        @Generated
        NSArray<? extends MPSGraphTensor> call_whileWithInitialInputsBeforeAfterName_2(
                NSArray<? extends MPSGraphTensor> bodyBlockArguments);
    }

    /**
     * Creates an MPSGraphTensor representing state using the Philox algorithm with given counter and key values.
     * <p>
     * See randomPhiloxStateTensorWithSeed.
     *
     * @param counterLow  The value to initilaize lower 64 bits of counter to. Philox utilizes a 128 bit counter
     * @param counterHigh The value to initilaize upper 64 bits of counter to. Philox utilizes a 128 bit counter
     * @param key         The value to initialize the key to in Philox algorithm.
     * @return An MPSGraphTensor representing a random state, to be passed as an input to a random op.
     */
    @Generated
    @Selector("randomPhiloxStateTensorWithCounterLow:counterHigh:key:name:")
    public native MPSGraphTensor randomPhiloxStateTensorWithCounterLowCounterHighKeyName(@NUInt long counterLow,
            @NUInt long counterHigh, @NUInt long key, String name);

    /**
     * Creates an MPSGraphTensor representing state using the Philox algorithm with given counter and key values.
     * <p>
     * Generates random numbers using the Philox counter-based algorithm, for further details see:
     * John K. Salmon, Mark A. Moraes, Ron O. Dror, and David E. Shaw. Parallel Random Numbers: As Easy as 1, 2, 3.
     * <p>
     * A stateTensor generated with this API can be used in MPSGraph Random APIs which accept a stateTensor. The
     * updated stateTensor is returned alongside the random values, and can be fed to the following random layer. In
     * most use cases, a stateTensor should only need to be initialized once at the start of the graph. A stateTensor
     * can
     * be set as a target tensor of an MPSGraph execution to obtain a stateTensor serialized as an NDArray. This can be
     * used as input to a placeholder in the graph to avoid ever needing to have a state intilization layer in an
     * MPSGraph.
     * This can allow for a continued stream through multiple executions of a single MPSGraph by having the final
     * stateTensor as a target tensor passed into the following MPSGraph execution as a placeholder input. This may be
     * helpful for training graphs in particular.
     * <p>
     * [@code]
     * MPSGraph *graph = [MPSGraph new];
     * MPSGraphTensor *stateTensor = [graph randomPhiloxStateTensorWithSeed: seed name: nil];
     * NSArray<MPSGraphTensor*> *resultTensors0 = [graph randomUniformTensorWithShape:@[@10, @10]
     * stateTensor:stateTensor
     * name:nil];
     * NSArray<MPSGraphTensor*> *resultTensors1 = [graph randomUniformTensorWithShape:@[@10, @10]
     * stateTensor:resultTensors0[1]
     * name:nil];
     * <p>
     * [@endcode]
     *
     * @param seed Initial counter and key values will be generated using seed.
     * @return An MPSGraphTensor representing a random state, to be passed as an input to a random op.
     */
    @Generated
    @Selector("randomPhiloxStateTensorWithSeed:name:")
    public native MPSGraphTensor randomPhiloxStateTensorWithSeedName(@NUInt long seed, String name);

    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:name:")
    public native MPSGraphTensor randomTensorWithShapeTensorDescriptorName(MPSGraphTensor shapeTensor,
            MPSGraphRandomOpDescriptor descriptor, String name);

    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:seed:name:")
    public native MPSGraphTensor randomTensorWithShapeTensorDescriptorSeedName(MPSGraphTensor shapeTensor,
            MPSGraphRandomOpDescriptor descriptor, @NUInt long seed, String name);

    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:stateTensor:name:")
    public native NSArray<? extends MPSGraphTensor> randomTensorWithShapeTensorDescriptorStateTensorName(
            MPSGraphTensor shapeTensor, MPSGraphRandomOpDescriptor descriptor, MPSGraphTensor state, String name);

    @Generated
    @Selector("randomUniformTensorWithShapeTensor:name:")
    public native MPSGraphTensor randomUniformTensorWithShapeTensorName(MPSGraphTensor shapeTensor, String name);

    @Generated
    @Selector("randomUniformTensorWithShapeTensor:seed:name:")
    public native MPSGraphTensor randomUniformTensorWithShapeTensorSeedName(MPSGraphTensor shapeTensor,
            @NUInt long seed, String name);

    @Generated
    @Selector("randomUniformTensorWithShapeTensor:stateTensor:name:")
    public native NSArray<? extends MPSGraphTensor> randomUniformTensorWithShapeTensorStateTensorName(
            MPSGraphTensor shapeTensor, MPSGraphTensor state, String name);

    /**
     * Create reduction max propagate NaN op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMaximumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaNWithTensorAxesName(MPSGraphTensor tensor,
            NSArray<? extends NSNumber> axes, String name);

    /**
     * Create reduction max propagate NaN op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMaximumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaNWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis,
            String name);

    /**
     * Create reduction min propagate NaN op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMinimumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimumPropagateNaNWithTensorAxesName(MPSGraphTensor tensor,
            NSArray<? extends NSNumber> axes, String name);

    /**
     * Create reduction min propagate NaN op and return the result tensor.
     *
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * @return A valid MPSGraphTensor object.
     */
    @Generated
    @Selector("reductionMinimumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimumPropagateNaNWithTensorAxisName(MPSGraphTensor tensor, @NInt long axis,
            String name);
}
