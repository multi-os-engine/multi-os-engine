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

package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;

/**
 * CMError
 * <p>
 * Discussion:
 * Error returned as code to NSError from CoreMotion.
 */
@Generated
public final class CMError {
    @Generated public static final int CMErrorNULL = 0x00000064;
    @Generated public static final int CMErrorDeviceRequiresMovement = 0x00000065;
    @Generated public static final int CMErrorTrueNorthNotAvailable = 0x00000066;
    @Generated public static final int CMErrorUnknown = 0x00000067;
    @Generated public static final int CMErrorMotionActivityNotAvailable = 0x00000068;
    @Generated public static final int CMErrorMotionActivityNotAuthorized = 0x00000069;
    @Generated public static final int CMErrorMotionActivityNotEntitled = 0x0000006A;
    @Generated public static final int CMErrorInvalidParameter = 0x0000006B;
    @Generated public static final int CMErrorInvalidAction = 0x0000006C;
    @Generated public static final int CMErrorNotAvailable = 0x0000006D;
    @Generated public static final int CMErrorNotEntitled = 0x0000006E;
    @Generated public static final int CMErrorNotAuthorized = 0x0000006F;

    @Generated
    private CMError() {
    }

    @Generated public static final int CMErrorNilData = 0x00000070;
    @Generated public static final int CMErrorSize = 0x00000071;
}
