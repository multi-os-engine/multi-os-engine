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

    @Generated
    @Selector("allocWithZone:")
    public static native CPInterfaceController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The delegate for this interface controller.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPInterfaceControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Dismiss the current modally-presented template, optionally animating the dismissal.
     * <p>
     * [@note] If there is no current modally-presented template, this method will have no effect.
     */
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CPInterfaceController new_objc();

    /**
     * Pop back a single level in the template navigation hierarchy.
     */
    @Generated
    @Selector("popTemplateAnimated:")
    public native void popTemplateAnimated(boolean animated);

    /**
     * Pop back to the first template in the template navigation hierarchy.
     */
    @Generated
    @Selector("popToRootTemplateAnimated:")
    public native void popToRootTemplateAnimated(boolean animated);

    /**
     * Pop back to a specified template.
     * <p>
     * targetTemplate must exist in the current template navigation hierarchy.
     */
    @Generated
    @Selector("popToTemplate:animated:")
    public native void popToTemplateAnimated(CPTemplate targetTemplate, boolean animated);

    /**
     * Set the preferred interface style to UIUserInterfaceStyleDark for all templates. Set this value to YES prior to setting a root template
     * or pushing any templates for first appearance to have style UIUserInterfaceStyleDark. The default value is NO which will allow templates to change between light and dark styles.
     */
    @Generated
    @Selector("prefersDarkUserInterfaceStyle")
    public native boolean prefersDarkUserInterfaceStyle();

    /**
     * Present a template modally over the navigation hierarchy. Only one template may be presented at a time.
     * <p>
     * [@note] Supported template types: @c CPActionSheetTemplate, @c CPAlertTemplate, @c CPVoiceControlTemplate
     */
    @Generated
    @Selector("presentTemplate:animated:")
    public native void presentTemplateAnimated(CPTemplate templateToPresent, boolean animated);

    /**
     * The current modally-presented template.
     * <p>
     * [@warning] Reading this property may synchronously perform an IPC call to retrieve the current presented template.
     */
    @Generated
    @Selector("presentedTemplate")
    public native CPTemplate presentedTemplate();

    /**
     * Push a new template onto the template navigation hierarchy, showing it immediately.
     */
    @Generated
    @Selector("pushTemplate:animated:")
    public native void pushTemplateAnimated(CPTemplate templateToPush, boolean animated);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the root template.
     */
    @Generated
    @Selector("rootTemplate")
    public native CPTemplate rootTemplate();

    /**
     * The delegate for this interface controller.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CPInterfaceControllerDelegate value);

    /**
     * The delegate for this interface controller.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CPInterfaceControllerDelegate value) {
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
     * Set the preferred interface style to UIUserInterfaceStyleDark for all templates. Set this value to YES prior to setting a root template
     * or pushing any templates for first appearance to have style UIUserInterfaceStyleDark. The default value is NO which will allow templates to change between light and dark styles.
     */
    @Generated
    @Selector("setPrefersDarkUserInterfaceStyle:")
    public native void setPrefersDarkUserInterfaceStyle(boolean value);

    /**
     * Set the root template. If no existing templates exist in the template navigation hierarchy, the animated flag will be ignored.
     * If there is an existing template navigation hierarchy, the existing stack will be replaced by the new root template.
     */
    @Generated
    @Selector("setRootTemplate:animated:")
    public native void setRootTemplateAnimated(CPTemplate rootTemplate, boolean animated);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The current stack of templates in the navigation hierarchy.
     * <p>
     * [@warning] Reading this property may synchronously perform an IPC call to retrieve the current stack of templates.
     */
    @Generated
    @Selector("templates")
    public native NSArray<? extends CPTemplate> templates();

    /**
     * The top template in the navigation hierarchy.
     * <p>
     * [@warning] Reading this property may synchronously perform an IPC call to retrieve the current top-most template.
     */
    @Generated
    @Selector("topTemplate")
    public native CPTemplate topTemplate();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The trait collection for the car's primary screen.
     * <p>
     * Your app should use this trait collection when deriving metrics, like screen scale, for
     * your templates. For example, images you display in any template should be sized to a
     * display scale matching the scale of the @c carTraitCollection, not the scale of the
     * iOS device's main screen.
     */
    @Generated
    @Selector("carTraitCollection")
    public native UITraitCollection carTraitCollection();

    /**
     * Dismiss the current modally-presented template, optionally animating the dismissal.
     * <p>
     * [@note] If there is no current modally-presented template, this method will have no effect.
     * <p>
     * The completion block will be called after the template has been dismissed. If the template was dismissed successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided describing the failure.
     */
    @Generated
    @Selector("dismissTemplateAnimated:completion:")
    public native void dismissTemplateAnimatedCompletion(boolean animated,
            @ObjCBlock(name = "call_dismissTemplateAnimatedCompletion") Block_dismissTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dismissTemplateAnimatedCompletion {
        @Generated
        void call_dismissTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    /**
     * Pop back a single level in the template navigation hierarchy.
     * The completion block will be called after the pop completes.
     * The success parameter in the completion block indicates if any template was popped.
     */
    @Generated
    @Selector("popTemplateAnimated:completion:")
    public native void popTemplateAnimatedCompletion(boolean animated,
            @ObjCBlock(name = "call_popTemplateAnimatedCompletion") Block_popTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popTemplateAnimatedCompletion {
        @Generated
        void call_popTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    /**
     * Pop back to the first template in the template navigation hierarchy.
     * The completion block will be called after the pop completes.
     * The success parameter in the completion block indicates if any templates were popped.
     */
    @Generated
    @Selector("popToRootTemplateAnimated:completion:")
    public native void popToRootTemplateAnimatedCompletion(boolean animated,
            @ObjCBlock(name = "call_popToRootTemplateAnimatedCompletion") Block_popToRootTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popToRootTemplateAnimatedCompletion {
        @Generated
        void call_popToRootTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    /**
     * Pop back to a specified template.
     * <p>
     * targetTemplate must exist in the current template navigation hierarchy.
     * <p>
     * The completion block will be called after the pop completes.
     * If the specified template does not exist in the template stack,
     * the completion block will be called with a success parameter of NO and a non-nil NSError.
     */
    @Generated
    @Selector("popToTemplate:animated:completion:")
    public native void popToTemplateAnimatedCompletion(CPTemplate targetTemplate, boolean animated,
            @ObjCBlock(name = "call_popToTemplateAnimatedCompletion") Block_popToTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popToTemplateAnimatedCompletion {
        @Generated
        void call_popToTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    /**
     * Present a template modally over the navigation hierarchy. Only one template may be presented at a time.
     * <p>
     * [@note] Supported template types: @c CPActionSheetTemplate, @c CPAlertTemplate, @c CPVoiceControlTemplate
     * <p>
     * The completion block will be called after the template has been presented. If the template was presented successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided describing the failure.
     * <p>
     * [@note] If the template presentation is not successful AND no completion block is specified, an exception will be thrown.
     */
    @Generated
    @Selector("presentTemplate:animated:completion:")
    public native void presentTemplateAnimatedCompletion(CPTemplate templateToPresent, boolean animated,
            @ObjCBlock(name = "call_presentTemplateAnimatedCompletion") Block_presentTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentTemplateAnimatedCompletion {
        @Generated
        void call_presentTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    /**
     * Push a new template onto the template navigation hierarchy, showing it immediately.
     * <p>
     * The completion block will be called after the template has been presented. If the template was presented successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided describing the failure.
     * <p>
     * [@note] If the template presentation is not successful AND no completion block is specified, an exception will be thrown.
     */
    @Generated
    @Selector("pushTemplate:animated:completion:")
    public native void pushTemplateAnimatedCompletion(CPTemplate templateToPush, boolean animated,
            @ObjCBlock(name = "call_pushTemplateAnimatedCompletion") Block_pushTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pushTemplateAnimatedCompletion {
        @Generated
        void call_pushTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    /**
     * Set the root template. If no existing templates exist in the template navigation hierarchy, the animated flag will be ignored.
     * If there is an existing template navigation hierarchy, the existing stack will be replaced by the new root template.
     * <p>
     * The completion block will be called after the template has been presented. If the template was presented successfully,
     * the boolean parameter will be YES. Otherwise, the boolean parameter will be NO and an @c NSError will be provided describing the failure.
     * <p>
     * [@note] If the template presentation is not successful AND no completion block is specified, an exception will be thrown.
     */
    @Generated
    @Selector("setRootTemplate:animated:completion:")
    public native void setRootTemplateAnimatedCompletion(CPTemplate rootTemplate, boolean animated,
            @ObjCBlock(name = "call_setRootTemplateAnimatedCompletion") Block_setRootTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRootTemplateAnimatedCompletion {
        @Generated
        void call_setRootTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }
}
