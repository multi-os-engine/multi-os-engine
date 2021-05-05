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

package apple.iad.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ADAdType
 * 
 * [@const] ADAdTypeBanner A device-width banner ad. The banner height varies with
 * device type and orientation:
 * 
 *   • On iPhone; portrait = DEVICE_WIDTH × 50px, landscape = DEVICE_WIDTH × 32px
 *   • On iPad; both portrait & landscape = DEVICE_WIDTH × 66px
 * 
 * [@const] ADAdTypeMediumRectangle An 320 × 250px ad, based on the International
 * Advertising Bureau's "Medium Rectangle" Interactive Marketing Unit.
 * 
 * Ad types that can be passed to -[ADBannerView -initWithAdType:].
 */
@Generated
public final class ADAdType {
    @Generated @NInt public static final long Banner = 0x0000000000000000L;
    @Generated @NInt public static final long MediumRectangle = 0x0000000000000001L;

    @Generated
    private ADAdType() {
    }
}
