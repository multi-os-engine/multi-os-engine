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

package ios.audiotoolbox.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioUnitNodeConnection extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public AudioUnitNodeConnection() {
		super(AudioUnitNodeConnection.class);
	}

	@Generated
	protected AudioUnitNodeConnection(Pointer peer) {
		super(peer);
	}

	@Generated
	public AudioUnitNodeConnection(int sourceNode, int sourceOutputNumber,
			int destNode, int destInputNumber) {
		super(AudioUnitNodeConnection.class);
		setSourceNode(sourceNode);
		setSourceOutputNumber(sourceOutputNumber);
		setDestNode(destNode);
		setDestInputNumber(destInputNumber);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int sourceNode();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSourceNode(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int sourceOutputNumber();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSourceOutputNumber(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int destNode();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDestNode(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int destInputNumber();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDestInputNumber(int value);
}
