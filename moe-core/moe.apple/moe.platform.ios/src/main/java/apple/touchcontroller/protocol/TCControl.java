package apple.touchcontroller.protocol;

import apple.corefoundation.struct.CGPoint;
import apple.touchcontroller.TCControlLabel;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A protocol that defines the base properties and methods for all touch controls.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TCControl")
public interface TCControl extends TCControlLayout {
    /**
     * The collider shape for the control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colliderShape")
    @NInt
    long colliderShape();

    /**
     * Handles a touch began event at the specified point.
     * 
     * - Parameters:
     * - point: The point where the touch began.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("handleTouchBeganAtPoint:")
    void handleTouchBeganAtPoint(@ByValue CGPoint point);

    /**
     * Handles a touch ended event at the specified point.
     * 
     * - Parameters:
     * - point: The point where the touch ended.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("handleTouchEndedAtPoint:")
    void handleTouchEndedAtPoint(@ByValue CGPoint point);

    /**
     * Handles a touch moved event at the specified point.
     * 
     * - Parameters:
     * - point: The point where the touch moved to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("handleTouchMovedAtPoint:")
    void handleTouchMovedAtPoint(@ByValue CGPoint point);

    /**
     * The duration of the highlight animation.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("highlightDuration")
    default double highlightDuration() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A Boolean value that indicates whether the control is enabled.
     * 
     * If disabled, it won't respond to touches.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isEnabled")
    boolean isEnabled();

    /**
     * Indicates whether the control is currently pressed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isPressed")
    boolean isPressed();

    /**
     * The label associated with the control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @NotNull
    TCControlLabel label();

    /**
     * A Boolean value that indicates whether the control is enabled.
     * 
     * If disabled, it won't respond to touches.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setEnabled:")
    void setEnabled(boolean value);

    /**
     * The duration of the highlight animation.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("setHighlightDuration:")
    default void setHighlightDuration(double value) {
        throw new java.lang.UnsupportedOperationException();
    }
}