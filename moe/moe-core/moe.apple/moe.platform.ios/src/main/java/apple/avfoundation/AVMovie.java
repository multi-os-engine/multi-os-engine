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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
     * @property       URL
     * @abstract       The URL with which the instance of AVMovie was initialized; may be nil.
     */
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVMovie assetWithURL(NSURL URL);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * @property       canContainMovieFragments
     * @abstract       Indicates whether the movie file is capable of being extended by fragments.
     * @discussion     The value of this property is YES if an 'mvex' box is present in the 'moov' box. The 'mvex' box is necessary in order to signal the possible presence of later 'moof' boxes.
     */
    @Generated
    @Selector("canContainMovieFragments")
    public native boolean canContainMovieFragments();

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
     * @property       containsMovieFragments
     * @abstract       Indicates whether the movie file is extended by at least one movie fragment.
     * @discussion     The value of this property is YES if canContainMovieFragments is YES and at least one 'moof' box is present after the 'moov' box.
     */
    @Generated
    @Selector("containsMovieFragments")
    public native boolean containsMovieFragments();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * @property       data
     * @abstract       The data block with which the instance of AVMovie was initialized; may be nil.
     */
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * @property       defaultMediaDataStorage
     * @abstract       The default storage container for media data added to a movie.
     * @discussion     The value of this property is an AVMediaDataStorage object that indicates where sample data that is added to a movie should be written by default.
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
    public native AVMovie init();

    /**
     * @method			initWithData:options:
     * @abstract		Creates an AVMovie object from a movie header stored in an NSData object.
     * @param			data
     * 				An NSData object containing a movie header.
     * @param			options
     * 				An NSDictionary object that contains keys for specifying options for the initialization of the AVMovie object. Currently no keys are defined.
     * @result			An AVMovie object
     * @discussion     You can use this method to operate on movie headers that are not stored in files. In general you should avoid loading an entire movie file with its media data into an instance of NSData!
     * 
     *                    By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage property will be nil. If you want to create an AVMutableMovie from an NSData object and then append sample buffers to any of its tracks, you must first set one of these properties to indicate where the sample data should be written.
     */
    @Generated
    @Selector("initWithData:options:")
    public native AVMovie initWithDataOptions(NSData data, NSDictionary<String, ?> options);

    /**
     * @method			initWithURL:options:
     * @abstract		Creates an AVMovie object from a movie header stored in a QuickTime movie file or ISO base media file.
     * @param			URL
     * 				An NSURL object that specifies a file containing a movie header.
     * @param			options
     * 				An NSDictionary object that contains keys for specifying options for the initialization of the AVMovie object. Currently no keys are defined.
     * @result			An AVMovie object
     * @discussion     By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage property will be nil.
     *                    If you want to create an AVMutableMovie from a file and then append sample buffers to any of its tracks, you must first set one of these properties 
     *                    to indicate where the sample data should be written.
     */
    @Generated
    @Selector("initWithURL:options:")
    public native AVMovie initWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

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
     * @method			isCompatibleWithFileType:
     * @abstract		Indicates whether a movie header for the AVMovie object can be created for the specified file type.
     * @param			fileType
     * 				A UTI indicating a movie file format (e.g. AVFileTypeQuickTimeMovie for a QuickTime movie).
     * @discussion     This method returns a BOOL that indicates whether a movie header of the specified type can be created for the receiver. For example, this method returns NO if the movie contains tracks whose media types or media subtypes are not allowed by the specified file type.
     */
    @Generated
    @Selector("isCompatibleWithFileType:")
    public native boolean isCompatibleWithFileType(String fileType);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * @method			movieHeaderWithFileType:error:
     * @abstract		Creates an NSData object containing the movie header of the AVMovie object.
     * @param			fileType
     * 				A UTI indicating the specific file format of the movie header (e.g. AVFileTypeQuickTimeMovie for a QuickTime movie).
     * @param			outError
     * 				If an error occurs reading the movie header, describes the nature of the failure.
     * @result			An NSData object.
     * @discussion     The movie header will be a pure reference movie, with no base URL, suitable for use on the pasteboard.
     */
    @Generated
    @Selector("movieHeaderWithFileType:error:")
    public native NSData movieHeaderWithFileTypeError(String fileType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * @method			movieTypes
     * @abstract		Provides the file types the AVMovie class understands.
     * @result			An NSArray of UTIs identifying the file types the AVMovie class understands.
     */
    @Generated
    @Selector("movieTypes")
    public static native NSArray<String> movieTypes();

    /**
     * @method			movieWithData:options:
     * @abstract		Creates an AVMovie object from a movie header stored in an NSData object.
     * @param			data
     * 				An NSData object containing a movie header.
     * @param			options
     * 				An NSDictionary object that contains keys for specifying options for the initialization of the AVMovie object. Currently no keys are defined.
     * @result			An AVMovie object
     * @discussion     You can use this method to operate on movie headers that are not stored in files; this might include movie headers on the pasteboard (which do not contain media data). In general you should avoid loading an entire movie file with its media data into an instance of NSData! By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage property will be nil.
     *                    If you want to create an AVMutableMovie from an NSData object and then append sample buffers to any of its tracks, you must first set one of these properties to indicate where the sample data should be written.
     */
    @Generated
    @Selector("movieWithData:options:")
    public static native AVMovie movieWithDataOptions(NSData data, NSDictionary<String, ?> options);

    /**
     * @method			movieWithURL:options:
     * @abstract		Creates an AVMovie object from a movie header stored in a QuickTime movie file or ISO base media file.
     * @param			URL
     * 				An NSURL object that specifies a file containing a movie header.
     * @param			options
     * 				An NSDictionary object that contains keys for specifying options for the initialization of the AVMovie object. Currently no keys are defined.
     * @result			An AVMovie object
     * @discussion     By default, the defaultMediaDataStorage property will be nil and each associated AVMovieTrack's mediaDataStorage property will be nil.
     *                    If you want to create an AVMutableMovie from a file and then append sample buffers to any of its tracks, you must first set one of these properties 
     *                    to indicate where the sample data should be written.
     */
    @Generated
    @Selector("movieWithURL:options:")
    public static native AVMovie movieWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    @Generated
    @Owned
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

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

    /**
     * @method		trackWithTrackID:
     * @abstract		Provides an instance of AVMovieTrack that represents the track of the specified trackID.
     * @param		trackID
     * 		The trackID of the requested AVMovieTrack.
     * @result		An instance of AVMovieTrack; may be nil if no track of the specified trackID is available.
     * @discussion	Becomes callable without blocking when the key @"tracks" has been loaded
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVMovieTrack trackWithTrackID(int trackID);

    /**
     * @property       tracks
     * @abstract       The tracks in a movie.
     * @discussion     The value of this property is an array of tracks the movie contains; the tracks are of type AVMovieTrack.
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVMovieTrack> tracks();

    /**
     * @method		tracksWithMediaCharacteristic:
     * @abstract		Provides an array of AVMovieTracks of the asset that present media with the specified characteristic.
     * @param		mediaCharacteristic
     * 		The media characteristic according to which the receiver filters its AVMovieTracks. (Media characteristics are defined in AVMediaFormat.h)
     * @result		An NSArray of AVMovieTracks; may be empty if no tracks with the specified characteristic are available.
     * @discussion	Becomes callable without blocking when the key @"tracks" has been loaded
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVMovieTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    /**
     * @method		tracksWithMediaType:
     * @abstract		Provides an array of AVMovieTracks of the asset that present media of the specified media type.
     * @param		mediaType
     * 		The media type according to which the receiver filters its AVMovieTracks. (Media types are defined in AVMediaFormat.h)
     * @result		An NSArray of AVMovieTracks; may be empty if no tracks of the specified media type are available.
     * @discussion	Becomes callable without blocking when the key @"tracks" has been loaded
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVMovieTrack> tracksWithMediaType(String mediaType);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @method			writeMovieHeaderToURL:fileType:options:error:
     * @abstract		Writes the movie header to a destination URL.
     * @param			URL
     * 				An NSURL object indicating where to write the movie header.
     * @param			fileType
     * 				A UTI indicating the specific file format (e.g. AVFileTypeQuickTimeMovie for a QuickTime movie).
     * @param			options
     *                    An NSUInteger whose bits specify options for the writing of the movie header. See AVMovieWritingOptions above.
     * @param			outError
     * 				If an error occurs writing the movie header, describes the nature of the failure.
     * @discussion		Note that modifications to instances of AVMutableMovie, to their constituent AVMutableMovieTracks, or to their collections of metadata are committed to storage when their movie headers are written.
     */
    @Generated
    @Selector("writeMovieHeaderToURL:fileType:options:error:")
    public native boolean writeMovieHeaderToURLFileTypeOptionsError(NSURL URL, String fileType, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);
}