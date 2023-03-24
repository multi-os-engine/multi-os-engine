/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.mapkit;

import apple.NSObject;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.mapkit.protocol.MKAnnotation;
import apple.mapkit.protocol.MKMapViewDelegate;
import apple.mapkit.protocol.MKOverlay;
import apple.mapkit.struct.MKCoordinateRegion;
import apple.mapkit.struct.MKMapRect;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKMapView extends UIView implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MKMapView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @NotNull @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKMapView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKMapView allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native MKMapView appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native MKMapView appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native MKMapView appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native MKMapView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native MKMapView appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native MKMapView appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(@Nullable String animationID, @Nullable VoidPtr context);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Deprecated
    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

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
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native MKMapView new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            @NotNull NSArray<? extends UIView> views, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @NotNull @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Deprecated
    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Deprecated
    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Deprecated
    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Deprecated
    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(@Nullable SEL selector);

    @Deprecated
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Deprecated
    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(@NotNull NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, @NotNull UIView view,
            boolean cache);

    @Deprecated
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(@Nullable SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(@NotNull UIView fromView,
            @NotNull UIView toView, double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(@NotNull UIView view,
            double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Annotations are models used to annotate coordinates on the map.
     * Implement mapView:viewForAnnotation: on MKMapViewDelegate to return the annotation view for each annotation.
     */
    @Generated
    @Selector("addAnnotation:")
    public native void addAnnotation(@NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation);

    @Generated
    @Selector("addAnnotations:")
    public native void addAnnotations(@NotNull NSArray<?> annotations);

    /**
     * These methods operate implicitly on overlays in MKOverlayLevelAboveRoads and may be deprecated in a future
     * release in favor of the methods that specify the level.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("addOverlay:")
    public native void addOverlay(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay);

    /**
     * Overlays are models used to represent areas to be drawn on top of the map.
     * This is in contrast to annotations, which represent points on the map.
     * Implement -mapView:rendererForOverlay: on MKMapViewDelegate to return the renderer for each overlay.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("addOverlay:level:")
    public native void addOverlayLevel(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay, @NInt long level);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("addOverlays:")
    public native void addOverlays(@NotNull NSArray<?> overlays);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("addOverlays:level:")
    public native void addOverlaysLevel(@NotNull NSArray<?> overlays, @NInt long level);

    /**
     * annotationVisibleRect is the visible rect where the annotations views are currently displayed.
     * The delegate can use annotationVisibleRect when animating the adding of the annotations views in
     * mapView:didAddAnnotationViews:
     */
    @Generated
    @Selector("annotationVisibleRect")
    @ByValue
    public native CGRect annotationVisibleRect();

    @NotNull
    @Generated
    @Selector("annotations")
    public native NSArray<?> annotations();

    /**
     * API-Since: 4.2
     */
    @NotNull
    @Generated
    @Selector("annotationsInMapRect:")
    public native NSSet<?> annotationsInMapRect(@ByValue MKMapRect mapRect);

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public MKMapView _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public MKMapView _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public MKMapView _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public MKMapView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public MKMapView _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public MKMapView _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("camera")
    public native MKMapCamera camera();

    /**
     * centerCoordinate allows the coordinate of the region to be changed without changing the zoom level.
     */
    @Generated
    @Selector("centerCoordinate")
    @ByValue
    public native CLLocationCoordinate2D centerCoordinate();

    @Generated
    @Selector("convertCoordinate:toPointToView:")
    @ByValue
    public native CGPoint convertCoordinateToPointToView(@ByValue CLLocationCoordinate2D coordinate,
            @Nullable UIView view);

    @Generated
    @Selector("convertPoint:toCoordinateFromView:")
    @ByValue
    public native CLLocationCoordinate2D convertPointToCoordinateFromView(@ByValue CGPoint point,
            @Nullable UIView view);

    @Generated
    @Selector("convertRect:toRegionFromView:")
    @ByValue
    public native MKCoordinateRegion convertRectToRegionFromView(@ByValue CGRect rect, @Nullable UIView view);

    @Generated
    @Selector("convertRegion:toRectToView:")
    @ByValue
    public native CGRect convertRegionToRectToView(@ByValue MKCoordinateRegion region, @Nullable UIView view);

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MKMapViewDelegate delegate();

    /**
     * Used by the delegate to acquire a reusable annotation view, or create a new view for registered class, in lieu of
     * allocating a new one.
     */
    @Nullable
    @Generated
    @Selector("dequeueReusableAnnotationViewWithIdentifier:")
    public native MKAnnotationView dequeueReusableAnnotationViewWithIdentifier(@NotNull String identifier);

    @Generated
    @Selector("deselectAnnotation:animated:")
    public native void deselectAnnotationAnimated(@Nullable @Mapped(ObjCObjectMapper.class) MKAnnotation annotation,
            boolean animated);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("exchangeOverlay:withOverlay:")
    public native void exchangeOverlayWithOverlay(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay1,
            @NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay2);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("exchangeOverlayAtIndex:withOverlayAtIndex:")
    public native void exchangeOverlayAtIndexWithOverlayAtIndex(@NUInt long index1, @NUInt long index2);

    @Generated
    @Selector("init")
    public native MKMapView init();

    @Generated
    @Selector("initWithCoder:")
    public native MKMapView initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native MKMapView initWithFrame(@ByValue CGRect frame);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("insertOverlay:aboveOverlay:")
    public native void insertOverlayAboveOverlay(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay,
            @NotNull @Mapped(ObjCObjectMapper.class) MKOverlay sibling);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("insertOverlay:atIndex:")
    public native void insertOverlayAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay,
            @NUInt long index);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("insertOverlay:atIndex:level:")
    public native void insertOverlayAtIndexLevel(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay,
            @NUInt long index, @NInt long level);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("insertOverlay:belowOverlay:")
    public native void insertOverlayBelowOverlay(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay,
            @NotNull @Mapped(ObjCObjectMapper.class) MKOverlay sibling);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("isPitchEnabled")
    public native boolean isPitchEnabled();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setPitchEnabled:")
    public native void setPitchEnabled(boolean value);

    /**
     * Rotate and pitch are enabled by default on Mac OS X and on iOS 7.0 and later.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isRotateEnabled")
    public native boolean isRotateEnabled();

    /**
     * Rotate and pitch are enabled by default on Mac OS X and on iOS 7.0 and later.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setRotateEnabled:")
    public native void setRotateEnabled(boolean value);

    @Generated
    @Selector("isScrollEnabled")
    public native boolean isScrollEnabled();

    @Generated
    @Selector("setScrollEnabled:")
    public native void setScrollEnabled(boolean value);

    /**
     * Returns YES if the user's location is displayed within the currently visible map region.
     */
    @Generated
    @Selector("isUserLocationVisible")
    public native boolean isUserLocationVisible();

    /**
     * Control the types of user interaction available
     * Zoom and scroll are enabled by default.
     */
    @Generated
    @Selector("isZoomEnabled")
    public native boolean isZoomEnabled();

    /**
     * Control the types of user interaction available
     * Zoom and scroll are enabled by default.
     */
    @Generated
    @Selector("setZoomEnabled:")
    public native void setZoomEnabled(boolean value);

    /**
     * Returns an MKMapRect modified to fit the aspect ratio of the map.
     */
    @Generated
    @Selector("mapRectThatFits:")
    @ByValue
    public native MKMapRect mapRectThatFits(@ByValue MKMapRect mapRect);

    @Generated
    @Selector("mapRectThatFits:edgePadding:")
    @ByValue
    public native MKMapRect mapRectThatFitsEdgePadding(@ByValue MKMapRect mapRect, @ByValue UIEdgeInsets insets);

    /**
     * Changing the map type or region can cause the map to start loading map content.
     * The loading delegate methods will be called as map content is loaded.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("mapType")
    @NUInt
    public native long mapType();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("overlays")
    public native NSArray<?> overlays();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("overlaysInLevel:")
    public native NSArray<?> overlaysInLevel(@NInt long level);

    /**
     * Region is the coordinate and span of the map.
     * Region may be modified to fit the aspect ratio of the view using regionThatFits:.
     */
    @Generated
    @Selector("region")
    @ByValue
    public native MKCoordinateRegion region();

    /**
     * Returns a region of the aspect ratio of the map view that contains the given region, with the same center point.
     */
    @Generated
    @Selector("regionThatFits:")
    @ByValue
    public native MKCoordinateRegion regionThatFits(@ByValue MKCoordinateRegion region);

    @Generated
    @Selector("removeAnnotation:")
    public native void removeAnnotation(@NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation);

    @Generated
    @Selector("removeAnnotations:")
    public native void removeAnnotations(@NotNull NSArray<?> annotations);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("removeOverlay:")
    public native void removeOverlay(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("removeOverlays:")
    public native void removeOverlays(@NotNull NSArray<?> overlays);

    /**
     * Current renderer for overlay; returns nil if the overlay is not shown.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("rendererForOverlay:")
    public native MKOverlayRenderer rendererForOverlay(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay);

    /**
     * Select or deselect a given annotation. Asks the delegate for the corresponding annotation view if necessary.
     */
    @Generated
    @Selector("selectAnnotation:animated:")
    public native void selectAnnotationAnimated(@NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation,
            boolean animated);

    @NotNull
    @Generated
    @Selector("selectedAnnotations")
    public native NSArray<?> selectedAnnotations();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setCamera:")
    public native void setCamera(@NotNull MKMapCamera value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setCamera:animated:")
    public native void setCameraAnimated(@NotNull MKMapCamera camera, boolean animated);

    /**
     * centerCoordinate allows the coordinate of the region to be changed without changing the zoom level.
     */
    @Generated
    @Selector("setCenterCoordinate:")
    public native void setCenterCoordinate(@ByValue CLLocationCoordinate2D value);

    @Generated
    @Selector("setCenterCoordinate:animated:")
    public native void setCenterCoordinateAnimated(@ByValue CLLocationCoordinate2D coordinate, boolean animated);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) MKMapViewDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) MKMapViewDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Changing the map type or region can cause the map to start loading map content.
     * The loading delegate methods will be called as map content is loaded.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setMapType:")
    public native void setMapType(@NUInt long value);

    /**
     * Region is the coordinate and span of the map.
     * Region may be modified to fit the aspect ratio of the view using regionThatFits:.
     */
    @Generated
    @Selector("setRegion:")
    public native void setRegion(@ByValue MKCoordinateRegion value);

    @Generated
    @Selector("setRegion:animated:")
    public native void setRegionAnimated(@ByValue MKCoordinateRegion region, boolean animated);

    @Generated
    @Selector("setSelectedAnnotations:")
    public native void setSelectedAnnotations(@NotNull NSArray<?> value);

    /**
     * Affects MKMapTypeStandard
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: None
     */
    @Deprecated
    @Generated
    @Selector("setShowsBuildings:")
    public native void setShowsBuildings(boolean value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setShowsCompass:")
    public native void setShowsCompass(boolean value);

    /**
     * Affects MKMapTypeStandard and MKMapTypeHybrid
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use pointOfInterestFilter
     */
    @Deprecated
    @Generated
    @Selector("setShowsPointsOfInterest:")
    public native void setShowsPointsOfInterest(boolean value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setShowsScale:")
    public native void setShowsScale(boolean value);

    /**
     * Affects MKMapTypeStandard and MKMapTypeHybrid
     * 
     * API-Since: 9.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setShowsTraffic:")
    public native void setShowsTraffic(boolean value);

    /**
     * Set to YES to add the user location annotation to the map and start updating its location
     */
    @Generated
    @Selector("setShowsUserLocation:")
    public native void setShowsUserLocation(boolean value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setUserTrackingMode:")
    public native void setUserTrackingMode(@NInt long value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setUserTrackingMode:animated:")
    public native void setUserTrackingModeAnimated(@NInt long mode, boolean animated);

    /**
     * Access the visible region of the map in projected coordinates.
     */
    @Generated
    @Selector("setVisibleMapRect:")
    public native void setVisibleMapRect(@ByValue MKMapRect value);

    @Generated
    @Selector("setVisibleMapRect:animated:")
    public native void setVisibleMapRectAnimated(@ByValue MKMapRect mapRect, boolean animate);

    @Generated
    @Selector("setVisibleMapRect:edgePadding:animated:")
    public native void setVisibleMapRectEdgePaddingAnimated(@ByValue MKMapRect mapRect, @ByValue UIEdgeInsets insets,
            boolean animate);

    /**
     * Position the map such that the provided array of annotations are all visible to the fullest extent possible.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("showAnnotations:animated:")
    public native void showAnnotationsAnimated(@NotNull NSArray<?> annotations, boolean animated);

    /**
     * Affects MKMapTypeStandard
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: None
     */
    @Deprecated
    @Generated
    @Selector("showsBuildings")
    public native boolean showsBuildings();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("showsCompass")
    public native boolean showsCompass();

    /**
     * Affects MKMapTypeStandard and MKMapTypeHybrid
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use pointOfInterestFilter
     */
    @Deprecated
    @Generated
    @Selector("showsPointsOfInterest")
    public native boolean showsPointsOfInterest();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("showsScale")
    public native boolean showsScale();

    /**
     * Affects MKMapTypeStandard and MKMapTypeHybrid
     * 
     * API-Since: 9.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("showsTraffic")
    public native boolean showsTraffic();

    /**
     * Set to YES to add the user location annotation to the map and start updating its location
     */
    @Generated
    @Selector("showsUserLocation")
    public native boolean showsUserLocation();

    /**
     * The annotation representing the user's location
     */
    @NotNull
    @Generated
    @Selector("userLocation")
    public native MKUserLocation userLocation();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("userTrackingMode")
    @NInt
    public native long userTrackingMode();

    /**
     * Currently displayed view for an annotation; returns nil if the view for the annotation isn't being displayed.
     */
    @Nullable
    @Generated
    @Selector("viewForAnnotation:")
    public native MKAnnotationView viewForAnnotation(@NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation);

    /**
     * Currently displayed view for overlay; returns nil if the view has not been created yet.
     * Prefer using MKOverlayRenderer and -rendererForOverlay.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 13.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("viewForOverlay:")
    public native MKOverlayView viewForOverlay(@NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay);

    /**
     * Access the visible region of the map in projected coordinates.
     */
    @Generated
    @Selector("visibleMapRect")
    @ByValue
    public native MKMapRect visibleMapRect();

    /**
     * Used by the delegate to acquire a reusable annotation view, or create a new view for registered class, in lieu of
     * allocating a new one. Throws an exception if view could not be aquired.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("dequeueReusableAnnotationViewWithIdentifier:forAnnotation:")
    public native MKAnnotationView dequeueReusableAnnotationViewWithIdentifierForAnnotation(@NotNull String identifier,
            @NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation);

    /**
     * Register a MKAnnotationView subclass to be instantiated when dequeueReusableAnnotationViewWithIdentifier: does
     * not have a view to reuse.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("registerClass:forAnnotationViewWithReuseIdentifier:")
    public native void registerClassForAnnotationViewWithReuseIdentifier(@Nullable Class viewClass,
            @NotNull String identifier);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("cameraBoundary")
    public native MKMapCameraBoundary cameraBoundary();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraZoomRange")
    public native MKMapCameraZoomRange cameraZoomRange();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * API-Since: 13.0
     * Deprecated-Since: 100000.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("pointOfInterestFilter")
    public native MKPointOfInterestFilter pointOfInterestFilter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCameraBoundary:")
    public native void setCameraBoundary(@Nullable MKMapCameraBoundary value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCameraBoundary:animated:")
    public native void setCameraBoundaryAnimated(@Nullable MKMapCameraBoundary cameraBoundary, boolean animated);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCameraZoomRange:")
    public native void setCameraZoomRange(MKMapCameraZoomRange value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCameraZoomRange:animated:")
    public native void setCameraZoomRangeAnimated(@Nullable MKMapCameraZoomRange cameraZoomRange, boolean animated);

    /**
     * API-Since: 13.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setPointOfInterestFilter:")
    public native void setPointOfInterestFilter(@Nullable MKPointOfInterestFilter value);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("preferredConfiguration")
    public native MKMapConfiguration preferredConfiguration();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("selectableMapFeatures")
    @NInt
    public native long selectableMapFeatures();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreferredConfiguration:")
    public native void setPreferredConfiguration(@NotNull MKMapConfiguration value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSelectableMapFeatures:")
    public native void setSelectableMapFeatures(@NInt long value);
}
