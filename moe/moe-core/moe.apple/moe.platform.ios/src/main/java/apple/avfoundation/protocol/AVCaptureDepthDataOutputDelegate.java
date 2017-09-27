package apple.avfoundation.protocol;

import apple.avfoundation.AVCaptureConnection;
import apple.avfoundation.AVCaptureDepthDataOutput;
import apple.avfoundation.AVDepthData;
import apple.coremedia.struct.CMTime;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureDepthDataOutputDelegate")
public interface AVCaptureDepthDataOutputDelegate {
    @Generated
    @IsOptional
    @Selector("depthDataOutput:didDropDepthData:timestamp:connection:reason:")
    default void depthDataOutputDidDropDepthDataTimestampConnectionReason(AVCaptureDepthDataOutput output,
            AVDepthData depthData, @ByValue CMTime timestamp, AVCaptureConnection connection, @NInt long reason) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("depthDataOutput:didOutputDepthData:timestamp:connection:")
    default void depthDataOutputDidOutputDepthDataTimestampConnection(AVCaptureDepthDataOutput output,
            AVDepthData depthData, @ByValue CMTime timestamp, AVCaptureConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}