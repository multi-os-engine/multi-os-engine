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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CXPlatformAvailability extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXPlatformAvailability() {
        super(CXPlatformAvailability.class);
    }

    @Generated
    protected CXPlatformAvailability(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native CXString Platform();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setPlatform(@ByValue CXString value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native CXVersion Introduced();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIntroduced(@ByValue CXVersion value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CXVersion Deprecated();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDeprecated(@ByValue CXVersion value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native CXVersion Obsoleted();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setObsoleted(@ByValue CXVersion value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int Unavailable();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUnavailable(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native CXString Message();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMessage(@ByValue CXString value);
}
