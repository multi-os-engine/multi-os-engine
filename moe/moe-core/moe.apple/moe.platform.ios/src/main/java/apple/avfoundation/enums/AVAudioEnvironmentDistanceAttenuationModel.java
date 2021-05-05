/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioEnvironmentDistanceAttenuationModel
 * 
 * Types of distance attenuation models
 * 
 *     Distance attenuation is the natural attenuation of sound when traveling from the source to 
 *     the listener. The different attenuation models listed below describe the drop-off in gain as 
 *     the source moves away from the listener.
 * 
 *     AVAudioEnvironmentDistanceAttenuationModelExponential
 *         distanceGain = (distance / referenceDistance) ^ (-rolloffFactor)
 * 
 *     AVAudioEnvironmentDistanceAttenuationModelInverse
 *         distanceGain = referenceDistance /  (referenceDistance + rolloffFactor *
 *                                             (distance – referenceDistance))
 * 
 *     AVAudioEnvironmentDistanceAttenuationModelLinear
 *         distanceGain = (1 – rolloffFactor * (distance – referenceDistance) /
 *                                             (maximumDistance – referenceDistance))
 * 
 *     With all the distance models, if the formula can not be evaluated then the source will not 
 *     be attenuated. For example, if a linear model is being used with referenceDistance equal 
 *     to maximumDistance, then the gain equation will have a divide-by-zero error in it. In this case,
 *     there is no attenuation for that source.
 * 
 *     All the values for distance are specified in meters.
 */
@Generated
public final class AVAudioEnvironmentDistanceAttenuationModel {
    @Generated @NInt public static final long Exponential = 0x0000000000000001L;
    @Generated @NInt public static final long Inverse = 0x0000000000000002L;
    @Generated @NInt public static final long Linear = 0x0000000000000003L;

    @Generated
    private AVAudioEnvironmentDistanceAttenuationModel() {
    }
}
