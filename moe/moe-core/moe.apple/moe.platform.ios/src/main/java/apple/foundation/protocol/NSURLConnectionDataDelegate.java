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
import apple.foundation.NSInputStream;
import apple.foundation.NSURLConnection;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLConnectionDataDelegate")
public interface NSURLConnectionDataDelegate extends NSURLConnectionDelegate {
    @Generated
    @IsOptional
    @Selector("connection:didReceiveData:")
    default void connectionDidReceiveData(NSURLConnection connection, NSData data) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connection:didReceiveResponse:")
    default void connectionDidReceiveResponse(NSURLConnection connection, NSURLResponse response) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    default void connectionDidSendBodyDataTotalBytesWrittenTotalBytesExpectedToWrite(NSURLConnection connection,
            @NInt long bytesWritten, @NInt long totalBytesWritten, @NInt long totalBytesExpectedToWrite) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connection:needNewBodyStream:")
    default NSInputStream connectionNeedNewBodyStream(NSURLConnection connection, NSURLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connection:willCacheResponse:")
    default NSCachedURLResponse connectionWillCacheResponse(NSURLConnection connection,
            NSCachedURLResponse cachedResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connection:willSendRequest:redirectResponse:")
    default NSURLRequest connectionWillSendRequestRedirectResponse(NSURLConnection connection, NSURLRequest request,
            NSURLResponse response) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connectionDidFinishLoading:")
    default void connectionDidFinishLoading(NSURLConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
