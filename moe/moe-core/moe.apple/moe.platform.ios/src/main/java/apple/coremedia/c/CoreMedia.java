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

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMake(long value, int timescale);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithEpoch(long value, int timescale, long epoch);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeWithSeconds(double seconds, int preferredTimescale);

    @Generated
    @CFunction
    public static native double CMTimeGetSeconds(@ByValue CMTime time);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeConvertScale(@ByValue CMTime time, int newTimescale, int method);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAdd(@ByValue CMTime lhs, @ByValue CMTime rhs);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeSubtract(@ByValue CMTime lhs, @ByValue CMTime rhs);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiply(@ByValue CMTime time, int multiplier);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByFloat64(@ByValue CMTime time, double multiplier);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMultiplyByRatio(@ByValue CMTime time, int multiplier, int divisor);

    @Generated
    @CFunction
    public static native int CMTimeCompare(@ByValue CMTime time1, @ByValue CMTime time2);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMinimum(@ByValue CMTime time1, @ByValue CMTime time2);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMaximum(@ByValue CMTime time1, @ByValue CMTime time2);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeAbsoluteValue(@ByValue CMTime time);

    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeCopyAsDictionary(@ByValue CMTime time, CFAllocatorRef allocator);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMakeFromDictionary(CFDictionaryRef dictionaryRepresentation);

    @Generated
    @CFunction
    public static native CFStringRef CMTimeCopyDescription(CFAllocatorRef allocator, @ByValue CMTime time);

    @Generated
    @CFunction
    public static native void CMTimeShow(@ByValue CMTime time);

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMake(@ByValue CMTime start, @ByValue CMTime duration);

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetUnion(@ByValue CMTimeRange range, @ByValue CMTimeRange otherRange);

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeGetIntersection(@ByValue CMTimeRange range,
            @ByValue CMTimeRange otherRange);

    @Generated
    @CFunction
    public static native byte CMTimeRangeEqual(@ByValue CMTimeRange range1, @ByValue CMTimeRange range2);

    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTime(@ByValue CMTimeRange range, @ByValue CMTime time);

    @Generated
    @CFunction
    public static native byte CMTimeRangeContainsTimeRange(@ByValue CMTimeRange range, @ByValue CMTimeRange otherRange);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeRangeGetEnd(@ByValue CMTimeRange range);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapTimeFromRangeToRange(@ByValue CMTime t, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeClampToRange(@ByValue CMTime time, @ByValue CMTimeRange range);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeMapDurationFromRangeToRange(@ByValue CMTime dur, @ByValue CMTimeRange fromRange,
            @ByValue CMTimeRange toRange);

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeFromTimeToTime(@ByValue CMTime start, @ByValue CMTime end);

    @Generated
    @CFunction
    public static native CFDictionaryRef CMTimeRangeCopyAsDictionary(@ByValue CMTimeRange range,
            CFAllocatorRef allocator);

    @Generated
    @CFunction
    @ByValue
    public static native CMTimeRange CMTimeRangeMakeFromDictionary(CFDictionaryRef dictionaryRepresentation);

    @Generated
    @CFunction
    public static native CFStringRef CMTimeRangeCopyDescription(CFAllocatorRef allocator, @ByValue CMTimeRange range);

    @Generated
    @CFunction
    public static native void CMTimeRangeShow(@ByValue CMTimeRange range);

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
    public static native CMTimeMapping CMTimeMappingMakeFromDictionary(CFDictionaryRef dictionaryRepresentation);

    @Generated
    @CFunction
    public static native CFStringRef CMTimeMappingCopyDescription(CFAllocatorRef allocator,
            @ByValue CMTimeMapping mapping);

    @Generated
    @CFunction
    public static native void CMTimeMappingShow(@ByValue CMTimeMapping mapping);

    @Generated
    @CFunction
    public static native void CMSetAttachment(ConstVoidPtr target, CFStringRef key, ConstVoidPtr value,
            int attachmentMode);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMGetAttachment(ConstVoidPtr target, CFStringRef key, IntPtr attachmentModeOut);

    @Generated
    @CFunction
    public static native void CMRemoveAttachment(ConstVoidPtr target, CFStringRef key);

    @Generated
    @CFunction
    public static native void CMRemoveAllAttachments(ConstVoidPtr target);

    @Generated
    @CFunction
    public static native CFDictionaryRef CMCopyDictionaryOfAttachments(CFAllocatorRef allocator, ConstVoidPtr target,
            int attachmentMode);

    @Generated
    @CFunction
    public static native void CMSetAttachments(ConstVoidPtr target, CFDictionaryRef theAttachments, int attachmentMode);

    @Generated
    @CFunction
    public static native void CMPropagateAttachments(ConstVoidPtr source, ConstVoidPtr destination);

    @Generated
    @CFunction
    public static native int CMBlockBufferCreateEmpty(CFAllocatorRef structureAllocator, int subBlockCapacity,
            int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithMemoryBlock(CFAllocatorRef structureAllocator, VoidPtr memoryBlock,
            @NUInt long blockLength, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    @Generated
    @CFunction
    public static native int CMBlockBufferCreateWithBufferReference(CFAllocatorRef structureAllocator,
            CMBlockBufferRef bufferReference, @NUInt long offsetToData, @NUInt long dataLength, int flags,
            Ptr<CMBlockBufferRef> blockBufferOut);

    @Generated
    @CFunction
    public static native int CMBlockBufferCreateContiguous(CFAllocatorRef structureAllocator,
            CMBlockBufferRef sourceBuffer, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetTypeID();

    @Generated
    @CFunction
    public static native int CMBlockBufferAppendMemoryBlock(CMBlockBufferRef theBuffer, VoidPtr memoryBlock,
            @NUInt long blockLength, CFAllocatorRef blockAllocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBlockBufferCustomBlockSource customBlockSource,
            @NUInt long offsetToData, @NUInt long dataLength, int flags);

    @Generated
    @CFunction
    public static native int CMBlockBufferAppendBufferReference(CMBlockBufferRef theBuffer, CMBlockBufferRef targetBBuf,
            @NUInt long offsetToData, @NUInt long dataLength, int flags);

    @Generated
    @CFunction
    public static native int CMBlockBufferAssureBlockMemory(CMBlockBufferRef theBuffer);

    @Generated
    @CFunction
    public static native int CMBlockBufferAccessDataBytes(CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length, VoidPtr temporaryBlock, Ptr<BytePtr> returnedPointerOut);

    @Generated
    @CFunction
    public static native int CMBlockBufferCopyDataBytes(CMBlockBufferRef theSourceBuffer, @NUInt long offsetToData,
            @NUInt long dataLength, VoidPtr destination);

    @Generated
    @CFunction
    public static native int CMBlockBufferReplaceDataBytes(ConstVoidPtr sourceBytes, CMBlockBufferRef destinationBuffer,
            @NUInt long offsetIntoDestination, @NUInt long dataLength);

    @Generated
    @CFunction
    public static native int CMBlockBufferFillDataBytes(byte fillByte, CMBlockBufferRef destinationBuffer,
            @NUInt long offsetIntoDestination, @NUInt long dataLength);

    @Generated
    @CFunction
    public static native int CMBlockBufferGetDataPointer(CMBlockBufferRef theBuffer, @NUInt long offset,
            NUIntPtr lengthAtOffsetOut, NUIntPtr totalLengthOut, Ptr<BytePtr> dataPointerOut);

    @Generated
    @CFunction
    @NUInt
    public static native long CMBlockBufferGetDataLength(CMBlockBufferRef theBuffer);

    @Generated
    @CFunction
    public static native byte CMBlockBufferIsRangeContiguous(CMBlockBufferRef theBuffer, @NUInt long offset,
            @NUInt long length);

    @Generated
    @CFunction
    public static native byte CMBlockBufferIsEmpty(CMBlockBufferRef theBuffer);

    @Generated
    @CFunction
    public static native int CMFormatDescriptionCreate(CFAllocatorRef allocator, int mediaType, int mediaSubType,
            CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    @NUInt
    public static native long CMFormatDescriptionGetTypeID();

    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqual(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef otherFormatDescription);

    @Generated
    @CFunction
    public static native byte CMFormatDescriptionEqualIgnoringExtensionKeys(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef otherFormatDescription, ConstVoidPtr formatDescriptionExtensionKeysToIgnore,
            ConstVoidPtr sampleDescriptionExtensionAtomKeysToIgnore);

    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaType(CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    public static native int CMFormatDescriptionGetMediaSubType(CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    public static native CFDictionaryRef CMFormatDescriptionGetExtensions(CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMFormatDescriptionGetExtension(CMFormatDescriptionRef desc,
            CFStringRef extensionKey);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription asbd,
            @NUInt long layoutSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout layout,
            @NUInt long magicCookieSize, ConstVoidPtr magicCookie, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioStreamBasicDescription CMAudioFormatDescriptionGetStreamBasicDescription(
            CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMAudioFormatDescriptionGetMagicCookie(CMFormatDescriptionRef desc,
            NUIntPtr sizeOut);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioChannelLayout CMAudioFormatDescriptionGetChannelLayout(CMFormatDescriptionRef desc,
            NUIntPtr sizeOut);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetFormatList(CMFormatDescriptionRef desc,
            NUIntPtr sizeOut);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetRichestDecodableFormat(
            CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFormatListItem CMAudioFormatDescriptionGetMostCompatibleFormat(
            CMFormatDescriptionRef desc);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateSummary(CFAllocatorRef allocator,
            CFArrayRef formatDescriptionArray, int flags, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native byte CMAudioFormatDescriptionEqual(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef otherFormatDescription, int equalityMask, IntPtr equalityMaskOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreate(CFAllocatorRef allocator, int codecType, int width,
            int height, CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateForImageBuffer(CFAllocatorRef allocator,
            CVBufferRef imageBuffer, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

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

    @Generated
    @CFunction
    @ByValue
    public static native CMVideoDimensions CMVideoFormatDescriptionGetDimensions(CMFormatDescriptionRef videoDesc);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize CMVideoFormatDescriptionGetPresentationDimensions(CMFormatDescriptionRef videoDesc,
            byte usePixelAspectRatio, byte useCleanAperture);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CMVideoFormatDescriptionGetCleanAperture(CMFormatDescriptionRef videoDesc,
            byte originIsAtTopLeft);

    @Generated
    @CFunction
    public static native CFArrayRef CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers();

    @Generated
    @CFunction
    public static native byte CMVideoFormatDescriptionMatchesImageBuffer(CMFormatDescriptionRef desc,
            CVBufferRef imageBuffer);

    @Generated
    @CFunction
    public static native int CMMuxedFormatDescriptionCreate(CFAllocatorRef allocator, int muxType,
            CFDictionaryRef extensions, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDisplayFlags(CMFormatDescriptionRef desc,
            IntPtr displayFlagsOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetJustification(CMFormatDescriptionRef desc,
            BytePtr horizontaJustificationlOut, BytePtr verticalJustificationOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetDefaultTextBox(CMFormatDescriptionRef desc,
            byte originIsAtTopLeft, @NFloat double heightOfTextTrack,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect defaultTextBoxOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionGetFontName(CMFormatDescriptionRef desc, char localFontID,
            Ptr<CFStringRef> fontNameOut);

    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreate(CFAllocatorRef allocator, int timeCodeFormatType,
            @ByValue CMTime frameDuration, int frameQuanta, int flags, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeCodeFormatDescriptionGetFrameDuration(
            CMFormatDescriptionRef timeCodeFormatDescription);

    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionGetFrameQuanta(
            CMFormatDescriptionRef timeCodeFormatDescription);

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

    @Generated
    @CFunction
    public static native int CMSampleBufferCreate(CFAllocatorRef allocator, CMBlockBufferRef dataBuffer, byte dataReady,
            @FunctionPtr(name = "call_CMSampleBufferCreate") Function_CMSampleBufferCreate makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, ConstNUIntPtr sampleSizeArray, Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReady(CFAllocatorRef allocator, CMBlockBufferRef dataBuffer,
            CMFormatDescriptionRef formatDescription, @NInt long numSamples, @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            @NInt long numSampleSizeEntries, ConstNUIntPtr sampleSizeArray, Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateWithPacketDescriptions(CFAllocatorRef allocator,
            CMBlockBufferRef dataBuffer, byte dataReady,
            @FunctionPtr(name = "call_CMAudioSampleBufferCreateWithPacketDescriptions") Function_CMAudioSampleBufferCreateWithPacketDescriptions makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @ByValue CMTime presentationTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMAudioSampleBufferCreateReadyWithPacketDescriptions(CFAllocatorRef allocator,
            CMBlockBufferRef dataBuffer, CMFormatDescriptionRef formatDescription, @NInt long numSamples,
            @ByValue CMTime presentationTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptions,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCreateForImageBuffer(CFAllocatorRef allocator, CVBufferRef imageBuffer,
            byte dataReady,
            @FunctionPtr(name = "call_CMSampleBufferCreateForImageBuffer") Function_CMSampleBufferCreateForImageBuffer makeDataReadyCallback,
            VoidPtr makeDataReadyRefcon, CMFormatDescriptionRef formatDescription,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCreateReadyWithImageBuffer(CFAllocatorRef allocator, CVBufferRef imageBuffer,
            CMFormatDescriptionRef formatDescription,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTiming,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopy(CFAllocatorRef allocator, CMSampleBufferRef sbuf,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCreateCopyWithNewTiming(CFAllocatorRef allocator,
            CMSampleBufferRef originalSBuf, @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo sampleTimingArray,
            Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCopySampleBufferForRange(CFAllocatorRef allocator, CMSampleBufferRef sbuf,
            @ByValue CFRange sampleRange, Ptr<CMSampleBufferRef> sampleBufferOut);

    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTypeID();

    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBuffer(CMSampleBufferRef sbuf, CMBlockBufferRef dataBuffer);

    @Generated
    @CFunction
    public static native CMBlockBufferRef CMSampleBufferGetDataBuffer(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native CVBufferRef CMSampleBufferGetImageBuffer(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataBufferFromAudioBufferList(CMSampleBufferRef sbuf,
            CFAllocatorRef blockBufferStructureAllocator, CFAllocatorRef blockBufferBlockAllocator, int flags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer(CMSampleBufferRef sbuf,
            NUIntPtr bufferListSizeNeededOut,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferListOut,
            @NUInt long bufferListSize, CFAllocatorRef blockBufferStructureAllocator,
            CFAllocatorRef blockBufferBlockAllocator, int flags, Ptr<CMBlockBufferRef> blockBufferOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptions(CMSampleBufferRef sbuf,
            @NUInt long packetDescriptionsSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription packetDescriptionsOut,
            NUIntPtr packetDescriptionsSizeNeededOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferGetAudioStreamPacketDescriptionsPtr(CMSampleBufferRef sbuf,
            Ptr<ConstPtr<AudioStreamPacketDescription>> packetDescriptionsPointerOut,
            NUIntPtr packetDescriptionsSizeOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferCopyPCMDataIntoAudioBufferList(CMSampleBufferRef sbuf, int frameOffset,
            int numFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferList);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataReady(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native byte CMSampleBufferDataIsReady(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetDataFailed(CMSampleBufferRef sbuf, int status);

    @Generated
    @CFunction
    public static native byte CMSampleBufferHasDataFailed(CMSampleBufferRef sbuf, IntPtr statusOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferMakeDataReady(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native int CMSampleBufferTrackDataReadiness(CMSampleBufferRef sbuf,
            CMSampleBufferRef sampleBufferToTrack);

    @Generated
    @CFunction
    public static native int CMSampleBufferInvalidate(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateCallback(CMSampleBufferRef sbuf,
            @FunctionPtr(name = "call_CMSampleBufferSetInvalidateCallback") Function_CMSampleBufferSetInvalidateCallback invalidateCallback,
            long invalidateRefCon);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetInvalidateHandler(CMSampleBufferRef sbuf,
            @ObjCBlock(name = "call_CMSampleBufferSetInvalidateHandler") Block_CMSampleBufferSetInvalidateHandler invalidateHandler);

    @Generated
    @CFunction
    public static native byte CMSampleBufferIsValid(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    @NInt
    public static native long CMSampleBufferGetNumSamples(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDuration(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetPresentationTimeStamp(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetDecodeTimeStamp(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDuration(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputPresentationTimeStamp(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native int CMSampleBufferSetOutputPresentationTimeStamp(CMSampleBufferRef sbuf,
            @ByValue CMTime outputPresentationTimeStamp);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSampleBufferGetOutputDecodeTimeStamp(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfoArray(CMSampleBufferRef sbuf,
            @NInt long numSampleTimingEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            NIntPtr timingArrayEntriesNeededOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferGetOutputSampleTimingInfoArray(CMSampleBufferRef sbuf,
            @NInt long timingArrayEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingArrayOut,
            NIntPtr timingArrayEntriesNeededOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleTimingInfo(CMSampleBufferRef sbuf, @NInt long sampleIndex,
            @UncertainArgument("Options: reference, array Fallback: reference") CMSampleTimingInfo timingInfoOut);

    @Generated
    @CFunction
    public static native int CMSampleBufferGetSampleSizeArray(CMSampleBufferRef sbuf, @NInt long sizeArrayEntries,
            NUIntPtr sizeArrayOut, NIntPtr sizeArrayEntriesNeededOut);

    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetSampleSize(CMSampleBufferRef sbuf, @NInt long sampleIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long CMSampleBufferGetTotalSampleSize(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native CMFormatDescriptionRef CMSampleBufferGetFormatDescription(CMSampleBufferRef sbuf);

    @Generated
    @CFunction
    public static native CFArrayRef CMSampleBufferGetSampleAttachmentsArray(CMSampleBufferRef sbuf,
            byte createIfNecessary);

    @Generated
    @CFunction
    public static native int CMSampleBufferCallForEachSample(CMSampleBufferRef sbuf,
            @FunctionPtr(name = "call_CMSampleBufferCallForEachSample") Function_CMSampleBufferCallForEachSample callback,
            VoidPtr refcon);

    @Generated
    @CFunction
    public static native int CMSampleBufferCallBlockForEachSample(CMSampleBufferRef sbuf,
            @ObjCBlock(name = "call_CMSampleBufferCallBlockForEachSample") Block_CMSampleBufferCallBlockForEachSample handler);

    @Generated
    @CFunction
    @NUInt
    public static native long CMClockGetTypeID();

    @Generated
    @CFunction
    public static native CMClockRef CMClockGetHostTimeClock();

    @Generated
    @CFunction
    public static native long CMClockConvertHostTimeToSystemUnits(@ByValue CMTime hostTime);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockMakeHostTimeFromSystemUnits(long hostTime);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMClockGetTime(CMClockRef clock);

    @Generated
    @CFunction
    public static native int CMClockGetAnchorTime(CMClockRef clock,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime clockTimeOut,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime referenceClockTimeOut);

    @Generated
    @CFunction
    public static native byte CMClockMightDrift(CMClockRef clock, CMClockRef otherClock);

    @Generated
    @CFunction
    public static native void CMClockInvalidate(CMClockRef clock);

    @Generated
    @CFunction
    @NUInt
    public static native long CMTimebaseGetTypeID();

    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterClock(CFAllocatorRef allocator, CMClockRef masterClock,
            Ptr<CMTimebaseRef> timebaseOut);

    @Generated
    @CFunction
    public static native int CMTimebaseCreateWithMasterTimebase(CFAllocatorRef allocator, CMTimebaseRef masterTimebase,
            Ptr<CMTimebaseRef> timebaseOut);

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
    @Deprecated
    @CFunction
    public static native CMTimebaseRef CMTimebaseGetMasterTimebase(CMTimebaseRef timebase);

    @Generated
    @Deprecated
    @CFunction
    public static native CMClockRef CMTimebaseGetMasterClock(CMTimebaseRef timebase);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CMTimebaseGetMaster(CMTimebaseRef timebase);

    @Generated
    @Deprecated
    @CFunction
    public static native CMClockRef CMTimebaseGetUltimateMasterClock(CMTimebaseRef timebase);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTime(CMTimebaseRef timebase);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimebaseGetTimeWithTimeScale(CMTimebaseRef timebase, int timescale, int method);

    @Generated
    @CFunction
    public static native int CMTimebaseSetTime(CMTimebaseRef timebase, @ByValue CMTime time);

    @Generated
    @CFunction
    public static native int CMTimebaseSetAnchorTime(CMTimebaseRef timebase, @ByValue CMTime timebaseTime,
            @ByValue CMTime immediateMasterTime);

    @Generated
    @CFunction
    public static native double CMTimebaseGetRate(CMTimebaseRef timebase);

    @Generated
    @CFunction
    public static native int CMTimebaseGetTimeAndRate(CMTimebaseRef timebase,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime timeOut, DoublePtr rateOut);

    @Generated
    @CFunction
    public static native int CMTimebaseSetRate(CMTimebaseRef timebase, double rate);

    @Generated
    @CFunction
    public static native int CMTimebaseSetRateAndAnchorTime(CMTimebaseRef timebase, double rate,
            @ByValue CMTime timebaseTime, @ByValue CMTime immediateMasterTime);

    @Generated
    @CFunction
    public static native double CMTimebaseGetEffectiveRate(CMTimebaseRef timebase);

    @Generated
    @CFunction
    public static native int CMTimebaseAddTimer(CMTimebaseRef timebase, CFRunLoopTimerRef timer, CFRunLoopRef runloop);

    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimer(CMTimebaseRef timebase, CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerNextFireTime(CMTimebaseRef timebase, CFRunLoopTimerRef timer,
            @ByValue CMTime fireTime, int flags);

    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerToFireImmediately(CMTimebaseRef timebase, CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native int CMTimebaseAddTimerDispatchSource(CMTimebaseRef timebase, NSObject timerSource);

    @Generated
    @CFunction
    public static native int CMTimebaseRemoveTimerDispatchSource(CMTimebaseRef timebase, NSObject timerSource);

    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceNextFireTime(CMTimebaseRef timebase, NSObject timerSource,
            @ByValue CMTime fireTime, int flags);

    @Generated
    @CFunction
    public static native int CMTimebaseSetTimerDispatchSourceToFireImmediately(CMTimebaseRef timebase,
            NSObject timerSource);

    @Generated
    @CFunction
    public static native double CMSyncGetRelativeRate(ConstVoidPtr ofClockOrTimebase,
            ConstVoidPtr relativeToClockOrTimebase);

    @Generated
    @CFunction
    public static native int CMSyncGetRelativeRateAndAnchorTime(ConstVoidPtr ofClockOrTimebase,
            ConstVoidPtr relativeToClockOrTimebase, DoublePtr outRelativeRate,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outOfClockOrTimebaseAnchorTime,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outRelativeToClockOrTimebaseAnchorTime);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncConvertTime(@ByValue CMTime time, ConstVoidPtr fromClockOrTimebase,
            ConstVoidPtr toClockOrTimebase);

    @Generated
    @CFunction
    public static native byte CMSyncMightDrift(ConstVoidPtr clockOrTimebase1, ConstVoidPtr clockOrTimebase2);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMSyncGetTime(ConstVoidPtr clockOrTimebase);

    @Generated
    @CFunction
    public static native int CMTimebaseNotificationBarrier(CMTimebaseRef timebase);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String imageDescriptionData,
            @NUInt long size, int stringEncoding, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef imageDescriptionBlockBuffer, int stringEncoding,
            CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef videoFormatDescription, int stringEncoding,
            CFStringRef flavor, Ptr<CMBlockBufferRef> blockBufferOut);

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
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef soundDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef audioFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

    @Generated
    @CFunction
    public static native byte CMDoesBigEndianSoundDescriptionRequireLegacyCBRSampleTableLayout(
            CMBlockBufferRef soundDescriptionBlockBuffer, CFStringRef flavor);

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
            @NUInt long size, CFStringRef flavor, int mediaType, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef textDescriptionBlockBuffer, CFStringRef flavor, int mediaType,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer(CFAllocatorRef allocator,
            CMFormatDescriptionRef textFormatDescription, CFStringRef flavor, Ptr<CMBlockBufferRef> blockBufferOut);

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
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef closedCaptionDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMClosedCaptionFormatDescriptionCopyAsBigEndianClosedCaptionDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef closedCaptionFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

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
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef timeCodeDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef timeCodeFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

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
            @NUInt long size, CFStringRef flavor, Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMBlockBufferRef metadataDescriptionBlockBuffer, CFStringRef flavor,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer(
            CFAllocatorRef allocator, CMFormatDescriptionRef metadataFormatDescription, CFStringRef flavor,
            Ptr<CMBlockBufferRef> blockBufferOut);

    @Generated
    @CFunction
    public static native int CMSwapBigEndianMetadataDescriptionToHost(BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    @Generated
    @CFunction
    public static native int CMSwapHostEndianMetadataDescriptionToBig(BytePtr metadataDescriptionData,
            @NUInt long metadataDescriptionSize);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForUnsortedSampleBuffers();

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CMBufferCallbacks CMBufferQueueGetCallbacksForSampleBuffersSortedByOutputPTS();

    @Generated
    @CFunction
    public static native int CMBufferQueueCreate(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CMBufferCallbacks callbacks,
            Ptr<CMBufferQueueRef> queueOut);

    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTypeID();

    @Generated
    @CFunction
    public static native int CMBufferQueueEnqueue(CMBufferQueueRef queue, ConstVoidPtr buf);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueAndRetain(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueDequeueIfDataReadyAndRetain(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMBufferQueueGetHead(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native byte CMBufferQueueIsEmpty(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native int CMBufferQueueMarkEndOfData(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native byte CMBufferQueueContainsEndOfData(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native byte CMBufferQueueIsAtEndOfData(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native int CMBufferQueueReset(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native int CMBufferQueueResetWithCallback(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueResetWithCallback") Function_CMBufferQueueResetWithCallback callback,
            VoidPtr refcon);

    @Generated
    @CFunction
    @NInt
    public static native long CMBufferQueueGetBufferCount(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetDuration(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinDecodeTimeStamp(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstDecodeTimeStamp(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMinPresentationTimeStamp(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetFirstPresentationTimeStamp(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetMaxPresentationTimeStamp(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMBufferQueueGetEndPresentationTimeStamp(CMBufferQueueRef queue);

    @Generated
    @CFunction
    @NUInt
    public static native long CMBufferQueueGetTotalSize(CMBufferQueueRef queue);

    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTrigger(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueInstallTrigger") Function_CMBufferQueueInstallTrigger callback,
            VoidPtr refcon, int condition, @ByValue CMTime time, Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    @Generated
    @CFunction
    public static native int CMBufferQueueInstallTriggerWithIntegerThreshold(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueInstallTriggerWithIntegerThreshold") Function_CMBufferQueueInstallTriggerWithIntegerThreshold callback,
            VoidPtr refcon, int condition, @NInt long threshold, Ptr<CMBufferQueueTriggerToken> triggerTokenOut);

    @Generated
    @CFunction
    public static native int CMBufferQueueRemoveTrigger(CMBufferQueueRef queue, CMBufferQueueTriggerToken triggerToken);

    @Generated
    @CFunction
    public static native byte CMBufferQueueTestTrigger(CMBufferQueueRef queue, CMBufferQueueTriggerToken triggerToken);

    @Generated
    @CFunction
    public static native int CMBufferQueueCallForEachBuffer(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueCallForEachBuffer") Function_CMBufferQueueCallForEachBuffer callback,
            VoidPtr refcon);

    @Generated
    @CFunction
    public static native int CMBufferQueueSetValidationCallback(CMBufferQueueRef queue,
            @FunctionPtr(name = "call_CMBufferQueueSetValidationCallback") Function_CMBufferQueueSetValidationCallback callback,
            VoidPtr refcon);

    @Generated
    @CFunction
    @NUInt
    public static native long CMSimpleQueueGetTypeID();

    @Generated
    @CFunction
    public static native int CMSimpleQueueCreate(CFAllocatorRef allocator, int capacity,
            Ptr<CMSimpleQueueRef> queueOut);

    @Generated
    @CFunction
    public static native int CMSimpleQueueEnqueue(CMSimpleQueueRef queue, ConstVoidPtr element);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueDequeue(CMSimpleQueueRef queue);

    @Generated
    @CFunction
    public static native ConstVoidPtr CMSimpleQueueGetHead(CMSimpleQueueRef queue);

    @Generated
    @CFunction
    public static native int CMSimpleQueueReset(CMSimpleQueueRef queue);

    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCapacity(CMSimpleQueueRef queue);

    @Generated
    @CFunction
    public static native int CMSimpleQueueGetCount(CMSimpleQueueRef queue);

    @Generated
    @CFunction
    @NUInt
    public static native long CMMemoryPoolGetTypeID();

    @Generated
    @CFunction
    public static native CMMemoryPoolRef CMMemoryPoolCreate(CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CFAllocatorRef CMMemoryPoolGetAllocator(CMMemoryPoolRef pool);

    @Generated
    @CFunction
    public static native void CMMemoryPoolFlush(CMMemoryPoolRef pool);

    @Generated
    @CFunction
    public static native void CMMemoryPoolInvalidate(CMMemoryPoolRef pool);

    @Generated
    @CFunction
    public static native int CMMetadataCreateIdentifierForKeyAndKeySpace(CFAllocatorRef allocator, ConstVoidPtr key,
            CFStringRef keySpace, Ptr<CFStringRef> identifierOut);

    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifier(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<ConstVoidPtr> keyOut);

    @Generated
    @CFunction
    public static native int CMMetadataCreateKeyFromIdentifierAsCFData(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<CFDataRef> keyOut);

    @Generated
    @CFunction
    public static native int CMMetadataCreateKeySpaceFromIdentifier(CFAllocatorRef allocator, CFStringRef identifier,
            Ptr<CFStringRef> keySpaceOut);

    @Generated
    @CFunction
    public static native int CMMetadataDataTypeRegistryRegisterDataType(CFStringRef dataType, CFStringRef description,
            CFArrayRef conformingDataTypes);

    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsRegistered(CFStringRef dataType);

    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetDataTypeDescription(CFStringRef dataType);

    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetConformingDataTypes(CFStringRef dataType);

    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeConformsToDataType(CFStringRef dataType,
            CFStringRef conformsToDataType);

    @Generated
    @CFunction
    public static native CFArrayRef CMMetadataDataTypeRegistryGetBaseDataTypes();

    @Generated
    @CFunction
    public static native byte CMMetadataDataTypeRegistryDataTypeIsBaseDataType(CFStringRef dataType);

    @Generated
    @CFunction
    public static native CFStringRef CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType(
            CFStringRef dataType);

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_2020();

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionYCbCrMatrix_ITU_R_2020();

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
    public static native CFStringRef kCMFormatDescriptionConformsToMPEG2VideoProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_TemporalQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_SpatialQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_VerbatimImageDescription();

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
    public static native CFStringRef kCMMetadataFormatDescriptionKey_StructuralDependency();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionKey_SetupData();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescription_StructuralDependencyKey_DependencyIsInvalidFlag();

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
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_StructuralDependency();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataFormatDescriptionMetadataSpecificationKey_SetupData();

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
    public static native CFStringRef kCMMetadataKeySpace_HLSDateRange();

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
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataVideoOrientation();

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

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionCreateFromHEVCParameterSets(CFAllocatorRef allocator,
            @NUInt long parameterSetCount,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointers,
            ConstNUIntPtr parameterSetSizes, int NALUnitHeaderLength, CFDictionaryRef extensions,
            Ptr<CMFormatDescriptionRef> formatDescriptionOut);

    @Generated
    @CFunction
    public static native int CMVideoFormatDescriptionGetHEVCParameterSetAtIndex(CMFormatDescriptionRef videoDesc,
            @NUInt long parameterSetIndex,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] parameterSetPointerOut,
            NUIntPtr parameterSetSizeOut, NUIntPtr parameterSetCountOut, IntPtr NALUnitHeaderLengthOut);

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_SMPTE_ST_2084_PQ();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_ITU_R_2100_HLG();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_MasteringDisplayColorVolume();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ContentLightLevelInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCTemporalLevelInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_TemporalLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileSpace();

    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_TierFlag();

    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ProfileCompatibilityFlags();

    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_ConstraintIndicatorFlags();

    @Generated
    @CVariable()
    public static native CFStringRef kCMHEVCTemporalLevelInfoKey_LevelIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCTemporalSubLayerAccess();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCStepwiseTemporalSubLayerAccess();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_HEVCSyncSampleNALUnitType();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix();

    @Generated
    @CFunction
    @ByValue
    public static native CMTime CMTimeFoldIntoRange(@ByValue CMTime time, @ByValue CMTimeRange foldRange);

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

    @Generated
    @CFunction
    public static native int CMTimebaseSetMasterClock(CMTimebaseRef timebase, CMClockRef newMasterClock);

    @Generated
    @CFunction
    public static native int CMTimebaseSetMasterTimebase(CMTimebaseRef timebase, CMTimebaseRef newMasterTimebase);

    @Generated
    @CFunction
    public static native int CMBufferQueueCreateWithHandlers(CFAllocatorRef allocator, @NInt long capacity,
            VoidPtr handlers, Ptr<CMBufferQueueRef> queueOut);

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

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_Linear();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionTransferFunction_sRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AlternativeTransferCharacteristics();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AuxiliaryTypeInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_AlphaChannelMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionAlphaChannelMode_StraightAlpha();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionAlphaChannelMode_PremultipliedAlpha();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ContainsAlphaChannel();

    @Generated
    @CVariable()
    public static native CFStringRef kCMSampleAttachmentKey_AudioIndependentSampleDecoderRefreshCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransform();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataIdentifier_QuickTimeMetadataLivePhotoStillImageTransformReferenceDimensions();

    @Generated
    @CVariable()
    public static native CFStringRef kCMMetadataBaseDataType_PerspectiveTransformF64();

    @Generated
    @CVariable()
    public static native CFStringRef kCMFormatDescriptionExtension_ProtectedContentOriginalFormat();
}
