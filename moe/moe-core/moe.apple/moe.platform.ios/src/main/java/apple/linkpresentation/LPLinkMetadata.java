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
 * An LPLinkMetadata object contains metadata about a URL.
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
     * The URL that metadata was retrieved from.
     * This takes server-side redirects into account.
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
     * An item provider which will return data corresponding to a representative
     * icon for the URL.
     */
    @Nullable
    @Generated
    @Selector("iconProvider")
    public native NSItemProvider iconProvider();

    /**
     * An item provider which will return data corresponding to a representative
     * image for the URL.
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
     * The original URL that metadata was requested from.
     */
    @Nullable
    @Generated
    @Selector("originalURL")
    public native NSURL originalURL();

    /**
     * A remote URL corresponding to a representative video for the URL.
     * 
     * This may point to to a remote video file that AVFoundation can stream,
     * or to a YouTube video URL.
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
     * An item provider which will return data corresponding to a representative
     * icon for the URL.
     */
    @Generated
    @Selector("setIconProvider:")
    public native void setIconProvider(@Nullable NSItemProvider value);

    /**
     * An item provider which will return data corresponding to a representative
     * image for the URL.
     */
    @Generated
    @Selector("setImageProvider:")
    public native void setImageProvider(@Nullable NSItemProvider value);

    /**
     * The original URL that metadata was requested from.
     */
    @Generated
    @Selector("setOriginalURL:")
    public native void setOriginalURL(@Nullable NSURL value);

    /**
     * A remote URL corresponding to a representative video for the URL.
     * 
     * This may point to to a remote video file that AVFoundation can stream,
     * or to a YouTube video URL.
     */
    @Generated
    @Selector("setRemoteVideoURL:")
    public native void setRemoteVideoURL(@Nullable NSURL value);

    /**
     * A title for the URL.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    /**
     * The URL that metadata was retrieved from.
     * This takes server-side redirects into account.
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(@Nullable NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * An item provider which will return data corresponding to a representative
     * video for the URL that AVFoundation can play.
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
     * A title for the URL.
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
     * An item provider which will return data corresponding to a representative
     * video for the URL that AVFoundation can play.
     */
    @Nullable
    @Generated
    @Selector("videoProvider")
    public native NSItemProvider videoProvider();
}
