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
 * [@typedef] SecPadding
 * 
 * Supported padding types.
 * 
 * API-Since: 2.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: Replaced with SecKeyAlgorithm
 */
@Deprecated
@Generated
public final class SecPadding {
    /**
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int None = 0x00000000;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1 = 0x00000001;
    /**
     * __OSX_UNAVAILABLE __IOS_AVAILABLE(2.0) __TVOS_AVAILABLE(10.0) __WATCHOS_AVAILABLE(3.0),
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int OAEP = 0x00000002;
    /**
     * For SecKeyRawSign/SecKeyRawVerify only,
     * ECDSA signature is raw byte format {r,s}, big endian.
     * First half is r, second half is s
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int SigRaw = 0x00004000;
    /**
     * __OSX_DEPRECATED(10.0, 10.12, "MD2 is deprecated") __IOS_DEPRECATED(2.0, 5.0, "MD2 is deprecated")
     * __TVOS_UNAVAILABLE __WATCHOS_UNAVAILABLE,
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1MD2 = 0x00008000;
    /**
     * __OSX_DEPRECATED(10.0, 10.12, "MD5 is deprecated") __IOS_DEPRECATED(2.0, 5.0, "MD5 is deprecated")
     * __TVOS_UNAVAILABLE __WATCHOS_UNAVAILABLE,
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1MD5 = 0x00008001;
    /**
     * For SecKeyRawSign/SecKeyRawVerify only, data to be signed is a SHA1
     * hash; standard ASN.1 padding will be done, as well as PKCS1 padding
     * of the underlying RSA operation.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1SHA1 = 0x00008002;
    /**
     * __OSX_UNAVAILABLE __IOS_AVAILABLE(2.0),
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1SHA224 = 0x00008003;
    /**
     * __OSX_UNAVAILABLE __IOS_AVAILABLE(2.0),
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1SHA256 = 0x00008004;
    /**
     * __OSX_UNAVAILABLE __IOS_AVAILABLE(2.0),
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1SHA384 = 0x00008005;
    /**
     * __OSX_UNAVAILABLE __IOS_AVAILABLE(2.0),
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Replaced with SecKeyAlgorithm
     */
    @Deprecated @Generated public static final int PKCS1SHA512 = 0x00008006;

    @Generated
    private SecPadding() {
    }
}
