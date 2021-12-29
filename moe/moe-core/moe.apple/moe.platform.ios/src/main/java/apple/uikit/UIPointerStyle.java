package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPointerStyle extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPointerStyle(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPointerStyle alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPointerStyle allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
     * Hides the pointer when hovering over the current region.
     */
    @Generated
    @Selector("hiddenPointerStyle")
    public static native UIPointerStyle hiddenPointerStyle();

    @Generated
    @Selector("init")
    public native UIPointerStyle init();

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
    public static native UIPointerStyle new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Applies the provided content effect and pointer shape within the current region.
     *
     * @param effect The desired pointer effect.
     * @param shape  The desired pointer shape. If omitted, a pointer will be generated automatically from the effect's preview view.
     */
    @Generated
    @Selector("styleWithEffect:shape:")
    public static native UIPointerStyle styleWithEffectShape(UIPointerEffect effect, UIPointerShape shape);

    /**
     * Morphs the pointer into the provided shape when hovering over the current region.
     *
     * @param shape The desired pointer shape.
     * @param axes  Axes along which to recenter the pointer on touch up.
     */
    @Generated
    @Selector("styleWithShape:constrainedAxes:")
    public static native UIPointerStyle styleWithShapeConstrainedAxes(UIPointerShape shape, @NUInt long axes);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Accessories to display alongside this UIPointerStyle. Supports up to 4 accessories.
     * The system will attempt to animate between neighboring or similar accessories.
     */
    @Generated
    @Selector("accessories")
    public native NSArray<? extends UIPointerAccessory> accessories();

    /**
     * Accessories to display alongside this UIPointerStyle. Supports up to 4 accessories.
     * The system will attempt to animate between neighboring or similar accessories.
     */
    @Generated
    @Selector("setAccessories:")
    public native void setAccessories(NSArray<? extends UIPointerAccessory> value);

    /**
     * Pointer style that displays an unconstrained system pointer. Use this to display accessories alongside the default pointer.
     */
    @Generated
    @Selector("systemPointerStyle")
    public static native UIPointerStyle systemPointerStyle();
}
