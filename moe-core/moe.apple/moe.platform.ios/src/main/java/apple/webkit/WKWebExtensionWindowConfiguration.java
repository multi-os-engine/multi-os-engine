package apple.webkit;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * A ``WKWebExtensionWindowConfiguration`` object encapsulates configuration options for a window in an extension.
 * 
 * This class holds various options that influence the behavior and initial state of a window.
 * The app retains the discretion to disregard any or all of these options, or even opt not to create a window.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionWindowConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionWindowConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionWindowConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionWindowConfiguration allocWithZone(VoidPtr zone);

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
     * Indicates the frame where the window should be positioned on the main screen.
     * 
     * This frame should override the app's default window position and size.
     * Individual components (e.g., `origin.x`, `size.width`) will be `NaN` if not specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native WKWebExtensionWindowConfiguration init();

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
    public static native WKWebExtensionWindowConfiguration new_objc();

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
     * Indicates whether the window should be focused.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("shouldBeFocused")
    public native boolean shouldBeFocused();

    /**
     * Indicates whether the window should be private.
     * [@note] To ensure proper isolation between private and non-private data, web views associated with private data
     * must use a
     * different ``WKUserContentController``. Likewise, to be identified as a private web view and to ensure that
     * cookies and other
     * website data is not shared, private web views must be configured to use a non-persistent ``WKWebsiteDataStore``.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("shouldBePrivate")
    public native boolean shouldBePrivate();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Indicates the URLs that the window should initially load as tabs.
     * 
     * If ``tabURLs`` and ``tabs`` are both empty, the app's default "start page" should appear in a tab.
     * 
     * @see tabs
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("tabURLs")
    @NotNull
    public native NSArray<? extends NSURL> tabURLs();

    /**
     * Indicates the existing tabs that should be moved to the window.
     * 
     * If ``tabs`` and ``tabURLs`` are both empty, the app's default "start page" should appear in a tab.
     * 
     * @see tabURLs
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("tabs")
    @NotNull
    public native NSArray<?> tabs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Indicates the window state for the window.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("windowState")
    @NInt
    public native long windowState();

    /**
     * Indicates the window type for the window.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("windowType")
    @NInt
    public native long windowType();
}