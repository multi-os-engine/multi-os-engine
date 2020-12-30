package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIMenu extends UIMenuElement {
    static {
        NatJ.register();
    }

    @Generated
    protected UIMenu(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIMenu alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * The menu's sub-elements and sub-menus. On iOS 14.0, elements of your own menus are mutable, -copying a menu will produce mutable elements, and UIKit will take immutable copies of menus it receives. Prior to iOS 14.0, menus are always fully immutable.
     */
    @Generated
    @Selector("children")
    public native NSArray<? extends UIMenuElement> children();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
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
     * Unique identifier.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native UIMenu init();

    @Generated
    @Selector("initWithCoder:")
    public native UIMenu initWithCoder(NSCoder coder);

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
     * @abstract Copies this menu and replaces its children.
     * 
     * @param newChildren  The replacement children.
     * 
     * @return A copy of this menu with updated children.
     */
    @Generated
    @Selector("menuByReplacingChildren:")
    public native UIMenu menuByReplacingChildren(NSArray<? extends UIMenuElement> newChildren);

    /**
     * @abstract Creates a UIMenu with the given arguments.
     * 
     * @param title       The menu's title.
     * @param children    The menu's action-based sub-elements and sub-menus.
     * 
     * @return A new UIMenu.
     */
    @Generated
    @Selector("menuWithTitle:children:")
    public static native UIMenu menuWithTitleChildren(String title, NSArray<? extends UIMenuElement> children);

    /**
     * @abstract Creates a UIMenu with the given arguments.
     * 
     * @param title       The menu's title.
     * @param image       Image to be displayed alongside the menu's title.
     * @param identifier  The menu's unique identifier. Pass nil to use an auto-generated identifier.
     * @param options     The menu's options.
     * @param children    The menu's action-based sub-elements and sub-menus.
     * 
     * @return A new UIMenu.
     */
    @Generated
    @Selector("menuWithTitle:image:identifier:options:children:")
    public static native UIMenu menuWithTitleImageIdentifierOptionsChildren(String title, UIImage image,
            String identifier, @NUInt long options, NSArray<? extends UIMenuElement> children);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Options.
     */
    @Generated
    @Selector("options")
    @NUInt
    public native long options();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @abstract Creates a UIMenu with an empty title, nil image, automatically generated identifier, and default options.
     * 
     * @param children    The menu's action-based sub-elements and sub-menus.
     * 
     * @return A new UIMenu.
     */
    @Generated
    @Selector("menuWithChildren:")
    public static native UIMenu menuWithChildren(NSArray<? extends UIMenuElement> children);
}