package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A ``WKWebExtensionMatchPattern`` object represents a way to specify groups of URLs.
 * 
 * All match patterns are specified as strings. Apart from the special `<all_urls>` pattern, match patterns
 * consist of three parts: scheme, host, and path.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionMatchPattern extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionMatchPattern(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Returns a pattern object that has `*` for scheme, host, and path.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("allHostsAndSchemesMatchPattern")
    @NotNull
    public static native WKWebExtensionMatchPattern allHostsAndSchemesMatchPattern();

    /**
     * Returns a pattern object for `<all_urls>`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("allURLsMatchPattern")
    @NotNull
    public static native WKWebExtensionMatchPattern allURLsMatchPattern();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionMatchPattern alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionMatchPattern allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

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
     * The host part of the pattern string, unless ``matchesAllURLs`` is `YES`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("host")
    @Nullable
    public native String host();

    @Generated
    @Selector("init")
    public native WKWebExtensionMatchPattern init();

    @Generated
    @Selector("initWithCoder:")
    public native WKWebExtensionMatchPattern initWithCoder(@NotNull NSCoder coder);

    /**
     * Returns a pattern object for the specified scheme, host, and path strings.
     * 
     * @param error Set to \c nil or an error instance if an error occurred.
     * @return A pattern object, or `nil` if any of the strings are invalid and an error will be set.
     * @see initWithScheme:host:path:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("initWithScheme:host:path:error:")
    public native WKWebExtensionMatchPattern initWithSchemeHostPathError(@NotNull String scheme, @NotNull String host,
            @NotNull String path, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Returns a pattern object for the specified pattern string.
     * 
     * @param error Set to \c nil or an error instance if an error occurred.
     * @return A pattern object, or `nil` if the pattern string is invalid and an error will be set.
     * @see initWithString:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("initWithString:error:")
    public native WKWebExtensionMatchPattern initWithStringError(@NotNull String string,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
     * Returns a pattern object for the specified scheme, host, and path strings.
     * 
     * @return A pattern object, or `nil` if any of the strings are invalid.
     * @see initWithScheme:host:path:error:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("matchPatternWithScheme:host:path:")
    public static native WKWebExtensionMatchPattern matchPatternWithSchemeHostPath(@NotNull String scheme,
            @NotNull String host, @NotNull String path);

    /**
     * Returns a pattern object for the specified pattern string.
     * 
     * @return Returns `nil` if the pattern string is invalid.
     * @see initWithString:error:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("matchPatternWithString:")
    public static native WKWebExtensionMatchPattern matchPatternWithString(@NotNull String string);

    /**
     * If the pattern is `<all_urls>` or has `*` as the host.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("matchesAllHosts")
    public native boolean matchesAllHosts();

    /**
     * If the pattern is `<all_urls>`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("matchesAllURLs")
    public native boolean matchesAllURLs();

    /**
     * Matches the receiver pattern against the specified pattern.
     * 
     * @param pattern The pattern to match against the receiver pattern.
     * @return A Boolean value indicating if receiver pattern matches the specified pattern.
     * @see matchesPattern:options:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("matchesPattern:")
    public native boolean matchesPattern(@Nullable WKWebExtensionMatchPattern pattern);

    /**
     * Matches the receiver pattern against the specified pattern with options.
     * 
     * @param pattern The pattern to match against the receiver pattern.
     * @param options The options to use while matching.
     * @return A Boolean value indicating if receiver pattern matches the specified pattern.
     * @see matchesPattern:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("matchesPattern:options:")
    public native boolean matchesPatternOptions(@Nullable WKWebExtensionMatchPattern pattern, @NUInt long options);

    /**
     * Matches the reciever pattern against the specified URL.
     * 
     * @param url The URL to match the against the reciever pattern.
     * @return A Boolean value indicating if pattern matches the specified URL.
     * @see matchesURL:options:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("matchesURL:")
    public native boolean matchesURL(@Nullable NSURL url);

    /**
     * Matches the reciever pattern against the specified URL with options.
     * 
     * @param url     The URL to match the against the reciever pattern.
     * @param options The options to use while matching.
     * @return A Boolean value indicating if pattern matches the specified URL.
     * @see matchesURL:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("matchesURL:options:")
    public native boolean matchesURLOptions(@Nullable NSURL url, @NUInt long options);

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtensionMatchPattern new_objc();

    /**
     * The path part of the pattern string, unless ``matchesAllURLs`` is `YES`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("path")
    @Nullable
    public native String path();

    /**
     * Registers a custom URL scheme that can be used in match patterns.
     * 
     * This method should be used to register any custom URL schemes used by the app for the extension base URLs,
     * other than `webkit-extension`, or if extensions should have access to other supported URL schemes when using
     * `<all_urls>`.
     * 
     * @param urlScheme The custom URL scheme to register.
     * 
     *                  API-Since: 18.4
     */
    @Generated
    @Selector("registerCustomURLScheme:")
    public static native void registerCustomURLScheme(@NotNull String urlScheme);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The scheme part of the pattern string, unless ``matchesAllURLs`` is `YES`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("scheme")
    @Nullable
    public native String scheme();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The original pattern string.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("string")
    @NotNull
    public native String string();

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
}