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

package org.moe.xosrt.binding.test.CArrayTest;

import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import mac.NSObject;
import org.moe.xosrt.binding.test.CArrayTest.TestClasses.CArrayClass;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CArrayTest extends XrtTest {

	@Test
	public void CharPointerInitialisation() {

		CharPtr testObject = PtrFactory.newCharReference('c');
		assertEquals( 'c', testObject.getValue() );
		
	}
	
	@Test
	public void CharArrayInitialisation() {
		
		char[] expArr = "CharArrayInitialisation".toCharArray();
		CharPtr testObject = PtrFactory.newCharArray(expArr);
		
		for(int i = 0; i < expArr.length; i++) {
			assertEquals( expArr[i], testObject.getValue(i));
		}
	}
	
	@Test
	public void CharArrayNativeInitialisation() {
		
		//The string is determined in native part
		char[] expArr = "initCharArray".toCharArray();
		BytePtr testObject = PtrFactory.newByteArray(expArr.length);
		
		CArrayClass.initCharArray(testObject);
		
		for(int i = 0; i < expArr.length; i++) {
			assertEquals( expArr[i], testObject.getValue(i));
		}
	}
	
	@Test
	public void CharArrayAsAReturnValue() {
		//The string is determined in native part
		String expArr = "returnCharArray";
		long count = expArr.length();

		BytePtr testObject = CArrayClass.returnCharArray();
		
		for(int i = 0; i < count; i++) {
			assertEquals( expArr.charAt(i), testObject.getValue(i) );
		}
		
		testObject.free();
	}
	
	@Test
	public void PartialReturnOfCharArray() {
		
		char[] expArr = "partialReturnOfCharArray".toCharArray();
		CharPtr myArray = PtrFactory.newCharArray(expArr);

		CharPtr testObject = myArray.ofs(7);
		
		for(int i = 0; i < expArr.length - 7; i++) {
			assertEquals(expArr[i + 7], testObject.getValue(i));
		}
	}
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Test
	public void PointerFreedExceptionJavaAlloc() {
		//expectedEx.expect(PointerFreedException.class);
		expectedEx.expect(UnsupportedOperationException.class);
	    expectedEx.expectMessage("pointer has a releaser, should not be freed explicitly");

		LongPtr ptr = PtrFactory.newLongReference();
		ptr.free();	
		

	}
	
	@Test
	public void PointerFreedExceptionWriteToIndexCharPointer() {
		expectedEx.expect(UnsupportedOperationException.class);
	    expectedEx.expectMessage("accessing a pointer which was freed");

	    BytePtr testObject = CArrayClass.returnCharArray();
	    testObject.free();
	    
	    testObject.setValue(3, (byte)013);

	}
	
	@Test
	public void PointerFreedExceptionReadFromIndexCharPointer() {
		expectedEx.expect(UnsupportedOperationException.class);
	    expectedEx.expectMessage("accessing a pointer which was freed");

		BytePtr testObject = CArrayClass.returnCharArray();
	    testObject.free();
	    testObject.getValue(0);

	}
	
//	@SuppressWarnings("unchecked")
	@Test
//	@Ignore
	public void PointerToPointerCreation() {
		byte[] expArr = "CharArrayInitialisation".getBytes();
		//Ptr<CharArr> testObject = new Ptr<>( new CharArr( expArr ) );
		
		Ptr<BytePtr> testObject =  (Ptr<BytePtr>) PtrFactory.newPointerPtr(Byte.class, 2, 1, true, true);
		testObject.set(PtrFactory.newByteArray(expArr));

		BytePtr toStrPtr = testObject.get();
		
		for(int i = 0; i < expArr.length; i++) {
			assertEquals( expArr[i], toStrPtr.getValue(i));
		}
	}
	
	@Test
	public void PointerArrayInitialisation() {
		
		String str = "PointerArrayInitialisationTest";
		int chunkNumber = 6;
		int charsInChunk = str.length() / chunkNumber;

		Ptr<CharPtr> testObject = (Ptr<CharPtr>) PtrFactory.newPointerPtr(Character.class, 2, chunkNumber,true, true);
		for ( int i = 0; i < chunkNumber; i++ ) {
			testObject.set(i, PtrFactory.newCharArray(str.substring(charsInChunk * i, charsInChunk * (i + 1)).toCharArray()));
		}

		for ( int i = 0; i < chunkNumber; i++) {
			CharPtr ptr = testObject.get(i);
			for ( int j = 0; j < charsInChunk; j++) {
				assertEquals( str.charAt( charsInChunk * i + j ), ptr.getValue(j) );
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void PointerArrayNativeInitialisation() {
		
		//The string determined in native part
		String str = "initCharPointerArray";
		int chunkNumber = 5;
		int charsInChunk = str.length() / chunkNumber;

		Ptr<BytePtr> testObject = (Ptr<BytePtr>) PtrFactory.newPointerPtr(Byte.class, 2, chunkNumber,true, true);
		//Arr<CharArr> testObject = new Arr<>( chunkNumber );
		CArrayClass.initCharPointerArray( testObject );

		for ( int i = 0; i < chunkNumber; i++) {
			BytePtr ptr = testObject.get(i);
			for ( int j = 0; j < charsInChunk; j++) {
				assertEquals( str.charAt( charsInChunk * i + j ), ptr.getValue(j) );
			}
			ptr.free();
		}
	}
	
	@Test
	@Ignore
//	TODO: Implementation for Ptr<CharPtr> absent
	public void PointerArrayAsAReturnValue() {
		
		//The string determined in native part
		String str = "returnCharPtrArray";
		int chunkNumber = 6;
		int charsInChunk = str.length() / chunkNumber;

		Ptr<CharPtr> testObject = CArrayClass.returnCharPtrArray();

		for ( int i = 0; i < chunkNumber; i++) {
			CharPtr ptr = testObject.get(i);
			for ( int j = 0; j < charsInChunk; j++) {
				assertEquals(str.charAt(charsInChunk * i + j), ptr.getValue(j));
			}
			ptr.free();
		}
		testObject.free();
	}
	
	@Test
	public void argumentByValueReturnByValue() {
		
		//LongPtr toLongPtr = new LongPtr(100500L);
		LongPtr toLongPtr = PtrFactory.newLongReference(100500L);
		VoidPtr testObject = CArrayClass.argumentByValueReturnByValue(toLongPtr);
		assertEquals(100500L, testObject.getLongPtr().getValue());
		
	}
	
	@Test
	public void argumentByRefReturnByValue() {
		
		/*
		 * This test shows undocumented behavior.
		 * The native function returns its argument, 
		 * and to accept it correctly we should annotate argument 
		 * with @ByValue and not annotate return value.
		 * But if we remove @ByValue annotation from argument and
		 * add it to the return value, the real output will be 
		 * a pointer to a pointer to the sent pointer.
		 * So, to handle this case we should declare return value
		 * as an AbstractPtr<AbstractPtr<...Pointer>>
		 */
		
		LongPtr toLongPtr = PtrFactory.newLongReference(100500L);
		LongPtr testObject = CArrayClass.argumentByRefReturnByValue(toLongPtr).getLongPtr();
		assertEquals( 100500L, testObject.getValue() );
		
	}
	
	@Test
	public void argumentByRefReturnByRef() {
		
		/*
		 * This test shows undocumented behavior.
		 * The native function returns its argument, 
		 * and to accept it correctly we should annotate argument
		 * by @ByValue annotation. But if we remove annotation, 
		 * the real output will be a pointer to the sent pointer.
		 * So, to handle this case we should declare return value
		 * ...Pointer, as usual.
		 */
		
		LongPtr toLongPtr = PtrFactory.newLongReference(100500L);
		LongPtr testObject = CArrayClass.argumentByRefReturnByRef(toLongPtr);
		assertEquals( 100500L, testObject.getValue() );
		
	}

	@Test
	public void pointerToNativeObjectsInitialisation() {
		NSObject object = NSObject.alloc().init();
		Ptr<NSObject> testObject = PtrFactory.newObjectReference(object);
		assertEquals( object.getPeerPointer(), testObject.get().getPeerPointer());
	}
	

	
	@Test
	public void arrayOfNativeObjectsNativeInitialisation() {

		//IdArr<xNSString> testObject = new IdArr<>( 100 );
		
		Ptr<NSObject> testObject = PtrFactory.newObjectArray(NSObject.class, 100);
				
		CArrayClass.initNSObjectArray( testObject );

		for ( int i = 0; i < 100; i++) {
			assertTrue(testObject.get() != null );
		}
	}
	
	@Test
	public void pointerToLongPtrInit() {
		LongPtr longPtr = PtrFactory.newLongReference(100500L);
		Ptr<LongPtr> ptr = (Ptr<LongPtr>) PtrFactory.newPointerPtr(Long.class, 2, 1,true, true);
		ptr.set(longPtr);
		assertEquals(100500L, ptr.get().getValue() );
	}
	
	@Test
	public void pointerToIntAsAReturnValue() {
		IntPtr intPtr = PtrFactory.newIntReference(31415926);
		//StructPtr<IntPtr> structPtr = new StructPtr<>( intPtr );
		IntPtr ptr = CArrayClass.structPointerToReturn(intPtr).getIntPtr();
		assertEquals( 31415926, ptr.getValue() );
	}
	
}
