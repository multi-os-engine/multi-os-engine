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
import apple.avfoundation.struct.AVBeatRange;
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
public class AVMusicTrack extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMusicTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMusicTrack alloc();

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
    public static native long version();

    @Generated
    @Selector("destinationAudioUnit")
    public native AVAudioUnit destinationAudioUnit();

    @Generated
    @Selector("destinationMIDIEndpoint")
    public native int destinationMIDIEndpoint();

    @Generated
    @Selector("init")
    public native AVMusicTrack init();

    @Generated
    @Selector("isLoopingEnabled")
    public native boolean isLoopingEnabled();

    @Generated
    @Selector("setLoopingEnabled:")
    public native void setLoopingEnabled(boolean value);

    @Generated
    @Selector("isMuted")
    public native boolean isMuted();

    @Generated
    @Selector("setMuted:")
    public native void setMuted(boolean value);

    @Generated
    @Selector("isSoloed")
    public native boolean isSoloed();

    @Generated
    @Selector("setSoloed:")
    public native void setSoloed(boolean value);

    @Generated
    @Selector("lengthInBeats")
    public native double lengthInBeats();

    @Generated
    @Selector("lengthInSeconds")
    public native double lengthInSeconds();

    @Generated
    @Selector("loopRange")
    @ByValue
    public native AVBeatRange loopRange();

    @Generated
    @Selector("numberOfLoops")
    @NInt
    public native long numberOfLoops();

    @Generated
    @Selector("offsetTime")
    public native double offsetTime();

    @Generated
    @Selector("setDestinationAudioUnit:")
    public native void setDestinationAudioUnit(AVAudioUnit value);

    @Generated
    @Selector("setDestinationMIDIEndpoint:")
    public native void setDestinationMIDIEndpoint(int value);

    @Generated
    @Selector("setLengthInBeats:")
    public native void setLengthInBeats(double value);

    @Generated
    @Selector("setLengthInSeconds:")
    public native void setLengthInSeconds(double value);

    @Generated
    @Selector("setLoopRange:")
    public native void setLoopRange(@ByValue AVBeatRange value);

    @Generated
    @Selector("setNumberOfLoops:")
    public native void setNumberOfLoops(@NInt long value);

    @Generated
    @Selector("setOffsetTime:")
    public native void setOffsetTime(double value);

    @Generated
    @Selector("timeResolution")
    @NUInt
    public native long timeResolution();
}
