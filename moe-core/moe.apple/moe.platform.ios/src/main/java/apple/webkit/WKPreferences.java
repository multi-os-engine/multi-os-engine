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
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * A WKPreferences object encapsulates the preference settings for a web
 * view. The preferences object associated with a web view is specified by
 * its web view configuration.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKPreferences extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected WKPreferences(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKPreferences alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKPreferences allocWithZone(VoidPtr zone);

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
    public static native WKPreferences new_objc();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native WKPreferences init();

    @Generated
    @Selector("initWithCoder:")
    public native WKPreferences initWithCoder(@NotNull NSCoder coder);

    /**
     * A Boolean value indicating whether JavaScript can open
     * windows without user interaction.
     * 
     * The default value is NO in iOS and YES in OS X.
     */
    @Generated
    @Selector("javaScriptCanOpenWindowsAutomatically")
    public native boolean javaScriptCanOpenWindowsAutomatically();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use WKWebpagePreferences.allowsContentJavaScript to disable content JavaScript on a
     * per-navigation basis
     */
    @Deprecated
    @Generated
    @Selector("javaScriptEnabled")
    public native boolean javaScriptEnabled();

    /**
     * The minimum font size in points.
     * 
     * The default value is 0.
     */
    @Generated
    @Selector("minimumFontSize")
    @NFloat
    public native double minimumFontSize();

    /**
     * A Boolean value indicating whether JavaScript can open
     * windows without user interaction.
     * 
     * The default value is NO in iOS and YES in OS X.
     */
    @Generated
    @Selector("setJavaScriptCanOpenWindowsAutomatically:")
    public native void setJavaScriptCanOpenWindowsAutomatically(boolean value);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use WKWebpagePreferences.allowsContentJavaScript to disable content JavaScript on a
     * per-navigation basis
     */
    @Deprecated
    @Generated
    @Selector("setJavaScriptEnabled:")
    public native void setJavaScriptEnabled(boolean value);

    /**
     * The minimum font size in points.
     * 
     * The default value is 0.
     */
    @Generated
    @Selector("setMinimumFontSize:")
    public native void setMinimumFontSize(@NFloat double value);

    /**
     * A Boolean value indicating whether warnings should be
     * shown for suspected fraudulent content such as phishing or malware.
     * 
     * The default value is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isFraudulentWebsiteWarningEnabled")
    public native boolean isFraudulentWebsiteWarningEnabled();

    /**
     * A Boolean value indicating whether warnings should be
     * shown for suspected fraudulent content such as phishing or malware.
     * 
     * The default value is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setFraudulentWebsiteWarningEnabled:")
    public native void setFraudulentWebsiteWarningEnabled(boolean value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * A Boolean value indicating whether text interaction is disabled.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("isTextInteractionEnabled")
    public native boolean isTextInteractionEnabled();

    /**
     * A Boolean value indicating whether text interaction is disabled.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("setTextInteractionEnabled:")
    public native void setTextInteractionEnabled(boolean value);

    /**
     * A Boolean value indicating whether Fullscreen API is enabled.
     * 
     * The default value is NO. We can set it to YES to enable support for the fullscreen API.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("isElementFullscreenEnabled")
    public native boolean isElementFullscreenEnabled();

    /**
     * A Boolean value indicating whether WebKit will apply built-in workarounds (quirks)
     * to improve compatibility with certain known websites. You can disable site-specific quirks
     * to help test your website without these workarounds. Enabled by default.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("isSiteSpecificQuirksModeEnabled")
    public native boolean isSiteSpecificQuirksModeEnabled();

    /**
     * A Boolean value indicating whether Fullscreen API is enabled.
     * 
     * The default value is NO. We can set it to YES to enable support for the fullscreen API.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setElementFullscreenEnabled:")
    public native void setElementFullscreenEnabled(boolean value);

    /**
     * A Boolean value indicating whether WebKit will apply built-in workarounds (quirks)
     * to improve compatibility with certain known websites. You can disable site-specific quirks
     * to help test your website without these workarounds. Enabled by default.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setSiteSpecificQuirksModeEnabled:")
    public native void setSiteSpecificQuirksModeEnabled(boolean value);

    /**
     * Specify the scheduling policy for the web view when it is inactive
     * and detached from the view hierarchy. Web views are not considered idle when playing media or loading web pages.
     * A suspended web view will pause JavaScript execution and page layout.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("inactiveSchedulingPolicy")
    @NInt
    public native long inactiveSchedulingPolicy();

    /**
     * Specify the scheduling policy for the web view when it is inactive
     * and detached from the view hierarchy. Web views are not considered idle when playing media or loading web pages.
     * A suspended web view will pause JavaScript execution and page layout.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setInactiveSchedulingPolicy:")
    public native void setInactiveSchedulingPolicy(@NInt long value);

    /**
     * A Boolean value indicating whether the web view should include backgrounds when printing.
     * 
     * The default value is `NO`.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setShouldPrintBackgrounds:")
    public native void setShouldPrintBackgrounds(boolean value);

    /**
     * A Boolean value indicating whether the web view should include backgrounds when printing.
     * 
     * The default value is `NO`.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("shouldPrintBackgrounds")
    public native boolean shouldPrintBackgrounds();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
