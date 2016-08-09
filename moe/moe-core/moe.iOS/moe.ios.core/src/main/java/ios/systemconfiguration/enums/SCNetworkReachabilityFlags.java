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
public final class SCNetworkReachabilityFlags {
	@Generated
	private SCNetworkReachabilityFlags() {
	}

	@Generated
	public static final int TransientConnection = 0x00000001;
	@Generated
	public static final int Reachable = 0x00000002;
	@Generated
	public static final int ConnectionRequired = 0x00000004;
	@Generated
	public static final int ConnectionOnTraffic = 0x00000008;
	@Generated
	public static final int InterventionRequired = 0x00000010;
	@Generated
	public static final int ConnectionOnDemand = 0x00000020;
	@Generated
	public static final int IsLocalAddress = 0x00010000;
	@Generated
	public static final int IsDirect = 0x00020000;
	@Generated
	public static final int IsWWAN = 0x00040000;
	@Generated
	public static final int ConnectionAutomatic = 0x00000008;
}
