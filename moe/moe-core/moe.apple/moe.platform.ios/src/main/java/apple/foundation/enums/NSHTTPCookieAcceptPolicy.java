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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @enum NSHTTPCookieAcceptPolicy
 * @abstract Values for the different cookie accept policies
 * @constant NSHTTPCookieAcceptPolicyAlways Accept all cookies
 * @constant NSHTTPCookieAcceptPolicyNever Reject all cookies
 * @constant NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain Accept cookies
 * only from the main document domain
 */
@Generated
public final class NSHTTPCookieAcceptPolicy {
    @Generated @NUInt public static final long Always = 0x0000000000000000L;
    @Generated @NUInt public static final long Never = 0x0000000000000001L;
    @Generated @NUInt public static final long OnlyFromMainDocumentDomain = 0x0000000000000002L;

    @Generated
    private NSHTTPCookieAcceptPolicy() {
    }
}
