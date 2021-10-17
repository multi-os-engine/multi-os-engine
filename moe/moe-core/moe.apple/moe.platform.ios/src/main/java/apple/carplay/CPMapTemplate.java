package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPBarButtonProviding;
import apple.carplay.protocol.CPMapTemplateDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPMapTemplate extends CPTemplate implements CPBarButtonProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPMapTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPMapTemplate alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CPMapTemplate allocWithZone(VoidPtr zone);

    /**
     * Automatically shows and hides the navigation bar. Defaults to YES.
     */
    @Generated
    @Selector("automaticallyHidesNavigationBar")
    public native boolean automaticallyHidesNavigationBar();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("backButton")
    public native CPBarButton backButton();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * The currently-visible navigation alert, if any.
     */
    @Generated
    @Selector("currentNavigationAlert")
    public native CPNavigationAlert currentNavigationAlert();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Dismiss the currently-visible navigation alert on this map template.
     *
     * @param animated   Whether the dismissal should be animated (YES) or not (NO).
     * @param completion A block invoked after the alert has been dismissed. The BOOL argument
     *                   in the completion block indicates whether any visible alert was dismissed (YES) or
     *                   if no action was taken because there was no alert to dismiss (NO).
     */
    @Generated
    @Selector("dismissNavigationAlertAnimated:completion:")
    public native void dismissNavigationAlertAnimatedCompletion(boolean animated,
            @ObjCBlock(name = "call_dismissNavigationAlertAnimatedCompletion") Block_dismissNavigationAlertAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dismissNavigationAlertAnimatedCompletion {
        @Generated
        void call_dismissNavigationAlertAnimatedCompletion(boolean dismissed);
    }

    /**
     * Dismisses the panning interface on the map interface if it is visible.
     * [@note] When dismissing the panning interface, mapButtons previously hidden by the system will no longer be hidden.
     */
    @Generated
    @Selector("dismissPanningInterfaceAnimated:")
    public native void dismissPanningInterfaceAnimated(boolean animated);

    /**
     * Background color to use when displaying guidance. The system will automatically determine if the provided
     * color meets contrast requirements. If the provided color does not meet contrast requirements, the system
     * default will be used. Font color will automatically be adjusted by the system to correspond with this color.
     * Alpha values will be ignored.
     */
    @Generated
    @Selector("guidanceBackgroundColor")
    public native UIColor guidanceBackgroundColor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Stop displaying any currently shown trip previews.
     */
    @Generated
    @Selector("hideTripPreviews")
    public native void hideTripPreviews();

    /**
     * Hides the map buttons when hiding the navigation bar. Defaults to YES.
     */
    @Generated
    @Selector("hidesButtonsWithNavigationBar")
    public native boolean hidesButtonsWithNavigationBar();

    @Generated
    @Selector("init")
    public native CPMapTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPMapTemplate initWithCoder(NSCoder coder);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * Returns YES when the panning interface is visible.
     */
    @Generated
    @Selector("isPanningInterfaceVisible")
    public native boolean isPanningInterfaceVisible();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("leadingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> leadingNavigationBarButtons();

    /**
     * An array of bar buttons to be displayed on the trailing bottom corner of the map template.
     * [@note] The map template may display a maximum of 4 buttons. Setting more than 4 buttons to this
     * property will only display the first 4 buttons.
     */
    @Generated
    @Selector("mapButtons")
    public native NSArray<? extends CPMapButton> mapButtons();

    @Generated
    @Selector("mapDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPMapTemplateDelegate mapDelegate();

    @Generated
    @Owned
    @Selector("new")
    public static native CPMapTemplate new_objc();

    /**
     * Display a navigation alert on this map template. Your @c CPMapTemplateDelegate will be notified
     * of navigation alert lifecycle events.
     * <p>
     * [@warning] If a navigation alert is already visible, this method has no effect.
     * You must dismiss the currently-visible navigation alert before presenting a new alert.
     *
     * @param navigationAlert The navigation alert to display.
     * @param animated        YES to animate the presentation of this alert, or NO to display it immediately.
     */
    @Generated
    @Selector("presentNavigationAlert:animated:")
    public native void presentNavigationAlertAnimated(CPNavigationAlert navigationAlert, boolean animated);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Automatically shows and hides the navigation bar. Defaults to YES.
     */
    @Generated
    @Selector("setAutomaticallyHidesNavigationBar:")
    public native void setAutomaticallyHidesNavigationBar(boolean value);

    @Generated
    @Selector("setBackButton:")
    public native void setBackButton(CPBarButton value);

    /**
     * Background color to use when displaying guidance. The system will automatically determine if the provided
     * color meets contrast requirements. If the provided color does not meet contrast requirements, the system
     * default will be used. Font color will automatically be adjusted by the system to correspond with this color.
     * Alpha values will be ignored.
     */
    @Generated
    @Selector("setGuidanceBackgroundColor:")
    public native void setGuidanceBackgroundColor(UIColor value);

    /**
     * Hides the map buttons when hiding the navigation bar. Defaults to YES.
     */
    @Generated
    @Selector("setHidesButtonsWithNavigationBar:")
    public native void setHidesButtonsWithNavigationBar(boolean value);

    @Generated
    @Selector("setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(NSArray<? extends CPBarButton> value);

    /**
     * An array of bar buttons to be displayed on the trailing bottom corner of the map template.
     * [@note] The map template may display a maximum of 4 buttons. Setting more than 4 buttons to this
     * property will only display the first 4 buttons.
     */
    @Generated
    @Selector("setMapButtons:")
    public native void setMapButtons(NSArray<? extends CPMapButton> value);

    @Generated
    @Selector("setMapDelegate:")
    public native void setMapDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CPMapTemplateDelegate value);

    @Generated
    public void setMapDelegate(@Mapped(ObjCObjectMapper.class) CPMapTemplateDelegate value) {
        Object __old = mapDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setMapDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setTrailingNavigationBarButtons:")
    public native void setTrailingNavigationBarButtons(NSArray<? extends CPBarButton> value);

    /**
     * The style used to display trip estimates during active navigation. If not set, will update automatically with changes to UIUserInterfaceStyle.
     */
    @Generated
    @Selector("setTripEstimateStyle:")
    public native void setTripEstimateStyle(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Shows the panning interface on the map interface if not already visible.
     * <p>
     * When showing the panning interface, a maximum of two mapButtons will be visible.
     * If more than two mapButtons are visible when the template transitions to panning mode,
     * the system will hide one or more map buttons beginning from the end of the mapButtons array.
     * <p>
     * [@note] The system will not provide a button to dismiss the UI. You are required to provide
     * a button in the map template navigation bar that will dismiss the panning interface.
     */
    @Generated
    @Selector("showPanningInterfaceAnimated:")
    public native void showPanningInterfaceAnimated(boolean animated);

    /**
     * Display the route choices for a single trip. Trip previews can appear over an active navigation session.
     */
    @Generated
    @Selector("showRouteChoicesPreviewForTrip:textConfiguration:")
    public native void showRouteChoicesPreviewForTripTextConfiguration(CPTrip tripPreview,
            CPTripPreviewTextConfiguration textConfiguration);

    /**
     * Display a preview for a trip. Used to provide an overview for the upcoming trip or can show multiple trip options,
     * such as for search results. Trip previews can appear over an active navigation session. Number of trips will be
     * limited to 12.
     */
    @Generated
    @Selector("showTripPreviews:textConfiguration:")
    public native void showTripPreviewsTextConfiguration(NSArray<? extends CPTrip> tripPreviews,
            CPTripPreviewTextConfiguration textConfiguration);

    /**
     * * Begins guidance for a trip.
     *
     * @return CPNavigationSession maintain a reference to the navigation session to perform guidance updates
     */
    @Generated
    @Selector("startNavigationSessionForTrip:")
    public native CPNavigationSession startNavigationSessionForTrip(CPTrip trip);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("trailingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> trailingNavigationBarButtons();

    /**
     * The style used to display trip estimates during active navigation. If not set, will update automatically with changes to UIUserInterfaceStyle.
     */
    @Generated
    @Selector("tripEstimateStyle")
    @NUInt
    public native long tripEstimateStyle();

    /**
     * Updates the arrival time, time remaining and distance remaining estimates for a trip preview or actively navigating trip with the default color for time remaining.
     */
    @Generated
    @Selector("updateTravelEstimates:forTrip:")
    public native void updateTravelEstimatesForTrip(CPTravelEstimates estimates, CPTrip trip);

    /**
     * Updates the arrival time, time remaining and distance remaining estimates for a trip preview or actively navigating trip with a specified color for time remaining.
     */
    @Generated
    @Selector("updateTravelEstimates:forTrip:withTimeRemainingColor:")
    public native void updateTravelEstimatesForTripWithTimeRemainingColor(CPTravelEstimates estimates, CPTrip trip,
            @NUInt long timeRemainingColor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Display a preview for a trip. Used to provide an overview for the upcoming trip or can show multiple trip options,
     * such as for search results. Trip previews can appear over an active navigation session. Number of trips will be
     * limited to 12. Optionally provide a CPTrip object from the list of trips to be selected when initially presented.
     */
    @Generated
    @Selector("showTripPreviews:selectedTrip:textConfiguration:")
    public native void showTripPreviewsSelectedTripTextConfiguration(NSArray<? extends CPTrip> tripPreviews,
            CPTrip selectedTrip, CPTripPreviewTextConfiguration textConfiguration);
}
