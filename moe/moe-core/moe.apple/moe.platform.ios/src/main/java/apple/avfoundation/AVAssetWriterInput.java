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
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
public class AVAssetWriterInput extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriterInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInput alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWriterInputWithMediaType:outputSettings:")
    public static native AVAssetWriterInput assetWriterInputWithMediaTypeOutputSettings(String mediaType,
            NSDictionary<String, ?> outputSettings);

    @Generated
    @Selector("assetWriterInputWithMediaType:outputSettings:sourceFormatHint:")
    public static native AVAssetWriterInput assetWriterInputWithMediaTypeOutputSettingsSourceFormatHint(
            String mediaType, NSDictionary<String, ?> outputSettings, CMFormatDescriptionRef sourceFormatHint);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addTrackAssociationWithTrackOfInput:type:")
    public native void addTrackAssociationWithTrackOfInputType(AVAssetWriterInput input, String trackAssociationType);

    @Generated
    @Selector("appendSampleBuffer:")
    public native boolean appendSampleBuffer(CMSampleBufferRef sampleBuffer);

    @Generated
    @Selector("canAddTrackAssociationWithTrackOfInput:type:")
    public native boolean canAddTrackAssociationWithTrackOfInputType(AVAssetWriterInput input,
            String trackAssociationType);

    @Generated
    @Selector("canPerformMultiplePasses")
    public native boolean canPerformMultiplePasses();

    @Generated
    @Selector("currentPassDescription")
    public native AVAssetWriterInputPassDescription currentPassDescription();

    @Generated
    @Selector("expectsMediaDataInRealTime")
    public native boolean expectsMediaDataInRealTime();

    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    @Generated
    @Selector("init")
    public native AVAssetWriterInput init();

    @Generated
    @Selector("initWithMediaType:outputSettings:")
    public native AVAssetWriterInput initWithMediaTypeOutputSettings(String mediaType,
            NSDictionary<String, ?> outputSettings);

    @Generated
    @Selector("initWithMediaType:outputSettings:sourceFormatHint:")
    public native AVAssetWriterInput initWithMediaTypeOutputSettingsSourceFormatHint(String mediaType,
            NSDictionary<String, ?> outputSettings, CMFormatDescriptionRef sourceFormatHint);

    @Generated
    @Selector("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();

    @Generated
    @Selector("languageCode")
    public native String languageCode();

    @Generated
    @Selector("markAsFinished")
    public native void markAsFinished();

    @Generated
    @Selector("markCurrentPassAsFinished")
    public native void markCurrentPassAsFinished();

    @Generated
    @Selector("marksOutputTrackAsEnabled")
    public native boolean marksOutputTrackAsEnabled();

    @Generated
    @Selector("mediaTimeScale")
    public native int mediaTimeScale();

    @Generated
    @Selector("mediaType")
    public native String mediaType();

    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    @Generated
    @Selector("outputSettings")
    public native NSDictionary<String, ?> outputSettings();

    @Generated
    @Selector("performsMultiPassEncodingIfSupported")
    public native boolean performsMultiPassEncodingIfSupported();

    @Generated
    @Selector("preferredMediaChunkAlignment")
    @NInt
    public native long preferredMediaChunkAlignment();

    @Generated
    @Selector("preferredMediaChunkDuration")
    @ByValue
    public native CMTime preferredMediaChunkDuration();

    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    @Generated
    @Selector("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueueUsingBlock(NSObject queue,
            @ObjCBlock(name = "call_requestMediaDataWhenReadyOnQueueUsingBlock") Block_requestMediaDataWhenReadyOnQueueUsingBlock block);

    @Generated
    @Selector("respondToEachPassDescriptionOnQueue:usingBlock:")
    public native void respondToEachPassDescriptionOnQueueUsingBlock(NSObject queue,
            @ObjCBlock(name = "call_respondToEachPassDescriptionOnQueueUsingBlock") Block_respondToEachPassDescriptionOnQueueUsingBlock block);

    @Generated
    @Selector("sampleReferenceBaseURL")
    public native NSURL sampleReferenceBaseURL();

    @Generated
    @Selector("setExpectsMediaDataInRealTime:")
    public native void setExpectsMediaDataInRealTime(boolean value);

    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

    @Generated
    @Selector("setMarksOutputTrackAsEnabled:")
    public native void setMarksOutputTrackAsEnabled(boolean value);

    @Generated
    @Selector("setMediaTimeScale:")
    public native void setMediaTimeScale(int value);

    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    @Generated
    @Selector("setNaturalSize:")
    public native void setNaturalSize(@ByValue CGSize value);

    @Generated
    @Selector("setPerformsMultiPassEncodingIfSupported:")
    public native void setPerformsMultiPassEncodingIfSupported(boolean value);

    @Generated
    @Selector("setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@NInt long value);

    @Generated
    @Selector("setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByValue CMTime value);

    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    @Generated
    @Selector("setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL value);

    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("sourceFormatHint")
    public native CMFormatDescriptionRef sourceFormatHint();

    @Generated
    @Selector("transform")
    @ByValue
    public native CGAffineTransform transform();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestMediaDataWhenReadyOnQueueUsingBlock {
        @Generated
        void call_requestMediaDataWhenReadyOnQueueUsingBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_respondToEachPassDescriptionOnQueueUsingBlock {
        @Generated
        void call_respondToEachPassDescriptionOnQueueUsingBlock();
    }
}
