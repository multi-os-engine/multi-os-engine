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
    /**
     * __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_UseGammaValue = 0x00000000;
    /**
     * __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_UseGammaValue_half_precision = 0x00000001;
    /**
     * gamma = 5/9. (Gamma 1/1.8) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_5_over_9_half_precision = 0x00000002;
    /**
     * gamma = 9/5. (Gamma 1.8) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_9_over_5_half_precision = 0x00000003;
    /**
     * gamma = 5/11. (Gamma 1/2.2) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_5_over_11_half_precision = 0x00000004;
    /**
     * gamma = 11/5. (Gamma 2.2) On exit, gamma = 5/11. __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_11_over_5_half_precision = 0x00000005;
    /**
     * gamma = sRGB standard 2.2. (like 2.2 but offset a bit and with a linear segment:
     * x<0.03928?x/12.92:pow((x+0.055)/1.055,2.4) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_sRGB_forward_half_precision = 0x00000006;
    /**
     * gamma = sRGB standard 1/2.2. (like 2.2 but offset a bit and with a linear segment:
     * x<0.00304?12.92*x:1.055pow(x,1/2.4)-0.055) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_sRGB_reverse_half_precision = 0x00000007;
    /**
     * gamma = 11/9 (Gamma (11/5)/(9/5)) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_11_over_9_half_precision = 0x00000008;
    /**
     * gamma = 9/11 (Gamma (9/5)/(11/5)) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_9_over_11_half_precision = 0x00000009;
    /**
     * gamma = ITU-R BT.709 standard (like sRGB above but without the 1.125 viewing gamma for computer graphics:
     * x<0.081?x/4.5:pow((x+0.099)/1.099, 1/0.45) ) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_BT709_forward_half_precision = 0x0000000A;
    /**
     * gamma = ITU-R BT.709 standard *reverse* (like sRGB 1/2.2 above but without the 1.125 viewing gamma for computer
     * graphics: x<0.018?4.5*x:1.099*pow(x,0.45)-0.099) __OSX_AVAILABLE_STARTING( __MAC_10_4, __IPHONE_5_0 )
     */
    @Generated public static final int kvImageGamma_BT709_reverse_half_precision = 0x0000000B;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
    @Generated public static final int kvImageConvert_DitherNone = 0x00000000;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
    @Generated public static final int kvImageConvert_DitherOrdered = 0x00000001;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
    @Generated public static final int kvImageConvert_DitherOrderedReproducible = 0x00000002;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
    @Generated public static final int kvImageConvert_DitherFloydSteinberg = 0x00000003;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
    @Generated public static final int kvImageConvert_DitherAtkinson = 0x00000004;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
    @Generated public static final int kvImageConvert_OrderedGaussianBlue = 0x00000000;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
    @Generated public static final int kvImageConvert_OrderedUniformBlue = 0x10000000;
    /**
     * __OSX_AVAILABLE_STARTING(__MAC_10_9, __IPHONE_7_0)
     */
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
    /**
     * Operate on red, green and blue channels only. Alpha is copied from source
     * to destination. For Interleaved formats only.
     */
    @Generated public static final int kvImageLeaveAlphaUnchanged = 0x00000001;
    /**
     * Copy edge pixels. Convolution Only.
     */
    @Generated public static final int kvImageCopyInPlace = 0x00000002;
    /**
     * Use the background color for missing pixels.
     */
    @Generated public static final int kvImageBackgroundColorFill = 0x00000004;
    /**
     * Use the nearest pixel for missing pixels.
     */
    @Generated public static final int kvImageEdgeExtend = 0x00000008;
    /**
     * Pass to turn off internal tiling and disable internal multithreading. Use this if
     * you want to do your own tiling, or to use the Min/Max filters in place.
     */
    @Generated public static final int kvImageDoNotTile = 0x00000010;
    /**
     * Use a higher quality, slower resampling filter for Geometry operations
     * (shear, scale, rotate, affine transform, etc.)
     */
    @Generated public static final int kvImageHighQualityResampling = 0x00000020;
    /**
     * Use only the part of the kernel that overlaps the image. For integer kernels,
     * real_divisor = divisor * (sum of used kernel elements) / (sum of kernel elements).
     * This should preserve image brightness at the edges. Convolution only.
     */
    @Generated public static final int kvImageTruncateKernel = 0x00000040;
    /**
     * The function will return the number of bytes required for the temp buffer.
     * If this value is negative, it is an error, per standard usage.
     */
    @Generated public static final int kvImageGetTempBufferSize = 0x00000080;
    /**
     * Some functions such as vImageConverter_CreateWithCGImageFormat have so many possible error conditions
     * that developers may need more help than a simple error code to diagnose problems. When this
     * flag is set and an error is encountered, an informative error message will be logged to the Apple
     * System Logger (ASL). The output should be visible in Console.app.
     */
    @Generated public static final int kvImagePrintDiagnosticsToConsole = 0x00000100;
    /**
     * Pass this flag to prevent vImage from allocating additional storage.
     */
    @Generated public static final int kvImageNoAllocate = 0x00000200;
    /**
     * Use methods that are HDR-aware, capable of providing correct results for input images with pixel values
     * outside the otherwise limited (typically [-2,2]) range. This may be slower.
     */
    @Generated public static final int kvImageHDRContent = 0x00000400;
    /**
     * Pass to disable clamping is some conversions to floating point formats. Use this if the input data
     * may describe values outside [0,1] which should be preserved..
     */
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
    /**
     * Should never see this. File a bug!
     */
    @Generated public static final int kvImageInternalError = 0xFFFFAAF0;
    @Generated public static final int kvImageInvalidRowBytes = 0xFFFFAAEF;
    @Generated public static final int kvImageInvalidImageFormat = 0xFFFFAAEE;
    @Generated public static final int kvImageColorSyncIsAbsent = 0xFFFFAAED;
    @Generated public static final int kvImageOutOfPlaceOperationRequired = 0xFFFFAAEC;
    @Generated public static final int kvImageInvalidImageObject = 0xFFFFAAEB;
    @Generated public static final int kvImageInvalidCVImageFormat = 0xFFFFAAEA;
    @Generated public static final int kvImageUnsupportedConversion = 0xFFFFAAE9;
    @Generated public static final int kvImageCoreVideoIsAbsent = 0xFFFFAAE8;
    /**
     * No matrix required for this format. NULL will be returned. Attempts to set this matrix are ignored.
     */
    @Generated public static final int kvImageMatrixType_None = 0x00000000;
    /**
     * A vImage_ARGBToYpCbCrMatrix
     */
    @Generated public static final int kvImageMatrixType_ARGBToYpCbCrMatrix = 0x00000001;
    @Generated public static final int kvImageBufferTypeCode_EndOfList = 0x00000000;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel1 = 0x00000001;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel2 = 0x00000002;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel3 = 0x00000003;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel4 = 0x00000004;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel5 = 0x00000005;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel6 = 0x00000006;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel7 = 0x00000007;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel8 = 0x00000008;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel9 = 0x00000009;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel10 = 0x0000000A;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel11 = 0x0000000B;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel12 = 0x0000000C;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel13 = 0x0000000D;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel14 = 0x0000000E;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel15 = 0x0000000F;
    /**
     * planar formats -- each buffer contains a single color channel, arising from an image described by a colorspace
     */
    @Generated public static final int kvImageBufferTypeCode_ColorSpaceChannel16 = 0x00000010;
    /**
     * Coverage component
     */
    @Generated public static final int kvImageBufferTypeCode_Alpha = 0x00000011;
    /**
     * indexed color spaces
     */
    @Generated public static final int kvImageBufferTypeCode_Indexed = 0x00000012;
    /**
     * A YCbCr packed buffer formatted according to types in CVPixelBuffer.h. May be accompanied by an alpha channel
     */
    @Generated public static final int kvImageBufferTypeCode_CVPixelBuffer_YCbCr = 0x00000013;
    /**
     * A Luminance (Y) plane
     */
    @Generated public static final int kvImageBufferTypeCode_Luminance = 0x00000014;
    /**
     * A two-channel chroma (CbCr) plane
     */
    @Generated public static final int kvImageBufferTypeCode_Chroma = 0x00000015;
    /**
     * A blue chroma (Cb) plane
     */
    @Generated public static final int kvImageBufferTypeCode_Cb = 0x00000016;
    /**
     * A red chroma (Cr) plane
     */
    @Generated public static final int kvImageBufferTypeCode_Cr = 0x00000017;
    /**
     * always a singleton -- appearing as { kvImageBufferTypeCode_CGFormat, 0}
     */
    @Generated public static final int kvImageBufferTypeCode_CGFormat = 0x00000018;
    /**
     * always a singleton -- appearing as { kvImageBufferTypeCode_Chunky, 0}
     */
    @Generated public static final int kvImageBufferTypeCode_Chunky = 0x00000019;
    /**
     * must appear after last unique code
     */
    @Generated public static final int kvImageBufferTypeCode_UniqueFormatCount = 0x0000001A;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_Monochrome = 0x00000001;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_RGB_Red = 0x00000001;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_RGB_Green = 0x00000002;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_RGB_Blue = 0x00000003;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_CMYK_Cyan = 0x00000001;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_CMYK_Magenta = 0x00000002;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_CMYK_Yellow = 0x00000003;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_CMYK_Black = 0x00000004;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_XYZ_X = 0x00000001;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_XYZ_Y = 0x00000002;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_XYZ_Z = 0x00000003;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_LAB_L = 0x00000001;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_LAB_A = 0x00000002;
    /**
     * Convenience codes for better code readability
     */
    @Generated public static final int kvImageBufferTypeCode_LAB_B = 0x00000003;
    @Generated public static final int kFFTDirection_Forward = 0x00000001;
    @Generated public static final int kFFTDirection_Inverse = 0xFFFFFFFF;
    @Generated public static final int kFFTRadix2 = 0x00000000;
    @Generated public static final int kFFTRadix3 = 0x00000001;
    @Generated public static final int kFFTRadix5 = 0x00000002;

    @Generated
    private Enums() {
    }

    @Generated public static final int _SparseMethodCG = 0x00000000;
    @Generated public static final int _SparseMethodGMRES = 0x00000001;
    @Generated public static final int _SparseMethodLSMR = 0x00000002;
}
