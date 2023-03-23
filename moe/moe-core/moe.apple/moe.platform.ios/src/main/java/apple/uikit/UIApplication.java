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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUserActivity;
import apple.uikit.protocol.UIApplicationDelegate;
import apple.uikit.protocol.UIStateRestoring;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGRect;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIApplication extends UIResponder {
    static {
        NatJ.register();
    }

    @Generated
    protected UIApplication(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIApplication alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIApplication allocWithZone(VoidPtr zone);

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
    public static native UIApplication new_objc();

    /**
     * Register non-View/ViewController objects for state restoration so other objects can reference them within state
     * restoration archives.
     * If the object implements encode/decode, those methods will be called during save/restore.
     * Obj and identifier must not be nil, or will raise UIRestorationObjectRegistrationException.
     * Objects do not need to be unregistered when they are deleted, the State Restoration system will notice and stop
     * tracking the object.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("registerObjectForStateRestoration:restorationIdentifier:")
    public static native void registerObjectForStateRestorationRestorationIdentifier(
            @Mapped(ObjCObjectMapper.class) UIStateRestoring object, String restorationIdentifier);

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
    @Selector("sharedApplication")
    public static native UIApplication sharedApplication();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * set to 0 to hide. default is 0. In iOS 8.0 and later, your application must register for user notifications using
     * -[UIApplication registerUserNotificationSettings:] before being able to set the icon badge.
     */
    @Generated
    @Selector("applicationIconBadgeNumber")
    @NInt
    public native long applicationIconBadgeNumber();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("applicationState")
    @NInt
    public native long applicationState();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("applicationSupportsShakeToEdit")
    public native boolean applicationSupportsShakeToEdit();

    /**
     * When background refresh is available for an application, it may launched or resumed in the background to handle
     * significant
     * location changes, remote notifications, background fetches, etc. Observe
     * UIApplicationBackgroundRefreshStatusDidChangeNotification to
     * be notified of changes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("backgroundRefreshStatus")
    @NInt
    public native long backgroundRefreshStatus();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("backgroundTimeRemaining")
    public native double backgroundTimeRemaining();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("beginBackgroundTaskWithExpirationHandler:")
    @NUInt
    public native long beginBackgroundTaskWithExpirationHandler(
            @ObjCBlock(name = "call_beginBackgroundTaskWithExpirationHandler") Block_beginBackgroundTaskWithExpirationHandler handler);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("beginBackgroundTaskWithName:expirationHandler:")
    @NUInt
    public native long beginBackgroundTaskWithNameExpirationHandler(String taskName,
            @ObjCBlock(name = "call_beginBackgroundTaskWithNameExpirationHandler") Block_beginBackgroundTaskWithNameExpirationHandler handler);

    /**
     * nested. set should be set during animations & transitions to ignore touch and other events
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use UIView's userInteractionEnabled property instead
     */
    @Deprecated
    @Generated
    @Selector("beginIgnoringInteractionEvents")
    public native void beginIgnoringInteractionEvents();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("beginReceivingRemoteControlEvents")
    public native void beginReceivingRemoteControlEvents();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("canOpenURL:")
    public native boolean canOpenURL(NSURL url);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * removeAllPendingNotificationRequests]
     */
    @Deprecated
    @Generated
    @Selector("cancelAllLocalNotifications")
    public native void cancelAllLocalNotifications();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * removePendingNotificationRequestsWithIdentifiers:]
     */
    @Deprecated
    @Generated
    @Selector("cancelLocalNotification:")
    public native void cancelLocalNotification(UILocalNotification notification);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Please use PushKit for VoIP applications instead of calling this method
     */
    @Generated
    @Deprecated
    @Selector("clearKeepAliveTimeout")
    public native void clearKeepAliveTimeout();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("completeStateRestoration")
    public native void completeStateRestoration();

    /**
     * Returns the enabled user notification settings, also taking into account any systemwide settings.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * getNotificationSettingsWithCompletionHandler:] and -[UNUserNotificationCenter
     * getNotificationCategoriesWithCompletionHandler:]
     */
    @Deprecated
    @Generated
    @Selector("currentUserNotificationSettings")
    public native UIUserNotificationSettings currentUserNotificationSettings();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIApplicationDelegate delegate();

    /**
     * Returns the enabled types, also taking into account any systemwide settings; doesn't relate to connectivity.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use -[UIApplication isRegisteredForRemoteNotifications] and UserNotifications Framework's
     * -[UNUserNotificationCenter getNotificationSettingsWithCompletionHandler:] to retrieve user-enabled remote
     * notification and user notification settings
     */
    @Generated
    @Deprecated
    @Selector("enabledRemoteNotificationTypes")
    @NUInt
    public native long enabledRemoteNotificationTypes();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("endBackgroundTask:")
    public native void endBackgroundTask(@NUInt long identifier);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use UIView's userInteractionEnabled property instead
     */
    @Deprecated
    @Generated
    @Selector("endIgnoringInteractionEvents")
    public native void endIgnoringInteractionEvents();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("endReceivingRemoteControlEvents")
    public native void endReceivingRemoteControlEvents();

    /**
     * These methods are used to inform the system that state restoration is occurring asynchronously after the
     * application
     * has processed its restoration archive on launch. In the even of a crash, the system will be able to detect that
     * it may
     * have been caused by a bad restoration archive and arrange to ignore it on a subsequent application launch.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("extendStateRestoration")
    public native void extendStateRestoration();

    /**
     * Indicate the application should not use the snapshot on next launch, even if there is a valid state restoration
     * archive.
     * This should only be called from methods invoked from State Preservation, else it is ignored.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("ignoreSnapshotOnNextApplicationLaunch")
    public native void ignoreSnapshotOnNextApplicationLaunch();

    @Generated
    @Selector("init")
    public native UIApplication init();

    /**
     * default is NO
     */
    @Generated
    @Selector("isIdleTimerDisabled")
    public native boolean isIdleTimerDisabled();

    /**
     * default is NO
     */
    @Generated
    @Selector("setIdleTimerDisabled:")
    public native void setIdleTimerDisabled(boolean value);

    /**
     * returns YES if we are at least one deep in ignoring events
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use UIView's userInteractionEnabled property instead
     */
    @Deprecated
    @Generated
    @Selector("isIgnoringInteractionEvents")
    public native boolean isIgnoringInteractionEvents();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Provide a custom network activity UI in your app if desired.
     */
    @Deprecated
    @Generated
    @Selector("isNetworkActivityIndicatorVisible")
    public native boolean isNetworkActivityIndicatorVisible();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Provide a custom network activity UI in your app if desired.
     */
    @Deprecated
    @Generated
    @Selector("setNetworkActivityIndicatorVisible:")
    public native void setNetworkActivityIndicatorVisible(boolean value);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("isProtectedDataAvailable")
    public native boolean isProtectedDataAvailable();

    /**
     * default is NO. see UIDevice for replacement
     * 
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     */
    @Generated
    @Deprecated
    @Selector("isProximitySensingEnabled")
    public native boolean isProximitySensingEnabled();

    /**
     * default is NO. see UIDevice for replacement
     * 
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     */
    @Generated
    @Deprecated
    @Selector("setProximitySensingEnabled:")
    public native void setProximitySensingEnabled(boolean value);

    /**
     * Returns YES if the application is currently registered for remote notifications, taking into account any
     * systemwide settings; doesn't relate to connectivity.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isRegisteredForRemoteNotifications")
    public native boolean isRegisteredForRemoteNotifications();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the statusBarManager property of the window scene instead.
     */
    @Deprecated
    @Generated
    @Selector("isStatusBarHidden")
    public native boolean isStatusBarHidden();

    /**
     * Setting statusBarHidden does nothing if your application is using the default UIViewController-based status bar
     * system.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -[UIViewController prefersStatusBarHidden]
     */
    @Generated
    @Deprecated
    @Selector("setStatusBarHidden:")
    public native void setStatusBarHidden(boolean value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Should not be used for applications that support multiple scenes as it returns a key window
     * across all connected scenes
     */
    @Deprecated
    @Generated
    @Selector("keyWindow")
    public native UIWindow keyWindow();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("openURL:")
    public native boolean openURL(NSURL url);

    /**
     * Options are specified in the section below for openURL options. An empty options dictionary will result in the
     * same
     * behavior as the older openURL call, aside from the fact that this is asynchronous and calls the completion
     * handler rather
     * than returning a result.
     * The completion handler is called on the main queue.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("openURL:options:completionHandler:")
    public native void openURLOptionsCompletionHandler(NSURL url, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_openURLOptionsCompletionHandler") Block_openURLOptionsCompletionHandler completion);

    /**
     * Return the size category
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("preferredContentSizeCategory")
    public native String preferredContentSizeCategory();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * addNotificationRequest:withCompletionHandler:]
     */
    @Deprecated
    @Generated
    @Selector("presentLocalNotificationNow:")
    public native void presentLocalNotificationNow(UILocalNotification notification);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use -[UIApplication registerForRemoteNotifications] and UserNotifications Framework's
     * -[UNUserNotificationCenter requestAuthorizationWithOptions:completionHandler:]
     */
    @Generated
    @Deprecated
    @Selector("registerForRemoteNotificationTypes:")
    public native void registerForRemoteNotificationTypes(@NUInt long types);

    /**
     * Calling this will result in either application:didRegisterForRemoteNotificationsWithDeviceToken: or
     * application:didFailToRegisterForRemoteNotificationsWithError: to be called on the application delegate. Note:
     * these callbacks will be made only if the application has successfully registered for user notifications with
     * registerUserNotificationSettings:, or if it is enabled for Background App Refresh.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("registerForRemoteNotifications")
    public native void registerForRemoteNotifications();

    /**
     * Registering UIUserNotificationSettings more than once results in previous settings being overwritten.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * requestAuthorizationWithOptions:completionHandler:] and -[UNUserNotificationCenter setNotificationCategories:]
     */
    @Deprecated
    @Generated
    @Selector("registerUserNotificationSettings:")
    public native void registerUserNotificationSettings(UIUserNotificationSettings notificationSettings);

    /**
     * copies notification
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * addNotificationRequest:withCompletionHandler:]
     */
    @Deprecated
    @Generated
    @Selector("scheduleLocalNotification:")
    public native void scheduleLocalNotification(UILocalNotification notification);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * getPendingNotificationRequestsWithCompletionHandler:]
     */
    @Deprecated
    @Generated
    @Selector("scheduledLocalNotifications")
    public native NSArray<? extends UILocalNotification> scheduledLocalNotifications();

    @Generated
    @Selector("sendAction:to:from:forEvent:")
    public native boolean sendActionToFromForEvent(SEL action, @Mapped(ObjCObjectMapper.class) Object target,
            @Mapped(ObjCObjectMapper.class) Object sender, UIEvent event);

    @Generated
    @Selector("sendEvent:")
    public native void sendEvent(UIEvent event);

    /**
     * set to 0 to hide. default is 0. In iOS 8.0 and later, your application must register for user notifications using
     * -[UIApplication registerUserNotificationSettings:] before being able to set the icon badge.
     */
    @Generated
    @Selector("setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@NInt long value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setApplicationSupportsShakeToEdit:")
    public native void setApplicationSupportsShakeToEdit(boolean value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UIApplicationDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UIApplicationDelegate value) {
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
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Please use PushKit for VoIP applications instead of calling this method
     */
    @Generated
    @Deprecated
    @Selector("setKeepAliveTimeout:handler:")
    public native boolean setKeepAliveTimeoutHandler(double timeout,
            @ObjCBlock(name = "call_setKeepAliveTimeoutHandler") Block_setKeepAliveTimeoutHandler keepAliveHandler);

    /**
     * The system guarantees that it will not wake up your application for a background fetch more
     * frequently than the interval provided. Set to UIApplicationBackgroundFetchIntervalMinimum to be
     * woken as frequently as the system desires, or to UIApplicationBackgroundFetchIntervalNever (the
     * default) to never be woken for a background fetch.
     * 
     * This setter will have no effect unless your application has the "fetch"
     * UIBackgroundMode. See the UIApplicationDelegate method
     * `application:performFetchWithCompletionHandler:` for more.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use a BGAppRefreshTask in the BackgroundTasks framework instead
     */
    @Deprecated
    @Generated
    @Selector("setMinimumBackgroundFetchInterval:")
    public native void setMinimumBackgroundFetchInterval(double minimumBackgroundFetchInterval);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Newsstand apps now behave like normal apps on SpringBoard
     */
    @Generated
    @Deprecated
    @Selector("setNewsstandIconImage:")
    public native void setNewsstandIconImage(UIImage image);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * getPendingNotificationRequestsWithCompletionHandler:]
     */
    @Deprecated
    @Generated
    @Selector("setScheduledLocalNotifications:")
    public native void setScheduledLocalNotifications(NSArray<? extends UILocalNotification> value);

    /**
     * Register shortcuts to display on the home screen, or retrieve currently registered shortcuts.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setShortcutItems:")
    public native void setShortcutItems(NSArray<? extends UIApplicationShortcutItem> value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.2
     * Deprecated-Message: Use -[UIViewController prefersStatusBarHidden]
     */
    @Generated
    @Deprecated
    @Selector("setStatusBarHidden:animated:")
    public native void setStatusBarHiddenAnimated(boolean hidden, boolean animated);

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -[UIViewController prefersStatusBarHidden]
     */
    @Generated
    @Deprecated
    @Selector("setStatusBarHidden:withAnimation:")
    public native void setStatusBarHiddenWithAnimation(boolean hidden, @NInt long animation);

    /**
     * Explicit setting of the status bar orientation is more limited in iOS 6.0 and later.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Explicit setting of the status bar orientation is more limited in iOS 6.0 and later
     */
    @Generated
    @Deprecated
    @Selector("setStatusBarOrientation:")
    public native void setStatusBarOrientation(@NInt long value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Explicit setting of the status bar orientation is more limited in iOS 6.0 and later
     */
    @Generated
    @Deprecated
    @Selector("setStatusBarOrientation:animated:")
    public native void setStatusBarOrientationAnimated(@NInt long interfaceOrientation, boolean animated);

    /**
     * Setting the statusBarStyle does nothing if your application is using the default UIViewController-based status
     * bar system.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -[UIViewController preferredStatusBarStyle]
     */
    @Generated
    @Deprecated
    @Selector("setStatusBarStyle:")
    public native void setStatusBarStyle(@NInt long value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -[UIViewController preferredStatusBarStyle]
     */
    @Generated
    @Deprecated
    @Selector("setStatusBarStyle:animated:")
    public native void setStatusBarStyleAnimated(@NInt long statusBarStyle, boolean animated);

    /**
     * Register shortcuts to display on the home screen, or retrieve currently registered shortcuts.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("shortcutItems")
    public native NSArray<? extends UIApplicationShortcutItem> shortcutItems();

    /**
     * returns CGRectZero if the status bar is hidden
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the statusBarManager property of the window scene instead.
     */
    @Deprecated
    @Generated
    @Selector("statusBarFrame")
    @ByValue
    public native CGRect statusBarFrame();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the interfaceOrientation property of the window scene instead.
     */
    @Deprecated
    @Generated
    @Selector("statusBarOrientation")
    @NInt
    public native long statusBarOrientation();

    /**
     * Returns the animation duration for the status bar during a 90 degree orientation change. It should be doubled for
     * a 180 degree orientation change.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Generated
    @Selector("statusBarOrientationAnimationDuration")
    public native double statusBarOrientationAnimationDuration();

    /**
     * default is UIStatusBarStyleDefault
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the statusBarManager property of the window scene instead.
     */
    @Deprecated
    @Generated
    @Selector("statusBarStyle")
    @NInt
    public native long statusBarStyle();

    /**
     * The system only calls this method if the application delegate has not
     * implemented the delegate equivalent. It returns the orientations specified by
     * the application's info.plist. If no supported interface orientations were
     * specified it will return UIInterfaceOrientationMaskAll on an iPad and
     * UIInterfaceOrientationMaskAllButUpsideDown on a phone. The return value
     * should be one of the UIInterfaceOrientationMask values which indicates the
     * orientations supported by this application.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("supportedInterfaceOrientationsForWindow:")
    @NUInt
    public native long supportedInterfaceOrientationsForWindow(UIWindow window);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("unregisterForRemoteNotifications")
    public native void unregisterForRemoteNotifications();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("userInterfaceLayoutDirection")
    @NInt
    public native long userInterfaceLayoutDirection();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UIWindowScene.windows on a relevant window scene instead
     */
    @Deprecated
    @Generated
    @Selector("windows")
    public native NSArray<? extends UIWindow> windows();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginBackgroundTaskWithExpirationHandler {
        @Generated
        void call_beginBackgroundTaskWithExpirationHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginBackgroundTaskWithNameExpirationHandler {
        @Generated
        void call_beginBackgroundTaskWithNameExpirationHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openURLOptionsCompletionHandler {
        @Generated
        void call_openURLOptionsCompletionHandler(boolean success);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setKeepAliveTimeoutHandler {
        @Generated
        void call_setKeepAliveTimeoutHandler();
    }

    /**
     * If `nil`, the primary application icon is being used.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("alternateIconName")
    public native String alternateIconName();

    /**
     * Pass `nil` to use the primary application icon. The completion handler will be invoked asynchronously on an
     * arbitrary background queue; be sure to dispatch back to the main queue before doing any further UI work.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("setAlternateIconName:completionHandler:")
    public native void setAlternateIconNameCompletionHandler(String alternateIconName,
            @ObjCBlock(name = "call_setAlternateIconNameCompletionHandler") Block_setAlternateIconNameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAlternateIconNameCompletionHandler {
        @Generated
        void call_setAlternateIconNameCompletionHandler(NSError error);
    }

    /**
     * If false, alternate icons are not supported for the current process.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("supportsAlternateIcons")
    public native boolean supportsAlternateIcons();

    /**
     * All of the currently connected UIScene instances
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("connectedScenes")
    public native NSSet<? extends UIScene> connectedScenes();

    /**
     * All of the representations that currently have connected UIScene instances or had their sessions persisted by the
     * system (ex: visible in iOS' switcher)
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("openSessions")
    public native NSSet<? extends UISceneSession> openSessions();

    /**
     * Request a given session be activated, first connecting it to the application if necessary.
     * Providing a session will activate, connecting if necessary, the interface backed by the already existing
     * UISceneSession.
     * Providing a user activity will dispatch that activity to the provided session's scene. If no session is provided,
     * then the system will select one (possibly creating a new session, if appropriate) and pass the activity to the
     * session scene's delegate.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestSceneSessionActivation:userActivity:options:errorHandler:")
    public native void requestSceneSessionActivationUserActivityOptionsErrorHandler(UISceneSession sceneSession,
            NSUserActivity userActivity, UISceneActivationRequestOptions options,
            @ObjCBlock(name = "call_requestSceneSessionActivationUserActivityOptionsErrorHandler") Block_requestSceneSessionActivationUserActivityOptionsErrorHandler errorHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSceneSessionActivationUserActivityOptionsErrorHandler {
        @Generated
        void call_requestSceneSessionActivationUserActivityOptionsErrorHandler(NSError error);
    }

    /**
     * requests that a given session be closed, disconnecting the currently connected scene if present, and calling the
     * -application:didDiscardSceneSessions: method on the application's delegate
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestSceneSessionDestruction:options:errorHandler:")
    public native void requestSceneSessionDestructionOptionsErrorHandler(UISceneSession sceneSession,
            UISceneDestructionRequestOptions options,
            @ObjCBlock(name = "call_requestSceneSessionDestructionOptionsErrorHandler") Block_requestSceneSessionDestructionOptionsErrorHandler errorHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSceneSessionDestructionOptionsErrorHandler {
        @Generated
        void call_requestSceneSessionDestructionOptionsErrorHandler(NSError error);
    }

    /**
     * requests that any system UI representing a scene be updated due to background updates or any other relevant
     * model/state update.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestSceneSessionRefresh:")
    public native void requestSceneSessionRefresh(UISceneSession sceneSession);

    /**
     * returns YES if the application both declares multiple scene support in its info.plist and the executing
     * environment allows multiple scenes for at least one system type. NO otherwise.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportsMultipleScenes")
    public native boolean supportsMultipleScenes();
}
