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

package objc.tests.protocolproxy;

import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCRuntime;
import apple.coregraphics.struct.CGSize;
import objc.binding.ProtocolFactoryClass;
import objc.binding.protocol.ProxiedConstPtrProtocol;
import objc.binding.protocol.ProxiedPtrProtocol;
import objc.binding.protocol.ProxiedValueProtocol;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProtocolProxyTest {

    /*
     * Initialization
     */

    static ProtocolFactoryClass factory;
    static ProxiedValueProtocol valueObject;
    static ProxiedPtrProtocol ptrObject;
    static ProxiedConstPtrProtocol constPtrObject;
    static ProxiedValueProtocol castableValueObject;
    static ProxiedValueProtocol nonTransparentCastableValueObject;

    @BeforeClass
    public static void initialize() {
        // We instantiate every protocol object all at once to forcibly have
        // multiple protocol proxy for the same native object.
        factory = ProtocolFactoryClass.alloc().init();
        valueObject = factory.valueObject();
        ptrObject = factory.ptrObject();
        constPtrObject = factory.constPtrObject();
        castableValueObject = ObjCRuntime.castToProtocol(factory.castableValueObject(), ProxiedValueProtocol.class, true);
        nonTransparentCastableValueObject = ObjCRuntime.castToProtocol(factory.castableValueObject(), ProxiedValueProtocol.class, false);
    }


    /*
     * Testing cast
     */

    @Test
    public void test_Cast() {
        Assert.assertTrue(factory.checkTransparentValueObjectAndNonTransparentValueObject(castableValueObject, nonTransparentCastableValueObject));
    }


    /*
     * Testing redundant call
     */

    @Test
    public void test_RedundantCall() {
        ProxiedValueProtocol valueObject2 = factory.valueObject();
        Assert.assertSame(valueObject, valueObject2);
    }


    /*
     * Testing values
     */

    @Test
    public void test_Bool() {
        Assert.assertTrue(valueObject.returnBool(true));
        Assert.assertFalse(valueObject.returnBool(false));
    }

    @Test
    public void test_Byte() {
        Assert.assertEquals(valueObject.returnByte((byte) 0xFA), (byte) 0xFA);
    }

    @Test
    public void test_Char() {
        Assert.assertEquals(valueObject.returnChar((char) 0xFAFA), (char) 0xFAFA);
    }

    @Test
    public void test_Double() {
        Assert.assertEquals(valueObject.returnDouble(3.14), 3.14, 0.0);
    }

    @Test
    public void test_Float() {
        Assert.assertEquals(valueObject.returnFloat(3.14f), 3.14f, 0.0);
    }

    @Test
    public void test_Int() {
        Assert.assertEquals(valueObject.returnInt(0xFAFAFAFA), 0xFAFAFAFA);
    }

    @Test
    public void test_Long() {
        Assert.assertEquals(valueObject.returnLong(0xFAFAFAFAFAFAFAFAL), 0xFAFAFAFAFAFAFAFAL);
    }

    @Test
    public void test_Short() {
        Assert.assertEquals(valueObject.returnShort((short) 0xFAFA), (short) 0xFAFA);
    }

    @Test
    public void test_Struct() {
        CGSize size1 = new CGSize(10.0, 20.0);
        CGSize size2 = valueObject.returnStruct(size1);
        Assert.assertEquals(size1.width(), size2.width(), 0.0);
        Assert.assertEquals(size1.height(), size2.height(), 0.0);
    }

    @Test
    public void test_Multiple() {
        CGSize size = new CGSize(10.0, 20.0);
        Assert.assertTrue(valueObject.checkMultiple(
                true, (byte) 0xFA, (char) 0xFAFA, 3.14, 3.14f, 0xFAFAFAFA, 0xFAFAFAFAFAFAFAFAL, (short) 0xFAFA, size,
                true, (byte) 0xFA, (char) 0xFAFA, 3.14, 3.14f, 0xFAFAFAFA, 0xFAFAFAFAFAFAFAFAL, (short) 0xFAFA, size));
    }


    /*
     * Testing pointers
     */

    @Test
    public void test_BoolPtr() {
        Assert.assertTrue(ptrObject.returnBoolPtr(PtrFactory.newBoolReference(true)));
        Assert.assertFalse(ptrObject.returnBoolPtr(PtrFactory.newBoolReference(false)));
    }

    @Test
    public void test_BytePtr() {
        Assert.assertEquals(ptrObject.returnBytePtr(PtrFactory.newByteReference((byte) 0xFA)), (byte) 0xFA);
    }

    @Test
    public void test_CharPtr() {
        Assert.assertEquals(ptrObject.returnCharPtr(PtrFactory.newCharReference((char) 0xFAFA)), (char) 0xFAFA);
    }

    @Test
    public void test_DoublePtr() {
        Assert.assertEquals(ptrObject.returnDoublePtr(PtrFactory.newDoubleReference(3.14)), 3.14, 0.0);
    }

    @Test
    public void test_FloatPtr() {
        Assert.assertEquals(ptrObject.returnFloatPtr(PtrFactory.newFloatReference(3.14f)), 3.14f, 0.0);
    }

    @Test
    public void test_IntPtr() {
        Assert.assertEquals(ptrObject.returnIntPtr(PtrFactory.newIntReference(0xFAFAFAFA)), 0xFAFAFAFA);
    }

    @Test
    public void test_LongPtr() {
        Assert.assertEquals(ptrObject.returnLongPtr(PtrFactory.newLongReference(0xFAFAFAFAFAFAFAFAL)), 0xFAFAFAFAFAFAFAFAL);
    }

    @Test
    public void test_ShortPtr() {
        Assert.assertEquals(ptrObject.returnShortPtr(PtrFactory.newShortReference((short) 0xFAFA)), (short) 0xFAFA);
    }

    @Test
    public void test_StructPtr2() {
        CGSize size1 = new CGSize(10.0, 20.0);
        CGSize size2 = ptrObject.returnStructPtr2(size1);
        Assert.assertEquals(size1.width(), size2.width(), 0.0);
        Assert.assertEquals(size1.height(), size2.height(), 0.0);
    }

    @Test
    public void test_StructPtr() {
        CGSize size1 = new CGSize(10.0, 20.0);
        CGSize size2 = ptrObject.returnStructPtr(PtrFactory.newStructReference(size1));
        Assert.assertEquals(size1.width(), size2.width(), 0.0);
        Assert.assertEquals(size1.height(), size2.height(), 0.0);
    }


    /*
     * Testing constant pointers
     */

    @Test
    public void test_ConstBoolPtr() {
        Assert.assertTrue(constPtrObject.returnConstBoolPtr(PtrFactory.newBoolReference(true)));
        Assert.assertFalse(constPtrObject.returnConstBoolPtr(PtrFactory.newBoolReference(false)));
    }

    @Test
    public void test_ConstBytePtr() {
        Assert.assertEquals(constPtrObject.returnConstBytePtr(PtrFactory.newByteReference((byte) 0xFA)), (byte) 0xFA);
    }

    @Test
    public void test_ConstCharPtr() {
        Assert.assertEquals(constPtrObject.returnConstCharPtr(PtrFactory.newCharReference((char) 0xFAFA)), (char) 0xFAFA);
    }

    @Test
    public void test_ConstDoublePtr() {
        Assert.assertEquals(constPtrObject.returnConstDoublePtr(PtrFactory.newDoubleReference(3.14)), 3.14, 0.0);
    }

    @Test
    public void test_ConstFloatPtr() {
        Assert.assertEquals(constPtrObject.returnConstFloatPtr(PtrFactory.newFloatReference(3.14f)), 3.14f, 0.0);
    }

    @Test
    public void test_ConstIntPtr() {
        Assert.assertEquals(constPtrObject.returnConstIntPtr(PtrFactory.newIntReference(0xFAFAFAFA)), 0xFAFAFAFA);
    }

    @Test
    public void test_ConstLongPtr() {
        Assert.assertEquals(constPtrObject.returnConstLongPtr(PtrFactory.newLongReference(0xFAFAFAFAFAFAFAFAL)), 0xFAFAFAFAFAFAFAFAL);
    }

    @Test
    public void test_ConstShortPtr() {
        Assert.assertEquals(constPtrObject.returnConstShortPtr(PtrFactory.newShortReference((short) 0xFAFA)), (short) 0xFAFA);
    }

    @Test
    public void test_ConstStructPtr() {
        CGSize size1 = new CGSize(10.0, 20.0);
        CGSize size2 = constPtrObject.returnConstStructPtr(PtrFactory.newStructReference(size1));
        Assert.assertEquals(size1.width(), size2.width(), 0.0);
        Assert.assertEquals(size1.height(), size2.height(), 0.0);
    }


    /*
     * Testing values of castable object
     */

    @Test
    public void test_Bool_casted() {
        Assert.assertTrue(castableValueObject.returnBool(true));
        Assert.assertFalse(castableValueObject.returnBool(false));
    }

    @Test
    public void test_Byte_casted() {
        Assert.assertEquals(castableValueObject.returnByte((byte) 0xFA), (byte) 0xFA);
    }

    @Test
    public void test_Char_casted() {
        Assert.assertEquals(castableValueObject.returnChar((char) 0xFAFA), (char) 0xFAFA);
    }

    @Test
    public void test_Double_casted() {
        Assert.assertEquals(castableValueObject.returnDouble(3.14), 3.14, 0.0);
    }

    @Test
    public void test_Float_casted() {
        Assert.assertEquals(castableValueObject.returnFloat(3.14f), 3.14f, 0.0);
    }

    @Test
    public void test_Int_casted() {
        Assert.assertEquals(castableValueObject.returnInt(0xFAFAFAFA), 0xFAFAFAFA);
    }

    @Test
    public void test_Long_casted() {
        Assert.assertEquals(castableValueObject.returnLong(0xFAFAFAFAFAFAFAFAL), 0xFAFAFAFAFAFAFAFAL);
    }

    @Test
    public void test_Short_casted() {
        Assert.assertEquals(castableValueObject.returnShort((short) 0xFAFA), (short) 0xFAFA);
    }

    @Test
    public void test_Struct_casted() {
        CGSize size1 = new CGSize(10.0, 20.0);
        CGSize size2 = castableValueObject.returnStruct(size1);
        Assert.assertEquals(size1.width(), size2.width(), 0.0);
        Assert.assertEquals(size1.height(), size2.height(), 0.0);
    }

    @Test
    public void test_Multiple_casted() {
        CGSize size = new CGSize(10.0, 20.0);
        Assert.assertTrue(castableValueObject.checkMultiple(
                true, (byte) 0xFA, (char) 0xFAFA, 3.14, 3.14f, 0xFAFAFAFA, 0xFAFAFAFAFAFAFAFAL, (short) 0xFAFA, size,
                true, (byte) 0xFA, (char) 0xFAFA, 3.14, 3.14f, 0xFAFAFAFA, 0xFAFAFAFAFAFAFAFAL, (short) 0xFAFA, size));
    }
}
