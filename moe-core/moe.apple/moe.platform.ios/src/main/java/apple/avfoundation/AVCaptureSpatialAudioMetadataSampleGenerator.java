package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * An interface for generating a spatial audio timed metadata sample.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureSpatialAudioMetadataSampleGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSpatialAudioMetadataSampleGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSpatialAudioMetadataSampleGenerator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureSpatialAudioMetadataSampleGenerator allocWithZone(VoidPtr zone);

    /**
     * Analyzes the provided audio sample buffer for its contribution to the spatial audio timed metadata value.
     * 
     * - Parameter sbuf: a sample buffer containing spatial audio.
     * - Returns: `noErr` if the sample is successfully analyzed, otherwise a non-zero error code.
     * 
     * You must call this method with each and every spatial audio buffer you provide to ``AVAssetWriter``, so it can be
     * analyzed for the generation of a proper spatial audio timed metadata value.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("analyzeAudioSample:")
    public native int analyzeAudioSample(@NotNull CMSampleBufferRef sbuf);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    @Selector("init")
    public native AVCaptureSpatialAudioMetadataSampleGenerator init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureSpatialAudioMetadataSampleGenerator new_objc();

    /**
     * Creates a sample buffer containing a spatial audio timed metadata sample computed from all analyzed audio
     * buffers, and resets the analyzer to its initial state.
     * 
     * - Returns: a ``CMSampleBufferRef`` containing the spatial audio timed metadata sample, or `NULL` if no value can
     * be computed.
     * 
     * Call this method after you pass the last audio sample buffer of your recording to ``analyzeAudioSample:``. Then
     * pass the returned ``CMSampleBufferRef`` directly to your ``AVAssetWriterInput`` to add the sample to your
     * recording's audio timed metadata track. Note that ``AVAssetWriter`` expects one and only one spatial audio
     * metadata sample buffer to be present in the timed metadata track.
     * 
     * - Note: Calling this method also resets the analyzer, making it ready for another run of audio sample buffers.
     * Thus one generator can be re-used for multiple recordings.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newTimedMetadataSampleBufferAndResetAnalyzer")
    @Nullable
    public native CMSampleBufferRef newTimedMetadataSampleBufferAndResetAnalyzer();

    /**
     * Calling this method resets the analyzer to its initial state so that a new run of audio sample buffers can be
     * analyzed.
     * 
     * Call this method if you need to abort generating the audio timed metadata buffer for audio already provided to
     * ``analyzeAudioSample:``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("resetAnalyzer")
    public native void resetAnalyzer();

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

    /**
     * Returns the format description of the sample buffer returned from the
     * ``newTimedMetadataSampleBufferAndResetAnalyzer`` method.
     * 
     * Use this format description when creating your ``AVAssetWriter`` track for spatial audio timed metadata.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("timedMetadataSampleBufferFormatDescription")
    @NotNull
    public native CMFormatDescriptionRef timedMetadataSampleBufferFormatDescription();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}