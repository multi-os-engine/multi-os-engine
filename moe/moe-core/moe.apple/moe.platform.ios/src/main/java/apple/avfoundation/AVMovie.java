package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMovie extends AVAsset implements NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMovie(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] URL
     * 
     * The URL with which the instance of AVMovie was initialized; may be nil.
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMovie alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMovie allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVMovie assetWithURL(@NotNull NSURL URL);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] canContainMovieFragments
     * 
     * Indicates whether the movie file is capable of being extended by fragments.
     * 
     * The value of this property is YES if an 'mvex' box is present in the 'moov' box. The 'mvex' box is necessary in
     * order to signal the possible presence of later 'moof' boxes.
     */
    @Generated
    @Selector("canContainMovieFragments")
    public native boolean canContainMovieFragments();

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

    /**
     * [@property] containsMovieFragments
     * 
     * Indicates whether the movie file is extended by at least one movie fragment.
     * 
     * The value of this property is YES if canContainMovieFragments is YES and at least one 'moof' box is present after
     * the 'moov' box.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("containsMovieFragments")
    public native boolean containsMovieFragments();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] data
     * 
     * The data block with which the instance of AVMovie was initialized; may be nil.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] defaultMediaDataStorage
     * 
     * The default storage container for media data added to a movie.
     * 
     * The value of this property is an AVMediaDataStorage object that indicates where sample data that is added to a
     * movie should be written by default.
     * 
     * API-Since: 13.0
     */
    @Nullable
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
    public native AVMovie init();

    /**
     * initWithData:options:
     * 
     * Creates an AVMovie object from a movie header stored in an NSData object.
     * 
     * You can use this method to operate on movie headers that are not stored in files. In general you should avoid
     * loading an entire movie file with its media data into an instance of NSData!
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage
     * property will be nil. If you want to create an AVMutableMovie from an NSData object and then append sample
     * buffers to any of its tracks, you must first set one of these properties to indicate where the sample data should
     * be written.
     * 
     * API-Since: 13.0
     * 
     * @param data
     *                An NSData object containing a movie header.
     * @param options
     *                An NSDictionary object that contains keys for specifying options for the initialization of the
     *                AVMovie object.
     * @return An AVMovie object
     */
    @Generated
    @Selector("initWithData:options:")
    public native AVMovie initWithDataOptions(@NotNull NSData data, @Nullable NSDictionary<String, ?> options);

    /**
     * initWithURL:options:
     * 
     * Creates an AVMovie object from a movie header stored in a QuickTime movie file or ISO base media file.
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage
     * property will be nil.
     * If you want to create an AVMutableMovie from a file and then append sample buffers to any of its tracks, you must
     * first set one of these properties
     * to indicate where the sample data should be written.
     * 
     * @param URL
     *                An NSURL object that specifies a file containing a movie header.
     * @param options
     *                An NSDictionary object that contains keys for specifying options for the initialization of the
     *                AVMovie object.
     * @return An AVMovie object
     */
    @Generated
    @Selector("initWithURL:options:")
    public native AVMovie initWithURLOptions(@NotNull NSURL URL, @Nullable NSDictionary<String, ?> options);

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
     * isCompatibleWithFileType:
     * 
     * Indicates whether a movie header for the AVMovie object can be created for the specified file type.
     * 
     * This method returns a BOOL that indicates whether a movie header of the specified type can be created for the
     * receiver. For example, this method returns NO if the movie contains tracks whose media types or media subtypes
     * are not allowed by the specified file type.
     * 
     * API-Since: 13.0
     * 
     * @param fileType
     *                 A UTI indicating a movie file format (e.g. AVFileTypeQuickTimeMovie for a QuickTime movie).
     */
    @Generated
    @Selector("isCompatibleWithFileType:")
    public native boolean isCompatibleWithFileType(@NotNull String fileType);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * movieHeaderWithFileType:error:
     * 
     * Creates an NSData object containing the movie header of the AVMovie object.
     * 
     * The movie header will be a pure reference movie, with no base URL, suitable for use on the pasteboard.
     * 
     * API-Since: 13.0
     * 
     * @param fileType
     *                 A UTI indicating the specific file format of the movie header (e.g. AVFileTypeQuickTimeMovie for
     *                 a QuickTime movie).
     * @param outError
     *                 If an error occurs reading the movie header, describes the nature of the failure.
     * @return An NSData object.
     */
    @Nullable
    @Generated
    @Selector("movieHeaderWithFileType:error:")
    public native NSData movieHeaderWithFileTypeError(@NotNull String fileType,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * movieTypes
     * 
     * Provides the file types the AVMovie class understands.
     * 
     * @return An NSArray of UTIs identifying the file types the AVMovie class understands.
     */
    @NotNull
    @Generated
    @Selector("movieTypes")
    public static native NSArray<String> movieTypes();

    /**
     * movieWithData:options:
     * 
     * Creates an AVMovie object from a movie header stored in an NSData object.
     * 
     * You can use this method to operate on movie headers that are not stored in files; this might include movie
     * headers on the pasteboard (which do not contain media data). In general you should avoid loading an entire movie
     * file with its media data into an instance of NSData! By default, the defaultMediaDataStorage property will be nil
     * and each associated AVMovieTrack's mediaDataStorage property will be nil.
     * If you want to create an AVMutableMovie from an NSData object and then append sample buffers to any of its
     * tracks, you must first set one of these properties to indicate where the sample data should be written.
     * 
     * API-Since: 13.0
     * 
     * @param data
     *                An NSData object containing a movie header.
     * @param options
     *                An NSDictionary object that contains keys for specifying options for the initialization of the
     *                AVMovie object.
     * @return An AVMovie object
     */
    @Generated
    @Selector("movieWithData:options:")
    public static native AVMovie movieWithDataOptions(@NotNull NSData data, @Nullable NSDictionary<String, ?> options);

    /**
     * movieWithURL:options:
     * 
     * Creates an AVMovie object from a movie header stored in a QuickTime movie file or ISO base media file.
     * 
     * By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage
     * property will be nil.
     * If you want to create an AVMutableMovie from a file and then append sample buffers to any of its tracks, you must
     * first set one of these properties
     * to indicate where the sample data should be written.
     * 
     * @param URL
     *                An NSURL object that specifies a file containing a movie header.
     * @param options
     *                An NSDictionary object that contains keys for specifying options for the initialization of the
     *                AVMovie object.
     * @return An AVMovie object
     */
    @Generated
    @Selector("movieWithURL:options:")
    public static native AVMovie movieWithURLOptions(@NotNull NSURL URL, @Nullable NSDictionary<String, ?> options);

    @NotNull
    @Generated
    @Owned
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Owned
    @Selector("new")
    public static native AVMovie new_objc();

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

    /**
     * trackWithTrackID:
     * 
     * Provides an instance of AVMovieTrack that represents the track of the specified trackID.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * API-Since: 4.0
     * Deprecated-Since: 100000.0
     * 
     * @param trackID
     *                The trackID of the requested AVMovieTrack.
     * @return An instance of AVMovieTrack; may be nil if no track of the specified trackID is available.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("trackWithTrackID:")
    public native AVMovieTrack trackWithTrackID(int trackID);

    /**
     * [@property] tracks
     * 
     * The tracks in a movie.
     * 
     * The value of this property is an array of tracks the movie contains; the tracks are of type AVMovieTrack.
     */
    @NotNull
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVMovieTrack> tracks();

    /**
     * tracksWithMediaCharacteristic:
     * 
     * Provides an array of AVMovieTracks of the asset that present media with the specified characteristic.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * API-Since: 4.0
     * Deprecated-Since: 100000.0
     * 
     * @param mediaCharacteristic
     *                            The media characteristic according to which the receiver filters its AVMovieTracks.
     *                            (Media characteristics are defined in AVMediaFormat.h)
     * @return An NSArray of AVMovieTracks; may be empty if no tracks with the specified characteristic are available.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVMovieTrack> tracksWithMediaCharacteristic(@NotNull String mediaCharacteristic);

    /**
     * tracksWithMediaType:
     * 
     * Provides an array of AVMovieTracks of the asset that present media of the specified media type.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * API-Since: 4.0
     * Deprecated-Since: 100000.0
     * 
     * @param mediaType
     *                  The media type according to which the receiver filters its AVMovieTracks. (Media types are
     *                  defined in AVMediaFormat.h)
     * @return An NSArray of AVMovieTracks; may be empty if no tracks of the specified media type are available.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVMovieTrack> tracksWithMediaType(@NotNull String mediaType);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * writeMovieHeaderToURL:fileType:options:error:
     * 
     * Writes the movie header to a destination URL.
     * 
     * Note that modifications to instances of AVMutableMovie, to their constituent AVMutableMovieTracks, or to their
     * collections of metadata are committed to storage when their movie headers are written.
     * 
     * API-Since: 13.0
     * 
     * @param URL
     *                 An NSURL object indicating where to write the movie header.
     * @param fileType
     *                 A UTI indicating the specific file format (e.g. AVFileTypeQuickTimeMovie for a QuickTime movie).
     * @param options
     *                 An NSUInteger whose bits specify options for the writing of the movie header. See
     *                 AVMovieWritingOptions above.
     * @param outError
     *                 If an error occurs writing the movie header, describes the nature of the failure.
     */
    @Generated
    @Selector("writeMovieHeaderToURL:fileType:options:error:")
    public native boolean writeMovieHeaderToURLFileTypeOptionsError(@NotNull NSURL URL, @NotNull String fileType,
            @NUInt long options, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * loadTrackWithTrackID:completionHandler:
     * 
     * Loads an instance of AVMovieTrack that represents the track of the specified trackID.
     * 
     * @param trackID
     *                          The trackID of the requested AVMovieTrack.
     * @param completionHandler
     *                          A block that is called when the loading is finished, with either the loaded track (which
     *                          may be nil if no track of the specified trackID is available) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadTrackWithTrackID:completionHandler:")
    public native void loadTrackWithTrackIDCompletionHandler(int trackID,
            @NotNull @ObjCBlock(name = "call_loadTrackWithTrackIDCompletionHandler") Block_loadTrackWithTrackIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTrackWithTrackIDCompletionHandler {
        @Generated
        void call_loadTrackWithTrackIDCompletionHandler(@Nullable AVMovieTrack arg0, @Nullable NSError arg1);
    }

    /**
     * loadTracksWithMediaCharacteristic:completionHandler:
     * 
     * Loads an array of AVMovieTracks of the asset that present media with the specified characteristic.
     * 
     * @param mediaCharacteristic
     *                            The media characteristic according to which AVAsset filters its AVMovieTracks. (Media
     *                            characteristics are defined in AVMediaFormat.h.)
     * @param completionHandler
     *                            A block that is called when the loading is finished, with either the loaded tracks
     *                            (which may be empty if no tracks with the specified characteristic are available) or
     *                            an error.
     * 
     *                            API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristicCompletionHandler(@NotNull String mediaCharacteristic,
            @NotNull @ObjCBlock(name = "call_loadTracksWithMediaCharacteristicCompletionHandler") Block_loadTracksWithMediaCharacteristicCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaCharacteristicCompletionHandler {
        @Generated
        void call_loadTracksWithMediaCharacteristicCompletionHandler(@Nullable NSArray<? extends AVMovieTrack> arg0,
                @Nullable NSError arg1);
    }

    /**
     * loadTracksWithMediaType:completionHandler:
     * 
     * Loads an array of AVMovieTracks of the asset that present media of the specified media type.
     * 
     * @param mediaType
     *                          The media type according to which AVAsset filters its AVMovieTracks. (Media types are
     *                          defined in AVMediaFormat.h.)
     * @param completionHandler
     *                          A block that is called when the loading is finished, with either the loaded tracks
     *                          (which may be empty if no tracks of the specified media type are available) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaTypeCompletionHandler(@NotNull String mediaType,
            @NotNull @ObjCBlock(name = "call_loadTracksWithMediaTypeCompletionHandler") Block_loadTracksWithMediaTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaTypeCompletionHandler {
        @Generated
        void call_loadTracksWithMediaTypeCompletionHandler(@Nullable NSArray<? extends AVMovieTrack> arg0,
                @Nullable NSError arg1);
    }
}
