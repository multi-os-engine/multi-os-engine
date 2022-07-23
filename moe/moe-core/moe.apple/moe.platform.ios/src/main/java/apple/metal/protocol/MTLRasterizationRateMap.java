package apple.metal.protocol;

import apple.metal.struct.MTLSamplePosition;
import apple.metal.struct.MTLSize;
import apple.metal.struct.MTLSizeAndAlign;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLRasterizationRateMap
 * <p>
 * Compiled read-only object that determines how variable rasterization rate is applied when rendering.
 * <p>
 * A variable rasterization rate map is compiled by MTLDevice from a MTLRasterizationRateMapDescriptor containing one or
 * more MTLRasterizationRateLayerDescriptor.
 * During compilation, the quality samples provided in the MTLRasterizationRateLayerDescriptor may be rounded up to the
 * nearest supported value or granularity, depending on hardware support.
 * However, the compilation will never round values down, so the actual rasterization will always happen at a quality
 * level matching or exceeding the provided quality samples.
 * During rasterization using the MTLRasterizationRateMap the screen space rendering is stored in a smaller area of the
 * framebuffer, such that lower quality regions will not occupy as many texels as higher quality regions.
 * The quality will never exceed 1:1 in any region of screen space.
 * Because a smaller area of the framebuffer is populated, less fragment shader invocations are required to render
 * content, and less bandwidth is consumed to store the shaded values.
 * Use a rasterization rate map to reduce rendering quality in less-important or less-sampled regions of the
 * framebuffer, such as the periphery of a VR/AR display or a far-away cascade of a shadow map.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLRasterizationRateMap")
public interface MTLRasterizationRateMap {
    /**
     * copyParameterDataToBuffer:offset:
     * <p>
     * Copy the parameter data into the provided buffer at the provided offset.
     * <p>
     * The buffer must have storageMode MTLStorageModeShared, and a size of at least parameterBufferSizeAndAlign.size +
     * offset.
     * The specified offset must be a multiple of parameterBufferSize.align.
     * The buffer can be bound to a shader stage to map screen space to physical fragment space, or vice versa.
     */
    @Generated
    @Selector("copyParameterDataToBuffer:offset:")
    void copyParameterDataToBufferOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset);

    /**
     * [@property] device
     *
     * @return The device on which the rasterization rate map was created
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * [@property] layerCount
     * <p>
     * Different render-target layers may target different variable rasterization configurations.
     * The rasterization rate layer for a primitive is selected on the [[render_target_layer_index]].
     *
     * @return The number of different configured layers in the rasterization map.
     */
    @Generated
    @Selector("layerCount")
    @NUInt
    long layerCount();

    /**
     * mapPhysicalToScreenCoordinates:forLayer:
     * <p>
     * Computes where an offset relative to the top-left of the framebuffer, in physical pixels, would end up in screen
     * space, in screen space pixels.
     * The returned value is greater-or-equal the input value because the rasterization quality never exceeds 1:1 in any
     * region.
     */
    @Generated
    @Selector("mapPhysicalToScreenCoordinates:forLayer:")
    @ByValue
    MTLSamplePosition mapPhysicalToScreenCoordinatesForLayer(@ByValue MTLSamplePosition physicalCoordinates,
            @NUInt long layerIndex);

    /**
     * mapScreenToPhysicalCoordinates:forLayer:
     * <p>
     * Computes where an offset relative to the top-left of screen space, in screen space pixels, would end up in the
     * framebuffer, in physical fragments.
     * The returned value is less-or-equal the input value because the rasterization quality never exceeds 1:1 in any
     * region.
     */
    @Generated
    @Selector("mapScreenToPhysicalCoordinates:forLayer:")
    @ByValue
    MTLSamplePosition mapScreenToPhysicalCoordinatesForLayer(@ByValue MTLSamplePosition screenCoordinates,
            @NUInt long layerIndex);

    /**
     * [@property] parameterBufferSizeAndAlign
     * <p>
     * Returns the size and alignment requirements of the parameter buffer for this rate map.
     * <p>
     * The parameter data can be copied into a buffer with this size and alignment using
     * copyParameterDataToBuffer:offset:
     */
    @Generated
    @Selector("parameterBufferSizeAndAlign")
    @ByValue
    MTLSizeAndAlign parameterBufferSizeAndAlign();

    /**
     * [@property] physicalGranularity
     * <p>
     * Rendering algorithms that use binning or tiling in screen space may want to determine the screen space bin size
     * using this value.
     * The depth component of the returned MTLSize is always 0.
     *
     * @return The granularity, in physical pixels, at which variable rasterization rate varies.
     */
    @Generated
    @Selector("physicalGranularity")
    @ByValue
    MTLSize physicalGranularity();

    /**
     * getPhysicalSizeForLayer:
     * <p>
     * The dimensions, in physical fragments, of the area in the render target where variable rasterization is applied
     * <p>
     * Different configured layers may have a different rasterization rate and may have different size after rendering.
     * The rasterization rate layer for a primitive is selected on the [[render_target_layer_index]].
     */
    @Generated
    @Selector("physicalSizeForLayer:")
    @ByValue
    MTLSize physicalSizeForLayer(@NUInt long layerIndex);

    /**
     * [@property] screenSize
     * <p>
     * The region always has its origin at [0, 0].
     * The depth component of the returned MTLSize is always 0.
     *
     * @return The dimensions, in screen space pixels, of the region where variable rasterization is applied.
     */
    @Generated
    @Selector("screenSize")
    @ByValue
    MTLSize screenSize();
}
