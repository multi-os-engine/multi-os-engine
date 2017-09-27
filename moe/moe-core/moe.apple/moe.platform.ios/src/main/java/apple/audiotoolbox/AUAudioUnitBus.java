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

package apple.audiotoolbox;

import apple.NSObject;
import apple.avfoundation.AVAudioFormat;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
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
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUAudioUnitBus extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AUAudioUnitBus(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUAudioUnitBus alloc();

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
    @Selector("busType")
    @NInt
    public native long busType();

    @Generated
    @Selector("contextPresentationLatency")
    public native double contextPresentationLatency();

    @Generated
    @Selector("format")
    public native AVAudioFormat format();

    @Generated
    @Selector("index")
    @NUInt
    public native long index();

    @Generated
    @Selector("init")
    public native AUAudioUnitBus init();

    @Generated
    @Selector("initWithFormat:error:")
    public native AUAudioUnitBus initWithFormatError(AVAudioFormat format,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    @Generated
    @Selector("maximumChannelCount")
    public native int maximumChannelCount();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("ownerAudioUnit")
    public native AUAudioUnit ownerAudioUnit();

    @Generated
    @Selector("setContextPresentationLatency:")
    public native void setContextPresentationLatency(double value);

    @Generated
    @Selector("setFormat:error:")
    public native boolean setFormatError(AVAudioFormat format,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setMaximumChannelCount:")
    public native void setMaximumChannelCount(int value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setSupportedChannelCounts:")
    public native void setSupportedChannelCounts(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("supportedChannelCounts")
    public native NSArray<? extends NSNumber> supportedChannelCounts();

    @Generated
    @Selector("supportedChannelLayoutTags")
    public native NSArray<? extends NSNumber> supportedChannelLayoutTags();

    @Generated
    @Selector("setShouldAllocateBuffer:")
    public native void setShouldAllocateBuffer(boolean value);

    @Generated
    @Selector("shouldAllocateBuffer")
    public native boolean shouldAllocateBuffer();
}
