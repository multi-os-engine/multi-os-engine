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

package ios.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSURL;
import ios.foundation.NSURLSession;
import ios.foundation.NSURLSessionDownloadTask;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDownloadDelegate")
public interface NSURLSessionDownloadDelegate extends NSURLSessionTaskDelegate {
	/**
	 * URLSession:downloadTask:didFinishDownloadingToURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionDownloadDelegate_protocol/index.html#//apple_ref/occ/intfm/NSURLSessionDownloadDelegate/URLSession:downloadTask:didFinishDownloadingToURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLSession:downloadTask:didFinishDownloadingToURL:")
	void URLSessionDownloadTaskDidFinishDownloadingToURL(
			NSURLSession session, NSURLSessionDownloadTask downloadTask,
			NSURL location);

	/**
	 * URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionDownloadDelegate_protocol/index.html#//apple_ref/occ/intfm/NSURLSessionDownloadDelegate/URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:")
	default void URLSessionDownloadTaskDidResumeAtOffsetExpectedTotalBytes(
			NSURLSession session, NSURLSessionDownloadTask downloadTask,
			long fileOffset, long expectedTotalBytes) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionDownloadDelegate_protocol/index.html#//apple_ref/occ/intfm/NSURLSessionDownloadDelegate/URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:")
	default void URLSessionDownloadTaskDidWriteDataTotalBytesWrittenTotalBytesExpectedToWrite(
			NSURLSession session, NSURLSessionDownloadTask downloadTask,
			long bytesWritten, long totalBytesWritten,
			long totalBytesExpectedToWrite) {
		throw new java.lang.UnsupportedOperationException();
	}
}
