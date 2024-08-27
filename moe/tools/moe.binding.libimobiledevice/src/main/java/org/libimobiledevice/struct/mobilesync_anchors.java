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
public final class mobilesync_anchors extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public mobilesync_anchors() {
        super(mobilesync_anchors.class);
    }

    @Generated
    protected mobilesync_anchors(Pointer peer) {
        super(peer);
    }

    @Generated
    public mobilesync_anchors(BytePtr device_anchor, BytePtr computer_anchor) {
        super(mobilesync_anchors.class);
        setDevice_anchor(device_anchor);
        setComputer_anchor(computer_anchor);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native BytePtr device_anchor();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDevice_anchor(BytePtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native BytePtr computer_anchor();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setComputer_anchor(BytePtr value);
}
