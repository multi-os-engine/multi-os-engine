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

/**
 * [@protocol]       NSURLConnectionDataDelegate
 * 
 *                 Delegate methods used for loading data to memory.
 *                 These delegate methods are all optional.
 * 
 *                 connection:willSendRequest:redirectResponse: is
 *                 called whenever an connection determines that it
 *                 must change URLs in order to continue loading a
 *                 request.  This gives the delegate an opportunity
 *                 inspect and if necessary modify a request.  A
 *                 delegate can cause the request to abort by either
 *                 calling the connections -cancel method, or by
 *                 returning nil from this callback.<p>
 * 
 *                 There is one subtle difference which results from
 *                 this choice. If -cancel is called in the delegate
 *                 method, all processing for the connection stops,
 *                 and no further delegate callbacks will be sent. If
 *                 the delegate returns nil, the connection will
 *                 continue to process, and this has special
 *                 relevance in the case where the redirectResponse
 *                 argument is non-nil. In this case, any data that
 *                 is loaded for the connection will be sent to the
 *                 delegate, and the delegate will receive a finished
 *                 or failure delegate callback as appropriate.<p>
 * 
 *                 connection:didReceiveResponse: is called when
 *                 enough data has been read to construct an
 *                 NSURLResponse object. In the event of a protocol
 *                 which may return multiple responses (such as HTTP
 *                 multipart/x-mixed-replace) the delegate should be
 *                 prepared to inspect the new response and make
 *                 itself ready for data callbacks as appropriate.<p>
 * 
 *                 connection:didReceiveData: is called with a single
 *                 immutable NSData object to the delegate,
 *                 representing the next portion of the data loaded
 *                 from the connection.  This is the only guaranteed
 *                 for the delegate to receive the data from the
 *                 resource load.<p>
 * 
 *                 connection:needNewBodyStream: is called when the
 *                 loader must retransmit a requests payload, due to
 *                 connection errors or authentication challenges.
 *                 Delegates should construct a new unopened and
 *                 autoreleased NSInputStream.  If not implemented,
 *                 the loader will be required to spool the bytes to
 *                 be uploaded to disk, a potentially expensive
 *                 operation.  Returning nil will cancel the
 *                 connection.
 * 
 *                 connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:
 *                 is called during an upload operation to provide
 *                 progress feedback.  Note that the values may
 *                 change in unexpected ways if the request needs to
 *                 be retransmitted.<p>
 * 
 *                 connection:willCacheResponse: gives the delegate
 *                 an opportunity to inspect and modify the
 *                 NSCachedURLResponse which will be cached by the
 *                 loader if caching is enabled for the original
 *                 NSURLRequest.  Returning nil from this delegate
 *                 will prevent the resource from being cached.  Note
 *                 that the -data method of the cached response may
 *                 return an autoreleased in-memory copy of the true
 *                 data, and should not be used as an alternative to
 *                 receiving and accumulating the data through
 *                 connection:didReceiveData:<p>
 * 
 *                 connectionDidFinishLoading: is called when all
 *                 connection processing has completed successfully,
 *                 before the delegate is released by the
 *                 connection.<p>
 */
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
