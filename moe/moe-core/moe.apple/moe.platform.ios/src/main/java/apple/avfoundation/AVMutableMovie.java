package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSLocale;
import apple.corefoundation.struct.CGAffineTransform;

/**
 * AVMutableMovie
 * 
 * AVMutableMovie adds to its immutable superclass, AVMovie, several categories of methods for editing QuickTime movie
 * files, e.g. inserting and removing time ranges of media, adding and removing tracks, and modifying the metadata
 * collections stored therein.
 * 
 * By default, after creating an AVMutableMovie the defaultMediaDataStorage property will be nil and each associated
 * AVMutableMovieTrack's mediaDataStorage property will be nil. If you want to create an AVMutableMovie from a file and
 * then append sample buffers to any of its tracks, you must first set one of these properties to indicate where the
 * sample data should be written.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableMovie extends AVMovie {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableMovie(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addMutableTrackWithMediaType:copySettingsFromTrack:options:
     * 
     * Adds an empty track to the target movie.
     * 
     * The trackID of the newly added track is a property of the returned instance of AVMutableMovieTrack.
     * This method throws an exception if media type is not equal to the track's media type.
     * Note that metadata will not be automatically copied.
     * 
     * @param mediaType
     *                  The media type of the new track (e.g. AVMediaTypeVideo for a video track).
     * @param track
     *                  If you wish to transfer settings from an existing track, including width, height, preferred
     *                  volume, etc., pass a reference to an AVAssetTrack representing that track. Otherwise pass nil.
     * @param options
     *                  An NSDictionary object that contains keys for specifying options for the initialization of the
     *                  new AVMutableMovieTrack object. Pass nil for default initialization behavior.
     * @return An AVMutableMovieTrack object
     */
    @Generated
    @Selector("addMutableTrackWithMediaType:copySettingsFromTrack:options:")
    public native AVMutableMovieTrack addMutableTrackWithMediaTypeCopySettingsFromTrackOptions(String mediaType,
            AVAssetTrack track, NSDictionary<String, ?> options);

    /**
     * addMutableTracksCopyingSettingsFromTracks:options:
     * 
     * Adds one or more empty tracks to the target movie, copying track settings from the source tracks.
     * 
     * This method creates one or more empty tracks in the target movie and configures those tracks with settings (such
     * as track userdata and metadata, width, height, and preferred volume) copied from the source tracks in the
     * existingTracks array. Also, properties involving pairs of tracks (such as track references) are copied from the
     * source tracks to the target tracks.
     * 
     * @param existingTracks
     *                       An array of AVAssetTrack objects.
     * @param options
     *                       An NSDictionary object that contains keys for specifying options for the initialization of
     *                       the new AVMutableMovieTrack objects. Pass nil for default initialization behavior.
     * @return An array of AVMutableMovieTrack objects; the index of a track in this array is the same as the index of
     *         its source track in the existingTracks array.
     */
    @Generated
    @Selector("addMutableTracksCopyingSettingsFromTracks:options:")
    public native NSArray<? extends AVMutableMovieTrack> addMutableTracksCopyingSettingsFromTracksOptions(
            NSArray<? extends AVAssetTrack> existingTracks, NSDictionary<String, ?> options);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableMovie alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMutableMovie allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVMutableMovie assetWithURL(NSURL URL);

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

    /**
     * [@property] defaultMediaDataStorage
     * 
     * The default storage container for media data added to a movie.
     * 
     * The value of this property is an AVMediaDataStorage object that indicates where sample data that is added to a
     * movie should be written, for any track for whose mediaDataStorage property is nil.
     */
    @Generated
    @Selector("defaultMediaDataStorage")
    public native AVMediaDataStorage defaultMediaDataStorage();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMutableMovie init();

    @Generated
    @Selector("initWithData:options:")
    public native AVMutableMovie initWithDataOptions(NSData data, NSDictionary<String, ?> options);

    /**
     * initWithData:options:error:
     * 
     * Creates an AVMutableMovie object from a movie header stored in an NSData object.
     * 
     * You can use this method to operate on movie headers that are not stored in files. In general you should avoid
     * loading an entire movie file with its media data into an instance of NSData!
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMutableMovieTrack's
     * mediaDataStorage property will be nil. If you want to create an AVMutableMovie from an NSData object and then
     * append sample buffers to any of its tracks, you must first set one of these properties to indicate where the
     * sample data should be written.
     * 
     * @param data
     *                 An NSData object containing a movie header.
     * @param options
     *                 An NSDictionary object that contains keys for specifying options for the initialization of the
     *                 AVMutableMovie object.
     * @param outError
     *                 If an error occurs creating a movie, describes the nature of the failure.
     * @return An AVMutableMovie object
     */
    @Generated
    @Selector("initWithData:options:error:")
    public native AVMutableMovie initWithDataOptionsError(NSData data, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initWithSettingsFromMovie:options:error:
     * 
     * Creates an AVMutableMovie object without tracks (and therefore without media).
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage
     * property will be nil.
     * If you want to create an AVMutableMovie from an NSData object and then append sample buffers to any of its
     * tracks, you must first set one of these properties to indicate where the sample data should be written.
     * 
     * @param movie
     *                 If you wish to transfer settings from an existing movie (including movie userdata and metadata,
     *                 preferred rate, preferred volume, etc.), pass a reference to an AVMovie object representing that
     *                 movie. Otherwise pass nil. The userdata and metadata from the source movie may need to be
     *                 converted if the format of that movie differs from fileType; you may wish to inspect the userdata
     *                 or metadata of the receiver to ensure that important data was copied.
     * @param options
     *                 An NSDictionary object that contains keys for specifying options for the initialization of the
     *                 AVMutableMovie object. Pass nil for default initialization behavior.
     * @param outError
     *                 If an error occurs creating a movie, describes the nature of the failure.
     * @return An AVMutableMovie object
     */
    @Generated
    @Selector("initWithSettingsFromMovie:options:error:")
    public native AVMutableMovie initWithSettingsFromMovieOptionsError(AVMovie movie, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("initWithURL:options:")
    public native AVMutableMovie initWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    /**
     * initWithURL:options:error:
     * 
     * Creates an AVMutableMovie object from a movie header stored in a QuickTime movie file or ISO base media file.
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMutableMovieTrack's
     * mediaDataStorage property will be nil.
     * If you want to create an AVMutableMovie from a file and then append sample buffers to any of its tracks, you must
     * first set one of these properties
     * to indicate where the sample data should be written.
     * 
     * @param URL
     *                 An NSURL object that specifies a file containing a movie header.
     * @param options
     *                 An NSDictionary object that contains keys for specifying options for the initialization of the
     *                 AVMutableMovie object.
     * @param outError
     *                 If an error occurs creating a movie, describes the nature of the failure.
     * @return An AVMutableMovie object
     */
    @Generated
    @Selector("initWithURL:options:error:")
    public native AVMutableMovie initWithURLOptionsError(NSURL URL, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * insertEmptyTimeRange:
     * 
     * Adds an empty time range to the target movie.
     * 
     * @param timeRange
     *                  The time range to be made empty. Note that you cannot add empty time ranges to the end of a
     *                  movie.
     */
    @Generated
    @Selector("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * insertTimeRange:ofAsset:atTime:copySampleData:error:
     * 
     * Inserts all the tracks of a timeRange of an asset into a movie.
     * 
     * This method may add new tracks to the target movie to ensure that all tracks of the asset are represented in the
     * inserted timeRange.
     * Existing content at the specified startTime will be pushed out by the duration of timeRange.
     * Note that metadata will not be automatically copied.
     * 
     * @param timeRange
     *                       The time range of the asset to be inserted.
     * @param asset
     *                       An AVAsset object indicating the source of the inserted media. Only instances of AVURLAsset
     *                       and AVComposition are supported.
     *                       Must not be nil.
     * @param startTime
     *                       The time in the target movie at which the media is to be inserted.
     * @param copySampleData
     *                       A BOOL value that indicates whether sample data is to be copied from the source to the
     *                       destination during edits.
     *                       If YES, the sample data is written to the location specified by the track property
     *                       mediaDataStorage if non-nil,
     *                       or else by the movie property defaultMediaDataStorage if non-nil; if both are nil, the
     *                       method will fail and return NO.
     *                       If NO, sample data will not be written and sample references to the samples in their
     *                       original container will be added as necessary.
     *                       Note that in this case, this method will fail if the source AVAsset is not able to provide
     *                       sample reference information for the original container.
     * @param outError
     *                       If the insertion fails, an NSError object that describes the nature of the failure.
     * @return A BOOL value that indicates the success of the insertion.
     */
    @Generated
    @Selector("insertTimeRange:ofAsset:atTime:copySampleData:error:")
    public native boolean insertTimeRangeOfAssetAtTimeCopySampleDataError(@ByValue CMTimeRange timeRange, AVAsset asset,
            @ByValue CMTime startTime, boolean copySampleData,
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
     * [@property] interleavingPeriod
     * 
     * A CMTime that indicates the duration for interleaving runs of samples of each track.
     * 
     * The default interleaving period is 0.5 seconds.
     */
    @Generated
    @Selector("interleavingPeriod")
    @ByValue
    public native CMTime interleavingPeriod();

    /**
     * [@property] modified
     * 
     * Whether a movie has been modified.
     * 
     * The value of this property is a BOOL that indicates whether the AVMutableMovie object has been modified since it
     * was created, was last written, or had its modified state cleared via a call to setModified:NO.
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
     * [@property] metadata
     * 
     * A collection of metadata stored by the movie.
     * 
     * The value of this property is an array of AVMetadataItem objects representing the collection of metadata stored
     * by the movie.
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    @Generated
    @Selector("movieTypes")
    public static native NSArray<String> movieTypes();

    @Generated
    @Selector("movieWithData:options:")
    public static native AVMutableMovie movieWithDataOptions(NSData data, NSDictionary<String, ?> options);

    /**
     * movieWithData:options:error:
     * 
     * Creates an AVMutableMovie object from a movie header stored in an NSData object.
     * 
     * You can use this method to operate on movie headers that are not stored in files. In general you should avoid
     * loading an entire movie file with its media data into an instance of NSData!
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMutableMovieTrack's
     * mediaDataStorage property will be nil. If you want to create an AVMutableMovie from an NSData object and then
     * append sample buffers to any of its tracks, you must first set one of these properties to indicate where the
     * sample data should be written.
     * 
     * API-Since: 13.0
     * 
     * @param data
     *                 An NSData object containing a movie header.
     * @param options
     *                 An NSDictionary object that contains keys for specifying options for the initialization of the
     *                 AVMutableMovie object.
     * @param outError
     *                 If an error occurs creating a movie, describes the nature of the failure.
     * @return An AVMutableMovie object
     */
    @Generated
    @Selector("movieWithData:options:error:")
    public static native AVMutableMovie movieWithDataOptionsError(NSData data, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * movieWithSettingsFromMovie:options:error:
     * 
     * Creates an AVMutableMovie object without tracks (and therefore without media).
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage
     * property will be nil.
     * If you want to create an AVMutableMovie from an NSData object and then append sample buffers to any of its
     * tracks, you must first set one of these properties to indicate where the sample data should be written.
     * 
     * @param movie
     *                 If you wish to transfer settings from an existing movie (including movie userdata and metadata,
     *                 preferred rate, preferred volume, etc.), pass a reference to an AVMovie object representing that
     *                 movie. Otherwise pass nil. The userdata and metadata from the source movie may need to be
     *                 converted if the format of that movie differs from fileType; you may wish to inspect the userdata
     *                 or metadata of the receiver to ensure that important data was copied.
     * @param options
     *                 An NSDictionary object that contains keys for specifying options for the initialization of the
     *                 AVMutableMovie object. Pass nil for default initialization behavior.
     * @param outError
     *                 If an error occurs creating a movie, describes the nature of the failure.
     * @return An AVMutableMovie object
     */
    @Generated
    @Selector("movieWithSettingsFromMovie:options:error:")
    public static native AVMutableMovie movieWithSettingsFromMovieOptionsError(AVMovie movie,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("movieWithURL:options:")
    public static native AVMutableMovie movieWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    /**
     * movieWithURL:options:error:
     * 
     * Creates an AVMutableMovie object from a movie header stored in a QuickTime movie file or ISO base media file.
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMutableMovieTrack's
     * mediaDataStorage property will be nil.
     * If you want to create an AVMutableMovie from a file and then append sample buffers to any of its tracks, you must
     * first set one of these properties
     * to indicate where the sample data should be written.
     * 
     * @param URL
     *                 An NSURL object that specifies a file containing a movie header.
     * @param options
     *                 An NSDictionary object that contains keys for specifying options for the initialization of the
     *                 AVMutableMovie object.
     * @param outError
     *                 If an error occurs creating a movie, describes the nature of the failure.
     * @return An AVMutableMovie object
     */
    @Generated
    @Selector("movieWithURL:options:error:")
    public static native AVMutableMovie movieWithURLOptionsError(NSURL URL, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * mutableTrackCompatibleWithTrack:
     * 
     * Provides a reference to a track of a mutable movie into which any time range of an AVAssetTrack
     * can be inserted (via -[AVMutableMovieTrack insertTimeRange:ofTrack:atTime:copySampleData:error:]).
     * 
     * For best performance, the number of tracks in a movie should be kept to a minimum, corresponding to the
     * number for which media data must be presented in parallel. If media data of the same type is to be presented
     * serially, even from multiple assets, a single track of that media type should be used. This method,
     * -mutableTrackCompatibleWithTrack:, can help the client to identify an existing target track for an insertion.
     * 
     * @param track
     *              A reference to the AVAssetTrack from which a time range may be inserted.
     * @return An AVMutableMovieTrack that can accommodate the insertion.
     *         If no such track is available, the result is nil. A new track of the same media type
     *         as the AVAssetTrack can be created via -addMutableTrackWithMediaType:copySettingsFromTrack:options:,
     *         and this new track will be compatible.
     */
    @Generated
    @Selector("mutableTrackCompatibleWithTrack:")
    public native AVMutableMovieTrack mutableTrackCompatibleWithTrack(AVAssetTrack track);

    @Generated
    @Owned
    @Selector("new")
    public static native AVMutableMovie new_objc();

    /**
     * [@property] preferredRate
     * 
     * The natural rate at which the movie is to be played; often but not always 1.0.
     */
    @Generated
    @Selector("preferredRate")
    public native float preferredRate();

    /**
     * [@property] preferredTransform
     * 
     * A CGAffineTransform indicating the transform specified in the movie's storage container as the preferred
     * transformation of the visual media data for display purposes; the value is often but not always
     * CGAffineTransformIdentity.
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * [@property] preferredVolume
     * 
     * The preferred volume of the audible media data of the movie; often but not always 1.0.
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * removeTimeRange:
     * 
     * Removes a specified time range from a movie.
     * 
     * @param timeRange
     *                  The time range to be removed.
     */
    @Generated
    @Selector("removeTimeRange:")
    public native void removeTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * removeTrack:
     * 
     * Removes a track from the target movie.
     * 
     * @param track
     *              The track to be removed.
     */
    @Generated
    @Selector("removeTrack:")
    public native void removeTrack(AVMovieTrack track);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * scaleTimeRange:toDuration:
     * 
     * Changes the duration of a time range of a movie.
     * 
     * @param timeRange
     *                  The time range to be scaled.
     * @param duration
     *                  The new duration of the time range.
     */
    @Generated
    @Selector("scaleTimeRange:toDuration:")
    public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange, @ByValue CMTime duration);

    /**
     * [@property] defaultMediaDataStorage
     * 
     * The default storage container for media data added to a movie.
     * 
     * The value of this property is an AVMediaDataStorage object that indicates where sample data that is added to a
     * movie should be written, for any track for whose mediaDataStorage property is nil.
     */
    @Generated
    @Selector("setDefaultMediaDataStorage:")
    public native void setDefaultMediaDataStorage(AVMediaDataStorage value);

    /**
     * [@property] interleavingPeriod
     * 
     * A CMTime that indicates the duration for interleaving runs of samples of each track.
     * 
     * The default interleaving period is 0.5 seconds.
     */
    @Generated
    @Selector("setInterleavingPeriod:")
    public native void setInterleavingPeriod(@ByValue CMTime value);

    /**
     * [@property] metadata
     * 
     * A collection of metadata stored by the movie.
     * 
     * The value of this property is an array of AVMetadataItem objects representing the collection of metadata stored
     * by the movie.
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * [@property] modified
     * 
     * Whether a movie has been modified.
     * 
     * The value of this property is a BOOL that indicates whether the AVMutableMovie object has been modified since it
     * was created, was last written, or had its modified state cleared via a call to setModified:NO.
     */
    @Generated
    @Selector("setModified:")
    public native void setModified(boolean value);

    /**
     * [@property] preferredRate
     * 
     * The natural rate at which the movie is to be played; often but not always 1.0.
     */
    @Generated
    @Selector("setPreferredRate:")
    public native void setPreferredRate(float value);

    /**
     * [@property] preferredTransform
     * 
     * A CGAffineTransform indicating the transform specified in the movie's storage container as the preferred
     * transformation of the visual media data for display purposes; the value is often but not always
     * CGAffineTransformIdentity.
     */
    @Generated
    @Selector("setPreferredTransform:")
    public native void setPreferredTransform(@ByValue CGAffineTransform value);

    /**
     * [@property] preferredVolume
     * 
     * The preferred volume of the audible media data of the movie; often but not always 1.0.
     */
    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    /**
     * [@property] timescale
     * 
     * For file types that contain a 'moov' atom, such as QuickTime Movie files, specifies the time scale of the movie.
     * 
     * The default movie time scale is 600. In certain cases, you may want to set this to a different value. For
     * instance, a movie that
     * contains a single audio track should typically have the movie time scale set to the media time scale of that
     * track.
     * 
     * This property should be set on a new empty movie before any edits are performed on the movie.
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
     * [@property] timescale
     * 
     * For file types that contain a 'moov' atom, such as QuickTime Movie files, specifies the time scale of the movie.
     * 
     * The default movie time scale is 600. In certain cases, you may want to set this to a different value. For
     * instance, a movie that
     * contains a single audio track should typically have the movie time scale set to the media time scale of that
     * track.
     * 
     * This property should be set on a new empty movie before any edits are performed on the movie.
     */
    @Generated
    @Selector("timescale")
    public native int timescale();

    /**
     * trackWithTrackID:
     * 
     * Provides an instance of AVMutableMovieTrack that represents the track of the specified trackID.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param trackID
     *                The trackID of the requested AVMutableMovieTrack.
     * @return An instance of AVMutableMovieTrack; may be nil if no track of the specified trackID is available.
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVMutableMovieTrack trackWithTrackID(int trackID);

    /**
     * [@property] tracks
     * 
     * The tracks in a mutable movie.
     * 
     * The value of this property is an array of tracks the mutable movie contains; the tracks are of type
     * AVMutableMovieTrack.
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVMutableMovieTrack> tracks();

    /**
     * tracksWithMediaCharacteristic:
     * 
     * Provides an array of AVMutableMovieTracks of the asset that present media with the specified characteristic.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param mediaCharacteristic
     *                            The media characteristic according to which the receiver filters its
     *                            AVMutableMovieTracks. (Media characteristics are defined in AVMediaFormat.h)
     * @return An NSArray of AVMutableMovieTracks; may be empty if no tracks with the specified characteristic are
     *         available.
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVMutableMovieTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    /**
     * tracksWithMediaType:
     * 
     * Provides an array of AVMutableMovieTracks of the asset that present media of the specified media type.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param mediaType
     *                  The media type according to which the receiver filters its AVMutableMovieTracks. (Media types
     *                  are defined in AVMediaFormat.h)
     * @return An NSArray of AVMutableMovieTracks; may be empty if no tracks of the specified media type are available.
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVMutableMovieTrack> tracksWithMediaType(String mediaType);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * loadTrackWithTrackID:completionHandler:
     * 
     * Loads an instance of AVMutableMovieTrack that represents the track of the specified trackID.
     * 
     * @param trackID
     *                          The trackID of the requested AVMutableMovieTrack.
     * @param completionHandler
     *                          A block that is called when the loading is finished, with either the loaded track (which
     *                          may be nil if no track of the specified trackID is available) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadTrackWithTrackID:completionHandler:")
    public native void loadTrackWithTrackIDCompletionHandler(int trackID,
            @ObjCBlock(name = "call_loadTrackWithTrackIDCompletionHandler") Block_loadTrackWithTrackIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTrackWithTrackIDCompletionHandler {
        @Generated
        void call_loadTrackWithTrackIDCompletionHandler(AVMutableMovieTrack arg0, NSError arg1);
    }

    /**
     * loadTracksWithMediaCharacteristic:completionHandler:
     * 
     * Loads an array of AVMutableMovieTracks of the asset that present media with the specified characteristic.
     * 
     * @param mediaCharacteristic
     *                            The media characteristic according to which AVAsset filters its AVMutableMovieTracks.
     *                            (Media characteristics are defined in AVMediaFormat.h.)
     * @param completionHandler
     *                            A block that is called when the loading is finished, with either the loaded tracks
     *                            (which may be empty if no tracks with the specified characteristic are available) or
     *                            an error.
     * 
     *                            API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristicCompletionHandler(String mediaCharacteristic,
            @ObjCBlock(name = "call_loadTracksWithMediaCharacteristicCompletionHandler") Block_loadTracksWithMediaCharacteristicCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaCharacteristicCompletionHandler {
        @Generated
        void call_loadTracksWithMediaCharacteristicCompletionHandler(NSArray<? extends AVMutableMovieTrack> arg0,
                NSError arg1);
    }

    /**
     * loadTracksWithMediaType:completionHandler:
     * 
     * Loads an array of AVMutableMovieTracks of the asset that present media of the specified media type.
     * 
     * @param mediaType
     *                          The media type according to which AVAsset filters its AVMutableMovieTracks. (Media types
     *                          are defined in AVMediaFormat.h.)
     * @param completionHandler
     *                          A block that is called when the loading is finished, with either the loaded tracks
     *                          (which may be empty if no tracks of the specified media type are available) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaTypeCompletionHandler(String mediaType,
            @ObjCBlock(name = "call_loadTracksWithMediaTypeCompletionHandler") Block_loadTracksWithMediaTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaTypeCompletionHandler {
        @Generated
        void call_loadTracksWithMediaTypeCompletionHandler(NSArray<? extends AVMutableMovieTrack> arg0, NSError arg1);
    }

    @Generated
    @Selector("chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsBestMatchingPreferredLanguages(
            NSArray<String> preferredLanguages);

    @Generated
    @Selector("chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeys(
            NSLocale locale, NSArray<String> commonKeys);

    @Generated
    @Selector("mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup mediaSelectionGroupForMediaCharacteristic(String mediaCharacteristic);

    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(String format);

    @Generated
    @Selector("unusedTrackID")
    public native int unusedTrackID();
}
