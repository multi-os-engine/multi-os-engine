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
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableCompositionTrack extends AVCompositionTrack {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableCompositionTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableCompositionTrack alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMutableCompositionTrack allocWithZone(VoidPtr zone);

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
    public static native AVMutableCompositionTrack new_objc();

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
     * [@property] extendedLanguageTag
     * <p>
     * Indicates the language tag associated with the track, as an IETF BCP 47 (RFC 4646) language identifier.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    @Generated
    @Selector("init")
    public native AVMutableCompositionTrack init();

    /**
     * insertEmptyTimeRange:
     * <p>
     * Adds or extends an empty timeRange within the composition track.
     * <p>
     * If you insert an empty timeRange into the track, any media that was presented during that interval prior to the
     * insertion will be presented instead immediately afterward.
     * The exact meaning of the term "empty timeRange" depends upon the mediaType of the track. For example, an empty
     * timeRange in a sound track presents silence.
     * Note that you cannot add empty time ranges to the end of a composition track.
     *
     * @param timeRange Specifies the empty timeRange to be inserted.
     */
    @Generated
    @Selector("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * insertTimeRange:ofTrack:atTime:error:
     * <p>
     * Inserts a timeRange of a source track into a track of a composition.
     * <p>
     * You provide a reference to an AVAssetTrack and the timeRange within it that you want to insert. You specify the
     * start time in the target composition track at which the timeRange should be inserted.
     * <p>
     * Note that the inserted track timeRange will be presented at its natural duration and rate. It can be scaled to a
     * different duration (and presented at a different rate) via -scaleTimeRange:toDuration:.
     *
     * @param timeRange Specifies the timeRange of the track to be inserted.
     * @param track     Specifies the source track to be inserted. Only AVAssetTracks of AVURLAssets and AVCompositions
     *                  are supported (AVCompositions starting in MacOS X 10.10 and iOS 8.0).
     * @param startTime Specifies the time at which the inserted track is to be presented by the composition track. You
     *                  may pass kCMTimeInvalid for startTime to indicate that the timeRange should be appended to the
     *                  end of the track.
     * @param error     Describes failures that may be reported to the user, e.g. the asset that was selected for
     *                  insertion in the composition is restricted by copy-protection.
     * @return A BOOL value indicating the success of the insertion.
     */
    @Generated
    @Selector("insertTimeRange:ofTrack:atTime:error:")
    public native boolean insertTimeRangeOfTrackAtTimeError(@ByValue CMTimeRange timeRange, AVAssetTrack track,
            @ByValue CMTime startTime, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * insertTimeRanges:ofTracks:atTime:error:
     * <p>
     * Inserts the timeRanges of multiple source tracks into a track of a composition.
     * <p>
     * This method is equivalent to (but more efficient than) calling -insertTimeRange:ofTrack:atTime:error: for each
     * timeRange/track pair. If this method returns an error, none of the time ranges will be inserted into the
     * composition track. To specify an empty time range, pass NSNull for the track and a time range of starting at
     * kCMTimeInvalid with a duration of the desired empty edit.
     *
     * @param timeRanges Specifies the timeRanges to be inserted. An NSArray of NSValues containing CMTimeRange. (See
     *                   +[NSValue valueWithCMTimeRange:] in AVTime.h.)
     * @param tracks     Specifies the source tracks to be inserted. Only AVAssetTracks of AVURLAssets and
     *                   AVCompositions are supported (AVCompositions starting in MacOS X 10.10 and iOS 8.0).
     * @param startTime  Specifies the time at which the inserted tracks are to be presented by the composition track.
     *                   You may pass kCMTimeInvalid for startTime to indicate that the timeRanges should be appended to
     *                   the end of the track.
     * @param error      Describes failures that may be reported to the user, e.g. the asset that was selected for
     *                   insertion in the composition is restricted by copy-protection.
     * @return A BOOL value indicating the success of the insertion.
     */
    @Generated
    @Selector("insertTimeRanges:ofTracks:atTime:error:")
    public native boolean insertTimeRangesOfTracksAtTimeError(NSArray<? extends NSValue> timeRanges,
            NSArray<? extends AVAssetTrack> tracks, @ByValue CMTime startTime,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] languageCode
     * <p>
     * Indicates the language associated with the track, as an ISO 639-2/T language code.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    /**
     * [@property] naturalTimeScale
     * <p>
     * Indicates a timescale in which time values for the track can be operated upon without extraneous numerical
     * conversion.
     * <p>
     * If not set, the value is the naturalTimeScale of the first non-empty edit, or 600 if there are no non-empty
     * edits.
     * Set to 0 to revert to default behavior.
     */
    @Generated
    @Selector("naturalTimeScale")
    public native int naturalTimeScale();

    /**
     * [@property] preferredTransform
     * <p>
     * The preferred transformation of the visual media data for display purposes.
     * <p>
     * The default value is CGAffineTransformIdentity.
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * [@property] preferredVolume
     * <p>
     * The preferred volume of the audible media data.
     * <p>
     * The default value is 1.0.
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * removeTimeRange:
     * <p>
     * Removes a specified timeRange from the track.
     * <p>
     * Removal of a timeRange does not cause the track to be removed from the composition. Instead it removes or
     * truncates track segments that intersect with the timeRange.
     *
     * @param timeRange Specifies the timeRange to be removed.
     */
    @Generated
    @Selector("removeTimeRange:")
    public native void removeTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * scaleTimeRange:toDuration:
     * <p>
     * Changes the duration of a timeRange of the track.
     * <p>
     * Each trackSegment affected by the scaling operation will be presented at a rate equal to source.duration /
     * target.duration of its resulting timeMapping.
     *
     * @param timeRange Specifies the timeRange of the track to be scaled.
     * @param duration  Specifies the new duration of the timeRange.
     */
    @Generated
    @Selector("scaleTimeRange:toDuration:")
    public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange, @ByValue CMTime duration);

    /**
     * [@property] segments
     * <p>
     * Provides read/write access to the array of track segments, each an instance of AVCompositionTrackSegment.
     * <p>
     * Note that timeMapping.target.start of the first AVCompositionTrackSegment must be kCMTimeZero, and the
     * timeMapping.target.start of each subsequent AVCompositionTrackSegment must equal CMTimeRangeGetEnd(the previous
     * AVCompositionTrackSegment's timeMapping.target).
     * Use -validateTrackSegments:error: to perform a test to ensure that an array of AVCompositionTrackSegments
     * conforms to this rule.
     */
    @Generated
    @Selector("segments")
    public native NSArray<? extends AVCompositionTrackSegment> segments();

    /**
     * [@property] extendedLanguageTag
     * <p>
     * Indicates the language tag associated with the track, as an IETF BCP 47 (RFC 4646) language identifier.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    /**
     * [@property] languageCode
     * <p>
     * Indicates the language associated with the track, as an ISO 639-2/T language code.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

    /**
     * [@property] naturalTimeScale
     * <p>
     * Indicates a timescale in which time values for the track can be operated upon without extraneous numerical
     * conversion.
     * <p>
     * If not set, the value is the naturalTimeScale of the first non-empty edit, or 600 if there are no non-empty
     * edits.
     * Set to 0 to revert to default behavior.
     */
    @Generated
    @Selector("setNaturalTimeScale:")
    public native void setNaturalTimeScale(int value);

    /**
     * [@property] preferredTransform
     * <p>
     * The preferred transformation of the visual media data for display purposes.
     * <p>
     * The default value is CGAffineTransformIdentity.
     */
    @Generated
    @Selector("setPreferredTransform:")
    public native void setPreferredTransform(@ByValue CGAffineTransform value);

    /**
     * [@property] preferredVolume
     * <p>
     * The preferred volume of the audible media data.
     * <p>
     * The default value is 1.0.
     */
    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    /**
     * [@property] segments
     * <p>
     * Provides read/write access to the array of track segments, each an instance of AVCompositionTrackSegment.
     * <p>
     * Note that timeMapping.target.start of the first AVCompositionTrackSegment must be kCMTimeZero, and the
     * timeMapping.target.start of each subsequent AVCompositionTrackSegment must equal CMTimeRangeGetEnd(the previous
     * AVCompositionTrackSegment's timeMapping.target).
     * Use -validateTrackSegments:error: to perform a test to ensure that an array of AVCompositionTrackSegments
     * conforms to this rule.
     */
    @Generated
    @Selector("setSegments:")
    public native void setSegments(NSArray<? extends AVCompositionTrackSegment> value);

    /**
     * validateTrackSegments:error:
     * <p>
     * Tests an array of AVCompositionTrackSegments to determine whether they conform to the timing rules noted above
     * (see the property key @"trackSegments").
     * <p>
     * The array is tested for suitability for setting as the value of the trackSegments property. If a portion of an
     * existing trackSegments array is to be modified, the modification can be made via an instance of NSMutableArray,
     * and the resulting array can be tested via -validateTrackSegments:error:.
     *
     * @param trackSegments The array of AVCompositionTrackSegments to be validated.
     * @param error         If validation fais, returns information about the failure.
     * @return YES if validation suceeds, otherwise NO.
     */
    @Generated
    @Selector("validateTrackSegments:error:")
    public native boolean validateTrackSegmentsError(NSArray<? extends AVCompositionTrackSegment> trackSegments,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * addTrackAssociationToTrack:type:
     * <p>
     * Establishes a track association of a specific type between two tracks.
     *
     * @param compositionTrack     An AVCompositionTrack object that is to be associated with the receiver.
     * @param trackAssociationType The type of track association to add between the receiver and the specified
     *                             compositionTrack (for instance, AVTrackAssociationTypeChapterList).
     */
    @Generated
    @Selector("addTrackAssociationToTrack:type:")
    public native void addTrackAssociationToTrackType(AVCompositionTrack compositionTrack, String trackAssociationType);

    /**
     * [@property] enabled
     * <p>
     * Specifies whether the track is enabled or disabled. Default is YES.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * removeTrackAssociationToTrack:type:
     * <p>
     * Removes a track association of a specific type between two tracks.
     *
     * @param compositionTrack     An AVCompositionTrack object that is associated with the receiver.
     * @param trackAssociationType The type of track association to remove between the receiver and the specified
     *                             compositionTrack (for instance, AVTrackAssociationTypeChapterList).
     */
    @Generated
    @Selector("removeTrackAssociationToTrack:type:")
    public native void removeTrackAssociationToTrackType(AVCompositionTrack compositionTrack,
            String trackAssociationType);

    /**
     * replaceFormatDescription:withFormatDescription:
     * <p>
     * Replaces one of the receiver's format descriptions with another format description or cancels a previous
     * replacement.
     * <p>
     * You can use this method to make surgical changes to a track's format descriptions, such as adding format
     * description extensions to a format description or changing the audio channel layout of an audio track. You should
     * note that a format description can have extensions of type
     * kCMFormatDescriptionExtension_VerbatimSampleDescription and kCMFormatDescriptionExtension_VerbatimISOSampleEntry;
     * if you modify a copy of a format description, you should delete those extensions from the copy or your changes
     * might be ignored. Also note that format description replacements are not transferred when performing editing
     * operations on AVMutableCompositionTrack objects; for instance, inserting a range of a composition track into
     * another composition track does not transfer any replacement format descriptions.
     *
     * @param originalFormatDescription    A CMFormatDescription occurring in the underlying asset track.
     * @param replacementFormatDescription A CMFormatDescription to replace the specified format description or NULL to
     *                                     indicate that a previous replacement of originalFormatDescription should be
     *                                     cancelled.
     */
    @Generated
    @Selector("replaceFormatDescription:withFormatDescription:")
    public native void replaceFormatDescriptionWithFormatDescription(CMFormatDescriptionRef originalFormatDescription,
            CMFormatDescriptionRef replacementFormatDescription);

    /**
     * [@property] enabled
     * <p>
     * Specifies whether the track is enabled or disabled. Default is YES.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);
}
