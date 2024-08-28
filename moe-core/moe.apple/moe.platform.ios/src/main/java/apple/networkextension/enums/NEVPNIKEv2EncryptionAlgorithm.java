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
 * [@typedef] NEVPNIKEv2EncryptionAlgorithm
 * 
 * IKEv2 Encryption Algorithms
 * 
 * API-Since: 8.0
 */
@Generated
public final class NEVPNIKEv2EncryptionAlgorithm {
    /**
     * [@const] NEVPNIKEv2EncryptionAlgorithmDES Data Encryption Standard (DES)
     * 
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated @Generated @NInt public static final long AlgorithmDES = 0x0000000000000001L;
    /**
     * [@const] NEVPNIKEv2EncryptionAlgorithm3DES Triple Data Encryption Algorithm (aka 3DES)
     * 
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated @Generated @NInt public static final long Algorithm3DES = 0x0000000000000002L;
    /**
     * [@const] NEVPNIKEv2EncryptionAlgorithmAES128 Advanced Encryption Standard 128 bit (AES128)
     * 
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated @Generated @NInt public static final long AlgorithmAES128 = 0x0000000000000003L;
    /**
     * [@const] NEVPNIKEv2EncryptionAlgorithmAES256 Advanced Encryption Standard 256 bit (AES256)
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlgorithmAES256 = 0x0000000000000004L;
    /**
     * [@const] NEVPNIKEv2EncryptionAlgorithmAES128GCM Advanced Encryption Standard 128 bit (AES128GCM)
     * 
     * API-Since: 8.3
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated @Generated @NInt public static final long AlgorithmAES128GCM = 0x0000000000000005L;
    /**
     * [@const] NEVPNIKEv2EncryptionAlgorithmAES256GCM Advanced Encryption Standard 256 bit (AES256GCM)
     * 
     * API-Since: 8.3
     */
    @Generated @NInt public static final long AlgorithmAES256GCM = 0x0000000000000006L;

    @Generated
    private NEVPNIKEv2EncryptionAlgorithm() {
    }

    /**
     * [@const] NEVPNIKEv2EncryptionAlgorithmChaCha20Poly1305 ChaCha20 and Poly1305 (ChaCha20Poly1305)
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long AlgorithmChaCha20Poly1305 = 0x0000000000000007L;
}
