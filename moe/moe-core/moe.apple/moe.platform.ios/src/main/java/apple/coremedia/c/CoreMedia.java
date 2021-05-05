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

import apple.NSObject;
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
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
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
     * [@function]	CMTimeMake
     * 
     * Make a valid CMTime with value and timescale.  Epoch is implied to be 0.
     * 
     * @return		The resulting CMTime.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMake(long value, int timescale);

    /**
     * [@function]	CMTimeMakeWithEpoch
     * 
     * Make a valid CMTime with value, scale and epoch.
     * 
     * @return		The resulting CMTime.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithEpoch(long value, int timescale, long epoch);

    /**
     * [@function]	CMTimeMakeWithSeconds
     * 
     * Make a CMTime from a Float64 number of seconds, and a preferred timescale.
     * 
     * The epoch of the result will be zero.  If preferredTimescale is <= 0, the result
     * 			will be an invalid CMTime.  If the preferred timescale will cause an overflow, the
     * 			timescale will be halved repeatedly until the overflow goes away, or the timescale
     * 			is 1.  If it still overflows at that point, the result will be +/- infinity.  The
     * 			kCMTimeFlags_HasBeenRounded flag will be set if the result, when converted back to
     * 			seconds, is not exactly equal to the original seconds value.
     * 
     * @return		The resulting CMTime.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithSeconds(double seconds, int preferredTimescale);

    /**
     * [@function]	CMTimeGetSeconds
     * 
     * Converts a CMTime to seconds.
     * 
     * If the CMTime is invalid or indefinite, NAN is returned.  If the CMTime is infinite, +/- __inf()
     * 			is returned.  If the CMTime is numeric, epoch is ignored, and time.value / time.timescale is
     * 			returned.  The division is done in Float64, so the fraction is not lost in the returned result.
     * 
     * @return		The resulting Float64 number of seconds.
     */
    @Generated
    @CFunction
    public static native double CMTimeGetSeconds(@ByValue CMTime time);

    /**
     * [@function]	CMTimeConvertScale
     * 
     * Returns a new CMTime containing the source CMTime converted to a new timescale (rounding as requested).
     * 
     * If the value needs to be rounded, the kCMTimeFlags_HasBeenRounded flag will be set.
     * 			See definition of CMTimeRoundingMethod for a discussion of the various rounding methods available. If
     * 			the source time is non-numeric (ie. infinite, indefinite, invalid), the result will be similarly non-numeric.
     * 
     * @return		The converted result CMTime.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeConvertScale(@ByValue CMTime time, int newTimescale, int method);

    /**
     * 	[@function]	CMTimeAdd
     * 
     * Returns the sum of two CMTimes.
     * 
     * If the operands both have the same timescale, the timescale of the result will be the same as
     * 				the operands' timescale.  If the operands have different timescales, the timescale of the result
     * 				will be the least common multiple of the operands' timescales.  If that LCM timescale is 
     * 				greater than kCMTimeMaxTimescale, the result timescale will be kCMTimeMaxTimescale,
     * 				and default rounding will be applied when converting the result to this timescale.
     * 
     * 				If the result value overflows, the result timescale will be repeatedly halved until the result
     * 				value no longer overflows.  Again, default rounding will be applied when converting the
     * 				result to this timescale.  If the result value still overflows when timescale == 1, then the
     * 				result will be either positive or negative infinity, depending on the direction of the
     * 				overflow.
     * 
     * 				If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * 				set.  This flag will also be set if either of the operands has kCMTimeFlags_HasBeenRounded set.
     * 
     * 				If either of the operands is invalid, the result will be invalid.
     * 
     * 				If the operands are valid, but just one operand is infinite, the result will be similarly
     * 				infinite. If the operands are valid, and both are infinite, the results will be as follows:
     * <ul>			+infinity + +infinity == +infinity
     * <li>			-infinity + -infinity == -infinity
     * <li>			+infinity + -infinity == invalid
     * <li>			-infinity + +infinity == invalid
     * </ul>
     * 				If the operands are valid, not infinite, and either or both is indefinite, the result
     * 				will be indefinite. 								
     * 
     * 				If the two operands are numeric (ie. valid, not infinite, not indefinite), but have
     * 				different nonzero epochs, the result will be invalid.  If they have the same nonzero 
     * 				epoch, the result will have epoch zero (a duration).  Times in different epochs 
     * 				cannot be added or subtracted, because epoch length is unknown.  Times in epoch zero 
     * 				are considered to be durations and can be added to times in other epochs.
     * 				Times in different epochs can be compared, however, because numerically greater 
     * 				epochs always occur after numerically lesser epochs. 
     * 
     *     @return     The sum of the two CMTimes (lhs + rhs).
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAdd(@ByValue CMTime lhs, @ByValue CMTime rhs);

    /**
     * 	[@function]	CMTimeSubtract
     * 
     * Returns the difference of two CMTimes.
     * 
     * If the operands both have the same timescale, the timescale of the result will be the same as
     * 				the operands' timescale.  If the operands have different timescales, the timescale of the result
     * 				will be the least common multiple of the operands' timescales.  If that LCM timescale is 
     * 				greater than kCMTimeMaxTimescale, the result timescale will be kCMTimeMaxTimescale,
     * 				and default rounding will be applied when converting the result to this timescale.
     * 
     * 				If the result value overflows, the result timescale will be repeatedly halved until the result
     * 				value no longer overflows.  Again, default rounding will be applied when converting the
     * 				result to this timescale.  If the result value still overflows when timescale == 1, then the
     * 				result will be either positive or negative infinity, depending on the direction of the
     * 				overflow.
     * 
     * 				If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * 				set.  This flag will also be set if either of the operands has kCMTimeFlags_HasBeenRounded set.
     * 
     * 				If either of the operands is invalid, the result will be invalid.
     * 
     * 				If the operands are valid, but just one operand is infinite, the result will be similarly
     * 				infinite. If the operands are valid, and both are infinite, the results will be as follows:
     * <ul>			+infinity - +infinity == invalid
     * <li>			-infinity - -infinity == invalid
     * <li>			+infinity - -infinity == +infinity
     * <li>			-infinity - +infinity == -infinity
     * </ul>
     * 				If the operands are valid, not infinite, and either or both is indefinite, the result
     * 				will be indefinite. 								
     * 
     * 				If the two operands are numeric (ie. valid, not infinite, not indefinite), but have
     * 				different nonzero epochs, the result will be invalid.  If they have the same nonzero 
     * 				epoch, the result will have epoch zero (a duration).  Times in different epochs 
     * 				cannot be added or subtracted, because epoch length is unknown.  Times in epoch zero 
     * 				are considered to be durations and can be subtracted from times in other epochs.
     * 				Times in different epochs can be compared, however, because numerically greater 
     * 				epochs always occur after numerically lesser epochs. 
     * 
     *     @return     The difference of the two CMTimes (lhs - rhs).
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeSubtract(@ByValue CMTime lhs, @ByValue CMTime rhs);

    /**
     * [@function]	CMTimeMultiply
     * 
     * Returns the product of a CMTime and a 32-bit integer.
     * 
     * The result will have the same timescale as the CMTime operand. If the result value overflows,
     * 			the result timescale will be repeatedly halved until the result value no longer overflows.
     * 			Again, default rounding will be applied when converting the result to this timescale.  If the
     * 			result value still overflows when timescale == 1, then the result will be either positive or
     * 			negative infinity, depending on the direction of the overflow.
     * 
     * 			If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * 			set.  This flag will also be set if the CMTime operand has kCMTimeFlags_HasBeenRounded set.
     * 
     * 			If the CMTime operand is invalid, the result will be invalid.
     * 
     * 			If the CMTime operand is valid, but infinite, the result will be infinite, and of an appropriate sign, given
     * 			the signs of both operands.
     * 
     * 			If the CMTime operand is valid, but indefinite, the result will be indefinite. 								
     * 
     *    @return     The product of the CMTime and the 32-bit integer.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiply(@ByValue CMTime time, int multiplier);

    /**
     * [@function]	CMTimeMultiplyByFloat64
     * 
     * Returns the product of a CMTime and a 64-bit float.
     * 
     * The result will initially have the same timescale as the CMTime operand.
     * 			If the result timescale is less than 65536, it will be repeatedly doubled until it is at least 65536.
     * 			If the result value overflows, the result timescale will be repeatedly halved until the 
     * 			result value no longer overflows.
     * 			Again, default rounding will be applied when converting the result to this timescale.  If the
     * 			result value still overflows when timescale == 1, then the result will be either positive or
     * 			negative infinity, depending on the direction of the overflow.
     * 
     * 			If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * 			set.  This flag will also be set if the CMTime operand has kCMTimeFlags_HasBeenRounded set.
     * 
     * 			If the CMTime operand is invalid, the result will be invalid.
     * 
     * 			If the CMTime operand is valid, but infinite, the result will be infinite, and of an appropriate sign, given
     * 			the signs of both operands.
     * 
     * 			If the CMTime operand is valid, but indefinite, the result will be indefinite.								
     * 
     * @return     The product of the CMTime and the 64-bit float.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByFloat64(@ByValue CMTime time, double multiplier);

    /**
     * [@function]	CMTimeMultiplyByRatio
     * 
     * Returns the result of multiplying a CMTime by an integer, then dividing by another integer.
     * 
     * The exact rational value will be preserved, if possible without overflow.  If an overflow
     * 			would occur, a new timescale will be chosen so as to minimize the rounding error.
     * 			Default rounding will be applied when converting the result to this timescale.  If the
     * 			result value still overflows when timescale == 1, then the result will be either positive
     * 			or negative infinity, depending on the direction of the overflow.
     * 
     * 			If any rounding occurs for any reason, the result's kCMTimeFlags_HasBeenRounded flag will be
     * 			set.  This flag will also be set if the CMTime operand has kCMTimeFlags_HasBeenRounded set.
     * 
     * 			If the denominator, and either the time or the numerator, are zero, the result will be
     * 			kCMTimeInvalid.  If only the denominator is zero, the result will be either kCMTimePositiveInfinity
     * 			or kCMTimeNegativeInfinity, depending on the signs of the other arguments.
     * 
     * 			If time is invalid, the result will be invalid. If time is infinite, the result will be
     * 			similarly infinite. If time is indefinite, the result will be indefinite. 								
     * 
     *    @return     (time * multiplier) / divisor
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByRatio(@ByValue CMTime time, int multiplier, int divisor);

    /**
     * [@function]	CMTimeCompare
     * 
     * Returns the numerical relationship (-1 = less than, 1 = greater than, 0 = equal) of two CMTimes.
     * 
     * If the two CMTimes are numeric (ie. not invalid, infinite, or indefinite), and have
     * 			different epochs, it is considered that times in numerically larger epochs are always
     * 			greater than times in numerically smaller epochs. 
     * 
     * 			Since this routine will be used to sort lists by time, it needs to give all values 
     * 			(even invalid and indefinite ones) a strict ordering to guarantee that sort algorithms
     * 			terminate safely. The order chosen is somewhat arbitrary:
     * 
     * 			-infinity < all finite values < indefinite < +infinity < invalid
     * 
     * 			Invalid CMTimes are considered to be equal to other invalid CMTimes, and greater than
     * 			any other CMTime. Positive infinity is considered to be less than any invalid CMTime,
     * 			equal to itself, and greater than any other CMTime. An indefinite CMTime is considered
     * 			to be less than any invalid CMTime, less than positive infinity, equal to itself,
     * 			and greater than any other CMTime.  Negative infinity is considered to be equal to itself,
     * 			and less than any other CMTime.
     * 
     * 			-1 is returned if time1 is less than time2. 0 is returned if they
     * 			are equal. 1 is returned if time1 is greater than time2.
     * 
     *    @return     The numerical relationship of the two CMTimes (-1 = less than, 1 = greater than, 0 = equal).
     */
    @Generated
    @CFunction
    public static native int CMTimeCompare(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * [@function]	CMTimeMinimum
     * 
     * Returns the lesser of two CMTimes (as defined by CMTimeCompare).
     * 
     *    @return     The lesser of the two CMTimes.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMinimum(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * [@function]	CMTimeMaximum
     * 
     * Returns the greater of two CMTimes (as defined by CMTimeCompare).
     * 
     *    @return     The greater of the two CMTimes.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMaximum(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * [@function]	CMTimeAbsoluteValue
     * 
     * Returns the absolute value of a CMTime.
     * 
     *    @return     Same as the argument time, with sign inverted if negative.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAbsoluteValue(@ByValue CMTime time);

    /**
     * [@function]	CMTimeCopyAsDictionary
     * 
     * Returns a CFDictionary version of a CMTime.
     * 
     * This is useful when putting CMTimes in CF container types.
     * 
     *    @return     A CFDictionary version of the CMTime.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeCopyAsDictionary(@ByValue CMTime time, CFAllocatorRef allocator);

    /**
     * [@function]	CMTimeMakeFromDictionary
     * 
     * Reconstitutes a CMTime struct from a CFDictionary previously created by CMTimeCopyAsDictionary.
     * 
     * This is useful when getting CMTimes from CF container types.  If the CFDictionary does not
     * 			have the requisite keyed values, an invalid time is returned.
     * 
     * @return		The created CMTime.  
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeFromDictionary(CFDictionaryRef dictionaryRepresentation);

    /**
     * [@function]	CMTimeCopyDescription
     * 
     * Creates a CFString with a description of a CMTime (just like CFCopyDescription).
     * 
     * This is used from within CFShow on an object that contains CMTime fields. It is
     * 			also useful from other client debugging code.  The caller owns the returned
     * 			CFString, and is responsible for releasing it.
     * 
     * @return		The created CFString description.  
     */
    @Generated
    @CFunction
    public static native CFStringRef CMTimeCopyDescription(CFAllocatorRef allocator, @ByValue CMTime time);

    /**
     * [@function]	CMTimeShow
     * 
     * Prints a description of the CMTime (just like CFShow).
     * 
     * This is most useful from within gdb.
     */
    @Generated
    @CFunction
    public static native void CMTimeShow(@ByValue CMTime time);

    /**
     * [@function]	CMTimeRangeMake
     * 
     * Make a valid CMTimeRange with start and duration.
     * 
     * The duration parameter must have an epoch of 0; otherwise an invalid time range will be returned.
     * 
     * @return		The resulting CMTimeRange.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMake(@ByValue CMTime start, @ByValue CMTime duration);

    /**
     * [@function]	CMTimeRangeGetUnion
     * 
     * Returns the union of two CMTimeRanges.
     * 
     * This function returns a CMTimeRange structure that represents the union of the time ranges specified by the <i>range</i> and <i>otherRange</i> parameters.
     * 			This is the smallest range that includes all times that are in either range.
     * 
     * @return     The union of the two CMTimeRanges.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetUnion(@ByValue CMTimeRange range, @ByValue CMTimeRange otherRange);

    /**
     * [@function]	CMTimeRangeGetIntersection
     * 
     * Returns the intersection of two CMTimeRanges.
     * 
     * This function returns a CMTimeRange structure that represents the intersection of the time ranges specified by the <i>range</i> and <i>otherRange</i> parameters.
     * 			This is the largest range that both ranges include.
     * 
     * @return     The intersection of the two CMTimeRanges.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetIntersection(@ByValue CMTimeRange range,
            @ByValue CMTimeRange otherRange);

    /**
     * [@function]	CMTimeRangeEqual
     * 
     * Returns a Boolean value that indicates whether two CMTimeRanges are identical.
     * 
     * This function returns a Boolean value that indicates whether the time ranges specified by the <i>range1</i> and <i>range2</i> parameters are identical.
     * 
     *    @return     Returns true if the two time ranges are identical, false if they differ.
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeEqual(@ByValue CMTimeRange range1, @ByValue CMTimeRange range2);

    /**
     * [@function]	CMTimeRangeContainsTime
     * 
     * Indicates whether a time is contained within a time range.
     * 
     * This function returns a Boolean value that indicates whether the time specified by the <i>time</i> parameter
     * 			is contained within the range specified by the <i>range</i> parameter.
     * 
     *    @return     Returns true if the specified time is contained within the specified time range, false if it is not.
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTime(@ByValue CMTimeRange range, @ByValue CMTime time);

    /**
     * [@function]	CMTimeRangeContainsTimeRange
     * 
     * Indicates whether a time range is contained within a time range.
     * 
     * This function returns a Boolean value that indicates whether the time range specified by the <i>range</i> parameter
     * 			contains the range specified by the <i>otherRange</i> parameter.
     * 
     *    @return     Returns true if the second time range is contained within the first time range, false if it is not.
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTimeRange(@ByValue CMTimeRange range, @ByValue CMTimeRange otherRange);

    /**
     * [@function]	CMTimeRangeGetEnd
     * 
     * Returns a CMTime structure representing the end of a time range.
     * 
     * This function returns a CMTime structure that indicates the end of the time range specified by the <i>range</i> parameter.
     *    			CMTimeRangeContainsTime(range, CMTimeRangeGetEnd(range)) is always false.
     * 
     *    @return		A CMTime structure representing the end of the specified time range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeRangeGetEnd(@ByValue CMTimeRange range);

    /**
     * [@function]	CMTimeMapTimeFromRangeToRange
     * 
     * Translates a time through a mapping from CMTimeRange to CMTimeRange.
     * 
     * The start and end time of fromRange will be mapped to the start and end time of toRange respectively.
     *    			Other times will be mapped linearly, using the formula:
     *    				result = (t-fromRange.start)*(toRange.duration/fromRange.duration)+toRange.start
     *    			If either CMTimeRange argument is empty, an invalid CMTime will be returned.
     *    			If t does not have the same epoch as fromRange.start, an invalid CMTime will be returned.
     *    			If both fromRange and toRange have duration kCMTimePositiveInfinity, 
     *    			t will be offset relative to the differences between their starts, but not scaled.
     * 
     * @return		A CMTime structure representing the translated time.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapTimeFromRangeToRange(@ByValue CMTime t, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    /**
     * [@function]	CMTimeClampToRange
     * 
     * For a given CMTime and CMTimeRange, returns the nearest CMTime inside that time range.
     * 
     * Times inside the given time range will be returned unmodified.
     *    			Times before the start and after the end time of the time range will return the start and end time of 
     *    			the range respectively.
     *    			If the CMTimeRange argument is empty, an invalid CMTime will be returned.
     *    			If the given CMTime is invalid, the returned CMTime will be invalid, 
     * 
     * @return		A CMTime structure inside the given time range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeClampToRange(@ByValue CMTime time, @ByValue CMTimeRange range);

    /**
     * [@function]	CMTimeMapDurationFromRangeToRange
     * 
     * Translates a duration through a mapping from CMTimeRange to CMTimeRange.
     * 
     * The duration will be scaled in proportion to the ratio between the ranges' durations:
     *    				result = dur*(toRange.duration/fromRange.duration)
     *    			If dur does not have the epoch zero, an invalid CMTime will be returned.
     * 
     * @return		A CMTime structure representing the translated duration.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapDurationFromRangeToRange(@ByValue CMTime dur, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    /**
     * [@function]	CMTimeRangeFromTimeToTime
     * 
     * Make a valid CMTimeRange with the given starting and ending times.
     * 
     * @return		The resulting CMTimeRange.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeFromTimeToTime(@ByValue CMTime start, @ByValue CMTime end);

    /**
     * [@function]	CMTimeRangeCopyAsDictionary
     * 
     * Returns a CFDictionary version of a CMTimeRange.
     * 
     * This is useful when putting CMTimeRanges in CF container types.
     * 
     *    @return     A CFDictionary version of the CMTimeRange.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeRangeCopyAsDictionary(@ByValue CMTimeRange range,
            CFAllocatorRef allocator);

    /**
     * [@function]	CMTimeRangeMakeFromDictionary
     * 
     * Reconstitutes a CMTimeRange struct from a CFDictionary previously created by CMTimeRangeCopyAsDictionary.
     * 
     * This is useful when getting CMTimeRanges from CF container types.  If the CFDictionary does not
     * 			have the requisite keyed values, an invalid time range is returned.
     * 
     * @return		The created CMTimeRange.  
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMakeFromDictionary(CFDictionaryRef dictionaryRepresentation);

    /**
     * [@function]	CMTimeRangeCopyDescription
     * 
     * Creates a CFString with a description of a CMTimeRange (just like CFCopyDescription).
     * 
     * This is used from within CFShow on an object that contains CMTimeRange fields. It is
     * 			also useful from other client debugging code.  The caller owns the returned CFString and is responsible for releasing it.
     * 
     * @return		The created CFString description.  
     */
    @Generated
    @CFunction
    public static native CFStringRef CMTimeRangeCopyDescription(CFAllocatorRef allocator, @ByValue CMTimeRange range);

    /**
     * [@function]	CMTimeRangeShow
     * 
     * Prints a description of the CMTimeRange (just like CFShow).
     * 
     * This is most useful from within gdb.
     */
    @Generated
    @CFunction
    public static native void CMTimeRangeShow(@ByValue CMTimeRange range);

    /**
     * [@function]	CMTimeMappingMake
     * 
     * Make a valid CMTimeMapping with source and target.
     * 
     * The source and target parameters must have durations whose epoch is 0; otherwise an invalid time mapping will be returned.
     * 
     * @return		The resulting CMTimeMapping.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMake(@ByValue CMTimeRange source, @ByValue CMTimeRange target);

    /**
     * [@function]	CMTimeMappingMakeEmpty
     * 
     * Make a valid CMTimeMapping with an empty source.
     * 
     * The target parameter must have a duration whose epoch is 0; otherwise an invalid time mapping will be returned.
     * 
     * @return		The resulting CMTimeMapping.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMakeEmpty(@ByValue CMTimeRange target);

    /**
     * [@function]	CMTimeMappingCopyAsDictionary
     * 
     * Returns a CFDictionary version of a CMTimeMapping.
     * 
     * This is useful when putting CMTimeMappings in CF container types.
     * 
     *    @return     A CFDictionary version of the CMTimeMapping.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeMappingCopyAsDictionary(@ByValue CMTimeMapping mapping,
            CFAllocatorRef allocator);

    /**
     * [@function]	CMTimeMappingMakeFromDictionary
     * 
     * Reconstitutes a CMTimeMapping struct from a CFDictionary previously created by CMTimeMappingCopyAsDictionary.
     * 
     * This is useful when getting CMTimeMappings from CF container types.  If the CFDictionary does not
     * 			have the requisite keyed values, an invalid time mapping is returned.
     * 
     * @return		The created CMTimeMapping.  
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMakeFromDictionary(CFDictionaryRef dictionaryRepresentation);

    /**
     * [@function]	CMTimeMappingCopyDescription
     * 
     * Creates a CFString with a description of a CMTimeMapping (just like CFCopyDescription).
     * 
     * This is used from within CFShow on an object that contains CMTimeMapping fields. It is
     * 			also useful from other client debugging code.  The caller owns the returned CFString and is responsible for releasing it.
     * 
     * @return		The created CFString description.  
     */
    @Generated
    @CFunction
    public static native CFStringRef CMTimeMappingCopyDescription(CFAllocatorRef allocator,
            @ByValue CMTimeMapping mapping);

    /**
     * [@function]	CMTimeMappingShow
     * 
     * Prints a description of a CMTimeMapping (just like CFShow).
     * 
     * This is most useful from within gdb.
     */
    @Generated
    @CFunction
    public static native void CMTimeMappingShow(@ByValue CMTimeMapping mapping);

    /**
     * [@function]   CMSetAttachment
     * 
     * Sets or adds a attachment of a CMAttachmentBearer
     * 
     * You can attach any CF object to a CMAttachmentBearer object to store additional information. CMSetAttachment stores an attachment identified by a key. If the key doesn't exist, the attachment will be added. If the key does exist, the existing attachment will be replaced. In both cases the retain count of the attachment will be incremented. The value can be any CFType but nil has no defined behavior.  Given a CVBufferRef, CMSetAttachment is equivalent to CVBufferSetAttachment.
     * 
     * @param      target  Target CMAttachmentBearer.
     * @param      key     Key in form of a CFString identifying the desired attachment.
     * @param      value	Attachment in form af a CF object.
     * @param      attachmentMode	Specifies which attachment mode is desired for this attachment.   A particular attachment key may only exist in
     *                             a single mode at a time.
     */
    @Generated
    @CFunction
    public static native void CMSetAttachment(ConstVoidPtr target, CFStringRef key, ConstVoidPtr value,
            int attachmentMode);

    /**
     * [@function]   CMGetAttachment
     * 
     * Returns a specific attachment of a CMAttachmentBearer
     * 
     * You can attach any CF object to a CMAttachmentBearer to store additional information. CMGetAttachment retrieves an attachment identified by a key.  Given a CVBufferRef, CMGetAttachment is equivalent to CVBufferGetAttachment.
     * 
     * @param      target  Target CMAttachmentBearer.
     * @param      key	Key in form of a CFString identifying the desired attachment.
     * @param      attachmentModeOut  Returns the mode of the attachment, if desired.  May be NULL.
     * @return     If found the attachment object; else NULL.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMGetAttachment(ConstVoidPtr target, CFStringRef key, IntPtr attachmentModeOut);

    /**
     * [@function]   CMRemoveAttachment
     * 
     * Removes a specific attachment of a CMAttachmentBearer
     * 
     * CMRemoveAttachment removes an attachment identified by a key. If found the attachment is removed and the retain count decremented.  Given a CVBufferRef, CMRemoveAttachment is equivalent to CVBufferRemoveAttachment.
     * 
     * @param      target  Target CMAttachmentBearer.
     * @param      key	Key in form of a CFString identifying the desired attachment.
     */
    @Generated
    @CFunction
    public static native void CMRemoveAttachment(ConstVoidPtr target, CFStringRef key);

    /**
     * [@function]   CMRemoveAllAttachments
     * 
     * Removes all attachments of a CMAttachmentBearer
     * 
     * While CMRemoveAttachment removes a specific attachment identified by a key CMRemoveAllAttachments removes all attachments of a buffer and decrements their retain counts.  Given a CVBufferRef, CMRemoveAllAttachments is equivalent to CVBufferRemoveAllAttachments.
     * 
     * @param      target  Target CMAttachmentBearer.
     */
    @Generated
    @CFunction
    public static native void CMRemoveAllAttachments(ConstVoidPtr target);

    /**
     *   [@function]   CMCopyDictionaryOfAttachments
     * 
     * Returns all attachments of a CMAttachmentBearer
     * 
     * CMCopyDictionaryOfAttachments is a convenience call that returns all attachments with their corresponding keys in a new CFDictionary that the caller must dispose by calling CFRelease.  Given a CVBufferRef, CMCopyDictionaryOfAttachments is similar to CVBufferGetAttachments, except that CVBufferGetAttachments returns a CFDictionary that may change if attachments are added later.
     * 
     *   @param      allocator  Allocator for the new dictionary; pass kCFAllocatorDefault or NULL to use the default allocator.
     *   @param      target  Target CMAttachmentBearer.
     *   @return     A CFDictionary with all buffer attachments identified by there keys. If no attachment is present, NULL is returned.  Returns NULL
     * for invalid attachment mode.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMCopyDictionaryOfAttachments(CFAllocatorRef allocator, ConstVoidPtr target,
            int attachmentMode);

    /**
     * [@function]   CMSetAttachments
     * 
     * Sets a set of attachments for a CMAttachmentBearer
     * 
     * CMSetAttachments is a convenience call that in turn calls CMSetAttachment for each key and value in the given dictionary. All key value pairs must be in the root level of the dictionary.  Given a CVBufferRef, CMSetAttachments is equivalent to CVBufferSetAttachments.
     * 
     * @param      target  Target CMAttachmentBearer.
     */
    @Generated
    @CFunction
    public static native void CMSetAttachments(ConstVoidPtr target, CFDictionaryRef theAttachments, int attachmentMode);

    /**
     * [@function]   CMPropagateAttachments
     * 
     * Copy all propagatable attachments from one buffer to another.
     * 
     * CMPropagateAttachments is a convenience call that copies all attachments with a mode of kCMAttachmentMode_ShouldPropagate from one
     *             buffer to another.  Given a CVBufferRef, CMPropagateAttachments is equivalent to CVBufferPropagateAttachments.
     * 
     * @param      source  CMAttachmentBearer to copy attachments from.
     * @param      destination  CMAttachmentBearer to copy attachments to.
     */
    @Generated
    @CFunction
    public static native void CMPropagateAttachments(ConstVoidPtr source, ConstVoidPtr destination);

    /**
     * [@function]	CMBlockBufferCreateEmpty
     * 
     * Creates an empty CMBlockBuffer
     * 
     * Creates an empty CMBlockBuffer, i.e. one which has no memory block nor reference to a CMBlockBuffer
     * 			supplying bytes to it. It is ready to be populated using CMBlockBufferAppendMemoryBlock()
     * 			and/or CMBlockBufferAppendBufferReference(). CMBlockBufferGetDataLength() will return zero for
     * 			an empty CMBlockBuffer and CMBlockBufferGetDataPointer() and CMBlockBufferAssureBufferMemory() will fail.
     * 			The memory for the CMBlockBuffer object will be allocated using the given allocator.
     * 			If NULL is passed for the allocator, the default allocator is used.
     * 
     * @param	structureAllocator	Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     * 							default allocator to be used.
     * @param	subBlockCapacity	Number of subBlocks the newBlockBuffer shall accommodate before expansion occurs.
     * 							A value of zero means "do the reasonable default"
     * @param	flags				Feature and control flags
     * @param	blockBufferOut		Receives newly-created empty CMBlockBuffer object with retain count of 1. Must not be  NULL.
     * 
     * @return	Returns kCMBlockBufferNoErr if successful.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateEmpty(CFAllocatorRef structureAllocator, int subBlockCapacity,
            int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMBlockBufferCreateWithMemoryBlock
     * 
     * Creates a new CMBlockBuffer backed by a memory block (or promise thereof).
     * 
     * Creates a new CMBlockBuffer backed by a memory block. The memory block may be statically allocated, dynamically allocated
     * using the given allocator (or customBlockSource) or not yet allocated. The returned CMBlockBuffer may be further expanded using
     * CMBlockBufferAppendMemoryBlock() and/or CMBlockBufferAppendBufferReference(). 
     * 
     * If the kCMBlockBufferAssureMemoryNowFlag is set in the flags parameter, the memory block is allocated immediately using the blockAllocator or
     * customBlockSource. 
     * 
     * @param	structureAllocator	Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     * 							default allocator to be used.
     * @param	memoryBlock			Block of memory to hold buffered data. If NULL, a memory block will be allocated when needed (via a call
     * 							to CMBlockBufferAssureBlockMemory()) using the provided blockAllocator or customBlockSource. If non-NULL,
     * 							the block will be used and will be deallocated when the new CMBlockBuffer is finalized (i.e. released for
     * 							the last time).
     * @param	blockLength			Overall length of the memory block in bytes. Must not be zero. This is the size of the
     * 							supplied memory block or the size to allocate if memoryBlock is NULL.
     * @param	blockAllocator		Allocator to be used for allocating the memoryBlock, if memoryBlock is NULL. If memoryBlock is non-NULL,
     * 							this allocator will be used to deallocate it if provided. Passing NULL will cause the default allocator
     * 							(as set at the time of the call) to be used. Pass kCFAllocatorNull if no deallocation is desired.
     * @param	customBlockSource	If non-NULL, it will be used for the allocation and freeing of the memory block (the blockAllocator
     * 							parameter is ignored). If provided, and the memoryBlock parameter is NULL, its Allocate() routine must
     * 							be non-NULL. Allocate will be called once, if successful, when the memoryBlock is allocated. Free() will
     * 							be called once when the CMBlockBuffer is disposed.
     * @param	offsetToData		Offset within the memoryBlock at which the CMBlockBuffer should refer to data.
     * @param	dataLength			Number of relevant data bytes, starting at offsetToData, within the memory block.
     * @param	flags				Feature and control flags
     * @param	blockBufferOut		Receives newly-created CMBlockBuffer object with a retain count of 1. Must not be  NULL.
     * 
     * @return	Returns kCMBlockBufferNoErr if successful.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithMemoryBlock(CFAllocatorRef structureAllocator, VoidPtr memoryBlock,
            @NUInt long blockLength, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMBlockBufferCreateWithBufferReference
     * 
     * Creates a new CMBlockBuffer that refers to another CMBlockBuffer.
     * 
     * Creates a new CMBlockBuffer that refers to (a possibly subset portion of) another CMBlockBuffer.
     * 			The returned CMBlockBuffer may be further expanded using CMBlockBufferAppendMemoryBlock() and/or CMBlockBufferAppendBufferReference(). 
     * 
     * @param	structureAllocator	Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     * 							default allocator to be used.
     * @param	bufferReference		CMBlockBuffer to refer to. This parameter must not be NULL. Unless the kCMBlockBufferPermitEmptyReferenceFlag
     * 							is passed, it must not be empty and it must have a data length at least large enough to supply the data subset
     * 							specified (i.e. offsetToData+dataLength bytes).
     * @param	offsetToData		Offset within the reference CMBlockBuffer at which the new CMBlockBuffer should refer to data.
     * @param	dataLength			Number of relevant data bytes, starting at offsetToData, within the target CMBlockBuffer.
     * @param	flags				Feature and control flags
     * @param	blockBufferOut		Receives newly-created CMBlockBuffer object with a retain count of 1. Must not be  NULL.
     * 
     * @return	Returns kCMBlockBufferNoErr if successful.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithBufferReference(CFAllocatorRef structureAllocator,
            CMBlockBufferRef bufferReference, @NUInt long offsetToData, @NUInt long dataLength, int flags,
            Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMBlockBufferCreateContiguous
     * 
     * Produces a CMBlockBuffer containing a contiguous copy of or reference to the data specified by the parameters.
     * 
     * Produces a CMBlockBuffer containing a contiguous copy of or reference to the data specified by the parameters.
     * 			The resulting new CMBlockBuffer may contain an allocated copy of the data, or may contain a contiguous CMBlockBuffer reference. 
     * 
     * 			If the kCMBlockBufferAlwaysCopyDataFlag is set in the flags parameter, the resulting CMBlockBuffer will contain an allocated
     * 			copy of the data rather than a reference to sourceBuffer.
     * 
     * @param	structureAllocator	Allocator to use for allocating the CMBlockBuffer object. NULL will cause the
     * 							default allocator to be used.
     * @param	sourceBuffer		CMBlockBuffer from which data will be copied or referenced. Must not be NULL nor empty,
     * @param	blockAllocator		Allocator to be used for allocating the memoryBlock if a contiguous copy of the data is to be made. Passing NULL will cause the default
     * 							allocator (as set at the time of the call) to be used.
     * @param	customBlockSource	If non-NULL, it will be used for the allocation and freeing of the memory block (the blockAllocator
     * 							parameter is ignored). If provided, and the memoryBlock parameter is NULL, its Allocate() routine must
     * 							be non-NULL. Allocate will be called once, if successful, when the memoryBlock is allocated. Free() will
     * 							be called once when the CMBlockBuffer is disposed.
     * @param	offsetToData		Offset within the source CMBlockBuffer at which the new CMBlockBuffer should obtain data.
     * @param	dataLength			Number of relevant data bytes, starting at offsetToData, within the source CMBlockBuffer. If zero, the
     * 							target buffer's total available dataLength (starting at offsetToData) will be referenced.
     * @param	flags				Feature and control flags
     * @param	blockBufferOut		Receives newly-created CMBlockBuffer object with a retain count of 1. Must not be  NULL.
     * 
     * @return	Returns kCMBlockBufferNoErr if successful
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateContiguous(CFAllocatorRef structureAllocator,
            CMBlockBufferRef sourceBuffer, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMBlockBufferGetTypeID
     * 
     * Obtains the CoreFoundation type ID for the CMBlockBuffer type.
     * 
     * Obtains the CoreFoundation type ID for the CMBlockBuffer type.
     * 
     * @return	Returns the CFTypeID corresponding to CMBlockBuffer.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetTypeID();

    /**
     * [@function]	CMBlockBufferAppendMemoryBlock
     * 
     * Adds a memoryBlock to an existing CMBlockBuffer.
     * 
     * Adds a memoryBlock to an existing CMBlockBuffer. The memory block may be statically allocated,
     * 			dynamically allocated using the given allocator or not yet allocated. The CMBlockBuffer's total
     * 			data length will be increased by the specified dataLength. 
     * 
     * 			If the kCMBlockBufferAssureMemoryNowFlag is set in the flags parameter, the memory block is
     * 			allocated immediately using the blockAllocator or customBlockSource. Note that append operations
     * 			are not thread safe, so care must be taken when appending to BlockBuffers that are used by multiple threads.
     * 
     * @param	theBuffer		CMBlockBuffer to which the new memoryBlock will be added. Must not be NULL
     * @param	memoryBlock		Block of memory to hold buffered data. If NULL, a memory block will be allocated when needed
     * 						(via a call to CMBlockBufferAssureBlockMemory()) using the provided blockAllocator or customBlockSource.
     * 						If non-NULL, the block will be used and will be deallocated when the CMBlockBuffer is finalized (i.e. released
     * 						for the last time).
     * @param	blockLength		Overall length of the memory block in bytes. Must not be zero. This is the size of the supplied
     * 						memory block or the size to allocate if memoryBlock is NULL.
     * @param	blockAllocator	Allocator to be used for allocating the memoryBlock, if memoryBlock is NULL. If memoryBlock is
     * 						non-NULL, this allocator will be used to deallocate it if provided. Passing NULL will cause
     * 						the default allocator (as set at the time of the call) to be used. Pass kCFAllocatorNull if no
     * 						deallocation is desired.
     * @param	customBlockSource	If non-NULL, it will be used for the allocation and freeing of the memory block (the blockAllocator
     * 							parameter is ignored). If provided, and the memoryBlock parameter is NULL, its Allocate() routine must
     * 							be non-NULL. Allocate will be called once, if successful, when the memoryBlock is allocated. Free() will
     * 							be called once when the CMBlockBuffer is disposed.
     * @param	offsetToData	Offset within the memoryBlock at which the CMBlockBuffer should refer to data.
     * @param	dataLength		Number of relevant data bytes, starting at offsetToData, within the memory block.
     * @param	flags			Feature and control flags
     * 
     * @return	Returns kCMBlockBufferNoErr if successful.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAppendMemoryBlock(CMBlockBufferRef theBuffer, VoidPtr memoryBlock,
            @NUInt long blockLength, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags);

    /**
     * [@function]	CMBlockBufferAppendBufferReference
     * 
     * Adds a CMBlockBuffer reference to an existing CMBlockBuffer.
     * 
     * Adds a buffer reference to (a possibly subset portion of) another CMBlockBuffer to an existing CMBlockBuffer.
     * 			The CMBlockBuffer's total data length will be increased by the specified dataLength. Note that append operations
     * 			are not thread safe, so care must be taken when appending to BlockBuffers that are used by multiple threads.
     * 
     * @param	theBuffer		CMBlockBuffer to which the new CMBlockBuffer reference will be added. Must not be NULL
     * @param	targetBBuf		CMBlockBuffer to refer to. This parameter must not be NULL. Unless the kCMBlockBufferPermitEmptyReferenceFlag
     * 						is passed, it must not be empty and it must have a data length at least large enough to supply the data subset
     * 						specified (i.e. offsetToData+dataLength bytes).
     * @param	offsetToData	Offset within the target CMBlockBuffer at which the CMBlockBuffer should refer to data.
     * @param	dataLength		Number of relevant data bytes, starting at offsetToData, within the target CMBlockBuffer. If zero, the target
     * 						buffer's total available dataLength (starting at offsetToData) will be referenced.
     * @param	flags			Feature and control flags
     * 
     * @return	Returns kCMBlockBufferNoErr if successful.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAppendBufferReference(CMBlockBufferRef theBuffer, CMBlockBufferRef targetBBuf,
            @NUInt long offsetToData, @NUInt long dataLength, int flags);

    /**
     * [@function]	CMBlockBufferAssureBlockMemory
     * 
     * Assures all memory blocks in a CMBlockBuffer are allocated.
     * 
     * Traverses the possibly complex CMBlockBuffer, allocating the memory for any constituent
     * 			memory blocks that are not yet allocated.
     * 
     * @param	theBuffer		CMBlockBuffer to operate on. Must not be NULL
     * 
     * @return	Returns kCMBlockBufferNoErr if successful.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAssureBlockMemory(CMBlockBufferRef theBuffer);

    /**
     * [@function]	CMBlockBufferAccessDataBytes
     * 
     * Accesses potentially noncontiguous data in a CMBlockBuffer.
     * 
     * Used for accessing potentially noncontiguous data, this routine will return a pointer directly
     * 			into the given CMBlockBuffer if possible, otherwise the data will be assembled and copied into the
     * 			given temporary block and its pointer will be returned. 
     * 
     * @param	theBuffer			CMBlockBuffer to operate on. Must not be NULL
     * @param	offset				Offset within the CMBlockBuffer's offset range.
     * @param	length				Desired number of bytes to access at offset
     * @param	temporaryBlock		A piece of memory, assumed to be at least length bytes in size. Must not be NULL
     * @param	returnedPointerOut	Receives NULL if the desired amount of data could not be accessed at the given offset.
     * 							Receives non-NULL if it could. The value returned will either be a direct pointer into
     * 							the CMBlockBuffer or temporaryBlock Must not be NULL.
     * 
     * @return	Returns kCMBlockBufferNoErr if the desired amount of data could be accessed at the given offset.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAccessDataBytes(CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length, VoidPtr temporaryBlock, Ptr<BytePtr> returnedPointerOut);

    /**
     * [@function]	CMBlockBufferCopyDataBytes
     * 
     * Copies bytes from a CMBlockBuffer into a provided memory area.
     * 
     * This function is used to copy bytes out of a CMBlockBuffer into a provided piece of memory.
     * 			It deals with the possibility of the desired range of data being noncontiguous. The function
     * 			assumes that the memory at the destination is sufficient to hold the data. If length bytes
     * 			of data are not available in the CMBlockBuffer, an error is returned and the contents of the
     * 			destination are undefined. 
     * 
     * @param	theSourceBuffer	The buffer from which data will be  copied into the destination
     * @param	offsetToData	Offset within the source CMBlockBuffer at which the copy should begin.
     * @param	dataLength		Number of bytes to copy, starting at offsetToData, within the source CMBlockBuffer. Must not be zero.
     * @param	destination		Memory into which the data should be copied.
     * 
     * @return	Returns kCMBlockBufferNoErr if the copy succeeded, returns an error otherwise.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCopyDataBytes(CMBlockBufferRef theSourceBuffer, @NUInt long offsetToData,
            @NUInt long dataLength, VoidPtr destination);

    /**
     * [@function]	CMBlockBufferReplaceDataBytes
     * 
     * Copies bytes from a given memory block into a CMBlockBuffer, replacing bytes in the underlying data blocks
     * 
     * This function is used to replace bytes in a CMBlockBuffer's memory blocks with those from a provided piece of memory.
     * 			It deals with the possibility of the destination range of data being noncontiguous. CMBlockBufferAssureBlockMemory() is
     * 			called on the given CMBlockBuffer. If desired range is subsequently not accessible in the CMBlockBuffer, an error is returned
     * 			and the contents of the CMBlockBuffer are untouched. 
     * 
     * @param	sourceBytes				Memory block from which bytes are copied into the CMBlockBuffer
     * @param	destinationBuffer		CMBlockBuffer whose range of bytes will be replaced by the sourceBytes.
     * @param	offsetIntoDestination	Offset within the destination CMBlockBuffer at which replacement should begin.
     * @param	dataLength				Number of bytes to be replaced, starting at offsetIntoDestination, in the destinationBuffer.
     * 
     * @return	Returns kCMBlockBufferNoErr if the replacement succeeded, returns an error otherwise.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferReplaceDataBytes(ConstVoidPtr sourceBytes, CMBlockBufferRef destinationBuffer,
            @NUInt long offsetIntoDestination, @NUInt long dataLength);

    /**
     * [@function]	CMBlockBufferFillDataBytes
     * 
     * Fills a CMBlockBuffer with a given byte value, replacing bytes in the underlying data blocks
     * 
     * This function is used to fill bytes in a CMBlockBuffer's memory blocks with a given byte value.
     * 			It deals with the possibility of the destination range of data being noncontiguous. CMBlockBufferAssureBlockMemory() is
     * 			called on the given CMBlockBuffer. If desired range is subsequently not accessible in the CMBlockBuffer, an error is returned
     * 			and the contents of the CMBlockBuffer are untouched. 
     * 
     * @param	fillByte				The value with which to fill the specified data range
     * @param	destinationBuffer		CMBlockBuffer whose range of bytes will be filled.
     * @param	offsetIntoDestination	Offset within the destination CMBlockBuffer at which filling should begin.
     * @param	dataLength				Number of bytes to be filled, starting at offsetIntoDestination, in the destinationBuffer. If zero, the
     * 								destinationBuffer's total available dataLength (starting at offsetToData) will be filled.
     * 
     * @return	Returns kCMBlockBufferNoErr if the fill succeeded, returns an error otherwise.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferFillDataBytes(byte fillByte, CMBlockBufferRef destinationBuffer,
            @NUInt long offsetIntoDestination, @NUInt long dataLength);

    /**
     * [@function]	CMBlockBufferGetDataPointer
     * 
     * Gains access to the data represented by a CMBlockBuffer.
     * 
     * Gains access to the data represented by a CMBlockBuffer. A pointer into a memory block is returned
     * 			which corresponds to the offset within the CMBlockBuffer. The number of bytes addressable at the
     * 			pointer can also be returned. This length-at-offset may be smaller than the number of bytes actually
     * 			available starting at the offset if the dataLength of the CMBlockBuffer is covered by multiple memory
     * 			blocks (a noncontiguous CMBlockBuffer). The data pointer returned will remain valid as long as the
     * 			original CMBlockBuffer is referenced - once the CMBlockBuffer is released for the last time, any pointers
     * 			into it will be invalid. 
     * 
     * @param	theBuffer			CMBlockBuffer to operate on. Must not be NULL
     * @param	offset				Offset within the buffer's offset range.
     * @param	lengthAtOffsetOut	On return, contains the amount of data available at the specified offset. May be NULL.
     * @param	totalLengthOut		On return, contains the block buffer's total data length (from offset 0). May be NULL.
     * 							The caller can compare (offset+lengthAtOffset) with totalLength to determine whether
     * 							the entire CMBlockBuffer has been referenced and whether it is possible to access the CMBlockBuffer's
     * 							data with a contiguous reference.
     * @param	dataPointerOut		On return, contains a pointer to the data byte at the specified offset; lengthAtOffset bytes are
     * 						available at this address. May be NULL.
     * 
     * @return	Returns kCMBlockBufferNoErr if data was accessible at the specified offset within the given CMBlockBuffer, false otherwise.
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferGetDataPointer(CMBlockBufferRef theBuffer, @NUInt long offset,
            NUIntPtr lengthAtOffsetOut, NUIntPtr totalLengthOut, Ptr<BytePtr> dataPointerOut);

    /**
     * [@function]	CMBlockBufferGetDataLength
     * 
     * Obtains the total data length reachable via a CMBlockBuffer.
     * 
     * Obtains the total data length reachable via a CMBlockBuffer. This total is the sum of the dataLengths
     * 			of the CMBlockBuffer's memoryBlocks and buffer references. Note that the dataLengths are
     * 			the _portions_ of those constituents that this CMBlockBuffer subscribes to. This CMBlockBuffer presents a
     * 			contiguous range of offsets from zero to its totalDataLength as returned by this routine.
     * 
     * @param	theBuffer		CMBlockBuffer to examine.
     * 
     * @return	Returns the total data length available via this CMBlockBuffer, or zero if it is empty, NULL, or somehow invalid.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetDataLength(CMBlockBufferRef theBuffer);

    /**
     * [@function]	CMBlockBufferIsRangeContiguous
     * 
     * Determines whether the specified range within the given CMBlockBuffer is contiguous.
     * 
     * Determines whether the specified range within the given CMBlockBuffer is contiguous. if CMBlockBufferGetDataPointer()
     * 			were to be called with the same parameters, the returned pointer would address the desired number of bytes.
     * 
     * @param	theBuffer		CMBlockBuffer to examine. Must not be NULL
     * @param	offset			Offset within the buffer's offset range.
     * @param	length			Desired number of bytes to access at offset. If zero, the number of bytes available at offset
     * 						(dataLength – offset), contiguous or not, is used.
     * 
     * @return	Returns true if the specified range is contiguous within the CMBlockBuffer, false otherwise. Also returns false if the
     * 		CMBlockBuffer is NULL or empty.
     */
    @Generated
    @CFunction
    public static native byte CMBlockBufferIsRangeContiguous(CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length);

    /**
     * [@function]	CMBlockBufferIsEmpty
     * 
     * Indicates whether the given CMBlockBuffer is empty.
     * 
     * Indicates whether the given CMBlockBuffer is empty, i.e., devoid of any memoryBlocks or CMBlockBuffer references.
     * 			Note that a CMBlockBuffer containing a not-yet allocated memoryBlock is not considered empty.
     * 
     * @param	theBuffer		CMBlockBuffer to examine. Must not be NULL
     * 
     * @return	Returns the result of the emptiness test. Will return false if the CMBlockBuffer is NULL.
     */
    @Generated
    @CFunction
    public static native byte CMBlockBufferIsEmpty(CMBlockBufferRef theBuffer);

    /**
     * [@function]	CMFormatDescriptionCreate
     * 
     * Creates a generic CMFormatDescription object.
     * 
     * Use this call to create any CMFormatDescription that is composed solely of extensions, and for which
     * 			CFEqual() of a the extensions dictionaries is a valid test for Format Description equality.  Note that
     * 			for some media types using this routine may result in creating a format description that is not fully
     * 			specified for the purpose of media processing. Whenever possible, use media-specific format description
     * 			creations routines such as CMVideoFormatDescriptionCreate, CMAudioFormatDescriptionCreate, etc.
     * 
     *    @return     A new CMFormatDescription object.
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionCreate(CFAllocatorRef allocator, int mediaType, int mediaSubType,
            CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMFormatDescriptionGetTypeID
     * 
     * Returns the CFTypeID of CMFormatDescription objects.
     * 
     * You can check if a CFTypeRef object is actually a CMFormatDescription
     * 			by comparing CFGetTypeID(object) with CMFormatDescriptionGetTypeID().
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMFormatDescriptionGetTypeID();

    /**
     * [@function]	CMFormatDescriptionEqual
     * 
     * Compares two CMFormatDescription objects for equality.
     * 
     * This calls CFEqual on the provided CMFormatDescription objects.
     *                In contrast to the CF call it is NULL safe.
     */
    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqual(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef otherFormatDescription);

    /**
     * [@function]	CMFormatDescriptionEqualIgnoringExtensionKeys
     * 
     * Compares two CMFormatDescription objects for equality, ignoring differences in specified lists of format description extension keys and sample description extension keys.
     * 
     * 	This function is NULL safe.
     * 	If any keys are passed, kCMFormatDescriptionExtension_VerbatimSampleDescription
     * 	and kCMFormatDescriptionExtension_VerbatimISOSampleEntry will also be automatically
     * 	ignored for the purpose of comparison.
     * 
     * @param formatDescriptionExtensionKeysToIgnore
     * 	Either a single format description extension key (CFString) 
     * 	or a CFArray of such keys.  
     * @param sampleDescriptionExtensionAtomKeysToIgnore
     * 	Either a single sample description extension atom key (four-character CFString) 
     * 	or a CFArray of such keys.  
     * 	See kCMFormatDescriptionExtension_SampleDescriptionExtensionAtoms.
     */
    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqualIgnoringExtensionKeys(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef otherFormatDescription, ConstVoidPtr formatDescriptionExtensionKeysToIgnore,
            ConstVoidPtr sampleDescriptionExtensionAtomKeysToIgnore);

    /**
     * [@function]	CMFormatDescriptionGetMediaType
     * 
     * Returns the media type of a CMFormatDescription.
     * 
     * For example, returns kCMMediaType_Audio for a description of an audio stream.
     * 
     * @return		The media type of the CMFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaType(CMFormatDescriptionRef desc);

    /**
     * [@function]	CMFormatDescriptionGetMediaSubType
     * 
     * Returns the media subtype of a CMFormatDescription.
     * 
     * The media subtype is defined in a media-specific way.
     * 			For audio streams, the media subtype is the asbd.mFormatID.
     * 			For video streams, the media subtype is the video codec type. 
     * 			For muxed streams, it is the format of the muxed stream.
     * 			For example, 'aac ' is returned for a description of an AAC audio
     * 			stream, 'avc1' is returned for a description of an H.264 video
     * 			stream, and 'mp2t' is returned for a description of an MPEG-2
     * 			transport (muxed) stream.  If a particular type of media stream
     * 			does not have subtypes, this API may return 0.
     * 
     * @return		The media subtype of the CMFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaSubType(CMFormatDescriptionRef desc);

    /**
     * [@function]	CMFormatDescriptionGetExtensions
     * 
     * Returns an immutable dictionary containing all the extensions of a CMFormatDescription.
     * 
     * If there are no extensions, NULL is returned. Extensions dictionaries are valid property list
     * 			objects.  This means that dictionary keys are all CFStrings, and the values are all either
     * 			CFNumber, CFString, CFBoolean, CFArray, CFDictionary, CFDate, or CFData. The returned
     * 			dictionary is not retained by this call, so clients are required to retain it if they
     * 			need to keep it longer.
     * 
     * @return		An immutable dictionary containing all the extensions of the CMFormatDescription.  May be NULL.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMFormatDescriptionGetExtensions(CMFormatDescriptionRef desc);

    /**
     * [@function]	CMFormatDescriptionGetExtension
     * 
     * Returns the specified extension of a CMFormatDescription.
     * 
     * If the named extension does not exist, NULL is returned. The extension is always a valid
     * 			property list object. This means that it will be either a CFNumber, CFString, CFBoolean,
     * 			CFArray, CFDictionary, CFDate, or CFData. If it is a CFDictionary, the keys will all be
     * 			CFStrings. The returned extension is not retained by this call, so it is only valid as
     * 			long as the CMFormatDescription is valid. Clients are required to retain it if they
     * 			need to keep it longer.
     * 
     * @return		The specified extension of the CMFormatDescription.  May be NULL.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMFormatDescriptionGetExtension(CMFormatDescriptionRef desc,
            CFStringRef extensionKey);

    /**
     * [@function]	CMAudioFormatDescriptionCreate
     * 
     * Creates a format description for an audio media stream.
     * 
     * The ASBD is required, the channel layout is optional, and the magic cookie is required
     * 			for some compression formats (and must be NULL for all others). The caller owns the
     * 			returned CMFormatDescription, and must release it when done with it.  The ASBD,
     * 			magic cookie, channel layout, and extensions are all copied (the extensions are
     * 			deep-copied).  The caller can deallocate them or re-use them after making this call.
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription asbd,
            @NUInt long layoutSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout layout,
            @NUInt long magicCookieSize, ConstVoidPtr magicCookie, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMAudioFormatDescriptionGetStreamBasicDescription
     * 
     * Returns a read-only pointer to the AudioStreamBasicDescription inside an audio CMFormatDescription.
     * 
     * See CoreAudioTypes.h for the definition of AudioStreamBasicDescription.
     * 			This API is specific to audio format descriptions, and will return NULL if
     * 			used with a non-audio format descriptions.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioStreamBasicDescription CMAudioFormatDescriptionGetStreamBasicDescription(
            CMFormatDescriptionRef desc);

    /**
     * [@function]	CMAudioFormatDescriptionGetMagicCookie
     * 
     * Returns a read-only pointer to (and size of) the magic cookie inside an audio CMFormatDescription.
     * 
     * The magic cookie is a completely opaque piece of data, written and read only by
     * 			the codec itself. A magic cookie is only present for codecs that require it;
     * 			this API will return NULL if one does not exist. This API is specific to audio
     * 			format descriptions, and will return NULL if called with a non-audio format
     * 			description.
     * 
     * @return		A read-only pointer to the magic cookie inside the audio format description.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMAudioFormatDescriptionGetMagicCookie(CMFormatDescriptionRef desc,
            NUIntPtr sizeOut);

    /**
     * [@function]	CMAudioFormatDescriptionGetChannelLayout
     * 
     * Returns a read-only pointer to (and size of) the AudioChannelLayout inside an audio CMFormatDescription.
     * 
     * See CoreAudioTypes.h for the definition of AudioChannelLayout.
     * 			AudioChannelLayouts are optional; this API will return NULL if
     * 			one does not exist. This API is specific to audio format
     * 			descriptions, and will return NULL if called with a non-audio
     * 			format description.
     * 
     * @return		A read-only pointer to the AudioChannelLayout inside the audio format description.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioChannelLayout CMAudioFormatDescriptionGetChannelLayout(CMFormatDescriptionRef desc,
            NUIntPtr sizeOut);

    /**
     * [@function]	CMAudioFormatDescriptionGetFormatList
     * 
     * Returns a read-only pointer to (and size of) the array of AudioFormatListItem structs inside an audio CMFormatDescription.
     * 
     * This property is analogous to kAudioFormatProperty_FormatList (See AudioFormat.h) and follows
     *                its conventions.  Namely, formats are returned in order from the most to least 'rich', with 
     *                channel count taking the highest precedence followed by sample rate.
     * 			This API is specific to audio format descriptions, and will return NULL if called with a non-audio
     * 			format description.
     * 
     * @return		A read-only pointer to the array of AudioFormatListItem structs inside the audio format description.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetFormatList(CMFormatDescriptionRef desc,
            NUIntPtr sizeOut);

    /**
     * [@function]	CMAudioFormatDescriptionGetRichestDecodableFormat
     * 
     * Returns a read-only pointer to the appropriate AudioFormatListItem inside an audio CMFormatDescription.
     * 
     * This property performs validation on the formats represented by the audio in the description.  It
     *                finds the first AudioFormatListItem for which the current system has a valid decoder.
     * 			This API is specific to audio format descriptions, and will return NULL if called with a non-audio
     * 			format description.  It may also return NULL if there is no suitable decoder available on the
     *                current system for this audio format.
     * 
     * @return		A read-only pointer to the appropriate AudioFormatListItem inside the audio format description.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetRichestDecodableFormat(
            CMFormatDescriptionRef desc);

    /**
     * [@function]	CMAudioFormatDescriptionGetMostCompatibleFormat
     * 
     * Returns a read-only pointer to the appropriate AudioFormatListItem inside an audio CMFormatDescription.
     * 
     * This property returns a pointer to the last AudioFormatListItem in the kAudioFormatProperty_FormatList
     *                (see AudioFormat.h).  This API is specific to audio format descriptions, and will return NULL if called 
     *                with a non-audio format description.
     * 
     * @return		A read-only pointer to the appropriate AudioFormatListItem inside the audio format description.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetMostCompatibleFormat(
            CMFormatDescriptionRef desc);

    /**
     * [@function]	CMAudioFormatDescriptionCreateSummary
     * 
     * Creates a summary audio format description from an array of audio format descriptions.
     * 
     * 	The summary format description will be canonical LPCM and deep enough in 
     * 	sample rate, channel layout and channel count to sensibly contain the result of decoding 
     * 	and mixing the constituent format descriptions.
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateSummary(CFAllocatorRef allocator,
            CFArrayRef formatDescriptionArray, int flags, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMAudioFormatDescriptionEqual
     * 
     * Evaluates equality for the specified parts of two audio format descriptions.
     * 
     * Bits in equalityMask specify the caller's interest in the equality of various parts of the descriptions.
     * 			Bits set and returned in equalityMaskOut represent the subset of those parts that are equal.
     * 			If there is any sort of error that prevents the comparison from occurring, false will be returned, and
     * 			all bits in equalityMaskOut will be cleared. If you pass kCMAudioFormatDescriptionMask_All in equalityMask,
     * 			and NULL for equalityMaskOut, this API is equivalent to CFEqual(desc1, desc2).
     * 
     * @return		The result of the comparison.  True if all parts in which the caller is interested are equal.
     * 			False if any of the parts in which the caller is interested are not equal.
     */
    @Generated
    @CFunction
    public static native byte CMAudioFormatDescriptionEqual(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef otherFormatDescription, int equalityMask, IntPtr equalityMaskOut);

    /**
     * [@function]	CMVideoFormatDescriptionCreate
     * 
     * Creates a format description for a video media stream.
     * 
     * The caller owns the returned CMFormatDescription, and must release it when done with it. All input parameters
     * 			are copied (the extensions are deep-copied).  The caller can deallocate them or re-use them after making this call.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreate(CFAllocatorRef allocator, int codecType, int width,
            int height, CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMVideoFormatDescriptionCreateForImageBuffer
     * 
     * Creates a format description for a video media stream contained in CVImageBuffers of the type provided.
     * 
     * This convenience function is equivalent to:
     * 
     * 			CMVideoFormatDescriptionCreate( allocator,
     * 											 ( CVPixelBufferGetTypeID() == CFGetTypeID( imageBuffer ) ? CVPixelBufferGetPixelFormatType( imageBuffer ) : 0,
     * 											 width of image,
     * 											 height of image,
     * 											 extensions );
     * 
     * 			where extensions is a CFDictionary of attachments to image buffer with keys specified by 
     * 			CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers, and also 
     * 			kCMFormatDescriptionExtension_BytesPerRow if applicable.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateForImageBuffer(CFAllocatorRef allocator,
            CVBufferRef imageBuffer, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMVideoFormatDescriptionCreateFromH264ParameterSets
     * 
     * Creates a format description for a video media stream described by H.264 parameter set NAL units.
     * 
     * This function parses the dimensions provided by the parameter sets and creates a format description suitable for a raw H.264 stream.
     * 			The parameter sets' data can come from raw NAL units and must have any emulation prevention bytes needed.
     * 			The supported NAL unit types to be included in the format description are 7 (sequence parameter set), 8 (picture parameter set) and 13 (sequence parameter set extension). At least one sequence parameter set and one picture parameter set must be provided.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromH264ParameterSets(CFAllocatorRef allocator,
            @NUInt long parameterSetCount,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointers,
            ConstNUIntPtr parameterSetSizes, int NALUnitHeaderLength, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMVideoFormatDescriptionGetH264ParameterSetAtIndex
     * 
     * Returns a parameter set contained in a H.264 format description.
     * 
     * This function parses the AVC decoder configuration record contained in a H.264 video format description and returns the NAL unit at the given index from it.  These NAL units are typically parameter sets (e.g. SPS, PPS), but may contain others as specified by ISO/IEC 14496-15 (e.g. user-data SEI).
     * 			Both parameterSetPointerOut and parameterSetSizeOut may be NULL, parameterSetCountOut will return the total number of parameter set NAL units contained in the AVC decoder configuration record.
     * 			The parameter set NAL units returned will already have any emulation prevention bytes needed.
     * 			The pointer returned in parameterSetPointerOut points to internal memory of videoDesc, and may only be accessed as long as a retain on videoDesc is held.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionGetH264ParameterSetAtIndex(CMFormatDescriptionRef videoDesc,
            @NUInt long parameterSetIndex,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointerOut,
            NUIntPtr parameterSetSizeOut, NUIntPtr parameterSetCountOut, IntPtr NALUnitHeaderLengthOut);

    /**
     * [@function]	CMVideoFormatDescriptionGetDimensions
     * 
     * Returns the dimensions (in encoded pixels)
     * 
     * This does not take into account pixel aspect ratio or clean aperture tags.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMVideoDimensions CMVideoFormatDescriptionGetDimensions(CMFormatDescriptionRef videoDesc);

    /**
     * [@function]	CMVideoFormatDescriptionGetPresentationDimensions
     * 
     * Returns the dimensions, adjusted to take pixel aspect ratio and/or clean aperture into account.
     * 
     * 	Pixel aspect ratio is used to adjust the width, leaving the height alone.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CMVideoFormatDescriptionGetPresentationDimensions(CMFormatDescriptionRef videoDesc,
            byte usePixelAspectRatio, byte useCleanAperture);

    /**
     * [@function]	CMVideoFormatDescriptionGetCleanAperture
     * 
     * Returns the clean aperture.
     * 
     * 	The clean aperture is a rectangle that defines the portion of the encoded pixel dimensions
     * 	that represents image data valid for display.  
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CMVideoFormatDescriptionGetCleanAperture(CMFormatDescriptionRef videoDesc,
            byte originIsAtTopLeft);

    /**
     * [@function]	CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers
     * 
     * Returns an array of the keys that are used both as CMVideoFormatDescription extensions
     * 			and CVImageBuffer attachments and attributes.
     * 
     * When specifying a CMFormatDescription for a CMSampleBuffer, the format description must
     * 			be consistent with formatting information attached to the CVImageBuffer. The width, height,
     * 			and codecType must match (for CVPixelBuffers the codec type is given by
     * 			CVPixelBufferGetPixelFormatType(pixelBuffer); for other CVImageBuffers, the codecType must be 0).
     * 			The format description extensions must match the image buffer attachments for all the keys in the
     * 			list returned by this function (if absent in either they must be absent in both).
     * 
     * 			Currently, the list is:
     * 
     * 			kCMFormatDescriptionExtension_CleanAperture
     * 			kCMFormatDescriptionExtension_FieldCount
     * 			kCMFormatDescriptionExtension_FieldDetail
     * 			kCMFormatDescriptionExtension_PixelAspectRatio
     * 			kCMFormatDescriptionExtension_ColorPrimaries
     * 			kCMFormatDescriptionExtension_TransferFunction
     * 			kCMFormatDescriptionExtension_GammaLevel
     * 			kCMFormatDescriptionExtension_YCbCrMatrix
     * 			kCMFormatDescriptionExtension_ICCProfile
     * 			kCMFormatDescriptionExtension_ChromaLocationTopField
     * 			kCMFormatDescriptionExtension_ChromaLocationBottomField
     * 			kCMFormatDescriptionExtension_MasteringDisplayColorVolume
     * 			kCMFormatDescriptionExtension_ContentLightLevelInfo
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers();

    /**
     * [@function]	CMVideoFormatDescriptionMatchesImageBuffer
     * 
     * Checks to see if a given format description matches an image buffer.
     * 
     * This function uses the keys returned by CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers
     * 			to compares the extensions of the given format description to the attachments of the
     * 			given image buffer (if an attachment is absent in either it must be absent in both).
     * 			It also checks kCMFormatDescriptionExtension_BytesPerRow against CVPixelBufferGetBytesPerRow, if applicable.
     */
    @Generated
    @CFunction
    public static native byte CMVideoFormatDescriptionMatchesImageBuffer(CMFormatDescriptionRef desc,
            CVBufferRef imageBuffer);

    /**
     * [@function]	CMMuxedFormatDescriptionCreate
     * 
     * Creates a format description for a muxed media stream.
     * 
     * A muxed format description does not know what the formats are of the substreams within the muxed stream.
     * 			That information will only be discoverable by the demuxer software (or other software which understands
     * 			the details of the muxed bitstream) which will need to produce separate format descriptions for each of
     * 			its output streams. The caller owns the returned CMFormatDescription, and must release it when done
     * 			with it. All input parameters are copied (the extensions are deep-copied).  The caller can deallocate
     * 			them or re-use them after making this call.
     */
    @Generated
    @CFunction
    public static native int CMMuxedFormatDescriptionCreate(CFAllocatorRef allocator, int muxType,
            CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMTextFormatDescriptionGetDisplayFlags
     * 
     * Returns the displayFlags.
     * 
     * 	These are the flags that control how the text appears. The function can return kCMFormatDescriptionError_ValueNotAvailable for formats without display flags.
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDisplayFlags(CMFormatDescriptionRef desc,
            IntPtr displayFlagsOut);

    /**
     * [@function]	CMTextFormatDescriptionGetJustification
     * 
     * Returns horizontal and vertical justification.
     * 
     * 	Values are kCMTextJustification_* constants. The function returns kCMFormatDescriptionError_ValueNotAvailable for format descriptions that do not carry text justification.
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetJustification(CMFormatDescriptionRef desc,
            BytePtr horizontaJustificationlOut, BytePtr verticalJustificationOut);

    /**
     * [@function]	CMTextFormatDescriptionGetDefaultTextBox
     * 
     * Returns the default text box.
     * 
     * 	Within a text track, text is rendered within a text box.  There is a default text box set, which can be over-ridden by a sample. The function can return kCMFormatDescriptionError_ValueNotAvailable for format descriptions that do not carry a default text box.
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDefaultTextBox(CMFormatDescriptionRef desc,
            byte originIsAtTopLeft, @NFloat double heightOfTextTrack,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect defaultTextBoxOut);

    /**
     * [@function]	CMTextFormatDescriptionGetFontName
     * 
     * Returns the font name for a local font ID.
     * 
     * 	Some format descriptions carry a mapping from local font IDs to font names. The function returns kCMFormatDescriptionError_ValueNotAvailable for format descriptions that do not carry such a font mapping table.
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetFontName(CMFormatDescriptionRef desc, char localFontID,
            Ptr<CFStringRef> fontNameOut);

    /**
     * [@function]	CMTimeCodeFormatDescriptionCreate
     * 
     * Creates a format description for a timecode media.
     * 
     * The caller owns the returned CMFormatDescription, and must release it when done with it. All input parameters
     * 			are copied (the extensions are deep-copied).  The caller can deallocate them or re-use them after making this call.
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreate(CFAllocatorRef allocator, int timeCodeFormatType,
            @ByValue CMTime frameDuration, int frameQuanta, int flags, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMTimeCodeFormatDescriptionGetFrameDuration
     * 
     * Returns the duration of each frame (eg. 100/2997)
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeCodeFormatDescriptionGetFrameDuration(
            CMFormatDescriptionRef timeCodeFormatDescription);

    /**
     * [@function]	CMTimeCodeFormatDescriptionGetFrameQuanta
     * 
     * Returns the frames/sec for timecode (eg. 30) OR frames/tick for counter mode
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionGetFrameQuanta(
            CMFormatDescriptionRef timeCodeFormatDescription);

    /**
     * [@function]	CMTimeCodeFormatDescriptionGetTimeCodeFlags
     * 
     * Returns the flags for kCMTimeCodeFlag_DropFrame, kCMTimeCodeFlag_24HourMax, kCMTimeCodeFlag_NegTimesOK
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionGetTimeCodeFlags(CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithKeys(CFAllocatorRef allocator, int metadataType,
            CFArrayRef keys, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithMetadataSpecifications(CFAllocatorRef allocator,
            int metadataType, CFArrayRef metadataSpecifications, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithMetadataFormatDescriptionAndMetadataSpecifications(
            CFAllocatorRef allocator, CMFormatDescriptionRef sourceDescription, CFArrayRef metadataSpecifications,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateByMergingMetadataFormatDescriptions(
            CFAllocatorRef allocator, CMFormatDescriptionRef sourceDescription,
            CMFormatDescriptionRef otherSourceDescription, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native CFDictionaryRef CMMetadataFormatDescriptionGetKeyWithLocalID(CMFormatDescriptionRef desc,
            int localKeyID);

    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataFormatDescriptionGetIdentifiers(CMFormatDescriptionRef desc);

    /**
     * 	[@function]	CMSampleBufferCreate
     * 
     * Creates a CMSampleBuffer.
     * 
     * Array parameters (sampleSizeArray, sampleTimingArray) should have only one element if that same
     * 				element applies to all samples. All parameters are copied; on return, the caller can release them,
     * 				free them, reuse them or whatever.  On return, the caller owns the returned CMSampleBuffer, and
     * 				must release it when done with it.
     * 
     * 				Example of usage for in-display-order video frames:
     * <ul>				dataBuffer: contains 7 Motion JPEG frames
     * <li>				dataFormatDescription: describes Motion JPEG video
     * <li>				numSamples: 7
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {duration = 1001/30000, presentationTimeStamp = 0/30000, decodeTimeStamp = invalid }
     * <li>				numSampleSizeEntries: 7
     * <li>				sampleSizeArray: {105840, 104456, 103464, 116460, 100412, 94808, 120400}
     * </ul>
     * 				Example of usage for out-of-display-order video frames:
     * <ul>				dataBuffer: contains 6 H.264 frames in decode order (P2,B0,B1,I5,B3,B4)
     * <li>				dataFormatDescription: describes H.264 video
     * <li>				numSamples: 6
     * <li>				numSampleTimingEntries: 6
     * <li>				sampleTimingArray: 6 entries = {
     * <ul>					{duration = 1001/30000, presentationTimeStamp = 12012/30000, decodeTimeStamp = 10010/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 10010/30000, decodeTimeStamp = 11011/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 11011/30000, decodeTimeStamp = 12012/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 15015/30000, decodeTimeStamp = 13013/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 13013/30000, decodeTimeStamp = 14014/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 14014/30000, decodeTimeStamp = 15015/30000}}
     * </ul>
     * <li>				numSampleSizeEntries: 6
     * <li>				sampleSizeArray: {10580, 1234, 1364, 75660, 1012, 988}
     * </ul>
     * 				Example of usage for compressed audio:
     * <ul>				dataBuffer: contains 24 compressed AAC packets
     * <li>				dataFormatDescription: describes 44.1kHz AAC audio
     * <li>				numSamples: 24
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {
     * <ul>					{duration = 1024/44100, presentationTimeStamp = 0/44100, decodeTimeStamp = invalid }}
     * </ul>
     * <li>				numSampleSizeEntries: 24
     * <li>				sampleSizeArray:
     * <ul>					{191, 183, 208, 213, 202, 206, 209, 206, 204, 192, 202, 277,
     * <li>					 282, 240, 209, 194, 193, 197, 196, 198, 168, 199, 171, 194}
     * </ul>
     * </ul>
     * 				Example of usage for uncompressed interleaved audio:
     * <ul>				dataBuffer: contains 24000 uncompressed interleaved stereo frames, each containing 2 Float32s =
     * <ul>					{{L,R},
     * <li>					 {L,R},
     * <li>					 {L,R}, ...}
     * </ul>
     * <li>				dataFormatDescription: describes 48kHz Float32 interleaved audio
     * <li>				numSamples: 24000
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {
     * <ul>					{duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp = invalid }}
     * </ul>
     * <li>				numSampleSizeEntries: 1
     * <li>				sampleSizeArray: {8}
     * </ul>
     * 				Example of usage for uncompressed non-interleaved audio:
     * <ul>				dataBuffer: contains 24000 uncompressed non-interleaved stereo frames, each containing 2 (non-contiguous) Float32s =
     * <ul>					{{L,L,L,L,L,...},
     * <li>					 {R,R,R,R,R,...}}
     * </ul>
     * <li>				dataFormatDescription: describes 48kHz Float32 non-interleaved audio
     * <li>				numSamples: 24000
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp = invalid }
     * <li>				numSampleSizeEntries: 0
     * <li>				sampleSizeArray: NULL (because the samples are not contiguous)
     * </ul>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreate(CFAllocatorRef allocator, CMBlockBufferRef dataBuffer, byte dataReady,
            @FunctionPtr(name = "call_CMSampleBufferCreate") Function_CMSampleBufferCreate makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, ConstNUIntPtr sampleSizeArray, Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * 	[@function]	CMSampleBufferCreateReady
     * 
     * Creates a CMSampleBuffer.
     * 
     * Array parameters (sampleSizeArray, sampleTimingArray) should have only one element if that same
     * 				element applies to all samples. All parameters are copied; on return, the caller can release them,
     * 				free them, reuse them or whatever.  On return, the caller owns the returned CMSampleBuffer, and
     * 				must release it when done with it.
     * 				CMSampleBufferCreateReady is identical to CMSampleBufferCreate except that dataReady is always true,
     * 				and so no makeDataReadyCallback or refcon needs to be passed.
     * 
     * 				Example of usage for in-display-order video frames:
     * <ul>				dataBuffer: contains 7 Motion JPEG frames
     * <li>				dataFormatDescription: describes Motion JPEG video
     * <li>				numSamples: 7
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {duration = 1001/30000, presentationTimeStamp = 0/30000, decodeTimeStamp = invalid }
     * <li>				numSampleSizeEntries: 7
     * <li>				sampleSizeArray: {105840, 104456, 103464, 116460, 100412, 94808, 120400}
     * </ul>
     * 				Example of usage for out-of-display-order video frames:
     * <ul>				dataBuffer: contains 6 H.264 frames in decode order (P2,B0,B1,I5,B3,B4)
     * <li>				dataFormatDescription: describes H.264 video
     * <li>				numSamples: 6
     * <li>				numSampleTimingEntries: 6
     * <li>				sampleTimingArray: 6 entries = {
     * <ul>					{duration = 1001/30000, presentationTimeStamp = 12012/30000, decodeTimeStamp = 10010/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 10010/30000, decodeTimeStamp = 11011/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 11011/30000, decodeTimeStamp = 12012/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 15015/30000, decodeTimeStamp = 13013/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 13013/30000, decodeTimeStamp = 14014/30000},
     * <li>					{duration = 1001/30000, presentationTimeStamp = 14014/30000, decodeTimeStamp = 15015/30000}}
     * </ul>
     * <li>				numSampleSizeEntries: 6
     * <li>				sampleSizeArray: {10580, 1234, 1364, 75660, 1012, 988}
     * </ul>
     * 				Example of usage for compressed audio:
     * <ul>				dataBuffer: contains 24 compressed AAC packets
     * <li>				dataFormatDescription: describes 44.1kHz AAC audio
     * <li>				numSamples: 24
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {
     * <ul>					{duration = 1024/44100, presentationTimeStamp = 0/44100, decodeTimeStamp = invalid }}
     * </ul>
     * <li>				numSampleSizeEntries: 24
     * <li>				sampleSizeArray:
     * <ul>					{191, 183, 208, 213, 202, 206, 209, 206, 204, 192, 202, 277,
     * <li>					 282, 240, 209, 194, 193, 197, 196, 198, 168, 199, 171, 194}
     * </ul>
     * </ul>
     * 				Example of usage for uncompressed interleaved audio:
     * <ul>				dataBuffer: contains 24000 uncompressed interleaved stereo frames, each containing 2 Float32s =
     * <ul>					{{L,R},
     * <li>					 {L,R},
     * <li>					 {L,R}, ...}
     * </ul>
     * <li>				dataFormatDescription: describes 48kHz Float32 interleaved audio
     * <li>				numSamples: 24000
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {
     * <ul>					{duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp = invalid }}
     * </ul>
     * <li>				numSampleSizeEntries: 1
     * <li>				sampleSizeArray: {8}
     * </ul>
     * 				Example of usage for uncompressed non-interleaved audio:
     * <ul>				dataBuffer: contains 24000 uncompressed non-interleaved stereo frames, each containing 2 (non-contiguous) Float32s =
     * <ul>					{{L,L,L,L,L,...},
     * <li>					 {R,R,R,R,R,...}}
     * </ul>
     * <li>				dataFormatDescription: describes 48kHz Float32 non-interleaved audio
     * <li>				numSamples: 24000
     * <li>				numSampleTimingEntries: 1
     * <li>				sampleTimingArray: one entry = {duration = 1/48000, presentationTimeStamp = 0/48000, decodeTimeStamp = invalid }
     * <li>				numSampleSizeEntries: 0
     * <li>				sampleSizeArray: NULL (because the samples are not contiguous)
     * </ul>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReady(CFAllocatorRef allocator, CMBlockBufferRef dataBuffer,
            CMFormatDescriptionRef formatDescription, @NInt long numSamples, @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, ConstNUIntPtr sampleSizeArray, Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMAudioSampleBufferCreateWithPacketDescriptions
     * 
     * Creates an CMSampleBuffer containing audio given packetDescriptions instead of sizing and timing info
     * 
     * Provides an optimization over CMSampleBufferCreate() when the caller already has packetDescriptions for
     * 			the audio data. This routine will use the packetDescriptions to create the sizing and timing arrays required
     * 			to make the sample buffer if necessary.
     */
    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateWithPacketDescriptions(CFAllocatorRef allocator,
            CMBlockBufferRef dataBuffer, byte dataReady,
            @FunctionPtr(name = "call_CMAudioSampleBufferCreateWithPacketDescriptions") Function_CMAudioSampleBufferCreateWithPacketDescriptions makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @ByValue CMTime presentationTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMAudioSampleBufferCreateReadyWithPacketDescriptions
     * 
     * Creates an CMSampleBuffer containing audio given packetDescriptions instead of sizing and timing info
     * 
     * Provides an optimization over CMSampleBufferCreate() when the caller already has packetDescriptions for
     * 			the audio data. This routine will use the packetDescriptions to create the sizing and timing arrays required
     * 			to make the sample buffer if necessary.
     * 			CMAudioSampleBufferCreateReadyWithPacketDescriptions is identical to CMAudioSampleBufferCreateWithPacketDescriptions 
     * 			except that dataReady is always true, and so no makeDataReadyCallback or refcon needs to be passed.
     */
    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateReadyWithPacketDescriptions(CFAllocatorRef allocator,
            CMBlockBufferRef dataBuffer, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @ByValue CMTime presentationTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMSampleBufferCreateForImageBuffer
     * 
     * Creates a CMSampleBuffer that contains a CVImageBuffer instead of a CMBlockBuffer.
     * 
     * Unlike a CMBlockBuffer which can reference many samples, a CVImageBuffer is defined to
     * 			reference only one sample;  therefore this routine has fewer parameters then
     * 			CMSampleBufferCreate.
     * 
     * 			Sample timing information, which is a vector for CMSampleBufferCreate,
     * 			consists of only one value for this routine.
     * 
     * 			The concept of sample size does not apply to CVImageBuffers.  As such, CMSampleBufferGetSampleSizeArray
     * 			will return kCMSampleBufferError_BufferHasNoSampleSizes, and CMSampleBufferGetSampleSize
     * 			will return 0.
     * 
     * 			Because CVImageBuffers hold visual data, the format description provided is a
     * 			CMVideoFormatDescription.  The format description must be consistent with the attributes
     * 			and formatting information attached to the CVImageBuffer. The width, height, and codecType must
     * 			match (for CVPixelBuffers the codec type is given by CVPixelBufferGetPixelFormatType(pixelBuffer);
     * 			for other CVImageBuffers, the codecType must be 0). The format description extensions must
     * 			match the image buffer attachments for all the keys in the list returned by
     * 			CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers (if absent in either they
     * 			must be absent in both).
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateForImageBuffer(CFAllocatorRef allocator, CVBufferRef imageBuffer,
            byte dataReady,
            @FunctionPtr(name = "call_CMSampleBufferCreateForImageBuffer") Function_CMSampleBufferCreateForImageBuffer makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMSampleBufferCreateReadyWithImageBuffer
     * 
     * Creates a CMSampleBuffer that contains a CVImageBuffer instead of a CMBlockBuffer.
     * 
     * Unlike a CMBlockBuffer which can reference many samples, a CVImageBuffer is defined to
     * 			reference only one sample;  therefore this routine has fewer parameters then
     * 			CMSampleBufferCreate.
     * 
     * 			Sample timing information, which is a vector for CMSampleBufferCreate,
     * 			consists of only one value for this routine.
     * 
     * 			The concept of sample size does not apply to CVImageBuffers.  As such, CMSampleBufferGetSampleSizeArray
     * 			will return kCMSampleBufferError_BufferHasNoSampleSizes, and CMSampleBufferGetSampleSize
     * 			will return 0.
     * 
     * 			Because CVImageBuffers hold visual data, the format description provided is a
     * 			CMVideoFormatDescription.  The format description must be consistent with the attributes
     * 			and formatting information attached to the CVImageBuffer. The width, height, and codecType must
     * 			match (for CVPixelBuffers the codec type is given by CVPixelBufferGetPixelFormatType(pixelBuffer);
     * 			for other CVImageBuffers, the codecType must be 0). The format description extensions must
     * 			match the image buffer attachments for all the keys in the list returned by
     * 			CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers (if absent in either they
     * 			must be absent in both).
     * 
     * 			CMSampleBufferCreateReadyWithImageBuffer is identical to CMSampleBufferCreateForImageBuffer except that 
     * 			dataReady is always true, and so no makeDataReadyCallback or refcon needs to be passed.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReadyWithImageBuffer(CFAllocatorRef allocator, CVBufferRef imageBuffer,
            CMFormatDescriptionRef formatDescription,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMSampleBufferCreateCopy
     * 
     * Creates a copy of a CMSampleBuffer.
     * 
     * The copy is shallow: scalar properties (sizes and timing) are copied directly,
     * 			the data buffer and format description are retained, and
     * 			the propogatable attachments are retained by the copy's dictionary.
     * 			If sbuf's data is not ready, the copy will be set to track its readiness.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopy(CFAllocatorRef allocator, CMSampleBufferRef sbuf,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMSampleBufferCreateCopyWithNewTiming
     * 
     * Creates a CMSampleBuffer with new timing information from another sample buffer.
     * 
     * This emulates CMSampleBufferCreateCopy, but changes the timing.
     * 			Array parameters (sampleTimingArray) should have only one element if that same
     * 			element applies to all samples. All parameters are copied; on return, the caller can release them,
     * 			free them, reuse them or whatever.  Any outputPresentationTimestamp that has been set on the original Buffer
     * 			will not be copied because it is no longer relevant.	On return, the caller owns the returned 
     * 			CMSampleBuffer, and must release it when done with it.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopyWithNewTiming(CFAllocatorRef allocator,
            CMSampleBufferRef originalSBuf, @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMSampleBufferCopySampleBufferForRange
     * 
     * Creates a CMSampleBuffer containing a range of samples from an existing CMSampleBuffer.
     * 
     * Samples containing non-interleaved audio are currently not supported.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCopySampleBufferForRange(CFAllocatorRef allocator, CMSampleBufferRef sbuf,
            @ByValue CFRange sampleRange, Ptr<CMSampleBufferRef> sampleBufferOut);

    /**
     * [@function]	CMSampleBufferGetTypeID
     * 
     * Returns the CFTypeID of CMSampleBuffer objects.
     * 
     * You can check if a CFTypeRef object is actually a CMSampleBuffer by comparing CFGetTypeID(object) with CMSampleBufferGetTypeID().
     * 
     * @return		CFTypeID of CMSampleBuffer objects.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTypeID();

    /**
     * [@function]	CMSampleBufferSetDataBuffer
     * 
     * Associates a CMSampleBuffer with its CMBlockBuffer of media data.
     * 
     * If successful, this operation retains the dataBuffer thereafter, so the caller can release the dataBuffer
     * 			after calling this API, if it has no further need to reference it. This is a write-once operation; it will fail if
     * 			the CMSampleBuffer already has a dataBuffer. This API allows a CMSampleBuffer to exist, with timing and format
     * 			information, before the associated data shows up. Example of usage: Some media services may have access to sample
     * 			size, timing, and format information before the data is read.  Such services may create CMSampleBuffers with that
     * 			information and insert them into queues early, and use this API to attach the CMBlockBuffers later, when the data
     * 			becomes ready.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBuffer(CMSampleBufferRef sbuf, CMBlockBufferRef dataBuffer);

    /**
     * [@function]	CMSampleBufferGetDataBuffer
     * 
     * Returns a CMSampleBuffer's CMBlockBuffer of media data.
     * 
     * The caller does not own the returned dataBuffer, and must retain it explicitly if the caller needs to maintain a reference to it.
     * 
     * @return		CMBlockBuffer of media data. The result will be NULL if the CMSampleBuffer does not contain a CMBlockBuffer, if the
     * 			CMSampleBuffer contains a CVImageBuffer, or if there is some other error.
     */
    @Generated
    @CFunction
    public static native CMBlockBufferRef CMSampleBufferGetDataBuffer(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetImageBuffer
     * 
     * Returns a CMSampleBuffer's CVImageBuffer of media data.
     * 
     * The caller does not own the returned dataBuffer, and must retain it explicitly if the caller needs to maintain a reference to it.
     * 
     * @return		CVImageBuffer of media data. The result will be NULL if the CMSampleBuffer does not contain a CVImageBuffer, if the
     * 			CMSampleBuffer contains a CMBlockBuffer, or if there is some other error.
     */
    @Generated
    @CFunction
    public static native CVBufferRef CMSampleBufferGetImageBuffer(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferSetDataBufferFromAudioBufferList
     * 
     * Creates a CMBlockBuffer containing a copy of the data from the AudioBufferList,
     * 			and sets that as the CMSampleBuffer's data buffer. The resulting buffer(s) in the
     * 			sample buffer will be 16-byte-aligned if  
     * 			kCMSampleBufferFlag_AudioBufferList_Assure16ByteAlignment is passed in.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBufferFromAudioBufferList(CMSampleBufferRef sbuf,
            CFAllocatorRef blockBufferStructureAllocator, CFAllocatorRef blockBufferBlockAllocator, int flags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    /**
     * [@function]	CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer
     * 
     * Creates an AudioBufferList containing the data from the CMSampleBuffer,
     * 			and a CMBlockBuffer which references (and manages the lifetime of) the
     * 			data in that AudioBufferList.  The data may or may not be copied,
     * 			depending on the contiguity and 16-byte alignment of the CMSampleBuffer's
     * 			data. The buffers placed in the AudioBufferList are guaranteed to be contiguous.
     * 			The buffers in the AudioBufferList will be 16-byte-aligned if
     * 			kCMSampleBufferFlag_AudioBufferList_Assure16ByteAlignment is passed in.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer(CMSampleBufferRef sbuf,
            NUIntPtr bufferListSizeNeededOut,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferListOut,
            @NUInt long bufferListSize, CFAllocatorRef blockBufferStructureAllocator,
            CFAllocatorRef blockBufferBlockAllocator, int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMSampleBufferGetAudioStreamPacketDescriptions
     * 
     * Creates an array of AudioStreamPacketDescriptions for the
     *                variable bytes per packet or variable frames per packet
     *                audio data in the provided CMSampleBuffer.  Constant bitrate,
     *                constant frames-per-packet audio yields a return value of noErr 
     *                and no packet descriptions.  This API is specific to audio format
     * 			sample buffers, and will return kCMSampleBufferError_InvalidMediaTypeForOperation
     * 			if called with a non-audio sample buffer.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptions(CMSampleBufferRef sbuf,
            @NUInt long packetDescriptionsSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptionsOut,
            NUIntPtr packetDescriptionsSizeNeededOut);

    /**
     * [@function]	CMSampleBufferGetAudioStreamPacketDescriptionsPtr
     * 
     * Returns a pointer to (and size of) a constant array of
     * 			AudioStreamPacketDescriptions for the variable bytes per
     * 			packet or variable frames per packet audio data in the
     * 			provided CMSampleBuffer.  The pointer will remain valid
     * 			as long as the sbuf continues to be retained.
     * 			Constant bitrate, constant frames-per-packet audio yields a
     * 			return value of noErr and no packet descriptions.  This API is
     * 			specific to audio format sample buffers, and will return
     * 			kCMSampleBufferError_InvalidMediaTypeForOperation if called
     * 			with a non-audio sample buffer.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptionsPtr(CMSampleBufferRef sbuf,
            Ptr<ConstPtr<AudioStreamPacketDescription>> packetDescriptionsPointerOut,
            NUIntPtr packetDescriptionsSizeOut);

    /**
     * [@function]	CMSampleBufferCopyPCMDataIntoAudioBufferList
     * 
     * Copies PCM audio data from the given CMSampleBuffer into
     * 			a pre-populated AudioBufferList. The AudioBufferList must
     * 			contain the same number of channels and its data buffers
     * 			must be sized to hold the specified number of frames.
     * 			This API is	specific to audio format sample buffers, and
     * 			will return kCMSampleBufferError_InvalidMediaTypeForOperation
     * 			if called with a non-audio sample buffer. It will return an
     * 			error if the CMSampleBuffer does not contain PCM audio data
     * 			or if its dataBuffer is not ready.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCopyPCMDataIntoAudioBufferList(CMSampleBufferRef sbuf, int frameOffset,
            int numFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    /**
     * [@function]	CMSampleBufferSetDataReady
     * 
     * Marks a CMSampleBuffer's data as "ready".
     * 
     * There is no way to undo this operation.  The only way to get an "unready"
     * 			CMSampleBuffer is to call CMSampleBufferCreate with the dataReady parameter
     * 			set to false. Example of usage: in a read completion routine.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataReady(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferDataIsReady
     * 
     * Returns whether or not a CMSampleBuffer's data is ready.
     * 
     * @return		Whether or not the CMSampleBuffer's data is ready.  True is returned for special marker buffers, even
     * 			though they have no data. False is returned if there is an error.
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferDataIsReady(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferSetDataFailed
     * 
     * Marks a CMSampleBuffer's data as "failed", to indicate that the data will not become ready.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataFailed(CMSampleBufferRef sbuf, int status);

    /**
     * [@function]	CMSampleBufferHasDataFailed
     * 
     * Returns whether or not a CMSampleBuffer's data loading request has failed.
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferHasDataFailed(CMSampleBufferRef sbuf, IntPtr statusOut);

    /**
     * [@function]	CMSampleBufferMakeDataReady
     * 
     * Makes a CMSampleBuffer's data ready, by calling the client's CMSampleBufferMakeDataReadyCallback.
     * 
     * The CMSampleBufferMakeDataReadyCallback is passed in by the client during creation. It must return
     * 			0 if successful, and in that case, CMSampleBufferMakeDataReady will set the data readiness of
     * 			the CMSampleBuffer to true. Example of usage: when it is time to actually use the data. Example of
     * 			callback routine: a routine to force a scheduled read to complete.  If the CMSampleBuffer is not
     * 			ready, and there is no CMSampleBufferMakeDataReadyCallback to call, kCMSampleBufferError_BufferNotReady
     * 			will be returned. Similarly, if the CMSampleBuffer is not ready, and the CMSampleBufferMakeDataReadyCallback
     * 			fails and returns an error, kCMSampleBufferError_BufferNotReady will be returned.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferMakeDataReady(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferTrackDataReadiness
     * 
     * Associates a CMSampleBuffer's data readiness with another CMSampleBuffer's data readiness.
     * 
     * After calling this API, if CMSampleBufferDataIsReady(sbuf) is called, it will return sbufToTrack's data
     * 			readiness. If CMSampleBufferMakeDataReady(sbuf) is called, it will do it by making sbufToTrack ready.
     * 			Example of use: This allows bursting a multi-sample CMSampleBuffer into single-sample CMSampleBuffers
     * 			before the data is ready. The single-sample CMSampleBuffers will all track the multi-sample
     * 			CMSampleBuffer's data readiness.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferTrackDataReadiness(CMSampleBufferRef sbuf,
            CMSampleBufferRef sampleBufferToTrack);

    /**
     * [@function]	CMSampleBufferInvalidate
     * 
     * Makes the sample buffer invalid, calling any installed invalidation callback.
     * 
     * An invalid sample buffer cannot be used -- all accessors will return kCMSampleBufferError_Invalidated.
     * 			It is not a good idea to do this to a sample buffer that another module may be accessing concurrently.
     * 			Example of use: the invalidation callback could cancel pending I/O.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferInvalidate(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferSetInvalidateCallback
     * 
     * Sets the sample buffer's invalidation callback, which is called during CMSampleBufferInvalidate.
     * 
     * A sample buffer can only have one invalidation callback.
     * 			The invalidation callback is NOT called during ordinary sample buffer finalization.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateCallback(CMSampleBufferRef sbuf,
            @FunctionPtr(name = "call_CMSampleBufferSetInvalidateCallback") Function_CMSampleBufferSetInvalidateCallback invalidateCallback,
            long invalidateRefCon);

    /**
     * [@function]	CMSampleBufferSetInvalidateHandler
     * 
     * Sets the sample buffer's invalidation handler block, which is called during CMSampleBufferInvalidate.
     * 
     * A sample buffer can only have one invalidation callback.
     * 			The invalidation callback is NOT called during ordinary sample buffer finalization.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateHandler(CMSampleBufferRef sbuf,
            @ObjCBlock(name = "call_CMSampleBufferSetInvalidateHandler") Block_CMSampleBufferSetInvalidateHandler invalidateHandler);

    /**
     * [@function]	CMSampleBufferIsValid
     * 
     * Queries whether a sample buffer is still valid.
     * 
     * Returns false if sbuf is NULL or CMSampleBufferInvalidate(sbuf) was called, true otherwise.
     * 			Does not perform any kind of exhaustive validation of the sample buffer.
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferIsValid(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetNumSamples
     * 
     * Returns the number of media samples in a CMSampleBuffer.
     * 
     * @return		The number of media samples in the CMSampleBuffer. 0 is returned if there is an error.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMSampleBufferGetNumSamples(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetDuration
     * 
     * Returns the total duration of a CMSampleBuffer.
     * 
     * If the buffer contains out-of-presentation-order samples, any gaps in the presentation timeline are not represented in the returned duration.
     * 			The returned duration is simply the sum of all the individual sample durations.
     * 
     * @return		The duration of the CMSampleBuffer. kCMTimeInvalid is returned if there is an error.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDuration(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetPresentationTimeStamp
     * 
     * Returns the numerically earliest presentation timestamp of all the samples in a CMSampleBuffer.
     * 
     * For in-presentation-order samples, this is the presentation timestamp of the first sample.
     * 			For out-of-presentation-order samples, this is the presentation timestamp of the sample that
     * 			will be presented first, which is not necessarily the first sample in the buffer.
     * 
     * @return		Numerically earliest sample presentation timestamp in the CMSampleBuffer.  kCMTimeInvalid is returned if there is an error.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetPresentationTimeStamp(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetDecodeTimeStamp
     * 
     * Returns the numerically earliest decode timestamp of all the samples in a CMSampleBuffer.
     * 
     * The returned decode timestamp is always the decode timestamp of the first sample in the buffer,
     * 			since even out-of-presentation-order samples are expected to be in decode order in the buffer.
     * 
     * @return		Numerically earliest sample decode timestamp in the CMSampleBuffer.  kCMTimeInvalid is returned if there is an error.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDecodeTimeStamp(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetOutputDuration
     * 
     * Returns the output duration of a CMSampleBuffer.
     * 
     * The OutputDuration is the duration minus any trimmed duration, all divided by the SpeedMultiplier:
     * 			(Duration - TrimDurationAtStart - TrimDurationAtEnd) / SpeedMultiplier
     * 
     * @return		The output duration of the CMSampleBuffer. kCMTimeInvalid is returned if there is an error.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDuration(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetOutputPresentationTimeStamp
     * 
     * Returns the output presentation timestamp of the CMSampleBuffer.
     * 
     * The output presentation timestamp is the time at which the decoded, trimmed, stretched
     * 			and possibly reversed samples should commence being presented.
     * 			If CMSampleBufferSetOutputPresentationTimeStamp has been called to explicitly set the output PTS, 
     * 			CMSampleBufferGetOutputPresentationTimeStamp returns it.  
     * 			If not, CMSampleBufferGetOutputPresentationTimeStamp calculates its result as
     * 			(PresentationTimeStamp + TrimDurationAtStart) 
     * 			unless kCMSampleBufferAttachmentKey_Reverse is kCFBooleanTrue, in which case it calculates the result as
     * 			(PresentationTimeStamp + Duration - TrimDurationAtEnd).
     * 			These are generally correct for un-stretched, un-shifted playback.
     * 			For general forward playback in a scaled edit, the OutputPresentationTimeStamp should be set to:
     * 			((PresentationTimeStamp + TrimDurationAtStart - EditStartMediaTime) / EditSpeedMultiplier) + EditStartTrackTime.
     * 			For general reversed playback:
     * 			((PresentationTimeStamp + Duration - TrimDurationAtEnd - EditStartMediaTime) / EditSpeedMultiplier) + EditStartTrackTime.
     * 
     * @return		kCMTimeInvalid is returned if there is an error.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputPresentationTimeStamp(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferSetOutputPresentationTimeStamp
     * 
     * Sets an output presentation timestamp to be used in place of a calculated value.
     * 
     * The output presentation timestamp is the time at which the decoded, trimmed, stretched
     * 			and possibly reversed samples should commence being presented.
     * 			By default, this is calculated by CMSampleBufferGetOutputPresentationTimeStamp.
     * 			Call CMSampleBufferSetOutputPresentationTimeStamp to explicitly set the value for
     * 			CMSampleBufferGetOutputPresentationTimeStamp to return.
     * 			For general forward playback in a scaled edit, the OutputPresentationTimeStamp should be set to:
     * 			((PresentationTimeStamp + TrimDurationAtStart - EditStartMediaTime) / EditSpeedMultiplier) + EditStartTrackTime.
     * 			For general reversed playback:
     * 			((PresentationTimeStamp + Duration - TrimDurationAtEnd - EditStartMediaTime) / EditSpeedMultiplier) + EditStartTrackTime.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetOutputPresentationTimeStamp(CMSampleBufferRef sbuf,
            @ByValue CMTime outputPresentationTimeStamp);

    /**
     * [@function]	CMSampleBufferGetOutputDecodeTimeStamp
     * 
     * Returns the output decode timestamp of the CMSampleBuffer.
     * 
     * For consistency with CMSampleBufferGetOutputPresentationTimeStamp, this is calculated as:
     * 			OutputPresentationTimeStamp + ((DecodeTimeStamp - PresentationTimeStamp) / SpeedMultiplier).
     * 
     * @return		CMInvalidTime is returned if there is an error.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDecodeTimeStamp(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetSampleTimingInfoArray
     * 
     * Returns an array of CMSampleTimingInfo structs, one for each sample in a CMSampleBuffer.
     * 
     * If only one CMSampleTimingInfo struct is returned, it applies to all samples in the buffer.
     * 			See documentation of CMSampleTimingInfo for details of how a single CMSampleTimingInfo struct can apply to multiple samples.
     * 			The timingArrayOut must be allocated by the caller, and the number of entries allocated must be passed in timingArrayEntries.
     * 			If timingArrayOut is NULL, timingArrayEntriesNeededOut will return the required number of entries.  Similarly, 
     * 			if timingArrayEntries is too small, kCMSampleBufferError_ArrayTooSmall will be returned, and timingArrayEntriesNeededOut
     * 			will return the required number of entries. In either case, the caller can then make an appropriately-sized timingArrayOut and call again.
     * 			For example, the caller might pass the address of a CMSampleTimingInfo struct on the stack (as timingArrayOut), and 1 (as
     * 			timingArrayEntries). If all samples are describable with a single CMSampleTimingInfo struct (or there is only one sample
     * 			in the CMSampleBuffer), this call will succeed. If not, it will fail, and will return the number of entries required in
     * 			timingArrayEntriesNeededOut. Only in this case will the caller actually need to allocate an array.
     * 
     * 			If there is no timingInfo in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleTimingInfo will be returned, and
     * 			timingArrayEntriesNeededOut will be set to 0.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfoArray(CMSampleBufferRef sbuf,
            @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            NIntPtr timingArrayEntriesNeededOut);

    /**
     * [@function]	CMSampleBufferGetOutputSampleTimingInfoArray
     * 
     * Returns an array of output CMSampleTimingInfo structs, one for each sample in a CMSampleBuffer.
     * 
     * If only one CMSampleTimingInfo struct is returned, it applies to all samples in the buffer.
     * 			See documentation of CMSampleTimingInfo for details of how a single CMSampleTimingInfo struct can apply to multiple samples.
     * 			The timingArrayOut must be allocated by the caller, and the number of entries allocated must be passed in timingArrayEntries.
     * 			If timingArrayOut is NULL, timingArrayEntriesNeededOut will return the required number of entries.  Similarly,
     * 			if timingArrayEntries is too small, kCMSampleBufferError_ArrayTooSmall will be returned, and timingArrayEntriesNeededOut
     * 			will return the required number of entries. In either case, the caller can then make an appropriately-sized timingArrayOut and call again.
     * 			For example, the caller might pass the address of a CMSampleTimingInfo struct on the stack (as timingArrayOut), and 1 (as
     * 			timingArrayEntries). If all samples are describable with a single CMSampleTimingInfo struct (or there is only one sample
     * 			in the CMSampleBuffer), this call will succeed. If not, it will fail, and will return the number of entries required in
     * 			timingArrayEntriesNeededOut. Only in this case will the caller actually need to allocate an array.
     * 
     * 			If there is no timingInfo in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleTimingInfo will be returned,
     * 			and *timingArrayEntriesNeededOut will be set to 0.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetOutputSampleTimingInfoArray(CMSampleBufferRef sbuf,
            @NInt long timingArrayEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            NIntPtr timingArrayEntriesNeededOut);

    /**
     * [@function]	CMSampleBufferGetSampleTimingInfo
     * 
     * Returns a CMSampleTimingInfo struct describing a specified sample in a CMSampleBuffer.
     * 
     * A sample-specific CMSampleTimingInfo struct will be returned (ie. with a sample-specific
     * 			presentationTimeStamp and decodeTimeStamp), even if a single CMSampleTimingInfo struct was used
     * 			during creation to describe all the samples in the buffer. The timingInfo struct must be
     * 			allocated by the caller.  If the sample index is not in the range 0 .. numSamples-1,
     * 			kCMSampleBufferError_SampleIndexOutOfRange will be returned.  If there is no timingInfo
     * 			in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleTimingInfo will be returned.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfo(CMSampleBufferRef sbuf, @NInt long sampleIndex,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingInfoOut);

    /**
     * [@function]	CMSampleBufferGetSampleSizeArray
     * 
     * Returns an array of sample sizes, one for each sample in a CMSampleBuffer.
     * 
     * If only one size entry is returned, all samples in the buffer are of this size.
     * 			The sizeArrayOut must be allocated by the caller, and the number of entries allocated must be passed in sizeArrayEntries.
     * 			If sizeArrayOut is NULL, sizeArrayEntriesNeededOut will return the required number of entries.  Similarly, if sizeArrayEntries
     * 			is too small, kCMSampleBufferError_ArrayTooSmall will be returned, and sizeArrayEntriesNeededOut will return the required number of entries.
     * 			The caller can then make an appropriately-sized sizeArrayOut and call again. For example, the caller might pass the address
     * 			of a size_t variable on the stack (as sizeArrayOut), and 1 (as sizeArrayEntries). If all samples are the same size (or there
     * 			is only one sample in the CMSampleBuffer), this call would succeed. If not, it will fail, and will return the number of
     * 			entries required in sizeArrayEntriesNeededOut. Only in this case (multiple samples of different sizes) will the caller
     * 			need to allocate an array.  0 entries will be returned if the samples in the buffer are non-contiguous (eg. non-interleaved
     * 			audio, where the channel values for a single sample are scattered through the buffer).
     * 
     * 			If there are no sample sizes in this CMSampleBuffer, kCMSampleBufferError_BufferHasNoSampleSizes will be returned,
     * 			and *sizeArrayEntriesNeededOut will be set to 0.  This will be true, for example,
     * 			if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     * 			the channel values for a single sample are scattered through the buffer), or if
     * 			this CMSampleBuffer contains a CVImageBuffer.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleSizeArray(CMSampleBufferRef sbuf, @NInt long sizeArrayEntries,
            NUIntPtr sizeArrayOut, NIntPtr sizeArrayEntriesNeededOut);

    /**
     * [@function]	CMSampleBufferGetSampleSize
     * 
     * Returns the size in bytes of a specified sample in a CMSampleBuffer.
     * 
     * @return		Size in bytes of the specified sample in the CMSampleBuffer.
     * 			If the sample index is not in the range 0 .. numSamples-1,
     * 			a size of 0 will be returned.  If there are no sample sizes
     * 			in this CMSampleBuffer, a size of 0 will be returned.  This will be true, for example,
     * 			if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     * 			the channel values for a single sample are scattered through the buffer),
     * 			or if this CMSampleBuffer contains a CVImageBuffer.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetSampleSize(CMSampleBufferRef sbuf, @NInt long sampleIndex);

    /**
     * [@function]	CMSampleBufferGetTotalSampleSize
     * 
     * Returns the total size in bytes of sample data in a CMSampleBuffer.
     * 
     * @return		Total size in bytes of sample data in the CMSampleBuffer.
     * 			If there are no sample sizes in this CMSampleBuffer, a size of 0 will be returned.  
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTotalSampleSize(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetFormatDescription
     * 
     * Returns the format description of the samples in a CMSampleBuffer.
     * 
     * On return, the caller does not own the returned formatDesc, and must retain it explicitly if the caller needs to maintain a reference to it.
     * 
     * @return		The format description of the samples in the CMSampleBuffer.  NULL is returned if there is an error.
     */
    @Generated
    @CFunction
    public static native CMFormatDescriptionRef CMSampleBufferGetFormatDescription(CMSampleBufferRef sbuf);

    /**
     * [@function]	CMSampleBufferGetSampleAttachmentsArray
     * 
     * Returns a reference to a CMSampleBuffer's immutable array of mutable sample attachments dictionaries (one dictionary
     * 			per sample in the CMSampleBuffer).
     * 
     * Attachments can then be added/removed directly by the caller, using CF APIs. On return, the caller does not
     * 			own the returned array of attachments dictionaries, and must retain it if the caller needs to maintain a
     * 			reference to it. If there are no sample attachments yet, and createIfNecessary is true, a new CFArray containing N empty
     * 			CFMutableDictionaries is returned (where N is the number of samples in the CMSampleBuffer), so that
     * 			attachments can be added directly by the caller. If there are no sample attachments yet, and createIfNecessary is
     * 			false, NULL is returned.  Once the CFArray has been created, subsequent calls will return it, even if there are still
     * 			no sample attachments in the array.
     * 
     * @return		A reference to the CMSampleBuffer's immutable array of mutable sample attachments dictionaries (one dictionary per sample
     * 			in the CMSampleBuffer). NULL is returned if there is an error.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMSampleBufferGetSampleAttachmentsArray(CMSampleBufferRef sbuf,
            byte createIfNecessary);

    /**
     * [@function]	CMSampleBufferCallForEachSample
     * 
     * Calls a function for every individual sample in a sample buffer.
     * 
     * Temporary sample buffers will be created for individual samples,
     * 			referring to the sample data and containing its timing, size and attachments.
     * 			The callback function may retain these sample buffers if desired.
     * 			If the callback function returns an error, iteration will stop immediately
     * 			and the error will be returned.
     * 			If there are no sample sizes in the provided sample buffer, kCMSampleBufferError_CannotSubdivide will be returned.
     * 			This will happen, for example, if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     * 			the channel values for a single sample are scattered through the buffer).
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCallForEachSample(CMSampleBufferRef sbuf,
            @FunctionPtr(name = "call_CMSampleBufferCallForEachSample") Function_CMSampleBufferCallForEachSample callback,
            VoidPtr refcon);

    /**
     * [@function]	CMSampleBufferCallBlockForEachSample
     * 
     * Calls a block for every individual sample in a sample buffer.
     * 
     * Temporary sample buffers will be created for individual samples,
     * 			referring to the sample data and containing its timing, size and attachments.
     * 			The block may retain these sample buffers if desired.
     * 			If the block returns an error, iteration will stop immediately
     * 			and the error will be returned.
     * 			If there are no sample sizes in the provided sample buffer, kCMSampleBufferError_CannotSubdivide will be returned.
     * 			This will happen, for example, if the samples in the buffer are non-contiguous (eg. non-interleaved audio, where
     * 			the channel values for a single sample are scattered through the buffer).
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCallBlockForEachSample(CMSampleBufferRef sbuf,
            @ObjCBlock(name = "call_CMSampleBufferCallBlockForEachSample") Block_CMSampleBufferCallBlockForEachSample handler);

    /**
     * [@function]	CMClockGetTypeID
     * 
     * Returns the CFTypeID for CMClock.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMClockGetTypeID();

    /**
     * [@function]	CMClockGetHostTimeClock
     * 
     * Returns a reference to the singleton clock logically identified with host time.
     * 
     * 	On Mac OS X, the host time clock uses mach_absolute_time but returns a value 
     * 	with a large integer timescale (eg, nanoseconds).
     */
    @Generated
    @CFunction
    public static native CMClockRef CMClockGetHostTimeClock();

    /**
     * [@function]	CMClockConvertHostTimeToSystemUnits
     * 
     * Converts a host time from CMTime to the host time's native units.
     * 
     * 	This function performs a scale conversion, not a clock conversion.
     * 	It can be more accurate than CMTimeConvertScale because the system units may 
     * 	have a non-integer timescale.
     * 	On Mac OS X, this function converts to the units of mach_absolute_time.
     */
    @Generated
    @CFunction
    public static native long CMClockConvertHostTimeToSystemUnits(@ByValue CMTime hostTime);

    /**
     * [@function]	CMClockMakeHostTimeFromSystemUnits
     * 
     * Converts a host time from native units to CMTime.
     * 
     * 	The returned value will have a large integer timescale (eg, nanoseconds).
     * 	This function handles situations where host time's native units use a 
     * 	non-integer timescale.
     * 	On Mac OS X, this function converts from the units of mach_absolute_time.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockMakeHostTimeFromSystemUnits(long hostTime);

    /**
     * [@function]	CMClockGetTime
     * 
     * Retrieves the current time from a clock.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockGetTime(CMClockRef clock);

    /**
     * [@function]	CMClockGetAnchorTime
     * 
     * Retrieves the current time from a clock and also the matching time from the clock's reference clock.
     * 
     * To make practical use of this, you may need to know what the clock's reference clock is.
     */
    @Generated
    @CFunction
    public static native int CMClockGetAnchorTime(CMClockRef clock,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime clockTimeOut,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime referenceClockTimeOut);

    /**
     * [@function]	CMClockMightDrift
     * 
     * Indicates whether it is possible for two clocks to drift relative to each other.
     */
    @Generated
    @CFunction
    public static native byte CMClockMightDrift(CMClockRef clock, CMClockRef otherClock);

    /**
     * [@function]	CMClockInvalidate
     * 
     * Makes the clock stop functioning.
     * 
     * 	After invalidation, the clock will return errors from all APIs.
     * 	This should only be called by the "owner" of the clock, who knows (for example) that some piece of hardware
     * 	has gone away, and the clock will no longer work (and might even crash).
     */
    @Generated
    @CFunction
    public static native void CMClockInvalidate(CMClockRef clock);

    /**
     * [@function]	CMTimebaseGetTypeID
     * 
     * Returns the CFTypeID for CMTimebase.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMTimebaseGetTypeID();

    /**
     * [@function]	CMTimebaseCreateWithMasterClock
     * 
     * Creates a timebase driven by the given clock.
     * 
     * 	The timebase will initially have rate zero and time zero.
     * 	Pass CMClockGetHostTimeClock() for masterClock to have the host time clock drive this timebase.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterClock(CFAllocatorRef allocator, CMClockRef masterClock,
            Ptr<CMTimebaseRef> timebaseOut);

    /**
     * [@function]	CMTimebaseCreateWithMasterTimebase
     * 
     * Creates a timebase driven by the given master timebase.
     * 
     * 	The timebase will initially have rate zero and time zero.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterTimebase(CFAllocatorRef allocator, CMTimebaseRef masterTimebase,
            Ptr<CMTimebaseRef> timebaseOut);

    /**
     * [@function]	CMTimebaseCopyMasterTimebase
     * 
     * Returns the immediate master timebase of a timebase.
     * 
     * 	Returns NULL if the timebase actually has a master clock instead of a master timebase.
     */
    @Generated
    @CFunction
    public static native CMTimebaseRef CMTimebaseCopyMasterTimebase(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseCopyMasterClock
     * 
     * Returns the immediate master clock of a timebase.
     * 
     * 	Returns NULL if the timebase actually has a master timebase instead of a master clock.
     */
    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseCopyMasterClock(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseCopyMaster
     * 
     * Returns the immediate master (either timebase or clock) of a timebase.
     * 
     * 	Only returns NULL if there was an error (such as timebase == NULL).
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMTimebaseCopyMaster(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseCopyUltimateMasterClock
     * 
     * Returns the master clock that is the master of all of a timebase's master timebases.
     */
    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseCopyUltimateMasterClock(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseGetMasterTimebase
     * 
     * Returns the immediate master timebase of a timebase.
     * 
     * 	Returns NULL if the timebase actually has a master clock instead of a master timebase.
     * 	Please use CMTimebaseCopyMasterTimebase instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CMTimebaseRef CMTimebaseGetMasterTimebase(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseGetMasterClock
     * 
     * Returns the immediate master clock of a timebase.
     * 
     * 	Returns NULL if the timebase actually has a master timebase instead of a master clock.
     * 	Please use CMTimebaseCopyMasterClock instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CMClockRef CMTimebaseGetMasterClock(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseGetMaster
     * 
     * Returns the immediate master (either timebase or clock) of a timebase.
     * 
     * 	Only returns NULL if there was an error (such as timebase == NULL).
     * 	Example of use: time = CMSyncGetTime(CMTimebaseGetMaster(timebase));
     * 	Please use CMTimebaseCopyMaster instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CMTimebaseGetMaster(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseGetUltimateMasterClock
     * 
     * Returns the master clock that is the master of all of a timebase's master timebases.
     * 
     * 	Please use CMTimebaseCopyUltimateMasterClock instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CMClockRef CMTimebaseGetUltimateMasterClock(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseGetTime
     * 
     * Retrieves the current time from a timebase.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTime(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseGetTimeWithTimeScale
     * 
     * Retrieves the current time from a timebase in the specified timescale.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTimeWithTimeScale(CMTimebaseRef timebase, int timescale, int method);

    /**
     * [@function]	CMTimebaseSetTime
     * 
     * Sets the current time of a timebase.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTime(CMTimebaseRef timebase, @ByValue CMTime time);

    /**
     * [@function]	CMTimebaseSetAnchorTime
     * 
     * Sets the time of a timebase at a particular master time.
     * 
     * 	CMTimebaseGetTime's results will be interpolated from that anchor time.
     * 	CMTimebaseSetTime(timebase, time) is equivalent to calling
     * 		CMClockOrTimebaseRef master = CMTimebaseCopyMaster(timebase);
     * 		CMTimebaseSetAnchorTime(timebase, time, CMSyncGetTime(master));
     * 		CFRelease(master).
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetAnchorTime(CMTimebaseRef timebase, @ByValue CMTime timebaseTime,
            @ByValue CMTime immediateMasterTime);

    /**
     * [@function]	CMTimebaseGetRate
     * 
     * Retrieves the current rate of a timebase.
     * 
     * 	This is the rate relative to its immediate master clock or timebase.  
     * 	For example, if a timebase is running at twice the rate of its master, its rate is 2.0.
     */
    @Generated
    @CFunction
    public static native double CMTimebaseGetRate(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseGetTimeAndRate
     * 
     * Retrieves the current time and rate of a timebase.
     * 
     * 	You can use this function to take a consistent snapshot of the two values,
     * 	avoiding possible inconsistencies due to external changes between retrieval of time and rate.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseGetTimeAndRate(CMTimebaseRef timebase,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime timeOut, DoublePtr rateOut);

    /**
     * [@function]	CMTimebaseSetRate
     * 
     * Sets the rate of a timebase.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetRate(CMTimebaseRef timebase, double rate);

    /**
     * [@function]	CMTimebaseSetRateAndAnchorTime
     * 
     * Sets the time of a timebase at a particular master time, and changes the rate at exactly that time.
     * 
     * 	CMTimebaseGetTime's results will be interpolated from that anchor time as though the timebase 
     * 	has been running at the requested rate since that time.
     * 	CMTimebaseSetRate(timebase, rate) is approximately equivalent to calling
     * 		CMClockOrTimebaseRef master = CMTimebaseCopyMaster(timebase);
     * 		CMTimebaseSetRateAndAnchorTime(timebase, rate, CMTimebaseGetTime(timebase), CMSyncGetTime(master)),
     * 		CFRelease(master);
     * 	except that CMTimebaseSetRate will not generate a TimeJumped notification, and
     * 	CMTimebaseSetRateAndAnchorTime will.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetRateAndAnchorTime(CMTimebaseRef timebase, double rate,
            @ByValue CMTime timebaseTime, @ByValue CMTime immediateMasterTime);

    /**
     * [@function]	CMTimebaseGetEffectiveRate
     * 
     * Gets the effective rate of a timebase (which combines its rate with the rates of all its master timebases).
     * 
     * 	Calling CMTimebaseGetEffectiveRate(timebase) is equivalent to calling
     * 		CMClockRef clock = CMTimebaseCopyUltimateMasterClock(timebase);
     * 		CMSyncGetRelativeRate(timebase, clock).
     * 		CFRelease(clock);
     */
    @Generated
    @CFunction
    public static native double CMTimebaseGetEffectiveRate(CMTimebaseRef timebase);

    /**
     * [@function]	CMTimebaseAddTimer
     * 
     * 	Adds the timer to the list of timers managed by the timebase. 
     * 
     * 	The timer must be a repeating run loop timer (with a very long interval at
     * 	least as long as kCMTimebaseVeryLongCFTimeInterval), attached to a runloop.  
     * 	The timebase will retain the timer, and will maintain its "NextFireDate" 
     * 	according to the CMTime set using CMTimebaseSetTimerNextFireTime.
     * 	Until the first call to CMTimebaseSetTimerNextFireTime, the "NextFireDate" 
     * 	will be set far, far in the future. The runloop that timer is attached to must be
     * 	passed in and the timebase will retain that runloop. The retained runloop will be
     * 	used to call CFRunLoopWakeUp() any time the timebase modifies the timer's fire date.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseAddTimer(CMTimebaseRef timebase, CFRunLoopTimerRef timer, CFRunLoopRef runloop);

    /**
     * [@function]	CMTimebaseRemoveTimer
     * 
     * 	Removes the timer from the list of timers managed by the timebase. 
     * 
     * 	The timebase will no longer maintain the timer's "NextFireDate".
     * 	If the timer is invalidated, the timebase will eventually remove it 
     * 	from its list and release it even if this function is not called.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimer(CMTimebaseRef timebase, CFRunLoopTimerRef timer);

    /**
     * [@function]	CMTimebaseSetTimerNextFireTime
     * 
     * 	Sets the CMTime on the timebase's timeline at which the timer should next be fired.
     * 
     * 	The timer must be on the list of timers managed by the timebase.
     * 	The timebase will continue to update the timer's "NextFireDate" according to time jumps 
     * 	and effective rate changes.
     * 	If fireTime is not numeric, or if the timebase is not moving, the "NextFireDate"
     * 	will be set to a date far, far in the future.
     * 	<BR>
     * 	IMPORTANT NOTE: Due to the way that CFRunLoopTimers are implemented, if a timer passes 
     * 	through a state in which it is due to fire, it may fire even if its rescheduled before 
     * 	the runloop runs again.  Clients should take care to avoid temporarily scheduling timers 
     * 	in the past.  For example, set the timebase's rate or time before you set the timer's 
     * 	next fire time, if you are doing both at once.  (If setting the timebase's rate or time
     * 	might put the timer's fire time in the past, you may need to set the fire time to 
     * 	kCMTimeInvalid across the timebase change.)
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerNextFireTime(CMTimebaseRef timebase, CFRunLoopTimerRef timer,
            @ByValue CMTime fireTime, int flags);

    /**
     * [@function]	CMTimebaseSetTimerToFireImmediately
     * 
     * 	Sets the timer to fire immediately once, overriding any previous CMTimebaseSetTimerNextFireTime call.
     * 
     * 	The timer must be on the list of timers managed by the timebase.
     * 	This is equivalent to calling 
     * 		CFRunLoopTimerSetNextFireDate( timer, CFAbsoluteTimeGetCurrent() );
     * 	except that the timebase gets to know that it shouldn't interfere.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerToFireImmediately(CMTimebaseRef timebase, CFRunLoopTimerRef timer);

    /**
     * [@function]	CMTimebaseAddTimerDispatchSource
     * 
     * 	Adds the timer dispatch source to the list of timers managed by the timebase. 
     * 
     * 	The timer source must have been created by calling
     * 	dispatch_source_create( DISPATCH_SOURCE_TYPE_TIMER, 0, 0, some_dispatch_queue )
     * 	and should have had an event handler associated with it via
     * 	dispatch_source_set_event_handler( timerSource, some_handler_block )
     * 	or dispatch_source_set_event_handler_f( timerSource, some_handler_function ).
     * 	Don't forget to call dispatch_resume( timerSource ) as dispatch sources are 
     * 	created suspended.
     * 
     * 	The timebase will retain the timer source, and will maintain its start time
     * 	according to the CMTime set using CMTimebaseSetTimerDispatchSourceNextFireTime.
     * 	Until the first call to CMTimebaseSetTimerDispatchSourceNextFireTime, the start time 
     * 	will be set to DISPATCH_TIME_FOREVER.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseAddTimerDispatchSource(CMTimebaseRef timebase, NSObject timerSource);

    /**
     * [@function]	CMTimebaseRemoveTimerDispatchSource
     * 
     * 	Removes the timer dispatch source from the list of timers managed by the timebase. 
     * 
     * 	The timebase will no longer maintain the timer source's start time.
     * 	If the timer source is cancelled, the timebase will eventually remove it 
     * 	from its list and release it even if this function is not called.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimerDispatchSource(CMTimebaseRef timebase, NSObject timerSource);

    /**
     * [@function]	CMTimebaseSetTimerDispatchSourceNextFireTime
     * 
     * 	Sets the CMTime on the timebase's timeline at which the timer dispatch source should next be fired.
     * 
     * 	The timer source must be on the list of timers managed by the timebase.
     * 	The timebase will continue to update the timer dispatch source's start time 
     * 	according to time jumps and effective rate changes.
     * 	If fireTime is not numeric, or if the timebase is not moving, the start time
     * 	will be set to DISPATCH_TIME_FOREVER.
     * 	<BR>
     * 	IMPORTANT NOTE: Due to the way that timer dispatch sources are implemented, if a timer passes 
     * 	through a state in which it is due to fire, it may fire even if its rescheduled before 
     * 	the event handler is run.  Clients should take care to avoid temporarily scheduling timers 
     * 	in the past.  For example, set the timebase's rate or time before you set the timer's 
     * 	next fire time, if you are doing both at once.  (If setting the timebase's rate or time
     * 	might put the timer's fire time in the past, you may need to set the fire time to 
     * 	kCMTimeInvalid across the timebase change.)
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceNextFireTime(CMTimebaseRef timebase, NSObject timerSource,
            @ByValue CMTime fireTime, int flags);

    /**
     * [@function]	CMTimebaseSetTimerDispatchSourceToFireImmediately
     * 
     * 	Sets the timer dispatch source to fire immediately once, overriding any previous
     * 	CMTimebaseSetTimerDispatchSourceNextFireTime call.
     * 
     * 	The timer source must be on the list of timers managed by the timebase.
     * 	This is equivalent to calling 
     * 		dispatch_source_set_timer( timerSource, DISPATCH_TIME_NOW, 0, 0 );
     * 	except that the timebase gets to know that it shouldn't interfere.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceToFireImmediately(CMTimebaseRef timebase,
            NSObject timerSource);

    /**
     * [@function]	CMSyncGetRelativeRate
     * 
     * Queries the relative rate of one timebase or clock relative to another timebase or clock.
     * 
     * 	If both have a common master, this calculation is performed purely based on the rates in the common tree 
     * 	rooted in that master.  
     * 	If they have different master clocks (or are both clocks), this calculation takes into account the measured
     * 	drift between the two clocks, using host time as a pivot.
     * 	The rate of a moving timebase relative to a stopped timebase is a NaN.
     * 	Calling CMTimebaseGetEffectiveRate(timebase) is equivalent to calling
     * 		CMClockRef clock = CMTimebaseCopyUltimateMasterClock(timebase);
     * 		CMSyncGetRelativeRate(timebase, clock).
     * 		CFRelease(clock);
     */
    @Generated
    @CFunction
    public static native double CMSyncGetRelativeRate(ConstVoidPtr ofClockOrTimebase,
            ConstVoidPtr relativeToClockOrTimebase);

    /**
     * [@function]	CMSyncGetRelativeRateAndAnchorTime
     * 
     * Queries the relative rate of one timebase or clock relative to another timebase or clock and the times of each timebase or clock at which the relative rate went into effect.
     * 
     * 	If both have a common master, this calculation is performed purely based on the rates in the common tree
     * 	rooted in that master.  
     * 	If they have different master clocks (or are both clocks), this calculation takes into account the measured
     * 	drift between the two clocks, using host time as a pivot.
     * 	The rate of a moving timebase relative to a stopped timebase is a NaN.
     */
    @Generated
    @CFunction
    public static native int CMSyncGetRelativeRateAndAnchorTime(ConstVoidPtr ofClockOrTimebase,
            ConstVoidPtr relativeToClockOrTimebase, DoublePtr outRelativeRate,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outOfClockOrTimebaseAnchorTime,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outRelativeToClockOrTimebaseAnchorTime);

    /**
     * [@function]	CMSyncConvertTime
     * 
     * Converts a time from one timebase or clock to another timebase or clock.
     * 
     * 	If both have a common master, this calculation is performed purely based on the mathematical rates and offsets 
     * 	in the common tree rooted in that master.  
     * 	If they have different master clocks (or are both clocks), this calculation also compensates
     * 	for measured drift between the clocks.
     * 	To convert to or from host time, pass CMClockGetHostTimeClock() as the appropriate argument.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncConvertTime(@ByValue CMTime time, ConstVoidPtr fromClockOrTimebase,
            ConstVoidPtr toClockOrTimebase);

    /**
     * [@function]	CMSyncMightDrift
     * 
     * Reports whether it is possible for one timebase/clock to drift relative to the other.
     * 
     * 	A timebase can drift relative to another if they are ultimately mastered by clocks that can drift relative
     * 	to each other.
     */
    @Generated
    @CFunction
    public static native byte CMSyncMightDrift(ConstVoidPtr clockOrTimebase1, ConstVoidPtr clockOrTimebase2);

    /**
     * [@function]	CMSyncGetTime
     * 
     * A helper function to get time from a clock or timebase.
     * 
     * 	CMSyncGetTime simply calls either CMClockGetTime or CMTimebaseGetTime, as appropriate.
     * 	It comes in handy for things like:
     * 		CMClockOrTimebaseRef master = CMTimebaseCopyMaster(timebase);
     * 		CMSyncGetTime(master);
     * 		CFRelease(master);
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncGetTime(ConstVoidPtr clockOrTimebase);

    /**
     * [@function]	CMTimebaseNotificationBarrier
     * 
     * Requests that the timebase wait until it is not posting any notifications.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseNotificationBarrier(CMTimebaseRef timebase);

    /**
     * [@function]	CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData
     * 
     * Creates a CMVideoFormatDescription from a big-endian ImageDescription data structure.
     * 
     * @param	allocator						Allocator to use for allocating the CMVideoFormatDescription object. May be NULL.
     * @param	imageDescriptionData			ImageDescription data structure in big-endian byte ordering.
     * @param	size							Size of ImageDescription data structure.
     * @param	stringEncoding					Pass CFStringGetSystemEncoding() or GetApplicationTextEncoding().
     * @param	flavor							kCMImageDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param	formatDescriptionOut			Receives new CMVideoFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String imageDescriptionData,
            @NUInt long size, int stringEncoding, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer
     * 
     * Creates a CMVideoFormatDescription from a big-endian ImageDescription data structure in a CMBlockBuffer.
     * 
     * @param	allocator						Allocator to use for allocating the CMVideoFormatDescription object. May be NULL.
     * @param	imageDescriptionBlockBuffer		CMBlockBuffer containing ImageDescription data structure in big-endian byte ordering.
     * @param	stringEncoding					Pass CFStringGetSystemEncoding() or GetApplicationTextEncoding().
     * @param	flavor							kCMImageDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param	formatDescriptionOut			Receives new CMVideoFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef imageDescriptionBlockBuffer, int stringEncoding,
            CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer
     * 
     * Copies the contents of a CMVideoFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     *                Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     *                garbage values (0xFFFF).  The caller must overwrite these values with a valid dataRefIndex
     *                if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param	allocator						Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param	videoFormatDescription			CMVideoFormatDescription to be copied.
     * @param	stringEncoding					Pass CFStringGetSystemEncoding() or GetApplicationTextEncoding().
     * @param	flavor							kCMImageDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param	blockBufferOut					Receives new CMBlockBuffer containing ImageDescription data structure in big-endian byte ordering.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef videoFormatDescription, int stringEncoding,
            CFStringRef flavor, Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMSwapBigEndianImageDescriptionToHost
     * 
     * Converts an ImageDescription data structure from big-endian to host-endian in place.
     * 
     * @param	imageDescriptionData			ImageDescription data structure in big-endian byte ordering to be converted to host-endian byte ordering.
     * @param	imageDescriptionSize			Size of ImageDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianImageDescriptionToHost(BytePtr imageDescriptionData,
            @NUInt long imageDescriptionSize);

    /**
     * [@function]	CMSwapHostEndianImageDescriptionToBig
     * 
     * Converts an ImageDescription data structure from host-endian to big-endian in place.
     * 
     * @param	imageDescriptionData			ImageDescription data structure in host-endian byte ordering to be converted to big-endian byte ordering.
     * @param	imageDescriptionSize			Size of ImageDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianImageDescriptionToBig(BytePtr imageDescriptionData,
            @NUInt long imageDescriptionSize);

    /**
     * [@function]	CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionData
     * 
     * Creates a CMAudioFormatDescription from a big-endian SoundDescription data structure.
     * 
     * @param	allocator						Allocator to use for allocating the CMAudioFormatDescription object. May be NULL.
     * @param	soundDescriptionData			SoundDescription data structure in big-endian byte ordering.
     * @param	size							Size of SoundDescription data structure.
     * @param	flavor							kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param	formatDescriptionOut			Receives new CMAudioFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionData(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String soundDescriptionData,
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer
     * 
     * Creates a CMAudioFormatDescription from a big-endian SoundDescription data structure in a CMBlockBuffer.
     * 
     * @param	allocator						Allocator to use for allocating the CMAudioFormatDescription object. May be NULL.
     * @param	soundDescriptionBlockBuffer		CMBlockBuffer containing SoundDescription data structure in big-endian byte ordering.
     * @param	flavor			kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param	formatDescriptionOut		Receives new CMAudioFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef soundDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer
     * 
     * Copies the contents of a CMAudioFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     *                Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     *                garbage values (0xFFFF).  The caller must overwrite these values with a valid dataRefIndex
     *                if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param	allocator						Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param	audioFormatDescription			CMAudioFormatDescription to be copied.
     * @param	flavor							kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     * @param	blockBufferOut					Receives new CMBlockBuffer containing SoundDescription data structure in big-endian byte ordering.
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef audioFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMDoesBigEndianSoundDescriptionRequireLegacyCBRSampleTableLayout
     * 
     * Examine a big-endian SoundDescription data structure in a CMBlockBuffer, and report whether the sample tables will need to use the legacy CBR layout.
     * 
     * @param	soundDescriptionBlockBuffer		CMBlockBuffer containing SoundDescription data structure in big-endian byte ordering.
     * @param	flavor							kCMSoundDescriptionFlavor constant or NULL for QuickTimeMovie flavor.
     */
    @Generated
    @CFunction
    public static native byte CMDoesBigEndianSoundDescriptionRequireLegacyCBRSampleTableLayout(
            CMBlockBufferRef soundDescriptionBlockBuffer, CFStringRef flavor);

    /**
     * [@function]	CMSwapBigEndianSoundDescriptionToHost
     * 
     * Converts a SoundDescription data structure from big-endian to host-endian in place.
     * 
     * @param	soundDescriptionData			SoundDescription data structure in big-endian byte ordering to be converted to host-endian byte ordering.
     * @param	soundDescriptionSize			Size of SoundDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianSoundDescriptionToHost(BytePtr soundDescriptionData,
            @NUInt long soundDescriptionSize);

    /**
     * [@function]	CMSwapHostEndianSoundDescriptionToBig
     * 
     * Converts a SoundDescription data structure from host-endian to big-endian in place.
     * 
     * @param	soundDescriptionData			SoundDescription data structure in host-endian byte ordering to be converted to big-endian byte ordering.
     * @param	soundDescriptionSize			Size of SoundDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianSoundDescriptionToBig(BytePtr soundDescriptionData,
            @NUInt long soundDescriptionSize);

    /**
     * [@function]	CMTextFormatDescriptionCreateFromBigEndianTextDescriptionData
     * 
     * Creates a CMTextFormatDescription from a big-endian TextDescription data structure.
     * 
     * @param	allocator						Allocator to use for allocating the CMTextFormatDescription object. May be NULL.
     * @param	textDescriptionData				TextDescription data structure in big-endian byte ordering.
     * @param	size							Size of TextDescription data structure.
     * @param	flavor							Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	mediaType						Pass kCMMediaType_Text or kCMMediaType_Subtitle.
     * @param	formatDescriptionOut			Receives new CMTextFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCreateFromBigEndianTextDescriptionData(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String textDescriptionData,
            @NUInt long size, CFStringRef flavor, int mediaType, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer
     * 
     * Creates a CMTextFormatDescription from a big-endian TextDescription data structure in a CMBlockBuffer.
     * 
     * @param	allocator						Allocator to use for allocating the CMTextFormatDescription object. May be NULL.
     * @param	textDescriptionBlockBuffer		CMBlockBuffer containing TextDescription data structure in big-endian byte ordering.
     * @param	flavor							Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	mediaType						Pass kCMMediaType_Text or kCMMediaType_Subtitle.
     * @param	formatDescriptionOut			Receives new CMTextFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef textDescriptionBlockBuffer, CFStringRef flavor, int mediaType,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer
     * 
     * Copies the contents of a CMTextFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     *                Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     *                garbage values (0xFFFF).  The caller must overwrite these values with a valid dataRefIndex
     *                if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param	allocator						Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param	textFormatDescription			CMTextFormatDescription to be copied.
     * @param	flavor							Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	blockBufferOut					Receives new CMBlockBuffer containing TextDescription data structure in big-endian byte ordering.
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer(CFAllocatorRef allocator,
            CMFormatDescriptionRef textFormatDescription, CFStringRef flavor, Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMSwapBigEndianTextDescriptionToHost
     * 
     * Converts a TextDescription data structure from big-endian to host-endian in place.
     * 
     * @param	textDescriptionData				TextDescription data structure in big-endian byte ordering to be converted to host-endian byte ordering.
     * @param	textDescriptionSize				Size of TextDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianTextDescriptionToHost(BytePtr textDescriptionData,
            @NUInt long textDescriptionSize);

    /**
     * [@function]	CMSwapHostEndianTextDescriptionToBig
     * 
     * Converts a TextDescription data structure from host-endian to big-endian in place.
     * 
     * @param	textDescriptionData				TextDescription data structure in host-endian byte ordering to be converted to big-endian byte ordering.
     * @param	textDescriptionSize				Size of TextDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianTextDescriptionToBig(BytePtr textDescriptionData,
            @NUInt long textDescriptionSize);

    /**
     * [@function]	CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionData
     * 
     * Creates a CMClosedCaptionFormatDescription from a big-endian ClosedCaptionDescription data structure.
     * 
     * @param	allocator							Allocator to use for allocating the CMClosedCaptionFormatDescription object. May be NULL.
     * @param	closedCaptionDescriptionData		ClosedCaptionDescription data structure in big-endian byte ordering.
     * @param	size								Size of ClosedCaptionDescription data structure.
     * @param	flavor								Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	formatDescriptionOut				Receives new CMClosedCaptionFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionData(
            CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String closedCaptionDescriptionData,
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionBlockBuffer
     * 
     * Creates a CMClosedCaptionFormatDescription from a big-endian ClosedCaptionDescription data structure in a CMBlockBuffer.
     * 
     * @param	allocator							Allocator to use for allocating the CMClosedCaptionFormatDescription object. May be NULL.
     * @param	closedCaptionDescriptionBlockBuffer	CMBlockBuffer containing ClosedCaptionDescription data structure in big-endian byte ordering.
     * @param	flavor								Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	formatDescriptionOut				Receives new CMClosedCaptionFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef closedCaptionDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMClosedCaptionFormatDescriptionCopyAsBigEndianClosedCaptionDescriptionBlockBuffer
     * 
     * Copies the contents of a CMClosedCaptionFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     *                Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     *                garbage values (0xFFFF).  The caller must overwrite these values with a valid dataRefIndex
     *                if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param	allocator							Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param	closedCaptionFormatDescription		CMClosedCaptionFormatDescription to be copied.
     * @param	flavor								Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	blockBufferOut						Receives new CMBlockBuffer containing ClosedCaptionDescription data structure in big-endian byte ordering.
     */
    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCopyAsBigEndianClosedCaptionDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef closedCaptionFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMSwapBigEndianClosedCaptionDescriptionToHost
     * 
     * Converts a ClosedCaptionDescription data structure from big-endian to host-endian in place.
     * 
     * @param	closedCaptionDescriptionData	ClosedCaptionDescription data structure in big-endian byte ordering to be converted to host-endian byte ordering.
     * @param	closedCaptionDescriptionSize	Size of ClosedCaptionDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianClosedCaptionDescriptionToHost(BytePtr closedCaptionDescriptionData,
            @NUInt long closedCaptionDescriptionSize);

    /**
     * [@function]	CMSwapHostEndianClosedCaptionDescriptionToBig
     * 
     * Converts a ClosedCaptionDescription data structure from host-endian to big-endian in place.
     * 
     * @param	closedCaptionDescriptionData	ClosedCaptionDescription data structure in host-endian byte ordering to be converted to big-endian byte ordering.
     * @param	closedCaptionDescriptionSize	Size of ClosedCaptionDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianClosedCaptionDescriptionToBig(BytePtr closedCaptionDescriptionData,
            @NUInt long closedCaptionDescriptionSize);

    /**
     * [@function]	CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionData
     * 
     * Creates a CMTimeCodeFormatDescription from a big-endian TimeCodeDescription data structure.
     * 
     * @param	allocator						Allocator to use for allocating the CMTimeCodeFormatDescription object. May be NULL.
     * @param	timeCodeDescriptionData			TimeCodeDescription data structure in big-endian byte ordering.
     * @param	size							Size of TimeCodeDescription data structure.
     * @param	flavor							Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	formatDescriptionOut			Receives new CMTimeCodeFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionData(
            CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String timeCodeDescriptionData,
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer
     * 
     * Creates a CMTimeCodeFormatDescription from a big-endian TimeCodeDescription data structure in a CMBlockBuffer.
     * 
     * @param	allocator						Allocator to use for allocating the CMTimeCodeFormatDescription object. May be NULL.
     * @param	timeCodeDescriptionBlockBuffer	CMBlockBuffer containing TimeCodeDescription data structure in big-endian byte ordering.
     * @param	flavor							Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	formatDescriptionOut			Receives new CMTimeCodeFormatDescription.
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef timeCodeDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer
     * 
     * Copies the contents of a CMTimeCodeFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     *                Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     *                garbage values (0xFFFF).  The caller must overwrite these values with a valid dataRefIndex
     *                if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param	allocator					Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param	timeCodeFormatDescription	CMTimeCodeFormatDescription to be copied.
     * @param	flavor						Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	blockBufferOut				Receives new CMBlockBuffer containing TimeCodeDescription data structure in big-endian byte ordering.
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef timeCodeFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMSwapBigEndianTimeCodeDescriptionToHost
     * 
     * Converts a TimeCodeDescription data structure from big-endian to host-endian in place.
     * 
     * @param	timeCodeDescriptionData			TimeCodeDescription data structure in big-endian byte ordering to be converted to host-endian byte ordering.
     * @param	timeCodeDescriptionSize			Size of TimeCodeDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianTimeCodeDescriptionToHost(BytePtr timeCodeDescriptionData,
            @NUInt long timeCodeDescriptionSize);

    /**
     * [@function]	CMSwapHostEndianTimeCodeDescriptionToBig
     * 
     * Converts a TimeCodeDescription data structure from host-endian to big-endian in place.
     * 
     * @param	timeCodeDescriptionData			TimeCodeDescription data structure in host-endian byte ordering to be converted to big-endian byte ordering.
     * @param	timeCodeDescriptionSize			Size of TimeCodeDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianTimeCodeDescriptionToBig(BytePtr timeCodeDescriptionData,
            @NUInt long timeCodeDescriptionSize);

    /**
     * [@function]	CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionData
     * 
     * Creates a CMMetadataFormatDescription from a big-endian MetadataDescription data structure.
     * 
     * @param	allocator					Allocator to use for allocating the CMMetadataFormatDescription object. May be NULL.
     * @param	metadataDescriptionData		MetadataDescription data structure in big-endian byte ordering.
     * @param	size						Size of MetadataDescription data structure.
     * @param	flavor						Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	formatDescriptionOut		Receives new CMMetadataFormatDescriptionRef.
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionData(
            CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String metadataDescriptionData,
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer
     * 
     * Creates a CMMetadataFormatDescription from a big-endian MetadataDescription data structure in a CMBlockBuffer.
     * 
     * @param	allocator						Allocator to use for allocating the CMMetadataFormatDescription object. May be NULL.
     * @param	metadataDescriptionBlockBuffer	CMBlockBuffer containing MetadataDescription data structure in big-endian byte ordering.
     * @param	flavor							Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	formatDescriptionOut			Receives new CMMetadataFormatDescriptionRef.
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef metadataDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer
     * 
     * Copies the contents of a CMMetadataFormatDescription to a CMBlockBuffer in big-endian byte ordering.
     * 
     * On return, the caller owns the returned CMBlockBuffer, and must release it when done with it.
     *                Note that the dataRefIndex field of the SampleDescription is intentionally filled with
     *                garbage values (0xFFFF).  The caller must overwrite these values with a valid dataRefIndex
     *                if writing the SampleDescription to a QuickTime/ISO file.
     * 
     * @param	allocator					Allocator to use for allocating the CMBlockBuffer object. May be NULL.
     * @param	metadataFormatDescription	CMMetadataFormatDescriptionRef to be copied.
     * @param	flavor						Reserved for future use. Pass NULL for QuickTime Movie or ISO flavor.
     * @param	blockBufferOut				Receives new CMBlockBuffer containing MetadataDescription data structure in big-endian byte ordering.
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef metadataFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * [@function]	CMSwapBigEndianMetadataDescriptionToHost
     * 
     * Converts a MetadataDescription data structure from big-endian to host-endian in place.
     * 
     * @param	metadataDescriptionData			MetadataDescription data structure in big-endian byte ordering to be converted to host-endian byte ordering.
     * @param	metadataDescriptionSize			Size of MetadataDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapBigEndianMetadataDescriptionToHost(BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    /**
     * [@function]	CMSwapHostEndianMetadataDescriptionToBig
     * 
     * Converts a MetadataDescription data structure from host-endian to big-endian in place.
     * 
     * @param	metadataDescriptionData			MetadataDescription data structure in host-endian byte ordering to be converted to big-endian byte ordering.
     * @param	metadataDescriptionSize			Size of MetadataDescription data structure.
     */
    @Generated
    @CFunction
    public static native int CMSwapHostEndianMetadataDescriptionToBig(BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    /**
     * [@function]	CMBufferQueueGetCallbacksForUnsortedSampleBuffers
     * 
     * Returns a pointer to a callback struct for unsorted CMSampleBuffers, provided as a convenience.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForUnsortedSampleBuffers();

    /**
     * [@function]	CMBufferQueueGetCallbacksForOutputPTSSortedSampleBuffers
     * 
     * Returns a pointer to a callback struct for CMSampleBuffers sorted by output presentation timestamp, provided as a convenience.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForSampleBuffersSortedByOutputPTS();

    /**
     * [@function]	CMBufferQueueCreate
     * 
     * Creates a CMBufferQueue object.
     * 
     * On return, the caller owns the returned CMBufferQueue, and must release it when done with it.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCreate(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBufferCallbacks callbacks,
            Ptr<CMBufferQueueRef> queueOut);

    /**
     * [@function]	CMBufferQueueGetTypeID
     * 
     * Returns the CFTypeID of CMBufferQueue objects.
     * 
     * You can check if a CFTypeRef object is actually a CMBufferQueue by comparing CFGetTypeID(object) with CMBufferQueueGetTypeID().
     * 
     * @return		CFTypeID of CMBufferQueue objects.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTypeID();

    /**
     * [@function]   CMBufferQueueEnqueue
     * 
     * Enqueues a buffer onto a CMBufferQueue.
     * 
     * The buffer is retained by the queue, so the client can safely release the buffer if it has no further use for it.
     * If the compare callback is non-NULL, this API performs an insertion sort using that compare operation.
     * If the validation callback is non-NULL, this API calls it; if it returns a nonzero OSStatus, 
     * the buffer will not be enqueued and this API will return the same error OSStatus.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueEnqueue(CMBufferQueueRef queue, ConstVoidPtr buf);

    /**
     *    [@function]   CMBufferQueueDequeueAndRetain
     * 
     * Dequeues a buffer from a CMBufferQueue.
     * 
     * The buffer is released by the queue, but it is also retained for the client. Buffer ownership is thereby
     * 			transferred from queue to client.  The client need not retain the buffer, but is responsible to release
     * 			it when done with it.
     * 
     * @return		The dequeued buffer.  Will be NULL if the queue is empty.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueAndRetain(CMBufferQueueRef queue);

    /**
     *    [@function]   CMBufferQueueDequeueIfDataReadyAndRetain
     * 
     * Dequeues a buffer from a CMBufferQueue if it is ready.
     * 
     * The buffer is released by the queue, but it is also retained for the client. Buffer ownership is thereby
     * 			transferred from queue to client.  The client need not retain the buffer, but is responsible to release
     * 			it when done with it.
     * 
     * @return		The dequeued buffer.  Will be NULL if the queue is empty, or if the buffer to be dequeued is not yet ready.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueIfDataReadyAndRetain(CMBufferQueueRef queue);

    /**
     *    [@function]   CMBufferQueueGetHead
     * 
     * Retrieves the next-to-dequeue buffer from a CMBufferQueue but leaves it in the queue.
     * 
     * This follows CF "Get" semantics -- it does not retain the returned buffer.
     *    			Note that with non-FIFO queues it's not guaranteed that the next dequeue will return
     *    			this particular buffer (if an intervening Enqueue adds a buffer that will dequeue next).
     * 
     * @return		The buffer.  Will be NULL if the queue is empty.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueGetHead(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueIsEmpty
     * 
     * Returns whether or not a CMBufferQueue is empty.
     * 
     * @return		Whether or not the CMBufferQueue is empty. If queue is NULL, true is returned.
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueIsEmpty(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueMarkEndOfData
     * 
     * Marks a CMBufferQueue with EOD.
     * 
     * All subsequent Enqueues will be rejected until CMBufferQueueReset is called.
     * 			Subsequent Dequeues will succeed as long as the queue is not empty.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueMarkEndOfData(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueContainsEndOfData
     * 
     * Returns whether or not a CMBufferQueue has been marked with EOD.
     * 
     * @return		Whether or not the CMBufferQueue has been marked with EOD.
     * 			If queue is NULL, true is returned (a NULL queue is considered to
     * 			be empty, and permanently at EOD).
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueContainsEndOfData(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueIsAtEndOfData
     * 
     * Returns whether or not a CMBufferQueue has been marked with EOD, and is now empty.
     * 
     * @return		Whether or not the CMBufferQueue has been marked with EOD, and is now empty.
     * 			If queue is NULL, true is returned (a NULL queue is considered to
     * 			be empty, and permanently at EOD).
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueIsAtEndOfData(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueReset
     * 
     * Resets a CMBufferQueue. Empties the queue, and clears any EOD mark.
     * 
     * All buffers in the queue are released.  Triggers are not removed, however,
     * 			and will be called appropriately as the queue duration goes to zero.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueReset(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueResetWithCallback
     * 
     * Calls a function for every buffer in a queue, then resets the queue.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueResetWithCallback(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueResetWithCallback") Function_CMBufferQueueResetWithCallback callback,
            VoidPtr refcon);

    /**
     * [@function]	CMBufferQueueGetBufferCount
     * 
     * Gets the number of buffers in the queue.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMBufferQueueGetBufferCount(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetDuration
     * 
     * Gets the duration of a CMBufferQueue.
     * 
     * The duration of the CMBufferQueue is the sum of all the individual
     * 			buffer durations, as reported by the getDuration callback (provided to
     * 			CMBufferQueueCreate).  If there are no buffers in the queue,
     * 			kCMTimeZero will be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetDuration(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetMinDecodeTimeStamp
     * 
     * Gets the earliest decode timestamp of a CMBufferQueue.
     * 
     * The search for earliest decode timstamp is performed in this API.
     * 			If you know your queue is in decode order, GetFirstDecodeTimeStamp
     * 			is a faster alternative.  If the getDecodeTimeStamp callback is
     * 			NULL, kCMTimeInvalid will be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinDecodeTimeStamp(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetFirstDecodeTimeStamp
     * 
     * Gets the decode timestamp of the first buffer in a CMBufferQueue.
     * 
     * This API is is a faster alternative to GetMinDecodeTimeStamp,
     * 			but only gives the same answer if your queue is in decode order.
     * 			If the getDecodeTimeStamp callback is NULL, kCMTimeInvalid will
     * 			be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstDecodeTimeStamp(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetMinPresentationTimeStamp
     * 
     * Gets the earliest presentation timestamp of a CMBufferQueue.
     * 
     * The search for earliest presentation timstamp is performed in
     * 			this API. If you know your queue is sorted by presentation time,
     * 			GetFirstPresentationTimeStamp is a faster alternative. If the
     * 			getPresentationTimeStamp callback is NULL, kCMTimeInvalid will
     * 			be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinPresentationTimeStamp(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetFirstPresentationTimeStamp
     * 
     * Gets the presentation timestamp of the first buffer in a CMBufferQueue.
     * 
     * This API is is a faster alternative to GetMinPresentationTimeStamp,
     * 			but only works if you know your queue is sorted by presentation
     * 			timestamp. If the getPresentationTimeStamp callback is NULL,
     * 			kCMTimeInvalid will be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstPresentationTimeStamp(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetMaxPresentationTimeStamp
     * 
     * Gets the greatest presentation timestamp of a CMBufferQueue.
     * 
     * If the getPresentationTimeStamp callback is NULL, kCMTimeInvalid will
     * 			be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMaxPresentationTimeStamp(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetEndPresentationTimeStamp
     * 
     * Gets the greatest end presentation timestamp of a CMBufferQueue.
     * 
     * This is the maximum end time (PTS + duration) of buffers in the queue.
     * 			If the getPresentationTimeStamp callback is NULL, kCMTimeInvalid will
     * 			be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetEndPresentationTimeStamp(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueGetTotalSize
     * 
     * Gets the total size of all sample buffers of a CMBufferQueue.
     * 
     * The total size of the CMBufferQueue is the sum of all the individual
     * 			buffer sizes, as reported by the getTotalSize callback (provided to
     * 			CMBufferQueueCreate).  If there are no buffers in the queue,
     * 			0 will be returned.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTotalSize(CMBufferQueueRef queue);

    /**
     * [@function]	CMBufferQueueInstallTrigger
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * The returned trigger token can be passed to CMBufferQueueTestTrigger and CMBufferQueueRemoveTrigger.
     * 			The triggerTokenOut parameter can be NULL (client doesn't need to test or remove trigger), and the
     * 			callback parameter can be NULL (client doesn't need callbacks, but rather will explicitly
     * 			test the trigger).  One of these two parameters must be non-NULL, however, since an untestable
     * 			trigger that does not perform a callback is meaningless.  If the trigger condition is already true,
     * 			CMBufferQueueInstallTrigger will call the callback.  If it does this, it will first write
     * 			the trigger token to *triggerTokenOut.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTrigger(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueInstallTrigger") Function_CMBufferQueueInstallTrigger callback,
            VoidPtr refcon, int condition, @ByValue CMTime time, Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    /**
     * [@function]	CMBufferQueueInstallTriggerWithIntegerThreshold
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * This function behaves the same way as CMBufferQueueInstallTrigger() except the trigger is evaluated against
     * 			the integer value rather than the time value.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerWithIntegerThreshold(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueInstallTriggerWithIntegerThreshold") Function_CMBufferQueueInstallTriggerWithIntegerThreshold callback,
            VoidPtr refcon, int condition, @NInt long threshold, Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    /**
     * [@function]	CMBufferQueueRemoveTrigger
     * 
     * Removes a previously installed trigger from a CMBufferQueue.
     * 
     * Triggers will automatically be removed when a queue is finalized.  However, if more
     * 			than one module has access to a queue, it may be hard for an individual module to know
     * 			when the queue is finalized since other modules may retain it.  To address this concern,
     * 			modules should remove their triggers before they themselves are finalized.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueRemoveTrigger(CMBufferQueueRef queue, CMBufferQueueTriggerToken triggerToken);

    /**
     * [@function]	CMBufferQueueTestTrigger
     * 
     * Tests whether the trigger condition is true.
     * 
     * Whereas the trigger callback will only be called when the condition goes from false
     * 			to true, CMBufferQueueTestTrigger always returns the condition's current status.
     * 			The triggerToken must be one that has been installed on this queue.
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueTestTrigger(CMBufferQueueRef queue, CMBufferQueueTriggerToken triggerToken);

    /**
     * [@function]	CMBufferQueueCallForEachBuffer
     * 
     * Calls a function for every buffer in a queue.
     * 
     * If the callback function returns an error, iteration will stop immediately
     * 			and the error will be returned.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCallForEachBuffer(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueCallForEachBuffer") Function_CMBufferQueueCallForEachBuffer callback,
            VoidPtr refcon);

    /**
     * [@function]	CMBufferQueueSetValidationCallback
     * 
     * Sets a function that CMBufferQueueEnqueue will call to validate buffers before adding them to the queue.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueSetValidationCallback(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueSetValidationCallback") Function_CMBufferQueueSetValidationCallback callback,
            VoidPtr refcon);

    /**
     * [@function]	CMSimpleQueueGetTypeID
     * 
     * Returns the CFTypeID of CMSimpleQueue objects.
     * 
     * You can check if a CFTypeRef object is actually a CMSimpleQueue by comparing CFGetTypeID(object)
     * 			with CMSimpleQueueGetTypeID().
     * 
     * @return		CFTypeID of CMSimpleQueue objects.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSimpleQueueGetTypeID();

    /**
     * [@function]	CMSimpleQueueCreate
     * 
     * Creates a CMSimpleQueue.
     * 
     * On return, the caller owns the returned CMSimpleQueue, and must release it when done with it.
     * 
     *    @return		Returns noErr if the call succeeds.  Returns kCMSimpleQueueError_ParameterOutOfRange if
     * 			capacity is negative.
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueCreate(CFAllocatorRef allocator, int capacity,
            Ptr<CMSimpleQueueRef> queueOut);

    /**
     * [@function]	CMSimpleQueueEnqueue
     * 
     * Enqueues an element on the queue.
     * 
     * If the queue is full, this operation will fail.
     * 
     * @return		Returns noErr if the call succeeds, kCMSimpleQueueError_QueueIsFull if the queue is full.
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueEnqueue(CMSimpleQueueRef queue, ConstVoidPtr element);

    /**
     * [@function]	CMSimpleQueueDequeue
     * 
     * Dequeues an element from the queue.
     * 
     * If the queue is empty, NULL will be returned.
     * 
     * @return		The dequeued element.  NULL if the queue was empty, or if there was some other error.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueDequeue(CMSimpleQueueRef queue);

    /**
     * [@function]	CMSimpleQueueGetHead
     * 
     * Returns the element at the head of the queue.
     * 
     * If the queue is empty, NULL will be returned.
     * 
     * @return		The head element.  NULL if the queue was empty, or if there was some other error.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueGetHead(CMSimpleQueueRef queue);

    /**
     * [@function]	CMSimpleQueueReset
     * 
     * Resets the queue.
     * 
     * This function resets the queue to its empty state;  all values
     * 			in the queue prior to reset are lost.   Note that CMSimpleQueueReset
     * 			is not synchronized in any way, so the reader thread and writer thread
     * 			must be held off by the client during this operation.
     * 
     * @return		Returns noErr if the call succeeds.
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueReset(CMSimpleQueueRef queue);

    /**
     * [@function]	CMSimpleQueueGetCapacity
     * 
     * Returns the number of elements that can be held in the queue.
     * 
     * @return		The number of elements that can be held in the queue.  Returns
     * 			0 if there is an error.
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCapacity(CMSimpleQueueRef queue);

    /**
     * [@function]	CMSimpleQueueGetCount
     * 
     * Returns the number of elements currently on the queue.
     * 
     * @return		The number of elements currently in the queue. Returns 0 if there is an error.
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCount(CMSimpleQueueRef queue);

    @Generated
    @CFunction
    @NUInt
    public static native long CMMemoryPoolGetTypeID();

    /**
     * [@function]	CMMemoryPoolCreate
     * 
     * Creates a new CMMemoryPool.
     */
    @Generated
    @CFunction
    public static native CMMemoryPoolRef CMMemoryPoolCreate(CFDictionaryRef options);

    /**
     * [@function]	CMMemoryPoolGetAllocator
     * 
     * Returns the pool's CFAllocator.
     */
    @Generated
    @CFunction
    public static native CFAllocatorRef CMMemoryPoolGetAllocator(CMMemoryPoolRef pool);

    /**
     * [@function]	CMMemoryPoolFlush
     * 
     * Deallocates all memory the pool was holding for recycling.
     */
    @Generated
    @CFunction
    public static native void CMMemoryPoolFlush(CMMemoryPoolRef pool);

    /**
     * [@function]	CMMemoryPoolInvalidate
     * 
     * Stops the pool from recycling.
     * 
     * 	When CMMemoryPoolInvalidate is called the pool's allocator stops recycling memory.
     * 	The pool deallocates any memory it was holding for recycling.
     * 	This also happens when the retain count of the CMMemoryPool drops to zero, 
     * 	except that under GC it may be delayed.
     */
    @Generated
    @CFunction
    public static native void CMMemoryPoolInvalidate(CMMemoryPoolRef pool);

    /**
     * 	[@function]	CMMetadataCreateIdentifierForKeyAndKeySpace
     * 
     * Creates a URL-like string identifier that represents a key/keyspace tuple.
     * 
     * Metadata entities are identified by a key whose interpretation
     *                 is defined by its keyspace.  When writing metadata to a QuickTime
     *                 Movie, this tuple is part of the track's format description.
     * 
     *                 The following constants make up the current list of supported keyspaces,
     * 				which are documented elsewhere in this file:
     * <ul>				kCMMetadataKeySpace_QuickTimeUserData
     * <li>				kCMMetadataKeySpace_ISOUserData
     * <li>				kCMMetadataKeySpace_iTunes
     * <li>				kCMMetadataKeySpace_ID3
     * <li>				kCMMetadataKeySpace_QuickTimeMetadata
     * <li>				kCMMetadataKeySpace_Icy
     * </ul>
     * 				Some keyspaces use OSTypes (a.k.a. FourCharCodes) to define their
     * 				keys, and as such their keys are four bytes in length. The keyspaces
     * 				that fall into this category are: kCMMetadataKeySpace_QuickTimeUserData,
     * 				kCMMetadataKeySpace_ISOUserData, kCMMetadataKeySpace_iTunes, and
     * 				kCMMetadataKeySpace_ID3.
     * 
     * 				The keyspace kCMMetadataKeySpace_QuickTimeMetadata defines its
     * 				key values to be expressed as reverse-DNS strings, which allows
     * 				third parties to define their own keys in a well established way
     * 				that avoids collisions.
     * 
     * 				As a matter of convenience, known keyspaces allow for a key
     * 				to be passed in using a variety of CFTypes.  Note that what
     * 				is returned by CMMetadataCreateKeyFromIdentifier depends upon the
     * 				keyspace, and may be a different CFType than what is passed
     * 				to this routine (see the discussion below for what CFTypes are
     * 				returned for known keyspaces).  To get a key represented as
     * 				CFData, call CMMetadataCreateKeyFromIdentifierAsCFData.
     * 
     * 				For OSType keyspaces, a key may be passed as a CFNumber,
     * 				a CFString, or a CFData. A key passed as a CFNumber will have
     * 				its value retrieved as kCFNumberSInt32Type comprising the four
     * 				bytes of the key’s numeric value in big-endian byte order.
     * 				A key passed as a CFString must be a valid ASCII string of four
     * 				characters. A key passed as a CFData must be comprised of the
     * 				four bytes of the key’s numeric value in big-endian byte order.
     * 
     * 				All other keyspaces allow the key to be passed as a CFString
     * 				or CFData. In both cases, the key will be interpreted as an
     * 				ASCII string for the purposes of identifier encoding.
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateIdentifierForKeyAndKeySpace(CFAllocatorRef allocator, ConstVoidPtr key,
            CFStringRef keySpace, Ptr<CFStringRef> identifierOut);

    /**
     * [@function]	CMMetadataCreateKeyFromIdentifier
     * 
     * Creates a copy of the key encoded in the identifier as a CFType.
     * 
     * The returned CFType is based on the keyspace encoded in the identifier.
     * 
     *    			For OSType keyspaces, the key will be returned as a CFNumber,
     * 			where a big endian interpretation of its kCFNumberSInt32Type value
     * 			represents the four bytes of the key's numeric value.
     * 
     *    			For the keyspaces kCMMetadataKeySpace_QuickTimeMetadata and
     * 			kCMMetadataKeySpace_Icy, the key will be returned as a CFString.
     * 
     * 			All other keyspaces will have the function return the key as a CFData.
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifier(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<ConstVoidPtr> keyOut);

    /**
     * [@function]	CMMetadataCreateKeyFromIdentifierAsCFData
     * 
     * Creates a copy of the key value that was encoded in the identifier as CFData.
     * 			The bytes in the CFData correpsond to how they are serialized in the file.
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifierAsCFData(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<CFDataRef> keyOut);

    /**
     * [@function]	CMMetadataCreateKeySpaceFromIdentifier
     * 
     * Creates a copy of the key value that was encoded in the identifier as CFData.
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeySpaceFromIdentifier(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<CFStringRef> keySpaceOut);

    /**
     * [@function]	CMMetadataDataTypeRegistryRegisterDataType
     * 
     * Register a data type with the data type registry.
     * 
     * This routine is called by clients to register a data type with
     * 			the data type registry.  The list of conforming data type identifiers
     * 			must include a base data type.  If the data type has already
     * 			been registered, then it is not considered an error to re-register it
     * 			as long as the list of conforming data type identifiers has the same
     * 			entries as the original;  otherwise an error will be returned.
     */
    @Generated
    @CFunction
    public static native int CMMetadataDataTypeRegistryRegisterDataType(CFStringRef dataType, CFStringRef description,
            CFArrayRef conformingDataTypes);

    /**
     * [@function]	CMMetadataDataTypeRegistryDataTypeIsRegistered
     * 
     * Tests a data type identifier to see if it has been registered.
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsRegistered(CFStringRef dataType);

    /**
     * [@function]	CMMetadataDataTypeRegistryGetDataTypeDescription
     * 
     * Returns the data type's description (if any was provided when it was registered).
     */
    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetDataTypeDescription(CFStringRef dataType);

    /**
     * [@function]	CMMetadataDataTypeRegistryGetConformingDataTypes
     * 
     * Returns the data type's conforming data types (if any were
     * 			provided when it was registered).
     * [@returns]	List of conforming data types registered for the given data type.
     * 			NULL is returned if the data type has not been registered.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetConformingDataTypes(CFStringRef dataType);

    /**
     * 	[@function]	CMMetadataDataTypeRegistryDataTypeConformsToDataType
     * 
     * Checks to see if a data type conforms to another data type.
     * 
     * A given data type will conform to a second data type if any of
     * 				the following are true:
     * <ul>				1. The data type identifiers are the same.
     * <li>				2. The first data type identifier's conformance list contains the second data type identifier.
     * <li>				3. A recursive search of the conforming data types for each element in the first
     * <li>				   data type's conformance list yields the second data type identifer.
     * </ul>
     * 	[@returns]	True if the first data type conforms to the second data type.
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeConformsToDataType(CFStringRef dataType,
            CFStringRef conformsToDataType);

    /**
     * [@function]	CMMetadataDataTypeRegistryGetBaseDataTypes
     * 
     * Returns an array of base data type identifiers.
     * 
     * There are a set of base data types that seed the data type
     * 			registry.  All valid data types will have their conformance search
     * 			end with a base data type.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetBaseDataTypes();

    /**
     * [@function]	CMMetadataDataTypeRegistryDataTypeIsBaseDataType
     * 
     * Tests a data type identifier to see if it represents a base data type.
     * 
     * This is simply a convenience method to test to see if a given
     * 			data type identifier is in the array returned by
     * 			CMMetadataDataTypeRegistryGetBaseDataTypes.
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsBaseDataType(CFStringRef dataType);

    /**
     * [@function]	CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType
     * 
     * Returns the base data type identifier that the given data type
     * 			conforms to.
     * 
     * There are a set of base data types that seed the data type
     * 			registry.  All valid data types will have their conformance search
     * 			end with a base data type.
     */
    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType(
            CFStringRef dataType);

    /**
     * [@function]	CMAudioClockCreate
     * 
     * Creates a clock that advances at the same rate as audio output.
     * 
     * 	This clock will not drift from audio output, but may drift from CMClockGetHostTimeClock().
     * 	When audio output is completely stopped, the clock continues to advance, tracking CMClockGetHostTimeClock() 
     * 	until audio output starts up again.
     * 	This clock is suitable for use as AVPlayer.masterClock when synchronizing video-only playback 
     * 	with audio played through other APIs or objects.
     * 
     * @param	allocator
     * 	A CFAllocator to use to allocate the clock.  
     * 	Pass kCFAllocatorDefault or NULL to use the default allocator.
     * @param	clockOut
     * 	Points to a CMClockRef to receive the newly created clock.
     * 	The caller is responsible for calling CFRelease to release this clock.
     */
    @Generated
    @CFunction
    public static native int CMAudioClockCreate(CFAllocatorRef allocator, Ptr<CMClockRef> clockOut);

    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeInvalid();

    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeIndefinite();

    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimePositiveInfinity();

    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeNegativeInfinity();

    @Generated
    @CVariable()
    @ByValue
    public static native CMTime kCMTimeZero();

    /**
     * [@constant] kCMTimeValueKey
     * 
     * CFDictionary key for value field of CMTime (CFNumber containing int64_t)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeValueKey();

    /**
     * [@constant] kCMTimeScaleKey
     * 
     * CFDictionary key for timescale field of CMTime (CFNumber containing int32_t)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeScaleKey();

    /**
     * [@constant] kCMTimeEpochKey
     * 
     * CFDictionary key for epoch field of CMTime (CFNumber containing int64_t)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeEpochKey();

    /**
     * [@constant] kCMTimeFlagsKey
     * 
     * CFDictionary key for flags field of CMTime (CFNumber containing uint32_t)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeFlagsKey();

    @Generated
    @CVariable()
    @ByValue
    public static native CMTimeRange kCMTimeRangeZero();

    @Generated
    @CVariable()
    @ByValue
    public static native CMTimeRange kCMTimeRangeInvalid();

    /**
     * [@constant] kCMTimeRangeStartKey
     * 
     * CFDictionary key for start field of a CMTimeRange (CMTime)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeRangeStartKey();

    /**
     * [@constant] kCMTimeRangeDurationKey
     * 
     * CFDictionary key for timescale field of a CMTimeRange (CMTime)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeRangeDurationKey();

    @Generated
    @CVariable()
    @ByValue
    public static native CMTimeMapping kCMTimeMappingInvalid();

    /**
     * [@constant] kCMTimeMappingSourceKey
     * 
     * CFDictionary key for source field of a CMTimeMapping (CMTimeRange)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeMappingSourceKey();

    /**
     * [@constant] kCMTimeMappingTargetKey
     * 
     * CFDictionary key for target field of a CMTimeMapping (CMTimeRange)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeMappingTargetKey();

    /**
     * CFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_OriginalCompressionSettings();

    /**
     * CFDictionary of CFString (four-char-code, atom type) -> ( CFData (atom payload) or CFArray of CFData (atom payload) )
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_SampleDescriptionExtensionAtoms();

    /**
     * CFData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimSampleDescription();

    /**
     * CFData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimISOSampleEntry();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FormatName();

    /**
     * CFNumber with depth value as directed by http://developer.apple.com/qa/qa2001/qa1183.html
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Depth();

    /**
     * Many of the following extension keys and values are the same as the corresponding CVImageBuffer attachment keys and values
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_CleanAperture();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHorizontalOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureVerticalOffset();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureWidthRational();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHeightRational();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHorizontalOffsetRational();

    /**
     * CFArray of 2 CFNumbers: numerator, denominator
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureVerticalOffsetRational();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FieldCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FieldDetail();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_TemporalTopFirst();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_TemporalBottomFirst();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_SpatialFirstLineEarly();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionFieldDetail_SpatialFirstLineLate();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_PixelAspectRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_PixelAspectRatioHorizontalSpacing();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_PixelAspectRatioVerticalSpacing();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ColorPrimaries();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_ITU_R_709_2();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_EBU_3213();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_SMPTE_C();

    /**
     * same as kCVImageBufferColorPrimaries_DCI_P3
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_DCI_P3();

    /**
     * same as kCVImageBufferColorPrimaries_P3_D65
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_P3_D65();

    /**
     * same as kCVImageBufferColorPrimaries_ITU_R_2020
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_ITU_R_2020();

    /**
     * same as kCVImageBufferColorPrimaries_P22
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_P22();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_TransferFunction();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_709_2();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_SMPTE_240M_1995();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_UseGamma();

    /**
     * same as kCVImageBufferTransferFunction_ITU_R_2020. note: semantically equivalent to kCMFormatDescriptionTransferFunction_ITU_R_709_2, which is preferred.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_2020();

    /**
     * same as kCVImageBufferTransferFunction_SMPTE_ST_428_1
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_SMPTE_ST_428_1();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_GammaLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_YCbCrMatrix();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_709_2();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_601_4();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_SMPTE_240M_1995();

    /**
     * same as kCVImageBufferYCbCrMatrix_ITU_R_2020
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_2020();

    /**
     * CFBoolean; by default, false for YCbCr-based compressed formats, indicating that pixel values are video-range rather than full-range
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FullRangeVideo();

    /**
     * CFData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ICCProfile();

    /**
     * CFNumber describing the bytes per row of raster pixel data (not used for compressed, planar, tiled or downsampled formats)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_BytesPerRow();

    /**
     * Chroma siting information. For progressive images, only the TopField value is used.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ChromaLocationTopField();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ChromaLocationBottomField();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Left();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Center();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_TopLeft();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Top();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_BottomLeft();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_Bottom();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionChromaLocation_DV420();

    /**
     * CFNumber specifying a kCMMPEG2VideoProfile_*
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionConformsToMPEG2VideoProfile();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_TemporalQuality();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_SpatialQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimImageDescription();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Version();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_RevisionLevel();

    /**
     * CFString of fourCC
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Vendor();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionVendor_Apple();

    /**
     * CFNumber (SInt32 holding CMTextDisplayFlags)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DisplayFlags();

    /**
     * CFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_BackgroundColor();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Red();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Green();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Blue();

    /**
     * CFNumber (SInt8 for 3G), not applicable for QT text.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Alpha();

    /**
     * CFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultTextBox();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Top();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Left();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Bottom();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Right();

    /**
     * CFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultStyle();

    /**
     * CFNumber (SInt16 for 3G), (SInt32 for QT)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_StartChar();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Font();

    /**
     * CFNumber (SInt8)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_FontFace();

    /**
     * CFDictionary (kCMTextFormatDescriptionColor_Red, kCMTextFormatDescriptionColor_Green, etc)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_ForegroundColor();

    /**
     * CFNumber (SInt8 for 3G), (SInt16 for QT)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_FontSize();

    /**
     * CFNumber (SInt8 holding a CMTextJustificationValue)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_HorizontalJustification();

    /**
     * CFNumber (SInt8 holding a CMTextJustificationValue)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_VerticalJustification();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_EndChar();

    /**
     * CFDictionary (Keys are FontIDs as CFStrings, vals are font names as CFStrings)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_FontTable();

    /**
     * CFNumber (SInt32 holding a CMTextJustificationValue)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_TextJustification();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Height();

    /**
     * CFNumber (SInt16)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Ascent();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultFontName();

    /**
     * CFDictionary containing the following two keys
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionExtension_SourceReferenceName();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionKey_Value();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionKey_LangCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtensionKey_MetadataKeyTable();

    /**
     * CFNumber(OSType) native endian
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_Namespace();

    /**
     * CFData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_Value();

    /**
     * CFNumber(OSType) native endian
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_LocalID();

    /**
     * CFData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_DataType();

    /**
     * CFNumber(SInt32) native endian
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_DataTypeNamespace();

    /**
     * CFArray(CFDictionary) of DataType and DataTypeNamespace
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_ConformingDataTypes();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_LanguageTag();

    /**
     * CFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_StructuralDependency();

    /**
     * CFData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_SetupData();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescription_StructuralDependencyKey_DependencyIsInvalidFlag();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_Identifier();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_DataType();

    /**
     * CFString in BCP 47 format
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_ExtendedLanguageTag();

    /**
     * CFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_StructuralDependency();

    /**
     * CFData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_SetupData();

    @Generated
    @CVariable()
    @ByValue
    public static native CMSampleTimingInfo kCMTimingInfoInvalid();

    /**
     * [@constant]	kCMSampleBufferNotification_DataBecameReady
     * 
     * Posted on a CMSampleBuffer by CMSampleBufferSetDataReady when the buffer becomes ready.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotification_DataBecameReady();

    /**
     * [@constant]	kCMSampleBufferNotification_DataFailed
     * 
     * Posted on a CMSampleBuffer by CMSampleBufferSetDataFailed to report that the buffer will never become ready.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotification_DataFailed();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotificationParameter_OSStatus();

    /**
     * payload: CFDictionary containing:
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_InhibitOutputUntil();

    /**
     * payload: CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_ResumeTag();

    /**
     * [@constant]	kCMSampleBufferConduitNotification_ResetOutput
     * 
     * Posted on a conduit of CMSampleBuffers (eg, a CMBufferQueue) to request invalidation of pending output data.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_ResetOutput();

    /**
     * payload: CFDictionary containing:
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_UpcomingOutputPTSRangeChanged();

    /**
     * payload: CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_UpcomingOutputPTSRangeMayOverlapQueuedOutputPTSRange();

    /**
     * payload: CFDictionary(CMTime)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_MinUpcomingOutputPTS();

    /**
     * payload: CFDictionary(CMTime)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_MaxUpcomingOutputPTS();

    /**
     * payload: CFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConsumerNotification_BufferConsumed();

    /**
     * CFBoolean (absence of this key implies Sync)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_NotSync();

    /**
     * CFBoolean (absence of this key implies not Partial Sync. If NotSync is false, PartialSync should be ignored.)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_PartialSync();

    /**
     * kCFBooleanTrue, kCFBooleanFalse, or absent if unknown
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HasRedundantCoding();

    /**
     * kCFBooleanTrue, kCFBooleanFalse, or absent if unknown
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_IsDependedOnByOthers();

    /**
     * kCFBooleanTrue (e.g., non-I-frame), kCFBooleanFalse (e.g. I-frame), or absent if unknown
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DependsOnOthers();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_EarlierDisplayTimesAllowed();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DisplayImmediately();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DoNotDisplay();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ResetDecoderBeforeDecoding();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DrainAfterDecoding();

    /**
     * CFDictionary (client-defined)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_PostNotificationWhenConsumed();

    /**
     * CFNumber (ResumeTag)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ResumeOutput();

    /**
     * [@constant]	kCMSampleBufferAttachmentKey_TransitionID
     * 
     * Marks a transition from one source of buffers (eg. song) to another
     * 
     * 	For example, during gapless playback of a list of songs, this attachment marks the first buffer from the next song.
     * 	If this attachment is on a buffer containing no samples, the first following buffer that contains samples is the
     * 	buffer that contains the first samples from the next song.  The value of this attachment is a CFTypeRef.  This
     * 	transition identifier should be unique within a playlist, so each transition in a playlist is uniquely
     * 	identifiable.  A CFNumberRef counter that increments with each transition is a simple example.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TransitionID();

    /**
     * CFDictionary/CMTime, default 0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TrimDurationAtStart();

    /**
     * CFDictionary/CMTime, default 0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TrimDurationAtEnd();

    /**
     * CFNumber, positive, default 1
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SpeedMultiplier();

    /**
     * CFBoolean, default false
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_Reverse();

    /**
     * CFBoolean, default false
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_FillDiscontinuitiesWithSilence();

    /**
     * CFBoolean, default false
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_EmptyMedia();

    /**
     * CFBoolean, default false
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_PermanentEmptyMedia();

    /**
     * [@constant]	kCMSampleBufferAttachmentKey_DisplayEmptyMediaImmediately
     * 
     * Tells that the empty marker should be dequeued immediately regardless of its timestamp.
     * 
     * 	Marker sample buffers with this attachment in addition to kCMSampleBufferAttachmentKey_EmptyMedia
     * 	are used to tell that the empty sample buffer should be dequeued immediately regardless of its timestamp.
     * 	This attachment should only be used with sample buffers with the kCMSampleBufferAttachmentKey_EmptyMedia
     * 	attachment.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DisplayEmptyMediaImmediately();

    /**
     * CFBoolean, default false
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_EndsPreviousSampleDuration();

    /**
     * CFURL
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SampleReferenceURL();

    /**
     * CFNumber, byte offset from beginning of URL to contiguous data
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SampleReferenceByteOffset();

    /**
     * CFNumber, audio decoder refresh count
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_GradualDecoderRefresh();

    /**
     * CFString, frame drop reason
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DroppedFrameReason();

    /**
     * [@constant]	kCMSampleBufferDroppedFrameReason_FrameWasLate
     * 
     * The frame was dropped because it was late
     * 
     * 	The value of kCMSampleBufferAttachmentKey_DroppedFrameReason if a video capture client has indicated 
     * 	that late video frames should be dropped and the current frame is late.  This condition is typically
     * 	caused by the client's processing taking too long.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_FrameWasLate();

    /**
     * [@constant]	kCMSampleBufferDroppedFrameReason_OutOfBuffers
     * 
     * The frame was dropped because the module providing frames is out of buffers
     * 
     * 	The value of kCMSampleBufferAttachmentKey_DroppedFrameReason if the module providing sample buffers
     * 	has run out of source buffers.  This condition is typically caused by the client holding onto
     * 	buffers for too long and can be alleviated by returning buffers to the provider.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_OutOfBuffers();

    /**
     * [@constant]	kCMSampleBufferDroppedFrameReason_Discontinuity
     * 
     * An unknown number of frames were dropped
     * 
     * 	The value of kCMSampleBufferAttachmentKey_DroppedFrameReason if the module providing sample buffers
     * 	has experienced a discontinuity, and an unknown number of frames have been lost.  This condition is 
     * 	typically caused by the system being too busy.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_Discontinuity();

    /**
     * [@constant]	kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo
     * 
     * Indicates additional information regarding the dropped video frame.
     * 
     * 	Sample buffers with this attachment contain no image or data buffer.  They mark a dropped video
     * 	frame. If present, this attachment provides additional information about the kCMSampleBufferAttachmentKey_DroppedFrameReason.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo();

    /**
     * [@constant]	kCMSampleBufferDroppedFrameReasonInfo_CameraModeSwitch
     * 
     * A discontinuity was caused by a camera mode switch.
     * 
     * 	The value of kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo if the module providing sample buffers
     * 	has experienced a discontinuity due to a camera mode switch. Short discontinuities of this type can occur when the 
     * 	session is configured for still image capture on some devices.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReasonInfo_CameraModeSwitch();

    /**
     * CFString, one of kCMSampleBufferLensStabilizationInfo_*
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_StillImageLensStabilizationInfo();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Active();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_OutOfRange();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Unavailable();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Off();

    /**
     * [@constant]	kCMSampleBufferAttachmentKey_ForceKeyFrame
     * 
     * Indicates that the current or next video sample buffer should be forced to be encoded as a key frame.
     * 
     * 	A value of kCFBooleanTrue for kCMSampleBufferAttachmentKey_ForceKeyFrame indicates that the current or next video sample buffer processed in the stream should be forced to be encoded as a key frame.
     * 	If this attachment is present and kCFBooleanTrue on a sample buffer with a video frame, that video frame will be forced to become a key frame.  If the sample buffer for which this is present and kCFBooleanTrue does not have a valid video frame, the next sample buffer processed that contains a valid video frame will be encoded as a key frame.
     * 
     * 	Usual care should be taken when setting attachments on sample buffers whose orgins and destinations are ambiguous.  For example, CMSetAttachment() is not thread-safe, and CMSampleBuffers may be used in multiple sample buffer streams in a given system.  This can lead to crashes during concurrent access and/or unexpected behavior on alternate sample buffer streams.  Therefore, unless the orgin and destination of a sample buffer is known, the general recommended practice is to synthesize an empty sample buffer with this attachment alone and insert it into the sample buffer stream ahead of the concrete sample buffer rather than setting this attachment on the concrete sample buffer itself.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ForceKeyFrame();

    /**
     * Posted by a timebase after a change in effective rate.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotification_EffectiveRateChanged();

    /**
     * Posted by a timebase after a discontinuous time jump.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotification_TimeJumped();

    /**
     * Payload key for the time at which a change in effective rate or a discontinuous time jump occurred.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotificationKey_EventTime();

    /**
     * equivalent to NULL
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_QuickTimeMovie();

    /**
     * MP4, etc
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_ISOFamily();

    /**
     * 3GPP (implies ISO)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_3GPFamily();

    /**
     * equivalent to NULL
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_QuickTimeMovie();

    /**
     * 	[@constant]	kCMSoundDescriptionFlavor_QuickTimeMovieV2
     * 
     * Chooses the QuickTime Movie Sound Description V2 format.
     * 
     * A V2 sound description will be written.
     * 			V2 Sound Descriptions contain no legacy CBR layout, and use 'lpcm' for all flavors of PCM.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_QuickTimeMovieV2();

    /**
     * MP4, etc
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_ISOFamily();

    /**
     * 3GPP (implies ISO)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_3GPFamily();

    /**
     * CFNumber (seconds)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMemoryPoolOption_AgeOutPeriod();

    /**
     * [@const]      kCMTextMarkupAttribute_ForegroundColorARGB
     * 
     * The foreground color for text.
     * 
     * Value must be a CFArray of 4 CFNumbers representing alpha, red, green, and blue fields with values between 0.0 and 1.0. The
     *             red, green and blue components are interpreted in the sRGB color space. The alpha indicates the opacity from 0.0 for transparent to
     *             1.0 for 100% opaque.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_ForegroundColorARGB();

    /**
     * [@const]      kCMTextMarkupAttribute_BackgroundColorARGB
     * 
     * The background color for the shape holding the text.
     * 
     * Value must be a CFArray of 4 CFNumbers representing alpha, red, green, and blue fields with values between 0.0 and 1.0. The
     *             red, green and blue components are interpreted in the sRGB color space. The alpha indicates the opacity from 0.0 for transparent to
     *             1.0 for 100% opaque.
     * 
     *             The color applies to the geometry (e.g., a box) containing the text. The container's background color may have an 
     *             alpha of 0 so it is not displayed even though the text is displayed. The color behind individual characters
     *             is optionally controllable with the kCMTextMarkupAttribute_CharacterBackgroundColorARGB attribute. 
     * 
     *             If used, this attribute must be applied to the entire attributed string (i.e.,
     *             CFRangeMake(0, CFAttributedStringGetLength(...))).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BackgroundColorARGB();

    /**
     * [@const]      kCMTextMarkupAttribute_CharacterBackgroundColorARGB
     * 
     * The background color behind individual text characters.
     * 
     * Value must be a CFArray of 4 CFNumbers representing alpha, red, green, and blue fields with values between 0.0 and 1.0. The
     *             red, green and blue components are interpreted in the sRGB color space. The alpha indicates the opacity from 0.0 for transparent to
     *             1.0 for 100% opaque.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_CharacterBackgroundColorARGB();

    /**
     * [@const]      kCMTextMarkupAttribute_BoldStyle
     * 
     * Allows the setting of a bold style to be applied.
     * 
     * Value must be a CFBoolean. The default is kCFBooleanFalse.
     *             If this attribute is kCFBooleanTrue, the text will be drawn 
     *             with a bold style. Other styles such as italic may or may 
     *             not be used as well.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BoldStyle();

    /**
     * [@const]      kCMTextMarkupAttribute_ItalicStyle
     * 
     * Allows the setting of an italic style to be applied.
     * 
     * Value must be a CFBoolean. The default is kCFBooleanFalse.
     *             If this attribute is kCFBooleanTrue, the text will be rendered 
     *             with an italic style. Other styles such as bold may or may not 
     *             be used as well.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_ItalicStyle();

    /**
     * [@const]      kCMTextMarkupAttribute_UnderlineStyle
     * 
     * Allows the setting of an underline to be applied at render
     *             time.
     * 
     * Value must be a CFBoolean. The default is kCFBooleanFalse.
     *             If this attribute is kCFBooleanTrue, the text will be rendered 
     *             with an underline. Other styles such as bold may or may not 
     *             be used as well.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_UnderlineStyle();

    /**
     * [@const]      kCMTextMarkupAttribute_FontFamilyName
     * 
     * The name of the font.
     * 
     * Value must be a CFString holding the family name of an installed font
     *             (e.g., "Helvetica") that is used to render and/or measure text.
     * 
     *             When vended by legible output, an attributed string will have at most one of kCMTextMarkupAttribute_FontFamilyName or
     *             kCMTextMarkupAttribute_GenericFontFamilyName associated with each character.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_FontFamilyName();

    /**
     * [@const]      kCMTextMarkupAttribute_GenericFontFamilyName
     * 
     * The attribute holding a generic font family identifier.
     * 
     * Value must be a CFString holding a generic font family name that is one of the kCMTextMarkupGenericFontName_* constants.
     * 	Generic fonts must be mapped to the family name of an installed font (e.g., kCMTextMarkupGenericFontName_SansSerif -> "Helvetica")
     * 	before rendering and/or measuring text.
     * 
     *             When vended by legible output, an attributed string will have at most one of kCMTextMarkupAttribute_FontFamilyName or
     *             kCMTextMarkupAttribute_GenericFontFamilyName associated with each character.
     * 
     *             Overview of Generic Font Family Names
     *             =====================================
     *             Some media formats allow the specification of font family names to be used to style text they carry. Sometimes, an
     *             external specification (e.g., CSS) may be used to style the text carried by the media format. In either case, the
     *             specification may be concrete, indicating an installed platform font (e.g., "Times New Roman", Helvetica). It may be
     *             abstract, indicating a category of font to use (e.g., serif, sans-serif). This abstract designation is often termed
     *             a "generic font family".
     * 
     *             CSS for example allows a 'font-family' property specification such as this:
     * 
     *                 font-family: Helvetica, sans-serif;
     * 
     *             This uses both the concrete family name "Helvetica" and the generic family name "sans-serif".
     * 
     *             Generic font families may be common across media formats (e.g., both CSS and 3GPP timed text allow "sans-serif" and "serif").
     *             Other formats may have generic font identifiers that do not align exactly (e.g., TTML allows "monospaceSerif and "monospaceSansSerif" in
     *             addition to "monospace"). Some formats might not carry names but have numeric values mapping to a generic font identifier.
     *             Simply put, different formats use different ways to express their generic fonts.
     * 
     *             The use of generic font families is also important for media accessibility. The Media Accessibility framework can map eight categories
     *             of abstract fonts to an installed font. Users may choose to override each of these categories to a different installed font. This
     *             remapping should work if the content or external styling indicates a generic font. It should not however try to remap a concrete font like "Helvetica".
     *             Consequently, it is important to distinguish between the generic and concrete fonts expressed by the author.
     * 
     *             To accommodate what is expressible in media formats and to support media accessibility overrides, generic font families can be
     *             specified with the kCMTextMarkupAttribute_GenericFontFamilyName attribute which carries the identifier for one of the various
     *             generic font specification forms supported across media formats. These generic font identifiers are the kCMTextMarkupGenericFontName_*
     *             prefixed constants also defined here. New identifers may be added in the future.
     * 
     *             Concrete fonts are specified using the kCMTextMarkupAttribute_FontFamilyName attribute also defined in this header.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_GenericFontFamilyName();

    /**
     * Values for kCMTextMarkupAttribute_GenericFontFamilyName.
     * 
     * [@const]      kCMTextMarkupGenericFontName_Default
     * 				The generic font name indicating the default font. The default font may also be chosen if no font family is
     * 				specified (i.e., no kCMTextMarkupAttribute_FontFamilyName or kCMTextMarkupAttribute_GenericFontFamilyName is specified).
     * 
     * [@const]      kCMTextMarkupGenericFontName_Serif
     * 				The generic font name indicating a font with serifs. The font may be proportional or monospaced. E.g., Times New Roman
     * 
     * [@const]      kCMTextMarkupGenericFontName_SansSerif
     * 				The generic font name indicating a font without serifs. The font may be proportional or monospaced. E.g., Helvetica
     * 
     * [@const]      kCMTextMarkupGenericFontName_Monospace
     * 				The generic font name indicating a monospaced font, with or without serifs. E.g., Courier
     * 
     * [@const]      kCMTextMarkupGenericFontName_ProportionalSerif
     * 				The generic font name indicating a proportional font with serifs.
     * 
     * [@const]      kCMTextMarkupGenericFontName_ProportionalSansSerif
     * 				The generic font name indicating a proportional font without serifs.
     * 
     * [@const]      kCMTextMarkupGenericFontName_MonospaceSerif
     * 				The generic font name indicating a monospaced font with serifs.
     * 
     * [@const]      kCMTextMarkupGenericFontName_MonospaceSansSerif
     * 				The generic font name indicating a monospaced font without serifs.
     * 
     * [@const]      kCMTextMarkupGenericFontName_Casual
     * 				The generic font name indicating a "casual" font. E.g., Dom or Impress
     * 
     * [@const]      kCMTextMarkupGenericFontName_Cursive
     * 				The generic font name indicating a cursive font. E.g., Coronet or Marigold
     * 
     * [@const]      kCMTextMarkupGenericFontName_Fantasy
     * 				The generic font name indicating a "fantasy" font.
     * 
     * [@const]      kCMTextMarkupGenericFontName_SmallCapital
     * 				The generic font name indicating a font with lowercase letters set as small capitals. E.g., Engravers Gothic
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Default();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Serif();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_SansSerif();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Monospace();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_ProportionalSerif();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_ProportionalSansSerif();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_MonospaceSerif();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_MonospaceSansSerif();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Casual();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Cursive();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_Fantasy();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupGenericFontName_SmallCapital();

    /**
     * [@const]      kCMTextMarkupAttribute_BaseFontSizePercentageRelativeToVideoHeight
     * 
     * The base font size expressed as a percentage of the video height.
     * 
     * Value must be a non-negative CFNumber.  This is a number holding a percentage of the height of the video frame.  For example, a value of 5 indicates that the base font size should be 5% of the height of the video.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BaseFontSizePercentageRelativeToVideoHeight();

    /**
     * [@const]      kCMTextMarkupAttribute_RelativeFontSize
     * 
     * The font size expressed as a percentage of the current default font size.
     * 
     * Value must be a non-negative CFNumber. This is a number holding a percentage
     *             of the size of the calculated default font size.  A value
     *             of 120 indicates 20% larger than the default font size. A value of 80
     *             indicates 80% of the default font size.  The value 100 indicates no size
     *             difference and is the default.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_RelativeFontSize();

    /**
     * [@const]      kCMTextMarkupAttribute_VerticalLayout
     * 
     * The kind of vertical layout of the text block.
     * 
     * Value must be a CFString.
     * 				A CFString holding one of several values indicating the progression direction for new vertical
     * 				lines of text. If this attribute is present, it indicates the writing direction is vertical. The 
     * 			attribute value indicates whether new vertical text lines are added from left to right or from 
     * 			right to left. If this attribute is missing, the writing direction is horizontal.
     * 
     * 			If used, this attribute must be applied to the entire attributed string (i.e., 
     *                CFRangeMake(0, CFAttributedStringGetLength(...))).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_VerticalLayout();

    /**
     * Values for kCMTextMarkupAttribute_VerticalLayout.
     * 
     * [@const]      kCMTextVerticalLayout_LeftToRight
     * 			Newly added vertical lines are added from the left toward the right.
     * 
     * [@const]      kCMTextVerticalLayout_RightToLeft
     * 			Newly added vertical lines are added from the right toward the left.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextVerticalLayout_LeftToRight();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextVerticalLayout_RightToLeft();

    /**
     * [@const]      kCMTextMarkupAttribute_Alignment
     * 
     * The alignment of text in the writing direction of the first line of text.
     * 
     * Value must be a CFString.
     * 			A CFString holding one of several values indicating the alignment 
     * 			in the writing direction of the first line of text of the cue. 
     * 			The writing direction is indicated by the value (or absence) of 
     * 			the kCMTextMarkupAttribute_VerticalLayout. 
     * 
     * 			If this attribute is missing, the kCMTextMarkupAlignmentType_Middle value should
     * 			be used as the default.
     * 
     * 			If used, this attribute must be applied to the entire attributed string (i.e., 
     *                CFRangeMake(0, CFAttributedStringGetLength(...))).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_Alignment();

    /**
     * Values for kCMTextMarkupAttribute_Alignment.
     * 
     * [@const]      kCMTextMarkupAlignmentType_Start
     * 			The text is visually aligned at its starting side. For horizontally written text, the alignment is left for 
     * 			left-to-right text and right for right-to-left text. For vertical text, alignment is always at the top.
     * 
     * [@const]      kCMTextMarkupAlignmentType_Middle
     * 			The text is visually center-aligned (i.e., aligned between its starting and ending sides). 
     * 
     * [@const]      kCMTextMarkupAlignmentType_End
     * 			The text is visually aligned at its ending side. For horizontally written text, the alignment is right for 
     * 			left-to-right text and left for right-to-left text. For vertical text, alignment is always at the bottom.
     * 
     * [@const]      kCMTextMarkupAlignmentType_Left
     * 			For horizontally written text, the text alignment is always visually left-aligned (i.e., left-to-right and right-to-left 
     * 			are treated uniformly). For vertical text, this is equivalent to kCMTextMarkupAlignmentType_Start. While readers
     * 			should be prepared to account for kCMTextMarkupAlignmentType_Left being equivalent to 
     * 			kCMTextMarkupAlignmentType_Start for vertical text, authors are discouraged from using kCMTextMarkupAlignmentType_Left
     * 			for vertical text.
     * 
     * [@const]      kCMTextMarkupAlignmentType_Right
     * 			For horizontally written text, the text alignment is always visually right-aligned (i.e., left-to-right and right-to-left 
     * 			are treated uniformly). For vertical text, this is equivalent to kCMTextMarkupAlignmentType_End. While readers
     * 			should be prepared to account for kCMTextMarkupAlignmentType_Right being equivalent to 
     * 			kCMTextMarkupAlignmentType_End for vertical text, authors are discouraged from using kCMTextMarkupAlignmentType_Right
     * 			for vertical text.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Start();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Middle();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_End();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Left();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAlignmentType_Right();

    /**
     * [@const]      kCMTextMarkupAttribute_TextPositionPercentageRelativeToWritingDirection
     * 
     * The placement of the block of text specified as a percentage in the writing direction.
     * 
     * Value must be a non-negative CFNumber.
     * 		 A CFNumber expressing the position of the
     * 		 center of the text in the writing direction as a percentage of the video dimensions in 
     * 		 the writing direction. For horizontal cues, this is the horizontal position. 
     * 		 For vertical, it is the vertical position. The percentage is calculated 
     * 		 from the edge of the frame where the text begins (so for left-to-right 
     * 		 English, it is the left edge).
     * 
     * 		 If used, this attribute must be applied to the entire attributed string (i.e., 
     *                CFRangeMake(0, CFAttributedStringGetLength(...))).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_TextPositionPercentageRelativeToWritingDirection();

    /**
     * [@const]      kCMTextMarkupAttribute_OrthogonalLinePositionPercentageRelativeToWritingDirection
     * 
     * The placement of the block of text's first line specified as a percentage in the
     * 			direction orthogonal to the writing direction.
     * 
     * Value must be a non-negative CFNumber.
     * 			A CFNumber expressing the position of the center of the
     * 			cue relative to the writing direction. The line 
     * 			position is orthogonal (or perpendicular) to the writing direction (i.e., 
     * 			for a horizontal writing direction, it is vertical and for a vertical writing 
     * 			direction, is is horizontal). This attribute expresses the line position as 
     * 			a percentage of the dimensions of the video frame in the relevant direction. 
     * 			For example, 0% is the top of the video frame and 100% is the bottom of the 
     * 			video frame for horizontal writing layout.
     * 
     * 			If used, this attribute must be applied to the entire attributed string (i.e., 
     *                CFRangeMake(0, CFAttributedStringGetLength(...))).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_OrthogonalLinePositionPercentageRelativeToWritingDirection();

    /**
     * [@const]      kCMTextMarkupAttribute_WritingDirectionSizePercentage
     * 
     * The dimension (e.g., width) of the bounding box containing the text expressed as a percentage.
     * 
     * Value must be a non-negative CFNumber.
     * 			A CFNumber expressing the width of the 
     * 			bounding box for text layout as a percentage of the video frame's dimension
     * 			in the writing direction. 
     * 			For a horizontal writing direction, it is the width. For a vertical writing 
     * 			direction, it is the horizontal writing direction.
     * 
     * 			If used, this attribute must be applied to the entire attributed string (i.e., 
     *                CFRangeMake(0, CFAttributedStringGetLength(...))).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_WritingDirectionSizePercentage();

    /**
     * [@const]      kCMTextMarkupAttribute_CharacterEdgeStyle
     * 
     * Allows the setting of the style of character edges at render time.
     * 
     * Value must be a CFString. This controls the shape of the edges of
     * 			drawn characters. Set a value of something other than kCMTextMarkupEdgeStyle_None
     * 			to draw using an alternative shape for edges of characters from the set of constants
     * 			prefixed with "kCMTextMarkupEdgeStyle_". These correspond to text edge styles available
     * 			with Media Accessibility preferences (see <MediaAccessibility/MACaptionAppearance.h>)
     * 			although the values are not enumerated integers here.
     * 
     * 			The absence of this attribute should be treated as though kCMTextMarkupCharacterEdgeStyle_None
     * 			is specified.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_CharacterEdgeStyle();

    /**
     * Values for kCMTextMarkupAttribute_CharacterEdgeStyle.
     * 
     * [@const]      kCMTextMarkupCharacterEdgeStyle_None
     * 			The character edge style indicating no edge style.
     * 
     * [@const]      kCMTextMarkupCharacterEdgeStyle_Raised
     * 			The character edge style indicating a raised edge style should be drawn.
     * 
     * [@const]      kCMTextMarkupCharacterEdgeStyle_Depressed
     * 			The character edge style indicating a depressed edge style should be drawn.
     * 
     * [@const]      kCMTextMarkupCharacterEdgeStyle_Uniform
     * 			The character edge style indicating a uniform border around the character should be drawn.
     * 
     * [@const]      kCMTextMarkupCharacterEdgeStyle_DropShadow
     * 			The character edge style indicating a drop shadow should be drawn.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_None();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_Raised();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_Depressed();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_Uniform();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupCharacterEdgeStyle_DropShadow();

    /**
     * [@const] kCMMetadataKeySpace_QuickTimeUserData
     * 	Metadata keyspace for QuickTime User Data keys.
     * [@const] kCMMetadataKeySpace_ISOUserData
     * 	Metadata keyspace for MPEG-4 User Data keys.
     * [@const] kCMMetadataKeySpace_QuickTimeMetadata
     * 	Metadata keyspace for QuickTime Metadata keys.
     * [@const] kCMMetadataKeySpace_iTunes
     * 	Metadata keyspace for iTunes keys.
     * [@const] kCMMetadataKeySpace_ID3
     * 	Metadata keyspace for ID3 keys.
     * [@const] kCMMetadataKeySpace_Icy
     * 	Metadata keyspace for ShoutCast keys.
     * [@const] kCMMetadataKeySpace_HLSDateRange
     * 	Metadata keyspace for HLS DateRange tags.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_QuickTimeUserData();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_ISOUserData();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_QuickTimeMetadata();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_iTunes();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_ID3();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_Icy();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_HLSDateRange();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataLocation_ISO6709
     * 	Location information in ISO-6709 format.
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataDirection_Facing
     * 	Direction the observer is facing.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLocation_ISO6709();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataDirection_Facing();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataPreferredAffineTransform
     * 	An affine transform that can be used in place of a track matrix for
     * 	displaying a video track, to better reflect the current orientation
     * 	of a video camera with respect to a scene.  For example, if the camera
     * 	is rotated after a recording has started, the presence of this metadata
     * 	will allow a player to adjust its rendering at the time the rotation occurred.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataPreferredAffineTransform();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataVideoOrientation
     * 	Video orientation as defined by TIFF/EXIF, which is enumerated by CGImagePropertyOrientation
     * 	(see <ImageIO/CGImageProperties.h>).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataVideoOrientation();

    /**
     * [@const] kCMMetadataBaseDataType_RawData
     * 	A sequence of bytes whose interpretation based upon an agreement between
     * 	the reader and the writer.
     * [@const] kCMMetadataBaseDataType_UTF8
     * 	UTF-8 string.
     * [@const] kCMMetadataBaseDataType_UTF16
     * 	UTF-16 string.
     * [@const] kCMMetadataBaseDataType_GIF
     * 	GIF image.
     * [@const] kCMMetadataBaseDataType_JPEG
     * 	JPEG image.
     * [@const] kCMMetadataBaseDataType_PNG
     * 	PNG image.
     * [@const] kCMMetadataBaseDataType_BMP
     * 	BMP image.
     * [@const] kCMMetadataBaseDataType_Float32
     * 	32-bit big endian floating point number.
     * [@const] kCMMetadataBaseDataType_Float64
     * 	64-bit big endian floating point number.
     * [@const] kCMMetadataBaseDataType_SInt8
     * 	8-bit signed integer.
     * [@const] kCMMetadataBaseDataType_SInt16
     * 	16-bit big endian signed integer.
     * [@const] kCMMetadataBaseDataType_SInt32
     * 	32-bit big endian signed integer.
     * [@const] kCMMetadataBaseDataType_SInt64
     * 	64-bit big endian signed integer.
     * [@const] kCMMetadataBaseDataType_UInt8
     * 	8-bit unsigned integer.
     * [@const] kCMMetadataBaseDataType_UInt16
     * 	16-bit big endian unsigned integer.
     * [@const] kCMMetadataBaseDataType_UInt32
     * 	32-bit big endian unsigned integer.
     * [@const] kCMMetadataBaseDataType_UInt64
     * 	64-bit big endian unsigned integer.
     * [@const] kCMMetadataBaseDataType_PointF32
     * 	Consists of two 32-bit big endian floating point values, the x and y values, respectively.
     * [@const] kCMMetadataBaseDataType_DimensionsF32
     * 	Consists of a 32-bit big endian floating point x value followed by a 32-bit floating point y value.
     * [@const] kCMMetadataBaseDataType_RectF32
     * 	Consists of four 32-bit big endian floating point values, the origin's x, origin's y, width and height values, respectively.
     * 	May also be interpreted as a 32-bit floating point origin followed by a 32-bit floating point dimension.
     * [@const] kCMMetadataDataType_AffineTransformF64
     * 	A 3x3 matrix of 64-bit big endian floating point numbers stored in row-major order that specify an affine transform.
     * [@const] kCMMetadataBaseDataType_PolygonF32
     * 	Three or more pairs of 32-bit floating point numbers (x and y values) that define the verticies of a polygon.
     * [@const] kCMMetadataBaseDataType_PolylineF32
     * 	Two or more pairs of 32-bit floating point numbers (x and y values) that define a multi-segmented line.
     * [@const] kCMMetadataBaseDataType_JSON
     * 	UTF-8 encoded JSON data.
     * [@const] kCMMetadataBaseDataType_PerspectiveTransformF64
     * 	A 3x3 matrix of 64-bit big endian floating point numbers stored in row-major order that specify a perspective transform.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_RawData();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UTF8();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UTF16();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_GIF();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_JPEG();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PNG();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_BMP();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_Float32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_Float64();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt8();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt16();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_SInt64();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt8();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt16();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_UInt64();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PointF32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_DimensionsF32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_RectF32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_AffineTransformF64();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PolygonF32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PolylineF32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_JSON();

    /**
     * [@const] kCMMetadataDataType_Location_ISO6709
     * 	A string supplying location information in ISO-6709 format.  Conforms to
     * 	kCMMetadataBaseDataType_UTF8.
     * [@const] kCMMetadataDataType_Direction
     * 	A string supplying degrees offset from magnetic North.  Conforms to
     * 	kCMMetadataBaseDataType_UTF8.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataDataType_QuickTimeMetadataLocation_ISO6709();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataDataType_QuickTimeMetadataDirection();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCreate {
        @Generated
        int call_CMSampleBufferCreate(CMSampleBufferRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMAudioSampleBufferCreateWithPacketDescriptions {
        @Generated
        int call_CMAudioSampleBufferCreateWithPacketDescriptions(CMSampleBufferRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCreateForImageBuffer {
        @Generated
        int call_CMSampleBufferCreateForImageBuffer(CMSampleBufferRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferSetInvalidateCallback {
        @Generated
        void call_CMSampleBufferSetInvalidateCallback(CMSampleBufferRef arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferSetInvalidateHandler {
        @Generated
        void call_CMSampleBufferSetInvalidateHandler(CMSampleBufferRef sbuf);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCallForEachSample {
        @Generated
        int call_CMSampleBufferCallForEachSample(CMSampleBufferRef arg0, @NInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferCallBlockForEachSample {
        @Generated
        int call_CMSampleBufferCallBlockForEachSample(CMSampleBufferRef arg0, @NInt long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueResetWithCallback {
        @Generated
        void call_CMBufferQueueResetWithCallback(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueInstallTrigger {
        @Generated
        void call_CMBufferQueueInstallTrigger(VoidPtr arg0, CMBufferQueueTriggerToken arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueInstallTriggerWithIntegerThreshold {
        @Generated
        void call_CMBufferQueueInstallTriggerWithIntegerThreshold(VoidPtr arg0, CMBufferQueueTriggerToken arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueCallForEachBuffer {
        @Generated
        int call_CMBufferQueueCallForEachBuffer(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueSetValidationCallback {
        @Generated
        int call_CMBufferQueueSetValidationCallback(CMBufferQueueRef arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    /**
     * [@function]	CMVideoFormatDescriptionCreateFromHEVCParameterSets
     * 
     * Creates a format description for a video media stream described by HEVC (H.265) parameter set NAL units.
     * 
     * This function parses the dimensions provided by the parameter sets and creates a format description suitable for a raw H.265 stream.
     * 			The parameter sets' data can come from raw NAL units and must have any emulation prevention bytes needed.
     * 			The supported NAL unit types to be included in the format description are 32 (video parameter set), 33 (sequence parameter set), 34 (picture parameter set), 39 (prefix SEI) and 40 (suffix SEI). At least one of each parameter set must be provided.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromHEVCParameterSets(CFAllocatorRef allocator,
            @NUInt long parameterSetCount,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointers,
            ConstNUIntPtr parameterSetSizes, int NALUnitHeaderLength, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    /**
     * [@function]	CMVideoFormatDescriptionGetHEVCParameterSetAtIndex
     * 
     * Returns a parameter set contained in a HEVC (H.265) format description.
     * 
     * This function parses the HEVC decoder configuration record contained in a H.265 video format description and returns the NAL unit at the given index from it.  These NAL units are typically parameter sets (e.g. VPS, SPS, PPS), but may contain others as specified by ISO/IEC 14496-15 (e.g. user-data SEI).
     * 			Both parameterSetPointerOut and parameterSetSizeOut may be NULL, parameterSetCountOut will return the total number of parameter set NAL units contained in the HEVC decoder configuration record.
     * 			The parameter set NAL units returned will already have any emulation prevention bytes needed.
     * 			The pointer returned in parameterSetPointerOut points to internal memory of videoDesc, and may only be accessed as long as a retain on videoDesc is held.
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionGetHEVCParameterSetAtIndex(CMFormatDescriptionRef videoDesc,
            @NUInt long parameterSetIndex,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointerOut,
            NUIntPtr parameterSetSizeOut, NUIntPtr parameterSetCountOut, IntPtr NALUnitHeaderLengthOut);

    /**
     * same as kCVImageBufferTransferFunction_SMPTE_ST_2084_PQ
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_SMPTE_ST_2084_PQ();

    /**
     * same as kCVImageBufferTransferFunction_ITU_R_2100_HLG
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_2100_HLG();

    /**
     * CFData(24 bytes); big-endian structure; same as kCVImageBufferMasteringDisplayColorVolumeKey; matches payload of ISO/IEC 23008-2:2015(E), D.2.28 Mastering display colour volume SEI message
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_MasteringDisplayColorVolume();

    /**
     * CFData(4 bytes); big-endian structure; same as kCVImageBufferContentLightLevelInfoKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ContentLightLevelInfo();

    /**
     * CFDictionary(kCMHEVCTemporalLevelInfoKey_*), optional.  Corresponds to 'tscl' sample group.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCTemporalLevelInfo();

    /**
     * CFNumber(Int)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_TemporalLevel();

    /**
     * CFNumber(Int)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileSpace();

    /**
     * CFNumber(Int)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_TierFlag();

    /**
     * CFNumber(Int)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileIndex();

    /**
     * CFData(4 bytes)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileCompatibilityFlags();

    /**
     * CFData(6 bytes)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ConstraintIndicatorFlags();

    /**
     * CFNumber(Int)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_LevelIndex();

    /**
     * CFBoolean, optional.  Corresponds to 'tsas' sample group.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCTemporalSubLayerAccess();

    /**
     * CFBoolean, optional.  Corresponds to 'stsa' sample group.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCStepwiseTemporalSubLayerAccess();

    /**
     * CFNumber(Int), optional.  Corresponds to 'sync' sample group.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCSyncSampleNALUnitType();

    /**
     * CFData (matrix_float3x3)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix();

    /**
     * [@function]	CMTimeFoldIntoRange
     * 
     * Folds a time into the given range.  This can be used in looping time calculations.
     * 
     * Note that for certain types of looping, you may want to NOT fold times that are prior
     * 			to the loop range.  That's up to the client.
     * 
     * @return		A CMTime structure representing the translated duration.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeFoldIntoRange(@ByValue CMTime time, @ByValue CMTimeRange foldRange);

    /**
     * [@function]	CMSampleBufferCreateWithMakeDataReadyHandler
     * 
     * Creates a CMSampleBuffer.
     * 
     * See CMSampleBufferCreate; this variant allows for passing a block to make the data ready.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateWithMakeDataReadyHandler(CFAllocatorRef allocator,
            CMBlockBufferRef dataBuffer, byte dataReady, CMFormatDescriptionRef formatDescription,
            @NInt long numSamples, @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, ConstNUIntPtr sampleSizeArray, Ptr<CMSampleBufferRef> sampleBufferOut,
            @ObjCBlock(name = "call_CMSampleBufferCreateWithMakeDataReadyHandler") Block_CMSampleBufferCreateWithMakeDataReadyHandler makeDataReadyHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferCreateWithMakeDataReadyHandler {
        @Generated
        int call_CMSampleBufferCreateWithMakeDataReadyHandler(CMSampleBufferRef sbuf);
    }

    /**
     * [@function]	CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler
     * 
     * Creates an CMSampleBuffer containing audio given packetDescriptions instead of sizing and timing info
     * 
     * See CMAudioSampleBufferCreateWithPacketDescriptions; this variant allows for passing a block to make the data ready.
     */
    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler(
            CFAllocatorRef allocator, CMBlockBufferRef dataBuffer, byte dataReady,
            CMFormatDescriptionRef formatDescription, @NInt long numSamples, @ByValue CMTime presentationTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            Ptr<CMSampleBufferRef> sampleBufferOut,
            @ObjCBlock(name = "call_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler") Block_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler makeDataReadyHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler {
        @Generated
        int call_CMAudioSampleBufferCreateWithPacketDescriptionsAndMakeDataReadyHandler(CMSampleBufferRef sbuf);
    }

    /**
     * [@function]	CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler
     * 
     * Creates a CMSampleBuffer that contains a CVImageBuffer instead of a CMBlockBuffer.
     * 
     * See CMSampleBufferCreateForImageBuffer; this variant allows for passing a block to make the data ready.
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler(CFAllocatorRef allocator,
            CVBufferRef imageBuffer, byte dataReady, CMFormatDescriptionRef formatDescription,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            Ptr<CMSampleBufferRef> sampleBufferOut,
            @ObjCBlock(name = "call_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler") Block_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler makeDataReadyHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler {
        @Generated
        int call_CMSampleBufferCreateForImageBufferWithMakeDataReadyHandler(CMSampleBufferRef sbuf);
    }

    /**
     * [@function]	0
     * 
     * 	Sets the master clock of a timebase.
     * 
     * 	The timebase will stop being mastered by its current master clock or master
     * 	timebase, and will change to be mastered by the new master clock.  Prior to
     * 	the change a kCMTimebaseNotification_MasterWillChange will be posted.  When
     * 	the change has completed, a kCMTimebaseNotification_MasterDidChange notification
     * 	will be posted.  The current master clock or master timebase of the timebase
     * 	being modified will be released.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetMasterClock(CMTimebaseRef timebase, CMClockRef newMasterClock);

    /**
     * [@function]	CMTimebaseSetMasterTimebase
     * 
     * 	Sets the master timebase of a timebase.
     * 
     * 	The timebase will stop being mastered by its current master clock or master
     * 	timebase, and will change to be mastered by the new master timebase.  Prior to
     * 	the change a kCMTimebaseNotification_MasterWillChange will be posted.  When
     * 	the change has completed, a kCMTimebaseNotification_MasterDidChange notification
     * 	will be posted.  The current master clock or master timebase of the timebase
     * 	being modified will be released.
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetMasterTimebase(CMTimebaseRef timebase, CMTimebaseRef newMasterTimebase);

    /**
     * [@function]	CMBufferQueueCreateWithHandlers
     * 
     * Creates a CMBufferQueue object.
     * 
     * On return, the caller owns the returned CMBufferQueue, and must release it when done with it.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCreateWithHandlers(CFAllocatorRef allocator, @NInt long capacity,
            VoidPtr handlers, Ptr<CMBufferQueueRef> queueOut);

    /**
     * [@function]	CMBufferQueueInstallTriggerHandler
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * The returned trigger token can be passed to CMBufferQueueTestTrigger and CMBufferQueueRemoveTrigger.
     * 			The triggerTokenOut parameter can be NULL (client doesn't need to test or remove trigger), and the
     * 			handler parameter can be NULL (client doesn't need callbacks, but rather will explicitly
     * 			test the trigger).  One of these two parameters must be non-NULL, however, since an untestable
     * 			trigger that does not perform a callback is meaningless.  If the trigger condition is already true,
     * 			CMBufferQueueInstallTrigger will call the handler.  If it does this, it will first write
     * 			the trigger token to *triggerTokenOut.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerHandler(CMBufferQueueRef queue, int condition,
            @ByValue CMTime time, Ptr<CMBufferQueueTriggerToken> triggerTokenOut,
            @ObjCBlock(name = "call_CMBufferQueueInstallTriggerHandler") Block_CMBufferQueueInstallTriggerHandler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMBufferQueueInstallTriggerHandler {
        @Generated
        void call_CMBufferQueueInstallTriggerHandler(CMBufferQueueTriggerToken triggerToken);
    }

    /**
     * [@function]	CMBufferQueueInstallTriggerHandlerWithIntegerThreshold
     * 
     * Installs a trigger on a CMBufferQueue.
     * 
     * This function behaves the same way as CMBufferQueueInstallTriggerHandler() except the trigger is evaluated against
     * 			the integer value rather than the time value.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerHandlerWithIntegerThreshold(CMBufferQueueRef queue,
            int condition, @NInt long threshold, Ptr<CMBufferQueueTriggerToken> triggerTokenOut,
            @ObjCBlock(name = "call_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold") Block_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold {
        @Generated
        void call_CMBufferQueueInstallTriggerHandlerWithIntegerThreshold(CMBufferQueueTriggerToken triggerToken);
    }

    /**
     * [@function]	CMBufferQueueSetValidationHandler
     * 
     * Sets a block that CMBufferQueueEnqueue will call to validate buffers before adding them to the queue.
     * 
     * 	Both a validation callback and a validation handler can be set at the
     * 	same time, in which case they will both be called when enqueueing
     * 	buffers. They both need to return noErr for the buffer to be enqueued.
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueSetValidationHandler(CMBufferQueueRef queue,
            @ObjCBlock(name = "call_CMBufferQueueSetValidationHandler") Block_CMBufferQueueSetValidationHandler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMBufferQueueSetValidationHandler {
        @Generated
        int call_CMBufferQueueSetValidationHandler(CMBufferQueueRef queue, ConstVoidPtr buf);
    }

    /**
     * same as kCVImageBufferTransferFunction_Linear
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_Linear();

    /**
     * same as kCVImageBufferTransferFunction_sRGB
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_sRGB();

    /**
     * CFString (usually kCMFormatDescriptionTransferFunction_ITU_R_2100_HLG when used); corresponds to D.2.38 Alternative Transfer Characteristics SEI message
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AlternativeTransferCharacteristics();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AuxiliaryTypeInfo();

    /**
     * one of:
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AlphaChannelMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionAlphaChannelMode_StraightAlpha();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionAlphaChannelMode_PremultipliedAlpha();

    /**
     * CFBoolean; used to signal the presence of alpha channel in the bitstream.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ContainsAlphaChannel();

    /**
     * CFNumber(Int), optional.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_AudioIndependentSampleDecoderRefreshCount();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransform
     * 	A perspective transform that can be used to adjust a Live Photo still image to match the Live Photo movie.
     * 	Expected data type is kCMMetadataBaseDataType_PerspectiveTransformF64.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransform();

    /**
     * [@const] kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransformReferenceDimensions
     * 	The dimensions of the image used to generate kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransform.
     * 	Expected data type is kCMMetadataBaseDataType_DimensionsF32.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransformReferenceDimensions();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PerspectiveTransformF64();

    /**
     * CNNumberRef as FourCharCode
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ProtectedContentOriginalFormat();
}
