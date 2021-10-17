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

/**
 * [@protocol]   MPSCNNGroupNormalizationDataSource
 * <p>
 * The MPSCNNGroupNormalizationDataSource protocol declares the methods that an
 * group of MPSCNNGroupNormalization uses to initialize the
 * scale factors (gamma) and bias terms (beta).
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSCNNGroupNormalizationDataSource")
public interface MPSCNNGroupNormalizationDataSource extends NSCopying {
    /**
     * Return a pointer to an array containing the beta terms.
     * <p>
     * Must have numberOfFeatureChannels values since scaling is done per feature channel.
     */
    @Generated
    @Selector("beta")
    FloatPtr beta();

    /**
     * Optional copy method to create a copy of the data source for use with a new device.
     *
     * @param zone   The NSZone on which to allocate.
     * @param device The device where the kernel which uses this data source will be used.
     * @return A pointer to a copy of this data source.
     */
    @Generated
    @Owned
    @IsOptional
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Optional NSSecureCoding compatibility.
     */
    @Generated
    @IsOptional
    @Selector("encodeWithCoder:")
    default void encodeWithCoder(NSCoder aCoder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An optional tiny number to use to maintain numerical stability.
     * <p>
     * output_image = (input_image - mean[c]) * gamma[c] / sqrt(variance[c] + epsilon) + beta[c];
     * Defalt value if method unavailable: FLT_MIN
     */
    @Generated
    @IsOptional
    @Selector("epsilon")
    default float epsilon() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return a pointer to an array containing the gamma terms.
     * <p>
     * Must have numberOfFeatureChannels values since scaling is done per feature channel.
     */
    @Generated
    @Selector("gamma")
    FloatPtr gamma();

    /**
     * NS_DESIGNATED_INITIALIZER
     */
    @Generated
    @IsOptional
    @Selector("initWithCoder:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object initWithCoder(NSCoder aDecoder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A label that is transferred to the group normalization filter at init time
     * <p>
     * Overridden by a MPSCNNGroupNormalizationNode.label if it is non-nil.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * [@property]   The number of feature channels that are normalized.
     */
    @Generated
    @Selector("numberOfFeatureChannels")
    @NUInt
    long numberOfFeatureChannels();

    /**
     * [@property]   The number of groups used.
     * <p>
     * numberOfFeatureChannels/numberOfGroups channels are normalized together.
     */
    @Generated
    @Selector("numberOfGroups")
    @NUInt
    long numberOfGroups();

    /**
     * [@property]   The number of groups used.
     * <p>
     * numberOfFeatureChannels/numberOfGroups channels are normalized together.
     */
    @Generated
    @Selector("setNumberOfGroups:")
    void setNumberOfGroups(@NUInt long value);

    @Generated
    @IsOptional
    @Selector("supportsSecureCoding")
    @ProtocolClassMethod("supportsSecureCoding")
    default boolean _supportsSecureCoding() {
        throw new java.lang.UnsupportedOperationException();
    }
}
