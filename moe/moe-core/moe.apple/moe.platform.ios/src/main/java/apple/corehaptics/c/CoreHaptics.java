package apple.corehaptics.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreHaptics")
@Runtime(CRuntime.class)
public final class CoreHaptics {
    static {
        NatJ.register();
    }

    @Generated
    private CoreHaptics() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDHapticIntensity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDHapticSharpness();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDAttackTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDDecayTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDReleaseTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDSustained();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDAudioVolume();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDAudioPitch();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDAudioPan();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventParameterIDAudioBrightness();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDHapticIntensityControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDHapticSharpnessControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDHapticAttackTimeControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDHapticDecayTimeControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDHapticReleaseTimeControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDAudioVolumeControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDAudioPanControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDAudioBrightnessControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDAudioPitchControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDAudioAttackTimeControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDAudioDecayTimeControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticDynamicParameterIDAudioReleaseTimeControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventTypeHapticTransient();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventTypeHapticContinuous();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventTypeAudioContinuous();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticEventTypeAudioCustom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyPattern();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyEvent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyEventType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyEventDuration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyEventWaveformPath();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyEventParameters();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyParameter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyParameterID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyParameterValue();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyParameterCurve();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyParameterCurveControlPoints();

    /**
     * [@enum] CHHapticAudioResourceKey
     * <p>
     * Keys used to configure the playback behavior of a custom waveform.
     * [@constant] CHHapticAudioResourceKeyUseVolumeEnvelope
     * Indicates whether the audio file playback should be ramped in and out with an envelope. This can be useful for
     * preventing clicks during playback,
     * or for cases where the application wants to modulate this envelope to use different attack and release times.
     * Value type: boolean. Default is @true.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticAudioResourceKeyUseVolumeEnvelope();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHHapticPatternKeyEventWaveformUseVolumeEnvelope();
}
