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

package cxx.tests.binding;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaObjectPassingTests extends NatJTest {

    @CxxHeader(value = "vector", useQuotes = false)
    @CxxClass("std::vector<natj_jobject_t>")
    private interface StdVector<T> extends CxxObject {

        @CxxMethod(isConst = true)
        @CxxUnsigned
        @NLong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxJavaObject
        T get(@NLong @CxxUnsigned long index);

        @CxxMethod
        void push_back(@CxxJavaObject T value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        @CxxJavaObject
        T set(@NLong @CxxUnsigned long index, @CxxJavaObject T value);
    }

    @CxxConstructor()
    private static native StdVector<String> newStringVector();

    @Test
    public void testStringVector() {
        StdVector<String> tmp = newStringVector();
        String[] values = {"foo", "bar", "hello"};

        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        tmp.push_back(values[2]);
        assertEquals(3, tmp.size());

        assertEquals(values[0], tmp.get(0));
        assertEquals(values[1], tmp.get(1));
        assertEquals(values[2], tmp.get(2));

        assertEquals(values[2], tmp.set(0, tmp.get(2)));
        assertEquals(values[2], tmp.set(1, tmp.get(2)));

        assertEquals(values[2], tmp.get(0));
        assertEquals(values[2], tmp.get(1));
        assertEquals(values[2], tmp.get(2));

        CxxRuntime.delete(tmp);
    }
}
