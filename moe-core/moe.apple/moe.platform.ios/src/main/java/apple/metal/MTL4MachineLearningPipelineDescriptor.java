package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Description for a machine learning pipeline state.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4MachineLearningPipelineDescriptor extends MTL4PipelineDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4MachineLearningPipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4MachineLearningPipelineDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4MachineLearningPipelineDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native MTL4MachineLearningPipelineDescriptor init();

    /**
     * Obtains the dimensions of the input tensor at `bufferIndex` if set, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputDimensionsAtBufferIndex:")
    @Nullable
    public native MTLTensorExtents inputDimensionsAtBufferIndex(@NInt long bufferIndex);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Assigns an optional string that helps identify pipeline states you create from this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    public native String label();

    /**
     * Assigns the function that the machine learning pipeline you create from this descriptor executes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("machineLearningFunctionDescriptor")
    @Nullable
    public native MTL4FunctionDescriptor machineLearningFunctionDescriptor();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4MachineLearningPipelineDescriptor new_objc();

    /**
     * Resets the descriptor to its default values.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets the dimension of an input tensor at a buffer index.
     * 
     * - Parameters:
     * - dimensions: the dimensions of the tensor.
     * - bufferIndex: Index of the tensor to modify.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInputDimensions:atBufferIndex:")
    public native void setInputDimensionsAtBufferIndex(@Nullable MTLTensorExtents dimensions, @NInt long bufferIndex);

    /**
     * Sets the dimensions of multiple input tensors on a range of buffer bindings.
     * 
     * Use this method to specify the dimensions of multiple input tensors at a range of indices in a single call.
     * 
     * You can indicate that any tensors in the range have unspecified dimensions by providing `NSNull` at the their
     * corresponding index location in the array.
     * 
     * - Important: The range's length property needs to match the number of dimensions you provide. Specifically,
     * `range.length` needs to match `dimensions.count`.
     * 
     * - Parameters:
     * - dimensions: An array of tensor extents.
     * - range: The range of inputs of the `dimensions` argument.
     * The range's `length` needs to match the dimensions' `count` property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInputDimensions:withRange:")
    public native void setInputDimensionsWithRange(@NotNull NSArray<? extends MTLTensorExtents> dimensions,
            @ByValue NSRange range);

    /**
     * Assigns an optional string that helps identify pipeline states you create from this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    /**
     * Assigns the function that the machine learning pipeline you create from this descriptor executes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMachineLearningFunctionDescriptor:")
    public native void setMachineLearningFunctionDescriptor(@Nullable MTL4FunctionDescriptor value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}