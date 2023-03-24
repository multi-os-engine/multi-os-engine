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
import apple.uniformtypeidentifiers.UTType;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * UIDocumentBrowserViewController is a view controller to browse the files on the user's device or cloud services and
 * open them directly in your application
 * 
 * API-Since: 11.0
 */
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

    /**
     * An array of buttons that will be added to the existing buttons in the UIDocumentBrowserViewController navigation
     * bar
     */
    @NotNull
    @Generated
    @Selector("additionalLeadingNavigationBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> additionalLeadingNavigationBarButtonItems();

    /**
     * An array of buttons that will be added to the existing buttons in the UIDocumentBrowserViewController navigation
     * bar
     */
    @NotNull
    @Generated
    @Selector("additionalTrailingNavigationBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> additionalTrailingNavigationBarButtonItems();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentBrowserViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDocumentBrowserViewController allocWithZone(VoidPtr zone);

    /**
     * API-Since: 11.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: allowedContentTypes is no longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("allowedContentTypes")
    public native NSArray<String> allowedContentTypes();

    /**
     * Defaults to YES
     */
    @Generated
    @Selector("allowsDocumentCreation")
    public native boolean allowsDocumentCreation();

    /**
     * Defaults to NO
     */
    @Generated
    @Selector("allowsPickingMultipleItems")
    public native boolean allowsPickingMultipleItems();

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Allows clients to customize the look of the browser. Default: UIDocumentBrowserUserInterfaceStyleWhite
     */
    @Generated
    @Selector("browserUserInterfaceStyle")
    @NUInt
    public native long browserUserInterfaceStyle();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    /**
     * Allows clients to add custom actions in the menu and the navigation bar. These actions are contextual to the
     * document items.
     */
    @NotNull
    @Generated
    @Selector("customActions")
    public native NSArray<? extends UIDocumentBrowserAction> customActions();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIDocumentBrowserViewControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Allow a document to be imported next to another document.
     */
    @Generated
    @Selector("importDocumentAtURL:nextToDocumentAtURL:mode:completionHandler:")
    public native void importDocumentAtURLNextToDocumentAtURLModeCompletionHandler(@NotNull NSURL documentURL,
            @NotNull NSURL neighbourURL, @NUInt long importMode,
            @NotNull @ObjCBlock(name = "call_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler") Block_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler {
        @Generated
        void call_importDocumentAtURLNextToDocumentAtURLModeCompletionHandler(@Nullable NSURL arg0,
                @Nullable NSError arg1);
    }

    @Generated
    @Selector("init")
    public native UIDocumentBrowserViewController init();

    /**
     * @param allowedContentTypes The document types that the user should be able to open. If nil, the types specified
     *                            via the CFBundleDocumentTypes key in the application plist will be used instead.
     * 
     *                            API-Since: 11.0
     *                            Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initForOpeningFilesWithContentTypes:")
    public native UIDocumentBrowserViewController initForOpeningFilesWithContentTypes(
            @Nullable NSArray<String> allowedContentTypes);

    @Generated
    @Selector("initWithCoder:")
    public native UIDocumentBrowserViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIDocumentBrowserViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

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
    public static native UIDocumentBrowserViewController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Called to reveal a document at the URL.
     * Typically called from the application delegate method application:openURL:options:; to let the application
     * present the document.
     */
    @Generated
    @Selector("revealDocumentAtURL:importIfNeeded:completion:")
    public native void revealDocumentAtURLImportIfNeededCompletion(@NotNull NSURL url, boolean importIfNeeded,
            @Nullable @ObjCBlock(name = "call_revealDocumentAtURLImportIfNeededCompletion") Block_revealDocumentAtURLImportIfNeededCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_revealDocumentAtURLImportIfNeededCompletion {
        @Generated
        void call_revealDocumentAtURLImportIfNeededCompletion(@Nullable NSURL revealedDocumentURL,
                @Nullable NSError error);
    }

    /**
     * An array of buttons that will be added to the existing buttons in the UIDocumentBrowserViewController navigation
     * bar
     */
    @Generated
    @Selector("setAdditionalLeadingNavigationBarButtonItems:")
    public native void setAdditionalLeadingNavigationBarButtonItems(@NotNull NSArray<? extends UIBarButtonItem> value);

    /**
     * An array of buttons that will be added to the existing buttons in the UIDocumentBrowserViewController navigation
     * bar
     */
    @Generated
    @Selector("setAdditionalTrailingNavigationBarButtonItems:")
    public native void setAdditionalTrailingNavigationBarButtonItems(@NotNull NSArray<? extends UIBarButtonItem> value);

    /**
     * Defaults to YES
     */
    @Generated
    @Selector("setAllowsDocumentCreation:")
    public native void setAllowsDocumentCreation(boolean value);

    /**
     * Defaults to NO
     */
    @Generated
    @Selector("setAllowsPickingMultipleItems:")
    public native void setAllowsPickingMultipleItems(boolean value);

    /**
     * Allows clients to customize the look of the browser. Default: UIDocumentBrowserUserInterfaceStyleWhite
     */
    @Generated
    @Selector("setBrowserUserInterfaceStyle:")
    public native void setBrowserUserInterfaceStyle(@NUInt long value);

    /**
     * Allows clients to add custom actions in the menu and the navigation bar. These actions are contextual to the
     * document items.
     */
    @Generated
    @Selector("setCustomActions:")
    public native void setCustomActions(@NotNull NSArray<? extends UIDocumentBrowserAction> value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UIDocumentBrowserViewControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UIDocumentBrowserViewControllerDelegate value) {
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

    /**
     * API-Since: 11.0
     * Deprecated-Since: 12.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("transitionControllerForDocumentURL:")
    public native UIDocumentBrowserTransitionController transitionControllerForDocumentURL(@NotNull NSURL documentURL);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Aspect ratio of the Create Document button defined as width / height (default: 2/3).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("defaultDocumentAspectRatio")
    @NFloat
    public native double defaultDocumentAspectRatio();

    /**
     * Title of the Create Document button (default: "Create Document”).
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("localizedCreateDocumentActionTitle")
    public native String localizedCreateDocumentActionTitle();

    /**
     * Array of content types supported for Recents documents.
     * Default is same as allowedContentTypes.
     * Can be defined via the 'UIDocumentBrowserRecentDocumentContentTypes' key in the app Info.plist.
     * Note that the recentDocumentsContentTypes must be a subset conforming to the types declared in
     * allowedContentTypes.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("recentDocumentsContentTypes")
    public native NSArray<String> recentDocumentsContentTypes();

    /**
     * Aspect ratio of the Create Document button defined as width / height (default: 2/3).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDefaultDocumentAspectRatio:")
    public native void setDefaultDocumentAspectRatio(@NFloat double value);

    /**
     * Title of the Create Document button (default: "Create Document”).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setLocalizedCreateDocumentActionTitle:")
    public native void setLocalizedCreateDocumentActionTitle(@NotNull String value);

    /**
     * Force the display of file extensions (default: NO).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setShouldShowFileExtensions:")
    public native void setShouldShowFileExtensions(boolean value);

    /**
     * Force the display of file extensions (default: NO).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("shouldShowFileExtensions")
    public native boolean shouldShowFileExtensions();

    /**
     * A UIDocumentBrowserTransitionController object is used to display a loading indicator, while the application is
     * spending time on time-consuming operations (e.g., loading, parsing, …) after having finished the file download,
     * and before presenting it. To be used together with the UIViewControllerTransitioningDelegate protocol for custom
     * view controller transitions.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("transitionControllerForDocumentAtURL:")
    public native UIDocumentBrowserTransitionController transitionControllerForDocumentAtURL(
            @NotNull NSURL documentURL);

    /**
     * Array of content types supported for Recents documents.
     * Default is same as content types passed in the designated initializer or as CFBundleDocumentTypes in the app
     * Info.plist.
     * Can be defined via the 'UIDocumentBrowserRecentDocumentContentTypes' key in the app Info.plist.
     * Note that the contentTypesForRecentDocuments must be a subset conforming to the types passed in the initializer
     * or Info.plist.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("contentTypesForRecentDocuments")
    public native NSArray<? extends UTType> contentTypesForRecentDocuments();

    /**
     * @param contentTypes The content types that the user should be able to open. If nil, the types specified via the
     *                     CFBundleDocumentTypes key in the application plist will be used instead.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("initForOpeningContentTypes:")
    public native UIDocumentBrowserViewController initForOpeningContentTypes(
            @Nullable NSArray<? extends UTType> contentTypes);

    /**
     * Rename a document.
     * If the proposed name is already taken, a different name may be used after confirming with the user.
     * The finalURL and error are available in the completion handler.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("renameDocumentAtURL:proposedName:completionHandler:")
    public native void renameDocumentAtURLProposedNameCompletionHandler(@NotNull NSURL documentURL,
            @NotNull String proposedName,
            @NotNull @ObjCBlock(name = "call_renameDocumentAtURLProposedNameCompletionHandler") Block_renameDocumentAtURLProposedNameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renameDocumentAtURLProposedNameCompletionHandler {
        @Generated
        void call_renameDocumentAtURLProposedNameCompletionHandler(@Nullable NSURL finalURL, @Nullable NSError error);
    }
}
