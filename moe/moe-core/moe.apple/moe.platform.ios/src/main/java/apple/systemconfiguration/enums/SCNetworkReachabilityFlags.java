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
 * @enum SCNetworkReachabilityFlags
 * @discussion Flags that indicate whether the specified network
 * 	nodename or address is reachable, whether a connection is
 * 	required, and whether some user intervention may be required
 * 	when establishing a connection.
 * @constant kSCNetworkReachabilityFlagsTransientConnection
 * 	This flag indicates that the specified nodename or address can
 * 	be reached via a transient connection, such as PPP.
 * @constant kSCNetworkReachabilityFlagsReachable
 * 	This flag indicates that the specified nodename or address can
 * 	be reached using the current network configuration.
 * @constant kSCNetworkReachabilityFlagsConnectionRequired
 * 	This flag indicates that the specified nodename or address can
 * 	be reached using the current network configuration, but a
 * 	connection must first be established.
 * 
 * 	As an example, this status would be returned for a dialup
 * 	connection that was not currently active, but could handle
 * 	network traffic for the target system.
 * @constant kSCNetworkReachabilityFlagsConnectionOnTraffic
 * 	This flag indicates that the specified nodename or address can
 * 	be reached using the current network configuration, but a
 * 	connection must first be established.  Any traffic directed
 * 	to the specified name or address will initiate the connection.
 * 
 * 	Note: this flag was previously named kSCNetworkReachabilityFlagsConnectionAutomatic
 * @constant kSCNetworkReachabilityFlagsInterventionRequired
 * 	This flag indicates that the specified nodename or address can
 * 	be reached using the current network configuration, but a
 * 	connection must first be established.  In addition, some
 * 	form of user intervention will be required to establish this
 * 	connection, such as providing a password, an authentication
 * 	token, etc.
 * 
 * 	Note: At the present time, this flag will only be returned
 * 	in the case where you have a dial-on-traffic configuration
 * 	(ConnectionOnTraffic), where an attempt to connect has
 * 	already been made, and where some error (e.g. no dial tone,
 * 	no answer, bad password, ...) was encountered during the
 * 	automatic connection attempt.  In this case the PPP controller
 * 	will stop attempting to establish a connection until the user
 * 	has intervened.
 * @constant kSCNetworkReachabilityFlagsConnectionOnDemand
 * 	This flag indicates that the specified nodename or address can
 * 	be reached using the current network configuration, but a
 * 	connection must first be established.
 * 	The connection will be established "On Demand" by the
 * 	CFSocketStream APIs.
 * 	Other APIs will not establish the connection.
 * @constant kSCNetworkReachabilityFlagsIsLocalAddress
 * 	This flag indicates that the specified nodename or address
 * 	is one associated with a network interface on the current
 * 	system.
 * @constant kSCNetworkReachabilityFlagsIsDirect
 * 	This flag indicates that network traffic to the specified
 * 	nodename or address will not go through a gateway, but is
 * 	routed directly to one of the interfaces in the system.
 * @constant kSCNetworkReachabilityFlagsIsWWAN
 * 	This flag indicates that the specified nodename or address can
 * 	be reached via an EDGE, GPRS, or other "cell" connection.
 */
@Generated
public final class SCNetworkReachabilityFlags {
    @Generated public static final int TransientConnection = 0x00000001;
    @Generated public static final int Reachable = 0x00000002;
    @Generated public static final int ConnectionRequired = 0x00000004;
    @Generated public static final int ConnectionOnTraffic = 0x00000008;
    @Generated public static final int InterventionRequired = 0x00000010;
    @Generated public static final int ConnectionOnDemand = 0x00000020;
    @Generated public static final int IsLocalAddress = 0x00010000;
    @Generated public static final int IsDirect = 0x00020000;
    @Generated public static final int IsWWAN = 0x00040000;
    @Generated public static final int ConnectionAutomatic = 0x00000008;

    @Generated
    private SCNetworkReachabilityFlags() {
    }
}
