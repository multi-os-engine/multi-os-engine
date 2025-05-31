package apple.webkit;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
import apple.uikit.UIMenuElement;
import apple.uikit.UIViewController;
import apple.webkit.protocol.WKWebExtensionTab;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * A ``WKWebExtensionAction`` object encapsulates the properties for an individual web extension action.
 * 
 * Provides access to action properties such as popup, icon, and title, with tab-specific values.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionAction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionAction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionAction allocWithZone(VoidPtr zone);

    /**
     * The tab that this action is associated with, or `nil` if it is the default action.
     * 
     * When this property is `nil`, it indicates that the action is the default action and not associated with a
     * specific tab.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("associatedTab")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native WKWebExtensionTab associatedTab();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The badge text for the action.
     * 
     * Provides the text that appears on the badge for the action. An empty string signifies that no badge should be
     * shown.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("badgeText")
    @NotNull
    public native String badgeText();

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

    /**
     * Triggers the dismissal process of the popup.
     * 
     * Invoke this method to manage the popup's lifecycle, ensuring the web view is unloaded and resources are released
     * once the
     * popup closes. This method is automatically called upon the dismissal of the action's ``UIViewController`` or
     * ``NSPopover``. For custom
     * scenarios where the popup's lifecycle is manually managed, it must be explicitly invoked to ensure proper
     * closure.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("closePopup")
    public native void closePopup();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A Boolean value indicating whether the badge text is unread.
     * 
     * This property is automatically set to `YES` when ``badgeText`` changes and is not empty. If ``badgeText`` becomes
     * empty or the
     * popup associated with the action is presented, this property is automatically set to `NO`. Additionally, it
     * should be set to `NO` by the app when the badge
     * has been presented to the user. This property is useful for higher-level notification badges when extensions
     * might be hidden behind an action sheet.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasUnreadBadgeText")
    public native boolean hasUnreadBadgeText();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("iconForSize:")
    @Nullable
    public native UIImage iconForSize(@ByValue CGSize size);

    @Generated
    @Selector("init")
    public native WKWebExtensionAction init();

    /**
     * The name shown when inspecting the popup web view.
     * 
     * This is the text that will appear when inspecting the popup web view.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("inspectionName")
    @Nullable
    public native String inspectionName();

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
     * A Boolean value indicating whether the action is enabled.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The localized display label for the action.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("label")
    @NotNull
    public native String label();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("menuItems")
    @NotNull
    public native NSArray<? extends UIMenuElement> menuItems();

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtensionAction new_objc();

    /**
     * A view controller that presents a web view loaded with the popup page for this action, or `nil` if no popup is
     * specified.
     * 
     * The view controller adaptively adjusts its presentation style based on where it is presented from, preferring
     * popover.
     * It contains a web view preloaded with the popup page and automatically adjusts its ``preferredContentSize`` to
     * fit the web view's
     * content size. The ``presentsPopup`` property should be checked to determine the availability of a popup before
     * using this property.
     * Dismissing the view controller will close the popup and unload the web view.
     * 
     * @see presentsPopup
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("popupViewController")
    @Nullable
    public native UIViewController popupViewController();

    /**
     * A web view loaded with the popup page for this action, or `nil` if no popup is specified.
     * 
     * The web view will be preloaded with the popup page upon first access or after it has been unloaded. Use the
     * ``presentsPopup``
     * property to determine whether a popup should be displayed before using this property.
     * 
     * @see presentsPopup
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("popupWebView")
    @Nullable
    public native WKWebView popupWebView();

    /**
     * A Boolean value indicating whether the action has a popup.
     * 
     * Use this property to check if the action has a popup before attempting to show any popup views.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("presentsPopup")
    public native boolean presentsPopup();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A Boolean value indicating whether the badge text is unread.
     * 
     * This property is automatically set to `YES` when ``badgeText`` changes and is not empty. If ``badgeText`` becomes
     * empty or the
     * popup associated with the action is presented, this property is automatically set to `NO`. Additionally, it
     * should be set to `NO` by the app when the badge
     * has been presented to the user. This property is useful for higher-level notification badges when extensions
     * might be hidden behind an action sheet.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setHasUnreadBadgeText:")
    public native void setHasUnreadBadgeText(boolean value);

    /**
     * The name shown when inspecting the popup web view.
     * 
     * This is the text that will appear when inspecting the popup web view.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setInspectionName:")
    public native void setInspectionName(@Nullable String value);

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

    /**
     * The extension context to which this action is related.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("webExtensionContext")
    @Nullable
    public native WKWebExtensionContext webExtensionContext();
}