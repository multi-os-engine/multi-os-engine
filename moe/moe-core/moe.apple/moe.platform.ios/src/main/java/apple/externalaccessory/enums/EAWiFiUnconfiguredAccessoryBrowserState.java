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
 * @enum EAWiFiUnconfiguredAccessoryBrowserState
 * 
 * @discussion Represents the current state of a EAWiFiUnconfiguredAccessoryBrowser.
 * 
 * @constant EAWiFiUnconfiguredAccessoryBrowserStateWiFiUnavailable  Wi-Fi is unavailable due to the user placing the device in Airplane Mode or explicitly turning Wi-Fi off.
 * @constant EAWiFiUnconfiguredAccessoryBrowserStateStopped          The browser is not actively searching for unconfigured accessories.
 * @constant EAWiFiUnconfiguredAccessoryBrowserStateSearching        The browser is actively searching for unconfigured accessory.
 * @constant EAWiFiUnconfiguredAccessoryBrowserStateConfiguring      The browser is actively configuring an accessory.
 */
@Generated
public final class EAWiFiUnconfiguredAccessoryBrowserState {
    @Generated @NInt public static final long WiFiUnavailable = 0x0000000000000000L;
    @Generated @NInt public static final long Stopped = 0x0000000000000001L;
    @Generated @NInt public static final long Searching = 0x0000000000000002L;
    @Generated @NInt public static final long Configuring = 0x0000000000000003L;

    @Generated
    private EAWiFiUnconfiguredAccessoryBrowserState() {
    }
}
