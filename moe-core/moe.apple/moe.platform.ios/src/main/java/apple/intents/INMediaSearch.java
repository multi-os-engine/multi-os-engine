package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * API-Since: 13.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INMediaSearch extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INMediaSearch(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 13.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use `moodNames` property instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("activityNames")
    public native NSArray<String> activityNames();

    @Nullable
    @Generated
    @Selector("albumName")
    public native String albumName();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INMediaSearch alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INMediaSearch allocWithZone(VoidPtr zone);

    @Nullable
    @Generated
    @Selector("artistName")
    public native String artistName();

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

    @Nullable
    @Generated
    @Selector("genreNames")
    public native NSArray<String> genreNames();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INMediaSearch init();

    @Generated
    @Selector("initWithCoder:")
    public native INMediaSearch initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithMediaType:sortOrder:mediaName:artistName:albumName:genreNames:moodNames:releaseDate:reference:mediaIdentifier:")
    public native INMediaSearch initWithMediaTypeSortOrderMediaNameArtistNameAlbumNameGenreNamesMoodNamesReleaseDateReferenceMediaIdentifier(
            @NInt long mediaType, @NInt long sortOrder, @Nullable String mediaName, @Nullable String artistName,
            @Nullable String albumName, @Nullable NSArray<String> genreNames, @Nullable NSArray<String> moodNames,
            @Nullable INDateComponentsRange releaseDate, @NInt long reference, @Nullable String mediaIdentifier);

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

    @Nullable
    @Generated
    @Selector("mediaIdentifier")
    public native String mediaIdentifier();

    @Nullable
    @Generated
    @Selector("mediaName")
    public native String mediaName();

    @Generated
    @Selector("mediaType")
    @NInt
    public native long mediaType();

    @Nullable
    @Generated
    @Selector("moodNames")
    public native NSArray<String> moodNames();

    @Generated
    @Owned
    @Selector("new")
    public static native INMediaSearch new_objc();

    @Generated
    @Selector("reference")
    @NInt
    public native long reference();

    @Nullable
    @Generated
    @Selector("releaseDate")
    public native INDateComponentsRange releaseDate();

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
    @Selector("sortOrder")
    @NInt
    public native long sortOrder();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
