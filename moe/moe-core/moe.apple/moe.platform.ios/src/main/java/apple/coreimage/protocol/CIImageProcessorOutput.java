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

package apple.coreimage.protocol;

import apple.coregraphics.opaque.IOSurfaceRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLTexture;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CIImageProcessorOutput")
public interface CIImageProcessorOutput {
    /**
     * The base address of the output buffer that the processor block can write output pixels to.
     */
    @NotNull
    @Generated
    @Selector("baseAddress")
    VoidPtr baseAddress();

    /**
     * The bytes per row of the output buffer that the processor block can write to.
     */
    @Generated
    @Selector("bytesPerRow")
    @NUInt
    long bytesPerRow();

    /**
     * The pixel format of the output buffer that the processor block can write to.
     */
    @Generated
    @Selector("format")
    int format();

    /**
     * Returns a MTLCommandBuffer that can be used for encoding commands (if rendering using Metal).
     */
    @Nullable
    @Generated
    @Selector("metalCommandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer metalCommandBuffer();

    /**
     * A MTLTexture object that can be bound as output (if processing using Metal).
     */
    @Nullable
    @Generated
    @Selector("metalTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture metalTexture();

    /**
     * A output CVPixelBuffer that the processor block can write to.
     */
    @Nullable
    @Generated
    @Selector("pixelBuffer")
    CVBufferRef pixelBuffer();

    /**
     * The rectangular region of the output image that the processor block must provide.
     */
    @Generated
    @Selector("region")
    @ByValue
    CGRect region();

    /**
     * An output IOSurface that the processor block can write to.
     */
    @NotNull
    @Generated
    @Selector("surface")
    IOSurfaceRef surface();

    /**
     * A 64-bit digest that uniquely describes the contents of the output of a processor.
     * This digest will change if the graph up to and including the output of the processor changes in any way.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("digest")
    long digest();
}
