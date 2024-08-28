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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure(alignment = 4)
public final class __msfilterreq extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public __msfilterreq() {
        super(__msfilterreq.class);
    }

    @Generated
    protected __msfilterreq(Pointer peer) {
        super(peer);
    }

    /**
     * interface index
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int msfr_ifindex();

    /**
     * interface index
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMsfr_ifindex(int value);

    /**
     * filter mode for group
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int msfr_fmode();

    /**
     * filter mode for group
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMsfr_fmode(int value);

    /**
     * # of sources in msfr_srcs
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int msfr_nsrcs();

    /**
     * # of sources in msfr_srcs
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMsfr_nsrcs(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int __msfr_align();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void set__msfr_align(int value);

    /**
     * group address
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native sockaddr_storage msfr_group();

    /**
     * group address
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMsfr_group(@ByValue sockaddr_storage value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native sockaddr_storage msfr_srcs();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMsfr_srcs(
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr_storage value);
}
