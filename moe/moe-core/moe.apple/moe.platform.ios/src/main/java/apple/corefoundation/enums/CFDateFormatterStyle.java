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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The exact formatted result for these date and time styles depends on the
 * locale, but generally:
 *     Short is completely numeric, such as "12/13/52" or "3:30pm"
 *     Medium is longer, such as "Jan 12, 1952"
 *     Long is longer, such as "January 12, 1952" or "3:30:32pm"
 *     Full is pretty complete; e.g. "Tuesday, April 12, 1952 AD" or "3:30:42pm PST"
 * The specifications though are left fuzzy, in part simply because a user's
 * preference choices may affect the output, and also the results may change
 * from one OS release to another.  To produce an exactly formatted date you
 * should not rely on styles and localization, but set the format string and
 * use nothing but numbers.
 */
@Generated
public final class CFDateFormatterStyle {
    @Generated @NInt public static final long NoStyle = 0x0000000000000000L;
    @Generated @NInt public static final long ShortStyle = 0x0000000000000001L;
    @Generated @NInt public static final long MediumStyle = 0x0000000000000002L;
    @Generated @NInt public static final long LongStyle = 0x0000000000000003L;
    @Generated @NInt public static final long FullStyle = 0x0000000000000004L;

    @Generated
    private CFDateFormatterStyle() {
    }
}
