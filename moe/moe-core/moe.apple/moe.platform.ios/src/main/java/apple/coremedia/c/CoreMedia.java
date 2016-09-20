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
import apple.audiotoolbox.struct.AudioFormatListItem;
import apple.coreaudio.struct.AudioBufferList;
import apple.coreaudio.struct.AudioChannelLayout;
import apple.coreaudio.struct.AudioStreamBasicDescription;
import apple.coreaudio.struct.AudioStreamPacketDescription;
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
     * CMTimeMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMake">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMake(long value, int timescale);

    /**
     * CMTimeMakeWithEpoch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMakeWithEpoch">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithEpoch(long value, int timescale, long epoch);

    /**
     * CMTimeMakeWithSeconds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMakeWithSeconds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithSeconds(double seconds, int preferredTimeScale);

    /**
     * CMTimeGetSeconds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeGetSeconds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CMTimeGetSeconds(@ByValue CMTime time);

    /**
     * CMTimeConvertScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeConvertScale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeConvertScale(@ByValue CMTime time, int newTimescale, int method);

    /**
     * CMTimeAdd</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeAdd">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAdd(@ByValue CMTime addend1, @ByValue CMTime addend2);

    /**
     * CMTimeSubtract</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeSubtract">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeSubtract(@ByValue CMTime minuend, @ByValue CMTime subtrahend);

    /**
     * CMTimeMultiply</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMultiply">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiply(@ByValue CMTime time, int multiplier);

    /**
     * CMTimeMultiplyByFloat64</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMultiplyByFloat64">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByFloat64(@ByValue CMTime time, double multiplier);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByRatio(@ByValue CMTime time, int multiplier, int divisor);

    /**
     * CMTimeCompare</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeCompare">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimeCompare(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * CMTimeMinimum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMinimum">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMinimum(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * CMTimeMaximum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMaximum">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMaximum(@ByValue CMTime time1, @ByValue CMTime time2);

    /**
     * CMTimeAbsoluteValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeAbsoluteValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAbsoluteValue(@ByValue CMTime time);

    /**
     * CMTimeCopyAsDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeCopyAsDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeCopyAsDictionary(@ByValue CMTime time, CFAllocatorRef allocator);

    /**
     * CMTimeMakeFromDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeMakeFromDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeFromDictionary(CFDictionaryRef dict);

    /**
     * CMTimeCopyDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeCopyDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CMTimeCopyDescription(CFAllocatorRef allocator, @ByValue CMTime time);

    /**
     * CMTimeShow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTime/index.html#//apple_ref/c/func/CMTimeShow">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMTimeShow(@ByValue CMTime time);

    /**
     * CMTimeRangeMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeMake">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMake(@ByValue CMTime start, @ByValue CMTime duration);

    /**
     * CMTimeRangeGetUnion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeGetUnion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetUnion(@ByValue CMTimeRange range1, @ByValue CMTimeRange range2);

    /**
     * CMTimeRangeGetIntersection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeGetIntersection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetIntersection(@ByValue CMTimeRange range1,
            @ByValue CMTimeRange range2);

    /**
     * CMTimeRangeEqual</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeEqual">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeEqual(@ByValue CMTimeRange range1, @ByValue CMTimeRange range2);

    /**
     * CMTimeRangeContainsTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeContainsTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTime(@ByValue CMTimeRange range, @ByValue CMTime time);

    /**
     * CMTimeRangeContainsTimeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeContainsTimeRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTimeRange(@ByValue CMTimeRange range1, @ByValue CMTimeRange range2);

    /**
     * CMTimeRangeGetEnd</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeGetEnd">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeRangeGetEnd(@ByValue CMTimeRange range);

    /**
     * CMTimeMapTimeFromRangeToRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeMapTimeFromRangeToRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapTimeFromRangeToRange(@ByValue CMTime t, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    /**
     * CMTimeClampToRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeClampToRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeClampToRange(@ByValue CMTime time, @ByValue CMTimeRange range);

    /**
     * CMTimeMapDurationFromRangeToRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeMapDurationFromRangeToRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapDurationFromRangeToRange(@ByValue CMTime dur, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    /**
     * CMTimeRangeFromTimeToTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeFromTimeToTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeFromTimeToTime(@ByValue CMTime start, @ByValue CMTime end);

    /**
     * CMTimeRangeCopyAsDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeCopyAsDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeRangeCopyAsDictionary(@ByValue CMTimeRange range,
            CFAllocatorRef allocator);

    /**
     * CMTimeRangeMakeFromDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeMakeFromDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMakeFromDictionary(CFDictionaryRef dict);

    /**
     * CMTimeRangeCopyDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeCopyDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CMTimeRangeCopyDescription(CFAllocatorRef allocator, @ByValue CMTimeRange range);

    /**
     * CMTimeRangeShow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMTimeRange/index.html#//apple_ref/c/func/CMTimeRangeShow">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMTimeRangeShow(@ByValue CMTimeRange range);

    /**
     * CMSetAttachment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAttachment/index.html#//apple_ref/c/func/CMSetAttachment">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMSetAttachment(ConstVoidPtr target, CFStringRef key, ConstVoidPtr value,
            int attachmentMode);

    /**
     * CMGetAttachment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAttachment/index.html#//apple_ref/c/func/CMGetAttachment">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMGetAttachment(ConstVoidPtr target, CFStringRef key, IntPtr attachmentModeOut);

    /**
     * CMRemoveAttachment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAttachment/index.html#//apple_ref/c/func/CMRemoveAttachment">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMRemoveAttachment(ConstVoidPtr target, CFStringRef key);

    /**
     * CMRemoveAllAttachments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAttachment/index.html#//apple_ref/c/func/CMRemoveAllAttachments">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMRemoveAllAttachments(ConstVoidPtr target);

    /**
     * CMCopyDictionaryOfAttachments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAttachment/index.html#//apple_ref/c/func/CMCopyDictionaryOfAttachments">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMCopyDictionaryOfAttachments(CFAllocatorRef allocator, ConstVoidPtr target,
            int attachmentMode);

    /**
     * CMSetAttachments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAttachment/index.html#//apple_ref/c/func/CMSetAttachments">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMSetAttachments(ConstVoidPtr target, CFDictionaryRef theAttachments, int attachmentMode);

    /**
     * CMPropagateAttachments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAttachment/index.html#//apple_ref/c/func/CMPropagateAttachments">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMPropagateAttachments(ConstVoidPtr source, ConstVoidPtr destination);

    /**
     * CMBlockBufferCreateEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferCreateEmpty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateEmpty(CFAllocatorRef structureAllocator, int subBlockCapacity,
            int flags, Ptr<CMBlockBufferRef> newBBufOut);

    /**
     * CMBlockBufferCreateWithMemoryBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferCreateWithMemoryBlock">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithMemoryBlock(CFAllocatorRef structureAllocator, VoidPtr memoryBlock,
            @NUInt long blockLength, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, Ptr<CMBlockBufferRef> newBBufOut);

    /**
     * CMBlockBufferCreateWithBufferReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferCreateWithBufferReference">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithBufferReference(CFAllocatorRef structureAllocator,
            CMBlockBufferRef targetBuffer, @NUInt long offsetToData, @NUInt long dataLength, int flags,
            Ptr<CMBlockBufferRef> newBBufOut);

    /**
     * CMBlockBufferCreateContiguous</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferCreateContiguous">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCreateContiguous(CFAllocatorRef structureAllocator,
            CMBlockBufferRef sourceBuffer, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, Ptr<CMBlockBufferRef> newBBufOut);

    /**
     * CMBlockBufferGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetTypeID();

    /**
     * CMBlockBufferAppendMemoryBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferAppendMemoryBlock">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAppendMemoryBlock(CMBlockBufferRef theBuffer, VoidPtr memoryBlock,
            @NUInt long blockLength, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags);

    /**
     * CMBlockBufferAppendBufferReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferAppendBufferReference">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAppendBufferReference(CMBlockBufferRef theBuffer, CMBlockBufferRef targetBBuf,
            @NUInt long offsetToData, @NUInt long dataLength, int flags);

    /**
     * CMBlockBufferAssureBlockMemory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferAssureBlockMemory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAssureBlockMemory(CMBlockBufferRef theBuffer);

    /**
     * CMBlockBufferAccessDataBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferAccessDataBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferAccessDataBytes(CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length, VoidPtr temporaryBlock, Ptr<BytePtr> returnedPointer);

    /**
     * CMBlockBufferCopyDataBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferCopyDataBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferCopyDataBytes(CMBlockBufferRef theSourceBuffer, @NUInt long offsetToData,
            @NUInt long dataLength, VoidPtr destination);

    /**
     * CMBlockBufferReplaceDataBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferReplaceDataBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferReplaceDataBytes(ConstVoidPtr sourceBytes, CMBlockBufferRef destinationBuffer,
            @NUInt long offsetIntoDestination, @NUInt long dataLength);

    /**
     * CMBlockBufferFillDataBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferFillDataBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferFillDataBytes(byte fillByte, CMBlockBufferRef destinationBuffer,
            @NUInt long offsetIntoDestination, @NUInt long dataLength);

    /**
     * CMBlockBufferGetDataPointer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferGetDataPointer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBlockBufferGetDataPointer(CMBlockBufferRef theBuffer, @NUInt long offset,
            NUIntPtr lengthAtOffset, NUIntPtr totalLength, Ptr<BytePtr> dataPointer);

    /**
     * CMBlockBufferGetDataLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferGetDataLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetDataLength(CMBlockBufferRef theBuffer);

    /**
     * CMBlockBufferIsRangeContiguous</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferIsRangeContiguous">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMBlockBufferIsRangeContiguous(CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length);

    /**
     * CMBlockBufferIsEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBlockBuffer/index.html#//apple_ref/c/func/CMBlockBufferIsEmpty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMBlockBufferIsEmpty(CMBlockBufferRef theBuffer);

    /**
     * CMFormatDescriptionCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMFormatDescriptionCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionCreate(CFAllocatorRef allocator, int mediaType, int mediaSubtype,
            CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> descOut);

    /**
     * CMFormatDescriptionGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMFormatDescriptionGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMFormatDescriptionGetTypeID();

    /**
     * CMFormatDescriptionEqual</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMFormatDescriptionEqual">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqual(CMFormatDescriptionRef desc1, CMFormatDescriptionRef desc2);

    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqualIgnoringExtensionKeys(CMFormatDescriptionRef desc1,
            CMFormatDescriptionRef desc2, ConstVoidPtr formatDescriptionExtensionKeysToIgnore,
            ConstVoidPtr sampleDescriptionExtensionAtomKeysToIgnore);

    /**
     * CMFormatDescriptionGetMediaType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMFormatDescriptionGetMediaType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaType(CMFormatDescriptionRef desc);

    /**
     * CMFormatDescriptionGetMediaSubType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMFormatDescriptionGetMediaSubType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaSubType(CMFormatDescriptionRef desc);

    /**
     * CMFormatDescriptionGetExtensions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMFormatDescriptionGetExtensions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMFormatDescriptionGetExtensions(CMFormatDescriptionRef desc);

    /**
     * CMFormatDescriptionGetExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMFormatDescriptionGetExtension">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMFormatDescriptionGetExtension(CMFormatDescriptionRef desc,
            CFStringRef extensionKey);

    /**
     * CMAudioFormatDescriptionCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription asbd,
            @NUInt long layoutSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout layout,
            @NUInt long magicCookieSize, ConstVoidPtr magicCookie, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> outDesc);

    /**
     * CMAudioFormatDescriptionGetStreamBasicDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionGetStreamBasicDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioStreamBasicDescription CMAudioFormatDescriptionGetStreamBasicDescription(
            CMFormatDescriptionRef desc);

    /**
     * CMAudioFormatDescriptionGetMagicCookie</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionGetMagicCookie">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMAudioFormatDescriptionGetMagicCookie(CMFormatDescriptionRef desc,
            NUIntPtr cookieSizeOut);

    /**
     * CMAudioFormatDescriptionGetChannelLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionGetChannelLayout">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioChannelLayout CMAudioFormatDescriptionGetChannelLayout(CMFormatDescriptionRef desc,
            NUIntPtr layoutSize);

    /**
     * CMAudioFormatDescriptionGetFormatList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionGetFormatList">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetFormatList(CMFormatDescriptionRef desc,
            NUIntPtr formatListSize);

    /**
     * CMAudioFormatDescriptionGetRichestDecodableFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionGetRichestDecodableFormat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetRichestDecodableFormat(
            CMFormatDescriptionRef desc);

    /**
     * CMAudioFormatDescriptionGetMostCompatibleFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionGetMostCompatibleFormat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetMostCompatibleFormat(
            CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateSummary(CFAllocatorRef allocator,
            CFArrayRef formatDescriptionArray, int flags, Ptr<CMFormatDescriptionRef> summaryFormatDescriptionOut);

    /**
     * CMAudioFormatDescriptionEqual</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMAudioFormatDescriptionEqual">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMAudioFormatDescriptionEqual(CMFormatDescriptionRef desc1, CMFormatDescriptionRef desc2,
            int equalityMask, IntPtr equalityMaskOut);

    /**
     * CMVideoFormatDescriptionCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMVideoFormatDescriptionCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreate(CFAllocatorRef allocator, int codecType, int width,
            int height, CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> outDesc);

    /**
     * CMVideoFormatDescriptionCreateForImageBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMVideoFormatDescriptionCreateForImageBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateForImageBuffer(CFAllocatorRef allocator,
            CVBufferRef imageBuffer, Ptr<CMFormatDescriptionRef> outDesc);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromH264ParameterSets(CFAllocatorRef allocator,
            @NUInt long parameterSetCount,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointers,
            ConstNUIntPtr parameterSetSizes, int NALUnitHeaderLength, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionGetH264ParameterSetAtIndex(CMFormatDescriptionRef videoDesc,
            @NUInt long parameterSetIndex,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointerOut,
            NUIntPtr parameterSetSizeOut, NUIntPtr parameterSetCountOut, IntPtr NALUnitHeaderLengthOut);

    /**
     * CMVideoFormatDescriptionGetDimensions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMVideoFormatDescriptionGetDimensions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMVideoDimensions CMVideoFormatDescriptionGetDimensions(CMFormatDescriptionRef videoDesc);

    /**
     * CMVideoFormatDescriptionGetPresentationDimensions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMVideoFormatDescriptionGetPresentationDimensions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CMVideoFormatDescriptionGetPresentationDimensions(CMFormatDescriptionRef videoDesc,
            byte usePixelAspectRatio, byte useCleanAperture);

    /**
     * CMVideoFormatDescriptionGetCleanAperture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMVideoFormatDescriptionGetCleanAperture">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CMVideoFormatDescriptionGetCleanAperture(CMFormatDescriptionRef videoDesc,
            byte originIsAtTopLeft);

    /**
     * CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers();

    /**
     * CMVideoFormatDescriptionMatchesImageBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMVideoFormatDescriptionMatchesImageBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMVideoFormatDescriptionMatchesImageBuffer(CMFormatDescriptionRef desc,
            CVBufferRef imageBuffer);

    /**
     * CMMuxedFormatDescriptionCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMMuxedFormatDescriptionCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMMuxedFormatDescriptionCreate(CFAllocatorRef allocator, int muxType,
            CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> outDesc);

    /**
     * CMTextFormatDescriptionGetDisplayFlags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTextFormatDescriptionGetDisplayFlags">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDisplayFlags(CMFormatDescriptionRef desc,
            IntPtr outDisplayFlags);

    /**
     * CMTextFormatDescriptionGetJustification</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTextFormatDescriptionGetJustification">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetJustification(CMFormatDescriptionRef desc,
            BytePtr outHorizontalJust, BytePtr outVerticalJust);

    /**
     * CMTextFormatDescriptionGetDefaultTextBox</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTextFormatDescriptionGetDefaultTextBox">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDefaultTextBox(CMFormatDescriptionRef desc,
            byte originIsAtTopLeft, @NFloat double heightOfTextTrack,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect outDefaultTextBox);

    /**
     * CMTextFormatDescriptionGetFontName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTextFormatDescriptionGetFontName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetFontName(CMFormatDescriptionRef desc, char localFontID,
            Ptr<CFStringRef> outFontName);

    /**
     * CMTimeCodeFormatDescriptionCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTimeCodeFormatDescriptionCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreate(CFAllocatorRef allocator, int timeCodeFormatType,
            @ByValue CMTime frameDuration, int frameQuanta, int tcFlags, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> descOut);

    /**
     * CMTimeCodeFormatDescriptionGetFrameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTimeCodeFormatDescriptionGetFrameDuration">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeCodeFormatDescriptionGetFrameDuration(
            CMFormatDescriptionRef timeCodeFormatDescription);

    /**
     * CMTimeCodeFormatDescriptionGetFrameQuanta</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTimeCodeFormatDescriptionGetFrameQuanta">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionGetFrameQuanta(
            CMFormatDescriptionRef timeCodeFormatDescription);

    /**
     * CMTimeCodeFormatDescriptionGetTimeCodeFlags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMTimeCodeFormatDescriptionGetTimeCodeFlags">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionGetTimeCodeFlags(CMFormatDescriptionRef desc);

    /**
     * CMMetadataFormatDescriptionCreateWithKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMMetadataFormatDescriptionCreateWithKeys">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithKeys(CFAllocatorRef allocator, int metadataType,
            CFArrayRef keys, Ptr<CMFormatDescriptionRef> outDesc);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithMetadataSpecifications(CFAllocatorRef allocator,
            int metadataType, CFArrayRef metadataSpecifications, Ptr<CMFormatDescriptionRef> outDesc);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateWithMetadataFormatDescriptionAndMetadataSpecifications(
            CFAllocatorRef allocator, CMFormatDescriptionRef srcDesc, CFArrayRef metadataSpecifications,
            Ptr<CMFormatDescriptionRef> outDesc);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateByMergingMetadataFormatDescriptions(
            CFAllocatorRef allocator, CMFormatDescriptionRef srcDesc1, CMFormatDescriptionRef srcDesc2,
            Ptr<CMFormatDescriptionRef> outDesc);

    /**
     * CMMetadataFormatDescriptionGetKeyWithLocalID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMFormatDescription/index.html#//apple_ref/c/func/CMMetadataFormatDescriptionGetKeyWithLocalID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CMMetadataFormatDescriptionGetKeyWithLocalID(CMFormatDescriptionRef desc,
            int localKeyID);

    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataFormatDescriptionGetIdentifiers(CMFormatDescriptionRef desc);

    /**
     * CMSampleBufferCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreate(CFAllocatorRef allocator, CMBlockBufferRef dataBuffer, byte dataReady,
            @FunctionPtr(name = "call_CMSampleBufferCreate") Function_CMSampleBufferCreate makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, ConstNUIntPtr sampleSizeArray, Ptr<CMSampleBufferRef> sBufOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReady(CFAllocatorRef allocator, CMBlockBufferRef dataBuffer,
            CMFormatDescriptionRef formatDescription, @NInt long numSamples, @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, ConstNUIntPtr sampleSizeArray, Ptr<CMSampleBufferRef> sBufOut);

    /**
     * CMAudioSampleBufferCreateWithPacketDescriptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMAudioSampleBufferCreateWithPacketDescriptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateWithPacketDescriptions(CFAllocatorRef allocator,
            CMBlockBufferRef dataBuffer, byte dataReady,
            @FunctionPtr(name = "call_CMAudioSampleBufferCreateWithPacketDescriptions") Function_CMAudioSampleBufferCreateWithPacketDescriptions makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @ByValue CMTime sbufPTS,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            Ptr<CMSampleBufferRef> sBufOut);

    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateReadyWithPacketDescriptions(CFAllocatorRef allocator,
            CMBlockBufferRef dataBuffer, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @ByValue CMTime sbufPTS,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            Ptr<CMSampleBufferRef> sBufOut);

    /**
     * CMSampleBufferCreateForImageBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferCreateForImageBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateForImageBuffer(CFAllocatorRef allocator, CVBufferRef imageBuffer,
            byte dataReady,
            @FunctionPtr(name = "call_CMSampleBufferCreateForImageBuffer") Function_CMSampleBufferCreateForImageBuffer makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            Ptr<CMSampleBufferRef> sBufOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReadyWithImageBuffer(CFAllocatorRef allocator, CVBufferRef imageBuffer,
            CMFormatDescriptionRef formatDescription,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            Ptr<CMSampleBufferRef> sBufOut);

    /**
     * CMSampleBufferCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopy(CFAllocatorRef allocator, CMSampleBufferRef sbuf,
            Ptr<CMSampleBufferRef> sbufCopyOut);

    /**
     * CMSampleBufferCreateCopyWithNewTiming</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferCreateCopyWithNewTiming">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopyWithNewTiming(CFAllocatorRef allocator,
            CMSampleBufferRef originalSBuf, @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            Ptr<CMSampleBufferRef> sBufCopyOut);

    /**
     * CMSampleBufferCopySampleBufferForRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferCopySampleBufferForRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCopySampleBufferForRange(CFAllocatorRef allocator, CMSampleBufferRef sbuf,
            @ByValue CFRange sampleRange, Ptr<CMSampleBufferRef> sBufOut);

    /**
     * CMSampleBufferGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTypeID();

    /**
     * CMSampleBufferSetDataBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferSetDataBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBuffer(CMSampleBufferRef sbuf, CMBlockBufferRef dataBuffer);

    /**
     * CMSampleBufferGetDataBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetDataBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CMBlockBufferRef CMSampleBufferGetDataBuffer(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetImageBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetImageBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CVBufferRef CMSampleBufferGetImageBuffer(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferSetDataBufferFromAudioBufferList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferSetDataBufferFromAudioBufferList">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBufferFromAudioBufferList(CMSampleBufferRef sbuf,
            CFAllocatorRef bbufStructAllocator, CFAllocatorRef bbufMemoryAllocator, int flags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    /**
     * CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer(CMSampleBufferRef sbuf,
            NUIntPtr bufferListSizeNeededOut,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferListOut,
            @NUInt long bufferListSize, CFAllocatorRef bbufStructAllocator, CFAllocatorRef bbufMemoryAllocator,
            int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    /**
     * CMSampleBufferGetAudioStreamPacketDescriptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetAudioStreamPacketDescriptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptions(CMSampleBufferRef sbuf,
            @NUInt long packetDescriptionsSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptionsOut,
            NUIntPtr packetDescriptionsSizeNeededOut);

    /**
     * CMSampleBufferGetAudioStreamPacketDescriptionsPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetAudioStreamPacketDescriptionsPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptionsPtr(CMSampleBufferRef sbuf,
            Ptr<ConstPtr<AudioStreamPacketDescription>> packetDescriptionsPtrOut, NUIntPtr packetDescriptionsSizeOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCopyPCMDataIntoAudioBufferList(CMSampleBufferRef sbuf, int frameOffset,
            int numFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    /**
     * CMSampleBufferSetDataReady</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferSetDataReady">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataReady(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferDataIsReady</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferDataIsReady">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferDataIsReady(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataFailed(CMSampleBufferRef sbuf, int status);

    @Generated
    @CFunction
    public static native byte CMSampleBufferHasDataFailed(CMSampleBufferRef sbuf, IntPtr statusOut);

    /**
     * CMSampleBufferMakeDataReady</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferMakeDataReady">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferMakeDataReady(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferTrackDataReadiness</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferTrackDataReadiness">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferTrackDataReadiness(CMSampleBufferRef sbuf, CMSampleBufferRef sbufToTrack);

    /**
     * CMSampleBufferInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferInvalidate(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferSetInvalidateCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferSetInvalidateCallback">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateCallback(CMSampleBufferRef sbuf,
            @FunctionPtr(name = "call_CMSampleBufferSetInvalidateCallback") Function_CMSampleBufferSetInvalidateCallback invalidateCallback,
            long invalidateRefCon);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateHandler(CMSampleBufferRef sbuf,
            @ObjCBlock(name = "call_CMSampleBufferSetInvalidateHandler") Block_CMSampleBufferSetInvalidateHandler invalidateHandler);

    /**
     * CMSampleBufferIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMSampleBufferIsValid(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetNumSamples</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetNumSamples">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMSampleBufferGetNumSamples(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetDuration">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDuration(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetPresentationTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetPresentationTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetPresentationTimeStamp(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetDecodeTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetDecodeTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDecodeTimeStamp(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetOutputDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetOutputDuration">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDuration(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetOutputPresentationTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetOutputPresentationTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputPresentationTimeStamp(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferSetOutputPresentationTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferSetOutputPresentationTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferSetOutputPresentationTimeStamp(CMSampleBufferRef sbuf,
            @ByValue CMTime outputPresentationTimeStamp);

    /**
     * CMSampleBufferGetOutputDecodeTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetOutputDecodeTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDecodeTimeStamp(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetSampleTimingInfoArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetSampleTimingInfoArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfoArray(CMSampleBufferRef sbuf,
            @NInt long timingArrayEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            NIntPtr timingArrayEntriesNeededOut);

    /**
     * CMSampleBufferGetOutputSampleTimingInfoArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetOutputSampleTimingInfoArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetOutputSampleTimingInfoArray(CMSampleBufferRef sbuf,
            @NInt long timingArrayEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            NIntPtr timingArrayEntriesNeededOut);

    /**
     * CMSampleBufferGetSampleTimingInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetSampleTimingInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfo(CMSampleBufferRef sbuf, @NInt long sampleIndex,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingInfoOut);

    /**
     * CMSampleBufferGetSampleSizeArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetSampleSizeArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleSizeArray(CMSampleBufferRef sbuf, @NInt long sizeArrayEntries,
            NUIntPtr sizeArrayOut, NIntPtr sizeArrayEntriesNeededOut);

    /**
     * CMSampleBufferGetSampleSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetSampleSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetSampleSize(CMSampleBufferRef sbuf, @NInt long sampleIndex);

    /**
     * CMSampleBufferGetTotalSampleSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetTotalSampleSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTotalSampleSize(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetFormatDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetFormatDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CMFormatDescriptionRef CMSampleBufferGetFormatDescription(CMSampleBufferRef sbuf);

    /**
     * CMSampleBufferGetSampleAttachmentsArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferGetSampleAttachmentsArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMSampleBufferGetSampleAttachmentsArray(CMSampleBufferRef sbuf,
            byte createIfNecessary);

    /**
     * CMSampleBufferCallForEachSample</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSampleBuffer/index.html#//apple_ref/c/func/CMSampleBufferCallForEachSample">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSampleBufferCallForEachSample(CMSampleBufferRef sbuf,
            @FunctionPtr(name = "call_CMSampleBufferCallForEachSample") Function_CMSampleBufferCallForEachSample callback,
            VoidPtr refcon);

    @Generated
    @CFunction
    public static native int CMSampleBufferCallBlockForEachSample(CMSampleBufferRef sbuf,
            @ObjCBlock(name = "call_CMSampleBufferCallBlockForEachSample") Block_CMSampleBufferCallBlockForEachSample handler);

    /**
     * CMClockGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMClockGetTypeID();

    /**
     * CMClockGetHostTimeClock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockGetHostTimeClock">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CMClockRef CMClockGetHostTimeClock();

    /**
     * CMClockConvertHostTimeToSystemUnits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockConvertHostTimeToSystemUnits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native long CMClockConvertHostTimeToSystemUnits(@ByValue CMTime hostTime);

    /**
     * CMClockMakeHostTimeFromSystemUnits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockMakeHostTimeFromSystemUnits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockMakeHostTimeFromSystemUnits(long hostTime);

    /**
     * CMClockGetTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockGetTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockGetTime(CMClockRef clock);

    /**
     * CMClockGetAnchorTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockGetAnchorTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMClockGetAnchorTime(CMClockRef clock,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outClockTime,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outReferenceClockTime);

    /**
     * CMClockMightDrift</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockMightDrift">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMClockMightDrift(CMClockRef clock, CMClockRef otherClock);

    /**
     * CMClockInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMClockInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMClockInvalidate(CMClockRef clock);

    /**
     * CMTimebaseGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMTimebaseGetTypeID();

    /**
     * CMTimebaseCreateWithMasterClock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseCreateWithMasterClock">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterClock(CFAllocatorRef allocator, CMClockRef masterClock,
            Ptr<CMTimebaseRef> timebaseOut);

    /**
     * CMTimebaseCreateWithMasterTimebase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseCreateWithMasterTimebase">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterTimebase(CFAllocatorRef allocator, CMTimebaseRef masterTimebase,
            Ptr<CMTimebaseRef> timebaseOut);

    /**
     * CMTimebaseGetMasterTimebase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetMasterTimebase">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CMTimebaseRef CMTimebaseGetMasterTimebase(CMTimebaseRef timebase);

    /**
     * CMTimebaseGetMasterClock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetMasterClock">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseGetMasterClock(CMTimebaseRef timebase);

    /**
     * CMTimebaseGetMaster</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetMaster">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr CMTimebaseGetMaster(CMTimebaseRef timebase);

    /**
     * CMTimebaseGetUltimateMasterClock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetUltimateMasterClock">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseGetUltimateMasterClock(CMTimebaseRef timebase);

    /**
     * CMTimebaseGetTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTime(CMTimebaseRef timebase);

    /**
     * CMTimebaseGetTimeWithTimeScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetTimeWithTimeScale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTimeWithTimeScale(CMTimebaseRef timebase, int timescale, int method);

    /**
     * CMTimebaseSetTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTime(CMTimebaseRef timebase, @ByValue CMTime time);

    /**
     * CMTimebaseSetAnchorTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetAnchorTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetAnchorTime(CMTimebaseRef timebase, @ByValue CMTime timebaseTime,
            @ByValue CMTime immediateMasterTime);

    /**
     * CMTimebaseGetRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetRate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CMTimebaseGetRate(CMTimebaseRef timebase);

    /**
     * CMTimebaseGetTimeAndRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetTimeAndRate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseGetTimeAndRate(CMTimebaseRef timebase,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outTime, DoublePtr outRate);

    /**
     * CMTimebaseSetRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetRate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetRate(CMTimebaseRef timebase, double rate);

    /**
     * CMTimebaseSetRateAndAnchorTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetRateAndAnchorTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetRateAndAnchorTime(CMTimebaseRef timebase, double rate,
            @ByValue CMTime timebaseTime, @ByValue CMTime immediateMasterTime);

    /**
     * CMTimebaseGetEffectiveRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseGetEffectiveRate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CMTimebaseGetEffectiveRate(CMTimebaseRef timebase);

    /**
     * CMTimebaseAddTimer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseAddTimer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseAddTimer(CMTimebaseRef timebase, CFRunLoopTimerRef timer, CFRunLoopRef runloop);

    /**
     * CMTimebaseRemoveTimer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseRemoveTimer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimer(CMTimebaseRef timebase, CFRunLoopTimerRef timer);

    /**
     * CMTimebaseSetTimerNextFireTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetTimerNextFireTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerNextFireTime(CMTimebaseRef timebase, CFRunLoopTimerRef timer,
            @ByValue CMTime fireTime, int flags);

    /**
     * CMTimebaseSetTimerToFireImmediately</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetTimerToFireImmediately">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerToFireImmediately(CMTimebaseRef timebase, CFRunLoopTimerRef timer);

    /**
     * CMTimebaseAddTimerDispatchSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseAddTimerDispatchSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseAddTimerDispatchSource(CMTimebaseRef timebase, NSObject timerSource);

    /**
     * CMTimebaseRemoveTimerDispatchSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseRemoveTimerDispatchSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimerDispatchSource(CMTimebaseRef timebase, NSObject timerSource);

    /**
     * CMTimebaseSetTimerDispatchSourceNextFireTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetTimerDispatchSourceNextFireTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceNextFireTime(CMTimebaseRef timebase, NSObject timerSource,
            @ByValue CMTime fireTime, int flags);

    /**
     * CMTimebaseSetTimerDispatchSourceToFireImmediately</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseSetTimerDispatchSourceToFireImmediately">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceToFireImmediately(CMTimebaseRef timebase,
            NSObject timerSource);

    /**
     * CMSyncGetRelativeRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMSyncGetRelativeRate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CMSyncGetRelativeRate(ConstVoidPtr ofClockOrTimebase,
            ConstVoidPtr relativeToClockOrTimebase);

    /**
     * CMSyncGetRelativeRateAndAnchorTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMSyncGetRelativeRateAndAnchorTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSyncGetRelativeRateAndAnchorTime(ConstVoidPtr ofClockOrTimebase,
            ConstVoidPtr relativeToClockOrTimebase, DoublePtr outRelativeRate,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outOfClockOrTimebaseAnchorTime,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outRelativeToClockOrTimebaseAnchorTime);

    /**
     * CMSyncConvertTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMSyncConvertTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncConvertTime(@ByValue CMTime time, ConstVoidPtr fromClockOrTimebase,
            ConstVoidPtr toClockOrTimebase);

    /**
     * CMSyncMightDrift</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMSyncMightDrift">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMSyncMightDrift(ConstVoidPtr clockOrTimebase1, ConstVoidPtr clockOrTimebase2);

    /**
     * CMSyncGetTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMSyncGetTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncGetTime(ConstVoidPtr clockOrTimebase);

    /**
     * CMTimebaseNotificationBarrier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSync/index.html#//apple_ref/c/func/CMTimebaseNotificationBarrier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMTimebaseNotificationBarrier(CMTimebaseRef timebase);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String imageDescriptionData,
            @NUInt long imageDescriptionSize, int imageDescriptionStringEncoding, CFStringRef imageDescriptionFlavor,
            Ptr<CMFormatDescriptionRef> videoFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef imageDescriptionBlockBuffer, int imageDescriptionStringEncoding,
            CFStringRef imageDescriptionFlavor, Ptr<CMFormatDescriptionRef> videoFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef videoFormatDescription, int imageDescriptionStringEncoding,
            CFStringRef imageDescriptionFlavor, Ptr<CMBlockBufferRef> imageDescriptionBlockBufferOut);

    @Generated
    @CFunction
    public static native int CMSwapBigEndianImageDescriptionToHost(BytePtr imageDescriptionData,
            @NUInt long imageDescriptionSize);

    @Generated
    @CFunction
    public static native int CMSwapHostEndianImageDescriptionToBig(BytePtr imageDescriptionData,
            @NUInt long imageDescriptionSize);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionData(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String soundDescriptionData,
            @NUInt long soundDescriptionSize, CFStringRef soundDescriptionFlavor,
            Ptr<CMFormatDescriptionRef> audioFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef soundDescriptionBlockBuffer, CFStringRef soundDescriptionFlavor,
            Ptr<CMFormatDescriptionRef> audioFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef audioFormatDescription, CFStringRef soundDescriptionFlavor,
            Ptr<CMBlockBufferRef> soundDescriptionBlockBufferOut);

    @Generated
    @CFunction
    public static native byte CMDoesBigEndianSoundDescriptionRequireLegacyCBRSampleTableLayout(
            CMBlockBufferRef soundDescriptionBlockBuffer, CFStringRef soundDescriptionFlavor);

    @Generated
    @CFunction
    public static native int CMSwapBigEndianSoundDescriptionToHost(BytePtr soundDescriptionData,
            @NUInt long soundDescriptionSize);

    @Generated
    @CFunction
    public static native int CMSwapHostEndianSoundDescriptionToBig(BytePtr soundDescriptionData,
            @NUInt long soundDescriptionSize);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCreateFromBigEndianTextDescriptionData(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String textDescriptionData,
            @NUInt long textDescriptionSize, CFStringRef textDescriptionFlavor, int mediaType,
            Ptr<CMFormatDescriptionRef> textFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef textDescriptionBlockBuffer, CFStringRef textDescriptionFlavor,
            int mediaType, Ptr<CMFormatDescriptionRef> textFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer(CFAllocatorRef allocator,
            CMFormatDescriptionRef textFormatDescription, CFStringRef textDescriptionFlavor,
            Ptr<CMBlockBufferRef> textDescriptionBlockBufferOut);

    @Generated
    @CFunction
    public static native int CMSwapBigEndianTextDescriptionToHost(BytePtr textDescriptionData,
            @NUInt long textDescriptionSize);

    @Generated
    @CFunction
    public static native int CMSwapHostEndianTextDescriptionToBig(BytePtr textDescriptionData,
            @NUInt long textDescriptionSize);

    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionData(
            CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String closedCaptionDescriptionData,
            @NUInt long closedCaptionDescriptionSize, CFStringRef closedCaptionDescriptionFlavor,
            Ptr<CMFormatDescriptionRef> closedCaptionFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef closedCaptionDescriptionBlockBuffer,
            CFStringRef closedCaptionDescriptionFlavor, Ptr<CMFormatDescriptionRef> closedCaptionFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCopyAsBigEndianClosedCaptionDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef closedCaptionFormatDescription,
            CFStringRef closedCaptionDescriptionFlavor, Ptr<CMBlockBufferRef> closedCaptionDescriptionBlockBufferOut);

    @Generated
    @CFunction
    public static native int CMSwapBigEndianClosedCaptionDescriptionToHost(BytePtr closedCaptionDescriptionData,
            @NUInt long closedCaptionDescriptionSize);

    @Generated
    @CFunction
    public static native int CMSwapHostEndianClosedCaptionDescriptionToBig(BytePtr closedCaptionDescriptionData,
            @NUInt long closedCaptionDescriptionSize);

    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionData(
            CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String timeCodeDescriptionData,
            @NUInt long timeCodeDescriptionSize, CFStringRef timeCodeDescriptionFlavor,
            Ptr<CMFormatDescriptionRef> timeCodeFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef timeCodeDescriptionBlockBuffer,
            CFStringRef timeCodeDescriptionFlavor, Ptr<CMFormatDescriptionRef> timeCodeFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef timeCodeFormatDescription,
            CFStringRef timeCodeDescriptionFlavor, Ptr<CMBlockBufferRef> timeCodeDescriptionBlockBufferOut);

    @Generated
    @CFunction
    public static native int CMSwapBigEndianTimeCodeDescriptionToHost(BytePtr timeCodeDescriptionData,
            @NUInt long timeCodeDescriptionSize);

    @Generated
    @CFunction
    public static native int CMSwapHostEndianTimeCodeDescriptionToBig(BytePtr timeCodeDescriptionData,
            @NUInt long timeCodeDescriptionSize);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionData(
            CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String metadataDescriptionData,
            @NUInt long metadataDescriptionSize, CFStringRef metadataDescriptionFlavor,
            Ptr<CMFormatDescriptionRef> metadataFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef metadataDescriptionBlockBuffer,
            CFStringRef metadataDescriptionFlavor, Ptr<CMFormatDescriptionRef> metadataFormatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef metadataFormatDescription,
            CFStringRef metadataDescriptionFlavor, Ptr<CMBlockBufferRef> metadataDescriptionBlockBufferOut);

    @Generated
    @CFunction
    public static native int CMSwapBigEndianMetadataDescriptionToHost(BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    @Generated
    @CFunction
    public static native int CMSwapHostEndianMetadataDescriptionToBig(BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    /**
     * CMBufferQueueGetCallbacksForUnsortedSampleBuffers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetCallbacksForUnsortedSampleBuffers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForUnsortedSampleBuffers();

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForSampleBuffersSortedByOutputPTS();

    /**
     * CMBufferQueueCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCreate(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBufferCallbacks callbacks,
            Ptr<CMBufferQueueRef> queueOut);

    /**
     * CMBufferQueueGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTypeID();

    /**
     * CMBufferQueueEnqueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueEnqueue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueEnqueue(CMBufferQueueRef queue, ConstVoidPtr buf);

    /**
     * CMBufferQueueDequeueAndRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueDequeueAndRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueAndRetain(CMBufferQueueRef queue);

    /**
     * CMBufferQueueDequeueIfDataReadyAndRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueDequeueIfDataReadyAndRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueIfDataReadyAndRetain(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetHead</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetHead">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueGetHead(CMBufferQueueRef queue);

    /**
     * CMBufferQueueIsEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueIsEmpty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueIsEmpty(CMBufferQueueRef queue);

    /**
     * CMBufferQueueMarkEndOfData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueMarkEndOfData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueMarkEndOfData(CMBufferQueueRef queue);

    /**
     * CMBufferQueueContainsEndOfData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueContainsEndOfData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueContainsEndOfData(CMBufferQueueRef queue);

    /**
     * CMBufferQueueIsAtEndOfData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueIsAtEndOfData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueIsAtEndOfData(CMBufferQueueRef queue);

    /**
     * CMBufferQueueReset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueReset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueReset(CMBufferQueueRef queue);

    /**
     * CMBufferQueueResetWithCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueResetWithCallback">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueResetWithCallback(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueResetWithCallback") Function_CMBufferQueueResetWithCallback callback,
            VoidPtr refcon);

    /**
     * CMBufferQueueGetBufferCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetBufferCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CMBufferQueueGetBufferCount(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetDuration">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetDuration(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetMinDecodeTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetMinDecodeTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinDecodeTimeStamp(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetFirstDecodeTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetFirstDecodeTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstDecodeTimeStamp(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetMinPresentationTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetMinPresentationTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinPresentationTimeStamp(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetFirstPresentationTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetFirstPresentationTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstPresentationTimeStamp(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetMaxPresentationTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetMaxPresentationTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMaxPresentationTimeStamp(CMBufferQueueRef queue);

    /**
     * CMBufferQueueGetEndPresentationTimeStamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueGetEndPresentationTimeStamp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetEndPresentationTimeStamp(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTotalSize(CMBufferQueueRef queue);

    /**
     * CMBufferQueueInstallTrigger</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueInstallTrigger">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTrigger(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueInstallTrigger") Function_CMBufferQueueInstallTrigger triggerCallback,
            VoidPtr triggerRefcon, int triggerCondition, @ByValue CMTime triggerTime,
            Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    /**
     * CMBufferQueueInstallTriggerWithIntegerThreshold</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueInstallTriggerWithIntegerThreshold">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerWithIntegerThreshold(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueInstallTriggerWithIntegerThreshold") Function_CMBufferQueueInstallTriggerWithIntegerThreshold triggerCallback,
            VoidPtr triggerRefcon, int triggerCondition, @NInt long triggerThreshold,
            Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    /**
     * CMBufferQueueRemoveTrigger</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueRemoveTrigger">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueRemoveTrigger(CMBufferQueueRef queue, CMBufferQueueTriggerToken triggerToken);

    /**
     * CMBufferQueueTestTrigger</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueTestTrigger">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMBufferQueueTestTrigger(CMBufferQueueRef queue, CMBufferQueueTriggerToken triggerToken);

    /**
     * CMBufferQueueCallForEachBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueCallForEachBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueCallForEachBuffer(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueCallForEachBuffer") Function_CMBufferQueueCallForEachBuffer callback,
            VoidPtr refcon);

    /**
     * CMBufferQueueSetValidationCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMBufferQueue/index.html#//apple_ref/c/func/CMBufferQueueSetValidationCallback">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMBufferQueueSetValidationCallback(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueSetValidationCallback") Function_CMBufferQueueSetValidationCallback validationCallback,
            VoidPtr validationRefCon);

    /**
     * CMSimpleQueueGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSimpleQueue/index.html#//apple_ref/c/func/CMSimpleQueueGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMSimpleQueueGetTypeID();

    /**
     * CMSimpleQueueCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSimpleQueue/index.html#//apple_ref/c/func/CMSimpleQueueCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueCreate(CFAllocatorRef allocator, int capacity,
            Ptr<CMSimpleQueueRef> queueOut);

    @Generated
    @CFunction
    public static native int CMSimpleQueueEnqueue(CMSimpleQueueRef queue, ConstVoidPtr element);

    /**
     * CMSimpleQueueDequeue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSimpleQueue/index.html#//apple_ref/c/func/CMSimpleQueueDequeue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueDequeue(CMSimpleQueueRef queue);

    /**
     * CMSimpleQueueGetHead</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSimpleQueue/index.html#//apple_ref/c/func/CMSimpleQueueGetHead">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueGetHead(CMSimpleQueueRef queue);

    /**
     * CMSimpleQueueReset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSimpleQueue/index.html#//apple_ref/c/func/CMSimpleQueueReset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueReset(CMSimpleQueueRef queue);

    /**
     * CMSimpleQueueGetCapacity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSimpleQueue/index.html#//apple_ref/c/func/CMSimpleQueueGetCapacity">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCapacity(CMSimpleQueueRef queue);

    /**
     * CMSimpleQueueGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMSimpleQueue/index.html#//apple_ref/c/func/CMSimpleQueueGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCount(CMSimpleQueueRef queue);

    /**
     * CMMemoryPoolGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMemoryPool/index.html#//apple_ref/c/func/CMMemoryPoolGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CMMemoryPoolGetTypeID();

    /**
     * CMMemoryPoolCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMemoryPool/index.html#//apple_ref/c/func/CMMemoryPoolCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CMMemoryPoolRef CMMemoryPoolCreate(CFDictionaryRef options);

    /**
     * CMMemoryPoolGetAllocator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMemoryPool/index.html#//apple_ref/c/func/CMMemoryPoolGetAllocator">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFAllocatorRef CMMemoryPoolGetAllocator(CMMemoryPoolRef pool);

    /**
     * CMMemoryPoolFlush</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMemoryPool/index.html#//apple_ref/c/func/CMMemoryPoolFlush">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMMemoryPoolFlush(CMMemoryPoolRef pool);

    /**
     * CMMemoryPoolInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMemoryPool/index.html#//apple_ref/c/func/CMMemoryPoolInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CMMemoryPoolInvalidate(CMMemoryPoolRef pool);

    /**
     * CMMetadataCreateIdentifierForKeyAndKeySpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataCreateIdentifierForKeyAndKeySpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateIdentifierForKeyAndKeySpace(CFAllocatorRef allocator, ConstVoidPtr key,
            CFStringRef keySpace, Ptr<CFStringRef> identifierOut);

    /**
     * CMMetadataCreateKeyFromIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataCreateKeyFromIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifier(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<ConstVoidPtr> keyOut);

    /**
     * CMMetadataCreateKeyFromIdentifierAsCFData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataCreateKeyFromIdentifierAsCFData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifierAsCFData(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<CFDataRef> keyOut);

    /**
     * CMMetadataCreateKeySpaceFromIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataCreateKeySpaceFromIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMMetadataCreateKeySpaceFromIdentifier(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<CFStringRef> keySpaceOut);

    /**
     * CMMetadataDataTypeRegistryRegisterDataType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryRegisterDataType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CMMetadataDataTypeRegistryRegisterDataType(CFStringRef dataType, CFStringRef description,
            CFArrayRef conformingDataTypes);

    /**
     * CMMetadataDataTypeRegistryDataTypeIsRegistered</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryDataTypeIsRegistered">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsRegistered(CFStringRef dataType);

    /**
     * CMMetadataDataTypeRegistryGetDataTypeDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryGetDataTypeDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetDataTypeDescription(CFStringRef dataType);

    /**
     * CMMetadataDataTypeRegistryGetConformingDataTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryGetConformingDataTypes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetConformingDataTypes(CFStringRef dataType);

    /**
     * CMMetadataDataTypeRegistryDataTypeConformsToDataType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryDataTypeConformsToDataType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeConformsToDataType(CFStringRef dataType,
            CFStringRef conformsToDataType);

    /**
     * CMMetadataDataTypeRegistryGetBaseDataTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryGetBaseDataTypes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetBaseDataTypes();

    /**
     * CMMetadataDataTypeRegistryDataTypeIsBaseDataType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryDataTypeIsBaseDataType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsBaseDataType(CFStringRef dataType);

    /**
     * CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMMetadata/index.html#//apple_ref/c/func/CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType(
            CFStringRef dataType);

    /**
     * CMAudioClockCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreMedia/Reference/CMAudioClock/index.html#//apple_ref/c/func/CMAudioClockCreate">iOS Dev Center</a>
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

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeScaleKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeEpochKey();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeRangeStartKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeRangeDurationKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_OriginalCompressionSettings();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_SampleDescriptionExtensionAtoms();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimSampleDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimISOSampleEntry();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FormatName();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Depth();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureWidthRational();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHeightRational();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureHorizontalOffsetRational();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionKey_CleanApertureVerticalOffsetRational();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_P22();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_FullRangeVideo();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ICCProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_BytesPerRow();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionConformsToMPEG2VideoProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_TemporalQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_SpatialQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Version();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_RevisionLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_Vendor();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionVendor_Apple();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DisplayFlags();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_BackgroundColor();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Red();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Green();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Blue();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionColor_Alpha();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultTextBox();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Top();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Left();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Bottom();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionRect_Right();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultStyle();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_StartChar();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Font();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_FontFace();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_ForegroundColor();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_FontSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_HorizontalJustification();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_VerticalJustification();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_EndChar();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_FontTable();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_TextJustification();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Height();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionStyle_Ascent();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextFormatDescriptionExtension_DefaultFontName();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionExtension_SourceReferenceName();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionKey_Value();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeCodeFormatDescriptionKey_LangCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtensionKey_MetadataKeyTable();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_Namespace();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_Value();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_LocalID();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_DataType();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_DataTypeNamespace();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_ConformingDataTypes();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_LanguageTag();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_Identifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_DataType();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_ExtendedLanguageTag();

    @Generated
    @CVariable()
    @ByValue
    public static native CMSampleTimingInfo kCMTimingInfoInvalid();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotification_DataBecameReady();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotification_DataFailed();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferNotificationParameter_OSStatus();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_InhibitOutputUntil();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_ResumeTag();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_ResetOutput();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotification_UpcomingOutputPTSRangeChanged();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_UpcomingOutputPTSRangeMayOverlapQueuedOutputPTSRange();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_MinUpcomingOutputPTS();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConduitNotificationParameter_MaxUpcomingOutputPTS();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferConsumerNotification_BufferConsumed();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_NotSync();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_PartialSync();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HasRedundantCoding();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_IsDependedOnByOthers();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DependsOnOthers();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_EarlierDisplayTimesAllowed();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DisplayImmediately();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_DoNotDisplay();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ResetDecoderBeforeDecoding();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DrainAfterDecoding();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_PostNotificationWhenConsumed();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ResumeOutput();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TransitionID();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TrimDurationAtStart();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_TrimDurationAtEnd();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SpeedMultiplier();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_Reverse();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_FillDiscontinuitiesWithSilence();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_EmptyMedia();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_PermanentEmptyMedia();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DisplayEmptyMediaImmediately();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_EndsPreviousSampleDuration();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SampleReferenceURL();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_SampleReferenceByteOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_GradualDecoderRefresh();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DroppedFrameReason();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_FrameWasLate();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_OutOfBuffers();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReason_Discontinuity();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferDroppedFrameReasonInfo_CameraModeSwitch();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_ForceKeyFrame();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotification_EffectiveRateChanged();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotification_TimeJumped();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimebaseNotificationKey_EventTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_QuickTimeMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_ISOFamily();

    @Generated
    @CVariable()
    public static native CFStringRef kCMImageDescriptionFlavor_3GPFamily();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_QuickTimeMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_QuickTimeMovieV2();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_ISOFamily();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSoundDescriptionFlavor_3GPFamily();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMemoryPoolOption_AgeOutPeriod();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_ForegroundColorARGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BackgroundColorARGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_CharacterBackgroundColorARGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BoldStyle();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_ItalicStyle();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_UnderlineStyle();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_FontFamilyName();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_GenericFontFamilyName();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_BaseFontSizePercentageRelativeToVideoHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_RelativeFontSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_VerticalLayout();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextVerticalLayout_LeftToRight();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextVerticalLayout_RightToLeft();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_Alignment();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_TextPositionPercentageRelativeToWritingDirection();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_OrthogonalLinePositionPercentageRelativeToWritingDirection();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_WritingDirectionSizePercentage();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTextMarkupAttribute_CharacterEdgeStyle();

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
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLocation_ISO6709();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataDirection_Facing();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataPreferredAffineTransform();

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
    public static native CFStringRef kCMMetadataDataType_QuickTimeMetadataLocation_ISO6709();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataDataType_QuickTimeMetadataDirection();

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMake(@ByValue CMTimeRange source, @ByValue CMTimeRange target);

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMakeEmpty(@ByValue CMTimeRange target);

    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeMappingCopyAsDictionary(@ByValue CMTimeMapping mapping,
            CFAllocatorRef allocator);

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeMapping CMTimeMappingMakeFromDictionary(CFDictionaryRef dict);

    @Generated
    @CFunction
    public static native CFStringRef CMTimeMappingCopyDescription(CFAllocatorRef allocator,
            @ByValue CMTimeMapping mapping);

    @Generated
    @CFunction
    public static native void CMTimeMappingShow(@ByValue CMTimeMapping mapping);

    @Generated
    @CFunction
    public static native CMTimebaseRef CMTimebaseCopyMasterTimebase(CMTimebaseRef timebase);

    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseCopyMasterClock(CMTimebaseRef timebase);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMTimebaseCopyMaster(CMTimebaseRef timebase);

    @Generated
    @CFunction
    public static native CMClockRef CMTimebaseCopyUltimateMasterClock(CMTimebaseRef timebase);

    @Generated
    @CVariable()
    @ByValue
    public static native CMTimeMapping kCMTimeMappingInvalid();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeMappingSourceKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCMTimeMappingTargetKey();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_DCI_P3();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_P3_D65();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionColorPrimaries_ITU_R_2020();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_2020();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_2020();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimImageDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_StructuralDependency();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescription_StructuralDependencyKey_DependencyIsInvalidFlag();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_StructuralDependency();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_StillImageLensStabilizationInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Active();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_OutOfRange();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Unavailable();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferLensStabilizationInfo_Off();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataVideoOrientation();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PolygonF32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PolylineF32();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_JSON();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataKeySpace_HLSDateRange();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCreate {
        @Generated
        int call_CMSampleBufferCreate(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMAudioSampleBufferCreateWithPacketDescriptions {
        @Generated
        int call_CMAudioSampleBufferCreateWithPacketDescriptions(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCreateForImageBuffer {
        @Generated
        int call_CMSampleBufferCreateForImageBuffer(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferSetInvalidateCallback {
        @Generated
        void call_CMSampleBufferSetInvalidateCallback(VoidPtr arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CMSampleBufferSetInvalidateHandler {
        @Generated
        void call_CMSampleBufferSetInvalidateHandler(CMSampleBufferRef arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMSampleBufferCallForEachSample {
        @Generated
        int call_CMSampleBufferCallForEachSample(VoidPtr arg0, @NInt long arg1, VoidPtr arg2);
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
        void call_CMBufferQueueInstallTrigger(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CMBufferQueueInstallTriggerWithIntegerThreshold {
        @Generated
        void call_CMBufferQueueInstallTriggerWithIntegerThreshold(VoidPtr arg0, VoidPtr arg1);
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
        int call_CMBufferQueueSetValidationCallback(VoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }
}
