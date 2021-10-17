package apple.metal.protocol;

import apple.foundation.NSData;
import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLCounterSampleBuffer
 * <p>
 * The Counter Sample Buffer contains opaque counter samples as well
 * as state needed to request a sample from the API.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCounterSampleBuffer")
public interface MTLCounterSampleBuffer {
    /**
     * [@property] device The device that created the sample buffer.  It is only valid
     * to use the sample buffer with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] label The label for the sample buffer.  This is set by the label
     * property of the descriptor that is used to create the sample buffer.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * resolveCounterRange:
     * <p>
     * Resolve the counters from the sample buffer to an NSData containing
     * the counter values.  This may only be used with sample buffers that have
     * MTLStorageModeShared.
     * <p>
     * Samples that encountered an error during resolve will be set to
     * MTLCounterErrorValue.
     *
     * @param range The range of indices in the sample buffer to resolve.
     * @return The resolved samples.
     */
    @Generated
    @Selector("resolveCounterRange:")
    NSData resolveCounterRange(@ByValue NSRange range);

    /**
     * [@property] sampleCount The number of samples that may be stored in this sample buffer.
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    long sampleCount();
}
