/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.enums;

import org.moe.natj.general.ann.Generated;

/**
 * 23.2.2 Individual object access permissions - nonstandard
 */
@Generated
public final class acl_perm_t {
    @Generated public static final int ACL_READ_DATA = 0x00000002;
    @Generated public static final int ACL_LIST_DIRECTORY = 0x00000002;
    @Generated public static final int ACL_WRITE_DATA = 0x00000004;
    @Generated public static final int ACL_ADD_FILE = 0x00000004;
    @Generated public static final int ACL_EXECUTE = 0x00000008;
    @Generated public static final int ACL_SEARCH = 0x00000008;
    @Generated public static final int ACL_DELETE = 0x00000010;
    @Generated public static final int ACL_APPEND_DATA = 0x00000020;
    @Generated public static final int ACL_ADD_SUBDIRECTORY = 0x00000020;
    @Generated public static final int ACL_DELETE_CHILD = 0x00000040;
    @Generated public static final int ACL_READ_ATTRIBUTES = 0x00000080;
    @Generated public static final int ACL_WRITE_ATTRIBUTES = 0x00000100;
    @Generated public static final int ACL_READ_EXTATTRIBUTES = 0x00000200;
    @Generated public static final int ACL_WRITE_EXTATTRIBUTES = 0x00000400;
    @Generated public static final int ACL_READ_SECURITY = 0x00000800;
    @Generated public static final int ACL_WRITE_SECURITY = 0x00001000;
    @Generated public static final int ACL_CHANGE_OWNER = 0x00002000;
    @Generated public static final int ACL_SYNCHRONIZE = 0x00100000;

    @Generated
    private acl_perm_t() {
    }
}
