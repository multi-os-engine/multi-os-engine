package org.moe.xosrt.binding.test.CStructCallback;

import org.junit.Test;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;

import static org.junit.Assert.*;

@Library("TestClasses")
@Runtime(CRuntime.class)
public class CStructCallbackTest {

	static {
		NatJ.register();
	}

	@Test
	public void testStructCallback() {
		TestStruct testStruct = new TestStruct();
		testStruct.setKind(5);
		// Workaround for https://github.com/multi-os-engine/multi-os-engine/issues/172
		ObjCRuntime.autoreleasepool(() -> {});
		initiateCallback(testStruct, new Function_structCallback() {
			@Override
			// The ByValue annotation of the overriden method is ignored
			public void call_structCallback (TestStruct arg0) {
				// For some reason the peer is 5 here
				assertNotEquals(5, arg0.getPeerPointer());
			}
		});
	}

	@Generated
	@CFunction
	public static native void initiateCallback(@ByValue TestStruct parent,
		@FunctionPtr(name = "call_structCallback") Function_structCallback visitor);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_structCallback {
		@Generated
		void call_structCallback(@ByValue TestStruct arg0);
	}
}
