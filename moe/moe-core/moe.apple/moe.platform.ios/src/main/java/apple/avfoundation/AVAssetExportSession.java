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
import apple.avfoundation.protocol.AVVideoCompositing;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAssetExportSession
 * 
 * An AVAssetExportSession creates a new timed media resource from the contents of an
 * 			existing AVAsset in the form described by a specified export preset.
 * 
 * 			Prior to initializing an instance of AVAssetExportSession, you can invoke
 * 			+allExportPresets to obtain the complete list of presets available. Use
 * 			+exportPresetsCompatibleWithAsset: to obtain a list of presets that are compatible
 * 			with a specific AVAsset.
 * 
 * 			To configure an export, initialize an AVAssetExportSession with an AVAsset that contains
 * 			the source media, an AVAssetExportPreset, the output file type, (a UTI string from
 * 			those defined in AVMediaFormat.h) and the output URL.
 * 
 * 			After configuration is complete, invoke exportAsynchronouslyWithCompletionHandler:
 * 			to start the export process. This method returns immediately; the export is performed
 * 			asynchronously. Invoke the -progress method to check on the progress. Note that in
 * 			some cases, depending on the capabilities of the device, when multiple exports are
 * 			attempted at the same time some may be queued until others have been completed. When
 * 			this happens, the status of a queued export will indicate that it's "waiting".
 * 
 * 			Whether the export fails, completes, or is cancelled, the completion handler you
 * 			supply to -exportAsynchronouslyWithCompletionHandler: will be called. Upon
 * 			completion, the status property indicates whether the export has completed
 * 			successfully. If it has failed, the value of the error property supplies additional
 * 			information about the reason for the failure.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetExportSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetExportSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * allExportPresets
     * 
     * Returns all available export preset names.
     * 
     * Returns an array of NSStrings with the names of all available presets. Note that not all presets are
     * 							compatible with all AVAssets.
     * 
     * @return						An NSArray containing an NSString for each of the available preset names.
     */
    @Generated
    @Selector("allExportPresets")
    public static native NSArray<String> allExportPresets();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetExportSession alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:
     * 
     * Performs an inspection on the compatibility of an export preset, AVAsset and output file type.  Calls the completion handler with YES if
     * 							the arguments are compatible; NO otherwise.
     * 
     * Not all export presets are compatible with all AVAssets and file types.  This method can be used to query compatibility.
     * 							In order to ensure that the setup and running of an export operation will succeed using a given preset no significant changes 
     * 							(such as adding or deleting tracks) should be made to the asset between retrieving compatible identifiers and performing the export operation.
     * 
     * @param presetName			An NSString specifying the name of the preset template for the export.
     * @param asset				An AVAsset object that is intended to be exported.
     * @param outputFileType		An AVFileType indicating a file type to check; or nil, to query whether there are any compatible types.
     * @param handler				A block called with the compatibility result.
     */
    @Generated
    @Selector("determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:")
    public static native void determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler(
            String presetName, AVAsset asset, String outputFileType,
            @ObjCBlock(name = "call_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler") Block_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler handler);

    /**
     * exportPresetsCompatibleWithAsset:
     * 
     * Returns only the identifiers compatible with the given AVAsset object.
     * 
     * Not all export presets are compatible with all AVAssets. For example an video only asset is not compatible with an audio only preset.
     * 							This method returns only the identifiers for presets that will be compatible with the given asset. 
     * 							A client should pass in an AVAsset that is ready to be exported.
     * 							In order to ensure that the setup and running of an export operation will succeed using a given preset no significant changes 
     * 							(such as adding or deleting tracks) should be made to the asset between retrieving compatible identifiers and performing the export operation.
     * 							This method will access the tracks property of the AVAsset to build the returned NSArray.  To avoid blocking the calling thread, 
     * 							the tracks property should be loaded using the AVAsynchronousKeyValueLoading protocol before calling this method.
     * 
     * @param asset				An AVAsset object that is intended to be exported.
     * @return						An NSArray containing NSString values for the identifiers of compatible export types.  
     * 							The array is a complete list of the valid identifiers that can be used as arguments to 
     * 							initWithAsset:presetName: with the specified asset.
     */
    @Generated
    @Selector("exportPresetsCompatibleWithAsset:")
    public static native NSArray<String> exportPresetsCompatibleWithAsset(AVAsset asset);

    /**
     * exportSessionWithAsset:presetName:
     * 
     * Returns an instance of AVAssetExportSession for the specified source asset and preset.
     * 
     * If the specified asset belongs to a mutable subclass of AVAsset, AVMutableComposition or AVMutableMovie, the results of any export-related operation are undefined if you mutate the asset after the operation commences. These operations include but are not limited to: 1) testing the compatibility of export presets with the asset, 2) calculating the maximum duration or estimated length of the output file, and 3) the export operation itself.
     * 
     * @param		asset			An AVAsset object that is intended to be exported.
     * @param		presetName		An NSString specifying the name of the preset template for the export.
     * @return						An instance of AVAssetExportSession.
     */
    @Generated
    @Selector("exportSessionWithAsset:presetName:")
    public static native AVAssetExportSession exportSessionWithAssetPresetName(AVAsset asset, String presetName);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * Indicates the instance of AVAsset with which the AVExportSession was initialized
     */
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * Indicates whether non-default audio mixing is enabled for export and supplies the parameters for audio mixing.  Ignored when export preset is AVAssetExportPresetPassthrough.
     */
    @Generated
    @Selector("audioMix")
    public native AVAudioMix audioMix();

    /**
     * Indicates the processing algorithm used to manage audio pitch for scaled audio edits.
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchAlgorithmSpectral, are defined in AVAudioProcessingSettings.h. An NSInvalidArgumentException will be raised if this property is set to a value other than the constants defined in that file.
     * The default value is AVAudioTimePitchAlgorithmSpectral. 
     */
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    /**
     * [@property]	canPerformMultiplePassesOverSourceMediaData
     * 
     * 	Determines whether the export session can perform multiple passes over the source media to achieve better results.
     * 
     * 	When the value for this property is YES, the export session can produce higher quality results at the expense of longer export times.  Setting this property to YES may also require the export session to write temporary data to disk during the export.  To control the location of temporary data, use the property directoryForTemporaryFiles.
     * 
     * 	The default value is NO.  Not all export session configurations can benefit from performing multiple passes over the source media.  In these cases, setting this property to YES has no effect.
     * 
     * 	This property cannot be set after the export has started.
     */
    @Generated
    @Selector("canPerformMultiplePassesOverSourceMediaData")
    public native boolean canPerformMultiplePassesOverSourceMediaData();

    /**
     * cancelExport
     * 
     * Cancels the execution of an export session.
     * 
     * Cancel can be invoked when the export is running.
     */
    @Generated
    @Selector("cancelExport")
    public native void cancelExport();

    /**
     * Indicates the custom video compositor instance used, if any
     */
    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    /**
     * determineCompatibleFileTypesWithCompletionHandler:
     * 
     * Performs an inspection on the AVAsset and Preset the object was initialized with to determine a list of file types the ExportSession can write.
     * 
     * This method is different than the supportedFileTypes property in that it performs an inspection of the AVAsset in order to determine its compatibility with each of the session's supported file types.
     * 
     * @param						handler
     * 							Called when the inspection completes with an array of file types the ExportSession can write.  Note that this may have a count of zero.
     */
    @Generated
    @Selector("determineCompatibleFileTypesWithCompletionHandler:")
    public native void determineCompatibleFileTypesWithCompletionHandler(
            @ObjCBlock(name = "call_determineCompatibleFileTypesWithCompletionHandler") Block_determineCompatibleFileTypesWithCompletionHandler handler);

    /**
     * [@property] directoryForTemporaryFiles
     * 
     * 	Specifies a directory that is suitable for containing temporary files generated during the export process
     * 
     * 	AVAssetExportSession may need to write temporary files when configured in certain ways, such as when canPerformMultiplePassesOverSourceMediaData is set to YES.  This property can be used to control where in the filesystem those temporary files are created.  All temporary files will be deleted when the export is completed, is canceled, or fails.
     * 
     * 	When the value of this property is nil, the export session will choose a suitable location when writing temporary files.  The default value is nil.
     * 
     * 	This property cannot be set after the export has started.  The export will fail if the URL points to a location that is not a directory, does not exist, is not on the local file system, or if a file cannot be created in this directory (for example, due to insufficient permissions or sandboxing restrictions).
     */
    @Generated
    @Selector("directoryForTemporaryFiles")
    public native NSURL directoryForTemporaryFiles();

    /**
     * describes the error that occured if the export status is AVAssetExportSessionStatusFailed
     */
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * Indicates the estimated byte size of exported file.  Returns zero when export preset is AVAssetExportPresetPassthrough, AVAssetExportPresetAppleProRes422LPCM or AVAssetExportPresetAppleProRes4444LPCM.  This property will also return zero if a numeric value (ie. not invalid, indefinite, or infinite) for the timeRange property has not been set.  Note that the returned value does not take into account the source asset information.  For a more accurate estimation, use estimateOutputFileLengthWithCompletionHandler.
     */
    @Generated
    @Selector("estimatedOutputFileLength")
    public native long estimatedOutputFileLength();

    /**
     * exportAsynchronouslyWithCompletionHandler:
     * 
     * Starts the asynchronous execution of an export session.
     * 
     * Initiates an asynchronous export operation and returns immediately.
     * 
     * @param						handler
     * 							If internal preparation for export fails, the handler will be invoked synchronously.
     * 							The handler may also be called asynchronously after -exportAsynchronouslyWithCompletionHandler: returns,
     * 							in the following cases: 
     * 							1) if a failure occurs during the export, including failures of loading, re-encoding, or writing media data to the output,
     * 							2) if -cancelExport is invoked, 
     * 							3) if export session succeeds, having completely written its output to the outputURL. 
     * 							In each case, AVAssetExportSession.status will signal the terminal state of the asset reader, and if a failure occurs, the NSError 
     * 							that describes the failure can be obtained from the error property.
     */
    @Generated
    @Selector("exportAsynchronouslyWithCompletionHandler:")
    public native void exportAsynchronouslyWithCompletionHandler(
            @ObjCBlock(name = "call_exportAsynchronouslyWithCompletionHandler") Block_exportAsynchronouslyWithCompletionHandler handler);

    /**
     * Indicates the file length that the output of the session should not exceed.  Depending on the content of the source asset, it is possible for the output to slightly exceed the file length limit.  The length of the output file should be tested if you require that a strict limit be observed before making use of the output.  See also maxDuration and timeRange.
     */
    @Generated
    @Selector("fileLengthLimit")
    public native long fileLengthLimit();

    @Generated
    @Selector("init")
    public native AVAssetExportSession init();

    /**
     * initWithAsset:presetName:
     * 
     * Initialize an AVAssetExportSession with the specified preset and set the source to the contents of the asset.
     * 
     * If the specified asset belongs to a mutable subclass of AVAsset, AVMutableComposition or AVMutableMovie, the results of any export-related operation are undefined if you mutate the asset after the operation commences. These operations include but are not limited to: 1) testing the compatibility of export presets with the asset, 2) calculating the maximum duration or estimated length of the output file, and 3) the export operation itself.
     * 
     * @param		asset			An AVAsset object that is intended to be exported.
     * @param		presetName		An NSString specifying the name of the preset template for the export.
     * @return						Returns the initialized AVAssetExportSession.
     */
    @Generated
    @Selector("initWithAsset:presetName:")
    public native AVAssetExportSession initWithAssetPresetName(AVAsset asset, String presetName);

    /**
     * Provides an estimate of the maximum duration of exported media that is possible given the source asset, the export preset, and the current value of fileLengthLimit.  The export will not stop when it reaches this maximum duration; set the timeRange property to export only a certain time range.
     */
    @Generated
    @Selector("maxDuration")
    @ByValue
    public native CMTime maxDuration();

    /**
     * Specifies an NSArray of AVMetadataItems that are to be written to the output file by the export session.
     * If the value of this key is nil, any existing metadata in the exported asset will be translated as accurately as possible into
     * the appropriate metadata keyspace for the output file and written to the output. 
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * Specifies a filter object to be used during export to determine which metadata items should be transferred from the source asset.
     * If the value of this key is nil, no filter will be applied.  This is the default.
     * The filter will not be applied to metadata set with via the metadata property.  To apply the filter to metadata before it is set on the metadata property, see the methods in AVMetadataItem's AVMetadataItemArrayFiltering category. 
     */
    @Generated
    @Selector("metadataItemFilter")
    public native AVMetadataItemFilter metadataItemFilter();

    /**
     * Indicates the type of file to be written by the session.
     * The value of this property must be set before you invoke -exportAsynchronouslyWithCompletionHandler:; otherwise -exportAsynchronouslyWithCompletionHandler: will raise an NSInternalInconsistencyException.
     * Setting the value of this property to a file type that's not among the session's supported file types will result in an NSInvalidArgumentException. See supportedFileTypes. 
     */
    @Generated
    @Selector("outputFileType")
    public native String outputFileType();

    /**
     * Indicates the URL of the export session's output. You may use UTTypeCopyPreferredTagWithClass(outputFileType, kUTTagClassFilenameExtension) to obtain an appropriate path extension for the outputFileType you have specified. For more information about UTTypeCopyPreferredTagWithClass and kUTTagClassFilenameExtension, on iOS see <CoreServices/UTType.h> and on Mac OS X see <LaunchServices/UTType.h>.
     */
    @Generated
    @Selector("outputURL")
    public native NSURL outputURL();

    /**
     * Indicates the name of the preset with which the AVExportSession was initialized
     */
    @Generated
    @Selector("presetName")
    public native String presetName();

    /**
     * Specifies the progress of the export on a scale from 0 to 1.0.  A value of 0 means the export has not yet begun, A value of 1.0 means the export is complete. This property is not key-value observable.
     */
    @Generated
    @Selector("progress")
    public native float progress();

    /**
     * Indicates whether non-default audio mixing is enabled for export and supplies the parameters for audio mixing.  Ignored when export preset is AVAssetExportPresetPassthrough.
     */
    @Generated
    @Selector("setAudioMix:")
    public native void setAudioMix(AVAudioMix value);

    /**
     * Indicates the processing algorithm used to manage audio pitch for scaled audio edits.
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchAlgorithmSpectral, are defined in AVAudioProcessingSettings.h. An NSInvalidArgumentException will be raised if this property is set to a value other than the constants defined in that file.
     * The default value is AVAudioTimePitchAlgorithmSpectral. 
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);

    /**
     * [@property]	canPerformMultiplePassesOverSourceMediaData
     * 
     * 	Determines whether the export session can perform multiple passes over the source media to achieve better results.
     * 
     * 	When the value for this property is YES, the export session can produce higher quality results at the expense of longer export times.  Setting this property to YES may also require the export session to write temporary data to disk during the export.  To control the location of temporary data, use the property directoryForTemporaryFiles.
     * 
     * 	The default value is NO.  Not all export session configurations can benefit from performing multiple passes over the source media.  In these cases, setting this property to YES has no effect.
     * 
     * 	This property cannot be set after the export has started.
     */
    @Generated
    @Selector("setCanPerformMultiplePassesOverSourceMediaData:")
    public native void setCanPerformMultiplePassesOverSourceMediaData(boolean value);

    /**
     * [@property] directoryForTemporaryFiles
     * 
     * 	Specifies a directory that is suitable for containing temporary files generated during the export process
     * 
     * 	AVAssetExportSession may need to write temporary files when configured in certain ways, such as when canPerformMultiplePassesOverSourceMediaData is set to YES.  This property can be used to control where in the filesystem those temporary files are created.  All temporary files will be deleted when the export is completed, is canceled, or fails.
     * 
     * 	When the value of this property is nil, the export session will choose a suitable location when writing temporary files.  The default value is nil.
     * 
     * 	This property cannot be set after the export has started.  The export will fail if the URL points to a location that is not a directory, does not exist, is not on the local file system, or if a file cannot be created in this directory (for example, due to insufficient permissions or sandboxing restrictions).
     */
    @Generated
    @Selector("setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL value);

    /**
     * Indicates the file length that the output of the session should not exceed.  Depending on the content of the source asset, it is possible for the output to slightly exceed the file length limit.  The length of the output file should be tested if you require that a strict limit be observed before making use of the output.  See also maxDuration and timeRange.
     */
    @Generated
    @Selector("setFileLengthLimit:")
    public native void setFileLengthLimit(long value);

    /**
     * Specifies an NSArray of AVMetadataItems that are to be written to the output file by the export session.
     * If the value of this key is nil, any existing metadata in the exported asset will be translated as accurately as possible into
     * the appropriate metadata keyspace for the output file and written to the output. 
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * Specifies a filter object to be used during export to determine which metadata items should be transferred from the source asset.
     * If the value of this key is nil, no filter will be applied.  This is the default.
     * The filter will not be applied to metadata set with via the metadata property.  To apply the filter to metadata before it is set on the metadata property, see the methods in AVMetadataItem's AVMetadataItemArrayFiltering category. 
     */
    @Generated
    @Selector("setMetadataItemFilter:")
    public native void setMetadataItemFilter(AVMetadataItemFilter value);

    /**
     * Indicates the type of file to be written by the session.
     * The value of this property must be set before you invoke -exportAsynchronouslyWithCompletionHandler:; otherwise -exportAsynchronouslyWithCompletionHandler: will raise an NSInternalInconsistencyException.
     * Setting the value of this property to a file type that's not among the session's supported file types will result in an NSInvalidArgumentException. See supportedFileTypes. 
     */
    @Generated
    @Selector("setOutputFileType:")
    public native void setOutputFileType(String value);

    /**
     * Indicates the URL of the export session's output. You may use UTTypeCopyPreferredTagWithClass(outputFileType, kUTTagClassFilenameExtension) to obtain an appropriate path extension for the outputFileType you have specified. For more information about UTTypeCopyPreferredTagWithClass and kUTTagClassFilenameExtension, on iOS see <CoreServices/UTType.h> and on Mac OS X see <LaunchServices/UTType.h>.
     */
    @Generated
    @Selector("setOutputURL:")
    public native void setOutputURL(NSURL value);

    /**
     * indicates that the output file should be optimized for network use, e.g. that a QuickTime movie file should support "fast start"
     */
    @Generated
    @Selector("setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean value);

    /**
     * Specifies a time range to be exported from the source.  The default timeRange of an export session is kCMTimeZero..kCMTimePositiveInfinity, meaning that the full duration of the asset will be exported.
     */
    @Generated
    @Selector("setTimeRange:")
    public native void setTimeRange(@ByValue CMTimeRange value);

    /**
     * Indicates whether video composition is enabled for export and supplies the instructions for video composition.  Ignored when export preset is AVAssetExportPresetPassthrough.
     */
    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition value);

    /**
     * indicates that the output file should be optimized for network use, e.g. that a QuickTime movie file should support "fast start"
     */
    @Generated
    @Selector("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();

    /**
     * indicates the status of the export session
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * Indicates the types of files the target can write, according to the preset the target was initialized with.
     * Does not perform an inspection of the AVAsset to determine whether its contents are compatible with the supported file types. If you need to make that determination before initiating the export, use - (void)determineCompatibleFileTypesWithCompletionHandler:(void (^)(NSArray *compatibleFileTypes))handler:. 
     */
    @Generated
    @Selector("supportedFileTypes")
    public native NSArray<String> supportedFileTypes();

    /**
     * Specifies a time range to be exported from the source.  The default timeRange of an export session is kCMTimeZero..kCMTimePositiveInfinity, meaning that the full duration of the asset will be exported.
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    /**
     * Indicates whether video composition is enabled for export and supplies the instructions for video composition.  Ignored when export preset is AVAssetExportPresetPassthrough.
     */
    @Generated
    @Selector("videoComposition")
    public native AVVideoComposition videoComposition();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler {
        @Generated
        void call_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler(boolean compatible);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_determineCompatibleFileTypesWithCompletionHandler {
        @Generated
        void call_determineCompatibleFileTypesWithCompletionHandler(NSArray<String> compatibleFileTypes);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_exportAsynchronouslyWithCompletionHandler {
        @Generated
        void call_exportAsynchronouslyWithCompletionHandler();
    }

    /**
     * estimateMaximumDurationWithCompletionHandler:
     * 
     * Starts the asynchronous execution of estimating the maximum duration of the export based on the asset, preset, and fileLengthLimit associated with the export session.
     * 
     * If fileLengthLimit is not set on the export session, fileLengthLimit will be assumed to be the maximum file size specified by the preset (if any); else infinite.
     * 
     * @param						handler
     * 							A block called with the estimated maximum duration, or kCMTimeInvalid if an error occurs.  The error parameter will be non-nil if an error occurs.
     */
    @Generated
    @Selector("estimateMaximumDurationWithCompletionHandler:")
    public native void estimateMaximumDurationWithCompletionHandler(
            @ObjCBlock(name = "call_estimateMaximumDurationWithCompletionHandler") Block_estimateMaximumDurationWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_estimateMaximumDurationWithCompletionHandler {
        @Generated
        void call_estimateMaximumDurationWithCompletionHandler(@ByValue CMTime estimatedMaximumDuration, NSError error);
    }

    /**
     * estimateOutputFileLengthWithCompletionHandler:
     * 
     * Starts the asynchronous execution of estimating the output file length of the export based on the asset, preset, and timeRange associated with the export session.
     * 
     * If timeRange is not set on the export session, timeRange will be assumed to be the full time range of the asset.
     * 
     * @param						handler
     * 							A block called with the estimated output file length in bytes, if it can be accurately determined; 0 otherwise.  The error parameter will be non-nil if an error occurs.
     */
    @Generated
    @Selector("estimateOutputFileLengthWithCompletionHandler:")
    public native void estimateOutputFileLengthWithCompletionHandler(
            @ObjCBlock(name = "call_estimateOutputFileLengthWithCompletionHandler") Block_estimateOutputFileLengthWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_estimateOutputFileLengthWithCompletionHandler {
        @Generated
        void call_estimateOutputFileLengthWithCompletionHandler(long estimatedOutputFileLength, NSError error);
    }
}
