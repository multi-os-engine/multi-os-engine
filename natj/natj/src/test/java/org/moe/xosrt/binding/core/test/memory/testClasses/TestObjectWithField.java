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

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

@Runtime(ObjCRuntime.class)
@ObjCClassName("TestObjectWithField")
@RegisterOnStartup
public class TestObjectWithField extends TestObject {
	@Selector("alloc")
    @Owned
    public static native TestObjectWithField alloc();

    @Selector("init")
    public native TestObjectWithField init();

	static {
		NatJ.register();
	}
	
	protected TestObjectWithField(Pointer peer) {
		super(peer);
	}

    private long javaField;
    
    @Selector("javaField")
    public long getJavaField() {
		return javaField;
	}
    
    @Selector("setJavaField:")
    public void setJavaField(long javaField) {
		this.javaField = javaField;
	}
}
