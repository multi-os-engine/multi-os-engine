package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLResource;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNNormalizationMeanAndVarianceState
 * [@description] A state which contains mean and variance terms used to apply a
 * normalization in a MPSCNNBatchNormalization operation.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNNormalizationMeanAndVarianceState extends MPSState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNNormalizationMeanAndVarianceState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNNormalizationMeanAndVarianceState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNNormalizationMeanAndVarianceState allocWithZone(VoidPtr zone);

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
    public native MPSCNNNormalizationMeanAndVarianceState init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSCNNNormalizationMeanAndVarianceState initWithDeviceBufferSize(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long bufferSize);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSCNNNormalizationMeanAndVarianceState initWithDeviceResourceList(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSCNNNormalizationMeanAndVarianceState initWithDeviceTextureDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MTLTextureDescriptor descriptor);

    /**
     * Initialize a MPSCNNNormalizationMeanAndVarianceState object using values
     * contained in MTLBuffers.
     *
     * @param mean     The MTLBuffer containing mean terms.
     * @param variance The MTLBuffer containing variance terms.
     */
    @Generated
    @Selector("initWithMean:variance:")
    public native MPSCNNNormalizationMeanAndVarianceState initWithMeanVariance(
            @Mapped(ObjCObjectMapper.class) MTLBuffer mean, @Mapped(ObjCObjectMapper.class) MTLBuffer variance);

    @Generated
    @Selector("initWithResource:")
    public native MPSCNNNormalizationMeanAndVarianceState initWithResource(
            @Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSCNNNormalizationMeanAndVarianceState initWithResources(NSArray<?> resources);

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

    /**
     * [@property] mean
     * <p>
     * A MTLBuffer containing the mean terms.
     */
    @Generated
    @Selector("mean")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer mean();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNNormalizationMeanAndVarianceState new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("temporaryStateWithCommandBuffer:")
    public static native MPSCNNNormalizationMeanAndVarianceState temporaryStateWithCommandBuffer(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSCNNNormalizationMeanAndVarianceState temporaryStateWithCommandBufferBufferSize(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    /**
     * Create a temporary MPSCNNNormalizationMeanAndVarianceState suitable
     * for a normalization operation on images containing no more than
     * the specified number of feature channels.
     *
     * @param commandBuffer           The command buffer on which the temporary state will
     *                                be used.
     * @param numberOfFeatureChannels The number of feature channels used to size the
     *                                state.
     */
    @Generated
    @Selector("temporaryStateWithCommandBuffer:numberOfFeatureChannels:")
    public static native MPSCNNNormalizationMeanAndVarianceState temporaryStateWithCommandBufferNumberOfFeatureChannels(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long numberOfFeatureChannels);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSCNNNormalizationMeanAndVarianceState temporaryStateWithCommandBufferResourceList(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSStateResourceList resourceList);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSCNNNormalizationMeanAndVarianceState temporaryStateWithCommandBufferTextureDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MTLTextureDescriptor descriptor);

    /**
     * [@property] variance
     * <p>
     * A MTLBuffer containing the variance terms.
     */
    @Generated
    @Selector("variance")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer variance();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
