/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metal.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.metal.MTLFunctionConstantValues;
import apple.metal.MTLFunctionDescriptor;
import apple.metal.MTLIntersectionFunctionDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.metal.MTLFunctionReflection;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLLibrary")
public interface MTLLibrary {
    /**
     * [@property] device
     * 
     * The device this resource was created against. This resource can only be used with this device.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] functionNames
     * 
     * The array contains NSString objects, with the name of each function in library.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("functionNames")
    NSArray<String> functionNames();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * newFunctionWithName
     * 
     * Returns a pointer to a function object, return nil if the function is not found in the library.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("newFunctionWithName:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newFunctionWithName(@NotNull String functionName);

    /**
     * newFunctionWithName:constantValues:completionHandler:
     * 
     * Returns a pointer to a function object obtained by applying the constant values to the named function.
     * 
     * This method is asynchronous since it is will call the compiler.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("newFunctionWithName:constantValues:completionHandler:")
    void newFunctionWithNameConstantValuesCompletionHandler(@NotNull String name,
            @NotNull MTLFunctionConstantValues constantValues,
            @NotNull @ObjCBlock(name = "call_newFunctionWithNameConstantValuesCompletionHandler") Block_newFunctionWithNameConstantValuesCompletionHandler completionHandler);

    /**
     * newFunctionWithName:constantValues:error:
     * 
     * Returns a pointer to a function object obtained by applying the constant values to the named function.
     * 
     * This method will call the compiler. Use newFunctionWithName:constantValues:completionHandler: to
     * avoid waiting on the compiler.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("newFunctionWithName:constantValues:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newFunctionWithNameConstantValuesError(@NotNull String name,
            @NotNull MTLFunctionConstantValues constantValues,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newFunctionWithNameConstantValuesCompletionHandler {
        @Generated
        void call_newFunctionWithNameConstantValuesCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) MTLFunction function, @Nullable NSError error);
    }

    /**
     * [@property] installName
     * 
     * The installName provided when this MTLLibrary was created.
     * 
     * Always nil if the type of the library is not MTLLibraryTypeDynamic.
     * 
     * @see MTLCompileOptions
     * 
     *      API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("installName")
    String installName();

    /**
     * newFunctionWithDescriptor:completionHandler:
     * 
     * Create a new MTLFunction object asynchronously.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("newFunctionWithDescriptor:completionHandler:")
    void newFunctionWithDescriptorCompletionHandler(@NotNull MTLFunctionDescriptor descriptor,
            @NotNull @ObjCBlock(name = "call_newFunctionWithDescriptorCompletionHandler") Block_newFunctionWithDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newFunctionWithDescriptorCompletionHandler {
        @Generated
        void call_newFunctionWithDescriptorCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) MTLFunction function, @Nullable NSError error);
    }

    /**
     * newFunctionWithDescriptor:error:
     * 
     * Create a new MTLFunction object synchronously.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newFunctionWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newFunctionWithDescriptorError(@NotNull MTLFunctionDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newIntersectionFunctionWithDescriptor:completionHandler:
     * 
     * Create a new MTLFunction object asynchronously.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("newIntersectionFunctionWithDescriptor:completionHandler:")
    void newIntersectionFunctionWithDescriptorCompletionHandler(@NotNull MTLIntersectionFunctionDescriptor descriptor,
            @NotNull @ObjCBlock(name = "call_newIntersectionFunctionWithDescriptorCompletionHandler") Block_newIntersectionFunctionWithDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newIntersectionFunctionWithDescriptorCompletionHandler {
        @Generated
        void call_newIntersectionFunctionWithDescriptorCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) MTLFunction function, @Nullable NSError error);
    }

    /**
     * newIntersectionFunctionWithDescriptor:error:
     * 
     * Create a new MTLFunction object synchronously.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newIntersectionFunctionWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newIntersectionFunctionWithDescriptorError(@NotNull MTLIntersectionFunctionDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] type
     * 
     * The library type provided when this MTLLibrary was created.
     * Libraries with MTLLibraryTypeExecutable can be used to obtain MTLFunction from.
     * Libraries with MTLLibraryTypeDynamic can be used to resolve external references in other MTLLibrary from.
     * 
     * @see MTLCompileOptions
     * 
     *      API-Since: 14.0
     */
    @Generated
    @Selector("type")
    @NInt
    long type();

    /**
     * Retrieves reflection information for a function in the library.
     * 
     * - Parameters:
     * - functionName: The name of a GPU function in the library.
     * The name needs to match one of the elements in the string array of library's ``functionNames`` property.
     * 
     * - Returns: An `MTLFunctionReflection` instance when the method succeeds; otherwise `nil`.
     * 
     * The reflection instance contains metadata information about a specific GPU function,
     * which can include:
     * * Function parameters
     * * Return types
     * * Bindings
     * * Annotations from a developer, if available
     * 
     * - Note: The Metal compiler generates the function's reflection information
     * when you or Xcode build the library.
     * 
     * The method only returns reflection information if all of the following conditions apply:
     * * The library has a function with a name that matches `functionName`.
     * * The deployment target is macOS 13.0 or later, or iOS 16.0 or later, or visionOS 2.0 or later.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reflectionForFunctionWithName:")
    @Nullable
    MTLFunctionReflection reflectionForFunctionWithName(@NotNull String functionName);
}
