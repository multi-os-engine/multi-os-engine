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
    @Generated
    @IsOptional
    @Selector("view:didAddNode:forAnchor:")
    default void viewDidAddNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("view:didRemoveNode:forAnchor:")
    default void viewDidRemoveNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("view:didUpdateNode:forAnchor:")
    default void viewDidUpdateNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("view:nodeForAnchor:")
    default SKNode viewNodeForAnchor(ARSKView view, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("view:willUpdateNode:forAnchor:")
    default void viewWillUpdateNodeForAnchor(ARSKView view, SKNode node, ARAnchor anchor) {
        throw new java.lang.UnsupportedOperationException();
    }
}