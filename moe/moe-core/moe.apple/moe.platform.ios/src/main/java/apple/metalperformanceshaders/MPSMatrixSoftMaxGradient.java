package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
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
 * MPSMatrixSoftMaxGradient
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * Computes the gradient corresponding to a forward MPSMatrixSoftMax object.
 * 
 * A MPSMatrixSoftMaxGradient object computes:
 * 
 * dL_dX_ij = Y_ij * (dL_dY_ij - sum_k(dL_dY_ik * Y_ik)
 * 
 * Where dL_dX is the resulting gradient of the loss function with respect to
 * the original input to the forward MPSMatrixSoftMax operation, Y is
 * the output of the forward MPSMatrixSoftMax operation, and dL_dY is the
 * gradient of the loss function with respect to Y.
 * 
 * 
 * API-Since: 12.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixSoftMaxGradient extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixSoftMaxGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixSoftMaxGradient alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixSoftMaxGradient allocWithZone(VoidPtr zone);

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

    /**
     * Make a copy of this kernel for a new device - @see MPSKernel
     * 
     * @param zone   The NSZone in which to allocate the object
     * @param device The device for the new MPSKernel. If nil, then use
     *               self.device.
     * @return a pointer to a copy of this MPSKernel. This will fail, returning
     *         nil if the device is not supported. Devices must be
     *         MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSMatrixSoftMaxGradient copyWithZoneDevice(@Nullable VoidPtr zone,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode a MPSMatrixSoftMaxGradient object to a command buffer.
     * 
     * @param commandBuffer       A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param gradientMatrix      A MPSMatrix object containing gradient values with respect
     *                            to the forward operation's output. dL_dY in the class
     *                            description.
     * 
     * @param forwardOutputMatrix A MPSMatrix object containing the output values from the
     *                            forward operation. Y in the class description.
     * 
     * @param resultMatrix        The MPSMatrix object to hold the resulting gradient values
     *                            with respect to the forward operation's input. dL_dX in the
     *                            class description.
     */
    @Generated
    @Selector("encodeToCommandBuffer:gradientMatrix:forwardOutputMatrix:resultMatrix:")
    public native void encodeToCommandBufferGradientMatrixForwardOutputMatrixResultMatrix(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSMatrix gradientMatrix,
            @NotNull MPSMatrix forwardOutputMatrix, @NotNull MPSMatrix resultMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixSoftMaxGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixSoftMaxGradient initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSMatrixSoftMaxGradient
     * @param device   The MTLDevice on which to make the MPSMatrixSoftMaxGradient
     * @return A new MPSMatrixSoftMaxGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixSoftMaxGradient initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize an MPSMatrixSoftMaxGradient object on a device.
     * 
     * @param device The device on which the kernel will execute.
     * 
     * @return A valid MPSMatrixSoftMaxGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixSoftMaxGradient initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSMatrixSoftMaxGradient new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sourceColumns
     * 
     * The number of columns to consider from the sources in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrices available starting from [primary/secondary]SourceMatrixOrigin.y,
     * indicating that by default the whole source matrix is used.
     * If a different size is desired then this should be modified prior to
     * encoding the kernel. It is the user's responsibility to ensure that the
     * resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: primarySourceMatrixOrigin, secondarySourceMatrixOrigin and resultMatrixOrigin
     * from MPSMatrixBinaryKernel can be used to control the starting points in the primary
     * source, secondary source, and result matrices respectively.
     */
    @Generated
    @Selector("setSourceColumns:")
    public native void setSourceColumns(@NUInt long value);

    /**
     * [@property] sourceRows
     * 
     * The number of rows to consider from the sources in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrices available starting from
     * [primary/secondary]SourceMatrixOrigin.x, indicating that by default the
     * whole source matrix is used. If a different size is desired then this should
     * be modified prior to encoding the kernel. It is the user's responsibility to
     * ensure that the resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: primarySourceMatrixOrigin, secondarySourceMatrixOrigin and resultMatrixOrigin
     * from MPSMatrixBinaryKernel can be used to control the starting points in the primary
     * source, secondary source, and result matrices respectively.
     */
    @Generated
    @Selector("setSourceRows:")
    public native void setSourceRows(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sourceColumns
     * 
     * The number of columns to consider from the sources in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrices available starting from [primary/secondary]SourceMatrixOrigin.y,
     * indicating that by default the whole source matrix is used.
     * If a different size is desired then this should be modified prior to
     * encoding the kernel. It is the user's responsibility to ensure that the
     * resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: primarySourceMatrixOrigin, secondarySourceMatrixOrigin and resultMatrixOrigin
     * from MPSMatrixBinaryKernel can be used to control the starting points in the primary
     * source, secondary source, and result matrices respectively.
     */
    @Generated
    @Selector("sourceColumns")
    @NUInt
    public native long sourceColumns();

    /**
     * [@property] sourceRows
     * 
     * The number of rows to consider from the sources in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrices available starting from
     * [primary/secondary]SourceMatrixOrigin.x, indicating that by default the
     * whole source matrix is used. If a different size is desired then this should
     * be modified prior to encoding the kernel. It is the user's responsibility to
     * ensure that the resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: primarySourceMatrixOrigin, secondarySourceMatrixOrigin and resultMatrixOrigin
     * from MPSMatrixBinaryKernel can be used to control the starting points in the primary
     * source, secondary source, and result matrices respectively.
     */
    @Generated
    @Selector("sourceRows")
    @NUInt
    public native long sourceRows();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
