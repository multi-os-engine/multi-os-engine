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


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.corelocation.struct.CLLocationCoordinate2D;
import ios.mapkit.struct.MKMapRect;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKOverlay")
public interface MKOverlay extends MKAnnotation {
	/**
	 * boundingMapRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKOverlay_protocol/index.html#//apple_ref/occ/intfp/MKOverlay/boundingMapRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("boundingMapRect")
	@ByValue
	MKMapRect boundingMapRect();

	/**
	 * canReplaceMapContent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKOverlay_protocol/index.html#//apple_ref/occ/intfm/MKOverlay/canReplaceMapContent">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("canReplaceMapContent")
	default boolean canReplaceMapContent() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * coordinate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKOverlay_protocol/index.html#//apple_ref/occ/intfp/MKOverlay/coordinate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("coordinate")
	@ByValue
	CLLocationCoordinate2D coordinate();

	/**
	 * intersectsMapRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKOverlay_protocol/index.html#//apple_ref/occ/intfm/MKOverlay/intersectsMapRect:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("intersectsMapRect:")
	default boolean intersectsMapRect(@ByValue MKMapRect mapRect) {
		throw new java.lang.UnsupportedOperationException();
	}
}
