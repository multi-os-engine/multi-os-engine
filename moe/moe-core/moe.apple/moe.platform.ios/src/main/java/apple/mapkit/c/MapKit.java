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

package apple.mapkit.c;

import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.mapkit.struct.MKCoordinateRegion;
import apple.mapkit.struct.MKCoordinateSpan;
import apple.mapkit.struct.MKMapPoint;
import apple.mapkit.struct.MKMapRect;
import apple.mapkit.struct.MKMapSize;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("MapKit")
@Runtime(CRuntime.class)
public final class MapKit {
    static {
        NatJ.register();
    }

    @Generated
    private MapKit() {
    }

    /**
     * MKCoordinateSpanMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKCoordinateSpanMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKCoordinateSpan MKCoordinateSpanMake(double latitudeDelta, double longitudeDelta);

    /**
     * MKCoordinateRegionMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKCoordinateRegionMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKCoordinateRegion MKCoordinateRegionMake(@ByValue CLLocationCoordinate2D centerCoordinate,
            @ByValue MKCoordinateSpan span);

    /**
     * MKCoordinateRegionMakeWithDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKCoordinateRegionMakeWithDistance">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKCoordinateRegion MKCoordinateRegionMakeWithDistance(
            @ByValue CLLocationCoordinate2D centerCoordinate, double latitudinalMeters, double longitudinalMeters);

    /**
     * MKMapPointForCoordinate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapPointForCoordinate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapPoint MKMapPointForCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    /**
     * MKCoordinateForMapPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKCoordinateForMapPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CLLocationCoordinate2D MKCoordinateForMapPoint(@ByValue MKMapPoint mapPoint);

    /**
     * MKMetersPerMapPointAtLatitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMetersPerMapPointAtLatitude">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double MKMetersPerMapPointAtLatitude(double latitude);

    /**
     * MKMapPointsPerMeterAtLatitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapPointsPerMeterAtLatitude">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double MKMapPointsPerMeterAtLatitude(double latitude);

    /**
     * MKMetersBetweenMapPoints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMetersBetweenMapPoints">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double MKMetersBetweenMapPoints(@ByValue MKMapPoint a, @ByValue MKMapPoint b);

    /**
     * MKMapPointMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapPointMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKMapPoint MKMapPointMake(double x, double y);

    /**
     * MKMapSizeMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapSizeMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKMapSize MKMapSizeMake(double width, double height);

    /**
     * MKMapRectMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectMake(double x, double y, double width, double height);

    /**
     * MKMapRectGetMinX</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetMinX">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMinX(@ByValue MKMapRect rect);

    /**
     * MKMapRectGetMinY</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetMinY">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMinY(@ByValue MKMapRect rect);

    /**
     * MKMapRectGetMidX</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetMidX">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMidX(@ByValue MKMapRect rect);

    /**
     * MKMapRectGetMidY</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetMidY">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMidY(@ByValue MKMapRect rect);

    /**
     * MKMapRectGetMaxX</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetMaxX">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMaxX(@ByValue MKMapRect rect);

    /**
     * MKMapRectGetMaxY</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetMaxY">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMaxY(@ByValue MKMapRect rect);

    /**
     * MKMapRectGetWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetWidth">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetWidth(@ByValue MKMapRect rect);

    /**
     * MKMapRectGetHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectGetHeight">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetHeight(@ByValue MKMapRect rect);

    /**
     * MKMapPointEqualToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapPointEqualToPoint">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapPointEqualToPoint(@ByValue MKMapPoint point1, @ByValue MKMapPoint point2);

    /**
     * MKMapSizeEqualToSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapSizeEqualToSize">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapSizeEqualToSize(@ByValue MKMapSize size1, @ByValue MKMapSize size2);

    /**
     * MKMapRectEqualToRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectEqualToRect">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapRectEqualToRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * MKMapRectIsNull</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectIsNull">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapRectIsNull(@ByValue MKMapRect rect);

    /**
     * MKMapRectIsEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectIsEmpty">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapRectIsEmpty(@ByValue MKMapRect rect);

    /**
     * MKStringFromMapPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKStringFromMapPoint">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapPoint(@ByValue MKMapPoint point);

    /**
     * MKStringFromMapSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKStringFromMapSize">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapSize(@ByValue MKMapSize size);

    /**
     * MKStringFromMapRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKStringFromMapRect">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapRect(@ByValue MKMapRect rect);

    /**
     * MKMapRectUnion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectUnion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectUnion(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * MKMapRectIntersection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectIntersection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectIntersection(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * MKMapRectInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectInset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectInset(@ByValue MKMapRect rect, double dx, double dy);

    /**
     * MKMapRectOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectOffset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectOffset(@ByValue MKMapRect rect, double dx, double dy);

    /**
     * MKMapRectDivide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectDivide">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void MKMapRectDivide(@ByValue MKMapRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") MKMapRect slice,
            @UncertainArgument("Options: reference, array Fallback: reference") MKMapRect remainder, double amount,
            int edge);

    /**
     * MKMapRectContainsPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectContainsPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectContainsPoint(@ByValue MKMapRect rect, @ByValue MKMapPoint point);

    /**
     * MKMapRectContainsRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectContainsRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectContainsRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * MKMapRectIntersectsRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectIntersectsRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectIntersectsRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * MKCoordinateRegionForMapRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKCoordinateRegionForMapRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKCoordinateRegion MKCoordinateRegionForMapRect(@ByValue MKMapRect rect);

    /**
     * MKMapRectSpans180thMeridian</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectSpans180thMeridian">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectSpans180thMeridian(@ByValue MKMapRect rect);

    /**
     * MKMapRectRemainder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKMapRectRemainder">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectRemainder(@ByValue MKMapRect rect);

    /**
     * MKRoadWidthAtZoomScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MapKitFunctionsReference/index.html#//apple_ref/c/func/MKRoadWidthAtZoomScale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MKRoadWidthAtZoomScale(@NFloat double zoomScale);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKAnnotationCalloutInfoDidChangeNotification();

    @Generated
    @CVariable()
    @ByValue
    public static native MKMapSize MKMapSizeWorld();

    @Generated
    @CVariable()
    @ByValue
    public static native MKMapRect MKMapRectWorld();

    @Generated
    @CVariable()
    @ByValue
    public static native MKMapRect MKMapRectNull();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsMapTypeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsShowsTrafficKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeDriving();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeWalking();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsMapCenterKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsMapSpanKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsCameraKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeTransit();
}
