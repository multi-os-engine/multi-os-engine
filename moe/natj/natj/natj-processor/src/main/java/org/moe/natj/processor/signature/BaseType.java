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

package org.moe.natj.processor.signature;

import org.objectweb.asm.Type;

import java.util.Objects;

/**
 * Base type signature.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class BaseType extends JavaTypeSignature {
    /**
     * Type.
     */
    public Type type;

    /**
     * Create a new BaseType instance by specifying its descriptor.
     *
     * @param c Descriptor
     */
    public BaseType(char c) {
        type = Type.getType(Character.toString(c));
    }

    @Override
    public String toString() {
        return type.getDescriptor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseType baseType = (BaseType) o;
        return Objects.equals(type, baseType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
