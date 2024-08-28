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

import org.moe.natj.cxx.CxxInheritedObject;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import cxx.tests.NatJTest;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StdStringTests extends NatJTest {

    private static final String TEST_STRING = "Hiragana DE: \u3067";

    @CxxHeader(value = "string", useQuotes = false)
    @CxxClass("std::string")
    private interface StdString extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long length();

        @CxxMethod(isConst = true)
        ConstBytePtr c_str();
    }

    @CxxConstructor()
    private static native StdString newString(BytePtr ptr, @NULong long len);

    @CxxFunction("natj::cxx::tests::binding::forwardStdString")
    @CxxByValue
    private static native StdString forwardStdString(@CxxConst @CxxByReference StdString value);

    @CxxHeader("binding/Strings.hpp")
    @CxxClass("natj::cxx::tests::inherited::StringForwarder")
    private interface StringForwarder {
        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxByValue
        StdString forward(@CxxConst @CxxByReference StdString value);
    }

    @CxxInheritedClass("natj::java::tests::inherited::StringForwarderImpl")
    private static final class StringForwarderImpl extends CxxInheritedObject implements StringForwarder {

        @CxxInheritedConstructor()
        private static native long newFwd(long java);

        protected StringForwarderImpl() {
            super(new ICxxConstructor() {
                @Override
                public long construct(long javaReference) {
                    return newFwd(javaReference);
                }
            });
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxByValue
        public StdString forward(@CxxConst @CxxByReference StdString value) {
            return value;
        }
    }

    @Test
    public void testFunction() throws UnsupportedEncodingException {
        ObjectPool pool = new ObjectPool();
        try {
            final StdString input = pool.add(newTestString());
            assertNotNull(input);
            final StdString output = pool.add(forwardStdString(input));
            assertNotNull(output);
            final String utf8String = output.c_str().toUTF8String();
            assertEquals(TEST_STRING, utf8String);
        } finally {
            pool.clear();
        }
    }

    @Test
    public void testInherited() throws UnsupportedEncodingException {
        ObjectPool pool = new ObjectPool();
        try {
            final StdString input = pool.add(newTestString());
            assertNotNull(input);
            final StringForwarder forwarder = pool.add(new StringForwarderImpl());
            final StdString output = pool.add(forwarder.forward(input));
            assertNotNull(output);
            final String utf8String = output.c_str().toUTF8String();
            assertEquals(TEST_STRING, utf8String);
        } finally {
            pool.clear();
        }
    }

    private StdString newTestString() throws UnsupportedEncodingException {
        final byte[] bytes = TEST_STRING.getBytes("UTF-8");
        final BytePtr bytePtr = PtrFactory.newByteArray(bytes);
        return newString(bytePtr, bytes.length);
    }
}
