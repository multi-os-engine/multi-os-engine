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
    /**
     * application:continueUserActivity:restorationHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:continueUserActivity:restorationHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:continueUserActivity:restorationHandler:")
    default boolean applicationContinueUserActivityRestorationHandler(UIApplication application,
            NSUserActivity userActivity,
            @ObjCBlock(name = "call_applicationContinueUserActivityRestorationHandler") Block_applicationContinueUserActivityRestorationHandler restorationHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didChangeStatusBarFrame:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didChangeStatusBarFrame:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didChangeStatusBarFrame:")
    default void applicationDidChangeStatusBarFrame(UIApplication application, @ByValue CGRect oldStatusBarFrame) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didChangeStatusBarOrientation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didChangeStatusBarOrientation:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didChangeStatusBarOrientation:")
    default void applicationDidChangeStatusBarOrientation(UIApplication application,
            @NInt long oldStatusBarOrientation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didDecodeRestorableStateWithCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didDecodeRestorableStateWithCoder:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didDecodeRestorableStateWithCoder:")
    default void applicationDidDecodeRestorableStateWithCoder(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didFailToContinueUserActivityWithType:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didFailToContinueUserActivityWithType:error:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didFailToContinueUserActivityWithType:error:")
    default void applicationDidFailToContinueUserActivityWithTypeError(UIApplication application,
            String userActivityType, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didFailToRegisterForRemoteNotificationsWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didFailToRegisterForRemoteNotificationsWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didFailToRegisterForRemoteNotificationsWithError:")
    default void applicationDidFailToRegisterForRemoteNotificationsWithError(UIApplication application, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didFinishLaunchingWithOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didFinishLaunchingWithOptions:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didFinishLaunchingWithOptions:")
    default boolean applicationDidFinishLaunchingWithOptions(UIApplication application,
            NSDictionary<?, ?> launchOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didReceiveLocalNotification:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didReceiveLocalNotification:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didReceiveLocalNotification:")
    default void applicationDidReceiveLocalNotification(UIApplication application, UILocalNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didReceiveRemoteNotification:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didReceiveRemoteNotification:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didReceiveRemoteNotification:")
    default void applicationDidReceiveRemoteNotification(UIApplication application, NSDictionary<?, ?> userInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didReceiveRemoteNotification:fetchCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didReceiveRemoteNotification:fetchCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didReceiveRemoteNotification:fetchCompletionHandler:")
    default void applicationDidReceiveRemoteNotificationFetchCompletionHandler(UIApplication application,
            NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_applicationDidReceiveRemoteNotificationFetchCompletionHandler") Block_applicationDidReceiveRemoteNotificationFetchCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didRegisterForRemoteNotificationsWithDeviceToken:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didRegisterForRemoteNotificationsWithDeviceToken:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didRegisterForRemoteNotificationsWithDeviceToken:")
    default void applicationDidRegisterForRemoteNotificationsWithDeviceToken(UIApplication application,
            NSData deviceToken) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didRegisterUserNotificationSettings:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didRegisterUserNotificationSettings:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didRegisterUserNotificationSettings:")
    default void applicationDidRegisterUserNotificationSettings(UIApplication application,
            UIUserNotificationSettings notificationSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:didUpdateUserActivity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:didUpdateUserActivity:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:didUpdateUserActivity:")
    default void applicationDidUpdateUserActivity(UIApplication application, NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:handleActionWithIdentifier:forLocalNotification:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:handleActionWithIdentifier:forLocalNotification:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    default void applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler(UIApplication application,
            String identifier, UILocalNotification notification,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler") Block_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:handleActionWithIdentifier:forRemoteNotification:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:handleActionWithIdentifier:forRemoteNotification:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    default void applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler(UIApplication application,
            String identifier, NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler") Block_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:handleEventsForBackgroundURLSession:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:handleEventsForBackgroundURLSession:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:handleEventsForBackgroundURLSession:completionHandler:")
    default void applicationHandleEventsForBackgroundURLSessionCompletionHandler(UIApplication application,
            String identifier,
            @ObjCBlock(name = "call_applicationHandleEventsForBackgroundURLSessionCompletionHandler") Block_applicationHandleEventsForBackgroundURLSessionCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:handleOpenURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:handleOpenURL:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:handleOpenURL:")
    default boolean applicationHandleOpenURL(UIApplication application, NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:handleWatchKitExtensionRequest:reply:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:handleWatchKitExtensionRequest:reply:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:handleWatchKitExtensionRequest:reply:")
    default void applicationHandleWatchKitExtensionRequestReply(UIApplication application, NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_applicationHandleWatchKitExtensionRequestReply") Block_applicationHandleWatchKitExtensionRequestReply reply) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:openURL:sourceApplication:annotation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:openURL:sourceApplication:annotation:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("application:openURL:sourceApplication:annotation:")
    default boolean applicationOpenURLSourceApplicationAnnotation(UIApplication application, NSURL url,
            String sourceApplication, @Mapped(ObjCObjectMapper.class) Object annotation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:performFetchWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:performFetchWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:performFetchWithCompletionHandler:")
    default void applicationPerformFetchWithCompletionHandler(UIApplication application,
            @ObjCBlock(name = "call_applicationPerformFetchWithCompletionHandler") Block_applicationPerformFetchWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:shouldAllowExtensionPointIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:shouldAllowExtensionPointIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:shouldAllowExtensionPointIdentifier:")
    default boolean applicationShouldAllowExtensionPointIdentifier(UIApplication application,
            String extensionPointIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:shouldRestoreApplicationState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:shouldRestoreApplicationState:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:shouldRestoreApplicationState:")
    default boolean applicationShouldRestoreApplicationState(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:shouldSaveApplicationState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:shouldSaveApplicationState:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:shouldSaveApplicationState:")
    default boolean applicationShouldSaveApplicationState(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:supportedInterfaceOrientationsForWindow:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:supportedInterfaceOrientationsForWindow:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:supportedInterfaceOrientationsForWindow:")
    @NUInt
    default long applicationSupportedInterfaceOrientationsForWindow(UIApplication application, UIWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:viewControllerWithRestorationIdentifierPath:coder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:viewControllerWithRestorationIdentifierPath:coder:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:viewControllerWithRestorationIdentifierPath:coder:")
    default UIViewController applicationViewControllerWithRestorationIdentifierPathCoder(UIApplication application,
            NSArray<?> identifierComponents, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:willChangeStatusBarFrame:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:willChangeStatusBarFrame:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:willChangeStatusBarFrame:")
    default void applicationWillChangeStatusBarFrame(UIApplication application, @ByValue CGRect newStatusBarFrame) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:willChangeStatusBarOrientation:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:willChangeStatusBarOrientation:duration:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:willChangeStatusBarOrientation:duration:")
    default void applicationWillChangeStatusBarOrientationDuration(UIApplication application,
            @NInt long newStatusBarOrientation, double duration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:willContinueUserActivityWithType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:willContinueUserActivityWithType:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:willContinueUserActivityWithType:")
    default boolean applicationWillContinueUserActivityWithType(UIApplication application, String userActivityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:willEncodeRestorableStateWithCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:willEncodeRestorableStateWithCoder:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:willEncodeRestorableStateWithCoder:")
    default void applicationWillEncodeRestorableStateWithCoder(UIApplication application, NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:willFinishLaunchingWithOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:willFinishLaunchingWithOptions:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:willFinishLaunchingWithOptions:")
    default boolean applicationWillFinishLaunchingWithOptions(UIApplication application,
            NSDictionary<?, ?> launchOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationDidBecomeActive:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationDidBecomeActive:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationDidBecomeActive:")
    default void applicationDidBecomeActive(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationDidEnterBackground:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationDidEnterBackground:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationDidEnterBackground:")
    default void applicationDidEnterBackground(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationDidFinishLaunching:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationDidFinishLaunching:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationDidFinishLaunching:")
    default void applicationDidFinishLaunching(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationDidReceiveMemoryWarning:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationDidReceiveMemoryWarning:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationDidReceiveMemoryWarning:")
    default void applicationDidReceiveMemoryWarning(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationProtectedDataDidBecomeAvailable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationProtectedDataDidBecomeAvailable:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationProtectedDataDidBecomeAvailable:")
    default void applicationProtectedDataDidBecomeAvailable(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationProtectedDataWillBecomeUnavailable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationProtectedDataWillBecomeUnavailable:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationProtectedDataWillBecomeUnavailable:")
    default void applicationProtectedDataWillBecomeUnavailable(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationSignificantTimeChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationSignificantTimeChange:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationSignificantTimeChange:")
    default void applicationSignificantTimeChange(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationWillEnterForeground:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationWillEnterForeground:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationWillEnterForeground:")
    default void applicationWillEnterForeground(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationWillResignActive:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationWillResignActive:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationWillResignActive:")
    default void applicationWillResignActive(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationWillTerminate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationWillTerminate:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationWillTerminate:")
    default void applicationWillTerminate(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * window</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfp/UIApplicationDelegate/window">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("setWindow:")
    default void setWindow(UIWindow value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * window</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfp/UIApplicationDelegate/window">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("window")
    default UIWindow window() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:")
    default void applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler(
            UIApplication application, String identifier, UILocalNotification notification,
            NSDictionary<?, ?> responseInfo,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler") Block_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:")
    default void applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler(
            UIApplication application, String identifier, NSDictionary<?, ?> userInfo, NSDictionary<?, ?> responseInfo,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler") Block_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:openURL:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:openURL:options:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:openURL:options:")
    default boolean applicationOpenURLOptions(UIApplication app, NSURL url, NSDictionary<String, ?> options) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * applicationShouldRequestHealthAuthorization:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/applicationShouldRequestHealthAuthorization:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationShouldRequestHealthAuthorization:")
    default void applicationShouldRequestHealthAuthorization(UIApplication application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * application:performActionForShortcutItem:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIApplicationDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIApplicationDelegate/application:performActionForShortcutItem:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("application:performActionForShortcutItem:completionHandler:")
    default void applicationPerformActionForShortcutItemCompletionHandler(UIApplication application,
            UIApplicationShortcutItem shortcutItem,
            @ObjCBlock(name = "call_applicationPerformActionForShortcutItemCompletionHandler") Block_applicationPerformActionForShortcutItemCompletionHandler completionHandler) {
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
    public interface Block_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler {
        @Generated
        void call_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler();
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
    public interface Block_applicationPerformFetchWithCompletionHandler {
        @Generated
        void call_applicationPerformFetchWithCompletionHandler(@NUInt long arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler {
        @Generated
        void call_applicationHandleActionWithIdentifierForLocalNotificationWithResponseInfoCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler {
        @Generated
        void call_applicationHandleActionWithIdentifierForRemoteNotificationWithResponseInfoCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationPerformActionForShortcutItemCompletionHandler {
        @Generated
        void call_applicationPerformActionForShortcutItemCompletionHandler(boolean arg0);
    }
}
