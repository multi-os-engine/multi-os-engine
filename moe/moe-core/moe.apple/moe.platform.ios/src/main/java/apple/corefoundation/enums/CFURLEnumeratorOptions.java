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

/**
 * CFURLEnumeratorOptions - Options for controlling enumerator behavior.
 */
@Generated
public final class CFURLEnumeratorOptions {
    /**
     * Use the default behavior for the enumerator.
     */
    @Generated @NUInt public static final long DefaultBehavior = 0x0000000000000000L;
    /**
     * The directory enumerator will recurse ("depth-first") into each subdirectory enumerated
     */
    @Generated @NUInt public static final long DescendRecursively = 0x0000000000000001L;
    /**
     * The directory or volume enumerator skips "hidden" or "invisible" objects
     */
    @Generated @NUInt public static final long SkipInvisibles = 0x0000000000000002L;
    /**
     * The volume enumerator generates file reference URLs
     */
    @Generated @NUInt public static final long GenerateFileReferenceURLs = 0x0000000000000004L;
    /**
     * The directory enumerator skips package directory contents
     */
    @Generated @NUInt public static final long SkipPackageContents = 0x0000000000000008L;
    /**
     * With this option set, a recursive directory enumerator will return directory URLs when CFURLEnumeratorGetNextURL() returns kCFURLEnumeratorSuccess before any of the directory's descendants are visited (pre-order).
     */
    @Generated @NUInt public static final long IncludeDirectoriesPreOrder = 0x0000000000000010L;
    /**
     * With this option set, a recursive directory enumerator will return directory URLs when CFURLEnumeratorGetNextURL() returns kCFURLEnumeratorDirectoryPostOrderSuccess after all of directory's descendants have been visited (post-order).
     */
    @Generated @NUInt public static final long IncludeDirectoriesPostOrder = 0x0000000000000020L;

    @Generated
    private CFURLEnumeratorOptions() {
    }

    /**
     * The directory enumerator always generates file path URLs relative to the directory URL. This can reduce the size of each URL object returned during enumeration.
     */
    @Generated @NUInt public static final long GenerateRelativePathURLs = 0x0000000000000040L;
}
