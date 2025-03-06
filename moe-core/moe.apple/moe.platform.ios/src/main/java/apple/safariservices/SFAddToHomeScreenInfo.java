package apple.safariservices;

import apple.NSObject;
import apple.browserenginekit.BEWebAppManifest;
import apple.foundation.NSArray;
import apple.foundation.NSHTTPCookie;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.2
 */
@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFAddToHomeScreenInfo extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SFAddToHomeScreenInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFAddToHomeScreenInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SFAddToHomeScreenInfo allocWithZone(VoidPtr zone);

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
    public native SFAddToHomeScreenInfo init();

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("initWithManifest:")
    @NotNull
    public native SFAddToHomeScreenInfo initWithManifest(@NotNull BEWebAppManifest manifest);

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

    /**
     * A property for the web app manifest.
     * This is only available to apps that can use BrowserEngineKit.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("manifest")
    @NotNull
    public native BEWebAppManifest manifest();

    @Generated
    @Owned
    @Selector("new")
    public static native SFAddToHomeScreenInfo new_objc();

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
     * An optional item for providing the website's cookies.
     * These will be copied to the Home Screen web app's data store. This will
     * only be used if the manifest is non-nil and a Home Screen
     * web app is created, not a Home Screen Bookmark.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setWebsiteCookies:")
    public native void setWebsiteCookies(@NotNull NSArray<? extends NSHTTPCookie> value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An optional item for providing the website's cookies.
     * These will be copied to the Home Screen web app's data store. This will
     * only be used if the manifest is non-nil and a Home Screen
     * web app is created, not a Home Screen Bookmark.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("websiteCookies")
    @NotNull
    public native NSArray<? extends NSHTTPCookie> websiteCookies();
}