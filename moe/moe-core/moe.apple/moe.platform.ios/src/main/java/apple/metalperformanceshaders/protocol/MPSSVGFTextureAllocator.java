package apple.metalperformanceshaders.protocol;

import apple.metal.protocol.MTLTexture;
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
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSSVGFTextureAllocator")
public interface MPSSVGFTextureAllocator {
    @Generated
    @Selector("returnTexture:")
    void returnTexture(@Mapped(ObjCObjectMapper.class) MTLTexture texture);

    @Generated
    @Selector("textureWithPixelFormat:width:height:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture textureWithPixelFormatWidthHeight(@NUInt long pixelFormat, @NUInt long width, @NUInt long height);
}