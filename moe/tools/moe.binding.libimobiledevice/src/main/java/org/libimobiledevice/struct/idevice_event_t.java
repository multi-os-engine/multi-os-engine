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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class idevice_event_t extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public idevice_event_t() {
        super(idevice_event_t.class);
    }

    @Generated
    protected idevice_event_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public idevice_event_t(int event,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String udid,
            int conn_type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String conn_subtype) {
        super(idevice_event_t.class);
        setEvent(event);
        setUdid(udid);
        setConn_type(conn_type);
        setConn_subtype(conn_subtype);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int event();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setEvent(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public native String udid();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUdid(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int conn_type();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setConn_type(int value);

    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native String conn_subtype();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setConn_subtype(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);
}
