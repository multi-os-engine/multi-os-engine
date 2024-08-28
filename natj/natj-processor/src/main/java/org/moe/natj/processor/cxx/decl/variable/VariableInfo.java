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

package org.moe.natj.processor.cxx.decl.variable;

import org.moe.natj.processor.cxx.CxxType;
import org.moe.natj.processor.cxx.decl.DeclInfo;
import org.moe.natj.processor.cxx.decl.IKindInfo;
import org.moe.natj.processor.cxx.decl.JavaMethod;
import org.moe.natj.processor.cxx.decl.ParamInfo;

import java.util.List;

/**
 * This class represents any kind of variable. This may be a global variable, static class variable or a class field.
 */
public class VariableInfo extends DeclInfo {

    /**
     * Variable kind.
     */
    private final VariableKind kind;

    /**
     * C++ identifier or null if getName() should provide this value.
     */
    private final String explicitNativeID;

    /**
     * Mutable field.
     */
    public final boolean isMutable;

    /**
     * Creates a new VariableInfo instance.
     *
     * @param javaMethod       Java method
     * @param params           parameter infos
     * @param type             return type
     * @param kind             variable kind
     * @param explicitNativeID optional explicit native ID
     * @param isMutable        field is marked as mutable
     */
    public VariableInfo(JavaMethod javaMethod, List<ParamInfo> params, CxxType type, VariableKind kind,
                        String explicitNativeID, boolean isMutable) {
        super(javaMethod, params, type);
        if (kind == null) {
            throw new NullPointerException();
        }
        this.kind = kind;
        this.explicitNativeID = explicitNativeID;
        this.isMutable = isMutable;
    }

    /**
     * Returns the variable's kind.
     *
     * @return kind
     */
    public VariableKind getKind() {
        return kind;
    }

    /**
     * Returns the identifier to be used by the native code.
     *
     * @return native identifier
     */
    public String getNativeIdentifier() {
        return explicitNativeID == null ? getName() : explicitNativeID;
    }

    @Override
    public IKindInfo getKindInfo() {
        return kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VariableInfo that = (VariableInfo) o;
        return getJavaStaticStubMethodName().equals(that.getJavaStaticStubMethodName());
    }

    @Override
    public int hashCode() {
        return getKind().hashCode();
    }

    @Override
    public String toString() {
        return kind.category + " { " +
                "name: " + getName() +
                ", desc: " + getDesc() +
                (explicitNativeID == null ? "" : (", native: " + explicitNativeID)) +
                " }";
    }
}
