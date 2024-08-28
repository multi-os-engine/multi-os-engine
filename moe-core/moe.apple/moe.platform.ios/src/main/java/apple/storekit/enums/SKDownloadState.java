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

package apple.storekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 6.0
 * Deprecated-Since: 16.0
 * Deprecated-Message: Hosted content is no longer supported
 */
@Deprecated
@Generated
public final class SKDownloadState {
    /**
     * Download is inactive, waiting to be downloaded
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated @Generated @NInt public static final long Waiting = 0x0000000000000000L;
    /**
     * Download is actively downloading
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated @Generated @NInt public static final long Active = 0x0000000000000001L;
    /**
     * Download was paused by the user
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated @Generated @NInt public static final long Paused = 0x0000000000000002L;
    /**
     * Download is finished, content is available
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated @Generated @NInt public static final long Finished = 0x0000000000000003L;
    /**
     * Download failed
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated @Generated @NInt public static final long Failed = 0x0000000000000004L;
    /**
     * Download was cancelled
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated @Generated @NInt public static final long Cancelled = 0x0000000000000005L;

    @Generated
    private SKDownloadState() {
    }
}
