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
import apple.foundation.NSHTTPURLResponse;
import apple.foundation.NSInputStream;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLCredential;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLSession;
import apple.foundation.NSURLSessionTask;
import apple.foundation.NSURLSessionTaskMetrics;
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
 * Messages related to the operation of a specific task.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionTaskDelegate")
public interface NSURLSessionTaskDelegate extends NSURLSessionDelegate {
    /**
     * Sent as the last message related to a specific task. Error may be
     * nil, which implies that no error occurred and this task is complete.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:task:didCompleteWithError:")
    default void URLSessionTaskDidCompleteWithError(NSURLSession session, NSURLSessionTask task, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when complete statistics information has been collected for the task.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:task:didFinishCollectingMetrics:")
    default void URLSessionTaskDidFinishCollectingMetrics(NSURLSession session, NSURLSessionTask task,
            NSURLSessionTaskMetrics metrics) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The task has received a request specific authentication challenge.
     * If this delegate is not implemented, the session specific authentication challenge
     * will *NOT* be called and the behavior will be the same as using the default handling
     * disposition.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:task:didReceiveChallenge:completionHandler:")
    default void URLSessionTaskDidReceiveChallengeCompletionHandler(NSURLSession session, NSURLSessionTask task,
            NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_URLSessionTaskDidReceiveChallengeCompletionHandler") Block_URLSessionTaskDidReceiveChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent periodically to notify the delegate of upload progress. This
     * information is also available as properties of the task.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    default void URLSessionTaskDidSendBodyDataTotalBytesSentTotalBytesExpectedToSend(NSURLSession session,
            NSURLSessionTask task, long bytesSent, long totalBytesSent, long totalBytesExpectedToSend) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent if a task requires a new, unopened body stream. This may be
     * necessary when authentication has failed for any request that
     * involves a body stream.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:task:needNewBodyStream:")
    default void URLSessionTaskNeedNewBodyStream(NSURLSession session, NSURLSessionTask task,
            @ObjCBlock(name = "call_URLSessionTaskNeedNewBodyStream") Block_URLSessionTaskNeedNewBodyStream completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An HTTP request is attempting to perform a redirection to a different
     * URL. You must invoke the completion routine to allow the
     * redirection, allow the redirection with a modified request, or
     * pass nil to the completionHandler to cause the body of the redirection
     * response to be delivered as the payload of this request. The default
     * is to follow redirections.
     * <p>
     * For tasks in background sessions, redirections will always be followed and this method will not be called.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
    default void URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler(NSURLSession session,
            NSURLSessionTask task, NSHTTPURLResponse response, NSURLRequest request,
            @ObjCBlock(name = "call_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler") Block_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionTaskDidReceiveChallengeCompletionHandler {
        @Generated
        void call_URLSessionTaskDidReceiveChallengeCompletionHandler(@NInt long disposition,
                NSURLCredential credential);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionTaskNeedNewBodyStream {
        @Generated
        void call_URLSessionTaskNeedNewBodyStream(NSInputStream bodyStream);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler {
        @Generated
        void call_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler(NSURLRequest arg0);
    }

    /**
     * Sent when the system is ready to begin work for a task with a delayed start
     * time set (using the earliestBeginDate property). The completionHandler must
     * be invoked in order for loading to proceed. The disposition provided to the
     * completion handler continues the load with the original request provided to
     * the task, replaces the request with the specified task, or cancels the task.
     * If this delegate is not implemented, loading will proceed with the original
     * request.
     * <p>
     * Recommendation: only implement this delegate if tasks that have the
     * earliestBeginDate property set may become stale and require alteration prior
     * to starting the network load.
     * <p>
     * If a new request is specified, the allowsExpensiveNetworkAccess,
     * allowsContrainedNetworkAccess, and allowsCellularAccess properties
     * from the new request will not be used; the properties from the
     * original request will continue to be used.
     * <p>
     * Canceling the task is equivalent to calling the task's cancel method; the
     * URLSession:task:didCompleteWithError: task delegate will be called with error
     * NSURLErrorCancelled.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:task:willBeginDelayedRequest:completionHandler:")
    default void URLSessionTaskWillBeginDelayedRequestCompletionHandler(NSURLSession session, NSURLSessionTask task,
            NSURLRequest request,
            @ObjCBlock(name = "call_URLSessionTaskWillBeginDelayedRequestCompletionHandler") Block_URLSessionTaskWillBeginDelayedRequestCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionTaskWillBeginDelayedRequestCompletionHandler {
        @Generated
        void call_URLSessionTaskWillBeginDelayedRequestCompletionHandler(@NInt long disposition,
                NSURLRequest newRequest);
    }

    /**
     * Sent when a task cannot start the network loading process because the current
     * network connectivity is not available or sufficient for the task's request.
     * <p>
     * This delegate will be called at most one time per task, and is only called if
     * the waitsForConnectivity property in the NSURLSessionConfiguration has been
     * set to YES.
     * <p>
     * This delegate callback will never be called for background sessions, because
     * the waitForConnectivity property is ignored by those sessions.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:taskIsWaitingForConnectivity:")
    default void URLSessionTaskIsWaitingForConnectivity(NSURLSession session, NSURLSessionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }
}
