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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class CFURLBookmarkCreationOptions {
    /**
     * creates bookmark data with "less" information, which may be smaller but still be able to resolve in certain ways
     */
    @Generated @NUInt public static final long MinimalBookmarkMask = 0x0000000000000200L;
    /**
     * include the properties required by CFURLWriteBookmarkDataToFile() in the bookmark data created
     */
    @Generated @NUInt public static final long SuitableForBookmarkFile = 0x0000000000000400L;
    /**
     * deprecated
     */
    @Deprecated @Generated @NUInt public static final long PreferFileIDResolutionMask = 0x0000000000000100L;

    @Generated
    private CFURLBookmarkCreationOptions() {
    }

    /**
     * Disable automatic embedding of an implicit security scope. The resolving process will not be able gain access to the resource by security scope, either implicitly or explicitly, through the returned URL. Not applicable to security-scoped bookmarks.
     */
    @Generated @NUInt public static final long WithoutImplicitSecurityScope = 0x0000000020000000L;
}
