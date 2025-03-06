package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * A class describing the plan for executing a model.
 * 
 * The application can use the plan to estimate the necessary cost and
 * resources of the model before running the predictions.
 * 
 * ```
 * // Load the compute plan of an ML Program model.
 * [MLComputePlan loadContentsOfURL:modelURL configuration:configuration completionHandler:^(MLComputePlan * _Nullable
 * computePlan, NSError * _Nullable error) {
 * if (!computePlan) {
 * // Handle error.
 * return;
 * }
 * MLModelStructureProgram *program = computePlan.modelStructure.program;
 * if (!program) {
 * [NSException raise:NSInternalInconsistencyException format:@"Unexpected model type."];
 * }
 * 
 * MLModelStructureFunction *mainFunction = program.functions["main"];
 * if (!mainFunction) {
 * [NSException raise:NSInternalInconsistencyException format:@"Missing main function."];
 * }
 * 
 * NSArray<MLModelStructureProgramOperation *> *operations = mainFunction.block.operations;
 * for (MLModelStructureProgramOperation *operation in operations) {
 * // Get the compute device usage for the operation.
 * MLComputeDeviceUsage *computeDeviceUsage = [computePlan computeDeviceUsageForMLProgramOperation:operation];
 * // Get the estimated cost of executing the operation.
 * MLComputePlanCost *estimatedCost = [computePlan estimatedCostOfMLProgramOperation:operation];
 * 
 * }
 * }];
 * ```
 * 
 * 
 * API-Since: 17.4
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLComputePlan extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLComputePlan(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLComputePlan alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MLComputePlan allocWithZone(VoidPtr zone);

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

    /**
     * Returns The anticipated compute devices that would be used for executing an ML Program operation.
     * 
     * [@returns] The anticipated compute devices that would be used for executing the operation or `nil`if the usage
     * couldn't be determined.
     * 
     * API-Since: 17.4
     * 
     * @param operation An ML Program operation.
     */
    @Generated
    @Selector("computeDeviceUsageForMLProgramOperation:")
    @Nullable
    public native MLComputePlanDeviceUsage computeDeviceUsageForMLProgramOperation(
            @NotNull MLModelStructureProgramOperation operation);

    /**
     * Returns the anticipated compute devices that would be used for executing a NeuralNetwork layer.
     * 
     * [@returns] The anticipated compute devices that would be used for executing the layer or `nil` if the usage
     * couldn't be determined.
     * 
     * API-Since: 17.4
     * 
     * @param layer A NeuralNetwork layer.
     */
    @Generated
    @Selector("computeDeviceUsageForNeuralNetworkLayer:")
    @Nullable
    public native MLComputePlanDeviceUsage computeDeviceUsageForNeuralNetworkLayer(
            @NotNull MLModelStructureNeuralNetworkLayer layer);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Returns the estimated cost of executing an ML Program operation.
     * 
     * [@returns] The estimated cost of executing the operation or nil if the cost couldn't be estimated.
     * 
     * API-Since: 17.4
     * 
     * @param operation An ML Program operation.
     */
    @Generated
    @Selector("estimatedCostOfMLProgramOperation:")
    @Nullable
    public native MLComputePlanCost estimatedCostOfMLProgramOperation(
            @NotNull MLModelStructureProgramOperation operation);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLComputePlan init();

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
     * Construct the compute plan of a model asynchronously given the location of its on-disk representation.
     * 
     * @param url           The location of its on-disk representation (.mlmodelc directory).
     * @param configuration The model configuration.
     * @param handler       When the compute plan is constructed successfully or unsuccessfully, the completion handler
     *                      is invoked with a valid MLComputePlan instance or NSError object.
     * 
     *                      API-Since: 17.4
     */
    @Generated
    @Selector("loadContentsOfURL:configuration:completionHandler:")
    public static native void loadContentsOfURLConfigurationCompletionHandler(@NotNull NSURL url,
            @NotNull MLModelConfiguration configuration,
            @ObjCBlock(name = "call_loadContentsOfURLConfigurationCompletionHandler") @NotNull Block_loadContentsOfURLConfigurationCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadContentsOfURLConfigurationCompletionHandler {
        @Generated
        void call_loadContentsOfURLConfigurationCompletionHandler(@Nullable MLComputePlan computePlan,
                @Nullable NSError error);
    }

    /**
     * Construct the compute plan of a model asynchronously given the model asset.
     * 
     * @param asset         The model asset.
     * @param configuration The model configuration.
     * @param handler       When the compute plan is constructed successfully or unsuccessfully, the completion handler
     *                      is invoked with a valid MLComputePlan instance or NSError object.
     * 
     *                      API-Since: 17.4
     */
    @Generated
    @Selector("loadModelAsset:configuration:completionHandler:")
    public static native void loadModelAssetConfigurationCompletionHandler(@NotNull MLModelAsset asset,
            @NotNull MLModelConfiguration configuration,
            @ObjCBlock(name = "call_loadModelAssetConfigurationCompletionHandler") @NotNull Block_loadModelAssetConfigurationCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadModelAssetConfigurationCompletionHandler {
        @Generated
        void call_loadModelAssetConfigurationCompletionHandler(@Nullable MLComputePlan computePlan,
                @Nullable NSError error);
    }

    /**
     * The model structure.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("modelStructure")
    @NotNull
    public native MLModelStructure modelStructure();

    @Generated
    @Owned
    @Selector("new")
    public static native MLComputePlan new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}