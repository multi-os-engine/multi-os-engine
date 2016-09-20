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
    @Owned
    @Selector("alloc")
    public static native AVAudioFormat alloc();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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

    /**
     * channelCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/channelCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("channelCount")
    public native int channelCount();

    /**
     * channelLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/channelLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("channelLayout")
    public native AVAudioChannelLayout channelLayout();

    /**
     * commonFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/commonFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("commonFormat")
    @NUInt
    public native long commonFormat();

    @Generated
    @Selector("init")
    public native AVAudioFormat init();

    /**
     * initStandardFormatWithSampleRate:channelLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/initStandardFormatWithSampleRate:channelLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initStandardFormatWithSampleRate:channelLayout:")
    public native AVAudioFormat initStandardFormatWithSampleRateChannelLayout(double sampleRate,
            AVAudioChannelLayout layout);

    /**
     * initStandardFormatWithSampleRate:channels:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/initStandardFormatWithSampleRate:channels:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initStandardFormatWithSampleRate:channels:")
    public native AVAudioFormat initStandardFormatWithSampleRateChannels(double sampleRate, int channels);

    /**
     * initWithCommonFormat:sampleRate:channels:interleaved:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/initWithCommonFormat:sampleRate:channels:interleaved:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCommonFormat:sampleRate:channels:interleaved:")
    public native AVAudioFormat initWithCommonFormatSampleRateChannelsInterleaved(@NUInt long format, double sampleRate,
            int channels, boolean interleaved);

    /**
     * initWithCommonFormat:sampleRate:interleaved:channelLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/initWithCommonFormat:sampleRate:interleaved:channelLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCommonFormat:sampleRate:interleaved:channelLayout:")
    public native AVAudioFormat initWithCommonFormatSampleRateInterleavedChannelLayout(@NUInt long format,
            double sampleRate, boolean interleaved, AVAudioChannelLayout layout);

    /**
     * initWithSettings:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/initWithSettings:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSettings:")
    public native AVAudioFormat initWithSettings(NSDictionary<String, ?> settings);

    /**
     * initWithStreamDescription:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/initWithStreamDescription:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithStreamDescription:")
    public native AVAudioFormat initWithStreamDescription(AudioStreamBasicDescription asbd);

    /**
     * initWithStreamDescription:channelLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/initWithStreamDescription:channelLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithStreamDescription:channelLayout:")
    public native AVAudioFormat initWithStreamDescriptionChannelLayout(AudioStreamBasicDescription asbd,
            AVAudioChannelLayout layout);

    /**
     * isEqual:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instm/AVAudioFormat/isEqual:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    /**
     * interleaved</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/interleaved">iOS Dev Center</a>
     */
    @Generated
    @Selector("isInterleaved")
    public native boolean isInterleaved();

    /**
     * standard</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/standard">iOS Dev Center</a>
     */
    @Generated
    @Selector("isStandard")
    public native boolean isStandard();

    /**
     * sampleRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/sampleRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleRate")
    public native double sampleRate();

    /**
     * settings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/settings">iOS Dev Center</a>
     */
    @Generated
    @Selector("settings")
    public native NSDictionary<String, ?> settings();

    /**
     * streamDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioFormat_Class/index.html#//apple_ref/occ/instp/AVAudioFormat/streamDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("streamDescription")
    public native AudioStreamBasicDescription streamDescription();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("formatDescription")
    public native CMFormatDescriptionRef formatDescription();

    @Generated
    @Selector("initWithCMAudioFormatDescription:")
    public native AVAudioFormat initWithCMAudioFormatDescription(CMFormatDescriptionRef formatDescription);

    @Generated
    @Selector("initWithCoder:")
    public native AVAudioFormat initWithCoder(NSCoder aDecoder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
