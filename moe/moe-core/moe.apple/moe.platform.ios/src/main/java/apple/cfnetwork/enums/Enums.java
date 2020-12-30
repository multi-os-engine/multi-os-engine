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

@Generated
public final class Enums {
    @Generated public static final int kCFStreamErrorSOCKS5BadResponseAddr = 0x00000001;
    @Generated public static final int kCFStreamErrorSOCKS5BadState = 0x00000002;
    @Generated public static final int kCFStreamErrorSOCKSUnknownClientVersion = 0x00000003;
    /**
     * request rejected or failed
     */
    @Generated public static final int kCFStreamErrorSOCKS4RequestFailed = 0x0000005B;
    /**
     * request rejected because SOCKS server cannot connect to identd on the client
     */
    @Generated public static final int kCFStreamErrorSOCKS4IdentdFailed = 0x0000005C;
    /**
     * request rejected because the client program and identd report different user-ids
     */
    @Generated public static final int kCFStreamErrorSOCKS4IdConflict = 0x0000005D;
    /**
     * Error code is a general SOCKS error
     */
    @Generated public static final int kCFStreamErrorSOCKSSubDomainNone = 0x00000000;
    /**
     * Error code is the version of SOCKS which the server wishes to use
     */
    @Generated public static final int kCFStreamErrorSOCKSSubDomainVersionCode = 0x00000001;
    /**
     * Error code is the status code returned by the server
     */
    @Generated public static final int kCFStreamErrorSOCKS4SubDomainResponse = 0x00000002;
    /**
     * Error code is the status code that the server returned
     */
    @Generated public static final int kCFStreamErrorSOCKS5SubDomainUserPass = 0x00000003;
    /**
     * Error code is the server's desired negotiation method
     */
    @Generated public static final int kCFStreamErrorSOCKS5SubDomainMethod = 0x00000004;
    /**
     * Error code is the response code that the server returned in reply to the connection request
     */
    @Generated public static final int kCFStreamErrorSOCKS5SubDomainResponse = 0x00000005;
    /**
     * other values indicate the server's desired method
     */
    @Generated public static final int kSOCKS5NoAcceptableMethod = 0x000000FF;

    @Generated
    private Enums() {
    }
}
