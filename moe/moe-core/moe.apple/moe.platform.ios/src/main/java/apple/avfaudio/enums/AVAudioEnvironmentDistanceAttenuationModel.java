package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioEnvironmentDistanceAttenuationModel
 * <p>
 * Types of distance attenuation models
 * <p>
 * Distance attenuation is the natural attenuation of sound when traveling from the source to
 * the listener. The different attenuation models listed below describe the drop-off in gain as
 * the source moves away from the listener.
 * <p>
 * AVAudioEnvironmentDistanceAttenuationModelExponential
 * distanceGain = (distance / referenceDistance) ^ (-rolloffFactor)
 * <p>
 * AVAudioEnvironmentDistanceAttenuationModelInverse
 * distanceGain = referenceDistance / (referenceDistance + rolloffFactor *
 * (distance – referenceDistance))
 * <p>
 * AVAudioEnvironmentDistanceAttenuationModelLinear
 * distanceGain = (1 – rolloffFactor * (distance – referenceDistance) /
 * (maximumDistance – referenceDistance))
 * <p>
 * With all the distance models, if the formula can not be evaluated then the source will not
 * be attenuated. For example, if a linear model is being used with referenceDistance equal
 * to maximumDistance, then the gain equation will have a divide-by-zero error in it. In this case,
 * there is no attenuation for that source.
 * <p>
 * All the values for distance are specified in meters.
 */
@Generated
public final class AVAudioEnvironmentDistanceAttenuationModel {
    @Generated
    private AVAudioEnvironmentDistanceAttenuationModel() {
    }

    @Generated @NInt public static final long Exponential = 0x0000000000000001L;
    @Generated @NInt public static final long Inverse = 0x0000000000000002L;
    @Generated @NInt public static final long Linear = 0x0000000000000003L;
}
