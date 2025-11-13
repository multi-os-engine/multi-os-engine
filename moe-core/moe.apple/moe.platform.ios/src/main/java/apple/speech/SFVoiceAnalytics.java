package apple.speech;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A collection of vocal analysis metrics.
 * 
 * Use an ``SFAcousticFeature`` object to access the `SFVoiceAnalytics` insights. Voice analytics include the following
 * features:
 * 
 * - Use ``jitter`` to measure how pitch varies in audio.
 * - Use ``shimmer`` to measure how amplitude varies in audio.
 * - Use ``pitch`` to measure the highness and lowness of the tone.
 * - Use ``voicing`` to identify voiced regions in speech.
 * 
 * These results are part of the ``SFTranscriptionSegment`` object and are available when the system sends the
 * ``SFSpeechRecognitionResult/isFinal`` flag.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFVoiceAnalytics extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SFVoiceAnalytics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFVoiceAnalytics alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFVoiceAnalytics allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SFVoiceAnalytics init();

    @Generated
    @Selector("initWithCoder:")
    public native SFVoiceAnalytics initWithCoder(@NotNull NSCoder coder);

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

    /**
     * The variation in pitch in each frame of a transcription segment, expressed as a percentage of the frame's
     * fundamental frequency.
     * Jitter measures vocal stability and is measured as an absolute difference between consecutive periods, divided by
     * the average period. It is expressed as a percentage
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("jitter")
    public native SFAcousticFeature jitter();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SFVoiceAnalytics new_objc();

    /**
     * The highness or lowness of the tone (fundamental frequency) in each frame of a transcription segment, expressed
     * as a logarithm.
     * 
     * The value is a logarithm (base `e`) of the normalized pitch estimate for each frame.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("pitch")
    public native SFAcousticFeature pitch();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The variation in vocal volume stability (amplitude) in each frame of a transcription segment, expressed in
     * decibels.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("shimmer")
    public native SFAcousticFeature shimmer();

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

    /**
     * The likelihood of a voice in each frame of a transcription segment.
     * 
     * The `voicing` value is expressed as a probability in the range `[0.0, 1.0]`.
     * Voicing measures the probability of whether a frame is voiced or not and is measured as a probability
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("voicing")
    public native SFAcousticFeature voicing();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
