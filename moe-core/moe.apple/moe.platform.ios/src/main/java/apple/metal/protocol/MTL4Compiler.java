package apple.metal.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.metal.MTL4BinaryFunctionDescriptor;
import apple.metal.MTL4CompilerTaskOptions;
import apple.metal.MTL4ComputePipelineDescriptor;
import apple.metal.MTL4LibraryDescriptor;
import apple.metal.MTL4MachineLearningPipelineDescriptor;
import apple.metal.MTL4PipelineDescriptor;
import apple.metal.MTL4PipelineStageDynamicLinkingDescriptor;
import apple.metal.MTL4RenderPipelineDynamicLinkingDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A abstraction for a pipeline state and shader function compiler.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4Compiler")
public interface MTL4Compiler {
    /**
     * Returns the device that this compiler belongs to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * Returns the optional label you specify at creation time.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Returns a new compiler task that asyncrhonously creates a binary version
     * of a GPU visible function or GPU intersection function.
     * 
     * - Parameters:
     * - descriptor: A configuration that tells the method which GPU function to
     * make into a binary function and which options to apply when compiling it.
     * - compilerTaskOptions: A configuration for the compiler task.
     * - completionHandler: A completetion handler that you provide, which the task calls
     * when it finishes compiling the binary function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newBinaryFunctionWithDescriptor:compilerTaskOptions:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newBinaryFunctionWithDescriptorCompilerTaskOptionsCompletionHandler(
            @NotNull MTL4BinaryFunctionDescriptor descriptor, @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ObjCBlock(name = "call_newBinaryFunctionWithDescriptorCompilerTaskOptionsCompletionHandler") @NotNull Block_newBinaryFunctionWithDescriptorCompilerTaskOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newBinaryFunctionWithDescriptorCompilerTaskOptionsCompletionHandler {
        @Generated
        void call_newBinaryFunctionWithDescriptorCompilerTaskOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTL4BinaryFunction function, @Nullable NSError error);
    }

    /**
     * Creates a new binary visible or intersection function synchronously.
     * 
     * - Parameters:
     * - descriptor: A binary function descriptor to use for creating the binary function.
     * - compilerTaskOptions: A descriptor of the compilation itself, providing parameters that
     * influence execution of the compilation process.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: a new binary function upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newBinaryFunctionWithDescriptor:compilerTaskOptions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4BinaryFunction newBinaryFunctionWithDescriptorCompilerTaskOptionsError(
            @NotNull MTL4BinaryFunctionDescriptor descriptor, @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new compute pipeline state asynchronously.
     * 
     * - Parameters:
     * - descriptor: A compute pipeline state descriptor, describing the compute pipeline to create.
     * - compilerTaskOptions: A descriptor of the compilation itself, providing parameters that
     * influence execution of the compilation process.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:compilerTaskOptions:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newComputePipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler(
            @NotNull MTL4ComputePipelineDescriptor descriptor, @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ObjCBlock(name = "call_newComputePipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler") @NotNull Block_newComputePipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLComputePipelineState computePipelineState,
                @Nullable NSError error);
    }

    /**
     * Creates a new compute pipeline state object synchronously.
     * 
     * - Parameters:
     * - descriptor: A compute pipeline state descriptor describing the pipeline this compiler creates.
     * - compilerTaskOptions: A description of the compilation process itself, providing parameters that
     * influence execution of the compilation process.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: A new compute pipeline state object upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:compilerTaskOptions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLComputePipelineState newComputePipelineStateWithDescriptorCompilerTaskOptionsError(
            @NotNull MTL4ComputePipelineDescriptor descriptor, @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new compute pipeline state asynchronously.
     * 
     * - Parameters:
     * - descriptor: A compute pipeline state descriptor, describing the compute pipeline to create.
     * - dynamicLinkingDescriptor: An optional parameter that provides additional configuration for linking the pipeline
     * state object.
     * - compilerTaskOptions: A description of the compilation process itself, providing parameters that
     * influence execution of the compilation process.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newComputePipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler(
            @NotNull MTL4ComputePipelineDescriptor descriptor,
            @Nullable MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor,
            @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ObjCBlock(name = "call_newComputePipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler") @NotNull Block_newComputePipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLComputePipelineState computePipelineState,
                @Nullable NSError error);
    }

    /**
     * Creates a new compute pipeline state synchronously.
     * 
     * - Parameters:
     * - descriptor: A compute pipeline state descriptor describing the pipeline this compiler creates.
     * - dynamicLinkingDescriptor: An optional parameter that provides additional configuration for linking the pipeline
     * state object.
     * - compilerTaskOptions: A description of the compilation process itself, providing parameters that
     * influence execution of the compilation process.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: A new compute pipeline state object upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLComputePipelineState newComputePipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsError(
            @NotNull MTL4ComputePipelineDescriptor descriptor,
            @Nullable MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor,
            @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new dynamic Metal library instance asynchronously.
     * 
     * - Parameters:
     * - library: A library from which this compiler creates the new a dynamic library
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: A compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newDynamicLibrary:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newDynamicLibraryCompletionHandler(@Mapped(ObjCObjectMapper.class) @NotNull MTLLibrary library,
            @ObjCBlock(name = "call_newDynamicLibraryCompletionHandler") @NotNull Block_newDynamicLibraryCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newDynamicLibraryCompletionHandler {
        @Generated
        void call_newDynamicLibraryCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLDynamicLibrary library, @Nullable NSError error);
    }

    /**
     * Creates a new dynamic library from a library containing Metal IR code synchronously.
     * 
     * - Parameters:
     * - library: A library from which this compiler creates the new a dynamic library
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: A new dynamic Metal library upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newDynamicLibrary:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLDynamicLibrary newDynamicLibraryError(@Mapped(ObjCObjectMapper.class) @NotNull MTLLibrary library,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new dynamic library from the contents of a file at an URL location synchronously.
     * 
     * - Parameters:
     * - url: An URL referencing a file whose contents this compiler uses to build a dynamic library.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newDynamicLibraryWithURL:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newDynamicLibraryWithURLCompletionHandler(@NotNull NSURL url,
            @ObjCBlock(name = "call_newDynamicLibraryWithURLCompletionHandler") @NotNull Block_newDynamicLibraryWithURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newDynamicLibraryWithURLCompletionHandler {
        @Generated
        void call_newDynamicLibraryWithURLCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLDynamicLibrary library, @Nullable NSError error);
    }

    /**
     * Creates a new dynamic library from the contents of a file at an URL location synchronously.
     * 
     * - Parameters:
     * - url: An URL referencing a file whose contents this compiler uses to build a dynamic library.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: A new dynamic Metal library upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newDynamicLibraryWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLDynamicLibrary newDynamicLibraryWithURLError(@NotNull NSURL url,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new Metal library instance asynchronously.
     * 
     * - Parameters:
     * - descriptor: A description of the library to create.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newLibraryWithDescriptor:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newLibraryWithDescriptorCompletionHandler(@NotNull MTL4LibraryDescriptor descriptor,
            @ObjCBlock(name = "call_newLibraryWithDescriptorCompletionHandler") @NotNull Block_newLibraryWithDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newLibraryWithDescriptorCompletionHandler {
        @Generated
        void call_newLibraryWithDescriptorCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLLibrary library, @Nullable NSError error);
    }

    /**
     * Creates a new Metal library synchronously.
     * 
     * - Parameters:
     * - descriptor: A description of the library to create.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: a Metal library instance upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newLibraryWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLLibrary newLibraryWithDescriptorError(@NotNull MTL4LibraryDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new machine learning pipeline state asynchronously.
     * 
     * - Parameters:
     * - descriptor: A machine learning pipeline state descriptor to use for creating the new pipeline state.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newMachineLearningPipelineStateWithDescriptor:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newMachineLearningPipelineStateWithDescriptorCompletionHandler(
            @NotNull MTL4MachineLearningPipelineDescriptor descriptor,
            @ObjCBlock(name = "call_newMachineLearningPipelineStateWithDescriptorCompletionHandler") @NotNull Block_newMachineLearningPipelineStateWithDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newMachineLearningPipelineStateWithDescriptorCompletionHandler {
        @Generated
        void call_newMachineLearningPipelineStateWithDescriptorCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTL4MachineLearningPipelineState mlPipelineState,
                @Nullable NSError error);
    }

    /**
     * Creates a new ML pipeline state with descriptor.
     * 
     * - Parameters:
     * - descriptor: A machine learning pipeline state descriptor to use for creating the new pipeline state.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: A machine learning pipeline state if operation is successful, otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newMachineLearningPipelineStateWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4MachineLearningPipelineState newMachineLearningPipelineStateWithDescriptorError(
            @NotNull MTL4MachineLearningPipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new render pipeline state from another, previously unspecialized, pipeline state
     * 
     * Metal specializes the pipeline state with new state values the descriptor provides, observing the following
     * rules:
     * * The compiler only updates properties that were originally specified as *unspecialized*. It doesn't modify other
     * already-specialized properties
     * * The compiler sets to their default behavior any unspecialized properties that your passed-in descriptor doesn't
     * specialize
     * 
     * Additionally, there are some cases where the Metal can't specialize a pipeline:
     * * If the original pipeline state object doesn't have any unspecialized properties
     * * You can't re-specialize a previously specialized pipeline state object
     * 
     * - Parameters:
     * - descriptor: A render pipeline state descriptor or any type: default, tile, or mesh render pipeline descriptor.
     * - pipeline: A render pipeline state containing unspecialized substate.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateBySpecializationWithDescriptor:pipeline:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newRenderPipelineStateBySpecializationWithDescriptorPipelineCompletionHandler(
            @NotNull MTL4PipelineDescriptor descriptor,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLRenderPipelineState pipeline,
            @ObjCBlock(name = "call_newRenderPipelineStateBySpecializationWithDescriptorPipelineCompletionHandler") @NotNull Block_newRenderPipelineStateBySpecializationWithDescriptorPipelineCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateBySpecializationWithDescriptorPipelineCompletionHandler {
        @Generated
        void call_newRenderPipelineStateBySpecializationWithDescriptorPipelineCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLRenderPipelineState renderPipelineState,
                @Nullable NSError error);
    }

    /**
     * Creates a new render pipeline state from another, previously unspecialized, pipeline state.
     * 
     * Metal specializes the pipeline state with new state values the descriptor provides, observing the following
     * rules:
     * * The compiler only updates properties that were originally specified as *unspecialized*. It doesn't modify other
     * already-specialized properties
     * * The compiler sets to their default behavior any unspecialized properties that your passed-in descriptor doesn't
     * specialize
     * 
     * Additionally, there are some cases where the Metal can't specialize a pipeline:
     * * If the original pipeline state object doesn't have any unspecialized properties
     * * You can't re-specialize a previously specialized pipeline state object
     * 
     * - Parameters:
     * - descriptor: A render pipeline state descriptor or any type: default, tile, or mesh render pipeline descriptor.
     * - pipeline: A render pipeline state containing unspecialized substate.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: a fully-specialized pipeline state object.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateBySpecializationWithDescriptor:pipeline:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLRenderPipelineState newRenderPipelineStateBySpecializationWithDescriptorPipelineError(
            @NotNull MTL4PipelineDescriptor descriptor,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLRenderPipelineState pipeline,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new render pipeline state asynchronously.
     * 
     * Use this method to build any render pipeline type, including render, tile, and mesh render pipeline states.
     * The type of the descriptor you pass indicates the pipeline type this method builds.
     * 
     * Passing in a compute pipeline descriptor to the `descriptor` parameter produces an error.
     * 
     * - Parameters:
     * - descriptor: A render, tile, or mesh pipeline state descriptor that describes the pipeline to create.
     * - compilerTaskOptions: A description of the compilation process itself, providing parameters that
     * influence execution of the compilation process.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:compilerTaskOptions:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newRenderPipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler(
            @NotNull MTL4PipelineDescriptor descriptor, @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler") @NotNull Block_newRenderPipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithDescriptorCompilerTaskOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLRenderPipelineState renderPipelineState,
                @Nullable NSError error);
    }

    /**
     * Creates a new render pipeline state synchronously.
     * 
     * Use this method to build any render pipeline type, including render, tile, and mesh render pipeline states.
     * The type of the descriptor you pass indicates the pipeline type this method builds.
     * 
     * Passing in a compute pipeline descriptor to the `descriptor` parameter produces an error.
     * 
     * - Parameters:
     * - descriptor: A render, tile, or mesh pipeline state descriptor that describes the pipeline to create.
     * - compilerTaskOptions: A description of the compilation process itself, providing parameters that
     * influence execution of the compilation process.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: A new render pipeline state object upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:compilerTaskOptions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorCompilerTaskOptionsError(
            @NotNull MTL4PipelineDescriptor descriptor, @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a new render pipeline state asynchronously.
     * 
     * Use this method to build any render pipeline type, including render, tile, and mesh render pipeline states.
     * The type of the descriptor you pass indicates the pipeline type this method builds.
     * 
     * Passing in a compute pipeline descriptor to the `descriptor` parameter produces an error.
     * 
     * - Parameters:
     * - descriptor: A render, tile, or mesh pipeline state descriptor that describes the pipeline to create.
     * - dynamicLinkingDescriptor: An optional parameter that provides additional configuration for linking the pipeline
     * state object.
     * - compilerTaskOptions: A description of the compilation process itself, providing parameters that
     * influence execution of the compilation process.
     * - completionHandler: A block Metal calls when it finishes the build task.
     * 
     * - Returns: a compiler task representing the asynchronous compilation task.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4CompilerTask newRenderPipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler(
            @NotNull MTL4PipelineDescriptor descriptor,
            @Nullable MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor,
            @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler") @NotNull Block_newRenderPipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable MTLRenderPipelineState renderPipelineState,
                @Nullable NSError error);
    }

    /**
     * Creates a new render pipeline state synchronously.
     * 
     * Use this method to build any render pipeline type, including render, tile, and mesh render pipeline states.
     * The type of the descriptor you pass indicates the pipeline type this method builds.
     * 
     * Passing in a compute pipeline descriptor to the `descriptor` parameter produces an error.
     * 
     * - Parameters:
     * - descriptor: A render, tile, or mesh pipeline state descriptor that describes the pipeline to create.
     * - dynamicLinkingDescriptor: An optional parameter that provides additional configuration for linking the pipeline
     * state object.
     * - compilerTaskOptions: A description of the compilation process itself, providing parameters that
     * influence execution of the compilation process.
     * - error: An optional parameter into which Metal stores information in case of an error.
     * 
     * - Returns: A new render pipeline state object upon success, `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorDynamicLinkingDescriptorCompilerTaskOptionsError(
            @NotNull MTL4PipelineDescriptor descriptor,
            @Nullable MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor,
            @Nullable MTL4CompilerTaskOptions compilerTaskOptions,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Returns the pipeline data set serializer into which this compiler stores data for all pipelines it creates.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("pipelineDataSetSerializer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4PipelineDataSetSerializer pipelineDataSetSerializer();
}