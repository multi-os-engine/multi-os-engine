package apple.arkit.protocol;

import apple.arkit.ARAnchor;
import apple.arkit.ARFrame;
import apple.arkit.ARSession;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 11.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARSessionDelegate")
public interface ARSessionDelegate extends ARSessionObserver {
    /**
     * This is called when new anchors are added to the session.
     * 
     * @param session The session being run.
     * @param anchors An array of added anchors.
     */
    @Generated
    @IsOptional
    @Selector("session:didAddAnchors:")
    default void sessionDidAddAnchors(ARSession session, NSArray<? extends ARAnchor> anchors) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when anchors are removed from the session.
     * 
     * @param session The session being run.
     * @param anchors An array of removed anchors.
     */
    @Generated
    @IsOptional
    @Selector("session:didRemoveAnchors:")
    default void sessionDidRemoveAnchors(ARSession session, NSArray<? extends ARAnchor> anchors) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when anchors are updated.
     * 
     * @param session The session being run.
     * @param anchors An array of updated anchors.
     */
    @Generated
    @IsOptional
    @Selector("session:didUpdateAnchors:")
    default void sessionDidUpdateAnchors(ARSession session, NSArray<? extends ARAnchor> anchors) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a new frame has been updated.
     * 
     * @param session The session being run.
     * @param frame   The frame that has been updated.
     */
    @Generated
    @IsOptional
    @Selector("session:didUpdateFrame:")
    default void sessionDidUpdateFrame(ARSession session, ARFrame frame) {
        throw new java.lang.UnsupportedOperationException();
    }
}
