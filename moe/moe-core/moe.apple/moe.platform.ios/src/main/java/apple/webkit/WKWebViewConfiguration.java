/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.webkit.protocol.WKURLSchemeHandler;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A WKWebViewConfiguration object is a collection of properties with
 * which to initialize a web view.
 * [@helps] Contains properties used to configure a @link WKWebView @/link.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebViewConfiguration extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebViewConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebViewConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKWebViewConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
    public static native WKWebViewConfiguration new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A Boolean value indicating whether AirPlay is allowed.
     * 
     * The default value is YES.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsAirPlayForMediaPlayback")
    public native boolean allowsAirPlayForMediaPlayback();

    /**
     * A Boolean value indicating whether HTML5 videos play inline
     * (YES) or use the native full-screen controller (NO).
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("allowsInlineMediaPlayback")
    public native boolean allowsInlineMediaPlayback();

    /**
     * A Boolean value indicating whether HTML5 videos may play
     * picture-in-picture.
     * 
     * The default value is YES.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsPictureInPictureMediaPlayback")
    public native boolean allowsPictureInPictureMediaPlayback();

    /**
     * The name of the application as used in the user agent string.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("applicationNameForUserAgent")
    public native String applicationNameForUserAgent();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * An enum value indicating the type of data detection desired.
     * 
     * The default value is WKDataDetectorTypeNone.
     * An example of how this property may affect the content loaded in the WKWebView is that content like
     * 'Visit apple.com on July 4th or call 1 800 555-5545' will be transformed to add links around 'apple.com', 'July
     * 4th' and '1 800 555-5545'
     * if the dataDetectorTypes property is set to WKDataDetectorTypePhoneNumber | WKDataDetectorTypeLink |
     * WKDataDetectorTypeCalendarEvent.
     * 
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("dataDetectorTypes")
    @NUInt
    public native long dataDetectorTypes();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * A Boolean value indicating whether the WKWebView should always allow scaling of the web page, regardless of
     * author intent.
     * 
     * This will override the user-scalable property.
     * The default value is NO.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("ignoresViewportScaleLimits")
    public native boolean ignoresViewportScaleLimits();

    @Generated
    @Selector("init")
    public native WKWebViewConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native WKWebViewConfiguration initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("mediaPlaybackAllowsAirPlay")
    public native boolean mediaPlaybackAllowsAirPlay();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("mediaPlaybackRequiresUserAction")
    public native boolean mediaPlaybackRequiresUserAction();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("mediaTypesRequiringUserActionForPlayback")
    @NUInt
    public native long mediaTypesRequiringUserActionForPlayback();

    /**
     * The preference settings to be used by the web view.
     */
    @NotNull
    @Generated
    @Selector("preferences")
    public native WKPreferences preferences();

    /**
     * The process pool from which to obtain the view's web content
     * process.
     * 
     * When a web view is initialized, a new web content process
     * will be created for it from the specified pool, or an existing process in
     * that pool will be used.
     */
    @NotNull
    @Generated
    @Selector("processPool")
    public native WKProcessPool processPool();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("requiresUserActionForMediaPlayback")
    public native boolean requiresUserActionForMediaPlayback();

    /**
     * The level of granularity with which the user can interactively
     * select content in the web view.
     * 
     * Possible values are described in WKSelectionGranularity.
     * The default value is WKSelectionGranularityDynamic.
     */
    @Generated
    @Selector("selectionGranularity")
    @NInt
    public native long selectionGranularity();

    /**
     * A Boolean value indicating whether AirPlay is allowed.
     * 
     * The default value is YES.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsAirPlayForMediaPlayback:")
    public native void setAllowsAirPlayForMediaPlayback(boolean value);

    /**
     * A Boolean value indicating whether HTML5 videos play inline
     * (YES) or use the native full-screen controller (NO).
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("setAllowsInlineMediaPlayback:")
    public native void setAllowsInlineMediaPlayback(boolean value);

    /**
     * A Boolean value indicating whether HTML5 videos may play
     * picture-in-picture.
     * 
     * The default value is YES.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsPictureInPictureMediaPlayback:")
    public native void setAllowsPictureInPictureMediaPlayback(boolean value);

    /**
     * The name of the application as used in the user agent string.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setApplicationNameForUserAgent:")
    public native void setApplicationNameForUserAgent(@Nullable String value);

    /**
     * An enum value indicating the type of data detection desired.
     * 
     * The default value is WKDataDetectorTypeNone.
     * An example of how this property may affect the content loaded in the WKWebView is that content like
     * 'Visit apple.com on July 4th or call 1 800 555-5545' will be transformed to add links around 'apple.com', 'July
     * 4th' and '1 800 555-5545'
     * if the dataDetectorTypes property is set to WKDataDetectorTypePhoneNumber | WKDataDetectorTypeLink |
     * WKDataDetectorTypeCalendarEvent.
     * 
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setDataDetectorTypes:")
    public native void setDataDetectorTypes(@NUInt long value);

    /**
     * A Boolean value indicating whether the WKWebView should always allow scaling of the web page, regardless of
     * author intent.
     * 
     * This will override the user-scalable property.
     * The default value is NO.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setIgnoresViewportScaleLimits:")
    public native void setIgnoresViewportScaleLimits(boolean value);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("setMediaPlaybackAllowsAirPlay:")
    public native void setMediaPlaybackAllowsAirPlay(boolean value);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("setMediaPlaybackRequiresUserAction:")
    public native void setMediaPlaybackRequiresUserAction(boolean value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setMediaTypesRequiringUserActionForPlayback:")
    public native void setMediaTypesRequiringUserActionForPlayback(@NUInt long value);

    /**
     * The preference settings to be used by the web view.
     */
    @Generated
    @Selector("setPreferences:")
    public native void setPreferences(@NotNull WKPreferences value);

    /**
     * The process pool from which to obtain the view's web content
     * process.
     * 
     * When a web view is initialized, a new web content process
     * will be created for it from the specified pool, or an existing process in
     * that pool will be used.
     */
    @Generated
    @Selector("setProcessPool:")
    public native void setProcessPool(@NotNull WKProcessPool value);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("setRequiresUserActionForMediaPlayback:")
    public native void setRequiresUserActionForMediaPlayback(boolean value);

    /**
     * The level of granularity with which the user can interactively
     * select content in the web view.
     * 
     * Possible values are described in WKSelectionGranularity.
     * The default value is WKSelectionGranularityDynamic.
     */
    @Generated
    @Selector("setSelectionGranularity:")
    public native void setSelectionGranularity(@NInt long value);

    /**
     * A Boolean value indicating whether the web view suppresses
     * content rendering until it is fully loaded into memory.
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("setSuppressesIncrementalRendering:")
    public native void setSuppressesIncrementalRendering(boolean value);

    /**
     * The user content controller to associate with the web view.
     */
    @Generated
    @Selector("setUserContentController:")
    public native void setUserContentController(@NotNull WKUserContentController value);

    /**
     * The website data store to be used by the web view.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setWebsiteDataStore:")
    public native void setWebsiteDataStore(@NotNull WKWebsiteDataStore value);

    /**
     * A Boolean value indicating whether the web view suppresses
     * content rendering until it is fully loaded into memory.
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("suppressesIncrementalRendering")
    public native boolean suppressesIncrementalRendering();

    /**
     * The user content controller to associate with the web view.
     */
    @NotNull
    @Generated
    @Selector("userContentController")
    public native WKUserContentController userContentController();

    /**
     * The website data store to be used by the web view.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("websiteDataStore")
    public native WKWebsiteDataStore websiteDataStore();

    /**
     * Sets the URL scheme handler object for the given URL scheme.
     * 
     * Each URL scheme can only have one URL scheme handler object registered.
     * An exception will be thrown if you try to register an object for a particular URL scheme more than once.
     * URL schemes are case insensitive. e.g. "myprotocol" and "MyProtocol" are equivalent.
     * Valid URL schemes must start with an ASCII letter and can only contain ASCII letters, numbers, the '+' character,
     * the '-' character, and the '.' character.
     * An exception will be thrown if you try to register a URL scheme handler for an invalid URL scheme.
     * An exception will be thrown if you try to register a URL scheme handler for a URL scheme that WebKit handles
     * internally.
     * You can use +[WKWebView handlesURLScheme:] to check the availability of a given URL scheme.
     * 
     * API-Since: 11.0
     * 
     * @param urlSchemeHandler The object to register.
     * @param scheme           The URL scheme the object will handle.
     */
    @Generated
    @Selector("setURLSchemeHandler:forURLScheme:")
    public native void setURLSchemeHandlerForURLScheme(
            @Nullable @Mapped(ObjCObjectMapper.class) WKURLSchemeHandler urlSchemeHandler, @NotNull String urlScheme);

    /**
     * Returns the currently registered URL scheme handler object for the given URL scheme.
     * 
     * @param scheme The URL scheme to lookup.
     * 
     *               API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("urlSchemeHandlerForURLScheme:")
    @MappedReturn(ObjCObjectMapper.class)
    public native WKURLSchemeHandler urlSchemeHandlerForURLScheme(@NotNull String urlScheme);

    /**
     * The set of default webpage preferences to use when loading and rendering content.
     * 
     * These default webpage preferences are additionally passed to the navigation delegate
     * in -webView:decidePolicyForNavigationAction:preferences:decisionHandler:.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("defaultWebpagePreferences")
    public native WKWebpagePreferences defaultWebpagePreferences();

    /**
     * The set of default webpage preferences to use when loading and rendering content.
     * 
     * These default webpage preferences are additionally passed to the navigation delegate
     * in -webView:decidePolicyForNavigationAction:preferences:decisionHandler:.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDefaultWebpagePreferences:")
    public native void setDefaultWebpagePreferences(WKWebpagePreferences value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("limitsNavigationsToAppBoundDomains")
    public native boolean limitsNavigationsToAppBoundDomains();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setLimitsNavigationsToAppBoundDomains:")
    public native void setLimitsNavigationsToAppBoundDomains(boolean value);

    /**
     * A Boolean value indicating whether HTTP requests to servers known to support HTTPS should be automatically
     * upgraded to HTTPS requests.
     * 
     * The default value is YES.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("setUpgradeKnownHostsToHTTPS:")
    public native void setUpgradeKnownHostsToHTTPS(boolean value);

    /**
     * A Boolean value indicating whether HTTP requests to servers known to support HTTPS should be automatically
     * upgraded to HTTPS requests.
     * 
     * The default value is YES.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("upgradeKnownHostsToHTTPS")
    public native boolean upgradeKnownHostsToHTTPS();
}
