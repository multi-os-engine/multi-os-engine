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
import apple.foundation.NSURLSession;
import apple.foundation.NSURLSessionDownloadTask;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Messages related to the operation of a task that writes data to a
 * file and notifies the delegate upon completion.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDownloadDelegate")
public interface NSURLSessionDownloadDelegate extends NSURLSessionTaskDelegate {
    /**
     * Sent when a download task that has completed a download. The delegate should
     * copy or move the file at the given location to a new location as it will be
     * removed when the delegate message returns. URLSession:task:didCompleteWithError: will
     * still be called.
     */
    @Generated
    @Selector("URLSession:downloadTask:didFinishDownloadingToURL:")
    void URLSessionDownloadTaskDidFinishDownloadingToURL(NSURLSession session, NSURLSessionDownloadTask downloadTask,
            NSURL location);

    /**
     * Sent when a download has been resumed. If a download failed with an
     * error, the -userInfo dictionary of the error will contain an
     * NSURLSessionDownloadTaskResumeData key, whose value is the resume
     * data.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:")
    default void URLSessionDownloadTaskDidResumeAtOffsetExpectedTotalBytes(NSURLSession session,
            NSURLSessionDownloadTask downloadTask, long fileOffset, long expectedTotalBytes) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent periodically to notify the delegate of download progress.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:")
    default void URLSessionDownloadTaskDidWriteDataTotalBytesWrittenTotalBytesExpectedToWrite(NSURLSession session,
            NSURLSessionDownloadTask downloadTask, long bytesWritten, long totalBytesWritten,
            long totalBytesExpectedToWrite) {
        throw new java.lang.UnsupportedOperationException();
    }
}
