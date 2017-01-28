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

package org.moe.common;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class PasswordEntry implements Serializable {

    public final static char charToFill = '\u0000';
    private char[] value;

    public PasswordEntry() {
    }

    public PasswordEntry(char[] key) {
        set(key);
    }

    public PasswordEntry(String key) throws Exception {
        set(key);
    }

    public static void fillString(String target, char value) throws Exception {
        String fieldName = "value";
        if ((target == null) || target.isEmpty()) {
            return;
        }
        try {
            Field field = String.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            char[] chars = (char[])field.get(target);
            Arrays.fill(chars, value);
        } catch (NoSuchFieldException e1) {
            throw new Exception("Failed to get field with name: " + fieldName + "\n" + e1.getMessage());
        } catch (IllegalAccessException e2) {
            throw new Exception("Failed to get value from field with name: " + target + "\n" + e2.getMessage());
        }
    }

    public static void clean(byte[] target) {
        if (target != null) {
            Arrays.fill(target, (byte)0);
        }
    }

    public static void clean(char[] target) {
        if (target != null) {
            Arrays.fill(target, charToFill);
        }
    }

    public static void clean(String target) throws Exception {
        fillString(target, charToFill);
    }

    public void set(char[] value) {
        Clean();
        if ((value == null) || (value.length == 0)) {
            return;
        }

        this.value = value;
    }

    public void set(String value) throws Exception {
        Clean();
        if ((value == null) || value.isEmpty()) {
            return;
        }

        this.value = value.toCharArray();
        fillString(value, charToFill);
    }

    public char[] get() {
        return value;
    }

    public void Clean() {
        if (this.value != null) {
            Arrays.fill(this.value, charToFill);
        }
    }

    public byte[] getByteArray() {

        ByteBuffer byteBuffer = Charset.forName("UTF-8").encode(CharBuffer.wrap(this.value));
        byte[] resultBytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(resultBytes);

        Arrays.fill(byteBuffer.array(), (byte)0);

        return resultBytes;
    }
}
