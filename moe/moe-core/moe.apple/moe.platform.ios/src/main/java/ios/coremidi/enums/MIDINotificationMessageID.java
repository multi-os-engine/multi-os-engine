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

package ios.coremidi.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class MIDINotificationMessageID {
	@Generated
	private MIDINotificationMessageID() {
	}

	@Generated
	public static final int SetupChanged = 0x00000001;
	@Generated
	public static final int ObjectAdded = 0x00000002;
	@Generated
	public static final int ObjectRemoved = 0x00000003;
	@Generated
	public static final int PropertyChanged = 0x00000004;
	@Generated
	public static final int ThruConnectionsChanged = 0x00000005;
	@Generated
	public static final int SerialPortOwnerChanged = 0x00000006;
	@Generated
	public static final int IOError = 0x00000007;
}
