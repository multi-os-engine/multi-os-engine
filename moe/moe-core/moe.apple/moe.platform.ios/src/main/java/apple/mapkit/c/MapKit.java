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

    @Generated
    @CFunction
    @ByValue
    public static native MKMapPoint MKMapPointForCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    @Generated
    @CFunction
    @ByValue
    public static native CLLocationCoordinate2D MKCoordinateForMapPoint(@ByValue MKMapPoint mapPoint);

    @Generated
    @CFunction
    public static native double MKMetersPerMapPointAtLatitude(double latitude);

    @Generated
    @CFunction
    public static native double MKMapPointsPerMeterAtLatitude(double latitude);

    @Generated
    @CFunction
    public static native double MKMetersBetweenMapPoints(@ByValue MKMapPoint a, @ByValue MKMapPoint b);

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

    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapPoint(@ByValue MKMapPoint point);

    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapSize(@ByValue MKMapSize size);

    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKStringFromMapRect(@ByValue MKMapRect rect);

    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectUnion(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectIntersection(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectInset(@ByValue MKMapRect rect, double dx, double dy);

    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectOffset(@ByValue MKMapRect rect, double dx, double dy);

    @Generated
    @CFunction
    public static native void MKMapRectDivide(@ByValue MKMapRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") MKMapRect slice,
            @UncertainArgument("Options: reference, array Fallback: reference") MKMapRect remainder, double amount,
            int edge);

    @Generated
    @CFunction
    public static native boolean MKMapRectContainsPoint(@ByValue MKMapRect rect, @ByValue MKMapPoint point);

    @Generated
    @CFunction
    public static native boolean MKMapRectContainsRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    @Generated
    @CFunction
    public static native boolean MKMapRectIntersectsRect(@ByValue MKMapRect rect1, @ByValue MKMapRect rect2);

    @Generated
    @CFunction
    @ByValue
    public static native MKCoordinateRegion MKCoordinateRegionForMapRect(@ByValue MKMapRect rect);

    @Generated
    @CFunction
    public static native boolean MKMapRectSpans180thMeridian(@ByValue MKMapRect rect);

    @Generated
    @CFunction
    @ByValue
    public static native MKMapRect MKMapRectRemainder(@ByValue MKMapRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double MKRoadWidthAtZoomScale(@NFloat double zoomScale);

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
    public static native String MKLaunchOptionsDirectionsModeDefault();

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
    public static native String MKLaunchOptionsDirectionsModeTransit();

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
    public static native String MKAnnotationCalloutInfoDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKMapItemTypeIdentifier();

    @Generated public static final float MKFeatureDisplayPriorityRequired = (float)1000.0;
    @Generated public static final float MKFeatureDisplayPriorityDefaultHigh = (float)750.0;
    @Generated public static final float MKFeatureDisplayPriorityDefaultLow = (float)250.0;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKMapViewDefaultAnnotationViewReuseIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKMapViewDefaultClusterAnnotationViewReuseIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryAirport();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryAmusementPark();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryAquarium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryATM();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBakery();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBank();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBeach();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryBrewery();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryCafe();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryCampground();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryCarRental();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryEVCharger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryFireStation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryFitnessCenter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryFoodMarket();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryGasStation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryHospital();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryHotel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryLaundry();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryLibrary();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryMarina();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryMovieTheater();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryMuseum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryNationalPark();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryNightlife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPark();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryParking();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPharmacy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPolice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPostOffice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryPublicTransport();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryRestaurant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryRestroom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategorySchool();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryStadium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryStore();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryTheater();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryUniversity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryWinery();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MKPointOfInterestCategoryZoo();

    @Generated
    @CVariable()
    public static native double MKMapCameraZoomDefault();

    @Generated public static final float MKAnnotationViewZPriorityMax = (float)1000.0;
    @Generated public static final float MKAnnotationViewZPriorityDefaultSelected = (float)1000.0;
    @Generated public static final float MKAnnotationViewZPriorityDefaultUnselected = (float)500.0;
    @Generated public static final float MKAnnotationViewZPriorityMin = (float)0.0;

    @Generated
    @CVariable()
    public static native double MKPointsOfInterestRequestMaxRadius();
}
