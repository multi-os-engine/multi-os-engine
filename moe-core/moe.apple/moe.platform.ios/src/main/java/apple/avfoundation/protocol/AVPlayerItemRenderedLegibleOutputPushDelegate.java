package apple.avfoundation.protocol;

import apple.avfoundation.AVPlayerItemRenderedLegibleOutput;
import apple.avfoundation.AVRenderedCaptionImage;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVPlayerItemRenderedLegibleOutputPushDelegate
 * 
 * Extends AVPlayerItemOutputPushDelegate to provide additional methods specific to pixel buffers output.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerItemRenderedLegibleOutputPushDelegate")
public interface AVPlayerItemRenderedLegibleOutputPushDelegate extends AVPlayerItemOutputPushDelegate {
    /**
     * renderedLegibleOutput:didOutputRenderedCaptionImages:forItemTime:
     * 
     * A delegate callback that delivers new rendered caption images
     * 
     * @param output
     *                      The AVPlayerItemRenderedLegibleOutput source.
     * @param captionImages
     *                      An NSArray of AVRenderedCaptionImage(s), consisting of a CVPixelBufferRef and its associated
     *                      position (in pixels) relative to the video frame
     * @param itemTime
     *                      The item time at which the caption images should be presented.
     * 
     * 
     *                      API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("renderedLegibleOutput:didOutputRenderedCaptionImages:forItemTime:")
    default void renderedLegibleOutputDidOutputRenderedCaptionImagesForItemTime(
            @NotNull AVPlayerItemRenderedLegibleOutput output,
            @NotNull NSArray<? extends AVRenderedCaptionImage> captionImages, @ByValue CMTime itemTime) {
        throw new java.lang.UnsupportedOperationException();
    }
}