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
import apple.metal.protocol.MTLTexture;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
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
@ObjCProtocolName("CIImageProcessorInput")
public interface CIImageProcessorInput {
    /**
     * The base address of the input buffer that the processor block can read from.
     * This memory must not be modified by the block.
     */
    @NotNull
    @Generated
    @Selector("baseAddress")
    ConstVoidPtr baseAddress();

    /**
     * The bytes per row of the input buffer that the processor block can read from.
     */
    @Generated
    @Selector("bytesPerRow")
    @NUInt
    long bytesPerRow();

    /**
     * The pixel format of the input buffer that the processor block can read from.
     */
    @Generated
    @Selector("format")
    int format();

    /**
     * A MTLTexture object that can be bound as input (if processing using Metal).
     * This texture must not be modified by the block.
     */
    @Nullable
    @Generated
    @Selector("metalTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture metalTexture();

    /**
     * An input CVPixelBuffer that the processor block can read from.
     * This buffer must not be modified by the block.
     */
    @Nullable
    @Generated
    @Selector("pixelBuffer")
    CVBufferRef pixelBuffer();

    /**
     * The rectangular region of the input image that the processor block can use to provide the output.
     * This will be contain (but may be larger than) the rect returned by 'roiCallback'.
     */
    @Generated
    @Selector("region")
    @ByValue
    CGRect region();

    /**
     * An input IOSurface that the processor block can read from.
     * This surface must not be modified by the block.
     */
    @NotNull
    @Generated
    @Selector("surface")
    IOSurfaceRef surface();

    /**
     * A 64-bit digest that uniquely describes the contents of the input to a processor.
     * This digest will change if the graph of the input changes in any way.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("digest")
    long digest();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("roiTileCount")
    @NUInt
    long roiTileCount();

    /**
     * For processors that implement 'roiTileArrayForInput:arguments:outputRect:'
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("roiTileIndex")
    @NUInt
    long roiTileIndex();
}
