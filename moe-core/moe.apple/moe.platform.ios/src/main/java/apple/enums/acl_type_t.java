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
 * 23.2.6 Individual ACL types
 */
@Generated
public final class acl_type_t {
    @Generated public static final int ACL_TYPE_EXTENDED = 0x00000100;
    /**
     * Posix 1003.1e types - not supported
     */
    @Generated public static final int ACL_TYPE_ACCESS = 0x00000000;
    /**
     * Posix 1003.1e types - not supported
     */
    @Generated public static final int ACL_TYPE_DEFAULT = 0x00000001;
    /**
     * The following types are defined on FreeBSD/Linux - not supported
     */
    @Generated public static final int ACL_TYPE_AFS = 0x00000002;
    /**
     * The following types are defined on FreeBSD/Linux - not supported
     */
    @Generated public static final int ACL_TYPE_CODA = 0x00000003;
    /**
     * The following types are defined on FreeBSD/Linux - not supported
     */
    @Generated public static final int ACL_TYPE_NTFS = 0x00000004;
    /**
     * The following types are defined on FreeBSD/Linux - not supported
     */
    @Generated public static final int ACL_TYPE_NWFS = 0x00000005;

    @Generated
    private acl_type_t() {
    }
}
