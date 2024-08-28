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
 * [@typedef] NWPathStatus
 * 
 * Path status values
 * 
 * API-Since: 9.0
 */
@Generated
public final class NWPathStatus {
    /**
     * [@const] NWPathStatusInvalid The path cannot be evaluated.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * [@const] NWPathStatusSatisfied The path is ready to be used for traffic.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Satisfied = 0x0000000000000001L;
    /**
     * [@const] NWPathStatusUnsatisfied The network for this connection is not available.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Unsatisfied = 0x0000000000000002L;
    /**
     * [@const] NWPathStatusSatisfiable The path may become satisfied upon
     * a connection attempt.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Satisfiable = 0x0000000000000003L;

    @Generated
    private NWPathStatus() {
    }
}
