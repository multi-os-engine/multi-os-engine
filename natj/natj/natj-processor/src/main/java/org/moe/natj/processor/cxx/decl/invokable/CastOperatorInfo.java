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

import org.moe.natj.processor.cxx.CxxType;
import org.moe.natj.processor.cxx.decl.JavaMethod;
import org.moe.natj.processor.cxx.decl.ParamInfo;

import java.util.List;

/**
 * This class represents a C++ operator.
 */
public class CastOperatorInfo extends InvokableInfo {

    /**
     * Creates a new OperatorInfo instance.
     *
     * @param javaMethod Java method
     * @param params     parameter infos
     * @param type       return type
     * @param kind       invokable kind
     * @param virtuality method virtuality
     * @param isConst    const method
     */
    protected CastOperatorInfo(JavaMethod javaMethod, List<ParamInfo> params, CxxType type, InvokableKind kind,
                               MethodVirtuality virtuality, boolean isConst) {
        super(javaMethod, params, type, kind, null, virtuality, isConst);
        if (kind != InvokableKind.CAST_OPERATOR) {
            throw new IllegalArgumentException("Bad invokable kind for operator");
        }
    }
}
