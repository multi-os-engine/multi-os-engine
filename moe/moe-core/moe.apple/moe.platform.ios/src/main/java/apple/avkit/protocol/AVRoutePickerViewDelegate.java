package apple.avkit.protocol;

import apple.avkit.AVRoutePickerView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVRoutePickerViewDelegate")
public interface AVRoutePickerViewDelegate {
    @Generated
    @IsOptional
    @Selector("routePickerViewDidEndPresentingRoutes:")
    default void routePickerViewDidEndPresentingRoutes(AVRoutePickerView routePickerView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("routePickerViewWillBeginPresentingRoutes:")
    default void routePickerViewWillBeginPresentingRoutes(AVRoutePickerView routePickerView) {
        throw new java.lang.UnsupportedOperationException();
    }
}