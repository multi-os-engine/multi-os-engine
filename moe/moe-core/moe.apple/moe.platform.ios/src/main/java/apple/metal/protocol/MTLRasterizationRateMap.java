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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLRasterizationRateMap")
public interface MTLRasterizationRateMap {
    @Generated
    @Selector("copyParameterDataToBuffer:offset:")
    void copyParameterDataToBufferOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset);

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("layerCount")
    @NUInt
    long layerCount();

    @Generated
    @Selector("mapPhysicalToScreenCoordinates:forLayer:")
    @ByValue
    MTLSamplePosition mapPhysicalToScreenCoordinatesForLayer(@ByValue MTLSamplePosition physicalCoordinates,
            @NUInt long layerIndex);

    @Generated
    @Selector("mapScreenToPhysicalCoordinates:forLayer:")
    @ByValue
    MTLSamplePosition mapScreenToPhysicalCoordinatesForLayer(@ByValue MTLSamplePosition screenCoordinates,
            @NUInt long layerIndex);

    @Generated
    @Selector("parameterBufferSizeAndAlign")
    @ByValue
    MTLSizeAndAlign parameterBufferSizeAndAlign();

    @Generated
    @Selector("physicalGranularity")
    @ByValue
    MTLSize physicalGranularity();

    @Generated
    @Selector("physicalSizeForLayer:")
    @ByValue
    MTLSize physicalSizeForLayer(@NUInt long layerIndex);

    @Generated
    @Selector("screenSize")
    @ByValue
    MTLSize screenSize();
}