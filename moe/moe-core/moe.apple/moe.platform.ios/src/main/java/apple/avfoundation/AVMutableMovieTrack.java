package apple.avfoundation;

import apple.NSObject;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
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
public class AVMutableMovieTrack extends AVMovieTrack {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableMovieTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * @method			addTrackAssociationToTrack:type:
     * @abstract		Establishes a track association of a specific type between two tracks.
     * @param			movieTrack
     * 				An AVMovieTrack object that is to be associated with the receiver.
     * @param			trackAssociationType
     * 				The type of track association to add between the receiver and the specified movieTrack (for instance, AVTrackAssociationTypeChapterList).
     */
    @Generated
    @Selector("addTrackAssociationToTrack:type:")
    public native void addTrackAssociationToTrackType(AVMovieTrack movieTrack, String trackAssociationType);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableMovieTrack alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @property       alternateGroupID
     * @abstract       An integer indicating the track as a member of a particular alternate group.
     */
    @Generated
    @Selector("alternateGroupID")
    @NInt
    public native long alternateGroupID();

    /**
     * @method			appendSampleBuffer:decodeTime:presentationTime:error:
     * @abstract		Appends sample data to a media file and adds sample references for the added data to a track's media sample tables.
     * @param			sampleBuffer
     * 				The CMSampleBuffer to be appended; this may be obtained from an instance of AVAssetReader.
     * @param			outDecodeTime
     * 				A pointer to a CMTime structure to receive the decode time in the media of the first sample appended from the sample buffer. Pass NULL if you do not need this information.
     * @param			outPresentationTime
     * 				A pointer to a CMTime structure to receive the presentation time in the media of the first sample appended from the sample buffer. Pass NULL if you do not need this information.
     * @param			outError
     * 				If the appending fails, describes the nature of the failure. For example, if the device containing the track's media data storage is full, AVErrorDiskFull is returned.
     * @result			A BOOL value indicating the success of the operation.
     * @discussion
     *                    If the sample buffer carries sample data, the sample data is written to the container specified by the track property mediaDataStorage if non-nil,
     *                    or else by the movie property defaultMediaDataStorage if non-nil, and sample references will be appended to the track's media.
     *                    If both media data storage properties are nil, the method will fail and return NO.
     *                    If the sample buffer carries sample references only, sample data will not be written and sample references to the samples in their
     *                    original container will be appended to the track's media as necessary.
     * 
     *                    Note regarding sample timing: in a track's media, the first sample's decode timestamp must always be zero.
     *                    For an audio track, each sample buffer's duration is used as the sample decode duration.
     *                    For other track types, difference between a sample's decode timestamp and the following 
     *                    sample's decode timestamp is used as the first sample's decode duration, so as to preserve the relative timing.
     * 
     *                    Note that this method does not modify the track's sourceTimeMappings but only appends sample references and sample data to the track's media.  
     *                    To make the new samples appear in the track's timeline, invoke -insertMediaTimeRange:intoTimeRange:.
     *                    You can retrieve the mediaPresentationTimeRange property before and after appending a sequence of samples,
     *                    using CMTimeRangeGetEnd on each to calculate the media TimeRange for -insertMediaTimeRange:intoTimeRange:.
     * 
     *                    It's safe for multiple threads to call this method on different tracks at once.
     */
    @Generated
    @Selector("appendSampleBuffer:decodeTime:presentationTime:error:")
    public native boolean appendSampleBufferDecodeTimePresentationTimeError(CMSampleBufferRef sampleBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outDecodeTime,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outPresentationTime,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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

    /**
     * @property       cleanApertureDimensions
     * @abstract       A CGSize indicating the clean aperture dimensions of the track.
     */
    @Generated
    @Selector("cleanApertureDimensions")
    @ByValue
    public native CGSize cleanApertureDimensions();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @property       encodedPixelsDimensions
     * @abstract       A CGSize indicating the dimensions encoded pixels dimensions of the track.
     */
    @Generated
    @Selector("encodedPixelsDimensions")
    @ByValue
    public native CGSize encodedPixelsDimensions();

    /**
     * @property       extendedLanguageTag
     * @abstract       The language tag associated with the track.
     * @discussion     The value of this property is an IETF BCP 47 (RFC 4646) language identifier indicating the language tag associated with the track; may be nil if no language tag is indicated.
     */
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    /**
     * @property       hasProtectedContent
     * @abstract       Whether a track contains protected content.
     * @discussion     The value of this property is a BOOL that indicates whether the track contains protected content.
     */
    @Generated
    @Selector("hasProtectedContent")
    public native boolean hasProtectedContent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMutableMovieTrack init();

    /**
     * @method			insertEmptyTimeRange:
     * @abstract		Adds an empty time range to the target track.
     * @param			timeRange
     * 				The time range to be made empty. Note that you cannot add empty time ranges to the end of a track.
     */
    @Generated
    @Selector("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * @method			insertMediaTimeRange:intoTimeRange:
     * @abstract		Inserts a reference to a media time range into a track.
     * @param			mediaTimeRange
     * 				The presentation time range of the media to be inserted.
     * @param			trackTimeRange
     * 				The time range of the track into which the media is to be inserted.
     *    @result			A BOOL value indicating the success of the operation.
     * @discussion
     *                    Use this method after you have appended samples or sample references to a track's media.
     * 
     *                    To specify that the media time range be played at its natural rate, pass mediaTimeRange.duration == trackTimeRange.duration;
     *                    otherwise, the ratio between these is used to determine the playback rate.
     * 
     *                    Pass kCMTimeInvalid for trackTimeRange.start to indicate that the segment should be appended to the end of the track.
     */
    @Generated
    @Selector("insertMediaTimeRange:intoTimeRange:")
    public native boolean insertMediaTimeRangeIntoTimeRange(@ByValue CMTimeRange mediaTimeRange,
            @ByValue CMTimeRange trackTimeRange);

    /**
     * @method			insertTimeRange:ofTrack:atTime:copySampleData:error:
     * @abstract		Inserts a portion of an AVAssetTrack object into the target movie.
     * @param			timeRange
     * 				The time range from the track from which media is to be inserted.
     * @param			track
     * 				An AVAssetTrack object indicating the source of the inserted media. Only AVAssetTracks of AVURLAssets and AVCompositions are supported.
     * 				Must not be nil.
     * @param			startTime
     * 				The time in the target track at which the media is to be inserted.
     * @param			copySampleData
     *                    A BOOL value that indicates whether sample data is to be copied from the source to the destination during edits.
     * 				If YES, the sample data is written to the file specified by the track property mediaDataStorage if non-nil,
     * 				or else by the movie property defaultMediaDataStorage if non-nil; if both are nil, the method will fail and return NO.
     * 				If NO, sample data will not be written and sample references to the samples in their original container will be added
     * 				as necessary. Note that in this case, this method will fail if the original samples are fragmented.
     * @param			outError
     * 				If the insertion fails, describes the nature of the failure.
     * @result			A BOOL value that indicates the success of the insertion.
     */
    @Generated
    @Selector("insertTimeRange:ofTrack:atTime:copySampleData:error:")
    public native boolean insertTimeRangeOfTrackAtTimeCopySampleDataError(@ByValue CMTimeRange timeRange,
            AVAssetTrack track, @ByValue CMTime startTime, boolean copySampleData,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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

    /**
     * @property       enabled
     * @abstract       A BOOL value indicating whether the track is enabled by default for presentation.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * @property       modified
     * @abstract       Whether a track has been modified.
     * @discussion     The value of this property is a BOOL that indicates whether the AVMutableMovieTrack object has been modified since it was created, was last written, or had its modified state cleared via a call to setModified:NO.
     */
    @Generated
    @Selector("isModified")
    public native boolean isModified();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * @property       languageCode
     * @abstract       The language associated with the track.
     * @discussion     The value of this property is an ISO 639-2/T language code indicating the language associated with the track; may be nil if no language is indicated.
     */
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    /**
     * @property       layer
     * @abstract       The layer level of the visual media data of the track.
     */
    @Generated
    @Selector("layer")
    @NInt
    public native long layer();

    /**
     * @property       mediaDataStorage
     * @abstract       The storage container for media data added to a track.
     * @discussion     The value of this property is an AVMediaDataStorage object that indicates the location at which media data inserted or appended to the track will be written.
     */
    @Generated
    @Selector("mediaDataStorage")
    public native AVMediaDataStorage mediaDataStorage();

    /**
     * @property       metadata
     * @abstract       A collection of metadata stored by the track.
     * @discussion     The value of this property is an array of AVMetadataItem objects representing the collection of metadata stored by the track.
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * @property       naturalSize
     * @abstract       A CGSize indicating the dimensions at which the visual media data of the track should be displayed.
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @property		preferredMediaChunkAlignment
     * @abstract		For file types that support media chunk alignment, the boundary for media chunk alignment (in bytes).
     * 
     * @discussion		The default value is 0, which means that no padding should be used to achieve chunk alignment. It is an error to set a negative value for chunk alignment.
     */
    @Generated
    @Selector("preferredMediaChunkAlignment")
    @NInt
    public native long preferredMediaChunkAlignment();

    /**
     * @property		preferredMediaChunkDuration
     * @abstract		For file types that support media chunk durations, the maximum duration to be used for each chunk of sample data written to the file.
     * 
     * @discussion		The total duration of the samples in a chunk will be no greater than this preferred chunk duration, or the duration of a single sample if the sample's duration is greater than this preferred chunk duration.
     * 
     * 				The default media chunk duration is 1.0 second. It is an error to set a chunk duration that is negative or non-numeric.
     */
    @Generated
    @Selector("preferredMediaChunkDuration")
    @ByValue
    public native CMTime preferredMediaChunkDuration();

    /**
     * @property       preferredMediaChunkSize
     * @abstract       For file types that support media chunk sizes, the maximum size (in bytes) to be used for each chunk of sample data written to the file.
     * @discussion		The total size of the samples in a chunk will be no larger than this preferred chunk size, or the size of a single sample if the sample is larger than this preferred chunk size.
     * 
     * 				The default media chunk size is 1024 * 1024 bytes. It is an error to set a negative chunk size.
     */
    @Generated
    @Selector("preferredMediaChunkSize")
    @NInt
    public native long preferredMediaChunkSize();

    /**
     * @property       preferredTransform
     * @abstract       A CGAffineTransform indicating the transform specified in the track's storage container as the preferred transformation of the visual media data for display purposes; the value is often but not always CGAffineTransformIdentity.
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * @property       preferredVolume
     * @abstract       The preferred volume of the audible media data of the track; often but not always 1.0.
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * @property       productionApertureDimensions
     * @abstract       A CGSize indicating the production aperture dimensions of the track.
     */
    @Generated
    @Selector("productionApertureDimensions")
    @ByValue
    public native CGSize productionApertureDimensions();

    /**
     * @method			removeTimeRange:
     * @abstract		Removes a specified time range from a track.
     * @param			timeRange
     * 				The time range to be removed.
     */
    @Generated
    @Selector("removeTimeRange:")
    public native void removeTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * @method			removeTrackAssociationToTrack:type:
     * @abstract		Removes a track association of a specific type between two tracks.
     * @param			movieTrack
     * 				An AVMovieTrack object that is associated with the receiver.
     * @param			trackAssociationType
     * 				The type of track association to remove between the receiver and the specified movieTrack (for instance, AVTrackAssociationTypeChapterList).
     */
    @Generated
    @Selector("removeTrackAssociationToTrack:type:")
    public native void removeTrackAssociationToTrackType(AVMovieTrack movieTrack, String trackAssociationType);

    /**
     * @method			replaceFormatDescription:withFormatDescription:
     * @abstract		Replaces one of the receiver's format descriptions with another format description
     * @param			formatDescription
     * 				A CMFormatDescription occurring in the array returned by the -formatDescriptions method.
     * @param			newFormatDescription
     * 				A CMFormatDescription to replace the specified format description.
     * @discussion     You can use this method to make surgical changes to a track's format descriptions, such as adding format description extensions to a format description or changing the audio channel layout of an audio track. You should note that a format description can have extensions of type kCMFormatDescriptionExtension_VerbatimSampleDescription and kCMFormatDescriptionExtension_VerbatimISOSampleEntry; if you modify a copy of a format description, you should delete those extensions from the copy or your changes might be ignored.
     * 
     * 				An NSInvalidArgumentException will be thrown if the media type of the new format description does not match the media type of the receiver.
     */
    @Generated
    @Selector("replaceFormatDescription:withFormatDescription:")
    public native void replaceFormatDescriptionWithFormatDescription(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef newFormatDescription);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @property       sampleReferenceBaseURL
     * @abstract       For file types that support writing sample references, such as QuickTime Movie files, specifies the base URL that sample references are relative to; may be nil.
     * @discussion     If the value of this property can be resolved as an absolute URL, the sample locations written to the file when appending sample references to this track will be relative to this URL. The URL must point to a location contained by any common parent directory of the locations that will be referenced. For example, setting the sampleReferenceBaseURL property to "file:///Users/johnappleseed/Movies/" and appending sample buffers that refer to "file:///Users/johnappleseed/Movies/data/movie1.mov" will cause the sample reference "data/movie1.mov" to be written to the movie file.
     * 
     * 	If the value of the property cannot be resolved as an absolute URL or if it points to a location that is not contained by any common parent directory of the locations that will be referenced, the location will be written unmodified.
     * 
     * 	The default value is nil, which means that the location will be written unmodified.
     */
    @Generated
    @Selector("sampleReferenceBaseURL")
    public native NSURL sampleReferenceBaseURL();

    /**
     * @method			scaleTimeRange:toDuration:
     * @abstract		Changes the duration of a time range of a track.
     * @param			timeRange
     * 				The time range to be scaled.
     * @param			duration
     * 				The new duration of the time range.
     */
    @Generated
    @Selector("scaleTimeRange:toDuration:")
    public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange, @ByValue CMTime duration);

    /**
     * @property       alternateGroupID
     * @abstract       An integer indicating the track as a member of a particular alternate group.
     */
    @Generated
    @Selector("setAlternateGroupID:")
    public native void setAlternateGroupID(@NInt long value);

    /**
     * @property       cleanApertureDimensions
     * @abstract       A CGSize indicating the clean aperture dimensions of the track.
     */
    @Generated
    @Selector("setCleanApertureDimensions:")
    public native void setCleanApertureDimensions(@ByValue CGSize value);

    /**
     * @property       enabled
     * @abstract       A BOOL value indicating whether the track is enabled by default for presentation.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * @property       encodedPixelsDimensions
     * @abstract       A CGSize indicating the dimensions encoded pixels dimensions of the track.
     */
    @Generated
    @Selector("setEncodedPixelsDimensions:")
    public native void setEncodedPixelsDimensions(@ByValue CGSize value);

    /**
     * @property       extendedLanguageTag
     * @abstract       The language tag associated with the track.
     * @discussion     The value of this property is an IETF BCP 47 (RFC 4646) language identifier indicating the language tag associated with the track; may be nil if no language tag is indicated.
     */
    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    /**
     * @property       languageCode
     * @abstract       The language associated with the track.
     * @discussion     The value of this property is an ISO 639-2/T language code indicating the language associated with the track; may be nil if no language is indicated.
     */
    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

    /**
     * @property       layer
     * @abstract       The layer level of the visual media data of the track.
     */
    @Generated
    @Selector("setLayer:")
    public native void setLayer(@NInt long value);

    /**
     * @property       mediaDataStorage
     * @abstract       The storage container for media data added to a track.
     * @discussion     The value of this property is an AVMediaDataStorage object that indicates the location at which media data inserted or appended to the track will be written.
     */
    @Generated
    @Selector("setMediaDataStorage:")
    public native void setMediaDataStorage(AVMediaDataStorage value);

    /**
     * @property       metadata
     * @abstract       A collection of metadata stored by the track.
     * @discussion     The value of this property is an array of AVMetadataItem objects representing the collection of metadata stored by the track.
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * @property       modified
     * @abstract       Whether a track has been modified.
     * @discussion     The value of this property is a BOOL that indicates whether the AVMutableMovieTrack object has been modified since it was created, was last written, or had its modified state cleared via a call to setModified:NO.
     */
    @Generated
    @Selector("setModified:")
    public native void setModified(boolean value);

    /**
     * @property       naturalSize
     * @abstract       A CGSize indicating the dimensions at which the visual media data of the track should be displayed.
     */
    @Generated
    @Selector("setNaturalSize:")
    public native void setNaturalSize(@ByValue CGSize value);

    /**
     * @property		preferredMediaChunkAlignment
     * @abstract		For file types that support media chunk alignment, the boundary for media chunk alignment (in bytes).
     * 
     * @discussion		The default value is 0, which means that no padding should be used to achieve chunk alignment. It is an error to set a negative value for chunk alignment.
     */
    @Generated
    @Selector("setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@NInt long value);

    /**
     * @property		preferredMediaChunkDuration
     * @abstract		For file types that support media chunk durations, the maximum duration to be used for each chunk of sample data written to the file.
     * 
     * @discussion		The total duration of the samples in a chunk will be no greater than this preferred chunk duration, or the duration of a single sample if the sample's duration is greater than this preferred chunk duration.
     * 
     * 				The default media chunk duration is 1.0 second. It is an error to set a chunk duration that is negative or non-numeric.
     */
    @Generated
    @Selector("setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByValue CMTime value);

    /**
     * @property       preferredMediaChunkSize
     * @abstract       For file types that support media chunk sizes, the maximum size (in bytes) to be used for each chunk of sample data written to the file.
     * @discussion		The total size of the samples in a chunk will be no larger than this preferred chunk size, or the size of a single sample if the sample is larger than this preferred chunk size.
     * 
     * 				The default media chunk size is 1024 * 1024 bytes. It is an error to set a negative chunk size.
     */
    @Generated
    @Selector("setPreferredMediaChunkSize:")
    public native void setPreferredMediaChunkSize(@NInt long value);

    /**
     * @property       preferredTransform
     * @abstract       A CGAffineTransform indicating the transform specified in the track's storage container as the preferred transformation of the visual media data for display purposes; the value is often but not always CGAffineTransformIdentity.
     */
    @Generated
    @Selector("setPreferredTransform:")
    public native void setPreferredTransform(@ByValue CGAffineTransform value);

    /**
     * @property       preferredVolume
     * @abstract       The preferred volume of the audible media data of the track; often but not always 1.0.
     */
    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    /**
     * @property       productionApertureDimensions
     * @abstract       A CGSize indicating the production aperture dimensions of the track.
     */
    @Generated
    @Selector("setProductionApertureDimensions:")
    public native void setProductionApertureDimensions(@ByValue CGSize value);

    /**
     * @property       sampleReferenceBaseURL
     * @abstract       For file types that support writing sample references, such as QuickTime Movie files, specifies the base URL that sample references are relative to; may be nil.
     * @discussion     If the value of this property can be resolved as an absolute URL, the sample locations written to the file when appending sample references to this track will be relative to this URL. The URL must point to a location contained by any common parent directory of the locations that will be referenced. For example, setting the sampleReferenceBaseURL property to "file:///Users/johnappleseed/Movies/" and appending sample buffers that refer to "file:///Users/johnappleseed/Movies/data/movie1.mov" will cause the sample reference "data/movie1.mov" to be written to the movie file.
     * 
     * 	If the value of the property cannot be resolved as an absolute URL or if it points to a location that is not contained by any common parent directory of the locations that will be referenced, the location will be written unmodified.
     * 
     * 	The default value is nil, which means that the location will be written unmodified.
     */
    @Generated
    @Selector("setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL value);

    /**
     * @property       timescale
     * @abstract       For file types that contain a 'moov' atom, such as QuickTime Movie files, specifies the time scale of the track's media.
     * @discussion		The default media time scale is 0.
     * 
     * 				This property should be set on a new empty track before any edits are performed on the track.
     */
    @Generated
    @Selector("setTimescale:")
    public native void setTimescale(int value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * @property       timescale
     * @abstract       For file types that contain a 'moov' atom, such as QuickTime Movie files, specifies the time scale of the track's media.
     * @discussion		The default media time scale is 0.
     * 
     * 				This property should be set on a new empty track before any edits are performed on the track.
     */
    @Generated
    @Selector("timescale")
    public native int timescale();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}