package apple.backgroundassets;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURLRequest;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * API-Since: 16.1
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BAURLDownload extends BADownload implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected BAURLDownload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BAURLDownload alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BAURLDownload allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native BAURLDownload init();

    @Generated
    @Selector("initWithCoder:")
    public native BAURLDownload initWithCoder(@NotNull NSCoder coder);

    /**
     * Constructs a download object to represent the download of a asset located inside of the provided @c request.
     * 
     * @param identifier                 A unique identifier that is used to track the download across the app and
     *                                   extension.
     * @param request                    The request used to perform the download. The URL provided inside of the
     *                                   request must be a https scheme.
     * @param applicationGroupIdentifier The identifier of the application group that should used to store the finished
     *                                   download.
     * 
     *                                   API-Since: 16.1
     *                                   Deprecated-Since: 16.4
     */
    @Generated
    @Deprecated
    @Selector("initWithIdentifier:request:applicationGroupIdentifier:")
    public native BAURLDownload initWithIdentifierRequestApplicationGroupIdentifier(@NotNull String identifier,
            @NotNull NSURLRequest request, @NotNull String applicationGroupIdentifier);

    /**
     * Constructs a download object to represent the download of a asset located inside of the provided @c request.
     * 
     * @param identifier                 A unique identifier that is used to track the download across the app and
     *                                   extension.
     * @param request                    The request used to perform the download. The URL provided inside of the
     *                                   request must be a https scheme.
     * @param applicationGroupIdentifier The identifier of the application group that should used to store the finished
     *                                   download.
     * @param priority                   A priority between @c BADownloaderPriorityMin - @c BADownloaderPriorityMax
     *                                   which is used to order the downloads for this process.
     *                                   It is recommended to use @c BADownloaderPriorityDefault if download priority
     *                                   does not matter.
     * 
     *                                   API-Since: 16.1
     *                                   Deprecated-Since: 16.4
     */
    @Generated
    @Deprecated
    @Selector("initWithIdentifier:request:applicationGroupIdentifier:priority:")
    public native BAURLDownload initWithIdentifierRequestApplicationGroupIdentifierPriority(@NotNull String identifier,
            @NotNull NSURLRequest request, @NotNull String applicationGroupIdentifier, @NInt long priority);

    /**
     * Constructs a download object to represent the download of a asset located inside of the provided @c request.
     * 
     * @param identifier                 A unique identifier that is used to track the download across the app and
     *                                   extension.
     * @param request                    The request used to perform the download. The URL provided inside of the
     *                                   request must be a https scheme.
     * @param essential                  Whether the download is essential. See @c BADownload.isEssential. Default is
     *                                   false.
     * @param fileSize                   The size of the file to download. For Essential downloads, this field must be
     *                                   accurate in order to show the user
     *                                   accurate progress during app installation. If the size does not match the file
     *                                   being downloaded, then the download will fail. It is recommended to
     *                                   report an accurate @c fileSize for both Essential and Non-Essential downloads.
     * @param applicationGroupIdentifier The identifier of the application group that should used to store the finished
     *                                   download.
     * @param priority                   A priority between @c BADownloaderPriorityMin - @c BADownloaderPriorityMax
     *                                   which is used to order the downloads for this process.
     *                                   It is recommended to use @c BADownloaderPriorityDefault if download priority
     *                                   does not matter.
     * 
     *                                   API-Since: 16.4
     */
    @Generated
    @Selector("initWithIdentifier:request:essential:fileSize:applicationGroupIdentifier:priority:")
    public native BAURLDownload initWithIdentifierRequestEssentialFileSizeApplicationGroupIdentifierPriority(
            @NotNull String identifier, @NotNull NSURLRequest request, boolean essential, @NUInt long fileSize,
            @NotNull String applicationGroupIdentifier, @NInt long priority);

    /**
     * Constructs a download object to represent the download of a asset located inside of the provided @c request.
     * 
     * @param identifier                 A unique identifier that is used to track the download across the app and
     *                                   extension.
     * @param request                    The request used to perform the download. The URL provided inside of the
     *                                   request must be a https scheme.
     * @param fileSize                   The size of the file to download. If the @c fileSize is not accurate, then the
     *                                   download will fail if @c isEssential is true.
     * @param applicationGroupIdentifier The identifier of the application group that should used to store the finished
     *                                   download.
     * 
     *                                   API-Since: 16.4
     */
    @Generated
    @Selector("initWithIdentifier:request:fileSize:applicationGroupIdentifier:")
    public native BAURLDownload initWithIdentifierRequestFileSizeApplicationGroupIdentifier(@NotNull String identifier,
            @NotNull NSURLRequest request, @NUInt long fileSize, @NotNull String applicationGroupIdentifier);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native BAURLDownload new_objc();

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

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}