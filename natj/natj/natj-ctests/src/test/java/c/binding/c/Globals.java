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

package c.binding.c;


import c.binding.struct.NG_ISMulti_Struct;
import c.binding.struct.NG_I_Struct;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;

@Generated
@Runtime(CRuntime.class)
@Library("TestClassesC")
public final class Globals {
    static {
        NatJ.register();
    }

    @Generated
    private Globals() {
    }

    @Generated
    @CFunction
    public static native boolean NGBoolCreate(boolean a);

    @Generated
    @CFunction
    public static native byte NGByteCreate(byte a);

    @Generated
    @CFunction
    public static native short NGShortCreate(short a);

    @Generated
    @CFunction
    public static native char NGCharCreate(char a);

    @Generated
    @CFunction
    public static native int NGIntCreate(int a);

    @Generated
    @CFunction
    public static native long NGLongCreate(long a);

    @Generated
    @CFunction
    public static native float NGFloatCreate(float a);

    @Generated
    @CFunction
    public static native double NGDoubleCreate(double a);

    @Generated
    @CFunction
    public static native boolean NGBoolCompare(boolean a, boolean b);

    @Generated
    @CFunction
    public static native boolean NGByteCompare(byte a, byte b);

    @Generated
    @CFunction
    public static native boolean NGShortCompare(short a, short b);

    @Generated
    @CFunction
    public static native boolean NGCharCompare(char a, char b);

    @Generated
    @CFunction
    public static native boolean NGIntCompare(int a, int b);

    @Generated
    @CFunction
    public static native boolean NGLongCompare(long a, long b);

    @Generated
    @CFunction
    public static native boolean NGFloatCompare(float a, float b);

    @Generated
    @CFunction
    public static native boolean NGDoubleCompare(double a, double b);

    @Generated
    @CFunction
    public static native BoolPtr NGBoolCreateArray(int count);

    @Generated
    @CFunction
    public static native BytePtr NGByteCreateArray(int count);

    @Generated
    @CFunction
    public static native ShortPtr NGShortCreateArray(int count);

    @Generated
    @CFunction
    public static native CharPtr NGCharCreateArray(int count);

    @Generated
    @CFunction
    public static native IntPtr NGIntCreateArray(int count);

    @Generated
    @CFunction
    public static native LongPtr NGLongCreateArray(int count);

    @Generated
    @CFunction
    public static native FloatPtr NGFloatCreateArray(int count);

    @Generated
    @CFunction
    public static native DoublePtr NGDoubleCreateArray(int count);

    @Generated
    @CFunction
    public static native boolean NGBoolArrayCompare(BoolPtr a, BoolPtr b,
                                                    int count);

    @Generated
    @CFunction
    public static native boolean NGByteArrayCompare(BytePtr a, BytePtr b,
                                                    int count);

    @Generated
    @CFunction
    public static native boolean NGShortArrayCompare(ShortPtr a, ShortPtr b,
                                                     int count);

    @Generated
    @CFunction
    public static native boolean NGCharArrayCompare(CharPtr a, CharPtr b,
                                                    int count);

    @Generated
    @CFunction
    public static native boolean NGIntArrayCompare(IntPtr a, IntPtr b, int count);

    @Generated
    @CFunction
    public static native boolean NGLongArrayCompare(LongPtr a, LongPtr b,
                                                    int count);

    @Generated
    @CFunction
    public static native boolean NGFloatArrayCompare(FloatPtr a, FloatPtr b,
                                                     int count);

    @Generated
    @CFunction
    public static native boolean NGDoubleArrayCompare(DoublePtr a, DoublePtr b,
                                                      int count);

    @Generated
    @CFunction
    public static native void NGBoolArrayFree(BoolPtr a);

    @Generated
    @CFunction
    public static native void NGByteArrayFree(BytePtr a);

    @Generated
    @CFunction
    public static native void NGShortArrayFree(ShortPtr a);

    @Generated
    @CFunction
    public static native void NGCharArrayFree(CharPtr a);

    @Generated
    @CFunction
    public static native void NGIntArrayFree(IntPtr a);

    @Generated
    @CFunction
    public static native void NGLongArrayFree(LongPtr a);

    @Generated
    @CFunction
    public static native void NGFloatArrayFree(FloatPtr a);

    @Generated
    @CFunction
    public static native void NGDoubleArrayFree(DoublePtr a);

    @Generated
    @CFunction
    @ReferenceInfo(type = Boolean.class, depth = 2)
    public static native Ptr<BoolPtr> NGBoolCreateArrayRef(BoolPtr array);

    @Generated
    @CFunction
    @ReferenceInfo(type = Byte.class, depth = 2)
    public static native Ptr<BytePtr> NGByteCreateArrayRef(BytePtr array);

    @Generated
    @CFunction
    @ReferenceInfo(type = Short.class, depth = 2)
    public static native Ptr<ShortPtr> NGShortCreateArrayRef(ShortPtr array);

    @Generated
    @CFunction
    @ReferenceInfo(type = Character.class, depth = 2)
    public static native Ptr<CharPtr> NGCharCreateArrayRef(CharPtr array);

    @Generated
    @CFunction
    @ReferenceInfo(type = Integer.class, depth = 2)
    public static native Ptr<IntPtr> NGIntCreateArrayRef(IntPtr array);

    @Generated
    @CFunction
    @ReferenceInfo(type = Long.class, depth = 2)
    public static native Ptr<LongPtr> NGLongCreateArrayRef(LongPtr array);

    @Generated
    @CFunction
    @ReferenceInfo(type = Float.class, depth = 2)
    public static native Ptr<FloatPtr> NGFloatCreateArrayRef(FloatPtr array);

    @Generated
    @CFunction
    @ReferenceInfo(type = Double.class, depth = 2)
    public static native Ptr<DoublePtr> NGDoubleCreateArrayRef(DoublePtr array);

    @Generated
    @CFunction
    public static native boolean NGBoolArrayRefCompare(Ptr<BoolPtr> a,
                                                       BoolPtr b, int count);

    @Generated
    @CFunction
    public static native boolean NGByteArrayRefCompare(Ptr<BytePtr> a,
                                                       BytePtr b, int count);

    @Generated
    @CFunction
    public static native boolean NGShortArrayRefCompare(Ptr<ShortPtr> a,
                                                        ShortPtr b, int count);

    @Generated
    @CFunction
    public static native boolean NGCharArrayRefCompare(Ptr<CharPtr> a,
                                                       CharPtr b, int count);

    @Generated
    @CFunction
    public static native boolean NGIntArrayRefCompare(Ptr<IntPtr> a, IntPtr b,
                                                      int count);

    @Generated
    @CFunction
    public static native boolean NGLongArrayRefCompare(Ptr<LongPtr> a,
                                                       LongPtr b, int count);

    @Generated
    @CFunction
    public static native boolean NGFloatArrayRefCompare(Ptr<FloatPtr> a,
                                                        FloatPtr b, int count);

    @Generated
    @CFunction
    public static native boolean NGDoubleArrayRefCompare(Ptr<DoublePtr> a,
                                                         DoublePtr b, int count);

    @Generated
    @CFunction
    public static native void NGBoolArrayRefFree(Ptr<BoolPtr> a);

    @Generated
    @CFunction
    public static native void NGByteArrayRefFree(Ptr<BytePtr> a);

    @Generated
    @CFunction
    public static native void NGShortArrayRefFree(Ptr<ShortPtr> a);

    @Generated
    @CFunction
    public static native void NGCharArrayRefFree(Ptr<CharPtr> a);

    @Generated
    @CFunction
    public static native void NGIntArrayRefFree(Ptr<IntPtr> a);

    @Generated
    @CFunction
    public static native void NGLongArrayRefFree(Ptr<LongPtr> a);

    @Generated
    @CFunction
    public static native void NGFloatArrayRefFree(Ptr<FloatPtr> a);

    @Generated
    @CFunction
    public static native void NGDoubleArrayRefFree(Ptr<DoublePtr> a);

    @Generated
    @CFunction
    @ByValue
    public static native NG_I_Struct NGIStructCreate(int x, int y);

    @Generated
    @CFunction
    public static native boolean NGIStructCompare(@ByValue NG_I_Struct value,
                                                  int x, int y);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native NG_I_Struct NGIStructCreatePtr(
            @ByValue NG_I_Struct value);

    @Generated
    @CFunction
    public static native boolean NGIStructRefCompare(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct value,
            int x, int y);

    @Generated
    @CFunction
    public static native void NGIStructRefFree(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct value);

    @Generated
    @CFunction
    @ByValue
    public static native NG_ISMulti_Struct NGISMultiStructCreate(int x, int y);

    @Generated
    @CFunction
    public static native int NGISMultiStructFind(
            @ByValue NG_ISMulti_Struct value, int x, int y);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native NG_ISMulti_Struct NGISMultiStructCreatePtr(int x, int y);

    @Generated
    @CFunction
    public static native void NGISMultiStructRefFree(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_ISMulti_Struct value);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_0(double arg0, double arg1,
                                                    double arg2, double arg3, double arg4, double arg5, double arg6,
                                                    double arg7, double arg8, double arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_1(double arg0, double arg1,
                                                    double arg2, double arg3, double arg4, double arg5, double arg6,
                                                    double arg7, double arg8, float arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_2(double arg0, double arg1,
                                                    double arg2, double arg3, double arg4, double arg5, double arg6,
                                                    double arg7, float arg8, double arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_3(double arg0, double arg1,
                                                    double arg2, double arg3, double arg4, double arg5, double arg6,
                                                    double arg7, float arg8, float arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_4(long arg0, long arg1,
                                                    long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                    long arg8, long arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_5(long arg0, long arg1,
                                                    long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                    long arg8, int arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_6(long arg0, long arg1,
                                                    long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                    int arg8, long arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_7(long arg0, long arg1,
                                                    long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                    int arg8, int arg9);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_8(long arg0, long arg1,
                                                    long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                    double arg8, double arg9, double arg10, double arg11, double arg12,
                                                    double arg13, double arg14, double arg15, long arg16, long arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_9(long arg0, long arg1,
                                                    long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                    double arg8, double arg9, double arg10, double arg11, double arg12,
                                                    double arg13, double arg14, double arg15, long arg16, int arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_10(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, long arg16, double arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_11(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, long arg16, float arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_12(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, double arg16, long arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_13(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, double arg16, int arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_14(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, double arg16, double arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_15(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, double arg16, float arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_16(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, float arg16, long arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_17(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, float arg16, int arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_18(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, float arg16, double arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_19(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, float arg16, float arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_20(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, int arg16, long arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_21(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, int arg16, int arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_22(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, int arg16, double arg17);

    @Generated
    @CFunction
    public static native boolean NGLongInvocation_23(long arg0, long arg1,
                                                     long arg2, long arg3, long arg4, long arg5, long arg6, long arg7,
                                                     double arg8, double arg9, double arg10, double arg11, double arg12,
                                                     double arg13, double arg14, double arg15, int arg16, float arg17);

    @Generated
    @CFunction
    public static native int NGInvocation_refs4885_0(int arg0, int arg1,
                                                     int arg2, int arg3, int arg4, VoidPtr arg5, int arg6);

    @Generated
    @CFunction
    public static native float NGInvocation_refs4885_1(int arg0, int arg1,
                                                       int arg2, int arg3, int arg4, int arg5, int arg6, VoidPtr arg7,
                                                       float arg8);

    @Generated
    @CFunction
    public static native boolean NGInvocation_ann_arg_0(byte a, @NUInt long b, byte c);

    @Generated
    @CFunction
    public static native boolean NGInvocation_ann_arg_1(byte a, @NUInt long b, byte c);

    @Generated
    @CFunction
    public static native boolean NGInvocation_ann_arg_2(byte a, @NLong long b, byte c);

    @Generated
    @CFunction
    public static native boolean NGInvocation_ann_arg_3(byte a, @NULong long b, byte c);

    @Generated
    @CFunction
    public static native boolean NGInvocation_ann_arg_4(byte a, @WCharT int b, byte c);

    @Generated
    @CFunction
    public static native @NInt long NGInvocation_ann_ret_0(@NInt long b);

    @Generated
    @CFunction
    public static native @NUInt long NGInvocation_ann_ret_1(@NUInt long b);

    @Generated
    @CFunction
    public static native @NLong long NGInvocation_ann_ret_2(@NLong long b);

    @Generated
    @CFunction
    public static native @NULong long NGInvocation_ann_ret_3(@NULong long b);

    @Generated
    @CFunction
    public static native @WCharT int NGInvocation_ann_ret_4(@WCharT int b);

    @Generated
    @CFunction
    public static native boolean NGInvocation_0(int arg0);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1(float arg0);

    @Generated
    @CFunction
    public static native boolean NGInvocation_2(long arg0);

    @Generated
    @CFunction
    public static native boolean NGInvocation_3(double arg0);

    @Generated
    @CFunction
    public static native boolean NGInvocation_4(int arg0, int arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_5(int arg0, float arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_6(int arg0, long arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_7(int arg0, double arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_8(float arg0, int arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_9(float arg0, float arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_10(float arg0, long arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_11(float arg0, double arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_12(long arg0, int arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_13(long arg0, float arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_14(long arg0, long arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_15(long arg0, double arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_16(double arg0, int arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_17(double arg0, float arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_18(double arg0, long arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_19(double arg0, double arg1);

    @Generated
    @CFunction
    public static native boolean NGInvocation_20(int arg0, int arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_21(int arg0, int arg1, float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_22(int arg0, int arg1, long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_23(int arg0, int arg1, double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_24(int arg0, float arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_25(int arg0, float arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_26(int arg0, float arg1, long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_27(int arg0, float arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_28(int arg0, long arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_29(int arg0, long arg1, float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_30(int arg0, long arg1, long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_31(int arg0, long arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_32(int arg0, double arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_33(int arg0, double arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_34(int arg0, double arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_35(int arg0, double arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_36(float arg0, int arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_37(float arg0, int arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_38(float arg0, int arg1, long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_39(float arg0, int arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_40(float arg0, float arg1,
                                                 int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_41(float arg0, float arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_42(float arg0, float arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_43(float arg0, float arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_44(float arg0, long arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_45(float arg0, long arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_46(float arg0, long arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_47(float arg0, long arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_48(float arg0, double arg1,
                                                 int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_49(float arg0, double arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_50(float arg0, double arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_51(float arg0, double arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_52(long arg0, int arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_53(long arg0, int arg1, float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_54(long arg0, int arg1, long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_55(long arg0, int arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_56(long arg0, float arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_57(long arg0, float arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_58(long arg0, float arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_59(long arg0, float arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_60(long arg0, long arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_61(long arg0, long arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_62(long arg0, long arg1, long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_63(long arg0, long arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_64(long arg0, double arg1,
                                                 int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_65(long arg0, double arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_66(long arg0, double arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_67(long arg0, double arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_68(double arg0, int arg1, int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_69(double arg0, int arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_70(double arg0, int arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_71(double arg0, int arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_72(double arg0, float arg1,
                                                 int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_73(double arg0, float arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_74(double arg0, float arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_75(double arg0, float arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_76(double arg0, long arg1,
                                                 int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_77(double arg0, long arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_78(double arg0, long arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_79(double arg0, long arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_80(double arg0, double arg1,
                                                 int arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_81(double arg0, double arg1,
                                                 float arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_82(double arg0, double arg1,
                                                 long arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_83(double arg0, double arg1,
                                                 double arg2);

    @Generated
    @CFunction
    public static native boolean NGInvocation_84(int arg0, int arg1, int arg2,
                                                 int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_85(int arg0, int arg1, int arg2,
                                                 float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_86(int arg0, int arg1, int arg2,
                                                 long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_87(int arg0, int arg1, int arg2,
                                                 double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_88(int arg0, int arg1,
                                                 float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_89(int arg0, int arg1,
                                                 float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_90(int arg0, int arg1,
                                                 float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_91(int arg0, int arg1,
                                                 float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_92(int arg0, int arg1, long arg2,
                                                 int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_93(int arg0, int arg1, long arg2,
                                                 float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_94(int arg0, int arg1, long arg2,
                                                 long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_95(int arg0, int arg1, long arg2,
                                                 double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_96(int arg0, int arg1,
                                                 double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_97(int arg0, int arg1,
                                                 double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_98(int arg0, int arg1,
                                                 double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_99(int arg0, int arg1,
                                                 double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_100(int arg0, float arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_101(int arg0, float arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_102(int arg0, float arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_103(int arg0, float arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_104(int arg0, float arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_105(int arg0, float arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_106(int arg0, float arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_107(int arg0, float arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_108(int arg0, float arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_109(int arg0, float arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_110(int arg0, float arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_111(int arg0, float arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_112(int arg0, float arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_113(int arg0, float arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_114(int arg0, float arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_115(int arg0, float arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_116(int arg0, long arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_117(int arg0, long arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_118(int arg0, long arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_119(int arg0, long arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_120(int arg0, long arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_121(int arg0, long arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_122(int arg0, long arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_123(int arg0, long arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_124(int arg0, long arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_125(int arg0, long arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_126(int arg0, long arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_127(int arg0, long arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_128(int arg0, long arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_129(int arg0, long arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_130(int arg0, long arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_131(int arg0, long arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_132(int arg0, double arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_133(int arg0, double arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_134(int arg0, double arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_135(int arg0, double arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_136(int arg0, double arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_137(int arg0, double arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_138(int arg0, double arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_139(int arg0, double arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_140(int arg0, double arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_141(int arg0, double arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_142(int arg0, double arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_143(int arg0, double arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_144(int arg0, double arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_145(int arg0, double arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_146(int arg0, double arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_147(int arg0, double arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_148(float arg0, int arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_149(float arg0, int arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_150(float arg0, int arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_151(float arg0, int arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_152(float arg0, int arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_153(float arg0, int arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_154(float arg0, int arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_155(float arg0, int arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_156(float arg0, int arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_157(float arg0, int arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_158(float arg0, int arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_159(float arg0, int arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_160(float arg0, int arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_161(float arg0, int arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_162(float arg0, int arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_163(float arg0, int arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_164(float arg0, float arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_165(float arg0, float arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_166(float arg0, float arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_167(float arg0, float arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_168(float arg0, float arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_169(float arg0, float arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_170(float arg0, float arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_171(float arg0, float arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_172(float arg0, float arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_173(float arg0, float arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_174(float arg0, float arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_175(float arg0, float arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_176(float arg0, float arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_177(float arg0, float arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_178(float arg0, float arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_179(float arg0, float arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_180(float arg0, long arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_181(float arg0, long arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_182(float arg0, long arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_183(float arg0, long arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_184(float arg0, long arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_185(float arg0, long arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_186(float arg0, long arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_187(float arg0, long arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_188(float arg0, long arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_189(float arg0, long arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_190(float arg0, long arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_191(float arg0, long arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_192(float arg0, long arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_193(float arg0, long arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_194(float arg0, long arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_195(float arg0, long arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_196(float arg0, double arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_197(float arg0, double arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_198(float arg0, double arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_199(float arg0, double arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_200(float arg0, double arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_201(float arg0, double arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_202(float arg0, double arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_203(float arg0, double arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_204(float arg0, double arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_205(float arg0, double arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_206(float arg0, double arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_207(float arg0, double arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_208(float arg0, double arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_209(float arg0, double arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_210(float arg0, double arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_211(float arg0, double arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_212(long arg0, int arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_213(long arg0, int arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_214(long arg0, int arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_215(long arg0, int arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_216(long arg0, int arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_217(long arg0, int arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_218(long arg0, int arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_219(long arg0, int arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_220(long arg0, int arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_221(long arg0, int arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_222(long arg0, int arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_223(long arg0, int arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_224(long arg0, int arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_225(long arg0, int arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_226(long arg0, int arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_227(long arg0, int arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_228(long arg0, float arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_229(long arg0, float arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_230(long arg0, float arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_231(long arg0, float arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_232(long arg0, float arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_233(long arg0, float arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_234(long arg0, float arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_235(long arg0, float arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_236(long arg0, float arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_237(long arg0, float arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_238(long arg0, float arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_239(long arg0, float arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_240(long arg0, float arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_241(long arg0, float arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_242(long arg0, float arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_243(long arg0, float arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_244(long arg0, long arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_245(long arg0, long arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_246(long arg0, long arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_247(long arg0, long arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_248(long arg0, long arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_249(long arg0, long arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_250(long arg0, long arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_251(long arg0, long arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_252(long arg0, long arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_253(long arg0, long arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_254(long arg0, long arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_255(long arg0, long arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_256(long arg0, long arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_257(long arg0, long arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_258(long arg0, long arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_259(long arg0, long arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_260(long arg0, double arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_261(long arg0, double arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_262(long arg0, double arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_263(long arg0, double arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_264(long arg0, double arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_265(long arg0, double arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_266(long arg0, double arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_267(long arg0, double arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_268(long arg0, double arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_269(long arg0, double arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_270(long arg0, double arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_271(long arg0, double arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_272(long arg0, double arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_273(long arg0, double arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_274(long arg0, double arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_275(long arg0, double arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_276(double arg0, int arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_277(double arg0, int arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_278(double arg0, int arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_279(double arg0, int arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_280(double arg0, int arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_281(double arg0, int arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_282(double arg0, int arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_283(double arg0, int arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_284(double arg0, int arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_285(double arg0, int arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_286(double arg0, int arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_287(double arg0, int arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_288(double arg0, int arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_289(double arg0, int arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_290(double arg0, int arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_291(double arg0, int arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_292(double arg0, float arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_293(double arg0, float arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_294(double arg0, float arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_295(double arg0, float arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_296(double arg0, float arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_297(double arg0, float arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_298(double arg0, float arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_299(double arg0, float arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_300(double arg0, float arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_301(double arg0, float arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_302(double arg0, float arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_303(double arg0, float arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_304(double arg0, float arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_305(double arg0, float arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_306(double arg0, float arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_307(double arg0, float arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_308(double arg0, long arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_309(double arg0, long arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_310(double arg0, long arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_311(double arg0, long arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_312(double arg0, long arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_313(double arg0, long arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_314(double arg0, long arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_315(double arg0, long arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_316(double arg0, long arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_317(double arg0, long arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_318(double arg0, long arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_319(double arg0, long arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_320(double arg0, long arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_321(double arg0, long arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_322(double arg0, long arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_323(double arg0, long arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_324(double arg0, double arg1,
                                                  int arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_325(double arg0, double arg1,
                                                  int arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_326(double arg0, double arg1,
                                                  int arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_327(double arg0, double arg1,
                                                  int arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_328(double arg0, double arg1,
                                                  float arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_329(double arg0, double arg1,
                                                  float arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_330(double arg0, double arg1,
                                                  float arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_331(double arg0, double arg1,
                                                  float arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_332(double arg0, double arg1,
                                                  long arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_333(double arg0, double arg1,
                                                  long arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_334(double arg0, double arg1,
                                                  long arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_335(double arg0, double arg1,
                                                  long arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_336(double arg0, double arg1,
                                                  double arg2, int arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_337(double arg0, double arg1,
                                                  double arg2, float arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_338(double arg0, double arg1,
                                                  double arg2, long arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_339(double arg0, double arg1,
                                                  double arg2, double arg3);

    @Generated
    @CFunction
    public static native boolean NGInvocation_340(int arg0, int arg1, int arg2,
                                                  int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_341(int arg0, int arg1, int arg2,
                                                  int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_342(int arg0, int arg1, int arg2,
                                                  int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_343(int arg0, int arg1, int arg2,
                                                  int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_344(int arg0, int arg1, int arg2,
                                                  float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_345(int arg0, int arg1, int arg2,
                                                  float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_346(int arg0, int arg1, int arg2,
                                                  float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_347(int arg0, int arg1, int arg2,
                                                  float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_348(int arg0, int arg1, int arg2,
                                                  long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_349(int arg0, int arg1, int arg2,
                                                  long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_350(int arg0, int arg1, int arg2,
                                                  long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_351(int arg0, int arg1, int arg2,
                                                  long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_352(int arg0, int arg1, int arg2,
                                                  double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_353(int arg0, int arg1, int arg2,
                                                  double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_354(int arg0, int arg1, int arg2,
                                                  double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_355(int arg0, int arg1, int arg2,
                                                  double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_356(int arg0, int arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_357(int arg0, int arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_358(int arg0, int arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_359(int arg0, int arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_360(int arg0, int arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_361(int arg0, int arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_362(int arg0, int arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_363(int arg0, int arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_364(int arg0, int arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_365(int arg0, int arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_366(int arg0, int arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_367(int arg0, int arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_368(int arg0, int arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_369(int arg0, int arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_370(int arg0, int arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_371(int arg0, int arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_372(int arg0, int arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_373(int arg0, int arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_374(int arg0, int arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_375(int arg0, int arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_376(int arg0, int arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_377(int arg0, int arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_378(int arg0, int arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_379(int arg0, int arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_380(int arg0, int arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_381(int arg0, int arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_382(int arg0, int arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_383(int arg0, int arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_384(int arg0, int arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_385(int arg0, int arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_386(int arg0, int arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_387(int arg0, int arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_388(int arg0, int arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_389(int arg0, int arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_390(int arg0, int arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_391(int arg0, int arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_392(int arg0, int arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_393(int arg0, int arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_394(int arg0, int arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_395(int arg0, int arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_396(int arg0, int arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_397(int arg0, int arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_398(int arg0, int arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_399(int arg0, int arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_400(int arg0, int arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_401(int arg0, int arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_402(int arg0, int arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_403(int arg0, int arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_404(int arg0, float arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_405(int arg0, float arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_406(int arg0, float arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_407(int arg0, float arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_408(int arg0, float arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_409(int arg0, float arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_410(int arg0, float arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_411(int arg0, float arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_412(int arg0, float arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_413(int arg0, float arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_414(int arg0, float arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_415(int arg0, float arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_416(int arg0, float arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_417(int arg0, float arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_418(int arg0, float arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_419(int arg0, float arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_420(int arg0, float arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_421(int arg0, float arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_422(int arg0, float arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_423(int arg0, float arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_424(int arg0, float arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_425(int arg0, float arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_426(int arg0, float arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_427(int arg0, float arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_428(int arg0, float arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_429(int arg0, float arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_430(int arg0, float arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_431(int arg0, float arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_432(int arg0, float arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_433(int arg0, float arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_434(int arg0, float arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_435(int arg0, float arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_436(int arg0, float arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_437(int arg0, float arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_438(int arg0, float arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_439(int arg0, float arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_440(int arg0, float arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_441(int arg0, float arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_442(int arg0, float arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_443(int arg0, float arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_444(int arg0, float arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_445(int arg0, float arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_446(int arg0, float arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_447(int arg0, float arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_448(int arg0, float arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_449(int arg0, float arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_450(int arg0, float arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_451(int arg0, float arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_452(int arg0, float arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_453(int arg0, float arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_454(int arg0, float arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_455(int arg0, float arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_456(int arg0, float arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_457(int arg0, float arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_458(int arg0, float arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_459(int arg0, float arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_460(int arg0, float arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_461(int arg0, float arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_462(int arg0, float arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_463(int arg0, float arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_464(int arg0, float arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_465(int arg0, float arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_466(int arg0, float arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_467(int arg0, float arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_468(int arg0, long arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_469(int arg0, long arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_470(int arg0, long arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_471(int arg0, long arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_472(int arg0, long arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_473(int arg0, long arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_474(int arg0, long arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_475(int arg0, long arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_476(int arg0, long arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_477(int arg0, long arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_478(int arg0, long arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_479(int arg0, long arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_480(int arg0, long arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_481(int arg0, long arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_482(int arg0, long arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_483(int arg0, long arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_484(int arg0, long arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_485(int arg0, long arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_486(int arg0, long arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_487(int arg0, long arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_488(int arg0, long arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_489(int arg0, long arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_490(int arg0, long arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_491(int arg0, long arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_492(int arg0, long arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_493(int arg0, long arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_494(int arg0, long arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_495(int arg0, long arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_496(int arg0, long arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_497(int arg0, long arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_498(int arg0, long arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_499(int arg0, long arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_500(int arg0, long arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_501(int arg0, long arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_502(int arg0, long arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_503(int arg0, long arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_504(int arg0, long arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_505(int arg0, long arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_506(int arg0, long arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_507(int arg0, long arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_508(int arg0, long arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_509(int arg0, long arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_510(int arg0, long arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_511(int arg0, long arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_512(int arg0, long arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_513(int arg0, long arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_514(int arg0, long arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_515(int arg0, long arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_516(int arg0, long arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_517(int arg0, long arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_518(int arg0, long arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_519(int arg0, long arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_520(int arg0, long arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_521(int arg0, long arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_522(int arg0, long arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_523(int arg0, long arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_524(int arg0, long arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_525(int arg0, long arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_526(int arg0, long arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_527(int arg0, long arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_528(int arg0, long arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_529(int arg0, long arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_530(int arg0, long arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_531(int arg0, long arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_532(int arg0, double arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_533(int arg0, double arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_534(int arg0, double arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_535(int arg0, double arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_536(int arg0, double arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_537(int arg0, double arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_538(int arg0, double arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_539(int arg0, double arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_540(int arg0, double arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_541(int arg0, double arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_542(int arg0, double arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_543(int arg0, double arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_544(int arg0, double arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_545(int arg0, double arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_546(int arg0, double arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_547(int arg0, double arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_548(int arg0, double arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_549(int arg0, double arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_550(int arg0, double arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_551(int arg0, double arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_552(int arg0, double arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_553(int arg0, double arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_554(int arg0, double arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_555(int arg0, double arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_556(int arg0, double arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_557(int arg0, double arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_558(int arg0, double arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_559(int arg0, double arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_560(int arg0, double arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_561(int arg0, double arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_562(int arg0, double arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_563(int arg0, double arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_564(int arg0, double arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_565(int arg0, double arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_566(int arg0, double arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_567(int arg0, double arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_568(int arg0, double arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_569(int arg0, double arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_570(int arg0, double arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_571(int arg0, double arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_572(int arg0, double arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_573(int arg0, double arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_574(int arg0, double arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_575(int arg0, double arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_576(int arg0, double arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_577(int arg0, double arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_578(int arg0, double arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_579(int arg0, double arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_580(int arg0, double arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_581(int arg0, double arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_582(int arg0, double arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_583(int arg0, double arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_584(int arg0, double arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_585(int arg0, double arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_586(int arg0, double arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_587(int arg0, double arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_588(int arg0, double arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_589(int arg0, double arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_590(int arg0, double arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_591(int arg0, double arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_592(int arg0, double arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_593(int arg0, double arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_594(int arg0, double arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_595(int arg0, double arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_596(float arg0, int arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_597(float arg0, int arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_598(float arg0, int arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_599(float arg0, int arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_600(float arg0, int arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_601(float arg0, int arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_602(float arg0, int arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_603(float arg0, int arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_604(float arg0, int arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_605(float arg0, int arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_606(float arg0, int arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_607(float arg0, int arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_608(float arg0, int arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_609(float arg0, int arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_610(float arg0, int arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_611(float arg0, int arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_612(float arg0, int arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_613(float arg0, int arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_614(float arg0, int arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_615(float arg0, int arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_616(float arg0, int arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_617(float arg0, int arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_618(float arg0, int arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_619(float arg0, int arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_620(float arg0, int arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_621(float arg0, int arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_622(float arg0, int arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_623(float arg0, int arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_624(float arg0, int arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_625(float arg0, int arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_626(float arg0, int arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_627(float arg0, int arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_628(float arg0, int arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_629(float arg0, int arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_630(float arg0, int arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_631(float arg0, int arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_632(float arg0, int arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_633(float arg0, int arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_634(float arg0, int arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_635(float arg0, int arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_636(float arg0, int arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_637(float arg0, int arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_638(float arg0, int arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_639(float arg0, int arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_640(float arg0, int arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_641(float arg0, int arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_642(float arg0, int arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_643(float arg0, int arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_644(float arg0, int arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_645(float arg0, int arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_646(float arg0, int arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_647(float arg0, int arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_648(float arg0, int arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_649(float arg0, int arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_650(float arg0, int arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_651(float arg0, int arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_652(float arg0, int arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_653(float arg0, int arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_654(float arg0, int arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_655(float arg0, int arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_656(float arg0, int arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_657(float arg0, int arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_658(float arg0, int arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_659(float arg0, int arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_660(float arg0, float arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_661(float arg0, float arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_662(float arg0, float arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_663(float arg0, float arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_664(float arg0, float arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_665(float arg0, float arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_666(float arg0, float arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_667(float arg0, float arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_668(float arg0, float arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_669(float arg0, float arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_670(float arg0, float arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_671(float arg0, float arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_672(float arg0, float arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_673(float arg0, float arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_674(float arg0, float arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_675(float arg0, float arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_676(float arg0, float arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_677(float arg0, float arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_678(float arg0, float arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_679(float arg0, float arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_680(float arg0, float arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_681(float arg0, float arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_682(float arg0, float arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_683(float arg0, float arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_684(float arg0, float arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_685(float arg0, float arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_686(float arg0, float arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_687(float arg0, float arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_688(float arg0, float arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_689(float arg0, float arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_690(float arg0, float arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_691(float arg0, float arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_692(float arg0, float arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_693(float arg0, float arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_694(float arg0, float arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_695(float arg0, float arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_696(float arg0, float arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_697(float arg0, float arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_698(float arg0, float arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_699(float arg0, float arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_700(float arg0, float arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_701(float arg0, float arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_702(float arg0, float arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_703(float arg0, float arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_704(float arg0, float arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_705(float arg0, float arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_706(float arg0, float arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_707(float arg0, float arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_708(float arg0, float arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_709(float arg0, float arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_710(float arg0, float arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_711(float arg0, float arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_712(float arg0, float arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_713(float arg0, float arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_714(float arg0, float arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_715(float arg0, float arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_716(float arg0, float arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_717(float arg0, float arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_718(float arg0, float arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_719(float arg0, float arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_720(float arg0, float arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_721(float arg0, float arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_722(float arg0, float arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_723(float arg0, float arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_724(float arg0, long arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_725(float arg0, long arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_726(float arg0, long arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_727(float arg0, long arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_728(float arg0, long arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_729(float arg0, long arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_730(float arg0, long arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_731(float arg0, long arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_732(float arg0, long arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_733(float arg0, long arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_734(float arg0, long arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_735(float arg0, long arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_736(float arg0, long arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_737(float arg0, long arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_738(float arg0, long arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_739(float arg0, long arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_740(float arg0, long arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_741(float arg0, long arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_742(float arg0, long arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_743(float arg0, long arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_744(float arg0, long arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_745(float arg0, long arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_746(float arg0, long arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_747(float arg0, long arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_748(float arg0, long arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_749(float arg0, long arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_750(float arg0, long arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_751(float arg0, long arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_752(float arg0, long arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_753(float arg0, long arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_754(float arg0, long arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_755(float arg0, long arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_756(float arg0, long arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_757(float arg0, long arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_758(float arg0, long arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_759(float arg0, long arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_760(float arg0, long arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_761(float arg0, long arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_762(float arg0, long arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_763(float arg0, long arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_764(float arg0, long arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_765(float arg0, long arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_766(float arg0, long arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_767(float arg0, long arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_768(float arg0, long arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_769(float arg0, long arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_770(float arg0, long arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_771(float arg0, long arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_772(float arg0, long arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_773(float arg0, long arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_774(float arg0, long arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_775(float arg0, long arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_776(float arg0, long arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_777(float arg0, long arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_778(float arg0, long arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_779(float arg0, long arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_780(float arg0, long arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_781(float arg0, long arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_782(float arg0, long arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_783(float arg0, long arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_784(float arg0, long arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_785(float arg0, long arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_786(float arg0, long arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_787(float arg0, long arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_788(float arg0, double arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_789(float arg0, double arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_790(float arg0, double arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_791(float arg0, double arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_792(float arg0, double arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_793(float arg0, double arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_794(float arg0, double arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_795(float arg0, double arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_796(float arg0, double arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_797(float arg0, double arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_798(float arg0, double arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_799(float arg0, double arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_800(float arg0, double arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_801(float arg0, double arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_802(float arg0, double arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_803(float arg0, double arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_804(float arg0, double arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_805(float arg0, double arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_806(float arg0, double arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_807(float arg0, double arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_808(float arg0, double arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_809(float arg0, double arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_810(float arg0, double arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_811(float arg0, double arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_812(float arg0, double arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_813(float arg0, double arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_814(float arg0, double arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_815(float arg0, double arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_816(float arg0, double arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_817(float arg0, double arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_818(float arg0, double arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_819(float arg0, double arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_820(float arg0, double arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_821(float arg0, double arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_822(float arg0, double arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_823(float arg0, double arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_824(float arg0, double arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_825(float arg0, double arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_826(float arg0, double arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_827(float arg0, double arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_828(float arg0, double arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_829(float arg0, double arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_830(float arg0, double arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_831(float arg0, double arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_832(float arg0, double arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_833(float arg0, double arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_834(float arg0, double arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_835(float arg0, double arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_836(float arg0, double arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_837(float arg0, double arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_838(float arg0, double arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_839(float arg0, double arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_840(float arg0, double arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_841(float arg0, double arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_842(float arg0, double arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_843(float arg0, double arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_844(float arg0, double arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_845(float arg0, double arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_846(float arg0, double arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_847(float arg0, double arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_848(float arg0, double arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_849(float arg0, double arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_850(float arg0, double arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_851(float arg0, double arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_852(long arg0, int arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_853(long arg0, int arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_854(long arg0, int arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_855(long arg0, int arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_856(long arg0, int arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_857(long arg0, int arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_858(long arg0, int arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_859(long arg0, int arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_860(long arg0, int arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_861(long arg0, int arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_862(long arg0, int arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_863(long arg0, int arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_864(long arg0, int arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_865(long arg0, int arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_866(long arg0, int arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_867(long arg0, int arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_868(long arg0, int arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_869(long arg0, int arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_870(long arg0, int arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_871(long arg0, int arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_872(long arg0, int arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_873(long arg0, int arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_874(long arg0, int arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_875(long arg0, int arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_876(long arg0, int arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_877(long arg0, int arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_878(long arg0, int arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_879(long arg0, int arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_880(long arg0, int arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_881(long arg0, int arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_882(long arg0, int arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_883(long arg0, int arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_884(long arg0, int arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_885(long arg0, int arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_886(long arg0, int arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_887(long arg0, int arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_888(long arg0, int arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_889(long arg0, int arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_890(long arg0, int arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_891(long arg0, int arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_892(long arg0, int arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_893(long arg0, int arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_894(long arg0, int arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_895(long arg0, int arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_896(long arg0, int arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_897(long arg0, int arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_898(long arg0, int arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_899(long arg0, int arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_900(long arg0, int arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_901(long arg0, int arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_902(long arg0, int arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_903(long arg0, int arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_904(long arg0, int arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_905(long arg0, int arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_906(long arg0, int arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_907(long arg0, int arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_908(long arg0, int arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_909(long arg0, int arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_910(long arg0, int arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_911(long arg0, int arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_912(long arg0, int arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_913(long arg0, int arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_914(long arg0, int arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_915(long arg0, int arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_916(long arg0, float arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_917(long arg0, float arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_918(long arg0, float arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_919(long arg0, float arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_920(long arg0, float arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_921(long arg0, float arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_922(long arg0, float arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_923(long arg0, float arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_924(long arg0, float arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_925(long arg0, float arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_926(long arg0, float arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_927(long arg0, float arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_928(long arg0, float arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_929(long arg0, float arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_930(long arg0, float arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_931(long arg0, float arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_932(long arg0, float arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_933(long arg0, float arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_934(long arg0, float arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_935(long arg0, float arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_936(long arg0, float arg1,
                                                  float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_937(long arg0, float arg1,
                                                  float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_938(long arg0, float arg1,
                                                  float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_939(long arg0, float arg1,
                                                  float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_940(long arg0, float arg1,
                                                  float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_941(long arg0, float arg1,
                                                  float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_942(long arg0, float arg1,
                                                  float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_943(long arg0, float arg1,
                                                  float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_944(long arg0, float arg1,
                                                  float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_945(long arg0, float arg1,
                                                  float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_946(long arg0, float arg1,
                                                  float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_947(long arg0, float arg1,
                                                  float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_948(long arg0, float arg1,
                                                  long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_949(long arg0, float arg1,
                                                  long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_950(long arg0, float arg1,
                                                  long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_951(long arg0, float arg1,
                                                  long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_952(long arg0, float arg1,
                                                  long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_953(long arg0, float arg1,
                                                  long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_954(long arg0, float arg1,
                                                  long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_955(long arg0, float arg1,
                                                  long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_956(long arg0, float arg1,
                                                  long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_957(long arg0, float arg1,
                                                  long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_958(long arg0, float arg1,
                                                  long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_959(long arg0, float arg1,
                                                  long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_960(long arg0, float arg1,
                                                  long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_961(long arg0, float arg1,
                                                  long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_962(long arg0, float arg1,
                                                  long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_963(long arg0, float arg1,
                                                  long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_964(long arg0, float arg1,
                                                  double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_965(long arg0, float arg1,
                                                  double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_966(long arg0, float arg1,
                                                  double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_967(long arg0, float arg1,
                                                  double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_968(long arg0, float arg1,
                                                  double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_969(long arg0, float arg1,
                                                  double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_970(long arg0, float arg1,
                                                  double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_971(long arg0, float arg1,
                                                  double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_972(long arg0, float arg1,
                                                  double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_973(long arg0, float arg1,
                                                  double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_974(long arg0, float arg1,
                                                  double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_975(long arg0, float arg1,
                                                  double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_976(long arg0, float arg1,
                                                  double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_977(long arg0, float arg1,
                                                  double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_978(long arg0, float arg1,
                                                  double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_979(long arg0, float arg1,
                                                  double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_980(long arg0, long arg1,
                                                  int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_981(long arg0, long arg1,
                                                  int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_982(long arg0, long arg1,
                                                  int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_983(long arg0, long arg1,
                                                  int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_984(long arg0, long arg1,
                                                  int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_985(long arg0, long arg1,
                                                  int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_986(long arg0, long arg1,
                                                  int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_987(long arg0, long arg1,
                                                  int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_988(long arg0, long arg1,
                                                  int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_989(long arg0, long arg1,
                                                  int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_990(long arg0, long arg1,
                                                  int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_991(long arg0, long arg1,
                                                  int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_992(long arg0, long arg1,
                                                  int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_993(long arg0, long arg1,
                                                  int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_994(long arg0, long arg1,
                                                  int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_995(long arg0, long arg1,
                                                  int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_996(long arg0, long arg1,
                                                  float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_997(long arg0, long arg1,
                                                  float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_998(long arg0, long arg1,
                                                  float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_999(long arg0, long arg1,
                                                  float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1000(long arg0, long arg1,
                                                   float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1001(long arg0, long arg1,
                                                   float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1002(long arg0, long arg1,
                                                   float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1003(long arg0, long arg1,
                                                   float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1004(long arg0, long arg1,
                                                   float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1005(long arg0, long arg1,
                                                   float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1006(long arg0, long arg1,
                                                   float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1007(long arg0, long arg1,
                                                   float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1008(long arg0, long arg1,
                                                   float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1009(long arg0, long arg1,
                                                   float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1010(long arg0, long arg1,
                                                   float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1011(long arg0, long arg1,
                                                   float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1012(long arg0, long arg1,
                                                   long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1013(long arg0, long arg1,
                                                   long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1014(long arg0, long arg1,
                                                   long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1015(long arg0, long arg1,
                                                   long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1016(long arg0, long arg1,
                                                   long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1017(long arg0, long arg1,
                                                   long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1018(long arg0, long arg1,
                                                   long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1019(long arg0, long arg1,
                                                   long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1020(long arg0, long arg1,
                                                   long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1021(long arg0, long arg1,
                                                   long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1022(long arg0, long arg1,
                                                   long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1023(long arg0, long arg1,
                                                   long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1024(long arg0, long arg1,
                                                   long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1025(long arg0, long arg1,
                                                   long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1026(long arg0, long arg1,
                                                   long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1027(long arg0, long arg1,
                                                   long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1028(long arg0, long arg1,
                                                   double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1029(long arg0, long arg1,
                                                   double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1030(long arg0, long arg1,
                                                   double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1031(long arg0, long arg1,
                                                   double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1032(long arg0, long arg1,
                                                   double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1033(long arg0, long arg1,
                                                   double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1034(long arg0, long arg1,
                                                   double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1035(long arg0, long arg1,
                                                   double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1036(long arg0, long arg1,
                                                   double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1037(long arg0, long arg1,
                                                   double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1038(long arg0, long arg1,
                                                   double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1039(long arg0, long arg1,
                                                   double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1040(long arg0, long arg1,
                                                   double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1041(long arg0, long arg1,
                                                   double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1042(long arg0, long arg1,
                                                   double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1043(long arg0, long arg1,
                                                   double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1044(long arg0, double arg1,
                                                   int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1045(long arg0, double arg1,
                                                   int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1046(long arg0, double arg1,
                                                   int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1047(long arg0, double arg1,
                                                   int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1048(long arg0, double arg1,
                                                   int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1049(long arg0, double arg1,
                                                   int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1050(long arg0, double arg1,
                                                   int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1051(long arg0, double arg1,
                                                   int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1052(long arg0, double arg1,
                                                   int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1053(long arg0, double arg1,
                                                   int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1054(long arg0, double arg1,
                                                   int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1055(long arg0, double arg1,
                                                   int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1056(long arg0, double arg1,
                                                   int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1057(long arg0, double arg1,
                                                   int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1058(long arg0, double arg1,
                                                   int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1059(long arg0, double arg1,
                                                   int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1060(long arg0, double arg1,
                                                   float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1061(long arg0, double arg1,
                                                   float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1062(long arg0, double arg1,
                                                   float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1063(long arg0, double arg1,
                                                   float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1064(long arg0, double arg1,
                                                   float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1065(long arg0, double arg1,
                                                   float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1066(long arg0, double arg1,
                                                   float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1067(long arg0, double arg1,
                                                   float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1068(long arg0, double arg1,
                                                   float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1069(long arg0, double arg1,
                                                   float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1070(long arg0, double arg1,
                                                   float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1071(long arg0, double arg1,
                                                   float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1072(long arg0, double arg1,
                                                   float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1073(long arg0, double arg1,
                                                   float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1074(long arg0, double arg1,
                                                   float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1075(long arg0, double arg1,
                                                   float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1076(long arg0, double arg1,
                                                   long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1077(long arg0, double arg1,
                                                   long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1078(long arg0, double arg1,
                                                   long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1079(long arg0, double arg1,
                                                   long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1080(long arg0, double arg1,
                                                   long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1081(long arg0, double arg1,
                                                   long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1082(long arg0, double arg1,
                                                   long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1083(long arg0, double arg1,
                                                   long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1084(long arg0, double arg1,
                                                   long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1085(long arg0, double arg1,
                                                   long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1086(long arg0, double arg1,
                                                   long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1087(long arg0, double arg1,
                                                   long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1088(long arg0, double arg1,
                                                   long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1089(long arg0, double arg1,
                                                   long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1090(long arg0, double arg1,
                                                   long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1091(long arg0, double arg1,
                                                   long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1092(long arg0, double arg1,
                                                   double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1093(long arg0, double arg1,
                                                   double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1094(long arg0, double arg1,
                                                   double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1095(long arg0, double arg1,
                                                   double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1096(long arg0, double arg1,
                                                   double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1097(long arg0, double arg1,
                                                   double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1098(long arg0, double arg1,
                                                   double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1099(long arg0, double arg1,
                                                   double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1100(long arg0, double arg1,
                                                   double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1101(long arg0, double arg1,
                                                   double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1102(long arg0, double arg1,
                                                   double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1103(long arg0, double arg1,
                                                   double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1104(long arg0, double arg1,
                                                   double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1105(long arg0, double arg1,
                                                   double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1106(long arg0, double arg1,
                                                   double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1107(long arg0, double arg1,
                                                   double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1108(double arg0, int arg1,
                                                   int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1109(double arg0, int arg1,
                                                   int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1110(double arg0, int arg1,
                                                   int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1111(double arg0, int arg1,
                                                   int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1112(double arg0, int arg1,
                                                   int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1113(double arg0, int arg1,
                                                   int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1114(double arg0, int arg1,
                                                   int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1115(double arg0, int arg1,
                                                   int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1116(double arg0, int arg1,
                                                   int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1117(double arg0, int arg1,
                                                   int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1118(double arg0, int arg1,
                                                   int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1119(double arg0, int arg1,
                                                   int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1120(double arg0, int arg1,
                                                   int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1121(double arg0, int arg1,
                                                   int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1122(double arg0, int arg1,
                                                   int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1123(double arg0, int arg1,
                                                   int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1124(double arg0, int arg1,
                                                   float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1125(double arg0, int arg1,
                                                   float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1126(double arg0, int arg1,
                                                   float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1127(double arg0, int arg1,
                                                   float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1128(double arg0, int arg1,
                                                   float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1129(double arg0, int arg1,
                                                   float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1130(double arg0, int arg1,
                                                   float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1131(double arg0, int arg1,
                                                   float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1132(double arg0, int arg1,
                                                   float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1133(double arg0, int arg1,
                                                   float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1134(double arg0, int arg1,
                                                   float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1135(double arg0, int arg1,
                                                   float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1136(double arg0, int arg1,
                                                   float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1137(double arg0, int arg1,
                                                   float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1138(double arg0, int arg1,
                                                   float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1139(double arg0, int arg1,
                                                   float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1140(double arg0, int arg1,
                                                   long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1141(double arg0, int arg1,
                                                   long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1142(double arg0, int arg1,
                                                   long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1143(double arg0, int arg1,
                                                   long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1144(double arg0, int arg1,
                                                   long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1145(double arg0, int arg1,
                                                   long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1146(double arg0, int arg1,
                                                   long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1147(double arg0, int arg1,
                                                   long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1148(double arg0, int arg1,
                                                   long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1149(double arg0, int arg1,
                                                   long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1150(double arg0, int arg1,
                                                   long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1151(double arg0, int arg1,
                                                   long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1152(double arg0, int arg1,
                                                   long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1153(double arg0, int arg1,
                                                   long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1154(double arg0, int arg1,
                                                   long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1155(double arg0, int arg1,
                                                   long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1156(double arg0, int arg1,
                                                   double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1157(double arg0, int arg1,
                                                   double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1158(double arg0, int arg1,
                                                   double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1159(double arg0, int arg1,
                                                   double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1160(double arg0, int arg1,
                                                   double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1161(double arg0, int arg1,
                                                   double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1162(double arg0, int arg1,
                                                   double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1163(double arg0, int arg1,
                                                   double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1164(double arg0, int arg1,
                                                   double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1165(double arg0, int arg1,
                                                   double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1166(double arg0, int arg1,
                                                   double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1167(double arg0, int arg1,
                                                   double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1168(double arg0, int arg1,
                                                   double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1169(double arg0, int arg1,
                                                   double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1170(double arg0, int arg1,
                                                   double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1171(double arg0, int arg1,
                                                   double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1172(double arg0, float arg1,
                                                   int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1173(double arg0, float arg1,
                                                   int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1174(double arg0, float arg1,
                                                   int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1175(double arg0, float arg1,
                                                   int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1176(double arg0, float arg1,
                                                   int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1177(double arg0, float arg1,
                                                   int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1178(double arg0, float arg1,
                                                   int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1179(double arg0, float arg1,
                                                   int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1180(double arg0, float arg1,
                                                   int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1181(double arg0, float arg1,
                                                   int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1182(double arg0, float arg1,
                                                   int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1183(double arg0, float arg1,
                                                   int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1184(double arg0, float arg1,
                                                   int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1185(double arg0, float arg1,
                                                   int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1186(double arg0, float arg1,
                                                   int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1187(double arg0, float arg1,
                                                   int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1188(double arg0, float arg1,
                                                   float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1189(double arg0, float arg1,
                                                   float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1190(double arg0, float arg1,
                                                   float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1191(double arg0, float arg1,
                                                   float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1192(double arg0, float arg1,
                                                   float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1193(double arg0, float arg1,
                                                   float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1194(double arg0, float arg1,
                                                   float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1195(double arg0, float arg1,
                                                   float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1196(double arg0, float arg1,
                                                   float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1197(double arg0, float arg1,
                                                   float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1198(double arg0, float arg1,
                                                   float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1199(double arg0, float arg1,
                                                   float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1200(double arg0, float arg1,
                                                   float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1201(double arg0, float arg1,
                                                   float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1202(double arg0, float arg1,
                                                   float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1203(double arg0, float arg1,
                                                   float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1204(double arg0, float arg1,
                                                   long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1205(double arg0, float arg1,
                                                   long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1206(double arg0, float arg1,
                                                   long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1207(double arg0, float arg1,
                                                   long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1208(double arg0, float arg1,
                                                   long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1209(double arg0, float arg1,
                                                   long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1210(double arg0, float arg1,
                                                   long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1211(double arg0, float arg1,
                                                   long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1212(double arg0, float arg1,
                                                   long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1213(double arg0, float arg1,
                                                   long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1214(double arg0, float arg1,
                                                   long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1215(double arg0, float arg1,
                                                   long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1216(double arg0, float arg1,
                                                   long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1217(double arg0, float arg1,
                                                   long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1218(double arg0, float arg1,
                                                   long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1219(double arg0, float arg1,
                                                   long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1220(double arg0, float arg1,
                                                   double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1221(double arg0, float arg1,
                                                   double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1222(double arg0, float arg1,
                                                   double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1223(double arg0, float arg1,
                                                   double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1224(double arg0, float arg1,
                                                   double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1225(double arg0, float arg1,
                                                   double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1226(double arg0, float arg1,
                                                   double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1227(double arg0, float arg1,
                                                   double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1228(double arg0, float arg1,
                                                   double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1229(double arg0, float arg1,
                                                   double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1230(double arg0, float arg1,
                                                   double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1231(double arg0, float arg1,
                                                   double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1232(double arg0, float arg1,
                                                   double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1233(double arg0, float arg1,
                                                   double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1234(double arg0, float arg1,
                                                   double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1235(double arg0, float arg1,
                                                   double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1236(double arg0, long arg1,
                                                   int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1237(double arg0, long arg1,
                                                   int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1238(double arg0, long arg1,
                                                   int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1239(double arg0, long arg1,
                                                   int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1240(double arg0, long arg1,
                                                   int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1241(double arg0, long arg1,
                                                   int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1242(double arg0, long arg1,
                                                   int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1243(double arg0, long arg1,
                                                   int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1244(double arg0, long arg1,
                                                   int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1245(double arg0, long arg1,
                                                   int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1246(double arg0, long arg1,
                                                   int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1247(double arg0, long arg1,
                                                   int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1248(double arg0, long arg1,
                                                   int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1249(double arg0, long arg1,
                                                   int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1250(double arg0, long arg1,
                                                   int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1251(double arg0, long arg1,
                                                   int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1252(double arg0, long arg1,
                                                   float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1253(double arg0, long arg1,
                                                   float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1254(double arg0, long arg1,
                                                   float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1255(double arg0, long arg1,
                                                   float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1256(double arg0, long arg1,
                                                   float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1257(double arg0, long arg1,
                                                   float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1258(double arg0, long arg1,
                                                   float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1259(double arg0, long arg1,
                                                   float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1260(double arg0, long arg1,
                                                   float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1261(double arg0, long arg1,
                                                   float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1262(double arg0, long arg1,
                                                   float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1263(double arg0, long arg1,
                                                   float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1264(double arg0, long arg1,
                                                   float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1265(double arg0, long arg1,
                                                   float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1266(double arg0, long arg1,
                                                   float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1267(double arg0, long arg1,
                                                   float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1268(double arg0, long arg1,
                                                   long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1269(double arg0, long arg1,
                                                   long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1270(double arg0, long arg1,
                                                   long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1271(double arg0, long arg1,
                                                   long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1272(double arg0, long arg1,
                                                   long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1273(double arg0, long arg1,
                                                   long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1274(double arg0, long arg1,
                                                   long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1275(double arg0, long arg1,
                                                   long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1276(double arg0, long arg1,
                                                   long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1277(double arg0, long arg1,
                                                   long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1278(double arg0, long arg1,
                                                   long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1279(double arg0, long arg1,
                                                   long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1280(double arg0, long arg1,
                                                   long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1281(double arg0, long arg1,
                                                   long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1282(double arg0, long arg1,
                                                   long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1283(double arg0, long arg1,
                                                   long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1284(double arg0, long arg1,
                                                   double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1285(double arg0, long arg1,
                                                   double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1286(double arg0, long arg1,
                                                   double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1287(double arg0, long arg1,
                                                   double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1288(double arg0, long arg1,
                                                   double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1289(double arg0, long arg1,
                                                   double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1290(double arg0, long arg1,
                                                   double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1291(double arg0, long arg1,
                                                   double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1292(double arg0, long arg1,
                                                   double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1293(double arg0, long arg1,
                                                   double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1294(double arg0, long arg1,
                                                   double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1295(double arg0, long arg1,
                                                   double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1296(double arg0, long arg1,
                                                   double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1297(double arg0, long arg1,
                                                   double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1298(double arg0, long arg1,
                                                   double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1299(double arg0, long arg1,
                                                   double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1300(double arg0, double arg1,
                                                   int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1301(double arg0, double arg1,
                                                   int arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1302(double arg0, double arg1,
                                                   int arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1303(double arg0, double arg1,
                                                   int arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1304(double arg0, double arg1,
                                                   int arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1305(double arg0, double arg1,
                                                   int arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1306(double arg0, double arg1,
                                                   int arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1307(double arg0, double arg1,
                                                   int arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1308(double arg0, double arg1,
                                                   int arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1309(double arg0, double arg1,
                                                   int arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1310(double arg0, double arg1,
                                                   int arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1311(double arg0, double arg1,
                                                   int arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1312(double arg0, double arg1,
                                                   int arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1313(double arg0, double arg1,
                                                   int arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1314(double arg0, double arg1,
                                                   int arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1315(double arg0, double arg1,
                                                   int arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1316(double arg0, double arg1,
                                                   float arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1317(double arg0, double arg1,
                                                   float arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1318(double arg0, double arg1,
                                                   float arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1319(double arg0, double arg1,
                                                   float arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1320(double arg0, double arg1,
                                                   float arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1321(double arg0, double arg1,
                                                   float arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1322(double arg0, double arg1,
                                                   float arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1323(double arg0, double arg1,
                                                   float arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1324(double arg0, double arg1,
                                                   float arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1325(double arg0, double arg1,
                                                   float arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1326(double arg0, double arg1,
                                                   float arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1327(double arg0, double arg1,
                                                   float arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1328(double arg0, double arg1,
                                                   float arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1329(double arg0, double arg1,
                                                   float arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1330(double arg0, double arg1,
                                                   float arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1331(double arg0, double arg1,
                                                   float arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1332(double arg0, double arg1,
                                                   long arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1333(double arg0, double arg1,
                                                   long arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1334(double arg0, double arg1,
                                                   long arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1335(double arg0, double arg1,
                                                   long arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1336(double arg0, double arg1,
                                                   long arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1337(double arg0, double arg1,
                                                   long arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1338(double arg0, double arg1,
                                                   long arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1339(double arg0, double arg1,
                                                   long arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1340(double arg0, double arg1,
                                                   long arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1341(double arg0, double arg1,
                                                   long arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1342(double arg0, double arg1,
                                                   long arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1343(double arg0, double arg1,
                                                   long arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1344(double arg0, double arg1,
                                                   long arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1345(double arg0, double arg1,
                                                   long arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1346(double arg0, double arg1,
                                                   long arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1347(double arg0, double arg1,
                                                   long arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1348(double arg0, double arg1,
                                                   double arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1349(double arg0, double arg1,
                                                   double arg2, int arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1350(double arg0, double arg1,
                                                   double arg2, int arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1351(double arg0, double arg1,
                                                   double arg2, int arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1352(double arg0, double arg1,
                                                   double arg2, float arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1353(double arg0, double arg1,
                                                   double arg2, float arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1354(double arg0, double arg1,
                                                   double arg2, float arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1355(double arg0, double arg1,
                                                   double arg2, float arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1356(double arg0, double arg1,
                                                   double arg2, long arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1357(double arg0, double arg1,
                                                   double arg2, long arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1358(double arg0, double arg1,
                                                   double arg2, long arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1359(double arg0, double arg1,
                                                   double arg2, long arg3, double arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1360(double arg0, double arg1,
                                                   double arg2, double arg3, int arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1361(double arg0, double arg1,
                                                   double arg2, double arg3, float arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1362(double arg0, double arg1,
                                                   double arg2, double arg3, long arg4);

    @Generated
    @CFunction
    public static native boolean NGInvocation_1363(double arg0, double arg1,
                                                   double arg2, double arg3, double arg4);

    @Generated
    @CFunction
    public static native void NGPrepareVariablesWithPrimitivesTest();

    @Generated
    @CVariable()
    public static native boolean kNGBoolDefault();

    @Generated
    @CVariable()
    public static native byte kNGByteDefault();

    @Generated
    @CVariable()
    public static native short kNGShortDefault();

    @Generated
    @CVariable()
    public static native char kNGCharDefault();

    @Generated
    @CVariable()
    public static native int kNGIntDefault();

    @Generated
    @CVariable()
    public static native long kNGLongDefault();

    @Generated
    @CVariable()
    public static native float kNGFloatDefault();

    @Generated
    @CVariable()
    public static native double kNGDoubleDefault();

    @Generated
    @CVariable()
    public static native boolean kNGBoolUnit();

    @Generated
    @CVariable()
    public static native byte kNGByteUnit();

    @Generated
    @CVariable()
    public static native short kNGShortUnit();

    @Generated
    @CVariable()
    public static native char kNGCharUnit();

    @Generated
    @CVariable()
    public static native int kNGIntUnit();

    @Generated
    @CVariable()
    public static native long kNGLongUnit();

    @Generated
    @CVariable()
    public static native float kNGFloatUnit();

    @Generated
    @CVariable()
    public static native double kNGDoubleUnit();

    @Generated
    @CVariable()
    public static native boolean kNGBoolValueA();

    @Generated
    @CVariable()
    public static native byte kNGByteValueA();

    @Generated
    @CVariable()
    public static native short kNGShortValueA();

    @Generated
    @CVariable()
    public static native char kNGCharValueA();

    @Generated
    @CVariable()
    public static native int kNGIntValueA();

    @Generated
    @CVariable()
    public static native long kNGLongValueA();

    @Generated
    @CVariable()
    public static native float kNGFloatValueA();

    @Generated
    @CVariable()
    public static native double kNGDoubleValueA();

    @Generated
    @CVariable()
    public static native boolean kNGBoolValueB();

    @Generated
    @CVariable()
    public static native byte kNGByteValueB();

    @Generated
    @CVariable()
    public static native short kNGShortValueB();

    @Generated
    @CVariable()
    public static native char kNGCharValueB();

    @Generated
    @CVariable()
    public static native int kNGIntValueB();

    @Generated
    @CVariable()
    public static native long kNGLongValueB();

    @Generated
    @CVariable()
    public static native float kNGFloatValueB();

    @Generated
    @CVariable()
    public static native double kNGDoubleValueB();

    @Generated
    @CVariable()
    public static native boolean kNGBoolValueC();

    @Generated
    @CVariable()
    public static native byte kNGByteValueC();

    @Generated
    @CVariable()
    public static native short kNGShortValueC();

    @Generated
    @CVariable()
    public static native char kNGCharValueC();

    @Generated
    @CVariable()
    public static native int kNGIntValueC();

    @Generated
    @CVariable()
    public static native long kNGLongValueC();

    @Generated
    @CVariable()
    public static native float kNGFloatValueC();

    @Generated
    @CVariable()
    public static native double kNGDoubleValueC();

    @Generated
    @CVariable()
    public static native ConstBoolPtr kNGBoolValues();

    @Generated
    @CVariable()
    public static native ConstBytePtr kNGByteValues();

    @Generated
    @CVariable()
    public static native ConstShortPtr kNGShortValues();

    @Generated
    @CVariable()
    public static native ConstCharPtr kNGCharValues();

    @Generated
    @CVariable()
    public static native ConstIntPtr kNGIntValues();

    @Generated
    @CVariable()
    public static native ConstLongPtr kNGLongValues();

    @Generated
    @CVariable()
    public static native ConstFloatPtr kNGFloatValues();

    @Generated
    @CVariable()
    public static native ConstDoublePtr kNGDoubleValues();
}
