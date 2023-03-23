package apple.carplay.protocol;

import apple.carplay.CPPointOfInterest;
import apple.carplay.CPPointOfInterestTemplate;
import apple.mapkit.struct.MKCoordinateRegion;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 14.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPPointOfInterestTemplateDelegate")
public interface CPPointOfInterestTemplateDelegate {
    /**
     * The user has changed the map region on the @c CPPointOfInterestTemplate. Your application
     * should respond by updating @c pointsOfInterest to show new points of interest for the new region.
     */
    @Generated
    @Selector("pointOfInterestTemplate:didChangeMapRegion:")
    void pointOfInterestTemplateDidChangeMapRegion(CPPointOfInterestTemplate pointOfInterestTemplate,
            @ByValue MKCoordinateRegion region);

    /**
     * The user has selected the @c pointOfInterest and the details are being shown.
     */
    @Generated
    @IsOptional
    @Selector("pointOfInterestTemplate:didSelectPointOfInterest:")
    default void pointOfInterestTemplateDidSelectPointOfInterest(CPPointOfInterestTemplate pointOfInterestTemplate,
            CPPointOfInterest pointOfInterest) {
        throw new java.lang.UnsupportedOperationException();
    }
}