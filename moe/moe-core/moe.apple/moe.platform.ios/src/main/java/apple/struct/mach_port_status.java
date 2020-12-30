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
public final class mach_port_status extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public mach_port_status() {
        super(mach_port_status.class);
    }

    @Generated
    protected mach_port_status(Pointer peer) {
        super(peer);
    }

    /**
     * count of containing port sets
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mps_pset();

    /**
     * count of containing port sets
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMps_pset(int value);

    /**
     * sequence number
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mps_seqno();

    /**
     * sequence number
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMps_seqno(int value);

    /**
     * make-send count
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mps_mscount();

    /**
     * make-send count
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMps_mscount(int value);

    /**
     * queue limit
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mps_qlimit();

    /**
     * queue limit
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMps_qlimit(int value);

    /**
     * number in the queue
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mps_msgcount();

    /**
     * number in the queue
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMps_msgcount(int value);

    /**
     * how many send-once rights
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int mps_sorights();

    /**
     * how many send-once rights
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMps_sorights(int value);

    /**
     * do send rights exist?
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mps_srights();

    /**
     * do send rights exist?
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMps_srights(int value);

    /**
     * port-deleted requested?
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int mps_pdrequest();

    /**
     * port-deleted requested?
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMps_pdrequest(int value);

    /**
     * no-senders requested?
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int mps_nsrequest();

    /**
     * no-senders requested?
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setMps_nsrequest(int value);

    /**
     * port flags
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int mps_flags();

    /**
     * port flags
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setMps_flags(int value);
}
