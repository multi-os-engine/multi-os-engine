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

@Generated
public final class clockid_t {
    @Generated public static final int _CLOCK_REALTIME = 0x00000000;
    @Generated public static final int _CLOCK_MONOTONIC = 0x00000006;
    @Generated public static final int _CLOCK_MONOTONIC_RAW = 0x00000004;
    @Generated public static final int _CLOCK_MONOTONIC_RAW_APPROX = 0x00000005;
    @Generated public static final int _CLOCK_UPTIME_RAW = 0x00000008;
    @Generated public static final int _CLOCK_UPTIME_RAW_APPROX = 0x00000009;
    @Generated public static final int _CLOCK_PROCESS_CPUTIME_ID = 0x0000000C;
    @Generated public static final int _CLOCK_THREAD_CPUTIME_ID = 0x00000010;

    @Generated
    private clockid_t() {
    }
}
