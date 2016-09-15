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

import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.*;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.BlockObject;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ann.ObjCBlock;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSError;
import apple.foundation.NSMutableArray;
import objc.binding.ObjCBlocks;
import org.junit.Assert;
import org.junit.Test;

public class NativeBlockTest {

    @Test
    public void test_execBlockWithBool() {
        ObjCBlocks.execBlockWithBool(new ObjCBlocks.Block_execBlockWithBool() {
            @Override
            public void call_execBlockWithBool(boolean var) {
                Assert.assertTrue(var);
            }
        });
    }

    @Test
    public void test_execBlockWithByte() {
        ObjCBlocks.execBlockWithByte(new ObjCBlocks.Block_execBlockWithByte() {
            @Override
            public void call_execBlockWithByte(byte var) {
                Assert.assertEquals((byte) 0xFA, var);
            }
        });
    }

    @Test
    public void test_execBlockWithShort() {
        ObjCBlocks.execBlockWithShort(new ObjCBlocks.Block_execBlockWithShort() {
            @Override
            public void call_execBlockWithShort(short var) {
                Assert.assertEquals((short) 0xFAFA, var);
            }
        });
    }

    @Test
    public void test_execBlockWithChar() {
        ObjCBlocks.execBlockWithChar(new ObjCBlocks.Block_execBlockWithChar() {
            @Override
            public void call_execBlockWithChar(char var) {
                Assert.assertEquals(0xFAFA, var);
            }
        });
    }

    @Test
    public void test_execBlockWithInt() {
        ObjCBlocks.execBlockWithInt(new ObjCBlocks.Block_execBlockWithInt() {
            @Override
            public void call_execBlockWithInt(int var) {
                Assert.assertEquals(0xFAFAFAFA, var);
            }
        });
    }

    @Test
    public void test_execBlockWithLong() {
        ObjCBlocks.execBlockWithLong(new ObjCBlocks.Block_execBlockWithLong() {
            @Override
            public void call_execBlockWithLong(long var) {
                Assert.assertEquals(0xFAFAFAFAFAFAFAFAL, var);
            }
        });
    }

    @Test
    public void test_execBlockWithFloat() {
        ObjCBlocks.execBlockWithFloat(new ObjCBlocks.Block_execBlockWithFloat() {
            @Override
            public void call_execBlockWithFloat(float var) {
                Assert.assertEquals(3.14f, var, 0.0f);
            }
        });
    }

    @Test
    public void test_execBlockWithDouble() {
        ObjCBlocks.execBlockWithDouble(new ObjCBlocks.Block_execBlockWithDouble() {
            @Override
            public void call_execBlockWithDouble(double var) {
                Assert.assertEquals(3.14, var, 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithStruct() {
        ObjCBlocks.execBlockWithStruct(new ObjCBlocks.Block_execBlockWithStruct() {
            @Override
            public void call_execBlockWithStruct(@ByValue CGSize var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(10.0, var.width(), 0.0);
                Assert.assertEquals(20.0, var.height(), 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithBoolPtr() {
        ObjCBlocks.execBlockWithBoolPtr(new ObjCBlocks.Block_execBlockWithBoolPtr() {
            @Override
            public void call_execBlockWithBoolPtr(BoolPtr var) {
                Assert.assertNotNull(var);
                Assert.assertFalse(var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithBytePtr() {
        ObjCBlocks.execBlockWithBytePtr(new ObjCBlocks.Block_execBlockWithBytePtr() {
            @Override
            public void call_execBlockWithBytePtr(BytePtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithShortPtr() {
        ObjCBlocks.execBlockWithShortPtr(new ObjCBlocks.Block_execBlockWithShortPtr() {
            @Override
            public void call_execBlockWithShortPtr(ShortPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithCharPtr() {
        ObjCBlocks.execBlockWithCharPtr(new ObjCBlocks.Block_execBlockWithCharPtr() {
            @Override
            public void call_execBlockWithCharPtr(CharPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithIntPtr() {
        ObjCBlocks.execBlockWithIntPtr(new ObjCBlocks.Block_execBlockWithIntPtr() {
            @Override
            public void call_execBlockWithIntPtr(IntPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithLongPtr() {
        ObjCBlocks.execBlockWithLongPtr(new ObjCBlocks.Block_execBlockWithLongPtr() {
            @Override
            public void call_execBlockWithLongPtr(LongPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithFloatPtr() {
        ObjCBlocks.execBlockWithFloatPtr(new ObjCBlocks.Block_execBlockWithFloatPtr() {
            @Override
            public void call_execBlockWithFloatPtr(FloatPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue(), 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithDoublePtr() {
        ObjCBlocks.execBlockWithDoublePtr(new ObjCBlocks.Block_execBlockWithDoublePtr() {
            @Override
            public void call_execBlockWithDoublePtr(DoublePtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue(), 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithStructPtr() {
        ObjCBlocks.execBlockWithStructPtr(new ObjCBlocks.Block_execBlockWithStructPtr() {
            @Override
            public void call_execBlockWithStructPtr(@ReferenceInfo(type = CGSize.class) Ptr<CGSize> var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.get().width(), 0.0);
                Assert.assertEquals(0, var.get().height(), 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithConstBoolPtr() {
        ObjCBlocks.execBlockWithConstBoolPtr(new ObjCBlocks.Block_execBlockWithConstBoolPtr() {
            @Override
            public void call_execBlockWithConstBoolPtr(ConstBoolPtr var) {
                Assert.assertNotNull(var);
                Assert.assertFalse(var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithConstBytePtr() {
        ObjCBlocks.execBlockWithConstBytePtr(new ObjCBlocks.Block_execBlockWithConstBytePtr() {
            @Override
            public void call_execBlockWithConstBytePtr(ConstBytePtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithConstShortPtr() {
        ObjCBlocks.execBlockWithConstShortPtr(new ObjCBlocks.Block_execBlockWithConstShortPtr() {
            @Override
            public void call_execBlockWithConstShortPtr(ConstShortPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithConstCharPtr() {
        ObjCBlocks.execBlockWithConstCharPtr(new ObjCBlocks.Block_execBlockWithConstCharPtr() {
            @Override
            public void call_execBlockWithConstCharPtr(ConstCharPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithConstIntPtr() {
        ObjCBlocks.execBlockWithConstIntPtr(new ObjCBlocks.Block_execBlockWithConstIntPtr() {
            @Override
            public void call_execBlockWithConstIntPtr(ConstIntPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithConstLongPtr() {
        ObjCBlocks.execBlockWithConstLongPtr(new ObjCBlocks.Block_execBlockWithConstLongPtr() {
            @Override
            public void call_execBlockWithConstLongPtr(ConstLongPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue());
            }
        });
    }

    @Test
    public void test_execBlockWithConstFloatPtr() {
        ObjCBlocks.execBlockWithConstFloatPtr(new ObjCBlocks.Block_execBlockWithConstFloatPtr() {
            @Override
            public void call_execBlockWithConstFloatPtr(ConstFloatPtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue(), 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithConstDoublePtr() {
        ObjCBlocks.execBlockWithConstDoublePtr(new ObjCBlocks.Block_execBlockWithConstDoublePtr() {
            @Override
            public void call_execBlockWithConstDoublePtr(ConstDoublePtr var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.getValue(), 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithConstStructPtr() {
        ObjCBlocks.execBlockWithConstStructPtr(new ObjCBlocks.Block_execBlockWithConstStructPtr() {
            @Override
            public void call_execBlockWithConstStructPtr(@ReferenceInfo(type = CGSize.class) ConstPtr<CGSize> var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(0, var.get().width(), 0.0);
                Assert.assertEquals(0, var.get().height(), 0.0);
            }
        });
    }

    @Test
    public void test_execBlockWithConstStructPtr2() {
        ObjCBlocks.execBlockWithStructPtr2(new ObjCBlocks.Block_execBlockWithStructPtr2() {
            @Override
            public void call_execBlockWithStructPtr2(long peer, @UncertainArgument("Options: reference, array Fallback: reference") CGPoint var) {
                Assert.assertNotNull(var);
                Assert.assertEquals(peer, var.getPeerPointer());
                Assert.assertEquals(10.0, var.x(), 0.0);
                Assert.assertEquals(20.0, var.y(), 0.0);
                Assert.assertTrue(ObjCBlocks.validateExecBlockWithStructPtr2(var));
            }
        });
    }

    @Test
    public void test_multiple_native_objc_block() {
        CGSize size = new CGSize(10.0, 20.0);
        Assert.assertTrue(ObjCBlocks.getMultipleBlock().call_getMultipleBlock_ret(
                true, (byte) 0xFA, (char) 0xFAFA, 3.14, 3.14f, 0xFAFAFAFA, 0xFAFAFAFAFAFAFAFAL, (short) 0xFAFA, size,
                true, (byte) 0xFA, (char) 0xFAFA, 3.14, 3.14f, 0xFAFAFAFA, 0xFAFAFAFAFAFAFAFAL, (short) 0xFAFA, size));
    }

    @Test
    public void test_boolean_native_objc_block() {
        Assert.assertTrue(ObjCBlocks.getBooleanAnderBlock().call_getBooleanAnderBlock_ret(true, true));
        Assert.assertFalse(ObjCBlocks.getBooleanAnderBlock().call_getBooleanAnderBlock_ret(true, false));
        Assert.assertFalse(ObjCBlocks.getBooleanAnderBlock().call_getBooleanAnderBlock_ret(false, true));
        Assert.assertFalse(ObjCBlocks.getBooleanAnderBlock().call_getBooleanAnderBlock_ret(false, false));
    }

    @Test
    public void test_byte_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getByteMultiplierBlock().call_getByteMultiplierBlock_ret((byte) 8, (byte) 10), (byte) 80);
    }

    @Test
    public void test_char_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getCharMultiplierBlock().call_getCharMultiplierBlock_ret((char) 100, (char) 100), (char) 10000);
    }

    @Test
    public void test_short_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getShortMultiplierBlock().call_getShortMultiplierBlock_ret((short) 12, (short) 100), (short) 1200);
    }

    @Test
    public void test_int_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getIntMultiplierBlock().call_getIntMultiplierBlock_ret(1000, 1000), 1000000);
    }

    @Test
    public void test_long_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getLongMultiplierBlock().call_getLongMultiplierBlock_ret(1000L, 1000L), 1000000L);
    }

    @Test
    public void test_float_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getFloatMultiplierBlock().call_getFloatMultiplierBlock_ret(8.8f, 10.0f), 88.0f, 0.0f);
    }

    @Test
    public void test_double_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getDoubleMultiplierBlock().call_getDoubleMultiplierBlock_ret(8.8, 10.0), 88.0, 0.0);
    }

    @Test
    public void test_void_native_objc_block() {
        NSMutableArray array = NSMutableArray.alloc().initWithCapacity(2);
        ObjCBlocks.getVoidStringArrayElementAdderBlock().call_getVoidStringArrayElementAdderBlock_ret(array, "apple", "pear");
        Assert.assertEquals(array.count(), 2);
        Assert.assertEquals(array.get(0), "apple");
        Assert.assertEquals(array.get(1), "pear");
    }

    @Test
    public void test_array_native_objc_block() {
        NSMutableArray array = ObjCBlocks.getStringArrayElementAdderBlock().call_getStringArrayElementAdderBlock_ret("apple", "pear");
        Assert.assertEquals(array.count(), 2);
        Assert.assertEquals(array.get(0), "apple");
        Assert.assertEquals(array.get(1), "pear");
    }

    @Test
    public void test_string_native_objc_block() {
        Assert.assertEquals(ObjCBlocks.getStringConcatenaterBlock().call_getStringConcatenaterBlock_ret("apple", "pear"), "applepear");
    }

    @Test
    public void test_native_objc_block_wrapper() {
        Class cls = new Class(BlockObject.wrap(ObjCBlocks.getBooleanAnderBlock()));
        Class expected = new Class("NSBlock");
        while (cls != null) {
            if (cls.equals(expected)) {
                return;
            }
            cls = cls.getSuper();
        }
        Assert.fail();
    }

    @Test
    public void test_nested_block_call() {
        Assert.assertEquals(ObjCBlocks_Nested.getBlockCallerBlock(600).call_getBlockCallerBlock(new ObjCBlocks_Nested.Block_getBlockCallerBlock_inner() {
            @Override
            public int call_getBlockCallerBlock_inner(@ObjCBlock(name = "call_getBlockCallerBlock_inner_inner") ObjCBlocks_Nested.Block_getBlockCallerBlock_inner_inner block) {
                int ret = block.call_getBlockCallerBlock_inner_inner();
                Assert.assertEquals(ret, 600);
                return ret * 2;
            }
        }), 1200);

        Assert.assertEquals(ObjCBlocks_Nested.performBlockCallerBlock(new ObjCBlocks_Nested.Block_getBlockCallerBlock_inner() {
            @Override
            public int call_getBlockCallerBlock_inner(@ObjCBlock(name = "call_getBlockCallerBlock_inner_inner") ObjCBlocks_Nested.Block_getBlockCallerBlock_inner_inner block) {
                int ret = block.call_getBlockCallerBlock_inner_inner();
                Assert.assertEquals(ret, 500);
                return ret * 4;
            }
        }, 500), 2000);
    }

    @Test
    public void test_nint_block() {
        Assert.assertEquals(ObjCBlocks.getNIntAdder().call_getNIntAdder_ret(500L, 1000L), 1500L);
    }

    @Test
    public void test_nuint_block() {
        Assert.assertEquals(ObjCBlocks.getNUIntAdder().call_getNUIntAdder_ret(500L, 1000L), 1500L);
    }

    @Test
    public void test_nfloat_block() {
        Assert.assertEquals(ObjCBlocks.getNFloatAdder().call_getNFloatAdder_ret(500.0, 1000.0), 1500.0, 0.0);
    }

    @Test
    public void test_out_arg_block() {
        Ptr<NSError> ptr = PtrFactory.newObjectReference(NSError.class);
        ObjCBlocks.getBlockWithOutArg().call_getBlockWithOutArg_ret(ptr);
        NSError err = ptr.get();

        Assert.assertNotNull(err);
        Assert.assertEquals(err.domain(), "test");
        Assert.assertEquals(err.code(), 123L);
    }

}
