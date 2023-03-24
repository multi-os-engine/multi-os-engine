package apple.avfoundation.protocol;

import apple.avfoundation.AVAssetSegmentReport;
import apple.avfoundation.AVAssetWriter;
import apple.foundation.NSData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAssetWriterDelegate")
public interface AVAssetWriterDelegate {
    /**
     * assetWriter:didOutputSegmentData:segmentType:
     * 
     * A method invoked when a segment data is output.
     * 
     * The usage of this method is same as -assetWriter:didOutputSegmentData:segmentType:segmentReport: except that this
     * method does not deliver AVAssetSegmentReport.
     * 
     * If clients implement the -assetWriter:didOutputSegmentData:segmentType:segmentReport: method, that method is
     * called instead of this one.
     * 
     * @param writer
     *                    An AVAssetWriter instance.
     * @param segmentData
     *                    An instance of NSData containing a segment data.
     * @param segmentType
     *                    A segment type of the segment data. Segment types are declared in AVAssetSegmentReport.h.
     */
    @Generated
    @IsOptional
    @Selector("assetWriter:didOutputSegmentData:segmentType:")
    default void assetWriterDidOutputSegmentDataSegmentType(@NotNull AVAssetWriter writer, @NotNull NSData segmentData,
            @NInt long segmentType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * assetWriter:didOutputSegmentData:segmentType:segmentReport:
     * 
     * A method invoked when a segment data is output.
     * 
     * If this method is implemented, normal file writing will be suppressed. The instance of AVAssetWriter must be
     * initialized by -initWithContentType: initializer.
     * Then, clients append media data to AVAssetWriterInputs added to the receiver, call -markAsFinished for each input
     * to mark the input as finished and call -finishWritingWithCompletionHandler: to finish writing as is the case in
     * normal file writing.
     * 
     * Do not use the movieFragmentInterval or shouldOptimizeForNetworkUse properties, as these properties are ignored
     * in this mode of operation.
     * 
     * Clients that need to reference the NSData outside of the scope of this method must retain or copy it and then
     * release it when they are finished with it.
     * 
     * The segmentReport provides information on the segment data. If there is no information available to report, the
     * segmentReport may be nil.
     * Clients that do not need information on consecutive segment data should implement the
     * -assetWriter:didOutputSegmentData:segmentType: method instead of this one for greater efficiency, as this will
     * signal the receiver to skip the preparation of segment reports.
     * See more detailed description of AVAssetSegmentReport in AVAssetSegmentReport.h.
     * 
     * If the file type is AVFileTypeMPEG4 and the outputFileTypeProfile is AVFileTypeProfileMPEG4AppleHLS or
     * AVFileTypeProfileMPEG4CMAFCompliant, when the segmentType is AVAssetSegmentTypeInitialization, the segment
     * contains a 'moov' atom that does not contain any sample tables other than the sample descriptions, and is
     * suitable for use as an initialization segment for the following segment data sequences.
     * When the segmentType is AVAssetSegmentTypeSeparable, the segment contains a 'moof' atom that contains one 'moof'
     * atom followed by one 'mdat' atom.
     * 
     * 1. If the value of preferredOutputSegmentInterval property is positive numeric, when (a sample's output PTS -
     * InitialSegmentStartTime) >= (interval * N) (N = 1, 2, 3...), the receiver waits for next sync sample and outputs
     * a segment data that includes all samples appended since the previous interval to the delegate method when the
     * sync sample appears, so that the next segment can start with the sync sample.
     * In this configuration, passthrough (by passing nil to output settings for AVAssetWriterInputs) and compression
     * are available. The media type of input can be AVMediaTypeVideo or AVMediaTypeAudio.
     * Only one input of each media type can be added for compression and when (a sample's PTS -
     * InitialSegmentStartTime) >= (interval * N) (N = 1, 2, 3...), the sample will be forced to be encoded as sync
     * sample so that the current segment will be closed immediately.
     * For passthrough, only one input can be added.
     * 
     * 2. If the value of preferredOutputSegmentInterval property is kCMTimeIndefinite, every time a client calls
     * -flushSegment the receiver outputs a segment data that includes all samples appended since the previous call to
     * the delegate method.
     * The delegate method may be called asynchronously, on a different thread from the one that calls -flushSegment.
     * In this configuration, only passthrough is available. The media type of input can be AVMediaTypeVideo or
     * AVMediaTypeAudio.
     * Only one input of each media type can be added.
     * The client should call -flushSegment prior to a sync sample so that the next segment can start with the sync
     * sample. Otherwise, it is an error.
     * 
     * @param writer
     *                      An AVAssetWriter instance.
     * @param segmentData
     *                      An instance of NSData containing a segment data.
     * @param segmentType
     *                      A segment type of the segment data. Segment types are declared in AVAssetSegmentReport.h.
     * @param segmentReport
     *                      An AVAssetSegmentReport instance.
     */
    @Generated
    @IsOptional
    @Selector("assetWriter:didOutputSegmentData:segmentType:segmentReport:")
    default void assetWriterDidOutputSegmentDataSegmentTypeSegmentReport(@NotNull AVAssetWriter writer,
            @NotNull NSData segmentData, @NInt long segmentType, @Nullable AVAssetSegmentReport segmentReport) {
        throw new java.lang.UnsupportedOperationException();
    }
}
