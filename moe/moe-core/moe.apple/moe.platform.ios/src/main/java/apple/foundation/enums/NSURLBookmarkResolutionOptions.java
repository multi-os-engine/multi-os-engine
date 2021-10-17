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
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSURLBookmarkResolutionOptions {
    /**
     * don't perform any user interaction during bookmark resolution
     */
    @Generated @NUInt public static final long UI = 0x0000000000000100L;
    /**
     * don't mount a volume during bookmark resolution
     */
    @Generated @NUInt public static final long Mounting = 0x0000000000000200L;

    @Generated
    private NSURLBookmarkResolutionOptions() {
    }

    /**
     * Disable implicitly starting access of the ephemeral security-scoped resource during resolution. Instead, call `-[NSURL startAccessingSecurityScopedResource]` on the returned URL when ready to use the resource. Not applicable to security-scoped bookmarks.
     */
    @Generated @NUInt public static final long ImplicitStartAccessing = 0x0000000000008000L;
}
