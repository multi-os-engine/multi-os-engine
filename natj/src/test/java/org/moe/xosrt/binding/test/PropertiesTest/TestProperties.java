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

package org.moe.xosrt.binding.test.PropertiesTest;

import org.moe.xosrt.binding.test.PropertiesTest.TestClasses.PropertiesTestClass;
import org.moe.xosrt.binding.test.PropertiesTest.TestClasses.PropertyClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestProperties{

	@Test
	public void basePropertiesTest() {

		PropertiesTestClass testClass = PropertiesTestClass.alloc().init();
		PropertyClass property = PropertyClass.alloc().init();
		testClass.setFProperty(property);

		assertEquals(property, testClass.getFProperty());
	}


	@Test
	public void propertyGetSetWithVisibiliTyTest() {
		PropertiesTestClass hold = PropertiesTestClass.alloc().init();

		long peer = setMyPropRetPeer(hold);


		assertEquals(hold.getFProperty().getPeerPointer(), peer);
	}

	private long setMyPropRetPeer(PropertiesTestClass object)
	{
		PropertyClass property = PropertyClass.alloc().init();
		object.setFProperty(property);
		return property.getPeerPointer();    	
	}

}
