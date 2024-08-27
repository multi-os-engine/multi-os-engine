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
 * [@c] SHMediaLibrary represents the user's synced Shazam library.
 * 
 * You can add new @c SHMediaItem instances to the user's library.
 * 
 * API-Since: 15.0
 * Deprecated-Since: 100000.0
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
     * Adds an array of media items to the user's Shazam library.
     * 
     * For each @c SHMediaItem instance passed in, the following @c SHMediaItemProperty keys will be saved:
     * [@c] SHMediaItemShazamID, @c SHMediaItemTitle, @c SHMediaItemSubtitle.
     * If @c SHMediaItemSubtitle is not set it may fallback to use @c SHMediaItemArtist if available.
     * 
     * [@note] @c SHMediaItemShazamID is required for each @c SHMediaItem to be considered valid.
     * [@c] SHMediaItemShazamID must be a numeric only string
     * 
     * @param mediaItems        An array containing the @c SHMediaItem objects to be added to the library.
     * @param completionHandler A block called after all valid @c SHMediaItem objects have been added to the library. If
     *                          an error occurred, the error parameter will be populated.
     */
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
     * Returns an instance of the default Shazam library.
     */
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
