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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A node representing a MPSCNNNeuronExponential kernel
 * 
 * For each pixel, applies the following function:
 * [@code]
 * f(x) = c ^ (a * x + b)
 * [@endcode]
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNNeuronExponentialNode extends MPSCNNNeuronNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNNeuronExponentialNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNNeuronExponentialNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNNeuronExponentialNode allocWithZone(VoidPtr zone);

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
    public native MPSCNNNeuronExponentialNode init();

    /**
     * Init a node with default values for parameters a, b, and c
     */
    @Generated
    @Selector("initWithSource:")
    public native MPSCNNNeuronExponentialNode initWithSource(@NotNull MPSNNImageNode sourceNode);

    /**
     * Init a node representing a MPSCNNNeuronExponential kernel
     * 
     * For each pixel, applies the following function:
     * [@code]
     * f(x) = c ^ (a * x + b)
     * [@endcode]
     * 
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param a          See discussion above.
     * @param b          See discussion above.
     * @param c          See discussion above.
     * @return A new MPSNNFilter node for a MPSCNNNeuronExponential kernel.
     */
    @Generated
    @Selector("initWithSource:a:b:c:")
    public native MPSCNNNeuronExponentialNode initWithSourceABC(@NotNull MPSNNImageNode sourceNode, float a, float b,
            float c);

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
    public static native MPSCNNNeuronExponentialNode new_objc();

    /**
     * Create an autoreleased node with default values for parameters a, b, and c
     */
    @Generated
    @Selector("nodeWithSource:")
    public static native MPSCNNNeuronExponentialNode nodeWithSource(@NotNull MPSNNImageNode sourceNode);

    @Generated
    @Selector("nodeWithSource:a:b:c:")
    public static native MPSCNNNeuronExponentialNode nodeWithSourceABC(@NotNull MPSNNImageNode sourceNode, float a,
            float b, float c);

    @Generated
    @Selector("nodeWithSource:descriptor:")
    public static native MPSCNNNeuronExponentialNode nodeWithSourceDescriptor(@NotNull MPSNNImageNode sourceNode,
            @NotNull MPSNNNeuronDescriptor descriptor);

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
}
