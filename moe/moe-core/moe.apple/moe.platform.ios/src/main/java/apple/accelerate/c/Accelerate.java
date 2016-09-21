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

package apple.accelerate.c;

import apple.NSObject;
import apple.accelerate.opaque.FFTSetup;
import apple.accelerate.opaque.FFTSetupD;
import apple.accelerate.opaque.sparse_matrix_double;
import apple.accelerate.opaque.sparse_matrix_float;
import apple.accelerate.opaque.vDSP_DFT_Setup;
import apple.accelerate.opaque.vDSP_DFT_SetupD;
import apple.accelerate.opaque.vDSP_biquad_Setup;
import apple.accelerate.opaque.vDSP_biquad_SetupD;
import apple.accelerate.opaque.vDSP_biquadm_Setup;
import apple.accelerate.opaque.vDSP_biquadm_SetupD;
import apple.accelerate.opaque.vImageCVImageFormatRef;
import apple.accelerate.opaque.vImageConstCVImageFormatRef;
import apple.accelerate.opaque.vImageConverterRef;
import apple.accelerate.opaque.vImage_MultidimensionalTable;
import apple.accelerate.struct.BNNSConvolutionLayerParameters;
import apple.accelerate.struct.BNNSFilterParameters;
import apple.accelerate.struct.BNNSFullyConnectedLayerParameters;
import apple.accelerate.struct.BNNSImageStackDescriptor;
import apple.accelerate.struct.BNNSPoolingLayerParameters;
import apple.accelerate.struct.BNNSVectorDescriptor;
import apple.accelerate.struct.DSPComplex;
import apple.accelerate.struct.DSPDoubleComplex;
import apple.accelerate.struct.DSPDoubleSplitComplex;
import apple.accelerate.struct.DSPSplitComplex;
import apple.accelerate.struct.__CLPK_complex;
import apple.accelerate.struct.__CLPK_doublecomplex;
import apple.accelerate.struct.quadrature_integrate_function;
import apple.accelerate.struct.quadrature_integrate_options;
import apple.accelerate.struct.vDSP_int24;
import apple.accelerate.struct.vDSP_uint24;
import apple.accelerate.struct.vImageChannelDescription;
import apple.accelerate.struct.vImageRGBPrimaries;
import apple.accelerate.struct.vImageTransferFunction;
import apple.accelerate.struct.vImageWhitePoint;
import apple.accelerate.struct.vImage_ARGBToYpCbCr;
import apple.accelerate.struct.vImage_ARGBToYpCbCrMatrix;
import apple.accelerate.struct.vImage_AffineTransform;
import apple.accelerate.struct.vImage_AffineTransform_Double;
import apple.accelerate.struct.vImage_Buffer;
import apple.accelerate.struct.vImage_CGImageFormat;
import apple.accelerate.struct.vImage_YpCbCrPixelRange;
import apple.accelerate.struct.vImage_YpCbCrToARGB;
import apple.accelerate.struct.vImage_YpCbCrToARGBMatrix;
import apple.corefoundation.opaque.CFStringRef;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.struct.CGSize;
import apple.corevideo.opaque.CVBufferRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstBoolPtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstLongPtr;
import org.moe.natj.general.ptr.ConstNFloatPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstShortPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("Accelerate")
@Runtime(CRuntime.class)
public final class Accelerate {
    static {
        NatJ.register();
    }

    @Generated
    private Accelerate() {
    }

    @Generated
    @CFunction
    public static native FFTSetup vDSP_create_fftsetup(@NUInt long __Log2n, int __Radix);

    @Generated
    @CFunction
    public static native void vDSP_destroy_fftsetup(FFTSetup __setup);

    @Generated
    @CFunction
    public static native FFTSetupD vDSP_create_fftsetupD(@NUInt long __Log2n, int __Radix);

    @Generated
    @CFunction
    public static native void vDSP_destroy_fftsetupD(FFTSetupD __setup);

    @Generated
    @CFunction
    public static native vDSP_biquad_Setup vDSP_biquad_CreateSetup(ConstDoublePtr __Coefficients, @NUInt long __M);

    @Generated
    @CFunction
    public static native vDSP_biquad_SetupD vDSP_biquad_CreateSetupD(ConstDoublePtr __Coefficients, @NUInt long __M);

    @Generated
    @CFunction
    public static native void vDSP_biquad_DestroySetup(vDSP_biquad_Setup __setup);

    @Generated
    @CFunction
    public static native void vDSP_biquad_DestroySetupD(vDSP_biquad_SetupD __setup);

    @Generated
    @CFunction
    public static native vDSP_biquadm_Setup vDSP_biquadm_CreateSetup(ConstDoublePtr __coeffs, @NUInt long __M,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native vDSP_biquadm_SetupD vDSP_biquadm_CreateSetupD(ConstDoublePtr __coeffs, @NUInt long __M,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_DestroySetup(vDSP_biquadm_Setup __setup);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_DestroySetupD(vDSP_biquadm_SetupD __setup);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_CopyState(vDSP_biquadm_Setup __dest, VoidPtr __src);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_CopyStateD(vDSP_biquadm_SetupD __dest, VoidPtr __src);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_ResetState(vDSP_biquadm_Setup __setup);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_ResetStateD(vDSP_biquadm_SetupD __setup);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_SetCoefficientsDouble(vDSP_biquadm_Setup __setup, ConstDoublePtr __coeffs,
            @NUInt long __start_sec, @NUInt long __start_chn, @NUInt long __nsec, @NUInt long __nchn);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_SetTargetsDouble(vDSP_biquadm_Setup __setup, ConstDoublePtr __targets,
            float __interp_rate, float __interp_threshold, @NUInt long __start_sec, @NUInt long __start_chn,
            @NUInt long __nsec, @NUInt long __nchn);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_SetCoefficientsSingle(vDSP_biquadm_Setup __setup, ConstFloatPtr __coeffs,
            @NUInt long __start_sec, @NUInt long __start_chn, @NUInt long __nsec, @NUInt long __nchn);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_SetTargetsSingle(vDSP_biquadm_Setup __setup, ConstFloatPtr __targets,
            float __interp_rate, float __interp_threshold, @NUInt long __start_sec, @NUInt long __start_chn,
            @NUInt long __nsec, @NUInt long __nchn);

    @Generated
    @CFunction
    public static native void vDSP_biquadm_SetActiveFilters(vDSP_biquadm_Setup __setup, ConstBoolPtr __filter_states);

    @Generated
    @CFunction
    public static native void vDSP_ctoz(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Z, @NInt long __IZ,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_ctozD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Z,
            @NInt long __IZ, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_ztoc(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Z, @NInt long __IZ,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_ztocD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Z,
            @NInt long __IZ, @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_fft_zip(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zipD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zipt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_ziptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zopt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zopD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zoptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zrip(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zripD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zript(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zriptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zrop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zropD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zropt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft_zroptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zip(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC0,
            @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zipD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zipt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC1,
            @NInt long __IC0,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_ziptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA0,
            @NInt long __IA1, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zopD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA0, @NInt long __IA1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zopt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA0,
            @NInt long __IA1, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zoptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA0, @NInt long __IA1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zrip(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC0,
            @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zripD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __flag);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zript(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC0,
            @NInt long __IC1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zriptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __flag);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zrop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA0,
            @NInt long __IA1, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zropt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA0,
            @NInt long __IA1, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zropD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA0, @NInt long __IA1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1, @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fft2d_zroptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA0, @NInt long __IA1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC0, @NInt long __IC1,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N0, @NUInt long __Log2N1, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zip(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NInt long __IM, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zipD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IM, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zipt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NInt long __IM,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_ziptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IM,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @NInt long __IMA, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC, @NInt long __IMC, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zopD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, @NInt long __IMA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IMC, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zopt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @NInt long __IMA, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC, @NInt long __IMC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zoptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, @NInt long __IMA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IMC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zrip(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NInt long __IM, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zripD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IM, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zript(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NInt long __IM,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zriptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IM,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zrop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @NInt long __IMA, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC, @NInt long __IMC, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zropt(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @NInt long __IMA, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NInt long __IC, @NInt long __IMC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zropD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, @NInt long __IMA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IMC, @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_fftm_zroptD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, @NInt long __IMA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NInt long __IMC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __Buffer,
            @NUInt long __Log2N, @NUInt long __M, int __Direction);

    @Generated
    @Deprecated
    @CFunction
    public static native void vDSP_fft3_zop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @Deprecated
    @CFunction
    public static native void vDSP_fft3_zopD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __Log2N, int __Direction);

    @Generated
    @Deprecated
    @CFunction
    public static native void vDSP_fft5_zop(FFTSetup __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __Log2N, int __Direction);

    @Generated
    @Deprecated
    @CFunction
    public static native void vDSP_fft5_zopD(FFTSetupD __Setup,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __Log2N, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_biquad(VoidPtr __Setup, FloatPtr __Delay, ConstFloatPtr __X, @NInt long __IX,
            FloatPtr __Y, @NInt long __IY, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_biquadD(VoidPtr __Setup, DoublePtr __Delay, ConstDoublePtr __X, @NInt long __IX,
            DoublePtr __Y, @NInt long __IY, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_biquadm(vDSP_biquadm_Setup __Setup, Ptr<ConstFloatPtr> __X, @NInt long __IX,
            Ptr<FloatPtr> __Y, @NInt long __IY, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_biquadmD(vDSP_biquadm_SetupD __Setup, Ptr<ConstDoublePtr> __X, @NInt long __IX,
            Ptr<DoublePtr> __Y, @NInt long __IY, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_conv(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __F, @NInt long __IF,
            FloatPtr __C, @NInt long __IC, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_convD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __F, @NInt long __IF,
            DoublePtr __C, @NInt long __IC, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zconv(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __F, @NInt long __IF,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zconvD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __F,
            @NInt long __IF,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_f3x3(ConstFloatPtr __A, @NUInt long __NR, @NUInt long __NC, ConstFloatPtr __F,
            FloatPtr __C);

    @Generated
    @CFunction
    public static native void vDSP_f3x3D(ConstDoublePtr __A, @NUInt long __NR, @NUInt long __NC, ConstDoublePtr __F,
            DoublePtr __C);

    @Generated
    @CFunction
    public static native void vDSP_f5x5(ConstFloatPtr __A, @NUInt long __NR, @NUInt long __NC, ConstFloatPtr __F,
            FloatPtr __C);

    @Generated
    @CFunction
    public static native void vDSP_f5x5D(ConstDoublePtr __A, @NUInt long __NR, @NUInt long __NC, ConstDoublePtr __F,
            DoublePtr __C);

    @Generated
    @CFunction
    public static native void vDSP_imgfir(ConstFloatPtr __A, @NUInt long __NR, @NUInt long __NC, ConstFloatPtr __F,
            FloatPtr __C, @NUInt long __P, @NUInt long __Q);

    @Generated
    @CFunction
    public static native void vDSP_imgfirD(ConstDoublePtr __A, @NUInt long __NR, @NUInt long __NC, ConstDoublePtr __F,
            DoublePtr __C, @NUInt long __P, @NUInt long __Q);

    @Generated
    @CFunction
    public static native void vDSP_mtrans(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __M, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_mtransD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __M, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_mmul(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_mmulD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zmma(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __D, @NInt long __ID,
            @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zmmaD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __D,
            @NInt long __ID, @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zmms(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __D, @NInt long __ID,
            @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zmmsD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __D,
            @NInt long __ID, @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zvmmaa(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __D, @NInt long __ID,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __E, @NInt long __IE,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __F, @NInt long __IF,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmmaaD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __D,
            @NInt long __ID,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __E,
            @NInt long __IE,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __F,
            @NInt long __IF, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zmsm(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __D, @NInt long __ID,
            @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zmsmD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __D,
            @NInt long __ID, @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zmmul(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zmmulD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __M, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_vadd(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vaddD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vaddi(ConstIntPtr __A, @NInt long __IA, ConstIntPtr __B, @NInt long __IB, IntPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvadd(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvaddD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvadd(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            ConstFloatPtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvaddD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsub(ConstFloatPtr __B, @NInt long __IB, ConstFloatPtr __A, @NInt long __IA,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsubD(ConstDoublePtr __B, @NInt long __IB, ConstDoublePtr __A, @NInt long __IA,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvsub(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvsubD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmul(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmulD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvmul(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            ConstFloatPtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvmulD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vdiv(ConstFloatPtr __B, @NInt long __IB, ConstFloatPtr __A, @NInt long __IA,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vdivD(ConstDoublePtr __B, @NInt long __IB, ConstDoublePtr __A, @NInt long __IA,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vdivi(ConstIntPtr __B, @NInt long __IB, ConstIntPtr __A, @NInt long __IA, IntPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvdiv(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvdivD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvdiv(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            ConstFloatPtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvdivD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmul(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmulD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsq(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsqD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vssq(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vssqD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_distancesq(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_distancesqD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_dotpr(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_dotprD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zdotpr(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zdotprD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrdotpr(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            ConstFloatPtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrdotprD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vam(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vamD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, DoublePtr __D, @NInt long __IDD, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vma(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmaD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvma(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __D, @NInt long __ID,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmaD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __D,
            @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmul(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N, int __Conjugate);

    @Generated
    @CFunction
    public static native void vDSP_zvmulD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N, int __Conjugate);

    @Generated
    @CFunction
    public static native void vDSP_zidotpr(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zidotprD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvcma(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __D, @NInt long __ID,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvcmaD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __D,
            @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvsub(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            ConstFloatPtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zrvsubD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vdpsp(ConstDoublePtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vspdp(ConstFloatPtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vabs(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vabsD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vabsi(ConstIntPtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvabs(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvabsD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_veqvi(ConstIntPtr __A, @NInt long __IA, ConstIntPtr __B, @NInt long __IB, IntPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfill(ConstFloatPtr __A, FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfillD(ConstDoublePtr __A, DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfilli(ConstIntPtr __A, IntPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvfill(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvfillD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsadd(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsaddD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsaddi(ConstIntPtr __A, @NInt long __IA, ConstIntPtr __B, IntPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsdiv(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsdivD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsdivi(ConstIntPtr __A, @NInt long __IA, ConstIntPtr __B, IntPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zaspec(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, FloatPtr __C,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zaspecD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_blkman_window(FloatPtr __C, @NUInt long __N, int __Flag);

    @Generated
    @CFunction
    public static native void vDSP_blkman_windowD(DoublePtr __C, @NUInt long __N, int __Flag);

    @Generated
    @CFunction
    public static native void vDSP_zcoher(ConstFloatPtr __A, ConstFloatPtr __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, FloatPtr __D,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zcoherD(ConstDoublePtr __A, ConstDoublePtr __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            DoublePtr __D, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_desamp(ConstFloatPtr __A, @NInt long __DF, ConstFloatPtr __F, FloatPtr __C,
            @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_desampD(ConstDoublePtr __A, @NInt long __DF, ConstDoublePtr __F, DoublePtr __C,
            @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zrdesamp(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __DF,
            ConstFloatPtr __F, @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C,
            @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_zrdesampD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __DF, ConstDoublePtr __F,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_ztrans(ConstFloatPtr __A,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_ztransD(ConstDoublePtr __A,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zcspec(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zcspecD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvcmul(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B, @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvcmulD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @NInt long __IB,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __iC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvconj(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvconjD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvzsml(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvzsmlD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmags(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmagsD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmgsa(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            ConstFloatPtr __B, @NInt long __IB, FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmgsaD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, ConstDoublePtr __B, @NInt long __IB, DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmov(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvmovD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvneg(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvnegD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvphas(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvphasD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA, DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvsma(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __A, @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __C, @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPSplitComplex __D, @NInt long __ID,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_zvsmaD(
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __A,
            @NInt long __IA,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __B,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __C,
            @NInt long __IC,
            @UncertainArgument("Options: reference, array Fallback: reference") DSPDoubleSplitComplex __D,
            @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_deq22(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_deq22D(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_hamm_window(FloatPtr __C, @NUInt long __N, int __Flag);

    @Generated
    @CFunction
    public static native void vDSP_hamm_windowD(DoublePtr __C, @NUInt long __N, int __Flag);

    @Generated
    @CFunction
    public static native void vDSP_hann_window(FloatPtr __C, @NUInt long __N, int __Flag);

    @Generated
    @CFunction
    public static native void vDSP_hann_windowD(DoublePtr __C, @NUInt long __N, int __Flag);

    @Generated
    @CFunction
    public static native void vDSP_maxmgv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_maxmgvD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_maxmgvi(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_maxmgviD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_maxv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_maxvD(ConstDoublePtr __A, @NInt long __I, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_maxvi(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_maxviD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_meamgv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_meamgvD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_meanv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_meanvD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_measqv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_measqvD(ConstDoublePtr __A, @NInt long __I, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minmgv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minmgvD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minmgvi(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minmgviD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minvD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minvi(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_minviD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, NUIntPtr __I,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_mmov(ConstFloatPtr __A, FloatPtr __C, @NUInt long __M, @NUInt long __N,
            @NUInt long __TA, @NUInt long __TC);

    @Generated
    @CFunction
    public static native void vDSP_mmovD(ConstDoublePtr __A, DoublePtr __C, @NUInt long __M, @NUInt long __N,
            @NUInt long __TA, @NUInt long __TC);

    @Generated
    @CFunction
    public static native void vDSP_mvessq(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_mvessqD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_nzcros(ConstFloatPtr __A, @NInt long __IA, @NUInt long __B, NUIntPtr __C,
            NUIntPtr __D, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_nzcrosD(ConstDoublePtr __A, @NInt long __IA, @NUInt long __B, NUIntPtr __C,
            NUIntPtr __D, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_polar(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_polarD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_rect(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_rectD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_rmsqv(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_rmsqvD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svdiv(ConstFloatPtr __A, ConstFloatPtr __B, @NInt long __IB, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svdivD(ConstDoublePtr __A, ConstDoublePtr __B, @NInt long __IB, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_sve(ConstFloatPtr __A, @NInt long __I, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_sveD(ConstDoublePtr __A, @NInt long __I, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svemg(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svemgD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svesq(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svesqD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_sve_svesq(ConstFloatPtr __A, @NInt long __IA, FloatPtr __Sum,
            FloatPtr __SumOfSquares, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_sve_svesqD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __Sum,
            DoublePtr __SumOfSquares, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_normalize(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            FloatPtr __Mean, FloatPtr __StandardDeviation, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_normalizeD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            DoublePtr __Mean, DoublePtr __StandardDeviation, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svs(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_svsD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vaam(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, ConstFloatPtr __D, @NInt long __ID, FloatPtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vaamD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, ConstDoublePtr __D, @NInt long __ID, DoublePtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vasbm(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, ConstFloatPtr __D, @NInt long __ID, FloatPtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vasbmD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, ConstDoublePtr __D, @NInt long __ID, DoublePtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vasm(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vasmD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vavlin(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vavlinD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vclip(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vclipD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vclipc(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            FloatPtr __D, @NInt long __ID, @NUInt long __N, NUIntPtr __NLow, NUIntPtr __NHigh);

    @Generated
    @CFunction
    public static native void vDSP_vclipcD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            DoublePtr __D, @NInt long __ID, @NUInt long __N, NUIntPtr __NLow, NUIntPtr __NHigh);

    @Generated
    @CFunction
    public static native void vDSP_vclr(FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vclrD(DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vcmprs(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vcmprsD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vdbcon(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N, int __F);

    @Generated
    @CFunction
    public static native void vDSP_vdbconD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N, int __F);

    @Generated
    @CFunction
    public static native void vDSP_vdist(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vdistD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_venvlp(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_venvlpD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfix8(ConstFloatPtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfix8D(ConstDoublePtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfix16(ConstFloatPtr __A, @NInt long __IA, ShortPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfix16D(ConstDoublePtr __A, @NInt long __IA, ShortPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfix32(ConstFloatPtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfix32D(ConstDoublePtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixu8(ConstFloatPtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixu8D(ConstDoublePtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixu16(ConstFloatPtr __A, @NInt long __IA, CharPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixu16D(ConstDoublePtr __A, @NInt long __IA, CharPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixu32(ConstFloatPtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixu32D(ConstDoublePtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmfixu24(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B,
            @UncertainArgument("Options: reference, array Fallback: reference") vDSP_uint24 __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmfix24(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B,
            @UncertainArgument("Options: reference, array Fallback: reference") vDSP_int24 __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltu24(
            @UncertainArgument("Options: reference, array Fallback: reference") vDSP_uint24 __A, @NInt long __IA,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vflt24(
            @UncertainArgument("Options: reference, array Fallback: reference") vDSP_int24 __A, @NInt long __IA,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltsmu24(
            @UncertainArgument("Options: reference, array Fallback: reference") vDSP_uint24 __A, @NInt long __IA,
            ConstFloatPtr __B, FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltsm24(
            @UncertainArgument("Options: reference, array Fallback: reference") vDSP_int24 __A, @NInt long __IA,
            ConstFloatPtr __B, FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixr8(ConstFloatPtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixr8D(ConstDoublePtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixr16(ConstFloatPtr __A, @NInt long __IA, ShortPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixr16D(ConstDoublePtr __A, @NInt long __IA, ShortPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixr32(ConstFloatPtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixr32D(ConstDoublePtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixru8(ConstFloatPtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixru8D(ConstDoublePtr __A, @NInt long __IA, BytePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixru16(ConstFloatPtr __A, @NInt long __IA, CharPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixru16D(ConstDoublePtr __A, @NInt long __IA, CharPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixru32(ConstFloatPtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfixru32D(ConstDoublePtr __A, @NInt long __IA, IntPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vflt8(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __A,
            @NInt long __IA, FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vflt8D(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __A,
            @NInt long __IA, DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vflt16(ConstShortPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vflt16D(ConstShortPtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vflt32(ConstIntPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vflt32D(ConstIntPtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltu8(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __A,
            @NInt long __IA, FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltu8D(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __A,
            @NInt long __IA, DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltu16(ConstCharPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltu16D(ConstCharPtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltu32(ConstIntPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfltu32D(ConstIntPtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfrac(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vfracD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vgathr(ConstFloatPtr __A, ConstNUIntPtr __B, @NInt long __IB, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vgathrD(ConstDoublePtr __A, ConstNUIntPtr __B, @NInt long __IB, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vgathra(Ptr<ConstFloatPtr> __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vgathraD(Ptr<ConstDoublePtr> __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vgen(ConstFloatPtr __A, ConstFloatPtr __B, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vgenD(ConstDoublePtr __A, ConstDoublePtr __B, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vgenp(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N, @NUInt long __M);

    @Generated
    @CFunction
    public static native void vDSP_vgenpD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N, @NUInt long __M);

    @Generated
    @CFunction
    public static native void vDSP_viclip(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_viclipD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vindex(ConstFloatPtr __A, ConstFloatPtr __B, @NInt long __IB, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vindexD(ConstDoublePtr __A, ConstDoublePtr __B, @NInt long __IB, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vintb(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vintbD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vlim(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vlimD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vlint(ConstFloatPtr __A, ConstFloatPtr __B, @NInt long __IB, FloatPtr __C,
            @NInt long __IC, @NUInt long __N, @NUInt long __M);

    @Generated
    @CFunction
    public static native void vDSP_vlintD(ConstDoublePtr __A, ConstDoublePtr __B, @NInt long __IB, DoublePtr __C,
            @NInt long __IC, @NUInt long __N, @NUInt long __M);

    @Generated
    @CFunction
    public static native void vDSP_vmax(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmaxD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmaxmg(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmaxmgD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vswmax(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N, @NUInt long __WindowLength);

    @Generated
    @CFunction
    public static native void vDSP_vswmaxD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N, @NUInt long __WindowLength);

    @Generated
    @CFunction
    public static native void vDSP_vmin(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vminD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vminmg(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vminmgD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmma(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, ConstFloatPtr __D, @NInt long __ID, FloatPtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmmaD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, ConstDoublePtr __D, @NInt long __ID, DoublePtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmmsb(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, ConstFloatPtr __D, @NInt long __ID, FloatPtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmmsbD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, ConstDoublePtr __D, @NInt long __ID, DoublePtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmsa(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmsaD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmsb(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vmsbD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vnabs(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vnabsD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vneg(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vnegD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vpoly(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_vpolyD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_vpythg(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, ConstFloatPtr __D, @NInt long __ID, FloatPtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vpythgD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, ConstDoublePtr __D, @NInt long __ID, DoublePtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vqint(ConstFloatPtr __A, ConstFloatPtr __B, @NInt long __IB, FloatPtr __C,
            @NInt long __IC, @NUInt long __N, @NUInt long __M);

    @Generated
    @CFunction
    public static native void vDSP_vqintD(ConstDoublePtr __A, ConstDoublePtr __B, @NInt long __IB, DoublePtr __C,
            @NInt long __IC, @NUInt long __N, @NUInt long __M);

    @Generated
    @CFunction
    public static native void vDSP_vramp(ConstFloatPtr __A, ConstFloatPtr __B, FloatPtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampD(ConstDoublePtr __A, ConstDoublePtr __B, DoublePtr __C, @NInt long __IC,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrsum(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __S, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrsumD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __S, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrvrs(FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrvrsD(DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsbm(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsbmD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsbsbm(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, @NInt long __IC, ConstFloatPtr __D, @NInt long __ID, FloatPtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsbsbmD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, @NInt long __IC, ConstDoublePtr __D, @NInt long __ID, DoublePtr __E, @NInt long __IE,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsbsm(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            ConstFloatPtr __C, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsbsmD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            ConstDoublePtr __C, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsimps(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsimpsD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsma(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            @NInt long __IC, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmaD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            @NInt long __IC, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmsa(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmsaD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmsb(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            @NInt long __IC, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmsbD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            @NInt long __IC, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmsma(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            @NInt long __IC, ConstFloatPtr __D, FloatPtr __E, @NInt long __IE, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsmsmaD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            @NInt long __IC, ConstDoublePtr __D, DoublePtr __E, @NInt long __IE, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vsort(FloatPtr __C, @NUInt long __N, int __Order);

    @Generated
    @CFunction
    public static native void vDSP_vsortD(DoublePtr __C, @NUInt long __N, int __Order);

    @Generated
    @CFunction
    public static native void vDSP_vsorti(ConstFloatPtr __C, NUIntPtr __I, NUIntPtr __Temporary, @NUInt long __N,
            int __Order);

    @Generated
    @CFunction
    public static native void vDSP_vsortiD(ConstDoublePtr __C, NUIntPtr __I, NUIntPtr __Temporary, @NUInt long __N,
            int __Order);

    @Generated
    @CFunction
    public static native void vDSP_vswap(FloatPtr __A, @NInt long __IA, FloatPtr __B, @NInt long __IB, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vswapD(DoublePtr __A, @NInt long __IA, DoublePtr __B, @NInt long __IB,
            @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vswsum(ConstFloatPtr __A, @NInt long __IA, FloatPtr __C, @NInt long __IC,
            @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_vswsumD(ConstDoublePtr __A, @NInt long __IA, DoublePtr __C, @NInt long __IC,
            @NUInt long __N, @NUInt long __P);

    @Generated
    @CFunction
    public static native void vDSP_vtabi(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __S1, ConstFloatPtr __S2,
            ConstFloatPtr __C, @NUInt long __M, FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vtabiD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __S1, ConstDoublePtr __S2,
            ConstDoublePtr __C, @NUInt long __M, DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vthr(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vthrD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vthres(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vthresD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vthrsc(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, ConstFloatPtr __C,
            FloatPtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vthrscD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, ConstDoublePtr __C,
            DoublePtr __D, @NInt long __ID, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vtmerg(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, @NInt long __IB,
            FloatPtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vtmergD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, @NInt long __IB,
            DoublePtr __C, @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vtrapz(ConstFloatPtr __A, @NInt long __IA, ConstFloatPtr __B, FloatPtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vtrapzD(ConstDoublePtr __A, @NInt long __IA, ConstDoublePtr __B, DoublePtr __C,
            @NInt long __IC, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_wiener(@NUInt long __L, ConstFloatPtr __A, ConstFloatPtr __C, FloatPtr __F,
            FloatPtr __P, int __Flag, IntPtr __Error);

    @Generated
    @CFunction
    public static native void vDSP_wienerD(@NUInt long __L, ConstDoublePtr __A, ConstDoublePtr __C, DoublePtr __F,
            DoublePtr __P, int __Flag, IntPtr __Error);

    @Generated
    @CFunction
    public static native void vDSP_FFT16_copv(FloatPtr __Output, ConstFloatPtr __Input, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_FFT32_copv(FloatPtr __Output, ConstFloatPtr __Input, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_FFT16_zopv(FloatPtr __Or, FloatPtr __Oi, ConstFloatPtr __Ir, ConstFloatPtr __Ii,
            int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_FFT32_zopv(FloatPtr __Or, FloatPtr __Oi, ConstFloatPtr __Ir, ConstFloatPtr __Ii,
            int __Direction);

    @Generated
    @CFunction
    public static native vDSP_DFT_Setup vDSP_DFT_CreateSetup(vDSP_DFT_Setup __Previous, @NUInt long __Length);

    @Generated
    @CFunction
    public static native vDSP_DFT_Setup vDSP_DFT_zop_CreateSetup(vDSP_DFT_Setup __Previous, @NUInt long __Length,
            int __Direction);

    @Generated
    @CFunction
    public static native vDSP_DFT_SetupD vDSP_DFT_zop_CreateSetupD(vDSP_DFT_SetupD __Previous, @NUInt long __Length,
            int __Direction);

    @Generated
    @CFunction
    public static native vDSP_DFT_Setup vDSP_DFT_zrop_CreateSetup(vDSP_DFT_Setup __Previous, @NUInt long __Length,
            int __Direction);

    @Generated
    @CFunction
    public static native vDSP_DFT_SetupD vDSP_DFT_zrop_CreateSetupD(vDSP_DFT_SetupD __Previous, @NUInt long __Length,
            int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_DFT_DestroySetup(vDSP_DFT_Setup __Setup);

    @Generated
    @CFunction
    public static native void vDSP_DFT_DestroySetupD(vDSP_DFT_SetupD __Setup);

    @Generated
    @CFunction
    public static native void vDSP_DFT_zop(VoidPtr __Setup, ConstFloatPtr __Ir, ConstFloatPtr __Ii, @NInt long __Is,
            FloatPtr __Or, FloatPtr __Oi, @NInt long __Os, int __Direction);

    @Generated
    @CFunction
    public static native void vDSP_DFT_Execute(VoidPtr __Setup, ConstFloatPtr __Ir, ConstFloatPtr __Ii, FloatPtr __Or,
            FloatPtr __Oi);

    @Generated
    @CFunction
    public static native void vDSP_DFT_ExecuteD(VoidPtr __Setup, ConstDoublePtr __Ir, ConstDoublePtr __Ii,
            DoublePtr __Or, DoublePtr __Oi);

    @Generated
    @CFunction
    public static native vDSP_DFT_Setup vDSP_DCT_CreateSetup(vDSP_DFT_Setup __Previous, @NUInt long __Length,
            int __Type);

    @Generated
    @CFunction
    public static native void vDSP_DCT_Execute(VoidPtr __Setup, ConstFloatPtr __Input, FloatPtr __Output);

    @Generated
    @CFunction
    public static native void vDSP_dotpr2(ConstFloatPtr __A0, @NInt long __IA0, ConstFloatPtr __A1, @NInt long __IA1,
            ConstFloatPtr __B, @NInt long __IB, FloatPtr __C0, FloatPtr __C1, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_dotpr2D(ConstDoublePtr __A0, @NInt long __IA0, ConstDoublePtr __A1, @NInt long __IA1,
            ConstDoublePtr __B, @NInt long __IB, DoublePtr __C0, DoublePtr __C1, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_dotpr_s1_15(ConstShortPtr __A, @NInt long __IA, ConstShortPtr __B, @NInt long __IB,
            ShortPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_dotpr2_s1_15(ConstShortPtr __A0, @NInt long __IA0, ConstShortPtr __A1,
            @NInt long __IA1, ConstShortPtr __B, @NInt long __IB, ShortPtr __C0, ShortPtr __C1, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_dotpr_s8_24(ConstIntPtr __A, @NInt long __IA, ConstIntPtr __B, @NInt long __IB,
            IntPtr __C, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_dotpr2_s8_24(ConstIntPtr __A0, @NInt long __IA0, ConstIntPtr __A1, @NInt long __IA1,
            ConstIntPtr __B, @NInt long __IB, IntPtr __C0, IntPtr __C1, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vaddsub(ConstFloatPtr __I0, @NInt long __I0S, ConstFloatPtr __I1, @NInt long __I1S,
            FloatPtr __O0, @NInt long __O0S, FloatPtr __O1, @NInt long __O1S, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vaddsubD(ConstDoublePtr __I0, @NInt long __I0S, ConstDoublePtr __I1,
            @NInt long __I1S, DoublePtr __O0, @NInt long __O0S, DoublePtr __O1, @NInt long __O1S, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmul(ConstFloatPtr __I, @NInt long __IS, FloatPtr __Start, ConstFloatPtr __Step,
            FloatPtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmulD(ConstDoublePtr __I, @NInt long __IS, DoublePtr __Start,
            ConstDoublePtr __Step, DoublePtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladd(ConstFloatPtr __I, @NInt long __IS, FloatPtr __Start,
            ConstFloatPtr __Step, FloatPtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladdD(ConstDoublePtr __I, @NInt long __IS, DoublePtr __Start,
            ConstDoublePtr __Step, DoublePtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmul2(ConstFloatPtr __I0, ConstFloatPtr __I1, @NInt long __IS, FloatPtr __Start,
            ConstFloatPtr __Step, FloatPtr __O0, FloatPtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmul2D(ConstDoublePtr __I0, ConstDoublePtr __I1, @NInt long __IS,
            DoublePtr __Start, ConstDoublePtr __Step, DoublePtr __O0, DoublePtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladd2(ConstFloatPtr __I0, ConstFloatPtr __I1, @NInt long __IS,
            FloatPtr __Start, ConstFloatPtr __Step, FloatPtr __O0, FloatPtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladd2D(ConstDoublePtr __I0, ConstDoublePtr __I1, @NInt long __IS,
            DoublePtr __Start, ConstDoublePtr __Step, DoublePtr __O0, DoublePtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmul_s1_15(ConstShortPtr __I, @NInt long __IS, ShortPtr __Start,
            ConstShortPtr __Step, ShortPtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladd_s1_15(ConstShortPtr __I, @NInt long __IS, ShortPtr __Start,
            ConstShortPtr __Step, ShortPtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmul2_s1_15(ConstShortPtr __I0, ConstShortPtr __I1, @NInt long __IS,
            ShortPtr __Start, ConstShortPtr __Step, ShortPtr __O0, ShortPtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladd2_s1_15(ConstShortPtr __I0, ConstShortPtr __I1, @NInt long __IS,
            ShortPtr __Start, ConstShortPtr __Step, ShortPtr __O0, ShortPtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmul_s8_24(ConstIntPtr __I, @NInt long __IS, IntPtr __Start, ConstIntPtr __Step,
            IntPtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladd_s8_24(ConstIntPtr __I, @NInt long __IS, IntPtr __Start,
            ConstIntPtr __Step, IntPtr __O, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmul2_s8_24(ConstIntPtr __I0, ConstIntPtr __I1, @NInt long __IS, IntPtr __Start,
            ConstIntPtr __Step, IntPtr __O0, IntPtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @CFunction
    public static native void vDSP_vrampmuladd2_s8_24(ConstIntPtr __I0, ConstIntPtr __I1, @NInt long __IS,
            IntPtr __Start, ConstIntPtr __Step, IntPtr __O0, IntPtr __O1, @NInt long __OS, @NUInt long __N);

    @Generated
    @Variadic()
    @CFunction
    public static native int cblas_errprn(int __ierr, int __info, BytePtr __form, Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native void cblas_xerbla(int __p, BytePtr __rout, BytePtr __form, Object... varargs);

    @Generated
    @CFunction
    public static native float cblas_sdsdot(int __N, float __alpha, ConstFloatPtr __X, int __incX, ConstFloatPtr __Y,
            int __incY);

    @Generated
    @CFunction
    public static native double cblas_dsdot(int __N, ConstFloatPtr __X, int __incX, ConstFloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native float cblas_sdot(int __N, ConstFloatPtr __X, int __incX, ConstFloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native double cblas_ddot(int __N, ConstDoublePtr __X, int __incX, ConstDoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_cdotu_sub(int __N, ConstVoidPtr __X, int __incX, ConstVoidPtr __Y, int __incY,
            VoidPtr __dotu);

    @Generated
    @CFunction
    public static native void cblas_cdotc_sub(int __N, ConstVoidPtr __X, int __incX, ConstVoidPtr __Y, int __incY,
            VoidPtr __dotc);

    @Generated
    @CFunction
    public static native void cblas_zdotu_sub(int __N, ConstVoidPtr __X, int __incX, ConstVoidPtr __Y, int __incY,
            VoidPtr __dotu);

    @Generated
    @CFunction
    public static native void cblas_zdotc_sub(int __N, ConstVoidPtr __X, int __incX, ConstVoidPtr __Y, int __incY,
            VoidPtr __dotc);

    @Generated
    @CFunction
    public static native float cblas_snrm2(int __N, ConstFloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native float cblas_sasum(int __N, ConstFloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native double cblas_dnrm2(int __N, ConstDoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native double cblas_dasum(int __N, ConstDoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native float cblas_scnrm2(int __N, ConstVoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native float cblas_scasum(int __N, ConstVoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native double cblas_dznrm2(int __N, ConstVoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native double cblas_dzasum(int __N, ConstVoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native int cblas_isamax(int __N, ConstFloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native int cblas_idamax(int __N, ConstDoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native int cblas_icamax(int __N, ConstVoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native int cblas_izamax(int __N, ConstVoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_sswap(int __N, FloatPtr __X, int __incX, FloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_scopy(int __N, ConstFloatPtr __X, int __incX, FloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_saxpy(int __N, float __alpha, ConstFloatPtr __X, int __incX, FloatPtr __Y,
            int __incY);

    @Generated
    @CFunction
    public static native void catlas_saxpby(int __N, float __alpha, ConstFloatPtr __X, int __incX, float __beta,
            FloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void catlas_sset(int __N, float __alpha, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dswap(int __N, DoublePtr __X, int __incX, DoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_dcopy(int __N, ConstDoublePtr __X, int __incX, DoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_daxpy(int __N, double __alpha, ConstDoublePtr __X, int __incX, DoublePtr __Y,
            int __incY);

    @Generated
    @CFunction
    public static native void catlas_daxpby(int __N, double __alpha, ConstDoublePtr __X, int __incX, double __beta,
            DoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void catlas_dset(int __N, double __alpha, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_cswap(int __N, VoidPtr __X, int __incX, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_ccopy(int __N, ConstVoidPtr __X, int __incX, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_caxpy(int __N, ConstVoidPtr __alpha, ConstVoidPtr __X, int __incX, VoidPtr __Y,
            int __incY);

    @Generated
    @CFunction
    public static native void catlas_caxpby(int __N, ConstVoidPtr __alpha, ConstVoidPtr __X, int __incX,
            ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void catlas_cset(int __N, ConstVoidPtr __alpha, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_zswap(int __N, VoidPtr __X, int __incX, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_zcopy(int __N, ConstVoidPtr __X, int __incX, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_zaxpy(int __N, ConstVoidPtr __alpha, ConstVoidPtr __X, int __incX, VoidPtr __Y,
            int __incY);

    @Generated
    @CFunction
    public static native void catlas_zaxpby(int __N, ConstVoidPtr __alpha, ConstVoidPtr __X, int __incX,
            ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void catlas_zset(int __N, ConstVoidPtr __alpha, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_srotg(FloatPtr __a, FloatPtr __b, FloatPtr __c, FloatPtr __s);

    @Generated
    @CFunction
    public static native void cblas_srotmg(FloatPtr __d1, FloatPtr __d2, FloatPtr __b1, float __b2, FloatPtr __P);

    @Generated
    @CFunction
    public static native void cblas_srot(int __N, FloatPtr __X, int __incX, FloatPtr __Y, int __incY, float __c,
            float __s);

    @Generated
    @CFunction
    public static native void cblas_srotm(int __N, FloatPtr __X, int __incX, FloatPtr __Y, int __incY,
            ConstFloatPtr __P);

    @Generated
    @CFunction
    public static native void cblas_drotg(DoublePtr __a, DoublePtr __b, DoublePtr __c, DoublePtr __s);

    @Generated
    @CFunction
    public static native void cblas_drotmg(DoublePtr __d1, DoublePtr __d2, DoublePtr __b1, double __b2, DoublePtr __P);

    @Generated
    @CFunction
    public static native void cblas_drot(int __N, DoublePtr __X, int __incX, DoublePtr __Y, int __incY, double __c,
            double __s);

    @Generated
    @CFunction
    public static native void cblas_drotm(int __N, DoublePtr __X, int __incX, DoublePtr __Y, int __incY,
            ConstDoublePtr __P);

    @Generated
    @CFunction
    public static native void cblas_sscal(int __N, float __alpha, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dscal(int __N, double __alpha, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_cscal(int __N, ConstVoidPtr __alpha, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_zscal(int __N, ConstVoidPtr __alpha, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_csscal(int __N, float __alpha, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_zdscal(int __N, double __alpha, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_crotg(VoidPtr __a, VoidPtr __b, VoidPtr __c, VoidPtr __s);

    @Generated
    @CFunction
    public static native void cblas_zrotg(VoidPtr __a, VoidPtr __b, VoidPtr __c, VoidPtr __s);

    @Generated
    @CFunction
    public static native void cblas_csrot(int __N, VoidPtr __X, int __incX, VoidPtr __Y, int __incY, float __c,
            float __s);

    @Generated
    @CFunction
    public static native void cblas_zdrot(int __N, VoidPtr __X, int __incX, VoidPtr __Y, int __incY, double __c,
            double __s);

    @Generated
    @CFunction
    public static native void cblas_sgemv(int __Order, int __TransA, int __M, int __N, float __alpha, ConstFloatPtr __A,
            int __lda, ConstFloatPtr __X, int __incX, float __beta, FloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_sgbmv(int __Order, int __TransA, int __M, int __N, int __KL, int __KU,
            float __alpha, ConstFloatPtr __A, int __lda, ConstFloatPtr __X, int __incX, float __beta, FloatPtr __Y,
            int __incY);

    @Generated
    @CFunction
    public static native void cblas_strmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstFloatPtr __A,
            int __lda, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_stbmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstFloatPtr __A, int __lda, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_stpmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N,
            ConstFloatPtr __Ap, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_strsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstFloatPtr __A,
            int __lda, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_stbsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstFloatPtr __A, int __lda, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_stpsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N,
            ConstFloatPtr __Ap, FloatPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dgemv(int __Order, int __TransA, int __M, int __N, double __alpha,
            ConstDoublePtr __A, int __lda, ConstDoublePtr __X, int __incX, double __beta, DoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_dgbmv(int __Order, int __TransA, int __M, int __N, int __KL, int __KU,
            double __alpha, ConstDoublePtr __A, int __lda, ConstDoublePtr __X, int __incX, double __beta, DoublePtr __Y,
            int __incY);

    @Generated
    @CFunction
    public static native void cblas_dtrmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N,
            ConstDoublePtr __A, int __lda, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dtbmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstDoublePtr __A, int __lda, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dtpmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N,
            ConstDoublePtr __Ap, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dtrsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N,
            ConstDoublePtr __A, int __lda, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dtbsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstDoublePtr __A, int __lda, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_dtpsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N,
            ConstDoublePtr __Ap, DoublePtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_cgemv(int __Order, int __TransA, int __M, int __N, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_cgbmv(int __Order, int __TransA, int __M, int __N, int __KL, int __KU,
            ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta,
            VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_ctrmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __A,
            int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ctbmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstVoidPtr __A, int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ctpmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __Ap,
            VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ctrsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __A,
            int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ctbsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstVoidPtr __A, int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ctpsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __Ap,
            VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_zgemv(int __Order, int __TransA, int __M, int __N, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_zgbmv(int __Order, int __TransA, int __M, int __N, int __KL, int __KU,
            ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta,
            VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_ztrmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __A,
            int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ztbmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstVoidPtr __A, int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ztpmv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __Ap,
            VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ztrsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __A,
            int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ztbsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, int __K,
            ConstVoidPtr __A, int __lda, VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ztpsv(int __Order, int __Uplo, int __TransA, int __Diag, int __N, ConstVoidPtr __Ap,
            VoidPtr __X, int __incX);

    @Generated
    @CFunction
    public static native void cblas_ssymv(int __Order, int __Uplo, int __N, float __alpha, ConstFloatPtr __A, int __lda,
            ConstFloatPtr __X, int __incX, float __beta, FloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_ssbmv(int __Order, int __Uplo, int __N, int __K, float __alpha, ConstFloatPtr __A,
            int __lda, ConstFloatPtr __X, int __incX, float __beta, FloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_sspmv(int __Order, int __Uplo, int __N, float __alpha, ConstFloatPtr __Ap,
            ConstFloatPtr __X, int __incX, float __beta, FloatPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_sger(int __Order, int __M, int __N, float __alpha, ConstFloatPtr __X, int __incX,
            ConstFloatPtr __Y, int __incY, FloatPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_ssyr(int __Order, int __Uplo, int __N, float __alpha, ConstFloatPtr __X, int __incX,
            FloatPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_sspr(int __Order, int __Uplo, int __N, float __alpha, ConstFloatPtr __X, int __incX,
            FloatPtr __Ap);

    @Generated
    @CFunction
    public static native void cblas_ssyr2(int __Order, int __Uplo, int __N, float __alpha, ConstFloatPtr __X,
            int __incX, ConstFloatPtr __Y, int __incY, FloatPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_sspr2(int __Order, int __Uplo, int __N, float __alpha, ConstFloatPtr __X,
            int __incX, ConstFloatPtr __Y, int __incY, FloatPtr __A);

    @Generated
    @CFunction
    public static native void cblas_dsymv(int __Order, int __Uplo, int __N, double __alpha, ConstDoublePtr __A,
            int __lda, ConstDoublePtr __X, int __incX, double __beta, DoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_dsbmv(int __Order, int __Uplo, int __N, int __K, double __alpha, ConstDoublePtr __A,
            int __lda, ConstDoublePtr __X, int __incX, double __beta, DoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_dspmv(int __Order, int __Uplo, int __N, double __alpha, ConstDoublePtr __Ap,
            ConstDoublePtr __X, int __incX, double __beta, DoublePtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_dger(int __Order, int __M, int __N, double __alpha, ConstDoublePtr __X, int __incX,
            ConstDoublePtr __Y, int __incY, DoublePtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_dsyr(int __Order, int __Uplo, int __N, double __alpha, ConstDoublePtr __X,
            int __incX, DoublePtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_dspr(int __Order, int __Uplo, int __N, double __alpha, ConstDoublePtr __X,
            int __incX, DoublePtr __Ap);

    @Generated
    @CFunction
    public static native void cblas_dsyr2(int __Order, int __Uplo, int __N, double __alpha, ConstDoublePtr __X,
            int __incX, ConstDoublePtr __Y, int __incY, DoublePtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_dspr2(int __Order, int __Uplo, int __N, double __alpha, ConstDoublePtr __X,
            int __incX, ConstDoublePtr __Y, int __incY, DoublePtr __A);

    @Generated
    @CFunction
    public static native void cblas_chemv(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __A,
            int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_chbmv(int __Order, int __Uplo, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_chpmv(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __Ap,
            ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_cgeru(int __Order, int __M, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_cgerc(int __Order, int __M, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_cher(int __Order, int __Uplo, int __N, float __alpha, ConstVoidPtr __X, int __incX,
            VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_chpr(int __Order, int __Uplo, int __N, float __alpha, ConstVoidPtr __X, int __incX,
            VoidPtr __A);

    @Generated
    @CFunction
    public static native void cblas_cher2(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_chpr2(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __Ap);

    @Generated
    @CFunction
    public static native void cblas_zhemv(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __A,
            int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_zhbmv(int __Order, int __Uplo, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_zhpmv(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __Ap,
            ConstVoidPtr __X, int __incX, ConstVoidPtr __beta, VoidPtr __Y, int __incY);

    @Generated
    @CFunction
    public static native void cblas_zgeru(int __Order, int __M, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_zgerc(int __Order, int __M, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_zher(int __Order, int __Uplo, int __N, double __alpha, ConstVoidPtr __X, int __incX,
            VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_zhpr(int __Order, int __Uplo, int __N, double __alpha, ConstVoidPtr __X, int __incX,
            VoidPtr __A);

    @Generated
    @CFunction
    public static native void cblas_zher2(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __A, int __lda);

    @Generated
    @CFunction
    public static native void cblas_zhpr2(int __Order, int __Uplo, int __N, ConstVoidPtr __alpha, ConstVoidPtr __X,
            int __incX, ConstVoidPtr __Y, int __incY, VoidPtr __Ap);

    @Generated
    @CFunction
    public static native void cblas_sgemm(int __Order, int __TransA, int __TransB, int __M, int __N, int __K,
            float __alpha, ConstFloatPtr __A, int __lda, ConstFloatPtr __B, int __ldb, float __beta, FloatPtr __C,
            int __ldc);

    @Generated
    @CFunction
    public static native void cblas_ssymm(int __Order, int __Side, int __Uplo, int __M, int __N, float __alpha,
            ConstFloatPtr __A, int __lda, ConstFloatPtr __B, int __ldb, float __beta, FloatPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_ssyrk(int __Order, int __Uplo, int __Trans, int __N, int __K, float __alpha,
            ConstFloatPtr __A, int __lda, float __beta, FloatPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_ssyr2k(int __Order, int __Uplo, int __Trans, int __N, int __K, float __alpha,
            ConstFloatPtr __A, int __lda, ConstFloatPtr __B, int __ldb, float __beta, FloatPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_strmm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, float __alpha, ConstFloatPtr __A, int __lda, FloatPtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_strsm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, float __alpha, ConstFloatPtr __A, int __lda, FloatPtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_dgemm(int __Order, int __TransA, int __TransB, int __M, int __N, int __K,
            double __alpha, ConstDoublePtr __A, int __lda, ConstDoublePtr __B, int __ldb, double __beta, DoublePtr __C,
            int __ldc);

    @Generated
    @CFunction
    public static native void cblas_dsymm(int __Order, int __Side, int __Uplo, int __M, int __N, double __alpha,
            ConstDoublePtr __A, int __lda, ConstDoublePtr __B, int __ldb, double __beta, DoublePtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_dsyrk(int __Order, int __Uplo, int __Trans, int __N, int __K, double __alpha,
            ConstDoublePtr __A, int __lda, double __beta, DoublePtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_dsyr2k(int __Order, int __Uplo, int __Trans, int __N, int __K, double __alpha,
            ConstDoublePtr __A, int __lda, ConstDoublePtr __B, int __ldb, double __beta, DoublePtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_dtrmm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, double __alpha, ConstDoublePtr __A, int __lda, DoublePtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_dtrsm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, double __alpha, ConstDoublePtr __A, int __lda, DoublePtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_cgemm(int __Order, int __TransA, int __TransB, int __M, int __N, int __K,
            ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta,
            VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_csymm(int __Order, int __Side, int __Uplo, int __M, int __N, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_csyrk(int __Order, int __Uplo, int __Trans, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_csyr2k(int __Order, int __Uplo, int __Trans, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_ctrmm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, VoidPtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_ctrsm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, VoidPtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_zgemm(int __Order, int __TransA, int __TransB, int __M, int __N, int __K,
            ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta,
            VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_zsymm(int __Order, int __Side, int __Uplo, int __M, int __N, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_zsyrk(int __Order, int __Uplo, int __Trans, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_zsyr2k(int __Order, int __Uplo, int __Trans, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_ztrmm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, VoidPtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_ztrsm(int __Order, int __Side, int __Uplo, int __TransA, int __Diag, int __M,
            int __N, ConstVoidPtr __alpha, ConstVoidPtr __A, int __lda, VoidPtr __B, int __ldb);

    @Generated
    @CFunction
    public static native void cblas_chemm(int __Order, int __Side, int __Uplo, int __M, int __N, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_cherk(int __Order, int __Uplo, int __Trans, int __N, int __K, float __alpha,
            ConstVoidPtr __A, int __lda, float __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_cher2k(int __Order, int __Uplo, int __Trans, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, float __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_zhemm(int __Order, int __Side, int __Uplo, int __M, int __N, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, ConstVoidPtr __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_zherk(int __Order, int __Uplo, int __Trans, int __N, int __K, double __alpha,
            ConstVoidPtr __A, int __lda, double __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void cblas_zher2k(int __Order, int __Uplo, int __Trans, int __N, int __K, ConstVoidPtr __alpha,
            ConstVoidPtr __A, int __lda, ConstVoidPtr __B, int __ldb, double __beta, VoidPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void appleblas_sgeadd(int __order, int __transA, int __transB, int __m, int __n, float __alpha,
            ConstFloatPtr __A, int __lda, float __beta, ConstFloatPtr __B, int __ldb, FloatPtr __C, int __ldc);

    @Generated
    @CFunction
    public static native void appleblas_dgeadd(int __order, int __transA, int __transB, int __m, int __n,
            double __alpha, ConstDoublePtr __A, int __lda, double __beta, ConstDoublePtr __B, int __ldb, DoublePtr __C,
            int __ldc);

    @Generated
    @Deprecated
    @CFunction
    public static native void ATLU_DestroyThreadMemory();

    @Generated
    @CFunction
    public static native void SetBLASParamErrorProc(
            @FunctionPtr(name = "call_SetBLASParamErrorProc") Function_SetBLASParamErrorProc __ErrorProc);

    @Generated
    @CFunction
    public static native int cbdsqr_(BytePtr __uplo, IntPtr __n, IntPtr __ncvt, IntPtr __nru, IntPtr __ncc,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vt, IntPtr __ldvt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __u, IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbbrd_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __ncc, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __pt, IntPtr __ldpt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbcon_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __ipiv, FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbequ_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbequb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbrfs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afb, IntPtr __ldafb,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbsv_(IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku,
            IntPtr __nrhs, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afb,
            IntPtr __ldafb, IntPtr __ipiv, BytePtr __equed, FloatPtr __r__, FloatPtr __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbtf2_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbtrf_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgbtrs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgebak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __scale, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgebal_(BytePtr __job, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ilo, IntPtr __ihi, FloatPtr __scale, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgebd2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tauq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __taup,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgebrd_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tauq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __taup,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgecon_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeequ_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeequb_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            IntPtr __ilo, IntPtr __ihi, FloatPtr __scale, FloatPtr __abnrm, FloatPtr __rconde, FloatPtr __rcondv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgegs_(BytePtr __jobvsl, BytePtr __jobvsr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vsl, IntPtr __ldvsl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vsr, IntPtr __ldvsr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgegv_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgehd2_(IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgehrd_(IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgelq2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgelqf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgels_(BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgelsd_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __s, FloatPtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgelss_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __s, FloatPtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgelsx_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __jpvt, FloatPtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgelsy_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __jpvt, FloatPtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeql2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeqlf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeqp3_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __jpvt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeqpf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __jpvt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeqr2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgeqrf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgerfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgerq2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgerqf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgesc2_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __rhs, IntPtr __ipiv,
            IntPtr __jpiv, FloatPtr __scale);

    @Generated
    @CFunction
    public static native int cgesdd_(BytePtr __jobz, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __u,
            IntPtr __ldu, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vt,
            IntPtr __ldvt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgesv_(IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgesvd_(BytePtr __jobu, BytePtr __jobvt, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __u,
            IntPtr __ldu, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vt,
            IntPtr __ldvt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgesvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            IntPtr __ipiv, BytePtr __equed, FloatPtr __r__, FloatPtr __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgetc2_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __jpiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgetf2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgetrf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgetri_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgetrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int cggbak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __lscale, FloatPtr __rscale, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cggbal_(BytePtr __job, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __ilo, IntPtr __ihi, FloatPtr __lscale, FloatPtr __rscale, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cggev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cggevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            IntPtr __ilo, IntPtr __ihi, FloatPtr __lscale, FloatPtr __rscale, FloatPtr __abnrm, FloatPtr __bbnrm,
            FloatPtr __rconde, FloatPtr __rcondv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __iwork, IntPtr __bwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cggglm_(IntPtr __n, IntPtr __m, IntPtr __p,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgghrd_(BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgglse_(IntPtr __m, IntPtr __n, IntPtr __p,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cggqrf_(IntPtr __n, IntPtr __m, IntPtr __p,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __taua,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __taub,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cggrqf_(IntPtr __m, IntPtr __p, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __taua,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __taub,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cggsvd_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __n, IntPtr __p,
            IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __alpha, FloatPtr __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __u, IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cggsvp_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __tola, FloatPtr __tolb, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __u, IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            IntPtr __iwork, FloatPtr __rwork,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgtcon_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du2, IntPtr __ipiv,
            FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cgtrfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dlf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __duf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du2, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgtsv_(IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgtsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dlf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __duf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du2, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgttrf_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du2, IntPtr __ipiv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgttrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du2, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cgtts2_(IntPtr __itrans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du2, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int chbev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chbevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chbevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int chbgst_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bb, IntPtr __ldbb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chbgv_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bb, IntPtr __ldbb,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chbgvd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bb, IntPtr __ldbb,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chbgvx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __ka,
            IntPtr __kb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bb,
            IntPtr __ldbb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q,
            IntPtr __ldq, FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            FloatPtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int chbtrd_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int checon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cheequb_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cheev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cheevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cheevr_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __isuppz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cheevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int chegs2_(IntPtr __itype, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chegst_(IntPtr __itype, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chegv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chegvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __w, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chegvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int cherfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chesv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chesvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chetd2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int chetf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int chetrd_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chetrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chetri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chetrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int chfrk_(BytePtr __transr, BytePtr __uplo, BytePtr __trans, IntPtr __n, IntPtr __k,
            FloatPtr __alpha, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a,
            IntPtr __lda, FloatPtr __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__);

    @Generated
    @CFunction
    public static native int chgeqz_(BytePtr __job, BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t,
            IntPtr __ldt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native void chla_transtype__(BytePtr __ret_val, int __ret_val_len, IntPtr __trans);

    @Generated
    @CFunction
    public static native int chpcon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int chpev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chpevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chpevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __vl,
            FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int chpgst_(IntPtr __itype, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bp, IntPtr __info);

    @Generated
    @CFunction
    public static native int chpgv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bp, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chpgvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bp, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int chpgvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bp, FloatPtr __vl,
            FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int chprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afp, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chpsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chpsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afp, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chptrd_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __d__,
            FloatPtr __e, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chptrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chptri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int chptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int chsein_(BytePtr __side, BytePtr __eigsrc, BytePtr __initv, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __ifaill, IntPtr __ifailr, IntPtr __info);

    @Generated
    @CFunction
    public static native int chseqr_(BytePtr __job, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int clabrd_(IntPtr __m, IntPtr __n, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tauq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __taup,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int clacgv_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx);

    @Generated
    @CFunction
    public static native int clacn2_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, FloatPtr __est,
            IntPtr __kase, IntPtr __isave);

    @Generated
    @CFunction
    public static native int clacon_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, FloatPtr __est,
            IntPtr __kase);

    @Generated
    @CFunction
    public static native int clacp2_(BytePtr __uplo, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int clacpy_(BytePtr __uplo, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int clacrm_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            FloatPtr __rwork);

    @Generated
    @CFunction
    public static native int clacrt_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __cx, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __cy, IntPtr __incy,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s);

    @Generated
    @CFunction
    public static native void cladiv_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ret_val,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y);

    @Generated
    @CFunction
    public static native int claed0_(IntPtr __qsiz, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __qstore, IntPtr __ldqs,
            FloatPtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int claed7_(IntPtr __n, IntPtr __cutpnt, IntPtr __qsiz, IntPtr __tlvls, IntPtr __curlvl,
            IntPtr __curpbm, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            FloatPtr __rho, IntPtr __indxq, FloatPtr __qstore, IntPtr __qptr, IntPtr __prmptr, IntPtr __perm,
            IntPtr __givptr, IntPtr __givcol, FloatPtr __givnum,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int claed8_(IntPtr __k, IntPtr __n, IntPtr __qsiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            FloatPtr __d__, FloatPtr __rho, IntPtr __cutpnt, FloatPtr __z__, FloatPtr __dlamda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q2, IntPtr __ldq2,
            FloatPtr __w, IntPtr __indxp, IntPtr __indx, IntPtr __indxq, IntPtr __perm, IntPtr __givptr,
            IntPtr __givcol, FloatPtr __givnum, IntPtr __info);

    @Generated
    @CFunction
    public static native int claein_(IntPtr __rightv, IntPtr __noinit, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __rwork, FloatPtr __eps3, FloatPtr __smlnum, IntPtr __info);

    @Generated
    @CFunction
    public static native int claesy_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __rt1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __rt2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __evscal,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __cs1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sn1);

    @Generated
    @CFunction
    public static native int claev2_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, FloatPtr __rt1,
            FloatPtr __rt2, FloatPtr __cs1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sn1);

    @Generated
    @CFunction
    public static native int clag2z_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sa, IntPtr __ldsa,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int clags2_(IntPtr __upper, FloatPtr __a1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a2, FloatPtr __a3,
            FloatPtr __b1, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b2,
            FloatPtr __b3, FloatPtr __csu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __snu, FloatPtr __csv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __snv, FloatPtr __csq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __snq);

    @Generated
    @CFunction
    public static native int clagtm_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __beta, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb);

    @Generated
    @CFunction
    public static native int clahef_(BytePtr __uplo, IntPtr __n, IntPtr __nb, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            IntPtr __ldw, IntPtr __info);

    @Generated
    @CFunction
    public static native int clahqr_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w, IntPtr __iloz,
            IntPtr __ihiz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, IntPtr __info);

    @Generated
    @CFunction
    public static native int clahr2_(IntPtr __n, IntPtr __k, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int clahrd_(IntPtr __n, IntPtr __k, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int claic1_(IntPtr __job, IntPtr __j,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, FloatPtr __sest,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __gamma,
            FloatPtr __sestpr, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__);

    @Generated
    @CFunction
    public static native int clals0_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bx, IntPtr __ldbx,
            IntPtr __perm, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, FloatPtr __givnum, IntPtr __ldgnum,
            FloatPtr __poles, FloatPtr __difl, FloatPtr __difr, FloatPtr __z__, IntPtr __k, FloatPtr __c__,
            FloatPtr __s, FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int clalsa_(IntPtr __icompq, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __bx, IntPtr __ldbx,
            FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __k, FloatPtr __difl, FloatPtr __difr, FloatPtr __z__,
            FloatPtr __poles, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, IntPtr __perm, FloatPtr __givnum,
            FloatPtr __c__, FloatPtr __s, FloatPtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int clalsd_(BytePtr __uplo, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs, FloatPtr __d__,
            FloatPtr __e, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, FloatPtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native double clangb_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clange_(BytePtr __norm, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clangt_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __du);

    @Generated
    @CFunction
    public static native double clanhb_(BytePtr __norm, BytePtr __uplo, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clanhe_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clanhf_(BytePtr __norm, BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, FloatPtr __work);

    @Generated
    @CFunction
    public static native double clanhp_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __work);

    @Generated
    @CFunction
    public static native double clanhs_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clanht_(BytePtr __norm, IntPtr __n, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e);

    @Generated
    @CFunction
    public static native double clansb_(BytePtr __norm, BytePtr __uplo, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clansp_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __work);

    @Generated
    @CFunction
    public static native double clansy_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clantb_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double clantp_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __work);

    @Generated
    @CFunction
    public static native double clantr_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native int clapll_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __incy,
            FloatPtr __ssmin);

    @Generated
    @CFunction
    public static native int clapmt_(IntPtr __forwrd, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            IntPtr __k);

    @Generated
    @CFunction
    public static native int claqgb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int claqge_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int claqhb_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int claqhe_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int claqhp_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __s,
            FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int claqp2_(IntPtr __m, IntPtr __n, IntPtr __offset,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __jpvt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            FloatPtr __vn1, FloatPtr __vn2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work);

    @Generated
    @CFunction
    public static native int claqps_(IntPtr __m, IntPtr __n, IntPtr __offset, IntPtr __nb, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __jpvt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            FloatPtr __vn1, FloatPtr __vn2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __auxv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __f, IntPtr __ldf);

    @Generated
    @CFunction
    public static native int claqr0_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w, IntPtr __iloz,
            IntPtr __ihiz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int claqr1_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v);

    @Generated
    @CFunction
    public static native int claqr2_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__,
            IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __ns, IntPtr __nd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            IntPtr __nh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t,
            IntPtr __ldt, IntPtr __nv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __wv, IntPtr __ldwv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork);

    @Generated
    @CFunction
    public static native int claqr3_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__,
            IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __ns, IntPtr __nd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            IntPtr __nh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t,
            IntPtr __ldt, IntPtr __nv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __wv, IntPtr __ldwv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork);

    @Generated
    @CFunction
    public static native int claqr4_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w, IntPtr __iloz,
            IntPtr __ihiz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int claqr5_(IntPtr __wantt, IntPtr __wantz, IntPtr __kacc22, IntPtr __n, IntPtr __ktop,
            IntPtr __kbot, IntPtr __nshfts,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __h__, IntPtr __ldh,
            IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __u, IntPtr __ldu,
            IntPtr __nv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __wv,
            IntPtr __ldwv, IntPtr __nh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __wh, IntPtr __ldwh);

    @Generated
    @CFunction
    public static native int claqsb_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int claqsp_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __s,
            FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int claqsy_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int clar1v_(IntPtr __n, IntPtr __b1, IntPtr __bn, FloatPtr __lambda, FloatPtr __d__,
            FloatPtr __l, FloatPtr __ld, FloatPtr __lld, FloatPtr __pivmin, FloatPtr __gaptol,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __wantnc,
            IntPtr __negcnt, FloatPtr __ztz, FloatPtr __mingma, IntPtr __r__, IntPtr __isuppz, FloatPtr __nrminv,
            FloatPtr __resid, FloatPtr __rqcorr, FloatPtr __work);

    @Generated
    @CFunction
    public static native int clar2v_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __incx,
            FloatPtr __c__, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s,
            IntPtr __incc);

    @Generated
    @CFunction
    public static native int clarcm_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            FloatPtr __rwork);

    @Generated
    @CFunction
    public static native int clarf_(BytePtr __side, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __incv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work);

    @Generated
    @CFunction
    public static native int clarfb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int clarfg_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau);

    @Generated
    @CFunction
    public static native int clarfp_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau);

    @Generated
    @CFunction
    public static native int clarft_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int clarfx_(BytePtr __side, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work);

    @Generated
    @CFunction
    public static native int clargv_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __incy,
            FloatPtr __c__, IntPtr __incc);

    @Generated
    @CFunction
    public static native int clarnv_(IntPtr __idist, IntPtr __iseed, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x);

    @Generated
    @CFunction
    public static native int clarrv_(IntPtr __n, FloatPtr __vl, FloatPtr __vu, FloatPtr __d__, FloatPtr __l,
            FloatPtr __pivmin, IntPtr __isplit, IntPtr __m, IntPtr __dol, IntPtr __dou, FloatPtr __minrgp,
            FloatPtr __rtol1, FloatPtr __rtol2, FloatPtr __w, FloatPtr __werr, FloatPtr __wgap, IntPtr __iblock,
            IntPtr __indexw, FloatPtr __gers,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __isuppz, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int clarscl2_(IntPtr __m, IntPtr __n, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int clartg_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __f,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __g, FloatPtr __cs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sn,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __r__);

    @Generated
    @CFunction
    public static native int clartv_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __incy,
            FloatPtr __c__, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s,
            IntPtr __incc);

    @Generated
    @CFunction
    public static native int clarz_(BytePtr __side, IntPtr __m, IntPtr __n, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __incv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work);

    @Generated
    @CFunction
    public static native int clarzb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int clarzt_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int clascl_(BytePtr __type__, IntPtr __kl, IntPtr __ku, FloatPtr __cfrom, FloatPtr __cto,
            IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int clascl2_(IntPtr __m, IntPtr __n, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int claset_(BytePtr __uplo, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int clasr_(BytePtr __side, BytePtr __pivot, BytePtr __direct, IntPtr __m, IntPtr __n,
            FloatPtr __c__, FloatPtr __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int classq_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            FloatPtr __scale, FloatPtr __sumsq);

    @Generated
    @CFunction
    public static native int claswp_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __k1, IntPtr __k2, IntPtr __ipiv, IntPtr __incx);

    @Generated
    @CFunction
    public static native int clasyf_(BytePtr __uplo, IntPtr __n, IntPtr __nb, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w,
            IntPtr __ldw, IntPtr __info);

    @Generated
    @CFunction
    public static native int clatbs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            IntPtr __kd, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            FloatPtr __scale, FloatPtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int clatdf_(IntPtr __ijob, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __rhs, FloatPtr __rdsum,
            FloatPtr __rdscal, IntPtr __ipiv, IntPtr __jpiv);

    @Generated
    @CFunction
    public static native int clatps_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, FloatPtr __scale,
            FloatPtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int clatrd_(BytePtr __uplo, IntPtr __n, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __e, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w, IntPtr __ldw);

    @Generated
    @CFunction
    public static native int clatrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, FloatPtr __scale,
            FloatPtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int clatrz_(IntPtr __m, IntPtr __n, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work);

    @Generated
    @CFunction
    public static native int clatzm_(BytePtr __side, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __incv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c2, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work);

    @Generated
    @CFunction
    public static native int clauu2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int clauum_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbcon_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbequ_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbrfs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afb, IntPtr __ldafb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbstf_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbsv_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afb, IntPtr __ldafb,
            BytePtr __equed, FloatPtr __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbtf2_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbtrf_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpbtrs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpftrf_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpftri_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpftrs_(BytePtr __transr, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpocon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpoequ_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpoequb_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cporfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cposv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cposvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            BytePtr __equed, FloatPtr __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpotf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpotrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpotri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpotrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cppcon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __anorm,
            FloatPtr __rcond, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cppequ_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __s,
            FloatPtr __scond, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afp,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cppsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cppsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afp, BytePtr __equed,
            FloatPtr __s, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpptrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpptri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpstf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __piv, IntPtr __rank, FloatPtr __tol, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpstrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __piv, IntPtr __rank, FloatPtr __tol, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cptcon_(IntPtr __n, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e, FloatPtr __anorm,
            FloatPtr __rcond, FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpteqr_(BytePtr __compz, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cptrfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e, FloatPtr __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ef,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cptsv_(IntPtr __n, IntPtr __nrhs, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cptsvx_(BytePtr __fact, IntPtr __n, IntPtr __nrhs, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e, FloatPtr __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ef,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cpttrf_(IntPtr __n, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e, IntPtr __info);

    @Generated
    @CFunction
    public static native int cpttrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cptts2_(IntPtr __iuplo, IntPtr __n, IntPtr __nrhs, FloatPtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int crot_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __cx, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __cy, IntPtr __incy,
            FloatPtr __c__, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s);

    @Generated
    @CFunction
    public static native int cspcon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cspmv_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __incy);

    @Generated
    @CFunction
    public static native int cspr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap);

    @Generated
    @CFunction
    public static native int csprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afp, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cspsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cspsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __afp, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int csptrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int csptri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int csptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int csrscl_(IntPtr __n, FloatPtr __sa,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sx, IntPtr __incx);

    @Generated
    @CFunction
    public static native int cstedc_(BytePtr __compz, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cstegr_(BytePtr __jobz, BytePtr __range, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __isuppz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int cstein_(IntPtr __n, FloatPtr __d__, FloatPtr __e, IntPtr __m, FloatPtr __w,
            IntPtr __iblock, IntPtr __isplit,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            FloatPtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int cstemr_(BytePtr __jobz, BytePtr __range, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, IntPtr __m, FloatPtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __nzc, IntPtr __isuppz, IntPtr __tryrac, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int csteqr_(BytePtr __compz, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int csycon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, FloatPtr __anorm, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int csyequb_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int csymv_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __y, IntPtr __incy);

    @Generated
    @CFunction
    public static native int csyr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int csyrfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int csysv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int csysvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __af, IntPtr __ldaf,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int csytf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int csytrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int csytri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int csytrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctbcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab, IntPtr __ldab,
            FloatPtr __rcond, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctbrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x,
            IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctbtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctfsm_(BytePtr __transr, BytePtr __side, BytePtr __uplo, BytePtr __trans, BytePtr __diag,
            IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int ctftri_(BytePtr __transr, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctfttp_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __arf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctfttr_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __arf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __s, IntPtr __lds,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __p, IntPtr __ldp,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgex2_(IntPtr __wantq, IntPtr __wantz, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __j1, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgexc_(IntPtr __wantq, IntPtr __wantz, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __ifst, IntPtr __ilst, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgsen_(IntPtr __ijob, IntPtr __wantq, IntPtr __wantz, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __z__, IntPtr __ldz,
            IntPtr __m, FloatPtr __pl, FloatPtr __pr, FloatPtr __dif,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgsja_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            FloatPtr __tola, FloatPtr __tolb, FloatPtr __alpha, FloatPtr __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __u, IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __ncycle,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            FloatPtr __s, FloatPtr __dif, IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgsy2_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__, IntPtr __ldd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e, IntPtr __lde,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __f, IntPtr __ldf,
            FloatPtr __scale, FloatPtr __rdsum, FloatPtr __rdscal, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctgsyl_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __d__, IntPtr __ldd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __e, IntPtr __lde,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __f, IntPtr __ldf,
            FloatPtr __scale, FloatPtr __dif,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctpcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, FloatPtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctprfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctptri_(BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctptrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctpttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __arf, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctpttr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            FloatPtr __rcond, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrexc_(BytePtr __compq, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            IntPtr __ifst, IntPtr __ilst, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, FloatPtr __rwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrsen_(BytePtr __job, BytePtr __compq, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __w, IntPtr __m,
            FloatPtr __s, FloatPtr __sep,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vl, IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __vr, IntPtr __ldvr,
            FloatPtr __s, FloatPtr __sep, IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __ldwork,
            FloatPtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrsyl_(BytePtr __trana, BytePtr __tranb, IntPtr __isgn, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            FloatPtr __scale, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrti2_(BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrtri_(BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __arf, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctrttp_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctzrqf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int ctzrzf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cung2l_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cung2r_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cungbr_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunghr_(IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cungl2_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cunglq_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cungql_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cungqr_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cungr2_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cungrq_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cungtr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunm2l_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cunm2r_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmbr_(BytePtr __vect, BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n,
            IntPtr __k, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a,
            IntPtr __lda, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmhr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a,
            IntPtr __lda, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunml2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmlq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmql_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmqr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmr2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmr3_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmrq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmrz_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cunmtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int cupgtr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int cupmtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __c__, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dbdsdc_(BytePtr __uplo, BytePtr __compq, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __u, IntPtr __ldu, DoublePtr __vt, IntPtr __ldvt, DoublePtr __q, IntPtr __iq, DoublePtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dbdsqr_(BytePtr __uplo, IntPtr __n, IntPtr __ncvt, IntPtr __nru, IntPtr __ncc,
            DoublePtr __d__, DoublePtr __e, DoublePtr __vt, IntPtr __ldvt, DoublePtr __u, IntPtr __ldu, DoublePtr __c__,
            IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int ddisna_(BytePtr __job, IntPtr __m, IntPtr __n, DoublePtr __d__, DoublePtr __sep,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbbrd_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __ncc, IntPtr __kl, IntPtr __ku,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __d__, DoublePtr __e, DoublePtr __q, IntPtr __ldq, DoublePtr __pt,
            IntPtr __ldpt, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbcon_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku, DoublePtr __ab,
            IntPtr __ldab, IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond, DoublePtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbequ_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, DoublePtr __ab, IntPtr __ldab,
            DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbequb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, DoublePtr __ab, IntPtr __ldab,
            DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbrfs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __afb, IntPtr __ldafb, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb,
            DoublePtr __x, IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbsv_(IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs, DoublePtr __ab, IntPtr __ldab,
            IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku,
            IntPtr __nrhs, DoublePtr __ab, IntPtr __ldab, DoublePtr __afb, IntPtr __ldafb, IntPtr __ipiv,
            BytePtr __equed, DoublePtr __r__, DoublePtr __c__, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbtf2_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, DoublePtr __ab, IntPtr __ldab,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbtrf_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, DoublePtr __ab, IntPtr __ldab,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgbtrs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            DoublePtr __ab, IntPtr __ldab, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgebak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __scale, IntPtr __m, DoublePtr __v, IntPtr __ldv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgebal_(BytePtr __job, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __scale, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgebd2_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __d__,
            DoublePtr __e, DoublePtr __tauq, DoublePtr __taup, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgebrd_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __d__,
            DoublePtr __e, DoublePtr __tauq, DoublePtr __taup, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgecon_(BytePtr __norm, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __anorm,
            DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeequ_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __r__,
            DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeequb_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __r__,
            DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __wr, DoublePtr __wi, DoublePtr __vl, IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __wr, DoublePtr __wi, DoublePtr __vl, IntPtr __ldvl, DoublePtr __vr,
            IntPtr __ldvr, IntPtr __ilo, IntPtr __ihi, DoublePtr __scale, DoublePtr __abnrm, DoublePtr __rconde,
            DoublePtr __rcondv, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgegs_(BytePtr __jobvsl, BytePtr __jobvsr, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, DoublePtr __alphar, DoublePtr __alphai, DoublePtr __beta, DoublePtr __vsl,
            IntPtr __ldvsl, DoublePtr __vsr, IntPtr __ldvsr, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgegv_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, DoublePtr __alphar, DoublePtr __alphai, DoublePtr __beta, DoublePtr __vl,
            IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgehd2_(IntPtr __n, IntPtr __ilo, IntPtr __ihi, DoublePtr __a, IntPtr __lda,
            DoublePtr __tau, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgehrd_(IntPtr __n, IntPtr __ilo, IntPtr __ihi, DoublePtr __a, IntPtr __lda,
            DoublePtr __tau, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgejsv_(BytePtr __joba, BytePtr __jobu, BytePtr __jobv, BytePtr __jobr, BytePtr __jobt,
            BytePtr __jobp, IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __sva, DoublePtr __u,
            IntPtr __ldu, DoublePtr __v, IntPtr __ldv, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgelq2_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgelqf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgels_(BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgelsd_(IntPtr __m, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb, DoublePtr __s, DoublePtr __rcond, IntPtr __rank, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgelss_(IntPtr __m, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb, DoublePtr __s, DoublePtr __rcond, IntPtr __rank, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgelsx_(IntPtr __m, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb, IntPtr __jpvt, DoublePtr __rcond, IntPtr __rank, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgelsy_(IntPtr __m, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb, IntPtr __jpvt, DoublePtr __rcond, IntPtr __rank, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeql2_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeqlf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeqp3_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __jpvt,
            DoublePtr __tau, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeqpf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __jpvt,
            DoublePtr __tau, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeqr2_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgeqrf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgerfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            DoublePtr __af, IntPtr __ldaf, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgerq2_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgerqf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgesc2_(IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __rhs, IntPtr __ipiv,
            IntPtr __jpiv, DoublePtr __scale);

    @Generated
    @CFunction
    public static native int dgesdd_(BytePtr __jobz, IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __s,
            DoublePtr __u, IntPtr __ldu, DoublePtr __vt, IntPtr __ldvt, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgesv_(IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda, IntPtr __ipiv,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgesvd_(BytePtr __jobu, BytePtr __jobvt, IntPtr __m, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __s, DoublePtr __u, IntPtr __ldu, DoublePtr __vt, IntPtr __ldvt, DoublePtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgesvj_(BytePtr __joba, BytePtr __jobu, BytePtr __jobv, IntPtr __m, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __sva, IntPtr __mv, DoublePtr __v, IntPtr __ldv, DoublePtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgesvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __a,
            IntPtr __lda, DoublePtr __af, IntPtr __ldaf, IntPtr __ipiv, BytePtr __equed, DoublePtr __r__,
            DoublePtr __c__, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __rcond,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgetc2_(IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv, IntPtr __jpiv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgetf2_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgetrf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgetri_(IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv, DoublePtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgetrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dggbak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __lscale, DoublePtr __rscale, IntPtr __m, DoublePtr __v, IntPtr __ldv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dggbal_(BytePtr __job, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb, IntPtr __ilo, IntPtr __ihi, DoublePtr __lscale, DoublePtr __rscale, DoublePtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dggev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, DoublePtr __alphar, DoublePtr __alphai, DoublePtr __beta, DoublePtr __vl,
            IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dggevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __alphar, DoublePtr __alphai,
            DoublePtr __beta, DoublePtr __vl, IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __lscale, DoublePtr __rscale, DoublePtr __abnrm, DoublePtr __bbnrm, DoublePtr __rconde,
            DoublePtr __rcondv, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __bwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dggglm_(IntPtr __n, IntPtr __m, IntPtr __p, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb, DoublePtr __d__, DoublePtr __x, DoublePtr __y, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgghrd_(BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __q, IntPtr __ldq, DoublePtr __z__,
            IntPtr __ldz, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgglse_(IntPtr __m, IntPtr __n, IntPtr __p, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb, DoublePtr __c__, DoublePtr __d__, DoublePtr __x, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dggqrf_(IntPtr __n, IntPtr __m, IntPtr __p, DoublePtr __a, IntPtr __lda, DoublePtr __taua,
            DoublePtr __b, IntPtr __ldb, DoublePtr __taub, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dggrqf_(IntPtr __m, IntPtr __p, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __taua,
            DoublePtr __b, IntPtr __ldb, DoublePtr __taub, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dggsvd_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __n, IntPtr __p,
            IntPtr __k, IntPtr __l, DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __alpha,
            DoublePtr __beta, DoublePtr __u, IntPtr __ldu, DoublePtr __v, IntPtr __ldv, DoublePtr __q, IntPtr __ldq,
            DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dggsvp_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __tola, DoublePtr __tolb, IntPtr __k,
            IntPtr __l, DoublePtr __u, IntPtr __ldu, DoublePtr __v, IntPtr __ldv, DoublePtr __q, IntPtr __ldq,
            IntPtr __iwork, DoublePtr __tau, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgsvj0_(BytePtr __jobv, IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __d__, DoublePtr __sva, IntPtr __mv, DoublePtr __v, IntPtr __ldv, DoublePtr __eps,
            DoublePtr __sfmin, DoublePtr __tol, IntPtr __nsweep, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgsvj1_(BytePtr __jobv, IntPtr __m, IntPtr __n, IntPtr __n1, DoublePtr __a, IntPtr __lda,
            DoublePtr __d__, DoublePtr __sva, IntPtr __mv, DoublePtr __v, IntPtr __ldv, DoublePtr __eps,
            DoublePtr __sfmin, DoublePtr __tol, IntPtr __nsweep, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgtcon_(BytePtr __norm, IntPtr __n, DoublePtr __dl, DoublePtr __d__, DoublePtr __du,
            DoublePtr __du2, IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond, DoublePtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dgtrfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __dl, DoublePtr __d__,
            DoublePtr __du, DoublePtr __dlf, DoublePtr __df, DoublePtr __duf, DoublePtr __du2, IntPtr __ipiv,
            DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgtsv_(IntPtr __n, IntPtr __nrhs, DoublePtr __dl, DoublePtr __d__, DoublePtr __du,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgtsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __dl,
            DoublePtr __d__, DoublePtr __du, DoublePtr __dlf, DoublePtr __df, DoublePtr __duf, DoublePtr __du2,
            IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __rcond,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgttrf_(IntPtr __n, DoublePtr __dl, DoublePtr __d__, DoublePtr __du, DoublePtr __du2,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgttrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __dl, DoublePtr __d__,
            DoublePtr __du, DoublePtr __du2, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dgtts2_(IntPtr __itrans, IntPtr __n, IntPtr __nrhs, DoublePtr __dl, DoublePtr __d__,
            DoublePtr __du, DoublePtr __du2, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int dhgeqz_(BytePtr __job, BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, DoublePtr __h__, IntPtr __ldh, DoublePtr __t, IntPtr __ldt, DoublePtr __alphar,
            DoublePtr __alphai, DoublePtr __beta, DoublePtr __q, IntPtr __ldq, DoublePtr __z__, IntPtr __ldz,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dhsein_(BytePtr __side, BytePtr __eigsrc, BytePtr __initv, IntPtr __select, IntPtr __n,
            DoublePtr __h__, IntPtr __ldh, DoublePtr __wr, DoublePtr __wi, DoublePtr __vl, IntPtr __ldvl,
            DoublePtr __vr, IntPtr __ldvr, IntPtr __mm, IntPtr __m, DoublePtr __work, IntPtr __ifaill, IntPtr __ifailr,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dhseqr_(BytePtr __job, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __h__, IntPtr __ldh, DoublePtr __wr, DoublePtr __wi, DoublePtr __z__, IntPtr __ldz,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int disnan_(DoublePtr __din);

    @Generated
    @CFunction
    public static native int dlabad_(DoublePtr __small, DoublePtr __large);

    @Generated
    @CFunction
    public static native int dlabrd_(IntPtr __m, IntPtr __n, IntPtr __nb, DoublePtr __a, IntPtr __lda, DoublePtr __d__,
            DoublePtr __e, DoublePtr __tauq, DoublePtr __taup, DoublePtr __x, IntPtr __ldx, DoublePtr __y,
            IntPtr __ldy);

    @Generated
    @CFunction
    public static native int dlacn2_(IntPtr __n, DoublePtr __v, DoublePtr __x, IntPtr __isgn, DoublePtr __est,
            IntPtr __kase, IntPtr __isave);

    @Generated
    @CFunction
    public static native int dlacon_(IntPtr __n, DoublePtr __v, DoublePtr __x, IntPtr __isgn, DoublePtr __est,
            IntPtr __kase);

    @Generated
    @CFunction
    public static native int dlacpy_(BytePtr __uplo, IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __b,
            IntPtr __ldb);

    @Generated
    @CFunction
    public static native int dladiv_(DoublePtr __a, DoublePtr __b, DoublePtr __c__, DoublePtr __d__, DoublePtr __p,
            DoublePtr __q);

    @Generated
    @CFunction
    public static native int dlae2_(DoublePtr __a, DoublePtr __b, DoublePtr __c__, DoublePtr __rt1, DoublePtr __rt2);

    @Generated
    @CFunction
    public static native int dlaebz_(IntPtr __ijob, IntPtr __nitmax, IntPtr __n, IntPtr __mmax, IntPtr __minp,
            IntPtr __nbmin, DoublePtr __abstol, DoublePtr __reltol, DoublePtr __pivmin, DoublePtr __d__, DoublePtr __e,
            DoublePtr __e2, IntPtr __nval, DoublePtr __ab, DoublePtr __c__, IntPtr __mout, IntPtr __nab,
            DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed0_(IntPtr __icompq, IntPtr __qsiz, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __q, IntPtr __ldq, DoublePtr __qstore, IntPtr __ldqs, DoublePtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed1_(IntPtr __n, DoublePtr __d__, DoublePtr __q, IntPtr __ldq, IntPtr __indxq,
            DoublePtr __rho, IntPtr __cutpnt, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed2_(IntPtr __k, IntPtr __n, IntPtr __n1, DoublePtr __d__, DoublePtr __q, IntPtr __ldq,
            IntPtr __indxq, DoublePtr __rho, DoublePtr __z__, DoublePtr __dlamda, DoublePtr __w, DoublePtr __q2,
            IntPtr __indx, IntPtr __indxc, IntPtr __indxp, IntPtr __coltyp, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed3_(IntPtr __k, IntPtr __n, IntPtr __n1, DoublePtr __d__, DoublePtr __q, IntPtr __ldq,
            DoublePtr __rho, DoublePtr __dlamda, DoublePtr __q2, IntPtr __indx, IntPtr __ctot, DoublePtr __w,
            DoublePtr __s, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed4_(IntPtr __n, IntPtr __i__, DoublePtr __d__, DoublePtr __z__, DoublePtr __delta,
            DoublePtr __rho, DoublePtr __dlam, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed5_(IntPtr __i__, DoublePtr __d__, DoublePtr __z__, DoublePtr __delta, DoublePtr __rho,
            DoublePtr __dlam);

    @Generated
    @CFunction
    public static native int dlaed6_(IntPtr __kniter, IntPtr __orgati, DoublePtr __rho, DoublePtr __d__,
            DoublePtr __z__, DoublePtr __finit, DoublePtr __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed7_(IntPtr __icompq, IntPtr __n, IntPtr __qsiz, IntPtr __tlvls, IntPtr __curlvl,
            IntPtr __curpbm, DoublePtr __d__, DoublePtr __q, IntPtr __ldq, IntPtr __indxq, DoublePtr __rho,
            IntPtr __cutpnt, DoublePtr __qstore, IntPtr __qptr, IntPtr __prmptr, IntPtr __perm, IntPtr __givptr,
            IntPtr __givcol, DoublePtr __givnum, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed8_(IntPtr __icompq, IntPtr __k, IntPtr __n, IntPtr __qsiz, DoublePtr __d__,
            DoublePtr __q, IntPtr __ldq, IntPtr __indxq, DoublePtr __rho, IntPtr __cutpnt, DoublePtr __z__,
            DoublePtr __dlamda, DoublePtr __q2, IntPtr __ldq2, DoublePtr __w, IntPtr __perm, IntPtr __givptr,
            IntPtr __givcol, DoublePtr __givnum, IntPtr __indxp, IntPtr __indx, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaed9_(IntPtr __k, IntPtr __kstart, IntPtr __kstop, IntPtr __n, DoublePtr __d__,
            DoublePtr __q, IntPtr __ldq, DoublePtr __rho, DoublePtr __dlamda, DoublePtr __w, DoublePtr __s,
            IntPtr __lds, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaeda_(IntPtr __n, IntPtr __tlvls, IntPtr __curlvl, IntPtr __curpbm, IntPtr __prmptr,
            IntPtr __perm, IntPtr __givptr, IntPtr __givcol, DoublePtr __givnum, DoublePtr __q, IntPtr __qptr,
            DoublePtr __z__, DoublePtr __ztemp, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaein_(IntPtr __rightv, IntPtr __noinit, IntPtr __n, DoublePtr __h__, IntPtr __ldh,
            DoublePtr __wr, DoublePtr __wi, DoublePtr __vr, DoublePtr __vi, DoublePtr __b, IntPtr __ldb,
            DoublePtr __work, DoublePtr __eps3, DoublePtr __smlnum, DoublePtr __bignum, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaev2_(DoublePtr __a, DoublePtr __b, DoublePtr __c__, DoublePtr __rt1, DoublePtr __rt2,
            DoublePtr __cs1, DoublePtr __sn1);

    @Generated
    @CFunction
    public static native int dlaexc_(IntPtr __wantq, IntPtr __n, DoublePtr __t, IntPtr __ldt, DoublePtr __q,
            IntPtr __ldq, IntPtr __j1, IntPtr __n1, IntPtr __n2, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlag2_(DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __safmin,
            DoublePtr __scale1, DoublePtr __scale2, DoublePtr __wr1, DoublePtr __wr2, DoublePtr __wi);

    @Generated
    @CFunction
    public static native int dlag2s_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, FloatPtr __sa, IntPtr __ldsa,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dlags2_(IntPtr __upper, DoublePtr __a1, DoublePtr __a2, DoublePtr __a3, DoublePtr __b1,
            DoublePtr __b2, DoublePtr __b3, DoublePtr __csu, DoublePtr __snu, DoublePtr __csv, DoublePtr __snv,
            DoublePtr __csq, DoublePtr __snq);

    @Generated
    @CFunction
    public static native int dlagtf_(IntPtr __n, DoublePtr __a, DoublePtr __lambda, DoublePtr __b, DoublePtr __c__,
            DoublePtr __tol, DoublePtr __d__, IntPtr __in, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlagtm_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __alpha, DoublePtr __dl,
            DoublePtr __d__, DoublePtr __du, DoublePtr __x, IntPtr __ldx, DoublePtr __beta, DoublePtr __b,
            IntPtr __ldb);

    @Generated
    @CFunction
    public static native int dlagts_(IntPtr __job, IntPtr __n, DoublePtr __a, DoublePtr __b, DoublePtr __c__,
            DoublePtr __d__, IntPtr __in, DoublePtr __y, DoublePtr __tol, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlagv2_(DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __alphar,
            DoublePtr __alphai, DoublePtr __beta, DoublePtr __csl, DoublePtr __snl, DoublePtr __csr, DoublePtr __snr);

    @Generated
    @CFunction
    public static native int dlahqr_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __h__, IntPtr __ldh, DoublePtr __wr, DoublePtr __wi, IntPtr __iloz, IntPtr __ihiz,
            DoublePtr __z__, IntPtr __ldz, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlahr2_(IntPtr __n, IntPtr __k, IntPtr __nb, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __t, IntPtr __ldt, DoublePtr __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int dlahrd_(IntPtr __n, IntPtr __k, IntPtr __nb, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __t, IntPtr __ldt, DoublePtr __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int dlaic1_(IntPtr __job, IntPtr __j, DoublePtr __x, DoublePtr __sest, DoublePtr __w,
            DoublePtr __gamma, DoublePtr __sestpr, DoublePtr __s, DoublePtr __c__);

    @Generated
    @CFunction
    public static native int dlaisnan_(DoublePtr __din1, DoublePtr __din2);

    @Generated
    @CFunction
    public static native int dlaln2_(IntPtr __ltrans, IntPtr __na, IntPtr __nw, DoublePtr __smin, DoublePtr __ca,
            DoublePtr __a, IntPtr __lda, DoublePtr __d1, DoublePtr __d2, DoublePtr __b, IntPtr __ldb, DoublePtr __wr,
            DoublePtr __wi, DoublePtr __x, IntPtr __ldx, DoublePtr __scale, DoublePtr __xnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlals0_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __nrhs,
            DoublePtr __b, IntPtr __ldb, DoublePtr __bx, IntPtr __ldbx, IntPtr __perm, IntPtr __givptr, IntPtr __givcol,
            IntPtr __ldgcol, DoublePtr __givnum, IntPtr __ldgnum, DoublePtr __poles, DoublePtr __difl, DoublePtr __difr,
            DoublePtr __z__, IntPtr __k, DoublePtr __c__, DoublePtr __s, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlalsa_(IntPtr __icompq, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs, DoublePtr __b,
            IntPtr __ldb, DoublePtr __bx, IntPtr __ldbx, DoublePtr __u, IntPtr __ldu, DoublePtr __vt, IntPtr __k,
            DoublePtr __difl, DoublePtr __difr, DoublePtr __z__, DoublePtr __poles, IntPtr __givptr, IntPtr __givcol,
            IntPtr __ldgcol, IntPtr __perm, DoublePtr __givnum, DoublePtr __c__, DoublePtr __s, DoublePtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlalsd_(BytePtr __uplo, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs, DoublePtr __d__,
            DoublePtr __e, DoublePtr __b, IntPtr __ldb, DoublePtr __rcond, IntPtr __rank, DoublePtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlamrg_(IntPtr __n1, IntPtr __n2, DoublePtr __a, IntPtr __dtrd1, IntPtr __dtrd2,
            IntPtr __index);

    @Generated
    @CFunction
    public static native int dlaneg_(IntPtr __n, DoublePtr __d__, DoublePtr __lld, DoublePtr __sigma,
            DoublePtr __pivmin, IntPtr __r__);

    @Generated
    @CFunction
    public static native double dlangb_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlange_(BytePtr __norm, IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlangt_(BytePtr __norm, IntPtr __n, DoublePtr __dl, DoublePtr __d__, DoublePtr __du);

    @Generated
    @CFunction
    public static native double dlanhs_(BytePtr __norm, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlansb_(BytePtr __norm, BytePtr __uplo, IntPtr __n, IntPtr __k, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlansf_(BytePtr __norm, BytePtr __transr, BytePtr __uplo, IntPtr __n, DoublePtr __a,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlansp_(BytePtr __norm, BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlanst_(BytePtr __norm, IntPtr __n, DoublePtr __d__, DoublePtr __e);

    @Generated
    @CFunction
    public static native double dlansy_(BytePtr __norm, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlantb_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __k,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlantp_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, DoublePtr __ap,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double dlantr_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __m, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlanv2_(DoublePtr __a, DoublePtr __b, DoublePtr __c__, DoublePtr __d__, DoublePtr __rt1r,
            DoublePtr __rt1i, DoublePtr __rt2r, DoublePtr __rt2i, DoublePtr __cs, DoublePtr __sn);

    @Generated
    @CFunction
    public static native int dlapll_(IntPtr __n, DoublePtr __x, IntPtr __incx, DoublePtr __y, IntPtr __incy,
            DoublePtr __ssmin);

    @Generated
    @CFunction
    public static native int dlapmt_(IntPtr __forwrd, IntPtr __m, IntPtr __n, DoublePtr __x, IntPtr __ldx, IntPtr __k);

    @Generated
    @CFunction
    public static native double dlapy2_(DoublePtr __x, DoublePtr __y);

    @Generated
    @CFunction
    public static native double dlapy3_(DoublePtr __x, DoublePtr __y, DoublePtr __z__);

    @Generated
    @CFunction
    public static native int dlaqgb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, DoublePtr __ab, IntPtr __ldab,
            DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax,
            BytePtr __equed);

    @Generated
    @CFunction
    public static native int dlaqge_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __r__,
            DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int dlaqp2_(IntPtr __m, IntPtr __n, IntPtr __offset, DoublePtr __a, IntPtr __lda,
            IntPtr __jpvt, DoublePtr __tau, DoublePtr __vn1, DoublePtr __vn2, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlaqps_(IntPtr __m, IntPtr __n, IntPtr __offset, IntPtr __nb, IntPtr __kb, DoublePtr __a,
            IntPtr __lda, IntPtr __jpvt, DoublePtr __tau, DoublePtr __vn1, DoublePtr __vn2, DoublePtr __auxv,
            DoublePtr __f, IntPtr __ldf);

    @Generated
    @CFunction
    public static native int dlaqr0_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __h__, IntPtr __ldh, DoublePtr __wr, DoublePtr __wi, IntPtr __iloz, IntPtr __ihiz,
            DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaqr1_(IntPtr __n, DoublePtr __h__, IntPtr __ldh, DoublePtr __sr1, DoublePtr __si1,
            DoublePtr __sr2, DoublePtr __si2, DoublePtr __v);

    @Generated
    @CFunction
    public static native int dlaqr2_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, DoublePtr __h__, IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz, DoublePtr __z__, IntPtr __ldz,
            IntPtr __ns, IntPtr __nd, DoublePtr __sr, DoublePtr __si, DoublePtr __v, IntPtr __ldv, IntPtr __nh,
            DoublePtr __t, IntPtr __ldt, IntPtr __nv, DoublePtr __wv, IntPtr __ldwv, DoublePtr __work, IntPtr __lwork);

    @Generated
    @CFunction
    public static native int dlaqr3_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, DoublePtr __h__, IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz, DoublePtr __z__, IntPtr __ldz,
            IntPtr __ns, IntPtr __nd, DoublePtr __sr, DoublePtr __si, DoublePtr __v, IntPtr __ldv, IntPtr __nh,
            DoublePtr __t, IntPtr __ldt, IntPtr __nv, DoublePtr __wv, IntPtr __ldwv, DoublePtr __work, IntPtr __lwork);

    @Generated
    @CFunction
    public static native int dlaqr4_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __h__, IntPtr __ldh, DoublePtr __wr, DoublePtr __wi, IntPtr __iloz, IntPtr __ihiz,
            DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlaqr5_(IntPtr __wantt, IntPtr __wantz, IntPtr __kacc22, IntPtr __n, IntPtr __ktop,
            IntPtr __kbot, IntPtr __nshfts, DoublePtr __sr, DoublePtr __si, DoublePtr __h__, IntPtr __ldh,
            IntPtr __iloz, IntPtr __ihiz, DoublePtr __z__, IntPtr __ldz, DoublePtr __v, IntPtr __ldv, DoublePtr __u,
            IntPtr __ldu, IntPtr __nv, DoublePtr __wv, IntPtr __ldwv, IntPtr __nh, DoublePtr __wh, IntPtr __ldwh);

    @Generated
    @CFunction
    public static native int dlaqsb_(BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab, IntPtr __ldab,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int dlaqsp_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __s, DoublePtr __scond,
            DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int dlaqsy_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __s,
            DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int dlaqtr_(IntPtr __ltran, IntPtr __l__CLPK_real, IntPtr __n, DoublePtr __t, IntPtr __ldt,
            DoublePtr __b, DoublePtr __w, DoublePtr __scale, DoublePtr __x, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlar1v_(IntPtr __n, IntPtr __b1, IntPtr __bn, DoublePtr __lambda, DoublePtr __d__,
            DoublePtr __l, DoublePtr __ld, DoublePtr __lld, DoublePtr __pivmin, DoublePtr __gaptol, DoublePtr __z__,
            IntPtr __wantnc, IntPtr __negcnt, DoublePtr __ztz, DoublePtr __mingma, IntPtr __r__, IntPtr __isuppz,
            DoublePtr __nrminv, DoublePtr __resid, DoublePtr __rqcorr, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlar2v_(IntPtr __n, DoublePtr __x, DoublePtr __y, DoublePtr __z__, IntPtr __incx,
            DoublePtr __c__, DoublePtr __s, IntPtr __incc);

    @Generated
    @CFunction
    public static native int dlarf_(BytePtr __side, IntPtr __m, IntPtr __n, DoublePtr __v, IntPtr __incv,
            DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlarfb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k, DoublePtr __v, IntPtr __ldv, DoublePtr __t, IntPtr __ldt, DoublePtr __c__,
            IntPtr __ldc, DoublePtr __work, IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int dlarfg_(IntPtr __n, DoublePtr __alpha, DoublePtr __x, IntPtr __incx, DoublePtr __tau);

    @Generated
    @CFunction
    public static native int dlarfp_(IntPtr __n, DoublePtr __alpha, DoublePtr __x, IntPtr __incx, DoublePtr __tau);

    @Generated
    @CFunction
    public static native int dlarft_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k, DoublePtr __v,
            IntPtr __ldv, DoublePtr __tau, DoublePtr __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int dlarfx_(BytePtr __side, IntPtr __m, IntPtr __n, DoublePtr __v, DoublePtr __tau,
            DoublePtr __c__, IntPtr __ldc, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlargv_(IntPtr __n, DoublePtr __x, IntPtr __incx, DoublePtr __y, IntPtr __incy,
            DoublePtr __c__, IntPtr __incc);

    @Generated
    @CFunction
    public static native int dlarnv_(IntPtr __idist, IntPtr __iseed, IntPtr __n, DoublePtr __x);

    @Generated
    @CFunction
    public static native int dlarra_(IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __e2, DoublePtr __spltol,
            DoublePtr __tnrm, IntPtr __nsplit, IntPtr __isplit, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrb_(IntPtr __n, DoublePtr __d__, DoublePtr __lld, IntPtr __ifirst, IntPtr __ilast,
            DoublePtr __rtol1, DoublePtr __rtol2, IntPtr __offset, DoublePtr __w, DoublePtr __wgap, DoublePtr __werr,
            DoublePtr __work, IntPtr __iwork, DoublePtr __pivmin, DoublePtr __spdiam, IntPtr __twist, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrc_(BytePtr __jobt, IntPtr __n, DoublePtr __vl, DoublePtr __vu, DoublePtr __d__,
            DoublePtr __e, DoublePtr __pivmin, IntPtr __eigcnt, IntPtr __lcnt, IntPtr __rcnt, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrd_(BytePtr __range, BytePtr __order, IntPtr __n, DoublePtr __vl, DoublePtr __vu,
            IntPtr __il, IntPtr __iu, DoublePtr __gers, DoublePtr __reltol, DoublePtr __d__, DoublePtr __e,
            DoublePtr __e2, DoublePtr __pivmin, IntPtr __nsplit, IntPtr __isplit, IntPtr __m, DoublePtr __w,
            DoublePtr __werr, DoublePtr __wl, DoublePtr __wu, IntPtr __iblock, IntPtr __indexw, DoublePtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarre_(BytePtr __range, IntPtr __n, DoublePtr __vl, DoublePtr __vu, IntPtr __il,
            IntPtr __iu, DoublePtr __d__, DoublePtr __e, DoublePtr __e2, DoublePtr __rtol1, DoublePtr __rtol2,
            DoublePtr __spltol, IntPtr __nsplit, IntPtr __isplit, IntPtr __m, DoublePtr __w, DoublePtr __werr,
            DoublePtr __wgap, IntPtr __iblock, IntPtr __indexw, DoublePtr __gers, DoublePtr __pivmin, DoublePtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrf_(IntPtr __n, DoublePtr __d__, DoublePtr __l, DoublePtr __ld, IntPtr __clstrt,
            IntPtr __clend, DoublePtr __w, DoublePtr __wgap, DoublePtr __werr, DoublePtr __spdiam, DoublePtr __clgapl,
            DoublePtr __clgapr, DoublePtr __pivmin, DoublePtr __sigma, DoublePtr __dplus, DoublePtr __lplus,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrj_(IntPtr __n, DoublePtr __d__, DoublePtr __e2, IntPtr __ifirst, IntPtr __ilast,
            DoublePtr __rtol, IntPtr __offset, DoublePtr __w, DoublePtr __werr, DoublePtr __work, IntPtr __iwork,
            DoublePtr __pivmin, DoublePtr __spdiam, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrk_(IntPtr __n, IntPtr __iw, DoublePtr __gl, DoublePtr __gu, DoublePtr __d__,
            DoublePtr __e2, DoublePtr __pivmin, DoublePtr __reltol, DoublePtr __w, DoublePtr __werr, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrr_(IntPtr __n, DoublePtr __d__, DoublePtr __e, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarrv_(IntPtr __n, DoublePtr __vl, DoublePtr __vu, DoublePtr __d__, DoublePtr __l,
            DoublePtr __pivmin, IntPtr __isplit, IntPtr __m, IntPtr __dol, IntPtr __dou, DoublePtr __minrgp,
            DoublePtr __rtol1, DoublePtr __rtol2, DoublePtr __w, DoublePtr __werr, DoublePtr __wgap, IntPtr __iblock,
            IntPtr __indexw, DoublePtr __gers, DoublePtr __z__, IntPtr __ldz, IntPtr __isuppz, DoublePtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlarscl2_(IntPtr __m, IntPtr __n, DoublePtr __d__, DoublePtr __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int dlartg_(DoublePtr __f, DoublePtr __g, DoublePtr __cs, DoublePtr __sn, DoublePtr __r__);

    @Generated
    @CFunction
    public static native int dlartv_(IntPtr __n, DoublePtr __x, IntPtr __incx, DoublePtr __y, IntPtr __incy,
            DoublePtr __c__, DoublePtr __s, IntPtr __incc);

    @Generated
    @CFunction
    public static native int dlaruv_(IntPtr __iseed, IntPtr __n, DoublePtr __x);

    @Generated
    @CFunction
    public static native int dlarz_(BytePtr __side, IntPtr __m, IntPtr __n, IntPtr __l, DoublePtr __v, IntPtr __incv,
            DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlarzb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k, IntPtr __l, DoublePtr __v, IntPtr __ldv, DoublePtr __t, IntPtr __ldt,
            DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int dlarzt_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k, DoublePtr __v,
            IntPtr __ldv, DoublePtr __tau, DoublePtr __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int dlas2_(DoublePtr __f, DoublePtr __g, DoublePtr __h__, DoublePtr __ssmin,
            DoublePtr __ssmax);

    @Generated
    @CFunction
    public static native int dlascl_(BytePtr __type__, IntPtr __kl, IntPtr __ku, DoublePtr __cfrom, DoublePtr __cto,
            IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlascl2_(IntPtr __m, IntPtr __n, DoublePtr __d__, DoublePtr __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int dlasd0_(IntPtr __n, IntPtr __sqre, DoublePtr __d__, DoublePtr __e, DoublePtr __u,
            IntPtr __ldu, DoublePtr __vt, IntPtr __ldvt, IntPtr __smlsiz, IntPtr __iwork, DoublePtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasd1_(IntPtr __nl, IntPtr __nr, IntPtr __sqre, DoublePtr __d__, DoublePtr __alpha,
            DoublePtr __beta, DoublePtr __u, IntPtr __ldu, DoublePtr __vt, IntPtr __ldvt, IntPtr __idxq, IntPtr __iwork,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasd2_(IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __k, DoublePtr __d__,
            DoublePtr __z__, DoublePtr __alpha, DoublePtr __beta, DoublePtr __u, IntPtr __ldu, DoublePtr __vt,
            IntPtr __ldvt, DoublePtr __dsigma, DoublePtr __u2, IntPtr __ldu2, DoublePtr __vt2, IntPtr __ldvt2,
            IntPtr __idxp, IntPtr __idx, IntPtr __idxc, IntPtr __idxq, IntPtr __coltyp, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasd3_(IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __k, DoublePtr __d__,
            DoublePtr __q, IntPtr __ldq, DoublePtr __dsigma, DoublePtr __u, IntPtr __ldu, DoublePtr __u2, IntPtr __ldu2,
            DoublePtr __vt, IntPtr __ldvt, DoublePtr __vt2, IntPtr __ldvt2, IntPtr __idxc, IntPtr __ctot,
            DoublePtr __z__, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasd4_(IntPtr __n, IntPtr __i__, DoublePtr __d__, DoublePtr __z__, DoublePtr __delta,
            DoublePtr __rho, DoublePtr __sigma, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasd5_(IntPtr __i__, DoublePtr __d__, DoublePtr __z__, DoublePtr __delta, DoublePtr __rho,
            DoublePtr __dsigma, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlasd6_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, DoublePtr __d__,
            DoublePtr __vf, DoublePtr __vl, DoublePtr __alpha, DoublePtr __beta, IntPtr __idxq, IntPtr __perm,
            IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, DoublePtr __givnum, IntPtr __ldgnum, DoublePtr __poles,
            DoublePtr __difl, DoublePtr __difr, DoublePtr __z__, IntPtr __k, DoublePtr __c__, DoublePtr __s,
            DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasd7_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __k,
            DoublePtr __d__, DoublePtr __z__, DoublePtr __zw, DoublePtr __vf, DoublePtr __vfw, DoublePtr __vl,
            DoublePtr __vlw, DoublePtr __alpha, DoublePtr __beta, DoublePtr __dsigma, IntPtr __idx, IntPtr __idxp,
            IntPtr __idxq, IntPtr __perm, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, DoublePtr __givnum,
            IntPtr __ldgnum, DoublePtr __c__, DoublePtr __s, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasd8_(IntPtr __icompq, IntPtr __k, DoublePtr __d__, DoublePtr __z__, DoublePtr __vf,
            DoublePtr __vl, DoublePtr __difl, DoublePtr __difr, IntPtr __lddifr, DoublePtr __dsigma, DoublePtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasda_(IntPtr __icompq, IntPtr __smlsiz, IntPtr __n, IntPtr __sqre, DoublePtr __d__,
            DoublePtr __e, DoublePtr __u, IntPtr __ldu, DoublePtr __vt, IntPtr __k, DoublePtr __difl, DoublePtr __difr,
            DoublePtr __z__, DoublePtr __poles, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, IntPtr __perm,
            DoublePtr __givnum, DoublePtr __c__, DoublePtr __s, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasdq_(BytePtr __uplo, IntPtr __sqre, IntPtr __n, IntPtr __ncvt, IntPtr __nru,
            IntPtr __ncc, DoublePtr __d__, DoublePtr __e, DoublePtr __vt, IntPtr __ldvt, DoublePtr __u, IntPtr __ldu,
            DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasdt_(IntPtr __n, IntPtr __lvl, IntPtr __nd, IntPtr __inode, IntPtr __ndiml,
            IntPtr __ndimr, IntPtr __msub);

    @Generated
    @CFunction
    public static native int dlaset_(BytePtr __uplo, IntPtr __m, IntPtr __n, DoublePtr __alpha, DoublePtr __beta,
            DoublePtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int dlasq1_(IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasq2_(IntPtr __n, DoublePtr __z__, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasq3_(IntPtr __i0, IntPtr __n0, DoublePtr __z__, IntPtr __pp, DoublePtr __dmin__,
            DoublePtr __sigma, DoublePtr __desig, DoublePtr __qmax, IntPtr __nfail, IntPtr __iter, IntPtr __ndiv,
            IntPtr __ieee, IntPtr __ttype, DoublePtr __dmin1, DoublePtr __dmin2, DoublePtr __dn, DoublePtr __dn1,
            DoublePtr __dn2, DoublePtr __g, DoublePtr __tau);

    @Generated
    @CFunction
    public static native int dlasq4_(IntPtr __i0, IntPtr __n0, DoublePtr __z__, IntPtr __pp, IntPtr __n0in,
            DoublePtr __dmin__, DoublePtr __dmin1, DoublePtr __dmin2, DoublePtr __dn, DoublePtr __dn1, DoublePtr __dn2,
            DoublePtr __tau, IntPtr __ttype, DoublePtr __g);

    @Generated
    @CFunction
    public static native int dlasq5_(IntPtr __i0, IntPtr __n0, DoublePtr __z__, IntPtr __pp, DoublePtr __tau,
            DoublePtr __dmin__, DoublePtr __dmin1, DoublePtr __dmin2, DoublePtr __dn, DoublePtr __dnm1,
            DoublePtr __dnm2, IntPtr __ieee);

    @Generated
    @CFunction
    public static native int dlasq6_(IntPtr __i0, IntPtr __n0, DoublePtr __z__, IntPtr __pp, DoublePtr __dmin__,
            DoublePtr __dmin1, DoublePtr __dmin2, DoublePtr __dn, DoublePtr __dnm1, DoublePtr __dnm2);

    @Generated
    @CFunction
    public static native int dlasr_(BytePtr __side, BytePtr __pivot, BytePtr __direct, IntPtr __m, IntPtr __n,
            DoublePtr __c__, DoublePtr __s, DoublePtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int dlasrt_(BytePtr __id, IntPtr __n, DoublePtr __d__, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlassq_(IntPtr __n, DoublePtr __x, IntPtr __incx, DoublePtr __scale, DoublePtr __sumsq);

    @Generated
    @CFunction
    public static native int dlasv2_(DoublePtr __f, DoublePtr __g, DoublePtr __h__, DoublePtr __ssmin,
            DoublePtr __ssmax, DoublePtr __snr, DoublePtr __csr, DoublePtr __snl, DoublePtr __csl);

    @Generated
    @CFunction
    public static native int dlaswp_(IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __k1, IntPtr __k2, IntPtr __ipiv,
            IntPtr __incx);

    @Generated
    @CFunction
    public static native int dlasy2_(IntPtr __ltranl, IntPtr __ltranr, IntPtr __isgn, IntPtr __n1, IntPtr __n2,
            DoublePtr __tl, IntPtr __ldtl, DoublePtr __tr, IntPtr __ldtr, DoublePtr __b, IntPtr __ldb,
            DoublePtr __scale, DoublePtr __x, IntPtr __ldx, DoublePtr __xnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlasyf_(BytePtr __uplo, IntPtr __n, IntPtr __nb, IntPtr __kb, DoublePtr __a, IntPtr __lda,
            IntPtr __ipiv, DoublePtr __w, IntPtr __ldw, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlat2s_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, FloatPtr __sa,
            IntPtr __ldsa, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlatbs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            IntPtr __kd, DoublePtr __ab, IntPtr __ldab, DoublePtr __x, DoublePtr __scale, DoublePtr __cnorm,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dlatdf_(IntPtr __ijob, IntPtr __n, DoublePtr __z__, IntPtr __ldz, DoublePtr __rhs,
            DoublePtr __rdsum, DoublePtr __rdscal, IntPtr __ipiv, IntPtr __jpiv);

    @Generated
    @CFunction
    public static native int dlatps_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            DoublePtr __ap, DoublePtr __x, DoublePtr __scale, DoublePtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlatrd_(BytePtr __uplo, IntPtr __n, IntPtr __nb, DoublePtr __a, IntPtr __lda,
            DoublePtr __e, DoublePtr __tau, DoublePtr __w, IntPtr __ldw);

    @Generated
    @CFunction
    public static native int dlatrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __x, DoublePtr __scale, DoublePtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlatrz_(IntPtr __m, IntPtr __n, IntPtr __l, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlatzm_(BytePtr __side, IntPtr __m, IntPtr __n, DoublePtr __v, IntPtr __incv,
            DoublePtr __tau, DoublePtr __c1, DoublePtr __c2, IntPtr __ldc, DoublePtr __work);

    @Generated
    @CFunction
    public static native int dlauu2_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int dlauum_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int dopgtr_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __tau, DoublePtr __q,
            IntPtr __ldq, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dopmtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            DoublePtr __ap, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorg2l_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorg2r_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorgbr_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda,
            DoublePtr __tau, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorghr_(IntPtr __n, IntPtr __ilo, IntPtr __ihi, DoublePtr __a, IntPtr __lda,
            DoublePtr __tau, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorgl2_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorglq_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorgql_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorgqr_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorgr2_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorgrq_(IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorgtr_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorm2l_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorm2r_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dormbr_(BytePtr __vect, BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n,
            IntPtr __k, DoublePtr __a, IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dormhr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, DoublePtr __a, IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dorml2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dormlq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dormql_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dormqr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dormr2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dormr3_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            DoublePtr __a, IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dormrq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, DoublePtr __a,
            IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dormrz_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            DoublePtr __a, IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dormtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __tau, DoublePtr __c__, IntPtr __ldc, DoublePtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbcon_(BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab, IntPtr __ldab,
            DoublePtr __anorm, DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbequ_(BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab, IntPtr __ldab,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbrfs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __afb, IntPtr __ldafb, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbstf_(BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbsv_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __afb, IntPtr __ldafb, BytePtr __equed, DoublePtr __s,
            DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __rcond, DoublePtr __ferr,
            DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbtf2_(BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbtrf_(BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dpbtrs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpftrf_(BytePtr __transr, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpftri_(BytePtr __transr, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpftrs_(BytePtr __transr, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpocon_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __anorm,
            DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpoequ_(IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __s, DoublePtr __scond,
            DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpoequb_(IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __s, DoublePtr __scond,
            DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dporfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            DoublePtr __af, IntPtr __ldaf, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __ferr,
            DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dposv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dposvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a,
            IntPtr __lda, DoublePtr __af, IntPtr __ldaf, BytePtr __equed, DoublePtr __s, DoublePtr __b, IntPtr __ldb,
            DoublePtr __x, IntPtr __ldx, DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr, DoublePtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpotf2_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpotrf_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpotri_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpotrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dppcon_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __anorm, DoublePtr __rcond,
            DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dppequ_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __s, DoublePtr __scond,
            DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap, DoublePtr __afp,
            DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dppsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap, DoublePtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dppsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap,
            DoublePtr __afp, BytePtr __equed, DoublePtr __s, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpptrf_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpptri_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap, DoublePtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpstf2_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __piv,
            IntPtr __rank, DoublePtr __tol, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpstrf_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __piv,
            IntPtr __rank, DoublePtr __tol, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dptcon_(IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __anorm, DoublePtr __rcond,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpteqr_(BytePtr __compz, IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dptrfs_(IntPtr __n, IntPtr __nrhs, DoublePtr __d__, DoublePtr __e, DoublePtr __df,
            DoublePtr __ef, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __ferr,
            DoublePtr __berr, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dptsv_(IntPtr __n, IntPtr __nrhs, DoublePtr __d__, DoublePtr __e, DoublePtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dptsvx_(BytePtr __fact, IntPtr __n, IntPtr __nrhs, DoublePtr __d__, DoublePtr __e,
            DoublePtr __df, DoublePtr __ef, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __rcond,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpttrf_(IntPtr __n, DoublePtr __d__, DoublePtr __e, IntPtr __info);

    @Generated
    @CFunction
    public static native int dpttrs_(IntPtr __n, IntPtr __nrhs, DoublePtr __d__, DoublePtr __e, DoublePtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dptts2_(IntPtr __n, IntPtr __nrhs, DoublePtr __d__, DoublePtr __e, DoublePtr __b,
            IntPtr __ldb);

    @Generated
    @CFunction
    public static native int drscl_(IntPtr __n, DoublePtr __sa, DoublePtr __sx, IntPtr __incx);

    @Generated
    @CFunction
    public static native int dsbev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsbevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsbevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __q, IntPtr __ldq, DoublePtr __vl, DoublePtr __vu, IntPtr __il,
            IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work,
            IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsbgst_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __bb, IntPtr __ldbb, DoublePtr __x, IntPtr __ldx, DoublePtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dsbgv_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __bb, IntPtr __ldbb, DoublePtr __w, DoublePtr __z__, IntPtr __ldz,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsbgvd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __bb, IntPtr __ldbb, DoublePtr __w, DoublePtr __z__, IntPtr __ldz,
            DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsbgvx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __ka,
            IntPtr __kb, DoublePtr __ab, IntPtr __ldab, DoublePtr __bb, IntPtr __ldbb, DoublePtr __q, IntPtr __ldq,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsbtrd_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __kd, DoublePtr __ab,
            IntPtr __ldab, DoublePtr __d__, DoublePtr __e, DoublePtr __q, IntPtr __ldq, DoublePtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dsfrk_(BytePtr __transr, BytePtr __uplo, BytePtr __trans, IntPtr __n, IntPtr __k,
            DoublePtr __alpha, DoublePtr __a, IntPtr __lda, DoublePtr __beta, DoublePtr __c__);

    @Generated
    @CFunction
    public static native int dsgesv_(IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda, IntPtr __ipiv,
            DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __work, FloatPtr __swork, IntPtr __iter,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dspcon_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, IntPtr __ipiv, DoublePtr __anorm,
            DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dspev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __w,
            DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dspevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __w,
            DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dspevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, DoublePtr __ap,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dspgst_(IntPtr __itype, BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __bp,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dspgv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __ap,
            DoublePtr __bp, DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dspgvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __ap,
            DoublePtr __bp, DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dspgvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            DoublePtr __ap, DoublePtr __bp, DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu,
            DoublePtr __abstol, IntPtr __m, DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work,
            IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsposv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __work, FloatPtr __swork, IntPtr __iter,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dsprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap, DoublePtr __afp,
            IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dspsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap, IntPtr __ipiv,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dspsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap,
            DoublePtr __afp, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __rcond,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsptrd_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __d__, DoublePtr __e,
            DoublePtr __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsptrf_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsptri_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, IntPtr __ipiv, DoublePtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dsptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __ap, IntPtr __ipiv,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstebz_(BytePtr __range, BytePtr __order, IntPtr __n, DoublePtr __vl, DoublePtr __vu,
            IntPtr __il, IntPtr __iu, DoublePtr __abstol, DoublePtr __d__, DoublePtr __e, IntPtr __m, IntPtr __nsplit,
            DoublePtr __w, IntPtr __iblock, IntPtr __isplit, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstedc_(BytePtr __compz, IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstegr_(BytePtr __jobz, BytePtr __range, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            DoublePtr __z__, IntPtr __ldz, IntPtr __isuppz, DoublePtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstein_(IntPtr __n, DoublePtr __d__, DoublePtr __e, IntPtr __m, DoublePtr __w,
            IntPtr __iblock, IntPtr __isplit, DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __iwork,
            IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstemr_(BytePtr __jobz, BytePtr __range, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, IntPtr __m, DoublePtr __w, DoublePtr __z__,
            IntPtr __ldz, IntPtr __nzc, IntPtr __isuppz, IntPtr __tryrac, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsteqr_(BytePtr __compz, IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsterf_(IntPtr __n, DoublePtr __d__, DoublePtr __e, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstev_(BytePtr __jobz, IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstevd_(BytePtr __jobz, IntPtr __n, DoublePtr __d__, DoublePtr __e, DoublePtr __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstevr_(BytePtr __jobz, BytePtr __range, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            DoublePtr __z__, IntPtr __ldz, IntPtr __isuppz, DoublePtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dstevx_(BytePtr __jobz, BytePtr __range, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsycon_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv,
            DoublePtr __anorm, DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsyequb_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __s,
            DoublePtr __scond, DoublePtr __amax, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsyev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __w, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsyevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __w, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsyevr_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m,
            DoublePtr __w, DoublePtr __z__, IntPtr __ldz, IntPtr __isuppz, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsyevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m,
            DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsygs2_(IntPtr __itype, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsygst_(IntPtr __itype, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsygv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __w, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsygvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __w, DoublePtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsygvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __vl, DoublePtr __vu, IntPtr __il,
            IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w, DoublePtr __z__, IntPtr __ldz, DoublePtr __work,
            IntPtr __lwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsyrfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            DoublePtr __af, IntPtr __ldaf, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsysv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsysvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a,
            IntPtr __lda, DoublePtr __af, IntPtr __ldaf, IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, DoublePtr __x,
            IntPtr __ldx, DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsytd2_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __d__,
            DoublePtr __e, DoublePtr __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsytf2_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dsytrd_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __d__,
            DoublePtr __e, DoublePtr __tau, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsytrf_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsytri_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, IntPtr __ipiv,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dsytrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __a, IntPtr __lda,
            IntPtr __ipiv, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtbcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __kd,
            DoublePtr __ab, IntPtr __ldab, DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtbrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs, DoublePtr __ab, IntPtr __ldab, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtbtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs, DoublePtr __ab, IntPtr __ldab, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtfsm_(BytePtr __transr, BytePtr __side, BytePtr __uplo, BytePtr __trans, BytePtr __diag,
            IntPtr __m, IntPtr __n, DoublePtr __alpha, DoublePtr __a, DoublePtr __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int dtftri_(BytePtr __transr, BytePtr __uplo, BytePtr __diag, IntPtr __n, DoublePtr __a,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtfttp_(BytePtr __transr, BytePtr __uplo, IntPtr __n, DoublePtr __arf, DoublePtr __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtfttr_(BytePtr __transr, BytePtr __uplo, IntPtr __n, DoublePtr __arf, DoublePtr __a,
            IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n, DoublePtr __s,
            IntPtr __lds, DoublePtr __p, IntPtr __ldp, DoublePtr __vl, IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr,
            IntPtr __mm, IntPtr __m, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgex2_(IntPtr __wantq, IntPtr __wantz, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, DoublePtr __q, IntPtr __ldq, DoublePtr __z__, IntPtr __ldz, IntPtr __j1,
            IntPtr __n1, IntPtr __n2, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgexc_(IntPtr __wantq, IntPtr __wantz, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb, DoublePtr __q, IntPtr __ldq, DoublePtr __z__, IntPtr __ldz, IntPtr __ifst,
            IntPtr __ilst, DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgsen_(IntPtr __ijob, IntPtr __wantq, IntPtr __wantz, IntPtr __select, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __alphar, DoublePtr __alphai,
            DoublePtr __beta, DoublePtr __q, IntPtr __ldq, DoublePtr __z__, IntPtr __ldz, IntPtr __m, DoublePtr __pl,
            DoublePtr __pr, DoublePtr __dif, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgsja_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            IntPtr __k, IntPtr __l, DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __tola,
            DoublePtr __tolb, DoublePtr __alpha, DoublePtr __beta, DoublePtr __u, IntPtr __ldu, DoublePtr __v,
            IntPtr __ldv, DoublePtr __q, IntPtr __ldq, DoublePtr __work, IntPtr __ncycle, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __vl, IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr,
            DoublePtr __s, DoublePtr __dif, IntPtr __mm, IntPtr __m, DoublePtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgsy2_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __c__, IntPtr __ldc, DoublePtr __d__, IntPtr __ldd,
            DoublePtr __e, IntPtr __lde, DoublePtr __f, IntPtr __ldf, DoublePtr __scale, DoublePtr __rdsum,
            DoublePtr __rdscal, IntPtr __iwork, IntPtr __pq, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtgsyl_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __c__, IntPtr __ldc, DoublePtr __d__, IntPtr __ldd,
            DoublePtr __e, IntPtr __lde, DoublePtr __f, IntPtr __ldf, DoublePtr __scale, DoublePtr __dif,
            DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtpcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, DoublePtr __ap,
            DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtprfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            DoublePtr __ap, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __ferr,
            DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtptri_(BytePtr __uplo, BytePtr __diag, IntPtr __n, DoublePtr __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtptrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            DoublePtr __ap, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtpttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __arf,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtpttr_(BytePtr __uplo, IntPtr __n, DoublePtr __ap, DoublePtr __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, DoublePtr __a,
            IntPtr __lda, DoublePtr __rcond, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n, DoublePtr __t,
            IntPtr __ldt, DoublePtr __vl, IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr, IntPtr __mm, IntPtr __m,
            DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrexc_(BytePtr __compq, IntPtr __n, DoublePtr __t, IntPtr __ldt, DoublePtr __q,
            IntPtr __ldq, IntPtr __ifst, IntPtr __ilst, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __x, IntPtr __ldx, DoublePtr __ferr,
            DoublePtr __berr, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrsen_(BytePtr __job, BytePtr __compq, IntPtr __select, IntPtr __n, DoublePtr __t,
            IntPtr __ldt, DoublePtr __q, IntPtr __ldq, DoublePtr __wr, DoublePtr __wi, IntPtr __m, DoublePtr __s,
            DoublePtr __sep, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n, DoublePtr __t,
            IntPtr __ldt, DoublePtr __vl, IntPtr __ldvl, DoublePtr __vr, IntPtr __ldvr, DoublePtr __s, DoublePtr __sep,
            IntPtr __mm, IntPtr __m, DoublePtr __work, IntPtr __ldwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrsyl_(BytePtr __trana, BytePtr __tranb, IntPtr __isgn, IntPtr __m, IntPtr __n,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, DoublePtr __c__, IntPtr __ldc, DoublePtr __scale,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrti2_(BytePtr __uplo, BytePtr __diag, IntPtr __n, DoublePtr __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrtri_(BytePtr __uplo, BytePtr __diag, IntPtr __n, DoublePtr __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            DoublePtr __a, IntPtr __lda, DoublePtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda,
            DoublePtr __arf, IntPtr __info);

    @Generated
    @CFunction
    public static native int dtrttp_(BytePtr __uplo, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtzrqf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dtzrzf_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda, DoublePtr __tau,
            DoublePtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native double dzsum1_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __cx,
            IntPtr __incx);

    @Generated
    @CFunction
    public static native int icmax1_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __cx, IntPtr __incx);

    @Generated
    @CFunction
    public static native int ieeeck_(IntPtr __ispec, FloatPtr __zero, FloatPtr __one);

    @Generated
    @CFunction
    public static native int ilaclc_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int ilaclr_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int iladiag_(BytePtr __diag);

    @Generated
    @CFunction
    public static native int iladlc_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int iladlr_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int ilaenv_(IntPtr __ispec, BytePtr __name__, BytePtr __opts, IntPtr __n1, IntPtr __n2,
            IntPtr __n3, IntPtr __n4);

    @Generated
    @CFunction
    public static native int ilaprec_(BytePtr __prec);

    @Generated
    @CFunction
    public static native int ilaslc_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int ilaslr_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int ilatrans_(BytePtr __trans);

    @Generated
    @CFunction
    public static native int ilauplo_(BytePtr __uplo);

    @Generated
    @CFunction
    public static native int ilaver_(IntPtr __vers_major__, IntPtr __vers_minor__, IntPtr __vers_patch__);

    @Generated
    @CFunction
    public static native int ilazlc_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int ilazlr_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int iparmq_(IntPtr __ispec, BytePtr __name__, BytePtr __opts, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, IntPtr __lwork);

    @Generated
    @CFunction
    public static native int izmax1_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __cx,
            IntPtr __incx);

    @Generated
    @CFunction
    public static native int lsamen_(IntPtr __n, BytePtr __ca, BytePtr __cb);

    @Generated
    @CFunction
    public static native int smaxloc_(FloatPtr __a, IntPtr __dimm);

    @Generated
    @CFunction
    public static native int sbdsdc_(BytePtr __uplo, BytePtr __compq, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __ldvt, FloatPtr __q, IntPtr __iq, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sbdsqr_(BytePtr __uplo, IntPtr __n, IntPtr __ncvt, IntPtr __nru, IntPtr __ncc,
            FloatPtr __d__, FloatPtr __e, FloatPtr __vt, IntPtr __ldvt, FloatPtr __u, IntPtr __ldu, FloatPtr __c__,
            IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native double scsum1_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __cx, IntPtr __incx);

    @Generated
    @CFunction
    public static native int sdisna_(BytePtr __job, IntPtr __m, IntPtr __n, FloatPtr __d__, FloatPtr __sep,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbbrd_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __ncc, IntPtr __kl, IntPtr __ku,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __d__, FloatPtr __e, FloatPtr __q, IntPtr __ldq, FloatPtr __pt,
            IntPtr __ldpt, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbcon_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku, FloatPtr __ab, IntPtr __ldab,
            IntPtr __ipiv, FloatPtr __anorm, FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbequ_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, FloatPtr __ab, IntPtr __ldab,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbequb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, FloatPtr __ab, IntPtr __ldab,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbrfs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __afb, IntPtr __ldafb, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb,
            FloatPtr __x, IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbsv_(IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs, FloatPtr __ab, IntPtr __ldab,
            IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku,
            IntPtr __nrhs, FloatPtr __ab, IntPtr __ldab, FloatPtr __afb, IntPtr __ldafb, IntPtr __ipiv, BytePtr __equed,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __rcond,
            FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbtf2_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, FloatPtr __ab, IntPtr __ldab,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbtrf_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, FloatPtr __ab, IntPtr __ldab,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgbtrs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            FloatPtr __ab, IntPtr __ldab, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgebak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __scale, IntPtr __m, FloatPtr __v, IntPtr __ldv, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgebal_(BytePtr __job, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __scale, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgebd2_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __d__, FloatPtr __e,
            FloatPtr __tauq, FloatPtr __taup, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgebrd_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __d__, FloatPtr __e,
            FloatPtr __tauq, FloatPtr __taup, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgecon_(BytePtr __norm, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __anorm,
            FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeequ_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __r__, FloatPtr __c__,
            FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeequb_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __r__,
            FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __wr, FloatPtr __wi, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr, FloatPtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __wr, FloatPtr __wi, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr,
            IntPtr __ldvr, IntPtr __ilo, IntPtr __ihi, FloatPtr __scale, FloatPtr __abnrm, FloatPtr __rconde,
            FloatPtr __rcondv, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgegs_(BytePtr __jobvsl, BytePtr __jobvsr, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __alphar, FloatPtr __alphai, FloatPtr __beta, FloatPtr __vsl,
            IntPtr __ldvsl, FloatPtr __vsr, IntPtr __ldvsr, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgegv_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __alphar, FloatPtr __alphai, FloatPtr __beta, FloatPtr __vl,
            IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgehd2_(IntPtr __n, IntPtr __ilo, IntPtr __ihi, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgehrd_(IntPtr __n, IntPtr __ilo, IntPtr __ihi, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgejsv_(BytePtr __joba, BytePtr __jobu, BytePtr __jobv, BytePtr __jobr, BytePtr __jobt,
            BytePtr __jobp, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __sva, FloatPtr __u,
            IntPtr __ldu, FloatPtr __v, IntPtr __ldv, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgelq2_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgelqf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgels_(BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgelsd_(IntPtr __m, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb, FloatPtr __s, FloatPtr __rcond, IntPtr __rank, FloatPtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgelss_(IntPtr __m, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb, FloatPtr __s, FloatPtr __rcond, IntPtr __rank, FloatPtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgelsx_(IntPtr __m, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb, IntPtr __jpvt, FloatPtr __rcond, IntPtr __rank, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgelsy_(IntPtr __m, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb, IntPtr __jpvt, FloatPtr __rcond, IntPtr __rank, FloatPtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeql2_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeqlf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeqp3_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __jpvt, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeqpf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __jpvt, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeqr2_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgeqrf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgerfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            FloatPtr __af, IntPtr __ldaf, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgerq2_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgerqf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgesc2_(IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __rhs, IntPtr __ipiv,
            IntPtr __jpiv, FloatPtr __scale);

    @Generated
    @CFunction
    public static native int sgesdd_(BytePtr __jobz, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __s,
            FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __ldvt, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgesv_(IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda, IntPtr __ipiv, FloatPtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgesvd_(BytePtr __jobu, BytePtr __jobvt, IntPtr __m, IntPtr __n, FloatPtr __a,
            IntPtr __lda, FloatPtr __s, FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __ldvt, FloatPtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgesvj_(BytePtr __joba, BytePtr __jobu, BytePtr __jobv, IntPtr __m, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __sva, IntPtr __mv, FloatPtr __v, IntPtr __ldv, FloatPtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgesvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __a,
            IntPtr __lda, FloatPtr __af, IntPtr __ldaf, IntPtr __ipiv, BytePtr __equed, FloatPtr __r__, FloatPtr __c__,
            FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgetc2_(IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv, IntPtr __jpiv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgetf2_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgetrf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgetri_(IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv, FloatPtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgetrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggbak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __lscale, FloatPtr __rscale, IntPtr __m, FloatPtr __v, IntPtr __ldv, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggbal_(BytePtr __job, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb,
            IntPtr __ilo, IntPtr __ihi, FloatPtr __lscale, FloatPtr __rscale, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __alphar, FloatPtr __alphai, FloatPtr __beta, FloatPtr __vl,
            IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __alphar, FloatPtr __alphai,
            FloatPtr __beta, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __lscale, FloatPtr __rscale, FloatPtr __abnrm, FloatPtr __bbnrm, FloatPtr __rconde,
            FloatPtr __rcondv, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __bwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggglm_(IntPtr __n, IntPtr __m, IntPtr __p, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb, FloatPtr __d__, FloatPtr __x, FloatPtr __y, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgghrd_(BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __q, IntPtr __ldq, FloatPtr __z__,
            IntPtr __ldz, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgglse_(IntPtr __m, IntPtr __n, IntPtr __p, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb, FloatPtr __c__, FloatPtr __d__, FloatPtr __x, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggqrf_(IntPtr __n, IntPtr __m, IntPtr __p, FloatPtr __a, IntPtr __lda, FloatPtr __taua,
            FloatPtr __b, IntPtr __ldb, FloatPtr __taub, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggrqf_(IntPtr __m, IntPtr __p, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __taua,
            FloatPtr __b, IntPtr __ldb, FloatPtr __taub, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggsvd_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __n, IntPtr __p,
            IntPtr __k, IntPtr __l, FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __alpha,
            FloatPtr __beta, FloatPtr __u, IntPtr __ldu, FloatPtr __v, IntPtr __ldv, FloatPtr __q, IntPtr __ldq,
            FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sggsvp_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __tola, FloatPtr __tolb, IntPtr __k,
            IntPtr __l, FloatPtr __u, IntPtr __ldu, FloatPtr __v, IntPtr __ldv, FloatPtr __q, IntPtr __ldq,
            IntPtr __iwork, FloatPtr __tau, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgsvj0_(BytePtr __jobv, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __d__,
            FloatPtr __sva, IntPtr __mv, FloatPtr __v, IntPtr __ldv, FloatPtr __eps, FloatPtr __sfmin, FloatPtr __tol,
            IntPtr __nsweep, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgsvj1_(BytePtr __jobv, IntPtr __m, IntPtr __n, IntPtr __n1, FloatPtr __a, IntPtr __lda,
            FloatPtr __d__, FloatPtr __sva, IntPtr __mv, FloatPtr __v, IntPtr __ldv, FloatPtr __eps, FloatPtr __sfmin,
            FloatPtr __tol, IntPtr __nsweep, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgtcon_(BytePtr __norm, IntPtr __n, FloatPtr __dl, FloatPtr __d__, FloatPtr __du,
            FloatPtr __du2, IntPtr __ipiv, FloatPtr __anorm, FloatPtr __rcond, FloatPtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgtrfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __dl, FloatPtr __d__,
            FloatPtr __du, FloatPtr __dlf, FloatPtr __df, FloatPtr __duf, FloatPtr __du2, IntPtr __ipiv, FloatPtr __b,
            IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sgtsv_(IntPtr __n, IntPtr __nrhs, FloatPtr __dl, FloatPtr __d__, FloatPtr __du,
            FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgtsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __dl,
            FloatPtr __d__, FloatPtr __du, FloatPtr __dlf, FloatPtr __df, FloatPtr __duf, FloatPtr __du2, IntPtr __ipiv,
            FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgttrf_(IntPtr __n, FloatPtr __dl, FloatPtr __d__, FloatPtr __du, FloatPtr __du2,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgttrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __dl, FloatPtr __d__,
            FloatPtr __du, FloatPtr __du2, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sgtts2_(IntPtr __itrans, IntPtr __n, IntPtr __nrhs, FloatPtr __dl, FloatPtr __d__,
            FloatPtr __du, FloatPtr __du2, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int shgeqz_(BytePtr __job, BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, FloatPtr __h__, IntPtr __ldh, FloatPtr __t, IntPtr __ldt, FloatPtr __alphar,
            FloatPtr __alphai, FloatPtr __beta, FloatPtr __q, IntPtr __ldq, FloatPtr __z__, IntPtr __ldz,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int shsein_(BytePtr __side, BytePtr __eigsrc, BytePtr __initv, IntPtr __select, IntPtr __n,
            FloatPtr __h__, IntPtr __ldh, FloatPtr __wr, FloatPtr __wi, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr,
            IntPtr __ldvr, IntPtr __mm, IntPtr __m, FloatPtr __work, IntPtr __ifaill, IntPtr __ifailr, IntPtr __info);

    @Generated
    @CFunction
    public static native int shseqr_(BytePtr __job, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __h__, IntPtr __ldh, FloatPtr __wr, FloatPtr __wi, FloatPtr __z__, IntPtr __ldz, FloatPtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sisnan_(FloatPtr __sin__);

    @Generated
    @CFunction
    public static native int slabad_(FloatPtr __small, FloatPtr __large);

    @Generated
    @CFunction
    public static native int slabrd_(IntPtr __m, IntPtr __n, IntPtr __nb, FloatPtr __a, IntPtr __lda, FloatPtr __d__,
            FloatPtr __e, FloatPtr __tauq, FloatPtr __taup, FloatPtr __x, IntPtr __ldx, FloatPtr __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int slacn2_(IntPtr __n, FloatPtr __v, FloatPtr __x, IntPtr __isgn, FloatPtr __est,
            IntPtr __kase, IntPtr __isave);

    @Generated
    @CFunction
    public static native int slacon_(IntPtr __n, FloatPtr __v, FloatPtr __x, IntPtr __isgn, FloatPtr __est,
            IntPtr __kase);

    @Generated
    @CFunction
    public static native int slacpy_(BytePtr __uplo, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb);

    @Generated
    @CFunction
    public static native int sladiv_(FloatPtr __a, FloatPtr __b, FloatPtr __c__, FloatPtr __d__, FloatPtr __p,
            FloatPtr __q);

    @Generated
    @CFunction
    public static native int slae2_(FloatPtr __a, FloatPtr __b, FloatPtr __c__, FloatPtr __rt1, FloatPtr __rt2);

    @Generated
    @CFunction
    public static native int slaebz_(IntPtr __ijob, IntPtr __nitmax, IntPtr __n, IntPtr __mmax, IntPtr __minp,
            IntPtr __nbmin, FloatPtr __abstol, FloatPtr __reltol, FloatPtr __pivmin, FloatPtr __d__, FloatPtr __e,
            FloatPtr __e2, IntPtr __nval, FloatPtr __ab, FloatPtr __c__, IntPtr __mout, IntPtr __nab, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed0_(IntPtr __icompq, IntPtr __qsiz, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __q, IntPtr __ldq, FloatPtr __qstore, IntPtr __ldqs, FloatPtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed1_(IntPtr __n, FloatPtr __d__, FloatPtr __q, IntPtr __ldq, IntPtr __indxq,
            FloatPtr __rho, IntPtr __cutpnt, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed2_(IntPtr __k, IntPtr __n, IntPtr __n1, FloatPtr __d__, FloatPtr __q, IntPtr __ldq,
            IntPtr __indxq, FloatPtr __rho, FloatPtr __z__, FloatPtr __dlamda, FloatPtr __w, FloatPtr __q2,
            IntPtr __indx, IntPtr __indxc, IntPtr __indxp, IntPtr __coltyp, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed3_(IntPtr __k, IntPtr __n, IntPtr __n1, FloatPtr __d__, FloatPtr __q, IntPtr __ldq,
            FloatPtr __rho, FloatPtr __dlamda, FloatPtr __q2, IntPtr __indx, IntPtr __ctot, FloatPtr __w, FloatPtr __s,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed4_(IntPtr __n, IntPtr __i__, FloatPtr __d__, FloatPtr __z__, FloatPtr __delta,
            FloatPtr __rho, FloatPtr __dlam, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed5_(IntPtr __i__, FloatPtr __d__, FloatPtr __z__, FloatPtr __delta, FloatPtr __rho,
            FloatPtr __dlam);

    @Generated
    @CFunction
    public static native int slaed6_(IntPtr __kniter, IntPtr __orgati, FloatPtr __rho, FloatPtr __d__, FloatPtr __z__,
            FloatPtr __finit, FloatPtr __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed7_(IntPtr __icompq, IntPtr __n, IntPtr __qsiz, IntPtr __tlvls, IntPtr __curlvl,
            IntPtr __curpbm, FloatPtr __d__, FloatPtr __q, IntPtr __ldq, IntPtr __indxq, FloatPtr __rho,
            IntPtr __cutpnt, FloatPtr __qstore, IntPtr __qptr, IntPtr __prmptr, IntPtr __perm, IntPtr __givptr,
            IntPtr __givcol, FloatPtr __givnum, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed8_(IntPtr __icompq, IntPtr __k, IntPtr __n, IntPtr __qsiz, FloatPtr __d__,
            FloatPtr __q, IntPtr __ldq, IntPtr __indxq, FloatPtr __rho, IntPtr __cutpnt, FloatPtr __z__,
            FloatPtr __dlamda, FloatPtr __q2, IntPtr __ldq2, FloatPtr __w, IntPtr __perm, IntPtr __givptr,
            IntPtr __givcol, FloatPtr __givnum, IntPtr __indxp, IntPtr __indx, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaed9_(IntPtr __k, IntPtr __kstart, IntPtr __kstop, IntPtr __n, FloatPtr __d__,
            FloatPtr __q, IntPtr __ldq, FloatPtr __rho, FloatPtr __dlamda, FloatPtr __w, FloatPtr __s, IntPtr __lds,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slaeda_(IntPtr __n, IntPtr __tlvls, IntPtr __curlvl, IntPtr __curpbm, IntPtr __prmptr,
            IntPtr __perm, IntPtr __givptr, IntPtr __givcol, FloatPtr __givnum, FloatPtr __q, IntPtr __qptr,
            FloatPtr __z__, FloatPtr __ztemp, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaein_(IntPtr __rightv, IntPtr __noinit, IntPtr __n, FloatPtr __h__, IntPtr __ldh,
            FloatPtr __wr, FloatPtr __wi, FloatPtr __vr, FloatPtr __vi, FloatPtr __b, IntPtr __ldb, FloatPtr __work,
            FloatPtr __eps3, FloatPtr __smlnum, FloatPtr __bignum, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaev2_(FloatPtr __a, FloatPtr __b, FloatPtr __c__, FloatPtr __rt1, FloatPtr __rt2,
            FloatPtr __cs1, FloatPtr __sn1);

    @Generated
    @CFunction
    public static native int slaexc_(IntPtr __wantq, IntPtr __n, FloatPtr __t, IntPtr __ldt, FloatPtr __q, IntPtr __ldq,
            IntPtr __j1, IntPtr __n1, IntPtr __n2, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int slag2_(FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __safmin,
            FloatPtr __scale1, FloatPtr __scale2, FloatPtr __wr1, FloatPtr __wr2, FloatPtr __wi);

    @Generated
    @CFunction
    public static native int slag2d_(IntPtr __m, IntPtr __n, FloatPtr __sa, IntPtr __ldsa, DoublePtr __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slags2_(IntPtr __upper, FloatPtr __a1, FloatPtr __a2, FloatPtr __a3, FloatPtr __b1,
            FloatPtr __b2, FloatPtr __b3, FloatPtr __csu, FloatPtr __snu, FloatPtr __csv, FloatPtr __snv,
            FloatPtr __csq, FloatPtr __snq);

    @Generated
    @CFunction
    public static native int slagtf_(IntPtr __n, FloatPtr __a, FloatPtr __lambda, FloatPtr __b, FloatPtr __c__,
            FloatPtr __tol, FloatPtr __d__, IntPtr __in, IntPtr __info);

    @Generated
    @CFunction
    public static native int slagtm_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, FloatPtr __alpha, FloatPtr __dl,
            FloatPtr __d__, FloatPtr __du, FloatPtr __x, IntPtr __ldx, FloatPtr __beta, FloatPtr __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int slagts_(IntPtr __job, IntPtr __n, FloatPtr __a, FloatPtr __b, FloatPtr __c__,
            FloatPtr __d__, IntPtr __in, FloatPtr __y, FloatPtr __tol, IntPtr __info);

    @Generated
    @CFunction
    public static native int slagv2_(FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __alphar,
            FloatPtr __alphai, FloatPtr __beta, FloatPtr __csl, FloatPtr __snl, FloatPtr __csr, FloatPtr __snr);

    @Generated
    @CFunction
    public static native int slahqr_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __h__, IntPtr __ldh, FloatPtr __wr, FloatPtr __wi, IntPtr __iloz, IntPtr __ihiz, FloatPtr __z__,
            IntPtr __ldz, IntPtr __info);

    @Generated
    @CFunction
    public static native int slahr2_(IntPtr __n, IntPtr __k, IntPtr __nb, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __t, IntPtr __ldt, FloatPtr __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int slahrd_(IntPtr __n, IntPtr __k, IntPtr __nb, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __t, IntPtr __ldt, FloatPtr __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int slaic1_(IntPtr __job, IntPtr __j, FloatPtr __x, FloatPtr __sest, FloatPtr __w,
            FloatPtr __gamma, FloatPtr __sestpr, FloatPtr __s, FloatPtr __c__);

    @Generated
    @CFunction
    public static native int slaisnan_(FloatPtr __sin1, FloatPtr __sin2);

    @Generated
    @CFunction
    public static native int slaln2_(IntPtr __ltrans, IntPtr __na, IntPtr __nw, FloatPtr __smin, FloatPtr __ca,
            FloatPtr __a, IntPtr __lda, FloatPtr __d1, FloatPtr __d2, FloatPtr __b, IntPtr __ldb, FloatPtr __wr,
            FloatPtr __wi, FloatPtr __x, IntPtr __ldx, FloatPtr __scale, FloatPtr __xnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int slals0_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __nrhs,
            FloatPtr __b, IntPtr __ldb, FloatPtr __bx, IntPtr __ldbx, IntPtr __perm, IntPtr __givptr, IntPtr __givcol,
            IntPtr __ldgcol, FloatPtr __givnum, IntPtr __ldgnum, FloatPtr __poles, FloatPtr __difl, FloatPtr __difr,
            FloatPtr __z__, IntPtr __k, FloatPtr __c__, FloatPtr __s, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int slalsa_(IntPtr __icompq, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs, FloatPtr __b,
            IntPtr __ldb, FloatPtr __bx, IntPtr __ldbx, FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __k,
            FloatPtr __difl, FloatPtr __difr, FloatPtr __z__, FloatPtr __poles, IntPtr __givptr, IntPtr __givcol,
            IntPtr __ldgcol, IntPtr __perm, FloatPtr __givnum, FloatPtr __c__, FloatPtr __s, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slalsd_(BytePtr __uplo, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs, FloatPtr __d__,
            FloatPtr __e, FloatPtr __b, IntPtr __ldb, FloatPtr __rcond, IntPtr __rank, FloatPtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slamrg_(IntPtr __n1, IntPtr __n2, FloatPtr __a, IntPtr __strd1, IntPtr __strd2,
            IntPtr __index);

    @Generated
    @CFunction
    public static native int slaneg_(IntPtr __n, FloatPtr __d__, FloatPtr __lld, FloatPtr __sigma, FloatPtr __pivmin,
            IntPtr __r__);

    @Generated
    @CFunction
    public static native double slangb_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __work);

    @Generated
    @CFunction
    public static native double slange_(BytePtr __norm, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double slangt_(BytePtr __norm, IntPtr __n, FloatPtr __dl, FloatPtr __d__, FloatPtr __du);

    @Generated
    @CFunction
    public static native double slanhs_(BytePtr __norm, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __work);

    @Generated
    @CFunction
    public static native double slansb_(BytePtr __norm, BytePtr __uplo, IntPtr __n, IntPtr __k, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __work);

    @Generated
    @CFunction
    public static native double slansf_(BytePtr __norm, BytePtr __transr, BytePtr __uplo, IntPtr __n, FloatPtr __a,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double slansp_(BytePtr __norm, BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __work);

    @Generated
    @CFunction
    public static native double slanst_(BytePtr __norm, IntPtr __n, FloatPtr __d__, FloatPtr __e);

    @Generated
    @CFunction
    public static native double slansy_(BytePtr __norm, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double slantb_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __k,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __work);

    @Generated
    @CFunction
    public static native double slantp_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, FloatPtr __ap,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native double slantr_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __m, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slanv2_(FloatPtr __a, FloatPtr __b, FloatPtr __c__, FloatPtr __d__, FloatPtr __rt1r,
            FloatPtr __rt1i, FloatPtr __rt2r, FloatPtr __rt2i, FloatPtr __cs, FloatPtr __sn);

    @Generated
    @CFunction
    public static native int slapll_(IntPtr __n, FloatPtr __x, IntPtr __incx, FloatPtr __y, IntPtr __incy,
            FloatPtr __ssmin);

    @Generated
    @CFunction
    public static native int slapmt_(IntPtr __forwrd, IntPtr __m, IntPtr __n, FloatPtr __x, IntPtr __ldx, IntPtr __k);

    @Generated
    @CFunction
    public static native double slapy2_(FloatPtr __x, FloatPtr __y);

    @Generated
    @CFunction
    public static native double slapy3_(FloatPtr __x, FloatPtr __y, FloatPtr __z__);

    @Generated
    @CFunction
    public static native int slaqgb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku, FloatPtr __ab, IntPtr __ldab,
            FloatPtr __r__, FloatPtr __c__, FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int slaqge_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __r__, FloatPtr __c__,
            FloatPtr __rowcnd, FloatPtr __colcnd, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int slaqp2_(IntPtr __m, IntPtr __n, IntPtr __offset, FloatPtr __a, IntPtr __lda, IntPtr __jpvt,
            FloatPtr __tau, FloatPtr __vn1, FloatPtr __vn2, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slaqps_(IntPtr __m, IntPtr __n, IntPtr __offset, IntPtr __nb, IntPtr __kb, FloatPtr __a,
            IntPtr __lda, IntPtr __jpvt, FloatPtr __tau, FloatPtr __vn1, FloatPtr __vn2, FloatPtr __auxv, FloatPtr __f,
            IntPtr __ldf);

    @Generated
    @CFunction
    public static native int slaqr0_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __h__, IntPtr __ldh, FloatPtr __wr, FloatPtr __wi, IntPtr __iloz, IntPtr __ihiz, FloatPtr __z__,
            IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaqr1_(IntPtr __n, FloatPtr __h__, IntPtr __ldh, FloatPtr __sr1, FloatPtr __si1,
            FloatPtr __sr2, FloatPtr __si2, FloatPtr __v);

    @Generated
    @CFunction
    public static native int slaqr2_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, FloatPtr __h__, IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz, FloatPtr __z__, IntPtr __ldz,
            IntPtr __ns, IntPtr __nd, FloatPtr __sr, FloatPtr __si, FloatPtr __v, IntPtr __ldv, IntPtr __nh,
            FloatPtr __t, IntPtr __ldt, IntPtr __nv, FloatPtr __wv, IntPtr __ldwv, FloatPtr __work, IntPtr __lwork);

    @Generated
    @CFunction
    public static native int slaqr3_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, FloatPtr __h__, IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz, FloatPtr __z__, IntPtr __ldz,
            IntPtr __ns, IntPtr __nd, FloatPtr __sr, FloatPtr __si, FloatPtr __v, IntPtr __ldv, IntPtr __nh,
            FloatPtr __t, IntPtr __ldt, IntPtr __nv, FloatPtr __wv, IntPtr __ldwv, FloatPtr __work, IntPtr __lwork);

    @Generated
    @CFunction
    public static native int slaqr4_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            FloatPtr __h__, IntPtr __ldh, FloatPtr __wr, FloatPtr __wi, IntPtr __iloz, IntPtr __ihiz, FloatPtr __z__,
            IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slaqr5_(IntPtr __wantt, IntPtr __wantz, IntPtr __kacc22, IntPtr __n, IntPtr __ktop,
            IntPtr __kbot, IntPtr __nshfts, FloatPtr __sr, FloatPtr __si, FloatPtr __h__, IntPtr __ldh, IntPtr __iloz,
            IntPtr __ihiz, FloatPtr __z__, IntPtr __ldz, FloatPtr __v, IntPtr __ldv, FloatPtr __u, IntPtr __ldu,
            IntPtr __nv, FloatPtr __wv, IntPtr __ldwv, IntPtr __nh, FloatPtr __wh, IntPtr __ldwh);

    @Generated
    @CFunction
    public static native int slaqsb_(BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab, IntPtr __ldab,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int slaqsp_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __s, FloatPtr __scond,
            FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int slaqsy_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __s,
            FloatPtr __scond, FloatPtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int slaqtr_(IntPtr __ltran, IntPtr __l__CLPK_real, IntPtr __n, FloatPtr __t, IntPtr __ldt,
            FloatPtr __b, FloatPtr __w, FloatPtr __scale, FloatPtr __x, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int slar1v_(IntPtr __n, IntPtr __b1, IntPtr __bn, FloatPtr __lambda, FloatPtr __d__,
            FloatPtr __l, FloatPtr __ld, FloatPtr __lld, FloatPtr __pivmin, FloatPtr __gaptol, FloatPtr __z__,
            IntPtr __wantnc, IntPtr __negcnt, FloatPtr __ztz, FloatPtr __mingma, IntPtr __r__, IntPtr __isuppz,
            FloatPtr __nrminv, FloatPtr __resid, FloatPtr __rqcorr, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slar2v_(IntPtr __n, FloatPtr __x, FloatPtr __y, FloatPtr __z__, IntPtr __incx,
            FloatPtr __c__, FloatPtr __s, IntPtr __incc);

    @Generated
    @CFunction
    public static native int slarf_(BytePtr __side, IntPtr __m, IntPtr __n, FloatPtr __v, IntPtr __incv, FloatPtr __tau,
            FloatPtr __c__, IntPtr __ldc, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slarfb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k, FloatPtr __v, IntPtr __ldv, FloatPtr __t, IntPtr __ldt, FloatPtr __c__,
            IntPtr __ldc, FloatPtr __work, IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int slarfg_(IntPtr __n, FloatPtr __alpha, FloatPtr __x, IntPtr __incx, FloatPtr __tau);

    @Generated
    @CFunction
    public static native int slarfp_(IntPtr __n, FloatPtr __alpha, FloatPtr __x, IntPtr __incx, FloatPtr __tau);

    @Generated
    @CFunction
    public static native int slarft_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k, FloatPtr __v,
            IntPtr __ldv, FloatPtr __tau, FloatPtr __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int slarfx_(BytePtr __side, IntPtr __m, IntPtr __n, FloatPtr __v, FloatPtr __tau,
            FloatPtr __c__, IntPtr __ldc, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slargv_(IntPtr __n, FloatPtr __x, IntPtr __incx, FloatPtr __y, IntPtr __incy,
            FloatPtr __c__, IntPtr __incc);

    @Generated
    @CFunction
    public static native int slarnv_(IntPtr __idist, IntPtr __iseed, IntPtr __n, FloatPtr __x);

    @Generated
    @CFunction
    public static native int slarra_(IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __e2, FloatPtr __spltol,
            FloatPtr __tnrm, IntPtr __nsplit, IntPtr __isplit, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrb_(IntPtr __n, FloatPtr __d__, FloatPtr __lld, IntPtr __ifirst, IntPtr __ilast,
            FloatPtr __rtol1, FloatPtr __rtol2, IntPtr __offset, FloatPtr __w, FloatPtr __wgap, FloatPtr __werr,
            FloatPtr __work, IntPtr __iwork, FloatPtr __pivmin, FloatPtr __spdiam, IntPtr __twist, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrc_(BytePtr __jobt, IntPtr __n, FloatPtr __vl, FloatPtr __vu, FloatPtr __d__,
            FloatPtr __e, FloatPtr __pivmin, IntPtr __eigcnt, IntPtr __lcnt, IntPtr __rcnt, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrd_(BytePtr __range, BytePtr __order, IntPtr __n, FloatPtr __vl, FloatPtr __vu,
            IntPtr __il, IntPtr __iu, FloatPtr __gers, FloatPtr __reltol, FloatPtr __d__, FloatPtr __e, FloatPtr __e2,
            FloatPtr __pivmin, IntPtr __nsplit, IntPtr __isplit, IntPtr __m, FloatPtr __w, FloatPtr __werr,
            FloatPtr __wl, FloatPtr __wu, IntPtr __iblock, IntPtr __indexw, FloatPtr __work, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slarre_(BytePtr __range, IntPtr __n, FloatPtr __vl, FloatPtr __vu, IntPtr __il,
            IntPtr __iu, FloatPtr __d__, FloatPtr __e, FloatPtr __e2, FloatPtr __rtol1, FloatPtr __rtol2,
            FloatPtr __spltol, IntPtr __nsplit, IntPtr __isplit, IntPtr __m, FloatPtr __w, FloatPtr __werr,
            FloatPtr __wgap, IntPtr __iblock, IntPtr __indexw, FloatPtr __gers, FloatPtr __pivmin, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrf_(IntPtr __n, FloatPtr __d__, FloatPtr __l, FloatPtr __ld, IntPtr __clstrt,
            IntPtr __clend, FloatPtr __w, FloatPtr __wgap, FloatPtr __werr, FloatPtr __spdiam, FloatPtr __clgapl,
            FloatPtr __clgapr, FloatPtr __pivmin, FloatPtr __sigma, FloatPtr __dplus, FloatPtr __lplus, FloatPtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrj_(IntPtr __n, FloatPtr __d__, FloatPtr __e2, IntPtr __ifirst, IntPtr __ilast,
            FloatPtr __rtol, IntPtr __offset, FloatPtr __w, FloatPtr __werr, FloatPtr __work, IntPtr __iwork,
            FloatPtr __pivmin, FloatPtr __spdiam, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrk_(IntPtr __n, IntPtr __iw, FloatPtr __gl, FloatPtr __gu, FloatPtr __d__,
            FloatPtr __e2, FloatPtr __pivmin, FloatPtr __reltol, FloatPtr __w, FloatPtr __werr, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrr_(IntPtr __n, FloatPtr __d__, FloatPtr __e, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarrv_(IntPtr __n, FloatPtr __vl, FloatPtr __vu, FloatPtr __d__, FloatPtr __l,
            FloatPtr __pivmin, IntPtr __isplit, IntPtr __m, IntPtr __dol, IntPtr __dou, FloatPtr __minrgp,
            FloatPtr __rtol1, FloatPtr __rtol2, FloatPtr __w, FloatPtr __werr, FloatPtr __wgap, IntPtr __iblock,
            IntPtr __indexw, FloatPtr __gers, FloatPtr __z__, IntPtr __ldz, IntPtr __isuppz, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slarscl2_(IntPtr __m, IntPtr __n, FloatPtr __d__, FloatPtr __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int slartg_(FloatPtr __f, FloatPtr __g, FloatPtr __cs, FloatPtr __sn, FloatPtr __r__);

    @Generated
    @CFunction
    public static native int slartv_(IntPtr __n, FloatPtr __x, IntPtr __incx, FloatPtr __y, IntPtr __incy,
            FloatPtr __c__, FloatPtr __s, IntPtr __incc);

    @Generated
    @CFunction
    public static native int slaruv_(IntPtr __iseed, IntPtr __n, FloatPtr __x);

    @Generated
    @CFunction
    public static native int slarz_(BytePtr __side, IntPtr __m, IntPtr __n, IntPtr __l, FloatPtr __v, IntPtr __incv,
            FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slarzb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k, IntPtr __l, FloatPtr __v, IntPtr __ldv, FloatPtr __t, IntPtr __ldt, FloatPtr __c__,
            IntPtr __ldc, FloatPtr __work, IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int slarzt_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k, FloatPtr __v,
            IntPtr __ldv, FloatPtr __tau, FloatPtr __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int slas2_(FloatPtr __f, FloatPtr __g, FloatPtr __h__, FloatPtr __ssmin, FloatPtr __ssmax);

    @Generated
    @CFunction
    public static native int slascl_(BytePtr __type__, IntPtr __kl, IntPtr __ku, FloatPtr __cfrom, FloatPtr __cto,
            IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int slascl2_(IntPtr __m, IntPtr __n, FloatPtr __d__, FloatPtr __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int slasd0_(IntPtr __n, IntPtr __sqre, FloatPtr __d__, FloatPtr __e, FloatPtr __u,
            IntPtr __ldu, FloatPtr __vt, IntPtr __ldvt, IntPtr __smlsiz, IntPtr __iwork, FloatPtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slasd1_(IntPtr __nl, IntPtr __nr, IntPtr __sqre, FloatPtr __d__, FloatPtr __alpha,
            FloatPtr __beta, FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __ldvt, IntPtr __idxq, IntPtr __iwork,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasd2_(IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __k, FloatPtr __d__,
            FloatPtr __z__, FloatPtr __alpha, FloatPtr __beta, FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __ldvt,
            FloatPtr __dsigma, FloatPtr __u2, IntPtr __ldu2, FloatPtr __vt2, IntPtr __ldvt2, IntPtr __idxp,
            IntPtr __idx, IntPtr __idxc, IntPtr __idxq, IntPtr __coltyp, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasd3_(IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __k, FloatPtr __d__, FloatPtr __q,
            IntPtr __ldq, FloatPtr __dsigma, FloatPtr __u, IntPtr __ldu, FloatPtr __u2, IntPtr __ldu2, FloatPtr __vt,
            IntPtr __ldvt, FloatPtr __vt2, IntPtr __ldvt2, IntPtr __idxc, IntPtr __ctot, FloatPtr __z__, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasd4_(IntPtr __n, IntPtr __i__, FloatPtr __d__, FloatPtr __z__, FloatPtr __delta,
            FloatPtr __rho, FloatPtr __sigma, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasd5_(IntPtr __i__, FloatPtr __d__, FloatPtr __z__, FloatPtr __delta, FloatPtr __rho,
            FloatPtr __dsigma, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slasd6_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, FloatPtr __d__,
            FloatPtr __vf, FloatPtr __vl, FloatPtr __alpha, FloatPtr __beta, IntPtr __idxq, IntPtr __perm,
            IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, FloatPtr __givnum, IntPtr __ldgnum, FloatPtr __poles,
            FloatPtr __difl, FloatPtr __difr, FloatPtr __z__, IntPtr __k, FloatPtr __c__, FloatPtr __s, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasd7_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __k,
            FloatPtr __d__, FloatPtr __z__, FloatPtr __zw, FloatPtr __vf, FloatPtr __vfw, FloatPtr __vl, FloatPtr __vlw,
            FloatPtr __alpha, FloatPtr __beta, FloatPtr __dsigma, IntPtr __idx, IntPtr __idxp, IntPtr __idxq,
            IntPtr __perm, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, FloatPtr __givnum, IntPtr __ldgnum,
            FloatPtr __c__, FloatPtr __s, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasd8_(IntPtr __icompq, IntPtr __k, FloatPtr __d__, FloatPtr __z__, FloatPtr __vf,
            FloatPtr __vl, FloatPtr __difl, FloatPtr __difr, IntPtr __lddifr, FloatPtr __dsigma, FloatPtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int slasda_(IntPtr __icompq, IntPtr __smlsiz, IntPtr __n, IntPtr __sqre, FloatPtr __d__,
            FloatPtr __e, FloatPtr __u, IntPtr __ldu, FloatPtr __vt, IntPtr __k, FloatPtr __difl, FloatPtr __difr,
            FloatPtr __z__, FloatPtr __poles, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, IntPtr __perm,
            FloatPtr __givnum, FloatPtr __c__, FloatPtr __s, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasdq_(BytePtr __uplo, IntPtr __sqre, IntPtr __n, IntPtr __ncvt, IntPtr __nru,
            IntPtr __ncc, FloatPtr __d__, FloatPtr __e, FloatPtr __vt, IntPtr __ldvt, FloatPtr __u, IntPtr __ldu,
            FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasdt_(IntPtr __n, IntPtr __lvl, IntPtr __nd, IntPtr __inode, IntPtr __ndiml,
            IntPtr __ndimr, IntPtr __msub);

    @Generated
    @CFunction
    public static native int slaset_(BytePtr __uplo, IntPtr __m, IntPtr __n, FloatPtr __alpha, FloatPtr __beta,
            FloatPtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int slasq1_(IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasq2_(IntPtr __n, FloatPtr __z__, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasq3_(IntPtr __i0, IntPtr __n0, FloatPtr __z__, IntPtr __pp, FloatPtr __dmin__,
            FloatPtr __sigma, FloatPtr __desig, FloatPtr __qmax, IntPtr __nfail, IntPtr __iter, IntPtr __ndiv,
            IntPtr __ieee, IntPtr __ttype, FloatPtr __dmin1, FloatPtr __dmin2, FloatPtr __dn, FloatPtr __dn1,
            FloatPtr __dn2, FloatPtr __g, FloatPtr __tau);

    @Generated
    @CFunction
    public static native int slasq4_(IntPtr __i0, IntPtr __n0, FloatPtr __z__, IntPtr __pp, IntPtr __n0in,
            FloatPtr __dmin__, FloatPtr __dmin1, FloatPtr __dmin2, FloatPtr __dn, FloatPtr __dn1, FloatPtr __dn2,
            FloatPtr __tau, IntPtr __ttype, FloatPtr __g);

    @Generated
    @CFunction
    public static native int slasq5_(IntPtr __i0, IntPtr __n0, FloatPtr __z__, IntPtr __pp, FloatPtr __tau,
            FloatPtr __dmin__, FloatPtr __dmin1, FloatPtr __dmin2, FloatPtr __dn, FloatPtr __dnm1, FloatPtr __dnm2,
            IntPtr __ieee);

    @Generated
    @CFunction
    public static native int slasq6_(IntPtr __i0, IntPtr __n0, FloatPtr __z__, IntPtr __pp, FloatPtr __dmin__,
            FloatPtr __dmin1, FloatPtr __dmin2, FloatPtr __dn, FloatPtr __dnm1, FloatPtr __dnm2);

    @Generated
    @CFunction
    public static native int slasr_(BytePtr __side, BytePtr __pivot, BytePtr __direct, IntPtr __m, IntPtr __n,
            FloatPtr __c__, FloatPtr __s, FloatPtr __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int slasrt_(BytePtr __id, IntPtr __n, FloatPtr __d__, IntPtr __info);

    @Generated
    @CFunction
    public static native int slassq_(IntPtr __n, FloatPtr __x, IntPtr __incx, FloatPtr __scale, FloatPtr __sumsq);

    @Generated
    @CFunction
    public static native int slasv2_(FloatPtr __f, FloatPtr __g, FloatPtr __h__, FloatPtr __ssmin, FloatPtr __ssmax,
            FloatPtr __snr, FloatPtr __csr, FloatPtr __snl, FloatPtr __csl);

    @Generated
    @CFunction
    public static native int slaswp_(IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __k1, IntPtr __k2, IntPtr __ipiv,
            IntPtr __incx);

    @Generated
    @CFunction
    public static native int slasy2_(IntPtr __ltranl, IntPtr __ltranr, IntPtr __isgn, IntPtr __n1, IntPtr __n2,
            FloatPtr __tl, IntPtr __ldtl, FloatPtr __tr, IntPtr __ldtr, FloatPtr __b, IntPtr __ldb, FloatPtr __scale,
            FloatPtr __x, IntPtr __ldx, FloatPtr __xnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int slasyf_(BytePtr __uplo, IntPtr __n, IntPtr __nb, IntPtr __kb, FloatPtr __a, IntPtr __lda,
            IntPtr __ipiv, FloatPtr __w, IntPtr __ldw, IntPtr __info);

    @Generated
    @CFunction
    public static native int slatbs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            IntPtr __kd, FloatPtr __ab, IntPtr __ldab, FloatPtr __x, FloatPtr __scale, FloatPtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int slatdf_(IntPtr __ijob, IntPtr __n, FloatPtr __z__, IntPtr __ldz, FloatPtr __rhs,
            FloatPtr __rdsum, FloatPtr __rdscal, IntPtr __ipiv, IntPtr __jpiv);

    @Generated
    @CFunction
    public static native int slatps_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            FloatPtr __ap, FloatPtr __x, FloatPtr __scale, FloatPtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int slatrd_(BytePtr __uplo, IntPtr __n, IntPtr __nb, FloatPtr __a, IntPtr __lda, FloatPtr __e,
            FloatPtr __tau, FloatPtr __w, IntPtr __ldw);

    @Generated
    @CFunction
    public static native int slatrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __x, FloatPtr __scale, FloatPtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int slatrz_(IntPtr __m, IntPtr __n, IntPtr __l, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work);

    @Generated
    @CFunction
    public static native int slatzm_(BytePtr __side, IntPtr __m, IntPtr __n, FloatPtr __v, IntPtr __incv,
            FloatPtr __tau, FloatPtr __c1, FloatPtr __c2, IntPtr __ldc, FloatPtr __work);

    @Generated
    @CFunction
    public static native int slauu2_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int slauum_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int sopgtr_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __tau, FloatPtr __q,
            IntPtr __ldq, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sopmtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            FloatPtr __ap, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorg2l_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorg2r_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorgbr_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda,
            FloatPtr __tau, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorghr_(IntPtr __n, IntPtr __ilo, IntPtr __ihi, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorgl2_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorglq_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorgql_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorgqr_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorgr2_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorgrq_(IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorgtr_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorm2l_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorm2r_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormbr_(BytePtr __vect, BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n,
            IntPtr __k, FloatPtr __a, IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormhr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, FloatPtr __a, IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sorml2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormlq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormql_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormqr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormr2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormr3_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            FloatPtr __a, IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormrq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, FloatPtr __a,
            IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sormrz_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            FloatPtr __a, IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sormtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __tau, FloatPtr __c__, IntPtr __ldc, FloatPtr __work, IntPtr __lwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int spbcon_(BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab, IntPtr __ldab,
            FloatPtr __anorm, FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int spbequ_(BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab, IntPtr __ldab,
            FloatPtr __s, FloatPtr __scond, FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int spbrfs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __afb, IntPtr __ldafb, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int spbstf_(BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int spbsv_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int spbsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __afb, IntPtr __ldafb, BytePtr __equed, FloatPtr __s, FloatPtr __b,
            IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr,
            FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int spbtf2_(BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int spbtrf_(BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab, IntPtr __ldab,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int spbtrs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int spftrf_(BytePtr __transr, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __info);

    @Generated
    @CFunction
    public static native int spftri_(BytePtr __transr, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __info);

    @Generated
    @CFunction
    public static native int spftrs_(BytePtr __transr, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a,
            FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int spocon_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __anorm,
            FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int spoequ_(IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __s, FloatPtr __scond,
            FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int spoequb_(IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __s, FloatPtr __scond,
            FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int sporfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            FloatPtr __af, IntPtr __ldaf, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __ferr,
            FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sposv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda, FloatPtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sposvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a,
            IntPtr __lda, FloatPtr __af, IntPtr __ldaf, BytePtr __equed, FloatPtr __s, FloatPtr __b, IntPtr __ldb,
            FloatPtr __x, IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int spotf2_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int spotrf_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int spotri_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int spotrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sppcon_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __anorm, FloatPtr __rcond,
            FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sppequ_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __s, FloatPtr __scond,
            FloatPtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int spprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap, FloatPtr __afp,
            FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr, FloatPtr __work,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sppsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap, FloatPtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sppsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap,
            FloatPtr __afp, BytePtr __equed, FloatPtr __s, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx,
            FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int spptrf_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int spptri_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int spptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap, FloatPtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int spstf2_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __piv,
            IntPtr __rank, FloatPtr __tol, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int spstrf_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __piv,
            IntPtr __rank, FloatPtr __tol, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sptcon_(IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __anorm, FloatPtr __rcond,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int spteqr_(BytePtr __compz, IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __z__,
            IntPtr __ldz, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sptrfs_(IntPtr __n, IntPtr __nrhs, FloatPtr __d__, FloatPtr __e, FloatPtr __df,
            FloatPtr __ef, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sptsv_(IntPtr __n, IntPtr __nrhs, FloatPtr __d__, FloatPtr __e, FloatPtr __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sptsvx_(BytePtr __fact, IntPtr __n, IntPtr __nrhs, FloatPtr __d__, FloatPtr __e,
            FloatPtr __df, FloatPtr __ef, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __rcond,
            FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int spttrf_(IntPtr __n, FloatPtr __d__, FloatPtr __e, IntPtr __info);

    @Generated
    @CFunction
    public static native int spttrs_(IntPtr __n, IntPtr __nrhs, FloatPtr __d__, FloatPtr __e, FloatPtr __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sptts2_(IntPtr __n, IntPtr __nrhs, FloatPtr __d__, FloatPtr __e, FloatPtr __b,
            IntPtr __ldb);

    @Generated
    @CFunction
    public static native int srscl_(IntPtr __n, FloatPtr __sa, FloatPtr __sx, IntPtr __incx);

    @Generated
    @CFunction
    public static native int ssbev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssbevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssbevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __q, IntPtr __ldq, FloatPtr __vl, FloatPtr __vu, IntPtr __il,
            IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work,
            IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssbgst_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __bb, IntPtr __ldbb, FloatPtr __x, IntPtr __ldx, FloatPtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ssbgv_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __bb, IntPtr __ldbb, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ssbgvd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __bb, IntPtr __ldbb, FloatPtr __w, FloatPtr __z__, IntPtr __ldz,
            FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssbgvx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __ka,
            IntPtr __kb, FloatPtr __ab, IntPtr __ldab, FloatPtr __bb, IntPtr __ldbb, FloatPtr __q, IntPtr __ldq,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssbtrd_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __kd, FloatPtr __ab,
            IntPtr __ldab, FloatPtr __d__, FloatPtr __e, FloatPtr __q, IntPtr __ldq, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssfrk_(BytePtr __transr, BytePtr __uplo, BytePtr __trans, IntPtr __n, IntPtr __k,
            FloatPtr __alpha, FloatPtr __a, IntPtr __lda, FloatPtr __beta, FloatPtr __c__);

    @Generated
    @CFunction
    public static native int sspcon_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, IntPtr __ipiv, FloatPtr __anorm,
            FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sspev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __w,
            FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sspevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __w,
            FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sspevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, FloatPtr __ap,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int sspgst_(IntPtr __itype, BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __bp,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int sspgv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __ap,
            FloatPtr __bp, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sspgvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __ap,
            FloatPtr __bp, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sspgvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            FloatPtr __ap, FloatPtr __bp, FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol,
            IntPtr __m, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __iwork, IntPtr __ifail,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ssprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap, FloatPtr __afp,
            IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sspsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap, IntPtr __ipiv,
            FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sspsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap,
            FloatPtr __afp, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __rcond,
            FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssptrd_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __d__, FloatPtr __e,
            FloatPtr __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssptrf_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssptri_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, IntPtr __ipiv, FloatPtr __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ssptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __ap, IntPtr __ipiv,
            FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstebz_(BytePtr __range, BytePtr __order, IntPtr __n, FloatPtr __vl, FloatPtr __vu,
            IntPtr __il, IntPtr __iu, FloatPtr __abstol, FloatPtr __d__, FloatPtr __e, IntPtr __m, IntPtr __nsplit,
            FloatPtr __w, IntPtr __iblock, IntPtr __isplit, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstedc_(BytePtr __compz, IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __z__,
            IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstegr_(BytePtr __jobz, BytePtr __range, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            FloatPtr __z__, IntPtr __ldz, IntPtr __isuppz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstein_(IntPtr __n, FloatPtr __d__, FloatPtr __e, IntPtr __m, FloatPtr __w,
            IntPtr __iblock, IntPtr __isplit, FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __iwork,
            IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstemr_(BytePtr __jobz, BytePtr __range, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, IntPtr __m, FloatPtr __w, FloatPtr __z__,
            IntPtr __ldz, IntPtr __nzc, IntPtr __isuppz, IntPtr __tryrac, FloatPtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssteqr_(BytePtr __compz, IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __z__,
            IntPtr __ldz, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssterf_(IntPtr __n, FloatPtr __d__, FloatPtr __e, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstev_(BytePtr __jobz, IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __z__,
            IntPtr __ldz, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstevd_(BytePtr __jobz, IntPtr __n, FloatPtr __d__, FloatPtr __e, FloatPtr __z__,
            IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstevr_(BytePtr __jobz, BytePtr __range, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            FloatPtr __z__, IntPtr __ldz, IntPtr __isuppz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int sstevx_(BytePtr __jobz, BytePtr __range, IntPtr __n, FloatPtr __d__, FloatPtr __e,
            FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w,
            FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssycon_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv,
            FloatPtr __anorm, FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssyequb_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __s,
            FloatPtr __scond, FloatPtr __amax, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssyev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __w, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssyevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __w, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssyevr_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, FloatPtr __a,
            IntPtr __lda, FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m,
            FloatPtr __w, FloatPtr __z__, IntPtr __ldz, IntPtr __isuppz, FloatPtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssyevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, FloatPtr __a,
            IntPtr __lda, FloatPtr __vl, FloatPtr __vu, IntPtr __il, IntPtr __iu, FloatPtr __abstol, IntPtr __m,
            FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __ifail,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ssygs2_(IntPtr __itype, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssygst_(IntPtr __itype, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssygv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __a,
            IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __w, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssygvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n, FloatPtr __a,
            IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __w, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssygvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __vl, FloatPtr __vu, IntPtr __il,
            IntPtr __iu, FloatPtr __abstol, IntPtr __m, FloatPtr __w, FloatPtr __z__, IntPtr __ldz, FloatPtr __work,
            IntPtr __lwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssyrfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            FloatPtr __af, IntPtr __ldaf, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssysv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssysvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a,
            IntPtr __lda, FloatPtr __af, IntPtr __ldaf, IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, FloatPtr __x,
            IntPtr __ldx, FloatPtr __rcond, FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssytd2_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __d__,
            FloatPtr __e, FloatPtr __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssytf2_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ssytrd_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __d__,
            FloatPtr __e, FloatPtr __tau, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssytrf_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssytri_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, IntPtr __ipiv,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int ssytrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, FloatPtr __a, IntPtr __lda,
            IntPtr __ipiv, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int stbcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __kd,
            FloatPtr __ab, IntPtr __ldab, FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int stbrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs, FloatPtr __ab, IntPtr __ldab, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx,
            FloatPtr __ferr, FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int stbtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs, FloatPtr __ab, IntPtr __ldab, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int stfsm_(BytePtr __transr, BytePtr __side, BytePtr __uplo, BytePtr __trans, BytePtr __diag,
            IntPtr __m, IntPtr __n, FloatPtr __alpha, FloatPtr __a, FloatPtr __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int stftri_(BytePtr __transr, BytePtr __uplo, BytePtr __diag, IntPtr __n, FloatPtr __a,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int stfttp_(BytePtr __transr, BytePtr __uplo, IntPtr __n, FloatPtr __arf, FloatPtr __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int stfttr_(BytePtr __transr, BytePtr __uplo, IntPtr __n, FloatPtr __arf, FloatPtr __a,
            IntPtr __lda, IntPtr __info);

    @Generated
    @CFunction
    public static native int stgevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n, FloatPtr __s,
            IntPtr __lds, FloatPtr __p, IntPtr __ldp, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr,
            IntPtr __mm, IntPtr __m, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int stgex2_(IntPtr __wantq, IntPtr __wantz, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __q, IntPtr __ldq, FloatPtr __z__, IntPtr __ldz, IntPtr __j1,
            IntPtr __n1, IntPtr __n2, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int stgexc_(IntPtr __wantq, IntPtr __wantz, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __q, IntPtr __ldq, FloatPtr __z__, IntPtr __ldz, IntPtr __ifst,
            IntPtr __ilst, FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int stgsen_(IntPtr __ijob, IntPtr __wantq, IntPtr __wantz, IntPtr __select, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __alphar, FloatPtr __alphai,
            FloatPtr __beta, FloatPtr __q, IntPtr __ldq, FloatPtr __z__, IntPtr __ldz, IntPtr __m, FloatPtr __pl,
            FloatPtr __pr, FloatPtr __dif, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int stgsja_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            IntPtr __k, IntPtr __l, FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __tola,
            FloatPtr __tolb, FloatPtr __alpha, FloatPtr __beta, FloatPtr __u, IntPtr __ldu, FloatPtr __v, IntPtr __ldv,
            FloatPtr __q, IntPtr __ldq, FloatPtr __work, IntPtr __ncycle, IntPtr __info);

    @Generated
    @CFunction
    public static native int stgsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n, FloatPtr __a,
            IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr,
            FloatPtr __s, FloatPtr __dif, IntPtr __mm, IntPtr __m, FloatPtr __work, IntPtr __lwork, IntPtr __iwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int stgsy2_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __c__, IntPtr __ldc, FloatPtr __d__, IntPtr __ldd, FloatPtr __e,
            IntPtr __lde, FloatPtr __f, IntPtr __ldf, FloatPtr __scale, FloatPtr __rdsum, FloatPtr __rdscal,
            IntPtr __iwork, IntPtr __pq, IntPtr __info);

    @Generated
    @CFunction
    public static native int stgsyl_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __b, IntPtr __ldb, FloatPtr __c__, IntPtr __ldc, FloatPtr __d__, IntPtr __ldd, FloatPtr __e,
            IntPtr __lde, FloatPtr __f, IntPtr __ldf, FloatPtr __scale, FloatPtr __dif, FloatPtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int stpcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, FloatPtr __ap,
            FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int stprfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            FloatPtr __ap, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __ferr, FloatPtr __berr,
            FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int stptri_(BytePtr __uplo, BytePtr __diag, IntPtr __n, FloatPtr __ap, IntPtr __info);

    @Generated
    @CFunction
    public static native int stptrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            FloatPtr __ap, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int stpttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __arf,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int stpttr_(BytePtr __uplo, IntPtr __n, FloatPtr __ap, FloatPtr __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int strcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, FloatPtr __a,
            IntPtr __lda, FloatPtr __rcond, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int strevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n, FloatPtr __t,
            IntPtr __ldt, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr, IntPtr __mm, IntPtr __m,
            FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int strexc_(BytePtr __compq, IntPtr __n, FloatPtr __t, IntPtr __ldt, FloatPtr __q,
            IntPtr __ldq, IntPtr __ifst, IntPtr __ilst, FloatPtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int strrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __x, IntPtr __ldx, FloatPtr __ferr,
            FloatPtr __berr, FloatPtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int strsen_(BytePtr __job, BytePtr __compq, IntPtr __select, IntPtr __n, FloatPtr __t,
            IntPtr __ldt, FloatPtr __q, IntPtr __ldq, FloatPtr __wr, FloatPtr __wi, IntPtr __m, FloatPtr __s,
            FloatPtr __sep, FloatPtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int strsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n, FloatPtr __t,
            IntPtr __ldt, FloatPtr __vl, IntPtr __ldvl, FloatPtr __vr, IntPtr __ldvr, FloatPtr __s, FloatPtr __sep,
            IntPtr __mm, IntPtr __m, FloatPtr __work, IntPtr __ldwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int strsyl_(BytePtr __trana, BytePtr __tranb, IntPtr __isgn, IntPtr __m, IntPtr __n,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, FloatPtr __c__, IntPtr __ldc, FloatPtr __scale,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int strti2_(BytePtr __uplo, BytePtr __diag, IntPtr __n, FloatPtr __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int strtri_(BytePtr __uplo, BytePtr __diag, IntPtr __n, FloatPtr __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int strtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            FloatPtr __a, IntPtr __lda, FloatPtr __b, IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int strttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda,
            FloatPtr __arf, IntPtr __info);

    @Generated
    @CFunction
    public static native int strttp_(BytePtr __uplo, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int stzrqf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau, IntPtr __info);

    @Generated
    @CFunction
    public static native int stzrzf_(IntPtr __m, IntPtr __n, FloatPtr __a, IntPtr __lda, FloatPtr __tau,
            FloatPtr __work, IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zbdsqr_(BytePtr __uplo, IntPtr __n, IntPtr __ncvt, IntPtr __nru, IntPtr __ncc,
            DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vt,
            IntPtr __ldvt, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __u,
            IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zcgesv_(IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __swork,
            DoublePtr __rwork, IntPtr __iter, IntPtr __info);

    @Generated
    @CFunction
    public static native int zcposv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __swork,
            DoublePtr __rwork, IntPtr __iter, IntPtr __info);

    @Generated
    @CFunction
    public static native int zdrscl_(IntPtr __n, DoublePtr __sa,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __sx,
            IntPtr __incx);

    @Generated
    @CFunction
    public static native int zgbbrd_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __ncc, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __pt,
            IntPtr __ldpt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbcon_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbequ_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbequb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbrfs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afb,
            IntPtr __ldafb, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbsv_(IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku,
            IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afb,
            IntPtr __ldafb, IntPtr __ipiv, BytePtr __equed, DoublePtr __r__, DoublePtr __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbtf2_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbtrf_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgbtrs_(BytePtr __trans, IntPtr __n, IntPtr __kl, IntPtr __ku, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgebak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __scale, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgebal_(BytePtr __job, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ilo, IntPtr __ihi, DoublePtr __scale, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgebd2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tauq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __taup,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgebrd_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tauq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __taup,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgecon_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeequ_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeequb_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr, IntPtr __ilo, IntPtr __ihi, DoublePtr __scale, DoublePtr __abnrm, DoublePtr __rconde,
            DoublePtr __rcondv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgegs_(BytePtr __jobvsl, BytePtr __jobvsr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vsl,
            IntPtr __ldvsl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vsr,
            IntPtr __ldvsr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgegv_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgehd2_(IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgehrd_(IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgelq2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgelqf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgels_(BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgelsd_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __s, DoublePtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgelss_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __s, DoublePtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgelsx_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __jpvt, DoublePtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgelsy_(IntPtr __m, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __jpvt, DoublePtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeql2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeqlf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeqp3_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __jpvt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeqpf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __jpvt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeqr2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgeqrf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgerfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgerq2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgerqf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgesc2_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __rhs,
            IntPtr __ipiv, IntPtr __jpiv, DoublePtr __scale);

    @Generated
    @CFunction
    public static native int zgesdd_(BytePtr __jobz, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __u,
            IntPtr __ldu, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vt,
            IntPtr __ldvt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgesv_(IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgesvd_(BytePtr __jobu, BytePtr __jobvt, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __u,
            IntPtr __ldu, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vt,
            IntPtr __ldvt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgesvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, IntPtr __ipiv, BytePtr __equed, DoublePtr __r__, DoublePtr __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgetc2_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __jpiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgetf2_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgetrf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgetri_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgetrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggbak_(BytePtr __job, BytePtr __side, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            DoublePtr __lscale, DoublePtr __rscale, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zggbal_(BytePtr __job, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __ilo, IntPtr __ihi, DoublePtr __lscale, DoublePtr __rscale, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggev_(BytePtr __jobvl, BytePtr __jobvr, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggevx_(BytePtr __balanc, BytePtr __jobvl, BytePtr __jobvr, BytePtr __sense, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr, IntPtr __ilo, IntPtr __ihi, DoublePtr __lscale, DoublePtr __rscale, DoublePtr __abnrm,
            DoublePtr __bbnrm, DoublePtr __rconde, DoublePtr __rcondv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __iwork, IntPtr __bwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggglm_(IntPtr __n, IntPtr __m, IntPtr __p,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgghrd_(BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgglse_(IntPtr __m, IntPtr __n, IntPtr __p,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggqrf_(IntPtr __n, IntPtr __m, IntPtr __p,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __taua,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __taub,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggrqf_(IntPtr __m, IntPtr __p, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __taua,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __taub,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggsvd_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __n, IntPtr __p,
            IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __alpha, DoublePtr __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __u, IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zggsvp_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __tola, DoublePtr __tolb, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __u, IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            IntPtr __iwork, DoublePtr __rwork,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgtcon_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du2,
            IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgtrfs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dlf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __duf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du2,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgtsv_(IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zgtsvx_(BytePtr __fact, BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dlf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __duf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du2,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgttrf_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du2,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgttrs_(BytePtr __trans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du2,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zgtts2_(IntPtr __itrans, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du2,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb);

    @Generated
    @CFunction
    public static native int zhbev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhbevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhbevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q,
            IntPtr __ldq, DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhbgst_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bb,
            IntPtr __ldbb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhbgv_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bb,
            IntPtr __ldbb, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhbgvd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n, IntPtr __ka, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bb,
            IntPtr __ldbb, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhbgvx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n, IntPtr __ka,
            IntPtr __kb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bb,
            IntPtr __ldbb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q,
            IntPtr __ldq, DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhbtrd_(BytePtr __vect, BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhecon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zheequb_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zheev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zheevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zheevr_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __isuppz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zheevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhegs2_(IntPtr __itype, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhegst_(IntPtr __itype, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhegv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhegvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhegvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int zherfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhesv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhesvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhetd2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhetf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhetrd_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhetrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhetri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhetrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhfrk_(BytePtr __transr, BytePtr __uplo, BytePtr __trans, IntPtr __n, IntPtr __k,
            DoublePtr __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__);

    @Generated
    @CFunction
    public static native int zhgeqz_(BytePtr __job, BytePtr __compq, BytePtr __compz, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t,
            IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpcon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpev_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpevd_(BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpevx_(BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpgst_(IntPtr __itype, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bp,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpgv_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bp,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpgvd_(IntPtr __itype, BytePtr __jobz, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bp,
            DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpgvx_(IntPtr __itype, BytePtr __jobz, BytePtr __range, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bp,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afp,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhpsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afp,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhptrd_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhptrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhptri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zhptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhsein_(BytePtr __side, BytePtr __eigsrc, BytePtr __initv, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr, IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __ifaill, IntPtr __ifailr, IntPtr __info);

    @Generated
    @CFunction
    public static native int zhseqr_(BytePtr __job, BytePtr __compz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlabrd_(IntPtr __m, IntPtr __n, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tauq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __taup,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int zlacgv_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __incx);

    @Generated
    @CFunction
    public static native int zlacn2_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            DoublePtr __est, IntPtr __kase, IntPtr __isave);

    @Generated
    @CFunction
    public static native int zlacon_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            DoublePtr __est, IntPtr __kase);

    @Generated
    @CFunction
    public static native int zlacp2_(BytePtr __uplo, IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int zlacpy_(BytePtr __uplo, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int zlacrm_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc, DoublePtr __rwork);

    @Generated
    @CFunction
    public static native int zlacrt_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __cx,
            IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __cy,
            IntPtr __incy,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s);

    @Generated
    @CFunction
    public static native void zladiv_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ret_val,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y);

    @Generated
    @CFunction
    public static native int zlaed0_(IntPtr __qsiz, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __qstore,
            IntPtr __ldqs, DoublePtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlaed7_(IntPtr __n, IntPtr __cutpnt, IntPtr __qsiz, IntPtr __tlvls, IntPtr __curlvl,
            IntPtr __curpbm, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            DoublePtr __rho, IntPtr __indxq, DoublePtr __qstore, IntPtr __qptr, IntPtr __prmptr, IntPtr __perm,
            IntPtr __givptr, IntPtr __givcol, DoublePtr __givnum,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlaed8_(IntPtr __k, IntPtr __n, IntPtr __qsiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            DoublePtr __d__, DoublePtr __rho, IntPtr __cutpnt, DoublePtr __z__, DoublePtr __dlamda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q2,
            IntPtr __ldq2, DoublePtr __w, IntPtr __indxp, IntPtr __indx, IntPtr __indxq, IntPtr __perm, IntPtr __givptr,
            IntPtr __givcol, DoublePtr __givnum, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlaein_(IntPtr __rightv, IntPtr __noinit, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __rwork, DoublePtr __eps3, DoublePtr __smlnum, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlaesy_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __rt1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __rt2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __evscal,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __cs1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __sn1);

    @Generated
    @CFunction
    public static native int zlaev2_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            DoublePtr __rt1, DoublePtr __rt2, DoublePtr __cs1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __sn1);

    @Generated
    @CFunction
    public static native int zlag2c_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sa, IntPtr __ldsa,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zlags2_(IntPtr __upper, DoublePtr __a1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a2,
            DoublePtr __a3, DoublePtr __b1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b2,
            DoublePtr __b3, DoublePtr __csu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __snu,
            DoublePtr __csv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __snv,
            DoublePtr __csq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __snq);

    @Generated
    @CFunction
    public static native int zlagtm_(BytePtr __trans, IntPtr __n, IntPtr __nrhs, DoublePtr __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int zlahef_(BytePtr __uplo, IntPtr __n, IntPtr __nb, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            IntPtr __ldw, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlahqr_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlahr2_(IntPtr __n, IntPtr __k, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int zlahrd_(IntPtr __n, IntPtr __k, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y, IntPtr __ldy);

    @Generated
    @CFunction
    public static native int zlaic1_(IntPtr __job, IntPtr __j,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            DoublePtr __sest,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __gamma,
            DoublePtr __sestpr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__);

    @Generated
    @CFunction
    public static native int zlals0_(IntPtr __icompq, IntPtr __nl, IntPtr __nr, IntPtr __sqre, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bx,
            IntPtr __ldbx, IntPtr __perm, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, DoublePtr __givnum,
            IntPtr __ldgnum, DoublePtr __poles, DoublePtr __difl, DoublePtr __difr, DoublePtr __z__, IntPtr __k,
            DoublePtr __c__, DoublePtr __s, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlalsa_(IntPtr __icompq, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __bx,
            IntPtr __ldbx, DoublePtr __u, IntPtr __ldu, DoublePtr __vt, IntPtr __k, DoublePtr __difl, DoublePtr __difr,
            DoublePtr __z__, DoublePtr __poles, IntPtr __givptr, IntPtr __givcol, IntPtr __ldgcol, IntPtr __perm,
            DoublePtr __givnum, DoublePtr __c__, DoublePtr __s, DoublePtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlalsd_(BytePtr __uplo, IntPtr __smlsiz, IntPtr __n, IntPtr __nrhs, DoublePtr __d__,
            DoublePtr __e, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, DoublePtr __rcond, IntPtr __rank,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native double zlangb_(BytePtr __norm, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlange_(BytePtr __norm, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlangt_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __dl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __du);

    @Generated
    @CFunction
    public static native double zlanhb_(BytePtr __norm, BytePtr __uplo, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlanhe_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlanhf_(BytePtr __norm, BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlanhp_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlanhs_(BytePtr __norm, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlanht_(BytePtr __norm, IntPtr __n, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e);

    @Generated
    @CFunction
    public static native double zlansb_(BytePtr __norm, BytePtr __uplo, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlansp_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlansy_(BytePtr __norm, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlantb_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlantp_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native double zlantr_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __work);

    @Generated
    @CFunction
    public static native int zlapll_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y, IntPtr __incy,
            DoublePtr __ssmin);

    @Generated
    @CFunction
    public static native int zlapmt_(IntPtr __forwrd, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            IntPtr __k);

    @Generated
    @CFunction
    public static native int zlaqgb_(IntPtr __m, IntPtr __n, IntPtr __kl, IntPtr __ku,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax,
            BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlaqge_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __r__, DoublePtr __c__, DoublePtr __rowcnd, DoublePtr __colcnd, DoublePtr __amax,
            BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlaqhb_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __s, DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlaqhe_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlaqhp_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlaqp2_(IntPtr __m, IntPtr __n, IntPtr __offset,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __jpvt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            DoublePtr __vn1, DoublePtr __vn2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work);

    @Generated
    @CFunction
    public static native int zlaqps_(IntPtr __m, IntPtr __n, IntPtr __offset, IntPtr __nb, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __jpvt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            DoublePtr __vn1, DoublePtr __vn2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __auxv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __f, IntPtr __ldf);

    @Generated
    @CFunction
    public static native int zlaqr0_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlaqr1_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s2,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v);

    @Generated
    @CFunction
    public static native int zlaqr2_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __ns, IntPtr __nd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __sh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            IntPtr __nh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t,
            IntPtr __ldt, IntPtr __nv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __wv,
            IntPtr __ldwv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork);

    @Generated
    @CFunction
    public static native int zlaqr3_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ktop, IntPtr __kbot,
            IntPtr __nw, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __ns, IntPtr __nd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __sh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            IntPtr __nh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t,
            IntPtr __ldt, IntPtr __nv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __wv,
            IntPtr __ldwv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork);

    @Generated
    @CFunction
    public static native int zlaqr4_(IntPtr __wantt, IntPtr __wantz, IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlaqr5_(IntPtr __wantt, IntPtr __wantz, IntPtr __kacc22, IntPtr __n, IntPtr __ktop,
            IntPtr __kbot, IntPtr __nshfts,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __h__,
            IntPtr __ldh, IntPtr __iloz, IntPtr __ihiz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v,
            IntPtr __ldv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __u,
            IntPtr __ldu, IntPtr __nv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __wv,
            IntPtr __ldwv, IntPtr __nh,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __wh,
            IntPtr __ldwh);

    @Generated
    @CFunction
    public static native int zlaqsb_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __s, DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlaqsp_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlaqsy_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, BytePtr __equed);

    @Generated
    @CFunction
    public static native int zlar1v_(IntPtr __n, IntPtr __b1, IntPtr __bn, DoublePtr __lambda, DoublePtr __d__,
            DoublePtr __l, DoublePtr __ld, DoublePtr __lld, DoublePtr __pivmin, DoublePtr __gaptol,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __wantnc, IntPtr __negcnt, DoublePtr __ztz, DoublePtr __mingma, IntPtr __r__, IntPtr __isuppz,
            DoublePtr __nrminv, DoublePtr __resid, DoublePtr __rqcorr, DoublePtr __work);

    @Generated
    @CFunction
    public static native int zlar2v_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __incx, DoublePtr __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s,
            IntPtr __incc);

    @Generated
    @CFunction
    public static native int zlarcm_(IntPtr __m, IntPtr __n, DoublePtr __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc, DoublePtr __rwork);

    @Generated
    @CFunction
    public static native int zlarf_(BytePtr __side, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __incv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work);

    @Generated
    @CFunction
    public static native int zlarfb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int zlarfg_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau);

    @Generated
    @CFunction
    public static native int zlarfp_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau);

    @Generated
    @CFunction
    public static native int zlarft_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int zlarfx_(BytePtr __side, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work);

    @Generated
    @CFunction
    public static native int zlargv_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y, IntPtr __incy,
            DoublePtr __c__, IntPtr __incc);

    @Generated
    @CFunction
    public static native int zlarnv_(IntPtr __idist, IntPtr __iseed, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x);

    @Generated
    @CFunction
    public static native int zlarrv_(IntPtr __n, DoublePtr __vl, DoublePtr __vu, DoublePtr __d__, DoublePtr __l,
            DoublePtr __pivmin, IntPtr __isplit, IntPtr __m, IntPtr __dol, IntPtr __dou, DoublePtr __minrgp,
            DoublePtr __rtol1, DoublePtr __rtol2, DoublePtr __w, DoublePtr __werr, DoublePtr __wgap, IntPtr __iblock,
            IntPtr __indexw, DoublePtr __gers,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __isuppz, DoublePtr __work, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlarscl2_(IntPtr __m, IntPtr __n, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int zlartg_(
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __f,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __g,
            DoublePtr __cs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __sn,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __r__);

    @Generated
    @CFunction
    public static native int zlartv_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y, IntPtr __incy,
            DoublePtr __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s,
            IntPtr __incc);

    @Generated
    @CFunction
    public static native int zlarz_(BytePtr __side, IntPtr __m, IntPtr __n, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __incv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work);

    @Generated
    @CFunction
    public static native int zlarzb_(BytePtr __side, BytePtr __trans, BytePtr __direct, BytePtr __storev, IntPtr __m,
            IntPtr __n, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __ldwork);

    @Generated
    @CFunction
    public static native int zlarzt_(BytePtr __direct, BytePtr __storev, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt);

    @Generated
    @CFunction
    public static native int zlascl_(BytePtr __type__, IntPtr __kl, IntPtr __ku, DoublePtr __cfrom, DoublePtr __cto,
            IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zlascl2_(IntPtr __m, IntPtr __n, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx);

    @Generated
    @CFunction
    public static native int zlaset_(BytePtr __uplo, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int zlasr_(BytePtr __side, BytePtr __pivot, BytePtr __direct, IntPtr __m, IntPtr __n,
            DoublePtr __c__, DoublePtr __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int zlassq_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            DoublePtr __scale, DoublePtr __sumsq);

    @Generated
    @CFunction
    public static native int zlaswp_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __k1, IntPtr __k2, IntPtr __ipiv, IntPtr __incx);

    @Generated
    @CFunction
    public static native int zlasyf_(BytePtr __uplo, IntPtr __n, IntPtr __nb, IntPtr __kb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w,
            IntPtr __ldw, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlat2c_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_complex __sa, IntPtr __ldsa,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zlatbs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            IntPtr __kd, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            DoublePtr __scale, DoublePtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlatdf_(IntPtr __ijob, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __rhs,
            DoublePtr __rdsum, DoublePtr __rdscal, IntPtr __ipiv, IntPtr __jpiv);

    @Generated
    @CFunction
    public static native int zlatps_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            DoublePtr __scale, DoublePtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlatrd_(BytePtr __uplo, IntPtr __n, IntPtr __nb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w, IntPtr __ldw);

    @Generated
    @CFunction
    public static native int zlatrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, BytePtr __normin, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            DoublePtr __scale, DoublePtr __cnorm, IntPtr __info);

    @Generated
    @CFunction
    public static native int zlatrz_(IntPtr __m, IntPtr __n, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work);

    @Generated
    @CFunction
    public static native int zlatzm_(BytePtr __side, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __incv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c1,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c2, IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work);

    @Generated
    @CFunction
    public static native int zlauu2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zlauum_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbcon_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbequ_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __s, DoublePtr __scond, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbrfs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afb,
            IntPtr __ldafb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbstf_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbsv_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afb,
            IntPtr __ldafb, BytePtr __equed, DoublePtr __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbtf2_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbtrf_(BytePtr __uplo, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpbtrs_(BytePtr __uplo, IntPtr __n, IntPtr __kd, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpftrf_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpftri_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpftrs_(BytePtr __transr, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpocon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpoequ_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpoequb_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int zporfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zposv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zposvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, BytePtr __equed, DoublePtr __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpotf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpotrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpotri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpotrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zppcon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zppequ_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afp,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zppsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zppsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afp,
            BytePtr __equed, DoublePtr __s,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpptrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpptri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpstf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __piv, IntPtr __rank, DoublePtr __tol, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpstrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __piv, IntPtr __rank, DoublePtr __tol, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int zptcon_(IntPtr __n, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            DoublePtr __anorm, DoublePtr __rcond, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpteqr_(BytePtr __compz, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int zptrfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            DoublePtr __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ef,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zptsv_(IntPtr __n, IntPtr __nrhs, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zptsvx_(BytePtr __fact, IntPtr __n, IntPtr __nrhs, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            DoublePtr __df,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ef,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zpttrf_(IntPtr __n, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zpttrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zptts2_(IntPtr __iuplo, IntPtr __n, IntPtr __nrhs, DoublePtr __d__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int zrot_(IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __cx,
            IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __cy,
            IntPtr __incy, DoublePtr __c__,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s);

    @Generated
    @CFunction
    public static native int zspcon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zspmv_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y,
            IntPtr __incy);

    @Generated
    @CFunction
    public static native int zspr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap);

    @Generated
    @CFunction
    public static native int zsprfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afp,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zspsv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zspsvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __afp,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsptrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsptri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zsptrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int zstedc_(BytePtr __compz, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __lrwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zstegr_(BytePtr __jobz, BytePtr __range, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, DoublePtr __abstol, IntPtr __m, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __isuppz, DoublePtr __work, IntPtr __lwork, IntPtr __iwork, IntPtr __liwork,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zstein_(IntPtr __n, DoublePtr __d__, DoublePtr __e, IntPtr __m, DoublePtr __w,
            IntPtr __iblock, IntPtr __isplit,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __iwork, IntPtr __ifail, IntPtr __info);

    @Generated
    @CFunction
    public static native int zstemr_(BytePtr __jobz, BytePtr __range, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            DoublePtr __vl, DoublePtr __vu, IntPtr __il, IntPtr __iu, IntPtr __m, DoublePtr __w,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __nzc, IntPtr __isuppz, IntPtr __tryrac, DoublePtr __work, IntPtr __lwork,
            IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsteqr_(BytePtr __compz, IntPtr __n, DoublePtr __d__, DoublePtr __e,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, DoublePtr __work, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsycon_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, DoublePtr __anorm, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zsyequb_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __s, DoublePtr __scond, DoublePtr __amax,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zsymv_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __y,
            IntPtr __incy);

    @Generated
    @CFunction
    public static native int zsyr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __incx,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda);

    @Generated
    @CFunction
    public static native int zsyrfs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsysv_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsysvx_(BytePtr __fact, BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __af,
            IntPtr __ldaf, IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __rcond, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsytf2_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsytrf_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zsytri_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zsytrs_(BytePtr __uplo, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __ipiv, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztbcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n, IntPtr __kd,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztbrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x,
            IntPtr __ldx, DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztbtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __kd,
            IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ab,
            IntPtr __ldab, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b,
            IntPtr __ldb, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztfsm_(BytePtr __transr, BytePtr __side, BytePtr __uplo, BytePtr __trans, BytePtr __diag,
            IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb);

    @Generated
    @CFunction
    public static native int ztftri_(BytePtr __transr, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztfttp_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __arf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztfttr_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __arf,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __s, IntPtr __lds,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __p, IntPtr __ldp,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr, IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgex2_(IntPtr __wantq, IntPtr __wantz, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __j1, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgexc_(IntPtr __wantq, IntPtr __wantz, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __ifst, IntPtr __ilst, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgsen_(IntPtr __ijob, IntPtr __wantq, IntPtr __wantz, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __z__,
            IntPtr __ldz, IntPtr __m, DoublePtr __pl, DoublePtr __pr, DoublePtr __dif,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __iwork, IntPtr __liwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgsja_(BytePtr __jobu, BytePtr __jobv, BytePtr __jobq, IntPtr __m, IntPtr __p, IntPtr __n,
            IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            DoublePtr __tola, DoublePtr __tolb, DoublePtr __alpha, DoublePtr __beta,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __u, IntPtr __ldu,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __v, IntPtr __ldv,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __ncycle, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr, DoublePtr __s, DoublePtr __dif, IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgsy2_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            IntPtr __ldd, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            IntPtr __lde, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __f,
            IntPtr __ldf, DoublePtr __scale, DoublePtr __rdsum, DoublePtr __rdscal, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztgsyl_(BytePtr __trans, IntPtr __ijob, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __d__,
            IntPtr __ldd, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __e,
            IntPtr __lde, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __f,
            IntPtr __ldf, DoublePtr __scale, DoublePtr __dif,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __iwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztpcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztprfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztptri_(BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztptrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztpttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __arf,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztpttr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrcon_(BytePtr __norm, BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            DoublePtr __rcond,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrevc_(BytePtr __side, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr, IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrexc_(BytePtr __compq, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            IntPtr __ifst, IntPtr __ilst, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrrfs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __x, IntPtr __ldx,
            DoublePtr __ferr, DoublePtr __berr,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrsen_(BytePtr __job, BytePtr __compq, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __w, IntPtr __m,
            DoublePtr __s, DoublePtr __sep,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrsna_(BytePtr __job, BytePtr __howmny, IntPtr __select, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __t, IntPtr __ldt,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vl,
            IntPtr __ldvl,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __vr,
            IntPtr __ldvr, DoublePtr __s, DoublePtr __sep, IntPtr __mm, IntPtr __m,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __ldwork, DoublePtr __rwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrsyl_(BytePtr __trana, BytePtr __tranb, IntPtr __isgn, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc, DoublePtr __scale, IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrti2_(BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrtri_(BytePtr __uplo, BytePtr __diag, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrtrs_(BytePtr __uplo, BytePtr __trans, BytePtr __diag, IntPtr __n, IntPtr __nrhs,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __b, IntPtr __ldb,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrttf_(BytePtr __transr, BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __arf,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztrttp_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztzrqf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int ztzrzf_(IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zung2l_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zung2r_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zungbr_(BytePtr __vect, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunghr_(IntPtr __n, IntPtr __ilo, IntPtr __ihi,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zungl2_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zunglq_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zungql_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zungqr_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zungr2_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zungrq_(IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zungtr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunm2l_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zunm2r_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmbr_(BytePtr __vect, BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n,
            IntPtr __k, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmhr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __ilo,
            IntPtr __ihi, @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a,
            IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunml2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmlq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmql_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmqr_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmr2_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmr3_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmrq_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmrz_(BytePtr __side, BytePtr __trans, IntPtr __m, IntPtr __n, IntPtr __k, IntPtr __l,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zunmtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __a, IntPtr __lda,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __lwork, IntPtr __info);

    @Generated
    @CFunction
    public static native int zupgtr_(BytePtr __uplo, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __q, IntPtr __ldq,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int zupmtr_(BytePtr __side, BytePtr __uplo, BytePtr __trans, IntPtr __m, IntPtr __n,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __ap,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __tau,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __c__,
            IntPtr __ldc,
            @UncertainArgument("Options: reference, array Fallback: reference") __CLPK_doublecomplex __work,
            IntPtr __info);

    @Generated
    @CFunction
    public static native int dlamc1_(IntPtr __beta, IntPtr __t, IntPtr __rnd, IntPtr __ieee1);

    @Generated
    @CFunction
    public static native double slamch_(BytePtr __cmach);

    @Generated
    @CFunction
    public static native int slamc1_(IntPtr __beta, IntPtr __t, IntPtr __rnd, IntPtr __ieee1);

    @Generated
    @CFunction
    public static native int slamc2_(IntPtr __beta, IntPtr __t, IntPtr __rnd, FloatPtr __eps, IntPtr __emin,
            FloatPtr __rmin, IntPtr __emax, FloatPtr __rmax);

    @Generated
    @CFunction
    public static native double slamc3_(FloatPtr __a, FloatPtr __b);

    @Generated
    @CFunction
    public static native int slamc4_(IntPtr __emin, FloatPtr __start, IntPtr __base);

    @Generated
    @CFunction
    public static native int slamc5_(IntPtr __beta, IntPtr __p, IntPtr __emin, IntPtr __ieee, IntPtr __emax,
            FloatPtr __rmax);

    @Generated
    @CFunction
    public static native double dlamch_(BytePtr __cmach);

    @Generated
    @CFunction
    public static native int dlamc2_(IntPtr __beta, IntPtr __t, IntPtr __rnd, DoublePtr __eps, IntPtr __emin,
            DoublePtr __rmin, IntPtr __emax, DoublePtr __rmax);

    @Generated
    @CFunction
    public static native double dlamc3_(DoublePtr __a, DoublePtr __b);

    @Generated
    @CFunction
    public static native int dlamc4_(IntPtr __emin, DoublePtr __start, IntPtr __base);

    @Generated
    @CFunction
    public static native int dlamc5_(IntPtr __beta, IntPtr __p, IntPtr __emin, IntPtr __ieee, IntPtr __emax,
            DoublePtr __rmax);

    @Generated
    @CFunction
    public static native NSObject la_retain(NSObject object);

    @Generated
    @CFunction
    public static native void la_release(NSObject object);

    @Generated
    @CFunction
    public static native void la_add_attributes(NSObject object, @NUInt long attributes);

    @Generated
    @CFunction
    public static native void la_remove_attributes(NSObject object, @NUInt long attributes);

    @Generated
    @CFunction
    @NInt
    public static native long la_status(NSObject object);

    @Generated
    @CFunction
    public static native NSObject la_matrix_from_float_buffer(ConstFloatPtr buffer, @NUInt long matrix_rows,
            @NUInt long matrix_cols, @NUInt long matrix_row_stride, @NUInt long matrix_hint, @NUInt long attributes);

    @Generated
    @CFunction
    public static native NSObject la_matrix_from_double_buffer(ConstDoublePtr buffer, @NUInt long matrix_rows,
            @NUInt long matrix_cols, @NUInt long matrix_row_stride, @NUInt long matrix_hint, @NUInt long attributes);

    @Generated
    @CFunction
    public static native NSObject la_matrix_from_float_buffer_nocopy(FloatPtr buffer, @NUInt long matrix_rows,
            @NUInt long matrix_cols, @NUInt long matrix_row_stride, @NUInt long matrix_hint,
            @FunctionPtr(name = "call_la_matrix_from_float_buffer_nocopy") Function_la_matrix_from_float_buffer_nocopy deallocator,
            @NUInt long attributes);

    @Generated
    @CFunction
    public static native NSObject la_matrix_from_double_buffer_nocopy(DoublePtr buffer, @NUInt long matrix_rows,
            @NUInt long matrix_cols, @NUInt long matrix_row_stride, @NUInt long matrix_hint,
            @FunctionPtr(name = "call_la_matrix_from_double_buffer_nocopy") Function_la_matrix_from_double_buffer_nocopy deallocator,
            @NUInt long attributes);

    @Generated
    @CFunction
    @NInt
    public static native long la_matrix_to_float_buffer(FloatPtr buffer, @NUInt long buffer_row_stride,
            NSObject matrix);

    @Generated
    @CFunction
    @NInt
    public static native long la_matrix_to_double_buffer(DoublePtr buffer, @NUInt long buffer_row_stride,
            NSObject matrix);

    @Generated
    @CFunction
    @NUInt
    public static native long la_matrix_rows(NSObject matrix);

    @Generated
    @CFunction
    @NUInt
    public static native long la_matrix_cols(NSObject matrix);

    @Generated
    @CFunction
    public static native NSObject la_matrix_slice(NSObject matrix, @NInt long matrix_first_row,
            @NInt long matrix_first_col, @NInt long matrix_row_stride, @NInt long matrix_col_stride,
            @NUInt long slice_rows, @NUInt long slice_cols);

    @Generated
    @CFunction
    public static native NSObject la_identity_matrix(@NUInt long matrix_size, int scalar_type, @NUInt long attributes);

    @Generated
    @CFunction
    public static native NSObject la_diagonal_matrix_from_vector(NSObject vector, @NInt long matrix_diagonal);

    @Generated
    @CFunction
    public static native NSObject la_vector_from_matrix_row(NSObject matrix, @NUInt long matrix_row);

    @Generated
    @CFunction
    public static native NSObject la_vector_from_matrix_col(NSObject matrix, @NUInt long matrix_col);

    @Generated
    @CFunction
    public static native NSObject la_vector_from_matrix_diagonal(NSObject matrix, @NInt long matrix_diagonal);

    @Generated
    @CFunction
    @NInt
    public static native long la_vector_to_float_buffer(FloatPtr buffer, @NInt long buffer_stride, NSObject vector);

    @Generated
    @CFunction
    @NInt
    public static native long la_vector_to_double_buffer(DoublePtr buffer, @NInt long buffer_stride, NSObject vector);

    @Generated
    @CFunction
    @NUInt
    public static native long la_vector_length(NSObject vector);

    @Generated
    @CFunction
    public static native NSObject la_vector_slice(NSObject vector, @NInt long vector_first, @NInt long vector_stride,
            @NUInt long slice_length);

    @Generated
    @CFunction
    public static native NSObject la_splat_from_float(float scalar_value, @NUInt long attributes);

    @Generated
    @CFunction
    public static native NSObject la_splat_from_double(double scalar_value, @NUInt long attributes);

    @Generated
    @CFunction
    public static native NSObject la_splat_from_vector_element(NSObject vector, @NInt long vector_index);

    @Generated
    @CFunction
    public static native NSObject la_splat_from_matrix_element(NSObject matrix, @NInt long matrix_row,
            @NInt long matrix_col);

    @Generated
    @CFunction
    public static native NSObject la_vector_from_splat(NSObject splat, @NUInt long vector_length);

    @Generated
    @CFunction
    public static native NSObject la_matrix_from_splat(NSObject splat, @NUInt long matrix_rows,
            @NUInt long matrix_cols);

    @Generated
    @CFunction
    public static native NSObject la_transpose(NSObject matrix);

    @Generated
    @CFunction
    public static native NSObject la_scale_with_float(NSObject matrix, float scalar);

    @Generated
    @CFunction
    public static native NSObject la_scale_with_double(NSObject matrix, double scalar);

    @Generated
    @CFunction
    public static native NSObject la_sum(NSObject obj_left, NSObject obj_right);

    @Generated
    @CFunction
    public static native NSObject la_difference(NSObject obj_left, NSObject obj_right);

    @Generated
    @CFunction
    public static native NSObject la_elementwise_product(NSObject obj_left, NSObject obj_right);

    @Generated
    @CFunction
    public static native NSObject la_inner_product(NSObject vector_left, NSObject vector_right);

    @Generated
    @CFunction
    public static native NSObject la_outer_product(NSObject vector_left, NSObject vector_right);

    @Generated
    @CFunction
    public static native NSObject la_matrix_product(NSObject matrix_left, NSObject matrix_right);

    @Generated
    @CFunction
    public static native NSObject la_solve(NSObject matrix_system, NSObject obj_rhs);

    @Generated
    @CFunction
    public static native float la_norm_as_float(NSObject vector, @NUInt long vector_norm);

    @Generated
    @CFunction
    public static native double la_norm_as_double(NSObject vector, @NUInt long vector_norm);

    @Generated
    @CFunction
    public static native NSObject la_normalized_vector(NSObject vector, @NUInt long vector_norm);

    @Generated
    @CFunction
    public static native float sparse_inner_product_dense_float(long nz, ConstFloatPtr x, ConstLongPtr indx,
            ConstFloatPtr y, long incy);

    @Generated
    @CFunction
    public static native double sparse_inner_product_dense_double(long nz, ConstDoublePtr x, ConstLongPtr indx,
            ConstDoublePtr y, long incy);

    @Generated
    @CFunction
    public static native float sparse_inner_product_sparse_float(long nzx, long nzy, ConstFloatPtr x, ConstLongPtr indx,
            ConstFloatPtr y, ConstLongPtr indy);

    @Generated
    @CFunction
    public static native double sparse_inner_product_sparse_double(long nzx, long nzy, ConstDoublePtr x,
            ConstLongPtr indx, ConstDoublePtr y, ConstLongPtr indy);

    @Generated
    @CFunction
    public static native void sparse_vector_add_with_scale_dense_float(long nz, float alpha, ConstFloatPtr x,
            ConstLongPtr indx, FloatPtr y, long incy);

    @Generated
    @CFunction
    public static native void sparse_vector_add_with_scale_dense_double(long nz, double alpha, ConstDoublePtr x,
            ConstLongPtr indx, DoublePtr y, long incy);

    @Generated
    @CFunction
    public static native float sparse_vector_norm_float(long nz, ConstFloatPtr x, ConstLongPtr indx, int norm);

    @Generated
    @CFunction
    public static native double sparse_vector_norm_double(long nz, ConstDoublePtr x, ConstLongPtr indx, int norm);

    @Generated
    @CFunction
    public static native int sparse_matrix_vector_product_dense_float(int transa, float alpha, sparse_matrix_float A,
            ConstFloatPtr x, long incx, FloatPtr y, long incy);

    @Generated
    @CFunction
    public static native int sparse_matrix_vector_product_dense_double(int transa, double alpha, sparse_matrix_double A,
            ConstDoublePtr x, long incx, DoublePtr y, long incy);

    @Generated
    @CFunction
    public static native int sparse_vector_triangular_solve_dense_float(int transt, float alpha, sparse_matrix_float T,
            FloatPtr x, long incx);

    @Generated
    @CFunction
    public static native int sparse_vector_triangular_solve_dense_double(int transt, double alpha,
            sparse_matrix_double T, DoublePtr x, long incx);

    @Generated
    @CFunction
    public static native int sparse_outer_product_dense_float(long M, long N, long nz, float alpha, ConstFloatPtr x,
            long incx, ConstFloatPtr y, ConstLongPtr indy, Ptr<sparse_matrix_float> C);

    @Generated
    @CFunction
    public static native int sparse_outer_product_dense_double(long M, long N, long nz, double alpha, ConstDoublePtr x,
            long incx, ConstDoublePtr y, ConstLongPtr indy, Ptr<sparse_matrix_double> C);

    @Generated
    @CFunction
    public static native int sparse_permute_rows_float(sparse_matrix_float A, ConstLongPtr perm);

    @Generated
    @CFunction
    public static native int sparse_permute_rows_double(sparse_matrix_double A, ConstLongPtr perm);

    @Generated
    @CFunction
    public static native int sparse_permute_cols_float(sparse_matrix_float A, ConstLongPtr perm);

    @Generated
    @CFunction
    public static native int sparse_permute_cols_double(sparse_matrix_double A, ConstLongPtr perm);

    @Generated
    @CFunction
    public static native float sparse_elementwise_norm_float(sparse_matrix_float A, int norm);

    @Generated
    @CFunction
    public static native double sparse_elementwise_norm_double(sparse_matrix_double A, int norm);

    @Generated
    @CFunction
    public static native float sparse_operator_norm_float(sparse_matrix_float A, int norm);

    @Generated
    @CFunction
    public static native double sparse_operator_norm_double(sparse_matrix_double A, int norm);

    @Generated
    @CFunction
    public static native float sparse_matrix_trace_float(sparse_matrix_float A, long offset);

    @Generated
    @CFunction
    public static native double sparse_matrix_trace_double(sparse_matrix_double A, long offset);

    @Generated
    @CFunction
    public static native int sparse_matrix_product_dense_float(int order, int transa, long n, float alpha,
            sparse_matrix_float A, ConstFloatPtr B, long ldb, FloatPtr C, long ldc);

    @Generated
    @CFunction
    public static native int sparse_matrix_product_dense_double(int order, int transa, long n, double alpha,
            sparse_matrix_double A, ConstDoublePtr B, long ldb, DoublePtr C, long ldc);

    @Generated
    @CFunction
    public static native int sparse_matrix_product_sparse_float(int order, int transa, float alpha,
            sparse_matrix_float A, sparse_matrix_float B, FloatPtr C, long ldc);

    @Generated
    @CFunction
    public static native int sparse_matrix_product_sparse_double(int order, int transa, double alpha,
            sparse_matrix_double A, sparse_matrix_double B, DoublePtr C, long ldc);

    @Generated
    @CFunction
    public static native int sparse_matrix_triangular_solve_dense_float(int order, int transt, long nrhs, float alpha,
            sparse_matrix_float T, FloatPtr B, long ldb);

    @Generated
    @CFunction
    public static native int sparse_matrix_triangular_solve_dense_double(int order, int transt, long nrhs, double alpha,
            sparse_matrix_double T, DoublePtr B, long ldb);

    @Generated
    @CFunction
    public static native sparse_matrix_float sparse_matrix_create_float(long M, long N);

    @Generated
    @CFunction
    public static native sparse_matrix_double sparse_matrix_create_double(long M, long N);

    @Generated
    @CFunction
    public static native int sparse_insert_entry_float(sparse_matrix_float A, float val, long i, long j);

    @Generated
    @CFunction
    public static native int sparse_insert_entry_double(sparse_matrix_double A, double val, long i, long j);

    @Generated
    @CFunction
    public static native int sparse_insert_entries_float(sparse_matrix_float A, long N, ConstFloatPtr val,
            ConstLongPtr indx, ConstLongPtr jndx);

    @Generated
    @CFunction
    public static native int sparse_insert_entries_double(sparse_matrix_double A, long N, ConstDoublePtr val,
            ConstLongPtr indx, ConstLongPtr jndx);

    @Generated
    @CFunction
    public static native int sparse_insert_col_float(sparse_matrix_float A, long j, long nz, ConstFloatPtr val,
            ConstLongPtr indx);

    @Generated
    @CFunction
    public static native int sparse_insert_col_double(sparse_matrix_double A, long j, long nz, ConstDoublePtr val,
            ConstLongPtr indx);

    @Generated
    @CFunction
    public static native int sparse_insert_row_float(sparse_matrix_float A, long i, long nz, ConstFloatPtr val,
            ConstLongPtr jndx);

    @Generated
    @CFunction
    public static native int sparse_insert_row_double(sparse_matrix_double A, long i, long nz, ConstDoublePtr val,
            ConstLongPtr jndx);

    @Generated
    @CFunction
    public static native int sparse_extract_sparse_row_float(sparse_matrix_float A, long row, long column_start,
            LongPtr column_end, long nz, FloatPtr val, LongPtr jndx);

    @Generated
    @CFunction
    public static native int sparse_extract_sparse_row_double(sparse_matrix_double A, long row, long column_start,
            LongPtr column_end, long nz, DoublePtr val, LongPtr jndx);

    @Generated
    @CFunction
    public static native int sparse_extract_sparse_column_float(sparse_matrix_float A, long column, long row_start,
            LongPtr row_end, long nz, FloatPtr val, LongPtr indx);

    @Generated
    @CFunction
    public static native int sparse_extract_sparse_column_double(sparse_matrix_double A, long column, long row_start,
            LongPtr row_end, long nz, DoublePtr val, LongPtr indx);

    @Generated
    @CFunction
    public static native sparse_matrix_float sparse_matrix_block_create_float(long Mb, long Nb, long k, long l);

    @Generated
    @CFunction
    public static native sparse_matrix_double sparse_matrix_block_create_double(long Mb, long Nb, long k, long l);

    @Generated
    @CFunction
    public static native sparse_matrix_float sparse_matrix_variable_block_create_float(long Mb, long Nb, ConstLongPtr K,
            ConstLongPtr L);

    @Generated
    @CFunction
    public static native sparse_matrix_double sparse_matrix_variable_block_create_double(long Mb, long Nb,
            ConstLongPtr K, ConstLongPtr L);

    @Generated
    @CFunction
    public static native int sparse_insert_block_float(sparse_matrix_float A, ConstFloatPtr val, long row_stride,
            long col_stride, long bi, long bj);

    @Generated
    @CFunction
    public static native int sparse_insert_block_double(sparse_matrix_double A, ConstDoublePtr val, long row_stride,
            long col_stride, long bi, long bj);

    @Generated
    @CFunction
    public static native int sparse_extract_block_float(sparse_matrix_float A, long bi, long bj, long row_stride,
            long col_stride, FloatPtr val);

    @Generated
    @CFunction
    public static native int sparse_extract_block_double(sparse_matrix_double A, long bi, long bj, long row_stride,
            long col_stride, DoublePtr val);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_block_dimension_for_row(VoidPtr A, long i);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_block_dimension_for_col(VoidPtr A, long j);

    @Generated
    @CFunction
    public static native int sparse_commit(VoidPtr A);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_matrix_property(VoidPtr A, int pname);

    @Generated
    @CFunction
    public static native int sparse_set_matrix_property(VoidPtr A, int pname);

    @Generated
    @CFunction
    public static native long sparse_get_matrix_number_of_rows(VoidPtr A);

    @Generated
    @CFunction
    public static native long sparse_get_matrix_number_of_columns(VoidPtr A);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_matrix_nonzero_count(VoidPtr A);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_matrix_nonzero_count_for_row(VoidPtr A, long i);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_matrix_nonzero_count_for_column(VoidPtr A, long j);

    @Generated
    @CFunction
    public static native int sparse_matrix_destroy(VoidPtr A);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_vector_nonzero_count_float(long N, ConstFloatPtr x, long incx);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_get_vector_nonzero_count_double(long N, ConstDoublePtr x, long incx);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_pack_vector_float(long N, long nz, ConstFloatPtr x, long incx, FloatPtr y,
            LongPtr indy);

    @Generated
    @CFunction
    @NInt
    public static native long sparse_pack_vector_double(long N, long nz, ConstDoublePtr x, long incx, DoublePtr y,
            LongPtr indy);

    @Generated
    @CFunction
    public static native void sparse_unpack_vector_float(long N, long nz, boolean zero, ConstFloatPtr x,
            ConstLongPtr indx, FloatPtr y, long incy);

    @Generated
    @CFunction
    public static native void sparse_unpack_vector_double(long N, long nz, boolean zero, ConstDoublePtr x,
            ConstLongPtr indx, DoublePtr y, long incy);

    @Generated
    @CFunction
    public static native double quadrature_integrate(
            @UncertainArgument("Options: reference, array Fallback: reference") quadrature_integrate_function __f,
            double __a, double __b,
            @UncertainArgument("Options: reference, array Fallback: reference") quadrature_integrate_options options,
            IntPtr status, DoublePtr abs_error, @NUInt long workspace_size, VoidPtr workspace);

    @Generated
    @CFunction
    public static native VoidPtr BNNSFilterCreateConvolutionLayer(
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSImageStackDescriptor in_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSImageStackDescriptor out_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSConvolutionLayerParameters layer_params,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSFilterParameters filter_params);

    @Generated
    @CFunction
    public static native VoidPtr BNNSFilterCreateFullyConnectedLayer(
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSVectorDescriptor in_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSVectorDescriptor out_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSFullyConnectedLayerParameters layer_params,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSFilterParameters filter_params);

    @Generated
    @CFunction
    public static native VoidPtr BNNSFilterCreatePoolingLayer(
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSImageStackDescriptor in_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSImageStackDescriptor out_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSPoolingLayerParameters layer_params,
            @UncertainArgument("Options: reference, array Fallback: reference") BNNSFilterParameters filter_params);

    @Generated
    @CFunction
    public static native int BNNSFilterApply(VoidPtr filter, ConstVoidPtr in, VoidPtr out);

    @Generated
    @CFunction
    public static native int BNNSFilterApplyBatch(VoidPtr filter, @NUInt long batch_size, ConstVoidPtr in,
            @NUInt long in_stride, VoidPtr out, @NUInt long out_stride);

    @Generated
    @CFunction
    public static native void BNNSFilterDestroy(VoidPtr filter);

    @Generated
    @CFunction
    public static native void vvrecf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvrec(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvdivf(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvdiv(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvsqrtf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvsqrt(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcbrtf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcbrt(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvrsqrtf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvrsqrt(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvexpf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvexp(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvexpm1f(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvexpm1(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlogf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlog(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlog10f(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlog10(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlog1pf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlog1p(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlogbf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlogb(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvfabsf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvfabs(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvpowf(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvpow(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvpowsf(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvpows(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvsinf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvsin(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcosf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcos(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvtanf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvtan(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvasinf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvasin(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvacosf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvacos(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvatanf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvatan(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvatan2f(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvatan2(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvsincosf(FloatPtr arg1, FloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvsincos(DoublePtr arg1, DoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvsinhf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvsinh(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcoshf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcosh(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvtanhf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvtanh(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvasinhf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvasinh(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvacoshf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvacosh(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvatanhf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvatanh(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvintf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvint(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvnintf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvnint(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvceilf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvceil(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvfloorf(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvfloor(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvfmodf(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvfmod(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvremainderf(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvremainder(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvcopysignf(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvcopysign(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvnextafterf(FloatPtr arg1, ConstFloatPtr arg2, ConstFloatPtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvnextafter(DoublePtr arg1, ConstDoublePtr arg2, ConstDoublePtr arg3, ConstIntPtr arg4);

    @Generated
    @CFunction
    public static native void vvlog2f(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvlog2(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvexp2f(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvexp2(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvsinpif(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvsinpi(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcospif(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvcospi(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvtanpif(FloatPtr arg1, ConstFloatPtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    public static native void vvtanpi(DoublePtr arg1, ConstDoublePtr arg2, ConstIntPtr arg3);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottomAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottomAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlend_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlend_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlend_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlend_BGRA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlend_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlend_BGRAFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlendMultiply_RGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlendScreen_RGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlendDarken_RGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedAlphaBlendLighten_RGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_RGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_RGBAFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_ARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_RGBA16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_ARGB16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultiplyData_RGBA16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_RGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_RGBAFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_ARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_RGBA16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_ARGB16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageUnpremultiplyData_RGBA16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedConstAlphaBlend_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop, byte constAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedConstAlphaBlend_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop, float constAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedConstAlphaBlend_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop, byte constAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePremultipliedConstAlphaBlend_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop, float constAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_NonpremultipliedToPremultiplied_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_NonpremultipliedToPremultiplied_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTopAlpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_NonpremultipliedToPremultiplied_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAlphaBlend_NonpremultipliedToPremultiplied_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcTop,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcBottom,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageClipToAlpha_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageClipToAlpha_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageClipToAlpha_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageClipToAlpha_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageClipToAlpha_RGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageClipToAlpha_RGBAFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvolve_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstShortPtr kernel, int kernel_height,
            int kernel_width, int divisor, byte backgroundColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvolve_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstFloatPtr kernel, int kernel_height,
            int kernel_width, float backgroundColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvolveWithBias_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstShortPtr kernel, int kernel_height,
            int kernel_width, int divisor, int bias, byte backgroundColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvolveWithBias_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstFloatPtr kernel, int kernel_height,
            int kernel_width, float bias, float backgroundColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageRichardsonLucyDeConvolve_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstShortPtr kernel, ConstShortPtr kernel2,
            int kernel_height, int kernel_width, int kernel_height2, int kernel_width2, int divisor, int divisor2,
            byte backgroundColor, int iterationCount, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageRichardsonLucyDeConvolve_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstFloatPtr kernel, ConstFloatPtr kernel2,
            int kernel_height, int kernel_width, int kernel_height2, int kernel_width2, float backgroundColor,
            int iterationCount, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageBoxConvolve_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, int kernel_height, int kernel_width,
            byte backgroundColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageTentConvolve_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, int kernel_height, int kernel_width,
            byte backgroundColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageClip_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float maxFloat,
            float minFloat, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float maxFloat,
            float minFloat, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarFtoPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float maxFloat,
            float minFloat, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarFtoPlanar8_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float maxFloat,
            float minFloat, int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcA,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcB,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarFtoARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcA,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcB,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB8888toPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcARGB,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destA,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destB, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGBFFFFtoPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcARGB,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destA,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destB, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ChunkyToPlanar8(Ptr<ConstVoidPtr> srcChannels,
            Ptr<ConstPtr<vImage_Buffer>> destPlanarBuffers, int channelCount, @NUInt long srcStrideBytes,
            @NUInt long srcWidth, @NUInt long srcHeight, @NUInt long srcRowBytes, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarToChunky8(Ptr<ConstPtr<vImage_Buffer>> srcPlanarBuffers,
            Ptr<VoidPtr> destChannels, int channelCount, @NUInt long destStrideBytes, @NUInt long destWidth,
            @NUInt long destHeight, @NUInt long destRowBytes, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ChunkyToPlanarF(Ptr<ConstVoidPtr> srcChannels,
            Ptr<ConstPtr<vImage_Buffer>> destPlanarBuffers, int channelCount, @NUInt long srcStrideBytes,
            @NUInt long srcWidth, @NUInt long srcHeight, @NUInt long srcRowBytes, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarToChunkyF(Ptr<ConstPtr<vImage_Buffer>> srcPlanarBuffers,
            Ptr<VoidPtr> destChannels, int channelCount, @NUInt long destStrideBytes, @NUInt long destWidth,
            @NUInt long destHeight, @NUInt long destRowBytes, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16SToF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float offset,
            float scale, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16UToF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float offset,
            float scale, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_FTo16S(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float offset,
            float scale, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_FTo16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, float offset,
            float scale, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Uto16F(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Fto16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_12UTo16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16UTo12U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannels_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer newSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer origSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, byte copyMask,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannels_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer newSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer origSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, byte copyMask,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannelsWithScalar_Planar8(byte scalar,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannelsWithScalar_PlanarF(float scalar,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannelsWithScalar_Planar16S(short scalar,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannelsWithScalar_Planar16U(char scalar,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageExtractChannel_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NInt long channelIndex, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageExtractChannel_ARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NInt long channelIndex, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageExtractChannel_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NInt long channelIndex, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannelsWithScalar_ARGB8888(byte scalar,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, byte copyMask,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageOverwriteChannelsWithScalar_ARGBFFFF(float scalar,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, byte copyMask,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGBFFFFtoRGBFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBAFFFFtoRGBFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_BGRAFFFFtoRGBFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBFFFtoARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, float arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg4, boolean arg5,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBFFFtoRGBAFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, float arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg4, boolean arg5,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBFFFtoBGRAFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, float arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg4, boolean arg5,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB1555toPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destA,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destB, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB1555toARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toARGB1555(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcA,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcB,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB8888toARGB1555(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA5551toRGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA8888toRGBA5551(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB8888toARGB1555_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA8888toRGBA5551_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB565toARGB8888(byte alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB565toRGBA8888(byte alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB565toBGRA8888(byte alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB565toRGB888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB8888toRGB565(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA8888toRGB565(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_BGRA8888toRGB565(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB888toRGB565_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB8888toRGB565_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA8888toRGB565_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_BGRA8888toRGB565_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB565toPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer destB, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toRGB565(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcR,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcG,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcB,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA5551toRGB565(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB1555toRGB565(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB565toRGBA5551(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int dither,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB565toARGB1555(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int dither,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16FtoPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarFtoPlanar16F(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toPlanar16F(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16FtoPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16UToPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8To16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB888toARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, byte arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg4, boolean arg5,
            int arg6);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB888toRGBA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, byte arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg4, boolean arg5,
            int arg6);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB888toBGRA8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, byte arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg4, boolean arg5,
            int arg6);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB8888toRGB888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, int arg3);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA8888toRGB888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, int arg3);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_BGRA8888toRGB888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer arg2, int arg3);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toRGB888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer planarRed,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer planarGreen,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer planarBlue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarFtoRGBFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer planarRed,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer planarGreen,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer planarBlue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB888toPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer redDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer greenDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blueDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBFFFtoPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer redDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer greenDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blueDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageSelectChannels_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer newSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer origSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, byte copyMask,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageSelectChannels_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer newSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer origSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, byte copyMask,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8ToXRGB8888(byte alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8ToBGRX8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red, byte alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarFToXRGBFFFF(float alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_PlanarFToBGRXFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red, float alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_XRGB8888ToPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_BGRX8888ToPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_XRGBFFFFToPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_BGRXFFFFToPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB16UtoARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer aSrc, char alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer argbDest,
            boolean premultiply, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB16UtoRGBA16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer aSrc, char alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbaDest,
            boolean premultiply, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB16UtoBGRA16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer aSrc, char alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer bgraDest,
            boolean premultiply, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB16UtoRGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer argbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGBA16UtoRGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbaSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_BGRA16UtoRGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer bgraSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16UtoARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer aSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer gSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer bSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer argbDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB16UtoPlanar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer argbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer aDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer gDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer bDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16UtoRGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer gSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer bSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB16UtoPlanar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rgbSrc,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer rDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer gDest,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer bDest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16UtoPlanar8_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int dither,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB16UtoRGB888_dithered(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int dither,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageByteSwap_Planar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar1toPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar2toPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar4toPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toPlanar1(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toPlanar2(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar8toPlanar4(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int dither, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_8to16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_RGB888toPlanar16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGB8888toPlanar16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Q12to8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16Q12toRGB888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16Q12toARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Q12to16F(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16Q12toRGB16F(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Planar16Q12toARGB16F(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer alpha,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer red,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer green,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer blue,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Fto16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Q12toF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_Fto16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Q12to16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_16Uto16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_YpCbCrToARGB_GenerateConversion(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_YpCbCrToARGBMatrix matrix,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_YpCbCrPixelRange pixelRange,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_YpCbCrToARGB outInfo,
            int inYpCbCrType, int outARGBType, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_ARGBToYpCbCr_GenerateConversion(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_ARGBToYpCbCrMatrix matrix,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_YpCbCrPixelRange pixelRange,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_ARGBToYpCbCr outInfo,
            int inARGBType, int outYpCbCrType, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageCopyBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long pixelSize, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageRotate_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            float angleInRadians, byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageRotate_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            float angleInRadians, float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_Planar16S(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_Planar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_ARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_ARGB16S(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_CbCr8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_CbCr16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageScale_XRGB2101010W(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAffineWarp_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_AffineTransform transform,
            byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAffineWarp_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_AffineTransform transform,
            float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAffineWarpD_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_AffineTransform_Double transform,
            byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAffineWarpD_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_AffineTransform_Double transform,
            float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAffineWarpCG_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_AffineTransform_Double transform,
            byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageAffineWarpCG_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_AffineTransform_Double transform,
            float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalReflect_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalReflect_Planar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalReflect_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalReflect_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalReflect_ARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalReflect_ARGB16S(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalReflect_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalReflect_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalReflect_Planar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalReflect_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalReflect_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalReflect_ARGB16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalReflect_ARGB16S(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalReflect_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageRotate90_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            byte rotationConstant, byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageRotate90_Planar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            byte rotationConstant, char backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageRotate90_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            byte rotationConstant, float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalShear_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float xTranslate, float shearSlope,
            VoidPtr filter, byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalShear_Planar16S(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float xTranslate, float shearSlope,
            VoidPtr filter, short backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalShear_Planar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float xTranslate, float shearSlope,
            VoidPtr filter, char backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalShear_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float xTranslate, float shearSlope,
            VoidPtr filter, float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalShear_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float yTranslate, float shearSlope,
            VoidPtr filter, byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalShear_Planar16S(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float yTranslate, float shearSlope,
            VoidPtr filter, short backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalShear_Planar16U(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float yTranslate, float shearSlope,
            VoidPtr filter, char backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalShear_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float yTranslate, float shearSlope,
            VoidPtr filter, float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalShearD_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, double xTranslate, double shearSlope,
            VoidPtr filter, byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalShearD_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, double xTranslate, double shearSlope,
            VoidPtr filter, float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalShearD_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, double yTranslate, double shearSlope,
            VoidPtr filter, byte backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalShearD_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, double yTranslate, double shearSlope,
            VoidPtr filter, float backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHorizontalShear_XRGB2101010W(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float xTranslate, float shearSlope,
            VoidPtr filter, int backColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageVerticalShear_XRGB2101010W(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, float yTranslate, float shearSlope,
            VoidPtr filter, int backColor, int flags);

    @Generated
    @CFunction
    public static native VoidPtr vImageNewResamplingFilter(float scale, int flags);

    @Generated
    @CFunction
    public static native void vImageDestroyResamplingFilter(VoidPtr filter);

    @Generated
    @CFunction
    @NInt
    public static native long vImageNewResamplingFilterForFunctionUsingBuffer(VoidPtr filter, float scale,
            @FunctionPtr(name = "call_vImageNewResamplingFilterForFunctionUsingBuffer") Function_vImageNewResamplingFilterForFunctionUsingBuffer kernelFunc,
            float kernelWidth, VoidPtr userData, int flags);

    @Generated
    @CFunction
    @NUInt
    public static native long vImageGetResamplingFilterSize(float scale,
            @FunctionPtr(name = "call_vImageGetResamplingFilterSize") Function_vImageGetResamplingFilterSize kernelFunc,
            float kernelWidth, int flags);

    @Generated
    @CFunction
    @NUInt
    public static native long vImageGetResamplingFilterExtent(VoidPtr filter, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHistogramCalculation_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src, NUIntPtr histogram,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHistogramCalculation_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src, NUIntPtr histogram,
            int histogram_entries, float minVal, float maxVal, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageEqualization_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageEqualization_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int histogram_entries, float minVal, float maxVal, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageEqualization_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageEqualization_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int histogram_entries, float minVal, float maxVal, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHistogramSpecification_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            ConstNUIntPtr desired_histogram, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageHistogramSpecification_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            ConstNUIntPtr desired_histogram, int histogram_entries, float minVal, float maxVal, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageContrastStretch_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageContrastStretch_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int histogram_entries, float minVal, float maxVal, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageContrastStretch_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageContrastStretch_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int histogram_entries, float minVal, float maxVal, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageEndsInContrastStretch_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, int percent_low,
            int percent_high, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageEndsInContrastStretch_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            int percent_low, int percent_high, int histogram_entries, float minVal, float maxVal, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageDilate_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String kernel,
            @NUInt long kernel_height, @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageDilate_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstFloatPtr kernel, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageDilate_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String kernel,
            @NUInt long kernel_height, @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageDilate_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstFloatPtr kernel, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageErode_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String kernel,
            @NUInt long kernel_height, @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageErode_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstFloatPtr kernel, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageErode_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String kernel,
            @NUInt long kernel_height, @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageErode_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, ConstFloatPtr kernel, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMax_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMax_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMax_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMax_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMin_Planar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMin_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMin_ARGB8888(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMin_ARGBFFFF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr tempBuffer,
            @NUInt long srcOffsetToROI_X, @NUInt long srcOffsetToROI_Y, @NUInt long kernel_height,
            @NUInt long kernel_width, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePNGDecompressionFilter(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buffer,
            @NUInt long startScanline, @NUInt long scanlineCount, int bitsPerPixel, int filterMethodNumber,
            int filterType, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMatrixMultiply_Planar16S(Ptr<ConstPtr<vImage_Buffer>> srcs,
            Ptr<ConstPtr<vImage_Buffer>> dests, int src_planes, int dest_planes, ConstShortPtr matrix, int divisor,
            ConstShortPtr pre_bias, ConstIntPtr post_bias, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMatrixMultiply_Planar8(Ptr<ConstPtr<vImage_Buffer>> srcs,
            Ptr<ConstPtr<vImage_Buffer>> dests, int src_planes, int dest_planes, ConstShortPtr matrix, int divisor,
            ConstShortPtr pre_bias, ConstIntPtr post_bias, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMatrixMultiply_PlanarF(Ptr<ConstPtr<vImage_Buffer>> srcs,
            Ptr<ConstPtr<vImage_Buffer>> dests, int src_planes, int dest_planes, ConstFloatPtr matrix,
            ConstFloatPtr pre_bias, ConstFloatPtr post_bias, int flags);

    @Generated
    @CFunction
    public static native VoidPtr vImageCreateGammaFunction(float gamma, int gamma_type, int flags);

    @Generated
    @CFunction
    public static native void vImageDestroyGammaFunction(VoidPtr f);

    @Generated
    @CFunction
    @NInt
    public static native long vImageGamma_Planar8toPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr gamma,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageGamma_PlanarFtoPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr gamma,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageGamma_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, VoidPtr gamma,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePiecewisePolynomial_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            Ptr<ConstFloatPtr> coefficients, ConstFloatPtr boundaries, int order, int log2segments, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePiecewisePolynomial_Planar8toPlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            Ptr<ConstFloatPtr> coefficients, ConstFloatPtr boundaries, int order, int log2segments, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePiecewisePolynomial_PlanarFtoPlanar8(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            Ptr<ConstFloatPtr> coefficients, ConstFloatPtr boundaries, int order, int log2segments, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageSymmetricPiecewisePolynomial_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            Ptr<ConstFloatPtr> coefficients, ConstFloatPtr boundaries, int order, int log2segments, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImagePiecewiseRational_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest,
            Ptr<ConstFloatPtr> topCoefficients, Ptr<ConstFloatPtr> bottomCoefficients, ConstFloatPtr boundaries,
            int topOrder, int bottomOrder, int log2segments, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageInterpolatedLookupTable_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer src,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dest, ConstFloatPtr table,
            @NUInt long tableEntries, float maxFloat, float minFloat, int flags);

    @Generated
    @CFunction
    public static native vImage_MultidimensionalTable vImageMultidimensionalTable_Create(ConstCharPtr tableData,
            int numSrcChannels, int numDestChannels, ConstBytePtr table_entries_per_dimension, int hint, int flags,
            NIntPtr err);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMultidimensionalTable_Retain(vImage_MultidimensionalTable table);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMultidimensionalTable_Release(vImage_MultidimensionalTable table);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMultiDimensionalInterpolatedLookupTable_PlanarF(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcs,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dests, VoidPtr tempBuffer,
            vImage_MultidimensionalTable table, int method, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageMultiDimensionalInterpolatedLookupTable_Planar16Q12(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcs,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dests, VoidPtr tempBuffer,
            vImage_MultidimensionalTable table, int method, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageBuffer_Init(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buf, @NUInt long height,
            @NUInt long width, int pixelBits, int flags);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize vImageBuffer_GetSize(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buf);

    @Generated
    @CFunction
    public static native int vImageCGImageFormat_GetComponentCount(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat format);

    @Generated
    @CFunction
    public static native byte vImageCGImageFormat_IsEqual(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat f1,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat f2);

    @Generated
    @CFunction
    @NInt
    public static native long vImageBuffer_InitWithCGImage(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buf,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat format,
            ConstNFloatPtr backgroundColor, CGImageRef image, int flags);

    @Generated
    @CFunction
    public static native CGImageRef vImageCreateCGImageFromBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buf,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat format,
            @FunctionPtr(name = "call_vImageCreateCGImageFromBuffer") Function_vImageCreateCGImageFromBuffer callback,
            VoidPtr userData, int flags, NIntPtr error);

    @Generated
    @CFunction
    public static native void vImageConverter_Retain(vImageConverterRef converter);

    @Generated
    @CFunction
    public static native void vImageConverter_Release(vImageConverterRef converter);

    @Generated
    @CFunction
    public static native vImageConverterRef vImageConverter_CreateWithCGImageFormat(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat srcFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat destFormat,
            ConstNFloatPtr backgroundColor, int flags, NIntPtr error);

    @Generated
    @CFunction
    public static native vImageConverterRef vImageConverter_CreateWithColorSyncCodeFragment(ConstVoidPtr codeFragment,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat srcFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat destFormat,
            ConstNFloatPtr backgroundColor, int flags, NIntPtr error);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConverter_MustOperateOutOfPlace(vImageConverterRef converter,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcs,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dests, int flags);

    @Generated
    @CFunction
    @NUInt
    public static native long vImageConverter_GetNumberOfSourceBuffers(vImageConverterRef converter);

    @Generated
    @CFunction
    @NUInt
    public static native long vImageConverter_GetNumberOfDestinationBuffers(vImageConverterRef converter);

    @Generated
    @CFunction
    public static native ConstIntPtr vImageConverter_GetSourceBufferOrder(vImageConverterRef converter);

    @Generated
    @CFunction
    public static native ConstIntPtr vImageConverter_GetDestinationBufferOrder(vImageConverterRef converter);

    @Generated
    @CFunction
    @NInt
    public static native long vImageConvert_AnyToAny(vImageConverterRef converter,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer srcs,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer dests, VoidPtr tempBuffer,
            int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageBuffer_InitWithCVPixelBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat desiredFormat,
            CVBufferRef cvPixelBuffer, vImageCVImageFormatRef cvImageFormat, ConstNFloatPtr backgroundColor, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageBuffer_CopyToCVPixelBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat bufferFormat,
            CVBufferRef cvPixelBuffer, vImageCVImageFormatRef cvImageFormat, ConstNFloatPtr backgroundColor, int flags);

    @Generated
    @CFunction
    public static native vImageCVImageFormatRef vImageCVImageFormat_CreateWithCVPixelBuffer(CVBufferRef buffer);

    @Generated
    @CFunction
    public static native vImageCVImageFormatRef vImageCVImageFormat_Create(int imageFormatType,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_ARGBToYpCbCrMatrix matrix,
            CFStringRef cvImageBufferChromaLocation, CGColorSpaceRef baseColorspace, int alphaIsOneHint);

    @Generated
    @CFunction
    public static native vImageCVImageFormatRef vImageCVImageFormat_Copy(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    public static native void vImageCVImageFormat_Retain(vImageCVImageFormatRef fmt);

    @Generated
    @CFunction
    public static native void vImageCVImageFormat_Release(vImageCVImageFormatRef fmt);

    @Generated
    @CFunction
    public static native int vImageCVImageFormat_GetFormatCode(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    public static native int vImageCVImageFormat_GetChannelCount(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    public static native ConstIntPtr vImageCVImageFormat_GetChannelNames(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    public static native CGColorSpaceRef vImageCVImageFormat_GetColorSpace(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    @NInt
    public static native long vImageCVImageFormat_SetColorSpace(vImageCVImageFormatRef format,
            CGColorSpaceRef colorspace);

    @Generated
    @CFunction
    public static native CFStringRef vImageCVImageFormat_GetChromaSiting(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    @NInt
    public static native long vImageCVImageFormat_SetChromaSiting(vImageCVImageFormatRef format, CFStringRef siting);

    @Generated
    @CFunction
    public static native ConstVoidPtr vImageCVImageFormat_GetConversionMatrix(vImageConstCVImageFormatRef format,
            IntPtr outType);

    @Generated
    @CFunction
    @NInt
    public static native long vImageCVImageFormat_CopyConversionMatrix(vImageCVImageFormatRef format,
            ConstVoidPtr matrix, int inType);

    @Generated
    @CFunction
    public static native int vImageCVImageFormat_GetAlphaHint(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    @NInt
    public static native long vImageCVImageFormat_SetAlphaHint(vImageCVImageFormatRef format, int alphaIsOne);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native vImageChannelDescription vImageCVImageFormat_GetChannelDescription(
            vImageConstCVImageFormatRef format, int type);

    @Generated
    @CFunction
    @NInt
    public static native long vImageCVImageFormat_CopyChannelDescription(vImageCVImageFormatRef format,
            @UncertainArgument("Options: reference, array Fallback: reference") vImageChannelDescription desc,
            int type);

    @Generated
    @CFunction
    public static native VoidPtr vImageCVImageFormat_GetUserData(vImageConstCVImageFormatRef format);

    @Generated
    @CFunction
    @NInt
    public static native long vImageCVImageFormat_SetUserData(vImageCVImageFormatRef format, VoidPtr userData,
            @FunctionPtr(name = "call_vImageCVImageFormat_SetUserData") Function_vImageCVImageFormat_SetUserData userDataReleaseCallback);

    @Generated
    @CFunction
    public static native CGColorSpaceRef vImageCreateRGBColorSpaceWithPrimariesAndTransferFunction(
            @UncertainArgument("Options: reference, array Fallback: reference") vImageRGBPrimaries primaries,
            @UncertainArgument("Options: reference, array Fallback: reference") vImageTransferFunction tf, int intent,
            int flags, NIntPtr error);

    @Generated
    @CFunction
    public static native CGColorSpaceRef vImageCreateMonochromeColorSpaceWithWhitePointAndTransferFunction(
            @UncertainArgument("Options: reference, array Fallback: reference") vImageWhitePoint whitePoint,
            @UncertainArgument("Options: reference, array Fallback: reference") vImageTransferFunction tf, int intent,
            int flags, NIntPtr error);

    @Generated
    @CFunction
    public static native vImageConverterRef vImageConverter_CreateForCGToCVImageFormat(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat srcFormat,
            vImageCVImageFormatRef destFormat, ConstNFloatPtr backgroundColor, int flags, NIntPtr error);

    @Generated
    @CFunction
    public static native vImageConverterRef vImageConverter_CreateForCVToCGImageFormat(vImageCVImageFormatRef srcFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_CGImageFormat destFormat,
            ConstNFloatPtr backgroundColor, int flags, NIntPtr error);

    @Generated
    @CFunction
    @NInt
    public static native long vImageBuffer_InitForCopyToCVPixelBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buffers,
            vImageConverterRef converter, CVBufferRef pixelBuffer, int flags);

    @Generated
    @CFunction
    @NInt
    public static native long vImageBuffer_InitForCopyFromCVPixelBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") vImage_Buffer buffers,
            vImageConverterRef converter, CVBufferRef pixelBuffer, int flags);

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native vImage_YpCbCrToARGBMatrix kvImage_YpCbCrToARGBMatrix_ITU_R_601_4();

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native vImage_YpCbCrToARGBMatrix kvImage_YpCbCrToARGBMatrix_ITU_R_709_2();

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native vImage_ARGBToYpCbCrMatrix kvImage_ARGBToYpCbCrMatrix_ITU_R_601_4();

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native vImage_ARGBToYpCbCrMatrix kvImage_ARGBToYpCbCrMatrix_ITU_R_709_2();

    @Generated
    @CVariable()
    public static native ConstNFloatPtr kvImageDecodeArray_16Q12Format();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_SetBLASParamErrorProc {
        @Generated
        void call_SetBLASParamErrorProc(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
                ConstIntPtr arg2, ConstIntPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_la_matrix_from_float_buffer_nocopy {
        @Generated
        void call_la_matrix_from_float_buffer_nocopy(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_la_matrix_from_double_buffer_nocopy {
        @Generated
        void call_la_matrix_from_double_buffer_nocopy(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_vImageNewResamplingFilterForFunctionUsingBuffer {
        @Generated
        void call_vImageNewResamplingFilterForFunctionUsingBuffer(ConstFloatPtr arg0, FloatPtr arg1, @NUInt long arg2,
                VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_vImageGetResamplingFilterSize {
        @Generated
        void call_vImageGetResamplingFilterSize(ConstFloatPtr arg0, FloatPtr arg1, @NUInt long arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_vImageCreateCGImageFromBuffer {
        @Generated
        void call_vImageCreateCGImageFromBuffer(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_vImageCVImageFormat_SetUserData {
        @Generated
        void call_vImageCVImageFormat_SetUserData(VoidPtr arg0, VoidPtr arg1);
    }
}
