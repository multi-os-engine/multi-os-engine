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

package org.moe.xosrt.binding.test.polytypes.testclasses;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

@ObjCClassName("PolyStructCaller")
public class PolyStructCaller extends NativeObject {
	static {
		NatJ.register();
	}

	protected PolyStructCaller(Pointer peer) {
		super(peer);
	}

	@Selector("alloc")
	@Owned
	public static native PolyStructCaller alloc();
	
	@Selector("init")
	public native PolyStructCaller init();

	@Selector("getPolyStructValue:")
 	public native float getPolyStructValue(@ByValue PolyStruct ps);

	@Selector("setPolyStructValue:to:")
 	public native void setPolyStructValue(PolyStruct ps, float val);
}
