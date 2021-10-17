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

package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * CMAttitudeReferenceFrame
 * <p>
 * Discussion:
 * CMAttitudeReferenceFrame indicates the reference frame from which all CMAttitude
 * samples are referenced.
 * <p>
 * Definitions of each reference frame is as follows:
 * - CMAttitudeReferenceFrameXArbitraryZVertical describes a reference frame in
 * which the Z axis is vertical and the X axis points in an arbitrary direction
 * in the horizontal plane.
 * - CMAttitudeReferenceFrameXArbitraryCorrectedZVertical describes the same reference
 * frame as CMAttitudeReferenceFrameXArbitraryZVertical with the following exception:
 * when available and calibrated, the magnetometer will be used to correct for accumulated
 * yaw errors. The downside of using this over CMAttitudeReferenceFrameXArbitraryZVertical
 * is increased CPU usage.
 * - CMAttitudeReferenceFrameXMagneticNorthZVertical describes a reference frame
 * in which the Z axis is vertical and the X axis points toward magnetic north.
 * Note that using this reference frame may require device movement to
 * calibrate the magnetometer.
 * - CMAttitudeReferenceFrameXTrueNorthZVertical describes a reference frame in
 * which the Z axis is vertical and the X axis points toward true north.
 * Note that using this reference frame may require device movement to
 * calibrate the magnetometer.
 */
@Generated
public final class CMAttitudeReferenceFrame {
    @Generated @NUInt public static final long ArbitraryZVertical = 0x0000000000000001L;
    @Generated @NUInt public static final long ArbitraryCorrectedZVertical = 0x0000000000000002L;
    @Generated @NUInt public static final long MagneticNorthZVertical = 0x0000000000000004L;
    @Generated @NUInt public static final long TrueNorthZVertical = 0x0000000000000008L;

    @Generated
    private CMAttitudeReferenceFrame() {
    }
}
