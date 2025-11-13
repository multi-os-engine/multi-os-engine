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

import apple.avfoundation.AVAggregateAssetDownloadTask;
import apple.avfoundation.AVAssetDownloadTask;
import apple.avfoundation.AVAssetVariant;
import apple.avfoundation.AVMediaSelection;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSURL;
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
import org.jetbrains.annotations.NotNull;
import apple.avfoundation.AVMetricEvent;

/**
 * Delegate methods to implement when adopting AVAssetDownloadTask. Subclasses of this type that are used from Swift
 * must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAssetDownloadDelegate")
public interface AVAssetDownloadDelegate extends NSURLSessionTaskDelegate {
    /**
     * Sent when a download task that has completed a download.
     * 
     * Unlike NSURLSessionDownloadDelegate, the delegate should NOT move the file from this directory after it has been
     * called. Downloaded assets must remain at the system provided URL. URLSession:task:didCompleteWithError: will
     * still be called.
     * 
     * - Parameter session: The session the asset download task is on.
     * - Parameter assetDownloadTask: The AVAssetDownloadTask whose downloaded completed.
     * - Parameter location: The location the asset has been downloaded to.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use URLSession:assetDownloadTask:willDownloadToURL: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didFinishDownloadingToURL:")
    default void URLSessionAssetDownloadTaskDidFinishDownloadingToURL(@NotNull NSURLSession session,
            @NotNull AVAssetDownloadTask assetDownloadTask, @NotNull NSURL location) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Method to adopt to subscribe to progress updates of an AVAssetDownloadTask.
     * 
     * - Parameter session: The session the asset download task is on.
     * - Parameter assetDownloadTask: The AVAssetDownloadTask which is being updated.
     * - Parameter timeRange: A CMTimeRange indicating the time range loaded since the last time this method was called.
     * - Parameter loadedTimeRanges: A NSArray of NSValues of CMTimeRanges indicating all the time ranges loaded by this
     * asset download task.
     * - Parameter timeRangeExpectedToLoad: A CMTimeRange indicating the single time range that is expected to be loaded
     * when the download is complete.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use NSURLSessionTask.progress instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:")
    default void URLSessionAssetDownloadTaskDidLoadTimeRangeTotalTimeRangesLoadedTimeRangeExpectedToLoad(
            @NotNull NSURLSession session, @NotNull AVAssetDownloadTask assetDownloadTask,
            @ByValue CMTimeRange timeRange, @NotNull NSArray<? extends NSValue> loadedTimeRanges,
            @ByValue CMTimeRange timeRangeExpectedToLoad) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Method called when the media selection for the download is fully resolved, including any automatic selections.
     * 
     * - Parameter session: The session the asset download task is on.
     * - Parameter assetDownloadTask: The AVAssetDownloadTask which is being updated.
     * - Parameter resolvedMediaSelection: The resolved media selection for the download task. For the best chance of
     * playing back downloaded content without further network I/O, apply this selection to subsequent AVPlayerItems.
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didResolveMediaSelection:")
    default void URLSessionAssetDownloadTaskDidResolveMediaSelection(@NotNull NSURLSession session,
            @NotNull AVAssetDownloadTask assetDownloadTask, @NotNull AVMediaSelection resolvedMediaSelection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Method called when a child AVAssetDownloadTask completes.
     * 
     * - Parameter session: The session the aggregate asset download task is on.
     * - Parameter aggregateAssetDownloadTask: The AVAggregateAssetDownloadTask.
     * - Parameter mediaSelection: The AVMediaSelection which is now fully available for offline use.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use the NSURLSessionDownloadDelegate method instead, URLSession:task:didCompleteWithError:
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("URLSession:aggregateAssetDownloadTask:didCompleteForMediaSelection:")
    default void URLSessionAggregateAssetDownloadTaskDidCompleteForMediaSelection(@NotNull NSURLSession session,
            @NotNull AVAggregateAssetDownloadTask aggregateAssetDownloadTask,
            @NotNull AVMediaSelection mediaSelection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Method to adopt to subscribe to progress updates of an AVAggregateAssetDownloadTask
     * 
     * - Parameter session: The session the asset download task is on.
     * - Parameter aggregateAssetDownloadTask: The AVAggregateAssetDownloadTask.
     * - Parameter timeRange: A CMTimeRange indicating the time range loaded for the media selection being downloaded.
     * - Parameter loadedTimeRanges: A NSArray of NSValues of CMTimeRanges indicating all the time ranges loaded for the
     * media selection being downloaded.
     * - Parameter timeRangeExpectedToLoad: A CMTimeRange indicating the single time range that is expected to be loaded
     * when the download is complete for the media selection being downloaded.
     * - Parameter mediaSelection: The media selection which has additional media data loaded for offline use.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use NSURLSessionTask.progress: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("URLSession:aggregateAssetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:forMediaSelection:")
    default void URLSessionAggregateAssetDownloadTaskDidLoadTimeRangeTotalTimeRangesLoadedTimeRangeExpectedToLoadForMediaSelection(
            @NotNull NSURLSession session, @NotNull AVAggregateAssetDownloadTask aggregateAssetDownloadTask,
            @ByValue CMTimeRange timeRange, @NotNull NSArray<? extends NSValue> loadedTimeRanges,
            @ByValue CMTimeRange timeRangeExpectedToLoad, @NotNull AVMediaSelection mediaSelection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Method called when the aggregate download task determines the location this asset will be downloaded to.
     * 
     * This URL should be saved for future instantiations of AVAsset. While an AVAsset already exists for this content,
     * it is advisable to re-use that instance.
     * 
     * - Parameter session: The session the aggregate asset download task is on.
     * - Parameter aggregateAssetDownloadTask: The AVAggregateAssetDownloadTask.
     * - Parameter location: The file URL this task will download media data to.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use URLSession:assetDownloadTask:willDownloadToURL: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("URLSession:aggregateAssetDownloadTask:willDownloadToURL:")
    default void URLSessionAggregateAssetDownloadTaskWillDownloadToURL(@NotNull NSURLSession session,
            @NotNull AVAggregateAssetDownloadTask aggregateAssetDownloadTask, @NotNull NSURL location) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when a download task has completed the variant selection.
     * 
     * - Parameter session: The session the asset download task is on.
     * - Parameter assetDownloadTask: The asset download task.
     * - Parameter variants: The variants chosen. Depends on the environmental condition when the download starts.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:willDownloadVariants:")
    default void URLSessionAssetDownloadTaskWillDownloadVariants(@NotNull NSURLSession session,
            @NotNull AVAssetDownloadTask assetDownloadTask, @NotNull NSArray<? extends AVAssetVariant> variants) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Method called when the asset download task determines the location this asset will be downloaded to.
     * 
     * This URL should be saved for future instantiations of AVAsset. While an AVAsset already exists for this content,
     * it is advisable to re-use that instance.
     * 
     * - Parameter session: The session the asset download task is on.
     * - Parameter assetDownloadTask: The AVAssetDownloadTask.
     * - Parameter location: The file URL this task will download media data to.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:willDownloadToURL:")
    default void URLSessionAssetDownloadTaskWillDownloadToURL(@NotNull NSURLSession session,
            @NotNull AVAssetDownloadTask assetDownloadTask, @NotNull NSURL location) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when a download task receives an AVMetricEvent.
     * 
     * - Parameter session: The NSURLSession corresponding to this AVAssetDownloadTask.
     * - Parameter assetDownloadTask: The asset download task.
     * - Parameter metricEvent: The metric event received.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didReceiveMetricEvent:")
    default void URLSessionAssetDownloadTaskDidReceiveMetricEvent(@NotNull NSURLSession session,
            @NotNull AVAssetDownloadTask assetDownloadTask, @NotNull AVMetricEvent metricEvent) {
        throw new java.lang.UnsupportedOperationException();
    }
}
