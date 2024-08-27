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

package org.moe.natj.processor.cxx.decl;

import org.moe.natj.processor.cxx.CxxType;
import org.moe.natj.processor.cxx.CxxUtils;
import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is the base for all declaration classes. It contains all information common in all subclasses.
 */
public abstract class DeclInfo {

    /**
     * Original Java method.
     */
    private final JavaMethod javaMethod;

    /**
     * Parameters.
     */
    private final List<ParamInfo> params;

    /**
     * Return type.
     */
    private final CxxType type;

    /**
     * Static Java stub's method name.
     */
    private String javaStaticStubMethodName;

    /**
     * Static Java bridge stub's method name.
     */
    private String javaStaticBridgeStubMethodName;

    /**
     * Static Java stub's method type.
     */
    private Type javaStaticStubMethodType;

    /**
     * Creates a new DeclInfo instance.
     *
     * @param javaMethod Java method
     * @param params     parameter infos
     * @param type       return type
     */
    public DeclInfo(JavaMethod javaMethod, List<ParamInfo> params, CxxType type) {
        if (javaMethod == null) {
            throw new NullPointerException();
        }
        if (params == null) {
            throw new NullPointerException();
        }
        if (type == null) {
            throw new NullPointerException();
        }
        this.javaMethod = javaMethod;
        this.params = params;
        this.type = type;

        // NOTE: we have some assertions, make sure they are present
        // TODO: only allow in dev builds!
        try {
            params.add(new ParamInfo(CxxType.fromType(Type.VOID_TYPE, null, null)));
            throw new IllegalStateException();
        } catch (UnsupportedOperationException ignore) {
        }
    }

    /**
     * Returns the Java method access flags.
     *
     * @return access flags
     */
    public final int getAccess() {
        return javaMethod.access;
    }

    /**
     * Returns the Java method name.
     *
     * @return method name
     */
    public final String getName() {
        return javaMethod.name;
    }

    /**
     * Returns the Java method descriptor.
     *
     * @return method descriptor
     */
    public final Type getDesc() {
        return javaMethod.desc;
    }

    /**
     * Returns the parameter infos.
     *
     * @return parameter infos
     */
    public final List<ParamInfo> getParams() {
        return params;
    }

    /**
     * Returns the return type.
     *
     * @return return type
     */
    public final CxxType getType() {
        return type;
    }

    /**
     * Static Java stub's method name.
     *
     * @return static Java stub's method name
     */
    public final String getJavaStaticStubMethodName() {
        if (javaStaticStubMethodName == null) {
            synchronized (this) {
                if (javaStaticStubMethodName == null) {
                    try {
                        javaStaticStubMethodName = CxxUtils.getStaticStubName(this, false);
                    } catch (Throwable e) {
                        throw new RuntimeException("'getStaticStubName' failed for " +
                                javaMethod.name + "." + javaMethod.desc, e);
                    }
                }
            }
        }
        return javaStaticStubMethodName;
    }

    /**
     * Static Java stub's method name.
     *
     * @return static Java stub's method name
     */
    public final String getJavaStaticBridgeStubMethodName() {
        if (javaStaticBridgeStubMethodName == null) {
            synchronized (this) {
                if (javaStaticBridgeStubMethodName == null) {
                    try {
                        javaStaticBridgeStubMethodName = CxxUtils.getStaticStubName(this, true);
                    } catch (Throwable e) {
                        throw new RuntimeException("'getStaticStubName' failed for " +
                                javaMethod.name + "." + javaMethod.desc, e);
                    }
                }
            }
        }
        return javaStaticBridgeStubMethodName;
    }

    /**
     * Static Java stub's method type.
     *
     * @return static Java stub's method type
     */
    public final Type getJavaStaticStubMethodType() {
        if (javaStaticStubMethodType == null) {
            synchronized (this) {
                if (javaStaticStubMethodType == null) {
                    javaStaticStubMethodType = createMethodTypeForStaticStub();
                }
            }
        }
        return javaStaticStubMethodType;
    }

    /**
     * Returns the IKindInfo interface.
     *
     * @return IKindInfo interface
     */
    public abstract IKindInfo getKindInfo();

    /**
     * Returns the parameter types.
     *
     * @return parameter types
     */
    public CxxType[] getParamTypes() {
        CxxType[] paramsT = new CxxType[params.size()];
        int index = 0;
        for (ParamInfo param : params) {
            paramsT[index++] = param.getType();
        }
        return paramsT;
    }

    @Override
    public String toString() {
        return getName() + getDesc();
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    /**
     * Creates the method type for the static stub.
     *
     * @return static stub's method type
     */
    private Type createMethodTypeForStaticStub() {
        ArrayList<Type> args = new ArrayList<>();
        if (getKindInfo().isClassMember()) {
            args.add(Type.LONG_TYPE);
        }
        args.addAll(getParams()
                .stream()
                .map(param -> param.getType().getJNIType())
                .collect(Collectors.toList()));
        return Type.getMethodType(getType().getJNIType(), args.toArray(new Type[args.size()]));
    }
}
