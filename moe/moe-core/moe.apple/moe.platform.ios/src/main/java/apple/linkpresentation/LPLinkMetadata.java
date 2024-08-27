package apple.linkpresentation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSItemProvider;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object that contains metadata about a URL.
 * 
 * Use ``LPLinkMetadata`` to store the metadata about a URL, including its
 * title, icon, images and video.
 * 
 * Fetch metadata using ``LPMetadataProvider``. For remote URLs, cache the
 * metadata locally to avoid the data and performance cost of fetching it from
 * the internet every time you present it. ``LPLinkMetadata`` is serializable
 * with
 * <doc://com.apple.documentation/documentation/foundation/nssecurecoding>.
 * 
 * For local file URLs, the
 * <doc://com.apple.documentation/documentation/quicklookthumbnailing> API
 * retrieves a representative thumbnail for the file, if possible.
 * 
 * ## Provide custom metadata
 * 
 * Say your app already has a database of links, with titles and images that
 * weren’t fetched by ``LPMetadataProvider``. You don’t have to fetch new
 * metadata from the internet in order to accelerate the share sheet or to
 * present a rich link. Instead, you can fill in the fields of
 * ``LPLinkMetadata`` yourself.
 * 
 * Create an ``LPLinkMetadata`` object, and fill in at least the
 * ``LPLinkMetadata/originalURL`` and ``LPLinkMetadata/URL`` fields, plus
 * whatever additional information you have.
 * 
 * ```swift
 * func activityViewControllerLinkMetadata(_: UIActivityViewController) -> LPLinkMetadata? {
 * let metadata = LPLinkMetadata()
 * metadata.originalURL = URL(string: "https://www.example.com/apple-pie")
 * metadata.url = metadata.originalURL
 * metadata.title = "The Greatest Apple Pie In The World"
 * metadata.imageProvider = NSItemProvider.init(contentsOf:
 * Bundle.main.url(forResource: "apple-pie", withExtension: "jpg"))
 * return metadata
 * }
 * ```
 * 
 * ## Accelerate the share sheet preview
 * 
 * For existing apps that share URLs, the share sheet automatically presents a
 * preview of the link. The preview first shows a placeholder link icon
 * alongside the base URL while fetching the link’s metadata over the network.
 * The preview updates once the link’s icon and title become available.
 * 
 * If you already have an ``LPLinkMetadata`` object for a URL, pass it to the
 * share sheet to present the preview instantly, without fetching data over the
 * network. In your implementation of
 * <doc://com.apple.documentation/documentation/uikit/uiactivityitemsource/3144571-activityviewcontrollerlinkmetada>,
 * return the metadata object.
 * 
 * ```swift
 * func activityViewControllerLinkMetadata(_:
 * UIActivityViewController) -> LPLinkMetadata? {
 * return self.metadata
 * }
 * ```
 * 
 * If the user chooses to share to Messages, the same metadata passes directly
 * through, providing a smooth and seamless experience with no unnecessary
 * loading.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("LinkPresentation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LPLinkMetadata extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected LPLinkMetadata(Pointer peer) {
        super(peer);
    }

    /**
     * The URL that returned the metadata, taking server-side redirects into
     * account.
     * 
     * The URL that returns the metadata may differ from the
     * ``LPLinkMetadata/originalURL`` to which you sent the metadata request. This
     * can happen if the server redirects the request, for example, when a resource
     * has moved, or when the original URL is a domain alias.
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
    public static native LPLinkMetadata alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native LPLinkMetadata allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * An object that retrieves data corresponding to a representative icon for the
     * URL.
     */
    @Nullable
    @Generated
    @Selector("iconProvider")
    public native NSItemProvider iconProvider();

    /**
     * An object that retrieves data corresponding to a representative image for
     * the URL.
     */
    @Nullable
    @Generated
    @Selector("imageProvider")
    public native NSItemProvider imageProvider();

    @Generated
    @Selector("init")
    public native LPLinkMetadata init();

    @Generated
    @Selector("initWithCoder:")
    public native LPLinkMetadata initWithCoder(@NotNull NSCoder coder);

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
    public static native LPLinkMetadata new_objc();

    /**
     * The original URL of the metadata request.
     */
    @Nullable
    @Generated
    @Selector("originalURL")
    public native NSURL originalURL();

    /**
     * A remote URL corresponding to a representative video for the URL.
     * 
     * This may reference a remote video file that
     * <doc://com.apple.documentation/documentation/avfoundation> can stream,
     * or a YouTube video URL.
     */
    @Nullable
    @Generated
    @Selector("remoteVideoURL")
    public native NSURL remoteVideoURL();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An object that retrieves data corresponding to a representative icon for the
     * URL.
     */
    @Generated
    @Selector("setIconProvider:")
    public native void setIconProvider(@Nullable NSItemProvider value);

    /**
     * An object that retrieves data corresponding to a representative image for
     * the URL.
     */
    @Generated
    @Selector("setImageProvider:")
    public native void setImageProvider(@Nullable NSItemProvider value);

    /**
     * The original URL of the metadata request.
     */
    @Generated
    @Selector("setOriginalURL:")
    public native void setOriginalURL(@Nullable NSURL value);

    /**
     * A remote URL corresponding to a representative video for the URL.
     * 
     * This may reference a remote video file that
     * <doc://com.apple.documentation/documentation/avfoundation> can stream,
     * or a YouTube video URL.
     */
    @Generated
    @Selector("setRemoteVideoURL:")
    public native void setRemoteVideoURL(@Nullable NSURL value);

    /**
     * A representative title for the URL.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    /**
     * The URL that returned the metadata, taking server-side redirects into
     * account.
     * 
     * The URL that returns the metadata may differ from the
     * ``LPLinkMetadata/originalURL`` to which you sent the metadata request. This
     * can happen if the server redirects the request, for example, when a resource
     * has moved, or when the original URL is a domain alias.
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(@Nullable NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * An object that retrieves data corresponding to a representative video for
     * the URL.
     * 
     * The item provider returns a video that
     * <doc://com.apple.documentation/documentation/avfoundation> can play.
     */
    @Generated
    @Selector("setVideoProvider:")
    public native void setVideoProvider(@Nullable NSItemProvider value);

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
     * A representative title for the URL.
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An object that retrieves data corresponding to a representative video for
     * the URL.
     * 
     * The item provider returns a video that
     * <doc://com.apple.documentation/documentation/avfoundation> can play.
     */
    @Nullable
    @Generated
    @Selector("videoProvider")
    public native NSItemProvider videoProvider();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
