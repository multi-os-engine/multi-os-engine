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
import apple.metalperformanceshaders.MPSImage;
import apple.metalperformanceshaders.struct.MPSCustomKernelArgumentCount;
import apple.metalperformanceshaders.struct.MPSIntegerDivisionParams;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
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

    @Generated
    @CFunction
    public static native boolean MPSSupportsMTLDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @CVariable()
    @ByValue
    public static native MTLRegion MPSRectNoClip();

    @Generated
    @CFunction
    public static native int MPSGetImageType(MPSImage image);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MPSIntegerDivisionParams MPSFindIntegerDivisionParams(char divisor);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelMaxBatchSize(@ByValue MPSCustomKernelArgumentCount c);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelBatchedDestinationIndex(@ByValue MPSCustomKernelArgumentCount c);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelBatchedSourceIndex(@ByValue MPSCustomKernelArgumentCount c,
            @NUInt long sourceIndex);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelBroadcastSourceIndex(@ByValue MPSCustomKernelArgumentCount c,
            @NUInt long sourceIndex);

    @Generated
    @CFunction
    public static native void MPSHintTemporaryMemoryHighWaterMark(@Mapped(ObjCObjectMapper.class) Object cmdBuf,
            @NUInt long bytes);

    @Generated
    @CFunction
    public static native void MPSSetHeapCacheDuration(@Mapped(ObjCObjectMapper.class) Object cmdBuf, double seconds);

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object MPSGetPreferredDevice(@NUInt long options);

    @Generated public static final long MPSFunctionConstantNone = 0xFFFFFFFFFFFFFFFFL;
}
