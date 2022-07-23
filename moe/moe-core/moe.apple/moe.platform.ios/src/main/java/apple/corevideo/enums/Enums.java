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

package apple.corevideo.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    /**
     * 1 bit indexed
     */
    @Generated public static final int kCVPixelFormatType_1Monochrome = 0x00000001;
    /**
     * 2 bit indexed
     */
    @Generated public static final int kCVPixelFormatType_2Indexed = 0x00000002;
    /**
     * 4 bit indexed
     */
    @Generated public static final int kCVPixelFormatType_4Indexed = 0x00000004;
    /**
     * 8 bit indexed
     */
    @Generated public static final int kCVPixelFormatType_8Indexed = 0x00000008;
    /**
     * 1 bit indexed gray, white is zero
     */
    @Generated public static final int kCVPixelFormatType_1IndexedGray_WhiteIsZero = 0x00000021;
    /**
     * 2 bit indexed gray, white is zero
     */
    @Generated public static final int kCVPixelFormatType_2IndexedGray_WhiteIsZero = 0x00000022;
    /**
     * 4 bit indexed gray, white is zero
     */
    @Generated public static final int kCVPixelFormatType_4IndexedGray_WhiteIsZero = 0x00000024;
    /**
     * 8 bit indexed gray, white is zero
     */
    @Generated public static final int kCVPixelFormatType_8IndexedGray_WhiteIsZero = 0x00000028;
    /**
     * 16 bit BE RGB 555
     */
    @Generated public static final int kCVPixelFormatType_16BE555 = 0x00000010;
    /**
     * 16 bit LE RGB 555
     */
    @Generated public static final int kCVPixelFormatType_16LE555 = 0x4C353535;
    /**
     * 16 bit LE RGB 5551
     */
    @Generated public static final int kCVPixelFormatType_16LE5551 = 0x35353531;
    /**
     * 16 bit BE RGB 565
     */
    @Generated public static final int kCVPixelFormatType_16BE565 = 0x42353635;
    /**
     * 16 bit LE RGB 565
     */
    @Generated public static final int kCVPixelFormatType_16LE565 = 0x4C353635;
    /**
     * 24 bit RGB
     */
    @Generated public static final int kCVPixelFormatType_24RGB = 0x00000018;
    /**
     * 24 bit BGR
     */
    @Generated public static final int kCVPixelFormatType_24BGR = 0x32344247;
    /**
     * 32 bit ARGB
     */
    @Generated public static final int kCVPixelFormatType_32ARGB = 0x00000020;
    /**
     * 32 bit BGRA
     */
    @Generated public static final int kCVPixelFormatType_32BGRA = 0x42475241;
    /**
     * 32 bit ABGR
     */
    @Generated public static final int kCVPixelFormatType_32ABGR = 0x41424752;
    /**
     * 32 bit RGBA
     */
    @Generated public static final int kCVPixelFormatType_32RGBA = 0x52474241;
    /**
     * 64 bit ARGB, 16-bit big-endian samples
     */
    @Generated public static final int kCVPixelFormatType_64ARGB = 0x62363461;
    /**
     * 48 bit RGB, 16-bit big-endian samples
     */
    @Generated public static final int kCVPixelFormatType_48RGB = 0x62343872;
    /**
     * 32 bit AlphaGray, 16-bit big-endian samples, black is zero
     */
    @Generated public static final int kCVPixelFormatType_32AlphaGray = 0x62333261;
    /**
     * 16 bit Grayscale, 16-bit big-endian samples, black is zero
     */
    @Generated public static final int kCVPixelFormatType_16Gray = 0x62313667;
    /**
     * 30 bit RGB, 10-bit big-endian samples, 2 unused padding bits (at least significant end).
     */
    @Generated public static final int kCVPixelFormatType_30RGB = 0x5231306B;
    /**
     * Component Y'CbCr 8-bit 4:2:2, ordered Cb Y'0 Cr Y'1
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr8 = 0x32767579;
    /**
     * Component Y'CbCrA 8-bit 4:4:4:4, ordered Cb Y' Cr A
     */
    @Generated public static final int kCVPixelFormatType_4444YpCbCrA8 = 0x76343038;
    /**
     * Component Y'CbCrA 8-bit 4:4:4:4, rendering format. full range alpha, zero biased YUV, ordered A Y' Cb Cr
     */
    @Generated public static final int kCVPixelFormatType_4444YpCbCrA8R = 0x72343038;
    /**
     * Component Y'CbCrA 8-bit 4:4:4:4, ordered A Y' Cb Cr, full range alpha, video range Y'CbCr.
     */
    @Generated public static final int kCVPixelFormatType_4444AYpCbCr8 = 0x79343038;
    /**
     * Component Y'CbCrA 16-bit 4:4:4:4, ordered A Y' Cb Cr, full range alpha, video range Y'CbCr, 16-bit little-endian
     * samples.
     */
    @Generated public static final int kCVPixelFormatType_4444AYpCbCr16 = 0x79343136;
    /**
     * Component Y'CbCr 8-bit 4:4:4
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr8 = 0x76333038;
    /**
     * Component Y'CbCr 10,12,14,16-bit 4:2:2
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr16 = 0x76323136;
    /**
     * Component Y'CbCr 10-bit 4:2:2
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr10 = 0x76323130;
    /**
     * Component Y'CbCr 10-bit 4:4:4
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr10 = 0x76343130;
    /**
     * Planar Component Y'CbCr 8-bit 4:2:0. baseAddr points to a big-endian CVPlanarPixelBufferInfo_YCbCrPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_420YpCbCr8Planar = 0x79343230;
    /**
     * Planar Component Y'CbCr 8-bit 4:2:0, full range. baseAddr points to a big-endian
     * CVPlanarPixelBufferInfo_YCbCrPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_420YpCbCr8PlanarFullRange = 0x66343230;
    /**
     * First plane: Video-range Component Y'CbCr 8-bit 4:2:2, ordered Cb Y'0 Cr Y'1; second plane: alpha 8-bit 0-255
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr_4A_8BiPlanar = 0x61327679;
    /**
     * Bi-Planar Component Y'CbCr 8-bit 4:2:0, video-range (luma=[16,235] chroma=[16,240]). baseAddr points to a
     * big-endian CVPlanarPixelBufferInfo_YCbCrBiPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange = 0x34323076;
    /**
     * Bi-Planar Component Y'CbCr 8-bit 4:2:0, full-range (luma=[0,255] chroma=[1,255]). baseAddr points to a big-endian
     * CVPlanarPixelBufferInfo_YCbCrBiPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_420YpCbCr8BiPlanarFullRange = 0x34323066;
    /**
     * Component Y'CbCr 8-bit 4:2:2, ordered Y'0 Cb Y'1 Cr
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr8_yuvs = 0x79757673;
    /**
     * Component Y'CbCr 8-bit 4:2:2, full range, ordered Y'0 Cb Y'1 Cr
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr8FullRange = 0x79757666;
    /**
     * 8 bit one component, black is zero
     */
    @Generated public static final int kCVPixelFormatType_OneComponent8 = 0x4C303038;
    /**
     * 8 bit two component, black is zero
     */
    @Generated public static final int kCVPixelFormatType_TwoComponent8 = 0x32433038;
    /**
     * little-endian RGB101010, 2 MSB are zero, wide-gamut (384-895)
     */
    @Generated public static final int kCVPixelFormatType_30RGBLEPackedWideGamut = 0x77333072;
    /**
     * 16 bit one component IEEE half-precision float, 16-bit little-endian samples
     */
    @Generated public static final int kCVPixelFormatType_OneComponent16Half = 0x4C303068;
    /**
     * 32 bit one component IEEE float, 32-bit little-endian samples
     */
    @Generated public static final int kCVPixelFormatType_OneComponent32Float = 0x4C303066;
    /**
     * 16 bit two component IEEE half-precision float, 16-bit little-endian samples
     */
    @Generated public static final int kCVPixelFormatType_TwoComponent16Half = 0x32433068;
    /**
     * 32 bit two component IEEE float, 32-bit little-endian samples
     */
    @Generated public static final int kCVPixelFormatType_TwoComponent32Float = 0x32433066;
    /**
     * 64 bit RGBA IEEE half-precision float, 16-bit little-endian samples
     */
    @Generated public static final int kCVPixelFormatType_64RGBAHalf = 0x52476841;
    /**
     * 128 bit RGBA IEEE float, 32-bit little-endian samples
     */
    @Generated public static final int kCVPixelFormatType_128RGBAFloat = 0x52476641;
    /**
     * Bayer 14-bit Little-Endian, packed in 16-bits, ordered G R G R... alternating with B G B G...
     */
    @Generated public static final int kCVPixelFormatType_14Bayer_GRBG = 0x67726234;
    /**
     * Bayer 14-bit Little-Endian, packed in 16-bits, ordered R G R G... alternating with G B G B...
     */
    @Generated public static final int kCVPixelFormatType_14Bayer_RGGB = 0x72676734;
    /**
     * Bayer 14-bit Little-Endian, packed in 16-bits, ordered B G B G... alternating with G R G R...
     */
    @Generated public static final int kCVPixelFormatType_14Bayer_BGGR = 0x62676734;
    /**
     * Bayer 14-bit Little-Endian, packed in 16-bits, ordered G B G B... alternating with R G R G...
     */
    @Generated public static final int kCVPixelFormatType_14Bayer_GBRG = 0x67627234;
    @Generated public static final int kCVReturnSuccess = 0x00000000;
    @Generated public static final int kCVReturnFirst = 0xFFFFE5FC;
    @Generated public static final int kCVReturnError = 0xFFFFE5FC;
    @Generated public static final int kCVReturnInvalidArgument = 0xFFFFE5FB;
    @Generated public static final int kCVReturnAllocationFailed = 0xFFFFE5FA;
    @Generated public static final int kCVReturnUnsupported = 0xFFFFE5F9;
    /**
     * DisplayLink related errors
     */
    @Generated public static final int kCVReturnInvalidDisplay = 0xFFFFE5F2;
    /**
     * DisplayLink related errors
     */
    @Generated public static final int kCVReturnDisplayLinkAlreadyRunning = 0xFFFFE5F1;
    /**
     * DisplayLink related errors
     */
    @Generated public static final int kCVReturnDisplayLinkNotRunning = 0xFFFFE5F0;
    /**
     * DisplayLink related errors
     */
    @Generated public static final int kCVReturnDisplayLinkCallbacksNotSet = 0xFFFFE5EF;
    /**
     * Buffer related errors
     */
    @Generated public static final int kCVReturnInvalidPixelFormat = 0xFFFFE5E8;
    /**
     * Buffer related errors
     */
    @Generated public static final int kCVReturnInvalidSize = 0xFFFFE5E7;
    /**
     * Buffer related errors
     */
    @Generated public static final int kCVReturnInvalidPixelBufferAttributes = 0xFFFFE5E6;
    /**
     * Buffer related errors
     */
    @Generated public static final int kCVReturnPixelBufferNotOpenGLCompatible = 0xFFFFE5E5;
    /**
     * Buffer related errors
     */
    @Generated public static final int kCVReturnPixelBufferNotMetalCompatible = 0xFFFFE5E4;
    /**
     * Buffer Pool related errors
     */
    @Generated public static final int kCVReturnWouldExceedAllocationThreshold = 0xFFFFE5DF;
    /**
     * Buffer Pool related errors
     */
    @Generated public static final int kCVReturnPoolAllocationFailed = 0xFFFFE5DE;
    /**
     * Buffer Pool related errors
     */
    @Generated public static final int kCVReturnInvalidPoolAttributes = 0xFFFFE5DD;
    /**
     * Buffer Pool related errors
     */
    @Generated public static final int kCVReturnRetry = 0xFFFFE5DC;
    /**
     * Buffer Pool related errors
     */
    @Generated public static final int kCVReturnLast = 0xFFFFE5D5;

    @Generated
    private Enums() {
    }

    /**
     * little-endian ARGB2101010 full-range ARGB
     */
    @Generated public static final int kCVPixelFormatType_ARGB2101010LEPacked = 0x6C313072;
    /**
     * IEEE754-2008 binary16 (half float), describing the normalized shift when comparing two images. Units are
     * 1/meters: ( pixelShift / (pixelFocalLength * baselineInMeters) )
     */
    @Generated public static final int kCVPixelFormatType_DisparityFloat16 = 0x68646973;
    /**
     * IEEE754-2008 binary32 float, describing the normalized shift when comparing two images. Units are 1/meters: (
     * pixelShift / (pixelFocalLength * baselineInMeters) )
     */
    @Generated public static final int kCVPixelFormatType_DisparityFloat32 = 0x66646973;
    /**
     * IEEE754-2008 binary16 (half float), describing the depth (distance to an object) in meters
     */
    @Generated public static final int kCVPixelFormatType_DepthFloat16 = 0x68646570;
    /**
     * IEEE754-2008 binary32 float, describing the depth (distance to an object) in meters
     */
    @Generated public static final int kCVPixelFormatType_DepthFloat32 = 0x66646570;
    /**
     * 2 plane YCbCr10 4:2:0, each 10 bits in the MSBs of 16bits, video-range (luma=[64,940] chroma=[64,960])
     */
    @Generated public static final int kCVPixelFormatType_420YpCbCr10BiPlanarVideoRange = 0x78343230;
    /**
     * 2 plane YCbCr10 4:2:2, each 10 bits in the MSBs of 16bits, video-range (luma=[64,940] chroma=[64,960])
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr10BiPlanarVideoRange = 0x78343232;
    /**
     * 2 plane YCbCr10 4:4:4, each 10 bits in the MSBs of 16bits, video-range (luma=[64,940] chroma=[64,960])
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr10BiPlanarVideoRange = 0x78343434;
    /**
     * 2 plane YCbCr10 4:2:0, each 10 bits in the MSBs of 16bits, full-range (Y range 0-1023)
     */
    @Generated public static final int kCVPixelFormatType_420YpCbCr10BiPlanarFullRange = 0x78663230;
    /**
     * 2 plane YCbCr10 4:2:2, each 10 bits in the MSBs of 16bits, full-range (Y range 0-1023)
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr10BiPlanarFullRange = 0x78663232;
    /**
     * 2 plane YCbCr10 4:4:4, each 10 bits in the MSBs of 16bits, full-range (Y range 0-1023)
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr10BiPlanarFullRange = 0x78663434;
    /**
     * first and second planes as per 420YpCbCr8BiPlanarVideoRange (420v), alpha 8 bits in third plane full-range. No
     * CVPlanarPixelBufferInfo struct.
     */
    @Generated public static final int kCVPixelFormatType_420YpCbCr8VideoRange_8A_TriPlanar = 0x76306138;
    /**
     * Bi-Planar Component Y'CbCr 8-bit 4:2:2, video-range (luma=[16,235] chroma=[16,240]). baseAddr points to a
     * big-endian CVPlanarPixelBufferInfo_YCbCrBiPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr8BiPlanarVideoRange = 0x34323276;
    /**
     * Bi-Planar Component Y'CbCr 8-bit 4:2:2, full-range (luma=[0,255] chroma=[1,255]). baseAddr points to a big-endian
     * CVPlanarPixelBufferInfo_YCbCrBiPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr8BiPlanarFullRange = 0x34323266;
    /**
     * Bi-Planar Component Y'CbCr 8-bit 4:4:4, video-range (luma=[16,235] chroma=[16,240]). baseAddr points to a
     * big-endian CVPlanarPixelBufferInfo_YCbCrBiPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr8BiPlanarVideoRange = 0x34343476;
    /**
     * Bi-Planar Component Y'CbCr 8-bit 4:4:4, full-range (luma=[0,255] chroma=[1,255]). baseAddr points to a big-endian
     * CVPlanarPixelBufferInfo_YCbCrBiPlanar struct
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr8BiPlanarFullRange = 0x34343466;
    /**
     * 10 bit little-endian one component, stored as 10 MSBs of 16 bits, black is zero
     */
    @Generated public static final int kCVPixelFormatType_OneComponent10 = 0x4C303130;
    /**
     * 12 bit little-endian one component, stored as 12 MSBs of 16 bits, black is zero
     */
    @Generated public static final int kCVPixelFormatType_OneComponent12 = 0x4C303132;
    /**
     * 16 bit little-endian one component, black is zero
     */
    @Generated public static final int kCVPixelFormatType_OneComponent16 = 0x4C303136;
    /**
     * 16 bit little-endian two component, black is zero
     */
    @Generated public static final int kCVPixelFormatType_TwoComponent16 = 0x32433136;
    /**
     * Single plane Bayer 16-bit little-endian sensor element ("sensel") samples from full-size decoding of ProRes RAW
     * images; Bayer pattern (sensel ordering) and other raw conversion information is described via buffer attachments
     */
    @Generated public static final int kCVPixelFormatType_16VersatileBayer = 0x62703136;
    /**
     * Single plane 64-bit RGBA (16-bit little-endian samples) from downscaled decoding of ProRes RAW images;
     * components--which may not be co-sited with one another--are sensel values and require raw conversion, information
     * for which is described via buffer attachments
     */
    @Generated public static final int kCVPixelFormatType_64RGBA_DownscaledProResRAW = 0x62703634;
    @Generated public static final int kCVVersatileBayer_BayerPattern_RGGB = 0x00000000;
    @Generated public static final int kCVVersatileBayer_BayerPattern_GRBG = 0x00000001;
    @Generated public static final int kCVVersatileBayer_BayerPattern_GBRG = 0x00000002;
    @Generated public static final int kCVVersatileBayer_BayerPattern_BGGR = 0x00000003;
    /**
     * 64 bit RGBA, 16-bit little-endian full-range (0-65535) samples
     */
    @Generated public static final int kCVPixelFormatType_64RGBALE = 0x6C363472;
    /**
     * little-endian ARGB10101010, each 10 bits in the MSBs of 16bits, wide-gamut (384-895, including alpha)
     */
    @Generated public static final int kCVPixelFormatType_40ARGBLEWideGamut = 0x77343061;
    /**
     * little-endian ARGB10101010, each 10 bits in the MSBs of 16bits, wide-gamut (384-895, including alpha). Alpha
     * premultiplied
     */
    @Generated public static final int kCVPixelFormatType_40ARGBLEWideGamutPremultiplied = 0x7734306D;
    /**
     * 2 plane YCbCr16 4:2:2, video-range (luma=[4096,60160] chroma=[4096,61440])
     */
    @Generated public static final int kCVPixelFormatType_422YpCbCr16BiPlanarVideoRange = 0x73763232;
    /**
     * 2 plane YCbCr16 4:4:4, video-range (luma=[4096,60160] chroma=[4096,61440])
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr16BiPlanarVideoRange = 0x73763434;
    /**
     * 3 plane video-range YCbCr16 4:4:4 with 16-bit full-range alpha (luma=[4096,60160] chroma=[4096,61440]
     * alpha=[0,65535]). No CVPlanarPixelBufferInfo struct.
     */
    @Generated public static final int kCVPixelFormatType_444YpCbCr16VideoRange_16A_TriPlanar = 0x73346173;
    /**
     * Lossy-compressed form of kCVPixelFormatType_32BGRA. No CVPlanarPixelBufferInfo struct.
     */
    @Generated public static final int kCVPixelFormatType_Lossy_32BGRA = 0x2D424741;
    /**
     * Lossy-compressed form of kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange. No CVPlanarPixelBufferInfo struct.
     */
    @Generated public static final int kCVPixelFormatType_Lossy_420YpCbCr8BiPlanarVideoRange = 0x2D387630;
    /**
     * Lossy-compressed form of kCVPixelFormatType_420YpCbCr8BiPlanarFullRange. No CVPlanarPixelBufferInfo struct.
     */
    @Generated public static final int kCVPixelFormatType_Lossy_420YpCbCr8BiPlanarFullRange = 0x2D386630;
    /**
     * Lossy-compressed form of kCVPixelFormatType_420YpCbCr10BiPlanarVideoRange. No CVPlanarPixelBufferInfo struct.
     * Format is compressed-packed with no padding bits between pixels.
     */
    @Generated public static final int kCVPixelFormatType_Lossy_420YpCbCr10PackedBiPlanarVideoRange = 0x2D787630;
    /**
     * Lossy-compressed form of kCVPixelFormatType_422YpCbCr10BiPlanarVideoRange. No CVPlanarPixelBufferInfo struct.
     * Format is compressed-packed with no padding bits between pixels.
     */
    @Generated public static final int kCVPixelFormatType_Lossy_422YpCbCr10PackedBiPlanarVideoRange = 0x2D787632;
    /**
     * Lossless-compressed form of kCVPixelFormatType_32BGRA.
     */
    @Generated public static final int kCVPixelFormatType_Lossless_32BGRA = 0x26424741;
    /**
     * Lossless-compressed form of kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange. No CVPlanarPixelBufferInfo struct.
     */
    @Generated public static final int kCVPixelFormatType_Lossless_420YpCbCr8BiPlanarVideoRange = 0x26387630;
    /**
     * Lossless-compressed form of kCVPixelFormatType_420YpCbCr8BiPlanarFullRange. No CVPlanarPixelBufferInfo struct.
     */
    @Generated public static final int kCVPixelFormatType_Lossless_420YpCbCr8BiPlanarFullRange = 0x26386630;
    /**
     * Lossless-compressed-packed form of kCVPixelFormatType_420YpCbCr10BiPlanarVideoRange. No CVPlanarPixelBufferInfo
     * struct. Format is compressed-packed with no padding bits between pixels.
     */
    @Generated public static final int kCVPixelFormatType_Lossless_420YpCbCr10PackedBiPlanarVideoRange = 0x26787630;
    /**
     * Lossless-compressed form of kCVPixelFormatType_422YpCbCr10BiPlanarVideoRange. No CVPlanarPixelBufferInfo struct.
     * Format is compressed-packed with no padding bits between pixels.
     */
    @Generated public static final int kCVPixelFormatType_Lossless_422YpCbCr10PackedBiPlanarVideoRange = 0x26787632;
}
