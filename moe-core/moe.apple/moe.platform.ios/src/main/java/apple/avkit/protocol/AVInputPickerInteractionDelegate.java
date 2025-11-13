package apple.avkit.protocol;

import apple.avkit.AVInputPickerInteraction;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The `AVInputPickerInteractionDelegate` protocol defines methods you use to receive notifications about transitions in
 * an `AVInputPickerInteraction` object.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVInputPickerInteractionDelegate")
public interface AVInputPickerInteractionDelegate {
    /**
     * Tells the delegate that the input picker view has finished dismissing devices.
     * 
     * The `isPresented` property is set to `NO` at this point, indicating that the dismissal is complete.
     * 
     * - Parameter inputPickerInteraction: The current AVInputPickerInteraction.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("inputPickerInteractionDidEndDismissing:")
    default void inputPickerInteractionDidEndDismissing(@NotNull AVInputPickerInteraction inputPickerInteraction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the input picker view has finished presenting devices
     * 
     * The `isPresented` property is set to `YES` at this point, indicating that the presentation is complete.
     * 
     * - Parameter inputPickerInteraction: The current AVInputPickerInteraction.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("inputPickerInteractionDidEndPresenting:")
    default void inputPickerInteractionDidEndPresenting(@NotNull AVInputPickerInteraction inputPickerInteraction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the input picker view is about to dismiss devices.
     * 
     * - Parameter inputPickerInteraction: The current AVInputPickerInteraction.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("inputPickerInteractionWillBeginDismissing:")
    default void inputPickerInteractionWillBeginDismissing(@NotNull AVInputPickerInteraction inputPickerInteraction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the input picker view is about to present devices.
     * 
     * - Parameter inputPickerInteraction: The current AVInputPickerInteraction.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("inputPickerInteractionWillBeginPresenting:")
    default void inputPickerInteractionWillBeginPresenting(@NotNull AVInputPickerInteraction inputPickerInteraction) {
        throw new java.lang.UnsupportedOperationException();
    }
}