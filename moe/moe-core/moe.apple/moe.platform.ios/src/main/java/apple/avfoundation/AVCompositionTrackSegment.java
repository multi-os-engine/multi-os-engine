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
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class AVCompositionTrackSegment extends AVAssetTrackSegment {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCompositionTrackSegment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCompositionTrackSegment alloc();

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

    /**
     * @method			compositionTrackSegmentWithTimeRange:
     * @abstract		Returns an instance of AVCompositionTrackSegment that presents an empty track segment.
     * @param			timeRange
     * 				The timeRange of the empty AVCompositionTrackSegment.
     * @result			An instance of AVCompositionTrackSegment.
     */
    @Generated
    @Selector("compositionTrackSegmentWithTimeRange:")
    public static native AVCompositionTrackSegment compositionTrackSegmentWithTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * @method			compositionTrackSegmentWithURL:trackID:sourceTimeRange:targetTimeRange:
     * @abstract		Returns an instance of AVCompositionTrackSegment that presents a portion of a file referenced by URL.
     * @param			URL
     * 				An instance of NSURL that references the container file to be presented by the AVCompositionTrackSegment.
     * @param			trackID
     * 				The track identifier that specifies the track of the container file to be presented by the AVCompositionTrackSegment.
     * @param			sourceTimeRange
     * 				The timeRange of the track of the container file to be presented by the AVCompositionTrackSegment.
     * @param			targetTimeRange
     * 				The timeRange of the composition track during which the AVCompositionTrackSegment is to be presented.
     * @result			An instance of AVCompositionTrackSegment.
     * @discussion		To specify that the segment be played at the asset's normal rate, set source.duration == target.duration in the timeMapping.
     * 				Otherwise, the segment will be played at a rate equal to the ratio source.duration / target.duration.
     */
    @Generated
    @Selector("compositionTrackSegmentWithURL:trackID:sourceTimeRange:targetTimeRange:")
    public static native AVCompositionTrackSegment compositionTrackSegmentWithURLTrackIDSourceTimeRangeTargetTimeRange(
            NSURL URL, int trackID, @ByValue CMTimeRange sourceTimeRange, @ByValue CMTimeRange targetTimeRange);

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

    @Generated
    @Selector("init")
    public native AVCompositionTrackSegment init();

    /**
     * @method			initWithTimeRange:
     * @abstract		Initializes an instance of AVCompositionTrackSegment that presents an empty track segment.
     * @param			timeRange
     * 				The timeRange of the empty AVCompositionTrackSegment.
     * @result			An instance of AVCompositionTrackSegment.
     */
    @Generated
    @Selector("initWithTimeRange:")
    public native AVCompositionTrackSegment initWithTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * @method			initWithURL:trackID:sourceTimeRange:targetTimeRange:
     * @abstract		Initializes an instance of AVCompositionTrackSegment that presents a portion of a file referenced by URL.
     * @param			URL
     * 				An instance of NSURL that references the container file to be presented by the AVCompositionTrackSegment.
     * @param			trackID
     * 				The track identifier that specifies the track of the container file to be presented by the AVCompositionTrackSegment.
     * @param			sourceTimeRange
     * 				The timeRange of the track of the container file to be presented by the AVCompositionTrackSegment.
     * @param			targetTimeRange
     * 				The timeRange of the composition track during which the AVCompositionTrackSegment is to be presented.
     * @result			An instance of AVCompositionTrackSegment.
     * @discussion		To specify that the segment be played at the asset's normal rate, set source.duration == target.duration in the timeMapping.
     * 				Otherwise, the segment will be played at a rate equal to the ratio source.duration / target.duration.
     */
    @Generated
    @Selector("initWithURL:trackID:sourceTimeRange:targetTimeRange:")
    public native AVCompositionTrackSegment initWithURLTrackIDSourceTimeRangeTargetTimeRange(NSURL URL, int trackID,
            @ByValue CMTimeRange sourceTimeRange, @ByValue CMTimeRange targetTimeRange);

    /**
     * indicates whether the AVCompositionTrackSegment is an empty segment;
     * an empty segment has a valid target time range but nil sourceURL and kCMTimeInvalid source start time; all other fields are undefined 
     */
    @Generated
    @Selector("isEmpty")
    public native boolean isEmpty();

    /**
     * indicates the track of the container file of the media presented by the AVCompositionTrackSegment
     */
    @Generated
    @Selector("sourceTrackID")
    public native int sourceTrackID();

    /**
     * indicates the container file of the media presented by the AVCompositionTrackSegment
     */
    @Generated
    @Selector("sourceURL")
    public native NSURL sourceURL();
}
