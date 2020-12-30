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
 * AVCaptureMovieFileOutput
 * 
 *    AVCaptureMovieFileOutput is a concrete subclass of AVCaptureFileOutput that writes captured media to QuickTime movie files.
 * 
 *    AVCaptureMovieFileOutput implements the complete file recording interface declared by AVCaptureFileOutput for writing media data to QuickTime movie files. In addition, instances of AVCaptureMovieFileOutput allow clients to configure options specific to the QuickTime file format, including allowing them to write metadata collections to each file, specify media encoding options for each track (Mac OS X), and specify an interval at which movie fragments should be written.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureMovieFileOutput extends AVCaptureFileOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureMovieFileOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureMovieFileOutput alloc();

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
     * [@property] availableVideoCodecTypes
     * 
     *    Indicates the supported video codec formats that can be specified in setOutputSettingsForConnection:.
     * 
     *    The value of this property is an NSArray of AVVideoCodecTypes that can be used as values for the AVVideoCodecKey in the receiver's setOutputSettingsForConnection: dictionary. The array of available video codecs may change depending on the current session preset. The first codec in the array is used by default when recording a file.
     */
    @Generated
    @Selector("availableVideoCodecTypes")
    public native NSArray<String> availableVideoCodecTypes();

    @Generated
    @Selector("init")
    public native AVCaptureMovieFileOutput init();

    /**
     * [@property] metadata
     * 
     *    A collection of metadata to be written to the receiver's output files.
     * 
     *    The value of this property is an array of AVMetadataItem objects representing the collection of top-level metadata to be written in each output file.
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * [@property] movieFragmentInterval
     * 
     *    Specifies the frequency with which movie fragments should be written.
     * 
     *    When movie fragments are used, a partially written QuickTime movie file whose writing is unexpectedly interrupted can be successfully opened and played up to multiples of the specified time interval. A value of kCMTimeInvalid indicates that movie fragments should not be used, but that only a movie atom describing all of the media in the file should be written. The default value of this property is ten seconds.
     * 
     *    Changing the value of this property will not affect the movie fragment interval of the file currently being written, if there is one.
     */
    @Generated
    @Selector("movieFragmentInterval")
    @ByValue
    public native CMTime movieFragmentInterval();

    /**
     * outputSettingsForConnection:
     * 
     *    Returns the options the receiver uses to encode media from the given connection as it is being recorded.
     * 
     *    See AVAudioSettings.h for audio connections or AVVideoSettings.h for video connections for more information on the structure of an output settings dictionary. If the returned value is an empty dictionary (i.e. [NSDictionary dictionary], the format of the media from the connection will not be changed before being written to the file. If -setOutputSettings:forConnection: was called with a nil dictionary, this method returns a non-nil dictionary reflecting the settings used by the AVCaptureSession's current sessionPreset.
     * 
     * @param connection
     *    The connection delivering the media to be encoded.
     * @return
     *    An NSDictionary of output settings.
     */
    @Generated
    @Selector("outputSettingsForConnection:")
    public native NSDictionary<String, ?> outputSettingsForConnection(AVCaptureConnection connection);

    /**
     * recordsVideoOrientationAndMirroringChangesAsMetadataTrackForConnection:
     * 
     *    Returns YES if the movie file output will create a timed metadata track that records samples which reflect changes made to the given connection's videoOrientation and videoMirrored properties during recording.
     * 
     *    See setRecordsVideoOrientationAndMirroringChanges:asMetadataTrackForConnection: for details on the behavior controlled by this value. The default value returned is NO.
     * 
     * @param connection
     *    A connection delivering video media to the movie file output. This method throws an NSInvalidArgumentException if the connection does not have a mediaType of AVMediaTypeVideo or if the connection does not terminate at the movie file output.
     */
    @Generated
    @Selector("recordsVideoOrientationAndMirroringChangesAsMetadataTrackForConnection:")
    public native boolean recordsVideoOrientationAndMirroringChangesAsMetadataTrackForConnection(
            AVCaptureConnection connection);

    /**
     * [@property] metadata
     * 
     *    A collection of metadata to be written to the receiver's output files.
     * 
     *    The value of this property is an array of AVMetadataItem objects representing the collection of top-level metadata to be written in each output file.
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * [@property] movieFragmentInterval
     * 
     *    Specifies the frequency with which movie fragments should be written.
     * 
     *    When movie fragments are used, a partially written QuickTime movie file whose writing is unexpectedly interrupted can be successfully opened and played up to multiples of the specified time interval. A value of kCMTimeInvalid indicates that movie fragments should not be used, but that only a movie atom describing all of the media in the file should be written. The default value of this property is ten seconds.
     * 
     *    Changing the value of this property will not affect the movie fragment interval of the file currently being written, if there is one.
     */
    @Generated
    @Selector("setMovieFragmentInterval:")
    public native void setMovieFragmentInterval(@ByValue CMTime value);

    /**
     * setOutputSettings:forConnection:
     * 
     *    Sets the options the receiver uses to encode media from the given connection as it is being recorded.
     * 
     *    See AVAudioSettings.h for audio connections or AVVideoSettings.h for video connections for more information on how to construct an output settings dictionary. A value of an empty dictionary (i.e. [NSDictionary dictionary], means that the format of the media from the connection should not be changed before being written to the file. A value of nil means that the output format will be determined by the session preset. In this case, -outputSettingsForConnection: will return a non-nil dictionary reflecting the settings used by the AVCaptureSession's current sessionPreset.
     * 
     *    On iOS, your outputSettings dictionary may only contain keys listed in - supportedOutputSettingsKeysForConnection:. If you specify any other key, an NSInvalidArgumentException will be thrown. Further restrictions may be imposed on the AVVideoCodecTypeKey. Its value should be present in the -availableVideoCodecTypes array. If AVVideoCompressionPropertiesKey is specified, you must also specify a valid value for AVVideoCodecKey. On iOS versions prior to 12.0, the only settable key for video connections is AVVideoCodecTypeKey. On iOS 12.0 and later, video connections gain support for AVVideoCompressionPropertiesKey.
     * 
     *    On iOS, -outputSettingsForConnection: always provides a fully populated dictionary. If you call -outputSettingsForConnection: with the intent of overriding a few of the values, you must take care to exclude keys that are not supported before calling -setOutputSettings:forConnection:. When providing an AVVideoCompressionPropertiesKey sub dictionary, you may specify a sparse dictionary. AVCaptureMovieFileOutput will always fill in missing keys with default values for the current AVCaptureSession configuration.
     * 
     * @param outputSettings
     *    An NSDictionary of output settings.
     * @param connection
     *    The connection delivering the media to be encoded.
     */
    @Generated
    @Selector("setOutputSettings:forConnection:")
    public native void setOutputSettingsForConnection(NSDictionary<String, ?> outputSettings,
            AVCaptureConnection connection);

    /**
     * setRecordsVideoOrientationAndMirroringChanges:asMetadataTrackForConnection:
     * 
     *    Controls whether or not the movie file output will create a timed metadata track that records samples which reflect changes made to the given connection's videoOrientation and videoMirrored properties during recording.
     * 
     *    When a recording is started the current state of a video capture connection's videoOrientation and videoMirrored properties are used to build the display matrix for the created video track. The movie file format allows only one display matrix per track, which means that any changes made during a recording to the videoOrientation and videoMirrored properties are not captured. For example, a user starts a recording with their device in the portrait orientation, and then partway through the recording changes the device to a landscape orientation. The landscape orientation requires a different display matrix, but only the initial display matrix (the portrait display matrix) is recorded for the video track.
     * 
     *    By invoking this method the client application directs the movie file output to create an additional track in the captured movie. This track is a timed metadata track that is associated with the video track, and contains one or more samples that contain a Video Orientation value (as defined by EXIF and TIFF specifications, which is enumerated by CGImagePropertyOrientation in <ImageIO/CGImageProperties.h>). The value represents the display matrix corresponding to the AVCaptureConnection's videoOrientation and videoMirrored properties when applied to the input source. The initial sample written to the timed metadata track represents video track's display matrix. During recording additional samples will be written to the timed metadata track whenever the client application changes the video connection's videoOrienation or videoMirrored properties. Using the above example, when the client application detects the user changing the device from portrait to landscape orientation, it updates the video connection's videoOrientation property, thus causing the movie file output to add a new sample to the timed metadata track.
     * 
     *    After capture, playback and editing applications can use the timed metadata track to enhance their user's experience. For example, when playing back the captured movie, a playback engine can use the samples to adjust the display of the video samples to keep the video properly oriented. Another example is an editing application that uses the sample the sample times to suggest cut points for breaking the captured movie into separate clips, where each clip is properly oriented.
     * 
     *    The default behavior is to not create the timed metadata track.
     * 
     *    The doRecordChanges value is only observed at the start of recording. Changes to the value will not have any effect until the next recording is started.
     * 
     * @param doRecordChanges
     *    If YES, the movie file output will create a timed metadata track that records samples which reflect changes made to the given connection's videoOrientation and videoMirrored properties during recording.
     * @param connection
     *    A connection delivering video media to the movie file output. This method throws an NSInvalidArgumentException if the connection does not have a mediaType of AVMediaTypeVideo or if the connection does not terminate at the movie file output.
     */
    @Generated
    @Selector("setRecordsVideoOrientationAndMirroringChanges:asMetadataTrackForConnection:")
    public native void setRecordsVideoOrientationAndMirroringChangesAsMetadataTrackForConnection(
            boolean doRecordChanges, AVCaptureConnection connection);

    /**
     * supportedOutputSettingsKeysForConnection:
     * 
     *    Indicates the supported keys that can be specified in setOutputSettings:forConnection:.
     * 
     *    Returns an NSArray of NSStrings listing the allowable keys in the receiver's setOutputSettings:forConnection: dictionary.
     * 
     * @param connection
     *    The connection delivering the media to be encoded.
     */
    @Generated
    @Selector("supportedOutputSettingsKeysForConnection:")
    public native NSArray<String> supportedOutputSettingsKeysForConnection(AVCaptureConnection connection);
}
