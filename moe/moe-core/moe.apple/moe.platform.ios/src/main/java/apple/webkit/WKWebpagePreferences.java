package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A WKWebpagePreferences object is a collection of properties that
 * determine the preferences to use when loading and rendering a page.
 * 
 * Contains properties used to determine webpage preferences.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebpagePreferences extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebpagePreferences(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebpagePreferences alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKWebpagePreferences allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("init")
    public native WKWebpagePreferences init();

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
    public static native WKWebpagePreferences new_objc();

    /**
     * A WKContentMode indicating the content mode to prefer
     * when loading and rendering a webpage.
     * 
     * The default value is WKContentModeRecommended. The stated
     * preference is ignored on subframe navigation
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("preferredContentMode")
    @NInt
    public native long preferredContentMode();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A WKContentMode indicating the content mode to prefer
     * when loading and rendering a webpage.
     * 
     * The default value is WKContentModeRecommended. The stated
     * preference is ignored on subframe navigation
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPreferredContentMode:")
    public native void setPreferredContentMode(@NInt long value);

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
     * A Boolean value indicating whether JavaScript from web content is enabled
     * 
     * If this value is set to NO then JavaScript referenced by the web content will not execute.
     * This includes JavaScript found in inline <script> elements, referenced by external JavaScript resources,
     * "javascript:" URLs, and all other forms.
     * 
     * Even if this value is set to NO your application can still execute JavaScript using:
     * - [WKWebView evaluteJavaScript:completionHandler:]
     * - [WKWebView evaluteJavaScript:inContentWorld:completionHandler:]
     * - [WKWebView callAsyncJavaScript:arguments:inContentWorld:completionHandler:]
     * - WKUserScripts
     * 
     * The default value is YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsContentJavaScript")
    public native boolean allowsContentJavaScript();

    /**
     * A Boolean value indicating whether JavaScript from web content is enabled
     * 
     * If this value is set to NO then JavaScript referenced by the web content will not execute.
     * This includes JavaScript found in inline <script> elements, referenced by external JavaScript resources,
     * "javascript:" URLs, and all other forms.
     * 
     * Even if this value is set to NO your application can still execute JavaScript using:
     * - [WKWebView evaluteJavaScript:completionHandler:]
     * - [WKWebView evaluteJavaScript:inContentWorld:completionHandler:]
     * - [WKWebView callAsyncJavaScript:arguments:inContentWorld:completionHandler:]
     * - WKUserScripts
     * 
     * The default value is YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsContentJavaScript:")
    public native void setAllowsContentJavaScript(boolean value);

    /**
     * A boolean indicating whether lockdown mode is enabled.
     * 
     * This mode trades off performance and compatibility in favor of security.
     * The default value depends on the system setting.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isLockdownModeEnabled")
    public native boolean isLockdownModeEnabled();

    /**
     * A boolean indicating whether lockdown mode is enabled.
     * 
     * This mode trades off performance and compatibility in favor of security.
     * The default value depends on the system setting.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setLockdownModeEnabled:")
    public native void setLockdownModeEnabled(boolean value);
}
