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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class sockaddr extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public sockaddr() {
        super(sockaddr.class);
    }

    @Generated
    protected sockaddr(Pointer peer) {
        super(peer);
    }

    /**
     * total length
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte sa_len();

    /**
     * total length
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSa_len(byte value);

    /**
     * [XSI] address family
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte sa_family();

    /**
     * [XSI] address family
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSa_family(byte value);

    /**
     * [XSI] addr value (actually larger)
     */
    @Generated
    @StructureField(order = 2, isGetter = true, count = 14)
    public native byte sa_data(int field_idx);

    /**
     * [XSI] addr value (actually larger)
     */
    @Generated
    @StructureField(order = 2, isGetter = false, count = 14)
    public native void setSa_data(byte value, int field_idx);
}
