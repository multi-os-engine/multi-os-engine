package apple.extensionkit;

import apple.NSObject;
import apple.extensionkit.protocol.EXHostViewControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSXPCConnection;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A view controller that hosts remote views provided by an app extension.
 * 
 * Present this view controller from your app’s interface to display the content for
 * an associated app extension. Configure the view controller with the app extension
 * identity and the specific scene you want to display. Use the associated delegate
 * object to receive notifications when the app extension becomes active or inactive.
 * 
 * For more information about presenting this view controller and using it to display
 * an app extension’s UI, see
 * <doc://com.apple.documentation/documentation/extensionkit/including-extension-based-ui-in-your-interface>.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("ExtensionKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EXHostViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected EXHostViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EXHostViewController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native EXHostViewController allocWithZone(VoidPtr zone);

    @Generated
    @Deprecated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * A custom delegate object you use to receive notifications about the activation
     * and deactivation of the app extension.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native EXHostViewControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native EXHostViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native EXHostViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native EXHostViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

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
     * Initiates an XPC connection to the app extension’s scene.
     * 
     * Call this method from your delegate's ``EXHostViewControllerDelegate/hostViewControllerDidActivate:``
     * method to initiate a scene-specific connection to the app extension.
     * 
     * - Returns: An object representing the connection.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("makeXPCConnectionWithError:")
    @Nullable
    public native NSXPCConnection makeXPCConnectionWithError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native EXHostViewController new_objc();

    /**
     * The view to display when the view controller has no app extension content to display.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("placeholderView")
    @NotNull
    public native UIView placeholderView();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A custom delegate object you use to receive notifications about the activation
     * and deactivation of the app extension.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable EXHostViewControllerDelegate value);

    /**
     * A custom delegate object you use to receive notifications about the activation
     * and deactivation of the app extension.
     * 
     * API-Since: 26.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable EXHostViewControllerDelegate value) {
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
     * The view to display when the view controller has no app extension content to display.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPlaceholderView:")
    public native void setPlaceholderView(@NotNull UIView value);

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