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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An accessory using a custom view.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICellAccessoryCustomView extends UICellAccessory {
    static {
        NatJ.register();
    }

    @Generated
    protected UICellAccessoryCustomView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICellAccessoryCustomView alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UICellAccessoryCustomView allocWithZone(VoidPtr zone);

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
    @Selector("customView")
    public native UIView customView();

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
    public native UICellAccessoryCustomView init();

    @Generated
    @Selector("initWithCoder:")
    public native UICellAccessoryCustomView initWithCoder(NSCoder coder);

    /**
     * Creates a new custom view accessory using the provided view and specified placement. The custom view must have translatesAutoresizingMaskIntoConstraints
     * enabled, but may use auto layout constraints internally for layout of subviews and/or to indicate its preferred size.
     */
    @Generated
    @Selector("initWithCustomView:placement:")
    public native UICellAccessoryCustomView initWithCustomViewPlacement(UIView customView, @NInt long placement);

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
     * Whether the current frame size of the view is preserved (YES), or whether it is sized during layout of accessories (NO). Default is NO.
     */
    @Generated
    @Selector("maintainsFixedSize")
    public native boolean maintainsFixedSize();

    @Generated
    @Owned
    @Selector("new")
    public static native UICellAccessoryCustomView new_objc();

    @Generated
    @Selector("placement")
    @NInt
    public native long placement();

    /**
     * Allows customizing the relative position of the accessory amongst any other accessories displayed on the same edge.
     * The default is to insert the accessory at a position closest to the inside of the cell.
     */
    @Generated
    @Selector("position")
    @ObjCBlock(name = "call_position_ret")
    public native Block_position_ret position();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_position_ret {
        @Generated
        @NUInt
        long call_position_ret(NSArray<? extends UICellAccessory> accessories);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Whether the current frame size of the view is preserved (YES), or whether it is sized during layout of accessories (NO). Default is NO.
     */
    @Generated
    @Selector("setMaintainsFixedSize:")
    public native void setMaintainsFixedSize(boolean value);

    /**
     * Allows customizing the relative position of the accessory amongst any other accessories displayed on the same edge.
     * The default is to insert the accessory at a position closest to the inside of the cell.
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ObjCBlock(name = "call_setPosition") Block_setPosition value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPosition {
        @Generated
        @NUInt
        long call_setPosition(NSArray<? extends UICellAccessory> accessories);
    }

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
}
