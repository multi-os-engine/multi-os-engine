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

package apple.scenekit.protocol;

import apple.foundation.NSDictionary;
import apple.scenekit.SCNNode;
import apple.scenekit.SCNProgram;
import apple.scenekit.SCNRenderer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNShadable")
public interface SCNShadable {
    @Generated
    @IsOptional
    @Selector("handleBindingOfSymbol:usingBlock:")
    default void handleBindingOfSymbolUsingBlock(String symbol,
            @ObjCBlock(name = "call_handleBindingOfSymbolUsingBlock") Block_handleBindingOfSymbolUsingBlock block) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("handleUnbindingOfSymbol:usingBlock:")
    default void handleUnbindingOfSymbolUsingBlock(String symbol,
            @ObjCBlock(name = "call_handleUnbindingOfSymbolUsingBlock") Block_handleUnbindingOfSymbolUsingBlock block) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("program")
    default SCNProgram program() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("setProgram:")
    default void setProgram(SCNProgram value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("setShaderModifiers:")
    default void setShaderModifiers(NSDictionary<String, String> value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("shaderModifiers")
    default NSDictionary<String, String> shaderModifiers() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBindingOfSymbolUsingBlock {
        @Generated
        void call_handleBindingOfSymbolUsingBlock(int arg0, int arg1, SCNNode arg2, SCNRenderer arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleUnbindingOfSymbolUsingBlock {
        @Generated
        void call_handleUnbindingOfSymbolUsingBlock(int arg0, int arg1, SCNNode arg2, SCNRenderer arg3);
    }
}
