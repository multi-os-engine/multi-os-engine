package apple.avfaudio;

import apple.NSObject;
import apple.coreaudiotypes.struct.AudioStreamBasicDescription;
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

/**
 * AVAudioFormat
 * <p>
 * A representation of an audio format.
 * <p>
 * AVAudioFormat wraps a Core Audio AudioStreamBasicDescription struct, with convenience
 * initializers and accessors for common formats, including Core Audio's standard deinterleaved
 * 32-bit floating point.
 * <p>
 * Instances of this class are immutable.
 */
@Generated
@Library("AVFAudio")
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

    /**
     * [@property] channelCount
     * <p>
     * The number of channels of audio data.
     */
    @Generated
    @Selector("channelCount")
    public native int channelCount();

    /**
     * [@property] channelLayout
     * <p>
     * The underlying AVAudioChannelLayout, if any.
     * <p>
     * Only formats with more than 2 channels are required to have channel layouts.
     */
    @Generated
    @Selector("channelLayout")
    public native AVAudioChannelLayout channelLayout();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] commonFormat
     * <p>
     * An `AVAudioCommonFormat` identifying the format
     */
    @Generated
    @Selector("commonFormat")
    @NUInt
    public native long commonFormat();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] formatDescription
     * <p>
     * Converts to a CMAudioFormatDescriptionRef, for use with Core Media API's.
     */
    @Generated
    @Selector("formatDescription")
    public native CMFormatDescriptionRef formatDescription();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioFormat init();

    /**
     * initStandardFormatWithSampleRate:channelLayout:
     * <p>
     * Initialize to deinterleaved float with the specified sample rate and channel layout.
     *
     * @param sampleRate the sample rate
     * @param layout     the channel layout. must not be nil.
     */
    @Generated
    @Selector("initStandardFormatWithSampleRate:channelLayout:")
    public native AVAudioFormat initStandardFormatWithSampleRateChannelLayout(double sampleRate,
            AVAudioChannelLayout layout);

    /**
     * initStandardFormatWithSampleRate:channels:
     * <p>
     * Initialize to deinterleaved float with the specified sample rate and channel count.
     * <p>
     * If the format specifies more than 2 channels, this method fails (returns nil).
     *
     * @param sampleRate the sample rate
     * @param channels   the channel count
     */
    @Generated
    @Selector("initStandardFormatWithSampleRate:channels:")
    public native AVAudioFormat initStandardFormatWithSampleRateChannels(double sampleRate, int channels);

    /**
     * initWithCMAudioFormatDescription:
     * <p>
     * initialize from a CMAudioFormatDescriptionRef.
     * <p>
     * If formatDescription is invalid, this method fails (returns nil).
     *
     * @param formatDescription the CMAudioFormatDescriptionRef.
     */
    @Generated
    @Selector("initWithCMAudioFormatDescription:")
    public native AVAudioFormat initWithCMAudioFormatDescription(CMFormatDescriptionRef formatDescription);

    @Generated
    @Selector("initWithCoder:")
    public native AVAudioFormat initWithCoder(NSCoder coder);

    /**
     * initWithCommonFormat:sampleRate:channels:interleaved:
     * <p>
     * Initialize to float with the specified sample rate, channel count and interleavedness.
     * <p>
     * If the format specifies more than 2 channels, this method fails (returns nil).
     *
     * @param format      the common format type
     * @param sampleRate  the sample rate
     * @param channels    the channel count
     * @param interleaved true if interleaved
     */
    @Generated
    @Selector("initWithCommonFormat:sampleRate:channels:interleaved:")
    public native AVAudioFormat initWithCommonFormatSampleRateChannelsInterleaved(@NUInt long format, double sampleRate,
            int channels, boolean interleaved);

    /**
     * initWithCommonFormat:sampleRate:interleaved:channelLayout:
     * <p>
     * Initialize to float with the specified sample rate, channel layout and interleavedness.
     *
     * @param format      the common format type
     * @param sampleRate  the sample rate
     * @param interleaved true if interleaved
     * @param layout      the channel layout. must not be nil.
     */
    @Generated
    @Selector("initWithCommonFormat:sampleRate:interleaved:channelLayout:")
    public native AVAudioFormat initWithCommonFormatSampleRateInterleavedChannelLayout(@NUInt long format,
            double sampleRate, boolean interleaved, AVAudioChannelLayout layout);

    /**
     * initWithSettings:
     * <p>
     * Initialize using a settings dictionary.
     * <p>
     * See AVAudioSettings.h. Note that many settings dictionary elements pertain to encoder
     * settings, not the basic format, and will be ignored.
     * <p>
     * Returns nil if a format cannot be constructed with the provided settings, e.g. when:
     * - AVNumberOfChannelsKey specifies more than 2 channels, but AVChannelLayoutKey hasn't
     * been specified or the layout does not match
     * - AVLinearPCMBitDepthKey for linear PCM format specifies less than 8 or greater
     * than 32 bits
     * - values for the keys are not of the expected types
     */
    @Generated
    @Selector("initWithSettings:")
    public native AVAudioFormat initWithSettings(NSDictionary<String, ?> settings);

    /**
     * initWithStreamDescription:
     * <p>
     * Initialize from an AudioStreamBasicDescription.
     * <p>
     * If the format specifies more than 2 channels, this method fails (returns nil).
     *
     * @param asbd the AudioStreamBasicDescription
     */
    @Generated
    @Selector("initWithStreamDescription:")
    public native AVAudioFormat initWithStreamDescription(AudioStreamBasicDescription asbd);

    /**
     * initWithStreamDescription:channelLayout:
     * <p>
     * Initialize from an AudioStreamBasicDescription and optional channel layout.
     * <p>
     * If the format specifies more than 2 channels, this method fails (returns nil) unless layout
     * is non-nil.
     *
     * @param asbd   the AudioStreamBasicDescription
     * @param layout the channel layout. Can be nil only if asbd specifies 1 or 2 channels.
     */
    @Generated
    @Selector("initWithStreamDescription:channelLayout:")
    public native AVAudioFormat initWithStreamDescriptionChannelLayout(AudioStreamBasicDescription asbd,
            AVAudioChannelLayout layout);

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

    /**
     * isEqual:
     * <p>
     * Determine whether another format is functionally equivalent.
     * <p>
     * For PCM, interleavedness is ignored for mono. Differences in the AudioStreamBasicDescription
     * alignment and packedness are ignored when they are not significant (e.g. with 1 channel, 2
     * bytes per frame and 16 bits per channel, neither alignment, the format is implicitly packed
     * and can be interpreted as either high- or low-aligned.)
     * For AVAudioChannelLayout, a layout with standard mono/stereo tag is considered to be
     * equivalent to a nil layout. Otherwise, the layouts are compared for equality.
     *
     * @param object the format to compare against
     */
    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    /**
     * [@property] interleaved
     * <p>
     * Describes whether the samples are interleaved.
     * <p>
     * For non-PCM formats, the value is undefined.
     */
    @Generated
    @Selector("isInterleaved")
    public native boolean isInterleaved();

    /**
     * [@property] standard
     * <p>
     * Describes whether the format is deinterleaved native-endian float.
     */
    @Generated
    @Selector("isStandard")
    public native boolean isStandard();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] magicCookie
     * <p>
     * The underlying magic cookie, if any.
     * <p>
     * A magic cookie contains metadata associated with encoders and decoders.
     * Encoders produce a magic cookie, and some decoders require a magic cookie to decode properly.
     */
    @Generated
    @Selector("magicCookie")
    public native NSData magicCookie();

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

    /**
     * [@property] sampleRate
     * <p>
     * A sampling rate in Hertz.
     */
    @Generated
    @Selector("sampleRate")
    public native double sampleRate();

    /**
     * [@property] magicCookie
     * <p>
     * The underlying magic cookie, if any.
     * <p>
     * A magic cookie contains metadata associated with encoders and decoders.
     * Encoders produce a magic cookie, and some decoders require a magic cookie to decode properly.
     */
    @Generated
    @Selector("setMagicCookie:")
    public native void setMagicCookie(NSData value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] settings
     * <p>
     * Returns the format represented as a dictionary with keys from AVAudioSettings.h.
     */
    @Generated
    @Selector("settings")
    public native NSDictionary<String, ?> settings();

    /**
     * [@property] streamDescription
     * <p>
     * Returns the AudioStreamBasicDescription, for use with lower-level audio API's.
     */
    @Generated
    @Selector("streamDescription")
    public native AudioStreamBasicDescription streamDescription();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
