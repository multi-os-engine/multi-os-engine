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

package ios.uikit;


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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSURL;
import ios.uikit.protocol.UIApplicationDelegate;
import ios.uikit.protocol.UIStateRestoring;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native UIApplication alloc();

	/**
	 * applicationIconBadgeNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/applicationIconBadgeNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applicationIconBadgeNumber")
	@NInt
	public native long applicationIconBadgeNumber();

	/**
	 * applicationState</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/applicationState">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applicationState")
	@NInt
	public native long applicationState();

	/**
	 * applicationSupportsShakeToEdit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/applicationSupportsShakeToEdit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applicationSupportsShakeToEdit")
	public native boolean applicationSupportsShakeToEdit();

	/**
	 * backgroundRefreshStatus</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/backgroundRefreshStatus">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundRefreshStatus")
	@NInt
	public native long backgroundRefreshStatus();

	/**
	 * backgroundTimeRemaining</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/backgroundTimeRemaining">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundTimeRemaining")
	public native double backgroundTimeRemaining();

	/**
	 * beginBackgroundTaskWithExpirationHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/beginBackgroundTaskWithExpirationHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginBackgroundTaskWithExpirationHandler:")
	@NUInt
	public native long beginBackgroundTaskWithExpirationHandler(
			@ObjCBlock(name = "call_beginBackgroundTaskWithExpirationHandler") Block_beginBackgroundTaskWithExpirationHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_beginBackgroundTaskWithExpirationHandler {
		@Generated
		void call_beginBackgroundTaskWithExpirationHandler();
	}

	/**
	 * beginBackgroundTaskWithName:expirationHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/beginBackgroundTaskWithName:expirationHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginBackgroundTaskWithName:expirationHandler:")
	@NUInt
	public native long beginBackgroundTaskWithNameExpirationHandler(
			String taskName,
			@ObjCBlock(name = "call_beginBackgroundTaskWithNameExpirationHandler") Block_beginBackgroundTaskWithNameExpirationHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_beginBackgroundTaskWithNameExpirationHandler {
		@Generated
		void call_beginBackgroundTaskWithNameExpirationHandler();
	}

	/**
	 * beginIgnoringInteractionEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/beginIgnoringInteractionEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginIgnoringInteractionEvents")
	public native void beginIgnoringInteractionEvents();

	/**
	 * beginReceivingRemoteControlEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/beginReceivingRemoteControlEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginReceivingRemoteControlEvents")
	public native void beginReceivingRemoteControlEvents();

	/**
	 * canOpenURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/canOpenURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canOpenURL:")
	public native boolean canOpenURL(NSURL url);

	/**
	 * cancelAllLocalNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/cancelAllLocalNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelAllLocalNotifications")
	public native void cancelAllLocalNotifications();

	/**
	 * cancelLocalNotification:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/cancelLocalNotification:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelLocalNotification:")
	public native void cancelLocalNotification(UILocalNotification notification);

	/**
	 * clearKeepAliveTimeout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/clearKeepAliveTimeout">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("clearKeepAliveTimeout")
	public native void clearKeepAliveTimeout();

	/**
	 * completeStateRestoration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/completeStateRestoration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("completeStateRestoration")
	public native void completeStateRestoration();

	/**
	 * currentUserNotificationSettings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/currentUserNotificationSettings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentUserNotificationSettings")
	public native UIUserNotificationSettings currentUserNotificationSettings();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIApplicationDelegate delegate();

	/**
	 * enabledRemoteNotificationTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/enabledRemoteNotificationTypes">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("enabledRemoteNotificationTypes")
	@NUInt
	public native long enabledRemoteNotificationTypes();

	/**
	 * endBackgroundTask:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/endBackgroundTask:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endBackgroundTask:")
	public native void endBackgroundTask(@NUInt long identifier);

	/**
	 * endIgnoringInteractionEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/endIgnoringInteractionEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endIgnoringInteractionEvents")
	public native void endIgnoringInteractionEvents();

	/**
	 * endReceivingRemoteControlEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/endReceivingRemoteControlEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endReceivingRemoteControlEvents")
	public native void endReceivingRemoteControlEvents();

	/**
	 * extendStateRestoration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/extendStateRestoration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("extendStateRestoration")
	public native void extendStateRestoration();

	/**
	 * ignoreSnapshotOnNextApplicationLaunch</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/ignoreSnapshotOnNextApplicationLaunch">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ignoreSnapshotOnNextApplicationLaunch")
	public native void ignoreSnapshotOnNextApplicationLaunch();

	@Generated
	@Selector("init")
	public native UIApplication init();

	/**
	 * idleTimerDisabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/idleTimerDisabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isIdleTimerDisabled")
	public native boolean isIdleTimerDisabled();

	/**
	 * isIgnoringInteractionEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/isIgnoringInteractionEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isIgnoringInteractionEvents")
	public native boolean isIgnoringInteractionEvents();

	/**
	 * networkActivityIndicatorVisible</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/networkActivityIndicatorVisible">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isNetworkActivityIndicatorVisible")
	public native boolean isNetworkActivityIndicatorVisible();

	/**
	 * protectedDataAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/protectedDataAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isProtectedDataAvailable")
	public native boolean isProtectedDataAvailable();

	/**
	 * proximitySensingEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/proximitySensingEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("isProximitySensingEnabled")
	public native boolean isProximitySensingEnabled();

	/**
	 * isRegisteredForRemoteNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/isRegisteredForRemoteNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isRegisteredForRemoteNotifications")
	public native boolean isRegisteredForRemoteNotifications();

	/**
	 * statusBarHidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarHidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isStatusBarHidden")
	public native boolean isStatusBarHidden();

	/**
	 * keyWindow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/keyWindow">iOS Dev Center</a>
	 */
	@Generated
	@Selector("keyWindow")
	public native UIWindow keyWindow();

	/**
	 * openURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/openURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("openURL:")
	public native boolean openURL(NSURL url);

	/**
	 * preferredContentSizeCategory</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/preferredContentSizeCategory">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredContentSizeCategory")
	public native String preferredContentSizeCategory();

	/**
	 * presentLocalNotificationNow:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/presentLocalNotificationNow:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentLocalNotificationNow:")
	public native void presentLocalNotificationNow(
			UILocalNotification notification);

	/**
	 * registerForRemoteNotificationTypes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/registerForRemoteNotificationTypes:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("registerForRemoteNotificationTypes:")
	public native void registerForRemoteNotificationTypes(@NUInt long types);

	/**
	 * registerForRemoteNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/registerForRemoteNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("registerForRemoteNotifications")
	public native void registerForRemoteNotifications();

	/**
	 * registerObjectForStateRestoration:restorationIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/clm/UIApplication/registerObjectForStateRestoration:restorationIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("registerObjectForStateRestoration:restorationIdentifier:")
	public static native void registerObjectForStateRestorationRestorationIdentifier(
			@Mapped(ObjCObjectMapper.class) UIStateRestoring object,
			String restorationIdentifier);

	/**
	 * registerUserNotificationSettings:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/registerUserNotificationSettings:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("registerUserNotificationSettings:")
	public native void registerUserNotificationSettings(
			UIUserNotificationSettings notificationSettings);

	/**
	 * scheduleLocalNotification:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/scheduleLocalNotification:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scheduleLocalNotification:")
	public native void scheduleLocalNotification(
			UILocalNotification notification);

	/**
	 * scheduledLocalNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/scheduledLocalNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scheduledLocalNotifications")
	public native NSArray<? extends UILocalNotification> scheduledLocalNotifications();

	/**
	 * sendAction:to:from:forEvent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/sendAction:to:from:forEvent:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendAction:to:from:forEvent:")
	public native boolean sendActionToFromForEvent(SEL action,
			@Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object sender, UIEvent event);

	/**
	 * sendEvent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/sendEvent:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendEvent:")
	public native void sendEvent(UIEvent event);

	/**
	 * applicationIconBadgeNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/applicationIconBadgeNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setApplicationIconBadgeNumber:")
	public native void setApplicationIconBadgeNumber(@NInt long value);

	/**
	 * applicationSupportsShakeToEdit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/applicationSupportsShakeToEdit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setApplicationSupportsShakeToEdit:")
	public native void setApplicationSupportsShakeToEdit(boolean value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UIApplicationDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/delegate">iOS Dev Center</a>
	 */
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
	 * idleTimerDisabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/idleTimerDisabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIdleTimerDisabled:")
	public native void setIdleTimerDisabled(boolean value);

	/**
	 * setKeepAliveTimeout:handler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/setKeepAliveTimeout:handler:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setKeepAliveTimeout:handler:")
	public native boolean setKeepAliveTimeoutHandler(
			double timeout,
			@ObjCBlock(name = "call_setKeepAliveTimeoutHandler") Block_setKeepAliveTimeoutHandler keepAliveHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setKeepAliveTimeoutHandler {
		@Generated
		void call_setKeepAliveTimeoutHandler();
	}

	/**
	 * setMinimumBackgroundFetchInterval:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/setMinimumBackgroundFetchInterval:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinimumBackgroundFetchInterval:")
	public native void setMinimumBackgroundFetchInterval(
			double minimumBackgroundFetchInterval);

	/**
	 * networkActivityIndicatorVisible</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/networkActivityIndicatorVisible">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNetworkActivityIndicatorVisible:")
	public native void setNetworkActivityIndicatorVisible(boolean value);

	/**
	 * setNewsstandIconImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/setNewsstandIconImage:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setNewsstandIconImage:")
	public native void setNewsstandIconImage(UIImage image);

	/**
	 * proximitySensingEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/proximitySensingEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setProximitySensingEnabled:")
	public native void setProximitySensingEnabled(boolean value);

	/**
	 * scheduledLocalNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/scheduledLocalNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setScheduledLocalNotifications:")
	public native void setScheduledLocalNotifications(NSArray<? extends UILocalNotification> value);

	/**
	 * statusBarHidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarHidden">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setStatusBarHidden:")
	public native void setStatusBarHidden(boolean value);

	/**
	 * setStatusBarHidden:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/setStatusBarHidden:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setStatusBarHidden:animated:")
	public native void setStatusBarHiddenAnimated(boolean hidden,
			boolean animated);

	/**
	 * setStatusBarHidden:withAnimation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/setStatusBarHidden:withAnimation:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setStatusBarHidden:withAnimation:")
	public native void setStatusBarHiddenWithAnimation(boolean hidden,
			@NInt long animation);

	/**
	 * statusBarOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarOrientation">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setStatusBarOrientation:")
	public native void setStatusBarOrientation(@NInt long value);

	/**
	 * setStatusBarOrientation:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/setStatusBarOrientation:animated:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setStatusBarOrientation:animated:")
	public native void setStatusBarOrientationAnimated(
			@NInt long interfaceOrientation, boolean animated);

	/**
	 * statusBarStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarStyle">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setStatusBarStyle:")
	public native void setStatusBarStyle(@NInt long value);

	/**
	 * setStatusBarStyle:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/setStatusBarStyle:animated:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setStatusBarStyle:animated:")
	public native void setStatusBarStyleAnimated(@NInt long statusBarStyle,
			boolean animated);

	/**
	 * sharedApplication</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/clm/UIApplication/sharedApplication">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharedApplication")
	public static native UIApplication sharedApplication();

	/**
	 * statusBarFrame</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarFrame">iOS Dev Center</a>
	 */
	@Generated
	@Selector("statusBarFrame")
	@ByValue
	public native CGRect statusBarFrame();

	/**
	 * statusBarOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("statusBarOrientation")
	@NInt
	public native long statusBarOrientation();

	/**
	 * statusBarOrientationAnimationDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarOrientationAnimationDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("statusBarOrientationAnimationDuration")
	public native double statusBarOrientationAnimationDuration();

	/**
	 * statusBarStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/statusBarStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("statusBarStyle")
	@NInt
	public native long statusBarStyle();

	/**
	 * supportedInterfaceOrientationsForWindow:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/supportedInterfaceOrientationsForWindow:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportedInterfaceOrientationsForWindow:")
	@NUInt
	public native long supportedInterfaceOrientationsForWindow(UIWindow window);

	/**
	 * unregisterForRemoteNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instm/UIApplication/unregisterForRemoteNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unregisterForRemoteNotifications")
	public native void unregisterForRemoteNotifications();

	/**
	 * userInterfaceLayoutDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/userInterfaceLayoutDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userInterfaceLayoutDirection")
	@NInt
	public native long userInterfaceLayoutDirection();

	/**
	 * windows</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/windows">iOS Dev Center</a>
	 */
	@Generated
	@Selector("windows")
	public native NSArray<? extends UIWindow> windows();

	/**
	 * shortcutItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/shortcutItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShortcutItems:")
	public native void setShortcutItems(NSArray<? extends UIApplicationShortcutItem> value);

	/**
	 * shortcutItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplication_Class/index.html#//apple_ref/occ/instp/UIApplication/shortcutItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shortcutItems")
	public native NSArray<? extends UIApplicationShortcutItem> shortcutItems();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

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
}
