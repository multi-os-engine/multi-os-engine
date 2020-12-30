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
 * Status of client certificate exchange (which is optional
 * for both server and client).
 */
@Generated
public final class SSLClientCertificateState {
    /**
     * Server hasn't asked for a cert. Client hasn't sent one.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * Server has asked for a cert, but client didn't send it.
     */
    @Generated public static final int Requested = 0x00000001;
    /**
     * Server side: We asked for a cert, client sent one, we validated
     * 			it OK. App can inspect the cert via
     * 			SSLCopyPeerCertificates().
     * Client side: server asked for one, we sent it.
     */
    @Generated public static final int Sent = 0x00000002;
    /**
     * Client sent a cert but failed validation. Server side only.
     * Server app can inspect the cert via SSLCopyPeerCertificates().
     */
    @Generated public static final int Rejected = 0x00000003;

    @Generated
    private SSLClientCertificateState() {
    }
}
