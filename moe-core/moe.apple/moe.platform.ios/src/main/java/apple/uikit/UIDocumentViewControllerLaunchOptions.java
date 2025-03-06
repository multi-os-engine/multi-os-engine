package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentViewControllerLaunchOptions extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentViewControllerLaunchOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentViewControllerLaunchOptions alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIDocumentViewControllerLaunchOptions allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The background configuration.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("background")
    @NotNull
    public native UIBackgroundConfiguration background();

    /**
     * The background accessory view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("backgroundAccessoryView")
    @Nullable
    public native UIView backgroundAccessoryView();

    /**
     * The view controller for browsing documents to open.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("browserViewController")
    @NotNull
    public native UIDocumentBrowserViewController browserViewController();

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
     * Returns an action which requests the creation of a new document with the specified intent.
     * Can be used for either the primary or secondary action.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("createDocumentActionWithIntent:")
    @NotNull
    public static native UIAction createDocumentActionWithIntent(@NotNull String intent);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The view which displays an open document. Default is the view controller's view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("documentTargetView")
    @Nullable
    public native UIView documentTargetView();

    /**
     * The foreground accessory view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("foregroundAccessoryView")
    @Nullable
    public native UIView foregroundAccessoryView();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIDocumentViewControllerLaunchOptions init();

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
    public static native UIDocumentViewControllerLaunchOptions new_objc();

    /**
     * The primary action.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("primaryAction")
    @Nullable
    public native UIAction primaryAction();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The secondary action.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("secondaryAction")
    @Nullable
    public native UIAction secondaryAction();

    /**
     * The background configuration.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBackground:")
    public native void setBackground(@NotNull UIBackgroundConfiguration value);

    /**
     * The background accessory view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBackgroundAccessoryView:")
    public native void setBackgroundAccessoryView(@Nullable UIView value);

    /**
     * The view controller for browsing documents to open.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBrowserViewController:")
    public native void setBrowserViewController(@NotNull UIDocumentBrowserViewController value);

    /**
     * The view which displays an open document. Default is the view controller's view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDocumentTargetView:")
    public native void setDocumentTargetView(@Nullable UIView value);

    /**
     * The foreground accessory view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setForegroundAccessoryView:")
    public native void setForegroundAccessoryView(@Nullable UIView value);

    /**
     * The primary action.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setPrimaryAction:")
    public native void setPrimaryAction(@Nullable UIAction value);

    /**
     * The secondary action.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSecondaryAction:")
    public native void setSecondaryAction(@Nullable UIAction value);

    /**
     * The title of the view. Default is the application's name.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The title of the view. Default is the application's name.
     * 
     * API-Since: 18.0
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
}