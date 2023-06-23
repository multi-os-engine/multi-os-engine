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
import apple.avfoundation.protocol.AVAssetWriterDelegate;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uniformtypeidentifiers.UTType;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAssetWriter
 * 
 * AVAssetWriter provides services for writing media data to a new file,
 * 
 * Instances of AVAssetWriter can write media to new files in formats such as the QuickTime movie file format or the
 * MPEG-4 file format. AVAssetWriter has support for automatic interleaving of media data for multiple concurrent
 * tracks. Source media data can be obtained from instances of AVAssetReader for one or more assets or from other
 * sources outside of AVFoundation.
 * 
 * Instances of AVAssetWriter can re-encode media samples as they are written. Instances of AVAssetWriter can also
 * optionally write metadata collections to the output file.
 * 
 * A single instance of AVAssetWriter can be used once to write to a single file. Clients that wish to write to files
 * multiple times must use a new instance of AVAssetWriter each time.
 * 
 * API-Since: 4.1
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetWriter allocWithZone(VoidPtr zone);

    /**
     * assetWriterWithURL:fileType:error:
     * 
     * Returns an instance of AVAssetWriter configured to write to a file in a specified container format.
     * 
     * Writing will fail if a file already exists at the specified URL.
     * 
     * UTIs for container formats that can be written are declared in AVMediaFormat.h.
     * 
     * @param URL
     *                 The location of the file to be written. The URL must be a file URL.
     * @param fileType
     *                 A UTI indicating the format of the file to be written.
     * @param outError
     *                 On return, if initialization of the AVAssetWriter fails, points to an NSError describing the
     *                 nature of the failure.
     * @return
     *         An instance of AVAssetWriter.
     */
    @Generated
    @Selector("assetWriterWithURL:fileType:error:")
    public static native AVAssetWriter assetWriterWithURLFileTypeError(@NotNull NSURL outputURL,
            @NotNull String outputFileType, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    public static native AVAssetWriter new_objc();

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
     * addInput:
     * 
     * Adds an input to the receiver.
     * 
     * Inputs are created with a media type and output settings. These both must be compatible with the receiver.
     * 
     * Inputs cannot be added after writing has started.
     * 
     * This method throws an exception if any of the following conditions are satisfied:
     * - the input's media type is not allowed for this asset writer
     * - writing uncompressed video in a specific format
     * - passthrough* to files (other than AVFileTypeQuickTimeMovie) is missing a format hint in the AVAssetWriterInput
     * initializer
     * - passthrough* is not supported for this media/file type combination (for example, AVFileTypeWAVE only supports
     * AVMediaTypeAudio)
     * 
     * *Passthrough is indicated when the input's output settings are nil.
     * 
     * @param input
     *              The AVAssetWriterInput object to be added.
     */
    @Generated
    @Selector("addInput:")
    public native void addInput(@NotNull AVAssetWriterInput input);

    /**
     * addInputGroup:
     * 
     * Adds an instance of AVAssetWriterInputGroup to the AVAssetWriter. The AVAssetWriter will mark the tracks
     * associated with grouped inputs as mutually exclusive to each other for playback or other processing, if the
     * output container format supports mutually exlusive relationships among tracks.
     * 
     * When an input group is added to an AVAssetWriter, the value of marksOutputTrackAsEnabled will automatically be
     * set to YES for the default input and set to NO for all of the other inputs in the group.
     * 
     * Input groups cannot be added after writing has started.
     * 
     * API-Since: 7.0
     * 
     * @param inputGroup
     *                   The collection of AVAssetWriterInputs to be grouped together.
     */
    @Generated
    @Selector("addInputGroup:")
    public native void addInputGroup(@NotNull AVAssetWriterInputGroup inputGroup);

    /**
     * [@property] availableMediaTypes
     * 
     * The media types for which inputs can be added to the receiver.
     * 
     * Some media types may not be accepted within the file format with which an AVAssetWriter was initialized.
     */
    @NotNull
    @Generated
    @Selector("availableMediaTypes")
    public native NSArray<String> availableMediaTypes();

    /**
     * canAddInput:
     * 
     * Tests whether an input can be added to the receiver.
     * 
     * An input that accepts media data of a type that is not compatible with the receiver, or with output settings that
     * are not compatible with the receiver, cannot be added.
     * 
     * @param input
     *              The AVAssetWriterInput object to be tested.
     * @return
     *         A BOOL indicating whether the input can be added to the receiver.
     */
    @Generated
    @Selector("canAddInput:")
    public native boolean canAddInput(@NotNull AVAssetWriterInput input);

    /**
     * canAddInputGroup:
     * 
     * Tests whether an input group can be added to the receiver.
     * 
     * If outputFileType specifies a container format that does not support mutually exclusive relationships among
     * tracks, or if the specified instance of AVAssetWriterInputGroup contains inputs with media types that cannot be
     * related, the group cannot be added to the AVAssetWriter.
     * 
     * This method throws an exception if any of the following conditions are satisfied:
     * - this writer's output file type does not support mutually exclusive relationships among tracks (allowed types
     * are AVFileTypeQuickTimeMovie, AVFileTypeAppleM4A, AVFileTypeAppleM4V, AVFileType3GPP [iPhone only],
     * AVFileTypeMPEG4)
     * - any AVAssetWriterInput in the input group is also present in an input group already added
     * 
     * API-Since: 7.0
     * 
     * @param inputGroup
     *                   The AVAssetWriterInputGroup object to be tested.
     * @return
     *         A BOOL indicating whether the input group can be added to the receiver.
     */
    @Generated
    @Selector("canAddInputGroup:")
    public native boolean canAddInputGroup(@NotNull AVAssetWriterInputGroup inputGroup);

    /**
     * canApplyOutputSettings:forMediaType:
     * 
     * Tests whether output settings for a specific media type are supported by the receiver's file format.
     * 
     * This method determines whether the output settings for the specified media type can be used with the receiver's
     * file format. For example, video compression settings that specify H.264 compression are not compatible with file
     * formats that cannot contain H.264-compressed video.
     * 
     * Attempting to add an input with output settings and a media type for which this method returns NO will cause an
     * exception to be thrown.
     * 
     * @param outputSettings
     *                       The output settings that are to be tested.
     * @param mediaType
     *                       The media type for which the output settings are to be tested. Media types are defined in
     *                       AVMediaFormat.h.
     * @return
     *         A BOOL indicating whether the given output settings can be used for the given media type.
     */
    @Generated
    @Selector("canApplyOutputSettings:forMediaType:")
    public native boolean canApplyOutputSettingsForMediaType(@Nullable NSDictionary<String, ?> outputSettings,
            @NotNull String mediaType);

    /**
     * cancelWriting
     * 
     * Cancels the creation of the output file.
     * 
     * If the status of the receiver is "failed" or "completed," -cancelWriting is a no-op. Otherwise, this method will
     * block until writing is canceled.
     * 
     * If an output file was created by the receiver during the writing process, -cancelWriting will delete the file.
     * 
     * This method should not be called concurrently with -[AVAssetWriterInput appendSampleBuffer:] or
     * -[AVAssetWriterInputPixelBufferAdaptor appendPixelBuffer:withPresentationTime:].
     */
    @Generated
    @Selector("cancelWriting")
    public native void cancelWriting();

    /**
     * [@property] directoryForTemporaryFiles
     * 
     * Specifies a directory that is suitable for containing temporary files generated during the process of writing an
     * asset.
     * 
     * AVAssetWriter may need to write temporary files when configured in certain ways, such as when
     * performsMultiPassEncodingIfSupported is set to YES on one or more of its inputs. This property can be used to
     * control where in the filesystem those temporary files are created. All temporary files will be deleted when asset
     * writing is completed, is canceled, or fails.
     * 
     * When the value of this property is nil, the asset writer will choose a suitable location when writing temporary
     * files. The default value is nil.
     * 
     * This property cannot be set after writing has started. The asset writer will fail if a file cannot be created in
     * this directory (for example, due to insufficient permissions).
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("directoryForTemporaryFiles")
    public native NSURL directoryForTemporaryFiles();

    /**
     * endSessionAtSourceTime:
     * 
     * Concludes a sample-writing session.
     * 
     * Call this method to complete a session started with -startSessionAtSourceTime:.
     * 
     * The endTime defines the moment on the timeline of source samples at which the session ends. In the case of the
     * QuickTime movie file format, each sample-writing session's startTime...endTime pair corresponds to a period of
     * movie time into which the session's samples are inserted. Samples with timestamps that are later than the session
     * end time will still be added to the written file but will be edited out (i.e. not presented during playback). So
     * if the first session has duration D1 = endTime - startTime, it will be inserted into the written file at time 0
     * through D1; the second session would be inserted into the written file at time D1 through D1+D2, etc. It is legal
     * to have a session with no samples; this will cause creation of an empty edit of the prescribed duration.
     * 
     * It is not mandatory to call -endSessionAtSourceTime:; if -finishWritingWithCompletionHandler: is called without
     * first invoking -endSessionAtSourceTime:, the session's effective end time will be the latest end timestamp of the
     * session's appended samples (i.e. no samples will be edited out at the end).
     * 
     * It is an error to append samples outside of a sample-writing session. To append more samples after invoking
     * -endSessionAtSourceTime:, you must first start a new session using -startSessionAtSourceTime:.
     * 
     * NOTE: Multiple sample-writing sessions are currently not supported. It is an error to call
     * -startSessionAtSourceTime: a second time after calling -endSessionAtSourceTime:.
     * 
     * This method throws an exception if the session is ended without first starting it.
     * 
     * @param endTime
     *                The ending asset time for the sample-writing session, in the timeline of the source samples.
     */
    @Generated
    @Selector("endSessionAtSourceTime:")
    public native void endSessionAtSourceTime(@ByValue CMTime endTime);

    /**
     * [@property] error
     * 
     * If the receiver's status is AVAssetWriterStatusFailed, this describes the error that caused the failure.
     * 
     * The value of this property is an NSError that describes what caused the receiver to no longer be able to write to
     * its output file. If the receiver's status is not AVAssetWriterStatusFailed, the value of this property is nil.
     * This property is thread safe.
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * finishWriting
     * 
     * Completes the writing of the output file.
     * 
     * This method is deprecated. Use finishWritingWithCompletionHandler: instead.
     * 
     * This method will block until writing is finished. When this method returns successfully, the file being written
     * by the receiver is complete and ready to use.
     * 
     * Because this method is blocking and can take a long time to execute (especially with shouldOptimizeForNetworkUse
     * set to YES), it should not be called from the main thread. Doing so can cause the finishWriting operation to
     * fail.
     * 
     * If writing cannot be finished, this method returns NO. Clients can check the values of the status and error
     * properties for more information on why writing could not be finished.
     * 
     * This method should not be called concurrently with -[AVAssetWriterInput appendSampleBuffer:] or
     * -[AVAssetWriterInputPixelBufferAdaptor appendPixelBuffer:withPresentationTime:].
     * 
     * API-Since: 4.1
     * Deprecated-Since: 6.0
     * 
     * @return
     *         A BOOL indicating whether writing successfully finished.
     */
    @Generated
    @Deprecated
    @Selector("finishWriting")
    public native boolean finishWriting();

    /**
     * finishWritingWithCompletionHandler:
     * 
     * Marks all unfinished inputs as finished and completes the writing of the output file.
     * 
     * This method returns immediately and causes its work to be performed asynchronously.
     * 
     * When the writing of the output file is finished, or if a failure or a cancellation occurs in the meantime, the
     * specified handler will be invoked to indicate completion of the operation. To determine whether the operation
     * succeeded, your handler can check the value of AVAssetWriter.status. If the status is AVAssetWriterStatusFailed,
     * AVAsset.error will contain an instance of NSError that describes the failure.
     * 
     * To guarantee that all sample buffers are successfully written, ensure all calls to -[AVAssetWriterInput
     * appendSampleBuffer:] or -[AVAssetWriterInputPixelBufferAdaptor appendPixelBuffer:withPresentationTime:] have
     * returned before invoking this method.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("finishWritingWithCompletionHandler:")
    public native void finishWritingWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_finishWritingWithCompletionHandler") Block_finishWritingWithCompletionHandler handler);

    @Generated
    @Selector("init")
    public native AVAssetWriter init();

    /**
     * initWithURL:fileType:error:
     * 
     * Creates an instance of AVAssetWriter configured to write to a file in a specified container format.
     * 
     * Writing will fail if a file already exists at the specified URL.
     * 
     * This method throws an exception if the output file type is not declared in AVMediaFormat.h.
     * 
     * @param URL
     *                 The location of the file to be written. The URL must be a file URL.
     * @param fileType
     *                 A UTI indicating the format of the file to be written.
     * @param outError
     *                 On return, if initialization of the AVAssetWriter fails, points to an NSError describing the
     *                 nature of the failure.
     * @return
     *         An instance of AVAssetWriter.
     */
    @Generated
    @Selector("initWithURL:fileType:error:")
    public native AVAssetWriter initWithURLFileTypeError(@NotNull NSURL outputURL, @NotNull String outputFileType,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] inputGroups
     * 
     * The instances of AVAssetWriterInputGroup that have been added to the AVAssetWriter.
     * 
     * The value of this property is an NSArray containing concrete instances of AVAssetWriterInputGroup. Input groups
     * can be added to the receiver using the addInputGroup: method.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("inputGroups")
    public native NSArray<? extends AVAssetWriterInputGroup> inputGroups();

    /**
     * [@property] inputs
     * 
     * The inputs from which the asset writer receives media data.
     * 
     * The value of this property is an NSArray containing concrete instances of AVAssetWriterInput. Inputs can be added
     * to the receiver using the addInput: method.
     */
    @NotNull
    @Generated
    @Selector("inputs")
    public native NSArray<? extends AVAssetWriterInput> inputs();

    /**
     * [@property] metadata
     * 
     * A collection of metadata to be written to the receiver's output file.
     * 
     * The value of this property is an array of AVMetadataItem objects representing the collection of top-level
     * metadata to be written in the output file.
     * 
     * This property cannot be set after writing has started.
     */
    @NotNull
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * [@property] movieFragmentInterval
     * 
     * For file types that support movie fragments, specifies the frequency at which movie fragments should be written.
     * 
     * When movie fragments are used, a partially written asset whose writing is unexpectedly interrupted can be
     * successfully opened and played up to multiples of the specified time interval. The default value of this property
     * is kCMTimeInvalid, which indicates that movie fragments should not be used.
     * 
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("movieFragmentInterval")
    @ByValue
    public native CMTime movieFragmentInterval();

    /**
     * [@property] movieTimeScale
     * 
     * For file types that contain a 'moov' atom, such as QuickTime Movie files, specifies the asset-level time scale to
     * be used.
     * 
     * The default value is 0, which indicates that the receiver should choose a convenient value, if applicable.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("movieTimeScale")
    public native int movieTimeScale();

    /**
     * [@property] outputFileType
     * 
     * The UTI of the file format of the file for which the instance of AVAssetWriter was initialized for writing.
     */
    @NotNull
    @Generated
    @Selector("outputFileType")
    public native String outputFileType();

    /**
     * [@property] outputURL
     * 
     * The location of the file for which the instance of AVAssetWriter was initialized for writing.
     * 
     * You may use [[UTType typeWithIdentifier:outputFileType] preferredFilenameExtension] to obtain an appropriate path
     * extension for the outputFileType you have specified. For more information, see <UniformTypeIdentifiers/UTType.h>.
     */
    @NotNull
    @Generated
    @Selector("outputURL")
    public native NSURL outputURL();

    /**
     * [@property] overallDurationHint
     * 
     * For file types that support movie fragments, provides a hint of the final duration of the file to be written
     * 
     * The value of this property must be a nonnegative, numeric CMTime. Alternatively, if the value of this property is
     * an invalid CMTime (e.g. kCMTimeInvalid), no overall duration hint will be written to the file. The default value
     * is kCMTimeInvalid.
     * 
     * This property is currently ignored if movie fragments are not being written. Use the movieFragmentInterval
     * property to enable movie fragments.
     * 
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("overallDurationHint")
    @ByValue
    public native CMTime overallDurationHint();

    /**
     * [@property] directoryForTemporaryFiles
     * 
     * Specifies a directory that is suitable for containing temporary files generated during the process of writing an
     * asset.
     * 
     * AVAssetWriter may need to write temporary files when configured in certain ways, such as when
     * performsMultiPassEncodingIfSupported is set to YES on one or more of its inputs. This property can be used to
     * control where in the filesystem those temporary files are created. All temporary files will be deleted when asset
     * writing is completed, is canceled, or fails.
     * 
     * When the value of this property is nil, the asset writer will choose a suitable location when writing temporary
     * files. The default value is nil.
     * 
     * This property cannot be set after writing has started. The asset writer will fail if a file cannot be created in
     * this directory (for example, due to insufficient permissions).
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(@Nullable NSURL value);

    /**
     * [@property] metadata
     * 
     * A collection of metadata to be written to the receiver's output file.
     * 
     * The value of this property is an array of AVMetadataItem objects representing the collection of top-level
     * metadata to be written in the output file.
     * 
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(@NotNull NSArray<? extends AVMetadataItem> value);

    /**
     * [@property] movieFragmentInterval
     * 
     * For file types that support movie fragments, specifies the frequency at which movie fragments should be written.
     * 
     * When movie fragments are used, a partially written asset whose writing is unexpectedly interrupted can be
     * successfully opened and played up to multiples of the specified time interval. The default value of this property
     * is kCMTimeInvalid, which indicates that movie fragments should not be used.
     * 
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("setMovieFragmentInterval:")
    public native void setMovieFragmentInterval(@ByValue CMTime value);

    /**
     * [@property] movieTimeScale
     * 
     * For file types that contain a 'moov' atom, such as QuickTime Movie files, specifies the asset-level time scale to
     * be used.
     * 
     * The default value is 0, which indicates that the receiver should choose a convenient value, if applicable.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("setMovieTimeScale:")
    public native void setMovieTimeScale(int value);

    /**
     * [@property] overallDurationHint
     * 
     * For file types that support movie fragments, provides a hint of the final duration of the file to be written
     * 
     * The value of this property must be a nonnegative, numeric CMTime. Alternatively, if the value of this property is
     * an invalid CMTime (e.g. kCMTimeInvalid), no overall duration hint will be written to the file. The default value
     * is kCMTimeInvalid.
     * 
     * This property is currently ignored if movie fragments are not being written. Use the movieFragmentInterval
     * property to enable movie fragments.
     * 
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("setOverallDurationHint:")
    public native void setOverallDurationHint(@ByValue CMTime value);

    /**
     * [@property] shouldOptimizeForNetworkUse
     * 
     * Specifies whether the output file should be written in way that makes it more suitable for playback over a
     * network
     * 
     * When the value of this property is YES, the output file will be written in such a way that playback can start
     * after only a small amount of the file is downloaded.
     * 
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean value);

    /**
     * [@property] shouldOptimizeForNetworkUse
     * 
     * Specifies whether the output file should be written in way that makes it more suitable for playback over a
     * network
     * 
     * When the value of this property is YES, the output file will be written in such a way that playback can start
     * after only a small amount of the file is downloaded.
     * 
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();

    /**
     * startSessionAtSourceTime:
     * 
     * Initiates a sample-writing session for the receiver.
     * 
     * Sequences of sample data appended to the asset writer inputs are considered to fall within "sample-writing
     * sessions", initiated with this method. Accordingly, this method must be called after writing has started (using
     * -startWriting) but before any sample data is appended to the receiver's inputs.
     * 
     * Each writing session has a start time which, where allowed by the file format being written, defines the mapping
     * from the timeline of source samples to the timeline of the written file. In the case of the QuickTime movie file
     * format, the first session begins at movie time 0, so a sample appended with timestamp T will be played at movie
     * time (T-startTime). Samples with timestamps earlier than startTime will still be added to the output file but
     * will be edited out (i.e. not presented during playback). If the earliest appended sample for an input has a
     * timestamp later than than startTime, an empty edit will be inserted to preserve synchronization between tracks of
     * the output asset.
     * 
     * To end the session started by use of this method, use -endSessionAtSourceTime: or
     * -finishWritingWithCompletionHandler:. It is an error to invoke -startSessionAtSourceTime: twice in a row without
     * invoking -endSessionAtSourceTime: in between.
     * 
     * NOTE: Multiple sample-writing sessions are currently not supported. It is an error to call
     * -startSessionAtSourceTime: a second time after calling -endSessionAtSourceTime:.
     * 
     * @param startTime
     *                  The starting asset time for the sample-writing session, in the timeline of the source samples.
     */
    @Generated
    @Selector("startSessionAtSourceTime:")
    public native void startSessionAtSourceTime(@ByValue CMTime startTime);

    /**
     * startWriting
     * 
     * Prepares the receiver for accepting input and for writing its output to its output file.
     * 
     * This method must be called after all inputs have been added and other configuration properties have been set in
     * order to tell the receiver to prepare for writing. After this method is called, clients can start writing
     * sessions using startSessionAtSourceTime: and can write media samples using the methods provided by each of the
     * receiver's inputs.
     * 
     * If writing cannot be started, this method returns NO. Clients can check the values of the status and error
     * properties for more information on why writing could not be started.
     * 
     * On iOS, if the status of an AVAssetWriter is AVAssetWriterStatusWriting when the client app goes into the
     * background, its status will change to AVAssetWriterStatusFailed and appending to any of its inputs will fail. You
     * may want to use -[UIApplication beginBackgroundTaskWithExpirationHandler:] to avoid being interrupted in the
     * middle of a writing session and to finish writing the data that has already been appended. For more information
     * about executing code in the background, see the iOS Application Programming Guide.
     * 
     * @return
     *         A BOOL indicating whether writing successfully started.
     */
    @Generated
    @Selector("startWriting")
    public native boolean startWriting();

    /**
     * [@property] status
     * 
     * The status of writing samples to the receiver's output file.
     * 
     * The value of this property is an AVAssetWriterStatus that indicates whether writing is in progress, has completed
     * successfully, has been canceled, or has failed. Clients of AVAssetWriterInput objects should check the value of
     * this property after appending samples fails to determine why no more samples could be written. This property is
     * thread safe.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishWritingWithCompletionHandler {
        @Generated
        void call_finishWritingWithCompletionHandler();
    }

    /**
     * [@property] delegate
     * 
     * An object that implements one or more of the methods in the AVAssetWriterDelegate protocol.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAssetWriterDelegate delegate();

    /**
     * flushSegment
     * 
     * Closes the current segment and outputs it to the -assetWriter:didOutputSegmentData:segmentType:segmentReport: or
     * -assetWriter:didOutputSegmentData:segmentType: delegate method.
     * 
     * This method throws an exception if the delegate method to output segment data is not implemented, or if the value
     * of the preferredOutputSegmentInterval property is not kCMTimeIndefinite.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("flushSegment")
    public native void flushSegment();

    /**
     * initWithContentType:
     * 
     * Creates an instance of AVAssetWriter configured to output segment data in a specified container format.
     * 
     * Clients that want to receive segment data through the
     * -assetWriter:didOutputSegmentData:segmentType:segmentReport: or -assetWriter:didOutputSegmentData:segmentType:
     * delegate method should use this initializer instead of -initWithURL:fileType:error:.
     * 
     * Clients may use +typeWithIdentifier: with a UTI to create an instance of UTType. See
     * <UniformTypeIdentifiers/UTType.h>.
     * 
     * This method throws an exception if the output content type UTI for container format is not declared in
     * AVMediaFormat.h.
     * 
     * API-Since: 14.0
     * 
     * @param outputContentType
     *                          A UTType indicating the format of the segment data to be output.
     * @return
     *         An instance of AVAssetWriter.
     */
    @Generated
    @Selector("initWithContentType:")
    public native AVAssetWriter initWithContentType(@NotNull UTType outputContentType);

    /**
     * [@property] initialMovieFragmentSequenceNumber
     * 
     * For file types that support movie fragments, specifies the initial movie fragment sequence number.
     * 
     * The value must be equal to or greater than 1.
     * 
     * The default value is 1.
     * 
     * Note that if you combine movie fragments produced by an instance of AVAssetWriter with additional movie
     * fragments, produced either by a different instance of AVAssetWriter or by some other means, it is necessary to
     * ensure that movie fragment sequence numbers increase monotonically across the entire combined collection, in
     * temporal order.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initialMovieFragmentSequenceNumber")
    @NInt
    public native long initialMovieFragmentSequenceNumber();

    /**
     * [@property] initialSegmentStartTime
     * 
     * Specifies start time of initial segment.
     * 
     * A numeric time must be set if the value of preferredOutputSegmentInterval property is positive numeric. If not,
     * this property is irrelevant.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initialSegmentStartTime")
    @ByValue
    public native CMTime initialSegmentStartTime();

    /**
     * [@property] outputFileTypeProfile
     * 
     * Specifies a file type profile for the specified file type.
     * 
     * The default value is nil, which means that the receiver will choose an appropriate default profile based on the
     * specified file type.
     * 
     * Clients that want to receive segment data that is suitable for streaming through the
     * -assetWriter:didOutputSegmentData:segmentType:segmentReport: or -assetWriter:didOutputSegmentData:segmentType:
     * delegate method should set AVFileTypeProfileMPEG4AppleHLS, or AVFileTypeProfileMPEG4CMAFCompliant to require
     * output that is specifically compliant with CMAF format, with AVFileTypeMPEG4 file type.
     * 
     * File type profiles are declared in AVMediaFormat.h.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("outputFileTypeProfile")
    public native String outputFileTypeProfile();

    /**
     * [@property] preferredOutputSegmentInterval
     * 
     * Specifies preferred segment interval.
     * 
     * The default value is kCMTimeInvalid, which means that the receiver will choose an appropriate default value. The
     * value can be set to positive numeric or kCMTimeIndefinite.
     * If the value is kCMTimeIndefinite, every time a client calls -flushSegment the receiver outputs a segment data.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("preferredOutputSegmentInterval")
    @ByValue
    public native CMTime preferredOutputSegmentInterval();

    /**
     * [@property] producesCombinableFragments
     * 
     * For file types that support fragmented MPEG-4, specifies whether the movie fragments should be produced in way
     * that makes them suitable for combining with movie fragments produced by one or more other instances of
     * AVAssetWriter into a single fragment stream of uniform encoding.
     * 
     * The default value is NO.
     * 
     * When multiple instances of AVAssetWriter are used to produce distinct streams that complement each other, for
     * example to create HLS encoding or bitrate variants, it’s not necessary to set this property to YES.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("producesCombinableFragments")
    public native boolean producesCombinableFragments();

    /**
     * [@property] delegate
     * 
     * An object that implements one or more of the methods in the AVAssetWriterDelegate protocol.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) AVAssetWriterDelegate value);

    /**
     * [@property] delegate
     * 
     * An object that implements one or more of the methods in the AVAssetWriterDelegate protocol.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) AVAssetWriterDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] initialMovieFragmentSequenceNumber
     * 
     * For file types that support movie fragments, specifies the initial movie fragment sequence number.
     * 
     * The value must be equal to or greater than 1.
     * 
     * The default value is 1.
     * 
     * Note that if you combine movie fragments produced by an instance of AVAssetWriter with additional movie
     * fragments, produced either by a different instance of AVAssetWriter or by some other means, it is necessary to
     * ensure that movie fragment sequence numbers increase monotonically across the entire combined collection, in
     * temporal order.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInitialMovieFragmentSequenceNumber:")
    public native void setInitialMovieFragmentSequenceNumber(@NInt long value);

    /**
     * [@property] initialSegmentStartTime
     * 
     * Specifies start time of initial segment.
     * 
     * A numeric time must be set if the value of preferredOutputSegmentInterval property is positive numeric. If not,
     * this property is irrelevant.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInitialSegmentStartTime:")
    public native void setInitialSegmentStartTime(@ByValue CMTime value);

    /**
     * [@property] outputFileTypeProfile
     * 
     * Specifies a file type profile for the specified file type.
     * 
     * The default value is nil, which means that the receiver will choose an appropriate default profile based on the
     * specified file type.
     * 
     * Clients that want to receive segment data that is suitable for streaming through the
     * -assetWriter:didOutputSegmentData:segmentType:segmentReport: or -assetWriter:didOutputSegmentData:segmentType:
     * delegate method should set AVFileTypeProfileMPEG4AppleHLS, or AVFileTypeProfileMPEG4CMAFCompliant to require
     * output that is specifically compliant with CMAF format, with AVFileTypeMPEG4 file type.
     * 
     * File type profiles are declared in AVMediaFormat.h.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setOutputFileTypeProfile:")
    public native void setOutputFileTypeProfile(@Nullable String value);

    /**
     * [@property] preferredOutputSegmentInterval
     * 
     * Specifies preferred segment interval.
     * 
     * The default value is kCMTimeInvalid, which means that the receiver will choose an appropriate default value. The
     * value can be set to positive numeric or kCMTimeIndefinite.
     * If the value is kCMTimeIndefinite, every time a client calls -flushSegment the receiver outputs a segment data.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreferredOutputSegmentInterval:")
    public native void setPreferredOutputSegmentInterval(@ByValue CMTime value);

    /**
     * [@property] producesCombinableFragments
     * 
     * For file types that support fragmented MPEG-4, specifies whether the movie fragments should be produced in way
     * that makes them suitable for combining with movie fragments produced by one or more other instances of
     * AVAssetWriter into a single fragment stream of uniform encoding.
     * 
     * The default value is NO.
     * 
     * When multiple instances of AVAssetWriter are used to produce distinct streams that complement each other, for
     * example to create HLS encoding or bitrate variants, it’s not necessary to set this property to YES.
     * 
     * This property cannot be set after writing has started.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setProducesCombinableFragments:")
    public native void setProducesCombinableFragments(boolean value);
}
