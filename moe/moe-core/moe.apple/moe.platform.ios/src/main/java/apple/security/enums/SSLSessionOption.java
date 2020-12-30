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
 * SSL session options
 */
@Generated
public final class SSLSessionOption {
    /**
     * Set this option to enable returning from SSLHandshake (with a result of
     * errSSLServerAuthCompleted) when the server authentication portion of the
     * handshake is complete. This disable certificate verification and
     * provides an opportunity to perform application-specific server
     * verification before deciding to continue.
     */
    @Generated public static final int BreakOnServerAuth = 0x00000000;
    /**
     * Set this option to enable returning from SSLHandshake (with a result of
     * errSSLClientCertRequested) when the server requests a client certificate.
     */
    @Generated public static final int BreakOnCertRequested = 0x00000001;
    /**
     * This option is the same as kSSLSessionOptionBreakOnServerAuth but applies
     * to the case where SecureTransport is the server and the client has presented
     * its certificates allowing the server to verify whether these should be
     * allowed to authenticate.
     */
    @Generated public static final int BreakOnClientAuth = 0x00000002;
    /**
     * Enable/Disable TLS False Start
     * When enabled, False Start will only be performed if a adequate cipher-suite is
     * negotiated.
     */
    @Generated public static final int FalseStart = 0x00000003;
    /**
     * Enable/Disable 1/n-1 record splitting for BEAST attack mitigation.
     * When enabled, record splitting will only be performed for TLS 1.0 connections
     * using a block cipher.
     */
    @Generated public static final int SendOneByteRecord = 0x00000004;
    /**
     * Allow/Disallow server identity change on renegotiation. Disallow by default
     * to avoid Triple Handshake attack.
     */
    @Generated public static final int AllowServerIdentityChange = 0x00000005;
    /**
     * Enable fallback countermeasures. Use this option when retyring a SSL connection
     * with a lower protocol version because of failure to connect.
     */
    @Generated public static final int Fallback = 0x00000006;
    /**
     * Set this option to break from a client hello in order to check for SNI
     */
    @Generated public static final int BreakOnClientHello = 0x00000007;
    /**
     * Set this option to Allow renegotations. False by default.
     */
    @Generated public static final int AllowRenegotiation = 0x00000008;

    @Generated
    private SSLSessionOption() {
    }

    /**
     * Set this option to enable session tickets. False by default.
     */
    @Generated public static final int EnableSessionTickets = 0x00000009;
}
