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
public final class afc_file_mode_t {
    @Generated public static final int AFC_FOPEN_RDONLY = 0x00000001;
    @Generated public static final int AFC_FOPEN_RW = 0x00000002;
    @Generated public static final int AFC_FOPEN_WRONLY = 0x00000003;
    @Generated public static final int AFC_FOPEN_WR = 0x00000004;
    @Generated public static final int AFC_FOPEN_APPEND = 0x00000005;
    @Generated public static final int AFC_FOPEN_RDAPPEND = 0x00000006;

    @Generated
    private afc_file_mode_t() {
    }
}
