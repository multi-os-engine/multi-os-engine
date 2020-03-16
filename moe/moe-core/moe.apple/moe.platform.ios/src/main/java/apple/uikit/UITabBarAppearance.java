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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("selectionIndicatorImage")
    public native UIImage selectionIndicatorImage();

    @Generated
    @Selector("selectionIndicatorTintColor")
    public native UIColor selectionIndicatorTintColor();

    @Generated
    @Selector("setCompactInlineLayoutAppearance:")
    public native void setCompactInlineLayoutAppearance(UITabBarItemAppearance value);

    @Generated
    @Selector("setInlineLayoutAppearance:")
    public native void setInlineLayoutAppearance(UITabBarItemAppearance value);

    @Generated
    @Selector("setSelectionIndicatorImage:")
    public native void setSelectionIndicatorImage(UIImage value);

    @Generated
    @Selector("setSelectionIndicatorTintColor:")
    public native void setSelectionIndicatorTintColor(UIColor value);

    @Generated
    @Selector("setStackedItemPositioning:")
    public native void setStackedItemPositioning(@NInt long value);

    @Generated
    @Selector("setStackedItemSpacing:")
    public native void setStackedItemSpacing(@NFloat double value);

    @Generated
    @Selector("setStackedItemWidth:")
    public native void setStackedItemWidth(@NFloat double value);

    @Generated
    @Selector("setStackedLayoutAppearance:")
    public native void setStackedLayoutAppearance(UITabBarItemAppearance value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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