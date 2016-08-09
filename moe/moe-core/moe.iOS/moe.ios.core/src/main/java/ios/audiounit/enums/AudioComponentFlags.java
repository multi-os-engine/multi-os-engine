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

package ios.audiounit.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class AudioComponentFlags {
	@Generated
	private AudioComponentFlags() {
	}

	@Generated
	public static final int Unsearchable = 0x00000001;
	@Generated
	public static final int SandboxSafe = 0x00000002;
	@Generated
	public static final int IsV3AudioUnit = 0x00000004;
	@Generated
	public static final int RequiresAsyncInstantiation = 0x00000008;
	@Generated
	public static final int CanLoadInProcess = 0x00000010;
}
