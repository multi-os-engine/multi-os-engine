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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Class type signature.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class ClassTypeSignature extends ReferenceTypeSignature {
    /**
     * Package.
     */
    public String pkg;

    /**
     * List of class types.
     */
    public final List<SimpleClassTypeSignature> simpleClassTypes;

    /**
     * Create a new ClassTypeSignature instance.
     *
     * @param pkg              Package
     * @param simpleClassTypes Class type list
     */
    public ClassTypeSignature(String pkg, List<SimpleClassTypeSignature> simpleClassTypes) {
        if (pkg == null) {
            throw new NullPointerException();
        }
        if (simpleClassTypes == null) {
            throw new NullPointerException();
        }
        if (simpleClassTypes.size() < 1) {
            throw new IllegalArgumentException();
        }
        this.pkg = pkg;
        this.simpleClassTypes = new ArrayList<>(simpleClassTypes);
    }

    /**
     * Returns the internal name of this type.
     *
     * @return Internal name
     */
    public String getInternalName() {
        StringBuilder builder = new StringBuilder(pkg);
        if (builder.length() > 0) {
            builder.append('/');
        }
        builder.append(simpleClassTypes.get(0).identifier);
        for (int i = 1, size = simpleClassTypes.size(); i < size; i++) {
            builder.append('$').append(simpleClassTypes.get(i).identifier);
        }
        return builder.toString();
    }

    /**
     * Returns the type arguments of this type.
     *
     * @return Type arguments
     */
    public TypeArgument[] getTypeArguments() {
        // TODO: is this good?
        final List<TypeArgument> typeArguments = simpleClassTypes.get(simpleClassTypes.size() - 1).typeArguments;
        return typeArguments.toArray(new TypeArgument[typeArguments.size()]);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("L");
        if (pkg.length() > 0) {
            builder.append(pkg).append('/');
        }
        builder.append(String.join(".", simpleClassTypes.stream().map(Object::toString).collect(Collectors.toList())));
        builder.append(';');
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassTypeSignature that = (ClassTypeSignature) o;
        return Objects.equals(pkg, that.pkg) &&
                Objects.equals(simpleClassTypes, that.simpleClassTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkg, simpleClassTypes);
    }
}
