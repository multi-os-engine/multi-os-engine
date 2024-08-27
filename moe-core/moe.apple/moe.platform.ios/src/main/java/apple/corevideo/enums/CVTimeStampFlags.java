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

package apple.corevideo.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Flags for the CVTimeStamp structure
 */
@Generated
public final class CVTimeStampFlags {
    @Generated public static final long VideoTimeValid = 0x0000000000000001L;
    @Generated public static final long HostTimeValid = 0x0000000000000002L;
    @Generated public static final long SMPTETimeValid = 0x0000000000000004L;
    @Generated public static final long VideoRefreshPeriodValid = 0x0000000000000008L;
    @Generated public static final long RateScalarValid = 0x0000000000000010L;
    /**
     * There are flags for each field to make it easier to detect interlaced vs progressive output
     */
    @Generated public static final long TopField = 0x0000000000010000L;
    /**
     * There are flags for each field to make it easier to detect interlaced vs progressive output
     */
    @Generated public static final long BottomField = 0x0000000000020000L;
    /**
     * Some commonly used combinations of timestamp flags
     */
    @Generated public static final long VideoHostTimeValid = 0x0000000000000003L;
    /**
     * Some commonly used combinations of timestamp flags
     */
    @Generated public static final long IsInterlaced = 0x0000000000030000L;

    @Generated
    private CVTimeStampFlags() {
    }
}
