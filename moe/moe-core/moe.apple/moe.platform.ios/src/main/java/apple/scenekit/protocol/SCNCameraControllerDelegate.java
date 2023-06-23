package apple.scenekit.protocol;

import apple.scenekit.SCNCameraController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 11.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNCameraControllerDelegate")
public interface SCNCameraControllerDelegate {
    @Generated
    @IsOptional
    @Selector("cameraInertiaDidEndForController:")
    default void cameraInertiaDidEndForController(@NotNull SCNCameraController cameraController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("cameraInertiaWillStartForController:")
    default void cameraInertiaWillStartForController(@NotNull SCNCameraController cameraController) {
        throw new java.lang.UnsupportedOperationException();
    }
}