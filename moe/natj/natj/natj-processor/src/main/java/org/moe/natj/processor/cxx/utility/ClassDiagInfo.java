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

package org.moe.natj.processor.cxx.utility;

import org.moe.natj.processor.signature.SignatureParser;

import java.util.Arrays;

/**
 * This class contains class diagnostic information.
 */
public class ClassDiagInfo implements IDiagInfo {
    /**
     * Class file version.
     */
    public final int version;

    /**
     * Class access flags.
     */
    public final int access;

    /**
     * Class name.
     */
    public final String name;

    /**
     * Class signature.
     */
    public final String signature;

    /**
     * Superclass name.
     */
    public final String superName;

    /**
     * Class interfaces.
     */
    public final String[] interfaces;

    /**
     * Creates a new ClassDiagInfo instance.
     *
     * @param version    Class file version
     * @param access     Class access flags
     * @param name       Class name
     * @param signature  Class signature
     * @param superName  Superclass name
     * @param interfaces Class interfaces
     */
    public ClassDiagInfo(int version, int access, String name, String signature, String superName, String[] interfaces) {
        this.version = version;
        this.access = access;
        this.name = name;
        this.signature = signature;
        this.superName = superName;
        this.interfaces = interfaces;
        if (signature != null) { // TODO: remove this, only here for testing
            final String string = SignatureParser.parseClassSignature(signature).toString();
            if (!string.equals(signature)) {
                throw new IllegalStateException("\n" +
                        "expected: " + signature + "\n" +
                        "  actual: " + string);
            }
        }
    }

    @Override
    public String toString() {
        return toString("");
    }

    /**
     * Implements toString with custom indent support.
     *
     * @param indent Indent string
     * @return toString value
     */
    public String toString(String indent) {
        return "ClassDiagInfo {" + '\n' +
                indent + "    version = " + version + "\n" +
                indent + "     access = " + access + "\n" +
                indent + "       name = " + name + "\n" +
                indent + "  signature = " + signature + "\n" +
                indent + "  superName = " + superName + "\n" +
                indent + " interfaces = " + Arrays.toString(interfaces) + "\n" +
                indent + '}';
    }
}
