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

/**
 * Messages related to the URL session as a whole
 * 
 * API-Since: 7.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDelegate")
public interface NSURLSessionDelegate {
    /**
     * The last message a session receives. A session will only become
     * invalid because of a systemic error or when it has been
     * explicitly invalidated, in which case the error parameter will be nil.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:didBecomeInvalidWithError:")
    default void URLSessionDidBecomeInvalidWithError(NSURLSession session, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If implemented, when a connection level authentication challenge
     * has occurred, this delegate will be given the opportunity to
     * provide authentication credentials to the underlying
     * connection. Some types of authentication will apply to more than
     * one request on a given connection to a server (SSL Server Trust
     * challenges). If this delegate message is not implemented, the
     * behavior will be to use the default handling, which may involve user
     * interaction.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:didReceiveChallenge:completionHandler:")
    default void URLSessionDidReceiveChallengeCompletionHandler(NSURLSession session,
            NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_URLSessionDidReceiveChallengeCompletionHandler") Block_URLSessionDidReceiveChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If an application has received an
     * -application:handleEventsForBackgroundURLSession:completionHandler:
     * message, the session delegate will receive this message to indicate
     * that all messages previously enqueued for this session have been
     * delivered. At this time it is safe to invoke the previously stored
     * completion handler, or to begin any internal updates that will
     * result in invoking the completion handler.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("URLSessionDidFinishEventsForBackgroundURLSession:")
    default void URLSessionDidFinishEventsForBackgroundURLSession(NSURLSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionDidReceiveChallengeCompletionHandler {
        @Generated
        void call_URLSessionDidReceiveChallengeCompletionHandler(@NInt long disposition, NSURLCredential credential);
    }
}
