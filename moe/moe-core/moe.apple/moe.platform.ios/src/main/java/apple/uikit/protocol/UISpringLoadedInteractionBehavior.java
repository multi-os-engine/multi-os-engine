package apple.uikit.protocol;

import apple.uikit.UISpringLoadedInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * The interaction behavior of a `UISpringLoadedInteraction` object must adopt the `UISpringLoadedInteractionBehavior`
 * protocol.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionBehavior")
public interface UISpringLoadedInteractionBehavior {
    /**
     * Informs the behavior that springloading for a given interaction was cancelled or activated.
     * 
     * @param interaction The springloaded interaction object providing this information.
     */
    @Generated
    @IsOptional
    @Selector("interactionDidFinish:")
    default void interactionDidFinish(@NotNull UISpringLoadedInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns whether springloading should begin or continue for a given interaction.
     * 
     * @param interaction The springloaded interaction object requesting this information
     * @param context     An object that provides information about the current drag.
     * @return true if the interaction should begin or continue springloading.
     */
    @Generated
    @Selector("shouldAllowInteraction:withContext:")
    boolean shouldAllowInteractionWithContext(@NotNull UISpringLoadedInteraction interaction,
            @NotNull @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context);
}
