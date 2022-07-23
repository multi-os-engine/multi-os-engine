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

/**
 * [@c] SHMediaItem represents metadata associated with a @c SHSignature
 * <p>
 * A @c SHMediaItem is used in two distinct ways
 * 1. As the base class of a @c SHMatchedMedia item, and therefore as the result of a match
 * 2. As a way of associating metadata with reference signatures in a @c SHCustomCatalog
 * <p>
 * A SHMediaItem contains no required fields and may be entirely blank, they can also contain custom data set with
 * custom keys when making a @c SHCustomCatalog.
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
     * The Apple Music ID
     * [@note] This may be fetched using the key @c SHMediaItemAppleMusicID
     */
    @Generated
    @Selector("appleMusicID")
    public native String appleMusicID();

    /**
     * The Apple Music URL
     * [@note] This may be fetched using the key @c SHMediaItemAppleMusicURL
     */
    @Generated
    @Selector("appleMusicURL")
    public native NSURL appleMusicURL();

    /**
     * The Artist
     * [@note] This may be fetched using the key @c SHMediaItemArtist
     */
    @Generated
    @Selector("artist")
    public native String artist();

    /**
     * The Artwork URL
     * [@note] This may be fetched using the key @c SHMediaItemArtworkURL
     */
    @Generated
    @Selector("artworkURL")
    public native NSURL artworkURL();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Whether this object represents explicit material
     * [@note] This may be fetched using the key @c SHMediaItemExplicitContent
     */
    @Generated
    @Selector("explicitContent")
    public native boolean explicitContent();

    /**
     * Fetch a @c SHMediaItem by Shazam ID
     * <p>
     * The completionHandler will contain a @c SHMediaItem if the ShazamID is valid, otherwise nil and an error
     */
    @Generated
    @Selector("fetchMediaItemWithShazamID:completionHandler:")
    public static native void fetchMediaItemWithShazamIDCompletionHandler(String shazamID,
            @ObjCBlock(name = "call_fetchMediaItemWithShazamIDCompletionHandler") Block_fetchMediaItemWithShazamIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchMediaItemWithShazamIDCompletionHandler {
        @Generated
        void call_fetchMediaItemWithShazamIDCompletionHandler(SHMediaItem mediaItem, NSError error);
    }

    /**
     * The Genre Names
     * [@note] This may be fetched using the key @c SHMediaItemGenres
     * <p>
     * An array of strings representing the genres of the media item. Will return an empty array if there are no genres.
     */
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
    public native SHMediaItem initWithCoder(NSCoder coder);

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
     * The International Standard Recording Code
     * [@note] This may be fetched using the key @c SHMediaItemISRC
     */
    @Generated
    @Selector("isrc")
    public native String isrc();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Construct a new instance with the provided dictionary
     * <p>
     * You may add your own keys here to return custom data, custom data should conform to NSCoding
     */
    @Generated
    @Selector("mediaItemWithProperties:")
    public static native SHMediaItem mediaItemWithProperties(NSDictionary<String, ?> properties);

    @Generated
    @Owned
    @Selector("new")
    public static native SHMediaItem new_objc();

    /**
     * Use subscripting to retrieve values
     *
     * @param key The `SHMediaItemProperty` or custom key for a value
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKeyedSubscript(String key);

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
     * The Shazam Media ID
     * [@note] This may be fetched using the key @c SHMediaItemShazamID
     */
    @Generated
    @Selector("shazamID")
    public native String shazamID();

    /**
     * The Subtitle
     * [@note] This may be fetched using the key @c SHMediaItemSubtitle
     */
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
     * The Title
     * [@note] This may be fetched using the key @c SHMediaItemTitle
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Retrieve a value using a known key
     *
     * @param property The `SHMediaItemProperty` for a value
     */
    @Generated
    @Selector("valueForProperty:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForProperty(String property);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The VideoURL
     * [@note] This may be fetched using the key @c SHMediaItemVideoURL
     */
    @Generated
    @Selector("videoURL")
    public native NSURL videoURL();

    /**
     * The Web URL
     * <p>
     * The URL will point to a page that displays the current object in its entirety
     * [@note] This may be fetched using the key @c SHMediaItemWebURL
     */
    @Generated
    @Selector("webURL")
    public native NSURL webURL();
}
