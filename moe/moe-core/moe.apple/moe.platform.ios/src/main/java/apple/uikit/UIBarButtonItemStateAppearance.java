package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.struct.UIOffset;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarButtonItemStateAppearance extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarButtonItemStateAppearance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarButtonItemStateAppearance alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIBarButtonItemStateAppearance allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * A background image to display around the button
     */
    @Generated
    @Selector("backgroundImage")
    public native UIImage backgroundImage();

    /**
     * An offset to apply to the backgroundImage.
     */
    @Generated
    @Selector("backgroundImagePositionAdjustment")
    @ByValue
    public native UIOffset backgroundImagePositionAdjustment();

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
    public native UIBarButtonItemStateAppearance init();

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
    public static native UIBarButtonItemStateAppearance new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A background image to display around the button
     */
    @Generated
    @Selector("setBackgroundImage:")
    public native void setBackgroundImage(UIImage value);

    /**
     * An offset to apply to the backgroundImage.
     */
    @Generated
    @Selector("setBackgroundImagePositionAdjustment:")
    public native void setBackgroundImagePositionAdjustment(@ByValue UIOffset value);

    /**
     * An offset to apply to the button's title position
     */
    @Generated
    @Selector("setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByValue UIOffset value);

    /**
     * Text attributes to be used for rendering title text. If the font or color are unspecified, appropriate defaults are supplied.
     */
    @Generated
    @Selector("setTitleTextAttributes:")
    public native void setTitleTextAttributes(NSDictionary<String, ?> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * An offset to apply to the button's title position
     */
    @Generated
    @Selector("titlePositionAdjustment")
    @ByValue
    public native UIOffset titlePositionAdjustment();

    /**
     * Text attributes to be used for rendering title text. If the font or color are unspecified, appropriate defaults are supplied.
     */
    @Generated
    @Selector("titleTextAttributes")
    public native NSDictionary<String, ?> titleTextAttributes();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
