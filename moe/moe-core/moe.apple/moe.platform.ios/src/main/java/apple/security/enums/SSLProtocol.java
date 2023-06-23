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
 * [@enum] SSLProtocol enumeration
 * 
 * Enumerations for the set of supported TLS and DTLS protocol versions.
 * 
 * [@note] This enumeration is deprecated. Use `tls_protocol_version_t` instead.
 */
@Generated
public final class SSLProtocol {
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int SSLProtocolUnknown = 0x00000000;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int SSLProtocol3 = 0x00000002;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int TLSProtocol1 = 0x00000004;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int TLSProtocol11 = 0x00000007;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int TLSProtocol12 = 0x00000008;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int DTLSProtocol1 = 0x00000009;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int SSLProtocol2 = 0x00000001;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int SSLProtocol3Only = 0x00000003;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int TLSProtocol1Only = 0x00000005;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int SSLProtocolAll = 0x00000006;

    @Generated
    private SSLProtocol() {
    }

    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int TLSProtocol13 = 0x0000000A;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int TLSProtocolMaxSupported = 0x000003E7;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated public static final int DTLSProtocol12 = 0x0000000B;
}
