package apple.gamecontroller.protocol;

import apple.gamecontroller.GCGameControllerActivationContext;
import apple.uikit.UIScene;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCGameControllerSceneDelegate")
public interface GCGameControllerSceneDelegate {
    /**
     * The scene has activated in response to a game controller event.
     * 
     * @param scene
     *                The activated scene
     * 
     * @param context
     *                The game controller activation context
     * 
     *                API-Since: 18.0
     */
    @Generated
    @Selector("scene:didActivateGameControllerWithContext:")
    void sceneDidActivateGameControllerWithContext(@NotNull UIScene scene,
            @NotNull GCGameControllerActivationContext context);
}