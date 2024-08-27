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

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Describes the kind of type
 */
@Generated
public final class CXTypeKind {
    /**
     * Represents an invalid type (e.g., where no type is available).
     */
    @Generated public static final int Invalid = 0x00000000;
    /**
     * A type whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int Unexposed = 0x00000001;
    /**
     * Builtin types
     */
    @Generated public static final int Void = 0x00000002;
    /**
     * Builtin types
     */
    @Generated public static final int Bool = 0x00000003;
    /**
     * Builtin types
     */
    @Generated public static final int Char_U = 0x00000004;
    /**
     * Builtin types
     */
    @Generated public static final int UChar = 0x00000005;
    /**
     * Builtin types
     */
    @Generated public static final int Char16 = 0x00000006;
    /**
     * Builtin types
     */
    @Generated public static final int Char32 = 0x00000007;
    /**
     * Builtin types
     */
    @Generated public static final int UShort = 0x00000008;
    /**
     * Builtin types
     */
    @Generated public static final int UInt = 0x00000009;
    /**
     * Builtin types
     */
    @Generated public static final int ULong = 0x0000000A;
    /**
     * Builtin types
     */
    @Generated public static final int ULongLong = 0x0000000B;
    /**
     * Builtin types
     */
    @Generated public static final int UInt128 = 0x0000000C;
    /**
     * Builtin types
     */
    @Generated public static final int Char_S = 0x0000000D;
    /**
     * Builtin types
     */
    @Generated public static final int SChar = 0x0000000E;
    /**
     * Builtin types
     */
    @Generated public static final int WChar = 0x0000000F;
    /**
     * Builtin types
     */
    @Generated public static final int Short = 0x00000010;
    /**
     * Builtin types
     */
    @Generated public static final int Int = 0x00000011;
    /**
     * Builtin types
     */
    @Generated public static final int Long = 0x00000012;
    /**
     * Builtin types
     */
    @Generated public static final int LongLong = 0x00000013;
    /**
     * Builtin types
     */
    @Generated public static final int Int128 = 0x00000014;
    /**
     * Builtin types
     */
    @Generated public static final int Float = 0x00000015;
    /**
     * Builtin types
     */
    @Generated public static final int Double = 0x00000016;
    /**
     * Builtin types
     */
    @Generated public static final int LongDouble = 0x00000017;
    /**
     * Builtin types
     */
    @Generated public static final int NullPtr = 0x00000018;
    /**
     * Builtin types
     */
    @Generated public static final int Overload = 0x00000019;
    /**
     * Builtin types
     */
    @Generated public static final int Dependent = 0x0000001A;
    /**
     * Builtin types
     */
    @Generated public static final int ObjCId = 0x0000001B;
    /**
     * Builtin types
     */
    @Generated public static final int ObjCClass = 0x0000001C;
    /**
     * Builtin types
     */
    @Generated public static final int ObjCSel = 0x0000001D;
    /**
     * Builtin types
     */
    @Generated public static final int Float128 = 0x0000001E;
    /**
     * Builtin types
     */
    @Generated public static final int FirstBuiltin = 0x00000002;
    /**
     * Builtin types
     */
    @Generated public static final int LastBuiltin = 0x00000027;
    /**
     * Builtin types
     */
    @Generated public static final int Complex = 0x00000064;
    /**
     * Builtin types
     */
    @Generated public static final int Pointer = 0x00000065;
    /**
     * Builtin types
     */
    @Generated public static final int BlockPointer = 0x00000066;
    /**
     * Builtin types
     */
    @Generated public static final int LValueReference = 0x00000067;
    /**
     * Builtin types
     */
    @Generated public static final int RValueReference = 0x00000068;
    /**
     * Builtin types
     */
    @Generated public static final int Record = 0x00000069;
    /**
     * Builtin types
     */
    @Generated public static final int Enum = 0x0000006A;
    /**
     * Builtin types
     */
    @Generated public static final int Typedef = 0x0000006B;
    /**
     * Builtin types
     */
    @Generated public static final int ObjCInterface = 0x0000006C;
    /**
     * Builtin types
     */
    @Generated public static final int ObjCObjectPointer = 0x0000006D;
    /**
     * Builtin types
     */
    @Generated public static final int FunctionNoProto = 0x0000006E;
    /**
     * Builtin types
     */
    @Generated public static final int FunctionProto = 0x0000006F;
    /**
     * Builtin types
     */
    @Generated public static final int ConstantArray = 0x00000070;
    /**
     * Builtin types
     */
    @Generated public static final int Vector = 0x00000071;
    /**
     * Builtin types
     */
    @Generated public static final int IncompleteArray = 0x00000072;
    /**
     * Builtin types
     */
    @Generated public static final int VariableArray = 0x00000073;
    /**
     * Builtin types
     */
    @Generated public static final int DependentSizedArray = 0x00000074;
    /**
     * Builtin types
     */
    @Generated public static final int MemberPointer = 0x00000075;
    /**
     * Builtin types
     */
    @Generated public static final int Auto = 0x00000076;
    /**
     * Represents a type that was referred to using an elaborated type keyword.
     * <p>
     * E.g., struct S, or via a qualified name, e.g., N::M::type, or both.
     */
    @Generated public static final int Elaborated = 0x00000077;

    @Generated
    private CXTypeKind() {
    }

    /**
     * Builtin types
     */
    @Generated public static final int Half = 0x0000001F;
    /**
     * Builtin types
     */
    @Generated public static final int Float16 = 0x00000020;
    /**
     * Builtin types
     */
    @Generated public static final int ShortAccum = 0x00000021;
    /**
     * Builtin types
     */
    @Generated public static final int Accum = 0x00000022;
    /**
     * Builtin types
     */
    @Generated public static final int LongAccum = 0x00000023;
    /**
     * Builtin types
     */
    @Generated public static final int UShortAccum = 0x00000024;
    /**
     * Builtin types
     */
    @Generated public static final int UAccum = 0x00000025;
    /**
     * Builtin types
     */
    @Generated public static final int ULongAccum = 0x00000026;
    /**
     * Builtin types
     */
    @Generated public static final int BFloat16 = 0x00000027;
    /**
     * OpenCL PipeType.
     */
    @Generated public static final int Pipe = 0x00000078;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dRO = 0x00000079;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dArrayRO = 0x0000007A;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dBufferRO = 0x0000007B;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dRO = 0x0000007C;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayRO = 0x0000007D;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dDepthRO = 0x0000007E;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayDepthRO = 0x0000007F;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dMSAARO = 0x00000080;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayMSAARO = 0x00000081;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dMSAADepthRO = 0x00000082;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayMSAADepthRO = 0x00000083;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage3dRO = 0x00000084;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dWO = 0x00000085;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dArrayWO = 0x00000086;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dBufferWO = 0x00000087;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dWO = 0x00000088;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayWO = 0x00000089;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dDepthWO = 0x0000008A;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayDepthWO = 0x0000008B;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dMSAAWO = 0x0000008C;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayMSAAWO = 0x0000008D;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dMSAADepthWO = 0x0000008E;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayMSAADepthWO = 0x0000008F;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage3dWO = 0x00000090;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dRW = 0x00000091;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dArrayRW = 0x00000092;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage1dBufferRW = 0x00000093;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dRW = 0x00000094;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayRW = 0x00000095;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dDepthRW = 0x00000096;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayDepthRW = 0x00000097;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dMSAARW = 0x00000098;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayMSAARW = 0x00000099;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dMSAADepthRW = 0x0000009A;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage2dArrayMSAADepthRW = 0x0000009B;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLImage3dRW = 0x0000009C;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLSampler = 0x0000009D;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLEvent = 0x0000009E;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLQueue = 0x0000009F;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLReserveID = 0x000000A0;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int ObjCObject = 0x000000A1;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int ObjCTypeParam = 0x000000A2;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int Attributed = 0x000000A3;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCMcePayload = 0x000000A4;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCImePayload = 0x000000A5;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCRefPayload = 0x000000A6;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCSicPayload = 0x000000A7;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCMceResult = 0x000000A8;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCImeResult = 0x000000A9;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCRefResult = 0x000000AA;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCSicResult = 0x000000AB;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCImeResultSingleRefStreamout = 0x000000AC;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCImeResultDualRefStreamout = 0x000000AD;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCImeSingleRefStreamin = 0x000000AE;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int OCLIntelSubgroupAVCImeDualRefStreamin = 0x000000AF;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int ExtVector = 0x000000B0;
    /**
     * OpenCL builtin types.
     */
    @Generated public static final int Atomic = 0x000000B1;
}
