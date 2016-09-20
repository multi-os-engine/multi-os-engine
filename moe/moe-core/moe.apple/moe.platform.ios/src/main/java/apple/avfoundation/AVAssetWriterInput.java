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
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInput alloc();

    /**
     * assetWriterInputWithMediaType:outputSettings:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/clm/AVAssetWriterInput/assetWriterInputWithMediaType:outputSettings:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assetWriterInputWithMediaType:outputSettings:")
    public static native AVAssetWriterInput assetWriterInputWithMediaTypeOutputSettings(String mediaType,
            NSDictionary<String, ?> outputSettings);

    /**
     * assetWriterInputWithMediaType:outputSettings:sourceFormatHint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/clm/AVAssetWriterInput/assetWriterInputWithMediaType:outputSettings:sourceFormatHint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assetWriterInputWithMediaType:outputSettings:sourceFormatHint:")
    public static native AVAssetWriterInput assetWriterInputWithMediaTypeOutputSettingsSourceFormatHint(
            String mediaType, NSDictionary<String, ?> outputSettings, CMFormatDescriptionRef sourceFormatHint);

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
     * addTrackAssociationWithTrackOfInput:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/addTrackAssociationWithTrackOfInput:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addTrackAssociationWithTrackOfInput:type:")
    public native void addTrackAssociationWithTrackOfInputType(AVAssetWriterInput input, String trackAssociationType);

    /**
     * appendSampleBuffer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/appendSampleBuffer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("appendSampleBuffer:")
    public native boolean appendSampleBuffer(CMSampleBufferRef sampleBuffer);

    /**
     * canAddTrackAssociationWithTrackOfInput:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/canAddTrackAssociationWithTrackOfInput:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canAddTrackAssociationWithTrackOfInput:type:")
    public native boolean canAddTrackAssociationWithTrackOfInputType(AVAssetWriterInput input,
            String trackAssociationType);

    /**
     * canPerformMultiplePasses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/canPerformMultiplePasses">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPerformMultiplePasses")
    public native boolean canPerformMultiplePasses();

    /**
     * currentPassDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/currentPassDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentPassDescription")
    public native AVAssetWriterInputPassDescription currentPassDescription();

    /**
     * expectsMediaDataInRealTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/expectsMediaDataInRealTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("expectsMediaDataInRealTime")
    public native boolean expectsMediaDataInRealTime();

    /**
     * extendedLanguageTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/extendedLanguageTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    @Generated
    @Selector("init")
    public native AVAssetWriterInput init();

    /**
     * initWithMediaType:outputSettings:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/initWithMediaType:outputSettings:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithMediaType:outputSettings:")
    public native AVAssetWriterInput initWithMediaTypeOutputSettings(String mediaType,
            NSDictionary<String, ?> outputSettings);

    /**
     * initWithMediaType:outputSettings:sourceFormatHint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/initWithMediaType:outputSettings:sourceFormatHint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithMediaType:outputSettings:sourceFormatHint:")
    public native AVAssetWriterInput initWithMediaTypeOutputSettingsSourceFormatHint(String mediaType,
            NSDictionary<String, ?> outputSettings, CMFormatDescriptionRef sourceFormatHint);

    /**
     * readyForMoreMediaData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/readyForMoreMediaData">iOS Dev Center</a>
     */
    @Generated
    @Selector("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();

    /**
     * languageCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/languageCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    /**
     * markAsFinished</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/markAsFinished">iOS Dev Center</a>
     */
    @Generated
    @Selector("markAsFinished")
    public native void markAsFinished();

    /**
     * markCurrentPassAsFinished</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/markCurrentPassAsFinished">iOS Dev Center</a>
     */
    @Generated
    @Selector("markCurrentPassAsFinished")
    public native void markCurrentPassAsFinished();

    /**
     * marksOutputTrackAsEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/marksOutputTrackAsEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("marksOutputTrackAsEnabled")
    public native boolean marksOutputTrackAsEnabled();

    /**
     * mediaTimeScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/mediaTimeScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("mediaTimeScale")
    public native int mediaTimeScale();

    /**
     * mediaType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/mediaType">iOS Dev Center</a>
     */
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * metadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/metadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * naturalSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/naturalSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * outputSettings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/outputSettings">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputSettings")
    public native NSDictionary<String, ?> outputSettings();

    /**
     * performsMultiPassEncodingIfSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/performsMultiPassEncodingIfSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("performsMultiPassEncodingIfSupported")
    public native boolean performsMultiPassEncodingIfSupported();

    /**
     * preferredMediaChunkAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/preferredMediaChunkAlignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredMediaChunkAlignment")
    @NInt
    public native long preferredMediaChunkAlignment();

    /**
     * preferredMediaChunkDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/preferredMediaChunkDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredMediaChunkDuration")
    @ByValue
    public native CMTime preferredMediaChunkDuration();

    /**
     * preferredVolume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/preferredVolume">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * requestMediaDataWhenReadyOnQueue:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/requestMediaDataWhenReadyOnQueue:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueueUsingBlock(NSObject queue,
            @ObjCBlock(name = "call_requestMediaDataWhenReadyOnQueueUsingBlock") Block_requestMediaDataWhenReadyOnQueueUsingBlock block);

    /**
     * respondToEachPassDescriptionOnQueue:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instm/AVAssetWriterInput/respondToEachPassDescriptionOnQueue:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("respondToEachPassDescriptionOnQueue:usingBlock:")
    public native void respondToEachPassDescriptionOnQueueUsingBlock(NSObject queue,
            @ObjCBlock(name = "call_respondToEachPassDescriptionOnQueueUsingBlock") Block_respondToEachPassDescriptionOnQueueUsingBlock block);

    /**
     * sampleReferenceBaseURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/sampleReferenceBaseURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleReferenceBaseURL")
    public native NSURL sampleReferenceBaseURL();

    /**
     * expectsMediaDataInRealTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/expectsMediaDataInRealTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExpectsMediaDataInRealTime:")
    public native void setExpectsMediaDataInRealTime(boolean value);

    /**
     * extendedLanguageTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/extendedLanguageTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    /**
     * languageCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/languageCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

    /**
     * marksOutputTrackAsEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/marksOutputTrackAsEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMarksOutputTrackAsEnabled:")
    public native void setMarksOutputTrackAsEnabled(boolean value);

    /**
     * mediaTimeScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/mediaTimeScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMediaTimeScale:")
    public native void setMediaTimeScale(int value);

    /**
     * metadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/metadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * naturalSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/naturalSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNaturalSize:")
    public native void setNaturalSize(@ByValue CGSize value);

    /**
     * performsMultiPassEncodingIfSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/performsMultiPassEncodingIfSupported">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPerformsMultiPassEncodingIfSupported:")
    public native void setPerformsMultiPassEncodingIfSupported(boolean value);

    /**
     * preferredMediaChunkAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/preferredMediaChunkAlignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@NInt long value);

    /**
     * preferredMediaChunkDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/preferredMediaChunkDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByValue CMTime value);

    /**
     * preferredVolume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/preferredVolume">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    /**
     * sampleReferenceBaseURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/sampleReferenceBaseURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL value);

    /**
     * transform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/transform">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CGAffineTransform value);

    /**
     * sourceFormatHint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/sourceFormatHint">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceFormatHint")
    public native CMFormatDescriptionRef sourceFormatHint();

    /**
     * transform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetWriterInput_Class/index.html#//apple_ref/occ/instp/AVAssetWriterInput/transform">iOS Dev Center</a>
     */
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
