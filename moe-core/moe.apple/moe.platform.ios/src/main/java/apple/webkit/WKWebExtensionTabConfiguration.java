package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.webkit.protocol.WKWebExtensionTab;
import apple.webkit.protocol.WKWebExtensionWindow;
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
 * A ``WKWebExtensionTabConfiguration`` object encapsulates configuration options for a tab in an extension.
 * 
 * This class holds various options that influence the behavior and initial state of a tab.
 * The app retains the discretion to disregard any or all of these options, or even opt not to create a tab.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionTabConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionTabConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionTabConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionTabConfiguration allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Indicates the position where the tab should be opened within the window.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("index")
    @NUInt
    public native long index();

    @Generated
    @Selector("init")
    public native WKWebExtensionTabConfiguration init();

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
    public static native WKWebExtensionTabConfiguration new_objc();

    /**
     * Indicates the parent tab with which the tab should be related.
     * 
     * If this property is `nil`, no parent tab was specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("parentTab")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native WKWebExtensionTab parentTab();

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
     * Indicates whether the tab should be added to the current tab selection.
     * 
     * If this property is `YES`, the tab should be part of the current selection, but not necessarily
     * become the active tab unless ``shouldBeActive`` is also `YES`. If this property is `NO`, the tab shouldn't
     * be part of the current selection.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("shouldAddToSelection")
    public native boolean shouldAddToSelection();

    /**
     * Indicates whether the tab should be the active tab.
     * 
     * If this property is `YES`, the tab should be made active in the window, ensuring it is
     * the frontmost tab. Being active implies the tab is also selected. If this property is `NO`, the tab shouldn't
     * affect the currently active tab.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("shouldBeActive")
    public native boolean shouldBeActive();

    /**
     * Indicates whether the tab should be muted.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("shouldBeMuted")
    public native boolean shouldBeMuted();

    /**
     * Indicates whether the tab should be pinned.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("shouldBePinned")
    public native boolean shouldBePinned();

    /**
     * Indicates whether reader mode in the tab should be active.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("shouldReaderModeBeActive")
    public native boolean shouldReaderModeBeActive();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Indicates the initial URL for the tab.
     * 
     * If this property is `nil`, the app's default "start page" should appear in the tab.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("url")
    @Nullable
    public native NSURL url();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Indicates the window where the tab should be opened.
     * 
     * If this property is `nil`, no window was specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("window")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native WKWebExtensionWindow window();
}