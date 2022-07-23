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
 * [@enum] AudioUnitRenderActionFlags
 * <p>
 * These flags can be set in a callback from an audio unit during an audio unit
 * render operation from either the RenderNotify Proc or the render input
 * callback.
 * <p>
 * [@constant] kAudioUnitRenderAction_PreRender
 * Called on a render notification Proc - which is called either before or after
 * the render operation of the audio unit. If this flag is set, the proc is being
 * called before the render operation is performed.
 * <p>
 * [@constant] kAudioUnitRenderAction_PostRender
 * Called on a render notification Proc - which is called either before or after
 * the render operation of the audio unit. If this flag is set, the proc is being
 * called after the render operation is completed.
 * <p>
 * [@constant] kAudioUnitRenderAction_OutputIsSilence
 * The originator of a buffer, in a render input callback, or in an audio unit's
 * render operation, may use this flag to indicate that the buffer contains
 * only silence.
 * <p>
 * The receiver of the buffer can then use the flag as a hint as to whether the
 * buffer needs to be processed or not.
 * <p>
 * Note that because the flag is only a hint, when setting the silence flag,
 * the originator of a buffer must also ensure that it contains silence (zeroes).
 * <p>
 * [@constant] kAudioOfflineUnitRenderAction_Preflight
 * This is used with offline audio units (of type 'auol'). It is used when an
 * offline unit is being preflighted, which is performed prior to the actual
 * offline rendering actions are performed. It is used for those cases where the
 * offline process needs it (for example, with an offline unit that normalises an
 * audio file, it needs to see all of the audio data first before it can perform
 * its normalization)
 * <p>
 * [@constant] kAudioOfflineUnitRenderAction_Render
 * Once an offline unit has been successfully preflighted, it is then put into
 * its render mode. So this flag is set to indicate to the audio unit that it is
 * now in that state and that it should perform its processing on the input data.
 * <p>
 * [@constant] kAudioOfflineUnitRenderAction_Complete
 * This flag is set when an offline unit has completed either its preflight or
 * performed render operations
 * <p>
 * [@constant] kAudioUnitRenderAction_PostRenderError
 * If this flag is set on the post-render call an error was returned by the
 * AUs render operation. In this case, the error can be retrieved through the
 * lastRenderError property and the audio data in ioData handed to the post-render
 * notification will be invalid.
 * [@constant] kAudioUnitRenderAction_DoNotCheckRenderArgs
 * If this flag is set, then checks that are done on the arguments provided to render
 * are not performed. This can be useful to use to save computation time in
 * situations where you are sure you are providing the correct arguments
 * and structures to the various render calls
 */
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
