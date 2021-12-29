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
 * A node representing a MPSCNNNeuronGradient
 * <p>
 * We use one generic neuron gradient node
 * instead of having dozens of subclasses.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNNeuronGradientNode extends MPSNNGradientFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNNeuronGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNNeuronGradientNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNNeuronGradientNode allocWithZone(VoidPtr zone);

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
     * The neuron descriptor
     */
    @Generated
    @Selector("descriptor")
    public native MPSNNNeuronDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNNeuronGradientNode init();

    /**
     * create a new neuron gradient node
     * <p>
     * See also -[MPSCNNNeuronNode gradientFilterNodeWithSources:]
     * for an easier way to do this
     */
    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:descriptor:")
    public native MPSCNNNeuronGradientNode initWithSourceGradientSourceImageGradientStateDescriptor(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState,
            MPSNNNeuronDescriptor descriptor);

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
    public static native MPSCNNNeuronGradientNode new_objc();

    /**
     * create a new neuron gradient node
     * <p>
     * See also -[MPSCNNNeuronNode gradientFilterNodeWithSources:]
     * for an easier way to do this
     */
    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:descriptor:")
    public static native MPSCNNNeuronGradientNode nodeWithSourceGradientSourceImageGradientStateDescriptor(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState,
            MPSNNNeuronDescriptor descriptor);

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
