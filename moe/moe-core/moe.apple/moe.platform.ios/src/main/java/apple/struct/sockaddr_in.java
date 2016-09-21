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

package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class sockaddr_in extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public sockaddr_in() {
        super(sockaddr_in.class);
    }

    @Generated
    protected sockaddr_in(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte sin_len();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSin_len(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte sin_family();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSin_family(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char sin_port();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSin_port(char value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native in_addr sin_addr();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSin_addr(@ByValue in_addr value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 8)
    public native byte sin_zero(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 8)
    public native void setSin_zero(byte value, int field_idx);
}
