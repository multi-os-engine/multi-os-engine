/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.utils;

import org.gradle.api.GradleException;

import java.util.Collection;

public class Require {
    private Require() {

    }

    public static <T> T nonNull(T obj) {
        if (obj == null)
            throw new GradleException();
        return obj;
    }

    public static <T> T nullObject(T obj) {
        if (obj != null)
            throw new GradleException();
        return obj;
    }

    public static <T> T nonNull(T obj, String message) {
        if (message == null) {
            return nonNull(obj);
        }
        if (obj == null)
            throw new GradleException(message);
        return obj;
    }

    public static <T> T nullObject(T obj, String message) {
        if (message == null) {
            return nullObject(obj);
        }
        if (obj != null)
            throw new GradleException(message);
        return obj;
    }

    public static <T> T[] sizeEQ(T[] arrays, int other) {
        return EQ(arrays, nonNull(arrays).length, other, null);
    }

    public static <T> T[] sizeNE(T[] arrays, int other) {
        return NE(arrays, nonNull(arrays).length, other, null);
    }

    public static <T> T[] sizeLT(T[] arrays, int other) {
        return LT(arrays, nonNull(arrays).length, other, null);
    }

    public static <T> T[] sizeLE(T[] arrays, int other) {
        return LE(arrays, nonNull(arrays).length, other, null);
    }

    public static <T> T[] sizeGT(T[] arrays, int other) {
        return GT(arrays, nonNull(arrays).length, other, null);
    }

    public static <T> T[] sizeGE(T[] arrays, int other) {
        return GE(arrays, nonNull(arrays).length, other, null);
    }

    public static <T> T[] sizeEQ(T[] arrays, int other, String message) {
        return EQ(arrays, nonNull(arrays).length, other, message);
    }

    public static <T> T[] sizeNE(T[] arrays, int other, String message) {
        return NE(arrays, nonNull(arrays).length, other, message);
    }

    public static <T> T[] sizeLT(T[] arrays, int other, String message) {
        return LT(arrays, nonNull(arrays).length, other, message);
    }

    public static <T> T[] sizeLE(T[] arrays, int other, String message) {
        return LE(arrays, nonNull(arrays).length, other, message);
    }

    public static <T> T[] sizeGT(T[] arrays, int other, String message) {
        return GT(arrays, nonNull(arrays).length, other, message);
    }

    public static <T> T[] sizeGE(T[] arrays, int other, String message) {
        return GE(arrays, nonNull(arrays).length, other, message);
    }

    public static <T extends Collection> T sizeEQ(T coll, int other) {
        return EQ(coll, nonNull(coll).size(), other, null);
    }

    public static <T extends Collection> T sizeNE(T coll, int other) {
        return NE(coll, nonNull(coll).size(), other, null);
    }

    public static <T extends Collection> T sizeLT(T coll, int other) {
        return LT(coll, nonNull(coll).size(), other, null);
    }

    public static <T extends Collection> T sizeLE(T coll, int other) {
        return LE(coll, nonNull(coll).size(), other, null);
    }

    public static <T extends Collection> T sizeGT(T coll, int other) {
        return GT(coll, nonNull(coll).size(), other, null);
    }

    public static <T extends Collection> T sizeGE(T coll, int other) {
        return GE(coll, nonNull(coll).size(), other, null);
    }

    public static <T extends Collection> T sizeEQ(T coll, int other, String message) {
        return EQ(coll, nonNull(coll).size(), other, message);
    }

    public static <T extends Collection> T sizeNE(T coll, int other, String message) {
        return NE(coll, nonNull(coll).size(), other, message);
    }

    public static <T extends Collection> T sizeLT(T coll, int other, String message) {
        return LT(coll, nonNull(coll).size(), other, message);
    }

    public static <T extends Collection> T sizeLE(T coll, int other, String message) {
        return LE(coll, nonNull(coll).size(), other, message);
    }

    public static <T extends Collection> T sizeGT(T coll, int other, String message) {
        return GT(coll, nonNull(coll).size(), other, message);
    }

    public static <T extends Collection> T sizeGE(T coll, int other, String message) {
        return GE(coll, nonNull(coll).size(), other, message);
    }

    public static void EQ(int actual, int value, String message) {
        check(actual == value, null, message);
    }

    public static void NE(int actual, int value, String message) {
        check(actual != value, null, message);
    }

    public static void LT(int actual, int value, String message) {
        check(actual < value, null, message);
    }

    public static void LE(int actual, int value, String message) {
        check(actual <= value, null, message);
    }

    public static void GT(int actual, int value, String message) {
        check(actual > value, null, message);
    }

    public static void GE(int actual, int value, String message) {
        check(actual >= value, null, message);
    }

    public static <T> T EQ(T object, int actual, int value, String message) {
        return check(actual == value, object, message);
    }

    public static <T> T NE(T object, int actual, int value, String message) {
        return check(actual != value, object, message);
    }

    public static <T> T LT(T object, int actual, int value, String message) {
        return check(actual < value, object, message);
    }

    public static <T> T LE(T object, int actual, int value, String message) {
        return check(actual <= value, object, message);
    }

    public static <T> T GT(T object, int actual, int value, String message) {
        return check(actual > value, object, message);
    }

    public static <T> T GE(T object, int actual, int value, String message) {
        return check(actual >= value, object, message);
    }

    public static void TRUE(boolean actual, String message) {
        check(actual, null, message);
    }

    public static void FALSE(boolean actual, String message) {
        check(!actual, null, message);
    }

    public static <T> T check(boolean succeed, T object, String message) {
        if (succeed) {
            return object;
        }
        throw new GradleException(message);
    }
}
