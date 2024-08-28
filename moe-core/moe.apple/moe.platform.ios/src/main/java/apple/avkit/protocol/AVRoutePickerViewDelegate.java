package apple.avkit.protocol;

import apple.avkit.AVRoutePickerView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] AVRoutePickerViewDelegate
 * 
 * Defines an interface for delegates of AVRoutePickerView.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVRoutePickerViewDelegate")
public interface AVRoutePickerViewDelegate {
    /**
     * routePickerViewDidEndPresentingRoutes:
     * 
     * Informs the delegate that the route picker view finished presenting routes to the user.
     */
    @Generated
    @IsOptional
    @Selector("routePickerViewDidEndPresentingRoutes:")
    default void routePickerViewDidEndPresentingRoutes(@NotNull AVRoutePickerView routePickerView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * routePickerViewWillBeginPresentingRoutes:
     * 
     * Informs the delegate that the route picker view will start presenting routes to the user.
     */
    @Generated
    @IsOptional
    @Selector("routePickerViewWillBeginPresentingRoutes:")
    default void routePickerViewWillBeginPresentingRoutes(@NotNull AVRoutePickerView routePickerView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
