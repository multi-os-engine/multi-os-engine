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

package org.moe.natjgen;

import org.clang.enums.CXObjCTypeParamVariance;
import org.clang.struct.CXType;

public class ObjCGenericParamType {

    private final int location;

    private final ObjCClassManager manager;

    private final String name;

    private final String usr;

    private final int variance;

    public ObjCGenericParamType(int location, ObjCClassManager manager, CXType type, int variance) {
        this.location = location;
        this.manager = manager;
        this.name = "_" + type.getTypeSpelling().toString();
        this.usr = type.getTypeDeclaration().getCursorUSR().toString();
        this.variance = variance;
        if (location < 0) {
            throw new IllegalArgumentException();
        }
        if (manager == null) {
            throw new NullPointerException();
        }
        if (name == null) {
            throw new NullPointerException();
        }
        if (name.length() == 0) {
            throw new IllegalArgumentException();
        }
        if (usr == null) {
            throw new NullPointerException();
        }
        if (usr.length() == 0) {
            throw new IllegalArgumentException();
        }
        if (variance == CXObjCTypeParamVariance.Invalid) {
            throw new IllegalArgumentException();
        }
    }

    public int getLocation() {
        return location;
    }

    public ObjCClassManager getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }

    public String getUSR() {
        return usr;
    }

    public boolean isInvariant() {
        return variance == CXObjCTypeParamVariance.Invariant;
    }

    public boolean isCovariant() {
        return variance == CXObjCTypeParamVariance.Covariant;
    }

    public boolean isContravariant() {
        return variance == CXObjCTypeParamVariance.Contravariant;
    }
}
