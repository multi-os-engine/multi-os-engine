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

package objc.tests.dispose;

import org.moe.natj.objc.ObjCRuntime;
import org.junit.Assert;
import org.junit.Test;

public class UnmanagedTest {

    private static final long ITERATIONS = 50;

    @Test
    public void test_unmanagedBinding_release() {
        for (long i = 0; i < ITERATIONS; i ++) {
            Assert.assertEquals(UnmanagedBinding.instanceCount(), 0L);
            UnmanagedBinding ub = UnmanagedBinding.createUnmanagedBinding();
            Assert.assertEquals(UnmanagedBinding.instanceCount(), 1L);
            Assert.assertEquals(ub.add(2, 3), 5);
            ObjCRuntime.disposeObject(ub);
            Assert.assertEquals(UnmanagedBinding.instanceCount(), 0L);
        }
    }

    @Test
    public void test_unmanagedBinding_autorelease() {
        for (long i = 0; i < ITERATIONS; i ++) {
            Assert.assertEquals(UnmanagedBinding.instanceCount(), 0L);
            UnmanagedBinding ub = UnmanagedBinding.unmanagedBinding();
            Assert.assertEquals(UnmanagedBinding.instanceCount(), 1L);
            Assert.assertEquals(ub.add(2, 3), 5);
            ObjCRuntime.disposeObject(ub);
            Assert.assertEquals(UnmanagedBinding.instanceCount(), 0L);
        }
    }

    @Test
    public void test_unmanagedProtocolProxy_release() {
        for (long i = 0; i < ITERATIONS; i ++) {
            Assert.assertEquals(UnmanagedProtocolProxyManager.instanceCount(), 0L);
            UnmanagedProtocolProxyManager.UnmanagedProtocolProxy upp =
                    UnmanagedProtocolProxyManager.createUnmanagedProtocolProxy();
            Assert.assertEquals(UnmanagedProtocolProxyManager.instanceCount(), 1L);
            Assert.assertEquals(upp.add(2, 3), 5);
            ObjCRuntime.disposeObject(upp);
            Assert.assertEquals(UnmanagedProtocolProxyManager.instanceCount(), 0L);
        }
    }

    @Test
    public void test_unmanagedProtocolProxy_autorelease() {
        for (long i = 0; i < ITERATIONS; i ++) {
            Assert.assertEquals(UnmanagedProtocolProxyManager.instanceCount(), 0L);
            UnmanagedProtocolProxyManager.UnmanagedProtocolProxy upp =
                    UnmanagedProtocolProxyManager.unmanagedProtocolProxy();
            Assert.assertEquals(UnmanagedProtocolProxyManager.instanceCount(), 1L);
            Assert.assertEquals(upp.add(2, 3), 5);
            ObjCRuntime.disposeObject(upp);
            Assert.assertEquals(UnmanagedProtocolProxyManager.instanceCount(), 0L);
        }
    }

    @Test
    public void test_unmanagedNativeBlock_release() {
        for (long i = 0; i < ITERATIONS; i ++) {
            Assert.assertEquals(UnmanagedNativeBlockManager.instanceCount(), 0L);
            UnmanagedNativeBlockManager.UnmanagedNativeBlock unb =
                    UnmanagedNativeBlockManager.createUnmanagedNativeBlock();
            Assert.assertEquals(UnmanagedNativeBlockManager.instanceCount(), 1L);
            Assert.assertEquals(unb.add(2, 3), 5);
            ObjCRuntime.disposeObject(unb);
            Assert.assertEquals(UnmanagedNativeBlockManager.instanceCount(), 0L);
        }
    }

    @Test
    public void test_unmanagedNativeBlock_autorelease() {
        for (long i = 0; i < ITERATIONS; i ++) {
            Assert.assertEquals(UnmanagedNativeBlockManager.instanceCount(), 0L);
            UnmanagedNativeBlockManager.UnmanagedNativeBlock unb =
                    UnmanagedNativeBlockManager.unmanagedNativeBlock();
            Assert.assertEquals(UnmanagedNativeBlockManager.instanceCount(), 1L);
            Assert.assertEquals(unb.add(2, 3), 5);
            ObjCRuntime.disposeObject(unb);
            Assert.assertEquals(UnmanagedNativeBlockManager.instanceCount(), 0L);
        }
    }

}
