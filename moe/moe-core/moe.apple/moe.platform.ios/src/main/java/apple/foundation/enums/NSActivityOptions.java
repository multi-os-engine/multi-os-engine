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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class NSActivityOptions {
    @Generated
    private NSActivityOptions() {
    }

    @Generated public static final long IdleDisplaySleepDisabled = 0x0000010000000000L;
    @Generated public static final long IdleSystemSleepDisabled = 0x0000000000100000L;
    @Generated public static final long SuddenTerminationDisabled = 0x0000000000004000L;
    @Generated public static final long AutomaticTerminationDisabled = 0x0000000000008000L;
    @Generated public static final long UserInitiated = 0x0000000000FFFFFFL;
    @Generated public static final long UserInitiatedAllowingIdleSystemSleep = 0x0000000000EFFFFFL;
    @Generated public static final long Background = 0x00000000000000FFL;
    @Generated public static final long LatencyCritical = 0x000000FF00000000L;
}
