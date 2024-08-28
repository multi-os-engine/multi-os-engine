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

package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 8.3
 */
@Generated
public final class PKPaymentButtonType {
    /**
     * API-Since: 8.3
     */
    @Generated @NInt public static final long Plain = 0x0000000000000000L;
    /**
     * API-Since: 8.3
     */
    @Generated @NInt public static final long Buy = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long SetUp = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long InStore = 0x0000000000000003L;
    /**
     * API-Since: 10.2
     */
    @Generated @NInt public static final long Donate = 0x0000000000000004L;

    @Generated
    private PKPaymentButtonType() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Checkout = 0x0000000000000005L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Book = 0x0000000000000006L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Subscribe = 0x0000000000000007L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Reload = 0x0000000000000008L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long AddMoney = 0x0000000000000009L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TopUp = 0x000000000000000AL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Order = 0x000000000000000BL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Rent = 0x000000000000000CL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Support = 0x000000000000000DL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Contribute = 0x000000000000000EL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Tip = 0x000000000000000FL;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Continue = 0x0000000000000010L;
}
