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

package apple.videotoolbox.c;

import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.corevideo.opaque.CVBufferRef;
import apple.corevideo.opaque.CVPixelBufferPoolRef;
import apple.videotoolbox.opaque.VTCompressionSessionRef;
import apple.videotoolbox.opaque.VTDecompressionSessionRef;
import apple.videotoolbox.opaque.VTFrameSiloRef;
import apple.videotoolbox.opaque.VTMultiPassStorageRef;
import apple.videotoolbox.struct.VTDecompressionOutputCallbackRecord;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("VideoToolbox")
@Runtime(CRuntime.class)
public final class VideoToolbox {
    static {
        NatJ.register();
    }

    @Generated
    private VideoToolbox() {
    }

    @Generated
    @CFunction
    public static native int VTSessionCopySupportedPropertyDictionary(ConstVoidPtr session,
            Ptr<CFDictionaryRef> supportedPropertyDictionaryOut);

    @Generated
    @CFunction
    public static native int VTSessionSetProperty(ConstVoidPtr session, CFStringRef propertyKey,
            ConstVoidPtr propertyValue);

    @Generated
    @CFunction
    public static native int VTSessionCopyProperty(ConstVoidPtr session, CFStringRef propertyKey,
            CFAllocatorRef allocator, VoidPtr propertyValueOut);

    @Generated
    @CFunction
    public static native int VTSessionSetProperties(ConstVoidPtr session, CFDictionaryRef propertyDictionary);

    @Generated
    @CFunction
    public static native int VTSessionCopySerializableProperties(ConstVoidPtr session, CFAllocatorRef allocator,
            Ptr<CFDictionaryRef> dictionaryOut);

    @Generated
    @CFunction
    public static native int VTCompressionSessionCreate(CFAllocatorRef allocator, int width, int height, int codecType,
            CFDictionaryRef encoderSpecification, CFDictionaryRef sourceImageBufferAttributes,
            CFAllocatorRef compressedDataAllocator,
            @FunctionPtr(name = "call_VTCompressionSessionCreate") Function_VTCompressionSessionCreate outputCallback,
            VoidPtr outputCallbackRefCon, Ptr<VTCompressionSessionRef> compressionSessionOut);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_VTCompressionSessionCreate {
        @Generated
        void call_VTCompressionSessionCreate(VoidPtr arg0, VoidPtr arg1, int arg2, int arg3, VoidPtr arg4);
    }

    @Generated
    @CFunction
    public static native void VTCompressionSessionInvalidate(VTCompressionSessionRef session);

    @Generated
    @CFunction
    @NUInt
    public static native long VTCompressionSessionGetTypeID();

    @Generated
    @CFunction
    public static native CVPixelBufferPoolRef VTCompressionSessionGetPixelBufferPool(VTCompressionSessionRef session);

    @Generated
    @CFunction
    public static native int VTCompressionSessionPrepareToEncodeFrames(VTCompressionSessionRef session);

    @Generated
    @CFunction
    public static native int VTCompressionSessionEncodeFrame(VTCompressionSessionRef session, CVBufferRef imageBuffer,
            @ByValue CMTime presentationTimeStamp, @ByValue CMTime duration, CFDictionaryRef frameProperties,
            VoidPtr sourceFrameRefCon, IntPtr infoFlagsOut);

    @Generated
    @CFunction
    public static native int VTCompressionSessionCompleteFrames(VTCompressionSessionRef session,
            @ByValue CMTime completeUntilPresentationTimeStamp);

    @Generated
    @CFunction
    public static native int VTCompressionSessionBeginPass(VTCompressionSessionRef session, int beginPassFlags,
            IntPtr reserved);

    @Generated
    @CFunction
    public static native int VTCompressionSessionEndPass(VTCompressionSessionRef session,
            BytePtr furtherPassesRequestedOut, IntPtr reserved);

    @Generated
    @CFunction
    public static native int VTCompressionSessionGetTimeRangesForNextPass(VTCompressionSessionRef session,
            NIntPtr timeRangeCountOut, Ptr<ConstPtr<CMTimeRange>> timeRangeArrayOut);

    @Generated
    @CFunction
    public static native int VTDecompressionSessionCreate(CFAllocatorRef allocator,
            CMFormatDescriptionRef videoFormatDescription, CFDictionaryRef videoDecoderSpecification,
            CFDictionaryRef destinationImageBufferAttributes,
            @UncertainArgument("Options: reference, array Fallback: reference") VTDecompressionOutputCallbackRecord outputCallback,
            Ptr<VTDecompressionSessionRef> decompressionSessionOut);

    @Generated
    @CFunction
    public static native void VTDecompressionSessionInvalidate(VTDecompressionSessionRef session);

    @Generated
    @CFunction
    @NUInt
    public static native long VTDecompressionSessionGetTypeID();

    @Generated
    @CFunction
    public static native int VTDecompressionSessionDecodeFrame(VTDecompressionSessionRef session,
            CMSampleBufferRef sampleBuffer, int decodeFlags, VoidPtr sourceFrameRefCon, IntPtr infoFlagsOut);

    @Generated
    @CFunction
    public static native int VTDecompressionSessionFinishDelayedFrames(VTDecompressionSessionRef session);

    @Generated
    @CFunction
    public static native byte VTDecompressionSessionCanAcceptFormatDescription(VTDecompressionSessionRef session,
            CMFormatDescriptionRef newFormatDesc);

    @Generated
    @CFunction
    public static native int VTDecompressionSessionWaitForAsynchronousFrames(VTDecompressionSessionRef session);

    @Generated
    @CFunction
    public static native int VTDecompressionSessionCopyBlackPixelBuffer(VTDecompressionSessionRef session,
            Ptr<CVBufferRef> pixelBufferOut);

    @Generated
    @CFunction
    @NUInt
    public static native long VTFrameSiloGetTypeID();

    @Generated
    @CFunction
    public static native int VTFrameSiloCreate(CFAllocatorRef allocator, CFURLRef fileURL,
            @ByValue CMTimeRange timeRange, CFDictionaryRef options, Ptr<VTFrameSiloRef> siloOut);

    @Generated
    @CFunction
    public static native int VTFrameSiloAddSampleBuffer(VTFrameSiloRef silo, CMSampleBufferRef sampleBuffer);

    @Generated
    @CFunction
    public static native int VTFrameSiloSetTimeRangesForNextPass(VTFrameSiloRef silo, @NInt long timeRangeCount,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTimeRange timeRangeArray);

    @Generated
    @CFunction
    public static native int VTFrameSiloGetProgressOfCurrentPass(VTFrameSiloRef silo, FloatPtr progressOut);

    @Generated
    @CFunction
    public static native int VTFrameSiloCallFunctionForEachSampleBuffer(VTFrameSiloRef silo,
            @ByValue CMTimeRange timeRange, VoidPtr callbackInfo,
            @FunctionPtr(name = "call_VTFrameSiloCallFunctionForEachSampleBuffer") Function_VTFrameSiloCallFunctionForEachSampleBuffer callback);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_VTFrameSiloCallFunctionForEachSampleBuffer {
        @Generated
        int call_VTFrameSiloCallFunctionForEachSampleBuffer(VoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @CFunction
    public static native int VTFrameSiloCallBlockForEachSampleBuffer(VTFrameSiloRef silo,
            @ByValue CMTimeRange timeRange,
            @ObjCBlock(name = "call_VTFrameSiloCallBlockForEachSampleBuffer") Block_VTFrameSiloCallBlockForEachSampleBuffer handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_VTFrameSiloCallBlockForEachSampleBuffer {
        @Generated
        int call_VTFrameSiloCallBlockForEachSampleBuffer(CMSampleBufferRef arg0);
    }

    @Generated
    @CFunction
    @NUInt
    public static native long VTMultiPassStorageGetTypeID();

    @Generated
    @CFunction
    public static native int VTMultiPassStorageCreate(CFAllocatorRef allocator, CFURLRef fileURL,
            @ByValue CMTimeRange timeRange, CFDictionaryRef options, Ptr<VTMultiPassStorageRef> multiPassStorageOut);

    @Generated
    @CFunction
    public static native int VTMultiPassStorageClose(VTMultiPassStorageRef multiPassStorage);

    @Generated
    @CFunction
    public static native int VTCopyVideoEncoderList(CFDictionaryRef options, Ptr<CFArrayRef> listOfVideoEncodersOut);

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_NumberOfPendingFrames();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PixelBufferPoolIsShared();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_VideoEncoderPixelBufferAttributes();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxKeyFrameInterval();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxKeyFrameIntervalDuration();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AllowTemporalCompression();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AllowFrameReordering();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AverageBitRate();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_DataRateLimits();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_Quality();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MoreFramesBeforeStart();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MoreFramesAfterEnd();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ProfileLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_1_3();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_3_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_3_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_3_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_4_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_4_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_4_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_5_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_5_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_5_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_AutoLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_3_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_3_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_3_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_4_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_4_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_4_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_5_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_5_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_5_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_AutoLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Extended_5_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Extended_AutoLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_3_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_3_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_3_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_4_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_4_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_4_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_5_0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_5_1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_5_2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_AutoLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L3();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Main_L2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Main_L3();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Main_L4();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L0();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L1();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L2();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L3();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L4();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H263_Profile0_Level10();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H263_Profile0_Level45();

    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H263_Profile3_Level45();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_H264EntropyMode();

    @Generated
    @CVariable()
    public static native CFStringRef kVTH264EntropyMode_CAVLC();

    @Generated
    @CVariable()
    public static native CFStringRef kVTH264EntropyMode_CABAC();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_Depth();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxFrameDelayCount();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxH264SliceBytes();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_RealTime();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_SourceFrameCount();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ExpectedFrameRate();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ExpectedDuration();

    @Generated
    @CVariable()
    public static native CFStringRef kVTEncodeFrameOptionKey_ForceKeyFrame();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_CleanAperture();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PixelAspectRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_FieldCount();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_FieldDetail();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AspectRatio16x9();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ProgressiveScan();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ColorPrimaries();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_TransferFunction();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_YCbCrMatrix();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ICCProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PixelTransferProperties();

    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MultiPassStorage();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyTypeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyType_Enumeration();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyType_Boolean();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyType_Number();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyReadWriteStatusKey();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyReadWriteStatus_ReadOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyReadWriteStatus_ReadWrite();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyShouldBeSerializedKey();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertySupportedValueMinimumKey();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertySupportedValueMaximumKey();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertySupportedValueListKey();

    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyDocumentationKey();

    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderSpecification_EncoderID();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelBufferPool();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelBufferPoolIsShared();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_OutputPoolRequestedMinimumBufferCount();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_NumberOfFramesBeingDecoded();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_MinOutputPresentationTimeStampOfFramesBeingDecoded();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_MaxOutputPresentationTimeStampOfFramesBeingDecoded();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ContentHasInterframeDependencies();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_RealTime();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ThreadCount();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_FieldMode();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_BothFields();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_TopFieldOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_BottomFieldOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_SingleField();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_DeinterlaceFields();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_DeinterlaceMode();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_DeinterlaceMode_VerticalFilter();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_DeinterlaceMode_Temporal();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ReducedResolutionDecode();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionResolutionKey_Width();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionResolutionKey_Height();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ReducedCoefficientDecode();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ReducedFrameDelivery();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_OnlyTheseFrames();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_AllFrames();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_NonDroppableFrames();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_IFrames();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_KeyFrames();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_SuggestedQualityOfServiceTiers();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_SupportedPixelFormatsOrderedByQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_SupportedPixelFormatsOrderedByPerformance();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelFormatsWithReducedResolutionSupport();

    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelTransferProperties();

    @Generated
    @CVariable()
    public static native CFStringRef kVTMultiPassStorageCreationOption_DoNotDelete();

    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_CodecType();

    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_EncoderID();

    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_CodecName();

    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_EncoderName();

    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_DisplayName();

    @Generated
    @CFunction
    public static native int VTCompressionSessionEncodeFrameWithOutputHandler(VTCompressionSessionRef session,
            CVBufferRef imageBuffer, @ByValue CMTime presentationTimeStamp, @ByValue CMTime duration,
            CFDictionaryRef frameProperties, IntPtr infoFlagsOut,
            @ObjCBlock(name = "call_VTCompressionSessionEncodeFrameWithOutputHandler") Block_VTCompressionSessionEncodeFrameWithOutputHandler outputHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_VTCompressionSessionEncodeFrameWithOutputHandler {
        @Generated
        void call_VTCompressionSessionEncodeFrameWithOutputHandler(int arg0, int arg1, CMSampleBufferRef arg2);
    }

    @Generated
    @CFunction
    public static native int VTDecompressionSessionDecodeFrameWithOutputHandler(VTDecompressionSessionRef session,
            CMSampleBufferRef sampleBuffer, int decodeFlags, IntPtr infoFlagsOut,
            @ObjCBlock(name = "call_VTDecompressionSessionDecodeFrameWithOutputHandler") Block_VTDecompressionSessionDecodeFrameWithOutputHandler outputHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_VTDecompressionSessionDecodeFrameWithOutputHandler {
        @Generated
        void call_VTDecompressionSessionDecodeFrameWithOutputHandler(int arg0, int arg1, CVBufferRef arg2,
                @ByValue CMTime arg3, @ByValue CMTime arg4);
    }

    @Generated
    @CFunction
    public static native int VTCreateCGImageFromCVPixelBuffer(CVBufferRef pixelBuffer, CFDictionaryRef options,
            Ptr<CGImageRef> imageOut);
}
