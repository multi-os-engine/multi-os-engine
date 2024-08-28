package apple.avfaudio;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioCompressedBuffer
 * 
 * A subclass of AVAudioBuffer for use with compressed audio formats.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFAudio")
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioCompressedBuffer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] byteCapacity
     * 
     * The buffer's capacity in bytes
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("byteCapacity")
    public native int byteCapacity();

    /**
     * [@property] byteLength
     * 
     * The current number of valid bytes in the buffer.
     * 
     * Can be changed as part of an operation that modifies the contents.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("byteLength")
    public native int byteLength();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] data
     * 
     * Access the buffer's data bytes.
     */
    @NotNull
    @Generated
    @Selector("data")
    public native VoidPtr data();

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
    @Selector("init")
    public native AVAudioCompressedBuffer init();

    /**
     * initWithFormat:packetCapacity:
     * 
     * Initialize a buffer that is to contain constant bytes per packet compressed audio data.
     * 
     * This fails if the format is PCM or if the format has variable bytes per packet
     * (format.streamDescription->mBytesPerPacket == 0).
     * 
     * @param format
     *                       The format of the audio to be contained in the buffer.
     * @param packetCapacity
     *                       The capacity of the buffer in packets.
     */
    @Generated
    @Selector("initWithFormat:packetCapacity:")
    public native AVAudioCompressedBuffer initWithFormatPacketCapacity(@NotNull AVAudioFormat format,
            int packetCapacity);

    /**
     * initWithFormat:packetCapacity:maximumPacketSize:
     * 
     * Initialize a buffer that is to contain compressed audio data.
     * 
     * An exception is raised if the format is PCM.
     * 
     * @param format
     *                          The format of the audio to be contained in the buffer.
     * @param packetCapacity
     *                          The capacity of the buffer in packets.
     * @param maximumPacketSize
     *                          The maximum size in bytes of a compressed packet.
     *                          The maximum packet size can be obtained from the maximumOutputPacketSize property of an
     *                          AVAudioConverter configured for encoding this format.
     */
    @Generated
    @Selector("initWithFormat:packetCapacity:maximumPacketSize:")
    public native AVAudioCompressedBuffer initWithFormatPacketCapacityMaximumPacketSize(@NotNull AVAudioFormat format,
            int packetCapacity, @NInt long maximumPacketSize);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] maximumPacketSize
     * 
     * The maximum size of a compressed packet in bytes.
     */
    @Generated
    @Selector("maximumPacketSize")
    @NInt
    public native long maximumPacketSize();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioCompressedBuffer new_objc();

    /**
     * [@property] packetCapacity
     * 
     * The number of compressed packets the buffer can contain.
     */
    @Generated
    @Selector("packetCapacity")
    public native int packetCapacity();

    /**
     * [@property] packetCount
     * 
     * The current number of compressed packets in the buffer.
     * 
     * You may modify the packetCount as part of an operation that modifies its contents.
     * The packetCount must be less than or equal to the packetCapacity.
     */
    @Generated
    @Selector("packetCount")
    public native int packetCount();

    /**
     * [@property] packetDescriptions
     * 
     * Access the buffer's array of packet descriptions, if any.
     * 
     * If the format has constant bytes per packet (format.streamDescription->mBytesPerPacket != 0), then this will
     * return nil.
     */
    @Nullable
    @Generated
    @Selector("packetDescriptions")
    public native AudioStreamPacketDescription packetDescriptions();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] byteLength
     * 
     * The current number of valid bytes in the buffer.
     * 
     * Can be changed as part of an operation that modifies the contents.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setByteLength:")
    public native void setByteLength(int value);

    /**
     * [@property] packetCount
     * 
     * The current number of compressed packets in the buffer.
     * 
     * You may modify the packetCount as part of an operation that modifies its contents.
     * The packetCount must be less than or equal to the packetCapacity.
     */
    @Generated
    @Selector("setPacketCount:")
    public native void setPacketCount(int value);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
