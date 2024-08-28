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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class gss_OID_desc_struct extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public gss_OID_desc_struct() {
        super(gss_OID_desc_struct.class);
    }

    @Generated
    protected gss_OID_desc_struct(Pointer peer) {
        super(peer);
    }

    @Generated
    public gss_OID_desc_struct(int length, VoidPtr elements) {
        super(gss_OID_desc_struct.class);
        setLength(length);
        setElements(elements);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int length();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLength(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr elements();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setElements(VoidPtr value);
}
