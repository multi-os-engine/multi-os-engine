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

package org.moe.idea.binding;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;

public interface MOEBindingGenerator {
    String IBACTION_TEMPLATE = "- (IBAction)__METHOD_DEFINITION__;";
    String IBOUTLET_TEMPLATE = "@property (weak, nonatomic) IBOutlet __ELEMENT_TYPE__ *__OUTLET_NAME__;";

    String METHOD_DEFINITION = "__METHOD_DEFINITION__";
    String ELEMENT_TYPE = "__ELEMENT_TYPE__";
    String OUTLET_NAME = "__OUTLET_NAME__";

    String INTERFACE_NAME = "__INTERFACE_NAME__";
    String SUPER_CLASS = "__SUPER_CLASS__";
    String PROJECT_NAME = "__PROJECT_NAME__";
    String OUTLET_DEFINITION = "__OUTLET_DEFINITION__";
    String ACTION_DEFINITION = "__ACTION_DEFINITION__";

    String PBX_REFERENCE_HEADER_TEMPLATE = "__FILE_PBX_ID__ /* __FILE_NAME__ */ = {isa = PBXFileReference; lastKnownFileType = sourcecode.c.h; path = __FILE_NAME__; sourceTree = \"<group>\"; };";
    String PBX_REFERENCE_SOURCE_TEMPLATE = "__FILE_PBX_ID__ /* __FILE_NAME__ */ = {isa = PBXFileReference; lastKnownFileType = sourcecode.c.objc; path = __FILE_NAME__; sourceTree = \"<group>\"; };";
    String FILE_NAME = "__FILE_NAME__";
    String FILE_PBX_ID = "__FILE_PBX_ID__";

    String PBX_GROUP_TEMPLATE = "__FILE_PBX_ID__ = {\n" +
            "      isa = PBXGroup;\n" +
            "      children = (\n" +
            "      __PBX_GROUP_CHILDREN__  \n" +
            "      );\n" +
            "      name = Generated;\n" +
            "      sourceTree = \"<group>\";\n" +
            "    };";
    String PBX_GROUP_CHILDREN = "__PBX_GROUP_CHILDREN__";
    String PBX_GROUP_CHILD = "__FILE_PBX_ID__ /* __FILE_NAME__ */,";

    void generate(DataContext dataContext, String action_title);
    void generate(Module module, VirtualFile file, String action_title);
    void generate(Module module, VirtualFile[] files, String action_title);

    void setPackage(String packageName);
    void createFromPrototype(boolean create);
}
