/*
 * Java binding for libimobiledevice and libplist.
 * 
 * Copyright 2014-2016 Intel Corporation
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.libimobiledevice.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class lockdownd_pair_record extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public lockdownd_pair_record() {
        super(lockdownd_pair_record.class);
    }

    @Generated
    protected lockdownd_pair_record(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native BytePtr device_certificate();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDevice_certificate(BytePtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native BytePtr host_certificate();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHost_certificate(BytePtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native BytePtr root_certificate();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRoot_certificate(BytePtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native BytePtr host_id();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setHost_id(BytePtr value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native BytePtr system_buid();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSystem_buid(BytePtr value);
}
