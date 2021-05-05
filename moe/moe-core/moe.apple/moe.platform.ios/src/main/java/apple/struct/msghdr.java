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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class msghdr extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public msghdr() {
        super(msghdr.class);
    }

    @Generated
    protected msghdr(Pointer peer) {
        super(peer);
    }

    /**
     * [XSI] optional address
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr msg_name();

    /**
     * [XSI] optional address
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMsg_name(VoidPtr value);

    /**
     * [XSI] size of address
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int msg_namelen();

    /**
     * [XSI] size of address
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMsg_namelen(int value);

    /**
     * [XSI] scatter/gather array
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native iovec msg_iov();

    /**
     * [XSI] scatter/gather array
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMsg_iov(@UncertainArgument("Options: reference, array Fallback: reference") iovec value);

    /**
     * [XSI] # elements in msg_iov
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int msg_iovlen();

    /**
     * [XSI] # elements in msg_iov
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMsg_iovlen(int value);

    /**
     * [XSI] ancillary data, see below
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native VoidPtr msg_control();

    /**
     * [XSI] ancillary data, see below
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMsg_control(VoidPtr value);

    /**
     * [XSI] ancillary data buffer len
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int msg_controllen();

    /**
     * [XSI] ancillary data buffer len
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMsg_controllen(int value);

    /**
     * [XSI] flags on received message
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int msg_flags();

    /**
     * [XSI] flags on received message
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMsg_flags(int value);
}
