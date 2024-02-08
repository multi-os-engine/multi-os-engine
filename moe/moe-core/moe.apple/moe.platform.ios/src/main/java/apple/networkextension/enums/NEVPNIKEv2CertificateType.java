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
 * [@typedef] NEVPNIKEv2CertificateType
 * 
 * IKEv2 Certificate types
 * 
 * API-Since: 8.3
 */
@Generated
public final class NEVPNIKEv2CertificateType {
    /**
     * [@const] NEVPNIKEv2CertificateType RSA
     * 
     * API-Since: 8.3
     */
    @Generated @NInt public static final long RSA = 0x0000000000000001L;
    /**
     * [@const] NEVPNIKEv2CertificateTypeECDSA256 ECDSA with p-256 curve
     * 
     * API-Since: 8.3
     */
    @Generated @NInt public static final long ECDSA256 = 0x0000000000000002L;
    /**
     * [@const] NEVPNIKEv2CertificateTypeECDSA384 ECDSA with p-384 curve
     * 
     * API-Since: 8.3
     */
    @Generated @NInt public static final long ECDSA384 = 0x0000000000000003L;
    /**
     * [@const] NEVPNIKEv2CertificateTypeECDSA521 ECDSA with p-521 curve
     * 
     * API-Since: 8.3
     */
    @Generated @NInt public static final long ECDSA521 = 0x0000000000000004L;

    @Generated
    private NEVPNIKEv2CertificateType() {
    }

    /**
     * [@const] NEVPNIKEv2CertificateTypeEd25519 EdDSA with Edwards Curve25519
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Ed25519 = 0x0000000000000005L;
    /**
     * [@const] NEVPNIKEv2CertificateTypeRSAPSS RSA-PSS
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long RSAPSS = 0x0000000000000006L;
}
