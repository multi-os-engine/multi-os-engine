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
 * [@typedef] NEVPNIKEv2IntegrityAlgorithm
 * <p>
 * IKEv2 Integrity Algorithms
 */
@Generated
public final class NEVPNIKEv2IntegrityAlgorithm {
    /**
     * [@const] NEVPNIKEv2IntegrityAlgorithmSHA96 SHA-1 96 bit
     */
    @Generated @NInt public static final long SHA96 = 0x0000000000000001L;
    /**
     * [@const] NEVPNIKEv2IntegrityAlgorithmSHA160 SHA-1 160 bit
     */
    @Generated @NInt public static final long SHA160 = 0x0000000000000002L;
    /**
     * [@const] NEVPNIKEv2IntegrityAlgorithmSHA256 SHA-2 256 bit
     */
    @Generated @NInt public static final long SHA256 = 0x0000000000000003L;
    /**
     * [@const] NEVPNIKEv2IntegrityAlgorithmSHA384 SHA-2 384 bit
     */
    @Generated @NInt public static final long SHA384 = 0x0000000000000004L;
    /**
     * [@const] NEVPNIKEv2IntegrityAlgorithmSHA512 SHA-2 512 bit
     */
    @Generated @NInt public static final long SHA512 = 0x0000000000000005L;

    @Generated
    private NEVPNIKEv2IntegrityAlgorithm() {
    }
}
