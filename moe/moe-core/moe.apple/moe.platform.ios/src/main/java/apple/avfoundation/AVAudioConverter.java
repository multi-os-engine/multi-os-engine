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
import apple.avfoundation.struct.AVAudioConverterPrimeInfo;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioConverter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioConverter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioConverter alloc();

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

    @Generated
    @Selector("applicableEncodeBitRates")
    public native NSArray<? extends NSNumber> applicableEncodeBitRates();

    @Generated
    @Selector("applicableEncodeSampleRates")
    public native NSArray<? extends NSNumber> applicableEncodeSampleRates();

    @Generated
    @Selector("availableEncodeBitRates")
    public native NSArray<? extends NSNumber> availableEncodeBitRates();

    @Generated
    @Selector("availableEncodeChannelLayoutTags")
    public native NSArray<? extends NSNumber> availableEncodeChannelLayoutTags();

    @Generated
    @Selector("availableEncodeSampleRates")
    public native NSArray<? extends NSNumber> availableEncodeSampleRates();

    @Generated
    @Selector("bitRate")
    @NInt
    public native long bitRate();

    @Generated
    @Selector("bitRateStrategy")
    public native String bitRateStrategy();

    @Generated
    @Selector("channelMap")
    public native NSArray<? extends NSNumber> channelMap();

    @Generated
    @Selector("convertToBuffer:error:withInputFromBlock:")
    @NInt
    public native long convertToBufferErrorWithInputFromBlock(AVAudioBuffer outputBuffer,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError,
            @ObjCBlock(name = "call_convertToBufferErrorWithInputFromBlock") Block_convertToBufferErrorWithInputFromBlock inputBlock);

    @Generated
    @Selector("convertToBuffer:fromBuffer:error:")
    public native boolean convertToBufferFromBufferError(AVAudioPCMBuffer outputBuffer, AVAudioPCMBuffer inputBuffer,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("dither")
    public native boolean dither();

    @Generated
    @Selector("downmix")
    public native boolean downmix();

    @Generated
    @Selector("init")
    public native AVAudioConverter init();

    @Generated
    @Selector("initFromFormat:toFormat:")
    public native AVAudioConverter initFromFormatToFormat(AVAudioFormat fromFormat, AVAudioFormat toFormat);

    @Generated
    @Selector("inputFormat")
    public native AVAudioFormat inputFormat();

    @Generated
    @Selector("magicCookie")
    public native NSData magicCookie();

    @Generated
    @Selector("maximumOutputPacketSize")
    @NInt
    public native long maximumOutputPacketSize();

    @Generated
    @Selector("outputFormat")
    public native AVAudioFormat outputFormat();

    @Generated
    @Selector("primeInfo")
    @ByValue
    public native AVAudioConverterPrimeInfo primeInfo();

    @Generated
    @Selector("primeMethod")
    @NInt
    public native long primeMethod();

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("sampleRateConverterAlgorithm")
    public native String sampleRateConverterAlgorithm();

    @Generated
    @Selector("sampleRateConverterQuality")
    @NInt
    public native long sampleRateConverterQuality();

    @Generated
    @Selector("setBitRate:")
    public native void setBitRate(@NInt long value);

    @Generated
    @Selector("setBitRateStrategy:")
    public native void setBitRateStrategy(String value);

    @Generated
    @Selector("setChannelMap:")
    public native void setChannelMap(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setDither:")
    public native void setDither(boolean value);

    @Generated
    @Selector("setDownmix:")
    public native void setDownmix(boolean value);

    @Generated
    @Selector("setMagicCookie:")
    public native void setMagicCookie(NSData value);

    @Generated
    @Selector("setPrimeInfo:")
    public native void setPrimeInfo(@ByValue AVAudioConverterPrimeInfo value);

    @Generated
    @Selector("setPrimeMethod:")
    public native void setPrimeMethod(@NInt long value);

    @Generated
    @Selector("setSampleRateConverterAlgorithm:")
    public native void setSampleRateConverterAlgorithm(String value);

    @Generated
    @Selector("setSampleRateConverterQuality:")
    public native void setSampleRateConverterQuality(@NInt long value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_convertToBufferErrorWithInputFromBlock {
        @Generated
        AVAudioBuffer call_convertToBufferErrorWithInputFromBlock(int inNumberOfPackets, NIntPtr outStatus);
    }
}
