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

@Generated
@Structure()
public final class lockdownd_service_descriptor extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public lockdownd_service_descriptor() {
		super(lockdownd_service_descriptor.class);
	}

	@Generated
	protected lockdownd_service_descriptor(Pointer peer) {
		super(peer);
	}

	@Generated
	public lockdownd_service_descriptor(short port, byte ssl_enabled) {
		super(lockdownd_service_descriptor.class);
		setPort(port);
		setSsl_enabled(ssl_enabled);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short port();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPort(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte ssl_enabled();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSsl_enabled(byte value);
}
