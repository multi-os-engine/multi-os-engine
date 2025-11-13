package apple.shazamkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object that represents the user's Shazam library.
 * 
 * Use `SHMediaLibrary` to add matched songs from the Shazam catalog to the user's Shazam library.
 * 
 * > Note:
 * > There's no system permission necessary to write to the user's Shazam library. Consider requesting permission from
 * the user before adding songs to the library.
 * 
 * API-Since: 15.0
 * Deprecated-Since: 18.0
 * Deprecated-Message: Use SHLibrary instead
 */
@Deprecated
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SHMediaLibrary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SHMediaLibrary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds an array of songs to the user's Shazam library.
     * 
     * > Important:
     * > You can call this method from synchronous code using a completion handler, as shown on this page, or you can
     * call it as an asynchronous method that has the following declaration:
     * >
     * > ```swift
     * > func add(_ mediaItems: [SHMediaItem]) async throws
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * Saving a song to the user's Shazam library also saves the following media item properties and their associated
     * values:
     * 
     * - ``SHMediaItemProperty/shazamID``
     * - ``SHMediaItemProperty/title``
     * - ``SHMediaItemProperty/subtitle``, or ``SHMediaItemProperty/artist`` if the subtitle is unavailable
     * 
     * > Note:
     * > Saving to the user's Shazam library works only for songs with a valid ``SHMediaItemProperty/shazamID``.
     * 
     * - Parameters:
     * - mediaItems: An array of media items that represents the songs to add to the library.
     * - completionHandler: The system calls this completion block after adding the media items to the library.
     * 
     * This block takes the following parameters:
     * 
     * - term `error`: An error object if a problem occurs when adding any item; otherwise, `nil`.
     * 
     * API-Since: 15.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use SHLibrary instead
     */
    @Deprecated
    @Generated
    @Selector("addMediaItems:completionHandler:")
    public native void addMediaItemsCompletionHandler(@NotNull NSArray<? extends SHMediaItem> mediaItems,
            @NotNull @ObjCBlock(name = "call_addMediaItemsCompletionHandler") Block_addMediaItemsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addMediaItemsCompletionHandler {
        @Generated
        void call_addMediaItemsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SHMediaLibrary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SHMediaLibrary allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * An instance of the user's default Shazam library.
     * 
     * API-Since: 15.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use SHLibrary instead
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("defaultLibrary")
    public static native SHMediaLibrary defaultLibrary();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SHMediaLibrary init();

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
    public static native SHMediaLibrary new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
