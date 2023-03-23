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
    @Deprecated
    @Generated
    @Selector("compileModelAtURL:error:")
    public static native NSURL compileModelAtURLError(NSURL modelURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * A model holds a description of its required inputs and expected outputs.
     */
    @Generated
    @Selector("modelDescription")
    public native MLModelDescription modelDescription();

    /**
     * Construct a model with a default MLModelConfiguration object
     */
    @Generated
    @Selector("modelWithContentsOfURL:error:")
    public static native MLModel modelWithContentsOfURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native MLModel new_objc();

    /**
     * All models can predict on a specific set of input features.
     */
    @Generated
    @Selector("predictionFromFeatures:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLFeatureProvider predictionFromFeaturesError(@Mapped(ObjCObjectMapper.class) MLFeatureProvider input,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Prediction with explicit options
     */
    @Generated
    @Selector("predictionFromFeatures:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLFeatureProvider predictionFromFeaturesOptionsError(
            @Mapped(ObjCObjectMapper.class) MLFeatureProvider input, MLPredictionOptions options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native MLModel modelWithContentsOfURLConfigurationError(NSURL url, MLModelConfiguration configuration,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Provides value for the given parameter. Returns nil on error.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("parameterValueForKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object parameterValueForKeyError(MLParameterKey key,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Batch prediction without explicit options
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("predictionsFromBatch:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLBatchProvider predictionsFromBatchError(@Mapped(ObjCObjectMapper.class) MLBatchProvider inputBatch,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Batch prediction with explicit options
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("predictionsFromBatch:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLBatchProvider predictionsFromBatchOptionsError(
            @Mapped(ObjCObjectMapper.class) MLBatchProvider inputBatch, MLPredictionOptions options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native void loadContentsOfURLConfigurationCompletionHandler(NSURL url,
            MLModelConfiguration configuration,
            @ObjCBlock(name = "call_loadContentsOfURLConfigurationCompletionHandler") Block_loadContentsOfURLConfigurationCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadContentsOfURLConfigurationCompletionHandler {
        @Generated
        void call_loadContentsOfURLConfigurationCompletionHandler(MLModel model, NSError error);
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
    public static native void compileModelAtURLCompletionHandler(NSURL modelURL,
            @ObjCBlock(name = "call_compileModelAtURLCompletionHandler") Block_compileModelAtURLCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_compileModelAtURLCompletionHandler {
        @Generated
        void call_compileModelAtURLCompletionHandler(NSURL compiledModelURL, NSError error);
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
    public static native void loadModelAssetConfigurationCompletionHandler(MLModelAsset asset,
            MLModelConfiguration configuration,
            @ObjCBlock(name = "call_loadModelAssetConfigurationCompletionHandler") Block_loadModelAssetConfigurationCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadModelAssetConfigurationCompletionHandler {
        @Generated
        void call_loadModelAssetConfigurationCompletionHandler(MLModel model, NSError error);
    }
}
