package apple.safariservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * SFSafariViewControllerActivityButton
 * A custom button to show in SFSafariViewController's toolbar. When tapped, it will invoke a Share or Action Extension
 * bundled with your app.
 * 
 * The default VoiceOver description of this button is the `CFBundleDisplayName` set in the extension's Info.plist.
 * To set a different description for VoiceOver to read, set this object's `accessibilityLabel` property.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSafariViewControllerActivityButton extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSafariViewControllerActivityButton(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSafariViewControllerActivityButton alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSafariViewControllerActivityButton allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * The Bundle Identifier of the extension that should be ran when the button is tapped. This extension can run
     * JavaScript
     * and present a UIViewController, just as if it was selected from the UIActivityViewController in Safari or
     * SFSafariViewController.
     * This extension must be part of your app or another app with the same Team ID.
     */
    @Generated
    @Selector("extensionIdentifier")
    public native String extensionIdentifier();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SFSafariViewControllerActivityButton init();

    @Generated
    @Selector("initWithCoder:")
    public native SFSafariViewControllerActivityButton initWithCoder(NSCoder coder);

    /**
     * Initializes an SFSafariViewControllerActivityButton with the given image, accessibility label, and extension
     * bundle identifier.
     * 
     * @param templateImage       the image to show in SFSafariViewController's toolbar. This is a template image that
     *                            will get the same color as all
     *                            other buttons, defined by @link -[SFSafariViewController
     *                            preferredControlTintColor] @/link. This image should look similar to the
     *                            other buttons in SFSafariViewController, and should be close to a 1:1 aspect ratio.
     * @param extensionIdentifier the bundle identifier of the Action or Sharing Extension to run when the button is
     *                            tapped. The extension can run
     *                            JavaScript and present a view controller, as if it were selected from the
     *                            UIActivityViewController in Safari or SFSafariViewController.
     *                            This extension must be part of your app or another app with the same Team ID.
     */
    @Generated
    @Selector("initWithTemplateImage:extensionIdentifier:")
    public native SFSafariViewControllerActivityButton initWithTemplateImageExtensionIdentifier(UIImage templateImage,
            String extensionIdentifier);

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
    public static native SFSafariViewControllerActivityButton new_objc();

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

    /**
     * A template image to use for the toolbar button. This button should look similar to the rest of
     * SFSafariViewController's buttons,
     * and be close to a 1:1 aspect ratio. The button will inherit the tint color set by @link -[SFSafariViewController
     * preferredControlTintColor] @/link.
     */
    @Generated
    @Selector("templateImage")
    public native UIImage templateImage();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
