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

package apple.cfnetwork.enums;

import org.moe.natj.general.ann.Generated;

/**
 * CFHostInfoType
 * 
 * Discussion:
 * Host information types to be resolved.
 */
@Generated
public final class CFHostInfoType {
    /**
     * Results value is a CFArray of CFData's (each being a struct
     * sockaddr)
     */
    @Generated public static final int Addresses = 0x00000000;
    /**
     * Results value is a CFArray of CFString's
     */
    @Generated public static final int Names = 0x00000001;
    /**
     * Results value is a CFData wrapping SCNetworkConnectionFlags
     * (defined in SystemConfiguration/SCNetwork.h)
     */
    @Generated public static final int Reachability = 0x00000002;

    @Generated
    private CFHostInfoType() {
    }
}
