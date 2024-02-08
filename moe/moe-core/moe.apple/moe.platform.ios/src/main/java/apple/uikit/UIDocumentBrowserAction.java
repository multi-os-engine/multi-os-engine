package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * UIDocumentBrowserAction instances are custom, contextual actions that are presented to the user by a
 * UIDocumentBrowserViewController.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentBrowserAction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentBrowserAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentBrowserAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDocumentBrowserAction allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("availability")
    @NInt
    public native long availability();

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

    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native UIDocumentBrowserAction init();

    @Generated
    @Selector("initWithIdentifier:localizedTitle:availability:handler:")
    public native UIDocumentBrowserAction initWithIdentifierLocalizedTitleAvailabilityHandler(
            @NotNull String identifier, @NotNull String localizedTitle, @NInt long availability,
            @NotNull @ObjCBlock(name = "call_initWithIdentifierLocalizedTitleAvailabilityHandler") Block_initWithIdentifierLocalizedTitleAvailabilityHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithIdentifierLocalizedTitleAvailabilityHandler {
        @Generated
        void call_initWithIdentifierLocalizedTitleAvailabilityHandler(@NotNull NSArray<? extends NSURL> arg0);
    }

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

    @NotNull
    @Generated
    @Selector("localizedTitle")
    public native String localizedTitle();

    @Generated
    @Owned
    @Selector("new")
    public static native UIDocumentBrowserAction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * Allows clients to restrict the action to only a specific set of content types. Default: [UTTypeItem.identifier]
     */
    @Generated
    @Selector("setSupportedContentTypes:")
    public native void setSupportedContentTypes(@NotNull NSArray<String> value);

    /**
     * If NO, the action is only available, if there is only one item selected. Default: YES.
     */
    @Generated
    @Selector("setSupportsMultipleItems:")
    public native void setSupportsMultipleItems(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Allows clients to restrict the action to only a specific set of content types. Default: [UTTypeItem.identifier]
     */
    @NotNull
    @Generated
    @Selector("supportedContentTypes")
    public native NSArray<String> supportedContentTypes();

    /**
     * If NO, the action is only available, if there is only one item selected. Default: YES.
     */
    @Generated
    @Selector("supportsMultipleItems")
    public native boolean supportsMultipleItems();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
