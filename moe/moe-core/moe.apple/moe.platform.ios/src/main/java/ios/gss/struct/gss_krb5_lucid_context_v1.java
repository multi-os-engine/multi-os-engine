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

package ios.gss.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class gss_krb5_lucid_context_v1 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public gss_krb5_lucid_context_v1() {
		super(gss_krb5_lucid_context_v1.class);
	}

	@Generated
	protected gss_krb5_lucid_context_v1(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int initiate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setInitiate(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int endtime();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setEndtime(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long send_seq();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSend_seq(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long recv_seq();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setRecv_seq(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int protocol();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setProtocol(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ByValue
	public native gss_krb5_rfc1964_keydata rfc1964_kd();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setRfc1964_kd(@ByValue gss_krb5_rfc1964_keydata value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@ByValue
	public native gss_krb5_cfx_keydata cfx_kd();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCfx_kd(@ByValue gss_krb5_cfx_keydata value);
}
