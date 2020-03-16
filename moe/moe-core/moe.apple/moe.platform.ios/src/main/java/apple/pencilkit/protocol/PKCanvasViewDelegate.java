package apple.pencilkit.protocol;

import apple.pencilkit.PKCanvasView;
import apple.uikit.protocol.UIScrollViewDelegate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKCanvasViewDelegate")
public interface PKCanvasViewDelegate extends UIScrollViewDelegate {
    @Generated
    @IsOptional
    @Selector("canvasViewDidBeginUsingTool:")
    default void canvasViewDidBeginUsingTool(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("canvasViewDidEndUsingTool:")
    default void canvasViewDidEndUsingTool(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("canvasViewDidFinishRendering:")
    default void canvasViewDidFinishRendering(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("canvasViewDrawingDidChange:")
    default void canvasViewDrawingDidChange(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }
}