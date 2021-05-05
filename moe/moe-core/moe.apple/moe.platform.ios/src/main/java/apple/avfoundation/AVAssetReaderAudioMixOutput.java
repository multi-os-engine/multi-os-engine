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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAssetReaderAudioMixOutput
 * 
 * AVAssetReaderAudioMixOutput is a concrete subclass of AVAssetReaderOutput that defines an interface for reading audio samples that result from mixing the audio from one or more AVAssetTracks of an AVAssetReader's AVAsset.
 * 
 * Clients can read the audio data mixed from one or more asset tracks by adding an instance of AVAssetReaderAudioMixOutput to an AVAssetReader using the -[AVAssetReader addOutput:] method.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReaderAudioMixOutput extends AVAssetReaderOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReaderAudioMixOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReaderAudioMixOutput alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * assetReaderAudioMixOutputWithAudioTracks:audioSettings:
     * 
     * Returns an instance of AVAssetReaderAudioMixOutput for reading mixed audio from the specified audio tracks, with optional audio settings.
     * 
     * Each track must be one of the tracks owned by the target AVAssetReader's asset and must be of media type AVMediaTypeAudio.
     * 
     * For non-nil values of audioSettings, the audio settings dictionary must contain values for keys in AVAudioSettings.h (linear PCM only). Initialization will fail if the audio settings cannot be used with the specified tracks. AVSampleRateConverterAudioQualityKey is not supported.
     * 
     * A value of nil for audioSettings configures the output to return samples in a convenient uncompressed format, with sample rate and other properties determined according to the properties of the specified audio tracks as well as other considerations that may vary according to device capabilities, operating system version, and other factors. Therefore if you wish to perform any processing on the output, you must examine the CMAudioFormatDescription of the CMSampleBuffers that are provided in order to ensure that your processing is appropriately configured for the output format.
     * 
     * @param tracks
     * An NSArray of AVAssetTrack objects from which the created object should read sample buffers to be mixed.
     * @param audioSettings
     * An NSDictionary of audio settings to be used for audio output.
     * @return
     * An instance of AVAssetReaderAudioMixOutput.
     */
    @Generated
    @Selector("assetReaderAudioMixOutputWithAudioTracks:audioSettings:")
    public static native AVAssetReaderAudioMixOutput assetReaderAudioMixOutputWithAudioTracksAudioSettings(
            NSArray<? extends AVAssetTrack> audioTracks, NSDictionary<String, ?> audioSettings);

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
     * [@property] audioMix
     * 
     * The audio mix used by the receiver.
     * 
     * The value of this property is an AVAudioMix that can be used to specify how the volume of audio samples read from each source track will change over the timeline of the source asset.
     * 
     * This property cannot be set after reading has started.
     */
    @Generated
    @Selector("audioMix")
    public native AVAudioMix audioMix();

    /**
     * [@property] audioSettings
     * 
     * The audio settings used by the receiver.
     * 
     * The value of this property is an NSDictionary that contains values for keys from AVAudioSettings.h (linear PCM only).  A value of nil indicates that the receiver will return audio samples in a convenient uncompressed format, with sample rate and other properties determined according to the properties of the receiver's audio tracks.
     */
    @Generated
    @Selector("audioSettings")
    public native NSDictionary<String, ?> audioSettings();

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch for scaled audio edits.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchAlgorithmSpectral, are defined in AVAudioProcessingSettings.h.  An NSInvalidArgumentException will be raised if this property is set to a value other than the constants defined in that file.
     * 
     * The default value is AVAudioTimePitchAlgorithmSpectral.
     */
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    /**
     * [@property] audioTracks
     * 
     * The tracks from which the receiver reads mixed audio.
     * 
     * The value of this property is an NSArray of AVAssetTracks owned by the target AVAssetReader's asset.
     */
    @Generated
    @Selector("audioTracks")
    public native NSArray<? extends AVAssetTrack> audioTracks();

    @Generated
    @Selector("init")
    public native AVAssetReaderAudioMixOutput init();

    /**
     * initWithAudioTracks:audioSettings:
     * 
     * Creates an instance of AVAssetReaderAudioMixOutput for reading mixed audio from the specified audio tracks, with optional audio settings.
     * 
     * Each track must be one of the tracks owned by the target AVAssetReader's asset and must be of media type AVMediaTypeAudio.
     * 
     * For non-nil values of audioSettings, the audio settings dictionary must contain values for keys in AVAudioSettings.h (linear PCM only). Initialization will fail if the audio settings cannot be used with the specified tracks. AVSampleRateConverterAudioQualityKey is not supported.
     * 
     * A value of nil for audioSettings configures the output to return samples in a convenient uncompressed format, with sample rate and other properties determined according to the properties of the specified audio tracks as well as other considerations that may vary according to device capabilities, operating system version, and other factors. Therefore if you wish to perform any processing on the output, you must examine the CMAudioFormatDescription of the CMSampleBuffers that are provided in order to ensure that your processing is appropriately configured for the output format.
     * 
     * @param tracks
     * An NSArray of AVAssetTrack objects from which the created object should read sample buffers to be mixed.
     * @param audioSettings
     * An NSDictionary of audio settings to be used for audio output.
     * @return
     * An instance of AVAssetReaderAudioMixOutput.
     */
    @Generated
    @Selector("initWithAudioTracks:audioSettings:")
    public native AVAssetReaderAudioMixOutput initWithAudioTracksAudioSettings(
            NSArray<? extends AVAssetTrack> audioTracks, NSDictionary<String, ?> audioSettings);

    /**
     * [@property] audioMix
     * 
     * The audio mix used by the receiver.
     * 
     * The value of this property is an AVAudioMix that can be used to specify how the volume of audio samples read from each source track will change over the timeline of the source asset.
     * 
     * This property cannot be set after reading has started.
     */
    @Generated
    @Selector("setAudioMix:")
    public native void setAudioMix(AVAudioMix value);

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch for scaled audio edits.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchAlgorithmSpectral, are defined in AVAudioProcessingSettings.h.  An NSInvalidArgumentException will be raised if this property is set to a value other than the constants defined in that file.
     * 
     * The default value is AVAudioTimePitchAlgorithmSpectral.
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);
}
