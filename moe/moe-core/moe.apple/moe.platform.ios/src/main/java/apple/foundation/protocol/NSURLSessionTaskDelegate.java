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
@ObjCProtocolName("NSURLSessionTaskDelegate")
public interface NSURLSessionTaskDelegate extends NSURLSessionDelegate {
    @Generated
    @IsOptional
    @Selector("URLSession:task:didCompleteWithError:")
    default void URLSessionTaskDidCompleteWithError(NSURLSession session, NSURLSessionTask task, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:task:didReceiveChallenge:completionHandler:")
    default void URLSessionTaskDidReceiveChallengeCompletionHandler(NSURLSession session, NSURLSessionTask task,
            NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_URLSessionTaskDidReceiveChallengeCompletionHandler") Block_URLSessionTaskDidReceiveChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    default void URLSessionTaskDidSendBodyDataTotalBytesSentTotalBytesExpectedToSend(NSURLSession session,
            NSURLSessionTask task, long bytesSent, long totalBytesSent, long totalBytesExpectedToSend) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:task:needNewBodyStream:")
    default void URLSessionTaskNeedNewBodyStream(NSURLSession session, NSURLSessionTask task,
            @ObjCBlock(name = "call_URLSessionTaskNeedNewBodyStream") Block_URLSessionTaskNeedNewBodyStream completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

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
        void call_URLSessionTaskDidReceiveChallengeCompletionHandler(@NInt long arg0, NSURLCredential arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionTaskNeedNewBodyStream {
        @Generated
        void call_URLSessionTaskNeedNewBodyStream(NSInputStream arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler {
        @Generated
        void call_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler(NSURLRequest arg0);
    }
}
