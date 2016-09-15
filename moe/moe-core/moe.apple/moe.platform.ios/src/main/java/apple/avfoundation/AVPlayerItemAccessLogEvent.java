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

    /**
     * URI</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/URI">iOS Dev Center</a>
     */
    @Generated
    @Selector("URI")
    public native String URI();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemAccessLogEvent alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * downloadOverdue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/downloadOverdue">iOS Dev Center</a>
     */
    @Generated
    @Selector("downloadOverdue")
    @NInt
    public native long downloadOverdue();

    /**
     * durationWatched</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/durationWatched">iOS Dev Center</a>
     */
    @Generated
    @Selector("durationWatched")
    public native double durationWatched();

    /**
     * indicatedBitrate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/indicatedBitrate">iOS Dev Center</a>
     */
    @Generated
    @Selector("indicatedBitrate")
    public native double indicatedBitrate();

    @Generated
    @Selector("init")
    public native AVPlayerItemAccessLogEvent init();

    /**
     * mediaRequestsWWAN</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/mediaRequestsWWAN">iOS Dev Center</a>
     */
    @Generated
    @Selector("mediaRequestsWWAN")
    @NInt
    public native long mediaRequestsWWAN();

    /**
     * numberOfBytesTransferred</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/numberOfBytesTransferred">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfBytesTransferred")
    public native long numberOfBytesTransferred();

    /**
     * numberOfDroppedVideoFrames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/numberOfDroppedVideoFrames">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfDroppedVideoFrames")
    @NInt
    public native long numberOfDroppedVideoFrames();

    /**
     * numberOfMediaRequests</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/numberOfMediaRequests">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfMediaRequests")
    @NInt
    public native long numberOfMediaRequests();

    /**
     * numberOfSegmentsDownloaded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/numberOfSegmentsDownloaded">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("numberOfSegmentsDownloaded")
    @NInt
    public native long numberOfSegmentsDownloaded();

    /**
     * numberOfServerAddressChanges</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/numberOfServerAddressChanges">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfServerAddressChanges")
    @NInt
    public native long numberOfServerAddressChanges();

    /**
     * numberOfStalls</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/numberOfStalls">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfStalls")
    @NInt
    public native long numberOfStalls();

    /**
     * observedBitrate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/observedBitrate">iOS Dev Center</a>
     */
    @Generated
    @Selector("observedBitrate")
    public native double observedBitrate();

    /**
     * observedBitrateStandardDeviation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/observedBitrateStandardDeviation">iOS Dev Center</a>
     */
    @Generated
    @Selector("observedBitrateStandardDeviation")
    public native double observedBitrateStandardDeviation();

    /**
     * observedMaxBitrate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/observedMaxBitrate">iOS Dev Center</a>
     */
    @Generated
    @Selector("observedMaxBitrate")
    public native double observedMaxBitrate();

    /**
     * observedMinBitrate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/observedMinBitrate">iOS Dev Center</a>
     */
    @Generated
    @Selector("observedMinBitrate")
    public native double observedMinBitrate();

    /**
     * playbackSessionID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/playbackSessionID">iOS Dev Center</a>
     */
    @Generated
    @Selector("playbackSessionID")
    public native String playbackSessionID();

    /**
     * playbackStartDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/playbackStartDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("playbackStartDate")
    public native NSDate playbackStartDate();

    /**
     * playbackStartOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/playbackStartOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("playbackStartOffset")
    public native double playbackStartOffset();

    /**
     * playbackType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/playbackType">iOS Dev Center</a>
     */
    @Generated
    @Selector("playbackType")
    public native String playbackType();

    /**
     * segmentsDownloadedDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/segmentsDownloadedDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("segmentsDownloadedDuration")
    public native double segmentsDownloadedDuration();

    /**
     * serverAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/serverAddress">iOS Dev Center</a>
     */
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * startupTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/startupTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("startupTime")
    public native double startupTime();

    /**
     * switchBitrate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/switchBitrate">iOS Dev Center</a>
     */
    @Generated
    @Selector("switchBitrate")
    public native double switchBitrate();

    /**
     * transferDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemAccessLogEvent_Class/index.html#//apple_ref/occ/instp/AVPlayerItemAccessLogEvent/transferDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("transferDuration")
    public native double transferDuration();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();
}
