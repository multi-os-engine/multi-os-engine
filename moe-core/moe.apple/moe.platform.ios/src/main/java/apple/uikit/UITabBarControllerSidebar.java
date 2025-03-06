package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIContentConfiguration;
import apple.uikit.protocol.UITabBarControllerSidebarDelegate;
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
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabBarControllerSidebar extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabBarControllerSidebar(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabBarControllerSidebar alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITabBarControllerSidebar allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * A view to display at the bottom of the sidebar, like a UIToolbar. The width of this view
     * will be managed by the sidebar itself, and its height will be set to the value it returns
     * from `systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:`
     * Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bottomBarView")
    @Nullable
    public native UIView bottomBarView();

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

    /**
     * The object managing the delegate of the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native UITabBarControllerSidebarDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Content configuration for an optional header to display in the sidebar.
     * The footer is displayed below all tab content in the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("footerContentConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native UIContentConfiguration footerContentConfiguration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Content configuration for an optional header to display in the sidebar.
     * The header is displayed above all tab content in the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("headerContentConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native UIContentConfiguration headerContentConfiguration();

    @Generated
    @Selector("init")
    public native UITabBarControllerSidebar init();

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

    /**
     * Determines if the sidebar is currently hidden.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

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
    public static native UITabBarControllerSidebar new_objc();

    /**
     * The preferred layout for how the sidebar lays out with the tab bar controller's
     * content. Default is `.automatic`
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("preferredLayout")
    @NInt
    public native long preferredLayout();

    /**
     * Requests the sidebar reconfigure the item representing the specified tab. This method has no effect if the `tab`
     * is not
     * currently displayed in the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("reconfigureItemForTab:")
    public native void reconfigureItemForTab(@NotNull UITab tab);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Scrolls to the specified target in the sidebar with an option to animate the change.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("scrollToTarget:animated:")
    public native void scrollToTargetAnimated(@NotNull UITabSidebarScrollTarget target, boolean animated);

    /**
     * A view to display at the bottom of the sidebar, like a UIToolbar. The width of this view
     * will be managed by the sidebar itself, and its height will be set to the value it returns
     * from `systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:`
     * Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBottomBarView:")
    public native void setBottomBarView(@Nullable UIView value);

    /**
     * The object managing the delegate of the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable UITabBarControllerSidebarDelegate value);

    /**
     * The object managing the delegate of the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable UITabBarControllerSidebarDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Content configuration for an optional header to display in the sidebar.
     * The footer is displayed below all tab content in the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setFooterContentConfiguration:")
    public native void setFooterContentConfiguration(
            @Mapped(ObjCObjectMapper.class) @Nullable UIContentConfiguration value);

    /**
     * Content configuration for an optional header to display in the sidebar.
     * The header is displayed above all tab content in the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHeaderContentConfiguration:")
    public native void setHeaderContentConfiguration(
            @Mapped(ObjCObjectMapper.class) @Nullable UIContentConfiguration value);

    /**
     * Determines if the sidebar is currently hidden.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * The preferred layout for how the sidebar lays out with the tab bar controller's
     * content. Default is `.automatic`
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setPreferredLayout:")
    public native void setPreferredLayout(@NInt long value);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}