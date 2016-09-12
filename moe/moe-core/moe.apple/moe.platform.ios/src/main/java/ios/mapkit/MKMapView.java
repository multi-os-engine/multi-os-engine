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

package ios.mapkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.corelocation.struct.CLLocationCoordinate2D;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSSet;
import ios.foundation.protocol.NSCoding;
import ios.mapkit.struct.MKCoordinateRegion;
import ios.mapkit.struct.MKMapRect;
import ios.uikit.UIView;
import ios.uikit.struct.UIEdgeInsets;
import ios.mapkit.protocol.MKAnnotation;
import ios.mapkit.protocol.MKMapViewDelegate;
import ios.mapkit.protocol.MKOverlay;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;
import ios.foundation.NSDate;
import ios.foundation.NSMethodSignature;
import ios.uikit.UITraitCollection;

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

	/**
	 * addAnnotation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/addAnnotation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAnnotation:")
	public native void addAnnotation(
			@Mapped(ObjCObjectMapper.class) MKAnnotation annotation);

	/**
	 * addAnnotations:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/addAnnotations:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAnnotations:")
	public native void addAnnotations(NSArray<?> annotations);

	/**
	 * addOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/addOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addOverlay:")
	public native void addOverlay(@Mapped(ObjCObjectMapper.class) MKOverlay overlay);

	/**
	 * addOverlay:level:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/addOverlay:level:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addOverlay:level:")
	public native void addOverlayLevel(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay, @NInt long level);

	/**
	 * addOverlays:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/addOverlays:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addOverlays:")
	public native void addOverlays(NSArray<?> overlays);

	/**
	 * addOverlays:level:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/addOverlays:level:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addOverlays:level:")
	public native void addOverlaysLevel(NSArray<?> overlays, @NInt long level);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MKMapView alloc();

	/**
	 * annotationVisibleRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/annotationVisibleRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("annotationVisibleRect")
	@ByValue
	public native CGRect annotationVisibleRect();

	/**
	 * annotations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/annotations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("annotations")
	public native NSArray<?> annotations();

	/**
	 * annotationsInMapRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/annotationsInMapRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("annotationsInMapRect:")
	public native NSSet<?> annotationsInMapRect(@ByValue MKMapRect mapRect);

	/**
	 * camera</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/camera">iOS Dev Center</a>
	 */
	@Generated
	@Selector("camera")
	public native MKMapCamera camera();

	/**
	 * centerCoordinate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/centerCoordinate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("centerCoordinate")
	@ByValue
	public native CLLocationCoordinate2D centerCoordinate();

	/**
	 * convertCoordinate:toPointToView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/convertCoordinate:toPointToView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertCoordinate:toPointToView:")
	@ByValue
	public native CGPoint convertCoordinateToPointToView(
			@ByValue CLLocationCoordinate2D coordinate, UIView view);

	/**
	 * convertPoint:toCoordinateFromView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/convertPoint:toCoordinateFromView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPoint:toCoordinateFromView:")
	@ByValue
	public native CLLocationCoordinate2D convertPointToCoordinateFromView(
			@ByValue CGPoint point, UIView view);

	/**
	 * convertRect:toRegionFromView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/convertRect:toRegionFromView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertRect:toRegionFromView:")
	@ByValue
	public native MKCoordinateRegion convertRectToRegionFromView(
			@ByValue CGRect rect, UIView view);

	/**
	 * convertRegion:toRectToView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/convertRegion:toRectToView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertRegion:toRectToView:")
	@ByValue
	public native CGRect convertRegionToRectToView(
			@ByValue MKCoordinateRegion region, UIView view);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MKMapViewDelegate delegate();

	/**
	 * dequeueReusableAnnotationViewWithIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/dequeueReusableAnnotationViewWithIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dequeueReusableAnnotationViewWithIdentifier:")
	public native MKAnnotationView dequeueReusableAnnotationViewWithIdentifier(
			String identifier);

	/**
	 * deselectAnnotation:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/deselectAnnotation:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deselectAnnotation:animated:")
	public native void deselectAnnotationAnimated(
			@Mapped(ObjCObjectMapper.class) MKAnnotation annotation, boolean animated);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * exchangeOverlay:withOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/exchangeOverlay:withOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exchangeOverlay:withOverlay:")
	public native void exchangeOverlayWithOverlay(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay1,
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay2);

	/**
	 * exchangeOverlayAtIndex:withOverlayAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/exchangeOverlayAtIndex:withOverlayAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exchangeOverlayAtIndex:withOverlayAtIndex:")
	public native void exchangeOverlayAtIndexWithOverlayAtIndex(
			@NUInt long index1, @NUInt long index2);

	@Generated
	@Selector("init")
	public native MKMapView init();

	@Generated
	@Selector("initWithCoder:")
	public native MKMapView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MKMapView initWithFrame(@ByValue CGRect frame);

	/**
	 * insertOverlay:aboveOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/insertOverlay:aboveOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertOverlay:aboveOverlay:")
	public native void insertOverlayAboveOverlay(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay,
			@Mapped(ObjCObjectMapper.class) MKOverlay sibling);

	/**
	 * insertOverlay:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/insertOverlay:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertOverlay:atIndex:")
	public native void insertOverlayAtIndex(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay, @NUInt long index);

	/**
	 * insertOverlay:atIndex:level:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/insertOverlay:atIndex:level:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertOverlay:atIndex:level:")
	public native void insertOverlayAtIndexLevel(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay, @NUInt long index,
			@NInt long level);

	/**
	 * insertOverlay:belowOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/insertOverlay:belowOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertOverlay:belowOverlay:")
	public native void insertOverlayBelowOverlay(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay,
			@Mapped(ObjCObjectMapper.class) MKOverlay sibling);

	/**
	 * pitchEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/pitchEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPitchEnabled")
	public native boolean isPitchEnabled();

	/**
	 * rotateEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/rotateEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isRotateEnabled")
	public native boolean isRotateEnabled();

	/**
	 * scrollEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/scrollEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isScrollEnabled")
	public native boolean isScrollEnabled();

	/**
	 * userLocationVisible</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/userLocationVisible">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isUserLocationVisible")
	public native boolean isUserLocationVisible();

	/**
	 * zoomEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/zoomEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isZoomEnabled")
	public native boolean isZoomEnabled();

	/**
	 * mapRectThatFits:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/mapRectThatFits:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mapRectThatFits:")
	@ByValue
	public native MKMapRect mapRectThatFits(@ByValue MKMapRect mapRect);

	/**
	 * mapRectThatFits:edgePadding:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/mapRectThatFits:edgePadding:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mapRectThatFits:edgePadding:")
	@ByValue
	public native MKMapRect mapRectThatFitsEdgePadding(
			@ByValue MKMapRect mapRect, @ByValue UIEdgeInsets insets);

	/**
	 * mapType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/mapType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mapType")
	@NUInt
	public native long mapType();

	/**
	 * overlays</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/overlays">iOS Dev Center</a>
	 */
	@Generated
	@Selector("overlays")
	public native NSArray<?> overlays();

	/**
	 * overlaysInLevel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/overlaysInLevel:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("overlaysInLevel:")
	public native NSArray<?> overlaysInLevel(@NInt long level);

	/**
	 * region</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/region">iOS Dev Center</a>
	 */
	@Generated
	@Selector("region")
	@ByValue
	public native MKCoordinateRegion region();

	/**
	 * regionThatFits:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/regionThatFits:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("regionThatFits:")
	@ByValue
	public native MKCoordinateRegion regionThatFits(
			@ByValue MKCoordinateRegion region);

	/**
	 * removeAnnotation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/removeAnnotation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAnnotation:")
	public native void removeAnnotation(
			@Mapped(ObjCObjectMapper.class) MKAnnotation annotation);

	/**
	 * removeAnnotations:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/removeAnnotations:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAnnotations:")
	public native void removeAnnotations(NSArray<?> annotations);

	/**
	 * removeOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/removeOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeOverlay:")
	public native void removeOverlay(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay);

	/**
	 * removeOverlays:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/removeOverlays:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeOverlays:")
	public native void removeOverlays(NSArray<?> overlays);

	/**
	 * rendererForOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/rendererForOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rendererForOverlay:")
	public native MKOverlayRenderer rendererForOverlay(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay);

	/**
	 * selectAnnotation:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/selectAnnotation:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("selectAnnotation:animated:")
	public native void selectAnnotationAnimated(
			@Mapped(ObjCObjectMapper.class) MKAnnotation annotation, boolean animated);

	/**
	 * selectedAnnotations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/selectedAnnotations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("selectedAnnotations")
	public native NSArray<?> selectedAnnotations();

	/**
	 * camera</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/camera">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCamera:")
	public native void setCamera(MKMapCamera value);

	/**
	 * setCamera:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/setCamera:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCamera:animated:")
	public native void setCameraAnimated(MKMapCamera camera, boolean animated);

	/**
	 * centerCoordinate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/centerCoordinate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCenterCoordinate:")
	public native void setCenterCoordinate(@ByValue CLLocationCoordinate2D value);

	/**
	 * setCenterCoordinate:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/setCenterCoordinate:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCenterCoordinate:animated:")
	public native void setCenterCoordinateAnimated(
			@ByValue CLLocationCoordinate2D coordinate, boolean animated);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MKMapViewDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) MKMapViewDelegate value) {
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
	 * mapType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/mapType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMapType:")
	public native void setMapType(@NUInt long value);

	/**
	 * pitchEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/pitchEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPitchEnabled:")
	public native void setPitchEnabled(boolean value);

	/**
	 * region</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/region">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRegion:")
	public native void setRegion(@ByValue MKCoordinateRegion value);

	/**
	 * setRegion:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/setRegion:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRegion:animated:")
	public native void setRegionAnimated(@ByValue MKCoordinateRegion region,
			boolean animated);

	/**
	 * rotateEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/rotateEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRotateEnabled:")
	public native void setRotateEnabled(boolean value);

	/**
	 * scrollEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/scrollEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setScrollEnabled:")
	public native void setScrollEnabled(boolean value);

	/**
	 * selectedAnnotations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/selectedAnnotations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSelectedAnnotations:")
	public native void setSelectedAnnotations(NSArray<?> value);

	/**
	 * showsBuildings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsBuildings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsBuildings:")
	public native void setShowsBuildings(boolean value);

	/**
	 * showsPointsOfInterest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsPointsOfInterest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsPointsOfInterest:")
	public native void setShowsPointsOfInterest(boolean value);

	/**
	 * showsUserLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsUserLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsUserLocation:")
	public native void setShowsUserLocation(boolean value);

	/**
	 * userTrackingMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/userTrackingMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUserTrackingMode:")
	public native void setUserTrackingMode(@NInt long value);

	/**
	 * setUserTrackingMode:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/setUserTrackingMode:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUserTrackingMode:animated:")
	public native void setUserTrackingModeAnimated(@NInt long mode,
			boolean animated);

	/**
	 * visibleMapRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/visibleMapRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVisibleMapRect:")
	public native void setVisibleMapRect(@ByValue MKMapRect value);

	/**
	 * setVisibleMapRect:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/setVisibleMapRect:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVisibleMapRect:animated:")
	public native void setVisibleMapRectAnimated(@ByValue MKMapRect mapRect,
			boolean animate);

	/**
	 * setVisibleMapRect:edgePadding:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/setVisibleMapRect:edgePadding:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVisibleMapRect:edgePadding:animated:")
	public native void setVisibleMapRectEdgePaddingAnimated(
			@ByValue MKMapRect mapRect, @ByValue UIEdgeInsets insets,
			boolean animate);

	/**
	 * zoomEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/zoomEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setZoomEnabled:")
	public native void setZoomEnabled(boolean value);

	/**
	 * showAnnotations:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/showAnnotations:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showAnnotations:animated:")
	public native void showAnnotationsAnimated(NSArray<?> annotations,
			boolean animated);

	/**
	 * showsBuildings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsBuildings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsBuildings")
	public native boolean showsBuildings();

	/**
	 * showsPointsOfInterest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsPointsOfInterest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsPointsOfInterest")
	public native boolean showsPointsOfInterest();

	/**
	 * showsUserLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsUserLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsUserLocation")
	public native boolean showsUserLocation();

	/**
	 * userLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/userLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userLocation")
	public native MKUserLocation userLocation();

	/**
	 * userTrackingMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/userTrackingMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userTrackingMode")
	@NInt
	public native long userTrackingMode();

	/**
	 * viewForAnnotation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/viewForAnnotation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewForAnnotation:")
	public native MKAnnotationView viewForAnnotation(
			@Mapped(ObjCObjectMapper.class) MKAnnotation annotation);

	/**
	 * viewForOverlay:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instm/MKMapView/viewForOverlay:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("viewForOverlay:")
	public native MKOverlayView viewForOverlay(
			@Mapped(ObjCObjectMapper.class) MKOverlay overlay);

	/**
	 * visibleMapRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/visibleMapRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("visibleMapRect")
	@ByValue
	public native MKMapRect visibleMapRect();

	/**
	 * showsCompass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsCompass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsCompass:")
	public native void setShowsCompass(boolean value);

	/**
	 * showsScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsScale:")
	public native void setShowsScale(boolean value);

	/**
	 * showsTraffic</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsTraffic">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsTraffic:")
	public native void setShowsTraffic(boolean value);

	/**
	 * showsCompass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsCompass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsCompass")
	public native boolean showsCompass();

	/**
	 * showsScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsScale")
	public native boolean showsScale();

	/**
	 * showsTraffic</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapView_Class/index.html#//apple_ref/occ/instp/MKMapView/showsTraffic">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsTraffic")
	public native boolean showsTraffic();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
	public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(
			double frameStartTime,
			double frameDuration,
			@ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
	public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:animations:")
	public static native void animateWithDurationAnimations(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

	@Generated
	@Selector("animateWithDuration:animations:completion:")
	public static native void animateWithDurationAnimationsCompletion(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

	@Generated
	@Selector("animateWithDuration:delay:options:animations:completion:")
	public static native void animateWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
	public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NFloat double dampingRatio,
			@NFloat double velocity,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

	@Generated
	@Selector("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearance();

	@Generated
	@ProtocolClassMethod("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearance() {
		return appearance();
	}

	@Generated
	@Selector("appearanceForTraitCollection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollection(
			UITraitCollection trait);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollection")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollection(UITraitCollection trait) {
		return appearanceForTraitCollection(trait);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceForTraitCollection:whenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceForTraitCollectionWhenContainedIn(trait,
				ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes) {
		return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
				trait, containerTypes);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceWhenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceWhenContainedIn(ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceWhenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes) {
		return appearanceWhenContainedInInstancesOfClasses(containerTypes);
	}

	@Generated
	@Selector("areAnimationsEnabled")
	public static native boolean areAnimationsEnabled();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("beginAnimations:context:")
	public static native void beginAnimationsContext(String animationID,
			VoidPtr context);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

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
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("layerClass")
	public static native Class layerClass();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("performSystemAnimation:onViews:options:animations:completion:")
	public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(
			@NUInt long animation,
			NSArray<? extends UIView> views,
			@NUInt long options,
			@ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
			@ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("performWithoutAnimation:")
	public static native void performWithoutAnimation(
			@ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

	@Generated
	@Selector("requiresConstraintBasedLayout")
	public static native boolean requiresConstraintBasedLayout();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAnimationBeginsFromCurrentState:")
	public static native void setAnimationBeginsFromCurrentState(
			boolean fromCurrentState);

	@Generated
	@Selector("setAnimationCurve:")
	public static native void setAnimationCurve(@NInt long curve);

	@Generated
	@Selector("setAnimationDelay:")
	public static native void setAnimationDelay(double delay);

	@Generated
	@Selector("setAnimationDelegate:")
	public static native void setAnimationDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setAnimationDidStopSelector:")
	public static native void setAnimationDidStopSelector(SEL selector);

	@Generated
	@Selector("setAnimationDuration:")
	public static native void setAnimationDuration(double duration);

	@Generated
	@Selector("setAnimationRepeatAutoreverses:")
	public static native void setAnimationRepeatAutoreverses(
			boolean repeatAutoreverses);

	@Generated
	@Selector("setAnimationRepeatCount:")
	public static native void setAnimationRepeatCount(float repeatCount);

	@Generated
	@Selector("setAnimationStartDate:")
	public static native void setAnimationStartDate(NSDate startDate);

	@Generated
	@Selector("setAnimationTransition:forView:cache:")
	public static native void setAnimationTransitionForViewCache(
			@NInt long transition, UIView view, boolean cache);

	@Generated
	@Selector("setAnimationWillStartSelector:")
	public static native void setAnimationWillStartSelector(SEL selector);

	@Generated
	@Selector("setAnimationsEnabled:")
	public static native void setAnimationsEnabled(boolean enabled);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("transitionFromView:toView:duration:options:completion:")
	public static native void transitionFromViewToViewDurationOptionsCompletion(
			UIView fromView,
			UIView toView,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

	@Generated
	@Selector("transitionWithView:duration:options:animations:completion:")
	public static native void transitionWithViewDurationOptionsAnimationsCompletion(
			UIView view,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
	@NInt
	public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(
			@NInt long attribute);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
