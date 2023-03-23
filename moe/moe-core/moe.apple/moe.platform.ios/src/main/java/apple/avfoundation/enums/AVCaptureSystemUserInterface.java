package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureSystemUserInterface
 * 
 * Constants describing the system user interfaces available to +showSystemUserInterface:.
 * 
 * [@constant] AVCaptureSystemUserInterfaceVideoEffects
 * Indicates the system UI for enabling / disabling video effects.
 * [@constant] AVCaptureSystemUserInterfaceMicrophoneModes
 * Indicates the system UI for selecting microphone modes.
 * 
 * API-Since: 15.0
 */
@Generated
public final class AVCaptureSystemUserInterface {
    @Generated
    private AVCaptureSystemUserInterface() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long VideoEffects = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long MicrophoneModes = 0x0000000000000002L;
}
