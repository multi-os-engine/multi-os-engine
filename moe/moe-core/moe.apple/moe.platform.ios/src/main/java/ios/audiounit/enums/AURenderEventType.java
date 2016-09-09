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
public final class AURenderEventType {
	@Generated
	private AURenderEventType() {
	}

	@Generated
	public static final byte Parameter = 1;
	@Generated
	public static final byte ParameterRamp = 2;
	@Generated
	public static final byte MIDI = 8;
	@Generated
	public static final byte MIDISysEx = 9;
}
