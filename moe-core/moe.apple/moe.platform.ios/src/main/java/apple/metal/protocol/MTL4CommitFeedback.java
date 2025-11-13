package apple.metal.protocol;

import apple.foundation.NSError;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Describes an object containing debug information from Metal to your app after completing a workload.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4CommitFeedback")
public interface MTL4CommitFeedback {
    /**
     * The host time, in seconds, when the GPU finishes execution of the committed command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("GPUEndTime")
    double GPUEndTime();

    /**
     * The host time, in seconds, when the GPU starts execution of the committed command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("GPUStartTime")
    double GPUStartTime();

    /**
     * A description of an error when the GPU encounters an issue as it runs the committed command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("error")
    @Nullable
    NSError error();
}