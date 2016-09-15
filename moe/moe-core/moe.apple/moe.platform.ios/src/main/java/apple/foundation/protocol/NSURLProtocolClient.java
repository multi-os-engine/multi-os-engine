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
    /**
     * URLProtocol:cachedResponseIsValid:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocol:cachedResponseIsValid:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocol:cachedResponseIsValid:")
    void URLProtocolCachedResponseIsValid(NSURLProtocol protocol, NSCachedURLResponse cachedResponse);

    /**
     * URLProtocol:didCancelAuthenticationChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocol:didCancelAuthenticationChallenge:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocol:didCancelAuthenticationChallenge:")
    void URLProtocolDidCancelAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);

    /**
     * URLProtocol:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocol:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocol:didFailWithError:")
    void URLProtocolDidFailWithError(NSURLProtocol protocol, NSError error);

    /**
     * URLProtocol:didLoadData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocol:didLoadData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocol:didLoadData:")
    void URLProtocolDidLoadData(NSURLProtocol protocol, NSData data);

    /**
     * URLProtocol:didReceiveAuthenticationChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocol:didReceiveAuthenticationChallenge:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocol:didReceiveAuthenticationChallenge:")
    void URLProtocolDidReceiveAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);

    /**
     * URLProtocol:didReceiveResponse:cacheStoragePolicy:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocol:didReceiveResponse:cacheStoragePolicy:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocol:didReceiveResponse:cacheStoragePolicy:")
    void URLProtocolDidReceiveResponseCacheStoragePolicy(NSURLProtocol protocol, NSURLResponse response,
            @NUInt long policy);

    /**
     * URLProtocol:wasRedirectedToRequest:redirectResponse:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocol:wasRedirectedToRequest:redirectResponse:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocol:wasRedirectedToRequest:redirectResponse:")
    void URLProtocolWasRedirectedToRequestRedirectResponse(NSURLProtocol protocol, NSURLRequest request,
            NSURLResponse redirectResponse);

    /**
     * URLProtocolDidFinishLoading:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSURLProtocolClient_Protocol/index.html#//apple_ref/occ/intfm/NSURLProtocolClient/URLProtocolDidFinishLoading:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLProtocolDidFinishLoading:")
    void URLProtocolDidFinishLoading(NSURLProtocol protocol);
}
