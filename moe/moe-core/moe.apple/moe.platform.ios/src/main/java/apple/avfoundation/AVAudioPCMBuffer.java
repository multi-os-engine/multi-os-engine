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
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class AVAudioPCMBuffer
 * @abstract A subclass of AVAudioBuffer for use with PCM audio formats.
 * @discussion
 * 	AVAudioPCMBuffer provides a number of methods useful for manipulating buffers of
 * 	audio in PCM format.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioPCMBuffer extends AVAudioBuffer {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioPCMBuffer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioPCMBuffer alloc();

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

    /**
     * @property floatChannelData
     * @abstract Access the buffer's float audio samples.
     * @discussion
     * 	floatChannelData returns pointers to the buffer's audio samples if the buffer's format is
     * 	32-bit float, or nil if it is another format.
     * 
     * 	The returned pointer is to format.channelCount pointers to float. Each of these pointers
     * 	is to "frameLength" valid samples, which are spaced by "stride" samples.
     * 
     * 	If format.interleaved is false (as with the standard deinterleaved float format), then 
     * 	the pointers will be to separate chunks of memory. "stride" is 1.
     * 
     * 	If format.interleaved is true, then the pointers will refer into the same chunk of interleaved
     * 	samples, each offset by 1 frame. "stride" is the number of interleaved channels.
     */
    @Generated
    @Selector("floatChannelData")
    @ReferenceInfo(type = Float.class, depth = 2)
    public native ConstPtr<FloatPtr> floatChannelData();

    /**
     * @property frameCapacity
     * @abstract
     * 	The buffer's capacity, in audio sample frames.
     */
    @Generated
    @Selector("frameCapacity")
    public native int frameCapacity();

    /**
     * @property frameLength
     * @abstract The current number of valid sample frames in the buffer.
     * @discussion
     * 	You may modify the length of the buffer as part of an operation that modifies its contents.
     * 	The length must be less than or equal to the frameCapacity. Modifying frameLength will update
     * 	the mDataByteSize in each of the underlying AudioBufferList's AudioBuffer's correspondingly,
     * 	and vice versa. Note that in the case of deinterleaved formats, mDataByteSize will refers
     * 	the size of one channel's worth of audio samples.
     */
    @Generated
    @Selector("frameLength")
    public native int frameLength();

    @Generated
    @Selector("init")
    public native AVAudioPCMBuffer init();

    /**
     * @method initWithPCMFormat:frameCapacity:
     * @abstract Initialize a buffer that is to contain PCM audio samples.
     * @param format
     * 	The format of the PCM audio to be contained in the buffer.
     * @param frameCapacity
     * 	The capacity of the buffer in PCM sample frames.
     * @discussion
     * 	An exception is raised if the format is not PCM.
     * 
     * 	Returns nil in the following cases:
     * 	- if the format has zero bytes per frame (format.streamDescription->mBytesPerFrame == 0)
     * 	- if the buffer byte capacity (frameCapacity * format.streamDescription->mBytesPerFrame)
     * 	  cannot be represented by an uint32_t
     */
    @Generated
    @Selector("initWithPCMFormat:frameCapacity:")
    public native AVAudioPCMBuffer initWithPCMFormatFrameCapacity(AVAudioFormat format, int frameCapacity);

    /**
     * @property int16ChannelData
     * @abstract Access the buffer's int16_t audio samples.
     * @discussion
     * 	int16ChannelData returns the buffer's audio samples if the buffer's format has 2-byte
     * 	integer samples, or nil if it is another format.
     * 
     * 	See the discussion of floatChannelData.
     */
    @Generated
    @Selector("int16ChannelData")
    @ReferenceInfo(type = Short.class, depth = 2)
    public native ConstPtr<ShortPtr> int16ChannelData();

    /**
     * @property int32ChannelData
     * @abstract Access the buffer's int32_t audio samples.
     * @discussion
     * 	int32ChannelData returns the buffer's audio samples if the buffer's format has 4-byte
     * 	integer samples, or nil if it is another format.
     * 
     * 	See the discussion of floatChannelData.
     */
    @Generated
    @Selector("int32ChannelData")
    @ReferenceInfo(type = Integer.class, depth = 2)
    public native ConstPtr<IntPtr> int32ChannelData();

    /**
     * @property frameLength
     * @abstract The current number of valid sample frames in the buffer.
     * @discussion
     * 	You may modify the length of the buffer as part of an operation that modifies its contents.
     * 	The length must be less than or equal to the frameCapacity. Modifying frameLength will update
     * 	the mDataByteSize in each of the underlying AudioBufferList's AudioBuffer's correspondingly,
     * 	and vice versa. Note that in the case of deinterleaved formats, mDataByteSize will refers
     * 	the size of one channel's worth of audio samples.
     */
    @Generated
    @Selector("setFrameLength:")
    public native void setFrameLength(int value);

    /**
     * @property stride
     * @abstract The buffer's number of interleaved channels.
     * @discussion
     * 	Useful in conjunction with floatChannelData etc.
     */
    @Generated
    @Selector("stride")
    @NUInt
    public native long stride();
}
