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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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

    @Generated
    @Selector("determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:")
    public static native void determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler(
            String presetName, AVAsset asset, String outputFileType,
            @ObjCBlock(name = "call_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler") Block_determineCompatibilityOfExportPresetWithAssetOutputFileTypeCompletionHandler handler);

    @Generated
    @Selector("exportPresetsCompatibleWithAsset:")
    public static native NSArray<String> exportPresetsCompatibleWithAsset(AVAsset asset);

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

    @Generated
    @Selector("asset")
    public native AVAsset asset();

    @Generated
    @Selector("audioMix")
    public native AVAudioMix audioMix();

    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    @Generated
    @Selector("canPerformMultiplePassesOverSourceMediaData")
    public native boolean canPerformMultiplePassesOverSourceMediaData();

    @Generated
    @Selector("cancelExport")
    public native void cancelExport();

    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    @Generated
    @Selector("determineCompatibleFileTypesWithCompletionHandler:")
    public native void determineCompatibleFileTypesWithCompletionHandler(
            @ObjCBlock(name = "call_determineCompatibleFileTypesWithCompletionHandler") Block_determineCompatibleFileTypesWithCompletionHandler handler);

    @Generated
    @Selector("directoryForTemporaryFiles")
    public native NSURL directoryForTemporaryFiles();

    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("estimatedOutputFileLength")
    public native long estimatedOutputFileLength();

    @Generated
    @Selector("exportAsynchronouslyWithCompletionHandler:")
    public native void exportAsynchronouslyWithCompletionHandler(
            @ObjCBlock(name = "call_exportAsynchronouslyWithCompletionHandler") Block_exportAsynchronouslyWithCompletionHandler handler);

    @Generated
    @Selector("fileLengthLimit")
    public native long fileLengthLimit();

    @Generated
    @Selector("init")
    public native AVAssetExportSession init();

    @Generated
    @Selector("initWithAsset:presetName:")
    public native AVAssetExportSession initWithAssetPresetName(AVAsset asset, String presetName);

    @Generated
    @Selector("maxDuration")
    @ByValue
    public native CMTime maxDuration();

    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    @Generated
    @Selector("metadataItemFilter")
    public native AVMetadataItemFilter metadataItemFilter();

    @Generated
    @Selector("outputFileType")
    public native String outputFileType();

    @Generated
    @Selector("outputURL")
    public native NSURL outputURL();

    @Generated
    @Selector("presetName")
    public native String presetName();

    @Generated
    @Selector("progress")
    public native float progress();

    @Generated
    @Selector("setAudioMix:")
    public native void setAudioMix(AVAudioMix value);

    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);

    @Generated
    @Selector("setCanPerformMultiplePassesOverSourceMediaData:")
    public native void setCanPerformMultiplePassesOverSourceMediaData(boolean value);

    @Generated
    @Selector("setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL value);

    @Generated
    @Selector("setFileLengthLimit:")
    public native void setFileLengthLimit(long value);

    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    @Generated
    @Selector("setMetadataItemFilter:")
    public native void setMetadataItemFilter(AVMetadataItemFilter value);

    @Generated
    @Selector("setOutputFileType:")
    public native void setOutputFileType(String value);

    @Generated
    @Selector("setOutputURL:")
    public native void setOutputURL(NSURL value);

    @Generated
    @Selector("setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean value);

    @Generated
    @Selector("setTimeRange:")
    public native void setTimeRange(@ByValue CMTimeRange value);

    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition value);

    @Generated
    @Selector("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();

    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("supportedFileTypes")
    public native NSArray<String> supportedFileTypes();

    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

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

    @Generated
    @Selector("estimateMaximumDurationWithCompletionHandler:")
    public native void estimateMaximumDurationWithCompletionHandler(
            @ObjCBlock(name = "call_estimateMaximumDurationWithCompletionHandler") Block_estimateMaximumDurationWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_estimateMaximumDurationWithCompletionHandler {
        @Generated
        void call_estimateMaximumDurationWithCompletionHandler(@ByValue CMTime arg0, NSError arg1);
    }

    @Generated
    @Selector("estimateOutputFileLengthWithCompletionHandler:")
    public native void estimateOutputFileLengthWithCompletionHandler(
            @ObjCBlock(name = "call_estimateOutputFileLengthWithCompletionHandler") Block_estimateOutputFileLengthWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_estimateOutputFileLengthWithCompletionHandler {
        @Generated
        void call_estimateOutputFileLengthWithCompletionHandler(long arg0, NSError arg1);
    }
}
