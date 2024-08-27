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

package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVPlayerItemAccessLogEvent
 * 
 * An AVPlayerItemAccessLogEvent represents a single log entry.
 * 
 * An AVPlayerItemAccessLogEvent provides named properties for accessing the data
 * fields of each log event. None of the properties of this class are observable.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 4.3
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemAccessLogEvent extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemAccessLogEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemAccessLogEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerItemAccessLogEvent allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerItemAccessLogEvent new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] URI
     * 
     * The URI of the playback item. Can be nil.
     * 
     * If nil is returned the URI is unknown. Corresponds to "uri".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("URI")
    public native String URI();

    /**
     * [@property] averageAudioBitrate
     * 
     * The average bitrate of audio track. This is not available if audio is muxed with video. Measured in bits per
     * second.
     * 
     * Value is negative if unknown. Corresponds to "c-avg-audio-bitrate".
     * This property is not observable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("averageAudioBitrate")
    public native double averageAudioBitrate();

    /**
     * [@property] averageVideoBitrate
     * 
     * The average bitrate of video track if it is unmuxed. Average bitrate of combined content if muxed. Measured in
     * bits per second.
     * 
     * Value is negative if unknown. Corresponds to "c-avg-video-bitrate".
     * This property is not observable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("averageVideoBitrate")
    public native double averageVideoBitrate();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] downloadOverdue
     * 
     * The total number of times the download of the segments took too long.
     * 
     * Value is negative if unknown. Corresponds to "c-overdue".
     * This property is not observable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("downloadOverdue")
    @NInt
    public native long downloadOverdue();

    /**
     * [@property] durationWatched
     * 
     * The accumulated duration of the media played. Measured in seconds.
     * 
     * Value is negative if unknown. Corresponds to "c-duration-watched".
     * This property is not observable.
     */
    @Generated
    @Selector("durationWatched")
    public native double durationWatched();

    /**
     * [@property] indicatedAverageBitrate
     * 
     * Average throughput required to play the stream, as advertised by the server. Measured in bits per second.
     * 
     * Value is negative if unknown. Corresponds to "sc-indicated-avg-bitrate".
     * This property is not observable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("indicatedAverageBitrate")
    public native double indicatedAverageBitrate();

    /**
     * [@property] indicatedBitrate
     * 
     * The throughput required to play the stream, as advertised by the server. Measured in bits per second.
     * 
     * Value is negative if unknown. Corresponds to "sc-indicated-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("indicatedBitrate")
    public native double indicatedBitrate();

    @Generated
    @Selector("init")
    public native AVPlayerItemAccessLogEvent init();

    /**
     * [@property] mediaRequestsWWAN
     * 
     * Number of network read requests over WWAN.
     * 
     * Value is negative if unknown. Corresponds to "sc-wwan-count".
     * This property is not observable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("mediaRequestsWWAN")
    @NInt
    public native long mediaRequestsWWAN();

    /**
     * [@property] numberOfBytesTransferred
     * 
     * The accumulated number of bytes transferred.
     * 
     * Value is negative if unknown. Corresponds to "bytes".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfBytesTransferred")
    public native long numberOfBytesTransferred();

    /**
     * [@property] numberOfDroppedVideoFrames
     * 
     * The total number of dropped video frames.
     * 
     * Value is negative if unknown. Corresponds to "c-frames-dropped".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfDroppedVideoFrames")
    @NInt
    public native long numberOfDroppedVideoFrames();

    /**
     * [@property] numberOfMediaRequests
     * 
     * A count of media read requests.
     * 
     * Value is negative if unknown. A count of media read requests from the server to this client. Corresponds to
     * "sc-count".
     * For HTTP live Streaming, a count of media segments downloaded from the server to this client.
     * For progressive-style HTTP media downloads, a count of HTTP GET (byte-range) requests for the resource.
     * This property is not observable.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("numberOfMediaRequests")
    @NInt
    public native long numberOfMediaRequests();

    /**
     * [@property] numberOfSegmentsDownloaded
     * 
     * A count of media segments downloaded.
     * 
     * Value is negative if unknown. A count of media segments downloaded from the server to this client. Corresponds to
     * "sc-count".
     * This property is not observable.
     * This property is deprecated. Use numberOfMediaRequests instead.
     * 
     * API-Since: 4.3
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("numberOfSegmentsDownloaded")
    @NInt
    public native long numberOfSegmentsDownloaded();

    /**
     * [@property] numberOfServerAddressChanges
     * 
     * A count of changes to the property serverAddress, see above, over the last uninterrupted period of playback.
     * 
     * Value is negative if unknown. Corresponds to "s-ip-changes".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfServerAddressChanges")
    @NInt
    public native long numberOfServerAddressChanges();

    /**
     * [@property] numberOfStalls
     * 
     * The total number of playback stalls encountered.
     * 
     * Value is negative if unknown. Corresponds to "c-stalls".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfStalls")
    @NInt
    public native long numberOfStalls();

    /**
     * [@property] observedBitrate
     * 
     * The empirical throughput across all media downloaded. Measured in bits per second.
     * 
     * Value is negative if unknown. Corresponds to "c-observed-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("observedBitrate")
    public native double observedBitrate();

    /**
     * [@property] observedBitrateStandardDeviation
     * 
     * Standard deviation of observed segment download bit rates.
     * 
     * Value is negative if unknown. Corresponds to "c-observed-bitrate-sd".
     * This property is not observable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("observedBitrateStandardDeviation")
    public native double observedBitrateStandardDeviation();

    /**
     * [@property] observedMaxBitrate
     * 
     * Maximum observed segment download bit rate.
     * 
     * Value is negative if unknown. Corresponds to "c-observed-max-bitrate".
     * This property is not observable.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use observedBitrateStandardDeviation to monitor variance in network bitrate.
     */
    @Deprecated
    @Generated
    @Selector("observedMaxBitrate")
    public native double observedMaxBitrate();

    /**
     * [@property] observedMinBitrate
     * 
     * Minimum observed segment download bit rate.
     * 
     * Value is negative if unknown. Corresponds to "c-observed-min-bitrate".
     * This property is not observable.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use observedBitrateStandardDeviation to monitor variance in network bitrate.
     */
    @Deprecated
    @Generated
    @Selector("observedMinBitrate")
    public native double observedMinBitrate();

    /**
     * [@property] playbackSessionID
     * 
     * A GUID that identifies the playback session. This value is used in HTTP requests. Can be nil.
     * 
     * If nil is returned the GUID is unknown. Corresponds to "cs-guid".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("playbackSessionID")
    public native String playbackSessionID();

    /**
     * [@property] playbackStartDate
     * 
     * The date/time at which playback began for this event. Can be nil.
     * 
     * If nil is returned the date is unknown. Corresponds to "date".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("playbackStartDate")
    public native NSDate playbackStartDate();

    /**
     * [@property] playbackStartOffset
     * 
     * An offset into the playlist where the last uninterrupted period of playback began. Measured in seconds.
     * 
     * Value is negative if unknown. Corresponds to "c-start-time".
     * This property is not observable.
     */
    @Generated
    @Selector("playbackStartOffset")
    public native double playbackStartOffset();

    /**
     * [@property] playbackType
     * 
     * Playback type (LIVE, VOD, FILE).
     * 
     * If nil is returned the playback type is unknown. Corresponds to "s-playback-type".
     * This property is not observable.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("playbackType")
    public native String playbackType();

    /**
     * [@property] segmentsDownloadedDuration
     * 
     * The accumulated duration of the media downloaded. Measured in seconds.
     * 
     * Value is negative if unknown. Corresponds to "c-duration-downloaded".
     * This property is not observable.
     */
    @Generated
    @Selector("segmentsDownloadedDuration")
    public native double segmentsDownloadedDuration();

    /**
     * [@property] serverAddress
     * 
     * The IP address of the server that was the source of the last delivered media segment. Can be nil.
     * 
     * If nil is returned the address is unknown. Can be either an IPv4 or IPv6 address. Corresponds to "s-ip".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * [@property] startupTime
     * 
     * The accumulated duration until player item is ready to play. Measured in seconds.
     * 
     * Value is negative if unknown. Corresponds to "c-startup-time".
     * This property is not observable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("startupTime")
    public native double startupTime();

    /**
     * [@property] switchBitrate
     * 
     * Bandwidth that caused us to switch (up or down).
     * 
     * Value is negative if unknown. Corresponds to "c-switch-bitrate".
     * This property is not observable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("switchBitrate")
    public native double switchBitrate();

    /**
     * [@property] transferDuration
     * 
     * The accumulated duration of active network transfer of bytes. Measured in seconds.
     * 
     * Value is negative if unknown. Corresponds to "c-transfer-duration".
     * This property is not observable.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("transferDuration")
    public native double transferDuration();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
