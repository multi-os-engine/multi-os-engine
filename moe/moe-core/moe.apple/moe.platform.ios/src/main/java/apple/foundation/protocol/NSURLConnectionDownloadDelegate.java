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

import apple.foundation.NSURL;
import apple.foundation.NSURLConnection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLConnectionDownloadDelegate")
public interface NSURLConnectionDownloadDelegate extends NSURLConnectionDelegate {
    /**
     * connection:didWriteData:totalBytesWritten:expectedTotalBytes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDownloadDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDownloadDelegate/connection:didWriteData:totalBytesWritten:expectedTotalBytes:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("connection:didWriteData:totalBytesWritten:expectedTotalBytes:")
    default void connectionDidWriteDataTotalBytesWrittenExpectedTotalBytes(NSURLConnection connection,
            long bytesWritten, long totalBytesWritten, long expectedTotalBytes) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * connectionDidFinishDownloading:destinationURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDownloadDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDownloadDelegate/connectionDidFinishDownloading:destinationURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("connectionDidFinishDownloading:destinationURL:")
    void connectionDidFinishDownloadingDestinationURL(NSURLConnection connection, NSURL destinationURL);

    /**
     * connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDownloadDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDownloadDelegate/connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:")
    default void connectionDidResumeDownloadingTotalBytesWrittenExpectedTotalBytes(NSURLConnection connection,
            long totalBytesWritten, long expectedTotalBytes) {
        throw new java.lang.UnsupportedOperationException();
    }
}
