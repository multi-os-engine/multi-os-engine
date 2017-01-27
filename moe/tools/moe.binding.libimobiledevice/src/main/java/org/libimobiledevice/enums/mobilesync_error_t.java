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
public final class mobilesync_error_t {
    @Generated public static final int MOBILESYNC_E_SUCCESS = 0x00000000;
    @Generated public static final int MOBILESYNC_E_INVALID_ARG = 0xFFFFFFFF;
    @Generated public static final int MOBILESYNC_E_PLIST_ERROR = 0xFFFFFFFE;
    @Generated public static final int MOBILESYNC_E_MUX_ERROR = 0xFFFFFFFD;
    @Generated public static final int MOBILESYNC_E_BAD_VERSION = 0xFFFFFFFC;
    @Generated public static final int MOBILESYNC_E_SYNC_REFUSED = 0xFFFFFFFB;
    @Generated public static final int MOBILESYNC_E_CANCELLED = 0xFFFFFFFA;
    @Generated public static final int MOBILESYNC_E_WRONG_DIRECTION = 0xFFFFFFF9;
    @Generated public static final int MOBILESYNC_E_NOT_READY = 0xFFFFFFF8;
    @Generated public static final int MOBILESYNC_E_UNKNOWN_ERROR = 0xFFFFFF00;

    @Generated
    private mobilesync_error_t() {
    }
}
