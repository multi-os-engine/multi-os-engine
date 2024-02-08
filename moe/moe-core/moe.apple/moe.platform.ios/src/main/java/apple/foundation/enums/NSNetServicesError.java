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
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 2.0
 */
@Generated
public final class NSNetServicesError {
    /**
     * An unknown error occurred during resolution or publication.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFEE6C0L;
    /**
     * An NSNetService with the same domain, type and name was already present when the publication request was made.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long CollisionError = 0xFFFFFFFFFFFEE6BFL;
    /**
     * The NSNetService was not found when a resolution request was made.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long NotFoundError = 0xFFFFFFFFFFFEE6BEL;
    /**
     * A publication or resolution request was sent to an NSNetService instance which was already published or a search
     * request was made of an NSNetServiceBrowser instance which was already searching.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long ActivityInProgress = 0xFFFFFFFFFFFEE6BDL;
    /**
     * An required argument was not provided when initializing the NSNetService instance.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long BadArgumentError = 0xFFFFFFFFFFFEE6BCL;
    /**
     * The operation being performed by the NSNetService or NSNetServiceBrowser instance was cancelled.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long CancelledError = 0xFFFFFFFFFFFEE6BBL;
    /**
     * An invalid argument was provided when initializing the NSNetService instance or starting a search with an
     * NSNetServiceBrowser instance.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long InvalidError = 0xFFFFFFFFFFFEE6BAL;
    /**
     * Resolution of an NSNetService instance failed because the timeout was reached.
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long TimeoutError = 0xFFFFFFFFFFFEE6B9L;

    @Generated
    private NSNetServicesError() {
    }

    /**
     * Missing required configuration for local network access.
     * 
     * NSBonjourServices and NSLocalNetworkUsageDescription are required in Info.plist
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long MissingRequiredConfigurationError = 0xFFFFFFFFFFFEE6B8L;
}
