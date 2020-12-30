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

package apple.iad;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.iad.protocol.ADInterstitialAdDelegate;
import apple.uikit.UIView;
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
 * ADInterstitialAd is a full screen advertisement, available on iPad since
 * iOS 4.3, and on iPhone since iOS 7.0.
 * 
 * There are three ways to display an ADInterstitialAd:
 * 
 *   • By providing a container view and calling -presentInView:
 *   • By providing a view controller and calling -presentFromViewController:
 *   • Indirectly, by setting the interstitial presentation policy on a view
 *     controller to Automatic or Manual (via -[UIViewController setInterstitialPresentationPolicy:]),
 *     and letting the framework manage presentation.
 * 
 * An ADInterstitialAd should not be presented until it has loaded content. This
 * is indicated via the -interstitialAdDidLoad: delegate method, and can also be
 * queried via the loaded property. If the interstitial ad is presented when
 * loaded=NO, an exception will be thrown.
 * 
 * Note that using interstitial ads on iPhones running iOS < 7.0 will cause an
 * exception to be thrown.
 */
@Generated
@Library("iAd")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ADInterstitialAd extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ADInterstitialAd(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ADInterstitialAd alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * [@property] cancelAction
     * 
     * Cancels the current in-progress action. This should only be used in cases
     * where the user's attention is required immediately. If this method is called,
     * -interstitialAdActionDidFinish: will not be called.
     */
    @Generated
    @Selector("cancelAction")
    public native void cancelAction();

    /**
     * [@property] delegate
     * 
     * The interstitial ad delegate is notified when it has loaded, when errors
     * occur in getting ads, when actions begin and end, and when it has unloaded.
     * 
     * On iOS 5 and later, this property is a weak reference and cannot be used with
     * objects that modify the behavior of release or retain.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ADInterstitialAdDelegate delegate();

    @Generated
    @Selector("init")
    public native ADInterstitialAd init();

    /**
     * [@property] actionInProgress
     * 
     * Actions display full screen content in a modal session. Use this property to
     * determine if such an action is currently in progress.
     */
    @Generated
    @Selector("isActionInProgress")
    public native boolean isActionInProgress();

    /**
     * [@property] loaded
     * 
     * @return
     * YES if an ad is loaded, NO otherwise. This property should always be checked
     * before the interstitial ad is presented.
     */
    @Generated
    @Selector("isLoaded")
    public native boolean isLoaded();

    /**
     * presentFromViewController:
     * 
     * As of iOS 7.0, the interstitial ad presentation APIs on UIViewController
     * should be used instead of managing your own ADInterstitialAd and presenting
     * it via the presentFromViewController: API.
     * 
     * On iOS < 7.0, this method should be used to present the interstitial ad in a
     * non-paging UI, such as a transition or at the end of a game level. When this
     * API is used, the framework will manage how the interstitial is displayed and
     * what happens when the user dismisses it.
     * 
     * User dismissal of either the interstitial or the ad unit to which it is
     * linked will restore control to the application immediately.
     */
    @Generated
    @Selector("presentFromViewController:")
    public native void presentFromViewController(UIViewController viewController);

    /**
     * presentInView:
     * 
     * This method should be used to display the interstitial in a view hierarchy.
     * The view hierarchy must be managed by a view controller and the size of the
     * container view must fit the following constraints:
     * 
     *   • Width must be DEVICE_WIDTH for the current orientation.
     *   • Height must be at least (DEVICE_HEIGHT - STATUS_BAR_HEIGHT - NAVIGATION_BAR_HEIGHT - TAB_BAR_HEIGHT).
     *   • Height must not exceed DEVICE_HEIGHT
     * 
     * @throws NSInternalInconsistencyException
     * If the container view is not already in a view controller's managed hierarchy,
     * an exception will be thrown.
     * 
     * @throws NSInternalInconsistencyException
     * If the interstitial has not loaded at the time this method is invoked, an
     * exception will be thrown.
     * 
     * @return
     * YES if the interstitial could be presented, NO otherwise.
     */
    @Generated
    @Selector("presentInView:")
    public native boolean presentInView(UIView containerView);

    /**
     * [@property] delegate
     * 
     * The interstitial ad delegate is notified when it has loaded, when errors
     * occur in getting ads, when actions begin and end, and when it has unloaded.
     * 
     * On iOS 5 and later, this property is a weak reference and cannot be used with
     * objects that modify the behavior of release or retain.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) ADInterstitialAdDelegate value);

    /**
     * [@property] delegate
     * 
     * The interstitial ad delegate is notified when it has loaded, when errors
     * occur in getting ads, when actions begin and end, and when it has unloaded.
     * 
     * On iOS 5 and later, this property is a weak reference and cannot be used with
     * objects that modify the behavior of release or retain.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) ADInterstitialAdDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}
