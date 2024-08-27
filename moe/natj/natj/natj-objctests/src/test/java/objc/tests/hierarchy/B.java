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

package objc.tests.hierarchy;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.objc.ann.Selector;

public class B extends A {
    static {
        NatJ.register();
    }

    @Generated("NatJ")
    @Selector("alloc")
    public static native B alloc();

    @Selector("init")
    public native B init();

    @Generated("NatJ")
    protected B(Pointer peer) {
        super(peer);
    }

    @Override
    @Selector("stringOne")
    public String stringOne() {
        return super.stringOne() + "_B";
    }

    @Override
    @Selector("stringThree")
    public String stringThree() {
        return super.stringThree() + "_B";
    }
}
