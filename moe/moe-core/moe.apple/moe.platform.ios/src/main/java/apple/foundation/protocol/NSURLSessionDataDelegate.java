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
import apple.foundation.NSURLResponse;
import apple.foundation.NSURLSession;
import apple.foundation.NSURLSessionDataTask;
import apple.foundation.NSURLSessionDownloadTask;
import apple.foundation.NSURLSessionStreamTask;
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
 * Messages related to the operation of a task that delivers data
 * directly to the delegate.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDataDelegate")
public interface NSURLSessionDataDelegate extends NSURLSessionTaskDelegate {
    /**
     * Notification that a data task has become a download task. No
     * future messages will be sent to the data task.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didBecomeDownloadTask:")
    default void URLSessionDataTaskDidBecomeDownloadTask(NSURLSession session, NSURLSessionDataTask dataTask,
            NSURLSessionDownloadTask downloadTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notification that a data task has become a bidirectional stream
     * task. No future messages will be sent to the data task. The newly
     * created streamTask will carry the original request and response as
     * properties.
     * 
     * For requests that were pipelined, the stream object will only allow
     * reading, and the object will immediately issue a
     * -URLSession:writeClosedForStream:. Pipelining can be disabled for
     * all requests in a session, or by the NSURLRequest
     * HTTPShouldUsePipelining property.
     * 
     * The underlying connection is no longer considered part of the HTTP
     * connection cache and won't count against the total number of
     * connections per host.
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didBecomeStreamTask:")
    default void URLSessionDataTaskDidBecomeStreamTask(NSURLSession session, NSURLSessionDataTask dataTask,
            NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when data is available for the delegate to consume. It is
     * assumed that the delegate will retain and not copy the data. As
     * the data may be discontiguous, you should use
     * [NSData enumerateByteRangesUsingBlock:] to access it.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didReceiveData:")
    default void URLSessionDataTaskDidReceiveData(NSURLSession session, NSURLSessionDataTask dataTask, NSData data) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The task has received a response and no further messages will be
     * received until the completion block is called. The disposition
     * allows you to cancel a request or to turn a data task into a
     * download task. This delegate message is optional - if you do not
     * implement it, you can get the response as a property of the task.
     * 
     * This method will not be called for background upload tasks (which cannot be converted to download tasks).
     */
    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didReceiveResponse:completionHandler:")
    default void URLSessionDataTaskDidReceiveResponseCompletionHandler(NSURLSession session,
            NSURLSessionDataTask dataTask, NSURLResponse response,
            @ObjCBlock(name = "call_URLSessionDataTaskDidReceiveResponseCompletionHandler") Block_URLSessionDataTaskDidReceiveResponseCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoke the completion routine with a valid NSCachedURLResponse to
     * allow the resulting data to be cached, or pass nil to prevent
     * caching. Note that there is no guarantee that caching will be
     * attempted for a given resource, and you should not rely on this
     * message to receive the resource data.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:willCacheResponse:completionHandler:")
    default void URLSessionDataTaskWillCacheResponseCompletionHandler(NSURLSession session,
            NSURLSessionDataTask dataTask, NSCachedURLResponse proposedResponse,
            @ObjCBlock(name = "call_URLSessionDataTaskWillCacheResponseCompletionHandler") Block_URLSessionDataTaskWillCacheResponseCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionDataTaskDidReceiveResponseCompletionHandler {
        @Generated
        void call_URLSessionDataTaskDidReceiveResponseCompletionHandler(@NInt long disposition);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_URLSessionDataTaskWillCacheResponseCompletionHandler {
        @Generated
        void call_URLSessionDataTaskWillCacheResponseCompletionHandler(NSCachedURLResponse cachedResponse);
    }
}
