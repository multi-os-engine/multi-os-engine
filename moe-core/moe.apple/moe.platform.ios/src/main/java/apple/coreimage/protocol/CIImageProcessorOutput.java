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

/**
 * Your app does not define classes that adopt this protocol; Core Image provides an object of this type
 * when rendering a custom image processor you create with a ``CIImageProcessorKernel`` subclass.
 * 
 * When a `CIImage` containing your `CIImageProcessorKernel` class is rendered, your
 * ``CIImageProcessorKernel/processWithInputs:arguments:output:error:`` class method will be called as
 * needed for that render. The method may be called more than once if Core Image needs to tile to
 * limit memory usage.
 * 
 * When your image processor class method is called, use the provided `CIImageProcessorOutput` object to return
 * processed pixel data to Core Image. For example, if you process the image using a Metal shader, bind the
 * `metalTexture`
 * property as an attachment in a render pass or as an output texture in a compute pass. Or, if you process the image
 * using a CPU-based routine, write processed pixel data to memory using the `baseAddress` pointer.
 * 
 * You should use the output's `region` property to determine which portion of the output image needs to be processed.
 * Your code should fill the entirety of the `region`. This includes setting to zero any pixels in the `region` that
 * are outside the extent passed extent `applyWithExtent:inputs:arguments:error:`.
 * 
 * > Important: You must provide rendered output using only one of the following properties of the output:
 * `baseAddress`, `surface`, `pixelBuffer`, `metalTexture`.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CIImageProcessorOutput")
public interface CIImageProcessorOutput {
    /**
     * The base address of CPU memory that your Core Image Processor Kernel can write pixels to.
     */
    @NotNull
    @Generated
    @Selector("baseAddress")
    VoidPtr baseAddress();

    /**
     * The bytes per row of the CPU memory that your Core Image Processor Kernel can write pixels to.
     */
    @Generated
    @Selector("bytesPerRow")
    @NUInt
    long bytesPerRow();

    /**
     * The pixel format of the CPU memory that your Core Image Processor Kernel can write pixels to.
     */
    @Generated
    @Selector("format")
    int format();

    /**
     * Returns a Metal command buffer object that can be used for encoding commands.
     */
    @Nullable
    @Generated
    @Selector("metalCommandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer metalCommandBuffer();

    /**
     * A Metal texture object that can be bound for output using Metal.
     */
    @Nullable
    @Generated
    @Selector("metalTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture metalTexture();

    /**
     * An output pixelBuffer object that your Core Image Processor Kernel can write to.
     */
    @Nullable
    @Generated
    @Selector("pixelBuffer")
    CVBufferRef pixelBuffer();

    /**
     * The rectangular region of the output image that your Core Image Processor Kernel must provide.
     * > Note: This may be different (larger or smaller) than the `extent` that was passed to
     * ``/CIImageProcessorKernel/applyWithExtent:inputs:arguments:error:``.
     */
    @Generated
    @Selector("region")
    @ByValue
    CGRect region();

    /**
     * An output surface object that your Core Image Processor Kernel can write to.
     */
    @NotNull
    @Generated
    @Selector("surface")
    IOSurfaceRef surface();

    /**
     * A 64-bit digest that uniquely describes the contents of the output of a processor.
     * 
     * This digest will change if the graph up to and including the output of the processor changes in any way.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("digest")
    long digest();
}
