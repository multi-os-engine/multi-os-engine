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
 * [@typedef] NEOnDemandRuleAction
 * <p>
 * On Demand rule actions
 */
@Generated
public final class NEOnDemandRuleAction {
    /**
     * [@const] NEOnDemandRuleActionConnect Start the VPN connection
     */
    @Generated @NInt public static final long Connect = 0x0000000000000001L;
    /**
     * [@const] NEOnDemandRuleActionDisconnect Do not start the VPN connection, and disconnect the VPN connection if it is not currently disconnected
     */
    @Generated @NInt public static final long Disconnect = 0x0000000000000002L;
    /**
     * [@const] NEOnDemandRuleActionEvaluateConnection Start the VPN after evaluating the destination host being accessed against the rule's connection rules
     */
    @Generated @NInt public static final long EvaluateConnection = 0x0000000000000003L;
    /**
     * [@const] NEOnDemandRuleActionIgnore Do not start the VPN connection, and leave the VPN connection in its current state
     */
    @Generated @NInt public static final long Ignore = 0x0000000000000004L;

    @Generated
    private NEOnDemandRuleAction() {
    }
}
