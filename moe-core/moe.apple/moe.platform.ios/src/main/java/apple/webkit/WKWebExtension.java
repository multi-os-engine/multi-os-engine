package apple.webkit;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * A ``WKWebExtension`` object encapsulates a web extension’s resources that are defined by a `manifest.json`` file.
 * 
 * This class handles the reading and parsing of the manifest file along with the supporting resources like icons and
 * localizations.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtension extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtension(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("actionIconForSize:")
    @Nullable
    public native UIImage actionIconForSize(@ByValue CGSize size);

    /**
     * The set of websites that the extension requires access to for injected content and for receiving messages from
     * websites.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("allRequestedMatchPatterns")
    @NotNull
    public native NSSet<? extends WKWebExtensionMatchPattern> allRequestedMatchPatterns();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtension alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtension allocWithZone(VoidPtr zone);

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

    /**
     * The default locale for the extension. Returns `nil` if there was no default locale specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("defaultLocale")
    @Nullable
    public native NSLocale defaultLocale();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The default localized extension action label. Returns `nil` if there was no default action label specified.
     * 
     * This label serves as a default and should be used to represent the extension in contexts like action sheets or
     * toolbars prior to
     * the extension being loaded into an extension context. Once the extension is loaded, use the ``actionForTab:`` API
     * to get the tab-specific label.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("displayActionLabel")
    @Nullable
    public native String displayActionLabel();

    /**
     * The localized extension description. Returns `nil` if there was no description specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("displayDescription")
    @Nullable
    public native String displayDescription();

    /**
     * The localized extension name. Returns `nil` if there was no name specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("displayName")
    @Nullable
    public native String displayName();

    /**
     * The localized extension short name. Returns `nil` if there was no short name specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("displayShortName")
    @Nullable
    public native String displayShortName();

    /**
     * The localized extension display version. Returns `nil` if there was no display version specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("displayVersion")
    @Nullable
    public native String displayVersion();

    /**
     * An array of all errors that occurred during the processing of the extension.
     * 
     * Provides an array of all parse-time errors for the extension, with repeat errors consolidated into a single entry
     * for the original
     * occurrence only. If no errors occurred, an empty array is returned.
     * [@note] Once the extension is loaded, use the ``errors`` property on an extension context to monitor any runtime
     * errors, as they can occur
     * after the extension is loaded.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("errors")
    @NotNull
    public native NSArray<? extends NSError> errors();

    /**
     * Returns a web extension initialized with a specified app extension bundle.
     * 
     * The app extension bundle must contain a `manifest.json` file in its resources directory. If the manifest is
     * invalid or missing,
     * or the bundle is otherwise improperly configured, an error will be returned.
     * 
     * API-Since: 18.4
     * 
     * @param appExtensionBundle The bundle to use for the new web extension.
     * @param completionHandler  A block to be called with an initialized web extension, or \c nil if the object could
     *                           not be initialized due to an error.
     */
    @Generated
    @Selector("extensionWithAppExtensionBundle:completionHandler:")
    public static native void extensionWithAppExtensionBundleCompletionHandler(@NotNull NSBundle appExtensionBundle,
            @ObjCBlock(name = "call_extensionWithAppExtensionBundleCompletionHandler") @NotNull Block_extensionWithAppExtensionBundleCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extensionWithAppExtensionBundleCompletionHandler {
        @Generated
        void call_extensionWithAppExtensionBundleCompletionHandler(@Nullable WKWebExtension extension,
                @Nullable NSError error);
    }

    /**
     * Returns a web extension initialized with a specified resource base URL, which can point to either a directory or
     * a ZIP archive.
     * 
     * The URL must be a file URL that points to either a directory with a `manifest.json` file or a ZIP archive
     * containing a `manifest.json` file.
     * If the manifest is invalid or missing, or the URL points to an unsupported format or invalid archive, an error
     * will be returned.
     * 
     * API-Since: 18.4
     * 
     * @param resourceBaseURL   The file URL to use for the new web extension.
     * @param completionHandler A block to be called with an initialized web extension, or \c nil if the object could
     *                          not be initialized due to an error.
     */
    @Generated
    @Selector("extensionWithResourceBaseURL:completionHandler:")
    public static native void extensionWithResourceBaseURLCompletionHandler(@NotNull NSURL resourceBaseURL,
            @ObjCBlock(name = "call_extensionWithResourceBaseURLCompletionHandler") @NotNull Block_extensionWithResourceBaseURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extensionWithResourceBaseURLCompletionHandler {
        @Generated
        void call_extensionWithResourceBaseURLCompletionHandler(@Nullable WKWebExtension extension,
                @Nullable NSError error);
    }

    /**
     * A Boolean value indicating whether the extension has background content that can run when needed.
     * 
     * If this property is `YES`, the extension can run in the background even when no webpages are open.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasBackgroundContent")
    public native boolean hasBackgroundContent();

    /**
     * A Boolean value indicating whether the extension includes commands that users can invoke.
     * 
     * If this property is `YES`, the extension contains one or more commands that can be performed by the user. These
     * commands should be accessible via keyboard shortcuts,
     * menu items, or other user interface elements provided by the app. The list of commands can be accessed via
     * ``commands`` on an extension context, and invoked via ``performCommand:``.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasCommands")
    public native boolean hasCommands();

    /**
     * A boolean value indicating whether the extension includes rules used for content modification or blocking.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasContentModificationRules")
    public native boolean hasContentModificationRules();

    /**
     * A Boolean value indicating whether the extension has script or stylesheet content that can be injected into
     * webpages.
     * 
     * If this property is `YES`, the extension has content that can be injected by matching against the extension's
     * requested match patterns.
     * [@note] Once the extension is loaded, use the ``hasInjectedContent`` property on an extension context, as the
     * injectable content can change after the extension is loaded.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasInjectedContent")
    public native boolean hasInjectedContent();

    /**
     * A Boolean value indicating whether the extension has an options page.
     * 
     * If this property is `YES`, the extension includes a dedicated options page where users can customize settings.
     * The app should provide access to this page through a user interface element, which can be accessed via
     * ``optionsPageURL`` on an extension context.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasOptionsPage")
    public native boolean hasOptionsPage();

    /**
     * A Boolean value indicating whether the extension provides an alternative to the default new tab page.
     * 
     * If this property is `YES`, the extension can specify a custom page that can be displayed when a new tab is opened
     * in the app, instead of the default new tab page.
     * The app should prompt the user for permission to use the extension's new tab page as the default, which can be
     * accessed via ``overrideNewTabPageURL`` on an extension context.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasOverrideNewTabPage")
    public native boolean hasOverrideNewTabPage();

    /**
     * A Boolean value indicating whether the extension has background content that stays in memory as long as the
     * extension is loaded.
     * [@note] Note that extensions are only allowed to have persistent background content on macOS. An
     * ``WKWebExtensionErrorInvalidBackgroundPersistence``
     * error will be reported on iOS, iPadOS, and visionOS if an attempt is made to load a persistent extension.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasPersistentBackgroundContent")
    public native boolean hasPersistentBackgroundContent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("iconForSize:")
    @Nullable
    public native UIImage iconForSize(@ByValue CGSize size);

    @Generated
    @Selector("init")
    public native WKWebExtension init();

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
     * The parsed manifest as a dictionary.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("manifest")
    @NotNull
    public native NSDictionary<String, ?> manifest();

    /**
     * The parsed manifest version, or `0` if there is no version specified in the manifest.
     * [@note] An ``WKWebExtensionErrorUnsupportedManifestVersion`` error will be reported if the manifest version isn't
     * specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("manifestVersion")
    public native double manifestVersion();

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtension new_objc();

    /**
     * The set of websites that the extension may need access to for optional functionality. These match patterns can be
     * requested by the extension at a later time.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("optionalPermissionMatchPatterns")
    @NotNull
    public native NSSet<? extends WKWebExtensionMatchPattern> optionalPermissionMatchPatterns();

    /**
     * The set of permissions that the extension may need for optional functionality. These permissions can be requested
     * by the extension at a later time.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("optionalPermissions")
    @NotNull
    public native NSSet<String> optionalPermissions();

    /**
     * The set of websites that the extension requires access to for its base functionality.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("requestedPermissionMatchPatterns")
    @NotNull
    public native NSSet<? extends WKWebExtensionMatchPattern> requestedPermissionMatchPatterns();

    /**
     * The set of permissions that the extension requires for its base functionality.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("requestedPermissions")
    @NotNull
    public native NSSet<String> requestedPermissions();

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

    /**
     * Checks if a manifest version is supported by the extension.
     * 
     * @param manifestVersion The version number to check.
     * @return Returns `YES` if the extension specified a manifest version that is greater than or equal to
     *         `manifestVersion`.
     * 
     *         API-Since: 18.4
     */
    @Generated
    @Selector("supportsManifestVersion:")
    public native boolean supportsManifestVersion(double manifestVersion);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The extension version. Returns `nil` if there was no version specified.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("version")
    @Nullable
    public native String version();
}