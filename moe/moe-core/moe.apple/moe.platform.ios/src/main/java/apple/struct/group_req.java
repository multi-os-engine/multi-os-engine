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
@Structure(alignment = 4)
public final class group_req extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public group_req() {
        super(group_req.class);
    }

    @Generated
    protected group_req(Pointer peer) {
        super(peer);
    }

    @Generated
    public group_req(int gr_interface, @ByValue sockaddr_storage gr_group) {
        super(group_req.class);
        setGr_interface(gr_interface);
        setGr_group(gr_group);
    }

    /**
     * interface index
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int gr_interface();

    /**
     * interface index
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setGr_interface(int value);

    /**
     * group address
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native sockaddr_storage gr_group();

    /**
     * group address
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGr_group(@ByValue sockaddr_storage value);
}
