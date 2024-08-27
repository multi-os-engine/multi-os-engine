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
import objc.binding.CustomClassA;

public class A extends CustomClassA {
    static {
        NatJ.register();
    }

    @Generated("NatJ")
    @Selector("alloc")
    public static native A alloc();

    @Selector("init")
    public native A init();

    @Generated("NatJ")
    protected A(Pointer peer) {
        super(peer);
    }

    public int javaMethod() {
        return 0xF413;
    }

    @Selector("javaMethodWithSelector")
    public int javaMethodWithSelector() {
        return 0xF856;
    }

    @Override
    @Selector("stringOne")
    public String stringOne() {
        return super.stringOne() + "_A";
    }

    @Override
    @Selector("stringTwo")
    public String stringTwo() {
        return super.stringTwo() + "_A";
    }
}
