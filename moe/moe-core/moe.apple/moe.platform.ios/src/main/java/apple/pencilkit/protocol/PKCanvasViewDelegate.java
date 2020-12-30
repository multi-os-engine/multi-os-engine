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

/**
 * The optional methods a delegate can receive from editing-related changes
 * to a PKCanvasView.
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKCanvasViewDelegate")
public interface PKCanvasViewDelegate extends UIScrollViewDelegate {
    /**
     * Called when the user starts using a tool, eg. selecting, drawing, or erasing.
     * 
     * This does not include moving the ruler.
     * 
     * @param canvasView The canvas view that the user started interacting with.
     */
    @Generated
    @IsOptional
    @Selector("canvasViewDidBeginUsingTool:")
    default void canvasViewDidBeginUsingTool(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user stops using a tool, eg. selecting, drawing, or erasing.
     * 
     * @param canvasView The canvas view that the user ended interacting with.
     */
    @Generated
    @IsOptional
    @Selector("canvasViewDidEndUsingTool:")
    default void canvasViewDidEndUsingTool(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after setting `drawing` when the entire drawing is rendered and visible.
     * 
     * This method lets you know when the canvas view finishes rendering all of the currently
     * visible content. This can be used to delay showing the canvas view until all content is visible.
     * 
     * This is called every time the canvasView transitions from partially rendered to fully rendered,
     * including after setting the drawing, and after zooming or scrolling.
     * 
     * @param canvasView The canvas view that finished rendering.
     */
    @Generated
    @IsOptional
    @Selector("canvasViewDidFinishRendering:")
    default void canvasViewDidFinishRendering(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the drawing on the canvas did change.
     * 
     * This may be called some time after the `canvasViewDidEndUsingTool:` delegate method.
     * For example, when using the Apple Pencil, pressure data is delayed from touch data, this
     * means that the user can stop drawing (`canvasViewDidEndUsingTool:` is called), but the
     * canvas view is still waiting for final pressure values; only when the final pressure values
     * are received is the drawing updated and this delegate method called.
     * 
     * It is also possible that this method is not called, if the drawing interaction is cancelled.
     * 
     * @param canvasView The canvas view that changed.
     */
    @Generated
    @IsOptional
    @Selector("canvasViewDrawingDidChange:")
    default void canvasViewDrawingDidChange(PKCanvasView canvasView) {
        throw new java.lang.UnsupportedOperationException();
    }
}