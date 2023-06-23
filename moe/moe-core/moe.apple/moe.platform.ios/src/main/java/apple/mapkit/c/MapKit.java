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
import org.jetbrains.annotations.NotNull;

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

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKCoordinateSpan MKCoordinateSpanMake(double latitudeDelta, double longitudeDelta);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKCoordinateRegion MKCoordinateRegionMake(@ByValue CLLocationCoordinate2D centerCoordinate,
            @ByValue MKCoordinateSpan span);

    @Generated
    @CFunction
    @ByValue
    public static native MKCoordinateRegion MKCoordinateRegionMakeWithDistance(
            @ByValue CLLocationCoordinate2D centerCoordinate, double latitudinalMeters, double longitudinalMeters);

    /**
     * Conversion between unprojected and projected coordinates
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapPoint MKMapPointForCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CLLocationCoordinate2D MKCoordinateForMapPoint(@ByValue MKMapPoint mapPoint);

    /**
     * Conversion between distances and projected coordinates
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native double MKMetersPerMapPointAtLatitude(double latitude);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native double MKMapPointsPerMeterAtLatitude(double latitude);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native double MKMetersBetweenMapPoints(@ByValue MKMapPoint a, @ByValue MKMapPoint b);

    /**
     * Geometric operations on MKMapPoint/Size/Rect. See CGGeometry.h for
     * information on the CGFloat versions of these functions.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKMapPoint MKMapPointMake(double x, double y);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKMapSize MKMapSizeMake(double width, double height);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectMake(double x, double y, double width, double height);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMinX(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMinY(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMidX(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMidY(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMaxX(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetMaxY(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetWidth(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native double MKMapRectGetHeight(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapPointEqualToPoint(@ByValue MKMapPoint point1, @ByValue MKMapPoint point2);

    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapSizeEqualToSize(@ByValue MKMapSize size1, @ByValue MKMapSize size2);

    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapRectEqualToRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapRectIsNull(@ByValue MKMapRect rect);

    @Generated
    @Inline
    @CFunction
    public static native boolean MKMapRectIsEmpty(@ByValue MKMapRect rect);

    @NotNull
    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapPoint(@ByValue MKMapPoint point);

    @NotNull
    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapSize(@ByValue MKMapSize size);

    @NotNull
    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapRect(@ByValue MKMapRect rect);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectUnion(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectIntersection(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectInset(@ByValue MKMapRect rect, double dx, double dy);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectOffset(@ByValue MKMapRect rect, double dx, double dy);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void MKMapRectDivide(@ByValue MKMapRect rect,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MKMapRect slice,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MKMapRect remainder,
            double amount, int edge);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectContainsPoint(@ByValue MKMapRect rect, @ByValue MKMapPoint point);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectContainsRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectIntersectsRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKCoordinateRegion MKCoordinateRegionForMapRect(@ByValue MKMapRect rect);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native boolean MKMapRectSpans180thMeridian(@ByValue MKMapRect rect);

    /**
     * For map rects that span the 180th meridian, this returns the portion of the rect
     * that lies outside of the world rect wrapped around to the other side of the
     * world. The portion of the rect that lies inside the world rect can be
     * determined with MKMapRectIntersection(rect, MKMapRectWorld).
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectRemainder(@ByValue MKMapRect rect);

    /**
     * Road widths are typically not drawn to scale on the map. This function
     * returns the approximate width in points of roads at the specified zoomScale.
     * The result of this function is suitable for use with CGContextSetLineWidth.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MKRoadWidthAtZoomScale(@NFloat double zoomScale);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native MKMapSize MKMapSizeWorld();

    /**
     * The rect that contains every map point in the world.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native MKMapRect MKMapRectWorld();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native MKMapRect MKMapRectNull();

    /**
     * Key to a directions mode
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeKey();

    /**
     * Key to an NSNumber corresponding to a MKMapType
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsMapTypeKey();

    /**
     * Key to a boolean NSNumber
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsShowsTrafficKey();

    /**
     * Will pick the best directions mode, given the user's preferences
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeDefault();

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeDriving();

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeWalking();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsDirectionsModeTransit();

    /**
     * Key to an NSValue-encoded CLLocationCoordinate2D
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsMapCenterKey();

    /**
     * Key to an NSValue-encoded MKCoordinateSpan
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsMapSpanKey();

    /**
     * Key to MKMapCamera object
     * 
     * API-Since: 7.1
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKLaunchOptionsCameraKey();

    /**
     * Post this notification to re-query callout information.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKAnnotationCalloutInfoDidChangeNotification();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKErrorDomain();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKMapItemTypeIdentifier();

    /**
     * API-Since: 11.0
     */
    @Generated public static final float MKFeatureDisplayPriorityRequired = (float)1000.0;
    /**
     * API-Since: 11.0
     */
    @Generated public static final float MKFeatureDisplayPriorityDefaultHigh = (float)750.0;
    /**
     * API-Since: 11.0
     */
    @Generated public static final float MKFeatureDisplayPriorityDefaultLow = (float)250.0;

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKMapViewDefaultAnnotationViewReuseIdentifier();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKMapViewDefaultClusterAnnotationViewReuseIdentifier();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryAirport();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryAmusementPark();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryAquarium();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryATM();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBakery();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBank();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBeach();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBrewery();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryCafe();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryCampground();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryCarRental();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryEVCharger();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryFireStation();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryFitnessCenter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryFoodMarket();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryGasStation();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryHospital();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryHotel();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryLaundry();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryLibrary();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryMarina();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryMovieTheater();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryMuseum();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryNationalPark();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryNightlife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPark();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryParking();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPharmacy();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPolice();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPostOffice();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPublicTransport();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryRestaurant();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryRestroom();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategorySchool();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryStadium();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryStore();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryTheater();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryUniversity();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryWinery();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryZoo();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    public static native double MKMapCameraZoomDefault();

    /**
     * API-Since: 14.0
     */
    @Generated public static final float MKAnnotationViewZPriorityMax = (float)1000.0;
    /**
     * API-Since: 14.0
     */
    @Generated public static final float MKAnnotationViewZPriorityDefaultSelected = (float)1000.0;
    /**
     * API-Since: 14.0
     */
    @Generated public static final float MKAnnotationViewZPriorityDefaultUnselected = (float)500.0;
    /**
     * API-Since: 14.0
     */
    @Generated public static final float MKAnnotationViewZPriorityMin = (float)0.0;

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native double MKPointsOfInterestRequestMaxRadius();
}
