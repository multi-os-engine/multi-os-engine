package apple.uikit.protocol;

import apple.uikit.UISpringLoadedInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The interaction effect of a `UISpringLoadedInteraction` object must adopt the `UISpringLoadedInteractionEffect` protocol.
 * It is responsible for styling the interaction view according to the current springloading state.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionEffect")
public interface UISpringLoadedInteractionEffect {
    /**
     * Informs the effect that the springloading state changed.
     * 
     * @param interaction The springloaded interaction providing this information.
     * @param context An object that provides information about the current springloading state.
     */
    @Generated
    @Selector("interaction:didChangeWithContext:")
    void interactionDidChangeWithContext(UISpringLoadedInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context);
}