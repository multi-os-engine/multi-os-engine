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

/**
 * [@protocol] AVCaptureDepthDataOutputDelegate
 * <p>
 * Defines an interface for delegates of AVCaptureDepthDataOutput to receive captured depth data and be notified of late depth data that were dropped.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureDepthDataOutputDelegate")
public interface AVCaptureDepthDataOutputDelegate {
    /**
     * depthDataOutput:didDropDepthData:timestamp:connection:reason:
     * <p>
     * Called once for each depth data that is discarded.
     * <p>
     * Delegates receive this message whenever a depth data object is dropped. This method is called once for each dropped depth data. The object passed to this delegate method will contain a shell of an AVDepthData that contains no actual depth data backing pixel buffer, as well as a presentation time stamp and a reason for the drop. This method will be called on the dispatch queue specified by the output's delegateCallbackQueue property. Because this method is called on the same dispatch queue that outputs depth data, it must be efficient to prevent further capture performance problems, such as additional drops.
     *
     * @param output     The AVCaptureDepthDataOutput instance that dropped the depth data.
     * @param depthData  A depth data object containing information about the dropped depth, such as its native depth type. This depth data object produces nil CVPixelBuffers for depth / disparity as it has no backing depth map.
     * @param timestamp  A CMTime indicating when the depth data was captured.
     * @param connection The AVCaptureConnection from which the dropped depth data object was received.
     * @param reason     The reason the depth data object was dropped.
     */
    @Generated
    @IsOptional
    @Selector("depthDataOutput:didDropDepthData:timestamp:connection:reason:")
    default void depthDataOutputDidDropDepthDataTimestampConnectionReason(AVCaptureDepthDataOutput output,
            AVDepthData depthData, @ByValue CMTime timestamp, AVCaptureConnection connection, @NInt long reason) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * depthDataOutput:didOutputDepthData:timestamp:connection:
     * <p>
     * Called whenever an AVCaptureDepthDataOutput instance outputs a new depth data object.
     * <p>
     * The delegate receives this message whenever the depth data output captures and outputs a new depth data object. This method is called on the dispatch queue specified by the output's delegateCallbackQueue property. This method is called frequently. Care must be taken to process the depth data quickly in order to prevent dropped depth data.
     * <p>
     * Clients that need to reference the AVDepthData object outside of the scope of this method must retain it and then release it when they are finished with it (in a MRR app).
     * <p>
     * Note that to maintain optimal performance, AVDepthData pixel buffer maps may be backed by a finite memory pool. If AVDepthData objects are held onto for too long, capture inputs will no longer be able to copy new depth data into memory, resulting in droppage. If your application is causing depth data drops by holding on to provided depth data objects for too long, consider copying the pixel buffer map data into a new pixel buffer so that the AVDepthData backing memory can be reused more quickly.
     *
     * @param output     The AVCaptureDepthDataOutput instance vending the depth data.
     * @param depthData  An AVDepthData object containing the depth/disparity data.
     * @param timestamp  A CMTime indicating when the depth data was captured.
     * @param connection The AVCaptureConnection through which the depth data is received.
     */
    @Generated
    @IsOptional
    @Selector("depthDataOutput:didOutputDepthData:timestamp:connection:")
    default void depthDataOutputDidOutputDepthDataTimestampConnection(AVCaptureDepthDataOutput output,
            AVDepthData depthData, @ByValue CMTime timestamp, AVCaptureConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
