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

package ios.audiounit.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;

import ios.coreaudio.struct.AudioTimeStamp;

@Generated
@Structure()
public final class AUInputSamplesInOutputCallbackStruct extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public AUInputSamplesInOutputCallbackStruct() {
		super(AUInputSamplesInOutputCallbackStruct.class);
	}

	@Generated
	protected AUInputSamplesInOutputCallbackStruct(Pointer peer) {
		super(peer);
	}

	@Generated
	public AUInputSamplesInOutputCallbackStruct(
			@FunctionPtr(name = "call_inputToOutputCallback") Function_inputToOutputCallback inputToOutputCallback,
			VoidPtr userData) {
		super(AUInputSamplesInOutputCallbackStruct.class);
		setInputToOutputCallback(inputToOutputCallback);
		setUserData(userData);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setInputToOutputCallback(
			@FunctionPtr(name = "call_inputToOutputCallback") Function_inputToOutputCallback value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_inputToOutputCallback {
		@Generated
		void call_inputToOutputCallback(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg1,
				double arg2, double arg3);
	}

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr userData();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setUserData(VoidPtr value);

	@Generated
	@StructureField(order = 0, isGetter = true)
	@FunctionPtr(name = "call_inputToOutputCallback")
	public native Function_inputToOutputCallback inputToOutputCallback();
}
