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

package objc.tests.mem;

import org.moe.natj.general.ptr.BoolPtr;
import apple.NSObject;
import apple.foundation.NSDictionary.Block_enumerateKeysAndObjectsUsingBlock;
import apple.foundation.NSMutableArray;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSNumber;
import objc.binding.InstrumentedParent;
import objc.binding.NSStringInstrumentor;
import objc.util.MemUtils;
import objc.util.VMDebug;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObjCMemoryManagementTest {
    private static final int ITERATION_COUNT = 500000;
    private static final int GC_INTERVAL = 10000;

    private static class Dummy {
    }

    @Ignore
    @Test
    public void testProxyManagement() {
        NSMutableDictionary dict = NSMutableDictionary.alloc().initWithCapacity(1);

        Dummy dummy = new Dummy();

        dict.setObjectForKey(dummy, "a");

        MemUtils.forcedGC();
        assertEquals(VMDebug.countInstancesOfClass(Dummy.class, false), 1);

        dummy = null;
        dict = null;

        MemUtils.forcedGC();
        assertEquals(VMDebug.countInstancesOfClass(Dummy.class, false), 1);
    }

    @Ignore
    @Test
    public void testBlockManagement() {
        NSMutableDictionary dict = NSMutableDictionary.alloc().initWithCapacity(1);

        dict.setObjectForKey("b", "a");

        Block_enumerateKeysAndObjectsUsingBlock block = new Block_enumerateKeysAndObjectsUsingBlock() {
            @Override
            public void call_enumerateKeysAndObjectsUsingBlock(Object arg0,
                                                               Object arg1, BoolPtr arg2) {
                //nothing
            }
        };

        dict.enumerateKeysAndObjectsUsingBlock(block);

        MemUtils.forcedGC();
        assertEquals(VMDebug.countInstancesOfClass(Block_enumerateKeysAndObjectsUsingBlock.class, true), 1);

        block = null;

        MemUtils.forcedGC();
        assertEquals(VMDebug.countInstancesOfClass(Block_enumerateKeysAndObjectsUsingBlock.class, true), 0);
    }

    @Ignore
    @Test
    public void testStringManagement() {
        NSStringInstrumentor.enter();

        NSMutableDictionary dict = NSMutableDictionary.alloc().initWithCapacity(1);

        dict.setObjectForKey("b", "a");

        NSStringInstrumentor.exit();

        dict = null;

        MemUtils.forcedGC();

        assertEquals(NSStringInstrumentor.allocCount(), 2);
        assertEquals(NSStringInstrumentor.deallocCount(), 2);
    }

    @Ignore
    @Test
    public void testInheritedManagement() {
        InstrumentedParent.reset();

        NSMutableDictionary dict = NSMutableDictionary.alloc().initWithCapacity(1);

        SubInherited inherited = SubInherited.alloc().init();

        dict.setObjectForKey(inherited, "a");

        assertEquals(InstrumentedParent.allocCount(), 1);
        assertEquals(InstrumentedParent.deallocCount(), 0);

        dict = null;

        MemUtils.forcedGC();

        assertEquals(InstrumentedParent.deallocCount(), 1);
        assertEquals(InstrumentedParent.deallocCount(), 1);
    }

    @Ignore
    @Test
    public void testBindingManagement() {
        InstrumentedParent.reset();

        NSMutableDictionary dict = NSMutableDictionary.alloc().initWithCapacity(1);

        dict.setObjectForKey(InstrumentedParent.alloc().init(), "a");

        assertEquals(InstrumentedParent.allocCount(), 1);
        assertEquals(InstrumentedParent.deallocCount(), 0);

        dict = null;

        MemUtils.forcedGC();

        assertEquals(InstrumentedParent.deallocCount(), 1);
        assertEquals(InstrumentedParent.deallocCount(), 1);
    }

    @Ignore
    @Test
    public void testHybridManagement() {
        InstrumentedParent.reset();

        NSMutableDictionary dict = NSMutableDictionary.alloc().initWithCapacity(1);

        SubHybrid hybrid = SubHybrid.alloc().init();

        dict.setObjectForKey(hybrid, "a");

        assertEquals(InstrumentedParent.allocCount(), 1);
        assertEquals(InstrumentedParent.deallocCount(), 0);

        SubHybrid.performDummyOnInstance(hybrid);

        assertEquals(SubHybrid.getDummyCallCount(), 1);
        assertEquals(InstrumentedParent.allocCount(), 1);
        assertEquals(InstrumentedParent.deallocCount(), 0);

        SubHybrid.performDummyOnTemporalInstance();

        MemUtils.forcedGC();

        assertEquals(SubHybrid.getDummyCallCount(), 2);
        assertEquals(InstrumentedParent.allocCount(), 2);
        assertEquals(InstrumentedParent.deallocCount(), 1);

        SubHybrid.createAndReleaseTemporalInstance();

        assertEquals(SubHybrid.getDummyCallCount(), 2);
        assertEquals(InstrumentedParent.allocCount(), 3);
        assertEquals(InstrumentedParent.deallocCount(), 2);

        dict = null;
        hybrid = null;

        MemUtils.forcedGC();

        assertEquals(InstrumentedParent.deallocCount(), 3);
        assertEquals(InstrumentedParent.deallocCount(), 3);
    }

    @Test
    public void testTableOverflowWithBindings() {
        NSMutableArray array = NSMutableArray.alloc().initWithCapacity(ITERATION_COUNT);

        int inter = 1;
        for (int i = 0; i < ITERATION_COUNT; i++) {
            if (inter == 1) {
                inter = GC_INTERVAL;
                System.gc();
            } else {
                inter--;
            }
            array.addObject(NSObject.alloc().init());
            array.objectAtIndex(i);
        }
    }

    @Test
    public void testTableOverflowWithStringsMethodOne() {
        NSMutableArray array = NSMutableArray.alloc().initWithCapacity(ITERATION_COUNT);

        int inter = 1;
        for (int i = 0; i < ITERATION_COUNT; i++) {
            if (inter == 1) {
                inter = GC_INTERVAL;
                System.gc();
            } else {
                inter--;
            }
            array.addObject("a");
            array.objectAtIndex(i);
        }
    }

    @Test
    public void testTableOverflowWithStringsMethodTwo() {
        NSNumber num = NSNumber.numberWithInt(100);
        for (int i = 0; i < ITERATION_COUNT; ++i) {
            num.description();
        }
    }
}
