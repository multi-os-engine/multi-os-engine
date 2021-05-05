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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 *  assume kAudioUnitParameterUnit_Generic if not found in this enum
 * [@enum]			AudioUnitParameterUnit
 * [@constant]		kAudioUnitParameterUnit_Generic
 * 					untyped value generally between 0.0 and 1.0
 * [@constant]		kAudioUnitParameterUnit_Indexed
 * 					takes an integer value (good for menu selections)
 * [@constant]		kAudioUnitParameterUnit_Boolean
 * 					0.0 means FALSE, non-zero means TRUE
 * [@constant]		kAudioUnitParameterUnit_Percent
 * 					usually from 0 -> 100, sometimes -50 -> +50
 * [@constant]		kAudioUnitParameterUnit_Seconds
 * 					absolute or relative time
 * [@constant]		kAudioUnitParameterUnit_SampleFrames
 * 					one sample frame equals (1.0/sampleRate) seconds
 * [@constant]		kAudioUnitParameterUnit_Phase
 * 					-180 to 180 degrees
 * [@constant]		kAudioUnitParameterUnit_Rate
 * 					rate multiplier, for playback speed, etc. (e.g. 2.0 == twice as fast)
 * [@constant]		kAudioUnitParameterUnit_Hertz
 * 					absolute frequency/pitch in cycles/second
 * [@constant]		kAudioUnitParameterUnit_Cents
 * 					unit of relative pitch
 * [@constant]		kAudioUnitParameterUnit_RelativeSemiTones
 * 					useful for coarse detuning
 * [@constant]		kAudioUnitParameterUnit_MIDINoteNumber
 * 					absolute pitch as defined in the MIDI spec (exact freq may depend on tuning table)
 * [@constant]		kAudioUnitParameterUnit_MIDIController
 * 					a generic MIDI controller value from 0 -> 127
 * [@constant]		kAudioUnitParameterUnit_Decibels
 * 					logarithmic relative gain
 * [@constant]		kAudioUnitParameterUnit_LinearGain
 * 					linear relative gain
 * [@constant]		kAudioUnitParameterUnit_Degrees
 * 					-180 to 180 degrees, similar to phase but more general (good for 3D coord system)
 * [@constant]		kAudioUnitParameterUnit_EqualPowerCrossfade
 * 					0 -> 100, crossfade mix two sources according to sqrt(x) and sqrt(1.0 - x)
 * [@constant]		kAudioUnitParameterUnit_MixerFaderCurve1
 * 					0.0 -> 1.0, pow(x, 3.0) -> linear gain to simulate a reasonable mixer channel fader response
 * [@constant]		kAudioUnitParameterUnit_Pan
 * 					standard left to right mixer pan
 * [@constant]		kAudioUnitParameterUnit_Meters
 * 					distance measured in meters
 * [@constant]		kAudioUnitParameterUnit_AbsoluteCents
 * 					absolute frequency measurement : 
 * 					if f is freq in hertz then absoluteCents = 1200 * log2(f / 440) + 6900
 * [@constant]		kAudioUnitParameterUnit_Octaves
 * 					octaves in relative pitch where a value of 1 is equal to 1200 cents
 * [@constant]		kAudioUnitParameterUnit_BPM
 * 					beats per minute, ie tempo
 *    [@constant]		kAudioUnitParameterUnit_Beats
 * 					time relative to tempo, i.e., 1.0 at 120 BPM would equal 1/2 a second
 * [@constant]		kAudioUnitParameterUnit_Milliseconds
 * 					parameter is expressed in milliseconds
 * [@constant]		kAudioUnitParameterUnit_Ratio
 * 					for compression, expansion ratio, etc.
 * [@constant]		kAudioUnitParameterUnit_CustomUnit
 * 					this is the parameter unit type for parameters that present a custom unit name
 */
@Generated
public final class AudioUnitParameterUnit {
    @Generated public static final int Generic = 0x00000000;
    @Generated public static final int Indexed = 0x00000001;
    @Generated public static final int Boolean = 0x00000002;
    @Generated public static final int Percent = 0x00000003;
    @Generated public static final int Seconds = 0x00000004;
    @Generated public static final int SampleFrames = 0x00000005;
    @Generated public static final int Phase = 0x00000006;
    @Generated public static final int Rate = 0x00000007;
    @Generated public static final int Hertz = 0x00000008;
    @Generated public static final int Cents = 0x00000009;
    @Generated public static final int RelativeSemiTones = 0x0000000A;
    @Generated public static final int MIDINoteNumber = 0x0000000B;
    @Generated public static final int MIDIController = 0x0000000C;
    @Generated public static final int Decibels = 0x0000000D;
    @Generated public static final int LinearGain = 0x0000000E;
    @Generated public static final int Degrees = 0x0000000F;
    @Generated public static final int EqualPowerCrossfade = 0x00000010;
    @Generated public static final int MixerFaderCurve1 = 0x00000011;
    @Generated public static final int Pan = 0x00000012;
    @Generated public static final int Meters = 0x00000013;
    @Generated public static final int AbsoluteCents = 0x00000014;
    @Generated public static final int Octaves = 0x00000015;
    @Generated public static final int BPM = 0x00000016;
    @Generated public static final int Beats = 0x00000017;
    @Generated public static final int Milliseconds = 0x00000018;
    @Generated public static final int Ratio = 0x00000019;
    @Generated public static final int CustomUnit = 0x0000001A;

    @Generated
    private AudioUnitParameterUnit() {
    }
}
