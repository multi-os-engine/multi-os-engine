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
public final class instproxy_error_t {
	@Generated
	private instproxy_error_t() {
	}

	@Generated
	public static final int INSTPROXY_E_SUCCESS = 0x00000000;
	@Generated
	public static final int INSTPROXY_E_INVALID_ARG = 0xFFFFFFFF;
	@Generated
	public static final int INSTPROXY_E_PLIST_ERROR = 0xFFFFFFFE;
	@Generated
	public static final int INSTPROXY_E_CONN_FAILED = 0xFFFFFFFD;
	@Generated
	public static final int INSTPROXY_E_OP_IN_PROGRESS = 0xFFFFFFFC;
	@Generated
	public static final int INSTPROXY_E_OP_FAILED = 0xFFFFFFFB;
	@Generated
	public static final int INSTPROXY_E_RECEIVE_TIMEOUT = 0xFFFFFFFA;
	@Generated
	public static final int INSTPROXY_E_UNKNOWN_ERROR = 0xFFFFFF00;
	@Generated
	public static final int INSTPROXY_E_ALREADY_ARCHIVED = 0xFFFFFFF9;
	@Generated
	public static final int INSTPROXY_E_API_INTERNAL_ERROR = 0xFFFFFFF8;
	@Generated
	public static final int INSTPROXY_E_APPLICATION_ALREADY_INSTALLED = 0xFFFFFFF7;
	@Generated
	public static final int INSTPROXY_E_APPLICATION_MOVE_FAILED = 0xFFFFFFF6;
	@Generated
	public static final int INSTPROXY_E_APPLICATION_SINF_CAPTURE_FAILED = 0xFFFFFFF5;
	@Generated
	public static final int INSTPROXY_E_APPLICATION_SANDBOX_FAILED = 0xFFFFFFF4;
	@Generated
	public static final int INSTPROXY_E_APPLICATION_VERIFICATION_FAILED = 0xFFFFFFF3;
	@Generated
	public static final int INSTPROXY_E_ARCHIVE_DESTRUCTION_FAILED = 0xFFFFFFF2;
	@Generated
	public static final int INSTPROXY_E_BUNDLE_VERIFICATION_FAILED = 0xFFFFFFF1;
	@Generated
	public static final int INSTPROXY_E_CARRIER_BUNDLE_COPY_FAILED = 0xFFFFFFF0;
	@Generated
	public static final int INSTPROXY_E_CARRIER_BUNDLE_DIRECTORY_CREATION_FAILED = 0xFFFFFFEF;
	@Generated
	public static final int INSTPROXY_E_CARRIER_BUNDLE_MISSING_SUPPORTED_SIMS = 0xFFFFFFEE;
	@Generated
	public static final int INSTPROXY_E_COMM_CENTER_NOTIFICATION_FAILED = 0xFFFFFFED;
	@Generated
	public static final int INSTPROXY_E_CONTAINER_CREATION_FAILED = 0xFFFFFFEC;
	@Generated
	public static final int INSTPROXY_E_CONTAINER_P0WN_FAILED = 0xFFFFFFEB;
	@Generated
	public static final int INSTPROXY_E_CONTAINER_REMOVAL_FAILED = 0xFFFFFFEA;
	@Generated
	public static final int INSTPROXY_E_EMBEDDED_PROFILE_INSTALL_FAILED = 0xFFFFFFE9;
	@Generated
	public static final int INSTPROXY_E_EXECUTABLE_TWIDDLE_FAILED = 0xFFFFFFE8;
	@Generated
	public static final int INSTPROXY_E_EXISTENCE_CHECK_FAILED = 0xFFFFFFE7;
	@Generated
	public static final int INSTPROXY_E_INSTALL_MAP_UPDATE_FAILED = 0xFFFFFFE6;
	@Generated
	public static final int INSTPROXY_E_MANIFEST_CAPTURE_FAILED = 0xFFFFFFE5;
	@Generated
	public static final int INSTPROXY_E_MAP_GENERATION_FAILED = 0xFFFFFFE4;
	@Generated
	public static final int INSTPROXY_E_MISSING_BUNDLE_EXECUTABLE = 0xFFFFFFE3;
	@Generated
	public static final int INSTPROXY_E_MISSING_BUNDLE_IDENTIFIER = 0xFFFFFFE2;
	@Generated
	public static final int INSTPROXY_E_MISSING_BUNDLE_PATH = 0xFFFFFFE1;
	@Generated
	public static final int INSTPROXY_E_MISSING_CONTAINER = 0xFFFFFFE0;
	@Generated
	public static final int INSTPROXY_E_NOTIFICATION_FAILED = 0xFFFFFFDF;
	@Generated
	public static final int INSTPROXY_E_PACKAGE_EXTRACTION_FAILED = 0xFFFFFFDE;
	@Generated
	public static final int INSTPROXY_E_PACKAGE_INSPECTION_FAILED = 0xFFFFFFDD;
	@Generated
	public static final int INSTPROXY_E_PACKAGE_MOVE_FAILED = 0xFFFFFFDC;
	@Generated
	public static final int INSTPROXY_E_PATH_CONVERSION_FAILED = 0xFFFFFFDB;
	@Generated
	public static final int INSTPROXY_E_RESTORE_CONTAINER_FAILED = 0xFFFFFFDA;
	@Generated
	public static final int INSTPROXY_E_SEATBELT_PROFILE_REMOVAL_FAILED = 0xFFFFFFD9;
	@Generated
	public static final int INSTPROXY_E_STAGE_CREATION_FAILED = 0xFFFFFFD8;
	@Generated
	public static final int INSTPROXY_E_SYMLINK_FAILED = 0xFFFFFFD7;
	@Generated
	public static final int INSTPROXY_E_UNKNOWN_COMMAND = 0xFFFFFFD6;
	@Generated
	public static final int INSTPROXY_E_ITUNES_ARTWORK_CAPTURE_FAILED = 0xFFFFFFD5;
	@Generated
	public static final int INSTPROXY_E_ITUNES_METADATA_CAPTURE_FAILED = 0xFFFFFFD4;
	@Generated
	public static final int INSTPROXY_E_DEVICE_OS_VERSION_TOO_LOW = 0xFFFFFFD3;
	@Generated
	public static final int INSTPROXY_E_DEVICE_FAMILY_NOT_SUPPORTED = 0xFFFFFFD2;
	@Generated
	public static final int INSTPROXY_E_PACKAGE_PATCH_FAILED = 0xFFFFFFD1;
	@Generated
	public static final int INSTPROXY_E_INCORRECT_ARCHITECTURE = 0xFFFFFFD0;
	@Generated
	public static final int INSTPROXY_E_PLUGIN_COPY_FAILED = 0xFFFFFFCF;
	@Generated
	public static final int INSTPROXY_E_BREADCRUMB_FAILED = 0xFFFFFFCE;
	@Generated
	public static final int INSTPROXY_E_BREADCRUMB_UNLOCK_FAILED = 0xFFFFFFCD;
	@Generated
	public static final int INSTPROXY_E_GEOJSON_CAPTURE_FAILED = 0xFFFFFFCC;
	@Generated
	public static final int INSTPROXY_E_NEWSSTAND_ARTWORK_CAPTURE_FAILED = 0xFFFFFFCB;
	@Generated
	public static final int INSTPROXY_E_MISSING_COMMAND = 0xFFFFFFCA;
	@Generated
	public static final int INSTPROXY_E_NOT_ENTITLED = 0xFFFFFFC9;
	@Generated
	public static final int INSTPROXY_E_MISSING_PACKAGE_PATH = 0xFFFFFFC8;
	@Generated
	public static final int INSTPROXY_E_MISSING_CONTAINER_PATH = 0xFFFFFFC7;
	@Generated
	public static final int INSTPROXY_E_MISSING_APPLICATION_IDENTIFIER = 0xFFFFFFC6;
	@Generated
	public static final int INSTPROXY_E_MISSING_ATTRIBUTE_VALUE = 0xFFFFFFC5;
	@Generated
	public static final int INSTPROXY_E_LOOKUP_FAILED = 0xFFFFFFC4;
	@Generated
	public static final int INSTPROXY_E_DICT_CREATION_FAILED = 0xFFFFFFC3;
	@Generated
	public static final int INSTPROXY_E_INSTALL_PROHIBITED = 0xFFFFFFC2;
	@Generated
	public static final int INSTPROXY_E_UNINSTALL_PROHIBITED = 0xFFFFFFC1;
	@Generated
	public static final int INSTPROXY_E_MISSING_BUNDLE_VERSION = 0xFFFFFFC0;
}
