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

package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @typedef NEProviderStopReason
 * @abstract Provider stop reasons
 */
@Generated
public final class NEProviderStopReason {
    /**
     * @const NEProviderStopReasonNone No specific reason.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * @const NEProviderStopReasonUserInitiated The user stopped the provider.
     */
    @Generated @NInt public static final long UserInitiated = 0x0000000000000001L;
    /**
     * @const NEProviderStopReasonProviderFailed The provider failed.
     */
    @Generated @NInt public static final long ProviderFailed = 0x0000000000000002L;
    /**
     * @const NEProviderStopReasonNoNetworkAvailable There is no network connectivity.
     */
    @Generated @NInt public static final long NoNetworkAvailable = 0x0000000000000003L;
    /**
     * @const NEProviderStopReasonUnrecoverableNetworkChange The device attached to a new network.
     */
    @Generated @NInt public static final long UnrecoverableNetworkChange = 0x0000000000000004L;
    /**
     * @const NEProviderStopReasonProviderDisabled The provider was disabled.
     */
    @Generated @NInt public static final long ProviderDisabled = 0x0000000000000005L;
    /**
     * @const NEProviderStopReasonAuthenticationCanceled The authentication process was cancelled.
     */
    @Generated @NInt public static final long AuthenticationCanceled = 0x0000000000000006L;
    /**
     * @const NEProviderStopReasonConfigurationFailed The provider could not be configured.
     */
    @Generated @NInt public static final long ConfigurationFailed = 0x0000000000000007L;
    /**
     * @const NEProviderStopReasonIdleTimeout The provider was idle for too long.
     */
    @Generated @NInt public static final long IdleTimeout = 0x0000000000000008L;
    /**
     * @const NEProviderStopReasonConfigurationDisabled The associated configuration was disabled.
     */
    @Generated @NInt public static final long ConfigurationDisabled = 0x0000000000000009L;
    /**
     * @const NEProviderStopReasonConfigurationRemoved The associated configuration was deleted.
     */
    @Generated @NInt public static final long ConfigurationRemoved = 0x000000000000000AL;
    /**
     * @const NEProviderStopReasonSuperceded A high-priority configuration was started.
     */
    @Generated @NInt public static final long Superceded = 0x000000000000000BL;
    /**
     * @const NEProviderStopReasonUserLogout The user logged out.
     */
    @Generated @NInt public static final long UserLogout = 0x000000000000000CL;
    /**
     * @const NEProviderStopReasonUserSwitch The active user changed.
     */
    @Generated @NInt public static final long UserSwitch = 0x000000000000000DL;
    /**
     * @const NEProviderStopReasonConnectionFailed Failed to establish connection.
     */
    @Generated @NInt public static final long ConnectionFailed = 0x000000000000000EL;

    @Generated
    private NEProviderStopReason() {
    }

    /**
     * @const NEProviderStopReasonSleep The device went to sleep and disconnectOnSleep is enabled in the configuration
     */
    @Generated @NInt public static final long Sleep = 0x000000000000000FL;
    /**
     * @const NEProviderStopReasonAppUpdate The NEProvider is being updated
     */
    @Generated @NInt public static final long AppUpdate = 0x0000000000000010L;
}
