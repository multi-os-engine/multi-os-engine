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
 * Class signature.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class ClassSignature extends AbstractSignature {
    /**
     * Type parameters.
     */
    public final List<TypeParameter> typeParameters;

    /**
     * Super class signature.
     */
    public ClassTypeSignature superclassSignature;

    /**
     * Super interface signature list.
     */
    public final List<ClassTypeSignature> superinterfaceSignatures;

    /**
     * Create a new ClassSignature instance.
     *
     * @param typeParameters           Type parameters
     * @param superclassSignature      Super class signature
     * @param superinterfaceSignatures Super interface signatures
     */
    public ClassSignature(List<TypeParameter> typeParameters, ClassTypeSignature superclassSignature,
                          List<ClassTypeSignature> superinterfaceSignatures) {
        if (typeParameters == null) {
            throw new NullPointerException();
        }
        if (superclassSignature == null) {
            throw new NullPointerException();
        }
        if (superinterfaceSignatures == null) {
            throw new NullPointerException();
        }
        this.typeParameters = new ArrayList<>(typeParameters);
        this.superclassSignature = superclassSignature;
        this.superinterfaceSignatures = new ArrayList<>(superinterfaceSignatures);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        if (typeParameters.size() > 0) {
            builder.append('<');
            typeParameters.forEach(builder::append);
            builder.append('>');
        }
        builder.append(superclassSignature);
        superinterfaceSignatures.forEach(builder::append);
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassSignature that = (ClassSignature) o;
        return Objects.equals(typeParameters, that.typeParameters) &&
                Objects.equals(superclassSignature, that.superclassSignature) &&
                Objects.equals(superinterfaceSignatures, that.superinterfaceSignatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeParameters, superclassSignature, superinterfaceSignatures);
    }
}
