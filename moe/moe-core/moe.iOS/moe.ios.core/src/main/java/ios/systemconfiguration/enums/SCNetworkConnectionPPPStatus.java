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

package ios.systemconfiguration.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class SCNetworkConnectionPPPStatus {
	@Generated
	private SCNetworkConnectionPPPStatus() {
	}

	@Generated
	public static final int Disconnected = 0x00000000;
	@Generated
	public static final int Initializing = 0x00000001;
	@Generated
	public static final int ConnectingLink = 0x00000002;
	@Generated
	public static final int DialOnTraffic = 0x00000003;
	@Generated
	public static final int NegotiatingLink = 0x00000004;
	@Generated
	public static final int Authenticating = 0x00000005;
	@Generated
	public static final int WaitingForCallBack = 0x00000006;
	@Generated
	public static final int NegotiatingNetwork = 0x00000007;
	@Generated
	public static final int Connected = 0x00000008;
	@Generated
	public static final int Terminating = 0x00000009;
	@Generated
	public static final int DisconnectingLink = 0x0000000A;
	@Generated
	public static final int HoldingLinkOff = 0x0000000B;
	@Generated
	public static final int Suspended = 0x0000000C;
	@Generated
	public static final int WaitingForRedial = 0x0000000D;
}
