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

package org.moe.xosrt.binding.core.test.memory;

import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.xosrt.binding.test.CArrayTest.TestClasses.CArrayClass;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointerTest extends XrtTest {
	
	@SuppressWarnings({ "unchecked", "unused" })
	@Test
	@Ignore
	//TODO: LongPtr.class as an argument to newPointerPtr produces 'unsupported class' exception 
	public void complexPointerGCTest() {
		for( long i = 0; i < 10L; i++) {
			
			VoidPtr[] testObject = new VoidPtr[100];
			for( int j = 0; j < 100L; j++) {
				LongPtr pt_long = PtrFactory.newLongReference(j);

				Ptr<LongPtr> testPtr1 = (Ptr<LongPtr>) PtrFactory.newPointerPtr(LongPtr.class, 2, 1,true, true);
				Ptr<Ptr<LongPtr>> testPtr2 = (Ptr<Ptr<LongPtr>>) PtrFactory.newPointerPtr(Ptr.class, 3, 1,true, true);
				Ptr<Ptr<Ptr<LongPtr>>> testPtr3 = (Ptr<Ptr<Ptr<LongPtr>>>) PtrFactory.newPointerPtr(Ptr.class, 4, 1,true, true);
				testObject[j] = CArrayClass.returnComplexPointer(testPtr3);
			}
			System.gc();
			for( int j = 0; j < 100L; j++) {
			assertEquals( j, ((Ptr<Ptr<Ptr<LongPtr>>>) testObject[j])
					.get().get().get().getValue() );
			//XRTLogger.test("complexPointerGCTest №" + (i*100 + j));
			}
		}
	}
	
	@Test
	public void simpleCArrayGCTest() {
		for( long i = 0; i < 10L; i++) {
			for( long j = 0; j < 100L; j++) {
				CArrayClass.argumentByValueReturnByRef(PtrFactory.newLongArray(1000));
				//XRTLogger.test("simpleGCTest №" + (i * 100 + j));
			}
			System.gc();
		}
	}
	
	
	@Test
	public void returnPartOfAllocatedArrayGCTest() {
		char[] charArr = "returnPartOfAllocatedArrayGCTest".toCharArray();
		for( long i = 0; i < 10L; i++) {
			//CharPtr[] ptr = PtrFactory.newCharArray(100);
			CharPtr[] ptr = new CharPtr[100];
			
			for( int j = 0; j < 100L; j++) {
				ptr[j] =  PtrFactory.newCharArray(charArr).ofs(6);
			}
			//System.gc();
			for( int j = 0; j < 100L; j++) {
				assertEquals('P', ptr[j].getValue());
			//XRTLogger.test("returnPartOfAllocatedArrayGCTest №" + i * 100 + j);
			}
		}
	}
	
}
