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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDataDelegate")
public interface NSURLSessionDataDelegate extends NSURLSessionTaskDelegate {
    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didBecomeDownloadTask:")
    default void URLSessionDataTaskDidBecomeDownloadTask(NSURLSession session, NSURLSessionDataTask dataTask,
            NSURLSessionDownloadTask downloadTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didBecomeStreamTask:")
    default void URLSessionDataTaskDidBecomeStreamTask(NSURLSession session, NSURLSessionDataTask dataTask,
            NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didReceiveData:")
    default void URLSessionDataTaskDidReceiveData(NSURLSession session, NSURLSessionDataTask dataTask, NSData data) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:dataTask:didReceiveResponse:completionHandler:")
    default void URLSessionDataTaskDidReceiveResponseCompletionHandler(NSURLSession session,
            NSURLSessionDataTask dataTask, NSURLResponse response,
            @ObjCBlock(name = "call_URLSessionDataTaskDidReceiveResponseCompletionHandler") Block_URLSessionDataTaskDidReceiveResponseCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

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
