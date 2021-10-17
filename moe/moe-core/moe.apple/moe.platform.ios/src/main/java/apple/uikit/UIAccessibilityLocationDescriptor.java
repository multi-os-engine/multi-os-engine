package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * UIAccessibilityLocationDescriptor objects are used to describe to assistive
 * technologies points of interest within a view; where they are and how an assistive technology
 * should describe them. For example, the `accessibilityDragSourceDescriptors` and
 * `accessibilityDropPointDescriptors` properties in the UIAccessibilityDragging informal protocol
 * use UIAccessibilityLocationDescriptor objects to describe where drags may begin and end.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIAccessibilityLocationDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIAccessibilityLocationDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIAccessibilityLocationDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIAccessibilityLocationDescriptor allocWithZone(VoidPtr zone);

    /**
     * Assistive technologies will use the attributedName of the descriptor when describing it to the
     * user (for instance, VoiceOver will speak it).
     */
    @Generated
    @Selector("attributedName")
    public native NSAttributedString attributedName();

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

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIAccessibilityLocationDescriptor init();

    @Generated
    @Selector("initWithAttributedName:point:inView:")
    public native UIAccessibilityLocationDescriptor initWithAttributedNamePointInView(NSAttributedString attributedName,
            @ByValue CGPoint point, UIView view);

    /**
     * Provide the view, the point in that view's coordinate space that is of interest, and a name to
     * use to describe it to the user.
     */
    @Generated
    @Selector("initWithName:point:inView:")
    public native UIAccessibilityLocationDescriptor initWithNamePointInView(String name, @ByValue CGPoint point,
            UIView view);

    /**
     * Convenience initializer that uses the view's accessibilityActivationPoint. (This point will be
     * converted to the coordinate space of the view).
     * <p>
     * Note that by default, the accessibilityActivationPoint of a view is its center.
     */
    @Generated
    @Selector("initWithName:view:")
    public native UIAccessibilityLocationDescriptor initWithNameView(String name, UIView view);

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
     * The "name" property and initializer are conveniences for referring to the "attributedName"
     * property, which is the real underlying property.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native UIAccessibilityLocationDescriptor new_objc();

    /**
     * The point in the view that is being described. The point is in the view's coordinate space.
     */
    @Generated
    @Selector("point")
    @ByValue
    public native CGPoint point();

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

    /**
     * The view in which the described point resides.
     * <p>
     * This property is weak to make it simple to avoid reference cycles. Descriptors whose views have
     * been deallocated (or are no longer in a visible window, or are obscured) will be silently
     * ignored. That said, you should still clean up after yourself.
     */
    @Generated
    @Selector("view")
    public native UIView view();
}
