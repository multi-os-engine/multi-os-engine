package apple.backgroundassets;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An archive of assets that the system downloads together.
 * 
 * An instance of this class can be invalidated when the asset pack that it represents is updated on the server.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BAAssetPack extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BAAssetPack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BAAssetPack alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BAAssetPack allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a download object for the asset pack that you schedule using a download manager.
     * - Remark: Use this method in your main app; use ``BAAssetPack/downloadForContentRequest:`` instead in your
     * downloader extension.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("download")
    @NotNull
    public native BADownload download();

    /**
     * Creates a download object for the asset pack that you schedule using a download manager.
     * - Parameter contentRequest: The content request for the current extension invocation.
     * - Returns: A download object.
     * - Remark: Use this method in your downloader extension; use ``BAAssetPack/download`` instead in your main app.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("downloadForContentRequest:")
    @NotNull
    public native BADownload downloadForContentRequest(@NInt long contentRequest);

    /**
     * The size of the download file containing the asset pack in bytes.
     * 
     * This is different than the installation size, which could be larger.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("downloadSize")
    @NInt
    public native long downloadSize();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * A unique identifier for the asset pack.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native BAAssetPack init();

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
    public static native BAAssetPack new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * JSON-encoded custom information that’s associated with the asset pack.
     * 
     * This property is `nil` for Apple-hosted asset packs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("userInfo")
    @Nullable
    public native NSData userInfo();

    /**
     * The asset pack’s version number
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("version")
    @NInt
    public native long version();
}