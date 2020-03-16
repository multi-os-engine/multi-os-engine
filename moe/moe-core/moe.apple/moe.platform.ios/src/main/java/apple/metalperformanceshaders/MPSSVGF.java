package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSSVGF extends MPSKernel implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSSVGF(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSSVGF alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bilateralFilterRadius")
    @NUInt
    public native long bilateralFilterRadius();

    @Generated
    @Selector("bilateralFilterSigma")
    public native float bilateralFilterSigma();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("channelCount")
    @NUInt
    public native long channelCount();

    @Generated
    @Selector("channelCount2")
    @NUInt
    public native long channelCount2();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("depthWeight")
    public native float depthWeight();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeBilateralFilterToCommandBuffer:stepDistance:sourceTexture:destinationTexture:depthNormalTexture:")
    public native void encodeBilateralFilterToCommandBufferStepDistanceSourceTextureDestinationTextureDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long stepDistance,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    @Generated
    @Selector("encodeBilateralFilterToCommandBuffer:stepDistance:sourceTexture:destinationTexture:sourceTexture2:destinationTexture2:depthNormalTexture:")
    public native void encodeBilateralFilterToCommandBufferStepDistanceSourceTextureDestinationTextureSourceTexture2DestinationTexture2DepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long stepDistance,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    @Generated
    @Selector("encodeReprojectionToCommandBuffer:sourceTexture:previousTexture:destinationTexture:previousLuminanceMomentsTexture:destinationLuminanceMomentsTexture:previousFrameCountTexture:destinationFrameCountTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encodeReprojectionToCommandBufferSourceTexturePreviousTextureDestinationTexturePreviousLuminanceMomentsTextureDestinationLuminanceMomentsTexturePreviousFrameCountTextureDestinationFrameCountTextureMotionVectorTextureDepthNormalTexturePreviousDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture motionVectorTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousDepthNormalTexture);

    @Generated
    @Selector("encodeReprojectionToCommandBuffer:sourceTexture:previousTexture:destinationTexture:previousLuminanceMomentsTexture:destinationLuminanceMomentsTexture:sourceTexture2:previousTexture2:destinationTexture2:previousLuminanceMomentsTexture2:destinationLuminanceMomentsTexture2:previousFrameCountTexture:destinationFrameCountTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encodeReprojectionToCommandBufferSourceTexturePreviousTextureDestinationTexturePreviousLuminanceMomentsTextureDestinationLuminanceMomentsTextureSourceTexture2PreviousTexture2DestinationTexture2PreviousLuminanceMomentsTexture2DestinationLuminanceMomentsTexture2PreviousFrameCountTextureDestinationFrameCountTextureMotionVectorTextureDepthNormalTexturePreviousDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousLuminanceMomentsTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationLuminanceMomentsTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture motionVectorTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousDepthNormalTexture);

    @Generated
    @Selector("encodeVarianceEstimationToCommandBuffer:sourceTexture:luminanceMomentsTexture:destinationTexture:frameCountTexture:depthNormalTexture:")
    public native void encodeVarianceEstimationToCommandBufferSourceTextureLuminanceMomentsTextureDestinationTextureFrameCountTextureDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture luminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture frameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    @Generated
    @Selector("encodeVarianceEstimationToCommandBuffer:sourceTexture:luminanceMomentsTexture:destinationTexture:sourceTexture2:luminanceMomentsTexture2:destinationTexture2:frameCountTexture:depthNormalTexture:")
    public native void encodeVarianceEstimationToCommandBufferSourceTextureLuminanceMomentsTextureDestinationTextureSourceTexture2LuminanceMomentsTexture2DestinationTexture2FrameCountTextureDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture luminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture luminanceMomentsTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture frameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSSVGF init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSSVGF initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSSVGF initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSSVGF initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("luminanceWeight")
    public native float luminanceWeight();

    @Generated
    @Selector("minimumFramesForVarianceEstimation")
    @NUInt
    public native long minimumFramesForVarianceEstimation();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("normalWeight")
    public native float normalWeight();

    @Generated
    @Selector("reprojectionThreshold")
    public native float reprojectionThreshold();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setBilateralFilterRadius:")
    public native void setBilateralFilterRadius(@NUInt long value);

    @Generated
    @Selector("setBilateralFilterSigma:")
    public native void setBilateralFilterSigma(float value);

    @Generated
    @Selector("setChannelCount2:")
    public native void setChannelCount2(@NUInt long value);

    @Generated
    @Selector("setChannelCount:")
    public native void setChannelCount(@NUInt long value);

    @Generated
    @Selector("setDepthWeight:")
    public native void setDepthWeight(float value);

    @Generated
    @Selector("setLuminanceWeight:")
    public native void setLuminanceWeight(float value);

    @Generated
    @Selector("setMinimumFramesForVarianceEstimation:")
    public native void setMinimumFramesForVarianceEstimation(@NUInt long value);

    @Generated
    @Selector("setNormalWeight:")
    public native void setNormalWeight(float value);

    @Generated
    @Selector("setReprojectionThreshold:")
    public native void setReprojectionThreshold(float value);

    @Generated
    @Selector("setTemporalReprojectionBlendFactor:")
    public native void setTemporalReprojectionBlendFactor(float value);

    @Generated
    @Selector("setTemporalWeighting:")
    public native void setTemporalWeighting(@NUInt long value);

    @Generated
    @Selector("setVarianceEstimationRadius:")
    public native void setVarianceEstimationRadius(@NUInt long value);

    @Generated
    @Selector("setVarianceEstimationSigma:")
    public native void setVarianceEstimationSigma(float value);

    @Generated
    @Selector("setVariancePrefilterRadius:")
    public native void setVariancePrefilterRadius(@NUInt long value);

    @Generated
    @Selector("setVariancePrefilterSigma:")
    public native void setVariancePrefilterSigma(float value);

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
    @Selector("temporalReprojectionBlendFactor")
    public native float temporalReprojectionBlendFactor();

    @Generated
    @Selector("temporalWeighting")
    @NUInt
    public native long temporalWeighting();

    @Generated
    @Selector("varianceEstimationRadius")
    @NUInt
    public native long varianceEstimationRadius();

    @Generated
    @Selector("varianceEstimationSigma")
    public native float varianceEstimationSigma();

    @Generated
    @Selector("variancePrefilterRadius")
    @NUInt
    public native long variancePrefilterRadius();

    @Generated
    @Selector("variancePrefilterSigma")
    public native float variancePrefilterSigma();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}