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
 * @enum NSURLCacheStoragePolicy
 * 
 * @discussion The NSURLCacheStoragePolicy enum defines constants that
 * can be used to specify the type of storage that is allowable for an
 * NSCachedURLResponse object that is to be stored in an NSURLCache.
 * 
 * @constant NSURLCacheStorageAllowed Specifies that storage in an
 * NSURLCache is allowed without restriction.
 * 
 * @constant NSURLCacheStorageAllowedInMemoryOnly Specifies that
 * storage in an NSURLCache is allowed; however storage should be
 * done in memory only, no disk storage should be done.
 * 
 * @constant NSURLCacheStorageNotAllowed Specifies that storage in an
 * NSURLCache is not allowed in any fashion, either in memory or on
 * disk.
 */
@Generated
public final class NSURLCacheStoragePolicy {
    @Generated @NUInt public static final long Allowed = 0x0000000000000000L;
    @Generated @NUInt public static final long AllowedInMemoryOnly = 0x0000000000000001L;
    @Generated @NUInt public static final long NotAllowed = 0x0000000000000002L;

    @Generated
    private NSURLCacheStoragePolicy() {
    }
}
