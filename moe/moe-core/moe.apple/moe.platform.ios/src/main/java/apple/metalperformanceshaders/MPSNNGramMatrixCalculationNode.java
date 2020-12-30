package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSNNGramMatrixCallback;
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
 * Node representing a @ref MPSNNGramMatrixCalculation kernel
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNGramMatrixCalculationNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNGramMatrixCalculationNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNGramMatrixCalculationNode alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * [@property]   alpha
     * 
     * Scaling factor for the output. Default: 1.0f.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

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
    public native MPSNNGramMatrixCalculationNode init();

    /**
     * Init a node representing a MPSNNGramMatrixCalculationNode kernel.
     * 
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter.
     * @return     A new MPSNNFilter node for a MPSNNGramMatrixCalculationNode kernel.
     */
    @Generated
    @Selector("initWithSource:")
    public native MPSNNGramMatrixCalculationNode initWithSource(MPSNNImageNode sourceNode);

    /**
     * Init a node representing a MPSNNGramMatrixCalculationNode kernel.
     * 
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter.
     * @param      alpha                   Scaling factor for the output.
     * @return     A new MPSNNFilter node for a MPSNNGramMatrixCalculationNode kernel.
     */
    @Generated
    @Selector("initWithSource:alpha:")
    public native MPSNNGramMatrixCalculationNode initWithSourceAlpha(MPSNNImageNode sourceNode, float alpha);

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
     * Init a node representing a autoreleased MPSNNGramMatrixCalculationNode kernel.
     * 
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter.
     * @return     A new MPSNNFilter node for a MPSNNGramMatrixCalculationNode kernel.
     */
    @Generated
    @Selector("nodeWithSource:")
    public static native MPSNNGramMatrixCalculationNode nodeWithSource(MPSNNImageNode sourceNode);

    /**
     * Init a node representing a autoreleased MPSNNGramMatrixCalculationNode kernel.
     * 
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter.
     * @param      alpha                   Scaling factor for the output.
     * @return     A new MPSNNFilter node for a MPSNNGramMatrixCalculationNode kernel.
     */
    @Generated
    @Selector("nodeWithSource:alpha:")
    public static native MPSNNGramMatrixCalculationNode nodeWithSourceAlpha(MPSNNImageNode sourceNode, float alpha);

    /**
     * [@property]   propertyCallBack
     * 
     * Optional callback option - setting this allows the alpha value to be changed dynamically at encode time.
     *             Default value: nil.
     */
    @Generated
    @Selector("propertyCallBack")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNGramMatrixCallback propertyCallBack();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   propertyCallBack
     * 
     * Optional callback option - setting this allows the alpha value to be changed dynamically at encode time.
     *             Default value: nil.
     */
    @Generated
    @Selector("setPropertyCallBack:")
    public native void setPropertyCallBack(@Mapped(ObjCObjectMapper.class) MPSNNGramMatrixCallback value);

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