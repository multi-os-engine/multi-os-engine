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
 * @typedef NETunnelProviderError
 * @abstract Tunnel Provider error codes
 */
@Generated
public final class NETunnelProviderError {
    /**
     * @const NETunnelProviderErrorNetworkSettingsInvalid The provided tunnel network settings are invalid.
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    /**
     * @const NETunnelProviderErrorNetworkSettingsCanceled The request to set/clear the tunnel network settings was canceled.
     */
    @Generated @NInt public static final long Canceled = 0x0000000000000002L;
    /**
     * @const NETunnelProviderErrorNetworkSettingsFailed The request to set/clear the tunnel network settings failed.
     */
    @Generated @NInt public static final long Failed = 0x0000000000000003L;

    @Generated
    private NETunnelProviderError() {
    }
}
