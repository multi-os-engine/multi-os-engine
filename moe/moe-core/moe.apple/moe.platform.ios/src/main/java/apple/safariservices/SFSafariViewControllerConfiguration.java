package apple.safariservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.UIEventAttribution;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSafariViewControllerConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSafariViewControllerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSafariViewControllerConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSafariViewControllerConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Indicates if SFSafariViewController should enable collapsing of the navigation bar and hiding of the bottom
     * toolbar
     * when the user scrolls web content.
     * 
     * The default value is YES.
     */
    @Generated
    @Selector("barCollapsingEnabled")
    public native boolean barCollapsingEnabled();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Indicates if SFSafariViewController should automatically show the Reader version of web pages. This will only
     * happen when Safari Reader is available on a web page.
     */
    @Generated
    @Selector("entersReaderIfAvailable")
    public native boolean entersReaderIfAvailable();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SFSafariViewControllerConfiguration init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SFSafariViewControllerConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Indicates if SFSafariViewController should enable collapsing of the navigation bar and hiding of the bottom
     * toolbar
     * when the user scrolls web content.
     * 
     * The default value is YES.
     */
    @Generated
    @Selector("setBarCollapsingEnabled:")
    public native void setBarCollapsingEnabled(boolean value);

    /**
     * Indicates if SFSafariViewController should automatically show the Reader version of web pages. This will only
     * happen when Safari Reader is available on a web page.
     */
    @Generated
    @Selector("setEntersReaderIfAvailable:")
    public native void setEntersReaderIfAvailable(boolean value);

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
     * An additional button to be shown in SFSafariViewController's toolbar. See @link
     * SFSafariViewControllerActivityButton @/link for more details.
     * 
     * This allows the user to access powerful functionality from your extension without needing to first show the
     * UIActivityViewController.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("activityButton")
    public native SFSafariViewControllerActivityButton activityButton();

    /**
     * An additional button to be shown in SFSafariViewController's toolbar. See @link
     * SFSafariViewControllerActivityButton @/link for more details.
     * 
     * This allows the user to access powerful functionality from your extension without needing to first show the
     * UIActivityViewController.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setActivityButton:")
    public native void setActivityButton(@Nullable SFSafariViewControllerActivityButton value);

    /**
     * An event attribution associated with a click that caused this SFSafariViewController to be opened.
     * 
     * This attribute is ignored if the SFSafariViewController initialURL has a scheme of 'http'.
     * 
     * API-Since: 15.2
     */
    @Nullable
    @Generated
    @Selector("eventAttribution")
    public native UIEventAttribution eventAttribution();

    /**
     * An event attribution associated with a click that caused this SFSafariViewController to be opened.
     * 
     * This attribute is ignored if the SFSafariViewController initialURL has a scheme of 'http'.
     * 
     * API-Since: 15.2
     */
    @Generated
    @Selector("setEventAttribution:")
    public native void setEventAttribution(@Nullable UIEventAttribution value);
}
