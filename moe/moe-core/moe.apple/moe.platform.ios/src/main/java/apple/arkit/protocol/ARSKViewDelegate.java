package apple.arkit.protocol;

import apple.arkit.ARAnchor;
import apple.arkit.ARSKView;
import apple.spritekit.SKNode;
import apple.spritekit.protocol.SKViewDelegate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARSKViewDelegate")
public interface ARSKViewDelegate extends SKViewDelegate, ARSessionObserver {
    /**
     * Called when a new node has been mapped to the given anchor.
     *
     * @param view   The view that will render the scene.
     * @param node   The node that maps to the anchor.
     * @param anchor The added anchor.
     */
    @Generated
    @IsOptional
    @Selector("view:didAddNode:forAnchor:")
    default void viewDidAddNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a mapped node has been removed from the scene graph for the given anchor.
     *
     * @param view   The view that will render the scene.
     * @param node   The node that was removed.
     * @param anchor The anchor that was removed.
     */
    @Generated
    @IsOptional
    @Selector("view:didRemoveNode:forAnchor:")
    default void viewDidRemoveNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a node has been updated with data from the given anchor.
     *
     * @param view   The view that will render the scene.
     * @param node   The node that was updated.
     * @param anchor The anchor that was updated.
     */
    @Generated
    @IsOptional
    @Selector("view:didUpdateNode:forAnchor:")
    default void viewDidUpdateNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Implement this to provide a custom node for the given anchor.
     * <p>
     * This node will automatically be added to the scene graph.
     * If this method is not implemented, a node will be automatically created.
     * If nil is returned the anchor will be ignored.
     *
     * @param view   The view that will render the scene.
     * @param anchor The added anchor.
     * @return Node that will be mapped to the anchor or nil.
     */
    @Generated
    @IsOptional
    @Selector("view:nodeForAnchor:")
    default SKNode viewNodeForAnchor(ARSKView view, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a node will be updated with data from the given anchor.
     *
     * @param view   The view that will render the scene.
     * @param node   The node that will be updated.
     * @param anchor The anchor that was updated.
     */
    @Generated
    @IsOptional
    @Selector("view:willUpdateNode:forAnchor:")
    default void viewWillUpdateNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }
}
