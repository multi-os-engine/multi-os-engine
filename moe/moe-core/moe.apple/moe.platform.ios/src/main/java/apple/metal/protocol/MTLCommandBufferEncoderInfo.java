package apple.metal.protocol;

import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Provides execution status information for a Metal command encoder.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandBufferEncoderInfo")
public interface MTLCommandBufferEncoderInfo {
    /**
     * The debug signposts inserted into the associated Metal command encoder.
     */
    @Generated
    @Selector("debugSignposts")
    NSArray<String> debugSignposts();

    /**
     * The error state of the associated Metal command encoder.
     */
    @Generated
    @Selector("errorState")
    @NInt
    long errorState();

    /**
     * The debug label given to the associated Metal command encoder at command buffer submission.
     */
    @Generated
    @Selector("label")
    String label();
}