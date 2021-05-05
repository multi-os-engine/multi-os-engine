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
public final class group_source_req extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public group_source_req() {
        super(group_source_req.class);
    }

    @Generated
    protected group_source_req(Pointer peer) {
        super(peer);
    }

    @Generated
    public group_source_req(int gsr_interface, @ByValue sockaddr_storage gsr_group, @ByValue sockaddr_storage gsr_source) {
        super(group_source_req.class);
        setGsr_interface(gsr_interface);
        setGsr_group(gsr_group);
        setGsr_source(gsr_source);
    }

    /**
     * interface index
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int gsr_interface();

    /**
     * interface index
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setGsr_interface(int value);

    /**
     * group address
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native sockaddr_storage gsr_group();

    /**
     * group address
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGsr_group(@ByValue sockaddr_storage value);

    /**
     * source address
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native sockaddr_storage gsr_source();

    /**
     * source address
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setGsr_source(@ByValue sockaddr_storage value);
}
