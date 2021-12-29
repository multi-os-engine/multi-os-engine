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
 * A node representing a MPSCNNNeuronSoftPlus kernel
 * <p>
 * For each pixel, applies the following function:
 * [@code]
 * f(x) = a * log(1 + e^(b * x))
 * [@endcode]
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNNeuronSoftPlusNode extends MPSCNNNeuronNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNNeuronSoftPlusNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNNeuronSoftPlusNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNNeuronSoftPlusNode allocWithZone(VoidPtr zone);

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
    public native MPSCNNNeuronSoftPlusNode init();

    /**
     * Init a node with default values for parameters a & b
     */
    @Generated
    @Selector("initWithSource:")
    public native MPSCNNNeuronSoftPlusNode initWithSource(MPSNNImageNode sourceNode);

    /**
     * Init a node representing a MPSCNNNeuronSoftPlus kernel
     *
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param a          See discussion above.
     * @param b          See discussion above.
     * @return A new MPSNNFilter node for a MPSCNNNeuronSoftPlus kernel.
     */
    @Generated
    @Selector("initWithSource:a:b:")
    public native MPSCNNNeuronSoftPlusNode initWithSourceAB(MPSNNImageNode sourceNode, float a, float b);

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
    public static native MPSCNNNeuronSoftPlusNode new_objc();

    /**
     * Create an autoreleased node with default values for parameters a & b
     */
    @Generated
    @Selector("nodeWithSource:")
    public static native MPSCNNNeuronSoftPlusNode nodeWithSource(MPSNNImageNode sourceNode);

    @Generated
    @Selector("nodeWithSource:a:b:")
    public static native MPSCNNNeuronSoftPlusNode nodeWithSourceAB(MPSNNImageNode sourceNode, float a, float b);

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
    @Selector("nodeWithSource:descriptor:")
    public static native MPSCNNNeuronSoftPlusNode nodeWithSourceDescriptor(MPSNNImageNode sourceNode,
            MPSNNNeuronDescriptor descriptor);
}
