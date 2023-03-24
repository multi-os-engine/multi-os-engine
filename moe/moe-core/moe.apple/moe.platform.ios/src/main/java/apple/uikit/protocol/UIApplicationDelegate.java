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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUserActivity;
import apple.intents.INIntent;
import apple.intents.INIntentResponse;
import apple.uikit.UIApplication;
import apple.uikit.UIApplicationShortcutItem;
import apple.uikit.UILocalNotification;
import apple.uikit.UISceneConfiguration;
import apple.uikit.UISceneConnectionOptions;
import apple.uikit.UISceneSession;
import apple.uikit.UIUserNotificationSettings;
import apple.uikit.UIViewController;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIApplicationDelegate")
public interface UIApplicationDelegate {
    /**
     * Called on the main thread after the NSUserActivity object is available. Use the data you stored in the
     * NSUserActivity object to re-create what the user was doing.
     * You can create/fetch any restorable objects associated with the user activity, and pass them to the
     * restorationHandler. They will then have the UIResponder restoreUserActivityState: method
     * invoked with the user activity. Invoking the restorationHandler is optional. It may be copied and invoked later,
     * and it will bounce to the main thread to complete its work and call
     * restoreUserActivityState on all objects.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("application:continueUserActivity:restorationHandler:")
    default boolean applicationContinueUserActivityRestorationHandler(@NotNull UIApplication application,
            @NotNull NSUserActivity userActivity,
            @NotNull @ObjCBlock(name = "call_applicationContinueUserActivityRestorationHandler") Block_applicationContinueUserActivityRestorationHandler restorationHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:didChangeStatusBarFrame:")
    default void applicationDidChangeStatusBarFrame(@NotNull UIApplication application,
            @ByValue CGRect oldStatusBarFrame) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:didChangeStatusBarOrientation:")
    default void applicationDidChangeStatusBarOrientation(@NotNull UIApplication application,
            @NInt long oldStatusBarOrientation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("application:didDecodeRestorableStateWithCoder:")
    default void applicationDidDecodeRestorableStateWithCoder(@NotNull UIApplication application,
            @NotNull NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If the user activity cannot be fetched after willContinueUserActivityWithType is called, this will be called on
     * the main thread when implemented.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("application:didFailToContinueUserActivityWithType:error:")
    default void applicationDidFailToContinueUserActivityWithTypeError(@NotNull UIApplication application,
            @NotNull String userActivityType, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("application:didFailToRegisterForRemoteNotificationsWithError:")
    default void applicationDidFailToRegisterForRemoteNotificationsWithError(@NotNull UIApplication application,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("application:didFinishLaunchingWithOptions:")
    default boolean applicationDidFinishLaunchingWithOptions(@NotNull UIApplication application,
            @Nullable NSDictionary<String, ?> launchOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenterDelegate
     * willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate
     * didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:didReceiveLocalNotification:")
    default void applicationDidReceiveLocalNotification(@NotNull UIApplication application,
            @NotNull UILocalNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenterDelegate
     * willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate
     * didReceiveNotificationResponse:withCompletionHandler:] for user visible notifications and -[UIApplicationDelegate
     * application:didReceiveRemoteNotification:fetchCompletionHandler:] for silent remote notifications
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:didReceiveRemoteNotification:")
    default void applicationDidReceiveRemoteNotification(@NotNull UIApplication application,
            @NotNull NSDictionary<?, ?> userInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This delegate method offers an opportunity for applications with the "remote-notification" background mode to
     * fetch appropriate new data in response to an incoming remote notification. You should call the
     * fetchCompletionHandler as soon as you're finished performing that operation, so the system can accurately
     * estimate its power and data cost.
     * 
     * This method will be invoked even if the application was launched or resumed because of the remote notification.
     * The respective delegate methods will be invoked first. Note that this behavior is in contrast to
     * application:didReceiveRemoteNotification:, which is not called in those cases, and which will not be invoked if
     * this method is implemented. !
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("application:didReceiveRemoteNotification:fetchCompletionHandler:")
    default void applicationDidReceiveRemoteNotificationFetchCompletionHandler(@NotNull UIApplication application,
            @NotNull NSDictionary<?, ?> userInfo,
            @NotNull @ObjCBlock(name = "call_applicationDidReceiveRemoteNotificationFetchCompletionHandler") Block_applicationDidReceiveRemoteNotificationFetchCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("application:didRegisterForRemoteNotificationsWithDeviceToken:")
    default void applicationDidRegisterForRemoteNotificationsWithDeviceToken(@NotNull UIApplication application,
            @NotNull NSData deviceToken) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This callback will be made upon calling -[UIApplication registerUserNotificationSettings:]. The settings the user
     * has granted to the application will be passed in as the second argument.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenter
     * requestAuthorizationWithOptions:completionHandler:]
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:didRegisterUserNotificationSettings:")
    default void applicationDidRegisterUserNotificationSettings(@NotNull UIApplication application,
            @NotNull UIUserNotificationSettings notificationSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called on the main thread when a user activity managed by UIKit has been updated. You can use this as a
     * last chance to add additional data to the userActivity.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("application:didUpdateUserActivity:")
    default void applicationDidUpdateUserActivity(@NotNull UIApplication application,
            @NotNull NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when your app has been activated by the user selecting an action from a local notification.
     * A nil action identifier indicates the default action.
     * You should call the completion handler as soon as you've finished handling the action.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenterDelegate
     * didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    default void applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler(
            @NotNull UIApplication application, @Nullable String identifier, @NotNull UILocalNotification notification,
            @NotNull @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler") Block_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenterDelegate
     * didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:")
    default void applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler(
            @NotNull UIApplication application, @Nullable String identifier, @NotNull UILocalNotification notification,
            @NotNull NSDictionary<?, ?> responseInfo,
            @NotNull @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler") Block_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when your app has been activated by the user selecting an action from a remote notification.
     * A nil action identifier indicates the default action.
     * You should call the completion handler as soon as you've finished handling the action.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenterDelegate
     * didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    default void applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler(
            @NotNull UIApplication application, @Nullable String identifier, @NotNull NSDictionary<?, ?> userInfo,
            @NotNull @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler") Block_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's -[UNUserNotificationCenterDelegate
     * didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:")
    default void applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler(
            @NotNull UIApplication application, @Nullable String identifier, @NotNull NSDictionary<?, ?> userInfo,
            @NotNull NSDictionary<?, ?> responseInfo,
            @NotNull @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler") Block_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Applications using an NSURLSession with a background configuration may be launched or resumed in the background
     * in order to handle the
     * completion of tasks in that session, or to handle authentication. This method will be called with the identifier
     * of the session needing
     * attention. Once a session has been created from a configuration object with that identifier, the session's
     * delegate will begin receiving
     * callbacks. If such a session has already been created (if the app is being resumed, for instance), then the
     * delegate will start receiving
     * callbacks without any action by the application. You should call the completionHandler as soon as you're finished
     * handling the callbacks.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("application:handleEventsForBackgroundURLSession:completionHandler:")
    default void applicationHandleEventsForBackgroundURLSessionCompletionHandler(@NotNull UIApplication application,
            @NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_applicationHandleEventsForBackgroundURLSessionCompletionHandler") Block_applicationHandleEventsForBackgroundURLSessionCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("application:handleOpenURL:")
    default boolean applicationHandleOpenURL(@NotNull UIApplication application, @NotNull NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 8.2
     */
    @Generated
    @IsOptional
    @Selector("application:handleWatchKitExtensionRequest:reply:")
    default void applicationHandleWatchKitExtensionRequestReply(@NotNull UIApplication application,
            @Nullable NSDictionary<?, ?> userInfo,
            @NotNull @ObjCBlock(name = "call_applicationHandleWatchKitExtensionRequestReply") Block_applicationHandleWatchKitExtensionRequestReply reply) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * no equiv. notification. return NO if the application can't open for some reason
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("application:openURL:options:")
    default boolean applicationOpenURLOptions(@NotNull UIApplication app, @NotNull NSURL url,
            @NotNull NSDictionary<String, ?> options) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.2
     * Deprecated-Since: 9.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("application:openURL:sourceApplication:annotation:")
    default boolean applicationOpenURLSourceApplicationAnnotation(@NotNull UIApplication application,
            @NotNull NSURL url, @Nullable String sourceApplication,
            @NotNull @Mapped(ObjCObjectMapper.class) Object annotation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user activates your application by selecting a shortcut on the home screen,
     * except when -application:willFinishLaunchingWithOptions: or -application:didFinishLaunchingWithOptions returns
     * NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("application:performActionForShortcutItem:completionHandler:")
    default void applicationPerformActionForShortcutItemCompletionHandler(@NotNull UIApplication application,
            @NotNull UIApplicationShortcutItem shortcutItem,
            @NotNull @ObjCBlock(name = "call_applicationPerformActionForShortcutItemCompletionHandler") Block_applicationPerformActionForShortcutItemCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Applications with the "fetch" background mode may be given opportunities to fetch updated content in the
     * background or when it is convenient for the system. This method will be called in these situations. You should
     * call the fetchCompletionHandler as soon as you're finished performing that operation, so the system can
     * accurately estimate its power and data cost.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use a BGAppRefreshTask in the BackgroundTasks framework instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:performFetchWithCompletionHandler:")
    default void applicationPerformFetchWithCompletionHandler(@NotNull UIApplication application,
            @NotNull @ObjCBlock(name = "call_applicationPerformFetchWithCompletionHandler") Block_applicationPerformFetchWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Applications may reject specific types of extensions based on the extension point identifier.
     * Constants representing common extension point identifiers are provided further down.
     * If unimplemented, the default behavior is to allow the extension point identifier.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("application:shouldAllowExtensionPointIdentifier:")
    default boolean applicationShouldAllowExtensionPointIdentifier(@NotNull UIApplication application,
            @NotNull String extensionPointIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     * Deprecated-Since: 13.2
     * Deprecated-Message: Use application:shouldRestoreSecureApplicationState: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:shouldRestoreApplicationState:")
    default boolean applicationShouldRestoreApplicationState(@NotNull UIApplication application,
            @NotNull NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Deprecated State Restoration opt-in methods:
     * 
     * API-Since: 6.0
     * Deprecated-Since: 13.2
     * Deprecated-Message: Use application:shouldSaveSecureApplicationState: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:shouldSaveApplicationState:")
    default boolean applicationShouldSaveApplicationState(@NotNull UIApplication application, @NotNull NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("application:supportedInterfaceOrientationsForWindow:")
    @NUInt
    default long applicationSupportedInterfaceOrientationsForWindow(@NotNull UIApplication application,
            @Nullable UIWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This will be called on the main thread after the user indicates they want to accept a CloudKit sharing invitation
     * in your application.
     * You should use the CKShareMetadata object's shareURL and containerIdentifier to schedule a
     * CKAcceptSharesOperation, then start using
     * the resulting CKShare and its associated record(s), which will appear in the CKContainer's shared database in a
     * zone matching that of the record's owner.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("application:userDidAcceptCloudKitShareWithMetadata:")
    default void applicationUserDidAcceptCloudKitShareWithMetadata(@NotNull UIApplication application,
            @NotNull CKShareMetadata cloudKitShareMetadata) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("application:viewControllerWithRestorationIdentifierPath:coder:")
    default UIViewController applicationViewControllerWithRestorationIdentifierPathCoder(
            @NotNull UIApplication application, @NotNull NSArray<String> identifierComponents, @NotNull NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * in screen coordinates
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:willChangeStatusBarFrame:")
    default void applicationWillChangeStatusBarFrame(@NotNull UIApplication application,
            @ByValue CGRect newStatusBarFrame) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:willChangeStatusBarOrientation:duration:")
    default void applicationWillChangeStatusBarOrientationDuration(@NotNull UIApplication application,
            @NInt long newStatusBarOrientation, double duration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the main thread as soon as the user indicates they want to continue an activity in your application.
     * The NSUserActivity object may not be available instantly,
     * so use this as an opportunity to show the user that an activity will be continued shortly.
     * For each application:willContinueUserActivityWithType: invocation, you are guaranteed to get exactly one
     * invocation of application:continueUserActivity: on success,
     * or application:didFailToContinueUserActivityWithType:error: if an error was encountered.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("application:willContinueUserActivityWithType:")
    default boolean applicationWillContinueUserActivityWithType(@NotNull UIApplication application,
            @NotNull String userActivityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("application:willEncodeRestorableStateWithCoder:")
    default void applicationWillEncodeRestorableStateWithCoder(@NotNull UIApplication application,
            @NotNull NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("application:willFinishLaunchingWithOptions:")
    default boolean applicationWillFinishLaunchingWithOptions(@NotNull UIApplication application,
            @Nullable NSDictionary<String, ?> launchOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationDidBecomeActive:")
    default void applicationDidBecomeActive(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("applicationDidEnterBackground:")
    default void applicationDidEnterBackground(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationDidFinishLaunching:")
    default void applicationDidFinishLaunching(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * try to clean up as much memory as possible. next step is to terminate app
     */
    @Generated
    @IsOptional
    @Selector("applicationDidReceiveMemoryWarning:")
    default void applicationDidReceiveMemoryWarning(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("applicationProtectedDataDidBecomeAvailable:")
    default void applicationProtectedDataDidBecomeAvailable(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("applicationProtectedDataWillBecomeUnavailable:")
    default void applicationProtectedDataWillBecomeUnavailable(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("applicationShouldRequestHealthAuthorization:")
    default void applicationShouldRequestHealthAuthorization(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * midnight, carrier time update, daylight savings time change
     */
    @Generated
    @IsOptional
    @Selector("applicationSignificantTimeChange:")
    default void applicationSignificantTimeChange(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("applicationWillEnterForeground:")
    default void applicationWillEnterForeground(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationWillResignActive:")
    default void applicationWillResignActive(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("applicationWillTerminate:")
    default void applicationWillTerminate(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("setWindow:")
    default void setWindow(@Nullable UIWindow value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     */
    @Nullable
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
        void call_applicationContinueUserActivityRestorationHandler(@Nullable NSArray<?> restorableObjects);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationDidReceiveRemoteNotificationFetchCompletionHandler {
        @Generated
        void call_applicationDidReceiveRemoteNotificationFetchCompletionHandler(@NUInt long result);
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
        void call_applicationHandleWatchKitExtensionRequestReply(@Nullable NSDictionary<?, ?> replyInfo);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationPerformActionForShortcutItemCompletionHandler {
        @Generated
        void call_applicationPerformActionForShortcutItemCompletionHandler(boolean succeeded);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationPerformFetchWithCompletionHandler {
        @Generated
        void call_applicationPerformFetchWithCompletionHandler(@NUInt long result);
    }

    /**
     * API-Since: 11.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use application:handlerForIntent: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:handleIntent:completionHandler:")
    default void applicationHandleIntentCompletionHandler(@NotNull UIApplication application, @NotNull INIntent intent,
            @NotNull @ObjCBlock(name = "call_applicationHandleIntentCompletionHandler") Block_applicationHandleIntentCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleIntentCompletionHandler {
        @Generated
        void call_applicationHandleIntentCompletionHandler(@NotNull INIntentResponse intentResponse);
    }

    /**
     * Called when the UIKit is about to create & vend a new UIScene instance to the application.
     * The application delegate may modify the provided UISceneConfiguration within this method.
     * If the UISceneConfiguration instance returned from this method does not have a systemType which matches the
     * connectingSession's, UIKit will assert
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("application:configurationForConnectingSceneSession:options:")
    default UISceneConfiguration applicationConfigurationForConnectingSceneSessionOptions(
            @NotNull UIApplication application, @NotNull UISceneSession connectingSceneSession,
            @NotNull UISceneConnectionOptions options) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the system, due to a user interaction or a request from the application itself, removes one or more
     * representation from the -[UIApplication openSessions] set
     * If sessions are discarded while the application is not running, this method is called shortly after the
     * applications next launch.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("application:didDiscardSceneSessions:")
    default void applicationDidDiscardSceneSessions(@NotNull UIApplication application,
            @NotNull NSSet<? extends UISceneSession> sceneSessions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.2
     */
    @Generated
    @IsOptional
    @Selector("application:shouldRestoreSecureApplicationState:")
    default boolean applicationShouldRestoreSecureApplicationState(@NotNull UIApplication application,
            @NotNull NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.2
     */
    @Generated
    @IsOptional
    @Selector("application:shouldSaveSecureApplicationState:")
    default boolean applicationShouldSaveSecureApplicationState(@NotNull UIApplication application,
            @NotNull NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("application:handlerForIntent:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object applicationHandlerForIntent(@NotNull UIApplication application, @NotNull INIntent intent) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * UIKeyCommand system-wide keyboard shortcut localization support
     * This method will be called during application launch.
     * Return NO if the receiving delegate object wishes to opt-out of system-wide keyboard shortcut localization for
     * all application-supplied UIKeyCommands. Return YES by default for apps linked against 15.0 and later SDK.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("applicationShouldAutomaticallyLocalizeKeyCommands:")
    default boolean applicationShouldAutomaticallyLocalizeKeyCommands(@NotNull UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }
}
