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
 * Simple class type signature.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class SimpleClassTypeSignature {
    /**
     * Identifier.
     */
    public String identifier;

    /**
     * Type arguments.
     */
    public final List<TypeArgument> typeArguments;

    /**
     * Create a new SimpleClassTypeSignature instance.
     *
     * @param identifier    Identifier
     * @param typeArguments Type arguments
     */
    public SimpleClassTypeSignature(String identifier, List<TypeArgument> typeArguments) {
        if (identifier == null) {
            throw new NullPointerException();
        }
        if (typeArguments == null) {
            throw new NullPointerException();
        }
        this.identifier = identifier;
        this.typeArguments = new ArrayList<>(typeArguments);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(identifier);
        if (typeArguments.size() > 0) {
            builder.append('<');
            typeArguments.forEach(builder::append);
            builder.append('>');
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleClassTypeSignature that = (SimpleClassTypeSignature) o;
        return Objects.equals(identifier, that.identifier) &&
                Objects.equals(typeArguments, that.typeArguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, typeArguments);
    }
}
