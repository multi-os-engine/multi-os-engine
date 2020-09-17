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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAssetWriterDelegate")
public interface AVAssetWriterDelegate {
    @Generated
    @IsOptional
    @Selector("assetWriter:didOutputSegmentData:segmentType:")
    default void assetWriterDidOutputSegmentDataSegmentType(AVAssetWriter writer, NSData segmentData,
            @NInt long segmentType) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("assetWriter:didOutputSegmentData:segmentType:segmentReport:")
    default void assetWriterDidOutputSegmentDataSegmentTypeSegmentReport(AVAssetWriter writer, NSData segmentData,
            @NInt long segmentType, AVAssetSegmentReport segmentReport) {
        throw new java.lang.UnsupportedOperationException();
    }
}