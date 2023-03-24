package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSSecureCoding;
import apple.metalperformanceshaders.MPSImage;
import apple.metalperformanceshaders.struct.MPSScaleTransform;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSImageTransformProvider")
public interface MPSImageTransformProvider extends NSSecureCoding {
    @Generated
    @Selector("transformForSourceImage:handle:")
    @ByValue
    MPSScaleTransform transformForSourceImageHandle(@NotNull MPSImage image,
            @Nullable @Mapped(ObjCObjectMapper.class) MPSHandle handle);
}