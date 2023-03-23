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

/**
 * [@protocol] AVAssetDownloadDelegate
 * 
 * Delegate methods to implement when adopting AVAssetDownloadTask.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAssetDownloadDelegate")
public interface AVAssetDownloadDelegate extends NSURLSessionTaskDelegate {
    /**
     * URLSession:assetDownloadTask:didFinishDownloadingToURL:
     * 
     * Sent when a download task that has completed a download.
     * 
     * Unlike NSURLSessionDownloadDelegate, the delegate should NOT move the file from this directory after it has been
     * called. Downloaded assets must remain at the system provided URL. URLSession:task:didCompleteWithError: will
     * still be called.
     * 
     * @param session
     *                          The session the asset download task is on.
     * @param assetDownloadTask
     *                          The AVAssetDownloadTask whose downloaded completed.
     * @param location
     *                          The location the asset has been downloaded to.
     * 
     *                          API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didFinishDownloadingToURL:")
    default void URLSessionAssetDownloadTaskDidFinishDownloadingToURL(NSURLSession session,
            AVAssetDownloadTask assetDownloadTask, NSURL location) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:assetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:
     * 
     * Method to adopt to subscribe to progress updates of an AVAssetDownloadTask.
     * 
     * @param session
     *                                The session the asset download task is on.
     * @param assetDownloadTask
     *                                The AVAssetDownloadTask which is being updated.
     * @param timeRange
     *                                A CMTimeRange indicating the time range loaded since the last time this method was
     *                                called.
     * @param loadedTimeRanges
     *                                A NSArray of NSValues of CMTimeRanges indicating all the time ranges loaded by
     *                                this asset download task.
     * @param timeRangeExpectedToLoad
     *                                A CMTimeRange indicating the single time range that is expected to be loaded when
     *                                the download is complete.
     * 
     *                                API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:")
    default void URLSessionAssetDownloadTaskDidLoadTimeRangeTotalTimeRangesLoadedTimeRangeExpectedToLoad(
            NSURLSession session, AVAssetDownloadTask assetDownloadTask, @ByValue CMTimeRange timeRange,
            NSArray<? extends NSValue> loadedTimeRanges, @ByValue CMTimeRange timeRangeExpectedToLoad) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:assetDownloadTask:didResolveMediaSelection:
     * 
     * Method called when the media selection for the download is fully resolved, including any automatic selections.
     * 
     * @param session
     *                               The session the asset download task is on.
     * @param assetDownloadTask
     *                               The AVAssetDownloadTask which is being updated.
     * @param resolvedMediaSelection
     *                               The resolved media selection for the download task. For the best chance of playing
     *                               back downloaded content without further network I/O, apply this selection to
     *                               subsequent AVPlayerItems.
     * 
     *                               API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:didResolveMediaSelection:")
    default void URLSessionAssetDownloadTaskDidResolveMediaSelection(NSURLSession session,
            AVAssetDownloadTask assetDownloadTask, AVMediaSelection resolvedMediaSelection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:aggregateAssetDownloadTask:didCompleteForMediaSelection:
     * 
     * Method called when a child AVAssetDownloadTask completes.
     * 
     * @param session
     *                                   The session the aggregate asset download task is on.
     * @param aggregateAssetDownloadTask
     *                                   The AVAggregateAssetDownloadTask.
     * @param mediaSelection
     *                                   The AVMediaSelection which is now fully available for offline use.
     * 
     *                                   API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:aggregateAssetDownloadTask:didCompleteForMediaSelection:")
    default void URLSessionAggregateAssetDownloadTaskDidCompleteForMediaSelection(NSURLSession session,
            AVAggregateAssetDownloadTask aggregateAssetDownloadTask, AVMediaSelection mediaSelection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:aggregateAssetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:forMediaSelection:
     * 
     * Method to adopt to subscribe to progress updates of an AVAggregateAssetDownloadTask
     * 
     * @param session
     *                                   The session the asset download task is on.
     * @param aggregateAssetDownloadTask
     *                                   The AVAggregateAssetDownloadTask.
     * @param timeRange
     *                                   A CMTimeRange indicating the time range loaded for the media selection being
     *                                   downloaded.
     * @param loadedTimeRanges
     *                                   A NSArray of NSValues of CMTimeRanges indicating all the time ranges loaded for
     *                                   the media selection being downloaded.
     * @param timeRangeExpectedToLoad
     *                                   A CMTimeRange indicating the single time range that is expected to be loaded
     *                                   when the download is complete for the media selection being downloaded.
     * @param mediaSelection
     *                                   The media selection which has additional media data loaded for offline use.
     * 
     *                                   API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:aggregateAssetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:forMediaSelection:")
    default void URLSessionAggregateAssetDownloadTaskDidLoadTimeRangeTotalTimeRangesLoadedTimeRangeExpectedToLoadForMediaSelection(
            NSURLSession session, AVAggregateAssetDownloadTask aggregateAssetDownloadTask,
            @ByValue CMTimeRange timeRange, NSArray<? extends NSValue> loadedTimeRanges,
            @ByValue CMTimeRange timeRangeExpectedToLoad, AVMediaSelection mediaSelection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:aggregateAssetDownloadTask:willDownloadToURL:
     * 
     * Method called when the aggregate download task determines the location this asset will be downloaded to.
     * 
     * This URL should be saved for future instantiations of AVAsset. While an AVAsset already exists for this content,
     * it is advisable to re-use that instance.
     * 
     * @param session
     *                                   The session the aggregate asset download task is on.
     * @param aggregateAssetDownloadTask
     *                                   The AVAggregateAssetDownloadTask.
     * @param location
     *                                   The file URL this task will download media data to.
     * 
     *                                   API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:aggregateAssetDownloadTask:willDownloadToURL:")
    default void URLSessionAggregateAssetDownloadTaskWillDownloadToURL(NSURLSession session,
            AVAggregateAssetDownloadTask aggregateAssetDownloadTask, NSURL location) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:assetDownloadTask:willDownloadVariants:
     * 
     * Sent when a download task has completed the variant selection.
     * 
     * @param session
     *                          The session the asset download task is on.
     * @param assetDownloadTask
     *                          The asset download task.
     * @param variants
     *                          The variants chosen. Depends on the environmental condition when the download starts.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("URLSession:assetDownloadTask:willDownloadVariants:")
    default void URLSessionAssetDownloadTaskWillDownloadVariants(NSURLSession session,
            AVAssetDownloadTask assetDownloadTask, NSArray<? extends AVAssetVariant> variants) {
        throw new java.lang.UnsupportedOperationException();
    }
}
