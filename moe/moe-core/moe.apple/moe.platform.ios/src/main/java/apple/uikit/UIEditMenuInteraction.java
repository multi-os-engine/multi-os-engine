package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIEditMenuInteractionDelegate;
import apple.uikit.protocol.UIInteraction;
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
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIEditMenuInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIEditMenuInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIEditMenuInteraction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIEditMenuInteraction allocWithZone(VoidPtr zone);

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
     * The object that defines the delegate of the interaction.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIEditMenuInteractionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(UIView view);

    /**
     * Dismiss the currently active menu if one is currently presented.
     */
    @Generated
    @Selector("dismissMenu")
    public native void dismissMenu();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIEditMenuInteraction init();

    /**
     * Creates a new edit menu interaction with the specified delegate.
     */
    @Generated
    @Selector("initWithDelegate:")
    public native UIEditMenuInteraction initWithDelegate(
            @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionDelegate delegate);

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

    /**
     * Returns the interaction's location within the given view.
     */
    @Generated
    @Selector("locationInView:")
    @ByValue
    public native CGPoint locationInView(UIView view);

    @Generated
    @Owned
    @Selector("new")
    public static native UIEditMenuInteraction new_objc();

    /**
     * Presents an edit menu with the specified @c configuration object.
     * If a menu is already presented, it will be dismissed automatically before the new menu is presented.
     * 
     * [@NOTE] @c presentEditMenuWithConfiguration: is not supported on Mac Catalyst.
     */
    @Generated
    @Selector("presentEditMenuWithConfiguration:")
    public native void presentEditMenuWithConfiguration(UIEditMenuConfiguration configuration);

    /**
     * Reloads the visible menu. This menu has no effect if there is no menu presented. This method will query
     * the menu again from the delegate method @c editMenuInteraction:menuForConfiguration:suggestedActions:
     * and refresh the UI with the updated menu.
     */
    @Generated
    @Selector("reloadVisibleMenu")
    public native void reloadVisibleMenu();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Updates the position of the currently visible menu, with an option to animate the action. This method
     * has no effect if no menu is presented. This method will query the position from the delegate method
     * [@c] editMenuInteraction:targetRectForConfiguration: if it is implemented.
     */
    @Generated
    @Selector("updateVisibleMenuPositionAnimated:")
    public native void updateVisibleMenuPositionAnimated(boolean animated);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("view")
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(UIView view);
}