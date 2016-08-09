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

package ios.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class cmsghdr extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cmsghdr() {
		super(cmsghdr.class);
	}

	@Generated
	protected cmsghdr(Pointer peer) {
		super(peer);
	}

	@Generated
	public cmsghdr(int cmsg_len, int cmsg_level, int cmsg_type) {
		super(cmsghdr.class);
		setCmsg_len(cmsg_len);
		setCmsg_level(cmsg_level);
		setCmsg_type(cmsg_type);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int cmsg_len();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCmsg_len(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int cmsg_level();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCmsg_level(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int cmsg_type();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCmsg_type(int value);
}
