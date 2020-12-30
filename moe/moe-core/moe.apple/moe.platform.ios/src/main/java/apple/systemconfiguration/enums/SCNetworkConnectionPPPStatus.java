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

package apple.systemconfiguration.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] SCNetworkConnectionPPPStatus
 * 
 * PPP-specific status of the network connection.
 * 	This status is returned as part of the extended information
 * 	for a PPP service.
 * 	Note: additional status might be returned in the future.
 * 	Your application should be prepared to receive an unknown value.
 * [@constant] kSCNetworkConnectionPPPDisconnected
 * 	PPP is disconnected.
 * [@constant] kSCNetworkConnectionPPPInitializing
 * 	PPP is initializing.
 * [@constant] kSCNetworkConnectionPPPConnectingLink
 * 	PPP is connecting the lower connection layer (for example,
 * 	the modem is dialing out).
 * [@constant] kSCNetworkConnectionPPPDialOnTraffic
 * 	PPP is waiting for networking traffic to automatically
 * 	establish the connection.
 * [@constant] kSCNetworkConnectionPPPNegotiatingLink
 * 	The PPP lower layer is connected and PPP is negotiating the
 * 	link layer (LCP protocol).
 * [@constant] kSCNetworkConnectionPPPAuthenticating
 * 	PPP is authenticating to the server (PAP, CHAP, MS-CHAP or
 * 	EAP protocols).
 * [@constant] kSCNetworkConnectionPPPWaitingForCallBack
 * 	PPP is waiting for the server to call back.
 * [@constant] kSCNetworkConnectionPPPNegotiatingNetwork
 * 	PPP is now authenticated and negotiating the networking
 * 	layer (IPCP or IPv6CP protocols)
 * [@constant] kSCNetworkConnectionPPPConnected
 * 	PPP is now fully connected for at least one networking layer.
 * 	Additional networking protocol might still be negotiating.
 * [@constant] kSCNetworkConnectionPPPTerminating
 * 	PPP networking and link protocols are terminating.
 * [@constant] kSCNetworkConnectionPPPDisconnectingLink
 * 	PPP is disconnecting the lower level (for example, the modem
 * 	is hanging up).
 * [@constant] kSCNetworkConnectionPPPHoldingLinkOff
 * 	PPP is disconnected and maintaining the link temporarily off.
 * [@constant] kSCNetworkConnectionPPPSuspended
 * 	PPP is suspended as a result of the suspend command (for
 * 	example, when a V.92 Modem is On Hold).
 * [@constant] kSCNetworkConnectionPPPWaitingForRedial
 * 	PPP has found a busy server and is waiting for redial.
 */
@Generated
public final class SCNetworkConnectionPPPStatus {
    @Generated public static final int Disconnected = 0x00000000;
    @Generated public static final int Initializing = 0x00000001;
    @Generated public static final int ConnectingLink = 0x00000002;
    @Generated public static final int DialOnTraffic = 0x00000003;
    @Generated public static final int NegotiatingLink = 0x00000004;
    @Generated public static final int Authenticating = 0x00000005;
    @Generated public static final int WaitingForCallBack = 0x00000006;
    @Generated public static final int NegotiatingNetwork = 0x00000007;
    @Generated public static final int Connected = 0x00000008;
    @Generated public static final int Terminating = 0x00000009;
    @Generated public static final int DisconnectingLink = 0x0000000A;
    @Generated public static final int HoldingLinkOff = 0x0000000B;
    @Generated public static final int Suspended = 0x0000000C;
    @Generated public static final int WaitingForRedial = 0x0000000D;

    @Generated
    private SCNetworkConnectionPPPStatus() {
    }
}
