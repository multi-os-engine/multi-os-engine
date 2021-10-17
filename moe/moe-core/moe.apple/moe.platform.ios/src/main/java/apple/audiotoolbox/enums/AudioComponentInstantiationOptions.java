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
 * [@enum]       AudioComponentInstantiationOptions
 * <p>
 * Options controlling component instantiation.
 * <p>
 * Most component instances are loaded into the calling process.
 * <p>
 * A version 3 audio unit, however, can be loaded into a separate extension service process,
 * and this is the default behavior for these components. To be able to load one in-process
 * requires that the developer package the audio unit in a bundle separate from the application
 * extension, since an extension's main binary cannot be dynamically loaded into another
 * process.
 * <p>
 * A macOS host may request in-process loading of such audio units using
 * kAudioComponentInstantiation_LoadInProcess.
 * <p>
 * kAudioComponentFlag_IsV3AudioUnit specifies whether an audio unit is implemented using API
 * version 3.
 * <p>
 * These options are just requests to the implementation. It may fail and fall back to the
 * default.
 * [@constant] kAudioComponentInstantiation_LoadOutOfProcess
 * Attempt to load the component into a separate extension process.
 * [@constant] kAudioComponentInstantiation_LoadInProcess
 * Attempt to load the component into the current process. Only available on macOS.
 */
@Generated
public final class AudioComponentInstantiationOptions {
    @Generated
    private AudioComponentInstantiationOptions() {
    }

    @Generated public static final int LoadOutOfProcess = 0x00000001;
    @Generated public static final int LoadedRemotely = 0x80000000;
}
