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
import apple.coreaudio.struct.AudioStreamBasicDescription;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioFormat extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioFormat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioFormat alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("channelCount")
    public native int channelCount();

    @Generated
    @Selector("channelLayout")
    public native AVAudioChannelLayout channelLayout();

    @Generated
    @Selector("commonFormat")
    @NUInt
    public native long commonFormat();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("formatDescription")
    public native CMFormatDescriptionRef formatDescription();

    @Generated
    @Selector("init")
    public native AVAudioFormat init();

    @Generated
    @Selector("initStandardFormatWithSampleRate:channelLayout:")
    public native AVAudioFormat initStandardFormatWithSampleRateChannelLayout(double sampleRate,
            AVAudioChannelLayout layout);

    @Generated
    @Selector("initStandardFormatWithSampleRate:channels:")
    public native AVAudioFormat initStandardFormatWithSampleRateChannels(double sampleRate, int channels);

    @Generated
    @Selector("initWithCMAudioFormatDescription:")
    public native AVAudioFormat initWithCMAudioFormatDescription(CMFormatDescriptionRef formatDescription);

    @Generated
    @Selector("initWithCoder:")
    public native AVAudioFormat initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCommonFormat:sampleRate:channels:interleaved:")
    public native AVAudioFormat initWithCommonFormatSampleRateChannelsInterleaved(@NUInt long format, double sampleRate,
            int channels, boolean interleaved);

    @Generated
    @Selector("initWithCommonFormat:sampleRate:interleaved:channelLayout:")
    public native AVAudioFormat initWithCommonFormatSampleRateInterleavedChannelLayout(@NUInt long format,
            double sampleRate, boolean interleaved, AVAudioChannelLayout layout);

    @Generated
    @Selector("initWithSettings:")
    public native AVAudioFormat initWithSettings(NSDictionary<String, ?> settings);

    @Generated
    @Selector("initWithStreamDescription:")
    public native AVAudioFormat initWithStreamDescription(AudioStreamBasicDescription asbd);

    @Generated
    @Selector("initWithStreamDescription:channelLayout:")
    public native AVAudioFormat initWithStreamDescriptionChannelLayout(AudioStreamBasicDescription asbd,
            AVAudioChannelLayout layout);

    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("isInterleaved")
    public native boolean isInterleaved();

    @Generated
    @Selector("isStandard")
    public native boolean isStandard();

    @Generated
    @Selector("magicCookie")
    public native NSData magicCookie();

    @Generated
    @Selector("sampleRate")
    public native double sampleRate();

    @Generated
    @Selector("setMagicCookie:")
    public native void setMagicCookie(NSData value);

    @Generated
    @Selector("settings")
    public native NSDictionary<String, ?> settings();

    @Generated
    @Selector("streamDescription")
    public native AudioStreamBasicDescription streamDescription();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
