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
@ObjCProtocolName("MKAnnotation")
public interface MKAnnotation {
    /**
     * Center latitude and longitude of the annotation view.
     * The implementation of this property must be KVO compliant.
     */
    @Generated
    @Selector("coordinate")
    @ByValue
    CLLocationCoordinate2D coordinate();

    /**
     * Called as a result of dragging an annotation view.
     * 
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("setCoordinate:")
    default void setCoordinate(@ByValue CLLocationCoordinate2D newCoordinate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("subtitle")
    default String subtitle() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Title and subtitle for use by selection UI.
     */
    @Generated
    @IsOptional
    @Selector("title")
    default String title() {
        throw new java.lang.UnsupportedOperationException();
    }
}
