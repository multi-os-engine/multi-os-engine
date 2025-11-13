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

/**
 * Your app does not define classes that adopt this protocol; Core Image provides an object of this type
 * when rendering a custom image processor you create with a ``CIImageProcessorKernel`` subclass.
 * 
 * When a `CIImage` containing your `CIImageProcessorKernel` class is rendered, your
 * ``CIImageProcessorKernel/processWithInputs:arguments:output:error:`` class method will be called as
 * needed for that render. The method may be called more than once if Core Image needs to tile to
 * limit memory usage.
 * 
 * When your image processor class method is called, use the provided `CIImageProcessorInput` object to
 * access the image data and supporting information to perform your custom image processing routine.
 * For example, if you process the image using a Metal shader, use the `metalTexture` property to bind the
 * image as an input texture. Or, if you process the image using a CPU-based routine, use the `baseAddress`
 * property to access pixel data in memory.
 * 
 * You should use the input's `region` property to determine which portion of the input image is available
 * to be processed.
 * 
 * To finish setting up or performing your image processing routine, use the provided ``CIImageProcessorOutput``
 * object to return processed pixel data to Core Image.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CIImageProcessorInput")
public interface CIImageProcessorInput {
    /**
     * The base address of CPU memory that your Core Image Processor Kernel can read pixels from.
     * > Warning: This memory must not be modified by the ``CIImageProcessorKernel``.
     */
    @NotNull
    @Generated
    @Selector("baseAddress")
    ConstVoidPtr baseAddress();

    /**
     * The bytes per row of the CPU memory that your Core Image Processor Kernel can read pixelsfrom.
     */
    @Generated
    @Selector("bytesPerRow")
    @NUInt
    long bytesPerRow();

    /**
     * The pixel format of the CPU memory that your Core Image Processor Kernel can read pixels from.
     */
    @Generated
    @Selector("format")
    int format();

    /**
     * A MTLTexture object that can be bound for input using Metal.
     * > Warning: This texture must not be modified by the ``CIImageProcessorKernel``.
     */
    @Nullable
    @Generated
    @Selector("metalTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture metalTexture();

    /**
     * An input pixel buffer object that your Core Image Processor Kernel can read from.
     * > Warning: This buffer must not be modified by the ``CIImageProcessorKernel``.
     */
    @Nullable
    @Generated
    @Selector("pixelBuffer")
    CVBufferRef pixelBuffer();

    /**
     * The rectangular region of the input image that your Core Image Processor Kernel can use to provide the output.
     * > Note: This will contain but may be larger than the rect returned by 'roiCallback'.
     */
    @Generated
    @Selector("region")
    @ByValue
    CGRect region();

    /**
     * An input surface object that your Core Image Processor Kernel can read from.
     * > Warning: This surface must not be modified by the ``CIImageProcessorKernel``.
     */
    @NotNull
    @Generated
    @Selector("surface")
    IOSurfaceRef surface();

    /**
     * A 64-bit digest that uniquely describes the contents of the input to a processor.
     * 
     * This digest will change if the graph of the input changes in any way.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("digest")
    long digest();

    /**
     * This property tells a tiled-input processor how many input tiles will be processed.
     * 
     * This property is only relevant if your processor implements
     * ``/CIImageProcessorKernel/roiTileArrayForInput:arguments:outputRect:``
     * 
     * This can be useful if the processor needs to do work ``CIImageProcessorOutput`` after the last tile is processed.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("roiTileCount")
    @NUInt
    long roiTileCount();

    /**
     * This property tells a tiled-input processor which input tile index is being processed.
     * 
     * This property is only relevant if your processor implements
     * ``/CIImageProcessorKernel/roiTileArrayForInput:arguments:outputRect:``
     * 
     * This can be useful if the processor needs to clear the ``CIImageProcessorOutput`` before the first tile is
     * processed.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("roiTileIndex")
    @NUInt
    long roiTileIndex();
}
