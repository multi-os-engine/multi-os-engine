package apple.avkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVVideoFrameAnalysisType
 * 
 * The types of items that AVPlayerViewController analyzes in a paused video frame.
 * 
 * [@constant] AVVideoFrameAnalysisTypeNone
 * Defines no items to be analyzed by the analyzer.
 * [@constant] AVVideoFrameAnalysisTypeDefault
 * Defines the default set of analysis types.
 * 
 * [@constant] AVVideoFrameAnalysisTypeText
 * Text that appears in a paused video frame.
 * [@constant] AVVideoFrameAnalysisTypeSubject
 * Subject that the user can copy out of frame.
 * [@constant] AVVideoFrameAnalysisTypeVisualSearch
 * Objects, landmarks, art, etc. recognized visually in a paused video frame.
 * [@constant] AVVideoFrameAnalysisTypeMachineReadableCode
 * Machine-readable codes, such as QR codes, that appear in a paused video frame.
 * 
 * API-Since: 17.0
 */
@Generated
public final class AVVideoFrameAnalysisType {
    @Generated
    private AVVideoFrameAnalysisType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Text = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Subject = 0x0000000000000004L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VisualSearch = 0x0000000000000008L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long MachineReadableCode = 0x0000000000000010L;
}