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
    @Generated
    @IsOptional
    @Selector("resourceLoader:didCancelAuthenticationChallenge:")
    default void resourceLoaderDidCancelAuthenticationChallenge(AVAssetResourceLoader resourceLoader,
            NSURLAuthenticationChallenge authenticationChallenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resourceLoader:didCancelLoadingRequest:")
    default void resourceLoaderDidCancelLoadingRequest(AVAssetResourceLoader resourceLoader,
            AVAssetResourceLoadingRequest loadingRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resourceLoader:shouldWaitForLoadingOfRequestedResource:")
    default boolean resourceLoaderShouldWaitForLoadingOfRequestedResource(AVAssetResourceLoader resourceLoader,
            AVAssetResourceLoadingRequest loadingRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resourceLoader:shouldWaitForRenewalOfRequestedResource:")
    default boolean resourceLoaderShouldWaitForRenewalOfRequestedResource(AVAssetResourceLoader resourceLoader,
            AVAssetResourceRenewalRequest renewalRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resourceLoader:shouldWaitForResponseToAuthenticationChallenge:")
    default boolean resourceLoaderShouldWaitForResponseToAuthenticationChallenge(AVAssetResourceLoader resourceLoader,
            NSURLAuthenticationChallenge authenticationChallenge) {
        throw new java.lang.UnsupportedOperationException();
    }
}
