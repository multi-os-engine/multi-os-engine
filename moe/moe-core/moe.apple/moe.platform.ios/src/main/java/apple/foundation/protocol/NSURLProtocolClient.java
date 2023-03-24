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
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] NSURLProtocolClient
 * 
 * NSURLProtocolClient provides the interface to the URL
 * loading system that is intended for use by NSURLProtocol
 * implementors.
 * 
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLProtocolClient")
public interface NSURLProtocolClient {
    /**
     * URLProtocol:cachedResponseIsValid:
     * 
     * Indicates to an NSURLProtocolClient that the protocol
     * implementation has examined a cached response and has
     * determined that it is valid.
     * 
     * @param protocol       the NSURLProtocol object sending the message.
     * @param cachedResponse the NSCachedURLResponse object that has
     *                       examined and is valid.
     */
    @Generated
    @Selector("URLProtocol:cachedResponseIsValid:")
    void URLProtocolCachedResponseIsValid(@NotNull NSURLProtocol protocol, @NotNull NSCachedURLResponse cachedResponse);

    /**
     * URLProtocol:didCancelAuthenticationChallenge:
     * 
     * Cancel authentication for the specified request
     * 
     * @param protocol  The protocol object cancelling authentication.
     * @param challenge The authentication challenge.
     */
    @Generated
    @Selector("URLProtocol:didCancelAuthenticationChallenge:")
    void URLProtocolDidCancelAuthenticationChallenge(@NotNull NSURLProtocol protocol,
            @NotNull NSURLAuthenticationChallenge challenge);

    /**
     * URLProtocol:didFailWithError:
     * 
     * Indicates to an NSURLProtocolClient that the protocol
     * implementation has failed to load successfully.
     * 
     * @param protocol the NSURLProtocol object sending the message.
     * @param error    The error that caused the load to fail.
     */
    @Generated
    @Selector("URLProtocol:didFailWithError:")
    void URLProtocolDidFailWithError(@NotNull NSURLProtocol protocol, @NotNull NSError error);

    /**
     * URLProtocol:didLoadData:
     * 
     * Indicates to an NSURLProtocolClient that the protocol
     * implementation has loaded URL data.
     * 
     * The data object must contain only new data loaded since
     * the previous call to this method (if any), not cumulative data for
     * the entire load.
     * 
     * @param protocol the NSURLProtocol object sending the message.
     * @param data     URL load data being made available.
     */
    @Generated
    @Selector("URLProtocol:didLoadData:")
    void URLProtocolDidLoadData(@NotNull NSURLProtocol protocol, @NotNull NSData data);

    /**
     * URLProtocol:didReceiveAuthenticationChallenge:
     * 
     * Start authentication for the specified request
     * 
     * The protocol client guarantees that it will answer the
     * request on the same thread that called this method. It may add a
     * default credential to the challenge it issues to the connection delegate,
     * if the protocol did not provide one.
     * 
     * @param protocol  The protocol object requesting authentication.
     * @param challenge The authentication challenge.
     */
    @Generated
    @Selector("URLProtocol:didReceiveAuthenticationChallenge:")
    void URLProtocolDidReceiveAuthenticationChallenge(@NotNull NSURLProtocol protocol,
            @NotNull NSURLAuthenticationChallenge challenge);

    /**
     * URLProtocol:didReceiveResponse:
     * 
     * Indicates to an NSURLProtocolClient that the protocol
     * implementation has created an NSURLResponse for the current load.
     * 
     * @param protocol the NSURLProtocol object sending the message.
     * @param response the NSURLResponse object the protocol implementation
     *                 has created.
     * @param policy   The NSURLCacheStoragePolicy the protocol
     *                 has determined should be used for the given response if the
     *                 response is to be stored in a cache.
     */
    @Generated
    @Selector("URLProtocol:didReceiveResponse:cacheStoragePolicy:")
    void URLProtocolDidReceiveResponseCacheStoragePolicy(@NotNull NSURLProtocol protocol,
            @NotNull NSURLResponse response, @NUInt long policy);

    /**
     * URLProtocol:wasRedirectedToRequest:
     * 
     * Indicates to an NSURLProtocolClient that a redirect has
     * occurred.
     * 
     * @param protocol the NSURLProtocol object sending the message.
     * @param request  the NSURLRequest to which the protocol implementation
     *                 has redirected.
     */
    @Generated
    @Selector("URLProtocol:wasRedirectedToRequest:redirectResponse:")
    void URLProtocolWasRedirectedToRequestRedirectResponse(@NotNull NSURLProtocol protocol,
            @NotNull NSURLRequest request, @NotNull NSURLResponse redirectResponse);

    /**
     * URLProtocolDidFinishLoading:
     * 
     * Indicates to an NSURLProtocolClient that the protocol
     * implementation has finished loading successfully.
     * 
     * @param protocol the NSURLProtocol object sending the message.
     */
    @Generated
    @Selector("URLProtocolDidFinishLoading:")
    void URLProtocolDidFinishLoading(@NotNull NSURLProtocol protocol);
}
