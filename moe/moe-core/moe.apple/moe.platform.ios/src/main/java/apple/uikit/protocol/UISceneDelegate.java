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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    default void sceneContinueUserActivity(@NotNull UIScene scene, @NotNull NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:didFailToContinueUserActivityWithType:error:")
    default void sceneDidFailToContinueUserActivityWithTypeError(@NotNull UIScene scene,
            @NotNull String userActivityType, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:didUpdateUserActivity:")
    default void sceneDidUpdateUserActivity(@NotNull UIScene scene, @NotNull NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:openURLContexts:")
    default void sceneOpenURLContexts(@NotNull UIScene scene, @NotNull NSSet<? extends UIOpenURLContext> URLContexts) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:willConnectToSession:options:")
    default void sceneWillConnectToSessionOptions(@NotNull UIScene scene, @NotNull UISceneSession session,
            @NotNull UISceneConnectionOptions connectionOptions) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scene:willContinueUserActivityWithType:")
    default void sceneWillContinueUserActivityWithType(@NotNull UIScene scene, @NotNull String userActivityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneDidBecomeActive:")
    default void sceneDidBecomeActive(@NotNull UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneDidDisconnect:")
    default void sceneDidDisconnect(@NotNull UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneDidEnterBackground:")
    default void sceneDidEnterBackground(@NotNull UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneWillEnterForeground:")
    default void sceneWillEnterForeground(@NotNull UIScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sceneWillResignActive:")
    default void sceneWillResignActive(@NotNull UIScene scene) {
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
    @Nullable
    @Generated
    @IsOptional
    @Selector("stateRestorationActivityForScene:")
    default NSUserActivity stateRestorationActivityForScene(@NotNull UIScene scene) {
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
    default void sceneRestoreInteractionStateWithUserActivity(@NotNull UIScene scene,
            @NotNull NSUserActivity stateRestorationActivity) {
        throw new java.lang.UnsupportedOperationException();
    }
}