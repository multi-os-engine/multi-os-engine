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
import org.moe.natj.processor.cxx.decl.DeclInfo;
import org.moe.natj.processor.cxx.decl.IKindInfo;
import org.moe.natj.processor.cxx.decl.JavaMethod;
import org.moe.natj.processor.cxx.decl.ParamInfo;

import java.util.List;

/**
 * This class is a base class for all invokable declarations.
 */
public class InvokableInfo extends DeclInfo {

    /**
     * Kind.
     */
    private final InvokableKind kind;

    /**
     * C++ identifier or null if getName() should provide this value.
     */
    private final String explicitNativeID;

    /**
     * Method virtuality.
     */
    private final MethodVirtuality virtuality;

    /**
     * Constant method.
     */
    private final boolean isConst;

    /**
     * Creates a new InvokableInfo instance.
     *
     * @param javaMethod       Java method
     * @param params           parameter infos
     * @param type             return type
     * @param kind             invokable kind
     * @param explicitNativeID optional explicit native ID
     * @param virtuality       method virtuality
     * @param isConst          const method
     */
    protected InvokableInfo(JavaMethod javaMethod, List<ParamInfo> params, CxxType type, InvokableKind kind,
                            String explicitNativeID, MethodVirtuality virtuality, boolean isConst) {
        super(javaMethod, params, type);
        if (kind == null) {
            throw new NullPointerException();
        }
        if (virtuality == null) {
            throw new NullPointerException();
        }
        this.kind = kind;
        this.explicitNativeID = explicitNativeID;
        this.virtuality = virtuality;
        this.isConst = isConst;
    }

    /**
     * Creates a new function info instance.
     *
     * @param javaMethod       Java method
     * @param params           parameter infos
     * @param type             return type
     * @param explicitNativeID optional explicit native ID
     * @return new function info instance
     */
    public static InvokableInfo createFunction(JavaMethod javaMethod, List<ParamInfo> params, CxxType type,
                                               String explicitNativeID) {
        return new InvokableInfo(javaMethod, params, type, InvokableKind.FUNCTION, explicitNativeID,
                MethodVirtuality.INAPPLICABLE, false);
    }

    /**
     * Creates a new operator function info instance.
     *
     * @param javaMethod   Java method
     * @param params       parameter infos
     * @param type         return type
     * @param operatorKind operator operatorKind
     * @return new operator function info instance
     */
    public static OperatorInfo createOperatorFunction(JavaMethod javaMethod, List<ParamInfo> params,
                                                      CxxType type, OperatorKind operatorKind) {
        return new OperatorInfo(javaMethod, params, type, InvokableKind.OPERATOR_FUNCTION,
                MethodVirtuality.INAPPLICABLE, operatorKind, false);
    }

    /**
     * Creates a new constructor info instance.
     *
     * @param javaMethod Java method
     * @param params     parameter infos
     * @param type       return type
     * @param classInfo  class info
     * @return new constructor info instance
     */
    public static ConstructorInfo createConstructor(JavaMethod javaMethod, List<ParamInfo> params, CxxType type,
                                                    CxxClassInfo classInfo) {
        return new ConstructorInfo(javaMethod, params, type, classInfo);
    }

    /**
     * Creates a new instance method info instance.
     *
     * @param javaMethod       Java method
     * @param params           parameter infos
     * @param type             return type
     * @param explicitNativeID optional explicit native ID
     * @param virtuality       method virtuality
     * @param isConst          const method
     * @return new instance method info instance
     */
    public static InvokableInfo createInstanceMethod(JavaMethod javaMethod, List<ParamInfo> params, CxxType type,
                                                     String explicitNativeID, MethodVirtuality virtuality,
                                                     boolean isConst) {
        if (virtuality == MethodVirtuality.INAPPLICABLE) {
            throw new IllegalArgumentException();
        }
        return new InvokableInfo(javaMethod, params, type, InvokableKind.INSTANCE_METHOD, explicitNativeID,
                virtuality, isConst);
    }

    /**
     * Creates a new class method info instance.
     *
     * @param javaMethod       Java method
     * @param params           parameter infos
     * @param type             return type
     * @param explicitNativeID optional explicit native ID
     * @return new class method info instance
     */
    public static InvokableInfo createClassMethod(JavaMethod javaMethod, List<ParamInfo> params, CxxType type,
                                                  String explicitNativeID) {
        return new InvokableInfo(javaMethod, params, type, InvokableKind.CLASS_METHOD, explicitNativeID,
                MethodVirtuality.INAPPLICABLE, false);
    }

    /**
     * Creates a new operator info instance.
     *
     * @param javaMethod   Java method
     * @param params       parameter infos
     * @param type         return type
     * @param virtuality   method virtuality
     * @param operatorKind operator operatorKind
     * @param isConst      const method
     * @return new operator info instance
     */
    public static OperatorInfo createOperator(JavaMethod javaMethod, List<ParamInfo> params, CxxType type,
                                              MethodVirtuality virtuality, OperatorKind operatorKind, boolean isConst) {
        if (virtuality == MethodVirtuality.INAPPLICABLE) {
            throw new IllegalArgumentException();
        }
        return new OperatorInfo(javaMethod, params, type, InvokableKind.OPERATOR, virtuality, operatorKind, isConst);
    }

    /**
     * Creates a new cast operator info instance.
     *
     * @param javaMethod Java method
     * @param params     parameter infos
     * @param type       return type
     * @param virtuality method virtuality
     * @param isConst    const method
     * @return new cast operator info instance
     */
    public static CastOperatorInfo createCastOperator(JavaMethod javaMethod, List<ParamInfo> params, CxxType type,
                                                      MethodVirtuality virtuality, boolean isConst) {
        if (virtuality == MethodVirtuality.INAPPLICABLE) {
            throw new IllegalArgumentException();
        }
        return new CastOperatorInfo(javaMethod, params, type, InvokableKind.CAST_OPERATOR, virtuality, isConst);
    }

    /**
     * Returns the invokable's kind.
     *
     * @return kind
     */
    public final InvokableKind getKind() {
        return kind;
    }

    /**
     * Returns the identifier to be used by the native code.
     *
     * @return native identifier
     */
    public final String getNativeIdentifier() {
        return explicitNativeID == null ? getName() : explicitNativeID;
    }

    /**
     * Returns the method's virtuality.
     *
     * @return virtuality
     */
    public final MethodVirtuality getVirtuality() {
        return virtuality;
    }

    /**
     * Tells whether of not the method is const or not.
     *
     * @return true if method is const, otherwise false
     */
    public boolean isConst() {
        return isConst;
    }

    @Override
    public final IKindInfo getKindInfo() {
        return kind;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof InvokableInfo)) {
            return false;
        }

        InvokableInfo that = (InvokableInfo) o;
        return getJavaStaticStubMethodName().equals(that.getJavaStaticStubMethodName());
    }

    @Override
    public final int hashCode() {
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
