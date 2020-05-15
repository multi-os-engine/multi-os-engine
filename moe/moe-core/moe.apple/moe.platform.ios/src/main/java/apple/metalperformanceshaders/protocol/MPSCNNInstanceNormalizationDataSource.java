package apple.metalperformanceshaders.protocol;

import apple.foundation.NSCoder;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLDevice;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSCNNInstanceNormalizationDataSource")
public interface MPSCNNInstanceNormalizationDataSource extends NSCopying {
    @Generated
    @Selector("beta")
    FloatPtr beta();

    @Generated
    @Owned
    @IsOptional
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("encodeWithCoder:")
    default void encodeWithCoder(NSCoder aCoder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("epsilon")
    default float epsilon() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("gamma")
    FloatPtr gamma();

    @Generated
    @IsOptional
    @Selector("initWithCoder:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object initWithCoder(NSCoder aDecoder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("label")
    String label();

    @Generated
    @IsOptional
    @Selector("load")
    default boolean load_objc() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("numberOfFeatureChannels")
    @NUInt
    long numberOfFeatureChannels();

    @Generated
    @IsOptional
    @Selector("purge")
    default void purge() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("supportsSecureCoding")
    @ProtocolClassMethod("supportsSecureCoding")
    default boolean _supportsSecureCoding() {
        throw new java.lang.UnsupportedOperationException();
    }
}