package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIKeyCommand;
import apple.uikit.UIMenuElement;
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
 * A ``WKWebExtensionCommand`` object encapsulates the properties for an individual web extension command.
 * 
 * Provides access to command properties such as a unique identifier, a descriptive title, and shortcut keys. Commands
 * can be used by a web extension to perform specific actions within a web extension context, such toggling features, or
 * interacting with
 * web content. These commands enhance the functionality of the extension by allowing users to invoke actions quickly.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionCommand extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionCommand(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The primary key used to trigger the command, distinct from any modifier flags.
     * 
     * This property can be customized within the app to avoid conflicts with existing shortcuts or to enable user
     * personalization.
     * It should accurately represent the activation key as used by the app, which the extension can use to display the
     * complete shortcut in its interface.
     * If no shortcut is desired for the command, the property should be set to `nil`. This value should be saved and
     * restored as needed by the app.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("activationKey")
    @Nullable
    public native String activationKey();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionCommand alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionCommand allocWithZone(VoidPtr zone);

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
     * A unique identifier for the command.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native WKWebExtensionCommand init();

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

    /**
     * A key command representation of the web extension command for use in the responder chain.
     * 
     * Provides a ``UIKeyCommand`` instance representing the web extension command, ready for integration in the app.
     * The property is `nil` if no shortcut is defined. Otherwise, the key command is fully configured with the
     * necessary input key and modifier flags
     * to perform the associated command upon activation. It can be included in a view controller or other responder's
     * ``keyCommands`` property, enabling
     * keyboard activation and discoverability of the web extension command.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("keyCommand")
    @Nullable
    public native UIKeyCommand keyCommand();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("menuItem")
    @NotNull
    public native UIMenuElement menuItem();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("modifierFlags")
    @NInt
    public native long modifierFlags();

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtensionCommand new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The primary key used to trigger the command, distinct from any modifier flags.
     * 
     * This property can be customized within the app to avoid conflicts with existing shortcuts or to enable user
     * personalization.
     * It should accurately represent the activation key as used by the app, which the extension can use to display the
     * complete shortcut in its interface.
     * If no shortcut is desired for the command, the property should be set to `nil`. This value should be saved and
     * restored as needed by the app.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setActivationKey:")
    public native void setActivationKey(@Nullable String value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setModifierFlags:")
    public native void setModifierFlags(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Descriptive title for the command aiding discoverability.
     * 
     * This title can be displayed in user interface elements such as keyboard shortcuts lists or menu items to help
     * users understand its purpose.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("title")
    @NotNull
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The web extension context associated with the command.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("webExtensionContext")
    @Nullable
    public native WKWebExtensionContext webExtensionContext();
}