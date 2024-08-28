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

package apple.gss.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class gss_channel_bindings_struct extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public gss_channel_bindings_struct() {
        super(gss_channel_bindings_struct.class);
    }

    @Generated
    protected gss_channel_bindings_struct(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int initiator_addrtype();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setInitiator_addrtype(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native gss_buffer_desc_struct initiator_address();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInitiator_address(@ByValue gss_buffer_desc_struct value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int acceptor_addrtype();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAcceptor_addrtype(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native gss_buffer_desc_struct acceptor_address();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAcceptor_address(@ByValue gss_buffer_desc_struct value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native gss_buffer_desc_struct application_data();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setApplication_data(@ByValue gss_buffer_desc_struct value);
}
