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
import org.moe.natj.general.ann.NFloat;
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
public class UITabBarAppearance extends UIBarAppearance {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabBarAppearance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabBarAppearance alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITabBarAppearance allocWithZone(VoidPtr zone);

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

    /**
     * The appearance for the compact inline tab bar item layout
     */
    @Generated
    @Selector("compactInlineLayoutAppearance")
    public native UITabBarItemAppearance compactInlineLayoutAppearance();

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
    public native UITabBarAppearance init();

    @Generated
    @Selector("initWithBarAppearance:")
    public native UITabBarAppearance initWithBarAppearance(UIBarAppearance barAppearance);

    @Generated
    @Selector("initWithCoder:")
    public native UITabBarAppearance initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithIdiom:")
    public native UITabBarAppearance initWithIdiom(@NInt long idiom);

    /**
     * The appearance for the inline tab bar item layout
     */
    @Generated
    @Selector("inlineLayoutAppearance")
    public native UITabBarItemAppearance inlineLayoutAppearance();

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
    public static native UITabBarAppearance new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An image that is rendered behind the selected UITabBarItem and above the tab bar's background. Modified by
     * selectionIndicatorTintColor when appropriate.
     */
    @Generated
    @Selector("selectionIndicatorImage")
    public native UIImage selectionIndicatorImage();

    /**
     * A color to use for the selectionIndicator, its specific behavior depends on the value of selectionIndicatorImage.
     * If selectionIndicatorImage is nil, then the selectionIndicatorTintColor is used to color the UITabBar's default
     * selection indicator; a nil or clearColor selectionIndicatorTintColor will result in no indicator. If
     * selectionIndicatorImage is a template image, then the selectionIndicatorTintColor is used to tint the image; a
     * nil or clearColor selectionIndicatorTintColor will also result in no indicator. If the selectionIndicatorImage is
     * not a template image, then it will be rendered without respect to the value of selectionIndicatorTintColor.
     */
    @Generated
    @Selector("selectionIndicatorTintColor")
    public native UIColor selectionIndicatorTintColor();

    /**
     * The appearance for the compact inline tab bar item layout
     */
    @Generated
    @Selector("setCompactInlineLayoutAppearance:")
    public native void setCompactInlineLayoutAppearance(UITabBarItemAppearance value);

    /**
     * The appearance for the inline tab bar item layout
     */
    @Generated
    @Selector("setInlineLayoutAppearance:")
    public native void setInlineLayoutAppearance(UITabBarItemAppearance value);

    /**
     * An image that is rendered behind the selected UITabBarItem and above the tab bar's background. Modified by
     * selectionIndicatorTintColor when appropriate.
     */
    @Generated
    @Selector("setSelectionIndicatorImage:")
    public native void setSelectionIndicatorImage(UIImage value);

    /**
     * A color to use for the selectionIndicator, its specific behavior depends on the value of selectionIndicatorImage.
     * If selectionIndicatorImage is nil, then the selectionIndicatorTintColor is used to color the UITabBar's default
     * selection indicator; a nil or clearColor selectionIndicatorTintColor will result in no indicator. If
     * selectionIndicatorImage is a template image, then the selectionIndicatorTintColor is used to tint the image; a
     * nil or clearColor selectionIndicatorTintColor will also result in no indicator. If the selectionIndicatorImage is
     * not a template image, then it will be rendered without respect to the value of selectionIndicatorTintColor.
     */
    @Generated
    @Selector("setSelectionIndicatorTintColor:")
    public native void setSelectionIndicatorTintColor(UIColor value);

    /**
     * Determines how items in the tab bar lay out in the stacked item layout
     */
    @Generated
    @Selector("setStackedItemPositioning:")
    public native void setStackedItemPositioning(@NInt long value);

    @Generated
    @Selector("setStackedItemSpacing:")
    public native void setStackedItemSpacing(@NFloat double value);

    @Generated
    @Selector("setStackedItemWidth:")
    public native void setStackedItemWidth(@NFloat double value);

    /**
     * The appearance for the stacked tab bar item layout
     */
    @Generated
    @Selector("setStackedLayoutAppearance:")
    public native void setStackedLayoutAppearance(UITabBarItemAppearance value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Determines how items in the tab bar lay out in the stacked item layout
     */
    @Generated
    @Selector("stackedItemPositioning")
    @NInt
    public native long stackedItemPositioning();

    @Generated
    @Selector("stackedItemSpacing")
    @NFloat
    public native double stackedItemSpacing();

    @Generated
    @Selector("stackedItemWidth")
    @NFloat
    public native double stackedItemWidth();

    /**
     * The appearance for the stacked tab bar item layout
     */
    @Generated
    @Selector("stackedLayoutAppearance")
    public native UITabBarItemAppearance stackedLayoutAppearance();

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
