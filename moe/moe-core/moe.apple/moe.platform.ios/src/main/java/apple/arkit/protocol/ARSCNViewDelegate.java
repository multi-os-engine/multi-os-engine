package apple.arkit.protocol;

import apple.arkit.ARAnchor;
import apple.scenekit.SCNNode;
import apple.scenekit.protocol.SCNSceneRenderer;
import apple.scenekit.protocol.SCNSceneRendererDelegate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARSCNViewDelegate")
public interface ARSCNViewDelegate extends SCNSceneRendererDelegate, ARSessionObserver {
    @Generated
    @IsOptional
    @Selector("renderer:didAddNode:forAnchor:")
    default void rendererDidAddNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, SCNNode node,
            ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:didRemoveNode:forAnchor:")
    default void rendererDidRemoveNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, SCNNode node,
            ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:didUpdateNode:forAnchor:")
    default void rendererDidUpdateNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, SCNNode node,
            ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:nodeForAnchor:")
    default SCNNode rendererNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:willUpdateNode:forAnchor:")
    default void rendererWillUpdateNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer,
            SCNNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }
}