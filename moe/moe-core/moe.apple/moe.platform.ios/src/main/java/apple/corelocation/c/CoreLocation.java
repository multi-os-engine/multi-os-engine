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

package apple.corelocation.c;

import apple.corelocation.struct.CLLocationCoordinate2D;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreLocation")
@Runtime(CRuntime.class)
public final class CoreLocation {
    static {
        NatJ.register();
    }

    @Generated
    private CoreLocation() {
    }

    /**
     * CLLocationCoordinate2DIsValid
     * <p>
     * Discussion:
     * Returns YES if the specified coordinate is valid, NO otherwise.
     */
    @Generated
    @CFunction
    public static native boolean CLLocationCoordinate2DIsValid(@ByValue CLLocationCoordinate2D coord);

    /**
     * CLLocationCoordinate2DMake:
     * <p>
     * Discussion:
     * Returns a new CLLocationCoordinate2D at the given latitude and longitude
     */
    @Generated
    @CFunction
    @ByValue
    public static native CLLocationCoordinate2D CLLocationCoordinate2DMake(double latitude, double longitude);

    /**
     * kCLDistanceFilterNone
     * <p>
     * Discussion:
     * Use as the distanceFilter property for CLLocationManager. This indicates
     * to the location service that no minimum movement filter is desired - ie, client will be informed
     * of any movement.
     */
    @Generated
    @CVariable()
    public static native double kCLDistanceFilterNone();

    /**
     * kCLLocationAccuracy<x>
     * <p>
     * Discussion:
     * Used to specify the accuracy level desired. The location service will try its best to achieve
     * your desired accuracy. However, it is not guaranteed. To optimize
     * power performance, be sure to specify an appropriate accuracy for your usage scenario (eg,
     * use a large accuracy value when only a coarse location is needed).
     */
    @Generated
    @CVariable()
    public static native double kCLLocationAccuracyBestForNavigation();

    @Generated
    @CVariable()
    public static native double kCLLocationAccuracyBest();

    @Generated
    @CVariable()
    public static native double kCLLocationAccuracyNearestTenMeters();

    @Generated
    @CVariable()
    public static native double kCLLocationAccuracyHundredMeters();

    @Generated
    @CVariable()
    public static native double kCLLocationAccuracyKilometer();

    @Generated
    @CVariable()
    public static native double kCLLocationAccuracyThreeKilometers();

    /**
     * CLLocationDistanceMax
     * <p>
     * Discussion:
     * Used to specify the maximum CLLocationDistance
     */
    @Generated
    @CVariable()
    public static native double CLLocationDistanceMax();

    /**
     * CLTimeIntervalMax
     * <p>
     * Discussion:
     * Used to specify the maximum NSTimeInterval
     */
    @Generated
    @CVariable()
    public static native double CLTimeIntervalMax();

    /**
     * kCLLocationCoordinate2DInvalid
     * <p>
     * Discussion:
     * Used to specify an invalid CLLocationCoordinate2D.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CLLocationCoordinate2D kCLLocationCoordinate2DInvalid();

    /**
     * kCLErrorDomain
     * <p>
     * Discussion:
     * Error returned as the domain to NSError from CoreLocation.
     * <p>
     * The file CLError.h defines constants for the errors in kCLErrorDomain.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCLErrorDomain();

    /**
     * kCLErrorUserInfoAlternateRegionKey
     * <p>
     * Discussion:
     * When an error with code kCLErrorRegionMonitoringResponseDelayed is received, this key may be populated
     * in the userInfo dictionary. The value is a CLRegion that the location service can more effectively monitor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCLErrorUserInfoAlternateRegionKey();

    /**
     * kCLHeadingFilterNone
     * <p>
     * Discussion:
     * Use as the headingFilter property for CLLocationManager. This indicates
     * to the heading service that no minimum movement filter is desired - ie, client will be informed
     * of any movement.
     */
    @Generated
    @CVariable()
    public static native double kCLHeadingFilterNone();

    /**
     * kCLLocationAccuracyReduced
     * <p>
     * Discussion:
     * If you set your CLLocationManager's desiredAccuracy property to
     * this value, locations delivered to your delegate in response to
     * startUpdatingLocation or requestLocation will have their
     * accuracy reduced. The locations you receive will match the
     * locations your app would have received if the user had decided
     * not to grant your app authorization for precise location.
     */
    @Generated
    @CVariable()
    public static native double kCLLocationAccuracyReduced();

    /**
     * CLLocationPushServiceErrorDomain
     * <p>
     * Discussion:
     * Error returned as the domain to NSError from -[CLLocationManager startMonitoringLocationPushesWithCompletion:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLLocationPushServiceErrorDomain();
}
