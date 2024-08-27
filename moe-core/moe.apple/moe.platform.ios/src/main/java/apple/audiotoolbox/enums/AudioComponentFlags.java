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
 * [@enum] AudioComponentFlags
 * 
 * Flags found in AudioComponentDescription.componentFlags.
 * 
 * [@constant] kAudioComponentFlag_Unsearchable
 * 
 * When this bit in AudioComponentDescription's componentFlags is set, AudioComponentFindNext
 * will only return this component when performing a specific, non-wildcard search for the
 * component, i.e. with non-zero values of componentType, componentSubType, and
 * componentManufacturer. This can be useful when privately registering a component.
 * 
 * [@constant] kAudioComponentFlag_SandboxSafe
 * 
 * An AudioComponent sets this bit in its componentFlags to indicate to the system that the
 * AudioComponent is safe to open in a sandboxed process.
 * 
 * [@constant] kAudioComponentFlag_IsV3AudioUnit
 * 
 * The system sets this flag automatically when registering components which implement a version 3
 * Audio Unit.
 * 
 * [@constant] kAudioComponentFlag_RequiresAsyncInstantiation
 * 
 * The system sets this flag automatically when registering components which require asynchronous
 * instantiation via AudioComponentInstantiate (v3 audio units with views).
 * 
 * [@constant] kAudioComponentFlag_CanLoadInProcess
 * 
 * The system sets this flag automatically when registering components which can be loaded into
 * the current process. This is always true for V2 audio units; it depends on the packaging
 * in the case of a V3 audio unit.
 */
@Generated
public final class AudioComponentFlags {
    /**
     * API-Since: 5.0
     */
    @Generated public static final int Unsearchable = 0x00000001;
    /**
     * API-Since: 6.0
     */
    @Generated public static final int SandboxSafe = 0x00000002;
    /**
     * API-Since: 9.0
     */
    @Generated public static final int IsV3AudioUnit = 0x00000004;
    /**
     * API-Since: 9.0
     */
    @Generated public static final int RequiresAsyncInstantiation = 0x00000008;
    /**
     * API-Since: 9.0
     */
    @Generated public static final int CanLoadInProcess = 0x00000010;

    @Generated
    private AudioComponentFlags() {
    }
}
