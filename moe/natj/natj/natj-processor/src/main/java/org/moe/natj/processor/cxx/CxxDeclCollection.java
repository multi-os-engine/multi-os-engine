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

package org.moe.natj.processor.cxx;

import org.moe.natj.processor.cxx.decl.DeclInfo;
import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class for collecting declarations for a specific impl class.
 */
public class CxxDeclCollection {

    /**
     * Mapper class type.
     */
    public final Type mapperClass;

    /**
     * Implementation class type.
     */
    private final Type implClass;

    /**
     * Direct class type.
     */
    private final Type directClass;

    /**
     * Const implementation class type.
     */
    private final Type constImplClass;

    /**
     * Const direct class type.
     */
    private final Type constDirectClass;

    /**
     * Declaration infos.
     */
    private final ArrayList<DeclInfo> declInfos = new ArrayList<>();

    /**
     * Creates a new CxxDeclCollection instance.
     *
     * @param clazz class name
     */
    public CxxDeclCollection(String clazz) {
        if (clazz == null) {
            throw new NullPointerException();
        }
        this.mapperClass = Type.getObjectType(clazz);
        this.implClass = Type.getObjectType(clazz + "$__cxx_Impl");
        this.directClass = Type.getObjectType(clazz + "$__cxx_Direct");
        this.constImplClass = Type.getObjectType(clazz + "$__cxx_ConstImpl");
        this.constDirectClass = Type.getObjectType(clazz + "$__cxx_ConstDirect");
    }

    /**
     * Adds the specified declInfo to the collection.
     *
     * @param declInfo decl to add
     */
    public void add(DeclInfo declInfo) {
        if (declInfo == null) {
            throw new NullPointerException();
        }
        declInfos.add(declInfo);
    }

    /**
     * Returns the impl class' type.
     *
     * @return impl class' type
     */
    public Type getImplClass() {
        return implClass;
    }

    /**
     * Returns the direct class' type.
     *
     * @return direct class' type
     */
    public Type getDirectClass() {
        return directClass;
    }

    /**
     * Returns the const impl class' type.
     *
     * @return const impl class' type
     */
    public Type getConstImplClass() {
        return constImplClass;
    }

    /**
     * Returns the const direct class' type.
     *
     * @return const direct class' type
     */
    public Type getConstDirectClass() {
        return constDirectClass;
    }

    /**
     * Returns the declaration infos in this collection.
     *
     * @return declaration infos
     */
    public List<DeclInfo> getDeclInfos() {
        return Collections.unmodifiableList(declInfos);
    }
}
