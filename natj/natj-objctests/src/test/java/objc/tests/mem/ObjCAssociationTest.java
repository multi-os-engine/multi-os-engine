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

package objc.tests.mem;

import org.moe.natj.objc.ObjCRuntime;
import objc.binding.InstrumentedParent;
import objc.util.MemUtils;
import objc.util.VMDebug;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ObjCAssociationTest {

    private static class Dummy {

    }

    private static class Proxy {

    }

    private static class Block {
        @SuppressWarnings("unused")
        public void method() {

        }
    }

    private static long proxyClass;

    @BeforeClass
    public static void createProxyClass() {
        proxyClass = ObjCRuntime.createProxyClass(Dummy.class);
    }

    private static class ObjectTest {

        public boolean isBlock() {
            return false;
        }

        public String name() {
            return null;
        }

        public Class<?>[] argTypes() {
            return null;
        }

        public Object createObject() {
            return null;
        }

        public boolean isReleased() {
            return false;
        }
    }

    private void associationTestMethodOne(ObjectTest test) throws Exception {
        long proxy = ObjCRuntime.createProxyInstance(proxyClass, new Dummy());
        boolean released = false;
        try {
            Object object = test.createObject();

            if (test.isBlock()) {
                ObjCRuntime.associateObjCObject(proxy, object, test.name(), test.argTypes());
            } else {
                ObjCRuntime.associateObjCObject(proxy, object);
            }

            assertFalse(test.isReleased());

            object = null;

            assertFalse(test.isReleased());

            ObjCRuntime.releaseObject(proxy);
            released = true;

            assertTrue(test.isReleased());
        } finally {
            if (!released) {
                ObjCRuntime.releaseObject(proxy);
            }
        }
    }

    private void associationTestMethodTwo(ObjectTest test) throws Exception {
        long proxy = ObjCRuntime.createProxyInstance(proxyClass, new Dummy());
        boolean released = false;
        try {
            Object object = test.createObject();

            if (test.isBlock()) {
                ObjCRuntime.associateObjCObject(proxy, object, test.name(), test.argTypes());
            } else {
                ObjCRuntime.associateObjCObject(proxy, object);
            }

            assertFalse(test.isReleased());

            if (test.isBlock()) {
                ObjCRuntime.dissociateObjCObject(proxy, object, test.name(), test.argTypes());
            } else {
                ObjCRuntime.dissociateObjCObject(proxy, object);
            }

            object = null;

            assertTrue(test.isReleased());

            ObjCRuntime.releaseObject(proxy);
            released = true;
        } finally {
            if (!released) {
                ObjCRuntime.releaseObject(proxy);
            }
        }

    }

    private void associationTestMethods(ObjectTest test) throws Exception {
        associationTestMethodOne(test);
        associationTestMethodTwo(test);
    }

    @Ignore
    @Test
    public void testAssociationWithProxies() throws Exception {
        associationTestMethods(new ObjectTest() {
            @Override
            public Object createObject() {
                return new Proxy();
            }

            @Override
            public boolean isReleased() {
                MemUtils.forcedGC();
                return VMDebug.countInstancesOfClass(Proxy.class, false) == 0;
            }
        });
    }

    @Ignore
    @Test
    public void testAssociationWithBindings() throws Exception {
        associationTestMethods(new ObjectTest() {
            @Override
            public Object createObject() {
                InstrumentedParent.reset();
                return InstrumentedParent.alloc().init();
            }

            @Override
            public boolean isReleased() {
                MemUtils.forcedGC();
                return InstrumentedParent.allocCount() == InstrumentedParent.deallocCount();
            }
        });
    }

    @Ignore
    @Test
    public void testAssociationWithInheriteds() throws Exception {
        associationTestMethods(new ObjectTest() {
            @Override
            public Object createObject() {
                return SubInherited.alloc().init();
            }

            @Override
            public boolean isReleased() {
                MemUtils.forcedGC();
                return VMDebug.countInstancesOfClass(SubInherited.class, false) == 0;
            }
        });
    }

    @Ignore
    @Test
    public void testAssociationWithHybrids() throws Exception {
        associationTestMethods(new ObjectTest() {
            @Override
            public Object createObject() {
                return SubHybrid.alloc().init();
            }

            @Override
            public boolean isReleased() {
                MemUtils.forcedGC();
                return VMDebug.countInstancesOfClass(SubHybrid.class, false) == 0;
            }
        });
    }

    @Ignore
    @Test
    public void testAssociationWithStrings() throws Exception {
        associationTestMethods(new ObjectTest() {
            private long oldCount;

            @Override
            public Object createObject() {
                MemUtils.forcedGC();
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    builder.append(i);
                }
                oldCount = VMDebug.countInstancesOfClass(String.class, false);
                String string = builder.toString();
                return string;
            }

            @Override
            public boolean isReleased() {
                MemUtils.forcedGC();
                return VMDebug.countInstancesOfClass(String.class, false) == oldCount;
            }
        });
    }

    @Ignore
    @Test
    public void testAssociationWithBlocks() throws Exception {
        associationTestMethods(new ObjectTest() {
            @Override
            public boolean isBlock() {
                return true;
            }

            @Override
            public String name() {
                return "method";
            }

            @Override
            public Class<?>[] argTypes() {
                return new Class<?>[]{};
            }

            @Override
            public Object createObject() {
                return new Block();
            }

            @Override
            public boolean isReleased() {
                MemUtils.forcedGC();
                return VMDebug.countInstancesOfClass(Block.class, false) == 0;
            }
        });
    }
}
