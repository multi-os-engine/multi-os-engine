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

package objc.binding;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class PrimitiveClass extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PrimitiveClass(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native PrimitiveClass alloc();

    @Generated
    @Selector("boolArrayCompare:::")
    public native boolean boolArrayCompare(BoolPtr a, BoolPtr b, int count);

    @Generated
    @Selector("boolArrayCompare:::")
    public static native boolean boolArrayCompare_static(BoolPtr a, BoolPtr b,
                                                         int count);

    @Generated
    @Selector("boolArrayFree:")
    public native void boolArrayFree(BoolPtr a);

    @Generated
    @Selector("boolArrayFree:")
    public static native void boolArrayFree_static(BoolPtr a);

    @Generated
    @Selector("boolArrayRefCompare:::")
    public native boolean boolArrayRefCompare(Ptr<BoolPtr> a, BoolPtr b,
                                              int count);

    @Generated
    @Selector("boolArrayRefCompare:::")
    public static native boolean boolArrayRefCompare_static(Ptr<BoolPtr> a,
                                                            BoolPtr b, int count);

    @Generated
    @Selector("boolArrayRefFree:")
    public native void boolArrayRefFree(Ptr<BoolPtr> a);

    @Generated
    @Selector("boolArrayRefFree:")
    public static native void boolArrayRefFree_static(Ptr<BoolPtr> a);

    @Generated
    @Selector("boolCompare::")
    public native boolean boolCompare(boolean a, boolean b);

    @Generated
    @Selector("boolCompare::")
    public static native boolean boolCompare_static(boolean a, boolean b);

    @Generated
    @Selector("boolCreate:")
    public native boolean boolCreate(boolean a);

    @Generated
    @Selector("boolCreate:")
    public static native boolean boolCreate_static(boolean a);

    @Generated
    @Selector("boolCreateArray:")
    public native BoolPtr boolCreateArray(int count);

    @Generated
    @Selector("boolCreateArray:")
    public static native BoolPtr boolCreateArray_static(int count);

    @Generated
    @Selector("boolCreateArrayRef:")
    @ReferenceInfo(type = Boolean.class, depth = 2)
    public native Ptr<BoolPtr> boolCreateArrayRef(BoolPtr array);

    @Generated
    @Selector("boolCreateArrayRef:")
    @ReferenceInfo(type = Boolean.class, depth = 2)
    public static native Ptr<BoolPtr> boolCreateArrayRef_static(BoolPtr array);

    @Generated
    @Selector("byteArrayCompare:::")
    public native boolean byteArrayCompare(BytePtr a, BytePtr b, int count);

    @Generated
    @Selector("byteArrayCompare:::")
    public static native boolean byteArrayCompare_static(BytePtr a, BytePtr b,
                                                         int count);

    @Generated
    @Selector("byteArrayFree:")
    public native void byteArrayFree(BytePtr a);

    @Generated
    @Selector("byteArrayFree:")
    public static native void byteArrayFree_static(BytePtr a);

    @Generated
    @Selector("byteArrayRefCompare:::")
    public native boolean byteArrayRefCompare(Ptr<BytePtr> a, BytePtr b,
                                              int count);

    @Generated
    @Selector("byteArrayRefCompare:::")
    public static native boolean byteArrayRefCompare_static(Ptr<BytePtr> a,
                                                            BytePtr b, int count);

    @Generated
    @Selector("byteArrayRefFree:")
    public native void byteArrayRefFree(Ptr<BytePtr> a);

    @Generated
    @Selector("byteArrayRefFree:")
    public static native void byteArrayRefFree_static(Ptr<BytePtr> a);

    @Generated
    @Selector("byteCompare::")
    public native boolean byteCompare(byte a, byte b);

    @Generated
    @Selector("byteCompare::")
    public static native boolean byteCompare_static(byte a, byte b);

    @Generated
    @Selector("byteCreate:")
    public native byte byteCreate(byte a);

    @Generated
    @Selector("byteCreate:")
    public static native byte byteCreate_static(byte a);

    @Generated
    @Selector("byteCreateArray:")
    public native BytePtr byteCreateArray(int count);

    @Generated
    @Selector("byteCreateArray:")
    public static native BytePtr byteCreateArray_static(int count);

    @Generated
    @Selector("byteCreateArrayRef:")
    @ReferenceInfo(type = Byte.class, depth = 2)
    public native Ptr<BytePtr> byteCreateArrayRef(BytePtr array);

    @Generated
    @Selector("byteCreateArrayRef:")
    @ReferenceInfo(type = Byte.class, depth = 2)
    public static native Ptr<BytePtr> byteCreateArrayRef_static(BytePtr array);

    @Generated
    @Selector("charArrayCompare:::")
    public native boolean charArrayCompare(CharPtr a, CharPtr b, int count);

    @Generated
    @Selector("charArrayCompare:::")
    public static native boolean charArrayCompare_static(CharPtr a, CharPtr b,
                                                         int count);

    @Generated
    @Selector("charArrayFree:")
    public native void charArrayFree(CharPtr a);

    @Generated
    @Selector("charArrayFree:")
    public static native void charArrayFree_static(CharPtr a);

    @Generated
    @Selector("charArrayRefCompare:::")
    public native boolean charArrayRefCompare(Ptr<CharPtr> a, CharPtr b,
                                              int count);

    @Generated
    @Selector("charArrayRefCompare:::")
    public static native boolean charArrayRefCompare_static(Ptr<CharPtr> a,
                                                            CharPtr b, int count);

    @Generated
    @Selector("charArrayRefFree:")
    public native void charArrayRefFree(Ptr<CharPtr> a);

    @Generated
    @Selector("charArrayRefFree:")
    public static native void charArrayRefFree_static(Ptr<CharPtr> a);

    @Generated
    @Selector("charCompare::")
    public native boolean charCompare(char a, char b);

    @Generated
    @Selector("charCompare::")
    public static native boolean charCompare_static(char a, char b);

    @Generated
    @Selector("charCreate:")
    public native char charCreate(char a);

    @Generated
    @Selector("charCreate:")
    public static native char charCreate_static(char a);

    @Generated
    @Selector("charCreateArray:")
    public native CharPtr charCreateArray(int count);

    @Generated
    @Selector("charCreateArray:")
    public static native CharPtr charCreateArray_static(int count);

    @Generated
    @Selector("charCreateArrayRef:")
    @ReferenceInfo(type = Character.class, depth = 2)
    public native Ptr<CharPtr> charCreateArrayRef(CharPtr array);

    @Generated
    @Selector("charCreateArrayRef:")
    @ReferenceInfo(type = Character.class, depth = 2)
    public static native Ptr<CharPtr> charCreateArrayRef_static(CharPtr array);

    @Generated
    @Selector("doubleArrayCompare:::")
    public native boolean doubleArrayCompare(DoublePtr a, DoublePtr b, int count);

    @Generated
    @Selector("doubleArrayCompare:::")
    public static native boolean doubleArrayCompare_static(DoublePtr a,
                                                           DoublePtr b, int count);

    @Generated
    @Selector("doubleArrayFree:")
    public native void doubleArrayFree(DoublePtr a);

    @Generated
    @Selector("doubleArrayFree:")
    public static native void doubleArrayFree_static(DoublePtr a);

    @Generated
    @Selector("doubleArrayRefCompare:::")
    public native boolean doubleArrayRefCompare(Ptr<DoublePtr> a, DoublePtr b,
                                                int count);

    @Generated
    @Selector("doubleArrayRefCompare:::")
    public static native boolean doubleArrayRefCompare_static(Ptr<DoublePtr> a,
                                                              DoublePtr b, int count);

    @Generated
    @Selector("doubleArrayRefFree:")
    public native void doubleArrayRefFree(Ptr<DoublePtr> a);

    @Generated
    @Selector("doubleArrayRefFree:")
    public static native void doubleArrayRefFree_static(Ptr<DoublePtr> a);

    @Generated
    @Selector("doubleCompare::")
    public native boolean doubleCompare(double a, double b);

    @Generated
    @Selector("doubleCompare::")
    public static native boolean doubleCompare_static(double a, double b);

    @Generated
    @Selector("doubleCreate:")
    public native double doubleCreate(double a);

    @Generated
    @Selector("doubleCreate:")
    public static native double doubleCreate_static(double a);

    @Generated
    @Selector("doubleCreateArray:")
    public native DoublePtr doubleCreateArray(int count);

    @Generated
    @Selector("doubleCreateArray:")
    public static native DoublePtr doubleCreateArray_static(int count);

    @Generated
    @Selector("doubleCreateArrayRef:")
    @ReferenceInfo(type = Double.class, depth = 2)
    public native Ptr<DoublePtr> doubleCreateArrayRef(DoublePtr array);

    @Generated
    @Selector("doubleCreateArrayRef:")
    @ReferenceInfo(type = Double.class, depth = 2)
    public static native Ptr<DoublePtr> doubleCreateArrayRef_static(
            DoublePtr array);

    @Generated
    @Selector("floatArrayCompare:::")
    public native boolean floatArrayCompare(FloatPtr a, FloatPtr b, int count);

    @Generated
    @Selector("floatArrayCompare:::")
    public static native boolean floatArrayCompare_static(FloatPtr a,
                                                          FloatPtr b, int count);

    @Generated
    @Selector("floatArrayFree:")
    public native void floatArrayFree(FloatPtr a);

    @Generated
    @Selector("floatArrayFree:")
    public static native void floatArrayFree_static(FloatPtr a);

    @Generated
    @Selector("floatArrayRefCompare:::")
    public native boolean floatArrayRefCompare(Ptr<FloatPtr> a, FloatPtr b,
                                               int count);

    @Generated
    @Selector("floatArrayRefCompare:::")
    public static native boolean floatArrayRefCompare_static(Ptr<FloatPtr> a,
                                                             FloatPtr b, int count);

    @Generated
    @Selector("floatArrayRefFree:")
    public native void floatArrayRefFree(Ptr<FloatPtr> a);

    @Generated
    @Selector("floatArrayRefFree:")
    public static native void floatArrayRefFree_static(Ptr<FloatPtr> a);

    @Generated
    @Selector("floatCompare::")
    public native boolean floatCompare(float a, float b);

    @Generated
    @Selector("floatCompare::")
    public static native boolean floatCompare_static(float a, float b);

    @Generated
    @Selector("floatCreate:")
    public native float floatCreate(float a);

    @Generated
    @Selector("floatCreate:")
    public static native float floatCreate_static(float a);

    @Generated
    @Selector("floatCreateArray:")
    public native FloatPtr floatCreateArray(int count);

    @Generated
    @Selector("floatCreateArray:")
    public static native FloatPtr floatCreateArray_static(int count);

    @Generated
    @Selector("floatCreateArrayRef:")
    @ReferenceInfo(type = Float.class, depth = 2)
    public native Ptr<FloatPtr> floatCreateArrayRef(FloatPtr array);

    @Generated
    @Selector("floatCreateArrayRef:")
    @ReferenceInfo(type = Float.class, depth = 2)
    public static native Ptr<FloatPtr> floatCreateArrayRef_static(FloatPtr array);

    @Generated
    @Selector("init")
    public native PrimitiveClass init();

    @Generated
    @Selector("intArrayCompare:::")
    public native boolean intArrayCompare(IntPtr a, IntPtr b, int count);

    @Generated
    @Selector("intArrayCompare:::")
    public static native boolean intArrayCompare_static(IntPtr a, IntPtr b,
                                                        int count);

    @Generated
    @Selector("intArrayFree:")
    public native void intArrayFree(IntPtr a);

    @Generated
    @Selector("intArrayFree:")
    public static native void intArrayFree_static(IntPtr a);

    @Generated
    @Selector("intArrayRefCompare:::")
    public native boolean intArrayRefCompare(Ptr<IntPtr> a, IntPtr b, int count);

    @Generated
    @Selector("intArrayRefCompare:::")
    public static native boolean intArrayRefCompare_static(Ptr<IntPtr> a,
                                                           IntPtr b, int count);

    @Generated
    @Selector("intArrayRefFree:")
    public native void intArrayRefFree(Ptr<IntPtr> a);

    @Generated
    @Selector("intArrayRefFree:")
    public static native void intArrayRefFree_static(Ptr<IntPtr> a);

    @Generated
    @Selector("intCompare::")
    public native boolean intCompare(int a, int b);

    @Generated
    @Selector("intCompare::")
    public static native boolean intCompare_static(int a, int b);

    @Generated
    @Selector("intCreate:")
    public native int intCreate(int a);

    @Generated
    @Selector("intCreate:")
    public static native int intCreate_static(int a);

    @Generated
    @Selector("intCreateArray:")
    public native IntPtr intCreateArray(int count);

    @Generated
    @Selector("intCreateArray:")
    public static native IntPtr intCreateArray_static(int count);

    @Generated
    @Selector("intCreateArrayRef:")
    @ReferenceInfo(type = Integer.class, depth = 2)
    public native Ptr<IntPtr> intCreateArrayRef(IntPtr array);

    @Generated
    @Selector("intCreateArrayRef:")
    @ReferenceInfo(type = Integer.class, depth = 2)
    public static native Ptr<IntPtr> intCreateArrayRef_static(IntPtr array);

    @Generated
    @Selector("longArrayCompare:::")
    public native boolean longArrayCompare(LongPtr a, LongPtr b, int count);

    @Generated
    @Selector("longArrayCompare:::")
    public static native boolean longArrayCompare_static(LongPtr a, LongPtr b,
                                                         int count);

    @Generated
    @Selector("longArrayFree:")
    public native void longArrayFree(LongPtr a);

    @Generated
    @Selector("longArrayFree:")
    public static native void longArrayFree_static(LongPtr a);

    @Generated
    @Selector("longArrayRefCompare:::")
    public native boolean longArrayRefCompare(Ptr<LongPtr> a, LongPtr b,
                                              int count);

    @Generated
    @Selector("longArrayRefCompare:::")
    public static native boolean longArrayRefCompare_static(Ptr<LongPtr> a,
                                                            LongPtr b, int count);

    @Generated
    @Selector("longArrayRefFree:")
    public native void longArrayRefFree(Ptr<LongPtr> a);

    @Generated
    @Selector("longArrayRefFree:")
    public static native void longArrayRefFree_static(Ptr<LongPtr> a);

    @Generated
    @Selector("longCompare::")
    public native boolean longCompare(long a, long b);

    @Generated
    @Selector("longCompare::")
    public static native boolean longCompare_static(long a, long b);

    @Generated
    @Selector("longCreate:")
    public native long longCreate(long a);

    @Generated
    @Selector("longCreate:")
    public static native long longCreate_static(long a);

    @Generated
    @Selector("longCreateArray:")
    public native LongPtr longCreateArray(int count);

    @Generated
    @Selector("longCreateArray:")
    public static native LongPtr longCreateArray_static(int count);

    @Generated
    @Selector("longCreateArrayRef:")
    @ReferenceInfo(type = Long.class, depth = 2)
    public native Ptr<LongPtr> longCreateArrayRef(LongPtr array);

    @Generated
    @Selector("longCreateArrayRef:")
    @ReferenceInfo(type = Long.class, depth = 2)
    public static native Ptr<LongPtr> longCreateArrayRef_static(LongPtr array);

    @Generated
    @Selector("shortArrayCompare:::")
    public native boolean shortArrayCompare(ShortPtr a, ShortPtr b, int count);

    @Generated
    @Selector("shortArrayCompare:::")
    public static native boolean shortArrayCompare_static(ShortPtr a,
                                                          ShortPtr b, int count);

    @Generated
    @Selector("shortArrayFree:")
    public native void shortArrayFree(ShortPtr a);

    @Generated
    @Selector("shortArrayFree:")
    public static native void shortArrayFree_static(ShortPtr a);

    @Generated
    @Selector("shortArrayRefCompare:::")
    public native boolean shortArrayRefCompare(Ptr<ShortPtr> a, ShortPtr b,
                                               int count);

    @Generated
    @Selector("shortArrayRefCompare:::")
    public static native boolean shortArrayRefCompare_static(Ptr<ShortPtr> a,
                                                             ShortPtr b, int count);

    @Generated
    @Selector("shortArrayRefFree:")
    public native void shortArrayRefFree(Ptr<ShortPtr> a);

    @Generated
    @Selector("shortArrayRefFree:")
    public static native void shortArrayRefFree_static(Ptr<ShortPtr> a);

    @Generated
    @Selector("shortCompare::")
    public native boolean shortCompare(short a, short b);

    @Generated
    @Selector("shortCompare::")
    public static native boolean shortCompare_static(short a, short b);

    @Generated
    @Selector("shortCreate:")
    public native short shortCreate(short a);

    @Generated
    @Selector("shortCreate:")
    public static native short shortCreate_static(short a);

    @Generated
    @Selector("shortCreateArray:")
    public native ShortPtr shortCreateArray(int count);

    @Generated
    @Selector("shortCreateArray:")
    public static native ShortPtr shortCreateArray_static(int count);

    @Generated
    @Selector("shortCreateArrayRef:")
    @ReferenceInfo(type = Short.class, depth = 2)
    public native Ptr<ShortPtr> shortCreateArrayRef(ShortPtr array);

    @Generated
    @Selector("shortCreateArrayRef:")
    @ReferenceInfo(type = Short.class, depth = 2)
    public static native Ptr<ShortPtr> shortCreateArrayRef_static(ShortPtr array);
}
