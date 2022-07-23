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
public final class NSDirectoryEnumerationOptions {
    @Generated
    private NSDirectoryEnumerationOptions() {
    }

    /**
     * NSDirectoryEnumerationSkipsSubdirectoryDescendants causes the NSDirectoryEnumerator to perform a shallow
     * enumeration and not descend into directories it encounters.
     */
    @Generated @NUInt public static final long SkipsSubdirectoryDescendants = 0x0000000000000001L;
    /**
     * NSDirectoryEnumerationSkipsPackageDescendants will cause the NSDirectoryEnumerator to not descend into packages.
     */
    @Generated @NUInt public static final long SkipsPackageDescendants = 0x0000000000000002L;
    /**
     * NSDirectoryEnumerationSkipsHiddenFiles causes the NSDirectoryEnumerator to not enumerate hidden files.
     */
    @Generated @NUInt public static final long SkipsHiddenFiles = 0x0000000000000004L;
    /**
     * NSDirectoryEnumerationIncludesDirectoriesPostOrder causes the NSDirectoryEnumerator to enumerate each directory a
     * second time after all of its contained files have been enumerated. Use
     * NSDirectoryEnumerator.isEnumeratingDirectoryPostOrder to differentiate a post-order enumerated directory from a
     * pre-order one.
     */
    @Generated @NUInt public static final long IncludesDirectoriesPostOrder = 0x0000000000000008L;
    /**
     * NSDirectoryEnumerationProducesRelativePathURLs causes the NSDirectoryEnumerator to always produce file path URLs
     * relative to the directoryURL. This can reduce the size of each URL object returned during enumeration.
     */
    @Generated @NUInt public static final long ProducesRelativePathURLs = 0x0000000000000010L;
}
