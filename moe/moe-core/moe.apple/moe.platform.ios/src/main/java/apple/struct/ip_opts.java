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
public final class ip_opts extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public ip_opts() {
        super(ip_opts.class);
    }

    @Generated
    protected ip_opts(Pointer peer) {
        super(peer);
    }

    /**
     * first hop, 0 w/o src rt
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native in_addr ip_dst();

    /**
     * first hop, 0 w/o src rt
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIp_dst(@ByValue in_addr value);

    /**
     * actually variable in size
     */
    @Generated
    @StructureField(order = 1, isGetter = true, count = 40)
    public native byte ip_opts(int field_idx);

    /**
     * actually variable in size
     */
    @Generated
    @StructureField(order = 1, isGetter = false, count = 40)
    public native void setIp_opts(byte value, int field_idx);
}
