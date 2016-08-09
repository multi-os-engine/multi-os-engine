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

package c.tests.natjgen;

import c.binding.c.Globals;
import org.moe.natj.c.CRuntime;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ptr.VoidPtr;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NatJCallTest {

    @Test
    public void test_NGInvocation_refs4885_0() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method meth = Globals.class.getDeclaredMethod("NGInvocation_refs4885_0", int.class, int.class, int.class, int.class, int.class, VoidPtr.class, int.class);
        Assert.assertEquals(123456789, (int) meth.invoke(null, 0, 0, 0, 0, 0, null, 123456789));
    }

    @Test
    public void test_NGInvocation_refs4885_1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method meth = Globals.class.getDeclaredMethod("NGInvocation_refs4885_1", int.class, int.class, int.class, int.class, int.class, int.class, int.class, VoidPtr.class, float.class);
        Assert.assertEquals(0.123456789f, (float) meth.invoke(null, 0, 0, 0, 0, 0, 0, 0, null, 0.123456789f), 0.0f);
    }

    @Test
    public void test_NGInvocation_ann_arg_0() {
        Assert.assertTrue(Globals.NGInvocation_ann_arg_0((byte) 0xAA, 0x5555555555555555L, (byte) 0xAA));
    }

    @Test
    public void test_NGInvocation_ann_arg_1() {
        Assert.assertTrue(Globals.NGInvocation_ann_arg_1((byte) 0xAA, 0x5555555555555555L, (byte) 0xAA));
    }

    @Test
    public void test_NGInvocation_ann_arg_2() {
        Assert.assertTrue(Globals.NGInvocation_ann_arg_2((byte) 0xAA, 0x5555555555555555L, (byte) 0xAA));
    }

    @Test
    public void test_NGInvocation_ann_arg_3() {
        Assert.assertTrue(Globals.NGInvocation_ann_arg_3((byte) 0xAA, 0x5555555555555555L, (byte) 0xAA));
    }

    @Test
    public void test_NGInvocation_ann_arg_4() {
        Assert.assertTrue(Globals.NGInvocation_ann_arg_4((byte) 0xAA, 0x55555555, (byte) 0xAA));
    }

    @Test
    public void test_NGInvocation_ann_ret_0() {
        final long expected = NatJ.is64Bit() ? 0x5555555555555555L : 0x55555555L;
        Assert.assertEquals(expected, Globals.NGInvocation_ann_ret_0(0xAAAAAAAAAAAAAAAAL));
    }

    @Test
    public void test_NGInvocation_ann_ret_1() {
        final long expected = NatJ.is64Bit() ? 0x5555555555555555L : 0x55555555L;
        Assert.assertEquals(expected, Globals.NGInvocation_ann_ret_1(0xAAAAAAAAAAAAAAAAL));
    }

    @Test
    public void test_NGInvocation_ann_ret_2() {
        final long expected = CRuntime.NATIVE_LONG_SIZE == 8 ? 0x5555555555555555L : 0x55555555L;
        Assert.assertEquals(expected, Globals.NGInvocation_ann_ret_2(0xAAAAAAAAAAAAAAAAL));
    }

    @Test
    public void test_NGInvocation_ann_ret_3() {
        final long expected = CRuntime.NATIVE_LONG_SIZE == 8 ? 0x5555555555555555L : 0x55555555L;
        Assert.assertEquals(expected, Globals.NGInvocation_ann_ret_3(0xAAAAAAAAAAAAAAAAL));
    }

    @Test
    public void test_NGInvocation_ann_ret_4() {
        final long expected = CRuntime.NATIVE_WCHART_SIZE == 4 ? 0x55555555L : 0x5555L;
        Assert.assertEquals(expected, Globals.NGInvocation_ann_ret_4(0xAAAAAAAA));
    }

    @Test
    public void test_NGInvocation_0() {
        Assert.assertTrue(Globals.NGInvocation_0(6));
    }

    @Test
    public void test_NGInvocation_1() {
        Assert.assertTrue(Globals.NGInvocation_1(1919.516f));
    }

    @Test
    public void test_NGInvocation_2() {
        Assert.assertTrue(Globals.NGInvocation_2(51L));
    }

    @Test
    public void test_NGInvocation_3() {
        Assert.assertTrue(Globals.NGInvocation_3(19.651));
    }

    @Test
    public void test_NGInvocation_4() {
        Assert.assertTrue(Globals.NGInvocation_4(96516, 51));
    }

    @Test
    public void test_NGInvocation_5() {
        Assert.assertTrue(Globals.NGInvocation_5(51, 524.9519f));
    }

    @Test
    public void test_NGInvocation_6() {
        Assert.assertTrue(Globals.NGInvocation_6(9519, 1L));
    }

    @Test
    public void test_NGInvocation_7() {
        Assert.assertTrue(Globals.NGInvocation_7(1, 651.5619));
    }

    @Test
    public void test_NGInvocation_8() {
        Assert.assertTrue(Globals.NGInvocation_8(651.5619f, 519));
    }

    @Test
    public void test_NGInvocation_9() {
        Assert.assertTrue(Globals.NGInvocation_9(98.519f, 78.516f));
    }

    @Test
    public void test_NGInvocation_10() {
        Assert.assertTrue(Globals.NGInvocation_10(78.516f, 5L));
    }

    @Test
    public void test_NGInvocation_11() {
        Assert.assertTrue(Globals.NGInvocation_11(6.5f, 3654.768));
    }

    @Test
    public void test_NGInvocation_12() {
        Assert.assertTrue(Globals.NGInvocation_12(768L, 795));
    }

    @Test
    public void test_NGInvocation_13() {
        Assert.assertTrue(Globals.NGInvocation_13(795L, 165.9f));
    }

    @Test
    public void test_NGInvocation_14() {
        Assert.assertTrue(Globals.NGInvocation_14(9L, 515L));
    }

    @Test
    public void test_NGInvocation_15() {
        Assert.assertTrue(Globals.NGInvocation_15(515L, 49.6));
    }

    @Test
    public void test_NGInvocation_16() {
        Assert.assertTrue(Globals.NGInvocation_16(49.6, 516));
    }

    @Test
    public void test_NGInvocation_17() {
        Assert.assertTrue(Globals.NGInvocation_17(1919.516, 2.51f));
    }

    @Test
    public void test_NGInvocation_18() {
        Assert.assertTrue(Globals.NGInvocation_18(2.51, 651L));
    }

    @Test
    public void test_NGInvocation_19() {
        Assert.assertTrue(Globals.NGInvocation_19(19.651, 321.96516));
    }

    @Test
    public void test_NGInvocation_20() {
        Assert.assertTrue(Globals.NGInvocation_20(96516, 51, 9519));
    }

    @Test
    public void test_NGInvocation_21() {
        Assert.assertTrue(Globals.NGInvocation_21(51, 9519, 312.1f));
    }

    @Test
    public void test_NGInvocation_22() {
        Assert.assertTrue(Globals.NGInvocation_22(9519, 1, 5619L));
    }

    @Test
    public void test_NGInvocation_23() {
        Assert.assertTrue(Globals.NGInvocation_23(1, 5619, 98.519));
    }

    @Test
    public void test_NGInvocation_24() {
        Assert.assertTrue(Globals.NGInvocation_24(5619, 98.519f, 516));
    }

    @Test
    public void test_NGInvocation_25() {
        Assert.assertTrue(Globals.NGInvocation_25(519, 78.516f, 6.5f));
    }

    @Test
    public void test_NGInvocation_26() {
        Assert.assertTrue(Globals.NGInvocation_26(516, 6.5f, 768L));
    }

    @Test
    public void test_NGInvocation_27() {
        Assert.assertTrue(Globals.NGInvocation_27(5, 3654.768f, 486.795));
    }

    @Test
    public void test_NGInvocation_28() {
        Assert.assertTrue(Globals.NGInvocation_28(768, 795L, 9));
    }

    @Test
    public void test_NGInvocation_29() {
        Assert.assertTrue(Globals.NGInvocation_29(795, 9L, 16.515f));
    }

    @Test
    public void test_NGInvocation_30() {
        Assert.assertTrue(Globals.NGInvocation_30(9, 515L, 6L));
    }

    @Test
    public void test_NGInvocation_31() {
        Assert.assertTrue(Globals.NGInvocation_31(515, 6L, 1919.516));
    }

    @Test
    public void test_NGInvocation_32() {
        Assert.assertTrue(Globals.NGInvocation_32(6, 1919.516, 51));
    }

    @Test
    public void test_NGInvocation_33() {
        Assert.assertTrue(Globals.NGInvocation_33(516, 2.51, 19.651f));
    }

    @Test
    public void test_NGInvocation_34() {
        Assert.assertTrue(Globals.NGInvocation_34(51, 19.651, 96516L));
    }

    @Test
    public void test_NGInvocation_35() {
        Assert.assertTrue(Globals.NGInvocation_35(651, 321.96516, 984.51));
    }

    @Test
    public void test_NGInvocation_36() {
        Assert.assertTrue(Globals.NGInvocation_36(321.96516f, 51, 9519));
    }

    @Test
    public void test_NGInvocation_37() {
        Assert.assertTrue(Globals.NGInvocation_37(984.51f, 9519, 312.1f));
    }

    @Test
    public void test_NGInvocation_38() {
        Assert.assertTrue(Globals.NGInvocation_38(524.9519f, 1, 5619L));
    }

    @Test
    public void test_NGInvocation_39() {
        Assert.assertTrue(Globals.NGInvocation_39(312.1f, 5619, 98.519));
    }

    @Test
    public void test_NGInvocation_40() {
        Assert.assertTrue(Globals.NGInvocation_40(651.5619f, 98.519f, 516));
    }

    @Test
    public void test_NGInvocation_41() {
        Assert.assertTrue(Globals.NGInvocation_41(98.519f, 78.516f, 6.5f));
    }

    @Test
    public void test_NGInvocation_42() {
        Assert.assertTrue(Globals.NGInvocation_42(78.516f, 6.5f, 768L));
    }

    @Test
    public void test_NGInvocation_43() {
        Assert.assertTrue(Globals.NGInvocation_43(6.5f, 3654.768f, 486.795));
    }

    @Test
    public void test_NGInvocation_44() {
        Assert.assertTrue(Globals.NGInvocation_44(3654.768f, 795L, 9));
    }

    @Test
    public void test_NGInvocation_45() {
        Assert.assertTrue(Globals.NGInvocation_45(486.795f, 9L, 16.515f));
    }

    @Test
    public void test_NGInvocation_46() {
        Assert.assertTrue(Globals.NGInvocation_46(165.9f, 515L, 6L));
    }

    @Test
    public void test_NGInvocation_47() {
        Assert.assertTrue(Globals.NGInvocation_47(16.515f, 6L, 1919.516));
    }

    @Test
    public void test_NGInvocation_48() {
        Assert.assertTrue(Globals.NGInvocation_48(49.6f, 1919.516, 51));
    }

    @Test
    public void test_NGInvocation_49() {
        Assert.assertTrue(Globals.NGInvocation_49(1919.516f, 2.51, 19.651f));
    }

    @Test
    public void test_NGInvocation_50() {
        Assert.assertTrue(Globals.NGInvocation_50(2.51f, 19.651, 96516L));
    }

    @Test
    public void test_NGInvocation_51() {
        Assert.assertTrue(Globals.NGInvocation_51(19.651f, 321.96516, 984.51));
    }

    @Test
    public void test_NGInvocation_52() {
        Assert.assertTrue(Globals.NGInvocation_52(96516L, 51, 9519));
    }

    @Test
    public void test_NGInvocation_53() {
        Assert.assertTrue(Globals.NGInvocation_53(51L, 9519, 312.1f));
    }

    @Test
    public void test_NGInvocation_54() {
        Assert.assertTrue(Globals.NGInvocation_54(9519L, 1, 5619L));
    }

    @Test
    public void test_NGInvocation_55() {
        Assert.assertTrue(Globals.NGInvocation_55(1L, 5619, 98.519));
    }

    @Test
    public void test_NGInvocation_56() {
        Assert.assertTrue(Globals.NGInvocation_56(5619L, 98.519f, 516));
    }

    @Test
    public void test_NGInvocation_57() {
        Assert.assertTrue(Globals.NGInvocation_57(519L, 78.516f, 6.5f));
    }

    @Test
    public void test_NGInvocation_58() {
        Assert.assertTrue(Globals.NGInvocation_58(516L, 6.5f, 768L));
    }

    @Test
    public void test_NGInvocation_59() {
        Assert.assertTrue(Globals.NGInvocation_59(5L, 3654.768f, 486.795));
    }

    @Test
    public void test_NGInvocation_60() {
        Assert.assertTrue(Globals.NGInvocation_60(768L, 795L, 9));
    }

    @Test
    public void test_NGInvocation_61() {
        Assert.assertTrue(Globals.NGInvocation_61(795L, 9L, 16.515f));
    }

    @Test
    public void test_NGInvocation_62() {
        Assert.assertTrue(Globals.NGInvocation_62(9L, 515L, 6L));
    }

    @Test
    public void test_NGInvocation_63() {
        Assert.assertTrue(Globals.NGInvocation_63(515L, 6L, 1919.516));
    }

    @Test
    public void test_NGInvocation_64() {
        Assert.assertTrue(Globals.NGInvocation_64(6L, 1919.516, 51));
    }

    @Test
    public void test_NGInvocation_65() {
        Assert.assertTrue(Globals.NGInvocation_65(516L, 2.51, 19.651f));
    }

    @Test
    public void test_NGInvocation_66() {
        Assert.assertTrue(Globals.NGInvocation_66(51L, 19.651, 96516L));
    }

    @Test
    public void test_NGInvocation_67() {
        Assert.assertTrue(Globals.NGInvocation_67(651L, 321.96516, 984.51));
    }

    @Test
    public void test_NGInvocation_68() {
        Assert.assertTrue(Globals.NGInvocation_68(321.96516, 51, 9519));
    }

    @Test
    public void test_NGInvocation_69() {
        Assert.assertTrue(Globals.NGInvocation_69(984.51, 9519, 312.1f));
    }

    @Test
    public void test_NGInvocation_70() {
        Assert.assertTrue(Globals.NGInvocation_70(524.9519, 1, 5619L));
    }

    @Test
    public void test_NGInvocation_71() {
        Assert.assertTrue(Globals.NGInvocation_71(312.1, 5619, 98.519));
    }

    @Test
    public void test_NGInvocation_72() {
        Assert.assertTrue(Globals.NGInvocation_72(651.5619, 98.519f, 516));
    }

    @Test
    public void test_NGInvocation_73() {
        Assert.assertTrue(Globals.NGInvocation_73(98.519, 78.516f, 6.5f));
    }

    @Test
    public void test_NGInvocation_74() {
        Assert.assertTrue(Globals.NGInvocation_74(78.516, 6.5f, 768L));
    }

    @Test
    public void test_NGInvocation_75() {
        Assert.assertTrue(Globals.NGInvocation_75(6.5, 3654.768f, 486.795));
    }

    @Test
    public void test_NGInvocation_76() {
        Assert.assertTrue(Globals.NGInvocation_76(3654.768, 795L, 9));
    }

    @Test
    public void test_NGInvocation_77() {
        Assert.assertTrue(Globals.NGInvocation_77(486.795, 9L, 16.515f));
    }

    @Test
    public void test_NGInvocation_78() {
        Assert.assertTrue(Globals.NGInvocation_78(165.9, 515L, 6L));
    }

    @Test
    public void test_NGInvocation_79() {
        Assert.assertTrue(Globals.NGInvocation_79(16.515, 6L, 1919.516));
    }

    @Test
    public void test_NGInvocation_80() {
        Assert.assertTrue(Globals.NGInvocation_80(49.6, 1919.516, 51));
    }

    @Test
    public void test_NGInvocation_81() {
        Assert.assertTrue(Globals.NGInvocation_81(1919.516, 2.51, 19.651f));
    }

    @Test
    public void test_NGInvocation_82() {
        Assert.assertTrue(Globals.NGInvocation_82(2.51, 19.651, 96516L));
    }

    @Test
    public void test_NGInvocation_83() {
        Assert.assertTrue(Globals.NGInvocation_83(19.651, 321.96516, 984.51));
    }

    @Test
    public void test_NGInvocation_84() {
        Assert.assertTrue(Globals.NGInvocation_84(96516, 51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_85() {
        Assert.assertTrue(Globals.NGInvocation_85(51, 9519, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_86() {
        Assert.assertTrue(Globals.NGInvocation_86(9519, 1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_87() {
        Assert.assertTrue(Globals.NGInvocation_87(1, 5619, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_88() {
        Assert.assertTrue(Globals.NGInvocation_88(5619, 519, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_89() {
        Assert.assertTrue(Globals.NGInvocation_89(519, 516, 6.5f, 3654.768f));
    }

    @Test
    public void test_NGInvocation_90() {
        Assert.assertTrue(Globals.NGInvocation_90(516, 5, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_91() {
        Assert.assertTrue(Globals.NGInvocation_91(5, 768, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_92() {
        Assert.assertTrue(Globals.NGInvocation_92(768, 795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_93() {
        Assert.assertTrue(Globals.NGInvocation_93(795, 9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_94() {
        Assert.assertTrue(Globals.NGInvocation_94(9, 515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_95() {
        Assert.assertTrue(Globals.NGInvocation_95(515, 6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_96() {
        Assert.assertTrue(Globals.NGInvocation_96(6, 516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_97() {
        Assert.assertTrue(Globals.NGInvocation_97(516, 51, 19.651, 321.96516f));
    }

    @Test
    public void test_NGInvocation_98() {
        Assert.assertTrue(Globals.NGInvocation_98(51, 651, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_99() {
        Assert.assertTrue(Globals.NGInvocation_99(651, 96516, 984.51, 524.9519));
    }

    @Test
    public void test_NGInvocation_100() {
        Assert.assertTrue(Globals.NGInvocation_100(96516, 984.51f, 9519, 1));
    }

    @Test
    public void test_NGInvocation_101() {
        Assert.assertTrue(Globals.NGInvocation_101(51, 524.9519f, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_102() {
        Assert.assertTrue(Globals.NGInvocation_102(9519, 312.1f, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_103() {
        Assert.assertTrue(Globals.NGInvocation_103(1, 651.5619f, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_104() {
        Assert.assertTrue(Globals.NGInvocation_104(5619, 98.519f, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_105() {
        Assert.assertTrue(Globals.NGInvocation_105(519, 78.516f, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_106() {
        Assert.assertTrue(Globals.NGInvocation_106(516, 6.5f, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_107() {
        Assert.assertTrue(Globals.NGInvocation_107(5, 3654.768f, 486.795f,
                165.9));
    }

    @Test
    public void test_NGInvocation_108() {
        Assert.assertTrue(Globals.NGInvocation_108(768, 486.795f, 9L, 515));
    }

    @Test
    public void test_NGInvocation_109() {
        Assert.assertTrue(Globals.NGInvocation_109(795, 165.9f, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_110() {
        Assert.assertTrue(Globals.NGInvocation_110(9, 16.515f, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_111() {
        Assert.assertTrue(Globals.NGInvocation_111(515, 49.6f, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_112() {
        Assert.assertTrue(Globals.NGInvocation_112(6, 1919.516f, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_113() {
        Assert.assertTrue(Globals.NGInvocation_113(516, 2.51f, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_114() {
        Assert.assertTrue(Globals.NGInvocation_114(51, 19.651f, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_115() {
        Assert.assertTrue(Globals.NGInvocation_115(651, 321.96516f, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_116() {
        Assert.assertTrue(Globals.NGInvocation_116(96516, 51L, 9519, 1));
    }

    @Test
    public void test_NGInvocation_117() {
        Assert.assertTrue(Globals.NGInvocation_117(51, 9519L, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_118() {
        Assert.assertTrue(Globals.NGInvocation_118(9519, 1L, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_119() {
        Assert.assertTrue(Globals.NGInvocation_119(1, 5619L, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_120() {
        Assert.assertTrue(Globals.NGInvocation_120(5619, 519L, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_121() {
        Assert.assertTrue(Globals.NGInvocation_121(519, 516L, 6.5f, 3654.768f));
    }

    @Test
    public void test_NGInvocation_122() {
        Assert.assertTrue(Globals.NGInvocation_122(516, 5L, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_123() {
        Assert.assertTrue(Globals.NGInvocation_123(5, 768L, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_124() {
        Assert.assertTrue(Globals.NGInvocation_124(768, 795L, 9L, 515));
    }

    @Test
    public void test_NGInvocation_125() {
        Assert.assertTrue(Globals.NGInvocation_125(795, 9L, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_126() {
        Assert.assertTrue(Globals.NGInvocation_126(9, 515L, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_127() {
        Assert.assertTrue(Globals.NGInvocation_127(515, 6L, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_128() {
        Assert.assertTrue(Globals.NGInvocation_128(6, 516L, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_129() {
        Assert.assertTrue(Globals
                .NGInvocation_129(516, 51L, 19.651, 321.96516f));
    }

    @Test
    public void test_NGInvocation_130() {
        Assert.assertTrue(Globals.NGInvocation_130(51, 651L, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_131() {
        Assert.assertTrue(Globals.NGInvocation_131(651, 96516L, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_132() {
        Assert.assertTrue(Globals.NGInvocation_132(96516, 984.51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_133() {
        Assert.assertTrue(Globals.NGInvocation_133(51, 524.9519, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_134() {
        Assert.assertTrue(Globals.NGInvocation_134(9519, 312.1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_135() {
        Assert.assertTrue(Globals.NGInvocation_135(1, 651.5619, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_136() {
        Assert.assertTrue(Globals.NGInvocation_136(5619, 98.519, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_137() {
        Assert.assertTrue(Globals
                .NGInvocation_137(519, 78.516, 6.5f, 3654.768f));
    }

    @Test
    public void test_NGInvocation_138() {
        Assert.assertTrue(Globals.NGInvocation_138(516, 6.5, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_139() {
        Assert.assertTrue(Globals
                .NGInvocation_139(5, 3654.768, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_140() {
        Assert.assertTrue(Globals.NGInvocation_140(768, 486.795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_141() {
        Assert.assertTrue(Globals.NGInvocation_141(795, 165.9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_142() {
        Assert.assertTrue(Globals.NGInvocation_142(9, 16.515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_143() {
        Assert.assertTrue(Globals.NGInvocation_143(515, 49.6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_144() {
        Assert.assertTrue(Globals.NGInvocation_144(6, 1919.516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_145() {
        Assert.assertTrue(Globals.NGInvocation_145(516, 2.51, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_146() {
        Assert.assertTrue(Globals.NGInvocation_146(51, 19.651, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_147() {
        Assert.assertTrue(Globals.NGInvocation_147(651, 321.96516, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_148() {
        Assert.assertTrue(Globals.NGInvocation_148(321.96516f, 51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_149() {
        Assert.assertTrue(Globals.NGInvocation_149(984.51f, 9519, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_150() {
        Assert.assertTrue(Globals.NGInvocation_150(524.9519f, 1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_151() {
        Assert.assertTrue(Globals.NGInvocation_151(312.1f, 5619, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_152() {
        Assert.assertTrue(Globals.NGInvocation_152(651.5619f, 519, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_153() {
        Assert.assertTrue(Globals.NGInvocation_153(98.519f, 516, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_154() {
        Assert.assertTrue(Globals.NGInvocation_154(78.516f, 5, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_155() {
        Assert.assertTrue(Globals.NGInvocation_155(6.5f, 768, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_156() {
        Assert.assertTrue(Globals.NGInvocation_156(3654.768f, 795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_157() {
        Assert.assertTrue(Globals.NGInvocation_157(486.795f, 9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_158() {
        Assert.assertTrue(Globals.NGInvocation_158(165.9f, 515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_159() {
        Assert.assertTrue(Globals.NGInvocation_159(16.515f, 6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_160() {
        Assert.assertTrue(Globals.NGInvocation_160(49.6f, 516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_161() {
        Assert.assertTrue(Globals.NGInvocation_161(1919.516f, 51, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_162() {
        Assert.assertTrue(Globals.NGInvocation_162(2.51f, 651, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_163() {
        Assert.assertTrue(Globals.NGInvocation_163(19.651f, 96516, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_164() {
        Assert.assertTrue(Globals
                .NGInvocation_164(321.96516f, 984.51f, 9519, 1));
    }

    @Test
    public void test_NGInvocation_165() {
        Assert.assertTrue(Globals.NGInvocation_165(984.51f, 524.9519f, 1,
                651.5619f));
    }

    @Test
    public void test_NGInvocation_166() {
        Assert.assertTrue(Globals.NGInvocation_166(524.9519f, 312.1f, 5619,
                519L));
    }

    @Test
    public void test_NGInvocation_167() {
        Assert.assertTrue(Globals.NGInvocation_167(312.1f, 651.5619f, 519,
                78.516));
    }

    @Test
    public void test_NGInvocation_168() {
        Assert.assertTrue(Globals.NGInvocation_168(651.5619f, 98.519f, 78.516f,
                5));
    }

    @Test
    public void test_NGInvocation_169() {
        Assert.assertTrue(Globals.NGInvocation_169(98.519f, 78.516f, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_170() {
        Assert.assertTrue(Globals.NGInvocation_170(78.516f, 6.5f, 3654.768f,
                795L));
    }

    @Test
    public void test_NGInvocation_171() {
        Assert.assertTrue(Globals.NGInvocation_171(6.5f, 3654.768f, 486.795f,
                165.9));
    }

    @Test
    public void test_NGInvocation_172() {
        Assert.assertTrue(Globals
                .NGInvocation_172(3654.768f, 486.795f, 9L, 515));
    }

    @Test
    public void test_NGInvocation_173() {
        Assert.assertTrue(Globals.NGInvocation_173(486.795f, 165.9f, 515L,
                49.6f));
    }

    @Test
    public void test_NGInvocation_174() {
        Assert.assertTrue(Globals.NGInvocation_174(165.9f, 16.515f, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_175() {
        Assert.assertTrue(Globals.NGInvocation_175(16.515f, 49.6f, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_176() {
        Assert.assertTrue(Globals.NGInvocation_176(49.6f, 1919.516f, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_177() {
        Assert.assertTrue(Globals.NGInvocation_177(1919.516f, 2.51f, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_178() {
        Assert.assertTrue(Globals.NGInvocation_178(2.51f, 19.651f, 321.96516,
                51L));
    }

    @Test
    public void test_NGInvocation_179() {
        Assert.assertTrue(Globals.NGInvocation_179(19.651f, 321.96516f, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_180() {
        Assert.assertTrue(Globals.NGInvocation_180(321.96516f, 51L, 9519, 1));
    }

    @Test
    public void test_NGInvocation_181() {
        Assert.assertTrue(Globals
                .NGInvocation_181(984.51f, 9519L, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_182() {
        Assert.assertTrue(Globals.NGInvocation_182(524.9519f, 1L, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_183() {
        Assert.assertTrue(Globals.NGInvocation_183(312.1f, 5619L, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_184() {
        Assert.assertTrue(Globals.NGInvocation_184(651.5619f, 519L, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_185() {
        Assert.assertTrue(Globals.NGInvocation_185(98.519f, 516L, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_186() {
        Assert.assertTrue(Globals
                .NGInvocation_186(78.516f, 5L, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_187() {
        Assert.assertTrue(Globals.NGInvocation_187(6.5f, 768L, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_188() {
        Assert.assertTrue(Globals.NGInvocation_188(3654.768f, 795L, 9L, 515));
    }

    @Test
    public void test_NGInvocation_189() {
        Assert.assertTrue(Globals.NGInvocation_189(486.795f, 9L, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_190() {
        Assert.assertTrue(Globals.NGInvocation_190(165.9f, 515L, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_191() {
        Assert.assertTrue(Globals.NGInvocation_191(16.515f, 6L, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_192() {
        Assert.assertTrue(Globals.NGInvocation_192(49.6f, 516L, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_193() {
        Assert.assertTrue(Globals.NGInvocation_193(1919.516f, 51L, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_194() {
        Assert.assertTrue(Globals.NGInvocation_194(2.51f, 651L, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_195() {
        Assert.assertTrue(Globals.NGInvocation_195(19.651f, 96516L, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_196() {
        Assert.assertTrue(Globals.NGInvocation_196(321.96516f, 984.51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_197() {
        Assert.assertTrue(Globals.NGInvocation_197(984.51f, 524.9519, 1,
                651.5619f));
    }

    @Test
    public void test_NGInvocation_198() {
        Assert.assertTrue(Globals
                .NGInvocation_198(524.9519f, 312.1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_199() {
        Assert.assertTrue(Globals.NGInvocation_199(312.1f, 651.5619, 519,
                78.516));
    }

    @Test
    public void test_NGInvocation_200() {
        Assert.assertTrue(Globals.NGInvocation_200(651.5619f, 98.519, 78.516f,
                5));
    }

    @Test
    public void test_NGInvocation_201() {
        Assert.assertTrue(Globals.NGInvocation_201(98.519f, 78.516, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_202() {
        Assert.assertTrue(Globals.NGInvocation_202(78.516f, 6.5, 3654.768f,
                795L));
    }

    @Test
    public void test_NGInvocation_203() {
        Assert.assertTrue(Globals.NGInvocation_203(6.5f, 3654.768, 486.795f,
                165.9));
    }

    @Test
    public void test_NGInvocation_204() {
        Assert.assertTrue(Globals.NGInvocation_204(3654.768f, 486.795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_205() {
        Assert.assertTrue(Globals
                .NGInvocation_205(486.795f, 165.9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_206() {
        Assert.assertTrue(Globals.NGInvocation_206(165.9f, 16.515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_207() {
        Assert.assertTrue(Globals.NGInvocation_207(16.515f, 49.6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_208() {
        Assert.assertTrue(Globals.NGInvocation_208(49.6f, 1919.516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_209() {
        Assert.assertTrue(Globals.NGInvocation_209(1919.516f, 2.51, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_210() {
        Assert.assertTrue(Globals.NGInvocation_210(2.51f, 19.651, 321.96516,
                51L));
    }

    @Test
    public void test_NGInvocation_211() {
        Assert.assertTrue(Globals.NGInvocation_211(19.651f, 321.96516, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_212() {
        Assert.assertTrue(Globals.NGInvocation_212(96516L, 51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_213() {
        Assert.assertTrue(Globals.NGInvocation_213(51L, 9519, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_214() {
        Assert.assertTrue(Globals.NGInvocation_214(9519L, 1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_215() {
        Assert.assertTrue(Globals.NGInvocation_215(1L, 5619, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_216() {
        Assert.assertTrue(Globals.NGInvocation_216(5619L, 519, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_217() {
        Assert.assertTrue(Globals.NGInvocation_217(519L, 516, 6.5f, 3654.768f));
    }

    @Test
    public void test_NGInvocation_218() {
        Assert.assertTrue(Globals.NGInvocation_218(516L, 5, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_219() {
        Assert.assertTrue(Globals.NGInvocation_219(5L, 768, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_220() {
        Assert.assertTrue(Globals.NGInvocation_220(768L, 795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_221() {
        Assert.assertTrue(Globals.NGInvocation_221(795L, 9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_222() {
        Assert.assertTrue(Globals.NGInvocation_222(9L, 515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_223() {
        Assert.assertTrue(Globals.NGInvocation_223(515L, 6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_224() {
        Assert.assertTrue(Globals.NGInvocation_224(6L, 516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_225() {
        Assert.assertTrue(Globals
                .NGInvocation_225(516L, 51, 19.651, 321.96516f));
    }

    @Test
    public void test_NGInvocation_226() {
        Assert.assertTrue(Globals.NGInvocation_226(51L, 651, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_227() {
        Assert.assertTrue(Globals.NGInvocation_227(651L, 96516, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_228() {
        Assert.assertTrue(Globals.NGInvocation_228(96516L, 984.51f, 9519, 1));
    }

    @Test
    public void test_NGInvocation_229() {
        Assert.assertTrue(Globals
                .NGInvocation_229(51L, 524.9519f, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_230() {
        Assert.assertTrue(Globals.NGInvocation_230(9519L, 312.1f, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_231() {
        Assert.assertTrue(Globals.NGInvocation_231(1L, 651.5619f, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_232() {
        Assert.assertTrue(Globals.NGInvocation_232(5619L, 98.519f, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_233() {
        Assert.assertTrue(Globals.NGInvocation_233(519L, 78.516f, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_234() {
        Assert.assertTrue(Globals.NGInvocation_234(516L, 6.5f, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_235() {
        Assert.assertTrue(Globals.NGInvocation_235(5L, 3654.768f, 486.795f,
                165.9));
    }

    @Test
    public void test_NGInvocation_236() {
        Assert.assertTrue(Globals.NGInvocation_236(768L, 486.795f, 9L, 515));
    }

    @Test
    public void test_NGInvocation_237() {
        Assert.assertTrue(Globals.NGInvocation_237(795L, 165.9f, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_238() {
        Assert.assertTrue(Globals.NGInvocation_238(9L, 16.515f, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_239() {
        Assert.assertTrue(Globals.NGInvocation_239(515L, 49.6f, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_240() {
        Assert.assertTrue(Globals.NGInvocation_240(6L, 1919.516f, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_241() {
        Assert.assertTrue(Globals.NGInvocation_241(516L, 2.51f, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_242() {
        Assert.assertTrue(Globals
                .NGInvocation_242(51L, 19.651f, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_243() {
        Assert.assertTrue(Globals.NGInvocation_243(651L, 321.96516f, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_244() {
        Assert.assertTrue(Globals.NGInvocation_244(96516L, 51L, 9519, 1));
    }

    @Test
    public void test_NGInvocation_245() {
        Assert.assertTrue(Globals.NGInvocation_245(51L, 9519L, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_246() {
        Assert.assertTrue(Globals.NGInvocation_246(9519L, 1L, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_247() {
        Assert.assertTrue(Globals.NGInvocation_247(1L, 5619L, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_248() {
        Assert.assertTrue(Globals.NGInvocation_248(5619L, 519L, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_249() {
        Assert.assertTrue(Globals.NGInvocation_249(519L, 516L, 6.5f, 3654.768f));
    }

    @Test
    public void test_NGInvocation_250() {
        Assert.assertTrue(Globals.NGInvocation_250(516L, 5L, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_251() {
        Assert.assertTrue(Globals.NGInvocation_251(5L, 768L, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_252() {
        Assert.assertTrue(Globals.NGInvocation_252(768L, 795L, 9L, 515));
    }

    @Test
    public void test_NGInvocation_253() {
        Assert.assertTrue(Globals.NGInvocation_253(795L, 9L, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_254() {
        Assert.assertTrue(Globals.NGInvocation_254(9L, 515L, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_255() {
        Assert.assertTrue(Globals.NGInvocation_255(515L, 6L, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_256() {
        Assert.assertTrue(Globals.NGInvocation_256(6L, 516L, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_257() {
        Assert.assertTrue(Globals.NGInvocation_257(516L, 51L, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_258() {
        Assert.assertTrue(Globals.NGInvocation_258(51L, 651L, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_259() {
        Assert.assertTrue(Globals.NGInvocation_259(651L, 96516L, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_260() {
        Assert.assertTrue(Globals.NGInvocation_260(96516L, 984.51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_261() {
        Assert.assertTrue(Globals.NGInvocation_261(51L, 524.9519, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_262() {
        Assert.assertTrue(Globals.NGInvocation_262(9519L, 312.1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_263() {
        Assert.assertTrue(Globals.NGInvocation_263(1L, 651.5619, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_264() {
        Assert.assertTrue(Globals.NGInvocation_264(5619L, 98.519, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_265() {
        Assert.assertTrue(Globals.NGInvocation_265(519L, 78.516, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_266() {
        Assert.assertTrue(Globals.NGInvocation_266(516L, 6.5, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_267() {
        Assert.assertTrue(Globals.NGInvocation_267(5L, 3654.768, 486.795f,
                165.9));
    }

    @Test
    public void test_NGInvocation_268() {
        Assert.assertTrue(Globals.NGInvocation_268(768L, 486.795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_269() {
        Assert.assertTrue(Globals.NGInvocation_269(795L, 165.9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_270() {
        Assert.assertTrue(Globals.NGInvocation_270(9L, 16.515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_271() {
        Assert.assertTrue(Globals.NGInvocation_271(515L, 49.6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_272() {
        Assert.assertTrue(Globals.NGInvocation_272(6L, 1919.516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_273() {
        Assert.assertTrue(Globals.NGInvocation_273(516L, 2.51, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_274() {
        Assert.assertTrue(Globals.NGInvocation_274(51L, 19.651, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_275() {
        Assert.assertTrue(Globals.NGInvocation_275(651L, 321.96516, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_276() {
        Assert.assertTrue(Globals.NGInvocation_276(321.96516, 51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_277() {
        Assert.assertTrue(Globals.NGInvocation_277(984.51, 9519, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_278() {
        Assert.assertTrue(Globals.NGInvocation_278(524.9519, 1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_279() {
        Assert.assertTrue(Globals.NGInvocation_279(312.1, 5619, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_280() {
        Assert.assertTrue(Globals.NGInvocation_280(651.5619, 519, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_281() {
        Assert.assertTrue(Globals
                .NGInvocation_281(98.519, 516, 6.5f, 3654.768f));
    }

    @Test
    public void test_NGInvocation_282() {
        Assert.assertTrue(Globals.NGInvocation_282(78.516, 5, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_283() {
        Assert.assertTrue(Globals.NGInvocation_283(6.5, 768, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_284() {
        Assert.assertTrue(Globals.NGInvocation_284(3654.768, 795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_285() {
        Assert.assertTrue(Globals.NGInvocation_285(486.795, 9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_286() {
        Assert.assertTrue(Globals.NGInvocation_286(165.9, 515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_287() {
        Assert.assertTrue(Globals.NGInvocation_287(16.515, 6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_288() {
        Assert.assertTrue(Globals.NGInvocation_288(49.6, 516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_289() {
        Assert.assertTrue(Globals.NGInvocation_289(1919.516, 51, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_290() {
        Assert.assertTrue(Globals.NGInvocation_290(2.51, 651, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_291() {
        Assert.assertTrue(Globals.NGInvocation_291(19.651, 96516, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_292() {
        Assert.assertTrue(Globals.NGInvocation_292(321.96516, 984.51f, 9519, 1));
    }

    @Test
    public void test_NGInvocation_293() {
        Assert.assertTrue(Globals.NGInvocation_293(984.51, 524.9519f, 1,
                651.5619f));
    }

    @Test
    public void test_NGInvocation_294() {
        Assert.assertTrue(Globals
                .NGInvocation_294(524.9519, 312.1f, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_295() {
        Assert.assertTrue(Globals.NGInvocation_295(312.1, 651.5619f, 519,
                78.516));
    }

    @Test
    public void test_NGInvocation_296() {
        Assert.assertTrue(Globals.NGInvocation_296(651.5619, 98.519f, 78.516f,
                5));
    }

    @Test
    public void test_NGInvocation_297() {
        Assert.assertTrue(Globals.NGInvocation_297(98.519, 78.516f, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_298() {
        Assert.assertTrue(Globals.NGInvocation_298(78.516, 6.5f, 3654.768f,
                795L));
    }

    @Test
    public void test_NGInvocation_299() {
        Assert.assertTrue(Globals.NGInvocation_299(6.5, 3654.768f, 486.795f,
                165.9));
    }

    @Test
    public void test_NGInvocation_300() {
        Assert.assertTrue(Globals.NGInvocation_300(3654.768, 486.795f, 9L, 515));
    }

    @Test
    public void test_NGInvocation_301() {
        Assert.assertTrue(Globals
                .NGInvocation_301(486.795, 165.9f, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_302() {
        Assert.assertTrue(Globals.NGInvocation_302(165.9, 16.515f, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_303() {
        Assert.assertTrue(Globals.NGInvocation_303(16.515, 49.6f, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_304() {
        Assert.assertTrue(Globals.NGInvocation_304(49.6, 1919.516f, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_305() {
        Assert.assertTrue(Globals.NGInvocation_305(1919.516, 2.51f, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_306() {
        Assert.assertTrue(Globals.NGInvocation_306(2.51, 19.651f, 321.96516,
                51L));
    }

    @Test
    public void test_NGInvocation_307() {
        Assert.assertTrue(Globals.NGInvocation_307(19.651, 321.96516f, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_308() {
        Assert.assertTrue(Globals.NGInvocation_308(321.96516, 51L, 9519, 1));
    }

    @Test
    public void test_NGInvocation_309() {
        Assert.assertTrue(Globals.NGInvocation_309(984.51, 9519L, 1, 651.5619f));
    }

    @Test
    public void test_NGInvocation_310() {
        Assert.assertTrue(Globals.NGInvocation_310(524.9519, 1L, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_311() {
        Assert.assertTrue(Globals.NGInvocation_311(312.1, 5619L, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_312() {
        Assert.assertTrue(Globals.NGInvocation_312(651.5619, 519L, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_313() {
        Assert.assertTrue(Globals.NGInvocation_313(98.519, 516L, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_314() {
        Assert.assertTrue(Globals.NGInvocation_314(78.516, 5L, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_315() {
        Assert.assertTrue(Globals.NGInvocation_315(6.5, 768L, 486.795f, 165.9));
    }

    @Test
    public void test_NGInvocation_316() {
        Assert.assertTrue(Globals.NGInvocation_316(3654.768, 795L, 9L, 515));
    }

    @Test
    public void test_NGInvocation_317() {
        Assert.assertTrue(Globals.NGInvocation_317(486.795, 9L, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_318() {
        Assert.assertTrue(Globals.NGInvocation_318(165.9, 515L, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_319() {
        Assert.assertTrue(Globals.NGInvocation_319(16.515, 6L, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_320() {
        Assert.assertTrue(Globals.NGInvocation_320(49.6, 516L, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_321() {
        Assert.assertTrue(Globals.NGInvocation_321(1919.516, 51L, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_322() {
        Assert.assertTrue(Globals.NGInvocation_322(2.51, 651L, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_323() {
        Assert.assertTrue(Globals.NGInvocation_323(19.651, 96516L, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_324() {
        Assert.assertTrue(Globals.NGInvocation_324(321.96516, 984.51, 9519, 1));
    }

    @Test
    public void test_NGInvocation_325() {
        Assert.assertTrue(Globals.NGInvocation_325(984.51, 524.9519, 1,
                651.5619f));
    }

    @Test
    public void test_NGInvocation_326() {
        Assert.assertTrue(Globals.NGInvocation_326(524.9519, 312.1, 5619, 519L));
    }

    @Test
    public void test_NGInvocation_327() {
        Assert.assertTrue(Globals
                .NGInvocation_327(312.1, 651.5619, 519, 78.516));
    }

    @Test
    public void test_NGInvocation_328() {
        Assert.assertTrue(Globals
                .NGInvocation_328(651.5619, 98.519, 78.516f, 5));
    }

    @Test
    public void test_NGInvocation_329() {
        Assert.assertTrue(Globals.NGInvocation_329(98.519, 78.516, 6.5f,
                3654.768f));
    }

    @Test
    public void test_NGInvocation_330() {
        Assert.assertTrue(Globals
                .NGInvocation_330(78.516, 6.5, 3654.768f, 795L));
    }

    @Test
    public void test_NGInvocation_331() {
        Assert.assertTrue(Globals.NGInvocation_331(6.5, 3654.768, 486.795f,
                165.9));
    }

    @Test
    public void test_NGInvocation_332() {
        Assert.assertTrue(Globals.NGInvocation_332(3654.768, 486.795, 9L, 515));
    }

    @Test
    public void test_NGInvocation_333() {
        Assert.assertTrue(Globals.NGInvocation_333(486.795, 165.9, 515L, 49.6f));
    }

    @Test
    public void test_NGInvocation_334() {
        Assert.assertTrue(Globals.NGInvocation_334(165.9, 16.515, 6L, 516L));
    }

    @Test
    public void test_NGInvocation_335() {
        Assert.assertTrue(Globals.NGInvocation_335(16.515, 49.6, 516L, 2.51));
    }

    @Test
    public void test_NGInvocation_336() {
        Assert.assertTrue(Globals.NGInvocation_336(49.6, 1919.516, 2.51, 651));
    }

    @Test
    public void test_NGInvocation_337() {
        Assert.assertTrue(Globals.NGInvocation_337(1919.516, 2.51, 19.651,
                321.96516f));
    }

    @Test
    public void test_NGInvocation_338() {
        Assert.assertTrue(Globals
                .NGInvocation_338(2.51, 19.651, 321.96516, 51L));
    }

    @Test
    public void test_NGInvocation_339() {
        Assert.assertTrue(Globals.NGInvocation_339(19.651, 321.96516, 984.51,
                524.9519));
    }

    @Test
    public void test_NGInvocation_340() {
        Assert.assertTrue(Globals.NGInvocation_340(96516, 51, 9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_341() {
        Assert.assertTrue(Globals.NGInvocation_341(51, 9519, 1, 5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_342() {
        Assert.assertTrue(Globals.NGInvocation_342(9519, 1, 5619, 519, 516L));
    }

    @Test
    public void test_NGInvocation_343() {
        Assert.assertTrue(Globals.NGInvocation_343(1, 5619, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_344() {
        Assert.assertTrue(Globals.NGInvocation_344(5619, 519, 516, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_345() {
        Assert.assertTrue(Globals.NGInvocation_345(519, 516, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_346() {
        Assert.assertTrue(Globals.NGInvocation_346(516, 5, 768, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_347() {
        Assert.assertTrue(Globals.NGInvocation_347(5, 768, 795, 165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_348() {
        Assert.assertTrue(Globals.NGInvocation_348(768, 795, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_349() {
        Assert.assertTrue(Globals.NGInvocation_349(795, 9, 515, 6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_350() {
        Assert.assertTrue(Globals.NGInvocation_350(9, 515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_351() {
        Assert.assertTrue(Globals.NGInvocation_351(515, 6, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_352() {
        Assert.assertTrue(Globals.NGInvocation_352(6, 516, 51, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_353() {
        Assert.assertTrue(Globals.NGInvocation_353(516, 51, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_354() {
        Assert.assertTrue(Globals.NGInvocation_354(51, 651, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_355() {
        Assert.assertTrue(Globals.NGInvocation_355(651, 96516, 51, 524.9519,
                312.1));
    }

    @Test
    public void test_NGInvocation_356() {
        Assert.assertTrue(Globals.NGInvocation_356(96516, 51, 524.9519f, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_357() {
        Assert.assertTrue(Globals.NGInvocation_357(51, 9519, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_358() {
        Assert.assertTrue(Globals.NGInvocation_358(9519, 1, 651.5619f, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_359() {
        Assert.assertTrue(Globals.NGInvocation_359(1, 5619, 98.519f, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_360() {
        Assert.assertTrue(Globals.NGInvocation_360(5619, 519, 78.516f, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_361() {
        Assert.assertTrue(Globals.NGInvocation_361(519, 516, 6.5f, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_362() {
        Assert.assertTrue(Globals.NGInvocation_362(516, 5, 3654.768f, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_363() {
        Assert.assertTrue(Globals.NGInvocation_363(5, 768, 486.795f, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_364() {
        Assert.assertTrue(Globals.NGInvocation_364(768, 795, 165.9f, 515L, 6));
    }

    @Test
    public void test_NGInvocation_365() {
        Assert.assertTrue(Globals.NGInvocation_365(795, 9, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_366() {
        Assert.assertTrue(Globals.NGInvocation_366(9, 515, 49.6f, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_367() {
        Assert.assertTrue(Globals.NGInvocation_367(515, 6, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_368() {
        Assert.assertTrue(Globals
                .NGInvocation_368(6, 516, 2.51f, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_369() {
        Assert.assertTrue(Globals.NGInvocation_369(516, 51, 19.651f, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_370() {
        Assert.assertTrue(Globals.NGInvocation_370(51, 651, 321.96516f, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_371() {
        Assert.assertTrue(Globals.NGInvocation_371(651, 96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_372() {
        Assert.assertTrue(Globals.NGInvocation_372(96516, 51, 9519L, 1, 5619));
    }

    @Test
    public void test_NGInvocation_373() {
        Assert.assertTrue(Globals.NGInvocation_373(51, 9519, 1L, 5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_374() {
        Assert.assertTrue(Globals.NGInvocation_374(9519, 1, 5619L, 519, 516L));
    }

    @Test
    public void test_NGInvocation_375() {
        Assert.assertTrue(Globals.NGInvocation_375(1, 5619, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_376() {
        Assert.assertTrue(Globals.NGInvocation_376(5619, 519, 516L, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_377() {
        Assert.assertTrue(Globals.NGInvocation_377(519, 516, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_378() {
        Assert.assertTrue(Globals.NGInvocation_378(516, 5, 768L, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_379() {
        Assert.assertTrue(Globals
                .NGInvocation_379(5, 768, 795L, 165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_380() {
        Assert.assertTrue(Globals.NGInvocation_380(768, 795, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_381() {
        Assert.assertTrue(Globals.NGInvocation_381(795, 9, 515L, 6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_382() {
        Assert.assertTrue(Globals.NGInvocation_382(9, 515, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_383() {
        Assert.assertTrue(Globals.NGInvocation_383(515, 6, 516L, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_384() {
        Assert.assertTrue(Globals.NGInvocation_384(6, 516, 51L, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_385() {
        Assert.assertTrue(Globals.NGInvocation_385(516, 51, 651L, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_386() {
        Assert.assertTrue(Globals.NGInvocation_386(51, 651, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_387() {
        Assert.assertTrue(Globals.NGInvocation_387(651, 96516, 51L, 524.9519,
                312.1));
    }

    @Test
    public void test_NGInvocation_388() {
        Assert.assertTrue(Globals
                .NGInvocation_388(96516, 51, 524.9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_389() {
        Assert.assertTrue(Globals.NGInvocation_389(51, 9519, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_390() {
        Assert.assertTrue(Globals
                .NGInvocation_390(9519, 1, 651.5619, 519, 516L));
    }

    @Test
    public void test_NGInvocation_391() {
        Assert.assertTrue(Globals.NGInvocation_391(1, 5619, 98.519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_392() {
        Assert.assertTrue(Globals
                .NGInvocation_392(5619, 519, 78.516, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_393() {
        Assert.assertTrue(Globals.NGInvocation_393(519, 516, 6.5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_394() {
        Assert.assertTrue(Globals.NGInvocation_394(516, 5, 3654.768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_395() {
        Assert.assertTrue(Globals.NGInvocation_395(5, 768, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_396() {
        Assert.assertTrue(Globals.NGInvocation_396(768, 795, 165.9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_397() {
        Assert.assertTrue(Globals.NGInvocation_397(795, 9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_398() {
        Assert.assertTrue(Globals.NGInvocation_398(9, 515, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_399() {
        Assert.assertTrue(Globals.NGInvocation_399(515, 6, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_400() {
        Assert.assertTrue(Globals.NGInvocation_400(6, 516, 2.51, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_401() {
        Assert.assertTrue(Globals.NGInvocation_401(516, 51, 19.651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_402() {
        Assert.assertTrue(Globals.NGInvocation_402(51, 651, 321.96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_403() {
        Assert.assertTrue(Globals.NGInvocation_403(651, 96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_404() {
        Assert.assertTrue(Globals.NGInvocation_404(96516, 984.51f, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_405() {
        Assert.assertTrue(Globals.NGInvocation_405(51, 524.9519f, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_406() {
        Assert.assertTrue(Globals.NGInvocation_406(9519, 312.1f, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_407() {
        Assert.assertTrue(Globals.NGInvocation_407(1, 651.5619f, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_408() {
        Assert.assertTrue(Globals.NGInvocation_408(5619, 98.519f, 516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_409() {
        Assert.assertTrue(Globals.NGInvocation_409(519, 78.516f, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_410() {
        Assert.assertTrue(Globals
                .NGInvocation_410(516, 6.5f, 768, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_411() {
        Assert.assertTrue(Globals.NGInvocation_411(5, 3654.768f, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_412() {
        Assert.assertTrue(Globals.NGInvocation_412(768, 486.795f, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_413() {
        Assert.assertTrue(Globals.NGInvocation_413(795, 165.9f, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_414() {
        Assert.assertTrue(Globals.NGInvocation_414(9, 16.515f, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_415() {
        Assert.assertTrue(Globals
                .NGInvocation_415(515, 49.6f, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_416() {
        Assert.assertTrue(Globals.NGInvocation_416(6, 1919.516f, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_417() {
        Assert.assertTrue(Globals.NGInvocation_417(516, 2.51f, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_418() {
        Assert.assertTrue(Globals.NGInvocation_418(51, 19.651f, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_419() {
        Assert.assertTrue(Globals.NGInvocation_419(651, 321.96516f, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_420() {
        Assert.assertTrue(Globals.NGInvocation_420(96516, 984.51f, 524.9519f,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_421() {
        Assert.assertTrue(Globals.NGInvocation_421(51, 524.9519f, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_422() {
        Assert.assertTrue(Globals.NGInvocation_422(9519, 312.1f, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_423() {
        Assert.assertTrue(Globals.NGInvocation_423(1, 651.5619f, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_424() {
        Assert.assertTrue(Globals.NGInvocation_424(5619, 98.519f, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_425() {
        Assert.assertTrue(Globals.NGInvocation_425(519, 78.516f, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_426() {
        Assert.assertTrue(Globals.NGInvocation_426(516, 6.5f, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_427() {
        Assert.assertTrue(Globals.NGInvocation_427(5, 3654.768f, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_428() {
        Assert.assertTrue(Globals.NGInvocation_428(768, 486.795f, 165.9f, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_429() {
        Assert.assertTrue(Globals.NGInvocation_429(795, 165.9f, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_430() {
        Assert.assertTrue(Globals
                .NGInvocation_430(9, 16.515f, 49.6f, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_431() {
        Assert.assertTrue(Globals.NGInvocation_431(515, 49.6f, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_432() {
        Assert.assertTrue(Globals.NGInvocation_432(6, 1919.516f, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_433() {
        Assert.assertTrue(Globals.NGInvocation_433(516, 2.51f, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_434() {
        Assert.assertTrue(Globals.NGInvocation_434(51, 19.651f, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_435() {
        Assert.assertTrue(Globals.NGInvocation_435(651, 321.96516f, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_436() {
        Assert.assertTrue(Globals.NGInvocation_436(96516, 984.51f, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_437() {
        Assert.assertTrue(Globals.NGInvocation_437(51, 524.9519f, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_438() {
        Assert.assertTrue(Globals.NGInvocation_438(9519, 312.1f, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_439() {
        Assert.assertTrue(Globals
                .NGInvocation_439(1, 651.5619f, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_440() {
        Assert.assertTrue(Globals.NGInvocation_440(5619, 98.519f, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_441() {
        Assert.assertTrue(Globals.NGInvocation_441(519, 78.516f, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_442() {
        Assert.assertTrue(Globals.NGInvocation_442(516, 6.5f, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_443() {
        Assert.assertTrue(Globals.NGInvocation_443(5, 3654.768f, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_444() {
        Assert.assertTrue(Globals.NGInvocation_444(768, 486.795f, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_445() {
        Assert.assertTrue(Globals.NGInvocation_445(795, 165.9f, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_446() {
        Assert.assertTrue(Globals.NGInvocation_446(9, 16.515f, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_447() {
        Assert.assertTrue(Globals.NGInvocation_447(515, 49.6f, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_448() {
        Assert.assertTrue(Globals.NGInvocation_448(6, 1919.516f, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_449() {
        Assert.assertTrue(Globals.NGInvocation_449(516, 2.51f, 651L, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_450() {
        Assert.assertTrue(Globals.NGInvocation_450(51, 19.651f, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_451() {
        Assert.assertTrue(Globals.NGInvocation_451(651, 321.96516f, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_452() {
        Assert.assertTrue(Globals.NGInvocation_452(96516, 984.51f, 524.9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_453() {
        Assert.assertTrue(Globals.NGInvocation_453(51, 524.9519f, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_454() {
        Assert.assertTrue(Globals.NGInvocation_454(9519, 312.1f, 651.5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_455() {
        Assert.assertTrue(Globals.NGInvocation_455(1, 651.5619f, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_456() {
        Assert.assertTrue(Globals.NGInvocation_456(5619, 98.519f, 78.516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_457() {
        Assert.assertTrue(Globals.NGInvocation_457(519, 78.516f, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_458() {
        Assert.assertTrue(Globals.NGInvocation_458(516, 6.5f, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_459() {
        Assert.assertTrue(Globals.NGInvocation_459(5, 3654.768f, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_460() {
        Assert.assertTrue(Globals.NGInvocation_460(768, 486.795f, 165.9, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_461() {
        Assert.assertTrue(Globals.NGInvocation_461(795, 165.9f, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_462() {
        Assert.assertTrue(Globals.NGInvocation_462(9, 16.515f, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_463() {
        Assert.assertTrue(Globals.NGInvocation_463(515, 49.6f, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_464() {
        Assert.assertTrue(Globals.NGInvocation_464(6, 1919.516f, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_465() {
        Assert.assertTrue(Globals.NGInvocation_465(516, 2.51f, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_466() {
        Assert.assertTrue(Globals.NGInvocation_466(51, 19.651f, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_467() {
        Assert.assertTrue(Globals.NGInvocation_467(651, 321.96516f, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_468() {
        Assert.assertTrue(Globals.NGInvocation_468(96516, 51L, 9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_469() {
        Assert.assertTrue(Globals.NGInvocation_469(51, 9519L, 1, 5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_470() {
        Assert.assertTrue(Globals.NGInvocation_470(9519, 1L, 5619, 519, 516L));
    }

    @Test
    public void test_NGInvocation_471() {
        Assert.assertTrue(Globals.NGInvocation_471(1, 5619L, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_472() {
        Assert.assertTrue(Globals.NGInvocation_472(5619, 519L, 516, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_473() {
        Assert.assertTrue(Globals.NGInvocation_473(519, 516L, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_474() {
        Assert.assertTrue(Globals.NGInvocation_474(516, 5L, 768, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_475() {
        Assert.assertTrue(Globals
                .NGInvocation_475(5, 768L, 795, 165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_476() {
        Assert.assertTrue(Globals.NGInvocation_476(768, 795L, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_477() {
        Assert.assertTrue(Globals.NGInvocation_477(795, 9L, 515, 6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_478() {
        Assert.assertTrue(Globals.NGInvocation_478(9, 515L, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_479() {
        Assert.assertTrue(Globals.NGInvocation_479(515, 6L, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_480() {
        Assert.assertTrue(Globals.NGInvocation_480(6, 516L, 51, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_481() {
        Assert.assertTrue(Globals.NGInvocation_481(516, 51L, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_482() {
        Assert.assertTrue(Globals.NGInvocation_482(51, 651L, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_483() {
        Assert.assertTrue(Globals.NGInvocation_483(651, 96516L, 51, 524.9519,
                312.1));
    }

    @Test
    public void test_NGInvocation_484() {
        Assert.assertTrue(Globals.NGInvocation_484(96516, 51L, 524.9519f, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_485() {
        Assert.assertTrue(Globals.NGInvocation_485(51, 9519L, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_486() {
        Assert.assertTrue(Globals.NGInvocation_486(9519, 1L, 651.5619f, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_487() {
        Assert.assertTrue(Globals.NGInvocation_487(1, 5619L, 98.519f, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_488() {
        Assert.assertTrue(Globals.NGInvocation_488(5619, 519L, 78.516f, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_489() {
        Assert.assertTrue(Globals.NGInvocation_489(519, 516L, 6.5f, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_490() {
        Assert.assertTrue(Globals.NGInvocation_490(516, 5L, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_491() {
        Assert.assertTrue(Globals.NGInvocation_491(5, 768L, 486.795f, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_492() {
        Assert.assertTrue(Globals.NGInvocation_492(768, 795L, 165.9f, 515L, 6));
    }

    @Test
    public void test_NGInvocation_493() {
        Assert.assertTrue(Globals.NGInvocation_493(795, 9L, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_494() {
        Assert.assertTrue(Globals.NGInvocation_494(9, 515L, 49.6f, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_495() {
        Assert.assertTrue(Globals.NGInvocation_495(515, 6L, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_496() {
        Assert.assertTrue(Globals.NGInvocation_496(6, 516L, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_497() {
        Assert.assertTrue(Globals.NGInvocation_497(516, 51L, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_498() {
        Assert.assertTrue(Globals.NGInvocation_498(51, 651L, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_499() {
        Assert.assertTrue(Globals.NGInvocation_499(651, 96516L, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_500() {
        Assert.assertTrue(Globals.NGInvocation_500(96516, 51L, 9519L, 1, 5619));
    }

    @Test
    public void test_NGInvocation_501() {
        Assert.assertTrue(Globals
                .NGInvocation_501(51, 9519L, 1L, 5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_502() {
        Assert.assertTrue(Globals.NGInvocation_502(9519, 1L, 5619L, 519, 516L));
    }

    @Test
    public void test_NGInvocation_503() {
        Assert.assertTrue(Globals.NGInvocation_503(1, 5619L, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_504() {
        Assert.assertTrue(Globals.NGInvocation_504(5619, 519L, 516L, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_505() {
        Assert.assertTrue(Globals.NGInvocation_505(519, 516L, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_506() {
        Assert.assertTrue(Globals.NGInvocation_506(516, 5L, 768L, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_507() {
        Assert.assertTrue(Globals.NGInvocation_507(5, 768L, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_508() {
        Assert.assertTrue(Globals.NGInvocation_508(768, 795L, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_509() {
        Assert.assertTrue(Globals
                .NGInvocation_509(795, 9L, 515L, 6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_510() {
        Assert.assertTrue(Globals.NGInvocation_510(9, 515L, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_511() {
        Assert.assertTrue(Globals.NGInvocation_511(515, 6L, 516L, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_512() {
        Assert.assertTrue(Globals.NGInvocation_512(6, 516L, 51L, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_513() {
        Assert.assertTrue(Globals.NGInvocation_513(516, 51L, 651L, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_514() {
        Assert.assertTrue(Globals.NGInvocation_514(51, 651L, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_515() {
        Assert.assertTrue(Globals.NGInvocation_515(651, 96516L, 51L, 524.9519,
                312.1));
    }

    @Test
    public void test_NGInvocation_516() {
        Assert.assertTrue(Globals.NGInvocation_516(96516, 51L, 524.9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_517() {
        Assert.assertTrue(Globals.NGInvocation_517(51, 9519L, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_518() {
        Assert.assertTrue(Globals.NGInvocation_518(9519, 1L, 651.5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_519() {
        Assert.assertTrue(Globals.NGInvocation_519(1, 5619L, 98.519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_520() {
        Assert.assertTrue(Globals.NGInvocation_520(5619, 519L, 78.516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_521() {
        Assert.assertTrue(Globals.NGInvocation_521(519, 516L, 6.5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_522() {
        Assert.assertTrue(Globals.NGInvocation_522(516, 5L, 3654.768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_523() {
        Assert.assertTrue(Globals.NGInvocation_523(5, 768L, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_524() {
        Assert.assertTrue(Globals.NGInvocation_524(768, 795L, 165.9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_525() {
        Assert.assertTrue(Globals.NGInvocation_525(795, 9L, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_526() {
        Assert.assertTrue(Globals.NGInvocation_526(9, 515L, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_527() {
        Assert.assertTrue(Globals.NGInvocation_527(515, 6L, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_528() {
        Assert.assertTrue(Globals
                .NGInvocation_528(6, 516L, 2.51, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_529() {
        Assert.assertTrue(Globals.NGInvocation_529(516, 51L, 19.651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_530() {
        Assert.assertTrue(Globals.NGInvocation_530(51, 651L, 321.96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_531() {
        Assert.assertTrue(Globals.NGInvocation_531(651, 96516L, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_532() {
        Assert.assertTrue(Globals
                .NGInvocation_532(96516, 984.51, 9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_533() {
        Assert.assertTrue(Globals.NGInvocation_533(51, 524.9519, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_534() {
        Assert.assertTrue(Globals
                .NGInvocation_534(9519, 312.1, 5619, 519, 516L));
    }

    @Test
    public void test_NGInvocation_535() {
        Assert.assertTrue(Globals.NGInvocation_535(1, 651.5619, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_536() {
        Assert.assertTrue(Globals
                .NGInvocation_536(5619, 98.519, 516, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_537() {
        Assert.assertTrue(Globals.NGInvocation_537(519, 78.516, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_538() {
        Assert.assertTrue(Globals.NGInvocation_538(516, 6.5, 768, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_539() {
        Assert.assertTrue(Globals.NGInvocation_539(5, 3654.768, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_540() {
        Assert.assertTrue(Globals.NGInvocation_540(768, 486.795, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_541() {
        Assert.assertTrue(Globals.NGInvocation_541(795, 165.9, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_542() {
        Assert.assertTrue(Globals.NGInvocation_542(9, 16.515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_543() {
        Assert.assertTrue(Globals.NGInvocation_543(515, 49.6, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_544() {
        Assert.assertTrue(Globals.NGInvocation_544(6, 1919.516, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_545() {
        Assert.assertTrue(Globals.NGInvocation_545(516, 2.51, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_546() {
        Assert.assertTrue(Globals.NGInvocation_546(51, 19.651, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_547() {
        Assert.assertTrue(Globals.NGInvocation_547(651, 321.96516, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_548() {
        Assert.assertTrue(Globals.NGInvocation_548(96516, 984.51, 524.9519f, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_549() {
        Assert.assertTrue(Globals.NGInvocation_549(51, 524.9519, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_550() {
        Assert.assertTrue(Globals.NGInvocation_550(9519, 312.1, 651.5619f, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_551() {
        Assert.assertTrue(Globals.NGInvocation_551(1, 651.5619, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_552() {
        Assert.assertTrue(Globals.NGInvocation_552(5619, 98.519, 78.516f, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_553() {
        Assert.assertTrue(Globals.NGInvocation_553(519, 78.516, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_554() {
        Assert.assertTrue(Globals.NGInvocation_554(516, 6.5, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_555() {
        Assert.assertTrue(Globals.NGInvocation_555(5, 3654.768, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_556() {
        Assert.assertTrue(Globals.NGInvocation_556(768, 486.795, 165.9f, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_557() {
        Assert.assertTrue(Globals.NGInvocation_557(795, 165.9, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_558() {
        Assert.assertTrue(Globals.NGInvocation_558(9, 16.515, 49.6f, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_559() {
        Assert.assertTrue(Globals.NGInvocation_559(515, 49.6, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_560() {
        Assert.assertTrue(Globals.NGInvocation_560(6, 1919.516, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_561() {
        Assert.assertTrue(Globals.NGInvocation_561(516, 2.51, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_562() {
        Assert.assertTrue(Globals.NGInvocation_562(51, 19.651, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_563() {
        Assert.assertTrue(Globals.NGInvocation_563(651, 321.96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_564() {
        Assert.assertTrue(Globals.NGInvocation_564(96516, 984.51, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_565() {
        Assert.assertTrue(Globals.NGInvocation_565(51, 524.9519, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_566() {
        Assert.assertTrue(Globals.NGInvocation_566(9519, 312.1, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_567() {
        Assert.assertTrue(Globals.NGInvocation_567(1, 651.5619, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_568() {
        Assert.assertTrue(Globals.NGInvocation_568(5619, 98.519, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_569() {
        Assert.assertTrue(Globals.NGInvocation_569(519, 78.516, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_570() {
        Assert.assertTrue(Globals
                .NGInvocation_570(516, 6.5, 768L, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_571() {
        Assert.assertTrue(Globals.NGInvocation_571(5, 3654.768, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_572() {
        Assert.assertTrue(Globals.NGInvocation_572(768, 486.795, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_573() {
        Assert.assertTrue(Globals.NGInvocation_573(795, 165.9, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_574() {
        Assert.assertTrue(Globals.NGInvocation_574(9, 16.515, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_575() {
        Assert.assertTrue(Globals
                .NGInvocation_575(515, 49.6, 516L, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_576() {
        Assert.assertTrue(Globals.NGInvocation_576(6, 1919.516, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_577() {
        Assert.assertTrue(Globals.NGInvocation_577(516, 2.51, 651L, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_578() {
        Assert.assertTrue(Globals.NGInvocation_578(51, 19.651, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_579() {
        Assert.assertTrue(Globals.NGInvocation_579(651, 321.96516, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_580() {
        Assert.assertTrue(Globals.NGInvocation_580(96516, 984.51, 524.9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_581() {
        Assert.assertTrue(Globals.NGInvocation_581(51, 524.9519, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_582() {
        Assert.assertTrue(Globals.NGInvocation_582(9519, 312.1, 651.5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_583() {
        Assert.assertTrue(Globals.NGInvocation_583(1, 651.5619, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_584() {
        Assert.assertTrue(Globals.NGInvocation_584(5619, 98.519, 78.516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_585() {
        Assert.assertTrue(Globals.NGInvocation_585(519, 78.516, 6.5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_586() {
        Assert.assertTrue(Globals.NGInvocation_586(516, 6.5, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_587() {
        Assert.assertTrue(Globals.NGInvocation_587(5, 3654.768, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_588() {
        Assert.assertTrue(Globals
                .NGInvocation_588(768, 486.795, 165.9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_589() {
        Assert.assertTrue(Globals.NGInvocation_589(795, 165.9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_590() {
        Assert.assertTrue(Globals.NGInvocation_590(9, 16.515, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_591() {
        Assert.assertTrue(Globals.NGInvocation_591(515, 49.6, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_592() {
        Assert.assertTrue(Globals.NGInvocation_592(6, 1919.516, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_593() {
        Assert.assertTrue(Globals.NGInvocation_593(516, 2.51, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_594() {
        Assert.assertTrue(Globals.NGInvocation_594(51, 19.651, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_595() {
        Assert.assertTrue(Globals.NGInvocation_595(651, 321.96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_596() {
        Assert.assertTrue(Globals.NGInvocation_596(321.96516f, 51, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_597() {
        Assert.assertTrue(Globals.NGInvocation_597(984.51f, 9519, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_598() {
        Assert.assertTrue(Globals.NGInvocation_598(524.9519f, 1, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_599() {
        Assert.assertTrue(Globals.NGInvocation_599(312.1f, 5619, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_600() {
        Assert.assertTrue(Globals.NGInvocation_600(651.5619f, 519, 516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_601() {
        Assert.assertTrue(Globals.NGInvocation_601(98.519f, 516, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_602() {
        Assert.assertTrue(Globals.NGInvocation_602(78.516f, 5, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_603() {
        Assert.assertTrue(Globals.NGInvocation_603(6.5f, 768, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_604() {
        Assert.assertTrue(Globals.NGInvocation_604(3654.768f, 795, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_605() {
        Assert.assertTrue(Globals.NGInvocation_605(486.795f, 9, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_606() {
        Assert.assertTrue(Globals.NGInvocation_606(165.9f, 515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_607() {
        Assert.assertTrue(Globals
                .NGInvocation_607(16.515f, 6, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_608() {
        Assert.assertTrue(Globals.NGInvocation_608(49.6f, 516, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_609() {
        Assert.assertTrue(Globals.NGInvocation_609(1919.516f, 51, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_610() {
        Assert.assertTrue(Globals.NGInvocation_610(2.51f, 651, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_611() {
        Assert.assertTrue(Globals.NGInvocation_611(19.651f, 96516, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_612() {
        Assert.assertTrue(Globals.NGInvocation_612(321.96516f, 51, 524.9519f,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_613() {
        Assert.assertTrue(Globals.NGInvocation_613(984.51f, 9519, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_614() {
        Assert.assertTrue(Globals.NGInvocation_614(524.9519f, 1, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_615() {
        Assert.assertTrue(Globals.NGInvocation_615(312.1f, 5619, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_616() {
        Assert.assertTrue(Globals.NGInvocation_616(651.5619f, 519, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_617() {
        Assert.assertTrue(Globals.NGInvocation_617(98.519f, 516, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_618() {
        Assert.assertTrue(Globals.NGInvocation_618(78.516f, 5, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_619() {
        Assert.assertTrue(Globals.NGInvocation_619(6.5f, 768, 486.795f, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_620() {
        Assert.assertTrue(Globals.NGInvocation_620(3654.768f, 795, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_621() {
        Assert.assertTrue(Globals.NGInvocation_621(486.795f, 9, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_622() {
        Assert.assertTrue(Globals.NGInvocation_622(165.9f, 515, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_623() {
        Assert.assertTrue(Globals.NGInvocation_623(16.515f, 6, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_624() {
        Assert.assertTrue(Globals.NGInvocation_624(49.6f, 516, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_625() {
        Assert.assertTrue(Globals.NGInvocation_625(1919.516f, 51, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_626() {
        Assert.assertTrue(Globals.NGInvocation_626(2.51f, 651, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_627() {
        Assert.assertTrue(Globals.NGInvocation_627(19.651f, 96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_628() {
        Assert.assertTrue(Globals.NGInvocation_628(321.96516f, 51, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_629() {
        Assert.assertTrue(Globals.NGInvocation_629(984.51f, 9519, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_630() {
        Assert.assertTrue(Globals.NGInvocation_630(524.9519f, 1, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_631() {
        Assert.assertTrue(Globals
                .NGInvocation_631(312.1f, 5619, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_632() {
        Assert.assertTrue(Globals.NGInvocation_632(651.5619f, 519, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_633() {
        Assert.assertTrue(Globals.NGInvocation_633(98.519f, 516, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_634() {
        Assert.assertTrue(Globals.NGInvocation_634(78.516f, 5, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_635() {
        Assert.assertTrue(Globals.NGInvocation_635(6.5f, 768, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_636() {
        Assert.assertTrue(Globals.NGInvocation_636(3654.768f, 795, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_637() {
        Assert.assertTrue(Globals.NGInvocation_637(486.795f, 9, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_638() {
        Assert.assertTrue(Globals.NGInvocation_638(165.9f, 515, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_639() {
        Assert.assertTrue(Globals.NGInvocation_639(16.515f, 6, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_640() {
        Assert.assertTrue(Globals.NGInvocation_640(49.6f, 516, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_641() {
        Assert.assertTrue(Globals.NGInvocation_641(1919.516f, 51, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_642() {
        Assert.assertTrue(Globals.NGInvocation_642(2.51f, 651, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_643() {
        Assert.assertTrue(Globals.NGInvocation_643(19.651f, 96516, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_644() {
        Assert.assertTrue(Globals.NGInvocation_644(321.96516f, 51, 524.9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_645() {
        Assert.assertTrue(Globals.NGInvocation_645(984.51f, 9519, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_646() {
        Assert.assertTrue(Globals.NGInvocation_646(524.9519f, 1, 651.5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_647() {
        Assert.assertTrue(Globals.NGInvocation_647(312.1f, 5619, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_648() {
        Assert.assertTrue(Globals.NGInvocation_648(651.5619f, 519, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_649() {
        Assert.assertTrue(Globals.NGInvocation_649(98.519f, 516, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_650() {
        Assert.assertTrue(Globals.NGInvocation_650(78.516f, 5, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_651() {
        Assert.assertTrue(Globals.NGInvocation_651(6.5f, 768, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_652() {
        Assert.assertTrue(Globals.NGInvocation_652(3654.768f, 795, 165.9, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_653() {
        Assert.assertTrue(Globals.NGInvocation_653(486.795f, 9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_654() {
        Assert.assertTrue(Globals
                .NGInvocation_654(165.9f, 515, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_655() {
        Assert.assertTrue(Globals.NGInvocation_655(16.515f, 6, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_656() {
        Assert.assertTrue(Globals.NGInvocation_656(49.6f, 516, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_657() {
        Assert.assertTrue(Globals.NGInvocation_657(1919.516f, 51, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_658() {
        Assert.assertTrue(Globals.NGInvocation_658(2.51f, 651, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_659() {
        Assert.assertTrue(Globals.NGInvocation_659(19.651f, 96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_660() {
        Assert.assertTrue(Globals.NGInvocation_660(321.96516f, 984.51f, 9519,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_661() {
        Assert.assertTrue(Globals.NGInvocation_661(984.51f, 524.9519f, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_662() {
        Assert.assertTrue(Globals.NGInvocation_662(524.9519f, 312.1f, 5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_663() {
        Assert.assertTrue(Globals.NGInvocation_663(312.1f, 651.5619f, 519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_664() {
        Assert.assertTrue(Globals.NGInvocation_664(651.5619f, 98.519f, 516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_665() {
        Assert.assertTrue(Globals.NGInvocation_665(98.519f, 78.516f, 5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_666() {
        Assert.assertTrue(Globals.NGInvocation_666(78.516f, 6.5f, 768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_667() {
        Assert.assertTrue(Globals.NGInvocation_667(6.5f, 3654.768f, 795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_668() {
        Assert.assertTrue(Globals.NGInvocation_668(3654.768f, 486.795f, 9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_669() {
        Assert.assertTrue(Globals.NGInvocation_669(486.795f, 165.9f, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_670() {
        Assert.assertTrue(Globals.NGInvocation_670(165.9f, 16.515f, 6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_671() {
        Assert.assertTrue(Globals.NGInvocation_671(16.515f, 49.6f, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_672() {
        Assert.assertTrue(Globals.NGInvocation_672(49.6f, 1919.516f, 51,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_673() {
        Assert.assertTrue(Globals.NGInvocation_673(1919.516f, 2.51f, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_674() {
        Assert.assertTrue(Globals.NGInvocation_674(2.51f, 19.651f, 96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_675() {
        Assert.assertTrue(Globals.NGInvocation_675(19.651f, 321.96516f, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_676() {
        Assert.assertTrue(Globals.NGInvocation_676(321.96516f, 984.51f,
                524.9519f, 1, 5619));
    }

    @Test
    public void test_NGInvocation_677() {
        Assert.assertTrue(Globals.NGInvocation_677(984.51f, 524.9519f, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_678() {
        Assert.assertTrue(Globals.NGInvocation_678(524.9519f, 312.1f,
                651.5619f, 519, 516L));
    }

    @Test
    public void test_NGInvocation_679() {
        Assert.assertTrue(Globals.NGInvocation_679(312.1f, 651.5619f, 98.519f,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_680() {
        Assert.assertTrue(Globals.NGInvocation_680(651.5619f, 98.519f, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_681() {
        Assert.assertTrue(Globals.NGInvocation_681(98.519f, 78.516f, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_682() {
        Assert.assertTrue(Globals.NGInvocation_682(78.516f, 6.5f, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_683() {
        Assert.assertTrue(Globals.NGInvocation_683(6.5f, 3654.768f, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_684() {
        Assert.assertTrue(Globals.NGInvocation_684(3654.768f, 486.795f, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_685() {
        Assert.assertTrue(Globals.NGInvocation_685(486.795f, 165.9f, 16.515f,
                6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_686() {
        Assert.assertTrue(Globals.NGInvocation_686(165.9f, 16.515f, 49.6f,
                516L, 51L));
    }

    @Test
    public void test_NGInvocation_687() {
        Assert.assertTrue(Globals.NGInvocation_687(16.515f, 49.6f, 1919.516f,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_688() {
        Assert.assertTrue(Globals.NGInvocation_688(49.6f, 1919.516f, 2.51f,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_689() {
        Assert.assertTrue(Globals.NGInvocation_689(1919.516f, 2.51f, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_690() {
        Assert.assertTrue(Globals.NGInvocation_690(2.51f, 19.651f, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_691() {
        Assert.assertTrue(Globals.NGInvocation_691(19.651f, 321.96516f,
                984.51f, 524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_692() {
        Assert.assertTrue(Globals.NGInvocation_692(321.96516f, 984.51f, 9519L,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_693() {
        Assert.assertTrue(Globals.NGInvocation_693(984.51f, 524.9519f, 1L,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_694() {
        Assert.assertTrue(Globals.NGInvocation_694(524.9519f, 312.1f, 5619L,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_695() {
        Assert.assertTrue(Globals.NGInvocation_695(312.1f, 651.5619f, 519L,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_696() {
        Assert.assertTrue(Globals.NGInvocation_696(651.5619f, 98.519f, 516L,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_697() {
        Assert.assertTrue(Globals.NGInvocation_697(98.519f, 78.516f, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_698() {
        Assert.assertTrue(Globals.NGInvocation_698(78.516f, 6.5f, 768L,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_699() {
        Assert.assertTrue(Globals.NGInvocation_699(6.5f, 3654.768f, 795L,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_700() {
        Assert.assertTrue(Globals.NGInvocation_700(3654.768f, 486.795f, 9L,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_701() {
        Assert.assertTrue(Globals.NGInvocation_701(486.795f, 165.9f, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_702() {
        Assert.assertTrue(Globals.NGInvocation_702(165.9f, 16.515f, 6L, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_703() {
        Assert.assertTrue(Globals.NGInvocation_703(16.515f, 49.6f, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_704() {
        Assert.assertTrue(Globals.NGInvocation_704(49.6f, 1919.516f, 51L,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_705() {
        Assert.assertTrue(Globals.NGInvocation_705(1919.516f, 2.51f, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_706() {
        Assert.assertTrue(Globals.NGInvocation_706(2.51f, 19.651f, 96516L,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_707() {
        Assert.assertTrue(Globals.NGInvocation_707(19.651f, 321.96516f, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_708() {
        Assert.assertTrue(Globals.NGInvocation_708(321.96516f, 984.51f,
                524.9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_709() {
        Assert.assertTrue(Globals.NGInvocation_709(984.51f, 524.9519f, 312.1,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_710() {
        Assert.assertTrue(Globals.NGInvocation_710(524.9519f, 312.1f, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_711() {
        Assert.assertTrue(Globals.NGInvocation_711(312.1f, 651.5619f, 98.519,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_712() {
        Assert.assertTrue(Globals.NGInvocation_712(651.5619f, 98.519f, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_713() {
        Assert.assertTrue(Globals.NGInvocation_713(98.519f, 78.516f, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_714() {
        Assert.assertTrue(Globals.NGInvocation_714(78.516f, 6.5f, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_715() {
        Assert.assertTrue(Globals.NGInvocation_715(6.5f, 3654.768f, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_716() {
        Assert.assertTrue(Globals.NGInvocation_716(3654.768f, 486.795f, 165.9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_717() {
        Assert.assertTrue(Globals.NGInvocation_717(486.795f, 165.9f, 16.515,
                6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_718() {
        Assert.assertTrue(Globals.NGInvocation_718(165.9f, 16.515f, 49.6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_719() {
        Assert.assertTrue(Globals.NGInvocation_719(16.515f, 49.6f, 1919.516,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_720() {
        Assert.assertTrue(Globals.NGInvocation_720(49.6f, 1919.516f, 2.51,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_721() {
        Assert.assertTrue(Globals.NGInvocation_721(1919.516f, 2.51f, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_722() {
        Assert.assertTrue(Globals.NGInvocation_722(2.51f, 19.651f, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_723() {
        Assert.assertTrue(Globals.NGInvocation_723(19.651f, 321.96516f, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_724() {
        Assert.assertTrue(Globals.NGInvocation_724(321.96516f, 51L, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_725() {
        Assert.assertTrue(Globals.NGInvocation_725(984.51f, 9519L, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_726() {
        Assert.assertTrue(Globals.NGInvocation_726(524.9519f, 1L, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_727() {
        Assert.assertTrue(Globals
                .NGInvocation_727(312.1f, 5619L, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_728() {
        Assert.assertTrue(Globals.NGInvocation_728(651.5619f, 519L, 516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_729() {
        Assert.assertTrue(Globals.NGInvocation_729(98.519f, 516L, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_730() {
        Assert.assertTrue(Globals.NGInvocation_730(78.516f, 5L, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_731() {
        Assert.assertTrue(Globals.NGInvocation_731(6.5f, 768L, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_732() {
        Assert.assertTrue(Globals.NGInvocation_732(3654.768f, 795L, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_733() {
        Assert.assertTrue(Globals.NGInvocation_733(486.795f, 9L, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_734() {
        Assert.assertTrue(Globals.NGInvocation_734(165.9f, 515L, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_735() {
        Assert.assertTrue(Globals.NGInvocation_735(16.515f, 6L, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_736() {
        Assert.assertTrue(Globals.NGInvocation_736(49.6f, 516L, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_737() {
        Assert.assertTrue(Globals.NGInvocation_737(1919.516f, 51L, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_738() {
        Assert.assertTrue(Globals.NGInvocation_738(2.51f, 651L, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_739() {
        Assert.assertTrue(Globals.NGInvocation_739(19.651f, 96516L, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_740() {
        Assert.assertTrue(Globals.NGInvocation_740(321.96516f, 51L, 524.9519f,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_741() {
        Assert.assertTrue(Globals.NGInvocation_741(984.51f, 9519L, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_742() {
        Assert.assertTrue(Globals.NGInvocation_742(524.9519f, 1L, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_743() {
        Assert.assertTrue(Globals.NGInvocation_743(312.1f, 5619L, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_744() {
        Assert.assertTrue(Globals.NGInvocation_744(651.5619f, 519L, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_745() {
        Assert.assertTrue(Globals.NGInvocation_745(98.519f, 516L, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_746() {
        Assert.assertTrue(Globals.NGInvocation_746(78.516f, 5L, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_747() {
        Assert.assertTrue(Globals.NGInvocation_747(6.5f, 768L, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_748() {
        Assert.assertTrue(Globals.NGInvocation_748(3654.768f, 795L, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_749() {
        Assert.assertTrue(Globals.NGInvocation_749(486.795f, 9L, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_750() {
        Assert.assertTrue(Globals.NGInvocation_750(165.9f, 515L, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_751() {
        Assert.assertTrue(Globals.NGInvocation_751(16.515f, 6L, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_752() {
        Assert.assertTrue(Globals.NGInvocation_752(49.6f, 516L, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_753() {
        Assert.assertTrue(Globals.NGInvocation_753(1919.516f, 51L, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_754() {
        Assert.assertTrue(Globals.NGInvocation_754(2.51f, 651L, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_755() {
        Assert.assertTrue(Globals.NGInvocation_755(19.651f, 96516L, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_756() {
        Assert.assertTrue(Globals.NGInvocation_756(321.96516f, 51L, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_757() {
        Assert.assertTrue(Globals.NGInvocation_757(984.51f, 9519L, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_758() {
        Assert.assertTrue(Globals.NGInvocation_758(524.9519f, 1L, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_759() {
        Assert.assertTrue(Globals.NGInvocation_759(312.1f, 5619L, 519L, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_760() {
        Assert.assertTrue(Globals.NGInvocation_760(651.5619f, 519L, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_761() {
        Assert.assertTrue(Globals.NGInvocation_761(98.519f, 516L, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_762() {
        Assert.assertTrue(Globals.NGInvocation_762(78.516f, 5L, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_763() {
        Assert.assertTrue(Globals.NGInvocation_763(6.5f, 768L, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_764() {
        Assert.assertTrue(Globals
                .NGInvocation_764(3654.768f, 795L, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_765() {
        Assert.assertTrue(Globals.NGInvocation_765(486.795f, 9L, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_766() {
        Assert.assertTrue(Globals.NGInvocation_766(165.9f, 515L, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_767() {
        Assert.assertTrue(Globals.NGInvocation_767(16.515f, 6L, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_768() {
        Assert.assertTrue(Globals.NGInvocation_768(49.6f, 516L, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_769() {
        Assert.assertTrue(Globals.NGInvocation_769(1919.516f, 51L, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_770() {
        Assert.assertTrue(Globals.NGInvocation_770(2.51f, 651L, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_771() {
        Assert.assertTrue(Globals.NGInvocation_771(19.651f, 96516L, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_772() {
        Assert.assertTrue(Globals.NGInvocation_772(321.96516f, 51L, 524.9519,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_773() {
        Assert.assertTrue(Globals.NGInvocation_773(984.51f, 9519L, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_774() {
        Assert.assertTrue(Globals.NGInvocation_774(524.9519f, 1L, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_775() {
        Assert.assertTrue(Globals.NGInvocation_775(312.1f, 5619L, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_776() {
        Assert.assertTrue(Globals.NGInvocation_776(651.5619f, 519L, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_777() {
        Assert.assertTrue(Globals.NGInvocation_777(98.519f, 516L, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_778() {
        Assert.assertTrue(Globals.NGInvocation_778(78.516f, 5L, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_779() {
        Assert.assertTrue(Globals.NGInvocation_779(6.5f, 768L, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_780() {
        Assert.assertTrue(Globals.NGInvocation_780(3654.768f, 795L, 165.9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_781() {
        Assert.assertTrue(Globals.NGInvocation_781(486.795f, 9L, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_782() {
        Assert.assertTrue(Globals.NGInvocation_782(165.9f, 515L, 49.6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_783() {
        Assert.assertTrue(Globals.NGInvocation_783(16.515f, 6L, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_784() {
        Assert.assertTrue(Globals.NGInvocation_784(49.6f, 516L, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_785() {
        Assert.assertTrue(Globals.NGInvocation_785(1919.516f, 51L, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_786() {
        Assert.assertTrue(Globals.NGInvocation_786(2.51f, 651L, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_787() {
        Assert.assertTrue(Globals.NGInvocation_787(19.651f, 96516L, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_788() {
        Assert.assertTrue(Globals.NGInvocation_788(321.96516f, 984.51, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_789() {
        Assert.assertTrue(Globals.NGInvocation_789(984.51f, 524.9519, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_790() {
        Assert.assertTrue(Globals.NGInvocation_790(524.9519f, 312.1, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_791() {
        Assert.assertTrue(Globals.NGInvocation_791(312.1f, 651.5619, 519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_792() {
        Assert.assertTrue(Globals.NGInvocation_792(651.5619f, 98.519, 516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_793() {
        Assert.assertTrue(Globals.NGInvocation_793(98.519f, 78.516, 5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_794() {
        Assert.assertTrue(Globals.NGInvocation_794(78.516f, 6.5, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_795() {
        Assert.assertTrue(Globals.NGInvocation_795(6.5f, 3654.768, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_796() {
        Assert.assertTrue(Globals.NGInvocation_796(3654.768f, 486.795, 9, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_797() {
        Assert.assertTrue(Globals.NGInvocation_797(486.795f, 165.9, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_798() {
        Assert.assertTrue(Globals
                .NGInvocation_798(165.9f, 16.515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_799() {
        Assert.assertTrue(Globals.NGInvocation_799(16.515f, 49.6, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_800() {
        Assert.assertTrue(Globals.NGInvocation_800(49.6f, 1919.516, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_801() {
        Assert.assertTrue(Globals.NGInvocation_801(1919.516f, 2.51, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_802() {
        Assert.assertTrue(Globals.NGInvocation_802(2.51f, 19.651, 96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_803() {
        Assert.assertTrue(Globals.NGInvocation_803(19.651f, 321.96516, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_804() {
        Assert.assertTrue(Globals.NGInvocation_804(321.96516f, 984.51,
                524.9519f, 1, 5619));
    }

    @Test
    public void test_NGInvocation_805() {
        Assert.assertTrue(Globals.NGInvocation_805(984.51f, 524.9519, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_806() {
        Assert.assertTrue(Globals.NGInvocation_806(524.9519f, 312.1, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_807() {
        Assert.assertTrue(Globals.NGInvocation_807(312.1f, 651.5619, 98.519f,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_808() {
        Assert.assertTrue(Globals.NGInvocation_808(651.5619f, 98.519, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_809() {
        Assert.assertTrue(Globals.NGInvocation_809(98.519f, 78.516, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_810() {
        Assert.assertTrue(Globals.NGInvocation_810(78.516f, 6.5, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_811() {
        Assert.assertTrue(Globals.NGInvocation_811(6.5f, 3654.768, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_812() {
        Assert.assertTrue(Globals.NGInvocation_812(3654.768f, 486.795, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_813() {
        Assert.assertTrue(Globals.NGInvocation_813(486.795f, 165.9, 16.515f,
                6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_814() {
        Assert.assertTrue(Globals.NGInvocation_814(165.9f, 16.515, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_815() {
        Assert.assertTrue(Globals.NGInvocation_815(16.515f, 49.6, 1919.516f,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_816() {
        Assert.assertTrue(Globals.NGInvocation_816(49.6f, 1919.516, 2.51f,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_817() {
        Assert.assertTrue(Globals.NGInvocation_817(1919.516f, 2.51, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_818() {
        Assert.assertTrue(Globals.NGInvocation_818(2.51f, 19.651, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_819() {
        Assert.assertTrue(Globals.NGInvocation_819(19.651f, 321.96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_820() {
        Assert.assertTrue(Globals.NGInvocation_820(321.96516f, 984.51, 9519L,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_821() {
        Assert.assertTrue(Globals.NGInvocation_821(984.51f, 524.9519, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_822() {
        Assert.assertTrue(Globals.NGInvocation_822(524.9519f, 312.1, 5619L,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_823() {
        Assert.assertTrue(Globals.NGInvocation_823(312.1f, 651.5619, 519L, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_824() {
        Assert.assertTrue(Globals.NGInvocation_824(651.5619f, 98.519, 516L,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_825() {
        Assert.assertTrue(Globals.NGInvocation_825(98.519f, 78.516, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_826() {
        Assert.assertTrue(Globals.NGInvocation_826(78.516f, 6.5, 768L,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_827() {
        Assert.assertTrue(Globals.NGInvocation_827(6.5f, 3654.768, 795L,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_828() {
        Assert.assertTrue(Globals.NGInvocation_828(3654.768f, 486.795, 9L,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_829() {
        Assert.assertTrue(Globals.NGInvocation_829(486.795f, 165.9, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_830() {
        Assert.assertTrue(Globals.NGInvocation_830(165.9f, 16.515, 6L, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_831() {
        Assert.assertTrue(Globals.NGInvocation_831(16.515f, 49.6, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_832() {
        Assert.assertTrue(Globals.NGInvocation_832(49.6f, 1919.516, 51L,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_833() {
        Assert.assertTrue(Globals.NGInvocation_833(1919.516f, 2.51, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_834() {
        Assert.assertTrue(Globals.NGInvocation_834(2.51f, 19.651, 96516L,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_835() {
        Assert.assertTrue(Globals.NGInvocation_835(19.651f, 321.96516, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_836() {
        Assert.assertTrue(Globals.NGInvocation_836(321.96516f, 984.51,
                524.9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_837() {
        Assert.assertTrue(Globals.NGInvocation_837(984.51f, 524.9519, 312.1,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_838() {
        Assert.assertTrue(Globals.NGInvocation_838(524.9519f, 312.1, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_839() {
        Assert.assertTrue(Globals.NGInvocation_839(312.1f, 651.5619, 98.519,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_840() {
        Assert.assertTrue(Globals.NGInvocation_840(651.5619f, 98.519, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_841() {
        Assert.assertTrue(Globals.NGInvocation_841(98.519f, 78.516, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_842() {
        Assert.assertTrue(Globals.NGInvocation_842(78.516f, 6.5, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_843() {
        Assert.assertTrue(Globals.NGInvocation_843(6.5f, 3654.768, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_844() {
        Assert.assertTrue(Globals.NGInvocation_844(3654.768f, 486.795, 165.9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_845() {
        Assert.assertTrue(Globals.NGInvocation_845(486.795f, 165.9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_846() {
        Assert.assertTrue(Globals.NGInvocation_846(165.9f, 16.515, 49.6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_847() {
        Assert.assertTrue(Globals.NGInvocation_847(16.515f, 49.6, 1919.516,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_848() {
        Assert.assertTrue(Globals.NGInvocation_848(49.6f, 1919.516, 2.51,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_849() {
        Assert.assertTrue(Globals.NGInvocation_849(1919.516f, 2.51, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_850() {
        Assert.assertTrue(Globals.NGInvocation_850(2.51f, 19.651, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_851() {
        Assert.assertTrue(Globals.NGInvocation_851(19.651f, 321.96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_852() {
        Assert.assertTrue(Globals.NGInvocation_852(96516L, 51, 9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_853() {
        Assert.assertTrue(Globals.NGInvocation_853(51L, 9519, 1, 5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_854() {
        Assert.assertTrue(Globals.NGInvocation_854(9519L, 1, 5619, 519, 516L));
    }

    @Test
    public void test_NGInvocation_855() {
        Assert.assertTrue(Globals.NGInvocation_855(1L, 5619, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_856() {
        Assert.assertTrue(Globals.NGInvocation_856(5619L, 519, 516, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_857() {
        Assert.assertTrue(Globals.NGInvocation_857(519L, 516, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_858() {
        Assert.assertTrue(Globals.NGInvocation_858(516L, 5, 768, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_859() {
        Assert.assertTrue(Globals
                .NGInvocation_859(5L, 768, 795, 165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_860() {
        Assert.assertTrue(Globals.NGInvocation_860(768L, 795, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_861() {
        Assert.assertTrue(Globals.NGInvocation_861(795L, 9, 515, 6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_862() {
        Assert.assertTrue(Globals.NGInvocation_862(9L, 515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_863() {
        Assert.assertTrue(Globals.NGInvocation_863(515L, 6, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_864() {
        Assert.assertTrue(Globals.NGInvocation_864(6L, 516, 51, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_865() {
        Assert.assertTrue(Globals.NGInvocation_865(516L, 51, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_866() {
        Assert.assertTrue(Globals.NGInvocation_866(51L, 651, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_867() {
        Assert.assertTrue(Globals.NGInvocation_867(651L, 96516, 51, 524.9519,
                312.1));
    }

    @Test
    public void test_NGInvocation_868() {
        Assert.assertTrue(Globals.NGInvocation_868(96516L, 51, 524.9519f, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_869() {
        Assert.assertTrue(Globals.NGInvocation_869(51L, 9519, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_870() {
        Assert.assertTrue(Globals.NGInvocation_870(9519L, 1, 651.5619f, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_871() {
        Assert.assertTrue(Globals.NGInvocation_871(1L, 5619, 98.519f, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_872() {
        Assert.assertTrue(Globals.NGInvocation_872(5619L, 519, 78.516f, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_873() {
        Assert.assertTrue(Globals.NGInvocation_873(519L, 516, 6.5f, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_874() {
        Assert.assertTrue(Globals.NGInvocation_874(516L, 5, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_875() {
        Assert.assertTrue(Globals.NGInvocation_875(5L, 768, 486.795f, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_876() {
        Assert.assertTrue(Globals.NGInvocation_876(768L, 795, 165.9f, 515L, 6));
    }

    @Test
    public void test_NGInvocation_877() {
        Assert.assertTrue(Globals.NGInvocation_877(795L, 9, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_878() {
        Assert.assertTrue(Globals.NGInvocation_878(9L, 515, 49.6f, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_879() {
        Assert.assertTrue(Globals.NGInvocation_879(515L, 6, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_880() {
        Assert.assertTrue(Globals.NGInvocation_880(6L, 516, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_881() {
        Assert.assertTrue(Globals.NGInvocation_881(516L, 51, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_882() {
        Assert.assertTrue(Globals.NGInvocation_882(51L, 651, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_883() {
        Assert.assertTrue(Globals.NGInvocation_883(651L, 96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_884() {
        Assert.assertTrue(Globals.NGInvocation_884(96516L, 51, 9519L, 1, 5619));
    }

    @Test
    public void test_NGInvocation_885() {
        Assert.assertTrue(Globals
                .NGInvocation_885(51L, 9519, 1L, 5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_886() {
        Assert.assertTrue(Globals.NGInvocation_886(9519L, 1, 5619L, 519, 516L));
    }

    @Test
    public void test_NGInvocation_887() {
        Assert.assertTrue(Globals.NGInvocation_887(1L, 5619, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_888() {
        Assert.assertTrue(Globals.NGInvocation_888(5619L, 519, 516L, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_889() {
        Assert.assertTrue(Globals.NGInvocation_889(519L, 516, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_890() {
        Assert.assertTrue(Globals.NGInvocation_890(516L, 5, 768L, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_891() {
        Assert.assertTrue(Globals.NGInvocation_891(5L, 768, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_892() {
        Assert.assertTrue(Globals.NGInvocation_892(768L, 795, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_893() {
        Assert.assertTrue(Globals
                .NGInvocation_893(795L, 9, 515L, 6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_894() {
        Assert.assertTrue(Globals.NGInvocation_894(9L, 515, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_895() {
        Assert.assertTrue(Globals.NGInvocation_895(515L, 6, 516L, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_896() {
        Assert.assertTrue(Globals.NGInvocation_896(6L, 516, 51L, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_897() {
        Assert.assertTrue(Globals.NGInvocation_897(516L, 51, 651L, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_898() {
        Assert.assertTrue(Globals.NGInvocation_898(51L, 651, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_899() {
        Assert.assertTrue(Globals.NGInvocation_899(651L, 96516, 51L, 524.9519,
                312.1));
    }

    @Test
    public void test_NGInvocation_900() {
        Assert.assertTrue(Globals.NGInvocation_900(96516L, 51, 524.9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_901() {
        Assert.assertTrue(Globals.NGInvocation_901(51L, 9519, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_902() {
        Assert.assertTrue(Globals.NGInvocation_902(9519L, 1, 651.5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_903() {
        Assert.assertTrue(Globals.NGInvocation_903(1L, 5619, 98.519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_904() {
        Assert.assertTrue(Globals.NGInvocation_904(5619L, 519, 78.516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_905() {
        Assert.assertTrue(Globals.NGInvocation_905(519L, 516, 6.5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_906() {
        Assert.assertTrue(Globals.NGInvocation_906(516L, 5, 3654.768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_907() {
        Assert.assertTrue(Globals.NGInvocation_907(5L, 768, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_908() {
        Assert.assertTrue(Globals.NGInvocation_908(768L, 795, 165.9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_909() {
        Assert.assertTrue(Globals.NGInvocation_909(795L, 9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_910() {
        Assert.assertTrue(Globals.NGInvocation_910(9L, 515, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_911() {
        Assert.assertTrue(Globals.NGInvocation_911(515L, 6, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_912() {
        Assert.assertTrue(Globals
                .NGInvocation_912(6L, 516, 2.51, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_913() {
        Assert.assertTrue(Globals.NGInvocation_913(516L, 51, 19.651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_914() {
        Assert.assertTrue(Globals.NGInvocation_914(51L, 651, 321.96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_915() {
        Assert.assertTrue(Globals.NGInvocation_915(651L, 96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_916() {
        Assert.assertTrue(Globals.NGInvocation_916(96516L, 984.51f, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_917() {
        Assert.assertTrue(Globals.NGInvocation_917(51L, 524.9519f, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_918() {
        Assert.assertTrue(Globals.NGInvocation_918(9519L, 312.1f, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_919() {
        Assert.assertTrue(Globals
                .NGInvocation_919(1L, 651.5619f, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_920() {
        Assert.assertTrue(Globals.NGInvocation_920(5619L, 98.519f, 516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_921() {
        Assert.assertTrue(Globals.NGInvocation_921(519L, 78.516f, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_922() {
        Assert.assertTrue(Globals.NGInvocation_922(516L, 6.5f, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_923() {
        Assert.assertTrue(Globals.NGInvocation_923(5L, 3654.768f, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_924() {
        Assert.assertTrue(Globals.NGInvocation_924(768L, 486.795f, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_925() {
        Assert.assertTrue(Globals.NGInvocation_925(795L, 165.9f, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_926() {
        Assert.assertTrue(Globals.NGInvocation_926(9L, 16.515f, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_927() {
        Assert.assertTrue(Globals.NGInvocation_927(515L, 49.6f, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_928() {
        Assert.assertTrue(Globals.NGInvocation_928(6L, 1919.516f, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_929() {
        Assert.assertTrue(Globals.NGInvocation_929(516L, 2.51f, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_930() {
        Assert.assertTrue(Globals.NGInvocation_930(51L, 19.651f, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_931() {
        Assert.assertTrue(Globals.NGInvocation_931(651L, 321.96516f, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_932() {
        Assert.assertTrue(Globals.NGInvocation_932(96516L, 984.51f, 524.9519f,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_933() {
        Assert.assertTrue(Globals.NGInvocation_933(51L, 524.9519f, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_934() {
        Assert.assertTrue(Globals.NGInvocation_934(9519L, 312.1f, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_935() {
        Assert.assertTrue(Globals.NGInvocation_935(1L, 651.5619f, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_936() {
        Assert.assertTrue(Globals.NGInvocation_936(5619L, 98.519f, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_937() {
        Assert.assertTrue(Globals.NGInvocation_937(519L, 78.516f, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_938() {
        Assert.assertTrue(Globals.NGInvocation_938(516L, 6.5f, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_939() {
        Assert.assertTrue(Globals.NGInvocation_939(5L, 3654.768f, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_940() {
        Assert.assertTrue(Globals.NGInvocation_940(768L, 486.795f, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_941() {
        Assert.assertTrue(Globals.NGInvocation_941(795L, 165.9f, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_942() {
        Assert.assertTrue(Globals.NGInvocation_942(9L, 16.515f, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_943() {
        Assert.assertTrue(Globals.NGInvocation_943(515L, 49.6f, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_944() {
        Assert.assertTrue(Globals.NGInvocation_944(6L, 1919.516f, 2.51f,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_945() {
        Assert.assertTrue(Globals.NGInvocation_945(516L, 2.51f, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_946() {
        Assert.assertTrue(Globals.NGInvocation_946(51L, 19.651f, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_947() {
        Assert.assertTrue(Globals.NGInvocation_947(651L, 321.96516f, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_948() {
        Assert.assertTrue(Globals.NGInvocation_948(96516L, 984.51f, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_949() {
        Assert.assertTrue(Globals.NGInvocation_949(51L, 524.9519f, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_950() {
        Assert.assertTrue(Globals.NGInvocation_950(9519L, 312.1f, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_951() {
        Assert.assertTrue(Globals.NGInvocation_951(1L, 651.5619f, 519L, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_952() {
        Assert.assertTrue(Globals.NGInvocation_952(5619L, 98.519f, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_953() {
        Assert.assertTrue(Globals.NGInvocation_953(519L, 78.516f, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_954() {
        Assert.assertTrue(Globals.NGInvocation_954(516L, 6.5f, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_955() {
        Assert.assertTrue(Globals.NGInvocation_955(5L, 3654.768f, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_956() {
        Assert.assertTrue(Globals.NGInvocation_956(768L, 486.795f, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_957() {
        Assert.assertTrue(Globals.NGInvocation_957(795L, 165.9f, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_958() {
        Assert.assertTrue(Globals.NGInvocation_958(9L, 16.515f, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_959() {
        Assert.assertTrue(Globals.NGInvocation_959(515L, 49.6f, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_960() {
        Assert.assertTrue(Globals.NGInvocation_960(6L, 1919.516f, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_961() {
        Assert.assertTrue(Globals.NGInvocation_961(516L, 2.51f, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_962() {
        Assert.assertTrue(Globals.NGInvocation_962(51L, 19.651f, 96516L,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_963() {
        Assert.assertTrue(Globals.NGInvocation_963(651L, 321.96516f, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_964() {
        Assert.assertTrue(Globals.NGInvocation_964(96516L, 984.51f, 524.9519,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_965() {
        Assert.assertTrue(Globals.NGInvocation_965(51L, 524.9519f, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_966() {
        Assert.assertTrue(Globals.NGInvocation_966(9519L, 312.1f, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_967() {
        Assert.assertTrue(Globals.NGInvocation_967(1L, 651.5619f, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_968() {
        Assert.assertTrue(Globals.NGInvocation_968(5619L, 98.519f, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_969() {
        Assert.assertTrue(Globals.NGInvocation_969(519L, 78.516f, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_970() {
        Assert.assertTrue(Globals.NGInvocation_970(516L, 6.5f, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_971() {
        Assert.assertTrue(Globals.NGInvocation_971(5L, 3654.768f, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_972() {
        Assert.assertTrue(Globals.NGInvocation_972(768L, 486.795f, 165.9, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_973() {
        Assert.assertTrue(Globals.NGInvocation_973(795L, 165.9f, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_974() {
        Assert.assertTrue(Globals
                .NGInvocation_974(9L, 16.515f, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_975() {
        Assert.assertTrue(Globals.NGInvocation_975(515L, 49.6f, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_976() {
        Assert.assertTrue(Globals.NGInvocation_976(6L, 1919.516f, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_977() {
        Assert.assertTrue(Globals.NGInvocation_977(516L, 2.51f, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_978() {
        Assert.assertTrue(Globals.NGInvocation_978(51L, 19.651f, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_979() {
        Assert.assertTrue(Globals.NGInvocation_979(651L, 321.96516f, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_980() {
        Assert.assertTrue(Globals.NGInvocation_980(96516L, 51L, 9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_981() {
        Assert.assertTrue(Globals
                .NGInvocation_981(51L, 9519L, 1, 5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_982() {
        Assert.assertTrue(Globals.NGInvocation_982(9519L, 1L, 5619, 519, 516L));
    }

    @Test
    public void test_NGInvocation_983() {
        Assert.assertTrue(Globals.NGInvocation_983(1L, 5619L, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_984() {
        Assert.assertTrue(Globals.NGInvocation_984(5619L, 519L, 516, 6.5f, 768));
    }

    @Test
    public void test_NGInvocation_985() {
        Assert.assertTrue(Globals.NGInvocation_985(519L, 516L, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_986() {
        Assert.assertTrue(Globals.NGInvocation_986(516L, 5L, 768, 486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_987() {
        Assert.assertTrue(Globals.NGInvocation_987(5L, 768L, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_988() {
        Assert.assertTrue(Globals.NGInvocation_988(768L, 795L, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_989() {
        Assert.assertTrue(Globals
                .NGInvocation_989(795L, 9L, 515, 6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_990() {
        Assert.assertTrue(Globals.NGInvocation_990(9L, 515L, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_991() {
        Assert.assertTrue(Globals.NGInvocation_991(515L, 6L, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_992() {
        Assert.assertTrue(Globals.NGInvocation_992(6L, 516L, 51, 19.651, 96516));
    }

    @Test
    public void test_NGInvocation_993() {
        Assert.assertTrue(Globals.NGInvocation_993(516L, 51L, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_994() {
        Assert.assertTrue(Globals.NGInvocation_994(51L, 651L, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_995() {
        Assert.assertTrue(Globals.NGInvocation_995(651L, 96516L, 51, 524.9519,
                312.1));
    }

    @Test
    public void test_NGInvocation_996() {
        Assert.assertTrue(Globals.NGInvocation_996(96516L, 51L, 524.9519f, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_997() {
        Assert.assertTrue(Globals.NGInvocation_997(51L, 9519L, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_998() {
        Assert.assertTrue(Globals.NGInvocation_998(9519L, 1L, 651.5619f, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_999() {
        Assert.assertTrue(Globals
                .NGInvocation_999(1L, 5619L, 98.519f, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_1000() {
        Assert.assertTrue(Globals.NGInvocation_1000(5619L, 519L, 78.516f, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1001() {
        Assert.assertTrue(Globals.NGInvocation_1001(519L, 516L, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1002() {
        Assert.assertTrue(Globals.NGInvocation_1002(516L, 5L, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1003() {
        Assert.assertTrue(Globals.NGInvocation_1003(5L, 768L, 486.795f, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1004() {
        Assert.assertTrue(Globals
                .NGInvocation_1004(768L, 795L, 165.9f, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1005() {
        Assert.assertTrue(Globals.NGInvocation_1005(795L, 9L, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1006() {
        Assert.assertTrue(Globals.NGInvocation_1006(9L, 515L, 49.6f, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1007() {
        Assert.assertTrue(Globals.NGInvocation_1007(515L, 6L, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1008() {
        Assert.assertTrue(Globals.NGInvocation_1008(6L, 516L, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1009() {
        Assert.assertTrue(Globals.NGInvocation_1009(516L, 51L, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1010() {
        Assert.assertTrue(Globals.NGInvocation_1010(51L, 651L, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1011() {
        Assert.assertTrue(Globals.NGInvocation_1011(651L, 96516L, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1012() {
        Assert.assertTrue(Globals
                .NGInvocation_1012(96516L, 51L, 9519L, 1, 5619));
    }

    @Test
    public void test_NGInvocation_1013() {
        Assert.assertTrue(Globals.NGInvocation_1013(51L, 9519L, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1014() {
        Assert.assertTrue(Globals
                .NGInvocation_1014(9519L, 1L, 5619L, 519, 516L));
    }

    @Test
    public void test_NGInvocation_1015() {
        Assert.assertTrue(Globals.NGInvocation_1015(1L, 5619L, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_1016() {
        Assert.assertTrue(Globals.NGInvocation_1016(5619L, 519L, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1017() {
        Assert.assertTrue(Globals.NGInvocation_1017(519L, 516L, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_1018() {
        Assert.assertTrue(Globals.NGInvocation_1018(516L, 5L, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1019() {
        Assert.assertTrue(Globals.NGInvocation_1019(5L, 768L, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1020() {
        Assert.assertTrue(Globals.NGInvocation_1020(768L, 795L, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1021() {
        Assert.assertTrue(Globals.NGInvocation_1021(795L, 9L, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1022() {
        Assert.assertTrue(Globals.NGInvocation_1022(9L, 515L, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1023() {
        Assert.assertTrue(Globals
                .NGInvocation_1023(515L, 6L, 516L, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_1024() {
        Assert.assertTrue(Globals.NGInvocation_1024(6L, 516L, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1025() {
        Assert.assertTrue(Globals.NGInvocation_1025(516L, 51L, 651L, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_1026() {
        Assert.assertTrue(Globals.NGInvocation_1026(51L, 651L, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_1027() {
        Assert.assertTrue(Globals.NGInvocation_1027(651L, 96516L, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1028() {
        Assert.assertTrue(Globals.NGInvocation_1028(96516L, 51L, 524.9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1029() {
        Assert.assertTrue(Globals.NGInvocation_1029(51L, 9519L, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1030() {
        Assert.assertTrue(Globals.NGInvocation_1030(9519L, 1L, 651.5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1031() {
        Assert.assertTrue(Globals
                .NGInvocation_1031(1L, 5619L, 98.519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_1032() {
        Assert.assertTrue(Globals.NGInvocation_1032(5619L, 519L, 78.516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1033() {
        Assert.assertTrue(Globals.NGInvocation_1033(519L, 516L, 6.5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_1034() {
        Assert.assertTrue(Globals.NGInvocation_1034(516L, 5L, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1035() {
        Assert.assertTrue(Globals.NGInvocation_1035(5L, 768L, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1036() {
        Assert.assertTrue(Globals.NGInvocation_1036(768L, 795L, 165.9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1037() {
        Assert.assertTrue(Globals.NGInvocation_1037(795L, 9L, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1038() {
        Assert.assertTrue(Globals.NGInvocation_1038(9L, 515L, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1039() {
        Assert.assertTrue(Globals.NGInvocation_1039(515L, 6L, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1040() {
        Assert.assertTrue(Globals.NGInvocation_1040(6L, 516L, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1041() {
        Assert.assertTrue(Globals.NGInvocation_1041(516L, 51L, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1042() {
        Assert.assertTrue(Globals.NGInvocation_1042(51L, 651L, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1043() {
        Assert.assertTrue(Globals.NGInvocation_1043(651L, 96516L, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1044() {
        Assert.assertTrue(Globals.NGInvocation_1044(96516L, 984.51, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1045() {
        Assert.assertTrue(Globals.NGInvocation_1045(51L, 524.9519, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1046() {
        Assert.assertTrue(Globals.NGInvocation_1046(9519L, 312.1, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1047() {
        Assert.assertTrue(Globals
                .NGInvocation_1047(1L, 651.5619, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_1048() {
        Assert.assertTrue(Globals.NGInvocation_1048(5619L, 98.519, 516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1049() {
        Assert.assertTrue(Globals.NGInvocation_1049(519L, 78.516, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_1050() {
        Assert.assertTrue(Globals.NGInvocation_1050(516L, 6.5, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1051() {
        Assert.assertTrue(Globals.NGInvocation_1051(5L, 3654.768, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1052() {
        Assert.assertTrue(Globals.NGInvocation_1052(768L, 486.795, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1053() {
        Assert.assertTrue(Globals.NGInvocation_1053(795L, 165.9, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1054() {
        Assert.assertTrue(Globals.NGInvocation_1054(9L, 16.515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1055() {
        Assert.assertTrue(Globals.NGInvocation_1055(515L, 49.6, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1056() {
        Assert.assertTrue(Globals.NGInvocation_1056(6L, 1919.516, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1057() {
        Assert.assertTrue(Globals.NGInvocation_1057(516L, 2.51, 651, 321.96516,
                984.51f));
    }

    @Test
    public void test_NGInvocation_1058() {
        Assert.assertTrue(Globals.NGInvocation_1058(51L, 19.651, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_1059() {
        Assert.assertTrue(Globals.NGInvocation_1059(651L, 321.96516, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1060() {
        Assert.assertTrue(Globals.NGInvocation_1060(96516L, 984.51, 524.9519f,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1061() {
        Assert.assertTrue(Globals.NGInvocation_1061(51L, 524.9519, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_1062() {
        Assert.assertTrue(Globals.NGInvocation_1062(9519L, 312.1, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1063() {
        Assert.assertTrue(Globals.NGInvocation_1063(1L, 651.5619, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1064() {
        Assert.assertTrue(Globals.NGInvocation_1064(5619L, 98.519, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1065() {
        Assert.assertTrue(Globals.NGInvocation_1065(519L, 78.516, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1066() {
        Assert.assertTrue(Globals.NGInvocation_1066(516L, 6.5, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1067() {
        Assert.assertTrue(Globals.NGInvocation_1067(5L, 3654.768, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1068() {
        Assert.assertTrue(Globals.NGInvocation_1068(768L, 486.795, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1069() {
        Assert.assertTrue(Globals.NGInvocation_1069(795L, 165.9, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1070() {
        Assert.assertTrue(Globals.NGInvocation_1070(9L, 16.515, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1071() {
        Assert.assertTrue(Globals.NGInvocation_1071(515L, 49.6, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1072() {
        Assert.assertTrue(Globals.NGInvocation_1072(6L, 1919.516, 2.51f,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1073() {
        Assert.assertTrue(Globals.NGInvocation_1073(516L, 2.51, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1074() {
        Assert.assertTrue(Globals.NGInvocation_1074(51L, 19.651, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1075() {
        Assert.assertTrue(Globals.NGInvocation_1075(651L, 321.96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1076() {
        Assert.assertTrue(Globals.NGInvocation_1076(96516L, 984.51, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1077() {
        Assert.assertTrue(Globals.NGInvocation_1077(51L, 524.9519, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1078() {
        Assert.assertTrue(Globals.NGInvocation_1078(9519L, 312.1, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1079() {
        Assert.assertTrue(Globals.NGInvocation_1079(1L, 651.5619, 519L, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1080() {
        Assert.assertTrue(Globals.NGInvocation_1080(5619L, 98.519, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1081() {
        Assert.assertTrue(Globals.NGInvocation_1081(519L, 78.516, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1082() {
        Assert.assertTrue(Globals.NGInvocation_1082(516L, 6.5, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1083() {
        Assert.assertTrue(Globals.NGInvocation_1083(5L, 3654.768, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1084() {
        Assert.assertTrue(Globals.NGInvocation_1084(768L, 486.795, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1085() {
        Assert.assertTrue(Globals.NGInvocation_1085(795L, 165.9, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1086() {
        Assert.assertTrue(Globals.NGInvocation_1086(9L, 16.515, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1087() {
        Assert.assertTrue(Globals.NGInvocation_1087(515L, 49.6, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1088() {
        Assert.assertTrue(Globals.NGInvocation_1088(6L, 1919.516, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1089() {
        Assert.assertTrue(Globals.NGInvocation_1089(516L, 2.51, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1090() {
        Assert.assertTrue(Globals.NGInvocation_1090(51L, 19.651, 96516L,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1091() {
        Assert.assertTrue(Globals.NGInvocation_1091(651L, 321.96516, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1092() {
        Assert.assertTrue(Globals.NGInvocation_1092(96516L, 984.51, 524.9519,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1093() {
        Assert.assertTrue(Globals.NGInvocation_1093(51L, 524.9519, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1094() {
        Assert.assertTrue(Globals.NGInvocation_1094(9519L, 312.1, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1095() {
        Assert.assertTrue(Globals.NGInvocation_1095(1L, 651.5619, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1096() {
        Assert.assertTrue(Globals.NGInvocation_1096(5619L, 98.519, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1097() {
        Assert.assertTrue(Globals.NGInvocation_1097(519L, 78.516, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1098() {
        Assert.assertTrue(Globals.NGInvocation_1098(516L, 6.5, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1099() {
        Assert.assertTrue(Globals.NGInvocation_1099(5L, 3654.768, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1100() {
        Assert.assertTrue(Globals.NGInvocation_1100(768L, 486.795, 165.9, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_1101() {
        Assert.assertTrue(Globals.NGInvocation_1101(795L, 165.9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1102() {
        Assert.assertTrue(Globals
                .NGInvocation_1102(9L, 16.515, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1103() {
        Assert.assertTrue(Globals.NGInvocation_1103(515L, 49.6, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1104() {
        Assert.assertTrue(Globals.NGInvocation_1104(6L, 1919.516, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1105() {
        Assert.assertTrue(Globals.NGInvocation_1105(516L, 2.51, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1106() {
        Assert.assertTrue(Globals.NGInvocation_1106(51L, 19.651, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1107() {
        Assert.assertTrue(Globals.NGInvocation_1107(651L, 321.96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1108() {
        Assert.assertTrue(Globals.NGInvocation_1108(321.96516, 51, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1109() {
        Assert.assertTrue(Globals.NGInvocation_1109(984.51, 9519, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1110() {
        Assert.assertTrue(Globals.NGInvocation_1110(524.9519, 1, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1111() {
        Assert.assertTrue(Globals.NGInvocation_1111(312.1, 5619, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_1112() {
        Assert.assertTrue(Globals.NGInvocation_1112(651.5619, 519, 516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1113() {
        Assert.assertTrue(Globals.NGInvocation_1113(98.519, 516, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_1114() {
        Assert.assertTrue(Globals.NGInvocation_1114(78.516, 5, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1115() {
        Assert.assertTrue(Globals.NGInvocation_1115(6.5, 768, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1116() {
        Assert.assertTrue(Globals.NGInvocation_1116(3654.768, 795, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1117() {
        Assert.assertTrue(Globals.NGInvocation_1117(486.795, 9, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1118() {
        Assert.assertTrue(Globals.NGInvocation_1118(165.9, 515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1119() {
        Assert.assertTrue(Globals
                .NGInvocation_1119(16.515, 6, 516, 51L, 19.651));
    }

    @Test
    public void test_NGInvocation_1120() {
        Assert.assertTrue(Globals.NGInvocation_1120(49.6, 516, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1121() {
        Assert.assertTrue(Globals.NGInvocation_1121(1919.516, 51, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1122() {
        Assert.assertTrue(Globals.NGInvocation_1122(2.51, 651, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_1123() {
        Assert.assertTrue(Globals.NGInvocation_1123(19.651, 96516, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1124() {
        Assert.assertTrue(Globals.NGInvocation_1124(321.96516, 51, 524.9519f,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1125() {
        Assert.assertTrue(Globals.NGInvocation_1125(984.51, 9519, 312.1f, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1126() {
        Assert.assertTrue(Globals.NGInvocation_1126(524.9519, 1, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1127() {
        Assert.assertTrue(Globals.NGInvocation_1127(312.1, 5619, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1128() {
        Assert.assertTrue(Globals.NGInvocation_1128(651.5619, 519, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1129() {
        Assert.assertTrue(Globals.NGInvocation_1129(98.519, 516, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1130() {
        Assert.assertTrue(Globals.NGInvocation_1130(78.516, 5, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1131() {
        Assert.assertTrue(Globals.NGInvocation_1131(6.5, 768, 486.795f, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1132() {
        Assert.assertTrue(Globals.NGInvocation_1132(3654.768, 795, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1133() {
        Assert.assertTrue(Globals.NGInvocation_1133(486.795, 9, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1134() {
        Assert.assertTrue(Globals.NGInvocation_1134(165.9, 515, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1135() {
        Assert.assertTrue(Globals.NGInvocation_1135(16.515, 6, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1136() {
        Assert.assertTrue(Globals.NGInvocation_1136(49.6, 516, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1137() {
        Assert.assertTrue(Globals.NGInvocation_1137(1919.516, 51, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1138() {
        Assert.assertTrue(Globals.NGInvocation_1138(2.51, 651, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1139() {
        Assert.assertTrue(Globals.NGInvocation_1139(19.651, 96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1140() {
        Assert.assertTrue(Globals.NGInvocation_1140(321.96516, 51, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1141() {
        Assert.assertTrue(Globals.NGInvocation_1141(984.51, 9519, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1142() {
        Assert.assertTrue(Globals.NGInvocation_1142(524.9519, 1, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1143() {
        Assert.assertTrue(Globals
                .NGInvocation_1143(312.1, 5619, 519L, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_1144() {
        Assert.assertTrue(Globals.NGInvocation_1144(651.5619, 519, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1145() {
        Assert.assertTrue(Globals.NGInvocation_1145(98.519, 516, 5L, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_1146() {
        Assert.assertTrue(Globals.NGInvocation_1146(78.516, 5, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1147() {
        Assert.assertTrue(Globals.NGInvocation_1147(6.5, 768, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1148() {
        Assert.assertTrue(Globals.NGInvocation_1148(3654.768, 795, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1149() {
        Assert.assertTrue(Globals.NGInvocation_1149(486.795, 9, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1150() {
        Assert.assertTrue(Globals.NGInvocation_1150(165.9, 515, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1151() {
        Assert.assertTrue(Globals.NGInvocation_1151(16.515, 6, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1152() {
        Assert.assertTrue(Globals.NGInvocation_1152(49.6, 516, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1153() {
        Assert.assertTrue(Globals.NGInvocation_1153(1919.516, 51, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1154() {
        Assert.assertTrue(Globals.NGInvocation_1154(2.51, 651, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_1155() {
        Assert.assertTrue(Globals.NGInvocation_1155(19.651, 96516, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1156() {
        Assert.assertTrue(Globals.NGInvocation_1156(321.96516, 51, 524.9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1157() {
        Assert.assertTrue(Globals.NGInvocation_1157(984.51, 9519, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1158() {
        Assert.assertTrue(Globals.NGInvocation_1158(524.9519, 1, 651.5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1159() {
        Assert.assertTrue(Globals.NGInvocation_1159(312.1, 5619, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1160() {
        Assert.assertTrue(Globals.NGInvocation_1160(651.5619, 519, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1161() {
        Assert.assertTrue(Globals.NGInvocation_1161(98.519, 516, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1162() {
        Assert.assertTrue(Globals.NGInvocation_1162(78.516, 5, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1163() {
        Assert.assertTrue(Globals.NGInvocation_1163(6.5, 768, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1164() {
        Assert.assertTrue(Globals.NGInvocation_1164(3654.768, 795, 165.9, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_1165() {
        Assert.assertTrue(Globals.NGInvocation_1165(486.795, 9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1166() {
        Assert.assertTrue(Globals
                .NGInvocation_1166(165.9, 515, 49.6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1167() {
        Assert.assertTrue(Globals.NGInvocation_1167(16.515, 6, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1168() {
        Assert.assertTrue(Globals.NGInvocation_1168(49.6, 516, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1169() {
        Assert.assertTrue(Globals.NGInvocation_1169(1919.516, 51, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1170() {
        Assert.assertTrue(Globals.NGInvocation_1170(2.51, 651, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1171() {
        Assert.assertTrue(Globals.NGInvocation_1171(19.651, 96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1172() {
        Assert.assertTrue(Globals.NGInvocation_1172(321.96516, 984.51f, 9519,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1173() {
        Assert.assertTrue(Globals.NGInvocation_1173(984.51, 524.9519f, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1174() {
        Assert.assertTrue(Globals.NGInvocation_1174(524.9519, 312.1f, 5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1175() {
        Assert.assertTrue(Globals.NGInvocation_1175(312.1, 651.5619f, 519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1176() {
        Assert.assertTrue(Globals.NGInvocation_1176(651.5619, 98.519f, 516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1177() {
        Assert.assertTrue(Globals.NGInvocation_1177(98.519, 78.516f, 5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1178() {
        Assert.assertTrue(Globals.NGInvocation_1178(78.516, 6.5f, 768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1179() {
        Assert.assertTrue(Globals.NGInvocation_1179(6.5, 3654.768f, 795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1180() {
        Assert.assertTrue(Globals.NGInvocation_1180(3654.768, 486.795f, 9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1181() {
        Assert.assertTrue(Globals.NGInvocation_1181(486.795, 165.9f, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1182() {
        Assert.assertTrue(Globals.NGInvocation_1182(165.9, 16.515f, 6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1183() {
        Assert.assertTrue(Globals.NGInvocation_1183(16.515, 49.6f, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1184() {
        Assert.assertTrue(Globals.NGInvocation_1184(49.6, 1919.516f, 51,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1185() {
        Assert.assertTrue(Globals.NGInvocation_1185(1919.516, 2.51f, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1186() {
        Assert.assertTrue(Globals.NGInvocation_1186(2.51, 19.651f, 96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1187() {
        Assert.assertTrue(Globals.NGInvocation_1187(19.651, 321.96516f, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1188() {
        Assert.assertTrue(Globals.NGInvocation_1188(321.96516, 984.51f,
                524.9519f, 1, 5619));
    }

    @Test
    public void test_NGInvocation_1189() {
        Assert.assertTrue(Globals.NGInvocation_1189(984.51, 524.9519f, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_1190() {
        Assert.assertTrue(Globals.NGInvocation_1190(524.9519, 312.1f,
                651.5619f, 519, 516L));
    }

    @Test
    public void test_NGInvocation_1191() {
        Assert.assertTrue(Globals.NGInvocation_1191(312.1, 651.5619f, 98.519f,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_1192() {
        Assert.assertTrue(Globals.NGInvocation_1192(651.5619, 98.519f, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1193() {
        Assert.assertTrue(Globals.NGInvocation_1193(98.519, 78.516f, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1194() {
        Assert.assertTrue(Globals.NGInvocation_1194(78.516, 6.5f, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1195() {
        Assert.assertTrue(Globals.NGInvocation_1195(6.5, 3654.768f, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1196() {
        Assert.assertTrue(Globals.NGInvocation_1196(3654.768, 486.795f, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1197() {
        Assert.assertTrue(Globals.NGInvocation_1197(486.795, 165.9f, 16.515f,
                6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_1198() {
        Assert.assertTrue(Globals.NGInvocation_1198(165.9, 16.515f, 49.6f,
                516L, 51L));
    }

    @Test
    public void test_NGInvocation_1199() {
        Assert.assertTrue(Globals.NGInvocation_1199(16.515, 49.6f, 1919.516f,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_1200() {
        Assert.assertTrue(Globals.NGInvocation_1200(49.6, 1919.516f, 2.51f,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1201() {
        Assert.assertTrue(Globals.NGInvocation_1201(1919.516, 2.51f, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1202() {
        Assert.assertTrue(Globals.NGInvocation_1202(2.51, 19.651f, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1203() {
        Assert.assertTrue(Globals.NGInvocation_1203(19.651, 321.96516f,
                984.51f, 524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1204() {
        Assert.assertTrue(Globals.NGInvocation_1204(321.96516, 984.51f, 9519L,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1205() {
        Assert.assertTrue(Globals.NGInvocation_1205(984.51, 524.9519f, 1L,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_1206() {
        Assert.assertTrue(Globals.NGInvocation_1206(524.9519, 312.1f, 5619L,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1207() {
        Assert.assertTrue(Globals.NGInvocation_1207(312.1, 651.5619f, 519L,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_1208() {
        Assert.assertTrue(Globals.NGInvocation_1208(651.5619, 98.519f, 516L,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1209() {
        Assert.assertTrue(Globals.NGInvocation_1209(98.519, 78.516f, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1210() {
        Assert.assertTrue(Globals.NGInvocation_1210(78.516, 6.5f, 768L,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1211() {
        Assert.assertTrue(Globals.NGInvocation_1211(6.5, 3654.768f, 795L,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1212() {
        Assert.assertTrue(Globals.NGInvocation_1212(3654.768, 486.795f, 9L,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1213() {
        Assert.assertTrue(Globals.NGInvocation_1213(486.795, 165.9f, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1214() {
        Assert.assertTrue(Globals.NGInvocation_1214(165.9, 16.515f, 6L, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1215() {
        Assert.assertTrue(Globals.NGInvocation_1215(16.515, 49.6f, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1216() {
        Assert.assertTrue(Globals.NGInvocation_1216(49.6, 1919.516f, 51L,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1217() {
        Assert.assertTrue(Globals.NGInvocation_1217(1919.516, 2.51f, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1218() {
        Assert.assertTrue(Globals.NGInvocation_1218(2.51, 19.651f, 96516L,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1219() {
        Assert.assertTrue(Globals.NGInvocation_1219(19.651, 321.96516f, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1220() {
        Assert.assertTrue(Globals.NGInvocation_1220(321.96516, 984.51f,
                524.9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_1221() {
        Assert.assertTrue(Globals.NGInvocation_1221(984.51, 524.9519f, 312.1,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_1222() {
        Assert.assertTrue(Globals.NGInvocation_1222(524.9519, 312.1f, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1223() {
        Assert.assertTrue(Globals.NGInvocation_1223(312.1, 651.5619f, 98.519,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_1224() {
        Assert.assertTrue(Globals.NGInvocation_1224(651.5619, 98.519f, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1225() {
        Assert.assertTrue(Globals.NGInvocation_1225(98.519, 78.516f, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1226() {
        Assert.assertTrue(Globals.NGInvocation_1226(78.516, 6.5f, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1227() {
        Assert.assertTrue(Globals.NGInvocation_1227(6.5, 3654.768f, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1228() {
        Assert.assertTrue(Globals.NGInvocation_1228(3654.768, 486.795f, 165.9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1229() {
        Assert.assertTrue(Globals.NGInvocation_1229(486.795, 165.9f, 16.515,
                6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_1230() {
        Assert.assertTrue(Globals.NGInvocation_1230(165.9, 16.515f, 49.6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1231() {
        Assert.assertTrue(Globals.NGInvocation_1231(16.515, 49.6f, 1919.516,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_1232() {
        Assert.assertTrue(Globals.NGInvocation_1232(49.6, 1919.516f, 2.51,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1233() {
        Assert.assertTrue(Globals.NGInvocation_1233(1919.516, 2.51f, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1234() {
        Assert.assertTrue(Globals.NGInvocation_1234(2.51, 19.651f, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1235() {
        Assert.assertTrue(Globals.NGInvocation_1235(19.651, 321.96516f, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1236() {
        Assert.assertTrue(Globals.NGInvocation_1236(321.96516, 51L, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1237() {
        Assert.assertTrue(Globals.NGInvocation_1237(984.51, 9519L, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1238() {
        Assert.assertTrue(Globals.NGInvocation_1238(524.9519, 1L, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1239() {
        Assert.assertTrue(Globals
                .NGInvocation_1239(312.1, 5619L, 519, 516, 6.5));
    }

    @Test
    public void test_NGInvocation_1240() {
        Assert.assertTrue(Globals.NGInvocation_1240(651.5619, 519L, 516, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1241() {
        Assert.assertTrue(Globals.NGInvocation_1241(98.519, 516L, 5, 3654.768f,
                486.795f));
    }

    @Test
    public void test_NGInvocation_1242() {
        Assert.assertTrue(Globals.NGInvocation_1242(78.516, 5L, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1243() {
        Assert.assertTrue(Globals.NGInvocation_1243(6.5, 768L, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1244() {
        Assert.assertTrue(Globals.NGInvocation_1244(3654.768, 795L, 9, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1245() {
        Assert.assertTrue(Globals.NGInvocation_1245(486.795, 9L, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1246() {
        Assert.assertTrue(Globals.NGInvocation_1246(165.9, 515L, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1247() {
        Assert.assertTrue(Globals.NGInvocation_1247(16.515, 6L, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1248() {
        Assert.assertTrue(Globals.NGInvocation_1248(49.6, 516L, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1249() {
        Assert.assertTrue(Globals.NGInvocation_1249(1919.516, 51L, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1250() {
        Assert.assertTrue(Globals.NGInvocation_1250(2.51, 651L, 96516, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_1251() {
        Assert.assertTrue(Globals.NGInvocation_1251(19.651, 96516L, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1252() {
        Assert.assertTrue(Globals.NGInvocation_1252(321.96516, 51L, 524.9519f,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1253() {
        Assert.assertTrue(Globals.NGInvocation_1253(984.51, 9519L, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_1254() {
        Assert.assertTrue(Globals.NGInvocation_1254(524.9519, 1L, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1255() {
        Assert.assertTrue(Globals.NGInvocation_1255(312.1, 5619L, 98.519f, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1256() {
        Assert.assertTrue(Globals.NGInvocation_1256(651.5619, 519L, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1257() {
        Assert.assertTrue(Globals.NGInvocation_1257(98.519, 516L, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1258() {
        Assert.assertTrue(Globals.NGInvocation_1258(78.516, 5L, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1259() {
        Assert.assertTrue(Globals.NGInvocation_1259(6.5, 768L, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1260() {
        Assert.assertTrue(Globals.NGInvocation_1260(3654.768, 795L, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1261() {
        Assert.assertTrue(Globals.NGInvocation_1261(486.795, 9L, 16.515f, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1262() {
        Assert.assertTrue(Globals.NGInvocation_1262(165.9, 515L, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1263() {
        Assert.assertTrue(Globals.NGInvocation_1263(16.515, 6L, 1919.516f, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1264() {
        Assert.assertTrue(Globals.NGInvocation_1264(49.6, 516L, 2.51f, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1265() {
        Assert.assertTrue(Globals.NGInvocation_1265(1919.516, 51L, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1266() {
        Assert.assertTrue(Globals.NGInvocation_1266(2.51, 651L, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1267() {
        Assert.assertTrue(Globals.NGInvocation_1267(19.651, 96516L, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1268() {
        Assert.assertTrue(Globals.NGInvocation_1268(321.96516, 51L, 9519L, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1269() {
        Assert.assertTrue(Globals.NGInvocation_1269(984.51, 9519L, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1270() {
        Assert.assertTrue(Globals.NGInvocation_1270(524.9519, 1L, 5619L, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1271() {
        Assert.assertTrue(Globals.NGInvocation_1271(312.1, 5619L, 519L, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1272() {
        Assert.assertTrue(Globals.NGInvocation_1272(651.5619, 519L, 516L, 6.5f,
                768));
    }

    @Test
    public void test_NGInvocation_1273() {
        Assert.assertTrue(Globals.NGInvocation_1273(98.519, 516L, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1274() {
        Assert.assertTrue(Globals.NGInvocation_1274(78.516, 5L, 768L, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1275() {
        Assert.assertTrue(Globals.NGInvocation_1275(6.5, 768L, 795L, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1276() {
        Assert.assertTrue(Globals
                .NGInvocation_1276(3654.768, 795L, 9L, 515L, 6));
    }

    @Test
    public void test_NGInvocation_1277() {
        Assert.assertTrue(Globals.NGInvocation_1277(486.795, 9L, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1278() {
        Assert.assertTrue(Globals.NGInvocation_1278(165.9, 515L, 6L, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1279() {
        Assert.assertTrue(Globals.NGInvocation_1279(16.515, 6L, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1280() {
        Assert.assertTrue(Globals.NGInvocation_1280(49.6, 516L, 51L, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1281() {
        Assert.assertTrue(Globals.NGInvocation_1281(1919.516, 51L, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1282() {
        Assert.assertTrue(Globals.NGInvocation_1282(2.51, 651L, 96516L, 984.51,
                9519L));
    }

    @Test
    public void test_NGInvocation_1283() {
        Assert.assertTrue(Globals.NGInvocation_1283(19.651, 96516L, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1284() {
        Assert.assertTrue(Globals.NGInvocation_1284(321.96516, 51L, 524.9519,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1285() {
        Assert.assertTrue(Globals.NGInvocation_1285(984.51, 9519L, 312.1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1286() {
        Assert.assertTrue(Globals.NGInvocation_1286(524.9519, 1L, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1287() {
        Assert.assertTrue(Globals.NGInvocation_1287(312.1, 5619L, 98.519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1288() {
        Assert.assertTrue(Globals.NGInvocation_1288(651.5619, 519L, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1289() {
        Assert.assertTrue(Globals.NGInvocation_1289(98.519, 516L, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1290() {
        Assert.assertTrue(Globals.NGInvocation_1290(78.516, 5L, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1291() {
        Assert.assertTrue(Globals.NGInvocation_1291(6.5, 768L, 486.795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1292() {
        Assert.assertTrue(Globals.NGInvocation_1292(3654.768, 795L, 165.9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1293() {
        Assert.assertTrue(Globals.NGInvocation_1293(486.795, 9L, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1294() {
        Assert.assertTrue(Globals.NGInvocation_1294(165.9, 515L, 49.6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1295() {
        Assert.assertTrue(Globals.NGInvocation_1295(16.515, 6L, 1919.516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1296() {
        Assert.assertTrue(Globals.NGInvocation_1296(49.6, 516L, 2.51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1297() {
        Assert.assertTrue(Globals.NGInvocation_1297(1919.516, 51L, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1298() {
        Assert.assertTrue(Globals.NGInvocation_1298(2.51, 651L, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1299() {
        Assert.assertTrue(Globals.NGInvocation_1299(19.651, 96516L, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1300() {
        Assert.assertTrue(Globals.NGInvocation_1300(321.96516, 984.51, 9519, 1,
                5619));
    }

    @Test
    public void test_NGInvocation_1301() {
        Assert.assertTrue(Globals.NGInvocation_1301(984.51, 524.9519, 1, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1302() {
        Assert.assertTrue(Globals.NGInvocation_1302(524.9519, 312.1, 5619, 519,
                516L));
    }

    @Test
    public void test_NGInvocation_1303() {
        Assert.assertTrue(Globals.NGInvocation_1303(312.1, 651.5619, 519, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1304() {
        Assert.assertTrue(Globals.NGInvocation_1304(651.5619, 98.519, 516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1305() {
        Assert.assertTrue(Globals.NGInvocation_1305(98.519, 78.516, 5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1306() {
        Assert.assertTrue(Globals.NGInvocation_1306(78.516, 6.5, 768, 486.795f,
                9L));
    }

    @Test
    public void test_NGInvocation_1307() {
        Assert.assertTrue(Globals.NGInvocation_1307(6.5, 3654.768, 795, 165.9f,
                16.515));
    }

    @Test
    public void test_NGInvocation_1308() {
        Assert.assertTrue(Globals.NGInvocation_1308(3654.768, 486.795, 9, 515L,
                6));
    }

    @Test
    public void test_NGInvocation_1309() {
        Assert.assertTrue(Globals.NGInvocation_1309(486.795, 165.9, 515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1310() {
        Assert.assertTrue(Globals
                .NGInvocation_1310(165.9, 16.515, 6, 516L, 51L));
    }

    @Test
    public void test_NGInvocation_1311() {
        Assert.assertTrue(Globals.NGInvocation_1311(16.515, 49.6, 516, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1312() {
        Assert.assertTrue(Globals.NGInvocation_1312(49.6, 1919.516, 51, 19.651,
                96516));
    }

    @Test
    public void test_NGInvocation_1313() {
        Assert.assertTrue(Globals.NGInvocation_1313(1919.516, 2.51, 651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1314() {
        Assert.assertTrue(Globals.NGInvocation_1314(2.51, 19.651, 96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1315() {
        Assert.assertTrue(Globals.NGInvocation_1315(19.651, 321.96516, 51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1316() {
        Assert.assertTrue(Globals.NGInvocation_1316(321.96516, 984.51,
                524.9519f, 1, 5619));
    }

    @Test
    public void test_NGInvocation_1317() {
        Assert.assertTrue(Globals.NGInvocation_1317(984.51, 524.9519, 312.1f,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_1318() {
        Assert.assertTrue(Globals.NGInvocation_1318(524.9519, 312.1, 651.5619f,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1319() {
        Assert.assertTrue(Globals.NGInvocation_1319(312.1, 651.5619, 98.519f,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_1320() {
        Assert.assertTrue(Globals.NGInvocation_1320(651.5619, 98.519, 78.516f,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1321() {
        Assert.assertTrue(Globals.NGInvocation_1321(98.519, 78.516, 6.5f,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1322() {
        Assert.assertTrue(Globals.NGInvocation_1322(78.516, 6.5, 3654.768f,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1323() {
        Assert.assertTrue(Globals.NGInvocation_1323(6.5, 3654.768, 486.795f,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1324() {
        Assert.assertTrue(Globals.NGInvocation_1324(3654.768, 486.795, 165.9f,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1325() {
        Assert.assertTrue(Globals.NGInvocation_1325(486.795, 165.9, 16.515f,
                6L, 1919.516f));
    }

    @Test
    public void test_NGInvocation_1326() {
        Assert.assertTrue(Globals.NGInvocation_1326(165.9, 16.515, 49.6f, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1327() {
        Assert.assertTrue(Globals.NGInvocation_1327(16.515, 49.6, 1919.516f,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_1328() {
        Assert.assertTrue(Globals.NGInvocation_1328(49.6, 1919.516, 2.51f,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1329() {
        Assert.assertTrue(Globals.NGInvocation_1329(1919.516, 2.51, 19.651f,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1330() {
        Assert.assertTrue(Globals.NGInvocation_1330(2.51, 19.651, 321.96516f,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1331() {
        Assert.assertTrue(Globals.NGInvocation_1331(19.651, 321.96516, 984.51f,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1332() {
        Assert.assertTrue(Globals.NGInvocation_1332(321.96516, 984.51, 9519L,
                1, 5619));
    }

    @Test
    public void test_NGInvocation_1333() {
        Assert.assertTrue(Globals.NGInvocation_1333(984.51, 524.9519, 1L, 5619,
                98.519f));
    }

    @Test
    public void test_NGInvocation_1334() {
        Assert.assertTrue(Globals.NGInvocation_1334(524.9519, 312.1, 5619L,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1335() {
        Assert.assertTrue(Globals.NGInvocation_1335(312.1, 651.5619, 519L, 516,
                6.5));
    }

    @Test
    public void test_NGInvocation_1336() {
        Assert.assertTrue(Globals.NGInvocation_1336(651.5619, 98.519, 516L,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1337() {
        Assert.assertTrue(Globals.NGInvocation_1337(98.519, 78.516, 5L,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1338() {
        Assert.assertTrue(Globals.NGInvocation_1338(78.516, 6.5, 768L,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1339() {
        Assert.assertTrue(Globals.NGInvocation_1339(6.5, 3654.768, 795L,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1340() {
        Assert.assertTrue(Globals.NGInvocation_1340(3654.768, 486.795, 9L,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1341() {
        Assert.assertTrue(Globals.NGInvocation_1341(486.795, 165.9, 515L, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1342() {
        Assert.assertTrue(Globals.NGInvocation_1342(165.9, 16.515, 6L, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1343() {
        Assert.assertTrue(Globals.NGInvocation_1343(16.515, 49.6, 516L, 51L,
                19.651));
    }

    @Test
    public void test_NGInvocation_1344() {
        Assert.assertTrue(Globals.NGInvocation_1344(49.6, 1919.516, 51L,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1345() {
        Assert.assertTrue(Globals.NGInvocation_1345(1919.516, 2.51, 651L,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1346() {
        Assert.assertTrue(Globals.NGInvocation_1346(2.51, 19.651, 96516L,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1347() {
        Assert.assertTrue(Globals.NGInvocation_1347(19.651, 321.96516, 51L,
                524.9519, 312.1));
    }

    @Test
    public void test_NGInvocation_1348() {
        Assert.assertTrue(Globals.NGInvocation_1348(321.96516, 984.51,
                524.9519, 1, 5619));
    }

    @Test
    public void test_NGInvocation_1349() {
        Assert.assertTrue(Globals.NGInvocation_1349(984.51, 524.9519, 312.1,
                5619, 98.519f));
    }

    @Test
    public void test_NGInvocation_1350() {
        Assert.assertTrue(Globals.NGInvocation_1350(524.9519, 312.1, 651.5619,
                519, 516L));
    }

    @Test
    public void test_NGInvocation_1351() {
        Assert.assertTrue(Globals.NGInvocation_1351(312.1, 651.5619, 98.519,
                516, 6.5));
    }

    @Test
    public void test_NGInvocation_1352() {
        Assert.assertTrue(Globals.NGInvocation_1352(651.5619, 98.519, 78.516,
                6.5f, 768));
    }

    @Test
    public void test_NGInvocation_1353() {
        Assert.assertTrue(Globals.NGInvocation_1353(98.519, 78.516, 6.5,
                3654.768f, 486.795f));
    }

    @Test
    public void test_NGInvocation_1354() {
        Assert.assertTrue(Globals.NGInvocation_1354(78.516, 6.5, 3654.768,
                486.795f, 9L));
    }

    @Test
    public void test_NGInvocation_1355() {
        Assert.assertTrue(Globals.NGInvocation_1355(6.5, 3654.768, 486.795,
                165.9f, 16.515));
    }

    @Test
    public void test_NGInvocation_1356() {
        Assert.assertTrue(Globals.NGInvocation_1356(3654.768, 486.795, 165.9,
                515L, 6));
    }

    @Test
    public void test_NGInvocation_1357() {
        Assert.assertTrue(Globals.NGInvocation_1357(486.795, 165.9, 16.515, 6L,
                1919.516f));
    }

    @Test
    public void test_NGInvocation_1358() {
        Assert.assertTrue(Globals.NGInvocation_1358(165.9, 16.515, 49.6, 516L,
                51L));
    }

    @Test
    public void test_NGInvocation_1359() {
        Assert.assertTrue(Globals.NGInvocation_1359(16.515, 49.6, 1919.516,
                51L, 19.651));
    }

    @Test
    public void test_NGInvocation_1360() {
        Assert.assertTrue(Globals.NGInvocation_1360(49.6, 1919.516, 2.51,
                19.651, 96516));
    }

    @Test
    public void test_NGInvocation_1361() {
        Assert.assertTrue(Globals.NGInvocation_1361(1919.516, 2.51, 19.651,
                321.96516, 984.51f));
    }

    @Test
    public void test_NGInvocation_1362() {
        Assert.assertTrue(Globals.NGInvocation_1362(2.51, 19.651, 321.96516,
                984.51, 9519L));
    }

    @Test
    public void test_NGInvocation_1363() {
        Assert.assertTrue(Globals.NGInvocation_1363(19.651, 321.96516, 984.51,
                524.9519, 312.1));
    }

    @Test
    public void test_NGLongnvocation_0() {
        Assert.assertTrue(Globals.NGLongInvocation_0(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0));
    }

    @Test
    public void test_NGLongnvocation_1() {
        Assert.assertTrue(Globals.NGLongInvocation_1(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0f));
    }

    @Test
    public void test_NGLongnvocation_2() {
        Assert.assertTrue(Globals.NGLongInvocation_2(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0f, 10.0));
    }

    @Test
    public void test_NGLongnvocation_3() {
        Assert.assertTrue(Globals.NGLongInvocation_3(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0f, 10.0f));
    }

    @Test
    public void test_NGLongnvocation_4() {
        Assert.assertTrue(Globals.NGLongInvocation_4(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L));
    }

    @Test
    public void test_NGLongnvocation_5() {
        Assert.assertTrue(Globals.NGLongInvocation_5(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10));
    }

    @Test
    public void test_NGLongnvocation_6() {
        Assert.assertTrue(Globals.NGLongInvocation_6(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9, 10L));
    }

    @Test
    public void test_NGLongnvocation_7() {
        Assert.assertTrue(Globals.NGLongInvocation_7(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9, 10));
    }

    @Test
    public void test_NGLongnvocation_8() {
        Assert.assertTrue(Globals.NGLongInvocation_8(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17L, 18L));
    }

    @Test
    public void test_NGLongnvocation_9() {
        Assert.assertTrue(Globals.NGLongInvocation_9(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17L, 18));
    }

    @Test
    public void test_NGLongnvocation_10() {
        Assert.assertTrue(Globals.NGLongInvocation_10(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17L, 18.0));
    }

    @Test
    public void test_NGLongnvocation_11() {
        Assert.assertTrue(Globals.NGLongInvocation_11(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17L, 18.0f));
    }

    @Test
    public void test_NGLongnvocation_12() {
        Assert.assertTrue(Globals.NGLongInvocation_12(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18L));
    }

    @Test
    public void test_NGLongnvocation_13() {
        Assert.assertTrue(Globals.NGLongInvocation_13(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18));
    }

    @Test
    public void test_NGLongnvocation_14() {
        Assert.assertTrue(Globals.NGLongInvocation_14(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0));
    }

    @Test
    public void test_NGLongnvocation_15() {
        Assert.assertTrue(Globals.NGLongInvocation_15(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0f));
    }

    @Test
    public void test_NGLongnvocation_16() {
        Assert.assertTrue(Globals.NGLongInvocation_16(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0f, 18L));
    }

    @Test
    public void test_NGLongnvocation_17() {
        Assert.assertTrue(Globals.NGLongInvocation_17(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0f, 18));
    }

    @Test
    public void test_NGLongnvocation_18() {
        Assert.assertTrue(Globals.NGLongInvocation_18(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0f, 18.0));
    }

    @Test
    public void test_NGLongnvocation_19() {
        Assert.assertTrue(Globals.NGLongInvocation_19(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0f, 18.0f));
    }

    @Test
    public void test_NGLongnvocation_20() {
        Assert.assertTrue(Globals.NGLongInvocation_20(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17, 18L));
    }

    @Test
    public void test_NGLongnvocation_21() {
        Assert.assertTrue(Globals.NGLongInvocation_21(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17, 18));
    }

    @Test
    public void test_NGLongnvocation_22() {
        Assert.assertTrue(Globals.NGLongInvocation_22(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17, 18.0));
    }

    @Test
    public void test_NGLongnvocation_23() {
        Assert.assertTrue(Globals.NGLongInvocation_23(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17, 18.0f));
    }

}
