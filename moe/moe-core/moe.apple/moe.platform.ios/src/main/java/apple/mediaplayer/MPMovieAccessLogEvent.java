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

package apple.mediaplayer;

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
 * -----------------------------------------------------------------------------
 * An MPMovieAccessLogEvent repesents a single access log entry.
 */
@Deprecated
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMovieAccessLogEvent extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMovieAccessLogEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMovieAccessLogEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMovieAccessLogEvent allocWithZone(VoidPtr zone);

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
    public static native MPMovieAccessLogEvent new_objc();

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
     * The URI of the playback item.
     */
    @Deprecated
    @Generated
    @Selector("URI")
    public native String URI();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The accumulated duration of the media played, in seconds.
     */
    @Deprecated
    @Generated
    @Selector("durationWatched")
    public native double durationWatched();

    /**
     * The throughput required to play the stream, as advertised by the server, in bits per second.
     */
    @Deprecated
    @Generated
    @Selector("indicatedBitrate")
    public native double indicatedBitrate();

    @Generated
    @Selector("init")
    public native MPMovieAccessLogEvent init();

    /**
     * The accumulated number of bytes transferred. The value is negative if unknown.
     */
    @Deprecated
    @Generated
    @Selector("numberOfBytesTransferred")
    public native long numberOfBytesTransferred();

    /**
     * The total number of dropped video frames.
     */
    @Deprecated
    @Generated
    @Selector("numberOfDroppedVideoFrames")
    @NInt
    public native long numberOfDroppedVideoFrames();

    /**
     * A count of media segments downloaded from the server to this client.
     */
    @Deprecated
    @Generated
    @Selector("numberOfSegmentsDownloaded")
    @NUInt
    public native long numberOfSegmentsDownloaded();

    /**
     * A count of changes to the serverAddress property over the last uninterrupted period of playback.
     */
    @Deprecated
    @Generated
    @Selector("numberOfServerAddressChanges")
    @NUInt
    public native long numberOfServerAddressChanges();

    /**
     * The total number of playback stalls encountered. The value is negative if unknown.
     */
    @Deprecated
    @Generated
    @Selector("numberOfStalls")
    @NInt
    public native long numberOfStalls();

    /**
     * The empirical throughput across all media downloaded, in bits per second.
     */
    @Deprecated
    @Generated
    @Selector("observedBitrate")
    public native double observedBitrate();

    /**
     * A GUID that identifies the playback session. This value is used in HTTP requests.
     */
    @Deprecated
    @Generated
    @Selector("playbackSessionID")
    public native String playbackSessionID();

    /**
     * The date/time at which playback began for this event.
     */
    @Deprecated
    @Generated
    @Selector("playbackStartDate")
    public native NSDate playbackStartDate();

    /**
     * An offset into the playlist where the last uninterrupted period of playback began, in seconds. The value is negative if unknown.
     */
    @Deprecated
    @Generated
    @Selector("playbackStartOffset")
    public native double playbackStartOffset();

    /**
     * The accumulated duration of the media downloaded, in seconds. The value is negative if unknown.
     */
    @Deprecated
    @Generated
    @Selector("segmentsDownloadedDuration")
    public native double segmentsDownloadedDuration();

    /**
     * The IP address of the server that was the source of the last delivered media segment. Can be either an IPv4 or IPv6 address.
     */
    @Deprecated
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();
}
