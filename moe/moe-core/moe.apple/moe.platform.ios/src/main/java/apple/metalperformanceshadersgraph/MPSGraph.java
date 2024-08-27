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
 * Optimized representation of a compute graph of MPSGraphOperations and MPSGraphTensors.
 * 
 * An MPSGraph is a symbolic representation of operations to be utilized to execute compute graphs on a device.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraph extends MPSGraphObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraph(Pointer peer) {
        super(peer);
    }

    /**
     * Creates a L2-Norm pooling gradient operation and returns the result tensor.
     * 
     * - Parameters:
     * - gradient: An input gradient tensor.
     * - source: The input tensor for the forward pass.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates and
     * paddings.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("L2NormPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 4d L2-Norm pooling operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: A source tensor.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates and
     * paddings.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("L2NormPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Returns the absolute values of the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("absoluteWithTensor:name:")
    public native MPSGraphTensor absoluteWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Applies the inverse cosine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("acosWithTensor:name:")
    public native MPSGraphTensor acosWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the inverse hyperbolic cosine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("acoshWithTensor:name:")
    public native MPSGraphTensor acoshWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Adds two input tensors.
     * 
     * This operation creates an add op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor + secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
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

    /**
     * The StochasticGradientDescent performs a gradient descent
     * `variable = variable - (learningRate * g)`
     * where,
     * `g` is gradient of error wrt variable
     * this op directly writes to the variable
     * 
     * - Parameters:
     * - learningRateTensor: scalar tensor which indicates the learning rate to use with the optimizer
     * - variable: variable operation with trainable parameters
     * - gradientTensor: partial gradient of the trainable parameters with respect to loss
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("applyStochasticGradientDescentWithLearningRateTensor:variable:gradientTensor:name:")
    public native MPSGraphOperation applyStochasticGradientDescentWithLearningRateTensorVariableGradientTensorName(
            @NotNull MPSGraphTensor learningRateTensor, @NotNull MPSGraphVariableOp variable,
            @NotNull MPSGraphTensor gradientTensor, @Nullable String name);

    /**
     * Applies the inverse sine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("asinWithTensor:name:")
    public native MPSGraphTensor asinWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the inverse hyperbolic sine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("asinhWithTensor:name:")
    public native MPSGraphTensor asinhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates an assign op which writes at this point of execution of the graph.
     * 
     * - Parameters:
     * - variable: The variable resource tensor to assign to.
     * - tensor: The tensor to assign to the variable.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("assignVariable:withValueOfTensor:name:")
    public native MPSGraphOperation assignVariableWithValueOfTensorName(@NotNull MPSGraphTensor variable,
            @NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Returns the elementwise 2-argument arctangent of the input tensors.
     * 
     * This operation creates a `atan2` op and returns the result tensor. It supports broadcasting as well.
     * Graph computes arc tangent of primaryTensor over secondaryTensor.
     * ```md
     * resultTensor = atan2(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("atan2WithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor atan2WithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Applies the inverse tangent operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("atanWithTensor:name:")
    public native MPSGraphTensor atanWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the inverse hyperbolic tangent operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("atanhWithTensor:name:")
    public native MPSGraphTensor atanhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Creates a 2d average pooling gradient operation and returns the result tensor.
     * 
     * - Parameters:
     * - gradient: A 2d input gradient tensor - must be of rank=4. The layout is defined by `descriptor.dataLayout`.
     * - source: The input tensor for the forward pass.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates,
     * paddings and layouts.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("avgPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 2d average-pooling operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: A 2d Image source as tensor - must be of rank=4. The layout is defined by `descriptor.dataLayout`.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates,
     * paddings and layouts.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("avgPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates an average pooling gradient operation and returns the result tensor.
     * 
     * - Parameters:
     * - gradient: An input gradient tensor.
     * - source: The input tensor for the forward pass.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates and
     * paddings.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("avgPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 4d average pooling operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: A source tensor.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates and
     * paddings.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("avgPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a broadcast operation and returns the result tensor.
     * 
     * Broadcasts values inside the tensor, starting from the trailing dimensions, to give it the correct shape.
     * This is equivalent to the broadcasting for arithmetic operations when operands have different shapes.
     * 
     * - Parameters:
     * - tensor: The Tensor to be broadcasted.
     * - shapeTensor: A rank-1 tensor of type `MPSDataTypeInt32` or `MPSDataTypeInt64` that defines the shape of the
     * result tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
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
     * Creates a cast operation and returns the result tensor.
     * 
     * Returns the input tensor casted to the specied data type.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - type: The datatype to which MPSGraph casts the input.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("castTensor:toType:name:")
    public native MPSGraphTensor castTensorToTypeName(@NotNull MPSGraphTensor tensor, int type, @Nullable String name);

    /**
     * Applies the ceiling operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("ceilWithTensor:name:")
    public native MPSGraphTensor ceilWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Clamps the values in the first tensor between the corresponding values in the min and max value tensor.
     * 
     * This operation creates a clamp op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = clamp(tensor, minValueTensor, maxValueTensor)
     * ```
     * 
     * - Parameters:
     * - tensor: The tensor to be clamped.
     * - minValueTensor: The tensor with min values to clamp to.
     * - minValueTensor: The tensor with max values to clamp to.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
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
     * Creates a concatenation operation and returns the result tensor.
     * 
     * Concatenates two input tensors along the specified dimension. Tensors must be broadcast
     * compatible along all other dimensions, and have the same datatype.
     * 
     * - Parameters:
     * - tensor: The first tensor to concatenate.
     * - tensor2: The second tensor to concatenate.
     * - dimensionIndex: The dimension to concatenate across, must be in range: `-rank <= dimension < rank`.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("concatTensor:withTensor:dimension:name:")
    public native MPSGraphTensor concatTensorWithTensorDimensionName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor tensor2, @NInt long dimensionIndex, @Nullable String name);

    /**
     * Creates a concatenation operation and returns the result tensor.
     * 
     * Concatenates all input tensors along specified dimension. All inputs must be broadcast
     * compatible along all other dimensions, and have the same type.
     * When interleave is specified, all tensors will be interleaved. To interleave, make sure to provide broadcast
     * compatible inputs along the specified dimension as well.
     * For example:
     * ```md
     * operand0 = [1, 2, 3]
     * operand1 = [4, 5, 6]
     * concat([operand0, operand1], axis = 0, interleave = YES) = [1, 4, 2, 5, 3, 6]
     * ```
     * 
     * - Parameters:
     * - tensors: The tensors to concatenate.
     * - dimensionIndex: The dimension to concatenate across, must be in range: `-rank <= dimension < rank`.
     * - interleave: A boolean value that specifies whether the operation interleaves input tensors.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("concatTensors:dimension:interleave:name:")
    public native MPSGraphTensor concatTensorsDimensionInterleaveName(
            @NotNull NSArray<? extends MPSGraphTensor> tensors, @NInt long dimensionIndex, boolean interleave,
            @Nullable String name);

    /**
     * Creates a concatenation operation and returns the result tensor.
     * 
     * Concatenates all input tensors along the specified dimension. All inputs must be broadcast
     * compatible along all other dimensions, and have the same datatype.
     * 
     * - Parameters:
     * - tensors: The tensors to concatenate.
     * - dimensionIndex: The dimension to concatenate across, must be in range: `-rank <= dimension < rank`.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("concatTensors:dimension:name:")
    public native MPSGraphTensor concatTensorsDimensionName(@NotNull NSArray<? extends MPSGraphTensor> tensors,
            @NInt long dimensionIndex, @Nullable String name);

    /**
     * Creates a constant op and returns the result tensor.
     * 
     * - Parameters:
     * - scalar: The scalar value to fill the entire tensor values with.
     * - dataType: The dataType of the constant tensor.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("constantWithScalar:dataType:")
    public native MPSGraphTensor constantWithScalarDataType(double scalar, int dataType);

    /**
     * Runs the graph for given feeds to return targetTensor values, ensuring all target operations also executed. This
     * call blocks till execution has completed.
     * 
     * - Parameters:
     * - operations: Operations maked as control dependency for all ops created inside the dependent block
     * - dependentBlock: MPSGraphControlFlowDependencyBlock which is provided by caller to create dependent ops
     * - name: name of scope
     * - Returns: A valid MPSGraphTensor array with results returned from dependentBlock forwarded
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
     * Creates a 2d convolution gradient operation with respect to the source tensor of the forward convolution.
     * 
     * If `S` is source tensor to forward convoluiton, `R` is the result/returned tensor of forward convolution,
     * and `L` is the loss function, convolution2DDataGradientWithIncomingGradientTensor returns tensor `dL/dS = dL/dR *
     * dR/dS`,
     * where `dL/dR` is the incomingGradient parameter.
     * 
     * - Parameters:
     * - incomingGradient: Incoming loss gradient tensor
     * - weights: Forward pass weights tensor
     * - outputShapeTensor: 4D Int32 or Int64 tensor. Shape of the forward pass source tensor
     * - forwardConvolutionDescriptor: Forward convolution 2d op ``descriptor``
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolution2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DDataGradientWithIncomingGradientTensorWeightsTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphTensor outputShapeTensor,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Creates a 2d convolution gradient operation with respect to weights tensor of forward convolution.
     * 
     * If `W` is weights tensor to forward convoluiton, `R` is the result/returned tensor of forward convolution,
     * and `L` is the loss function, convolution2DWeightsGradientWithIncomingGradientTensor returns tensor `dL/dW =
     * dL/dR * dR/dW`,
     * where `dL/dR` is the incomingGradient parameter.
     * 
     * - Parameters:
     * - incomingGradient: Incoming loss gradient tensor
     * - weights: Forward pass weights tensor
     * - outputShapeTensor: 4D int32 or Int64 Tensor. Shape of the forward pass source tensor
     * - forwardConvolutionDescriptor: Forward convolution 2d op ``descriptor``
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolution2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DWeightsGradientWithIncomingGradientTensorSourceTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor outputShapeTensor,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Creates a 2d (forward) convolution operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: source tensor - must be a rank 4 tensor. The layout is defined by ``descriptor.dataLayout``.
     * - weights: weights tensor, must be rank 4. The layout is defined by ``descriptor.weightsLayout``.
     * - descriptor: Specifies strides, dilation rates, paddings and layouts.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("convolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor convolution2DWithSourceTensorWeightsTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphConvolution2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a convolution transpose gradient operation with respect of source tensor of convolution transpose
     * operation and returns the result tensor.
     * 
     * Inserts an operation in graph to compute gradient of convolution transpose with respect to source tensor of the
     * corresponding
     * convolution transpose operation.
     * 
     * - Parameters:
     * - incomingGradient: Incoming gradient tensor
     * - weights: Forward pass weights tensor
     * - outputShape: 1D Int32 or Int64 Tensor. Shape of the forward pass source tensor
     * - forwardConvolutionDescriptor: Forward pass op descriptor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolutionTranspose2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DDataGradientWithIncomingGradientTensorWeightsTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor incomingGradient, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Creates a convolution transpose gradient operation with respect of the weights tensor of convolution transpose
     * operation and returns the result tensor.
     * 
     * Inserts an operation in graph to compute gradient of convolution transpose with respect to the weights tensor of
     * the corresponding
     * convolution transpose operation.
     * 
     * - Parameters:
     * - incomingGradientTensor: Incoming gradient tensor
     * - source: Forward pass source tensor
     * - outputShape: 1D Int32 or Int64 Tensor. Shape of the forward pass source weights tensor
     * - forwardConvolutionDescriptor: Forward pass op descriptor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolutionTranspose2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWeightsGradientWithIncomingGradientTensorSourceTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Creates a convolution transpose operation and return the result tensor.
     * 
     * - Parameters:
     * - source: input tensor
     * - weights: weights tensor
     * - outputShape: 1D Int32 or Int64 tensor. shape of the result tensor
     * - descriptor: descriptor for the corresponding forward Conv2d operation
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("convolutionTranspose2DWithSourceTensor:weightsTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWithSourceTensorWeightsTensorOutputShapeTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights, @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphConvolution2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Applies the cosine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("cosWithTensor:name:")
    public native MPSGraphTensor cosWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the hyperbolic cosine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("coshWithTensor:name:")
    public native MPSGraphTensor coshWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Creates a depth-to-space2d operation and returns the result tensor.
     * 
     * This operation outputs a copy of the input tensor, where values from the
     * `depthAxis` dimension are moved in spatial blocks of size `blockSize` to the
     * `heightAxis` and `widthAxis` dimensions. Use the `usePixelShuffleOrder` parameter
     * to control how the data within spatial blocks is ordered in the
     * `depthAxis` dimension: with `usePixelShuffleOrder = YES` MPSGraph stores the values
     * of the spatial block contiguosly within the `depthAxis` dimension, whereas
     * without it they are stored interleaved with existing values in the `depthAxisTensor` dimension.
     * This operation is the inverse of
     * ``MPSGraph/spaceToDepth2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:``.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - widthAxis: The axis that defines the fastest running dimension within the block.
     * - heightAxis: The axis that defines the 2nd fastest running dimension within the block.
     * - depthAxis: The axis that defines the destination dimension, where to copy the blocks.
     * - blockSize: The size of the square spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls the layout of the sub-blocks within the depth dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("depthToSpace2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensorWidthAxisHeightAxisDepthAxisBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NUInt long widthAxis, @NUInt long heightAxis, @NUInt long depthAxis,
            @NUInt long blockSize, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Creates a depth-to-space2d operation and returns the result tensor.
     * 
     * This operation outputs a copy of the input tensor, where values from the
     * `depthAxisTensor` dimension are moved in spatial blocks of size `blockSize` to the
     * `heightAxisTensor` and `widthAxisTensor` dimensions. Use the `usePixelShuffleOrder` parameter
     * to control how the data within spatial blocks is ordered in the
     * `depthAxisTensor` dimension: with `usePixelShuffleOrder = YES` MPSGraph stores the values
     * of the spatial block contiguosly within the `depthAxisTensor` dimension, whereas
     * without it they are stored interleaved with existing values in the `depthAxisTensor` dimension.
     * This operation is the inverse of
     * ``MPSGraph/spaceToDepth2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:``.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - widthAxisTensor: A scalar tensor that contains the axis that defines the fastest running dimension within the
     * block.
     * - heightAxisTensor: A scalar tensor that contains the axis that defines the 2nd fastest running dimension within
     * the block.
     * - depthAxisTensor: A scalar tensor that contains the axis that defines the destination dimension, where to copy
     * the blocks.
     * - blockSize: The size of the square spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls the layout of the sub-blocks within the depth dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("depthToSpace2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensorWidthAxisTensorHeightAxisTensorDepthAxisTensorBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor widthAxisTensor,
            @NotNull MPSGraphTensor heightAxisTensor, @NotNull MPSGraphTensor depthAxisTensor, @NUInt long blockSize,
            boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Creates a 2d depthwise convolution operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: A 2d Image source as tensor - must be of rank=4. The layout is defined by `descriptor.dataLayout`.
     * - weights: The weights tensor, must be rank=4. The layout is defined by `descriptor.weightsLayout`.
     * - descriptor: The descriptor object that specifies strides, dilation rates, paddings and layouts.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("depthwiseConvolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution2DWithSourceTensorWeightsTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphDepthwiseConvolution2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 3d depthwise convolution operation and returns the result tensor.
     * 
     * Works exactly like depthwise convolution2d, but in three dimensions. Supports different layouts with
     * the ``MPSGraphDepthwiseConvolution3DOpDescriptor/channelDimensionIndex`` property.
     * If your weights need a different layout add a permute operation on them before this operation.
     * 
     * - Parameters:
     * - source: A 3d Image source as tensor - must be at least rank=4 (CDHW when channelDimensionIndex = -4).
     * - weights: The weights tensor, must be rank=4 - axes are interpreted as CDHW when channelDimensionIndex = -4 .
     * - descriptor: The descriptor object that specifies strides, dilation rates and paddings.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
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

    /**
     * Divides the first input tensor by the second, with the result being 0 if the denominator is 0.
     * 
     * ```md
     * resultTensor = select(secondaryTensor, primaryTensor / secondaryTensor, 0)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("divisionNoNaNWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor divisionNoNaNWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Divides the first input tensor by the second.
     * 
     * This operation creates a divide op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor / secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("divisionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor divisionWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Creates a dropout op and return the result
     * 
     * Removes values in the `tensor` with a percentage chance equal to `rate`. Removed values are set to 0
     * 
     * - Parameters:
     * - tensor: Input tensor
     * - rate: The rate of values to be set to 0
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("dropoutTensor:rate:name:")
    public native MPSGraphTensor dropoutTensorRateName(@NotNull MPSGraphTensor tensor, double rate,
            @Nullable String name);

    /**
     * Creates a dropout op and return the result
     * 
     * Removes values in the `tensor` with a percentage chance equal to `rate`. Removed values are set to 0
     * 
     * - Parameters:
     * - tensor: Input tensor
     * - rate: The rate of values to be set to 0
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("dropoutTensor:rateTensor:name:")
    public native MPSGraphTensor dropoutTensorRateTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor rate, @Nullable String name);

    /**
     * Returns the elementwise equality check of the input tensors.
     * 
     * This operation creates a equal op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor == secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("equalWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor equalWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Applies the error function to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("erfWithTensor:name:")
    public native MPSGraphTensor erfWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies an exponent with base ten to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("exponentBase10WithTensor:name:")
    public native MPSGraphTensor exponentBase10WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies an exponent with base two to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("exponentBase2WithTensor:name:")
    public native MPSGraphTensor exponentBase2WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the natural exponent to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("exponentWithTensor:name:")
    public native MPSGraphTensor exponentWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a flatten2d operation and returns the result tensor.
     * 
     * Flattens dimensions before `axis` to `result[0]` and dimensions starting
     * from `axis` to `result[1]` and returns a rank-2 tensor as result.
     * 
     * - Parameters:
     * - tensor: The tensor to be flattened.
     * - axis: The axis around which to flatten.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("flatten2DTensor:axis:name:")
    public native MPSGraphTensor flatten2DTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Creates a flatten2d operation and returns the result tensor.
     * 
     * Flattens dimensions before `axis` to `result[0]` and dimensions starting
     * from `axis` to `result[1]` and returns a rank-2 tensor as result.
     * 
     * - Parameters:
     * - tensor: The tensor to be flattened.
     * - axisTensor: A scalar tensor that contains the axis around which to flatten.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("flatten2DTensor:axisTensor:name:")
    public native MPSGraphTensor flatten2DTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Returns the remainder of floor divison between the primary and secondary tensor.
     * Create floorModulo op and return the result tensor, it supports broadcasting as well, returns 0 if divisor is 0
     * ```md
     * resultTensor = primaryTensor - (floor(primaryTensor / secondaryTensor) * secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("floorModuloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor floorModuloWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Applies the floor operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("floorWithTensor:name:")
    public native MPSGraphTensor floorWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Adds a forLoop operation, The lower and upper bounds specify a half-open range: the range includes the lower
     * bound but does not include the upper bound.
     * 
     * - Parameters:
     * - lowerBound: lowerBound value of the loop, this is a scalar tensor, this is the index the loop will start with
     * - upperBound: upperBound value of the loop, this is a scalar tensor
     * - step: step value of the loop, this is a scalar tensor and must be positive
     * - initialBodyArguments: initial set of iteration arguments passed to the bodyBlock of the for loop
     * - body: bodyBlock, this will execute the body of the forLoop
     * - name: name of operation
     * - Returns: A valid MPSGraphTensor array with same count and corresponding elementTypes as
     * initialIterationArguments and return types of the forLoop
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
     * - Parameters:
     * - numberOfIterations: tensor with number of iterations the loop will execute
     * - initialBodyArguments: initial set of iteration arguments passed to the bodyBlock of the for loop
     * - body: bodyBlock, this will execute the body of the forLoop, index will go from 0 to numberOfIterations-1
     * - name: name of operation
     * - Returns: A valid MPSGraphTensor array with same count and corresponding elementTypes as
     * initialIterationArguments and return types of the forLoop
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
     * ```md
     * B = batchDims
     * U = updates.rank - B
     * P = res.rank - B
     * Q = inds.rank - B
     * K = inds.shape[-1]
     * index_slice = indices[i_{b0},...,i_{bB},i_{0},..,i_{Q-1}]
     * res[i_{b0},...,i_{bB},i_{0},...,i_{Q-1}] = updates[i_{b0},...,i_{bB},index_slice[0],...,index_slice[K-1]]
     * ```
     * The tensors have the following shape requirements
     * ```md
     * U > 0; P > 0; Q > 0
     * K <= U
     * P = (U-K) + Q-1
     * indices.shape[0:Q-1] = res.shape[0:Q-1]
     * res.shape[Q:P] = updates.shape[K:U]
     * ```
     * 
     * - Parameters:
     * - updatesTensor: Tensor containing slices to be inserted into the result tensor
     * - indicesTensor: Tensor containg the updates indices to read slices from
     * - batchDimensions: The number of batch dimensions
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
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
     * ```md
     * B = batchDims
     * U = updates.rank
     * P = res.rank
     * Q = inds.rank
     * res[p_{0},...p_{axis-1}, i_{B},...,i_{Q}, ...,p_{axis+1},...,p{U-1}] =
     * updates[p_{0},...p_{axis-1}, indices[p_{0},...,p_{B-1},i_{B},...,i_{Q}, ...,p_{axis+1},...,p{U-1}]
     * ```
     * The tensors have the following shape requirements
     * ```md
     * P = Q-B + U-1
     * indices.shape[0:B] = updates.shape[0:B] = res.shape[0:B]
     * res.shape[0:axis] = updates.shape[0:axis]
     * res.shape[axis:axis+Q-B] = indices.shape[B:]
     * res.shape[axis+1+Q-B:] = updates.shape[axis+1:]
     * ```
     * 
     * - Parameters:
     * - updatesTensor: Tensor containing slices to be inserted into the result tensor
     * - indicesTensor: Tensor containg the updates indices to read slices from
     * - axis: The dimension on which to perform the gather
     * - batchDimensions: The number of batch dimensions
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("gatherWithUpdatesTensor:indicesTensor:axis:batchDimensions:name:")
    public native MPSGraphTensor gatherWithUpdatesTensorIndicesTensorAxisBatchDimensionsName(
            @NotNull MPSGraphTensor updatesTensor, @NotNull MPSGraphTensor indicesTensor, @NUInt long axis,
            @NUInt long batchDimensions, @Nullable String name);

    /**
     * Calculates partial derivative of primaryTensor with respect to the tensors.
     * 
     * - Parameters:
     * - primaryTensor: Tensor to be differentiated (numerator).
     * - tensors: Tensors to do the differentiation with (denominator).
     * - name: Name for the gradient operation.
     * - Returns: A valid MPSGraphTensor dictionary object containing partial derivative
     * d(primaryTensor)/d(secondaryTensor) for each tensor as key.
     */
    @NotNull
    @Generated
    @Selector("gradientForPrimaryTensor:withTensors:name:")
    public native NSDictionary<? extends MPSGraphTensor, ? extends MPSGraphTensor> gradientForPrimaryTensorWithTensorsName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull NSArray<? extends MPSGraphTensor> tensors,
            @Nullable String name);

    /**
     * Checks in an elementwise manner if the first input tensor is greater than or equal to the second.
     * 
     * This operation creates a `greaterThanOrEqual` op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor < secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("greaterThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThanOrEqualToWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Checks in an elementwise manner if the first input tensor is greater than the second.
     * 
     * This operation creates a `greaterThan` op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor > secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("greaterThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThanWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Copies the input tensor values into the output, behaving as an identity operation.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object which is a copy of the input.
     */
    @NotNull
    @Generated
    @Selector("identityWithTensor:name:")
    public native MPSGraphTensor identityWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Add an if/then/else op to the graph
     * 
     * - Parameters:
     * - predicateTensor: Tensor must have a single scalar value, used to decide between then/else branches
     * - thenBlock: If predicate is true operations in this block are executed
     * - elseBlock: If predicate is false operations in this block are executed
     * - name: name of operation
     * - Returns: results If no error, the tensors returned by user. If not empty, user must define both then/else
     * block,
     * both should have same number of arguments and each corresponding argument should have same elementTypes.
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
     * Initialize an MPSGraph to insert nodes in.
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

    /**
     * Checks if the input tensor elements are finite or not.
     * 
     * If the input tensor element is finite, the operation returns `true`, else it returns `false`.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("isFiniteWithTensor:name:")
    public native MPSGraphTensor isFiniteWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Checks if the input tensor elements are infinite or not.
     * 
     * If the input tensor element is infinite, the operation returns `true`, else it returns `false`.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("isInfiniteWithTensor:name:")
    public native MPSGraphTensor isInfiniteWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Checks if the input tensor elements are `NaN` or not.
     * 
     * If the input tensor element is `NaN`, the operation returns `true`, else it returns `false`.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
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
     * Computes the gradient of the leaky ReLU (rectified linear unit activation).
     * 
     * This operation supports broadcasting with the alpha tensor.
     * 
     * - Parameters:
     * - gradient: The incoming gradient tensor.
     * - source: The input tensor in forward pass.
     * - alpha: The alpha tensor
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("leakyReLUGradientWithIncomingGradient:sourceTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLUGradientWithIncomingGradientSourceTensorAlphaTensorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor alphaTensor,
            @Nullable String name);

    /**
     * Computes the leaky ReLU (rectified linear unit activation) function on the input tensor.
     * 
     * The operation is: f(x) = max(x, alpha).
     * 
     * - Parameters:
     * - tensor: An input tensor.
     * - alpha: The scalar value alpha used by all elements in the input tensor.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("leakyReLUWithTensor:alpha:name:")
    public native MPSGraphTensor leakyReLUWithTensorAlphaName(@NotNull MPSGraphTensor tensor, double alpha,
            @Nullable String name);

    /**
     * Computes the leaky ReLU (rectified linear unit activation) function on the input tensor.
     * 
     * The operation is: f(x) = max(x, alpha).
     * This operation supports broadcasting with the alpha tensor.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - alpha: The alpha tensor.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("leakyReLUWithTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLUWithTensorAlphaTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor alphaTensor, @Nullable String name);

    /**
     * Checks in an elementwise manner if the first input tensor is less than or equal to the second.
     * 
     * This operation creates a `lessThanOrEqualTo` op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor <= secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("lessThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThanOrEqualToWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Checks in an elementwise manner if the first input tensor is less than the second.
     * 
     * This operation creates a `lessThan` op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor < secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("lessThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThanWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Computes the logarithm with base ten to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logarithmBase10WithTensor:name:")
    public native MPSGraphTensor logarithmBase10WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Computes the logarithm with base two to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logarithmBase2WithTensor:name:")
    public native MPSGraphTensor logarithmBase2WithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Computes the natural logarithm to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logarithmWithTensor:name:")
    public native MPSGraphTensor logarithmWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Returns the elementwise logical AND of the input tensors.
     * 
     * This operation creates a logical AND op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor && secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logicalANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalANDWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise logical NAND of the input tensors.
     * 
     * This operation creates a logical NAND op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = !(primaryTensor && secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logicalNANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNANDWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise logical NOR of the input tensors.
     * 
     * This operation creates a logical NOR op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = !(primaryTensor || secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logicalNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise logical OR of the input tensors.
     * 
     * This operation creates a logical OR op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor || secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logicalORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise logical XNOR of the input tensors.
     * 
     * This operation creates a logical XNOR op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = XNOR(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logicalXNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXNORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise logical XOR of the input tensors.
     * 
     * This operation creates a logical XOR op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = XOR(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("logicalXORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Computes the matrix multiplication of 2 input tensors with support for broadcasting.
     * 
     * - Parameters:
     * - primaryTensor: The left-hand side tensor.
     * - secondaryTensor: The right-hand side tensor.
     * - name: The name for the operation.
     * - Returns: A valid tensor containing the product of the input matrices.
     */
    @NotNull
    @Generated
    @Selector("matrixMultiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor matrixMultiplicationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Creates a max pooling gradient operation and returns the result tensor.
     * 
     * - Parameters:
     * - gradient: A 2d input gradient tensor - must be of rank=4. The layout is defined by `descriptor.dataLayout`.
     * - source: The input tensor for the forward pass.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates,
     * paddings and layouts.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("maxPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 2d max-pooling operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: A 2d Image source as tensor - must be of rank=4. The layout is defined by `descriptor.dataLayout`.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates,
     * paddings and layouts.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("maxPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a max pooling gradient operation and returns the result tensor.
     * 
     * - Parameters:
     * - gradient: An input gradient tensor.
     * - source: The input tensor for the forward pass.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates and
     * paddings.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("maxPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DGradientWithGradientTensorSourceTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 4d max-pooling operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: A source tensor.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates and
     * paddings.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("maxPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Returns the elementwise maximum of the input tensors, while propagating `NaN` values.
     * 
     * This operation creates a maximum with `NaN` propagation op and returns the result tensor. This means that
     * if any of the elementwise operands is `NaN`, the result is `NaN`.
     * It supports broadcasting as well.
     * ```md
     * resultTensor = isNaN(primaryTensor) || isNan(secondaryTensor) ? NaN : max(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("maximumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximumWithNaNPropagationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise maximum of the input tensors.
     * 
     * This operation creates a maximum op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = max(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("maximumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximumWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the mean of the first input along the specified axes.
     * 
     * - Parameters:
     * - axes: A list of axes over which to perform the reduction. The order of dimensions goes from the slowest moving
     * at axis=0 to the fastest moving dimension.
     * - name: An optional name for the operation.
     * - Returns: A valid `MPSGraphTensor` object.
     */
    @NotNull
    @Generated
    @Selector("meanOfTensor:axes:name:")
    public native MPSGraphTensor meanOfTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Returns the elementwise minimum of the input tensors, while propagating `NaN` values.
     * 
     * This operation creates a minimum with `NaN` propagation op and returns the result tensor. This means that
     * if any of the elementwise operands is `NaN`, the result is `NaN`.
     * It supports broadcasting as well.
     * ```md
     * resultTensor = isNaN(primaryTensor) || isNan(secondaryTensor) ? NaN : min(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("minimumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimumWithNaNPropagationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise minimum of the input tensors.
     * 
     * This operation creates a minimum op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = min(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("minimumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimumWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the remainder obtained by dividing the first input tensor by the second.
     * 
     * This operation creates a modulo op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor % secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("moduloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor moduloWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Multiplies two input tensors.
     * 
     * This operation creates a multiply op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor * secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("multiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor multiplicationWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Applies negative to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("negativeWithTensor:name:")
    public native MPSGraphTensor negativeWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create a new MPSGraph to insert nodes in.
     */
    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraph new_objc();

    /**
     * Create a normalization beta gradient op and return the result tensor.
     * 
     * The mean and variance tensors should be outputs of ``meanWithTensor:axes:name`` and
     * ``varianceWithTensor:meanTensor:axes:name``.
     * Use the axes parameter to achieve different types of normalizations.
     * For example (assuming your data is in `NxHxWxC` format)
     * Batch normalization: axes = [0, 1, 2]
     * Instance normalization: axes = [1, 2]
     * 
     * - Parameters:
     * - incomingGradientTensor: The incoming original `resultTensor` gradient.
     * - sourceTensor: The original input source in forward direction.
     * - axes: The axes of normalization.
     * - name: An optional name for the operation.
     * - Returns: A valid `MPSGraphTensor` object.
     */
    @NotNull
    @Generated
    @Selector("normalizationBetaGradientWithIncomingGradientTensor:sourceTensor:reductionAxes:name:")
    public native MPSGraphTensor normalizationBetaGradientWithIncomingGradientTensorSourceTensorReductionAxesName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create a normalization gamma gradient op and return the result tensor.
     * 
     * The mean and variance tensors should be outputs of ``meanWithTensor:axes:name`` and
     * ``varianceWithTensor:meanTensor:axes:name``.
     * Use the axes parameter to achieve different types of normalizations.
     * For example (assuming your data is in `NxHxWxC` format)
     * Batch normalization: axes = [0, 1, 2]
     * Instance normalization: axes = [1, 2]
     * 
     * - Parameters:
     * - incomingGradientTensor: The incoming original `resultTensor` gradient.
     * - sourceTensor: The original input source in forward direction.
     * - meanTensor: The mean tensor.
     * - varianceTensor: The variance tensor.
     * - axes: The axes of normalization.
     * - epsilon: A small value to add to the variance when normalizing the inputs.
     * - name: An optional name for the operation.
     * - Returns: A valid `MPSGraphTensor` object.
     */
    @NotNull
    @Generated
    @Selector("normalizationGammaGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGammaGradientWithIncomingGradientTensorSourceTensorMeanTensorVarianceTensorReductionAxesEpsilonName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull MPSGraphTensor meanTensor, @NotNull MPSGraphTensor varianceTensor,
            @NotNull NSArray<? extends NSNumber> axes, float epsilon, @Nullable String name);

    /**
     * Create a normalization input gradient op and return the result tensor.
     * 
     * The mean and variance tensors should be outputs of ``meanWithTensor:axes:name`` and
     * ``varianceWithTensor:meanTensor:axes:name``.
     * Use the axes parameter to achieve different types of normalizations.
     * For example (assuming your data is in `NxHxWxC` format)
     * Batch normalization: axes = [0, 1, 2]
     * Instance normalization: axes = [1, 2]
     * 
     * - Parameters:
     * - incomingGradientTensor: The incoming original `resultTensor` gradient.
     * - sourceTensor: The original input source in forward direction.
     * - meanTensor: The mean tensor.
     * - varianceTensor: The variance tensor.
     * - gamma: The gamma tensor.
     * - gammaGradient: The `gammaGradient` tensor.
     * - betaGradient: The `betaGradient` tensor
     * - axes: The axes of normalization.
     * - epsilon: A small value to add to the variance when normalizing the inputs.
     * - name: An optional name for the operation.
     */
    @NotNull
    @Generated
    @Selector("normalizationGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:gammaTensor:gammaGradientTensor:betaGradientTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGradientWithIncomingGradientTensorSourceTensorMeanTensorVarianceTensorGammaTensorGammaGradientTensorBetaGradientTensorReductionAxesEpsilonName(
            @NotNull MPSGraphTensor incomingGradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull MPSGraphTensor meanTensor, @NotNull MPSGraphTensor varianceTensor, @Nullable MPSGraphTensor gamma,
            @Nullable MPSGraphTensor gammaGradient, @Nullable MPSGraphTensor betaGradient,
            @NotNull NSArray<? extends NSNumber> axes, float epsilon, @Nullable String name);

    /**
     * Create a batch normalization op and return the result tensor.
     * 
     * The mean and variance tensors should be outputs of `meanWithTensor:axes:name` and
     * `varianceWithTensor:meanTensor:axes:name`.
     * Use the axes parameter to achieve different types of normalizations.
     * For example (assuming your data is in NxHxWxC format)
     * Batch normalization: axes = [0, 1, 2]
     * Instance normalization: axes = [1, 2]
     * Shapes for gamma and beta must match the input data along at least one dimension and will be broadcast along the
     * rest.
     * For batch normalization, gamma and beta would typically be 1x1x1xC i.e. one value per channel.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - mean: The mean tensor.
     * - variance: The variance tensor.
     * - gamma: The tensor used to scale the normalized result.
     * - beta: The tensor used to bias the normalized result.
     * - epsilon: A small value to add to the variance when normalizing the inputs.
     * - name: An optional name for the operation.
     * - Returns: A valid `MPSGraphTensor` object.
     */
    @NotNull
    @Generated
    @Selector("normalizationWithTensor:meanTensor:varianceTensor:gammaTensor:betaTensor:epsilon:name:")
    public native MPSGraphTensor normalizationWithTensorMeanTensorVarianceTensorGammaTensorBetaTensorEpsilonName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor mean, @NotNull MPSGraphTensor variance,
            @Nullable MPSGraphTensor gamma, @Nullable MPSGraphTensor beta, float epsilon, @Nullable String name);

    /**
     * Returns the elementwise inequality check of the input tensors.
     * 
     * This operation creates a not equal op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor != secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("notEqualWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor notEqualWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Applies the logical not operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("notWithTensor:name:")
    public native MPSGraphTensor notWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create oneHot op and return the result tensor
     * 
     * Creates a tensor of rank equal to the rank of `indicesTensor` + 1.
     * Inserts a new axis at the axis specified, or the minor axis if `axis` is -1.
     * The values at the indices in the indicesTensor will be set to 1,
     * and all other values will be set to 0.
     * 
     * - Parameters:
     * - indicesTensor: Tensor of indices for on values
     * - depth: Depth of the oneHot vector along the axis
     * - axis: The axis to insert the new oneHot vector at
     * - dataType: MPSDataType of the result tensor
     * - name: Name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:dataType:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisDataTypeName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, @NUInt long axis, int dataType, @Nullable String name);

    /**
     * Create oneHot op and return the result tensor
     * 
     * Creates a tensor of rank equal to the indicesTensor rank + 1.
     * Inserts a new axis at the axis specified, or the minor axis if axis is -1.
     * The values at the indices in the indicesTensor will have the onValue,
     * and all other values will be set to the offValue.
     * 
     * - Parameters:
     * - indicesTensor: Tensor of indices for on values
     * - depth: Depth of the oneHot vector along the axis
     * - axis: The axis to insert the new oneHot vector at. Defaults to -1, the minor axis
     * - dataType: MPSDataType of the result tensor Defaults to MPSDataTypeFloat
     * - onValue: The value for indices designated by the indicesTensor. This value must match the specified data type.
     * Defaults to 1.0f
     * - offValue: The value for indices not designated by the indicesTensor. This value must match the specified data
     * type. Defaults to 0.0f
     * - name: Name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisDataTypeOnValueOffValueName(
            @NotNull MPSGraphTensor indicesTensor, @NUInt long depth, @NUInt long axis, int dataType, double onValue,
            double offValue, @Nullable String name);

    /**
     * Create oneHot op and return the result tensor
     * 
     * Creates a tensor of rank equal to the rank of `indicesTensor` + 1, of type MPSDataTypeFloat32.
     * Inserts a new axis at the axis specified, or the minor axis if `axis` is -1.
     * The values at the indices in the indicesTensor will be set to 1,
     * and all other values will be set to 0.
     * 
     * - Parameters:
     * - indicesTensor: Tensor of indices for on values
     * - depth: Depth of the oneHot vector along the axis
     * - axis: The axis to insert the new oneHot vector at
     * - name: Name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:axis:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthAxisName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, @NUInt long axis, @Nullable String name);

    /**
     * Create oneHot op and return the result tensor
     * 
     * Creates a tensor of rank equal to the rank of `indicesTensor` + 1.
     * Inserts a new axis at the minor dimension.
     * The values at the indices in the indicesTensor will be set to 1,
     * and all other values will be set to 0.
     * 
     * - Parameters:
     * - indicesTensor: Tensor of indices for on values
     * - depth: Depth of the oneHot vector along the axis
     * - dataType: MPSDataType of the result tensor
     * - name: Name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:dataType:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthDataTypeName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, int dataType, @Nullable String name);

    /**
     * Create oneHot op and return the result tensor
     * 
     * Creates a tensor of rank equal to the rank of `indicesTensor` + 1.
     * Inserts a new axis at the minor dimension.
     * The values at the indices in the indicesTensor will have the onValue,
     * and all other values will be set to the offValue.
     * 
     * - Parameters:
     * - indicesTensor: Tensor of indices for on values
     * - depth: Depth of the oneHot vector along the axis
     * - dataType: MPSDataType of the result tensor
     * - onValue: The value for indices designated by the indicesTensor. This value must match the specified data type.
     * - offValue: The value for indices not designated by the indicesTensor. This value must match the specified data
     * type.
     * - name: Name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthDataTypeOnValueOffValueName(
            @NotNull MPSGraphTensor indicesTensor, @NUInt long depth, int dataType, double onValue, double offValue,
            @Nullable String name);

    /**
     * Create oneHot op and return the result tensor
     * 
     * Creates a tensor of rank equal to the rank of `indicesTensor` + 1, of type MPSDataTypeFloat32.
     * Inserts a new axis at the minor dimension.
     * The values at the indices in the indicesTensor will be set to 1,
     * and all other values will be set to 0.
     * 
     * - Parameters:
     * - indicesTensor: Tensor of indices for on values
     * - depth: Depth of the oneHot vector along the axis
     * - name: Name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("oneHotWithIndicesTensor:depth:name:")
    public native MPSGraphTensor oneHotWithIndicesTensorDepthName(@NotNull MPSGraphTensor indicesTensor,
            @NUInt long depth, @Nullable String name);

    /**
     * Options for the graph, the default value is MPSGraphOptionsDefault.
     */
    @Generated
    @Selector("options")
    public native long options();

    /**
     * Array of all the placeholder tensors.
     */
    @NotNull
    @Generated
    @Selector("placeholderTensors")
    public native NSArray<? extends MPSGraphTensor> placeholderTensors();

    /**
     * Returns the elementwise result of raising the first tensor to the power of the second tensor.
     * 
     * This operation creates a power op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = pow(primaryTensor, secondaryTensor)
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("powerWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor powerWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Computes the gradient of the ReLU (rectified linear activation unit) function using the incoming gradient.
     * 
     * - Parameters:
     * - gradient: The incoming gradient tensor.
     * - source: The input tensor from forward pass.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object.
     */
    @NotNull
    @Generated
    @Selector("reLUGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor reLUGradientWithIncomingGradientSourceTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @Nullable String name);

    /**
     * Computes the ReLU (rectified linear activation unit) function with the input tensor.
     * 
     * The operation is: f(x) = max(x, 0).
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object.
     */
    @NotNull
    @Generated
    @Selector("reLUWithTensor:name:")
    public native MPSGraphTensor reLUWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a read op which reads at this point of execution of the graph and returns the result tensor.
     * 
     * - Parameters:
     * - variable: The variable resource tensor to read from.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("readVariable:name:")
    public native MPSGraphTensor readVariableName(@NotNull MPSGraphTensor variable, @Nullable String name);

    /**
     * Applies the reciprocal operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("reciprocalWithTensor:name:")
    public native MPSGraphTensor reciprocalWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create reduction argMax op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reductionArgMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMaximumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction argMin op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reductionArgMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMinimumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction max op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximumWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction max op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction min op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimumWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction minimum op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction product op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionProductWithTensor:axes:name:")
    public native MPSGraphTensor reductionProductWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction product op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionProductWithTensor:axis:name:")
    public native MPSGraphTensor reductionProductWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction sum op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionSumWithTensor:axes:name:")
    public native MPSGraphTensor reductionSumWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction sum op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionSumWithTensor:axis:name:")
    public native MPSGraphTensor reductionSumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Creates a reshape operation and returns the result tensor.
     * 
     * This operation reshapes the input tensor to the target shape.
     * The shape tensor must be compatible with the input tensor shape, specifically the volume of the input tensor has
     * to match the volume defined by the shape tensor.
     * The shape tensor is allowed to contain dynamic dimensions (-1) when the result type can be inferred
     * unambiguously.
     * 
     * - Parameters:
     * - tensor: The tensor to be reshaped.
     * - shapeTensor: A 1D tensor of type `MPSDataTypeInt32` or `MPSDataTypeInt64`, that contains the target shape
     * values.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
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
     * Destination indices are computed using direct index scaling by default, with no offset added.
     * If the centerResult parameter is true, the destination indices will be scaled and shifted to be centered
     * on the input image.
     * If the alignCorners parameter is true, the corners of the result images will match the input images.
     * Scaling will be modified to a factor of (size - 1) / (inputSize - 1). When alignCorners is true, the
     * centerResult parameter does nothing.
     * In order to achieve the same behavior as OpenCV's resize and TensorFlowV2's resize,
     * ```md
     * centerResult = YES;
     * alginCorners = NO;
     * ```
     * To achieve the same behavior as TensorFlowV1 resize
     * ```md
     * centerResult = NO;
     * ```
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: 1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * - mode: The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be used.
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
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
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - mode: The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be used.
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
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

    /**
     * Applies the reverse square root operation to the input tensor elements.
     * 
     * The reverse square root operation is the reciprocal of the square root.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("reverseSquareRootWithTensor:name:")
    public native MPSGraphTensor reverseSquareRootWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a reverse operation and returns the result tensor.
     * 
     * Reverses a tensor on given axes.
     * Semantics based on [TensorFlow reverse op](https://www.tensorflow.org/api_docs/python/tf/reverse).
     * 
     * - Parameters:
     * - tensor: The tensor to be reversed.
     * - axes: A tensor that specifies axes to be reversed (Axes must be unique and within normal axis range).
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reverseTensor:axes:name:")
    public native MPSGraphTensor reverseTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Creates a reverse operation and returns the result tensor.
     * 
     * Reverses a tensor on given axes.
     * Semantics based on [TensorFlow reverse op](https://www.tensorflow.org/api_docs/python/tf/reverse).
     * 
     * - Parameters:
     * - tensor: The tensor to be reversed.
     * - axesTensor: A tensor that specifies axes to be reversed (Axes must be unique and within normal axis range).
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reverseTensor:axesTensor:name:")
    public native MPSGraphTensor reverseTensorAxesTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @Nullable String name);

    /**
     * Creates a reverse operation and returns the result tensor.
     * 
     * Reverses a tensor on all axes.
     * Semantics based on [TensorFlow reverse op](https://www.tensorflow.org/api_docs/python/tf/reverse).
     * 
     * - Parameters:
     * - tensor: The tensor to be reversed.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reverseTensor:name:")
    public native MPSGraphTensor reverseTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Rounds the input tensor elements using "round to nearest even" rounding mode.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("rintWithTensor:name:")
    public native MPSGraphTensor rintWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Rounds the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
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
     * ```md
     * B = batchDims
     * U = updates.rank - B
     * P = res.rank - B
     * Q = inds.rank - B
     * K = inds.shape[-1]
     * index_slice = indices[i_{b0},...,i_{bB},i_{0},..,i_{Q-1}]
     * res[...] = data[...]
     * res[i_{b0},...,i_{bB},index_slice[0],...,index_slice[K-1]] += updates[i_{b0},...,i_{bB},i_{0},...,i_{Q-1}] //
     * Note += is used but this depends on mode
     * ```
     * Collisions will be updated according to mode, and slices not set by indices are set to 0. The tensors have the
     * following shape requirements
     * ```md
     * K <= P
     * U = (P-K) + Q-1
     * data.shape = res.shape
     * indices.shape[0:Q-1] = updates.shape[0:Q-1]
     * updates.shape[Q:U] = res.shape[K:P]
     * ```
     * 
     * - Parameters:
     * - dataTensor: Tensor containing inital values of same shape as result tensor
     * - updatesTensor: Tensor containing slices to be inserted into the result tensor
     * - indicesTensor: Tensor containg the result indices to insert slices at
     * - batchDimensions: The number of batch dimensions
     * - mode: The type of update to use on the destination
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
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
     * ```md
     * U = updates.rank
     * P = res.rank
     * res[...] = data[...]
     * res[i_{0},...,i_{axis-1},indices[i_{axis}],i_{axis+1},...,i_{U-1}] +=
     * updates[i_{0},...,i_{axis-1},i_{axis},i_{axis+1},...,i_{U-1}] // Note += is used but this depends on mode
     * ```
     * Collisions will be updated according to mode. The tensors have the following shape requirements
     * ```md
     * U = P
     * indices.rank = 1
     * data.shape = res.shape
     * updates.shape[0:axis-1] = res.shape[0:axis-1]
     * updates.shape[axis] = indices.shape[0]
     * updates.shape[axis+1:U] = res.shape[0:P]
     * ```
     * 
     * - Parameters:
     * - dataTensor: Tensor containing inital values of same shape as result tensor
     * - updatesTensor: Tensor containing values to be inserted into the result tensor
     * - indicesTensor: Tensor containg the result indices to insert values at
     * - axis: The axis of the result tensor to scatter values along
     * - mode: The type of update to use on the destination
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("scatterWithDataTensor:updatesTensor:indicesTensor:axis:mode:name:")
    public native MPSGraphTensor scatterWithDataTensorUpdatesTensorIndicesTensorAxisModeName(
            @NotNull MPSGraphTensor dataTensor, @NotNull MPSGraphTensor updatesTensor,
            @NotNull MPSGraphTensor indicesTensor, @NInt long axis, @NInt long mode, @Nullable String name);

    /**
     * Selects values from either the true or false predicate tensor, depending on the values in the first input.
     * 
     * This operation creates a select op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = select(predicateTensor, truePredicateTensor, falseSelectTensor)
     * ```
     * 
     * - Parameters:
     * - predicateTensor: The predicate tensor.
     * - truePredicateTensor: The tensor to select values from if predicate is true.
     * - falseSelectTensor: The tensor to select values from if predicate is false.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("selectWithPredicateTensor:truePredicateTensor:falsePredicateTensor:name:")
    public native MPSGraphTensor selectWithPredicateTensorTruePredicateTensorFalsePredicateTensorName(
            @NotNull MPSGraphTensor predicateTensor, @NotNull MPSGraphTensor truePredicateTensor,
            @NotNull MPSGraphTensor falseSelectTensor, @Nullable String name);

    /**
     * Options for the graph, the default value is MPSGraphOptionsDefault.
     */
    @Generated
    @Selector("setOptions:")
    public native void setOptions(long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Creates a shape-of operation and returns the result tensor.
     * 
     * Returns a rank-1 tensor of type `MPSDataTypeInt32` with the values of the static shape of the input tensor.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("shapeOfTensor:name:")
    public native MPSGraphTensor shapeOfTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Computes the gradient of the sigmoid function using the incoming gradient tensor.
     * 
     * - Parameters:
     * - gradient: The incoming gradient tensor.
     * - source: The input tensor.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object
     */
    @NotNull
    @Generated
    @Selector("sigmoidGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor sigmoidGradientWithIncomingGradientSourceTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @Nullable String name);

    /**
     * Computes the sigmoid operation on an input tensor.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object.
     */
    @NotNull
    @Generated
    @Selector("sigmoidWithTensor:name:")
    public native MPSGraphTensor sigmoidWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Returns the sign of the input tensor elements.
     * 
     * This operation returns 1.0 if the correspnding input element is greater than 0,
     * -1.0 if it is lesser than 0, -0.0 if it is equal to -0.0, and
     * +0.0 if it is equal to +0.0.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("signWithTensor:name:")
    public native MPSGraphTensor signWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Returns the sign bit of the input tensor elements.
     * 
     * This operation returns `true` if the sign bit is set for the correspnding floating-point input element,
     * otherwise it returns `false`.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("signbitWithTensor:name:")
    public native MPSGraphTensor signbitWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the sine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("sinWithTensor:name:")
    public native MPSGraphTensor sinWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the hyperbolic sine operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("sinhWithTensor:name:")
    public native MPSGraphTensor sinhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a strided slice gradient operation and returns the result tensor.
     * 
     * - Parameters:
     * - inputGradientTensor: The input gradient.
     * - fwdInShapeTensor: The shape of the forward pass input, that is the shape of the gradient output.
     * - starts: An array of numbers that specify the starting points for each dimension.
     * - ends: An array of numbers that specify the ending points for each dimension.
     * - strides: An array of numbers that specify the strides for each dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceGradientTensorFwdInShapeTensorStartsEndsStridesName(
            @NotNull MPSGraphTensor inputGradientTensor, @NotNull MPSGraphTensor fwdInShapeTensor,
            @NotNull NSArray<? extends NSNumber> starts, @NotNull NSArray<? extends NSNumber> ends,
            @NotNull NSArray<? extends NSNumber> strides, @Nullable String name);

    /**
     * Creates a strided slice gradient operation and returns the result tensor.
     * 
     * - Parameters:
     * - inputGradientTensor: The input gradient.
     * - fwdInShapeTensor: The shape of the forward pass input, that is the shape of the gradient output.
     * - starts: An array of numbers that specify the starting points for each dimension.
     * - ends: An array of numbers that specify the ending points for each dimension.
     * - strides: An array of numbers that specify the strides for each dimension.
     * - startMask: A bitmask that indicates dimensions whose `starts` values the operation should ignore.
     * - endMask: A bitmask that indicates dimensions whose `ends` values the operation should ignore.
     * - squeezeMask: A bitmask that indicates dimensions the operation will squeeze out from the result.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     */
    @NotNull
    @Generated
    @Selector("sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceGradientTensorFwdInShapeTensorStartsEndsStridesStartMaskEndMaskSqueezeMaskName(
            @NotNull MPSGraphTensor inputGradientTensor, @NotNull MPSGraphTensor fwdInShapeTensor,
            @NotNull NSArray<? extends NSNumber> starts, @NotNull NSArray<? extends NSNumber> ends,
            @NotNull NSArray<? extends NSNumber> strides, int startMask, int endMask, int squeezeMask,
            @Nullable String name);

    /**
     * Creates a slice operation and returns the result tensor.
     * 
     * - Parameters:
     * - tensor: The tensor to be sliced.
     * - dimensionIndex: The dimension to slice.
     * - start: The starting index of the slice, can be negative to count from the end of the tensor dimension.
     * - length: The length of the slice.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("sliceTensor:dimension:start:length:name:")
    public native MPSGraphTensor sliceTensorDimensionStartLengthName(@NotNull MPSGraphTensor tensor,
            @NUInt long dimensionIndex, @NInt long start, @NInt long length, @Nullable String name);

    /**
     * Creates a strided slice operation and returns the result tensor.
     * 
     * Slices a tensor starting from `starts`, stopping short before `ends` stepping
     * `strides` paces between each value. Semantics based on
     * [TensorFlow Strided Slice Op](https://www.tensorflow.org/api_docs/python/tf/strided_slice).
     * 
     * - Parameters:
     * - tensor: The tensor to be sliced.
     * - starts: An array of numbers that specify the starting points for each dimension.
     * - ends: An array of numbers that specify the ending points for each dimension.
     * - strides: An array of numbers that specify the strides for each dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("sliceTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceTensorStartsEndsStridesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> starts, @NotNull NSArray<? extends NSNumber> ends,
            @NotNull NSArray<? extends NSNumber> strides, @Nullable String name);

    /**
     * Creates a strided slice operation and returns the result tensor.
     * 
     * Slices a tensor starting from `starts`, stopping short before `ends` stepping
     * `strides` paces between each value. Semantics based on
     * [TensorFlow Strided Slice Op](https://www.tensorflow.org/api_docs/python/tf/strided_slice).
     * 
     * - Parameters:
     * - tensor: The Tensor to be sliced.
     * - starts: An array of numbers that specify the starting points for each dimension.
     * - ends: An array of numbers that specify the ending points for each dimension.
     * - strides: An array of numbers that specify the strides for each dimension.
     * - startMask: A bitmask that indicates dimensions whose `starts` values the operation should ignore.
     * - endMask: A bitmask that indicates dimensions whose `ends` values the operation should ignore.
     * - squeezeMask: A bitmask that indicates dimensions the operation will squeeze out from the result.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("sliceTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceTensorStartsEndsStridesStartMaskEndMaskSqueezeMaskName(
            @NotNull MPSGraphTensor tensor, @NotNull NSArray<? extends NSNumber> starts,
            @NotNull NSArray<? extends NSNumber> ends, @NotNull NSArray<? extends NSNumber> strides, int startMask,
            int endMask, int squeezeMask, @Nullable String name);

    /**
     * Creates the gradient of a softmax cross entropy loss operation and returns the result tensor.
     * 
     * - Parameters:
     * - gradientTensor: The input gradientTensor. Note: in most cases this is the initial gradient tensor, which is a
     * constant tensor with value one.
     * - sourceTensor: The source tensor.
     * - labelsTensor: The labels tensor.
     * - axis: The axis over which the operation computes the softmax reduction.
     * - reductionType: The type of reduction MPSGraph uses to reduce across all other axes than `axis`. See:
     * ``MPSGraphLossReductionType``.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("softMaxCrossEntropyGradientWithIncomingGradientTensor:sourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropyGradientWithIncomingGradientTensorSourceTensorLabelsTensorAxisReductionTypeName(
            @NotNull MPSGraphTensor gradientTensor, @NotNull MPSGraphTensor sourceTensor,
            @NotNull MPSGraphTensor labelsTensor, @NInt long axis, long reductionType, @Nullable String name);

    /**
     * Creates a softmax cross entropy loss operation and returns the result tensor.
     * 
     * The softmax cross entropy operation computes:
     * ```md
     * loss = reduction( - labels*ln( softmax(source) )), where
     * sotfmax(source) = exp(source) / sum( exp(source) ), and
     * ```
     * the operation performs the reduction over the `axis` dimension.
     * 
     * - Parameters:
     * - sourceTensor: The source tensor.
     * - labelsTensor: The labels tensor.
     * - axis: The axis over which the operation computes the softmax reduction.
     * - reductionType: The type of reduction MPSGraph uses to reduce across all other axes than `axis`. See:
     * ``MPSGraphLossReductionType``.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("softMaxCrossEntropyWithSourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropyWithSourceTensorLabelsTensorAxisReductionTypeName(
            @NotNull MPSGraphTensor sourceTensor, @NotNull MPSGraphTensor labelsTensor, @NInt long axis,
            long reductionType, @Nullable String name);

    /**
     * Computes the gradient of the softmax function along the specified axis using the incoming gradient tensor.
     * 
     * - Parameters:
     * - gradient: The incoming gradient tensor.
     * - source: The input tensor.
     * - axis: The axis along which softmax is computed.
     * - name: The name for the operation
     * - Returns: A valid ``MPSGraphTensor`` object
     */
    @NotNull
    @Generated
    @Selector("softMaxGradientWithIncomingGradient:sourceTensor:axis:name:")
    public native MPSGraphTensor softMaxGradientWithIncomingGradientSourceTensorAxisName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source, @NInt long axis, @Nullable String name);

    /**
     * Computes the softmax function on the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - axis: The axis along which softmax is computed.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object
     */
    @NotNull
    @Generated
    @Selector("softMaxWithTensor:axis:name:")
    public native MPSGraphTensor softMaxWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Creates a space-to-depth2d operation and returns the result tensor.
     * 
     * This operation outputs a copy of the `input` tensor, where values from the
     * `widthAxis` and `heightAxis` dimensions are moved in spatial blocks of size
     * `blockSize` to the `depthAxis` dimension. Use the `usePixelShuffleOrder` parameter
     * to control how the data within spatial blocks is ordered in the
     * `depthAxis` dimension: with `usePixelShuffleOrder=YES` MPSGraph stores the
     * values of the spatial blocks contiguosly within the `depthAxis` dimension, whereas
     * otherwise they are stored interleaved with existing values in the `depthAxis` dimension.
     * This operation is the inverse of
     * `MPSGraph/depthToSpace2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:`.
     * - Parameters:
     * - tensor: The input tensor.
     * - widthAxis: The axis that defines the fastest running dimension within the block.
     * - heightAxis: The axis that defines the 2nd fastest running dimension within the block.
     * - depthAxis: The axis that defines the destination dimension, where to copy the blocks.
     * - blockSize: The size of the square spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls the layout of the sub-blocks within the depth dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("spaceToDepth2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensorWidthAxisHeightAxisDepthAxisBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NUInt long widthAxis, @NUInt long heightAxis, @NUInt long depthAxis,
            @NUInt long blockSize, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Creates a space-to-depth2d operation and returns the result tensor.
     * 
     * This operation outputs a copy of the `input` tensor, where values from the
     * `widthAxisTensor` and `heightAxisTensor` dimensions are moved in spatial blocks of size
     * `blockSize` to the `depthAxisTensor` dimension. Use the `usePixelShuffleOrder` parameter
     * to control how the data within spatial blocks is ordered in the
     * `depthAxisTensor` dimension: with `usePixelShuffleOrder=YES` MPSGraph stores the
     * values of the spatial blocks contiguosly within the `depthAxisTensor` dimension, whereas
     * otherwise they are stored interleaved with existing values in the `depthAxisTensor` dimension.
     * This operation is the inverse of
     * ``MPSGraph/depthToSpace2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:``.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - widthAxisTensor: A scalar tensor that contains the axis that defines the fastest running dimension within the
     * block.
     * - heightAxisTensor: A scalar tensor that contains the axis that defines the 2nd fastest running dimension within
     * the block.
     * - depthAxisTensor: A scalar tensor that contains the axis that defines the destination dimension, where to copy
     * the blocks.
     * - blockSize: The size of the square spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls the layout of the sub-blocks within the depth dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("spaceToDepth2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensorWidthAxisTensorHeightAxisTensorDepthAxisTensorBlockSizeUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor widthAxisTensor,
            @NotNull MPSGraphTensor heightAxisTensor, @NotNull MPSGraphTensor depthAxisTensor, @NUInt long blockSize,
            boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Applies the square root operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("squareRootWithTensor:name:")
    public native MPSGraphTensor squareRootWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the square operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("squareWithTensor:name:")
    public native MPSGraphTensor squareWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a stencil operation and returns the result tensor.
     * 
     * Performs a weighted reduction operation (See ``MPSGraphStencilOpDescriptor/reductionMode``) on the last 4
     * dimensions of the `source`
     * over the window determined by `weights`, according to the value defined in `descriptor`.
     * ```md
     * y[i] = reduction{j \in w} ( x[ i + j ]w[j] )
     * ```
     * 
     * - Parameters:
     * - source: The tensor containing the source data. Must be of rank 4 or greater.
     * - weights: A 4-D tensor containing the weights data.
     * - descriptor: The descriptor object that specifies the parameters for the stencil operation.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("stencilWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor stencilWithSourceTensorWeightsTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphTensor weights, @NotNull MPSGraphStencilOpDescriptor descriptor, @Nullable String name);

    /**
     * The StochasticGradientDescent performs a gradient descent
     * `variable = variable - (learningRate * g)`
     * where,
     * `g` is gradient of error wrt variable
     * 
     * - Parameters:
     * - learningRateTensor: scalar tensor which indicates the learning rate to use with the optimizer
     * - valuesTensor: values tensor, usually representing the trainable parameters
     * - gradientTensor: partial gradient of the trainable parameters with respect to loss
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("stochasticGradientDescentWithLearningRateTensor:valuesTensor:gradientTensor:name:")
    public native MPSGraphTensor stochasticGradientDescentWithLearningRateTensorValuesTensorGradientTensorName(
            @NotNull MPSGraphTensor learningRateTensor, @NotNull MPSGraphTensor valuesTensor,
            @NotNull MPSGraphTensor gradientTensor, @Nullable String name);

    /**
     * Subtracts the second input tensor from the first.
     * 
     * This operation creates a subtract op and returns the result tensor. It supports broadcasting as well.
     * ```md
     * resultTensor = primaryTensor - secondaryTensor
     * ```
     * 
     * - Parameters:
     * - primaryTensor: The LHS tensor of the binary Op.
     * - secondaryTensor: The RHS tensor of the binary Op.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("subtractionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor subtractionWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Applies the tangent operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("tanWithTensor:name:")
    public native MPSGraphTensor tanWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Applies the hyperbolic tangent operation to the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     */
    @NotNull
    @Generated
    @Selector("tanhWithTensor:name:")
    public native MPSGraphTensor tanhWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create TopKGradient op and return the result tensor.
     * 
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * 
     * - Parameters:
     * - gradient: Tensor containing the incoming gradient.
     * - source: Tensor containing source data.
     * - k: The number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("topKWithGradientTensor:source:k:name:")
    public native MPSGraphTensor topKWithGradientTensorSourceKName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NUInt long k, @Nullable String name);

    /**
     * Create TopKGradient op and return the result tensor.
     * 
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * 
     * - Parameters:
     * - gradient: Tensor containing the incoming gradient.
     * - source: Tensor containing source data.
     * - kTensor: Tensor of the number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("topKWithGradientTensor:source:kTensor:name:")
    public native MPSGraphTensor topKWithGradientTensorSourceKTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor kTensor, @Nullable String name);

    /**
     * Creates TopK op and return the value and indices tensors
     * 
     * Finds the k largest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the top values, and the second element of
     * the result array corresponds to the indices of the top values.
     * 
     * - Parameters:
     * - source: Tensor containing source data
     * - k: The number of largest values to return
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor array of size 2
     */
    @NotNull
    @Generated
    @Selector("topKWithSourceTensor:k:name:")
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorKName(@NotNull MPSGraphTensor source,
            @NUInt long k, @Nullable String name);

    /**
     * Creates TopK op and return the result tensor.
     * 
     * Finds the k largest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the top values, and the second element of
     * the result array corresponds to the indices of the top values.
     * 
     * - Parameters:
     * - source: Tensor containing source data.
     * - kTensor: Tensor of the number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 2.
     */
    @NotNull
    @Generated
    @Selector("topKWithSourceTensor:kTensor:name:")
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorKTensorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphTensor kTensor, @Nullable String name);

    /**
     * Creates a transpose operation and returns the result tensor.
     * 
     * Transposes the dimensions `dimensionIndex` and `dimensionIndex2` of the input tensor.
     * 
     * - Parameters:
     * - tensor: The tensor to be transposed.
     * - dimensionIndex: The first dimension index to be transposed.
     * - dimensionIndex2: The second dimension index to be transposed.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("transposeTensor:dimension:withDimension:name:")
    public native MPSGraphTensor transposeTensorDimensionWithDimensionName(@NotNull MPSGraphTensor tensor,
            @NUInt long dimensionIndex, @NUInt long dimensionIndex2, @Nullable String name);

    /**
     * Returns the variance of the first input along the specified axes.
     * 
     * - Parameters:
     * - axes: A list of axes over which to perform the reduction. Tthe order of dimensions goes from the slowest moving
     * at axis=0 to the fastest moving dimension.
     * - name: An optional name for the operation.
     * - Returns: A valid `MPSGraphTensor` object.
     */
    @NotNull
    @Generated
    @Selector("varianceOfTensor:axes:name:")
    public native MPSGraphTensor varianceOfTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Returns the variance of the first input along the specified axes when the mean has been precomputed.
     * 
     * - Parameters:
     * - axes: A list of axes over which to perform the reduction such that the order of dimensions goes from the
     * slowest moving at axis=0 to the fastest moving dimension.
     * - name: An optional name for the operation.
     * - Returns: A valid `MPSGraphTensor` object.
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
     * - Parameters:
     * - initialInputs: inputTensors to the whileBeforeBlock, for the 1st iteration will be same as initialInputs passed
     * to the whileLoop
     * - before: beforeBlock, this will be run first and then call the afterBlock with results or return results from
     * the loop
     * - after: afterBlock, this will execute after the condition evaluation
     * - name: name of operation
     * - Returns: A valid MPSGraphTensor array with results returned from the conditionBlock depending on the
     * predicateTensor
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
     * - Parameters:
     * - counterLow: The value to initilaize lower 64 bits of counter to. Philox utilizes a 128 bit counter
     * - counterHigh: The value to initilaize upper 64 bits of counter to. Philox utilizes a 128 bit counter
     * - key: The value to initialize the key to in Philox algorithm.
     * - name: Name for the operation
     * - Returns: An MPSGraphTensor representing a random state, to be passed as an input to a random op.
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
     * ```md
     * MPSGraph *graph = [MPSGraph new];
     * MPSGraphTensor *stateTensor = [graph randomPhiloxStateTensorWithSeed: seed name: nil];
     * NSArray<MPSGraphTensor*> *resultTensors0 = [graph randomUniformTensorWithShape:
     * 
     * - Parameters:
     * - seed: Initial counter and key values will be generated using seed.
     * - name: Name for the operation
     * - Returns: An MPSGraphTensor representing a random state, to be passed as an input to a random op.
     */
    @NotNull
    @Generated
    @Selector("randomPhiloxStateTensorWithSeed:name:")
    public native MPSGraphTensor randomPhiloxStateTensorWithSeedName(@NUInt long seed, @Nullable String name);

    /**
     * Create Random op of type matching distribution in descriptor and return random values
     * 
     * Returns a tensor of provided shape of random values in the distribution specified. Uses a random seed value
     * to initalize state. No state is preserved, and subsequent calls are not guaranteed to result in a unique stream
     * of
     * random values.
     * 
     * - Parameters:
     * - shapeTensor: 1D Int32 or Int64 tensor. The shape of the tensor generated
     * - descriptor: The descriptor of the distribution. See MPSGraphRandomOpDescriptor.
     * - name: The name for the operation
     * - Returns: An MPSGraphTensor of shape containing random values in the defined range.
     */
    @NotNull
    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:name:")
    public native MPSGraphTensor randomTensorWithShapeTensorDescriptorName(@NotNull MPSGraphTensor shapeTensor,
            @NotNull MPSGraphRandomOpDescriptor descriptor, @Nullable String name);

    /**
     * Create Random op of type matching distribution in descriptor and return random values
     * 
     * Returns a tensor of provided shape of random values in the distribution specified. Uses the provided seed value
     * to initalize state. No state is preserved, and all calls with equal seed yield an identical stream of random
     * values.
     * 
     * - Parameters:
     * - shapeTensor: 1D Int32 or Int64 tensor. The shape of the tensor generated
     * - descriptor: The descriptor of the distribution. See MPSGraphRandomOpDescriptor.
     * - seed: The seed to use to initialize state. All calls with equal seed yield an identical stream of random
     * values.
     * - name: The name for the operation
     * - Returns: An MPSGraphTensor of shape containing random values in the defined range.
     */
    @NotNull
    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:seed:name:")
    public native MPSGraphTensor randomTensorWithShapeTensorDescriptorSeedName(@NotNull MPSGraphTensor shapeTensor,
            @NotNull MPSGraphRandomOpDescriptor descriptor, @NUInt long seed, @Nullable String name);

    /**
     * Create Random op of type matching distribution in descriptor, and return random values and updated state
     * 
     * Returns an array of 2 tensors, where the first is of provided shape of random values in the distribution
     * specified,
     * and the second is the updated state tensor.
     * Uses the provided state to define a stream of random values. No state is preserved, and all calls with equal
     * state
     * yield an identical stream of random values. The initial stateTensor provided should be created using the MPSGraph
     * randomPhiloxStateTensor APIs. The resulting stateTensor from this op can be passed as an argument to the
     * following
     * random calls to continue sampling from the stream.
     * 
     * - Parameters:
     * - shapeTensor: 1D Int32 or Int64 tensor. The shape of the tensor generated
     * - descriptor: The descriptor of the distribution. See MPSGraphRandomOpDescriptor.
     * - state: The state to define a stream of random values. All calls with equal state yield an identical stream of
     * random values.
     * - name: The name for the operation
     * - Returns: An array of MPSGraphTensor of size 2. The first MPSGraphTensor is of shape containing random values in
     * the defined range.
     * The second MPSGraphTensor is the updated state tensor.
     */
    @NotNull
    @Generated
    @Selector("randomTensorWithShapeTensor:descriptor:stateTensor:name:")
    public native NSArray<? extends MPSGraphTensor> randomTensorWithShapeTensorDescriptorStateTensorName(
            @NotNull MPSGraphTensor shapeTensor, @NotNull MPSGraphRandomOpDescriptor descriptor,
            @NotNull MPSGraphTensor state, @Nullable String name);

    /**
     * Create RandomUniform op and return random uniform values
     * 
     * Returns a tensor of provided shape of random uniform values in the range [0.0, 1.0). Uses a random seed value
     * to initalize state. No state is preserved, and subsequent calls are not guaranteed to result in a unique stream
     * of
     * random values.
     * 
     * - Parameters:
     * - shapeTensor: 1D Int32 or Int64 tensor. The shape of the tensor generated
     * - name: The name for the operation
     * - Returns: An MPSGraphTensor of shape containing random values in the defined range.
     */
    @NotNull
    @Generated
    @Selector("randomUniformTensorWithShapeTensor:name:")
    public native MPSGraphTensor randomUniformTensorWithShapeTensorName(@NotNull MPSGraphTensor shapeTensor,
            @Nullable String name);

    /**
     * Create RandomUniform op and return random uniform values
     * 
     * Returns a tensor of provided shape of random uniform values in the range [0.0, 1.0). Uses the provided seed value
     * to initalize state. No state is preserved, and all calls with equal seed yield an identical stream of random
     * values.
     * 
     * - Parameters:
     * - shapeTensor: 1D Int32 or Int64 tensor. The shape of the tensor generated
     * - seed: The seed to use to initialize state. All calls with equal seed yield an identical stream of random
     * values.
     * - name: The name for the operation
     * - Returns: An MPSGraphTensor of shape containing random values in the defined range.
     */
    @NotNull
    @Generated
    @Selector("randomUniformTensorWithShapeTensor:seed:name:")
    public native MPSGraphTensor randomUniformTensorWithShapeTensorSeedName(@NotNull MPSGraphTensor shapeTensor,
            @NUInt long seed, @Nullable String name);

    /**
     * Create RandomUniform op and return random uniform values and updated state
     * 
     * Returns an array of 2 tensors, where the first is a tensor of provided shape of random uniform values in the
     * range
     * [0.0, 1.0), and the second is the updated state tensor.
     * The provided state is used to define a stream of random values. No state is preserved, and all calls with equal
     * state
     * yield an identical stream of random values. The initial stateTensor provided should be created using the MPSGraph
     * randomPhiloxStateTensor APIs. The resulting stateTensor from this op can be passed as an argument to the
     * following
     * random calls to continue sampling from the stream.
     * 
     * - Parameters:
     * - shapeTensor: 1D Int32 or Int64 tensor. The shape of the tensor generated
     * - state: The state to define a stream of random values. All calls with equal state yield an identical stream of
     * random values.
     * - name: The name for the operation
     * - Returns: An array of MPSGraphTensor of size 2. The first MPSGraphTensor is of shape containing random values in
     * the defined range.
     * The second MPSGraphTensor is the updated state tensor.
     */
    @NotNull
    @Generated
    @Selector("randomUniformTensorWithShapeTensor:stateTensor:name:")
    public native NSArray<? extends MPSGraphTensor> randomUniformTensorWithShapeTensorStateTensorName(
            @NotNull MPSGraphTensor shapeTensor, @NotNull MPSGraphTensor state, @Nullable String name);

    /**
     * Create reduction max propagate NaN op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaNWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction max propagate NaN op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMaximumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaNWithTensorAxisName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, @Nullable String name);

    /**
     * Create reduction min propagate NaN op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimumPropagateNaNWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction min propagate NaN op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("reductionMinimumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimumPropagateNaNWithTensorAxisName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, @Nullable String name);

    /**
     * Creates a GRU gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:secondaryBias:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,3H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,6H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,3H,H] and
     * otherwise it is [3H,H].
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The second output of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:``
     * with `descriptor.training = YES`.
     * - outputFwd: The first output of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:``
     * with `descriptor.training = YES`.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [6H] and otherwise it is [3H].
     * - descriptor: A descriptor that defines the parameters for the GRU operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is nil, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight` and for `bias`.
     * 
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
     * Creates a GRU gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:secondaryBias:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,3H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,6H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,3H,H] and
     * otherwise it is [3H,H].
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The second output of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:``
     * with `descriptor.training = YES`.
     * - outputFwd: The first output of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:``
     * with `descriptor.training = YES`.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [6H] and otherwise it is [3H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the GRU operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is nil, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias` and for
     * `initState`.
     * 
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
     * Creates a GRU gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:secondaryBias:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,3H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,6H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,3H,H] and
     * otherwise it is [3H,H].
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The second output of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:``
     * with `descriptor.training = YES`.
     * - outputFwd: The first output of
     * ``MPSGraph/GRUWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:``
     * with `descriptor.training = YES`.
     * - stateGradient: The input gradient for state coming from the future timestep - optional, if missing the
     * operation assumes zeroes.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [6H] and otherwise it is [3H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. Useful for dropout.
     * - secondaryBias: A tensor containing the secondary bias vector `b2` - optional, if missing the operation assumes
     * zeroes. Only used with `reset_after = YES`. Shape is [H], ie. a vector for each gate, or [2H] for bidirectional.
     * - descriptor: A descriptor that defines the parameters for the GRU operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is nil, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias`, for
     * `initState` and for `secondaryBias`.
     * 
     * API-Since: 16.0
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
     * Creates a GRU operation and returns the value and optionally the training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = fz( (h[t-1] m) R^T + x[t] W^T + b ),
     * r[t] = fr( (h[t-1] m) R^T + x[t] W^T + b ),
     * c[t] = (h[t-1] r[t] m) R^T
     * o[t] = fo( c[t] + x[t] W^T + b )
     * h[t] = z[t]h[t-1] + (1-z[t])o[t]
     * ```
     * If `resetAfter = YES` then `c[t]` is replaced by
     * ```md
     * c[t] = ( (h[t-1] m) R^T + b2 ) r[t]
     * ```
     * If `flipZ = YES` then `h[t]` is replaced by
     * ```md
     * h[t] = (1-z[t])h[t-1] + z[t]o[t].
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is optional `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is `initState`.
     * `b2` is an optional `resetBias` vector, only used when `resetAfter = YES`.
     * See ``MPSGraphGRUDescriptor`` for different `activation` options for `f()`.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,3H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,6H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,3H,H] and
     * otherwise it is [3H,H].
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [6H] and otherwise it is [3H].
     * - descriptor: A descriptor that defines the parameters for the GRU operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array of size 1 or 2 depending on value of `descriptor.training`.
     * The layout of the state output is [T,N,H] or [T,N,2H] for bidirectional,
     * and the layout of the `trainingState` output is [T,N,3H] or [T,N,6H] for bidirectional.
     * 
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
     * Creates a GRU operation and returns the value and optionally the training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = fz( (h[t-1] m) R^T + x[t] W^T + b ),
     * r[t] = fr( (h[t-1] m) R^T + x[t] W^T + b ),
     * c[t] = (h[t-1] r[t] m) R^T
     * o[t] = fo( c[t] + x[t] W^T + b )
     * h[t] = z[t]h[t-1] + (1-z[t])o[t]
     * ```
     * If `resetAfter = YES` then `c[t]` is replaced by
     * ```md
     * c[t] = ( (h[t-1] m) R^T + b2 ) r[t]
     * ```
     * If `flipZ = YES` then `h[t]` is replaced by
     * ```md
     * h[t] = (1-z[t])h[t-1] + z[t]o[t].
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is optional `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is `initState`.
     * `b2` is an optional `resetBias` vector, only used when `resetAfter = YES`.
     * See ``MPSGraphGRUDescriptor`` for different `activation` options for `f()`.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,3H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,6H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,3H,H] and
     * otherwise it is [3H,H].
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [6H] and otherwise it is [3H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the GRU operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array of size 1 or 2 depending on value of `descriptor.training`.
     * The layout of the state output is [T,N,H] or [T,N,2H] for bidirectional,
     * and the layout of the `trainingState` output is [T,N,3H] or [T,N,6H] for bidirectional.
     * 
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
     * Creates a GRU operation and returns the value and optionally the training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = fz( (h[t-1] m) R^T + x[t] W^T + b ),
     * r[t] = fr( (h[t-1] m) R^T + x[t] W^T + b ),
     * c[t] = (h[t-1] r[t] m) R^T
     * o[t] = fo( c[t] + x[t] W^T + b )
     * h[t] = z[t]h[t-1] + (1-z[t])o[t]
     * ```
     * If `resetAfter = YES` then `c[t]` is replaced by
     * ```md
     * c[t] = ( (h[t-1] m) R^T + b2 ) r[t]
     * ```
     * If `flipZ = YES` then `h[t]` is replaced by
     * ```md
     * h[t] = (1-z[t])h[t-1] + z[t]o[t].
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is optional `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is `initState`.
     * `b2` is an optional `resetBias` vector, only used when `resetAfter = YES`.
     * See ``MPSGraphGRUDescriptor`` for different `activation` options for `f()`.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,3H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,6H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,3H,H] and
     * otherwise it is [3H,H].
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [6H,I] and otherwise it is [3H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [6H] and otherwise it is [3H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. Useful for dropout.
     * - secondaryBias: A tensor containing the secondary bias vector `b2` - optional, if missing the operation assumes
     * zeroes. Only used with `reset_after = YES`. Shape is [H], ie. a vector for each gate, or [2H] for bidirectional.
     * - descriptor: A descriptor that defines the parameters for the GRU operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array of size 1 or 2 depending on value of `descriptor.training`.
     * The layout of the state output is [T,N,H] or [T,N,2H] for bidirectional,
     * and the layout of the `trainingState` output is [T,N,3H] or [T,N,6H] for bidirectional.
     * 
     * API-Since: 16.0
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
     * Computes the hamming distance of 2 input tensors with support for broadcasting.
     * 
     * The hamming distance is computed between 2 sets of vectors and the last dimension(s) of each
     * input tensor is considered a vector.
     * 
     * - Parameters:
     * - primaryTensor: The first input tensor.
     * - secondaryTensor: The second input tensor.
     * - resultDataType: The datatype of the return MPSGraphTensor. Must be either ``MPSDataTypeUInt32`` or
     * ``MPSDataTypeUInt16``.
     * - name: The name for the operation
     * - Returns: A valid tensor containing the hamming distance between the input tensors.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("HammingDistanceWithPrimaryTensor:secondaryTensor:resultDataType:name:")
    public native MPSGraphTensor HammingDistanceWithPrimaryTensorSecondaryTensorResultDataTypeName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, int resultDataType,
            @Nullable String name);

    /**
     * Creates an LSTM gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:mask:peephole:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,4H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,8H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,4H,H] and
     * otherwise it is [4H,H].
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The third output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES`.
     * - cellOutputFwd: The second output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES` or `descriptor.produceCell = YES`.
     * - descriptor: A descriptor that defines the parameters for the LSTM operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is nil, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias`, for
     * `initState` and for `initCell`.
     * 
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
     * Creates an LSTM gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:mask:peephole:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,4H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,8H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,4H,H] and
     * otherwise it is [4H,H].
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The third output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES`.
     * - cellOutputFwd: The second output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES` or `descriptor.produceCell = YES`.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix. For `bidirectional` the layout is [8H,I] and otherwise it is [4H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [8H] and otherwise it is [4H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - initCell: The initial internal cell of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the LSTM operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is nil, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias`, for
     * `initState` and for `initCell`.
     * 
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
     * Creates an LSTM gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:mask:peephole:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,4H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,8H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,4H,H] and
     * otherwise it is [4H,H].
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The third output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES`.
     * - cellOutputFwd: The second output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES` or `descriptor.produceCell = YES`.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix. For `bidirectional` the layout is [8H,I] and otherwise it is [4H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [8H] and otherwise it is [4H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - initCell: The initial internal cell of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. Useful for dropout.
     * - descriptor: A descriptor that defines the parameters for the LSTM operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is nil, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias`, for
     * `peephole`, for `initState` and for `initCell`.
     * 
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
     * Creates an LSTM gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:mask:peephole:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,4H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,8H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,4H,H] and
     * otherwise it is [4H,H].
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The third output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES`.
     * - cellOutputFwd: The second output of
     * ``MPSGraph/LSTMWithSourceTensor:recurrentWeight:inputWeight:bias:initState:initCell:descriptor:name:``
     * with `descriptor.training = YES` or `descriptor.produceCell = YES`.
     * - stateGradient: The input gradient for state coming from the future timestep - optional, if missing the
     * operation assumes zeroes.
     * - cellGradient: Input gradient for cell coming from the future timestep - optional, if missing the operation
     * assumes zeroes.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix. For `bidirectional` the layout is [8H,I] and otherwise it is [4H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [8H] and otherwise it is [4H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - initCell: The initial internal cell of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. Useful for dropout.
     * - peephole: A tensor containing the peephole vector `v` - optional, if missing the operation assumes zeroes.
     * Shape is [4H], ie. a vector for each gate, or [2,4H] for bidirectional.
     * - descriptor: A descriptor that defines the parameters for the LSTM operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is nil, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias`, for
     * `peephole`, for `initState` and for `initCell`.
     * 
     * API-Since: 15.4
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
     * Creates an LSTM operation and returns the value tensor and optionally the cell state tensor and optionally the
     * training state tensor.
     * 
     * This operation returns tensors `h` and optionally `c` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = [i, f, z, o][t] = f( (h[t-1] m) R^T + x'[t] + p c[t-1] )
     * x'[t] = x[t] W^T + b
     * c[t] = f[t]c[t-1] + i[t]z[t]
     * h[t] = o[t]g(c[t]), where
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is optional `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `c[t]` is the second output (optional),
     * `z[t]` is either the second or third output (optional), `h[-1]` is `initCell`. and `h[-1]` is `initState`.
     * `p` is an optional peephole vector.
     * See ``MPSGraphLSTMDescriptor`` for different `activation` options for `f()` and `g()`.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,4H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,8H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,4H,H] and
     * otherwise it is [4H,H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - initCell: The initial internal cell of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the LSTM operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array of size 1 or 2 or 3, depending on values of `descriptor.produceCell`
     * and `descriptor.training`.
     * The layout of the both state and cell outputs are [T,N,H] or [T,N,2H] for bidirectional, and the layout of the
     * trainingState output is [T,N,4H] or [T,N,8H] for bidirectional.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("LSTMWithSourceTensor:recurrentWeight:initState:initCell:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> LSTMWithSourceTensorRecurrentWeightInitStateInitCellDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor initCell, @NotNull MPSGraphLSTMDescriptor descriptor, @Nullable String name);

    /**
     * Creates an LSTM operation and returns the value tensor and optionally the cell state tensor and optionally the
     * training state tensor.
     * 
     * This operation returns tensors `h` and optionally `c` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = [i, f, z, o][t] = f( (h[t-1] m) R^T + x'[t] + p c[t-1] )
     * x'[t] = x[t] W^T + b
     * c[t] = f[t]c[t-1] + i[t]z[t]
     * h[t] = o[t]g(c[t]), where
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is optional `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `c[t]` is the second output (optional),
     * `z[t]` is either the second or third output (optional), `h[-1]` is `initCell`. and `h[-1]` is `initState`.
     * `p` is an optional peephole vector.
     * See ``MPSGraphLSTMDescriptor`` for different `activation` options for `f()` and `g()`.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,4H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,8H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,4H,H] and
     * otherwise it is [4H,H].
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix. For `bidirectional` the layout is [8H,I] and otherwise it is [4H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [8H] and otherwise it is [4H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - initCell: The initial internal cell of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the LSTM operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array of size 1 or 2 or 3, depending on values of `descriptor.produceCell`
     * and `descriptor.training`.
     * The layout of the both state and cell outputs are [T,N,H] or [T,N,2H] for bidirectional, and the layout of the
     * trainingState output is [T,N,4H] or [T,N,8H] for bidirectional.
     * 
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
     * Creates an LSTM operation and returns the value tensor and optionally the cell state tensor and optionally the
     * training state tensor.
     * 
     * This operation returns tensors `h` and optionally `c` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = [i, f, z, o][t] = f( (h[t-1] m) R^T + x'[t] + p c[t-1] )
     * x'[t] = x[t] W^T + b
     * c[t] = f[t]c[t-1] + i[t]z[t]
     * h[t] = o[t]g(c[t]), where
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is optional `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `c[t]` is the second output (optional),
     * `z[t]` is either the second or third output (optional), `h[-1]` is `initCell`. and `h[-1]` is `initState`.
     * `p` is an optional peephole vector.
     * See ``MPSGraphLSTMDescriptor`` for different `activation` options for `f()` and `g()`.
     * 
     * - Parameters:
     * - source: A tensor containing the source data `x[t]` with the data layout [T,N,I]. In case `inputWeight = nil`
     * and `bidirectional = NO` then the layout is [T,N,4H] and for `inputWeight = nil` and `bidirectional = YES` the
     * layout is [T,N,8H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,4H,H] and
     * otherwise it is [4H,H].
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix. For `bidirectional` the layout is [8H,I] and otherwise it is [4H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [8H] and otherwise it is [4H].
     * - initState: The initial internal state of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - initCell: The initial internal cell of the LSTM `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. Useful for dropout.
     * - peephole: A tensor containing the peephole vector `v` - optional, if missing the operation assumes zeroes.
     * Shape is [4H], ie. a vector for each gate, or [2,4H] for bidirectional.
     * - descriptor: A descriptor that defines the parameters for the LSTM operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array of size 1 or 2 or 3, depending on values of `descriptor.produceCell`
     * and `descriptor.training`.
     * The layout of the both state and cell outputs are [T,N,H] or [T,N,2H] for bidirectional, and the layout of the
     * trainingState output is [T,N,4H] or [T,N,8H] for bidirectional.
     * 
     * API-Since: 15.4
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
     * ```md
     * m[t] = beta1m[t-1] + (1 - beta1) * g
     * v[t] = beta2v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1],v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel) + epsilon)
     * ```
     * - Parameters:
     * - learningRateTensor: scalar tensor which indicates the learning rate to use with the optimizer
     * - beta1Tensor: beta1Tensor
     * - beta2Tensor: beta2Tensor
     * - epsilonTensor: epsilon tensor
     * - valuesTensor: values to update with optimization
     * - momentumTensor: momentum tensor
     * - velocityTensor: velocity tensor
     * - maximumVelocityTensor: optional maximum velocity tensor
     * - gradientTensor: partial gradient of the trainable parameters with respect to loss
     * - name: name for the operation
     * - Returns: if maximumVelocity is nil array of 3 tensors (update, newMomentum, newVelocity) else array of 4
     * tensors (update, newMomentum, newVelocity, newMaximumVelocity)
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
     * current learning rate:
     * ```md
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1], v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel) + epsilon)
     * ```
     * - Parameters:
     * - learningRateTensor: scalar tensor which indicates the learning rate to use with the optimizer
     * - beta1Tensor: beta1Tensor
     * - beta2Tensor: beta2Tensor
     * - beta1PowerTensor: `beta1^t` beta1 power tensor
     * - beta2PowerTensor: `beta2^t` beta2 power tensor
     * - valuesTensor: values to update with optimization
     * - momentumTensor: momentum tensor
     * - velocityTensor: velocity tensor
     * - maximumVelocityTensor: optional maximum velocity tensor
     * - gradientTensor: partial gradient of the trainable parameters with respect to loss
     * - name: name for the operation
     * - Returns: if maximumVelocity is nil array of 3 tensors (update, newMomentum, newVelocity) else array of 4
     * tensors (update, newMomentum, newVelocity, newMaximumVelocity)
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
     * Compute the indices that sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension over which you sort the tensor
     * - descending: If true, reverse the sort direction
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object with 32-bit integer data type
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axis:descending:name:")
    public native MPSGraphTensor argSortWithTensorAxisDescendingName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            boolean descending, @Nullable String name);

    /**
     * Compute the indices that sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension over which you sort the tensor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object with 32-bit integer data type
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axis:name:")
    public native MPSGraphTensor argSortWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Compute the indices that sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension over which you sort the tensor
     * - descending: If true, reverse the sort direction
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object with 32-bit integer data type
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axisTensor:descending:name:")
    public native MPSGraphTensor argSortWithTensorAxisTensorDescendingName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, boolean descending, @Nullable String name);

    /**
     * Compute the indices that sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension over which you sort the tensor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object with 32-bit integer data type
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("argSortWithTensor:axisTensor:name:")
    public native MPSGraphTensor argSortWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Computes the band part of an input tensor.
     * 
     * This operation copies a diagonal band of values from input tensor to a result tensor of the same size.
     * A coordinate `[..., i, j]` is in the band if
     * ```md
     * (numLower < 0 || (i-j) <= numLower) && (numUpper < 0 || (j-i) <= numUpper)
     * ```
     * The values outside of the band are set to 0.
     * 
     * - Parameters:
     * - inputTensor: input tensor
     * - numLower: the number of diagonals in the lower triangle to keep. If -1, the framework returns all sub diagnols.
     * - numUpper: the number of diagonals in the upper triangle to keep. If -1, the framework returns all super
     * diagnols.
     * - name: name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("bandPartWithTensor:numLower:numUpper:name:")
    public native MPSGraphTensor bandPartWithTensorNumLowerNumUpperName(@NotNull MPSGraphTensor inputTensor,
            @NInt long numLower, @NInt long numUpper, @Nullable String name);

    /**
     * Creates band part op and return the result.
     * 
     * See above discussion of bandPartWithTensor: numLower: numUpper: name:
     * 
     * - Parameters:
     * - inputTensor: The source tensor to copy.
     * - numLowerTensor: Scalar Int32 tensor. The number of diagonals in the lower triangle to keep. If -1, keep all.
     * - numUpperTensor: Scalar Int32 tensor. The number of diagonals in the upper triangle to keep. If -1, keep all.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     */
    @NotNull
    @Generated
    @Selector("bandPartWithTensor:numLowerTensor:numUpperTensor:name:")
    public native MPSGraphTensor bandPartWithTensorNumLowerTensorNumUpperTensorName(@NotNull MPSGraphTensor inputTensor,
            @NotNull MPSGraphTensor numLowerTensor, @NotNull MPSGraphTensor numUpperTensor, @Nullable String name);

    /**
     * Creates a batch-to-space operation and returns the result tensor.
     * 
     * This operation outputs a copy of the input tensor, where values from the
     * `batchAxis` dimension are moved in spatial blocks of size `blockDimensions` to the
     * `spatialAxes` dimensions (for `usePixelShuffleOrder=YES` 1,2 or 3 axes supported,
     * otherwise limited only by `MPSNDArray` rank limitations). Use the `usePixelShuffleOrder` parameter
     * to control how the data within spatial blocks is ordered in the
     * `batchAxis` dimension: with `usePixelShuffleOrder = YES` MPSGraph stores
     * the values of the spatial block contiguosly within the `batchAxis` dimension whereas
     * without it they are stored interleaved with existing values in the `batchAxis` dimension.
     * Note: This operation is the inverse of
     * ``MPSGraph/spaceToBatchTensor:spatialAxes:batchAxis:blockDimensions:usePixelShuffleOrder:name:``.
     * Note: This operation is a generalization of
     * ``MPSGraph/depthToSpace2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:``.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - spatialAxes: The axes that define the dimensions containing the spatial blocks.
     * - batchAxis: The axis that defines the destination dimension, where to copy the blocks.
     * - blockDimensions: An array of numbers that defines the size of the rectangular spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls layout of the sub-blocks within the batch dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("batchToSpaceTensor:spatialAxes:batchAxis:blockDimensions:usePixelShuffleOrder:name:")
    public native MPSGraphTensor batchToSpaceTensorSpatialAxesBatchAxisBlockDimensionsUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull NSArray<? extends NSNumber> spatialAxes, @NInt long batchAxis,
            @NotNull NSArray<? extends NSNumber> blockDimensions, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Creates a batch-to-space operation and returns the result tensor.
     * 
     * This operation outputs a copy of the input tensor, where values from the
     * `batchAxisTensor` dimension are moved in spatial blocks of size `blockDimensionsTensor` to the
     * `spatialAxesTensor` dimensions (for `usePixelShuffleOrder=YES` 1,2 or 3 axes supported,
     * otherwise limited only by `MPSNDArray` rank limitations). Use the `usePixelShuffleOrder` parameter
     * to control how the data within spatial blocks is ordered in the
     * `batchAxisTensor` dimension: with `usePixelShuffleOrder = YES` MPSGraph stores
     * the values of the spatial block contiguosly within the `batchAxisTensor` dimension whereas
     * without it they are stored interleaved with existing values in the `batchAxisTensor` dimension.
     * Note: This operation is the inverse of
     * ``MPSGraph/spaceToBatchTensor:spatialAxesTensor:batchAxisTensor:blockDimensionsTensor:usePixelShuffleOrder:name:``.
     * Note: This operation is a generalization of
     * ``MPSGraph/depthToSpace2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:``.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - spatialAxesTensor: A tensor that contains the axes that define the dimensions containing the spatial blocks.
     * - batchAxisTensor: A tensor that contains the axis that defines the destination dimension, where to copy the
     * blocks.
     * - blockDimensionsTensor: A tensor that defines the size of the rectangular spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls layout of the sub-blocks within the batch dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
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
     * Returns the elementwise bitwise AND of binary representations of two integer tensors.
     * 
     * - Parameters:
     * - primaryTensor: The primary input tensor, must be of integer type.
     * - secondaryTensor: The secondary input tensor, must be of integer type.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseANDWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise left shifted binary representations of the primary integer by the secondary tensor
     * amount.
     * 
     * - Parameters:
     * - primaryTensor: The primary input tensor, must be of integer type.
     * - secondaryTensor: The secondary input tensor, must be of integer type.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseLeftShiftWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseLeftShiftWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Applies the bitwise not operation to the input tensor element.
     * 
     * This operation only accepts integer tensors.
     * 
     * - Parameters:
     * - tensor: The input tensor, which must be of integer type.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseNOTWithTensor:name:")
    public native MPSGraphTensor bitwiseNOTWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Returns the elementwise bitwise OR of binary representations of two integer tensors.
     * 
     * - Parameters:
     * - primaryTensor: The primary input tensor, must be of integer type.
     * - secondaryTensor: The secondary input tensor, must be of integer type.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the population count of the input tensor elements.
     * 
     * This operation only accepts integer tensors, and returns the number of bits set in the input element.
     * 
     * - Parameters:
     * - tensor: The input tensor, which must be of integer type.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwisePopulationCountWithTensor:name:")
    public native MPSGraphTensor bitwisePopulationCountWithTensorName(@NotNull MPSGraphTensor tensor,
            @Nullable String name);

    /**
     * Returns the elementwise right shifted binary representations of the primary integer by the secondary tensor
     * amount.
     * 
     * - Parameters:
     * - primaryTensor: The primary input tensor, must be of integer type.
     * - secondaryTensor: The secondary input tensor, must be of integer type.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseRightShiftWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseRightShiftWithPrimaryTensorSecondaryTensorName(
            @NotNull MPSGraphTensor primaryTensor, @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Returns the elementwise bitwise XOR of binary representations of two integer tensors.
     * 
     * - Parameters:
     * - primaryTensor: The primary input tensor, must be of integer type.
     * - secondaryTensor: The secondary input tensor, must be of integer type.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("bitwiseXORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor bitwiseXORWithPrimaryTensorSecondaryTensorName(@NotNull MPSGraphTensor primaryTensor,
            @NotNull MPSGraphTensor secondaryTensor, @Nullable String name);

    /**
     * Creates a get-coordindate operation and returns the result tensor.
     * 
     * See ``coordinateAlongAxis:withShape:name:``.
     * 
     * - Parameters:
     * - axis: The coordinate axis an element's value is set to. Negative values wrap around.
     * - shapeTensor: A rank-1 tensor of type `MPSDataTypeInt32` or `MPSDataTypeInt64` that defines the shape of the
     * result tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("coordinateAlongAxis:withShapeTensor:name:")
    public native MPSGraphTensor coordinateAlongAxisWithShapeTensorName(@NInt long axis,
            @NotNull MPSGraphTensor shapeTensor, @Nullable String name);

    /**
     * Creates a get-coordindate operation and returns the result tensor.
     * 
     * See ``coordinateAlongAxis:withShape:name:``.
     * 
     * - Parameters:
     * - axisTensor: A Scalar tensor of type `MPSDataTypeInt32`, that specifies the coordinate axis an element's value
     * is set to. Negative values wrap around.
     * - shapeTensor: A rank-1 tensor of type `MPSDataTypeInt32` or `MPSDataTypeInt64` that defines the shape of the
     * result tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("coordinateAlongAxisTensor:withShapeTensor:name:")
    public native MPSGraphTensor coordinateAlongAxisTensorWithShapeTensorName(@NotNull MPSGraphTensor axisTensor,
            @NotNull MPSGraphTensor shapeTensor, @Nullable String name);

    /**
     * Compute the cumulative maximum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to the
     * lowest value of the tensor data type
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Compute the cumulative maximum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Compute the cumulative maximum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to the
     * lowest value of the tensor data type
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisTensorExclusiveReverseName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse,
            @Nullable String name);

    /**
     * Compute the cumulative maximum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMaximumWithTensor:axisTensor:name:")
    public native MPSGraphTensor cumulativeMaximumWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Compute the cumulative minimum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to the
     * largest value of the tensor data type
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Compute the cumulative minimum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Compute the cumulative minimum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to the
     * largest value of the tensor data type
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisTensorExclusiveReverseName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse,
            @Nullable String name);

    /**
     * Compute the cumulative minimum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to the
     * largest value of the tensor data type
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeMinimumWithTensor:axisTensor:name:")
    public native MPSGraphTensor cumulativeMinimumWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Compute the cumulative product of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to one
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Compute the cumulative product of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Compute the cumulative product of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to one
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisTensorExclusiveReverseName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse,
            @Nullable String name);

    /**
     * Compute the cumulative product of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to one
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeProductWithTensor:axisTensor:name:")
    public native MPSGraphTensor cumulativeProductWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Compute the cumulative sum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to zero
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeSumWithTensor:axis:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeSumWithTensorAxisExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NInt long axis, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Compute the cumulative sum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension where you compute the cumulative operation
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeSumWithTensor:axis:name:")
    public native MPSGraphTensor cumulativeSumWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Compute the cumulative sum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - exclusive: If true, perform the exclusive cumulative operation, and the first element will be equal to zero
     * - reverse: If true, reverse the direction of the cumulative operation along the specified axis
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cumulativeSumWithTensor:axisTensor:exclusive:reverse:name:")
    public native MPSGraphTensor cumulativeSumWithTensorAxisTensorExclusiveReverseName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, boolean exclusive, boolean reverse, @Nullable String name);

    /**
     * Compute the cumulative sum of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension where you compute the cumulative operation
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
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
     * result = scale(tensor - zeroPoint)
     * 
     * - Parameters:
     * - tensor: Input tensor to be dequantized
     * - scale: Scale scalar parameter
     * - zeroPoint: Bias scalar parameter (converted to dataType of tensor)
     * - dataType: Float data type of the result tensor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor array of datatype dataType
     * 
     * API-Since: 16.2
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
     * result = scaleTensor(tensor - zeroPoint)
     * 
     * - Parameters:
     * - tensor: Input tensor to be dequantized
     * - scaleTensor: Scale scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * - zeroPoint: Bias scalar parameter (converted to dataType of tensor)
     * - dataType: Float data type of the result tensor
     * - axis: Axis on which the scale 1D value is being broadcasted
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor array of datatype dataType
     * 
     * API-Since: 16.2
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
     * result = scaleTensor(tensor - zeroPointTensor)
     * 
     * - Parameters:
     * - tensor: Input tensor to be dequantized
     * - scaleTensor: Scale scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * - zeroPointTensor: Bias scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * - dataType: Float data type of the result tensor
     * - axis: Axis on which the scale 1D value is being broadcasted
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor array of datatype dataType
     * 
     * API-Since: 16.2
     */
    @NotNull
    @Generated
    @Selector("dequantizeTensor:scaleTensor:zeroPointTensor:dataType:axis:name:")
    public native MPSGraphTensor dequantizeTensorScaleTensorZeroPointTensorDataTypeAxisName(
            @NotNull MPSGraphTensor tensor, @NotNull MPSGraphTensor scaleTensor,
            @NotNull MPSGraphTensor zeroPointTensor, int dataType, @NInt long axis, @Nullable String name);

    /**
     * Creates an expand dimensions operation and returns the result tensor.
     * 
     * Expands the tensor, inserting dimensions with size 1 at specified axes.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - axes: The axes to expand.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("expandDimsOfTensor:axes:name:")
    public native MPSGraphTensor expandDimsOfTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Creates an expand dimensions operation and returns the result tensor.
     * 
     * Expands the tensor, inserting dimensions with size 1 at specified axes.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - axesTensor: The tensor containing the axes to expand.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("expandDimsOfTensor:axesTensor:name:")
    public native MPSGraphTensor expandDimsOfTensorAxesTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @Nullable String name);

    /**
     * Creates an expand dimensions operation and returns the result tensor.
     * 
     * Expands the tensor, inserting a dimension with size 1 at the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - axis: The axis to expand.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
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
     * - Parameters:
     * - axis: The axis to gather from. Negative values wrap around
     * - updatesTensor: The input tensor to gather values from
     * - indicesTensor: Int32 or Int64 tensor used to index `updatesTensor`
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("gatherAlongAxis:withUpdatesTensor:indicesTensor:name:")
    public native MPSGraphTensor gatherAlongAxisWithUpdatesTensorIndicesTensorName(@NInt long axis,
            @NotNull MPSGraphTensor updatesTensor, @NotNull MPSGraphTensor indicesTensor, @Nullable String name);

    /**
     * Create GatherAlongAxis op and return the result tensor
     * 
     * Gather values from `updatesTensor` along the specified `axis` at indices in `indicesTensor`.
     * The shape of `updatesTensor` and `indicesTensor` must match except at `axis`.
     * The shape of the result tensor is equal to the shape of `indicesTensor`.
     * If an index is out of bounds of the `updatesTensor` along `axis` a 0 is inserted.
     * 
     * - Parameters:
     * - axisTensor: Scalar Int32 tensor. The axis to gather from. Negative values wrap around
     * - updatesTensor: The input tensor to gather values from
     * - indicesTensor: Int32 or Int64 tensor used to index `updatesTensor`
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("gatherAlongAxisTensor:withUpdatesTensor:indicesTensor:name:")
    public native MPSGraphTensor gatherAlongAxisTensorWithUpdatesTensorIndicesTensorName(
            @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor updatesTensor,
            @NotNull MPSGraphTensor indicesTensor, @Nullable String name);

    /**
     * Computes the inverse of an input tensor.
     * 
     * The framework computes the inverse of a square matrix by calling LU decomposition and LU solver.
     * All dimensions after the first 2 are treated as batch dimensions and the inverse for each batch is computed.
     * Results are undefined for ill conditioned matrices.
     * 
     * - Parameters:
     * - inputTensor: The input tensor.
     * - name: The name for the operation.
     * - Returns: A valid ``MPSGraphTensor`` object containing the inverse of the input tensor.
     * 
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("inverseOfTensor:name:")
    public native MPSGraphTensor inverseOfTensorName(@NotNull MPSGraphTensor inputTensor, @Nullable String name);

    /**
     * Creates a max pooling gradient operation and returns the result tensor.
     * 
     * With this API MPSGraph computes the max pooling gradient efficiently by reusing the indices from the forward API
     * instead of recomputing them.
     * The descriptor must set `returnIndicesMode` and `returnIndicesDataType` to the same value as that set by the
     * forward pass.
     * 
     * - Parameters:
     * - gradient: A 2d input gradient tensor - must be of rank=4. The layout is defined by `descriptor.dataLayout`.
     * - indices: The indices tensor returned from
     * ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:``.
     * - outputShape: A tensor containing the shape of the destination gradient.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates,
     * paddings and layouts.
     * - name: The name for the operation.
     * - Returns: Destination gradient tensor.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("maxPooling2DGradientWithGradientTensor:indicesTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DGradientWithGradientTensorIndicesTensorOutputShapeTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor indices, @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 2d max-pooling operation and returns the result tensor and the corresponding indices tensor.
     * 
     * In order to compute the indices, `returnIndicesMode` of the descriptor must be set. The datatype of indices
     * tensor can be set
     * using `returnIndicesDataType`.
     * If `returnIndicesMode = MPSGraphPoolingReturnIndicesNone` then only the first result
     * MPSGraph returns will be valid and using the second result will assert.
     * 
     * - Parameters:
     * - source: A 2d Image source as tensor - must be of rank=4. The layout is defined by `descriptor.dataLayout`.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates,
     * paddings and layouts.
     * - name: The name for the operation.
     * - Returns: An array of two MPSGraphTensors. The first tensor holds the result of max pool and the second tensor
     * holds the corresponding indices
     * 
     * API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> maxPooling2DReturnIndicesWithSourceTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphPooling2DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a max pooling gradient operation and returns the result tensor.
     * 
     * With this API MPSGraph computes the max pooling gradient efficiently by reusing the indices from the forward API
     * instead of recomputing them.
     * The descriptor must set `returnIndicesMode` and `returnIndicesDataType` to the same value as that set by the
     * forward pass.
     * 
     * - Parameters:
     * - gradient: An input gradient tensor.
     * - indices: The indices tensor returned from
     * ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:``.
     * - outputShape: A tensor containing the shape of the destination gradient.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates,
     * paddings and layouts.
     * - name: The name for the operation.
     * - Returns: Destination gradient tensor.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("maxPooling4DGradientWithGradientTensor:indicesTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DGradientWithGradientTensorIndicesTensorOutputShapeTensorDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor indices, @NotNull MPSGraphTensor outputShape,
            @NotNull MPSGraphPooling4DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a 4d max-pooling operation and returns the result tensor and the corresponding indices tensor.
     * 
     * In order to compute the indices, `returnIndicesMode` of the descriptor must be set. The datatype of indices
     * tensor can be set
     * using `returnIndicesDataType`.
     * If `returnIndicesMode = MPSGraphPoolingReturnIndicesNone` then only the first result
     * MPSGraph returns will be valid and using the second result will assert.
     * 
     * - Parameters:
     * - source: The source tensor on which pooling will be performed.
     * - descriptor: A pooling operation descriptor that specifies pooling window sizes, strides, dilation rates and
     * paddings.
     * - name: The name for the operation.
     * - Returns: An array of two MPSGraphTensors. The first tensor holds the result of max pool and the second tensor
     * holds the corresponding indices.
     * 
     * API-Since: 15.3
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
     * - Parameters:
     * - tensor: Input tensor to be quantized
     * - scale: Scale scalar parameter
     * - zeroPoint: Bias scalar parameter (converted to dataType of resultTensor)
     * - dataType: Integer data type of the result tensor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor array of datatype dataType
     * 
     * API-Since: 16.2
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
     * - Parameters:
     * - tensor: Input tensor to be quantized
     * - scaleTensor: Scale 1D Tensor parameter with size == tensor.shape[axis]
     * - zeroPoint: Bias scalar parameter (converted to dataType of resultTensor)
     * - dataType: Integer data type of the result tensor
     * - axis: Axis on which the scale 1D value is being broadcasted
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor array of datatype dataType
     * 
     * API-Since: 16.2
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
     * - Parameters:
     * - tensor: Input tensor to be quantized
     * - scaleTensor: Scale scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * - zeroPointTensor: Bias scalar or 1D Tensor parameter with size == tensor.shape[axis]
     * - dataType: Integer data type of the result tensor
     * - axis: Axis on which the scale 1D value is being broadcasted
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor array of datatype dataType
     * 
     * API-Since: 16.2
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
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("reductionAndWithTensor:axes:name:")
    public native MPSGraphTensor reductionAndWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction and op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("reductionAndWithTensor:axis:name:")
    public native MPSGraphTensor reductionAndWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Create reduction or op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axes: axes of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.3
     */
    @NotNull
    @Generated
    @Selector("reductionOrWithTensor:axes:name:")
    public native MPSGraphTensor reductionOrWithTensorAxesName(@NotNull MPSGraphTensor tensor,
            @Nullable NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Create reduction or op and return the result tensor.
     * 
     * - Parameters:
     * - tensor: input tensor
     * - axis: axis of reduction
     * - name: name for the operation
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.3
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
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
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
     * Computes the gradient for the forward pass Resize op with bilinear sampling and identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - scaleOffset: 1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeBilinearWithGradientTensor:input:scaleOffsetTensor:layout:name:")
    public native MPSGraphTensor resizeBilinearWithGradientTensorInputScaleOffsetTensorLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long layout, @Nullable String name);

    /**
     * Resamples input images to given size using bilinear sampling.
     * See above discussion for more details.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: 1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeBilinearWithTensor:sizeTensor:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeBilinearWithTensorSizeTensorCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, boolean centerResult,
            boolean alignCorners, @NUInt long layout, @Nullable String name);

    /**
     * Resamples input images to given size using the provided scale and offset and bilinear sampling
     * See above discussion for more details.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: 1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * - scaleOffset: 1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling.
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
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
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling.
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
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
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - scaleOffset: 1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling.
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeNearestWithGradientTensor:input:scaleOffsetTensor:nearestRoundingMode:layout:name:")
    public native MPSGraphTensor resizeNearestWithGradientTensorInputScaleOffsetTensorNearestRoundingModeLayoutName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long nearestRoundingMode, @NUInt long layout, @Nullable String name);

    /**
     * Resamples input images to given size using nearest neighbor sampling. This API allows for
     * the rounding mode to be specified.
     * See above discussion for more details.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: 1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling. Default is roundPreferCeil.
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeNearestWithTensor:sizeTensor:nearestRoundingMode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeNearestWithTensorSizeTensorNearestRoundingModeCenterResultAlignCornersLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NUInt long nearestRoundingMode,
            boolean centerResult, boolean alignCorners, @NUInt long layout, @Nullable String name);

    /**
     * Resamples input images to given size using the provided scale and offset and nearest neighbor sampling
     * See above discussion for more details.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: 1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * - scaleOffset: 1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling.
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("resizeNearestWithTensor:sizeTensor:scaleOffsetTensor:nearestRoundingMode:layout:name:")
    public native MPSGraphTensor resizeNearestWithTensorSizeTensorScaleOffsetTensorNearestRoundingModeLayoutName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NotNull MPSGraphTensor scaleOffset,
            @NUInt long nearestRoundingMode, @NUInt long layout, @Nullable String name);

    /**
     * Resamples input images to given size using the provided scale and offset.
     * Destination indices are computed using
     * ```md
     * dst_indices = (src_indicesscale) + offset
     * ```
     * For most use cases passing the scale and offset directly is unnecessary, and it is
     * preferable to use the API specifying centerResult and alignCorners.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: 1D Int32 or Int64 tensor. A 2-element shape as [newHeight, newWidth]
     * - scaleOffset: 1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * - mode: The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be used.
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
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
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - scaleOffset: 1D float tensor. A 4-element shape as [scaleY, scaleX, offsetY, offsetX]
     * - mode: The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be used.
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC, NCHW, HWC, CHW, and HW.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
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
     * - Parameters:
     * - source: Tensor containing source data
     * - coordinates: a tensor (N, Hout, Wout, 2) that contains the coordinates of the samples in the source tensor that
     * constitute the output tensor.
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC and NCHW.
     * - normalizeCoordinates: If true, coordinates are within [-1, 1] x [-1, 1] otherwise they are in pixels in the
     * input tensor.
     * - relativeCoordinates: If true, coordinates are relative to the postion of the pixel in the output tensor and
     * scaled back to the input tensor size
     * - alignCorners: If true, coordinate extrema are equal to the center of edge pixels, otherwise extrema are equal
     * to outer edge of edge pixels
     * - paddingMode: determines how samples outside the inputTensor are evaluated (only constant, reflect, symmetric
     * and clampToEdge are supported)
     * - nearestRoundingMode: The rounding mode to use for determining the nearest neighbor. Valid modes are
     * roundPreferCeil, roundPreferFloor, ceil, and floor.
     * - constantValue: If paddingMode is MPSGraphPaddingModeConstant, then this constant is used for samples outside
     * the input tensor.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.2
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
     * - Parameters:
     * - source: Tensor containing source data
     * - coordinates: a tensor (N, Hout, Wout, 2) that contains the coordinates of the samples in the source tensor that
     * constitute the output tensor.
     * - layout: Specifies what layout the provided tensor is in. The returned tensor will follow the same layout. Valid
     * layouts are NHWC and NCHW.
     * - normalizeCoordinates: If true, coordinates are within [-1, 1] x [-1, 1] otherwise they are in pixels in the
     * input tensor.
     * - relativeCoordinates: If true, coordinates are relative to the postion of the pixel in the output tensor and
     * scaled back to the input tensor size
     * - alignCorners: If true, coordinate extrema are equal to the center of edge pixels, otherwise extrema are equal
     * to outer edge of edge pixels
     * - paddingMode: determines how samples outside the inputTensor are evaluated (only constant, reflect, symmetric
     * and clampToEdge are supported)
     * - samplingMode: Can be either MPSGraphResizeNearest or MPSGraphResizeBilinear. Nearest sampling will use
     * roundPreferCeil.
     * - constantValue: If paddingMode is MPSGraphPaddingModeConstant, then this constant is used for samples outside
     * the input tensor.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.2
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
     * For example,
     * ```md
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
     * ```
     * 
     * - Parameters:
     * - axis: The axis to scatter to. Negative values wrap around
     * - dataTensor: The input tensor to scatter values onto
     * - updatesTensor: The input tensor to scatter values from
     * - indicesTensor: Int32 or Int64 tensor used to index the result tensor
     * - mode: The type of update to use
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.4
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
     * Scatter values from `updatesTensor` along the specified `axis` at indices in `indicesTensor` onto `dataTensor`.
     * Values in `dataTensor` are updated following `mode`. See MPSGraphScatterMode.
     * The shape of `updatesTensor` and `indicesTensor` must match. The shape of `dataTensor` must match except at
     * `axis`.
     * If an index is out of bounds of `shape` along `axis` the update value is skipped.
     * For example,
     * ```md
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
     * ```
     * 
     * - Parameters:
     * - axisTensor: Scalar Int32 tensor. The axis to scatter to. Negative values wrap around
     * - dataTensor: The input tensor to scatter values onto
     * - updatesTensor: The input tensor to scatter values from
     * - indicesTensor: Int32 or Int64 tensor used to index the result tensor
     * - mode: The type of update to use
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("scatterAlongAxisTensor:withDataTensor:updatesTensor:indicesTensor:mode:name:")
    public native MPSGraphTensor scatterAlongAxisTensorWithDataTensorUpdatesTensorIndicesTensorModeName(
            @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor dataTensor,
            @NotNull MPSGraphTensor updatesTensor, @NotNull MPSGraphTensor indicesTensor, @NInt long mode,
            @Nullable String name);

    /**
     * Creates a single-gate RNN gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor that contains the source data `x[t]` with the data layout [T,N,I].
     * In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H] and
     * for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,H,H] and
     * otherwise it is [H,H].
     * Note: For `bidirectional` this tensor must have a static shape.
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The second output of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``
     * with `descriptor.training = YES`.
     * - initState: The initial internal state of the RNN `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the RNN operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is `nil`, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias` and
     * finally for `initState`.
     * 
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
     * Creates a single-gate RNN gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor that contains the source data `x[t]` with the data layout [T,N,I].
     * In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H] and
     * for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,H,H] and
     * otherwise it is [H,H].
     * Note: For `bidirectional` this tensor must have a static shape.
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The second output of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``
     * with `descriptor.training = YES`.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [2H,I] and otherwise it is [H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [2H] and otherwise it is [H].
     * - initState: The initial internal state of the RNN `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the RNN operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is `nil`, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias` and
     * finally for `initState`.
     * 
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
     * Creates a single-gate RNN gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor that contains the source data `x[t]` with the data layout [T,N,I].
     * In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H] and
     * for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,H,H] and
     * otherwise it is [H,H].
     * Note: For `bidirectional` this tensor must have a static shape.
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The second output of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``
     * with `descriptor.training = YES`.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [2H,I] and otherwise it is [H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [2H] and otherwise it is [H].
     * - initState: The initial internal state of the RNN `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. This is useful for
     * dropout support.
     * - descriptor: A descriptor that defines the parameters for the RNN operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is `nil`, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias` and
     * finally for `initState`.
     * 
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
     * Creates a single-gate RNN gradient operation and returns the gradient tensor values.
     * 
     * For details of this operation and parameters, refer to documentation of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``.
     * 
     * - Parameters:
     * - source: A tensor that contains the source data `x[t]` with the data layout [T,N,I].
     * In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H] and
     * for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,H,H] and
     * otherwise it is [H,H].
     * Note: For `bidirectional` this tensor must have a static shape.
     * - sourceGradient: The input gradient, that is the gradient of a tensor with respect to the first output of the
     * forward pass.
     * - zState: The second output of
     * ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``
     * with `descriptor.training = YES`.
     * - stateGradient: The input gradient coming from the future timestep - optional, if missing the operation assumes
     * zeroes.
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [2H,I] and otherwise it is [H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [2H] and otherwise it is [H].
     * - initState: The initial internal state of the RNN `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. This is useful for
     * dropout support.
     * - descriptor: A descriptor that defines the parameters for the RNN operation.
     * - name: The name for the operation.
     * - Returns: A valid `MPSGraphTensor` array containing gradients for each input tensor, except for `sourceGradient`
     * and `mask`.
     * In case an input is `nil`, no gradient will be returned for it.
     * The order of the gradients will be: for `source`, for `recurrentWeight`, for `inputWeight`, for `bias` and
     * finally for `initState`.
     * 
     * API-Since: 15.4
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
     * Creates a single-gate RNN operation and returns the value and optionally training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = x[t] W^T + (h[t-1]m) R^T + b
     * h[t] = activation( z[t] ), where
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is `initState`.
     * See ``MPSGraphSingleGateRNNDescriptor`` for different `activation` options.
     * 
     * - Parameters:
     * - source: A tensor that contains the source data `x[t]` with the data layout [T,N,I].
     * In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H] and
     * for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,H,H] and
     * otherwise it is [H,H].
     * - initState: The initial internal state of the RNN `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the RNN operation.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 1 or 2, depending on value of `descriptor.training`. The layout
     * of the both outputs is [T,N,H] or [T,N,2H] for bidirectional.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNWithSourceTensor:recurrentWeight:initState:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNWithSourceTensorRecurrentWeightInitStateDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight, @Nullable MPSGraphTensor initState,
            @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * Creates a single-gate RNN operation and returns the value and optionally training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = x[t] W^T + (h[t-1]m) R^T + b
     * h[t] = activation( z[t] ), where
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is `initState`.
     * See ``MPSGraphSingleGateRNNDescriptor`` for different `activation` options.
     * 
     * - Parameters:
     * - source: A tensor that contains the source data `x[t]` with the data layout [T,N,I].
     * In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H] and
     * for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,H,H] and
     * otherwise it is [H,H].
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [2H,I] and otherwise it is [H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [2H] and otherwise it is [H].
     * - initState: The initial internal state of the RNN `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - descriptor: A descriptor that defines the parameters for the RNN operation.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 1 or 2, depending on value of `descriptor.training`. The layout
     * of the both outputs is [T,N,H] or [T,N,2H] for bidirectional.
     * 
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
     * Creates a single-gate RNN operation and returns the value and optionally the training state tensor.
     * 
     * This operation returns tensors `h` and optionally `z` that are defined recursively as follows:
     * ```md
     * for t = 0 to T-1
     * z[t] = x[t] W^T + (h[t-1]m) R^T + b
     * h[t] = activation( z[t] ), where
     * ```
     * `W` is optional `inputWeight`, `R` is `recurrentWeight`, `b` is `bias`, `m` is optional `mask`,
     * `x[t]` is `source` `h[t]` is the first output, `z[t]` is the second output (optional) and `h[-1]` is `initState`.
     * See ``MPSGraphSingleGateRNNDescriptor`` for different `activation` options.
     * 
     * - Parameters:
     * - source: A tensor that contains the source data `x[t]` with the data layout [T,N,I].
     * In case `inputWeight = nil` and `bidirectional = NO` then the layout is [T,N,H] and
     * for `inputWeight = nil` and `bidirectional = YES` the layout is [T,N,2H].
     * - recurrentWeight: A tensor containing the recurrent weights `R`. For `bidirectional` the layout is [2,H,H] and
     * otherwise it is [H,H].
     * - inputWeight: A tensor containing the input weights matrix `W` - optional, if missing the operation assumes a
     * diagonal unit-matrix.
     * For `bidirectional` the layout is [2H,I] and otherwise it is [H,I].
     * - bias: A tensor containing the bias `b` - optional, if missing the operation assumes zeroes. For `bidirectional`
     * the layout is [2H] and otherwise it is [H].
     * - initState: The initial internal state of the RNN `h[-1]` - optional, if missing the operation assumes zeroes.
     * For `bidirectional` the layout is [N,2H] and otherwise it is [N,H].
     * - mask: A tensor containing the mask `m` - optional, if missing the operation assumes ones. This is useful for
     * dropout support.
     * - descriptor: A descriptor that defines the parameters for the RNN operation.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 1 or 2, depending on value of `descriptor.training`. The layout
     * of the both outputs is [T,N,H] or [T,N,2H] for bidirectional.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:")
    public native NSArray<? extends MPSGraphTensor> singleGateRNNWithSourceTensorRecurrentWeightInputWeightBiasInitStateMaskDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor recurrentWeight,
            @Nullable MPSGraphTensor inputWeight, @Nullable MPSGraphTensor bias, @Nullable MPSGraphTensor initState,
            @Nullable MPSGraphTensor mask, @NotNull MPSGraphSingleGateRNNDescriptor descriptor, @Nullable String name);

    /**
     * Sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension over which you sort the tensor
     * - descending: If true, reverse the sort direction
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axis:descending:name:")
    public native MPSGraphTensor sortWithTensorAxisDescendingName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            boolean descending, @Nullable String name);

    /**
     * Sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axis: The tensor dimension over which you sort the tensor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axis:name:")
    public native MPSGraphTensor sortWithTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension over which you sort the tensor
     * - descending: If true, reverse the sort direction
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axisTensor:descending:name:")
    public native MPSGraphTensor sortWithTensorAxisTensorDescendingName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, boolean descending, @Nullable String name);

    /**
     * Sort the elements of the input tensor along the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - axisTensor: The tensor dimension over which you sort the tensor
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sortWithTensor:axisTensor:name:")
    public native MPSGraphTensor sortWithTensorAxisTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axisTensor, @Nullable String name);

    /**
     * Creates a space-to-batch operation and returns the result tensor.
     * 
     * This operation outputs a copy of the `input` tensor, where values from the
     * `spatialAxes` (for `usePixelShuffleOrder=YES` 1,2 or 3 axes supported, otherwise
     * limited only by `MPSNDArray` rank limitations) dimensions are moved in spatial blocks with
     * rectangular size defined by `blockDimensions` to the `batchAxis` dimension.
     * Use the `usePixelShuffleOrder` parameter to control how the data within spatial blocks is ordered
     * in the `batchAxis` dimension: with `usePixelShuffleOrder=YES` MPSGraph stores
     * the values of the spatial blocks contiguosly within the `batchAxis` dimension, whereas
     * otherwise they are stored interleaved with existing values in the `batchAxis` dimension.
     * Note: This operation is the inverse of
     * ``MPSGraph/batchToSpaceTensor:spatialAxes:batchAxis:blockDimensions:usePixelShuffleOrder:name:``.
     * Note: This operation is a generalization of
     * ``MPSGraph/spaceToDepth2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:``.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - spatialAxes: The axes that define the dimensions containing the spatial blocks.
     * - batchAxis: The axis that defines the destination dimension, where to copy the blocks.
     * - blockDimensions: An array of numbers that defines the size of the rectangular spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls layout of the sub-blocks within the batch dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("spaceToBatchTensor:spatialAxes:batchAxis:blockDimensions:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToBatchTensorSpatialAxesBatchAxisBlockDimensionsUsePixelShuffleOrderName(
            @NotNull MPSGraphTensor tensor, @NotNull NSArray<? extends NSNumber> spatialAxes, @NInt long batchAxis,
            @NotNull NSArray<? extends NSNumber> blockDimensions, boolean usePixelShuffleOrder, @Nullable String name);

    /**
     * Creates a space-to-batch operation and returns the result tensor.
     * 
     * This operation outputs a copy of the `input` tensor, where values from the
     * `spatialAxesTensor` (for `usePixelShuffleOrder=YES` 1,2 or 3 axes supported, otherwise
     * limited only by `MPSNDArray` rank limitations) dimensions are moved in spatial blocks with
     * rectangular size defined by `blockDimensionsTensor` to the `batchAxisTensor` dimension.
     * Use the `usePixelShuffleOrder` parameter to control how the data within spatial blocks is ordered
     * in the `batchAxisTensor` dimension: with `usePixelShuffleOrder=YES` MPSGraph stores
     * the values of the spatial blocks contiguosly within the `batchAxisTensor` dimension, whereas
     * otherwise they are stored interleaved with existing values in the `batchAxisTensor` dimension.
     * Note: This operation is the inverse of
     * ``MPSGraph/batchToSpaceTensor:spatialAxesTensor:batchAxisTensor:blockDimensionsTensor:usePixelShuffleOrder:name:``.
     * Note: This operation is a generalization of
     * ``MPSGraph/spaceToDepth2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:``.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - spatialAxesTensor: A tensor that contains the axes that define the dimensions containing the spatial blocks.
     * - batchAxisTensor: A tensor that contains the axis that defines the destination dimension, where to copy the
     * blocks.
     * - blockDimensionsTensor: A tensor that defines the size of the rectangular spatial sub-block.
     * - usePixelShuffleOrder: A parameter that controls layout of the sub-blocks within the batch dimension.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
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
     * Creates a split operation and returns the result tensor.
     * 
     * Splits the input tensor along `axis` into `numsplits` result tensors of equal size.
     * Requires that the lenth of the input along `axis` is divisible by `numSplits`.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - numSplits: The number of result tensors to split to.
     * - axis: The dimension along which MPSGraph splits the input tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("splitTensor:numSplits:axis:name:")
    public native NSArray<? extends MPSGraphTensor> splitTensorNumSplitsAxisName(@NotNull MPSGraphTensor tensor,
            @NUInt long numSplits, @NInt long axis, @Nullable String name);

    /**
     * Creates a split operation and returns the result tensor.
     * 
     * Splits the input tensor along `axis` into multiple result tensors of size determined by `splitSizes`.
     * Requires that the sum of `splitSizes` is equal to the lenth of the input along `axis`.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - splitSizes: The lengths of the result tensors along the split axis.
     * - axis: The dimension along which MPSGraph splits the input tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("splitTensor:splitSizes:axis:name:")
    public native NSArray<? extends MPSGraphTensor> splitTensorSplitSizesAxisName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> splitSizes, @NInt long axis, @Nullable String name);

    /**
     * Creates a split operation and returns the result tensor.
     * 
     * Splits the input tensor along `axis` into multiple result tensors of size determined by `splitSizesTensor`.
     * Requires that the sum of the elements of `splitSizesTensor` is equal to the lenth of the input along `axis`.
     * 
     * - Parameters:
     * - tensor: The input tensor
     * - splitSizesTensor: The lengths of the result tensors along the split axis.
     * - axis: The dimension along which MPSGraph splits the input tensor.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("splitTensor:splitSizesTensor:axis:name:")
    public native NSArray<? extends MPSGraphTensor> splitTensorSplitSizesTensorAxisName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor splitSizesTensor, @NInt long axis, @Nullable String name);

    /**
     * Creates a squeeze operation and returns the result tensor.
     * 
     * Squeezes the tensor, removing dimensions with size 1 at specified axes.
     * The size of the input tensor must be 1 at all specified axes.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - axes: The axes to squeeze.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:axes:name:")
    public native MPSGraphTensor squeezeTensorAxesName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @Nullable String name);

    /**
     * Creates a squeeze operation and returns the result tensor.
     * 
     * Squeezes the tensor, removing dimensions with size 1 at specified axes.
     * The size of the input tensor must be 1 at all specified axes.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - axesTensor: The tensor containing the axes to squeeze.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:axesTensor:name:")
    public native MPSGraphTensor squeezeTensorAxesTensorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @Nullable String name);

    /**
     * Creates a squeeze operation and returns the result tensor.
     * 
     * Squeezes the tensor, removing a dimension with size 1 at the specified axis.
     * The size of the input tensor must be 1 at the specified axis.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - axis: The axis to squeeze.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:axis:name:")
    public native MPSGraphTensor squeezeTensorAxisName(@NotNull MPSGraphTensor tensor, @NInt long axis,
            @Nullable String name);

    /**
     * Creates a squeeze operation and returns the result tensor.
     * 
     * Squeezes the tensor, removing all dimensions with size 1.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("squeezeTensor:name:")
    public native MPSGraphTensor squeezeTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a stack operation and returns the result tensor.
     * 
     * Stacks all input tensors along `axis` into a result tensor of `rank + 1`. Tensors must be broadcast
     * compatible along all dimensions except `axis`, and have the same type.
     * 
     * - Parameters:
     * - inputTensors: The input tensors.
     * - axis: The dimension to stack tensors into result. Must be in range: `-rank + 1 <= dimension < rank + 1`.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("stackTensors:axis:name:")
    public native MPSGraphTensor stackTensorsAxisName(@NotNull NSArray<? extends MPSGraphTensor> inputTensors,
            @NInt long axis, @Nullable String name);

    /**
     * Creates a permutation operation and returns the result tensor.
     * 
     * Permutes the dimensions of the input tensor according to values in `permutation`.
     * 
     * - Parameters:
     * - tensor: The tensor to be permuted.
     * - permutation: An array of numbers defining the permutation, must be of length `rank(tensor)` and define a valid
     * permutation.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("transposeTensor:permutation:name:")
    public native MPSGraphTensor transposeTensorPermutationName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> permutation, @Nullable String name);

    /**
     * Applies the truncate operation to the input tensor elements.
     * 
     * This operation applies the floor operation to positive inputs and ceiling operation to negative inputs.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation.
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("truncateWithTensor:name:")
    public native MPSGraphTensor truncateWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a Hermitean-to-Real fast Fourier transform operation and returns the result tensor.
     * 
     * This operation computes the fast Fourier transform of a complex-valued input tensor according to the following
     * formulae.
     * ```md
     * output[mu] = scale * sum_nu exp( +/- i * 2Pi * mu * nu / n ) in'[nu], where
     * ```
     * `in'[nu] = conjugate(in[n - nu])`, for the last dimension defined by `axes` when `nu` is out of range of the
     * input dimension.
     * `scale = 1` for `scaling_mode = none`,
     * `scale = 1/V_f` for `scaling_mode = size`,
     * `scale = 1/sqrt(V_f)` for `scaling_mode = unitary`, where
     * `V_f` is the volume of the transformation defined by the dimensions included in `axes`
     * (`V_f = prod_{i \in axes} shape(input)[i]`) (see ``MPSGraphFFTDescriptor/scalingMode``),
     * `+` is selected in `+/-` when `inverse` is specified, otherwise `-` is used
     * and the sum is done separately over each dimension in `axes` and `n` is the
     * dimension length of that axis. With this API MPSGraph treats the input tensor to have only the unique
     * frequencies, which means that the resulting tensor has size `(inSize-1)*2 + x` in the last dimension defined by
     * `axes`,
     * where `inSize = shape(input)[axis] ( = (n/2)+1 )` is the size of the input `tensor` in the last transformed
     * dimension and
     * `x = 1` when ``MPSGraphFFTDescriptor/roundToOddHermitean`` = `YES` and `x = 0` otherwise.
     * 
     * > Tip: Currently transformation is supported only within the last four dimensions of the input tensor. In case
     * you need to transform higher dimensions than the last four, you can tranpose the higher dimensions of the input
     * with ``MPSGraph/transposeTensor:permutation:name:`` to be within that last four and then transpose
     * the result tensor back with the inverse of the input transpose.
     * 
     * - Parameters:
     * - tensor: A complex-valued input tensor with reduced size (see Discussion). Must have datatype
     * `MPSDataTypeComplexFloat32` or `MPSDataTypeComplexFloat16`.
     * - axes: An array of numbers that specifies over which axes MPSGraph performs the Fourier transform - all axes
     * must be contained within last four dimensions of the input tensor.
     * - descriptor: A descriptor that defines parameters of the Fourier transform operation - see
     * ``MPSGraphFFTDescriptor``.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor of type `MPSDataTypeFloat32` or `MPSDataTypeFloat16` (full size).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("HermiteanToRealFFTWithTensor:axes:descriptor:name:")
    @NotNull
    public native MPSGraphTensor HermiteanToRealFFTWithTensorAxesDescriptorName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @NotNull MPSGraphFFTDescriptor descriptor,
            @Nullable String name);

    /**
     * Creates a Hermitean-to-Real fast Fourier transform operation and returns the result tensor.
     * 
     * This operation computes the fast Fourier transform of a complex-valued input tensor according to the following
     * formulae.
     * ```md
     * output[mu] = scale * sum_nu exp( +/- i * 2Pi * mu * nu / n ) in'[nu], where
     * ```
     * `in'[nu] = conjugate(in[n - nu])`, for the last dimension defined by `axes` when `nu` is out of range of the
     * input dimension.
     * `scale = 1` for `scaling_mode = none`,
     * `scale = 1/V_f` for `scaling_mode = size`,
     * `scale = 1/sqrt(V_f)` for `scaling_mode = unitary`, where
     * `V_f` is the volume of the transformation defined by the dimensions included in `axes`
     * (`V_f = prod_{i \in axes} shape(input)[i]`) (see ``MPSGraphFFTDescriptor/scalingMode``),
     * `+` is selected in `+/-` when `inverse` is specified, otherwise `-` is used
     * and the sum is done separately over each dimension in `axes` and `n` is the
     * dimension length of that axis. With this API MPSGraph treats the input tensor to have only the unique
     * frequencies, which means that the resulting tensor has size `(inSize-1)*2 + x` in the last dimension defined by
     * `axes`,
     * where `inSize = shape(input)[axis] ( = (n/2)+1 )` is the size of the input `tensor` in the last transformed
     * dimension and
     * `x = 1` when ``MPSGraphFFTDescriptor/roundToOddHermitean`` = `YES` and `x = 0` otherwise.
     * 
     * > Tip: Currently MPSGraph supports the transformation only within the last four dimensions of the input tensor.
     * In case
     * you need to transform higher dimensions than the last four, you can tranpose the higher dimensions of the input
     * with ``MPSGraph/transposeTensor:permutation:name:`` to be within that last four and then transpose
     * the result tensor back with the inverse of the input transpose.
     * 
     * - Parameters:
     * - tensor: A complex-valued input tensor with reduced size (see Discussion). Must have datatype
     * `MPSDataTypeComplexFloat32` or `MPSDataTypeComplexFloat16`.
     * - axesTensor: A tensor of rank one containing the axes over which MPSGraph performs the transformation. See
     * ``MPSGraph/fastFourierTransformWithTensor:axes:descriptor:name:``.
     * - descriptor: A descriptor that defines parameters of the Fourier transform operation - see
     * ``MPSGraphFFTDescriptor``.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor of type `MPSDataTypeFloat32` or `MPSDataTypeFloat16` (full size).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("HermiteanToRealFFTWithTensor:axesTensor:descriptor:name:")
    @NotNull
    public native MPSGraphTensor HermiteanToRealFFTWithTensorAxesTensorDescriptorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @NotNull MPSGraphFFTDescriptor descriptor, @Nullable String name);

    /**
     * Returns the absolute square of the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor..
     * - name: An optional string which serves as an identifier for the operation..
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("absoluteSquareWithTensor:name:")
    @NotNull
    public native MPSGraphTensor absoluteSquareWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create BottomKGradient op and return the result tensor.
     * 
     * Finds the K smallest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * 
     * - Parameters:
     * - gradient: Tensor containing the incoming gradient.
     * - source: Tensor containing source data.
     * - axis: The dimension along which to compute the BottomK values.
     * - k: The number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("bottomKWithGradientTensor:source:axis:k:name:")
    @NotNull
    public native MPSGraphTensor bottomKWithGradientTensorSourceAxisKName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NInt long axis, @NUInt long k, @Nullable String name);

    /**
     * Create BottomKGradient op and return the result tensor.
     * 
     * Finds the K smallest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * 
     * - Parameters:
     * - gradient: Tensor containing the incoming gradient.
     * - source: Tensor containing source data.
     * - axisTensor: Tensor containing the dimension along which to compute the BottomK values.
     * - kTensor: Tensor of the number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("bottomKWithGradientTensor:source:axisTensor:kTensor:name:")
    @NotNull
    public native MPSGraphTensor bottomKWithGradientTensorSourceAxisTensorKTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor kTensor,
            @Nullable String name);

    /**
     * Create BottomK op and return the value and indices tensors.
     * 
     * Finds the k smallest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the bottom values, and the second
     * array corresponds to the indices of the bottom values.
     * 
     * - Parameters:
     * - source: Tensor containing source data.
     * - axis: The dimension along which to compute the BottomK values.
     * - k: The number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 2.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("bottomKWithSourceTensor:axis:k:name:")
    @NotNull
    public native NSArray<? extends MPSGraphTensor> bottomKWithSourceTensorAxisKName(@NotNull MPSGraphTensor source,
            @NInt long axis, @NUInt long k, @Nullable String name);

    /**
     * Create BottomK op and return the result tensor.
     * 
     * Finds the k smallest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the bottom values, and the second
     * array corresponds to the indices of the bottom values.
     * 
     * - Parameters:
     * - source: Tensor containing source data.
     * - axisTensor: Tensor containing the dimension along which to compute the BottomK values.
     * - kTensor: Tensor of the number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 2.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("bottomKWithSourceTensor:axisTensor:kTensor:name:")
    @NotNull
    public native NSArray<? extends MPSGraphTensor> bottomKWithSourceTensorAxisTensorKTensorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor kTensor,
            @Nullable String name);

    /**
     * Returns a complex tensor from the two input tensors.
     * 
     * - Parameters:
     * - realTensor: The real part of the complex tensor.
     * - imaginaryTensor: The imaginary part of the complex tensor.
     * - name: An optional string which serves as an identifier for the operation..
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("complexTensorWithRealTensor:imaginaryTensor:name:")
    @NotNull
    public native MPSGraphTensor complexTensorWithRealTensorImaginaryTensorName(@NotNull MPSGraphTensor realTensor,
            @NotNull MPSGraphTensor imaginaryTensor, @Nullable String name);

    /**
     * Returns the complex conjugate of the input tensor elements.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation..
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("conjugateWithTensor:name:")
    @NotNull
    public native MPSGraphTensor conjugateWithTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a complex constant op with the MPSDataTypeComplexFloat32 data type and returns the result tensor.
     * 
     * - Parameters:
     * - realPart: The real part of the complex scalar to fill the entire tensor values with.
     * - imaginaryPart: The imaginary part of the complex scalar to fill the entire tensor values with.
     * - dataType: The dataType of the constant tensor.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("constantWithRealPart:imaginaryPart:")
    @NotNull
    public native MPSGraphTensor constantWithRealPartImaginaryPart(double realPart, double imaginaryPart);

    /**
     * Creates a complex constant op and returns the result tensor.
     * 
     * - Parameters:
     * - realPart: The real part of the complex scalar to fill the entire tensor values with.
     * - imaginaryPart: The imaginary part of the complex scalar to fill the entire tensor values with.
     * - dataType: The dataType of the constant tensor.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("constantWithRealPart:imaginaryPart:dataType:")
    @NotNull
    public native MPSGraphTensor constantWithRealPartImaginaryPartDataType(double realPart, double imaginaryPart,
            int dataType);

    /**
     * Creates a 3d convolution gradient operation with respect to the source tensor of the forward convolution.
     * 
     * If `S` is source tensor to forward convoluiton, `R` is the result/returned tensor of forward convolution,
     * and `L` is the loss function, convolution3DDataGradientWithIncomingGradientTensor returns tensor `dL/dS = dL/dR *
     * dR/dS`,
     * where `dL/dR` is the incomingGradient parameter.
     * 
     * - Parameters:
     * - incomingGradient: Incoming loss gradient tensor
     * - weights: Forward pass weights tensor
     * - outputShapeTensor: 4D Int32 or Int64 tensor. Shape of the forward pass source tensor
     * - forwardConvolutionDescriptor: Forward convolution 2d op ``descriptor``
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("convolution3DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    @NotNull
    public native MPSGraphTensor convolution3DDataGradientWithIncomingGradientTensorWeightsTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphTensor outputShapeTensor,
            @NotNull MPSGraphConvolution3DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Creates a 3d convolution gradient operation with respect to the weights tensor of the forward convolution.
     * 
     * If `W` is weights tensor to forward convoluiton, `R` is the result/returned tensor of forward convolution,
     * and `L` is the loss function, convolution3DWeightsGradientWithIncomingGradientTensor returns tensor `dL/dW =
     * dL/dR * dR/dW`,
     * where `dL/dR` is the incomingGradient parameter.
     * 
     * - Parameters:
     * - incomingGradient: Incoming loss gradient tensor
     * - weights: Forward pass weights tensor
     * - outputShapeTensor: 4D int32 or Int64 Tensor. Shape of the forward pass source tensor
     * - forwardConvolutionDescriptor: Forward convolution 2d op ``descriptor``
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("convolution3DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    @NotNull
    public native MPSGraphTensor convolution3DWeightsGradientWithIncomingGradientTensorSourceTensorOutputShapeTensorForwardConvolutionDescriptorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor outputShapeTensor,
            @NotNull MPSGraphConvolution3DOpDescriptor forwardConvolutionDescriptor, @Nullable String name);

    /**
     * Creates a 3d forward convolution operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: source tensor - must be of rank 5. The layout is defined by ``descriptor.dataLayout``.
     * - weights: weights tensor, must be rank 5. The layout is defined by ``descriptor.weightsLayout``.
     * - descriptor: Specifies strides, dilation rates, paddings and layouts.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("convolution3DWithSourceTensor:weightsTensor:descriptor:name:")
    @NotNull
    public native MPSGraphTensor convolution3DWithSourceTensorWeightsTensorDescriptorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor weights,
            @NotNull MPSGraphConvolution3DOpDescriptor descriptor, @Nullable String name);

    /**
     * Creates a fast Fourier transform operation and returns the result tensor.
     * 
     * This operation computes the fast Fourier transform of the input tensor according to the following formulae.
     * ```md
     * output[mu] = scale * sum_nu exp( +/- i * 2Pi * mu * nu / n ) input[nu], where
     * ```
     * `scale = 1` for `scaling_mode = none`,
     * `scale = 1/V_f` for `scaling_mode = size`,
     * `scale = 1/sqrt(V_f)` for `scaling_mode = unitary`, where
     * `V_f` is the volume of the transformation defined by the dimensions included in `axes`
     * (`V_f = prod_{i \in axes} shape(input)[i]`) (see ``MPSGraphFFTDescriptor/scalingMode``),
     * `+` is selected in `+/-` when `inverse` is specified, otherwise `-` is used
     * and the sum is done separately over each dimension in `axes` and `n` is the
     * dimension length of that axis.
     * 
     * > Tip: Currently MPSGraph supports the transformation only within the last four dimensions of the input tensor.
     * In case
     * you need to transform higher dimensions than the last four, you can tranpose the higher dimensions of the input
     * with ``MPSGraph/transposeTensor:permutation:name:`` to be within that last four and then transpose
     * the result tensor back with the inverse of the input transpose.
     * 
     * - Parameters:
     * - tensor: A complex-valued input tensor. Must have datatype `MPSDataTypeComplexFloat32` or
     * `MPSDataTypeComplexFloat16`.
     * - axes: An array of numbers that specifies over which axes MPSGraph performs the Fourier transform - all axes
     * must be contained within last four dimensions of the input tensor.
     * - descriptor: A descriptor that defines parameters of the Fourier transform operation - see
     * ``MPSGraphFFTDescriptor``.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor of the same type as `tensor`.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("fastFourierTransformWithTensor:axes:descriptor:name:")
    @NotNull
    public native MPSGraphTensor fastFourierTransformWithTensorAxesDescriptorName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @NotNull MPSGraphFFTDescriptor descriptor,
            @Nullable String name);

    /**
     * Creates a fast Fourier transform operation and returns the result tensor.
     * 
     * This operation computes the fast Fourier transform of the input tensor according to the following formulae.
     * ```md
     * output[mu] = scale * sum_nu exp( +/- i * 2Pi * mu * nu / n ) input[nu], where
     * ```
     * `scale = 1` for `scaling_mode = none`,
     * `scale = 1/V_f` for `scaling_mode = size`,
     * `scale = 1/sqrt(V_f)` for `scaling_mode = unitary`, where
     * `V_f` is the volume of the transformation defined by the dimensions included in `axes`
     * (`V_f = prod_{i \in axes} shape(input)[i]`) (see ``MPSGraphFFTDescriptor/scalingMode``),
     * `+` is selected in `+/-` when `inverse` is specified, otherwise `-` is used
     * and the sum is done separately over each dimension in `axes` and `n` is the
     * dimension length of that axis.
     * 
     * > Tip: Currently MPSGraph supports the transformation only within the last four dimensions of the input tensor.
     * In case
     * you need to transform higher dimensions than the last four, you can tranpose the higher dimensions of the input
     * with ``MPSGraph/transposeTensor:permutation:name:`` to be within that last four and then transpose
     * the result tensor back with the inverse of the input transpose.
     * 
     * - Parameters:
     * - tensor: A complex-valued input tensor. Must have datatype `MPSDataTypeComplexFloat32` or
     * `MPSDataTypeComplexFloat16`.
     * - axesTensor: A tensor of rank one containing the axes over which MPSGraph performs the transformation. See
     * ``MPSGraph/fastFourierTransformWithTensor:axes:descriptor:name:``.
     * - descriptor: A descriptor that defines parameters of the Fourier transform operation - see
     * ``MPSGraphFFTDescriptor``.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor of the same type as `tensor`.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("fastFourierTransformWithTensor:axesTensor:descriptor:name:")
    @NotNull
    public native MPSGraphTensor fastFourierTransformWithTensorAxesTensorDescriptorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @NotNull MPSGraphFFTDescriptor descriptor, @Nullable String name);

    /**
     * Creates an imToCol operation and returns the result tensor.
     * 
     * - Parameters:
     * - source: The tensor containing the source data. Must be of rank 4. The layout is defined by
     * `descriptor.dataLayout`.
     * - descriptor: The descriptor object that specifies the parameters of the operation.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object
     */
    @Generated
    @Selector("imToColWithSourceTensor:descriptor:name:")
    @NotNull
    public native MPSGraphTensor imToColWithSourceTensorDescriptorName(@NotNull MPSGraphTensor source,
            @NotNull MPSGraphImToColOpDescriptor descriptor, @Nullable String name);

    /**
     * Returns the imaginary part of a tensor.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation..
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("imaginaryPartOfTensor:name:")
    @NotNull
    public native MPSGraphTensor imaginaryPartOfTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Create a nonMaximumumSuppression op and return the result tensor
     * - Parameters:
     * - boxesTensor: A tensor containing the coordinates of the input boxes. Must be a rank 3 tensor of shape [N,B,4]
     * of type ``MPSDataTypeFloat32``
     * - scoresTensor: A tensor containing the scores of the input boxes. Must be a rank 3 tensor of shape [N,B,K] of
     * type ``MPSDataTypeFloat32``
     * - IOUThreshold: The threshold for when to reject boxes based on their Intersection Over Union. Valid range is
     * [0,1].
     * - scoreThreshold: The threshold for when to reject boxes based on their score, before IOU suppression.
     * - perClassSuppression: When this is specified a box will only suppress another box if they have the same class.
     * - coordinateMode: The coordinate mode the box coordinates are provided in.
     * - name: The name for the operation.
     */
    @Generated
    @Selector("nonMaximumSuppressionWithBoxesTensor:scoresTensor:IOUThreshold:scoreThreshold:perClassSuppression:coordinateMode:name:")
    @NotNull
    public native MPSGraphTensor nonMaximumSuppressionWithBoxesTensorScoresTensorIOUThresholdScoreThresholdPerClassSuppressionCoordinateModeName(
            @NotNull MPSGraphTensor boxesTensor, @NotNull MPSGraphTensor scoresTensor, float IOUThreshold,
            float scoreThreshold, boolean perClassSuppression, @NUInt long coordinateMode, @Nullable String name);

    /**
     * Create a nonMaximumumSuppression op and return the result tensor
     * - Parameters:
     * - boxesTensor: A tensor containing the coordinates of the input boxes. Must be a rank 3 tensor of shape [N,B,4]
     * of type ``MPSDataTypeFloat32``
     * - scoresTensor: A tensor containing the scores of the input boxes. Must be a rank 3 tensor of shape [N,B,1] of
     * type ``MPSDataTypeFloat32``
     * - classIndicesTensor: A tensor containing the class indices of the input boxes. Must be a rank 2 tensor of shape
     * [N,B] of type ``MPSDataTypeInt32``
     * - IOUThreshold: The threshold for when to reject boxes based on their Intersection Over Union. Valid range is
     * [0,1].
     * - scoreThreshold: The threshold for when to reject boxes based on their score, before IOU suppression.
     * - perClassSuppression: When this is specified a box will only suppress another box if they have the same class.
     * - coordinateMode: The coordinate mode the box coordinates are provided in.
     * - name: The name for the operation.
     */
    @Generated
    @Selector("nonMaximumSuppressionWithBoxesTensor:scoresTensor:classIndicesTensor:IOUThreshold:scoreThreshold:perClassSuppression:coordinateMode:name:")
    @NotNull
    public native MPSGraphTensor nonMaximumSuppressionWithBoxesTensorScoresTensorClassIndicesTensorIOUThresholdScoreThresholdPerClassSuppressionCoordinateModeName(
            @NotNull MPSGraphTensor boxesTensor, @NotNull MPSGraphTensor scoresTensor,
            @NotNull MPSGraphTensor classIndicesTensor, float IOUThreshold, float scoreThreshold,
            boolean perClassSuppression, @NUInt long coordinateMode, @Nullable String name);

    /**
     * Compute the indices of the non-zero elements of the input tensor. The indices are
     * returned as a two-dimensional tensor of size `[number_of_nonzeros, input_rank]`.
     * Each row in the result contains indices of a nonzero elements in input.
     * 
     * For example:
     * ```md
     * tensor = [[ 1, 0, 3],
     * [ 0, 10, 0]]
     * indices = [[ 0, 0],
     * [ 0, 2],
     * [ 1, 1]]
     * ```
     * 
     * - Parameters:
     * - tensor: An MPSGraphTensor of which to compute the non-zero indices.
     * - Returns: A valid MPSGraphTensor containing indices in signed int32 data type.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("nonZeroIndicesOfTensor:name:")
    @NotNull
    public native MPSGraphTensor nonZeroIndicesOfTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Returns the real part of a tensor.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - name: An optional string which serves as an identifier for the operation..
     * - Returns: A valid `MPSGraphTensor` object containing the elementwise result of the applied operation.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("realPartOfTensor:name:")
    @NotNull
    public native MPSGraphTensor realPartOfTensorName(@NotNull MPSGraphTensor tensor, @Nullable String name);

    /**
     * Creates a Real-to-Hermitean fast Fourier transform operation and returns the result tensor.
     * 
     * This operation computes the fast Fourier transform of a real-valued input tensor according to the following
     * formulae.
     * ```md
     * output[mu] = scale * sum_nu exp( +/- i * 2Pi * mu * nu / n ) input[nu], where
     * ```
     * `scale = 1` for `scaling_mode = none`,
     * `scale = 1/V_f` for `scaling_mode = size`,
     * `scale = 1/sqrt(V_f)` for `scaling_mode = unitary`, where
     * `V_f` is the volume of the transformation defined by the dimensions included in `axes`
     * (`V_f = prod_{i \in axes} shape(input)[i]`) (see ``MPSGraphFFTDescriptor/scalingMode``),
     * `+` is selected in `+/-` when `inverse` is specified, otherwise `-` is used
     * and the sum is done separately over each dimension in `axes` and `n` is the
     * dimension length of that axis. With this API MPSGraph writes out only the results for the unique
     * frequencies, resulting in a tensor which has size `(n/2)+1` in the last dimension defined by `axes`.
     * 
     * > Tip: Currently MPSGraph supports the transformation only within the last four dimensions of the input tensor.
     * In case
     * you need to transform higher dimensions than the last four, you can tranpose the higher dimensions of the input
     * with ``MPSGraph/transposeTensor:permutation:name:`` to be within that last four and then transpose
     * the result tensor back with the inverse of the input transpose.
     * 
     * - Parameters:
     * - tensor: A Real-valued input tensor. Must have datatype `MPSDataTypeFloat32` or `MPSDatatypeFloat16`.
     * - axes: An array of numbers that specifies over which axes MPSGraph performs the Fourier transform - all axes
     * must be contained within last four dimensions of the input tensor.
     * - descriptor: A descriptor that defines parameters of the Fourier transform operation - see
     * ``MPSGraphFFTDescriptor``.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor of type `MPSDataTypeComplexFloat32` or `MPSDataTypeComplexFloat16` with reduced
     * size (see Discussion).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("realToHermiteanFFTWithTensor:axes:descriptor:name:")
    @NotNull
    public native MPSGraphTensor realToHermiteanFFTWithTensorAxesDescriptorName(@NotNull MPSGraphTensor tensor,
            @NotNull NSArray<? extends NSNumber> axes, @NotNull MPSGraphFFTDescriptor descriptor,
            @Nullable String name);

    /**
     * Creates a Real-to-Hermitean fast Fourier transform operation and returns the result tensor.
     * 
     * This operation computes the fast Fourier transform of a real-valued input tensor according to the following
     * formulae.
     * ```md
     * output[mu] = scale * sum_nu exp( +/- i * 2Pi * mu * nu / n ) input[nu], where
     * ```
     * `scale = 1` for `scaling_mode = none`,
     * `scale = 1/V_f` for `scaling_mode = size`,
     * `scale = 1/sqrt(V_f)` for `scaling_mode = unitary`, where
     * `V_f` is the volume of the transformation defined by the dimensions included in `axes`
     * (`V_f = prod_{i \in axes} shape(input)[i]`) (see ``MPSGraphFFTDescriptor/scalingMode``),
     * `+` is selected in `+/-` when `inverse` is specified, otherwise `-` is used
     * and the sum is done separately over each dimension in `axes` and `n` is the
     * dimension length of that axis. With this API MPSGraph writes out only the results for the unique
     * frequencies, resulting in a tensor which has size `(n/2)+1` in the last dimension defined by `axes`.
     * 
     * > Tip: Currently MPSGraph supports the transformation only within the last four dimensions of the input tensor.
     * In case
     * you need to transform higher dimensions than the last four, you can tranpose the higher dimensions of the input
     * with ``MPSGraph/transposeTensor:permutation:name:`` to be within that last four and then transpose
     * the result tensor back with the inverse of the input transpose.
     * 
     * - Parameters:
     * - tensor: A real-valued input tensor. Must have datatype `MPSDataTypeFloat32` or `MPSDatatypeFloat16`.
     * - axesTensor: A tensor of rank one containing the axes over which MPSGraph performs the transformation. See
     * ``MPSGraph/fastFourierTransformWithTensor:axes:descriptor:name:``.
     * - descriptor: A descriptor that defines parameters of the Fourier transform operation - see
     * ``MPSGraphFFTDescriptor``.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor of type `MPSDataTypeComplexFloat32` or `MPSDataTypeComplexFloat16` with reduced
     * size (see Discussion).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("realToHermiteanFFTWithTensor:axesTensor:descriptor:name:")
    @NotNull
    public native MPSGraphTensor realToHermiteanFFTWithTensorAxesTensorDescriptorName(@NotNull MPSGraphTensor tensor,
            @NotNull MPSGraphTensor axesTensor, @NotNull MPSGraphFFTDescriptor descriptor, @Nullable String name);

    /**
     * Creates a reinterpret cast operation and returns the result tensor.
     * 
     * Returns input tensor (with element type `tensor_type`) reinterpreted to element type
     * passed in with the last dimension scaled by `sizeof(tensor_type) / sizeof(type)`.
     * This operation is endianness agnostic and MPSGraph reinterprets the data with the endianness of the
     * system.
     * 
     * - Parameters:
     * - tensor: The input tensor.
     * - type: The element type of the returned tensor.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("reinterpretCastTensor:toType:name:")
    @NotNull
    public native MPSGraphTensor reinterpretCastTensorToTypeName(@NotNull MPSGraphTensor tensor, int type,
            @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with bilinear sampling and identical parameters.
     * 
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - scale: 1D float tensor of size equal to rank of input.
     * - offset: 1D float tensor of size equal to rank of input.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeBilinearWithGradientTensor:input:scaleTensor:offsetTensor:name:")
    @NotNull
    public native MPSGraphTensor resizeBilinearWithGradientTensorInputScaleTensorOffsetTensorName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scale,
            @NotNull MPSGraphTensor offset, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using bilinear sampling. Result images will be distorted if
     * size is of different aspect ratio.
     * Destination indices are computed using direct index scaling by default, with no offset added.
     * If the centerResult parameter is true, the destination indices will be scaled and shifted to be centered
     * on the input image.
     * If the alignCorners parameter is true, the corners of the result images will match the input images.
     * Scaling will be modified to a factor of (size - 1) / (inputSize - 1). When alignCorners is true, the
     * centerResult parameter does nothing.
     * In order to achieve the same behavior as OpenCV's resize and TensorFlowV2's resize,
     * ```md
     * centerResult = YES;
     * alginCorners = NO;
     * ```
     * To achieve the same behavior as TensorFlowV1 resize
     * ```md
     * centerResult = NO;
     * ```
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: The target size of the result tensor. 1D Int32 or Int64 tensor of size equal to rank of input.
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeBilinearWithTensor:sizeTensor:centerResult:alignCorners:name:")
    @NotNull
    public native MPSGraphTensor resizeBilinearWithTensorSizeTensorCenterResultAlignCornersName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, boolean centerResult,
            boolean alignCorners, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using the provided scale and offset and bilinear sampling.
     * Destination indices are computed using
     * ```md
     * dst_indices = (src_indices * scale) + offset
     * ```
     * For most use cases passing the scale and offset directly is unnecessary, and it is
     * preferable to use the API specifying centerResult and alignCorners.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: The target size of the result tensor. 1D Int32 or Int64 tensor of size equal to rank of input.
     * - scale: 1D float tensor of size equal to rank of input.
     * - offset: 1D float tensor of size equal to rank of input.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeBilinearWithTensor:sizeTensor:scaleTensor:offsetTensor:name:")
    @NotNull
    public native MPSGraphTensor resizeBilinearWithTensorSizeTensorScaleTensorOffsetTensorName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NotNull MPSGraphTensor scale,
            @NotNull MPSGraphTensor offset, @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with nearest neighbor sampling and identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - scale: 1D float tensor of size equal to rank of input.
     * - offset: 1D float tensor of size equal to rank of input.
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling. Default is roundPreferCeil.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeNearestWithGradientTensor:input:scaleTensor:offsetTensor:nearestRoundingMode:name:")
    @NotNull
    public native MPSGraphTensor resizeNearestWithGradientTensorInputScaleTensorOffsetTensorNearestRoundingModeName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scale,
            @NotNull MPSGraphTensor offset, @NUInt long nearestRoundingMode, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using nearest neighbor sampling. Result images will be distorted if
     * size is of different aspect ratio.
     * Destination indices are computed using direct index scaling by default, with no offset added.
     * If the centerResult parameter is true, the destination indices will be scaled and shifted to be centered
     * on the input image.
     * If the alignCorners parameter is true, the corners of the result images will match the input images.
     * Scaling will be modified to a factor of (size - 1) / (inputSize - 1). When alignCorners is true, the
     * centerResult parameter does nothing.
     * In order to achieve the same behavior as OpenCV's resize and TensorFlowV2's resize,
     * ```md
     * centerResult = YES;
     * alginCorners = NO;
     * ```
     * To achieve the same behavior as TensorFlowV1 resize
     * ```md
     * centerResult = NO;
     * ```
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: The target size of the result tensor. 1D Int32 or Int64 tensor of size equal to rank of input.
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling. Default is roundPreferCeil.
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeNearestWithTensor:sizeTensor:nearestRoundingMode:centerResult:alignCorners:name:")
    @NotNull
    public native MPSGraphTensor resizeNearestWithTensorSizeTensorNearestRoundingModeCenterResultAlignCornersName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NUInt long nearestRoundingMode,
            boolean centerResult, boolean alignCorners, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using the provided scale and offset and nearest neighbor sampling.
     * Destination indices are computed using
     * ```md
     * dst_indices = (src_indices * scale) + offset
     * ```
     * For most use cases passing the scale and offset directly is unnecessary, and it is
     * preferable to use the API specifying centerResult and alignCorners.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: The target size of the result tensor. 1D Int32 or Int64 tensor of size equal to rank of input.
     * - scale: 1D float tensor of size equal to rank of input.
     * - offset: 1D float tensor of size equal to rank of input.
     * - nearestRoundingMode: The rounding mode to use when using nearest resampling. Default is roundPreferCeil.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeNearestWithTensor:sizeTensor:scaleTensor:offsetTensor:nearestRoundingMode:name:")
    @NotNull
    public native MPSGraphTensor resizeNearestWithTensorSizeTensorScaleTensorOffsetTensorNearestRoundingModeName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NotNull MPSGraphTensor scale,
            @NotNull MPSGraphTensor offset, @NUInt long nearestRoundingMode, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size. Result images will be distorted if size is of different aspect ratio.
     * Resize supports the following modes:
     * Nearest Neighbor - values are interpolated using the closest neighbor pixel
     * Bilinear - values are computed using bilinear interpolation of 4 neighboring pixels
     * Destination indices are computed using direct index scaling by default, with no offset added.
     * If the centerResult parameter is true, the destination indices will be scaled and shifted to be centered
     * on the input image.
     * If the alignCorners parameter is true, the corners of the result images will match the input images.
     * Scaling will be modified to a factor of (size - 1) / (inputSize - 1). When alignCorners is true, the
     * centerResult parameter does nothing.
     * In order to achieve the same behavior as OpenCV's resize and TensorFlowV2's resize,
     * ```md
     * centerResult = YES;
     * alginCorners = NO;
     * ```
     * To achieve the same behavior as TensorFlowV1 resize
     * ```md
     * centerResult = NO;
     * ```
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: The target size of the result tensor. 1D Int32 or Int64 tensor of size equal to rank of input.
     * - mode: The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be used.
     * - centerResult: Controls if the result image is centered on the input image. When NO, the result will have the
     * top left corner aligned
     * - alignCorners: When YES, the result image will have the same value as the input image in the corners
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeTensor:sizeTensor:mode:centerResult:alignCorners:name:")
    @NotNull
    public native MPSGraphTensor resizeTensorSizeTensorModeCenterResultAlignCornersName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NUInt long mode, boolean centerResult,
            boolean alignCorners, @Nullable String name);

    /**
     * Create Resize op and return the result tensor
     * 
     * Resamples input images to given size using the provided scale and offset.
     * Destination indices are computed using
     * ```md
     * dst_indices = (src_indices * scale) + offset
     * ```
     * For most use cases passing the scale and offset directly is unnecessary, and it is
     * preferable to use the API specifying centerResult and alignCorners.
     * 
     * - Parameters:
     * - imagesTensor: Tensor containing input images.
     * - size: The target size of the result tensor. 1D Int32 or Int64 tensor of size equal to rank of input.
     * - scale: 1D float tensor of size equal to rank of input.
     * - offset: 1D float tensor of size equal to rank of input.
     * - mode: The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be used.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeTensor:sizeTensor:scaleTensor:offsetTensor:mode:name:")
    @NotNull
    public native MPSGraphTensor resizeTensorSizeTensorScaleTensorOffsetTensorModeName(
            @NotNull MPSGraphTensor imagesTensor, @NotNull MPSGraphTensor size, @NotNull MPSGraphTensor scale,
            @NotNull MPSGraphTensor offset, @NUInt long mode, @Nullable String name);

    /**
     * Create Resize gradient op and return the result tensor
     * 
     * Computes the gradient for the forward pass Resize op with identical parameters.
     * See discussion of resizeTensor for more in depth description of resize paramters.
     * 
     * - Parameters:
     * - gradient: Incoming gradient tensor
     * - input: Forward pass input tensor
     * - scale: 1D float tensor of size equal to rank of input.
     * - offset: 1D float tensor of size equal to rank of input.
     * - mode: The resampling mode to use. If nearest sampling is specifed, RoundPreferCeil mode will be used.
     * - name: The name for the operation
     * - Returns: A valid MPSGraphTensor object
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resizeWithGradientTensor:input:scaleTensor:offsetTensor:mode:name:")
    @NotNull
    public native MPSGraphTensor resizeWithGradientTensorInputScaleTensorOffsetTensorModeName(
            @NotNull MPSGraphTensor gradient, @NotNull MPSGraphTensor input, @NotNull MPSGraphTensor scale,
            @NotNull MPSGraphTensor offset, @NUInt long mode, @Nullable String name);

    /**
     * Create TopKGradient op and return the result tensor.
     * 
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * 
     * - Parameters:
     * - gradient: Tensor containing the incoming gradient.
     * - source: Tensor containing source data.
     * - axis: The dimension along which to compute the TopK values..
     * - k: The number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("topKWithGradientTensor:source:axis:k:name:")
    @NotNull
    public native MPSGraphTensor topKWithGradientTensorSourceAxisKName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NInt long axis, @NUInt long k, @Nullable String name);

    /**
     * Create TopKGradient op and return the result tensor.
     * 
     * Finds the K largest values along the minor dimension of the input. The input must have
     * at least K elements along its minor dimension.
     * 
     * - Parameters:
     * - gradient: Tensor containing the incoming gradient.
     * - source: Tensor containing source data.
     * - axisTensor: Tensor containing the dimension along which to compute the TopK values.
     * - kTensor: Tensor of the number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("topKWithGradientTensor:source:axisTensor:kTensor:name:")
    @NotNull
    public native MPSGraphTensor topKWithGradientTensorSourceAxisTensorKTensorName(@NotNull MPSGraphTensor gradient,
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor kTensor,
            @Nullable String name);

    /**
     * Creates TopK op and return the value and indices tensors.
     * 
     * Finds the k largest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the top values, and the second
     * array corresponds to the indices of the top values.
     * 
     * - Parameters:
     * - source: Tensor containing source data.
     * - axis: The dimension along which to compute the TopK values.
     * - k: The number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 2.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("topKWithSourceTensor:axis:k:name:")
    @NotNull
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorAxisKName(@NotNull MPSGraphTensor source,
            @NInt long axis, @NUInt long k, @Nullable String name);

    /**
     * Creates TopK op and return the result tensor..
     * 
     * Finds the k largest values along the minor dimension of the input. The source must have
     * at least k elements along its minor dimension.
     * The first element of the result array corresponds to the top values, and the second
     * array corresponds to the indices of the top values.
     * 
     * - Parameters:
     * - source: Tensor containing source data.
     * - axisTensor: Tensor containing the dimension along which to compute the TopK values.
     * - kTensor: Tensor of the number of largest values to return.
     * - name: The name for the operation.
     * - Returns: A valid MPSGraphTensor array of size 2.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("topKWithSourceTensor:axisTensor:kTensor:name:")
    @NotNull
    public native NSArray<? extends MPSGraphTensor> topKWithSourceTensorAxisTensorKTensorName(
            @NotNull MPSGraphTensor source, @NotNull MPSGraphTensor axisTensor, @NotNull MPSGraphTensor kTensor,
            @Nullable String name);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
