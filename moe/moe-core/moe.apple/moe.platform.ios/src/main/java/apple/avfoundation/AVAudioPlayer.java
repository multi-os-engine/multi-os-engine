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
import apple.avfoundation.protocol.AVAudioPlayerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
public class AVAudioPlayer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioPlayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioPlayer alloc();

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
     * averagePowerForChannel:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/averagePowerForChannel:">iOS Dev Center</a>
     */
    @Generated
    @Selector("averagePowerForChannel:")
    public native float averagePowerForChannel(@NUInt long channelNumber);

    /**
     * channelAssignments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/channelAssignments">iOS Dev Center</a>
     */
    @Generated
    @Selector("channelAssignments")
    public native NSArray<? extends NSNumber> channelAssignments();

    /**
     * currentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/currentTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentTime")
    public native double currentTime();

    /**
     * data</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/data">iOS Dev Center</a>
     */
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAudioPlayerDelegate delegate();

    /**
     * deviceCurrentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/deviceCurrentTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("deviceCurrentTime")
    public native double deviceCurrentTime();

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * enableRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/enableRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("enableRate")
    public native boolean enableRate();

    @Generated
    @Selector("init")
    public native AVAudioPlayer init();

    /**
     * initWithContentsOfURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/initWithContentsOfURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:error:")
    public native AVAudioPlayer initWithContentsOfURLError(NSURL url, Ptr<NSError> outError);

    /**
     * initWithContentsOfURL:fileTypeHint:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/initWithContentsOfURL:fileTypeHint:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:fileTypeHint:error:")
    public native AVAudioPlayer initWithContentsOfURLFileTypeHintError(NSURL url, String utiString,
            Ptr<NSError> outError);

    /**
     * initWithData:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/initWithData:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithData:error:")
    public native AVAudioPlayer initWithDataError(NSData data, Ptr<NSError> outError);

    /**
     * initWithData:fileTypeHint:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/initWithData:fileTypeHint:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithData:fileTypeHint:error:")
    public native AVAudioPlayer initWithDataFileTypeHintError(NSData data, String utiString, Ptr<NSError> outError);

    /**
     * meteringEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/meteringEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isMeteringEnabled")
    public native boolean isMeteringEnabled();

    /**
     * meteringEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/meteringEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMeteringEnabled:")
    public native void setMeteringEnabled(boolean value);

    /**
     * playing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/playing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    /**
     * numberOfChannels</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/numberOfChannels">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfChannels")
    @NUInt
    public native long numberOfChannels();

    /**
     * numberOfLoops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/numberOfLoops">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfLoops")
    @NInt
    public native long numberOfLoops();

    /**
     * pan</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/pan">iOS Dev Center</a>
     */
    @Generated
    @Selector("pan")
    public native float pan();

    /**
     * pause</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/pause">iOS Dev Center</a>
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * peakPowerForChannel:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/peakPowerForChannel:">iOS Dev Center</a>
     */
    @Generated
    @Selector("peakPowerForChannel:")
    public native float peakPowerForChannel(@NUInt long channelNumber);

    /**
     * play</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/play">iOS Dev Center</a>
     */
    @Generated
    @Selector("play")
    public native boolean play();

    /**
     * playAtTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/playAtTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("playAtTime:")
    public native boolean playAtTime(double time);

    /**
     * prepareToPlay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/prepareToPlay">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareToPlay")
    public native boolean prepareToPlay();

    /**
     * rate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/rate">iOS Dev Center</a>
     */
    @Generated
    @Selector("rate")
    public native float rate();

    /**
     * channelAssignments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/channelAssignments">iOS Dev Center</a>
     */
    @Generated
    @Selector("setChannelAssignments:")
    public native void setChannelAssignments(NSArray<? extends NSNumber> value);

    /**
     * currentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/currentTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrentTime:")
    public native void setCurrentTime(double value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVAudioPlayerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVAudioPlayerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * enableRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/enableRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEnableRate:")
    public native void setEnableRate(boolean value);

    /**
     * numberOfLoops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/numberOfLoops">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNumberOfLoops:")
    public native void setNumberOfLoops(@NInt long value);

    /**
     * pan</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/pan">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPan:")
    public native void setPan(float value);

    /**
     * rate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/rate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    /**
     * volume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/volume">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * settings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/settings">iOS Dev Center</a>
     */
    @Generated
    @Selector("settings")
    public native NSDictionary<String, ?> settings();

    /**
     * stop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/stop">iOS Dev Center</a>
     */
    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * updateMeters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instm/AVAudioPlayer/updateMeters">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateMeters")
    public native void updateMeters();

    /**
     * url</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/url">iOS Dev Center</a>
     */
    @Generated
    @Selector("url")
    public native NSURL url();

    /**
     * volume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerClassReference/index.html#//apple_ref/occ/instp/AVAudioPlayer/volume">iOS Dev Center</a>
     */
    @Generated
    @Selector("volume")
    public native float volume();
}
