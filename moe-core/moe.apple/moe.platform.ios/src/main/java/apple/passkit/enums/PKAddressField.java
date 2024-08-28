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
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 8.0
 * Deprecated-Since: 11.0
 * Deprecated-Message: Use PKContactField and -requiredShippingContactFields / -requiredBillingContactFields
 */
@Deprecated
@Generated
public final class PKAddressField {
    /**
     * No address fields required.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use PKContactField and -requiredShippingContactFields / -requiredBillingContactFields
     */
    @Deprecated @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Full street address including name, street, city, state/province, postal code, country.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use PKContactField and -requiredShippingContactFields / -requiredBillingContactFields
     */
    @Deprecated @Generated @NUInt public static final long PostalAddress = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use PKContactField and -requiredShippingContactFields / -requiredBillingContactFields
     */
    @Deprecated @Generated @NUInt public static final long Phone = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use PKContactField and -requiredShippingContactFields / -requiredBillingContactFields
     */
    @Deprecated @Generated @NUInt public static final long Email = 0x0000000000000004L;
    /**
     * API-Since: 8.3
     */
    @Generated @NUInt public static final long Name = 0x0000000000000008L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use PKContactField and -requiredShippingContactFields / -requiredBillingContactFields
     */
    @Deprecated @Generated @NUInt public static final long All = 0x000000000000000FL;

    @Generated
    private PKAddressField() {
    }
}
