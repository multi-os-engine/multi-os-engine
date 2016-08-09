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
 * Method signature.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class MethodSignature extends AbstractSignature {
    /**
     * Type parameters.
     */
    public final List<TypeParameter> typeParameters;

    /**
     * Parameter signatures.
     */
    public final List<JavaTypeSignature> parameters;

    /**
     * Result signature.
     */
    public JavaTypeSignature result;

    /**
     * Throws signatures.
     */
    public final List<ReferenceTypeSignature> throwsSignatures;

    /**
     * Create a new MethodSignature instance.
     *
     * @param typeParameters   Type parameters
     * @param parameters       Parameter signatures
     * @param result           Result signature
     * @param throwsSignatures Throws signatures
     */
    public MethodSignature(List<TypeParameter> typeParameters, List<JavaTypeSignature> parameters,
                           JavaTypeSignature result, List<ReferenceTypeSignature> throwsSignatures) {
        if (typeParameters == null) {
            throw new NullPointerException();
        }
        if (parameters == null) {
            throw new NullPointerException();
        }
        if (throwsSignatures == null) {
            throw new NullPointerException();
        }
        this.typeParameters = new ArrayList<>(typeParameters);
        this.parameters = new ArrayList<>(parameters);
        this.result = result;
        this.throwsSignatures = new ArrayList<>(throwsSignatures);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        if (typeParameters.size() > 0) {
            builder.append('<');
            typeParameters.forEach(builder::append);
            builder.append('>');
        }
        builder.append('(');
        parameters.forEach(builder::append);
        builder.append(')');
        if (result == null) {
            builder.append('V');
        } else {
            builder.append(result);
        }
        for (ReferenceTypeSignature signature : throwsSignatures) {
            builder.append('^').append(signature);
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodSignature that = (MethodSignature) o;
        return Objects.equals(typeParameters, that.typeParameters) &&
                Objects.equals(parameters, that.parameters) &&
                Objects.equals(result, that.result) &&
                Objects.equals(throwsSignatures, that.throwsSignatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeParameters, parameters, result, throwsSignatures);
    }
}
