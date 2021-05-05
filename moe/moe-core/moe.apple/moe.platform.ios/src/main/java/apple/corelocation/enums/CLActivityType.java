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

package apple.corelocation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CLActivityType
 * 
 *  Discussion:
 * 	Expected user activity for the lifetime of the corresponding CLLocationManager instance.
 * 	Used to optimize the positioning experience delivered to this CLLocationManager instance
 * 	for the expected activity.
 */
@Generated
public final class CLActivityType {
    /**
     * positioning in activities that are not covered by one of
     */
    @Generated @NInt public static final long Other = 0x0000000000000001L;
    /**
     * positioning in an automobile following a road network
     */
    @Generated @NInt public static final long AutomotiveNavigation = 0x0000000000000002L;
    /**
     * positioning in dedicated fitness sessions, e.g. walking
     */
    @Generated @NInt public static final long Fitness = 0x0000000000000003L;
    /**
     * positioning for transportation that does not or may not
     */
    @Generated @NInt public static final long OtherNavigation = 0x0000000000000004L;

    @Generated
    private CLActivityType() {
    }

    /**
     * adhere to roads such as cycling, scooters, trains, boats
     * and off-road vehicles; also for positioning indoors and
     * outdoors that isn’t tied to a dedicated fitness session,
     * e.g. walking
     */
    @Generated @NInt public static final long Airborne = 0x0000000000000005L;
}
