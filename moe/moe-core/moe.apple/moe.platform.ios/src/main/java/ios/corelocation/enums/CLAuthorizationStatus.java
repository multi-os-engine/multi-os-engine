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

package ios.corelocation.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class CLAuthorizationStatus {
	@Generated
	private CLAuthorizationStatus() {
	}

	@Generated
	public static final int NotDetermined = 0x00000000;
	@Generated
	public static final int Restricted = 0x00000001;
	@Generated
	public static final int Denied = 0x00000002;
	@Generated
	public static final int AuthorizedAlways = 0x00000003;
	@Generated
	public static final int AuthorizedWhenInUse = 0x00000004;
	@Generated
	public static final int Authorized = 0x00000003;
}
