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

package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    @Generated public static final int kvImage_PNG_FILTER_VALUE_NONE = 0x00000000;
    @Generated public static final int kvImage_PNG_FILTER_VALUE_SUB = 0x00000001;
    @Generated public static final int kvImage_PNG_FILTER_VALUE_UP = 0x00000002;
    @Generated public static final int kvImage_PNG_FILTER_VALUE_AVG = 0x00000003;
    @Generated public static final int kvImage_PNG_FILTER_VALUE_PAETH = 0x00000004;
    @Generated public static final int kvImageGamma_UseGammaValue = 0x00000000;
    @Generated public static final int kvImageGamma_UseGammaValue_half_precision = 0x00000001;
    @Generated public static final int kvImageGamma_5_over_9_half_precision = 0x00000002;
    @Generated public static final int kvImageGamma_9_over_5_half_precision = 0x00000003;
    @Generated public static final int kvImageGamma_5_over_11_half_precision = 0x00000004;
    @Generated public static final int kvImageGamma_11_over_5_half_precision = 0x00000005;
    @Generated public static final int kvImageGamma_sRGB_forward_half_precision = 0x00000006;
    @Generated public static final int kvImageGamma_sRGB_reverse_half_precision = 0x00000007;
    @Generated public static final int kvImageGamma_11_over_9_half_precision = 0x00000008;
    @Generated public static final int kvImageGamma_9_over_11_half_precision = 0x00000009;
    @Generated public static final int kvImageGamma_BT709_forward_half_precision = 0x0000000A;
    @Generated public static final int kvImageGamma_BT709_reverse_half_precision = 0x0000000B;
    @Generated public static final int kvImageConvert_DitherNone = 0x00000000;
    @Generated public static final int kvImageConvert_DitherOrdered = 0x00000001;
    @Generated public static final int kvImageConvert_DitherOrderedReproducible = 0x00000002;
    @Generated public static final int kvImageConvert_DitherFloydSteinberg = 0x00000003;
    @Generated public static final int kvImageConvert_DitherAtkinson = 0x00000004;
    @Generated public static final int kvImageConvert_OrderedGaussianBlue = 0x00000000;
    @Generated public static final int kvImageConvert_OrderedUniformBlue = 0x10000000;
    @Generated public static final int kvImageConvert_OrderedNoiseShapeMask = 0xF0000000;
    @Generated public static final int vDSP_HALF_WINDOW = 0x00000001;
    @Generated public static final int vDSP_HANN_DENORM = 0x00000000;
    @Generated public static final int vDSP_HANN_NORM = 0x00000002;
    @Generated public static final int kRotate0DegreesClockwise = 0x00000000;
    @Generated public static final int kRotate90DegreesClockwise = 0x00000003;
    @Generated public static final int kRotate180DegreesClockwise = 0x00000002;
    @Generated public static final int kRotate270DegreesClockwise = 0x00000001;
    @Generated public static final int kRotate0DegreesCounterClockwise = 0x00000000;
    @Generated public static final int kRotate90DegreesCounterClockwise = 0x00000001;
    @Generated public static final int kRotate180DegreesCounterClockwise = 0x00000002;
    @Generated public static final int kRotate270DegreesCounterClockwise = 0x00000003;
    @Generated public static final int kvImageCVImageFormat_NoError = 0x00000000;
    @Generated public static final int kvImageCVImageFormat_ConversionMatrix = 0xFFFFABA0;
    @Generated public static final int kvImageCVImageFormat_ChromaSiting = 0xFFFFAB9F;
    @Generated public static final int kvImageCVImageFormat_ColorSpace = 0xFFFFAB9E;
    @Generated public static final int kvImageCVImageFormat_VideoChannelDescription = 0xFFFFAB9D;
    @Generated public static final int kvImageCVImageFormat_AlphaIsOneHint = 0xFFFFAB9C;
    @Generated public static final int FFT_RADIX2 = 0x00000000;
    @Generated public static final int FFT_RADIX3 = 0x00000001;
    @Generated public static final int FFT_RADIX5 = 0x00000002;
    @Generated public static final int FFT_FORWARD = 0x00000001;
    @Generated public static final int FFT_INVERSE = 0xFFFFFFFF;
    @Generated public static final int kvImageNoFlags = 0x00000000;
    @Generated public static final int kvImageLeaveAlphaUnchanged = 0x00000001;
    @Generated public static final int kvImageCopyInPlace = 0x00000002;
    @Generated public static final int kvImageBackgroundColorFill = 0x00000004;
    @Generated public static final int kvImageEdgeExtend = 0x00000008;
    @Generated public static final int kvImageDoNotTile = 0x00000010;
    @Generated public static final int kvImageHighQualityResampling = 0x00000020;
    @Generated public static final int kvImageTruncateKernel = 0x00000040;
    @Generated public static final int kvImageGetTempBufferSize = 0x00000080;
    @Generated public static final int kvImagePrintDiagnosticsToConsole = 0x00000100;
    @Generated public static final int kvImageNoAllocate = 0x00000200;
    @Generated public static final int kvImageHDRContent = 0x00000400;
    @Generated public static final int kvImageDoNotClamp = 0x00000800;
    @Generated public static final int kvImageNoError = 0x00000000;
    @Generated public static final int kvImageRoiLargerThanInputBuffer = 0xFFFFAAFA;
    @Generated public static final int kvImageInvalidKernelSize = 0xFFFFAAF9;
    @Generated public static final int kvImageInvalidEdgeStyle = 0xFFFFAAF8;
    @Generated public static final int kvImageInvalidOffset_X = 0xFFFFAAF7;
    @Generated public static final int kvImageInvalidOffset_Y = 0xFFFFAAF6;
    @Generated public static final int kvImageMemoryAllocationError = 0xFFFFAAF5;
    @Generated public static final int kvImageNullPointerArgument = 0xFFFFAAF4;
    @Generated public static final int kvImageInvalidParameter = 0xFFFFAAF3;
    @Generated public static final int kvImageBufferSizeMismatch = 0xFFFFAAF2;
    @Generated public static final int kvImageUnknownFlagsBit = 0xFFFFAAF1;
    @Generated public static final int kvImageInternalError = 0xFFFFAAF0;
    @Generated public static final int kvImageInvalidRowBytes = 0xFFFFAAEF;
    @Generated public static final int kvImageInvalidImageFormat = 0xFFFFAAEE;
    @Generated public static final int kvImageColorSyncIsAbsent = 0xFFFFAAED;
    @Generated public static final int kvImageOutOfPlaceOperationRequired = 0xFFFFAAEC;
    @Generated public static final int kvImageInvalidImageObject = 0xFFFFAAEB;
    @Generated public static final int kvImageInvalidCVImageFormat = 0xFFFFAAEA;
    @Generated public static final int kvImageUnsupportedConversion = 0xFFFFAAE9;
    @Generated public static final int kvImageCoreVideoIsAbsent = 0xFFFFAAE8;
    @Generated public static final int kvImageMatrixType_None = 0x00000000;
    @Generated public static final int kvImageMatrixType_ARGBToYpCbCrMatrix = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_EndOfList = 0x00000000;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel1 = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel2 = 0x00000002;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel3 = 0x00000003;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel4 = 0x00000004;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel5 = 0x00000005;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel6 = 0x00000006;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel7 = 0x00000007;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel8 = 0x00000008;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel9 = 0x00000009;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel10 = 0x0000000A;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel11 = 0x0000000B;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel12 = 0x0000000C;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel13 = 0x0000000D;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel14 = 0x0000000E;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel15 = 0x0000000F;
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel16 = 0x00000010;
    @Generated public static final int kvImageBufferTypeCode_Alpha = 0x00000011;
    @Generated public static final int kvImageBufferTypeCode_Indexed = 0x00000012;
    @Generated public static final int kvImageBufferTypeCode_CVPixelBuffer_YCbCr = 0x00000013;
    @Generated public static final int kvImageBufferTypeCode_Luminance = 0x00000014;
    @Generated public static final int kvImageBufferTypeCode_Chroma = 0x00000015;
    @Generated public static final int kvImageBufferTypeCode_Cb = 0x00000016;
    @Generated public static final int kvImageBufferTypeCode_Cr = 0x00000017;
    @Generated public static final int kvImageBufferTypeCode_CGFormat = 0x00000018;
    @Generated public static final int kvImageBufferTypeCode_Chunky = 0x00000019;
    @Generated public static final int kvImageBufferTypeCode_UniqueFormatCount = 0x0000001A;
    @Generated public static final int kvImageBufferTypeCode_Monochrome = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_RGB_Red = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_RGB_Green = 0x00000002;
    @Generated public static final int kvImageBufferTypeCode_RGB_Blue = 0x00000003;
    @Generated public static final int kvImageBufferTypeCode_CMYK_Cyan = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_CMYK_Magenta = 0x00000002;
    @Generated public static final int kvImageBufferTypeCode_CMYK_Yellow = 0x00000003;
    @Generated public static final int kvImageBufferTypeCode_CMYK_Black = 0x00000004;
    @Generated public static final int kvImageBufferTypeCode_XYZ_X = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_XYZ_Y = 0x00000002;
    @Generated public static final int kvImageBufferTypeCode_XYZ_Z = 0x00000003;
    @Generated public static final int kvImageBufferTypeCode_LAB_L = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_LAB_A = 0x00000002;
    @Generated public static final int kvImageBufferTypeCode_LAB_B = 0x00000003;
    @Generated public static final int kFFTDirection_Forward = 0x00000001;
    @Generated public static final int kFFTDirection_Inverse = 0xFFFFFFFF;
    @Generated public static final int kFFTRadix2 = 0x00000000;
    @Generated public static final int kFFTRadix3 = 0x00000001;
    @Generated public static final int kFFTRadix5 = 0x00000002;

    @Generated
    private Enums() {
    }
}
