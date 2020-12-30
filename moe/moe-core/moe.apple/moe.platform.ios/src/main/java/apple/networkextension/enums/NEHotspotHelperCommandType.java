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
 * [@typedef] NEHotspotHelperCommandType
 * 
 * The type of the NEHotspotHelperCommand object.
 * [@const] kNEHotspotHelperCommandTypeNone Placeholder for the null command.
 * [@const] kNEHotspotHelperCommandTypeFilterScanList Filter the Wi-Fi scan list.
 * [@const] kNEHotspotHelperCommandTypeEvaluate Evaluate the network.
 * [@const] kNEHotspotHelperCommandTypeAuthenticate Authenticate to the network.
 * [@const] kNEHotspotHelperCommandTypePresentUI Present user interface.
 * [@const] kNEHotspotHelperCommandTypeMaintain Maintain the network.
 * [@const] kNEHotspotHelperCommandTypeLogoff Logoff the network.
 */
@Generated
public final class NEHotspotHelperCommandType {
    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long FilterScanList = 0x0000000000000001L;
    @Generated @NInt public static final long Evaluate = 0x0000000000000002L;
    @Generated @NInt public static final long Authenticate = 0x0000000000000003L;
    @Generated @NInt public static final long PresentUI = 0x0000000000000004L;
    @Generated @NInt public static final long Maintain = 0x0000000000000005L;
    @Generated @NInt public static final long Logoff = 0x0000000000000006L;

    @Generated
    private NEHotspotHelperCommandType() {
    }
}
