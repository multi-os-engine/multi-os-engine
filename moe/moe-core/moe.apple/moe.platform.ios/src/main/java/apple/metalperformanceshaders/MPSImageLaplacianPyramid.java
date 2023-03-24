package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSImageLaplacianPyramid
 * 
 * Laplacian pyramid levels are constructed as difference between the current source level and 2x interpolated version
 * of the
 * half-resolution source level immediately above it.
 * 
 * LaplacianMipLevel[l] := GaussianMipLevel[l] – Interpolate(GaussianMipLevel[l + 1])
 * 
 * The Interpolate function is the classical 2x signal interpolation procedure applied
 * to all color channels of the source mip-level in both dimensions.
 * It is logically equivalent to the following two-step process :
 * 1) Zero-stuffing (sometimes called "upsampling").
 * It is the process of interleaving source pixel values with zero values:
 * dst.at(x, y) := src.at(x, y) if even(x) and even(y) else 0
 * 2) Filtering (sometimes called "interpolation").
 * It is the same procedure as implemented by the MPSImageConvolution class,
 * using filter weights provided by the initializer methods inherited from MPSImagePyramid.
 * 
 * The source for Laplacian pyramid construction is typically produced
 * by the Gaussian pyramid algorithm -- a closely related image processing technique,
 * but the Laplacian pyramid construction itself makes no assumptions neither about
 * the data stored in the source texture nor about the interpolation filter weights,
 * so Gaussian pyramid is just a conventional name for the source texture.
 * 
 * Please refer to the classical "The Laplacian Pyramid as a Compact Image Code" whitepaper
 * by Burt & Anderson, originally published in 532 IEEE TRANSACTIONS ON COMMUNICATIONS, VOL. COM-3l, NO. 4, APRIL 1983
 * for more detailed discussion.
 * 
 * Since the subtraction operation extends the value range of LaplacianMipLevelRaw
 * relative to the value range of GaussianMipLevel (even for the case of
 * normalized interpolation filter), in order to avoid unwanted range clamping
 * when working with normalized texture types, laplacianBias and laplacianScale class properties
 * specify point-wise linear mapping of the LaplacianMipLevelRaw result data
 * into the value range of the destination texture :
 * LaplacianRangeScale(pixel, laplacianBias, laplacianScale) := laplacianBias + pixel * laplacianScale,
 * LaplacianMipLevelStored[j] := LaplacianRangeScale(LaplacianMipLevel[j], laplacianBias, laplacianScale),
 * with the default values being laplacianBias = 0.0, laplacianScale = 1.0
 * 
 * Limitations of the current software revision :
 * 1) In-place operation is not supported, e.g. source and destination textures need
 * to have separate storage and can't be aliased.
 * 2) The number of channels, bit depth and resolution of the source and destination textures need to match.
 * 3) Values of the offset and clipRect properties are fixed to the defaults provided by MPSUnaryImageKernel
 * (from which they are inherited), corresponding to no offset applied to the source and unbounded region of interest
 * in every destination mip-level; all updates to these properties are ignored.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageLaplacianPyramid extends MPSImagePyramid {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageLaplacianPyramid(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageLaplacianPyramid alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageLaplacianPyramid allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("getLaplacianBias")
    public native float getLaplacianBias();

    @Generated
    @Selector("getLaplacianScale")
    public native float getLaplacianScale();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSImageLaplacianPyramid init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageLaplacianPyramid initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageLaplacianPyramid initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageLaplacianPyramid initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:centerWeight:")
    public native MPSImageLaplacianPyramid initWithDeviceCenterWeight(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, float centerWeight);

    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:weights:")
    public native MPSImageLaplacianPyramid initWithDeviceKernelWidthKernelHeightWeights(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth,
            @NUInt long kernelHeight, @NotNull ConstFloatPtr kernelWeights);

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
    public static native MPSImageLaplacianPyramid new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setLaplacianBias:")
    public native void setLaplacianBias(float value);

    @Generated
    @Selector("setLaplacianScale:")
    public native void setLaplacianScale(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
