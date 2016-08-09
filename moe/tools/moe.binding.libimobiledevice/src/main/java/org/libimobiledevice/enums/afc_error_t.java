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

package org.libimobiledevice.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class afc_error_t {
	@Generated
	private afc_error_t() {
	}

	@Generated
	public static final int AFC_E_SUCCESS = 0x00000000;
	@Generated
	public static final int AFC_E_UNKNOWN_ERROR = 0x00000001;
	@Generated
	public static final int AFC_E_OP_HEADER_INVALID = 0x00000002;
	@Generated
	public static final int AFC_E_NO_RESOURCES = 0x00000003;
	@Generated
	public static final int AFC_E_READ_ERROR = 0x00000004;
	@Generated
	public static final int AFC_E_WRITE_ERROR = 0x00000005;
	@Generated
	public static final int AFC_E_UNKNOWN_PACKET_TYPE = 0x00000006;
	@Generated
	public static final int AFC_E_INVALID_ARG = 0x00000007;
	@Generated
	public static final int AFC_E_OBJECT_NOT_FOUND = 0x00000008;
	@Generated
	public static final int AFC_E_OBJECT_IS_DIR = 0x00000009;
	@Generated
	public static final int AFC_E_PERM_DENIED = 0x0000000A;
	@Generated
	public static final int AFC_E_SERVICE_NOT_CONNECTED = 0x0000000B;
	@Generated
	public static final int AFC_E_OP_TIMEOUT = 0x0000000C;
	@Generated
	public static final int AFC_E_TOO_MUCH_DATA = 0x0000000D;
	@Generated
	public static final int AFC_E_END_OF_DATA = 0x0000000E;
	@Generated
	public static final int AFC_E_OP_NOT_SUPPORTED = 0x0000000F;
	@Generated
	public static final int AFC_E_OBJECT_EXISTS = 0x00000010;
	@Generated
	public static final int AFC_E_OBJECT_BUSY = 0x00000011;
	@Generated
	public static final int AFC_E_NO_SPACE_LEFT = 0x00000012;
	@Generated
	public static final int AFC_E_OP_WOULD_BLOCK = 0x00000013;
	@Generated
	public static final int AFC_E_IO_ERROR = 0x00000014;
	@Generated
	public static final int AFC_E_OP_INTERRUPTED = 0x00000015;
	@Generated
	public static final int AFC_E_OP_IN_PROGRESS = 0x00000016;
	@Generated
	public static final int AFC_E_INTERNAL_ERROR = 0x00000017;
	@Generated
	public static final int AFC_E_MUX_ERROR = 0x0000001E;
	@Generated
	public static final int AFC_E_NO_MEM = 0x0000001F;
	@Generated
	public static final int AFC_E_NOT_ENOUGH_DATA = 0x00000020;
	@Generated
	public static final int AFC_E_DIR_NOT_EMPTY = 0x00000021;
	@Generated
	public static final int AFC_E_FORCE_SIGNED_TYPE = 0xFFFFFFFF;
}
