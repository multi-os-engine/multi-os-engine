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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Values for AVAudioSessionRouteChangeReasonKey in AVAudioSessionRouteChangeNotification's
 * userInfo dictionary
 */
@Generated
public final class AVAudioSessionRouteChangeReason {
    /**
     * The reason is unknown.
     */
    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * A new device became available (e.g. headphones have been plugged in).
     */
    @Generated @NUInt public static final long NewDeviceAvailable = 0x0000000000000001L;
    /**
     * The old device became unavailable (e.g. headphones have been unplugged).
     */
    @Generated @NUInt public static final long OldDeviceUnavailable = 0x0000000000000002L;
    /**
     * The audio category has changed (e.g. AVAudioSessionCategoryPlayback has been changed to
     * AVAudioSessionCategoryPlayAndRecord).
     */
    @Generated @NUInt public static final long CategoryChange = 0x0000000000000003L;
    /**
     * The route has been overridden (e.g. category is AVAudioSessionCategoryPlayAndRecord and
     * the output has been changed from the receiver, which is the default, to the speaker).
     */
    @Generated @NUInt public static final long Override = 0x0000000000000004L;
    /**
     * The device woke from sleep.
     */
    @Generated @NUInt public static final long WakeFromSleep = 0x0000000000000006L;
    /**
     * Returned when there is no route for the current category (for instance, the category is
     * AVAudioSessionCategoryRecord but no input device is available).
     */
    @Generated @NUInt public static final long NoSuitableRouteForCategory = 0x0000000000000007L;
    /**
     * Indicates that the set of input and/our output ports has not changed, but some aspect of
     * their configuration has changed.  For example, a port's selected data source has changed.
     * (Introduced in iOS 7.0, watchOS 2.0, tvOS 9.0).
     */
    @Generated @NUInt public static final long RouteConfigurationChange = 0x0000000000000008L;

    @Generated
    private AVAudioSessionRouteChangeReason() {
    }
}
