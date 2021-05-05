package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The destination where you want the GPU trace to be captured to.
 */
@Generated
public final class MTLCaptureDestination {
    @Generated
    private MTLCaptureDestination() {
    }

    /**
     * Capture to Developer Tools (Xcode) and stop the execution after capturing.
     */
    @Generated @NInt public static final long DeveloperTools = 0x0000000000000001L;
    /**
     * Capture to a GPU Trace document and continue execution after capturing.
     */
    @Generated @NInt public static final long GPUTraceDocument = 0x0000000000000002L;
}