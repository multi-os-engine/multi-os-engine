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

package org.libplist.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class plist_type {
	@Generated
	private plist_type() {
	}

	@Generated
	public static final int PLIST_BOOLEAN = 0x00000000;
	@Generated
	public static final int PLIST_UINT = 0x00000001;
	@Generated
	public static final int PLIST_REAL = 0x00000002;
	@Generated
	public static final int PLIST_STRING = 0x00000003;
	@Generated
	public static final int PLIST_ARRAY = 0x00000004;
	@Generated
	public static final int PLIST_DICT = 0x00000005;
	@Generated
	public static final int PLIST_DATE = 0x00000006;
	@Generated
	public static final int PLIST_DATA = 0x00000007;
	@Generated
	public static final int PLIST_KEY = 0x00000008;
	@Generated
	public static final int PLIST_UID = 0x00000009;
	@Generated
	public static final int PLIST_NONE = 0x0000000A;
}
