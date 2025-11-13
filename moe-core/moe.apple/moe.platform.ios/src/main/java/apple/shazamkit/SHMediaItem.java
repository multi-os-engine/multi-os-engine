package apple.shazamkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSDate;

/**
 * An object that represents the metadata for a reference signature.
 * 
 * This class uses subscripting for the data elements of a custom media item that an existing property doesn't already
 * represent.
 * 
 * Add a readable custom property by extending ``SHMediaItemProperty-struct`` with a key for that property, and by
 * extending this class with a property that uses the key. The following code shows the extensions for an episode
 * number:
 * 
 * ```swift
 * // Add an episode number to the list of properties.
 * extension SHMediaItemProperty {
 * static let episode = SHMediaItemProperty("Episode")
 * }
 * 
 * // Add a property for returning the episode number using a subscript.
 * extension SHMediaItem {
 * var episode: Int? {
 * return self[.episode] as? Int
 * }
 * }
 * ```
 * 
 * 
 * Add your custom property when you create the media item as the following code shows:
 * 
 * ```swift
 * // Create a new media item and set the title, subtitle, and episode properties.
 * let mediaItem = SHMediaItem(properties: [.episode: 42,
 * .title: "Question",
 * .subtitle: "The Answer"])
 * ```
 * 
 * 
 * > Note:
 * > The class of the object that represents a custom object must be one of: `Dictionary`, `Array`, `URL`, `Number`,
 * `String`, `Date`, or `Data`.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SHMediaItem extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SHMediaItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SHMediaItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SHMediaItem allocWithZone(VoidPtr zone);

    /**
     * The Apple Music ID for the song.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("appleMusicID")
    public native String appleMusicID();

    /**
     * A link to the Apple Music page that contains the full information for the song.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("appleMusicURL")
    public native NSURL appleMusicURL();

    /**
     * The name of the artist for the media item, such as the performer of a song.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("artist")
    public native String artist();

    /**
     * The URL for artwork for the media item, such as an album cover.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("artworkURL")
    public native NSURL artworkURL();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * A Boolean value that indicates whether the media item contains explicit content.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("explicitContent")
    public native boolean explicitContent();

    /**
     * Requests the media item for the song with the specified Shazam ID.
     * 
     * > Important:
     * > You can call this method from synchronous code using a completion handler, as shown on this page, or you can
     * call it as an asynchronous method that has the following declaration:
     * >
     * > ```swift
     * > class func fetch(shazamID: String) async throws -> SHMediaItem
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * - Parameters:
     * - shazamID: The Shazam ID of the song.
     * - completionHandler: The completion handler that the system calls with the result of the request.
     * 
     * This block takes the following parameters:
     * 
     * - term `mediaItem`: A media item.
     * - term `error`: An error object if a problem occurs when fetching the media item; otherwise, `nil`.
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("fetchMediaItemWithShazamID:completionHandler:")
    public static native void fetchMediaItemWithShazamIDCompletionHandler(@NotNull String shazamID,
            @NotNull @ObjCBlock(name = "call_fetchMediaItemWithShazamIDCompletionHandler") Block_fetchMediaItemWithShazamIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchMediaItemWithShazamIDCompletionHandler {
        @Generated
        void call_fetchMediaItemWithShazamIDCompletionHandler(@Nullable SHMediaItem mediaItem, @Nullable NSError error);
    }

    /**
     * An array of genre names for the media item.
     * 
     * The array is empty if there are no media items.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("genres")
    public native NSArray<String> genres();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SHMediaItem init();

    @Generated
    @Selector("initWithCoder:")
    public native SHMediaItem initWithCoder(@NotNull NSCoder coder);

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

    /**
     * The International Standard Recording Code (ISRC) for the media item.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("isrc")
    public native String isrc();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Creates a media item object with a dictionary of properties and their associated values.
     * 
     * - Parameters:
     * - properties: A dictionary that contains the media item properties and their associated values.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("mediaItemWithProperties:")
    public static native SHMediaItem mediaItemWithProperties(@NotNull NSDictionary<String, ?> properties);

    @Generated
    @Owned
    @Selector("new")
    public static native SHMediaItem new_objc();

    /**
     * Accesses the property for the specified key for reading.
     * 
     * - Parameters:
     * - key: The key for the media item property.
     * 
     * - Returns: The value of the property; otherwise, `nil`.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKeyedSubscript(@NotNull String key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The Shazam ID for the song.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("shazamID")
    public native String shazamID();

    /**
     * A subtitle for the media item.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * A title for the media item.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Accesses the property for the specified key for reading.
     * 
     * - Parameters:
     * - property: The key for the property.
     * 
     * - Returns: The value of the property; otherwise, `nil`.
     */
    @NotNull
    @Generated
    @Selector("valueForProperty:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForProperty(@NotNull String property);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The URL for a video for the media item, such as a music video.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("videoURL")
    public native NSURL videoURL();

    /**
     * A link to the Shazam Music catalog page that contains the full information for the song.
     * 
     * This link opens the Shazam app or App Clip if it's available on the device.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("webURL")
    public native NSURL webURL();

    /**
     * An array of ranges that indicate the frequency skews in the reference signature that this media item describes.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("frequencySkewRanges")
    public native NSArray<? extends SHRange> frequencySkewRanges();

    /**
     * An array of ranges that indicate the offsets within the reference signature that this media item describes.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("timeRanges")
    public native NSArray<? extends SHRange> timeRanges();

    /**
     * The date the media item was created.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("creationDate")
    @Nullable
    public native NSDate creationDate();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
