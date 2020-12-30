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
import apple.coreaudiotypes.struct.AudioStreamPacketDescription;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class AVAudioCompressedBuffer
 * @abstract A subclass of AVAudioBuffer for use with compressed audio formats.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioCompressedBuffer extends AVAudioBuffer {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioCompressedBuffer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioCompressedBuffer alloc();

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
     * @property data
     * @abstract Access the buffer's data bytes.
     */
    @Generated
    @Selector("data")
    public native VoidPtr data();

    @Generated
    @Selector("init")
    public native AVAudioCompressedBuffer init();

    /**
     * @method initWithFormat:packetCapacity:
     * @abstract Initialize a buffer that is to contain constant bytes per packet compressed audio data.
     * @param format
     * 	The format of the audio to be contained in the buffer.
     * @param packetCapacity
     * 	The capacity of the buffer in packets.
     * @discussion
     * 	This fails if the format is PCM or if the format has variable bytes per packet (format.streamDescription->mBytesPerPacket == 0).
     */
    @Generated
    @Selector("initWithFormat:packetCapacity:")
    public native AVAudioCompressedBuffer initWithFormatPacketCapacity(AVAudioFormat format, int packetCapacity);

    /**
     * @method initWithFormat:packetCapacity:maximumPacketSize:
     * @abstract Initialize a buffer that is to contain compressed audio data. 
     * @param format
     * 	The format of the audio to be contained in the buffer.
     * @param packetCapacity
     * 	The capacity of the buffer in packets.
     * @param maximumPacketSize
     * 	The maximum size in bytes of a compressed packet. 
     * 	The maximum packet size can be obtained from the maximumOutputPacketSize property of an AVAudioConverter configured for encoding this format.
     * @discussion
     * 	An exception is raised if the format is PCM.
     */
    @Generated
    @Selector("initWithFormat:packetCapacity:maximumPacketSize:")
    public native AVAudioCompressedBuffer initWithFormatPacketCapacityMaximumPacketSize(AVAudioFormat format,
            int packetCapacity, @NInt long maximumPacketSize);

    /**
     * @property maximumPacketSize
     * @abstract The maximum size of a compressed packet in bytes.
     */
    @Generated
    @Selector("maximumPacketSize")
    @NInt
    public native long maximumPacketSize();

    /**
     * @property packetCapacity
     * @abstract
     * 	The number of compressed packets the buffer can contain.
     */
    @Generated
    @Selector("packetCapacity")
    public native int packetCapacity();

    /**
     * @property packetCount
     * @abstract The current number of compressed packets in the buffer.
     * @discussion
     * 	You may modify the packetCount as part of an operation that modifies its contents.
     * 	The packetCount must be less than or equal to the packetCapacity.
     */
    @Generated
    @Selector("packetCount")
    public native int packetCount();

    /**
     * @property packetDescriptions
     * @abstract Access the buffer's array of packet descriptions, if any.
     * @discussion
     * 	If the format has constant bytes per packet (format.streamDescription->mBytesPerPacket != 0), then this will return nil.
     */
    @Generated
    @Selector("packetDescriptions")
    public native AudioStreamPacketDescription packetDescriptions();

    /**
     * @property packetCount
     * @abstract The current number of compressed packets in the buffer.
     * @discussion
     * 	You may modify the packetCount as part of an operation that modifies its contents.
     * 	The packetCount must be less than or equal to the packetCapacity.
     */
    @Generated
    @Selector("setPacketCount:")
    public native void setPacketCount(int value);

    /**
     * @property byteCapacity
     * @abstract The buffer's capacity in bytes
     */
    @Generated
    @Selector("byteCapacity")
    public native int byteCapacity();

    /**
     * @property byteLength
     * @abstract The current number of valid bytes in the buffer.
     * @discussion
     * 	Can be changed as part of an operation that modifies the contents.
     */
    @Generated
    @Selector("byteLength")
    public native int byteLength();

    /**
     * @property byteLength
     * @abstract The current number of valid bytes in the buffer.
     * @discussion
     * 	Can be changed as part of an operation that modifies the contents.
     */
    @Generated
    @Selector("setByteLength:")
    public native void setByteLength(int value);
}
