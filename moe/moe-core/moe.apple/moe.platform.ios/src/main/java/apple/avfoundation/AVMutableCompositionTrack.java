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
import apple.coregraphics.struct.CGAffineTransform;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
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
import org.moe.natj.general.ptr.Ptr;
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
public class AVMutableCompositionTrack extends AVCompositionTrack {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableCompositionTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableCompositionTrack alloc();

    /**
     * extendedLanguageTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/extendedLanguageTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    @Generated
    @Selector("init")
    public native AVMutableCompositionTrack init();

    /**
     * insertEmptyTimeRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instm/AVMutableCompositionTrack/insertEmptyTimeRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * insertTimeRange:ofTrack:atTime:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instm/AVMutableCompositionTrack/insertTimeRange:ofTrack:atTime:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertTimeRange:ofTrack:atTime:error:")
    public native boolean insertTimeRangeOfTrackAtTimeError(@ByValue CMTimeRange timeRange, AVAssetTrack track,
            @ByValue CMTime startTime, Ptr<NSError> outError);

    /**
     * insertTimeRanges:ofTracks:atTime:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instm/AVMutableCompositionTrack/insertTimeRanges:ofTracks:atTime:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertTimeRanges:ofTracks:atTime:error:")
    public native boolean insertTimeRangesOfTracksAtTimeError(NSArray<? extends NSValue> timeRanges,
            NSArray<? extends AVAssetTrack> tracks, @ByValue CMTime startTime, Ptr<NSError> outError);

    /**
     * languageCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/languageCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    /**
     * naturalTimeScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/naturalTimeScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("naturalTimeScale")
    public native int naturalTimeScale();

    /**
     * preferredTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/preferredTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * preferredVolume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/preferredVolume">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * removeTimeRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instm/AVMutableCompositionTrack/removeTimeRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeTimeRange:")
    public native void removeTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * scaleTimeRange:toDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instm/AVMutableCompositionTrack/scaleTimeRange:toDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleTimeRange:toDuration:")
    public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange, @ByValue CMTime duration);

    /**
     * segments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/segments">iOS Dev Center</a>
     */
    @Generated
    @Selector("segments")
    public native NSArray<? extends AVCompositionTrackSegment> segments();

    /**
     * extendedLanguageTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/extendedLanguageTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    /**
     * languageCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/languageCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

    /**
     * naturalTimeScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/naturalTimeScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNaturalTimeScale:")
    public native void setNaturalTimeScale(int value);

    /**
     * preferredTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/preferredTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredTransform:")
    public native void setPreferredTransform(@ByValue CGAffineTransform value);

    /**
     * preferredVolume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/preferredVolume">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    /**
     * segments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instp/AVMutableCompositionTrack/segments">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSegments:")
    public native void setSegments(NSArray<? extends AVCompositionTrackSegment> value);

    /**
     * validateTrackSegments:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableCompositionTrack_Class/index.html#//apple_ref/occ/instm/AVMutableCompositionTrack/validateTrackSegments:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("validateTrackSegments:error:")
    public native boolean validateTrackSegmentsError(NSArray<? extends AVCompositionTrackSegment> trackSegments,
            Ptr<NSError> outError);

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
    public static native void load_objc_static();

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
}
