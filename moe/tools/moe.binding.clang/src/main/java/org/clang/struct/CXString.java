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

package org.clang.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.clang.c.clang;

@Generated
@Structure()
public final class CXString extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CXString() {
		super(CXString.class);
	}

	@Generated
	protected CXString(Pointer peer) {
		super(peer);
	}

	@Generated
	public CXString(ConstVoidPtr data, int private_flags) {
		super(CXString.class);
		setData(data);
		setPrivate_flags(private_flags);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native ConstVoidPtr data();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setData(ConstVoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int private_flags();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setPrivate_flags(int value);

	/* General java methods */
	@Override
	public String toString() {
		String str = clang.clang_getCString(this);
		if (str == null) {
			throw new IllegalStateException("Failed to retrieve string from CXString");
		}
		return str;
	}

	/* Comfort java methods */
	public void dispose() {
		clang.clang_disposeString(this);
	}

	public String getCString() {
		return clang.clang_getCString(this);
	}
}
