package apple.uikit.protocol;

import apple.uikit.UIToolTipConfiguration;
import apple.uikit.UIToolTipInteraction;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIToolTipInteractionDelegate")
public interface UIToolTipInteractionDelegate {
    /**
     * Called when the interaction is about to begin.
     * 
     * @param interaction This UIToolTipInteraction.
     * 
     * @return The tool tip configuration containing the string and rectangle for this interaction. Return nil if the
     *         interaction is inactive or the hit test fails.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("toolTipInteraction:configurationAtPoint:")
    default UIToolTipConfiguration toolTipInteractionConfigurationAtPoint(@NotNull UIToolTipInteraction interaction,
            @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }
}
