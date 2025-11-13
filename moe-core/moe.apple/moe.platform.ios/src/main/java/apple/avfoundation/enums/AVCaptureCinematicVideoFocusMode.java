package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants indicating the focus behavior when recording a Cinematic Video.
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVCaptureCinematicVideoFocusMode {
    @Generated
    private AVCaptureCinematicVideoFocusMode() {
    }

    /**
     * Indicates that no focus mode is specified, in which case weak focus is used as default.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Indicates that the subject should remain in focus until it exits the scene.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Strong = 0x0000000000000001L;
    /**
     * Indicates that the Cinematic Video algorithm should automatically adjust focus according to the prominence of the
     * subjects in the scene.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Weak = 0x0000000000000002L;
}