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
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPContact extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPContact(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Action buttons that will be displayed when this @c CPContact is displayed in a @c CPContactTemplate.
     */
    @Generated
    @Selector("actions")
    public native NSArray<? extends CPButton> actions();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPContact alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPContact allocWithZone(VoidPtr zone);

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

    /**
     * An image representing the contact.
     */
    @Generated
    @Selector("image")
    public native UIImage image();

    /**
     * Optional text that will be displayed in addition to the contact name
     */
    @Generated
    @Selector("informativeText")
    public native String informativeText();

    @Generated
    @Selector("init")
    public native CPContact init();

    @Generated
    @Selector("initWithCoder:")
    public native CPContact initWithCoder(NSCoder coder);

    /**
     * Initializes a new contact to be used with @c CPContactTemplate, with a name and image
     * <p>
     * [@note] When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image, provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * <p>
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * <p>
     * To properly size your list images, your app should consider the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     *
     * @param name  The name to be displayed for this contact.
     * @param image An image for this contact. The maximum image size in points is CPButtonMaximumImageSize; larger images will be scaled down.
     */
    @Generated
    @Selector("initWithName:image:")
    public native CPContact initWithNameImage(String name, UIImage image);

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
     * The name that will be displayed for this contact.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native CPContact new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Action buttons that will be displayed when this @c CPContact is displayed in a @c CPContactTemplate.
     */
    @Generated
    @Selector("setActions:")
    public native void setActions(NSArray<? extends CPButton> value);

    /**
     * An image representing the contact.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    /**
     * Optional text that will be displayed in addition to the contact name
     */
    @Generated
    @Selector("setInformativeText:")
    public native void setInformativeText(String value);

    /**
     * The name that will be displayed for this contact.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * Optional text that will be displayed in addition to the contact name
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Optional text that will be displayed in addition to the contact name
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();

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
