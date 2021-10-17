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

/**
 * AVPlayerItemAccessLogEvent
 * <p>
 * An AVPlayerItemAccessLogEvent represents a single log entry.
 * <p>
 * An AVPlayerItemAccessLogEvent provides named properties for accessing the data
 * fields of each log event. None of the properties of this class are observable.
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * [@property]		URI
     * <p>
     * The URI of the playback item. Can be nil.
     * <p>
     * If nil is returned the URI is unknown. Corresponds to "uri".
     * This property is not observable.
     */
    @Generated
    @Selector("URI")
    public native String URI();

    /**
     * [@property]		averageAudioBitrate
     * <p>
     * The average bitrate of audio track. This is not available if audio is muxed with video. Measured in bits per second.
     * <p>
     * Value is negative if unknown. Corresponds to "c-avg-audio-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("averageAudioBitrate")
    public native double averageAudioBitrate();

    /**
     * [@property]		averageVideoBitrate
     * <p>
     * The average bitrate of video track if it is unmuxed. Average bitrate of combined content if muxed. Measured in bits per second.
     * <p>
     * Value is negative if unknown. Corresponds to "c-avg-video-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("averageVideoBitrate")
    public native double averageVideoBitrate();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property]		downloadOverdue
     * <p>
     * The total number of times the download of the segments took too long.
     * <p>
     * Value is negative if unknown. Corresponds to "c-overdue".
     * This property is not observable.
     */
    @Generated
    @Selector("downloadOverdue")
    @NInt
    public native long downloadOverdue();

    /**
     * [@property]		durationWatched
     * <p>
     * The accumulated duration of the media played. Measured in seconds.
     * <p>
     * Value is negative if unknown. Corresponds to "c-duration-watched".
     * This property is not observable.
     */
    @Generated
    @Selector("durationWatched")
    public native double durationWatched();

    /**
     * [@property]		indicatedAverageBitrate
     * <p>
     * Average throughput required to play the stream, as advertised by the server. Measured in bits per second.
     * <p>
     * Value is negative if unknown. Corresponds to "sc-indicated-avg-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("indicatedAverageBitrate")
    public native double indicatedAverageBitrate();

    /**
     * [@property]		indicatedBitrate
     * <p>
     * The throughput required to play the stream, as advertised by the server. Measured in bits per second.
     * <p>
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
     * [@property]		mediaRequestsWWAN
     * <p>
     * Number of network read requests over WWAN.
     * <p>
     * Value is negative if unknown. Corresponds to "sc-wwan-count".
     * This property is not observable.
     */
    @Generated
    @Selector("mediaRequestsWWAN")
    @NInt
    public native long mediaRequestsWWAN();

    /**
     * [@property]		numberOfBytesTransferred
     * <p>
     * The accumulated number of bytes transferred.
     * <p>
     * Value is negative if unknown. Corresponds to "bytes".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfBytesTransferred")
    public native long numberOfBytesTransferred();

    /**
     * [@property]		numberOfDroppedVideoFrames
     * <p>
     * The total number of dropped video frames.
     * <p>
     * Value is negative if unknown. Corresponds to "c-frames-dropped".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfDroppedVideoFrames")
    @NInt
    public native long numberOfDroppedVideoFrames();

    /**
     * [@property]		numberOfMediaRequests
     * <p>
     * A count of media read requests.
     * <p>
     * Value is negative if unknown. A count of media read requests from the server to this client. Corresponds to "sc-count".
     * For HTTP live Streaming, a count of media segments downloaded from the server to this client.
     * For progressive-style HTTP media downloads, a count of HTTP GET (byte-range) requests for the resource.
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfMediaRequests")
    @NInt
    public native long numberOfMediaRequests();

    /**
     * [@property]		numberOfSegmentsDownloaded
     * <p>
     * A count of media segments downloaded.
     * <p>
     * Value is negative if unknown. A count of media segments downloaded from the server to this client. Corresponds to "sc-count".
     * This property is not observable.
     * This property is deprecated. Use numberOfMediaRequests instead.
     */
    @Generated
    @Deprecated
    @Selector("numberOfSegmentsDownloaded")
    @NInt
    public native long numberOfSegmentsDownloaded();

    /**
     * [@property]		numberOfServerAddressChanges
     * <p>
     * A count of changes to the property serverAddress, see above, over the last uninterrupted period of playback.
     * <p>
     * Value is negative if unknown. Corresponds to "s-ip-changes".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfServerAddressChanges")
    @NInt
    public native long numberOfServerAddressChanges();

    /**
     * [@property]		numberOfStalls
     * <p>
     * The total number of playback stalls encountered.
     * <p>
     * Value is negative if unknown. Corresponds to "c-stalls".
     * This property is not observable.
     */
    @Generated
    @Selector("numberOfStalls")
    @NInt
    public native long numberOfStalls();

    /**
     * [@property]		observedBitrate
     * <p>
     * The empirical throughput across all media downloaded. Measured in bits per second.
     * <p>
     * Value is negative if unknown. Corresponds to "c-observed-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("observedBitrate")
    public native double observedBitrate();

    /**
     * [@property]		observedBitrateStandardDeviation
     * <p>
     * Standard deviation of observed segment download bit rates.
     * <p>
     * Value is negative if unknown. Corresponds to "c-observed-bitrate-sd".
     * This property is not observable.
     */
    @Generated
    @Selector("observedBitrateStandardDeviation")
    public native double observedBitrateStandardDeviation();

    /**
     * [@property]		observedMaxBitrate
     * <p>
     * Maximum observed segment download bit rate.
     * <p>
     * Value is negative if unknown. Corresponds to "c-observed-max-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("observedMaxBitrate")
    public native double observedMaxBitrate();

    /**
     * [@property]		observedMinBitrate
     * <p>
     * Minimum observed segment download bit rate.
     * <p>
     * Value is negative if unknown. Corresponds to "c-observed-min-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("observedMinBitrate")
    public native double observedMinBitrate();

    /**
     * [@property]		playbackSessionID
     * <p>
     * A GUID that identifies the playback session. This value is used in HTTP requests. Can be nil.
     * <p>
     * If nil is returned the GUID is unknown. Corresponds to "cs-guid".
     * This property is not observable.
     */
    @Generated
    @Selector("playbackSessionID")
    public native String playbackSessionID();

    /**
     * [@property]		playbackStartDate
     * <p>
     * The date/time at which playback began for this event. Can be nil.
     * <p>
     * If nil is returned the date is unknown. Corresponds to "date".
     * This property is not observable.
     */
    @Generated
    @Selector("playbackStartDate")
    public native NSDate playbackStartDate();

    /**
     * [@property]		playbackStartOffset
     * <p>
     * An offset into the playlist where the last uninterrupted period of playback began. Measured in seconds.
     * <p>
     * Value is negative if unknown. Corresponds to "c-start-time".
     * This property is not observable.
     */
    @Generated
    @Selector("playbackStartOffset")
    public native double playbackStartOffset();

    /**
     * [@property]		playbackType
     * <p>
     * Playback type (LIVE, VOD, FILE).
     * <p>
     * If nil is returned the playback type is unknown. Corresponds to "s-playback-type".
     * This property is not observable.
     */
    @Generated
    @Selector("playbackType")
    public native String playbackType();

    /**
     * [@property]		segmentsDownloadedDuration
     * <p>
     * The accumulated duration of the media downloaded. Measured in seconds.
     * <p>
     * Value is negative if unknown. Corresponds to "c-duration-downloaded".
     * This property is not observable.
     */
    @Generated
    @Selector("segmentsDownloadedDuration")
    public native double segmentsDownloadedDuration();

    /**
     * [@property]		serverAddress
     * <p>
     * The IP address of the server that was the source of the last delivered media segment. Can be nil.
     * <p>
     * If nil is returned the address is unknown. Can be either an IPv4 or IPv6 address. Corresponds to "s-ip".
     * This property is not observable.
     */
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * [@property]		startupTime
     * <p>
     * The accumulated duration until player item is ready to play. Measured in seconds.
     * <p>
     * Value is negative if unknown. Corresponds to "c-startup-time".
     * This property is not observable.
     */
    @Generated
    @Selector("startupTime")
    public native double startupTime();

    /**
     * [@property]		switchBitrate
     * <p>
     * Bandwidth that caused us to switch (up or down).
     * <p>
     * Value is negative if unknown. Corresponds to "c-switch-bitrate".
     * This property is not observable.
     */
    @Generated
    @Selector("switchBitrate")
    public native double switchBitrate();

    /**
     * [@property]		transferDuration
     * <p>
     * The accumulated duration of active network transfer of bytes. Measured in seconds.
     * <p>
     * Value is negative if unknown. Corresponds to "c-transfer-duration".
     * This property is not observable.
     */
    @Generated
    @Selector("transferDuration")
    public native double transferDuration();
}
