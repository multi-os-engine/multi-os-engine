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

/**
 * API-Since: 13.0
 */
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

    /**
     * This is the NSUserActivity that will be used to restore state when the Scene reconnects.
     * It can be the same activity used for handoff or spotlight, or it can be a separate activity
     * with a different activity type and/or userInfo.
     * After this method is called, and before the activity is actually saved in the restoration file,
     * if the returned NSUserActivity has a delegate (NSUserActivityDelegate), the method
     * userActivityWillSave is called on the delegate. Additionally, if any UIResponders
     * have the activity set as their userActivity property, the UIResponder updateUserActivityState
     * method is called to update the activity. This is done synchronously and ensures the activity
     * has all info filled in before it is saved.
     */
    @Generated
    @IsOptional
    @Selector("stateRestorationActivityForScene:")
    default NSUserActivity stateRestorationActivityForScene(UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This will be called after scene connection, but before activation, and will provide the
     * activity that was last supplied to the stateRestorationActivityForScene callback, or
     * set on the UISceneSession.stateRestorationActivity property.
     * Note that, if it's required earlier, this activity is also already available in the
     * UISceneSession.stateRestorationActivity at scene connection time.
     */
    @Generated
    @IsOptional
    @Selector("scene:restoreInteractionStateWithUserActivity:")
    default void sceneRestoreInteractionStateWithUserActivity(UIScene scene, NSUserActivity stateRestorationActivity) {
        throw new java.lang.UnsupportedOperationException();
    }
}