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
 * [@enum] AudioUnitParameterOptions
 * <p>
 * Bit positions 18, 17, and 16 are set aside for display scales. Bit 19 is reserved.
 * [@constant] kAudioUnitParameterFlag_CFNameRelease
 * [@constant] kAudioUnitParameterFlag_PlotHistory
 * [@constant] kAudioUnitParameterFlag_MeterReadOnly
 * [@constant] kAudioUnitParameterFlag_DisplayMask
 * [@constant] kAudioUnitParameterFlag_DisplaySquareRoot
 * [@constant] kAudioUnitParameterFlag_DisplaySquared
 * [@constant] kAudioUnitParameterFlag_DisplayCubed
 * [@constant] kAudioUnitParameterFlag_DisplayCubeRoot
 * [@constant] kAudioUnitParameterFlag_DisplayExponential
 * [@constant] kAudioUnitParameterFlag_HasClump
 * [@constant] kAudioUnitParameterFlag_ValuesHaveStrings
 * [@constant] kAudioUnitParameterFlag_DisplayLogarithmic
 * [@constant] kAudioUnitParameterFlag_IsHighResolution
 * This flag provides a hint to a host that this parameter should be controlled through the
 * highest resolution if the host has limitations on the control resolution of parameter
 * values. Generally this means that controlling this parameter with a single MIDI Control
 * message (i.e. 128 values) is too course a grain for that parameter, and a finer control
 * resolution should be used if possible. If this flag is not set, then a host can assume that
 * a 7-bit control quantization is acceptable. Ideally, parameters should be controlled in the
 * fullest resolution that they are published with.
 * [@constant] kAudioUnitParameterFlag_NonRealTime
 * Changing the parameter in real-time will cause a glitch or otherwise undesirable effect.
 * [@constant] kAudioUnitParameterFlag_CanRamp
 * If set, the parameter can be ramped.
 * [@constant] kAudioUnitParameterFlag_ExpertMode
 * If set, the parameter is obscure (hint to UI to only display in expert mode).
 * [@constant] kAudioUnitParameterFlag_HasCFNameString
 * In the original ParameterInfo a C string only was specified. With MacOS 10.2 and later, the
 * last four bytes of this string are reserved for a CFStringRef, which gives the ability to
 * used Unicode encoding, necessary for providing a name in languages using non-ASCII
 * characters. If this flag bit is set, the CFStringRef is valid.
 * [@constant] kAudioUnitParameterFlag_IsGlobalMeta
 * If set, changing this parameter may change any number of others in the AudioUnit.
 * [@constant] kAudioUnitParameterFlag_IsElementMeta
 * If set, changing this parameter may change others in the same element as the current
 * parameter.
 * [@constant] kAudioUnitParameterFlag_IsReadable
 * [@constant] kAudioUnitParameterFlag_IsWritable
 */
@Generated
public final class AudioUnitParameterOptions {
    @Generated public static final int CFNameRelease = 0x00000010;
    @Generated public static final int OmitFromPresets = 0x00002000;
    @Generated public static final int PlotHistory = 0x00004000;
    @Generated public static final int MeterReadOnly = 0x00008000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int DisplayMask = 0x00470000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int DisplaySquareRoot = 0x00010000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int DisplaySquared = 0x00020000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int DisplayCubed = 0x00030000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int DisplayCubeRoot = 0x00040000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int DisplayExponential = 0x00050000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int HasClump = 0x00100000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int ValuesHaveStrings = 0x00200000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int DisplayLogarithmic = 0x00400000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int IsHighResolution = 0x00800000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int NonRealTime = 0x01000000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int CanRamp = 0x02000000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int ExpertMode = 0x04000000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int HasCFNameString = 0x08000000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int IsGlobalMeta = 0x10000000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int IsElementMeta = 0x20000000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int IsReadable = 0x40000000;
    /**
     * bit positions 18,17,16 are set aside for display scales. bit 19 is reserved.
     */
    @Generated public static final int IsWritable = 0x80000000;

    @Generated
    private AudioUnitParameterOptions() {
    }
}
