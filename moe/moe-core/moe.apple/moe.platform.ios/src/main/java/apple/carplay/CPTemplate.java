package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
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

/**
 * Abstract superclass for a template object.
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPTemplate extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPTemplate alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CPTemplate allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPTemplate initWithCoder(NSCoder coder);

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
    public static native CPTemplate new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Any custom data or an object associated with this template can be stored in this property.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Mapped(ObjCObjectMapper.class) Object value);

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

    /**
     * Any custom data or an object associated with this template can be stored in this property.
     */
    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab may optionally
     * display a badge indicator.
     * <p>
     * [@note] This defaults to NO. Specify YES to display a badge indicator on this tab.
     */
    @Generated
    @Selector("setShowsTabBadge:")
    public native void setShowsTabBadge(boolean value);

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab will inherit
     * the image specified in this template. If a tabSystemItem is also specified, tabImage will take precedence.
     * <p>
     * [@note] Your template should specify either a @c tabSystemItem OR both a @c tabImage and @c tabTitle.
     */
    @Generated
    @Selector("setTabImage:")
    public native void setTabImage(UIImage value);

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab will inherit
     * the system image AND system title specified in this template.
     * <p>
     * [@note] Your template should specify either a @c tabSystemItem OR both a @c tabImage and @c tabTitle.
     */
    @Generated
    @Selector("setTabSystemItem:")
    public native void setTabSystemItem(@NInt long value);

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab will inherit
     * the @c tabTitle specified in this template.
     * <p>
     * [@note] If no @c tabTitle is specified, the tab will inherit the template's title, if any.
     * <p>
     * [@note] Your template should specify either a @c tabSystemItem OR both a @c tabImage and @c tabTitle.
     */
    @Generated
    @Selector("setTabTitle:")
    public native void setTabTitle(String value);

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab may optionally
     * display a badge indicator.
     * <p>
     * [@note] This defaults to NO. Specify YES to display a badge indicator on this tab.
     */
    @Generated
    @Selector("showsTabBadge")
    public native boolean showsTabBadge();

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab will inherit
     * the image specified in this template. If a tabSystemItem is also specified, tabImage will take precedence.
     * <p>
     * [@note] Your template should specify either a @c tabSystemItem OR both a @c tabImage and @c tabTitle.
     */
    @Generated
    @Selector("tabImage")
    public native UIImage tabImage();

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab will inherit
     * the system image AND system title specified in this template.
     * <p>
     * [@note] Your template should specify either a @c tabSystemItem OR both a @c tabImage and @c tabTitle.
     */
    @Generated
    @Selector("tabSystemItem")
    @NInt
    public native long tabSystemItem();

    /**
     * When this template is the first template displayed in a @c CPTabBarTemplate's tab, the tab will inherit
     * the @c tabTitle specified in this template.
     * <p>
     * [@note] If no @c tabTitle is specified, the tab will inherit the template's title, if any.
     * <p>
     * [@note] Your template should specify either a @c tabSystemItem OR both a @c tabImage and @c tabTitle.
     */
    @Generated
    @Selector("tabTitle")
    public native String tabTitle();
}
