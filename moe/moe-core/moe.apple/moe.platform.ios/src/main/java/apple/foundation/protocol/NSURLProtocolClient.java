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

package apple.foundation.protocol;

import apple.foundation.NSCachedURLResponse;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLProtocol;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLProtocolClient")
public interface NSURLProtocolClient {
    @Generated
    @Selector("URLProtocol:cachedResponseIsValid:")
    void URLProtocolCachedResponseIsValid(NSURLProtocol protocol, NSCachedURLResponse cachedResponse);

    @Generated
    @Selector("URLProtocol:didCancelAuthenticationChallenge:")
    void URLProtocolDidCancelAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);

    @Generated
    @Selector("URLProtocol:didFailWithError:")
    void URLProtocolDidFailWithError(NSURLProtocol protocol, NSError error);

    @Generated
    @Selector("URLProtocol:didLoadData:")
    void URLProtocolDidLoadData(NSURLProtocol protocol, NSData data);

    @Generated
    @Selector("URLProtocol:didReceiveAuthenticationChallenge:")
    void URLProtocolDidReceiveAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);

    @Generated
    @Selector("URLProtocol:didReceiveResponse:cacheStoragePolicy:")
    void URLProtocolDidReceiveResponseCacheStoragePolicy(NSURLProtocol protocol, NSURLResponse response,
            @NUInt long policy);

    @Generated
    @Selector("URLProtocol:wasRedirectedToRequest:redirectResponse:")
    void URLProtocolWasRedirectedToRequestRedirectResponse(NSURLProtocol protocol, NSURLRequest request,
            NSURLResponse redirectResponse);

    @Generated
    @Selector("URLProtocolDidFinishLoading:")
    void URLProtocolDidFinishLoading(NSURLProtocol protocol);
}
