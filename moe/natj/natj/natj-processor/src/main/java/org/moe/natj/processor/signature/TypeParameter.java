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

/**
 * Type parameter.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class TypeParameter {
    /**
     * Identifier.
     */
    public String identifier;

    /**
     * Class bound signature.
     */
    public ReferenceTypeSignature classBound;

    /**
     * Interface bound signatures.
     */
    public final List<ReferenceTypeSignature> interfaceBounds;

    /**
     * Create a new TypeParameter instance.
     *
     * @param identifier      Identifier
     * @param classBound      Class bound signature
     * @param interfaceBounds Interface bound signatures
     */
    public TypeParameter(String identifier, ReferenceTypeSignature classBound,
                         List<ReferenceTypeSignature> interfaceBounds) {
        if (identifier == null) {
            throw new NullPointerException();
        }
        if (interfaceBounds == null) {
            throw new NullPointerException();
        }
        this.identifier = identifier;
        this.classBound = classBound;
        this.interfaceBounds = new ArrayList<>(interfaceBounds);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(identifier);
        builder.append(':');
        if (classBound != null) {
            builder.append(classBound);
        }
        for (ReferenceTypeSignature bound : interfaceBounds) {
            builder.append(':').append(bound);
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeParameter that = (TypeParameter) o;
        return Objects.equals(identifier, that.identifier) &&
                Objects.equals(classBound, that.classBound) &&
                Objects.equals(interfaceBounds, that.interfaceBounds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, classBound, interfaceBounds);
    }
}
