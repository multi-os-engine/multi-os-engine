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

package org.moe.xosrt.binding.test.globalValueTest.TestClasses;

import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;
import apple.NSObject;

public class GlobalVarHandler {

    static
    {
        NatJ.register();
    }

    @CVariable(name = "XRTName", isGetter = true)
    public static native NSObject globalNameXRT();

    @CVariable(name = "XRTVersionPrimitive", isGetter = true)
    public static native long globalPrimitiveVersionXRT();

    @CVariable(name = "XRTVersion", isGetter = true)
    @NFloat
    @Generated
    public static native double  globalVersionXRT();

}
