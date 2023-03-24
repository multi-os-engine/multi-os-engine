package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIContextMenuInteractionDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIContextMenuInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIContextMenuInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIContextMenuInteraction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIContextMenuInteraction allocWithZone(VoidPtr zone);

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
     * The interaction's delegate.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIContextMenuInteractionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIContextMenuInteraction init();

    @Generated
    @Selector("initWithDelegate:")
    public native UIContextMenuInteraction initWithDelegate(
            @NotNull @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionDelegate delegate);

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

    /**
     * Returns the interaction's location within the given view.
     * 
     * @param view The view in which to locate the interaction.
     */
    @Generated
    @Selector("locationInView:")
    @ByValue
    public native CGPoint locationInView(@Nullable UIView view);

    @Generated
    @Owned
    @Selector("new")
    public static native UIContextMenuInteraction new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("view")
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(@Nullable UIView view);

    /**
     * Dismisses the currently presented menu (if there is one).
     */
    @Generated
    @Selector("dismissMenu")
    public native void dismissMenu();

    /**
     * Appearance of the menu this interaction has presented or is about to present. Since it may be
     * dependent on the user's input method, the appearance is only known while the interaction is active.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("menuAppearance")
    @NInt
    public native long menuAppearance();

    /**
     * Call to update the currently visible menu. This method does nothing if called before a menu is presented.
     * 
     * @param block Called with a mutable copy of the currently visible menu. Modify and return this menu (or an
     *              entirely
     *              new one) to change the currently visible menu items. Starting in iOS 15, this block is called once
     *              for
     *              every visible submenu. For example, in the following hierarchy:
     * 
     *              *- Root Menu
     *              *- Submenu A
     *              *- Submenu B
     *              *- Submenu C
     * 
     *              If Submenu A is visible, the block is called twice (once for the Root Menu and once for Submenu A).
     *              If both A and B are visible, it's called 3 times (for the Root Menu, A, and B).
     * 
     *              API-Since: 14.0
     */
    @Generated
    @Selector("updateVisibleMenuWithBlock:")
    public native void updateVisibleMenuWithBlock(
            @NotNull @ObjCBlock(name = "call_updateVisibleMenuWithBlock") Block_updateVisibleMenuWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateVisibleMenuWithBlock {
        @NotNull
        @Generated
        UIMenu call_updateVisibleMenuWithBlock(@NotNull UIMenu visibleMenu);
    }
}
