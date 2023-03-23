package apple.carplay.protocol;

import apple.carplay.CPInstrumentClusterController;
import apple.carplay.CPTemplateApplicationInstrumentClusterScene;
import apple.uikit.protocol.UISceneDelegate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 15.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPTemplateApplicationInstrumentClusterSceneDelegate")
public interface CPTemplateApplicationInstrumentClusterSceneDelegate extends UISceneDelegate {
    /**
     * The CarPlay system suggested content style for this scene has changed.
     */
    @Generated
    @IsOptional
    @Selector("contentStyleDidChange:")
    default void contentStyleDidChange(@NInt long contentStyle) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The instrument cluster navigation scene has connected.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationInstrumentClusterScene:didConnectInstrumentClusterController:")
    default void templateApplicationInstrumentClusterSceneDidConnectInstrumentClusterController(
            CPTemplateApplicationInstrumentClusterScene templateApplicationInstrumentClusterScene,
            CPInstrumentClusterController instrumentClusterController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The instrument cluster navigation scene has connected.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationInstrumentClusterScene:didDisconnectInstrumentClusterController:")
    default void templateApplicationInstrumentClusterSceneDidDisconnectInstrumentClusterController(
            CPTemplateApplicationInstrumentClusterScene templateApplicationInstrumentClusterScene,
            CPInstrumentClusterController instrumentClusterController) {
        throw new java.lang.UnsupportedOperationException();
    }
}