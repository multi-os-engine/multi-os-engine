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

package apple.security.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] SecTrustResultType
 * <p>
 * Specifies the trust result type.
 * <p>
 * SecTrustResultType results have two dimensions.  They specify
 * both whether evaluation succeeded and whether this is because of a user
 * decision.  The commonly expected result is kSecTrustResultUnspecified,
 * which indicates a positive result that wasn't decided by the user.  The
 * common failure is kSecTrustResultRecoverableTrustFailure, which means a
 * negative result.  kSecTrustResultProceed and kSecTrustResultDeny are the
 * positive and negative result respectively when decided by the user.  User
 * decisions are persisted through the use of SecTrustCopyExceptions() and
 * SecTrustSetExceptions().  Finally, kSecTrustResultFatalTrustFailure is a
 * negative result that must not be circumvented.
 * [@constant] kSecTrustResultInvalid Indicates an invalid setting or result.
 * This result usually means that SecTrustEvaluate has not yet been called.
 * [@constant] kSecTrustResultProceed Indicates you may proceed.  This value
 * may be returned by the SecTrustEvaluate function or stored as part of
 * the user trust settings.
 * [@constant] kSecTrustResultConfirm Indicates confirmation with the user
 * is required before proceeding.  Important: this value is no longer returned
 * or supported by SecTrustEvaluate or the SecTrustSettings API starting in
 * OS X 10.5; its use is deprecated in OS X 10.9 and later, as well as in iOS.
 * [@constant] kSecTrustResultDeny Indicates a user-configured deny; do not
 * proceed. This value may be returned by the SecTrustEvaluate function
 * or stored as part of the user trust settings.
 * [@constant] kSecTrustResultUnspecified Indicates the evaluation succeeded
 * and the certificate is implicitly trusted, but user intent was not
 * explicitly specified.  This value may be returned by the SecTrustEvaluate
 * function or stored as part of the user trust settings.
 * [@constant] kSecTrustResultRecoverableTrustFailure Indicates a trust policy
 * failure which can be overridden by the user.  This value may be returned
 * by the SecTrustEvaluate function but not stored as part of the user
 * trust settings.
 * [@constant] kSecTrustResultFatalTrustFailure Indicates a trust failure
 * which cannot be overridden by the user.  This value may be returned by the
 * SecTrustEvaluate function but not stored as part of the user trust
 * settings.
 * [@constant] kSecTrustResultOtherError Indicates a failure other than that
 * of trust evaluation. This value may be returned by the SecTrustEvaluate
 * function but not stored as part of the user trust settings.
 */
@Generated
public final class SecTrustResultType {
    @Generated public static final int Invalid = 0x00000000;
    @Generated public static final int Proceed = 0x00000001;
    @Deprecated @Generated public static final int Confirm = 0x00000002;
    @Generated public static final int Deny = 0x00000003;
    @Generated public static final int Unspecified = 0x00000004;
    @Generated public static final int RecoverableTrustFailure = 0x00000005;
    @Generated public static final int FatalTrustFailure = 0x00000006;
    @Generated public static final int OtherError = 0x00000007;

    @Generated
    private SecTrustResultType() {
    }
}
