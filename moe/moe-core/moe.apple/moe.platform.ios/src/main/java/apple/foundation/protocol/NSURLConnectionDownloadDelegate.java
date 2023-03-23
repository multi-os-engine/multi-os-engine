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

/**
 * [@protocol] NSURLConnectionDownloadDelegate
 * 
 * Delegate methods used to perform resource
 * downloads directly to a disk file. All the
 * methods are optional with the exception of
 * connectionDidFinishDownloading:destinationURL:
 * which must be implemented in order to inform the
 * delegate of the location of the finished download.
 * This delegate and download implementation is
 * currently only available on iOS 5.0 or later.
 * 
 * connection:didWriteData:totalBytesWritten:expectedTotalBytes:
 * provides progress information about the state of
 * the download, the number of bytes written since
 * the last delegate callback, the total number of
 * bytes written to disk and the total number of
 * bytes that are expected (or 0 if this is unknown.)
 * 
 * connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:
 * is called when the connection is able to resume an
 * in progress download. This may happen due to a
 * connection or network failure.
 * 
 * connectionDidFinishDownloading:destinationURL: is
 * a terminal event which indicates the completion of
 * a download and provides the location of the file.
 * The file will be located in the applications cache
 * directory and is guaranteed to exist for the
 * duration of the delegate callback. The
 * implication is that the delegate should copy or
 * move the download to a more persistent location if
 * desired.
 * 
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLConnectionDownloadDelegate")
public interface NSURLConnectionDownloadDelegate extends NSURLConnectionDelegate {
    @Generated
    @IsOptional
    @Selector("connection:didWriteData:totalBytesWritten:expectedTotalBytes:")
    default void connectionDidWriteDataTotalBytesWrittenExpectedTotalBytes(NSURLConnection connection,
            long bytesWritten, long totalBytesWritten, long expectedTotalBytes) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("connectionDidFinishDownloading:destinationURL:")
    void connectionDidFinishDownloadingDestinationURL(NSURLConnection connection, NSURL destinationURL);

    @Generated
    @IsOptional
    @Selector("connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:")
    default void connectionDidResumeDownloadingTotalBytesWrittenExpectedTotalBytes(NSURLConnection connection,
            long totalBytesWritten, long expectedTotalBytes) {
        throw new java.lang.UnsupportedOperationException();
    }
}
