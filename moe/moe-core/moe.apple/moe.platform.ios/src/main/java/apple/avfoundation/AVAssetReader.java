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
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAssetReader
 * 
 * AVAssetReader provides services for obtaining media data from an asset.
 * 
 * Instances of AVAssetReader read media data from an instance of AVAsset, whether the asset is file-based or represents
 * an assembly of media data from multiple sources, as is the case with AVComposition.
 * 
 * Clients of AVAssetReader can read data from specific tracks of an asset and in specific formats by adding concrete
 * instances of AVAssetReaderOutput to an AVAssetReader instance.
 * 
 * AVAssetReaderTrackOutput, a concrete subclass of AVAssetReaderOutput, can either read the track's media samples in
 * the format in which they are stored by the asset or convert the media samples to a different format.
 * 
 * AVAssetReaderAudioMixOutput mixes multiple audio tracks of the asset after reading them, while
 * AVAssetReaderVideoCompositionOutput composites multiple video tracks after reading them.
 * 
 * API-Since: 4.1
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReader extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReader alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetReader allocWithZone(VoidPtr zone);

    /**
     * assetReaderWithAsset:error:
     * 
     * Returns an instance of AVAssetReader for reading media data from the specified asset.
     * 
     * If the specified asset belongs to a mutable subclass of AVAsset, AVMutableComposition or AVMutableMovie, the
     * results of any asset reading operation are undefined if you mutate the asset after invoking -startReading.
     * 
     * @param asset
     *                 The asset from which media data is to be read.
     * @param outError
     *                 On return, if initialization of the AVAssetReader fails, points to an NSError describing the
     *                 nature of the failure.
     * @return An instance of AVAssetReader.
     */
    @Generated
    @Selector("assetReaderWithAsset:error:")
    public static native AVAssetReader assetReaderWithAssetError(@NotNull AVAsset asset,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAssetReader new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addOutput:
     * 
     * Adds an output to the receiver.
     * 
     * Outputs are created with a reference to one or more AVAssetTrack objects. These tracks must be owned by the asset
     * returned by the receiver's asset property.
     * 
     * This method throws an exception if the output has already been added to an AVAssetReader or if reading has
     * started (`status` has progressed beyond AVAssetReaderStatusUnknown).
     * 
     * @param output
     *               The AVAssetReaderOutput object to be added.
     */
    @Generated
    @Selector("addOutput:")
    public native void addOutput(@NotNull AVAssetReaderOutput output);

    /**
     * [@property] asset
     * 
     * The asset from which the receiver's outputs read sample buffers.
     * 
     * The value of this property is an AVAsset. Concrete instances of AVAssetReader that are created with specific
     * AVAssetTrack instances must obtain those tracks from the asset returned by this property.
     */
    @NotNull
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * canAddOutput:
     * 
     * Tests whether an output can be added to the receiver.
     * 
     * An output that reads from a track of an asset other than the asset used to initialize the receiver cannot be
     * added.
     * 
     * @param output
     *               The AVAssetReaderOutput object to be tested.
     * @return
     *         A BOOL indicating whether the output can be added to the receiver.
     */
    @Generated
    @Selector("canAddOutput:")
    public native boolean canAddOutput(@NotNull AVAssetReaderOutput output);

    /**
     * cancelReading
     * 
     * Cancels any background work and prevents the receiver's outputs from reading more samples.
     * 
     * Clients that want to stop reading samples from the receiver before reaching the end of its time range should call
     * this method to stop any background read ahead operations that the may have been in progress.
     * 
     * This method should not be called concurrently with any calls to -[AVAssetReaderOutput copyNextSampleBuffer].
     */
    @Generated
    @Selector("cancelReading")
    public native void cancelReading();

    /**
     * [@property] error
     * 
     * If the receiver's status is AVAssetReaderStatusFailed, this describes the error that caused the failure.
     * 
     * The value of this property is an NSError that describes what caused the receiver to no longer be able to read its
     * asset. If the receiver's status is not AVAssetReaderStatusFailed, the value of this property is nil. This
     * property is thread safe.
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("init")
    public native AVAssetReader init();

    /**
     * initWithAsset:error:
     * 
     * Creates an instance of AVAssetReader for reading media data from the specified asset.
     * 
     * If the specified asset belongs to a mutable subclass of AVAsset, AVMutableComposition or AVMutableMovie, the
     * results of any asset reading operation are undefined if you mutate the asset after invoking -startReading.
     * 
     * @param asset
     *                 The asset from which media data is to be read.
     * @param outError
     *                 On return, if initialization of the AVAssetReader fails, points to an NSError describing the
     *                 nature of the failure.
     * @return
     *         An instance of AVAssetReader.
     */
    @Generated
    @Selector("initWithAsset:error:")
    public native AVAssetReader initWithAssetError(@NotNull AVAsset asset,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] outputs
     * 
     * The outputs from which clients of receiver can read media data.
     * 
     * The value of this property is an NSArray containing concrete instances of AVAssetReaderOutput. Outputs can be
     * added to the receiver using the addOutput: method.
     */
    @NotNull
    @Generated
    @Selector("outputs")
    public native NSArray<? extends AVAssetReaderOutput> outputs();

    /**
     * [@property] timeRange
     * 
     * Specifies a range of time that may limit the temporal portion of the receiver's asset from which media data will
     * be read.
     * 
     * The intersection of the value of timeRange and CMTimeRangeMake(kCMTimeZero, asset.duration) will determine the
     * time range of the asset from which media data will be read. The default value of timeRange is
     * CMTimeRangeMake(kCMTimeZero, kCMTimePositiveInfinity).
     * 
     * This property throws an exception if a value is set after reading has started.
     */
    @Generated
    @Selector("setTimeRange:")
    public native void setTimeRange(@ByValue CMTimeRange value);

    /**
     * startReading
     * 
     * Prepares the receiver for reading sample buffers from the asset.
     * 
     * This method validates the entire collection of settings for outputs for tracks, for audio mixing, and for video
     * composition and initiates reading from the receiver's asset.
     * 
     * If this method returns NO, clients can determine the nature of the failure by checking the value of the status
     * and error properties.
     * 
     * This method throws an exception if reading has already started (`status` has progressed beyond
     * AVAssetReaderStatusUnknown).
     * 
     * @return
     *         A BOOL indicating whether reading could be started.
     */
    @Generated
    @Selector("startReading")
    public native boolean startReading();

    /**
     * [@property] status
     * 
     * The status of reading sample buffers from the receiver's asset.
     * 
     * The value of this property is an AVAssetReaderStatus that indicates whether reading is in progress, has completed
     * successfully, has been canceled, or has failed. Clients of AVAssetReaderOutput objects should check the value of
     * this property after -[AVAssetReaderOutput copyNextSampleBuffer] returns NULL to determine why no more samples
     * could be read. This property is thread safe.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * [@property] timeRange
     * 
     * Specifies a range of time that may limit the temporal portion of the receiver's asset from which media data will
     * be read.
     * 
     * The intersection of the value of timeRange and CMTimeRangeMake(kCMTimeZero, asset.duration) will determine the
     * time range of the asset from which media data will be read. The default value of timeRange is
     * CMTimeRangeMake(kCMTimeZero, kCMTimePositiveInfinity).
     * 
     * This property throws an exception if a value is set after reading has started.
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();
}
