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

package c.util;

import c.binding.struct.NJPoint;
import c.binding.struct.NJRect;
import c.binding.struct.NJSize;
import org.moe.natj.c.CRuntime;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ptr.*;
import org.moe.natj.general.ptr.impl.PtrFactory;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DataSource {

    private static final int COUNT = 1000;

    /*
     * BOOL
     */
    private static final String BOOL_FILE = "1000-boolean";
    private static boolean[] BOOL_RAW_VALUES;
    private static Boolean[] BOOL_OBJ_VALUES;

    private static final boolean[] getBools() throws IOException {
        DataInputStream dis = getDataInputStream(BOOL_FILE);
        boolean data[] = new boolean[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readBoolean();
        }
        dis.close();
        return data;
    }

    public static final boolean[] getRawBooleans() {
        return BOOL_RAW_VALUES;
    }

    public static final Boolean[] getObjectBooleans() {
        return BOOL_OBJ_VALUES;
    }

    public static final BoolPtr getBoolTestPtr() {
        return PtrFactory.newBoolArray(BOOL_RAW_VALUES);
    }

    public static final BoolPtr getBoolZeroPtr() {
        return PtrFactory.newBoolArray(COUNT);
    }

    /*
     * BYTE
     */
    private static final String BYTE_FILE = "1000-byte";
    private static byte[] BYTE_RAW_VALUES;
    private static Byte[] BYTE_OBJ_VALUES;

    private static final byte[] getBytes() throws IOException {
        DataInputStream dis = getDataInputStream(BYTE_FILE);
        byte data[] = new byte[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readByte();
        }
        dis.close();
        return data;
    }

    private static DataInputStream getDataInputStream(String filename) {
        try {
            final Class<?> clz = Class.forName("org.moe.natj.apple.test.support.Util");
            final Method method = clz.getMethod("getApplePath", String.class, String.class);
            final String ctests = (String) method.invoke(null, "ctests", filename + ".txt");
            return new DataInputStream(new FileInputStream(ctests));
        } catch (ClassNotFoundException ignore) {
            // Ignore
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new DataInputStream(DataSource.class.getClassLoader().getResourceAsStream(filename + ".txt"));
    }

    public static final byte[] getRawBytes() {
        return BYTE_RAW_VALUES;
    }

    public static final Byte[] getObjectBytes() {
        return BYTE_OBJ_VALUES;
    }

    public static final BytePtr getByteTestPtr() {
        return PtrFactory.newByteArray(BYTE_RAW_VALUES);
    }

    public static final BytePtr getByteZeroPtr() {
        return PtrFactory.newByteArray(COUNT);
    }

    /*
     * SHORT
     */
    private static final String SHORT_FILE = "1000-short";
    private static short[] SHORT_RAW_VALUES;
    private static Short[] SHORT_OBJ_VALUES;

    private static final short[] getShorts() throws IOException {
        DataInputStream dis = getDataInputStream(SHORT_FILE);
        short data[] = new short[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readShort();
        }
        dis.close();
        return data;
    }

    public static final short[] getRawShorts() {
        return SHORT_RAW_VALUES;
    }

    public static final Short[] getObjectShorts() {
        return SHORT_OBJ_VALUES;
    }

    public static final ShortPtr getShortTestPtr() {
        return PtrFactory.newShortArray(SHORT_RAW_VALUES);
    }

    public static final ShortPtr getShortZeroPtr() {
        return PtrFactory.newShortArray(COUNT);
    }

    /*
     * CHAR
     */
    private static final String CHAR_FILE = "1000-char";
    private static char[] CHAR_RAW_VALUES;
    private static Character[] CHAR_OBJ_VALUES;

    private static final char[] getChars() throws IOException {
        DataInputStream dis = getDataInputStream(CHAR_FILE);
        char data[] = new char[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readChar();
        }
        dis.close();
        return data;
    }

    public static final char[] getRawCharacters() {
        return CHAR_RAW_VALUES;
    }

    public static final int[] getRawWCharTs() {
        int[] values;
        if (CRuntime.sizeOfWCharT() == 4) {
            values = INT_RAW_VALUES;
        } else {
            values = new int[CHAR_RAW_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Zero extend
                values[i] = 0x0000FFFF & CHAR_RAW_VALUES[i];
            }
        }
        return values;
    }

    public static final Character[] getObjectCharacters() {
        return CHAR_OBJ_VALUES;
    }

    public static final Integer[] getObjectWCharTs() {
        Integer[] values;
        if (CRuntime.sizeOfWCharT() == 4) {
            values = INT_OBJ_VALUES;
        } else {
            values = new Integer[CHAR_OBJ_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Zero extend
                values[i] = 0x0000FFFF & CHAR_OBJ_VALUES[i];
            }
        }
        return values;
    }

    public static final CharPtr getCharTestPtr() {
        return PtrFactory.newCharArray(CHAR_RAW_VALUES);
    }

    public static final WCharTPtr getWCharTTestPtr() {
        return PtrFactory.newWCharTArray(getRawWCharTs());
    }

    public static final CharPtr getCharZeroPtr() {
        return PtrFactory.newCharArray(COUNT);
    }

    public static final WCharTPtr getWCharTZeroPtr() {
        return PtrFactory.newWCharTArray(COUNT);
    }

    /*
     * INT
     */
    private static final String INT_FILE = "1000-int";
    private static int[] INT_RAW_VALUES;
    private static Integer[] INT_OBJ_VALUES;

    private static final int[] getInts() throws IOException {
        DataInputStream dis = getDataInputStream(INT_FILE);
        int data[] = new int[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readInt();
        }
        dis.close();
        return data;
    }

    public static final int[] getRawIntegers() {
        return INT_RAW_VALUES;
    }

    public static final long[] getRawNIntegers() {
        long[] values;
        if (NatJ.is64Bit()) {
            values = LONG_RAW_VALUES;
        } else {
            values = new long[INT_RAW_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Sign extend
                values[i] = INT_RAW_VALUES[i];
            }
        }
        return values;
    }

    public static final long[] getRawNUIntegers() {
        long[] values;
        if (NatJ.is64Bit()) {
            values = LONG_RAW_VALUES;
        } else {
            values = new long[INT_RAW_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Zero extend
                values[i] = 0x00000000FFFFFFFFL & INT_RAW_VALUES[i];
            }
        }
        return values;
    }

    public static final Integer[] getObjectIntegers() {
        return INT_OBJ_VALUES;
    }

    public static final Long[] getObjectNIntegers() {
        Long[] values;
        if (NatJ.is64Bit()) {
            values = LONG_OBJ_VALUES;
        } else {
            values = new Long[INT_OBJ_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                values[i] = (long) INT_OBJ_VALUES[i];
            }
        }
        return values;
    }

    public static final Long[] getObjectNUIntegers() {
        Long[] values;
        if (NatJ.is64Bit()) {
            values = LONG_OBJ_VALUES;
        } else {
            values = new Long[INT_OBJ_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Zero extend
                values[i] = 0x00000000FFFFFFFFL & INT_OBJ_VALUES[i];
            }
        }
        return values;
    }

    public static final IntPtr getIntTestPtr() {
        return PtrFactory.newIntArray(INT_RAW_VALUES);
    }

    public static final NIntPtr getNIntTestPtr() {
        return PtrFactory.newNIntArray(getRawNIntegers());
    }

    public static final NUIntPtr getNUIntTestPtr() {
        return PtrFactory.newNUIntArray(getRawNUIntegers());
    }

    public static final IntPtr getIntZeroPtr() {
        return PtrFactory.newIntArray(COUNT);
    }

    public static final NIntPtr getNIntZeroPtr() {
        return PtrFactory.newNIntArray(COUNT);
    }

    public static final NUIntPtr getNUIntZeroPtr() {
        return PtrFactory.newNUIntArray(COUNT);
    }

    /*
     * LONG
     */
    private static final String LONG_FILE = "1000-long";
    private static long[] LONG_RAW_VALUES;
    private static Long[] LONG_OBJ_VALUES;

    private static final long[] getLongs() throws IOException {
        DataInputStream dis = getDataInputStream(LONG_FILE);
        long data[] = new long[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readLong();
        }
        dis.close();
        return data;
    }

    public static final long[] getRawLongs() {
        return LONG_RAW_VALUES;
    }

    public static final long[] getRawNLongs() {
        long[] values;
        if (CRuntime.NATIVE_LONG_SIZE == 8) {
            values = LONG_RAW_VALUES;
        } else {
            values = new long[INT_RAW_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Sign extend
                values[i] = INT_RAW_VALUES[i];
            }
        }
        return values;
    }

    public static final long[] getRawNULongs() {
        long[] values;
        if (CRuntime.NATIVE_LONG_SIZE == 8) {
            values = LONG_RAW_VALUES;
        } else {
            values = new long[INT_RAW_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Zero extend
                values[i] = 0x00000000FFFFFFFFL & INT_RAW_VALUES[i];
            }
        }
        return values;
    }

    public static final Long[] getObjectLongs() {
        return LONG_OBJ_VALUES;
    }

    public static final Long[] getObjectNLongs() {
        Long[] values;
        if (CRuntime.NATIVE_LONG_SIZE == 8) {
            values = LONG_OBJ_VALUES;
        } else {
            values = new Long[INT_OBJ_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                values[i] = (long) INT_OBJ_VALUES[i];
            }
        }
        return values;
    }

    public static final Long[] getObjectNULongs() {
        Long[] values;
        if (CRuntime.NATIVE_LONG_SIZE == 8) {
            values = LONG_OBJ_VALUES;
        } else {
            values = new Long[INT_OBJ_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                // Zero extend
                values[i] = 0x00000000FFFFFFFFL & INT_OBJ_VALUES[i];
            }
        }
        return values;
    }

    public static final LongPtr getLongTestPtr() {
        return PtrFactory.newLongArray(LONG_RAW_VALUES);
    }

    public static final NLongPtr getNLongTestPtr() {
        return PtrFactory.newNLongArray(getRawNLongs());
    }

    public static final NULongPtr getNULongTestPtr() {
        return PtrFactory.newNULongArray(getRawNULongs());
    }

    public static final LongPtr getLongZeroPtr() {
        return PtrFactory.newLongArray(COUNT);
    }

    public static final NLongPtr getNLongZeroPtr() {
        return PtrFactory.newNLongArray(COUNT);
    }

    public static final NULongPtr getNULongZeroPtr() {
        return PtrFactory.newNULongArray(COUNT);
    }

    /*
     * FLOAT
     */
    private static final String FLOAT_FILE = "1000-float";
    private static float[] FLOAT_RAW_VALUES;
    private static Float[] FLOAT_OBJ_VALUES;

    private static final float[] getFloats() throws IOException {
        DataInputStream dis = getDataInputStream(FLOAT_FILE);
        float data[] = new float[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readFloat();
        }
        dis.close();
        return data;
    }

    public static final float[] getRawFloats() {
        return FLOAT_RAW_VALUES;
    }

    public static final double[] getRawNFloats() {
        double values[];
        if (NatJ.is64Bit()) {
            values = DOUBLE_RAW_VALUES;
        } else {
            values = new double[FLOAT_RAW_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                values[i] = FLOAT_RAW_VALUES[i];
            }
        }
        return values;
    }

    public static final Float[] getObjectFloats() {
        return FLOAT_OBJ_VALUES;
    }

    public static final Double[] getObjectNFloats() {
        Double values[];
        if (NatJ.is64Bit()) {
            values = DOUBLE_OBJ_VALUES;
        } else {
            values = new Double[FLOAT_OBJ_VALUES.length];
            for (int i = 0, n = values.length; i < n; i++) {
                values[i] = (double) FLOAT_OBJ_VALUES[i];
            }
        }
        return values;
    }

    public static final FloatPtr getFloatTestPtr() {
        return PtrFactory.newFloatArray(FLOAT_RAW_VALUES);
    }

    public static final NFloatPtr getNFloatTestPtr() {
        return PtrFactory.newNFloatArray(getRawNFloats());
    }

    public static final FloatPtr getFloatZeroPtr() {
        return PtrFactory.newFloatArray(COUNT);
    }

    public static final NFloatPtr getNFloatZeroPtr() {
        return PtrFactory.newNFloatArray(COUNT);
    }

    /*
     * DOUBLE
     */
    private static final String DOUBLE_FILE = "1000-double";
    private static double[] DOUBLE_RAW_VALUES;
    private static Double[] DOUBLE_OBJ_VALUES;

    private static final double[] getDoubles() throws IOException {
        DataInputStream dis = getDataInputStream(DOUBLE_FILE);
        double data[] = new double[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readDouble();
        }
        dis.close();
        return data;
    }

    public static final double[] getRawDoubles() {
        return DOUBLE_RAW_VALUES;
    }

    public static final Double[] getObjectDoubles() {
        return DOUBLE_OBJ_VALUES;
    }

    public static final DoublePtr getDoubleTestPtr() {
        return PtrFactory.newDoubleArray(DOUBLE_RAW_VALUES);
    }

    public static final DoublePtr getDoubleZeroPtr() {
        return PtrFactory.newDoubleArray(COUNT);
    }

    private static NJRect[] STRUCT_VALUES;

    public static final NJRect[] getStructs() {
        return STRUCT_VALUES;
    }

    public static Ptr<NJRect> getStructTestPtr() {
        return PtrFactory.newStructArray(NJRect.class, STRUCT_VALUES);
    }

    public static Ptr<NJRect> getStructZeroPtr() {
        return PtrFactory.newStructArray(NJRect.class, COUNT);
    }

    static {
        // BOOLEAN
        try {
            BOOL_RAW_VALUES = getBools();
            BOOL_OBJ_VALUES = new Boolean[BOOL_RAW_VALUES.length];
            for (int idx = 0; idx < BOOL_RAW_VALUES.length; ++idx) {
                BOOL_OBJ_VALUES[idx] = new Boolean(BOOL_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load bools!");
            e.printStackTrace(System.err);
        }

        // BYTE
        try {
            BYTE_RAW_VALUES = getBytes();
            BYTE_OBJ_VALUES = new Byte[BYTE_RAW_VALUES.length];
            for (int idx = 0; idx < BYTE_RAW_VALUES.length; ++idx) {
                BYTE_OBJ_VALUES[idx] = new Byte(BYTE_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load bytes!");
            e.printStackTrace(System.err);
        }

        // SHORT
        try {
            SHORT_RAW_VALUES = getShorts();
            SHORT_OBJ_VALUES = new Short[SHORT_RAW_VALUES.length];
            for (int idx = 0; idx < SHORT_RAW_VALUES.length; ++idx) {
                SHORT_OBJ_VALUES[idx] = new Short(SHORT_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load shorts!");
            e.printStackTrace(System.err);
        }

        // CHAR
        try {
            CHAR_RAW_VALUES = getChars();
            CHAR_OBJ_VALUES = new Character[CHAR_RAW_VALUES.length];
            for (int idx = 0; idx < CHAR_RAW_VALUES.length; ++idx) {
                CHAR_OBJ_VALUES[idx] = new Character(CHAR_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load chars!");
            e.printStackTrace(System.err);
        }

        // INT
        try {
            INT_RAW_VALUES = getInts();
            INT_OBJ_VALUES = new Integer[INT_RAW_VALUES.length];
            for (int idx = 0; idx < INT_RAW_VALUES.length; ++idx) {
                INT_OBJ_VALUES[idx] = new Integer(INT_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load ints!");
            e.printStackTrace(System.err);
        }

        // LONG
        try {
            LONG_RAW_VALUES = getLongs();
            LONG_OBJ_VALUES = new Long[LONG_RAW_VALUES.length];
            for (int idx = 0; idx < LONG_RAW_VALUES.length; ++idx) {
                LONG_OBJ_VALUES[idx] = new Long(LONG_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load longs!");
            e.printStackTrace(System.err);
        }

        // FLOAT
        try {
            FLOAT_RAW_VALUES = getFloats();
            FLOAT_OBJ_VALUES = new Float[FLOAT_RAW_VALUES.length];
            for (int idx = 0; idx < FLOAT_RAW_VALUES.length; ++idx) {
                FLOAT_OBJ_VALUES[idx] = new Float(FLOAT_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load floats!");
            e.printStackTrace(System.err);
        }

        // DOUBLE
        try {
            DOUBLE_RAW_VALUES = getDoubles();
            DOUBLE_OBJ_VALUES = new Double[DOUBLE_RAW_VALUES.length];
            for (int idx = 0; idx < DOUBLE_RAW_VALUES.length; ++idx) {
                DOUBLE_OBJ_VALUES[idx] = new Double(DOUBLE_RAW_VALUES[idx]);
            }
        } catch (IOException e) {
            System.err.println("Failed to load doubles!");
            e.printStackTrace(System.err);
        }

        // STRUCT
        try {
            STRUCT_VALUES = new NJRect[COUNT];
            for (int idx = 0; idx < STRUCT_VALUES.length; ++idx) {
                NJRect e = new NJRect();
                e.setOrigin(new NJPoint(FLOAT_RAW_VALUES[(idx + 0) % COUNT], FLOAT_RAW_VALUES[(idx + 1) % COUNT]));
                e.setSize(new NJSize(FLOAT_RAW_VALUES[(idx + 2) % COUNT], FLOAT_RAW_VALUES[(idx + 3) % COUNT]));
                STRUCT_VALUES[idx] = e;
            }
        } catch (Exception e) {
            System.err.println("Failed to create structs!");
            e.printStackTrace(System.err);
        }

    }

}
