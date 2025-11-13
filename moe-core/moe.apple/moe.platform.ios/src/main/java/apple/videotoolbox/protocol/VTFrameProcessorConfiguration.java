package apple.videotoolbox.protocol;

import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSNumber;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

/**
 * The protocol that describes the configuration of a processor for a video frame processing session.
 * 
 * Use `VTFrameProcessorConfiguration` protocol conformance to start a frame processing session. You can query these
 * properties on an implementation conforming to `VTFrameProcessorConfiguration` without starting a session.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VTFrameProcessorConfiguration")
public interface VTFrameProcessorConfiguration {
    /**
     * Pixel buffer attributes dictionary that describes requirements for pixel buffers which represent destination
     * frames.
     * 
     * Use ``CVPixelBufferCreateResolvedAttributesDictionary`` to combine this dictionary with your pixel buffer
     * attributes dictionary.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("destinationPixelBufferAttributes")
    @NotNull
    NSDictionary<String, ?> destinationPixelBufferAttributes();

    /**
     * List of supported pixel formats for source frames for the current configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("frameSupportedPixelFormats")
    @NotNull
    NSArray<? extends NSNumber> frameSupportedPixelFormats();

    /**
     * Returns a Boolean indicating whether the system supports this processor on the current configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isSupported")
    @ProtocolClassMethod("isSupported")
    boolean _isSupported();

    /**
     * Returns the maximum dimensions for a `sourceFrame` for the processor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("maximumDimensions")
    @ProtocolClassMethod("maximumDimensions")
    @ByValue
    default CMVideoDimensions _maximumDimensions() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the minimum dimensions for a `sourceFrame` for the processor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("minimumDimensions")
    @ProtocolClassMethod("minimumDimensions")
    @ByValue
    default CMVideoDimensions _minimumDimensions() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the number of "next" frames that this processor requires for processing.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("nextFrameCount")
    @NInt
    default long nextFrameCount() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the number of "previous" frames that this processor requires for processing.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("previousFrameCount")
    @NInt
    default long previousFrameCount() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Pixel buffer attributes dictionary that describes requirements for pixel buffers which represent source frames
     * and reference frames.
     * 
     * Use ``CVPixelBufferCreateResolvedAttributesDictionary`` to combine this dictionary with your pixel buffer
     * attributes dictionary.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sourcePixelBufferAttributes")
    @NotNull
    NSDictionary<String, ?> sourcePixelBufferAttributes();
}