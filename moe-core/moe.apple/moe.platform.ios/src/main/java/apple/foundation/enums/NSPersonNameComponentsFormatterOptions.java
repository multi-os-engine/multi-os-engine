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

/**
 * API-Since: 9.0
 */
@Generated
public final class NSPersonNameComponentsFormatterOptions {
    /**
     * Indicates that the formatter should format the component object's phoneticRepresentation components instead of
     * its own components.
     * The developer must have populated these manually. e.g.: Developer creates components object with the following
     * properties:
     * <family:"Family", given:"Given", phoneticRepresentation:<family:"FamilyPhonetic", given:"GivenPhonetic">>.
     * If this option is specified, we perform formatting operations on <family "FamilyPhonetic", given "GivenPhonetic">
     * instead.
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long NSPersonNameComponentsFormatterPhonetic = 0x0000000000000002L;

    @Generated
    private NSPersonNameComponentsFormatterOptions() {
    }
}
