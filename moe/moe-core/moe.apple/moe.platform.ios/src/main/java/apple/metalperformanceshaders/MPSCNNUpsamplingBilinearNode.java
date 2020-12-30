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
 * Node representing a MPSCNNUpsamplingBilinear kernel
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNUpsamplingBilinearNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNUpsamplingBilinearNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNUpsamplingBilinearNode alloc();

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
    public native MPSCNNUpsamplingBilinearNode init();

    /**
     * @abstract   Init a node representing a MPSCNNUpsamplingBilinear kernel
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter
     * @param      integerScaleFactorX     The upsampling factor for the x dimension.
     * @param      integerScaleFactorY     The upsampling factor for the y dimension.
     * @return     A new MPSNNFilter node for a MPSCNNUpsamplingBilinear kernel.
     */
    @Generated
    @Selector("initWithSource:integerScaleFactorX:integerScaleFactorY:")
    public native MPSCNNUpsamplingBilinearNode initWithSourceIntegerScaleFactorXIntegerScaleFactorY(
            MPSNNImageNode sourceNode, @NUInt long integerScaleFactorX, @NUInt long integerScaleFactorY);

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

    /**
     * @abstract   Init a autoreleased node representing a MPSCNNUpsamplingBilinear kernel
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter
     * @param      integerScaleFactorX     The upsampling factor for the x dimension.
     * @param      integerScaleFactorY     The upsampling factor for the y dimension.
     * @return     A new MPSNNFilter node for a MPSCNNUpsamplingBilinear kernel.
     */
    @Generated
    @Selector("nodeWithSource:integerScaleFactorX:integerScaleFactorY:")
    public static native MPSCNNUpsamplingBilinearNode nodeWithSourceIntegerScaleFactorXIntegerScaleFactorY(
            MPSNNImageNode sourceNode, @NUInt long integerScaleFactorX, @NUInt long integerScaleFactorY);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scaleFactorX")
    public native double scaleFactorX();

    @Generated
    @Selector("scaleFactorY")
    public native double scaleFactorY();

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
    @Selector("alignCorners")
    public native boolean alignCorners();

    /**
     * @abstract   Init a node representing a MPSCNNUpsamplingBilinear kernel
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter
     * @param      integerScaleFactorX     The upsampling factor for the x dimension.
     * @param      integerScaleFactorY     The upsampling factor for the y dimension.
     * @param      alignCorners            Specifier whether the centers of the 4 corner pixels of the input and output regions are aligned,
     * @return     A new MPSNNFilter node for a MPSCNNUpsamplingBilinear kernel.
     */
    @Generated
    @Selector("initWithSource:integerScaleFactorX:integerScaleFactorY:alignCorners:")
    public native MPSCNNUpsamplingBilinearNode initWithSourceIntegerScaleFactorXIntegerScaleFactorYAlignCorners(
            MPSNNImageNode sourceNode, @NUInt long integerScaleFactorX, @NUInt long integerScaleFactorY,
            boolean alignCorners);

    /**
     * @abstract   Init a autoreleased node representing a MPSCNNUpsamplingBilinear kernel
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter
     * @param      integerScaleFactorX     The upsampling factor for the x dimension.
     * @param      integerScaleFactorY     The upsampling factor for the y dimension.
     * @param      alignCorners            Specifier whether the centers of the 4 corner pixels of the input and output regions are aligned,
     * @return     A new MPSNNFilter node for a MPSCNNUpsamplingBilinear kernel.
     */
    @Generated
    @Selector("nodeWithSource:integerScaleFactorX:integerScaleFactorY:alignCorners:")
    public static native MPSCNNUpsamplingBilinearNode nodeWithSourceIntegerScaleFactorXIntegerScaleFactorYAlignCorners(
            MPSNNImageNode sourceNode, @NUInt long integerScaleFactorX, @NUInt long integerScaleFactorY,
            boolean alignCorners);
}