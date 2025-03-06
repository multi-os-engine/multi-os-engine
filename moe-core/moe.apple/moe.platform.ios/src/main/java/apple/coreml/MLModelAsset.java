package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSDictionary;
import apple.foundation.NSURL;
import org.moe.natj.objc.ann.ObjCBlock;

/**
 * A compiled model asset.
 * 
 * `MLModelAsset` is an abstraction of a compiled model, which can be:
 * 
 * - `.mlmodelc` bundle on the file system
 * - In-memory model specification
 * 
 * It provides the unified interface to query the model description and to instantiate `MLModel`.
 * 
 * ```swift
 * // Creates an object.
 * let modelAsset = MLModelAsset(url: modelURL)
 * 
 * // Query the model description
 * let description = try await modelAsset.modelDescription
 * 
 * // Query the list of functions in the model asset.
 * let functionNames = try await modelAsset.functionNames
 * 
 * // Query the model description of a specific function.
 * let descriptionOfMyFunction = try await modelAsset.modelDescription(of: "MyFunction")
 * 
 * // Instantiate `MLModel` for "MyFunction".
 * let modelConfiguration = MLModelConfiguration()
 * modelConfiguration.functionName = "MyFunction"
 * let model = try await MLModel.load(asset: modelAsset, configuration: modelConfiguration)
 * ```
 * 
 * API-Since: 16.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLModelAsset extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLModelAsset(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLModelAsset alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MLModelAsset allocWithZone(VoidPtr zone);

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
    public native MLModelAsset init();

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
     * Construct a model asset from the contents of specification data.
     * 
     * - Parameters:
     * - specificationData: Contents of .mlmodel as a data blob.
     * - error: When the model asset creation fails error is populated with the reason for failure.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("modelAssetWithSpecificationData:error:")
    public static native MLModelAsset modelAssetWithSpecificationDataError(@NotNull NSData specificationData,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native MLModelAsset new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The list of function names in the model asset.
     * 
     * Some model types (e.g. ML Program) supports multiple functions. Use this method to query the function names.
     * 
     * The method vends the empty array when the model doesn't use the multi-function configuration.
     * 
     * ```swift
     * let modelAsset = try MLModelAsset(url: modelURL)
     * let functionNames = try await modelAsset.functionNames
     * print(functionNames) // For example, ["my_function1", "my_function2"];
     * ```
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("functionNamesWithCompletionHandler:")
    public native void functionNamesWithCompletionHandler(
            @ObjCBlock(name = "call_functionNamesWithCompletionHandler") @NotNull Block_functionNamesWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_functionNamesWithCompletionHandler {
        @Generated
        void call_functionNamesWithCompletionHandler(@Nullable NSArray<String> functionNames, @Nullable NSError error);
    }

    /**
     * Construct a model asset from an ML Program specification by replacing blob file references with corresponding
     * in-memory blobs.
     * 
     * An ML Program may use `BlobFileValue` syntax, which stores the blob data in external files and refers them by
     * URL.
     * This factory method enables in-memory workflow for such models by using the specified in-memory blob data in
     * place of the external files.
     * 
     * The format of in-memory blobs must be the same as the external files. The dictionary must contain all the
     * reference URLs used in the specification.
     * 
     * - Parameters:
     * - specification: Contents of .mlmodel as a data blob.
     * - blobMapping: A dictionary with blob URL as the key and blob data as the value.
     * - error: When the model asset creation fails error is populated with the reason for failure.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("modelAssetWithSpecificationData:blobMapping:error:")
    public static native MLModelAsset modelAssetWithSpecificationDataBlobMappingError(@NotNull NSData specificationData,
            @NotNull NSDictionary<? extends NSURL, ? extends NSData> blobMapping,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Constructs a ModelAsset from a compiled model URL.
     * 
     * - Parameters:
     * - compiledModelURL: Location on the disk where the model asset is present.
     * - error: Errors if the model asset is not loadable.
     * 
     * - Returns: a model asset or nil if there is an error.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("modelAssetWithURL:error:")
    public static native MLModelAsset modelAssetWithURLError(@NotNull NSURL compiledModelURL,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * The model descripton for a specified function.
     * 
     * Use this method to get the description of the model such as the feature descriptions, the model author, and other
     * metadata.
     * 
     * ```swift
     * let modelAsset = try MLModelAsset(url: modelURL)
     * let modelDescription = try await modelAsset.modelDescription(of: "my_function")
     * print(modelDescription)
     * ```
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("modelDescriptionOfFunctionNamed:completionHandler:")
    public native void modelDescriptionOfFunctionNamedCompletionHandler(@NotNull String functionName,
            @ObjCBlock(name = "call_modelDescriptionOfFunctionNamedCompletionHandler") @NotNull Block_modelDescriptionOfFunctionNamedCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modelDescriptionOfFunctionNamedCompletionHandler {
        @Generated
        void call_modelDescriptionOfFunctionNamedCompletionHandler(@Nullable MLModelDescription modelDescription,
                @Nullable NSError error);
    }

    /**
     * The default model descripton.
     * 
     * Use this method to get the description of the model such as the feature descriptions, the model author, and other
     * metadata.
     * 
     * For the multi-function model asset, this method vends the description for the default function. Use
     * `modelDescription(for:)` to get the model description of other functions.
     * 
     * ```swift
     * let modelAsset = try MLModelAsset(url: modelURL)
     * let modelDescription = try await modelAsset.modelDescription()
     * print(modelDescription)
     * ```
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("modelDescriptionWithCompletionHandler:")
    public native void modelDescriptionWithCompletionHandler(
            @ObjCBlock(name = "call_modelDescriptionWithCompletionHandler") @NotNull Block_modelDescriptionWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modelDescriptionWithCompletionHandler {
        @Generated
        void call_modelDescriptionWithCompletionHandler(@Nullable MLModelDescription modelDescription,
                @Nullable NSError error);
    }
}