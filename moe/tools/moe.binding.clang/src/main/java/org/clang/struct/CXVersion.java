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

package org.clang.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CXVersion extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXVersion() {
        super(CXVersion.class);
    }

    @Generated
    protected CXVersion(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXVersion(int Major, int Minor, int Subminor) {
        super(CXVersion.class);
        setMajor(Major);
        setMinor(Minor);
        setSubminor(Subminor);
    }

    /**
     * The major version number, e.g., the '10' in '10.7.3'. A negative
     * value indicates that there is no version number at all.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int Major();

    /**
     * The major version number, e.g., the '10' in '10.7.3'. A negative
     * value indicates that there is no version number at all.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMajor(int value);

    /**
     * The minor version number, e.g., the '7' in '10.7.3'. This value
     * will be negative if no minor version number was provided, e.g., for
     * version '10'.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int Minor();

    /**
     * The minor version number, e.g., the '7' in '10.7.3'. This value
     * will be negative if no minor version number was provided, e.g., for
     * version '10'.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMinor(int value);

    /**
     * The subminor version number, e.g., the '3' in '10.7.3'. This value
     * will be negative if no minor or subminor version number was provided,
     * e.g., in version '10' or '10.7'.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int Subminor();

    /**
     * The subminor version number, e.g., the '3' in '10.7.3'. This value
     * will be negative if no minor or subminor version number was provided,
     * e.g., in version '10' or '10.7'.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSubminor(int value);

    @Override
    public String toString () {
        String s;
        if (Major() != -1) {
            s = String.valueOf(Major());
        } else {
            return "";
        }

        if (Minor() != -1) {
            s += "." + Minor();
        } else {
            s += ".0";
        }

        if (Subminor() != -1) {
            s += "." + Subminor();
        }
        return s;
    }
}
