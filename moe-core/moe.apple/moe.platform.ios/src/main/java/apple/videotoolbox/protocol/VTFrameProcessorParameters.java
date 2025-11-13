package apple.videotoolbox.protocol;

import apple.foundation.NSArray;
import apple.videotoolbox.VTFrameProcessorFrame;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The base protocol for input and output processing parameters for a Video Toolbox frame processor implementation.
 * 
 * Pass an instance of a class corresponding to this protocol to `processFrameWithParameters` calls. In async versions
 * of those APIs, the completion handler returns the same instance.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VTFrameProcessorParameters")
public interface VTFrameProcessorParameters {
    /**
     * Destination frame that contains the destination frame for processors which output a single processed frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("destinationFrame")
    @NotNull
    default VTFrameProcessorFrame destinationFrame() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Array of destination frames for processors which may output more than one processed frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("destinationFrames")
    @NotNull
    default NSArray<? extends VTFrameProcessorFrame> destinationFrames() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Use `VTFrameProcessorFrame` that contains the current source frame for all processing features; must be non-null.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sourceFrame")
    @NotNull
    VTFrameProcessorFrame sourceFrame();
}