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
import org.moe.natj.general.ann.NInt;

/**
 * Common error codes (returned only by the older APIs that predate CFError)
 * 
 * API-Since: 2.0
 * Deprecated-Since: 7.0
 * Deprecated-Message: Use CFError codes instead
 */
@Deprecated
@Generated
public final class CFURLError {
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFFFFF6L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long UnknownSchemeError = 0xFFFFFFFFFFFFFFF5L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long ResourceNotFoundError = 0xFFFFFFFFFFFFFFF4L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long ResourceAccessViolationError = 0xFFFFFFFFFFFFFFF3L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long RemoteHostUnavailableError = 0xFFFFFFFFFFFFFFF2L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long ImproperArgumentsError = 0xFFFFFFFFFFFFFFF1L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long UnknownPropertyKeyError = 0xFFFFFFFFFFFFFFF0L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long PropertyKeyUnavailableError = 0xFFFFFFFFFFFFFFEFL;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFError codes instead
     */
    @Deprecated @Generated @NInt public static final long TimeoutError = 0xFFFFFFFFFFFFFFEEL;

    @Generated
    private CFURLError() {
    }
}
