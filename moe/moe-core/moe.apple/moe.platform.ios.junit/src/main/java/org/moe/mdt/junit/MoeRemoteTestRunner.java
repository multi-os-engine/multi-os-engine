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

package org.moe.mdt.junit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCharacterSet;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSString;
import apple.foundation.NSURL;
import apple.foundation.NSUserActivity;
import apple.foundation.enums.Enums;
import apple.uikit.UIAlertView;
import apple.uikit.UIApplication;
import apple.uikit.UILocalNotification;
import apple.uikit.UIScreen;
import apple.uikit.UIUserNotificationSettings;
import apple.uikit.UIViewController;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.NotImplemented;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.Selector;

import java.util.ArrayList;
import java.util.List;

public class MoeRemoteTestRunner extends NSObject implements UIApplicationDelegate {

    private static void runTests(Class<?>[] testsClasses) {

        final boolean runGCAfterTest = "true".equals(System.getProperty("moe.test.postgc", "false"));
        JUnitCore junit = new JUnitCore();
        junit.addListener(new RunListener() {
            /**
             * Called before any tests have been run.
             */
            public void testRunStarted(Description description) throws java.lang.Exception {
                for (Description child : description.getChildren()) {
                    defineTest(child);
                }
                sendMessage(MessageIds.TEST_RUN_START + ":" + description.testCount());
            }

            /**
             * Called internally for defining tests.
             */
            private void defineTest(Description description) {
                if (description.isTest()) {
                    sendMessage(MessageIds.TEST_DEFINE + ":" + description.getClassName() + "-" + description
                            .getMethodName());
                    return;
                }
                if (description.getChildren() == null || description.getChildren().size() == 0) {
                    return;
                }
                for (Description child : description.getChildren()) {
                    defineTest(child);
                }
            }

            /**
             *  Called when all tests have finished.
             */
            public void testRunFinished(Result result) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_RUN_END + ":" + result.getRunTime());
            }

            /**
             *  Called when an atomic test is about to be started.
             */
            public void testStarted(Description description) throws java.lang.Exception {
                sendMessage(
                        MessageIds.TEST_START + ":" + description.getClassName() + "-" + description.getMethodName());
            }

            /**
             *  Called when an atomic test has finished, whether the test succeeds or fails.
             */
            public void testFinished(Description description) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_END + ":" + description.getClassName() + "-" + description.getMethodName());
                if (runGCAfterTest) {
                    Runtime.getRuntime().gc();
                }
            }

            /**
             *  Called when an atomic test fails.
             */
            public void testFailure(Failure failure) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_FAILED + ":" + failure.getTestHeader() + ":" + failure.getTrace());
            }

            /**
             * Called when a test will not be run, generally because a test method is
             * annotated with Ignore.
             */
            public void testIgnored(Description description) throws java.lang.Exception {
                sendMessage(
                        MessageIds.TEST_IGNORED + ":" + description.getClassName() + "-" + description.getMethodName());
            }
        });
        junit.run(testsClasses);
    }

    public class MessageIds {

        public static final String TEST_RUN_START = "%TESTC  ";

        public static final String TEST_DEFINE = "%TESTD  ";

        public static final String TEST_START = "%TESTS  ";

        public static final String TEST_END = "%TESTE  ";

        public static final String TEST_ERROR = "%ERROR  ";

        public static final String TEST_FAILED = "%FAILED ";

        public static final String TEST_IGNORED = "%IGNORED";

        public static final String TEST_RUN_END = "%RUNTIME";
    }

    private static void sendMessage(String message) {
        System.out.print("\n" + message + "\n");
        System.out.flush();
    }

    private static String[] args;

    public static void main(String[] args) {
        MoeRemoteTestRunner.args = args;
        UIKit.UIApplicationMain(0, null, null, MoeRemoteTestRunner.class.getName());
    }

    static {
        NatJ.register();
    }

    @Generated("NatJ")
    @Owned
    @Selector("alloc")
    public static native MoeRemoteTestRunner alloc();

    @Generated("NatJ")
    protected MoeRemoteTestRunner(Pointer peer) {
        super(peer);
    }

    private UIWindow window;

    private final Runnable testRunner = new Runnable() {

        @Override
        public void run() {
            ArrayList<Class<?>> classList = new ArrayList<Class<?>>();
            for (String arg : args) {
                String[] subs = arg.split("[,]");
                for (String sub : subs) {
                    if (sub.length() == 0) {
                        continue;
                    }
                    Class<?> cls = null;
                    try {
                        cls = Class.forName(sub);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (cls != null) {
                        classList.add(cls);
                    }
                }
            }
            if (classList.size() == 0) {
                String str = NSBundle.mainBundle().pathForResourceOfType("classlist", "txt");
                NSString contents = NSString
                        .stringWithContentsOfFileEncodingError(str, Enums.NSUTF8StringEncoding, null);
                NSArray components = contents
                        .componentsSeparatedByCharactersInSet(NSCharacterSet.newlineCharacterSet());
                for (String sub : (List<String>)components) {
                    if (sub.length() == 0) {
                        continue;
                    }
                    Class<?> cls = null;
                    try {
                        cls = Class.forName(sub);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (cls != null) {
                        classList.add(cls);
                    }
                }
            }
            if (classList.size() > 0) {
                Class<?>[] classArray = new Class<?>[classList.size()];
                runTests(classList.toArray(classArray));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
    };

    @Override
    @Selector("application:didFinishLaunchingWithOptions:")
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary launchOptions) {
        window = UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());

        UIViewController controller = UIViewController.alloc().init();
        window.setRootViewController(controller);

        window.makeKeyAndVisible();

        UIAlertView alert = UIAlertView.alloc().init();
        alert.setMessage("Running JUnit tests!");
        alert.show();

        new Thread(testRunner).start();

        return true;
    }

    @Override
    @Selector("setWindow:")
    public void setWindow(UIWindow value) {
        window = value;
    }

    @Override
    @Selector("window")
    public UIWindow window() {
        return window;
    }

    @NotImplemented
    @Override
    @Selector("application:didChangeStatusBarFrame:")
    @IsOptional
    public native void applicationDidChangeStatusBarFrame(UIApplication application, @ByValue CGRect oldStatusBarFrame);

    @NotImplemented
    @Override
    @Selector("application:didChangeStatusBarOrientation:")
    @IsOptional
    public native void applicationDidChangeStatusBarOrientation(UIApplication application,
            @NInt long oldStatusBarOrientation);

    @NotImplemented
    @Override
    @Selector("application:didDecodeRestorableStateWithCoder:")
    @IsOptional
    public native void applicationDidDecodeRestorableStateWithCoder(UIApplication application, NSCoder coder);

    @NotImplemented
    @Override
    @Selector("application:didFailToRegisterForRemoteNotificationsWithError:")
    @IsOptional
    public native void applicationDidFailToRegisterForRemoteNotificationsWithError(UIApplication application,
            NSError error);

    @NotImplemented
    @Override
    @Selector("application:didReceiveLocalNotification:")
    @IsOptional
    public native void applicationDidReceiveLocalNotification(UIApplication application,
            UILocalNotification notification);

    @NotImplemented
    @Override
    @Selector("application:didReceiveRemoteNotification:")
    @IsOptional
    public native void applicationDidReceiveRemoteNotification(UIApplication application, NSDictionary userInfo);

    @NotImplemented
    @Override
    @Selector("application:didReceiveRemoteNotification:fetchCompletionHandler:")
    @IsOptional
    public native void applicationDidReceiveRemoteNotificationFetchCompletionHandler(UIApplication application,
            NSDictionary userInfo,
            @ObjCBlock(name = "call_applicationDidReceiveRemoteNotificationFetchCompletionHandler") UIApplicationDelegate.Block_applicationDidReceiveRemoteNotificationFetchCompletionHandler completionHandler);

    @NotImplemented
    @Override
    @Selector("application:didRegisterForRemoteNotificationsWithDeviceToken:")
    @IsOptional
    public native void applicationDidRegisterForRemoteNotificationsWithDeviceToken(UIApplication application,
            NSData deviceToken);

    @NotImplemented
    @Override
    @Selector("application:handleEventsForBackgroundURLSession:completionHandler:")
    @IsOptional
    public native void applicationHandleEventsForBackgroundURLSessionCompletionHandler(UIApplication application,
            String identifier,
            @ObjCBlock(name = "call_applicationHandleEventsForBackgroundURLSessionCompletionHandler") UIApplicationDelegate.Block_applicationHandleEventsForBackgroundURLSessionCompletionHandler completionHandler);

    @NotImplemented
    @Override
    @Selector("application:handleOpenURL:")
    @IsOptional
    public native boolean applicationHandleOpenURL(UIApplication application, NSURL url);

    @NotImplemented
    @Override
    @Selector("application:openURL:sourceApplication:annotation:")
    @IsOptional
    public native boolean applicationOpenURLSourceApplicationAnnotation(UIApplication application, NSURL url,
            String sourceApplication, @Mapped(org.moe.natj.objc.map.ObjCObjectMapper.class) Object annotation);

    @NotImplemented
    @Override
    @Selector("application:performFetchWithCompletionHandler:")
    @IsOptional
    public native void applicationPerformFetchWithCompletionHandler(UIApplication application,
            @ObjCBlock(name = "call_applicationPerformFetchWithCompletionHandler") UIApplicationDelegate.Block_applicationPerformFetchWithCompletionHandler completionHandler);

    @NotImplemented
    @Override
    @Selector("application:shouldRestoreApplicationState:")
    @IsOptional
    public native boolean applicationShouldRestoreApplicationState(UIApplication application, NSCoder coder);

    @NotImplemented
    @Override
    @Selector("application:shouldSaveApplicationState:")
    @IsOptional
    public native boolean applicationShouldSaveApplicationState(UIApplication application, NSCoder coder);

    @NotImplemented
    @Override
    @NUInt
    @Selector("application:supportedInterfaceOrientationsForWindow:")
    @IsOptional
    public native long applicationSupportedInterfaceOrientationsForWindow(UIApplication application, UIWindow window);

    @NotImplemented
    @Override
    @Selector("application:viewControllerWithRestorationIdentifierPath:coder:")
    @IsOptional
    public native UIViewController applicationViewControllerWithRestorationIdentifierPathCoder(
            UIApplication application, NSArray identifierComponents, NSCoder coder);

    @NotImplemented
    @Override
    @Selector("application:willChangeStatusBarFrame:")
    @IsOptional
    public native void applicationWillChangeStatusBarFrame(UIApplication application,
            @ByValue CGRect newStatusBarFrame);

    @NotImplemented
    @Override
    @Selector("application:willChangeStatusBarOrientation:duration:")
    @IsOptional
    public native void applicationWillChangeStatusBarOrientationDuration(UIApplication application,
            @NInt long newStatusBarOrientation, double duration);

    @NotImplemented
    @Override
    @Selector("application:willEncodeRestorableStateWithCoder:")
    @IsOptional
    public native void applicationWillEncodeRestorableStateWithCoder(UIApplication application, NSCoder coder);

    @NotImplemented
    @Override
    @Selector("application:willFinishLaunchingWithOptions:")
    @IsOptional
    public native boolean applicationWillFinishLaunchingWithOptions(UIApplication application,
            NSDictionary launchOptions);

    @NotImplemented
    @Override
    @Selector("applicationDidBecomeActive:")
    @IsOptional
    public native void applicationDidBecomeActive(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationDidEnterBackground:")
    @IsOptional
    public native void applicationDidEnterBackground(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationDidFinishLaunching:")
    @IsOptional
    public native void applicationDidFinishLaunching(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationDidReceiveMemoryWarning:")
    @IsOptional
    public native void applicationDidReceiveMemoryWarning(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationProtectedDataDidBecomeAvailable:")
    @IsOptional
    public native void applicationProtectedDataDidBecomeAvailable(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationProtectedDataWillBecomeUnavailable:")
    @IsOptional
    public native void applicationProtectedDataWillBecomeUnavailable(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationSignificantTimeChange:")
    @IsOptional
    public native void applicationSignificantTimeChange(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationWillEnterForeground:")
    @IsOptional
    public native void applicationWillEnterForeground(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationWillResignActive:")
    @IsOptional
    public native void applicationWillResignActive(UIApplication application);

    @NotImplemented
    @Override
    @Selector("applicationWillTerminate:")
    @IsOptional
    public native void applicationWillTerminate(UIApplication application);

    @NotImplemented
    @Override
    @Selector("application:continueUserActivity:restorationHandler:")
    @IsOptional
    public native boolean applicationContinueUserActivityRestorationHandler(UIApplication application,
            NSUserActivity userActivity,
            @ObjCBlock(name = "call_applicationContinueUserActivityRestorationHandler") UIApplicationDelegate.Block_applicationContinueUserActivityRestorationHandler restorationHandler);

    @NotImplemented
    @Override
    @Selector("application:didFailToContinueUserActivityWithType:error:")
    @IsOptional
    public native void applicationDidFailToContinueUserActivityWithTypeError(UIApplication application,
            String userActivityType, NSError error);

    @NotImplemented
    @Override
    @Selector("application:didRegisterUserNotificationSettings:")
    @IsOptional
    public native void applicationDidRegisterUserNotificationSettings(UIApplication application,
            UIUserNotificationSettings notificationSettings);

    @NotImplemented
    @Override
    @Selector("application:didUpdateUserActivity:")
    @IsOptional
    public native void applicationDidUpdateUserActivity(UIApplication application, NSUserActivity userActivity);

    @NotImplemented
    @Override
    @Selector("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    @IsOptional
    public native void applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler(
            UIApplication application, String identifier, UILocalNotification notification,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler") UIApplicationDelegate.Block_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler completionHandler);

    @NotImplemented
    @Override
    @Selector("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    @IsOptional
    public native void applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler(
            UIApplication application, String identifier, NSDictionary userInfo,
            @ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler") UIApplicationDelegate.Block_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler completionHandler);

    @NotImplemented
    @Override
    @Selector("application:shouldAllowExtensionPointIdentifier:")
    @IsOptional
    public native boolean applicationShouldAllowExtensionPointIdentifier(UIApplication application,
            String extensionPointIdentifier);

    @NotImplemented
    @Override
    @Selector("application:willContinueUserActivityWithType:")
    @IsOptional
    public native boolean applicationWillContinueUserActivityWithType(UIApplication application,
            String userActivityType);

    @NotImplemented
    @Override
    @Selector("application:handleWatchKitExtensionRequest:reply:")
    @IsOptional
    public native void applicationHandleWatchKitExtensionRequestReply(UIApplication application, NSDictionary userInfo,
            Block_applicationHandleWatchKitExtensionRequestReply reply);
}
