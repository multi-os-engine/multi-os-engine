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

package apple.avfoundation.protocol;

import apple.avfoundation.AVAssetResourceLoader;
import apple.avfoundation.AVAssetResourceLoadingRequest;
import apple.avfoundation.AVAssetResourceRenewalRequest;
import apple.foundation.NSURLAuthenticationChallenge;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAssetResourceLoaderDelegate")
public interface AVAssetResourceLoaderDelegate {
    /**
     * resourceLoader:didCancelAuthenticationChallenge:
     * 
     * Informs the delegate that a prior authentication challenge has been cancelled.
     * 
     * @param 		authenticationChallenge
     * 			The authentication challenge that has been cancelled. 
     */
    @Generated
    @IsOptional
    @Selector("resourceLoader:didCancelAuthenticationChallenge:")
    default void resourceLoaderDidCancelAuthenticationChallenge(AVAssetResourceLoader resourceLoader,
            NSURLAuthenticationChallenge authenticationChallenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * resourceLoader:didCancelLoadingRequest:
     * 
     * Informs the delegate that a prior loading request has been cancelled.
     * 
     * Previously issued loading requests can be cancelled when data from the resource is no longer required or when a loading request is superseded by new requests for data from the same resource. For example, if to complete a seek operation it becomes necessary to load a range of bytes that's different from a range previously requested, the prior request may be cancelled while the delegate is still handling it.
     * 
     * @param 		loadingRequest
     * 			The loading request that has been cancelled. 
     */
    @Generated
    @IsOptional
    @Selector("resourceLoader:didCancelLoadingRequest:")
    default void resourceLoaderDidCancelLoadingRequest(AVAssetResourceLoader resourceLoader,
            AVAssetResourceLoadingRequest loadingRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * resourceLoader:shouldWaitForLoadingOfRequestedResource:
     * 
     * Invoked when assistance is required of the application to load a resource.
     * 
     *  Delegates receive this message when assistance is required of the application to load a resource. For example, this method is invoked to load decryption keys that have been specified using custom URL schemes.
     *  If the result is YES, the resource loader expects invocation, either subsequently or immediately, of either -[AVAssetResourceLoadingRequest finishLoading] or -[AVAssetResourceLoadingRequest finishLoadingWithError:]. If you intend to finish loading the resource after your handling of this message returns, you must retain the instance of AVAssetResourceLoadingRequest until after loading is finished.
     *  If the result is NO, the resource loader treats the loading of the resource as having failed.
     *  Note that if the delegate's implementation of -resourceLoader:shouldWaitForLoadingOfRequestedResource: returns YES without finishing the loading request immediately, it may be invoked again with another loading request before the prior request is finished; therefore in such cases the delegate should be prepared to manage multiple loading requests.
     * 
     *  If an AVURLAsset is added to an AVContentKeySession object and a delegate is set on its AVAssetResourceLoader, that delegate's resourceLoader:shouldWaitForLoadingOfRequestedResource: method must specify which custom URL requests should be handled as content keys. This is done by returning YES and passing either AVStreamingKeyDeliveryPersistentContentKeyType or AVStreamingKeyDeliveryContentKeyType into -[AVAssetResourceLoadingContentInformationRequest setContentType:] and then calling -[AVAssetResourceLoadingRequest finishLoading].
     * 
     * @param 		resourceLoader
     * 			The instance of AVAssetResourceLoader for which the loading request is being made.
     * @param 		loadingRequest
     * 			An instance of AVAssetResourceLoadingRequest that provides information about the requested resource. 
     * @return 		YES if the delegate can load the resource indicated by the AVAssetResourceLoadingRequest; otherwise NO.
     */
    @Generated
    @IsOptional
    @Selector("resourceLoader:shouldWaitForLoadingOfRequestedResource:")
    default boolean resourceLoaderShouldWaitForLoadingOfRequestedResource(AVAssetResourceLoader resourceLoader,
            AVAssetResourceLoadingRequest loadingRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * resourceLoader:shouldWaitForRenewalOfRequestedResource:
     * 
     * Invoked when assistance is required of the application to renew a resource.
     * 
     * Delegates receive this message when assistance is required of the application to renew a resource previously loaded by resourceLoader:shouldWaitForLoadingOfRequestedResource:. For example, this method is invoked to renew decryption keys that require renewal, as indicated in a response to a prior invocation of resourceLoader:shouldWaitForLoadingOfRequestedResource:.
     * If the result is YES, the resource loader expects invocation, either subsequently or immediately, of either -[AVAssetResourceRenewalRequest finishLoading] or -[AVAssetResourceRenewalRequest finishLoadingWithError:]. If you intend to finish loading the resource after your handling of this message returns, you must retain the instance of AVAssetResourceRenewalRequest until after loading is finished.
     * If the result is NO, the resource loader treats the loading of the resource as having failed.
     * Note that if the delegate's implementation of -resourceLoader:shouldWaitForRenewalOfRequestedResource: returns YES without finishing the loading request immediately, it may be invoked again with another loading request before the prior request is finished; therefore in such cases the delegate should be prepared to manage multiple loading requests.
     * 
     *  If an AVURLAsset is added to an AVContentKeySession object and a delegate is set on its AVAssetResourceLoader, that delegate's resourceLoader:shouldWaitForRenewalOfRequestedResource:renewalRequest method must specify which custom URL requests should be handled as content keys. This is done by returning YES and passing either AVStreamingKeyDeliveryPersistentContentKeyType or AVStreamingKeyDeliveryContentKeyType into -[AVAssetResourceLoadingContentInformationRequest setContentType:] and then calling -[AVAssetResourceLoadingRequest finishLoading].
     * 
     * @param 		resourceLoader
     * The instance of AVAssetResourceLoader for which the loading request is being made.
     * @param 		renewalRequest
     * An instance of AVAssetResourceRenewalRequest that provides information about the requested resource.
     * @return 		YES if the delegate can renew the resource indicated by the AVAssetResourceLoadingRequest; otherwise NO.
     */
    @Generated
    @IsOptional
    @Selector("resourceLoader:shouldWaitForRenewalOfRequestedResource:")
    default boolean resourceLoaderShouldWaitForRenewalOfRequestedResource(AVAssetResourceLoader resourceLoader,
            AVAssetResourceRenewalRequest renewalRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * resourceLoader:shouldWaitForResponseToAuthenticationChallenge:
     * 
     * Invoked when assistance is required of the application to respond to an authentication challenge.
     * 
     *  Delegates receive this message when assistance is required of the application to respond to an authentication challenge.
     *  If the result is YES, the resource loader expects you to send an appropriate response, either subsequently or immediately, to the NSURLAuthenticationChallenge's sender, i.e. [authenticationChallenge sender], via use of one of the messages defined in the NSURLAuthenticationChallengeSender protocol (see NSAuthenticationChallenge.h). If you intend to respond to the authentication challenge after your handling of -resourceLoader:shouldWaitForResponseToAuthenticationChallenge: returns, you must retain the instance of NSURLAuthenticationChallenge until after your response has been made.
     * 
     * @param 		resourceLoader
     * 			The instance of AVAssetResourceLoader asking for help with an authentication challenge.
     * @param 		authenticationChallenge
     * 			An instance of NSURLAuthenticationChallenge. 
     */
    @Generated
    @IsOptional
    @Selector("resourceLoader:shouldWaitForResponseToAuthenticationChallenge:")
    default boolean resourceLoaderShouldWaitForResponseToAuthenticationChallenge(AVAssetResourceLoader resourceLoader,
            NSURLAuthenticationChallenge authenticationChallenge) {
        throw new java.lang.UnsupportedOperationException();
    }
}
