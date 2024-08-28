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

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import objc.binding.InstrumentedParent;

@ObjCClassName("SubHybrid")
@RegisterOnStartup
public class SubHybrid extends InstrumentedParent {
    private static int dummyCallCount = 0;

    public static int getDummyCallCount() {
        return dummyCallCount;
    }

    static {
        NatJ.register();
    }

    protected SubHybrid(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native SubHybrid alloc();

    @Selector("dummy")
    public void dummy() {
        dummyCallCount++;
    }

    @Selector("init")
    public native SubHybrid init();

    @Selector("performDummyOnInstance:")
    public static native void performDummyOnInstance(SubHybrid instance);

    @Selector("performDummyOnTemporalInstance")
    public static native void performDummyOnTemporalInstance();

    @Selector("createAndReleaseTemporalInstance")
    public static native void createAndReleaseTemporalInstance();
}
