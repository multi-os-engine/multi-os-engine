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
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] UIPrinterJobTypes
 * 
 * Job types supported by a printer.
 * 
 * This enumeration provides the abstract job types
 * reported by the UIPrinter supportedJobTypes method.
 * [@constant] UIPrinterJobTypeUnknown Unknown printer support.
 * [@constant] UIPrinterJobTypeDocument The printer supports standard document printing.
 * [@constant] UIPrinterJobTypeEnvelope The printer supports printing on envelopes.
 * [@constant] UIPrinterJobTypeLabel The printer supports printing on cut labels.
 * [@constant] UIPrinterJobTypePhoto The printer supports printing with photographic print quality.
 * [@constant] UIPrinterJobTypeReceipt The printer supports printing receipts on continuous rolls.
 * [@constant] UIPrinterJobTypeRoll The printer supports printing documents or photos on continuous rolls.
 * [@constant] UIPrinterJobTypeLargeFormat The printer supports printing larger than ISO A3 size.
 * [@constant] UIPrinterJobTypePostcard The printer supports printing on postcards.
 * 
 * API-Since: 8.0
 */
@Generated
public final class UIPrinterJobTypes {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Document = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Envelope = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Label = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Photo = 0x0000000000000008L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Receipt = 0x0000000000000010L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Roll = 0x0000000000000020L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long LargeFormat = 0x0000000000000040L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Postcard = 0x0000000000000080L;

    @Generated
    private UIPrinterJobTypes() {
    }
}
