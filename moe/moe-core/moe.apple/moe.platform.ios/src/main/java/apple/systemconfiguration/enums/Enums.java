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

package apple.systemconfiguration.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    /**
     * Success
     */
    @Generated public static final int kSCStatusOK = 0x00000000;
    /**
     * Non-specific failure
     */
    @Generated public static final int kSCStatusFailed = 0x000003E9;
    /**
     * Invalid argument
     */
    @Generated public static final int kSCStatusInvalidArgument = 0x000003EA;
    /**
     * Permission denied
     * - must be root to obtain lock
     * - could not create access/create preferences
     */
    @Generated public static final int kSCStatusAccessError = 0x000003EB;
    /**
     * No such key
     */
    @Generated public static final int kSCStatusNoKey = 0x000003EC;
    /**
     * Key already defined
     */
    @Generated public static final int kSCStatusKeyExists = 0x000003ED;
    /**
     * Lock already held
     */
    @Generated public static final int kSCStatusLocked = 0x000003EE;
    /**
     * Lock required for this operation
     */
    @Generated public static final int kSCStatusNeedLock = 0x000003EF;
    /**
     * Configuration daemon session not active
     */
    @Generated public static final int kSCStatusNoStoreSession = 0x000007D1;
    /**
     * Configuration daemon not (no longer) available
     */
    @Generated public static final int kSCStatusNoStoreServer = 0x000007D2;
    /**
     * Notifier is currently active
     */
    @Generated public static final int kSCStatusNotifierActive = 0x000007D3;
    /**
     * Preference session not active
     */
    @Generated public static final int kSCStatusNoPrefsSession = 0x00000BB9;
    /**
     * Preferences update currently in progress
     */
    @Generated public static final int kSCStatusPrefsBusy = 0x00000BBA;
    /**
     * Configuration file not found
     */
    @Generated public static final int kSCStatusNoConfigFile = 0x00000BBB;
    /**
     * No such link
     */
    @Generated public static final int kSCStatusNoLink = 0x00000BBC;
    /**
     * Write attempted on stale version of object
     */
    @Generated public static final int kSCStatusStale = 0x00000BBD;
    /**
     * Maximum link count exceeded
     */
    @Generated public static final int kSCStatusMaxLink = 0x00000BBE;
    /**
     * Network reachability cannot be determined
     */
    @Generated public static final int kSCStatusReachabilityUnknown = 0x00000FA1;
    /**
     * enabled, active, running, ...
     */
    @Generated public static final int kSCBondStatusOK = 0x00000000;
    /**
     * The link state was not valid (i.e. down, half-duplex, wrong speed)
     */
    @Generated public static final int kSCBondStatusLinkInvalid = 0x00000001;
    /**
     * The port on the switch that the device is connected doesn't seem to have 802.3ad Link Aggregation enabled
     */
    @Generated public static final int kSCBondStatusNoPartner = 0x00000002;
    /**
     * We're talking to a partner, but the link aggregation group is different from the one that's active
     */
    @Generated public static final int kSCBondStatusNotInActiveGroup = 0x00000003;
    /**
     * Non-specific failure
     */
    @Generated public static final int kSCBondStatusUnknown = 0x000003E7;
    @Generated public static final int kSCNetworkFlagsTransientConnection = 0x00000001;
    @Generated public static final int kSCNetworkFlagsReachable = 0x00000002;
    @Generated public static final int kSCNetworkFlagsConnectionRequired = 0x00000004;
    @Generated public static final int kSCNetworkFlagsConnectionAutomatic = 0x00000008;
    @Generated public static final int kSCNetworkFlagsInterventionRequired = 0x00000010;
    @Generated public static final int kSCNetworkFlagsIsLocalAddress = 0x00010000;
    @Generated public static final int kSCNetworkFlagsIsDirect = 0x00020000;

    @Generated
    private Enums() {
    }
}
