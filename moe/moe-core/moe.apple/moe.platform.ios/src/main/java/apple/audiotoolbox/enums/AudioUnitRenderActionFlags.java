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

@Generated
public final class AudioUnitRenderActionFlags {
    @Generated public static final int UnitRenderAction_PreRender = 0x00000004;
    @Generated public static final int UnitRenderAction_PostRender = 0x00000008;
    @Generated public static final int UnitRenderAction_OutputIsSilence = 0x00000010;
    @Generated public static final int OfflineUnitRenderAction_Preflight = 0x00000020;
    @Generated public static final int OfflineUnitRenderAction_Render = 0x00000040;
    @Generated public static final int OfflineUnitRenderAction_Complete = 0x00000080;
    @Generated public static final int UnitRenderAction_PostRenderError = 0x00000100;
    @Generated public static final int UnitRenderAction_DoNotCheckRenderArgs = 0x00000200;

    @Generated
    private AudioUnitRenderActionFlags() {
    }
}
