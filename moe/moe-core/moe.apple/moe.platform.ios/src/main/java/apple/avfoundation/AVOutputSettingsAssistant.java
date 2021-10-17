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
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVOutputSettingsAssistant
 * <p>
 * A class, each instance of which specifies a set of parameters for configuring objects that use output settings dictionaries, for example AVAssetWriter & AVAssetWriterInput, so that the resulting media file conforms to some specific criteria
 * <p>
 * Instances of AVOutputSettingsAssistant are typically created using a string constant representing a specific preset configuration, such as AVOutputSettingsPreset1280x720.  Once you have an instance, its properties can be used as a guide for creating and configuring an AVAssetWriter object and one or more AVAssetWriterInput objects.  If all the suggested properties are respected, the resulting media file will conform to the criteria implied by the preset.  Alternatively, the properties of an instance can be used as a "base" configuration which can be customized to suit your individual needs.
 * <p>
 * The recommendations made by an instance get better as you tell it more about the format of your source data.  For example, if you set the sourceVideoFormat property, the recommendation made by the videoSettings property will ensure that your video frames are not scaled up from a smaller size.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVOutputSettingsAssistant extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVOutputSettingsAssistant(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVOutputSettingsAssistant alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVOutputSettingsAssistant allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * availableOutputSettingsPresets
     * <p>
     * Returns the list of presets that can be used to create an instance of AVOutputSettingsAssistant
     * <p>
     * Each preset in the returned list can be passed in to +outputSettingsAssistantWithPreset: to create a new instance of AVOutputSettingsAssistant.
     * <p>
     * On iOS, the returned array may be different between different device models.
     *
     * @return An NSArray of NSString objects, each of which is a preset identifier
     */
    @Generated
    @Selector("availableOutputSettingsPresets")
    public static native NSArray<String> availableOutputSettingsPresets();

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
    public static native AVOutputSettingsAssistant new_objc();

    /**
     * outputSettingsAssistantWithPreset:
     * <p>
     * Returns an instance of AVOutputSettingsAssistant corresponding to the given preset
     * <p>
     * The properties of the returned object can be used as a guide for creating and configuring an AVAssetWriter object and one or more AVAssetWriterInput objects.  If all the suggested properties are respected in creating the AVAssetWriter, the resulting media file will conform to the criteria implied by the preset.
     * <p>
     * Use +availableOutputSettingsPresets to get a list of presets identifiers that can be used with this method.
     *
     * @param presetIdentifier The string identifier, for example AVOutputSettingsPreset1280x720, for the desired preset
     * @return An instance of AVOutputSettingsAssistant with properties corresponding to the given preset, or nil if there is no such available preset.
     */
    @Generated
    @Selector("outputSettingsAssistantWithPreset:")
    public static native AVOutputSettingsAssistant outputSettingsAssistantWithPreset(String presetIdentifier);

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
     * [@property] audioSettings
     * <p>
     * A dictionary of key/value pairs, as specified in AVAudioSettings.h, to be used when e.g. creating an instance of AVAssetWriterInput
     * <p>
     * The value of this property may change as a result of setting a new value for the sourceAudioFormat property.
     */
    @Generated
    @Selector("audioSettings")
    public native NSDictionary<String, ?> audioSettings();

    @Generated
    @Selector("init")
    public native AVOutputSettingsAssistant init();

    /**
     * [@property] outputFileType
     * <p>
     * A UTI indicating the type of file to be written, to be used when e.g. creating an instance of AVAssetWriter
     * <p>
     * Use UTTypeCopyPreferredTagWithClass / kUTTagClassFilenameExtension to get a suitable file extension for a given file type.
     */
    @Generated
    @Selector("outputFileType")
    public native String outputFileType();

    /**
     * [@property] sourceAudioFormat
     * <p>
     * A CMAudioFormatDescription object describing the format of you audio data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the audio settings that should be used.  After setting this property, you should re-query the audioSettings property to get the new recommendation.  The default value is NULL, which means that the receiver does not know anything about the format of your audio data.
     * <p>
     * If you set a non-NULL value for this property, and are using the receiver to initialize an AVAssetWriterInput, the same format description should be used to initialize the AVAssetWriterInput, along with the dictionary from the audioSettings property.
     */
    @Generated
    @Selector("setSourceAudioFormat:")
    public native void setSourceAudioFormat(CMFormatDescriptionRef value);

    /**
     * [@property] sourceVideoAverageFrameDuration
     * <p>
     * A CMTime describing the average frame duration (reciprocal of average frame rate) of your video data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the video settings that should be used.  After setting this property, you should re-query the videoSettings property to get the new recommendation.
     * <p>
     * The default value is 1/30, which means that the receiver is assuming that your source video has an average frame rate of 30fps.
     * <p>
     * It is an error to set this property to a value that is not positive or not numeric.  See CMTIME_IS_NUMERIC.
     */
    @Generated
    @Selector("setSourceVideoAverageFrameDuration:")
    public native void setSourceVideoAverageFrameDuration(@ByValue CMTime value);

    /**
     * [@property] sourceVideoFormat
     * <p>
     * A CMVideoFormatDescription object describing the format of your video data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the video settings that should be used.  After setting this property, you should re-query the videoSettings property to get the new recommendation.  The default value is NULL, which means that the receiver does not know anything about the format of your video data.
     * <p>
     * If you set a non-NULL value for this property, and are using the receiver to initialize an AVAssetWriterInput, the same format description should be used to initialize the AVAssetWriterInput, along with the dictionary from the videoSettings property.
     */
    @Generated
    @Selector("setSourceVideoFormat:")
    public native void setSourceVideoFormat(CMFormatDescriptionRef value);

    /**
     * [@property] sourceVideoMinFrameDuration
     * <p>
     * A CMTime describing the minimum frame duration (reciprocal of the maximum frame rate) of your video data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the video settings that should be used.  After setting this property, you should re-query the videoSettings property to get the new recommendation.
     * <p>
     * If your source of video data is an instance of AVAssetReaderOutput, you can discover the minimum frame duration of your source asset using the AVAssetTrack.minFrameDuration property.
     * <p>
     * The default value is 1/30, which means that the receiver is assuming that your source video has a maximum frame rate of 30fps.
     * <p>
     * It is an error to set this property to a value that is not positive or not numeric.  See CMTIME_IS_NUMERIC.
     */
    @Generated
    @Selector("setSourceVideoMinFrameDuration:")
    public native void setSourceVideoMinFrameDuration(@ByValue CMTime value);

    /**
     * [@property] sourceAudioFormat
     * <p>
     * A CMAudioFormatDescription object describing the format of you audio data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the audio settings that should be used.  After setting this property, you should re-query the audioSettings property to get the new recommendation.  The default value is NULL, which means that the receiver does not know anything about the format of your audio data.
     * <p>
     * If you set a non-NULL value for this property, and are using the receiver to initialize an AVAssetWriterInput, the same format description should be used to initialize the AVAssetWriterInput, along with the dictionary from the audioSettings property.
     */
    @Generated
    @Selector("sourceAudioFormat")
    public native CMFormatDescriptionRef sourceAudioFormat();

    /**
     * [@property] sourceVideoAverageFrameDuration
     * <p>
     * A CMTime describing the average frame duration (reciprocal of average frame rate) of your video data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the video settings that should be used.  After setting this property, you should re-query the videoSettings property to get the new recommendation.
     * <p>
     * The default value is 1/30, which means that the receiver is assuming that your source video has an average frame rate of 30fps.
     * <p>
     * It is an error to set this property to a value that is not positive or not numeric.  See CMTIME_IS_NUMERIC.
     */
    @Generated
    @Selector("sourceVideoAverageFrameDuration")
    @ByValue
    public native CMTime sourceVideoAverageFrameDuration();

    /**
     * [@property] sourceVideoFormat
     * <p>
     * A CMVideoFormatDescription object describing the format of your video data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the video settings that should be used.  After setting this property, you should re-query the videoSettings property to get the new recommendation.  The default value is NULL, which means that the receiver does not know anything about the format of your video data.
     * <p>
     * If you set a non-NULL value for this property, and are using the receiver to initialize an AVAssetWriterInput, the same format description should be used to initialize the AVAssetWriterInput, along with the dictionary from the videoSettings property.
     */
    @Generated
    @Selector("sourceVideoFormat")
    public native CMFormatDescriptionRef sourceVideoFormat();

    /**
     * [@property] sourceVideoMinFrameDuration
     * <p>
     * A CMTime describing the minimum frame duration (reciprocal of the maximum frame rate) of your video data
     * <p>
     * Setting this property will allow the receiver to make a more informed recommendation for the video settings that should be used.  After setting this property, you should re-query the videoSettings property to get the new recommendation.
     * <p>
     * If your source of video data is an instance of AVAssetReaderOutput, you can discover the minimum frame duration of your source asset using the AVAssetTrack.minFrameDuration property.
     * <p>
     * The default value is 1/30, which means that the receiver is assuming that your source video has a maximum frame rate of 30fps.
     * <p>
     * It is an error to set this property to a value that is not positive or not numeric.  See CMTIME_IS_NUMERIC.
     */
    @Generated
    @Selector("sourceVideoMinFrameDuration")
    @ByValue
    public native CMTime sourceVideoMinFrameDuration();

    /**
     * [@property] videoSettings
     * <p>
     * A dictionary of key/value pairs, as specified in AVVideoSettings.h, to be used when e.g. creating an instance of AVAssetWriterInput
     * <p>
     * The value of this property may change as a result of setting a new value for the sourceVideoFormat property.
     */
    @Generated
    @Selector("videoSettings")
    public native NSDictionary<String, ?> videoSettings();
}
