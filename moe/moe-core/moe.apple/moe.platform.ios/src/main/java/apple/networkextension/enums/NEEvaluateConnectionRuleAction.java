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
 * [@typedef] NEEvaluateConnectionRuleAction
 * 
 * Evaluate Connection rule actions
 */
@Generated
public final class NEEvaluateConnectionRuleAction {
    /**
     * [@const] NEEvaluateConnectionRuleActionConnectIfNeeded Start the VPN connection if the destination host is not accessible directly
     */
    @Generated @NInt public static final long ConnectIfNeeded = 0x0000000000000001L;
    /**
     * [@const] NEEvaluateConnectionRuleActionNeverConnect Do not start the VPN connection
     */
    @Generated @NInt public static final long NeverConnect = 0x0000000000000002L;

    @Generated
    private NEEvaluateConnectionRuleAction() {
    }
}
