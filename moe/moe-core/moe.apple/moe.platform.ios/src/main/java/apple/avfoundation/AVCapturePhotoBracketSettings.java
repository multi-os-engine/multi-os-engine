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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVCapturePhotoBracketSettings
 * 
 * A concrete subclass of AVCapturePhotoSettings that describes a bracketed capture.
 * 
 * In addition to the properties expressed in the base class, an AVCapturePhotoBracketSettings contains an array of
 * AVCaptureBracketedStillImageSettings objects, where each describes one individual photo in the bracket.
 * bracketedSettings.count must be <= AVCapturePhotoOutput's -maxBracketedCapturePhotoCount. Capturing a photo bracket
 * may require the allocation of additional resources.
 * 
 * When you request a bracketed capture, your AVCapturePhotoCaptureDelegate's -captureOutput:didFinishProcessing{Photo |
 * RawPhoto}... callbacks are called back bracketSettings.count times and provided with the corresponding
 * AVCaptureBracketedStillImageSettings object from your request.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCapturePhotoBracketSettings extends AVCapturePhotoSettings {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCapturePhotoBracketSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCapturePhotoBracketSettings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCapturePhotoBracketSettings allocWithZone(VoidPtr zone);

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
    public static native AVCapturePhotoBracketSettings new_objc();

    /**
     * photoBracketSettingsWithRawPixelFormatType:processedFormat:bracketedSettings:
     * 
     * Creates an instance of AVCapturePhotoBracketSettings.
     * 
     * An NSInvalidArgumentException is thrown if bracketedSettings is nil, contains zero elements, or mixes and matches
     * different subclasses of AVCaptureBracketedStillImageSettings.
     * 
     * AVCapturePhotoBracketSettings do not support flashMode, autoStillImageStabilizationEnabled, livePhotoMovieFileURL
     * or livePhotoMovieMetadata.
     * 
     * @param rawPixelFormatType
     *                           One of the OSTypes contained in AVCapturePhotoOutput's
     *                           -availableRawPhotoPixelFormatTypes array. May be set to 0 if you do not desire RAW
     *                           capture.
     * @param processedFormat
     *                           A dictionary of Core Video pixel buffer attributes or AVVideoSettings, analogous to
     *                           AVCaptureStillImageOutput's outputSettings property. If you wish an uncompressed
     *                           format, your dictionary must contain kCVPixelBufferPixelFormatTypeKey, and the format
     *                           specified must be present in AVCapturePhotoOutput's -availablePhotoPixelFormatTypes
     *                           array. kCVPixelBufferPixelFormatTypeKey is the only supported key when expressing
     *                           uncompressed output. If you wish a compressed format, your dictionary must contain
     *                           AVVideoCodecKey and the codec specified must be present in AVCapturePhotoOutput's
     *                           -availablePhotoCodecTypes array. If you are specifying a compressed format, the
     *                           AVVideoCompressionPropertiesKey is also supported, with a payload dictionary containing
     *                           a single AVVideoQualityKey. If you only wish to capture RAW, you may pass a non-zero
     *                           rawPixelFormatType and a nil processedFormat dictionary. If you pass a
     *                           rawPixelFormatType of 0 AND a nil processedFormat dictionary, the default output of
     *                           AVVideoCodecTypeJPEG will be delivered.
     * @param bracketedSettings
     *                           An array of AVCaptureBracketedStillImageSettings objects (defined in
     *                           AVCaptureStillImageOutput.h). All must be of the same type, either
     *                           AVCaptureManualExposureBracketedStillImageSettings or
     *                           AVCaptureAutoExposureBracketedStillImageSettings. bracketedSettings.count must be <=
     *                           AVCapturePhotoOutput's -maxBracketedCapturePhotoCount.
     * @return
     *         An instance of AVCapturePhotoBracketSettings.
     */
    @Generated
    @Selector("photoBracketSettingsWithRawPixelFormatType:processedFormat:bracketedSettings:")
    public static native AVCapturePhotoBracketSettings photoBracketSettingsWithRawPixelFormatTypeProcessedFormatBracketedSettings(
            int rawPixelFormatType, @Nullable NSDictionary<String, ?> processedFormat,
            @NotNull NSArray<? extends AVCaptureBracketedStillImageSettings> bracketedSettings);

    @Generated
    @Selector("photoSettings")
    public static native AVCapturePhotoBracketSettings photoSettings();

    @Generated
    @Selector("photoSettingsFromPhotoSettings:")
    public static native AVCapturePhotoBracketSettings photoSettingsFromPhotoSettings(
            @NotNull AVCapturePhotoSettings photoSettings);

    @Generated
    @Selector("photoSettingsWithFormat:")
    public static native AVCapturePhotoBracketSettings photoSettingsWithFormat(
            @Nullable NSDictionary<String, ?> format);

    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:")
    public static native AVCapturePhotoBracketSettings photoSettingsWithRawPixelFormatType(int rawPixelFormatType);

    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:processedFormat:")
    public static native AVCapturePhotoBracketSettings photoSettingsWithRawPixelFormatTypeProcessedFormat(
            int rawPixelFormatType, @Nullable NSDictionary<String, ?> processedFormat);

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
     * [@property] bracketedSettings
     * 
     * An array of AVCaptureBracketedStillImageSettings objects you passed in
     * -initWithFormat:rawPixelFormatType:bracketedSettings:
     * 
     * This read-only property never returns nil.
     */
    @NotNull
    @Generated
    @Selector("bracketedSettings")
    public native NSArray<? extends AVCaptureBracketedStillImageSettings> bracketedSettings();

    @Generated
    @Selector("init")
    public native AVCapturePhotoBracketSettings init();

    /**
     * [@property] lensStabilizationEnabled
     * 
     * Specifies whether lens (optical) stabilization should be employed during the bracketed capture.
     * 
     * Default value is NO. This property may only be set to YES if AVCapturePhotoOutput's
     * isLensStabilizationDuringBracketedCaptureSupported is YES. When set to YES, AVCapturePhotoOutput holds the lens
     * steady for the duration of the bracket to counter hand shake and produce a sharper bracket of images.
     */
    @Generated
    @Selector("isLensStabilizationEnabled")
    public native boolean isLensStabilizationEnabled();

    /**
     * [@property] lensStabilizationEnabled
     * 
     * Specifies whether lens (optical) stabilization should be employed during the bracketed capture.
     * 
     * Default value is NO. This property may only be set to YES if AVCapturePhotoOutput's
     * isLensStabilizationDuringBracketedCaptureSupported is YES. When set to YES, AVCapturePhotoOutput holds the lens
     * steady for the duration of the bracket to counter hand shake and produce a sharper bracket of images.
     */
    @Generated
    @Selector("setLensStabilizationEnabled:")
    public native void setLensStabilizationEnabled(boolean value);

    /**
     * photoBracketSettingsWithRawPixelFormatType:rawFileType:processedFormat:processedFileType:bracketedSettings:
     * 
     * Creates an instance of AVCapturePhotoBracketSettings.
     * 
     * An NSInvalidArgumentException is thrown if bracketedSettings is nil, contains zero elements, or mixes and matches
     * different subclasses of AVCaptureBracketedStillImageSettings.
     * 
     * AVCapturePhotoBracketSettings do not support flashMode, autoStillImageStabilizationEnabled, livePhotoMovieFileURL
     * or livePhotoMovieMetadata.
     * 
     * API-Since: 11.0
     * 
     * @param rawPixelFormatType
     *                           One of the OSTypes contained in AVCapturePhotoOutput's
     *                           -availableRawPhotoPixelFormatTypes array. May be set to 0 if you do not desire RAW
     *                           capture.
     * @param rawFileType
     *                           The file container for which the RAW image should be formatted to be written. Pass nil
     *                           if you have no preferred file container. A default container will be chosen for you.
     * @param processedFormat
     *                           A dictionary of Core Video pixel buffer attributes or AVVideoSettings, analogous to
     *                           AVCaptureStillImageOutput's outputSettings property. If you wish an uncompressed
     *                           format, your dictionary must contain kCVPixelBufferPixelFormatTypeKey, and the format
     *                           specified must be present in AVCapturePhotoOutput's -availablePhotoPixelFormatTypes
     *                           array. kCVPixelBufferPixelFormatTypeKey is the only supported key when expressing
     *                           uncompressed output. If you wish a compressed format, your dictionary must contain
     *                           AVVideoCodecKey and the codec specified must be present in AVCapturePhotoOutput's
     *                           -availablePhotoCodecTypes array. If you are specifying a compressed format, the
     *                           AVVideoCompressionPropertiesKey is also supported, with a payload dictionary containing
     *                           a single AVVideoQualityKey. If you only wish to capture RAW, you may pass a non-zero
     *                           rawPixelFormatType and a nil processedFormat dictionary. If you pass a
     *                           rawPixelFormatType of 0 AND a nil processedFormat dictionary, the default output of
     *                           AVVideoCodecTypeJPEG will be delivered.
     * @param processedFileType
     *                           The file container for which the processed image should be formatted to be written.
     *                           Pass nil if you have no preferred file container. A default container will be chosen
     *                           for you.
     * @param bracketedSettings
     *                           An array of AVCaptureBracketedStillImageSettings objects (defined in
     *                           AVCaptureStillImageOutput.h). All must be of the same type, either
     *                           AVCaptureManualExposureBracketedStillImageSettings or
     *                           AVCaptureAutoExposureBracketedStillImageSettings. bracketedSettings.count must be <=
     *                           AVCapturePhotoOutput's -maxBracketedCapturePhotoCount.
     * @return
     *         An instance of AVCapturePhotoBracketSettings.
     */
    @Generated
    @Selector("photoBracketSettingsWithRawPixelFormatType:rawFileType:processedFormat:processedFileType:bracketedSettings:")
    public static native AVCapturePhotoBracketSettings photoBracketSettingsWithRawPixelFormatTypeRawFileTypeProcessedFormatProcessedFileTypeBracketedSettings(
            int rawPixelFormatType, @Nullable String rawFileType, @Nullable NSDictionary<String, ?> processedFormat,
            @Nullable String processedFileType,
            @NotNull NSArray<? extends AVCaptureBracketedStillImageSettings> bracketedSettings);

    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:rawFileType:processedFormat:processedFileType:")
    public static native AVCapturePhotoBracketSettings photoSettingsWithRawPixelFormatTypeRawFileTypeProcessedFormatProcessedFileType(
            int rawPixelFormatType, @Nullable String rawFileType, @Nullable NSDictionary<String, ?> processedFormat,
            @Nullable String processedFileType);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
