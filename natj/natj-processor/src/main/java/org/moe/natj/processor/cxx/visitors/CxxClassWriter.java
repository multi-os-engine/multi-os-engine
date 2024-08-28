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

package org.moe.natj.processor.cxx.visitors;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class CxxClassWriter extends ClassWriter {
    public CxxClassWriter(int flags) {
        super(flags);
    }

    public CxxClassWriter(ClassReader classReader, int flags) {
        super(classReader, flags);
    }

    @Override
    protected String getCommonSuperClass(String type1, String type2) {
        System.out.println("getCommonSuperClass: " + type1 + " vs " + type2);
        if (type2.equals(type1 + "$__cxx_Impl") || type2.equals(type1 + "$__cxx_ConstImpl")) {
            return type1;
        }
        if (type1.equals(type2 + "$__cxx_Impl") || type1.equals(type2 + "$__cxx_ConstImpl")) {
            return type2;
        }
        return super.getCommonSuperClass(type1, type2);
    }
}
