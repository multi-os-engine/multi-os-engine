package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.struct.AVSampleCursorAudioDependencyInfo;
import apple.avfoundation.struct.AVSampleCursorChunkInfo;
import apple.avfoundation.struct.AVSampleCursorDependencyInfo;
import apple.avfoundation.struct.AVSampleCursorStorageRange;
import apple.avfoundation.struct.AVSampleCursorSyncInfo;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
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
 * API-Since: 16.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleCursor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleCursor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleCursor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSampleCursor allocWithZone(VoidPtr zone);

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

    /**
     * comparePositionInDecodeOrderWithPositionOfCursor:
     * 
     * Compares the relative positions of two AVSampleCursors.
     * 
     * If the receiver and cursor reference different sequences of samples, as when they're created by different
     * instances of AVAssetTrack, results are undefined.
     * 
     * @param cursor
     *               An instance of AVSampleCursor with which to compare positions.
     * @return kCFCompareLessThan, kCFCompareEqualTo or kCFCompareGreaterThan, depending on whether the receiver points
     *         at a sample before, the same as, or after the sample pointed to by the specified AVSampleCursor.
     */
    @Generated
    @Selector("comparePositionInDecodeOrderWithPositionOfCursor:")
    @NInt
    public native long comparePositionInDecodeOrderWithPositionOfCursor(@NotNull AVSampleCursor cursor);

    /**
     * copyCurrentSampleFormatDescription:
     * 
     * Provides the format description of the sample at the receiver's current position.
     */
    @NotNull
    @Generated
    @Selector("copyCurrentSampleFormatDescription")
    public native CMFormatDescriptionRef copyCurrentSampleFormatDescription();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] currentChunkInfo
     * 
     * Provides information about the "chunk" of samples to which the current sample belongs. If the media format that
     * defines the sequence of samples does not signal "chunking" of samples in any way, each sample will be considered
     * by the receiver as belonging to a chunk of one sample only.
     */
    @Generated
    @Selector("currentChunkInfo")
    @ByValue
    public native AVSampleCursorChunkInfo currentChunkInfo();

    /**
     * [@property] currentChunkStorageRange
     * 
     * The offset and length of samples in currentChunkStorageURL that are intended to be loaded together with the
     * current sample as a "chunk".
     * 
     * If the current chunk isn't stored contiguously in its storage container, currentChunkStorageRange.offset will be
     * -1. In such cases you can use AVSampleBufferGenerator to obtain the sample data.
     */
    @Generated
    @Selector("currentChunkStorageRange")
    @ByValue
    public native AVSampleCursorStorageRange currentChunkStorageRange();

    /**
     * [@property] currentChunkStorageURL
     * 
     * The URL of the storage container of the current sample, as well as other samples that are intended to be loaded
     * in the same operation as a "chunk".
     * 
     * May be nil; if nil, the storage location of the chunk is the URL of the sample cursor's track's asset, if it has
     * one.
     */
    @Nullable
    @Generated
    @Selector("currentChunkStorageURL")
    public native NSURL currentChunkStorageURL();

    /**
     * [@property] currentSampleAudioDependencyInfo
     * 
     * Provides information about the independent decodability of an audio sample.
     * 
     * In order to position a sample cursor at the first sample that the audio decoder requires for a full refresh, you
     * will need to walk it back from
     * the current sample until you find a sample that is independently decodable, and whose
     * audioSamplePacketRefreshCount is greater than or equal to
     * the number of steps back you have taken. This implies that if the current sample (before this walk) is
     * independently decodable, with an
     * audioSampleRefreshCount of zero, no walk is required.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("currentSampleAudioDependencyInfo")
    @ByValue
    public native AVSampleCursorAudioDependencyInfo currentSampleAudioDependencyInfo();

    /**
     * [@property] currentSampleDependencyAttachments
     * 
     * Provides a dictionary containing dependency related sample buffer attachments, if known. See
     * kCMSampleAttachmentKey_... in CoreMedia/CMSampleBuffer.h.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("currentSampleDependencyAttachments")
    public native NSDictionary<?, ?> currentSampleDependencyAttachments();

    /**
     * [@property] currentSampleDependencyInfo
     * 
     * Provides information about dependencies between a media sample and other media samples in the same sample
     * sequence, if known.
     */
    @Generated
    @Selector("currentSampleDependencyInfo")
    @ByValue
    public native AVSampleCursorDependencyInfo currentSampleDependencyInfo();

    /**
     * [@property] currentSampleDuration
     * 
     * Indicates the decode duration of the sample at the receiver's current position.
     * 
     * If the receiver must be advanced past its current position in order to determine the decode duration of the
     * current sample, the value of currentSampleDuration is equal to kCMTimeIndefinite. This can occur with streaming
     * formats such as MPEG-2 transport streams.
     */
    @Generated
    @Selector("currentSampleDuration")
    @ByValue
    public native CMTime currentSampleDuration();

    /**
     * [@property] currentSampleIndexInChunk
     * 
     * The index of the current sample within the chunk to which it belongs.
     */
    @Generated
    @Selector("currentSampleIndexInChunk")
    public native long currentSampleIndexInChunk();

    /**
     * [@property] currentSampleStorageRange
     * 
     * The offset and length of the current sample in currentChunkStorageURL.
     * 
     * If the current sample isn't stored contiguously in its storage container, currentSampleStorageRange.offset will
     * be -1. In such cases you can use AVSampleBufferGenerator to obtain the sample data.
     */
    @Generated
    @Selector("currentSampleStorageRange")
    @ByValue
    public native AVSampleCursorStorageRange currentSampleStorageRange();

    /**
     * [@property] currentSampleSyncInfo
     * 
     * Provides information about the current sample for consideration when resynchronizing a decoder, as when
     * scrubbing.
     */
    @Generated
    @Selector("currentSampleSyncInfo")
    @ByValue
    public native AVSampleCursorSyncInfo currentSampleSyncInfo();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] decodeTimeStamp
     * 
     * The decode timestamp (DTS) of the sample at the current position of the cursor.
     */
    @Generated
    @Selector("decodeTimeStamp")
    @ByValue
    public native CMTime decodeTimeStamp();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVSampleCursor init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native AVSampleCursor new_objc();

    /**
     * [@property] presentationTimeStamp
     * 
     * The presentation timestamp (PTS) of the sample at the current position of the cursor.
     */
    @Generated
    @Selector("presentationTimeStamp")
    @ByValue
    public native CMTime presentationTimeStamp();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] samplesRequiredForDecoderRefresh
     * 
     * Count of samples prior to the current sample, in decode order, that the decoder requires in order to achieve
     * fully coherent output at the current decode time, as after a seek. Zero will be returned if no samples are
     * required for decoder refresh or if the track does not contain this information.
     * 
     * Some sample sequences that do not indicate sample dependencies may instead indicate that in order for a specific
     * sample to be decoded with all available accuracy, samples prior to that sample in decode order must be decoded
     * before the specific sample is decoded.
     * 
     * In order to position a sample cursor at the first sample that the decoder requires for a full refresh, you can
     * use code like the following:
     * 
     * 
     * NSInteger samplesPriorToCurrentSampleToFeedToDecoder = [mySampleCursor samplesRequiredForDecoderRefresh];
     * AVSampleCursor *cursorForObtainingRefreshSamples = [mySampleCursor copy];
     * [cursorForObtainingRefreshSamples stepInDecodeOrderByCount: -samplesPriorToCurrentSampleToFeedToDecoder ];
     * 
     * // cursorForObtainingRefreshSamples is now positioned at the first sample that must be provided to the decoder
     * // in order to decode the sample at the position of mySampleCursor in full
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("samplesRequiredForDecoderRefresh")
    @NInt
    public native long samplesRequiredForDecoderRefresh();

    /**
     * samplesWithEarlierDecodeTimeStampsMayHaveLaterPresentationTimeStampsThanCursor:
     * 
     * This method tests a boundary in the reordering from decode order to presentation order, determining whether it's
     * possible for any sample earlier in decode order than the sample at the position of the receiver can have a
     * presentation timestamp later than that of the specified sample cursor.
     * 
     * If the receiver and cursor reference different sequences of samples, as when they're created by different
     * instances of AVAssetTrack, results are undefined.
     * 
     * @param cursor
     *               An instance of AVSampleCursor with which to test the sample reordering boundary.
     * @return YES if it's possible for any sample earlier in decode order than the sample at the position of the
     *         receiver can have a presentation timestamp later than that of the specified sample cursor.
     */
    @Generated
    @Selector("samplesWithEarlierDecodeTimeStampsMayHaveLaterPresentationTimeStampsThanCursor:")
    public native boolean samplesWithEarlierDecodeTimeStampsMayHaveLaterPresentationTimeStampsThanCursor(
            @NotNull AVSampleCursor cursor);

    /**
     * samplesWithLaterDecodeTimeStampsMayHaveEarlierPresentationTimeStampsThanCursor:
     * 
     * This method tests a boundary in the reordering from decode order to presentation order, determining whether it's
     * possible for any sample later in decode order than the sample at the position of the receiver can have a
     * presentation timestamp earlier than that of the specified sample cursor.
     * 
     * If the receiver and cursor reference different sequences of samples, as when they're created by different
     * instances of AVAssetTrack, results are undefined.
     * 
     * @param cursor
     *               An instance of AVSampleCursor with which to test the sample reordering boundary.
     * @return YES if it's possible for any sample later in decode order than the sample at the position of the receiver
     *         can have a presentation timestamp earlier than that of the specified sample cursor.
     */
    @Generated
    @Selector("samplesWithLaterDecodeTimeStampsMayHaveEarlierPresentationTimeStampsThanCursor:")
    public native boolean samplesWithLaterDecodeTimeStampsMayHaveEarlierPresentationTimeStampsThanCursor(
            @NotNull AVSampleCursor cursor);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * stepByDecodeTime:wasPinned:
     * 
     * Moves the cursor by a given deltaTime on the decode timeline.
     * 
     * @param deltaDecodeTime
     *                        The amount of time to move in the decode timeline.
     * @param outWasPinned
     *                        If the beginning or the end of the sample sequence was reached before the requested
     *                        deltaDecodeTime was traversed, the BOOL value at the address specified by outWasPinned
     *                        will be set to YES. May be NULL if this information isn't desired.
     * @return The amount of time the cursor was moved along the decode timeline. Because sample cursors snap to sample
     *         boundaries when stepped, this value may not be equal to deltaDecodeTime even if the cursor was not
     *         pinned.
     */
    @Generated
    @Selector("stepByDecodeTime:wasPinned:")
    @ByValue
    public native CMTime stepByDecodeTimeWasPinned(@ByValue CMTime deltaDecodeTime, @Nullable BoolPtr outWasPinned);

    /**
     * stepByPresentationTime:wasPinned:
     * 
     * Moves the cursor by a given deltaTime on the presentation timeline.
     * 
     * @param deltaPresentationTime
     *                              The amount of time to move in the presentation timeline.
     * @param outWasPinned
     *                              If the beginning or the end of the sample sequence was reached before the requested
     *                              deltaPresentationTime was traversed, the BOOL value at the address specified by
     *                              outWasPinned will be set to YES. May be NULL if this information isn't desired.
     * @return The amount of time the cursor was moved along the presentation timeline. Because sample cursors snap to
     *         sample boundaries when stepped, this value may not be equal to deltaPresentationTime even if the cursor
     *         was not pinned.
     */
    @Generated
    @Selector("stepByPresentationTime:wasPinned:")
    @ByValue
    public native CMTime stepByPresentationTimeWasPinned(@ByValue CMTime deltaPresentationTime,
            @Nullable BoolPtr outWasPinned);

    /**
     * stepInDecodeOrderByCount:
     * 
     * Moves the cursor a given number of samples in decode order.
     * 
     * @param stepCount
     *                  The number of samples to move across. If positive, step forward this many samples. If negative,
     *                  step backward (-stepCount) samples.
     * @return The number of samples the cursor traversed. If the beginning or the end of the sample sequence was
     *         reached before the requested number of samples was traversed, the absolute value of the result will be
     *         less than the absolute value of stepCount.
     */
    @Generated
    @Selector("stepInDecodeOrderByCount:")
    public native long stepInDecodeOrderByCount(long stepCount);

    /**
     * stepInPresentationOrderByCount:
     * 
     * Moves the cursor a given number of samples in presentation order.
     * 
     * @param stepCount
     *                  The number of samples to move across. If positive, step forward this many samples. If negative,
     *                  step backward (-stepCount) samples.
     * @return The number of samples the cursor traversed. If the beginning or the end of the sample sequence was
     *         reached before the requested number of samples was traversed, the absolute value of the result will be
     *         less than the absolute value of stepCount.
     */
    @Generated
    @Selector("stepInPresentationOrderByCount:")
    public native long stepInPresentationOrderByCount(long stepCount);

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