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

package org.moe.common.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Utility class for arrays.
 */
public final class ArrayUtil {

    private ArrayUtil() {
    }

    /**
     * Concatenates two arrays of the same type.
     *
     * @param a   array A
     * @param b   array B
     * @param <T> type of the array's element
     * @return concatenated array
     */
    public static <T> T[] concatenate(T[] a, T[] b) {
        if (a == null && b == null) {
            return null;
        }
        if (b == null) {
            return a.clone();
        }
        if (a == null) {
            return b.clone();
        }
        int aLen = a.length;
        int bLen = b.length;

        final Class<?> at = a.getClass().getComponentType();
        @SuppressWarnings("unchecked")
        final T[] c = (T[]) Array.newInstance(at, aLen + bLen);
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }

    /**
     * Checks whether a array contains a value. Uses equals.
     *
     * @param array array to check in
     * @param value value to look for
     * @param <T>   array element and value type
     * @return true if array contains the value otherwise false
     */
    public static <T> boolean contains(T[] array, T value) {
        if (array == null) {
            return false;
        }
        for (T elem : array) {
            if (elem == null && value == null) {
                return true;
            }
            if (elem != null && elem.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether a string is in an array. Uses equalsIgnoreCase.
     *
     * @param array array to check in
     * @param value value to check
     * @return true if array contains the value otherwise false
     */
    public static boolean containsCaseInsensitive(String[] array, String value) {
        if (array == null) {
            return false;
        }
        for (String elem : array) {
            if (elem == null && value == null) {
                return true;
            }
            if (elem != null && elem.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Joins the elements in the array with the specified separator.
     *
     * @param values    values to join
     * @param separator separator string
     * @param <T>       type of the array's element
     * @return joined string
     */
    public static <T> String join(T[] values, String separator) {
        if (values == null) {
            return null;
        }
        return join(Arrays.asList(values), separator);
    }

    /**
     * Joins the elements in the array with the specified separator.
     *
     * @param values    values to join
     * @param separator separator string
     * @param <T>       type of the array's element
     * @return joined string
     */
    public static <T> String join(List<T> values, String separator) {
        if (values == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < values.size(); ++i) {
            builder.append(values.get(i));
            if (i + 1 < values.size()) {
                builder.append(separator);
            }
        }
        return builder.toString();
    }
}
