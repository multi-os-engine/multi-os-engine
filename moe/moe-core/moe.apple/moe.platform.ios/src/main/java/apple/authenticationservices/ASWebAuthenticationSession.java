package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASWebAuthenticationPresentationContextProviding;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

/**
 * ASWebAuthenticationSession
 * An ASWebAuthenticationSession object can be used to authenticate a user with a web service, even if the web service
 * is run
 * by a third party. ASWebAuthenticationSession puts the user in control of whether they want to use their existing
 * logged-in
 * session from Safari. The app provides a URL that points to the authentication webpage. The page will be loaded in a
 * secure
 * view controller. From the webpage, the user can authenticate herself and grant access to the app.
 * On completion, the service will send a callback URL with an authentication token, and this URL will be passed to the
 * app by
 * ASWebAuthenticationSessionCompletionHandler.
 * 
 * The callback URL usually has a custom URL scheme. For the app to receive the callback URL, it needs to either
 * register the
 * custom URL scheme in its Info.plist, or set the scheme to callbackURLScheme argument in the initializer.
 * 
 * If the user has already logged into the web service in Safari or other apps via ASWebAuthenticationSession, it is
 * possible to
 * share the existing login information. An alert will be presented to get the user's consent for sharing their existing
 * login
 * information. If the user cancels the alert, the session will be canceled, and the completion handler will be called
 * with
 * the error code ASWebAuthenticationSessionErrorCodeCanceledLogin.
 * 
 * If the user taps Cancel when showing the login webpage for the web service, the session will be canceled, and the
 * completion
 * handler will be called with the error code ASWebAuthenticationSessionErrorCodeCanceledLogin.
 * 
 * The app can cancel the session by calling -[ASWebAuthenticationSession cancel]. This will also dismiss the view
 * controller that
 * is showing the web service's login page.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASWebAuthenticationSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASWebAuthenticationSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASWebAuthenticationSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASWebAuthenticationSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Cancel an ASWebAuthenticationSession. If the view controller is already presented to load the webpage for
     * authentication, it will be dismissed. Calling cancel on an already canceled session will have no effect.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

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
    public native ASWebAuthenticationSession init();

    /**
     * Returns an ASWebAuthenticationSession object.
     * 
     * @param URL               the initial URL pointing to the authentication webpage. Only supports URLs with http://
     *                          or https:// schemes.
     * @param callbackURLScheme the custom URL scheme that the app expects in the callback URL.
     * @param completionHandler the completion handler which is called when the session is completed successfully or
     *                          canceled by user.
     */
    @Generated
    @Selector("initWithURL:callbackURLScheme:completionHandler:")
    public native ASWebAuthenticationSession initWithURLCallbackURLSchemeCompletionHandler(NSURL URL,
            String callbackURLScheme,
            @ObjCBlock(name = "call_initWithURLCallbackURLSchemeCompletionHandler") Block_initWithURLCallbackURLSchemeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithURLCallbackURLSchemeCompletionHandler {
        @Generated
        void call_initWithURLCallbackURLSchemeCompletionHandler(NSURL callbackURL, NSError error);
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ASWebAuthenticationSession new_objc();

    /**
     * Indicates whether this session should ask the browser for an ephemeral session.
     * 
     * Ephemeral web browser sessions do not not share cookies or other browsing data with a user's normal browser
     * session.
     * This value is NO by default. Setting this property after calling -[ASWebAuthenticationSession start] has no
     * effect.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("prefersEphemeralWebBrowserSession")
    public native boolean prefersEphemeralWebBrowserSession();

    /**
     * Provides context to target where in an application's UI the authorization view should be shown. A provider
     * must be set prior to calling -start, otherwise the authorization view cannot be displayed. If deploying to iOS
     * prior to
     * 13.0, the desired window is inferred by the application's key window.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("presentationContextProvider")
    @MappedReturn(ObjCObjectMapper.class)
    public native ASWebAuthenticationPresentationContextProviding presentationContextProvider();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Indicates whether this session should ask the browser for an ephemeral session.
     * 
     * Ephemeral web browser sessions do not not share cookies or other browsing data with a user's normal browser
     * session.
     * This value is NO by default. Setting this property after calling -[ASWebAuthenticationSession start] has no
     * effect.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPrefersEphemeralWebBrowserSession:")
    public native void setPrefersEphemeralWebBrowserSession(boolean value);

    /**
     * Provides context to target where in an application's UI the authorization view should be shown. A provider
     * must be set prior to calling -start, otherwise the authorization view cannot be displayed. If deploying to iOS
     * prior to
     * 13.0, the desired window is inferred by the application's key window.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPresentationContextProvider:")
    public native void setPresentationContextProvider_unsafe(
            @Mapped(ObjCObjectMapper.class) ASWebAuthenticationPresentationContextProviding value);

    /**
     * Provides context to target where in an application's UI the authorization view should be shown. A provider
     * must be set prior to calling -start, otherwise the authorization view cannot be displayed. If deploying to iOS
     * prior to
     * 13.0, the desired window is inferred by the application's key window.
     * 
     * API-Since: 13.0
     */
    @Generated
    public void setPresentationContextProvider(
            @Mapped(ObjCObjectMapper.class) ASWebAuthenticationPresentationContextProviding value) {
        Object __old = presentationContextProvider();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPresentationContextProvider_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Starts the ASWebAuthenticationSession instance after it is instantiated.
     * 
     * start can only be called once for an ASWebAuthenticationSession instance. This also means calling start on a
     * canceled session will fail.
     * 
     * @return Returns YES if the session starts successfully.
     */
    @Generated
    @Selector("start")
    public native boolean start();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns whether the session can be successfully started. This property returns the same value as calling -start,
     * but without the side effect of actually starting the session.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("canStart")
    public native boolean canStart();
}
