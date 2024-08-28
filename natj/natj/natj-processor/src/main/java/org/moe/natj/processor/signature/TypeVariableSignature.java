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

import java.util.Objects;

/**
 * Type variable signature.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class TypeVariableSignature extends ReferenceTypeSignature {
    /**
     * Identifier.
     */
    public String identifier;

    /**
     * Create a new TypeVariableSignature instance.
     *
     * @param identifier Identifier
     */
    public TypeVariableSignature(String identifier) {
        if (identifier == null) {
            throw new NullPointerException();
        }
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "T" + identifier + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeVariableSignature that = (TypeVariableSignature) o;
        return Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }
}
