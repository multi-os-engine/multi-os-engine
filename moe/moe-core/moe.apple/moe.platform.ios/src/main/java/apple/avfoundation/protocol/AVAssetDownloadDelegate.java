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

package apple.avfoundation.protocol;

import apple.avfoundation.AVAssetDownloadTask;
import apple.avfoundation.AVMediaSelection;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSURLSession;
import apple.foundation.NSValue;
import apple.foundation.protocol.NSURLSessionTaskDelegate;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAssetDownloadDelegate")
public interface AVAssetDownloadDelegate extends NSURLSessionTaskDelegate {
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:")
    default void URLSessionAssetDownloadTaskDidLoadTimeRangeTotalTimeRangesLoadedTimeRangeExpectedToLoad(
            NSURLSession session, AVAssetDownloadTask assetDownloadTask, @ByValue CMTimeRange timeRange,
            NSArray<? extends NSValue> loadedTimeRanges, @ByValue CMTimeRange timeRangeExpectedToLoad) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didResolveMediaSelection:")
    default void URLSessionAssetDownloadTaskDidResolveMediaSelection(NSURLSession session,
            AVAssetDownloadTask assetDownloadTask, AVMediaSelection resolvedMediaSelection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
