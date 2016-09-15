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

package apple.metalperformanceshaders.c;

import apple.metal.struct.MTLRegion;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(CRuntime.class)
public final class MetalPerformanceShaders {
    static {
        NatJ.register();
    }

    @Generated
    private MetalPerformanceShaders() {
    }

    /**
     * MPSSupportsMTLDevice</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSFunctions/index.html#//apple_ref/c/func/MPSSupportsMTLDevice">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean MPSSupportsMTLDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @CVariable()
    @ByValue
    public static native MTLRegion MPSRectNoClip();
}
