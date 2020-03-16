package apple.carplay.protocol;

import apple.carplay.CPManeuver;
import apple.carplay.CPMapTemplate;
import apple.carplay.CPNavigationAlert;
import apple.carplay.CPRouteChoice;
import apple.carplay.CPTravelEstimates;
import apple.carplay.CPTrip;
import apple.coregraphics.struct.CGPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPMapTemplateDelegate")
public interface CPMapTemplateDelegate {
    @Generated
    @IsOptional
    @Selector("mapTemplate:didDismissNavigationAlert:dismissalContext:")
    default void mapTemplateDidDismissNavigationAlertDismissalContext(CPMapTemplate mapTemplate,
            CPNavigationAlert navigationAlert, @NUInt long dismissalContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:didEndPanGestureWithVelocity:")
    default void mapTemplateDidEndPanGestureWithVelocity(CPMapTemplate mapTemplate, @ByValue CGPoint velocity) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:didShowNavigationAlert:")
    default void mapTemplateDidShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:didUpdatePanGestureWithTranslation:velocity:")
    default void mapTemplateDidUpdatePanGestureWithTranslationVelocity(CPMapTemplate mapTemplate,
            @ByValue CGPoint translation, @ByValue CGPoint velocity) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:displayStyleForManeuver:")
    @NInt
    default long mapTemplateDisplayStyleForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:panBeganWithDirection:")
    default void mapTemplatePanBeganWithDirection(CPMapTemplate mapTemplate, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:panEndedWithDirection:")
    default void mapTemplatePanEndedWithDirection(CPMapTemplate mapTemplate, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:panWithDirection:")
    default void mapTemplatePanWithDirection(CPMapTemplate mapTemplate, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:selectedPreviewForTrip:usingRouteChoice:")
    default void mapTemplateSelectedPreviewForTripUsingRouteChoice(CPMapTemplate mapTemplate, CPTrip trip,
            CPRouteChoice routeChoice) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:shouldShowNotificationForManeuver:")
    default boolean mapTemplateShouldShowNotificationForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:shouldShowNotificationForNavigationAlert:")
    default boolean mapTemplateShouldShowNotificationForNavigationAlert(CPMapTemplate mapTemplate,
            CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:shouldUpdateNotificationForManeuver:withTravelEstimates:")
    default boolean mapTemplateShouldUpdateNotificationForManeuverWithTravelEstimates(CPMapTemplate mapTemplate,
            CPManeuver maneuver, CPTravelEstimates travelEstimates) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:startedTrip:usingRouteChoice:")
    default void mapTemplateStartedTripUsingRouteChoice(CPMapTemplate mapTemplate, CPTrip trip,
            CPRouteChoice routeChoice) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:willDismissNavigationAlert:dismissalContext:")
    default void mapTemplateWillDismissNavigationAlertDismissalContext(CPMapTemplate mapTemplate,
            CPNavigationAlert navigationAlert, @NUInt long dismissalContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplate:willShowNavigationAlert:")
    default void mapTemplateWillShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplateDidBeginPanGesture:")
    default void mapTemplateDidBeginPanGesture(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplateDidCancelNavigation:")
    default void mapTemplateDidCancelNavigation(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplateDidDismissPanningInterface:")
    default void mapTemplateDidDismissPanningInterface(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplateDidShowPanningInterface:")
    default void mapTemplateDidShowPanningInterface(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapTemplateWillDismissPanningInterface:")
    default void mapTemplateWillDismissPanningInterface(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }
}