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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSMeasurementFormatterUnitOptions {
    /**
     * e.g This ensures the formatter uses this unit even if it is not the preferred unit of the set locale.
     */
    @Generated @NUInt public static final long ProvidedUnit = 0x0000000000000001L;
    /**
     * e.g. This would make the formatter show "12 kilometers" instead of "12000 meters". Note that setting
     * NSMeasurementFormatterUnitOptionsNaturalScale results in scaling within the unit system of the preferred unit of
     * the locale. To scale within the unit system of the provided unit, set
     * NSMeasurementFormatterUnitOptionsNaturalScale | NSMeasurementFormatterUnitOptionsProvidedUnit.
     */
    @Generated @NUInt public static final long NaturalScale = 0x0000000000000002L;
    /**
     * e.g. This would display "90°" rather than "90°F" or "90°C"
     */
    @Generated @NUInt public static final long TemperatureWithoutUnit = 0x0000000000000004L;

    @Generated
    private NSMeasurementFormatterUnitOptions() {
    }
}
