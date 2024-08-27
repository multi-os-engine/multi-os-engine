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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSError;
import apple.foundation.NSMutableArray;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class ObjCBlocks extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ObjCBlocks(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native ObjCBlocks alloc();

    @Generated
    @Selector("execBlockWithBool:")
    public static native void execBlockWithBool(
            @ObjCBlock(name = "call_execBlockWithBool") Block_execBlockWithBool value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithBool {
        @Generated
        void call_execBlockWithBool(boolean arg0);
    }

    @Generated
    @Selector("execBlockWithBoolPtr:")
    public static native void execBlockWithBoolPtr(
            @ObjCBlock(name = "call_execBlockWithBoolPtr") Block_execBlockWithBoolPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithBoolPtr {
        @Generated
        void call_execBlockWithBoolPtr(BoolPtr arg0);
    }

    @Generated
    @Selector("execBlockWithByte:")
    public static native void execBlockWithByte(
            @ObjCBlock(name = "call_execBlockWithByte") Block_execBlockWithByte value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithByte {
        @Generated
        void call_execBlockWithByte(byte arg0);
    }

    @Generated
    @Selector("execBlockWithBytePtr:")
    public static native void execBlockWithBytePtr(
            @ObjCBlock(name = "call_execBlockWithBytePtr") Block_execBlockWithBytePtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithBytePtr {
        @Generated
        void call_execBlockWithBytePtr(BytePtr arg0);
    }

    @Generated
    @Selector("execBlockWithChar:")
    public static native void execBlockWithChar(
            @ObjCBlock(name = "call_execBlockWithChar") Block_execBlockWithChar value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithChar {
        @Generated
        void call_execBlockWithChar(char arg0);
    }

    @Generated
    @Selector("execBlockWithCharPtr:")
    public static native void execBlockWithCharPtr(
            @ObjCBlock(name = "call_execBlockWithCharPtr") Block_execBlockWithCharPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithCharPtr {
        @Generated
        void call_execBlockWithCharPtr(CharPtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstBoolPtr:")
    public static native void execBlockWithConstBoolPtr(
            @ObjCBlock(name = "call_execBlockWithConstBoolPtr") Block_execBlockWithConstBoolPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstBoolPtr {
        @Generated
        void call_execBlockWithConstBoolPtr(ConstBoolPtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstBytePtr:")
    public static native void execBlockWithConstBytePtr(
            @ObjCBlock(name = "call_execBlockWithConstBytePtr") Block_execBlockWithConstBytePtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstBytePtr {
        @Generated
        void call_execBlockWithConstBytePtr(ConstBytePtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstCharPtr:")
    public static native void execBlockWithConstCharPtr(
            @ObjCBlock(name = "call_execBlockWithConstCharPtr") Block_execBlockWithConstCharPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstCharPtr {
        @Generated
        void call_execBlockWithConstCharPtr(ConstCharPtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstDoublePtr:")
    public static native void execBlockWithConstDoublePtr(
            @ObjCBlock(name = "call_execBlockWithConstDoublePtr") Block_execBlockWithConstDoublePtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstDoublePtr {
        @Generated
        void call_execBlockWithConstDoublePtr(ConstDoublePtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstFloatPtr:")
    public static native void execBlockWithConstFloatPtr(
            @ObjCBlock(name = "call_execBlockWithConstFloatPtr") Block_execBlockWithConstFloatPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstFloatPtr {
        @Generated
        void call_execBlockWithConstFloatPtr(ConstFloatPtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstIntPtr:")
    public static native void execBlockWithConstIntPtr(
            @ObjCBlock(name = "call_execBlockWithConstIntPtr") Block_execBlockWithConstIntPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstIntPtr {
        @Generated
        void call_execBlockWithConstIntPtr(ConstIntPtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstLongPtr:")
    public static native void execBlockWithConstLongPtr(
            @ObjCBlock(name = "call_execBlockWithConstLongPtr") Block_execBlockWithConstLongPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstLongPtr {
        @Generated
        void call_execBlockWithConstLongPtr(ConstLongPtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstShortPtr:")
    public static native void execBlockWithConstShortPtr(
            @ObjCBlock(name = "call_execBlockWithConstShortPtr") Block_execBlockWithConstShortPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstShortPtr {
        @Generated
        void call_execBlockWithConstShortPtr(ConstShortPtr arg0);
    }

    @Generated
    @Selector("execBlockWithConstStructPtr:")
    public static native void execBlockWithConstStructPtr(
            @ObjCBlock(name = "call_execBlockWithConstStructPtr") Block_execBlockWithConstStructPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithConstStructPtr {
        @Generated
        void call_execBlockWithConstStructPtr(
                @ReferenceInfo(type = CGSize.class) ConstPtr<CGSize> arg0);
    }

    @Generated
    @Selector("execBlockWithDouble:")
    public static native void execBlockWithDouble(
            @ObjCBlock(name = "call_execBlockWithDouble") Block_execBlockWithDouble value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithDouble {
        @Generated
        void call_execBlockWithDouble(double arg0);
    }

    @Generated
    @Selector("execBlockWithDoublePtr:")
    public static native void execBlockWithDoublePtr(
            @ObjCBlock(name = "call_execBlockWithDoublePtr") Block_execBlockWithDoublePtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithDoublePtr {
        @Generated
        void call_execBlockWithDoublePtr(DoublePtr arg0);
    }

    @Generated
    @Selector("execBlockWithFloat:")
    public static native void execBlockWithFloat(
            @ObjCBlock(name = "call_execBlockWithFloat") Block_execBlockWithFloat value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithFloat {
        @Generated
        void call_execBlockWithFloat(float arg0);
    }

    @Generated
    @Selector("execBlockWithFloatPtr:")
    public static native void execBlockWithFloatPtr(
            @ObjCBlock(name = "call_execBlockWithFloatPtr") Block_execBlockWithFloatPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithFloatPtr {
        @Generated
        void call_execBlockWithFloatPtr(FloatPtr arg0);
    }

    @Generated
    @Selector("execBlockWithInt:")
    public static native void execBlockWithInt(
            @ObjCBlock(name = "call_execBlockWithInt") Block_execBlockWithInt value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithInt {
        @Generated
        void call_execBlockWithInt(int arg0);
    }

    @Generated
    @Selector("execBlockWithIntPtr:")
    public static native void execBlockWithIntPtr(
            @ObjCBlock(name = "call_execBlockWithIntPtr") Block_execBlockWithIntPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithIntPtr {
        @Generated
        void call_execBlockWithIntPtr(IntPtr arg0);
    }

    @Generated
    @Selector("execBlockWithLong:")
    public static native void execBlockWithLong(
            @ObjCBlock(name = "call_execBlockWithLong") Block_execBlockWithLong value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithLong {
        @Generated
        void call_execBlockWithLong(long arg0);
    }

    @Generated
    @Selector("execBlockWithLongPtr:")
    public static native void execBlockWithLongPtr(
            @ObjCBlock(name = "call_execBlockWithLongPtr") Block_execBlockWithLongPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithLongPtr {
        @Generated
        void call_execBlockWithLongPtr(LongPtr arg0);
    }

    @Generated
    @Selector("execBlockWithShort:")
    public static native void execBlockWithShort(
            @ObjCBlock(name = "call_execBlockWithShort") Block_execBlockWithShort value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithShort {
        @Generated
        void call_execBlockWithShort(short arg0);
    }

    @Generated
    @Selector("execBlockWithShortPtr:")
    public static native void execBlockWithShortPtr(
            @ObjCBlock(name = "call_execBlockWithShortPtr") Block_execBlockWithShortPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithShortPtr {
        @Generated
        void call_execBlockWithShortPtr(ShortPtr arg0);
    }

    @Generated
    @Selector("execBlockWithStruct:")
    public static native void execBlockWithStruct(
            @ObjCBlock(name = "call_execBlockWithStruct") Block_execBlockWithStruct value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithStruct {
        @Generated
        void call_execBlockWithStruct(@ByValue CGSize arg0);
    }

    @Generated
    @Selector("execBlockWithStructPtr2:")
    public static native void execBlockWithStructPtr2(
            @ObjCBlock(name = "call_execBlockWithStructPtr2") Block_execBlockWithStructPtr2 value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithStructPtr2 {
        @Generated
        void call_execBlockWithStructPtr2(long arg0, CGPoint arg1);
    }

    @Generated
    @Selector("execBlockWithStructPtr:")
    public static native void execBlockWithStructPtr(
            @ObjCBlock(name = "call_execBlockWithStructPtr") Block_execBlockWithStructPtr value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_execBlockWithStructPtr {
        @Generated
        void call_execBlockWithStructPtr(
                @ReferenceInfo(type = CGSize.class) Ptr<CGSize> arg0);
    }

    @Generated
    @Selector("getBlockWithOutArg")
    @ObjCBlock(name = "call_getBlockWithOutArg_ret")
    public static native Block_getBlockWithOutArg_ret getBlockWithOutArg();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getBlockWithOutArg_ret {
        @Generated
        void call_getBlockWithOutArg_ret(
                @ReferenceInfo(type = NSError.class) Ptr<NSError> arg0);
    }

    @Generated
    @Selector("getMultipleBlock")
    @ObjCBlock(name = "call_getMultipleBlock_ret")
    public static native Block_getMultipleBlock_ret getMultipleBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMultipleBlock_ret {
        @Generated
        boolean call_getMultipleBlock_ret(boolean bo1, byte by1, char ch1, double do1, float fl1, int in1, long lo1, short sh1, @ByValue CGSize si1,
                                          boolean bo2, byte by2, char ch2, double do2, float fl2, int in2, long lo2, short sh2, @ByValue CGSize si2);
    }

    @Generated
    @Selector("getBooleanAnderBlock")
    @ObjCBlock(name = "call_getBooleanAnderBlock_ret")
    public static native Block_getBooleanAnderBlock_ret getBooleanAnderBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getBooleanAnderBlock_ret {
        @Generated
        boolean call_getBooleanAnderBlock_ret(boolean arg0, boolean arg1);
    }

    @Generated
    @Selector("getByteMultiplierBlock")
    @ObjCBlock(name = "call_getByteMultiplierBlock_ret")
    public static native Block_getByteMultiplierBlock_ret getByteMultiplierBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getByteMultiplierBlock_ret {
        @Generated
        byte call_getByteMultiplierBlock_ret(byte arg0, byte arg1);
    }

    @Generated
    @Selector("getCharMultiplierBlock")
    @ObjCBlock(name = "call_getCharMultiplierBlock_ret")
    public static native Block_getCharMultiplierBlock_ret getCharMultiplierBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCharMultiplierBlock_ret {
        @Generated
        char call_getCharMultiplierBlock_ret(char arg0, char arg1);
    }

    @Generated
    @Selector("getDoubleMultiplierBlock")
    @ObjCBlock(name = "call_getDoubleMultiplierBlock_ret")
    public static native Block_getDoubleMultiplierBlock_ret getDoubleMultiplierBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDoubleMultiplierBlock_ret {
        @Generated
        double call_getDoubleMultiplierBlock_ret(double arg0, double arg1);
    }

    @Generated
    @Selector("getFloatMultiplierBlock")
    @ObjCBlock(name = "call_getFloatMultiplierBlock_ret")
    public static native Block_getFloatMultiplierBlock_ret getFloatMultiplierBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getFloatMultiplierBlock_ret {
        @Generated
        float call_getFloatMultiplierBlock_ret(float arg0, float arg1);
    }

    @Generated
    @Selector("getIntMultiplierBlock")
    @ObjCBlock(name = "call_getIntMultiplierBlock_ret")
    public static native Block_getIntMultiplierBlock_ret getIntMultiplierBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getIntMultiplierBlock_ret {
        @Generated
        int call_getIntMultiplierBlock_ret(int arg0, int arg1);
    }

    @Generated
    @Selector("getLongMultiplierBlock")
    @ObjCBlock(name = "call_getLongMultiplierBlock_ret")
    public static native Block_getLongMultiplierBlock_ret getLongMultiplierBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getLongMultiplierBlock_ret {
        @Generated
        long call_getLongMultiplierBlock_ret(long arg0, long arg1);
    }

    @Generated
    @Selector("getNFloatAdder")
    @ObjCBlock(name = "call_getNFloatAdder_ret")
    public static native Block_getNFloatAdder_ret getNFloatAdder();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNFloatAdder_ret {
        @Generated
        @NFloat
        double call_getNFloatAdder_ret(@NFloat double arg0, @NFloat double arg1);
    }

    @Generated
    @Selector("getNIntAdder")
    @ObjCBlock(name = "call_getNIntAdder_ret")
    public static native Block_getNIntAdder_ret getNIntAdder();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNIntAdder_ret {
        @Generated
        @NInt
        long call_getNIntAdder_ret(@NInt long arg0, @NInt long arg1);
    }

    @Generated
    @Selector("getNUIntAdder")
    @ObjCBlock(name = "call_getNUIntAdder_ret")
    public static native Block_getNUIntAdder_ret getNUIntAdder();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNUIntAdder_ret {
        @Generated
        @NUInt
        long call_getNUIntAdder_ret(@NUInt long arg0, @NUInt long arg1);
    }

    @Generated
    @Selector("getShortMultiplierBlock")
    @ObjCBlock(name = "call_getShortMultiplierBlock_ret")
    public static native Block_getShortMultiplierBlock_ret getShortMultiplierBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getShortMultiplierBlock_ret {
        @Generated
        short call_getShortMultiplierBlock_ret(short arg0, short arg1);
    }

    @Generated
    @Selector("getStringArrayElementAdderBlock")
    @ObjCBlock(name = "call_getStringArrayElementAdderBlock_ret")
    public static native Block_getStringArrayElementAdderBlock_ret getStringArrayElementAdderBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getStringArrayElementAdderBlock_ret {
        @Generated
        NSMutableArray<?> call_getStringArrayElementAdderBlock_ret(String arg0,
                                                                   String arg1);
    }

    @Generated
    @Selector("getStringConcatenaterBlock")
    @ObjCBlock(name = "call_getStringConcatenaterBlock_ret")
    public static native Block_getStringConcatenaterBlock_ret getStringConcatenaterBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getStringConcatenaterBlock_ret {
        @Generated
        String call_getStringConcatenaterBlock_ret(String arg0, String arg1);
    }

    @Generated
    @Selector("getVoidStringArrayElementAdderBlock")
    @ObjCBlock(name = "call_getVoidStringArrayElementAdderBlock_ret")
    public static native Block_getVoidStringArrayElementAdderBlock_ret getVoidStringArrayElementAdderBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getVoidStringArrayElementAdderBlock_ret {
        @Generated
        void call_getVoidStringArrayElementAdderBlock_ret(
                NSMutableArray<?> arg0, String arg1, String arg2);
    }

    @Generated
    @Selector("init")
    public native ObjCBlocks init();

    @Generated
    @Selector("validateExecBlockWithStructPtr2:")
    public static native boolean validateExecBlockWithStructPtr2(
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint value);
}
