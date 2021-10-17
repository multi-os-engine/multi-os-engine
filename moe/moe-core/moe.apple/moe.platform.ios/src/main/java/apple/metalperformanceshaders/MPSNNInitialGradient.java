package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNInitialGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSCNNInitialGradient filter specifies a layer which computes the initial gradient for
 * an aribitrary input image. The operation itself is extremely simple: it computes the gradient of the input image
 * with itself, resulting in an output image which is filled with '1's for all the inputs that were used.
 * This serves as the starting point for the computation of gradients between arbitrary images in a network.
 * Example:
 * Suppose that we want to compute gradients for a function that multiplies together two losses:
 * f = f(L1, L2) = L1 * L2
 * The losses themselves are computed from some inputs x1,x2:
 * L1 = L1(x1),
 * L2 = L2(x2)
 * The filters to compute f, L1, L2 are:
 * f = MPSCNNMultiply(L1, L2), where
 * L1 = MPSNNForwardLoss1(x1) and
 * L2 = MPSNNForwardLoss1(x2)
 * <p>
 * To compute df/dx1 we apply the chain rule:
 * <p>
 * df/dx1 = d(L1 * L2)/dx1 = d(L1 * L2)/dL1 * dL1/dx1 + d(L1 * L2)/dL2 * dL2/dx1
 * = d(L1 * L2)/dL1 * dL1/dx1 = L2 * dL1/dx1
 * <p>
 * The MPSCNNMultiplyGradient filter computes for f = L1 * L2 forward op:
 * dL/dL1 = dL/df * df/dL1 = dL/df * L2 and
 * dL/dL2 = dL/df * df/dL2 = dL/df * L1 where
 * dL/df is the input gradient of the chain rule / backpropagation algorithm.
 * But in our case we want MPSCNNMultiplyGradient to compute the gradient:
 * df/dL1 = d(L1 * L2)/dL1 = L2,
 * which shows that
 * L = f, which means that dL/dL1 = df/df * df/dL1 = 1 * L2, which
 * shows that we get the correct gradient by providing unit input as input gradient to
 * the MPSCNNMultiplyGradient.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNInitialGradient extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNInitialGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNInitialGradient alloc();

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
    public native MPSNNInitialGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNInitialGradient initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNInitialGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a MPSNNInitialGradient kernel.
     *
     * @param device The MTLDevice on which this MPSNNInitialGradient filter will be used.
     * @return A valid MPSNNInitialGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNNInitialGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
}
