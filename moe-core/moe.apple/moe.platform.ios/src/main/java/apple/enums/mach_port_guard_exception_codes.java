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
 * 
 * Arguments are documented in doc/mach_ipc/guard_exceptions.md,
 * please update when adding a new type.
 * 
 * Note: these had been designed as bitfields,
 * hence the weird spaced values,
 * but are truly an enum, please add new values in the "holes".
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
     * really kGUARD_EXC_ALREADY_GUARDED
     */
    @Generated public static final int INVALID_ARGUMENT = 0x00000800;
    /**
     * unused
     */
    @Generated public static final int RIGHT_EXISTS = 0x00001000;
    /**
     * unused
     */
    @Generated public static final int KERN_NO_SPACE = 0x00002000;
    /**
     * really kGUARD_EXC_INVALID_PDREQUEST
     */
    @Generated public static final int KERN_FAILURE = 0x00004000;
    /**
     * unused
     */
    @Generated public static final int KERN_RESOURCE = 0x00008000;
    @Generated public static final int SEND_INVALID_REPLY = 0x00010000;
    @Generated public static final int SEND_INVALID_VOUCHER = 0x00020000;
    @Generated public static final int SEND_INVALID_RIGHT = 0x00040000;
    @Generated public static final int RCV_INVALID_NAME = 0x00080000;
    /**
     * for development only
     */
    @Generated public static final int RCV_GUARDED_DESC = 0x00100000;
    @Generated public static final int MSG_FILTERED = 0x00000080;
    @Generated public static final int MOD_REFS_NON_FATAL = 0x00200000;
    /**
     * unused
     */
    @Generated public static final int IMMOVABLE_NON_FATAL = 0x00400000;
    @Generated public static final int INVALID_OPTIONS = 0x00000003;
    @Generated public static final int REQUIRE_REPLY_PORT_SEMANTICS = 0x0000000A;
    @Generated public static final int THREAD_SET_STATE = 0x00000005;
    @Generated public static final int EXCEPTION_BEHAVIOR_ENFORCE = 0x00000006;
    /**
     * unused, for future sp defense enablement
     */
    @Generated public static final int SERVICE_PORT_VIOLATION_FATAL = 0x00000007;
    /**
     * unused, for future sp defense enablement
     */
    @Generated public static final int SERVICE_PORT_VIOLATION_NON_FATAL = 0x00100001;
    @Generated public static final int PROVISIONAL_REPLY_PORT = 0x00100002;
    /**
     * never sent
     */
    @Generated public static final int NONE = 0x00000000;
    @Generated public static final int KOBJECT_REPLY_PORT_SEMANTICS = 0x00000009;
    @Generated public static final int INVALID_NOTIFICATION_REQ = 0x00000041;
    @Generated public static final int INVALID_MPO_ENTITLEMENT = 0x00000042;
    @Generated public static final int DESCRIPTOR_VIOLATION = 0x00000043;
    /**
     * unused
     */
    @Generated public static final int OOL_PORT_ARRAY_CREATION = 0x00100003;
    @Generated public static final int MOVE_PROVISIONAL_REPLY_PORT = 0x00100004;
    @Generated public static final int REPLY_PORT_SINGLE_SO_RIGHT = 0x00100005;
}
