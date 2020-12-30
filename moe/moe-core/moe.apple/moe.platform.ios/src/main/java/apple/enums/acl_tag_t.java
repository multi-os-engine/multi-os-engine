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
 * 23.2.5 ACL entry tag type bits - nonstandard
 */
@Generated
public final class acl_tag_t {
    @Generated public static final int ACL_UNDEFINED_TAG = 0x00000000;
    @Generated public static final int ACL_EXTENDED_ALLOW = 0x00000001;
    @Generated public static final int ACL_EXTENDED_DENY = 0x00000002;

    @Generated
    private acl_tag_t() {
    }
}
