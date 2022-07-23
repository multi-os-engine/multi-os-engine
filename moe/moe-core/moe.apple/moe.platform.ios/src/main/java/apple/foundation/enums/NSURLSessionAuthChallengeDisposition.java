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
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSURLSessionAuthChallengeDisposition {
    /**
     * Use the specified credential, which may be nil
     */
    @Generated @NInt public static final long UseCredential = 0x0000000000000000L;
    /**
     * Default handling for the challenge - as if this delegate were not implemented; the credential parameter is
     * ignored.
     */
    @Generated @NInt public static final long PerformDefaultHandling = 0x0000000000000001L;
    /**
     * The entire request will be canceled; the credential parameter is ignored.
     */
    @Generated @NInt public static final long CancelAuthenticationChallenge = 0x0000000000000002L;
    /**
     * This challenge is rejected and the next authentication protection space should be tried; the credential parameter
     * is ignored.
     */
    @Generated @NInt public static final long RejectProtectionSpace = 0x0000000000000003L;

    @Generated
    private NSURLSessionAuthChallengeDisposition() {
    }
}
