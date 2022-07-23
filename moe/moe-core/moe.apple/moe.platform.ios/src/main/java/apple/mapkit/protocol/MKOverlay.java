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

import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.mapkit.struct.MKMapRect;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKOverlay")
public interface MKOverlay extends MKAnnotation {
    /**
     * boundingMapRect should be the smallest rectangle that completely contains the overlay.
     * For overlays that span the 180th meridian, boundingMapRect should have either a negative MinX or a MaxX that is
     * greater than MKMapSizeWorld.width.
     */
    @Generated
    @Selector("boundingMapRect")
    @ByValue
    MKMapRect boundingMapRect();

    /**
     * If this method is implemented and returns YES, MKMapView may use it as a hint to skip loading or drawing the
     * built in map content in the area covered by this overlay.
     */
    @Generated
    @IsOptional
    @Selector("canReplaceMapContent")
    default boolean canReplaceMapContent() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * From MKAnnotation, for areas this should return the centroid of the area.
     */
    @Generated
    @Selector("coordinate")
    @ByValue
    CLLocationCoordinate2D coordinate();

    /**
     * Implement intersectsMapRect to provide more precise control over when the view for the overlay should be shown.
     * If omitted, MKMapRectIntersectsRect([overlay boundingRect], mapRect) will be used instead.
     */
    @Generated
    @IsOptional
    @Selector("intersectsMapRect:")
    default boolean intersectsMapRect(@ByValue MKMapRect mapRect) {
        throw new java.lang.UnsupportedOperationException();
    }
}
