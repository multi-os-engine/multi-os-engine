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

package apple.callkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class CXErrorCodeCallDirectoryManagerError {
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NoExtensionFound = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long LoadingInterrupted = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long EntriesOutOfOrder = 0x0000000000000003L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long DuplicateEntries = 0x0000000000000004L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long MaximumEntriesExceeded = 0x0000000000000005L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ExtensionDisabled = 0x0000000000000006L;

    @Generated
    private CXErrorCodeCallDirectoryManagerError() {
    }

    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long CurrentlyLoading = 0x0000000000000007L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long UnexpectedIncrementalRemoval = 0x0000000000000008L;
}
