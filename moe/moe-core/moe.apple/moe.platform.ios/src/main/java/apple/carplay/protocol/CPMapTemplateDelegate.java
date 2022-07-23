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
    /**
     * Called when the map interface has completed dismissal of a navigation alert.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:didDismissNavigationAlert:dismissalContext:")
    default void mapTemplateDidDismissNavigationAlertDismissalContext(CPMapTemplate mapTemplate,
            CPNavigationAlert navigationAlert, @NUInt long dismissalContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a pan gesture ends. May not be called when connected to some CarPlay systems.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:didEndPanGestureWithVelocity:")
    default void mapTemplateDidEndPanGestureWithVelocity(CPMapTemplate mapTemplate, @ByValue CGPoint velocity) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the map interface has displayed a navigation alert.
     * <p>
     * To take action in response to button presses on the navigation alert, see -[CPAlertAction handler].
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:didShowNavigationAlert:")
    default void mapTemplateDidShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a pan gesture changes. May not be called when connected to some CarPlay systems.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:didUpdatePanGestureWithTranslation:velocity:")
    default void mapTemplateDidUpdatePanGestureWithTranslationVelocity(CPMapTemplate mapTemplate,
            @ByValue CGPoint translation, @ByValue CGPoint velocity) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Changes the visual layout of the maneuver.
     *
     * @return a CPManeuverDisplayStyle value representing the style to be used for displaying the maneuver
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:displayStyleForManeuver:")
    @NInt
    default long mapTemplateDisplayStyleForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a pan button is pressed/selected for an extended duration.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:panBeganWithDirection:")
    default void mapTemplatePanBeganWithDirection(CPMapTemplate mapTemplate, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a pan button is released after an extended duration.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:panEndedWithDirection:")
    default void mapTemplatePanEndedWithDirection(CPMapTemplate mapTemplate, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a pan button is pressed/selected momentarily.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:panWithDirection:")
    default void mapTemplatePanWithDirection(CPMapTemplate mapTemplate, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user has selected a route choice to preview.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:selectedPreviewForTrip:usingRouteChoice:")
    default void mapTemplateSelectedPreviewForTripUsingRouteChoice(CPMapTemplate mapTemplate, CPTrip trip,
            CPRouteChoice routeChoice) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if the maneuver should be presented as a notification when the app is in the background.
     *
     * @return YES if the maneuver should appear as a notification, otherwise NO
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:shouldShowNotificationForManeuver:")
    default boolean mapTemplateShouldShowNotificationForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if the navigation alert should be presented as a notification when the app is in the background.
     *
     * @return YES if the alert should appear as a notification, otherwise NO
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:shouldShowNotificationForNavigationAlert:")
    default boolean mapTemplateShouldShowNotificationForNavigationAlert(CPMapTemplate mapTemplate,
            CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if the updated distance remaining for the maneuver should be presented as a notification when the app
     * is in the background.
     *
     * @return YES if the updated estimates should appear in the notification, otherwise NO
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:shouldUpdateNotificationForManeuver:withTravelEstimates:")
    default boolean mapTemplateShouldUpdateNotificationForManeuverWithTravelEstimates(CPMapTemplate mapTemplate,
            CPManeuver maneuver, CPTravelEstimates travelEstimates) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user has selected a route choice to navigate.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:startedTrip:usingRouteChoice:")
    default void mapTemplateStartedTripUsingRouteChoice(CPMapTemplate mapTemplate, CPTrip trip,
            CPRouteChoice routeChoice) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the map interface is preparing to dismiss a navigation alert.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:willDismissNavigationAlert:dismissalContext:")
    default void mapTemplateWillDismissNavigationAlertDismissalContext(CPMapTemplate mapTemplate,
            CPNavigationAlert navigationAlert, @NUInt long dismissalContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the map interface is about to display a navigation alert.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplate:willShowNavigationAlert:")
    default void mapTemplateWillShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a pan gesture begins. May not be called when connected to some CarPlay systems.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplateDidBeginPanGesture:")
    default void mapTemplateDidBeginPanGesture(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when navigation has been canceled by the system.
     * <p>
     * [@note] In CarPlay systems that have native navigation, it is expected that only either the native navigation or
     * the iPhone
     * can be actively navigating. When navigation begins in the native system, all CarPlay supported navigation
     * apps that are actively navigating will need to end their navigation session.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplateDidCancelNavigation:")
    default void mapTemplateDidCancelNavigation(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This will be called when the pan interface disappears on the map interface.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplateDidDismissPanningInterface:")
    default void mapTemplateDidDismissPanningInterface(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This will be called when the pan interface appears on the map interface.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplateDidShowPanningInterface:")
    default void mapTemplateDidShowPanningInterface(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This will be called when the pan interface will disappear on the map interface.
     */
    @Generated
    @IsOptional
    @Selector("mapTemplateWillDismissPanningInterface:")
    default void mapTemplateWillDismissPanningInterface(CPMapTemplate mapTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }
}
