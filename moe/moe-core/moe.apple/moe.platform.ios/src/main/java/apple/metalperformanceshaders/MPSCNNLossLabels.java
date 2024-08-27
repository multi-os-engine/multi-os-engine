package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLResource;
import apple.metal.struct.MTLSize;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNLossLabels
 * [@dependency] This depends on Metal.framework.
 * 
 * The MPSCNNLossLabels is used to hold the per-element weights buffer
 * used by both MPSCNNLoss forward filter and MPSNNLossGradient backward filter.
 * The MPSCNNLoss forward filter populates the MPSCNNLossLabels object
 * and the MPSNNLossGradient backward filter consumes the state object.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNLossLabels extends MPSState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNLossLabels(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNLossLabels alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNLossLabels allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNLossLabels init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSCNNLossLabels initWithDeviceBufferSize(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long bufferSize);

    /**
     * Set labels (aka targets, ground truth) for the MPSCNNLossLabels object.
     * 
     * The labels and weights data are copied into internal storage. The computed loss can either be a
     * scalar value (in batch mode, a single value per image in a batch) or it
     * can be one value per feature channel. Thus, the size of the loss image
     * must either match the size of the input source image or be {1, 1, 1},
     * which results in a scalar value. In this convinience initializer, the
     * assumed size of the loss image is {1, 1, 1}.
     * 
     * @param device           Device the state resources will be created on.
     * @param labelsDescriptor Describes the labels data. This includes:
     *                         - The per-element labels data. The data must be in floating point format.
     *                         - Data layout of labels data. See MPSImage.h for more information.
     *                         - Size of labels data: (width, height, feature channels}.
     *                         - Optionally, row bytes of labels data.
     *                         - Optionally, slice bytes of labels data.
     */
    @Generated
    @Selector("initWithDevice:labelsDescriptor:")
    public native MPSCNNLossLabels initWithDeviceLabelsDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull MPSCNNLossDataDescriptor labelsDescriptor);

    /**
     * Set labels (aka targets, ground truth) and weights for the MPSCNNLossLabels object.
     * Weights are optional.
     * 
     * The labels and weights data are copied into internal storage.
     * 
     * @param device            Device the state resources will be created on.
     * @param lossImageSize     The size of the resulting loss image: { width, height, featureChannels }.
     *                          The computed loss can either be a scalar value (in batch mode, a single
     *                          value per image in a batch) or it can be one value per feature channel.
     *                          Thus, the size of the loss image must either match the size of the input
     *                          source image or be {1, 1, 1}, which results in a scalar value.
     * @param labelsDescriptor  Describes the labels data. This includes:
     *                          - The per-element labels data. The data must be in floating point format.
     *                          - Data layout of labels data. See MPSImage.h for more information.
     *                          - Size of labels data: (width, height, feature channels}.
     *                          - Optionally, row bytes of labels data.
     *                          - Optionally, slice bytes of labels data.
     * @param weightsDescriptor Describes the weights data. This includes:
     *                          - The per-element weights data. The data must be in floating point format.
     *                          - Data layout of weights data. See MPSImage.h for more information.
     *                          - Size of weights data: (width, height, feature channels}.
     *                          - Optionally, row bytes of weights data.
     *                          - Optionally, slice bytes of weights data.
     *                          This parameter is optional. If you are using a single weight, please use the
     *                          weight property of the MPSCNNLossDescriptor object.
     */
    @Generated
    @Selector("initWithDevice:lossImageSize:labelsDescriptor:weightsDescriptor:")
    public native MPSCNNLossLabels initWithDeviceLossImageSizeLabelsDescriptorWeightsDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @ByValue MTLSize lossImageSize,
            @NotNull MPSCNNLossDataDescriptor labelsDescriptor, @Nullable MPSCNNLossDataDescriptor weightsDescriptor);

    /**
     * Set labels (aka targets, ground truth) and weights for the MPSCNNLossLabels object.
     * Weights are optional.
     * 
     * The labels and weights images are retained - it is the users responsibility to make sure that they contain
     * the right data when the loss filter is run on the device.
     * 
     * @param device        Device the state resources will be created on.
     * @param lossImageSize The size of the resulting loss image: { width, height, featureChannels }.
     *                      The computed loss can either be a scalar value (in batch mode, a single
     *                      value per image in a batch) or it can be one value per feature channel.
     *                      Thus, the size of the loss image must either match the size of the input
     *                      source image or be {1, 1, 1}, which results in a scalar value.
     * @param labelsImage   Describes the labels data.
     * @param weightsImage  Describes the weights data.
     *                      This parameter is optional. If you are using a single weight, please use the
     *                      weight property of the MPSCNNLossDescriptor object.
     * 
     *                      API-Since: 13.0
     */
    @Generated
    @Selector("initWithDevice:lossImageSize:labelsImage:weightsImage:")
    public native MPSCNNLossLabels initWithDeviceLossImageSizeLabelsImageWeightsImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @ByValue MTLSize lossImageSize,
            @NotNull MPSImage labelsImage, @Nullable MPSImage weightsImage);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSCNNLossLabels initWithDeviceResourceList(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSCNNLossLabels initWithDeviceTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("initWithResource:")
    public native MPSCNNLossLabels initWithResource(@Nullable @Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSCNNLossLabels initWithResources(@Nullable NSArray<?> resources);

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

    /**
     * Labels image accessor method.
     * 
     * @return An autoreleased MPSImage object, containing the labels data.
     *         The labels data is populated in the -initWithDevice call.
     * 
     *         In order to guarantee that the image is correctly synchronized for CPU side access,
     *         it is the application's responsibility to call the [gradientState synchronizeOnCommandBuffer:]
     *         method before accessing the data in the image.
     */
    @NotNull
    @Generated
    @Selector("labelsImage")
    public native MPSImage labelsImage();

    /**
     * Loss image accessor method.
     * 
     * @return An autoreleased MPSImage object, containing the loss data.
     *         The loss data is populated in the -encode call, thus the contents
     *         are undefined until you -encode the filter.
     * 
     *         In order to guarantee that the image is correctly synchronized for CPU side access,
     *         it is the application's responsibility to call the [gradientState synchronizeOnCommandBuffer:]
     *         method before accessing the data in the image.
     */
    @NotNull
    @Generated
    @Selector("lossImage")
    public native MPSImage lossImage();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNLossLabels new_objc();

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

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:")
    public static native MPSCNNLossLabels temporaryStateWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSCNNLossLabels temporaryStateWithCommandBufferBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSCNNLossLabels temporaryStateWithCommandBufferResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSStateResourceList resourceList);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSCNNLossLabels temporaryStateWithCommandBufferTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Weights image accessor method.
     * 
     * @return An autoreleased MPSImage object, containing the weights data.
     *         The weights data is populated in the -initWithDevice call.
     * 
     *         In order to guarantee that the image is correctly synchronized for CPU side access,
     *         it is the application's responsibility to call the [gradientState synchronizeOnCommandBuffer:]
     *         method before accessing the data in the image.
     */
    @NotNull
    @Generated
    @Selector("weightsImage")
    public native MPSImage weightsImage();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
