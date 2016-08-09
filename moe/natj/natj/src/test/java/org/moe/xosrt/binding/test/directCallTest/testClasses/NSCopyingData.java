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

package org.moe.xosrt.binding.test.directCallTest.testClasses;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import org.moe.xosrt.binding.test.common._NSCopying;
import org.moe.xosrt.binding.test.common._NSObject;

public class NSCopyingData extends NSObject implements _NSCopying {

	static
	{
		NatJ.register();
	}

	protected NSCopyingData(Pointer peer) {
		super(peer);
	}

	@Selector("alloc")
	public static native NSCopyingData alloc();
	
	@Selector("init")
	public native NSCopyingData init();
	
	@Override
	public <T extends _NSObject> T copyWithZone(_NSObject zone) {
		// TODO Auto-generated method stub
		return null;
	}

}
