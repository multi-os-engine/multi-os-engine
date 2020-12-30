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

package apple.mediaaccessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum MACaptionAppearanceDomain
 * 
 * @discussion
 * MACaptionAppearanceDomain is used to specify which domain of preferences to access.
 * 
 * @constant kMACaptionAppearanceDomainUser
 *    The user-defined preferences. This domain should be passed to retrieve settings that should be used to render captions.
 * @constant kMACaptionAppearanceDomainDefault
 *    The system defaults which will not change during a user session. These settings should be used for comparison, not to render captions. For example, when rendering a glyph some caption render engines need to get the user-defined font and the system-defined font to determeine the final pixel size to render a glyph. Most render engines will never need to use this domain.
 */
@Generated
public final class MACaptionAppearanceDomain {
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    @Generated @NInt public static final long User = 0x0000000000000001L;

    @Generated
    private MACaptionAppearanceDomain() {
    }
}
