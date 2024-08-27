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

#include "C+Functions+Invocation.h"

bool NGInvocation_ann_arg_0(char a, NJInt b, char c) {
    return a == (char)0xAA && b == (NJInt)0x5555555555555555ULL && c == (char)0xAA;
}
bool NGInvocation_ann_arg_1(char a, NJUInt b, char c) {
    return a == (char)0xAA && b == (NJUInt)0x5555555555555555ULL && c == (char)0xAA;
}
bool NGInvocation_ann_arg_2(char a, long b, char c) {
    return a == (char)0xAA && b == (long)0x5555555555555555ULL && c == (char)0xAA;
}
bool NGInvocation_ann_arg_3(char a, unsigned long b, char c) {
    return a == (char)0xAA && b == (unsigned long)0x5555555555555555ULL && c == (char)0xAA;
}
bool NGInvocation_ann_arg_4(char a, wchar_t b, char c) {
    return a == (char)0xAA && b == (wchar_t)0x55555555U && c == (char)0xAA;
}

NJInt NGInvocation_ann_ret_0(NJInt b) { return ~b; }
NJUInt NGInvocation_ann_ret_1(NJUInt b) { return ~b; }
long NGInvocation_ann_ret_2(long b) { return ~b; }
unsigned long NGInvocation_ann_ret_3(unsigned long b) { return ~b; }
wchar_t NGInvocation_ann_ret_4(wchar_t b) { return ~b; }

int NGInvocation_refs4885_0(int arg0, int arg1, int arg2, int arg3, int arg4, void* arg5, int arg6) {
    return arg6;
}

float NGInvocation_refs4885_1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, void* arg7, float arg8) {
    return arg8;
}

bool NGInvocation_0(int arg0) {
	return (arg0 == 6);
}

bool NGInvocation_1(float arg0) {
	return (arg0 == 1919.516f);
}

bool NGInvocation_2(int64_t arg0) {
	return (arg0 == 51L);
}

bool NGInvocation_3(double arg0) {
	return (arg0 == 19.651);
}

bool NGInvocation_4(int arg0, int arg1) {
	return (arg0 == 96516) && (arg1 == 51);
}

bool NGInvocation_5(int arg0, float arg1) {
	return (arg0 == 51) && (arg1 == 524.9519f);
}

bool NGInvocation_6(int arg0, int64_t arg1) {
	return (arg0 == 9519) && (arg1 == 1L);
}

bool NGInvocation_7(int arg0, double arg1) {
	return (arg0 == 1) && (arg1 == 651.5619);
}

bool NGInvocation_8(float arg0, int arg1) {
	return (arg0 == 651.5619f) && (arg1 == 519);
}

bool NGInvocation_9(float arg0, float arg1) {
	return (arg0 == 98.519f) && (arg1 == 78.516f);
}

bool NGInvocation_10(float arg0, int64_t arg1) {
	return (arg0 == 78.516f) && (arg1 == 5L);
}

bool NGInvocation_11(float arg0, double arg1) {
	return (arg0 == 6.5f) && (arg1 == 3654.768);
}

bool NGInvocation_12(int64_t arg0, int arg1) {
	return (arg0 == 768L) && (arg1 == 795);
}

bool NGInvocation_13(int64_t arg0, float arg1) {
	return (arg0 == 795L) && (arg1 == 165.9f);
}

bool NGInvocation_14(int64_t arg0, int64_t arg1) {
	return (arg0 == 9L) && (arg1 == 515L);
}

bool NGInvocation_15(int64_t arg0, double arg1) {
	return (arg0 == 515L) && (arg1 == 49.6);
}

bool NGInvocation_16(double arg0, int arg1) {
	return (arg0 == 49.6) && (arg1 == 516);
}

bool NGInvocation_17(double arg0, float arg1) {
	return (arg0 == 1919.516) && (arg1 == 2.51f);
}

bool NGInvocation_18(double arg0, int64_t arg1) {
	return (arg0 == 2.51) && (arg1 == 651L);
}

bool NGInvocation_19(double arg0, double arg1) {
	return (arg0 == 19.651) && (arg1 == 321.96516);
}

bool NGInvocation_20(int arg0, int arg1, int arg2) {
	return (arg0 == 96516) && (arg1 == 51) && (arg2 == 9519);
}

bool NGInvocation_21(int arg0, int arg1, float arg2) {
	return (arg0 == 51) && (arg1 == 9519) && (arg2 == 312.1f);
}

bool NGInvocation_22(int arg0, int arg1, int64_t arg2) {
	return (arg0 == 9519) && (arg1 == 1) && (arg2 == 5619L);
}

bool NGInvocation_23(int arg0, int arg1, double arg2) {
	return (arg0 == 1) && (arg1 == 5619) && (arg2 == 98.519);
}

bool NGInvocation_24(int arg0, float arg1, int arg2) {
	return (arg0 == 5619) && (arg1 == 98.519f) && (arg2 == 516);
}

bool NGInvocation_25(int arg0, float arg1, float arg2) {
	return (arg0 == 519) && (arg1 == 78.516f) && (arg2 == 6.5f);
}

bool NGInvocation_26(int arg0, float arg1, int64_t arg2) {
	return (arg0 == 516) && (arg1 == 6.5f) && (arg2 == 768L);
}

bool NGInvocation_27(int arg0, float arg1, double arg2) {
	return (arg0 == 5) && (arg1 == 3654.768f) && (arg2 == 486.795);
}

bool NGInvocation_28(int arg0, int64_t arg1, int arg2) {
	return (arg0 == 768) && (arg1 == 795L) && (arg2 == 9);
}

bool NGInvocation_29(int arg0, int64_t arg1, float arg2) {
	return (arg0 == 795) && (arg1 == 9L) && (arg2 == 16.515f);
}

bool NGInvocation_30(int arg0, int64_t arg1, int64_t arg2) {
	return (arg0 == 9) && (arg1 == 515L) && (arg2 == 6L);
}

bool NGInvocation_31(int arg0, int64_t arg1, double arg2) {
	return (arg0 == 515) && (arg1 == 6L) && (arg2 == 1919.516);
}

bool NGInvocation_32(int arg0, double arg1, int arg2) {
	return (arg0 == 6) && (arg1 == 1919.516) && (arg2 == 51);
}

bool NGInvocation_33(int arg0, double arg1, float arg2) {
	return (arg0 == 516) && (arg1 == 2.51) && (arg2 == 19.651f);
}

bool NGInvocation_34(int arg0, double arg1, int64_t arg2) {
	return (arg0 == 51) && (arg1 == 19.651) && (arg2 == 96516L);
}

bool NGInvocation_35(int arg0, double arg1, double arg2) {
	return (arg0 == 651) && (arg1 == 321.96516) && (arg2 == 984.51);
}

bool NGInvocation_36(float arg0, int arg1, int arg2) {
	return (arg0 == 321.96516f) && (arg1 == 51) && (arg2 == 9519);
}

bool NGInvocation_37(float arg0, int arg1, float arg2) {
	return (arg0 == 984.51f) && (arg1 == 9519) && (arg2 == 312.1f);
}

bool NGInvocation_38(float arg0, int arg1, int64_t arg2) {
	return (arg0 == 524.9519f) && (arg1 == 1) && (arg2 == 5619L);
}

bool NGInvocation_39(float arg0, int arg1, double arg2) {
	return (arg0 == 312.1f) && (arg1 == 5619) && (arg2 == 98.519);
}

bool NGInvocation_40(float arg0, float arg1, int arg2) {
	return (arg0 == 651.5619f) && (arg1 == 98.519f) && (arg2 == 516);
}

bool NGInvocation_41(float arg0, float arg1, float arg2) {
	return (arg0 == 98.519f) && (arg1 == 78.516f) && (arg2 == 6.5f);
}

bool NGInvocation_42(float arg0, float arg1, int64_t arg2) {
	return (arg0 == 78.516f) && (arg1 == 6.5f) && (arg2 == 768L);
}

bool NGInvocation_43(float arg0, float arg1, double arg2) {
	return (arg0 == 6.5f) && (arg1 == 3654.768f) && (arg2 == 486.795);
}

bool NGInvocation_44(float arg0, int64_t arg1, int arg2) {
	return (arg0 == 3654.768f) && (arg1 == 795L) && (arg2 == 9);
}

bool NGInvocation_45(float arg0, int64_t arg1, float arg2) {
	return (arg0 == 486.795f) && (arg1 == 9L) && (arg2 == 16.515f);
}

bool NGInvocation_46(float arg0, int64_t arg1, int64_t arg2) {
	return (arg0 == 165.9f) && (arg1 == 515L) && (arg2 == 6L);
}

bool NGInvocation_47(float arg0, int64_t arg1, double arg2) {
	return (arg0 == 16.515f) && (arg1 == 6L) && (arg2 == 1919.516);
}

bool NGInvocation_48(float arg0, double arg1, int arg2) {
	return (arg0 == 49.6f) && (arg1 == 1919.516) && (arg2 == 51);
}

bool NGInvocation_49(float arg0, double arg1, float arg2) {
	return (arg0 == 1919.516f) && (arg1 == 2.51) && (arg2 == 19.651f);
}

bool NGInvocation_50(float arg0, double arg1, int64_t arg2) {
	return (arg0 == 2.51f) && (arg1 == 19.651) && (arg2 == 96516L);
}

bool NGInvocation_51(float arg0, double arg1, double arg2) {
	return (arg0 == 19.651f) && (arg1 == 321.96516) && (arg2 == 984.51);
}

bool NGInvocation_52(int64_t arg0, int arg1, int arg2) {
	return (arg0 == 96516L) && (arg1 == 51) && (arg2 == 9519);
}

bool NGInvocation_53(int64_t arg0, int arg1, float arg2) {
	return (arg0 == 51L) && (arg1 == 9519) && (arg2 == 312.1f);
}

bool NGInvocation_54(int64_t arg0, int arg1, int64_t arg2) {
	return (arg0 == 9519L) && (arg1 == 1) && (arg2 == 5619L);
}

bool NGInvocation_55(int64_t arg0, int arg1, double arg2) {
	return (arg0 == 1L) && (arg1 == 5619) && (arg2 == 98.519);
}

bool NGInvocation_56(int64_t arg0, float arg1, int arg2) {
	return (arg0 == 5619L) && (arg1 == 98.519f) && (arg2 == 516);
}

bool NGInvocation_57(int64_t arg0, float arg1, float arg2) {
	return (arg0 == 519L) && (arg1 == 78.516f) && (arg2 == 6.5f);
}

bool NGInvocation_58(int64_t arg0, float arg1, int64_t arg2) {
	return (arg0 == 516L) && (arg1 == 6.5f) && (arg2 == 768L);
}

bool NGInvocation_59(int64_t arg0, float arg1, double arg2) {
	return (arg0 == 5L) && (arg1 == 3654.768f) && (arg2 == 486.795);
}

bool NGInvocation_60(int64_t arg0, int64_t arg1, int arg2) {
	return (arg0 == 768L) && (arg1 == 795L) && (arg2 == 9);
}

bool NGInvocation_61(int64_t arg0, int64_t arg1, float arg2) {
	return (arg0 == 795L) && (arg1 == 9L) && (arg2 == 16.515f);
}

bool NGInvocation_62(int64_t arg0, int64_t arg1, int64_t arg2) {
	return (arg0 == 9L) && (arg1 == 515L) && (arg2 == 6L);
}

bool NGInvocation_63(int64_t arg0, int64_t arg1, double arg2) {
	return (arg0 == 515L) && (arg1 == 6L) && (arg2 == 1919.516);
}

bool NGInvocation_64(int64_t arg0, double arg1, int arg2) {
	return (arg0 == 6L) && (arg1 == 1919.516) && (arg2 == 51);
}

bool NGInvocation_65(int64_t arg0, double arg1, float arg2) {
	return (arg0 == 516L) && (arg1 == 2.51) && (arg2 == 19.651f);
}

bool NGInvocation_66(int64_t arg0, double arg1, int64_t arg2) {
	return (arg0 == 51L) && (arg1 == 19.651) && (arg2 == 96516L);
}

bool NGInvocation_67(int64_t arg0, double arg1, double arg2) {
	return (arg0 == 651L) && (arg1 == 321.96516) && (arg2 == 984.51);
}

bool NGInvocation_68(double arg0, int arg1, int arg2) {
	return (arg0 == 321.96516) && (arg1 == 51) && (arg2 == 9519);
}

bool NGInvocation_69(double arg0, int arg1, float arg2) {
	return (arg0 == 984.51) && (arg1 == 9519) && (arg2 == 312.1f);
}

bool NGInvocation_70(double arg0, int arg1, int64_t arg2) {
	return (arg0 == 524.9519) && (arg1 == 1) && (arg2 == 5619L);
}

bool NGInvocation_71(double arg0, int arg1, double arg2) {
	return (arg0 == 312.1) && (arg1 == 5619) && (arg2 == 98.519);
}

bool NGInvocation_72(double arg0, float arg1, int arg2) {
	return (arg0 == 651.5619) && (arg1 == 98.519f) && (arg2 == 516);
}

bool NGInvocation_73(double arg0, float arg1, float arg2) {
	return (arg0 == 98.519) && (arg1 == 78.516f) && (arg2 == 6.5f);
}

bool NGInvocation_74(double arg0, float arg1, int64_t arg2) {
	return (arg0 == 78.516) && (arg1 == 6.5f) && (arg2 == 768L);
}

bool NGInvocation_75(double arg0, float arg1, double arg2) {
	return (arg0 == 6.5) && (arg1 == 3654.768f) && (arg2 == 486.795);
}

bool NGInvocation_76(double arg0, int64_t arg1, int arg2) {
	return (arg0 == 3654.768) && (arg1 == 795L) && (arg2 == 9);
}

bool NGInvocation_77(double arg0, int64_t arg1, float arg2) {
	return (arg0 == 486.795) && (arg1 == 9L) && (arg2 == 16.515f);
}

bool NGInvocation_78(double arg0, int64_t arg1, int64_t arg2) {
	return (arg0 == 165.9) && (arg1 == 515L) && (arg2 == 6L);
}

bool NGInvocation_79(double arg0, int64_t arg1, double arg2) {
	return (arg0 == 16.515) && (arg1 == 6L) && (arg2 == 1919.516);
}

bool NGInvocation_80(double arg0, double arg1, int arg2) {
	return (arg0 == 49.6) && (arg1 == 1919.516) && (arg2 == 51);
}

bool NGInvocation_81(double arg0, double arg1, float arg2) {
	return (arg0 == 1919.516) && (arg1 == 2.51) && (arg2 == 19.651f);
}

bool NGInvocation_82(double arg0, double arg1, int64_t arg2) {
	return (arg0 == 2.51) && (arg1 == 19.651) && (arg2 == 96516L);
}

bool NGInvocation_83(double arg0, double arg1, double arg2) {
	return (arg0 == 19.651) && (arg1 == 321.96516) && (arg2 == 984.51);
}

bool NGInvocation_84(int arg0, int arg1, int arg2, int arg3) {
	return (arg0 == 96516) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_85(int arg0, int arg1, int arg2, float arg3) {
	return (arg0 == 51) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_86(int arg0, int arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_87(int arg0, int arg1, int arg2, double arg3) {
	return (arg0 == 1) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_88(int arg0, int arg1, float arg2, int arg3) {
	return (arg0 == 5619) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_89(int arg0, int arg1, float arg2, float arg3) {
	return (arg0 == 519) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_90(int arg0, int arg1, float arg2, int64_t arg3) {
	return (arg0 == 516) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_91(int arg0, int arg1, float arg2, double arg3) {
	return (arg0 == 5) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_92(int arg0, int arg1, int64_t arg2, int arg3) {
	return (arg0 == 768) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_93(int arg0, int arg1, int64_t arg2, float arg3) {
	return (arg0 == 795) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_94(int arg0, int arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_95(int arg0, int arg1, int64_t arg2, double arg3) {
	return (arg0 == 515) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_96(int arg0, int arg1, double arg2, int arg3) {
	return (arg0 == 6) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_97(int arg0, int arg1, double arg2, float arg3) {
	return (arg0 == 516) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_98(int arg0, int arg1, double arg2, int64_t arg3) {
	return (arg0 == 51) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_99(int arg0, int arg1, double arg2, double arg3) {
	return (arg0 == 651) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_100(int arg0, float arg1, int arg2, int arg3) {
	return (arg0 == 96516) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_101(int arg0, float arg1, int arg2, float arg3) {
	return (arg0 == 51) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_102(int arg0, float arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_103(int arg0, float arg1, int arg2, double arg3) {
	return (arg0 == 1) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_104(int arg0, float arg1, float arg2, int arg3) {
	return (arg0 == 5619) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_105(int arg0, float arg1, float arg2, float arg3) {
	return (arg0 == 519) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_106(int arg0, float arg1, float arg2, int64_t arg3) {
	return (arg0 == 516) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_107(int arg0, float arg1, float arg2, double arg3) {
	return (arg0 == 5) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_108(int arg0, float arg1, int64_t arg2, int arg3) {
	return (arg0 == 768) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_109(int arg0, float arg1, int64_t arg2, float arg3) {
	return (arg0 == 795) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_110(int arg0, float arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_111(int arg0, float arg1, int64_t arg2, double arg3) {
	return (arg0 == 515) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_112(int arg0, float arg1, double arg2, int arg3) {
	return (arg0 == 6) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_113(int arg0, float arg1, double arg2, float arg3) {
	return (arg0 == 516) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_114(int arg0, float arg1, double arg2, int64_t arg3) {
	return (arg0 == 51) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_115(int arg0, float arg1, double arg2, double arg3) {
	return (arg0 == 651) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_116(int arg0, int64_t arg1, int arg2, int arg3) {
	return (arg0 == 96516) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_117(int arg0, int64_t arg1, int arg2, float arg3) {
	return (arg0 == 51) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_118(int arg0, int64_t arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_119(int arg0, int64_t arg1, int arg2, double arg3) {
	return (arg0 == 1) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_120(int arg0, int64_t arg1, float arg2, int arg3) {
	return (arg0 == 5619) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_121(int arg0, int64_t arg1, float arg2, float arg3) {
	return (arg0 == 519) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_122(int arg0, int64_t arg1, float arg2, int64_t arg3) {
	return (arg0 == 516) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_123(int arg0, int64_t arg1, float arg2, double arg3) {
	return (arg0 == 5) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_124(int arg0, int64_t arg1, int64_t arg2, int arg3) {
	return (arg0 == 768) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_125(int arg0, int64_t arg1, int64_t arg2, float arg3) {
	return (arg0 == 795) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_126(int arg0, int64_t arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_127(int arg0, int64_t arg1, int64_t arg2, double arg3) {
	return (arg0 == 515) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_128(int arg0, int64_t arg1, double arg2, int arg3) {
	return (arg0 == 6) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_129(int arg0, int64_t arg1, double arg2, float arg3) {
	return (arg0 == 516) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_130(int arg0, int64_t arg1, double arg2, int64_t arg3) {
	return (arg0 == 51) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_131(int arg0, int64_t arg1, double arg2, double arg3) {
	return (arg0 == 651) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_132(int arg0, double arg1, int arg2, int arg3) {
	return (arg0 == 96516) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_133(int arg0, double arg1, int arg2, float arg3) {
	return (arg0 == 51) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_134(int arg0, double arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_135(int arg0, double arg1, int arg2, double arg3) {
	return (arg0 == 1) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_136(int arg0, double arg1, float arg2, int arg3) {
	return (arg0 == 5619) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_137(int arg0, double arg1, float arg2, float arg3) {
	return (arg0 == 519) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_138(int arg0, double arg1, float arg2, int64_t arg3) {
	return (arg0 == 516) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_139(int arg0, double arg1, float arg2, double arg3) {
	return (arg0 == 5) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_140(int arg0, double arg1, int64_t arg2, int arg3) {
	return (arg0 == 768) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_141(int arg0, double arg1, int64_t arg2, float arg3) {
	return (arg0 == 795) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_142(int arg0, double arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_143(int arg0, double arg1, int64_t arg2, double arg3) {
	return (arg0 == 515) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_144(int arg0, double arg1, double arg2, int arg3) {
	return (arg0 == 6) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_145(int arg0, double arg1, double arg2, float arg3) {
	return (arg0 == 516) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_146(int arg0, double arg1, double arg2, int64_t arg3) {
	return (arg0 == 51) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_147(int arg0, double arg1, double arg2, double arg3) {
	return (arg0 == 651) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_148(float arg0, int arg1, int arg2, int arg3) {
	return (arg0 == 321.96516f) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_149(float arg0, int arg1, int arg2, float arg3) {
	return (arg0 == 984.51f) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_150(float arg0, int arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519f) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_151(float arg0, int arg1, int arg2, double arg3) {
	return (arg0 == 312.1f) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_152(float arg0, int arg1, float arg2, int arg3) {
	return (arg0 == 651.5619f) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_153(float arg0, int arg1, float arg2, float arg3) {
	return (arg0 == 98.519f) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_154(float arg0, int arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516f) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_155(float arg0, int arg1, float arg2, double arg3) {
	return (arg0 == 6.5f) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_156(float arg0, int arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768f) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_157(float arg0, int arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795f) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_158(float arg0, int arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9f) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_159(float arg0, int arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515f) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_160(float arg0, int arg1, double arg2, int arg3) {
	return (arg0 == 49.6f) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_161(float arg0, int arg1, double arg2, float arg3) {
	return (arg0 == 1919.516f) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_162(float arg0, int arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51f) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_163(float arg0, int arg1, double arg2, double arg3) {
	return (arg0 == 19.651f) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_164(float arg0, float arg1, int arg2, int arg3) {
	return (arg0 == 321.96516f) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_165(float arg0, float arg1, int arg2, float arg3) {
	return (arg0 == 984.51f) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_166(float arg0, float arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519f) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_167(float arg0, float arg1, int arg2, double arg3) {
	return (arg0 == 312.1f) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_168(float arg0, float arg1, float arg2, int arg3) {
	return (arg0 == 651.5619f) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_169(float arg0, float arg1, float arg2, float arg3) {
	return (arg0 == 98.519f) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_170(float arg0, float arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516f) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_171(float arg0, float arg1, float arg2, double arg3) {
	return (arg0 == 6.5f) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_172(float arg0, float arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768f) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_173(float arg0, float arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795f) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_174(float arg0, float arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9f) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_175(float arg0, float arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515f) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_176(float arg0, float arg1, double arg2, int arg3) {
	return (arg0 == 49.6f) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_177(float arg0, float arg1, double arg2, float arg3) {
	return (arg0 == 1919.516f) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_178(float arg0, float arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51f) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_179(float arg0, float arg1, double arg2, double arg3) {
	return (arg0 == 19.651f) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_180(float arg0, int64_t arg1, int arg2, int arg3) {
	return (arg0 == 321.96516f) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_181(float arg0, int64_t arg1, int arg2, float arg3) {
	return (arg0 == 984.51f) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_182(float arg0, int64_t arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519f) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_183(float arg0, int64_t arg1, int arg2, double arg3) {
	return (arg0 == 312.1f) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_184(float arg0, int64_t arg1, float arg2, int arg3) {
	return (arg0 == 651.5619f) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_185(float arg0, int64_t arg1, float arg2, float arg3) {
	return (arg0 == 98.519f) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_186(float arg0, int64_t arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516f) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_187(float arg0, int64_t arg1, float arg2, double arg3) {
	return (arg0 == 6.5f) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_188(float arg0, int64_t arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768f) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_189(float arg0, int64_t arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795f) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_190(float arg0, int64_t arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9f) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_191(float arg0, int64_t arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515f) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_192(float arg0, int64_t arg1, double arg2, int arg3) {
	return (arg0 == 49.6f) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_193(float arg0, int64_t arg1, double arg2, float arg3) {
	return (arg0 == 1919.516f) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_194(float arg0, int64_t arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51f) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_195(float arg0, int64_t arg1, double arg2, double arg3) {
	return (arg0 == 19.651f) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_196(float arg0, double arg1, int arg2, int arg3) {
	return (arg0 == 321.96516f) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_197(float arg0, double arg1, int arg2, float arg3) {
	return (arg0 == 984.51f) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_198(float arg0, double arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519f) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_199(float arg0, double arg1, int arg2, double arg3) {
	return (arg0 == 312.1f) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_200(float arg0, double arg1, float arg2, int arg3) {
	return (arg0 == 651.5619f) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_201(float arg0, double arg1, float arg2, float arg3) {
	return (arg0 == 98.519f) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_202(float arg0, double arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516f) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_203(float arg0, double arg1, float arg2, double arg3) {
	return (arg0 == 6.5f) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_204(float arg0, double arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768f) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_205(float arg0, double arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795f) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_206(float arg0, double arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9f) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_207(float arg0, double arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515f) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_208(float arg0, double arg1, double arg2, int arg3) {
	return (arg0 == 49.6f) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_209(float arg0, double arg1, double arg2, float arg3) {
	return (arg0 == 1919.516f) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_210(float arg0, double arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51f) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_211(float arg0, double arg1, double arg2, double arg3) {
	return (arg0 == 19.651f) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_212(int64_t arg0, int arg1, int arg2, int arg3) {
	return (arg0 == 96516L) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_213(int64_t arg0, int arg1, int arg2, float arg3) {
	return (arg0 == 51L) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_214(int64_t arg0, int arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519L) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_215(int64_t arg0, int arg1, int arg2, double arg3) {
	return (arg0 == 1L) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_216(int64_t arg0, int arg1, float arg2, int arg3) {
	return (arg0 == 5619L) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_217(int64_t arg0, int arg1, float arg2, float arg3) {
	return (arg0 == 519L) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_218(int64_t arg0, int arg1, float arg2, int64_t arg3) {
	return (arg0 == 516L) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_219(int64_t arg0, int arg1, float arg2, double arg3) {
	return (arg0 == 5L) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_220(int64_t arg0, int arg1, int64_t arg2, int arg3) {
	return (arg0 == 768L) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_221(int64_t arg0, int arg1, int64_t arg2, float arg3) {
	return (arg0 == 795L) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_222(int64_t arg0, int arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9L) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_223(int64_t arg0, int arg1, int64_t arg2, double arg3) {
	return (arg0 == 515L) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_224(int64_t arg0, int arg1, double arg2, int arg3) {
	return (arg0 == 6L) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_225(int64_t arg0, int arg1, double arg2, float arg3) {
	return (arg0 == 516L) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_226(int64_t arg0, int arg1, double arg2, int64_t arg3) {
	return (arg0 == 51L) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_227(int64_t arg0, int arg1, double arg2, double arg3) {
	return (arg0 == 651L) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_228(int64_t arg0, float arg1, int arg2, int arg3) {
	return (arg0 == 96516L) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_229(int64_t arg0, float arg1, int arg2, float arg3) {
	return (arg0 == 51L) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_230(int64_t arg0, float arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519L) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_231(int64_t arg0, float arg1, int arg2, double arg3) {
	return (arg0 == 1L) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_232(int64_t arg0, float arg1, float arg2, int arg3) {
	return (arg0 == 5619L) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_233(int64_t arg0, float arg1, float arg2, float arg3) {
	return (arg0 == 519L) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_234(int64_t arg0, float arg1, float arg2, int64_t arg3) {
	return (arg0 == 516L) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_235(int64_t arg0, float arg1, float arg2, double arg3) {
	return (arg0 == 5L) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_236(int64_t arg0, float arg1, int64_t arg2, int arg3) {
	return (arg0 == 768L) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_237(int64_t arg0, float arg1, int64_t arg2, float arg3) {
	return (arg0 == 795L) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_238(int64_t arg0, float arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9L) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_239(int64_t arg0, float arg1, int64_t arg2, double arg3) {
	return (arg0 == 515L) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_240(int64_t arg0, float arg1, double arg2, int arg3) {
	return (arg0 == 6L) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_241(int64_t arg0, float arg1, double arg2, float arg3) {
	return (arg0 == 516L) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_242(int64_t arg0, float arg1, double arg2, int64_t arg3) {
	return (arg0 == 51L) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_243(int64_t arg0, float arg1, double arg2, double arg3) {
	return (arg0 == 651L) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_244(int64_t arg0, int64_t arg1, int arg2, int arg3) {
	return (arg0 == 96516L) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_245(int64_t arg0, int64_t arg1, int arg2, float arg3) {
	return (arg0 == 51L) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_246(int64_t arg0, int64_t arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519L) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_247(int64_t arg0, int64_t arg1, int arg2, double arg3) {
	return (arg0 == 1L) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_248(int64_t arg0, int64_t arg1, float arg2, int arg3) {
	return (arg0 == 5619L) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_249(int64_t arg0, int64_t arg1, float arg2, float arg3) {
	return (arg0 == 519L) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_250(int64_t arg0, int64_t arg1, float arg2, int64_t arg3) {
	return (arg0 == 516L) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_251(int64_t arg0, int64_t arg1, float arg2, double arg3) {
	return (arg0 == 5L) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_252(int64_t arg0, int64_t arg1, int64_t arg2, int arg3) {
	return (arg0 == 768L) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_253(int64_t arg0, int64_t arg1, int64_t arg2, float arg3) {
	return (arg0 == 795L) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_254(int64_t arg0, int64_t arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9L) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_255(int64_t arg0, int64_t arg1, int64_t arg2, double arg3) {
	return (arg0 == 515L) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_256(int64_t arg0, int64_t arg1, double arg2, int arg3) {
	return (arg0 == 6L) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_257(int64_t arg0, int64_t arg1, double arg2, float arg3) {
	return (arg0 == 516L) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_258(int64_t arg0, int64_t arg1, double arg2, int64_t arg3) {
	return (arg0 == 51L) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_259(int64_t arg0, int64_t arg1, double arg2, double arg3) {
	return (arg0 == 651L) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_260(int64_t arg0, double arg1, int arg2, int arg3) {
	return (arg0 == 96516L) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_261(int64_t arg0, double arg1, int arg2, float arg3) {
	return (arg0 == 51L) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_262(int64_t arg0, double arg1, int arg2, int64_t arg3) {
	return (arg0 == 9519L) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_263(int64_t arg0, double arg1, int arg2, double arg3) {
	return (arg0 == 1L) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_264(int64_t arg0, double arg1, float arg2, int arg3) {
	return (arg0 == 5619L) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_265(int64_t arg0, double arg1, float arg2, float arg3) {
	return (arg0 == 519L) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_266(int64_t arg0, double arg1, float arg2, int64_t arg3) {
	return (arg0 == 516L) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_267(int64_t arg0, double arg1, float arg2, double arg3) {
	return (arg0 == 5L) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_268(int64_t arg0, double arg1, int64_t arg2, int arg3) {
	return (arg0 == 768L) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_269(int64_t arg0, double arg1, int64_t arg2, float arg3) {
	return (arg0 == 795L) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_270(int64_t arg0, double arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 9L) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_271(int64_t arg0, double arg1, int64_t arg2, double arg3) {
	return (arg0 == 515L) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_272(int64_t arg0, double arg1, double arg2, int arg3) {
	return (arg0 == 6L) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_273(int64_t arg0, double arg1, double arg2, float arg3) {
	return (arg0 == 516L) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_274(int64_t arg0, double arg1, double arg2, int64_t arg3) {
	return (arg0 == 51L) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_275(int64_t arg0, double arg1, double arg2, double arg3) {
	return (arg0 == 651L) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_276(double arg0, int arg1, int arg2, int arg3) {
	return (arg0 == 321.96516) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_277(double arg0, int arg1, int arg2, float arg3) {
	return (arg0 == 984.51) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_278(double arg0, int arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_279(double arg0, int arg1, int arg2, double arg3) {
	return (arg0 == 312.1) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_280(double arg0, int arg1, float arg2, int arg3) {
	return (arg0 == 651.5619) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_281(double arg0, int arg1, float arg2, float arg3) {
	return (arg0 == 98.519) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_282(double arg0, int arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_283(double arg0, int arg1, float arg2, double arg3) {
	return (arg0 == 6.5) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_284(double arg0, int arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_285(double arg0, int arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_286(double arg0, int arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_287(double arg0, int arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_288(double arg0, int arg1, double arg2, int arg3) {
	return (arg0 == 49.6) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_289(double arg0, int arg1, double arg2, float arg3) {
	return (arg0 == 1919.516) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_290(double arg0, int arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_291(double arg0, int arg1, double arg2, double arg3) {
	return (arg0 == 19.651) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_292(double arg0, float arg1, int arg2, int arg3) {
	return (arg0 == 321.96516) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_293(double arg0, float arg1, int arg2, float arg3) {
	return (arg0 == 984.51) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_294(double arg0, float arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_295(double arg0, float arg1, int arg2, double arg3) {
	return (arg0 == 312.1) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_296(double arg0, float arg1, float arg2, int arg3) {
	return (arg0 == 651.5619) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_297(double arg0, float arg1, float arg2, float arg3) {
	return (arg0 == 98.519) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_298(double arg0, float arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_299(double arg0, float arg1, float arg2, double arg3) {
	return (arg0 == 6.5) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_300(double arg0, float arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_301(double arg0, float arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_302(double arg0, float arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_303(double arg0, float arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_304(double arg0, float arg1, double arg2, int arg3) {
	return (arg0 == 49.6) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_305(double arg0, float arg1, double arg2, float arg3) {
	return (arg0 == 1919.516) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_306(double arg0, float arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_307(double arg0, float arg1, double arg2, double arg3) {
	return (arg0 == 19.651) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_308(double arg0, int64_t arg1, int arg2, int arg3) {
	return (arg0 == 321.96516) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_309(double arg0, int64_t arg1, int arg2, float arg3) {
	return (arg0 == 984.51) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_310(double arg0, int64_t arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_311(double arg0, int64_t arg1, int arg2, double arg3) {
	return (arg0 == 312.1) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_312(double arg0, int64_t arg1, float arg2, int arg3) {
	return (arg0 == 651.5619) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_313(double arg0, int64_t arg1, float arg2, float arg3) {
	return (arg0 == 98.519) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_314(double arg0, int64_t arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_315(double arg0, int64_t arg1, float arg2, double arg3) {
	return (arg0 == 6.5) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_316(double arg0, int64_t arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_317(double arg0, int64_t arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_318(double arg0, int64_t arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_319(double arg0, int64_t arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_320(double arg0, int64_t arg1, double arg2, int arg3) {
	return (arg0 == 49.6) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_321(double arg0, int64_t arg1, double arg2, float arg3) {
	return (arg0 == 1919.516) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_322(double arg0, int64_t arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_323(double arg0, int64_t arg1, double arg2, double arg3) {
	return (arg0 == 19.651) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_324(double arg0, double arg1, int arg2, int arg3) {
	return (arg0 == 321.96516) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1);
}

bool NGInvocation_325(double arg0, double arg1, int arg2, float arg3) {
	return (arg0 == 984.51) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 651.5619f);
}

bool NGInvocation_326(double arg0, double arg1, int arg2, int64_t arg3) {
	return (arg0 == 524.9519) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519L);
}

bool NGInvocation_327(double arg0, double arg1, int arg2, double arg3) {
	return (arg0 == 312.1) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 78.516);
}

bool NGInvocation_328(double arg0, double arg1, float arg2, int arg3) {
	return (arg0 == 651.5619) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 5);
}

bool NGInvocation_329(double arg0, double arg1, float arg2, float arg3) {
	return (arg0 == 98.519) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f);
}

bool NGInvocation_330(double arg0, double arg1, float arg2, int64_t arg3) {
	return (arg0 == 78.516) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 795L);
}

bool NGInvocation_331(double arg0, double arg1, float arg2, double arg3) {
	return (arg0 == 6.5) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9);
}

bool NGInvocation_332(double arg0, double arg1, int64_t arg2, int arg3) {
	return (arg0 == 3654.768) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515);
}

bool NGInvocation_333(double arg0, double arg1, int64_t arg2, float arg3) {
	return (arg0 == 486.795) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 49.6f);
}

bool NGInvocation_334(double arg0, double arg1, int64_t arg2, int64_t arg3) {
	return (arg0 == 165.9) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L);
}

bool NGInvocation_335(double arg0, double arg1, int64_t arg2, double arg3) {
	return (arg0 == 16.515) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 2.51);
}

bool NGInvocation_336(double arg0, double arg1, double arg2, int arg3) {
	return (arg0 == 49.6) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 651);
}

bool NGInvocation_337(double arg0, double arg1, double arg2, float arg3) {
	return (arg0 == 1919.516) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516f);
}

bool NGInvocation_338(double arg0, double arg1, double arg2, int64_t arg3) {
	return (arg0 == 2.51) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 51L);
}

bool NGInvocation_339(double arg0, double arg1, double arg2, double arg3) {
	return (arg0 == 19.651) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519);
}

bool NGInvocation_340(int arg0, int arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_341(int arg0, int arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_342(int arg0, int arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_343(int arg0, int arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_344(int arg0, int arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_345(int arg0, int arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_346(int arg0, int arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_347(int arg0, int arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_348(int arg0, int arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_349(int arg0, int arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_350(int arg0, int arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_351(int arg0, int arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_352(int arg0, int arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_353(int arg0, int arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_354(int arg0, int arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_355(int arg0, int arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_356(int arg0, int arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_357(int arg0, int arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_358(int arg0, int arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_359(int arg0, int arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_360(int arg0, int arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_361(int arg0, int arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_362(int arg0, int arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_363(int arg0, int arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_364(int arg0, int arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_365(int arg0, int arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_366(int arg0, int arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_367(int arg0, int arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_368(int arg0, int arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_369(int arg0, int arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_370(int arg0, int arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_371(int arg0, int arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_372(int arg0, int arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_373(int arg0, int arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_374(int arg0, int arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_375(int arg0, int arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_376(int arg0, int arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_377(int arg0, int arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_378(int arg0, int arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_379(int arg0, int arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_380(int arg0, int arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_381(int arg0, int arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_382(int arg0, int arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_383(int arg0, int arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_384(int arg0, int arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_385(int arg0, int arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_386(int arg0, int arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_387(int arg0, int arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_388(int arg0, int arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_389(int arg0, int arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_390(int arg0, int arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_391(int arg0, int arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_392(int arg0, int arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_393(int arg0, int arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_394(int arg0, int arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_395(int arg0, int arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_396(int arg0, int arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_397(int arg0, int arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_398(int arg0, int arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_399(int arg0, int arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_400(int arg0, int arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_401(int arg0, int arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_402(int arg0, int arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_403(int arg0, int arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_404(int arg0, float arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_405(int arg0, float arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_406(int arg0, float arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_407(int arg0, float arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_408(int arg0, float arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519f) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_409(int arg0, float arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516f) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_410(int arg0, float arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5f) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_411(int arg0, float arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768f) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_412(int arg0, float arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795f) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_413(int arg0, float arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9f) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_414(int arg0, float arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515f) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_415(int arg0, float arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6f) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_416(int arg0, float arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516f) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_417(int arg0, float arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51f) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_418(int arg0, float arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651f) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_419(int arg0, float arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516f) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_420(int arg0, float arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51f) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_421(int arg0, float arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519f) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_422(int arg0, float arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1f) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_423(int arg0, float arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619f) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_424(int arg0, float arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_425(int arg0, float arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_426(int arg0, float arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_427(int arg0, float arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_428(int arg0, float arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795f) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_429(int arg0, float arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9f) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_430(int arg0, float arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515f) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_431(int arg0, float arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6f) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_432(int arg0, float arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516f) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_433(int arg0, float arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51f) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_434(int arg0, float arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651f) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_435(int arg0, float arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516f) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_436(int arg0, float arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51f) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_437(int arg0, float arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519f) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_438(int arg0, float arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1f) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_439(int arg0, float arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619f) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_440(int arg0, float arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519f) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_441(int arg0, float arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516f) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_442(int arg0, float arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5f) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_443(int arg0, float arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768f) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_444(int arg0, float arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_445(int arg0, float arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_446(int arg0, float arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_447(int arg0, float arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_448(int arg0, float arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516f) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_449(int arg0, float arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51f) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_450(int arg0, float arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651f) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_451(int arg0, float arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516f) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_452(int arg0, float arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51f) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_453(int arg0, float arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519f) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_454(int arg0, float arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1f) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_455(int arg0, float arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619f) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_456(int arg0, float arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519f) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_457(int arg0, float arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516f) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_458(int arg0, float arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5f) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_459(int arg0, float arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768f) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_460(int arg0, float arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795f) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_461(int arg0, float arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9f) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_462(int arg0, float arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515f) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_463(int arg0, float arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6f) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_464(int arg0, float arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_465(int arg0, float arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_466(int arg0, float arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_467(int arg0, float arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_468(int arg0, int64_t arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_469(int arg0, int64_t arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_470(int arg0, int64_t arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_471(int arg0, int64_t arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_472(int arg0, int64_t arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519L) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_473(int arg0, int64_t arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516L) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_474(int arg0, int64_t arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5L) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_475(int arg0, int64_t arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768L) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_476(int arg0, int64_t arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795L) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_477(int arg0, int64_t arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9L) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_478(int arg0, int64_t arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515L) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_479(int arg0, int64_t arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6L) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_480(int arg0, int64_t arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516L) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_481(int arg0, int64_t arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51L) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_482(int arg0, int64_t arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651L) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_483(int arg0, int64_t arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516L) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_484(int arg0, int64_t arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51L) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_485(int arg0, int64_t arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519L) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_486(int arg0, int64_t arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1L) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_487(int arg0, int64_t arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619L) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_488(int arg0, int64_t arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_489(int arg0, int64_t arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_490(int arg0, int64_t arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_491(int arg0, int64_t arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_492(int arg0, int64_t arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795L) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_493(int arg0, int64_t arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9L) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_494(int arg0, int64_t arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515L) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_495(int arg0, int64_t arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6L) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_496(int arg0, int64_t arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516L) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_497(int arg0, int64_t arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51L) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_498(int arg0, int64_t arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651L) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_499(int arg0, int64_t arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516L) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_500(int arg0, int64_t arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51L) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_501(int arg0, int64_t arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519L) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_502(int arg0, int64_t arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1L) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_503(int arg0, int64_t arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619L) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_504(int arg0, int64_t arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519L) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_505(int arg0, int64_t arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516L) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_506(int arg0, int64_t arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5L) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_507(int arg0, int64_t arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768L) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_508(int arg0, int64_t arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_509(int arg0, int64_t arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_510(int arg0, int64_t arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_511(int arg0, int64_t arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_512(int arg0, int64_t arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516L) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_513(int arg0, int64_t arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51L) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_514(int arg0, int64_t arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651L) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_515(int arg0, int64_t arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516L) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_516(int arg0, int64_t arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 51L) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_517(int arg0, int64_t arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 9519L) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_518(int arg0, int64_t arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 1L) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_519(int arg0, int64_t arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 5619L) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_520(int arg0, int64_t arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 519L) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_521(int arg0, int64_t arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 516L) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_522(int arg0, int64_t arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 5L) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_523(int arg0, int64_t arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 768L) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_524(int arg0, int64_t arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 795L) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_525(int arg0, int64_t arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 9L) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_526(int arg0, int64_t arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 515L) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_527(int arg0, int64_t arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 6L) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_528(int arg0, int64_t arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_529(int arg0, int64_t arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_530(int arg0, int64_t arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_531(int arg0, int64_t arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_532(int arg0, double arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_533(int arg0, double arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_534(int arg0, double arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_535(int arg0, double arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_536(int arg0, double arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_537(int arg0, double arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_538(int arg0, double arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_539(int arg0, double arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_540(int arg0, double arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_541(int arg0, double arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_542(int arg0, double arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_543(int arg0, double arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_544(int arg0, double arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_545(int arg0, double arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_546(int arg0, double arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_547(int arg0, double arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_548(int arg0, double arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_549(int arg0, double arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_550(int arg0, double arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_551(int arg0, double arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_552(int arg0, double arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_553(int arg0, double arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_554(int arg0, double arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_555(int arg0, double arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_556(int arg0, double arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_557(int arg0, double arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_558(int arg0, double arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_559(int arg0, double arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_560(int arg0, double arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_561(int arg0, double arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_562(int arg0, double arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_563(int arg0, double arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_564(int arg0, double arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_565(int arg0, double arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_566(int arg0, double arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_567(int arg0, double arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_568(int arg0, double arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_569(int arg0, double arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_570(int arg0, double arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_571(int arg0, double arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_572(int arg0, double arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_573(int arg0, double arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_574(int arg0, double arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_575(int arg0, double arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_576(int arg0, double arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_577(int arg0, double arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_578(int arg0, double arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_579(int arg0, double arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_580(int arg0, double arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516) && (arg1 == 984.51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_581(int arg0, double arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51) && (arg1 == 524.9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_582(int arg0, double arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519) && (arg1 == 312.1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_583(int arg0, double arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1) && (arg1 == 651.5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_584(int arg0, double arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619) && (arg1 == 98.519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_585(int arg0, double arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519) && (arg1 == 78.516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_586(int arg0, double arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516) && (arg1 == 6.5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_587(int arg0, double arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5) && (arg1 == 3654.768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_588(int arg0, double arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768) && (arg1 == 486.795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_589(int arg0, double arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795) && (arg1 == 165.9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_590(int arg0, double arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9) && (arg1 == 16.515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_591(int arg0, double arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515) && (arg1 == 49.6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_592(int arg0, double arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_593(int arg0, double arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_594(int arg0, double arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_595(int arg0, double arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_596(float arg0, int arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_597(float arg0, int arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_598(float arg0, int arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_599(float arg0, int arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_600(float arg0, int arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_601(float arg0, int arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_602(float arg0, int arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_603(float arg0, int arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_604(float arg0, int arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_605(float arg0, int arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_606(float arg0, int arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_607(float arg0, int arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_608(float arg0, int arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_609(float arg0, int arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_610(float arg0, int arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_611(float arg0, int arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_612(float arg0, int arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_613(float arg0, int arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_614(float arg0, int arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_615(float arg0, int arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_616(float arg0, int arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_617(float arg0, int arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_618(float arg0, int arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_619(float arg0, int arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_620(float arg0, int arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_621(float arg0, int arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_622(float arg0, int arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_623(float arg0, int arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_624(float arg0, int arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_625(float arg0, int arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_626(float arg0, int arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_627(float arg0, int arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_628(float arg0, int arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_629(float arg0, int arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_630(float arg0, int arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_631(float arg0, int arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_632(float arg0, int arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_633(float arg0, int arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_634(float arg0, int arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_635(float arg0, int arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_636(float arg0, int arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_637(float arg0, int arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_638(float arg0, int arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_639(float arg0, int arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_640(float arg0, int arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_641(float arg0, int arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_642(float arg0, int arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_643(float arg0, int arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_644(float arg0, int arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_645(float arg0, int arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_646(float arg0, int arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_647(float arg0, int arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_648(float arg0, int arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_649(float arg0, int arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_650(float arg0, int arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_651(float arg0, int arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_652(float arg0, int arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_653(float arg0, int arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_654(float arg0, int arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_655(float arg0, int arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_656(float arg0, int arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_657(float arg0, int arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_658(float arg0, int arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_659(float arg0, int arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_660(float arg0, float arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_661(float arg0, float arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_662(float arg0, float arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_663(float arg0, float arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_664(float arg0, float arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519f) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_665(float arg0, float arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516f) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_666(float arg0, float arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5f) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_667(float arg0, float arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768f) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_668(float arg0, float arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795f) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_669(float arg0, float arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9f) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_670(float arg0, float arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515f) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_671(float arg0, float arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6f) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_672(float arg0, float arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516f) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_673(float arg0, float arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51f) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_674(float arg0, float arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651f) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_675(float arg0, float arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516f) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_676(float arg0, float arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51f) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_677(float arg0, float arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519f) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_678(float arg0, float arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1f) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_679(float arg0, float arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619f) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_680(float arg0, float arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_681(float arg0, float arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_682(float arg0, float arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_683(float arg0, float arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_684(float arg0, float arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795f) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_685(float arg0, float arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9f) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_686(float arg0, float arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515f) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_687(float arg0, float arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6f) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_688(float arg0, float arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516f) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_689(float arg0, float arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51f) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_690(float arg0, float arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651f) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_691(float arg0, float arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516f) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_692(float arg0, float arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51f) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_693(float arg0, float arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519f) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_694(float arg0, float arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1f) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_695(float arg0, float arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619f) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_696(float arg0, float arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519f) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_697(float arg0, float arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516f) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_698(float arg0, float arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5f) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_699(float arg0, float arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768f) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_700(float arg0, float arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_701(float arg0, float arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_702(float arg0, float arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_703(float arg0, float arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_704(float arg0, float arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516f) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_705(float arg0, float arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51f) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_706(float arg0, float arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651f) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_707(float arg0, float arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516f) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_708(float arg0, float arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51f) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_709(float arg0, float arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519f) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_710(float arg0, float arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1f) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_711(float arg0, float arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619f) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_712(float arg0, float arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519f) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_713(float arg0, float arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516f) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_714(float arg0, float arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5f) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_715(float arg0, float arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768f) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_716(float arg0, float arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795f) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_717(float arg0, float arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9f) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_718(float arg0, float arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515f) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_719(float arg0, float arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6f) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_720(float arg0, float arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_721(float arg0, float arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_722(float arg0, float arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_723(float arg0, float arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_724(float arg0, int64_t arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_725(float arg0, int64_t arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_726(float arg0, int64_t arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_727(float arg0, int64_t arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_728(float arg0, int64_t arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519L) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_729(float arg0, int64_t arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516L) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_730(float arg0, int64_t arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5L) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_731(float arg0, int64_t arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768L) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_732(float arg0, int64_t arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795L) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_733(float arg0, int64_t arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9L) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_734(float arg0, int64_t arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515L) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_735(float arg0, int64_t arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6L) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_736(float arg0, int64_t arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516L) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_737(float arg0, int64_t arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51L) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_738(float arg0, int64_t arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651L) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_739(float arg0, int64_t arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516L) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_740(float arg0, int64_t arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51L) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_741(float arg0, int64_t arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519L) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_742(float arg0, int64_t arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1L) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_743(float arg0, int64_t arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619L) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_744(float arg0, int64_t arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_745(float arg0, int64_t arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_746(float arg0, int64_t arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_747(float arg0, int64_t arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_748(float arg0, int64_t arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795L) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_749(float arg0, int64_t arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9L) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_750(float arg0, int64_t arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515L) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_751(float arg0, int64_t arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6L) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_752(float arg0, int64_t arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516L) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_753(float arg0, int64_t arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51L) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_754(float arg0, int64_t arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651L) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_755(float arg0, int64_t arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516L) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_756(float arg0, int64_t arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51L) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_757(float arg0, int64_t arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519L) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_758(float arg0, int64_t arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1L) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_759(float arg0, int64_t arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619L) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_760(float arg0, int64_t arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519L) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_761(float arg0, int64_t arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516L) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_762(float arg0, int64_t arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5L) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_763(float arg0, int64_t arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768L) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_764(float arg0, int64_t arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_765(float arg0, int64_t arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_766(float arg0, int64_t arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_767(float arg0, int64_t arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_768(float arg0, int64_t arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516L) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_769(float arg0, int64_t arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51L) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_770(float arg0, int64_t arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651L) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_771(float arg0, int64_t arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516L) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_772(float arg0, int64_t arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 51L) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_773(float arg0, int64_t arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 9519L) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_774(float arg0, int64_t arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 1L) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_775(float arg0, int64_t arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 5619L) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_776(float arg0, int64_t arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 519L) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_777(float arg0, int64_t arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 516L) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_778(float arg0, int64_t arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 5L) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_779(float arg0, int64_t arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 768L) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_780(float arg0, int64_t arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 795L) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_781(float arg0, int64_t arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 9L) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_782(float arg0, int64_t arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 515L) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_783(float arg0, int64_t arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 6L) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_784(float arg0, int64_t arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_785(float arg0, int64_t arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_786(float arg0, int64_t arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_787(float arg0, int64_t arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_788(float arg0, double arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_789(float arg0, double arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_790(float arg0, double arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_791(float arg0, double arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_792(float arg0, double arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_793(float arg0, double arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_794(float arg0, double arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_795(float arg0, double arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_796(float arg0, double arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_797(float arg0, double arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_798(float arg0, double arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_799(float arg0, double arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_800(float arg0, double arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_801(float arg0, double arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_802(float arg0, double arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_803(float arg0, double arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_804(float arg0, double arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_805(float arg0, double arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_806(float arg0, double arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_807(float arg0, double arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_808(float arg0, double arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_809(float arg0, double arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_810(float arg0, double arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_811(float arg0, double arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_812(float arg0, double arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_813(float arg0, double arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_814(float arg0, double arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_815(float arg0, double arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_816(float arg0, double arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_817(float arg0, double arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_818(float arg0, double arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_819(float arg0, double arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_820(float arg0, double arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_821(float arg0, double arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_822(float arg0, double arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_823(float arg0, double arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_824(float arg0, double arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_825(float arg0, double arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_826(float arg0, double arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_827(float arg0, double arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_828(float arg0, double arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_829(float arg0, double arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_830(float arg0, double arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_831(float arg0, double arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_832(float arg0, double arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_833(float arg0, double arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_834(float arg0, double arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_835(float arg0, double arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_836(float arg0, double arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516f) && (arg1 == 984.51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_837(float arg0, double arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51f) && (arg1 == 524.9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_838(float arg0, double arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519f) && (arg1 == 312.1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_839(float arg0, double arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1f) && (arg1 == 651.5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_840(float arg0, double arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619f) && (arg1 == 98.519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_841(float arg0, double arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519f) && (arg1 == 78.516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_842(float arg0, double arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516f) && (arg1 == 6.5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_843(float arg0, double arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5f) && (arg1 == 3654.768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_844(float arg0, double arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768f) && (arg1 == 486.795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_845(float arg0, double arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795f) && (arg1 == 165.9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_846(float arg0, double arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9f) && (arg1 == 16.515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_847(float arg0, double arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515f) && (arg1 == 49.6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_848(float arg0, double arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6f) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_849(float arg0, double arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516f) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_850(float arg0, double arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51f) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_851(float arg0, double arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651f) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_852(int64_t arg0, int arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_853(int64_t arg0, int arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_854(int64_t arg0, int arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_855(int64_t arg0, int arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_856(int64_t arg0, int arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_857(int64_t arg0, int arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_858(int64_t arg0, int arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_859(int64_t arg0, int arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_860(int64_t arg0, int arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_861(int64_t arg0, int arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_862(int64_t arg0, int arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_863(int64_t arg0, int arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_864(int64_t arg0, int arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_865(int64_t arg0, int arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_866(int64_t arg0, int arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_867(int64_t arg0, int arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_868(int64_t arg0, int arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_869(int64_t arg0, int arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_870(int64_t arg0, int arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_871(int64_t arg0, int arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_872(int64_t arg0, int arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_873(int64_t arg0, int arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_874(int64_t arg0, int arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_875(int64_t arg0, int arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_876(int64_t arg0, int arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_877(int64_t arg0, int arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_878(int64_t arg0, int arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_879(int64_t arg0, int arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_880(int64_t arg0, int arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_881(int64_t arg0, int arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_882(int64_t arg0, int arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_883(int64_t arg0, int arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_884(int64_t arg0, int arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_885(int64_t arg0, int arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_886(int64_t arg0, int arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_887(int64_t arg0, int arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_888(int64_t arg0, int arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_889(int64_t arg0, int arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_890(int64_t arg0, int arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_891(int64_t arg0, int arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_892(int64_t arg0, int arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_893(int64_t arg0, int arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_894(int64_t arg0, int arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_895(int64_t arg0, int arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_896(int64_t arg0, int arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_897(int64_t arg0, int arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_898(int64_t arg0, int arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_899(int64_t arg0, int arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_900(int64_t arg0, int arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_901(int64_t arg0, int arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_902(int64_t arg0, int arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_903(int64_t arg0, int arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_904(int64_t arg0, int arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_905(int64_t arg0, int arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_906(int64_t arg0, int arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_907(int64_t arg0, int arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_908(int64_t arg0, int arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_909(int64_t arg0, int arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_910(int64_t arg0, int arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_911(int64_t arg0, int arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_912(int64_t arg0, int arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_913(int64_t arg0, int arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_914(int64_t arg0, int arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_915(int64_t arg0, int arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_916(int64_t arg0, float arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_917(int64_t arg0, float arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_918(int64_t arg0, float arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_919(int64_t arg0, float arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_920(int64_t arg0, float arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519f) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_921(int64_t arg0, float arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516f) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_922(int64_t arg0, float arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5f) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_923(int64_t arg0, float arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768f) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_924(int64_t arg0, float arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795f) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_925(int64_t arg0, float arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9f) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_926(int64_t arg0, float arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515f) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_927(int64_t arg0, float arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6f) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_928(int64_t arg0, float arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516f) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_929(int64_t arg0, float arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51f) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_930(int64_t arg0, float arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651f) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_931(int64_t arg0, float arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516f) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_932(int64_t arg0, float arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51f) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_933(int64_t arg0, float arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519f) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_934(int64_t arg0, float arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1f) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_935(int64_t arg0, float arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619f) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_936(int64_t arg0, float arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_937(int64_t arg0, float arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_938(int64_t arg0, float arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_939(int64_t arg0, float arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_940(int64_t arg0, float arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795f) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_941(int64_t arg0, float arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9f) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_942(int64_t arg0, float arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515f) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_943(int64_t arg0, float arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6f) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_944(int64_t arg0, float arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516f) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_945(int64_t arg0, float arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51f) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_946(int64_t arg0, float arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651f) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_947(int64_t arg0, float arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516f) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_948(int64_t arg0, float arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51f) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_949(int64_t arg0, float arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519f) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_950(int64_t arg0, float arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1f) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_951(int64_t arg0, float arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619f) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_952(int64_t arg0, float arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519f) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_953(int64_t arg0, float arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516f) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_954(int64_t arg0, float arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5f) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_955(int64_t arg0, float arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768f) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_956(int64_t arg0, float arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_957(int64_t arg0, float arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_958(int64_t arg0, float arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_959(int64_t arg0, float arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_960(int64_t arg0, float arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516f) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_961(int64_t arg0, float arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51f) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_962(int64_t arg0, float arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651f) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_963(int64_t arg0, float arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516f) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_964(int64_t arg0, float arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51f) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_965(int64_t arg0, float arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519f) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_966(int64_t arg0, float arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1f) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_967(int64_t arg0, float arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619f) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_968(int64_t arg0, float arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519f) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_969(int64_t arg0, float arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516f) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_970(int64_t arg0, float arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5f) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_971(int64_t arg0, float arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768f) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_972(int64_t arg0, float arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795f) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_973(int64_t arg0, float arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9f) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_974(int64_t arg0, float arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515f) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_975(int64_t arg0, float arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6f) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_976(int64_t arg0, float arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_977(int64_t arg0, float arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_978(int64_t arg0, float arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_979(int64_t arg0, float arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_980(int64_t arg0, int64_t arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_981(int64_t arg0, int64_t arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_982(int64_t arg0, int64_t arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_983(int64_t arg0, int64_t arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_984(int64_t arg0, int64_t arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519L) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_985(int64_t arg0, int64_t arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516L) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_986(int64_t arg0, int64_t arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5L) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_987(int64_t arg0, int64_t arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768L) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_988(int64_t arg0, int64_t arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795L) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_989(int64_t arg0, int64_t arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9L) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_990(int64_t arg0, int64_t arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515L) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_991(int64_t arg0, int64_t arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6L) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_992(int64_t arg0, int64_t arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516L) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_993(int64_t arg0, int64_t arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51L) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_994(int64_t arg0, int64_t arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651L) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_995(int64_t arg0, int64_t arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516L) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_996(int64_t arg0, int64_t arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51L) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_997(int64_t arg0, int64_t arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519L) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_998(int64_t arg0, int64_t arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1L) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_999(int64_t arg0, int64_t arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619L) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1000(int64_t arg0, int64_t arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1001(int64_t arg0, int64_t arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1002(int64_t arg0, int64_t arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1003(int64_t arg0, int64_t arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1004(int64_t arg0, int64_t arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795L) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1005(int64_t arg0, int64_t arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9L) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1006(int64_t arg0, int64_t arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515L) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1007(int64_t arg0, int64_t arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6L) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1008(int64_t arg0, int64_t arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516L) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1009(int64_t arg0, int64_t arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51L) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1010(int64_t arg0, int64_t arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651L) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1011(int64_t arg0, int64_t arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516L) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1012(int64_t arg0, int64_t arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51L) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1013(int64_t arg0, int64_t arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519L) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1014(int64_t arg0, int64_t arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1L) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1015(int64_t arg0, int64_t arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619L) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1016(int64_t arg0, int64_t arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519L) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1017(int64_t arg0, int64_t arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516L) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1018(int64_t arg0, int64_t arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5L) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1019(int64_t arg0, int64_t arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768L) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1020(int64_t arg0, int64_t arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1021(int64_t arg0, int64_t arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1022(int64_t arg0, int64_t arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1023(int64_t arg0, int64_t arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1024(int64_t arg0, int64_t arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516L) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1025(int64_t arg0, int64_t arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51L) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1026(int64_t arg0, int64_t arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651L) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1027(int64_t arg0, int64_t arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516L) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1028(int64_t arg0, int64_t arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 51L) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1029(int64_t arg0, int64_t arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 9519L) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1030(int64_t arg0, int64_t arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 1L) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1031(int64_t arg0, int64_t arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 5619L) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1032(int64_t arg0, int64_t arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 519L) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1033(int64_t arg0, int64_t arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 516L) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1034(int64_t arg0, int64_t arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 5L) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1035(int64_t arg0, int64_t arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 768L) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1036(int64_t arg0, int64_t arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 795L) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1037(int64_t arg0, int64_t arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 9L) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1038(int64_t arg0, int64_t arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 515L) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1039(int64_t arg0, int64_t arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 6L) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1040(int64_t arg0, int64_t arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1041(int64_t arg0, int64_t arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1042(int64_t arg0, int64_t arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1043(int64_t arg0, int64_t arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1044(int64_t arg0, double arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1045(int64_t arg0, double arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1046(int64_t arg0, double arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1047(int64_t arg0, double arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1048(int64_t arg0, double arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1049(int64_t arg0, double arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1050(int64_t arg0, double arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1051(int64_t arg0, double arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1052(int64_t arg0, double arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1053(int64_t arg0, double arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1054(int64_t arg0, double arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1055(int64_t arg0, double arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1056(int64_t arg0, double arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1057(int64_t arg0, double arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1058(int64_t arg0, double arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1059(int64_t arg0, double arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1060(int64_t arg0, double arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1061(int64_t arg0, double arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1062(int64_t arg0, double arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1063(int64_t arg0, double arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1064(int64_t arg0, double arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1065(int64_t arg0, double arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1066(int64_t arg0, double arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1067(int64_t arg0, double arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1068(int64_t arg0, double arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1069(int64_t arg0, double arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1070(int64_t arg0, double arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1071(int64_t arg0, double arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1072(int64_t arg0, double arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1073(int64_t arg0, double arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1074(int64_t arg0, double arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1075(int64_t arg0, double arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1076(int64_t arg0, double arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1077(int64_t arg0, double arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1078(int64_t arg0, double arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1079(int64_t arg0, double arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1080(int64_t arg0, double arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1081(int64_t arg0, double arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1082(int64_t arg0, double arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1083(int64_t arg0, double arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1084(int64_t arg0, double arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1085(int64_t arg0, double arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1086(int64_t arg0, double arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1087(int64_t arg0, double arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1088(int64_t arg0, double arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1089(int64_t arg0, double arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1090(int64_t arg0, double arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1091(int64_t arg0, double arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1092(int64_t arg0, double arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 96516L) && (arg1 == 984.51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1093(int64_t arg0, double arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 51L) && (arg1 == 524.9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1094(int64_t arg0, double arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 9519L) && (arg1 == 312.1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1095(int64_t arg0, double arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 1L) && (arg1 == 651.5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1096(int64_t arg0, double arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 5619L) && (arg1 == 98.519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1097(int64_t arg0, double arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 519L) && (arg1 == 78.516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1098(int64_t arg0, double arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 516L) && (arg1 == 6.5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1099(int64_t arg0, double arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 5L) && (arg1 == 3654.768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1100(int64_t arg0, double arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 768L) && (arg1 == 486.795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1101(int64_t arg0, double arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 795L) && (arg1 == 165.9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1102(int64_t arg0, double arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 9L) && (arg1 == 16.515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1103(int64_t arg0, double arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 515L) && (arg1 == 49.6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1104(int64_t arg0, double arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 6L) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1105(int64_t arg0, double arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 516L) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1106(int64_t arg0, double arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 51L) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1107(int64_t arg0, double arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 651L) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1108(double arg0, int arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1109(double arg0, int arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1110(double arg0, int arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1111(double arg0, int arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1112(double arg0, int arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1113(double arg0, int arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1114(double arg0, int arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1115(double arg0, int arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1116(double arg0, int arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1117(double arg0, int arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1118(double arg0, int arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1119(double arg0, int arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1120(double arg0, int arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1121(double arg0, int arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1122(double arg0, int arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1123(double arg0, int arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1124(double arg0, int arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1125(double arg0, int arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1126(double arg0, int arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1127(double arg0, int arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1128(double arg0, int arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1129(double arg0, int arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1130(double arg0, int arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1131(double arg0, int arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1132(double arg0, int arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1133(double arg0, int arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1134(double arg0, int arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1135(double arg0, int arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1136(double arg0, int arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1137(double arg0, int arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1138(double arg0, int arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1139(double arg0, int arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1140(double arg0, int arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1141(double arg0, int arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1142(double arg0, int arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1143(double arg0, int arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1144(double arg0, int arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1145(double arg0, int arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1146(double arg0, int arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1147(double arg0, int arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1148(double arg0, int arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1149(double arg0, int arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1150(double arg0, int arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1151(double arg0, int arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1152(double arg0, int arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1153(double arg0, int arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1154(double arg0, int arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1155(double arg0, int arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1156(double arg0, int arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1157(double arg0, int arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1158(double arg0, int arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1159(double arg0, int arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1160(double arg0, int arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1161(double arg0, int arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1162(double arg0, int arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1163(double arg0, int arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1164(double arg0, int arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1165(double arg0, int arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1166(double arg0, int arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1167(double arg0, int arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1168(double arg0, int arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1169(double arg0, int arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1170(double arg0, int arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1171(double arg0, int arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1172(double arg0, float arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51f) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1173(double arg0, float arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519f) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1174(double arg0, float arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1f) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1175(double arg0, float arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619f) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1176(double arg0, float arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519f) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1177(double arg0, float arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516f) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1178(double arg0, float arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5f) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1179(double arg0, float arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768f) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1180(double arg0, float arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795f) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1181(double arg0, float arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9f) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1182(double arg0, float arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515f) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1183(double arg0, float arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6f) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1184(double arg0, float arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516f) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1185(double arg0, float arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51f) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1186(double arg0, float arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651f) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1187(double arg0, float arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516f) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1188(double arg0, float arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51f) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1189(double arg0, float arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519f) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1190(double arg0, float arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1f) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1191(double arg0, float arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619f) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1192(double arg0, float arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519f) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1193(double arg0, float arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516f) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1194(double arg0, float arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5f) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1195(double arg0, float arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768f) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1196(double arg0, float arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795f) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1197(double arg0, float arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9f) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1198(double arg0, float arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515f) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1199(double arg0, float arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6f) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1200(double arg0, float arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516f) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1201(double arg0, float arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51f) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1202(double arg0, float arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651f) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1203(double arg0, float arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516f) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1204(double arg0, float arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51f) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1205(double arg0, float arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519f) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1206(double arg0, float arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1f) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1207(double arg0, float arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619f) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1208(double arg0, float arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519f) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1209(double arg0, float arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516f) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1210(double arg0, float arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5f) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1211(double arg0, float arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768f) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1212(double arg0, float arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795f) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1213(double arg0, float arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9f) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1214(double arg0, float arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515f) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1215(double arg0, float arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6f) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1216(double arg0, float arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516f) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1217(double arg0, float arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51f) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1218(double arg0, float arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651f) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1219(double arg0, float arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516f) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1220(double arg0, float arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51f) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1221(double arg0, float arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519f) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1222(double arg0, float arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1f) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1223(double arg0, float arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619f) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1224(double arg0, float arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519f) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1225(double arg0, float arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516f) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1226(double arg0, float arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5f) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1227(double arg0, float arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768f) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1228(double arg0, float arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795f) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1229(double arg0, float arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9f) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1230(double arg0, float arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515f) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1231(double arg0, float arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6f) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1232(double arg0, float arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516f) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1233(double arg0, float arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51f) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1234(double arg0, float arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651f) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1235(double arg0, float arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516f) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1236(double arg0, int64_t arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51L) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1237(double arg0, int64_t arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519L) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1238(double arg0, int64_t arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1L) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1239(double arg0, int64_t arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619L) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1240(double arg0, int64_t arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519L) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1241(double arg0, int64_t arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516L) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1242(double arg0, int64_t arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5L) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1243(double arg0, int64_t arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768L) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1244(double arg0, int64_t arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795L) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1245(double arg0, int64_t arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9L) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1246(double arg0, int64_t arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515L) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1247(double arg0, int64_t arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6L) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1248(double arg0, int64_t arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516L) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1249(double arg0, int64_t arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51L) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1250(double arg0, int64_t arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651L) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1251(double arg0, int64_t arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516L) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1252(double arg0, int64_t arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51L) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1253(double arg0, int64_t arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519L) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1254(double arg0, int64_t arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1L) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1255(double arg0, int64_t arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619L) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1256(double arg0, int64_t arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519L) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1257(double arg0, int64_t arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516L) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1258(double arg0, int64_t arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5L) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1259(double arg0, int64_t arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768L) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1260(double arg0, int64_t arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795L) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1261(double arg0, int64_t arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9L) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1262(double arg0, int64_t arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515L) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1263(double arg0, int64_t arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6L) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1264(double arg0, int64_t arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516L) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1265(double arg0, int64_t arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51L) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1266(double arg0, int64_t arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651L) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1267(double arg0, int64_t arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516L) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1268(double arg0, int64_t arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51L) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1269(double arg0, int64_t arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519L) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1270(double arg0, int64_t arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1L) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1271(double arg0, int64_t arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619L) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1272(double arg0, int64_t arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519L) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1273(double arg0, int64_t arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516L) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1274(double arg0, int64_t arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5L) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1275(double arg0, int64_t arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768L) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1276(double arg0, int64_t arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795L) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1277(double arg0, int64_t arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9L) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1278(double arg0, int64_t arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515L) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1279(double arg0, int64_t arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6L) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1280(double arg0, int64_t arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516L) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1281(double arg0, int64_t arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51L) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1282(double arg0, int64_t arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651L) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1283(double arg0, int64_t arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516L) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1284(double arg0, int64_t arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 51L) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1285(double arg0, int64_t arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 9519L) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1286(double arg0, int64_t arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 1L) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1287(double arg0, int64_t arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 5619L) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1288(double arg0, int64_t arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 519L) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1289(double arg0, int64_t arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 516L) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1290(double arg0, int64_t arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 5L) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1291(double arg0, int64_t arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 768L) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1292(double arg0, int64_t arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 795L) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1293(double arg0, int64_t arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 9L) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1294(double arg0, int64_t arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 515L) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1295(double arg0, int64_t arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 6L) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1296(double arg0, int64_t arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 516L) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1297(double arg0, int64_t arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 51L) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1298(double arg0, int64_t arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 651L) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1299(double arg0, int64_t arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 96516L) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1300(double arg0, double arg1, int arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51) && (arg2 == 9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1301(double arg0, double arg1, int arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519) && (arg2 == 1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1302(double arg0, double arg1, int arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1) && (arg2 == 5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1303(double arg0, double arg1, int arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619) && (arg2 == 519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1304(double arg0, double arg1, int arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519) && (arg2 == 516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1305(double arg0, double arg1, int arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516) && (arg2 == 5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1306(double arg0, double arg1, int arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5) && (arg2 == 768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1307(double arg0, double arg1, int arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768) && (arg2 == 795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1308(double arg0, double arg1, int arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795) && (arg2 == 9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1309(double arg0, double arg1, int arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9) && (arg2 == 515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1310(double arg0, double arg1, int arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515) && (arg2 == 6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1311(double arg0, double arg1, int arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6) && (arg2 == 516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1312(double arg0, double arg1, int arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516) && (arg2 == 51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1313(double arg0, double arg1, int arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51) && (arg2 == 651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1314(double arg0, double arg1, int arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651) && (arg2 == 96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1315(double arg0, double arg1, int arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516) && (arg2 == 51) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1316(double arg0, double arg1, float arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51) && (arg2 == 524.9519f) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1317(double arg0, double arg1, float arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519) && (arg2 == 312.1f) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1318(double arg0, double arg1, float arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1) && (arg2 == 651.5619f) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1319(double arg0, double arg1, float arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619) && (arg2 == 98.519f) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1320(double arg0, double arg1, float arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519) && (arg2 == 78.516f) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1321(double arg0, double arg1, float arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516) && (arg2 == 6.5f) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1322(double arg0, double arg1, float arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5) && (arg2 == 3654.768f) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1323(double arg0, double arg1, float arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768) && (arg2 == 486.795f) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1324(double arg0, double arg1, float arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795) && (arg2 == 165.9f) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1325(double arg0, double arg1, float arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9) && (arg2 == 16.515f) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1326(double arg0, double arg1, float arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515) && (arg2 == 49.6f) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1327(double arg0, double arg1, float arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6) && (arg2 == 1919.516f) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1328(double arg0, double arg1, float arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516) && (arg2 == 2.51f) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1329(double arg0, double arg1, float arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51) && (arg2 == 19.651f) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1330(double arg0, double arg1, float arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651) && (arg2 == 321.96516f) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1331(double arg0, double arg1, float arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516) && (arg2 == 984.51f) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1332(double arg0, double arg1, int64_t arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51) && (arg2 == 9519L) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1333(double arg0, double arg1, int64_t arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519) && (arg2 == 1L) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1334(double arg0, double arg1, int64_t arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1) && (arg2 == 5619L) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1335(double arg0, double arg1, int64_t arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619) && (arg2 == 519L) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1336(double arg0, double arg1, int64_t arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519) && (arg2 == 516L) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1337(double arg0, double arg1, int64_t arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516) && (arg2 == 5L) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1338(double arg0, double arg1, int64_t arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5) && (arg2 == 768L) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1339(double arg0, double arg1, int64_t arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768) && (arg2 == 795L) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1340(double arg0, double arg1, int64_t arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795) && (arg2 == 9L) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1341(double arg0, double arg1, int64_t arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9) && (arg2 == 515L) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1342(double arg0, double arg1, int64_t arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515) && (arg2 == 6L) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1343(double arg0, double arg1, int64_t arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6) && (arg2 == 516L) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1344(double arg0, double arg1, int64_t arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516) && (arg2 == 51L) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1345(double arg0, double arg1, int64_t arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51) && (arg2 == 651L) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1346(double arg0, double arg1, int64_t arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651) && (arg2 == 96516L) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1347(double arg0, double arg1, int64_t arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516) && (arg2 == 51L) && (arg3 == 524.9519) && (arg4 == 312.1);
}

bool NGInvocation_1348(double arg0, double arg1, double arg2, int arg3, int arg4) {
	return (arg0 == 321.96516) && (arg1 == 984.51) && (arg2 == 524.9519) && (arg3 == 1) && (arg4 == 5619);
}

bool NGInvocation_1349(double arg0, double arg1, double arg2, int arg3, float arg4) {
	return (arg0 == 984.51) && (arg1 == 524.9519) && (arg2 == 312.1) && (arg3 == 5619) && (arg4 == 98.519f);
}

bool NGInvocation_1350(double arg0, double arg1, double arg2, int arg3, int64_t arg4) {
	return (arg0 == 524.9519) && (arg1 == 312.1) && (arg2 == 651.5619) && (arg3 == 519) && (arg4 == 516L);
}

bool NGInvocation_1351(double arg0, double arg1, double arg2, int arg3, double arg4) {
	return (arg0 == 312.1) && (arg1 == 651.5619) && (arg2 == 98.519) && (arg3 == 516) && (arg4 == 6.5);
}

bool NGInvocation_1352(double arg0, double arg1, double arg2, float arg3, int arg4) {
	return (arg0 == 651.5619) && (arg1 == 98.519) && (arg2 == 78.516) && (arg3 == 6.5f) && (arg4 == 768);
}

bool NGInvocation_1353(double arg0, double arg1, double arg2, float arg3, float arg4) {
	return (arg0 == 98.519) && (arg1 == 78.516) && (arg2 == 6.5) && (arg3 == 3654.768f) && (arg4 == 486.795f);
}

bool NGInvocation_1354(double arg0, double arg1, double arg2, float arg3, int64_t arg4) {
	return (arg0 == 78.516) && (arg1 == 6.5) && (arg2 == 3654.768) && (arg3 == 486.795f) && (arg4 == 9L);
}

bool NGInvocation_1355(double arg0, double arg1, double arg2, float arg3, double arg4) {
	return (arg0 == 6.5) && (arg1 == 3654.768) && (arg2 == 486.795) && (arg3 == 165.9f) && (arg4 == 16.515);
}

bool NGInvocation_1356(double arg0, double arg1, double arg2, int64_t arg3, int arg4) {
	return (arg0 == 3654.768) && (arg1 == 486.795) && (arg2 == 165.9) && (arg3 == 515L) && (arg4 == 6);
}

bool NGInvocation_1357(double arg0, double arg1, double arg2, int64_t arg3, float arg4) {
	return (arg0 == 486.795) && (arg1 == 165.9) && (arg2 == 16.515) && (arg3 == 6L) && (arg4 == 1919.516f);
}

bool NGInvocation_1358(double arg0, double arg1, double arg2, int64_t arg3, int64_t arg4) {
	return (arg0 == 165.9) && (arg1 == 16.515) && (arg2 == 49.6) && (arg3 == 516L) && (arg4 == 51L);
}

bool NGInvocation_1359(double arg0, double arg1, double arg2, int64_t arg3, double arg4) {
	return (arg0 == 16.515) && (arg1 == 49.6) && (arg2 == 1919.516) && (arg3 == 51L) && (arg4 == 19.651);
}

bool NGInvocation_1360(double arg0, double arg1, double arg2, double arg3, int arg4) {
	return (arg0 == 49.6) && (arg1 == 1919.516) && (arg2 == 2.51) && (arg3 == 19.651) && (arg4 == 96516);
}

bool NGInvocation_1361(double arg0, double arg1, double arg2, double arg3, float arg4) {
	return (arg0 == 1919.516) && (arg1 == 2.51) && (arg2 == 19.651) && (arg3 == 321.96516) && (arg4 == 984.51f);
}

bool NGInvocation_1362(double arg0, double arg1, double arg2, double arg3, int64_t arg4) {
	return (arg0 == 2.51) && (arg1 == 19.651) && (arg2 == 321.96516) && (arg3 == 984.51) && (arg4 == 9519L);
}

bool NGInvocation_1363(double arg0, double arg1, double arg2, double arg3, double arg4) {
	return (arg0 == 19.651) && (arg1 == 321.96516) && (arg2 == 984.51) && (arg3 == 524.9519) && (arg4 == 312.1);
}
