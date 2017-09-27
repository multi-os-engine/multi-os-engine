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

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARSessionDelegate")
public interface ARSessionDelegate extends ARSessionObserver {
    @Generated
    @IsOptional
    @Selector("session:didAddAnchors:")
    default void sessionDidAddAnchors(ARSession session, NSArray<? extends ARAnchor> anchors) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didRemoveAnchors:")
    default void sessionDidRemoveAnchors(ARSession session, NSArray<? extends ARAnchor> anchors) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didUpdateAnchors:")
    default void sessionDidUpdateAnchors(ARSession session, NSArray<? extends ARAnchor> anchors) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didUpdateFrame:")
    default void sessionDidUpdateFrame(ARSession session, ARFrame frame) {
        throw new java.lang.UnsupportedOperationException();
    }
}