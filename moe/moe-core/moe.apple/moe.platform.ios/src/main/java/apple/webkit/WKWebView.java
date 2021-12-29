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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import apple.security.opaque.SecTrustRef;
import apple.uikit.UIColor;
import apple.uikit.UIImage;
import apple.uikit.UIScrollView;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.webkit.protocol.WKNavigationDelegate;
import apple.webkit.protocol.WKUIDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebView extends UIView {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKWebView allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    public static native WKWebView appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native WKWebView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native WKWebView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native WKWebView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native WKWebView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native WKWebView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

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
    @Selector("commitAnimations")
    public static native void commitAnimations();

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
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

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
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebView new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The web view's user interface delegate.
     */
    @Generated
    @Selector("UIDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native WKUIDelegate UIDelegate();

    /**
     * The active URL.
     * <p>
     * This is the URL that should be reflected in the user
     * interface.
     * [@link] WKWebView @/link is key-value observing (KVO) compliant for this
     * property.
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * A Boolean value indicating whether horizontal swipe gestures
     * will trigger back-forward list navigations.
     * <p>
     * The default value is NO.
     */
    @Generated
    @Selector("allowsBackForwardNavigationGestures")
    public native boolean allowsBackForwardNavigationGestures();

    /**
     * A Boolean value indicating whether link preview is allowed for any
     * links inside this WKWebView.
     * <p>
     * The default value is YES on Mac and iOS.
     */
    @Generated
    @Selector("allowsLinkPreview")
    public native boolean allowsLinkPreview();

    @Generated
    @ProtocolClassMethod("appearance")
    public WKWebView _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public WKWebView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public WKWebView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public WKWebView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public WKWebView _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public WKWebView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * The web view's back-forward list.
     */
    @Generated
    @Selector("backForwardList")
    public native WKBackForwardList backForwardList();

    /**
     * A Boolean value indicating whether there is a back item in
     * the back-forward list that can be navigated to.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     *
     * @see backForwardList.
     */
    @Generated
    @Selector("canGoBack")
    public native boolean canGoBack();

    /**
     * A Boolean value indicating whether there is a forward item in
     * the back-forward list that can be navigated to.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     *
     * @see backForwardList.
     */
    @Generated
    @Selector("canGoForward")
    public native boolean canGoForward();

    @Generated
    @Selector("certificateChain")
    public native NSArray<?> certificateChain();

    /**
     * A copy of the configuration with which the web view was
     * initialized.
     */
    @Generated
    @Selector("configuration")
    public native WKWebViewConfiguration configuration();

    /**
     * The custom user agent string or nil if no custom user agent string has been set.
     */
    @Generated
    @Selector("customUserAgent")
    public native String customUserAgent();

    /**
     * An estimate of what fraction of the current navigation has been completed.
     * <p>
     * This value ranges from 0.0 to 1.0 based on the total number of
     * bytes expected to be received, including the main document and all of its
     * potential subresources. After a navigation completes, the value remains at 1.0
     * until a new navigation starts, at which point it is reset to 0.0.
     * [@link] WKWebView @/link is key-value observing (KVO) compliant for this
     * property.
     */
    @Generated
    @Selector("estimatedProgress")
    public native double estimatedProgress();

    /**
     * Evaluates the given JavaScript string.
     * <p>
     * The completionHandler is passed the result of the script evaluation or an error.
     * Calling this method is equivalent to calling `evaluateJavaScript:inFrame:inContentWorld:completionHandler:` with:
     * - A `frame` value of `nil` to represent the main frame
     * - A `contentWorld` value of `WKContentWorld.pageWorld`
     *
     * @param javaScriptString  The JavaScript string to evaluate.
     * @param completionHandler A block to invoke when script evaluation completes or fails.
     */
    @Generated
    @Selector("evaluateJavaScript:completionHandler:")
    public native void evaluateJavaScriptCompletionHandler(String javaScriptString,
            @ObjCBlock(name = "call_evaluateJavaScriptCompletionHandler") Block_evaluateJavaScriptCompletionHandler completionHandler);

    /**
     * Navigates to the back item in the back-forward list.
     *
     * @return A new navigation to the requested item, or nil if there is no back
     * item in the back-forward list.
     */
    @Generated
    @Selector("goBack")
    public native WKNavigation goBack();

    /**
     * Navigates to the forward item in the back-forward list.
     *
     * @return A new navigation to the requested item, or nil if there is no
     * forward item in the back-forward list.
     */
    @Generated
    @Selector("goForward")
    public native WKNavigation goForward();

    /**
     * Navigates to an item from the back-forward list and sets it
     * as the current item.
     *
     * @param item The item to which to navigate. Must be one of the items in the
     *             web view's back-forward list.
     * @return A new navigation to the requested item, or nil if it is already
     * the current item or is not part of the web view's back-forward list.
     * @see backForwardList
     */
    @Generated
    @Selector("goToBackForwardListItem:")
    public native WKNavigation goToBackForwardListItem(WKBackForwardListItem item);

    /**
     * A Boolean value indicating whether all resources on the page
     * have been loaded over securely encrypted connections.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     */
    @Generated
    @Selector("hasOnlySecureContent")
    public native boolean hasOnlySecureContent();

    @Generated
    @Selector("init")
    public native WKWebView init();

    @Generated
    @Selector("initWithCoder:")
    public native WKWebView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native WKWebView initWithFrame(@ByValue CGRect frame);

    /**
     * Returns a web view initialized with a specified frame and
     * configuration.
     * <p>
     * This is a designated initializer. You can use
     * [@link] -initWithFrame: @/link to initialize an instance with the default
     * configuration. The initializer copies the specified configuration, so
     * mutating the configuration after invoking the initializer has no effect
     * on the web view.
     *
     * @param frame         The frame for the new web view.
     * @param configuration The configuration for the new web view.
     * @return An initialized web view, or nil if the object could not be
     * initialized.
     */
    @Generated
    @Selector("initWithFrame:configuration:")
    public native WKWebView initWithFrameConfiguration(@ByValue CGRect frame, WKWebViewConfiguration configuration);

    /**
     * A Boolean value indicating whether the view is currently
     * loading content.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     */
    @Generated
    @Selector("isLoading")
    public native boolean isLoading();

    /**
     * Sets the webpage contents and base URL.
     *
     * @param data                  The data to use as the contents of the webpage.
     * @param MIMEType              The MIME type of the data.
     * @param characterEncodingName The data's character encoding name.
     * @param baseURL               A URL that is used to resolve relative URLs within the document.
     * @return A new navigation.
     */
    @Generated
    @Selector("loadData:MIMEType:characterEncodingName:baseURL:")
    public native WKNavigation loadDataMIMETypeCharacterEncodingNameBaseURL(NSData data, String MIMEType,
            String characterEncodingName, NSURL baseURL);

    /**
     * Navigates to the requested file URL on the filesystem.
     * <p>
     * If readAccessURL references a single file, only that file may be loaded by WebKit.
     * If readAccessURL references a directory, files inside that file may be loaded by WebKit.
     *
     * @param URL           The file URL to which to navigate.
     * @param readAccessURL The URL to allow read access to.
     * @return A new navigation for the given file URL.
     */
    @Generated
    @Selector("loadFileURL:allowingReadAccessToURL:")
    public native WKNavigation loadFileURLAllowingReadAccessToURL(NSURL URL, NSURL readAccessURL);

    /**
     * Sets the webpage contents and base URL.
     *
     * @param string  The string to use as the contents of the webpage.
     * @param baseURL A URL that is used to resolve relative URLs within the document.
     * @return A new navigation.
     */
    @Generated
    @Selector("loadHTMLString:baseURL:")
    public native WKNavigation loadHTMLStringBaseURL(String string, NSURL baseURL);

    /**
     * Navigates to a requested URL.
     *
     * @param request The request specifying the URL to which to navigate.
     * @return A new navigation for the given request.
     */
    @Generated
    @Selector("loadRequest:")
    public native WKNavigation loadRequest(NSURLRequest request);

    /**
     * The web view's navigation delegate.
     */
    @Generated
    @Selector("navigationDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native WKNavigationDelegate navigationDelegate();

    /**
     * Reloads the current page.
     *
     * @return A new navigation representing the reload.
     */
    @Generated
    @Selector("reload")
    public native WKNavigation reload();

    /**
     * Reloads the current page, performing end-to-end revalidation
     * using cache-validating conditionals if possible.
     *
     * @return A new navigation representing the reload.
     */
    @Generated
    @Selector("reloadFromOrigin")
    public native WKNavigation reloadFromOrigin();

    /**
     * The scroll view associated with the web view.
     */
    @Generated
    @Selector("scrollView")
    public native UIScrollView scrollView();

    /**
     * A SecTrustRef for the currently committed navigation.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     */
    @Generated
    @Selector("serverTrust")
    public native SecTrustRef serverTrust();

    /**
     * A Boolean value indicating whether horizontal swipe gestures
     * will trigger back-forward list navigations.
     * <p>
     * The default value is NO.
     */
    @Generated
    @Selector("setAllowsBackForwardNavigationGestures:")
    public native void setAllowsBackForwardNavigationGestures(boolean value);

    /**
     * A Boolean value indicating whether link preview is allowed for any
     * links inside this WKWebView.
     * <p>
     * The default value is YES on Mac and iOS.
     */
    @Generated
    @Selector("setAllowsLinkPreview:")
    public native void setAllowsLinkPreview(boolean value);

    /**
     * The custom user agent string or nil if no custom user agent string has been set.
     */
    @Generated
    @Selector("setCustomUserAgent:")
    public native void setCustomUserAgent(String value);

    /**
     * The web view's navigation delegate.
     */
    @Generated
    @Selector("setNavigationDelegate:")
    public native void setNavigationDelegate_unsafe(@Mapped(ObjCObjectMapper.class) WKNavigationDelegate value);

    /**
     * The web view's navigation delegate.
     */
    @Generated
    public void setNavigationDelegate(@Mapped(ObjCObjectMapper.class) WKNavigationDelegate value) {
        Object __old = navigationDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setNavigationDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The web view's user interface delegate.
     */
    @Generated
    @Selector("setUIDelegate:")
    public native void setUIDelegate_unsafe(@Mapped(ObjCObjectMapper.class) WKUIDelegate value);

    /**
     * The web view's user interface delegate.
     */
    @Generated
    public void setUIDelegate(@Mapped(ObjCObjectMapper.class) WKUIDelegate value) {
        Object __old = UIDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setUIDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Stops loading all resources on the current page.
     */
    @Generated
    @Selector("stopLoading")
    public native void stopLoading();

    /**
     * The page title.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_evaluateJavaScriptCompletionHandler {
        @Generated
        void call_evaluateJavaScriptCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0, NSError error);
    }

    /**
     * Checks whether or not WKWebViews handle the given URL scheme by default.
     *
     * @param scheme The URL scheme to check.
     */
    @Generated
    @Selector("handlesURLScheme:")
    public static native boolean handlesURLScheme(String urlScheme);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @Selector("takeSnapshotWithConfiguration:completionHandler:")
    public native void takeSnapshotWithConfigurationCompletionHandler(WKSnapshotConfiguration snapshotConfiguration,
            @ObjCBlock(name = "call_takeSnapshotWithConfigurationCompletionHandler") Block_takeSnapshotWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_takeSnapshotWithConfigurationCompletionHandler {
        @Generated
        void call_takeSnapshotWithConfigurationCompletionHandler(UIImage snapshotImage, NSError error);
    }

    @Generated
    @Selector("callAsyncJavaScript:arguments:inFrame:inContentWorld:completionHandler:")
    public native void callAsyncJavaScriptArgumentsInFrameInContentWorldCompletionHandler(String functionBody,
            NSDictionary<String, ?> arguments, WKFrameInfo frame, WKContentWorld contentWorld,
            @ObjCBlock(name = "call_callAsyncJavaScriptArgumentsInFrameInContentWorldCompletionHandler") Block_callAsyncJavaScriptArgumentsInFrameInContentWorldCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_callAsyncJavaScriptArgumentsInFrameInContentWorldCompletionHandler {
        @Generated
        void call_callAsyncJavaScriptArgumentsInFrameInContentWorldCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSError error);
    }

    /**
     * Create a PDF document representation from the web page currently displayed in the WKWebView
     * <p>
     * If the WKPDFConfiguration is nil, the method will create a PDF document representing the bounds of the currently displayed web page.
     * The completionHandler is passed the resulting PDF document data or an error.
     * The data can be used to create a PDFDocument object.
     * If the data is written to a file the resulting file is a valid PDF document.
     *
     * @param pdfConfiguration  An object that specifies how the PDF capture is configured.
     * @param completionHandler A block to invoke when the pdf document data is ready.
     */
    @Generated
    @Selector("createPDFWithConfiguration:completionHandler:")
    public native void createPDFWithConfigurationCompletionHandler(WKPDFConfiguration pdfConfiguration,
            @ObjCBlock(name = "call_createPDFWithConfigurationCompletionHandler") Block_createPDFWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_createPDFWithConfigurationCompletionHandler {
        @Generated
        void call_createPDFWithConfigurationCompletionHandler(NSData pdfDocumentData, NSError error);
    }

    /**
     * Create WebKit web archive data representing the current web content of the WKWebView
     * <p>
     * WebKit web archive data represents a snapshot of web content.
     * It can be used to represent web content on a pasteboard, loaded into a WKWebView directly, and saved to a file for later use.
     * The uniform type identifier kUTTypeWebArchive can be used get the related pasteboard type and MIME type.
     *
     * @param completionHandler A block to invoke when the web archive data is ready.
     */
    @Generated
    @Selector("createWebArchiveDataWithCompletionHandler:")
    public native void createWebArchiveDataWithCompletionHandler(
            @ObjCBlock(name = "call_createWebArchiveDataWithCompletionHandler") Block_createWebArchiveDataWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_createWebArchiveDataWithCompletionHandler {
        @Generated
        void call_createWebArchiveDataWithCompletionHandler(NSData arg0, NSError arg1);
    }

    /**
     * Evaluates the given JavaScript string.
     * <p>
     * The completionHandler is passed the result of the script evaluation or an error.
     * <p>
     * Passing nil is equivalent to targeting the main frame.
     * If the frame argument no longer represents a valid frame by the time WebKit attempts to call the JavaScript function your completion handler will be called with a WKErrorJavaScriptInvalidFrameTarget error.
     * This might happen for a number of reasons, including but not limited to:
     * - The target frame has been removed from the DOM via JavaScript
     * - A parent frame has navigated, destroying all of its previous child frames
     * <p>
     * No matter which WKContentWorld you use to evaluate your JavaScript string, you can make changes to the underlying web content. (e.g. the Document and its DOM structure)
     * Such changes will be visible to script executing in all WKContentWorlds.
     * Evaluating your JavaScript string can leave behind other changes to global state visibile to JavaScript. (e.g. `window.myVariable = 1;`)
     * Those changes will only be visibile to scripts executed in the same WKContentWorld.
     * evaluateJavaScript: is a great way to set up global state for future JavaScript execution in a given world. (e.g. Importing libraries/utilities that future JavaScript execution will rely on)
     * Once your global state is set up, consider using callAsyncJavaScript: for more flexible interaction with the JavaScript programming model.
     *
     * @param javaScriptString  The JavaScript string to evaluate.
     * @param frame             A WKFrameInfo identifying the frame in which to evaluate the JavaScript string.
     * @param contentWorld      The WKContentWorld in which to evaluate the JavaScript string.
     * @param completionHandler A block to invoke when script evaluation completes or fails.
     */
    @Generated
    @Selector("evaluateJavaScript:inFrame:inContentWorld:completionHandler:")
    public native void evaluateJavaScriptInFrameInContentWorldCompletionHandler(String javaScriptString,
            WKFrameInfo frame, WKContentWorld contentWorld,
            @ObjCBlock(name = "call_evaluateJavaScriptInFrameInContentWorldCompletionHandler") Block_evaluateJavaScriptInFrameInContentWorldCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_evaluateJavaScriptInFrameInContentWorldCompletionHandler {
        @Generated
        void call_evaluateJavaScriptInFrameInContentWorldCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError error);
    }

    /**
     * Searches the page contents for the given string.
     * <p>
     * If the WKFindConfiguration is nil, all of the default WKFindConfiguration values will be used.
     * A match found by the search is selected and the page is scrolled to reveal the selection.
     * The completion handler is called after the search completes.
     *
     * @param string            The string to search for.
     * @param configuration     A set of options configuring the search.
     * @param completionHandler A block to invoke when the search completes.
     */
    @Generated
    @Selector("findString:withConfiguration:completionHandler:")
    public native void findStringWithConfigurationCompletionHandler(String string, WKFindConfiguration configuration,
            @ObjCBlock(name = "call_findStringWithConfigurationCompletionHandler") Block_findStringWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findStringWithConfigurationCompletionHandler {
        @Generated
        void call_findStringWithConfigurationCompletionHandler(WKFindResult result);
    }

    /**
     * The media type for the WKWebView
     * <p>
     * The value of mediaType will override the normal value of the CSS media property.
     * Setting the value to nil will restore the normal value.
     * The default value is nil.
     */
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * The factor by which page content is scaled relative to the viewport.
     * <p>
     * The default value is 1.0.
     * Changing this value is equivalent to web content setting the CSS "zoom"
     * property on all page content.
     */
    @Generated
    @Selector("pageZoom")
    @NFloat
    public native double pageZoom();

    /**
     * The media type for the WKWebView
     * <p>
     * The value of mediaType will override the normal value of the CSS media property.
     * Setting the value to nil will restore the normal value.
     * The default value is nil.
     */
    @Generated
    @Selector("setMediaType:")
    public native void setMediaType(String value);

    /**
     * The factor by which page content is scaled relative to the viewport.
     * <p>
     * The default value is 1.0.
     * Changing this value is equivalent to web content setting the CSS "zoom"
     * property on all page content.
     */
    @Generated
    @Selector("setPageZoom:")
    public native void setPageZoom(@NFloat double value);

    /**
     * The state of camera capture on a web page.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     */
    @Generated
    @Selector("cameraCaptureState")
    @NInt
    public native long cameraCaptureState();

    @Generated
    @Selector("closeAllMediaPresentations")
    public native void closeAllMediaPresentations();

    /**
     * Closes all out-of-window media presentations in a WKWebView.
     * <p>
     * Includes picture-in-picture and fullscreen.
     */
    @Generated
    @Selector("closeAllMediaPresentationsWithCompletionHandler:")
    public native void closeAllMediaPresentationsWithCompletionHandler(
            @ObjCBlock(name = "call_closeAllMediaPresentationsWithCompletionHandler") Block_closeAllMediaPresentationsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeAllMediaPresentationsWithCompletionHandler {
        @Generated
        void call_closeAllMediaPresentationsWithCompletionHandler();
    }

    /**
     * The interaction state for the WKWebView
     * <p>
     * The interaction state (back-forward list, currently loaded page, scroll position, form data...) for the WKWebView, which
     * can be retrieved and set on another WKWebView to restore state.
     */
    @Generated
    @Selector("interactionState")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object interactionState();

    /**
     * Navigates to the requested file URL on the filesystem.
     * <p>
     * If readAccessURL references a single file, only that file may be
     * loaded by WebKit.
     * If readAccessURL references a directory, files inside that file may be loaded by WebKit.
     *
     * @param request       The request specifying the file URL to which to navigate.
     * @param readAccessURL The URL to allow read access to.
     * @return A new navigation for the given file URL.
     */
    @Generated
    @Selector("loadFileRequest:allowingReadAccessToURL:")
    public native WKNavigation loadFileRequestAllowingReadAccessToURL(NSURLRequest request, NSURL readAccessURL);

    /**
     * Sets the webpage contents from the passed data as if it was the
     * response to the supplied request. The request is never actually sent to the
     * supplied URL, though loads of resources defined in the NSData object would
     * be performed.
     *
     * @param request  The request specifying the base URL and other loading details
     *                 to be used while interpreting the supplied data object.
     * @param response A response that is used to interpret the supplied data object.
     * @param data     The data to use as the contents of the webpage.
     * @return A new navigation.
     */
    @Generated
    @Selector("loadSimulatedRequest:response:responseData:")
    public native WKNavigation loadSimulatedRequestResponseResponseData(NSURLRequest request, NSURLResponse response,
            NSData data);

    /**
     * Sets the webpage contents from the passed HTML string as if it was
     * the response to the supplied request. The request is never actually sent to the
     * supplied URL, though loads of resources defined in the HTML string would be
     * performed.
     *
     * @param request The request specifying the base URL and other loading details
     *                to be used while interpreting the supplied data object.
     * @param string  The data to use as the contents of the webpage.
     * @return A new navigation.
     */
    @Generated
    @Selector("loadSimulatedRequest:responseHTMLString:")
    public native WKNavigation loadSimulatedRequestResponseHTMLString(NSURLRequest request, String string);

    @Generated
    @Selector("loadSimulatedRequest:withResponse:responseData:")
    public native WKNavigation loadSimulatedRequestWithResponseResponseData(NSURLRequest request,
            NSURLResponse response, NSData data);

    @Generated
    @Selector("loadSimulatedRequest:withResponseHTMLString:")
    public native WKNavigation loadSimulatedRequestWithResponseHTMLString(NSURLRequest request, String string);

    /**
     * The state of microphone capture on a web page.
     * <p>
     * [@link] WKWebView @/link is key-value observing (KVO) compliant
     * for this property.
     */
    @Generated
    @Selector("microphoneCaptureState")
    @NInt
    public native long microphoneCaptureState();

    @Generated
    @Selector("pauseAllMediaPlayback:")
    public native void pauseAllMediaPlayback(
            @ObjCBlock(name = "call_pauseAllMediaPlayback") Block_pauseAllMediaPlayback completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseAllMediaPlayback {
        @Generated
        void call_pauseAllMediaPlayback();
    }

    /**
     * Pauses media playback in WKWebView.
     * <p>
     * Pauses media playback. Media in the page can be restarted by calling play() on a media element or resume() on an AudioContext in JavaScript. A user can also use media controls to play media content after it has been paused.
     */
    @Generated
    @Selector("pauseAllMediaPlaybackWithCompletionHandler:")
    public native void pauseAllMediaPlaybackWithCompletionHandler(
            @ObjCBlock(name = "call_pauseAllMediaPlaybackWithCompletionHandler") Block_pauseAllMediaPlaybackWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseAllMediaPlaybackWithCompletionHandler {
        @Generated
        void call_pauseAllMediaPlaybackWithCompletionHandler();
    }

    @Generated
    @Selector("requestMediaPlaybackState:")
    public native void requestMediaPlaybackState(
            @ObjCBlock(name = "call_requestMediaPlaybackState") Block_requestMediaPlaybackState completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestMediaPlaybackState {
        @Generated
        void call_requestMediaPlaybackState(@NInt long arg0);
    }

    /**
     * Get the current media playback state of a WKWebView.
     * <p>
     * If media playback exists, WKMediaPlaybackState will be one of three
     * values: WKMediaPlaybackPaused, WKMediaPlaybackSuspended, or WKMediaPlaybackPlaying.
     * If no media playback exists in the current WKWebView, WKMediaPlaybackState will equal
     * WKMediaPlaybackStateNone.
     *
     * @param completionHandler A block to invoke with the return value of the function call.
     */
    @Generated
    @Selector("requestMediaPlaybackStateWithCompletionHandler:")
    public native void requestMediaPlaybackStateWithCompletionHandler(
            @ObjCBlock(name = "call_requestMediaPlaybackStateWithCompletionHandler") Block_requestMediaPlaybackStateWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestMediaPlaybackStateWithCompletionHandler {
        @Generated
        void call_requestMediaPlaybackStateWithCompletionHandler(@NInt long arg0);
    }

    @Generated
    @Selector("resumeAllMediaPlayback:")
    public native void resumeAllMediaPlayback(
            @ObjCBlock(name = "call_resumeAllMediaPlayback") Block_resumeAllMediaPlayback completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeAllMediaPlayback {
        @Generated
        void call_resumeAllMediaPlayback();
    }

    /**
     * Resumes a download that failed or was canceled.
     * <p>
     * The download needs its delegate to be set in the completionHandler to receive updates about its progress.
     *
     * @param resumeData        Data from a WKDownloadDelegate's didFailWithError or a WKDownload's cancel completionHandler.
     * @param completionHandler A block called when the download has resumed.
     */
    @Generated
    @Selector("resumeDownloadFromResumeData:completionHandler:")
    public native void resumeDownloadFromResumeDataCompletionHandler(NSData resumeData,
            @ObjCBlock(name = "call_resumeDownloadFromResumeDataCompletionHandler") Block_resumeDownloadFromResumeDataCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeDownloadFromResumeDataCompletionHandler {
        @Generated
        void call_resumeDownloadFromResumeDataCompletionHandler(WKDownload arg0);
    }

    /**
     * Suspends or resumes all media playback in WKWebView.
     * <p>
     * If suspended is true, this pauses media playback and blocks all attempts by the page or the user to resume until setAllMediaPlaybackSuspended is called again with suspended set to false. Media playback should always be suspended and resumed in pairs.
     *
     * @param suspended Whether media playback should be suspended or resumed.
     */
    @Generated
    @Selector("setAllMediaPlaybackSuspended:completionHandler:")
    public native void setAllMediaPlaybackSuspendedCompletionHandler(boolean suspended,
            @ObjCBlock(name = "call_setAllMediaPlaybackSuspendedCompletionHandler") Block_setAllMediaPlaybackSuspendedCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAllMediaPlaybackSuspendedCompletionHandler {
        @Generated
        void call_setAllMediaPlaybackSuspendedCompletionHandler();
    }

    /**
     * Set camera capture state of a WKWebView.
     * <p>
     * If value is WKMediaCaptureStateNone, this will stop any camera capture.
     * If value is WKMediaCaptureStateMuted, any active camera capture will become muted.
     * If value is WKMediaCaptureStateActive, any muted camera capture will become active.
     *
     * @param state             State to apply for capture.
     * @param completionHandler A block to invoke after the camera state has been changed.
     */
    @Generated
    @Selector("setCameraCaptureState:completionHandler:")
    public native void setCameraCaptureStateCompletionHandler(@NInt long state,
            @ObjCBlock(name = "call_setCameraCaptureStateCompletionHandler") Block_setCameraCaptureStateCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCameraCaptureStateCompletionHandler {
        @Generated
        void call_setCameraCaptureStateCompletionHandler();
    }

    /**
     * The interaction state for the WKWebView
     * <p>
     * The interaction state (back-forward list, currently loaded page, scroll position, form data...) for the WKWebView, which
     * can be retrieved and set on another WKWebView to restore state.
     */
    @Generated
    @Selector("setInteractionState:")
    public native void setInteractionState(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Set microphone capture state of a WKWebView.
     * <p>
     * If value is WKMediaCaptureStateNone, this will stop any microphone capture.
     * If value is WKMediaCaptureStateMuted, any active microphone capture will become muted.
     * If value is WKMediaCaptureStateActive, any muted microphone capture will become active.
     *
     * @param state             state to apply for capture.
     * @param completionHandler A block to invoke after the camera state has been changed.
     */
    @Generated
    @Selector("setMicrophoneCaptureState:completionHandler:")
    public native void setMicrophoneCaptureStateCompletionHandler(@NInt long state,
            @ObjCBlock(name = "call_setMicrophoneCaptureStateCompletionHandler") Block_setMicrophoneCaptureStateCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMicrophoneCaptureStateCompletionHandler {
        @Generated
        void call_setMicrophoneCaptureStateCompletionHandler();
    }

    @Generated
    @Selector("setUnderPageBackgroundColor:")
    public native void setUnderPageBackgroundColor(UIColor value);

    /**
     * Begins a download in the context of the currently displayed webpage as if the WKNavigationDelegate turned a navigation into a download instead
     * <p>
     * The download needs its delegate to be set in the completionHandler to receive updates about its progress.
     *
     * @param request           The request specifying the URL to download.
     * @param completionHandler A block called when the download has started.
     */
    @Generated
    @Selector("startDownloadUsingRequest:completionHandler:")
    public native void startDownloadUsingRequestCompletionHandler(NSURLRequest request,
            @ObjCBlock(name = "call_startDownloadUsingRequestCompletionHandler") Block_startDownloadUsingRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDownloadUsingRequestCompletionHandler {
        @Generated
        void call_startDownloadUsingRequestCompletionHandler(WKDownload arg0);
    }

    @Generated
    @Selector("suspendAllMediaPlayback:")
    public native void suspendAllMediaPlayback(
            @ObjCBlock(name = "call_suspendAllMediaPlayback") Block_suspendAllMediaPlayback completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_suspendAllMediaPlayback {
        @Generated
        void call_suspendAllMediaPlayback();
    }

    @Generated
    @Selector("themeColor")
    public native UIColor themeColor();

    @Generated
    @Selector("underPageBackgroundColor")
    public native UIColor underPageBackgroundColor();
}
