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

package org.moe.xosrt.binding.test.directCallTest;

import org.moe.xosrt.binding.test.common.NativeCGPoint;
import org.moe.xosrt.binding.test.common.NativeCGPointFloat;
import org.moe.xosrt.binding.test.common.NativeCGRect;
import org.moe.xosrt.binding.test.common.NativeComplexCGPoint;
import org.moe.xosrt.binding.test.common.NativeComplexCGPointByRef;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("unused")
public class DirectCallTestsStructures extends XrtTest {

	@Test
	public void argumentTestSimpleStruct() {
		
		DirectCallClass testObject = DirectCallClass.alloc().init();

		//expected return value
		NativeCGPoint expArg = new NativeCGPoint(200,500);
		
		//method call
		testObject.javaMethodDCallWithStructArg(expArg);
				

	}
	
	@Test
	public void argumentTestSimpleRetStructFloat() {
		
		DirectCallClass testObject = DirectCallClass.alloc().init();

		//expected return value
		float expArg = 500;
		float b = 600;
		//method call
		
		NativeCGPointFloat retArg = testObject.methodDStructRetStructFloat(expArg, b);
		assertEquals(expArg, retArg.getX(), 0.1 );
		assertEquals(b, retArg.getY(), 0.1 );
	}
	
	@Test
	public void argumentTestStructFloatRetStructFloat() {
		
		DirectCallClass testObject = DirectCallClass.alloc().init();

		//expected return value
		float expArg = 500;
		float b = 600;
		//method call
		
		NativeCGPointFloat point = new NativeCGPointFloat(expArg, b) ;
		
		NativeCGPointFloat retArg = testObject.methodDStructRetStructFloatFromStruct(point);
		assertEquals(expArg ,retArg.getX(), 0.1 );
		assertEquals(b,retArg.getY(), 0.1 );
	}
	
	@Test
	public void testSimpleStructSettersGetters() {
		
		//expected return value
		NativeCGPoint expArg = new NativeCGPoint(100,500);
		
        expArg.setX(300);
        
        expArg.setY(800);
        
        assertEquals( 1100, expArg.getX() + expArg.getY(), 0);

	}
	
	@Test
	public void testComplexStructSettersGettersByValue() {
		
		//expected return value
		NativeCGPoint innerArg = new NativeCGPoint(100, 500);
		NativeComplexCGPoint expArg = 
				new NativeComplexCGPoint(innerArg, 700);

		assertEquals(100, expArg.getX().getX(), 0.1);
		assertEquals(700, expArg.getY(), 0.1);

		// modification
		expArg.setX(new NativeCGPoint(200, 600));
		assertEquals(200, expArg.getX().getX(), 0.1);

		// modification 2
		expArg.setY(800);
        assertEquals(800, expArg.getY(), 0.1);
	}
	
	@Test
	public void testComplexStructSettersGettersByRef() {
		
		//expected return value
		NativeCGPoint innerArg = new NativeCGPoint(100,500);
		NativeComplexCGPointByRef expArg = new NativeComplexCGPointByRef(innerArg, 100);
		
        expArg.setY(800);
        NativeCGPoint cp = expArg.getX();
        NativeCGPoint cp2 = expArg.getX();
        //assertEquals(cp, cp2); Now Structures will always be new
        expArg.getX().setX(300);
        
        assertEquals( 1100, expArg.getX().getX() + expArg.getY(), 0);
        assertEquals( 1100, cp.getX() + expArg.getY(), 0);

	}
	
	@Test
	public void testComplexStructByRef() {
		
		//expected return value
		NativeCGPoint innerArg = new NativeCGPoint(100,500);
		NativeComplexCGPointByRef expArg = 
				new NativeComplexCGPointByRef(innerArg, 100);
		
        expArg.setY(800);
        NativeCGPoint cp = expArg.getX();
        NativeCGPoint cp2 = expArg.getX();
       // assertEquals(cp, cp2); we are not asserting equals of two objects returned from native
        expArg.getX().setX(300);
        
        assertEquals( 1100, expArg.getX().getX() + expArg.getY(), 0);
        assertEquals( 1100, cp.getX() + expArg.getY(), 0);

	}
	
	@Test
	public void testComplexStructReturn() {

		DirectCallClass dcc = DirectCallClass.alloc().init();
		//expected return value
		NativeCGPoint innerArg = new NativeCGPoint(100, 500);
		NativeComplexCGPoint nccp = dcc.javaMethodDCallWithComplexStructRetXY(innerArg, 123.45f);
		
        assertEquals(100,    nccp.getX().getX(), 0.1);
        assertEquals(500,    nccp.getX().getY(), 0.1);
        assertEquals(123.45, nccp.getY(), 0.1);
	
	}
	
	@Test
	public void testStructureAsReturnValue() {
		
		DirectCallClass testObject = DirectCallClass.alloc().init();
		//expected return value
		NativeCGPoint innerArg = new NativeCGPoint(200,500);
		NativeCGPoint expArg = testObject.javaMethodDCallWithStructRet(innerArg);
		
        assertEquals( 700,expArg.getX() + expArg.getY() , 0);

	}

	@Test
	public void testXYToStructure() {
		
		DirectCallClass testObject = DirectCallClass.alloc().init();
		//expected return value
		NativeCGPoint expArg = testObject.javaMethodDCallWithStructRetXY(100, 200);
		
        assertEquals( 300, expArg.getX() + expArg.getY(), 0);

	}
	
	@Test
	public void testRetStructCGRect() {
		DirectCallClass testObject = DirectCallClass.alloc().init();

		
		NativeCGRect rect = testObject.javaMethodDCallRetCGRect(10, 20) ;
 
		assertEquals(rect.getOrigin().getX(), 10, 0.1 );
		assertEquals(rect.getOrigin().getY(), 20, 0.1 );
		assertEquals(rect.getSize().getWidth(), 300, 0.1 );
		assertEquals(rect.getSize().getHeight(), 500, 0.1 );
	}
	
	@Test
	public void testRetStructCGRectAsProperty() {
		DirectCallClass testObject = DirectCallClass.alloc().initWithBounds();
		
		NativeCGRect rect = testObject.javaMethodDCallRetCGRectProperty();
 
		NativeCGPoint org = rect.getOrigin(); 
		
		assertEquals(org.getX(), 101, 0.1 );
		assertEquals(org.getY(), 202, 0.1 );
		assertEquals(rect.getSize().getWidth(), 303, 0.1 );
		assertEquals(rect.getSize().getHeight(), 404, 0.1 );
	}
	
}
