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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLLibrary")
public interface MTLLibrary {
    /**
     * @property device
     * @abstract The device this resource was created against.  This resource can only be used with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * @property functionNames
     * @abstract The array contains NSString objects, with the name of each function in library.
     */
    @Generated
    @Selector("functionNames")
    NSArray<String> functionNames();

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * @method newFunctionWithName
     * @abstract Returns a pointer to a function object, return nil if the function is not found in the library.
     */
    @Generated
    @Selector("newFunctionWithName:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newFunctionWithName(String functionName);

    /**
     * @method newFunctionWithName:constantValues:completionHandler:
     * @abstract Returns a pointer to a function object obtained by applying the constant values to the named function.
     * @discussion This method is asynchronous since it is will call the compiler.
     */
    @Generated
    @Selector("newFunctionWithName:constantValues:completionHandler:")
    void newFunctionWithNameConstantValuesCompletionHandler(String name, MTLFunctionConstantValues constantValues,
            @ObjCBlock(name = "call_newFunctionWithNameConstantValuesCompletionHandler") Block_newFunctionWithNameConstantValuesCompletionHandler completionHandler);

    /**
     * @method newFunctionWithName:constantValues:error:
     * @abstract Returns a pointer to a function object obtained by applying the constant values to the named function.
     * @discussion This method will call the compiler. Use newFunctionWithName:constantValues:completionHandler: to
     * avoid waiting on the compiler.
     */
    @Generated
    @Selector("newFunctionWithName:constantValues:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newFunctionWithNameConstantValuesError(String name, MTLFunctionConstantValues constantValues,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newFunctionWithNameConstantValuesCompletionHandler {
        @Generated
        void call_newFunctionWithNameConstantValuesCompletionHandler(@Mapped(ObjCObjectMapper.class) Object function,
                NSError error);
    }

    /**
     * @property installName
     * @abstract The installName provided when this MTLLibrary was created.
     * @discussion Always nil if the type of the library is not MTLLibraryTypeDynamic.
     * @see MTLCompileOptions
     */
    @Generated
    @Selector("installName")
    String installName();

    /**
     * @method newFunctionWithDescriptor:completionHandler:
     * @abstract Create a new MTLFunction object asynchronously.
     */
    @Generated
    @Selector("newFunctionWithDescriptor:completionHandler:")
    void newFunctionWithDescriptorCompletionHandler(MTLFunctionDescriptor descriptor,
            @ObjCBlock(name = "call_newFunctionWithDescriptorCompletionHandler") Block_newFunctionWithDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newFunctionWithDescriptorCompletionHandler {
        @Generated
        void call_newFunctionWithDescriptorCompletionHandler(@Mapped(ObjCObjectMapper.class) Object function,
                NSError error);
    }

    /**
     * @method newFunctionWithDescriptor:error:
     * @abstract Create  a new MTLFunction object synchronously.
     */
    @Generated
    @Selector("newFunctionWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newFunctionWithDescriptorError(MTLFunctionDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @method newIntersectionFunctionWithDescriptor:completionHandler:
     * @abstract Create a new MTLFunction object asynchronously.
     */
    @Generated
    @Selector("newIntersectionFunctionWithDescriptor:completionHandler:")
    void newIntersectionFunctionWithDescriptorCompletionHandler(MTLIntersectionFunctionDescriptor descriptor,
            @ObjCBlock(name = "call_newIntersectionFunctionWithDescriptorCompletionHandler") Block_newIntersectionFunctionWithDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newIntersectionFunctionWithDescriptorCompletionHandler {
        @Generated
        void call_newIntersectionFunctionWithDescriptorCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object function, NSError error);
    }

    /**
     * @method newIntersectionFunctionWithDescriptor:error:
     * @abstract Create  a new MTLFunction object synchronously.
     */
    @Generated
    @Selector("newIntersectionFunctionWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction newIntersectionFunctionWithDescriptorError(MTLIntersectionFunctionDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @property type
     * @abstract The library type provided when this MTLLibrary was created.
     * Libraries with MTLLibraryTypeExecutable can be used to obtain MTLFunction from.
     * Libraries with MTLLibraryTypeDynamic can be used to resolve external references in other MTLLibrary from.
     * @see MTLCompileOptions
     */
    @Generated
    @Selector("type")
    @NInt
    long type();
}
