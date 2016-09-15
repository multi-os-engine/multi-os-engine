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

package apple.audiounit.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class AudioUnitParameterOptions {
    @Generated
    private AudioUnitParameterOptions() {
    }

    @Generated public static final int CFNameRelease = 0x00000010;
    @Generated public static final int OmitFromPresets = 0x00002000;
    @Generated public static final int PlotHistory = 0x00004000;
    @Generated public static final int MeterReadOnly = 0x00008000;
    @Generated public static final int DisplayMask = 0x00470000;
    @Generated public static final int DisplaySquareRoot = 0x00010000;
    @Generated public static final int DisplaySquared = 0x00020000;
    @Generated public static final int DisplayCubed = 0x00030000;
    @Generated public static final int DisplayCubeRoot = 0x00040000;
    @Generated public static final int DisplayExponential = 0x00050000;
    @Generated public static final int HasClump = 0x00100000;
    @Generated public static final int ValuesHaveStrings = 0x00200000;
    @Generated public static final int DisplayLogarithmic = 0x00400000;
    @Generated public static final int IsHighResolution = 0x00800000;
    @Generated public static final int NonRealTime = 0x01000000;
    @Generated public static final int CanRamp = 0x02000000;
    @Generated public static final int ExpertMode = 0x04000000;
    @Generated public static final int HasCFNameString = 0x08000000;
    @Generated public static final int IsGlobalMeta = 0x10000000;
    @Generated public static final int IsElementMeta = 0x20000000;
    @Generated public static final int IsReadable = 0x40000000;
    @Generated public static final int IsWritable = 0x80000000;
}
