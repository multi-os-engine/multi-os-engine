package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * A ``WKWebExtensionControllerConfiguration`` object with which to initialize a web extension controller.
 * 
 * Contains properties used to configure a ``WKWebExtensionController``.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionControllerConfiguration extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionControllerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionControllerConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionControllerConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * Returns a new configuration that is persistent and unique for the specified identifier.
     * 
     * If a ``WKWebExtensionController`` is associated with a unique persistent configuration,
     * data will be written to the file system in a unique location based on the specified identifier.
     * 
     * @see defaultConfiguration
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("configurationWithIdentifier:")
    public static native WKWebExtensionControllerConfiguration configurationWithIdentifier(@NotNull NSUUID identifier);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Returns a new default configuration that is persistent and not unique.
     * 
     * If a ``WKWebExtensionController`` is associated with a persistent configuration,
     * data will be written to the file system in a common location. When using multiple extension controllers, each
     * controller should use a unique configuration to avoid conflicts.
     * 
     * @see configurationWithIdentifier:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("defaultConfiguration")
    @NotNull
    public static native WKWebExtensionControllerConfiguration defaultConfiguration();

    /**
     * The default data store for website data and cookie access in extension contexts.
     * 
     * This property sets the primary data store for managing website data, including cookies, which extensions can
     * access,
     * subject to the granted permissions within the extension contexts. Defaults to
     * ``WKWebsiteDataStore.defaultDataStore``.
     * [@note] In addition to this data store, extensions can also access other data stores, such as non-persistent
     * ones, for any open tabs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("defaultWebsiteDataStore")
    public native WKWebsiteDataStore defaultWebsiteDataStore();

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
     * The unique identifier used for persistent configuration storage, or `nil` when it is the default or not
     * persistent.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("identifier")
    @Nullable
    public native NSUUID identifier();

    @Generated
    @Selector("init")
    public native WKWebExtensionControllerConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native WKWebExtensionControllerConfiguration initWithCoder(@NotNull NSCoder coder);

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

    /**
     * A Boolean value indicating if this context will write data to the the file system.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isPersistent")
    public native boolean isPersistent();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtensionControllerConfiguration new_objc();

    /**
     * Returns a new non-persistent configuration.
     * 
     * If a ``WKWebExtensionController`` is associated with a non-persistent configuration,
     * no data will be written to the file system. This is useful for extensions in "private browsing" situations.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("nonPersistentConfiguration")
    @NotNull
    public static native WKWebExtensionControllerConfiguration nonPersistentConfiguration();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The default data store for website data and cookie access in extension contexts.
     * 
     * This property sets the primary data store for managing website data, including cookies, which extensions can
     * access,
     * subject to the granted permissions within the extension contexts. Defaults to
     * ``WKWebsiteDataStore.defaultDataStore``.
     * [@note] In addition to this data store, extensions can also access other data stores, such as non-persistent
     * ones, for any open tabs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setDefaultWebsiteDataStore:")
    public native void setDefaultWebsiteDataStore(WKWebsiteDataStore value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The web view configuration to be used as a basis for configuring web views in extension contexts.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setWebViewConfiguration:")
    public native void setWebViewConfiguration(WKWebViewConfiguration value);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The web view configuration to be used as a basis for configuring web views in extension contexts.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("webViewConfiguration")
    public native WKWebViewConfiguration webViewConfiguration();
}