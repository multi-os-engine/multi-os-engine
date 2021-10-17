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
 * [@typedef] NEVPNIKEv2DiffieHellmanGroup
 * <p>
 * IKEv2 Diffie Hellman groups
 */
@Generated
public final class NEVPNIKEv2DiffieHellmanGroup {
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroupInvalid Diffie Hellman group 0 is not a valid DH group
     */
    @Generated @NInt public static final long GroupInvalid = 0x0000000000000000L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup1 Diffie Hellman group 1 (768-bit MODP)
     */
    @Generated @NInt public static final long Group1 = 0x0000000000000001L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup2 Diffie Hellman group 2 (1024-bit MODP)
     */
    @Generated @NInt public static final long Group2 = 0x0000000000000002L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup5 Diffie Hellman group 5 (1536-bit MODP)
     */
    @Generated @NInt public static final long Group5 = 0x0000000000000005L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup14 Diffie Hellman group 14 (2048-bit MODP)
     */
    @Generated @NInt public static final long Group14 = 0x000000000000000EL;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup15 Diffie Hellman group 15 (3072-bit MODP)
     */
    @Generated @NInt public static final long Group15 = 0x000000000000000FL;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup16 Diffie Hellman group 16 (4096-bit MODP)
     */
    @Generated @NInt public static final long Group16 = 0x0000000000000010L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup17 Diffie Hellman group 17 (6144-bit MODP)
     */
    @Generated @NInt public static final long Group17 = 0x0000000000000011L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup18 Diffie Hellman group 18 (8192-bit MODP)
     */
    @Generated @NInt public static final long Group18 = 0x0000000000000012L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup19 Diffie Hellman group 19 (256-bit random ECP)
     */
    @Generated @NInt public static final long Group19 = 0x0000000000000013L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup20 Diffie Hellman group 20 (384-bit random ECP)
     */
    @Generated @NInt public static final long Group20 = 0x0000000000000014L;
    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup21 Diffie Hellman group 21 (521-bit random ECP)
     */
    @Generated @NInt public static final long Group21 = 0x0000000000000015L;

    @Generated
    private NEVPNIKEv2DiffieHellmanGroup() {
    }

    /**
     * [@const] NEVPNIKEv2DiffieHellmanGroup31 Diffie Hellman group 31 (Curve25519)
     */
    @Generated @NInt public static final long Group31 = 0x000000000000001FL;
}
