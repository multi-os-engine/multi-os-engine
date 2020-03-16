package apple.uikit.protocol;

import apple.foundation.NSError;
import apple.foundation.NSSet;
import apple.foundation.NSUserActivity;
import apple.uikit.UIOpenURLContext;
import apple.uikit.UIScene;
import apple.uikit.UISceneConnectionOptions;
import apple.uikit.UISceneSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISceneDelegate")
public interface UISceneDelegate {
    @Generated
    @IsOptional
    @Selector("scene:continueUserActivity:")
    default void sceneContinueUserActivity(UIScene scene, NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:didFailToContinueUserActivityWithType:error:")
    default void sceneDidFailToContinueUserActivityWithTypeError(UIScene scene, String userActivityType,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:didUpdateUserActivity:")
    default void sceneDidUpdateUserActivity(UIScene scene, NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:openURLContexts:")
    default void sceneOpenURLContexts(UIScene scene, NSSet<? extends UIOpenURLContext> URLContexts) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:willConnectToSession:options:")
    default void sceneWillConnectToSessionOptions(UIScene scene, UISceneSession session,
            UISceneConnectionOptions connectionOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:willContinueUserActivityWithType:")
    default void sceneWillContinueUserActivityWithType(UIScene scene, String userActivityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneDidBecomeActive:")
    default void sceneDidBecomeActive(UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneDidDisconnect:")
    default void sceneDidDisconnect(UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneDidEnterBackground:")
    default void sceneDidEnterBackground(UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneWillEnterForeground:")
    default void sceneWillEnterForeground(UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneWillResignActive:")
    default void sceneWillResignActive(UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("stateRestorationActivityForScene:")
    default NSUserActivity stateRestorationActivityForScene(UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }
}