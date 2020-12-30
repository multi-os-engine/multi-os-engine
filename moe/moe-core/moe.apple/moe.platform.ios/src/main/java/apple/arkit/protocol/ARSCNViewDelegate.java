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
    /**
     * Called when a new node has been mapped to the given anchor.
     * 
     * @param renderer The renderer that will render the scene.
     * @param node The node that maps to the anchor.
     * @param anchor The added anchor.
     */
    @Generated
    @IsOptional
    @Selector("renderer:didAddNode:forAnchor:")
    default void rendererDidAddNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, SCNNode node,
            ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a mapped node has been removed from the scene graph for the given anchor.
     * 
     * @param renderer The renderer that will render the scene.
     * @param node The node that was removed.
     * @param anchor The anchor that was removed.
     */
    @Generated
    @IsOptional
    @Selector("renderer:didRemoveNode:forAnchor:")
    default void rendererDidRemoveNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, SCNNode node,
            ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a node has been updated with data from the given anchor.
     * 
     * @param renderer The renderer that will render the scene.
     * @param node The node that was updated.
     * @param anchor The anchor that was updated.
     */
    @Generated
    @IsOptional
    @Selector("renderer:didUpdateNode:forAnchor:")
    default void rendererDidUpdateNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, SCNNode node,
            ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Implement this to provide a custom node for the given anchor.
     * 
     * @discussion This node will automatically be added to the scene graph.
     * If this method is not implemented, a node will be automatically created.
     * If nil is returned the anchor will be ignored.
     * @param renderer The renderer that will render the scene.
     * @param anchor The added anchor.
     * @return Node that will be mapped to the anchor or nil.
     */
    @Generated
    @IsOptional
    @Selector("renderer:nodeForAnchor:")
    default SCNNode rendererNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a node will be updated with data from the given anchor.
     * 
     * @param renderer The renderer that will render the scene.
     * @param node The node that will be updated.
     * @param anchor The anchor that was updated.
     */
    @Generated
    @IsOptional
    @Selector("renderer:willUpdateNode:forAnchor:")
    default void rendererWillUpdateNodeForAnchor(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer,
            SCNNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }
}