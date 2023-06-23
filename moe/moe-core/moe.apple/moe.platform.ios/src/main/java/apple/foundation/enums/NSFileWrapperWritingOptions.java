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

/**
 * API-Since: 4.0
 */
@Generated
public final class NSFileWrapperWritingOptions {
    /**
     * Whether writing is done atomically. You can use this option to ensure that when overwriting a file package the
     * overwriting either completely succeeds or completely fails, with no possibility of leaving the file package in an
     * inconsistent state. Because this option causes additional I/O you shouldn't use it unnecessarily. For example, on
     * Mac OS X you wouldn't use this option in an override of -[NSDocument writeToURL:ofType:error:] because
     * NSDocument's implementation of safe saving already does atomic writing.
     * 
     * API-Since: 4.0
     */
    @Generated @NUInt public static final long Atomic = 0x0000000000000001L;
    /**
     * Whether descendant file wrappers are sent -setFilename: if the writing succeeds. This is necessary when your
     * application passes original contents URLs to -writeToURL:options:originalContentsURL:error:. Without using this
     * and reusing child file wrappers properly subsequent invocations of -writeToURL:options:originalContentsURL:error:
     * wouldn't be able to reliably create hard links in a new file package for performance because the record of names
     * in the old file package would be out of date.
     * 
     * API-Since: 4.0
     */
    @Generated @NUInt public static final long WithNameUpdating = 0x0000000000000002L;

    @Generated
    private NSFileWrapperWritingOptions() {
    }
}
