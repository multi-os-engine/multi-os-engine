package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.struct.AVAudioConverterPrimeInfo;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioConverter
 * 
 * Converts streams of audio between various formats.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFAudio")
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioConverter allocWithZone(VoidPtr zone);

    /**
     * [@property] applicableEncodeBitRates
     * 
     * When encoding, an NSArray of NSNumber of bit rates that can be applied based on the current formats and settings.
     * Returns nil if not encoding.
     */
    @Nullable
    @Generated
    @Selector("applicableEncodeBitRates")
    public native NSArray<? extends NSNumber> applicableEncodeBitRates();

    /**
     * [@property] applicableEncodeSampleRates
     * 
     * When encoding, an NSArray of NSNumber of output sample rates that can be applied based on the current formats and
     * settings. Returns nil if not encoding.
     */
    @Nullable
    @Generated
    @Selector("applicableEncodeSampleRates")
    public native NSArray<? extends NSNumber> applicableEncodeSampleRates();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] availableEncodeBitRates
     * 
     * When encoding, an NSArray of NSNumber of all bit rates provided by the codec. Returns nil if not encoding.
     */
    @Nullable
    @Generated
    @Selector("availableEncodeBitRates")
    public native NSArray<? extends NSNumber> availableEncodeBitRates();

    /**
     * [@property] availableEncodeChannelLayoutTags
     * 
     * When encoding, an NSArray of NSNumber of all output channel layout tags provided by the codec. Returns nil if not
     * encoding.
     */
    @Nullable
    @Generated
    @Selector("availableEncodeChannelLayoutTags")
    public native NSArray<? extends NSNumber> availableEncodeChannelLayoutTags();

    /**
     * [@property] availableEncodeSampleRates
     * 
     * When encoding, an NSArray of NSNumber of all output sample rates provided by the codec. Returns nil if not
     * encoding.
     */
    @Nullable
    @Generated
    @Selector("availableEncodeSampleRates")
    public native NSArray<? extends NSNumber> availableEncodeSampleRates();

    /**
     * [@property] bitRate
     * 
     * bitRate in bits per second. Only applies when encoding.
     */
    @Generated
    @Selector("bitRate")
    @NInt
    public native long bitRate();

    /**
     * [@property] bitRateStrategy
     * 
     * When encoding, an AVEncoderBitRateStrategyKey value constant as defined in AVAudioSettings.h. Returns nil if not
     * encoding.
     */
    @Nullable
    @Generated
    @Selector("bitRateStrategy")
    public native String bitRateStrategy();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * [@property] channelMap
     * 
     * An array of integers indicating from which input to derive each output.
     * 
     * The array has size equal to the number of output channels. Each element's value is the input
     * channel number, starting with zero, that is to be copied to that output. A negative value
     * means that the output channel will have no source and will be silent. Setting a channel map
     * overrides channel mapping due to any channel layouts in the input and output formats that
     * may have been supplied.
     */
    @NotNull
    @Generated
    @Selector("channelMap")
    public native NSArray<? extends NSNumber> channelMap();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * convertToBuffer:error:withInputFromBlock:
     * 
     * Perform any supported conversion.
     * 
     * It attempts to fill the buffer to its capacity. On return, the buffer's length indicates the number of
     * sample frames successfully converted.
     * 
     * @param inputBlock
     *                     A block which will be called to get input data as needed. See description for
     *                     AVAudioConverterInputBlock.
     * @param outputBuffer
     *                     The output buffer.
     * @param outError
     *                     An error if the conversion fails.
     * @return
     *         An AVAudioConverterOutputStatus is returned.
     */
    @Generated
    @Selector("convertToBuffer:error:withInputFromBlock:")
    @NInt
    public native long convertToBufferErrorWithInputFromBlock(@NotNull AVAudioBuffer outputBuffer,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError,
            @NotNull @ObjCBlock(name = "call_convertToBufferErrorWithInputFromBlock") Block_convertToBufferErrorWithInputFromBlock inputBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_convertToBufferErrorWithInputFromBlock {
        @Nullable
        @Generated
        AVAudioBuffer call_convertToBufferErrorWithInputFromBlock(int inNumberOfPackets, @NotNull NIntPtr outStatus);
    }

    /**
     * convertToBuffer:fromBuffer:error:
     * 
     * Perform a simple conversion. That is, a conversion which does not involve codecs or sample rate conversion.
     * 
     * The output buffer's frameCapacity should be at least at large as the inputBuffer's frameLength.
     * If the conversion involves a codec or sample rate conversion, you instead must use
     * convertToBuffer:error:withInputFromBlock:.
     * 
     * @param inputBuffer
     *                     The input buffer.
     * @param outputBuffer
     *                     The output buffer.
     * @param outError
     *                     An error if the conversion fails.
     * @return
     *         YES is returned on success, NO when an error has occurred.
     */
    @Generated
    @Selector("convertToBuffer:fromBuffer:error:")
    public native boolean convertToBufferFromBufferError(@NotNull AVAudioPCMBuffer outputBuffer,
            @NotNull AVAudioPCMBuffer inputBuffer,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] dither
     * 
     * Setting YES will turn on dither, if dither makes sense in given the current formats
     * and settings. Default value is NO.
     */
    @Generated
    @Selector("dither")
    public native boolean dither();

    /**
     * [@property] downmix
     * 
     * If YES and channel remapping is necessary, then channels will be mixed as
     * appropriate instead of remapped. Default value is NO.
     */
    @Generated
    @Selector("downmix")
    public native boolean downmix();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioConverter init();

    /**
     * initFromFormat:toFormat:
     * 
     * Initialize from input and output formats.
     * 
     * Returns nil if the format conversion is not possible.
     * 
     * @param fromFormat
     *                   The input format.
     * @param toFormat
     *                   The output format.
     */
    @Generated
    @Selector("initFromFormat:toFormat:")
    public native AVAudioConverter initFromFormatToFormat(@NotNull AVAudioFormat fromFormat,
            @NotNull AVAudioFormat toFormat);

    /**
     * [@property] inputFormat
     * 
     * The format of the input audio stream. (NB. AVAudioFormat includes the channel layout)
     */
    @NotNull
    @Generated
    @Selector("inputFormat")
    public native AVAudioFormat inputFormat();

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
     * [@property] magicCookie
     * 
     * Decoders require some data in the form of a magicCookie in order to decode properly.
     * Encoders will produce a magicCookie.
     */
    @Nullable
    @Generated
    @Selector("magicCookie")
    public native NSData magicCookie();

    /**
     * [@property] maximumOutputPacketSize
     * 
     * The maximum size of an output packet, in bytes.
     * 
     * When encoding it is useful to know how large a packet can be in order to allocate a buffer to receive the output.
     */
    @Generated
    @Selector("maximumOutputPacketSize")
    @NInt
    public native long maximumOutputPacketSize();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioConverter new_objc();

    /**
     * [@property] outputFormat
     * 
     * The format of the output audio stream. (NB. AVAudioFormat includes the channel layout)
     */
    @NotNull
    @Generated
    @Selector("outputFormat")
    public native AVAudioFormat outputFormat();

    /**
     * [@property] primeInfo
     * 
     * Indicates the the number of priming frames.
     */
    @Generated
    @Selector("primeInfo")
    @ByValue
    public native AVAudioConverterPrimeInfo primeInfo();

    /**
     * [@property] primeMethod
     * 
     * Indicates the priming method to be used by the sample rate converter or decoder.
     */
    @Generated
    @Selector("primeMethod")
    @NInt
    public native long primeMethod();

    /**
     * reset
     * 
     * Resets the converter so that a new stream may be converted.
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sampleRateConverterAlgorithm
     * 
     * An AVSampleRateConverterAlgorithmKey value as defined in AVAudioSettings.h.
     */
    @Nullable
    @Generated
    @Selector("sampleRateConverterAlgorithm")
    public native String sampleRateConverterAlgorithm();

    /**
     * [@property] sampleRateConverterQuality
     * 
     * An AVAudioQuality value as defined in AVAudioSettings.h.
     */
    @Generated
    @Selector("sampleRateConverterQuality")
    @NInt
    public native long sampleRateConverterQuality();

    /**
     * [@property] bitRate
     * 
     * bitRate in bits per second. Only applies when encoding.
     */
    @Generated
    @Selector("setBitRate:")
    public native void setBitRate(@NInt long value);

    /**
     * [@property] bitRateStrategy
     * 
     * When encoding, an AVEncoderBitRateStrategyKey value constant as defined in AVAudioSettings.h. Returns nil if not
     * encoding.
     */
    @Generated
    @Selector("setBitRateStrategy:")
    public native void setBitRateStrategy(@Nullable String value);

    /**
     * [@property] channelMap
     * 
     * An array of integers indicating from which input to derive each output.
     * 
     * The array has size equal to the number of output channels. Each element's value is the input
     * channel number, starting with zero, that is to be copied to that output. A negative value
     * means that the output channel will have no source and will be silent. Setting a channel map
     * overrides channel mapping due to any channel layouts in the input and output formats that
     * may have been supplied.
     */
    @Generated
    @Selector("setChannelMap:")
    public native void setChannelMap(@NotNull NSArray<? extends NSNumber> value);

    /**
     * [@property] dither
     * 
     * Setting YES will turn on dither, if dither makes sense in given the current formats
     * and settings. Default value is NO.
     */
    @Generated
    @Selector("setDither:")
    public native void setDither(boolean value);

    /**
     * [@property] downmix
     * 
     * If YES and channel remapping is necessary, then channels will be mixed as
     * appropriate instead of remapped. Default value is NO.
     */
    @Generated
    @Selector("setDownmix:")
    public native void setDownmix(boolean value);

    /**
     * [@property] magicCookie
     * 
     * Decoders require some data in the form of a magicCookie in order to decode properly.
     * Encoders will produce a magicCookie.
     */
    @Generated
    @Selector("setMagicCookie:")
    public native void setMagicCookie(@Nullable NSData value);

    /**
     * [@property] primeInfo
     * 
     * Indicates the the number of priming frames.
     */
    @Generated
    @Selector("setPrimeInfo:")
    public native void setPrimeInfo(@ByValue AVAudioConverterPrimeInfo value);

    /**
     * [@property] primeMethod
     * 
     * Indicates the priming method to be used by the sample rate converter or decoder.
     */
    @Generated
    @Selector("setPrimeMethod:")
    public native void setPrimeMethod(@NInt long value);

    /**
     * [@property] sampleRateConverterAlgorithm
     * 
     * An AVSampleRateConverterAlgorithmKey value as defined in AVAudioSettings.h.
     */
    @Generated
    @Selector("setSampleRateConverterAlgorithm:")
    public native void setSampleRateConverterAlgorithm(@Nullable String value);

    /**
     * [@property] sampleRateConverterQuality
     * 
     * An AVAudioQuality value as defined in AVAudioSettings.h.
     */
    @Generated
    @Selector("setSampleRateConverterQuality:")
    public native void setSampleRateConverterQuality(@NInt long value);

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
