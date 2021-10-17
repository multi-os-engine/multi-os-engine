package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVFragmentMinding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVFragmentedMovie extends AVMovie implements AVFragmentMinding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVFragmentedMovie(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVFragmentedMovie alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVFragmentedMovie allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVFragmentedMovie assetWithURL(NSURL URL);

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
    @Selector("init")
    public native AVFragmentedMovie init();

    @Generated
    @Selector("initWithData:options:")
    public native AVFragmentedMovie initWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithURL:options:")
    public native AVFragmentedMovie initWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

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
    @Selector("isAssociatedWithFragmentMinder")
    public native boolean isAssociatedWithFragmentMinder();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("movieTypes")
    public static native NSArray<String> movieTypes();

    @Generated
    @Selector("movieWithData:options:")
    public static native AVFragmentedMovie movieWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("movieWithURL:options:")
    public static native AVFragmentedMovie movieWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    @Generated
    @Owned
    @Selector("new")
    public static native AVFragmentedMovie new_objc();

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
     * <p>
     * Provides an instance of AVFragmentedMovieTrack that represents the track of the specified trackID.
     * <p>
     * Becomes callable without blocking when the key @"tracks" has been loaded
     *
     * @param        trackID The trackID of the requested AVFragmentedMovieTrack.
     * @return An instance of AVFragmentedMovieTrack; may be nil if no track of the specified trackID is available.
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVFragmentedMovieTrack trackWithTrackID(int trackID);

    /**
     * [@property]       tracks
     * <p>
     * The tracks in a movie.
     * <p>
     * The value of this property is an array of tracks the movie contains; the tracks are of type AVFragmentedMovieTrack.
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVFragmentedMovieTrack> tracks();

    /**
     * tracksWithMediaCharacteristic:
     * <p>
     * Provides an array of AVFragmentedMovieTracks of the asset that present media with the specified characteristic.
     * <p>
     * Becomes callable without blocking when the key @"tracks" has been loaded
     *
     * @param        mediaCharacteristic The media characteristic according to which the receiver filters its AVFragmentedMovieTracks. (Media characteristics are defined in AVMediaFormat.h)
     * @return An NSArray of AVFragmentedMovieTracks; may be empty if no tracks with the specified characteristic are available.
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVFragmentedMovieTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    /**
     * tracksWithMediaType:
     * <p>
     * Provides an array of AVFragmentedMovieTracks of the asset that present media of the specified media type.
     * <p>
     * Becomes callable without blocking when the key @"tracks" has been loaded
     *
     * @param        mediaType The media type according to which the receiver filters its AVFragmentedMovieTracks. (Media types are defined in AVMediaFormat.h)
     * @return An NSArray of AVFragmentedMovieTracks; may be empty if no tracks of the specified media type are available.
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVFragmentedMovieTrack> tracksWithMediaType(String mediaType);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * loadTrackWithTrackID:completionHandler:
     * <p>
     * Loads an instance of AVFragmentedMovieTrack that represents the track of the specified trackID.
     *
     * @param        trackID The trackID of the requested AVFragmentedMovieTrack.
     * @param        completionHandler A block that is called when the loading is finished, with either the loaded track (which may be nil if no track of the specified trackID is available) or an error.
     */
    @Generated
    @Selector("loadTrackWithTrackID:completionHandler:")
    public native void loadTrackWithTrackIDCompletionHandler(int trackID,
            @ObjCBlock(name = "call_loadTrackWithTrackIDCompletionHandler") Block_loadTrackWithTrackIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTrackWithTrackIDCompletionHandler {
        @Generated
        void call_loadTrackWithTrackIDCompletionHandler(AVFragmentedMovieTrack _Nullable_result, NSError arg1);
    }

    /**
     * loadTracksWithMediaCharacteristic:completionHandler:
     * <p>
     * Loads an array of AVFragmentedMovieTracks of the asset that present media with the specified characteristic.
     *
     * @param        mediaCharacteristic The media characteristic according to which AVAsset filters its AVFragmentedMovieTracks. (Media characteristics are defined in AVMediaFormat.h.)
     * @param        completionHandler A block that is called when the loading is finished, with either the loaded tracks (which may be empty if no tracks with the specified characteristic are available) or an error.
     */
    @Generated
    @Selector("loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristicCompletionHandler(String mediaCharacteristic,
            @ObjCBlock(name = "call_loadTracksWithMediaCharacteristicCompletionHandler") Block_loadTracksWithMediaCharacteristicCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaCharacteristicCompletionHandler {
        @Generated
        void call_loadTracksWithMediaCharacteristicCompletionHandler(NSArray<? extends AVFragmentedMovieTrack> arg0,
                NSError arg1);
    }

    /**
     * loadTracksWithMediaType:completionHandler:
     * <p>
     * Loads an array of AVFragmentedMovieTracks of the asset that present media of the specified media type.
     *
     * @param        mediaType The media type according to which AVAsset filters its AVFragmentedMovieTracks. (Media types are defined in AVMediaFormat.h.)
     * @param        completionHandler A block that is called when the loading is finished, with either the loaded tracks (which may be empty if no tracks of the specified media type are available) or an error.
     */
    @Generated
    @Selector("loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaTypeCompletionHandler(String mediaType,
            @ObjCBlock(name = "call_loadTracksWithMediaTypeCompletionHandler") Block_loadTracksWithMediaTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaTypeCompletionHandler {
        @Generated
        void call_loadTracksWithMediaTypeCompletionHandler(NSArray<? extends AVFragmentedMovieTrack> arg0,
                NSError arg1);
    }
}
