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
import apple.coreaudio.struct.AudioTimeStamp;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
public class AVAudioTime extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioTime(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioTime alloc();

    /**
     * hostTimeForSeconds:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/clm/AVAudioTime/hostTimeForSeconds:">iOS Dev Center</a>
     */
    @Generated
    @Selector("hostTimeForSeconds:")
    public static native long hostTimeForSeconds(double seconds);

    /**
     * secondsForHostTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/clm/AVAudioTime/secondsForHostTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("secondsForHostTime:")
    public static native double secondsForHostTime(long hostTime);

    /**
     * timeWithAudioTimeStamp:sampleRate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/clm/AVAudioTime/timeWithAudioTimeStamp:sampleRate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeWithAudioTimeStamp:sampleRate:")
    public static native AVAudioTime timeWithAudioTimeStampSampleRate(AudioTimeStamp ts, double sampleRate);

    /**
     * timeWithHostTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/clm/AVAudioTime/timeWithHostTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeWithHostTime:")
    public static native AVAudioTime timeWithHostTime(long hostTime);

    /**
     * timeWithHostTime:sampleTime:atRate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/clm/AVAudioTime/timeWithHostTime:sampleTime:atRate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeWithHostTime:sampleTime:atRate:")
    public static native AVAudioTime timeWithHostTimeSampleTimeAtRate(long hostTime, long sampleTime,
            double sampleRate);

    /**
     * timeWithSampleTime:atRate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/clm/AVAudioTime/timeWithSampleTime:atRate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeWithSampleTime:atRate:")
    public static native AVAudioTime timeWithSampleTimeAtRate(long sampleTime, double sampleRate);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * audioTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instp/AVAudioTime/audioTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("audioTimeStamp")
    @ByValue
    public native AudioTimeStamp audioTimeStamp();

    /**
     * extrapolateTimeFromAnchor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instm/AVAudioTime/extrapolateTimeFromAnchor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("extrapolateTimeFromAnchor:")
    public native AVAudioTime extrapolateTimeFromAnchor(AVAudioTime anchorTime);

    /**
     * hostTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instp/AVAudioTime/hostTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("hostTime")
    public native long hostTime();

    @Generated
    @Selector("init")
    public native AVAudioTime init();

    /**
     * initWithAudioTimeStamp:sampleRate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instm/AVAudioTime/initWithAudioTimeStamp:sampleRate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAudioTimeStamp:sampleRate:")
    public native AVAudioTime initWithAudioTimeStampSampleRate(AudioTimeStamp ts, double sampleRate);

    /**
     * initWithHostTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instm/AVAudioTime/initWithHostTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithHostTime:")
    public native AVAudioTime initWithHostTime(long hostTime);

    /**
     * initWithHostTime:sampleTime:atRate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instm/AVAudioTime/initWithHostTime:sampleTime:atRate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithHostTime:sampleTime:atRate:")
    public native AVAudioTime initWithHostTimeSampleTimeAtRate(long hostTime, long sampleTime, double sampleRate);

    /**
     * initWithSampleTime:atRate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instm/AVAudioTime/initWithSampleTime:atRate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSampleTime:atRate:")
    public native AVAudioTime initWithSampleTimeAtRate(long sampleTime, double sampleRate);

    /**
     * hostTimeValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instp/AVAudioTime/hostTimeValid">iOS Dev Center</a>
     */
    @Generated
    @Selector("isHostTimeValid")
    public native boolean isHostTimeValid();

    /**
     * sampleTimeValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instp/AVAudioTime/sampleTimeValid">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSampleTimeValid")
    public native boolean isSampleTimeValid();

    /**
     * sampleRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instp/AVAudioTime/sampleRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleRate")
    public native double sampleRate();

    /**
     * sampleTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioTime_Class/index.html#//apple_ref/occ/instp/AVAudioTime/sampleTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleTime")
    public native long sampleTime();
}
