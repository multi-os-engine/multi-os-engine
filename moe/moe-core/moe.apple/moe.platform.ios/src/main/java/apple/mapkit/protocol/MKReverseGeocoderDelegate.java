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

import apple.foundation.NSError;
import apple.mapkit.MKPlacemark;
import apple.mapkit.MKReverseGeocoder;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKReverseGeocoderDelegate")
public interface MKReverseGeocoderDelegate {
    /**
     * reverseGeocoder:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKReverseGeocoderDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKReverseGeocoderDelegate/reverseGeocoder:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("reverseGeocoder:didFailWithError:")
    void reverseGeocoderDidFailWithError(MKReverseGeocoder geocoder, NSError error);

    /**
     * reverseGeocoder:didFindPlacemark:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKReverseGeocoderDelegate_Protocol/index.html#//apple_ref/occ/intfm/MKReverseGeocoderDelegate/reverseGeocoder:didFindPlacemark:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("reverseGeocoder:didFindPlacemark:")
    void reverseGeocoderDidFindPlacemark(MKReverseGeocoder geocoder, MKPlacemark placemark);
}
