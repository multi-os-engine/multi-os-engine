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

package org.moe.xosrt.binding.core.test.memory.testClasses;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ann.ObjCBlock;

@Runtime(CRuntime.class)
public final class Globals {
	static {
		NatJ.register();
	}

	@CFunction
	public static native void call_test_block(@ObjCBlock(name = "test_block") Block_test_block block);

	@Runtime(CRuntime.class)
	static public interface Block_test_block {
		public void test_block();
	}

	@CFunction
	public static native void call_test_func(@FunctionPtr(name = "test_func") Function_test_func work);

	@Runtime(CRuntime.class)
	static public interface Function_test_func {
		public void test_func();
	}
	
}
