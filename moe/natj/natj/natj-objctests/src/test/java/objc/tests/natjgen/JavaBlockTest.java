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

package objc.tests.natjgen;

import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import mac.NSObject;
import mac.c.Globals.*;
import mac.foundation.NSArray;
import mac.foundation.NSArray.Block_enumerateObjectsUsingBlock;
import mac.foundation.NSMutableArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static mac.c.Globals.*;

public class JavaBlockTest {

    private NSArray getArray() {
        NSMutableArray array = NSMutableArray.alloc().init();
        array.add("a");
        array.add("b");
        array.add("objc");
        array.add("d");
        array.add("e");
        return NSArray.arrayWithArray(array);
    }

    @Test
    public void test_block_objc() {
        NSArray array = getArray();
        final ArrayList<Object> list = new ArrayList<Object>();
        array.enumerateObjectsUsingBlock(new Block_enumerateObjectsUsingBlock() {
            @Override
            public void call_enumerateObjectsUsingBlock(Object arg0, @NUInt long arg1, BoolPtr arg2) {
                list.add(arg0);
            }
        });
        Assert.assertArrayEquals(array.toArray(), list.toArray());
    }

    @Test
    public void test_blockInBlock_objc() {
        final NSArray array1 = getArray();
        final NSArray array2 = getArray();
        Assert.assertArrayEquals(array1.toArray(), array2.toArray());

        final IntPtr counter = PtrFactory.newIntReference();
        array1.enumerateObjectsUsingBlock(new Block_enumerateObjectsUsingBlock() {
            @Override
            public void call_enumerateObjectsUsingBlock(Object arg0, @NUInt long arg1, BoolPtr arg2) {
                final Object object1 = arg0;

                array2.enumerateObjectsUsingBlock(new Block_enumerateObjectsUsingBlock() {

                    @Override
                    public void call_enumerateObjectsUsingBlock(Object arg0, @NUInt long arg1, BoolPtr arg2) {
                        final Object object2 = arg0;

                        if (object1.equals(object2)) {
                            counter.setValue(counter.getValue() + 1);
                        }

                    }
                });

            }
        });
        Assert.assertEquals(array1.count(), counter.getValue());
    }

    @Test
    public void test_block_c() {
        final NSArray array = getArray();
        final ArrayList<Object> list = new ArrayList<Object>();

        NSObject group = dispatch_group_create();
        NSObject queue = dispatch_queue_create("moe.block.queue", null);

        dispatch_group_async(group, queue, new Block_dispatch_group_async() {

            @Override
            public void call_dispatch_group_async() {
                for (Object o : array) {
                    list.add(o);
                }
            }
        });
        dispatch_group_wait(group, ~0L);
        dispatch_release(group);
        dispatch_release(queue);
        Assert.assertArrayEquals(array.toArray(), list.toArray());
    }

    @Test
    public void test_blockInBlock_c() {
        final NSArray array1 = getArray();
        final NSArray array2 = getArray();
        Assert.assertArrayEquals(array1.toArray(), array2.toArray());

        final IntPtr counter = PtrFactory.newIntReference();
        NSObject group = dispatch_group_create();
        NSObject queue = dispatch_queue_create("moe.block.queue.outer", null);

        dispatch_group_async(group, queue, new Block_dispatch_group_async() {

            @Override
            public void call_dispatch_group_async() {
                for (final Object object1 : array1) {
                    NSObject group = dispatch_group_create();
                    NSObject queue = dispatch_queue_create("moe.block.queue.inner", null);

                    dispatch_group_async(group, queue, new Block_dispatch_group_async() {

                        @Override
                        public void call_dispatch_group_async() {
                            for (final Object object2 : array2) {
                                if (object1.equals(object2)) {
                                    counter.setValue(counter.getValue() + 1);
                                }
                            }
                        }
                    });
                    dispatch_group_wait(group, ~0L);
                    dispatch_release(group);
                    dispatch_release(queue);
                }
            }
        });
        dispatch_group_wait(group, ~0L);
        dispatch_release(group);
        dispatch_release(queue);

        Assert.assertEquals(array1.count(), counter.getValue());
    }
}
