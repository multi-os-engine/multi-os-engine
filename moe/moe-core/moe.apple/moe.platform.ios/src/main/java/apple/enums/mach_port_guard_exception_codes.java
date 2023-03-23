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
 * Reasons for exception for a guarded mach port
 */
@Generated
public final class mach_port_guard_exception_codes {
    @Generated public static final int DESTROY = 0x00000001;
    @Generated public static final int MOD_REFS = 0x00000002;
    @Generated public static final int SET_CONTEXT = 0x00000004;
    @Generated public static final int UNGUARDED = 0x00000008;
    @Generated public static final int INCORRECT_GUARD = 0x00000010;

    @Generated
    private mach_port_guard_exception_codes() {
    }

    @Generated public static final int IMMOVABLE = 0x00000020;
    @Generated public static final int STRICT_REPLY = 0x00000040;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int INVALID_RIGHT = 0x00000100;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int INVALID_NAME = 0x00000200;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int INVALID_VALUE = 0x00000400;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int INVALID_ARGUMENT = 0x00000800;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int RIGHT_EXISTS = 0x00001000;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int KERN_NO_SPACE = 0x00002000;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int KERN_FAILURE = 0x00004000;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int KERN_RESOURCE = 0x00008000;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int SEND_INVALID_REPLY = 0x00010000;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int SEND_INVALID_VOUCHER = 0x00020000;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int SEND_INVALID_RIGHT = 0x00040000;
    /**
     * start of [optionally] non-fatal guards
     */
    @Generated public static final int RCV_INVALID_NAME = 0x00080000;
    /**
     * for development only
     */
    @Generated public static final int RCV_GUARDED_DESC = 0x00100000;
    @Generated public static final int MSG_FILTERED = 0x00000080;
    @Generated public static final int MOD_REFS_NON_FATAL = 0x00200000;
    @Generated public static final int IMMOVABLE_NON_FATAL = 0x00400000;
    @Generated public static final int INVALID_OPTIONS = 0x00000003;
    @Generated public static final int REQUIRE_REPLY_PORT_SEMANTICS = 0x00800000;
}
