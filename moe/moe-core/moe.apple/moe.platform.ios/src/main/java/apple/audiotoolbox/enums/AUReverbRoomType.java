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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum	Reverb Room Types
 * @discussion Used to specify room type (as identified by a factory preset number) on Apple audio 
 * 			units that use internal reverb.
 */
@Generated
public final class AUReverbRoomType {
    @Generated public static final int SmallRoom = 0x00000000;
    @Generated public static final int MediumRoom = 0x00000001;
    @Generated public static final int LargeRoom = 0x00000002;
    @Generated public static final int MediumHall = 0x00000003;
    @Generated public static final int LargeHall = 0x00000004;
    @Generated public static final int Plate = 0x00000005;
    @Generated public static final int MediumChamber = 0x00000006;
    @Generated public static final int LargeChamber = 0x00000007;
    @Generated public static final int Cathedral = 0x00000008;
    @Generated public static final int LargeRoom2 = 0x00000009;
    @Generated public static final int MediumHall2 = 0x0000000A;
    @Generated public static final int MediumHall3 = 0x0000000B;
    @Generated public static final int LargeHall2 = 0x0000000C;

    @Generated
    private AUReverbRoomType() {
    }
}
