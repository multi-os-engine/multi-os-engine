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

package ios.mapkit.protocol;


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

import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.mapkit.MKAnnotationView;
import ios.mapkit.MKMapView;
import ios.mapkit.MKOverlayRenderer;
import ios.mapkit.MKOverlayView;
import ios.mapkit.MKUserLocation;
import ios.uikit.UIControl;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKMapViewDelegate")
public interface MKMapViewDelegate {
	/**
	 * mapView:annotationView:calloutAccessoryControlTapped:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:annotationView:calloutAccessoryControlTapped:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:annotationView:calloutAccessoryControlTapped:")
	default void mapViewAnnotationViewCalloutAccessoryControlTapped(
			MKMapView mapView, MKAnnotationView view, UIControl control) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:annotationView:didChangeDragState:fromOldState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:annotationView:didChangeDragState:fromOldState:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:annotationView:didChangeDragState:fromOldState:")
	default void mapViewAnnotationViewDidChangeDragStateFromOldState(
			MKMapView mapView, MKAnnotationView view, @NUInt long newState,
			@NUInt long oldState) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didAddAnnotationViews:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didAddAnnotationViews:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:didAddAnnotationViews:")
	default void mapViewDidAddAnnotationViews(MKMapView mapView,
			NSArray<? extends MKAnnotationView> views) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didAddOverlayRenderers:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didAddOverlayRenderers:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:didAddOverlayRenderers:")
	default void mapViewDidAddOverlayRenderers(MKMapView mapView,
			NSArray<? extends MKOverlayRenderer> renderers) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didAddOverlayViews:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didAddOverlayViews:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("mapView:didAddOverlayViews:")
	default void mapViewDidAddOverlayViews(MKMapView mapView,
			NSArray<?> overlayViews) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didChangeUserTrackingMode:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didChangeUserTrackingMode:animated:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:didChangeUserTrackingMode:animated:")
	default void mapViewDidChangeUserTrackingModeAnimated(
			MKMapView mapView, @NInt long mode, boolean animated) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didDeselectAnnotationView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didDeselectAnnotationView:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:didDeselectAnnotationView:")
	default void mapViewDidDeselectAnnotationView(MKMapView mapView,
			MKAnnotationView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didFailToLocateUserWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didFailToLocateUserWithError:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:didFailToLocateUserWithError:")
	default void mapViewDidFailToLocateUserWithError(MKMapView mapView,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didSelectAnnotationView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didSelectAnnotationView:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:didSelectAnnotationView:")
	default void mapViewDidSelectAnnotationView(MKMapView mapView,
			MKAnnotationView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:didUpdateUserLocation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:didUpdateUserLocation:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:didUpdateUserLocation:")
	default void mapViewDidUpdateUserLocation(MKMapView mapView,
			MKUserLocation userLocation) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:regionDidChangeAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:regionDidChangeAnimated:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:regionDidChangeAnimated:")
	default void mapViewRegionDidChangeAnimated(MKMapView mapView,
			boolean animated) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:regionWillChangeAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:regionWillChangeAnimated:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:regionWillChangeAnimated:")
	default void mapViewRegionWillChangeAnimated(MKMapView mapView,
			boolean animated) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:rendererForOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:rendererForOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:rendererForOverlay:")
	default MKOverlayRenderer mapViewRendererForOverlay(
			MKMapView mapView, @Mapped(ObjCObjectMapper.class) Object overlay) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:viewForAnnotation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:viewForAnnotation:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapView:viewForAnnotation:")
	default MKAnnotationView mapViewViewForAnnotation(MKMapView mapView,
			@Mapped(ObjCObjectMapper.class) Object annotation) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapView:viewForOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapView:viewForOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("mapView:viewForOverlay:")
	default MKOverlayView mapViewViewForOverlay(MKMapView mapView,
			@Mapped(ObjCObjectMapper.class) Object overlay) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapViewDidFailLoadingMap:withError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapViewDidFailLoadingMap:withError:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapViewDidFailLoadingMap:withError:")
	default void mapViewDidFailLoadingMapWithError(MKMapView mapView,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapViewDidFinishLoadingMap:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapViewDidFinishLoadingMap:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapViewDidFinishLoadingMap:")
	default void mapViewDidFinishLoadingMap(MKMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapViewDidFinishRenderingMap:fullyRendered:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapViewDidFinishRenderingMap:fullyRendered:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapViewDidFinishRenderingMap:fullyRendered:")
	default void mapViewDidFinishRenderingMapFullyRendered(
			MKMapView mapView, boolean fullyRendered) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapViewDidStopLocatingUser:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapViewDidStopLocatingUser:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapViewDidStopLocatingUser:")
	default void mapViewDidStopLocatingUser(MKMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapViewWillStartLoadingMap:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapViewWillStartLoadingMap:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapViewWillStartLoadingMap:")
	default void mapViewWillStartLoadingMap(MKMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapViewWillStartLocatingUser:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapViewWillStartLocatingUser:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapViewWillStartLocatingUser:")
	default void mapViewWillStartLocatingUser(MKMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * mapViewWillStartRenderingMap:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKMapViewDelegate/mapViewWillStartRenderingMap:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("mapViewWillStartRenderingMap:")
	default void mapViewWillStartRenderingMap(MKMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}
}
