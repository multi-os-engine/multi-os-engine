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

package apple.mapkit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.mapkit.MKAnnotationView;
import apple.mapkit.MKClusterAnnotation;
import apple.mapkit.MKMapView;
import apple.mapkit.MKOverlayRenderer;
import apple.mapkit.MKOverlayView;
import apple.mapkit.MKUserLocation;
import apple.uikit.UIControl;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKMapViewDelegate")
public interface MKMapViewDelegate {
    /**
     * mapView:annotationView:calloutAccessoryControlTapped: is called when the user taps on left & right callout
     * accessory UIControls.
     */
    @Generated
    @IsOptional
    @Selector("mapView:annotationView:calloutAccessoryControlTapped:")
    default void mapViewAnnotationViewCalloutAccessoryControlTapped(@NotNull MKMapView mapView,
            @NotNull MKAnnotationView view, @NotNull UIControl control) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:annotationView:didChangeDragState:fromOldState:")
    default void mapViewAnnotationViewDidChangeDragStateFromOldState(@NotNull MKMapView mapView,
            @NotNull MKAnnotationView view, @NUInt long newState, @NUInt long oldState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * mapView:didAddAnnotationViews: is called after the annotation views have been added and positioned in the map.
     * The delegate can implement this method to animate the adding of the annotations views.
     * Use the current positions of the annotation views as the destinations of the animation.
     */
    @Generated
    @IsOptional
    @Selector("mapView:didAddAnnotationViews:")
    default void mapViewDidAddAnnotationViews(@NotNull MKMapView mapView,
            @NotNull NSArray<? extends MKAnnotationView> views) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didAddOverlayRenderers:")
    default void mapViewDidAddOverlayRenderers(@NotNull MKMapView mapView,
            @NotNull NSArray<? extends MKOverlayRenderer> renderers) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the provided overlay views have been added and positioned in the map.
     * Prefer -mapView:didAddOverlayRenderers:
     * 
     * API-Since: 4.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("mapView:didAddOverlayViews:")
    default void mapViewDidAddOverlayViews(@NotNull MKMapView mapView, @NotNull NSArray<?> overlayViews) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didChangeUserTrackingMode:animated:")
    default void mapViewDidChangeUserTrackingModeAnimated(@NotNull MKMapView mapView, @NInt long mode,
            boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didDeselectAnnotationView:")
    default void mapViewDidDeselectAnnotationView(@NotNull MKMapView mapView, @NotNull MKAnnotationView view) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didFailToLocateUserWithError:")
    default void mapViewDidFailToLocateUserWithError(@NotNull MKMapView mapView, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didSelectAnnotationView:")
    default void mapViewDidSelectAnnotationView(@NotNull MKMapView mapView, @NotNull MKAnnotationView view) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didUpdateUserLocation:")
    default void mapViewDidUpdateUserLocation(@NotNull MKMapView mapView, @NotNull MKUserLocation userLocation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapView:regionDidChangeAnimated:")
    default void mapViewRegionDidChangeAnimated(@NotNull MKMapView mapView, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapView:regionWillChangeAnimated:")
    default void mapViewRegionWillChangeAnimated(@NotNull MKMapView mapView, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("mapView:rendererForOverlay:")
    default MKOverlayRenderer mapViewRendererForOverlay(@NotNull MKMapView mapView,
            @NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * mapView:viewForAnnotation: provides the view for each annotation.
     * This method may be called for all or some of the added annotations.
     * For MapKit provided annotations (eg. MKUserLocation) return nil to use the MapKit provided annotation view.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("mapView:viewForAnnotation:")
    default MKAnnotationView mapViewViewForAnnotation(@NotNull MKMapView mapView,
            @NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Prefer -mapView:rendererForOverlay:
     * 
     * API-Since: 4.0
     * Deprecated-Since: 13.0
     */
    @NotNull
    @Deprecated
    @Generated
    @IsOptional
    @Selector("mapView:viewForOverlay:")
    default MKOverlayView mapViewViewForOverlay(@NotNull MKMapView mapView,
            @NotNull @Mapped(ObjCObjectMapper.class) MKOverlay overlay) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapViewDidFailLoadingMap:withError:")
    default void mapViewDidFailLoadingMapWithError(@NotNull MKMapView mapView, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapViewDidFinishLoadingMap:")
    default void mapViewDidFinishLoadingMap(@NotNull MKMapView mapView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("mapViewDidFinishRenderingMap:fullyRendered:")
    default void mapViewDidFinishRenderingMapFullyRendered(@NotNull MKMapView mapView, boolean fullyRendered) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("mapViewDidStopLocatingUser:")
    default void mapViewDidStopLocatingUser(@NotNull MKMapView mapView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mapViewWillStartLoadingMap:")
    default void mapViewWillStartLoadingMap(@NotNull MKMapView mapView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("mapViewWillStartLocatingUser:")
    default void mapViewWillStartLocatingUser(@NotNull MKMapView mapView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("mapViewWillStartRenderingMap:")
    default void mapViewWillStartRenderingMap(@NotNull MKMapView mapView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return nil for default MKClusterAnnotation, it is illegal to return a cluster annotation not containing the
     * identical array of member annotations given.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("mapView:clusterAnnotationForMemberAnnotations:")
    default MKClusterAnnotation mapViewClusterAnnotationForMemberAnnotations(@NotNull MKMapView mapView,
            @NotNull NSArray<?> memberAnnotations) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("mapViewDidChangeVisibleRegion:")
    default void mapViewDidChangeVisibleRegion(@NotNull MKMapView mapView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didDeselectAnnotation:")
    default void mapViewDidDeselectAnnotation(@NotNull MKMapView mapView,
            @NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("mapView:didSelectAnnotation:")
    default void mapViewDidSelectAnnotation(@NotNull MKMapView mapView,
            @NotNull @Mapped(ObjCObjectMapper.class) MKAnnotation annotation) {
        throw new java.lang.UnsupportedOperationException();
    }
}
