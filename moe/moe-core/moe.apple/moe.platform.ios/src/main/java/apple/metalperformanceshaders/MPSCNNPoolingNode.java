package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A node for a MPSCNNPooling kernel
 * <p>
 * This is an abstract base class that does not correspond with any
 * particular MPSCNNKernel. Please make one of the MPSCNNPooling
 * subclasses instead.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNPoolingNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNPoolingNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNPoolingNode alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNPoolingNode allocWithZone(VoidPtr zone);

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
    public native MPSCNNPoolingNode init();

    /**
     * Convenience initializer for MPSCNNPooling nodes with square non-overlapping kernels
     *
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param size       kernelWidth = kernelHeight = strideInPixelsX = strideInPixelsY = size
     * @return A new MPSNNFilter node for a MPSCNNPooling kernel.
     */
    @Generated
    @Selector("initWithSource:filterSize:")
    public native MPSCNNPoolingNode initWithSourceFilterSize(MPSNNImageNode sourceNode, @NUInt long size);

    /**
     * Convenience initializer for MPSCNNPooling nodes with square kernels
     *
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param size       kernelWidth = kernelHeight = size
     * @param stride     strideInPixelsX = strideInPixelsY = stride
     * @return A new MPSNNFilter node for a MPSCNNPooling kernel.
     */
    @Generated
    @Selector("initWithSource:filterSize:stride:")
    public native MPSCNNPoolingNode initWithSourceFilterSizeStride(MPSNNImageNode sourceNode, @NUInt long size,
            @NUInt long stride);

    /**
     * Init a node representing a MPSCNNPooling kernel
     *
     * @param sourceNode      The MPSNNImageNode representing the source MPSImage for the filter
     * @param kernelWidth     The width of the max filter window
     * @param kernelHeight    The height of the max filter window
     * @param strideInPixelsX The output stride (downsampling factor) in the x dimension.
     * @param strideInPixelsY The output stride (downsampling factor) in the y dimension.
     * @return A new MPSNNFilter node for a MPSCNNPooling kernel.
     */
    @Generated
    @Selector("initWithSource:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNPoolingNode initWithSourceKernelWidthKernelHeightStrideInPixelsXStrideInPixelsY(
            MPSNNImageNode sourceNode, @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInPixelsX,
            @NUInt long strideInPixelsY);

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
    public static native MPSCNNPoolingNode new_objc();

    /**
     * Convenience initializer for MPSCNNPooling nodes with square non-overlapping kernels
     *
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param size       kernelWidth = kernelHeight = strideInPixelsX = strideInPixelsY = size
     * @return A new MPSNNFilter node for a MPSCNNPooling kernel.
     */
    @Generated
    @Selector("nodeWithSource:filterSize:")
    public static native MPSCNNPoolingNode nodeWithSourceFilterSize(MPSNNImageNode sourceNode, @NUInt long size);

    /**
     * Convenience initializer for MPSCNNPooling nodes with square non-overlapping kernels and a different stride
     *
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param size       kernelWidth = kernelHeight = size
     * @param stride     strideInPixelsX = strideInPixelsY = stride
     * @return A new MPSNNFilter node for a MPSCNNPooling kernel.
     */
    @Generated
    @Selector("nodeWithSource:filterSize:stride:")
    public static native MPSCNNPoolingNode nodeWithSourceFilterSizeStride(MPSNNImageNode sourceNode, @NUInt long size,
            @NUInt long stride);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @Generated
    @Selector("strideInPixelsX")
    @NUInt
    public native long strideInPixelsX();

    @Generated
    @Selector("strideInPixelsY")
    @NUInt
    public native long strideInPixelsY();
}
