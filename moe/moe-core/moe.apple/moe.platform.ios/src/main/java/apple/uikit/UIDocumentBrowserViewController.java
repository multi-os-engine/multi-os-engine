package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIDocumentBrowserViewControllerDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentBrowserViewController extends UIViewController implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentBrowserViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("additionalLeadingNavigationBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> additionalLeadingNavigationBarButtonItems();

    @Generated
    @Selector("additionalTrailingNavigationBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> additionalTrailingNavigationBarButtonItems();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentBrowserViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("allowedContentTypes")
    public native NSArray<String> allowedContentTypes();

    @Generated
    @Selector("allowsDocumentCreation")
    public native boolean allowsDocumentCreation();

    @Generated
    @Selector("allowsPickingMultipleItems")
    public native boolean allowsPickingMultipleItems();

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("browserUserInterfaceStyle")
    @NUInt
    public native long browserUserInterfaceStyle();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("customActions")
    public native NSArray<? extends UIDocumentBrowserAction> customActions();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIDocumentBrowserViewControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("importDocumentAtURL:nextToDocumentAtURL:mode:completionHandler:")
    public native void importDocumentAtURLNextToDocumentAtURLModeCompletionHandler(NSURL documentURL,
            NSURL neighbourURL, @NUInt long importMode,
            @ObjCBlock(name = "call_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler") Block_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler {
        @Generated
        void call_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler(NSURL arg0, NSError arg1);
    }

    @Generated
    @Selector("init")
    public native UIDocumentBrowserViewController init();

    @Generated
    @Selector("initForOpeningFilesWithContentTypes:")
    public native UIDocumentBrowserViewController initForOpeningFilesWithContentTypes(
            NSArray<String> allowedContentTypes);

    @Generated
    @Selector("initWithCoder:")
    public native UIDocumentBrowserViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIDocumentBrowserViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("revealDocumentAtURL:importIfNeeded:completion:")
    public native void revealDocumentAtURLImportIfNeededCompletion(NSURL url, boolean importIfNeeded,
            @ObjCBlock(name = "call_revealDocumentAtURLImportIfNeededCompletion") Block_revealDocumentAtURLImportIfNeededCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_revealDocumentAtURLImportIfNeededCompletion {
        @Generated
        void call_revealDocumentAtURLImportIfNeededCompletion(NSURL arg0, NSError arg1);
    }

    @Generated
    @Selector("setAdditionalLeadingNavigationBarButtonItems:")
    public native void setAdditionalLeadingNavigationBarButtonItems(NSArray<? extends UIBarButtonItem> value);

    @Generated
    @Selector("setAdditionalTrailingNavigationBarButtonItems:")
    public native void setAdditionalTrailingNavigationBarButtonItems(NSArray<? extends UIBarButtonItem> value);

    @Generated
    @Selector("setAllowsDocumentCreation:")
    public native void setAllowsDocumentCreation(boolean value);

    @Generated
    @Selector("setAllowsPickingMultipleItems:")
    public native void setAllowsPickingMultipleItems(boolean value);

    @Generated
    @Selector("setBrowserUserInterfaceStyle:")
    public native void setBrowserUserInterfaceStyle(@NUInt long value);

    @Generated
    @Selector("setCustomActions:")
    public native void setCustomActions(NSArray<? extends UIDocumentBrowserAction> value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) UIDocumentBrowserViewControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UIDocumentBrowserViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionControllerForDocumentURL:")
    public native UIDocumentBrowserTransitionController transitionControllerForDocumentURL(NSURL documentURL);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}