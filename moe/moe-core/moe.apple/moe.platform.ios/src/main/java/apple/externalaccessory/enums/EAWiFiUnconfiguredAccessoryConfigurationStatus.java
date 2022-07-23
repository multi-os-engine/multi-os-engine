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

package apple.externalaccessory.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] EAWiFiUnconfiguredAccessoryConfigurationStatus
 * <p>
 * Represents the state of an EAWiFiUnconfiguredAccessory configuration process.
 * <p>
 * [@constant] EAWiFiUnconfiguredAccessoryConfigurationStatusSuccess The configuration of the accessory succeeded.
 * [@constant] EAWiFiUnconfiguredAccessoryConfigurationStatusUserCancelledConfiguration The user cancelled the
 * configuration process.
 * [@constant] EAWiFiUnconfiguredAccessoryConfigurationStatusFailed The configuration failed.
 */
@Generated
public final class EAWiFiUnconfiguredAccessoryConfigurationStatus {
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    @Generated @NInt public static final long UserCancelledConfiguration = 0x0000000000000001L;
    @Generated @NInt public static final long Failed = 0x0000000000000002L;

    @Generated
    private EAWiFiUnconfiguredAccessoryConfigurationStatus() {
    }
}
