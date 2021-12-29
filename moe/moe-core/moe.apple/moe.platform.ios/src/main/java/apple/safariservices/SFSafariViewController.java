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

package apple.safariservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.safariservices.protocol.SFSafariViewControllerDelegate;
import apple.uikit.UIColor;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SFSafariViewController
 * A view controller for displaying web content in a Safari-like interface with some of Safari’s features.
 */
@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSafariViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSafariViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSafariViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSafariViewController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SFSafariViewController new_objc();

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
     * The view controller's delegate.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SFSafariViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native SFSafariViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native SFSafariViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native SFSafariViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Returns a view controller that loads a URL.
     *
     * @param URL the initial URL to navigate to. Only supports initial URLs with http:// or https:// schemes.
     */
    @Generated
    @Selector("initWithURL:")
    public native SFSafariViewController initWithURL(NSURL URL);

    /**
     * Returns a view controller that loads a URL.
     *
     * @param URL                     the initial URL to navigate to. Only supports initial URLs with http:// or https:// schemes.
     * @param entersReaderIfAvailable indicates if the Safari Reader version of content should be shown automatically
     *                                when Safari Reader is available on a web page.
     */
    @Generated
    @Selector("initWithURL:entersReaderIfAvailable:")
    public native SFSafariViewController initWithURLEntersReaderIfAvailable(NSURL URL, boolean entersReaderIfAvailable);

    /**
     * The preferred color to tint the background of the navigation bar and toolbar. If SFSafariViewController is in Private
     * Browsing mode or is displaying an anti-phishing warning page, this color will be ignored. Changes made after the view controller
     * has been presented will not be reflected.
     */
    @Generated
    @Selector("preferredBarTintColor")
    public native UIColor preferredBarTintColor();

    /**
     * The preferred color to tint the control buttons on the navigation bar and toolbar. If SFSafariViewController is in Private
     * Browsing mode or is displaying an anti-phishing warning page, this color will be ignored. Changes made after the view controller
     * has been presented will not be reflected.
     */
    @Generated
    @Selector("preferredControlTintColor")
    public native UIColor preferredControlTintColor();

    /**
     * The view controller's delegate.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SFSafariViewControllerDelegate value);

    /**
     * The view controller's delegate.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) SFSafariViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The preferred color to tint the background of the navigation bar and toolbar. If SFSafariViewController is in Private
     * Browsing mode or is displaying an anti-phishing warning page, this color will be ignored. Changes made after the view controller
     * has been presented will not be reflected.
     */
    @Generated
    @Selector("setPreferredBarTintColor:")
    public native void setPreferredBarTintColor(UIColor value);

    /**
     * The preferred color to tint the control buttons on the navigation bar and toolbar. If SFSafariViewController is in Private
     * Browsing mode or is displaying an anti-phishing warning page, this color will be ignored. Changes made after the view controller
     * has been presented will not be reflected.
     */
    @Generated
    @Selector("setPreferredControlTintColor:")
    public native void setPreferredControlTintColor(UIColor value);

    /**
     * A copy of the configuration with which the view controller was
     * initialized.
     */
    @Generated
    @Selector("configuration")
    public native SFSafariViewControllerConfiguration configuration();

    /**
     * The style of dismiss button to use in the navigation bar to close SFSafariViewController.
     * The default value is SFSafariViewControllerDismissButtonStyleDone, which makes the button title the localized
     * string "Done". You can use other values such as "Close" to provide consistency with your app. "Cancel" is
     * ideal when using SFSafariViewController to log in to an external service. All values will show a string localized
     * to the user's locale. Changing this property after SFSafariViewController is presented will animate the change.
     */
    @Generated
    @Selector("dismissButtonStyle")
    @NInt
    public native long dismissButtonStyle();

    /**
     * Returns a view controller that loads a URL.
     * <p>
     * This is a designated initializer. You can use
     * [@link] -initWithURL: @/link to initialize an instance with the default configuration. Mutating the configuration after invoking the initializer has no effect on the view controller.
     *
     * @param URL           the initial URL to navigate to. Only supports initial URLs with http:// or https:// schemes.
     * @param configuration the configuration for the new view controller.
     */
    @Generated
    @Selector("initWithURL:configuration:")
    public native SFSafariViewController initWithURLConfiguration(NSURL URL,
            SFSafariViewControllerConfiguration configuration);

    /**
     * The style of dismiss button to use in the navigation bar to close SFSafariViewController.
     * The default value is SFSafariViewControllerDismissButtonStyleDone, which makes the button title the localized
     * string "Done". You can use other values such as "Close" to provide consistency with your app. "Cancel" is
     * ideal when using SFSafariViewController to log in to an external service. All values will show a string localized
     * to the user's locale. Changing this property after SFSafariViewController is presented will animate the change.
     */
    @Generated
    @Selector("setDismissButtonStyle:")
    public native void setDismissButtonStyle(@NInt long value);

    /**
     * Prewarms a connection to each URL. SFSafariViewController will automatically use a
     * prewarmed connection if possible when loading its initial URL.
     * <p>
     * This method uses a best-effort approach to prewarming connections, but may delay
     * or drop requests based on the volume of requests made by your app. Use this method when you expect
     * to present SFSafariViewController soon. Many HTTP servers time out connections after a few minutes.
     * After a timeout, prewarming delivers less performance benefit.
     *
     * @param URLs the URLs of servers that SFSafariViewController should prewarm connections to.
     *             Only supports URLs with http:// or https:// schemes.
     * @return Returns a token object that corresponds to the requested URLs. You must keep a strong
     * reference to this token as long as you expect the prewarmed connections to remain open. If the same
     * server is requested in multiple calls to this method, all of the corresponding tokens must be
     * invalidated or released to end the prewarmed connection to that server.
     */
    @Generated
    @Selector("prewarmConnectionsToURLs:")
    public static native SFSafariViewControllerPrewarmingToken prewarmConnectionsToURLs(NSArray<? extends NSURL> URLs);
}
