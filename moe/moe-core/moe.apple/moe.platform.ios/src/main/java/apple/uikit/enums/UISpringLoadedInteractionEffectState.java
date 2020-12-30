package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * An object conforming to UISpringLoadedInteractionEffect uses UISpringLoadedInteractionEffectState
 * to style the interaction view for the current springloading state.
 * 
 * - UISpringLoadedInteractionEffectStateInactive: the view is not engaged in springloading and should be displayed with its default style.
 * - UISpringLoadedInteractionEffectStatePossible: the view may springload and should provide a visual cue to the user. The default effect highlights the view.
 * - UISpringLoadedInteractionEffectStateActivating: the view is about to springload. The default effect will briefly flash while in this state.
 * - UISpringLoadedInteractionEffectStateActivated: the view springloaded and the activation handler is called. The default effect will restore the view to its original appearance.
 */
@Generated
public final class UISpringLoadedInteractionEffectState {
    @Generated
    private UISpringLoadedInteractionEffectState() {
    }

    @Generated @NInt public static final long Inactive = 0x0000000000000000L;
    @Generated @NInt public static final long Possible = 0x0000000000000001L;
    @Generated @NInt public static final long Activating = 0x0000000000000002L;
    @Generated @NInt public static final long Activated = 0x0000000000000003L;
}