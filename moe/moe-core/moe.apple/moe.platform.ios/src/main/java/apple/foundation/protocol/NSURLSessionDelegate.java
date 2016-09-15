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

import apple.foundation.NSError;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLCredential;
import apple.foundation.NSURLSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDelegate")
public interface NSURLSessionDelegate {
    /**
     * URLSession:didBecomeInvalidWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionDelegate_protocol/index.html#//apple_ref/occ/intfm/NSURLSessionDelegate/URLSession:didBecomeInvalidWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("URLSession:didBecomeInvalidWithError:")
    default void URLSessionDidBecomeInvalidWithError(NSURLSession session, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:didReceiveChallenge:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionDelegate_protocol/index.html#//apple_ref/occ/intfm/NSURLSessionDelegate/URLSession:didReceiveChallenge:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("URLSession:didReceiveChallenge:completionHandler:")
    default void URLSessionDidReceiveChallengeCompletionHandler(NSURLSession session,
            NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_URLSessionDidReceiveChallengeCompletionHandler") Block_URLSessionDidReceiveChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionDidReceiveChallengeCompletionHandler {
        @Generated
        void call_URLSessionDidReceiveChallengeCompletionHandler(@NInt long arg0, NSURLCredential arg1);
    }

    /**
     * URLSessionDidFinishEventsForBackgroundURLSession:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionDelegate_protocol/index.html#//apple_ref/occ/intfm/NSURLSessionDelegate/URLSessionDidFinishEventsForBackgroundURLSession:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("URLSessionDidFinishEventsForBackgroundURLSession:")
    default void URLSessionDidFinishEventsForBackgroundURLSession(NSURLSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
