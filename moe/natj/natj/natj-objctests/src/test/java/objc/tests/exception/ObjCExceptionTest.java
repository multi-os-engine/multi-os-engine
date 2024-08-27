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

package objc.tests.exception;

import org.moe.natj.objc.ObjCException;
import objc.binding.ObjCExceptionClass;
import org.junit.Assert;
import org.junit.Test;

public class ObjCExceptionTest {
    private static final String EXC_MESSAGE = "exception_message";

    @Test
    public void testNativeException() {
        try {
            ObjCExceptionClass.throwExceptionWithMessage(EXC_MESSAGE);
        } catch (Throwable ex) {
            Assert.assertEquals(((ObjCException) ex).getMessage(), EXC_MESSAGE);
        }
    }

    @Test
    public void testRethrownException() {
        try {
            ObjCExceptionClass.expectExceptionWithMessageWithBlock(EXC_MESSAGE, new ObjCExceptionClass.Block_expectExceptionWithMessageWithBlock() {
                @Override
                public void call_expectExceptionWithMessageWithBlock(String arg0) {
                    throw new RuntimeException(arg0);
                }
            });
        } catch (Throwable ex) {
            Assert.assertEquals(((RuntimeException) ex).getMessage(), EXC_MESSAGE);
        }
    }
}
