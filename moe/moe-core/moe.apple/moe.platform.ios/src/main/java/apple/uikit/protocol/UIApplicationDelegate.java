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

package apple.uikit.protocol;

import apple.cloudkit.CKShareMetadata;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.foundation.NSUserActivity;
import apple.uikit.UIApplication;
import apple.uikit.UIApplicationShortcutItem;
import apple.uikit.UILocalNotification;
import apple.uikit.UIUserNotificationSettings;
import apple.uikit.UIViewController;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIApplicationDelegate")
public interface UIApplicationDelegate {
    @Generated
    @IsOptional
    @Selector("application:continueUserActivity:restorationHandler:")
    default boolean applicationContinueUserActivityRestorationHandler(UIApplication application,
            NSUserActivity userActivity,
            @ObjCBlock(name = "call_applicationContinueUserActivityRestorationHandler") Block_applicationContinueUserActivityRestorationHandler restorationHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didChangeStatusBarFrame:")
    default void applicationDidChangeStatusBarFrame(UIApplication application, @ByValue CGRect oldStatusBarFrame) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didChangeStatusBarOrientation:")
    default void applicationDidChangeStatusBarOrientation(UIApplication application,
            @NInt long oldStatusBarOrientation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didDecodeRestorableStateWithCoder:")
    default void applicationDidDecodeRestorableStateWithCoder(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didFailToContinueUserActivityWithType:error:")
    default void applicationDidFailToContinueUserActivityWithTypeError(UIApplication application,
            String userActivityType, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didFailToRegisterForRemoteNotificationsWithError:")
    default void applicationDidFailToRegisterForRemoteNotificationsWithError(UIApplication application, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didFinishLaunchingWithOptions:")
    default boolean applicationDidFinishLaunchingWithOptions(UIApplication application,
            NSDictionary<?, ?> launchOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didReceiveLocalNotification:")
    default void applicationDidReceiveLocalNotification(UIApplication application, UILocalNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didReceiveRemoteNotification:")
    default void applicationDidReceiveRemoteNotification(UIApplication application, NSDictionary<?, ?> userInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didReceiveRemoteNotification:fetchCompletionHandler:")
    default void applicationDidReceiveRemoteNotificationFetchCompletionHandler(UIApplication application,
            NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_applicationDidReceiveRemoteNotificationFetchCompletionHandler") Block_applicationDidReceiveRemoteNotificationFetchCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didRegisterForRemoteNotificationsWithDeviceToken:")
    default void applicationDidRegisterForRemoteNotificationsWithDeviceToken(UIApplication application,
            NSData deviceToken) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didRegisterUserNotificationSettings:")
    default void applicationDidRegisterUserNotificationSettings(UIApplication application,
            UIUserNotificationSettings notificationSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didUpdateUserActivity:")
    default void applicationDidUpdateUserActivity(UIApplication application, NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    default void applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler(UIApplication application,
            String identifier, UILocalNotification notification,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler") Block_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:")
    default void applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler(
            UIApplication application, String identifier, UILocalNotification notification,
            NSDictionary<?, ?> responseInfo,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler") Block_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    default void applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler(UIApplication application,
            String identifier, NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler") Block_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:")
    default void applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler(
            UIApplication application, String identifier, NSDictionary<?, ?> userInfo, NSDictionary<?, ?> responseInfo,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler") Block_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:handleEventsForBackgroundURLSession:completionHandler:")
    default void applicationHandleEventsForBackgroundURLSessionCompletionHandler(UIApplication application,
            String identifier,
            @ObjCBlock(name = "call_applicationHandleEventsForBackgroundURLSessionCompletionHandler") Block_applicationHandleEventsForBackgroundURLSessionCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("application:handleOpenURL:")
    default boolean applicationHandleOpenURL(UIApplication application, NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:handleWatchKitExtensionRequest:reply:")
    default void applicationHandleWatchKitExtensionRequestReply(UIApplication application, NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_applicationHandleWatchKitExtensionRequestReply") Block_applicationHandleWatchKitExtensionRequestReply reply) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:openURL:options:")
    default boolean applicationOpenURLOptions(UIApplication app, NSURL url, NSDictionary<String, ?> options) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("application:openURL:sourceApplication:annotation:")
    default boolean applicationOpenURLSourceApplicationAnnotation(UIApplication application, NSURL url,
            String sourceApplication, @Mapped(ObjCObjectMapper.class) Object annotation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:performActionForShortcutItem:completionHandler:")
    default void applicationPerformActionForShortcutItemCompletionHandler(UIApplication application,
            UIApplicationShortcutItem shortcutItem,
            @ObjCBlock(name = "call_applicationPerformActionForShortcutItemCompletionHandler") Block_applicationPerformActionForShortcutItemCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:performFetchWithCompletionHandler:")
    default void applicationPerformFetchWithCompletionHandler(UIApplication application,
            @ObjCBlock(name = "call_applicationPerformFetchWithCompletionHandler") Block_applicationPerformFetchWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:shouldAllowExtensionPointIdentifier:")
    default boolean applicationShouldAllowExtensionPointIdentifier(UIApplication application,
            String extensionPointIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:shouldRestoreApplicationState:")
    default boolean applicationShouldRestoreApplicationState(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:shouldSaveApplicationState:")
    default boolean applicationShouldSaveApplicationState(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:supportedInterfaceOrientationsForWindow:")
    @NUInt
    default long applicationSupportedInterfaceOrientationsForWindow(UIApplication application, UIWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:userDidAcceptCloudKitShareWithMetadata:")
    default void applicationUserDidAcceptCloudKitShareWithMetadata(UIApplication application,
            CKShareMetadata cloudKitShareMetadata) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:viewControllerWithRestorationIdentifierPath:coder:")
    default UIViewController applicationViewControllerWithRestorationIdentifierPathCoder(UIApplication application,
            NSArray<?> identifierComponents, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:willChangeStatusBarFrame:")
    default void applicationWillChangeStatusBarFrame(UIApplication application, @ByValue CGRect newStatusBarFrame) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:willChangeStatusBarOrientation:duration:")
    default void applicationWillChangeStatusBarOrientationDuration(UIApplication application,
            @NInt long newStatusBarOrientation, double duration) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:willContinueUserActivityWithType:")
    default boolean applicationWillContinueUserActivityWithType(UIApplication application, String userActivityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:willEncodeRestorableStateWithCoder:")
    default void applicationWillEncodeRestorableStateWithCoder(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:willFinishLaunchingWithOptions:")
    default boolean applicationWillFinishLaunchingWithOptions(UIApplication application,
            NSDictionary<?, ?> launchOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationDidBecomeActive:")
    default void applicationDidBecomeActive(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationDidEnterBackground:")
    default void applicationDidEnterBackground(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationDidFinishLaunching:")
    default void applicationDidFinishLaunching(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationDidReceiveMemoryWarning:")
    default void applicationDidReceiveMemoryWarning(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationProtectedDataDidBecomeAvailable:")
    default void applicationProtectedDataDidBecomeAvailable(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationProtectedDataWillBecomeUnavailable:")
    default void applicationProtectedDataWillBecomeUnavailable(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationShouldRequestHealthAuthorization:")
    default void applicationShouldRequestHealthAuthorization(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationSignificantTimeChange:")
    default void applicationSignificantTimeChange(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationWillEnterForeground:")
    default void applicationWillEnterForeground(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationWillResignActive:")
    default void applicationWillResignActive(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationWillTerminate:")
    default void applicationWillTerminate(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("setWindow:")
    default void setWindow(UIWindow value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("window")
    default UIWindow window() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationContinueUserActivityRestorationHandler {
        @Generated
        void call_applicationContinueUserActivityRestorationHandler(NSArray<?> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationDidReceiveRemoteNotificationFetchCompletionHandler {
        @Generated
        void call_applicationDidReceiveRemoteNotificationFetchCompletionHandler(@NUInt long arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler {
        @Generated
        void call_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler {
        @Generated
        void call_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler {
        @Generated
        void call_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler {
        @Generated
        void call_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleEventsForBackgroundURLSessionCompletionHandler {
        @Generated
        void call_applicationHandleEventsForBackgroundURLSessionCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleWatchKitExtensionRequestReply {
        @Generated
        void call_applicationHandleWatchKitExtensionRequestReply(NSDictionary<?, ?> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationPerformActionForShortcutItemCompletionHandler {
        @Generated
        void call_applicationPerformActionForShortcutItemCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationPerformFetchWithCompletionHandler {
        @Generated
        void call_applicationPerformFetchWithCompletionHandler(@NUInt long arg0);
    }
}
