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
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AUHostTransportStateFlags
 * 
 * Flags describing the host's transport state.
 * [@constant] AUHostTransportStateChanged
 * True if, since the callback was last called, there was a change to the state of, or
 * discontinuities in, the host's transport. Can indicate such state changes as
 * start/stop, or seeking to another position in the timeline.
 * [@constant] AUHostTransportStateMoving
 * True if the transport is moving.
 * [@constant] AUHostTransportStateRecording
 * True if the host is recording, or prepared to record. Can be true with or without the
 * transport moving.
 * [@constant] AUHostTransportStateCycling
 * True if the host is cycling or looping.
 */
@Generated
public final class AUHostTransportStateFlags {
    @Generated @NUInt public static final long Changed = 0x0000000000000001L;
    @Generated @NUInt public static final long Moving = 0x0000000000000002L;
    @Generated @NUInt public static final long Recording = 0x0000000000000004L;
    @Generated @NUInt public static final long Cycling = 0x0000000000000008L;

    @Generated
    private AUHostTransportStateFlags() {
    }
}
