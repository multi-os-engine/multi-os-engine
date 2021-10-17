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
 * [@enum] NSURLRequestCachePolicy
 * <p>
 * The NSURLRequestCachePolicy enum defines constants that
 * can be used to specify the type of interactions that take place with
 * the caching system when the URL loading system processes a request.
 * Specifically, these constants cover interactions that have to do
 * with whether already-existing cache data is returned to satisfy a
 * URL load request.
 * <p>
 * [@constant] NSURLRequestUseProtocolCachePolicy Specifies that the
 * caching logic defined in the protocol implementation, if any, is
 * used for a particular URL load request. This is the default policy
 * for URL load requests.
 * <p>
 * [@constant] NSURLRequestReloadIgnoringLocalCacheData Specifies that the
 * data for the URL load should be loaded from the origin source. No
 * existing local cache data, regardless of its freshness or validity,
 * should be used to satisfy a URL load request.
 * <p>
 * [@constant] NSURLRequestReloadIgnoringLocalAndRemoteCacheData Specifies that
 * not only should the local cache data be ignored, but that proxies and
 * other intermediates should be instructed to disregard their caches
 * so far as the protocol allows.
 * <p>
 * [@constant] NSURLRequestReloadIgnoringCacheData Older name for
 * NSURLRequestReloadIgnoringLocalCacheData.
 * <p>
 * [@constant] NSURLRequestReturnCacheDataElseLoad Specifies that the
 * existing cache data should be used to satisfy a URL load request,
 * regardless of its age or expiration date. However, if there is no
 * existing data in the cache corresponding to a URL load request,
 * the URL is loaded from the origin source.
 * <p>
 * [@constant] NSURLRequestReturnCacheDataDontLoad Specifies that the
 * existing cache data should be used to satisfy a URL load request,
 * regardless of its age or expiration date. However, if there is no
 * existing data in the cache corresponding to a URL load request, no
 * attempt is made to load the URL from the origin source, and the
 * load is considered to have failed. This constant specifies a
 * behavior that is similar to an "offline" mode.
 * <p>
 * [@constant] NSURLRequestReloadRevalidatingCacheData Specifies that
 * the existing cache data may be used provided the origin source
 * confirms its validity, otherwise the URL is loaded from the
 * origin source.
 */
@Generated
public final class NSURLRequestCachePolicy {
    @Generated @NUInt public static final long UseProtocolCachePolicy = 0x0000000000000000L;
    @Generated @NUInt public static final long ReloadIgnoringLocalCacheData = 0x0000000000000001L;
    @Generated @NUInt public static final long ReloadIgnoringLocalAndRemoteCacheData = 0x0000000000000004L;
    @Generated @NUInt public static final long ReloadIgnoringCacheData = 0x0000000000000001L;
    @Generated @NUInt public static final long ReturnCacheDataElseLoad = 0x0000000000000002L;
    @Generated @NUInt public static final long ReturnCacheDataDontLoad = 0x0000000000000003L;
    @Generated @NUInt public static final long ReloadRevalidatingCacheData = 0x0000000000000005L;

    @Generated
    private NSURLRequestCachePolicy() {
    }
}
