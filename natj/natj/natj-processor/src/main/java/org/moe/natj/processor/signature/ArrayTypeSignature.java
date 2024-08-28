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
 * Array type signature.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class ArrayTypeSignature extends ReferenceTypeSignature {
    /**
     * Element type.
     */
    public JavaTypeSignature javaTypeSignature;

    /**
     * Create a new ArrayTypeSignature instance by specifying its element.
     *
     * @param javaTypeSignature Element type
     */
    public ArrayTypeSignature(JavaTypeSignature javaTypeSignature) {
        if (javaTypeSignature == null) {
            throw new NullPointerException();
        }
        this.javaTypeSignature = javaTypeSignature;
    }

    @Override
    public String toString() {
        return "[" + javaTypeSignature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayTypeSignature that = (ArrayTypeSignature) o;
        return Objects.equals(javaTypeSignature, that.javaTypeSignature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(javaTypeSignature);
    }
}
