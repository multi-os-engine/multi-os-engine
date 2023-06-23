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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSGraph
 * 
 * Optimized representation of a compute graph of MPSGraphOperations and MPSGraphTensors
 * 
 * An MPSGraph is a symbolic representation of operations to be utilized to execute compute graphs on a device.
 * 
 * 
 * API-Since: 14.0
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

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("L2NormPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("L2NormPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("absoluteWithTensor:name:")
    public native MPSGraphTensor absoluteWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @NotNull
    @Generated
    @Selector("acosWithTensor:name:")
    public native MPSGraphTensor acosWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("acoshWithTensor:name:")
    public native MPSGraphTensor acoshWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create Add op and return the result tensor, it supports broadcasting as well
     * 
     * [@code]
     * resultTensor = primaryTensor + secondaryTensor
     * [@endcode]
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("additionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor additionWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraph alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraph allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("applyStochasticGradientDescentWithLearningRateTensor:variable:gradientTensor:name:")
    public native MPSGraphOperation applyStochasticGradientDescentWithLearningRateTensorVariableGradientTensorName(
            @NotNull MPSGraphTensor learningRateTensor, @NotNull MPSGraphVariableOp variable,
            @NotNull MPSGraphTensor gradientTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("asinWithTensor:name:")
    public native MPSGraphTensor asinWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("asinhWithTensor:name:")
    public native MPSGraphTensor asinhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create a read op which reads at this point of execution of the graph and return the result tensor
     * 
     * @param variable variable resource tensor to read from
     * @param tensor   tensor to assign to variable
     * @param name     name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("assignVariable:withValueOfTensor:name:")
    public native MPSGraphOperation assignVariableWithValueOfTensorName(@NotNull MPSGraphTensor variable,
            @NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("atan2WithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor atan2WithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("atanWithTensor:name:")
    public native MPSGraphTensor atanWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("atanhWithTensor:name:")
    public native MPSGraphTensor atanhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("avgPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("avgPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("avgPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("avgPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Create broadcast op and return the result tensor
     * 
     * Broadcast values inside the tensor, starting from the trailing dimensions, to give it the correct shape.
     * This is equivalent to the broadcasting for arithmetic operations when operands have different shapes.
     * 
     * @param tensor      Tensor to be broadcasted
     * @param shapeTensor 1D Int32 or Int64 tensor. Shape of the result tensor
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("broadcastTensor:toShapeTensor:name:")
    public native MPSGraphTensor broadcastTensorToShapeTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor shapeTensor, @Nullable String name);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Create cast op and return the result tensor
     * 
     * Returns input tensor casted to the dataType passed in
     * 
     * @param tensor Input tensor
     * @param type   Input tensor
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("castTensor:toType:name:")
    public native MPSGraphTensor castTensorToTypeName(@NotNull MPSGraphTensor tensor, int type, @Nullable String name);

    @NotNull
    @Generated
    @Selector("ceilWithTensor:name:")
    public native MPSGraphTensor ceilWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("clampWithTensor:minValueTensor:maxValueTensor:name:")
    public native MPSGraphTensor clampWithTensorMinValueTensorMaxValueTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor minValueTensor, @NotNull MPSGraphTensor maxValueTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Create concat op and return the result tensor
     * 
     * Concatenate two input tensors along sepecified dimension. Tensors must be broadcast
     * compatible along all other dimensions, and have the same type.
     * 
     * @param tensor         First tensor to concatenate
     * @param tensor2        Second tensor to concatenate
     * @param dimensionIndex The dimension to concatenate across, must be in range - rank <= dimension < rank
     * @param name           The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("concatTensor:withTensor:dimension:name:")
    public native MPSGraphTensor concatTensorWithTensorDimensionName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor tensor2, @NInt long dimensionIndex, @Nullable String name);

    /**
     * Create concat op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("concatTensors:dimension:interleave:name:")
    public native MPSGraphTensor concatTensorsDimensionInterleaveName(
            @NotNull NSArray<? extends MPSGraphTensor> tensors, @NInt long dimensionIndex, boolean interleave,
            @Nullable String name);

    /**
     * Create concat op and return the result tensor
     * 
     * Concatenate all input tensors along specified dimension. All inputs must be broadcast
     * compatible along all other dimensions, and have the same type.
     * 
     * @param tensors        Tensors to concatenate
     * @param dimensionIndex The dimension to concatenate across, must be in range - rank <= dimension < rank
     * @param name           The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("concatTensors:dimension:name:")
    public native MPSGraphTensor concatTensorsDimensionName(@NotNull NSArray<? extends MPSGraphTensor> tensors,
            @NInt long dimensionIndex, @Nullable String name);

    /**
     * Create a constant op and return the result tensor
     * 
     * @param scalar   scalar to fill the entire tensor values with
     * @param dataType dataType of the constant tensor
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
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
     * 
     * @return A valid MPSGraphTensor array with results returned from dependentBlock forwarded
     */
    @NotNull
    @Generated
    @Selector("controlDependencyWithOperations:dependentBlock:name:")
    public native NSArray<? extends MPSGraphTensor> controlDependencyWithOperationsDependentBlockName(
            @NotNull NSArray<? extends MPSGraphOperation> operations,
            @NotNull @ObjCBlock(name = "call_controlDependencyWithOperationsDependentBlockName") Block_controlDependencyWithOperationsDependentBlockName dependentBlock,
            @Nullable String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_controlDependencyWithOperationsDependentBlockName {
        @NotNull
        @Generated
        NSArray<? extends MPSGraphTensor> call_controlDependencyWithOperationsDependentBlockName();
    }

    /**
     * Create Convolution gradient op and return the result tensor
     * 
     * Computes the gradient of source input for the forward pass Convolution op with identical parameters.
     * See discussion of convolution2DWithSourceTensor for more in depth description of paramters.
     * 
     * @param gradient                     Incoming gradient tensor
     * @param weights                      Forward pass weights tensor
     * @param outputShapeTensor            1D Int32 or Int64 Tensor. Shape of the forward pass source tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolution2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DDataGradientWithIncomingGradientTensorWeightsTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphTensor outputShapeTensor,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Create Convolution gradient op and return the result tensor
     * 
     * Computes the gradient of weights input for the forward pass Convolution op with identical parameters.
     * See discussion of convolution2DWithSourceTensor for more in depth description of paramters.
     * 
     * @param gradient                     Incoming gradient tensor
     * @param source                       Forward pass source tensor
     * @param outputShapeTensor            1D int32 or Int64 Tensor. Shape of the forward pass weights tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolution2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DWeightsGradientWithIncomingGradientTensorSourceTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor outputShapeTensor,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("convolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor convolution2DWithSourceTensorWeightsTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphConvolution2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Create ConvolutionTranspose gradient op and return the result tensor
     * 
     * Computes the gradient of source input for the forward pass ConvolutionTranspose op with identical parameters.
     * See discussion of convolutionTranspose2DWithSourceTensor for more in depth description of paramters.
     * 
     * @param incomingGradient             Incoming gradient tensor
     * @param weights                      Forward pass weights tensor
     * @param outputShape                  1D Int32 or Int64 Tensor. Shape of the forward pass source tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolutionTranspose2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DDataGradientWithIncomingGradientTensorWeightsTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor incomingGradient, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Create ConvolutionTranspose gradient op and return the result tensor
     * 
     * Computes the gradient of weights input for the forward pass ConvolutionTranspose op with identical parameters.
     * See discussion of convolutionTranspose2DWithSourceTensor for more in depth description of paramters.
     * 
     * @param incomingGradientTensor       Incoming gradient tensor
     * @param source                       Forward pass source tensor
     * @param outputShape                  1D Int32 or Int64 Tensor. Shape of the forward pass source weights tensor
     * @param forwardConvolutionDescriptor Forward pass op descriptor
     * @param name                         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolutionTranspose2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWeightsGradientWithIncomingGradientTensorSourceTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Create ConvolutionTranspose op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolutionTranspose2DWithSourceTensor:weightsTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWithSourceTensorWeightsTensorOutputShapeTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights, @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphConvolution2DOpDescriptor descriptor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("cosWithTensor:name:")
    public native MPSGraphTensor cosWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("coshWithTensor:name:")
    public native MPSGraphTensor coshWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Create depth-to-space2d op and return the result tensor
     * 
     * This operation outputs a copy of the input tensor, where values from the
     * `depthAxis` dimension are moved in spatial blocks of size `blockSize` to the
     * `heightAxis` and `widthAxis` dimensions. `usePixelShuffleOrder` can be
     * used to control how the data within spatial blocks is ordered in the
     * `depthAxis` dimension: with `usePixelShuffleOrder = YES` the values within the
     * spatial block are stored contiguosly within the `depthAxis` dimension whereas
     * without it they are stored interleaved with existing values in the `depthAxisTensor`
     * dimension.
     * This operation is the inverse of `spaceToDepth2D`
     * 
     * @param tensor               The input tensor.
     * @param widthAxis            Axis that defines the fastest running dimension within the block.
     * @param heightAxis           Axis that defines the 2nd fastest running dimension within the block.
     * @param depthAxis            Axis that defines the source dimension, from which to copy the blocks.
     * @param blockSize            Size of the square spatial sub-block.
     * @param usePixelShuffleOrder Controls layout of the sub-blocks within the depth dimension.
     * @param name                 The name for the operation.
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("depthToSpace2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensorWidthAxisHeightAxisDepthAxisBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NUInt long widthAxis, @NUInt long heightAxis, @NUInt long depthAxis,
            @NUInt long blockSize, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("depthToSpace2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensorWidthAxisTensorHeightAxisTensorDepthAxisTensorBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor widthAxisTensor,
            @NotNull MPSGraphTensor heightAxisTensor, @NotNull MPSGraphTensor depthAxisTensor, @NUInt long blockSize,
            boolean usePixelShuffleOrder, @Nullable String name);

    @NotNull
    @Generated
    @Selector("depthwiseConvolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution2DWithSourceTensorWeightsTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphDepthwiseConvolution2DOpDescriptor descriptor, @Nullable String name);

    /**
     * * @abstract Create 3d depthwise convolution operation and return the result tensor.
     * * @discussion Just like depthwise convolution2d, but in three dimensions. Different layouts are supported by
     * using
     * * the @code channelDimensionIndex @endcode property. If your weights need a different layout
     * * add a permute operation on them before this operation.
     * 
     * * @param source 3d Image source as tensor - must be at least rank=4 (CDHW when channelDimensionIndex = -4).
     * * @param weights Weights tensor, must be rank=4 - axes are interpreted as CDHW when channelDimensionIndex = -4 .
     * * @param descriptor Specifies strides, dilation rates and paddings.
     * * @param name The name for the operation.
     * *
     * * @return A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("depthwiseConvolution3DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution3DWithSourceTensorWeightsTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphDepthwiseConvolution3DOpDescriptor descriptor, @Nullable String name);

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("divisionNoNaNWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor divisionNoNaNWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Create Divide op and return the result tensor, it supports broadcasting as well
     * 
     * [@code]
     * resultTensor = primaryTensor / secondaryTensor
     * [@endcode]
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("divisionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor divisionWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("dropoutTensor:rate:name:")
    public native MPSGraphTensor dropoutTensorRateName(@NotNull MPSGraphTensor tensor, double rate,
            @Nullable String name);

    @NotNull
    @Generated
    @Selector("dropoutTensor:rateTensor:name:")
    public native MPSGraphTensor dropoutTensorRateTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor rate, @Nullable String name);

    @NotNull
    @Generated
    @Selector("equalWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor equalWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("erfWithTensor:name:")
    public native MPSGraphTensor erfWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("exponentBase10WithTensor:name:")
    public native MPSGraphTensor exponentBase10WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("exponentBase2WithTensor:name:")
    public native MPSGraphTensor exponentBase2WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("exponentWithTensor:name:")
    public native MPSGraphTensor exponentWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create flatten2d op and return the result tensor
     * 
     * Flattens dimensions before `axis` to `result[0]` and dimensions starting
     * from `axis` to `result[1]` and returns a rank-2 tensor as result.
     * 
     * @param tensor Tensor to be flattened
     * @param axis   Axis around which to flatten
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("flatten2DTensor:axis:name:")
    public native MPSGraphTensor flatten2DTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create flatten2d op and return the result tensor
     * 
     * Flattens dimensions before `axis` to `result[0]` and dimensions starting
     * from `axis` to `result[1]` and returns a rank-2 tensor as result.
     * 
     * @param tensor     Tensor to be flattened
     * @param axisTensor Axis around which to flatten
     * @param name       The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("flatten2DTensor:axisTensor:name:")
    public native MPSGraphTensor flatten2DTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("floorModuloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor floorModuloWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("floorWithTensor:name:")
    public native MPSGraphTensor floorWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

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
     * 
     * @return A valid MPSGraphTensor array with same count and corresponding elementTypes as initialIterationArguments
     *         and return types of the forLoop
     */
    @NotNull
    @Generated
    @Selector("forLoopWithLowerBound:upperBound:step:initialBodyArguments:body:name:")
    public native NSArray<? extends MPSGraphTensor> forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName(
            @NotNull MPSGraphTensor lowerBound, @NotNull MPSGraphTensor upperBound, @NotNull MPSGraphTensor step,
            @NotNull NSArray<? extends MPSGraphTensor> initialBodyArguments,
            @NotNull @ObjCBlock(name = "call_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName") Block_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName body,
            @Nullable String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName {
        @NotNull
        @Generated
        NSArray<? extends MPSGraphTensor> call_forLoopWithLowerBoundUpperBoundStepInitialBodyArgumentsBodyName(
                @NotNull MPSGraphTensor index, @NotNull NSArray<? extends MPSGraphTensor> iterationArguments);
    }

    /**
     * Adds a forLoop operation, with a specific number of iterations
     * 
     * @param numberOfIterations   tensor with number of iterations the loop will execute
     * @param initialBodyArguments initial set of iteration arguments passed to the bodyBlock of the for loop
     * @param body                 bodyBlock, this will execute the body of the forLoop, index will go from 0 to
     *                             numberOfIterations-1
     * @param name                 name of operation
     * 
     * @return A valid MPSGraphTensor array with same count and corresponding elementTypes as initialIterationArguments
     *         and return types of the forLoop
     */
    @NotNull
    @Generated
    @Selector("forLoopWithNumberOfIterations:initialBodyArguments:body:name:")
    public native NSArray<? extends MPSGraphTensor> forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName(
            @NotNull MPSGraphTensor numberOfIterations, @NotNull NSArray<? extends MPSGraphTensor> initialBodyArguments,
            @NotNull @ObjCBlock(name = "call_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName") Block_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName body,
            @Nullable String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName {
        @NotNull
        @Generated
        NSArray<? extends MPSGraphTensor> call_forLoopWithNumberOfIterationsInitialBodyArgumentsBodyName(
                @NotNull MPSGraphTensor index, @NotNull NSArray<? extends MPSGraphTensor> iterationArguments);
    }

    /**
     * Create GatherND op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("gatherNDWithUpdatesTensor:indicesTensor:batchDimensions:name:")
    public native MPSGraphTensor gatherNDWithUpdatesTensorIndicesTensorBatchDimensionsName(
            @NotNull MPSGraphTensor updatesTensor, @NotNull MPSGraphTensor indicesTensor, @NUInt long batchDimensions,
            @Nullable String name);

    /**
     * Create Gather op and return the result tensor
     * 
     * Gathers the values in updatesTensor to the result tensor along the indices in indicesTensor.
     * The gather is defined as
     * [@code]
     * B = batchDims
     * U = updates.rank
     * P = res.rank
     * Q = inds.rank
     * 
     * res[p_{0},...p_{axis-1}, i_{B},...,i_{Q}, ...,p_{axis+1},...,p{U-1}] =
     * updates[p_{0},...p_{axis-1}, indices[p_{0},...,p_{B-1},i_{B},...,i_{Q}, ...,p_{axis+1},...,p{U-1}]
     * 
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
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("gatherWithUpdatesTensor:indicesTensor:axis:batchDimensions:name:")
    public native MPSGraphTensor gatherWithUpdatesTensorIndicesTensorAxisBatchDimensionsName(
            @NotNull MPSGraphTensor updatesTensor, @NotNull MPSGraphTensor indicesTensor, @NUInt long axis,
            @NUInt long batchDimensions, @Nullable String name);

    /**
     * Calculates partial derviative of primaryTensor wrt secondaryTensor
     * 
     * @param primaryTensor tensor to be differentiated (numerator)
     * @param tensors       tensors to do the differentiation with (denominator)
     * @param name          name for the gradient operation
     * 
     * @return A valid MPSGraphTensor dictionary object containing partial derivative
     *         d(primaryTensor)/d(secondaryTensor) for each tensor as key
     */
    @NotNull
    @Generated
    @Selector("gradientForPrimaryTensor:withTensors:name:")
    public native NSDictionary<? extends MPSGraphTensor, ? extends MPSGraphTensor> gradientForPrimaryTensorWithTensorsName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull NSArray<? extends MPSGraphTensor> tensors,
            @Nullable String name);

    @NotNull
    @Generated
    @Selector("greaterThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThanOrEqualToWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("greaterThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThanWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @NotNull
    @Generated
    @Selector("identityWithTensor:name:")
    public native MPSGraphTensor identityWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Add an if/then/else op to the graph
     * 
     * @param predicateTensor Tensor must have a single scalar value, used to decide between then/else branches
     * @param thenBlock       If predicate is true operations in this block are executed
     * @param elseBlock       If predicate is false operations in this block are executed
     * @param name            name of operation
     * 
     * @return results If no error, the tensors returned by user. If not empty, user must define both then/else block,
     *         both should have same number of arguments and each corresponding argument should have same elementTypes.
     */
    @NotNull
    @Generated
    @Selector("ifWithPredicateTensor:thenBlock:elseBlock:name:")
    public native NSArray<? extends MPSGraphTensor> ifWithPredicateTensorThenBlockElseBlockName(
            @NotNull MPSGraphTensor predicateTensor,
            @NotNull @ObjCBlock(name = "call_ifWithPredicateTensorThenBlockElseBlockName_1") Block_ifWithPredicateTensorThenBlockElseBlockName_1 thenBlock,
            @Nullable @ObjCBlock(name = "call_ifWithPredicateTensorThenBlockElseBlockName_2") Block_ifWithPredicateTensorThenBlockElseBlockName_2 elseBlock,
            @Nullable String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ifWithPredicateTensorThenBlockElseBlockName_1 {
        @NotNull
        @Generated
        NSArray<? extends MPSGraphTensor> call_ifWithPredicateTensorThenBlockElseBlockName_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ifWithPredicateTensorThenBlockElseBlockName_2 {
        @NotNull
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

    @NotNull
    @Generated
    @Selector("isFiniteWithTensor:name:")
    public native MPSGraphTensor isFiniteWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("isInfiniteWithTensor:name:")
    public native MPSGraphTensor isInfiniteWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("isNaNWithTensor:name:")
    public native MPSGraphTensor isNaNWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("leakyReLUGradientWithIncomingGradient:sourceTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLUGradientWithIncomingGradientSourceTensorAlphaTensorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor alphaTensor,
            @Nullable String name);

    /**
     * Leaky ReLU activation tensor
     * 
     * Specifies the leaky ReLU activation tensor.
     * For each pixel, applies the following function: f(x) = max(x, alpha * x)
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("leakyReLUWithTensor:alpha:name:")
    public native MPSGraphTensor leakyReLUWithTensorAlphaName(@NotNull MPSGraphTensor tensor, double alpha,
            @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("leakyReLUWithTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLUWithTensorAlphaTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor alphaTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("lessThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThanOrEqualToWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("lessThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThanWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logarithmBase10WithTensor:name:")
    public native MPSGraphTensor logarithmBase10WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logarithmBase2WithTensor:name:")
    public native MPSGraphTensor logarithmBase2WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logarithmWithTensor:name:")
    public native MPSGraphTensor logarithmWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logicalANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalANDWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logicalNANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNANDWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logicalNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logicalORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logicalXNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXNORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("logicalXORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Create MatMul op and return the result tensor, it supports broadcasting as well
     * 
     * [@code]
     * resultTensor = matmul(primaryTensor, secondaryTensor)
     * [@endcode]
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("matrixMultiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor matrixMultiplicationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("maxPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("maxPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("maxPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("maxPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Create Maximum op and return the result tensor, it supports broadcasting as well. If any of the operands is NaN,
     * NaN is returned
     * 
     * [@code]
     * resultTensor = isNaN(primaryTensor) || isNan(secondaryTensor) ? NaN : max(primaryTensor, secondaryTensor)
     * [@endcode]
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("maximumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximumWithNaNPropagationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("maximumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximumWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Create a mean op and return the result tensor
     * 
     * @param axes A list of axes over which to perform the reduction. The order of dimensions goes from the slowest
     *             moving at axis=0 to the fastest moving dimension.
     * @param name name for the placeholder operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("meanOfTensor:axes:name:")
    public native MPSGraphTensor meanOfTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create Minimum op and return the result tensor, it supports broadcasting as well. If any of the operands is NaN,
     * NaN is returned
     * 
     * [@code]
     * resultTensor = isNaN(primaryTensor) || isNan(secondaryTensor) ? NaN : min(primaryTensor, secondaryTensor)
     * [@endcode]
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("minimumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimumWithNaNPropagationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("minimumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimumWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("moduloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor moduloWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Create Multiply op and return the result tensor, it supports broadcasting as well
     * 
     * [@code]
     * resultTensor = primaryTensor * secondaryTensor
     * [@endcode]
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("multiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor multiplicationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("negativeWithTensor:name:")
    public native MPSGraphTensor negativeWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create a new MPSGraph to insert nodes in
     */
    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraph new_objc();

    @NotNull
    @Generated
    @Selector("normalizationBetaGradientWithIncomingGradientTensor:sourceTensor:reductionAxes:name:")
    public native MPSGraphTensor normalizationBetaGradientWithIncomingGradientTensorSourceTensorReductionAxesName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    @NotNull
    @Generated
    @Selector("normalizationGammaGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGammaGradientWithIncomingGradientTensorSourceTensorMeanTensorVarianceTensorReductionAxesEpsilonName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull MPSGraphTensor meanTensor, @NotNull MPSGraphTensor varianceTensor,
            @NotNull NSArray<? extends NSNumber> axes, float epsilon, @Nullable String name);

    @NotNull
    @Generated
    @Selector("normalizationGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:gammaTensor:gammaGradientTensor:betaGradientTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGradientWithIncomingGradientTensorSourceTensorMeanTensorVarianceTensorGammaTensorGammaGradientTensorBetaGradientTensorReductionAxesEpsilonName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull MPSGraphTensor meanTensor, @NotNull MPSGraphTensor varianceTensor, @Nullable MPSGraphTensor gamma,
            @Nullable MPSGraphTensor gammaGradient, @Nullable MPSGraphTensor betaGradient,
            @NotNull NSArray<? extends NSNumber> axes, float epsilon, @Nullable String name);

    /**
     * Create a batch normalization op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("normalizationWithTensor:meanTensor:varianceTensor:gammaTensor:betaTensor:epsilon:name:")
    public native MPSGraphTensor normalizationWithTensorMeanTensorVarianceTensorGammaTensorBetaTensorEpsilonName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor mean, @NotNull MPSGraphTensor variance,
            @Nullable MPSGraphTensor gamma, @Nullable MPSGraphTensor beta, float epsilon, @Nullable String name);

    @NotNull
    @Generated
    @Selector("notEqualWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor notEqualWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("notWithTensor:name:")
    public native MPSGraphTensor notWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:dataType:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisDataTypeName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, @NUInt long axis, int dataType, @Nullable String name);

    /**
     * Create oneHot op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisDataTypeOnValueOffValueName(
            @NotNull MPSGraphTensor indicesTensor, @NUInt long depth, @NUInt long axis, int dataType, double onValue,
            double offValue, @Nullable String name);

    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, @NUInt long axis, @Nullable String name);

    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:dataType:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthDataTypeName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, int dataType, @Nullable String name);

    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthDataTypeOnValueOffValueName(
            @NotNull MPSGraphTensor indicesTensor, @NUInt long depth, int dataType, double onValue, double offValue,
            @Nullable String name);

    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, @Nullable String name);

    /**
     * [@property] options
     * 
     * options for the graph, default value is MPSGraphOptionsDefault
     */
    @Generated
    @Selector("options")
    public native long options();

    /**
     * [@property] placeholderTensors
     * 
     * an array of all the placeholderTensors
     */
    @NotNull
    @Generated
    @Selector("placeholderTensors")
    public native NSArray<? extends MPSGraphTensor> placeholderTensors();

    @NotNull
    @Generated
    @Selector("powerWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor powerWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("reLUGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor reLUGradientWithIncomingGradientSourceTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @Nullable String name);

    @NotNull
    @Generated
    @Selector("reLUWithTensor:name:")
    public native MPSGraphTensor reLUWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create a read op which reads at this point of execution of the graph and return the result tensor
     * 
     * @param variable variable resource tensor to read from
     * @param name     name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("readVariable:name:")
    public native MPSGraphTensor readVariableName(@NotNull MPSGraphTensor variable, @Nullable String name);

    @NotNull
    @Generated
    @Selector("reciprocalWithTensor:name:")
    public native MPSGraphTensor reciprocalWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create reduction argMax op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reductionArgMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMaximumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction argMin op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reductionArgMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMinimumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction max op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximumWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction max op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction min op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimumWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction minimum op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction product op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionProductWithTensor:axes:name:")
    public native MPSGraphTensor reductionProductWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction product op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionProductWithTensor:axis:name:")
    public native MPSGraphTensor reductionProductWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction sum op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionSumWithTensor:axes:name:")
    public native MPSGraphTensor reductionSumWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction sum op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionSumWithTensor:axis:name:")
    public native MPSGraphTensor reductionSumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create Reshape op and return the result tensor
     * 
     * Reshape the input tensor to the target shapeTensor
     * The shape must be compatible with the input tensor shape
     * shapeTensor is allowed to contain dynamic dimensions (-1) when the result type can be inferred unambiguously
     * 
     * @param tensor      Tensor to be reshaped.
     * @param shapeTensor 1D Int32 or Int64 tensor. The result tensor shape
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reshapeTensor:withShapeTensor:name:")
    public native MPSGraphTensor reshapeTensorWithShapeTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor shapeTensor, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size. Result images will be distorted if size is of different aspect ratio.
     * Resize supports the following modes:
     * Nearest Neighbor - values are interpolated using the closest neighbor pixel
     * Bilinear - values are computed using bilinear interpolation of 4 neighboring pixels
     * 
     * Destination indices are computed using direct index scaling by default, with no offset added.
     * If the centerResult parameter is true, the destination indices will be scaled and shifted to be centered
     * on the input image.
     * If the alignCorners parameter is true, the corners of the result images will match the input images.
     * Scaling will be modified to a factor of (size - 1) / (inputSize - 1). When alignCorners is true, the
     * centerResult parameter does nothing.
     * 
     * In order to achieve the same behavior as OpenCV's resize and TensorFlowV2's resize,
     * [@code]
     * centerResult = YES;
     * alginCorners = NO;
     * [@endcode]
     * 
     * To achieve the same behavior as TensorFlowV1 resize
     * [@code]
     * centerResult = NO;
     * [@endcode]
     * 
     * @param imagesTensor Tensor containing input images.
     * @param size         1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * @param mode         The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be
     *                     used.
     * @param centerResult Controls if the result image is centered on the input image. When NO, the result will have
     *                     the top left corner aligned
     * @param alignCorners When YES, the result image will have the same value as the input image in the corners
     * @param layout       Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                     layout.
     *                     Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("resizeTensor:sizeTensor:mode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeTensorSizeTensorModeCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NUInt long mode, boolean centerResult,
            boolean alignCorners, @NUInt long layout, @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * @param gradient     Incoming gradient tensor
     * @param input        Forward pass input tensor
     * @param mode         The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be
     *                     used.
     * @param centerResult Controls if the result image is centered on the input image. When NO, the result will have
     *                     the top left corner aligned
     * @param alignCorners When YES, the result image will have the same value as the input image in the corners
     * @param layout       Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                     layout.
     *                     Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("resizeWithGradientTensor:input:mode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeWithGradientTensorInputModeCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NUInt long mode, boolean centerResult,
            boolean alignCorners, @NUInt long layout, @Nullable String name);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @NotNull
    @Generated
    @Selector("reverseSquareRootWithTensor:name:")
    public native MPSGraphTensor reverseSquareRootWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create reverse op and return the result tensor
     * 
     * Reverses a tensor on given axes
     * https://www.tensorflow.org/api_docs/python/tf/reverse.
     * 
     * @param tensor Tensor to be reversed
     * @param axes   Axes to be reversed (Axes must be unique and within normal axis range).
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reverseTensor:axes:name:")
    public native MPSGraphTensor reverseTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reverse op and return the result tensor
     * 
     * Reverses a tensor on given axes
     * https://www.tensorflow.org/api_docs/python/tf/reverse.
     * 
     * @param tensor     Tensor to be reversed
     * @param axesTensor Tensor that specifies axes to be reversed (Axes must be unique and within normal axis range).
     * @param name       The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reverseTensor:axesTensor:name:")
    public native MPSGraphTensor reverseTensorAxesTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @Nullable String name);

    /**
     * Create reverse op and return the result tensor
     * 
     * Reverses a tensor on all axes
     * https://www.tensorflow.org/api_docs/python/tf/reverse.
     * 
     * @param tensor Tensor to be reversed
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reverseTensor:name:")
    public native MPSGraphTensor reverseTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("rintWithTensor:name:")
    public native MPSGraphTensor rintWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("roundWithTensor:name:")
    public native MPSGraphTensor roundWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create ScatterND op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("scatterNDWithDataTensor:updatesTensor:indicesTensor:batchDimensions:mode:name:")
    public native MPSGraphTensor scatterNDWithDataTensorUpdatesTensorIndicesTensorBatchDimensionsModeName(
            @NotNull MPSGraphTensor dataTensor, @NotNull MPSGraphTensor updatesTensor,
            @NotNull MPSGraphTensor indicesTensor, @NUInt long batchDimensions, @NInt long mode, @Nullable String name);

    /**
     * Create Scatter op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("scatterWithDataTensor:updatesTensor:indicesTensor:axis:mode:name:")
    public native MPSGraphTensor scatterWithDataTensorUpdatesTensorIndicesTensorAxisModeName(
            @NotNull MPSGraphTensor dataTensor, @NotNull MPSGraphTensor updatesTensor,
            @NotNull MPSGraphTensor indicesTensor, @NInt long axis, @NInt long mode, @Nullable String name);

    @NotNull
    @Generated
    @Selector("selectWithPredicateTensor:truePredicateTensor:falsePredicateTensor:name:")
    public native MPSGraphTensor selectWithPredicateTensorTruePredicateTensorFalsePredicateTensorName(
            @NotNull MPSGraphTensor predicateTensor, @NotNull MPSGraphTensor truePredicateTensor,
            @NotNull MPSGraphTensor falseSelectTensor, @Nullable String name);

    /**
     * [@property] options
     * 
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
     * 
     * Returns a 1D Int32 tensor with value the static shape of the input tensor
     * 
     * @param tensor Input tensor
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("shapeOfTensor:name:")
    public native MPSGraphTensor shapeOfTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("sigmoidGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor sigmoidGradientWithIncomingGradientSourceTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @Nullable String name);

    @NotNull
    @Generated
    @Selector("sigmoidWithTensor:name:")
    public native MPSGraphTensor sigmoidWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("signWithTensor:name:")
    public native MPSGraphTensor signWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("signbitWithTensor:name:")
    public native MPSGraphTensor signbitWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("sinWithTensor:name:")
    public native MPSGraphTensor sinWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("sinhWithTensor:name:")
    public native MPSGraphTensor sinhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create strided slice gradient op and return the result tensor
     * 
     * @param inputGradientTensor Input gradient
     * @param fwdInShapeTensor    Shape of the forward pass input = shape of gradient output
     * @param starts              Array of numbers specifying starting point per dimension
     * @param ends                Array of numbers specifying ending point per dimension
     * @param strides             Array of numbers specifying strides per dimension
     * @param name                The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceGradientTensorFwdInShapeTensorStartsEndsStridesName(
            @NotNull MPSGraphTensor inputGradientTensor, @NotNull MPSGraphTensor fwdInShapeTensor,
            @NotNull NSArray<? extends NSNumber> starts, @NotNull NSArray<? extends NSNumber> ends,
            @NotNull NSArray<? extends NSNumber> strides, @Nullable String name);

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
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceGradientTensorFwdInShapeTensorStartsEndsStridesStartMaskEndMaskSqueezeMaskName(
            @NotNull MPSGraphTensor inputGradientTensor, @NotNull MPSGraphTensor fwdInShapeTensor,
            @NotNull NSArray<? extends NSNumber> starts, @NotNull NSArray<? extends NSNumber> ends,
            @NotNull NSArray<? extends NSNumber> strides, int startMask, int endMask, int squeezeMask,
            @Nullable String name);

    @NotNull
    @Generated
    @Selector("sliceTensor:dimension:start:length:name:")
    public native MPSGraphTensor sliceTensorDimensionStartLengthName(@NotNull MPSGraphTensor tensor,
            @NUInt long dimensionIndex, @NInt long start, @NInt long length, @Nullable String name);

    /**
     * Create strided slice op and return the result tensor
     * 
     * Slices a tensor starting from `starts`, stopping short before `ends` stepping
     * `strides` paces between each value. Semantics based on
     * https://www.tensorflow.org/api_docs/python/tf/strided_slice.
     * 
     * @param tensor  Tensor to be sliced
     * @param starts  Array of numbers specifying starting point per dimension
     * @param ends    Array of numbers specifying ending point per dimension
     * @param strides Array of numbers specifying strides per dimension
     * @param name    The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("sliceTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceTensorStartsEndsStridesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> starts, @NotNull NSArray<? extends NSNumber> ends,
            @NotNull NSArray<? extends NSNumber> strides, @Nullable String name);

    /**
     * Create strided slice op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("sliceTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceTensorStartsEndsStridesStartMaskEndMaskSqueezeMaskName(
            @NotNull MPSGraphTensor tensor, @NotNull NSArray<? extends NSNumber> starts,
            @NotNull NSArray<? extends NSNumber> ends, @NotNull NSArray<? extends NSNumber> strides, int startMask,
            int endMask, int squeezeMask, @Nullable String name);

    /**
     * Create a softmax cross entropy loss op and return the result tensor
     * 
     * @param gradientTensor gradientTensor
     * @param sourceTensor   sourceTensor
     * @param labelsTensor   labelsTensor
     * @param axis           axis over which loss reuction happens
     * @param reductionType  reductionType which reduces across all other axes
     * @param name           name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("softMaxCrossEntropyGradientWithIncomingGradientTensor:sourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropyGradientWithIncomingGradientTensorSourceTensorLabelsTensorAxisReductionTypeName(
            @NotNull MPSGraphTensor gradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull MPSGraphTensor labelsTensor, @NInt long axis, long reductionType, @Nullable String name);

    /**
     * Create a softmax cross entropy loss op and return the result tensor
     * 
     * @param sourceTensor  sourceTensor
     * @param labelsTensor  labelsTensor
     * @param axis          axis over which loss reuction happens
     * @param reductionType reductionType which reduces across all other axes
     * @param name          name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("softMaxCrossEntropyWithSourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropyWithSourceTensorLabelsTensorAxisReductionTypeName(
            @NotNull MPSGraphTensor sourceTensor, @NotNull MPSGraphTensor labelsTensor, @NInt long axis,
            long reductionType, @Nullable String name);

    @NotNull
    @Generated
    @Selector("softMaxGradientWithIncomingGradient:sourceTensor:axis:name:")
    public native MPSGraphTensor softMaxGradientWithIncomingGradientSourceTensorAxisName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source, @NInt long axis, @Nullable String name);

    @NotNull
    @Generated
    @Selector("softMaxWithTensor:axis:name:")
    public native MPSGraphTensor softMaxWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create space-to-depth2d op and return the result tensor
     * 
     * This operation outputs a copy of the `input` tensor, where values from the
     * `widthAxis` and `heightAxis` dimensions are moved in spatial blocks of size
     * `blockSize` to the `depthAxis` dimension. `usePixelShuffleOrder` can be
     * used to control how the data within spatial blocks is ordered in the
     * `depthAxis` dimension: with `usePixelShuffleOrder=YES` the values within the
     * spatial blocks are stored contiguosly within the `depthAxis` dimension whereas
     * otherwise they are stored interleaved with existing values in the `depthAxis`
     * dimension.
     * This operation is the inverse of `depthToSpace2D`.
     * 
     * @param tensor               The input tensor.
     * @param widthAxis            Axis that defines the fastest running dimension within the block.
     * @param heightAxis           Axis that defines the 2nd fastest running dimension within the block.
     * @param depthAxis            Axis that defines the destination dimension, where to copy the blocks.
     * @param blockSize            Size of the square spatial sub-block.
     * @param usePixelShuffleOrder Controls layout of the sub-blocks within the depth dimension.
     * @param name                 The name for the operation.
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("spaceToDepth2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensorWidthAxisHeightAxisDepthAxisBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NUInt long widthAxis, @NUInt long heightAxis, @NUInt long depthAxis,
            @NUInt long blockSize, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("spaceToDepth2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensorWidthAxisTensorHeightAxisTensorDepthAxisTensorBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor widthAxisTensor,
            @NotNull MPSGraphTensor heightAxisTensor, @NotNull MPSGraphTensor depthAxisTensor, @NUInt long blockSize,
            boolean usePixelShuffleOrder, @Nullable String name);

    @NotNull
    @Generated
    @Selector("squareRootWithTensor:name:")
    public native MPSGraphTensor squareRootWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("squareWithTensor:name:")
    public native MPSGraphTensor squareWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * stencil operation
     * 
     * Performs a weighted reduction operation (`reductionMode`) on the last 4 dimensions of the `source`
     * over the window determined by `weights`, acc. to the given `strides` and `dilationRates` and `paddingStyle`.
     * `boundaryMode` determines what values to pad the `input` with. `offsets` are used to determine where
     * to start reading the `input` from. `explicitPadding` can also be provided when using relevant paddingStyles.
     * 
     * y[i] = reduction { x[ i + j ] * w[j] }
     * 
     * @param source     Tensor containing source data. Must be of rank 4 or greater.
     * @param weights    4-D Tensor containing the weights data.
     * @param descriptor Descriptor object that specifies strides, dilationRates etc.
     * @param name       The name for the operation.
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("stencilWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor stencilWithSourceTensorWeightsTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphTensor weights, @NotNull MPSGraphStencilOpDescriptor descriptor, @Nullable String name);

    /**
     * StochasticGradientDescent
     * 
     * The StochasticGradientDescent performs a gradient descent
     * 
     * variable = variable - (learningRate * g)
     * 
     * where,
     * g is gradient of error wrt variable
     */
    @NotNull
    @Generated
    @Selector("stochasticGradientDescentWithLearningRateTensor:valuesTensor:gradientTensor:name:")
    public native MPSGraphTensor stochasticGradientDescentWithLearningRateTensorValuesTensorGradientTensorName(
            @NotNull MPSGraphTensor learningRateTensor, @NotNull MPSGraphTensor valuesTensor,
            @NotNull MPSGraphTensor gradientTensor, @Nullable String name);

    /**
     * Create Subtract op and return the result tensor, it supports broadcasting as well
     * 
     * [@code]
     * resultTensor = primaryTensor - secondaryTensor
     * [@endcode]
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("subtractionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor subtractionWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("tanWithTensor:name:")
    public native MPSGraphTensor tanWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("tanhWithTensor:name:")
    public native MPSGraphTensor tanhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create TopKGradient op and return the result tensor
     * 
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * To perform a vertical TopK a transpose can be inserted at the minor dimension of the
     * incoming tensor.
     * 
     * @param gradient Tensor containing the incoming gradient
     * @param source   Tensor containing source data
     * @param k        The number of largest values to return
     * @param name     The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("topKWithGradientTensor:source:k:name:")
    public native MPSGraphTensor topKWithGradientTensorSourceKName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NUInt long k, @Nullable String name);

    /**
     * Create TopKGradient op and return the result tensor
     * 
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * To perform a vertical TopK a transpose can be inserted at the minor dimension of the
     * incoming tensor.
     * 
     * @param gradient Tensor containing the incoming gradient
     * @param source   Tensor containing source data
     * @param kTensor  Tensor of the number of largest values to return
     * @param name     The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("topKWithGradientTensor:source:kTensor:name:")
    public native MPSGraphTensor topKWithGradientTensorSourceKTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor kTensor, @Nullable String name);

    /**
     * Create TopK op and return the value and indices tensors
     * 
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
     * 
     * @return A valid MPSGraphTensor array of size 2
     */
    @NotNull
    @Generated
    @Selector("topKWithSourceTensor:k:name:")
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorKName(@NotNull MPSGraphTensor source,
            @NUInt long k, @Nullable String name);

    /**
     * Create TopK op and return the result tensor
     * 
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
     * 
     * @return A valid MPSGraphTensor array of size 2
     */
    @NotNull
    @Generated
    @Selector("topKWithSourceTensor:kTensor:name:")
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorKTensorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphTensor kTensor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("transposeTensor:dimension:withDimension:name:")
    public native MPSGraphTensor transposeTensorDimensionWithDimensionName(@NotNull MPSGraphTensor tensor,
            @NUInt long dimensionIndex, @NUInt long dimensionIndex2, @Nullable String name);

    /**
     * Create a variance op and return the result tensor
     * 
     * @param axes A list of axes over which to perform the reduction. Tthe order of dimensions goes from the slowest
     *             moving at axis=0 to the fastest moving dimension.
     * @param name name for the placeholder operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("varianceOfTensor:axes:name:")
    public native MPSGraphTensor varianceOfTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create a variance op when you already have a precomputed mean and return the result tensor
     * 
     * @param axes A list of axes over which to perform the reduction such that the order of dimensions goes from the
     *             slowest moving at axis=0 to the fastest moving dimension.
     * @param name name for the placeholder operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("varianceOfTensor:meanTensor:axes:name:")
    public native MPSGraphTensor varianceOfTensorMeanTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor meanTensor, @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

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
     * 
     * @return A valid MPSGraphTensor array with results returned from the conditionBlock depending on the
     *         predicateTensor
     */
    @NotNull
    @Generated
    @Selector("whileWithInitialInputs:before:after:name:")
    public native NSArray<? extends MPSGraphTensor> whileWithInitialInputsBeforeAfterName(
            @NotNull NSArray<? extends MPSGraphTensor> initialInputs,
            @NotNull @ObjCBlock(name = "call_whileWithInitialInputsBeforeAfterName_1") Block_whileWithInitialInputsBeforeAfterName_1 before,
            @NotNull @ObjCBlock(name = "call_whileWithInitialInputsBeforeAfterName_2") Block_whileWithInitialInputsBeforeAfterName_2 after,
            @Nullable String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_whileWithInitialInputsBeforeAfterName_1 {
        @NotNull
        @Generated
        MPSGraphTensor call_whileWithInitialInputsBeforeAfterName_1(
                @NotNull NSArray<? extends MPSGraphTensor> inputTensors,
                @NotNull NSMutableArray<MPSGraphTensor> resultTensors);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_whileWithInitialInputsBeforeAfterName_2 {
        @NotNull
        @Generated
        NSArray<? extends MPSGraphTensor> call_whileWithInitialInputsBeforeAfterName_2(
                @NotNull NSArray<? extends MPSGraphTensor> bodyBlockArguments);
    }

    /**
     * Creates an MPSGraphTensor representing state using the Philox algorithm with given counter and key values.
     * 
     * See randomPhiloxStateTensorWithSeed.
     * 
     * @param counterLow  The value to initilaize lower 64 bits of counter to. Philox utilizes a 128 bit counter
     * @param counterHigh The value to initilaize upper 64 bits of counter to. Philox utilizes a 128 bit counter
     * @param key         The value to initialize the key to in Philox algorithm.
     * 
     * @return An MPSGraphTensor representing a random state, to be passed as an input to a random op.
     */
    @NotNull
    @Generated
    @Selector("randomPhiloxStateTensorWithCounterLow:counterHigh:key:name:")
    public native MPSGraphTensor randomPhiloxStateTensorWithCounterLowCounterHighKeyName(@NUInt long counterLow,
            @NUInt long counterHigh, @NUInt long key, @Nullable String name);

    /**
     * Creates an MPSGraphTensor representing state using the Philox algorithm with given counter and key values.
     * 
     * Generates random numbers using the Philox counter-based algorithm, for further details see:
     * John K. Salmon, Mark A. Moraes, Ron O. Dror, and David E. Shaw. Parallel Random Numbers: As Easy as 1, 2, 3.
     * 
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
     * 
     * [@code]
     * MPSGraph *graph = [MPSGraph new];
     * MPSGraphTensor *stateTensor = [graph randomPhiloxStateTensorWithSeed: seed name: nil];
     * NSArray<MPSGraphTensor*> *resultTensors0 = [graph randomUniformTensorWithShape:@[@10, @10]
     * stateTensor:stateTensor
     * name:nil];
     * NSArray<MPSGraphTensor*> *resultTensors1 = [graph randomUniformTensorWithShape:@[@10, @10]
     * stateTensor:resultTensors0[1]
     * name:nil];
     * 
     * [@endcode]
     * 
     * @param seed Initial counter and key values will be generated using seed.
     * 
     * @return An MPSGraphTensor representing a random state, to be passed as an input to a random op.
     */
    @NotNull
    @Generated
    @Selector("randomPhiloxStateTensorWithSeed:name:")
    public native MPSGraphTensor randomPhiloxStateTensorWithSeedName(@NUInt long seed, @Nullable String name);

    @NotNull
    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:name:")
    public native MPSGraphTensor randomTensorWithShapeTensorDescriptorName(@NotNull MPSGraphTensor shapeTensor,
            @NotNull MPSGraphRandomOpDescriptor descriptor, @Nullable String name);

    @NotNull
    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:seed:name:")
    public native MPSGraphTensor randomTensorWithShapeTensorDescriptorSeedName(@NotNull MPSGraphTensor shapeTensor,
            @NotNull MPSGraphRandomOpDescriptor descriptor, @NUInt long seed, @Nullable String name);

    @NotNull
    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:stateTensor:name:")
    public native NSArray<? extends MPSGraphTensor> randomTensorWithShapeTensorDescriptorStateTensorName(
            @NotNull MPSGraphTensor shapeTensor, @NotNull MPSGraphRandomOpDescriptor descriptor,
            @NotNull MPSGraphTensor state, @Nullable String name);

    @NotNull
    @Generated
    @Selector("randomUniformTensorWithShapeTensor:name:")
    public native MPSGraphTensor randomUniformTensorWithShapeTensorName(@NotNull MPSGraphTensor shapeTensor,
            @Nullable String name);

    @NotNull
    @Generated
    @Selector("randomUniformTensorWithShapeTensor:seed:name:")
    public native MPSGraphTensor randomUniformTensorWithShapeTensorSeedName(@NotNull MPSGraphTensor shapeTensor,
            @NUInt long seed, @Nullable String name);

    @NotNull
    @Generated
    @Selector("randomUniformTensorWithShapeTensor:stateTensor:name:")
    public native NSArray<? extends MPSGraphTensor> randomUniformTensorWithShapeTensorStateTensorName(
            @NotNull MPSGraphTensor shapeTensor, @NotNull MPSGraphTensor state, @Nullable String name);

    /**
     * Create reduction max propagate NaN op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaNWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction max propagate NaN op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaNWithTensorAxisName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, @Nullable String name);

    /**
     * Create reduction min propagate NaN op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimumPropagateNaNWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction min propagate NaN op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimumPropagateNaNWithTensorAxisName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, @Nullable String name);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("GRUGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:outputFwd:inputWeight:bias:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> GRUGradientsWithSourceTensorRecurrentWeightSourceGradientZStateOutputFwdInputWeightBiasDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState, @NotNull MPSGraphTensor outputFwd,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias,
            @NotNull MPSGraphGRUDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("GRUGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:outputFwd:inputWeight:bias:initState:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> GRUGradientsWithSourceTensorRecurrentWeightSourceGradientZStateOutputFwdInputWeightBiasInitStateDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState, @NotNull MPSGraphTensor outputFwd,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @NotNull MPSGraphGRUDescriptor descriptor, @Nullable String name);

    /**
     * Create a GRU gradient op and return the gradient tensor values.
     * 
     * @param source          Tensor containing the source data `x[t]` - shape should be [T,N,I].
     *                        In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,3H]
     *                        and for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,6H].
     * @param recurrentWeight Tensor containing the recurrent weights `R`.
     *                        For `bidirectional` the layout is [2,3H,H] and otherwise it is [3H,H].
     * @param sourceGradient  Input gradient, that is gradient of a tensor wrt. to first output of the forward pass.
     * @param zState          The second output of `GRUWithSourceTensor` with @ref `descriptor.training = true`.
     * @param outputFwd       The first output of `GRUWithSourceTensor` with @ref `descriptor.training = true`.
     * @param stateGradient   Input gradient for state coming from the future timestep - optional, if missing assumes
     *                        zeroes.
     * @param inputWeight     Tensor containing the input weights matrix `W` - optional, if missing assumes diagonal
     *                        unit-matrix.
     *                        For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * @param bias            Tensor containing the bias `b` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [6H] and otherwise it is [3H].
     * @param initState       Initial internal state of the LSTM `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param mask            Tensor containing the mask `m` - optional, if missing assumes ones. Useful for dropout.
     * @param secondaryBias   Tensor containing the secondary bias vector `b2` - optional, if missing assumes zeroes.
     *                        Only used with `reset_after = YES`.
     *                        Shape is [H], ie. a vector for each gate, or [2H] for bidirectional.
     * @param descriptor      The GRU op definition.
     * @param name            The name for the operation.
     * 
     * @return A valid MPSGraphTensor array containing gradients for each input tensor, except for `sourceGradient` and
     *         `mask`.
     *         In case an input is nil, no gradient will be returned for it.
     *         The order of the gradients will be: for source, for recurrentWeight, for inputWeight, for bias, for
     *         initState, for secondaryBias.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("GRUGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:outputFwd:stateGradient:inputWeight:bias:initState:mask:secondaryBias:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> GRUGradientsWithSourceTensorRecurrentWeightSourceGradientZStateOutputFwdStateGradientInputWeightBiasInitStateMaskSecondaryBiasDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState, @NotNull MPSGraphTensor outputFwd,
            @Nullable MPSGraphTensor stateGradient, @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias,
            @Nullable MPSGraphTensor initState, @Nullable MPSGraphTensor mask, @Nullable MPSGraphTensor secondaryBias,
            @NotNull MPSGraphGRUDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("GRUWithSourceTensor:recurrentWeight:inputWeight:bias:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> GRUWithSourceTensorRecurrentWeightInputWeightBiasDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias,
            @NotNull MPSGraphGRUDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> GRUWithSourceTensorRecurrentWeightInputWeightBiasInitStateDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @NotNull MPSGraphGRUDescriptor descriptor, @Nullable String name);

    /**
     * Create a GRU op and return the value and optionally the training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * [@code]
     * for t = 0 to T-1
     * z[t] = fz( (h[t-1] m) R^T + x[t] W^T + b ),
     * r[t] = fr( (h[t-1] m) R^T + x[t] W^T + b ),
     * c[t] = (h[t-1] r[t] m) R^T
     * o[t] = fo( c[t] + x[t] W^T + b )
     * h[t] = z[t]h[t-1] + (1-z[t])o[t]
     * [@endcode]
     * If `resetAfter = YES` then `c[t]` is replaced by
     * [@code]
     * c[t] = ( (h[t-1] m) R^T + b2 ) r[t]
     * [@endcode]
     * If `flipZ = YES` then `h[t]` is replaced by
     * [@code]
     * h[t] = (1-z[t])h[t-1] + z[t]o[t].
     * [@endcode]
     * `W` is optional @ref inputWeight, `R` is @ref recurrentWeight, `b` is optional @ref bias, `m` is optional @mask,
     * `x[t]` is @ref source `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is @ref
     * initState.
     * `b2` is an optional `resetBias` vector, only used when `resetAfter = YES`.
     * See @ref MPSGraphGRUDescriptor for different `activation` options for `f()`.
     * 
     * @param source          Tensor containing the source data `x[t]` - shape should be [T,N,I].
     *                        In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,3H]
     *                        and for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,6H].
     * @param recurrentWeight Tensor containing the recurrent weights `R`.
     *                        For `bidirectional` the layout is [2,3H,H] and otherwise it is [3H,H].
     * @param inputWeight     Tensor containing the input weights matrix `W` - optional, if missing assumes diagonal
     *                        unit-matrix.
     *                        For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * @param bias            Tensor containing the bias `b` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [6H] and otherwise it is [3H].
     * @param initState       Initial internal state of the LSTM `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param mask            Tensor containing the mask `m` - optional, if missing assumes ones. Useful for dropout.
     * @param secondaryBias   Tensor containing the secondary bias vector `b2` - optional, if missing assumes zeroes.
     *                        Only used with `reset_after = YES`.
     *                        Shape is [H], ie. a vector for each gate, or [2H] for bidirectional.
     * @param descriptor      The GRU op definition.
     * @param name            The name for the operation.
     * 
     * @return A valid MPSGraphTensor array of size 1 or 2 depending on value of @ref `descriptor.training`.
     *         The layout of the state output is [T,N,H] or [T,N,2H] for bidirectional,
     *         and the layout of the trainingState output is [T,N,3H] or [T,N,6H] for bidirectional,.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:secondaryBias:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> GRUWithSourceTensorRecurrentWeightInputWeightBiasInitStateMaskSecondaryBiasDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor mask, @Nullable MPSGraphTensor secondaryBias,
            @NotNull MPSGraphGRUDescriptor descriptor, @Nullable String name);

    /**
     * Create a Hamming Distance op and return the result tensor, it supports broadcasting as well.
     * 
     * The Hamming Distance is computed between sets of vectors and the last dimension(s) of each
     * input tensor is considered a vector. If the shape of @ref primaryTensor is `[Na, M, K]` and the shape
     * of @ref secondaryTensor is `[Nb, N, K]`, with Na, Nb being any batch dimensions,
     * then the result shape is `[Na/Nb, M, N]`, where `Na/Nb` are the broadcasted batch dimensions.
     * The result datatype is either MPSDataTypeUInt32 or MPSDataTypeUInt16.
     * 
     * @param primaryTensor   LHS tensor of the binary Op
     * @param secondaryTensor RHS tensor of the binary Op
     * @param resultDataType  Must be either MPSDataTypeUInt32 or MPSDataTypeUInt16
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("HammingDistanceWithPrimaryTensor:secondaryTensor:resultDataType:name:")
    public native MPSGraphTensor HammingDistanceWithPrimaryTensorSecondaryTensorResultDataTypeName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, int resultDataType,
            @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:cellOutputFwd:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMGradientsWithSourceTensorRecurrentWeightSourceGradientZStateCellOutputFwdDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState,
            @NotNull MPSGraphTensor cellOutputFwd, @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:cellOutputFwd:inputWeight:bias:initState:initCell:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMGradientsWithSourceTensorRecurrentWeightSourceGradientZStateCellOutputFwdInputWeightBiasInitStateInitCellDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState,
            @NotNull MPSGraphTensor cellOutputFwd, @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias,
            @Nullable MPSGraphTensor initState, @Nullable MPSGraphTensor initCell,
            @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:cellOutputFwd:inputWeight:bias:initState:initCell:mask:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMGradientsWithSourceTensorRecurrentWeightSourceGradientZStateCellOutputFwdInputWeightBiasInitStateInitCellMaskDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState,
            @NotNull MPSGraphTensor cellOutputFwd, @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias,
            @Nullable MPSGraphTensor initState, @Nullable MPSGraphTensor initCell, @Nullable MPSGraphTensor mask,
            @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * Create a LSTM gradient op and return the gradient tensor values.
     * 
     * @param source          Tensor containing the source data `x[t]` - shape should be [T,N,I].
     *                        In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,4H]
     *                        and for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,8H].
     * @param recurrentWeight Tensor containing the recurrent weights `R`.
     *                        For `bidirectional` the layout is [2,4H,H] and otherwise it is [4H,H].
     * @param sourceGradient  Input gradient, that is gradient of a tensor wrt. to first output of the forward pass.
     * @param zState          The third output of `LSTMWithSourceTensor` with @ref `descriptor.training = true`.
     * @param cellOutputFwd   The second output of `LSTMWithSourceTensor` with @ref `descriptor.training = true` or
     *                        `descriptor.produceCell = true`.
     * @param stateGradient   Input gradient for state coming from the future timestep - optional, if missing assumes
     *                        zeroes.
     * @param cellGradient    Input gradient for cell coming from the future timestep - optional, if missing assumes
     *                        zeroes.
     * @param inputWeight     Tensor containing the input weights matrix `W` - optional, if missing assumes diagonal
     *                        unit-matrix.
     *                        For `bidirectional` the layout is [8H,I] and otherwise it is [4H,I].
     * @param bias            Tensor containing the bias `b` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [8H] and otherwise it is [4H].
     * @param initState       Initial internal state of the LSTM `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param initCell        Initial internal cell of the LSTM `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param mask            Tensor containing the mask `m` - optional, if missing assumes ones. Useful for dropout.
     * @param peephole        Tensor containing the peephole vector `v` - optional, if missing assumes zeroes. Shape is
     *                        [8H], ie. a vector for each gate.
     * @param descriptor      The LSTM op definition.
     * @param name            The name for the operation.
     * 
     * @return A valid MPSGraphTensor array containing gradients for each input tensor, except for `sourceGradient` and
     *         `mask`.
     *         In case an input is nil, no gradient will be returned for it.
     *         The order of the gradients will be: for source, for recurrentWeight, for inputWeight, for bias, for
     *         peephole, for initState, for initCell.
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:cellOutputFwd:stateGradient:cellGradient:inputWeight:bias:initState:initCell:mask:peephole:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMGradientsWithSourceTensorRecurrentWeightSourceGradientZStateCellOutputFwdStateGradientCellGradientInputWeightBiasInitStateInitCellMaskPeepholeDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState,
            @NotNull MPSGraphTensor cellOutputFwd, @Nullable MPSGraphTensor stateGradient,
            @Nullable MPSGraphTensor cellGradient, @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias,
            @Nullable MPSGraphTensor initState, @Nullable MPSGraphTensor initCell, @Nullable MPSGraphTensor mask,
            @Nullable MPSGraphTensor peephole, @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMWithSourceTensor:recurrentWeight:initState:initCell:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMWithSourceTensorRecurrentWeightInitStateInitCellDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor initCell, @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMWithSourceTensorRecurrentWeightInputWeightBiasInitStateInitCellDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor initCell, @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * Create a LSTM op and return the value and optionally the cell state and optionally the training state tensor.
     * 
     * This operation returns tensors `h` and optionally `c` and optionally `z` that are defined recursively as follows:
     * [@code]
     * for t = 0 to T-1
     * z[t] = [i, f, z, o][t] = f( (h[t-1] m) R^T + x'[t] + p*c[t-1] )`
     * x'[t] = x[t] W^T + b
     * c[t] = f[t] * c[t-1] + i[t] * z[t]
     * h[t] = o[t] * g(c[t]), where
     * [@endcode]
     * `W` is optional @ref inputWeight, `R` is @ref recurrentWeight, `b` is optional @ref bias, `m` is optional @mask,
     * `x[t]` is @ref source `h[t]` is the first output, `c[t]` is the second output (optional),
     * `z[t]` is either the second or third output (optional), `h[-1]` is @ref initCell. and `h[-1]` is @ref initState.
     * `p` is an optional peephole vector.
     * See @ref MPSGraphLSTMDescriptor for different `activation` options for `f()` and `g()`.
     * 
     * @param source          Tensor containing the source data `x[t]` - shape should be [T,N,I].
     *                        In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,4H]
     *                        and for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,8H].
     * @param recurrentWeight Tensor containing the recurrent weights `R`.
     *                        For `bidirectional` the layout is [2,4H,H] and otherwise it is [4H,H].
     * @param inputWeight     Tensor containing the input weights matrix `W` - optional, if missing assumes diagonal
     *                        unit-matrix.
     *                        For `bidirectional` the layout is [8H,I] and otherwise it is [4H,I].
     * @param bias            Tensor containing the bias `b` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [8H] and otherwise it is [4H].
     * @param initState       Initial internal state of the LSTM `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param initCell        Initial internal cell of the LSTM `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param mask            Tensor containing the mask `m` - optional, if missing assumes ones. Useful for dropout.
     * @param peephole        Tensor containing the peephole vector `v` - optional, if missing assumes zeroes.
     *                        Shape is [4H], ie. a vector for each gate, or [2,4H] for bidirectional.
     * @param descriptor      The LSTM op definition.
     * @param name            The name for the operation.
     * 
     * @return A valid MPSGraphTensor array of size 1 or 2 or 3, depending on value of @ref `descriptor.produceCell`
     *         and @ref `descriptor.training`.
     *         The layout of the both state and cell outputs are [T,N,H] or [T,N,2H] for bidirectional,
     *         and the layout of the trainingState output is [T,N,4H] or [T,N,8H] for bidirectional,.
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:mask:peephole:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMWithSourceTensorRecurrentWeightInputWeightBiasInitStateInitCellMaskPeepholeDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor initCell, @Nullable MPSGraphTensor mask, @Nullable MPSGraphTensor peephole,
            @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * Adam
     * 
     * The adam update ops are added
     * 
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1],v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel) + epsilon)
     * 
     * @return if maximumVelocity is nil array of 3 tensors (update, newMomentum, newVelocity) else array of 4 tensors
     *         (update, newMomentum, newVelocity, newMaximumVelocity)
     */
    @NotNull
    @Generated
    @Selector("adamWithCurrentLearningRateTensor:beta1Tensor:beta2Tensor:epsilonTensor:valuesTensor:momentumTensor:velocityTensor:maximumVelocityTensor:gradientTensor:name:")
    public native NSArray<? extends MPSGraphTensor> adamWithCurrentLearningRateTensorBeta1TensorBeta2TensorEpsilonTensorValuesTensorMomentumTensorVelocityTensorMaximumVelocityTensorGradientTensorName(
            @NotNull MPSGraphTensor currentLearningRateTensor, @NotNull MPSGraphTensor beta1Tensor,
            @NotNull MPSGraphTensor beta2Tensor, @NotNull MPSGraphTensor epsilonTensor,
            @NotNull MPSGraphTensor valuesTensor, @NotNull MPSGraphTensor momentumTensor,
            @NotNull MPSGraphTensor velocityTensor, @Nullable MPSGraphTensor maximumVelocityTensor,
            @NotNull MPSGraphTensor gradientTensor, @Nullable String name);

    /**
     * Adam
     * 
     * The adam update ops are added
     * 
     * current learning rate:
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * 
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1],v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel) + epsilon)
     * 
     * @return if maximumVelocity is nil array of 3 tensors (update, newMomentum, newVelocity) else array of 4 tensors
     *         (update, newMomentum, newVelocity, newMaximumVelocity)
     */
    @NotNull
    @Generated
    @Selector("adamWithLearningRateTensor:beta1Tensor:beta2Tensor:epsilonTensor:beta1PowerTensor:beta2PowerTensor:valuesTensor:momentumTensor:velocityTensor:maximumVelocityTensor:gradientTensor:name:")
    public native NSArray<? extends MPSGraphTensor> adamWithLearningRateTensorBeta1TensorBeta2TensorEpsilonTensorBeta1PowerTensorBeta2PowerTensorValuesTensorMomentumTensorVelocityTensorMaximumVelocityTensorGradientTensorName(
            @NotNull MPSGraphTensor learningRateTensor, @NotNull MPSGraphTensor beta1Tensor,
            @NotNull MPSGraphTensor beta2Tensor, @NotNull MPSGraphTensor epsilonTensor,
            @NotNull MPSGraphTensor beta1PowerTensor, @NotNull MPSGraphTensor beta2PowerTensor,
            @NotNull MPSGraphTensor valuesTensor, @NotNull MPSGraphTensor momentumTensor,
            @NotNull MPSGraphTensor velocityTensor, @Nullable MPSGraphTensor maximumVelocityTensor,
            @NotNull MPSGraphTensor gradientTensor, @Nullable String name);

    /**
     * Create an argSort operation and return the result tensor of signed
     * 32-bit integers.
     * 
     * @param tensor     input tensor
     * @param axis       the tensor dimension over which the sort occurs
     * @param descending whether or not to sort in descending order
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axis:descending:name:")
    public native MPSGraphTensor argSortWithTensorAxisDescendingName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            boolean descending, @Nullable String name);

    /**
     * Create an argSort operation and return the result tensor of signed
     * 32-bit integers.
     * 
     * @param tensor input tensor
     * @param axis   the tensor dimension over which the sort occurs
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axis:name:")
    public native MPSGraphTensor argSortWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create an argSort operation and return the result tensor of signed
     * 32-bit integers.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the sort occurs
     * @param descending whether or not to sort in descending order
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axisTensor:descending:name:")
    public native MPSGraphTensor argSortWithTensorAxisTensorDescendingName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, boolean descending, @Nullable String name);

    /**
     * Create an argSort operation and return the result tensor of signed
     * 32-bit integers.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the sort occurs
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axisTensor:name:")
    public native MPSGraphTensor argSortWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Create band part op and return the result
     * 
     * Copies a diagonal band of values from input tensor to a result tensor of the same size.
     * A coordinate @code [..., i, j] @endcode is in the band if
     * [@code]
     * (numLower < 0 || (i-j) <= numLower) && (numUpper < 0 || (j-i) <= numUpper)
     * [@endcode]
     * Values outside of the band are set to 0.
     * 
     * @param inputTensor The source tensor to copy
     * @param numLower    The number of diagonals in the lower triangle to keep. If -1, keep all
     * @param numUpper    The number of diagonals in the upper triangle to keep. If -1, keep all
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("bandPartWithTensor:numLower:numUpper:name:")
    public native MPSGraphTensor bandPartWithTensorNumLowerNumUpperName(@NotNull MPSGraphTensor inputTensor,
            @NInt long numLower, @NInt long numUpper, @Nullable String name);

    /**
     * Create band part op and return the result
     * 
     * See above discussion of bandPartWithTensor: numLower: numUpper: name:
     * 
     * @param inputTensor    The source tensor to copy
     * @param numLowerTensor Scalar Int32 tensor. The number of diagonals in the lower triangle to keep. If -1, keep
     *                       all.
     * @param numUpperTensor Scalar Int32 tensor. The number of diagonals in the upper triangle to keep. If -1, keep
     *                       all.
     * @param name           The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("bandPartWithTensor:numLowerTensor:numUpperTensor:name:")
    public native MPSGraphTensor bandPartWithTensorNumLowerTensorNumUpperTensorName(@NotNull MPSGraphTensor inputTensor,
            @NotNull MPSGraphTensor numLowerTensor, @NotNull MPSGraphTensor numUpperTensor, @Nullable String name);

    /**
     * Create a batch-to-space3d op and return the result tensor.
     * 
     * This operation outputs a copy of the input tensor, where values from the
     * `batchAxis` dimension are moved in spatial blocks of size `blockDimensions` to the
     * `spatialAxes` dimensions (for `usePixelShuffleOrder=YES`1,2 or 3 axes supported,
     * otherwise limited only by MPSNDArray rank limitations). `usePixelShuffleOrder`
     * can be used to control how the data within spatial blocks is ordered in the
     * `batchAxis` dimension: with `usePixelShuffleOrder = YES` the values within the
     * spatial block are stored contiguosly within the `batchAxis` dimension whereas
     * without it they are stored interleaved with existing values in the `batchAxis`
     * dimension.
     * Note: This operation is the inverse of `spaceToBatch`.
     * Note: This operation is a generalization of `depthToSpace2D`.
     * 
     * @param tensor               The input tensor.
     * @param spatialAxes          Axes that define the dimensions containing the spatial blocks.
     * @param batchAxis            Axis that defines the source dimension, from which to copy the blocks.
     * @param blockDimensions      Defines the size of the rectangular spatial sub-block.
     * @param usePixelShuffleOrder Controls layout of the sub-blocks within the batch dimension.
     * @param name                 The name for the operation.
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("batchToSpaceTensor:spatialAxes:batchAxis:blockDimensions:usePixelShuffleOrder:name:")
    public native MPSGraphTensor batchToSpaceTensorSpatialAxesBatchAxisBlockDimensionsUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull NSArray<? extends NSNumber> spatialAxes, @NInt long batchAxis,
            @NotNull NSArray<? extends NSNumber> blockDimensions, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("batchToSpaceTensor:spatialAxesTensor:batchAxisTensor:blockDimensionsTensor:usePixelShuffleOrder:name:")
    public native MPSGraphTensor batchToSpaceTensorSpatialAxesTensorBatchAxisTensorBlockDimensionsTensorUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor spatialAxesTensor,
            @NotNull MPSGraphTensor batchAxisTensor, @NotNull MPSGraphTensor blockDimensionsTensor,
            boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Return bitwise AND of binary representations of 2 integer tensors
     * 
     * @param primaryTensor   primary input tensor, must be integer dataType
     * @param secondaryTensor secondary input tensor, must be integer dataType
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseANDWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Return bitwise left shifted binary representations of primary integer tensor by secondary tensor amount
     * 
     * @param primaryTensor   primary input tensor, must be integer dataType
     * @param secondaryTensor secondary input tensor, must be integer dataType
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseLeftShiftWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseLeftShiftWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Return bitwise not of tensor, takes in only integer dataTypes
     * 
     * @param tensor input tensor, must be integer dataType
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseNOTWithTensor:name:")
    public native MPSGraphTensor bitwiseNOTWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Return bitwise OR of binary representations of 2 integer tensors
     * 
     * @param primaryTensor   primary input tensor, must be integer dataType
     * @param secondaryTensor secondary input tensor, must be integer dataType
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Return population count of a tensor, takes in only integer dataTypes
     * 
     * @param tensor input tensor, must be integer dataType
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwisePopulationCountWithTensor:name:")
    public native MPSGraphTensor bitwisePopulationCountWithTensorName(@NotNull MPSGraphTensor tensor,
            @Nullable String name);

    /**
     * Return bitwise right shifted binary representations of primary integer tensor by secondary tensor amount
     * 
     * @param primaryTensor   primary input tensor, must be integer dataType
     * @param secondaryTensor secondary input tensor, must be integer dataType
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseRightShiftWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseRightShiftWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Return bitwise XOR of binary representations of 2 integer tensors
     * 
     * @param primaryTensor   primary input tensor, must be integer dataType
     * @param secondaryTensor secondary input tensor, must be integer dataType
     * @param name            name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseXORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseXORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Create get coord op and return the result
     * 
     * See above discussion of getCoordinateValueWithShape: axis: name:
     * 
     * @param axis        The coordinate axis an element's value is set to. Negative values wrap around
     * @param shapeTensor 1D Int32 or Int64 tensor. The shape of the result tensor.
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("coordinateAlongAxis:withShapeTensor:name:")
    public native MPSGraphTensor coordinateAlongAxisWithShapeTensorName(@NInt long axis,
            @NotNull MPSGraphTensor shapeTensor, @Nullable String name);

    /**
     * Create get coord op and return the result
     * 
     * See above discussion of getCoordinateValueWithShape: axis: name:
     * 
     * @param axisTensor  Scalar Int32 tensor. The coordinate axis an element's value is set to. Negative values wrap
     *                    around
     * @param shapeTensor 1D Int32 or Int64 tensor. The shape of the result tensor.
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("coordinateAlongAxisTensor:withShapeTensor:name:")
    public native MPSGraphTensor coordinateAlongAxisTensorWithShapeTensorName(@NotNull MPSGraphTensor axisTensor,
            @NotNull MPSGraphTensor shapeTensor, @Nullable String name);

    /**
     * Create the cumulative maximum op and return the result tensor.
     * 
     * @param tensor    input tensor
     * @param axis      the tensor dimension over which the cumulative operation occurs
     * @param exclusive if true, performs the exclusive cumulative maximum operation, and the first element will be
     *                  equal to the lowest value of data type.
     * @param reverse   reverse the direction of the cumulative maximum operation along the given axis
     * @param name      name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Create the inclusive cumulative maximum op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   the tensor dimension over which the cumulative operation occurs
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create the cumulative maximum op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param exclusive  if true, performs the exclusive cumulative maximum operation, and the first element will be
     *                   equal to the lowest value of data type.
     * @param reverse    reverse the direction of the cumulative maximum operation along the given axis
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisTensorExclusiveReverseName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse,
            @Nullable String name);

    /**
     * Create the inclusive cumulative maximum op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axisTensor:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Create the cumulative minimum op and return the result tensor.
     * 
     * @param tensor    input tensor
     * @param axis      the tensor dimension over which the cumulative operation occurs
     * @param exclusive if true, performs the exclusive cumulative minimum operation, and the first element will be
     *                  equal to the highest value of data type.
     * @param reverse   reverse the direction of the cumulative minimum operation along the given axis
     * @param name      name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Create the inclusive cumulative minimum op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   the tensor dimension over which the cumulative operation occurs
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create the cumulative minimum op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param exclusive  if true, performs the exclusive cumulative minimum operation, and the first element will be
     *                   equal to the highest value of data type.
     * @param reverse    reverse the direction of the cumulative minimum operation along the given axis
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisTensorExclusiveReverseName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse,
            @Nullable String name);

    /**
     * Create the inclusive cumulative minimum op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axisTensor:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Create the cumulative product op and return the result tensor.
     * 
     * @param tensor    input tensor
     * @param axis      the tensor dimension over which the cumulative operation occurs
     * @param exclusive if true, performs the exclusive cumulative product operation, and the first element will be
     *                  equal to one.
     * @param reverse   reverse the direction of the cumulative product operation along the given axis
     * @param name      name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Create the inclusive cumulative product op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   the tensor dimension over which the cumulative operation occurs
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create the cumulative product op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param exclusive  if true, performs the exclusive cumulative product operation, and the first element will be
     *                   equal to one.
     * @param reverse    reverse the direction of the cumulative product operation along the given axis
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisTensorExclusiveReverseName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse,
            @Nullable String name);

    /**
     * Create the inclusive cumulative product op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axisTensor:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Create the cumulative sum op and return the result tensor.
     * 
     * @param tensor    input tensor
     * @param axis      the tensor dimension over which the cumulative operation occurs
     * @param exclusive if true, performs the exclusive cumulative sum operation, and the first element will be equal to
     *                  zero.
     * @param reverse   reverse the direction of the cumulative sum operation along the given axis
     * @param name      name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeSumWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeSumWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Create the inclusive cumulative sum op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   the tensor dimension over which the cumulative operation occurs
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeSumWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeSumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create the cumulative sum op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param exclusive  if true, performs the exclusive cumulative sum operation, and the first element will be equal
     *                   to zero.
     * @param reverse    reverse the direction of the cumulative sum operation along the given axis
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeSumWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeSumWithTensorAxisTensorExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Create the inclusive cumulative sum op and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the cumulative operation occurs
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeSumWithTensor:axisTensor:name:")
    public native MPSGraphTensor cumulativeSumWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Create Dequantize op and return the result tensor
     * 
     * Convert the i8 or u8 `tensor` to a float tensor by applying a scale + bias transform:
     * result = scale * (tensor - zeroPoint)
     * 
     * @param tensor    Input tensor to be dequantized
     * @param scale     Scale scalar parameter
     * @param zeroPoint Bias scalar parameter (converted to dataType of tensor)
     * @param dataType  Float data type of the result tensor
     * @param name      The name for the operation
     * 
     * @return A valid MPSGraphTensor array of datatype dataType
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("dequantizeTensor:scale:zeroPoint:dataType:name:")
    public native MPSGraphTensor dequantizeTensorScaleZeroPointDataTypeName(@NotNull MPSGraphTensor tensor,
            double scale, double zeroPoint, int dataType, @Nullable String name);

    /**
     * Create Dequantize op and return the result tensor
     * 
     * Convert the i8 or u8 `tensor` to a float tensor by applying a scale + bias transform:
     * result = scaleTensor * (tensor - zeroPoint)
     * 
     * @param tensor      Input tensor to be dequantized
     * @param scaleTensor Scale scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * @param zeroPoint   Bias scalar parameter (converted to dataType of tensor)
     * @param dataType    Float data type of the result tensor
     * @param axis        Axis on which the scale 1D value is being broadcasted
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor array of datatype dataType
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("dequantizeTensor:scaleTensor:zeroPoint:dataType:axis:name:")
    public native MPSGraphTensor dequantizeTensorScaleTensorZeroPointDataTypeAxisName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor scaleTensor, double zeroPoint, int dataType, @NInt long axis,
            @Nullable String name);

    /**
     * Create Dequantize op and return the result tensor
     * 
     * Convert the i8 or u8 `tensor` to a float tensor by applying a scale + bias transform:
     * result = scaleTensor * (tensor - zeroPointTensor)
     * 
     * @param tensor          Input tensor to be dequantized
     * @param scaleTensor     Scale scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * @param zeroPointTensor Bias scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * @param dataType        Float data type of the result tensor
     * @param axis            Axis on which the scale 1D value is being broadcasted
     * @param name            The name for the operation
     * 
     * @return A valid MPSGraphTensor array of datatype dataType
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("dequantizeTensor:scaleTensor:zeroPointTensor:dataType:axis:name:")
    public native MPSGraphTensor dequantizeTensorScaleTensorZeroPointTensorDataTypeAxisName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor scaleTensor,
            @NotNull MPSGraphTensor zeroPointTensor, int dataType, @NInt long axis, @Nullable String name);

    /**
     * Create expand_dims op and return the result
     * 
     * Expands the tensor, inserting dimensions with size 1 at specified axes.
     * 
     * @param tensor Input tensor
     * @param axes   The axes to expand
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("expandDimsOfTensor:axes:name:")
    public native MPSGraphTensor expandDimsOfTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("expandDimsOfTensor:axesTensor:name:")
    public native MPSGraphTensor expandDimsOfTensorAxesTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @Nullable String name);

    /**
     * Create expand_dims op and return the result
     * 
     * Expands the tensor, inserting a dimension with size 1 at specified axis.
     * 
     * @param tensor Input tensor
     * @param axis   The axis to expand
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("expandDimsOfTensor:axis:name:")
    public native MPSGraphTensor expandDimsOfTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create GatherAlongAxis op and return the result tensor
     * 
     * Gather values from `updatesTensor` along the specified `axis` at indices in `indicesTensor`.
     * The shape of `updatesTensor` and `indicesTensor` must match except at `axis`.
     * The shape of the result tensor is equal to the shape of `indicesTensor`.
     * If an index is out of bounds of the `updatesTensor` along `axis` a 0 is inserted.
     * 
     * @param axis          The axis to gather from. Negative values wrap around
     * @param updatesTensor The input tensor to gather values from
     * @param indicesTensor Int32 or Int64 tensor used to index `updatesTensor`
     * @param name          The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("gatherAlongAxis:withUpdatesTensor:indicesTensor:name:")
    public native MPSGraphTensor gatherAlongAxisWithUpdatesTensorIndicesTensorName(@NInt long axis,
            @NotNull MPSGraphTensor updatesTensor, @NotNull MPSGraphTensor indicesTensor, @Nullable String name);

    /**
     * Create GatherAlongAxis op and return the result tensor
     * 
     * See above discussion of gatherAlongAxis: withUpdatesTensor: indicesTensor: name:
     * 
     * @param axisTensor    Scalar Int32 tensor. The axis to gather from. Negative values wrap around
     * @param updatesTensor The input tensor to gather values from
     * @param indicesTensor Int32 or Int64 tensor used to index `updatesTensor`
     * @param name          The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("gatherAlongAxisTensor:withUpdatesTensor:indicesTensor:name:")
    public native MPSGraphTensor gatherAlongAxisTensorWithUpdatesTensorIndicesTensorName(
            @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor updatesTensor,
            @NotNull MPSGraphTensor indicesTensor, @Nullable String name);

    /**
     * Create Matrix inverse op and return the result tensor
     * 
     * Find the inverse of a square matrix by calling LU decomposition and solver
     * The op computes inverse for all batches If the input tensor has more than
     * 2 dimensions. Results are undefined for ill conditioned matrices.
     * 
     * @param inputTensor input tensor to inverse op
     * @param name        name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("inverseOfTensor:name:")
    public native MPSGraphTensor inverseOfTensorName(@NotNull MPSGraphTensor inputTensor, @Nullable String name);

    /**
     * MaxPool2D Gradient API
     * 
     * MaxPool2D gradient is computed efficiently by reusing the indices from the forward API instead of recomputing
     * them.
     * The descriptor must set returnIndicesMode and returnIndicesDataType to the same value as that set by the forward
     * pass
     * 
     * @param gradient    Input gradient tensor
     * @param indices     Indices tensor returned from maxPooling2DReturnIndicesWithSourceTensor API
     * @param outputShape shape of the destination gradient
     * @param descriptor  See corresponding property above.
     * @return Destination gradient tensor
     */
    @NotNull
    @Generated
    @Selector("maxPooling2DGradientWithGradientTensor:indicesTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DGradientWithGradientTensorIndicesTensorOutputShapeTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor indices, @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * MaxPool2D API that returns max pool result and corresponding indices
     * 
     * In order to compute the indices, returnIndicesMode of the descriptor must be set. The datatype of indices tensor
     * can be set using returnIndicesDataType
     * If returnIndicesMode is set to default value of MPSGraphPoolingReturnIndicesNone, the second tensor in returned
     * NSArray is nil.
     * If returnIndicesDataType is not set, indices tensor will default to MPSDataTypeInt32
     * 
     * API-Since: 15.3
     * 
     * @param source     Source tensor on which pooling will be performed
     * @param descriptor See corresponding property above.
     * @return NSArray of 2 MPSGraphTensors. The first tensor holds the result of max pool and the second tensor holds
     *         the corresponding indices
     */
    @NotNull
    @Generated
    @Selector("maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> maxPooling2DReturnIndicesWithSourceTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * MaxPool4D Gradient API
     * 
     * MaxPool4D gradient is computed efficiently by reusing the indices from the forward API instead of recomputing
     * them.
     * The descriptor must set returnIndicesMode and returnIndicesDataType to the same value as that set by the forward
     * pass
     * This API should be used for NCHW and NHWC layouts
     * 
     * @param gradient    Input gradient tensor
     * @param indices     Indices tensor returned from maxPooling4DReturnIndicesWithSourceTensor API
     * @param outputShape Shape of source tensor
     * @param descriptor  See corresponding property above.
     * @return Destination gradient tensor
     */
    @NotNull
    @Generated
    @Selector("maxPooling4DGradientWithGradientTensor:indicesTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DGradientWithGradientTensorIndicesTensorOutputShapeTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor indices, @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * MaxPool4D API that returns max pool result and corresponding indices
     * 
     * In order to compute the indices, returnIndicesMode of the descriptor must be set. The datatype of indices tensor
     * can be set using returnIndicesDataType
     * If returnIndicesMode is set to default value of MPSGraphPoolingReturnIndicesNone, the second tensor in returned
     * NSArray is nil.
     * If returnIndicesDataType is not set, indices tensor will default to MPSDataTypeInt32
     * 
     * API-Since: 15.3
     * 
     * @param source     Source tensor on which pooling will be performed
     * @param descriptor See corresponding property above.
     * @return NSArray of 2 MPSGraphTensors. The first tensor holds the result of max pool and the second tensor holds
     *         the corresponding indices
     */
    @NotNull
    @Generated
    @Selector("maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> maxPooling4DReturnIndicesWithSourceTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Create Quantize op and return the result tensor
     * 
     * Convert the float `tensor` to an i8 or u8 tensor by applying a scale + bias transform:
     * result = (tensor / scale) + zeroPoint
     * 
     * @param tensor    Input tensor to be quantized
     * @param scale     Scale scalar parameter
     * @param zeroPoint Bias scalar parameter (converted to dataType of resultTensor)
     * @param dataType  Integer data type of the result tensor
     * @param name      The name for the operation
     * 
     * @return A valid MPSGraphTensor array of datatype dataType
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("quantizeTensor:scale:zeroPoint:dataType:name:")
    public native MPSGraphTensor quantizeTensorScaleZeroPointDataTypeName(@NotNull MPSGraphTensor tensor, double scale,
            double zeroPoint, int dataType, @Nullable String name);

    /**
     * Create Quantize op and return the result tensor
     * 
     * Convert the float `tensor` to an i8 or u8 tensor by applying a scale + bias transform:
     * result = (tensor / scaleTensor) + zeroPoint
     * 
     * @param tensor      Input tensor to be quantized
     * @param scaleTensor Scale 1D Tensor parameter with size == tensor.shape[axis]
     * @param zeroPoint   Bias scalar parameter (converted to dataType of resultTensor)
     * @param dataType    Integer data type of the result tensor
     * @param axis        Axis on which the scale 1D value is being broadcasted
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor array of datatype dataType
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("quantizeTensor:scaleTensor:zeroPoint:dataType:axis:name:")
    public native MPSGraphTensor quantizeTensorScaleTensorZeroPointDataTypeAxisName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor scaleTensor, double zeroPoint, int dataType, @NInt long axis,
            @Nullable String name);

    /**
     * Create Quantize op and return the result tensor
     * 
     * Convert the float `tensor` to an i8 or u8 tensor by applying a scale + bias transform:
     * result = (tensor / scaleTensor) + zeroPointTensor
     * 
     * @param tensor          Input tensor to be quantized
     * @param scaleTensor     Scale scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * @param zeroPointTensor Bias scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * @param dataType        Integer data type of the result tensor
     * @param axis            Axis on which the scale 1D value is being broadcasted
     * @param name            The name for the operation
     * 
     * @return A valid MPSGraphTensor array of datatype dataType
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("quantizeTensor:scaleTensor:zeroPointTensor:dataType:axis:name:")
    public native MPSGraphTensor quantizeTensorScaleTensorZeroPointTensorDataTypeAxisName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor scaleTensor,
            @NotNull MPSGraphTensor zeroPointTensor, int dataType, @NInt long axis, @Nullable String name);

    /**
     * Create reduction and op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("reductionAndWithTensor:axes:name:")
    public native MPSGraphTensor reductionAndWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction and op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("reductionAndWithTensor:axis:name:")
    public native MPSGraphTensor reductionAndWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction or op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axes   axes of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("reductionOrWithTensor:axes:name:")
    public native MPSGraphTensor reductionOrWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction or op and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   axis of reduction
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("reductionOrWithTensor:axis:name:")
    public native MPSGraphTensor reductionOrWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * @param gradient     Incoming gradient tensor
     * @param input        Forward pass input tensor
     * @param centerResult Controls if the result image is centered on the input image. When NO, the result will have
     *                     the top left corner aligned
     * @param alignCorners When YES, the result image will have the same value as the input image in the corners
     * @param layout       Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                     layout.
     *                     Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeBilinearWithGradientTensor:input:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeBilinearWithGradientTensorInputCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, boolean centerResult, boolean alignCorners,
            @NUInt long layout, @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * @param gradient            Incoming gradient tensor
     * @param input               Forward pass input tensor
     * @param scaleOffset         1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * @param nearestRoundingMode The rounding mode to use when using nearest resampling.
     * @param layout              Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                            same layout.
     *                            Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name                The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeBilinearWithGradientTensor:input:scaleOffsetTensor:layout:name:")
    public native MPSGraphTensor resizeBilinearWithGradientTensorInputScaleOffsetTensorLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long layout, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using bilinear sampling.
     * See above discussion for more details.
     * 
     * @param imagesTensor Tensor containing input images.
     * @param size         1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * @param centerResult Controls if the result image is centered on the input image. When NO, the result will have
     *                     the top left corner aligned
     * @param alignCorners When YES, the result image will have the same value as the input image in the corners
     * @param layout       Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                     layout.
     *                     Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeBilinearWithTensor:sizeTensor:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeBilinearWithTensorSizeTensorCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, boolean centerResult,
            boolean alignCorners, @NUInt long layout, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using the provided scale and offset and bilinear sampling
     * See above discussion for more details.
     * 
     * @param imagesTensor        Tensor containing input images.
     * @param size                1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * @param scaleOffset         1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * @param nearestRoundingMode The rounding mode to use when using nearest resampling.
     * @param layout              Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                            same layout.
     *                            Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name                The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeBilinearWithTensor:sizeTensor:scaleOffsetTensor:layout:name:")
    public native MPSGraphTensor resizeBilinearWithTensorSizeTensorScaleOffsetTensorLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long layout, @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * @param gradient            Incoming gradient tensor
     * @param input               Forward pass input tensor
     * @param nearestRoundingMode The rounding mode to use when using nearest resampling.
     * @param centerResult        Controls if the result image is centered on the input image. When NO, the result will
     *                            have the top left corner aligned
     * @param alignCorners        When YES, the result image will have the same value as the input image in the corners
     * @param layout              Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                            same layout.
     *                            Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name                The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeNearestWithGradientTensor:input:nearestRoundingMode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeNearestWithGradientTensorInputNearestRoundingModeCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NUInt long nearestRoundingMode,
            boolean centerResult, boolean alignCorners, @NUInt long layout, @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * @param gradient            Incoming gradient tensor
     * @param input               Forward pass input tensor
     * @param scaleOffset         1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * @param nearestRoundingMode The rounding mode to use when using nearest resampling.
     * @param layout              Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                            same layout.
     *                            Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name                The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeNearestWithGradientTensor:input:scaleOffsetTensor:nearestRoundingMode:layout:name:")
    public native MPSGraphTensor resizeNearestWithGradientTensorInputScaleOffsetTensorNearestRoundingModeLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long nearestRoundingMode, @NUInt long layout, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using nearest neighbor sampling. This API allows for
     * the rounding mode to be specified.
     * See above discussion for more details.
     * 
     * @param imagesTensor        Tensor containing input images.
     * @param size                1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * @param nearestRoundingMode The rounding mode to use when using nearest resampling. Default is roundPreferCeil.
     * @param centerResult        Controls if the result image is centered on the input image. When NO, the result will
     *                            have the top left corner aligned
     * @param alignCorners        When YES, the result image will have the same value as the input image in the corners
     * @param layout              Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                            same layout.
     *                            Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name                The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeNearestWithTensor:sizeTensor:nearestRoundingMode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeNearestWithTensorSizeTensorNearestRoundingModeCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NUInt long nearestRoundingMode,
            boolean centerResult, boolean alignCorners, @NUInt long layout, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using the provided scale and offset and nearest neighbor sampling
     * See above discussion for more details.
     * 
     * @param imagesTensor        Tensor containing input images.
     * @param size                1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * @param scaleOffset         1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * @param nearestRoundingMode The rounding mode to use when using nearest resampling.
     * @param layout              Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                            same layout.
     *                            Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name                The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeNearestWithTensor:sizeTensor:scaleOffsetTensor:nearestRoundingMode:layout:name:")
    public native MPSGraphTensor resizeNearestWithTensorSizeTensorScaleOffsetTensorNearestRoundingModeLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long nearestRoundingMode, @NUInt long layout, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using the provided scale and offset.
     * Destination indices are computed using
     * [@code]
     * dst_indices = (src_indices * scale) + offset
     * [@endcode]
     * For most use cases passing the scale and offset directly is unnecessary, and it is
     * preferable to use the API specifying centerResult and alignCorners.
     * 
     * @param imagesTensor Tensor containing input images.
     * @param size         1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * @param scaleOffset  1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * @param mode         The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be
     *                     used.
     * @param layout       Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                     layout.
     *                     Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeTensor:sizeTensor:scaleOffsetTensor:mode:layout:name:")
    public native MPSGraphTensor resizeTensorSizeTensorScaleOffsetTensorModeLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long mode, @NUInt long layout, @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * @param gradient    Incoming gradient tensor
     * @param input       Forward pass input tensor
     * @param scaleOffset 1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * @param mode        The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be
     *                    used.
     * @param layout      Specifies what layout the provided tensor is in. The returned tensor will follow the same
     *                    layout.
     *                    Valid layouts are NHWC, NCHW, HWC, CHW, and HW.
     * @param name        The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeWithGradientTensor:input:scaleOffsetTensor:mode:layout:name:")
    public native MPSGraphTensor resizeWithGradientTensorInputScaleOffsetTensorModeLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long mode, @NUInt long layout, @Nullable String name);

    /**
     * Samples a tensor using the coordinates provided, using nearest neighbor sampling with specified rounding mode.
     * 
     * Given an input tensor (N, H1, W1, C) or (N, C, H1, W1) and coordinates tensor (N, H2, W2, 2) this operation
     * outputs a tensor of
     * size (N, H2, W2, C) or (N, C, H2, W2) by sampling the input tensor at the coordinates provided by the coordinates
     * tensor.
     * 
     * @param source               Tensor containing source data
     * @param coordinates          a tensor (N, Hout, Wout, 2) that contains the coordinates of the samples in the
     *                             source tensor
     *                             that constitute the output tensor.
     * @param layout               Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                             same layout.
     *                             Valid layouts are NHWC and NCHW.
     * @param normalizeCoordinates If true, coordinates are within [-1, 1] x [-1, 1] otherwise they are in pixels in the
     *                             input tensor.
     * @param relativeCoordinates  If true, coordinates are relative to the postion of the pixel in the output tensor
     *                             and scaled back to the input tensor size
     * @param alignCorners         If true, coordinate extrema are equal to the center of edge pixels, otherwise extrema
     *                             are equal to outer edge of edge pixels
     * @param paddingMode          determines how samples outside the inputTensor are evaluated (only constant, reflect,
     *                             symmetric and clampToEdge are supported)
     * @param nearestRoundingMode  The rounding mode to use for determining the nearest neighbor. Valid modes are
     *                             roundPreferCeil, roundPreferFloor, ceil, and floor.
     * @param constantValue        If paddingMode is MPSGraphPaddingModeConstant, then this constant is used for samples
     *                             outside
     *                             the input tensor.
     * @param name                 The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("sampleGridWithSourceTensor:coordinateTensor:layout:normalizeCoordinates:relativeCoordinates:alignCorners:paddingMode:nearestRoundingMode:constantValue:name:")
    public native MPSGraphTensor sampleGridWithSourceTensorCoordinateTensorLayoutNormalizeCoordinatesRelativeCoordinatesAlignCornersPaddingModeNearestRoundingModeConstantValueName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor coordinates, @NUInt long layout,
            boolean normalizeCoordinates, boolean relativeCoordinates, boolean alignCorners, @NInt long paddingMode,
            @NUInt long nearestRoundingMode, double constantValue, @Nullable String name);

    /**
     * Samples a tensor using the coordinates provided.
     * 
     * Given an input tensor (N, H1, W1, C) or (N, C, H1, W1) and coordinates tensor (N, H2, W2, 2) this operation
     * outputs a tensor of
     * size (N, H2, W2, C) or (N, C, H2, W2) by sampling the input tensor at the coordinates provided by the coordinates
     * tensor.
     * 
     * @param source               Tensor containing source data
     * @param coordinates          a tensor (N, Hout, Wout, 2) that contains the coordinates of the samples in the
     *                             source tensor
     *                             that constitute the output tensor.
     * @param layout               Specifies what layout the provided tensor is in. The returned tensor will follow the
     *                             same layout.
     *                             Valid layouts are NHWC and NCHW.
     * @param normalizeCoordinates If true, coordinates are within [-1, 1] x [-1, 1] otherwise they are in pixels in the
     *                             input tensor.
     * @param relativeCoordinates  If true, coordinates are relative to the postion of the pixel in the output tensor
     *                             and scaled back to the input tensor size
     * @param alignCorners         If true, coordinate extrema are equal to the center of edge pixels, otherwise extrema
     *                             are equal to outer edge of edge pixels
     * @param paddingMode          determines how samples outside the inputTensor are evaluated (only constant, reflect,
     *                             symmetric and clampToEdge are supported)
     * @param samplingMode         Can be either MPSGraphResizeNearest or MPSGraphResizeBilinear. Nearest sampling will
     *                             use roundPreferCeil.
     * @param constantValue        If paddingMode is MPSGraphPaddingModeConstant, then this constant is used for samples
     *                             outside
     *                             the input tensor.
     * @param name                 The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("sampleGridWithSourceTensor:coordinateTensor:layout:normalizeCoordinates:relativeCoordinates:alignCorners:paddingMode:samplingMode:constantValue:name:")
    public native MPSGraphTensor sampleGridWithSourceTensorCoordinateTensorLayoutNormalizeCoordinatesRelativeCoordinatesAlignCornersPaddingModeSamplingModeConstantValueName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor coordinates, @NUInt long layout,
            boolean normalizeCoordinates, boolean relativeCoordinates, boolean alignCorners, @NInt long paddingMode,
            @NUInt long samplingMode, double constantValue, @Nullable String name);

    /**
     * Create ScatterAlongAxis op and return the result tensor
     * 
     * Scatter values from `updatesTensor` along the specified `axis` at indices in `indicesTensor` onto `dataTensor`.
     * Values in `dataTensor` are updated following `mode`. See MPSGraphScatterMode.
     * The shape of `updatesTensor` and `indicesTensor` must match. The shape of `dataTensor` must match except at
     * `axis`.
     * If an index is out of bounds of `shape` along `axis` the update value is skipped.
     * 
     * For example,
     * [@code]
     * data = [ [0, 0, 0],
     * [1, 1, 1],
     * [2, 2, 2],
     * [3, 3, 3] ]
     * updates = [ [1, 2, 3],
     * [4, 5, 6] ]
     * indices = [ [2, 1, 0],
     * [1, 3, 2] ]
     * axis = 0
     * result = scatterAlongAxis(axis, data, updates, indices, MPSGraphScatterModeAdd, "scatter")
     * result = [ [0, 0, 3],
     * [5, 3, 1],
     * [3, 2, 8],
     * [3, 8, 3] ]
     * [@endcode]
     * 
     * @param axis          The axis to scatter to. Negative values wrap around
     * @param dataTensor    The input tensor to scatter values onto
     * @param updatesTensor The input tensor to scatter values from
     * @param indicesTensor Int32 or Int64 tensor used to index the result tensor
     * @param mode          The type of update to use
     * @param name          The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("scatterAlongAxis:withDataTensor:updatesTensor:indicesTensor:mode:name:")
    public native MPSGraphTensor scatterAlongAxisWithDataTensorUpdatesTensorIndicesTensorModeName(@NInt long axis,
            @NotNull MPSGraphTensor dataTensor, @NotNull MPSGraphTensor updatesTensor,
            @NotNull MPSGraphTensor indicesTensor, @NInt long mode, @Nullable String name);

    /**
     * Create ScatterAlongAxis op and return the result tensor
     * 
     * See above discussion of scatterAlongAxis: withDataTensor: updatesTensor: indicesTensor: shape: mode: name:
     * 
     * @param axisTensor    Scalar Int32 tensor. The axis to scatter to. Negative values wrap around
     * @param dataTensor    The input tensor to scatter values onto
     * @param updatesTensor The input tensor to scatter values from
     * @param indicesTensor Int32 or Int64 tensor used to index the result tensor
     * @param mode          The type of update to use
     * @param name          The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("scatterAlongAxisTensor:withDataTensor:updatesTensor:indicesTensor:mode:name:")
    public native MPSGraphTensor scatterAlongAxisTensorWithDataTensorUpdatesTensorIndicesTensorModeName(
            @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor dataTensor,
            @NotNull MPSGraphTensor updatesTensor, @NotNull MPSGraphTensor indicesTensor, @NInt long mode,
            @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:initState:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNGradientsWithSourceTensorRecurrentWeightSourceGradientZStateInitStateDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState, @Nullable MPSGraphTensor initState,
            @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:inputWeight:bias:initState:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNGradientsWithSourceTensorRecurrentWeightSourceGradientZStateInputWeightBiasInitStateDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:inputWeight:bias:initState:mask:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNGradientsWithSourceTensorRecurrentWeightSourceGradientZStateInputWeightBiasInitStateMaskDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor mask, @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * Create a single-gate RNN gradient op and return the gradient tensor values.
     * 
     * @param source          Tensor containing the source data `x[t]` - shape should be [T,N,I].
     *                        In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H]
     *                        and for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * @param recurrentWeight Tensor containing the recurrent weights `R`.
     *                        For `bidirectional` the layout is [2,H,H] and otherwise it is [H,H].
     *                        Note: For `bidirectional` this tensor must have a static shape.
     * @param sourceGradient  Input gradient, that is gradient of a tensor wrt. to first output of the forward pass.
     * @param zState          The second output of `singleGateRNNWithSourceTensor` with @ref `descriptor.training =
     *                        true`.
     * @param stateGradient   Input gradient coming from the future timestep - optional, if missing assumes zeroes.
     * @param inputWeight     Tensor containing the input weights matrix `W` - optional, if missing assumes diagonal
     *                        unit-matrix.
     *                        For `bidirectional` the layout is [2H,I] and otherwise it is [H,I].
     * @param bias            Tensor containing the bias `b` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [2H] and otherwise it is [H].
     * @param initState       Initial internal state of the RNN `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param mask            Tensor containing the mask `m` - optional, if missing assumes ones. Useful for dropout.
     * @param descriptor      The RNN op definition.
     * @param name            The name for the operation.
     * 
     * @return A valid MPSGraphTensor array containing gradients for each input tensor, except for `sourceGradient` and
     *         `mask`.
     *         In case an input is nil, no gradient will be returned for it.
     *         The order of the gradients will be: for source, for recurrentWeight, for inputWeight, for bias, for
     *         initState.
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:stateGradient:inputWeight:bias:initState:mask:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNGradientsWithSourceTensorRecurrentWeightSourceGradientZStateStateGradientInputWeightBiasInitStateMaskDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @NotNull MPSGraphTensor sourceGradient, @NotNull MPSGraphTensor zState,
            @Nullable MPSGraphTensor stateGradient, @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias,
            @Nullable MPSGraphTensor initState, @Nullable MPSGraphTensor mask,
            @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNWithSourceTensor:recurrentWeight:initState:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNWithSourceTensorRecurrentWeightInitStateDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight, @Nullable MPSGraphTensor initState,
            @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNWithSourceTensorRecurrentWeightInputWeightBiasInitStateDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * Create a single-gate RNN op and return the value and optionally training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * [@code]
     * for t = 0 to T-1
     * z[t] = x[t] W^T + (h[t-1] * m) R^T + b
     * h[t] = activation( z[t] ), where
     * [@endcode]
     * `W` is optional @ref inputWeight, `R` is @ref recurrentWeight, `b` is @ref bias, `m` is optional @mask,
     * `x[t]` is @ref source `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is @ref
     * initState.
     * See @ref MPSGraphSingleGateRNNDescriptor for different `activation` options.
     * 
     * @param source          Tensor containing the source data `x[t]` - shape should be [T,N,I].
     *                        In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H]
     *                        and for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * @param recurrentWeight Tensor containing the recurrent weights `R`.
     *                        For `bidirectional` the layout is [2,H,H] and otherwise it is [H,H].
     * @param inputWeight     Tensor containing the input weights matrix `W` - optional, if missing assumes diagonal
     *                        unit-matrix.
     *                        For `bidirectional` the layout is [2H,I] and otherwise it is [H,I].
     * @param bias            Tensor containing the bias `b` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [2H] and otherwise it is [H].
     * @param initState       Initial internal state of the RNN `h[-1]` - optional, if missing assumes zeroes.
     *                        For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * @param mask            Tensor containing the mask `m` - optional, if missing assumes ones. Useful for dropout.
     * @param descriptor      The RNN op definition.
     * @param name            The name for the operation.
     * 
     * @return A valid MPSGraphTensor array of size 1 or 2, depending on value of @ref `descriptor.training`.
     *         The layout of the both outputs are [T,N,H] or [T,N,2H] for bidirectional.
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNWithSourceTensorRecurrentWeightInputWeightBiasInitStateMaskDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor mask, @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * Create a sort operation and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axis       the tensor dimension over which the sort occurs
     * @param descending wether to sort or not in descending order
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axis:descending:name:")
    public native MPSGraphTensor sortWithTensorAxisDescendingName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            boolean descending, @Nullable String name);

    /**
     * Create an ascending sort operation and return the result tensor.
     * 
     * @param tensor input tensor
     * @param axis   the tensor dimension over which the sort occurs
     * @param name   name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axis:name:")
    public native MPSGraphTensor sortWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create a sort operation and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the sort occurs
     * @param descending wether to sort or not in descending order
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axisTensor:descending:name:")
    public native MPSGraphTensor sortWithTensorAxisTensorDescendingName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, boolean descending, @Nullable String name);

    /**
     * Create an ascending sort operation and return the result tensor.
     * 
     * @param tensor     input tensor
     * @param axisTensor the tensor dimension over which the sort occurs
     * @param name       name for the operation
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axisTensor:name:")
    public native MPSGraphTensor sortWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Create space-to-batch op and return the result tensor.
     * 
     * This operation outputs a copy of the `input` tensor, where values from the
     * `spatialAxes` (for `usePixelShuffleOrder=YES`1,2 or 3 axes supported, otherwise
     * limited only by MPSNDArray rank limitations) dimensions are moved in spatial blocks with
     * rectangular size defined by `blockDimensions` to the `batchAxis` dimension.
     * `usePixelShuffleOrder` can be used to control how the data within spatial blocks is ordered
     * in the `batchAxis` dimension: with `usePixelShuffleOrder=YES` the values within the
     * spatial blocks are stored contiguosly within the `batchAxis` dimension whereas
     * otherwise they are stored interleaved with existing values in the `batchAxis`
     * dimension.
     * Note: This operation is the inverse of `batchToSpace`.
     * Note: This operation is a generalization of `depthToSpace2D`.
     * 
     * @param tensor               The input tensor.
     * @param spatialAxes          Axes that define the dimensions containing the spatial blocks.
     * @param batchAxis            Axis that defines the destination dimension, where to copy the blocks.
     * @param blockDimensions      Defines the size of the rectangular spatial sub-block.
     * @param usePixelShuffleOrder Controls layout of the sub-blocks within the batch dimension.
     * @param name                 The name for the operation.
     * 
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("spaceToBatchTensor:spatialAxes:batchAxis:blockDimensions:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToBatchTensorSpatialAxesBatchAxisBlockDimensionsUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull NSArray<? extends NSNumber> spatialAxes, @NInt long batchAxis,
            @NotNull NSArray<? extends NSNumber> blockDimensions, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("spaceToBatchTensor:spatialAxesTensor:batchAxisTensor:blockDimensionsTensor:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToBatchTensorSpatialAxesTensorBatchAxisTensorBlockDimensionsTensorUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor spatialAxesTensor,
            @NotNull MPSGraphTensor batchAxisTensor, @NotNull MPSGraphTensor blockDimensionsTensor,
            boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Create split op and return the result
     * 
     * Splits the input tensor along `axis` into `numsplits` result tensors of equal size.
     * Requires that the lenth of the input along `axis` is divisible by `num_splits`.
     * 
     * @param tensor    Input tensor
     * @param numSplits The number of result tensors to split to
     * @param axis      The dimension to split the input along
     * @param name      The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("splitTensor:numSplits:axis:name:")
    public native NSArray<? extends MPSGraphTensor> splitTensorNumSplitsAxisName(@NotNull MPSGraphTensor tensor,
            @NUInt long numSplits, @NInt long axis, @Nullable String name);

    /**
     * Create split op and return the result
     * 
     * Splits the input tensor along `axis` into multiple result tensors of size determined by `splitSizes`.
     * Requires that the sum of `splitSizes` is equal to the lenth of the input along `axis`.
     * 
     * @param tensor     Input tensor
     * @param splitSizes The length of the result tensors along the split axis
     * @param axis       The dimension to split the input along
     * @param name       The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("splitTensor:splitSizes:axis:name:")
    public native NSArray<? extends MPSGraphTensor> splitTensorSplitSizesAxisName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> splitSizes, @NInt long axis, @Nullable String name);

    /**
     * Create split op and return the result
     * 
     * Splits the input tensor along `axis` into multiple result tensors of size determined by `splitSizes`.
     * Requires that the sum of `splitSizesTensor` is equal to the lenth of the input along `axis`.
     * 
     * @param tensor           Input tensor
     * @param splitSizesTensor The length of the result tensors along the split axis
     * @param axis             The dimension to split the input along
     * @param name             The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("splitTensor:splitSizesTensor:axis:name:")
    public native NSArray<? extends MPSGraphTensor> splitTensorSplitSizesTensorAxisName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor splitSizesTensor, @NInt long axis, @Nullable String name);

    /**
     * Create squeeze op and return the result
     * 
     * Squeezes the tensor, removing dimensions with size 1 at specified axes.
     * Size must be 1 at all specified axes.
     * 
     * @param tensor Input tensor
     * @param axes   The axes to squeeze
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:axes:name:")
    public native MPSGraphTensor squeezeTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:axesTensor:name:")
    public native MPSGraphTensor squeezeTensorAxesTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @Nullable String name);

    /**
     * Create squeeze op and return the result
     * 
     * Squeezes the tensor, removing a dimension with size 1 at specified axis.
     * Size must be 1 at specified axis.
     * 
     * @param tensor Input tensor
     * @param axis   The axis to squeeze
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:axis:name:")
    public native MPSGraphTensor squeezeTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create squeeze op and return the result
     * 
     * Squeezes the tensor, removing any dimensions with size 1.
     * 
     * @param tensor Input tensor
     * @param name   The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:name:")
    public native MPSGraphTensor squeezeTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create stack op and return the result
     * 
     * Stacks all input tensors along `axis` into a result tensor of rank + 1. Tensors must be broadcast
     * compatible along all dimensions, and have the same type.
     * 
     * @param inputTensors Input tensors
     * @param axis         The dimension to stack tensors into result. Must be in range - rank + 1 <= dimension < rank +
     *                     1
     * @param name         The name for the operation
     * 
     * @return A valid MPSGraphTensor object
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("stackTensors:axis:name:")
    public native MPSGraphTensor stackTensorsAxisName(@NotNull NSArray<? extends MPSGraphTensor> inputTensors,
            @NInt long axis, @Nullable String name);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("transposeTensor:permutation:name:")
    public native MPSGraphTensor transposeTensorPermutationName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> permutation, @Nullable String name);

    /**
     * Truncate op - floor for positive inputs, ceil for negative.
     * 
     * @param tensor The input
     * @param name   Name for the operation
     * @return A valid MPSGraphTensor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("truncateWithTensor:name:")
    public native MPSGraphTensor truncateWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);
}
