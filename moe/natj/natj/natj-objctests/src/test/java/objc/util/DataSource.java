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

package objc.util;

import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import mac.foundation.NSNumber;

import java.io.DataInputStream;
import java.io.IOException;

public class DataSource {

    private static final int COUNT = 1000;

    /*
     * INT
     */
    private static final String INT_FILE = "1000-int";
    private static int[] INT_RAW_VALUES;

    private static final int[] getInts() throws IOException {
        DataInputStream dis = new DataInputStream(DataSource.class.getClassLoader().getResourceAsStream(INT_FILE + ".txt"));
        int data[] = new int[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            data[i] = dis.readInt();
        }
        dis.close();
        return data;
    }

    private static NSNumber[] OBJC_OBJECT_VALUES;

    public static final NSNumber[] getObjCObjects() {
        return OBJC_OBJECT_VALUES;
    }

    public static Ptr<NSNumber> getObjCObjectTestPtr() {
        return PtrFactory.newObjectArray(NSNumber.class, OBJC_OBJECT_VALUES);
    }

    public static Ptr<NSNumber> getObjCObjectZeroPtr() {
        return PtrFactory.newObjectArray(NSNumber.class, COUNT);
    }

    static {
        // INT
        try {
            INT_RAW_VALUES = getInts();
        } catch (IOException e) {
            System.err.println("Failed to load ints!");
            e.printStackTrace(System.err);
        }

        // OBJC_OBJECT
        try {
            OBJC_OBJECT_VALUES = new NSNumber[COUNT];
            for (int idx = 0; idx < OBJC_OBJECT_VALUES.length; ++idx) {
                OBJC_OBJECT_VALUES[idx] = NSNumber.numberWithInt(INT_RAW_VALUES[idx]);
            }
        } catch (Exception e) {
            System.err.println("Failed to create objc objects!");
            e.printStackTrace(System.err);
        }
    }
}
