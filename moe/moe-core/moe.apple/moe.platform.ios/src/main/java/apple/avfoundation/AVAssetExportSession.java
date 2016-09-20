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

    /**
     * allExportPresets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/clm/AVAssetExportSession/allExportPresets">iOS Dev Center</a>
     */
    @Generated
    @Selector("allExportPresets")
    public static native NSArray<String> allExportPresets();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetExportSession alloc();

    /**
     * determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/clm/AVAssetExportSession/determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:")
    public static native void determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler(
            String presetName, AVAsset asset, String outputFileType,
            @ObjCBlock(name = "call_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler") Block_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler handler);

    /**
     * exportPresetsCompatibleWithAsset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/clm/AVAssetExportSession/exportPresetsCompatibleWithAsset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("exportPresetsCompatibleWithAsset:")
    public static native NSArray<String> exportPresetsCompatibleWithAsset(AVAsset asset);

    /**
     * exportSessionWithAsset:presetName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/clm/AVAssetExportSession/exportSessionWithAsset:presetName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("exportSessionWithAsset:presetName:")
    public static native AVAssetExportSession exportSessionWithAssetPresetName(AVAsset asset, String presetName);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * asset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/asset">iOS Dev Center</a>
     */
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * audioMix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/audioMix">iOS Dev Center</a>
     */
    @Generated
    @Selector("audioMix")
    public native AVAudioMix audioMix();

    /**
     * audioTimePitchAlgorithm</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/audioTimePitchAlgorithm">iOS Dev Center</a>
     */
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    /**
     * canPerformMultiplePassesOverSourceMediaData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/canPerformMultiplePassesOverSourceMediaData">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPerformMultiplePassesOverSourceMediaData")
    public native boolean canPerformMultiplePassesOverSourceMediaData();

    /**
     * cancelExport</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instm/AVAssetExportSession/cancelExport">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelExport")
    public native void cancelExport();

    /**
     * customVideoCompositor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/customVideoCompositor">iOS Dev Center</a>
     */
    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    /**
     * determineCompatibleFileTypesWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instm/AVAssetExportSession/determineCompatibleFileTypesWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("determineCompatibleFileTypesWithCompletionHandler:")
    public native void determineCompatibleFileTypesWithCompletionHandler(
            @ObjCBlock(name = "call_determineCompatibleFileTypesWithCompletionHandler") Block_determineCompatibleFileTypesWithCompletionHandler handler);

    /**
     * directoryForTemporaryFiles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/directoryForTemporaryFiles">iOS Dev Center</a>
     */
    @Generated
    @Selector("directoryForTemporaryFiles")
    public native NSURL directoryForTemporaryFiles();

    /**
     * error</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/error">iOS Dev Center</a>
     */
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * estimatedOutputFileLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/estimatedOutputFileLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("estimatedOutputFileLength")
    public native long estimatedOutputFileLength();

    /**
     * exportAsynchronouslyWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instm/AVAssetExportSession/exportAsynchronouslyWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("exportAsynchronouslyWithCompletionHandler:")
    public native void exportAsynchronouslyWithCompletionHandler(
            @ObjCBlock(name = "call_exportAsynchronouslyWithCompletionHandler") Block_exportAsynchronouslyWithCompletionHandler handler);

    /**
     * fileLengthLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/fileLengthLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileLengthLimit")
    public native long fileLengthLimit();

    @Generated
    @Selector("init")
    public native AVAssetExportSession init();

    /**
     * initWithAsset:presetName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instm/AVAssetExportSession/initWithAsset:presetName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAsset:presetName:")
    public native AVAssetExportSession initWithAssetPresetName(AVAsset asset, String presetName);

    /**
     * maxDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/maxDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxDuration")
    @ByValue
    public native CMTime maxDuration();

    /**
     * metadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/metadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * metadataItemFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/metadataItemFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataItemFilter")
    public native AVMetadataItemFilter metadataItemFilter();

    /**
     * outputFileType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/outputFileType">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputFileType")
    public native String outputFileType();

    /**
     * outputURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/outputURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputURL")
    public native NSURL outputURL();

    /**
     * presetName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/presetName">iOS Dev Center</a>
     */
    @Generated
    @Selector("presetName")
    public native String presetName();

    /**
     * progress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/progress">iOS Dev Center</a>
     */
    @Generated
    @Selector("progress")
    public native float progress();

    /**
     * audioMix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/audioMix">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAudioMix:")
    public native void setAudioMix(AVAudioMix value);

    /**
     * audioTimePitchAlgorithm</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/audioTimePitchAlgorithm">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);

    /**
     * canPerformMultiplePassesOverSourceMediaData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/canPerformMultiplePassesOverSourceMediaData">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCanPerformMultiplePassesOverSourceMediaData:")
    public native void setCanPerformMultiplePassesOverSourceMediaData(boolean value);

    /**
     * directoryForTemporaryFiles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/directoryForTemporaryFiles">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL value);

    /**
     * fileLengthLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/fileLengthLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFileLengthLimit:")
    public native void setFileLengthLimit(long value);

    /**
     * metadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/metadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * metadataItemFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/metadataItemFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMetadataItemFilter:")
    public native void setMetadataItemFilter(AVMetadataItemFilter value);

    /**
     * outputFileType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/outputFileType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOutputFileType:")
    public native void setOutputFileType(String value);

    /**
     * outputURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/outputURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOutputURL:")
    public native void setOutputURL(NSURL value);

    /**
     * shouldOptimizeForNetworkUse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/shouldOptimizeForNetworkUse">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean value);

    /**
     * timeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/timeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimeRange:")
    public native void setTimeRange(@ByValue CMTimeRange value);

    /**
     * videoComposition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/videoComposition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition value);

    /**
     * shouldOptimizeForNetworkUse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/shouldOptimizeForNetworkUse">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();

    /**
     * status</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/status">iOS Dev Center</a>
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * supportedFileTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/supportedFileTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("supportedFileTypes")
    public native NSArray<String> supportedFileTypes();

    /**
     * timeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/timeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    /**
     * videoComposition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetExportSession_Class/index.html#//apple_ref/occ/instp/AVAssetExportSession/videoComposition">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoComposition")
    public native AVVideoComposition videoComposition();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler {
        @Generated
        void call_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_determineCompatibleFileTypesWithCompletionHandler {
        @Generated
        void call_determineCompatibleFileTypesWithCompletionHandler(NSArray<String> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_exportAsynchronouslyWithCompletionHandler {
        @Generated
        void call_exportAsynchronouslyWithCompletionHandler();
    }
}
