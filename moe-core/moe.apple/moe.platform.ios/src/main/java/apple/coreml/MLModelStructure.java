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
 * A class representing the structure of a model.
 * 
 * ```
 * // Load the model structure.
 * [MLModelStructure loadContentsOfURL:modelURL completionHandler:^(MLModelStructure * _Nullable modelStructure, NSError
 * * _Nullable error) {
 * if (!modelStructure) {
 * // Handle error.
 * return;
 * }
 * if (modelStructure.neuralNetwork) {
 * // Examine Neural network model.
 * } else if (modelStructure.program) {
 * // Examine ML Program model.
 * } else if (modelStructure.pipeline) {
 * // Examine Pipeline model.
 * } else {
 * // The model type is something else.
 * }
 * }];
 * ```
 * 
 * API-Since: 17.4
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLModelStructure extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLModelStructure(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLModelStructure alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MLModelStructure allocWithZone(VoidPtr zone);

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
    public native MLModelStructure init();

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
     * Construct the model structure asynchronously given the location of its on-disk representation.
     * 
     * @param url     The location of its on-disk representation (.mlmodelc directory).
     * @param handler When the model structure is constructed successfully or unsuccessfully, the completion handler is
     *                invoked with a valid MLModelStructure instance or NSError object.
     * 
     *                API-Since: 17.4
     */
    @Generated
    @Selector("loadContentsOfURL:completionHandler:")
    public static native void loadContentsOfURLCompletionHandler(@NotNull NSURL url,
            @ObjCBlock(name = "call_loadContentsOfURLCompletionHandler") @NotNull Block_loadContentsOfURLCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadContentsOfURLCompletionHandler {
        @Generated
        void call_loadContentsOfURLCompletionHandler(@Nullable MLModelStructure modelStructure,
                @Nullable NSError error);
    }

    /**
     * Construct the model structure asynchronously given the model asset.
     * 
     * @param asset   The model asset.
     * @param handler When the model structure is constructed successfully or unsuccessfully, the completion handler is
     *                invoked with a valid MLModelStructure instance or NSError object.
     * 
     *                API-Since: 17.4
     */
    @Generated
    @Selector("loadModelAsset:completionHandler:")
    public static native void loadModelAssetCompletionHandler(@NotNull MLModelAsset asset,
            @ObjCBlock(name = "call_loadModelAssetCompletionHandler") @NotNull Block_loadModelAssetCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadModelAssetCompletionHandler {
        @Generated
        void call_loadModelAssetCompletionHandler(@Nullable MLModelStructure modelStructure, @Nullable NSError error);
    }

    /**
     * If the model is of NeuralNetwork type then it is the structure of the NeuralNetwork otherwise `nil`.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("neuralNetwork")
    @Nullable
    public native MLModelStructureNeuralNetwork neuralNetwork();

    @Generated
    @Owned
    @Selector("new")
    public static native MLModelStructure new_objc();

    /**
     * If the model is of Pipeline type then it is the structure of the Pipeline otherwise `nil`.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("pipeline")
    @Nullable
    public native MLModelStructurePipeline pipeline();

    /**
     * If the model is of ML Program type then it is the structure of the ML Program otherwise `nil`.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("program")
    @Nullable
    public native MLModelStructureProgram program();

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