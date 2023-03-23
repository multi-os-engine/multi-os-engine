package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.struct.MPSImageCoordinate;
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

/**
 * MPSNNPadNode
 * 
 * A node for a MPSNNPad kernel
 * 
 * You should not use this node to zero pad your data in the XY-plane.
 * This node copies the input image and therefore should only be used in
 * special circumstances where the normal padding operation, defined for most
 * filters and nodes through @ref MPSNNPadding, cannot achieve the necessary padding.
 * Therefore use this node only when you need one of the special edge modes:
 * [@ref] MPSImageEdgeModeConstant, @ref MPSImageEdgeModeMirror,
 * [@ref] MPSImageEdgeModeMirrorWithEdge or, if you need padding in the
 * feature-channel dimesion.
 * In other cases use to @ref MPSNNPadding to get best performance.
 * 
 * API-Since: 12.1
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNPadNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNPadNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNPadNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNPadNode allocWithZone(VoidPtr zone);

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

    /**
     * [@property] fillValue
     * 
     * Determines the constant value to apply when using @ref MPSImageEdgeModeConstant. Default: 0.0f.
     */
    @Generated
    @Selector("fillValue")
    public native float fillValue();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNPadNode init();

    /**
     * Init a node representing a MPSNNPad kernel
     * 
     * @param source            The MPSNNImageNode representing the source MPSImage for the filter
     * @param paddingSizeBefore The amount of padding to apply before the image in each dimension.
     * @param paddingSizeAfter  The amount of padding to apply after the image in each dimension.
     * @param edgeMode          The @ref MPSImageEdgeMode for the padding node - Note that for now
     *                          the pad-node and its gradient are the only nodes that support
     *                          the extended edge-modes, ie. the ones beyond MPSImageEdgeModeClamp.
     * @return A new MPSNNFilter node for a MPSNNPad kernel.
     */
    @Generated
    @Selector("initWithSource:paddingSizeBefore:paddingSizeAfter:edgeMode:")
    public native MPSNNPadNode initWithSourcePaddingSizeBeforePaddingSizeAfterEdgeMode(MPSNNImageNode source,
            @ByValue MPSImageCoordinate paddingSizeBefore, @ByValue MPSImageCoordinate paddingSizeAfter,
            @NUInt long edgeMode);

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
    public static native MPSNNPadNode new_objc();

    /**
     * Init a node representing a autoreleased MPSNNPad kernel
     * 
     * @param source            The MPSNNImageNode representing the source MPSImage for the filter
     * @param paddingSizeBefore The amount of padding to apply before the image in each dimension.
     * @param paddingSizeAfter  The amount of padding to apply after the image in each dimension.
     * @param edgeMode          The @ref MPSImageEdgeMode for the padding node - Note that for now
     *                          the pad-node and its gradient are the only nodes that support
     *                          the extended edge-modes, ie. the ones beyond MPSImageEdgeModeClamp.
     * @return A new MPSNNFilter node for a MPSNNPad kernel.
     */
    @Generated
    @Selector("nodeWithSource:paddingSizeBefore:paddingSizeAfter:edgeMode:")
    public static native MPSNNPadNode nodeWithSourcePaddingSizeBeforePaddingSizeAfterEdgeMode(MPSNNImageNode source,
            @ByValue MPSImageCoordinate paddingSizeBefore, @ByValue MPSImageCoordinate paddingSizeAfter,
            @NUInt long edgeMode);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] fillValue
     * 
     * Determines the constant value to apply when using @ref MPSImageEdgeModeConstant. Default: 0.0f.
     */
    @Generated
    @Selector("setFillValue:")
    public native void setFillValue(float value);

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
}
