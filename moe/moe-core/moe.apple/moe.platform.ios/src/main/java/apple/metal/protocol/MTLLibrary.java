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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLLibrary")
public interface MTLLibrary {
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    Object device();

    @Generated
    @Selector("functionNames")
    NSArray<String> functionNames();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("newFunctionWithName:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newFunctionWithName(String functionName);

    @Generated
    @Selector("newFunctionWithName:constantValues:completionHandler:")
    void newFunctionWithNameConstantValuesCompletionHandler(String name, MTLFunctionConstantValues constantValues,
            @ObjCBlock(name = "call_newFunctionWithNameConstantValuesCompletionHandler") Block_newFunctionWithNameConstantValuesCompletionHandler completionHandler);

    @Generated
    @Selector("newFunctionWithName:constantValues:error:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newFunctionWithNameConstantValuesError(String name, MTLFunctionConstantValues constantValues,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newFunctionWithNameConstantValuesCompletionHandler {
        @Generated
        void call_newFunctionWithNameConstantValuesCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }
}
