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

import org.moe.natj.general.NatJ;
import org.moe.xosrt.binding.core.test.memory.testClasses.Globals;
import org.moe.xosrt.binding.core.test.memory.testClasses.Globals.Block_test_block;
import org.moe.xosrt.binding.core.test.memory.testClasses.Globals.Function_test_func;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.junit.Test;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MemoryTests extends XrtTest {
	
	private static volatile AtomicInteger dispatchAsyncValue = new AtomicInteger();
	
	private boolean trySleep(long msec) {
		try {
			Thread.sleep(msec);
			return true;
		} catch (InterruptedException e) {
			return false;
		}
	}

	@Test
	public void testBlockLoad() {
		long usedMemBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("used mem before test: " + usedMemBefore);
		
		HashSet<Block_test_block> links = new HashSet<Block_test_block>();
		
		dispatchAsyncValue.set(0);
		
		final int COUNT = 1000;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < COUNT / 100; j++) {
		
				Block_test_block tb = new Block_test_block() {
					@Override
					public void test_block() {
						dispatchAsyncValue.incrementAndGet();
					}

				};
				links.add(tb);
				
				Globals.call_test_block(tb);
			}
			System.out.print("[" + i + "]");
			System.gc();
		}
		System.out.println();
		
		trySleep(1000);
		
		links.clear();
		System.gc();

		assertEquals("Not all tasks completed", COUNT, dispatchAsyncValue.get());

		trySleep(1000);
		
		long usedMemAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("used mem after gc: " + usedMemAfter);
		
		assertTrue("Used memory after test is greater than before. Memory leak occured", usedMemAfter <= usedMemBefore);
	}

	@Test
	public void testFuncLoad() {
		long usedMemBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("used mem before test: " + usedMemBefore);
		
		HashSet<Function_test_func> links = new HashSet<Function_test_func>();
		
		dispatchAsyncValue.set(0);
		
		final int COUNT = 1000;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < COUNT / 100; j++) {
		
				Function_test_func tb = new Function_test_func() {
					@Override
					public void test_func() {
						dispatchAsyncValue.incrementAndGet();
					}
				};
				links.add(tb);
				
				Globals.call_test_func(tb);
				NatJ.disposeFunctionPtr(tb);
			}
			System.out.print("[" + i + "]");
			System.gc();
		}
		System.out.println();
		
		trySleep(1000);
		
		links.clear();
		System.gc();

		assertEquals("Not all tasks completed", COUNT, dispatchAsyncValue.get());

		trySleep(1000);
		
		long usedMemAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("used mem after gc: " + usedMemAfter);
		
		assertTrue("Used memory after test is greater than before. Memory leak occured", usedMemAfter <= usedMemBefore);
	}

}
