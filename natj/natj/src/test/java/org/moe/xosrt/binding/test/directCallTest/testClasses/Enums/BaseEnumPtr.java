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

package org.moe.xosrt.binding.test.directCallTest.testClasses.Enums;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.xosrt.binding.test.common._NSUInteger;

@Structure
public class BaseEnumPtr extends StructObject {

	private static long __natjCache; //Used by NatJ for optimizations

	static {
		NatJ.register();
	}

    protected BaseEnumPtr(Pointer peer) {
        super(peer);
    }
	
	@StructureField(order = 0, isGetter = true)
	@_NSUInteger
	@Generated
	private native long getValue();


	@StructureField(order = 0, isGetter = false)
	//private native void setValue( @_NSUInteger l);
	private native void setValue( long l);
	
	public BaseEnumPtr() {
		super(BaseEnumPtr.class);
		setValue( 0L );
	}
	
	public BaseEnumPtr( BaseEnum en ) {
		super(BaseEnumPtr.class);
		long val = en.value();
		setValue(val);
	}
	
	public BaseEnum getBaseEnum() throws Exception {
		Class<?> trueType = BaseEnum.class;
		for (Object obj: trueType.getEnumConstants()) {
			if( trueType.getDeclaredMethod("value").invoke(obj).equals(getValue()) ) {
				return (BaseEnum)obj;
			}
		}
		return (BaseEnum) null;
	}

}
