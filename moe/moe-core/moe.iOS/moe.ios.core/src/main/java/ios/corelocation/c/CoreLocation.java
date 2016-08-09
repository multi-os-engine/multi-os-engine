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

package ios.corelocation.c;


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

import ios.corelocation.struct.CLLocationCoordinate2D;

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
	 * CLLocationCoordinate2DIsValid</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CoreLocationFunctions/index.html#//apple_ref/c/func/CLLocationCoordinate2DIsValid">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean CLLocationCoordinate2DIsValid(
			@ByValue CLLocationCoordinate2D coord);

	/**
	 * CLLocationCoordinate2DMake</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CoreLocationFunctions/index.html#//apple_ref/c/func/CLLocationCoordinate2DMake">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CLLocationCoordinate2D CLLocationCoordinate2DMake(
			double latitude, double longitude);

	@Generated
	@CVariable()
	public static native double kCLDistanceFilterNone();

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

	@Generated
	@CVariable()
	public static native double CLLocationDistanceMax();

	@Generated
	@CVariable()
	public static native double CLTimeIntervalMax();

	@Generated
	@CVariable()
	@ByValue
	public static native CLLocationCoordinate2D kCLLocationCoordinate2DInvalid();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCLErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCLErrorUserInfoAlternateRegionKey();

	@Generated
	@CVariable()
	public static native double kCLHeadingFilterNone();
}
