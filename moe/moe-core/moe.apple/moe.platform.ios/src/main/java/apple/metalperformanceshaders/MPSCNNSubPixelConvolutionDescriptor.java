package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * MPSCNNSubPixelConvolutionDescriptor can be used to create MPSCNNConvolution object that does sub pixel upsamling
 *                   and reshaping opeartion as described in
 *                       http://www.cv-foundation.org/openaccess/content_cvpr_2016/papers/Shi_Real-Time_Single_Image_CVPR_2016_paper.pdf
 * 
 *                  Conceptually MPSCNNConvolution with subPixelScaleFactor > 1 can be thought of as filter performing regular CNN convolution producing N output feature channels at each pixel of
 *                  an intermediate MPSImage followed by a kernel that rearranges/reshapes these N channels at each pixel of intermediate MPSImage into a pixel block of
 *                  size subPixelScaleFactor x subPixelScaleFactor with N/(subPixelScaleFactor * subPixelScaleFactor) featureChannels at each pixel of this pixel block. Thus each pixel in intermedaite
 *                  MPSImage with N channels map to subPixelScaleFactor x subPixelScaleFactor pixel block in final destination MPSImage with N/(subPixelScaleFactor * subPixelScaleFactor) featureChannels.
 *                  MPSCNNConvolution with subPixelScaleFactor > 1 fuses the convolution and reshaping operation into single compute kernel thus not only saving DRAM roundtrip but also memory
 *                  needed for intermediate MPSImage had these operation done separately.
 *                  Let N be the value of outputFeatureChannels property and let r = subPixelScaleFactor.
 *                  Conceptually Convolution will produce intermedaite image Io of dimensions (treated as 3D tensor) width x height x N where
 *                             width = (clipRect.size.width + r - 1) / r
 *                             height = (clipRect.size.height + r -1) / r
 *                  Reshaping happens as follows
 *                  [@code]
 *                  Destination[clipRect.origin.x+x][clipRect.origin.y+y][c] = Io[ floor(x/r) ][ floor(y/r) ][ (N/r^2) * ( r * mod(y,r) + mod(x,r) ) + c ]
 *                  where x in [0,clipRect.size.width-1], y in [0,clipRect.size.height-1], c in [0,N/r^2 - 1]
 *                  [@endcode]
 * 
 *                  The following conditions must be met:
 *                  1) N (outputFeatureChannels) must be multiple of r^2 (subPixelScaleFactor * subPixelScaleFactor).
 *                  2) The destination MPSImage to encode call must have at least N/r^2 + destinationFeatureChannelOffset channels.
 *                  3) Number of feature channels in reshaped output image (N/r^2) can be any value when groups = 1 but must be multiple of 4 when groups > 1.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNSubPixelConvolutionDescriptor extends MPSCNNConvolutionDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNSubPixelConvolutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNSubPixelConvolutionDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannels(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels);

    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:neuronFilter:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannelsNeuronFilter(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels, MPSCNNNeuron neuronFilter);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNSubPixelConvolutionDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNSubPixelConvolutionDescriptor initWithCoder(NSCoder aDecoder);

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
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]      subPixelScaleFactor
     * 
     * Upsampling scale factor. Each pixel in input is upsampled into a subPixelScaleFactor x subPixelScaleFactor pixel block by rearranging
     *                the outputFeatureChannels as described above. Default value is 1.
     */
    @Generated
    @Selector("setSubPixelScaleFactor:")
    public native void setSubPixelScaleFactor(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]      subPixelScaleFactor
     * 
     * Upsampling scale factor. Each pixel in input is upsampled into a subPixelScaleFactor x subPixelScaleFactor pixel block by rearranging
     *                the outputFeatureChannels as described above. Default value is 1.
     */
    @Generated
    @Selector("subPixelScaleFactor")
    @NUInt
    public native long subPixelScaleFactor();

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