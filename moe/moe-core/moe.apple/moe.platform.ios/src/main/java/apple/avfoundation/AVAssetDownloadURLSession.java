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

package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVAssetDownloadDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLSession;
import apple.foundation.NSURLSessionConfiguration;
import apple.foundation.protocol.NSURLSessionDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAssetDownloadURLSession
 * <p>
 * A subclass of NSURLSession to support AVAssetDownloadTask.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetDownloadURLSession extends NSURLSession {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetDownloadURLSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetDownloadURLSession alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetDownloadURLSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAssetDownloadURLSession new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("sessionWithConfiguration:")
    public static native NSURLSession sessionWithConfiguration(NSURLSessionConfiguration configuration);

    /**
     * sessionWithConfiguration:assetDownloadDelegate:delegateQueue:
     * <p>
     * Creates and initializes an AVAssetDownloadURLSession for use with AVAssetDownloadTasks.
     *
     * @param            configuration The configuration for this URLSession. Must be a background configuration.
     * @param            delegate The delegate object to handle asset download progress updates and other session related events.
     * @param            delegateQueue The queue to receive delegate callbacks on. If nil, a serial queue will be provided.
     */
    @Generated
    @Selector("sessionWithConfiguration:assetDownloadDelegate:delegateQueue:")
    public static native AVAssetDownloadURLSession sessionWithConfigurationAssetDownloadDelegateDelegateQueue(
            NSURLSessionConfiguration configuration, @Mapped(ObjCObjectMapper.class) AVAssetDownloadDelegate delegate,
            NSOperationQueue delegateQueue);

    @Generated
    @Selector("sessionWithConfiguration:delegate:delegateQueue:")
    public static native NSURLSession sessionWithConfigurationDelegateDelegateQueue(
            NSURLSessionConfiguration configuration, @Mapped(ObjCObjectMapper.class) NSURLSessionDelegate delegate,
            NSOperationQueue queue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sharedSession")
    public static native NSURLSession sharedSession();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * assetDownloadTaskWithURLAsset:assetTitle:assetArtworkData:options:
     * <p>
     * Creates and initializes an AVAssetDownloadTask to be used with this AVAssetDownloadURLSession.
     * <p>
     * This method may return nil if the URLSession has been invalidated.
     *
     * @param            URLAsset The AVURLAsset to download locally.
     * @param            title A human readable title for this asset, expected to be as suitable as possible for the user's preferred languages. Will show up in the usage pane of the settings app.
     * @param            artworkData NSData representing artwork data for this asset. Optional. Will show up in the usage pane of the settings app. Must work with +[UIImage imageWithData:].
     * @param            options See AVAssetDownloadTask*Key above. Configures non-default behavior for the download task. Using this parameter is required for downloading non-default media selections for HLS assets.
     */
    @Generated
    @Selector("assetDownloadTaskWithURLAsset:assetTitle:assetArtworkData:options:")
    public native AVAssetDownloadTask assetDownloadTaskWithURLAssetAssetTitleAssetArtworkDataOptions(
            AVURLAsset URLAsset, String title, NSData artworkData, NSDictionary<String, ?> options);

    /**
     * assetDownloadTaskWithURLAsset:destinationURL:options:
     * <p>
     * Creates and initializes an AVAssetDownloadTask to be used with this AVAssetDownloadURLSession.
     * <p>
     * This method may return nil if the URLSession has been invalidated.
     *
     * @param            URLAsset The AVURLAsset to download locally.
     * @param            destinationURL The local URL to download the asset to. This must be a file URL.
     * @param            options See AVAssetDownloadTask*Key above. Configures non-default behavior for the download task. Using this parameter is required for downloading non-default media selections for HLS assets.
     */
    @Generated
    @Selector("assetDownloadTaskWithURLAsset:destinationURL:options:")
    public native AVAssetDownloadTask assetDownloadTaskWithURLAssetDestinationURLOptions(AVURLAsset URLAsset,
            NSURL destinationURL, NSDictionary<String, ?> options);

    @Generated
    @Selector("init")
    public native AVAssetDownloadURLSession init();

    /**
     * aggregateAssetDownloadTaskWithURLAsset:mediaSelections:assetTitle:assetArtworkData:options:
     * <p>
     * Creates and initializes an AVAggregateAssetDownloadTask to download multiple AVMediaSelections on an AVURLAsset.
     * <p>
     * This method may return nil if the URLSession has been invalidated. The value of AVAssetDownloadTaskMediaSelectionKey will be ignored.
     *
     * @param            URLAsset The AVURLAsset to download locally.
     * @param            mediaSelections A list of AVMediaSelections. Each AVMediaSelection will correspond to a childAssetDownloadTask. Use -[AVAsset allMediaSelections] to download all AVMediaSelections on this AVAsset.
     * @param            title A human readable title for this asset, expected to be as suitable as possible for the user's preferred languages. Will show up in the usage pane of the settings app.
     * @param            artworkData Artwork data for this asset. Optional. Will show up in the usage pane of the settings app.
     * @param            options See AVAssetDownloadTask*Key above. Configures non-default behavior for the download task.
     */
    @Generated
    @Selector("aggregateAssetDownloadTaskWithURLAsset:mediaSelections:assetTitle:assetArtworkData:options:")
    public native AVAggregateAssetDownloadTask aggregateAssetDownloadTaskWithURLAssetMediaSelectionsAssetTitleAssetArtworkDataOptions(
            AVURLAsset URLAsset, NSArray<? extends AVMediaSelection> mediaSelections, String title, NSData artworkData,
            NSDictionary<String, ?> options);

    /**
     * assetDownloadTaskWithConfiguration:
     * <p>
     * Creates and initializes an AVAssetDownloadTask to be used with this AVAssetDownloadURLSession.
     * <p>
     * This method will throw an exception if the URLSession has been invalidated.
     *
     * @param            downloadConfiguration The configuration to be used to create the download task.
     */
    @Generated
    @Selector("assetDownloadTaskWithConfiguration:")
    public native AVAssetDownloadTask assetDownloadTaskWithConfiguration(
            AVAssetDownloadConfiguration downloadConfiguration);
}
