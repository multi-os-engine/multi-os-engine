package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPInterfaceControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UITraitCollection;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPInterfaceController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CPInterfaceController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPInterfaceController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPInterfaceController allocWithZone(VoidPtr zone);

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
     * The delegate for this interface controller.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPInterfaceControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Dismiss the current modally-presented template, optionally animating the dismissal.
     * 
     * [@note] If there is no current modally-presented template, this method will have no effect.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("dismissTemplateAnimated:")
    public native void dismissTemplateAnimated(boolean animated);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPInterfaceController init();

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
    public static native CPInterfaceController new_objc();

    /**
     * Pop back a single level in the template navigation hierarchy.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("popTemplateAnimated:")
    public native void popTemplateAnimated(boolean animated);

    /**
     * Pop back to the first template in the template navigation hierarchy.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("popToRootTemplateAnimated:")
    public native void popToRootTemplateAnimated(boolean animated);

    /**
     * Pop back to a specified template.
     * 
     * targetTemplate must exist in the current template navigation hierarchy.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("popToTemplate:animated:")
    public native void popToTemplateAnimated(@NotNull CPTemplate targetTemplate, boolean animated);

    /**
     * Set the preferred interface style to UIUserInterfaceStyleDark for all templates. Set this value to YES prior to
     * setting a root template
     * or pushing any templates for first appearance to have style UIUserInterfaceStyleDark. The default value is NO
     * which will allow templates to change between light and dark styles.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("prefersDarkUserInterfaceStyle")
    public native boolean prefersDarkUserInterfaceStyle();

    /**
     * Present a template modally over the navigation hierarchy. Only one template may be presented at a time.
     * 
     * [@note] Supported template types: @c CPActionSheetTemplate, @c CPAlertTemplate, @c CPVoiceControlTemplate
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("presentTemplate:animated:")
    public native void presentTemplateAnimated(@NotNull CPTemplate templateToPresent, boolean animated);

    /**
     * The current modally-presented template.
     * 
     * [@warning] Reading this property may synchronously perform an IPC call to retrieve the current presented
     * template.
     */
    @Nullable
    @Generated
    @Selector("presentedTemplate")
    public native CPTemplate presentedTemplate();

    /**
     * Push a new template onto the template navigation hierarchy, showing it immediately.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("pushTemplate:animated:")
    public native void pushTemplateAnimated(@NotNull CPTemplate templateToPush, boolean animated);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the root template.
     */
    @NotNull
    @Generated
    @Selector("rootTemplate")
    public native CPTemplate rootTemplate();

    /**
     * The delegate for this interface controller.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) CPInterfaceControllerDelegate value);

    /**
     * The delegate for this interface controller.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CPInterfaceControllerDelegate value) {
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
     * Set the preferred interface style to UIUserInterfaceStyleDark for all templates. Set this value to YES prior to
     * setting a root template
     * or pushing any templates for first appearance to have style UIUserInterfaceStyleDark. The default value is NO
     * which will allow templates to change between light and dark styles.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPrefersDarkUserInterfaceStyle:")
    public native void setPrefersDarkUserInterfaceStyle(boolean value);

    /**
     * Set the root template. If no existing templates exist in the template navigation hierarchy, the animated flag
     * will be ignored.
     * If there is an existing template navigation hierarchy, the existing stack will be replaced by the new root
     * template.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("setRootTemplate:animated:")
    public native void setRootTemplateAnimated(@NotNull CPTemplate rootTemplate, boolean animated);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The current stack of templates in the navigation hierarchy.
     * 
     * [@warning] Reading this property may synchronously perform an IPC call to retrieve the current stack of
     * templates.
     */
    @NotNull
    @Generated
    @Selector("templates")
    public native NSArray<? extends CPTemplate> templates();

    /**
     * The top template in the navigation hierarchy.
     * 
     * [@warning] Reading this property may synchronously perform an IPC call to retrieve the current top-most template.
     */
    @Nullable
    @Generated
    @Selector("topTemplate")
    public native CPTemplate topTemplate();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The trait collection for the car's primary screen.
     * 
     * Your app should use this trait collection when deriving metrics, like screen scale, for
     * your templates. For example, images you display in any template should be sized to a
     * display scale matching the scale of the @c carTraitCollection, not the scale of the
     * iOS device's main screen.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("carTraitCollection")
    public native UITraitCollection carTraitCollection();

    /**
     * Dismiss the current modally-presented template, optionally animating the dismissal.
     * 
     * [@note] If there is no current modally-presented template, this method will have no effect.
     * 
     * The completion block will be called after the template has been dismissed. If the template was dismissed
     * successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided
     * describing the failure.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("dismissTemplateAnimated:completion:")
    public native void dismissTemplateAnimatedCompletion(boolean animated,
            @Nullable @ObjCBlock(name = "call_dismissTemplateAnimatedCompletion") Block_dismissTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dismissTemplateAnimatedCompletion {
        @Generated
        void call_dismissTemplateAnimatedCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Pop back a single level in the template navigation hierarchy.
     * The completion block will be called after the pop completes.
     * The success parameter in the completion block indicates if any template was popped.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("popTemplateAnimated:completion:")
    public native void popTemplateAnimatedCompletion(boolean animated,
            @Nullable @ObjCBlock(name = "call_popTemplateAnimatedCompletion") Block_popTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popTemplateAnimatedCompletion {
        @Generated
        void call_popTemplateAnimatedCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Pop back to the first template in the template navigation hierarchy.
     * The completion block will be called after the pop completes.
     * The success parameter in the completion block indicates if any templates were popped.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("popToRootTemplateAnimated:completion:")
    public native void popToRootTemplateAnimatedCompletion(boolean animated,
            @Nullable @ObjCBlock(name = "call_popToRootTemplateAnimatedCompletion") Block_popToRootTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popToRootTemplateAnimatedCompletion {
        @Generated
        void call_popToRootTemplateAnimatedCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Pop back to a specified template.
     * 
     * targetTemplate must exist in the current template navigation hierarchy.
     * 
     * The completion block will be called after the pop completes.
     * If the specified template does not exist in the template stack,
     * the completion block will be called with a success parameter of NO and a non-nil NSError.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("popToTemplate:animated:completion:")
    public native void popToTemplateAnimatedCompletion(@NotNull CPTemplate targetTemplate, boolean animated,
            @Nullable @ObjCBlock(name = "call_popToTemplateAnimatedCompletion") Block_popToTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popToTemplateAnimatedCompletion {
        @Generated
        void call_popToTemplateAnimatedCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Present a template modally over the navigation hierarchy. Only one template may be presented at a time.
     * 
     * [@note] Supported template types: @c CPActionSheetTemplate, @c CPAlertTemplate, @c CPVoiceControlTemplate
     * 
     * The completion block will be called after the template has been presented. If the template was presented
     * successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided
     * describing the failure.
     * 
     * [@note] If the template presentation is not successful AND no completion block is specified, an exception will be
     * thrown.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("presentTemplate:animated:completion:")
    public native void presentTemplateAnimatedCompletion(@NotNull CPTemplate templateToPresent, boolean animated,
            @Nullable @ObjCBlock(name = "call_presentTemplateAnimatedCompletion") Block_presentTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentTemplateAnimatedCompletion {
        @Generated
        void call_presentTemplateAnimatedCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Push a new template onto the template navigation hierarchy, showing it immediately.
     * 
     * The completion block will be called after the template has been presented. If the template was presented
     * successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided
     * describing the failure.
     * 
     * [@note] If the template presentation is not successful AND no completion block is specified, an exception will be
     * thrown.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("pushTemplate:animated:completion:")
    public native void pushTemplateAnimatedCompletion(@NotNull CPTemplate templateToPush, boolean animated,
            @Nullable @ObjCBlock(name = "call_pushTemplateAnimatedCompletion") Block_pushTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pushTemplateAnimatedCompletion {
        @Generated
        void call_pushTemplateAnimatedCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * Set the root template. If no existing templates exist in the template navigation hierarchy, the animated flag
     * will be ignored.
     * If there is an existing template navigation hierarchy, the existing stack will be replaced by the new root
     * template.
     * 
     * The completion block will be called after the template has been presented. If the template was presented
     * successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided
     * describing the failure.
     * 
     * [@note] If the template presentation is not successful AND no completion block is specified, an exception will be
     * thrown.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setRootTemplate:animated:completion:")
    public native void setRootTemplateAnimatedCompletion(@NotNull CPTemplate rootTemplate, boolean animated,
            @Nullable @ObjCBlock(name = "call_setRootTemplateAnimatedCompletion") Block_setRootTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRootTemplateAnimatedCompletion {
        @Generated
        void call_setRootTemplateAnimatedCompletion(boolean success, @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
