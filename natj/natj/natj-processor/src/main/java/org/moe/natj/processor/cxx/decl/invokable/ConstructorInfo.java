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

package org.moe.natj.processor.cxx.decl.invokable;

import org.moe.natj.processor.cxx.CxxClassInfo;
import org.moe.natj.processor.cxx.CxxType;
import org.moe.natj.processor.cxx.decl.JavaMethod;
import org.moe.natj.processor.cxx.decl.ParamInfo;

import java.util.List;

/**
 * This class represents a C++ constructor.
 */
public class ConstructorInfo extends InvokableInfo {

    /**
     * Class info for class to instantiate.
     */
    private final CxxClassInfo classInfo;

    /**
     * Creates a new ConstructorInfo instance.
     *
     * @param javaMethod Java method
     * @param params     parameter infos
     * @param type       return type
     * @param classInfo  class info for class to instantiate
     */
    protected ConstructorInfo(JavaMethod javaMethod, List<ParamInfo> params, CxxType type, CxxClassInfo classInfo) {
        super(javaMethod, params, type, InvokableKind.CONSTRUCTOR, null, MethodVirtuality.INAPPLICABLE, false);
        if (classInfo == null) {
            throw new NullPointerException();
        }
        this.classInfo = classInfo;
    }

    /**
     * Returns the associated class info.
     *
     * @return class info
     */
    public CxxClassInfo getClassInfo() {
        return classInfo;
    }
}
