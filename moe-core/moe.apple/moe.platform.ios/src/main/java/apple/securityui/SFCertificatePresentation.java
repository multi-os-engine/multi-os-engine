package apple.securityui;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.security.opaque.SecTrustRef;
import apple.uikit.UIViewController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.4
 */
@Generated
@Library("SecurityUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFCertificatePresentation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SFCertificatePresentation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFCertificatePresentation alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SFCertificatePresentation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Dismisses the certificate sheet.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("dismissSheet")
    public native void dismissSheet();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The URL that will be opened by clicking the "Learn More" button.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("helpURL")
    @Nullable
    public native NSURL helpURL();

    @Generated
    @Selector("init")
    public native SFCertificatePresentation init();

    /**
     * Initialize the certificate presentation with a certificate trust reference.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithTrust:")
    public native SFCertificatePresentation initWithTrust(@NotNull SecTrustRef trust);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Message string to be displayed. If no message is provided, a default message will be used.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("message")
    @Nullable
    public native String message();

    @Generated
    @Owned
    @Selector("new")
    public static native SFCertificatePresentation new_objc();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("presentSheetInViewController:dismissHandler:")
    public native void presentSheetInViewControllerDismissHandler(@NotNull UIViewController viewController,
            @ObjCBlock(name = "call_presentSheetInViewControllerDismissHandler") @Nullable Block_presentSheetInViewControllerDismissHandler dismissHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentSheetInViewControllerDismissHandler {
        @Generated
        void call_presentSheetInViewControllerDismissHandler();
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The URL that will be opened by clicking the "Learn More" button.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setHelpURL:")
    public native void setHelpURL(@Nullable NSURL value);

    /**
     * Message string to be displayed. If no message is provided, a default message will be used.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMessage:")
    public native void setMessage(@Nullable String value);

    /**
     * Title string to be displayed. If no title is provided, a default title will be used.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Title string to be displayed. If no title is provided, a default title will be used.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("title")
    @Nullable
    public native String title();

    /**
     * A trust reference, previously created with SecTrustCreateWithCertificates (see <Security/SecTrust.h>).
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("trust")
    @NotNull
    public native SecTrustRef trust();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}