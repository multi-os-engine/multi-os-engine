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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("currentNavigationAlert")
    public native CPNavigationAlert currentNavigationAlert();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

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

    @Generated
    @Selector("dismissPanningInterfaceAnimated:")
    public native void dismissPanningInterfaceAnimated(boolean animated);

    @Generated
    @Selector("guidanceBackgroundColor")
    public native UIColor guidanceBackgroundColor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("hideTripPreviews")
    public native void hideTripPreviews();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("presentNavigationAlert:animated:")
    public native void presentNavigationAlertAnimated(CPNavigationAlert navigationAlert, boolean animated);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAutomaticallyHidesNavigationBar:")
    public native void setAutomaticallyHidesNavigationBar(boolean value);

    @Generated
    @Selector("setBackButton:")
    public native void setBackButton(CPBarButton value);

    @Generated
    @Selector("setGuidanceBackgroundColor:")
    public native void setGuidanceBackgroundColor(UIColor value);

    @Generated
    @Selector("setHidesButtonsWithNavigationBar:")
    public native void setHidesButtonsWithNavigationBar(boolean value);

    @Generated
    @Selector("setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(NSArray<? extends CPBarButton> value);

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

    @Generated
    @Selector("setTripEstimateStyle:")
    public native void setTripEstimateStyle(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("showPanningInterfaceAnimated:")
    public native void showPanningInterfaceAnimated(boolean animated);

    @Generated
    @Selector("showRouteChoicesPreviewForTrip:textConfiguration:")
    public native void showRouteChoicesPreviewForTripTextConfiguration(CPTrip tripPreview,
            CPTripPreviewTextConfiguration textConfiguration);

    @Generated
    @Selector("showTripPreviews:textConfiguration:")
    public native void showTripPreviewsTextConfiguration(NSArray<? extends CPTrip> tripPreviews,
            CPTripPreviewTextConfiguration textConfiguration);

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

    @Generated
    @Selector("tripEstimateStyle")
    @NUInt
    public native long tripEstimateStyle();

    @Generated
    @Selector("updateTravelEstimates:forTrip:")
    public native void updateTravelEstimatesForTrip(CPTravelEstimates estimates, CPTrip trip);

    @Generated
    @Selector("updateTravelEstimates:forTrip:withTimeRemainingColor:")
    public native void updateTravelEstimatesForTripWithTimeRemainingColor(CPTravelEstimates estimates, CPTrip trip,
            @NUInt long timeRemainingColor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("showTripPreviews:selectedTrip:textConfiguration:")
    public native void showTripPreviewsSelectedTripTextConfiguration(NSArray<? extends CPTrip> tripPreviews,
            CPTrip selectedTrip, CPTripPreviewTextConfiguration textConfiguration);
}