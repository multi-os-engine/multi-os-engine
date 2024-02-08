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

package apple.coremedia.c;

import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioChannelLayout;
import apple.coreaudiotypes.struct.AudioFormatListItem;
import apple.coreaudiotypes.struct.AudioStreamBasicDescription;
import apple.coreaudiotypes.struct.AudioStreamPacketDescription;
import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFRunLoopTimerRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.struct.CFRange;
import apple.coremedia.opaque.CMBlockBufferRef;
import apple.coremedia.opaque.CMBufferQueueRef;
import apple.coremedia.opaque.CMBufferQueueTriggerToken;
import apple.coremedia.opaque.CMClockRef;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMMemoryPoolRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.opaque.CMSimpleQueueRef;
import apple.coremedia.opaque.CMTimebaseRef;
import apple.coremedia.struct.CMBlockBufferCustomBlockSource;
import apple.coremedia.struct.CMBufferCallbacks;
import apple.coremedia.struct.CMSampleTimingInfo;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeMapping;
import apple.coremedia.struct.CMTimeRange;
import apple.coremedia.struct.CMVideoDimensions;
import apple.corevideo.opaque.CVBufferRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.coremedia.opaque.CMMutableTagCollectionRef;
import apple.coremedia.opaque.CMTagCollectionRef;
import apple.coremedia.opaque.CMTaggedBufferGroupRef;
import apple.coremedia.struct.CMTag;
import apple.opaque.dispatch_source_t;
import org.moe.natj.general.ptr.ConstIntPtr;

@Generated
@Library("CoreMedia")
@Runtime(CRuntime.class)
public final class CoreMedia {
    static {
        NatJ.register();
    }

    @Generated
    private CoreMedia() {
    }

    /**
     * [@function] CMTimeMake
     * 
     * Make a valid CMTime with value and timescale. Epoch is implied to be 0.
     * 
     * @return The resulting CMTime.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMake(long value, int timescale);

    /**
     * [@function] CMTimeMakeWithEpoch
     * 
     * Make a valid CMTime with value, scale and epoch.
     * 
     * @return The resulting CMTime.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithEpoch(long value, int timescale, long epoch);

    /**
     * [@function] CMTimeMakeWithSeconds
     * 
     * Make a CMTime from a Float64 number of seconds, and a preferred timescale.
     * 
     * The epoch of the result will be zero. If preferredTimescale is <= 0, the result
     * will be an invalid CMTime. If the preferred timescale will cause an overflow, the
     * timescale will be halved repeatedly until the overflow goes away, or the timescale
     * is 1. If it still overflows at that point, the result will be +/- infinity. The
     * kCMTimeFlags_HasBeenRounded flag will be set if the result, when converted back to
     * seconds, is not exactly equal to the original seconds value.
     * 
     * @return The resulting CMTime.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithSeconds(double seconds, int preferredTimescale);

    /**
     * [@function] CMTimeGetSeconds
     * 
     * Converts a CMTime to seconds.
     * 
     * If the CMTime is invalid or indefinite, NAN is returned. If the CMTime is infinite, +/- __inf()
     * is returned. If the CMTime is numeric, epoch is ignored, and time.value / time.timescale is
     * returned. The division is done in Float64, so the fraction is not lost in the returned result.
     * 
     * @return The resulting Float64 number of seconds.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native double CMTimeGetSeconds(@ByValue CMTime time);

    /**
     * [@function] CMTimeConvertScale
     * 
     * Returns a new CMTime containing the source CMTime converted to a new timescale (rounding as requested).
     * 
     * If the value needs to be rounded, the kCMTimeFlags_HasBeenRounded flag will be set.
     * See definition of CMTimeRoundingMethod for a discussion of the various rounding methods available. If
     * the source time is non-numeric (ie. infinite, indefinite, invalid), the result will be similarly non-numeric.
     * 
     * @return The converted result CMTime.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeConvertScale(@ByValue CMTime time, int newTimescale, int method);

    /**
     * [@function] CMTimeAdd
     * 
     * Returns the sum of two CMTimes.
     * 
     * If the operands both have the same timescale, the timescale of the result will be the same as
     * the operands' timescale. If the operands have different timescales, the timescale of the result
     * will be the least common multiple of the operands' timescales. If that LCM timescale is
     * greater than kCMTimeMaxTimescale, the result timescale will be kCMTimeMaxTimescale,
     * and default rounding will be applied when converting the result to this timescale.
     * 
     * If the result value overflows, the result timescale will be repeatedly halved until the result
     * value no longer overflows. Again, default rounding will be applied when converting the
     * result to this timescale. If the result value still overflows when timescale == 1, then the
     * result will be either positive or negative infinity, depending on the direction of the
     * overflow.
     * 
     * If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * set. This flag will also be set if either of the operands has kCMTimeFlags_HasBeenRounded set.
     * 
     * If either of the operands is invalid, the result will be invalid.
     * 
     * If the operands are valid, but just one operand is infinite, the result will be similarly
     * infinite. If the operands are valid, and both are infinite, the results will be as follows:
     * <ul> +infinity + +infinity == +infinity
     * <li> -infinity + -infinity == -infinity
     * <li> +infinity + -infinity == invalid
     * <li> -infinity + +infinity == invalid
     * </ul>
     * If the operands are valid, not infinite, and either or both is indefinite, the result
     * will be indefinite.
     * 
     * If the two operands are numeric (ie. valid, not infinite, not indefinite), but have
     * different nonzero epochs, the result will be invalid. If they have the same nonzero
     * epoch, the result will have epoch zero (a duration). Times in different epochs
     * cannot be added or subtracted, because epoch length is unknown. Times in epoch zero
     * are considered to be durations and can be added to times in other epochs.
     * Times in different epochs can be compared, however, because numerically greater
     * epochs always occur after numerically lesser epochs.
     * 
     * @return The sum of the two CMTimes (lhs + rhs).
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAdd(@ByValue CMTime lhs, @ByValue CMTime rhs);

    /**
     * [@function] CMTimeSubtract
     * 
     * Returns the difference of two CMTimes.
     * 
     * If the operands both have the same timescale, the timescale of the result will be the same as
     * the operands' timescale. If the operands have different timescales, the timescale of the result
     * will be the least common multiple of the operands' timescales. If that LCM timescale is
     * greater than kCMTimeMaxTimescale, the result timescale will be kCMTimeMaxTimescale,
     * and default rounding will be applied when converting the result to this timescale.
     * 
     * If the result value overflows, the result timescale will be repeatedly halved until the result
     * value no longer overflows. Again, default rounding will be applied when converting the
     * result to this timescale. If the result value still overflows when timescale == 1, then the
     * result will be either positive or negative infinity, depending on the direction of the
     * overflow.
     * 
     * If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * set. This flag will also be set if either of the operands has kCMTimeFlags_HasBeenRounded set.
     * 
     * If either of the operands is invalid, the result will be invalid.
     * 
     * If the operands are valid, but just one operand is infinite, the result will be similarly
     * infinite. If the operands are valid, and both are infinite, the results will be as follows:
     * <ul> +infinity - +infinity == invalid
     * <li> -infinity - -infinity == invalid
     * <li> +infinity - -infinity == +infinity
     * <li> -infinity - +infinity == -infinity
     * </ul>
     * If the operands are valid, not infinite, and either or both is indefinite, the result
     * will be indefinite.
     * 
     * If the two operands are numeric (ie. valid, not infinite, not indefinite), but have
     * different nonzero epochs, the result will be invalid. If they have the same nonzero
     * epoch, the result will have epoch zero (a duration). Times in different epochs
     * cannot be added or subtracted, because epoch length is unknown. Times in epoch zero
     * are considered to be durations and can be subtracted from times in other epochs.
     * Times in different epochs can be compared, however, because numerically greater
     * epochs always occur after numerically lesser epochs.
     * 
     * @return The difference of the two CMTimes (lhs - rhs).
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeSubtract(@ByValue CMTime lhs, @ByValue CMTime rhs);

    /**
     * [@function] CMTimeMultiply
     * 
     * Returns the product of a CMTime and a 32-bit integer.
     * 
     * The result will have the same timescale as the CMTime operand. If the result value overflows,
     * the result timescale will be repeatedly halved until the result value no longer overflows.
     * Again, default rounding will be applied when converting the result to this timescale. If the
     * result value still overflows when timescale == 1, then the result will be either positive or
     * negative infinity, depending on the direction of the overflow.
     * 
     * If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * set. This flag will also be set if the CMTime operand has kCMTimeFlags_HasBeenRounded set.
     * 
     * If the CMTime operand is invalid, the result will be invalid.
     * 
     * If the CMTime operand is valid, but infinite, the result will be infinite, and of an appropriate sign, given
     * the signs of both operands.
     * 
     * If the CMTime operand is valid, but indefinite, the result will be indefinite.
     * 
     * @return The product of the CMTime and the 32-bit integer.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiply(@ByValue CMTime time, int multiplier);

    /**
     * [@function] CMTimeMultiplyByFloat64
     * 
     * Returns the product of a CMTime and a 64-bit float.
     * 
     * The result will initially have the same timescale as the CMTime operand.
     * If the result timescale is less than 65536, it will be repeatedly doubled until it is at least 65536.
     * If the result value overflows, the result timescale will be repeatedly halved until the
     * result value no longer overflows.
     * Again, default rounding will be applied when converting the result to this timescale. If the
     * result value still overflows when timescale == 1, then the result will be either positive or
     * negative infinity, depending on the direction of the overflow.
     * 
     * If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * set. This flag will also be set if the CMTime operand has kCMTimeFlags_HasBeenRounded set.
     * 
     * If the CMTime operand is invalid, the result will be invalid.
     * 
     * If the CMTime operand is valid, but infinite, the result will be infinite, and of an appropriate sign, given
     * the signs of both operands.
     * 
     * If the CMTime operand is valid, but indefinite, the result will be indefinite.
     * 
     * @return The product of the CMTime and the 64-bit float.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByFloat64(@ByValue CMTime time, double multiplier);

    /**
     * [@function] CMTimeMultiplyByRatio
     * 
     * Returns the result of multiplying a CMTime by an integer, then dividing by another integer.
     * 
     * The exact rational value will be preserved, if possible without overflow. If an overflow
     * would occur, a new timescale will be chosen so as to minimize the rounding error.
     * Default rounding will be applied when converting the result to this timescale. If the
     * result value still overflows when timescale == 1, then the result will be either positive
     * or negative infinity, depending on the direction of the overflow.
     * 
     * If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * set. This flag will also be set if the CMTime operand has kCMTimeFlags_HasBeenRounded set.
     * 
     * If the denominator, and either the time or the numerator, are zero, the result will be
     * kCMTimeInvalid. If only the denominator is zero, the result will be either kCMTimePositiveInfinity
     * or kCMTimeNegativeInfinity, depending on the signs of the other arguments.
     * 
     * If time is invalid, the result will be invalid. If time is infinite, the result will be
     * similarly infinite. If time is indefinite, the result will be indefinite.
     * 
     * @return (time * multiplier) / divisor
     * 
     *         API-Since: 7.1
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByRatio(@ByValue CMTime time, int multiplier, int divisor);

    /**
     * [@function] CMTimeCompare
     * 
     * Returns the numerical relationship (-1 = less than, 1 = greater than, 0 = equal) of two CMTimes.
     * 
     * If the two CMTimes are numeric (ie. not invalid, infinite, or indefinite), and have
     * different epochs, it is considered that times in numerically larger epochs are always
     * greater than times in numerically smaller epochs.
     * 
     * Since this routine will be used to sort lists by time, it needs to give all values
     * (even invalid and indefinite ones) a strict ordering to guarantee that sort algorithms
     * terminate safely. The order chosen is somewhat arbitrary:
     * 
     * -infinity < all finite values < indefinite < +infinity < invalid
     * 
     * Invalid CMTimes are considered to be equal to other invalid CMTimes, and greater than
     * any other CMTime. Positive infinity is considered to be less than any invalid CMTime,
     * equal to itself, and greater than any other CMTime. An indefinite CMTime is considered
     * to be less than any invalid CMTime, less than positive infinity, equal to itself,
     * and greater than any other CMTime. Negative infinity is considered to be equal to itself,
     * and less than any other CMTime.
     * 
     * -1 is returned if time1 is less than time2. 0 is returned if they
     * are equal. 1 is returned if time1 is greater than time2.
     * 
     * @return The numerical relationship of the two CMTimes (-1 = less than, 1 = greater than, 0 = equal).
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTimeCompare(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * [@function] CMTimeMinimum
     * 
     * Returns the lesser of two CMTimes (as defined by CMTimeCompare).
     * 
     * @return The lesser of the two CMTimes.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMinimum(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * [@function] CMTimeMaximum
     * 
     * Returns the greater of two CMTimes (as defined by CMTimeCompare).
     * 
     * @return The greater of the two CMTimes.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMaximum(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * [@function] CMTimeAbsoluteValue
     * 
     * Returns the absolute value of a CMTime.
     * 
     * @return Same as the argument time, with sign inverted if negative.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAbsoluteValue(@ByValue CMTime time);

    /**
     * [@function] CMTimeCopyAsDictionary
     * 
     * Returns a CFDictionary version of a CMTime.
     * 
     * This is useful when putting CMTimes in CF container types.
     * 
     * @return A CFDictionary version of the CMTime.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeCopyAsDictionary(@ByValue CMTime time,
            @Nullable CFAllocatorRef allocator);

    /**
     * [@function] CMTimeMakeFromDictionary
     * 
     * Reconstitutes a CMTime struct from a CFDictionary previously created by CMTimeCopyAsDictionary.
     * 
     * This is useful when getting CMTimes from CF container types. If the CFDictionary does not
     * have the requisite keyed values, an invalid time is returned.
     * 
     * @return The created CMTime.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeFromDictionary(@Nullable CFDictionaryRef dictionaryRepresentation);

    /**
     * [@function] CMTimeCopyDescription
     * 
     * Creates a CFString with a description of a CMTime (just like CFCopyDescription).
     * 
     * This is used from within CFShow on an object that contains CMTime fields. It is
     * also useful from other client debugging code. The caller owns the returned
     * CFString, and is responsible for releasing it.
     * 
     * @return The created CFString description.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CMTimeCopyDescription(@Nullable CFAllocatorRef allocator, @ByValue CMTime time);

    /**
     * [@function] CMTimeShow
     * 
     * Prints a description of the CMTime (just like CFShow).
     * 
     * This is most useful from within gdb.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CMTimeShow(@ByValue CMTime time);

    /**
     * [@function] CMTimeRangeMake
     * 
     * Make a valid CMTimeRange with start and duration.
     * 
     * The duration parameter must have an epoch of 0; otherwise an invalid time range will be returned.
     * 
     * API-Since: 4.0
     * 
     * @return The resulting CMTimeRange.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMake(@ByValue CMTime start, @ByValue CMTime duration);

    /**
     * [@function] CMTimeRangeGetUnion
     * 
     * Returns the union of two CMTimeRanges.
     * 
     * This function returns a CMTimeRange structure that represents the union of the time ranges specified by the
     * <i>range</i> and <i>otherRange</i> parameters.
     * This is the smallest range that includes all times that are in either range.
     * 
     * @return The union of the two CMTimeRanges.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetUnion(@ByValue CMTimeRange range, @ByValue CMTimeRange otherRange);

    /**
     * [@function] CMTimeRangeGetIntersection
     * 
     * Returns the intersection of two CMTimeRanges.
     * 
     * This function returns a CMTimeRange structure that represents the intersection of the time ranges specified by
     * the <i>range</i> and <i>otherRange</i> parameters.
     * This is the largest range that both ranges include.
     * 
     * @return The intersection of the two CMTimeRanges.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetIntersection(@ByValue CMTimeRange range,
            @ByValue CMTimeRange otherRange);

    /**
     * [@function] CMTimeRangeEqual
     * 
     * Returns a Boolean value that indicates whether two CMTimeRanges are identical.
     * 
     * This function returns a Boolean value that indicates whether the time ranges specified by the <i>range1</i> and
     * <i>range2</i> parameters are identical.
     * 
     * @return Returns true if the two time ranges are identical, false if they differ.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeEqual(@ByValue CMTimeRange range1, @ByValue CMTimeRange range2);

    /**
     * [@function] CMTimeRangeContainsTime
     * 
     * Indicates whether a time is contained within a time range.
     * 
     * This function returns a Boolean value that indicates whether the time specified by the <i>time</i> parameter
     * is contained within the range specified by the <i>range</i> parameter.
     * 
     * @return Returns true if the specified time is contained within the specified time range, false if it is not.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTime(@ByValue CMTimeRange range, @ByValue CMTime time);

    /**
     * [@function] CMTimeRangeContainsTimeRange
     * 
     * Indicates whether a time range is contained within a time range.
     * 
     * This function returns a Boolean value that indicates whether the time range specified by the <i>range</i>
     * parameter
     * contains the range specified by the <i>otherRange</i> parameter.
     * 
     * @return Returns true if the second time range is contained within the first time range, false if it is not.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTimeRange(@ByValue CMTimeRange range, @ByValue CMTimeRange otherRange);

    /**
     * [@function] CMTimeRangeGetEnd
     * 
     * Returns a CMTime structure representing the end of a time range.
     * 
     * This function returns a CMTime structure that indicates the end of the time range specified by the <i>range</i>
     * parameter.
     * CMTimeRangeContainsTime(range, CMTimeRangeGetEnd(range)) is always false.
     * 
     * API-Since: 4.0
     * 
     * @return A CMTime structure representing the end of the specified time range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeRangeGetEnd(@ByValue CMTimeRange range);

    /**
     * [@function] CMTimeMapTimeFromRangeToRange
     * 
     * Translates a time through a mapping from CMTimeRange to CMTimeRange.
     * 
     * The start and end time of fromRange will be mapped to the start and end time of toRange respectively.
     * Other times will be mapped linearly, using the formula:
     * result = (t-fromRange.start)*(toRange.duration/fromRange.duration)+toRange.start
     * If either CMTimeRange argument is empty, an invalid CMTime will be returned.
     * If t does not have the same epoch as fromRange.start, an invalid CMTime will be returned.
     * If both fromRange and toRange have duration kCMTimePositiveInfinity,
     * t will be offset relative to the differences between their starts, but not scaled.
     * 
     * API-Since: 4.0
     * 
     * @return A CMTime structure representing the translated time.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapTimeFromRangeToRange(@ByValue CMTime t, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    /**
     * [@function] CMTimeClampToRange
     * 
     * For a given CMTime and CMTimeRange, returns the nearest CMTime inside that time range.
     * 
     * Times inside the given time range will be returned unmodified.
     * Times before the start and after the end time of the time range will return the start and end time of
     * the range respectively.
     * If the CMTimeRange argument is empty, an invalid CMTime will be returned.
     * If the given CMTime is invalid, the returned CMTime will be invalid,
     * 
     * API-Since: 4.0
     * 
     * @return A CMTime structure inside the given time range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeClampToRange(@ByValue CMTime time, @ByValue CMTimeRange range);

    /**
     * [@function] CMTimeMapDurationFromRangeToRange
     * 
     * Translates a duration through a mapping from CMTimeRange to CMTimeRange.
     * 
     * The duration will be scaled in proportion to the ratio between the ranges' durations:
     * result = dur*(toRange.duration/fromRange.duration)
     * If dur does not have the epoch zero, an invalid CMTime will be returned.
     * 
     * API-Since: 4.0
     * 
     * @return A CMTime structure representing the translated duration.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapDurationFromRangeToRange(@ByValue CMTime dur, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    /**
     * [@function] CMTimeRangeFromTimeToTime
     * 
     * Make a valid CMTimeRange with the given starting and ending times.
     * 
     * @return The resulting CMTimeRange.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeFromTimeToTime(@ByValue CMTime start, @ByValue CMTime end);

    /**
     * [@function] CMTimeRangeCopyAsDictionary
     * 
     * Returns a CFDictionary version of a CMTimeRange.
     * 
     * This is useful when putting CMTimeRanges in CF container types.
     * 
     * @return A CFDictionary version of the CMTimeRange.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeRangeCopyAsDictionary(@ByValue CMTimeRange range,
            @Nullable CFAllocatorRef allocator);

    /**
     * [@function] CMTimeRangeMakeFromDictionary
     * 
     * Reconstitutes a CMTimeRange struct from a CFDictionary previously created by CMTimeRangeCopyAsDictionary.
     * 
     * This is useful when getting CMTimeRanges from CF container types. If the CFDictionary does not
     * have the requisite keyed values, an invalid time range is returned.
     * 
     * @return The created CMTimeRange.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMakeFromDictionary(@NotNull CFDictionaryRef dictionaryRepresentation);

    /**
     * [@function] CMTimeRangeCopyDescription
     * 
     * Creates a CFString with a description of a CMTimeRange (just like CFCopyDescription).
     * 
     * This is used from within CFShow on an object that contains CMTimeRange fields. It is
     * also useful from other client debugging code. The caller owns the returned CFString and is responsible for
     * releasing it.
     * 
     * @return The created CFString description.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CMTimeRangeCopyDescription(@Nullable CFAllocatorRef allocator,
            @ByValue CMTimeRange range);

    /**
     * [@function] CMTimeRangeShow
     * 
     * Prints a description of the CMTimeRange (just like CFShow).
     * 
     * This is most useful from within gdb.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CMTimeRangeShow(@ByValue CMTimeRange range);

    /**
     * [@function] CMTimeMappingMake
     * 
     * Make a valid CMTimeMapping with source and target.
     * 
     * The source and target parameters must have durations whose epoch is 0; otherwise an invalid time mapping will be
     * returned.
     * 
     * API-Since: 9.0
     * 
     * @return The resulting CMTimeMapping.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMake(@ByValue CMTimeRange source, @ByValue CMTimeRange target);

    /**
     * [@function] CMTimeMappingMakeEmpty
     * 
     * Make a valid CMTimeMapping with an empty source.
     * 
     * The target parameter must have a duration whose epoch is 0; otherwise an invalid time mapping will be returned.
     * 
     * API-Since: 9.0
     * 
     * @return The resulting CMTimeMapping.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMakeEmpty(@ByValue CMTimeRange target);

    /**
     * [@function] CMTimeMappingCopyAsDictionary
     * 
     * Returns a CFDictionary version of a CMTimeMapping.
     * 
     * This is useful when putting CMTimeMappings in CF container types.
     * 
     * @return A CFDictionary version of the CMTimeMapping.
     * 
     *         API-Since: 9.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeMappingCopyAsDictionary(@ByValue CMTimeMapping mapping,
            @Nullable CFAllocatorRef allocator);

    /**
     * [@function] CMTimeMappingMakeFromDictionary
     * 
     * Reconstitutes a CMTimeMapping struct from a CFDictionary previously created by CMTimeMappingCopyAsDictionary.
     * 
     * This is useful when getting CMTimeMappings from CF container types. If the CFDictionary does not
     * have the requisite keyed values, an invalid time mapping is returned.
     * 
     * @return The created CMTimeMapping.
     * 
     *         API-Since: 9.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMakeFromDictionary(
            @NotNull CFDictionaryRef dictionaryRepresentation);

    /**
     * [@function] CMTimeMappingCopyDescription
     * 
     * Creates a CFString with a description of a CMTimeMapping (just like CFCopyDescription).
     * 
     * This is used from within CFShow on an object that contains CMTimeMapping fields. It is
     * also useful from other client debugging code. The caller owns the returned CFString and is responsible for
     * releasing it.
     * 
     * @return The created CFString description.
     * 
     *         API-Since: 9.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CMTimeMappingCopyDescription(@Nullable CFAllocatorRef allocator,
            @ByValue CMTimeMapping mapping);

    /**
     * [@function] CMTimeMappingShow
     * 
     * Prints a description of a CMTimeMapping (just like CFShow).
     * 
     * This is most useful from within gdb.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CFunction
    public static native void CMTimeMappingShow(@ByValue CMTimeMapping mapping);

    /**
     * [@function] CMSetAttachment
     * 
     * Sets or adds a attachment of a CMAttachmentBearer
     * 
     * You can attach any CF object to a CMAttachmentBearer object to store additional information. CMSetAttachment
     * stores an attachment identified by a key. If the key doesn't exist, the attachment will be added. If the key does
     * exist, the existing attachment will be replaced. In both cases the retain count of the attachment will be
     * incremented. The value can be any CFType but nil has no defined behavior. Given a CVBufferRef, CMSetAttachment is
     * equivalent to CVBufferSetAttachment.
     * 
     * @param target         Target CMAttachmentBearer.
     * @param key            Key in form of a CFString identifying the desired attachment.
     * @param value          Attachment in form af a CF object.
     * @param attachmentMode Specifies which attachment mode is desired for this attachment. A particular attachment key
     *                       may only exist in
     *                       a single mode at a time.
     * 
     *                       API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CMSetAttachment(@NotNull ConstVoidPtr target, @NotNull CFStringRef key,
            @Nullable ConstVoidPtr value, int attachmentMode);

    /**
     * [@function] CMGetAttachment
     * 
     * Returns a specific attachment of a CMAttachmentBearer
     * 
     * You can attach any CF object to a CMAttachmentBearer to store additional information. CMGetAttachment retrieves
     * an attachment identified by a key. Given a CVBufferRef, CMGetAttachment is equivalent to CVBufferGetAttachment.
     * 
     * @param target            Target CMAttachmentBearer.
     * @param key               Key in form of a CFString identifying the desired attachment.
     * @param attachmentModeOut Returns the mode of the attachment, if desired. May be NULL.
     * @return If found the attachment object; else NULL.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMGetAttachment(@NotNull ConstVoidPtr target, @NotNull CFStringRef key,
            @Nullable IntPtr attachmentModeOut);

    /**
     * [@function] CMRemoveAttachment
     * 
     * Removes a specific attachment of a CMAttachmentBearer
     * 
     * CMRemoveAttachment removes an attachment identified by a key. If found the attachment is removed and the retain
     * count decremented. Given a CVBufferRef, CMRemoveAttachment is equivalent to CVBufferRemoveAttachment.
     * 
     * @param target Target CMAttachmentBearer.
     * @param key    Key in form of a CFString identifying the desired attachment.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CMRemoveAttachment(@NotNull ConstVoidPtr target, @NotNull CFStringRef key);

    /**
     * [@function] CMRemoveAllAttachments
     * 
     * Removes all attachments of a CMAttachmentBearer
     * 
     * While CMRemoveAttachment removes a specific attachment identified by a key CMRemoveAllAttachments removes all
     * attachments of a buffer and decrements their retain counts. Given a CVBufferRef, CMRemoveAllAttachments is
     * equivalent to CVBufferRemoveAllAttachments.
     * 
     * @param target Target CMAttachmentBearer.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CMRemoveAllAttachments(@NotNull ConstVoidPtr target);

    /**
     * [@function] CMCopyDictionaryOfAttachments
     * 
     * Returns all attachments of a CMAttachmentBearer
     * 
     * CMCopyDictionaryOfAttachments is a convenience call that returns all attachments with their corresponding keys in
     * a new CFDictionary that the caller must dispose by calling CFRelease. Given a CVBufferRef,
     * CMCopyDictionaryOfAttachments is similar to CVBufferGetAttachments, except that CVBufferGetAttachments returns a
     * CFDictionary that may change if attachments are added later.
     * 
     * @param allocator Allocator for the new dictionary; pass kCFAllocatorDefault or NULL to use the default allocator.
     * @param target    Target CMAttachmentBearer.
     * @return A CFDictionary with all buffer attachments identified by there keys. If no attachment is present, NULL is
     *         returned. Returns NULL
     *         for invalid attachment mode.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CMCopyDictionaryOfAttachments(@Nullable CFAllocatorRef allocator,
            @NotNull ConstVoidPtr target, int attachmentMode);

    /**
     * [@function] CMSetAttachments
     * 
     * Sets a set of attachments for a CMAttachmentBearer
     * 
     * CMSetAttachments is a convenience call that in turn calls CMSetAttachment for each key and value in the given
     * dictionary. All key value pairs must be in the root level of the dictionary. Given a CVBufferRef,
     * CMSetAttachments is equivalent to CVBufferSetAttachments.
     * 
     * @param target Target CMAttachmentBearer.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CMSetAttachments(@NotNull ConstVoidPtr target, @NotNull CFDictionaryRef theAttachments,
            int attachmentMode);

    /**
     * [@function] CMPropagateAttachments
     * 
     * Copy all propagatable attachments from one buffer to another.
     * 
     * CMPropagateAttachments is a convenience call that copies all attachments with a mode of
     * kCMAttachmentMode_ShouldPropagate from one
     * buffer to another. Given a CVBufferRef, CMPropagateAttachments is equivalent to CVBufferPropagateAttachments.
     * 
     * @param source      CMAttachmentBearer to copy attachments from.
     * @param destination CMAttachmentBearer to copy attachments to.
     * 
     *                    API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CMPropagateAttachments(@NotNull ConstVoidPtr source, @NotNull ConstVoidPtr destination);

    /**
     * [@function] CMBlockBufferCreateEmpty
     * 
     * Creates an empty CMBlockBuffer
     * 
     * Creates an empty CMBlockBuffer, i.e. one which has no memory block nor reference to a CMBlockBuffer
     * supplying bytes to it. It is ready to be populated using CMBlockBufferAppendMemoryBlock()
     * and/or CMBlockBufferAppendBufferReference(). CMBlockBufferGetDataLength() will return zero for
     * an empty CMBlockBuffer and CMBlockBufferGetDataPointer() and CMBlockBufferAssureBufferMemory() will fail.
     * The memory for the CMBlockBuffer object will be allocated using the given allocator.
     * If NULL is passed for the allocator, the default allocator is used.
     * 
     * @param structureAllocator Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     *                           default allocator to be used.
     * @param subBlockCapacity   Number of subBlocks the newBlockBuffer shall accommodate before expansion occurs.
     *                           A value of zero means "do the reasonable default"
     * @param flags              Feature and control flags
     * @param blockBufferOut     Receives newly-created empty CMBlockBuffer object with retain count of 1. Must not be
     *                           NULL.
     * 
     * @return Returns kCMBlockBufferNoErr if successful.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateEmpty(@Nullable CFAllocatorRef structureAllocator, int subBlockCapacity,
            int flags, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMBlockBufferCreateWithMemoryBlock
     * 
     * Creates a new CMBlockBuffer backed by a memory block (or promise thereof).
     * 
     * Creates a new CMBlockBuffer backed by a memory block. The memory block may be statically allocated, dynamically
     * allocated
     * using the given allocator (or customBlockSource) or not yet allocated. The returned CMBlockBuffer may be further
     * expanded using
     * CMBlockBufferAppendMemoryBlock() and/or CMBlockBufferAppendBufferReference().
     * 
     * If the kCMBlockBufferAssureMemoryNowFlag is set in the flags parameter, the memory block is allocated immediately
     * using the blockAllocator or
     * customBlockSource.
     * 
     * @param structureAllocator Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     *                           default allocator to be used.
     * @param memoryBlock        Block of memory to hold buffered data. If NULL, a memory block will be allocated when
     *                           needed (via a call
     *                           to CMBlockBufferAssureBlockMemory()) using the provided blockAllocator or
     *                           customBlockSource. If non-NULL,
     *                           the block will be used and will be deallocated when the new CMBlockBuffer is finalized
     *                           (i.e. released for
     *                           the last time).
     * @param blockLength        Overall length of the memory block in bytes. Must not be zero. This is the size of the
     *                           supplied memory block or the size to allocate if memoryBlock is NULL.
     * @param blockAllocator     Allocator to be used for allocating the memoryBlock, if memoryBlock is NULL. If
     *                           memoryBlock is non-NULL,
     *                           this allocator will be used to deallocate it if provided. Passing NULL will cause the
     *                           default allocator
     *                           (as set at the time of the call) to be used. Pass kCFAllocatorNull if no deallocation
     *                           is desired.
     * @param customBlockSource  If non-NULL, it will be used for the allocation and freeing of the memory block (the
     *                           blockAllocator
     *                           parameter is ignored). If provided, and the memoryBlock parameter is NULL, its
     *                           Allocate() routine must
     *                           be non-NULL. Allocate will be called once, if successful, when the memoryBlock is
     *                           allocated. Free() will
     *                           be called once when the CMBlockBuffer is disposed.
     * @param offsetToData       Offset within the memoryBlock at which the CMBlockBuffer should refer to data.
     * @param dataLength         Number of relevant data bytes, starting at offsetToData, within the memory block.
     * @param flags              Feature and control flags
     * @param blockBufferOut     Receives newly-created CMBlockBuffer object with a retain count of 1. Must not be NULL.
     * 
     * @return Returns kCMBlockBufferNoErr if successful.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithMemoryBlock(@Nullable CFAllocatorRef structureAllocator,
            @Nullable VoidPtr memoryBlock, @NUInt long blockLength, @Nullable CFAllocatorRef blockAllocator,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMBlockBufferCreateWithBufferReference
     * 
     * Creates a new CMBlockBuffer that refers to another CMBlockBuffer.
     * 
     * Creates a new CMBlockBuffer that refers to (a possibly subset portion of) another CMBlockBuffer.
     * The returned CMBlockBuffer may be further expanded using CMBlockBufferAppendMemoryBlock() and/or
     * CMBlockBufferAppendBufferReference().
     * 
     * @param structureAllocator Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     *                           default allocator to be used.
     * @param bufferReference    CMBlockBuffer to refer to. This parameter must not be NULL. Unless the
     *                           kCMBlockBufferPermitEmptyReferenceFlag
     *                           is passed, it must not be empty and it must have a data length at least large enough to
     *                           supply the data subset
     *                           specified (i.e. offsetToData+dataLength bytes).
     * @param offsetToData       Offset within the reference CMBlockBuffer at which the new CMBlockBuffer should refer
     *                           to data.
     * @param dataLength         Number of relevant data bytes, starting at offsetToData, within the target
     *                           CMBlockBuffer.
     * @param flags              Feature and control flags
     * @param blockBufferOut     Receives newly-created CMBlockBuffer object with a retain count of 1. Must not be NULL.
     * 
     * @return Returns kCMBlockBufferNoErr if successful.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithBufferReference(@Nullable CFAllocatorRef structureAllocator,
            @NotNull CMBlockBufferRef bufferReference, @NUInt long offsetToData, @NUInt long dataLength, int flags,
            @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMBlockBufferCreateContiguous
     * 
     * Produces a CMBlockBuffer containing a contiguous copy of or reference to the data specified by the parameters.
     * 
     * Produces a CMBlockBuffer containing a contiguous copy of or reference to the data specified by the parameters.
     * The resulting new CMBlockBuffer may contain an allocated copy of the data, or may contain a contiguous
     * CMBlockBuffer reference.
     * 
     * If the kCMBlockBufferAlwaysCopyDataFlag is set in the flags parameter, the resulting CMBlockBuffer will contain
     * an allocated
     * copy of the data rather than a reference to sourceBuffer.
     * 
     * @param structureAllocator Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     *                           default allocator to be used.
     * @param sourceBuffer       CMBlockBuffer from which data will be copied or referenced. Must not be NULL nor empty,
     * @param blockAllocator     Allocator to be used for allocating the memoryBlock if a contiguous copy of the data is
     *                           to be made. Passing NULL will cause the default
     *                           allocator (as set at the time of the call) to be used.
     * @param customBlockSource  If non-NULL, it will be used for the allocation and freeing of the memory block (the
     *                           blockAllocator
     *                           parameter is ignored). If provided, and the memoryBlock parameter is NULL, its
     *                           Allocate() routine must
     *                           be non-NULL. Allocate will be called once, if successful, when the memoryBlock is
     *                           allocated. Free() will
     *                           be called once when the CMBlockBuffer is disposed.
     * @param offsetToData       Offset within the source CMBlockBuffer at which the new CMBlockBuffer should obtain
     *                           data.
     * @param dataLength         Number of relevant data bytes, starting at offsetToData, within the source
     *                           CMBlockBuffer. If zero, the
     *                           target buffer's total available dataLength (starting at offsetToData) will be
     *                           referenced.
     * @param flags              Feature and control flags
     * @param blockBufferOut     Receives newly-created CMBlockBuffer object with a retain count of 1. Must not be NULL.
     * 
     * @return Returns kCMBlockBufferNoErr if successful
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateContiguous(@Nullable CFAllocatorRef structureAllocator,
            @NotNull CMBlockBufferRef sourceBuffer, @Nullable CFAllocatorRef blockAllocator,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMBlockBufferGetTypeID
     * 
     * Obtains the CoreFoundation type ID for the CMBlockBuffer type.
     * 
     * Obtains the CoreFoundation type ID for the CMBlockBuffer type.
     * 
     * @return Returns the CFTypeID corresponding to CMBlockBuffer.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetTypeID();

    /**
     * [@function] CMBlockBufferAppendMemoryBlock
     * 
     * Adds a memoryBlock to an existing CMBlockBuffer.
     * 
     * Adds a memoryBlock to an existing CMBlockBuffer. The memory block may be statically allocated,
     * dynamically allocated using the given allocator or not yet allocated. The CMBlockBuffer's total
     * data length will be increased by the specified dataLength.
     * 
     * If the kCMBlockBufferAssureMemoryNowFlag is set in the flags parameter, the memory block is
     * allocated immediately using the blockAllocator or customBlockSource. Note that append operations
     * are not thread safe, so care must be taken when appending to BlockBuffers that are used by multiple threads.
     * 
     * @param theBuffer         CMBlockBuffer to which the new memoryBlock will be added. Must not be NULL
     * @param memoryBlock       Block of memory to hold buffered data. If NULL, a memory block will be allocated when
     *                          needed
     *                          (via a call to CMBlockBufferAssureBlockMemory()) using the provided blockAllocator or
     *                          customBlockSource.
     *                          If non-NULL, the block will be used and will be deallocated when the CMBlockBuffer is
     *                          finalized (i.e. released
     *                          for the last time).
     * @param blockLength       Overall length of the memory block in bytes. Must not be zero. This is the size of the
     *                          supplied
     *                          memory block or the size to allocate if memoryBlock is NULL.
     * @param blockAllocator    Allocator to be used for allocating the memoryBlock, if memoryBlock is NULL. If
     *                          memoryBlock is
     *                          non-NULL, this allocator will be used to deallocate it if provided. Passing NULL will
     *                          cause
     *                          the default allocator (as set at the time of the call) to be used. Pass kCFAllocatorNull
     *                          if no
     *                          deallocation is desired.
     * @param customBlockSource If non-NULL, it will be used for the allocation and freeing of the memory block (the
     *                          blockAllocator
     *                          parameter is ignored). If provided, and the memoryBlock parameter is NULL, its
     *                          Allocate() routine must
     *                          be non-NULL. Allocate will be called once, if successful, when the memoryBlock is
     *                          allocated. Free() will
     *                          be called once when the CMBlockBuffer is disposed.
     * @param offsetToData      Offset within the memoryBlock at which the CMBlockBuffer should refer to data.
     * @param dataLength        Number of relevant data bytes, starting at offsetToData, within the memory block.
     * @param flags             Feature and control flags
     * 
     * @return Returns kCMBlockBufferNoErr if successful.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAppendMemoryBlock(@NotNull CMBlockBufferRef theBuffer,
            @Nullable VoidPtr memoryBlock, @NUInt long blockLength, @Nullable CFAllocatorRef blockAllocator,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags);

    /**
     * [@function] CMBlockBufferAppendBufferReference
     * 
     * Adds a CMBlockBuffer reference to an existing CMBlockBuffer.
     * 
     * Adds a buffer reference to (a possibly subset portion of) another CMBlockBuffer to an existing CMBlockBuffer.
     * The CMBlockBuffer's total data length will be increased by the specified dataLength. Note that append operations
     * are not thread safe, so care must be taken when appending to BlockBuffers that are used by multiple threads.
     * 
     * @param theBuffer    CMBlockBuffer to which the new CMBlockBuffer reference will be added. Must not be NULL
     * @param targetBBuf   CMBlockBuffer to refer to. This parameter must not be NULL. Unless the
     *                     kCMBlockBufferPermitEmptyReferenceFlag
     *                     is passed, it must not be empty and it must have a data length at least large enough to
     *                     supply the data subset
     *                     specified (i.e. offsetToData+dataLength bytes).
     * @param offsetToData Offset within the target CMBlockBuffer at which the CMBlockBuffer should refer to data.
     * @param dataLength   Number of relevant data bytes, starting at offsetToData, within the target CMBlockBuffer. If
     *                     zero, the target
     *                     buffer's total available dataLength (starting at offsetToData) will be referenced.
     * @param flags        Feature and control flags
     * 
     * @return Returns kCMBlockBufferNoErr if successful.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAppendBufferReference(@NotNull CMBlockBufferRef theBuffer,
            @NotNull CMBlockBufferRef targetBBuf, @NUInt long offsetToData, @NUInt long dataLength, int flags);

    /**
     * [@function] CMBlockBufferAssureBlockMemory
     * 
     * Assures all memory blocks in a CMBlockBuffer are allocated.
     * 
     * Traverses the possibly complex CMBlockBuffer, allocating the memory for any constituent
     * memory blocks that are not yet allocated.
     * 
     * @param theBuffer CMBlockBuffer to operate on. Must not be NULL
     * 
     * @return Returns kCMBlockBufferNoErr if successful.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAssureBlockMemory(@NotNull CMBlockBufferRef theBuffer);

    /**
     * [@function] CMBlockBufferAccessDataBytes
     * 
     * Accesses potentially noncontiguous data in a CMBlockBuffer.
     * 
     * Used for accessing potentially noncontiguous data, this routine will return a pointer directly
     * into the given CMBlockBuffer if possible, otherwise the data will be assembled and copied into the
     * given temporary block and its pointer will be returned.
     * 
     * @param theBuffer          CMBlockBuffer to operate on. Must not be NULL
     * @param offset             Offset within the CMBlockBuffer's offset range.
     * @param length             Desired number of bytes to access at offset
     * @param temporaryBlock     A piece of memory, assumed to be at least length bytes in size. Must not be NULL
     * @param returnedPointerOut Receives NULL if the desired amount of data could not be accessed at the given offset.
     *                           Receives non-NULL if it could. The value returned will either be a direct pointer into
     *                           the CMBlockBuffer or temporaryBlock Must not be NULL.
     * 
     * @return Returns kCMBlockBufferNoErr if the desired amount of data could be accessed at the given offset.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAccessDataBytes(@NotNull CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length, @NotNull VoidPtr temporaryBlock, @NotNull Ptr<BytePtr> returnedPointerOut);

    /**
     * [@function] CMBlockBufferCopyDataBytes
     * 
     * Copies bytes from a CMBlockBuffer into a provided memory area.
     * 
     * This function is used to copy bytes out of a CMBlockBuffer into a provided piece of memory.
     * It deals with the possibility of the desired range of data being noncontiguous. The function
     * assumes that the memory at the destination is sufficient to hold the data. If length bytes
     * of data are not available in the CMBlockBuffer, an error is returned and the contents of the
     * destination are undefined.
     * 
     * @param theSourceBuffer The buffer from which data will be copied into the destination
     * @param offsetToData    Offset within the source CMBlockBuffer at which the copy should begin.
     * @param dataLength      Number of bytes to copy, starting at offsetToData, within the source CMBlockBuffer. Must
     *                        not be zero.
     * @param destination     Memory into which the data should be copied.
     * 
     * @return Returns kCMBlockBufferNoErr if the copy succeeded, returns an error otherwise.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCopyDataBytes(@NotNull CMBlockBufferRef theSourceBuffer,
            @NUInt long offsetToData, @NUInt long dataLength, @NotNull VoidPtr destination);

    /**
     * [@function] CMBlockBufferReplaceDataBytes
     * 
     * Copies bytes from a given memory block into a CMBlockBuffer, replacing bytes in the underlying data blocks
     * 
     * This function is used to replace bytes in a CMBlockBuffer's memory blocks with those from a provided piece of
     * memory.
     * It deals with the possibility of the destination range of data being noncontiguous.
     * CMBlockBufferAssureBlockMemory() is
     * called on the given CMBlockBuffer. If desired range is subsequently not accessible in the CMBlockBuffer, an error
     * is returned
     * and the contents of the CMBlockBuffer are untouched.
     * 
     * @param sourceBytes           Memory block from which bytes are copied into the CMBlockBuffer
     * @param destinationBuffer     CMBlockBuffer whose range of bytes will be replaced by the sourceBytes.
     * @param offsetIntoDestination Offset within the destination CMBlockBuffer at which replacement should begin.
     * @param dataLength            Number of bytes to be replaced, starting at offsetIntoDestination, in the
     *                              destinationBuffer.
     * 
     * @return Returns kCMBlockBufferNoErr if the replacement succeeded, returns an error otherwise.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferReplaceDataBytes(@NotNull ConstVoidPtr sourceBytes,
            @NotNull CMBlockBufferRef destinationBuffer, @NUInt long offsetIntoDestination, @NUInt long dataLength);

    /**
     * [@function] CMBlockBufferFillDataBytes
     * 
     * Fills a CMBlockBuffer with a given byte value, replacing bytes in the underlying data blocks
     * 
     * This function is used to fill bytes in a CMBlockBuffer's memory blocks with a given byte value.
     * It deals with the possibility of the destination range of data being noncontiguous.
     * CMBlockBufferAssureBlockMemory() is
     * called on the given CMBlockBuffer. If desired range is subsequently not accessible in the CMBlockBuffer, an error
     * is returned
     * and the contents of the CMBlockBuffer are untouched.
     * 
     * @param fillByte              The value with which to fill the specified data range
     * @param destinationBuffer     CMBlockBuffer whose range of bytes will be filled.
     * @param offsetIntoDestination Offset within the destination CMBlockBuffer at which filling should begin.
     * @param dataLength            Number of bytes to be filled, starting at offsetIntoDestination, in the
     *                              destinationBuffer. If zero, the
     *                              destinationBuffer's total available dataLength (starting at offsetToData) will be
     *                              filled.
     * 
     * @return Returns kCMBlockBufferNoErr if the fill succeeded, returns an error otherwise.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferFillDataBytes(byte fillByte, @NotNull CMBlockBufferRef destinationBuffer,
            @NUInt long offsetIntoDestination, @NUInt long dataLength);

    /**
     * [@function] CMBlockBufferGetDataPointer
     * 
     * Gains access to the data represented by a CMBlockBuffer.
     * 
     * Gains access to the data represented by a CMBlockBuffer. A pointer into a memory block is returned
     * which corresponds to the offset within the CMBlockBuffer. The number of bytes addressable at the
     * pointer can also be returned. This length-at-offset may be smaller than the number of bytes actually
     * available starting at the offset if the dataLength of the CMBlockBuffer is covered by multiple memory
     * blocks (a noncontiguous CMBlockBuffer). The data pointer returned will remain valid as long as the
     * original CMBlockBuffer is referenced - once the CMBlockBuffer is released for the last time, any pointers
     * into it will be invalid.
     * 
     * @param theBuffer         CMBlockBuffer to operate on. Must not be NULL
     * @param offset            Offset within the buffer's offset range.
     * @param lengthAtOffsetOut On return, contains the amount of data available at the specified offset. May be NULL.
     * @param totalLengthOut    On return, contains the block buffer's total data length (from offset 0). May be NULL.
     *                          The caller can compare (offset+lengthAtOffset) with totalLength to determine whether
     *                          the entire CMBlockBuffer has been referenced and whether it is possible to access the
     *                          CMBlockBuffer's
     *                          data with a contiguous reference.
     * @param dataPointerOut    On return, contains a pointer to the data byte at the specified offset; lengthAtOffset
     *                          bytes are
     *                          available at this address. May be NULL.
     * 
     * @return Returns kCMBlockBufferNoErr if data was accessible at the specified offset within the given
     *         CMBlockBuffer, false otherwise.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferGetDataPointer(@NotNull CMBlockBufferRef theBuffer, @NUInt long offset,
            @Nullable NUIntPtr lengthAtOffsetOut, @Nullable NUIntPtr totalLengthOut,
            @Nullable Ptr<BytePtr> dataPointerOut);

    /**
     * [@function] CMBlockBufferGetDataLength
     * 
     * Obtains the total data length reachable via a CMBlockBuffer.
     * 
     * Obtains the total data length reachable via a CMBlockBuffer. This total is the sum of the dataLengths
     * of the CMBlockBuffer's memoryBlocks and buffer references. Note that the dataLengths are
     * the _portions_ of those constituents that this CMBlockBuffer subscribes to. This CMBlockBuffer presents a
     * contiguous range of offsets from zero to its totalDataLength as returned by this routine.
     * 
     * @param theBuffer CMBlockBuffer to examine.
     * 
     * @return Returns the total data length available via this CMBlockBuffer, or zero if it is empty, NULL, or somehow
     *         invalid.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetDataLength(@NotNull CMBlockBufferRef theBuffer);

    /**
     * [@function] CMBlockBufferIsRangeContiguous
     * 
     * Determines whether the specified range within the given CMBlockBuffer is contiguous.
     * 
     * Determines whether the specified range within the given CMBlockBuffer is contiguous. if
     * CMBlockBufferGetDataPointer()
     * were to be called with the same parameters, the returned pointer would address the desired number of bytes.
     * 
     * @param theBuffer CMBlockBuffer to examine. Must not be NULL
     * @param offset    Offset within the buffer's offset range.
     * @param length    Desired number of bytes to access at offset. If zero, the number of bytes available at offset
     *                  (dataLength – offset), contiguous or not, is used.
     * 
     * @return Returns true if the specified range is contiguous within the CMBlockBuffer, false otherwise. Also returns
     *         false if the
     *         CMBlockBuffer is NULL or empty.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMBlockBufferIsRangeContiguous(@NotNull CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length);

    /**
     * [@function] CMBlockBufferIsEmpty
     * 
     * Indicates whether the given CMBlockBuffer is empty.
     * 
     * Indicates whether the given CMBlockBuffer is empty, i.e., devoid of any memoryBlocks or CMBlockBuffer references.
     * Note that a CMBlockBuffer containing a not-yet allocated memoryBlock is not considered empty.
     * 
     * @param theBuffer CMBlockBuffer to examine. Must not be NULL
     * 
     * @return Returns the result of the emptiness test. Will return false if the CMBlockBuffer is NULL.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMBlockBufferIsEmpty(@NotNull CMBlockBufferRef theBuffer);

    /**
     * [@function] CMFormatDescriptionCreate
     * 
     * Creates a generic CMFormatDescription object.
     * 
     * Use this call to create any CMFormatDescription that is composed solely of extensions, and for which
     * CFEqual() of a the extensions dictionaries is a valid test for Format Description equality. Note that
     * for some media types using this routine may result in creating a format description that is not fully
     * specified for the purpose of media processing. Whenever possible, use media-specific format description
     * creations routines such as CMVideoFormatDescriptionCreate, CMAudioFormatDescriptionCreate, etc.
     * 
     * @return A new CMFormatDescription object.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionCreate(@Nullable CFAllocatorRef allocator, int mediaType,
            int mediaSubType, @Nullable CFDictionaryRef extensions,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMFormatDescriptionGetTypeID
     * 
     * Returns the CFTypeID of CMFormatDescription objects.
     * 
     * You can check if a CFTypeRef object is actually a CMFormatDescription
     * by comparing CFGetTypeID(object) with CMFormatDescriptionGetTypeID().
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMFormatDescriptionGetTypeID();

    /**
     * [@function] CMFormatDescriptionEqual
     * 
     * Compares two CMFormatDescription objects for equality.
     * 
     * This calls CFEqual on the provided CMFormatDescription objects.
     * In contrast to the CF call it is NULL safe.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqual(@Nullable CMFormatDescriptionRef formatDescription,
            @Nullable CMFormatDescriptionRef otherFormatDescription);

    /**
     * [@function] CMFormatDescriptionEqualIgnoringExtensionKeys
     * 
     * Compares two CMFormatDescription objects for equality, ignoring differences in specified lists of format
     * description extension keys and sample description extension keys.
     * 
     * This function is NULL safe.
     * If any keys are passed, kCMFormatDescriptionExtension_VerbatimSampleDescription
     * and kCMFormatDescriptionExtension_VerbatimISOSampleEntry will also be automatically
     * ignored for the purpose of comparison.
     * 
     * @param formatDescriptionExtensionKeysToIgnore
     *                                                   Either a single format description extension key (CFString)
     *                                                   or a CFArray of such keys.
     * @param sampleDescriptionExtensionAtomKeysToIgnore
     *                                                   Either a single sample description extension atom key
     *                                                   (four-character CFString)
     *                                                   or a CFArray of such keys.
     *                                                   See
     *                                                   kCMFormatDescriptionExtension_SampleDescriptionExtensionAtoms.
     * 
     *                                                   API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqualIgnoringExtensionKeys(
            @Nullable CMFormatDescriptionRef formatDescription, @Nullable CMFormatDescriptionRef otherFormatDescription,
            @Nullable ConstVoidPtr formatDescriptionExtensionKeysToIgnore,
            @Nullable ConstVoidPtr sampleDescriptionExtensionAtomKeysToIgnore);

    /**
     * [@function] CMFormatDescriptionGetMediaType
     * 
     * Returns the media type of a CMFormatDescription.
     * 
     * For example, returns kCMMediaType_Audio for a description of an audio stream.
     * 
     * @return The media type of the CMFormatDescription.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaType(@NotNull CMFormatDescriptionRef desc);

    /**
     * [@function] CMFormatDescriptionGetMediaSubType
     * 
     * Returns the media subtype of a CMFormatDescription.
     * 
     * The media subtype is defined in a media-specific way.
     * For audio streams, the media subtype is the asbd.mFormatID.
     * For video streams, the media subtype is the video codec type.
     * For muxed streams, it is the format of the muxed stream.
     * For example, 'aac ' is returned for a description of an AAC audio
     * stream, 'avc1' is returned for a description of an H.264 video
     * stream, and 'mp2t' is returned for a description of an MPEG-2
     * transport (muxed) stream. If a particular type of media stream
     * does not have subtypes, this API may return 0.
     * 
     * @return The media subtype of the CMFormatDescription.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaSubType(@NotNull CMFormatDescriptionRef desc);

    /**
     * [@function] CMFormatDescriptionGetExtensions
     * 
     * Returns an immutable dictionary containing all the extensions of a CMFormatDescription.
     * 
     * If there are no extensions, NULL is returned. Extensions dictionaries are valid property list
     * objects. This means that dictionary keys are all CFStrings, and the values are all either
     * CFNumber, CFString, CFBoolean, CFArray, CFDictionary, CFDate, or CFData. The returned
     * dictionary is not retained by this call, so clients are required to retain it if they
     * need to keep it longer.
     * 
     * @return An immutable dictionary containing all the extensions of the CMFormatDescription. May be NULL.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CMFormatDescriptionGetExtensions(@NotNull CMFormatDescriptionRef desc);

    /**
     * [@function] CMFormatDescriptionGetExtension
     * 
     * Returns the specified extension of a CMFormatDescription.
     * 
     * If the named extension does not exist, NULL is returned. The extension is always a valid
     * property list object. This means that it will be either a CFNumber, CFString, CFBoolean,
     * CFArray, CFDictionary, CFDate, or CFData. If it is a CFDictionary, the keys will all be
     * CFStrings. The returned extension is not retained by this call, so it is only valid as
     * long as the CMFormatDescription is valid. Clients are required to retain it if they
     * need to keep it longer.
     * 
     * @return The specified extension of the CMFormatDescription. May be NULL.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMFormatDescriptionGetExtension(@NotNull CMFormatDescriptionRef desc,
            @NotNull CFStringRef extensionKey);

    /**
     * [@function] CMAudioFormatDescriptionCreate
     * 
     * Creates a format description for an audio media stream.
     * 
     * The ASBD is required, the channel layout is optional, and the magic cookie is required
     * for some compression formats (and must be NULL for all others). The caller owns the
     * returned CMFormatDescription, and must release it when done with it. The ASBD,
     * magic cookie, channel layout, and extensions are all copied (the extensions are
     * deep-copied). The caller can deallocate them or re-use them after making this call.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreate(@Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription asbd,
            @NUInt long layoutSize,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout layout,
            @NUInt long magicCookieSize, @Nullable ConstVoidPtr magicCookie, @Nullable CFDictionaryRef extensions,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMAudioFormatDescriptionGetStreamBasicDescription
     * 
     * Returns a read-only pointer to the AudioStreamBasicDescription inside an audio CMFormatDescription.
     * 
     * See CoreAudioTypes.h for the definition of AudioStreamBasicDescription.
     * This API is specific to audio format descriptions, and will return NULL if
     * used with a non-audio format descriptions.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioStreamBasicDescription CMAudioFormatDescriptionGetStreamBasicDescription(
            @NotNull CMFormatDescriptionRef desc);

    /**
     * [@function] CMAudioFormatDescriptionGetMagicCookie
     * 
     * Returns a read-only pointer to (and size of) the magic cookie inside an audio CMFormatDescription.
     * 
     * The magic cookie is a completely opaque piece of data, written and read only by
     * the codec itself. A magic cookie is only present for codecs that require it;
     * this API will return NULL if one does not exist. This API is specific to audio
     * format descriptions, and will return NULL if called with a non-audio format
     * description.
     * 
     * @return A read-only pointer to the magic cookie inside the audio format description.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMAudioFormatDescriptionGetMagicCookie(@NotNull CMFormatDescriptionRef desc,
            @Nullable NUIntPtr sizeOut);

    /**
     * [@function] CMAudioFormatDescriptionGetChannelLayout
     * 
     * Returns a read-only pointer to (and size of) the AudioChannelLayout inside an audio CMFormatDescription.
     * 
     * See CoreAudioTypes.h for the definition of AudioChannelLayout.
     * AudioChannelLayouts are optional; this API will return NULL if
     * one does not exist. This API is specific to audio format
     * descriptions, and will return NULL if called with a non-audio
     * format description.
     * 
     * @return A read-only pointer to the AudioChannelLayout inside the audio format description.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioChannelLayout CMAudioFormatDescriptionGetChannelLayout(
            @NotNull CMFormatDescriptionRef desc, @Nullable NUIntPtr sizeOut);

    /**
     * [@function] CMAudioFormatDescriptionGetFormatList
     * 
     * Returns a read-only pointer to (and size of) the array of AudioFormatListItem structs inside an audio
     * CMFormatDescription.
     * 
     * This property is analogous to kAudioFormatProperty_FormatList (See AudioFormat.h) and follows
     * its conventions. Namely, formats are returned in order from the most to least 'rich', with
     * channel count taking the highest precedence followed by sample rate.
     * This API is specific to audio format descriptions, and will return NULL if called with a non-audio
     * format description.
     * 
     * @return A read-only pointer to the array of AudioFormatListItem structs inside the audio format description.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetFormatList(@NotNull CMFormatDescriptionRef desc,
            @Nullable NUIntPtr sizeOut);

    /**
     * [@function] CMAudioFormatDescriptionGetRichestDecodableFormat
     * 
     * Returns a read-only pointer to the appropriate AudioFormatListItem inside an audio CMFormatDescription.
     * 
     * This property performs validation on the formats represented by the audio in the description. It
     * finds the first AudioFormatListItem for which the current system has a valid decoder.
     * This API is specific to audio format descriptions, and will return NULL if called with a non-audio
     * format description. It may also return NULL if there is no suitable decoder available on the
     * current system for this audio format.
     * 
     * @return A read-only pointer to the appropriate AudioFormatListItem inside the audio format description.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetRichestDecodableFormat(
            @NotNull CMFormatDescriptionRef desc);

    /**
     * [@function] CMAudioFormatDescriptionGetMostCompatibleFormat
     * 
     * Returns a read-only pointer to the appropriate AudioFormatListItem inside an audio CMFormatDescription.
     * 
     * This property returns a pointer to the last AudioFormatListItem in the kAudioFormatProperty_FormatList
     * (see AudioFormat.h). This API is specific to audio format descriptions, and will return NULL if called
     * with a non-audio format description.
     * 
     * @return A read-only pointer to the appropriate AudioFormatListItem inside the audio format description.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetMostCompatibleFormat(
            @NotNull CMFormatDescriptionRef desc);

    /**
     * [@function] CMAudioFormatDescriptionCreateSummary
     * 
     * Creates a summary audio format description from an array of audio format descriptions.
     * 
     * The summary format description will be canonical LPCM and deep enough in
     * sample rate, channel layout and channel count to sensibly contain the result of decoding
     * and mixing the constituent format descriptions.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateSummary(@Nullable CFAllocatorRef allocator,
            @NotNull CFArrayRef formatDescriptionArray, int flags,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMAudioFormatDescriptionEqual
     * 
     * Evaluates equality for the specified parts of two audio format descriptions.
     * 
     * Bits in equalityMask specify the caller's interest in the equality of various parts of the descriptions.
     * Bits set and returned in equalityMaskOut represent the subset of those parts that are equal.
     * If there is any sort of error that prevents the comparison from occurring, false will be returned, and
     * all bits in equalityMaskOut will be cleared. If you pass kCMAudioFormatDescriptionMask_All in equalityMask,
     * and NULL for equalityMaskOut, this API is equivalent to CFEqual(desc1, desc2).
     * 
     * On releases up to macOS 12, iOS 15, tvOS 15 and watchOS 8, the kCMAudioFormatDescriptionMask_Extensions
     * flag was ignored in equalityMask. So this API always treated two audio format descriptions as equal even
     * when they had different extensions.
     * 
     * Starting with macOS 13, iOS 16, tvOS 16 and watchOS 9, kCMAudioFormatDescriptionMask_Extensions is correctly
     * accounted for when determining equality of two audio format descriptions. This also affects CFEqual(desc1, desc2)
     * as it will return false when two audio format descriptions have different extensions.
     * 
     * @return The result of the comparison. True if all parts in which the caller is interested are equal.
     *         False if any of the parts in which the caller is interested are not equal.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMAudioFormatDescriptionEqual(@NotNull CMFormatDescriptionRef formatDescription,
            @NotNull CMFormatDescriptionRef otherFormatDescription, int equalityMask, @Nullable IntPtr equalityMaskOut);

    /**
     * [@function] CMVideoFormatDescriptionCreate
     * 
     * Creates a format description for a video media stream.
     * 
     * The caller owns the returned CMFormatDescription, and must release it when done with it. All input parameters
     * are copied (the extensions are deep-copied). The caller can deallocate them or re-use them after making this
     * call.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreate(@Nullable CFAllocatorRef allocator, int codecType,
            int width, int height, @Nullable CFDictionaryRef extensions,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMVideoFormatDescriptionCreateForImageBuffer
     * 
     * Creates a format description for a video media stream contained in CVImageBuffers of the type provided.
     * 
     * This convenience function is equivalent to:
     * 
     * CMVideoFormatDescriptionCreate( allocator,
     * ( CVPixelBufferGetTypeID() == CFGetTypeID( imageBuffer ) ? CVPixelBufferGetPixelFormatType( imageBuffer ) : 0,
     * width of image,
     * height of image,
     * extensions );
     * 
     * where extensions is a CFDictionary of attachments to image buffer with keys specified by
     * CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers, and also
     * kCMFormatDescriptionExtension_BytesPerRow if applicable.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateForImageBuffer(@Nullable CFAllocatorRef allocator,
            @NotNull CVBufferRef imageBuffer, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMVideoFormatDescriptionCreateFromH264ParameterSets
     * 
     * Creates a format description for a video media stream described by H.264 parameter set NAL units.
     * 
     * This function parses the dimensions provided by the parameter sets and creates a format description suitable for
     * a raw H.264 stream.
     * The parameter sets' data can come from raw NAL units and must have any emulation prevention bytes needed.
     * The supported NAL unit types to be included in the format description are 7 (sequence parameter set), 8 (picture
     * parameter set) and 13 (sequence parameter set extension). At least one sequence parameter set and one picture
     * parameter set must be provided.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromH264ParameterSets(@Nullable CFAllocatorRef allocator,
            @NUInt long parameterSetCount,
            @NotNull @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointers,
            @NotNull ConstNUIntPtr parameterSetSizes, int NALUnitHeaderLength,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMVideoFormatDescriptionGetH264ParameterSetAtIndex
     * 
     * Returns a parameter set contained in a H.264 format description.
     * 
     * This function parses the AVC decoder configuration record contained in a H.264 video format description and
     * returns the NAL unit at the given index from it. These NAL units are typically parameter sets (e.g. SPS, PPS),
     * but may contain others as specified by ISO/IEC 14496-15 (e.g. user-data SEI).
     * Both parameterSetPointerOut and parameterSetSizeOut may be NULL, parameterSetCountOut will return the total
     * number of parameter set NAL units contained in the AVC decoder configuration record.
     * The parameter set NAL units returned will already have any emulation prevention bytes needed.
     * The pointer returned in parameterSetPointerOut points to internal memory of videoDesc, and may only be accessed
     * as long as a retain on videoDesc is held.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionGetH264ParameterSetAtIndex(
            @NotNull CMFormatDescriptionRef videoDesc, @NUInt long parameterSetIndex,
            @Nullable @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointerOut,
            @Nullable NUIntPtr parameterSetSizeOut, @Nullable NUIntPtr parameterSetCountOut,
            @Nullable IntPtr NALUnitHeaderLengthOut);

    /**
     * [@function] CMVideoFormatDescriptionGetDimensions
     * 
     * Returns the dimensions (in encoded pixels)
     * 
     * This does not take into account pixel aspect ratio or clean aperture tags.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMVideoDimensions CMVideoFormatDescriptionGetDimensions(
            @NotNull CMFormatDescriptionRef videoDesc);

    /**
     * [@function] CMVideoFormatDescriptionGetPresentationDimensions
     * 
     * Returns the dimensions, adjusted to take pixel aspect ratio and/or clean aperture into account.
     * 
     * Pixel aspect ratio is used to adjust the width, leaving the height alone.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CMVideoFormatDescriptionGetPresentationDimensions(
            @NotNull CMFormatDescriptionRef videoDesc, byte usePixelAspectRatio, byte useCleanAperture);

    /**
     * [@function] CMVideoFormatDescriptionGetCleanAperture
     * 
     * Returns the clean aperture.
     * 
     * The clean aperture is a rectangle that defines the portion of the encoded pixel dimensions
     * that represents image data valid for display.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CMVideoFormatDescriptionGetCleanAperture(@NotNull CMFormatDescriptionRef videoDesc,
            byte originIsAtTopLeft);

    /**
     * [@function] CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers
     * 
     * Returns an array of the keys that are used both as CMVideoFormatDescription extensions
     * and CVImageBuffer attachments and attributes.
     * 
     * When specifying a CMFormatDescription for a CMSampleBuffer, the format description must
     * be consistent with formatting information attached to the CVImageBuffer. The width, height,
     * and codecType must match (for CVPixelBuffers the codec type is given by
     * CVPixelBufferGetPixelFormatType(pixelBuffer); for other CVImageBuffers, the codecType must be 0).
     * The format description extensions must match the image buffer attachments for all the keys in the
     * list returned by this function (if absent in either they must be absent in both).
     * 
     * Currently, the list is:
     * 
     * kCMFormatDescriptionExtension_CleanAperture
     * kCMFormatDescriptionExtension_FieldCount
     * kCMFormatDescriptionExtension_FieldDetail
     * kCMFormatDescriptionExtension_PixelAspectRatio
     * kCMFormatDescriptionExtension_ColorPrimaries
     * kCMFormatDescriptionExtension_TransferFunction
     * kCMFormatDescriptionExtension_GammaLevel
     * kCMFormatDescriptionExtension_YCbCrMatrix
     * kCMFormatDescriptionExtension_ICCProfile
     * kCMFormatDescriptionExtension_ChromaLocationTopField
     * kCMFormatDescriptionExtension_ChromaLocationBottomField
     * kCMFormatDescriptionExtension_MasteringDisplayColorVolume
     * kCMFormatDescriptionExtension_ContentLightLevelInfo
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFArrayRef CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers();

    /**
     * [@function] CMVideoFormatDescriptionMatchesImageBuffer
     * 
     * Checks to see if a given format description matches an image buffer.
     * 
     * This function uses the keys returned by CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers
     * to compares the extensions of the given format description to the attachments of the
     * given image buffer (if an attachment is absent in either it must be absent in both).
     * It also checks kCMFormatDescriptionExtension_BytesPerRow against CVPixelBufferGetBytesPerRow, if applicable.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMVideoFormatDescriptionMatchesImageBuffer(@NotNull CMFormatDescriptionRef desc,
            @NotNull CVBufferRef imageBuffer);

    /**
     * [@function] CMMuxedFormatDescriptionCreate
     * 
     * Creates a format description for a muxed media stream.
     * 
     * A muxed format description does not know what the formats are of the substreams within the muxed stream.
     * That information will only be discoverable by the demuxer software (or other software which understands
     * the details of the muxed bitstream) which will need to produce separate format descriptions for each of
     * its output streams. The caller owns the returned CMFormatDescription, and must release it when done
     * with it. All input parameters are copied (the extensions are deep-copied). The caller can deallocate
     * them or re-use them after making this call.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMMuxedFormatDescriptionCreate(@Nullable CFAllocatorRef allocator, int muxType,
            @Nullable CFDictionaryRef extensions, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMTextFormatDescriptionGetDisplayFlags
     * 
     * Returns the displayFlags.
     * 
     * These are the flags that control how the text appears. The function can return
     * kCMFormatDescriptionError_ValueNotAvailable for formats without display flags.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDisplayFlags(@NotNull CMFormatDescriptionRef desc,
            @NotNull IntPtr displayFlagsOut);

    /**
     * [@function] CMTextFormatDescriptionGetJustification
     * 
     * Returns horizontal and vertical justification.
     * 
     * Values are kCMTextJustification_* constants. The function returns kCMFormatDescriptionError_ValueNotAvailable for
     * format descriptions that do not carry text justification.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetJustification(@NotNull CMFormatDescriptionRef desc,
            @Nullable BytePtr horizontaJustificationlOut, @Nullable BytePtr verticalJustificationOut);

    /**
     * [@function] CMTextFormatDescriptionGetDefaultTextBox
     * 
     * Returns the default text box.
     * 
     * Within a text track, text is rendered within a text box. There is a default text box set, which can be
     * over-ridden by a sample. The function can return kCMFormatDescriptionError_ValueNotAvailable for format
     * descriptions that do not carry a default text box.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDefaultTextBox(@NotNull CMFormatDescriptionRef desc,
            byte originIsAtTopLeft, @NFloat double heightOfTextTrack,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGRect defaultTextBoxOut);

    /**
     * [@function] CMTextFormatDescriptionGetFontName
     * 
     * Returns the font name for a local font ID.
     * 
     * Some format descriptions carry a mapping from local font IDs to font names. The function returns
     * kCMFormatDescriptionError_ValueNotAvailable for format descriptions that do not carry such a font mapping table.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetFontName(@NotNull CMFormatDescriptionRef desc, char localFontID,
            @NotNull Ptr<CFStringRef> fontNameOut);

    /**
     * [@function] CMTimeCodeFormatDescriptionCreate
     * 
     * Creates a format description for a timecode media.
     * 
     * The caller owns the returned CMFormatDescription, and must release it when done with it. All input parameters
     * are copied (the extensions are deep-copied). The caller can deallocate them or re-use them after making this
     * call.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreate(@Nullable CFAllocatorRef allocator,
            int timeCodeFormatType, @ByValue CMTime frameDuration, int frameQuanta, int flags,
            @Nullable CFDictionaryRef extensions, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMTimeCodeFormatDescriptionGetFrameDuration
     * 
     * Returns the duration of each frame (eg. 100/2997)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeCodeFormatDescriptionGetFrameDuration(
            @NotNull CMFormatDescriptionRef timeCodeFormatDescription);

    /**
     * [@function] CMTimeCodeFormatDescriptionGetFrameQuanta
     * 
     * Returns the frames/sec for timecode (eg. 30) OR frames/tick for counter mode
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionGetFrameQuanta(
            @NotNull CMFormatDescriptionRef timeCodeFormatDescription);

    /**
     * [@function] CMTimeCodeFormatDescriptionGetTimeCodeFlags
     * 
     * Returns the flags for kCMTimeCodeFlag_DropFrame, kCMTimeCodeFlag_24HourMax, kCMTimeCodeFlag_NegTimesOK
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionGetTimeCodeFlags(@NotNull CMFormatDescriptionRef desc);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithKeys(@Nullable CFAllocatorRef allocator,
            int metadataType, @Nullable CFArrayRef keys, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithMetadataSpecifications(
            @Nullable CFAllocatorRef allocator, int metadataType, @NotNull CFArrayRef metadataSpecifications,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithMetadataFormatDescriptionAndMetadataSpecifications(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef sourceDescription,
            @NotNull CFArrayRef metadataSpecifications, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateByMergingMetadataFormatDescriptions(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef sourceDescription,
            @NotNull CMFormatDescriptionRef otherSourceDescription,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CMMetadataFormatDescriptionGetKeyWithLocalID(
            @NotNull CMFormatDescriptionRef desc, int localKeyID);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataFormatDescriptionGetIdentifiers(@NotNull CMFormatDescriptionRef desc);

    /**
     * [@function] CMSampleBufferCreate
     * 
     * Creates a CMSampleBuffer.
     * 
     * Array parameters (sampleSizeArray, sampleTimingArray) should have only one element if that same
     * element applies to all samples. All parameters are copied; on return, the caller can release them,
     * free them, reuse them or whatever. On return, the caller owns the returned CMSampleBuffer, and
     * must release it when done with it.
     * 
     * Example of usage for in-display-order video frames:
     * <ul> dataBuffer: contains 7 Motion JPEG frames
     * <li> dataFormatDescription: describes Motion JPEG video
     * <li> numSamples: 7
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {duration = 1001/30000, presentationTimeStamp = 0/30000, decodeTimeStamp =
     * invalid }
     * <li> numSampleSizeEntries: 7
     * <li> sampleSizeArray: {105840, 104456, 103464, 116460, 100412, 94808, 120400}
     * </ul>
     * Example of usage for out-of-display-order video frames:
     * <ul> dataBuffer: contains 6 H.264 frames in decode order (P2,B0,B1,I5,B3,B4)
     * <li> dataFormatDescription: describes H.264 video
     * <li> numSamples: 6
     * <li> numSampleTimingEntries: 6
     * <li> sampleTimingArray: 6 entries = {
     * <ul> {duration = 1001/30000, presentationTimeStamp = 12012/30000, decodeTimeStamp = 10010/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 10010/30000, decodeTimeStamp = 11011/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 11011/30000, decodeTimeStamp = 12012/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 15015/30000, decodeTimeStamp = 13013/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 13013/30000, decodeTimeStamp = 14014/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 14014/30000, decodeTimeStamp = 15015/30000}}
     * </ul>
     * <li> numSampleSizeEntries: 6
     * <li> sampleSizeArray: {10580, 1234, 1364, 75660, 1012, 988}
     * </ul>
     * Example of usage for compressed audio:
     * <ul> dataBuffer: contains 24 compressed AAC packets
     * <li> dataFormatDescription: describes 44.1kHz AAC audio
     * <li> numSamples: 24
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {
     * <ul> {duration = 1024/44100, presentationTimeStamp = 0/44100, decodeTimeStamp = invalid }}
     * </ul>
     * <li> numSampleSizeEntries: 24
     * <li> sampleSizeArray:
     * <ul> {191, 183, 208, 213, 202, 206, 209, 206, 204, 192, 202, 277,
     * <li> 282, 240, 209, 194, 193, 197, 196, 198, 168, 199, 171, 194}
     * </ul>
     * </ul>
     * Example of usage for uncompressed interleaved audio:
     * <ul> dataBuffer: contains 24000 uncompressed interleaved stereo frames, each containing 2 Float32s =
     * <ul> {{L,R},
     * <li> {L,R},
     * <li> {L,R}, ...}
     * </ul>
     * <li> dataFormatDescription: describes 48kHz Float32 interleaved audio
     * <li> numSamples: 24000
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {
     * <ul> {duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp = invalid }}
     * </ul>
     * <li> numSampleSizeEntries: 1
     * <li> sampleSizeArray: {8}
     * </ul>
     * Example of usage for uncompressed non-interleaved audio:
     * <ul> dataBuffer: contains 24000 uncompressed non-interleaved stereo frames, each containing 2 (non-contiguous)
     * Float32s =
     * <ul> {{L,L,L,L,L,...},
     * <li> {R,R,R,R,R,...}}
     * </ul>
     * <li> dataFormatDescription: describes 48kHz Float32 non-interleaved audio
     * <li> numSamples: 24000
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp =
     * invalid }
     * <li> numSampleSizeEntries: 0
     * <li> sampleSizeArray: NULL (because the samples are not contiguous)
     * </ul>
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreate(@Nullable CFAllocatorRef allocator,
            @Nullable CMBlockBufferRef dataBuffer, byte dataReady,
            @Nullable @FunctionPtr(name = "call_CMSampleBufferCreate") Function_CMSampleBufferCreate makeDataReadyCallback,
            @Nullable VoidPtr makeDataReadyRefcon, @Nullable CMFormatDescriptionRef formatDescription,
            @NInt long numSamples, @NInt long numSampleTimingEntries,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, @Nullable ConstNUIntPtr sampleSizeArray,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMSampleBufferCreateReady
     * 
     * Creates a CMSampleBuffer.
     * 
     * Array parameters (sampleSizeArray, sampleTimingArray) should have only one element if that same
     * element applies to all samples. All parameters are copied; on return, the caller can release them,
     * free them, reuse them or whatever. On return, the caller owns the returned CMSampleBuffer, and
     * must release it when done with it.
     * CMSampleBufferCreateReady is identical to CMSampleBufferCreate except that dataReady is always true,
     * and so no makeDataReadyCallback or refcon needs to be passed.
     * 
     * Example of usage for in-display-order video frames:
     * <ul> dataBuffer: contains 7 Motion JPEG frames
     * <li> dataFormatDescription: describes Motion JPEG video
     * <li> numSamples: 7
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {duration = 1001/30000, presentationTimeStamp = 0/30000, decodeTimeStamp =
     * invalid }
     * <li> numSampleSizeEntries: 7
     * <li> sampleSizeArray: {105840, 104456, 103464, 116460, 100412, 94808, 120400}
     * </ul>
     * Example of usage for out-of-display-order video frames:
     * <ul> dataBuffer: contains 6 H.264 frames in decode order (P2,B0,B1,I5,B3,B4)
     * <li> dataFormatDescription: describes H.264 video
     * <li> numSamples: 6
     * <li> numSampleTimingEntries: 6
     * <li> sampleTimingArray: 6 entries = {
     * <ul> {duration = 1001/30000, presentationTimeStamp = 12012/30000, decodeTimeStamp = 10010/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 10010/30000, decodeTimeStamp = 11011/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 11011/30000, decodeTimeStamp = 12012/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 15015/30000, decodeTimeStamp = 13013/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 13013/30000, decodeTimeStamp = 14014/30000},
     * <li> {duration = 1001/30000, presentationTimeStamp = 14014/30000, decodeTimeStamp = 15015/30000}}
     * </ul>
     * <li> numSampleSizeEntries: 6
     * <li> sampleSizeArray: {10580, 1234, 1364, 75660, 1012, 988}
     * </ul>
     * Example of usage for compressed audio:
     * <ul> dataBuffer: contains 24 compressed AAC packets
     * <li> dataFormatDescription: describes 44.1kHz AAC audio
     * <li> numSamples: 24
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {
     * <ul> {duration = 1024/44100, presentationTimeStamp = 0/44100, decodeTimeStamp = invalid }}
     * </ul>
     * <li> numSampleSizeEntries: 24
     * <li> sampleSizeArray:
     * <ul> {191, 183, 208, 213, 202, 206, 209, 206, 204, 192, 202, 277,
     * <li> 282, 240, 209, 194, 193, 197, 196, 198, 168, 199, 171, 194}
     * </ul>
     * </ul>
     * Example of usage for uncompressed interleaved audio:
     * <ul> dataBuffer: contains 24000 uncompressed interleaved stereo frames, each containing 2 Float32s =
     * <ul> {{L,R},
     * <li> {L,R},
     * <li> {L,R}, ...}
     * </ul>
     * <li> dataFormatDescription: describes 48kHz Float32 interleaved audio
     * <li> numSamples: 24000
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {
     * <ul> {duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp = invalid }}
     * </ul>
     * <li> numSampleSizeEntries: 1
     * <li> sampleSizeArray: {8}
     * </ul>
     * Example of usage for uncompressed non-interleaved audio:
     * <ul> dataBuffer: contains 24000 uncompressed non-interleaved stereo frames, each containing 2 (non-contiguous)
     * Float32s =
     * <ul> {{L,L,L,L,L,...},
     * <li> {R,R,R,R,R,...}}
     * </ul>
     * <li> dataFormatDescription: describes 48kHz Float32 non-interleaved audio
     * <li> numSamples: 24000
     * <li> numSampleTimingEntries: 1
     * <li> sampleTimingArray: one entry = {duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp =
     * invalid }
     * <li> numSampleSizeEntries: 0
     * <li> sampleSizeArray: NULL (because the samples are not contiguous)
     * </ul>
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReady(@Nullable CFAllocatorRef allocator,
            @Nullable CMBlockBufferRef dataBuffer, @Nullable CMFormatDescriptionRef formatDescription,
            @NInt long numSamples, @NInt long numSampleTimingEntries,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, @Nullable ConstNUIntPtr sampleSizeArray,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMAudioSampleBufferCreateWithPacketDescriptions
     * 
     * Creates an CMSampleBuffer containing audio given packetDescriptions instead of sizing and timing info
     * 
     * Provides an optimization over CMSampleBufferCreate() when the caller already has packetDescriptions for
     * the audio data. This routine will use the packetDescriptions to create the sizing and timing arrays required
     * to make the sample buffer if necessary.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateWithPacketDescriptions(@Nullable CFAllocatorRef allocator,
            @Nullable CMBlockBufferRef dataBuffer, byte dataReady,
            @Nullable @FunctionPtr(name = "call_CMAudioSampleBufferCreateWithPacketDescriptions") Function_CMAudioSampleBufferCreateWithPacketDescriptions makeDataReadyCallback,
            @Nullable VoidPtr makeDataReadyRefcon, @NotNull CMFormatDescriptionRef formatDescription,
            @NInt long numSamples, @ByValue CMTime presentationTimeStamp,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMAudioSampleBufferCreateReadyWithPacketDescriptions
     * 
     * Creates an CMSampleBuffer containing audio given packetDescriptions instead of sizing and timing info
     * 
     * Provides an optimization over CMSampleBufferCreate() when the caller already has packetDescriptions for
     * the audio data. This routine will use the packetDescriptions to create the sizing and timing arrays required
     * to make the sample buffer if necessary.
     * CMAudioSampleBufferCreateReadyWithPacketDescriptions is identical to
     * CMAudioSampleBufferCreateWithPacketDescriptions
     * except that dataReady is always true, and so no makeDataReadyCallback or refcon needs to be passed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateReadyWithPacketDescriptions(@Nullable CFAllocatorRef allocator,
            @NotNull CMBlockBufferRef dataBuffer, @NotNull CMFormatDescriptionRef formatDescription,
            @NInt long numSamples, @ByValue CMTime presentationTimeStamp,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMSampleBufferCreateForImageBuffer
     * 
     * Creates a CMSampleBuffer that contains a CVImageBuffer instead of a CMBlockBuffer.
     * 
     * Unlike a CMBlockBuffer which can reference many samples, a CVImageBuffer is defined to
     * reference only one sample; therefore this routine has fewer parameters then
     * CMSampleBufferCreate.
     * 
     * Sample timing information, which is a vector for CMSampleBufferCreate,
     * consists of only one value for this routine.
     * 
     * The concept of sample size does not apply to CVImageBuffers. As such, CMSampleBufferGetSampleSizeArray
     * will return kCMSampleBufferError_BufferHasNoSampleSizes, and CMSampleBufferGetSampleSize
     * will return 0.
     * 
     * Because CVImageBuffers hold visual data, the format description provided is a
     * CMVideoFormatDescription. The format description must be consistent with the attributes
     * and formatting information attached to the CVImageBuffer. The width, height, and codecType must
     * match (for CVPixelBuffers the codec type is given by CVPixelBufferGetPixelFormatType(pixelBuffer);
     * for other CVImageBuffers, the codecType must be 0). The format description extensions must
     * match the image buffer attachments for all the keys in the list returned by
     * CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers (if absent in either they
     * must be absent in both).
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateForImageBuffer(@Nullable CFAllocatorRef allocator,
            @NotNull CVBufferRef imageBuffer, byte dataReady,
            @Nullable @FunctionPtr(name = "call_CMSampleBufferCreateForImageBuffer") Function_CMSampleBufferCreateForImageBuffer makeDataReadyCallback,
            @Nullable VoidPtr makeDataReadyRefcon, @NotNull CMFormatDescriptionRef formatDescription,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMSampleBufferCreateReadyWithImageBuffer
     * 
     * Creates a CMSampleBuffer that contains a CVImageBuffer instead of a CMBlockBuffer.
     * 
     * Unlike a CMBlockBuffer which can reference many samples, a CVImageBuffer is defined to
     * reference only one sample; therefore this routine has fewer parameters then
     * CMSampleBufferCreate.
     * 
     * Sample timing information, which is a vector for CMSampleBufferCreate,
     * consists of only one value for this routine.
     * 
     * The concept of sample size does not apply to CVImageBuffers. As such, CMSampleBufferGetSampleSizeArray
     * will return kCMSampleBufferError_BufferHasNoSampleSizes, and CMSampleBufferGetSampleSize
     * will return 0.
     * 
     * Because CVImageBuffers hold visual data, the format description provided is a
     * CMVideoFormatDescription. The format description must be consistent with the attributes
     * and formatting information attached to the CVImageBuffer. The width, height, and codecType must
     * match (for CVPixelBuffers the codec type is given by CVPixelBufferGetPixelFormatType(pixelBuffer);
     * for other CVImageBuffers, the codecType must be 0). The format description extensions must
     * match the image buffer attachments for all the keys in the list returned by
     * CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers (if absent in either they
     * must be absent in both).
     * 
     * CMSampleBufferCreateReadyWithImageBuffer is identical to CMSampleBufferCreateForImageBuffer except that
     * dataReady is always true, and so no makeDataReadyCallback or refcon needs to be passed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReadyWithImageBuffer(@Nullable CFAllocatorRef allocator,
            @NotNull CVBufferRef imageBuffer, @NotNull CMFormatDescriptionRef formatDescription,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMSampleBufferCreateCopy
     * 
     * Creates a copy of a CMSampleBuffer.
     * 
     * The copy is shallow: scalar properties (sizes and timing) are copied directly,
     * the data buffer and format description are retained, and
     * the propogatable attachments are retained by the copy's dictionary.
     * If sbuf's data is not ready, the copy will be set to track its readiness.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopy(@Nullable CFAllocatorRef allocator,
            @NotNull CMSampleBufferRef sbuf, @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMSampleBufferCreateCopyWithNewTiming
     * 
     * Creates a CMSampleBuffer with new timing information from another sample buffer.
     * 
     * This emulates CMSampleBufferCreateCopy, but changes the timing.
     * Array parameters (sampleTimingArray) should have only one element if that same
     * element applies to all samples. All parameters are copied; on return, the caller can release them,
     * free them, reuse them or whatever. Any outputPresentationTimestamp that has been set on the original Buffer
     * will not be copied because it is no longer relevant. On return, the caller owns the returned
     * CMSampleBuffer, and must release it when done with it.
     * 
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopyWithNewTiming(@Nullable CFAllocatorRef allocator,
            @NotNull CMSampleBufferRef originalSBuf, @NInt long numSampleTimingEntries,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMSampleBufferCopySampleBufferForRange
     * 
     * Creates a CMSampleBuffer containing a range of samples from an existing CMSampleBuffer.
     * 
     * Samples containing non-interleaved audio are currently not supported.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCopySampleBufferForRange(@Nullable CFAllocatorRef allocator,
            @NotNull CMSampleBufferRef sbuf, @ByValue CFRange sampleRange,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function] CMSampleBufferGetTypeID
     * 
     * Returns the CFTypeID of CMSampleBuffer objects.
     * 
     * You can check if a CFTypeRef object is actually a CMSampleBuffer by comparing CFGetTypeID(object) with
     * CMSampleBufferGetTypeID().
     * 
     * @return CFTypeID of CMSampleBuffer objects.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTypeID();

    /**
     * [@function] CMSampleBufferSetDataBuffer
     * 
     * Associates a CMSampleBuffer with its CMBlockBuffer of media data.
     * 
     * If successful, this operation retains the dataBuffer thereafter, so the caller can release the dataBuffer
     * after calling this API, if it has no further need to reference it. This is a write-once operation; it will fail
     * if
     * the CMSampleBuffer already has a dataBuffer. This API allows a CMSampleBuffer to exist, with timing and format
     * information, before the associated data shows up. Example of usage: Some media services may have access to sample
     * size, timing, and format information before the data is read. Such services may create CMSampleBuffers with that
     * information and insert them into queues early, and use this API to attach the CMBlockBuffers later, when the data
     * becomes ready.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBuffer(@NotNull CMSampleBufferRef sbuf,
            @NotNull CMBlockBufferRef dataBuffer);

    /**
     * [@function] CMSampleBufferGetDataBuffer
     * 
     * Returns a CMSampleBuffer's CMBlockBuffer of media data.
     * 
     * The caller does not own the returned dataBuffer, and must retain it explicitly if the caller needs to maintain a
     * reference to it.
     * 
     * @return CMBlockBuffer of media data. The result will be NULL if the CMSampleBuffer does not contain a
     *         CMBlockBuffer, if the
     *         CMSampleBuffer contains a CVImageBuffer, or if there is some other error.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CMBlockBufferRef CMSampleBufferGetDataBuffer(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetImageBuffer
     * 
     * Returns a CMSampleBuffer's CVImageBuffer of media data.
     * 
     * The caller does not own the returned dataBuffer, and must retain it explicitly if the caller needs to maintain a
     * reference to it.
     * 
     * @return CVImageBuffer of media data. The result will be NULL if the CMSampleBuffer does not contain a
     *         CVImageBuffer, if the
     *         CMSampleBuffer contains a CMBlockBuffer, or if there is some other error.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CVBufferRef CMSampleBufferGetImageBuffer(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferSetDataBufferFromAudioBufferList
     * 
     * Creates a CMBlockBuffer containing a copy of the data from the AudioBufferList,
     * and sets that as the CMSampleBuffer's data buffer. The resulting buffer(s) in the
     * sample buffer will be 16-byte-aligned if
     * kCMSampleBufferFlag_AudioBufferList_Assure16ByteAlignment is passed in.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBufferFromAudioBufferList(@NotNull CMSampleBufferRef sbuf,
            @Nullable CFAllocatorRef blockBufferStructureAllocator, @Nullable CFAllocatorRef blockBufferBlockAllocator,
            int flags,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    /**
     * [@function] CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer
     * 
     * Creates an AudioBufferList containing the data from the CMSampleBuffer,
     * and a CMBlockBuffer which references (and manages the lifetime of) the
     * data in that AudioBufferList. The data may or may not be copied,
     * depending on the contiguity and 16-byte alignment of the CMSampleBuffer's
     * data. The buffers placed in the AudioBufferList are guaranteed to be contiguous.
     * The buffers in the AudioBufferList will be 16-byte-aligned if
     * kCMSampleBufferFlag_AudioBufferList_Assure16ByteAlignment is passed in.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer(@NotNull CMSampleBufferRef sbuf,
            @Nullable NUIntPtr bufferListSizeNeededOut,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferListOut,
            @NUInt long bufferListSize, @Nullable CFAllocatorRef blockBufferStructureAllocator,
            @Nullable CFAllocatorRef blockBufferBlockAllocator, int flags,
            @Nullable Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMSampleBufferGetAudioStreamPacketDescriptions
     * 
     * Creates an array of AudioStreamPacketDescriptions for the
     * variable bytes per packet or variable frames per packet
     * audio data in the provided CMSampleBuffer. Constant bitrate,
     * constant frames-per-packet audio yields a return value of noErr
     * and no packet descriptions. This API is specific to audio format
     * sample buffers, and will return kCMSampleBufferError_InvalidMediaTypeForOperation
     * if called with a non-audio sample buffer.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptions(@NotNull CMSampleBufferRef sbuf,
            @NUInt long packetDescriptionsSize,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptionsOut,
            @Nullable NUIntPtr packetDescriptionsSizeNeededOut);

    /**
     * [@function] CMSampleBufferGetAudioStreamPacketDescriptionsPtr
     * 
     * Returns a pointer to (and size of) a constant array of
     * AudioStreamPacketDescriptions for the variable bytes per
     * packet or variable frames per packet audio data in the
     * provided CMSampleBuffer. The pointer will remain valid
     * as long as the sbuf continues to be retained.
     * Constant bitrate, constant frames-per-packet audio yields a
     * return value of noErr and no packet descriptions. This API is
     * specific to audio format sample buffers, and will return
     * kCMSampleBufferError_InvalidMediaTypeForOperation if called
     * with a non-audio sample buffer.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptionsPtr(@NotNull CMSampleBufferRef sbuf,
            @Nullable Ptr<ConstPtr<AudioStreamPacketDescription>> packetDescriptionsPointerOut,
            @Nullable NUIntPtr packetDescriptionsSizeOut);

    /**
     * [@function] CMSampleBufferCopyPCMDataIntoAudioBufferList
     * 
     * Copies PCM audio data from the given CMSampleBuffer into
     * a pre-populated AudioBufferList. The AudioBufferList must
     * contain the same number of channels and its data buffers
     * must be sized to hold the specified number of frames.
     * This API is specific to audio format sample buffers, and
     * will return kCMSampleBufferError_InvalidMediaTypeForOperation
     * if called with a non-audio sample buffer. It will return an
     * error if the CMSampleBuffer does not contain PCM audio data
     * or if its dataBuffer is not ready.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCopyPCMDataIntoAudioBufferList(@NotNull CMSampleBufferRef sbuf,
            int frameOffset, int numFrames,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    /**
     * [@function] CMSampleBufferSetDataReady
     * 
     * Marks a CMSampleBuffer's data as "ready".
     * 
     * There is no way to undo this operation. The only way to get an "unready"
     * CMSampleBuffer is to call CMSampleBufferCreate with the dataReady parameter
     * set to false. Example of usage: in a read completion routine.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataReady(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferDataIsReady
     * 
     * Returns whether or not a CMSampleBuffer's data is ready.
     * 
     * @return Whether or not the CMSampleBuffer's data is ready. True is returned for special marker buffers, even
     *         though they have no data. False is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferDataIsReady(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferSetDataFailed
     * 
     * Marks a CMSampleBuffer's data as "failed", to indicate that the data will not become ready.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataFailed(@NotNull CMSampleBufferRef sbuf, int status);

    /**
     * [@function] CMSampleBufferHasDataFailed
     * 
     * Returns whether or not a CMSampleBuffer's data loading request has failed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferHasDataFailed(@NotNull CMSampleBufferRef sbuf, @Nullable IntPtr statusOut);

    /**
     * [@function] CMSampleBufferMakeDataReady
     * 
     * Makes a CMSampleBuffer's data ready, by calling the client's CMSampleBufferMakeDataReadyCallback.
     * 
     * The CMSampleBufferMakeDataReadyCallback is passed in by the client during creation. It must return
     * 0 if successful, and in that case, CMSampleBufferMakeDataReady will set the data readiness of
     * the CMSampleBuffer to true. Example of usage: when it is time to actually use the data. Example of
     * callback routine: a routine to force a scheduled read to complete. If the CMSampleBuffer is not
     * ready, and there is no CMSampleBufferMakeDataReadyCallback to call, kCMSampleBufferError_BufferNotReady
     * will be returned. Similarly, if the CMSampleBuffer is not ready, and the CMSampleBufferMakeDataReadyCallback
     * fails and returns an error, kCMSampleBufferError_BufferNotReady will be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferMakeDataReady(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferTrackDataReadiness
     * 
     * Associates a CMSampleBuffer's data readiness with another CMSampleBuffer's data readiness.
     * 
     * After calling this API, if CMSampleBufferDataIsReady(sbuf) is called, it will return sbufToTrack's data
     * readiness. If CMSampleBufferMakeDataReady(sbuf) is called, it will do it by making sbufToTrack ready.
     * Example of use: This allows bursting a multi-sample CMSampleBuffer into single-sample CMSampleBuffers
     * before the data is ready. The single-sample CMSampleBuffers will all track the multi-sample
     * CMSampleBuffer's data readiness.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferTrackDataReadiness(@NotNull CMSampleBufferRef sbuf,
            @NotNull CMSampleBufferRef sampleBufferToTrack);

    /**
     * [@function] CMSampleBufferInvalidate
     * 
     * Makes the sample buffer invalid, calling any installed invalidation callback.
     * 
     * An invalid sample buffer cannot be used -- all accessors will return kCMSampleBufferError_Invalidated.
     * It is not a good idea to do this to a sample buffer that another module may be accessing concurrently.
     * Example of use: the invalidation callback could cancel pending I/O.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferInvalidate(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferSetInvalidateCallback
     * 
     * Sets the sample buffer's invalidation callback, which is called during CMSampleBufferInvalidate.
     * 
     * A sample buffer can only have one invalidation callback.
     * The invalidation callback is NOT called during ordinary sample buffer finalization.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateCallback(@NotNull CMSampleBufferRef sbuf,
            @NotNull @FunctionPtr(name = "call_CMSampleBufferSetInvalidateCallback") Function_CMSampleBufferSetInvalidateCallback invalidateCallback,
            long invalidateRefCon);

    /**
     * [@function] CMSampleBufferSetInvalidateHandler
     * 
     * Sets the sample buffer's invalidation handler block, which is called during CMSampleBufferInvalidate.
     * 
     * A sample buffer can only have one invalidation callback.
     * The invalidation callback is NOT called during ordinary sample buffer finalization.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateHandler(@NotNull CMSampleBufferRef sbuf,
            @NotNull @ObjCBlock(name = "call_CMSampleBufferSetInvalidateHandler") Block_CMSampleBufferSetInvalidateHandler invalidateHandler);

    /**
     * [@function] CMSampleBufferIsValid
     * 
     * Queries whether a sample buffer is still valid.
     * 
     * Returns false if sbuf is NULL or CMSampleBufferInvalidate(sbuf) was called, true otherwise.
     * Does not perform any kind of exhaustive validation of the sample buffer.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferIsValid(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetNumSamples
     * 
     * Returns the number of media samples in a CMSampleBuffer.
     * 
     * @return The number of media samples in the CMSampleBuffer. 0 is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMSampleBufferGetNumSamples(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetDuration
     * 
     * Returns the total duration of a CMSampleBuffer.
     * 
     * If the buffer contains out-of-presentation-order samples, any gaps in the presentation timeline are not
     * represented in the returned duration.
     * The returned duration is simply the sum of all the individual sample durations.
     * 
     * @return The duration of the CMSampleBuffer. kCMTimeInvalid is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDuration(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetPresentationTimeStamp
     * 
     * Returns the numerically earliest presentation timestamp of all the samples in a CMSampleBuffer.
     * 
     * For in-presentation-order samples, this is the presentation timestamp of the first sample.
     * For out-of-presentation-order samples, this is the presentation timestamp of the sample that
     * will be presented first, which is not necessarily the first sample in the buffer.
     * 
     * @return Numerically earliest sample presentation timestamp in the CMSampleBuffer. kCMTimeInvalid is returned if
     *         there is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetPresentationTimeStamp(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetDecodeTimeStamp
     * 
     * Returns the numerically earliest decode timestamp of all the samples in a CMSampleBuffer.
     * 
     * The returned decode timestamp is always the decode timestamp of the first sample in the buffer,
     * since even out-of-presentation-order samples are expected to be in decode order in the buffer.
     * 
     * @return Numerically earliest sample decode timestamp in the CMSampleBuffer. kCMTimeInvalid is returned if there
     *         is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDecodeTimeStamp(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetOutputDuration
     * 
     * Returns the output duration of a CMSampleBuffer.
     * 
     * The OutputDuration is the duration minus any trimmed duration, all divided by the SpeedMultiplier:
     * (Duration - TrimDurationAtStart - TrimDurationAtEnd) / SpeedMultiplier
     * 
     * @return The output duration of the CMSampleBuffer. kCMTimeInvalid is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDuration(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetOutputPresentationTimeStamp
     * 
     * Returns the output presentation timestamp of the CMSampleBuffer.
     * 
     * The output presentation timestamp is the time at which the decoded, trimmed, stretched
     * and possibly reversed samples should commence being presented.
     * If CMSampleBufferSetOutputPresentationTimeStamp has been called to explicitly set the output PTS,
     * CMSampleBufferGetOutputPresentationTimeStamp returns it.
     * If not, CMSampleBufferGetOutputPresentationTimeStamp calculates its result as
     * (PresentationTimeStamp + TrimDurationAtStart)
     * unless kCMSampleBufferAttachmentKey_Reverse is kCFBooleanTrue, in which case it calculates the result as
     * (PresentationTimeStamp + Duration - TrimDurationAtEnd).
     * These are generally correct for un-stretched, un-shifted playback.
     * For general forward playback in a scaled edit, the OutputPresentationTimeStamp should be set to:
     * ((PresentationTimeStamp + TrimDurationAtStart - EditStartMediaTime) / EditSpeedMultiplier) + EditStartTrackTime.
     * For general reversed playback:
     * ((PresentationTimeStamp + Duration - TrimDurationAtEnd - EditStartMediaTime) / EditSpeedMultiplier) +
     * EditStartTrackTime.
     * 
     * @return kCMTimeInvalid is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputPresentationTimeStamp(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferSetOutputPresentationTimeStamp
     * 
     * Sets an output presentation timestamp to be used in place of a calculated value.
     * 
     * The output presentation timestamp is the time at which the decoded, trimmed, stretched
     * and possibly reversed samples should commence being presented.
     * By default, this is calculated by CMSampleBufferGetOutputPresentationTimeStamp.
     * Call CMSampleBufferSetOutputPresentationTimeStamp to explicitly set the value for
     * CMSampleBufferGetOutputPresentationTimeStamp to return.
     * For general forward playback in a scaled edit, the OutputPresentationTimeStamp should be set to:
     * ((PresentationTimeStamp + TrimDurationAtStart - EditStartMediaTime) / EditSpeedMultiplier) + EditStartTrackTime.
     * For general reversed playback:
     * ((PresentationTimeStamp + Duration - TrimDurationAtEnd - EditStartMediaTime) / EditSpeedMultiplier) +
     * EditStartTrackTime.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetOutputPresentationTimeStamp(@NotNull CMSampleBufferRef sbuf,
            @ByValue CMTime outputPresentationTimeStamp);

    /**
     * [@function] CMSampleBufferGetOutputDecodeTimeStamp
     * 
     * Returns the output decode timestamp of the CMSampleBuffer.
     * 
     * For consistency with CMSampleBufferGetOutputPresentationTimeStamp, this is calculated as:
     * OutputPresentationTimeStamp + ((DecodeTimeStamp - PresentationTimeStamp) / SpeedMultiplier).
     * 
     * @return CMInvalidTime is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDecodeTimeStamp(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetSampleTimingInfoArray
     * 
     * Returns an array of CMSampleTimingInfo structs, one for each sample in a CMSampleBuffer.
     * 
     * If only one CMSampleTimingInfo struct is returned, it applies to all samples in the buffer.
     * See documentation of CMSampleTimingInfo for details of how a single CMSampleTimingInfo struct can apply to
     * multiple samples.
     * The timingArrayOut must be allocated by the caller, and the number of entries allocated must be passed in
     * timingArrayEntries.
     * If timingArrayOut is NULL, timingArrayEntriesNeededOut will return the required number of entries. Similarly,
     * if timingArrayEntries is too small, kCMSampleBufferError_ArrayTooSmall will be returned, and
     * timingArrayEntriesNeededOut
     * will return the required number of entries. In either case, the caller can then make an appropriately-sized
     * timingArrayOut and call again.
     * For example, the caller might pass the address of a CMSampleTimingInfo struct on the stack (as timingArrayOut),
     * and 1 (as
     * timingArrayEntries). If all samples are describable with a single CMSampleTimingInfo struct (or there is only one
     * sample
     * in the CMSampleBuffer), this call will succeed. If not, it will fail, and will return the number of entries
     * required in
     * timingArrayEntriesNeededOut. Only in this case will the caller actually need to allocate an array.
     * 
     * If there is no timingInfo in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleTimingInfo will be
     * returned, and
     * timingArrayEntriesNeededOut will be set to 0.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfoArray(@NotNull CMSampleBufferRef sbuf,
            @NInt long numSampleTimingEntries,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            @Nullable NIntPtr timingArrayEntriesNeededOut);

    /**
     * [@function] CMSampleBufferGetOutputSampleTimingInfoArray
     * 
     * Returns an array of output CMSampleTimingInfo structs, one for each sample in a CMSampleBuffer.
     * 
     * If only one CMSampleTimingInfo struct is returned, it applies to all samples in the buffer.
     * See documentation of CMSampleTimingInfo for details of how a single CMSampleTimingInfo struct can apply to
     * multiple samples.
     * The timingArrayOut must be allocated by the caller, and the number of entries allocated must be passed in
     * timingArrayEntries.
     * If timingArrayOut is NULL, timingArrayEntriesNeededOut will return the required number of entries. Similarly,
     * if timingArrayEntries is too small, kCMSampleBufferError_ArrayTooSmall will be returned, and
     * timingArrayEntriesNeededOut
     * will return the required number of entries. In either case, the caller can then make an appropriately-sized
     * timingArrayOut and call again.
     * For example, the caller might pass the address of a CMSampleTimingInfo struct on the stack (as timingArrayOut),
     * and 1 (as
     * timingArrayEntries). If all samples are describable with a single CMSampleTimingInfo struct (or there is only one
     * sample
     * in the CMSampleBuffer), this call will succeed. If not, it will fail, and will return the number of entries
     * required in
     * timingArrayEntriesNeededOut. Only in this case will the caller actually need to allocate an array.
     * 
     * If there is no timingInfo in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleTimingInfo will be
     * returned,
     * and *timingArrayEntriesNeededOut will be set to 0.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetOutputSampleTimingInfoArray(@NotNull CMSampleBufferRef sbuf,
            @NInt long timingArrayEntries,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            @Nullable NIntPtr timingArrayEntriesNeededOut);

    /**
     * [@function] CMSampleBufferGetSampleTimingInfo
     * 
     * Returns a CMSampleTimingInfo struct describing a specified sample in a CMSampleBuffer.
     * 
     * A sample-specific CMSampleTimingInfo struct will be returned (ie. with a sample-specific
     * presentationTimeStamp and decodeTimeStamp), even if a single CMSampleTimingInfo struct was used
     * during creation to describe all the samples in the buffer. The timingInfo struct must be
     * allocated by the caller. If the sample index is not in the range 0 .. numSamples-1,
     * kCMSampleBufferError_SampleIndexOutOfRange will be returned. If there is no timingInfo
     * in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleTimingInfo will be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfo(@NotNull CMSampleBufferRef sbuf, @NInt long sampleIndex,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingInfoOut);

    /**
     * [@function] CMSampleBufferGetSampleSizeArray
     * 
     * Returns an array of sample sizes, one for each sample in a CMSampleBuffer.
     * 
     * If only one size entry is returned, all samples in the buffer are of this size.
     * The sizeArrayOut must be allocated by the caller, and the number of entries allocated must be passed in
     * sizeArrayEntries.
     * If sizeArrayOut is NULL, sizeArrayEntriesNeededOut will return the required number of entries. Similarly, if
     * sizeArrayEntries
     * is too small, kCMSampleBufferError_ArrayTooSmall will be returned, and sizeArrayEntriesNeededOut will return the
     * required number of entries.
     * The caller can then make an appropriately-sized sizeArrayOut and call again. For example, the caller might pass
     * the address
     * of a size_t variable on the stack (as sizeArrayOut), and 1 (as sizeArrayEntries). If all samples are the same
     * size (or there
     * is only one sample in the CMSampleBuffer), this call would succeed. If not, it will fail, and will return the
     * number of
     * entries required in sizeArrayEntriesNeededOut. Only in this case (multiple samples of different sizes) will the
     * caller
     * need to allocate an array. 0 entries will be returned if the samples in the buffer are non-contiguous (eg.
     * non-interleaved
     * audio, where the channel values for a single sample are scattered through the buffer).
     * 
     * If there are no sample sizes in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleSizes will be
     * returned,
     * and *sizeArrayEntriesNeededOut will be set to 0. This will be true, for example,
     * if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     * the channel values for a single sample are scattered through the buffer), or if
     * this CMSampleBuffer contains a CVImageBuffer.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleSizeArray(@NotNull CMSampleBufferRef sbuf,
            @NInt long sizeArrayEntries, @Nullable NUIntPtr sizeArrayOut, @Nullable NIntPtr sizeArrayEntriesNeededOut);

    /**
     * [@function] CMSampleBufferGetSampleSize
     * 
     * Returns the size in bytes of a specified sample in a CMSampleBuffer.
     * 
     * @return Size in bytes of the specified sample in the CMSampleBuffer.
     *         If the sample index is not in the range 0 .. numSamples-1,
     *         a size of 0 will be returned. If there are no sample sizes
     *         in this CMSampleBuffer, a size of 0 will be returned. This will be true, for example,
     *         if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     *         the channel values for a single sample are scattered through the buffer),
     *         or if this CMSampleBuffer contains a CVImageBuffer.
     * 
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetSampleSize(@NotNull CMSampleBufferRef sbuf, @NInt long sampleIndex);

    /**
     * [@function] CMSampleBufferGetTotalSampleSize
     * 
     * Returns the total size in bytes of sample data in a CMSampleBuffer.
     * 
     * @return Total size in bytes of sample data in the CMSampleBuffer.
     *         If there are no sample sizes in this CMSampleBuffer, a size of 0 will be returned.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTotalSampleSize(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetFormatDescription
     * 
     * Returns the format description of the samples in a CMSampleBuffer.
     * 
     * On return, the caller does not own the returned formatDesc, and must retain it explicitly if the caller needs to
     * maintain a reference to it.
     * 
     * @return The format description of the samples in the CMSampleBuffer. NULL is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CMFormatDescriptionRef CMSampleBufferGetFormatDescription(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMSampleBufferGetSampleAttachmentsArray
     * 
     * Returns a reference to a CMSampleBuffer's immutable array of mutable sample attachments dictionaries (one
     * dictionary
     * per sample in the CMSampleBuffer).
     * 
     * Attachments can then be added/removed directly by the caller, using CF APIs. On return, the caller does not
     * own the returned array of attachments dictionaries, and must retain it if the caller needs to maintain a
     * reference to it. If there are no sample attachments yet, and createIfNecessary is true, a new CFArray containing
     * N empty
     * CFMutableDictionaries is returned (where N is the number of samples in the CMSampleBuffer), so that
     * attachments can be added directly by the caller. If there are no sample attachments yet, and createIfNecessary is
     * false, NULL is returned. Once the CFArray has been created, subsequent calls will return it, even if there are
     * still
     * no sample attachments in the array.
     * 
     * @return A reference to the CMSampleBuffer's immutable array of mutable sample attachments dictionaries (one
     *         dictionary per sample
     *         in the CMSampleBuffer). NULL is returned if there is an error.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CMSampleBufferGetSampleAttachmentsArray(@NotNull CMSampleBufferRef sbuf,
            byte createIfNecessary);

    /**
     * [@function] CMSampleBufferCallForEachSample
     * 
     * Calls a function for every individual sample in a sample buffer.
     * 
     * Temporary sample buffers will be created for individual samples,
     * referring to the sample data and containing its timing, size and attachments.
     * The callback function may retain these sample buffers if desired.
     * If the callback function returns an error, iteration will stop immediately
     * and the error will be returned.
     * If there are no sample sizes in the provided sample buffer, kCMSampleBufferError_CannotSubdivide will be
     * returned.
     * This will happen, for example, if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     * the channel values for a single sample are scattered through the buffer).
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCallForEachSample(@NotNull CMSampleBufferRef sbuf,
            @NotNull @FunctionPtr(name = "call_CMSampleBufferCallForEachSample") Function_CMSampleBufferCallForEachSample callback,
            @Nullable VoidPtr refcon);

    /**
     * [@function] CMSampleBufferCallBlockForEachSample
     * 
     * Calls a block for every individual sample in a sample buffer.
     * 
     * Temporary sample buffers will be created for individual samples,
     * referring to the sample data and containing its timing, size and attachments.
     * The block may retain these sample buffers if desired.
     * If the block returns an error, iteration will stop immediately
     * and the error will be returned.
     * If there are no sample sizes in the provided sample buffer, kCMSampleBufferError_CannotSubdivide will be
     * returned.
     * This will happen, for example, if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     * the channel values for a single sample are scattered through the buffer).
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCallBlockForEachSample(@NotNull CMSampleBufferRef sbuf,
            @NotNull @ObjCBlock(name = "call_CMSampleBufferCallBlockForEachSample") Block_CMSampleBufferCallBlockForEachSample handler);

    /**
     * [@function] CMClockGetTypeID
     * 
     * Returns the CFTypeID for CMClock.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMClockGetTypeID();

    /**
     * [@function] CMClockGetHostTimeClock
     * 
     * Returns a reference to the singleton clock logically identified with host time.
     * 
     * On Mac OS X, the host time clock uses mach_absolute_time but returns a value
     * with a large integer timescale (eg, nanoseconds).
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CMClockRef CMClockGetHostTimeClock();

    /**
     * [@function] CMClockConvertHostTimeToSystemUnits
     * 
     * Converts a host time from CMTime to the host time's native units.
     * 
     * This function performs a scale conversion, not a clock conversion.
     * It can be more accurate than CMTimeConvertScale because the system units may
     * have a non-integer timescale.
     * On Mac OS X, this function converts to the units of mach_absolute_time.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native long CMClockConvertHostTimeToSystemUnits(@ByValue CMTime hostTime);

    /**
     * [@function] CMClockMakeHostTimeFromSystemUnits
     * 
     * Converts a host time from native units to CMTime.
     * 
     * The returned value will have a large integer timescale (eg, nanoseconds).
     * This function handles situations where host time's native units use a
     * non-integer timescale.
     * On Mac OS X, this function converts from the units of mach_absolute_time.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockMakeHostTimeFromSystemUnits(long hostTime);

    /**
     * [@function] CMClockGetTime
     * 
     * Retrieves the current time from a clock.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockGetTime(@NotNull CMClockRef clock);

    /**
     * [@function] CMClockGetAnchorTime
     * 
     * Retrieves the current time from a clock and also the matching time from the clock's reference clock.
     * 
     * To make practical use of this, you may need to know what the clock's reference clock is.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMClockGetAnchorTime(@NotNull CMClockRef clock,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMTime clockTimeOut,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMTime referenceClockTimeOut);

    /**
     * [@function] CMClockMightDrift
     * 
     * Indicates whether it is possible for two clocks to drift relative to each other.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native byte CMClockMightDrift(@NotNull CMClockRef clock, @NotNull CMClockRef otherClock);

    /**
     * [@function] CMClockInvalidate
     * 
     * Makes the clock stop functioning.
     * 
     * After invalidation, the clock will return errors from all APIs.
     * This should only be called by the "owner" of the clock, who knows (for example) that some piece of hardware
     * has gone away, and the clock will no longer work (and might even crash).
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native void CMClockInvalidate(@NotNull CMClockRef clock);

    /**
     * [@function] CMTimebaseGetTypeID
     * 
     * Returns the CFTypeID for CMTimebase.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMTimebaseGetTypeID();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterClock(@Nullable CFAllocatorRef allocator,
            @NotNull CMClockRef masterClock, @NotNull Ptr<CMTimebaseRef> timebaseOut);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterTimebase(@Nullable CFAllocatorRef allocator,
            @NotNull CMTimebaseRef masterTimebase, @NotNull Ptr<CMTimebaseRef> timebaseOut);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CMTimebaseRef CMTimebaseCopyMasterTimebase(@NotNull CMTimebaseRef timebase);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseCopyMasterClock(@NotNull CMTimebaseRef timebase);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 9.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr CMTimebaseCopyMaster(@NotNull CMTimebaseRef timebase);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 9.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseCopyUltimateMasterClock(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseGetMasterTimebase
     * 
     * Returns the immediate source timebase of a timebase.
     * 
     * Returns NULL if the timebase actually has a source clock instead of a source timebase.
     * Please use CMTimebaseCopySourceTimebase instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Generated
    @Deprecated
    @CFunction
    public static native CMTimebaseRef CMTimebaseGetMasterTimebase(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseGetMasterClock
     * 
     * Returns the immediate source clock of a timebase.
     * 
     * Returns NULL if the timebase actually has a source timebase instead of a source clock.
     * Please use CMTimebaseCopySourceClock instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Generated
    @Deprecated
    @CFunction
    public static native CMClockRef CMTimebaseGetMasterClock(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseGetMaster
     * 
     * Returns the immediate source (either timebase or clock) of a timebase.
     * 
     * Only returns NULL if there was an error (such as timebase == NULL).
     * Example of use: time = CMSyncGetTime(CMTimebaseGetMaster(timebase));
     * Please use CMTimebaseCopySource instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CMTimebaseGetMaster(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseGetUltimateMasterClock
     * 
     * Returns the source clock that is the source of all of a timebase's source timebases.
     * 
     * Please use CMTimebaseCopyUltimateSourceClock instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Generated
    @Deprecated
    @CFunction
    public static native CMClockRef CMTimebaseGetUltimateMasterClock(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseGetTime
     * 
     * Retrieves the current time from a timebase.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTime(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseGetTimeWithTimeScale
     * 
     * Retrieves the current time from a timebase in the specified timescale.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTimeWithTimeScale(@NotNull CMTimebaseRef timebase, int timescale,
            int method);

    /**
     * [@function] CMTimebaseSetTime
     * 
     * Sets the current time of a timebase.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTime(@NotNull CMTimebaseRef timebase, @ByValue CMTime time);

    /**
     * [@function] CMTimebaseSetAnchorTime
     * 
     * Sets the time of a timebase at a particular source time.
     * 
     * CMTimebaseGetTime's results will be interpolated from that anchor time.
     * CMTimebaseSetTime(timebase, time) is equivalent to calling
     * CMClockOrTimebaseRef source = CMTimebaseCopySource(timebase);
     * CMTimebaseSetAnchorTime(timebase, time, CMSyncGetTime(source));
     * CFRelease(source).
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetAnchorTime(@NotNull CMTimebaseRef timebase, @ByValue CMTime timebaseTime,
            @ByValue CMTime immediateSourceTime);

    /**
     * [@function] CMTimebaseGetRate
     * 
     * Retrieves the current rate of a timebase.
     * 
     * This is the rate relative to its immediate source clock or timebase.
     * For example, if a timebase is running at twice the rate of its source, its rate is 2.0.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native double CMTimebaseGetRate(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseGetTimeAndRate
     * 
     * Retrieves the current time and rate of a timebase.
     * 
     * You can use this function to take a consistent snapshot of the two values,
     * avoiding possible inconsistencies due to external changes between retrieval of time and rate.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseGetTimeAndRate(@NotNull CMTimebaseRef timebase,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMTime timeOut,
            @Nullable DoublePtr rateOut);

    /**
     * [@function] CMTimebaseSetRate
     * 
     * Sets the rate of a timebase.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetRate(@NotNull CMTimebaseRef timebase, double rate);

    /**
     * [@function] CMTimebaseSetRateAndAnchorTime
     * 
     * Sets the time of a timebase at a particular source time, and changes the rate at exactly that time.
     * 
     * CMTimebaseGetTime's results will be interpolated from that anchor time as though the timebase
     * has been running at the requested rate since that time.
     * CMTimebaseSetRate(timebase, rate) is approximately equivalent to calling
     * CMClockOrTimebaseRef source = CMTimebaseCopySource(timebase);
     * CMTimebaseSetRateAndAnchorTime(timebase, rate, CMTimebaseGetTime(timebase), CMSyncGetTime(source)),
     * CFRelease(source);
     * except that CMTimebaseSetRate will not generate a TimeJumped notification, and
     * CMTimebaseSetRateAndAnchorTime will.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetRateAndAnchorTime(@NotNull CMTimebaseRef timebase, double rate,
            @ByValue CMTime timebaseTime, @ByValue CMTime immediateSourceTime);

    /**
     * [@function] CMTimebaseGetEffectiveRate
     * 
     * Gets the effective rate of a timebase (which combines its rate with the rates of all its source timebases).
     * 
     * Calling CMTimebaseGetEffectiveRate(timebase) is equivalent to calling
     * CMClockRef clock = CMTimebaseCopyUltimateSourceClock(timebase);
     * CMSyncGetRelativeRate(timebase, clock).
     * CFRelease(clock);
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native double CMTimebaseGetEffectiveRate(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMTimebaseAddTimer
     * 
     * Adds the timer to the list of timers managed by the timebase.
     * 
     * The timer must be a repeating run loop timer (with a very long interval at
     * least as long as kCMTimebaseVeryLongCFTimeInterval), attached to a runloop.
     * The timebase will retain the timer, and will maintain its "NextFireDate"
     * according to the CMTime set using CMTimebaseSetTimerNextFireTime.
     * Until the first call to CMTimebaseSetTimerNextFireTime, the "NextFireDate"
     * will be set far, far in the future. The runloop that timer is attached to must be
     * passed in and the timebase will retain that runloop. The retained runloop will be
     * used to call CFRunLoopWakeUp() any time the timebase modifies the timer's fire date.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseAddTimer(@NotNull CMTimebaseRef timebase, @NotNull CFRunLoopTimerRef timer,
            @NotNull CFRunLoopRef runloop);

    /**
     * [@function] CMTimebaseRemoveTimer
     * 
     * Removes the timer from the list of timers managed by the timebase.
     * 
     * The timebase will no longer maintain the timer's "NextFireDate".
     * If the timer is invalidated, the timebase will eventually remove it
     * from its list and release it even if this function is not called.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimer(@NotNull CMTimebaseRef timebase, @NotNull CFRunLoopTimerRef timer);

    /**
     * [@function] CMTimebaseSetTimerNextFireTime
     * 
     * Sets the CMTime on the timebase's timeline at which the timer should next be fired.
     * 
     * The timer must be on the list of timers managed by the timebase.
     * The timebase will continue to update the timer's "NextFireDate" according to time jumps
     * and effective rate changes.
     * If fireTime is not numeric, or if the timebase is not moving, the "NextFireDate"
     * will be set to a date far, far in the future.
     * <BR>
     * IMPORTANT NOTE: Due to the way that CFRunLoopTimers are implemented, if a timer passes
     * through a state in which it is due to fire, it may fire even if its rescheduled before
     * the runloop runs again. Clients should take care to avoid temporarily scheduling timers
     * in the past. For example, set the timebase's rate or time before you set the timer's
     * next fire time, if you are doing both at once. (If setting the timebase's rate or time
     * might put the timer's fire time in the past, you may need to set the fire time to
     * kCMTimeInvalid across the timebase change.)
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerNextFireTime(@NotNull CMTimebaseRef timebase,
            @NotNull CFRunLoopTimerRef timer, @ByValue CMTime fireTime, int flags);

    /**
     * [@function] CMTimebaseSetTimerToFireImmediately
     * 
     * Sets the timer to fire immediately once, overriding any previous CMTimebaseSetTimerNextFireTime call.
     * 
     * The timer must be on the list of timers managed by the timebase.
     * This is equivalent to calling
     * CFRunLoopTimerSetNextFireDate( timer, CFAbsoluteTimeGetCurrent() );
     * except that the timebase gets to know that it shouldn't interfere.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerToFireImmediately(@NotNull CMTimebaseRef timebase,
            @NotNull CFRunLoopTimerRef timer);

    /**
     * [@function] CMTimebaseAddTimerDispatchSource
     * 
     * Adds the timer dispatch source to the list of timers managed by the timebase.
     * 
     * The timer source must have been created by calling
     * dispatch_source_create( DISPATCH_SOURCE_TYPE_TIMER, 0, 0, some_dispatch_queue )
     * and should have had an event handler associated with it via
     * dispatch_source_set_event_handler( timerSource, some_handler_block )
     * or dispatch_source_set_event_handler_f( timerSource, some_handler_function ).
     * Don't forget to call dispatch_resume( timerSource ) as dispatch sources are
     * created suspended.
     * 
     * The timebase will retain the timer source, and will maintain its start time
     * according to the CMTime set using CMTimebaseSetTimerDispatchSourceNextFireTime.
     * Until the first call to CMTimebaseSetTimerDispatchSourceNextFireTime, the start time
     * will be set to DISPATCH_TIME_FOREVER.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseAddTimerDispatchSource(@NotNull CMTimebaseRef timebase,
            @NotNull dispatch_source_t timerSource);

    /**
     * [@function] CMTimebaseRemoveTimerDispatchSource
     * 
     * Removes the timer dispatch source from the list of timers managed by the timebase.
     * 
     * The timebase will no longer maintain the timer source's start time.
     * If the timer source is cancelled, the timebase will eventually remove it
     * from its list and release it even if this function is not called.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimerDispatchSource(@NotNull CMTimebaseRef timebase,
            @NotNull dispatch_source_t timerSource);

    /**
     * [@function] CMTimebaseSetTimerDispatchSourceNextFireTime
     * 
     * Sets the CMTime on the timebase's timeline at which the timer dispatch source should next be fired.
     * 
     * The timer source must be on the list of timers managed by the timebase.
     * The timebase will continue to update the timer dispatch source's start time
     * according to time jumps and effective rate changes.
     * If fireTime is not numeric, or if the timebase is not moving, the start time
     * will be set to DISPATCH_TIME_FOREVER.
     * <BR>
     * IMPORTANT NOTE: Due to the way that timer dispatch sources are implemented, if a timer passes
     * through a state in which it is due to fire, it may fire even if its rescheduled before
     * the event handler is run. Clients should take care to avoid temporarily scheduling timers
     * in the past. For example, set the timebase's rate or time before you set the timer's
     * next fire time, if you are doing both at once. (If setting the timebase's rate or time
     * might put the timer's fire time in the past, you may need to set the fire time to
     * kCMTimeInvalid across the timebase change.)
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceNextFireTime(@NotNull CMTimebaseRef timebase,
            @NotNull dispatch_source_t timerSource, @ByValue CMTime fireTime, int flags);

    /**
     * [@function] CMTimebaseSetTimerDispatchSourceToFireImmediately
     * 
     * Sets the timer dispatch source to fire immediately once, overriding any previous
     * CMTimebaseSetTimerDispatchSourceNextFireTime call.
     * 
     * The timer source must be on the list of timers managed by the timebase.
     * This is equivalent to calling
     * dispatch_source_set_timer( timerSource, DISPATCH_TIME_NOW, 0, 0 );
     * except that the timebase gets to know that it shouldn't interfere.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceToFireImmediately(@NotNull CMTimebaseRef timebase,
            @NotNull dispatch_source_t timerSource);

    /**
     * [@function] CMSyncGetRelativeRate
     * 
     * Queries the relative rate of one timebase or clock relative to another timebase or clock.
     * 
     * If both have a common source, this calculation is performed purely based on the rates in the common tree
     * rooted in that source.
     * If they have different source clocks (or are both clocks), this calculation takes into account the measured
     * drift between the two clocks, using host time as a pivot.
     * The rate of a moving timebase relative to a stopped timebase is a NaN.
     * Calling CMTimebaseGetEffectiveRate(timebase) is equivalent to calling
     * CMClockRef clock = CMTimebaseCopyUltimateSourceClock(timebase);
     * CMSyncGetRelativeRate(timebase, clock).
     * CFRelease(clock);
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native double CMSyncGetRelativeRate(@NotNull ConstVoidPtr ofClockOrTimebase,
            @NotNull ConstVoidPtr relativeToClockOrTimebase);

    /**
     * [@function] CMSyncGetRelativeRateAndAnchorTime
     * 
     * Queries the relative rate of one timebase or clock relative to another timebase or clock and the times of each
     * timebase or clock at which the relative rate went into effect.
     * 
     * If both have a common source, this calculation is performed purely based on the rates in the common tree
     * rooted in that source.
     * If they have different source clocks (or are both clocks), this calculation takes into account the measured
     * drift between the two clocks, using host time as a pivot.
     * The rate of a moving timebase relative to a stopped timebase is a NaN.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMSyncGetRelativeRateAndAnchorTime(@NotNull ConstVoidPtr ofClockOrTimebase,
            @NotNull ConstVoidPtr relativeToClockOrTimebase, @Nullable DoublePtr outRelativeRate,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMTime outOfClockOrTimebaseAnchorTime,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMTime outRelativeToClockOrTimebaseAnchorTime);

    /**
     * [@function] CMSyncConvertTime
     * 
     * Converts a time from one timebase or clock to another timebase or clock.
     * 
     * If both have a common source, this calculation is performed purely based on the mathematical rates and offsets
     * in the common tree rooted in that source.
     * If they have different source clocks (or are both clocks), this calculation also compensates
     * for measured drift between the clocks.
     * To convert to or from host time, pass CMClockGetHostTimeClock() as the appropriate argument.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncConvertTime(@ByValue CMTime time, @NotNull ConstVoidPtr fromClockOrTimebase,
            @NotNull ConstVoidPtr toClockOrTimebase);

    /**
     * [@function] CMSyncMightDrift
     * 
     * Reports whether it is possible for one timebase/clock to drift relative to the other.
     * 
     * A timebase can drift relative to another if their ultimate source clocks that can drift relative
     * to each other.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native byte CMSyncMightDrift(@NotNull ConstVoidPtr clockOrTimebase1,
            @NotNull ConstVoidPtr clockOrTimebase2);

    /**
     * [@function] CMSyncGetTime
     * 
     * A helper function to get time from a clock or timebase.
     * 
     * CMSyncGetTime simply calls either CMClockGetTime or CMTimebaseGetTime, as appropriate.
     * It comes in handy for things like:
     * CMClockOrTimebaseRef source = CMTimebaseCopySource(timebase);
     * CMSyncGetTime(source);
     * CFRelease(source);
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncGetTime(@NotNull ConstVoidPtr clockOrTimebase);

    /**
     * [@function] CMTimebaseNotificationBarrier
     * 
     * Requests that the timebase wait until it is not posting any notifications.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMTimebaseNotificationBarrier(@NotNull CMTimebaseRef timebase);

    /**
     * [@function] CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData
     * 
     * Creates a CMVideoFormatDescription from a big-endian ImageDescription data structure.
     * 
     * @param allocator            Allocator to use for allocating the CMVideoFormatDescription object. May be NULL.
     * @param imageDescriptionData ImageDescription data structure in big-endian byte ordering.
     * @param size                 Size of ImageDescription data structure.
     * @param stringEncoding       Pass CFStringGetSystemEncoding() or GetApplicationTextEncoding().
     * @param flavor               kCMImageDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param formatDescriptionOut Receives new CMVideoFormatDescription.
     * 
     *                             API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String imageDescriptionData,
            @NUInt long size, int stringEncoding, @Nullable CFStringRef flavor,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer
     * 
     * Creates a CMVideoFormatDescription from a big-endian ImageDescription data structure in a CMBlockBuffer.
     * 
     * @param allocator                   Allocator to use for allocating the CMVideoFormatDescription object. May be
     *                                    NULL.
     * @param imageDescriptionBlockBuffer CMBlockBuffer containing ImageDescription data structure in big-endian byte
     *                                    ordering.
     * @param stringEncoding              Pass CFStringGetSystemEncoding() or GetApplicationTextEncoding().
     * @param flavor                      kCMImageDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param formatDescriptionOut        Receives new CMVideoFormatDescription.
     * 
     *                                    API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMBlockBufferRef imageDescriptionBlockBuffer,
            int stringEncoding, @Nullable CFStringRef flavor,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer
     * 
     * Copies the contents of a CMVideoFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     * Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     * garbage values (0xFFFF). The caller must overwrite these values with a valid dataRefIndex
     * if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param allocator              Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param videoFormatDescription CMVideoFormatDescription to be copied.
     * @param stringEncoding         Pass CFStringGetSystemEncoding() or GetApplicationTextEncoding().
     * @param flavor                 kCMImageDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param blockBufferOut         Receives new CMBlockBuffer containing ImageDescription data structure in big-endian
     *                               byte ordering.
     * 
     *                               API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef videoFormatDescription,
            int stringEncoding, @Nullable CFStringRef flavor, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMSwapBigEndianImageDescriptionToHost
     * 
     * Converts an ImageDescription data structure from big-endian to host-endian in place.
     * 
     * @param imageDescriptionData ImageDescription data structure in big-endian byte ordering to be converted to
     *                             host-endian byte ordering.
     * @param imageDescriptionSize Size of ImageDescription data structure.
     * 
     *                             API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianImageDescriptionToHost(@NotNull BytePtr imageDescriptionData,
            @NUInt long imageDescriptionSize);

    /**
     * [@function] CMSwapHostEndianImageDescriptionToBig
     * 
     * Converts an ImageDescription data structure from host-endian to big-endian in place.
     * 
     * @param imageDescriptionData ImageDescription data structure in host-endian byte ordering to be converted to
     *                             big-endian byte ordering.
     * @param imageDescriptionSize Size of ImageDescription data structure.
     * 
     *                             API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianImageDescriptionToBig(@NotNull BytePtr imageDescriptionData,
            @NUInt long imageDescriptionSize);

    /**
     * [@function] CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionData
     * 
     * Creates a CMAudioFormatDescription from a big-endian SoundDescription data structure.
     * 
     * @param allocator            Allocator to use for allocating the CMAudioFormatDescription object. May be NULL.
     * @param soundDescriptionData SoundDescription data structure in big-endian byte ordering.
     * @param size                 Size of SoundDescription data structure.
     * @param flavor               kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param formatDescriptionOut Receives new CMAudioFormatDescription.
     * 
     *                             API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionData(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String soundDescriptionData,
            @NUInt long size, @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer
     * 
     * Creates a CMAudioFormatDescription from a big-endian SoundDescription data structure in a CMBlockBuffer.
     * 
     * @param allocator                   Allocator to use for allocating the CMAudioFormatDescription object. May be
     *                                    NULL.
     * @param soundDescriptionBlockBuffer CMBlockBuffer containing SoundDescription data structure in big-endian byte
     *                                    ordering.
     * @param flavor                      kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param formatDescriptionOut        Receives new CMAudioFormatDescription.
     * 
     *                                    API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMBlockBufferRef soundDescriptionBlockBuffer,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer
     * 
     * Copies the contents of a CMAudioFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     * Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     * garbage values (0xFFFF). The caller must overwrite these values with a valid dataRefIndex
     * if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param allocator              Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param audioFormatDescription CMAudioFormatDescription to be copied.
     * @param flavor                 kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param blockBufferOut         Receives new CMBlockBuffer containing SoundDescription data structure in big-endian
     *                               byte ordering.
     * 
     *                               API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef audioFormatDescription,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMDoesBigEndianSoundDescriptionRequireLegacyCBRSampleTableLayout
     * 
     * Examine a big-endian SoundDescription data structure in a CMBlockBuffer, and report whether the sample tables
     * will need to use the legacy CBR layout.
     * 
     * @param soundDescriptionBlockBuffer CMBlockBuffer containing SoundDescription data structure in big-endian byte
     *                                    ordering.
     * @param flavor                      kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * 
     *                                    API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte CMDoesBigEndianSoundDescriptionRequireLegacyCBRSampleTableLayout(
            @NotNull CMBlockBufferRef soundDescriptionBlockBuffer, @Nullable CFStringRef flavor);

    /**
     * [@function] CMSwapBigEndianSoundDescriptionToHost
     * 
     * Converts a SoundDescription data structure from big-endian to host-endian in place.
     * 
     * @param soundDescriptionData SoundDescription data structure in big-endian byte ordering to be converted to
     *                             host-endian byte ordering.
     * @param soundDescriptionSize Size of SoundDescription data structure.
     * 
     *                             API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianSoundDescriptionToHost(@NotNull BytePtr soundDescriptionData,
            @NUInt long soundDescriptionSize);

    /**
     * [@function] CMSwapHostEndianSoundDescriptionToBig
     * 
     * Converts a SoundDescription data structure from host-endian to big-endian in place.
     * 
     * @param soundDescriptionData SoundDescription data structure in host-endian byte ordering to be converted to
     *                             big-endian byte ordering.
     * @param soundDescriptionSize Size of SoundDescription data structure.
     * 
     *                             API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianSoundDescriptionToBig(@NotNull BytePtr soundDescriptionData,
            @NUInt long soundDescriptionSize);

    /**
     * [@function] CMTextFormatDescriptionCreateFromBigEndianTextDescriptionData
     * 
     * Creates a CMTextFormatDescription from a big-endian TextDescription data structure.
     * 
     * @param allocator            Allocator to use for allocating the CMTextFormatDescription object. May be NULL.
     * @param textDescriptionData  TextDescription data structure in big-endian byte ordering.
     * @param size                 Size of TextDescription data structure.
     * @param flavor               Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param mediaType            Pass kCMMediaType_Text or kCMMediaType_Subtitle.
     * @param formatDescriptionOut Receives new CMTextFormatDescription.
     * 
     *                             API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCreateFromBigEndianTextDescriptionData(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String textDescriptionData,
            @NUInt long size, @Nullable CFStringRef flavor, int mediaType,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer
     * 
     * Creates a CMTextFormatDescription from a big-endian TextDescription data structure in a CMBlockBuffer.
     * 
     * @param allocator                  Allocator to use for allocating the CMTextFormatDescription object. May be
     *                                   NULL.
     * @param textDescriptionBlockBuffer CMBlockBuffer containing TextDescription data structure in big-endian byte
     *                                   ordering.
     * @param flavor                     Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param mediaType                  Pass kCMMediaType_Text or kCMMediaType_Subtitle.
     * @param formatDescriptionOut       Receives new CMTextFormatDescription.
     * 
     *                                   API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMBlockBufferRef textDescriptionBlockBuffer,
            @Nullable CFStringRef flavor, int mediaType, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer
     * 
     * Copies the contents of a CMTextFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     * Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     * garbage values (0xFFFF). The caller must overwrite these values with a valid dataRefIndex
     * if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param allocator             Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param textFormatDescription CMTextFormatDescription to be copied.
     * @param flavor                Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param blockBufferOut        Receives new CMBlockBuffer containing TextDescription data structure in big-endian
     *                              byte ordering.
     * 
     *                              API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef textFormatDescription,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMSwapBigEndianTextDescriptionToHost
     * 
     * Converts a TextDescription data structure from big-endian to host-endian in place.
     * 
     * @param textDescriptionData TextDescription data structure in big-endian byte ordering to be converted to
     *                            host-endian byte ordering.
     * @param textDescriptionSize Size of TextDescription data structure.
     * 
     *                            API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianTextDescriptionToHost(@NotNull BytePtr textDescriptionData,
            @NUInt long textDescriptionSize);

    /**
     * [@function] CMSwapHostEndianTextDescriptionToBig
     * 
     * Converts a TextDescription data structure from host-endian to big-endian in place.
     * 
     * @param textDescriptionData TextDescription data structure in host-endian byte ordering to be converted to
     *                            big-endian byte ordering.
     * @param textDescriptionSize Size of TextDescription data structure.
     * 
     *                            API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianTextDescriptionToBig(@NotNull BytePtr textDescriptionData,
            @NUInt long textDescriptionSize);

    /**
     * [@function] CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionData
     * 
     * Creates a CMClosedCaptionFormatDescription from a big-endian ClosedCaptionDescription data structure.
     * 
     * @param allocator                    Allocator to use for allocating the CMClosedCaptionFormatDescription object.
     *                                     May be NULL.
     * @param closedCaptionDescriptionData ClosedCaptionDescription data structure in big-endian byte ordering.
     * @param size                         Size of ClosedCaptionDescription data structure.
     * @param flavor                       Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param formatDescriptionOut         Receives new CMClosedCaptionFormatDescription.
     * 
     *                                     API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionData(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String closedCaptionDescriptionData,
            @NUInt long size, @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionBlockBuffer
     * 
     * Creates a CMClosedCaptionFormatDescription from a big-endian ClosedCaptionDescription data structure in a
     * CMBlockBuffer.
     * 
     * @param allocator                           Allocator to use for allocating the CMClosedCaptionFormatDescription
     *                                            object. May be NULL.
     * @param closedCaptionDescriptionBlockBuffer CMBlockBuffer containing ClosedCaptionDescription data structure in
     *                                            big-endian byte ordering.
     * @param flavor                              Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param formatDescriptionOut                Receives new CMClosedCaptionFormatDescription.
     * 
     *                                            API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMBlockBufferRef closedCaptionDescriptionBlockBuffer,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMClosedCaptionFormatDescriptionCopyAsBigEndianClosedCaptionDescriptionBlockBuffer
     * 
     * Copies the contents of a CMClosedCaptionFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     * Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     * garbage values (0xFFFF). The caller must overwrite these values with a valid dataRefIndex
     * if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param allocator                      Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param closedCaptionFormatDescription CMClosedCaptionFormatDescription to be copied.
     * @param flavor                         Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param blockBufferOut                 Receives new CMBlockBuffer containing ClosedCaptionDescription data
     *                                       structure in big-endian byte ordering.
     * 
     *                                       API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCopyAsBigEndianClosedCaptionDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef closedCaptionFormatDescription,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMSwapBigEndianClosedCaptionDescriptionToHost
     * 
     * Converts a ClosedCaptionDescription data structure from big-endian to host-endian in place.
     * 
     * @param closedCaptionDescriptionData ClosedCaptionDescription data structure in big-endian byte ordering to be
     *                                     converted to host-endian byte ordering.
     * @param closedCaptionDescriptionSize Size of ClosedCaptionDescription data structure.
     * 
     *                                     API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianClosedCaptionDescriptionToHost(
            @NotNull BytePtr closedCaptionDescriptionData, @NUInt long closedCaptionDescriptionSize);

    /**
     * [@function] CMSwapHostEndianClosedCaptionDescriptionToBig
     * 
     * Converts a ClosedCaptionDescription data structure from host-endian to big-endian in place.
     * 
     * @param closedCaptionDescriptionData ClosedCaptionDescription data structure in host-endian byte ordering to be
     *                                     converted to big-endian byte ordering.
     * @param closedCaptionDescriptionSize Size of ClosedCaptionDescription data structure.
     * 
     *                                     API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianClosedCaptionDescriptionToBig(
            @NotNull BytePtr closedCaptionDescriptionData, @NUInt long closedCaptionDescriptionSize);

    /**
     * [@function] CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionData
     * 
     * Creates a CMTimeCodeFormatDescription from a big-endian TimeCodeDescription data structure.
     * 
     * @param allocator               Allocator to use for allocating the CMTimeCodeFormatDescription object. May be
     *                                NULL.
     * @param timeCodeDescriptionData TimeCodeDescription data structure in big-endian byte ordering.
     * @param size                    Size of TimeCodeDescription data structure.
     * @param flavor                  Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param formatDescriptionOut    Receives new CMTimeCodeFormatDescription.
     * 
     *                                API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionData(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String timeCodeDescriptionData,
            @NUInt long size, @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer
     * 
     * Creates a CMTimeCodeFormatDescription from a big-endian TimeCodeDescription data structure in a CMBlockBuffer.
     * 
     * @param allocator                      Allocator to use for allocating the CMTimeCodeFormatDescription object. May
     *                                       be NULL.
     * @param timeCodeDescriptionBlockBuffer CMBlockBuffer containing TimeCodeDescription data structure in big-endian
     *                                       byte ordering.
     * @param flavor                         Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param formatDescriptionOut           Receives new CMTimeCodeFormatDescription.
     * 
     *                                       API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMBlockBufferRef timeCodeDescriptionBlockBuffer,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer
     * 
     * Copies the contents of a CMTimeCodeFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     * Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     * garbage values (0xFFFF). The caller must overwrite these values with a valid dataRefIndex
     * if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param allocator                 Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param timeCodeFormatDescription CMTimeCodeFormatDescription to be copied.
     * @param flavor                    Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param blockBufferOut            Receives new CMBlockBuffer containing TimeCodeDescription data structure in
     *                                  big-endian byte ordering.
     * 
     *                                  API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef timeCodeFormatDescription,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMSwapBigEndianTimeCodeDescriptionToHost
     * 
     * Converts a TimeCodeDescription data structure from big-endian to host-endian in place.
     * 
     * @param timeCodeDescriptionData TimeCodeDescription data structure in big-endian byte ordering to be converted to
     *                                host-endian byte ordering.
     * @param timeCodeDescriptionSize Size of TimeCodeDescription data structure.
     * 
     *                                API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianTimeCodeDescriptionToHost(@NotNull BytePtr timeCodeDescriptionData,
            @NUInt long timeCodeDescriptionSize);

    /**
     * [@function] CMSwapHostEndianTimeCodeDescriptionToBig
     * 
     * Converts a TimeCodeDescription data structure from host-endian to big-endian in place.
     * 
     * @param timeCodeDescriptionData TimeCodeDescription data structure in host-endian byte ordering to be converted to
     *                                big-endian byte ordering.
     * @param timeCodeDescriptionSize Size of TimeCodeDescription data structure.
     * 
     *                                API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianTimeCodeDescriptionToBig(@NotNull BytePtr timeCodeDescriptionData,
            @NUInt long timeCodeDescriptionSize);

    /**
     * [@function] CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionData
     * 
     * Creates a CMMetadataFormatDescription from a big-endian MetadataDescription data structure.
     * 
     * @param allocator               Allocator to use for allocating the CMMetadataFormatDescription object. May be
     *                                NULL.
     * @param metadataDescriptionData MetadataDescription data structure in big-endian byte ordering.
     * @param size                    Size of MetadataDescription data structure.
     * @param flavor                  Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param formatDescriptionOut    Receives new CMMetadataFormatDescriptionRef.
     * 
     *                                API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionData(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String metadataDescriptionData,
            @NUInt long size, @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer
     * 
     * Creates a CMMetadataFormatDescription from a big-endian MetadataDescription data structure in a CMBlockBuffer.
     * 
     * @param allocator                      Allocator to use for allocating the CMMetadataFormatDescription object. May
     *                                       be NULL.
     * @param metadataDescriptionBlockBuffer CMBlockBuffer containing MetadataDescription data structure in big-endian
     *                                       byte ordering.
     * @param flavor                         Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param formatDescriptionOut           Receives new CMMetadataFormatDescriptionRef.
     * 
     *                                       API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMBlockBufferRef metadataDescriptionBlockBuffer,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer
     * 
     * Copies the contents of a CMMetadataFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     * Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     * garbage values (0xFFFF). The caller must overwrite these values with a valid dataRefIndex
     * if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param allocator                 Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param metadataFormatDescription CMMetadataFormatDescriptionRef to be copied.
     * @param flavor                    Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param blockBufferOut            Receives new CMBlockBuffer containing MetadataDescription data structure in
     *                                  big-endian byte ordering.
     * 
     *                                  API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer(
            @Nullable CFAllocatorRef allocator, @NotNull CMFormatDescriptionRef metadataFormatDescription,
            @Nullable CFStringRef flavor, @NotNull Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function] CMSwapBigEndianMetadataDescriptionToHost
     * 
     * Converts a MetadataDescription data structure from big-endian to host-endian in place.
     * 
     * @param metadataDescriptionData MetadataDescription data structure in big-endian byte ordering to be converted to
     *                                host-endian byte ordering.
     * @param metadataDescriptionSize Size of MetadataDescription data structure.
     * 
     *                                API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianMetadataDescriptionToHost(@NotNull BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    /**
     * [@function] CMSwapHostEndianMetadataDescriptionToBig
     * 
     * Converts a MetadataDescription data structure from host-endian to big-endian in place.
     * 
     * @param metadataDescriptionData MetadataDescription data structure in host-endian byte ordering to be converted to
     *                                big-endian byte ordering.
     * @param metadataDescriptionSize Size of MetadataDescription data structure.
     * 
     *                                API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianMetadataDescriptionToBig(@NotNull BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    /**
     * [@function] CMBufferQueueGetCallbacksForUnsortedSampleBuffers
     * 
     * Returns a pointer to a callback struct for unsorted CMSampleBuffers, provided as a convenience.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForUnsortedSampleBuffers();

    /**
     * [@function] CMBufferQueueGetCallbacksForOutputPTSSortedSampleBuffers
     * 
     * Returns a pointer to a callback struct for CMSampleBuffers sorted by output presentation timestamp, provided as a
     * convenience.
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForSampleBuffersSortedByOutputPTS();

    /**
     * [@function] CMBufferQueueCreate
     * 
     * Creates a CMBufferQueue object.
     * 
     * On return, the caller owns the returned CMBufferQueue, and must release it when done with it.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCreate(@Nullable CFAllocatorRef allocator, @NInt long capacity,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMBufferCallbacks callbacks,
            @NotNull Ptr<CMBufferQueueRef> queueOut);

    /**
     * [@function] CMBufferQueueGetTypeID
     * 
     * Returns the CFTypeID of CMBufferQueue objects.
     * 
     * You can check if a CFTypeRef object is actually a CMBufferQueue by comparing CFGetTypeID(object) with
     * CMBufferQueueGetTypeID().
     * 
     * @return CFTypeID of CMBufferQueue objects.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTypeID();

    /**
     * [@function] CMBufferQueueEnqueue
     * 
     * Enqueues a buffer onto a CMBufferQueue.
     * 
     * The buffer is retained by the queue, so the client can safely release the buffer if it has no further use for it.
     * If the compare callback is non-NULL, this API performs an insertion sort using that compare operation.
     * If the validation callback is non-NULL, this API calls it; if it returns a nonzero OSStatus,
     * the buffer will not be enqueued and this API will return the same error OSStatus.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueEnqueue(@NotNull CMBufferQueueRef queue, @NotNull ConstVoidPtr buf);

    /**
     * [@function] CMBufferQueueDequeueAndRetain
     * 
     * Dequeues a buffer from a CMBufferQueue.
     * 
     * The buffer is released by the queue, but it is also retained for the client. Buffer ownership is thereby
     * transferred from queue to client. The client need not retain the buffer, but is responsible to release
     * it when done with it.
     * 
     * @return The dequeued buffer. Will be NULL if the queue is empty.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueAndRetain(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueDequeueIfDataReadyAndRetain
     * 
     * Dequeues a buffer from a CMBufferQueue if it is ready.
     * 
     * The buffer is released by the queue, but it is also retained for the client. Buffer ownership is thereby
     * transferred from queue to client. The client need not retain the buffer, but is responsible to release
     * it when done with it.
     * 
     * @return The dequeued buffer. Will be NULL if the queue is empty, or if the buffer to be dequeued is not yet
     *         ready.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueIfDataReadyAndRetain(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetHead
     * 
     * Retrieves the next-to-dequeue buffer from a CMBufferQueue but leaves it in the queue.
     * 
     * This follows CF "Get" semantics -- it does not retain the returned buffer.
     * Note that with non-FIFO queues it's not guaranteed that the next dequeue will return
     * this particular buffer (if an intervening Enqueue adds a buffer that will dequeue next).
     * This function is deprecated in favor of CMBufferQueueCopyHead() which returns a
     * retained buffer. When adopting CMBufferQueueCopyHead(), existing CFRetain() call
     * on the buffer returned from this function must be removed.
     * 
     * @return The buffer. Will be NULL if the queue is empty.
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 100000.0
     */
    @Deprecated
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueGetHead(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueIsEmpty
     * 
     * Returns whether or not a CMBufferQueue is empty.
     * 
     * @return Whether or not the CMBufferQueue is empty. If queue is NULL, true is returned.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueIsEmpty(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueMarkEndOfData
     * 
     * Marks a CMBufferQueue with EOD.
     * 
     * All subsequent Enqueues will be rejected until CMBufferQueueReset is called.
     * Subsequent Dequeues will succeed as long as the queue is not empty.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueMarkEndOfData(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueContainsEndOfData
     * 
     * Returns whether or not a CMBufferQueue has been marked with EOD.
     * 
     * @return Whether or not the CMBufferQueue has been marked with EOD.
     *         If queue is NULL, true is returned (a NULL queue is considered to
     *         be empty, and permanently at EOD).
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueContainsEndOfData(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueIsAtEndOfData
     * 
     * Returns whether or not a CMBufferQueue has been marked with EOD, and is now empty.
     * 
     * @return Whether or not the CMBufferQueue has been marked with EOD, and is now empty.
     *         If queue is NULL, true is returned (a NULL queue is considered to
     *         be empty, and permanently at EOD).
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueIsAtEndOfData(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueReset
     * 
     * Resets a CMBufferQueue. Empties the queue, and clears any EOD mark.
     * 
     * All buffers in the queue are released. Triggers are not removed, however,
     * and will be called appropriately as the queue duration goes to zero.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueReset(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueResetWithCallback
     * 
     * Calls a function for every buffer in a queue, then resets the queue.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueResetWithCallback(@NotNull CMBufferQueueRef queue,
            @NotNull @FunctionPtr(name = "call_CMBufferQueueResetWithCallback") Function_CMBufferQueueResetWithCallback callback,
            @Nullable VoidPtr refcon);

    /**
     * [@function] CMBufferQueueGetBufferCount
     * 
     * Gets the number of buffers in the queue.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMBufferQueueGetBufferCount(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetDuration
     * 
     * Gets the duration of a CMBufferQueue.
     * 
     * The duration of the CMBufferQueue is the sum of all the individual
     * buffer durations, as reported by the getDuration callback (provided to
     * CMBufferQueueCreate). If there are no buffers in the queue,
     * kCMTimeZero will be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetDuration(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetMinDecodeTimeStamp
     * 
     * Gets the earliest decode timestamp of a CMBufferQueue.
     * 
     * The search for earliest decode timstamp is performed in this API.
     * If you know your queue is in decode order, GetFirstDecodeTimeStamp
     * is a faster alternative. If the getDecodeTimeStamp callback is
     * NULL, kCMTimeInvalid will be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinDecodeTimeStamp(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetFirstDecodeTimeStamp
     * 
     * Gets the decode timestamp of the first buffer in a CMBufferQueue.
     * 
     * This API is is a faster alternative to GetMinDecodeTimeStamp,
     * but only gives the same answer if your queue is in decode order.
     * If the getDecodeTimeStamp callback is NULL, kCMTimeInvalid will
     * be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstDecodeTimeStamp(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetMinPresentationTimeStamp
     * 
     * Gets the earliest presentation timestamp of a CMBufferQueue.
     * 
     * The search for earliest presentation timstamp is performed in
     * this API. If you know your queue is sorted by presentation time,
     * GetFirstPresentationTimeStamp is a faster alternative. If the
     * getPresentationTimeStamp callback is NULL, kCMTimeInvalid will
     * be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinPresentationTimeStamp(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetFirstPresentationTimeStamp
     * 
     * Gets the presentation timestamp of the first buffer in a CMBufferQueue.
     * 
     * This API is is a faster alternative to GetMinPresentationTimeStamp,
     * but only works if you know your queue is sorted by presentation
     * timestamp. If the getPresentationTimeStamp callback is NULL,
     * kCMTimeInvalid will be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstPresentationTimeStamp(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetMaxPresentationTimeStamp
     * 
     * Gets the greatest presentation timestamp of a CMBufferQueue.
     * 
     * If the getPresentationTimeStamp callback is NULL, kCMTimeInvalid will
     * be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMaxPresentationTimeStamp(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetEndPresentationTimeStamp
     * 
     * Gets the greatest end presentation timestamp of a CMBufferQueue.
     * 
     * This is the maximum end time (PTS + duration) of buffers in the queue.
     * If the getPresentationTimeStamp callback is NULL, kCMTimeInvalid will
     * be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetEndPresentationTimeStamp(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueGetTotalSize
     * 
     * Gets the total size of all sample buffers of a CMBufferQueue.
     * 
     * The total size of the CMBufferQueue is the sum of all the individual
     * buffer sizes, as reported by the getTotalSize callback (provided to
     * CMBufferQueueCreate). If there are no buffers in the queue,
     * 0 will be returned.
     * 
     * API-Since: 7.1
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTotalSize(@NotNull CMBufferQueueRef queue);

    /**
     * [@function] CMBufferQueueInstallTrigger
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * The returned trigger token can be passed to CMBufferQueueTestTrigger and CMBufferQueueRemoveTrigger.
     * The triggerTokenOut parameter can be NULL (client doesn't need to test or remove trigger), and the
     * callback parameter can be NULL (client doesn't need callbacks, but rather will explicitly
     * test the trigger). One of these two parameters must be non-NULL, however, since an untestable
     * trigger that does not perform a callback is meaningless. If the trigger condition is already true,
     * CMBufferQueueInstallTrigger will call the callback. If it does this, it will first write
     * the trigger token to *triggerTokenOut.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTrigger(@NotNull CMBufferQueueRef queue,
            @Nullable @FunctionPtr(name = "call_CMBufferQueueInstallTrigger") Function_CMBufferQueueInstallTrigger callback,
            @Nullable VoidPtr refcon, int condition, @ByValue CMTime time,
            @Nullable Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    /**
     * [@function] CMBufferQueueInstallTriggerWithIntegerThreshold
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * This function behaves the same way as CMBufferQueueInstallTrigger() except the trigger is evaluated against
     * the integer value rather than the time value.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerWithIntegerThreshold(@NotNull CMBufferQueueRef queue,
            @Nullable @FunctionPtr(name = "call_CMBufferQueueInstallTriggerWithIntegerThreshold") Function_CMBufferQueueInstallTriggerWithIntegerThreshold callback,
            @Nullable VoidPtr refcon, int condition, @NInt long threshold,
            @Nullable Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    /**
     * [@function] CMBufferQueueRemoveTrigger
     * 
     * Removes a previously installed trigger from a CMBufferQueue.
     * 
     * Triggers will automatically be removed when a queue is finalized. However, if more
     * than one module has access to a queue, it may be hard for an individual module to know
     * when the queue is finalized since other modules may retain it. To address this concern,
     * modules should remove their triggers before they themselves are finalized.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueRemoveTrigger(@NotNull CMBufferQueueRef queue,
            @NotNull CMBufferQueueTriggerToken triggerToken);

    /**
     * [@function] CMBufferQueueTestTrigger
     * 
     * Tests whether the trigger condition is true.
     * 
     * Whereas the trigger callback will only be called when the condition goes from false
     * to true, CMBufferQueueTestTrigger always returns the condition's current status.
     * The triggerToken must be one that has been installed on this queue.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueTestTrigger(@NotNull CMBufferQueueRef queue,
            @NotNull CMBufferQueueTriggerToken triggerToken);

    /**
     * [@function] CMBufferQueueCallForEachBuffer
     * 
     * Calls a function for every buffer in a queue.
     * 
     * If the callback function returns an error, iteration will stop immediately
     * and the error will be returned.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCallForEachBuffer(@NotNull CMBufferQueueRef queue,
            @NotNull @FunctionPtr(name = "call_CMBufferQueueCallForEachBuffer") Function_CMBufferQueueCallForEachBuffer callback,
            @Nullable VoidPtr refcon);

    /**
     * [@function] CMBufferQueueSetValidationCallback
     * 
     * Sets a function that CMBufferQueueEnqueue will call to validate buffers before adding them to the queue.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueSetValidationCallback(@NotNull CMBufferQueueRef queue,
            @NotNull @FunctionPtr(name = "call_CMBufferQueueSetValidationCallback") Function_CMBufferQueueSetValidationCallback callback,
            @Nullable VoidPtr refcon);

    /**
     * [@function] CMSimpleQueueGetTypeID
     * 
     * Returns the CFTypeID of CMSimpleQueue objects.
     * 
     * You can check if a CFTypeRef object is actually a CMSimpleQueue by comparing CFGetTypeID(object)
     * with CMSimpleQueueGetTypeID().
     * 
     * @return CFTypeID of CMSimpleQueue objects.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSimpleQueueGetTypeID();

    /**
     * [@function] CMSimpleQueueCreate
     * 
     * Creates a CMSimpleQueue.
     * 
     * On return, the caller owns the returned CMSimpleQueue, and must release it when done with it.
     * 
     * @return Returns noErr if the call succeeds. Returns kCMSimpleQueueError_ParameterOutOfRange if
     *         capacity is negative.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueCreate(@Nullable CFAllocatorRef allocator, int capacity,
            @NotNull Ptr<CMSimpleQueueRef> queueOut);

    /**
     * [@function] CMSimpleQueueEnqueue
     * 
     * Enqueues an element on the queue.
     * 
     * If the queue is full, this operation will fail.
     * 
     * @return Returns noErr if the call succeeds, kCMSimpleQueueError_QueueIsFull if the queue is full.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueEnqueue(@NotNull CMSimpleQueueRef queue, @NotNull ConstVoidPtr element);

    /**
     * [@function] CMSimpleQueueDequeue
     * 
     * Dequeues an element from the queue.
     * 
     * If the queue is empty, NULL will be returned.
     * 
     * @return The dequeued element. NULL if the queue was empty, or if there was some other error.
     * 
     *         API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueDequeue(@NotNull CMSimpleQueueRef queue);

    /**
     * [@function] CMSimpleQueueGetHead
     * 
     * Returns the element at the head of the queue.
     * 
     * If the queue is empty, NULL will be returned.
     * 
     * @return The head element. NULL if the queue was empty, or if there was some other error.
     * 
     *         API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueGetHead(@NotNull CMSimpleQueueRef queue);

    /**
     * [@function] CMSimpleQueueReset
     * 
     * Resets the queue.
     * 
     * This function resets the queue to its empty state; all values
     * in the queue prior to reset are lost. Note that CMSimpleQueueReset
     * is not synchronized in any way, so the reader thread and writer thread
     * must be held off by the client during this operation.
     * 
     * @return Returns noErr if the call succeeds.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueReset(@NotNull CMSimpleQueueRef queue);

    /**
     * [@function] CMSimpleQueueGetCapacity
     * 
     * Returns the number of elements that can be held in the queue.
     * 
     * @return The number of elements that can be held in the queue. Returns
     *         0 if there is an error.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCapacity(@NotNull CMSimpleQueueRef queue);

    /**
     * [@function] CMSimpleQueueGetCount
     * 
     * Returns the number of elements currently on the queue.
     * 
     * @return The number of elements currently in the queue. Returns 0 if there is an error.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCount(@NotNull CMSimpleQueueRef queue);

    /**
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMMemoryPoolGetTypeID();

    /**
     * [@function] CMMemoryPoolCreate
     * 
     * Creates a new CMMemoryPool.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CMMemoryPoolRef CMMemoryPoolCreate(@Nullable CFDictionaryRef options);

    /**
     * [@function] CMMemoryPoolGetAllocator
     * 
     * Returns the pool's CFAllocator.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFAllocatorRef CMMemoryPoolGetAllocator(@NotNull CMMemoryPoolRef pool);

    /**
     * [@function] CMMemoryPoolFlush
     * 
     * Deallocates all memory the pool was holding for recycling.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native void CMMemoryPoolFlush(@NotNull CMMemoryPoolRef pool);

    /**
     * [@function] CMMemoryPoolInvalidate
     * 
     * Stops the pool from recycling.
     * 
     * When CMMemoryPoolInvalidate is called the pool's allocator stops recycling memory.
     * The pool deallocates any memory it was holding for recycling.
     * This also happens when the retain count of the CMMemoryPool drops to zero,
     * except that under GC it may be delayed.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native void CMMemoryPoolInvalidate(@NotNull CMMemoryPoolRef pool);

    /**
     * [@function] CMMetadataCreateIdentifierForKeyAndKeySpace
     * 
     * Creates a URL-like string identifier that represents a key/keyspace tuple.
     * 
     * Metadata entities are identified by a key whose interpretation
     * is defined by its keyspace. When writing metadata to a QuickTime
     * Movie, this tuple is part of the track's format description.
     * 
     * The following constants make up the current list of supported keyspaces,
     * which are documented elsewhere in this file:
     * <ul> kCMMetadataKeySpace_QuickTimeUserData
     * <li> kCMMetadataKeySpace_ISOUserData
     * <li> kCMMetadataKeySpace_iTunes
     * <li> kCMMetadataKeySpace_ID3
     * <li> kCMMetadataKeySpace_QuickTimeMetadata
     * <li> kCMMetadataKeySpace_Icy
     * </ul>
     * Some keyspaces use OSTypes (a.k.a. FourCharCodes) to define their
     * keys, and as such their keys are four bytes in length. The keyspaces
     * that fall into this category are: kCMMetadataKeySpace_QuickTimeUserData,
     * kCMMetadataKeySpace_ISOUserData, kCMMetadataKeySpace_iTunes, and
     * kCMMetadataKeySpace_ID3.
     * 
     * The keyspace kCMMetadataKeySpace_QuickTimeMetadata defines its
     * key values to be expressed as reverse-DNS strings, which allows
     * third parties to define their own keys in a well established way
     * that avoids collisions.
     * 
     * As a matter of convenience, known keyspaces allow for a key
     * to be passed in using a variety of CFTypes. Note that what
     * is returned by CMMetadataCreateKeyFromIdentifier depends upon the
     * keyspace, and may be a different CFType than what is passed
     * to this routine (see the discussion below for what CFTypes are
     * returned for known keyspaces). To get a key represented as
     * CFData, call CMMetadataCreateKeyFromIdentifierAsCFData.
     * 
     * For OSType keyspaces, a key may be passed as a CFNumber,
     * a CFString, or a CFData. A key passed as a CFNumber will have
     * its value retrieved as kCFNumberSInt32Type comprising the four
     * bytes of the key’s numeric value in big-endian byte order.
     * A key passed as a CFString must be a valid ASCII string of four
     * characters. A key passed as a CFData must be comprised of the
     * four bytes of the key’s numeric value in big-endian byte order.
     * 
     * All other keyspaces allow the key to be passed as a CFString
     * or CFData. In both cases, the key will be interpreted as an
     * ASCII string for the purposes of identifier encoding.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateIdentifierForKeyAndKeySpace(@Nullable CFAllocatorRef allocator,
            @NotNull ConstVoidPtr key, @NotNull CFStringRef keySpace, @NotNull Ptr<CFStringRef> identifierOut);

    /**
     * [@function] CMMetadataCreateKeyFromIdentifier
     * 
     * Creates a copy of the key encoded in the identifier as a CFType.
     * 
     * The returned CFType is based on the keyspace encoded in the identifier.
     * 
     * For OSType keyspaces, the key will be returned as a CFNumber,
     * where a big endian interpretation of its kCFNumberSInt32Type value
     * represents the four bytes of the key's numeric value.
     * 
     * For the keyspaces kCMMetadataKeySpace_QuickTimeMetadata and
     * kCMMetadataKeySpace_Icy, the key will be returned as a CFString.
     * 
     * All other keyspaces will have the function return the key as a CFData.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifier(@Nullable CFAllocatorRef allocator,
            @NotNull CFStringRef identifier, @NotNull Ptr<ConstVoidPtr> keyOut);

    /**
     * [@function] CMMetadataCreateKeyFromIdentifierAsCFData
     * 
     * Creates a copy of the key value that was encoded in the identifier as CFData.
     * The bytes in the CFData correpsond to how they are serialized in the file.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifierAsCFData(@Nullable CFAllocatorRef allocator,
            @NotNull CFStringRef identifier, @NotNull Ptr<CFDataRef> keyOut);

    /**
     * [@function] CMMetadataCreateKeySpaceFromIdentifier
     * 
     * Creates a copy of the key value that was encoded in the identifier as CFData.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeySpaceFromIdentifier(@Nullable CFAllocatorRef allocator,
            @NotNull CFStringRef identifier, @NotNull Ptr<CFStringRef> keySpaceOut);

    /**
     * [@function] CMMetadataDataTypeRegistryRegisterDataType
     * 
     * Register a data type with the data type registry.
     * 
     * This routine is called by clients to register a data type with
     * the data type registry. The list of conforming data type identifiers
     * must include a base data type. If the data type has already
     * been registered, then it is not considered an error to re-register it
     * as long as the list of conforming data type identifiers has the same
     * entries as the original; otherwise an error will be returned.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CMMetadataDataTypeRegistryRegisterDataType(@NotNull CFStringRef dataType,
            @NotNull CFStringRef description, @NotNull CFArrayRef conformingDataTypes);

    /**
     * [@function] CMMetadataDataTypeRegistryDataTypeIsRegistered
     * 
     * Tests a data type identifier to see if it has been registered.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsRegistered(@NotNull CFStringRef dataType);

    /**
     * [@function] CMMetadataDataTypeRegistryGetDataTypeDescription
     * 
     * Returns the data type's description (if any was provided when it was registered).
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetDataTypeDescription(@NotNull CFStringRef dataType);

    /**
     * [@function] CMMetadataDataTypeRegistryGetConformingDataTypes
     * 
     * Returns the data type's conforming data types (if any were
     * provided when it was registered).
     * [@returns] List of conforming data types registered for the given data type.
     * NULL is returned if the data type has not been registered.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetConformingDataTypes(@NotNull CFStringRef dataType);

    /**
     * [@function] CMMetadataDataTypeRegistryDataTypeConformsToDataType
     * 
     * Checks to see if a data type conforms to another data type.
     * 
     * A given data type will conform to a second data type if any of
     * the following are true:
     * <ul> 1. The data type identifiers are the same.
     * <li> 2. The first data type identifier's conformance list contains the second data type identifier.
     * <li> 3. A recursive search of the conforming data types for each element in the first
     * <li> data type's conformance list yields the second data type identifer.
     * </ul>
     * [@returns] True if the first data type conforms to the second data type.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeConformsToDataType(@NotNull CFStringRef dataType,
            @NotNull CFStringRef conformsToDataType);

    /**
     * [@function] CMMetadataDataTypeRegistryGetBaseDataTypes
     * 
     * Returns an array of base data type identifiers.
     * 
     * There are a set of base data types that seed the data type
     * registry. All valid data types will have their conformance search
     * end with a base data type.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetBaseDataTypes();

    /**
     * [@function] CMMetadataDataTypeRegistryDataTypeIsBaseDataType
     * 
     * Tests a data type identifier to see if it represents a base data type.
     * 
     * This is simply a convenience method to test to see if a given
     * data type identifier is in the array returned by
     * CMMetadataDataTypeRegistryGetBaseDataTypes.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsBaseDataType(@NotNull CFStringRef dataType);

    /**
     * [@function] CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType
     * 
     * Returns the base data type identifier that the given data type
     * conforms to.
     * 
     * There are a set of base data types that seed the data type
     * registry. All valid data types will have their conformance search
     * end with a base data type.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType(
            @NotNull CFStringRef dataType);

    /**
     * [@function] CMAudioClockCreate
     * 
     * Creates a clock that advances at the same rate as audio output.
     * 
     * This clock will not drift from audio output, but may drift from CMClockGetHostTimeClock().
     * When audio output is completely stopped, the clock continues to advance, tracking CMClockGetHostTimeClock()
     * until audio output starts up again.
     * This clock is suitable for use as AVPlayer.sourceClock when synchronizing video-only playback
     * with audio played through other APIs or objects.
     * 
     * @param allocator
     *                  A CFAllocator to use to allocate the clock.
     *                  Pass kCFAllocatorDefault or NULL to use the default allocator.
     * @param clockOut
     *                  Points to a CMClockRef to receive the newly created clock.
     *                  The caller is responsible for calling CFRelease to release this clock.
     * 
     *                  API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int CMAudioClockCreate(@Nullable CFAllocatorRef allocator, @NotNull Ptr<CMClockRef> clockOut);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeInvalid();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeIndefinite();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimePositiveInfinity();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeNegativeInfinity();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeZero();

    /**
     * [@constant] kCMTimeValueKey
     * 
     * CFDictionary key for value field of CMTime (CFNumber containing int64_t)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeValueKey();

    /**
     * [@constant] kCMTimeScaleKey
     * 
     * CFDictionary key for timescale field of CMTime (CFNumber containing int32_t)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeScaleKey();

    /**
     * [@constant] kCMTimeEpochKey
     * 
     * CFDictionary key for epoch field of CMTime (CFNumber containing int64_t)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeEpochKey();

    /**
     * [@constant] kCMTimeFlagsKey
     * 
     * CFDictionary key for flags field of CMTime (CFNumber containing uint32_t)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeFlagsKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTimeRange kCMTimeRangeZero();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTimeRange kCMTimeRangeInvalid();

    /**
     * [@constant] kCMTimeRangeStartKey
     * 
     * CFDictionary key for start field of a CMTimeRange (CMTime)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeRangeStartKey();

    /**
     * [@constant] kCMTimeRangeDurationKey
     * 
     * CFDictionary key for timescale field of a CMTimeRange (CMTime)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeRangeDurationKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTimeMapping kCMTimeMappingInvalid();

    /**
     * [@constant] kCMTimeMappingSourceKey
     * 
     * CFDictionary key for source field of a CMTimeMapping (CMTimeRange)
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeMappingSourceKey();

    /**
     * [@constant] kCMTimeMappingTargetKey
     * 
     * CFDictionary key for target field of a CMTimeMapping (CMTimeRange)
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeMappingTargetKey();

    /**
     * CFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_OriginalCompressionSettings();

    /**
     * CFDictionary of CFString (four-char-code, atom type) -> ( CFData (atom payload) or CFArray of CFData (atom
     * payload) )
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_SampleDescriptionExtensionAtoms();

    /**
     * CFData
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimSampleDescription();

    /**
     * CFData
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimISOSampleEntry();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FormatName();

    /**
     * CFNumber with depth value as directed by http://developer.apple.com/qa/qa2001/qa1183.html
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Depth();

    /**
     * Many of the following extension keys and values are the same as the corresponding CVImageBuffer attachment keys
     * and values
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_CleanAperture();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureWidth();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHeight();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHorizontalOffset();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureVerticalOffset();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureWidthRational();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHeightRational();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHorizontalOffsetRational();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureVerticalOffsetRational();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FieldCount();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FieldDetail();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_TemporalTopFirst();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_TemporalBottomFirst();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_SpatialFirstLineEarly();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_SpatialFirstLineLate();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_PixelAspectRatio();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_PixelAspectRatioHorizontalSpacing();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_PixelAspectRatioVerticalSpacing();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ColorPrimaries();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_ITU_R_709_2();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_EBU_3213();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_SMPTE_C();

    /**
     * same as kCVImageBufferColorPrimaries_DCI_P3
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_DCI_P3();

    /**
     * same as kCVImageBufferColorPrimaries_P3_D65
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_P3_D65();

    /**
     * same as kCVImageBufferColorPrimaries_ITU_R_2020
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_ITU_R_2020();

    /**
     * same as kCVImageBufferColorPrimaries_P22
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_P22();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_TransferFunction();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_709_2();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_SMPTE_240M_1995();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_UseGamma();

    /**
     * same as kCVImageBufferTransferFunction_ITU_R_2020. note: semantically equivalent to
     * kCMFormatDescriptionTransferFunction_ITU_R_709_2, which is preferred.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_2020();

    /**
     * same as kCVImageBufferTransferFunction_SMPTE_ST_428_1
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_SMPTE_ST_428_1();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_GammaLevel();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_YCbCrMatrix();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_709_2();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_601_4();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_SMPTE_240M_1995();

    /**
     * same as kCVImageBufferYCbCrMatrix_ITU_R_2020
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_2020();

    /**
     * CFBoolean; by default, false for YCbCr-based compressed formats, indicating that pixel values are video-range
     * rather than full-range
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FullRangeVideo();

    /**
     * CFData
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ICCProfile();

    /**
     * CFNumber describing the bytes per row of raster pixel data (not used for compressed, planar, tiled or downsampled
     * formats)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_BytesPerRow();

    /**
     * Chroma siting information. For progressive images, only the TopField value is used.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ChromaLocationTopField();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ChromaLocationBottomField();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Left();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Center();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_TopLeft();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Top();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_BottomLeft();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Bottom();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_DV420();

    /**
     * CFNumber specifying a kCMMPEG2VideoProfile_*
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionConformsToMPEG2VideoProfile();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_TemporalQuality();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_SpatialQuality();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimImageDescription();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Version();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_RevisionLevel();

    /**
     * CFString of fourCC
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Vendor();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionVendor_Apple();

    /**
     * CFNumber (SInt32 holding CMTextDisplayFlags)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DisplayFlags();

    /**
     * CFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_BackgroundColor();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Red();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Green();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Blue();

    /**
     * CFNumber (SInt8 for 3G), not applicable for QT text.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Alpha();

    /**
     * CFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultTextBox();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Top();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Left();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Bottom();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Right();

    /**
     * CFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultStyle();

    /**
     * CFNumber (SInt16 for 3G), (SInt32 for QT)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_StartChar();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Font();

    /**
     * CFNumber (SInt8)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_FontFace();

    /**
     * CFDictionary (kCMTextFormatDescriptionColor_Red, kCMTextFormatDescriptionColor_Green, etc)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_ForegroundColor();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_FontSize();

    /**
     * CFNumber (SInt8 holding a CMTextJustificationValue)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_HorizontalJustification();

    /**
     * CFNumber (SInt8 holding a CMTextJustificationValue)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_VerticalJustification();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_EndChar();

    /**
     * CFDictionary (Keys are FontIDs as CFStrings, vals are font names as CFStrings)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_FontTable();

    /**
     * CFNumber (SInt32 holding a CMTextJustificationValue)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_TextJustification();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Height();

    /**
     * CFNumber (SInt16)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Ascent();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultFontName();

    /**
     * CFDictionary containing the following two keys
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionExtension_SourceReferenceName();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionKey_Value();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionKey_LangCode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtensionKey_MetadataKeyTable();

    /**
     * CFNumber(OSType) native endian
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_Namespace();

    /**
     * CFData
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_Value();

    /**
     * CFNumber(OSType) native endian
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_LocalID();

    /**
     * CFData
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_DataType();

    /**
     * CFNumber(SInt32) native endian
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_DataTypeNamespace();

    /**
     * CFArray(CFDictionary) of DataType and DataTypeNamespace
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_ConformingDataTypes();

    /**
     * CFString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_LanguageTag();

    /**
     * CFDictionary
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_StructuralDependency();

    /**
     * CFData
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_SetupData();

    /**
     * CFBoolean
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescription_StructuralDependencyKey_DependencyIsInvalidFlag();

    /**
     * CFString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_Identifier();

    /**
     * CFString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_DataType();

    /**
     * CFString in BCP 47 format
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_ExtendedLanguageTag();

    /**
     * CFDictionary
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_StructuralDependency();

    /**
     * CFData
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_SetupData();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMSampleTimingInfo kCMTimingInfoInvalid();

    /**
     * [@constant] kCMSampleBufferNotification_DataBecameReady
     * 
     * Posted on a CMSampleBuffer by CMSampleBufferSetDataReady when the buffer becomes ready.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotification_DataBecameReady();

    /**
     * [@constant] kCMSampleBufferNotification_DataFailed
     * 
     * Posted on a CMSampleBuffer by CMSampleBufferSetDataFailed to report that the buffer will never become ready.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotification_DataFailed();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotificationParameter_OSStatus();

    /**
     * payload: CFDictionary containing:
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_InhibitOutputUntil();

    /**
     * payload: CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_ResumeTag();

    /**
     * [@constant] kCMSampleBufferConduitNotification_ResetOutput
     * 
     * Posted on a conduit of CMSampleBuffers (eg, a CMBufferQueue) to request invalidation of pending output data.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_ResetOutput();

    /**
     * payload: CFDictionary containing:
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_UpcomingOutputPTSRangeChanged();

    /**
     * payload: CFBoolean
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_UpcomingOutputPTSRangeMayOverlapQueuedOutputPTSRange();

    /**
     * payload: CFDictionary(CMTime)
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_MinUpcomingOutputPTS();

    /**
     * payload: CFDictionary(CMTime)
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_MaxUpcomingOutputPTS();

    /**
     * payload: CFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConsumerNotification_BufferConsumed();

    /**
     * CFBoolean (absence of this key implies Sync)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_NotSync();

    /**
     * CFBoolean (absence of this key implies not Partial Sync. If NotSync is false, PartialSync should be ignored.)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_PartialSync();

    /**
     * kCFBooleanTrue, kCFBooleanFalse, or absent if unknown
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HasRedundantCoding();

    /**
     * kCFBooleanTrue, kCFBooleanFalse, or absent if unknown
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_IsDependedOnByOthers();

    /**
     * kCFBooleanTrue (e.g., non-I-frame), kCFBooleanFalse (e.g. I-frame), or absent if unknown
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DependsOnOthers();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_EarlierDisplayTimesAllowed();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DisplayImmediately();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DoNotDisplay();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ResetDecoderBeforeDecoding();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DrainAfterDecoding();

    /**
     * CFDictionary (client-defined)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_PostNotificationWhenConsumed();

    /**
     * CFNumber (ResumeTag)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ResumeOutput();

    /**
     * [@constant] kCMSampleBufferAttachmentKey_TransitionID
     * 
     * Marks a transition from one source of buffers (eg. song) to another
     * 
     * For example, during gapless playback of a list of songs, this attachment marks the first buffer from the next
     * song.
     * If this attachment is on a buffer containing no samples, the first following buffer that contains samples is the
     * buffer that contains the first samples from the next song. The value of this attachment is a CFTypeRef. This
     * transition identifier should be unique within a playlist, so each transition in a playlist is uniquely
     * identifiable. A CFNumberRef counter that increments with each transition is a simple example.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TransitionID();

    /**
     * CFDictionary/CMTime, default 0
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TrimDurationAtStart();

    /**
     * CFDictionary/CMTime, default 0
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TrimDurationAtEnd();

    /**
     * CFNumber, positive, default 1
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SpeedMultiplier();

    /**
     * CFBoolean, default false
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_Reverse();

    /**
     * CFBoolean, default false
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_FillDiscontinuitiesWithSilence();

    /**
     * CFBoolean, default false
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_EmptyMedia();

    /**
     * CFBoolean, default false
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_PermanentEmptyMedia();

    /**
     * [@constant] kCMSampleBufferAttachmentKey_DisplayEmptyMediaImmediately
     * 
     * Tells that the empty marker should be dequeued immediately regardless of its timestamp.
     * 
     * Marker sample buffers with this attachment in addition to kCMSampleBufferAttachmentKey_EmptyMedia
     * are used to tell that the empty sample buffer should be dequeued immediately regardless of its timestamp.
     * This attachment should only be used with sample buffers with the kCMSampleBufferAttachmentKey_EmptyMedia
     * attachment.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DisplayEmptyMediaImmediately();

    /**
     * CFBoolean, default false
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_EndsPreviousSampleDuration();

    /**
     * CFURL
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SampleReferenceURL();

    /**
     * CFNumber, byte offset from beginning of URL to contiguous data
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SampleReferenceByteOffset();

    /**
     * CFNumber, audio decoder refresh count
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_GradualDecoderRefresh();

    /**
     * CFString, frame drop reason
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DroppedFrameReason();

    /**
     * [@constant] kCMSampleBufferDroppedFrameReason_FrameWasLate
     * 
     * The frame was dropped because it was late
     * 
     * The value of kCMSampleBufferAttachmentKey_DroppedFrameReason if a video capture client has indicated
     * that late video frames should be dropped and the current frame is late. This condition is typically
     * caused by the client's processing taking too long.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_FrameWasLate();

    /**
     * [@constant] kCMSampleBufferDroppedFrameReason_OutOfBuffers
     * 
     * The frame was dropped because the module providing frames is out of buffers
     * 
     * The value of kCMSampleBufferAttachmentKey_DroppedFrameReason if the module providing sample buffers
     * has run out of source buffers. This condition is typically caused by the client holding onto
     * buffers for too long and can be alleviated by returning buffers to the provider.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_OutOfBuffers();

    /**
     * [@constant] kCMSampleBufferDroppedFrameReason_Discontinuity
     * 
     * An unknown number of frames were dropped
     * 
     * The value of kCMSampleBufferAttachmentKey_DroppedFrameReason if the module providing sample buffers
     * has experienced a discontinuity, and an unknown number of frames have been lost. This condition is
     * typically caused by the system being too busy.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_Discontinuity();

    /**
     * [@constant] kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo
     * 
     * Indicates additional information regarding the dropped video frame.
     * 
     * Sample buffers with this attachment contain no image or data buffer. They mark a dropped video
     * frame. If present, this attachment provides additional information about the
     * kCMSampleBufferAttachmentKey_DroppedFrameReason.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo();

    /**
     * [@constant] kCMSampleBufferDroppedFrameReasonInfo_CameraModeSwitch
     * 
     * A discontinuity was caused by a camera mode switch.
     * 
     * The value of kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo if the module providing sample buffers
     * has experienced a discontinuity due to a camera mode switch. Short discontinuities of this type can occur when
     * the
     * session is configured for still image capture on some devices.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReasonInfo_CameraModeSwitch();

    /**
     * CFString, one of kCMSampleBufferLensStabilizationInfo_*
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_StillImageLensStabilizationInfo();

    /**
     * CFString
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Active();

    /**
     * CFString
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_OutOfRange();

    /**
     * CFString
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Unavailable();

    /**
     * CFString
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Off();

    /**
     * [@constant] kCMSampleBufferAttachmentKey_ForceKeyFrame
     * 
     * Indicates that the current or next video sample buffer should be forced to be encoded as a key frame.
     * 
     * A value of kCFBooleanTrue for kCMSampleBufferAttachmentKey_ForceKeyFrame indicates that the current or next video
     * sample buffer processed in the stream should be forced to be encoded as a key frame.
     * If this attachment is present and kCFBooleanTrue on a sample buffer with a video frame, that video frame will be
     * forced to become a key frame. If the sample buffer for which this is present and kCFBooleanTrue does not have a
     * valid video frame, the next sample buffer processed that contains a valid video frame will be encoded as a key
     * frame.
     * 
     * Usual care should be taken when setting attachments on sample buffers whose orgins and destinations are
     * ambiguous. For example, CMSetAttachment() is not thread-safe, and CMSampleBuffers may be used in multiple sample
     * buffer streams in a given system. This can lead to crashes during concurrent access and/or unexpected behavior on
     * alternate sample buffer streams. Therefore, unless the orgin and destination of a sample buffer is known, the
     * general recommended practice is to synthesize an empty sample buffer with this attachment alone and insert it
     * into the sample buffer stream ahead of the concrete sample buffer rather than setting this attachment on the
     * concrete sample buffer itself.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ForceKeyFrame();

    /**
     * Posted by a timebase after a change in effective rate.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotification_EffectiveRateChanged();

    /**
     * Posted by a timebase after a discontinuous time jump.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotification_TimeJumped();

    /**
     * Payload key for the time at which a change in effective rate or a discontinuous time jump occurred.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotificationKey_EventTime();

    /**
     * equivalent to NULL
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_QuickTimeMovie();

    /**
     * MP4, etc
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_ISOFamily();

    /**
     * 3GPP (implies ISO)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_3GPFamily();

    /**
     * equivalent to NULL
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_QuickTimeMovie();

    /**
     * [@constant] kCMSoundDescriptionFlavor_QuickTimeMovieV2
     * 
     * Chooses the QuickTime Movie Sound Description V2 format.
     * 
     * A V2 sound description will be written.
     * V2 Sound Descriptions contain no legacy CBR layout, and use 'lpcm' for all flavors of PCM.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_QuickTimeMovieV2();

    /**
     * MP4, etc
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_ISOFamily();

    /**
     * 3GPP (implies ISO)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_3GPFamily();

    /**
     * CFNumber (seconds)
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMemoryPoolOption_AgeOutPeriod();

    /**
     * [@const] kCMTextMarkupAttribute_ForegroundColorARGB
     * 
     * The foreground color for text.
     * 
     * Value must be a CFArray of 4 CFNumbers representing alpha, red, green, and blue fields with values between 0.0
     * and 1.0. The
     * red, green and blue components are interpreted in the sRGB color space. The alpha indicates the opacity from 0.0
     * for transparent to
     * 1.0 for 100% opaque.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_ForegroundColorARGB();

    /**
     * [@const] kCMTextMarkupAttribute_BackgroundColorARGB
     * 
     * The background color for the shape holding the text.
     * 
     * Value must be a CFArray of 4 CFNumbers representing alpha, red, green, and blue fields with values between 0.0
     * and 1.0. The
     * red, green and blue components are interpreted in the sRGB color space. The alpha indicates the opacity from 0.0
     * for transparent to
     * 1.0 for 100% opaque.
     * 
     * The color applies to the geometry (e.g., a box) containing the text. The container's background color may have an
     * alpha of 0 so it is not displayed even though the text is displayed. The color behind individual characters
     * is optionally controllable with the kCMTextMarkupAttribute_CharacterBackgroundColorARGB attribute.
     * 
     * If used, this attribute must be applied to the entire attributed string (i.e.,
     * CFRangeMake(0, CFAttributedStringGetLength(...))).
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BackgroundColorARGB();

    /**
     * [@const] kCMTextMarkupAttribute_CharacterBackgroundColorARGB
     * 
     * The background color behind individual text characters.
     * 
     * Value must be a CFArray of 4 CFNumbers representing alpha, red, green, and blue fields with values between 0.0
     * and 1.0. The
     * red, green and blue components are interpreted in the sRGB color space. The alpha indicates the opacity from 0.0
     * for transparent to
     * 1.0 for 100% opaque.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_CharacterBackgroundColorARGB();

    /**
     * [@const] kCMTextMarkupAttribute_BoldStyle
     * 
     * Allows the setting of a bold style to be applied.
     * 
     * Value must be a CFBoolean. The default is kCFBooleanFalse.
     * If this attribute is kCFBooleanTrue, the text will be drawn
     * with a bold style. Other styles such as italic may or may
     * not be used as well.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BoldStyle();

    /**
     * [@const] kCMTextMarkupAttribute_ItalicStyle
     * 
     * Allows the setting of an italic style to be applied.
     * 
     * Value must be a CFBoolean. The default is kCFBooleanFalse.
     * If this attribute is kCFBooleanTrue, the text will be rendered
     * with an italic style. Other styles such as bold may or may not
     * be used as well.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_ItalicStyle();

    /**
     * [@const] kCMTextMarkupAttribute_UnderlineStyle
     * 
     * Allows the setting of an underline to be applied at render
     * time.
     * 
     * Value must be a CFBoolean. The default is kCFBooleanFalse.
     * If this attribute is kCFBooleanTrue, the text will be rendered
     * with an underline. Other styles such as bold may or may not
     * be used as well.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_UnderlineStyle();

    /**
     * [@const] kCMTextMarkupAttribute_FontFamilyName
     * 
     * The name of the font.
     * 
     * Value must be a CFString holding the family name of an installed font
     * (e.g., "Helvetica") that is used to render and/or measure text.
     * 
     * When vended by legible output, an attributed string will have at most one of
     * kCMTextMarkupAttribute_FontFamilyName or
     * kCMTextMarkupAttribute_GenericFontFamilyName associated with each character.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_FontFamilyName();

    /**
     * [@const] kCMTextMarkupAttribute_GenericFontFamilyName
     * 
     * The attribute holding a generic font family identifier.
     * 
     * Value must be a CFString holding a generic font family name that is one of the kCMTextMarkupGenericFontName_*
     * constants.
     * Generic fonts must be mapped to the family name of an installed font (e.g.,
     * kCMTextMarkupGenericFontName_SansSerif -> "Helvetica")
     * before rendering and/or measuring text.
     * 
     * When vended by legible output, an attributed string will have at most one of
     * kCMTextMarkupAttribute_FontFamilyName or
     * kCMTextMarkupAttribute_GenericFontFamilyName associated with each character.
     * 
     * Overview of Generic Font Family Names
     * =====================================
     * Some media formats allow the specification of font family names to be used to style text they carry. Sometimes,
     * an
     * external specification (e.g., CSS) may be used to style the text carried by the media format. In either case, the
     * specification may be concrete, indicating an installed platform font (e.g., "Times New Roman", Helvetica). It may
     * be
     * abstract, indicating a category of font to use (e.g., serif, sans-serif). This abstract designation is often
     * termed
     * a "generic font family".
     * 
     * CSS for example allows a 'font-family' property specification such as this:
     * 
     * font-family: Helvetica, sans-serif;
     * 
     * This uses both the concrete family name "Helvetica" and the generic family name "sans-serif".
     * 
     * Generic font families may be common across media formats (e.g., both CSS and 3GPP timed text allow "sans-serif"
     * and "serif").
     * Other formats may have generic font identifiers that do not align exactly (e.g., TTML allows "monospaceSerif and
     * "monospaceSansSerif" in
     * addition to "monospace"). Some formats might not carry names but have numeric values mapping to a generic font
     * identifier.
     * Simply put, different formats use different ways to express their generic fonts.
     * 
     * The use of generic font families is also important for media accessibility. The Media Accessibility framework can
     * map eight categories
     * of abstract fonts to an installed font. Users may choose to override each of these categories to a different
     * installed font. This
     * remapping should work if the content or external styling indicates a generic font. It should not however try to
     * remap a concrete font like "Helvetica".
     * Consequently, it is important to distinguish between the generic and concrete fonts expressed by the author.
     * 
     * To accommodate what is expressible in media formats and to support media accessibility overrides, generic font
     * families can be
     * specified with the kCMTextMarkupAttribute_GenericFontFamilyName attribute which carries the identifier for one of
     * the various
     * generic font specification forms supported across media formats. These generic font identifiers are the
     * kCMTextMarkupGenericFontName_*
     * prefixed constants also defined here. New identifers may be added in the future.
     * 
     * Concrete fonts are specified using the kCMTextMarkupAttribute_FontFamilyName attribute also defined in this
     * header.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_GenericFontFamilyName();

    /**
     * Values for kCMTextMarkupAttribute_GenericFontFamilyName.
     * 
     * [@const] kCMTextMarkupGenericFontName_Default
     * The generic font name indicating the default font. The default font may also be chosen if no font family is
     * specified (i.e., no kCMTextMarkupAttribute_FontFamilyName or kCMTextMarkupAttribute_GenericFontFamilyName is
     * specified).
     * 
     * [@const] kCMTextMarkupGenericFontName_Serif
     * The generic font name indicating a font with serifs. The font may be proportional or monospaced. E.g., Times New
     * Roman
     * 
     * [@const] kCMTextMarkupGenericFontName_SansSerif
     * The generic font name indicating a font without serifs. The font may be proportional or monospaced. E.g.,
     * Helvetica
     * 
     * [@const] kCMTextMarkupGenericFontName_Monospace
     * The generic font name indicating a monospaced font, with or without serifs. E.g., Courier
     * 
     * [@const] kCMTextMarkupGenericFontName_ProportionalSerif
     * The generic font name indicating a proportional font with serifs.
     * 
     * [@const] kCMTextMarkupGenericFontName_ProportionalSansSerif
     * The generic font name indicating a proportional font without serifs.
     * 
     * [@const] kCMTextMarkupGenericFontName_MonospaceSerif
     * The generic font name indicating a monospaced font with serifs.
     * 
     * [@const] kCMTextMarkupGenericFontName_MonospaceSansSerif
     * The generic font name indicating a monospaced font without serifs.
     * 
     * [@const] kCMTextMarkupGenericFontName_Casual
     * The generic font name indicating a "casual" font. E.g., Dom or Impress
     * 
     * [@const] kCMTextMarkupGenericFontName_Cursive
     * The generic font name indicating a cursive font. E.g., Coronet or Marigold
     * 
     * [@const] kCMTextMarkupGenericFontName_Fantasy
     * The generic font name indicating a "fantasy" font.
     * 
     * [@const] kCMTextMarkupGenericFontName_SmallCapital
     * The generic font name indicating a font with lowercase letters set as small capitals. E.g., Engravers Gothic
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Default();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Serif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_SansSerif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Monospace();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_ProportionalSerif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_ProportionalSansSerif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_MonospaceSerif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_MonospaceSansSerif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Casual();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Cursive();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Fantasy();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_SmallCapital();

    /**
     * [@const] kCMTextMarkupAttribute_BaseFontSizePercentageRelativeToVideoHeight
     * 
     * The base font size expressed as a percentage of the video height.
     * 
     * Value must be a non-negative CFNumber. This is a number holding a percentage of the height of the video frame.
     * For example, a value of 5 indicates that the base font size should be 5% of the height of the video.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BaseFontSizePercentageRelativeToVideoHeight();

    /**
     * [@const] kCMTextMarkupAttribute_RelativeFontSize
     * 
     * The font size expressed as a percentage of the current default font size.
     * 
     * Value must be a non-negative CFNumber. This is a number holding a percentage
     * of the size of the calculated default font size. A value
     * of 120 indicates 20% larger than the default font size. A value of 80
     * indicates 80% of the default font size. The value 100 indicates no size
     * difference and is the default.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_RelativeFontSize();

    /**
     * [@const] kCMTextMarkupAttribute_VerticalLayout
     * 
     * The kind of vertical layout of the text block.
     * 
     * Value must be a CFString.
     * A CFString holding one of several values indicating the progression direction for new vertical
     * lines of text. If this attribute is present, it indicates the writing direction is vertical. The
     * attribute value indicates whether new vertical text lines are added from left to right or from
     * right to left. If this attribute is missing, the writing direction is horizontal.
     * 
     * If used, this attribute must be applied to the entire attributed string (i.e.,
     * CFRangeMake(0, CFAttributedStringGetLength(...))).
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_VerticalLayout();

    /**
     * Values for kCMTextMarkupAttribute_VerticalLayout.
     * 
     * [@const] kCMTextVerticalLayout_LeftToRight
     * Newly added vertical lines are added from the left toward the right.
     * 
     * [@const] kCMTextVerticalLayout_RightToLeft
     * Newly added vertical lines are added from the right toward the left.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextVerticalLayout_LeftToRight();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextVerticalLayout_RightToLeft();

    /**
     * [@const] kCMTextMarkupAttribute_Alignment
     * 
     * The alignment of text in the writing direction of the first line of text.
     * 
     * Value must be a CFString.
     * A CFString holding one of several values indicating the alignment
     * in the writing direction of the first line of text of the cue.
     * The writing direction is indicated by the value (or absence) of
     * the kCMTextMarkupAttribute_VerticalLayout.
     * 
     * If this attribute is missing, the kCMTextMarkupAlignmentType_Middle value should
     * be used as the default.
     * 
     * If used, this attribute must be applied to the entire attributed string (i.e.,
     * CFRangeMake(0, CFAttributedStringGetLength(...))).
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_Alignment();

    /**
     * Values for kCMTextMarkupAttribute_Alignment.
     * 
     * [@const] kCMTextMarkupAlignmentType_Start
     * The text is visually aligned at its starting side. For horizontally written text, the alignment is left for
     * left-to-right text and right for right-to-left text. For vertical text, alignment is always at the top.
     * 
     * [@const] kCMTextMarkupAlignmentType_Middle
     * The text is visually center-aligned (i.e., aligned between its starting and ending sides).
     * 
     * [@const] kCMTextMarkupAlignmentType_End
     * The text is visually aligned at its ending side. For horizontally written text, the alignment is right for
     * left-to-right text and left for right-to-left text. For vertical text, alignment is always at the bottom.
     * 
     * [@const] kCMTextMarkupAlignmentType_Left
     * For horizontally written text, the text alignment is always visually left-aligned (i.e., left-to-right and
     * right-to-left
     * are treated uniformly). For vertical text, this is equivalent to kCMTextMarkupAlignmentType_Start. While readers
     * should be prepared to account for kCMTextMarkupAlignmentType_Left being equivalent to
     * kCMTextMarkupAlignmentType_Start for vertical text, authors are discouraged from using
     * kCMTextMarkupAlignmentType_Left
     * for vertical text.
     * 
     * [@const] kCMTextMarkupAlignmentType_Right
     * For horizontally written text, the text alignment is always visually right-aligned (i.e., left-to-right and
     * right-to-left
     * are treated uniformly). For vertical text, this is equivalent to kCMTextMarkupAlignmentType_End. While readers
     * should be prepared to account for kCMTextMarkupAlignmentType_Right being equivalent to
     * kCMTextMarkupAlignmentType_End for vertical text, authors are discouraged from using
     * kCMTextMarkupAlignmentType_Right
     * for vertical text.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Start();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Middle();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_End();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Left();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Right();

    /**
     * [@const] kCMTextMarkupAttribute_TextPositionPercentageRelativeToWritingDirection
     * 
     * The placement of the block of text specified as a percentage in the writing direction.
     * 
     * Value must be a non-negative CFNumber.
     * A CFNumber expressing the position of the
     * center of the text in the writing direction as a percentage of the video dimensions in
     * the writing direction. For horizontal cues, this is the horizontal position.
     * For vertical, it is the vertical position. The percentage is calculated
     * from the edge of the frame where the text begins (so for left-to-right
     * English, it is the left edge).
     * 
     * If used, this attribute must be applied to the entire attributed string (i.e.,
     * CFRangeMake(0, CFAttributedStringGetLength(...))).
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_TextPositionPercentageRelativeToWritingDirection();

    /**
     * [@const] kCMTextMarkupAttribute_OrthogonalLinePositionPercentageRelativeToWritingDirection
     * 
     * The placement of the block of text's first line specified as a percentage in the
     * direction orthogonal to the writing direction.
     * 
     * Value must be a non-negative CFNumber.
     * A CFNumber expressing the position of the center of the
     * cue relative to the writing direction. The line
     * position is orthogonal (or perpendicular) to the writing direction (i.e.,
     * for a horizontal writing direction, it is vertical and for a vertical writing
     * direction, is is horizontal). This attribute expresses the line position as
     * a percentage of the dimensions of the video frame in the relevant direction.
     * For example, 0% is the top of the video frame and 100% is the bottom of the
     * video frame for horizontal writing layout.
     * 
     * If used, this attribute must be applied to the entire attributed string (i.e.,
     * CFRangeMake(0, CFAttributedStringGetLength(...))).
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_OrthogonalLinePositionPercentageRelativeToWritingDirection();

    /**
     * [@const] kCMTextMarkupAttribute_WritingDirectionSizePercentage
     * 
     * The dimension (e.g., width) of the bounding box containing the text expressed as a percentage.
     * 
     * Value must be a non-negative CFNumber.
     * A CFNumber expressing the width of the
     * bounding box for text layout as a percentage of the video frame's dimension
     * in the writing direction.
     * For a horizontal writing direction, it is the width. For a vertical writing
     * direction, it is the horizontal writing direction.
     * 
     * If used, this attribute must be applied to the entire attributed string (i.e.,
     * CFRangeMake(0, CFAttributedStringGetLength(...))).
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_WritingDirectionSizePercentage();

    /**
     * [@const] kCMTextMarkupAttribute_CharacterEdgeStyle
     * 
     * Allows the setting of the style of character edges at render time.
     * 
     * Value must be a CFString. This controls the shape of the edges of
     * drawn characters. Set a value of something other than kCMTextMarkupEdgeStyle_None
     * to draw using an alternative shape for edges of characters from the set of constants
     * prefixed with "kCMTextMarkupEdgeStyle_". These correspond to text edge styles available
     * with Media Accessibility preferences (see <MediaAccessibility/MACaptionAppearance.h>)
     * although the values are not enumerated integers here.
     * 
     * The absence of this attribute should be treated as though kCMTextMarkupCharacterEdgeStyle_None
     * is specified.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_CharacterEdgeStyle();

    /**
     * Values for kCMTextMarkupAttribute_CharacterEdgeStyle.
     * 
     * [@const] kCMTextMarkupCharacterEdgeStyle_None
     * The character edge style indicating no edge style.
     * 
     * [@const] kCMTextMarkupCharacterEdgeStyle_Raised
     * The character edge style indicating a raised edge style should be drawn.
     * 
     * [@const] kCMTextMarkupCharacterEdgeStyle_Depressed
     * The character edge style indicating a depressed edge style should be drawn.
     * 
     * [@const] kCMTextMarkupCharacterEdgeStyle_Uniform
     * The character edge style indicating a uniform border around the character should be drawn.
     * 
     * [@const] kCMTextMarkupCharacterEdgeStyle_DropShadow
     * The character edge style indicating a drop shadow should be drawn.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_None();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_Raised();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_Depressed();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_Uniform();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_DropShadow();

    /**
     * [@const] kCMMetadataKeySpace_QuickTimeUserData
     * Metadata keyspace for QuickTime User Data keys.
     * [@const] kCMMetadataKeySpace_ISOUserData
     * Metadata keyspace for MPEG-4 User Data keys.
     * [@const] kCMMetadataKeySpace_QuickTimeMetadata
     * Metadata keyspace for QuickTime Metadata keys.
     * [@const] kCMMetadataKeySpace_iTunes
     * Metadata keyspace for iTunes keys.
     * [@const] kCMMetadataKeySpace_ID3
     * Metadata keyspace for ID3 keys.
     * [@const] kCMMetadataKeySpace_Icy
     * Metadata keyspace for ShoutCast keys.
     * [@const] kCMMetadataKeySpace_HLSDateRange
     * Metadata keyspace for HLS DateRange tags.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_QuickTimeUserData();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_ISOUserData();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_QuickTimeMetadata();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_iTunes();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_ID3();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_Icy();

    /**
     * API-Since: 9.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_HLSDateRange();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataLocation_ISO6709
     * Location information in ISO-6709 format.
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataDirection_Facing
     * Direction the observer is facing.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLocation_ISO6709();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataDirection_Facing();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataPreferredAffineTransform
     * An affine transform that can be used in place of a track matrix for
     * displaying a video track, to better reflect the current orientation
     * of a video camera with respect to a scene. For example, if the camera
     * is rotated after a recording has started, the presence of this metadata
     * will allow a player to adjust its rendering at the time the rotation occurred.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataPreferredAffineTransform();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataVideoOrientation
     * Video orientation as defined by TIFF/EXIF, which is enumerated by CGImagePropertyOrientation
     * (see <ImageIO/CGImageProperties.h>).
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataVideoOrientation();

    /**
     * [@const] kCMMetadataBaseDataType_RawData
     * A sequence of bytes whose interpretation based upon an agreement between
     * the reader and the writer.
     * [@const] kCMMetadataBaseDataType_UTF8
     * UTF-8 string.
     * [@const] kCMMetadataBaseDataType_UTF16
     * UTF-16 string.
     * [@const] kCMMetadataBaseDataType_GIF
     * GIF image.
     * [@const] kCMMetadataBaseDataType_JPEG
     * JPEG image.
     * [@const] kCMMetadataBaseDataType_PNG
     * PNG image.
     * [@const] kCMMetadataBaseDataType_BMP
     * BMP image.
     * [@const] kCMMetadataBaseDataType_Float32
     * 32-bit big endian floating point number.
     * [@const] kCMMetadataBaseDataType_Float64
     * 64-bit big endian floating point number.
     * [@const] kCMMetadataBaseDataType_SInt8
     * 8-bit signed integer.
     * [@const] kCMMetadataBaseDataType_SInt16
     * 16-bit big endian signed integer.
     * [@const] kCMMetadataBaseDataType_SInt32
     * 32-bit big endian signed integer.
     * [@const] kCMMetadataBaseDataType_SInt64
     * 64-bit big endian signed integer.
     * [@const] kCMMetadataBaseDataType_UInt8
     * 8-bit unsigned integer.
     * [@const] kCMMetadataBaseDataType_UInt16
     * 16-bit big endian unsigned integer.
     * [@const] kCMMetadataBaseDataType_UInt32
     * 32-bit big endian unsigned integer.
     * [@const] kCMMetadataBaseDataType_UInt64
     * 64-bit big endian unsigned integer.
     * [@const] kCMMetadataBaseDataType_PointF32
     * Consists of two 32-bit big endian floating point values, the x and y values, respectively.
     * [@const] kCMMetadataBaseDataType_DimensionsF32
     * Consists of a 32-bit big endian floating point x value followed by a 32-bit floating point y value.
     * [@const] kCMMetadataBaseDataType_RectF32
     * Consists of four 32-bit big endian floating point values, the origin's x, origin's y, width and height values,
     * respectively.
     * May also be interpreted as a 32-bit floating point origin followed by a 32-bit floating point dimension.
     * [@const] kCMMetadataDataType_AffineTransformF64
     * A 3x3 matrix of 64-bit big endian floating point numbers stored in row-major order that specify an affine
     * transform.
     * [@const] kCMMetadataBaseDataType_PolygonF32
     * Three or more pairs of 32-bit floating point numbers (x and y values) that define the verticies of a polygon.
     * [@const] kCMMetadataBaseDataType_PolylineF32
     * Two or more pairs of 32-bit floating point numbers (x and y values) that define a multi-segmented line.
     * [@const] kCMMetadataBaseDataType_JSON
     * UTF-8 encoded JSON data.
     * [@const] kCMMetadataBaseDataType_PerspectiveTransformF64
     * A 3x3 matrix of 64-bit big endian floating point numbers stored in row-major order that specify a perspective
     * transform.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_RawData();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UTF8();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UTF16();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_GIF();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_JPEG();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PNG();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_BMP();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_Float32();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_Float64();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt8();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt16();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt32();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt64();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt8();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt16();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt32();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt64();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PointF32();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_DimensionsF32();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_RectF32();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_AffineTransformF64();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PolygonF32();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PolylineF32();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_JSON();

    /**
     * [@const] kCMMetadataDataType_Location_ISO6709
     * A string supplying location information in ISO-6709 format. Conforms to
     * kCMMetadataBaseDataType_UTF8.
     * [@const] kCMMetadataDataType_Direction
     * A string supplying degrees offset from magnetic North. Conforms to
     * kCMMetadataBaseDataType_UTF8.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataDataType_QuickTimeMetadataLocation_ISO6709();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataDataType_QuickTimeMetadataDirection();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCreate {
        @Generated
        int call_CMSampleBufferCreate(@NotNull CMSampleBufferRef arg0, @Nullable VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMAudioSampleBufferCreateWithPacketDescriptions {
        @Generated
        int call_CMAudioSampleBufferCreateWithPacketDescriptions(@NotNull CMSampleBufferRef arg0,
                @Nullable VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCreateForImageBuffer {
        @Generated
        int call_CMSampleBufferCreateForImageBuffer(@NotNull CMSampleBufferRef arg0, @Nullable VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferSetInvalidateCallback {
        @Generated
        void call_CMSampleBufferSetInvalidateCallback(@NotNull CMSampleBufferRef arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferSetInvalidateHandler {
        @Generated
        void call_CMSampleBufferSetInvalidateHandler(@NotNull CMSampleBufferRef sbuf);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCallForEachSample {
        @Generated
        int call_CMSampleBufferCallForEachSample(@NotNull CMSampleBufferRef arg0, @NInt long arg1,
                @Nullable VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferCallBlockForEachSample {
        @Generated
        int call_CMSampleBufferCallBlockForEachSample(@NotNull CMSampleBufferRef arg0, @NInt long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueResetWithCallback {
        @Generated
        void call_CMBufferQueueResetWithCallback(@NotNull ConstVoidPtr arg0, @Nullable VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueInstallTrigger {
        @Generated
        void call_CMBufferQueueInstallTrigger(@Nullable VoidPtr arg0, @NotNull CMBufferQueueTriggerToken arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueInstallTriggerWithIntegerThreshold {
        @Generated
        void call_CMBufferQueueInstallTriggerWithIntegerThreshold(@Nullable VoidPtr arg0,
                @NotNull CMBufferQueueTriggerToken arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueCallForEachBuffer {
        @Generated
        int call_CMBufferQueueCallForEachBuffer(@NotNull ConstVoidPtr arg0, @Nullable VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueSetValidationCallback {
        @Generated
        int call_CMBufferQueueSetValidationCallback(@NotNull CMBufferQueueRef arg0, @NotNull ConstVoidPtr arg1,
                @Nullable VoidPtr arg2);
    }

    /**
     * [@function] CMVideoFormatDescriptionCreateFromHEVCParameterSets
     * 
     * Creates a format description for a video media stream described by HEVC (H.265) parameter set NAL units.
     * 
     * This function parses the dimensions provided by the parameter sets and creates a format description suitable for
     * a raw H.265 stream.
     * The parameter sets' data can come from raw NAL units and must have any emulation prevention bytes needed.
     * The supported NAL unit types to be included in the format description are 32 (video parameter set), 33 (sequence
     * parameter set), 34 (picture parameter set), 39 (prefix SEI) and 40 (suffix SEI). At least one of each parameter
     * set must be provided.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromHEVCParameterSets(@Nullable CFAllocatorRef allocator,
            @NUInt long parameterSetCount,
            @NotNull @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointers,
            @NotNull ConstNUIntPtr parameterSetSizes, int NALUnitHeaderLength, @Nullable CFDictionaryRef extensions,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMVideoFormatDescriptionGetHEVCParameterSetAtIndex
     * 
     * Returns a parameter set contained in a HEVC (H.265) format description.
     * 
     * This function parses the HEVC decoder configuration record contained in a H.265 video format description and
     * returns the NAL unit at the given index from it. These NAL units are typically parameter sets (e.g. VPS, SPS,
     * PPS), but may contain others as specified by ISO/IEC 14496-15 (e.g. user-data SEI).
     * Both parameterSetPointerOut and parameterSetSizeOut may be NULL, parameterSetCountOut will return the total
     * number of parameter set NAL units contained in the HEVC decoder configuration record.
     * The parameter set NAL units returned will already have any emulation prevention bytes needed.
     * The pointer returned in parameterSetPointerOut points to internal memory of videoDesc, and may only be accessed
     * as long as a retain on videoDesc is held.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionGetHEVCParameterSetAtIndex(
            @NotNull CMFormatDescriptionRef videoDesc, @NUInt long parameterSetIndex,
            @Nullable @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointerOut,
            @Nullable NUIntPtr parameterSetSizeOut, @Nullable NUIntPtr parameterSetCountOut,
            @Nullable IntPtr NALUnitHeaderLengthOut);

    /**
     * same as kCVImageBufferTransferFunction_SMPTE_ST_2084_PQ
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_SMPTE_ST_2084_PQ();

    /**
     * same as kCVImageBufferTransferFunction_ITU_R_2100_HLG
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_2100_HLG();

    /**
     * CFData(24 bytes); big-endian structure; same as kCVImageBufferMasteringDisplayColorVolumeKey; matches payload of
     * ISO/IEC 23008-2:2015(E), D.2.28 Mastering display colour volume SEI message
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_MasteringDisplayColorVolume();

    /**
     * CFData(4 bytes); big-endian structure; same as kCVImageBufferContentLightLevelInfoKey
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ContentLightLevelInfo();

    /**
     * CFDictionary(kCMHEVCTemporalLevelInfoKey_*), optional. Corresponds to 'tscl' sample group.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCTemporalLevelInfo();

    /**
     * CFNumber(Int)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_TemporalLevel();

    /**
     * CFNumber(Int)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileSpace();

    /**
     * CFNumber(Int)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_TierFlag();

    /**
     * CFNumber(Int)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileIndex();

    /**
     * CFData(4 bytes)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileCompatibilityFlags();

    /**
     * CFData(6 bytes)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ConstraintIndicatorFlags();

    /**
     * CFNumber(Int)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_LevelIndex();

    /**
     * CFBoolean, optional. Corresponds to 'tsas' sample group.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCTemporalSubLayerAccess();

    /**
     * CFBoolean, optional. Corresponds to 'stsa' sample group.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCStepwiseTemporalSubLayerAccess();

    /**
     * CFNumber(Int), optional. Corresponds to 'sync' sample group.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCSyncSampleNALUnitType();

    /**
     * CFData (matrix_float3x3)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix();

    /**
     * [@function] CMTimeFoldIntoRange
     * 
     * Folds a time into the given range. This can be used in looping time calculations.
     * 
     * Note that for certain types of looping, you may want to NOT fold times that are prior
     * to the loop range. That's up to the client.
     * 
     * API-Since: 12.0
     * 
     * @return A CMTime structure representing the translated duration.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeFoldIntoRange(@ByValue CMTime time, @ByValue CMTimeRange foldRange);

    /**
     * [@function] CMSampleBufferCreateWithMakeDataReadyHandler
     * 
     * Creates a CMSampleBuffer.
     * 
     * See CMSampleBufferCreate; this variant allows for passing a block to make the data ready.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateWithMakeDataReadyHandler(@Nullable CFAllocatorRef allocator,
            @Nullable CMBlockBufferRef dataBuffer, byte dataReady, @Nullable CMFormatDescriptionRef formatDescription,
            @NInt long numSamples, @NInt long numSampleTimingEntries,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, @Nullable ConstNUIntPtr sampleSizeArray,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut,
            @Nullable @ObjCBlock(name = "call_CMSampleBufferCreateWithMakeDataReadyHandler") Block_CMSampleBufferCreateWithMakeDataReadyHandler makeDataReadyHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferCreateWithMakeDataReadyHandler {
        @Generated
        int call_CMSampleBufferCreateWithMakeDataReadyHandler(@NotNull CMSampleBufferRef sbuf);
    }

    /**
     * [@function] CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler
     * 
     * Creates an CMSampleBuffer containing audio given packetDescriptions instead of sizing and timing info
     * 
     * See CMAudioSampleBufferCreateWithPacketDescriptions; this variant allows for passing a block to make the data
     * ready.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler(
            @Nullable CFAllocatorRef allocator, @Nullable CMBlockBufferRef dataBuffer, byte dataReady,
            @NotNull CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @ByValue CMTime presentationTimeStamp,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut,
            @Nullable @ObjCBlock(name = "call_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler") Block_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler makeDataReadyHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler {
        @Generated
        int call_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler(
                @NotNull CMSampleBufferRef sbuf);
    }

    /**
     * [@function] CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler
     * 
     * Creates a CMSampleBuffer that contains a CVImageBuffer instead of a CMBlockBuffer.
     * 
     * See CMSampleBufferCreateForImageBuffer; this variant allows for passing a block to make the data ready.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler(
            @Nullable CFAllocatorRef allocator, @NotNull CVBufferRef imageBuffer, byte dataReady,
            @NotNull CMFormatDescriptionRef formatDescription,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            @NotNull Ptr<CMSampleBufferRef> sampleBufferOut,
            @Nullable @ObjCBlock(name = "call_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler") Block_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler makeDataReadyHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler {
        @Generated
        int call_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler(@NotNull CMSampleBufferRef sbuf);
    }

    /**
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CMTimebaseSetMasterClock(@NotNull CMTimebaseRef timebase,
            @NotNull CMClockRef newMasterClock);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CMTimebaseSetMasterTimebase(@NotNull CMTimebaseRef timebase,
            @NotNull CMTimebaseRef newMasterTimebase);

    /**
     * [@function] CMBufferQueueCreateWithHandlers
     * 
     * Creates a CMBufferQueue object.
     * 
     * On return, the caller owns the returned CMBufferQueue, and must release it when done with it.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCreateWithHandlers(@Nullable CFAllocatorRef allocator, @NInt long capacity,
            @NotNull VoidPtr handlers, @NotNull Ptr<CMBufferQueueRef> queueOut);

    /**
     * [@function] CMBufferQueueInstallTriggerHandler
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * The returned trigger token can be passed to CMBufferQueueTestTrigger and CMBufferQueueRemoveTrigger.
     * The triggerTokenOut parameter can be NULL (client doesn't need to test or remove trigger), and the
     * handler parameter can be NULL (client doesn't need callbacks, but rather will explicitly
     * test the trigger). One of these two parameters must be non-NULL, however, since an untestable
     * trigger that does not perform a callback is meaningless. If the trigger condition is already true,
     * CMBufferQueueInstallTrigger will call the handler. If it does this, it will first write
     * the trigger token to *triggerTokenOut.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerHandler(@NotNull CMBufferQueueRef queue, int condition,
            @ByValue CMTime time, @Nullable Ptr<CMBufferQueueTriggerToken> triggerTokenOut,
            @Nullable @ObjCBlock(name = "call_CMBufferQueueInstallTriggerHandler") Block_CMBufferQueueInstallTriggerHandler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMBufferQueueInstallTriggerHandler {
        @Generated
        void call_CMBufferQueueInstallTriggerHandler(@NotNull CMBufferQueueTriggerToken triggerToken);
    }

    /**
     * [@function] CMBufferQueueInstallTriggerHandlerWithIntegerThreshold
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * This function behaves the same way as CMBufferQueueInstallTriggerHandler() except the trigger is evaluated
     * against
     * the integer value rather than the time value.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerHandlerWithIntegerThreshold(@NotNull CMBufferQueueRef queue,
            int condition, @NInt long threshold, @Nullable Ptr<CMBufferQueueTriggerToken> triggerTokenOut,
            @Nullable @ObjCBlock(name = "call_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold") Block_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold {
        @Generated
        void call_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold(
                @NotNull CMBufferQueueTriggerToken triggerToken);
    }

    /**
     * [@function] CMBufferQueueSetValidationHandler
     * 
     * Sets a block that CMBufferQueueEnqueue will call to validate buffers before adding them to the queue.
     * 
     * Both a validation callback and a validation handler can be set at the
     * same time, in which case they will both be called when enqueueing
     * buffers. They both need to return noErr for the buffer to be enqueued.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueSetValidationHandler(@NotNull CMBufferQueueRef queue,
            @NotNull @ObjCBlock(name = "call_CMBufferQueueSetValidationHandler") Block_CMBufferQueueSetValidationHandler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMBufferQueueSetValidationHandler {
        @Generated
        int call_CMBufferQueueSetValidationHandler(@NotNull CMBufferQueueRef queue, @NotNull ConstVoidPtr buf);
    }

    /**
     * same as kCVImageBufferTransferFunction_Linear
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_Linear();

    /**
     * same as kCVImageBufferTransferFunction_sRGB
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_sRGB();

    /**
     * CFString (usually kCMFormatDescriptionTransferFunction_ITU_R_2100_HLG when used); corresponds to D.2.38
     * Alternative Transfer Characteristics SEI message
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AlternativeTransferCharacteristics();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AuxiliaryTypeInfo();

    /**
     * one of:
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AlphaChannelMode();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionAlphaChannelMode_StraightAlpha();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionAlphaChannelMode_PremultipliedAlpha();

    /**
     * CFBoolean; used to signal the presence of alpha channel in the bitstream.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ContainsAlphaChannel();

    /**
     * CFNumber(Int), optional.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_AudioIndependentSampleDecoderRefreshCount();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransform
     * A perspective transform that can be used to adjust a Live Photo still image to match the Live Photo movie.
     * Expected data type is kCMMetadataBaseDataType_PerspectiveTransformF64.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransform();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransformReferenceDimensions
     * The dimensions of the image used to generate kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransform.
     * Expected data type is kCMMetadataBaseDataType_DimensionsF32.
     * 
     * API-Since: 13.2
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransformReferenceDimensions();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PerspectiveTransformF64();

    /**
     * CNNumberRef as FourCharCode
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ProtectedContentOriginalFormat();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Inline
    @CFunction
    public static native int CMTimebaseCreateWithSourceClock(@Nullable CFAllocatorRef allocator,
            @NotNull CMClockRef sourceClock, @NotNull Ptr<CMTimebaseRef> timebaseOut);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Inline
    @CFunction
    public static native int CMTimebaseCreateWithSourceTimebase(@Nullable CFAllocatorRef allocator,
            @NotNull CMTimebaseRef sourceTimebase, @NotNull Ptr<CMTimebaseRef> timebaseOut);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Inline
    @CFunction
    public static native CMTimebaseRef CMTimebaseCopySourceTimebase(@NotNull CMTimebaseRef timebase);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Inline
    @CFunction
    public static native CMClockRef CMTimebaseCopySourceClock(@NotNull CMTimebaseRef timebase);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Inline
    @CFunction
    public static native ConstVoidPtr CMTimebaseCopySource(@NotNull CMTimebaseRef timebase);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Inline
    @CFunction
    public static native CMClockRef CMTimebaseCopyUltimateSourceClock(@NotNull CMTimebaseRef timebase);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Inline
    @CFunction
    public static native int CMTimebaseSetSourceClock(@NotNull CMTimebaseRef timebase,
            @NotNull CMClockRef newSourceClock);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Inline
    @CFunction
    public static native int CMTimebaseSetSourceTimebase(@NotNull CMTimebaseRef timebase,
            @NotNull CMTimebaseRef newSourceTimebase);

    /**
     * CFNumber (such as 8, 10, 12, 16, etc). Bit-depth per component -- if there are components with different bit
     * depths this should be the deepest. Do not rely on this extension always being present, as it often isn't.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_BitsPerComponent();

    /**
     * CFNumber; horizontal field of view in thousandths of a degree (i.e., 123456 is 123.456 degrees).
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_HorizontalFieldOfView();

    /**
     * CFData(8 bytes); big-endian structure; same as kCVImageBufferAmbientViewingEnvironmentKey; matches payload of
     * ISO/IEC 23008-2:2017, D.2.39 ambient viewing environment SEI message
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AmbientViewingEnvironment();

    /**
     * CFData
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_CryptorSubsampleAuxiliaryData();

    /**
     * CFData
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HDR10PlusPerFrameData();

    /**
     * M4A, M4V, etc (implies ISO)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_ISOFamilyWithAppleExtensions();

    /**
     * [@const] kCMTextMarkupAttribute_FontFamilyNameList
     * 
     * The array of font name(s) and if that name is a generic or a platform name.
     * 
     * Value must be a CFArray holding CFDictionaries that are used to render and/or measure text. Each dictionary entry
     * has a font family name and a font kind value.
     * The font kind value can be either 0 for generic font family or 1 for platform font family corresponding to the
     * font family name.
     * The CFArray value can hold multiple font names as a fallback where the author prefers specific fonts. If the
     * renderer does not support the first font entry, it tries the following.
     * For example, the array includes InexistantFont and Times New Roman font names, it is expected the renderer to
     * select the "Times New Roman" font for drawing caption.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_FontFamilyNameList();

    @Generated public static final double CMTIMEBASE_USE_SOURCE_TERMINOLOGY = 0.0;

    /**
     * [@function] CMVideoFormatDescriptionCopyTagCollectionArray
     * 
     * Copies the multi-image encoding properties as an array of CMTagCollections.
     * 
     * On return, the caller owns the returned CFArrayRef and must release it when done with it.
     * This function copies the VideoLayerIDs and LeftAndRightViewIDs from hvcC and 3D Reference Displays Info SEI in
     * the formatDescription.
     * The returned values can be used to enable the multi-image decoding with
     * kVTDecompressionPropertyKey_RequestedMVHEVCVideoLayerIDs.
     * It also gives the eye mapping information for the pixel buffers of the decoded CMTaggedBufferGroups.
     * 
     * @param formatDescription CMVideoFormatDescription being interrogated.
     * @param tagCollectionsOut Returned TagCollections with CMTags such as kCMTagCategory_VideoLayerID and
     *                          kCMTagCategory_StereoViewType.
     * @return Array of CMTagCollections. The result will be NULL if the CMVideoFormatDescription does not contain
     *         multi-image encoding parameters, or if there is some other error.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCopyTagCollectionArray(
            @NotNull CMFormatDescriptionRef formatDescription, @Nullable Ptr<CFArrayRef> tagCollectionsOut);

    /**
     * [@function] CMTagIsValid
     * 
     * Tests if a CMTag is valid.
     * 
     * @param tag The CMTag to evaluate.
     * @return Returns false if the tag's dataType is kCMTagDataType_Invalid, true otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CMTagIsValid(@ByValue CMTag tag);

    /**
     * [@function] CMTagGetValueDataType
     * 
     * Returns the dataType field of the CMTag.
     * 
     * @param tag CMTag from which to extract the data type.
     * @return kCMTagDataType_* value.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagGetValueDataType(@ByValue CMTag tag);

    /**
     * [@function] CMTagGetCategory
     * 
     * Returns the CMTagCategory field of the CMTag.
     * 
     * @param tag CMTag to access.
     * @return CMTagCategory of the tag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Inline
    @CFunction
    public static native int CMTagGetCategory(@ByValue CMTag tag);

    /**
     * [@function] CMTagCategoryEqualToTagCategory
     * 
     * Tests if the CMTagCategory fields of two CMTags are equal.
     * 
     * Function evaluates if two tag categories are structurally equivalent. This can also be performed using the ==
     * operator with the fields but this inline can be useful if one wants to catch invocations.
     * 
     * @param tag1 First CMTag to test.
     * @param tag2 Second CMTag to test.
     * @return Boolean indicating if the tag categories are equal.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CMTagCategoryEqualToTagCategory(@ByValue CMTag tag1, @ByValue CMTag tag2);

    /**
     * [@function] CMTagGetValue
     * 
     * Returns the raw 64-bit CMTagValue field of the CMTag.
     * 
     * The CMTagValue is returned without consideration for the encoded data type.
     * 
     * @param tag CMTag to access.
     * @return CMTagValue of the tag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Inline
    @CFunction
    public static native long CMTagGetValue(@ByValue CMTag tag);

    /**
     * [@function] CMTagHasCategory
     * 
     * Returns true if the CMTag has the specified CMTagCategory.
     * 
     * @param tag      CMTag to evaluate.
     * @param category CMTagCategory to check for.
     * @return CMTagCategory of the tag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CMTagHasCategory(@ByValue CMTag tag, int category);

    /**
     * [@function] CMTagHasSInt64Value
     * 
     * Checks if the tag represents a signed 64-bit value.
     * 
     * @param tag CMTag to evaluate.
     * @return Returns true if the CMTag carries a signed 64-bit value indicated by a data type of
     *         kCMTagDataType_SInt64, false otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagHasSInt64Value(@ByValue CMTag tag);

    /**
     * [@function] CMTagGetSInt64Value
     * 
     * Returns the signed 64-bit value carried by the CMTag.
     * 
     * This should only be called on a CMTag with a data type of kCMTagDataType_SInt64. Calling it with a CMTag having
     * another data type is undefined.
     * 
     * @param tag CMTag to evaluate.
     * @return Signed 64-bit integer.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native long CMTagGetSInt64Value(@ByValue CMTag tag);

    /**
     * [@function] CMTagHasFloat64Value
     * 
     * Checks if the tag represents a 64-bit float value.
     * 
     * @param tag CMTag to evaluate.
     * @return Returns true if the CMTag carries a 64-bit float indicated by a data type of kCMTagDataType_Float64,
     *         false otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagHasFloat64Value(@ByValue CMTag tag);

    /**
     * [@function] CMTagGetFloat64Value
     * 
     * Returns the 64-bit floating point value carried by the CMTag.
     * 
     * This should only be called on a CMTag with a data type of kCMTagDataType_Float64. Calling it with a CMTag having
     * another data type is undefined.
     * 
     * @param tag CMTag to evaluate.
     * @return 64-bit float.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native double CMTagGetFloat64Value(@ByValue CMTag tag);

    /**
     * [@function] CMTagHasOSTypeValue
     * 
     * Checks if the tag represents an OSType value.
     * 
     * @param tag CMTag to evaluate.
     * @return Returns true if the CMTag carries an OSType indicated by a data type of kCMTagDataType_OSType, false
     *         otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagHasOSTypeValue(@ByValue CMTag tag);

    /**
     * [@function] CMTagGetOSTypeValue
     * 
     * Returns the single OSType value carried by the CMTag.
     * 
     * This should only be called on a CMTag with a data type of kCMTagDataType_OSType. Calling it with a CMTag having
     * another data type is undefined.
     * 
     * @param tag CMTag to evaluate.
     * @return OSType.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagGetOSTypeValue(@ByValue CMTag tag);

    /**
     * [@function] CMTagHasFlagsValue
     * 
     * Checks if the tag represents an flags value.
     * 
     * @param tag CMTag to evaluate.
     * @return Returns true if the CMTag carries 64 bits of flags indicated by a data type of kCMTagDataType_Flags,
     *         false otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagHasFlagsValue(@ByValue CMTag tag);

    /**
     * [@function] CMTagGetFlagsValue
     * 
     * Returns the 64 bits of flags as an unsigned 64-bit integer carried by the CMTag.
     * 
     * This should only be called on a CMTag with a data type of kCMTagDataType_Flags. Calling it with a CMTag having
     * another data type is undefined.
     * 
     * @param tag CMTag to evaluate.
     * @return Unsigned 64-bit integer holding the flags value.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native long CMTagGetFlagsValue(@ByValue CMTag tag);

    /**
     * [@function] CMTagMakeWithSInt64Value
     * 
     * Create a CMTag holding a signed 64-bit integer.
     * 
     * This function creates a valid CMTag with the data type kCMTagDataType_SInt64 and have a signed 64-bit integer
     * value.
     * 
     * @param category CMTagCategory for the created CMTag.
     * @param value    A signed 64-bit integer to encode in the returned CMTag.
     * @return A CMTag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTag CMTagMakeWithSInt64Value(int category, long value);

    /**
     * [@function] CMTagMakeWithFloat64Value
     * 
     * Create a CMTag holding a 64-bit float.
     * 
     * This function creates a valid CMTag with the data type kCMTagDataType_Float64 and have a 64-bit floating point
     * value.
     * 
     * @param category CMTagCategory for the created CMTag.
     * @param value    A 64-bit float to encode in the returned CMTag.
     * @return A CMTag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTag CMTagMakeWithFloat64Value(int category, double value);

    /**
     * [@function] CMTagMakeWithOSTypeValue
     * 
     * Create a CMTag holding an OSType.
     * 
     * This function creates a valid CMTag with the data type kCMTagDataType_OSType and have an OSType value.
     * 
     * @param category CMTagCategory for the created CMTag.
     * @param value    An OSType to encode in the returned CMTag.
     * @return A CMTag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTag CMTagMakeWithOSTypeValue(int category, int value);

    /**
     * [@function] CMTagMakeWithFlagsValue
     * 
     * Create a CMTag holding a 64 bits of flags.
     * 
     * This function creates a valid CMTag with the data type kCMTagDataType_Flags and has an unsigned 64-bit integer
     * value holding the flags.
     * 
     * @param category    CMTagCategory for the created CMTag.
     * @param flagsForTag An unsigned 64-bit integer to encode in the returned CMTag.
     * @return A CMTag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTag CMTagMakeWithFlagsValue(int category, long flagsForTag);

    /**
     * [@function] CMTagEqualToTag
     * 
     * Tests if two CMTags are equal.
     * 
     * Function evaluates if two tags are structurally equivalent. It performs a field by field comparison.
     * 
     * @param tag1 First CMTag to test for equality.
     * @param tag2 Second CMTag to test for equality.
     * @return Returns true if the two tags are equal, false otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagEqualToTag(@ByValue CMTag tag1, @ByValue CMTag tag2);

    /**
     * [@function] CMTagCompare
     * 
     * Compares two CMTags in an ordered fashion returning a CFComparisonResult based upon the ordering of the tags.
     * 
     * The entirety of a CMTag can be compared against a second CMTag in an ordered way. The details of how the
     * comparison is performed is an internal implementation detail. The comparison is performed as tag1 COMPARISON tag2
     * where COMPARISON is the ordering operation. The ordering will be stable under a release of the framework but may
     * change in the future. Therefore, an ordered CMTag array serialized in one version of the framework should not be
     * assumed to be ordered the same in another version of the framework. This is best handled by retrieving the
     * original array of CMTags and then reinserting with the new order.
     * 
     * @param tag1 First CMTag to compare in ordered fashion.
     * @param tag2 Second CMTag to compare in ordered fashion.
     * @return The CFComparisonResult indicating the order of tag1 compared to tag2.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMTagCompare(@ByValue CMTag tag1, @ByValue CMTag tag2);

    /**
     * [@function] CMTagCategoryValueEqualToValue
     * 
     * Compares two CMTagCategory values for equality.
     * 
     * Equality can also be tested by comparing the values with == but this is provided for consistency with other tests
     * here.
     * 
     * @param tag1 First CMTag to test for equality.
     * @param tag2 Second CMTag to test for equality.
     * @return Boolean indicating if the tag values are equal.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CMTagCategoryValueEqualToValue(@ByValue CMTag tag1, @ByValue CMTag tag2);

    /**
     * [@function] CMTagHash
     * 
     * Calculates a hash code for the CMTag.
     * 
     * @param tag CMTag to hash.
     * @return The created CFHashCode.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMTagHash(@ByValue CMTag tag);

    /**
     * [@function] CMTagCopyDescription
     * 
     * Creates a CFString with a description of a CMTag (just like CFCopyDescription).
     * 
     * This can be used from within CFShow on an object that contains CMTag fields. It is also useful from other client
     * debugging code. The caller owns the returned CFString, and is responsible for releasing it. Descriptions are not
     * localized so are likely suitable only for debugging.
     * 
     * @param allocator CFAllocator to use in creating the description string. Pass kCFAllocatorDefault to use the
     *                  default allocator.
     * @param tag       CMTag to describe.
     * @return The created CFString description.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFStringRef CMTagCopyDescription(@Nullable CFAllocatorRef allocator, @ByValue CMTag tag);

    /**
     * [@function] CMTagCopyAsDictionary
     * 
     * Returns a CFDictionary version of a CMTag.
     * 
     * This is useful when putting CMTag in CF container types. The caller owns the returned CFDictionary, and is
     * responsible for releasing it.
     * 
     * @param tag       The CMTag from which to create the dictionary.
     * @param allocator CFAllocator with which to create a dictionary. Pass kCFAllocatorDefault to use the default
     *                  allocator.
     * @return A CFDictionary version of the CMTag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFDictionaryRef CMTagCopyAsDictionary(@ByValue CMTag tag, @Nullable CFAllocatorRef allocator);

    /**
     * [@function] CMTagMakeFromDictionary
     * 
     * Reconstitutes a CMTag struct from a CFDictionary previously created by CMTagCopyAsDictionary.
     * 
     * This is useful when getting CMTag from CF container types. If the CFDictionary does not have the requisite keyed
     * values, kCMTagInvalid is returned.
     * 
     * @param dict A CFDictionary from which to create a CMTag.
     * @return The created CMTag.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTag CMTagMakeFromDictionary(@NotNull CFDictionaryRef dict);

    /**
     * [@function] CMTagCollectionGetTypeID
     * 
     * Obtains the CoreFoundation type ID for the CMTagCollection type.
     * 
     * Obtains the CoreFoundation type ID for the CMTagCollection type.
     * 
     * @return Returns the CFTypeID corresponding to CMTagCollection.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMTagCollectionGetTypeID();

    /**
     * [@function] CMTagCollectionCreate
     * 
     * Creates a CMTagCollectionRef described by a number of parameters.
     * 
     * This can be used to construct a CMTagCollectionRef from zero or more CMTags.
     * 
     * @param allocator        CFAllocator to use to create the collection and internal data structures.
     * @param tags             Zero or more CMTag structs to copy into the collection. May pass NULL if tagCount is also
     *                         zero (0).
     * @param tagCount         Number of tags in the 'tags' array.
     * @param newCollectionOut Address of a location to return the newly created CMTagCollectionRef. The client is
     *                         responsible for releasing the returned CMTagCollection.
     * @return OSStatus with error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreate(@Nullable CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable CMTag tags,
            @NInt long tagCount, @NotNull Ptr<CMTagCollectionRef> newCollectionOut);

    /**
     * [@function] CMTagCollectionCreateMutable
     * 
     * Creates a CMMutableTagCollectionRef.
     * 
     * This can be used to construct a mutable CMTagCollectionRef with a capacity limit or without a capacity limit. A
     * capacity greater than zero indicates a maximum number of CMTags the collection can contain. The actual number of
     * tags may be less than this value depending upon how many tags have been added to the collection.
     * If capacity is 0, the mutable collection can contain any number of tags.
     * 
     * @param allocator               CFAllocator to use to create the collection and internal data structures.
     * @param capacity                Capacity limit set to zero to indicate no limit or a value greater than zero for a
     *                                limit.
     * @param newMutableCollectionOut Address of a location to return the newly created CMMutabbleTagCollectionRef. The
     *                                client is responsible for releasing the returned CMMutableTagCollection.
     * @return OSStatus with error, or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateMutable(@Nullable CFAllocatorRef allocator, @NInt long capacity,
            @NotNull Ptr<CMMutableTagCollectionRef> newMutableCollectionOut);

    /**
     * [@function] CMTagCollectionCreateCopy
     * 
     * Creates a duplicate CMTagCollectionRef.
     * 
     * This can be used to construct a CMTagCollectionRef that contains all the same tags as another collection.
     * 
     * @param tagCollection        CMTagCollectionRef used to create the copy.
     * @param allocator            CFAllocator used to create the copy.
     * @param newCollectionCopyOut Address of a location to return the newly created CMTagCollectionRef. The client is
     *                             responsible for releasing the returned CMTagCollection.
     * @return OSStatus with error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateCopy(@NotNull CMTagCollectionRef tagCollection,
            @Nullable CFAllocatorRef allocator, @NotNull Ptr<CMTagCollectionRef> newCollectionCopyOut);

    /**
     * [@function] CMTagCollectionCreateMutableCopy
     * 
     * Creates a duplicate mutable CMTagCollectionRef.
     * 
     * This can be used to construct a CMMutableTagCollectionRef that contains all the same tags as another collection.
     * 
     * @param tagCollection               CMTagCollectionRef used to create the copy.
     * @param allocator                   CFAllocator used to create the copy.
     * @param newMutableCollectionCopyOut Address of a location to return the newly created CMMutableTagCollectionRef.
     *                                    The client is responsible for releasing the returned CMMutableTagCollection.
     * @return OSStatus with error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateMutableCopy(@NotNull CMTagCollectionRef tagCollection,
            @Nullable CFAllocatorRef allocator, @NotNull Ptr<CMMutableTagCollectionRef> newMutableCollectionCopyOut);

    /**
     * [@function] CMTagCollectionCopyDescription
     * 
     * Creates a CFString with a description of a CMTagCollection.
     * 
     * This can be used from within CFShow on a CMTagCollection object. It is also useful from other client debugging
     * code. The caller owns the returned CFString, and is responsible for releasing it. Descriptions are not localized
     * so are likely suitable only for debugging.
     * 
     * @param allocator     CFAllocator to use in creating the description string.
     * @param tagCollection CMTagCollectionRef to describe.
     * @return The created CFString description.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFStringRef CMTagCollectionCopyDescription(@Nullable CFAllocatorRef allocator,
            @Nullable CMTagCollectionRef tagCollection);

    /**
     * [@function] CMTagCollectionGetCount
     * 
     * Returns the number of CMTags held in the CMTagCollectionRef.
     * 
     * @param tagCollection CMTagCollectionRef to evaluate for the tag count.
     * @return CMItemCount holding the count.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMTagCollectionGetCount(@NotNull CMTagCollectionRef tagCollection);

    /**
     * [@function] CMTagCollectionContainsTag
     * 
     * Checks if the tag collection contains a specific tag.
     * 
     * @param tagCollection CMTagCollection to check.
     * @param tag           CMTag to find.
     * @return Returns true if the indicated CMTag is contained within the CMTagCollection, false otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagCollectionContainsTag(@NotNull CMTagCollectionRef tagCollection, @ByValue CMTag tag);

    /**
     * [@function] CMTagCollectionContainsTagsOfCollection
     * 
     * Checks if all the tags in a tag collection are present in another tag collection.
     * 
     * Tests if a collection of tags specified by a CMTagCollection are contained within another tag collection in its
     * entirety. Partial containment will report false. Complete containment will report true.
     * 
     * @param tagCollection          CMTagCollectionRef used to check.
     * @param containedTagCollection CMTagCollectionRef whose contents should be checked for containment in
     *                               tagCollection.
     * @return Returns true if all CMTags in a collection are contained within the specified CMTagCollection, false
     *         otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagCollectionContainsTagsOfCollection(@NotNull CMTagCollectionRef tagCollection,
            @NotNull CMTagCollectionRef containedTagCollection);

    /**
     * [@function] CMTagCollectionContainsSpecifiedTags
     * 
     * Checks if all the specified tags are contained in a tag collection.
     * 
     * Tests if the tags specified by a buffer of CMTags are contained within another tag collection in its entirety.
     * Partial containment will report false. Complete containment will report true.
     * 
     * @param tagCollection     CMTagCollectionRef to check.
     * @param containedTags     The non-NULL address to a CMTag array whose CMTags should be checked for containment in
     *                          tagCollection.
     * @param containedTagCount The number of CMTag elements in the buffer containedTags. Zero is allowed but will
     *                          report true.
     * @return Returns true if all CMTags in a buffer of CMTags are contained within the CMTagCollection, false
     *         otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagCollectionContainsSpecifiedTags(@NotNull CMTagCollectionRef tagCollection,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CMTag containedTags,
            @NInt long containedTagCount);

    /**
     * [@function] CMTagCollectionContainsCategory
     * 
     * Tests if a CMTagCategory is used by any CMTags within the tag container.
     * 
     * @param tagCollection CMTagCollectionRef to check.
     * @param category      CMTagCategory whose value should be checked for containment in tagCollection.
     * @return Returns true if tagCollection contains at least one CMTag with the specified category, false otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagCollectionContainsCategory(@NotNull CMTagCollectionRef tagCollection, int category);

    /**
     * [@function] CMTagCollectionGetCountOfCategory
     * 
     * Counts an returns the number of tags in the tag collection matching the specified category.
     * 
     * Returns the count of tags having the specified category. It will return 0 if there are no tags.
     * 
     * @param tagCollection CMTagCollectionRef to evaluate.
     * @param category      CMTagCategory to check for.
     * @return Returns the count of tags having the specified category.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMTagCollectionGetCountOfCategory(@NotNull CMTagCollectionRef tagCollection,
            int category);

    /**
     * [@function] CMTagCollectionGetTags
     * 
     * Retrieve all CMTags and copy into a supplied buffer.
     * 
     * The function retrieves a specified number of CMTags from the CMTagCollectionRef and copies them to a supplied
     * buffer. The routine populates a provided sized buffer with each CMTag in the collection. If the provided buffer
     * is smaller than needed to retrieve all tags, the routine will fill the buffer, return the number actually copied
     * and return kCMTagCollectionError_ExhaustedBufferSize. If the provided buffer is larger than the number of CMTags
     * in the collection to retrieve, the routine will fill the buffer with the number of available CMTags, return the
     * number copied and fill the remainder of the buffer with kCMTagInvalid while returning noErr.
     * 
     * @param tagCollection      CMTagCollectionRef to iterate.
     * @param tagBuffer          A non-NULL address of a buffer to fill with CMTags with CMTagCategory 'category'.
     * @param tagBufferCount     The number of CMTags the buffer 'tagBuffer' can hold.
     * @param numberOfTagsCopied The address of a CMItemCount that is filled with the number of tags retrieved, may be
     *                           NULL.
     * @return OSStatus with an error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionGetTags(@NotNull CMTagCollectionRef tagCollection,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CMTag tagBuffer,
            @NInt long tagBufferCount, @Nullable NIntPtr numberOfTagsCopied);

    /**
     * [@function] CMTagCollectionGetTagsWithCategory
     * 
     * Retrieve CMTags having a specified CMTagCategory and copy to a supplied buffer.
     * 
     * Populates a provided buffer with each CMTag in the collection that has the specified CMTagCategory. If the
     * provided buffer is smaller than needed, the routine will fill the buffer, return the number of CMTags actually
     * copied and return kCMTagCollectionError_ExhaustedBufferSize. If the provided buffer is larger than needed, it
     * will fill the buffer with the number of available CMTags, return the number copied and fill the remainder of the
     * buffer with kCMTagInvalid.
     * 
     * @param tagCollection      CMTagCollectionRef to iterate.
     * @param category           CMTagCategory to match.
     * @param tagBuffer          A non-NULL address of a buffer to fill with CMTags with CMTagCategory 'category'.
     * @param tagBufferCount     The number of CMTags the buffer 'tagBuffer' can hold.
     * @param numberOfTagsCopied The address of a CMItemCount that is filled with the number of tags retrieved, may be
     *                           NULL.
     * @return OSStatus with an error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionGetTagsWithCategory(@NotNull CMTagCollectionRef tagCollection, int category,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CMTag tagBuffer,
            @NInt long tagBufferCount, @Nullable NIntPtr numberOfTagsCopied);

    /**
     * [@function] CMTagCollectionCountTagsWithFilterFunction
     * 
     * Count the number of tags satisfying a callback.
     * 
     * Iterates over the CMTags of the tag collection calling the supplied callback and incrementing a counter for each
     * tag satisfying the callback. Returns this counter value upon completing iteration.
     * 
     * @param tagCollection CMTagCollectionRef to iterate.
     * @param filterApplier The CMTagCollectionTagFilterFunction callback to call with each tag.
     * @param context       A void * or NULL to pass to applier.
     * @return CMItemCount indicating the number of CMTags satisfying 'filterApplier'.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMTagCollectionCountTagsWithFilterFunction(@NotNull CMTagCollectionRef tagCollection,
            @FunctionPtr(name = "call_CMTagCollectionCountTagsWithFilterFunction") @NotNull Function_CMTagCollectionCountTagsWithFilterFunction filterApplier,
            @Nullable VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMTagCollectionCountTagsWithFilterFunction {
        @Generated
        byte call_CMTagCollectionCountTagsWithFilterFunction(@ByValue CMTag arg0, @Nullable VoidPtr arg1);
    }

    /**
     * [@function] CMTagCollectionGetTagsWithFilterFunction
     * 
     * Retrieve CMTags satisfying a callback function and copy them to a supplied buffer.
     * 
     * Applies a CMTagCollectionTagFilterFunction predicate and populates a provided buffer with each CMTag that for
     * each tag when the filter returns true. If the provided buffer is smaller than the number of tags the predicate
     * satisfies, the routine will fill the buffer, return the copy CMTags actually copied and return
     * kCMTagCollectionError_ExhaustedBufferSize. If the provided buffer is larger than needed, it will fill the buffer
     * with the number of available CMTags, fill the remainder of the buffer with kCMTagInvalid and return a result of
     * noErr.
     * 
     * @param tagCollection      CMTagCollectionRef to iterate.
     * @param tagBuffer          A non-NULL address of a buffer to fill with CMTags with CMTagCategory 'category'.
     * @param tagBufferCount     The number of CMTags the buffer 'tagBuffer' can hold.
     * @param numberOfTagsCopied The address of a CMItemCount that is filled with the number of tags retrieved, may be
     *                           NULL.
     * @param filter             The CMTagCollectionTagFilterFunction callback to call with each tag.
     * @param context            A void * or NULL to pass to filter.
     * @return OSStatus with an error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionGetTagsWithFilterFunction(@NotNull CMTagCollectionRef tagCollection,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CMTag tagBuffer,
            @NInt long tagBufferCount, @Nullable NIntPtr numberOfTagsCopied,
            @FunctionPtr(name = "call_CMTagCollectionGetTagsWithFilterFunction") @NotNull Function_CMTagCollectionGetTagsWithFilterFunction filter,
            @Nullable VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMTagCollectionGetTagsWithFilterFunction {
        @Generated
        byte call_CMTagCollectionGetTagsWithFilterFunction(@ByValue CMTag arg0, @Nullable VoidPtr arg1);
    }

    /**
     * [@function] CMTagCollectionCopyTagsOfCategories
     * 
     * Copies all tags belonging to a specified list of CMTagCategory from one tag collection to a newly created tag
     * collection.
     * 
     * This routine copies all tags belonging to a specified list of CMTagCategory from one tag collection to a newly
     * created tag collection.
     * 
     * @param allocator                      CFAllocatorRef to use in allocations of the operation.
     * @param tagCollection                  CMTagCollectionRef from which to copy tags.
     * @param categories                     A non-NULL address of a buffer containing a list of CMTagCategory.
     * @param categoriesCount                The number of CMTagCategory the buffer 'categories' is holding.
     * @param collectionWithTagsOfCategories The address of a CMTagCollectionRef that contains all tags copied from
     *                                       'tagCollection'. The client is responsible for releasing the returned
     *                                       CMTagCollection.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCopyTagsOfCategories(@Nullable CFAllocatorRef allocator,
            @NotNull CMTagCollectionRef tagCollection, @NotNull ConstIntPtr categories, @NInt long categoriesCount,
            @NotNull Ptr<CMTagCollectionRef> collectionWithTagsOfCategories);

    /**
     * [@function] CMTagCollectionApply
     * 
     * Iterate over a tag collection calling the provided callback.
     * 
     * Iterates over the CMTags of the tag collection executing the callback with each tag.
     * 
     * @param tagCollection CMTagCollectionRef to iterate.
     * @param applier       The CMTagCollectionApplierFunction callback to call with each tag.
     * @param context       A void * or NULL to pass to applier.
     * 
     *                      API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native void CMTagCollectionApply(@NotNull CMTagCollectionRef tagCollection,
            @FunctionPtr(name = "call_CMTagCollectionApply") @NotNull Function_CMTagCollectionApply applier,
            @Nullable VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMTagCollectionApply {
        @Generated
        void call_CMTagCollectionApply(@ByValue CMTag arg0, @Nullable VoidPtr arg1);
    }

    /**
     * [@function] CMTagCollectionApplyUntil
     * 
     * Iterate over a tag collection until the callback is satisfied.
     * 
     * Function iterates over the CMTags of the tag collection until the function returns true and then returns the
     * CMTag at that position. Once the callback is satisfied by returning true, CMTagCollectionApplyUntil() stops
     * iteration and returns the CMTag that evaluated to true. If no CMTags satisfy the callback, the value
     * kCMTagInvalid will be returned.
     * 
     * @param tagCollection CMTagCollectionRef to iterate.
     * @param applier       The CMTagCollectionTagFilterFunction callback to call with each tag.
     * @param context       A void * or NULL to pass to applier.
     * @return CMTag having the value of the first tag the callback returned true for or kCMTagInvalid if none was
     *         found.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTag CMTagCollectionApplyUntil(@NotNull CMTagCollectionRef tagCollection,
            @FunctionPtr(name = "call_CMTagCollectionApplyUntil") @NotNull Function_CMTagCollectionApplyUntil applier,
            @Nullable VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMTagCollectionApplyUntil {
        @Generated
        byte call_CMTagCollectionApplyUntil(@ByValue CMTag arg0, @Nullable VoidPtr arg1);
    }

    /**
     * [@function] CMTagCollectionIsEmpty
     * 
     * Reports if the tag collection contains no tags.
     * 
     * This is a convenience name for set like use but is the same as the expression: CMTagCollectionIsEmptyGetCount()
     * == 0.
     * 
     * @param tagCollection CMTagCollectionRef to iterate.
     * @return True if there are no tags, false otherwise.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native byte CMTagCollectionIsEmpty(@NotNull CMTagCollectionRef tagCollection);

    /**
     * [@function] CMTagCollectionCreateIntersection
     * 
     * Calculates the intersection of two tag collections to produce a new tag collection.
     * 
     * This routine creates an intersection of two tag collection by finding common tags among two source tag
     * collections and produces a new tag collection containing those common tags.
     * 
     * @param tagCollection1   CMTagCollectionRef to use in the intersection operation.
     * @param tagCollection2   CMTagCollectionRef to use in the intersection operation.
     * @param tagCollectionOut The address of a CMTagCollectionRef that contains all tags that are common to
     *                         'tagCollection1' and 'tagCollection2'. The client is responsible for releasing the
     *                         returned CMTagCollection.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateIntersection(@Nullable CMTagCollectionRef tagCollection1,
            @Nullable CMTagCollectionRef tagCollection2, @NotNull Ptr<CMTagCollectionRef> tagCollectionOut);

    /**
     * [@function] CMTagCollectionCreateUnion
     * 
     * Calculates the union of two tag collections to produce a new tag collection.
     * 
     * This routine creates an union of two tag collection by adding all tags from two tag collections and produces a
     * new tag collection containing all the tags. Duplicate tags will not be added twice. Note that if no tags are
     * common among the source tag collections, the new tag collection will contain as many tags as the sum of the
     * number of tags in each source tag collection. If two source tag collections contain the same tags, the resulting
     * tag collection will have the same number of tags as each source tag collection.
     * 
     * @param tagCollection1   CMTagCollectionRef to use in the union operation.
     * @param tagCollection2   CMTagCollectionRef to use in the union operation.
     * @param tagCollectionOut The address of a CMTagCollectionRef that contains all tags that are common to
     *                         'tagCollection1' and 'tagCollection2'. The client is responsible for releasing the
     *                         returned CMTagCollection.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateUnion(@Nullable CMTagCollectionRef tagCollection1,
            @Nullable CMTagCollectionRef tagCollection2, @NotNull Ptr<CMTagCollectionRef> tagCollectionOut);

    /**
     * [@function] CMTagCollectionCreateDifference
     * 
     * Calculates the difference of two tag collections to produce a new tag collection.
     * 
     * This routine creates the difference by considering a first source tag collection and removing all tags found in
     * the first tag collection to produce a new tag collection containing only the tags not in the second tag
     * collection. Note that if the second tag collection has no tags found in the first tag collection, the produced
     * tag collection will have the same tags as the first tag collection. If the second tag collection is empty, the
     * produced tag collection will also have the same tags as the first tag collection. If the second tag collection
     * contains all the tags found in the source tag collection, the produced tag collection will be empty. The order of
     * parameters is important. Given two tag collections 'A' and 'B', the calculaton of 'A' - 'B' is not the same as
     * 'B' - 'A'.
     * 
     * @param tagCollectionMinuend    CMTagCollectionRef from which to remove tags.
     * @param tagCollectionSubtrahend CMTagCollectionRef to consult to determine tags to remove from
     *                                'tagCollectionMinuend'.
     * @param tagCollectionOut        The address of a CMTagCollectionRef that contains tags from a first tag collection
     *                                without tags found in a second tag collection. The client is responsible for
     *                                releasing the returned CMTagCollection.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateDifference(@Nullable CMTagCollectionRef tagCollectionMinuend,
            @Nullable CMTagCollectionRef tagCollectionSubtrahend, @NotNull Ptr<CMTagCollectionRef> tagCollectionOut);

    /**
     * [@function] CMTagCollectionCreateExclusiveOr
     * 
     * Calculates the exclusive OR of two tag collections to produce a new tag collection.
     * 
     * This routine determines tags that are in only one of two source tag collections and adds only those to produce a
     * new tag collection. If both source tag collections have no tags in common, the produced tag collection will
     * contain a union of both source tag collections. If both source tag collections have the same tags, the produced
     * tag collection will be empty.
     * 
     * @param tagCollection1   CMTagCollectionRef to use in the xor operation.
     * @param tagCollection2   CMTagCollectionRef to use in the xor operation.
     * @param tagCollectionOut The address of a CMTagCollectionRef that contains the xor of the tags from the two tag
     *                         collections. The client is responsible for releasing the returned CMTagCollection.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateExclusiveOr(@Nullable CMTagCollectionRef tagCollection1,
            @Nullable CMTagCollectionRef tagCollection2, @NotNull Ptr<CMTagCollectionRef> tagCollectionOut);

    /**
     * [@function] CMTagCollectionAddTag
     * 
     * Adds a tag to a mutable tag collection guaranteeing it is only added once.
     * 
     * This routine adds a CMTag to a CMMutableTagCollection. If the CMTag already exists in the tag collection, the tag
     * is not added again. If the tag doesn't exist in the tag collection, the tag collection is updated to contain the
     * tag. Note that there is no ordering for tags within a tag collection.
     * 
     * @param tagCollection CMMutableTagCollectionRef to which to add a tag.
     * @param tagToAdd      A CMTag to add to the tag collection.
     * @return OSStatus indicating if the operation succeeded. Returns noErr if the tag was already in the collection.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionAddTag(@NotNull CMMutableTagCollectionRef tagCollection,
            @ByValue CMTag tagToAdd);

    /**
     * [@function] CMTagCollectionRemoveTag
     * 
     * Removes one tag from a mutable tag collection.
     * 
     * This routine removes a CMTag if present from a CMMutableTagCollection. If the CMTag exists in the tag collection,
     * the tag collection is updated to no longer contain the tag. If the tag doesn't exist in the tag collection, the
     * tag collection is left unchanged. The OSStatus will return kCMTagCollectionError_TagNotFound if the tag does not
     * exist in the collection or if the tag collection is empty.
     * 
     * @param tagCollection CMMutableTagCollectionRef from which to remove a tag.
     * @param tagToRemove   A CMTag to match to the tag collection.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionRemoveTag(@NotNull CMMutableTagCollectionRef tagCollection,
            @ByValue CMTag tagToRemove);

    /**
     * [@function] CMTagCollectionRemoveAllTags
     * 
     * Removes all tags from a mutable tag collection.
     * 
     * This routine removes all CMTags from a CMMutableTagCollection producing an empty collection.
     * 
     * @param tagCollection CMMutableTagCollectionRef from which to remove all tags.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionRemoveAllTags(@NotNull CMMutableTagCollectionRef tagCollection);

    /**
     * [@function] CMTagCollectionRemoveAllTagsOfCategory
     * 
     * Removes all tags having a specified category from a mutable tag collection.
     * 
     * This routine removes all CMTags having a specified CMTagCategory from a CMMutableTagCollection perhaps producing
     * an empty collection.
     * 
     * @param tagCollection CMMutableTagCollectionRef from which to remove all tags.
     * @param category      CMTagCategory to match.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionRemoveAllTagsOfCategory(@NotNull CMMutableTagCollectionRef tagCollection,
            int category);

    /**
     * [@function] CMTagCollectionAddTagsFromCollection
     * 
     * Add all tags from one tag collection to a mutable tag collection. Tags already existing in tagCollection will not
     * be added.
     * 
     * @param tagCollection           CMMutableTagCollectionRef to which to add tags.
     * @param collectionWithTagsToAdd CMTagCollectionRef from which to copy all tags.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionAddTagsFromCollection(@NotNull CMMutableTagCollectionRef tagCollection,
            @NotNull CMTagCollectionRef collectionWithTagsToAdd);

    /**
     * [@function] CMTagCollectionAddTagsFromArray
     * 
     * Adds all tags specified in a C array to a mutable tag collection. Tags already existing in tagCollection will not
     * be added.
     * 
     * @param tagCollection CMMutableTagCollectionRef to which to add tags.
     * @param tags          The address of a buffer of CMTags.
     * @param tagCount      CMItemCount of the number of tags in 'tags' array.
     * @return OSStatus indicating if the operation succeeded.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionAddTagsFromArray(@NotNull CMMutableTagCollectionRef tagCollection,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CMTag tags,
            @NInt long tagCount);

    /**
     * [@function] CMTagCollectionCopyAsDictionary
     * 
     * Returns a CFDictionary representation of a CMTagCollection.
     * 
     * This is useful when putting CMTagCollections in CF container types.
     * 
     * @param tagCollection CMTagCollection to serialize as a CFDictionary.
     * @param allocator     CFAllocator with which to create a dictionary. Pass kCFAllocatorDefault to use the default
     *                      allocator.
     * @return A CFDictionaryRef holding the serialized contents of the CMTagCollection. The client is responsible for
     *         releasing the returned CFDictionary.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFDictionaryRef CMTagCollectionCopyAsDictionary(@NotNull CMTagCollectionRef tagCollection,
            @Nullable CFAllocatorRef allocator);

    /**
     * [@function] CMTagCollectionCreateFromDictionary
     * 
     * Reconstitutes a CMTagCollection from a CFDictionary previously created by CMTagCollectionCopyAsDictionary.
     * 
     * This is useful when getting CMTagCollection from CF container types. If the CFDictionary does not have the
     * requisite keyed values, newCollectionOut will contain NULL.
     * 
     * @param dict             A CFDictionary from which to create a CMTagCollection.
     * @param allocator        CFAllocator to use in allocation CMTagCollectionRef
     * @param newCollectionOut Address of an CMTagCollectionRef to return the newly created tag collection. The client
     *                         is responsible for releasing the returned CMTagCollection.
     * @return OSStatus with error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateFromDictionary(@NotNull CFDictionaryRef dict,
            @Nullable CFAllocatorRef allocator, @NotNull Ptr<CMTagCollectionRef> newCollectionOut);

    /**
     * [@function] CMTagCollectionCopyAsData
     * 
     * Returns a CFDataRef version of a CMTagCollection.
     * 
     * This is useful when putting CMTagCollections in CF container types.
     * 
     * @param tagCollection CMTagCollection to serialize as a CFData.
     * @param allocator     CFAllocator with which to create a CFData. Pass kCFAllocatorDefault to use the default
     *                      allocator.
     * @return A CFDataRef holding the serialized contents of the CMTagCollection. The client is responsible for
     *         releasing the returned CFData.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFDataRef CMTagCollectionCopyAsData(@NotNull CMTagCollectionRef tagCollection,
            @Nullable CFAllocatorRef allocator);

    /**
     * [@function] CMTagCollectionCreateFromData
     * 
     * Reconstitutes a CMTagCollection from a CFData previously created by CMTagCollectionCopyAsData.
     * 
     * This is useful when getting CMTagCollection from CF container types. If the CFData does not
     * have the requisite keyed values, newCollectionOut will contain NULL.
     * 
     * @param data             A CFData from which to create a CMTagCollection.
     * @param allocator        CFAllocator to use in allocation CMTagCollectionRef. Pass kCFAllocatorDefault to use the
     *                         default allocator.
     * @param newCollectionOut Address of an CMTagCollectionRef to return the newly created tag collection. The client
     *                         is responsible for releasing the returned CMTagCollection.
     * @return OSStatus with error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTagCollectionCreateFromData(@NotNull CFDataRef data, @Nullable CFAllocatorRef allocator,
            @NotNull Ptr<CMTagCollectionRef> newCollectionOut);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMTaggedBufferGroupGetTypeID();

    /**
     * [@function] CMTaggedBufferGroupCreate
     * 
     * Creates a new tagged buffer group.
     * 
     * @param allocator      The CFAllocator to use for allocating this buffer group. May be NULL.
     * @param tagCollections A CFArray of CMTagCollections for the buffers.
     * @param buffers        A CFArray of buffers, each of type CMSampleBuffer or CVPixelBuffer. The group will retain
     *                       these sample buffers and pixel buffers.
     *                       The number of tagCollections must match the number of buffers.
     * @param groupOut       The newly created group will be placed here. The caller has a responsibility to call
     *                       CFRelease on it.
     * @return Returns noErr on success.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTaggedBufferGroupCreate(@Nullable CFAllocatorRef allocator,
            @NotNull CFArrayRef tagCollections, @NotNull CFArrayRef buffers,
            @NotNull Ptr<CMTaggedBufferGroupRef> groupOut);

    /**
     * [@function] CMTaggedBufferGroupCreateCombined
     * 
     * Creates a new tagged buffer group by combining all the tagged buffer groups in an array.
     * 
     * @param allocator          The CFAllocator to use for allocating this buffer group. May be NULL.
     * @param taggedBufferGroups A CFArray of CMTaggedBufferGroups.
     * @param groupOut           The newly created group will be placed here. The caller has a responsibility to call
     *                           CFRelease on it.
     * @return Returns noErr on success.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMTaggedBufferGroupCreateCombined(@Nullable CFAllocatorRef allocator,
            @NotNull CFArrayRef taggedBufferGroups, @NotNull Ptr<CMTaggedBufferGroupRef> groupOut);

    /**
     * [@function] CMTaggedBufferGroupGetCount
     * 
     * Returns the number of buffers in a CMTaggedBufferGroup.
     * 
     * @param group The CMTaggedBufferGroupRef to retrieve the count from.
     * @return Returns the number of buffers, or 0 on failure or if the group is empty.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMTaggedBufferGroupGetCount(@NotNull CMTaggedBufferGroupRef group);

    /**
     * [@function] CMTaggedBufferGroupGetTagCollectionAtIndex
     * 
     * Returns a CMTagCollection from a CMTaggedBufferGroup by sequential indexing.
     * 
     * @param group The CMTaggedBufferGroupRef to retrieve the tag collection from.
     * @param index An index from 0 to count-1.
     * @return Returns the tag collection, or NULL on failure.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CMTagCollectionRef CMTaggedBufferGroupGetTagCollectionAtIndex(
            @NotNull CMTaggedBufferGroupRef group, @NInt long index);

    /**
     * [@function] CMTaggedBufferGroupGetCVPixelBufferAtIndex
     * 
     * Returns a CVPixelBuffer from a CMTaggedBufferGroup by sequential indexing.
     * 
     * @param group The CMTaggedBufferGroupRef to retrieve the CVPixelBuffer from.
     * @param index An index from 0 to count-1.
     * @return Returns the CVPixelBuffer, or NULL on failure (including if the buffer at this index is not a
     *         CVPixelBuffer).
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CVBufferRef CMTaggedBufferGroupGetCVPixelBufferAtIndex(@NotNull CMTaggedBufferGroupRef group,
            @NInt long index);

    /**
     * [@function] CMTaggedBufferGroupGetCVPixelBufferForTag
     * 
     * Returns a CVPixelBuffer from a CMTaggedBufferGroup by looking for a unique match for the provided tag.
     * 
     * @param group    The CMTaggedBufferGroupRef to retrieve the CVPixelBuffer from.
     * @param tag      The tag to look up. If more than one buffer's tag collection includes this tag, the lookup will
     *                 fail.
     * @param indexOut On success, index of the returned CVPixelBuffer. May be NULL.
     * @return Returns the CVPixelBuffer, or NULL on failure (including if the buffer at this index is not a
     *         CVPixelBuffer).
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CVBufferRef CMTaggedBufferGroupGetCVPixelBufferForTag(@NotNull CMTaggedBufferGroupRef group,
            @ByValue CMTag tag, @Nullable NIntPtr indexOut);

    /**
     * [@function] CMTaggedBufferGroupGetCVPixelBufferForTagCollection
     * 
     * Returns a CVPixelBuffer from a CMTaggedBufferGroup by looking for a unique match for the provided tag collection.
     * 
     * @param group         The CMTaggedBufferGroupRef to retrieve the CVPixelBuffer from.
     * @param tagCollection The tag collection to look up. If more than one buffer's tag collection includes this tag
     *                      collection, the lookup will fail.
     * @param indexOut      On success, index of the returned CVPixelBuffer. May be NULL.
     * @return Returns the CVPixelBuffer, or NULL on failure (including if the buffer at this index is not a
     *         CVPixelBuffer).
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CVBufferRef CMTaggedBufferGroupGetCVPixelBufferForTagCollection(
            @NotNull CMTaggedBufferGroupRef group, @NotNull CMTagCollectionRef tagCollection,
            @Nullable NIntPtr indexOut);

    /**
     * [@function] CMTaggedBufferGroupGetCMSampleBufferAtIndex
     * 
     * Returns a CMSampleBuffer from a CMTaggedBufferGroup by sequential indexing.
     * 
     * @param group The CMTaggedBufferGroupRef to retrieve the CMSampleBuffer from.
     * @param index An index from 0 to count-1.
     * @return Returns the CMSampleBuffer, or NULL on failure (including if the buffer at this index is not a
     *         CMSampleBuffer).
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CMSampleBufferRef CMTaggedBufferGroupGetCMSampleBufferAtIndex(
            @NotNull CMTaggedBufferGroupRef group, @NInt long index);

    /**
     * [@function] CMTaggedBufferGroupGetCMSampleBufferForTag
     * 
     * Returns a CMSampleBuffer from a CMTaggedBufferGroup by looking for a unique match for the provided tag.
     * 
     * @param group    The CMTaggedBufferGroupRef to retrieve the CMSampleBuffer from.
     * @param tag      The tag to look up. If more than one buffer's tag collection includes this tag, the lookup will
     *                 fail.
     * @param indexOut On success, index of the returned CMSampleBuffer. May be NULL.
     * @return Returns the CMSampleBuffer, or NULL on failure (including if the buffer at this index is not a
     *         CMSampleBuffer).
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CMSampleBufferRef CMTaggedBufferGroupGetCMSampleBufferForTag(
            @NotNull CMTaggedBufferGroupRef group, @ByValue CMTag tag, @Nullable NIntPtr indexOut);

    /**
     * [@function] CMTaggedBufferGroupGetCMSampleBufferForTagCollection
     * 
     * Returns a CMSampleBuffer from a CMTaggedBufferGroup by looking for a unique match for the provided tag
     * collection.
     * 
     * @param group         The CMTaggedBufferGroupRef to retrieve the CMSampleBuffer from.
     * @param tagCollection The tag collection to look up. If more than one buffer's tag collection includes this tag
     *                      collection, the lookup will fail.
     * @param indexOut      On success, index of the returned CMSampleBuffer. May be NULL.
     * @return Returns the CMSampleBuffer, or NULL on failure (including if the buffer at this index is not a
     *         CMSampleBuffer).
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CMSampleBufferRef CMTaggedBufferGroupGetCMSampleBufferForTagCollection(
            @NotNull CMTaggedBufferGroupRef group, @NotNull CMTagCollectionRef tagCollection,
            @Nullable NIntPtr indexOut);

    /**
     * [@function] CMTaggedBufferGroupGetNumberOfMatchesForTagCollection
     * 
     * Returns the number of matches that a tag collection has in a CMTaggedBufferGroup.
     * 
     * If the returned count is less than or greater than 1, buffer lookups using this tag collection will fail and
     * return NULL, since the lookups must be unique and unambiguous.
     * 
     * @param group         The CMTaggedBufferGroupRef to examine.
     * @param tagCollection The tag collection to look up.
     * @return Returns the number of entries in the CMTaggedBufferGroup that match tagCollection.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMTaggedBufferGroupGetNumberOfMatchesForTagCollection(
            @NotNull CMTaggedBufferGroupRef group, @NotNull CMTagCollectionRef tagCollection);

    /**
     * [@function] CMTaggedBufferGroupFormatDescriptionCreateForTaggedBufferGroup
     * 
     * Creates a format description for a CMTaggedBufferGroup.
     * 
     * The returned CMTaggedBufferGroupFormatDescription could be used to create a CMSampleBuffer
     * wrapping the CMTaggedBufferGroup using CMSampleBufferCreateForTaggedBufferGroup.
     * If you are going to call CMSampleBufferCreateForTaggedBufferGroup on a series of matching
     * CMTaggedBufferGroups, it is more efficient to create the CMTaggedBufferGroupFormatDescription
     * once and use it for all of the CMSampleBuffers.
     * The caller owns the returned CMFormatDescription, and must release it when done with it.
     * 
     * API-Since: 17.0
     * 
     * @param allocator
     *                             CFAllocator to be used when creating the CMFormatDescription. Pass
     *                             kCFAllocatorDefault to use the default allocator.
     * @param taggedBufferGroup
     *                             The tagged buffer group for which we are creating the format description.
     * @param formatDescriptionOut
     *                             Returned newly-created tagged buffer group CMFormatDescription
     */
    @Generated
    @CFunction
    public static native int CMTaggedBufferGroupFormatDescriptionCreateForTaggedBufferGroup(
            @Nullable CFAllocatorRef allocator, @NotNull CMTaggedBufferGroupRef taggedBufferGroup,
            @NotNull Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function] CMTaggedBufferGroupFormatDescriptionMatchesTaggedBufferGroup
     * 
     * Checks to see if a given format description matches a tagged buffer group.
     * 
     * Returns true if the CMTaggedBufferGroupFormatDescription could be used to create a
     * CMSampleBuffer wrapping the CMTaggedBufferGroup using CMSampleBufferCreateForTaggedBufferGroup.
     * 
     * API-Since: 17.0
     * 
     * @param desc
     *                          The format description to validate.
     * @param taggedBufferGroup
     *                          The tagged buffer group to validate against.
     */
    @Generated
    @CFunction
    public static native byte CMTaggedBufferGroupFormatDescriptionMatchesTaggedBufferGroup(
            @NotNull CMFormatDescriptionRef desc, @NotNull CMTaggedBufferGroupRef taggedBufferGroup);

    /**
     * [@function] CMSampleBufferCreateForTaggedBufferGroup
     * 
     * Creates a new CMSampleBuffer object with the specified CMTaggedBufferGroup.
     * 
     * @param allocator
     *                          CFAllocator with which to create the CMSampleBuffer object. Pass kCFAllocatorDefault to
     *                          use the default allocator.
     * @param taggedBufferGroup
     *                          The CMTaggedBufferGroup to be stored in the sample buffer. The CMSampleBuffer will
     *                          retain the CMTaggedBufferGroup internally.
     * @param sbufPTS
     *                          Media time PTS of the sample buffer.
     * @param sbufDuration
     *                          Media time duration of the sample buffer. Can be kCMTimeInvalid if not known or not
     *                          defined.
     * @param formatDescription
     *                          A CMTaggedBufferGroupFormatDescription describing the CMTaggedBufferGroup.
     *                          You may create this with CMTaggedBufferGroupFormatDescriptionCreateForTaggedBufferGroup.
     *                          If you are creating a lot of CMSampleBuffers containing matching CMTaggedBufferGroups,
     *                          it is more efficient to create the CMTaggedBufferGroupFormatDescription once and use it
     *                          for all of the CMSampleBuffers.
     *                          You may call CMTaggedBufferGroupFormatDescriptionMatchesTaggedBufferGroup to confirm
     *                          that
     *                          a reused CMTaggedBufferGroupFormatDescription matches a new CMTaggedBufferGroup.
     * @param sBufOut
     *                          Returned newly created CMSampleBuffer.
     * @return OSStatus with error or noErr if successful.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateForTaggedBufferGroup(@Nullable CFAllocatorRef allocator,
            @NotNull CMTaggedBufferGroupRef taggedBufferGroup, @ByValue CMTime sbufPTS, @ByValue CMTime sbufDuration,
            @NotNull CMFormatDescriptionRef formatDescription, @NotNull Ptr<CMSampleBufferRef> sBufOut);

    /**
     * [@function] CMSampleBufferGetTaggedBufferGroup
     * 
     * Returns a CMSampleBuffer's TaggedBufferGroup of media data.
     * 
     * The caller does not own the returned CMTaggedBufferGroup, and must retain it explicitly if the caller needs to
     * maintain a reference to it.
     * 
     * @param sbuf CMSampleBuffer being interrogated.
     * @return CMTaggedBufferGroup of media data. The result will be NULL if the CMSampleBuffer does not contain a
     *         CMTaggedBufferGroup, or if there is some other error.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CMTaggedBufferGroupRef CMSampleBufferGetTaggedBufferGroup(@NotNull CMSampleBufferRef sbuf);

    /**
     * [@function] CMBufferQueueCopyHead
     * 
     * Retrieves & retains the next-to-dequeue buffer from a CMBufferQueue but leaves it in the queue.
     * 
     * This follows CF "Copy" semantics -- it retains the returned buffer.
     * Note that with non-FIFO queues it's not guaranteed that the next dequeue will return
     * this particular buffer (if an intervening Enqueue adds a buffer that will dequeue next).
     * 
     * @return The retained buffer. Will be NULL if the queue is empty.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ConstVoidPtr CMBufferQueueCopyHead(@NotNull CMBufferQueueRef queue);

    /**
     * CFData; big-endian structure; same as kCVImageBufferContentColorVolumeKey (to be added); matches payload of
     * ITU-T-H.265:11/2019, D.2.40 Content Colour Volume SEI message
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_ContentColorVolume();

    /**
     * [@constant] kCMFormatDescriptionExtension_LogTransferFunction
     * Indicates that the transfer function or gamma of the content is a log format and identifies the specific log
     * curve.
     * 
     * The value is a CFString holding fully specified reverse DNS identifier.
     * Content captured in Apple Log will have this key set to kCMFormatDescriptionLogTransferFunction_AppleLog.
     * [@constant] kCMFormatDescriptionLogTransferFunction_AppleLog
     * Indicates the Apple Log identifier.
     * 
     * You can download the Apple Log Profile White Paper from the Apple Developer Downloads website.
     * 
     * API-Since: 17.2
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_LogTransferFunction();

    /**
     * same as kCVImageBufferLogTransferFunction_AppleLog
     * 
     * API-Since: 17.2
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionLogTransferFunction_AppleLog();

    /**
     * CFString, one of
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_HeroEye();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionHeroEye_Left();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionHeroEye_Right();

    /**
     * CFNumber(uint32) as micrometers
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_StereoCameraBaseline();

    /**
     * CFNumber(int32) from -10000 to 10000 for the uniform range [-1.0...1.0]
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_HorizontalDisparityAdjustment();

    /**
     * CFBoolean
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_HasLeftStereoEyeView();

    /**
     * CFBoolean
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_HasRightStereoEyeView();

    /**
     * CFBoolean
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMFormatDescriptionExtension_HasAdditionalViews();

    /**
     * [@constant] kCMTagInvalid
     * 
     * CMTag with an unspecified or "null" value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagInvalid();

    /**
     * [@constant] kCMTagMediaTypeVideo
     * 
     * A CMTag of category kCMTagCategory_MediaType and the value kCMMediaType_Video (OSType).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagMediaTypeVideo();

    /**
     * [@constant] kCMTagMediaSubTypeMebx
     * 
     * A CMTag of category kCMTagCategory_MediaType and the value kCMMetadataFormatType_Boxed (OSType).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagMediaSubTypeMebx();

    /**
     * [@constant] kCMTagMediaTypeAudio
     * 
     * A CMTag of category kCMTagCategory_MediaType and the value kCMMediaType_Audio (OSType).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagMediaTypeAudio();

    /**
     * [@constant] kCMTagMediaTypeMetadata
     * 
     * A CMTag of category kCMTagCategory_MediaType and the value kCMMediaType_Metadata (OSType).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagMediaTypeMetadata();

    /**
     * [@constant] kCMTagStereoLeftEye
     * 
     * A CMTag of category kCMTagCategory_StereoView and the value kCMTagStereoViewComponent_LeftEye (Flags).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagStereoLeftEye();

    /**
     * [@constant] kCMTagStereoRightEye
     * 
     * A CMTag of category kCMTagCategory_StereoView and the value kCMTagStereoViewComponent_RightEye (Flags).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagStereoRightEye();

    /**
     * [@constant] kCMTagStereoLeftAndRightEye
     * 
     * A CMTag of category kCMTagCategory_StereoView and the value of the bitwise OR of
     * kCMTagStereoViewComponent_LeftEye and kCMTagStereoViewComponent_RightEye (Flags).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagStereoLeftAndRightEye();

    /**
     * [@constant] kCMTagStereoNone
     * 
     * A CMTag of category kCMTagCategory_StereoView and the value of kCMTagStereoViewComponent_None. (Flags)
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagStereoNone();

    /**
     * [@constant] kCMTagStereoInterpretationOrderReversed
     * 
     * A CMTag of category kCMTagCategory_StereoViewInterpretation and the value of
     * kCMStereoViewInterpretation_StereoOrderReversed (Flags).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagStereoInterpretationOrderReversed();

    /**
     * [@constant] kCMTagProjectionTypeRectangular
     * 
     * A CMTag of category kCMTagCategory_ProjectionType and the value kCMTagProjectionType_Rectangular (OSType).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagProjectionTypeRectangular();

    /**
     * [@constant] kCMTagProjectionTypeEquirectangular
     * 
     * A CMTag of category kCMTagCategory_ProjectionType and the value kCMTagProjectionType_Equirectangular (OSType).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagProjectionTypeEquirectangular();

    /**
     * [@constant] kCMTagProjectionTypeFisheye
     * 
     * A CMTag of category kCMTagCategory_ProjectionType and the value kCMTagProjectionType_Fisheye (OSType).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagProjectionTypeFisheye();

    /**
     * [@constant] kCMTagPackingTypeNone
     * 
     * A CMTag of category kCMTagCategory_PackingType and the value kCMTagPackingType_None (OStype).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagPackingTypeNone();

    /**
     * [@constant] kCMTagPackingTypeSideBySide
     * 
     * A CMTag of category kCMTagCategory_PackingType and the value kCMTagPackingType_SideBySide (OStype).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagPackingTypeSideBySide();

    /**
     * [@constant] kCMTagPackingTypeOverUnder
     * 
     * A CMTag of category kCMTagCategory_PackingType and the value kCMTagPackingType_OverUnder (OStype).
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTag kCMTagPackingTypeOverUnder();

    /**
     * [@constant] kCMTagValueKey
     * 
     * CFDictionary key for value field of a CMTag.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMTagValueKey();

    /**
     * [@constant] kCMTagCategoryKey
     * 
     * CFDictionary key for category field of a CMTag.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMTagCategoryKey();

    /**
     * [@constant] kCMTagDataTypeKey
     * 
     * CFDictionary key for dataType field of a CMTag.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMTagDataTypeKey();

    /**
     * [@constant] kCMTagCollectionTagsArrayKey
     * 
     * CFDictionary key for a CFArray of serialized CMTag dictionaries of a CMTagCollection as used with
     * CMTagCollectionCopyAsDictionary
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kCMTagCollectionTagsArrayKey();
}
