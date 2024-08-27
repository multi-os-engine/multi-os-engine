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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class UIDataDetectorTypes {
    /**
     * Phone number detection
     */
    @Generated @NUInt public static final long PhoneNumber = 0x0000000000000001L;
    /**
     * URL detection
     */
    @Generated @NUInt public static final long Link = 0x0000000000000002L;
    /**
     * Street address detection
     * 
     * API-Since: 4.0
     */
    @Generated @NUInt public static final long Address = 0x0000000000000004L;
    /**
     * Event detection
     * 
     * API-Since: 4.0
     */
    @Generated @NUInt public static final long CalendarEvent = 0x0000000000000008L;
    /**
     * Shipment tracking number detection
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long ShipmentTrackingNumber = 0x0000000000000010L;
    /**
     * Flight number detection
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long FlightNumber = 0x0000000000000020L;
    /**
     * Information users may want to look up
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long LookupSuggestion = 0x0000000000000040L;
    /**
     * Disable detection
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Enable all types, including types that may be added later
     */
    @Generated @NUInt public static final long All = org.moe.natj.general.NatJ.is64Bit() ?
            0xFFFFFFFFFFFFFFFFL :
            0x00000000FFFFFFFFL;

    @Generated
    private UIDataDetectorTypes() {
    }

    /**
     * Money amounts
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Money = 0x0000000000000080L;
    /**
     * Physical values (length, temperatures, etc...)
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long PhysicalValue = 0x0000000000000100L;
}
