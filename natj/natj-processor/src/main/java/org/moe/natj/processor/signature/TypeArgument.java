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
 * Type argument.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class TypeArgument {
    /**
     * No wildcard.
     */
    public static final char WC_NONE = ' ';

    /**
     * '+' wildcard.
     */
    public static final char WC_PLUS = '+';

    /**
     * '-' wildcard.
     */
    public static final char WC_MINUS = '-';

    /**
     * '*' wildcard.
     */
    public static final char WC_STAR = '*';

    /**
     * Wildcard.
     */
    public char wildcard;

    /**
     * Type signature.
     */
    public ReferenceTypeSignature referenceTypeSignature;

    /**
     * Create a new TypeArgument instance with '*' wildcard.
     */
    public TypeArgument() {
        wildcard = WC_STAR;
        referenceTypeSignature = null;
    }

    /**
     * Create a new TypeArgument instance with no wildcards.
     *
     * @param referenceTypeSignature Reference type signature
     */
    public TypeArgument(ReferenceTypeSignature referenceTypeSignature) {
        if (referenceTypeSignature == null) {
            throw new NullPointerException();
        }
        wildcard = WC_NONE;
        this.referenceTypeSignature = referenceTypeSignature;
    }

    /**
     * Create a new TypeArgument instance.
     *
     * @param wildcard               '+' or '-' wildcard
     * @param referenceTypeSignature Reference type signature
     */
    public TypeArgument(char wildcard, ReferenceTypeSignature referenceTypeSignature) {
        if (referenceTypeSignature == null) {
            throw new NullPointerException();
        }
        if (wildcard != WC_PLUS && wildcard != WC_MINUS) {
            throw new IllegalArgumentException();
        }
        this.wildcard = wildcard;
        this.referenceTypeSignature = referenceTypeSignature;
    }

    @Override
    public String toString() {
        if (wildcard == WC_STAR) {
            return "*";
        }
        assert referenceTypeSignature != null;
        if (wildcard == WC_NONE) {
            return referenceTypeSignature.toString();
        }
        return wildcard + referenceTypeSignature.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeArgument that = (TypeArgument) o;
        return wildcard == that.wildcard &&
                Objects.equals(referenceTypeSignature, that.referenceTypeSignature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wildcard, referenceTypeSignature);
    }
}
