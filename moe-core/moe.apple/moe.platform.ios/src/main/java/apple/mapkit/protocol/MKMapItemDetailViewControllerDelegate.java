package apple.mapkit.protocol;

import apple.mapkit.MKMapItemDetailViewController;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Delegate for `MKMapItemDetailViewController`
 * 
 * API-Since: 18.0
 */
@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKMapItemDetailViewControllerDelegate")
public interface MKMapItemDetailViewControllerDelegate {
    /**
     * Called when the user is finished
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("mapItemDetailViewControllerDidFinish:")
    void mapItemDetailViewControllerDidFinish(@NotNull MKMapItemDetailViewController detailViewController);
}