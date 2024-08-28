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
import org.objectweb.asm.tree.MethodNode;

import java.util.Arrays;

/**
 * This class contains method diagnostic information.
 */
public class MethodDiagInfo implements IDiagInfo {
    /**
     * Owning class diagnostic information.
     */
    public final ClassDiagInfo classDiagInfo;

    /**
     * Method access flags.
     */
    public final int access;

    /**
     * Method name.
     */
    public final String name;

    /**
     * Method descriptor.
     */
    public final String desc;

    /**
     * Method signature.
     */
    public final String signature;

    /**
     * Method exceptions.
     */
    public final String[] exceptions;

    /**
     * Create a new MethodDiagInfo instance.
     *
     * @param classDiagInfo Owning class diagnostic information
     * @param access        Method access flags
     * @param name          Method name
     * @param desc          Method descriptor
     * @param signature     Method signature
     * @param exceptions    Method exceptions
     */
    public MethodDiagInfo(ClassDiagInfo classDiagInfo, int access, String name, String desc, String signature,
                          String[] exceptions) {
        this.classDiagInfo = classDiagInfo;
        this.access = access;
        this.name = name;
        this.desc = desc;
        this.signature = signature;
        this.exceptions = exceptions;
        if (signature != null) { // TODO: remove this, only here for testing
            final String string = SignatureParser.parseMethodSignature(signature).toString();
            if (!string.equals(signature)) {
                throw new IllegalStateException("\n" +
                        "expected: " + signature + "\n" +
                        "  actual: " + string);
            }
        }
    }

    /**
     * Create a new MethodDiagInfo instance.
     *
     * @param classDiagInfo Owning class diagnostic information
     * @param node          Method node
     */
    public MethodDiagInfo(ClassDiagInfo classDiagInfo, MethodNode node) {
        this(classDiagInfo, node.access, node.name, node.desc, node.signature,
                (String[]) node.exceptions.toArray(new String[node.exceptions.size()]));
    }

    @Override
    public String toString() {
        return "MethodDiagInfo {" + "\n" +
                "      class = " + classDiagInfo.toString("              ") + "\n" +
                "     access = " + access + "\n" +
                "       name = " + name + "\n" +
                "       desc = " + desc + "\n" +
                "  signature = " + signature + "\n" +
                " exceptions = " + Arrays.toString(exceptions) + "\n" +
                '}';
    }
}
