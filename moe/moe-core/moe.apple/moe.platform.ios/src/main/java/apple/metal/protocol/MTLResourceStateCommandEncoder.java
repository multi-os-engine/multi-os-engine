package apple.metal.protocol;

import apple.metal.struct.MTLRegion;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResourceStateCommandEncoder")
public interface MTLResourceStateCommandEncoder extends MTLCommandEncoder {
    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) Object fence);

    @Generated
    @Selector("updateTextureMapping:mode:indirectBuffer:indirectBufferOffset:")
    void updateTextureMappingModeIndirectBufferIndirectBufferOffset(@Mapped(ObjCObjectMapper.class) Object texture,
            @NUInt long mode, @Mapped(ObjCObjectMapper.class) Object indirectBuffer, @NUInt long indirectBufferOffset);

    @Generated
    @Selector("updateTextureMapping:mode:region:mipLevel:slice:")
    void updateTextureMappingModeRegionMipLevelSlice(@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long mode,
            @ByValue MTLRegion region, @NUInt long mipLevel, @NUInt long slice);

    @Generated
    @Selector("updateTextureMappings:mode:regions:mipLevels:slices:numRegions:")
    void updateTextureMappingsModeRegionsMipLevelsSlicesNumRegions(@Mapped(ObjCObjectMapper.class) Object texture,
            @NUInt long mode, @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion regions,
            ConstNUIntPtr mipLevels, ConstNUIntPtr slices, @NUInt long numRegions);

    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) Object fence);
}