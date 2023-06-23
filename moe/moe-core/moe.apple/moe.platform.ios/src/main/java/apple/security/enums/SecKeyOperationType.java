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
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] SecKeyOperationType
 * 
 * Defines types of cryptographic operations available with SecKey instance.
 * 
 * [@constant] kSecKeyOperationTypeSign
 * Represents SecKeyCreateSignature()
 * 
 * [@constant] kSecKeyOperationTypeVerify
 * Represents SecKeyVerifySignature()
 * 
 * [@constant] kSecKeyOperationTypeEncrypt
 * Represents SecKeyCreateEncryptedData()
 * 
 * [@constant] kSecKeyOperationTypeDecrypt
 * Represents SecKeyCreateDecryptedData()
 * 
 * [@constant] kSecKeyOperationTypeKeyExchange
 * Represents SecKeyCopyKeyExchangeResult()
 * 
 * API-Since: 10.0
 */
@Generated
public final class SecKeyOperationType {
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Sign = 0x0000000000000000L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Verify = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Encrypt = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Decrypt = 0x0000000000000003L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long KeyExchange = 0x0000000000000004L;

    @Generated
    private SecKeyOperationType() {
    }
}
