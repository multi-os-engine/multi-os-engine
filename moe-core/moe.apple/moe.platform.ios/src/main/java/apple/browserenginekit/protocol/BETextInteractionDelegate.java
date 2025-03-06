package apple.browserenginekit.protocol;

import apple.browserenginekit.BETextInteraction;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BETextInteractionDelegate")
public interface BETextInteractionDelegate {
    /**
     * Invoked by the system when the selection is about to change in the document.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("systemDidChangeSelectionForInteraction:")
    void systemDidChangeSelectionForInteraction(@NotNull BETextInteraction textInteraction);

    /**
     * Invoked by the system when the selection is about to change in the document.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("systemWillChangeSelectionForInteraction:")
    void systemWillChangeSelectionForInteraction(@NotNull BETextInteraction textInteraction);
}