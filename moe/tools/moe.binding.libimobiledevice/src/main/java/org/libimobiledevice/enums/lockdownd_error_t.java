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
public final class lockdownd_error_t {
    @Generated public static final int LOCKDOWN_E_SUCCESS = 0x00000000;
    @Generated public static final int LOCKDOWN_E_INVALID_ARG = 0xFFFFFFFF;
    @Generated public static final int LOCKDOWN_E_INVALID_CONF = 0xFFFFFFFE;
    @Generated public static final int LOCKDOWN_E_PLIST_ERROR = 0xFFFFFFFD;
    @Generated public static final int LOCKDOWN_E_PAIRING_FAILED = 0xFFFFFFFC;
    @Generated public static final int LOCKDOWN_E_SSL_ERROR = 0xFFFFFFFB;
    @Generated public static final int LOCKDOWN_E_DICT_ERROR = 0xFFFFFFFA;
    @Generated public static final int LOCKDOWN_E_NOT_ENOUGH_DATA = 0xFFFFFFF9;
    @Generated public static final int LOCKDOWN_E_MUX_ERROR = 0xFFFFFFF8;
    @Generated public static final int LOCKDOWN_E_PASSWORD_PROTECTED = 0xFFFFFFEF;
    @Generated public static final int LOCKDOWN_E_NO_RUNNING_SESSION = 0xFFFFFFF7;
    @Generated public static final int LOCKDOWN_E_INVALID_HOST_ID = 0xFFFFFFEB;
    @Generated public static final int LOCKDOWN_E_INVALID_SERVICE = 0xFFFFFFE5;
    @Generated public static final int LOCKDOWN_E_INVALID_ACTIVATION_RECORD = 0xFFFFFFE0;
    @Generated public static final int LOCKDOWN_E_USER_DENIED_PAIRING = 0xFFFFFFEE;
    @Generated public static final int LOCKDOWN_E_UNKNOWN_ERROR = 0xFFFFFF00;
    @Generated public static final int LOCKDOWN_E_SERVICE_LIMIT = 0xFFFFFFE4;
    @Generated public static final int LOCKDOWN_E_INVALID_RESPONSE = 0xFFFFFFF6;
    @Generated public static final int LOCKDOWN_E_MISSING_KEY = 0xFFFFFFF5;
    @Generated public static final int LOCKDOWN_E_MISSING_VALUE = 0xFFFFFFF4;
    @Generated public static final int LOCKDOWN_E_GET_PROHIBITED = 0xFFFFFFF3;
    @Generated public static final int LOCKDOWN_E_SET_PROHIBITED = 0xFFFFFFF2;
    @Generated public static final int LOCKDOWN_E_REMOVE_PROHIBITED = 0xFFFFFFF1;
    @Generated public static final int LOCKDOWN_E_IMMUTABLE_VALUE = 0xFFFFFFF0;
    @Generated public static final int LOCKDOWN_E_PAIRING_DIALOG_RESPONSE_PENDING = 0xFFFFFFED;
    @Generated public static final int LOCKDOWN_E_MISSING_HOST_ID = 0xFFFFFFEC;
    @Generated public static final int LOCKDOWN_E_SESSION_ACTIVE = 0xFFFFFFEA;
    @Generated public static final int LOCKDOWN_E_SESSION_INACTIVE = 0xFFFFFFE9;
    @Generated public static final int LOCKDOWN_E_MISSING_SESSION_ID = 0xFFFFFFE8;
    @Generated public static final int LOCKDOWN_E_INVALID_SESSION_ID = 0xFFFFFFE7;
    @Generated public static final int LOCKDOWN_E_MISSING_SERVICE = 0xFFFFFFE6;
    @Generated public static final int LOCKDOWN_E_MISSING_PAIR_RECORD = 0xFFFFFFE3;
    @Generated public static final int LOCKDOWN_E_SAVE_PAIR_RECORD_FAILED = 0xFFFFFFE2;
    @Generated public static final int LOCKDOWN_E_INVALID_PAIR_RECORD = 0xFFFFFFE1;
    @Generated public static final int LOCKDOWN_E_MISSING_ACTIVATION_RECORD = 0xFFFFFFDF;
    @Generated public static final int LOCKDOWN_E_SERVICE_PROHIBITED = 0xFFFFFFDE;
    @Generated public static final int LOCKDOWN_E_ESCROW_LOCKED = 0xFFFFFFDD;

    @Generated
    private lockdownd_error_t() {
    }
}
