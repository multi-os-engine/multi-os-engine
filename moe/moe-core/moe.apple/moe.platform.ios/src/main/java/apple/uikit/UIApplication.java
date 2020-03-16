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
import apple.coregraphics.struct.CGRect;
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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("applicationIconBadgeNumber")
    @NInt
    public native long applicationIconBadgeNumber();

    @Generated
    @Selector("applicationState")
    @NInt
    public native long applicationState();

    @Generated
    @Selector("applicationSupportsShakeToEdit")
    public native boolean applicationSupportsShakeToEdit();

    @Generated
    @Selector("backgroundRefreshStatus")
    @NInt
    public native long backgroundRefreshStatus();

    @Generated
    @Selector("backgroundTimeRemaining")
    public native double backgroundTimeRemaining();

    @Generated
    @Selector("beginBackgroundTaskWithExpirationHandler:")
    @NUInt
    public native long beginBackgroundTaskWithExpirationHandler(
            @ObjCBlock(name = "call_beginBackgroundTaskWithExpirationHandler") Block_beginBackgroundTaskWithExpirationHandler handler);

    @Generated
    @Selector("beginBackgroundTaskWithName:expirationHandler:")
    @NUInt
    public native long beginBackgroundTaskWithNameExpirationHandler(String taskName,
            @ObjCBlock(name = "call_beginBackgroundTaskWithNameExpirationHandler") Block_beginBackgroundTaskWithNameExpirationHandler handler);

    @Generated
    @Selector("beginIgnoringInteractionEvents")
    public native void beginIgnoringInteractionEvents();

    @Generated
    @Selector("beginReceivingRemoteControlEvents")
    public native void beginReceivingRemoteControlEvents();

    @Generated
    @Selector("canOpenURL:")
    public native boolean canOpenURL(NSURL url);

    @Generated
    @Selector("cancelAllLocalNotifications")
    public native void cancelAllLocalNotifications();

    @Generated
    @Selector("cancelLocalNotification:")
    public native void cancelLocalNotification(UILocalNotification notification);

    @Generated
    @Deprecated
    @Selector("clearKeepAliveTimeout")
    public native void clearKeepAliveTimeout();

    @Generated
    @Selector("completeStateRestoration")
    public native void completeStateRestoration();

    @Generated
    @Selector("currentUserNotificationSettings")
    public native UIUserNotificationSettings currentUserNotificationSettings();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIApplicationDelegate delegate();

    @Generated
    @Deprecated
    @Selector("enabledRemoteNotificationTypes")
    @NUInt
    public native long enabledRemoteNotificationTypes();

    @Generated
    @Selector("endBackgroundTask:")
    public native void endBackgroundTask(@NUInt long identifier);

    @Generated
    @Selector("endIgnoringInteractionEvents")
    public native void endIgnoringInteractionEvents();

    @Generated
    @Selector("endReceivingRemoteControlEvents")
    public native void endReceivingRemoteControlEvents();

    @Generated
    @Selector("extendStateRestoration")
    public native void extendStateRestoration();

    @Generated
    @Selector("ignoreSnapshotOnNextApplicationLaunch")
    public native void ignoreSnapshotOnNextApplicationLaunch();

    @Generated
    @Selector("init")
    public native UIApplication init();

    @Generated
    @Selector("isIdleTimerDisabled")
    public native boolean isIdleTimerDisabled();

    @Generated
    @Selector("setIdleTimerDisabled:")
    public native void setIdleTimerDisabled(boolean value);

    @Generated
    @Selector("isIgnoringInteractionEvents")
    public native boolean isIgnoringInteractionEvents();

    @Generated
    @Selector("isNetworkActivityIndicatorVisible")
    public native boolean isNetworkActivityIndicatorVisible();

    @Generated
    @Selector("setNetworkActivityIndicatorVisible:")
    public native void setNetworkActivityIndicatorVisible(boolean value);

    @Generated
    @Selector("isProtectedDataAvailable")
    public native boolean isProtectedDataAvailable();

    @Generated
    @Deprecated
    @Selector("isProximitySensingEnabled")
    public native boolean isProximitySensingEnabled();

    @Generated
    @Deprecated
    @Selector("setProximitySensingEnabled:")
    public native void setProximitySensingEnabled(boolean value);

    @Generated
    @Selector("isRegisteredForRemoteNotifications")
    public native boolean isRegisteredForRemoteNotifications();

    @Generated
    @Selector("isStatusBarHidden")
    public native boolean isStatusBarHidden();

    @Generated
    @Deprecated
    @Selector("setStatusBarHidden:")
    public native void setStatusBarHidden(boolean value);

    @Generated
    @Selector("keyWindow")
    public native UIWindow keyWindow();

    @Generated
    @Selector("openURL:")
    public native boolean openURL(NSURL url);

    @Generated
    @Selector("openURL:options:completionHandler:")
    public native void openURLOptionsCompletionHandler(NSURL url, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_openURLOptionsCompletionHandler") Block_openURLOptionsCompletionHandler completion);

    @Generated
    @Selector("preferredContentSizeCategory")
    public native String preferredContentSizeCategory();

    @Generated
    @Selector("presentLocalNotificationNow:")
    public native void presentLocalNotificationNow(UILocalNotification notification);

    @Generated
    @Deprecated
    @Selector("registerForRemoteNotificationTypes:")
    public native void registerForRemoteNotificationTypes(@NUInt long types);

    @Generated
    @Selector("registerForRemoteNotifications")
    public native void registerForRemoteNotifications();

    @Generated
    @Selector("registerUserNotificationSettings:")
    public native void registerUserNotificationSettings(UIUserNotificationSettings notificationSettings);

    @Generated
    @Selector("scheduleLocalNotification:")
    public native void scheduleLocalNotification(UILocalNotification notification);

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

    @Generated
    @Selector("setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@NInt long value);

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

    @Generated
    @Deprecated
    @Selector("setKeepAliveTimeout:handler:")
    public native boolean setKeepAliveTimeoutHandler(double timeout,
            @ObjCBlock(name = "call_setKeepAliveTimeoutHandler") Block_setKeepAliveTimeoutHandler keepAliveHandler);

    @Generated
    @Selector("setMinimumBackgroundFetchInterval:")
    public native void setMinimumBackgroundFetchInterval(double minimumBackgroundFetchInterval);

    @Generated
    @Deprecated
    @Selector("setNewsstandIconImage:")
    public native void setNewsstandIconImage(UIImage image);

    @Generated
    @Selector("setScheduledLocalNotifications:")
    public native void setScheduledLocalNotifications(NSArray<? extends UILocalNotification> value);

    @Generated
    @Selector("setShortcutItems:")
    public native void setShortcutItems(NSArray<? extends UIApplicationShortcutItem> value);

    @Generated
    @Deprecated
    @Selector("setStatusBarHidden:animated:")
    public native void setStatusBarHiddenAnimated(boolean hidden, boolean animated);

    @Generated
    @Deprecated
    @Selector("setStatusBarHidden:withAnimation:")
    public native void setStatusBarHiddenWithAnimation(boolean hidden, @NInt long animation);

    @Generated
    @Deprecated
    @Selector("setStatusBarOrientation:")
    public native void setStatusBarOrientation(@NInt long value);

    @Generated
    @Deprecated
    @Selector("setStatusBarOrientation:animated:")
    public native void setStatusBarOrientationAnimated(@NInt long interfaceOrientation, boolean animated);

    @Generated
    @Deprecated
    @Selector("setStatusBarStyle:")
    public native void setStatusBarStyle(@NInt long value);

    @Generated
    @Deprecated
    @Selector("setStatusBarStyle:animated:")
    public native void setStatusBarStyleAnimated(@NInt long statusBarStyle, boolean animated);

    @Generated
    @Selector("shortcutItems")
    public native NSArray<? extends UIApplicationShortcutItem> shortcutItems();

    @Generated
    @Selector("statusBarFrame")
    @ByValue
    public native CGRect statusBarFrame();

    @Generated
    @Selector("statusBarOrientation")
    @NInt
    public native long statusBarOrientation();

    @Generated
    @Selector("statusBarOrientationAnimationDuration")
    public native double statusBarOrientationAnimationDuration();

    @Generated
    @Selector("statusBarStyle")
    @NInt
    public native long statusBarStyle();

    @Generated
    @Selector("supportedInterfaceOrientationsForWindow:")
    @NUInt
    public native long supportedInterfaceOrientationsForWindow(UIWindow window);

    @Generated
    @Selector("unregisterForRemoteNotifications")
    public native void unregisterForRemoteNotifications();

    @Generated
    @Selector("userInterfaceLayoutDirection")
    @NInt
    public native long userInterfaceLayoutDirection();

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
        void call_openURLOptionsCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setKeepAliveTimeoutHandler {
        @Generated
        void call_setKeepAliveTimeoutHandler();
    }

    @Generated
    @Selector("alternateIconName")
    public native String alternateIconName();

    @Generated
    @Selector("setAlternateIconName:completionHandler:")
    public native void setAlternateIconNameCompletionHandler(String alternateIconName,
            @ObjCBlock(name = "call_setAlternateIconNameCompletionHandler") Block_setAlternateIconNameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAlternateIconNameCompletionHandler {
        @Generated
        void call_setAlternateIconNameCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("supportsAlternateIcons")
    public native boolean supportsAlternateIcons();

    @Generated
    @Selector("connectedScenes")
    public native NSSet<? extends UIScene> connectedScenes();

    @Generated
    @Selector("openSessions")
    public native NSSet<? extends UISceneSession> openSessions();

    @Generated
    @Selector("requestSceneSessionActivation:userActivity:options:errorHandler:")
    public native void requestSceneSessionActivationUserActivityOptionsErrorHandler(UISceneSession sceneSession,
            NSUserActivity userActivity, UISceneActivationRequestOptions options,
            @ObjCBlock(name = "call_requestSceneSessionActivationUserActivityOptionsErrorHandler") Block_requestSceneSessionActivationUserActivityOptionsErrorHandler errorHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSceneSessionActivationUserActivityOptionsErrorHandler {
        @Generated
        void call_requestSceneSessionActivationUserActivityOptionsErrorHandler(NSError arg0);
    }

    @Generated
    @Selector("requestSceneSessionDestruction:options:errorHandler:")
    public native void requestSceneSessionDestructionOptionsErrorHandler(UISceneSession sceneSession,
            UISceneDestructionRequestOptions options,
            @ObjCBlock(name = "call_requestSceneSessionDestructionOptionsErrorHandler") Block_requestSceneSessionDestructionOptionsErrorHandler errorHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSceneSessionDestructionOptionsErrorHandler {
        @Generated
        void call_requestSceneSessionDestructionOptionsErrorHandler(NSError arg0);
    }

    @Generated
    @Selector("requestSceneSessionRefresh:")
    public native void requestSceneSessionRefresh(UISceneSession sceneSession);

    @Generated
    @Selector("supportsMultipleScenes")
    public native boolean supportsMultipleScenes();
}
