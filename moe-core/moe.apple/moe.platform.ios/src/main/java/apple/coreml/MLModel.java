package apple.coreml;

import apple.NSObject;
import apple.coreml.protocol.MLBatchProvider;
import apple.coreml.protocol.MLFeatureProvider;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * MLModel
 * 
 * Construct a model and evaluate on a specific set of input features.
 * Inputs and outputs are accessed via the MLFeatureProvider protocol.
 * Returns a model or nil if there is an error.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLModel extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLModel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLModel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLModel allocWithZone(VoidPtr zone);

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
     * Compile a .mlmodel for this device
     * 
     * [@returns] a URL to the compiled .mlmodelc directory if successful
     * The model is compiled to a temporary location on disk
     * You must move the compiled model to a permanent location if you wish to keep it
     * 
     * The returned model can be loaded using:
     * [@code]
     * [MLModel modelWithContentsOfURL:error:]
     * [@endcode]
     * 
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use the asynchronous interface compileModelAtURL:completionHandler:error: instead.
     * 
     * @param modelURL URL file path to .mlmodel file you wish to compile
     * @param error    Any errors are surfaced here
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("compileModelAtURL:error:")
    public static native NSURL compileModelAtURLError(@NotNull NSURL modelURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public native MLModel init();

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
     * A model holds a description of its required inputs and expected outputs.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("modelDescription")
    public native MLModelDescription modelDescription();

    /**
     * Construct a model with a default MLModelConfiguration object
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("modelWithContentsOfURL:error:")
    public static native MLModel modelWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native MLModel new_objc();

    /**
     * Run a prediction on a model synchronously.
     * 
     * This is a convenience overload method of `prediction(from:options:)` that uses the default prediction options.
     * 
     * - Parameters
     * - input: The input features to make a prediction from.
     * - error: The output parameter to be filled with error information on failure.
     * - Returns: The output features from the prediction.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("predictionFromFeatures:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLFeatureProvider predictionFromFeaturesError(
            @NotNull @Mapped(ObjCObjectMapper.class) MLFeatureProvider input,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Run a prediction on a model synchronously
     * 
     * - Parameters
     * - input: The input features to make a prediction from.
     * - options: Prediction options to modify how the prediction is run.
     * - error: The output parameter to be filled with error information on failure.
     * - Returns: The output features from the prediction.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("predictionFromFeatures:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLFeatureProvider predictionFromFeaturesOptionsError(
            @NotNull @Mapped(ObjCObjectMapper.class) MLFeatureProvider input, @NotNull MLPredictionOptions options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The load-time parameters used to instantiate this MLModel object.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("configuration")
    public native MLModelConfiguration configuration();

    /**
     * Construct a model given the location of its on-disk representation. Returns nil on error.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("modelWithContentsOfURL:configuration:error:")
    public static native MLModel modelWithContentsOfURLConfigurationError(@NotNull NSURL url,
            @NotNull MLModelConfiguration configuration,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Provides value for the given parameter. Returns nil on error.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("parameterValueForKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object parameterValueForKeyError(@NotNull MLParameterKey key,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Batch prediction without explicit options
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("predictionsFromBatch:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLBatchProvider predictionsFromBatchError(
            @NotNull @Mapped(ObjCObjectMapper.class) MLBatchProvider inputBatch,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Batch prediction with explicit options
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("predictionsFromBatch:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLBatchProvider predictionsFromBatchOptionsError(
            @NotNull @Mapped(ObjCObjectMapper.class) MLBatchProvider inputBatch, @NotNull MLPredictionOptions options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct a model asynchronously given the location of its on-disk representation and configuration.
     * 
     * Model loading may take time when the model content is not immediately available (e.g. encrypted model). Use this
     * factory method especially when the caller is on the main thread.
     * 
     * @param url           the location of its on-disk representation (.mlmodelc directory).
     * @param configuration The model configuration
     * @param handler       When the model load completes successfully or unsuccessfully, the completion handler is
     *                      invoked with a valid MLModel instance or NSError object.
     * 
     *                      API-Since: 14.0
     */
    @Generated
    @Selector("loadContentsOfURL:configuration:completionHandler:")
    public static native void loadContentsOfURLConfigurationCompletionHandler(@NotNull NSURL url,
            @NotNull MLModelConfiguration configuration,
            @NotNull @ObjCBlock(name = "call_loadContentsOfURLConfigurationCompletionHandler") Block_loadContentsOfURLConfigurationCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadContentsOfURLConfigurationCompletionHandler {
        @Generated
        void call_loadContentsOfURLConfigurationCompletionHandler(@Nullable MLModel model, @Nullable NSError error);
    }

    /**
     * Compile a .mlmodel or .mlpackage for this device. Perform the compilation asynchronously.
     * 
     * The model is compiled to a temporary location in the file system. You must move the compiled model to a permanent
     * location if you wish to keep it. Then the model can be loaded using the returned URL:
     * [@code]
     * [MLModel modelWithContentsOfURL:error:]
     * [@endcode]
     * 
     * 
     * API-Since: 16.0
     * 
     * @param modelURL URL file path to .mlmodel file you wish to compile
     * @param handler  When the model compilation completes successfully the completion handler is invoked with a valid
     *                 URL to the compiled .mlmodelc directory.
     *                 On failure, signified by nil compiledModelURL, the NSError object is populated.
     */
    @Generated
    @Selector("compileModelAtURL:completionHandler:")
    public static native void compileModelAtURLCompletionHandler(@NotNull NSURL modelURL,
            @NotNull @ObjCBlock(name = "call_compileModelAtURLCompletionHandler") Block_compileModelAtURLCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_compileModelAtURLCompletionHandler {
        @Generated
        void call_compileModelAtURLCompletionHandler(@Nullable NSURL compiledModelURL, @Nullable NSError error);
    }

    /**
     * Construct a model asynchronously from a compiled model asset.
     * 
     * @param asset         Compiled model asset derived from in-memory or on-disk Core ML model
     * @param configuration Model configuration that hold options for loading a model
     * @param handler       When the model load completes successfully or unsuccessfully, the completion handler is
     *                      invoked with a valid MLModel instance or NSError object.
     * 
     *                      API-Since: 16.0
     */
    @Generated
    @Selector("loadModelAsset:configuration:completionHandler:")
    public static native void loadModelAssetConfigurationCompletionHandler(@NotNull MLModelAsset asset,
            @NotNull MLModelConfiguration configuration,
            @NotNull @ObjCBlock(name = "call_loadModelAssetConfigurationCompletionHandler") Block_loadModelAssetConfigurationCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadModelAssetConfigurationCompletionHandler {
        @Generated
        void call_loadModelAssetConfigurationCompletionHandler(@Nullable MLModel model, @Nullable NSError error);
    }

    /**
     * The list of available compute devices for CoreML.
     * 
     * Use the method to get the list of compute devices that MLModel's prediction can use.
     * 
     * Some compute devices on the hardware are exclusive to the domain ML frameworks such as Vision and SoundAnalysis
     * and
     * not available to CoreML. See also `MLComputeDevice.allComputeDevices`.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("availableComputeDevices")
    @NotNull
    public static native NSArray<?> availableComputeDevices();

    /**
     * Run a prediction on a model asynchronously.
     * 
     * This is a convenience overload method of `prediction(from:options:) async` that uses the default prediction
     * options.
     * 
     * - Parameters
     * - input: The input features to make a prediction from.
     * - completionHandler: A block that will be invoked once the prediction has completed successfully or
     * unsuccessfully. On success, it is invoked with a valid model output. On failure, it is invoked with a nil output
     * and NSError
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("predictionFromFeatures:completionHandler:")
    public native void predictionFromFeaturesCompletionHandler(
            @Mapped(ObjCObjectMapper.class) @NotNull MLFeatureProvider input,
            @ObjCBlock(name = "call_predictionFromFeaturesCompletionHandler") @NotNull Block_predictionFromFeaturesCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_predictionFromFeaturesCompletionHandler {
        @Generated
        void call_predictionFromFeaturesCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MLFeatureProvider output, @Nullable NSError error);
    }

    /**
     * Run a prediction on a model asynchronously.
     * 
     * - Parameters
     * - input: The input features to make a prediction from.
     * - options: Prediction options to modify how the prediction is run.
     * - completionHandler: A block that will be invoked once the prediction has completed successfully or
     * unsuccessfully. On success, it is invoked with a valid model output. On failure, it is invoked with a nil output
     * and NSError
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("predictionFromFeatures:options:completionHandler:")
    public native void predictionFromFeaturesOptionsCompletionHandler(
            @Mapped(ObjCObjectMapper.class) @NotNull MLFeatureProvider input, @NotNull MLPredictionOptions options,
            @ObjCBlock(name = "call_predictionFromFeaturesOptionsCompletionHandler") @NotNull Block_predictionFromFeaturesOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_predictionFromFeaturesOptionsCompletionHandler {
        @Generated
        void call_predictionFromFeaturesOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MLFeatureProvider output, @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Creates a new state object.
     * 
     * Core ML framework will allocate the state buffers declared in the model.
     * 
     * The allocated state buffers are initialized to zeros. To initialize with different values, use
     * `.withMultiArray(for:)` to get the mutable `MLMultiArray`-view to the state buffer.
     * 
     * It returns an empty state when the model is stateless. One can use the empty state with stateful prediction
     * functions such as `prediction(from:using:)` and those predictions will be stateless. This simplifies the call
     * site which may or may not use a stateful model.
     * 
     * ```swift
     * // Create state that contains two state buffers: s1 and s2.
     * // Then, initialize s1 to 1.0 and s2 to 2.0.
     * let state = model.newState()
     * state.withMultiArray(for: "s1") { stateMultiArray in
     * stateMultiArray[0] = 1.0
     * }
     * state.withMultiArray(for: "s2") { stateMultiArray in
     * stateMultiArray[0] = 2.0
     * }
     * ```
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("newState")
    @NotNull
    public native MLState newState();

    /**
     * Run a stateful prediction synchronously.
     * 
     * Use this method to run predictions on a stateful model.
     * 
     * ```swift
     * let state = model.newState()
     * let prediction = try model.prediction(from: inputFeatures, using: state)
     * ```
     * 
     * - Parameters:
     * - inputFeatures: The input features as declared in the model description.
     * - state: The state object created by `newState()` method.
     * - error: The output parameter to receive an error information on failure.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("predictionFromFeatures:usingState:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MLFeatureProvider predictionFromFeaturesUsingStateError(
            @Mapped(ObjCObjectMapper.class) @NotNull MLFeatureProvider inputFeatures, @NotNull MLState state,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Run a stateful prediction asynchronously.
     * 
     * Use this method to run predictions on a stateful model.
     * 
     * Do not request a prediction while another prediction that shares the same state is in-flight, otherwise the
     * behavior is undefined.
     * 
     * ```swift
     * let state = model.newState()
     * let prediction = try await model.prediction(from: inputFeatures, using: state)
     * ```
     * 
     * - Parameters
     * - input: The input features to make a prediction from.
     * - state: The state object created by `newState()` method.
     * - options: Prediction options to modify how the prediction is run.
     * - completionHandler: A block that will be invoked once the prediction has completed successfully or
     * unsuccessfully. On success, it is invoked with a valid model output. On failure, it is invoked with a nil output
     * and NSError
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("predictionFromFeatures:usingState:options:completionHandler:")
    public native void predictionFromFeaturesUsingStateOptionsCompletionHandler(
            @Mapped(ObjCObjectMapper.class) @NotNull MLFeatureProvider inputFeatures, @NotNull MLState state,
            @NotNull MLPredictionOptions options,
            @ObjCBlock(name = "call_predictionFromFeaturesUsingStateOptionsCompletionHandler") @NotNull Block_predictionFromFeaturesUsingStateOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_predictionFromFeaturesUsingStateOptionsCompletionHandler {
        @Generated
        void call_predictionFromFeaturesUsingStateOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MLFeatureProvider output, @Nullable NSError error);
    }

    /**
     * Run a stateful prediction synchronously with options.
     * 
     * Use this method to run predictions on a stateful model.
     * 
     * ```swift
     * let state = model.newState()
     * let prediction = try model.prediction(from: inputFeatures, using: state, options: predictionOptions)
     * ```
     * 
     * - Parameters:
     * - inputFeatures: The input features as declared in the model description.
     * - state: The state object created by `newState()` method.
     * - options: The prediction options.
     * - error: The output parameter to receive an error information on failure.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("predictionFromFeatures:usingState:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MLFeatureProvider predictionFromFeaturesUsingStateOptionsError(
            @Mapped(ObjCObjectMapper.class) @NotNull MLFeatureProvider inputFeatures, @NotNull MLState state,
            @NotNull MLPredictionOptions options, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);
}
